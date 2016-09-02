package cn.topdeep.projgroup.biz;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.*;
import java.util.Map.Entry;

import common.cache2.CacheException;

import cn.topdeep.projgroup.dao.ProjectDao;
import cn.topdeep.projgroup.dao.ProjgroupDao;

import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.Task;
import cn.topdeep.projgroup.entity.User;
//import cn.topdeep.projgroup.action.work.*;
import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.data.OaQueryCondition;
import cn.topdeep.projgroup.entity.utils.TaskComparator;
import cn.topdeep.projgroup.entity.view.LogTaskView;
import cn.topdeep.projgroup.entity.view.ProjUserView;
import cn.topdeep.projgroup.entity.view.ProjectListView;
import cn.topdeep.projgroup.entity.view.WorkLogView;


public class ProjectBiz extends BaseBiz {

	private ProjectDao projectDao;
//	private ProjgroupDao projgroupDao;
	//private List<ProjectJoinUser> projjoinuserlist;
	
	
	public Project getProject(int projId) throws DbException, SQLException {
		//return getProject(projId);
		return projectDao.getProject(projId);
	}

	
	public void saveProject(Project proj, int[] projJoinUserIds) throws Exception {
		
		projectDao.getDataVisit().beginTransaction();
		try {
			if(proj.getProjId() > 0){
				projectDao.updateProject(proj);
			}else{
				projectDao.insertProject(proj);
			}
			projectJoinUserDeleteListByProjectId(proj.getProjId());
			if(projJoinUserIds != null){
				ProjectJoinUser pju = new ProjectJoinUser();
				for(int i=0;i < projJoinUserIds.length;i++)
				{
					pju.setProjectId(proj.getProjId());
					pju.setUserId(projJoinUserIds[i]);
					projectJoinUserInsert(pju);
				}
			}
			projectDao.getDataVisit().commitTransaction();
		} catch (Exception e) {
			projectDao.getDataVisit().rollBackTransaction();
			throw e;
		}
	}

	public List getProjList(int pageIndex, int rowsOfPage) throws DbException, SQLException {
		return projectDao.getProjList(pageIndex, rowsOfPage);
		
	}
	
