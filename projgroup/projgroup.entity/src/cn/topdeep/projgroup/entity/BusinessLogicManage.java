package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
/**
 * 基本的逻辑应用层代码，可扩展
 */
public abstract class BusinessLogicManage {
	
	public abstract IDataVisit2 getDataVisit() throws SQLException, DbException;
	
	/**
	 * 插入基本对象到数据库中
	 * <param name="baseEntity">需要插入的对象</param>
	 */
	protected void insert(BaseEntity baseEntity) throws SQLException, DbException {
		baseEntity.insert(this.getDataVisit());
	}
	
	/**
	 * 更新一个对象到数据库中
	 * <param name="baseEntity">需要更新的对象</param>
	 */
	protected int update(BaseEntity baseEntity) throws SQLException, DbException {
		return this.update(baseEntity, "");
	}
	
	/**
	 * 更新一个对象到数据库中
	 * <param name="baseEntity">需要更新的对象</param>
	 * <param name="appendConditionSql">附加的Sql条件</param>
	 */
	protected int update(BaseEntity baseEntity, String appendConditionSql) throws SQLException, DbException {
		return baseEntity.update(this.getDataVisit(), appendConditionSql);
	}
	
	/**
	 * <param name="sql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	protected List<VPrevMonthWorkScore> vPrevMonthWorkScoreSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return VPrevMonthWorkScore.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="sql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	protected List<VPrevMonthWorkScore> vPrevMonthWorkScoreSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
		return VPrevMonthWorkScore.selectObjectsWithCustomSql(this.getDataVisit(), sql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	protected List<VPrevMonthWorkScore> vPrevMonthWorkScoreSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return VPrevMonthWorkScore.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	protected List<VPrevMonthWorkScore> vPrevMonthWorkScoreSelectObjects(String appendConditionSql) throws SQLException, DbException {
		return VPrevMonthWorkScore.selectObjects(this.getDataVisit(), appendConditionSql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	protected int vPrevMonthWorkScoreQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
		String sql = "select [V_PREV_MONTH_WORK_SCORE].* from [V_PREV_MONTH_WORK_SCORE] ";
		sql = (sql + appendConditionSql);
		int ret = this.getDataVisit().getCount(sql);
		return ret;
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	protected <T extends VPrevMonthWorkScore> List<T> vPrevMonthWorkScoreSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return VPrevMonthWorkScore.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends VPrevMonthWorkScore> List<T> vPrevMonthWorkScoreSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return VPrevMonthWorkScore.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<VProjectTaskUser> vProjectTaskUserSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return VProjectTaskUser.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<VProjectTaskUser> vProjectTaskUserSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return VProjectTaskUser.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<VProjectTaskUser> vProjectTaskUserSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return VProjectTaskUser.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<VProjectTaskUser> vProjectTaskUserSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return VProjectTaskUser.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int vProjectTaskUserQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [V_PROJECT_TASK_USER].* from [V_PROJECT_TASK_USER] ";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends VProjectTaskUser> List<T> vProjectTaskUserSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return VProjectTaskUser.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends VProjectTaskUser> List<T> vProjectTaskUserSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return VProjectTaskUser.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<VProjectUser> vProjectUserSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return VProjectUser.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<VProjectUser> vProjectUserSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return VProjectUser.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<VProjectUser> vProjectUserSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return VProjectUser.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<VProjectUser> vProjectUserSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return VProjectUser.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int vProjectUserQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [V_PROJECT_USER].* from [V_PROJECT_USER] ";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends VProjectUser> List<T> vProjectUserSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return VProjectUser.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends VProjectUser> List<T> vProjectUserSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return VProjectUser.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<VTaskPreviousTask> vTaskPreviousTaskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return VTaskPreviousTask.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<VTaskPreviousTask> vTaskPreviousTaskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return VTaskPreviousTask.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<VTaskPreviousTask> vTaskPreviousTaskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return VTaskPreviousTask.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<VTaskPreviousTask> vTaskPreviousTaskSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return VTaskPreviousTask.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int vTaskPreviousTaskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [V_TASK_PREVIOUS_TASK].* from [V_TASK_PREVIOUS_TASK] ";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends VTaskPreviousTask> List<T> vTaskPreviousTaskSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return VTaskPreviousTask.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends VTaskPreviousTask> List<T> vTaskPreviousTaskSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return VTaskPreviousTask.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<VUserTask> vUserTaskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return VUserTask.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<VUserTask> vUserTaskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return VUserTask.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<VUserTask> vUserTaskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return VUserTask.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<VUserTask> vUserTaskSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return VUserTask.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int vUserTaskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [V_USER_TASK].* from [V_USER_TASK] ";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends VUserTask> List<T> vUserTaskSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return VUserTask.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends VUserTask> List<T> vUserTaskSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return VUserTask.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<VPapersScore> vPapersScoreSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return VPapersScore.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<VPapersScore> vPapersScoreSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return VPapersScore.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<VPapersScore> vPapersScoreSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return VPapersScore.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<VPapersScore> vPapersScoreSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return VPapersScore.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int vPapersScoreQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [V_PAPERS_SCORE].* from [V_PAPERS_SCORE] ";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends VPapersScore> List<T> vPapersScoreSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return VPapersScore.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends VPapersScore> List<T> vPapersScoreSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return VPapersScore.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<VQuestionLib> vQuestionLibSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return VQuestionLib.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<VQuestionLib> vQuestionLibSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return VQuestionLib.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<VQuestionLib> vQuestionLibSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return VQuestionLib.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<VQuestionLib> vQuestionLibSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return VQuestionLib.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int vQuestionLibQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [V_QUESTION_LIB].* from [V_QUESTION_LIB] ";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends VQuestionLib> List<T> vQuestionLibSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return VQuestionLib.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends VQuestionLib> List<T> vQuestionLibSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return VQuestionLib.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<VQuestionlibAnswer> vQuestionlibAnswerSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return VQuestionlibAnswer.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<VQuestionlibAnswer> vQuestionlibAnswerSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return VQuestionlibAnswer.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<VQuestionlibAnswer> vQuestionlibAnswerSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return VQuestionlibAnswer.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<VQuestionlibAnswer> vQuestionlibAnswerSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return VQuestionlibAnswer.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int vQuestionlibAnswerQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [V_QUESTIONLIB_ANSWER].* from [V_QUESTIONLIB_ANSWER] ";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends VQuestionlibAnswer> List<T> vQuestionlibAnswerSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return VQuestionlibAnswer.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends VQuestionlibAnswer> List<T> vQuestionlibAnswerSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return VQuestionlibAnswer.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<VTestPapersQuestion> vTestPapersQuestionSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return VTestPapersQuestion.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<VTestPapersQuestion> vTestPapersQuestionSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return VTestPapersQuestion.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<VTestPapersQuestion> vTestPapersQuestionSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return VTestPapersQuestion.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<VTestPapersQuestion> vTestPapersQuestionSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return VTestPapersQuestion.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int vTestPapersQuestionQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [V_TEST_PAPERS_QUESTION].* from [V_TEST_PAPERS_QUESTION] ";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends VTestPapersQuestion> List<T> vTestPapersQuestionSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return VTestPapersQuestion.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends VTestPapersQuestion> List<T> vTestPapersQuestionSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return VTestPapersQuestion.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<VTestPapersResult> vTestPapersResultSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return VTestPapersResult.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<VTestPapersResult> vTestPapersResultSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return VTestPapersResult.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<VTestPapersResult> vTestPapersResultSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return VTestPapersResult.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<VTestPapersResult> vTestPapersResultSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return VTestPapersResult.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int vTestPapersResultQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [V_TEST_PAPERS_RESULT].* from [V_TEST_PAPERS_RESULT] ";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends VTestPapersResult> List<T> vTestPapersResultSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return VTestPapersResult.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends VTestPapersResult> List<T> vTestPapersResultSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return VTestPapersResult.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

protected String pGetIdentity(String tabName, int style, int len, String ret) throws SQLException, DbException {
	Connection cn = this.getDataVisit().getConnection();
	try {
		CallableStatement cmd = cn.prepareCall("{ call P_GET_IDENTITY(?,?,?,?)}");
		cmd.setString(1, tabName);
		cmd.setInt(2, style);
		cmd.setInt(3, len);
		cmd.setString(4, ret);
		cmd.registerOutParameter(4, java.sql.Types.VARCHAR);
		cmd.execute();
		return cmd.getString(4);
	}
	finally {
		this.getDataVisit().releaseConnection();
	}
}

protected String pGetIdentity(PGetIdentityParam pGetIdentityParam) throws SQLException, DbException {
	Connection cn = this.getDataVisit().getConnection();
	try {
		CallableStatement cmd = cn.prepareCall("{ call P_GET_IDENTITY(?,?,?,?)}");
		cmd.setString(1, pGetIdentityParam.getTabName());
		cmd.setInt(2, pGetIdentityParam.getStyle());
		cmd.setInt(3, pGetIdentityParam.getLen());
		cmd.setString(4, pGetIdentityParam.getRet());
		cmd.registerOutParameter(4, java.sql.Types.VARCHAR);
		cmd.execute();
		pGetIdentityParam.setRet(cmd.getString(4));
		return pGetIdentityParam.getRet();
	}
	finally {
		this.getDataVisit().releaseConnection();
	}
}

protected void proctest(int p1, String p2) throws SQLException, DbException {
	Connection cn = this.getDataVisit().getConnection();
	try {
		CallableStatement cmd = cn.prepareCall("{ call PROCTEST(?,?)}");
		cmd.setInt(1, p1);
		cmd.setString(2, p2);
		cmd.execute();
	}
	finally {
		this.getDataVisit().releaseConnection();
	}
}

protected void proctest(ProctestParam proctestParam) throws SQLException, DbException {
	Connection cn = this.getDataVisit().getConnection();
	try {
		CallableStatement cmd = cn.prepareCall("{ call PROCTEST(?,?)}");
		cmd.setInt(1, proctestParam.getP1());
		cmd.setString(2, proctestParam.getP2());
		cmd.execute();
	}
	finally {
		this.getDataVisit().releaseConnection();
	}
}

/**
 * 插入一个对象Jbpm4Swimlane到数据库中
 * <param name="jbpm4Swimlane">需要插入的Jbpm4Swimlane</param>
 */
protected void jbpm4SwimlaneInsert(Jbpm4Swimlane jbpm4Swimlane) throws SQLException, DbException {
	Jbpm4Swimlane.insert(this.getDataVisit(), jbpm4Swimlane);
}

/**
 * 更新一个对象Jbpm4Swimlane到数据库中
 * <param name="jbpm4Swimlane">需要更新的Jbpm4Swimlane</param>
 */
protected int jbpm4SwimlaneUpdate(Jbpm4Swimlane jbpm4Swimlane) throws SQLException, DbException {
	return this.jbpm4SwimlaneUpdate(jbpm4Swimlane, "");
}

/**
 * 更新一个对象Jbpm4Swimlane到数据库中
 * <param name="jbpm4Swimlane">需要更新的Jbpm4Swimlane</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int jbpm4SwimlaneUpdate(Jbpm4Swimlane jbpm4Swimlane, String appendConditionSql) throws SQLException, DbException {
	return Jbpm4Swimlane.update(this.getDataVisit(), jbpm4Swimlane, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Jbpm4Swimlane
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void jbpm4SwimlaneDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	Jbpm4Swimlane.deleteByDbid(this.getDataVisit(), ADbid, appendConditionSql);
}

/**
 * <param name="jbpm4Swimlane">从数据库中删除一个对象Jbpm4Swimlane</param>
 * <param name="ADbid"></param>
 */
protected void jbpm4SwimlaneDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4SwimlaneDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4Swimlane
 * <param name="AExecution"></param>
 */
protected void jbpm4SwimlaneDeleteListByExecution(Double AExecution) throws SQLException, DbException {
	Jbpm4Swimlane.deleteListByExecution(this.getDataVisit(), AExecution);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
protected Jbpm4Swimlane jbpm4SwimlaneSelectByDbid(double ADbid) throws SQLException, DbException {
	return Jbpm4Swimlane.selectByDbid(this.getDataVisit(), ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AExecution"></param>
 */
protected List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjectsByExecution(Double AExecution) throws SQLException, DbException {
	return Jbpm4Swimlane.selectObjectsByExecution(this.getDataVisit(), AExecution);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4Swimlane.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Jbpm4Swimlane.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4Swimlane.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Jbpm4Swimlane.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Jbpm4Swimlane> List<T> jbpm4SwimlaneSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4Swimlane.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Jbpm4Swimlane> List<T> jbpm4SwimlaneSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4Swimlane.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int jbpm4SwimlaneQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [JBPM4_SWIMLANE].* from [JBPM4_SWIMLANE]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Jbpm4Task到数据库中
 * <param name="jbpm4Task">需要插入的Jbpm4Task</param>
 */
protected void jbpm4TaskInsert(Jbpm4Task jbpm4Task) throws SQLException, DbException {
	Jbpm4Task.insert(this.getDataVisit(), jbpm4Task);
}

/**
 * 更新一个对象Jbpm4Task到数据库中
 * <param name="jbpm4Task">需要更新的Jbpm4Task</param>
 */
protected int jbpm4TaskUpdate(Jbpm4Task jbpm4Task) throws SQLException, DbException {
	return this.jbpm4TaskUpdate(jbpm4Task, "");
}

/**
 * 更新一个对象Jbpm4Task到数据库中
 * <param name="jbpm4Task">需要更新的Jbpm4Task</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int jbpm4TaskUpdate(Jbpm4Task jbpm4Task, String appendConditionSql) throws SQLException, DbException {
	return Jbpm4Task.update(this.getDataVisit(), jbpm4Task, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Jbpm4Task
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void jbpm4TaskDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	Jbpm4Task.deleteByDbid(this.getDataVisit(), ADbid, appendConditionSql);
}

/**
 * <param name="jbpm4Task">从数据库中删除一个对象Jbpm4Task</param>
 * <param name="ADbid"></param>
 */
protected void jbpm4TaskDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4TaskDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4Task
 * <param name="ASwimlane"></param>
 */
protected void jbpm4TaskDeleteListBySwimlane(Double ASwimlane) throws SQLException, DbException {
	Jbpm4Task.deleteListBySwimlane(this.getDataVisit(), ASwimlane);
}

/**
 * 从数据库中删除一批对象Jbpm4Task
 * <param name="ASupertask"></param>
 */
protected void jbpm4TaskDeleteListBySupertask(Double ASupertask) throws SQLException, DbException {
	Jbpm4Task.deleteListBySupertask(this.getDataVisit(), ASupertask);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
protected Jbpm4Task jbpm4TaskSelectByDbid(double ADbid) throws SQLException, DbException {
	return Jbpm4Task.selectByDbid(this.getDataVisit(), ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ASwimlane"></param>
 */
protected List<Jbpm4Task> jbpm4TaskSelectObjectsBySwimlane(Double ASwimlane) throws SQLException, DbException {
	return Jbpm4Task.selectObjectsBySwimlane(this.getDataVisit(), ASwimlane);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ASupertask"></param>
 */
protected List<Jbpm4Task> jbpm4TaskSelectObjectsBySupertask(Double ASupertask) throws SQLException, DbException {
	return Jbpm4Task.selectObjectsBySupertask(this.getDataVisit(), ASupertask);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4Task> jbpm4TaskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4Task.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Jbpm4Task> jbpm4TaskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Jbpm4Task.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4Task> jbpm4TaskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4Task.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Jbpm4Task> jbpm4TaskSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Jbpm4Task.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Jbpm4Task> List<T> jbpm4TaskSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4Task.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Jbpm4Task> List<T> jbpm4TaskSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4Task.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int jbpm4TaskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [JBPM4_TASK].* from [JBPM4_TASK]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Jbpm4Variable到数据库中
 * <param name="jbpm4Variable">需要插入的Jbpm4Variable</param>
 */
protected void jbpm4VariableInsert(Jbpm4Variable jbpm4Variable) throws SQLException, DbException {
	Jbpm4Variable.insert(this.getDataVisit(), jbpm4Variable);
}

/**
 * 更新一个对象Jbpm4Variable到数据库中
 * <param name="jbpm4Variable">需要更新的Jbpm4Variable</param>
 */
protected int jbpm4VariableUpdate(Jbpm4Variable jbpm4Variable) throws SQLException, DbException {
	return this.jbpm4VariableUpdate(jbpm4Variable, "");
}

/**
 * 更新一个对象Jbpm4Variable到数据库中
 * <param name="jbpm4Variable">需要更新的Jbpm4Variable</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int jbpm4VariableUpdate(Jbpm4Variable jbpm4Variable, String appendConditionSql) throws SQLException, DbException {
	return Jbpm4Variable.update(this.getDataVisit(), jbpm4Variable, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Jbpm4Variable
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void jbpm4VariableDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	Jbpm4Variable.deleteByDbid(this.getDataVisit(), ADbid, appendConditionSql);
}

/**
 * <param name="jbpm4Variable">从数据库中删除一个对象Jbpm4Variable</param>
 * <param name="ADbid"></param>
 */
protected void jbpm4VariableDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4VariableDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4Variable
 * <param name="AExesys"></param>
 */
protected void jbpm4VariableDeleteListByExesys(Double AExesys) throws SQLException, DbException {
	Jbpm4Variable.deleteListByExesys(this.getDataVisit(), AExesys);
}

/**
 * 从数据库中删除一批对象Jbpm4Variable
 * <param name="AExecution"></param>
 */
protected void jbpm4VariableDeleteListByExecution(Double AExecution) throws SQLException, DbException {
	Jbpm4Variable.deleteListByExecution(this.getDataVisit(), AExecution);
}

/**
 * 从数据库中删除一批对象Jbpm4Variable
 * <param name="ALob"></param>
 */
protected void jbpm4VariableDeleteListByLob(Double ALob) throws SQLException, DbException {
	Jbpm4Variable.deleteListByLob(this.getDataVisit(), ALob);
}

/**
 * 从数据库中删除一批对象Jbpm4Variable
 * <param name="ATask"></param>
 */
protected void jbpm4VariableDeleteListByTask(Double ATask) throws SQLException, DbException {
	Jbpm4Variable.deleteListByTask(this.getDataVisit(), ATask);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
protected Jbpm4Variable jbpm4VariableSelectByDbid(double ADbid) throws SQLException, DbException {
	return Jbpm4Variable.selectByDbid(this.getDataVisit(), ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AExesys"></param>
 */
protected List<Jbpm4Variable> jbpm4VariableSelectObjectsByExesys(Double AExesys) throws SQLException, DbException {
	return Jbpm4Variable.selectObjectsByExesys(this.getDataVisit(), AExesys);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AExecution"></param>
 */
protected List<Jbpm4Variable> jbpm4VariableSelectObjectsByExecution(Double AExecution) throws SQLException, DbException {
	return Jbpm4Variable.selectObjectsByExecution(this.getDataVisit(), AExecution);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ALob"></param>
 */
protected List<Jbpm4Variable> jbpm4VariableSelectObjectsByLob(Double ALob) throws SQLException, DbException {
	return Jbpm4Variable.selectObjectsByLob(this.getDataVisit(), ALob);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATask"></param>
 */
protected List<Jbpm4Variable> jbpm4VariableSelectObjectsByTask(Double ATask) throws SQLException, DbException {
	return Jbpm4Variable.selectObjectsByTask(this.getDataVisit(), ATask);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4Variable> jbpm4VariableSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4Variable.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Jbpm4Variable> jbpm4VariableSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Jbpm4Variable.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4Variable> jbpm4VariableSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4Variable.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Jbpm4Variable> jbpm4VariableSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Jbpm4Variable.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Jbpm4Variable> List<T> jbpm4VariableSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4Variable.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Jbpm4Variable> List<T> jbpm4VariableSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4Variable.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int jbpm4VariableQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [JBPM4_VARIABLE].* from [JBPM4_VARIABLE]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Project到数据库中
 * <param name="project">需要插入的Project</param>
 */
protected void projectInsert(Project project) throws SQLException, DbException {
	Project.insert(this.getDataVisit(), project);
}

/**
 * 更新一个对象Project到数据库中
 * <param name="project">需要更新的Project</param>
 */
protected int projectUpdate(Project project) throws SQLException, DbException {
	return this.projectUpdate(project, "");
}

/**
 * 更新一个对象Project到数据库中
 * <param name="project">需要更新的Project</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int projectUpdate(Project project, String appendConditionSql) throws SQLException, DbException {
	return Project.update(this.getDataVisit(), project, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Project
 * <param name="AProjId">工程号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void projectDeleteByProjId(int AProjId, String appendConditionSql) throws SQLException, DbException {
	Project.deleteByProjId(this.getDataVisit(), AProjId, appendConditionSql);
}

/**
 * <param name="project">从数据库中删除一个对象Project</param>
 * <param name="AProjId">工程号</param>
 */
protected void projectDeleteByProjId(int AProjId) throws SQLException, DbException {
	this.projectDeleteByProjId(AProjId, "");
}

/**
 * 从数据库中删除一批对象Project
 * <param name="AProjectManagerId">工程管理员号</param>
 */
protected void projectDeleteListByProjectManagerId(Integer AProjectManagerId) throws SQLException, DbException {
	Project.deleteListByProjectManagerId(this.getDataVisit(), AProjectManagerId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AProjId">工程号</param>
 */
protected Project projectSelectByProjId(int AProjId) throws SQLException, DbException {
	return Project.selectByProjId(this.getDataVisit(), AProjId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AProjectManagerId">工程管理员号</param>
 */
protected List<Project> projectSelectObjectsByProjectManagerId(Integer AProjectManagerId) throws SQLException, DbException {
	return Project.selectObjectsByProjectManagerId(this.getDataVisit(), AProjectManagerId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Project> projectSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Project.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Project> projectSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Project.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Project> projectSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Project.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Project> projectSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Project.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Project> List<T> projectSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Project.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Project> List<T> projectSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Project.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int projectQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_PROJECT].* from [T_PROJECT]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象ProjectJoinUser到数据库中
 * <param name="projectJoinUser">需要插入的ProjectJoinUser</param>
 */
protected void projectJoinUserInsert(ProjectJoinUser projectJoinUser) throws SQLException, DbException {
	ProjectJoinUser.insert(this.getDataVisit(), projectJoinUser);
}

/**
 * 更新一个对象ProjectJoinUser到数据库中
 * <param name="projectJoinUser">需要更新的ProjectJoinUser</param>
 */
protected int projectJoinUserUpdate(ProjectJoinUser projectJoinUser) throws SQLException, DbException {
	return this.projectJoinUserUpdate(projectJoinUser, "");
}

/**
 * 更新一个对象ProjectJoinUser到数据库中
 * <param name="projectJoinUser">需要更新的ProjectJoinUser</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int projectJoinUserUpdate(ProjectJoinUser projectJoinUser, String appendConditionSql) throws SQLException, DbException {
	return ProjectJoinUser.update(this.getDataVisit(), projectJoinUser, appendConditionSql);
}

/**
 * 从数据库中删除一个对象ProjectJoinUser
 * <param name="AProjectId">工程代号</param>
 * <param name="AUserId">用户代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void projectJoinUserDeleteByProjectIdUserId(int AProjectId, int AUserId, String appendConditionSql) throws SQLException, DbException {
	ProjectJoinUser.deleteByProjectIdUserId(this.getDataVisit(), AProjectId, AUserId, appendConditionSql);
}

/**
 * <param name="projectJoinUser">从数据库中删除一个对象ProjectJoinUser</param>
 * <param name="AProjectId">工程代号</param>
 * <param name="AUserId">用户代号</param>
 */
protected void projectJoinUserDeleteByProjectIdUserId(int AProjectId, int AUserId) throws SQLException, DbException {
	this.projectJoinUserDeleteByProjectIdUserId(AProjectId, AUserId, "");
}

/**
 * 从数据库中删除一批对象ProjectJoinUser
 * <param name="AProjectId">工程代号</param>
 */
protected void projectJoinUserDeleteListByProjectId(int AProjectId) throws SQLException, DbException {
	ProjectJoinUser.deleteListByProjectId(this.getDataVisit(), AProjectId);
}

/**
 * 从数据库中删除一批对象ProjectJoinUser
 * <param name="AUserId">用户代号</param>
 */
protected void projectJoinUserDeleteListByUserId(int AUserId) throws SQLException, DbException {
	ProjectJoinUser.deleteListByUserId(this.getDataVisit(), AUserId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AProjectId">工程代号</param>
 * <param name="AUserId">用户代号</param>
 */
protected ProjectJoinUser projectJoinUserSelectByProjectIdUserId(int AProjectId, int AUserId) throws SQLException, DbException {
	return ProjectJoinUser.selectByProjectIdUserId(this.getDataVisit(), AProjectId, AUserId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AProjectId">工程代号</param>
 */
protected List<ProjectJoinUser> projectJoinUserSelectObjectsByProjectId(int AProjectId) throws SQLException, DbException {
	return ProjectJoinUser.selectObjectsByProjectId(this.getDataVisit(), AProjectId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AUserId">用户代号</param>
 */
protected List<ProjectJoinUser> projectJoinUserSelectObjectsByUserId(int AUserId) throws SQLException, DbException {
	return ProjectJoinUser.selectObjectsByUserId(this.getDataVisit(), AUserId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<ProjectJoinUser> projectJoinUserSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return ProjectJoinUser.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<ProjectJoinUser> projectJoinUserSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return ProjectJoinUser.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<ProjectJoinUser> projectJoinUserSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return ProjectJoinUser.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<ProjectJoinUser> projectJoinUserSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return ProjectJoinUser.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends ProjectJoinUser> List<T> projectJoinUserSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return ProjectJoinUser.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends ProjectJoinUser> List<T> projectJoinUserSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return ProjectJoinUser.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int projectJoinUserQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_PROJECT_JOIN_USER].* from [T_PROJECT_JOIN_USER]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Role到数据库中
 * <param name="role">需要插入的Role</param>
 */
protected void roleInsert(Role role) throws SQLException, DbException {
	Role.insert(this.getDataVisit(), role);
}

/**
 * 更新一个对象Role到数据库中
 * <param name="role">需要更新的Role</param>
 */
protected int roleUpdate(Role role) throws SQLException, DbException {
	return this.roleUpdate(role, "");
}

/**
 * 更新一个对象Role到数据库中
 * <param name="role">需要更新的Role</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int roleUpdate(Role role, String appendConditionSql) throws SQLException, DbException {
	return Role.update(this.getDataVisit(), role, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Role
 * <param name="ARoleId">角色代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void roleDeleteByRoleId(int ARoleId, String appendConditionSql) throws SQLException, DbException {
	Role.deleteByRoleId(this.getDataVisit(), ARoleId, appendConditionSql);
}

/**
 * <param name="role">从数据库中删除一个对象Role</param>
 * <param name="ARoleId">角色代号</param>
 */
protected void roleDeleteByRoleId(int ARoleId) throws SQLException, DbException {
	this.roleDeleteByRoleId(ARoleId, "");
}

/**
 * 从数据库中删除一个对象Role
 * <param name="ARoleName">角色名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void roleDeleteByRoleName(String ARoleName, String appendConditionSql) throws SQLException, DbException {
	Role.deleteByRoleName(this.getDataVisit(), ARoleName, appendConditionSql);
}

/**
 * <param name="role">从数据库中删除一个对象Role</param>
 * <param name="ARoleName">角色名称</param>
 */
protected void roleDeleteByRoleName(String ARoleName) throws SQLException, DbException {
	this.roleDeleteByRoleName(ARoleName, "");
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ARoleId">角色代号</param>
 */
protected Role roleSelectByRoleId(int ARoleId) throws SQLException, DbException {
	return Role.selectByRoleId(this.getDataVisit(), ARoleId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ARoleName">角色名称</param>
 */
protected Role roleSelectByRoleName(String ARoleName) throws SQLException, DbException {
	return Role.selectByRoleName(this.getDataVisit(), ARoleName);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Role> roleSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Role.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Role> roleSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Role.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Role> roleSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Role.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Role> roleSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Role.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Role> List<T> roleSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Role.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Role> List<T> roleSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Role.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int roleQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_ROLE].* from [T_ROLE]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象TaskPreviousTask到数据库中
 * <param name="taskPreviousTask">需要插入的TaskPreviousTask</param>
 */
protected void taskPreviousTaskInsert(TaskPreviousTask taskPreviousTask) throws SQLException, DbException {
	TaskPreviousTask.insert(this.getDataVisit(), taskPreviousTask);
}

/**
 * 更新一个对象TaskPreviousTask到数据库中
 * <param name="taskPreviousTask">需要更新的TaskPreviousTask</param>
 */
protected int taskPreviousTaskUpdate(TaskPreviousTask taskPreviousTask) throws SQLException, DbException {
	return this.taskPreviousTaskUpdate(taskPreviousTask, "");
}

/**
 * 更新一个对象TaskPreviousTask到数据库中
 * <param name="taskPreviousTask">需要更新的TaskPreviousTask</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int taskPreviousTaskUpdate(TaskPreviousTask taskPreviousTask, String appendConditionSql) throws SQLException, DbException {
	return TaskPreviousTask.update(this.getDataVisit(), taskPreviousTask, appendConditionSql);
}

/**
 * 从数据库中删除一个对象TaskPreviousTask
 * <param name="ATaskId">任务代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void taskPreviousTaskDeleteByTaskId(int ATaskId, String appendConditionSql) throws SQLException, DbException {
	TaskPreviousTask.deleteByTaskId(this.getDataVisit(), ATaskId, appendConditionSql);
}

/**
 * <param name="taskPreviousTask">从数据库中删除一个对象TaskPreviousTask</param>
 * <param name="ATaskId">任务代号</param>
 */
protected void taskPreviousTaskDeleteByTaskId(int ATaskId) throws SQLException, DbException {
	this.taskPreviousTaskDeleteByTaskId(ATaskId, "");
}

/**
 * 从数据库中删除一批对象TaskPreviousTask
 * <param name="APreviousTaskId">前驱任务代号</param>
 */
protected void taskPreviousTaskDeleteListByPreviousTaskId(int APreviousTaskId) throws SQLException, DbException {
	TaskPreviousTask.deleteListByPreviousTaskId(this.getDataVisit(), APreviousTaskId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATaskId">任务代号</param>
 */
protected TaskPreviousTask taskPreviousTaskSelectByTaskId(int ATaskId) throws SQLException, DbException {
	return TaskPreviousTask.selectByTaskId(this.getDataVisit(), ATaskId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskId">任务代号</param>
 */
protected List<TaskPreviousTask> taskPreviousTaskSelectObjectsByTaskId(int ATaskId) throws SQLException, DbException {
	return TaskPreviousTask.selectObjectsByTaskId(this.getDataVisit(), ATaskId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="APreviousTaskId">前驱任务代号</param>
 */
protected List<TaskPreviousTask> taskPreviousTaskSelectObjectsByPreviousTaskId(int APreviousTaskId) throws SQLException, DbException {
	return TaskPreviousTask.selectObjectsByPreviousTaskId(this.getDataVisit(), APreviousTaskId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<TaskPreviousTask> taskPreviousTaskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return TaskPreviousTask.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<TaskPreviousTask> taskPreviousTaskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return TaskPreviousTask.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<TaskPreviousTask> taskPreviousTaskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return TaskPreviousTask.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<TaskPreviousTask> taskPreviousTaskSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return TaskPreviousTask.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends TaskPreviousTask> List<T> taskPreviousTaskSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return TaskPreviousTask.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends TaskPreviousTask> List<T> taskPreviousTaskSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return TaskPreviousTask.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int taskPreviousTaskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_TASK_PREVIOUS_TASK].* from [T_TASK_PREVIOUS_TASK]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象User到数据库中
 * <param name="user">需要插入的User</param>
 */
protected void userInsert(User user) throws SQLException, DbException {
	User.insert(this.getDataVisit(), user);
}

/**
 * 更新一个对象User到数据库中
 * <param name="user">需要更新的User</param>
 */
protected int userUpdate(User user) throws SQLException, DbException {
	return this.userUpdate(user, "");
}

/**
 * 更新一个对象User到数据库中
 * <param name="user">需要更新的User</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int userUpdate(User user, String appendConditionSql) throws SQLException, DbException {
	return User.update(this.getDataVisit(), user, appendConditionSql);
}

/**
 * 从数据库中删除一个对象User
 * <param name="AUserId">用户代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void userDeleteByUserId(int AUserId, String appendConditionSql) throws SQLException, DbException {
	User.deleteByUserId(this.getDataVisit(), AUserId, appendConditionSql);
}

/**
 * <param name="user">从数据库中删除一个对象User</param>
 * <param name="AUserId">用户代号</param>
 */
protected void userDeleteByUserId(int AUserId) throws SQLException, DbException {
	this.userDeleteByUserId(AUserId, "");
}

/**
 * 从数据库中删除一个对象User
 * <param name="ALoginName">登陆名</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void userDeleteByLoginName(String ALoginName, String appendConditionSql) throws SQLException, DbException {
	User.deleteByLoginName(this.getDataVisit(), ALoginName, appendConditionSql);
}

/**
 * <param name="user">从数据库中删除一个对象User</param>
 * <param name="ALoginName">登陆名</param>
 */
protected void userDeleteByLoginName(String ALoginName) throws SQLException, DbException {
	this.userDeleteByLoginName(ALoginName, "");
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AUserId">用户代号</param>
 */
protected User userSelectByUserId(int AUserId) throws SQLException, DbException {
	return User.selectByUserId(this.getDataVisit(), AUserId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ALoginName">登陆名</param>
 */
protected User userSelectByLoginName(String ALoginName) throws SQLException, DbException {
	return User.selectByLoginName(this.getDataVisit(), ALoginName);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<User> userSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return User.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<User> userSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return User.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<User> userSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return User.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<User> userSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return User.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends User> List<T> userSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return User.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends User> List<T> userSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return User.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int userQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_USER].* from [T_USER]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Identity到数据库中
 * <param name="identity">需要插入的Identity</param>
 */
protected void identityInsert(Identity identity) throws SQLException, DbException {
	Identity.insert(this.getDataVisit(), identity);
}

/**
 * 更新一个对象Identity到数据库中
 * <param name="identity">需要更新的Identity</param>
 */
protected int identityUpdate(Identity identity) throws SQLException, DbException {
	return this.identityUpdate(identity, "");
}

/**
 * 更新一个对象Identity到数据库中
 * <param name="identity">需要更新的Identity</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int identityUpdate(Identity identity, String appendConditionSql) throws SQLException, DbException {
	return Identity.update(this.getDataVisit(), identity, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Identity
 * <param name="ATabName"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void identityDeleteByTabName(String ATabName, String appendConditionSql) throws SQLException, DbException {
	Identity.deleteByTabName(this.getDataVisit(), ATabName, appendConditionSql);
}

/**
 * <param name="identity">从数据库中删除一个对象Identity</param>
 * <param name="ATabName"></param>
 */
protected void identityDeleteByTabName(String ATabName) throws SQLException, DbException {
	this.identityDeleteByTabName(ATabName, "");
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATabName"></param>
 */
protected Identity identitySelectByTabName(String ATabName) throws SQLException, DbException {
	return Identity.selectByTabName(this.getDataVisit(), ATabName);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Identity> identitySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Identity.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Identity> identitySelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Identity.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Identity> identitySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Identity.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Identity> identitySelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Identity.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Identity> List<T> identitySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Identity.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Identity> List<T> identitySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Identity.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int identityQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_IDENTITY].* from [T_IDENTITY]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象WorkLog到数据库中
 * <param name="workLog">需要插入的WorkLog</param>
 */
protected void workLogInsert(WorkLog workLog) throws SQLException, DbException {
	WorkLog.insert(this.getDataVisit(), workLog);
}

/**
 * 更新一个对象WorkLog到数据库中
 * <param name="workLog">需要更新的WorkLog</param>
 */
protected int workLogUpdate(WorkLog workLog) throws SQLException, DbException {
	return this.workLogUpdate(workLog, "");
}

/**
 * 更新一个对象WorkLog到数据库中
 * <param name="workLog">需要更新的WorkLog</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int workLogUpdate(WorkLog workLog, String appendConditionSql) throws SQLException, DbException {
	return WorkLog.update(this.getDataVisit(), workLog, appendConditionSql);
}

/**
 * 从数据库中删除一个对象WorkLog
 * <param name="AWorkLogId">工作日志代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void workLogDeleteByWorkLogId(int AWorkLogId, String appendConditionSql) throws SQLException, DbException {
	WorkLog.deleteByWorkLogId(this.getDataVisit(), AWorkLogId, appendConditionSql);
}

/**
 * <param name="workLog">从数据库中删除一个对象WorkLog</param>
 * <param name="AWorkLogId">工作日志代号</param>
 */
protected void workLogDeleteByWorkLogId(int AWorkLogId) throws SQLException, DbException {
	this.workLogDeleteByWorkLogId(AWorkLogId, "");
}

/**
 * 从数据库中删除一批对象WorkLog
 * <param name="AWorkUserId">职工号</param>
 */
protected void workLogDeleteListByWorkUserId(int AWorkUserId) throws SQLException, DbException {
	WorkLog.deleteListByWorkUserId(this.getDataVisit(), AWorkUserId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AWorkLogId">工作日志代号</param>
 */
protected WorkLog workLogSelectByWorkLogId(int AWorkLogId) throws SQLException, DbException {
	return WorkLog.selectByWorkLogId(this.getDataVisit(), AWorkLogId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AWorkUserId">职工号</param>
 */
protected List<WorkLog> workLogSelectObjectsByWorkUserId(int AWorkUserId) throws SQLException, DbException {
	return WorkLog.selectObjectsByWorkUserId(this.getDataVisit(), AWorkUserId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<WorkLog> workLogSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return WorkLog.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<WorkLog> workLogSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return WorkLog.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<WorkLog> workLogSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return WorkLog.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<WorkLog> workLogSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return WorkLog.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends WorkLog> List<T> workLogSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return WorkLog.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends WorkLog> List<T> workLogSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return WorkLog.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int workLogQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_WORK_LOG].* from [T_WORK_LOG]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象WorkLogRelationshipTask到数据库中
 * <param name="workLogRelationshipTask">需要插入的WorkLogRelationshipTask</param>
 */
protected void workLogRelationshipTaskInsert(WorkLogRelationshipTask workLogRelationshipTask) throws SQLException, DbException {
	WorkLogRelationshipTask.insert(this.getDataVisit(), workLogRelationshipTask);
}

/**
 * 更新一个对象WorkLogRelationshipTask到数据库中
 * <param name="workLogRelationshipTask">需要更新的WorkLogRelationshipTask</param>
 */
protected int workLogRelationshipTaskUpdate(WorkLogRelationshipTask workLogRelationshipTask) throws SQLException, DbException {
	return this.workLogRelationshipTaskUpdate(workLogRelationshipTask, "");
}

/**
 * 更新一个对象WorkLogRelationshipTask到数据库中
 * <param name="workLogRelationshipTask">需要更新的WorkLogRelationshipTask</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int workLogRelationshipTaskUpdate(WorkLogRelationshipTask workLogRelationshipTask, String appendConditionSql) throws SQLException, DbException {
	return WorkLogRelationshipTask.update(this.getDataVisit(), workLogRelationshipTask, appendConditionSql);
}

/**
 * 从数据库中删除一个对象WorkLogRelationshipTask
 * <param name="AWorkLogId">工作日志代号</param>
 * <param name="ATaskId">任务代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void workLogRelationshipTaskDeleteByWorkLogIdTaskId(int AWorkLogId, int ATaskId, String appendConditionSql) throws SQLException, DbException {
	WorkLogRelationshipTask.deleteByWorkLogIdTaskId(this.getDataVisit(), AWorkLogId, ATaskId, appendConditionSql);
}

/**
 * <param name="workLogRelationshipTask">从数据库中删除一个对象WorkLogRelationshipTask</param>
 * <param name="AWorkLogId">工作日志代号</param>
 * <param name="ATaskId">任务代号</param>
 */
protected void workLogRelationshipTaskDeleteByWorkLogIdTaskId(int AWorkLogId, int ATaskId) throws SQLException, DbException {
	this.workLogRelationshipTaskDeleteByWorkLogIdTaskId(AWorkLogId, ATaskId, "");
}

/**
 * 从数据库中删除一批对象WorkLogRelationshipTask
 * <param name="ATaskId">任务代号</param>
 */
protected void workLogRelationshipTaskDeleteListByTaskId(int ATaskId) throws SQLException, DbException {
	WorkLogRelationshipTask.deleteListByTaskId(this.getDataVisit(), ATaskId);
}

/**
 * 从数据库中删除一批对象WorkLogRelationshipTask
 * <param name="AWorkLogId">工作日志代号</param>
 */
protected void workLogRelationshipTaskDeleteListByWorkLogId(int AWorkLogId) throws SQLException, DbException {
	WorkLogRelationshipTask.deleteListByWorkLogId(this.getDataVisit(), AWorkLogId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AWorkLogId">工作日志代号</param>
 * <param name="ATaskId">任务代号</param>
 */
protected WorkLogRelationshipTask workLogRelationshipTaskSelectByWorkLogIdTaskId(int AWorkLogId, int ATaskId) throws SQLException, DbException {
	return WorkLogRelationshipTask.selectByWorkLogIdTaskId(this.getDataVisit(), AWorkLogId, ATaskId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskId">任务代号</param>
 */
protected List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjectsByTaskId(int ATaskId) throws SQLException, DbException {
	return WorkLogRelationshipTask.selectObjectsByTaskId(this.getDataVisit(), ATaskId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AWorkLogId">工作日志代号</param>
 */
protected List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjectsByWorkLogId(int AWorkLogId) throws SQLException, DbException {
	return WorkLogRelationshipTask.selectObjectsByWorkLogId(this.getDataVisit(), AWorkLogId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return WorkLogRelationshipTask.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return WorkLogRelationshipTask.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return WorkLogRelationshipTask.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return WorkLogRelationshipTask.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends WorkLogRelationshipTask> List<T> workLogRelationshipTaskSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return WorkLogRelationshipTask.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends WorkLogRelationshipTask> List<T> workLogRelationshipTaskSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return WorkLogRelationshipTask.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int workLogRelationshipTaskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_WORK_LOG_RELATIONSHIP_TASK].* from [T_WORK_LOG_RELATIONSHIP_TASK]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象WorkFlow到数据库中
 * <param name="workFlow">需要插入的WorkFlow</param>
 */
protected void workFlowInsert(WorkFlow workFlow) throws SQLException, DbException {
	WorkFlow.insert(this.getDataVisit(), workFlow);
}

/**
 * 更新一个对象WorkFlow到数据库中
 * <param name="workFlow">需要更新的WorkFlow</param>
 */
protected int workFlowUpdate(WorkFlow workFlow) throws SQLException, DbException {
	return this.workFlowUpdate(workFlow, "");
}

/**
 * 更新一个对象WorkFlow到数据库中
 * <param name="workFlow">需要更新的WorkFlow</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int workFlowUpdate(WorkFlow workFlow, String appendConditionSql) throws SQLException, DbException {
	return WorkFlow.update(this.getDataVisit(), workFlow, appendConditionSql);
}

/**
 * 从数据库中删除一个对象WorkFlow
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void workFlowDeleteByWorkFlowId(String AWorkFlowId, String appendConditionSql) throws SQLException, DbException {
	WorkFlow.deleteByWorkFlowId(this.getDataVisit(), AWorkFlowId, appendConditionSql);
}

/**
 * <param name="workFlow">从数据库中删除一个对象WorkFlow</param>
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
protected void workFlowDeleteByWorkFlowId(String AWorkFlowId) throws SQLException, DbException {
	this.workFlowDeleteByWorkFlowId(AWorkFlowId, "");
}

/**
 * 从数据库中删除一批对象WorkFlow
 * <param name="ACreator">创建人</param>
 */
protected void workFlowDeleteListByCreator(int ACreator) throws SQLException, DbException {
	WorkFlow.deleteListByCreator(this.getDataVisit(), ACreator);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
protected WorkFlow workFlowSelectByWorkFlowId(String AWorkFlowId) throws SQLException, DbException {
	return WorkFlow.selectByWorkFlowId(this.getDataVisit(), AWorkFlowId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ACreator">创建人</param>
 */
protected List<WorkFlow> workFlowSelectObjectsByCreator(int ACreator) throws SQLException, DbException {
	return WorkFlow.selectObjectsByCreator(this.getDataVisit(), ACreator);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<WorkFlow> workFlowSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return WorkFlow.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<WorkFlow> workFlowSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return WorkFlow.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<WorkFlow> workFlowSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return WorkFlow.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<WorkFlow> workFlowSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return WorkFlow.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends WorkFlow> List<T> workFlowSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return WorkFlow.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends WorkFlow> List<T> workFlowSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return WorkFlow.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int workFlowQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_WORK_FLOW].* from [T_WORK_FLOW]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象WorkFlowMemo到数据库中
 * <param name="workFlowMemo">需要插入的WorkFlowMemo</param>
 */
protected void workFlowMemoInsert(WorkFlowMemo workFlowMemo) throws SQLException, DbException {
	WorkFlowMemo.insert(this.getDataVisit(), workFlowMemo);
}

/**
 * 更新一个对象WorkFlowMemo到数据库中
 * <param name="workFlowMemo">需要更新的WorkFlowMemo</param>
 */
protected int workFlowMemoUpdate(WorkFlowMemo workFlowMemo) throws SQLException, DbException {
	return this.workFlowMemoUpdate(workFlowMemo, "");
}

/**
 * 更新一个对象WorkFlowMemo到数据库中
 * <param name="workFlowMemo">需要更新的WorkFlowMemo</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int workFlowMemoUpdate(WorkFlowMemo workFlowMemo, String appendConditionSql) throws SQLException, DbException {
	return WorkFlowMemo.update(this.getDataVisit(), workFlowMemo, appendConditionSql);
}

/**
 * 从数据库中删除一个对象WorkFlowMemo
 * <param name="AWorkFlowMemoId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void workFlowMemoDeleteByWorkFlowMemoId(int AWorkFlowMemoId, String appendConditionSql) throws SQLException, DbException {
	WorkFlowMemo.deleteByWorkFlowMemoId(this.getDataVisit(), AWorkFlowMemoId, appendConditionSql);
}

/**
 * <param name="workFlowMemo">从数据库中删除一个对象WorkFlowMemo</param>
 * <param name="AWorkFlowMemoId">标识</param>
 */
protected void workFlowMemoDeleteByWorkFlowMemoId(int AWorkFlowMemoId) throws SQLException, DbException {
	this.workFlowMemoDeleteByWorkFlowMemoId(AWorkFlowMemoId, "");
}

/**
 * 从数据库中删除一批对象WorkFlowMemo
 * <param name="AMemoUserId">用户代号</param>
 */
protected void workFlowMemoDeleteListByMemoUserId(int AMemoUserId) throws SQLException, DbException {
	WorkFlowMemo.deleteListByMemoUserId(this.getDataVisit(), AMemoUserId);
}

/**
 * 从数据库中删除一批对象WorkFlowMemo
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
protected void workFlowMemoDeleteListByWorkFlowId(String AWorkFlowId) throws SQLException, DbException {
	WorkFlowMemo.deleteListByWorkFlowId(this.getDataVisit(), AWorkFlowId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AWorkFlowMemoId">标识</param>
 */
protected WorkFlowMemo workFlowMemoSelectByWorkFlowMemoId(int AWorkFlowMemoId) throws SQLException, DbException {
	return WorkFlowMemo.selectByWorkFlowMemoId(this.getDataVisit(), AWorkFlowMemoId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AMemoUserId">用户代号</param>
 */
protected List<WorkFlowMemo> workFlowMemoSelectObjectsByMemoUserId(int AMemoUserId) throws SQLException, DbException {
	return WorkFlowMemo.selectObjectsByMemoUserId(this.getDataVisit(), AMemoUserId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
protected List<WorkFlowMemo> workFlowMemoSelectObjectsByWorkFlowId(String AWorkFlowId) throws SQLException, DbException {
	return WorkFlowMemo.selectObjectsByWorkFlowId(this.getDataVisit(), AWorkFlowId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<WorkFlowMemo> workFlowMemoSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return WorkFlowMemo.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<WorkFlowMemo> workFlowMemoSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return WorkFlowMemo.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<WorkFlowMemo> workFlowMemoSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return WorkFlowMemo.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<WorkFlowMemo> workFlowMemoSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return WorkFlowMemo.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends WorkFlowMemo> List<T> workFlowMemoSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return WorkFlowMemo.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends WorkFlowMemo> List<T> workFlowMemoSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return WorkFlowMemo.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int workFlowMemoQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [WORK_FLOW_MEMO].* from [WORK_FLOW_MEMO]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象IssueUsers到数据库中
 * <param name="issueUsers">需要插入的IssueUsers</param>
 */
protected void issueUsersInsert(IssueUsers issueUsers) throws SQLException, DbException {
	IssueUsers.insert(this.getDataVisit(), issueUsers);
}

/**
 * 更新一个对象IssueUsers到数据库中
 * <param name="issueUsers">需要更新的IssueUsers</param>
 */
protected int issueUsersUpdate(IssueUsers issueUsers) throws SQLException, DbException {
	return this.issueUsersUpdate(issueUsers, "");
}

/**
 * 更新一个对象IssueUsers到数据库中
 * <param name="issueUsers">需要更新的IssueUsers</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int issueUsersUpdate(IssueUsers issueUsers, String appendConditionSql) throws SQLException, DbException {
	return IssueUsers.update(this.getDataVisit(), issueUsers, appendConditionSql);
}

/**
 * 从数据库中删除一个对象IssueUsers
 * <param name="AIssueUserId">用户标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void issueUsersDeleteByIssueUserId(int AIssueUserId, String appendConditionSql) throws SQLException, DbException {
	IssueUsers.deleteByIssueUserId(this.getDataVisit(), AIssueUserId, appendConditionSql);
}

/**
 * <param name="issueUsers">从数据库中删除一个对象IssueUsers</param>
 * <param name="AIssueUserId">用户标识</param>
 */
protected void issueUsersDeleteByIssueUserId(int AIssueUserId) throws SQLException, DbException {
	this.issueUsersDeleteByIssueUserId(AIssueUserId, "");
}

/**
 * 从数据库中删除一个对象IssueUsers
 * <param name="ALoginName">登录名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void issueUsersDeleteByLoginName(String ALoginName, String appendConditionSql) throws SQLException, DbException {
	IssueUsers.deleteByLoginName(this.getDataVisit(), ALoginName, appendConditionSql);
}

/**
 * <param name="issueUsers">从数据库中删除一个对象IssueUsers</param>
 * <param name="ALoginName">登录名称</param>
 */
protected void issueUsersDeleteByLoginName(String ALoginName) throws SQLException, DbException {
	this.issueUsersDeleteByLoginName(ALoginName, "");
}

/**
 * 从数据库中删除一批对象IssueUsers
 * <param name="AInnerUserId">关联到内部的ID</param>
 */
protected void issueUsersDeleteListByInnerUserId(Integer AInnerUserId) throws SQLException, DbException {
	IssueUsers.deleteListByInnerUserId(this.getDataVisit(), AInnerUserId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueUserId">用户标识</param>
 */
protected IssueUsers issueUsersSelectByIssueUserId(int AIssueUserId) throws SQLException, DbException {
	return IssueUsers.selectByIssueUserId(this.getDataVisit(), AIssueUserId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ALoginName">登录名称</param>
 */
protected IssueUsers issueUsersSelectByLoginName(String ALoginName) throws SQLException, DbException {
	return IssueUsers.selectByLoginName(this.getDataVisit(), ALoginName);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AInnerUserId">关联到内部的ID</param>
 */
protected List<IssueUsers> issueUsersSelectObjectsByInnerUserId(Integer AInnerUserId) throws SQLException, DbException {
	return IssueUsers.selectObjectsByInnerUserId(this.getDataVisit(), AInnerUserId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueUsers> issueUsersSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueUsers.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<IssueUsers> issueUsersSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return IssueUsers.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueUsers> issueUsersSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueUsers.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<IssueUsers> issueUsersSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return IssueUsers.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends IssueUsers> List<T> issueUsersSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueUsers.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends IssueUsers> List<T> issueUsersSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueUsers.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int issueUsersQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_ISSUE_USERS].* from [T_ISSUE_USERS]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象DepartMent到数据库中
 * <param name="departMent">需要插入的DepartMent</param>
 */
protected void departMentInsert(DepartMent departMent) throws SQLException, DbException {
	DepartMent.insert(this.getDataVisit(), departMent);
}

/**
 * 更新一个对象DepartMent到数据库中
 * <param name="departMent">需要更新的DepartMent</param>
 */
protected int departMentUpdate(DepartMent departMent) throws SQLException, DbException {
	return this.departMentUpdate(departMent, "");
}

/**
 * 更新一个对象DepartMent到数据库中
 * <param name="departMent">需要更新的DepartMent</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int departMentUpdate(DepartMent departMent, String appendConditionSql) throws SQLException, DbException {
	return DepartMent.update(this.getDataVisit(), departMent, appendConditionSql);
}

/**
 * 从数据库中删除一个对象DepartMent
 * <param name="ADepartMentId">部门ID</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void departMentDeleteByDepartMentId(int ADepartMentId, String appendConditionSql) throws SQLException, DbException {
	DepartMent.deleteByDepartMentId(this.getDataVisit(), ADepartMentId, appendConditionSql);
}

/**
 * <param name="departMent">从数据库中删除一个对象DepartMent</param>
 * <param name="ADepartMentId">部门ID</param>
 */
protected void departMentDeleteByDepartMentId(int ADepartMentId) throws SQLException, DbException {
	this.departMentDeleteByDepartMentId(ADepartMentId, "");
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADepartMentId">部门ID</param>
 */
protected DepartMent departMentSelectByDepartMentId(int ADepartMentId) throws SQLException, DbException {
	return DepartMent.selectByDepartMentId(this.getDataVisit(), ADepartMentId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<DepartMent> departMentSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return DepartMent.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<DepartMent> departMentSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return DepartMent.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<DepartMent> departMentSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return DepartMent.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<DepartMent> departMentSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return DepartMent.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends DepartMent> List<T> departMentSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return DepartMent.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends DepartMent> List<T> departMentSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return DepartMent.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int departMentQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_DEPART_MENT].* from [T_DEPART_MENT]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象IssueProject到数据库中
 * <param name="issueProject">需要插入的IssueProject</param>
 */
protected void issueProjectInsert(IssueProject issueProject) throws SQLException, DbException {
	IssueProject.insert(this.getDataVisit(), issueProject);
}

/**
 * 更新一个对象IssueProject到数据库中
 * <param name="issueProject">需要更新的IssueProject</param>
 */
protected int issueProjectUpdate(IssueProject issueProject) throws SQLException, DbException {
	return this.issueProjectUpdate(issueProject, "");
}

/**
 * 更新一个对象IssueProject到数据库中
 * <param name="issueProject">需要更新的IssueProject</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int issueProjectUpdate(IssueProject issueProject, String appendConditionSql) throws SQLException, DbException {
	return IssueProject.update(this.getDataVisit(), issueProject, appendConditionSql);
}

/**
 * 从数据库中删除一个对象IssueProject
 * <param name="AIssueProjectId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void issueProjectDeleteByIssueProjectId(int AIssueProjectId, String appendConditionSql) throws SQLException, DbException {
	IssueProject.deleteByIssueProjectId(this.getDataVisit(), AIssueProjectId, appendConditionSql);
}

/**
 * <param name="issueProject">从数据库中删除一个对象IssueProject</param>
 * <param name="AIssueProjectId">标识</param>
 */
protected void issueProjectDeleteByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	this.issueProjectDeleteByIssueProjectId(AIssueProjectId, "");
}

/**
 * 从数据库中删除一个对象IssueProject
 * <param name="AIssueProjectName">项目名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void issueProjectDeleteByIssueProjectName(String AIssueProjectName, String appendConditionSql) throws SQLException, DbException {
	IssueProject.deleteByIssueProjectName(this.getDataVisit(), AIssueProjectName, appendConditionSql);
}

/**
 * <param name="issueProject">从数据库中删除一个对象IssueProject</param>
 * <param name="AIssueProjectName">项目名称</param>
 */
protected void issueProjectDeleteByIssueProjectName(String AIssueProjectName) throws SQLException, DbException {
	this.issueProjectDeleteByIssueProjectName(AIssueProjectName, "");
}

/**
 * 从数据库中删除一批对象IssueProject
 * <param name="ADefaultUserId">默认处理用户</param>
 */
protected void issueProjectDeleteListByDefaultUserId(int ADefaultUserId) throws SQLException, DbException {
	IssueProject.deleteListByDefaultUserId(this.getDataVisit(), ADefaultUserId);
}

/**
 * 从数据库中删除一批对象IssueProject
 * <param name="AInnerProjId">内部工程ID</param>
 */
protected void issueProjectDeleteListByInnerProjId(Integer AInnerProjId) throws SQLException, DbException {
	IssueProject.deleteListByInnerProjId(this.getDataVisit(), AInnerProjId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectId">标识</param>
 */
protected IssueProject issueProjectSelectByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	return IssueProject.selectByIssueProjectId(this.getDataVisit(), AIssueProjectId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectName">项目名称</param>
 */
protected IssueProject issueProjectSelectByIssueProjectName(String AIssueProjectName) throws SQLException, DbException {
	return IssueProject.selectByIssueProjectName(this.getDataVisit(), AIssueProjectName);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ADefaultUserId">默认处理用户</param>
 */
protected List<IssueProject> issueProjectSelectObjectsByDefaultUserId(int ADefaultUserId) throws SQLException, DbException {
	return IssueProject.selectObjectsByDefaultUserId(this.getDataVisit(), ADefaultUserId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AInnerProjId">内部工程ID</param>
 */
protected List<IssueProject> issueProjectSelectObjectsByInnerProjId(Integer AInnerProjId) throws SQLException, DbException {
	return IssueProject.selectObjectsByInnerProjId(this.getDataVisit(), AInnerProjId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueProject> issueProjectSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueProject.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<IssueProject> issueProjectSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return IssueProject.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueProject> issueProjectSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueProject.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<IssueProject> issueProjectSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return IssueProject.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends IssueProject> List<T> issueProjectSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueProject.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends IssueProject> List<T> issueProjectSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueProject.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int issueProjectQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_ISSUE_PROJECT].* from [T_ISSUE_PROJECT]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象DepartMentUser到数据库中
 * <param name="departMentUser">需要插入的DepartMentUser</param>
 */
protected void departMentUserInsert(DepartMentUser departMentUser) throws SQLException, DbException {
	DepartMentUser.insert(this.getDataVisit(), departMentUser);
}

/**
 * 更新一个对象DepartMentUser到数据库中
 * <param name="departMentUser">需要更新的DepartMentUser</param>
 */
protected int departMentUserUpdate(DepartMentUser departMentUser) throws SQLException, DbException {
	return this.departMentUserUpdate(departMentUser, "");
}

/**
 * 更新一个对象DepartMentUser到数据库中
 * <param name="departMentUser">需要更新的DepartMentUser</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int departMentUserUpdate(DepartMentUser departMentUser, String appendConditionSql) throws SQLException, DbException {
	return DepartMentUser.update(this.getDataVisit(), departMentUser, appendConditionSql);
}

/**
 * 从数据库中删除一个对象DepartMentUser
 * <param name="ADepartMentId">部门ID</param>
 * <param name="AUserId">用户代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void departMentUserDeleteByDepartMentIdUserId(int ADepartMentId, int AUserId, String appendConditionSql) throws SQLException, DbException {
	DepartMentUser.deleteByDepartMentIdUserId(this.getDataVisit(), ADepartMentId, AUserId, appendConditionSql);
}

/**
 * <param name="departMentUser">从数据库中删除一个对象DepartMentUser</param>
 * <param name="ADepartMentId">部门ID</param>
 * <param name="AUserId">用户代号</param>
 */
protected void departMentUserDeleteByDepartMentIdUserId(int ADepartMentId, int AUserId) throws SQLException, DbException {
	this.departMentUserDeleteByDepartMentIdUserId(ADepartMentId, AUserId, "");
}

/**
 * 从数据库中删除一批对象DepartMentUser
 * <param name="ADepartMentId">部门ID</param>
 */
protected void departMentUserDeleteListByDepartMentId(int ADepartMentId) throws SQLException, DbException {
	DepartMentUser.deleteListByDepartMentId(this.getDataVisit(), ADepartMentId);
}

/**
 * 从数据库中删除一批对象DepartMentUser
 * <param name="AUserId">用户代号</param>
 */
protected void departMentUserDeleteListByUserId(int AUserId) throws SQLException, DbException {
	DepartMentUser.deleteListByUserId(this.getDataVisit(), AUserId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADepartMentId">部门ID</param>
 * <param name="AUserId">用户代号</param>
 */
protected DepartMentUser departMentUserSelectByDepartMentIdUserId(int ADepartMentId, int AUserId) throws SQLException, DbException {
	return DepartMentUser.selectByDepartMentIdUserId(this.getDataVisit(), ADepartMentId, AUserId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ADepartMentId">部门ID</param>
 */
protected List<DepartMentUser> departMentUserSelectObjectsByDepartMentId(int ADepartMentId) throws SQLException, DbException {
	return DepartMentUser.selectObjectsByDepartMentId(this.getDataVisit(), ADepartMentId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AUserId">用户代号</param>
 */
protected List<DepartMentUser> departMentUserSelectObjectsByUserId(int AUserId) throws SQLException, DbException {
	return DepartMentUser.selectObjectsByUserId(this.getDataVisit(), AUserId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<DepartMentUser> departMentUserSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return DepartMentUser.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<DepartMentUser> departMentUserSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return DepartMentUser.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<DepartMentUser> departMentUserSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return DepartMentUser.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<DepartMentUser> departMentUserSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return DepartMentUser.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends DepartMentUser> List<T> departMentUserSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return DepartMentUser.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends DepartMentUser> List<T> departMentUserSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return DepartMentUser.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int departMentUserQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_DEPART_MENT_USER].* from [T_DEPART_MENT_USER]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Leave到数据库中
 * <param name="leave">需要插入的Leave</param>
 */
protected void leaveInsert(Leave leave) throws SQLException, DbException {
	Leave.insert(this.getDataVisit(), leave);
}

/**
 * 更新一个对象Leave到数据库中
 * <param name="leave">需要更新的Leave</param>
 */
protected int leaveUpdate(Leave leave) throws SQLException, DbException {
	return this.leaveUpdate(leave, "");
}

/**
 * 更新一个对象Leave到数据库中
 * <param name="leave">需要更新的Leave</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int leaveUpdate(Leave leave, String appendConditionSql) throws SQLException, DbException {
	return Leave.update(this.getDataVisit(), leave, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Leave
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void leaveDeleteByWorkFlowId(String AWorkFlowId, String appendConditionSql) throws SQLException, DbException {
	Leave.deleteByWorkFlowId(this.getDataVisit(), AWorkFlowId, appendConditionSql);
}

/**
 * <param name="leave">从数据库中删除一个对象Leave</param>
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
protected void leaveDeleteByWorkFlowId(String AWorkFlowId) throws SQLException, DbException {
	this.leaveDeleteByWorkFlowId(AWorkFlowId, "");
}

/**
 * 从数据库中删除一批对象Leave
 * <param name="ARequestUserId">申请人</param>
 */
protected void leaveDeleteListByRequestUserId(int ARequestUserId) throws SQLException, DbException {
	Leave.deleteListByRequestUserId(this.getDataVisit(), ARequestUserId);
}

/**
 * 从数据库中删除一批对象Leave
 * <param name="AAuditUserId">最后审核人</param>
 */
protected void leaveDeleteListByAuditUserId(Integer AAuditUserId) throws SQLException, DbException {
	Leave.deleteListByAuditUserId(this.getDataVisit(), AAuditUserId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
protected Leave leaveSelectByWorkFlowId(String AWorkFlowId) throws SQLException, DbException {
	return Leave.selectByWorkFlowId(this.getDataVisit(), AWorkFlowId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ARequestUserId">申请人</param>
 */
protected List<Leave> leaveSelectObjectsByRequestUserId(int ARequestUserId) throws SQLException, DbException {
	return Leave.selectObjectsByRequestUserId(this.getDataVisit(), ARequestUserId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AAuditUserId">最后审核人</param>
 */
protected List<Leave> leaveSelectObjectsByAuditUserId(Integer AAuditUserId) throws SQLException, DbException {
	return Leave.selectObjectsByAuditUserId(this.getDataVisit(), AAuditUserId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
protected List<Leave> leaveSelectObjectsByWorkFlowId(String AWorkFlowId) throws SQLException, DbException {
	return Leave.selectObjectsByWorkFlowId(this.getDataVisit(), AWorkFlowId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Leave> leaveSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Leave.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Leave> leaveSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Leave.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Leave> leaveSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Leave.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Leave> leaveSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Leave.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Leave> List<T> leaveSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Leave.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Leave> List<T> leaveSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Leave.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int leaveQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_LEAVE].* from [T_LEAVE]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象IssueProjectModule到数据库中
 * <param name="issueProjectModule">需要插入的IssueProjectModule</param>
 */
protected void issueProjectModuleInsert(IssueProjectModule issueProjectModule) throws SQLException, DbException {
	IssueProjectModule.insert(this.getDataVisit(), issueProjectModule);
}

/**
 * 更新一个对象IssueProjectModule到数据库中
 * <param name="issueProjectModule">需要更新的IssueProjectModule</param>
 */
protected int issueProjectModuleUpdate(IssueProjectModule issueProjectModule) throws SQLException, DbException {
	return this.issueProjectModuleUpdate(issueProjectModule, "");
}

/**
 * 更新一个对象IssueProjectModule到数据库中
 * <param name="issueProjectModule">需要更新的IssueProjectModule</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int issueProjectModuleUpdate(IssueProjectModule issueProjectModule, String appendConditionSql) throws SQLException, DbException {
	return IssueProjectModule.update(this.getDataVisit(), issueProjectModule, appendConditionSql);
}

/**
 * 从数据库中删除一个对象IssueProjectModule
 * <param name="AIssueProjectModuleId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void issueProjectModuleDeleteByIssueProjectModuleId(int AIssueProjectModuleId, String appendConditionSql) throws SQLException, DbException {
	IssueProjectModule.deleteByIssueProjectModuleId(this.getDataVisit(), AIssueProjectModuleId, appendConditionSql);
}

/**
 * <param name="issueProjectModule">从数据库中删除一个对象IssueProjectModule</param>
 * <param name="AIssueProjectModuleId">标识</param>
 */
protected void issueProjectModuleDeleteByIssueProjectModuleId(int AIssueProjectModuleId) throws SQLException, DbException {
	this.issueProjectModuleDeleteByIssueProjectModuleId(AIssueProjectModuleId, "");
}

/**
 * 从数据库中删除一个对象IssueProjectModule
 * <param name="AIssueProjectId">标识</param>
 * <param name="AModuleName">模块名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void issueProjectModuleDeleteByIssueProjectIdModuleName(int AIssueProjectId, String AModuleName, String appendConditionSql) throws SQLException, DbException {
	IssueProjectModule.deleteByIssueProjectIdModuleName(this.getDataVisit(), AIssueProjectId, AModuleName, appendConditionSql);
}

/**
 * <param name="issueProjectModule">从数据库中删除一个对象IssueProjectModule</param>
 * <param name="AIssueProjectId">标识</param>
 * <param name="AModuleName">模块名称</param>
 */
protected void issueProjectModuleDeleteByIssueProjectIdModuleName(int AIssueProjectId, String AModuleName) throws SQLException, DbException {
	this.issueProjectModuleDeleteByIssueProjectIdModuleName(AIssueProjectId, AModuleName, "");
}

/**
 * 从数据库中删除一批对象IssueProjectModule
 * <param name="AIssueProjectId">标识</param>
 */
protected void issueProjectModuleDeleteListByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	IssueProjectModule.deleteListByIssueProjectId(this.getDataVisit(), AIssueProjectId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectModuleId">标识</param>
 */
protected IssueProjectModule issueProjectModuleSelectByIssueProjectModuleId(int AIssueProjectModuleId) throws SQLException, DbException {
	return IssueProjectModule.selectByIssueProjectModuleId(this.getDataVisit(), AIssueProjectModuleId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectId">标识</param>
 * <param name="AModuleName">模块名称</param>
 */
protected IssueProjectModule issueProjectModuleSelectByIssueProjectIdModuleName(int AIssueProjectId, String AModuleName) throws SQLException, DbException {
	return IssueProjectModule.selectByIssueProjectIdModuleName(this.getDataVisit(), AIssueProjectId, AModuleName);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectId">标识</param>
 */
protected List<IssueProjectModule> issueProjectModuleSelectObjectsByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	return IssueProjectModule.selectObjectsByIssueProjectId(this.getDataVisit(), AIssueProjectId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueProjectModule> issueProjectModuleSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueProjectModule.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<IssueProjectModule> issueProjectModuleSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return IssueProjectModule.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueProjectModule> issueProjectModuleSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueProjectModule.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<IssueProjectModule> issueProjectModuleSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return IssueProjectModule.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends IssueProjectModule> List<T> issueProjectModuleSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueProjectModule.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends IssueProjectModule> List<T> issueProjectModuleSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueProjectModule.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int issueProjectModuleQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_ISSUE_PROJECT_MODULE].* from [T_ISSUE_PROJECT_MODULE]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象IssuePriorities到数据库中
 * <param name="issuePriorities">需要插入的IssuePriorities</param>
 */
protected void issuePrioritiesInsert(IssuePriorities issuePriorities) throws SQLException, DbException {
	IssuePriorities.insert(this.getDataVisit(), issuePriorities);
}

/**
 * 更新一个对象IssuePriorities到数据库中
 * <param name="issuePriorities">需要更新的IssuePriorities</param>
 */
protected int issuePrioritiesUpdate(IssuePriorities issuePriorities) throws SQLException, DbException {
	return this.issuePrioritiesUpdate(issuePriorities, "");
}

/**
 * 更新一个对象IssuePriorities到数据库中
 * <param name="issuePriorities">需要更新的IssuePriorities</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int issuePrioritiesUpdate(IssuePriorities issuePriorities, String appendConditionSql) throws SQLException, DbException {
	return IssuePriorities.update(this.getDataVisit(), issuePriorities, appendConditionSql);
}

/**
 * 从数据库中删除一个对象IssuePriorities
 * <param name="APrioritiesId">优先级别</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void issuePrioritiesDeleteByPrioritiesId(Byte APrioritiesId, String appendConditionSql) throws SQLException, DbException {
	IssuePriorities.deleteByPrioritiesId(this.getDataVisit(), APrioritiesId, appendConditionSql);
}

/**
 * <param name="issuePriorities">从数据库中删除一个对象IssuePriorities</param>
 * <param name="APrioritiesId">优先级别</param>
 */
protected void issuePrioritiesDeleteByPrioritiesId(Byte APrioritiesId) throws SQLException, DbException {
	this.issuePrioritiesDeleteByPrioritiesId(APrioritiesId, "");
}

/**
 * 从数据库中删除一个对象IssuePriorities
 * <param name="APrioritiesName">优先名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void issuePrioritiesDeleteByPrioritiesName(String APrioritiesName, String appendConditionSql) throws SQLException, DbException {
	IssuePriorities.deleteByPrioritiesName(this.getDataVisit(), APrioritiesName, appendConditionSql);
}

/**
 * <param name="issuePriorities">从数据库中删除一个对象IssuePriorities</param>
 * <param name="APrioritiesName">优先名称</param>
 */
protected void issuePrioritiesDeleteByPrioritiesName(String APrioritiesName) throws SQLException, DbException {
	this.issuePrioritiesDeleteByPrioritiesName(APrioritiesName, "");
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APrioritiesId">优先级别</param>
 */
protected IssuePriorities issuePrioritiesSelectByPrioritiesId(Byte APrioritiesId) throws SQLException, DbException {
	return IssuePriorities.selectByPrioritiesId(this.getDataVisit(), APrioritiesId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APrioritiesName">优先名称</param>
 */
protected IssuePriorities issuePrioritiesSelectByPrioritiesName(String APrioritiesName) throws SQLException, DbException {
	return IssuePriorities.selectByPrioritiesName(this.getDataVisit(), APrioritiesName);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssuePriorities> issuePrioritiesSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssuePriorities.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<IssuePriorities> issuePrioritiesSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return IssuePriorities.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssuePriorities> issuePrioritiesSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssuePriorities.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<IssuePriorities> issuePrioritiesSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return IssuePriorities.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends IssuePriorities> List<T> issuePrioritiesSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssuePriorities.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends IssuePriorities> List<T> issuePrioritiesSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssuePriorities.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int issuePrioritiesQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_ISSUE_PRIORITIES].* from [T_ISSUE_PRIORITIES]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象FuncProject到数据库中
 * <param name="funcProject">需要插入的FuncProject</param>
 */
protected void funcProjectInsert(FuncProject funcProject) throws SQLException, DbException {
	FuncProject.insert(this.getDataVisit(), funcProject);
}

/**
 * 更新一个对象FuncProject到数据库中
 * <param name="funcProject">需要更新的FuncProject</param>
 */
protected int funcProjectUpdate(FuncProject funcProject) throws SQLException, DbException {
	return this.funcProjectUpdate(funcProject, "");
}

/**
 * 更新一个对象FuncProject到数据库中
 * <param name="funcProject">需要更新的FuncProject</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int funcProjectUpdate(FuncProject funcProject, String appendConditionSql) throws SQLException, DbException {
	return FuncProject.update(this.getDataVisit(), funcProject, appendConditionSql);
}

/**
 * 从数据库中删除一个对象FuncProject
 * <param name="AFuncProjectId">函数项目标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void funcProjectDeleteByFuncProjectId(int AFuncProjectId, String appendConditionSql) throws SQLException, DbException {
	FuncProject.deleteByFuncProjectId(this.getDataVisit(), AFuncProjectId, appendConditionSql);
}

/**
 * <param name="funcProject">从数据库中删除一个对象FuncProject</param>
 * <param name="AFuncProjectId">函数项目标识</param>
 */
protected void funcProjectDeleteByFuncProjectId(int AFuncProjectId) throws SQLException, DbException {
	this.funcProjectDeleteByFuncProjectId(AFuncProjectId, "");
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AFuncProjectId">函数项目标识</param>
 */
protected FuncProject funcProjectSelectByFuncProjectId(int AFuncProjectId) throws SQLException, DbException {
	return FuncProject.selectByFuncProjectId(this.getDataVisit(), AFuncProjectId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<FuncProject> funcProjectSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return FuncProject.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<FuncProject> funcProjectSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return FuncProject.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<FuncProject> funcProjectSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return FuncProject.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<FuncProject> funcProjectSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return FuncProject.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends FuncProject> List<T> funcProjectSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return FuncProject.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends FuncProject> List<T> funcProjectSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return FuncProject.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int funcProjectQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_FUNC_PROJECT].* from [T_FUNC_PROJECT]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象IssueStatus到数据库中
 * <param name="issueStatus">需要插入的IssueStatus</param>
 */
protected void issueStatusInsert(IssueStatus issueStatus) throws SQLException, DbException {
	IssueStatus.insert(this.getDataVisit(), issueStatus);
}

/**
 * 更新一个对象IssueStatus到数据库中
 * <param name="issueStatus">需要更新的IssueStatus</param>
 */
protected int issueStatusUpdate(IssueStatus issueStatus) throws SQLException, DbException {
	return this.issueStatusUpdate(issueStatus, "");
}

/**
 * 更新一个对象IssueStatus到数据库中
 * <param name="issueStatus">需要更新的IssueStatus</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int issueStatusUpdate(IssueStatus issueStatus, String appendConditionSql) throws SQLException, DbException {
	return IssueStatus.update(this.getDataVisit(), issueStatus, appendConditionSql);
}

/**
 * 从数据库中删除一个对象IssueStatus
 * <param name="AStatusId">状态标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void issueStatusDeleteByStatusId(int AStatusId, String appendConditionSql) throws SQLException, DbException {
	IssueStatus.deleteByStatusId(this.getDataVisit(), AStatusId, appendConditionSql);
}

/**
 * <param name="issueStatus">从数据库中删除一个对象IssueStatus</param>
 * <param name="AStatusId">状态标识</param>
 */
protected void issueStatusDeleteByStatusId(int AStatusId) throws SQLException, DbException {
	this.issueStatusDeleteByStatusId(AStatusId, "");
}

/**
 * 从数据库中删除一个对象IssueStatus
 * <param name="AStatusName">状态名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void issueStatusDeleteByStatusName(String AStatusName, String appendConditionSql) throws SQLException, DbException {
	IssueStatus.deleteByStatusName(this.getDataVisit(), AStatusName, appendConditionSql);
}

/**
 * <param name="issueStatus">从数据库中删除一个对象IssueStatus</param>
 * <param name="AStatusName">状态名称</param>
 */
protected void issueStatusDeleteByStatusName(String AStatusName) throws SQLException, DbException {
	this.issueStatusDeleteByStatusName(AStatusName, "");
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AStatusId">状态标识</param>
 */
protected IssueStatus issueStatusSelectByStatusId(int AStatusId) throws SQLException, DbException {
	return IssueStatus.selectByStatusId(this.getDataVisit(), AStatusId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AStatusName">状态名称</param>
 */
protected IssueStatus issueStatusSelectByStatusName(String AStatusName) throws SQLException, DbException {
	return IssueStatus.selectByStatusName(this.getDataVisit(), AStatusName);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueStatus> issueStatusSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueStatus.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<IssueStatus> issueStatusSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return IssueStatus.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueStatus> issueStatusSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueStatus.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<IssueStatus> issueStatusSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return IssueStatus.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends IssueStatus> List<T> issueStatusSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueStatus.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends IssueStatus> List<T> issueStatusSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueStatus.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int issueStatusQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_ISSUE_STATUS].* from [T_ISSUE_STATUS]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象TaskUser到数据库中
 * <param name="taskUser">需要插入的TaskUser</param>
 */
protected void taskUserInsert(TaskUser taskUser) throws SQLException, DbException {
	TaskUser.insert(this.getDataVisit(), taskUser);
}

/**
 * 更新一个对象TaskUser到数据库中
 * <param name="taskUser">需要更新的TaskUser</param>
 */
protected int taskUserUpdate(TaskUser taskUser) throws SQLException, DbException {
	return this.taskUserUpdate(taskUser, "");
}

/**
 * 更新一个对象TaskUser到数据库中
 * <param name="taskUser">需要更新的TaskUser</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int taskUserUpdate(TaskUser taskUser, String appendConditionSql) throws SQLException, DbException {
	return TaskUser.update(this.getDataVisit(), taskUser, appendConditionSql);
}

/**
 * 从数据库中删除一个对象TaskUser
 * <param name="ATaskUserId">任务用户ID</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void taskUserDeleteByTaskUserId(int ATaskUserId, String appendConditionSql) throws SQLException, DbException {
	TaskUser.deleteByTaskUserId(this.getDataVisit(), ATaskUserId, appendConditionSql);
}

/**
 * <param name="taskUser">从数据库中删除一个对象TaskUser</param>
 * <param name="ATaskUserId">任务用户ID</param>
 */
protected void taskUserDeleteByTaskUserId(int ATaskUserId) throws SQLException, DbException {
	this.taskUserDeleteByTaskUserId(ATaskUserId, "");
}

/**
 * 从数据库中删除一批对象TaskUser
 * <param name="ATaskId">任务代号</param>
 */
protected void taskUserDeleteListByTaskId(int ATaskId) throws SQLException, DbException {
	TaskUser.deleteListByTaskId(this.getDataVisit(), ATaskId);
}

/**
 * 从数据库中删除一批对象TaskUser
 * <param name="AUserId">用户代号</param>
 */
protected void taskUserDeleteListByUserId(int AUserId) throws SQLException, DbException {
	TaskUser.deleteListByUserId(this.getDataVisit(), AUserId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATaskUserId">任务用户ID</param>
 */
protected TaskUser taskUserSelectByTaskUserId(int ATaskUserId) throws SQLException, DbException {
	return TaskUser.selectByTaskUserId(this.getDataVisit(), ATaskUserId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskId">任务代号</param>
 */
protected List<TaskUser> taskUserSelectObjectsByTaskId(int ATaskId) throws SQLException, DbException {
	return TaskUser.selectObjectsByTaskId(this.getDataVisit(), ATaskId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AUserId">用户代号</param>
 */
protected List<TaskUser> taskUserSelectObjectsByUserId(int AUserId) throws SQLException, DbException {
	return TaskUser.selectObjectsByUserId(this.getDataVisit(), AUserId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<TaskUser> taskUserSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return TaskUser.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<TaskUser> taskUserSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return TaskUser.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<TaskUser> taskUserSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return TaskUser.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<TaskUser> taskUserSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return TaskUser.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends TaskUser> List<T> taskUserSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return TaskUser.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends TaskUser> List<T> taskUserSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return TaskUser.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int taskUserQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_TASK_USER].* from [T_TASK_USER]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象IssueRoles到数据库中
 * <param name="issueRoles">需要插入的IssueRoles</param>
 */
protected void issueRolesInsert(IssueRoles issueRoles) throws SQLException, DbException {
	IssueRoles.insert(this.getDataVisit(), issueRoles);
}

/**
 * 更新一个对象IssueRoles到数据库中
 * <param name="issueRoles">需要更新的IssueRoles</param>
 */
protected int issueRolesUpdate(IssueRoles issueRoles) throws SQLException, DbException {
	return this.issueRolesUpdate(issueRoles, "");
}

/**
 * 更新一个对象IssueRoles到数据库中
 * <param name="issueRoles">需要更新的IssueRoles</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int issueRolesUpdate(IssueRoles issueRoles, String appendConditionSql) throws SQLException, DbException {
	return IssueRoles.update(this.getDataVisit(), issueRoles, appendConditionSql);
}

/**
 * 从数据库中删除一个对象IssueRoles
 * <param name="ARoleId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void issueRolesDeleteByRoleId(int ARoleId, String appendConditionSql) throws SQLException, DbException {
	IssueRoles.deleteByRoleId(this.getDataVisit(), ARoleId, appendConditionSql);
}

/**
 * <param name="issueRoles">从数据库中删除一个对象IssueRoles</param>
 * <param name="ARoleId">标识</param>
 */
protected void issueRolesDeleteByRoleId(int ARoleId) throws SQLException, DbException {
	this.issueRolesDeleteByRoleId(ARoleId, "");
}

/**
 * 从数据库中删除一个对象IssueRoles
 * <param name="ARoleName">角色名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void issueRolesDeleteByRoleName(String ARoleName, String appendConditionSql) throws SQLException, DbException {
	IssueRoles.deleteByRoleName(this.getDataVisit(), ARoleName, appendConditionSql);
}

/**
 * <param name="issueRoles">从数据库中删除一个对象IssueRoles</param>
 * <param name="ARoleName">角色名称</param>
 */
protected void issueRolesDeleteByRoleName(String ARoleName) throws SQLException, DbException {
	this.issueRolesDeleteByRoleName(ARoleName, "");
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ARoleId">标识</param>
 */
protected IssueRoles issueRolesSelectByRoleId(int ARoleId) throws SQLException, DbException {
	return IssueRoles.selectByRoleId(this.getDataVisit(), ARoleId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ARoleName">角色名称</param>
 */
protected IssueRoles issueRolesSelectByRoleName(String ARoleName) throws SQLException, DbException {
	return IssueRoles.selectByRoleName(this.getDataVisit(), ARoleName);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueRoles> issueRolesSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueRoles.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<IssueRoles> issueRolesSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return IssueRoles.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueRoles> issueRolesSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueRoles.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<IssueRoles> issueRolesSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return IssueRoles.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends IssueRoles> List<T> issueRolesSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueRoles.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends IssueRoles> List<T> issueRolesSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueRoles.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int issueRolesQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_ISSUE_ROLES].* from [T_ISSUE_ROLES]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象IssueProjectUserPrivileges到数据库中
 * <param name="issueProjectUserPrivileges">需要插入的IssueProjectUserPrivileges</param>
 */
protected void issueProjectUserPrivilegesInsert(IssueProjectUserPrivileges issueProjectUserPrivileges) throws SQLException, DbException {
	IssueProjectUserPrivileges.insert(this.getDataVisit(), issueProjectUserPrivileges);
}

/**
 * 更新一个对象IssueProjectUserPrivileges到数据库中
 * <param name="issueProjectUserPrivileges">需要更新的IssueProjectUserPrivileges</param>
 */
protected int issueProjectUserPrivilegesUpdate(IssueProjectUserPrivileges issueProjectUserPrivileges) throws SQLException, DbException {
	return this.issueProjectUserPrivilegesUpdate(issueProjectUserPrivileges, "");
}

/**
 * 更新一个对象IssueProjectUserPrivileges到数据库中
 * <param name="issueProjectUserPrivileges">需要更新的IssueProjectUserPrivileges</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int issueProjectUserPrivilegesUpdate(IssueProjectUserPrivileges issueProjectUserPrivileges, String appendConditionSql) throws SQLException, DbException {
	return IssueProjectUserPrivileges.update(this.getDataVisit(), issueProjectUserPrivileges, appendConditionSql);
}

/**
 * 从数据库中删除一个对象IssueProjectUserPrivileges
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void issueProjectUserPrivilegesDeleteByIssueProjectIdIssueUserId(int AIssueProjectId, int AIssueUserId, String appendConditionSql) throws SQLException, DbException {
	IssueProjectUserPrivileges.deleteByIssueProjectIdIssueUserId(this.getDataVisit(), AIssueProjectId, AIssueUserId, appendConditionSql);
}

/**
 * <param name="issueProjectUserPrivileges">从数据库中删除一个对象IssueProjectUserPrivileges</param>
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 */
protected void issueProjectUserPrivilegesDeleteByIssueProjectIdIssueUserId(int AIssueProjectId, int AIssueUserId) throws SQLException, DbException {
	this.issueProjectUserPrivilegesDeleteByIssueProjectIdIssueUserId(AIssueProjectId, AIssueUserId, "");
}

/**
 * 从数据库中删除一批对象IssueProjectUserPrivileges
 * <param name="AIssueProjectId">标识</param>
 */
protected void issueProjectUserPrivilegesDeleteListByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	IssueProjectUserPrivileges.deleteListByIssueProjectId(this.getDataVisit(), AIssueProjectId);
}

/**
 * 从数据库中删除一批对象IssueProjectUserPrivileges
 * <param name="ARoleId">标识</param>
 */
protected void issueProjectUserPrivilegesDeleteListByRoleId(int ARoleId) throws SQLException, DbException {
	IssueProjectUserPrivileges.deleteListByRoleId(this.getDataVisit(), ARoleId);
}

/**
 * 从数据库中删除一批对象IssueProjectUserPrivileges
 * <param name="AIssueUserId">用户标识</param>
 */
protected void issueProjectUserPrivilegesDeleteListByIssueUserId(int AIssueUserId) throws SQLException, DbException {
	IssueProjectUserPrivileges.deleteListByIssueUserId(this.getDataVisit(), AIssueUserId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 */
protected IssueProjectUserPrivileges issueProjectUserPrivilegesSelectByIssueProjectIdIssueUserId(int AIssueProjectId, int AIssueUserId) throws SQLException, DbException {
	return IssueProjectUserPrivileges.selectByIssueProjectIdIssueUserId(this.getDataVisit(), AIssueProjectId, AIssueUserId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectId">标识</param>
 */
protected List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjectsByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	return IssueProjectUserPrivileges.selectObjectsByIssueProjectId(this.getDataVisit(), AIssueProjectId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ARoleId">标识</param>
 */
protected List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjectsByRoleId(int ARoleId) throws SQLException, DbException {
	return IssueProjectUserPrivileges.selectObjectsByRoleId(this.getDataVisit(), ARoleId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueUserId">用户标识</param>
 */
protected List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjectsByIssueUserId(int AIssueUserId) throws SQLException, DbException {
	return IssueProjectUserPrivileges.selectObjectsByIssueUserId(this.getDataVisit(), AIssueUserId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueProjectUserPrivileges.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return IssueProjectUserPrivileges.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueProjectUserPrivileges.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return IssueProjectUserPrivileges.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends IssueProjectUserPrivileges> List<T> issueProjectUserPrivilegesSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueProjectUserPrivileges.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends IssueProjectUserPrivileges> List<T> issueProjectUserPrivilegesSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueProjectUserPrivileges.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int issueProjectUserPrivilegesQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_ISSUE_PROJECT_USER_PRIVILEGES].* from [T_ISSUE_PROJECT_USER_PRIVILEGES]" +
"";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Task到数据库中
 * <param name="task">需要插入的Task</param>
 */
protected void taskInsert(Task task) throws SQLException, DbException {
	Task.insert(this.getDataVisit(), task);
}

/**
 * 更新一个对象Task到数据库中
 * <param name="task">需要更新的Task</param>
 */
protected int taskUpdate(Task task) throws SQLException, DbException {
	return this.taskUpdate(task, "");
}

/**
 * 更新一个对象Task到数据库中
 * <param name="task">需要更新的Task</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int taskUpdate(Task task, String appendConditionSql) throws SQLException, DbException {
	return Task.update(this.getDataVisit(), task, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Task
 * <param name="ATaskId">任务代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void taskDeleteByTaskId(int ATaskId, String appendConditionSql) throws SQLException, DbException {
	Task.deleteByTaskId(this.getDataVisit(), ATaskId, appendConditionSql);
}

/**
 * <param name="task">从数据库中删除一个对象Task</param>
 * <param name="ATaskId">任务代号</param>
 */
protected void taskDeleteByTaskId(int ATaskId) throws SQLException, DbException {
	this.taskDeleteByTaskId(ATaskId, "");
}

/**
 * 从数据库中删除一批对象Task
 * <param name="ATaskProjectId">任务工程代号</param>
 */
protected void taskDeleteListByTaskProjectId(int ATaskProjectId) throws SQLException, DbException {
	Task.deleteListByTaskProjectId(this.getDataVisit(), ATaskProjectId);
}

/**
 * 从数据库中删除一批对象Task
 * <param name="ATaskParentId">父任务代号</param>
 */
protected void taskDeleteListByTaskParentId(Integer ATaskParentId) throws SQLException, DbException {
	Task.deleteListByTaskParentId(this.getDataVisit(), ATaskParentId);
}

/**
 * 从数据库中删除一批对象Task
 * <param name="ATaskModifierId">任务修改者代号</param>
 */
protected void taskDeleteListByTaskModifierId(int ATaskModifierId) throws SQLException, DbException {
	Task.deleteListByTaskModifierId(this.getDataVisit(), ATaskModifierId);
}

/**
 * 从数据库中删除一批对象Task
 * <param name="ATaskManagerId">任务管理员代号</param>
 */
protected void taskDeleteListByTaskManagerId(int ATaskManagerId) throws SQLException, DbException {
	Task.deleteListByTaskManagerId(this.getDataVisit(), ATaskManagerId);
}

/**
 * 从数据库中删除一批对象Task
 * <param name="ATaskCreaterId">任务创建者代号</param>
 */
protected void taskDeleteListByTaskCreaterId(int ATaskCreaterId) throws SQLException, DbException {
	Task.deleteListByTaskCreaterId(this.getDataVisit(), ATaskCreaterId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATaskId">任务代号</param>
 */
protected Task taskSelectByTaskId(int ATaskId) throws SQLException, DbException {
	return Task.selectByTaskId(this.getDataVisit(), ATaskId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskProjectId">任务工程代号</param>
 */
protected List<Task> taskSelectObjectsByTaskProjectId(int ATaskProjectId) throws SQLException, DbException {
	return Task.selectObjectsByTaskProjectId(this.getDataVisit(), ATaskProjectId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskParentId">父任务代号</param>
 */
protected List<Task> taskSelectObjectsByTaskParentId(Integer ATaskParentId) throws SQLException, DbException {
	return Task.selectObjectsByTaskParentId(this.getDataVisit(), ATaskParentId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskModifierId">任务修改者代号</param>
 */
protected List<Task> taskSelectObjectsByTaskModifierId(int ATaskModifierId) throws SQLException, DbException {
	return Task.selectObjectsByTaskModifierId(this.getDataVisit(), ATaskModifierId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskManagerId">任务管理员代号</param>
 */
protected List<Task> taskSelectObjectsByTaskManagerId(int ATaskManagerId) throws SQLException, DbException {
	return Task.selectObjectsByTaskManagerId(this.getDataVisit(), ATaskManagerId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskCreaterId">任务创建者代号</param>
 */
protected List<Task> taskSelectObjectsByTaskCreaterId(int ATaskCreaterId) throws SQLException, DbException {
	return Task.selectObjectsByTaskCreaterId(this.getDataVisit(), ATaskCreaterId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Task> taskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Task.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Task> taskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Task.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Task> taskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Task.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Task> taskSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Task.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Task> List<T> taskSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Task.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Task> List<T> taskSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Task.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int taskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_TASK].* from [T_TASK]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象FuncParams到数据库中
 * <param name="funcParams">需要插入的FuncParams</param>
 */
protected void funcParamsInsert(FuncParams funcParams) throws SQLException, DbException {
	FuncParams.insert(this.getDataVisit(), funcParams);
}

/**
 * 更新一个对象FuncParams到数据库中
 * <param name="funcParams">需要更新的FuncParams</param>
 */
protected int funcParamsUpdate(FuncParams funcParams) throws SQLException, DbException {
	return this.funcParamsUpdate(funcParams, "");
}

/**
 * 更新一个对象FuncParams到数据库中
 * <param name="funcParams">需要更新的FuncParams</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int funcParamsUpdate(FuncParams funcParams, String appendConditionSql) throws SQLException, DbException {
	return FuncParams.update(this.getDataVisit(), funcParams, appendConditionSql);
}

/**
 * 从数据库中删除一个对象FuncParams
 * <param name="AParamId">参数标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void funcParamsDeleteByParamId(int AParamId, String appendConditionSql) throws SQLException, DbException {
	FuncParams.deleteByParamId(this.getDataVisit(), AParamId, appendConditionSql);
}

/**
 * <param name="funcParams">从数据库中删除一个对象FuncParams</param>
 * <param name="AParamId">参数标识</param>
 */
protected void funcParamsDeleteByParamId(int AParamId) throws SQLException, DbException {
	this.funcParamsDeleteByParamId(AParamId, "");
}

/**
 * 从数据库中删除一批对象FuncParams
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
protected void funcParamsDeleteListByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException {
	FuncParams.deleteListByFuncProcedureId(this.getDataVisit(), AFuncProcedureId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AParamId">参数标识</param>
 */
protected FuncParams funcParamsSelectByParamId(int AParamId) throws SQLException, DbException {
	return FuncParams.selectByParamId(this.getDataVisit(), AParamId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
protected List<FuncParams> funcParamsSelectObjectsByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException {
	return FuncParams.selectObjectsByFuncProcedureId(this.getDataVisit(), AFuncProcedureId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<FuncParams> funcParamsSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return FuncParams.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<FuncParams> funcParamsSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return FuncParams.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<FuncParams> funcParamsSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return FuncParams.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<FuncParams> funcParamsSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return FuncParams.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends FuncParams> List<T> funcParamsSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return FuncParams.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends FuncParams> List<T> funcParamsSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return FuncParams.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int funcParamsQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_FUNC_PARAMS].* from [T_FUNC_PARAMS]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象IssueStateChangeDefine到数据库中
 * <param name="issueStateChangeDefine">需要插入的IssueStateChangeDefine</param>
 */
protected void issueStateChangeDefineInsert(IssueStateChangeDefine issueStateChangeDefine) throws SQLException, DbException {
	IssueStateChangeDefine.insert(this.getDataVisit(), issueStateChangeDefine);
}

/**
 * 更新一个对象IssueStateChangeDefine到数据库中
 * <param name="issueStateChangeDefine">需要更新的IssueStateChangeDefine</param>
 */
protected int issueStateChangeDefineUpdate(IssueStateChangeDefine issueStateChangeDefine) throws SQLException, DbException {
	return this.issueStateChangeDefineUpdate(issueStateChangeDefine, "");
}

/**
 * 更新一个对象IssueStateChangeDefine到数据库中
 * <param name="issueStateChangeDefine">需要更新的IssueStateChangeDefine</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int issueStateChangeDefineUpdate(IssueStateChangeDefine issueStateChangeDefine, String appendConditionSql) throws SQLException, DbException {
	return IssueStateChangeDefine.update(this.getDataVisit(), issueStateChangeDefine, appendConditionSql);
}

/**
 * 从数据库中删除一个对象IssueStateChangeDefine
 * <param name="ACurrentStatusId">当前状态标识</param>
 * <param name="ANextStatusId">下一个状态标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void issueStateChangeDefineDeleteByCurrentStatusIdNextStatusId(int ACurrentStatusId, int ANextStatusId, String appendConditionSql) throws SQLException, DbException {
	IssueStateChangeDefine.deleteByCurrentStatusIdNextStatusId(this.getDataVisit(), ACurrentStatusId, ANextStatusId, appendConditionSql);
}

/**
 * <param name="issueStateChangeDefine">从数据库中删除一个对象IssueStateChangeDefine</param>
 * <param name="ACurrentStatusId">当前状态标识</param>
 * <param name="ANextStatusId">下一个状态标识</param>
 */
protected void issueStateChangeDefineDeleteByCurrentStatusIdNextStatusId(int ACurrentStatusId, int ANextStatusId) throws SQLException, DbException {
	this.issueStateChangeDefineDeleteByCurrentStatusIdNextStatusId(ACurrentStatusId, ANextStatusId, "");
}

/**
 * 从数据库中删除一批对象IssueStateChangeDefine
 * <param name="ACurrentStatusId">当前状态标识</param>
 */
protected void issueStateChangeDefineDeleteListByCurrentStatusId(int ACurrentStatusId) throws SQLException, DbException {
	IssueStateChangeDefine.deleteListByCurrentStatusId(this.getDataVisit(), ACurrentStatusId);
}

/**
 * 从数据库中删除一批对象IssueStateChangeDefine
 * <param name="ANextStatusId">下一个状态标识</param>
 */
protected void issueStateChangeDefineDeleteListByNextStatusId(int ANextStatusId) throws SQLException, DbException {
	IssueStateChangeDefine.deleteListByNextStatusId(this.getDataVisit(), ANextStatusId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ACurrentStatusId">当前状态标识</param>
 * <param name="ANextStatusId">下一个状态标识</param>
 */
protected IssueStateChangeDefine issueStateChangeDefineSelectByCurrentStatusIdNextStatusId(int ACurrentStatusId, int ANextStatusId) throws SQLException, DbException {
	return IssueStateChangeDefine.selectByCurrentStatusIdNextStatusId(this.getDataVisit(), ACurrentStatusId, ANextStatusId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ACurrentStatusId">当前状态标识</param>
 */
protected List<IssueStateChangeDefine> issueStateChangeDefineSelectObjectsByCurrentStatusId(int ACurrentStatusId) throws SQLException, DbException {
	return IssueStateChangeDefine.selectObjectsByCurrentStatusId(this.getDataVisit(), ACurrentStatusId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ANextStatusId">下一个状态标识</param>
 */
protected List<IssueStateChangeDefine> issueStateChangeDefineSelectObjectsByNextStatusId(int ANextStatusId) throws SQLException, DbException {
	return IssueStateChangeDefine.selectObjectsByNextStatusId(this.getDataVisit(), ANextStatusId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueStateChangeDefine> issueStateChangeDefineSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueStateChangeDefine.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<IssueStateChangeDefine> issueStateChangeDefineSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return IssueStateChangeDefine.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueStateChangeDefine> issueStateChangeDefineSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueStateChangeDefine.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<IssueStateChangeDefine> issueStateChangeDefineSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return IssueStateChangeDefine.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends IssueStateChangeDefine> List<T> issueStateChangeDefineSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueStateChangeDefine.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends IssueStateChangeDefine> List<T> issueStateChangeDefineSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueStateChangeDefine.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int issueStateChangeDefineQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_ISSUE_STATE_CHANGE_DEFINE].* from [T_ISSUE_STATE_CHANGE_DEFINE]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象IssueComment到数据库中
 * <param name="issueComment">需要插入的IssueComment</param>
 */
protected void issueCommentInsert(IssueComment issueComment) throws SQLException, DbException {
	IssueComment.insert(this.getDataVisit(), issueComment);
}

/**
 * 更新一个对象IssueComment到数据库中
 * <param name="issueComment">需要更新的IssueComment</param>
 */
protected int issueCommentUpdate(IssueComment issueComment) throws SQLException, DbException {
	return this.issueCommentUpdate(issueComment, "");
}

/**
 * 更新一个对象IssueComment到数据库中
 * <param name="issueComment">需要更新的IssueComment</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int issueCommentUpdate(IssueComment issueComment, String appendConditionSql) throws SQLException, DbException {
	return IssueComment.update(this.getDataVisit(), issueComment, appendConditionSql);
}

/**
 * 从数据库中删除一个对象IssueComment
 * <param name="AIssueCommentId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void issueCommentDeleteByIssueCommentId(int AIssueCommentId, String appendConditionSql) throws SQLException, DbException {
	IssueComment.deleteByIssueCommentId(this.getDataVisit(), AIssueCommentId, appendConditionSql);
}

/**
 * <param name="issueComment">从数据库中删除一个对象IssueComment</param>
 * <param name="AIssueCommentId">标识</param>
 */
protected void issueCommentDeleteByIssueCommentId(int AIssueCommentId) throws SQLException, DbException {
	this.issueCommentDeleteByIssueCommentId(AIssueCommentId, "");
}

/**
 * 从数据库中删除一批对象IssueComment
 * <param name="AIssueId">问题标识</param>
 */
protected void issueCommentDeleteListByIssueId(int AIssueId) throws SQLException, DbException {
	IssueComment.deleteListByIssueId(this.getDataVisit(), AIssueId);
}

/**
 * 从数据库中删除一批对象IssueComment
 * <param name="ACommentUserId">用户标识</param>
 */
protected void issueCommentDeleteListByCommentUserId(int ACommentUserId) throws SQLException, DbException {
	IssueComment.deleteListByCommentUserId(this.getDataVisit(), ACommentUserId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueCommentId">标识</param>
 */
protected IssueComment issueCommentSelectByIssueCommentId(int AIssueCommentId) throws SQLException, DbException {
	return IssueComment.selectByIssueCommentId(this.getDataVisit(), AIssueCommentId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueId">问题标识</param>
 */
protected List<IssueComment> issueCommentSelectObjectsByIssueId(int AIssueId) throws SQLException, DbException {
	return IssueComment.selectObjectsByIssueId(this.getDataVisit(), AIssueId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ACommentUserId">用户标识</param>
 */
protected List<IssueComment> issueCommentSelectObjectsByCommentUserId(int ACommentUserId) throws SQLException, DbException {
	return IssueComment.selectObjectsByCommentUserId(this.getDataVisit(), ACommentUserId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueComment> issueCommentSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueComment.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<IssueComment> issueCommentSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return IssueComment.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueComment> issueCommentSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueComment.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<IssueComment> issueCommentSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return IssueComment.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends IssueComment> List<T> issueCommentSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueComment.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends IssueComment> List<T> issueCommentSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueComment.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int issueCommentQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_ISSUE_COMMENT].* from [T_ISSUE_COMMENT]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Issue到数据库中
 * <param name="issue">需要插入的Issue</param>
 */
protected void issueInsert(Issue issue) throws SQLException, DbException {
	Issue.insert(this.getDataVisit(), issue);
}

/**
 * 更新一个对象Issue到数据库中
 * <param name="issue">需要更新的Issue</param>
 */
protected int issueUpdate(Issue issue) throws SQLException, DbException {
	return this.issueUpdate(issue, "");
}

/**
 * 更新一个对象Issue到数据库中
 * <param name="issue">需要更新的Issue</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int issueUpdate(Issue issue, String appendConditionSql) throws SQLException, DbException {
	return Issue.update(this.getDataVisit(), issue, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Issue
 * <param name="AIssueId">问题标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void issueDeleteByIssueId(int AIssueId, String appendConditionSql) throws SQLException, DbException {
	Issue.deleteByIssueId(this.getDataVisit(), AIssueId, appendConditionSql);
}

/**
 * <param name="issue">从数据库中删除一个对象Issue</param>
 * <param name="AIssueId">问题标识</param>
 */
protected void issueDeleteByIssueId(int AIssueId) throws SQLException, DbException {
	this.issueDeleteByIssueId(AIssueId, "");
}

/**
 * 从数据库中删除一批对象Issue
 * <param name="APrioritiesId">优先级别</param>
 */
protected void issueDeleteListByPrioritiesId(Byte APrioritiesId) throws SQLException, DbException {
	Issue.deleteListByPrioritiesId(this.getDataVisit(), APrioritiesId);
}

/**
 * 从数据库中删除一批对象Issue
 * <param name="AIssueProjectId">项目标识</param>
 */
protected void issueDeleteListByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	Issue.deleteListByIssueProjectId(this.getDataVisit(), AIssueProjectId);
}

/**
 * 从数据库中删除一批对象Issue
 * <param name="AIssueProjectModuleId">标识</param>
 */
protected void issueDeleteListByIssueProjectModuleId(Integer AIssueProjectModuleId) throws SQLException, DbException {
	Issue.deleteListByIssueProjectModuleId(this.getDataVisit(), AIssueProjectModuleId);
}

/**
 * 从数据库中删除一批对象Issue
 * <param name="AStatusId">状态标识</param>
 */
protected void issueDeleteListByStatusId(int AStatusId) throws SQLException, DbException {
	Issue.deleteListByStatusId(this.getDataVisit(), AStatusId);
}

/**
 * 从数据库中删除一批对象Issue
 * <param name="AReportUserId">报告用户</param>
 */
protected void issueDeleteListByReportUserId(int AReportUserId) throws SQLException, DbException {
	Issue.deleteListByReportUserId(this.getDataVisit(), AReportUserId);
}

/**
 * 从数据库中删除一批对象Issue
 * <param name="AAssignUserId">关联处理用户</param>
 */
protected void issueDeleteListByAssignUserId(int AAssignUserId) throws SQLException, DbException {
	Issue.deleteListByAssignUserId(this.getDataVisit(), AAssignUserId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueId">问题标识</param>
 */
protected Issue issueSelectByIssueId(int AIssueId) throws SQLException, DbException {
	return Issue.selectByIssueId(this.getDataVisit(), AIssueId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="APrioritiesId">优先级别</param>
 */
protected List<Issue> issueSelectObjectsByPrioritiesId(Byte APrioritiesId) throws SQLException, DbException {
	return Issue.selectObjectsByPrioritiesId(this.getDataVisit(), APrioritiesId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectId">项目标识</param>
 */
protected List<Issue> issueSelectObjectsByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	return Issue.selectObjectsByIssueProjectId(this.getDataVisit(), AIssueProjectId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectModuleId">标识</param>
 */
protected List<Issue> issueSelectObjectsByIssueProjectModuleId(Integer AIssueProjectModuleId) throws SQLException, DbException {
	return Issue.selectObjectsByIssueProjectModuleId(this.getDataVisit(), AIssueProjectModuleId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AStatusId">状态标识</param>
 */
protected List<Issue> issueSelectObjectsByStatusId(int AStatusId) throws SQLException, DbException {
	return Issue.selectObjectsByStatusId(this.getDataVisit(), AStatusId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AReportUserId">报告用户</param>
 */
protected List<Issue> issueSelectObjectsByReportUserId(int AReportUserId) throws SQLException, DbException {
	return Issue.selectObjectsByReportUserId(this.getDataVisit(), AReportUserId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AAssignUserId">关联处理用户</param>
 */
protected List<Issue> issueSelectObjectsByAssignUserId(int AAssignUserId) throws SQLException, DbException {
	return Issue.selectObjectsByAssignUserId(this.getDataVisit(), AAssignUserId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Issue> issueSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Issue.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Issue> issueSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Issue.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Issue> issueSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Issue.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Issue> issueSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Issue.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Issue> List<T> issueSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Issue.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Issue> List<T> issueSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Issue.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int issueQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_ISSUE].* from [T_ISSUE]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象FuncProcedure到数据库中
 * <param name="funcProcedure">需要插入的FuncProcedure</param>
 */
protected void funcProcedureInsert(FuncProcedure funcProcedure) throws SQLException, DbException {
	FuncProcedure.insert(this.getDataVisit(), funcProcedure);
}

/**
 * 更新一个对象FuncProcedure到数据库中
 * <param name="funcProcedure">需要更新的FuncProcedure</param>
 */
protected int funcProcedureUpdate(FuncProcedure funcProcedure) throws SQLException, DbException {
	return this.funcProcedureUpdate(funcProcedure, "");
}

/**
 * 更新一个对象FuncProcedure到数据库中
 * <param name="funcProcedure">需要更新的FuncProcedure</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int funcProcedureUpdate(FuncProcedure funcProcedure, String appendConditionSql) throws SQLException, DbException {
	return FuncProcedure.update(this.getDataVisit(), funcProcedure, appendConditionSql);
}

/**
 * 从数据库中删除一个对象FuncProcedure
 * <param name="AFuncProcedureId">函数过程标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void funcProcedureDeleteByFuncProcedureId(int AFuncProcedureId, String appendConditionSql) throws SQLException, DbException {
	FuncProcedure.deleteByFuncProcedureId(this.getDataVisit(), AFuncProcedureId, appendConditionSql);
}

/**
 * <param name="funcProcedure">从数据库中删除一个对象FuncProcedure</param>
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
protected void funcProcedureDeleteByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException {
	this.funcProcedureDeleteByFuncProcedureId(AFuncProcedureId, "");
}

/**
 * 从数据库中删除一批对象FuncProcedure
 * <param name="AFuncProjectId">函数项目标识</param>
 */
protected void funcProcedureDeleteListByFuncProjectId(int AFuncProjectId) throws SQLException, DbException {
	FuncProcedure.deleteListByFuncProjectId(this.getDataVisit(), AFuncProjectId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
protected FuncProcedure funcProcedureSelectByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException {
	return FuncProcedure.selectByFuncProcedureId(this.getDataVisit(), AFuncProcedureId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AFuncProjectId">函数项目标识</param>
 */
protected List<FuncProcedure> funcProcedureSelectObjectsByFuncProjectId(int AFuncProjectId) throws SQLException, DbException {
	return FuncProcedure.selectObjectsByFuncProjectId(this.getDataVisit(), AFuncProjectId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<FuncProcedure> funcProcedureSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return FuncProcedure.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<FuncProcedure> funcProcedureSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return FuncProcedure.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<FuncProcedure> funcProcedureSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return FuncProcedure.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<FuncProcedure> funcProcedureSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return FuncProcedure.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends FuncProcedure> List<T> funcProcedureSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return FuncProcedure.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends FuncProcedure> List<T> funcProcedureSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return FuncProcedure.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int funcProcedureQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_FUNC_PROCEDURE].* from [T_FUNC_PROCEDURE]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象OrmappingProject到数据库中
 * <param name="ormappingProject">需要插入的OrmappingProject</param>
 */
protected void ormappingProjectInsert(OrmappingProject ormappingProject) throws SQLException, DbException {
	OrmappingProject.insert(this.getDataVisit(), ormappingProject);
}

/**
 * 更新一个对象OrmappingProject到数据库中
 * <param name="ormappingProject">需要更新的OrmappingProject</param>
 */
protected int ormappingProjectUpdate(OrmappingProject ormappingProject) throws SQLException, DbException {
	return this.ormappingProjectUpdate(ormappingProject, "");
}

/**
 * 更新一个对象OrmappingProject到数据库中
 * <param name="ormappingProject">需要更新的OrmappingProject</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int ormappingProjectUpdate(OrmappingProject ormappingProject, String appendConditionSql) throws SQLException, DbException {
	return OrmappingProject.update(this.getDataVisit(), ormappingProject, appendConditionSql);
}

/**
 * 从数据库中删除一个对象OrmappingProject
 * <param name="AProjId">工程号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void ormappingProjectDeleteByProjId(int AProjId, String appendConditionSql) throws SQLException, DbException {
	OrmappingProject.deleteByProjId(this.getDataVisit(), AProjId, appendConditionSql);
}

/**
 * <param name="ormappingProject">从数据库中删除一个对象OrmappingProject</param>
 * <param name="AProjId">工程号</param>
 */
protected void ormappingProjectDeleteByProjId(int AProjId) throws SQLException, DbException {
	this.ormappingProjectDeleteByProjId(AProjId, "");
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AProjId">工程号</param>
 */
protected OrmappingProject ormappingProjectSelectByProjId(int AProjId) throws SQLException, DbException {
	return OrmappingProject.selectByProjId(this.getDataVisit(), AProjId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AProjId">工程号</param>
 */
protected List<OrmappingProject> ormappingProjectSelectObjectsByProjId(int AProjId) throws SQLException, DbException {
	return OrmappingProject.selectObjectsByProjId(this.getDataVisit(), AProjId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<OrmappingProject> ormappingProjectSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return OrmappingProject.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<OrmappingProject> ormappingProjectSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return OrmappingProject.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<OrmappingProject> ormappingProjectSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return OrmappingProject.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<OrmappingProject> ormappingProjectSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return OrmappingProject.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends OrmappingProject> List<T> ormappingProjectSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return OrmappingProject.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends OrmappingProject> List<T> ormappingProjectSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return OrmappingProject.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int ormappingProjectQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_ORMAPPING_PROJECT].* from [T_ORMAPPING_PROJECT]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象CodeBuild到数据库中
 * <param name="codeBuild">需要插入的CodeBuild</param>
 */
protected void codeBuildInsert(CodeBuild codeBuild) throws SQLException, DbException {
	CodeBuild.insert(this.getDataVisit(), codeBuild);
}

/**
 * 更新一个对象CodeBuild到数据库中
 * <param name="codeBuild">需要更新的CodeBuild</param>
 */
protected int codeBuildUpdate(CodeBuild codeBuild) throws SQLException, DbException {
	return this.codeBuildUpdate(codeBuild, "");
}

/**
 * 更新一个对象CodeBuild到数据库中
 * <param name="codeBuild">需要更新的CodeBuild</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int codeBuildUpdate(CodeBuild codeBuild, String appendConditionSql) throws SQLException, DbException {
	return CodeBuild.update(this.getDataVisit(), codeBuild, appendConditionSql);
}

/**
 * 从数据库中删除一个对象CodeBuild
 * <param name="ABuildId">构建标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void codeBuildDeleteByBuildId(int ABuildId, String appendConditionSql) throws SQLException, DbException {
	CodeBuild.deleteByBuildId(this.getDataVisit(), ABuildId, appendConditionSql);
}

/**
 * <param name="codeBuild">从数据库中删除一个对象CodeBuild</param>
 * <param name="ABuildId">构建标识</param>
 */
protected void codeBuildDeleteByBuildId(int ABuildId) throws SQLException, DbException {
	this.codeBuildDeleteByBuildId(ABuildId, "");
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ABuildId">构建标识</param>
 */
protected CodeBuild codeBuildSelectByBuildId(int ABuildId) throws SQLException, DbException {
	return CodeBuild.selectByBuildId(this.getDataVisit(), ABuildId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<CodeBuild> codeBuildSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return CodeBuild.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<CodeBuild> codeBuildSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return CodeBuild.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<CodeBuild> codeBuildSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return CodeBuild.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<CodeBuild> codeBuildSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return CodeBuild.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends CodeBuild> List<T> codeBuildSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return CodeBuild.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends CodeBuild> List<T> codeBuildSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return CodeBuild.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int codeBuildQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_CODE_BUILD].* from [T_CODE_BUILD]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Jbpm4Deployment到数据库中
 * <param name="jbpm4Deployment">需要插入的Jbpm4Deployment</param>
 */
protected void jbpm4DeploymentInsert(Jbpm4Deployment jbpm4Deployment) throws SQLException, DbException {
	Jbpm4Deployment.insert(this.getDataVisit(), jbpm4Deployment);
}

/**
 * 更新一个对象Jbpm4Deployment到数据库中
 * <param name="jbpm4Deployment">需要更新的Jbpm4Deployment</param>
 */
protected int jbpm4DeploymentUpdate(Jbpm4Deployment jbpm4Deployment) throws SQLException, DbException {
	return this.jbpm4DeploymentUpdate(jbpm4Deployment, "");
}

/**
 * 更新一个对象Jbpm4Deployment到数据库中
 * <param name="jbpm4Deployment">需要更新的Jbpm4Deployment</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int jbpm4DeploymentUpdate(Jbpm4Deployment jbpm4Deployment, String appendConditionSql) throws SQLException, DbException {
	return Jbpm4Deployment.update(this.getDataVisit(), jbpm4Deployment, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Jbpm4Deployment
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void jbpm4DeploymentDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	Jbpm4Deployment.deleteByDbid(this.getDataVisit(), ADbid, appendConditionSql);
}

/**
 * <param name="jbpm4Deployment">从数据库中删除一个对象Jbpm4Deployment</param>
 * <param name="ADbid"></param>
 */
protected void jbpm4DeploymentDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4DeploymentDeleteByDbid(ADbid, "");
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
protected Jbpm4Deployment jbpm4DeploymentSelectByDbid(double ADbid) throws SQLException, DbException {
	return Jbpm4Deployment.selectByDbid(this.getDataVisit(), ADbid);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4Deployment> jbpm4DeploymentSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4Deployment.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Jbpm4Deployment> jbpm4DeploymentSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Jbpm4Deployment.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4Deployment> jbpm4DeploymentSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4Deployment.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Jbpm4Deployment> jbpm4DeploymentSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Jbpm4Deployment.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Jbpm4Deployment> List<T> jbpm4DeploymentSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4Deployment.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Jbpm4Deployment> List<T> jbpm4DeploymentSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4Deployment.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int jbpm4DeploymentQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [JBPM4_DEPLOYMENT].* from [JBPM4_DEPLOYMENT]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象CodeBuildLog到数据库中
 * <param name="codeBuildLog">需要插入的CodeBuildLog</param>
 */
protected void codeBuildLogInsert(CodeBuildLog codeBuildLog) throws SQLException, DbException {
	CodeBuildLog.insert(this.getDataVisit(), codeBuildLog);
}

/**
 * 更新一个对象CodeBuildLog到数据库中
 * <param name="codeBuildLog">需要更新的CodeBuildLog</param>
 */
protected int codeBuildLogUpdate(CodeBuildLog codeBuildLog) throws SQLException, DbException {
	return this.codeBuildLogUpdate(codeBuildLog, "");
}

/**
 * 更新一个对象CodeBuildLog到数据库中
 * <param name="codeBuildLog">需要更新的CodeBuildLog</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int codeBuildLogUpdate(CodeBuildLog codeBuildLog, String appendConditionSql) throws SQLException, DbException {
	return CodeBuildLog.update(this.getDataVisit(), codeBuildLog, appendConditionSql);
}

/**
 * 从数据库中删除一个对象CodeBuildLog
 * <param name="ABuildLogId">构建标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void codeBuildLogDeleteByBuildLogId(int ABuildLogId, String appendConditionSql) throws SQLException, DbException {
	CodeBuildLog.deleteByBuildLogId(this.getDataVisit(), ABuildLogId, appendConditionSql);
}

/**
 * <param name="codeBuildLog">从数据库中删除一个对象CodeBuildLog</param>
 * <param name="ABuildLogId">构建标识</param>
 */
protected void codeBuildLogDeleteByBuildLogId(int ABuildLogId) throws SQLException, DbException {
	this.codeBuildLogDeleteByBuildLogId(ABuildLogId, "");
}

/**
 * 从数据库中删除一批对象CodeBuildLog
 * <param name="ABuildId">构建标识</param>
 */
protected void codeBuildLogDeleteListByBuildId(int ABuildId) throws SQLException, DbException {
	CodeBuildLog.deleteListByBuildId(this.getDataVisit(), ABuildId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ABuildLogId">构建标识</param>
 */
protected CodeBuildLog codeBuildLogSelectByBuildLogId(int ABuildLogId) throws SQLException, DbException {
	return CodeBuildLog.selectByBuildLogId(this.getDataVisit(), ABuildLogId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ABuildId">构建标识</param>
 */
protected List<CodeBuildLog> codeBuildLogSelectObjectsByBuildId(int ABuildId) throws SQLException, DbException {
	return CodeBuildLog.selectObjectsByBuildId(this.getDataVisit(), ABuildId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<CodeBuildLog> codeBuildLogSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return CodeBuildLog.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<CodeBuildLog> codeBuildLogSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return CodeBuildLog.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<CodeBuildLog> codeBuildLogSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return CodeBuildLog.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<CodeBuildLog> codeBuildLogSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return CodeBuildLog.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends CodeBuildLog> List<T> codeBuildLogSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return CodeBuildLog.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends CodeBuildLog> List<T> codeBuildLogSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return CodeBuildLog.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int codeBuildLogQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_CODE_BUILD_LOG].* from [T_CODE_BUILD_LOG]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Jbpm4Deployprop到数据库中
 * <param name="jbpm4Deployprop">需要插入的Jbpm4Deployprop</param>
 */
protected void jbpm4DeploypropInsert(Jbpm4Deployprop jbpm4Deployprop) throws SQLException, DbException {
	Jbpm4Deployprop.insert(this.getDataVisit(), jbpm4Deployprop);
}

/**
 * 更新一个对象Jbpm4Deployprop到数据库中
 * <param name="jbpm4Deployprop">需要更新的Jbpm4Deployprop</param>
 */
protected int jbpm4DeploypropUpdate(Jbpm4Deployprop jbpm4Deployprop) throws SQLException, DbException {
	return this.jbpm4DeploypropUpdate(jbpm4Deployprop, "");
}

/**
 * 更新一个对象Jbpm4Deployprop到数据库中
 * <param name="jbpm4Deployprop">需要更新的Jbpm4Deployprop</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int jbpm4DeploypropUpdate(Jbpm4Deployprop jbpm4Deployprop, String appendConditionSql) throws SQLException, DbException {
	return Jbpm4Deployprop.update(this.getDataVisit(), jbpm4Deployprop, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Jbpm4Deployprop
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void jbpm4DeploypropDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	Jbpm4Deployprop.deleteByDbid(this.getDataVisit(), ADbid, appendConditionSql);
}

/**
 * <param name="jbpm4Deployprop">从数据库中删除一个对象Jbpm4Deployprop</param>
 * <param name="ADbid"></param>
 */
protected void jbpm4DeploypropDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4DeploypropDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4Deployprop
 * <param name="ADeployment"></param>
 */
protected void jbpm4DeploypropDeleteListByDeployment(Double ADeployment) throws SQLException, DbException {
	Jbpm4Deployprop.deleteListByDeployment(this.getDataVisit(), ADeployment);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
protected Jbpm4Deployprop jbpm4DeploypropSelectByDbid(double ADbid) throws SQLException, DbException {
	return Jbpm4Deployprop.selectByDbid(this.getDataVisit(), ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ADeployment"></param>
 */
protected List<Jbpm4Deployprop> jbpm4DeploypropSelectObjectsByDeployment(Double ADeployment) throws SQLException, DbException {
	return Jbpm4Deployprop.selectObjectsByDeployment(this.getDataVisit(), ADeployment);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4Deployprop> jbpm4DeploypropSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4Deployprop.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Jbpm4Deployprop> jbpm4DeploypropSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Jbpm4Deployprop.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4Deployprop> jbpm4DeploypropSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4Deployprop.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Jbpm4Deployprop> jbpm4DeploypropSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Jbpm4Deployprop.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Jbpm4Deployprop> List<T> jbpm4DeploypropSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4Deployprop.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Jbpm4Deployprop> List<T> jbpm4DeploypropSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4Deployprop.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int jbpm4DeploypropQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [JBPM4_DEPLOYPROP].* from [JBPM4_DEPLOYPROP]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象CodeBuildProperty到数据库中
 * <param name="codeBuildProperty">需要插入的CodeBuildProperty</param>
 */
protected void codeBuildPropertyInsert(CodeBuildProperty codeBuildProperty) throws SQLException, DbException {
	CodeBuildProperty.insert(this.getDataVisit(), codeBuildProperty);
}

/**
 * 更新一个对象CodeBuildProperty到数据库中
 * <param name="codeBuildProperty">需要更新的CodeBuildProperty</param>
 */
protected int codeBuildPropertyUpdate(CodeBuildProperty codeBuildProperty) throws SQLException, DbException {
	return this.codeBuildPropertyUpdate(codeBuildProperty, "");
}

/**
 * 更新一个对象CodeBuildProperty到数据库中
 * <param name="codeBuildProperty">需要更新的CodeBuildProperty</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int codeBuildPropertyUpdate(CodeBuildProperty codeBuildProperty, String appendConditionSql) throws SQLException, DbException {
	return CodeBuildProperty.update(this.getDataVisit(), codeBuildProperty, appendConditionSql);
}

/**
 * 从数据库中删除一个对象CodeBuildProperty
 * <param name="ABuildPropertyId">属性标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void codeBuildPropertyDeleteByBuildPropertyId(int ABuildPropertyId, String appendConditionSql) throws SQLException, DbException {
	CodeBuildProperty.deleteByBuildPropertyId(this.getDataVisit(), ABuildPropertyId, appendConditionSql);
}

/**
 * <param name="codeBuildProperty">从数据库中删除一个对象CodeBuildProperty</param>
 * <param name="ABuildPropertyId">属性标识</param>
 */
protected void codeBuildPropertyDeleteByBuildPropertyId(int ABuildPropertyId) throws SQLException, DbException {
	this.codeBuildPropertyDeleteByBuildPropertyId(ABuildPropertyId, "");
}

/**
 * 从数据库中删除一批对象CodeBuildProperty
 * <param name="ABuildId">构建标识</param>
 */
protected void codeBuildPropertyDeleteListByBuildId(int ABuildId) throws SQLException, DbException {
	CodeBuildProperty.deleteListByBuildId(this.getDataVisit(), ABuildId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ABuildPropertyId">属性标识</param>
 */
protected CodeBuildProperty codeBuildPropertySelectByBuildPropertyId(int ABuildPropertyId) throws SQLException, DbException {
	return CodeBuildProperty.selectByBuildPropertyId(this.getDataVisit(), ABuildPropertyId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ABuildId">构建标识</param>
 */
protected List<CodeBuildProperty> codeBuildPropertySelectObjectsByBuildId(int ABuildId) throws SQLException, DbException {
	return CodeBuildProperty.selectObjectsByBuildId(this.getDataVisit(), ABuildId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<CodeBuildProperty> codeBuildPropertySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return CodeBuildProperty.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<CodeBuildProperty> codeBuildPropertySelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return CodeBuildProperty.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<CodeBuildProperty> codeBuildPropertySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return CodeBuildProperty.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<CodeBuildProperty> codeBuildPropertySelectObjects(String appendConditionSql) throws SQLException, DbException {
	return CodeBuildProperty.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends CodeBuildProperty> List<T> codeBuildPropertySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return CodeBuildProperty.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends CodeBuildProperty> List<T> codeBuildPropertySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return CodeBuildProperty.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int codeBuildPropertyQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_CODE_BUILD_PROPERTY].* from [T_CODE_BUILD_PROPERTY]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Jbpm4Execution到数据库中
 * <param name="jbpm4Execution">需要插入的Jbpm4Execution</param>
 */
protected void jbpm4ExecutionInsert(Jbpm4Execution jbpm4Execution) throws SQLException, DbException {
	Jbpm4Execution.insert(this.getDataVisit(), jbpm4Execution);
}

/**
 * 更新一个对象Jbpm4Execution到数据库中
 * <param name="jbpm4Execution">需要更新的Jbpm4Execution</param>
 */
protected int jbpm4ExecutionUpdate(Jbpm4Execution jbpm4Execution) throws SQLException, DbException {
	return this.jbpm4ExecutionUpdate(jbpm4Execution, "");
}

/**
 * 更新一个对象Jbpm4Execution到数据库中
 * <param name="jbpm4Execution">需要更新的Jbpm4Execution</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int jbpm4ExecutionUpdate(Jbpm4Execution jbpm4Execution, String appendConditionSql) throws SQLException, DbException {
	return Jbpm4Execution.update(this.getDataVisit(), jbpm4Execution, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Jbpm4Execution
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void jbpm4ExecutionDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	Jbpm4Execution.deleteByDbid(this.getDataVisit(), ADbid, appendConditionSql);
}

/**
 * <param name="jbpm4Execution">从数据库中删除一个对象Jbpm4Execution</param>
 * <param name="ADbid"></param>
 */
protected void jbpm4ExecutionDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4ExecutionDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一个对象Jbpm4Execution
 * <param name="AId"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void jbpm4ExecutionDeleteById(String AId, String appendConditionSql) throws SQLException, DbException {
	Jbpm4Execution.deleteById(this.getDataVisit(), AId, appendConditionSql);
}

/**
 * <param name="jbpm4Execution">从数据库中删除一个对象Jbpm4Execution</param>
 * <param name="AId"></param>
 */
protected void jbpm4ExecutionDeleteById(String AId) throws SQLException, DbException {
	this.jbpm4ExecutionDeleteById(AId, "");
}

/**
 * 从数据库中删除一批对象Jbpm4Execution
 * <param name="ASubprocinst"></param>
 */
protected void jbpm4ExecutionDeleteListBySubprocinst(Double ASubprocinst) throws SQLException, DbException {
	Jbpm4Execution.deleteListBySubprocinst(this.getDataVisit(), ASubprocinst);
}

/**
 * 从数据库中删除一批对象Jbpm4Execution
 * <param name="AInstance"></param>
 */
protected void jbpm4ExecutionDeleteListByInstance(Double AInstance) throws SQLException, DbException {
	Jbpm4Execution.deleteListByInstance(this.getDataVisit(), AInstance);
}

/**
 * 从数据库中删除一批对象Jbpm4Execution
 * <param name="ASuperexec"></param>
 */
protected void jbpm4ExecutionDeleteListBySuperexec(Double ASuperexec) throws SQLException, DbException {
	Jbpm4Execution.deleteListBySuperexec(this.getDataVisit(), ASuperexec);
}

/**
 * 从数据库中删除一批对象Jbpm4Execution
 * <param name="AParent"></param>
 */
protected void jbpm4ExecutionDeleteListByParent(Double AParent) throws SQLException, DbException {
	Jbpm4Execution.deleteListByParent(this.getDataVisit(), AParent);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
protected Jbpm4Execution jbpm4ExecutionSelectByDbid(double ADbid) throws SQLException, DbException {
	return Jbpm4Execution.selectByDbid(this.getDataVisit(), ADbid);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AId"></param>
 */
protected Jbpm4Execution jbpm4ExecutionSelectById(String AId) throws SQLException, DbException {
	return Jbpm4Execution.selectById(this.getDataVisit(), AId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ASubprocinst"></param>
 */
protected List<Jbpm4Execution> jbpm4ExecutionSelectObjectsBySubprocinst(Double ASubprocinst) throws SQLException, DbException {
	return Jbpm4Execution.selectObjectsBySubprocinst(this.getDataVisit(), ASubprocinst);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AInstance"></param>
 */
protected List<Jbpm4Execution> jbpm4ExecutionSelectObjectsByInstance(Double AInstance) throws SQLException, DbException {
	return Jbpm4Execution.selectObjectsByInstance(this.getDataVisit(), AInstance);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ASuperexec"></param>
 */
protected List<Jbpm4Execution> jbpm4ExecutionSelectObjectsBySuperexec(Double ASuperexec) throws SQLException, DbException {
	return Jbpm4Execution.selectObjectsBySuperexec(this.getDataVisit(), ASuperexec);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AParent"></param>
 */
protected List<Jbpm4Execution> jbpm4ExecutionSelectObjectsByParent(Double AParent) throws SQLException, DbException {
	return Jbpm4Execution.selectObjectsByParent(this.getDataVisit(), AParent);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4Execution> jbpm4ExecutionSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4Execution.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Jbpm4Execution> jbpm4ExecutionSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Jbpm4Execution.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4Execution> jbpm4ExecutionSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4Execution.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Jbpm4Execution> jbpm4ExecutionSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Jbpm4Execution.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Jbpm4Execution> List<T> jbpm4ExecutionSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4Execution.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Jbpm4Execution> List<T> jbpm4ExecutionSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4Execution.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int jbpm4ExecutionQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [JBPM4_EXECUTION].* from [JBPM4_EXECUTION]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象CodeBuildProcedure到数据库中
 * <param name="codeBuildProcedure">需要插入的CodeBuildProcedure</param>
 */
protected void codeBuildProcedureInsert(CodeBuildProcedure codeBuildProcedure) throws SQLException, DbException {
	CodeBuildProcedure.insert(this.getDataVisit(), codeBuildProcedure);
}

/**
 * 更新一个对象CodeBuildProcedure到数据库中
 * <param name="codeBuildProcedure">需要更新的CodeBuildProcedure</param>
 */
protected int codeBuildProcedureUpdate(CodeBuildProcedure codeBuildProcedure) throws SQLException, DbException {
	return this.codeBuildProcedureUpdate(codeBuildProcedure, "");
}

/**
 * 更新一个对象CodeBuildProcedure到数据库中
 * <param name="codeBuildProcedure">需要更新的CodeBuildProcedure</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int codeBuildProcedureUpdate(CodeBuildProcedure codeBuildProcedure, String appendConditionSql) throws SQLException, DbException {
	return CodeBuildProcedure.update(this.getDataVisit(), codeBuildProcedure, appendConditionSql);
}

/**
 * 从数据库中删除一个对象CodeBuildProcedure
 * <param name="ABuildProcedureId">构建过程标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void codeBuildProcedureDeleteByBuildProcedureId(int ABuildProcedureId, String appendConditionSql) throws SQLException, DbException {
	CodeBuildProcedure.deleteByBuildProcedureId(this.getDataVisit(), ABuildProcedureId, appendConditionSql);
}

/**
 * <param name="codeBuildProcedure">从数据库中删除一个对象CodeBuildProcedure</param>
 * <param name="ABuildProcedureId">构建过程标识</param>
 */
protected void codeBuildProcedureDeleteByBuildProcedureId(int ABuildProcedureId) throws SQLException, DbException {
	this.codeBuildProcedureDeleteByBuildProcedureId(ABuildProcedureId, "");
}

/**
 * 从数据库中删除一批对象CodeBuildProcedure
 * <param name="ABuildId">构建标识</param>
 */
protected void codeBuildProcedureDeleteListByBuildId(int ABuildId) throws SQLException, DbException {
	CodeBuildProcedure.deleteListByBuildId(this.getDataVisit(), ABuildId);
}

/**
 * 从数据库中删除一批对象CodeBuildProcedure
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
protected void codeBuildProcedureDeleteListByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException {
	CodeBuildProcedure.deleteListByFuncProcedureId(this.getDataVisit(), AFuncProcedureId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ABuildProcedureId">构建过程标识</param>
 */
protected CodeBuildProcedure codeBuildProcedureSelectByBuildProcedureId(int ABuildProcedureId) throws SQLException, DbException {
	return CodeBuildProcedure.selectByBuildProcedureId(this.getDataVisit(), ABuildProcedureId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ABuildId">构建标识</param>
 */
protected List<CodeBuildProcedure> codeBuildProcedureSelectObjectsByBuildId(int ABuildId) throws SQLException, DbException {
	return CodeBuildProcedure.selectObjectsByBuildId(this.getDataVisit(), ABuildId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
protected List<CodeBuildProcedure> codeBuildProcedureSelectObjectsByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException {
	return CodeBuildProcedure.selectObjectsByFuncProcedureId(this.getDataVisit(), AFuncProcedureId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<CodeBuildProcedure> codeBuildProcedureSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return CodeBuildProcedure.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<CodeBuildProcedure> codeBuildProcedureSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return CodeBuildProcedure.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<CodeBuildProcedure> codeBuildProcedureSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return CodeBuildProcedure.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<CodeBuildProcedure> codeBuildProcedureSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return CodeBuildProcedure.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends CodeBuildProcedure> List<T> codeBuildProcedureSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return CodeBuildProcedure.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends CodeBuildProcedure> List<T> codeBuildProcedureSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return CodeBuildProcedure.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int codeBuildProcedureQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_CODE_BUILD_PROCEDURE].* from [T_CODE_BUILD_PROCEDURE]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Jbpm4HistActinst到数据库中
 * <param name="jbpm4HistActinst">需要插入的Jbpm4HistActinst</param>
 */
protected void jbpm4HistActinstInsert(Jbpm4HistActinst jbpm4HistActinst) throws SQLException, DbException {
	Jbpm4HistActinst.insert(this.getDataVisit(), jbpm4HistActinst);
}

/**
 * 更新一个对象Jbpm4HistActinst到数据库中
 * <param name="jbpm4HistActinst">需要更新的Jbpm4HistActinst</param>
 */
protected int jbpm4HistActinstUpdate(Jbpm4HistActinst jbpm4HistActinst) throws SQLException, DbException {
	return this.jbpm4HistActinstUpdate(jbpm4HistActinst, "");
}

/**
 * 更新一个对象Jbpm4HistActinst到数据库中
 * <param name="jbpm4HistActinst">需要更新的Jbpm4HistActinst</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int jbpm4HistActinstUpdate(Jbpm4HistActinst jbpm4HistActinst, String appendConditionSql) throws SQLException, DbException {
	return Jbpm4HistActinst.update(this.getDataVisit(), jbpm4HistActinst, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Jbpm4HistActinst
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void jbpm4HistActinstDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	Jbpm4HistActinst.deleteByDbid(this.getDataVisit(), ADbid, appendConditionSql);
}

/**
 * <param name="jbpm4HistActinst">从数据库中删除一个对象Jbpm4HistActinst</param>
 * <param name="ADbid"></param>
 */
protected void jbpm4HistActinstDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4HistActinstDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4HistActinst
 * <param name="AHproci"></param>
 */
protected void jbpm4HistActinstDeleteListByHproci(Double AHproci) throws SQLException, DbException {
	Jbpm4HistActinst.deleteListByHproci(this.getDataVisit(), AHproci);
}

/**
 * 从数据库中删除一批对象Jbpm4HistActinst
 * <param name="AHtask"></param>
 */
protected void jbpm4HistActinstDeleteListByHtask(Double AHtask) throws SQLException, DbException {
	Jbpm4HistActinst.deleteListByHtask(this.getDataVisit(), AHtask);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
protected Jbpm4HistActinst jbpm4HistActinstSelectByDbid(double ADbid) throws SQLException, DbException {
	return Jbpm4HistActinst.selectByDbid(this.getDataVisit(), ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHproci"></param>
 */
protected List<Jbpm4HistActinst> jbpm4HistActinstSelectObjectsByHproci(Double AHproci) throws SQLException, DbException {
	return Jbpm4HistActinst.selectObjectsByHproci(this.getDataVisit(), AHproci);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHtask"></param>
 */
protected List<Jbpm4HistActinst> jbpm4HistActinstSelectObjectsByHtask(Double AHtask) throws SQLException, DbException {
	return Jbpm4HistActinst.selectObjectsByHtask(this.getDataVisit(), AHtask);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4HistActinst> jbpm4HistActinstSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4HistActinst.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Jbpm4HistActinst> jbpm4HistActinstSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Jbpm4HistActinst.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4HistActinst> jbpm4HistActinstSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4HistActinst.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Jbpm4HistActinst> jbpm4HistActinstSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Jbpm4HistActinst.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Jbpm4HistActinst> List<T> jbpm4HistActinstSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4HistActinst.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Jbpm4HistActinst> List<T> jbpm4HistActinstSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4HistActinst.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int jbpm4HistActinstQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [JBPM4_HIST_ACTINST].* from [JBPM4_HIST_ACTINST]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象IssueUserDefaultQuery到数据库中
 * <param name="issueUserDefaultQuery">需要插入的IssueUserDefaultQuery</param>
 */
protected void issueUserDefaultQueryInsert(IssueUserDefaultQuery issueUserDefaultQuery) throws SQLException, DbException {
	IssueUserDefaultQuery.insert(this.getDataVisit(), issueUserDefaultQuery);
}

/**
 * 更新一个对象IssueUserDefaultQuery到数据库中
 * <param name="issueUserDefaultQuery">需要更新的IssueUserDefaultQuery</param>
 */
protected int issueUserDefaultQueryUpdate(IssueUserDefaultQuery issueUserDefaultQuery) throws SQLException, DbException {
	return this.issueUserDefaultQueryUpdate(issueUserDefaultQuery, "");
}

/**
 * 更新一个对象IssueUserDefaultQuery到数据库中
 * <param name="issueUserDefaultQuery">需要更新的IssueUserDefaultQuery</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int issueUserDefaultQueryUpdate(IssueUserDefaultQuery issueUserDefaultQuery, String appendConditionSql) throws SQLException, DbException {
	return IssueUserDefaultQuery.update(this.getDataVisit(), issueUserDefaultQuery, appendConditionSql);
}

/**
 * 从数据库中删除一个对象IssueUserDefaultQuery
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void issueUserDefaultQueryDeleteByIssueProjectIdIssueUserId(int AIssueProjectId, int AIssueUserId, String appendConditionSql) throws SQLException, DbException {
	IssueUserDefaultQuery.deleteByIssueProjectIdIssueUserId(this.getDataVisit(), AIssueProjectId, AIssueUserId, appendConditionSql);
}

/**
 * <param name="issueUserDefaultQuery">从数据库中删除一个对象IssueUserDefaultQuery</param>
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 */
protected void issueUserDefaultQueryDeleteByIssueProjectIdIssueUserId(int AIssueProjectId, int AIssueUserId) throws SQLException, DbException {
	this.issueUserDefaultQueryDeleteByIssueProjectIdIssueUserId(AIssueProjectId, AIssueUserId, "");
}

/**
 * 从数据库中删除一批对象IssueUserDefaultQuery
 * <param name="AIssueProjectId">标识</param>
 */
protected void issueUserDefaultQueryDeleteListByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	IssueUserDefaultQuery.deleteListByIssueProjectId(this.getDataVisit(), AIssueProjectId);
}

/**
 * 从数据库中删除一批对象IssueUserDefaultQuery
 * <param name="AIssueQueryId">标识</param>
 */
protected void issueUserDefaultQueryDeleteListByIssueQueryId(int AIssueQueryId) throws SQLException, DbException {
	IssueUserDefaultQuery.deleteListByIssueQueryId(this.getDataVisit(), AIssueQueryId);
}

/**
 * 从数据库中删除一批对象IssueUserDefaultQuery
 * <param name="AIssueUserId">用户标识</param>
 */
protected void issueUserDefaultQueryDeleteListByIssueUserId(int AIssueUserId) throws SQLException, DbException {
	IssueUserDefaultQuery.deleteListByIssueUserId(this.getDataVisit(), AIssueUserId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 */
protected IssueUserDefaultQuery issueUserDefaultQuerySelectByIssueProjectIdIssueUserId(int AIssueProjectId, int AIssueUserId) throws SQLException, DbException {
	return IssueUserDefaultQuery.selectByIssueProjectIdIssueUserId(this.getDataVisit(), AIssueProjectId, AIssueUserId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectId">标识</param>
 */
protected List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjectsByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	return IssueUserDefaultQuery.selectObjectsByIssueProjectId(this.getDataVisit(), AIssueProjectId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueQueryId">标识</param>
 */
protected List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjectsByIssueQueryId(int AIssueQueryId) throws SQLException, DbException {
	return IssueUserDefaultQuery.selectObjectsByIssueQueryId(this.getDataVisit(), AIssueQueryId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueUserId">用户标识</param>
 */
protected List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjectsByIssueUserId(int AIssueUserId) throws SQLException, DbException {
	return IssueUserDefaultQuery.selectObjectsByIssueUserId(this.getDataVisit(), AIssueUserId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueUserDefaultQuery.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return IssueUserDefaultQuery.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueUserDefaultQuery.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjects(String appendConditionSql) throws SQLException, DbException {
	return IssueUserDefaultQuery.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends IssueUserDefaultQuery> List<T> issueUserDefaultQuerySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueUserDefaultQuery.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends IssueUserDefaultQuery> List<T> issueUserDefaultQuerySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueUserDefaultQuery.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int issueUserDefaultQueryQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_ISSUE_USER_DEFAULT_QUERY].* from [T_ISSUE_USER_DEFAULT_QUERY]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Jbpm4HistDetail到数据库中
 * <param name="jbpm4HistDetail">需要插入的Jbpm4HistDetail</param>
 */
protected void jbpm4HistDetailInsert(Jbpm4HistDetail jbpm4HistDetail) throws SQLException, DbException {
	Jbpm4HistDetail.insert(this.getDataVisit(), jbpm4HistDetail);
}

/**
 * 更新一个对象Jbpm4HistDetail到数据库中
 * <param name="jbpm4HistDetail">需要更新的Jbpm4HistDetail</param>
 */
protected int jbpm4HistDetailUpdate(Jbpm4HistDetail jbpm4HistDetail) throws SQLException, DbException {
	return this.jbpm4HistDetailUpdate(jbpm4HistDetail, "");
}

/**
 * 更新一个对象Jbpm4HistDetail到数据库中
 * <param name="jbpm4HistDetail">需要更新的Jbpm4HistDetail</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int jbpm4HistDetailUpdate(Jbpm4HistDetail jbpm4HistDetail, String appendConditionSql) throws SQLException, DbException {
	return Jbpm4HistDetail.update(this.getDataVisit(), jbpm4HistDetail, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Jbpm4HistDetail
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void jbpm4HistDetailDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	Jbpm4HistDetail.deleteByDbid(this.getDataVisit(), ADbid, appendConditionSql);
}

/**
 * <param name="jbpm4HistDetail">从数据库中删除一个对象Jbpm4HistDetail</param>
 * <param name="ADbid"></param>
 */
protected void jbpm4HistDetailDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4HistDetailDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4HistDetail
 * <param name="AHacti"></param>
 */
protected void jbpm4HistDetailDeleteListByHacti(Double AHacti) throws SQLException, DbException {
	Jbpm4HistDetail.deleteListByHacti(this.getDataVisit(), AHacti);
}

/**
 * 从数据库中删除一批对象Jbpm4HistDetail
 * <param name="AHproci"></param>
 */
protected void jbpm4HistDetailDeleteListByHproci(Double AHproci) throws SQLException, DbException {
	Jbpm4HistDetail.deleteListByHproci(this.getDataVisit(), AHproci);
}

/**
 * 从数据库中删除一批对象Jbpm4HistDetail
 * <param name="AHtask"></param>
 */
protected void jbpm4HistDetailDeleteListByHtask(Double AHtask) throws SQLException, DbException {
	Jbpm4HistDetail.deleteListByHtask(this.getDataVisit(), AHtask);
}

/**
 * 从数据库中删除一批对象Jbpm4HistDetail
 * <param name="AHvar"></param>
 */
protected void jbpm4HistDetailDeleteListByHvar(Double AHvar) throws SQLException, DbException {
	Jbpm4HistDetail.deleteListByHvar(this.getDataVisit(), AHvar);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
protected Jbpm4HistDetail jbpm4HistDetailSelectByDbid(double ADbid) throws SQLException, DbException {
	return Jbpm4HistDetail.selectByDbid(this.getDataVisit(), ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHacti"></param>
 */
protected List<Jbpm4HistDetail> jbpm4HistDetailSelectObjectsByHacti(Double AHacti) throws SQLException, DbException {
	return Jbpm4HistDetail.selectObjectsByHacti(this.getDataVisit(), AHacti);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHproci"></param>
 */
protected List<Jbpm4HistDetail> jbpm4HistDetailSelectObjectsByHproci(Double AHproci) throws SQLException, DbException {
	return Jbpm4HistDetail.selectObjectsByHproci(this.getDataVisit(), AHproci);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHtask"></param>
 */
protected List<Jbpm4HistDetail> jbpm4HistDetailSelectObjectsByHtask(Double AHtask) throws SQLException, DbException {
	return Jbpm4HistDetail.selectObjectsByHtask(this.getDataVisit(), AHtask);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHvar"></param>
 */
protected List<Jbpm4HistDetail> jbpm4HistDetailSelectObjectsByHvar(Double AHvar) throws SQLException, DbException {
	return Jbpm4HistDetail.selectObjectsByHvar(this.getDataVisit(), AHvar);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4HistDetail> jbpm4HistDetailSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4HistDetail.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Jbpm4HistDetail> jbpm4HistDetailSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Jbpm4HistDetail.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4HistDetail> jbpm4HistDetailSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4HistDetail.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Jbpm4HistDetail> jbpm4HistDetailSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Jbpm4HistDetail.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Jbpm4HistDetail> List<T> jbpm4HistDetailSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4HistDetail.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Jbpm4HistDetail> List<T> jbpm4HistDetailSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4HistDetail.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int jbpm4HistDetailQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [JBPM4_HIST_DETAIL].* from [JBPM4_HIST_DETAIL]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Jbpm4HistProcinst到数据库中
 * <param name="jbpm4HistProcinst">需要插入的Jbpm4HistProcinst</param>
 */
protected void jbpm4HistProcinstInsert(Jbpm4HistProcinst jbpm4HistProcinst) throws SQLException, DbException {
	Jbpm4HistProcinst.insert(this.getDataVisit(), jbpm4HistProcinst);
}

/**
 * 更新一个对象Jbpm4HistProcinst到数据库中
 * <param name="jbpm4HistProcinst">需要更新的Jbpm4HistProcinst</param>
 */
protected int jbpm4HistProcinstUpdate(Jbpm4HistProcinst jbpm4HistProcinst) throws SQLException, DbException {
	return this.jbpm4HistProcinstUpdate(jbpm4HistProcinst, "");
}

/**
 * 更新一个对象Jbpm4HistProcinst到数据库中
 * <param name="jbpm4HistProcinst">需要更新的Jbpm4HistProcinst</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int jbpm4HistProcinstUpdate(Jbpm4HistProcinst jbpm4HistProcinst, String appendConditionSql) throws SQLException, DbException {
	return Jbpm4HistProcinst.update(this.getDataVisit(), jbpm4HistProcinst, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Jbpm4HistProcinst
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void jbpm4HistProcinstDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	Jbpm4HistProcinst.deleteByDbid(this.getDataVisit(), ADbid, appendConditionSql);
}

/**
 * <param name="jbpm4HistProcinst">从数据库中删除一个对象Jbpm4HistProcinst</param>
 * <param name="ADbid"></param>
 */
protected void jbpm4HistProcinstDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4HistProcinstDeleteByDbid(ADbid, "");
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
protected Jbpm4HistProcinst jbpm4HistProcinstSelectByDbid(double ADbid) throws SQLException, DbException {
	return Jbpm4HistProcinst.selectByDbid(this.getDataVisit(), ADbid);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4HistProcinst> jbpm4HistProcinstSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4HistProcinst.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Jbpm4HistProcinst> jbpm4HistProcinstSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Jbpm4HistProcinst.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4HistProcinst> jbpm4HistProcinstSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4HistProcinst.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Jbpm4HistProcinst> jbpm4HistProcinstSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Jbpm4HistProcinst.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Jbpm4HistProcinst> List<T> jbpm4HistProcinstSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4HistProcinst.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Jbpm4HistProcinst> List<T> jbpm4HistProcinstSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4HistProcinst.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int jbpm4HistProcinstQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [JBPM4_HIST_PROCINST].* from [JBPM4_HIST_PROCINST]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Jbpm4HistTask到数据库中
 * <param name="jbpm4HistTask">需要插入的Jbpm4HistTask</param>
 */
protected void jbpm4HistTaskInsert(Jbpm4HistTask jbpm4HistTask) throws SQLException, DbException {
	Jbpm4HistTask.insert(this.getDataVisit(), jbpm4HistTask);
}

/**
 * 更新一个对象Jbpm4HistTask到数据库中
 * <param name="jbpm4HistTask">需要更新的Jbpm4HistTask</param>
 */
protected int jbpm4HistTaskUpdate(Jbpm4HistTask jbpm4HistTask) throws SQLException, DbException {
	return this.jbpm4HistTaskUpdate(jbpm4HistTask, "");
}

/**
 * 更新一个对象Jbpm4HistTask到数据库中
 * <param name="jbpm4HistTask">需要更新的Jbpm4HistTask</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int jbpm4HistTaskUpdate(Jbpm4HistTask jbpm4HistTask, String appendConditionSql) throws SQLException, DbException {
	return Jbpm4HistTask.update(this.getDataVisit(), jbpm4HistTask, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Jbpm4HistTask
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void jbpm4HistTaskDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	Jbpm4HistTask.deleteByDbid(this.getDataVisit(), ADbid, appendConditionSql);
}

/**
 * <param name="jbpm4HistTask">从数据库中删除一个对象Jbpm4HistTask</param>
 * <param name="ADbid"></param>
 */
protected void jbpm4HistTaskDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4HistTaskDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4HistTask
 * <param name="ASupertask"></param>
 */
protected void jbpm4HistTaskDeleteListBySupertask(Double ASupertask) throws SQLException, DbException {
	Jbpm4HistTask.deleteListBySupertask(this.getDataVisit(), ASupertask);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
protected Jbpm4HistTask jbpm4HistTaskSelectByDbid(double ADbid) throws SQLException, DbException {
	return Jbpm4HistTask.selectByDbid(this.getDataVisit(), ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ASupertask"></param>
 */
protected List<Jbpm4HistTask> jbpm4HistTaskSelectObjectsBySupertask(Double ASupertask) throws SQLException, DbException {
	return Jbpm4HistTask.selectObjectsBySupertask(this.getDataVisit(), ASupertask);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4HistTask> jbpm4HistTaskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4HistTask.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Jbpm4HistTask> jbpm4HistTaskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Jbpm4HistTask.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4HistTask> jbpm4HistTaskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4HistTask.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Jbpm4HistTask> jbpm4HistTaskSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Jbpm4HistTask.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Jbpm4HistTask> List<T> jbpm4HistTaskSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4HistTask.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Jbpm4HistTask> List<T> jbpm4HistTaskSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4HistTask.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int jbpm4HistTaskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [JBPM4_HIST_TASK].* from [JBPM4_HIST_TASK]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象IssueRoleDefaultQuery到数据库中
 * <param name="issueRoleDefaultQuery">需要插入的IssueRoleDefaultQuery</param>
 */
protected void issueRoleDefaultQueryInsert(IssueRoleDefaultQuery issueRoleDefaultQuery) throws SQLException, DbException {
	IssueRoleDefaultQuery.insert(this.getDataVisit(), issueRoleDefaultQuery);
}

/**
 * 更新一个对象IssueRoleDefaultQuery到数据库中
 * <param name="issueRoleDefaultQuery">需要更新的IssueRoleDefaultQuery</param>
 */
protected int issueRoleDefaultQueryUpdate(IssueRoleDefaultQuery issueRoleDefaultQuery) throws SQLException, DbException {
	return this.issueRoleDefaultQueryUpdate(issueRoleDefaultQuery, "");
}

/**
 * 更新一个对象IssueRoleDefaultQuery到数据库中
 * <param name="issueRoleDefaultQuery">需要更新的IssueRoleDefaultQuery</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int issueRoleDefaultQueryUpdate(IssueRoleDefaultQuery issueRoleDefaultQuery, String appendConditionSql) throws SQLException, DbException {
	return IssueRoleDefaultQuery.update(this.getDataVisit(), issueRoleDefaultQuery, appendConditionSql);
}

/**
 * 从数据库中删除一个对象IssueRoleDefaultQuery
 * <param name="AIssueProjectId">标识</param>
 * <param name="ARoleId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void issueRoleDefaultQueryDeleteByIssueProjectIdRoleId(int AIssueProjectId, int ARoleId, String appendConditionSql) throws SQLException, DbException {
	IssueRoleDefaultQuery.deleteByIssueProjectIdRoleId(this.getDataVisit(), AIssueProjectId, ARoleId, appendConditionSql);
}

/**
 * <param name="issueRoleDefaultQuery">从数据库中删除一个对象IssueRoleDefaultQuery</param>
 * <param name="AIssueProjectId">标识</param>
 * <param name="ARoleId">标识</param>
 */
protected void issueRoleDefaultQueryDeleteByIssueProjectIdRoleId(int AIssueProjectId, int ARoleId) throws SQLException, DbException {
	this.issueRoleDefaultQueryDeleteByIssueProjectIdRoleId(AIssueProjectId, ARoleId, "");
}

/**
 * 从数据库中删除一批对象IssueRoleDefaultQuery
 * <param name="AIssueProjectId">标识</param>
 */
protected void issueRoleDefaultQueryDeleteListByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	IssueRoleDefaultQuery.deleteListByIssueProjectId(this.getDataVisit(), AIssueProjectId);
}

/**
 * 从数据库中删除一批对象IssueRoleDefaultQuery
 * <param name="AIssueQueryId">标识</param>
 */
protected void issueRoleDefaultQueryDeleteListByIssueQueryId(int AIssueQueryId) throws SQLException, DbException {
	IssueRoleDefaultQuery.deleteListByIssueQueryId(this.getDataVisit(), AIssueQueryId);
}

/**
 * 从数据库中删除一批对象IssueRoleDefaultQuery
 * <param name="ARoleId">标识</param>
 */
protected void issueRoleDefaultQueryDeleteListByRoleId(int ARoleId) throws SQLException, DbException {
	IssueRoleDefaultQuery.deleteListByRoleId(this.getDataVisit(), ARoleId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectId">标识</param>
 * <param name="ARoleId">标识</param>
 */
protected IssueRoleDefaultQuery issueRoleDefaultQuerySelectByIssueProjectIdRoleId(int AIssueProjectId, int ARoleId) throws SQLException, DbException {
	return IssueRoleDefaultQuery.selectByIssueProjectIdRoleId(this.getDataVisit(), AIssueProjectId, ARoleId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectId">标识</param>
 */
protected List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjectsByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	return IssueRoleDefaultQuery.selectObjectsByIssueProjectId(this.getDataVisit(), AIssueProjectId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueQueryId">标识</param>
 */
protected List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjectsByIssueQueryId(int AIssueQueryId) throws SQLException, DbException {
	return IssueRoleDefaultQuery.selectObjectsByIssueQueryId(this.getDataVisit(), AIssueQueryId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ARoleId">标识</param>
 */
protected List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjectsByRoleId(int ARoleId) throws SQLException, DbException {
	return IssueRoleDefaultQuery.selectObjectsByRoleId(this.getDataVisit(), ARoleId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueRoleDefaultQuery.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return IssueRoleDefaultQuery.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueRoleDefaultQuery.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjects(String appendConditionSql) throws SQLException, DbException {
	return IssueRoleDefaultQuery.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends IssueRoleDefaultQuery> List<T> issueRoleDefaultQuerySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueRoleDefaultQuery.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends IssueRoleDefaultQuery> List<T> issueRoleDefaultQuerySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueRoleDefaultQuery.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int issueRoleDefaultQueryQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_ISSUE_ROLE_DEFAULT_QUERY].* from [T_ISSUE_ROLE_DEFAULT_QUERY]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Jbpm4HistVar到数据库中
 * <param name="jbpm4HistVar">需要插入的Jbpm4HistVar</param>
 */
protected void jbpm4HistVarInsert(Jbpm4HistVar jbpm4HistVar) throws SQLException, DbException {
	Jbpm4HistVar.insert(this.getDataVisit(), jbpm4HistVar);
}

/**
 * 更新一个对象Jbpm4HistVar到数据库中
 * <param name="jbpm4HistVar">需要更新的Jbpm4HistVar</param>
 */
protected int jbpm4HistVarUpdate(Jbpm4HistVar jbpm4HistVar) throws SQLException, DbException {
	return this.jbpm4HistVarUpdate(jbpm4HistVar, "");
}

/**
 * 更新一个对象Jbpm4HistVar到数据库中
 * <param name="jbpm4HistVar">需要更新的Jbpm4HistVar</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int jbpm4HistVarUpdate(Jbpm4HistVar jbpm4HistVar, String appendConditionSql) throws SQLException, DbException {
	return Jbpm4HistVar.update(this.getDataVisit(), jbpm4HistVar, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Jbpm4HistVar
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void jbpm4HistVarDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	Jbpm4HistVar.deleteByDbid(this.getDataVisit(), ADbid, appendConditionSql);
}

/**
 * <param name="jbpm4HistVar">从数据库中删除一个对象Jbpm4HistVar</param>
 * <param name="ADbid"></param>
 */
protected void jbpm4HistVarDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4HistVarDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4HistVar
 * <param name="AHproci"></param>
 */
protected void jbpm4HistVarDeleteListByHproci(Double AHproci) throws SQLException, DbException {
	Jbpm4HistVar.deleteListByHproci(this.getDataVisit(), AHproci);
}

/**
 * 从数据库中删除一批对象Jbpm4HistVar
 * <param name="AHtask"></param>
 */
protected void jbpm4HistVarDeleteListByHtask(Double AHtask) throws SQLException, DbException {
	Jbpm4HistVar.deleteListByHtask(this.getDataVisit(), AHtask);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
protected Jbpm4HistVar jbpm4HistVarSelectByDbid(double ADbid) throws SQLException, DbException {
	return Jbpm4HistVar.selectByDbid(this.getDataVisit(), ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHproci"></param>
 */
protected List<Jbpm4HistVar> jbpm4HistVarSelectObjectsByHproci(Double AHproci) throws SQLException, DbException {
	return Jbpm4HistVar.selectObjectsByHproci(this.getDataVisit(), AHproci);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHtask"></param>
 */
protected List<Jbpm4HistVar> jbpm4HistVarSelectObjectsByHtask(Double AHtask) throws SQLException, DbException {
	return Jbpm4HistVar.selectObjectsByHtask(this.getDataVisit(), AHtask);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4HistVar> jbpm4HistVarSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4HistVar.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Jbpm4HistVar> jbpm4HistVarSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Jbpm4HistVar.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4HistVar> jbpm4HistVarSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4HistVar.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Jbpm4HistVar> jbpm4HistVarSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Jbpm4HistVar.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Jbpm4HistVar> List<T> jbpm4HistVarSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4HistVar.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Jbpm4HistVar> List<T> jbpm4HistVarSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4HistVar.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int jbpm4HistVarQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [JBPM4_HIST_VAR].* from [JBPM4_HIST_VAR]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Jbpm4IdGroup到数据库中
 * <param name="jbpm4IdGroup">需要插入的Jbpm4IdGroup</param>
 */
protected void jbpm4IdGroupInsert(Jbpm4IdGroup jbpm4IdGroup) throws SQLException, DbException {
	Jbpm4IdGroup.insert(this.getDataVisit(), jbpm4IdGroup);
}

/**
 * 更新一个对象Jbpm4IdGroup到数据库中
 * <param name="jbpm4IdGroup">需要更新的Jbpm4IdGroup</param>
 */
protected int jbpm4IdGroupUpdate(Jbpm4IdGroup jbpm4IdGroup) throws SQLException, DbException {
	return this.jbpm4IdGroupUpdate(jbpm4IdGroup, "");
}

/**
 * 更新一个对象Jbpm4IdGroup到数据库中
 * <param name="jbpm4IdGroup">需要更新的Jbpm4IdGroup</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int jbpm4IdGroupUpdate(Jbpm4IdGroup jbpm4IdGroup, String appendConditionSql) throws SQLException, DbException {
	return Jbpm4IdGroup.update(this.getDataVisit(), jbpm4IdGroup, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Jbpm4IdGroup
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void jbpm4IdGroupDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	Jbpm4IdGroup.deleteByDbid(this.getDataVisit(), ADbid, appendConditionSql);
}

/**
 * <param name="jbpm4IdGroup">从数据库中删除一个对象Jbpm4IdGroup</param>
 * <param name="ADbid"></param>
 */
protected void jbpm4IdGroupDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4IdGroupDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4IdGroup
 * <param name="AParent"></param>
 */
protected void jbpm4IdGroupDeleteListByParent(Double AParent) throws SQLException, DbException {
	Jbpm4IdGroup.deleteListByParent(this.getDataVisit(), AParent);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
protected Jbpm4IdGroup jbpm4IdGroupSelectByDbid(double ADbid) throws SQLException, DbException {
	return Jbpm4IdGroup.selectByDbid(this.getDataVisit(), ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AParent"></param>
 */
protected List<Jbpm4IdGroup> jbpm4IdGroupSelectObjectsByParent(Double AParent) throws SQLException, DbException {
	return Jbpm4IdGroup.selectObjectsByParent(this.getDataVisit(), AParent);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4IdGroup> jbpm4IdGroupSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4IdGroup.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Jbpm4IdGroup> jbpm4IdGroupSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Jbpm4IdGroup.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4IdGroup> jbpm4IdGroupSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4IdGroup.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Jbpm4IdGroup> jbpm4IdGroupSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Jbpm4IdGroup.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Jbpm4IdGroup> List<T> jbpm4IdGroupSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4IdGroup.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Jbpm4IdGroup> List<T> jbpm4IdGroupSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4IdGroup.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int jbpm4IdGroupQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [JBPM4_ID_GROUP].* from [JBPM4_ID_GROUP]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象IssueQuery到数据库中
 * <param name="issueQuery">需要插入的IssueQuery</param>
 */
protected void issueQueryInsert(IssueQuery issueQuery) throws SQLException, DbException {
	IssueQuery.insert(this.getDataVisit(), issueQuery);
}

/**
 * 更新一个对象IssueQuery到数据库中
 * <param name="issueQuery">需要更新的IssueQuery</param>
 */
protected int issueQueryUpdate(IssueQuery issueQuery) throws SQLException, DbException {
	return this.issueQueryUpdate(issueQuery, "");
}

/**
 * 更新一个对象IssueQuery到数据库中
 * <param name="issueQuery">需要更新的IssueQuery</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int issueQueryUpdate(IssueQuery issueQuery, String appendConditionSql) throws SQLException, DbException {
	return IssueQuery.update(this.getDataVisit(), issueQuery, appendConditionSql);
}

/**
 * 从数据库中删除一个对象IssueQuery
 * <param name="AIssueQueryId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void issueQueryDeleteByIssueQueryId(int AIssueQueryId, String appendConditionSql) throws SQLException, DbException {
	IssueQuery.deleteByIssueQueryId(this.getDataVisit(), AIssueQueryId, appendConditionSql);
}

/**
 * <param name="issueQuery">从数据库中删除一个对象IssueQuery</param>
 * <param name="AIssueQueryId">标识</param>
 */
protected void issueQueryDeleteByIssueQueryId(int AIssueQueryId) throws SQLException, DbException {
	this.issueQueryDeleteByIssueQueryId(AIssueQueryId, "");
}

/**
 * 从数据库中删除一批对象IssueQuery
 * <param name="AIssueProjectId">关联项目</param>
 */
protected void issueQueryDeleteListByIssueProjectId(Integer AIssueProjectId) throws SQLException, DbException {
	IssueQuery.deleteListByIssueProjectId(this.getDataVisit(), AIssueProjectId);
}

/**
 * 从数据库中删除一批对象IssueQuery
 * <param name="AIssueCreateUserId">创建用户</param>
 */
protected void issueQueryDeleteListByIssueCreateUserId(int AIssueCreateUserId) throws SQLException, DbException {
	IssueQuery.deleteListByIssueCreateUserId(this.getDataVisit(), AIssueCreateUserId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueQueryId">标识</param>
 */
protected IssueQuery issueQuerySelectByIssueQueryId(int AIssueQueryId) throws SQLException, DbException {
	return IssueQuery.selectByIssueQueryId(this.getDataVisit(), AIssueQueryId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectId">关联项目</param>
 */
protected List<IssueQuery> issueQuerySelectObjectsByIssueProjectId(Integer AIssueProjectId) throws SQLException, DbException {
	return IssueQuery.selectObjectsByIssueProjectId(this.getDataVisit(), AIssueProjectId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueCreateUserId">创建用户</param>
 */
protected List<IssueQuery> issueQuerySelectObjectsByIssueCreateUserId(int AIssueCreateUserId) throws SQLException, DbException {
	return IssueQuery.selectObjectsByIssueCreateUserId(this.getDataVisit(), AIssueCreateUserId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueQuery> issueQuerySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueQuery.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<IssueQuery> issueQuerySelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return IssueQuery.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<IssueQuery> issueQuerySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return IssueQuery.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<IssueQuery> issueQuerySelectObjects(String appendConditionSql) throws SQLException, DbException {
	return IssueQuery.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends IssueQuery> List<T> issueQuerySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueQuery.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends IssueQuery> List<T> issueQuerySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return IssueQuery.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int issueQueryQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_ISSUE_QUERY].* from [T_ISSUE_QUERY]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Jbpm4IdMembership到数据库中
 * <param name="jbpm4IdMembership">需要插入的Jbpm4IdMembership</param>
 */
protected void jbpm4IdMembershipInsert(Jbpm4IdMembership jbpm4IdMembership) throws SQLException, DbException {
	Jbpm4IdMembership.insert(this.getDataVisit(), jbpm4IdMembership);
}

/**
 * 更新一个对象Jbpm4IdMembership到数据库中
 * <param name="jbpm4IdMembership">需要更新的Jbpm4IdMembership</param>
 */
protected int jbpm4IdMembershipUpdate(Jbpm4IdMembership jbpm4IdMembership) throws SQLException, DbException {
	return this.jbpm4IdMembershipUpdate(jbpm4IdMembership, "");
}

/**
 * 更新一个对象Jbpm4IdMembership到数据库中
 * <param name="jbpm4IdMembership">需要更新的Jbpm4IdMembership</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int jbpm4IdMembershipUpdate(Jbpm4IdMembership jbpm4IdMembership, String appendConditionSql) throws SQLException, DbException {
	return Jbpm4IdMembership.update(this.getDataVisit(), jbpm4IdMembership, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Jbpm4IdMembership
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void jbpm4IdMembershipDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	Jbpm4IdMembership.deleteByDbid(this.getDataVisit(), ADbid, appendConditionSql);
}

/**
 * <param name="jbpm4IdMembership">从数据库中删除一个对象Jbpm4IdMembership</param>
 * <param name="ADbid"></param>
 */
protected void jbpm4IdMembershipDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4IdMembershipDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4IdMembership
 * <param name="AGroup"></param>
 */
protected void jbpm4IdMembershipDeleteListByGroup(Double AGroup) throws SQLException, DbException {
	Jbpm4IdMembership.deleteListByGroup(this.getDataVisit(), AGroup);
}

/**
 * 从数据库中删除一批对象Jbpm4IdMembership
 * <param name="AUser"></param>
 */
protected void jbpm4IdMembershipDeleteListByUser(Double AUser) throws SQLException, DbException {
	Jbpm4IdMembership.deleteListByUser(this.getDataVisit(), AUser);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
protected Jbpm4IdMembership jbpm4IdMembershipSelectByDbid(double ADbid) throws SQLException, DbException {
	return Jbpm4IdMembership.selectByDbid(this.getDataVisit(), ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AGroup"></param>
 */
protected List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjectsByGroup(Double AGroup) throws SQLException, DbException {
	return Jbpm4IdMembership.selectObjectsByGroup(this.getDataVisit(), AGroup);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AUser"></param>
 */
protected List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjectsByUser(Double AUser) throws SQLException, DbException {
	return Jbpm4IdMembership.selectObjectsByUser(this.getDataVisit(), AUser);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4IdMembership.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Jbpm4IdMembership.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4IdMembership.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Jbpm4IdMembership.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Jbpm4IdMembership> List<T> jbpm4IdMembershipSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4IdMembership.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Jbpm4IdMembership> List<T> jbpm4IdMembershipSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4IdMembership.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int jbpm4IdMembershipQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [JBPM4_ID_MEMBERSHIP].* from [JBPM4_ID_MEMBERSHIP]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Jbpm4IdUser到数据库中
 * <param name="jbpm4IdUser">需要插入的Jbpm4IdUser</param>
 */
protected void jbpm4IdUserInsert(Jbpm4IdUser jbpm4IdUser) throws SQLException, DbException {
	Jbpm4IdUser.insert(this.getDataVisit(), jbpm4IdUser);
}

/**
 * 更新一个对象Jbpm4IdUser到数据库中
 * <param name="jbpm4IdUser">需要更新的Jbpm4IdUser</param>
 */
protected int jbpm4IdUserUpdate(Jbpm4IdUser jbpm4IdUser) throws SQLException, DbException {
	return this.jbpm4IdUserUpdate(jbpm4IdUser, "");
}

/**
 * 更新一个对象Jbpm4IdUser到数据库中
 * <param name="jbpm4IdUser">需要更新的Jbpm4IdUser</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int jbpm4IdUserUpdate(Jbpm4IdUser jbpm4IdUser, String appendConditionSql) throws SQLException, DbException {
	return Jbpm4IdUser.update(this.getDataVisit(), jbpm4IdUser, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Jbpm4IdUser
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void jbpm4IdUserDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	Jbpm4IdUser.deleteByDbid(this.getDataVisit(), ADbid, appendConditionSql);
}

/**
 * <param name="jbpm4IdUser">从数据库中删除一个对象Jbpm4IdUser</param>
 * <param name="ADbid"></param>
 */
protected void jbpm4IdUserDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4IdUserDeleteByDbid(ADbid, "");
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
protected Jbpm4IdUser jbpm4IdUserSelectByDbid(double ADbid) throws SQLException, DbException {
	return Jbpm4IdUser.selectByDbid(this.getDataVisit(), ADbid);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4IdUser> jbpm4IdUserSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4IdUser.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Jbpm4IdUser> jbpm4IdUserSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Jbpm4IdUser.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4IdUser> jbpm4IdUserSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4IdUser.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Jbpm4IdUser> jbpm4IdUserSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Jbpm4IdUser.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Jbpm4IdUser> List<T> jbpm4IdUserSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4IdUser.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Jbpm4IdUser> List<T> jbpm4IdUserSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4IdUser.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int jbpm4IdUserQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [JBPM4_ID_USER].* from [JBPM4_ID_USER]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Jbpm4Job到数据库中
 * <param name="jbpm4Job">需要插入的Jbpm4Job</param>
 */
protected void jbpm4JobInsert(Jbpm4Job jbpm4Job) throws SQLException, DbException {
	Jbpm4Job.insert(this.getDataVisit(), jbpm4Job);
}

/**
 * 更新一个对象Jbpm4Job到数据库中
 * <param name="jbpm4Job">需要更新的Jbpm4Job</param>
 */
protected int jbpm4JobUpdate(Jbpm4Job jbpm4Job) throws SQLException, DbException {
	return this.jbpm4JobUpdate(jbpm4Job, "");
}

/**
 * 更新一个对象Jbpm4Job到数据库中
 * <param name="jbpm4Job">需要更新的Jbpm4Job</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int jbpm4JobUpdate(Jbpm4Job jbpm4Job, String appendConditionSql) throws SQLException, DbException {
	return Jbpm4Job.update(this.getDataVisit(), jbpm4Job, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Jbpm4Job
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void jbpm4JobDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	Jbpm4Job.deleteByDbid(this.getDataVisit(), ADbid, appendConditionSql);
}

/**
 * <param name="jbpm4Job">从数据库中删除一个对象Jbpm4Job</param>
 * <param name="ADbid"></param>
 */
protected void jbpm4JobDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4JobDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4Job
 * <param name="ACfg"></param>
 */
protected void jbpm4JobDeleteListByCfg(Double ACfg) throws SQLException, DbException {
	Jbpm4Job.deleteListByCfg(this.getDataVisit(), ACfg);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
protected Jbpm4Job jbpm4JobSelectByDbid(double ADbid) throws SQLException, DbException {
	return Jbpm4Job.selectByDbid(this.getDataVisit(), ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ACfg"></param>
 */
protected List<Jbpm4Job> jbpm4JobSelectObjectsByCfg(Double ACfg) throws SQLException, DbException {
	return Jbpm4Job.selectObjectsByCfg(this.getDataVisit(), ACfg);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4Job> jbpm4JobSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4Job.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Jbpm4Job> jbpm4JobSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Jbpm4Job.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4Job> jbpm4JobSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4Job.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Jbpm4Job> jbpm4JobSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Jbpm4Job.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Jbpm4Job> List<T> jbpm4JobSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4Job.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Jbpm4Job> List<T> jbpm4JobSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4Job.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int jbpm4JobQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [JBPM4_JOB].* from [JBPM4_JOB]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Jbpm4Lob到数据库中
 * <param name="jbpm4Lob">需要插入的Jbpm4Lob</param>
 */
protected void jbpm4LobInsert(Jbpm4Lob jbpm4Lob) throws SQLException, DbException {
	Jbpm4Lob.insert(this.getDataVisit(), jbpm4Lob);
}

/**
 * 更新一个对象Jbpm4Lob到数据库中
 * <param name="jbpm4Lob">需要更新的Jbpm4Lob</param>
 */
protected int jbpm4LobUpdate(Jbpm4Lob jbpm4Lob) throws SQLException, DbException {
	return this.jbpm4LobUpdate(jbpm4Lob, "");
}

/**
 * 更新一个对象Jbpm4Lob到数据库中
 * <param name="jbpm4Lob">需要更新的Jbpm4Lob</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int jbpm4LobUpdate(Jbpm4Lob jbpm4Lob, String appendConditionSql) throws SQLException, DbException {
	return Jbpm4Lob.update(this.getDataVisit(), jbpm4Lob, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Jbpm4Lob
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void jbpm4LobDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	Jbpm4Lob.deleteByDbid(this.getDataVisit(), ADbid, appendConditionSql);
}

/**
 * <param name="jbpm4Lob">从数据库中删除一个对象Jbpm4Lob</param>
 * <param name="ADbid"></param>
 */
protected void jbpm4LobDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4LobDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4Lob
 * <param name="ADeployment"></param>
 */
protected void jbpm4LobDeleteListByDeployment(Double ADeployment) throws SQLException, DbException {
	Jbpm4Lob.deleteListByDeployment(this.getDataVisit(), ADeployment);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
protected Jbpm4Lob jbpm4LobSelectByDbid(double ADbid) throws SQLException, DbException {
	return Jbpm4Lob.selectByDbid(this.getDataVisit(), ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ADeployment"></param>
 */
protected List<Jbpm4Lob> jbpm4LobSelectObjectsByDeployment(Double ADeployment) throws SQLException, DbException {
	return Jbpm4Lob.selectObjectsByDeployment(this.getDataVisit(), ADeployment);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4Lob> jbpm4LobSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4Lob.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Jbpm4Lob> jbpm4LobSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Jbpm4Lob.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4Lob> jbpm4LobSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4Lob.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Jbpm4Lob> jbpm4LobSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Jbpm4Lob.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Jbpm4Lob> List<T> jbpm4LobSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4Lob.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Jbpm4Lob> List<T> jbpm4LobSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4Lob.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int jbpm4LobQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [JBPM4_LOB].* from [JBPM4_LOB]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Jbpm4Participation到数据库中
 * <param name="jbpm4Participation">需要插入的Jbpm4Participation</param>
 */
protected void jbpm4ParticipationInsert(Jbpm4Participation jbpm4Participation) throws SQLException, DbException {
	Jbpm4Participation.insert(this.getDataVisit(), jbpm4Participation);
}

/**
 * 更新一个对象Jbpm4Participation到数据库中
 * <param name="jbpm4Participation">需要更新的Jbpm4Participation</param>
 */
protected int jbpm4ParticipationUpdate(Jbpm4Participation jbpm4Participation) throws SQLException, DbException {
	return this.jbpm4ParticipationUpdate(jbpm4Participation, "");
}

/**
 * 更新一个对象Jbpm4Participation到数据库中
 * <param name="jbpm4Participation">需要更新的Jbpm4Participation</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int jbpm4ParticipationUpdate(Jbpm4Participation jbpm4Participation, String appendConditionSql) throws SQLException, DbException {
	return Jbpm4Participation.update(this.getDataVisit(), jbpm4Participation, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Jbpm4Participation
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void jbpm4ParticipationDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	Jbpm4Participation.deleteByDbid(this.getDataVisit(), ADbid, appendConditionSql);
}

/**
 * <param name="jbpm4Participation">从数据库中删除一个对象Jbpm4Participation</param>
 * <param name="ADbid"></param>
 */
protected void jbpm4ParticipationDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4ParticipationDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4Participation
 * <param name="ASwimlane"></param>
 */
protected void jbpm4ParticipationDeleteListBySwimlane(Double ASwimlane) throws SQLException, DbException {
	Jbpm4Participation.deleteListBySwimlane(this.getDataVisit(), ASwimlane);
}

/**
 * 从数据库中删除一批对象Jbpm4Participation
 * <param name="ATask"></param>
 */
protected void jbpm4ParticipationDeleteListByTask(Double ATask) throws SQLException, DbException {
	Jbpm4Participation.deleteListByTask(this.getDataVisit(), ATask);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
protected Jbpm4Participation jbpm4ParticipationSelectByDbid(double ADbid) throws SQLException, DbException {
	return Jbpm4Participation.selectByDbid(this.getDataVisit(), ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ASwimlane"></param>
 */
protected List<Jbpm4Participation> jbpm4ParticipationSelectObjectsBySwimlane(Double ASwimlane) throws SQLException, DbException {
	return Jbpm4Participation.selectObjectsBySwimlane(this.getDataVisit(), ASwimlane);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATask"></param>
 */
protected List<Jbpm4Participation> jbpm4ParticipationSelectObjectsByTask(Double ATask) throws SQLException, DbException {
	return Jbpm4Participation.selectObjectsByTask(this.getDataVisit(), ATask);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4Participation> jbpm4ParticipationSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4Participation.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Jbpm4Participation> jbpm4ParticipationSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Jbpm4Participation.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4Participation> jbpm4ParticipationSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4Participation.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Jbpm4Participation> jbpm4ParticipationSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Jbpm4Participation.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Jbpm4Participation> List<T> jbpm4ParticipationSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4Participation.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Jbpm4Participation> List<T> jbpm4ParticipationSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4Participation.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int jbpm4ParticipationQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [JBPM4_PARTICIPATION].* from [JBPM4_PARTICIPATION]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象Jbpm4Property到数据库中
 * <param name="jbpm4Property">需要插入的Jbpm4Property</param>
 */
protected void jbpm4PropertyInsert(Jbpm4Property jbpm4Property) throws SQLException, DbException {
	Jbpm4Property.insert(this.getDataVisit(), jbpm4Property);
}

/**
 * 更新一个对象Jbpm4Property到数据库中
 * <param name="jbpm4Property">需要更新的Jbpm4Property</param>
 */
protected int jbpm4PropertyUpdate(Jbpm4Property jbpm4Property) throws SQLException, DbException {
	return this.jbpm4PropertyUpdate(jbpm4Property, "");
}

/**
 * 更新一个对象Jbpm4Property到数据库中
 * <param name="jbpm4Property">需要更新的Jbpm4Property</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int jbpm4PropertyUpdate(Jbpm4Property jbpm4Property, String appendConditionSql) throws SQLException, DbException {
	return Jbpm4Property.update(this.getDataVisit(), jbpm4Property, appendConditionSql);
}

/**
 * 从数据库中删除一个对象Jbpm4Property
 * <param name="AKey"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void jbpm4PropertyDeleteByKey(String AKey, String appendConditionSql) throws SQLException, DbException {
	Jbpm4Property.deleteByKey(this.getDataVisit(), AKey, appendConditionSql);
}

/**
 * <param name="jbpm4Property">从数据库中删除一个对象Jbpm4Property</param>
 * <param name="AKey"></param>
 */
protected void jbpm4PropertyDeleteByKey(String AKey) throws SQLException, DbException {
	this.jbpm4PropertyDeleteByKey(AKey, "");
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AKey"></param>
 */
protected Jbpm4Property jbpm4PropertySelectByKey(String AKey) throws SQLException, DbException {
	return Jbpm4Property.selectByKey(this.getDataVisit(), AKey);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4Property> jbpm4PropertySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4Property.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<Jbpm4Property> jbpm4PropertySelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return Jbpm4Property.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<Jbpm4Property> jbpm4PropertySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return Jbpm4Property.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<Jbpm4Property> jbpm4PropertySelectObjects(String appendConditionSql) throws SQLException, DbException {
	return Jbpm4Property.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends Jbpm4Property> List<T> jbpm4PropertySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4Property.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends Jbpm4Property> List<T> jbpm4PropertySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return Jbpm4Property.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int jbpm4PropertyQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [JBPM4_PROPERTY].* from [JBPM4_PROPERTY]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象FundNav到数据库中
 * <param name="fundNav">需要插入的FundNav</param>
 */
protected void fundNavInsert(FundNav fundNav) throws SQLException, DbException {
	FundNav.insert(this.getDataVisit(), fundNav);
}

/**
 * 更新一个对象FundNav到数据库中
 * <param name="fundNav">需要更新的FundNav</param>
 */
protected int fundNavUpdate(FundNav fundNav) throws SQLException, DbException {
	return this.fundNavUpdate(fundNav, "");
}

/**
 * 更新一个对象FundNav到数据库中
 * <param name="fundNav">需要更新的FundNav</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int fundNavUpdate(FundNav fundNav, String appendConditionSql) throws SQLException, DbException {
	return FundNav.update(this.getDataVisit(), fundNav, appendConditionSql);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<FundNav> fundNavSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return FundNav.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<FundNav> fundNavSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return FundNav.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<FundNav> fundNavSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return FundNav.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<FundNav> fundNavSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return FundNav.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends FundNav> List<T> fundNavSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return FundNav.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends FundNav> List<T> fundNavSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return FundNav.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int fundNavQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [FUND_NAV].* from [FUND_NAV]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象FuncTest到数据库中
 * <param name="funcTest">需要插入的FuncTest</param>
 */
protected void funcTestInsert(FuncTest funcTest) throws SQLException, DbException {
	FuncTest.insert(this.getDataVisit(), funcTest);
}

/**
 * 更新一个对象FuncTest到数据库中
 * <param name="funcTest">需要更新的FuncTest</param>
 */
protected int funcTestUpdate(FuncTest funcTest) throws SQLException, DbException {
	return this.funcTestUpdate(funcTest, "");
}

/**
 * 更新一个对象FuncTest到数据库中
 * <param name="funcTest">需要更新的FuncTest</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int funcTestUpdate(FuncTest funcTest, String appendConditionSql) throws SQLException, DbException {
	return FuncTest.update(this.getDataVisit(), funcTest, appendConditionSql);
}

/**
 * 从数据库中删除一个对象FuncTest
 * <param name="ABuildId">构建标识</param>
 * <param name="AParamId">参数标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void funcTestDeleteByBuildIdParamId(int ABuildId, int AParamId, String appendConditionSql) throws SQLException, DbException {
	FuncTest.deleteByBuildIdParamId(this.getDataVisit(), ABuildId, AParamId, appendConditionSql);
}

/**
 * <param name="funcTest">从数据库中删除一个对象FuncTest</param>
 * <param name="ABuildId">构建标识</param>
 * <param name="AParamId">参数标识</param>
 */
protected void funcTestDeleteByBuildIdParamId(int ABuildId, int AParamId) throws SQLException, DbException {
	this.funcTestDeleteByBuildIdParamId(ABuildId, AParamId, "");
}

/**
 * 从数据库中删除一批对象FuncTest
 * <param name="ABuildId">构建标识</param>
 */
protected void funcTestDeleteListByBuildId(int ABuildId) throws SQLException, DbException {
	FuncTest.deleteListByBuildId(this.getDataVisit(), ABuildId);
}

/**
 * 从数据库中删除一批对象FuncTest
 * <param name="AParamId">参数标识</param>
 */
protected void funcTestDeleteListByParamId(int AParamId) throws SQLException, DbException {
	FuncTest.deleteListByParamId(this.getDataVisit(), AParamId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ABuildId">构建标识</param>
 * <param name="AParamId">参数标识</param>
 */
protected FuncTest funcTestSelectByBuildIdParamId(int ABuildId, int AParamId) throws SQLException, DbException {
	return FuncTest.selectByBuildIdParamId(this.getDataVisit(), ABuildId, AParamId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ABuildId">构建标识</param>
 */
protected List<FuncTest> funcTestSelectObjectsByBuildId(int ABuildId) throws SQLException, DbException {
	return FuncTest.selectObjectsByBuildId(this.getDataVisit(), ABuildId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AParamId">参数标识</param>
 */
protected List<FuncTest> funcTestSelectObjectsByParamId(int AParamId) throws SQLException, DbException {
	return FuncTest.selectObjectsByParamId(this.getDataVisit(), AParamId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<FuncTest> funcTestSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return FuncTest.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<FuncTest> funcTestSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return FuncTest.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<FuncTest> funcTestSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return FuncTest.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<FuncTest> funcTestSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return FuncTest.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends FuncTest> List<T> funcTestSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return FuncTest.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends FuncTest> List<T> funcTestSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return FuncTest.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int funcTestQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_FUNC_TEST].* from [T_FUNC_TEST]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象TestProcedure到数据库中
 * <param name="testProcedure">需要插入的TestProcedure</param>
 */
protected void testProcedureInsert(TestProcedure testProcedure) throws SQLException, DbException {
	TestProcedure.insert(this.getDataVisit(), testProcedure);
}

/**
 * 更新一个对象TestProcedure到数据库中
 * <param name="testProcedure">需要更新的TestProcedure</param>
 */
protected int testProcedureUpdate(TestProcedure testProcedure) throws SQLException, DbException {
	return this.testProcedureUpdate(testProcedure, "");
}

/**
 * 更新一个对象TestProcedure到数据库中
 * <param name="testProcedure">需要更新的TestProcedure</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int testProcedureUpdate(TestProcedure testProcedure, String appendConditionSql) throws SQLException, DbException {
	return TestProcedure.update(this.getDataVisit(), testProcedure, appendConditionSql);
}

/**
 * 从数据库中删除一个对象TestProcedure
 * <param name="ATestProcedureId">测试过程标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void testProcedureDeleteByTestProcedureId(int ATestProcedureId, String appendConditionSql) throws SQLException, DbException {
	TestProcedure.deleteByTestProcedureId(this.getDataVisit(), ATestProcedureId, appendConditionSql);
}

/**
 * <param name="testProcedure">从数据库中删除一个对象TestProcedure</param>
 * <param name="ATestProcedureId">测试过程标识</param>
 */
protected void testProcedureDeleteByTestProcedureId(int ATestProcedureId) throws SQLException, DbException {
	this.testProcedureDeleteByTestProcedureId(ATestProcedureId, "");
}

/**
 * 从数据库中删除一批对象TestProcedure
 * <param name="ABuildId">构建标识</param>
 */
protected void testProcedureDeleteListByBuildId(int ABuildId) throws SQLException, DbException {
	TestProcedure.deleteListByBuildId(this.getDataVisit(), ABuildId);
}

/**
 * 从数据库中删除一批对象TestProcedure
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
protected void testProcedureDeleteListByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException {
	TestProcedure.deleteListByFuncProcedureId(this.getDataVisit(), AFuncProcedureId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATestProcedureId">测试过程标识</param>
 */
protected TestProcedure testProcedureSelectByTestProcedureId(int ATestProcedureId) throws SQLException, DbException {
	return TestProcedure.selectByTestProcedureId(this.getDataVisit(), ATestProcedureId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ABuildId">构建标识</param>
 */
protected List<TestProcedure> testProcedureSelectObjectsByBuildId(int ABuildId) throws SQLException, DbException {
	return TestProcedure.selectObjectsByBuildId(this.getDataVisit(), ABuildId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
protected List<TestProcedure> testProcedureSelectObjectsByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException {
	return TestProcedure.selectObjectsByFuncProcedureId(this.getDataVisit(), AFuncProcedureId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<TestProcedure> testProcedureSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return TestProcedure.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<TestProcedure> testProcedureSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return TestProcedure.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<TestProcedure> testProcedureSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return TestProcedure.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<TestProcedure> testProcedureSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return TestProcedure.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends TestProcedure> List<T> testProcedureSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return TestProcedure.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends TestProcedure> List<T> testProcedureSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return TestProcedure.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int testProcedureQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_TEST_PROCEDURE].* from [T_TEST_PROCEDURE]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象TestParamValue到数据库中
 * <param name="testParamValue">需要插入的TestParamValue</param>
 */
protected void testParamValueInsert(TestParamValue testParamValue) throws SQLException, DbException {
	TestParamValue.insert(this.getDataVisit(), testParamValue);
}

/**
 * 更新一个对象TestParamValue到数据库中
 * <param name="testParamValue">需要更新的TestParamValue</param>
 */
protected int testParamValueUpdate(TestParamValue testParamValue) throws SQLException, DbException {
	return this.testParamValueUpdate(testParamValue, "");
}

/**
 * 更新一个对象TestParamValue到数据库中
 * <param name="testParamValue">需要更新的TestParamValue</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int testParamValueUpdate(TestParamValue testParamValue, String appendConditionSql) throws SQLException, DbException {
	return TestParamValue.update(this.getDataVisit(), testParamValue, appendConditionSql);
}

/**
 * 从数据库中删除一个对象TestParamValue
 * <param name="ATestProcedureId">测试过程标识</param>
 * <param name="AParamId">参数标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void testParamValueDeleteByTestProcedureIdParamId(int ATestProcedureId, int AParamId, String appendConditionSql) throws SQLException, DbException {
	TestParamValue.deleteByTestProcedureIdParamId(this.getDataVisit(), ATestProcedureId, AParamId, appendConditionSql);
}

/**
 * <param name="testParamValue">从数据库中删除一个对象TestParamValue</param>
 * <param name="ATestProcedureId">测试过程标识</param>
 * <param name="AParamId">参数标识</param>
 */
protected void testParamValueDeleteByTestProcedureIdParamId(int ATestProcedureId, int AParamId) throws SQLException, DbException {
	this.testParamValueDeleteByTestProcedureIdParamId(ATestProcedureId, AParamId, "");
}

/**
 * 从数据库中删除一批对象TestParamValue
 * <param name="AParamId">参数标识</param>
 */
protected void testParamValueDeleteListByParamId(int AParamId) throws SQLException, DbException {
	TestParamValue.deleteListByParamId(this.getDataVisit(), AParamId);
}

/**
 * 从数据库中删除一批对象TestParamValue
 * <param name="ATestProcedureId">测试过程标识</param>
 */
protected void testParamValueDeleteListByTestProcedureId(int ATestProcedureId) throws SQLException, DbException {
	TestParamValue.deleteListByTestProcedureId(this.getDataVisit(), ATestProcedureId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATestProcedureId">测试过程标识</param>
 * <param name="AParamId">参数标识</param>
 */
protected TestParamValue testParamValueSelectByTestProcedureIdParamId(int ATestProcedureId, int AParamId) throws SQLException, DbException {
	return TestParamValue.selectByTestProcedureIdParamId(this.getDataVisit(), ATestProcedureId, AParamId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AParamId">参数标识</param>
 */
protected List<TestParamValue> testParamValueSelectObjectsByParamId(int AParamId) throws SQLException, DbException {
	return TestParamValue.selectObjectsByParamId(this.getDataVisit(), AParamId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATestProcedureId">测试过程标识</param>
 */
protected List<TestParamValue> testParamValueSelectObjectsByTestProcedureId(int ATestProcedureId) throws SQLException, DbException {
	return TestParamValue.selectObjectsByTestProcedureId(this.getDataVisit(), ATestProcedureId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<TestParamValue> testParamValueSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return TestParamValue.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<TestParamValue> testParamValueSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return TestParamValue.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<TestParamValue> testParamValueSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return TestParamValue.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<TestParamValue> testParamValueSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return TestParamValue.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends TestParamValue> List<T> testParamValueSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return TestParamValue.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends TestParamValue> List<T> testParamValueSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return TestParamValue.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int testParamValueQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_TEST_PARAM_VALUE].* from [T_TEST_PARAM_VALUE]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象QuestionCategory到数据库中
 * <param name="questionCategory">需要插入的QuestionCategory</param>
 */
protected void questionCategoryInsert(QuestionCategory questionCategory) throws SQLException, DbException {
	QuestionCategory.insert(this.getDataVisit(), questionCategory);
}

/**
 * 更新一个对象QuestionCategory到数据库中
 * <param name="questionCategory">需要更新的QuestionCategory</param>
 */
protected int questionCategoryUpdate(QuestionCategory questionCategory) throws SQLException, DbException {
	return this.questionCategoryUpdate(questionCategory, "");
}

/**
 * 更新一个对象QuestionCategory到数据库中
 * <param name="questionCategory">需要更新的QuestionCategory</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int questionCategoryUpdate(QuestionCategory questionCategory, String appendConditionSql) throws SQLException, DbException {
	return QuestionCategory.update(this.getDataVisit(), questionCategory, appendConditionSql);
}

/**
 * 从数据库中删除一个对象QuestionCategory
 * <param name="ACategoryId">分类标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void questionCategoryDeleteByCategoryId(int ACategoryId, String appendConditionSql) throws SQLException, DbException {
	QuestionCategory.deleteByCategoryId(this.getDataVisit(), ACategoryId, appendConditionSql);
}

/**
 * <param name="questionCategory">从数据库中删除一个对象QuestionCategory</param>
 * <param name="ACategoryId">分类标识</param>
 */
protected void questionCategoryDeleteByCategoryId(int ACategoryId) throws SQLException, DbException {
	this.questionCategoryDeleteByCategoryId(ACategoryId, "");
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ACategoryId">分类标识</param>
 */
protected QuestionCategory questionCategorySelectByCategoryId(int ACategoryId) throws SQLException, DbException {
	return QuestionCategory.selectByCategoryId(this.getDataVisit(), ACategoryId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<QuestionCategory> questionCategorySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return QuestionCategory.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<QuestionCategory> questionCategorySelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return QuestionCategory.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<QuestionCategory> questionCategorySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return QuestionCategory.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<QuestionCategory> questionCategorySelectObjects(String appendConditionSql) throws SQLException, DbException {
	return QuestionCategory.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends QuestionCategory> List<T> questionCategorySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return QuestionCategory.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends QuestionCategory> List<T> questionCategorySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return QuestionCategory.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int questionCategoryQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_QUESTION_CATEGORY].* from [T_QUESTION_CATEGORY]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象QuestionLib到数据库中
 * <param name="questionLib">需要插入的QuestionLib</param>
 */
protected void questionLibInsert(QuestionLib questionLib) throws SQLException, DbException {
	QuestionLib.insert(this.getDataVisit(), questionLib);
}

/**
 * 更新一个对象QuestionLib到数据库中
 * <param name="questionLib">需要更新的QuestionLib</param>
 */
protected int questionLibUpdate(QuestionLib questionLib) throws SQLException, DbException {
	return this.questionLibUpdate(questionLib, "");
}

/**
 * 更新一个对象QuestionLib到数据库中
 * <param name="questionLib">需要更新的QuestionLib</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int questionLibUpdate(QuestionLib questionLib, String appendConditionSql) throws SQLException, DbException {
	return QuestionLib.update(this.getDataVisit(), questionLib, appendConditionSql);
}

/**
 * 从数据库中删除一个对象QuestionLib
 * <param name="AQuestionId">题目标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void questionLibDeleteByQuestionId(int AQuestionId, String appendConditionSql) throws SQLException, DbException {
	QuestionLib.deleteByQuestionId(this.getDataVisit(), AQuestionId, appendConditionSql);
}

/**
 * <param name="questionLib">从数据库中删除一个对象QuestionLib</param>
 * <param name="AQuestionId">题目标识</param>
 */
protected void questionLibDeleteByQuestionId(int AQuestionId) throws SQLException, DbException {
	this.questionLibDeleteByQuestionId(AQuestionId, "");
}

/**
 * 从数据库中删除一批对象QuestionLib
 * <param name="ACategoryId">分类标识</param>
 */
protected void questionLibDeleteListByCategoryId(int ACategoryId) throws SQLException, DbException {
	QuestionLib.deleteListByCategoryId(this.getDataVisit(), ACategoryId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AQuestionId">题目标识</param>
 */
protected QuestionLib questionLibSelectByQuestionId(int AQuestionId) throws SQLException, DbException {
	return QuestionLib.selectByQuestionId(this.getDataVisit(), AQuestionId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ACategoryId">分类标识</param>
 */
protected List<QuestionLib> questionLibSelectObjectsByCategoryId(int ACategoryId) throws SQLException, DbException {
	return QuestionLib.selectObjectsByCategoryId(this.getDataVisit(), ACategoryId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<QuestionLib> questionLibSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return QuestionLib.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<QuestionLib> questionLibSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return QuestionLib.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<QuestionLib> questionLibSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return QuestionLib.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<QuestionLib> questionLibSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return QuestionLib.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends QuestionLib> List<T> questionLibSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return QuestionLib.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends QuestionLib> List<T> questionLibSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return QuestionLib.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int questionLibQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_QUESTION_LIB].* from [T_QUESTION_LIB]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象QuestionAnswer到数据库中
 * <param name="questionAnswer">需要插入的QuestionAnswer</param>
 */
protected void questionAnswerInsert(QuestionAnswer questionAnswer) throws SQLException, DbException {
	QuestionAnswer.insert(this.getDataVisit(), questionAnswer);
}

/**
 * 更新一个对象QuestionAnswer到数据库中
 * <param name="questionAnswer">需要更新的QuestionAnswer</param>
 */
protected int questionAnswerUpdate(QuestionAnswer questionAnswer) throws SQLException, DbException {
	return this.questionAnswerUpdate(questionAnswer, "");
}

/**
 * 更新一个对象QuestionAnswer到数据库中
 * <param name="questionAnswer">需要更新的QuestionAnswer</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int questionAnswerUpdate(QuestionAnswer questionAnswer, String appendConditionSql) throws SQLException, DbException {
	return QuestionAnswer.update(this.getDataVisit(), questionAnswer, appendConditionSql);
}

/**
 * 从数据库中删除一个对象QuestionAnswer
 * <param name="AAnswerId">答案标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void questionAnswerDeleteByAnswerId(int AAnswerId, String appendConditionSql) throws SQLException, DbException {
	QuestionAnswer.deleteByAnswerId(this.getDataVisit(), AAnswerId, appendConditionSql);
}

/**
 * <param name="questionAnswer">从数据库中删除一个对象QuestionAnswer</param>
 * <param name="AAnswerId">答案标识</param>
 */
protected void questionAnswerDeleteByAnswerId(int AAnswerId) throws SQLException, DbException {
	this.questionAnswerDeleteByAnswerId(AAnswerId, "");
}

/**
 * 从数据库中删除一批对象QuestionAnswer
 * <param name="AQuestionId">题目标识</param>
 */
protected void questionAnswerDeleteListByQuestionId(int AQuestionId) throws SQLException, DbException {
	QuestionAnswer.deleteListByQuestionId(this.getDataVisit(), AQuestionId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AAnswerId">答案标识</param>
 */
protected QuestionAnswer questionAnswerSelectByAnswerId(int AAnswerId) throws SQLException, DbException {
	return QuestionAnswer.selectByAnswerId(this.getDataVisit(), AAnswerId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AQuestionId">题目标识</param>
 */
protected List<QuestionAnswer> questionAnswerSelectObjectsByQuestionId(int AQuestionId) throws SQLException, DbException {
	return QuestionAnswer.selectObjectsByQuestionId(this.getDataVisit(), AQuestionId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<QuestionAnswer> questionAnswerSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return QuestionAnswer.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<QuestionAnswer> questionAnswerSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return QuestionAnswer.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<QuestionAnswer> questionAnswerSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return QuestionAnswer.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<QuestionAnswer> questionAnswerSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return QuestionAnswer.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends QuestionAnswer> List<T> questionAnswerSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return QuestionAnswer.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends QuestionAnswer> List<T> questionAnswerSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return QuestionAnswer.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int questionAnswerQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_QUESTION_ANSWER].* from [T_QUESTION_ANSWER]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象TestPapers到数据库中
 * <param name="testPapers">需要插入的TestPapers</param>
 */
protected void testPapersInsert(TestPapers testPapers) throws SQLException, DbException {
	TestPapers.insert(this.getDataVisit(), testPapers);
}

/**
 * 更新一个对象TestPapers到数据库中
 * <param name="testPapers">需要更新的TestPapers</param>
 */
protected int testPapersUpdate(TestPapers testPapers) throws SQLException, DbException {
	return this.testPapersUpdate(testPapers, "");
}

/**
 * 更新一个对象TestPapers到数据库中
 * <param name="testPapers">需要更新的TestPapers</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int testPapersUpdate(TestPapers testPapers, String appendConditionSql) throws SQLException, DbException {
	return TestPapers.update(this.getDataVisit(), testPapers, appendConditionSql);
}

/**
 * 从数据库中删除一个对象TestPapers
 * <param name="APapersId">考卷标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void testPapersDeleteByPapersId(int APapersId, String appendConditionSql) throws SQLException, DbException {
	TestPapers.deleteByPapersId(this.getDataVisit(), APapersId, appendConditionSql);
}

/**
 * <param name="testPapers">从数据库中删除一个对象TestPapers</param>
 * <param name="APapersId">考卷标识</param>
 */
protected void testPapersDeleteByPapersId(int APapersId) throws SQLException, DbException {
	this.testPapersDeleteByPapersId(APapersId, "");
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APapersId">考卷标识</param>
 */
protected TestPapers testPapersSelectByPapersId(int APapersId) throws SQLException, DbException {
	return TestPapers.selectByPapersId(this.getDataVisit(), APapersId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<TestPapers> testPapersSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return TestPapers.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<TestPapers> testPapersSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return TestPapers.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<TestPapers> testPapersSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return TestPapers.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<TestPapers> testPapersSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return TestPapers.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends TestPapers> List<T> testPapersSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return TestPapers.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends TestPapers> List<T> testPapersSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return TestPapers.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int testPapersQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_TEST_PAPERS].* from [T_TEST_PAPERS]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象TestPapersQuestion到数据库中
 * <param name="testPapersQuestion">需要插入的TestPapersQuestion</param>
 */
protected void testPapersQuestionInsert(TestPapersQuestion testPapersQuestion) throws SQLException, DbException {
	TestPapersQuestion.insert(this.getDataVisit(), testPapersQuestion);
}

/**
 * 更新一个对象TestPapersQuestion到数据库中
 * <param name="testPapersQuestion">需要更新的TestPapersQuestion</param>
 */
protected int testPapersQuestionUpdate(TestPapersQuestion testPapersQuestion) throws SQLException, DbException {
	return this.testPapersQuestionUpdate(testPapersQuestion, "");
}

/**
 * 更新一个对象TestPapersQuestion到数据库中
 * <param name="testPapersQuestion">需要更新的TestPapersQuestion</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int testPapersQuestionUpdate(TestPapersQuestion testPapersQuestion, String appendConditionSql) throws SQLException, DbException {
	return TestPapersQuestion.update(this.getDataVisit(), testPapersQuestion, appendConditionSql);
}

/**
 * 从数据库中删除一个对象TestPapersQuestion
 * <param name="APapersQuestionId"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void testPapersQuestionDeleteByPapersQuestionId(int APapersQuestionId, String appendConditionSql) throws SQLException, DbException {
	TestPapersQuestion.deleteByPapersQuestionId(this.getDataVisit(), APapersQuestionId, appendConditionSql);
}

/**
 * <param name="testPapersQuestion">从数据库中删除一个对象TestPapersQuestion</param>
 * <param name="APapersQuestionId"></param>
 */
protected void testPapersQuestionDeleteByPapersQuestionId(int APapersQuestionId) throws SQLException, DbException {
	this.testPapersQuestionDeleteByPapersQuestionId(APapersQuestionId, "");
}

/**
 * 从数据库中删除一批对象TestPapersQuestion
 * <param name="AQuestionId">题目标识</param>
 */
protected void testPapersQuestionDeleteListByQuestionId(int AQuestionId) throws SQLException, DbException {
	TestPapersQuestion.deleteListByQuestionId(this.getDataVisit(), AQuestionId);
}

/**
 * 从数据库中删除一批对象TestPapersQuestion
 * <param name="APapersId">考卷标识</param>
 */
protected void testPapersQuestionDeleteListByPapersId(int APapersId) throws SQLException, DbException {
	TestPapersQuestion.deleteListByPapersId(this.getDataVisit(), APapersId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APapersQuestionId"></param>
 */
protected TestPapersQuestion testPapersQuestionSelectByPapersQuestionId(int APapersQuestionId) throws SQLException, DbException {
	return TestPapersQuestion.selectByPapersQuestionId(this.getDataVisit(), APapersQuestionId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AQuestionId">题目标识</param>
 */
protected List<TestPapersQuestion> testPapersQuestionSelectObjectsByQuestionId(int AQuestionId) throws SQLException, DbException {
	return TestPapersQuestion.selectObjectsByQuestionId(this.getDataVisit(), AQuestionId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="APapersId">考卷标识</param>
 */
protected List<TestPapersQuestion> testPapersQuestionSelectObjectsByPapersId(int APapersId) throws SQLException, DbException {
	return TestPapersQuestion.selectObjectsByPapersId(this.getDataVisit(), APapersId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<TestPapersQuestion> testPapersQuestionSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return TestPapersQuestion.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<TestPapersQuestion> testPapersQuestionSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return TestPapersQuestion.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<TestPapersQuestion> testPapersQuestionSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return TestPapersQuestion.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<TestPapersQuestion> testPapersQuestionSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return TestPapersQuestion.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends TestPapersQuestion> List<T> testPapersQuestionSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return TestPapersQuestion.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends TestPapersQuestion> List<T> testPapersQuestionSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return TestPapersQuestion.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int testPapersQuestionQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_TEST_PAPERS_QUESTION].* from [T_TEST_PAPERS_QUESTION]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象PapersScore到数据库中
 * <param name="papersScore">需要插入的PapersScore</param>
 */
protected void papersScoreInsert(PapersScore papersScore) throws SQLException, DbException {
	PapersScore.insert(this.getDataVisit(), papersScore);
}

/**
 * 更新一个对象PapersScore到数据库中
 * <param name="papersScore">需要更新的PapersScore</param>
 */
protected int papersScoreUpdate(PapersScore papersScore) throws SQLException, DbException {
	return this.papersScoreUpdate(papersScore, "");
}

/**
 * 更新一个对象PapersScore到数据库中
 * <param name="papersScore">需要更新的PapersScore</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int papersScoreUpdate(PapersScore papersScore, String appendConditionSql) throws SQLException, DbException {
	return PapersScore.update(this.getDataVisit(), papersScore, appendConditionSql);
}

/**
 * 从数据库中删除一个对象PapersScore
 * <param name="APapersScoreId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void papersScoreDeleteByPapersScoreId(int APapersScoreId, String appendConditionSql) throws SQLException, DbException {
	PapersScore.deleteByPapersScoreId(this.getDataVisit(), APapersScoreId, appendConditionSql);
}

/**
 * <param name="papersScore">从数据库中删除一个对象PapersScore</param>
 * <param name="APapersScoreId">标识</param>
 */
protected void papersScoreDeleteByPapersScoreId(int APapersScoreId) throws SQLException, DbException {
	this.papersScoreDeleteByPapersScoreId(APapersScoreId, "");
}

/**
 * 从数据库中删除一批对象PapersScore
 * <param name="APapersId">考卷标识</param>
 */
protected void papersScoreDeleteListByPapersId(int APapersId) throws SQLException, DbException {
	PapersScore.deleteListByPapersId(this.getDataVisit(), APapersId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APapersScoreId">标识</param>
 */
protected PapersScore papersScoreSelectByPapersScoreId(int APapersScoreId) throws SQLException, DbException {
	return PapersScore.selectByPapersScoreId(this.getDataVisit(), APapersScoreId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="APapersId">考卷标识</param>
 */
protected List<PapersScore> papersScoreSelectObjectsByPapersId(int APapersId) throws SQLException, DbException {
	return PapersScore.selectObjectsByPapersId(this.getDataVisit(), APapersId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<PapersScore> papersScoreSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return PapersScore.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<PapersScore> papersScoreSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return PapersScore.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<PapersScore> papersScoreSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return PapersScore.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<PapersScore> papersScoreSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return PapersScore.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends PapersScore> List<T> papersScoreSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return PapersScore.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends PapersScore> List<T> papersScoreSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return PapersScore.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int papersScoreQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_PAPERS_SCORE].* from [T_PAPERS_SCORE]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象PapersResultDetail到数据库中
 * <param name="papersResultDetail">需要插入的PapersResultDetail</param>
 */
protected void papersResultDetailInsert(PapersResultDetail papersResultDetail) throws SQLException, DbException {
	PapersResultDetail.insert(this.getDataVisit(), papersResultDetail);
}

/**
 * 更新一个对象PapersResultDetail到数据库中
 * <param name="papersResultDetail">需要更新的PapersResultDetail</param>
 */
protected int papersResultDetailUpdate(PapersResultDetail papersResultDetail) throws SQLException, DbException {
	return this.papersResultDetailUpdate(papersResultDetail, "");
}

/**
 * 更新一个对象PapersResultDetail到数据库中
 * <param name="papersResultDetail">需要更新的PapersResultDetail</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int papersResultDetailUpdate(PapersResultDetail papersResultDetail, String appendConditionSql) throws SQLException, DbException {
	return PapersResultDetail.update(this.getDataVisit(), papersResultDetail, appendConditionSql);
}

/**
 * 从数据库中删除一个对象PapersResultDetail
 * <param name="APapersResultDetailId">回答明细标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void papersResultDetailDeleteByPapersResultDetailId(int APapersResultDetailId, String appendConditionSql) throws SQLException, DbException {
	PapersResultDetail.deleteByPapersResultDetailId(this.getDataVisit(), APapersResultDetailId, appendConditionSql);
}

/**
 * <param name="papersResultDetail">从数据库中删除一个对象PapersResultDetail</param>
 * <param name="APapersResultDetailId">回答明细标识</param>
 */
protected void papersResultDetailDeleteByPapersResultDetailId(int APapersResultDetailId) throws SQLException, DbException {
	this.papersResultDetailDeleteByPapersResultDetailId(APapersResultDetailId, "");
}

/**
 * 从数据库中删除一批对象PapersResultDetail
 * <param name="APapersResultId">回答标识</param>
 */
protected void papersResultDetailDeleteListByPapersResultId(int APapersResultId) throws SQLException, DbException {
	PapersResultDetail.deleteListByPapersResultId(this.getDataVisit(), APapersResultId);
}

/**
 * 从数据库中删除一批对象PapersResultDetail
 * <param name="AAnswerId">答案标识</param>
 */
protected void papersResultDetailDeleteListByAnswerId(int AAnswerId) throws SQLException, DbException {
	PapersResultDetail.deleteListByAnswerId(this.getDataVisit(), AAnswerId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APapersResultDetailId">回答明细标识</param>
 */
protected PapersResultDetail papersResultDetailSelectByPapersResultDetailId(int APapersResultDetailId) throws SQLException, DbException {
	return PapersResultDetail.selectByPapersResultDetailId(this.getDataVisit(), APapersResultDetailId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="APapersResultId">回答标识</param>
 */
protected List<PapersResultDetail> papersResultDetailSelectObjectsByPapersResultId(int APapersResultId) throws SQLException, DbException {
	return PapersResultDetail.selectObjectsByPapersResultId(this.getDataVisit(), APapersResultId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AAnswerId">答案标识</param>
 */
protected List<PapersResultDetail> papersResultDetailSelectObjectsByAnswerId(int AAnswerId) throws SQLException, DbException {
	return PapersResultDetail.selectObjectsByAnswerId(this.getDataVisit(), AAnswerId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<PapersResultDetail> papersResultDetailSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return PapersResultDetail.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<PapersResultDetail> papersResultDetailSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return PapersResultDetail.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<PapersResultDetail> papersResultDetailSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return PapersResultDetail.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<PapersResultDetail> papersResultDetailSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return PapersResultDetail.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends PapersResultDetail> List<T> papersResultDetailSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return PapersResultDetail.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends PapersResultDetail> List<T> papersResultDetailSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return PapersResultDetail.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int papersResultDetailQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_PAPERS_RESULT_DETAIL].* from [T_PAPERS_RESULT_DETAIL]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象TestPapersQuestionRange到数据库中
 * <param name="testPapersQuestionRange">需要插入的TestPapersQuestionRange</param>
 */
protected void testPapersQuestionRangeInsert(TestPapersQuestionRange testPapersQuestionRange) throws SQLException, DbException {
	TestPapersQuestionRange.insert(this.getDataVisit(), testPapersQuestionRange);
}

/**
 * 更新一个对象TestPapersQuestionRange到数据库中
 * <param name="testPapersQuestionRange">需要更新的TestPapersQuestionRange</param>
 */
protected int testPapersQuestionRangeUpdate(TestPapersQuestionRange testPapersQuestionRange) throws SQLException, DbException {
	return this.testPapersQuestionRangeUpdate(testPapersQuestionRange, "");
}

/**
 * 更新一个对象TestPapersQuestionRange到数据库中
 * <param name="testPapersQuestionRange">需要更新的TestPapersQuestionRange</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int testPapersQuestionRangeUpdate(TestPapersQuestionRange testPapersQuestionRange, String appendConditionSql) throws SQLException, DbException {
	return TestPapersQuestionRange.update(this.getDataVisit(), testPapersQuestionRange, appendConditionSql);
}

/**
 * 从数据库中删除一个对象TestPapersQuestionRange
 * <param name="APapersId">考卷标识</param>
 * <param name="ACategoryId">试卷分类标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void testPapersQuestionRangeDeleteByPapersIdCategoryId(int APapersId, int ACategoryId, String appendConditionSql) throws SQLException, DbException {
	TestPapersQuestionRange.deleteByPapersIdCategoryId(this.getDataVisit(), APapersId, ACategoryId, appendConditionSql);
}

/**
 * <param name="testPapersQuestionRange">从数据库中删除一个对象TestPapersQuestionRange</param>
 * <param name="APapersId">考卷标识</param>
 * <param name="ACategoryId">试卷分类标识</param>
 */
protected void testPapersQuestionRangeDeleteByPapersIdCategoryId(int APapersId, int ACategoryId) throws SQLException, DbException {
	this.testPapersQuestionRangeDeleteByPapersIdCategoryId(APapersId, ACategoryId, "");
}

/**
 * 从数据库中删除一批对象TestPapersQuestionRange
 * <param name="ACategoryId">试卷分类标识</param>
 */
protected void testPapersQuestionRangeDeleteListByCategoryId(int ACategoryId) throws SQLException, DbException {
	TestPapersQuestionRange.deleteListByCategoryId(this.getDataVisit(), ACategoryId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APapersId">考卷标识</param>
 * <param name="ACategoryId">试卷分类标识</param>
 */
protected TestPapersQuestionRange testPapersQuestionRangeSelectByPapersIdCategoryId(int APapersId, int ACategoryId) throws SQLException, DbException {
	return TestPapersQuestionRange.selectByPapersIdCategoryId(this.getDataVisit(), APapersId, ACategoryId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ACategoryId">试卷分类标识</param>
 */
protected List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjectsByCategoryId(int ACategoryId) throws SQLException, DbException {
	return TestPapersQuestionRange.selectObjectsByCategoryId(this.getDataVisit(), ACategoryId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return TestPapersQuestionRange.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return TestPapersQuestionRange.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return TestPapersQuestionRange.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return TestPapersQuestionRange.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends TestPapersQuestionRange> List<T> testPapersQuestionRangeSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return TestPapersQuestionRange.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends TestPapersQuestionRange> List<T> testPapersQuestionRangeSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return TestPapersQuestionRange.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int testPapersQuestionRangeQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_TEST_PAPERS_QUESTION_RANGE].* from [T_TEST_PAPERS_QUESTION_RANGE]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 插入一个对象PapersResult到数据库中
 * <param name="papersResult">需要插入的PapersResult</param>
 */
protected void papersResultInsert(PapersResult papersResult) throws SQLException, DbException {
	PapersResult.insert(this.getDataVisit(), papersResult);
}

/**
 * 更新一个对象PapersResult到数据库中
 * <param name="papersResult">需要更新的PapersResult</param>
 */
protected int papersResultUpdate(PapersResult papersResult) throws SQLException, DbException {
	return this.papersResultUpdate(papersResult, "");
}

/**
 * 更新一个对象PapersResult到数据库中
 * <param name="papersResult">需要更新的PapersResult</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
protected int papersResultUpdate(PapersResult papersResult, String appendConditionSql) throws SQLException, DbException {
	return PapersResult.update(this.getDataVisit(), papersResult, appendConditionSql);
}

/**
 * 从数据库中删除一个对象PapersResult
 * <param name="APapersResultId">回答标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void papersResultDeleteByPapersResultId(int APapersResultId, String appendConditionSql) throws SQLException, DbException {
	PapersResult.deleteByPapersResultId(this.getDataVisit(), APapersResultId, appendConditionSql);
}

/**
 * <param name="papersResult">从数据库中删除一个对象PapersResult</param>
 * <param name="APapersResultId">回答标识</param>
 */
protected void papersResultDeleteByPapersResultId(int APapersResultId) throws SQLException, DbException {
	this.papersResultDeleteByPapersResultId(APapersResultId, "");
}

/**
 * 从数据库中删除一个对象PapersResult
 * <param name="ATesterName">testername</param>
 * <param name="APapersQuestionId">考题标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
protected void papersResultDeleteByTesterNamePapersQuestionId(String ATesterName, int APapersQuestionId, String appendConditionSql) throws SQLException, DbException {
	PapersResult.deleteByTesterNamePapersQuestionId(this.getDataVisit(), ATesterName, APapersQuestionId, appendConditionSql);
}

/**
 * <param name="papersResult">从数据库中删除一个对象PapersResult</param>
 * <param name="ATesterName">testername</param>
 * <param name="APapersQuestionId">考题标识</param>
 */
protected void papersResultDeleteByTesterNamePapersQuestionId(String ATesterName, int APapersQuestionId) throws SQLException, DbException {
	this.papersResultDeleteByTesterNamePapersQuestionId(ATesterName, APapersQuestionId, "");
}

/**
 * 从数据库中删除一批对象PapersResult
 * <param name="APapersQuestionId">考题标识</param>
 */
protected void papersResultDeleteListByPapersQuestionId(int APapersQuestionId) throws SQLException, DbException {
	PapersResult.deleteListByPapersQuestionId(this.getDataVisit(), APapersQuestionId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APapersResultId">回答标识</param>
 */
protected PapersResult papersResultSelectByPapersResultId(int APapersResultId) throws SQLException, DbException {
	return PapersResult.selectByPapersResultId(this.getDataVisit(), APapersResultId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATesterName">testername</param>
 * <param name="APapersQuestionId">考题标识</param>
 */
protected PapersResult papersResultSelectByTesterNamePapersQuestionId(String ATesterName, int APapersQuestionId) throws SQLException, DbException {
	return PapersResult.selectByTesterNamePapersQuestionId(this.getDataVisit(), ATesterName, APapersQuestionId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="APapersQuestionId">考题标识</param>
 */
protected List<PapersResult> papersResultSelectObjectsByPapersQuestionId(int APapersQuestionId) throws SQLException, DbException {
	return PapersResult.selectObjectsByPapersQuestionId(this.getDataVisit(), APapersQuestionId);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<PapersResult> papersResultSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return PapersResult.selectObjectsWithCustomSql(this.getDataVisit(), sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="sql">自定义查询Sql语句</param>
 * @return 查询结果
 */
protected List<PapersResult> papersResultSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return PapersResult.selectObjectsWithCustomSql(this.getDataVisit(), sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected List<PapersResult> papersResultSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return PapersResult.selectObjects(this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected List<PapersResult> papersResultSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return PapersResult.selectObjects(this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
protected <T extends PapersResult> List<T> papersResultSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return PapersResult.selectObjects(type, this.getDataVisit(), appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected <T extends PapersResult> List<T> papersResultSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return PapersResult.selectObjects(type, this.getDataVisit(), appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
protected int papersResultQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	String sql = "select [T_PAPERS_RESULT].* from [T_PAPERS_RESULT]";
	sql = (sql + appendConditionSql);
	int ret = this.getDataVisit().getCount(sql);
	return ret;
}

/**
 * 简单的日志接口,无任何实现
 * <param name="tableName">表名称</param>
 * <param name="operateName">操作名称</param>
 * <param name="keyFieldName">主键字段名</param>
 * <param name="keyFieldValue">主键字段值</param>
 * <param name="param">附加参数</param>
 */
protected void operatesLogSimpleAdd(String tableName, String operateName, String keyFieldName, String keyFieldValue, Object param) throws SQLException, DbException {
}
}
