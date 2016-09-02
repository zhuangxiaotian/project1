package cn.topdeep.projgroup.action.work;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import common.cache2.CacheException;

import cn.topdeep.projgroup.action.BaseAction;

import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.Task;
import cn.topdeep.projgroup.entity.User;
import cn.topdeep.projgroup.action.work.*;
import cn.topdeep.projgroup.action.system.*;
import cn.topdeep.projgroup.biz.ProjectBiz;
import cn.topdeep.projgroup.dao.*;

import cn.topdeep.projgroup.entity.*;

public class TaskEdit extends BaseAction {
	
	private Task task; 

	private int taskId;
	
	private int projId;
	
	private Project project;
	
	private List<User> joinUserList;
	
	private List<Task> mayParentTaskList;
	
	private List<VTaskPreviousTask> prevTaskList;
	
	private int[] selectedPrevTaskIds;
	
	private int[] joinTaskUserIds;
	
	private List<Task> mayPrevTaskList;

	/**
	 * 可供挑选的资源列表
	 */
	private List<VProjectTaskUser> resourceList;
	
	public String execute() throws DbException, SQLException, CacheException{
		return INPUT;
	}
	
	public String save() throws Exception{
		
//		if(!hasParent){
//			getTask().setTaskParentId(null);
//		}
//		if(getTask().getTaskParentId() == 0){
//			getTask().setTaskParentId(null);
//		}
		

		getTask().setTaskProjectId(projId);
		
		getProjectBiz().saveTask(this.task, joinTaskUserIds, selectedPrevTaskIds);
		
		return SUCCESS;
		
		//	nextAction = "TaskList.action?projId="+getTask().getTaskProjectId();


		//nextAction = "TaskManage.action?projId="+getTask().getTaskProjectId()+"&taskId="+this.taskId;
		//return NEXT;
		
	}
	
	public void validateSave() throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException{
		
		if(getTask().getTaskName().length()<=0){
			addFieldError("task.taskName", "名字一定要输入，否则无法保存");
		}
		
		if(getTask().getEstimateWorkTime() < 0){
			addFieldError("task.estimateWorkTime", "请输入工期");
		}
		
		if(getTask().getTaskPlanStartDate()==null){
			addFieldError("task.taskPlanStartDate", "计划开始时间一定要输入，否则无法保存");
		}
		if(getTask().getTaskPlanEndDate()==null){
			addFieldError("task.taskPlanEndDate", "计划结束时间一定要输入，否则无法保存");
		}
		
	}
	
	private int parentTaskId;
	
	
	public Task getTask() throws DbException, SQLException {
		if(taskId > 0 && this.task == null){
			//task = getProjectBiz().getTask(taskId);
			//ProjgroupDao projgdao=new ProjgroupDao();
			//task=projectgroupDao.TaskSelectByTaskId(taskId);
			task=getProjectBiz().getTask(taskId);
			task.setTaskDesc(task.getTaskDesc().replaceAll("\r\n", ""));
			setProjId(task.getTaskProjectId());
		}
		return this.task;
	}
	
	public void setTask(Task task) {
		this.task = task;
	}
	
	public int getTaskId() {
		return taskId;
	}
	
	public void setTaskId(int taskId) throws DbException, SQLException {
		this.taskId = taskId;
	}
	
	public int getProjId() throws DbException, SQLException {
		return projId;
	}

	public void setProjId(int projId) throws DbException, SQLException {
		this.projId = projId;
		
	}

	public void setParentTaskId(int parentTaskId) {
		this.parentTaskId = parentTaskId;
	}

	public Project getProject() throws DbException, SQLException {
		if(this.projId > 0 && this.project == null){
			this.project = getProjectBiz().getProject(projId);
		}
		return project;
	}

	public List<User> getJoinUserList() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		if(joinUserList == null){
			joinUserList = getProjectBiz().getJoinUsers(projId);
		}
		return joinUserList;
	}



	public List<VProjectTaskUser> getResourceList() throws DbException, SQLException, CacheException {
		if(resourceList == null){
			if(taskId > 0){
				resourceList = getProjectBiz().vProjectTaskUserSelectObjects(new VProjectTaskUserQueryCondition().setProjectIdCondition(projId).setTaskIdCondition(taskId));
			}else{
				resourceList = new ArrayList<VProjectTaskUser>();
				for(User item : joinUserList){
					VProjectTaskUser taskUser = new VProjectTaskUser();
					taskUser.setProjectId(projId);
					taskUser.setRealName(item.getRealName());
					taskUser.setSelected(false);
					taskUser.setUserId(item.getUserId());
					resourceList.add(taskUser);
				}
			}
		}
		return resourceList;
	}


	public void setJoinTaskUserIds(int[] joinTaskUserIds) {
		this.joinTaskUserIds = joinTaskUserIds;
	}


	public List<Task> getMayPrevTaskList() throws DbException, SQLException, CacheException {
		if(mayPrevTaskList == null){
			mayPrevTaskList = new ArrayList<Task>();
			mayPrevTaskList.addAll(getMayParentTaskList());
			Task current = getTask();
			if(current != null){
				String outline = current.getTaskOutline();//x.x.x   so x remove x.x remove x.x.x.n remove
				for(Iterator<Task> it = mayParentTaskList.iterator(); it.hasNext();){
					Task item = it.next();
					if(outline.startsWith(item.getTaskOutline()+".")){
						it.remove();
					}
				}
			}
		}
		return mayPrevTaskList;
	}


	public List<Task> getMayParentTaskList() throws DbException, SQLException, CacheException {
		if(mayParentTaskList == null){
			mayParentTaskList = getProjectBiz().taskSelectObjects(new TaskQueryCondition().setTaskProjectIdCondition(projId), 0, Integer.MAX_VALUE, "TASK_OUTLINE", "asc");
			//过滤掉自身，以及自身的直系父及直系子孙
			Task current = getTask();
			if(current != null){
				String outline = current.getTaskOutline();//x.x.x   so x remove x.x remove x.x.x.n remove
				for(Iterator<Task> it = mayParentTaskList.iterator(); it.hasNext();){
					Task item = it.next();
					if(item.getTaskId() == current.getTaskId()){
						it.remove();
					}else if(item.getTaskOutline().startsWith(outline+".")){
						it.remove();
//					}else if(outline.startsWith(item.getTaskOutline()+".")){
//						it.remove();
					}
				}
			}
		}
		return mayParentTaskList;
	}


	public List<VTaskPreviousTask> getPrevTaskList() throws DbException, SQLException, CacheException {
		if(prevTaskList == null){
			prevTaskList = getProjectBiz().vTaskPreviousTaskSelectObjects(new VTaskPreviousTaskQueryCondition().setTaskIdCondition(taskId), 0, Integer.MAX_VALUE, "TASK_OUTLINE", "asc");
		}
		return prevTaskList;
	}


	public void setSelectedPrevTaskIds(int[] selectedPrevTaskIds) {
		this.selectedPrevTaskIds = selectedPrevTaskIds;
	}

}