	/**
	 * 查询项目扩展到项目经理
	 * @param pageIndex
	 * @param rowsOfPage
	 * @param orderField
	 * @param order
	 * @return
	 * @throws DbException
	 * @throws SQLException
	 * @throws IllegalArgumentException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public List<ProjectListView> getProjListViewlist(int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return projectDao.getProjListViewlist(pageIndex, rowsOfPage, orderField, order);
	}
	
	public int getQueryProjListViewlistCount() throws SQLException {
		return projectDao.getQueryProjListViewlistCount();
	}

	public List getProjListAll() throws DbException, SQLException {
		return projectDao.getProjListAll();
		
	}
	public List<Task> getTaskList(int projId, int pageIndex, int rowsOfPage) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return projectDao.getTaskList(projId, pageIndex, rowsOfPage);
	}
	
	public int querygetTaskListQueryCount(int projId) throws SQLException {
		return projectDao.querygetTaskListQueryCount(projId);
	}
	
	public int querygetTaskListQueryCountByUserId(int projId, int userId) throws SQLException {
		return projectDao.querygetTaskListQueryCountByUserId(projId, userId);
	}
	
	public List<Task> getmyTaskList(int projId, int userId, int pageIndex, int rowsOfPage) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return projectDao.getmyTaskList(projId,userId, pageIndex, rowsOfPage);
	}
	
	public List<Task> getmyTaskListAll(int projId, int userId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return projectDao.getmyTaskListAll(projId,userId);
	}
	
	public List<Task> getmyTaskListAllRelation(int userId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		return projectDao.getmyTaskListAllRelation(userId);
	}
	
	public List<Task> getTaskListAll(int projId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return projectDao.getTaskListAll(projId);
	}


	public WorkLog getWorkLog(int logId) throws DbException, SQLException {
		return projectDao.getWorkLog(logId);
	}

	public void saveWorkLog(WorkLog workLog) throws DbException, SQLException {
		if(workLog.getWorkLogId()>0){
			
			workLog.setModifyTime(new java.util.Date());
			projectDao.updateWorkLog(workLog);
		}else{
			workLog.setCreateTime(new java.util.Date());
			workLog.setModifyTime(new java.util.Date());
			//workLog.setWorker(getLoginUser().getLoginUser());
			workLog.setWorkUserId(getLoginUser().getLoginUser().getUserId());
			projectDao.insertWorkLog(workLog);
		}
	}
	
	public void saveWorkLog(WorkLog workLog,int[] relationtaskids) throws Exception {
		
		projectDao.getDataVisit().beginTransaction();
		try {
			if(workLog.getWorkLogId()>0){
				
				workLog.setModifyTime(new java.util.Date());
				projectDao.updateWorkLog(workLog);
			}else{
				workLog.setCreateTime(new java.util.Date());
				workLog.setModifyTime(new java.util.Date());
				//workLog.setWorker(getLoginUser().getLoginUser());
				workLog.setWorkUserId(getLoginUser().getLoginUser().getUserId());
				projectDao.insertWorkLog(workLog);
			}
			workLogRelationshipTaskDeleteListByWorkLogId(workLog.getWorkLogId());
			if(relationtaskids != null){
				WorkLogRelationshipTask wrt=new WorkLogRelationshipTask();
				for(int i=0;i < relationtaskids.length;i++)
				{
					wrt.setTaskId(relationtaskids[i]);
					wrt.setWorkLogId(workLog.getWorkLogId());
					workLogRelationshipTaskInsert(wrt);
				}
			}
			projectDao.getDataVisit().commitTransaction();
		} catch (Exception e) {
			projectDao.getDataVisit().rollBackTransaction();
			throw e;
		}
	}

	/*
	 * 获得某项数据表有多少行
	 */
	
	
	
	
	public List getWorkLogList(int userId, int pageIndex, int rowsOfPage) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return projectDao.getWorkLogList(userId,pageIndex, rowsOfPage);
	}
	
	public List getWorkLogListAll(int userId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		return projectDao.getWorkLogListAll(userId);
	}
	
	public List<WorkLogView> getWorkLogList(int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return projectDao.getWorkLogList(pageIndex, rowsOfPage, orderField, order);
	}
	
	
	public List<WorkLogView> getWorkLogListByCondition(OaQueryCondition condition,int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return projectDao.getWorkLogListByCondition(condition, pageIndex, rowsOfPage, orderField, order);
	}
	

	public int queryWorkLogListByConditionCount(OaQueryCondition condition) throws SQLException {
		return projectDao.queryWorkLogListByConditionCount(condition);
	}
	

	public Task getTask(int taskId) throws DbException, SQLException {
		return projectDao.getTask(taskId);
	}

	private void rebuildTaskOutline(int projId, Task parentTask) throws DbException, SQLException, CacheException{
		List<Task> taskList;
		if(parentTask == null){
			taskList = taskSelectObjects(" where task_project_id = "+projId+" and task_parent_id is null order by order_field asc");
		}else{
			taskList = taskSelectObjects(" where task_project_id = "+projId+" and task_parent_id = "+parentTask.getTaskId()+" order by order_field asc");
		}
		int k = 1;
		for(Task item : taskList){
			if(parentTask == null){
				item.setTaskLevel(0);
				item.setTaskOutline(""+k);
				k++;
			}else{
				item.setTaskLevel(parentTask.getTaskLevel()+1);
				item.setTaskOutline(parentTask.getTaskOutline()+"."+k);
				k++;
			}
			taskUpdate(item);
			rebuildTaskOutline(projId, item);
		}
	}

	
	public void saveTask(Task task, int[] joinTaskUserIds, int[] prevTaskIds) throws Exception {
		Task oldTask = null;
		if(task.getTaskId() > 0){
			oldTask = taskSelectByTaskId(task.getTaskId());
		}
		//调整任务级别
		if(task.getTaskParentId() == null){
			task.setTaskLevel(0);
		}else{
			task.setTaskLevel(projectDao.getTask(task.getTaskParentId()).getTaskLevel()+1);
		}
		
		beginTransaction();
		try{
			//save task
			if(task.getTaskId() > 0){
				task.setModifyTime(new java.util.Date());
				task.setTaskModifierId(getLoginUser().getLoginUser().getUserId());
				taskUpdate(task);
			}else{
				task.setCreateTime(new java.util.Date());
				task.setTaskCreaterId(getLoginUser().getLoginUser().getUserId());
				task.setModifyTime(new java.util.Date());
				task.setTaskModifierId(getLoginUser().getLoginUser().getUserId());
				task.setOrderField(new java.util.Date());
				taskInsert(task);
			}
			//save taskuser
			taskUserDeleteListByTaskId(task.getTaskId());
			if(joinTaskUserIds != null){
				TaskUser tu = new TaskUser();
				for(int i=0;i<joinTaskUserIds.length;i++){
					tu.setTaskId(task.getTaskId());
					tu.setUserId(joinTaskUserIds[i]);
					taskUserInsert(tu);
				}
			}
			//save prevTask
			taskPreviousTaskDeleteByTaskId(task.getTaskId());
			if(prevTaskIds != null){
				for(int i=0;i<prevTaskIds.length;i++){
					TaskPreviousTask tpt = new TaskPreviousTask();
					tpt.setTaskId(task.getTaskId());
					tpt.setPreviousTaskId(prevTaskIds[i]);
					taskPreviousTaskInsert(tpt);
				}
			}
			
			
			//调整任务大纲
			boolean needAdjust = false;
			if(oldTask != null){
				if(task.getTaskParentId() == null && oldTask.getTaskParentId() == null){
					//no change
				}else if(task.getTaskParentId() != null && oldTask.getTaskParentId() != null && task.getTaskParentId().equals(oldTask.getTaskParentId())){
					//no change
				}else{
					needAdjust = true;
				}
			}else{
				needAdjust = true;
			}
			
			if(needAdjust){
				if(task.getTaskParentId() == null || (oldTask != null && oldTask.getTaskParentId() == null)){
					rebuildTaskOutline(task.getTaskProjectId(), null);
				}else{
					Task parentTask;
					if(oldTask != null){
						parentTask = taskSelectByTaskId(oldTask.getTaskParentId());
						rebuildTaskOutline(task.getTaskProjectId(), parentTask);
					}
					parentTask = taskSelectByTaskId(task.getTaskParentId());
					rebuildTaskOutline(task.getTaskProjectId(), parentTask);
				}
			}
			commitTransaction();
		}catch(Exception e){
			rollBackTransaction();
			throw e;
		}
	}

	//public ProjgroupDao projgdao=new ProjgroupDao();
	public ProjectDao getProjectDao() {
		return projectDao;
	}

	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}
	
	public java.util.SortedMap<Integer, String> getTaskStateMap(){
		java.util.SortedMap<Integer, String> map = new java.util.TreeMap<Integer, String>();
		map.put(new Integer(0), "暂停");
		map.put(new Integer(1), "处理中");
		map.put(new Integer(2), "结束");
		map.put(new Integer(3), "已关闭");
		map.put(new Integer(4), "重新打开");
		return map;
	}

	@SuppressWarnings("unchecked")
	public java.util.SortedSet<Task> getMayUseParentTaskSet(int currentTaskId, int projectId) throws DbException, SQLException, CacheException{
		Task currentTask = null; 
		Hashtable<Integer, Task> removeList = new Hashtable<Integer, Task>();
		SortedSet<Task> newSet = new TreeSet<Task>(new TaskComparator());
		List<Task> taskList = taskSelectObjectsByTaskProjectId(projectId);
		SortedSet<Task> taskSet = new TreeSet<Task>(new TaskComparator());
		for(java.util.Iterator<Task> it = taskList.iterator();it.hasNext();){
			Task task = it.next();
			taskSet.add(task);
		
		}
		
	if(currentTaskId > 0){
		currentTask = projectDao.getTask(currentTaskId); 
		
		//SortedSet<Task> taskSet = (SortedSet<Task>) projectDao.TaskselectObjectsByTaskProjectId(projectDao.getTask(currentTaskId).getTaskProjectId());
		
		for(java.util.Iterator<Task> it = taskSet.iterator();it.hasNext();){
			Task task = it.next();
			if(task.getTaskId() == currentTask.getTaskId()){
				//it.remove();
				removeList.put(new Integer(task.getTaskId()),task);
			}else if(task.getTaskParentId()!= null ){
				if(task.getTaskParentId() == currentTask.getTaskId()){
					//it.remove();
					removeList.put(new Integer(task.getTaskId()),task);
				}else if(removeList.size()>0)
				{
					
					for(Iterator<Entry<Integer,Task>> it1 = removeList.entrySet().iterator();it1.hasNext();){
						
							Task tt = it1.next().getValue();
							if(task.getTaskParentId()!=null&&task.getTaskParentId() == tt.getTaskId()){
								//it.remove();
								removeList.put(new Integer(task.getTaskId()),task);
								break;
							}
						
							 
						
					}
				}
			}
		}
		if(removeList.size()>0){
			for(java.util.Iterator<Task> it = taskSet.iterator();it.hasNext();){
				Task task = it.next();
				
					if(!removeList.containsKey(new Integer(task.getTaskId()))){
						for(int levelnum=task.getTaskLevel();levelnum>0;levelnum--){
							String newname="__"+task.getTaskName();
							task.setTaskName(newname);
							
						}
						newSet.add(task);
					}
				
			}
		}
		else {
			for(java.util.Iterator<Task> it = taskSet.iterator();it.hasNext();){
				Task task = it.next();
				
					
						for(int levelnum=task.getTaskLevel();levelnum>0;levelnum--){
							String newname="__"+task.getTaskName();
							task.setTaskName(newname);
							
						}
						newSet.add(task);
					
				
			}
		}

		
	}

	else {
		for(java.util.Iterator<Task> it = taskSet.iterator();it.hasNext();){
			Task task = it.next();
			
				
			for(int levelnum=task.getTaskLevel();levelnum>0;levelnum--){
				String newname="__"+task.getTaskName();
				task.setTaskName(newname);
				
				}
			newSet.add(task);	
			}
		
		
	   }
	return newSet;
	

}

	/*
	 * 为了方便根据任务级别显示上级任务
	 */

	public List<Task> getMayUseParentTaskList(int taskId, int projId) throws DbException, SQLException, CacheException {
		return taskSelectObjects("from T_Task where T_PROJECT.PROJ_ID = "+projId);
	}
	
	public List<User> getJoinUsers(int projId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		return projectDao.getJoinUsers(projId);
	}
	
	public List<ProjUserView> getProjUserList(int projId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		return projectDao.getProjUserList(projId);
	}

	public List<LogTaskView> getLogRelationTaskList(int logId,int userId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		return projectDao.getLogRelationTaskList(logId,userId);
	}

	public int queryUserScoreByMonth(int year, int month, int userId) throws SQLException{
		return projectDao.queryUserScoreByMonth(year, month, userId);
	}
}
