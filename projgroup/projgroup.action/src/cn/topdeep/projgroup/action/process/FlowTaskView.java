/**
 * $Id$
 */
package cn.topdeep.projgroup.action.process;

import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jbpm.api.Execution;
import org.jbpm.api.ExecutionService;
import org.jbpm.api.TaskService;
import org.jbpm.api.task.Task;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.entity.WorkFlow;
import cn.topdeep.projgroup.entity.data.WorkFlowType;

/**
 * 显示任务的基本信息，如果是特别定义的任务跳转到相应的任务类型去,需要接受任务ID参数
 * @author niexin
 *
 */
public class FlowTaskView extends BaseAction {
	
	private static final Log log = LogFactory.getLog(FlowTaskView.class);
	
	private String taskId; 
	
	private TaskService taskService;

	private ExecutionService executionService;
	
	private Task task;
	
	private String taskOutcome;
	
	private Set<String> outcomes;
	
	public String execute() throws Exception{
		//如果需要特殊处理，则进行跳转，否则进行通用处理
		if(getTask() == null){
			throw new Exception("无效的任务参数");
		}
		
		String executionId = getTask().getExecutionId();
		Execution execution = executionService.findExecutionById(executionId);
		String workFlowId = execution.getKey();
		WorkFlow workFlow = getProjectBiz().workFlowSelectByWorkFlowId(workFlowId);
		//根据不同的类型进行处理
		if(workFlow.getWorkFlowType() == WorkFlowType.Leave && getTask().getName().equals("重写请假单")){
			//跳转让用户重新填写请假单
			redirectUrl = urlManage.getLeaveEditUrl(taskId);
			return REDIRECT;
		}
		//显示默认的处理流程
		return SUCCESS;
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
		if(task == null){
			task = taskService.getTask(taskId);
		}
		return task;
	}

	public Set<String> getOutcomes() {
		if(outcomes == null){
			outcomes = taskService.getOutcomes(taskId);
			if(outcomes.size() > 1){
				outcomes.remove(Task.STATE_COMPLETED);
			}
		}
		return outcomes;
	}
	
	public String completedTask(){
		log.debug("completed task to "+taskOutcome);
		if(!Task.STATE_COMPLETED.equals(taskOutcome)){
			taskService.completeTask(taskId, taskOutcome);	
		}else{
			taskService.completeTask(taskId);
		}
		showMessage("message", "任务已完成");
		scriptManage.registerScript("close", "window.close();");
		return CLIENT_REDIRECT;
	}

	public String getTaskOutcome() {
		return taskOutcome;
	}

	public void setTaskOutcome(String taskOutcome) {
		this.taskOutcome = taskOutcome;
	}

	public ExecutionService getExecutionService() {
		return executionService;
	}

	public void setExecutionService(ExecutionService executionService) {
		this.executionService = executionService;
	}
}
