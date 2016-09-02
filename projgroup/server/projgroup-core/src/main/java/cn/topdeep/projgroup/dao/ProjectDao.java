package cn.topdeep.projgroup.dao;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.topdeep.projgroup.entity.base.PageImpl;
import cn.topdeep.projgroup.entity.data.OaQueryCondition;
import cn.topdeep.projgroup.entity.db.Project;
import cn.topdeep.projgroup.entity.db.ProjectExample;
import cn.topdeep.projgroup.entity.db.User;
import cn.topdeep.projgroup.entity.db.WorkLog;
import cn.topdeep.projgroup.entity.db.WorkLogExample;
import cn.topdeep.projgroup.entity.view.PrevMonthWorkScore;
import cn.topdeep.projgroup.entity.view.PrevMonthWorkScoreMapper;
import cn.topdeep.projgroup.entity.view.ProjUserView;
import cn.topdeep.projgroup.entity.view.ProjectListView;
import cn.topdeep.projgroup.entity.view.WorkLogView;

public class ProjectDao extends ProjgroupDao {

	public Project getProject(int projId) throws SQLException {
		return projectSelectByPrimaryKey(projId);
	}

	public void updateProject(Project proj) throws SQLException {
		projectUpdate(proj);
	}

	public void insertProject(Project proj) throws SQLException {
		projectInsert(proj);
	}

	public List<Project> getProjList(int pageIndex, int rowsOfPage) throws SQLException {
		ProjectExample condition = new ProjectExample();
		PageImpl page = new PageImpl();
		page.setPageIndex(pageIndex);
		page.setRowsOfPage(rowsOfPage);
		condition.setPage(page);
		condition.setOrderByClause("PROJ_ID ASC");
		return projectSelectObjects(condition);
	}

	/**
	 * 从新写的项目view
	 * 
	 * @param pageIndex
	 * @param rowsOfPage
	 * @return
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws SQLException
	 * @throws IllegalArgumentException
	 */
	public List<ProjectListView> getProjListViewlist(int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException,
			SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
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

	public List<Project> getProjListAll() throws SQLException {
		return projectSelectObjects(new ProjectExample());
	}

	public WorkLog getWorkLog(int logId) throws SQLException {
		// return load(WorkLog.class, logId);
		return workLogSelectByPrimaryKey(logId);
	}

	public void updateWorkLog(WorkLog workLog) throws SQLException {
		workLogUpdateWithBlobs(workLog);
	}

	public void insertWorkLog(WorkLog workLog) throws SQLException {
		workLogInsert(workLog);
	}

	// public List<WorkLogView> getWorkLogList(int pageIndex, int rowsOfPage,
	// String orderField, String order) throws IllegalArgumentException,
	// SQLException, InstantiationException, IllegalAccessException,
	// InvocationTargetException {
	// String sql=WorkLog.getSelectSql()+", T_USER.REAL_NAME WORKER_NAME from
	// T_WORK_LOG inner join T_USER on T_USER.USER_ID =
	// T_WORK_LOG.WORK_USER_ID";
	// return queryEntity(WorkLogView.class, sql, pageIndex, rowsOfPage,
	// orderField, order);
	// }
	//
	public List<WorkLogView> getWorkLogListByCondition(OaQueryCondition condition, int pageIndex, int rowsOfPage, String orderField, String order)
			throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		WorkLogExample example = getQueryWorkLogListByConditionSql(condition);
		example.setPage(new PageImpl(pageIndex, rowsOfPage));
		example.setOrderByClause(orderField + " " + order);
		List<WorkLog> list = workLogSelectObjectsWithBLOBs(example);
		List<WorkLogView> resultList = new ArrayList<WorkLogView>();
		for (WorkLog item : list) {
			WorkLogView detail = new WorkLogView();
			detail.setCreateTime(item.getCreateTime());
			detail.setModifyTime(item.getModifyTime());
			detail.setWorkContent(item.getWorkContent());
			detail.setWorkDay(item.getWorkDay());
			detail.setWorkerName("" + item.getWorkUserId());
			detail.setWorkEvaluationContent(item.getWorkEvaluationContent());
			detail.setWorkEvaluationScore(item.getWorkEvaluationScore());
			detail.setWorkLogId(item.getWorkLogId());
			detail.setWorkUserId(item.getWorkUserId());
			resultList.add(detail);
		}
		return resultList;
	}

