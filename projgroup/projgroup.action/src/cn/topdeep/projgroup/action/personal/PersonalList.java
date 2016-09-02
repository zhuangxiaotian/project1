/**
 * $Id$
 */
package cn.topdeep.projgroup.action.personal;

import cn.topdeep.projgroup.action.PageAction;
import cn.topdeep.projgroup.biz.TaskBiz;

import java.util.*;
import org.jbpm.api.*;
import org.jbpm.api.task.*;

import common.util.SiteUrl;


/**
 * @author niexin
 *
 */
public class PersonalList extends PageAction {

	private TaskService taskService;
	
	private ExecutionService executionService;
	
	private TaskBiz taskBiz;
	
	private List<Task> personalTaskList;
	
	
	public List<SiteUrl> getOperateList(String taskId){
		return taskBiz.getTaskOperateUrlList(taskId);
	}
	
	/* (non-Javadoc)
	 * @see cn.topdeep.projgroup.action.PageAction#getRowsCount()
	 */
	@Override
	public int getRowsCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	public List<Task> getPersonalTaskList() {
		if(personalTaskList == null){
			//personalTaskList = taskService.findPersonalTasks(getLoginUser().getLoginUser().getLoginName());
			personalTaskList = taskService.createTaskQuery().list();
		}
		return personalTaskList;
	}

	public TaskService getTaskService() {
		return taskService;
	}

	public void setTaskService(TaskService taskService) {
		this.taskService = taskService;
	}

	public ExecutionService getExecutionService() {
		return executionService;
	}

	public void setExecutionService(ExecutionService executionService) {
		this.executionService = executionService;
	}

	public TaskBiz getTaskBiz() {
		return taskBiz;
	}

	public void setTaskBiz(TaskBiz taskBiz) {
		this.taskBiz = taskBiz;
	}

}
