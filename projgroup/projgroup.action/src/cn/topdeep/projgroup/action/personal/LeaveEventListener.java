/**
 * $Id$
 */
package cn.topdeep.projgroup.action.personal;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jbpm.api.TaskService;
import org.jbpm.api.listener.EventListener;
import org.jbpm.api.listener.EventListenerExecution;
import org.jbpm.api.model.Event;
import org.jbpm.api.task.Task;
import org.jbpm.pvm.internal.model.EventImpl;
import org.jbpm.pvm.internal.model.ExecutionImpl;
import org.jbpm.pvm.internal.model.ObservableElement;

import cn.topdeep.projgroup.biz.PersonalBiz;
import cn.topdeep.projgroup.biz.ProjectBiz;
import cn.topdeep.projgroup.entity.Leave;
import cn.topdeep.projgroup.entity.User;
import cn.topdeep.projgroup.entity.data.LeaveState;

/**
 * @author niexin
 *
 */
public class LeaveEventListener implements EventListener {

	private PersonalBiz personalBiz;
	
	private TaskService taskService;
	
	private final static Log log = LogFactory.getLog(LeaveEventListener.class);
	
	/* (non-Javadoc)
	 * @see org.jbpm.api.listener.EventListener#notify(org.jbpm.api.listener.EventListenerExecution)
	 */
	public void notify(EventListenerExecution execution) throws Exception {
		//请假流程事件处理
		if(!(execution instanceof ExecutionImpl)){
			log.error("execution is "+execution.getClass().getName());
			return;
		}
		ExecutionImpl impl = (ExecutionImpl) execution;

		EventImpl event = impl.getEvent();
		ObservableElement eventSource = impl.getEventSource();
		String workFlowId = execution.getKey();
		Leave leave = personalBiz.leaveSelectByWorkFlowId(workFlowId);
		if(event.getName().equals(Event.ASSIGN)){
			//assign event
			if(impl.getActivityName().equals("等待审核")){
				//设置最后审核人员
				String id = impl.getId();
				
				List<Task> taskList = taskService.createTaskQuery().activityName("等待审核").processInstanceId(impl.getProcessInstance().getId()).list();
				Task task = null;
				for(Task item : taskList){
					if(item.getName().equals("等待审核")){
						task = item;
						break;
					}
				}
				
				User user = null;
				if(task != null){
					user = personalBiz.userSelectByLoginName(task.getAssignee());
				}
				if(user != null){
					leave.setAuditUserId(user.getUserId());
					personalBiz.leaveUpdate(leave);
				}else{
					log.error("no task or user found in execution" + impl.getId());
				}
			}
		}else if(event.getName().equals(Event.START)){
			if(execution.findActiveExecutionIn("结束") != null){
				leave.setLeaveState(LeaveState.Pass);
			}else if(execution.findActiveExecutionIn("终止") != null){
				leave.setLeaveState(LeaveState.Reject);
			}else if(execution.findActiveExecutionIn("取消请假") != null){
				leave.setLeaveState(LeaveState.Cancel);
			}
			personalBiz.leaveUpdate(leave);
		}
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

}
