package cn.topdeep.projgroup.dao;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import java.util.SortedSet;

import common.db.SqlServerUtils;

import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.data.OaQueryCondition;
import cn.topdeep.projgroup.entity.view.*;

public class ProjectDao extends ProjgroupDao {

	public Project getProject(int projId) throws DbException, SQLException {
		return projectSelectByProjId(projId);
	}
	
	public void updateProject(Project proj) throws DbException, SQLException {
		projectUpdate(proj);
	}

	public void insertProject(Project proj) throws DbException, SQLException {
		projectInsert(proj);
	}

	public List<Project> getProjList(int pageIndex, int rowsOfPage) throws DbException, SQLException {
		return projectSelectObjects("",pageIndex, rowsOfPage, "PROJ_ID", "ASC");
	}
	
	/**
	 * 从新写的项目view
	 * @param pageIndex
	 * @param rowsOfPage
	 * @return
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SQLException 
	 * @throws IllegalArgumentException 
	 */
	public List<ProjectListView> getProjListViewlist(int pageIndex, int rowsOfPage ,String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		String sql = getProjListViewlistSql();
		return queryEntity(ProjectListView.class, sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	public String getProjListViewlistSql() {
		String sql = "SELECT T_PROJECT.* ,T_USER.REAL_NAME  MANAGENAME FROM  T_PROJECT inner join T_USER on T_PROJECT.PROJECT_MANAGER_ID = T_USER.USER_ID";
		return sql;
	}
	
	public int getQueryProjListViewlistCount() throws SQLException {
		String sql = getProjListViewlistSql(); 
		return queryCount(sql);
	}
	
	public List<Project> getProjListAll() throws DbException, SQLException{
		return projectSelectObjects("");
	}

	public List<Task> getTaskList(int projId, int pageIndex, int rowsOfPage) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		//String hql = "from Task where taskOwner = "+projId;
		String sql = Task.getSelectSql()+ "from T_Task where TASK_PROJECT_ID = "+projId;
		return getDataVisit().queryEntity(Task.class, sql, pageIndex, rowsOfPage, "CREATE_TIME", "desc");
	}
	
	public int querygetTaskListQueryCount(int projId) throws SQLException {
		String sql = Task.getSelectSql()+ "from T_Task where TASK_PROJECT_ID = "+projId;
		return queryCount(sql);
	}
	
	public int querygetTaskListQueryCountByUserId(int projId, int userId) throws SQLException {
		String sql = Task.getSelectSql()+ "from T_Task where TASK_PROJECT_ID = "+projId+"and TASK_CREATER_ID="+userId;
		return queryCount(sql);
	}
	
	public List<Task> getmyTaskList(int projId, int userId,int pageIndex, int rowsOfPage) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		//String hql = "from Task where taskOwner = "+projId;
		String sql = Task.getSelectSql()+ "from T_Task where TASK_PROJECT_ID = "+projId+"and TASK_CREATER_ID="+userId;
		return getDataVisit().queryEntity(Task.class, sql, pageIndex, rowsOfPage, "CREATE_TIME", "desc");
	}
	
	public List<Task> getmyTaskListAll(int projId, int userId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		//String hql = "from Task where taskOwner = "+projId;
		String sql = Task.getSelectSql()+ "from T_Task where TASK_PROJECT_ID = "+projId+"and TASK_CREATER_ID="+userId;
		return getDataVisit().queryEntity(Task.class, sql);
	}
	
	public List<Task> getmyTaskListAllRelation(int userId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		//String hql = "from Task where taskOwner = "+projId;
		String sql = Task.getSelectSql()+ "from T_Task where TASK_CREATER_ID="+userId;
		return getDataVisit().queryEntity(Task.class, sql);
	}
	
	public List<Task> getTaskListAll(int projId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		//String hql = "from Task where taskOwner = "+projId;
		String sql = Task.getSelectSql()+ "from T_Task where TASK_PROJECT_ID = "+projId;
		return getDataVisit().queryEntity(Task.class, sql);
		//return getDataVisit().queryEntity(Task.class, sql, pageIndex, rowsOfPage, "CREATE_TIME", "desc");
	}

	public WorkLog getWorkLog(int logId) throws DbException, SQLException {
		//return load(WorkLog.class, logId);
		return workLogSelectByWorkLogId(logId);
	}

	public void updateWorkLog(WorkLog workLog) throws DbException, SQLException {
		workLogUpdate(workLog);		
	}

