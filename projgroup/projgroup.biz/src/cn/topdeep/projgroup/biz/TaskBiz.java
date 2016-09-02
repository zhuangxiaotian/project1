/**
 * $Id$
 */
package cn.topdeep.projgroup.biz;

import java.util.*;

import org.jbpm.api.Execution;
import org.jbpm.api.ExecutionService;
import org.jbpm.api.TaskService;
import org.jbpm.api.task.Task;

import cn.topdeep.projgroup.biz.process.ProcessDefineKey;

import common.util.SiteUrl;

/**
 * @author niexin
 *
 */
public class TaskBiz extends BaseBiz {
	
	private TaskService taskService;
	
	private ExecutionService executionService; 
	
	public List<SiteUrl> getTaskOperateUrlList(String taskId){
		List<SiteUrl> list = new ArrayList<SiteUrl>();
		Task task = taskService.getTask(taskId);
		Execution execution = executionService.findExecutionById(task.getExecutionId());
		String processKey = execution.getProcessInstance().getKey();
//		if(processKey.equals(ProcessDefineKey.Leave)){
//			//请假流程，再判断当前状态
//			if("填写请假单".equals(task.getName())){
//				//填写请假单
//			}else if("经理审核".equals(task.getName())){
//				
//			}else{
//				//默认处理
//				
//			}
//			
//		}
		
		//默认实现，根据任何允许的转换进行操作
		Set<String> outcomes = taskService.getOutcomes(taskId);
		for(String item : outcomes){
			if("completed".equals(item)){
				continue;
			}
			SiteUrl newUrl = new SiteUrl();
			newUrl.setDesc("执行"+item);
			newUrl.setName(item);
			newUrl.setUrl(urlManage.getDefaultTaskDealUrl(taskId, item, urlManage.getPersonalTaskListUrl()));
			list.add(newUrl);
		}
		
		return list;
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
}