	//
	//
	public WorkLogExample getQueryWorkLogListByConditionSql(OaQueryCondition condition) {
		WorkLogExample example = new WorkLogExample();
		WorkLogExample.Criteria criteria = example.or();
		if (condition.getWorkUserId() > 0) {
			criteria.andWorkUserIdEqualTo(condition.getWorkUserId());
		}
		if (condition.getCreateTime() != null) {
			criteria.andWorkDayEqualTo(condition.getCreateTime());
		}
		return example;
	}

	//
	public int queryWorkLogListByConditionCount(OaQueryCondition condition) throws SQLException {
		// String sql = getQueryWorkLogListByConditionSql(condition);
		WorkLogExample example = getQueryWorkLogListByConditionSql(condition);
		return workLogQuerySelectObjectsCount(example);
	}

	public List<WorkLog> getWorkLogList(int userId, int pageIndex, int rowsOfPage) throws IllegalArgumentException, SQLException, InstantiationException,
			IllegalAccessException, InvocationTargetException {
		// String hql = "from WorkLog where worker.userId = "+userId+" order by
		// modifyTime desc";
		// String sql=WorkLog.getSelectSql()+"from T_WORK_LOG where WORK_USER_ID
		// = "+userId;
		// return getDataVisit().queryEntity(WorkLog.class, sql, pageIndex,
		// rowsOfPage, "WORK_DAY", "desc");
		WorkLogExample condition = new WorkLogExample();
		condition.or().andWorkUserIdEqualTo(userId);
		PageImpl page = new PageImpl();
		page.setPageIndex(pageIndex);
		page.setRowsOfPage(rowsOfPage);
		condition.setPage(page);
		condition.setOrderByClause("WORK_DAY desc");
		return workLogSelectObjectsWithBLOBs(condition);
	}

	/*
	 * 获得某项数据表有多少行
	 */
	public List<WorkLog> getWorkLogListAll(int userId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException,
			InvocationTargetException {
		// String hql = "from WorkLog where worker.userId = "+userId+" order by
		// modifyTime desc";
		// String sql=WorkLog.getSelectSql()+"from T_WORK_LOG where WORK_USER_ID
		// = "+userId;
		// return getDataVisit().queryEntity(WorkLog.class, sql);
		WorkLogExample condition = new WorkLogExample();
		condition.or().andWorkUserIdEqualTo(userId);
		condition.setOrderByClause("WORK_DAY desc");
		return workLogSelectObjectsWithBLOBs(condition);
	}

	public List<User> getJoinUsers(int projId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException,
			InvocationTargetException {
		// String sql = User.getSelectSql()+" from T_USER inner join
		// T_PROJECT_JOIN_USER on T_PROJECT_JOIN_USER.USER_ID = T_USER.USER_ID
		// where T_PROJECT_JOIN_USER.PROJECT_ID = "+projId;
		// return queryEntity(User.class, sql);
		return null;
	}

	public List<ProjUserView> getProjUserList(int projId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException,
			InvocationTargetException {
		// String sql = User.getSelectSql()+",case when
		// T_PROJECT_JOIN_USER.USER_ID is null then 0 else 1 end SELECTED from
		// T_USER left join T_PROJECT_JOIN_USER on T_PROJECT_JOIN_USER.USER_ID =
		// T_USER.USER_ID and T_PROJECT_JOIN_USER.PROJECT_ID = "+projId;
		// return queryEntity(ProjUserView.class, sql);
		return null;
	}

	// private ProjgroupDao projgDao=new ProjgroupDao();

	public int queryUserScoreByMonth(int year, int month, int userId) throws SQLException {
		String sql = "select sum(WORK_EVALUATION_SCORE) totalScore from T_WORK_LOG where WORK_USER_ID = " + userId + " and year(WORK_DAY) = " + year
				+ " and month(WORK_DAY) = " + month;
		Object obj = queryScalar(sql);
		if (obj != null) {
			return Integer.parseInt(obj.toString());
		} else {
			return 0;
		}
	}

	public List<PrevMonthWorkScore> prevMonthWorkScoreSelectObjects() {
		PrevMonthWorkScoreMapper mapperImpl = this.getSqlSession().getMapper(PrevMonthWorkScoreMapper.class);
		return mapperImpl.selectObjects();
	}
}
