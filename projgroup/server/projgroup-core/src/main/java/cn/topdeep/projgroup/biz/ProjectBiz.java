package cn.topdeep.projgroup.biz;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.topdeep.projgroup.dao.ProjectDao;
import cn.topdeep.projgroup.entity.data.OaQueryCondition;
import cn.topdeep.projgroup.entity.db.Project;
import cn.topdeep.projgroup.entity.db.User;
import cn.topdeep.projgroup.entity.db.WorkLog;
import cn.topdeep.projgroup.entity.view.PrevMonthWorkScore;
import cn.topdeep.projgroup.entity.view.ProjUserView;
import cn.topdeep.projgroup.entity.view.ProjectListView;
import cn.topdeep.projgroup.entity.view.WorkLogView;


@Service("projectBiz")
public class ProjectBiz extends BaseBiz {

	private ProjectDao projectDao;
//	private ProjgroupDao projgroupDao;
	//private List<ProjectJoinUser> projjoinuserlist;
	
	
	public Project getProject(int projId) throws SQLException {
		//return getProject(projId);
		return projectDao.getProject(projId);
	}

	
	public void saveProject(Project proj, int[] projJoinUserIds) throws Exception {
		
//		projectDao.getDataVisit().beginTransaction();
//		try {
//			if(proj.getProjId() > 0){
//				projectDao.updateProject(proj);
//			}else{
//				projectDao.insertProject(proj);
//			}
//			projectJoinUserDeleteListByProjectId(proj.getProjId());
//			if(projJoinUserIds != null){
//				ProjectJoinUser pju = new ProjectJoinUser();
//				for(int i=0;i < projJoinUserIds.length;i++)
//				{
//					pju.setProjectId(proj.getProjId());
//					pju.setUserId(projJoinUserIds[i]);
//					projectJoinUserInsert(pju);
//				}
//			}
//			projectDao.getDataVisit().commitTransaction();
//		} catch (Exception e) {
//			projectDao.getDataVisit().rollBackTransaction();
//			throw e;
//		}
	}

	public List getProjList(int pageIndex, int rowsOfPage) throws SQLException {
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
	public List<ProjectListView> getProjListViewlist(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return projectDao.getProjListViewlist(pageIndex, rowsOfPage, orderField, order);
	}
	
	public int getQueryProjListViewlistCount() throws SQLException {
		return projectDao.getQueryProjListViewlistCount();
	}

	public List getProjListAll() throws SQLException {
		return projectDao.getProjListAll();
		
	}

	public WorkLog getWorkLog(int logId) throws SQLException {
		return projectDao.getWorkLog(logId);
	}

	public void saveWorkLog(WorkLog workLog) throws SQLException {
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
		
//		projectDao.getDataVisit().beginTransaction();
//		try {
			if(workLog.getWorkLogId() != null && workLog.getWorkLogId()>0){
				workLog.setModifyTime(new java.util.Date());
				projectDao.updateWorkLog(workLog);
			}else{
				workLog.setCreateTime(new java.util.Date());
				workLog.setModifyTime(new java.util.Date());
				//workLog.setWorker(getLoginUser().getLoginUser());
				workLog.setWorkUserId(getLoginUser().getLoginUser().getUserId());
				projectDao.insertWorkLog(workLog);
			}
//			WorkLogRelationshipTaskExample deleteCondition = new WorkLogRelationshipTaskExample();
//			deleteCondition.or().andWorkLogIdEqualTo(workLog.getWorkLogId());
//			workLogRelationshipTaskDeleteByCondition(deleteCondition);
////			workLogRelationshipTaskDeleteListByWorkLogId(workLog.getWorkLogId());
//			if(relationtaskids != null){
//				WorkLogRelationshipTaskKey wrt=new WorkLogRelationshipTaskKey();
//				for(int i=0;i < relationtaskids.length;i++)
//				{
//					wrt.setTaskId(relationtaskids[i]);
//					wrt.setWorkLogId(workLog.getWorkLogId());
//					workLogRelationshipTaskInsert(wrt);
//				}
//			}
//			projectDao.getDataVisit().commitTransaction();
//		} catch (Exception e) {
//			projectDao.getDataVisit().rollBackTransaction();
//			throw e;
//		}
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
//		return projectDao.getWorkLogList(pageIndex, rowsOfPage, orderField, order);
		return null;
	}
	
	
	public List<WorkLogView> getWorkLogListByCondition(OaQueryCondition condition,int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return projectDao.getWorkLogListByCondition(condition, pageIndex, rowsOfPage, orderField, order);
	}
	

	public int queryWorkLogListByConditionCount(OaQueryCondition condition) throws SQLException {
		return projectDao.queryWorkLogListByConditionCount(condition);
//		return 0;
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

	/*
	 * 为了方便根据任务级别显示上级任务
	 */

//	public List<Task> getMayUseParentTaskList(int taskId, int projId) throws SQLException, CacheException {
//		return taskSelectObjects("from T_Task where T_PROJECT.PROJ_ID = "+projId);
//	}
	
	public List<User> getJoinUsers(int projId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		return projectDao.getJoinUsers(projId);
	}
	
	public List<ProjUserView> getProjUserList(int projId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		return projectDao.getProjUserList(projId);
	}

//	public List<LogTaskView> getLogRelationTaskList(int logId,int userId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
//		return projectDao.getLogRelationTaskList(logId,userId);
//	}

	public int queryUserScoreByMonth(int year, int month, int userId) throws SQLException{
		return projectDao.queryUserScoreByMonth(year, month, userId);
	}
	
	public List<PrevMonthWorkScore> prevMonthWorkScoreSelectObjects(){
		return projectDao.prevMonthWorkScoreSelectObjects();
	}
}
