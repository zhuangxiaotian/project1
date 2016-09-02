/**
 * $Id$
 */
package cn.topdeep.projgroup.action.personal;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.biz.PersonalBiz;
import cn.topdeep.projgroup.biz.process.ProcessDefineKey;
import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.data.LeaveState;
import cn.topdeep.projgroup.entity.data.LeaveType;
import cn.topdeep.projgroup.entity.data.WorkFlowType;

import java.sql.SQLException;
import java.util.*;

import org.jbpm.api.*;
import org.jbpm.api.task.Task;

import com.opensymphony.xwork2.validator.annotations.*;

import common.cache2.CacheException;
import common.util.*;


/**
 * @author niexin
 *
 */
public class LeaveRequest extends BaseAction {
	
	private ExecutionService executionService;
	private TaskService taskService;
	private PersonalBiz personalBiz;
	
	/**
	 * 如果有任务ID，表明是请假单重新填写，否则是新添加请假单
	 */
	private String taskId;
	
	private Leave leave;
	
	private Map<Integer, String> leaveTypeList;
	
	private Task task;
	
	private WorkFlow workFlow;
	
	public String execute() throws Exception{
		
		checkTask();
		
		return INPUT;
	}
	
	private void checkTask() throws Exception{
		if(getTask() != null){
			if(getWorkFlow().getWorkFlowType() != WorkFlowType.Leave){
				throw new Exception("无效的流程类型: "+getWorkFlow().getWorkFlowId());
			}
			if(!getTask().getActivityName().equals("重写请假单")){
				throw new Exception("无效的流程状态: "+getTask().getActivityName());
			}

		}

	}
	
	public String cancel() throws Exception{
		checkTask();
		if(getTask() == null){
		}else{
			taskService.completeTask(taskId, "取消请假");
		}
		redirectUrl = urlManage.getPersonalTaskListUrl();
		return REDIRECT;
	}
	
	@Validations(
			requiredFields = {
					@RequiredFieldValidator(type = ValidatorType.SIMPLE, fieldName="leave.leaveEndTime",message="请选择开始时间"),
					@RequiredFieldValidator(type = ValidatorType.SIMPLE, fieldName="leave.leaveEndTime",message="请选择结束时间")
			},
			requiredStrings = {
					@RequiredStringValidator(type = ValidatorType.SIMPLE, fieldName="leave.leaveReason", trim=true, message = "请输入请假理由")	
			}
		)
	public String confirm() throws Exception{
		checkTask();
		
		if(getTask() == null){
			//检查请假条数据
			WorkFlow flow = new WorkFlow();
			flow.setWorkFlowId(getPersonalBiz().getIdentityCode(WorkFlow.getDataBaseTableName()));
			flow.setWorkFlowType(WorkFlowType.Leave);//请假
			flow.setCreator(loginUser.getLoginUser().getUserId());
			leave.setLeaveState(LeaveState.Request);
			leave.setRequestUserId(getLoginUser().getLoginUser().getUserId());
			leave.setWorkFlowId(flow.getWorkFlowId());
			//ok
			personalBiz.beginTransaction();
			try{
				personalBiz.workFlowInsert(flow);
				personalBiz.leaveInsert(leave);
				ProcessInstance pi = executionService.startProcessInstanceByKey(ProcessDefineKey.Leave, flow.getWorkFlowId());
				flow.setProcessId(pi.getId());
				personalBiz.workFlowUpdate(flow);

				org.jbpm.api.task.Task task = taskService.createTaskQuery().processInstanceId(pi.getId()).assignee(loginUser.getLoginUser().getLoginName()).uniqueResult();
				if(task != null && task.getActivityName().equals("填写请假单")){
					taskService.completeTask(task.getId(),"申请审核");
				}
				personalBiz.commitTransaction();
			}catch(Exception e){
				personalBiz.rollBackTransaction();
				throw e;
			}
		}else{
			//重写请假单
			personalBiz.beginTransaction();
			try{
				personalBiz.leaveUpdate(leave);
				taskService.completeTask(taskId, "再申请审核");
				personalBiz.commitTransaction();
			}catch(Exception e){
				personalBiz.rollBackTransaction();
				throw e;
			}
		}
		
		
		//executionService.startProcessInstanceByKey()
		
		
		return SUCCESS;
	}

	public Map<Integer, String> getLeaveTypeList() {
		if(leaveTypeList == null){
			leaveTypeList = LeaveType.getLeaveTypeList();
		}
		return leaveTypeList;
	}

	public Leave getLeave() throws Exception{
		if(leave == null && getWorkFlow() != null){
			leave = getProjectBiz().leaveSelectByWorkFlowId(getWorkFlow().getWorkFlowId());
		}
		return leave;
	}

	public void setLeave(Leave leave) {
		this.leave = leave;
	}
	
	public String getLeaveShowTime(Date date){
		if(date == null)
			return "";
		return StringUtils.dateTimeToString(date, "yyyy-MM-dd HH:mm");
	}

	public ExecutionService getExecutionService() {
		return executionService;
	}

	public void setExecutionService(ExecutionService executionService) {
		this.executionService = executionService;
	}

	public PersonalBiz getPersonalBiz() {
		return personalBiz;
	}

	public void setPersonalBiz(PersonalBiz personalBiz) {
		this.personalBiz = personalBiz;
	}

	public TaskService getTaskService() {
		return taskService;
	}

	public void setTaskService(TaskService taskService) {
		this.taskService = taskService;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Task getTask() {
		if(task == null && !StringUtils.isNullOrEmpty(taskId)){
			//已存在的任务，检查项目，流程类型是否是请假流程，当前活动是否是重写请假单
			task = taskService.getTask(taskId);
		}
		return task;
	}

	public WorkFlow getWorkFlow() throws Exception{
		if(workFlow == null && getTask() != null){
			String workFlowId = executionService.findExecutionById(getTask().getExecutionId()).getKey();
			workFlow = getProjectBiz().workFlowSelectByWorkFlowId(workFlowId);
		}
		return workFlow;
	}
	
}