	public void insertWorkLog(WorkLog workLog) throws DbException, SQLException {
		workLogInsert(workLog);
	}

	public List<WorkLogView> getWorkLogList(int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		String sql=WorkLog.getSelectSql()+", T_USER.REAL_NAME WORKER_NAME from T_WORK_LOG inner join T_USER on T_USER.USER_ID = T_WORK_LOG.WORK_USER_ID";
		return queryEntity(WorkLogView.class, sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	public List<WorkLogView> getWorkLogListByCondition(OaQueryCondition condition,int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		String sql = getQueryWorkLogListByConditionSql(condition);
		return queryEntity(WorkLogView.class, sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	
	public String getQueryWorkLogListByConditionSql(OaQueryCondition condition) {
		String sql=WorkLog.getSelectSql()+", T_USER.REAL_NAME WORKER_NAME from T_WORK_LOG inner join T_USER on T_USER.USER_ID = T_WORK_LOG.WORK_USER_ID";
		if(condition.getWorkUserId() > 0) {
			sql += " and T_WORK_LOG.WORK_USER_ID = "+ condition.getWorkUserId();
		}
		if(condition.getCreateTime() != null) {
			sql += " and "+ SqlServerUtils.getDateEqualsSql("T_WORK_LOG.WORK_DAY", condition.getCreateTime());
		}
		return sql;
	}
	
	public int queryWorkLogListByConditionCount(OaQueryCondition condition) throws SQLException {
		String sql = getQueryWorkLogListByConditionSql(condition);
		return  queryCount(sql);
	}
	

	public List<WorkLog> getWorkLogList(int userId, int pageIndex, int rowsOfPage) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		//String hql = "from WorkLog where worker.userId = "+userId+" order by modifyTime desc";
		String sql=WorkLog.getSelectSql()+"from T_WORK_LOG where WORK_USER_ID = "+userId;
		return getDataVisit().queryEntity(WorkLog.class, sql, pageIndex, rowsOfPage, "WORK_DAY", "desc");
	}
		
	/*
	 * 获得某项数据表有多少行
	 */
	public List<WorkLog> getWorkLogListAll(int userId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		//String hql = "from WorkLog where worker.userId = "+userId+" order by modifyTime desc";
		String sql=WorkLog.getSelectSql()+"from T_WORK_LOG where WORK_USER_ID = "+userId;
		return getDataVisit().queryEntity(WorkLog.class, sql);
	}
	
	public Task getTask(int taskId) throws DbException, SQLException {
		return taskSelectByTaskId(taskId);
	}

	public List<User> getJoinUsers(int projId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		String sql = User.getSelectSql()+" from T_USER inner join T_PROJECT_JOIN_USER on T_PROJECT_JOIN_USER.USER_ID = T_USER.USER_ID where T_PROJECT_JOIN_USER.PROJECT_ID = "+projId;
		return queryEntity(User.class, sql);
	}
	
	public List<ProjUserView> getProjUserList(int projId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		String sql = User.getSelectSql()+",case when T_PROJECT_JOIN_USER.USER_ID is null then 0 else 1 end SELECTED from T_USER left join T_PROJECT_JOIN_USER on T_PROJECT_JOIN_USER.USER_ID = T_USER.USER_ID and T_PROJECT_JOIN_USER.PROJECT_ID = "+projId;
		return queryEntity(ProjUserView.class, sql);
	}
	
	public List<LogTaskView> getLogRelationTaskList(int logId,int userId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		String sql = Task.getSelectSql()+",case when T_WORK_LOG_RELATIONSHIP_TASK.TASK_ID is null then 0 else 1 end SELECTED from T_TASK left join T_WORK_LOG_RELATIONSHIP_TASK on T_WORK_LOG_RELATIONSHIP_TASK.TASK_ID = T_TASK.TASK_ID and T_WORK_LOG_RELATIONSHIP_TASK.WORK_LOG_ID = "+logId+"and TASK_CREATER_ID="+userId;
		return queryEntity(LogTaskView.class, sql);
	}

	//private ProjgroupDao projgDao=new ProjgroupDao();

	public int queryUserScoreByMonth(int year, int month, int userId) throws SQLException{
		String sql = "select sum(work_evaluation_score) totalScore from t_work_log where work_user_id = "+userId+" and year(work_day) = "+year+" and month(work_day) = "+month;
		Object obj = getDataVisit().executeScalar(sql);
		if(obj != null){
			return Integer.parseInt(obj.toString());
		}else{
			return 0;
		}
	}
}
