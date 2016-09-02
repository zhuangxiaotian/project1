/**
 * $Id$
 */
package cn.topdeep.projgroup.action.personal;

import cn.topdeep.projgroup.action.BaseAction;
import common.util.*;
import org.jbpm.api.*;

/**
 * @author niexin
 *
 */
public class DefaultTaskDeal extends BaseAction {
	//进行默认的任务处理
	private String taskId;
	
	private String signalName;
	
	private String retUrl;
	
	private TaskService taskService;

	public String execute() throws Exception{
		if(StringUtils.isNullOrEmpty(taskId)){
			throw new Exception("无效的任务参数");
		}
		taskService.completeTask(taskId, signalName);
		redirectUrl = urlManage.getPersonalTaskListUrl();
		return REDIRECT;
	}
	
	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getSignalName() {
		return signalName;
	}

	public void setSignalName(String signalName) {
		this.signalName = signalName;
	}

	public String getRetUrl() {
		return retUrl;
	}

	public void setRetUrl(String retUrl) {
		this.retUrl = retUrl;
	}

	public TaskService getTaskService() {
		return taskService;
	}

	public void setTaskService(TaskService taskService) {
		this.taskService = taskService;
	}
	
}
