package cn.topdeep.projgroup.action.work;

import cn.topdeep.projgroup.action.PageAction;
import cn.topdeep.projgroup.dao.ProjgroupDao;
import cn.topdeep.projgroup.entity.*;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.*;

import common.cache2.CacheException;
import common.privilege.Privilege;
import common.privilege.PrivilegeOperate;

public class TaskManage extends PageAction {
	private int rowsCount = -1;
	
	/**
	 * 项目任务列表 
	 */
	private List<Task> taskList;
	
	private int userId;
	
	@Override
	public int getRowsCount() {
		if(rowsCount < 0) {
			if(this.watch == 1) {
					try {
						rowsCount = getProjectBiz().querygetTaskListQueryCount(projId);//查询所有的.
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}else{
				try {
					rowsCount = getProjectBiz().querygetTaskListQueryCountByUserId(projId,getLoginUser().getLoginUser().getUserId());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		return rowsCount;
	}
	
	public String execute() throws SQLException, DbException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return SUCCESS;
	}
	
	private List<Task> taskListAll;
	private String selectedTasks;
	private Task mytask;
	private int taskId;
	private List<Task> mytasklist;
	private List<Task> mytasklistAll;
	private int watch=0;
	//private long[] worktime; 
//	private int returntag=0;//这是这两天刚想到的，用于传给execute判断应该返回什么字符串。
	private double actualWorkTime;
	List<Task> sonTaskList;
	List<Task> sonList;
	

	private int projId;
	
	private int overtime=0;//用这个变量来判断是否点击了结束按钮，如果点击了，根据它来转向一个页面：输入总工时
	
	private int[] getSelectTaskIds(){
		if(selectedTasks.equals("false")) {
			return null;
		}
		return common.db.SqlUtils.stringToIntArray(selectedTasks);
	}

	public List<Task> getTaskList() throws DbException, SQLException, CacheException {
		if(taskList == null){
			TaskQueryCondition condition = new TaskQueryCondition();
			if(projId > 0){
				condition.setTaskProjectId(projId);
			}
			taskList = getProjectBiz().taskSelectObjects(condition, 0, Integer.MAX_VALUE, "TASK_OUTLINE", "asc");
		}
		return taskList;
	}

	public void List(List<Task> taskList) {
		this.taskList = taskList;
	}

	public int getProjId() {
		return projId;
	}

	public void setProjId(int projId) {
		this.projId = projId;
	}

	public List<Task> getTaskListAll() {
		return taskListAll;
	}

	public void setTaskListAll(List<Task> taskListAll) {
		this.taskListAll = taskListAll;
	}
	
	public String disable() throws SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException{
		if(!hasPrivilege(Privilege.FUNC_USER_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		int[] ids = getSelectTaskIds();
		if(ids != null){
			getSystemBiz().disableTasks(ids);
						
		}
		return execute();
	}
	
	public String enable() throws SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException{
		if(!hasPrivilege(Privilege.FUNC_USER_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		int[] ids = getSelectTaskIds();
		if(ids != null){
			getSystemBiz().enableTasks(ids);
		}
		return execute();
	}
	
	/*
	 * 用于将单个任务进行开始，暂停，结束
	 */
	public String start() throws SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException{
		if(!hasPrivilege(Privilege.FUNC_USER_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		
		this.mytask=getProjectBiz().getTask(this.taskId);
		if(this.mytask.getTaskState()==cn.topdeep.projgroup.entity.data.TaskState.Disabled)
			getSystemBiz().startTaskNoTime(this.taskId);//不添加开始时间，因为是暂停之后再开始
		else {
			getSystemBiz().startTask(this.taskId);
		}
		
		
		/*
		 * 这个任务开始，也要向上搜索，将所有父任务以及祖先任务没有开始的一起开始
		 */
		
		
		//this.mytask.setTaskActualStartDate(now);
		
		while(mytask.getTaskLevel()>0){
			
			mytask=getProjectBiz().getTask(mytask.getTaskParentId());
			if(this.mytask.getTaskState()==cn.topdeep.projgroup.entity.data.TaskState.Disabled)
				getSystemBiz().startTaskNoTime(mytask.getTaskId());
			else if(this.mytask.getTaskState()==cn.topdeep.projgroup.entity.data.TaskState.Gameover)
				getSystemBiz().startTask(mytask.getTaskId());
		}
		if(this.mytask.getTaskState()==cn.topdeep.projgroup.entity.data.TaskState.Disabled)
			getSystemBiz().startTaskNoTime(mytask.getTaskId());
		else if(this.mytask.getTaskState()==cn.topdeep.projgroup.entity.data.TaskState.Gameover)
			getSystemBiz().startTask(mytask.getTaskId());
		return execute();
	}
	
	public String gameover() throws Exception{
		if(!hasPrivilege(Privilege.FUNC_USER_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		overtime=1;
		this.mytask=getProjectBiz().getTask(this.taskId);
		//taskListAll=getProjectBiz().getTaskListAll(this.projId);
		//判断是否是最子任务的方法
		
		//return execute();//因为对于这个方法要返回两种视图，取决于是不是最子任务。
		 //是不是根任务没关系,只要判断是否是节点任务;
		int c = 0;
		userId=getSystemBiz().getLoginUser().getLoginUser().getUserId();
		mytasklistAll = getProjectBiz().getmyTaskListAll(this.projId,userId);
		for(java.util.Iterator<Task> it = mytasklistAll.iterator();it.hasNext();) { //循环遍历所有我的任务;
			Task childTask = it.next();  //挨个拿出所有我的任务,只要所有的任务(除了要结束的外)的父Id与要结束的任务id不等.
			if(childTask.getTaskParentId() !=null) {
				if(childTask.getTaskParentId() == mytask.getTaskId()) { //是要结束的子任务
					if(childTask.getTaskState() != 2) {//子任务还没结束
						c++;
					}
				}
			}
		}
		if(c > 0){ //有子任务
			addFieldError("error", "先结束子任务");
			return INPUT;
		}
		
		getSystemBiz().gameoverTask(this.taskId);
		Calendar   ca   =   Calendar.getInstance(); 
		Date   now   =   ca.getTime();
		this.mytask.setTaskActualEndDate(now);
		return "success1";
	}
	
	
	
	public int issonist(Task task) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		taskListAll=getProjectBiz().getTaskListAll(this.projId);
		for(int i=0;i<taskListAll.size();i++){
			if(taskListAll.get(i).getTaskParentId() != null) {
				if((taskListAll.get(i).getTaskLevel()>0)&& taskListAll.get(i).getTaskParentId()==task.getTaskId())
					return 1;
			
			}
		}
		return 2;//经历了判断过程，得出他是最子任务。而且，如果一个任务没有子任务，哪怕他的级别是0，也算作这里的最子任务
	}
	
	//public String gameoverexecute() throws SQLException, DbException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
	//	bindDate2();//这个还不清楚要还是不要
		
	//}
	
	public String parse() throws SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException{
		if(!hasPrivilege(Privilege.FUNC_USER_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		getSystemBiz().parseTask(this.taskId);
		return execute();
	}
	
	public int ancestorworktime() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		taskListAll=getProjectBiz().getTaskListAll(this.projId);
		return 1;

		
	}
	
	//处理输入的子任务的工时
	public String worktimepose() throws DbException, IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException, CacheException{
		
		this.mytask=getProjectBiz().getTask(this.taskId);
		if(issonist(this.mytask)==2){
			mytask.setActualWorkTime(this.actualWorkTime);
			getProjectBiz().taskUpdate(this.mytask);
			Task task=getProjectBiz().getTask(this.mytask.getTaskParentId());
			while(task.getTaskParentId()!=null){
				if(task.getActualWorkTime()==null) task.setActualWorkTime(0.0);
				task.setActualWorkTime(task.getActualWorkTime()+this.mytask.getActualWorkTime());
				getProjectBiz().taskUpdate(task);
				task=getProjectBiz().getTask(this.mytask.getTaskParentId());
			}
			if(task.getActualWorkTime()==null) task.setActualWorkTime(0.0);
			task.setActualWorkTime(task.getActualWorkTime()+this.mytask.getActualWorkTime());
			getProjectBiz().taskUpdate(task);
			//this.returntag=1;
			return "success1";
		}
		else if(issonist(this.mytask)==1){
			
			for(int i=0;i<sonTaskList.size();i++){
				Task task=sonTaskList.get(i);
				getProjectBiz().taskUpdate(this.mytask);
				Task parenttask=getProjectBiz().getTask(this.mytask.getTaskParentId());
				while(parenttask.getTaskParentId()!=null){
					if(parenttask.getActualWorkTime()==null) parenttask.setActualWorkTime(0.0);
					parenttask.setActualWorkTime(parenttask.getActualWorkTime()+task.getActualWorkTime());
					getProjectBiz().taskUpdate(parenttask);
					parenttask=getProjectBiz().getTask(parenttask.getTaskParentId());
				}
				if(parenttask.getActualWorkTime()==null) parenttask.setActualWorkTime(0.0);
				parenttask.setActualWorkTime(parenttask.getActualWorkTime()+task.getActualWorkTime());
				getProjectBiz().taskUpdate(parenttask);
				
			}
			return "input1";
		}
		
		return "";
	}

	public void makeson(Task task) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		if(this.taskListAll==null)
			taskListAll=getProjectBiz().getTaskListAll(this.projId);
		    
		for(int i=0;i<taskListAll.size();i++){
			Task sontask=taskListAll.get(i);
			if(sontask.getTaskLevel()>0&&sontask.getTaskParentId()==task.getTaskId()){
				if(sonList != null) {
					sonList.add(sontask); 
				     makeson(sontask);
				}
			}
		}
	}
	
	public String getSelectedTasks() {
		return selectedTasks;
	}

	public void setSelectedTasks(String selectedTasks) {
		this.selectedTasks = selectedTasks;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public Task getMytask() {
		return mytask;
	}

	public void setMytask(Task mytask) {
		this.mytask = mytask;
	}



	public int getUserId() {
		return userId;
	}

	public int getWatch() {
		return watch;
	}

	public void setWatch(int watch) {
		this.watch = watch;
	}

	public List<Task> getMytasklist() {
		return mytasklist;
	}

	public double getActualWorkTime() {
		return actualWorkTime;
	}

	public void setActualWorkTime(double actualWorkTime) {
		this.actualWorkTime = actualWorkTime;
	}
	
	public String allstart() throws SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		if(getSelectTaskIds() != null) {
			int[] ids = getSelectTaskIds();
			for(int i=0;i<ids.length;i++) {
				getSystemBiz().startTask(ids[i]);
				return SUCCESS;
			}
		}
		addFieldError("error", "请选择");
		return INPUT;
	}

	
	
}
