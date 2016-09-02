package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
/**
 * 基本的商业应用层代码，可扩展
 */
public abstract class BaseBiz {
	
	/**
	 * 插入一个对象到数据库中
	 * <param name="baseEntity">需要插入的新对象</param>
	 */
	public void insert(BaseEntity baseEntity) throws SQLException, DbException {
		this.getDao().insert(baseEntity);
		this.operatesLogSimpleAdd(baseEntity.getTableName(), "插入", baseEntity.getKeyFieldNames(), baseEntity.getKeyFieldValues(), baseEntity);
	}
	
	/**
	 * 更新一个对象到数据库中
	 * <param name="baseEntity">需要更新的对象</param>
	 */
	public int update(BaseEntity baseEntity) throws SQLException, DbException {
		return this.update(baseEntity, "");
	}
	
	/**
	 * 更新一个对象到数据库中
	 * <param name="baseEntity">需要更新的对象</param>
	 * <param name="appendConditionSql">附加的Sql条件</param>
	 */
	public int update(BaseEntity baseEntity, String appendConditionSql) throws SQLException, DbException {
		int ret = this.getDao().update(baseEntity, appendConditionSql);
		this.operatesLogSimpleAdd(baseEntity.getTableName(), "更新", baseEntity.getKeyFieldNames(), baseEntity.getKeyFieldValues(), baseEntity);
		return ret;
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VPrevMonthWorkScore> vPrevMonthWorkScoreSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().vPrevMonthWorkScoreSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	public List<VPrevMonthWorkScore> vPrevMonthWorkScoreSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
		return this.getDao().vPrevMonthWorkScoreSelectObjectsWithCustomSql(sql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VPrevMonthWorkScore> vPrevMonthWorkScoreSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().vPrevMonthWorkScoreSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public List<VPrevMonthWorkScore> vPrevMonthWorkScoreSelectObjects(String appendConditionSql) throws SQLException, DbException {
		return this.getDao().vPrevMonthWorkScoreSelectObjects(appendConditionSql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public VPrevMonthWorkScore vPrevMonthWorkScoreSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
		List<VPrevMonthWorkScore> list = this.vPrevMonthWorkScoreSelectObjects(appendConditionSql);
		return common.util.ListUtil.getFirstItem(VPrevMonthWorkScore.class, list);
	}
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VPrevMonthWorkScore> vPrevMonthWorkScoreSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.vPrevMonthWorkScoreSelectObjects("", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * @return 查询结果
	 */
	public List<VPrevMonthWorkScore> vPrevMonthWorkScoreSelectObjects() throws SQLException, DbException {
		return this.vPrevMonthWorkScoreSelectObjects("");
	}
	
	/**
	 * @return 查询结果
	 */
	public VPrevMonthWorkScore vPrevMonthWorkScoreSelectSingleObject() throws SQLException, DbException {
		return this.vPrevMonthWorkScoreSelectSingleObject("");
	}
	
	/**
	 * <param name="vPrevMonthWorkScoreQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VPrevMonthWorkScore> vPrevMonthWorkScoreSelectObjects(ConditionQuery vPrevMonthWorkScoreQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		String sql = vPrevMonthWorkScoreQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vPrevMonthWorkScoreSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="vPrevMonthWorkScoreQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<VPrevMonthWorkScore> vPrevMonthWorkScoreSelectObjects(ConditionQuery vPrevMonthWorkScoreQueryCondition) throws SQLException, DbException {
		String sql = vPrevMonthWorkScoreQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vPrevMonthWorkScoreSelectObjects(sql);
	}
	
	/**
	 * <param name="vPrevMonthWorkScoreQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public VPrevMonthWorkScore vPrevMonthWorkScoreSelectSingleObject(ConditionQuery vPrevMonthWorkScoreQueryCondition) throws SQLException, DbException {
		List<VPrevMonthWorkScore> list = this.vPrevMonthWorkScoreSelectObjects(vPrevMonthWorkScoreQueryCondition);
		return common.util.ListUtil.getFirstItem(VPrevMonthWorkScore.class, list);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public int vPrevMonthWorkScoreQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
		int ret = this.getDao().vPrevMonthWorkScoreQuerySelectObjectsCount(appendConditionSql);
		return ret;
	}
	
	/**
	 * <param name="vPrevMonthWorkScoreQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int vPrevMonthWorkScoreQuerySelectObjectsCount(ConditionQuery vPrevMonthWorkScoreQueryCondition) throws SQLException, DbException {
		String sql = vPrevMonthWorkScoreQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vPrevMonthWorkScoreQuerySelectObjectsCount(sql);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VProjectTaskUser> vProjectTaskUserSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().vProjectTaskUserSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	public List<VProjectTaskUser> vProjectTaskUserSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
		return this.getDao().vProjectTaskUserSelectObjectsWithCustomSql(sql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VProjectTaskUser> vProjectTaskUserSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().vProjectTaskUserSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public List<VProjectTaskUser> vProjectTaskUserSelectObjects(String appendConditionSql) throws SQLException, DbException {
		return this.getDao().vProjectTaskUserSelectObjects(appendConditionSql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public VProjectTaskUser vProjectTaskUserSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
		List<VProjectTaskUser> list = this.vProjectTaskUserSelectObjects(appendConditionSql);
		return common.util.ListUtil.getFirstItem(VProjectTaskUser.class, list);
	}
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VProjectTaskUser> vProjectTaskUserSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.vProjectTaskUserSelectObjects("", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * @return 查询结果
	 */
	public List<VProjectTaskUser> vProjectTaskUserSelectObjects() throws SQLException, DbException {
		return this.vProjectTaskUserSelectObjects("");
	}
	
	/**
	 * @return 查询结果
	 */
	public VProjectTaskUser vProjectTaskUserSelectSingleObject() throws SQLException, DbException {
		return this.vProjectTaskUserSelectSingleObject("");
	}
	
	/**
	 * <param name="vProjectTaskUserQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VProjectTaskUser> vProjectTaskUserSelectObjects(ConditionQuery vProjectTaskUserQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		String sql = vProjectTaskUserQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vProjectTaskUserSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="vProjectTaskUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<VProjectTaskUser> vProjectTaskUserSelectObjects(ConditionQuery vProjectTaskUserQueryCondition) throws SQLException, DbException {
		String sql = vProjectTaskUserQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vProjectTaskUserSelectObjects(sql);
	}
	
	/**
	 * <param name="vProjectTaskUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public VProjectTaskUser vProjectTaskUserSelectSingleObject(ConditionQuery vProjectTaskUserQueryCondition) throws SQLException, DbException {
		List<VProjectTaskUser> list = this.vProjectTaskUserSelectObjects(vProjectTaskUserQueryCondition);
		return common.util.ListUtil.getFirstItem(VProjectTaskUser.class, list);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public int vProjectTaskUserQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
		int ret = this.getDao().vProjectTaskUserQuerySelectObjectsCount(appendConditionSql);
		return ret;
	}
	
	/**
	 * <param name="vProjectTaskUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int vProjectTaskUserQuerySelectObjectsCount(ConditionQuery vProjectTaskUserQueryCondition) throws SQLException, DbException {
		String sql = vProjectTaskUserQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vProjectTaskUserQuerySelectObjectsCount(sql);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VProjectUser> vProjectUserSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().vProjectUserSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	public List<VProjectUser> vProjectUserSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
		return this.getDao().vProjectUserSelectObjectsWithCustomSql(sql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VProjectUser> vProjectUserSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().vProjectUserSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public List<VProjectUser> vProjectUserSelectObjects(String appendConditionSql) throws SQLException, DbException {
		return this.getDao().vProjectUserSelectObjects(appendConditionSql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public VProjectUser vProjectUserSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
		List<VProjectUser> list = this.vProjectUserSelectObjects(appendConditionSql);
		return common.util.ListUtil.getFirstItem(VProjectUser.class, list);
	}
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VProjectUser> vProjectUserSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.vProjectUserSelectObjects("", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * @return 查询结果
	 */
	public List<VProjectUser> vProjectUserSelectObjects() throws SQLException, DbException {
		return this.vProjectUserSelectObjects("");
	}
	
	/**
	 * @return 查询结果
	 */
	public VProjectUser vProjectUserSelectSingleObject() throws SQLException, DbException {
		return this.vProjectUserSelectSingleObject("");
	}
	
	/**
	 * <param name="vProjectUserQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VProjectUser> vProjectUserSelectObjects(ConditionQuery vProjectUserQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		String sql = vProjectUserQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vProjectUserSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="vProjectUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<VProjectUser> vProjectUserSelectObjects(ConditionQuery vProjectUserQueryCondition) throws SQLException, DbException {
		String sql = vProjectUserQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vProjectUserSelectObjects(sql);
	}
	
	/**
	 * <param name="vProjectUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public VProjectUser vProjectUserSelectSingleObject(ConditionQuery vProjectUserQueryCondition) throws SQLException, DbException {
		List<VProjectUser> list = this.vProjectUserSelectObjects(vProjectUserQueryCondition);
		return common.util.ListUtil.getFirstItem(VProjectUser.class, list);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public int vProjectUserQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
		int ret = this.getDao().vProjectUserQuerySelectObjectsCount(appendConditionSql);
		return ret;
	}
	
	/**
	 * <param name="vProjectUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int vProjectUserQuerySelectObjectsCount(ConditionQuery vProjectUserQueryCondition) throws SQLException, DbException {
		String sql = vProjectUserQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vProjectUserQuerySelectObjectsCount(sql);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VTaskPreviousTask> vTaskPreviousTaskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().vTaskPreviousTaskSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	public List<VTaskPreviousTask> vTaskPreviousTaskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
		return this.getDao().vTaskPreviousTaskSelectObjectsWithCustomSql(sql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VTaskPreviousTask> vTaskPreviousTaskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().vTaskPreviousTaskSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public List<VTaskPreviousTask> vTaskPreviousTaskSelectObjects(String appendConditionSql) throws SQLException, DbException {
		return this.getDao().vTaskPreviousTaskSelectObjects(appendConditionSql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public VTaskPreviousTask vTaskPreviousTaskSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
		List<VTaskPreviousTask> list = this.vTaskPreviousTaskSelectObjects(appendConditionSql);
		return common.util.ListUtil.getFirstItem(VTaskPreviousTask.class, list);
	}
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VTaskPreviousTask> vTaskPreviousTaskSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.vTaskPreviousTaskSelectObjects("", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * @return 查询结果
	 */
	public List<VTaskPreviousTask> vTaskPreviousTaskSelectObjects() throws SQLException, DbException {
		return this.vTaskPreviousTaskSelectObjects("");
	}
	
	/**
	 * @return 查询结果
	 */
	public VTaskPreviousTask vTaskPreviousTaskSelectSingleObject() throws SQLException, DbException {
		return this.vTaskPreviousTaskSelectSingleObject("");
	}
	
	/**
	 * <param name="vTaskPreviousTaskQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VTaskPreviousTask> vTaskPreviousTaskSelectObjects(ConditionQuery vTaskPreviousTaskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		String sql = vTaskPreviousTaskQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vTaskPreviousTaskSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="vTaskPreviousTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<VTaskPreviousTask> vTaskPreviousTaskSelectObjects(ConditionQuery vTaskPreviousTaskQueryCondition) throws SQLException, DbException {
		String sql = vTaskPreviousTaskQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vTaskPreviousTaskSelectObjects(sql);
	}
	
	/**
	 * <param name="vTaskPreviousTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public VTaskPreviousTask vTaskPreviousTaskSelectSingleObject(ConditionQuery vTaskPreviousTaskQueryCondition) throws SQLException, DbException {
		List<VTaskPreviousTask> list = this.vTaskPreviousTaskSelectObjects(vTaskPreviousTaskQueryCondition);
		return common.util.ListUtil.getFirstItem(VTaskPreviousTask.class, list);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public int vTaskPreviousTaskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
		int ret = this.getDao().vTaskPreviousTaskQuerySelectObjectsCount(appendConditionSql);
		return ret;
	}
	
	/**
	 * <param name="vTaskPreviousTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int vTaskPreviousTaskQuerySelectObjectsCount(ConditionQuery vTaskPreviousTaskQueryCondition) throws SQLException, DbException {
		String sql = vTaskPreviousTaskQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vTaskPreviousTaskQuerySelectObjectsCount(sql);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VUserTask> vUserTaskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().vUserTaskSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	public List<VUserTask> vUserTaskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
		return this.getDao().vUserTaskSelectObjectsWithCustomSql(sql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VUserTask> vUserTaskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().vUserTaskSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public List<VUserTask> vUserTaskSelectObjects(String appendConditionSql) throws SQLException, DbException {
		return this.getDao().vUserTaskSelectObjects(appendConditionSql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public VUserTask vUserTaskSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
		List<VUserTask> list = this.vUserTaskSelectObjects(appendConditionSql);
		return common.util.ListUtil.getFirstItem(VUserTask.class, list);
	}
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VUserTask> vUserTaskSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.vUserTaskSelectObjects("", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * @return 查询结果
	 */
	public List<VUserTask> vUserTaskSelectObjects() throws SQLException, DbException {
		return this.vUserTaskSelectObjects("");
	}
	
	/**
	 * @return 查询结果
	 */
	public VUserTask vUserTaskSelectSingleObject() throws SQLException, DbException {
		return this.vUserTaskSelectSingleObject("");
	}
	
	/**
	 * <param name="vUserTaskQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VUserTask> vUserTaskSelectObjects(ConditionQuery vUserTaskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		String sql = vUserTaskQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vUserTaskSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="vUserTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<VUserTask> vUserTaskSelectObjects(ConditionQuery vUserTaskQueryCondition) throws SQLException, DbException {
		String sql = vUserTaskQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vUserTaskSelectObjects(sql);
	}
	
	/**
	 * <param name="vUserTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public VUserTask vUserTaskSelectSingleObject(ConditionQuery vUserTaskQueryCondition) throws SQLException, DbException {
		List<VUserTask> list = this.vUserTaskSelectObjects(vUserTaskQueryCondition);
		return common.util.ListUtil.getFirstItem(VUserTask.class, list);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public int vUserTaskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
		int ret = this.getDao().vUserTaskQuerySelectObjectsCount(appendConditionSql);
		return ret;
	}
	
	/**
	 * <param name="vUserTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int vUserTaskQuerySelectObjectsCount(ConditionQuery vUserTaskQueryCondition) throws SQLException, DbException {
		String sql = vUserTaskQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vUserTaskQuerySelectObjectsCount(sql);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VPapersScore> vPapersScoreSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().vPapersScoreSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	public List<VPapersScore> vPapersScoreSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
		return this.getDao().vPapersScoreSelectObjectsWithCustomSql(sql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VPapersScore> vPapersScoreSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().vPapersScoreSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public List<VPapersScore> vPapersScoreSelectObjects(String appendConditionSql) throws SQLException, DbException {
		return this.getDao().vPapersScoreSelectObjects(appendConditionSql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public VPapersScore vPapersScoreSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
		List<VPapersScore> list = this.vPapersScoreSelectObjects(appendConditionSql);
		return common.util.ListUtil.getFirstItem(VPapersScore.class, list);
	}
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VPapersScore> vPapersScoreSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.vPapersScoreSelectObjects("", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * @return 查询结果
	 */
	public List<VPapersScore> vPapersScoreSelectObjects() throws SQLException, DbException {
		return this.vPapersScoreSelectObjects("");
	}
	
	/**
	 * @return 查询结果
	 */
	public VPapersScore vPapersScoreSelectSingleObject() throws SQLException, DbException {
		return this.vPapersScoreSelectSingleObject("");
	}
	
	/**
	 * <param name="vPapersScoreQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VPapersScore> vPapersScoreSelectObjects(ConditionQuery vPapersScoreQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		String sql = vPapersScoreQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vPapersScoreSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="vPapersScoreQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<VPapersScore> vPapersScoreSelectObjects(ConditionQuery vPapersScoreQueryCondition) throws SQLException, DbException {
		String sql = vPapersScoreQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vPapersScoreSelectObjects(sql);
	}
	
	/**
	 * <param name="vPapersScoreQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public VPapersScore vPapersScoreSelectSingleObject(ConditionQuery vPapersScoreQueryCondition) throws SQLException, DbException {
		List<VPapersScore> list = this.vPapersScoreSelectObjects(vPapersScoreQueryCondition);
		return common.util.ListUtil.getFirstItem(VPapersScore.class, list);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public int vPapersScoreQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
		int ret = this.getDao().vPapersScoreQuerySelectObjectsCount(appendConditionSql);
		return ret;
	}
	
	/**
	 * <param name="vPapersScoreQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int vPapersScoreQuerySelectObjectsCount(ConditionQuery vPapersScoreQueryCondition) throws SQLException, DbException {
		String sql = vPapersScoreQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vPapersScoreQuerySelectObjectsCount(sql);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VQuestionLib> vQuestionLibSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().vQuestionLibSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	public List<VQuestionLib> vQuestionLibSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
		return this.getDao().vQuestionLibSelectObjectsWithCustomSql(sql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VQuestionLib> vQuestionLibSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().vQuestionLibSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public List<VQuestionLib> vQuestionLibSelectObjects(String appendConditionSql) throws SQLException, DbException {
		return this.getDao().vQuestionLibSelectObjects(appendConditionSql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public VQuestionLib vQuestionLibSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
		List<VQuestionLib> list = this.vQuestionLibSelectObjects(appendConditionSql);
		return common.util.ListUtil.getFirstItem(VQuestionLib.class, list);
	}
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VQuestionLib> vQuestionLibSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.vQuestionLibSelectObjects("", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * @return 查询结果
	 */
	public List<VQuestionLib> vQuestionLibSelectObjects() throws SQLException, DbException {
		return this.vQuestionLibSelectObjects("");
	}
	
	/**
	 * @return 查询结果
	 */
	public VQuestionLib vQuestionLibSelectSingleObject() throws SQLException, DbException {
		return this.vQuestionLibSelectSingleObject("");
	}
	
	/**
	 * <param name="vQuestionLibQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VQuestionLib> vQuestionLibSelectObjects(ConditionQuery vQuestionLibQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		String sql = vQuestionLibQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vQuestionLibSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="vQuestionLibQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<VQuestionLib> vQuestionLibSelectObjects(ConditionQuery vQuestionLibQueryCondition) throws SQLException, DbException {
		String sql = vQuestionLibQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vQuestionLibSelectObjects(sql);
	}
	
	/**
	 * <param name="vQuestionLibQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public VQuestionLib vQuestionLibSelectSingleObject(ConditionQuery vQuestionLibQueryCondition) throws SQLException, DbException {
		List<VQuestionLib> list = this.vQuestionLibSelectObjects(vQuestionLibQueryCondition);
		return common.util.ListUtil.getFirstItem(VQuestionLib.class, list);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public int vQuestionLibQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
		int ret = this.getDao().vQuestionLibQuerySelectObjectsCount(appendConditionSql);
		return ret;
	}
	
	/**
	 * <param name="vQuestionLibQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int vQuestionLibQuerySelectObjectsCount(ConditionQuery vQuestionLibQueryCondition) throws SQLException, DbException {
		String sql = vQuestionLibQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vQuestionLibQuerySelectObjectsCount(sql);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VQuestionlibAnswer> vQuestionlibAnswerSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().vQuestionlibAnswerSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	public List<VQuestionlibAnswer> vQuestionlibAnswerSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
		return this.getDao().vQuestionlibAnswerSelectObjectsWithCustomSql(sql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VQuestionlibAnswer> vQuestionlibAnswerSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().vQuestionlibAnswerSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public List<VQuestionlibAnswer> vQuestionlibAnswerSelectObjects(String appendConditionSql) throws SQLException, DbException {
		return this.getDao().vQuestionlibAnswerSelectObjects(appendConditionSql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public VQuestionlibAnswer vQuestionlibAnswerSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
		List<VQuestionlibAnswer> list = this.vQuestionlibAnswerSelectObjects(appendConditionSql);
		return common.util.ListUtil.getFirstItem(VQuestionlibAnswer.class, list);
	}
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VQuestionlibAnswer> vQuestionlibAnswerSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.vQuestionlibAnswerSelectObjects("", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * @return 查询结果
	 */
	public List<VQuestionlibAnswer> vQuestionlibAnswerSelectObjects() throws SQLException, DbException {
		return this.vQuestionlibAnswerSelectObjects("");
	}
	
	/**
	 * @return 查询结果
	 */
	public VQuestionlibAnswer vQuestionlibAnswerSelectSingleObject() throws SQLException, DbException {
		return this.vQuestionlibAnswerSelectSingleObject("");
	}
	
	/**
	 * <param name="vQuestionlibAnswerQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VQuestionlibAnswer> vQuestionlibAnswerSelectObjects(ConditionQuery vQuestionlibAnswerQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		String sql = vQuestionlibAnswerQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vQuestionlibAnswerSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="vQuestionlibAnswerQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<VQuestionlibAnswer> vQuestionlibAnswerSelectObjects(ConditionQuery vQuestionlibAnswerQueryCondition) throws SQLException, DbException {
		String sql = vQuestionlibAnswerQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vQuestionlibAnswerSelectObjects(sql);
	}
	
	/**
	 * <param name="vQuestionlibAnswerQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public VQuestionlibAnswer vQuestionlibAnswerSelectSingleObject(ConditionQuery vQuestionlibAnswerQueryCondition) throws SQLException, DbException {
		List<VQuestionlibAnswer> list = this.vQuestionlibAnswerSelectObjects(vQuestionlibAnswerQueryCondition);
		return common.util.ListUtil.getFirstItem(VQuestionlibAnswer.class, list);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public int vQuestionlibAnswerQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
		int ret = this.getDao().vQuestionlibAnswerQuerySelectObjectsCount(appendConditionSql);
		return ret;
	}
	
	/**
	 * <param name="vQuestionlibAnswerQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int vQuestionlibAnswerQuerySelectObjectsCount(ConditionQuery vQuestionlibAnswerQueryCondition) throws SQLException, DbException {
		String sql = vQuestionlibAnswerQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vQuestionlibAnswerQuerySelectObjectsCount(sql);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VTestPapersQuestion> vTestPapersQuestionSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().vTestPapersQuestionSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	public List<VTestPapersQuestion> vTestPapersQuestionSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
		return this.getDao().vTestPapersQuestionSelectObjectsWithCustomSql(sql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VTestPapersQuestion> vTestPapersQuestionSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().vTestPapersQuestionSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public List<VTestPapersQuestion> vTestPapersQuestionSelectObjects(String appendConditionSql) throws SQLException, DbException {
		return this.getDao().vTestPapersQuestionSelectObjects(appendConditionSql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public VTestPapersQuestion vTestPapersQuestionSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
		List<VTestPapersQuestion> list = this.vTestPapersQuestionSelectObjects(appendConditionSql);
		return common.util.ListUtil.getFirstItem(VTestPapersQuestion.class, list);
	}
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VTestPapersQuestion> vTestPapersQuestionSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.vTestPapersQuestionSelectObjects("", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * @return 查询结果
	 */
	public List<VTestPapersQuestion> vTestPapersQuestionSelectObjects() throws SQLException, DbException {
		return this.vTestPapersQuestionSelectObjects("");
	}
	
	/**
	 * @return 查询结果
	 */
	public VTestPapersQuestion vTestPapersQuestionSelectSingleObject() throws SQLException, DbException {
		return this.vTestPapersQuestionSelectSingleObject("");
	}
	
	/**
	 * <param name="vTestPapersQuestionQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VTestPapersQuestion> vTestPapersQuestionSelectObjects(ConditionQuery vTestPapersQuestionQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		String sql = vTestPapersQuestionQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vTestPapersQuestionSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="vTestPapersQuestionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<VTestPapersQuestion> vTestPapersQuestionSelectObjects(ConditionQuery vTestPapersQuestionQueryCondition) throws SQLException, DbException {
		String sql = vTestPapersQuestionQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vTestPapersQuestionSelectObjects(sql);
	}
	
	/**
	 * <param name="vTestPapersQuestionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public VTestPapersQuestion vTestPapersQuestionSelectSingleObject(ConditionQuery vTestPapersQuestionQueryCondition) throws SQLException, DbException {
		List<VTestPapersQuestion> list = this.vTestPapersQuestionSelectObjects(vTestPapersQuestionQueryCondition);
		return common.util.ListUtil.getFirstItem(VTestPapersQuestion.class, list);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public int vTestPapersQuestionQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
		int ret = this.getDao().vTestPapersQuestionQuerySelectObjectsCount(appendConditionSql);
		return ret;
	}
	
	/**
	 * <param name="vTestPapersQuestionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int vTestPapersQuestionQuerySelectObjectsCount(ConditionQuery vTestPapersQuestionQueryCondition) throws SQLException, DbException {
		String sql = vTestPapersQuestionQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vTestPapersQuestionQuerySelectObjectsCount(sql);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VTestPapersResult> vTestPapersResultSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().vTestPapersResultSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	public List<VTestPapersResult> vTestPapersResultSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
		return this.getDao().vTestPapersResultSelectObjectsWithCustomSql(sql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VTestPapersResult> vTestPapersResultSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().vTestPapersResultSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public List<VTestPapersResult> vTestPapersResultSelectObjects(String appendConditionSql) throws SQLException, DbException {
		return this.getDao().vTestPapersResultSelectObjects(appendConditionSql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public VTestPapersResult vTestPapersResultSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
		List<VTestPapersResult> list = this.vTestPapersResultSelectObjects(appendConditionSql);
		return common.util.ListUtil.getFirstItem(VTestPapersResult.class, list);
	}
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VTestPapersResult> vTestPapersResultSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.vTestPapersResultSelectObjects("", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * @return 查询结果
	 */
	public List<VTestPapersResult> vTestPapersResultSelectObjects() throws SQLException, DbException {
		return this.vTestPapersResultSelectObjects("");
	}
	
	/**
	 * @return 查询结果
	 */
	public VTestPapersResult vTestPapersResultSelectSingleObject() throws SQLException, DbException {
		return this.vTestPapersResultSelectSingleObject("");
	}
	
	/**
	 * <param name="vTestPapersResultQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<VTestPapersResult> vTestPapersResultSelectObjects(ConditionQuery vTestPapersResultQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		String sql = vTestPapersResultQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vTestPapersResultSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="vTestPapersResultQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<VTestPapersResult> vTestPapersResultSelectObjects(ConditionQuery vTestPapersResultQueryCondition) throws SQLException, DbException {
		String sql = vTestPapersResultQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vTestPapersResultSelectObjects(sql);
	}
	
	/**
	 * <param name="vTestPapersResultQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public VTestPapersResult vTestPapersResultSelectSingleObject(ConditionQuery vTestPapersResultQueryCondition) throws SQLException, DbException {
		List<VTestPapersResult> list = this.vTestPapersResultSelectObjects(vTestPapersResultQueryCondition);
		return common.util.ListUtil.getFirstItem(VTestPapersResult.class, list);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public int vTestPapersResultQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
		int ret = this.getDao().vTestPapersResultQuerySelectObjectsCount(appendConditionSql);
		return ret;
	}
	
	/**
	 * <param name="vTestPapersResultQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public int vTestPapersResultQuerySelectObjectsCount(ConditionQuery vTestPapersResultQueryCondition) throws SQLException, DbException {
		String sql = vTestPapersResultQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.vTestPapersResultQuerySelectObjectsCount(sql);
	}
	
	public String pGetIdentity(String tabName, int style, int len, String ret) throws SQLException, DbException {
		return this.getDao().pGetIdentity(tabName, style, len, ret);
	}
	
	protected String pGetIdentity(PGetIdentityParam pGetIdentityParam) throws SQLException, DbException {
		return this.getDao().pGetIdentity(pGetIdentityParam);
	}
	
	public void proctest(int p1, String p2) throws SQLException, DbException {
		this.getDao().proctest(p1, p2);
	}
	
	protected void proctest(ProctestParam proctestParam) throws SQLException, DbException {
		this.getDao().proctest(proctestParam);
	}
	
	public abstract BusinessLogicManage getDao() throws SQLException, DbException;
	
	/**
	 * 插入一个对象Jbpm4Swimlane到数据库中
	 * <param name="jbpm4Swimlane">需要插入的新对象</param>
	 */
	public void jbpm4SwimlaneInsert(Jbpm4Swimlane jbpm4Swimlane) throws SQLException, DbException {
		this.getDao().jbpm4SwimlaneInsert(jbpm4Swimlane);
		String kvalue = "";
		kvalue = (kvalue + jbpm4Swimlane.getDbid());
		this.operatesLogSimpleAdd("JBPM4_SWIMLANE", "插入", "DBID_", kvalue, jbpm4Swimlane);
	}
	
	/**
	 * 从数据库中删除一个对象Jbpm4Swimlane
	 * <param name="ADbid"></param>
	 * <param name="appendConditionSql">附加的条件语句</param>
	 */
	public void jbpm4SwimlaneDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
		String sql;
		sql = "";
		sql = (sql + "[JBPM4_SWIMLANE].[DBID_] = ");
		sql = (sql + ADbid);
		sql = (sql + appendConditionSql);
		if ((this.getDao().jbpm4TaskSelectObjects((" inner join JBPM4_SWIMLANE on [JBPM4_SWIMLANE].[DBID_] = [JBPM4_TASK].[SWIMLANE_]" +
" where " + sql)).size() > 0)) {
			throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_SWIMLANE", "JBPM4_TASK"));
		}
		sql = "";
		sql = (sql + "[JBPM4_SWIMLANE].[DBID_] = ");
		sql = (sql + ADbid);
		sql = (sql + appendConditionSql);
		if ((this.getDao().jbpm4ParticipationSelectObjects((" inner join JBPM4_SWIMLANE on [JBPM4_SWIMLANE].[DBID_] = [JBPM4_PARTICIPATION].[S" +
"WIMLANE_] where " + sql)).size() > 0)) {
			throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_SWIMLANE", "JBPM4_PARTICIPATION"));
		}
		this.getDao().jbpm4SwimlaneDeleteByDbid(ADbid, appendConditionSql);
		String kvalue = "";
		kvalue = (kvalue + ADbid);
		kvalue = (kvalue + appendConditionSql);
		this.operatesLogSimpleAdd("JBPM4_SWIMLANE", "删除", "DBID_", kvalue, null);
	}
	
	/**
	 * 从数据库中删除一个对象Jbpm4Swimlane
	 * <param name="ADbid"></param>
	 */
	public void jbpm4SwimlaneDeleteByDbid(double ADbid) throws SQLException, DbException {
		this.jbpm4SwimlaneDeleteByDbid(ADbid, "");
	}
	
	/**
	 * 从数据库中删除一批对象Jbpm4Swimlane
	 * <param name="AExecution"></param>
	 */
	public void jbpm4SwimlaneDeleteListByExecution(Double AExecution) throws SQLException, DbException {
		if ((this.getDao().jbpm4TaskSelectObjects((" inner join JBPM4_SWIMLANE on [JBPM4_SWIMLANE].[DBID_] = [JBPM4_TASK].[SWIMLANE_]" +
" where [JBPM4_SWIMLANE].[EXECUTION_] = " + AExecution)).size() > 0)) {
			throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_SWIMLANE", "JBPM4_TASK"));
		}
		if ((this.getDao().jbpm4ParticipationSelectObjects((" inner join JBPM4_SWIMLANE on [JBPM4_SWIMLANE].[DBID_] = [JBPM4_PARTICIPATION].[S" +
"WIMLANE_] where [JBPM4_SWIMLANE].[EXECUTION_] = " + AExecution)).size() > 0)) {
			throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_SWIMLANE", "JBPM4_PARTICIPATION"));
		}
		this.getDao().jbpm4SwimlaneDeleteListByExecution(AExecution);
		String kvalue = "";
		kvalue = (kvalue + AExecution);
		this.operatesLogSimpleAdd("JBPM4_SWIMLANE", "删除", "EXECUTION_", kvalue, null);
	}
	
	/**
	 * 更新一个对象Jbpm4Swimlane到数据库中
	 * <param name="jbpm4Swimlane">需要更新的Jbpm4Swimlane</param>
	 */
	public int jbpm4SwimlaneUpdate(Jbpm4Swimlane jbpm4Swimlane) throws SQLException, DbException {
		return this.jbpm4SwimlaneUpdate(jbpm4Swimlane, "");
	}
	
	/**
	 * 更新一个对象Jbpm4Swimlane到数据库中
	 * <param name="jbpm4Swimlane">需要更新的Jbpm4Swimlane</param>
	 * <param name="appendConditionSql">附加的Sql条件</param>
	 */
	public int jbpm4SwimlaneUpdate(Jbpm4Swimlane jbpm4Swimlane, String appendConditionSql) throws SQLException, DbException {
		int ret = this.getDao().jbpm4SwimlaneUpdate(jbpm4Swimlane, appendConditionSql);
		String kvalue = "";
		kvalue = (kvalue + jbpm4Swimlane.getDbid());
		this.operatesLogSimpleAdd("JBPM4_SWIMLANE", "更新", "DBID_", kvalue, jbpm4Swimlane);
		return ret;
	}
	
	/**
	 * 根据对象的唯一索引从数据库中查询一个对象
	 * <param name="ADbid"></param>
	 */
	public Jbpm4Swimlane jbpm4SwimlaneSelectByDbid(double ADbid) throws SQLException, DbException {
		return this.getDao().jbpm4SwimlaneSelectByDbid(ADbid);
	}
	
	/**
	 * 从数据库中根据外键值选取一批对象
	 * <param name="AExecution"></param>
	 */
	public List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjectsByExecution(Double AExecution) throws SQLException, DbException {
		return this.getDao().jbpm4SwimlaneSelectObjectsByExecution(AExecution);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().jbpm4SwimlaneSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	public List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
		return this.getDao().jbpm4SwimlaneSelectObjectsWithCustomSql(sql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.getDao().jbpm4SwimlaneSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjects(String appendConditionSql) throws SQLException, DbException {
		return this.getDao().jbpm4SwimlaneSelectObjects(appendConditionSql);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public Jbpm4Swimlane jbpm4SwimlaneSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
		List<Jbpm4Swimlane> list = this.jbpm4SwimlaneSelectObjects(appendConditionSql);
		return common.util.ListUtil.getFirstItem(Jbpm4Swimlane.class, list);
	}
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		return this.jbpm4SwimlaneSelectObjects("", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * @return 查询结果
	 */
	public List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjects() throws SQLException, DbException {
		return this.jbpm4SwimlaneSelectObjects("");
	}
	
	/**
	 * @return 查询结果
	 */
	public Jbpm4Swimlane jbpm4SwimlaneSelectSingleObject() throws SQLException, DbException {
		return this.jbpm4SwimlaneSelectSingleObject("");
	}
	
	/**
	 * <param name="jbpm4SwimlaneQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjects(ConditionQuery jbpm4SwimlaneQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		String sql = jbpm4SwimlaneQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.jbpm4SwimlaneSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * <param name="jbpm4SwimlaneQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjects(ConditionQuery jbpm4SwimlaneQueryCondition) throws SQLException, DbException {
		String sql = jbpm4SwimlaneQueryCondition.getConditionSql();
		if (StringUtils.isNullOrEmpty(sql)) {
		}
		else {
			sql = (" where " + sql);
		}
		return this.jbpm4SwimlaneSelectObjects(sql);
	}
	
	/**
	 * <param name="jbpm4SwimlaneQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	public Jbpm4Swimlane jbpm4SwimlaneSelectSingleObject(ConditionQuery jbpm4SwimlaneQueryCondition) throws SQLException, DbException {
		List<Jbpm4Swimlane> list = this.jbpm4SwimlaneSelectObjects(jbpm4SwimlaneQueryCondition);
		return common.util.ListUtil.getFirstItem(Jbpm4Swimlane.class, list);
	}
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public <T extends Jbpm4Swimlane> List<T> jbpm4SwimlaneSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4SwimlaneSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4Swimlane> List<T> jbpm4SwimlaneSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4SwimlaneSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4Swimlane> T jbpm4SwimlaneSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4SwimlaneSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Swimlane> List<T> jbpm4SwimlaneSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4SwimlaneSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4Swimlane> List<T> jbpm4SwimlaneSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4SwimlaneSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4Swimlane> T jbpm4SwimlaneSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4SwimlaneSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="jbpm4SwimlaneQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Swimlane> List<T> jbpm4SwimlaneSelectObjects(Class<T> type, ConditionQuery jbpm4SwimlaneQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4SwimlaneQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4SwimlaneSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4SwimlaneQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4Swimlane> List<T> jbpm4SwimlaneSelectObjects(Class<T> type, ConditionQuery jbpm4SwimlaneQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4SwimlaneQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4SwimlaneSelectObjects(type, sql);
}

/**
 * <param name="jbpm4SwimlaneQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4Swimlane> T jbpm4SwimlaneSelectSingleObject(Class<T> type, ConditionQuery jbpm4SwimlaneQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4SwimlaneSelectObjects(type, jbpm4SwimlaneQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int jbpm4SwimlaneQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4SwimlaneQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="jbpm4SwimlaneQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int jbpm4SwimlaneQuerySelectObjectsCount(ConditionQuery jbpm4SwimlaneQueryCondition) throws SQLException, DbException {
	String sql = jbpm4SwimlaneQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4SwimlaneQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Jbpm4Task到数据库中
 * <param name="jbpm4Task">需要插入的新对象</param>
 */
public void jbpm4TaskInsert(Jbpm4Task jbpm4Task) throws SQLException, DbException {
	this.getDao().jbpm4TaskInsert(jbpm4Task);
	String kvalue = "";
	kvalue = (kvalue + jbpm4Task.getDbid());
	this.operatesLogSimpleAdd("JBPM4_TASK", "插入", "DBID_", kvalue, jbpm4Task);
}

/**
 * 从数据库中删除一个对象Jbpm4Task
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void jbpm4TaskDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[JBPM4_TASK].[DBID_] = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	if ((this.getDao().jbpm4VariableSelectObjects((" inner join JBPM4_TASK on [JBPM4_TASK].[DBID_] = [JBPM4_VARIABLE].[TASK_] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_TASK", "JBPM4_VARIABLE"));
	}
	sql = "";
	sql = (sql + "[JBPM4_TASK].[DBID_] = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	if ((this.getDao().jbpm4ParticipationSelectObjects((" inner join JBPM4_TASK on [JBPM4_TASK].[DBID_] = [JBPM4_PARTICIPATION].[TASK_] wh" +
"ere " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_TASK", "JBPM4_PARTICIPATION"));
	}
	this.getDao().jbpm4TaskDeleteByDbid(ADbid, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ADbid);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("JBPM4_TASK", "删除", "DBID_", kvalue, null);
}

/**
 * 从数据库中删除一个对象Jbpm4Task
 * <param name="ADbid"></param>
 */
public void jbpm4TaskDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4TaskDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4Task
 * <param name="ASwimlane"></param>
 */
public void jbpm4TaskDeleteListBySwimlane(Double ASwimlane) throws SQLException, DbException {
	if ((this.getDao().jbpm4VariableSelectObjects((" inner join JBPM4_TASK on [JBPM4_TASK].[DBID_] = [JBPM4_VARIABLE].[TASK_] where [" +
"JBPM4_TASK].[SWIMLANE_] = " + ASwimlane)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_TASK", "JBPM4_VARIABLE"));
	}
	if ((this.getDao().jbpm4ParticipationSelectObjects((" inner join JBPM4_TASK on [JBPM4_TASK].[DBID_] = [JBPM4_PARTICIPATION].[TASK_] wh" +
"ere [JBPM4_TASK].[SWIMLANE_] = " + ASwimlane)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_TASK", "JBPM4_PARTICIPATION"));
	}
	this.getDao().jbpm4TaskDeleteListBySwimlane(ASwimlane);
	String kvalue = "";
	kvalue = (kvalue + ASwimlane);
	this.operatesLogSimpleAdd("JBPM4_TASK", "删除", "SWIMLANE_", kvalue, null);
}

/**
 * 从数据库中删除一批对象Jbpm4Task
 * <param name="ASupertask"></param>
 */
public void jbpm4TaskDeleteListBySupertask(Double ASupertask) throws SQLException, DbException {
	if ((this.getDao().jbpm4VariableSelectObjects((" inner join JBPM4_TASK on [JBPM4_TASK].[DBID_] = [JBPM4_VARIABLE].[TASK_] where [" +
"JBPM4_TASK].[SUPERTASK_] = " + ASupertask)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_TASK", "JBPM4_VARIABLE"));
	}
	if ((this.getDao().jbpm4ParticipationSelectObjects((" inner join JBPM4_TASK on [JBPM4_TASK].[DBID_] = [JBPM4_PARTICIPATION].[TASK_] wh" +
"ere [JBPM4_TASK].[SUPERTASK_] = " + ASupertask)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_TASK", "JBPM4_PARTICIPATION"));
	}
	this.getDao().jbpm4TaskDeleteListBySupertask(ASupertask);
	String kvalue = "";
	kvalue = (kvalue + ASupertask);
	this.operatesLogSimpleAdd("JBPM4_TASK", "删除", "SUPERTASK_", kvalue, null);
}

/**
 * 更新一个对象Jbpm4Task到数据库中
 * <param name="jbpm4Task">需要更新的Jbpm4Task</param>
 */
public int jbpm4TaskUpdate(Jbpm4Task jbpm4Task) throws SQLException, DbException {
	return this.jbpm4TaskUpdate(jbpm4Task, "");
}

/**
 * 更新一个对象Jbpm4Task到数据库中
 * <param name="jbpm4Task">需要更新的Jbpm4Task</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int jbpm4TaskUpdate(Jbpm4Task jbpm4Task, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4TaskUpdate(jbpm4Task, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + jbpm4Task.getDbid());
	this.operatesLogSimpleAdd("JBPM4_TASK", "更新", "DBID_", kvalue, jbpm4Task);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
public Jbpm4Task jbpm4TaskSelectByDbid(double ADbid) throws SQLException, DbException {
	return this.getDao().jbpm4TaskSelectByDbid(ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ASwimlane"></param>
 */
public List<Jbpm4Task> jbpm4TaskSelectObjectsBySwimlane(Double ASwimlane) throws SQLException, DbException {
	return this.getDao().jbpm4TaskSelectObjectsBySwimlane(ASwimlane);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ASupertask"></param>
 */
public List<Jbpm4Task> jbpm4TaskSelectObjectsBySupertask(Double ASupertask) throws SQLException, DbException {
	return this.getDao().jbpm4TaskSelectObjectsBySupertask(ASupertask);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Task> jbpm4TaskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4TaskSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Jbpm4Task> jbpm4TaskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().jbpm4TaskSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Task> jbpm4TaskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4TaskSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Jbpm4Task> jbpm4TaskSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().jbpm4TaskSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Jbpm4Task jbpm4TaskSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Jbpm4Task> list = this.jbpm4TaskSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Jbpm4Task.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Task> jbpm4TaskSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.jbpm4TaskSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Jbpm4Task> jbpm4TaskSelectObjects() throws SQLException, DbException {
	return this.jbpm4TaskSelectObjects("");
}

/**
 * @return 查询结果
 */
public Jbpm4Task jbpm4TaskSelectSingleObject() throws SQLException, DbException {
	return this.jbpm4TaskSelectSingleObject("");
}

/**
 * <param name="jbpm4TaskQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Task> jbpm4TaskSelectObjects(ConditionQuery jbpm4TaskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = jbpm4TaskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4TaskSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4TaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Jbpm4Task> jbpm4TaskSelectObjects(ConditionQuery jbpm4TaskQueryCondition) throws SQLException, DbException {
	String sql = jbpm4TaskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4TaskSelectObjects(sql);
}

/**
 * <param name="jbpm4TaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Jbpm4Task jbpm4TaskSelectSingleObject(ConditionQuery jbpm4TaskQueryCondition) throws SQLException, DbException {
	List<Jbpm4Task> list = this.jbpm4TaskSelectObjects(jbpm4TaskQueryCondition);
	return common.util.ListUtil.getFirstItem(Jbpm4Task.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Task> List<T> jbpm4TaskSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4TaskSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4Task> List<T> jbpm4TaskSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4TaskSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4Task> T jbpm4TaskSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4TaskSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Task> List<T> jbpm4TaskSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4TaskSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4Task> List<T> jbpm4TaskSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4TaskSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4Task> T jbpm4TaskSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4TaskSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="jbpm4TaskQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Task> List<T> jbpm4TaskSelectObjects(Class<T> type, ConditionQuery jbpm4TaskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4TaskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4TaskSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4TaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4Task> List<T> jbpm4TaskSelectObjects(Class<T> type, ConditionQuery jbpm4TaskQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4TaskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4TaskSelectObjects(type, sql);
}

/**
 * <param name="jbpm4TaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4Task> T jbpm4TaskSelectSingleObject(Class<T> type, ConditionQuery jbpm4TaskQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4TaskSelectObjects(type, jbpm4TaskQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int jbpm4TaskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4TaskQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="jbpm4TaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int jbpm4TaskQuerySelectObjectsCount(ConditionQuery jbpm4TaskQueryCondition) throws SQLException, DbException {
	String sql = jbpm4TaskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4TaskQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Jbpm4Variable到数据库中
 * <param name="jbpm4Variable">需要插入的新对象</param>
 */
public void jbpm4VariableInsert(Jbpm4Variable jbpm4Variable) throws SQLException, DbException {
	this.getDao().jbpm4VariableInsert(jbpm4Variable);
	String kvalue = "";
	kvalue = (kvalue + jbpm4Variable.getDbid());
	this.operatesLogSimpleAdd("JBPM4_VARIABLE", "插入", "DBID_", kvalue, jbpm4Variable);
}

/**
 * 从数据库中删除一个对象Jbpm4Variable
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void jbpm4VariableDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().jbpm4VariableDeleteByDbid(ADbid, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ADbid);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("JBPM4_VARIABLE", "删除", "DBID_", kvalue, null);
}

/**
 * 从数据库中删除一个对象Jbpm4Variable
 * <param name="ADbid"></param>
 */
public void jbpm4VariableDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4VariableDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4Variable
 * <param name="AExesys"></param>
 */
public void jbpm4VariableDeleteListByExesys(Double AExesys) throws SQLException, DbException {
	this.getDao().jbpm4VariableDeleteListByExesys(AExesys);
	String kvalue = "";
	kvalue = (kvalue + AExesys);
	this.operatesLogSimpleAdd("JBPM4_VARIABLE", "删除", "EXESYS_", kvalue, null);
}

/**
 * 从数据库中删除一批对象Jbpm4Variable
 * <param name="AExecution"></param>
 */
public void jbpm4VariableDeleteListByExecution(Double AExecution) throws SQLException, DbException {
	this.getDao().jbpm4VariableDeleteListByExecution(AExecution);
	String kvalue = "";
	kvalue = (kvalue + AExecution);
	this.operatesLogSimpleAdd("JBPM4_VARIABLE", "删除", "EXECUTION_", kvalue, null);
}

/**
 * 从数据库中删除一批对象Jbpm4Variable
 * <param name="ALob"></param>
 */
public void jbpm4VariableDeleteListByLob(Double ALob) throws SQLException, DbException {
	this.getDao().jbpm4VariableDeleteListByLob(ALob);
	String kvalue = "";
	kvalue = (kvalue + ALob);
	this.operatesLogSimpleAdd("JBPM4_VARIABLE", "删除", "LOB_", kvalue, null);
}

/**
 * 从数据库中删除一批对象Jbpm4Variable
 * <param name="ATask"></param>
 */
public void jbpm4VariableDeleteListByTask(Double ATask) throws SQLException, DbException {
	this.getDao().jbpm4VariableDeleteListByTask(ATask);
	String kvalue = "";
	kvalue = (kvalue + ATask);
	this.operatesLogSimpleAdd("JBPM4_VARIABLE", "删除", "TASK_", kvalue, null);
}

/**
 * 更新一个对象Jbpm4Variable到数据库中
 * <param name="jbpm4Variable">需要更新的Jbpm4Variable</param>
 */
public int jbpm4VariableUpdate(Jbpm4Variable jbpm4Variable) throws SQLException, DbException {
	return this.jbpm4VariableUpdate(jbpm4Variable, "");
}

/**
 * 更新一个对象Jbpm4Variable到数据库中
 * <param name="jbpm4Variable">需要更新的Jbpm4Variable</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int jbpm4VariableUpdate(Jbpm4Variable jbpm4Variable, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4VariableUpdate(jbpm4Variable, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + jbpm4Variable.getDbid());
	this.operatesLogSimpleAdd("JBPM4_VARIABLE", "更新", "DBID_", kvalue, jbpm4Variable);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
public Jbpm4Variable jbpm4VariableSelectByDbid(double ADbid) throws SQLException, DbException {
	return this.getDao().jbpm4VariableSelectByDbid(ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AExesys"></param>
 */
public List<Jbpm4Variable> jbpm4VariableSelectObjectsByExesys(Double AExesys) throws SQLException, DbException {
	return this.getDao().jbpm4VariableSelectObjectsByExesys(AExesys);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AExecution"></param>
 */
public List<Jbpm4Variable> jbpm4VariableSelectObjectsByExecution(Double AExecution) throws SQLException, DbException {
	return this.getDao().jbpm4VariableSelectObjectsByExecution(AExecution);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ALob"></param>
 */
public List<Jbpm4Variable> jbpm4VariableSelectObjectsByLob(Double ALob) throws SQLException, DbException {
	return this.getDao().jbpm4VariableSelectObjectsByLob(ALob);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATask"></param>
 */
public List<Jbpm4Variable> jbpm4VariableSelectObjectsByTask(Double ATask) throws SQLException, DbException {
	return this.getDao().jbpm4VariableSelectObjectsByTask(ATask);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Variable> jbpm4VariableSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4VariableSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Jbpm4Variable> jbpm4VariableSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().jbpm4VariableSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Variable> jbpm4VariableSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4VariableSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Jbpm4Variable> jbpm4VariableSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().jbpm4VariableSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Jbpm4Variable jbpm4VariableSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Jbpm4Variable> list = this.jbpm4VariableSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Jbpm4Variable.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Variable> jbpm4VariableSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.jbpm4VariableSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Jbpm4Variable> jbpm4VariableSelectObjects() throws SQLException, DbException {
	return this.jbpm4VariableSelectObjects("");
}

/**
 * @return 查询结果
 */
public Jbpm4Variable jbpm4VariableSelectSingleObject() throws SQLException, DbException {
	return this.jbpm4VariableSelectSingleObject("");
}

/**
 * <param name="jbpm4VariableQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Variable> jbpm4VariableSelectObjects(ConditionQuery jbpm4VariableQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = jbpm4VariableQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4VariableSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4VariableQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Jbpm4Variable> jbpm4VariableSelectObjects(ConditionQuery jbpm4VariableQueryCondition) throws SQLException, DbException {
	String sql = jbpm4VariableQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4VariableSelectObjects(sql);
}

/**
 * <param name="jbpm4VariableQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Jbpm4Variable jbpm4VariableSelectSingleObject(ConditionQuery jbpm4VariableQueryCondition) throws SQLException, DbException {
	List<Jbpm4Variable> list = this.jbpm4VariableSelectObjects(jbpm4VariableQueryCondition);
	return common.util.ListUtil.getFirstItem(Jbpm4Variable.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Variable> List<T> jbpm4VariableSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4VariableSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4Variable> List<T> jbpm4VariableSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4VariableSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4Variable> T jbpm4VariableSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4VariableSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Variable> List<T> jbpm4VariableSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4VariableSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4Variable> List<T> jbpm4VariableSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4VariableSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4Variable> T jbpm4VariableSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4VariableSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="jbpm4VariableQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Variable> List<T> jbpm4VariableSelectObjects(Class<T> type, ConditionQuery jbpm4VariableQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4VariableQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4VariableSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4VariableQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4Variable> List<T> jbpm4VariableSelectObjects(Class<T> type, ConditionQuery jbpm4VariableQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4VariableQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4VariableSelectObjects(type, sql);
}

/**
 * <param name="jbpm4VariableQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4Variable> T jbpm4VariableSelectSingleObject(Class<T> type, ConditionQuery jbpm4VariableQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4VariableSelectObjects(type, jbpm4VariableQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int jbpm4VariableQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4VariableQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="jbpm4VariableQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int jbpm4VariableQuerySelectObjectsCount(ConditionQuery jbpm4VariableQueryCondition) throws SQLException, DbException {
	String sql = jbpm4VariableQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4VariableQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Project到数据库中
 * <param name="project">需要插入的新对象</param>
 */
public void projectInsert(Project project) throws SQLException, DbException {
	this.getDao().projectInsert(project);
	String kvalue = "";
	kvalue = (kvalue + project.getProjId());
	this.operatesLogSimpleAdd("T_PROJECT", "插入", "PROJ_ID", kvalue, project);
}

/**
 * 从数据库中删除一个对象Project
 * <param name="AProjId">工程号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void projectDeleteByProjId(int AProjId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_PROJECT].[PROJ_ID] = ");
	sql = (sql + AProjId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().projectJoinUserSelectObjects((" inner join T_PROJECT on [T_PROJECT].[PROJ_ID] = [T_PROJECT_JOIN_USER].[PROJECT_I" +
"D] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_PROJECT", "T_PROJECT_JOIN_USER"));
	}
	sql = "";
	sql = (sql + "[T_PROJECT].[PROJ_ID] = ");
	sql = (sql + AProjId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueProjectSelectObjects((" inner join T_PROJECT on [T_PROJECT].[PROJ_ID] = [T_ISSUE_PROJECT].[INNER_PROJ_ID" +
"] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_PROJECT", "T_ISSUE_PROJECT"));
	}
	sql = "";
	sql = (sql + "[T_PROJECT].[PROJ_ID] = ");
	sql = (sql + AProjId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().taskSelectObjects((" inner join T_PROJECT on [T_PROJECT].[PROJ_ID] = [T_TASK].[TASK_PROJECT_ID] where" +
" " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_PROJECT", "T_TASK"));
	}
	sql = "";
	sql = (sql + "[T_PROJECT].[PROJ_ID] = ");
	sql = (sql + AProjId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().ormappingProjectSelectObjects((" inner join T_PROJECT on [T_PROJECT].[PROJ_ID] = [T_ORMAPPING_PROJECT].[PROJ_ID] " +
"where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_PROJECT", "T_ORMAPPING_PROJECT"));
	}
	this.getDao().projectDeleteByProjId(AProjId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AProjId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_PROJECT", "删除", "PROJ_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象Project
 * <param name="AProjId">工程号</param>
 */
public void projectDeleteByProjId(int AProjId) throws SQLException, DbException {
	this.projectDeleteByProjId(AProjId, "");
}

/**
 * 从数据库中删除一批对象Project
 * <param name="AProjectManagerId">工程管理员号</param>
 */
public void projectDeleteListByProjectManagerId(Integer AProjectManagerId) throws SQLException, DbException {
	if ((this.getDao().projectJoinUserSelectObjects((" inner join T_PROJECT on [T_PROJECT].[PROJ_ID] = [T_PROJECT_JOIN_USER].[PROJECT_I" +
"D] where [T_PROJECT].[PROJECT_MANAGER_ID] = " + AProjectManagerId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_PROJECT", "T_PROJECT_JOIN_USER"));
	}
	if ((this.getDao().issueProjectSelectObjects((" inner join T_PROJECT on [T_PROJECT].[PROJ_ID] = [T_ISSUE_PROJECT].[INNER_PROJ_ID" +
"] where [T_PROJECT].[PROJECT_MANAGER_ID] = " + AProjectManagerId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_PROJECT", "T_ISSUE_PROJECT"));
	}
	if ((this.getDao().taskSelectObjects((" inner join T_PROJECT on [T_PROJECT].[PROJ_ID] = [T_TASK].[TASK_PROJECT_ID] where" +
" [T_PROJECT].[PROJECT_MANAGER_ID] = " + AProjectManagerId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_PROJECT", "T_TASK"));
	}
	if ((this.getDao().ormappingProjectSelectObjects((" inner join T_PROJECT on [T_PROJECT].[PROJ_ID] = [T_ORMAPPING_PROJECT].[PROJ_ID] " +
"where [T_PROJECT].[PROJECT_MANAGER_ID] = " + AProjectManagerId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_PROJECT", "T_ORMAPPING_PROJECT"));
	}
	this.getDao().projectDeleteListByProjectManagerId(AProjectManagerId);
	String kvalue = "";
	kvalue = (kvalue + AProjectManagerId);
	this.operatesLogSimpleAdd("T_PROJECT", "删除", "PROJECT_MANAGER_ID", kvalue, null);
}

/**
 * 更新一个对象Project到数据库中
 * <param name="project">需要更新的Project</param>
 */
public int projectUpdate(Project project) throws SQLException, DbException {
	return this.projectUpdate(project, "");
}

/**
 * 更新一个对象Project到数据库中
 * <param name="project">需要更新的Project</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int projectUpdate(Project project, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().projectUpdate(project, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + project.getProjId());
	this.operatesLogSimpleAdd("T_PROJECT", "更新", "PROJ_ID", kvalue, project);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AProjId">工程号</param>
 */
public Project projectSelectByProjId(int AProjId) throws SQLException, DbException {
	return this.getDao().projectSelectByProjId(AProjId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AProjectManagerId">工程管理员号</param>
 */
public List<Project> projectSelectObjectsByProjectManagerId(Integer AProjectManagerId) throws SQLException, DbException {
	return this.getDao().projectSelectObjectsByProjectManagerId(AProjectManagerId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Project> projectSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().projectSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Project> projectSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().projectSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Project> projectSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().projectSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Project> projectSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().projectSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Project projectSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Project> list = this.projectSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Project.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Project> projectSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.projectSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Project> projectSelectObjects() throws SQLException, DbException {
	return this.projectSelectObjects("");
}

/**
 * @return 查询结果
 */
public Project projectSelectSingleObject() throws SQLException, DbException {
	return this.projectSelectSingleObject("");
}

/**
 * <param name="projectQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Project> projectSelectObjects(ConditionQuery projectQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = projectQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.projectSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="projectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Project> projectSelectObjects(ConditionQuery projectQueryCondition) throws SQLException, DbException {
	String sql = projectQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.projectSelectObjects(sql);
}

/**
 * <param name="projectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Project projectSelectSingleObject(ConditionQuery projectQueryCondition) throws SQLException, DbException {
	List<Project> list = this.projectSelectObjects(projectQueryCondition);
	return common.util.ListUtil.getFirstItem(Project.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Project> List<T> projectSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().projectSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Project> List<T> projectSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().projectSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Project> T projectSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.projectSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Project> List<T> projectSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.projectSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Project> List<T> projectSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.projectSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Project> T projectSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.projectSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="projectQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Project> List<T> projectSelectObjects(Class<T> type, ConditionQuery projectQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = projectQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.projectSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="projectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Project> List<T> projectSelectObjects(Class<T> type, ConditionQuery projectQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = projectQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.projectSelectObjects(type, sql);
}

/**
 * <param name="projectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Project> T projectSelectSingleObject(Class<T> type, ConditionQuery projectQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.projectSelectObjects(type, projectQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int projectQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().projectQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="projectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int projectQuerySelectObjectsCount(ConditionQuery projectQueryCondition) throws SQLException, DbException {
	String sql = projectQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.projectQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象ProjectJoinUser到数据库中
 * <param name="projectJoinUser">需要插入的新对象</param>
 */
public void projectJoinUserInsert(ProjectJoinUser projectJoinUser) throws SQLException, DbException {
	this.getDao().projectJoinUserInsert(projectJoinUser);
	String kvalue = "";
	kvalue = (kvalue + projectJoinUser.getProjectId());
	kvalue = (kvalue + ",");
	kvalue = (kvalue + projectJoinUser.getUserId());
	this.operatesLogSimpleAdd("T_PROJECT_JOIN_USER", "插入", "PROJECT_ID,USER_ID", kvalue, projectJoinUser);
}

/**
 * 从数据库中删除一个对象ProjectJoinUser
 * <param name="AProjectId">工程代号</param>
 * <param name="AUserId">用户代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void projectJoinUserDeleteByProjectIdUserId(int AProjectId, int AUserId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().projectJoinUserDeleteByProjectIdUserId(AProjectId, AUserId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AProjectId);
	kvalue = (kvalue + ",");
	kvalue = (kvalue + AUserId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_PROJECT_JOIN_USER", "删除", "PROJECT_ID,USER_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象ProjectJoinUser
 * <param name="AProjectId">工程代号</param>
 * <param name="AUserId">用户代号</param>
 */
public void projectJoinUserDeleteByProjectIdUserId(int AProjectId, int AUserId) throws SQLException, DbException {
	this.projectJoinUserDeleteByProjectIdUserId(AProjectId, AUserId, "");
}

/**
 * 从数据库中删除一批对象ProjectJoinUser
 * <param name="AProjectId">工程代号</param>
 */
public void projectJoinUserDeleteListByProjectId(int AProjectId) throws SQLException, DbException {
	this.getDao().projectJoinUserDeleteListByProjectId(AProjectId);
	String kvalue = "";
	kvalue = (kvalue + AProjectId);
	this.operatesLogSimpleAdd("T_PROJECT_JOIN_USER", "删除", "PROJECT_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象ProjectJoinUser
 * <param name="AUserId">用户代号</param>
 */
public void projectJoinUserDeleteListByUserId(int AUserId) throws SQLException, DbException {
	this.getDao().projectJoinUserDeleteListByUserId(AUserId);
	String kvalue = "";
	kvalue = (kvalue + AUserId);
	this.operatesLogSimpleAdd("T_PROJECT_JOIN_USER", "删除", "USER_ID", kvalue, null);
}

/**
 * 更新一个对象ProjectJoinUser到数据库中
 * <param name="projectJoinUser">需要更新的ProjectJoinUser</param>
 */
public int projectJoinUserUpdate(ProjectJoinUser projectJoinUser) throws SQLException, DbException {
	return this.projectJoinUserUpdate(projectJoinUser, "");
}

/**
 * 更新一个对象ProjectJoinUser到数据库中
 * <param name="projectJoinUser">需要更新的ProjectJoinUser</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int projectJoinUserUpdate(ProjectJoinUser projectJoinUser, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().projectJoinUserUpdate(projectJoinUser, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + projectJoinUser.getProjectId());
	kvalue = (kvalue + ",");
	kvalue = (kvalue + projectJoinUser.getUserId());
	this.operatesLogSimpleAdd("T_PROJECT_JOIN_USER", "更新", "PROJECT_ID,USER_ID", kvalue, projectJoinUser);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AProjectId">工程代号</param>
 * <param name="AUserId">用户代号</param>
 */
public ProjectJoinUser projectJoinUserSelectByProjectIdUserId(int AProjectId, int AUserId) throws SQLException, DbException {
	return this.getDao().projectJoinUserSelectByProjectIdUserId(AProjectId, AUserId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AProjectId">工程代号</param>
 */
public List<ProjectJoinUser> projectJoinUserSelectObjectsByProjectId(int AProjectId) throws SQLException, DbException {
	return this.getDao().projectJoinUserSelectObjectsByProjectId(AProjectId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AUserId">用户代号</param>
 */
public List<ProjectJoinUser> projectJoinUserSelectObjectsByUserId(int AUserId) throws SQLException, DbException {
	return this.getDao().projectJoinUserSelectObjectsByUserId(AUserId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<ProjectJoinUser> projectJoinUserSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().projectJoinUserSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<ProjectJoinUser> projectJoinUserSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().projectJoinUserSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<ProjectJoinUser> projectJoinUserSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().projectJoinUserSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<ProjectJoinUser> projectJoinUserSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().projectJoinUserSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public ProjectJoinUser projectJoinUserSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<ProjectJoinUser> list = this.projectJoinUserSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(ProjectJoinUser.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<ProjectJoinUser> projectJoinUserSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.projectJoinUserSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<ProjectJoinUser> projectJoinUserSelectObjects() throws SQLException, DbException {
	return this.projectJoinUserSelectObjects("");
}

/**
 * @return 查询结果
 */
public ProjectJoinUser projectJoinUserSelectSingleObject() throws SQLException, DbException {
	return this.projectJoinUserSelectSingleObject("");
}

/**
 * <param name="projectJoinUserQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<ProjectJoinUser> projectJoinUserSelectObjects(ConditionQuery projectJoinUserQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = projectJoinUserQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.projectJoinUserSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="projectJoinUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<ProjectJoinUser> projectJoinUserSelectObjects(ConditionQuery projectJoinUserQueryCondition) throws SQLException, DbException {
	String sql = projectJoinUserQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.projectJoinUserSelectObjects(sql);
}

/**
 * <param name="projectJoinUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public ProjectJoinUser projectJoinUserSelectSingleObject(ConditionQuery projectJoinUserQueryCondition) throws SQLException, DbException {
	List<ProjectJoinUser> list = this.projectJoinUserSelectObjects(projectJoinUserQueryCondition);
	return common.util.ListUtil.getFirstItem(ProjectJoinUser.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends ProjectJoinUser> List<T> projectJoinUserSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().projectJoinUserSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends ProjectJoinUser> List<T> projectJoinUserSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().projectJoinUserSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends ProjectJoinUser> T projectJoinUserSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.projectJoinUserSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends ProjectJoinUser> List<T> projectJoinUserSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.projectJoinUserSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends ProjectJoinUser> List<T> projectJoinUserSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.projectJoinUserSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends ProjectJoinUser> T projectJoinUserSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.projectJoinUserSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="projectJoinUserQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends ProjectJoinUser> List<T> projectJoinUserSelectObjects(Class<T> type, ConditionQuery projectJoinUserQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = projectJoinUserQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.projectJoinUserSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="projectJoinUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends ProjectJoinUser> List<T> projectJoinUserSelectObjects(Class<T> type, ConditionQuery projectJoinUserQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = projectJoinUserQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.projectJoinUserSelectObjects(type, sql);
}

/**
 * <param name="projectJoinUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends ProjectJoinUser> T projectJoinUserSelectSingleObject(Class<T> type, ConditionQuery projectJoinUserQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.projectJoinUserSelectObjects(type, projectJoinUserQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int projectJoinUserQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().projectJoinUserQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="projectJoinUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int projectJoinUserQuerySelectObjectsCount(ConditionQuery projectJoinUserQueryCondition) throws SQLException, DbException {
	String sql = projectJoinUserQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.projectJoinUserQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Role到数据库中
 * <param name="role">需要插入的新对象</param>
 */
public void roleInsert(Role role) throws SQLException, DbException {
	this.getDao().roleInsert(role);
	String kvalue = "";
	kvalue = (kvalue + role.getRoleId());
	this.operatesLogSimpleAdd("T_ROLE", "插入", "ROLE_ID", kvalue, role);
}

/**
 * 从数据库中删除一个对象Role
 * <param name="ARoleId">角色代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void roleDeleteByRoleId(int ARoleId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().roleDeleteByRoleId(ARoleId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ARoleId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ROLE", "删除", "ROLE_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象Role
 * <param name="ARoleId">角色代号</param>
 */
public void roleDeleteByRoleId(int ARoleId) throws SQLException, DbException {
	this.roleDeleteByRoleId(ARoleId, "");
}

/**
 * 从数据库中删除一个对象Role
 * <param name="ARoleName">角色名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void roleDeleteByRoleName(String ARoleName, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().roleDeleteByRoleName(ARoleName, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ARoleName);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ROLE", "删除", "ROLE_NAME", kvalue, null);
}

/**
 * 从数据库中删除一个对象Role
 * <param name="ARoleName">角色名称</param>
 */
public void roleDeleteByRoleName(String ARoleName) throws SQLException, DbException {
	this.roleDeleteByRoleName(ARoleName, "");
}

/**
 * 更新一个对象Role到数据库中
 * <param name="role">需要更新的Role</param>
 */
public int roleUpdate(Role role) throws SQLException, DbException {
	return this.roleUpdate(role, "");
}

/**
 * 更新一个对象Role到数据库中
 * <param name="role">需要更新的Role</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int roleUpdate(Role role, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().roleUpdate(role, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + role.getRoleId());
	this.operatesLogSimpleAdd("T_ROLE", "更新", "ROLE_ID", kvalue, role);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ARoleId">角色代号</param>
 */
public Role roleSelectByRoleId(int ARoleId) throws SQLException, DbException {
	return this.getDao().roleSelectByRoleId(ARoleId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ARoleName">角色名称</param>
 */
public Role roleSelectByRoleName(String ARoleName) throws SQLException, DbException {
	return this.getDao().roleSelectByRoleName(ARoleName);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Role> roleSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().roleSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Role> roleSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().roleSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Role> roleSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().roleSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Role> roleSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().roleSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Role roleSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Role> list = this.roleSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Role.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Role> roleSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.roleSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Role> roleSelectObjects() throws SQLException, DbException {
	return this.roleSelectObjects("");
}

/**
 * @return 查询结果
 */
public Role roleSelectSingleObject() throws SQLException, DbException {
	return this.roleSelectSingleObject("");
}

/**
 * <param name="roleQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Role> roleSelectObjects(ConditionQuery roleQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = roleQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.roleSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="roleQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Role> roleSelectObjects(ConditionQuery roleQueryCondition) throws SQLException, DbException {
	String sql = roleQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.roleSelectObjects(sql);
}

/**
 * <param name="roleQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Role roleSelectSingleObject(ConditionQuery roleQueryCondition) throws SQLException, DbException {
	List<Role> list = this.roleSelectObjects(roleQueryCondition);
	return common.util.ListUtil.getFirstItem(Role.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Role> List<T> roleSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().roleSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Role> List<T> roleSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().roleSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Role> T roleSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.roleSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Role> List<T> roleSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.roleSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Role> List<T> roleSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.roleSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Role> T roleSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.roleSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="roleQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Role> List<T> roleSelectObjects(Class<T> type, ConditionQuery roleQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = roleQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.roleSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="roleQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Role> List<T> roleSelectObjects(Class<T> type, ConditionQuery roleQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = roleQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.roleSelectObjects(type, sql);
}

/**
 * <param name="roleQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Role> T roleSelectSingleObject(Class<T> type, ConditionQuery roleQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.roleSelectObjects(type, roleQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int roleQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().roleQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="roleQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int roleQuerySelectObjectsCount(ConditionQuery roleQueryCondition) throws SQLException, DbException {
	String sql = roleQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.roleQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象TaskPreviousTask到数据库中
 * <param name="taskPreviousTask">需要插入的新对象</param>
 */
public void taskPreviousTaskInsert(TaskPreviousTask taskPreviousTask) throws SQLException, DbException {
	this.getDao().taskPreviousTaskInsert(taskPreviousTask);
	String kvalue = "";
	kvalue = (kvalue + taskPreviousTask.getTaskId());
	this.operatesLogSimpleAdd("T_TASK_PREVIOUS_TASK", "插入", "TASK_ID", kvalue, taskPreviousTask);
}

/**
 * 从数据库中删除一个对象TaskPreviousTask
 * <param name="ATaskId">任务代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void taskPreviousTaskDeleteByTaskId(int ATaskId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().taskPreviousTaskDeleteByTaskId(ATaskId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ATaskId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_TASK_PREVIOUS_TASK", "删除", "TASK_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象TaskPreviousTask
 * <param name="ATaskId">任务代号</param>
 */
public void taskPreviousTaskDeleteByTaskId(int ATaskId) throws SQLException, DbException {
	this.taskPreviousTaskDeleteByTaskId(ATaskId, "");
}

/**
 * 从数据库中删除一批对象TaskPreviousTask
 * <param name="APreviousTaskId">前驱任务代号</param>
 */
public void taskPreviousTaskDeleteListByPreviousTaskId(int APreviousTaskId) throws SQLException, DbException {
	this.getDao().taskPreviousTaskDeleteListByPreviousTaskId(APreviousTaskId);
	String kvalue = "";
	kvalue = (kvalue + APreviousTaskId);
	this.operatesLogSimpleAdd("T_TASK_PREVIOUS_TASK", "删除", "PREVIOUS_TASK_ID", kvalue, null);
}

/**
 * 更新一个对象TaskPreviousTask到数据库中
 * <param name="taskPreviousTask">需要更新的TaskPreviousTask</param>
 */
public int taskPreviousTaskUpdate(TaskPreviousTask taskPreviousTask) throws SQLException, DbException {
	return this.taskPreviousTaskUpdate(taskPreviousTask, "");
}

/**
 * 更新一个对象TaskPreviousTask到数据库中
 * <param name="taskPreviousTask">需要更新的TaskPreviousTask</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int taskPreviousTaskUpdate(TaskPreviousTask taskPreviousTask, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().taskPreviousTaskUpdate(taskPreviousTask, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + taskPreviousTask.getTaskId());
	this.operatesLogSimpleAdd("T_TASK_PREVIOUS_TASK", "更新", "TASK_ID", kvalue, taskPreviousTask);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATaskId">任务代号</param>
 */
public TaskPreviousTask taskPreviousTaskSelectByTaskId(int ATaskId) throws SQLException, DbException {
	return this.getDao().taskPreviousTaskSelectByTaskId(ATaskId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskId">任务代号</param>
 */
public List<TaskPreviousTask> taskPreviousTaskSelectObjectsByTaskId(int ATaskId) throws SQLException, DbException {
	return this.getDao().taskPreviousTaskSelectObjectsByTaskId(ATaskId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="APreviousTaskId">前驱任务代号</param>
 */
public List<TaskPreviousTask> taskPreviousTaskSelectObjectsByPreviousTaskId(int APreviousTaskId) throws SQLException, DbException {
	return this.getDao().taskPreviousTaskSelectObjectsByPreviousTaskId(APreviousTaskId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TaskPreviousTask> taskPreviousTaskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().taskPreviousTaskSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<TaskPreviousTask> taskPreviousTaskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().taskPreviousTaskSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TaskPreviousTask> taskPreviousTaskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().taskPreviousTaskSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<TaskPreviousTask> taskPreviousTaskSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().taskPreviousTaskSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public TaskPreviousTask taskPreviousTaskSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<TaskPreviousTask> list = this.taskPreviousTaskSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(TaskPreviousTask.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TaskPreviousTask> taskPreviousTaskSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.taskPreviousTaskSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<TaskPreviousTask> taskPreviousTaskSelectObjects() throws SQLException, DbException {
	return this.taskPreviousTaskSelectObjects("");
}

/**
 * @return 查询结果
 */
public TaskPreviousTask taskPreviousTaskSelectSingleObject() throws SQLException, DbException {
	return this.taskPreviousTaskSelectSingleObject("");
}

/**
 * <param name="taskPreviousTaskQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TaskPreviousTask> taskPreviousTaskSelectObjects(ConditionQuery taskPreviousTaskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = taskPreviousTaskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.taskPreviousTaskSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="taskPreviousTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<TaskPreviousTask> taskPreviousTaskSelectObjects(ConditionQuery taskPreviousTaskQueryCondition) throws SQLException, DbException {
	String sql = taskPreviousTaskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.taskPreviousTaskSelectObjects(sql);
}

/**
 * <param name="taskPreviousTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public TaskPreviousTask taskPreviousTaskSelectSingleObject(ConditionQuery taskPreviousTaskQueryCondition) throws SQLException, DbException {
	List<TaskPreviousTask> list = this.taskPreviousTaskSelectObjects(taskPreviousTaskQueryCondition);
	return common.util.ListUtil.getFirstItem(TaskPreviousTask.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TaskPreviousTask> List<T> taskPreviousTaskSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().taskPreviousTaskSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends TaskPreviousTask> List<T> taskPreviousTaskSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().taskPreviousTaskSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends TaskPreviousTask> T taskPreviousTaskSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.taskPreviousTaskSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TaskPreviousTask> List<T> taskPreviousTaskSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.taskPreviousTaskSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends TaskPreviousTask> List<T> taskPreviousTaskSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.taskPreviousTaskSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends TaskPreviousTask> T taskPreviousTaskSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.taskPreviousTaskSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="taskPreviousTaskQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TaskPreviousTask> List<T> taskPreviousTaskSelectObjects(Class<T> type, ConditionQuery taskPreviousTaskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = taskPreviousTaskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.taskPreviousTaskSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="taskPreviousTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends TaskPreviousTask> List<T> taskPreviousTaskSelectObjects(Class<T> type, ConditionQuery taskPreviousTaskQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = taskPreviousTaskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.taskPreviousTaskSelectObjects(type, sql);
}

/**
 * <param name="taskPreviousTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends TaskPreviousTask> T taskPreviousTaskSelectSingleObject(Class<T> type, ConditionQuery taskPreviousTaskQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.taskPreviousTaskSelectObjects(type, taskPreviousTaskQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int taskPreviousTaskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().taskPreviousTaskQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="taskPreviousTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int taskPreviousTaskQuerySelectObjectsCount(ConditionQuery taskPreviousTaskQueryCondition) throws SQLException, DbException {
	String sql = taskPreviousTaskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.taskPreviousTaskQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象User到数据库中
 * <param name="user">需要插入的新对象</param>
 */
public void userInsert(User user) throws SQLException, DbException {
	this.getDao().userInsert(user);
	String kvalue = "";
	kvalue = (kvalue + user.getUserId());
	this.operatesLogSimpleAdd("T_USER", "插入", "USER_ID", kvalue, user);
}

/**
 * 从数据库中删除一个对象User
 * <param name="AUserId">用户代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void userDeleteByUserId(int AUserId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_USER].[USER_ID] = ");
	sql = (sql + AUserId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().projectSelectObjects((" inner join T_USER on [T_USER].[USER_ID] = [T_PROJECT].[PROJECT_MANAGER_ID] where" +
" " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_USER", "T_PROJECT"));
	}
	sql = "";
	sql = (sql + "[T_USER].[USER_ID] = ");
	sql = (sql + AUserId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().projectJoinUserSelectObjects((" inner join T_USER on [T_USER].[USER_ID] = [T_PROJECT_JOIN_USER].[USER_ID] where " +
"" + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_USER", "T_PROJECT_JOIN_USER"));
	}
	sql = "";
	sql = (sql + "[T_USER].[USER_ID] = ");
	sql = (sql + AUserId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().workLogSelectObjects((" inner join T_USER on [T_USER].[USER_ID] = [T_WORK_LOG].[WORK_USER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_USER", "T_WORK_LOG"));
	}
	sql = "";
	sql = (sql + "[T_USER].[USER_ID] = ");
	sql = (sql + AUserId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().workFlowSelectObjects((" inner join T_USER on [T_USER].[USER_ID] = [T_WORK_FLOW].[CREATOR] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_USER", "T_WORK_FLOW"));
	}
	sql = "";
	sql = (sql + "[T_USER].[USER_ID] = ");
	sql = (sql + AUserId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().workFlowMemoSelectObjects((" inner join T_USER on [T_USER].[USER_ID] = [WORK_FLOW_MEMO].[MEMO_USER_ID] where " +
"" + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_USER", "WORK_FLOW_MEMO"));
	}
	sql = "";
	sql = (sql + "[T_USER].[USER_ID] = ");
	sql = (sql + AUserId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueUsersSelectObjects((" inner join T_USER on [T_USER].[USER_ID] = [T_ISSUE_USERS].[INNER_USER_ID] where " +
"" + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_USER", "T_ISSUE_USERS"));
	}
	sql = "";
	sql = (sql + "[T_USER].[USER_ID] = ");
	sql = (sql + AUserId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().departMentUserSelectObjects((" inner join T_USER on [T_USER].[USER_ID] = [T_DEPART_MENT_USER].[USER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_USER", "T_DEPART_MENT_USER"));
	}
	sql = "";
	sql = (sql + "[T_USER].[USER_ID] = ");
	sql = (sql + AUserId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().leaveSelectObjects((" inner join T_USER on [T_USER].[USER_ID] = [T_LEAVE].[REQUEST_USER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_USER", "T_LEAVE"));
	}
	sql = "";
	sql = (sql + "[T_USER].[USER_ID] = ");
	sql = (sql + AUserId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().taskUserSelectObjects((" inner join T_USER on [T_USER].[USER_ID] = [T_TASK_USER].[USER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_USER", "T_TASK_USER"));
	}
	sql = "";
	sql = (sql + "[T_USER].[USER_ID] = ");
	sql = (sql + AUserId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().taskSelectObjects((" inner join T_USER on [T_USER].[USER_ID] = [T_TASK].[TASK_MODIFIER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_USER", "T_TASK"));
	}
	this.getDao().userDeleteByUserId(AUserId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AUserId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_USER", "删除", "USER_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象User
 * <param name="AUserId">用户代号</param>
 */
public void userDeleteByUserId(int AUserId) throws SQLException, DbException {
	this.userDeleteByUserId(AUserId, "");
}

/**
 * 从数据库中删除一个对象User
 * <param name="ALoginName">登陆名</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void userDeleteByLoginName(String ALoginName, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_USER].[LOGIN_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(ALoginName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().projectSelectObjects((" inner join T_USER on [T_USER].[USER_ID] = [T_PROJECT].[PROJECT_MANAGER_ID] where" +
" " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_USER", "T_PROJECT"));
	}
	sql = "";
	sql = (sql + "[T_USER].[LOGIN_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(ALoginName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().projectJoinUserSelectObjects((" inner join T_USER on [T_USER].[USER_ID] = [T_PROJECT_JOIN_USER].[USER_ID] where " +
"" + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_USER", "T_PROJECT_JOIN_USER"));
	}
	sql = "";
	sql = (sql + "[T_USER].[LOGIN_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(ALoginName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().workLogSelectObjects((" inner join T_USER on [T_USER].[USER_ID] = [T_WORK_LOG].[WORK_USER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_USER", "T_WORK_LOG"));
	}
	sql = "";
	sql = (sql + "[T_USER].[LOGIN_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(ALoginName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().workFlowSelectObjects((" inner join T_USER on [T_USER].[USER_ID] = [T_WORK_FLOW].[CREATOR] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_USER", "T_WORK_FLOW"));
	}
	sql = "";
	sql = (sql + "[T_USER].[LOGIN_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(ALoginName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().workFlowMemoSelectObjects((" inner join T_USER on [T_USER].[USER_ID] = [WORK_FLOW_MEMO].[MEMO_USER_ID] where " +
"" + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_USER", "WORK_FLOW_MEMO"));
	}
	sql = "";
	sql = (sql + "[T_USER].[LOGIN_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(ALoginName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueUsersSelectObjects((" inner join T_USER on [T_USER].[USER_ID] = [T_ISSUE_USERS].[INNER_USER_ID] where " +
"" + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_USER", "T_ISSUE_USERS"));
	}
	sql = "";
	sql = (sql + "[T_USER].[LOGIN_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(ALoginName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().departMentUserSelectObjects((" inner join T_USER on [T_USER].[USER_ID] = [T_DEPART_MENT_USER].[USER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_USER", "T_DEPART_MENT_USER"));
	}
	sql = "";
	sql = (sql + "[T_USER].[LOGIN_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(ALoginName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().leaveSelectObjects((" inner join T_USER on [T_USER].[USER_ID] = [T_LEAVE].[REQUEST_USER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_USER", "T_LEAVE"));
	}
	sql = "";
	sql = (sql + "[T_USER].[LOGIN_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(ALoginName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().taskUserSelectObjects((" inner join T_USER on [T_USER].[USER_ID] = [T_TASK_USER].[USER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_USER", "T_TASK_USER"));
	}
	sql = "";
	sql = (sql + "[T_USER].[LOGIN_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(ALoginName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().taskSelectObjects((" inner join T_USER on [T_USER].[USER_ID] = [T_TASK].[TASK_MODIFIER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_USER", "T_TASK"));
	}
	this.getDao().userDeleteByLoginName(ALoginName, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ALoginName);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_USER", "删除", "LOGIN_NAME", kvalue, null);
}

/**
 * 从数据库中删除一个对象User
 * <param name="ALoginName">登陆名</param>
 */
public void userDeleteByLoginName(String ALoginName) throws SQLException, DbException {
	this.userDeleteByLoginName(ALoginName, "");
}

/**
 * 更新一个对象User到数据库中
 * <param name="user">需要更新的User</param>
 */
public int userUpdate(User user) throws SQLException, DbException {
	return this.userUpdate(user, "");
}

/**
 * 更新一个对象User到数据库中
 * <param name="user">需要更新的User</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int userUpdate(User user, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().userUpdate(user, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + user.getUserId());
	this.operatesLogSimpleAdd("T_USER", "更新", "USER_ID", kvalue, user);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AUserId">用户代号</param>
 */
public User userSelectByUserId(int AUserId) throws SQLException, DbException {
	return this.getDao().userSelectByUserId(AUserId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ALoginName">登陆名</param>
 */
public User userSelectByLoginName(String ALoginName) throws SQLException, DbException {
	return this.getDao().userSelectByLoginName(ALoginName);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<User> userSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().userSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<User> userSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().userSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<User> userSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().userSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<User> userSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().userSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public User userSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<User> list = this.userSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(User.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<User> userSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.userSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<User> userSelectObjects() throws SQLException, DbException {
	return this.userSelectObjects("");
}

/**
 * @return 查询结果
 */
public User userSelectSingleObject() throws SQLException, DbException {
	return this.userSelectSingleObject("");
}

/**
 * <param name="userQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<User> userSelectObjects(ConditionQuery userQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = userQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.userSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="userQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<User> userSelectObjects(ConditionQuery userQueryCondition) throws SQLException, DbException {
	String sql = userQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.userSelectObjects(sql);
}

/**
 * <param name="userQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public User userSelectSingleObject(ConditionQuery userQueryCondition) throws SQLException, DbException {
	List<User> list = this.userSelectObjects(userQueryCondition);
	return common.util.ListUtil.getFirstItem(User.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends User> List<T> userSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().userSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends User> List<T> userSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().userSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends User> T userSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.userSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends User> List<T> userSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.userSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends User> List<T> userSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.userSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends User> T userSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.userSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="userQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends User> List<T> userSelectObjects(Class<T> type, ConditionQuery userQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = userQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.userSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="userQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends User> List<T> userSelectObjects(Class<T> type, ConditionQuery userQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = userQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.userSelectObjects(type, sql);
}

/**
 * <param name="userQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends User> T userSelectSingleObject(Class<T> type, ConditionQuery userQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.userSelectObjects(type, userQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int userQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().userQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="userQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int userQuerySelectObjectsCount(ConditionQuery userQueryCondition) throws SQLException, DbException {
	String sql = userQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.userQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Identity到数据库中
 * <param name="identity">需要插入的新对象</param>
 */
public void identityInsert(Identity identity) throws SQLException, DbException {
	this.getDao().identityInsert(identity);
	String kvalue = "";
	kvalue = (kvalue + identity.getTabName());
	this.operatesLogSimpleAdd("T_IDENTITY", "插入", "TAB_NAME", kvalue, identity);
}

/**
 * 从数据库中删除一个对象Identity
 * <param name="ATabName"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void identityDeleteByTabName(String ATabName, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().identityDeleteByTabName(ATabName, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ATabName);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_IDENTITY", "删除", "TAB_NAME", kvalue, null);
}

/**
 * 从数据库中删除一个对象Identity
 * <param name="ATabName"></param>
 */
public void identityDeleteByTabName(String ATabName) throws SQLException, DbException {
	this.identityDeleteByTabName(ATabName, "");
}

/**
 * 更新一个对象Identity到数据库中
 * <param name="identity">需要更新的Identity</param>
 */
public int identityUpdate(Identity identity) throws SQLException, DbException {
	return this.identityUpdate(identity, "");
}

/**
 * 更新一个对象Identity到数据库中
 * <param name="identity">需要更新的Identity</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int identityUpdate(Identity identity, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().identityUpdate(identity, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + identity.getTabName());
	this.operatesLogSimpleAdd("T_IDENTITY", "更新", "TAB_NAME", kvalue, identity);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATabName"></param>
 */
public Identity identitySelectByTabName(String ATabName) throws SQLException, DbException {
	return this.getDao().identitySelectByTabName(ATabName);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Identity> identitySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().identitySelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Identity> identitySelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().identitySelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Identity> identitySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().identitySelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Identity> identitySelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().identitySelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Identity identitySelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Identity> list = this.identitySelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Identity.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Identity> identitySelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.identitySelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Identity> identitySelectObjects() throws SQLException, DbException {
	return this.identitySelectObjects("");
}

/**
 * @return 查询结果
 */
public Identity identitySelectSingleObject() throws SQLException, DbException {
	return this.identitySelectSingleObject("");
}

/**
 * <param name="identityQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Identity> identitySelectObjects(ConditionQuery identityQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = identityQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.identitySelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="identityQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Identity> identitySelectObjects(ConditionQuery identityQueryCondition) throws SQLException, DbException {
	String sql = identityQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.identitySelectObjects(sql);
}

/**
 * <param name="identityQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Identity identitySelectSingleObject(ConditionQuery identityQueryCondition) throws SQLException, DbException {
	List<Identity> list = this.identitySelectObjects(identityQueryCondition);
	return common.util.ListUtil.getFirstItem(Identity.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Identity> List<T> identitySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().identitySelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Identity> List<T> identitySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().identitySelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Identity> T identitySelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.identitySelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Identity> List<T> identitySelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.identitySelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Identity> List<T> identitySelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.identitySelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Identity> T identitySelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.identitySelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="identityQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Identity> List<T> identitySelectObjects(Class<T> type, ConditionQuery identityQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = identityQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.identitySelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="identityQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Identity> List<T> identitySelectObjects(Class<T> type, ConditionQuery identityQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = identityQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.identitySelectObjects(type, sql);
}

/**
 * <param name="identityQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Identity> T identitySelectSingleObject(Class<T> type, ConditionQuery identityQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.identitySelectObjects(type, identityQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int identityQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().identityQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="identityQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int identityQuerySelectObjectsCount(ConditionQuery identityQueryCondition) throws SQLException, DbException {
	String sql = identityQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.identityQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象WorkLog到数据库中
 * <param name="workLog">需要插入的新对象</param>
 */
public void workLogInsert(WorkLog workLog) throws SQLException, DbException {
	this.getDao().workLogInsert(workLog);
	String kvalue = "";
	kvalue = (kvalue + workLog.getWorkLogId());
	this.operatesLogSimpleAdd("T_WORK_LOG", "插入", "WORK_LOG_ID", kvalue, workLog);
}

/**
 * 从数据库中删除一个对象WorkLog
 * <param name="AWorkLogId">工作日志代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void workLogDeleteByWorkLogId(int AWorkLogId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_WORK_LOG].[WORK_LOG_ID] = ");
	sql = (sql + AWorkLogId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().workLogRelationshipTaskSelectObjects((" inner join T_WORK_LOG on [T_WORK_LOG].[WORK_LOG_ID] = [T_WORK_LOG_RELATIONSHIP_T" +
"ASK].[WORK_LOG_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_WORK_LOG", "T_WORK_LOG_RELATIONSHIP_TASK"));
	}
	this.getDao().workLogDeleteByWorkLogId(AWorkLogId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AWorkLogId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_WORK_LOG", "删除", "WORK_LOG_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象WorkLog
 * <param name="AWorkLogId">工作日志代号</param>
 */
public void workLogDeleteByWorkLogId(int AWorkLogId) throws SQLException, DbException {
	this.workLogDeleteByWorkLogId(AWorkLogId, "");
}

/**
 * 从数据库中删除一批对象WorkLog
 * <param name="AWorkUserId">职工号</param>
 */
public void workLogDeleteListByWorkUserId(int AWorkUserId) throws SQLException, DbException {
	if ((this.getDao().workLogRelationshipTaskSelectObjects((" inner join T_WORK_LOG on [T_WORK_LOG].[WORK_LOG_ID] = [T_WORK_LOG_RELATIONSHIP_T" +
"ASK].[WORK_LOG_ID] where [T_WORK_LOG].[WORK_USER_ID] = " + AWorkUserId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_WORK_LOG", "T_WORK_LOG_RELATIONSHIP_TASK"));
	}
	this.getDao().workLogDeleteListByWorkUserId(AWorkUserId);
	String kvalue = "";
	kvalue = (kvalue + AWorkUserId);
	this.operatesLogSimpleAdd("T_WORK_LOG", "删除", "WORK_USER_ID", kvalue, null);
}

/**
 * 更新一个对象WorkLog到数据库中
 * <param name="workLog">需要更新的WorkLog</param>
 */
public int workLogUpdate(WorkLog workLog) throws SQLException, DbException {
	return this.workLogUpdate(workLog, "");
}

/**
 * 更新一个对象WorkLog到数据库中
 * <param name="workLog">需要更新的WorkLog</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int workLogUpdate(WorkLog workLog, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().workLogUpdate(workLog, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + workLog.getWorkLogId());
	this.operatesLogSimpleAdd("T_WORK_LOG", "更新", "WORK_LOG_ID", kvalue, workLog);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AWorkLogId">工作日志代号</param>
 */
public WorkLog workLogSelectByWorkLogId(int AWorkLogId) throws SQLException, DbException {
	return this.getDao().workLogSelectByWorkLogId(AWorkLogId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AWorkUserId">职工号</param>
 */
public List<WorkLog> workLogSelectObjectsByWorkUserId(int AWorkUserId) throws SQLException, DbException {
	return this.getDao().workLogSelectObjectsByWorkUserId(AWorkUserId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<WorkLog> workLogSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().workLogSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<WorkLog> workLogSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().workLogSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<WorkLog> workLogSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().workLogSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<WorkLog> workLogSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().workLogSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public WorkLog workLogSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<WorkLog> list = this.workLogSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(WorkLog.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<WorkLog> workLogSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.workLogSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<WorkLog> workLogSelectObjects() throws SQLException, DbException {
	return this.workLogSelectObjects("");
}

/**
 * @return 查询结果
 */
public WorkLog workLogSelectSingleObject() throws SQLException, DbException {
	return this.workLogSelectSingleObject("");
}

/**
 * <param name="workLogQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<WorkLog> workLogSelectObjects(ConditionQuery workLogQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = workLogQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.workLogSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="workLogQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<WorkLog> workLogSelectObjects(ConditionQuery workLogQueryCondition) throws SQLException, DbException {
	String sql = workLogQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.workLogSelectObjects(sql);
}

/**
 * <param name="workLogQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public WorkLog workLogSelectSingleObject(ConditionQuery workLogQueryCondition) throws SQLException, DbException {
	List<WorkLog> list = this.workLogSelectObjects(workLogQueryCondition);
	return common.util.ListUtil.getFirstItem(WorkLog.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends WorkLog> List<T> workLogSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().workLogSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends WorkLog> List<T> workLogSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().workLogSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends WorkLog> T workLogSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.workLogSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends WorkLog> List<T> workLogSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.workLogSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends WorkLog> List<T> workLogSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.workLogSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends WorkLog> T workLogSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.workLogSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="workLogQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends WorkLog> List<T> workLogSelectObjects(Class<T> type, ConditionQuery workLogQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = workLogQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.workLogSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="workLogQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends WorkLog> List<T> workLogSelectObjects(Class<T> type, ConditionQuery workLogQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = workLogQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.workLogSelectObjects(type, sql);
}

/**
 * <param name="workLogQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends WorkLog> T workLogSelectSingleObject(Class<T> type, ConditionQuery workLogQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.workLogSelectObjects(type, workLogQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int workLogQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().workLogQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="workLogQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int workLogQuerySelectObjectsCount(ConditionQuery workLogQueryCondition) throws SQLException, DbException {
	String sql = workLogQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.workLogQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象WorkLogRelationshipTask到数据库中
 * <param name="workLogRelationshipTask">需要插入的新对象</param>
 */
public void workLogRelationshipTaskInsert(WorkLogRelationshipTask workLogRelationshipTask) throws SQLException, DbException {
	this.getDao().workLogRelationshipTaskInsert(workLogRelationshipTask);
	String kvalue = "";
	kvalue = (kvalue + workLogRelationshipTask.getWorkLogId());
	kvalue = (kvalue + ",");
	kvalue = (kvalue + workLogRelationshipTask.getTaskId());
	this.operatesLogSimpleAdd("T_WORK_LOG_RELATIONSHIP_TASK", "插入", "WORK_LOG_ID,TASK_ID", kvalue, workLogRelationshipTask);
}

/**
 * 从数据库中删除一个对象WorkLogRelationshipTask
 * <param name="AWorkLogId">工作日志代号</param>
 * <param name="ATaskId">任务代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void workLogRelationshipTaskDeleteByWorkLogIdTaskId(int AWorkLogId, int ATaskId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().workLogRelationshipTaskDeleteByWorkLogIdTaskId(AWorkLogId, ATaskId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AWorkLogId);
	kvalue = (kvalue + ",");
	kvalue = (kvalue + ATaskId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_WORK_LOG_RELATIONSHIP_TASK", "删除", "WORK_LOG_ID,TASK_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象WorkLogRelationshipTask
 * <param name="AWorkLogId">工作日志代号</param>
 * <param name="ATaskId">任务代号</param>
 */
public void workLogRelationshipTaskDeleteByWorkLogIdTaskId(int AWorkLogId, int ATaskId) throws SQLException, DbException {
	this.workLogRelationshipTaskDeleteByWorkLogIdTaskId(AWorkLogId, ATaskId, "");
}

/**
 * 从数据库中删除一批对象WorkLogRelationshipTask
 * <param name="ATaskId">任务代号</param>
 */
public void workLogRelationshipTaskDeleteListByTaskId(int ATaskId) throws SQLException, DbException {
	this.getDao().workLogRelationshipTaskDeleteListByTaskId(ATaskId);
	String kvalue = "";
	kvalue = (kvalue + ATaskId);
	this.operatesLogSimpleAdd("T_WORK_LOG_RELATIONSHIP_TASK", "删除", "TASK_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象WorkLogRelationshipTask
 * <param name="AWorkLogId">工作日志代号</param>
 */
public void workLogRelationshipTaskDeleteListByWorkLogId(int AWorkLogId) throws SQLException, DbException {
	this.getDao().workLogRelationshipTaskDeleteListByWorkLogId(AWorkLogId);
	String kvalue = "";
	kvalue = (kvalue + AWorkLogId);
	this.operatesLogSimpleAdd("T_WORK_LOG_RELATIONSHIP_TASK", "删除", "WORK_LOG_ID", kvalue, null);
}

/**
 * 更新一个对象WorkLogRelationshipTask到数据库中
 * <param name="workLogRelationshipTask">需要更新的WorkLogRelationshipTask</param>
 */
public int workLogRelationshipTaskUpdate(WorkLogRelationshipTask workLogRelationshipTask) throws SQLException, DbException {
	return this.workLogRelationshipTaskUpdate(workLogRelationshipTask, "");
}

/**
 * 更新一个对象WorkLogRelationshipTask到数据库中
 * <param name="workLogRelationshipTask">需要更新的WorkLogRelationshipTask</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int workLogRelationshipTaskUpdate(WorkLogRelationshipTask workLogRelationshipTask, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().workLogRelationshipTaskUpdate(workLogRelationshipTask, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + workLogRelationshipTask.getWorkLogId());
	kvalue = (kvalue + ",");
	kvalue = (kvalue + workLogRelationshipTask.getTaskId());
	this.operatesLogSimpleAdd("T_WORK_LOG_RELATIONSHIP_TASK", "更新", "WORK_LOG_ID,TASK_ID", kvalue, workLogRelationshipTask);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AWorkLogId">工作日志代号</param>
 * <param name="ATaskId">任务代号</param>
 */
public WorkLogRelationshipTask workLogRelationshipTaskSelectByWorkLogIdTaskId(int AWorkLogId, int ATaskId) throws SQLException, DbException {
	return this.getDao().workLogRelationshipTaskSelectByWorkLogIdTaskId(AWorkLogId, ATaskId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskId">任务代号</param>
 */
public List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjectsByTaskId(int ATaskId) throws SQLException, DbException {
	return this.getDao().workLogRelationshipTaskSelectObjectsByTaskId(ATaskId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AWorkLogId">工作日志代号</param>
 */
public List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjectsByWorkLogId(int AWorkLogId) throws SQLException, DbException {
	return this.getDao().workLogRelationshipTaskSelectObjectsByWorkLogId(AWorkLogId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().workLogRelationshipTaskSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().workLogRelationshipTaskSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().workLogRelationshipTaskSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().workLogRelationshipTaskSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public WorkLogRelationshipTask workLogRelationshipTaskSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<WorkLogRelationshipTask> list = this.workLogRelationshipTaskSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(WorkLogRelationshipTask.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.workLogRelationshipTaskSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjects() throws SQLException, DbException {
	return this.workLogRelationshipTaskSelectObjects("");
}

/**
 * @return 查询结果
 */
public WorkLogRelationshipTask workLogRelationshipTaskSelectSingleObject() throws SQLException, DbException {
	return this.workLogRelationshipTaskSelectSingleObject("");
}

/**
 * <param name="workLogRelationshipTaskQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjects(ConditionQuery workLogRelationshipTaskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = workLogRelationshipTaskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.workLogRelationshipTaskSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="workLogRelationshipTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjects(ConditionQuery workLogRelationshipTaskQueryCondition) throws SQLException, DbException {
	String sql = workLogRelationshipTaskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.workLogRelationshipTaskSelectObjects(sql);
}

/**
 * <param name="workLogRelationshipTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public WorkLogRelationshipTask workLogRelationshipTaskSelectSingleObject(ConditionQuery workLogRelationshipTaskQueryCondition) throws SQLException, DbException {
	List<WorkLogRelationshipTask> list = this.workLogRelationshipTaskSelectObjects(workLogRelationshipTaskQueryCondition);
	return common.util.ListUtil.getFirstItem(WorkLogRelationshipTask.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends WorkLogRelationshipTask> List<T> workLogRelationshipTaskSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().workLogRelationshipTaskSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends WorkLogRelationshipTask> List<T> workLogRelationshipTaskSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().workLogRelationshipTaskSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends WorkLogRelationshipTask> T workLogRelationshipTaskSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.workLogRelationshipTaskSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends WorkLogRelationshipTask> List<T> workLogRelationshipTaskSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.workLogRelationshipTaskSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends WorkLogRelationshipTask> List<T> workLogRelationshipTaskSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.workLogRelationshipTaskSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends WorkLogRelationshipTask> T workLogRelationshipTaskSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.workLogRelationshipTaskSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="workLogRelationshipTaskQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends WorkLogRelationshipTask> List<T> workLogRelationshipTaskSelectObjects(Class<T> type, ConditionQuery workLogRelationshipTaskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = workLogRelationshipTaskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.workLogRelationshipTaskSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="workLogRelationshipTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends WorkLogRelationshipTask> List<T> workLogRelationshipTaskSelectObjects(Class<T> type, ConditionQuery workLogRelationshipTaskQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = workLogRelationshipTaskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.workLogRelationshipTaskSelectObjects(type, sql);
}

/**
 * <param name="workLogRelationshipTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends WorkLogRelationshipTask> T workLogRelationshipTaskSelectSingleObject(Class<T> type, ConditionQuery workLogRelationshipTaskQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.workLogRelationshipTaskSelectObjects(type, workLogRelationshipTaskQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int workLogRelationshipTaskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().workLogRelationshipTaskQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="workLogRelationshipTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int workLogRelationshipTaskQuerySelectObjectsCount(ConditionQuery workLogRelationshipTaskQueryCondition) throws SQLException, DbException {
	String sql = workLogRelationshipTaskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.workLogRelationshipTaskQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象WorkFlow到数据库中
 * <param name="workFlow">需要插入的新对象</param>
 */
public void workFlowInsert(WorkFlow workFlow) throws SQLException, DbException {
	this.getDao().workFlowInsert(workFlow);
	String kvalue = "";
	kvalue = (kvalue + workFlow.getWorkFlowId());
	this.operatesLogSimpleAdd("T_WORK_FLOW", "插入", "WORK_FLOW_ID", kvalue, workFlow);
}

/**
 * 从数据库中删除一个对象WorkFlow
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void workFlowDeleteByWorkFlowId(String AWorkFlowId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_WORK_FLOW].[WORK_FLOW_ID] = ");
	sql = (sql + SqlServerUtils.safeSql(AWorkFlowId.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().workFlowMemoSelectObjects((" inner join T_WORK_FLOW on [T_WORK_FLOW].[WORK_FLOW_ID] = [WORK_FLOW_MEMO].[WORK_" +
"FLOW_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_WORK_FLOW", "WORK_FLOW_MEMO"));
	}
	sql = "";
	sql = (sql + "[T_WORK_FLOW].[WORK_FLOW_ID] = ");
	sql = (sql + SqlServerUtils.safeSql(AWorkFlowId.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().leaveSelectObjects((" inner join T_WORK_FLOW on [T_WORK_FLOW].[WORK_FLOW_ID] = [T_LEAVE].[WORK_FLOW_ID" +
"] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_WORK_FLOW", "T_LEAVE"));
	}
	this.getDao().workFlowDeleteByWorkFlowId(AWorkFlowId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AWorkFlowId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_WORK_FLOW", "删除", "WORK_FLOW_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象WorkFlow
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
public void workFlowDeleteByWorkFlowId(String AWorkFlowId) throws SQLException, DbException {
	this.workFlowDeleteByWorkFlowId(AWorkFlowId, "");
}

/**
 * 从数据库中删除一批对象WorkFlow
 * <param name="ACreator">创建人</param>
 */
public void workFlowDeleteListByCreator(int ACreator) throws SQLException, DbException {
	if ((this.getDao().workFlowMemoSelectObjects((" inner join T_WORK_FLOW on [T_WORK_FLOW].[WORK_FLOW_ID] = [WORK_FLOW_MEMO].[WORK_" +
"FLOW_ID] where [T_WORK_FLOW].[CREATOR] = " + ACreator)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_WORK_FLOW", "WORK_FLOW_MEMO"));
	}
	if ((this.getDao().leaveSelectObjects((" inner join T_WORK_FLOW on [T_WORK_FLOW].[WORK_FLOW_ID] = [T_LEAVE].[WORK_FLOW_ID" +
"] where [T_WORK_FLOW].[CREATOR] = " + ACreator)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_WORK_FLOW", "T_LEAVE"));
	}
	this.getDao().workFlowDeleteListByCreator(ACreator);
	String kvalue = "";
	kvalue = (kvalue + ACreator);
	this.operatesLogSimpleAdd("T_WORK_FLOW", "删除", "CREATOR", kvalue, null);
}

/**
 * 更新一个对象WorkFlow到数据库中
 * <param name="workFlow">需要更新的WorkFlow</param>
 */
public int workFlowUpdate(WorkFlow workFlow) throws SQLException, DbException {
	return this.workFlowUpdate(workFlow, "");
}

/**
 * 更新一个对象WorkFlow到数据库中
 * <param name="workFlow">需要更新的WorkFlow</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int workFlowUpdate(WorkFlow workFlow, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().workFlowUpdate(workFlow, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + workFlow.getWorkFlowId());
	this.operatesLogSimpleAdd("T_WORK_FLOW", "更新", "WORK_FLOW_ID", kvalue, workFlow);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
public WorkFlow workFlowSelectByWorkFlowId(String AWorkFlowId) throws SQLException, DbException {
	return this.getDao().workFlowSelectByWorkFlowId(AWorkFlowId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ACreator">创建人</param>
 */
public List<WorkFlow> workFlowSelectObjectsByCreator(int ACreator) throws SQLException, DbException {
	return this.getDao().workFlowSelectObjectsByCreator(ACreator);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<WorkFlow> workFlowSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().workFlowSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<WorkFlow> workFlowSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().workFlowSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<WorkFlow> workFlowSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().workFlowSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<WorkFlow> workFlowSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().workFlowSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public WorkFlow workFlowSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<WorkFlow> list = this.workFlowSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(WorkFlow.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<WorkFlow> workFlowSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.workFlowSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<WorkFlow> workFlowSelectObjects() throws SQLException, DbException {
	return this.workFlowSelectObjects("");
}

/**
 * @return 查询结果
 */
public WorkFlow workFlowSelectSingleObject() throws SQLException, DbException {
	return this.workFlowSelectSingleObject("");
}

/**
 * <param name="workFlowQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<WorkFlow> workFlowSelectObjects(ConditionQuery workFlowQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = workFlowQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.workFlowSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="workFlowQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<WorkFlow> workFlowSelectObjects(ConditionQuery workFlowQueryCondition) throws SQLException, DbException {
	String sql = workFlowQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.workFlowSelectObjects(sql);
}

/**
 * <param name="workFlowQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public WorkFlow workFlowSelectSingleObject(ConditionQuery workFlowQueryCondition) throws SQLException, DbException {
	List<WorkFlow> list = this.workFlowSelectObjects(workFlowQueryCondition);
	return common.util.ListUtil.getFirstItem(WorkFlow.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends WorkFlow> List<T> workFlowSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().workFlowSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends WorkFlow> List<T> workFlowSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().workFlowSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends WorkFlow> T workFlowSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.workFlowSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends WorkFlow> List<T> workFlowSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.workFlowSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends WorkFlow> List<T> workFlowSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.workFlowSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends WorkFlow> T workFlowSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.workFlowSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="workFlowQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends WorkFlow> List<T> workFlowSelectObjects(Class<T> type, ConditionQuery workFlowQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = workFlowQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.workFlowSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="workFlowQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends WorkFlow> List<T> workFlowSelectObjects(Class<T> type, ConditionQuery workFlowQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = workFlowQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.workFlowSelectObjects(type, sql);
}

/**
 * <param name="workFlowQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends WorkFlow> T workFlowSelectSingleObject(Class<T> type, ConditionQuery workFlowQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.workFlowSelectObjects(type, workFlowQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int workFlowQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().workFlowQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="workFlowQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int workFlowQuerySelectObjectsCount(ConditionQuery workFlowQueryCondition) throws SQLException, DbException {
	String sql = workFlowQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.workFlowQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象WorkFlowMemo到数据库中
 * <param name="workFlowMemo">需要插入的新对象</param>
 */
public void workFlowMemoInsert(WorkFlowMemo workFlowMemo) throws SQLException, DbException {
	this.getDao().workFlowMemoInsert(workFlowMemo);
	String kvalue = "";
	kvalue = (kvalue + workFlowMemo.getWorkFlowMemoId());
	this.operatesLogSimpleAdd("WORK_FLOW_MEMO", "插入", "WORK_FLOW_MEMO_ID", kvalue, workFlowMemo);
}

/**
 * 从数据库中删除一个对象WorkFlowMemo
 * <param name="AWorkFlowMemoId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void workFlowMemoDeleteByWorkFlowMemoId(int AWorkFlowMemoId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().workFlowMemoDeleteByWorkFlowMemoId(AWorkFlowMemoId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AWorkFlowMemoId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("WORK_FLOW_MEMO", "删除", "WORK_FLOW_MEMO_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象WorkFlowMemo
 * <param name="AWorkFlowMemoId">标识</param>
 */
public void workFlowMemoDeleteByWorkFlowMemoId(int AWorkFlowMemoId) throws SQLException, DbException {
	this.workFlowMemoDeleteByWorkFlowMemoId(AWorkFlowMemoId, "");
}

/**
 * 从数据库中删除一批对象WorkFlowMemo
 * <param name="AMemoUserId">用户代号</param>
 */
public void workFlowMemoDeleteListByMemoUserId(int AMemoUserId) throws SQLException, DbException {
	this.getDao().workFlowMemoDeleteListByMemoUserId(AMemoUserId);
	String kvalue = "";
	kvalue = (kvalue + AMemoUserId);
	this.operatesLogSimpleAdd("WORK_FLOW_MEMO", "删除", "MEMO_USER_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象WorkFlowMemo
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
public void workFlowMemoDeleteListByWorkFlowId(String AWorkFlowId) throws SQLException, DbException {
	this.getDao().workFlowMemoDeleteListByWorkFlowId(AWorkFlowId);
	String kvalue = "";
	kvalue = (kvalue + AWorkFlowId);
	this.operatesLogSimpleAdd("WORK_FLOW_MEMO", "删除", "WORK_FLOW_ID", kvalue, null);
}

/**
 * 更新一个对象WorkFlowMemo到数据库中
 * <param name="workFlowMemo">需要更新的WorkFlowMemo</param>
 */
public int workFlowMemoUpdate(WorkFlowMemo workFlowMemo) throws SQLException, DbException {
	return this.workFlowMemoUpdate(workFlowMemo, "");
}

/**
 * 更新一个对象WorkFlowMemo到数据库中
 * <param name="workFlowMemo">需要更新的WorkFlowMemo</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int workFlowMemoUpdate(WorkFlowMemo workFlowMemo, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().workFlowMemoUpdate(workFlowMemo, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + workFlowMemo.getWorkFlowMemoId());
	this.operatesLogSimpleAdd("WORK_FLOW_MEMO", "更新", "WORK_FLOW_MEMO_ID", kvalue, workFlowMemo);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AWorkFlowMemoId">标识</param>
 */
public WorkFlowMemo workFlowMemoSelectByWorkFlowMemoId(int AWorkFlowMemoId) throws SQLException, DbException {
	return this.getDao().workFlowMemoSelectByWorkFlowMemoId(AWorkFlowMemoId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AMemoUserId">用户代号</param>
 */
public List<WorkFlowMemo> workFlowMemoSelectObjectsByMemoUserId(int AMemoUserId) throws SQLException, DbException {
	return this.getDao().workFlowMemoSelectObjectsByMemoUserId(AMemoUserId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
public List<WorkFlowMemo> workFlowMemoSelectObjectsByWorkFlowId(String AWorkFlowId) throws SQLException, DbException {
	return this.getDao().workFlowMemoSelectObjectsByWorkFlowId(AWorkFlowId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<WorkFlowMemo> workFlowMemoSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().workFlowMemoSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<WorkFlowMemo> workFlowMemoSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().workFlowMemoSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<WorkFlowMemo> workFlowMemoSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().workFlowMemoSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<WorkFlowMemo> workFlowMemoSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().workFlowMemoSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public WorkFlowMemo workFlowMemoSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<WorkFlowMemo> list = this.workFlowMemoSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(WorkFlowMemo.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<WorkFlowMemo> workFlowMemoSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.workFlowMemoSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<WorkFlowMemo> workFlowMemoSelectObjects() throws SQLException, DbException {
	return this.workFlowMemoSelectObjects("");
}

/**
 * @return 查询结果
 */
public WorkFlowMemo workFlowMemoSelectSingleObject() throws SQLException, DbException {
	return this.workFlowMemoSelectSingleObject("");
}

/**
 * <param name="workFlowMemoQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<WorkFlowMemo> workFlowMemoSelectObjects(ConditionQuery workFlowMemoQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = workFlowMemoQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.workFlowMemoSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="workFlowMemoQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<WorkFlowMemo> workFlowMemoSelectObjects(ConditionQuery workFlowMemoQueryCondition) throws SQLException, DbException {
	String sql = workFlowMemoQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.workFlowMemoSelectObjects(sql);
}

/**
 * <param name="workFlowMemoQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public WorkFlowMemo workFlowMemoSelectSingleObject(ConditionQuery workFlowMemoQueryCondition) throws SQLException, DbException {
	List<WorkFlowMemo> list = this.workFlowMemoSelectObjects(workFlowMemoQueryCondition);
	return common.util.ListUtil.getFirstItem(WorkFlowMemo.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends WorkFlowMemo> List<T> workFlowMemoSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().workFlowMemoSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends WorkFlowMemo> List<T> workFlowMemoSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().workFlowMemoSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends WorkFlowMemo> T workFlowMemoSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.workFlowMemoSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends WorkFlowMemo> List<T> workFlowMemoSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.workFlowMemoSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends WorkFlowMemo> List<T> workFlowMemoSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.workFlowMemoSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends WorkFlowMemo> T workFlowMemoSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.workFlowMemoSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="workFlowMemoQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends WorkFlowMemo> List<T> workFlowMemoSelectObjects(Class<T> type, ConditionQuery workFlowMemoQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = workFlowMemoQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.workFlowMemoSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="workFlowMemoQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends WorkFlowMemo> List<T> workFlowMemoSelectObjects(Class<T> type, ConditionQuery workFlowMemoQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = workFlowMemoQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.workFlowMemoSelectObjects(type, sql);
}

/**
 * <param name="workFlowMemoQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends WorkFlowMemo> T workFlowMemoSelectSingleObject(Class<T> type, ConditionQuery workFlowMemoQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.workFlowMemoSelectObjects(type, workFlowMemoQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int workFlowMemoQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().workFlowMemoQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="workFlowMemoQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int workFlowMemoQuerySelectObjectsCount(ConditionQuery workFlowMemoQueryCondition) throws SQLException, DbException {
	String sql = workFlowMemoQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.workFlowMemoQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象IssueUsers到数据库中
 * <param name="issueUsers">需要插入的新对象</param>
 */
public void issueUsersInsert(IssueUsers issueUsers) throws SQLException, DbException {
	this.getDao().issueUsersInsert(issueUsers);
	String kvalue = "";
	kvalue = (kvalue + issueUsers.getIssueUserId());
	this.operatesLogSimpleAdd("T_ISSUE_USERS", "插入", "ISSUE_USER_ID", kvalue, issueUsers);
}

/**
 * 从数据库中删除一个对象IssueUsers
 * <param name="AIssueUserId">用户标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void issueUsersDeleteByIssueUserId(int AIssueUserId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_ISSUE_USERS].[ISSUE_USER_ID] = ");
	sql = (sql + AIssueUserId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueProjectSelectObjects((" inner join T_ISSUE_USERS on [T_ISSUE_USERS].[ISSUE_USER_ID] = [T_ISSUE_PROJECT]." +
"[DEFAULT_USER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_USERS", "T_ISSUE_PROJECT"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_USERS].[ISSUE_USER_ID] = ");
	sql = (sql + AIssueUserId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueProjectUserPrivilegesSelectObjects((" inner join T_ISSUE_USERS on [T_ISSUE_USERS].[ISSUE_USER_ID] = [T_ISSUE_PROJECT_U" +
"SER_PRIVILEGES].[ISSUE_USER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_USERS", "T_ISSUE_PROJECT_USER_PRIVILEGES"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_USERS].[ISSUE_USER_ID] = ");
	sql = (sql + AIssueUserId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueCommentSelectObjects((" inner join T_ISSUE_USERS on [T_ISSUE_USERS].[ISSUE_USER_ID] = [T_ISSUE_COMMENT]." +
"[COMMENT_USER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_USERS", "T_ISSUE_COMMENT"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_USERS].[ISSUE_USER_ID] = ");
	sql = (sql + AIssueUserId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueSelectObjects((" inner join T_ISSUE_USERS on [T_ISSUE_USERS].[ISSUE_USER_ID] = [T_ISSUE].[REPORT_" +
"USER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_USERS", "T_ISSUE"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_USERS].[ISSUE_USER_ID] = ");
	sql = (sql + AIssueUserId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueUserDefaultQuerySelectObjects((" inner join T_ISSUE_USERS on [T_ISSUE_USERS].[ISSUE_USER_ID] = [T_ISSUE_USER_DEFA" +
"ULT_QUERY].[ISSUE_USER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_USERS", "T_ISSUE_USER_DEFAULT_QUERY"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_USERS].[ISSUE_USER_ID] = ");
	sql = (sql + AIssueUserId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueQuerySelectObjects((" inner join T_ISSUE_USERS on [T_ISSUE_USERS].[ISSUE_USER_ID] = [T_ISSUE_QUERY].[I" +
"SSUE_CREATE_USER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_USERS", "T_ISSUE_QUERY"));
	}
	this.getDao().issueUsersDeleteByIssueUserId(AIssueUserId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AIssueUserId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ISSUE_USERS", "删除", "ISSUE_USER_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象IssueUsers
 * <param name="AIssueUserId">用户标识</param>
 */
public void issueUsersDeleteByIssueUserId(int AIssueUserId) throws SQLException, DbException {
	this.issueUsersDeleteByIssueUserId(AIssueUserId, "");
}

/**
 * 从数据库中删除一个对象IssueUsers
 * <param name="ALoginName">登录名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void issueUsersDeleteByLoginName(String ALoginName, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_ISSUE_USERS].[LOGIN_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(ALoginName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueProjectSelectObjects((" inner join T_ISSUE_USERS on [T_ISSUE_USERS].[ISSUE_USER_ID] = [T_ISSUE_PROJECT]." +
"[DEFAULT_USER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_USERS", "T_ISSUE_PROJECT"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_USERS].[LOGIN_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(ALoginName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueProjectUserPrivilegesSelectObjects((" inner join T_ISSUE_USERS on [T_ISSUE_USERS].[ISSUE_USER_ID] = [T_ISSUE_PROJECT_U" +
"SER_PRIVILEGES].[ISSUE_USER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_USERS", "T_ISSUE_PROJECT_USER_PRIVILEGES"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_USERS].[LOGIN_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(ALoginName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueCommentSelectObjects((" inner join T_ISSUE_USERS on [T_ISSUE_USERS].[ISSUE_USER_ID] = [T_ISSUE_COMMENT]." +
"[COMMENT_USER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_USERS", "T_ISSUE_COMMENT"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_USERS].[LOGIN_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(ALoginName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueSelectObjects((" inner join T_ISSUE_USERS on [T_ISSUE_USERS].[ISSUE_USER_ID] = [T_ISSUE].[REPORT_" +
"USER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_USERS", "T_ISSUE"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_USERS].[LOGIN_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(ALoginName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueUserDefaultQuerySelectObjects((" inner join T_ISSUE_USERS on [T_ISSUE_USERS].[ISSUE_USER_ID] = [T_ISSUE_USER_DEFA" +
"ULT_QUERY].[ISSUE_USER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_USERS", "T_ISSUE_USER_DEFAULT_QUERY"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_USERS].[LOGIN_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(ALoginName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueQuerySelectObjects((" inner join T_ISSUE_USERS on [T_ISSUE_USERS].[ISSUE_USER_ID] = [T_ISSUE_QUERY].[I" +
"SSUE_CREATE_USER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_USERS", "T_ISSUE_QUERY"));
	}
	this.getDao().issueUsersDeleteByLoginName(ALoginName, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ALoginName);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ISSUE_USERS", "删除", "LOGIN_NAME", kvalue, null);
}

/**
 * 从数据库中删除一个对象IssueUsers
 * <param name="ALoginName">登录名称</param>
 */
public void issueUsersDeleteByLoginName(String ALoginName) throws SQLException, DbException {
	this.issueUsersDeleteByLoginName(ALoginName, "");
}

/**
 * 从数据库中删除一批对象IssueUsers
 * <param name="AInnerUserId">关联到内部的ID</param>
 */
public void issueUsersDeleteListByInnerUserId(Integer AInnerUserId) throws SQLException, DbException {
	if ((this.getDao().issueProjectSelectObjects((" inner join T_ISSUE_USERS on [T_ISSUE_USERS].[ISSUE_USER_ID] = [T_ISSUE_PROJECT]." +
"[DEFAULT_USER_ID] where [T_ISSUE_USERS].[INNER_USER_ID] = " + AInnerUserId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_USERS", "T_ISSUE_PROJECT"));
	}
	if ((this.getDao().issueProjectUserPrivilegesSelectObjects((" inner join T_ISSUE_USERS on [T_ISSUE_USERS].[ISSUE_USER_ID] = [T_ISSUE_PROJECT_U" +
"SER_PRIVILEGES].[ISSUE_USER_ID] where [T_ISSUE_USERS].[INNER_USER_ID] = " + AInnerUserId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_USERS", "T_ISSUE_PROJECT_USER_PRIVILEGES"));
	}
	if ((this.getDao().issueCommentSelectObjects((" inner join T_ISSUE_USERS on [T_ISSUE_USERS].[ISSUE_USER_ID] = [T_ISSUE_COMMENT]." +
"[COMMENT_USER_ID] where [T_ISSUE_USERS].[INNER_USER_ID] = " + AInnerUserId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_USERS", "T_ISSUE_COMMENT"));
	}
	if ((this.getDao().issueSelectObjects((" inner join T_ISSUE_USERS on [T_ISSUE_USERS].[ISSUE_USER_ID] = [T_ISSUE].[REPORT_" +
"USER_ID] where [T_ISSUE_USERS].[INNER_USER_ID] = " + AInnerUserId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_USERS", "T_ISSUE"));
	}
	if ((this.getDao().issueUserDefaultQuerySelectObjects((" inner join T_ISSUE_USERS on [T_ISSUE_USERS].[ISSUE_USER_ID] = [T_ISSUE_USER_DEFA" +
"ULT_QUERY].[ISSUE_USER_ID] where [T_ISSUE_USERS].[INNER_USER_ID] = " + AInnerUserId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_USERS", "T_ISSUE_USER_DEFAULT_QUERY"));
	}
	if ((this.getDao().issueQuerySelectObjects((" inner join T_ISSUE_USERS on [T_ISSUE_USERS].[ISSUE_USER_ID] = [T_ISSUE_QUERY].[I" +
"SSUE_CREATE_USER_ID] where [T_ISSUE_USERS].[INNER_USER_ID] = " + AInnerUserId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_USERS", "T_ISSUE_QUERY"));
	}
	this.getDao().issueUsersDeleteListByInnerUserId(AInnerUserId);
	String kvalue = "";
	kvalue = (kvalue + AInnerUserId);
	this.operatesLogSimpleAdd("T_ISSUE_USERS", "删除", "INNER_USER_ID", kvalue, null);
}

/**
 * 更新一个对象IssueUsers到数据库中
 * <param name="issueUsers">需要更新的IssueUsers</param>
 */
public int issueUsersUpdate(IssueUsers issueUsers) throws SQLException, DbException {
	return this.issueUsersUpdate(issueUsers, "");
}

/**
 * 更新一个对象IssueUsers到数据库中
 * <param name="issueUsers">需要更新的IssueUsers</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int issueUsersUpdate(IssueUsers issueUsers, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueUsersUpdate(issueUsers, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + issueUsers.getIssueUserId());
	this.operatesLogSimpleAdd("T_ISSUE_USERS", "更新", "ISSUE_USER_ID", kvalue, issueUsers);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueUserId">用户标识</param>
 */
public IssueUsers issueUsersSelectByIssueUserId(int AIssueUserId) throws SQLException, DbException {
	return this.getDao().issueUsersSelectByIssueUserId(AIssueUserId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ALoginName">登录名称</param>
 */
public IssueUsers issueUsersSelectByLoginName(String ALoginName) throws SQLException, DbException {
	return this.getDao().issueUsersSelectByLoginName(ALoginName);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AInnerUserId">关联到内部的ID</param>
 */
public List<IssueUsers> issueUsersSelectObjectsByInnerUserId(Integer AInnerUserId) throws SQLException, DbException {
	return this.getDao().issueUsersSelectObjectsByInnerUserId(AInnerUserId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueUsers> issueUsersSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueUsersSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<IssueUsers> issueUsersSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().issueUsersSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueUsers> issueUsersSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueUsersSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<IssueUsers> issueUsersSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().issueUsersSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public IssueUsers issueUsersSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<IssueUsers> list = this.issueUsersSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(IssueUsers.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueUsers> issueUsersSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.issueUsersSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<IssueUsers> issueUsersSelectObjects() throws SQLException, DbException {
	return this.issueUsersSelectObjects("");
}

/**
 * @return 查询结果
 */
public IssueUsers issueUsersSelectSingleObject() throws SQLException, DbException {
	return this.issueUsersSelectSingleObject("");
}

/**
 * <param name="issueUsersQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueUsers> issueUsersSelectObjects(ConditionQuery issueUsersQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = issueUsersQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueUsersSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueUsersQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<IssueUsers> issueUsersSelectObjects(ConditionQuery issueUsersQueryCondition) throws SQLException, DbException {
	String sql = issueUsersQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueUsersSelectObjects(sql);
}

/**
 * <param name="issueUsersQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public IssueUsers issueUsersSelectSingleObject(ConditionQuery issueUsersQueryCondition) throws SQLException, DbException {
	List<IssueUsers> list = this.issueUsersSelectObjects(issueUsersQueryCondition);
	return common.util.ListUtil.getFirstItem(IssueUsers.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueUsers> List<T> issueUsersSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueUsersSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueUsers> List<T> issueUsersSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueUsersSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueUsers> T issueUsersSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueUsersSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueUsers> List<T> issueUsersSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueUsersSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends IssueUsers> List<T> issueUsersSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueUsersSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends IssueUsers> T issueUsersSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueUsersSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="issueUsersQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueUsers> List<T> issueUsersSelectObjects(Class<T> type, ConditionQuery issueUsersQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueUsersQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueUsersSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueUsersQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueUsers> List<T> issueUsersSelectObjects(Class<T> type, ConditionQuery issueUsersQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueUsersQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueUsersSelectObjects(type, sql);
}

/**
 * <param name="issueUsersQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueUsers> T issueUsersSelectSingleObject(Class<T> type, ConditionQuery issueUsersQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueUsersSelectObjects(type, issueUsersQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int issueUsersQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueUsersQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="issueUsersQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int issueUsersQuerySelectObjectsCount(ConditionQuery issueUsersQueryCondition) throws SQLException, DbException {
	String sql = issueUsersQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueUsersQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象DepartMent到数据库中
 * <param name="departMent">需要插入的新对象</param>
 */
public void departMentInsert(DepartMent departMent) throws SQLException, DbException {
	this.getDao().departMentInsert(departMent);
	String kvalue = "";
	kvalue = (kvalue + departMent.getDepartMentId());
	this.operatesLogSimpleAdd("T_DEPART_MENT", "插入", "DEPART_MENT_ID", kvalue, departMent);
}

/**
 * 从数据库中删除一个对象DepartMent
 * <param name="ADepartMentId">部门ID</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void departMentDeleteByDepartMentId(int ADepartMentId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_DEPART_MENT].[DEPART_MENT_ID] = ");
	sql = (sql + ADepartMentId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().departMentUserSelectObjects((" inner join T_DEPART_MENT on [T_DEPART_MENT].[DEPART_MENT_ID] = [T_DEPART_MENT_US" +
"ER].[DEPART_MENT_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_DEPART_MENT", "T_DEPART_MENT_USER"));
	}
	this.getDao().departMentDeleteByDepartMentId(ADepartMentId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ADepartMentId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_DEPART_MENT", "删除", "DEPART_MENT_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象DepartMent
 * <param name="ADepartMentId">部门ID</param>
 */
public void departMentDeleteByDepartMentId(int ADepartMentId) throws SQLException, DbException {
	this.departMentDeleteByDepartMentId(ADepartMentId, "");
}

/**
 * 更新一个对象DepartMent到数据库中
 * <param name="departMent">需要更新的DepartMent</param>
 */
public int departMentUpdate(DepartMent departMent) throws SQLException, DbException {
	return this.departMentUpdate(departMent, "");
}

/**
 * 更新一个对象DepartMent到数据库中
 * <param name="departMent">需要更新的DepartMent</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int departMentUpdate(DepartMent departMent, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().departMentUpdate(departMent, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + departMent.getDepartMentId());
	this.operatesLogSimpleAdd("T_DEPART_MENT", "更新", "DEPART_MENT_ID", kvalue, departMent);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADepartMentId">部门ID</param>
 */
public DepartMent departMentSelectByDepartMentId(int ADepartMentId) throws SQLException, DbException {
	return this.getDao().departMentSelectByDepartMentId(ADepartMentId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<DepartMent> departMentSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().departMentSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<DepartMent> departMentSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().departMentSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<DepartMent> departMentSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().departMentSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<DepartMent> departMentSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().departMentSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public DepartMent departMentSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<DepartMent> list = this.departMentSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(DepartMent.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<DepartMent> departMentSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.departMentSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<DepartMent> departMentSelectObjects() throws SQLException, DbException {
	return this.departMentSelectObjects("");
}

/**
 * @return 查询结果
 */
public DepartMent departMentSelectSingleObject() throws SQLException, DbException {
	return this.departMentSelectSingleObject("");
}

/**
 * <param name="departMentQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<DepartMent> departMentSelectObjects(ConditionQuery departMentQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = departMentQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.departMentSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="departMentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<DepartMent> departMentSelectObjects(ConditionQuery departMentQueryCondition) throws SQLException, DbException {
	String sql = departMentQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.departMentSelectObjects(sql);
}

/**
 * <param name="departMentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public DepartMent departMentSelectSingleObject(ConditionQuery departMentQueryCondition) throws SQLException, DbException {
	List<DepartMent> list = this.departMentSelectObjects(departMentQueryCondition);
	return common.util.ListUtil.getFirstItem(DepartMent.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends DepartMent> List<T> departMentSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().departMentSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends DepartMent> List<T> departMentSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().departMentSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends DepartMent> T departMentSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.departMentSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends DepartMent> List<T> departMentSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.departMentSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends DepartMent> List<T> departMentSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.departMentSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends DepartMent> T departMentSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.departMentSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="departMentQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends DepartMent> List<T> departMentSelectObjects(Class<T> type, ConditionQuery departMentQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = departMentQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.departMentSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="departMentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends DepartMent> List<T> departMentSelectObjects(Class<T> type, ConditionQuery departMentQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = departMentQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.departMentSelectObjects(type, sql);
}

/**
 * <param name="departMentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends DepartMent> T departMentSelectSingleObject(Class<T> type, ConditionQuery departMentQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.departMentSelectObjects(type, departMentQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int departMentQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().departMentQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="departMentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int departMentQuerySelectObjectsCount(ConditionQuery departMentQueryCondition) throws SQLException, DbException {
	String sql = departMentQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.departMentQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象IssueProject到数据库中
 * <param name="issueProject">需要插入的新对象</param>
 */
public void issueProjectInsert(IssueProject issueProject) throws SQLException, DbException {
	this.getDao().issueProjectInsert(issueProject);
	String kvalue = "";
	kvalue = (kvalue + issueProject.getIssueProjectId());
	this.operatesLogSimpleAdd("T_ISSUE_PROJECT", "插入", "ISSUE_PROJECT_ID", kvalue, issueProject);
}

/**
 * 从数据库中删除一个对象IssueProject
 * <param name="AIssueProjectId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void issueProjectDeleteByIssueProjectId(int AIssueProjectId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = ");
	sql = (sql + AIssueProjectId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueProjectModuleSelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE_PR" +
"OJECT_MODULE].[ISSUE_PROJECT_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE_PROJECT_MODULE"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = ");
	sql = (sql + AIssueProjectId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueProjectUserPrivilegesSelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE_PR" +
"OJECT_USER_PRIVILEGES].[ISSUE_PROJECT_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE_PROJECT_USER_PRIVILEGES"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = ");
	sql = (sql + AIssueProjectId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueSelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE].[" +
"ISSUE_PROJECT_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = ");
	sql = (sql + AIssueProjectId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueUserDefaultQuerySelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE_US" +
"ER_DEFAULT_QUERY].[ISSUE_PROJECT_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE_USER_DEFAULT_QUERY"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = ");
	sql = (sql + AIssueProjectId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueRoleDefaultQuerySelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE_RO" +
"LE_DEFAULT_QUERY].[ISSUE_PROJECT_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE_ROLE_DEFAULT_QUERY"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = ");
	sql = (sql + AIssueProjectId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueQuerySelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE_QU" +
"ERY].[ISSUE_PROJECT_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE_QUERY"));
	}
	this.getDao().issueProjectDeleteByIssueProjectId(AIssueProjectId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AIssueProjectId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ISSUE_PROJECT", "删除", "ISSUE_PROJECT_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象IssueProject
 * <param name="AIssueProjectId">标识</param>
 */
public void issueProjectDeleteByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	this.issueProjectDeleteByIssueProjectId(AIssueProjectId, "");
}

/**
 * 从数据库中删除一个对象IssueProject
 * <param name="AIssueProjectName">项目名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void issueProjectDeleteByIssueProjectName(String AIssueProjectName, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_ISSUE_PROJECT].[ISSUE_PROJECT_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(AIssueProjectName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueProjectModuleSelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE_PR" +
"OJECT_MODULE].[ISSUE_PROJECT_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE_PROJECT_MODULE"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_PROJECT].[ISSUE_PROJECT_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(AIssueProjectName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueProjectUserPrivilegesSelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE_PR" +
"OJECT_USER_PRIVILEGES].[ISSUE_PROJECT_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE_PROJECT_USER_PRIVILEGES"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_PROJECT].[ISSUE_PROJECT_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(AIssueProjectName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueSelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE].[" +
"ISSUE_PROJECT_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_PROJECT].[ISSUE_PROJECT_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(AIssueProjectName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueUserDefaultQuerySelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE_US" +
"ER_DEFAULT_QUERY].[ISSUE_PROJECT_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE_USER_DEFAULT_QUERY"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_PROJECT].[ISSUE_PROJECT_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(AIssueProjectName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueRoleDefaultQuerySelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE_RO" +
"LE_DEFAULT_QUERY].[ISSUE_PROJECT_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE_ROLE_DEFAULT_QUERY"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_PROJECT].[ISSUE_PROJECT_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(AIssueProjectName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueQuerySelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE_QU" +
"ERY].[ISSUE_PROJECT_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE_QUERY"));
	}
	this.getDao().issueProjectDeleteByIssueProjectName(AIssueProjectName, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AIssueProjectName);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ISSUE_PROJECT", "删除", "ISSUE_PROJECT_NAME", kvalue, null);
}

/**
 * 从数据库中删除一个对象IssueProject
 * <param name="AIssueProjectName">项目名称</param>
 */
public void issueProjectDeleteByIssueProjectName(String AIssueProjectName) throws SQLException, DbException {
	this.issueProjectDeleteByIssueProjectName(AIssueProjectName, "");
}

/**
 * 从数据库中删除一批对象IssueProject
 * <param name="ADefaultUserId">默认处理用户</param>
 */
public void issueProjectDeleteListByDefaultUserId(int ADefaultUserId) throws SQLException, DbException {
	if ((this.getDao().issueProjectModuleSelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE_PR" +
"OJECT_MODULE].[ISSUE_PROJECT_ID] where [T_ISSUE_PROJECT].[DEFAULT_USER_ID] = " + ADefaultUserId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE_PROJECT_MODULE"));
	}
	if ((this.getDao().issueProjectUserPrivilegesSelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE_PR" +
"OJECT_USER_PRIVILEGES].[ISSUE_PROJECT_ID] where [T_ISSUE_PROJECT].[DEFAULT_USER_" +
"ID] = " + ADefaultUserId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE_PROJECT_USER_PRIVILEGES"));
	}
	if ((this.getDao().issueSelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE].[" +
"ISSUE_PROJECT_ID] where [T_ISSUE_PROJECT].[DEFAULT_USER_ID] = " + ADefaultUserId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE"));
	}
	if ((this.getDao().issueUserDefaultQuerySelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE_US" +
"ER_DEFAULT_QUERY].[ISSUE_PROJECT_ID] where [T_ISSUE_PROJECT].[DEFAULT_USER_ID] =" +
" " + ADefaultUserId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE_USER_DEFAULT_QUERY"));
	}
	if ((this.getDao().issueRoleDefaultQuerySelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE_RO" +
"LE_DEFAULT_QUERY].[ISSUE_PROJECT_ID] where [T_ISSUE_PROJECT].[DEFAULT_USER_ID] =" +
" " + ADefaultUserId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE_ROLE_DEFAULT_QUERY"));
	}
	if ((this.getDao().issueQuerySelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE_QU" +
"ERY].[ISSUE_PROJECT_ID] where [T_ISSUE_PROJECT].[DEFAULT_USER_ID] = " + ADefaultUserId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE_QUERY"));
	}
	this.getDao().issueProjectDeleteListByDefaultUserId(ADefaultUserId);
	String kvalue = "";
	kvalue = (kvalue + ADefaultUserId);
	this.operatesLogSimpleAdd("T_ISSUE_PROJECT", "删除", "DEFAULT_USER_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象IssueProject
 * <param name="AInnerProjId">内部工程ID</param>
 */
public void issueProjectDeleteListByInnerProjId(Integer AInnerProjId) throws SQLException, DbException {
	if ((this.getDao().issueProjectModuleSelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE_PR" +
"OJECT_MODULE].[ISSUE_PROJECT_ID] where [T_ISSUE_PROJECT].[INNER_PROJ_ID] = " + AInnerProjId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE_PROJECT_MODULE"));
	}
	if ((this.getDao().issueProjectUserPrivilegesSelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE_PR" +
"OJECT_USER_PRIVILEGES].[ISSUE_PROJECT_ID] where [T_ISSUE_PROJECT].[INNER_PROJ_ID" +
"] = " + AInnerProjId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE_PROJECT_USER_PRIVILEGES"));
	}
	if ((this.getDao().issueSelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE].[" +
"ISSUE_PROJECT_ID] where [T_ISSUE_PROJECT].[INNER_PROJ_ID] = " + AInnerProjId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE"));
	}
	if ((this.getDao().issueUserDefaultQuerySelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE_US" +
"ER_DEFAULT_QUERY].[ISSUE_PROJECT_ID] where [T_ISSUE_PROJECT].[INNER_PROJ_ID] = " + AInnerProjId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE_USER_DEFAULT_QUERY"));
	}
	if ((this.getDao().issueRoleDefaultQuerySelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE_RO" +
"LE_DEFAULT_QUERY].[ISSUE_PROJECT_ID] where [T_ISSUE_PROJECT].[INNER_PROJ_ID] = " + AInnerProjId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE_ROLE_DEFAULT_QUERY"));
	}
	if ((this.getDao().issueQuerySelectObjects((" inner join T_ISSUE_PROJECT on [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = [T_ISSUE_QU" +
"ERY].[ISSUE_PROJECT_ID] where [T_ISSUE_PROJECT].[INNER_PROJ_ID] = " + AInnerProjId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT", "T_ISSUE_QUERY"));
	}
	this.getDao().issueProjectDeleteListByInnerProjId(AInnerProjId);
	String kvalue = "";
	kvalue = (kvalue + AInnerProjId);
	this.operatesLogSimpleAdd("T_ISSUE_PROJECT", "删除", "INNER_PROJ_ID", kvalue, null);
}

/**
 * 更新一个对象IssueProject到数据库中
 * <param name="issueProject">需要更新的IssueProject</param>
 */
public int issueProjectUpdate(IssueProject issueProject) throws SQLException, DbException {
	return this.issueProjectUpdate(issueProject, "");
}

/**
 * 更新一个对象IssueProject到数据库中
 * <param name="issueProject">需要更新的IssueProject</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int issueProjectUpdate(IssueProject issueProject, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueProjectUpdate(issueProject, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + issueProject.getIssueProjectId());
	this.operatesLogSimpleAdd("T_ISSUE_PROJECT", "更新", "ISSUE_PROJECT_ID", kvalue, issueProject);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectId">标识</param>
 */
public IssueProject issueProjectSelectByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	return this.getDao().issueProjectSelectByIssueProjectId(AIssueProjectId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectName">项目名称</param>
 */
public IssueProject issueProjectSelectByIssueProjectName(String AIssueProjectName) throws SQLException, DbException {
	return this.getDao().issueProjectSelectByIssueProjectName(AIssueProjectName);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ADefaultUserId">默认处理用户</param>
 */
public List<IssueProject> issueProjectSelectObjectsByDefaultUserId(int ADefaultUserId) throws SQLException, DbException {
	return this.getDao().issueProjectSelectObjectsByDefaultUserId(ADefaultUserId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AInnerProjId">内部工程ID</param>
 */
public List<IssueProject> issueProjectSelectObjectsByInnerProjId(Integer AInnerProjId) throws SQLException, DbException {
	return this.getDao().issueProjectSelectObjectsByInnerProjId(AInnerProjId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueProject> issueProjectSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueProjectSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<IssueProject> issueProjectSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().issueProjectSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueProject> issueProjectSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueProjectSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<IssueProject> issueProjectSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().issueProjectSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public IssueProject issueProjectSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<IssueProject> list = this.issueProjectSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(IssueProject.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueProject> issueProjectSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.issueProjectSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<IssueProject> issueProjectSelectObjects() throws SQLException, DbException {
	return this.issueProjectSelectObjects("");
}

/**
 * @return 查询结果
 */
public IssueProject issueProjectSelectSingleObject() throws SQLException, DbException {
	return this.issueProjectSelectSingleObject("");
}

/**
 * <param name="issueProjectQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueProject> issueProjectSelectObjects(ConditionQuery issueProjectQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = issueProjectQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueProjectSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<IssueProject> issueProjectSelectObjects(ConditionQuery issueProjectQueryCondition) throws SQLException, DbException {
	String sql = issueProjectQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueProjectSelectObjects(sql);
}

/**
 * <param name="issueProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public IssueProject issueProjectSelectSingleObject(ConditionQuery issueProjectQueryCondition) throws SQLException, DbException {
	List<IssueProject> list = this.issueProjectSelectObjects(issueProjectQueryCondition);
	return common.util.ListUtil.getFirstItem(IssueProject.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueProject> List<T> issueProjectSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueProjectSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueProject> List<T> issueProjectSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueProjectSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueProject> T issueProjectSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueProjectSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueProject> List<T> issueProjectSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueProjectSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends IssueProject> List<T> issueProjectSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueProjectSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends IssueProject> T issueProjectSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueProjectSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="issueProjectQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueProject> List<T> issueProjectSelectObjects(Class<T> type, ConditionQuery issueProjectQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueProjectQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueProjectSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueProject> List<T> issueProjectSelectObjects(Class<T> type, ConditionQuery issueProjectQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueProjectQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueProjectSelectObjects(type, sql);
}

/**
 * <param name="issueProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueProject> T issueProjectSelectSingleObject(Class<T> type, ConditionQuery issueProjectQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueProjectSelectObjects(type, issueProjectQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int issueProjectQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueProjectQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="issueProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int issueProjectQuerySelectObjectsCount(ConditionQuery issueProjectQueryCondition) throws SQLException, DbException {
	String sql = issueProjectQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueProjectQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象DepartMentUser到数据库中
 * <param name="departMentUser">需要插入的新对象</param>
 */
public void departMentUserInsert(DepartMentUser departMentUser) throws SQLException, DbException {
	this.getDao().departMentUserInsert(departMentUser);
	String kvalue = "";
	kvalue = (kvalue + departMentUser.getDepartMentId());
	kvalue = (kvalue + ",");
	kvalue = (kvalue + departMentUser.getUserId());
	this.operatesLogSimpleAdd("T_DEPART_MENT_USER", "插入", "DEPART_MENT_ID,USER_ID", kvalue, departMentUser);
}

/**
 * 从数据库中删除一个对象DepartMentUser
 * <param name="ADepartMentId">部门ID</param>
 * <param name="AUserId">用户代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void departMentUserDeleteByDepartMentIdUserId(int ADepartMentId, int AUserId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().departMentUserDeleteByDepartMentIdUserId(ADepartMentId, AUserId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ADepartMentId);
	kvalue = (kvalue + ",");
	kvalue = (kvalue + AUserId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_DEPART_MENT_USER", "删除", "DEPART_MENT_ID,USER_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象DepartMentUser
 * <param name="ADepartMentId">部门ID</param>
 * <param name="AUserId">用户代号</param>
 */
public void departMentUserDeleteByDepartMentIdUserId(int ADepartMentId, int AUserId) throws SQLException, DbException {
	this.departMentUserDeleteByDepartMentIdUserId(ADepartMentId, AUserId, "");
}

/**
 * 从数据库中删除一批对象DepartMentUser
 * <param name="ADepartMentId">部门ID</param>
 */
public void departMentUserDeleteListByDepartMentId(int ADepartMentId) throws SQLException, DbException {
	this.getDao().departMentUserDeleteListByDepartMentId(ADepartMentId);
	String kvalue = "";
	kvalue = (kvalue + ADepartMentId);
	this.operatesLogSimpleAdd("T_DEPART_MENT_USER", "删除", "DEPART_MENT_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象DepartMentUser
 * <param name="AUserId">用户代号</param>
 */
public void departMentUserDeleteListByUserId(int AUserId) throws SQLException, DbException {
	this.getDao().departMentUserDeleteListByUserId(AUserId);
	String kvalue = "";
	kvalue = (kvalue + AUserId);
	this.operatesLogSimpleAdd("T_DEPART_MENT_USER", "删除", "USER_ID", kvalue, null);
}

/**
 * 更新一个对象DepartMentUser到数据库中
 * <param name="departMentUser">需要更新的DepartMentUser</param>
 */
public int departMentUserUpdate(DepartMentUser departMentUser) throws SQLException, DbException {
	return this.departMentUserUpdate(departMentUser, "");
}

/**
 * 更新一个对象DepartMentUser到数据库中
 * <param name="departMentUser">需要更新的DepartMentUser</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int departMentUserUpdate(DepartMentUser departMentUser, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().departMentUserUpdate(departMentUser, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + departMentUser.getDepartMentId());
	kvalue = (kvalue + ",");
	kvalue = (kvalue + departMentUser.getUserId());
	this.operatesLogSimpleAdd("T_DEPART_MENT_USER", "更新", "DEPART_MENT_ID,USER_ID", kvalue, departMentUser);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADepartMentId">部门ID</param>
 * <param name="AUserId">用户代号</param>
 */
public DepartMentUser departMentUserSelectByDepartMentIdUserId(int ADepartMentId, int AUserId) throws SQLException, DbException {
	return this.getDao().departMentUserSelectByDepartMentIdUserId(ADepartMentId, AUserId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ADepartMentId">部门ID</param>
 */
public List<DepartMentUser> departMentUserSelectObjectsByDepartMentId(int ADepartMentId) throws SQLException, DbException {
	return this.getDao().departMentUserSelectObjectsByDepartMentId(ADepartMentId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AUserId">用户代号</param>
 */
public List<DepartMentUser> departMentUserSelectObjectsByUserId(int AUserId) throws SQLException, DbException {
	return this.getDao().departMentUserSelectObjectsByUserId(AUserId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<DepartMentUser> departMentUserSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().departMentUserSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<DepartMentUser> departMentUserSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().departMentUserSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<DepartMentUser> departMentUserSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().departMentUserSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<DepartMentUser> departMentUserSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().departMentUserSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public DepartMentUser departMentUserSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<DepartMentUser> list = this.departMentUserSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(DepartMentUser.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<DepartMentUser> departMentUserSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.departMentUserSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<DepartMentUser> departMentUserSelectObjects() throws SQLException, DbException {
	return this.departMentUserSelectObjects("");
}

/**
 * @return 查询结果
 */
public DepartMentUser departMentUserSelectSingleObject() throws SQLException, DbException {
	return this.departMentUserSelectSingleObject("");
}

/**
 * <param name="departMentUserQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<DepartMentUser> departMentUserSelectObjects(ConditionQuery departMentUserQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = departMentUserQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.departMentUserSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="departMentUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<DepartMentUser> departMentUserSelectObjects(ConditionQuery departMentUserQueryCondition) throws SQLException, DbException {
	String sql = departMentUserQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.departMentUserSelectObjects(sql);
}

/**
 * <param name="departMentUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public DepartMentUser departMentUserSelectSingleObject(ConditionQuery departMentUserQueryCondition) throws SQLException, DbException {
	List<DepartMentUser> list = this.departMentUserSelectObjects(departMentUserQueryCondition);
	return common.util.ListUtil.getFirstItem(DepartMentUser.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends DepartMentUser> List<T> departMentUserSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().departMentUserSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends DepartMentUser> List<T> departMentUserSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().departMentUserSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends DepartMentUser> T departMentUserSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.departMentUserSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends DepartMentUser> List<T> departMentUserSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.departMentUserSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends DepartMentUser> List<T> departMentUserSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.departMentUserSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends DepartMentUser> T departMentUserSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.departMentUserSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="departMentUserQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends DepartMentUser> List<T> departMentUserSelectObjects(Class<T> type, ConditionQuery departMentUserQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = departMentUserQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.departMentUserSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="departMentUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends DepartMentUser> List<T> departMentUserSelectObjects(Class<T> type, ConditionQuery departMentUserQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = departMentUserQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.departMentUserSelectObjects(type, sql);
}

/**
 * <param name="departMentUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends DepartMentUser> T departMentUserSelectSingleObject(Class<T> type, ConditionQuery departMentUserQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.departMentUserSelectObjects(type, departMentUserQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int departMentUserQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().departMentUserQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="departMentUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int departMentUserQuerySelectObjectsCount(ConditionQuery departMentUserQueryCondition) throws SQLException, DbException {
	String sql = departMentUserQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.departMentUserQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Leave到数据库中
 * <param name="leave">需要插入的新对象</param>
 */
public void leaveInsert(Leave leave) throws SQLException, DbException {
	this.getDao().leaveInsert(leave);
	String kvalue = "";
	kvalue = (kvalue + leave.getWorkFlowId());
	this.operatesLogSimpleAdd("T_LEAVE", "插入", "WORK_FLOW_ID", kvalue, leave);
}

/**
 * 从数据库中删除一个对象Leave
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void leaveDeleteByWorkFlowId(String AWorkFlowId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().leaveDeleteByWorkFlowId(AWorkFlowId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AWorkFlowId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_LEAVE", "删除", "WORK_FLOW_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象Leave
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
public void leaveDeleteByWorkFlowId(String AWorkFlowId) throws SQLException, DbException {
	this.leaveDeleteByWorkFlowId(AWorkFlowId, "");
}

/**
 * 从数据库中删除一批对象Leave
 * <param name="ARequestUserId">申请人</param>
 */
public void leaveDeleteListByRequestUserId(int ARequestUserId) throws SQLException, DbException {
	this.getDao().leaveDeleteListByRequestUserId(ARequestUserId);
	String kvalue = "";
	kvalue = (kvalue + ARequestUserId);
	this.operatesLogSimpleAdd("T_LEAVE", "删除", "REQUEST_USER_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象Leave
 * <param name="AAuditUserId">最后审核人</param>
 */
public void leaveDeleteListByAuditUserId(Integer AAuditUserId) throws SQLException, DbException {
	this.getDao().leaveDeleteListByAuditUserId(AAuditUserId);
	String kvalue = "";
	kvalue = (kvalue + AAuditUserId);
	this.operatesLogSimpleAdd("T_LEAVE", "删除", "AUDIT_USER_ID", kvalue, null);
}

/**
 * 更新一个对象Leave到数据库中
 * <param name="leave">需要更新的Leave</param>
 */
public int leaveUpdate(Leave leave) throws SQLException, DbException {
	return this.leaveUpdate(leave, "");
}

/**
 * 更新一个对象Leave到数据库中
 * <param name="leave">需要更新的Leave</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int leaveUpdate(Leave leave, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().leaveUpdate(leave, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + leave.getWorkFlowId());
	this.operatesLogSimpleAdd("T_LEAVE", "更新", "WORK_FLOW_ID", kvalue, leave);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
public Leave leaveSelectByWorkFlowId(String AWorkFlowId) throws SQLException, DbException {
	return this.getDao().leaveSelectByWorkFlowId(AWorkFlowId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ARequestUserId">申请人</param>
 */
public List<Leave> leaveSelectObjectsByRequestUserId(int ARequestUserId) throws SQLException, DbException {
	return this.getDao().leaveSelectObjectsByRequestUserId(ARequestUserId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AAuditUserId">最后审核人</param>
 */
public List<Leave> leaveSelectObjectsByAuditUserId(Integer AAuditUserId) throws SQLException, DbException {
	return this.getDao().leaveSelectObjectsByAuditUserId(AAuditUserId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
public List<Leave> leaveSelectObjectsByWorkFlowId(String AWorkFlowId) throws SQLException, DbException {
	return this.getDao().leaveSelectObjectsByWorkFlowId(AWorkFlowId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Leave> leaveSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().leaveSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Leave> leaveSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().leaveSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Leave> leaveSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().leaveSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Leave> leaveSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().leaveSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Leave leaveSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Leave> list = this.leaveSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Leave.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Leave> leaveSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.leaveSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Leave> leaveSelectObjects() throws SQLException, DbException {
	return this.leaveSelectObjects("");
}

/**
 * @return 查询结果
 */
public Leave leaveSelectSingleObject() throws SQLException, DbException {
	return this.leaveSelectSingleObject("");
}

/**
 * <param name="leaveQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Leave> leaveSelectObjects(ConditionQuery leaveQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = leaveQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.leaveSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="leaveQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Leave> leaveSelectObjects(ConditionQuery leaveQueryCondition) throws SQLException, DbException {
	String sql = leaveQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.leaveSelectObjects(sql);
}

/**
 * <param name="leaveQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Leave leaveSelectSingleObject(ConditionQuery leaveQueryCondition) throws SQLException, DbException {
	List<Leave> list = this.leaveSelectObjects(leaveQueryCondition);
	return common.util.ListUtil.getFirstItem(Leave.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Leave> List<T> leaveSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().leaveSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Leave> List<T> leaveSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().leaveSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Leave> T leaveSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.leaveSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Leave> List<T> leaveSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.leaveSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Leave> List<T> leaveSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.leaveSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Leave> T leaveSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.leaveSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="leaveQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Leave> List<T> leaveSelectObjects(Class<T> type, ConditionQuery leaveQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = leaveQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.leaveSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="leaveQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Leave> List<T> leaveSelectObjects(Class<T> type, ConditionQuery leaveQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = leaveQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.leaveSelectObjects(type, sql);
}

/**
 * <param name="leaveQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Leave> T leaveSelectSingleObject(Class<T> type, ConditionQuery leaveQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.leaveSelectObjects(type, leaveQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int leaveQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().leaveQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="leaveQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int leaveQuerySelectObjectsCount(ConditionQuery leaveQueryCondition) throws SQLException, DbException {
	String sql = leaveQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.leaveQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象IssueProjectModule到数据库中
 * <param name="issueProjectModule">需要插入的新对象</param>
 */
public void issueProjectModuleInsert(IssueProjectModule issueProjectModule) throws SQLException, DbException {
	this.getDao().issueProjectModuleInsert(issueProjectModule);
	String kvalue = "";
	kvalue = (kvalue + issueProjectModule.getIssueProjectModuleId());
	this.operatesLogSimpleAdd("T_ISSUE_PROJECT_MODULE", "插入", "ISSUE_PROJECT_MODULE_ID", kvalue, issueProjectModule);
}

/**
 * 从数据库中删除一个对象IssueProjectModule
 * <param name="AIssueProjectModuleId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void issueProjectModuleDeleteByIssueProjectModuleId(int AIssueProjectModuleId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_ISSUE_PROJECT_MODULE].[ISSUE_PROJECT_MODULE_ID] = ");
	sql = (sql + AIssueProjectModuleId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueSelectObjects((" inner join T_ISSUE_PROJECT_MODULE on [T_ISSUE_PROJECT_MODULE].[ISSUE_PROJECT_MOD" +
"ULE_ID] = [T_ISSUE].[ISSUE_PROJECT_MODULE_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT_MODULE", "T_ISSUE"));
	}
	this.getDao().issueProjectModuleDeleteByIssueProjectModuleId(AIssueProjectModuleId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AIssueProjectModuleId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ISSUE_PROJECT_MODULE", "删除", "ISSUE_PROJECT_MODULE_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象IssueProjectModule
 * <param name="AIssueProjectModuleId">标识</param>
 */
public void issueProjectModuleDeleteByIssueProjectModuleId(int AIssueProjectModuleId) throws SQLException, DbException {
	this.issueProjectModuleDeleteByIssueProjectModuleId(AIssueProjectModuleId, "");
}

/**
 * 从数据库中删除一个对象IssueProjectModule
 * <param name="AIssueProjectId">标识</param>
 * <param name="AModuleName">模块名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void issueProjectModuleDeleteByIssueProjectIdModuleName(int AIssueProjectId, String AModuleName, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_ISSUE_PROJECT_MODULE].[ISSUE_PROJECT_ID] = ");
	sql = (sql + AIssueProjectId);
	sql = (sql + " and ");
	sql = (sql + "[T_ISSUE_PROJECT_MODULE].[MODULE_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(AModuleName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueSelectObjects((" inner join T_ISSUE_PROJECT_MODULE on [T_ISSUE_PROJECT_MODULE].[ISSUE_PROJECT_MOD" +
"ULE_ID] = [T_ISSUE].[ISSUE_PROJECT_MODULE_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT_MODULE", "T_ISSUE"));
	}
	this.getDao().issueProjectModuleDeleteByIssueProjectIdModuleName(AIssueProjectId, AModuleName, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AIssueProjectId);
	kvalue = (kvalue + ",");
	kvalue = (kvalue + AModuleName);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ISSUE_PROJECT_MODULE", "删除", "ISSUE_PROJECT_ID,MODULE_NAME", kvalue, null);
}

/**
 * 从数据库中删除一个对象IssueProjectModule
 * <param name="AIssueProjectId">标识</param>
 * <param name="AModuleName">模块名称</param>
 */
public void issueProjectModuleDeleteByIssueProjectIdModuleName(int AIssueProjectId, String AModuleName) throws SQLException, DbException {
	this.issueProjectModuleDeleteByIssueProjectIdModuleName(AIssueProjectId, AModuleName, "");
}

/**
 * 从数据库中删除一批对象IssueProjectModule
 * <param name="AIssueProjectId">标识</param>
 */
public void issueProjectModuleDeleteListByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	if ((this.getDao().issueSelectObjects((" inner join T_ISSUE_PROJECT_MODULE on [T_ISSUE_PROJECT_MODULE].[ISSUE_PROJECT_MOD" +
"ULE_ID] = [T_ISSUE].[ISSUE_PROJECT_MODULE_ID] where [T_ISSUE_PROJECT_MODULE].[IS" +
"SUE_PROJECT_ID] = " + AIssueProjectId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PROJECT_MODULE", "T_ISSUE"));
	}
	this.getDao().issueProjectModuleDeleteListByIssueProjectId(AIssueProjectId);
	String kvalue = "";
	kvalue = (kvalue + AIssueProjectId);
	this.operatesLogSimpleAdd("T_ISSUE_PROJECT_MODULE", "删除", "ISSUE_PROJECT_ID", kvalue, null);
}

/**
 * 更新一个对象IssueProjectModule到数据库中
 * <param name="issueProjectModule">需要更新的IssueProjectModule</param>
 */
public int issueProjectModuleUpdate(IssueProjectModule issueProjectModule) throws SQLException, DbException {
	return this.issueProjectModuleUpdate(issueProjectModule, "");
}

/**
 * 更新一个对象IssueProjectModule到数据库中
 * <param name="issueProjectModule">需要更新的IssueProjectModule</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int issueProjectModuleUpdate(IssueProjectModule issueProjectModule, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueProjectModuleUpdate(issueProjectModule, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + issueProjectModule.getIssueProjectModuleId());
	this.operatesLogSimpleAdd("T_ISSUE_PROJECT_MODULE", "更新", "ISSUE_PROJECT_MODULE_ID", kvalue, issueProjectModule);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectModuleId">标识</param>
 */
public IssueProjectModule issueProjectModuleSelectByIssueProjectModuleId(int AIssueProjectModuleId) throws SQLException, DbException {
	return this.getDao().issueProjectModuleSelectByIssueProjectModuleId(AIssueProjectModuleId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectId">标识</param>
 * <param name="AModuleName">模块名称</param>
 */
public IssueProjectModule issueProjectModuleSelectByIssueProjectIdModuleName(int AIssueProjectId, String AModuleName) throws SQLException, DbException {
	return this.getDao().issueProjectModuleSelectByIssueProjectIdModuleName(AIssueProjectId, AModuleName);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectId">标识</param>
 */
public List<IssueProjectModule> issueProjectModuleSelectObjectsByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	return this.getDao().issueProjectModuleSelectObjectsByIssueProjectId(AIssueProjectId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueProjectModule> issueProjectModuleSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueProjectModuleSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<IssueProjectModule> issueProjectModuleSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().issueProjectModuleSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueProjectModule> issueProjectModuleSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueProjectModuleSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<IssueProjectModule> issueProjectModuleSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().issueProjectModuleSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public IssueProjectModule issueProjectModuleSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<IssueProjectModule> list = this.issueProjectModuleSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(IssueProjectModule.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueProjectModule> issueProjectModuleSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.issueProjectModuleSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<IssueProjectModule> issueProjectModuleSelectObjects() throws SQLException, DbException {
	return this.issueProjectModuleSelectObjects("");
}

/**
 * @return 查询结果
 */
public IssueProjectModule issueProjectModuleSelectSingleObject() throws SQLException, DbException {
	return this.issueProjectModuleSelectSingleObject("");
}

/**
 * <param name="issueProjectModuleQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueProjectModule> issueProjectModuleSelectObjects(ConditionQuery issueProjectModuleQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = issueProjectModuleQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueProjectModuleSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueProjectModuleQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<IssueProjectModule> issueProjectModuleSelectObjects(ConditionQuery issueProjectModuleQueryCondition) throws SQLException, DbException {
	String sql = issueProjectModuleQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueProjectModuleSelectObjects(sql);
}

/**
 * <param name="issueProjectModuleQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public IssueProjectModule issueProjectModuleSelectSingleObject(ConditionQuery issueProjectModuleQueryCondition) throws SQLException, DbException {
	List<IssueProjectModule> list = this.issueProjectModuleSelectObjects(issueProjectModuleQueryCondition);
	return common.util.ListUtil.getFirstItem(IssueProjectModule.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueProjectModule> List<T> issueProjectModuleSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueProjectModuleSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueProjectModule> List<T> issueProjectModuleSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueProjectModuleSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueProjectModule> T issueProjectModuleSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueProjectModuleSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueProjectModule> List<T> issueProjectModuleSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueProjectModuleSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends IssueProjectModule> List<T> issueProjectModuleSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueProjectModuleSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends IssueProjectModule> T issueProjectModuleSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueProjectModuleSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="issueProjectModuleQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueProjectModule> List<T> issueProjectModuleSelectObjects(Class<T> type, ConditionQuery issueProjectModuleQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueProjectModuleQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueProjectModuleSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueProjectModuleQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueProjectModule> List<T> issueProjectModuleSelectObjects(Class<T> type, ConditionQuery issueProjectModuleQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueProjectModuleQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueProjectModuleSelectObjects(type, sql);
}

/**
 * <param name="issueProjectModuleQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueProjectModule> T issueProjectModuleSelectSingleObject(Class<T> type, ConditionQuery issueProjectModuleQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueProjectModuleSelectObjects(type, issueProjectModuleQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int issueProjectModuleQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueProjectModuleQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="issueProjectModuleQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int issueProjectModuleQuerySelectObjectsCount(ConditionQuery issueProjectModuleQueryCondition) throws SQLException, DbException {
	String sql = issueProjectModuleQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueProjectModuleQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象IssuePriorities到数据库中
 * <param name="issuePriorities">需要插入的新对象</param>
 */
public void issuePrioritiesInsert(IssuePriorities issuePriorities) throws SQLException, DbException {
	this.getDao().issuePrioritiesInsert(issuePriorities);
	String kvalue = "";
	kvalue = (kvalue + issuePriorities.getPrioritiesId());
	this.operatesLogSimpleAdd("T_ISSUE_PRIORITIES", "插入", "PRIORITIES_ID", kvalue, issuePriorities);
}

/**
 * 从数据库中删除一个对象IssuePriorities
 * <param name="APrioritiesId">优先级别</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void issuePrioritiesDeleteByPrioritiesId(byte APrioritiesId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_ISSUE_PRIORITIES].[PRIORITIES_ID] = ");
	sql = (sql + APrioritiesId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueSelectObjects((" inner join T_ISSUE_PRIORITIES on [T_ISSUE_PRIORITIES].[PRIORITIES_ID] = [T_ISSUE" +
"].[PRIORITIES_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PRIORITIES", "T_ISSUE"));
	}
	this.getDao().issuePrioritiesDeleteByPrioritiesId(APrioritiesId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + APrioritiesId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ISSUE_PRIORITIES", "删除", "PRIORITIES_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象IssuePriorities
 * <param name="APrioritiesId">优先级别</param>
 */
public void issuePrioritiesDeleteByPrioritiesId(byte APrioritiesId) throws SQLException, DbException {
	this.issuePrioritiesDeleteByPrioritiesId(APrioritiesId, "");
}

/**
 * 从数据库中删除一个对象IssuePriorities
 * <param name="APrioritiesName">优先名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void issuePrioritiesDeleteByPrioritiesName(String APrioritiesName, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_ISSUE_PRIORITIES].[PRIORITIES_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(APrioritiesName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueSelectObjects((" inner join T_ISSUE_PRIORITIES on [T_ISSUE_PRIORITIES].[PRIORITIES_ID] = [T_ISSUE" +
"].[PRIORITIES_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_PRIORITIES", "T_ISSUE"));
	}
	this.getDao().issuePrioritiesDeleteByPrioritiesName(APrioritiesName, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + APrioritiesName);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ISSUE_PRIORITIES", "删除", "PRIORITIES_NAME", kvalue, null);
}

/**
 * 从数据库中删除一个对象IssuePriorities
 * <param name="APrioritiesName">优先名称</param>
 */
public void issuePrioritiesDeleteByPrioritiesName(String APrioritiesName) throws SQLException, DbException {
	this.issuePrioritiesDeleteByPrioritiesName(APrioritiesName, "");
}

/**
 * 更新一个对象IssuePriorities到数据库中
 * <param name="issuePriorities">需要更新的IssuePriorities</param>
 */
public int issuePrioritiesUpdate(IssuePriorities issuePriorities) throws SQLException, DbException {
	return this.issuePrioritiesUpdate(issuePriorities, "");
}

/**
 * 更新一个对象IssuePriorities到数据库中
 * <param name="issuePriorities">需要更新的IssuePriorities</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int issuePrioritiesUpdate(IssuePriorities issuePriorities, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issuePrioritiesUpdate(issuePriorities, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + issuePriorities.getPrioritiesId());
	this.operatesLogSimpleAdd("T_ISSUE_PRIORITIES", "更新", "PRIORITIES_ID", kvalue, issuePriorities);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APrioritiesId">优先级别</param>
 */
public IssuePriorities issuePrioritiesSelectByPrioritiesId(Byte APrioritiesId) throws SQLException, DbException {
	return this.getDao().issuePrioritiesSelectByPrioritiesId(APrioritiesId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APrioritiesName">优先名称</param>
 */
public IssuePriorities issuePrioritiesSelectByPrioritiesName(String APrioritiesName) throws SQLException, DbException {
	return this.getDao().issuePrioritiesSelectByPrioritiesName(APrioritiesName);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssuePriorities> issuePrioritiesSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issuePrioritiesSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<IssuePriorities> issuePrioritiesSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().issuePrioritiesSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssuePriorities> issuePrioritiesSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issuePrioritiesSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<IssuePriorities> issuePrioritiesSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().issuePrioritiesSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public IssuePriorities issuePrioritiesSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<IssuePriorities> list = this.issuePrioritiesSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(IssuePriorities.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssuePriorities> issuePrioritiesSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.issuePrioritiesSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<IssuePriorities> issuePrioritiesSelectObjects() throws SQLException, DbException {
	return this.issuePrioritiesSelectObjects("");
}

/**
 * @return 查询结果
 */
public IssuePriorities issuePrioritiesSelectSingleObject() throws SQLException, DbException {
	return this.issuePrioritiesSelectSingleObject("");
}

/**
 * <param name="issuePrioritiesQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssuePriorities> issuePrioritiesSelectObjects(ConditionQuery issuePrioritiesQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = issuePrioritiesQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issuePrioritiesSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issuePrioritiesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<IssuePriorities> issuePrioritiesSelectObjects(ConditionQuery issuePrioritiesQueryCondition) throws SQLException, DbException {
	String sql = issuePrioritiesQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issuePrioritiesSelectObjects(sql);
}

/**
 * <param name="issuePrioritiesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public IssuePriorities issuePrioritiesSelectSingleObject(ConditionQuery issuePrioritiesQueryCondition) throws SQLException, DbException {
	List<IssuePriorities> list = this.issuePrioritiesSelectObjects(issuePrioritiesQueryCondition);
	return common.util.ListUtil.getFirstItem(IssuePriorities.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssuePriorities> List<T> issuePrioritiesSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issuePrioritiesSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssuePriorities> List<T> issuePrioritiesSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issuePrioritiesSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssuePriorities> T issuePrioritiesSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issuePrioritiesSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssuePriorities> List<T> issuePrioritiesSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issuePrioritiesSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends IssuePriorities> List<T> issuePrioritiesSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issuePrioritiesSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends IssuePriorities> T issuePrioritiesSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issuePrioritiesSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="issuePrioritiesQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssuePriorities> List<T> issuePrioritiesSelectObjects(Class<T> type, ConditionQuery issuePrioritiesQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issuePrioritiesQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issuePrioritiesSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issuePrioritiesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssuePriorities> List<T> issuePrioritiesSelectObjects(Class<T> type, ConditionQuery issuePrioritiesQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issuePrioritiesQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issuePrioritiesSelectObjects(type, sql);
}

/**
 * <param name="issuePrioritiesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssuePriorities> T issuePrioritiesSelectSingleObject(Class<T> type, ConditionQuery issuePrioritiesQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issuePrioritiesSelectObjects(type, issuePrioritiesQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int issuePrioritiesQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issuePrioritiesQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="issuePrioritiesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int issuePrioritiesQuerySelectObjectsCount(ConditionQuery issuePrioritiesQueryCondition) throws SQLException, DbException {
	String sql = issuePrioritiesQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issuePrioritiesQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象FuncProject到数据库中
 * <param name="funcProject">需要插入的新对象</param>
 */
public void funcProjectInsert(FuncProject funcProject) throws SQLException, DbException {
	this.getDao().funcProjectInsert(funcProject);
	String kvalue = "";
	kvalue = (kvalue + funcProject.getFuncProjectId());
	this.operatesLogSimpleAdd("T_FUNC_PROJECT", "插入", "FUNC_PROJECT_ID", kvalue, funcProject);
}

/**
 * 从数据库中删除一个对象FuncProject
 * <param name="AFuncProjectId">函数项目标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void funcProjectDeleteByFuncProjectId(int AFuncProjectId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_FUNC_PROJECT].[FUNC_PROJECT_ID] = ");
	sql = (sql + AFuncProjectId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().funcProcedureSelectObjects((" inner join T_FUNC_PROJECT on [T_FUNC_PROJECT].[FUNC_PROJECT_ID] = [T_FUNC_PROCED" +
"URE].[FUNC_PROJECT_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_FUNC_PROJECT", "T_FUNC_PROCEDURE"));
	}
	this.getDao().funcProjectDeleteByFuncProjectId(AFuncProjectId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AFuncProjectId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_FUNC_PROJECT", "删除", "FUNC_PROJECT_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象FuncProject
 * <param name="AFuncProjectId">函数项目标识</param>
 */
public void funcProjectDeleteByFuncProjectId(int AFuncProjectId) throws SQLException, DbException {
	this.funcProjectDeleteByFuncProjectId(AFuncProjectId, "");
}

/**
 * 更新一个对象FuncProject到数据库中
 * <param name="funcProject">需要更新的FuncProject</param>
 */
public int funcProjectUpdate(FuncProject funcProject) throws SQLException, DbException {
	return this.funcProjectUpdate(funcProject, "");
}

/**
 * 更新一个对象FuncProject到数据库中
 * <param name="funcProject">需要更新的FuncProject</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int funcProjectUpdate(FuncProject funcProject, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().funcProjectUpdate(funcProject, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + funcProject.getFuncProjectId());
	this.operatesLogSimpleAdd("T_FUNC_PROJECT", "更新", "FUNC_PROJECT_ID", kvalue, funcProject);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AFuncProjectId">函数项目标识</param>
 */
public FuncProject funcProjectSelectByFuncProjectId(int AFuncProjectId) throws SQLException, DbException {
	return this.getDao().funcProjectSelectByFuncProjectId(AFuncProjectId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<FuncProject> funcProjectSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().funcProjectSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<FuncProject> funcProjectSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().funcProjectSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<FuncProject> funcProjectSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().funcProjectSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<FuncProject> funcProjectSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().funcProjectSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public FuncProject funcProjectSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<FuncProject> list = this.funcProjectSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(FuncProject.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<FuncProject> funcProjectSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.funcProjectSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<FuncProject> funcProjectSelectObjects() throws SQLException, DbException {
	return this.funcProjectSelectObjects("");
}

/**
 * @return 查询结果
 */
public FuncProject funcProjectSelectSingleObject() throws SQLException, DbException {
	return this.funcProjectSelectSingleObject("");
}

/**
 * <param name="funcProjectQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<FuncProject> funcProjectSelectObjects(ConditionQuery funcProjectQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = funcProjectQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.funcProjectSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="funcProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<FuncProject> funcProjectSelectObjects(ConditionQuery funcProjectQueryCondition) throws SQLException, DbException {
	String sql = funcProjectQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.funcProjectSelectObjects(sql);
}

/**
 * <param name="funcProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public FuncProject funcProjectSelectSingleObject(ConditionQuery funcProjectQueryCondition) throws SQLException, DbException {
	List<FuncProject> list = this.funcProjectSelectObjects(funcProjectQueryCondition);
	return common.util.ListUtil.getFirstItem(FuncProject.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends FuncProject> List<T> funcProjectSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().funcProjectSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends FuncProject> List<T> funcProjectSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().funcProjectSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends FuncProject> T funcProjectSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.funcProjectSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends FuncProject> List<T> funcProjectSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.funcProjectSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends FuncProject> List<T> funcProjectSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.funcProjectSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends FuncProject> T funcProjectSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.funcProjectSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="funcProjectQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends FuncProject> List<T> funcProjectSelectObjects(Class<T> type, ConditionQuery funcProjectQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = funcProjectQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.funcProjectSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="funcProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends FuncProject> List<T> funcProjectSelectObjects(Class<T> type, ConditionQuery funcProjectQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = funcProjectQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.funcProjectSelectObjects(type, sql);
}

/**
 * <param name="funcProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends FuncProject> T funcProjectSelectSingleObject(Class<T> type, ConditionQuery funcProjectQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.funcProjectSelectObjects(type, funcProjectQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int funcProjectQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().funcProjectQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="funcProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int funcProjectQuerySelectObjectsCount(ConditionQuery funcProjectQueryCondition) throws SQLException, DbException {
	String sql = funcProjectQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.funcProjectQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象IssueStatus到数据库中
 * <param name="issueStatus">需要插入的新对象</param>
 */
public void issueStatusInsert(IssueStatus issueStatus) throws SQLException, DbException {
	this.getDao().issueStatusInsert(issueStatus);
	String kvalue = "";
	kvalue = (kvalue + issueStatus.getStatusId());
	this.operatesLogSimpleAdd("T_ISSUE_STATUS", "插入", "STATUS_ID", kvalue, issueStatus);
}

/**
 * 从数据库中删除一个对象IssueStatus
 * <param name="AStatusId">状态标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void issueStatusDeleteByStatusId(int AStatusId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_ISSUE_STATUS].[STATUS_ID] = ");
	sql = (sql + AStatusId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueStateChangeDefineSelectObjects((" inner join T_ISSUE_STATUS on [T_ISSUE_STATUS].[STATUS_ID] = [T_ISSUE_STATE_CHANG" +
"E_DEFINE].[CURRENT_STATUS_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_STATUS", "T_ISSUE_STATE_CHANGE_DEFINE"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_STATUS].[STATUS_ID] = ");
	sql = (sql + AStatusId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueSelectObjects((" inner join T_ISSUE_STATUS on [T_ISSUE_STATUS].[STATUS_ID] = [T_ISSUE].[STATUS_ID" +
"] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_STATUS", "T_ISSUE"));
	}
	this.getDao().issueStatusDeleteByStatusId(AStatusId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AStatusId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ISSUE_STATUS", "删除", "STATUS_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象IssueStatus
 * <param name="AStatusId">状态标识</param>
 */
public void issueStatusDeleteByStatusId(int AStatusId) throws SQLException, DbException {
	this.issueStatusDeleteByStatusId(AStatusId, "");
}

/**
 * 从数据库中删除一个对象IssueStatus
 * <param name="AStatusName">状态名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void issueStatusDeleteByStatusName(String AStatusName, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_ISSUE_STATUS].[STATUS_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(AStatusName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueStateChangeDefineSelectObjects((" inner join T_ISSUE_STATUS on [T_ISSUE_STATUS].[STATUS_ID] = [T_ISSUE_STATE_CHANG" +
"E_DEFINE].[CURRENT_STATUS_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_STATUS", "T_ISSUE_STATE_CHANGE_DEFINE"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_STATUS].[STATUS_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(AStatusName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueSelectObjects((" inner join T_ISSUE_STATUS on [T_ISSUE_STATUS].[STATUS_ID] = [T_ISSUE].[STATUS_ID" +
"] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_STATUS", "T_ISSUE"));
	}
	this.getDao().issueStatusDeleteByStatusName(AStatusName, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AStatusName);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ISSUE_STATUS", "删除", "STATUS_NAME", kvalue, null);
}

/**
 * 从数据库中删除一个对象IssueStatus
 * <param name="AStatusName">状态名称</param>
 */
public void issueStatusDeleteByStatusName(String AStatusName) throws SQLException, DbException {
	this.issueStatusDeleteByStatusName(AStatusName, "");
}

/**
 * 更新一个对象IssueStatus到数据库中
 * <param name="issueStatus">需要更新的IssueStatus</param>
 */
public int issueStatusUpdate(IssueStatus issueStatus) throws SQLException, DbException {
	return this.issueStatusUpdate(issueStatus, "");
}

/**
 * 更新一个对象IssueStatus到数据库中
 * <param name="issueStatus">需要更新的IssueStatus</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int issueStatusUpdate(IssueStatus issueStatus, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueStatusUpdate(issueStatus, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + issueStatus.getStatusId());
	this.operatesLogSimpleAdd("T_ISSUE_STATUS", "更新", "STATUS_ID", kvalue, issueStatus);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AStatusId">状态标识</param>
 */
public IssueStatus issueStatusSelectByStatusId(int AStatusId) throws SQLException, DbException {
	return this.getDao().issueStatusSelectByStatusId(AStatusId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AStatusName">状态名称</param>
 */
public IssueStatus issueStatusSelectByStatusName(String AStatusName) throws SQLException, DbException {
	return this.getDao().issueStatusSelectByStatusName(AStatusName);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueStatus> issueStatusSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueStatusSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<IssueStatus> issueStatusSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().issueStatusSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueStatus> issueStatusSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueStatusSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<IssueStatus> issueStatusSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().issueStatusSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public IssueStatus issueStatusSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<IssueStatus> list = this.issueStatusSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(IssueStatus.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueStatus> issueStatusSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.issueStatusSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<IssueStatus> issueStatusSelectObjects() throws SQLException, DbException {
	return this.issueStatusSelectObjects("");
}

/**
 * @return 查询结果
 */
public IssueStatus issueStatusSelectSingleObject() throws SQLException, DbException {
	return this.issueStatusSelectSingleObject("");
}

/**
 * <param name="issueStatusQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueStatus> issueStatusSelectObjects(ConditionQuery issueStatusQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = issueStatusQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueStatusSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueStatusQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<IssueStatus> issueStatusSelectObjects(ConditionQuery issueStatusQueryCondition) throws SQLException, DbException {
	String sql = issueStatusQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueStatusSelectObjects(sql);
}

/**
 * <param name="issueStatusQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public IssueStatus issueStatusSelectSingleObject(ConditionQuery issueStatusQueryCondition) throws SQLException, DbException {
	List<IssueStatus> list = this.issueStatusSelectObjects(issueStatusQueryCondition);
	return common.util.ListUtil.getFirstItem(IssueStatus.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueStatus> List<T> issueStatusSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueStatusSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueStatus> List<T> issueStatusSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueStatusSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueStatus> T issueStatusSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueStatusSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueStatus> List<T> issueStatusSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueStatusSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends IssueStatus> List<T> issueStatusSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueStatusSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends IssueStatus> T issueStatusSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueStatusSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="issueStatusQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueStatus> List<T> issueStatusSelectObjects(Class<T> type, ConditionQuery issueStatusQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueStatusQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueStatusSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueStatusQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueStatus> List<T> issueStatusSelectObjects(Class<T> type, ConditionQuery issueStatusQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueStatusQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueStatusSelectObjects(type, sql);
}

/**
 * <param name="issueStatusQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueStatus> T issueStatusSelectSingleObject(Class<T> type, ConditionQuery issueStatusQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueStatusSelectObjects(type, issueStatusQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int issueStatusQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueStatusQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="issueStatusQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int issueStatusQuerySelectObjectsCount(ConditionQuery issueStatusQueryCondition) throws SQLException, DbException {
	String sql = issueStatusQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueStatusQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象TaskUser到数据库中
 * <param name="taskUser">需要插入的新对象</param>
 */
public void taskUserInsert(TaskUser taskUser) throws SQLException, DbException {
	this.getDao().taskUserInsert(taskUser);
	String kvalue = "";
	kvalue = (kvalue + taskUser.getTaskUserId());
	this.operatesLogSimpleAdd("T_TASK_USER", "插入", "TASK_USER_ID", kvalue, taskUser);
}

/**
 * 从数据库中删除一个对象TaskUser
 * <param name="ATaskUserId">任务用户ID</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void taskUserDeleteByTaskUserId(int ATaskUserId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().taskUserDeleteByTaskUserId(ATaskUserId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ATaskUserId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_TASK_USER", "删除", "TASK_USER_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象TaskUser
 * <param name="ATaskUserId">任务用户ID</param>
 */
public void taskUserDeleteByTaskUserId(int ATaskUserId) throws SQLException, DbException {
	this.taskUserDeleteByTaskUserId(ATaskUserId, "");
}

/**
 * 从数据库中删除一批对象TaskUser
 * <param name="ATaskId">任务代号</param>
 */
public void taskUserDeleteListByTaskId(int ATaskId) throws SQLException, DbException {
	this.getDao().taskUserDeleteListByTaskId(ATaskId);
	String kvalue = "";
	kvalue = (kvalue + ATaskId);
	this.operatesLogSimpleAdd("T_TASK_USER", "删除", "TASK_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象TaskUser
 * <param name="AUserId">用户代号</param>
 */
public void taskUserDeleteListByUserId(int AUserId) throws SQLException, DbException {
	this.getDao().taskUserDeleteListByUserId(AUserId);
	String kvalue = "";
	kvalue = (kvalue + AUserId);
	this.operatesLogSimpleAdd("T_TASK_USER", "删除", "USER_ID", kvalue, null);
}

/**
 * 更新一个对象TaskUser到数据库中
 * <param name="taskUser">需要更新的TaskUser</param>
 */
public int taskUserUpdate(TaskUser taskUser) throws SQLException, DbException {
	return this.taskUserUpdate(taskUser, "");
}

/**
 * 更新一个对象TaskUser到数据库中
 * <param name="taskUser">需要更新的TaskUser</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int taskUserUpdate(TaskUser taskUser, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().taskUserUpdate(taskUser, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + taskUser.getTaskUserId());
	this.operatesLogSimpleAdd("T_TASK_USER", "更新", "TASK_USER_ID", kvalue, taskUser);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATaskUserId">任务用户ID</param>
 */
public TaskUser taskUserSelectByTaskUserId(int ATaskUserId) throws SQLException, DbException {
	return this.getDao().taskUserSelectByTaskUserId(ATaskUserId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskId">任务代号</param>
 */
public List<TaskUser> taskUserSelectObjectsByTaskId(int ATaskId) throws SQLException, DbException {
	return this.getDao().taskUserSelectObjectsByTaskId(ATaskId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AUserId">用户代号</param>
 */
public List<TaskUser> taskUserSelectObjectsByUserId(int AUserId) throws SQLException, DbException {
	return this.getDao().taskUserSelectObjectsByUserId(AUserId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TaskUser> taskUserSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().taskUserSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<TaskUser> taskUserSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().taskUserSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TaskUser> taskUserSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().taskUserSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<TaskUser> taskUserSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().taskUserSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public TaskUser taskUserSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<TaskUser> list = this.taskUserSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(TaskUser.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TaskUser> taskUserSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.taskUserSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<TaskUser> taskUserSelectObjects() throws SQLException, DbException {
	return this.taskUserSelectObjects("");
}

/**
 * @return 查询结果
 */
public TaskUser taskUserSelectSingleObject() throws SQLException, DbException {
	return this.taskUserSelectSingleObject("");
}

/**
 * <param name="taskUserQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TaskUser> taskUserSelectObjects(ConditionQuery taskUserQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = taskUserQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.taskUserSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="taskUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<TaskUser> taskUserSelectObjects(ConditionQuery taskUserQueryCondition) throws SQLException, DbException {
	String sql = taskUserQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.taskUserSelectObjects(sql);
}

/**
 * <param name="taskUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public TaskUser taskUserSelectSingleObject(ConditionQuery taskUserQueryCondition) throws SQLException, DbException {
	List<TaskUser> list = this.taskUserSelectObjects(taskUserQueryCondition);
	return common.util.ListUtil.getFirstItem(TaskUser.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TaskUser> List<T> taskUserSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().taskUserSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends TaskUser> List<T> taskUserSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().taskUserSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends TaskUser> T taskUserSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.taskUserSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TaskUser> List<T> taskUserSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.taskUserSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends TaskUser> List<T> taskUserSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.taskUserSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends TaskUser> T taskUserSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.taskUserSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="taskUserQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TaskUser> List<T> taskUserSelectObjects(Class<T> type, ConditionQuery taskUserQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = taskUserQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.taskUserSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="taskUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends TaskUser> List<T> taskUserSelectObjects(Class<T> type, ConditionQuery taskUserQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = taskUserQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.taskUserSelectObjects(type, sql);
}

/**
 * <param name="taskUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends TaskUser> T taskUserSelectSingleObject(Class<T> type, ConditionQuery taskUserQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.taskUserSelectObjects(type, taskUserQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int taskUserQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().taskUserQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="taskUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int taskUserQuerySelectObjectsCount(ConditionQuery taskUserQueryCondition) throws SQLException, DbException {
	String sql = taskUserQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.taskUserQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象IssueRoles到数据库中
 * <param name="issueRoles">需要插入的新对象</param>
 */
public void issueRolesInsert(IssueRoles issueRoles) throws SQLException, DbException {
	this.getDao().issueRolesInsert(issueRoles);
	String kvalue = "";
	kvalue = (kvalue + issueRoles.getRoleId());
	this.operatesLogSimpleAdd("T_ISSUE_ROLES", "插入", "ROLE_ID", kvalue, issueRoles);
}

/**
 * 从数据库中删除一个对象IssueRoles
 * <param name="ARoleId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void issueRolesDeleteByRoleId(int ARoleId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_ISSUE_ROLES].[ROLE_ID] = ");
	sql = (sql + ARoleId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueProjectUserPrivilegesSelectObjects((" inner join T_ISSUE_ROLES on [T_ISSUE_ROLES].[ROLE_ID] = [T_ISSUE_PROJECT_USER_PR" +
"IVILEGES].[ROLE_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_ROLES", "T_ISSUE_PROJECT_USER_PRIVILEGES"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_ROLES].[ROLE_ID] = ");
	sql = (sql + ARoleId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueRoleDefaultQuerySelectObjects((" inner join T_ISSUE_ROLES on [T_ISSUE_ROLES].[ROLE_ID] = [T_ISSUE_ROLE_DEFAULT_QU" +
"ERY].[ROLE_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_ROLES", "T_ISSUE_ROLE_DEFAULT_QUERY"));
	}
	this.getDao().issueRolesDeleteByRoleId(ARoleId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ARoleId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ISSUE_ROLES", "删除", "ROLE_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象IssueRoles
 * <param name="ARoleId">标识</param>
 */
public void issueRolesDeleteByRoleId(int ARoleId) throws SQLException, DbException {
	this.issueRolesDeleteByRoleId(ARoleId, "");
}

/**
 * 从数据库中删除一个对象IssueRoles
 * <param name="ARoleName">角色名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void issueRolesDeleteByRoleName(String ARoleName, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_ISSUE_ROLES].[ROLE_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(ARoleName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueProjectUserPrivilegesSelectObjects((" inner join T_ISSUE_ROLES on [T_ISSUE_ROLES].[ROLE_ID] = [T_ISSUE_PROJECT_USER_PR" +
"IVILEGES].[ROLE_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_ROLES", "T_ISSUE_PROJECT_USER_PRIVILEGES"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_ROLES].[ROLE_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(ARoleName.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueRoleDefaultQuerySelectObjects((" inner join T_ISSUE_ROLES on [T_ISSUE_ROLES].[ROLE_ID] = [T_ISSUE_ROLE_DEFAULT_QU" +
"ERY].[ROLE_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_ROLES", "T_ISSUE_ROLE_DEFAULT_QUERY"));
	}
	this.getDao().issueRolesDeleteByRoleName(ARoleName, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ARoleName);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ISSUE_ROLES", "删除", "ROLE_NAME", kvalue, null);
}

/**
 * 从数据库中删除一个对象IssueRoles
 * <param name="ARoleName">角色名称</param>
 */
public void issueRolesDeleteByRoleName(String ARoleName) throws SQLException, DbException {
	this.issueRolesDeleteByRoleName(ARoleName, "");
}

/**
 * 更新一个对象IssueRoles到数据库中
 * <param name="issueRoles">需要更新的IssueRoles</param>
 */
public int issueRolesUpdate(IssueRoles issueRoles) throws SQLException, DbException {
	return this.issueRolesUpdate(issueRoles, "");
}

/**
 * 更新一个对象IssueRoles到数据库中
 * <param name="issueRoles">需要更新的IssueRoles</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int issueRolesUpdate(IssueRoles issueRoles, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueRolesUpdate(issueRoles, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + issueRoles.getRoleId());
	this.operatesLogSimpleAdd("T_ISSUE_ROLES", "更新", "ROLE_ID", kvalue, issueRoles);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ARoleId">标识</param>
 */
public IssueRoles issueRolesSelectByRoleId(int ARoleId) throws SQLException, DbException {
	return this.getDao().issueRolesSelectByRoleId(ARoleId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ARoleName">角色名称</param>
 */
public IssueRoles issueRolesSelectByRoleName(String ARoleName) throws SQLException, DbException {
	return this.getDao().issueRolesSelectByRoleName(ARoleName);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueRoles> issueRolesSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueRolesSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<IssueRoles> issueRolesSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().issueRolesSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueRoles> issueRolesSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueRolesSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<IssueRoles> issueRolesSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().issueRolesSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public IssueRoles issueRolesSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<IssueRoles> list = this.issueRolesSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(IssueRoles.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueRoles> issueRolesSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.issueRolesSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<IssueRoles> issueRolesSelectObjects() throws SQLException, DbException {
	return this.issueRolesSelectObjects("");
}

/**
 * @return 查询结果
 */
public IssueRoles issueRolesSelectSingleObject() throws SQLException, DbException {
	return this.issueRolesSelectSingleObject("");
}

/**
 * <param name="issueRolesQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueRoles> issueRolesSelectObjects(ConditionQuery issueRolesQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = issueRolesQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueRolesSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueRolesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<IssueRoles> issueRolesSelectObjects(ConditionQuery issueRolesQueryCondition) throws SQLException, DbException {
	String sql = issueRolesQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueRolesSelectObjects(sql);
}

/**
 * <param name="issueRolesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public IssueRoles issueRolesSelectSingleObject(ConditionQuery issueRolesQueryCondition) throws SQLException, DbException {
	List<IssueRoles> list = this.issueRolesSelectObjects(issueRolesQueryCondition);
	return common.util.ListUtil.getFirstItem(IssueRoles.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueRoles> List<T> issueRolesSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueRolesSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueRoles> List<T> issueRolesSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueRolesSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueRoles> T issueRolesSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueRolesSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueRoles> List<T> issueRolesSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueRolesSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends IssueRoles> List<T> issueRolesSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueRolesSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends IssueRoles> T issueRolesSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueRolesSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="issueRolesQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueRoles> List<T> issueRolesSelectObjects(Class<T> type, ConditionQuery issueRolesQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueRolesQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueRolesSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueRolesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueRoles> List<T> issueRolesSelectObjects(Class<T> type, ConditionQuery issueRolesQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueRolesQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueRolesSelectObjects(type, sql);
}

/**
 * <param name="issueRolesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueRoles> T issueRolesSelectSingleObject(Class<T> type, ConditionQuery issueRolesQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueRolesSelectObjects(type, issueRolesQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int issueRolesQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueRolesQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="issueRolesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int issueRolesQuerySelectObjectsCount(ConditionQuery issueRolesQueryCondition) throws SQLException, DbException {
	String sql = issueRolesQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueRolesQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象IssueProjectUserPrivileges到数据库中
 * <param name="issueProjectUserPrivileges">需要插入的新对象</param>
 */
public void issueProjectUserPrivilegesInsert(IssueProjectUserPrivileges issueProjectUserPrivileges) throws SQLException, DbException {
	this.getDao().issueProjectUserPrivilegesInsert(issueProjectUserPrivileges);
	String kvalue = "";
	kvalue = (kvalue + issueProjectUserPrivileges.getIssueProjectId());
	kvalue = (kvalue + ",");
	kvalue = (kvalue + issueProjectUserPrivileges.getIssueUserId());
	this.operatesLogSimpleAdd("T_ISSUE_PROJECT_USER_PRIVILEGES", "插入", "ISSUE_PROJECT_ID,ISSUE_USER_ID", kvalue, issueProjectUserPrivileges);
}

/**
 * 从数据库中删除一个对象IssueProjectUserPrivileges
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void issueProjectUserPrivilegesDeleteByIssueProjectIdIssueUserId(int AIssueProjectId, int AIssueUserId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().issueProjectUserPrivilegesDeleteByIssueProjectIdIssueUserId(AIssueProjectId, AIssueUserId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AIssueProjectId);
	kvalue = (kvalue + ",");
	kvalue = (kvalue + AIssueUserId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ISSUE_PROJECT_USER_PRIVILEGES", "删除", "ISSUE_PROJECT_ID,ISSUE_USER_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象IssueProjectUserPrivileges
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 */
public void issueProjectUserPrivilegesDeleteByIssueProjectIdIssueUserId(int AIssueProjectId, int AIssueUserId) throws SQLException, DbException {
	this.issueProjectUserPrivilegesDeleteByIssueProjectIdIssueUserId(AIssueProjectId, AIssueUserId, "");
}

/**
 * 从数据库中删除一批对象IssueProjectUserPrivileges
 * <param name="AIssueProjectId">标识</param>
 */
public void issueProjectUserPrivilegesDeleteListByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	this.getDao().issueProjectUserPrivilegesDeleteListByIssueProjectId(AIssueProjectId);
	String kvalue = "";
	kvalue = (kvalue + AIssueProjectId);
	this.operatesLogSimpleAdd("T_ISSUE_PROJECT_USER_PRIVILEGES", "删除", "ISSUE_PROJECT_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象IssueProjectUserPrivileges
 * <param name="ARoleId">标识</param>
 */
public void issueProjectUserPrivilegesDeleteListByRoleId(int ARoleId) throws SQLException, DbException {
	this.getDao().issueProjectUserPrivilegesDeleteListByRoleId(ARoleId);
	String kvalue = "";
	kvalue = (kvalue + ARoleId);
	this.operatesLogSimpleAdd("T_ISSUE_PROJECT_USER_PRIVILEGES", "删除", "ROLE_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象IssueProjectUserPrivileges
 * <param name="AIssueUserId">用户标识</param>
 */
public void issueProjectUserPrivilegesDeleteListByIssueUserId(int AIssueUserId) throws SQLException, DbException {
	this.getDao().issueProjectUserPrivilegesDeleteListByIssueUserId(AIssueUserId);
	String kvalue = "";
	kvalue = (kvalue + AIssueUserId);
	this.operatesLogSimpleAdd("T_ISSUE_PROJECT_USER_PRIVILEGES", "删除", "ISSUE_USER_ID", kvalue, null);
}

/**
 * 更新一个对象IssueProjectUserPrivileges到数据库中
 * <param name="issueProjectUserPrivileges">需要更新的IssueProjectUserPrivileges</param>
 */
public int issueProjectUserPrivilegesUpdate(IssueProjectUserPrivileges issueProjectUserPrivileges) throws SQLException, DbException {
	return this.issueProjectUserPrivilegesUpdate(issueProjectUserPrivileges, "");
}

/**
 * 更新一个对象IssueProjectUserPrivileges到数据库中
 * <param name="issueProjectUserPrivileges">需要更新的IssueProjectUserPrivileges</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int issueProjectUserPrivilegesUpdate(IssueProjectUserPrivileges issueProjectUserPrivileges, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueProjectUserPrivilegesUpdate(issueProjectUserPrivileges, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + issueProjectUserPrivileges.getIssueProjectId());
	kvalue = (kvalue + ",");
	kvalue = (kvalue + issueProjectUserPrivileges.getIssueUserId());
	this.operatesLogSimpleAdd("T_ISSUE_PROJECT_USER_PRIVILEGES", "更新", "ISSUE_PROJECT_ID,ISSUE_USER_ID", kvalue, issueProjectUserPrivileges);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 */
public IssueProjectUserPrivileges issueProjectUserPrivilegesSelectByIssueProjectIdIssueUserId(int AIssueProjectId, int AIssueUserId) throws SQLException, DbException {
	return this.getDao().issueProjectUserPrivilegesSelectByIssueProjectIdIssueUserId(AIssueProjectId, AIssueUserId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectId">标识</param>
 */
public List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjectsByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	return this.getDao().issueProjectUserPrivilegesSelectObjectsByIssueProjectId(AIssueProjectId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ARoleId">标识</param>
 */
public List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjectsByRoleId(int ARoleId) throws SQLException, DbException {
	return this.getDao().issueProjectUserPrivilegesSelectObjectsByRoleId(ARoleId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueUserId">用户标识</param>
 */
public List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjectsByIssueUserId(int AIssueUserId) throws SQLException, DbException {
	return this.getDao().issueProjectUserPrivilegesSelectObjectsByIssueUserId(AIssueUserId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueProjectUserPrivilegesSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().issueProjectUserPrivilegesSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueProjectUserPrivilegesSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().issueProjectUserPrivilegesSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public IssueProjectUserPrivileges issueProjectUserPrivilegesSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<IssueProjectUserPrivileges> list = this.issueProjectUserPrivilegesSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(IssueProjectUserPrivileges.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.issueProjectUserPrivilegesSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjects() throws SQLException, DbException {
	return this.issueProjectUserPrivilegesSelectObjects("");
}

/**
 * @return 查询结果
 */
public IssueProjectUserPrivileges issueProjectUserPrivilegesSelectSingleObject() throws SQLException, DbException {
	return this.issueProjectUserPrivilegesSelectSingleObject("");
}

/**
 * <param name="issueProjectUserPrivilegesQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjects(ConditionQuery issueProjectUserPrivilegesQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = issueProjectUserPrivilegesQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueProjectUserPrivilegesSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueProjectUserPrivilegesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjects(ConditionQuery issueProjectUserPrivilegesQueryCondition) throws SQLException, DbException {
	String sql = issueProjectUserPrivilegesQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueProjectUserPrivilegesSelectObjects(sql);
}

/**
 * <param name="issueProjectUserPrivilegesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public IssueProjectUserPrivileges issueProjectUserPrivilegesSelectSingleObject(ConditionQuery issueProjectUserPrivilegesQueryCondition) throws SQLException, DbException {
	List<IssueProjectUserPrivileges> list = this.issueProjectUserPrivilegesSelectObjects(issueProjectUserPrivilegesQueryCondition);
	return common.util.ListUtil.getFirstItem(IssueProjectUserPrivileges.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueProjectUserPrivileges> List<T> issueProjectUserPrivilegesSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueProjectUserPrivilegesSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueProjectUserPrivileges> List<T> issueProjectUserPrivilegesSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueProjectUserPrivilegesSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueProjectUserPrivileges> T issueProjectUserPrivilegesSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueProjectUserPrivilegesSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueProjectUserPrivileges> List<T> issueProjectUserPrivilegesSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueProjectUserPrivilegesSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends IssueProjectUserPrivileges> List<T> issueProjectUserPrivilegesSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueProjectUserPrivilegesSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends IssueProjectUserPrivileges> T issueProjectUserPrivilegesSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueProjectUserPrivilegesSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="issueProjectUserPrivilegesQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueProjectUserPrivileges> List<T> issueProjectUserPrivilegesSelectObjects(Class<T> type, ConditionQuery issueProjectUserPrivilegesQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueProjectUserPrivilegesQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueProjectUserPrivilegesSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueProjectUserPrivilegesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueProjectUserPrivileges> List<T> issueProjectUserPrivilegesSelectObjects(Class<T> type, ConditionQuery issueProjectUserPrivilegesQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueProjectUserPrivilegesQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueProjectUserPrivilegesSelectObjects(type, sql);
}

/**
 * <param name="issueProjectUserPrivilegesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueProjectUserPrivileges> T issueProjectUserPrivilegesSelectSingleObject(Class<T> type, ConditionQuery issueProjectUserPrivilegesQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueProjectUserPrivilegesSelectObjects(type, issueProjectUserPrivilegesQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int issueProjectUserPrivilegesQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueProjectUserPrivilegesQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="issueProjectUserPrivilegesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int issueProjectUserPrivilegesQuerySelectObjectsCount(ConditionQuery issueProjectUserPrivilegesQueryCondition) throws SQLException, DbException {
	String sql = issueProjectUserPrivilegesQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueProjectUserPrivilegesQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Task到数据库中
 * <param name="task">需要插入的新对象</param>
 */
public void taskInsert(Task task) throws SQLException, DbException {
	this.getDao().taskInsert(task);
	String kvalue = "";
	kvalue = (kvalue + task.getTaskId());
	this.operatesLogSimpleAdd("T_TASK", "插入", "TASK_ID", kvalue, task);
}

/**
 * 从数据库中删除一个对象Task
 * <param name="ATaskId">任务代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void taskDeleteByTaskId(int ATaskId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_TASK].[TASK_ID] = ");
	sql = (sql + ATaskId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().taskPreviousTaskSelectObjects((" inner join T_TASK on [T_TASK].[TASK_ID] = [T_TASK_PREVIOUS_TASK].[TASK_ID] where" +
" " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TASK", "T_TASK_PREVIOUS_TASK"));
	}
	sql = "";
	sql = (sql + "[T_TASK].[TASK_ID] = ");
	sql = (sql + ATaskId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().workLogRelationshipTaskSelectObjects((" inner join T_TASK on [T_TASK].[TASK_ID] = [T_WORK_LOG_RELATIONSHIP_TASK].[TASK_I" +
"D] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TASK", "T_WORK_LOG_RELATIONSHIP_TASK"));
	}
	sql = "";
	sql = (sql + "[T_TASK].[TASK_ID] = ");
	sql = (sql + ATaskId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().taskUserSelectObjects((" inner join T_TASK on [T_TASK].[TASK_ID] = [T_TASK_USER].[TASK_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TASK", "T_TASK_USER"));
	}
	this.getDao().taskDeleteByTaskId(ATaskId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ATaskId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_TASK", "删除", "TASK_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象Task
 * <param name="ATaskId">任务代号</param>
 */
public void taskDeleteByTaskId(int ATaskId) throws SQLException, DbException {
	this.taskDeleteByTaskId(ATaskId, "");
}

/**
 * 从数据库中删除一批对象Task
 * <param name="ATaskProjectId">任务工程代号</param>
 */
public void taskDeleteListByTaskProjectId(int ATaskProjectId) throws SQLException, DbException {
	if ((this.getDao().taskPreviousTaskSelectObjects((" inner join T_TASK on [T_TASK].[TASK_ID] = [T_TASK_PREVIOUS_TASK].[TASK_ID] where" +
" [T_TASK].[TASK_PROJECT_ID] = " + ATaskProjectId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TASK", "T_TASK_PREVIOUS_TASK"));
	}
	if ((this.getDao().workLogRelationshipTaskSelectObjects((" inner join T_TASK on [T_TASK].[TASK_ID] = [T_WORK_LOG_RELATIONSHIP_TASK].[TASK_I" +
"D] where [T_TASK].[TASK_PROJECT_ID] = " + ATaskProjectId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TASK", "T_WORK_LOG_RELATIONSHIP_TASK"));
	}
	if ((this.getDao().taskUserSelectObjects((" inner join T_TASK on [T_TASK].[TASK_ID] = [T_TASK_USER].[TASK_ID] where [T_TASK]" +
".[TASK_PROJECT_ID] = " + ATaskProjectId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TASK", "T_TASK_USER"));
	}
	this.getDao().taskDeleteListByTaskProjectId(ATaskProjectId);
	String kvalue = "";
	kvalue = (kvalue + ATaskProjectId);
	this.operatesLogSimpleAdd("T_TASK", "删除", "TASK_PROJECT_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象Task
 * <param name="ATaskParentId">父任务代号</param>
 */
public void taskDeleteListByTaskParentId(Integer ATaskParentId) throws SQLException, DbException {
	if ((this.getDao().taskPreviousTaskSelectObjects((" inner join T_TASK on [T_TASK].[TASK_ID] = [T_TASK_PREVIOUS_TASK].[TASK_ID] where" +
" [T_TASK].[TASK_PARENT_ID] = " + ATaskParentId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TASK", "T_TASK_PREVIOUS_TASK"));
	}
	if ((this.getDao().workLogRelationshipTaskSelectObjects((" inner join T_TASK on [T_TASK].[TASK_ID] = [T_WORK_LOG_RELATIONSHIP_TASK].[TASK_I" +
"D] where [T_TASK].[TASK_PARENT_ID] = " + ATaskParentId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TASK", "T_WORK_LOG_RELATIONSHIP_TASK"));
	}
	if ((this.getDao().taskUserSelectObjects((" inner join T_TASK on [T_TASK].[TASK_ID] = [T_TASK_USER].[TASK_ID] where [T_TASK]" +
".[TASK_PARENT_ID] = " + ATaskParentId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TASK", "T_TASK_USER"));
	}
	this.getDao().taskDeleteListByTaskParentId(ATaskParentId);
	String kvalue = "";
	kvalue = (kvalue + ATaskParentId);
	this.operatesLogSimpleAdd("T_TASK", "删除", "TASK_PARENT_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象Task
 * <param name="ATaskModifierId">任务修改者代号</param>
 */
public void taskDeleteListByTaskModifierId(int ATaskModifierId) throws SQLException, DbException {
	if ((this.getDao().taskPreviousTaskSelectObjects((" inner join T_TASK on [T_TASK].[TASK_ID] = [T_TASK_PREVIOUS_TASK].[TASK_ID] where" +
" [T_TASK].[TASK_MODIFIER_ID] = " + ATaskModifierId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TASK", "T_TASK_PREVIOUS_TASK"));
	}
	if ((this.getDao().workLogRelationshipTaskSelectObjects((" inner join T_TASK on [T_TASK].[TASK_ID] = [T_WORK_LOG_RELATIONSHIP_TASK].[TASK_I" +
"D] where [T_TASK].[TASK_MODIFIER_ID] = " + ATaskModifierId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TASK", "T_WORK_LOG_RELATIONSHIP_TASK"));
	}
	if ((this.getDao().taskUserSelectObjects((" inner join T_TASK on [T_TASK].[TASK_ID] = [T_TASK_USER].[TASK_ID] where [T_TASK]" +
".[TASK_MODIFIER_ID] = " + ATaskModifierId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TASK", "T_TASK_USER"));
	}
	this.getDao().taskDeleteListByTaskModifierId(ATaskModifierId);
	String kvalue = "";
	kvalue = (kvalue + ATaskModifierId);
	this.operatesLogSimpleAdd("T_TASK", "删除", "TASK_MODIFIER_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象Task
 * <param name="ATaskManagerId">任务管理员代号</param>
 */
public void taskDeleteListByTaskManagerId(int ATaskManagerId) throws SQLException, DbException {
	if ((this.getDao().taskPreviousTaskSelectObjects((" inner join T_TASK on [T_TASK].[TASK_ID] = [T_TASK_PREVIOUS_TASK].[TASK_ID] where" +
" [T_TASK].[TASK_MANAGER_ID] = " + ATaskManagerId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TASK", "T_TASK_PREVIOUS_TASK"));
	}
	if ((this.getDao().workLogRelationshipTaskSelectObjects((" inner join T_TASK on [T_TASK].[TASK_ID] = [T_WORK_LOG_RELATIONSHIP_TASK].[TASK_I" +
"D] where [T_TASK].[TASK_MANAGER_ID] = " + ATaskManagerId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TASK", "T_WORK_LOG_RELATIONSHIP_TASK"));
	}
	if ((this.getDao().taskUserSelectObjects((" inner join T_TASK on [T_TASK].[TASK_ID] = [T_TASK_USER].[TASK_ID] where [T_TASK]" +
".[TASK_MANAGER_ID] = " + ATaskManagerId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TASK", "T_TASK_USER"));
	}
	this.getDao().taskDeleteListByTaskManagerId(ATaskManagerId);
	String kvalue = "";
	kvalue = (kvalue + ATaskManagerId);
	this.operatesLogSimpleAdd("T_TASK", "删除", "TASK_MANAGER_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象Task
 * <param name="ATaskCreaterId">任务创建者代号</param>
 */
public void taskDeleteListByTaskCreaterId(int ATaskCreaterId) throws SQLException, DbException {
	if ((this.getDao().taskPreviousTaskSelectObjects((" inner join T_TASK on [T_TASK].[TASK_ID] = [T_TASK_PREVIOUS_TASK].[TASK_ID] where" +
" [T_TASK].[TASK_CREATER_ID] = " + ATaskCreaterId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TASK", "T_TASK_PREVIOUS_TASK"));
	}
	if ((this.getDao().workLogRelationshipTaskSelectObjects((" inner join T_TASK on [T_TASK].[TASK_ID] = [T_WORK_LOG_RELATIONSHIP_TASK].[TASK_I" +
"D] where [T_TASK].[TASK_CREATER_ID] = " + ATaskCreaterId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TASK", "T_WORK_LOG_RELATIONSHIP_TASK"));
	}
	if ((this.getDao().taskUserSelectObjects((" inner join T_TASK on [T_TASK].[TASK_ID] = [T_TASK_USER].[TASK_ID] where [T_TASK]" +
".[TASK_CREATER_ID] = " + ATaskCreaterId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TASK", "T_TASK_USER"));
	}
	this.getDao().taskDeleteListByTaskCreaterId(ATaskCreaterId);
	String kvalue = "";
	kvalue = (kvalue + ATaskCreaterId);
	this.operatesLogSimpleAdd("T_TASK", "删除", "TASK_CREATER_ID", kvalue, null);
}

/**
 * 更新一个对象Task到数据库中
 * <param name="task">需要更新的Task</param>
 */
public int taskUpdate(Task task) throws SQLException, DbException {
	return this.taskUpdate(task, "");
}

/**
 * 更新一个对象Task到数据库中
 * <param name="task">需要更新的Task</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int taskUpdate(Task task, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().taskUpdate(task, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + task.getTaskId());
	this.operatesLogSimpleAdd("T_TASK", "更新", "TASK_ID", kvalue, task);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATaskId">任务代号</param>
 */
public Task taskSelectByTaskId(int ATaskId) throws SQLException, DbException {
	return this.getDao().taskSelectByTaskId(ATaskId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskProjectId">任务工程代号</param>
 */
public List<Task> taskSelectObjectsByTaskProjectId(int ATaskProjectId) throws SQLException, DbException {
	return this.getDao().taskSelectObjectsByTaskProjectId(ATaskProjectId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskParentId">父任务代号</param>
 */
public List<Task> taskSelectObjectsByTaskParentId(Integer ATaskParentId) throws SQLException, DbException {
	return this.getDao().taskSelectObjectsByTaskParentId(ATaskParentId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskModifierId">任务修改者代号</param>
 */
public List<Task> taskSelectObjectsByTaskModifierId(int ATaskModifierId) throws SQLException, DbException {
	return this.getDao().taskSelectObjectsByTaskModifierId(ATaskModifierId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskManagerId">任务管理员代号</param>
 */
public List<Task> taskSelectObjectsByTaskManagerId(int ATaskManagerId) throws SQLException, DbException {
	return this.getDao().taskSelectObjectsByTaskManagerId(ATaskManagerId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskCreaterId">任务创建者代号</param>
 */
public List<Task> taskSelectObjectsByTaskCreaterId(int ATaskCreaterId) throws SQLException, DbException {
	return this.getDao().taskSelectObjectsByTaskCreaterId(ATaskCreaterId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Task> taskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().taskSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Task> taskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().taskSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Task> taskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().taskSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Task> taskSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().taskSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Task taskSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Task> list = this.taskSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Task.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Task> taskSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.taskSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Task> taskSelectObjects() throws SQLException, DbException {
	return this.taskSelectObjects("");
}

/**
 * @return 查询结果
 */
public Task taskSelectSingleObject() throws SQLException, DbException {
	return this.taskSelectSingleObject("");
}

/**
 * <param name="taskQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Task> taskSelectObjects(ConditionQuery taskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = taskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.taskSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="taskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Task> taskSelectObjects(ConditionQuery taskQueryCondition) throws SQLException, DbException {
	String sql = taskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.taskSelectObjects(sql);
}

/**
 * <param name="taskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Task taskSelectSingleObject(ConditionQuery taskQueryCondition) throws SQLException, DbException {
	List<Task> list = this.taskSelectObjects(taskQueryCondition);
	return common.util.ListUtil.getFirstItem(Task.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Task> List<T> taskSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().taskSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Task> List<T> taskSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().taskSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Task> T taskSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.taskSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Task> List<T> taskSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.taskSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Task> List<T> taskSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.taskSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Task> T taskSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.taskSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="taskQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Task> List<T> taskSelectObjects(Class<T> type, ConditionQuery taskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = taskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.taskSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="taskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Task> List<T> taskSelectObjects(Class<T> type, ConditionQuery taskQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = taskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.taskSelectObjects(type, sql);
}

/**
 * <param name="taskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Task> T taskSelectSingleObject(Class<T> type, ConditionQuery taskQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.taskSelectObjects(type, taskQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int taskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().taskQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="taskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int taskQuerySelectObjectsCount(ConditionQuery taskQueryCondition) throws SQLException, DbException {
	String sql = taskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.taskQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象FuncParams到数据库中
 * <param name="funcParams">需要插入的新对象</param>
 */
public void funcParamsInsert(FuncParams funcParams) throws SQLException, DbException {
	this.getDao().funcParamsInsert(funcParams);
	String kvalue = "";
	kvalue = (kvalue + funcParams.getParamId());
	this.operatesLogSimpleAdd("T_FUNC_PARAMS", "插入", "PARAM_ID", kvalue, funcParams);
}

/**
 * 从数据库中删除一个对象FuncParams
 * <param name="AParamId">参数标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void funcParamsDeleteByParamId(int AParamId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_FUNC_PARAMS].[PARAM_ID] = ");
	sql = (sql + AParamId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().funcTestSelectObjects((" inner join T_FUNC_PARAMS on [T_FUNC_PARAMS].[PARAM_ID] = [T_FUNC_TEST].[PARAM_ID" +
"] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_FUNC_PARAMS", "T_FUNC_TEST"));
	}
	sql = "";
	sql = (sql + "[T_FUNC_PARAMS].[PARAM_ID] = ");
	sql = (sql + AParamId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().testParamValueSelectObjects((" inner join T_FUNC_PARAMS on [T_FUNC_PARAMS].[PARAM_ID] = [T_TEST_PARAM_VALUE].[P" +
"ARAM_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_FUNC_PARAMS", "T_TEST_PARAM_VALUE"));
	}
	this.getDao().funcParamsDeleteByParamId(AParamId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AParamId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_FUNC_PARAMS", "删除", "PARAM_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象FuncParams
 * <param name="AParamId">参数标识</param>
 */
public void funcParamsDeleteByParamId(int AParamId) throws SQLException, DbException {
	this.funcParamsDeleteByParamId(AParamId, "");
}

/**
 * 从数据库中删除一批对象FuncParams
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
public void funcParamsDeleteListByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException {
	if ((this.getDao().funcTestSelectObjects((" inner join T_FUNC_PARAMS on [T_FUNC_PARAMS].[PARAM_ID] = [T_FUNC_TEST].[PARAM_ID" +
"] where [T_FUNC_PARAMS].[FUNC_PROCEDURE_ID] = " + AFuncProcedureId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_FUNC_PARAMS", "T_FUNC_TEST"));
	}
	if ((this.getDao().testParamValueSelectObjects((" inner join T_FUNC_PARAMS on [T_FUNC_PARAMS].[PARAM_ID] = [T_TEST_PARAM_VALUE].[P" +
"ARAM_ID] where [T_FUNC_PARAMS].[FUNC_PROCEDURE_ID] = " + AFuncProcedureId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_FUNC_PARAMS", "T_TEST_PARAM_VALUE"));
	}
	this.getDao().funcParamsDeleteListByFuncProcedureId(AFuncProcedureId);
	String kvalue = "";
	kvalue = (kvalue + AFuncProcedureId);
	this.operatesLogSimpleAdd("T_FUNC_PARAMS", "删除", "FUNC_PROCEDURE_ID", kvalue, null);
}

/**
 * 更新一个对象FuncParams到数据库中
 * <param name="funcParams">需要更新的FuncParams</param>
 */
public int funcParamsUpdate(FuncParams funcParams) throws SQLException, DbException {
	return this.funcParamsUpdate(funcParams, "");
}

/**
 * 更新一个对象FuncParams到数据库中
 * <param name="funcParams">需要更新的FuncParams</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int funcParamsUpdate(FuncParams funcParams, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().funcParamsUpdate(funcParams, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + funcParams.getParamId());
	this.operatesLogSimpleAdd("T_FUNC_PARAMS", "更新", "PARAM_ID", kvalue, funcParams);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AParamId">参数标识</param>
 */
public FuncParams funcParamsSelectByParamId(int AParamId) throws SQLException, DbException {
	return this.getDao().funcParamsSelectByParamId(AParamId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
public List<FuncParams> funcParamsSelectObjectsByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException {
	return this.getDao().funcParamsSelectObjectsByFuncProcedureId(AFuncProcedureId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<FuncParams> funcParamsSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().funcParamsSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<FuncParams> funcParamsSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().funcParamsSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<FuncParams> funcParamsSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().funcParamsSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<FuncParams> funcParamsSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().funcParamsSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public FuncParams funcParamsSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<FuncParams> list = this.funcParamsSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(FuncParams.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<FuncParams> funcParamsSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.funcParamsSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<FuncParams> funcParamsSelectObjects() throws SQLException, DbException {
	return this.funcParamsSelectObjects("");
}

/**
 * @return 查询结果
 */
public FuncParams funcParamsSelectSingleObject() throws SQLException, DbException {
	return this.funcParamsSelectSingleObject("");
}

/**
 * <param name="funcParamsQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<FuncParams> funcParamsSelectObjects(ConditionQuery funcParamsQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = funcParamsQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.funcParamsSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="funcParamsQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<FuncParams> funcParamsSelectObjects(ConditionQuery funcParamsQueryCondition) throws SQLException, DbException {
	String sql = funcParamsQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.funcParamsSelectObjects(sql);
}

/**
 * <param name="funcParamsQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public FuncParams funcParamsSelectSingleObject(ConditionQuery funcParamsQueryCondition) throws SQLException, DbException {
	List<FuncParams> list = this.funcParamsSelectObjects(funcParamsQueryCondition);
	return common.util.ListUtil.getFirstItem(FuncParams.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends FuncParams> List<T> funcParamsSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().funcParamsSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends FuncParams> List<T> funcParamsSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().funcParamsSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends FuncParams> T funcParamsSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.funcParamsSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends FuncParams> List<T> funcParamsSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.funcParamsSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends FuncParams> List<T> funcParamsSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.funcParamsSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends FuncParams> T funcParamsSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.funcParamsSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="funcParamsQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends FuncParams> List<T> funcParamsSelectObjects(Class<T> type, ConditionQuery funcParamsQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = funcParamsQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.funcParamsSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="funcParamsQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends FuncParams> List<T> funcParamsSelectObjects(Class<T> type, ConditionQuery funcParamsQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = funcParamsQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.funcParamsSelectObjects(type, sql);
}

/**
 * <param name="funcParamsQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends FuncParams> T funcParamsSelectSingleObject(Class<T> type, ConditionQuery funcParamsQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.funcParamsSelectObjects(type, funcParamsQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int funcParamsQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().funcParamsQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="funcParamsQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int funcParamsQuerySelectObjectsCount(ConditionQuery funcParamsQueryCondition) throws SQLException, DbException {
	String sql = funcParamsQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.funcParamsQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象IssueStateChangeDefine到数据库中
 * <param name="issueStateChangeDefine">需要插入的新对象</param>
 */
public void issueStateChangeDefineInsert(IssueStateChangeDefine issueStateChangeDefine) throws SQLException, DbException {
	this.getDao().issueStateChangeDefineInsert(issueStateChangeDefine);
	String kvalue = "";
	kvalue = (kvalue + issueStateChangeDefine.getCurrentStatusId());
	kvalue = (kvalue + ",");
	kvalue = (kvalue + issueStateChangeDefine.getNextStatusId());
	this.operatesLogSimpleAdd("T_ISSUE_STATE_CHANGE_DEFINE", "插入", "CURRENT_STATUS_ID,NEXT_STATUS_ID", kvalue, issueStateChangeDefine);
}

/**
 * 从数据库中删除一个对象IssueStateChangeDefine
 * <param name="ACurrentStatusId">当前状态标识</param>
 * <param name="ANextStatusId">下一个状态标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void issueStateChangeDefineDeleteByCurrentStatusIdNextStatusId(int ACurrentStatusId, int ANextStatusId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().issueStateChangeDefineDeleteByCurrentStatusIdNextStatusId(ACurrentStatusId, ANextStatusId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ACurrentStatusId);
	kvalue = (kvalue + ",");
	kvalue = (kvalue + ANextStatusId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ISSUE_STATE_CHANGE_DEFINE", "删除", "CURRENT_STATUS_ID,NEXT_STATUS_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象IssueStateChangeDefine
 * <param name="ACurrentStatusId">当前状态标识</param>
 * <param name="ANextStatusId">下一个状态标识</param>
 */
public void issueStateChangeDefineDeleteByCurrentStatusIdNextStatusId(int ACurrentStatusId, int ANextStatusId) throws SQLException, DbException {
	this.issueStateChangeDefineDeleteByCurrentStatusIdNextStatusId(ACurrentStatusId, ANextStatusId, "");
}

/**
 * 从数据库中删除一批对象IssueStateChangeDefine
 * <param name="ACurrentStatusId">当前状态标识</param>
 */
public void issueStateChangeDefineDeleteListByCurrentStatusId(int ACurrentStatusId) throws SQLException, DbException {
	this.getDao().issueStateChangeDefineDeleteListByCurrentStatusId(ACurrentStatusId);
	String kvalue = "";
	kvalue = (kvalue + ACurrentStatusId);
	this.operatesLogSimpleAdd("T_ISSUE_STATE_CHANGE_DEFINE", "删除", "CURRENT_STATUS_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象IssueStateChangeDefine
 * <param name="ANextStatusId">下一个状态标识</param>
 */
public void issueStateChangeDefineDeleteListByNextStatusId(int ANextStatusId) throws SQLException, DbException {
	this.getDao().issueStateChangeDefineDeleteListByNextStatusId(ANextStatusId);
	String kvalue = "";
	kvalue = (kvalue + ANextStatusId);
	this.operatesLogSimpleAdd("T_ISSUE_STATE_CHANGE_DEFINE", "删除", "NEXT_STATUS_ID", kvalue, null);
}

/**
 * 更新一个对象IssueStateChangeDefine到数据库中
 * <param name="issueStateChangeDefine">需要更新的IssueStateChangeDefine</param>
 */
public int issueStateChangeDefineUpdate(IssueStateChangeDefine issueStateChangeDefine) throws SQLException, DbException {
	return this.issueStateChangeDefineUpdate(issueStateChangeDefine, "");
}

/**
 * 更新一个对象IssueStateChangeDefine到数据库中
 * <param name="issueStateChangeDefine">需要更新的IssueStateChangeDefine</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int issueStateChangeDefineUpdate(IssueStateChangeDefine issueStateChangeDefine, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueStateChangeDefineUpdate(issueStateChangeDefine, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + issueStateChangeDefine.getCurrentStatusId());
	kvalue = (kvalue + ",");
	kvalue = (kvalue + issueStateChangeDefine.getNextStatusId());
	this.operatesLogSimpleAdd("T_ISSUE_STATE_CHANGE_DEFINE", "更新", "CURRENT_STATUS_ID,NEXT_STATUS_ID", kvalue, issueStateChangeDefine);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ACurrentStatusId">当前状态标识</param>
 * <param name="ANextStatusId">下一个状态标识</param>
 */
public IssueStateChangeDefine issueStateChangeDefineSelectByCurrentStatusIdNextStatusId(int ACurrentStatusId, int ANextStatusId) throws SQLException, DbException {
	return this.getDao().issueStateChangeDefineSelectByCurrentStatusIdNextStatusId(ACurrentStatusId, ANextStatusId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ACurrentStatusId">当前状态标识</param>
 */
public List<IssueStateChangeDefine> issueStateChangeDefineSelectObjectsByCurrentStatusId(int ACurrentStatusId) throws SQLException, DbException {
	return this.getDao().issueStateChangeDefineSelectObjectsByCurrentStatusId(ACurrentStatusId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ANextStatusId">下一个状态标识</param>
 */
public List<IssueStateChangeDefine> issueStateChangeDefineSelectObjectsByNextStatusId(int ANextStatusId) throws SQLException, DbException {
	return this.getDao().issueStateChangeDefineSelectObjectsByNextStatusId(ANextStatusId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueStateChangeDefine> issueStateChangeDefineSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueStateChangeDefineSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<IssueStateChangeDefine> issueStateChangeDefineSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().issueStateChangeDefineSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueStateChangeDefine> issueStateChangeDefineSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueStateChangeDefineSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<IssueStateChangeDefine> issueStateChangeDefineSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().issueStateChangeDefineSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public IssueStateChangeDefine issueStateChangeDefineSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<IssueStateChangeDefine> list = this.issueStateChangeDefineSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(IssueStateChangeDefine.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueStateChangeDefine> issueStateChangeDefineSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.issueStateChangeDefineSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<IssueStateChangeDefine> issueStateChangeDefineSelectObjects() throws SQLException, DbException {
	return this.issueStateChangeDefineSelectObjects("");
}

/**
 * @return 查询结果
 */
public IssueStateChangeDefine issueStateChangeDefineSelectSingleObject() throws SQLException, DbException {
	return this.issueStateChangeDefineSelectSingleObject("");
}

/**
 * <param name="issueStateChangeDefineQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueStateChangeDefine> issueStateChangeDefineSelectObjects(ConditionQuery issueStateChangeDefineQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = issueStateChangeDefineQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueStateChangeDefineSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueStateChangeDefineQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<IssueStateChangeDefine> issueStateChangeDefineSelectObjects(ConditionQuery issueStateChangeDefineQueryCondition) throws SQLException, DbException {
	String sql = issueStateChangeDefineQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueStateChangeDefineSelectObjects(sql);
}

/**
 * <param name="issueStateChangeDefineQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public IssueStateChangeDefine issueStateChangeDefineSelectSingleObject(ConditionQuery issueStateChangeDefineQueryCondition) throws SQLException, DbException {
	List<IssueStateChangeDefine> list = this.issueStateChangeDefineSelectObjects(issueStateChangeDefineQueryCondition);
	return common.util.ListUtil.getFirstItem(IssueStateChangeDefine.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueStateChangeDefine> List<T> issueStateChangeDefineSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueStateChangeDefineSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueStateChangeDefine> List<T> issueStateChangeDefineSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueStateChangeDefineSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueStateChangeDefine> T issueStateChangeDefineSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueStateChangeDefineSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueStateChangeDefine> List<T> issueStateChangeDefineSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueStateChangeDefineSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends IssueStateChangeDefine> List<T> issueStateChangeDefineSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueStateChangeDefineSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends IssueStateChangeDefine> T issueStateChangeDefineSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueStateChangeDefineSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="issueStateChangeDefineQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueStateChangeDefine> List<T> issueStateChangeDefineSelectObjects(Class<T> type, ConditionQuery issueStateChangeDefineQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueStateChangeDefineQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueStateChangeDefineSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueStateChangeDefineQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueStateChangeDefine> List<T> issueStateChangeDefineSelectObjects(Class<T> type, ConditionQuery issueStateChangeDefineQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueStateChangeDefineQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueStateChangeDefineSelectObjects(type, sql);
}

/**
 * <param name="issueStateChangeDefineQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueStateChangeDefine> T issueStateChangeDefineSelectSingleObject(Class<T> type, ConditionQuery issueStateChangeDefineQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueStateChangeDefineSelectObjects(type, issueStateChangeDefineQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int issueStateChangeDefineQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueStateChangeDefineQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="issueStateChangeDefineQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int issueStateChangeDefineQuerySelectObjectsCount(ConditionQuery issueStateChangeDefineQueryCondition) throws SQLException, DbException {
	String sql = issueStateChangeDefineQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueStateChangeDefineQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象IssueComment到数据库中
 * <param name="issueComment">需要插入的新对象</param>
 */
public void issueCommentInsert(IssueComment issueComment) throws SQLException, DbException {
	this.getDao().issueCommentInsert(issueComment);
	String kvalue = "";
	kvalue = (kvalue + issueComment.getIssueCommentId());
	this.operatesLogSimpleAdd("T_ISSUE_COMMENT", "插入", "ISSUE_COMMENT_ID", kvalue, issueComment);
}

/**
 * 从数据库中删除一个对象IssueComment
 * <param name="AIssueCommentId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void issueCommentDeleteByIssueCommentId(int AIssueCommentId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().issueCommentDeleteByIssueCommentId(AIssueCommentId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AIssueCommentId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ISSUE_COMMENT", "删除", "ISSUE_COMMENT_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象IssueComment
 * <param name="AIssueCommentId">标识</param>
 */
public void issueCommentDeleteByIssueCommentId(int AIssueCommentId) throws SQLException, DbException {
	this.issueCommentDeleteByIssueCommentId(AIssueCommentId, "");
}

/**
 * 从数据库中删除一批对象IssueComment
 * <param name="AIssueId">问题标识</param>
 */
public void issueCommentDeleteListByIssueId(int AIssueId) throws SQLException, DbException {
	this.getDao().issueCommentDeleteListByIssueId(AIssueId);
	String kvalue = "";
	kvalue = (kvalue + AIssueId);
	this.operatesLogSimpleAdd("T_ISSUE_COMMENT", "删除", "ISSUE_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象IssueComment
 * <param name="ACommentUserId">用户标识</param>
 */
public void issueCommentDeleteListByCommentUserId(int ACommentUserId) throws SQLException, DbException {
	this.getDao().issueCommentDeleteListByCommentUserId(ACommentUserId);
	String kvalue = "";
	kvalue = (kvalue + ACommentUserId);
	this.operatesLogSimpleAdd("T_ISSUE_COMMENT", "删除", "COMMENT_USER_ID", kvalue, null);
}

/**
 * 更新一个对象IssueComment到数据库中
 * <param name="issueComment">需要更新的IssueComment</param>
 */
public int issueCommentUpdate(IssueComment issueComment) throws SQLException, DbException {
	return this.issueCommentUpdate(issueComment, "");
}

/**
 * 更新一个对象IssueComment到数据库中
 * <param name="issueComment">需要更新的IssueComment</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int issueCommentUpdate(IssueComment issueComment, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueCommentUpdate(issueComment, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + issueComment.getIssueCommentId());
	this.operatesLogSimpleAdd("T_ISSUE_COMMENT", "更新", "ISSUE_COMMENT_ID", kvalue, issueComment);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueCommentId">标识</param>
 */
public IssueComment issueCommentSelectByIssueCommentId(int AIssueCommentId) throws SQLException, DbException {
	return this.getDao().issueCommentSelectByIssueCommentId(AIssueCommentId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueId">问题标识</param>
 */
public List<IssueComment> issueCommentSelectObjectsByIssueId(int AIssueId) throws SQLException, DbException {
	return this.getDao().issueCommentSelectObjectsByIssueId(AIssueId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ACommentUserId">用户标识</param>
 */
public List<IssueComment> issueCommentSelectObjectsByCommentUserId(int ACommentUserId) throws SQLException, DbException {
	return this.getDao().issueCommentSelectObjectsByCommentUserId(ACommentUserId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueComment> issueCommentSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueCommentSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<IssueComment> issueCommentSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().issueCommentSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueComment> issueCommentSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueCommentSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<IssueComment> issueCommentSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().issueCommentSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public IssueComment issueCommentSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<IssueComment> list = this.issueCommentSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(IssueComment.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueComment> issueCommentSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.issueCommentSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<IssueComment> issueCommentSelectObjects() throws SQLException, DbException {
	return this.issueCommentSelectObjects("");
}

/**
 * @return 查询结果
 */
public IssueComment issueCommentSelectSingleObject() throws SQLException, DbException {
	return this.issueCommentSelectSingleObject("");
}

/**
 * <param name="issueCommentQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueComment> issueCommentSelectObjects(ConditionQuery issueCommentQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = issueCommentQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueCommentSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueCommentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<IssueComment> issueCommentSelectObjects(ConditionQuery issueCommentQueryCondition) throws SQLException, DbException {
	String sql = issueCommentQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueCommentSelectObjects(sql);
}

/**
 * <param name="issueCommentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public IssueComment issueCommentSelectSingleObject(ConditionQuery issueCommentQueryCondition) throws SQLException, DbException {
	List<IssueComment> list = this.issueCommentSelectObjects(issueCommentQueryCondition);
	return common.util.ListUtil.getFirstItem(IssueComment.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueComment> List<T> issueCommentSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueCommentSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueComment> List<T> issueCommentSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueCommentSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueComment> T issueCommentSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueCommentSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueComment> List<T> issueCommentSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueCommentSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends IssueComment> List<T> issueCommentSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueCommentSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends IssueComment> T issueCommentSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueCommentSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="issueCommentQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueComment> List<T> issueCommentSelectObjects(Class<T> type, ConditionQuery issueCommentQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueCommentQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueCommentSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueCommentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueComment> List<T> issueCommentSelectObjects(Class<T> type, ConditionQuery issueCommentQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueCommentQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueCommentSelectObjects(type, sql);
}

/**
 * <param name="issueCommentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueComment> T issueCommentSelectSingleObject(Class<T> type, ConditionQuery issueCommentQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueCommentSelectObjects(type, issueCommentQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int issueCommentQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueCommentQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="issueCommentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int issueCommentQuerySelectObjectsCount(ConditionQuery issueCommentQueryCondition) throws SQLException, DbException {
	String sql = issueCommentQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueCommentQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Issue到数据库中
 * <param name="issue">需要插入的新对象</param>
 */
public void issueInsert(Issue issue) throws SQLException, DbException {
	this.getDao().issueInsert(issue);
	String kvalue = "";
	kvalue = (kvalue + issue.getIssueId());
	this.operatesLogSimpleAdd("T_ISSUE", "插入", "ISSUE_ID", kvalue, issue);
}

/**
 * 从数据库中删除一个对象Issue
 * <param name="AIssueId">问题标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void issueDeleteByIssueId(int AIssueId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_ISSUE].[ISSUE_ID] = ");
	sql = (sql + AIssueId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueCommentSelectObjects((" inner join T_ISSUE on [T_ISSUE].[ISSUE_ID] = [T_ISSUE_COMMENT].[ISSUE_ID] where " +
"" + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE", "T_ISSUE_COMMENT"));
	}
	this.getDao().issueDeleteByIssueId(AIssueId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AIssueId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ISSUE", "删除", "ISSUE_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象Issue
 * <param name="AIssueId">问题标识</param>
 */
public void issueDeleteByIssueId(int AIssueId) throws SQLException, DbException {
	this.issueDeleteByIssueId(AIssueId, "");
}

/**
 * 从数据库中删除一批对象Issue
 * <param name="APrioritiesId">优先级别</param>
 */
public void issueDeleteListByPrioritiesId(Byte APrioritiesId) throws SQLException, DbException {
	if ((this.getDao().issueCommentSelectObjects((" inner join T_ISSUE on [T_ISSUE].[ISSUE_ID] = [T_ISSUE_COMMENT].[ISSUE_ID] where " +
"[T_ISSUE].[PRIORITIES_ID] = " + APrioritiesId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE", "T_ISSUE_COMMENT"));
	}
	this.getDao().issueDeleteListByPrioritiesId(APrioritiesId);
	String kvalue = "";
	kvalue = (kvalue + APrioritiesId);
	this.operatesLogSimpleAdd("T_ISSUE", "删除", "PRIORITIES_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象Issue
 * <param name="AIssueProjectId">项目标识</param>
 */
public void issueDeleteListByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	if ((this.getDao().issueCommentSelectObjects((" inner join T_ISSUE on [T_ISSUE].[ISSUE_ID] = [T_ISSUE_COMMENT].[ISSUE_ID] where " +
"[T_ISSUE].[ISSUE_PROJECT_ID] = " + AIssueProjectId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE", "T_ISSUE_COMMENT"));
	}
	this.getDao().issueDeleteListByIssueProjectId(AIssueProjectId);
	String kvalue = "";
	kvalue = (kvalue + AIssueProjectId);
	this.operatesLogSimpleAdd("T_ISSUE", "删除", "ISSUE_PROJECT_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象Issue
 * <param name="AIssueProjectModuleId">标识</param>
 */
public void issueDeleteListByIssueProjectModuleId(Integer AIssueProjectModuleId) throws SQLException, DbException {
	if ((this.getDao().issueCommentSelectObjects((" inner join T_ISSUE on [T_ISSUE].[ISSUE_ID] = [T_ISSUE_COMMENT].[ISSUE_ID] where " +
"[T_ISSUE].[ISSUE_PROJECT_MODULE_ID] = " + AIssueProjectModuleId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE", "T_ISSUE_COMMENT"));
	}
	this.getDao().issueDeleteListByIssueProjectModuleId(AIssueProjectModuleId);
	String kvalue = "";
	kvalue = (kvalue + AIssueProjectModuleId);
	this.operatesLogSimpleAdd("T_ISSUE", "删除", "ISSUE_PROJECT_MODULE_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象Issue
 * <param name="AStatusId">状态标识</param>
 */
public void issueDeleteListByStatusId(int AStatusId) throws SQLException, DbException {
	if ((this.getDao().issueCommentSelectObjects((" inner join T_ISSUE on [T_ISSUE].[ISSUE_ID] = [T_ISSUE_COMMENT].[ISSUE_ID] where " +
"[T_ISSUE].[STATUS_ID] = " + AStatusId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE", "T_ISSUE_COMMENT"));
	}
	this.getDao().issueDeleteListByStatusId(AStatusId);
	String kvalue = "";
	kvalue = (kvalue + AStatusId);
	this.operatesLogSimpleAdd("T_ISSUE", "删除", "STATUS_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象Issue
 * <param name="AReportUserId">报告用户</param>
 */
public void issueDeleteListByReportUserId(int AReportUserId) throws SQLException, DbException {
	if ((this.getDao().issueCommentSelectObjects((" inner join T_ISSUE on [T_ISSUE].[ISSUE_ID] = [T_ISSUE_COMMENT].[ISSUE_ID] where " +
"[T_ISSUE].[REPORT_USER_ID] = " + AReportUserId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE", "T_ISSUE_COMMENT"));
	}
	this.getDao().issueDeleteListByReportUserId(AReportUserId);
	String kvalue = "";
	kvalue = (kvalue + AReportUserId);
	this.operatesLogSimpleAdd("T_ISSUE", "删除", "REPORT_USER_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象Issue
 * <param name="AAssignUserId">关联处理用户</param>
 */
public void issueDeleteListByAssignUserId(int AAssignUserId) throws SQLException, DbException {
	if ((this.getDao().issueCommentSelectObjects((" inner join T_ISSUE on [T_ISSUE].[ISSUE_ID] = [T_ISSUE_COMMENT].[ISSUE_ID] where " +
"[T_ISSUE].[ASSIGN_USER_ID] = " + AAssignUserId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE", "T_ISSUE_COMMENT"));
	}
	this.getDao().issueDeleteListByAssignUserId(AAssignUserId);
	String kvalue = "";
	kvalue = (kvalue + AAssignUserId);
	this.operatesLogSimpleAdd("T_ISSUE", "删除", "ASSIGN_USER_ID", kvalue, null);
}

/**
 * 更新一个对象Issue到数据库中
 * <param name="issue">需要更新的Issue</param>
 */
public int issueUpdate(Issue issue) throws SQLException, DbException {
	return this.issueUpdate(issue, "");
}

/**
 * 更新一个对象Issue到数据库中
 * <param name="issue">需要更新的Issue</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int issueUpdate(Issue issue, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueUpdate(issue, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + issue.getIssueId());
	this.operatesLogSimpleAdd("T_ISSUE", "更新", "ISSUE_ID", kvalue, issue);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueId">问题标识</param>
 */
public Issue issueSelectByIssueId(int AIssueId) throws SQLException, DbException {
	return this.getDao().issueSelectByIssueId(AIssueId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="APrioritiesId">优先级别</param>
 */
public List<Issue> issueSelectObjectsByPrioritiesId(Byte APrioritiesId) throws SQLException, DbException {
	return this.getDao().issueSelectObjectsByPrioritiesId(APrioritiesId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectId">项目标识</param>
 */
public List<Issue> issueSelectObjectsByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	return this.getDao().issueSelectObjectsByIssueProjectId(AIssueProjectId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectModuleId">标识</param>
 */
public List<Issue> issueSelectObjectsByIssueProjectModuleId(Integer AIssueProjectModuleId) throws SQLException, DbException {
	return this.getDao().issueSelectObjectsByIssueProjectModuleId(AIssueProjectModuleId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AStatusId">状态标识</param>
 */
public List<Issue> issueSelectObjectsByStatusId(int AStatusId) throws SQLException, DbException {
	return this.getDao().issueSelectObjectsByStatusId(AStatusId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AReportUserId">报告用户</param>
 */
public List<Issue> issueSelectObjectsByReportUserId(int AReportUserId) throws SQLException, DbException {
	return this.getDao().issueSelectObjectsByReportUserId(AReportUserId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AAssignUserId">关联处理用户</param>
 */
public List<Issue> issueSelectObjectsByAssignUserId(int AAssignUserId) throws SQLException, DbException {
	return this.getDao().issueSelectObjectsByAssignUserId(AAssignUserId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Issue> issueSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Issue> issueSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().issueSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Issue> issueSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Issue> issueSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().issueSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Issue issueSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Issue> list = this.issueSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Issue.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Issue> issueSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.issueSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Issue> issueSelectObjects() throws SQLException, DbException {
	return this.issueSelectObjects("");
}

/**
 * @return 查询结果
 */
public Issue issueSelectSingleObject() throws SQLException, DbException {
	return this.issueSelectSingleObject("");
}

/**
 * <param name="issueQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Issue> issueSelectObjects(ConditionQuery issueQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = issueQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Issue> issueSelectObjects(ConditionQuery issueQueryCondition) throws SQLException, DbException {
	String sql = issueQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueSelectObjects(sql);
}

/**
 * <param name="issueQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Issue issueSelectSingleObject(ConditionQuery issueQueryCondition) throws SQLException, DbException {
	List<Issue> list = this.issueSelectObjects(issueQueryCondition);
	return common.util.ListUtil.getFirstItem(Issue.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Issue> List<T> issueSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Issue> List<T> issueSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Issue> T issueSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Issue> List<T> issueSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Issue> List<T> issueSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Issue> T issueSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="issueQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Issue> List<T> issueSelectObjects(Class<T> type, ConditionQuery issueQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Issue> List<T> issueSelectObjects(Class<T> type, ConditionQuery issueQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueSelectObjects(type, sql);
}

/**
 * <param name="issueQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Issue> T issueSelectSingleObject(Class<T> type, ConditionQuery issueQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueSelectObjects(type, issueQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int issueQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="issueQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int issueQuerySelectObjectsCount(ConditionQuery issueQueryCondition) throws SQLException, DbException {
	String sql = issueQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象FuncProcedure到数据库中
 * <param name="funcProcedure">需要插入的新对象</param>
 */
public void funcProcedureInsert(FuncProcedure funcProcedure) throws SQLException, DbException {
	this.getDao().funcProcedureInsert(funcProcedure);
	String kvalue = "";
	kvalue = (kvalue + funcProcedure.getFuncProcedureId());
	this.operatesLogSimpleAdd("T_FUNC_PROCEDURE", "插入", "FUNC_PROCEDURE_ID", kvalue, funcProcedure);
}

/**
 * 从数据库中删除一个对象FuncProcedure
 * <param name="AFuncProcedureId">函数过程标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void funcProcedureDeleteByFuncProcedureId(int AFuncProcedureId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_FUNC_PROCEDURE].[FUNC_PROCEDURE_ID] = ");
	sql = (sql + AFuncProcedureId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().funcParamsSelectObjects((" inner join T_FUNC_PROCEDURE on [T_FUNC_PROCEDURE].[FUNC_PROCEDURE_ID] = [T_FUNC_" +
"PARAMS].[FUNC_PROCEDURE_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_FUNC_PROCEDURE", "T_FUNC_PARAMS"));
	}
	sql = "";
	sql = (sql + "[T_FUNC_PROCEDURE].[FUNC_PROCEDURE_ID] = ");
	sql = (sql + AFuncProcedureId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().codeBuildProcedureSelectObjects((" inner join T_FUNC_PROCEDURE on [T_FUNC_PROCEDURE].[FUNC_PROCEDURE_ID] = [T_CODE_" +
"BUILD_PROCEDURE].[FUNC_PROCEDURE_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_FUNC_PROCEDURE", "T_CODE_BUILD_PROCEDURE"));
	}
	sql = "";
	sql = (sql + "[T_FUNC_PROCEDURE].[FUNC_PROCEDURE_ID] = ");
	sql = (sql + AFuncProcedureId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().testProcedureSelectObjects((" inner join T_FUNC_PROCEDURE on [T_FUNC_PROCEDURE].[FUNC_PROCEDURE_ID] = [T_TEST_" +
"PROCEDURE].[FUNC_PROCEDURE_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_FUNC_PROCEDURE", "T_TEST_PROCEDURE"));
	}
	this.getDao().funcProcedureDeleteByFuncProcedureId(AFuncProcedureId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AFuncProcedureId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_FUNC_PROCEDURE", "删除", "FUNC_PROCEDURE_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象FuncProcedure
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
public void funcProcedureDeleteByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException {
	this.funcProcedureDeleteByFuncProcedureId(AFuncProcedureId, "");
}

/**
 * 从数据库中删除一批对象FuncProcedure
 * <param name="AFuncProjectId">函数项目标识</param>
 */
public void funcProcedureDeleteListByFuncProjectId(int AFuncProjectId) throws SQLException, DbException {
	if ((this.getDao().funcParamsSelectObjects((" inner join T_FUNC_PROCEDURE on [T_FUNC_PROCEDURE].[FUNC_PROCEDURE_ID] = [T_FUNC_" +
"PARAMS].[FUNC_PROCEDURE_ID] where [T_FUNC_PROCEDURE].[FUNC_PROJECT_ID] = " + AFuncProjectId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_FUNC_PROCEDURE", "T_FUNC_PARAMS"));
	}
	if ((this.getDao().codeBuildProcedureSelectObjects((" inner join T_FUNC_PROCEDURE on [T_FUNC_PROCEDURE].[FUNC_PROCEDURE_ID] = [T_CODE_" +
"BUILD_PROCEDURE].[FUNC_PROCEDURE_ID] where [T_FUNC_PROCEDURE].[FUNC_PROJECT_ID] " +
"= " + AFuncProjectId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_FUNC_PROCEDURE", "T_CODE_BUILD_PROCEDURE"));
	}
	if ((this.getDao().testProcedureSelectObjects((" inner join T_FUNC_PROCEDURE on [T_FUNC_PROCEDURE].[FUNC_PROCEDURE_ID] = [T_TEST_" +
"PROCEDURE].[FUNC_PROCEDURE_ID] where [T_FUNC_PROCEDURE].[FUNC_PROJECT_ID] = " + AFuncProjectId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_FUNC_PROCEDURE", "T_TEST_PROCEDURE"));
	}
	this.getDao().funcProcedureDeleteListByFuncProjectId(AFuncProjectId);
	String kvalue = "";
	kvalue = (kvalue + AFuncProjectId);
	this.operatesLogSimpleAdd("T_FUNC_PROCEDURE", "删除", "FUNC_PROJECT_ID", kvalue, null);
}

/**
 * 更新一个对象FuncProcedure到数据库中
 * <param name="funcProcedure">需要更新的FuncProcedure</param>
 */
public int funcProcedureUpdate(FuncProcedure funcProcedure) throws SQLException, DbException {
	return this.funcProcedureUpdate(funcProcedure, "");
}

/**
 * 更新一个对象FuncProcedure到数据库中
 * <param name="funcProcedure">需要更新的FuncProcedure</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int funcProcedureUpdate(FuncProcedure funcProcedure, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().funcProcedureUpdate(funcProcedure, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + funcProcedure.getFuncProcedureId());
	this.operatesLogSimpleAdd("T_FUNC_PROCEDURE", "更新", "FUNC_PROCEDURE_ID", kvalue, funcProcedure);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
public FuncProcedure funcProcedureSelectByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException {
	return this.getDao().funcProcedureSelectByFuncProcedureId(AFuncProcedureId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AFuncProjectId">函数项目标识</param>
 */
public List<FuncProcedure> funcProcedureSelectObjectsByFuncProjectId(int AFuncProjectId) throws SQLException, DbException {
	return this.getDao().funcProcedureSelectObjectsByFuncProjectId(AFuncProjectId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<FuncProcedure> funcProcedureSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().funcProcedureSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<FuncProcedure> funcProcedureSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().funcProcedureSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<FuncProcedure> funcProcedureSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().funcProcedureSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<FuncProcedure> funcProcedureSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().funcProcedureSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public FuncProcedure funcProcedureSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<FuncProcedure> list = this.funcProcedureSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(FuncProcedure.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<FuncProcedure> funcProcedureSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.funcProcedureSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<FuncProcedure> funcProcedureSelectObjects() throws SQLException, DbException {
	return this.funcProcedureSelectObjects("");
}

/**
 * @return 查询结果
 */
public FuncProcedure funcProcedureSelectSingleObject() throws SQLException, DbException {
	return this.funcProcedureSelectSingleObject("");
}

/**
 * <param name="funcProcedureQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<FuncProcedure> funcProcedureSelectObjects(ConditionQuery funcProcedureQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = funcProcedureQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.funcProcedureSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="funcProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<FuncProcedure> funcProcedureSelectObjects(ConditionQuery funcProcedureQueryCondition) throws SQLException, DbException {
	String sql = funcProcedureQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.funcProcedureSelectObjects(sql);
}

/**
 * <param name="funcProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public FuncProcedure funcProcedureSelectSingleObject(ConditionQuery funcProcedureQueryCondition) throws SQLException, DbException {
	List<FuncProcedure> list = this.funcProcedureSelectObjects(funcProcedureQueryCondition);
	return common.util.ListUtil.getFirstItem(FuncProcedure.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends FuncProcedure> List<T> funcProcedureSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().funcProcedureSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends FuncProcedure> List<T> funcProcedureSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().funcProcedureSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends FuncProcedure> T funcProcedureSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.funcProcedureSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends FuncProcedure> List<T> funcProcedureSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.funcProcedureSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends FuncProcedure> List<T> funcProcedureSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.funcProcedureSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends FuncProcedure> T funcProcedureSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.funcProcedureSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="funcProcedureQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends FuncProcedure> List<T> funcProcedureSelectObjects(Class<T> type, ConditionQuery funcProcedureQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = funcProcedureQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.funcProcedureSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="funcProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends FuncProcedure> List<T> funcProcedureSelectObjects(Class<T> type, ConditionQuery funcProcedureQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = funcProcedureQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.funcProcedureSelectObjects(type, sql);
}

/**
 * <param name="funcProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends FuncProcedure> T funcProcedureSelectSingleObject(Class<T> type, ConditionQuery funcProcedureQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.funcProcedureSelectObjects(type, funcProcedureQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int funcProcedureQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().funcProcedureQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="funcProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int funcProcedureQuerySelectObjectsCount(ConditionQuery funcProcedureQueryCondition) throws SQLException, DbException {
	String sql = funcProcedureQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.funcProcedureQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象OrmappingProject到数据库中
 * <param name="ormappingProject">需要插入的新对象</param>
 */
public void ormappingProjectInsert(OrmappingProject ormappingProject) throws SQLException, DbException {
	this.getDao().ormappingProjectInsert(ormappingProject);
	String kvalue = "";
	kvalue = (kvalue + ormappingProject.getProjId());
	this.operatesLogSimpleAdd("T_ORMAPPING_PROJECT", "插入", "PROJ_ID", kvalue, ormappingProject);
}

/**
 * 从数据库中删除一个对象OrmappingProject
 * <param name="AProjId">工程号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void ormappingProjectDeleteByProjId(int AProjId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().ormappingProjectDeleteByProjId(AProjId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AProjId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ORMAPPING_PROJECT", "删除", "PROJ_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象OrmappingProject
 * <param name="AProjId">工程号</param>
 */
public void ormappingProjectDeleteByProjId(int AProjId) throws SQLException, DbException {
	this.ormappingProjectDeleteByProjId(AProjId, "");
}

/**
 * 更新一个对象OrmappingProject到数据库中
 * <param name="ormappingProject">需要更新的OrmappingProject</param>
 */
public int ormappingProjectUpdate(OrmappingProject ormappingProject) throws SQLException, DbException {
	return this.ormappingProjectUpdate(ormappingProject, "");
}

/**
 * 更新一个对象OrmappingProject到数据库中
 * <param name="ormappingProject">需要更新的OrmappingProject</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int ormappingProjectUpdate(OrmappingProject ormappingProject, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().ormappingProjectUpdate(ormappingProject, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ormappingProject.getProjId());
	this.operatesLogSimpleAdd("T_ORMAPPING_PROJECT", "更新", "PROJ_ID", kvalue, ormappingProject);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AProjId">工程号</param>
 */
public OrmappingProject ormappingProjectSelectByProjId(int AProjId) throws SQLException, DbException {
	return this.getDao().ormappingProjectSelectByProjId(AProjId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AProjId">工程号</param>
 */
public List<OrmappingProject> ormappingProjectSelectObjectsByProjId(int AProjId) throws SQLException, DbException {
	return this.getDao().ormappingProjectSelectObjectsByProjId(AProjId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<OrmappingProject> ormappingProjectSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().ormappingProjectSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<OrmappingProject> ormappingProjectSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().ormappingProjectSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<OrmappingProject> ormappingProjectSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().ormappingProjectSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<OrmappingProject> ormappingProjectSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().ormappingProjectSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public OrmappingProject ormappingProjectSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<OrmappingProject> list = this.ormappingProjectSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(OrmappingProject.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<OrmappingProject> ormappingProjectSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.ormappingProjectSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<OrmappingProject> ormappingProjectSelectObjects() throws SQLException, DbException {
	return this.ormappingProjectSelectObjects("");
}

/**
 * @return 查询结果
 */
public OrmappingProject ormappingProjectSelectSingleObject() throws SQLException, DbException {
	return this.ormappingProjectSelectSingleObject("");
}

/**
 * <param name="ormappingProjectQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<OrmappingProject> ormappingProjectSelectObjects(ConditionQuery ormappingProjectQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = ormappingProjectQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.ormappingProjectSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="ormappingProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<OrmappingProject> ormappingProjectSelectObjects(ConditionQuery ormappingProjectQueryCondition) throws SQLException, DbException {
	String sql = ormappingProjectQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.ormappingProjectSelectObjects(sql);
}

/**
 * <param name="ormappingProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public OrmappingProject ormappingProjectSelectSingleObject(ConditionQuery ormappingProjectQueryCondition) throws SQLException, DbException {
	List<OrmappingProject> list = this.ormappingProjectSelectObjects(ormappingProjectQueryCondition);
	return common.util.ListUtil.getFirstItem(OrmappingProject.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends OrmappingProject> List<T> ormappingProjectSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().ormappingProjectSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends OrmappingProject> List<T> ormappingProjectSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().ormappingProjectSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends OrmappingProject> T ormappingProjectSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.ormappingProjectSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends OrmappingProject> List<T> ormappingProjectSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.ormappingProjectSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends OrmappingProject> List<T> ormappingProjectSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.ormappingProjectSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends OrmappingProject> T ormappingProjectSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.ormappingProjectSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="ormappingProjectQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends OrmappingProject> List<T> ormappingProjectSelectObjects(Class<T> type, ConditionQuery ormappingProjectQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = ormappingProjectQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.ormappingProjectSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="ormappingProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends OrmappingProject> List<T> ormappingProjectSelectObjects(Class<T> type, ConditionQuery ormappingProjectQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = ormappingProjectQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.ormappingProjectSelectObjects(type, sql);
}

/**
 * <param name="ormappingProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends OrmappingProject> T ormappingProjectSelectSingleObject(Class<T> type, ConditionQuery ormappingProjectQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.ormappingProjectSelectObjects(type, ormappingProjectQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int ormappingProjectQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().ormappingProjectQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="ormappingProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int ormappingProjectQuerySelectObjectsCount(ConditionQuery ormappingProjectQueryCondition) throws SQLException, DbException {
	String sql = ormappingProjectQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.ormappingProjectQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象CodeBuild到数据库中
 * <param name="codeBuild">需要插入的新对象</param>
 */
public void codeBuildInsert(CodeBuild codeBuild) throws SQLException, DbException {
	this.getDao().codeBuildInsert(codeBuild);
	String kvalue = "";
	kvalue = (kvalue + codeBuild.getBuildId());
	this.operatesLogSimpleAdd("T_CODE_BUILD", "插入", "BUILD_ID", kvalue, codeBuild);
}

/**
 * 从数据库中删除一个对象CodeBuild
 * <param name="ABuildId">构建标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void codeBuildDeleteByBuildId(int ABuildId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_CODE_BUILD].[BUILD_ID] = ");
	sql = (sql + ABuildId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().codeBuildLogSelectObjects((" inner join T_CODE_BUILD on [T_CODE_BUILD].[BUILD_ID] = [T_CODE_BUILD_LOG].[BUILD" +
"_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_CODE_BUILD", "T_CODE_BUILD_LOG"));
	}
	sql = "";
	sql = (sql + "[T_CODE_BUILD].[BUILD_ID] = ");
	sql = (sql + ABuildId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().codeBuildPropertySelectObjects((" inner join T_CODE_BUILD on [T_CODE_BUILD].[BUILD_ID] = [T_CODE_BUILD_PROPERTY].[" +
"BUILD_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_CODE_BUILD", "T_CODE_BUILD_PROPERTY"));
	}
	sql = "";
	sql = (sql + "[T_CODE_BUILD].[BUILD_ID] = ");
	sql = (sql + ABuildId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().codeBuildProcedureSelectObjects((" inner join T_CODE_BUILD on [T_CODE_BUILD].[BUILD_ID] = [T_CODE_BUILD_PROCEDURE]." +
"[BUILD_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_CODE_BUILD", "T_CODE_BUILD_PROCEDURE"));
	}
	sql = "";
	sql = (sql + "[T_CODE_BUILD].[BUILD_ID] = ");
	sql = (sql + ABuildId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().funcTestSelectObjects((" inner join T_CODE_BUILD on [T_CODE_BUILD].[BUILD_ID] = [T_FUNC_TEST].[BUILD_ID] " +
"where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_CODE_BUILD", "T_FUNC_TEST"));
	}
	sql = "";
	sql = (sql + "[T_CODE_BUILD].[BUILD_ID] = ");
	sql = (sql + ABuildId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().testProcedureSelectObjects((" inner join T_CODE_BUILD on [T_CODE_BUILD].[BUILD_ID] = [T_TEST_PROCEDURE].[BUILD" +
"_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_CODE_BUILD", "T_TEST_PROCEDURE"));
	}
	this.getDao().codeBuildDeleteByBuildId(ABuildId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ABuildId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_CODE_BUILD", "删除", "BUILD_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象CodeBuild
 * <param name="ABuildId">构建标识</param>
 */
public void codeBuildDeleteByBuildId(int ABuildId) throws SQLException, DbException {
	this.codeBuildDeleteByBuildId(ABuildId, "");
}

/**
 * 更新一个对象CodeBuild到数据库中
 * <param name="codeBuild">需要更新的CodeBuild</param>
 */
public int codeBuildUpdate(CodeBuild codeBuild) throws SQLException, DbException {
	return this.codeBuildUpdate(codeBuild, "");
}

/**
 * 更新一个对象CodeBuild到数据库中
 * <param name="codeBuild">需要更新的CodeBuild</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int codeBuildUpdate(CodeBuild codeBuild, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().codeBuildUpdate(codeBuild, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + codeBuild.getBuildId());
	this.operatesLogSimpleAdd("T_CODE_BUILD", "更新", "BUILD_ID", kvalue, codeBuild);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ABuildId">构建标识</param>
 */
public CodeBuild codeBuildSelectByBuildId(int ABuildId) throws SQLException, DbException {
	return this.getDao().codeBuildSelectByBuildId(ABuildId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<CodeBuild> codeBuildSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().codeBuildSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<CodeBuild> codeBuildSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().codeBuildSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<CodeBuild> codeBuildSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().codeBuildSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<CodeBuild> codeBuildSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().codeBuildSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public CodeBuild codeBuildSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<CodeBuild> list = this.codeBuildSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(CodeBuild.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<CodeBuild> codeBuildSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.codeBuildSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<CodeBuild> codeBuildSelectObjects() throws SQLException, DbException {
	return this.codeBuildSelectObjects("");
}

/**
 * @return 查询结果
 */
public CodeBuild codeBuildSelectSingleObject() throws SQLException, DbException {
	return this.codeBuildSelectSingleObject("");
}

/**
 * <param name="codeBuildQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<CodeBuild> codeBuildSelectObjects(ConditionQuery codeBuildQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = codeBuildQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.codeBuildSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="codeBuildQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<CodeBuild> codeBuildSelectObjects(ConditionQuery codeBuildQueryCondition) throws SQLException, DbException {
	String sql = codeBuildQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.codeBuildSelectObjects(sql);
}

/**
 * <param name="codeBuildQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public CodeBuild codeBuildSelectSingleObject(ConditionQuery codeBuildQueryCondition) throws SQLException, DbException {
	List<CodeBuild> list = this.codeBuildSelectObjects(codeBuildQueryCondition);
	return common.util.ListUtil.getFirstItem(CodeBuild.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends CodeBuild> List<T> codeBuildSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().codeBuildSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends CodeBuild> List<T> codeBuildSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().codeBuildSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends CodeBuild> T codeBuildSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.codeBuildSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends CodeBuild> List<T> codeBuildSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.codeBuildSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends CodeBuild> List<T> codeBuildSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.codeBuildSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends CodeBuild> T codeBuildSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.codeBuildSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="codeBuildQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends CodeBuild> List<T> codeBuildSelectObjects(Class<T> type, ConditionQuery codeBuildQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = codeBuildQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.codeBuildSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="codeBuildQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends CodeBuild> List<T> codeBuildSelectObjects(Class<T> type, ConditionQuery codeBuildQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = codeBuildQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.codeBuildSelectObjects(type, sql);
}

/**
 * <param name="codeBuildQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends CodeBuild> T codeBuildSelectSingleObject(Class<T> type, ConditionQuery codeBuildQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.codeBuildSelectObjects(type, codeBuildQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int codeBuildQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().codeBuildQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="codeBuildQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int codeBuildQuerySelectObjectsCount(ConditionQuery codeBuildQueryCondition) throws SQLException, DbException {
	String sql = codeBuildQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.codeBuildQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Jbpm4Deployment到数据库中
 * <param name="jbpm4Deployment">需要插入的新对象</param>
 */
public void jbpm4DeploymentInsert(Jbpm4Deployment jbpm4Deployment) throws SQLException, DbException {
	this.getDao().jbpm4DeploymentInsert(jbpm4Deployment);
	String kvalue = "";
	kvalue = (kvalue + jbpm4Deployment.getDbid());
	this.operatesLogSimpleAdd("JBPM4_DEPLOYMENT", "插入", "DBID_", kvalue, jbpm4Deployment);
}

/**
 * 从数据库中删除一个对象Jbpm4Deployment
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void jbpm4DeploymentDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[JBPM4_DEPLOYMENT].[DBID_] = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	if ((this.getDao().jbpm4DeploypropSelectObjects((" inner join JBPM4_DEPLOYMENT on [JBPM4_DEPLOYMENT].[DBID_] = [JBPM4_DEPLOYPROP].[" +
"DEPLOYMENT_] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_DEPLOYMENT", "JBPM4_DEPLOYPROP"));
	}
	sql = "";
	sql = (sql + "[JBPM4_DEPLOYMENT].[DBID_] = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	if ((this.getDao().jbpm4LobSelectObjects((" inner join JBPM4_DEPLOYMENT on [JBPM4_DEPLOYMENT].[DBID_] = [JBPM4_LOB].[DEPLOYM" +
"ENT_] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_DEPLOYMENT", "JBPM4_LOB"));
	}
	this.getDao().jbpm4DeploymentDeleteByDbid(ADbid, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ADbid);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("JBPM4_DEPLOYMENT", "删除", "DBID_", kvalue, null);
}

/**
 * 从数据库中删除一个对象Jbpm4Deployment
 * <param name="ADbid"></param>
 */
public void jbpm4DeploymentDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4DeploymentDeleteByDbid(ADbid, "");
}

/**
 * 更新一个对象Jbpm4Deployment到数据库中
 * <param name="jbpm4Deployment">需要更新的Jbpm4Deployment</param>
 */
public int jbpm4DeploymentUpdate(Jbpm4Deployment jbpm4Deployment) throws SQLException, DbException {
	return this.jbpm4DeploymentUpdate(jbpm4Deployment, "");
}

/**
 * 更新一个对象Jbpm4Deployment到数据库中
 * <param name="jbpm4Deployment">需要更新的Jbpm4Deployment</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int jbpm4DeploymentUpdate(Jbpm4Deployment jbpm4Deployment, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4DeploymentUpdate(jbpm4Deployment, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + jbpm4Deployment.getDbid());
	this.operatesLogSimpleAdd("JBPM4_DEPLOYMENT", "更新", "DBID_", kvalue, jbpm4Deployment);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
public Jbpm4Deployment jbpm4DeploymentSelectByDbid(double ADbid) throws SQLException, DbException {
	return this.getDao().jbpm4DeploymentSelectByDbid(ADbid);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Deployment> jbpm4DeploymentSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4DeploymentSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Jbpm4Deployment> jbpm4DeploymentSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().jbpm4DeploymentSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Deployment> jbpm4DeploymentSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4DeploymentSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Jbpm4Deployment> jbpm4DeploymentSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().jbpm4DeploymentSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Jbpm4Deployment jbpm4DeploymentSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Jbpm4Deployment> list = this.jbpm4DeploymentSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Jbpm4Deployment.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Deployment> jbpm4DeploymentSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.jbpm4DeploymentSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Jbpm4Deployment> jbpm4DeploymentSelectObjects() throws SQLException, DbException {
	return this.jbpm4DeploymentSelectObjects("");
}

/**
 * @return 查询结果
 */
public Jbpm4Deployment jbpm4DeploymentSelectSingleObject() throws SQLException, DbException {
	return this.jbpm4DeploymentSelectSingleObject("");
}

/**
 * <param name="jbpm4DeploymentQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Deployment> jbpm4DeploymentSelectObjects(ConditionQuery jbpm4DeploymentQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = jbpm4DeploymentQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4DeploymentSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4DeploymentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Jbpm4Deployment> jbpm4DeploymentSelectObjects(ConditionQuery jbpm4DeploymentQueryCondition) throws SQLException, DbException {
	String sql = jbpm4DeploymentQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4DeploymentSelectObjects(sql);
}

/**
 * <param name="jbpm4DeploymentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Jbpm4Deployment jbpm4DeploymentSelectSingleObject(ConditionQuery jbpm4DeploymentQueryCondition) throws SQLException, DbException {
	List<Jbpm4Deployment> list = this.jbpm4DeploymentSelectObjects(jbpm4DeploymentQueryCondition);
	return common.util.ListUtil.getFirstItem(Jbpm4Deployment.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Deployment> List<T> jbpm4DeploymentSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4DeploymentSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4Deployment> List<T> jbpm4DeploymentSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4DeploymentSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4Deployment> T jbpm4DeploymentSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4DeploymentSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Deployment> List<T> jbpm4DeploymentSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4DeploymentSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4Deployment> List<T> jbpm4DeploymentSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4DeploymentSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4Deployment> T jbpm4DeploymentSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4DeploymentSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="jbpm4DeploymentQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Deployment> List<T> jbpm4DeploymentSelectObjects(Class<T> type, ConditionQuery jbpm4DeploymentQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4DeploymentQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4DeploymentSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4DeploymentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4Deployment> List<T> jbpm4DeploymentSelectObjects(Class<T> type, ConditionQuery jbpm4DeploymentQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4DeploymentQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4DeploymentSelectObjects(type, sql);
}

/**
 * <param name="jbpm4DeploymentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4Deployment> T jbpm4DeploymentSelectSingleObject(Class<T> type, ConditionQuery jbpm4DeploymentQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4DeploymentSelectObjects(type, jbpm4DeploymentQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int jbpm4DeploymentQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4DeploymentQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="jbpm4DeploymentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int jbpm4DeploymentQuerySelectObjectsCount(ConditionQuery jbpm4DeploymentQueryCondition) throws SQLException, DbException {
	String sql = jbpm4DeploymentQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4DeploymentQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象CodeBuildLog到数据库中
 * <param name="codeBuildLog">需要插入的新对象</param>
 */
public void codeBuildLogInsert(CodeBuildLog codeBuildLog) throws SQLException, DbException {
	this.getDao().codeBuildLogInsert(codeBuildLog);
	String kvalue = "";
	kvalue = (kvalue + codeBuildLog.getBuildLogId());
	this.operatesLogSimpleAdd("T_CODE_BUILD_LOG", "插入", "BUILD_LOG_ID", kvalue, codeBuildLog);
}

/**
 * 从数据库中删除一个对象CodeBuildLog
 * <param name="ABuildLogId">构建标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void codeBuildLogDeleteByBuildLogId(int ABuildLogId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().codeBuildLogDeleteByBuildLogId(ABuildLogId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ABuildLogId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_CODE_BUILD_LOG", "删除", "BUILD_LOG_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象CodeBuildLog
 * <param name="ABuildLogId">构建标识</param>
 */
public void codeBuildLogDeleteByBuildLogId(int ABuildLogId) throws SQLException, DbException {
	this.codeBuildLogDeleteByBuildLogId(ABuildLogId, "");
}

/**
 * 从数据库中删除一批对象CodeBuildLog
 * <param name="ABuildId">构建标识</param>
 */
public void codeBuildLogDeleteListByBuildId(int ABuildId) throws SQLException, DbException {
	this.getDao().codeBuildLogDeleteListByBuildId(ABuildId);
	String kvalue = "";
	kvalue = (kvalue + ABuildId);
	this.operatesLogSimpleAdd("T_CODE_BUILD_LOG", "删除", "BUILD_ID", kvalue, null);
}

/**
 * 更新一个对象CodeBuildLog到数据库中
 * <param name="codeBuildLog">需要更新的CodeBuildLog</param>
 */
public int codeBuildLogUpdate(CodeBuildLog codeBuildLog) throws SQLException, DbException {
	return this.codeBuildLogUpdate(codeBuildLog, "");
}

/**
 * 更新一个对象CodeBuildLog到数据库中
 * <param name="codeBuildLog">需要更新的CodeBuildLog</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int codeBuildLogUpdate(CodeBuildLog codeBuildLog, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().codeBuildLogUpdate(codeBuildLog, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + codeBuildLog.getBuildLogId());
	this.operatesLogSimpleAdd("T_CODE_BUILD_LOG", "更新", "BUILD_LOG_ID", kvalue, codeBuildLog);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ABuildLogId">构建标识</param>
 */
public CodeBuildLog codeBuildLogSelectByBuildLogId(int ABuildLogId) throws SQLException, DbException {
	return this.getDao().codeBuildLogSelectByBuildLogId(ABuildLogId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ABuildId">构建标识</param>
 */
public List<CodeBuildLog> codeBuildLogSelectObjectsByBuildId(int ABuildId) throws SQLException, DbException {
	return this.getDao().codeBuildLogSelectObjectsByBuildId(ABuildId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<CodeBuildLog> codeBuildLogSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().codeBuildLogSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<CodeBuildLog> codeBuildLogSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().codeBuildLogSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<CodeBuildLog> codeBuildLogSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().codeBuildLogSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<CodeBuildLog> codeBuildLogSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().codeBuildLogSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public CodeBuildLog codeBuildLogSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<CodeBuildLog> list = this.codeBuildLogSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(CodeBuildLog.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<CodeBuildLog> codeBuildLogSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.codeBuildLogSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<CodeBuildLog> codeBuildLogSelectObjects() throws SQLException, DbException {
	return this.codeBuildLogSelectObjects("");
}

/**
 * @return 查询结果
 */
public CodeBuildLog codeBuildLogSelectSingleObject() throws SQLException, DbException {
	return this.codeBuildLogSelectSingleObject("");
}

/**
 * <param name="codeBuildLogQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<CodeBuildLog> codeBuildLogSelectObjects(ConditionQuery codeBuildLogQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = codeBuildLogQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.codeBuildLogSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="codeBuildLogQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<CodeBuildLog> codeBuildLogSelectObjects(ConditionQuery codeBuildLogQueryCondition) throws SQLException, DbException {
	String sql = codeBuildLogQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.codeBuildLogSelectObjects(sql);
}

/**
 * <param name="codeBuildLogQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public CodeBuildLog codeBuildLogSelectSingleObject(ConditionQuery codeBuildLogQueryCondition) throws SQLException, DbException {
	List<CodeBuildLog> list = this.codeBuildLogSelectObjects(codeBuildLogQueryCondition);
	return common.util.ListUtil.getFirstItem(CodeBuildLog.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends CodeBuildLog> List<T> codeBuildLogSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().codeBuildLogSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends CodeBuildLog> List<T> codeBuildLogSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().codeBuildLogSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends CodeBuildLog> T codeBuildLogSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.codeBuildLogSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends CodeBuildLog> List<T> codeBuildLogSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.codeBuildLogSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends CodeBuildLog> List<T> codeBuildLogSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.codeBuildLogSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends CodeBuildLog> T codeBuildLogSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.codeBuildLogSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="codeBuildLogQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends CodeBuildLog> List<T> codeBuildLogSelectObjects(Class<T> type, ConditionQuery codeBuildLogQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = codeBuildLogQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.codeBuildLogSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="codeBuildLogQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends CodeBuildLog> List<T> codeBuildLogSelectObjects(Class<T> type, ConditionQuery codeBuildLogQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = codeBuildLogQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.codeBuildLogSelectObjects(type, sql);
}

/**
 * <param name="codeBuildLogQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends CodeBuildLog> T codeBuildLogSelectSingleObject(Class<T> type, ConditionQuery codeBuildLogQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.codeBuildLogSelectObjects(type, codeBuildLogQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int codeBuildLogQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().codeBuildLogQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="codeBuildLogQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int codeBuildLogQuerySelectObjectsCount(ConditionQuery codeBuildLogQueryCondition) throws SQLException, DbException {
	String sql = codeBuildLogQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.codeBuildLogQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Jbpm4Deployprop到数据库中
 * <param name="jbpm4Deployprop">需要插入的新对象</param>
 */
public void jbpm4DeploypropInsert(Jbpm4Deployprop jbpm4Deployprop) throws SQLException, DbException {
	this.getDao().jbpm4DeploypropInsert(jbpm4Deployprop);
	String kvalue = "";
	kvalue = (kvalue + jbpm4Deployprop.getDbid());
	this.operatesLogSimpleAdd("JBPM4_DEPLOYPROP", "插入", "DBID_", kvalue, jbpm4Deployprop);
}

/**
 * 从数据库中删除一个对象Jbpm4Deployprop
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void jbpm4DeploypropDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().jbpm4DeploypropDeleteByDbid(ADbid, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ADbid);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("JBPM4_DEPLOYPROP", "删除", "DBID_", kvalue, null);
}

/**
 * 从数据库中删除一个对象Jbpm4Deployprop
 * <param name="ADbid"></param>
 */
public void jbpm4DeploypropDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4DeploypropDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4Deployprop
 * <param name="ADeployment"></param>
 */
public void jbpm4DeploypropDeleteListByDeployment(Double ADeployment) throws SQLException, DbException {
	this.getDao().jbpm4DeploypropDeleteListByDeployment(ADeployment);
	String kvalue = "";
	kvalue = (kvalue + ADeployment);
	this.operatesLogSimpleAdd("JBPM4_DEPLOYPROP", "删除", "DEPLOYMENT_", kvalue, null);
}

/**
 * 更新一个对象Jbpm4Deployprop到数据库中
 * <param name="jbpm4Deployprop">需要更新的Jbpm4Deployprop</param>
 */
public int jbpm4DeploypropUpdate(Jbpm4Deployprop jbpm4Deployprop) throws SQLException, DbException {
	return this.jbpm4DeploypropUpdate(jbpm4Deployprop, "");
}

/**
 * 更新一个对象Jbpm4Deployprop到数据库中
 * <param name="jbpm4Deployprop">需要更新的Jbpm4Deployprop</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int jbpm4DeploypropUpdate(Jbpm4Deployprop jbpm4Deployprop, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4DeploypropUpdate(jbpm4Deployprop, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + jbpm4Deployprop.getDbid());
	this.operatesLogSimpleAdd("JBPM4_DEPLOYPROP", "更新", "DBID_", kvalue, jbpm4Deployprop);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
public Jbpm4Deployprop jbpm4DeploypropSelectByDbid(double ADbid) throws SQLException, DbException {
	return this.getDao().jbpm4DeploypropSelectByDbid(ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ADeployment"></param>
 */
public List<Jbpm4Deployprop> jbpm4DeploypropSelectObjectsByDeployment(Double ADeployment) throws SQLException, DbException {
	return this.getDao().jbpm4DeploypropSelectObjectsByDeployment(ADeployment);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Deployprop> jbpm4DeploypropSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4DeploypropSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Jbpm4Deployprop> jbpm4DeploypropSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().jbpm4DeploypropSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Deployprop> jbpm4DeploypropSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4DeploypropSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Jbpm4Deployprop> jbpm4DeploypropSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().jbpm4DeploypropSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Jbpm4Deployprop jbpm4DeploypropSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Jbpm4Deployprop> list = this.jbpm4DeploypropSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Jbpm4Deployprop.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Deployprop> jbpm4DeploypropSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.jbpm4DeploypropSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Jbpm4Deployprop> jbpm4DeploypropSelectObjects() throws SQLException, DbException {
	return this.jbpm4DeploypropSelectObjects("");
}

/**
 * @return 查询结果
 */
public Jbpm4Deployprop jbpm4DeploypropSelectSingleObject() throws SQLException, DbException {
	return this.jbpm4DeploypropSelectSingleObject("");
}

/**
 * <param name="jbpm4DeploypropQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Deployprop> jbpm4DeploypropSelectObjects(ConditionQuery jbpm4DeploypropQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = jbpm4DeploypropQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4DeploypropSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4DeploypropQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Jbpm4Deployprop> jbpm4DeploypropSelectObjects(ConditionQuery jbpm4DeploypropQueryCondition) throws SQLException, DbException {
	String sql = jbpm4DeploypropQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4DeploypropSelectObjects(sql);
}

/**
 * <param name="jbpm4DeploypropQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Jbpm4Deployprop jbpm4DeploypropSelectSingleObject(ConditionQuery jbpm4DeploypropQueryCondition) throws SQLException, DbException {
	List<Jbpm4Deployprop> list = this.jbpm4DeploypropSelectObjects(jbpm4DeploypropQueryCondition);
	return common.util.ListUtil.getFirstItem(Jbpm4Deployprop.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Deployprop> List<T> jbpm4DeploypropSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4DeploypropSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4Deployprop> List<T> jbpm4DeploypropSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4DeploypropSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4Deployprop> T jbpm4DeploypropSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4DeploypropSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Deployprop> List<T> jbpm4DeploypropSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4DeploypropSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4Deployprop> List<T> jbpm4DeploypropSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4DeploypropSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4Deployprop> T jbpm4DeploypropSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4DeploypropSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="jbpm4DeploypropQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Deployprop> List<T> jbpm4DeploypropSelectObjects(Class<T> type, ConditionQuery jbpm4DeploypropQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4DeploypropQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4DeploypropSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4DeploypropQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4Deployprop> List<T> jbpm4DeploypropSelectObjects(Class<T> type, ConditionQuery jbpm4DeploypropQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4DeploypropQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4DeploypropSelectObjects(type, sql);
}

/**
 * <param name="jbpm4DeploypropQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4Deployprop> T jbpm4DeploypropSelectSingleObject(Class<T> type, ConditionQuery jbpm4DeploypropQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4DeploypropSelectObjects(type, jbpm4DeploypropQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int jbpm4DeploypropQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4DeploypropQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="jbpm4DeploypropQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int jbpm4DeploypropQuerySelectObjectsCount(ConditionQuery jbpm4DeploypropQueryCondition) throws SQLException, DbException {
	String sql = jbpm4DeploypropQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4DeploypropQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象CodeBuildProperty到数据库中
 * <param name="codeBuildProperty">需要插入的新对象</param>
 */
public void codeBuildPropertyInsert(CodeBuildProperty codeBuildProperty) throws SQLException, DbException {
	this.getDao().codeBuildPropertyInsert(codeBuildProperty);
	String kvalue = "";
	kvalue = (kvalue + codeBuildProperty.getBuildPropertyId());
	this.operatesLogSimpleAdd("T_CODE_BUILD_PROPERTY", "插入", "BUILD_PROPERTY_ID", kvalue, codeBuildProperty);
}

/**
 * 从数据库中删除一个对象CodeBuildProperty
 * <param name="ABuildPropertyId">属性标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void codeBuildPropertyDeleteByBuildPropertyId(int ABuildPropertyId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().codeBuildPropertyDeleteByBuildPropertyId(ABuildPropertyId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ABuildPropertyId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_CODE_BUILD_PROPERTY", "删除", "BUILD_PROPERTY_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象CodeBuildProperty
 * <param name="ABuildPropertyId">属性标识</param>
 */
public void codeBuildPropertyDeleteByBuildPropertyId(int ABuildPropertyId) throws SQLException, DbException {
	this.codeBuildPropertyDeleteByBuildPropertyId(ABuildPropertyId, "");
}

/**
 * 从数据库中删除一批对象CodeBuildProperty
 * <param name="ABuildId">构建标识</param>
 */
public void codeBuildPropertyDeleteListByBuildId(int ABuildId) throws SQLException, DbException {
	this.getDao().codeBuildPropertyDeleteListByBuildId(ABuildId);
	String kvalue = "";
	kvalue = (kvalue + ABuildId);
	this.operatesLogSimpleAdd("T_CODE_BUILD_PROPERTY", "删除", "BUILD_ID", kvalue, null);
}

/**
 * 更新一个对象CodeBuildProperty到数据库中
 * <param name="codeBuildProperty">需要更新的CodeBuildProperty</param>
 */
public int codeBuildPropertyUpdate(CodeBuildProperty codeBuildProperty) throws SQLException, DbException {
	return this.codeBuildPropertyUpdate(codeBuildProperty, "");
}

/**
 * 更新一个对象CodeBuildProperty到数据库中
 * <param name="codeBuildProperty">需要更新的CodeBuildProperty</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int codeBuildPropertyUpdate(CodeBuildProperty codeBuildProperty, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().codeBuildPropertyUpdate(codeBuildProperty, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + codeBuildProperty.getBuildPropertyId());
	this.operatesLogSimpleAdd("T_CODE_BUILD_PROPERTY", "更新", "BUILD_PROPERTY_ID", kvalue, codeBuildProperty);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ABuildPropertyId">属性标识</param>
 */
public CodeBuildProperty codeBuildPropertySelectByBuildPropertyId(int ABuildPropertyId) throws SQLException, DbException {
	return this.getDao().codeBuildPropertySelectByBuildPropertyId(ABuildPropertyId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ABuildId">构建标识</param>
 */
public List<CodeBuildProperty> codeBuildPropertySelectObjectsByBuildId(int ABuildId) throws SQLException, DbException {
	return this.getDao().codeBuildPropertySelectObjectsByBuildId(ABuildId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<CodeBuildProperty> codeBuildPropertySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().codeBuildPropertySelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<CodeBuildProperty> codeBuildPropertySelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().codeBuildPropertySelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<CodeBuildProperty> codeBuildPropertySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().codeBuildPropertySelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<CodeBuildProperty> codeBuildPropertySelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().codeBuildPropertySelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public CodeBuildProperty codeBuildPropertySelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<CodeBuildProperty> list = this.codeBuildPropertySelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(CodeBuildProperty.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<CodeBuildProperty> codeBuildPropertySelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.codeBuildPropertySelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<CodeBuildProperty> codeBuildPropertySelectObjects() throws SQLException, DbException {
	return this.codeBuildPropertySelectObjects("");
}

/**
 * @return 查询结果
 */
public CodeBuildProperty codeBuildPropertySelectSingleObject() throws SQLException, DbException {
	return this.codeBuildPropertySelectSingleObject("");
}

/**
 * <param name="codeBuildPropertyQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<CodeBuildProperty> codeBuildPropertySelectObjects(ConditionQuery codeBuildPropertyQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = codeBuildPropertyQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.codeBuildPropertySelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="codeBuildPropertyQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<CodeBuildProperty> codeBuildPropertySelectObjects(ConditionQuery codeBuildPropertyQueryCondition) throws SQLException, DbException {
	String sql = codeBuildPropertyQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.codeBuildPropertySelectObjects(sql);
}

/**
 * <param name="codeBuildPropertyQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public CodeBuildProperty codeBuildPropertySelectSingleObject(ConditionQuery codeBuildPropertyQueryCondition) throws SQLException, DbException {
	List<CodeBuildProperty> list = this.codeBuildPropertySelectObjects(codeBuildPropertyQueryCondition);
	return common.util.ListUtil.getFirstItem(CodeBuildProperty.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends CodeBuildProperty> List<T> codeBuildPropertySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().codeBuildPropertySelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends CodeBuildProperty> List<T> codeBuildPropertySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().codeBuildPropertySelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends CodeBuildProperty> T codeBuildPropertySelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.codeBuildPropertySelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends CodeBuildProperty> List<T> codeBuildPropertySelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.codeBuildPropertySelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends CodeBuildProperty> List<T> codeBuildPropertySelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.codeBuildPropertySelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends CodeBuildProperty> T codeBuildPropertySelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.codeBuildPropertySelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="codeBuildPropertyQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends CodeBuildProperty> List<T> codeBuildPropertySelectObjects(Class<T> type, ConditionQuery codeBuildPropertyQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = codeBuildPropertyQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.codeBuildPropertySelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="codeBuildPropertyQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends CodeBuildProperty> List<T> codeBuildPropertySelectObjects(Class<T> type, ConditionQuery codeBuildPropertyQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = codeBuildPropertyQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.codeBuildPropertySelectObjects(type, sql);
}

/**
 * <param name="codeBuildPropertyQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends CodeBuildProperty> T codeBuildPropertySelectSingleObject(Class<T> type, ConditionQuery codeBuildPropertyQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.codeBuildPropertySelectObjects(type, codeBuildPropertyQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int codeBuildPropertyQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().codeBuildPropertyQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="codeBuildPropertyQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int codeBuildPropertyQuerySelectObjectsCount(ConditionQuery codeBuildPropertyQueryCondition) throws SQLException, DbException {
	String sql = codeBuildPropertyQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.codeBuildPropertyQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Jbpm4Execution到数据库中
 * <param name="jbpm4Execution">需要插入的新对象</param>
 */
public void jbpm4ExecutionInsert(Jbpm4Execution jbpm4Execution) throws SQLException, DbException {
	this.getDao().jbpm4ExecutionInsert(jbpm4Execution);
	String kvalue = "";
	kvalue = (kvalue + jbpm4Execution.getDbid());
	this.operatesLogSimpleAdd("JBPM4_EXECUTION", "插入", "DBID_", kvalue, jbpm4Execution);
}

/**
 * 从数据库中删除一个对象Jbpm4Execution
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void jbpm4ExecutionDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[JBPM4_EXECUTION].[DBID_] = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	if ((this.getDao().jbpm4SwimlaneSelectObjects((" inner join JBPM4_EXECUTION on [JBPM4_EXECUTION].[DBID_] = [JBPM4_SWIMLANE].[EXEC" +
"UTION_] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_EXECUTION", "JBPM4_SWIMLANE"));
	}
	sql = "";
	sql = (sql + "[JBPM4_EXECUTION].[DBID_] = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	if ((this.getDao().jbpm4VariableSelectObjects((" inner join JBPM4_EXECUTION on [JBPM4_EXECUTION].[DBID_] = [JBPM4_VARIABLE].[EXES" +
"YS_] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_EXECUTION", "JBPM4_VARIABLE"));
	}
	this.getDao().jbpm4ExecutionDeleteByDbid(ADbid, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ADbid);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("JBPM4_EXECUTION", "删除", "DBID_", kvalue, null);
}

/**
 * 从数据库中删除一个对象Jbpm4Execution
 * <param name="ADbid"></param>
 */
public void jbpm4ExecutionDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4ExecutionDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一个对象Jbpm4Execution
 * <param name="AId"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void jbpm4ExecutionDeleteById(String AId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[JBPM4_EXECUTION].[ID_] = ");
	sql = (sql + SqlServerUtils.safeSql(AId.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().jbpm4SwimlaneSelectObjects((" inner join JBPM4_EXECUTION on [JBPM4_EXECUTION].[DBID_] = [JBPM4_SWIMLANE].[EXEC" +
"UTION_] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_EXECUTION", "JBPM4_SWIMLANE"));
	}
	sql = "";
	sql = (sql + "[JBPM4_EXECUTION].[ID_] = ");
	sql = (sql + SqlServerUtils.safeSql(AId.toString()));
	sql = (sql + appendConditionSql);
	if ((this.getDao().jbpm4VariableSelectObjects((" inner join JBPM4_EXECUTION on [JBPM4_EXECUTION].[DBID_] = [JBPM4_VARIABLE].[EXES" +
"YS_] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_EXECUTION", "JBPM4_VARIABLE"));
	}
	this.getDao().jbpm4ExecutionDeleteById(AId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("JBPM4_EXECUTION", "删除", "ID_", kvalue, null);
}

/**
 * 从数据库中删除一个对象Jbpm4Execution
 * <param name="AId"></param>
 */
public void jbpm4ExecutionDeleteById(String AId) throws SQLException, DbException {
	this.jbpm4ExecutionDeleteById(AId, "");
}

/**
 * 从数据库中删除一批对象Jbpm4Execution
 * <param name="ASubprocinst"></param>
 */
public void jbpm4ExecutionDeleteListBySubprocinst(Double ASubprocinst) throws SQLException, DbException {
	if ((this.getDao().jbpm4SwimlaneSelectObjects((" inner join JBPM4_EXECUTION on [JBPM4_EXECUTION].[DBID_] = [JBPM4_SWIMLANE].[EXEC" +
"UTION_] where [JBPM4_EXECUTION].[SUBPROCINST_] = " + ASubprocinst)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_EXECUTION", "JBPM4_SWIMLANE"));
	}
	if ((this.getDao().jbpm4VariableSelectObjects((" inner join JBPM4_EXECUTION on [JBPM4_EXECUTION].[DBID_] = [JBPM4_VARIABLE].[EXES" +
"YS_] where [JBPM4_EXECUTION].[SUBPROCINST_] = " + ASubprocinst)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_EXECUTION", "JBPM4_VARIABLE"));
	}
	this.getDao().jbpm4ExecutionDeleteListBySubprocinst(ASubprocinst);
	String kvalue = "";
	kvalue = (kvalue + ASubprocinst);
	this.operatesLogSimpleAdd("JBPM4_EXECUTION", "删除", "SUBPROCINST_", kvalue, null);
}

/**
 * 从数据库中删除一批对象Jbpm4Execution
 * <param name="AInstance"></param>
 */
public void jbpm4ExecutionDeleteListByInstance(Double AInstance) throws SQLException, DbException {
	if ((this.getDao().jbpm4SwimlaneSelectObjects((" inner join JBPM4_EXECUTION on [JBPM4_EXECUTION].[DBID_] = [JBPM4_SWIMLANE].[EXEC" +
"UTION_] where [JBPM4_EXECUTION].[INSTANCE_] = " + AInstance)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_EXECUTION", "JBPM4_SWIMLANE"));
	}
	if ((this.getDao().jbpm4VariableSelectObjects((" inner join JBPM4_EXECUTION on [JBPM4_EXECUTION].[DBID_] = [JBPM4_VARIABLE].[EXES" +
"YS_] where [JBPM4_EXECUTION].[INSTANCE_] = " + AInstance)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_EXECUTION", "JBPM4_VARIABLE"));
	}
	this.getDao().jbpm4ExecutionDeleteListByInstance(AInstance);
	String kvalue = "";
	kvalue = (kvalue + AInstance);
	this.operatesLogSimpleAdd("JBPM4_EXECUTION", "删除", "INSTANCE_", kvalue, null);
}

/**
 * 从数据库中删除一批对象Jbpm4Execution
 * <param name="ASuperexec"></param>
 */
public void jbpm4ExecutionDeleteListBySuperexec(Double ASuperexec) throws SQLException, DbException {
	if ((this.getDao().jbpm4SwimlaneSelectObjects((" inner join JBPM4_EXECUTION on [JBPM4_EXECUTION].[DBID_] = [JBPM4_SWIMLANE].[EXEC" +
"UTION_] where [JBPM4_EXECUTION].[SUPEREXEC_] = " + ASuperexec)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_EXECUTION", "JBPM4_SWIMLANE"));
	}
	if ((this.getDao().jbpm4VariableSelectObjects((" inner join JBPM4_EXECUTION on [JBPM4_EXECUTION].[DBID_] = [JBPM4_VARIABLE].[EXES" +
"YS_] where [JBPM4_EXECUTION].[SUPEREXEC_] = " + ASuperexec)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_EXECUTION", "JBPM4_VARIABLE"));
	}
	this.getDao().jbpm4ExecutionDeleteListBySuperexec(ASuperexec);
	String kvalue = "";
	kvalue = (kvalue + ASuperexec);
	this.operatesLogSimpleAdd("JBPM4_EXECUTION", "删除", "SUPEREXEC_", kvalue, null);
}

/**
 * 从数据库中删除一批对象Jbpm4Execution
 * <param name="AParent"></param>
 */
public void jbpm4ExecutionDeleteListByParent(Double AParent) throws SQLException, DbException {
	if ((this.getDao().jbpm4SwimlaneSelectObjects((" inner join JBPM4_EXECUTION on [JBPM4_EXECUTION].[DBID_] = [JBPM4_SWIMLANE].[EXEC" +
"UTION_] where [JBPM4_EXECUTION].[PARENT_] = " + AParent)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_EXECUTION", "JBPM4_SWIMLANE"));
	}
	if ((this.getDao().jbpm4VariableSelectObjects((" inner join JBPM4_EXECUTION on [JBPM4_EXECUTION].[DBID_] = [JBPM4_VARIABLE].[EXES" +
"YS_] where [JBPM4_EXECUTION].[PARENT_] = " + AParent)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_EXECUTION", "JBPM4_VARIABLE"));
	}
	this.getDao().jbpm4ExecutionDeleteListByParent(AParent);
	String kvalue = "";
	kvalue = (kvalue + AParent);
	this.operatesLogSimpleAdd("JBPM4_EXECUTION", "删除", "PARENT_", kvalue, null);
}

/**
 * 更新一个对象Jbpm4Execution到数据库中
 * <param name="jbpm4Execution">需要更新的Jbpm4Execution</param>
 */
public int jbpm4ExecutionUpdate(Jbpm4Execution jbpm4Execution) throws SQLException, DbException {
	return this.jbpm4ExecutionUpdate(jbpm4Execution, "");
}

/**
 * 更新一个对象Jbpm4Execution到数据库中
 * <param name="jbpm4Execution">需要更新的Jbpm4Execution</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int jbpm4ExecutionUpdate(Jbpm4Execution jbpm4Execution, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4ExecutionUpdate(jbpm4Execution, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + jbpm4Execution.getDbid());
	this.operatesLogSimpleAdd("JBPM4_EXECUTION", "更新", "DBID_", kvalue, jbpm4Execution);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
public Jbpm4Execution jbpm4ExecutionSelectByDbid(double ADbid) throws SQLException, DbException {
	return this.getDao().jbpm4ExecutionSelectByDbid(ADbid);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AId"></param>
 */
public Jbpm4Execution jbpm4ExecutionSelectById(String AId) throws SQLException, DbException {
	return this.getDao().jbpm4ExecutionSelectById(AId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ASubprocinst"></param>
 */
public List<Jbpm4Execution> jbpm4ExecutionSelectObjectsBySubprocinst(Double ASubprocinst) throws SQLException, DbException {
	return this.getDao().jbpm4ExecutionSelectObjectsBySubprocinst(ASubprocinst);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AInstance"></param>
 */
public List<Jbpm4Execution> jbpm4ExecutionSelectObjectsByInstance(Double AInstance) throws SQLException, DbException {
	return this.getDao().jbpm4ExecutionSelectObjectsByInstance(AInstance);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ASuperexec"></param>
 */
public List<Jbpm4Execution> jbpm4ExecutionSelectObjectsBySuperexec(Double ASuperexec) throws SQLException, DbException {
	return this.getDao().jbpm4ExecutionSelectObjectsBySuperexec(ASuperexec);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AParent"></param>
 */
public List<Jbpm4Execution> jbpm4ExecutionSelectObjectsByParent(Double AParent) throws SQLException, DbException {
	return this.getDao().jbpm4ExecutionSelectObjectsByParent(AParent);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Execution> jbpm4ExecutionSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4ExecutionSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Jbpm4Execution> jbpm4ExecutionSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().jbpm4ExecutionSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Execution> jbpm4ExecutionSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4ExecutionSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Jbpm4Execution> jbpm4ExecutionSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().jbpm4ExecutionSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Jbpm4Execution jbpm4ExecutionSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Jbpm4Execution> list = this.jbpm4ExecutionSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Jbpm4Execution.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Execution> jbpm4ExecutionSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.jbpm4ExecutionSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Jbpm4Execution> jbpm4ExecutionSelectObjects() throws SQLException, DbException {
	return this.jbpm4ExecutionSelectObjects("");
}

/**
 * @return 查询结果
 */
public Jbpm4Execution jbpm4ExecutionSelectSingleObject() throws SQLException, DbException {
	return this.jbpm4ExecutionSelectSingleObject("");
}

/**
 * <param name="jbpm4ExecutionQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Execution> jbpm4ExecutionSelectObjects(ConditionQuery jbpm4ExecutionQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = jbpm4ExecutionQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4ExecutionSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4ExecutionQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Jbpm4Execution> jbpm4ExecutionSelectObjects(ConditionQuery jbpm4ExecutionQueryCondition) throws SQLException, DbException {
	String sql = jbpm4ExecutionQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4ExecutionSelectObjects(sql);
}

/**
 * <param name="jbpm4ExecutionQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Jbpm4Execution jbpm4ExecutionSelectSingleObject(ConditionQuery jbpm4ExecutionQueryCondition) throws SQLException, DbException {
	List<Jbpm4Execution> list = this.jbpm4ExecutionSelectObjects(jbpm4ExecutionQueryCondition);
	return common.util.ListUtil.getFirstItem(Jbpm4Execution.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Execution> List<T> jbpm4ExecutionSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4ExecutionSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4Execution> List<T> jbpm4ExecutionSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4ExecutionSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4Execution> T jbpm4ExecutionSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4ExecutionSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Execution> List<T> jbpm4ExecutionSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4ExecutionSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4Execution> List<T> jbpm4ExecutionSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4ExecutionSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4Execution> T jbpm4ExecutionSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4ExecutionSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="jbpm4ExecutionQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Execution> List<T> jbpm4ExecutionSelectObjects(Class<T> type, ConditionQuery jbpm4ExecutionQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4ExecutionQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4ExecutionSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4ExecutionQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4Execution> List<T> jbpm4ExecutionSelectObjects(Class<T> type, ConditionQuery jbpm4ExecutionQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4ExecutionQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4ExecutionSelectObjects(type, sql);
}

/**
 * <param name="jbpm4ExecutionQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4Execution> T jbpm4ExecutionSelectSingleObject(Class<T> type, ConditionQuery jbpm4ExecutionQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4ExecutionSelectObjects(type, jbpm4ExecutionQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int jbpm4ExecutionQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4ExecutionQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="jbpm4ExecutionQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int jbpm4ExecutionQuerySelectObjectsCount(ConditionQuery jbpm4ExecutionQueryCondition) throws SQLException, DbException {
	String sql = jbpm4ExecutionQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4ExecutionQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象CodeBuildProcedure到数据库中
 * <param name="codeBuildProcedure">需要插入的新对象</param>
 */
public void codeBuildProcedureInsert(CodeBuildProcedure codeBuildProcedure) throws SQLException, DbException {
	this.getDao().codeBuildProcedureInsert(codeBuildProcedure);
	String kvalue = "";
	kvalue = (kvalue + codeBuildProcedure.getBuildProcedureId());
	this.operatesLogSimpleAdd("T_CODE_BUILD_PROCEDURE", "插入", "BUILD_PROCEDURE_ID", kvalue, codeBuildProcedure);
}

/**
 * 从数据库中删除一个对象CodeBuildProcedure
 * <param name="ABuildProcedureId">构建过程标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void codeBuildProcedureDeleteByBuildProcedureId(int ABuildProcedureId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().codeBuildProcedureDeleteByBuildProcedureId(ABuildProcedureId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ABuildProcedureId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_CODE_BUILD_PROCEDURE", "删除", "BUILD_PROCEDURE_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象CodeBuildProcedure
 * <param name="ABuildProcedureId">构建过程标识</param>
 */
public void codeBuildProcedureDeleteByBuildProcedureId(int ABuildProcedureId) throws SQLException, DbException {
	this.codeBuildProcedureDeleteByBuildProcedureId(ABuildProcedureId, "");
}

/**
 * 从数据库中删除一批对象CodeBuildProcedure
 * <param name="ABuildId">构建标识</param>
 */
public void codeBuildProcedureDeleteListByBuildId(int ABuildId) throws SQLException, DbException {
	this.getDao().codeBuildProcedureDeleteListByBuildId(ABuildId);
	String kvalue = "";
	kvalue = (kvalue + ABuildId);
	this.operatesLogSimpleAdd("T_CODE_BUILD_PROCEDURE", "删除", "BUILD_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象CodeBuildProcedure
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
public void codeBuildProcedureDeleteListByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException {
	this.getDao().codeBuildProcedureDeleteListByFuncProcedureId(AFuncProcedureId);
	String kvalue = "";
	kvalue = (kvalue + AFuncProcedureId);
	this.operatesLogSimpleAdd("T_CODE_BUILD_PROCEDURE", "删除", "FUNC_PROCEDURE_ID", kvalue, null);
}

/**
 * 更新一个对象CodeBuildProcedure到数据库中
 * <param name="codeBuildProcedure">需要更新的CodeBuildProcedure</param>
 */
public int codeBuildProcedureUpdate(CodeBuildProcedure codeBuildProcedure) throws SQLException, DbException {
	return this.codeBuildProcedureUpdate(codeBuildProcedure, "");
}

/**
 * 更新一个对象CodeBuildProcedure到数据库中
 * <param name="codeBuildProcedure">需要更新的CodeBuildProcedure</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int codeBuildProcedureUpdate(CodeBuildProcedure codeBuildProcedure, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().codeBuildProcedureUpdate(codeBuildProcedure, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + codeBuildProcedure.getBuildProcedureId());
	this.operatesLogSimpleAdd("T_CODE_BUILD_PROCEDURE", "更新", "BUILD_PROCEDURE_ID", kvalue, codeBuildProcedure);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ABuildProcedureId">构建过程标识</param>
 */
public CodeBuildProcedure codeBuildProcedureSelectByBuildProcedureId(int ABuildProcedureId) throws SQLException, DbException {
	return this.getDao().codeBuildProcedureSelectByBuildProcedureId(ABuildProcedureId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ABuildId">构建标识</param>
 */
public List<CodeBuildProcedure> codeBuildProcedureSelectObjectsByBuildId(int ABuildId) throws SQLException, DbException {
	return this.getDao().codeBuildProcedureSelectObjectsByBuildId(ABuildId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
public List<CodeBuildProcedure> codeBuildProcedureSelectObjectsByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException {
	return this.getDao().codeBuildProcedureSelectObjectsByFuncProcedureId(AFuncProcedureId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<CodeBuildProcedure> codeBuildProcedureSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().codeBuildProcedureSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<CodeBuildProcedure> codeBuildProcedureSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().codeBuildProcedureSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<CodeBuildProcedure> codeBuildProcedureSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().codeBuildProcedureSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<CodeBuildProcedure> codeBuildProcedureSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().codeBuildProcedureSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public CodeBuildProcedure codeBuildProcedureSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<CodeBuildProcedure> list = this.codeBuildProcedureSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(CodeBuildProcedure.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<CodeBuildProcedure> codeBuildProcedureSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.codeBuildProcedureSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<CodeBuildProcedure> codeBuildProcedureSelectObjects() throws SQLException, DbException {
	return this.codeBuildProcedureSelectObjects("");
}

/**
 * @return 查询结果
 */
public CodeBuildProcedure codeBuildProcedureSelectSingleObject() throws SQLException, DbException {
	return this.codeBuildProcedureSelectSingleObject("");
}

/**
 * <param name="codeBuildProcedureQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<CodeBuildProcedure> codeBuildProcedureSelectObjects(ConditionQuery codeBuildProcedureQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = codeBuildProcedureQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.codeBuildProcedureSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="codeBuildProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<CodeBuildProcedure> codeBuildProcedureSelectObjects(ConditionQuery codeBuildProcedureQueryCondition) throws SQLException, DbException {
	String sql = codeBuildProcedureQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.codeBuildProcedureSelectObjects(sql);
}

/**
 * <param name="codeBuildProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public CodeBuildProcedure codeBuildProcedureSelectSingleObject(ConditionQuery codeBuildProcedureQueryCondition) throws SQLException, DbException {
	List<CodeBuildProcedure> list = this.codeBuildProcedureSelectObjects(codeBuildProcedureQueryCondition);
	return common.util.ListUtil.getFirstItem(CodeBuildProcedure.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends CodeBuildProcedure> List<T> codeBuildProcedureSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().codeBuildProcedureSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends CodeBuildProcedure> List<T> codeBuildProcedureSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().codeBuildProcedureSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends CodeBuildProcedure> T codeBuildProcedureSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.codeBuildProcedureSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends CodeBuildProcedure> List<T> codeBuildProcedureSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.codeBuildProcedureSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends CodeBuildProcedure> List<T> codeBuildProcedureSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.codeBuildProcedureSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends CodeBuildProcedure> T codeBuildProcedureSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.codeBuildProcedureSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="codeBuildProcedureQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends CodeBuildProcedure> List<T> codeBuildProcedureSelectObjects(Class<T> type, ConditionQuery codeBuildProcedureQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = codeBuildProcedureQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.codeBuildProcedureSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="codeBuildProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends CodeBuildProcedure> List<T> codeBuildProcedureSelectObjects(Class<T> type, ConditionQuery codeBuildProcedureQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = codeBuildProcedureQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.codeBuildProcedureSelectObjects(type, sql);
}

/**
 * <param name="codeBuildProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends CodeBuildProcedure> T codeBuildProcedureSelectSingleObject(Class<T> type, ConditionQuery codeBuildProcedureQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.codeBuildProcedureSelectObjects(type, codeBuildProcedureQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int codeBuildProcedureQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().codeBuildProcedureQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="codeBuildProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int codeBuildProcedureQuerySelectObjectsCount(ConditionQuery codeBuildProcedureQueryCondition) throws SQLException, DbException {
	String sql = codeBuildProcedureQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.codeBuildProcedureQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Jbpm4HistActinst到数据库中
 * <param name="jbpm4HistActinst">需要插入的新对象</param>
 */
public void jbpm4HistActinstInsert(Jbpm4HistActinst jbpm4HistActinst) throws SQLException, DbException {
	this.getDao().jbpm4HistActinstInsert(jbpm4HistActinst);
	String kvalue = "";
	kvalue = (kvalue + jbpm4HistActinst.getDbid());
	this.operatesLogSimpleAdd("JBPM4_HIST_ACTINST", "插入", "DBID_", kvalue, jbpm4HistActinst);
}

/**
 * 从数据库中删除一个对象Jbpm4HistActinst
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void jbpm4HistActinstDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[JBPM4_HIST_ACTINST].[DBID_] = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	if ((this.getDao().jbpm4HistDetailSelectObjects((" inner join JBPM4_HIST_ACTINST on [JBPM4_HIST_ACTINST].[DBID_] = [JBPM4_HIST_DETA" +
"IL].[HACTI_] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_HIST_ACTINST", "JBPM4_HIST_DETAIL"));
	}
	this.getDao().jbpm4HistActinstDeleteByDbid(ADbid, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ADbid);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("JBPM4_HIST_ACTINST", "删除", "DBID_", kvalue, null);
}

/**
 * 从数据库中删除一个对象Jbpm4HistActinst
 * <param name="ADbid"></param>
 */
public void jbpm4HistActinstDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4HistActinstDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4HistActinst
 * <param name="AHproci"></param>
 */
public void jbpm4HistActinstDeleteListByHproci(Double AHproci) throws SQLException, DbException {
	if ((this.getDao().jbpm4HistDetailSelectObjects((" inner join JBPM4_HIST_ACTINST on [JBPM4_HIST_ACTINST].[DBID_] = [JBPM4_HIST_DETA" +
"IL].[HACTI_] where [JBPM4_HIST_ACTINST].[HPROCI_] = " + AHproci)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_HIST_ACTINST", "JBPM4_HIST_DETAIL"));
	}
	this.getDao().jbpm4HistActinstDeleteListByHproci(AHproci);
	String kvalue = "";
	kvalue = (kvalue + AHproci);
	this.operatesLogSimpleAdd("JBPM4_HIST_ACTINST", "删除", "HPROCI_", kvalue, null);
}

/**
 * 从数据库中删除一批对象Jbpm4HistActinst
 * <param name="AHtask"></param>
 */
public void jbpm4HistActinstDeleteListByHtask(Double AHtask) throws SQLException, DbException {
	if ((this.getDao().jbpm4HistDetailSelectObjects((" inner join JBPM4_HIST_ACTINST on [JBPM4_HIST_ACTINST].[DBID_] = [JBPM4_HIST_DETA" +
"IL].[HACTI_] where [JBPM4_HIST_ACTINST].[HTASK_] = " + AHtask)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_HIST_ACTINST", "JBPM4_HIST_DETAIL"));
	}
	this.getDao().jbpm4HistActinstDeleteListByHtask(AHtask);
	String kvalue = "";
	kvalue = (kvalue + AHtask);
	this.operatesLogSimpleAdd("JBPM4_HIST_ACTINST", "删除", "HTASK_", kvalue, null);
}

/**
 * 更新一个对象Jbpm4HistActinst到数据库中
 * <param name="jbpm4HistActinst">需要更新的Jbpm4HistActinst</param>
 */
public int jbpm4HistActinstUpdate(Jbpm4HistActinst jbpm4HistActinst) throws SQLException, DbException {
	return this.jbpm4HistActinstUpdate(jbpm4HistActinst, "");
}

/**
 * 更新一个对象Jbpm4HistActinst到数据库中
 * <param name="jbpm4HistActinst">需要更新的Jbpm4HistActinst</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int jbpm4HistActinstUpdate(Jbpm4HistActinst jbpm4HistActinst, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4HistActinstUpdate(jbpm4HistActinst, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + jbpm4HistActinst.getDbid());
	this.operatesLogSimpleAdd("JBPM4_HIST_ACTINST", "更新", "DBID_", kvalue, jbpm4HistActinst);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
public Jbpm4HistActinst jbpm4HistActinstSelectByDbid(double ADbid) throws SQLException, DbException {
	return this.getDao().jbpm4HistActinstSelectByDbid(ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHproci"></param>
 */
public List<Jbpm4HistActinst> jbpm4HistActinstSelectObjectsByHproci(Double AHproci) throws SQLException, DbException {
	return this.getDao().jbpm4HistActinstSelectObjectsByHproci(AHproci);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHtask"></param>
 */
public List<Jbpm4HistActinst> jbpm4HistActinstSelectObjectsByHtask(Double AHtask) throws SQLException, DbException {
	return this.getDao().jbpm4HistActinstSelectObjectsByHtask(AHtask);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4HistActinst> jbpm4HistActinstSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4HistActinstSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Jbpm4HistActinst> jbpm4HistActinstSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().jbpm4HistActinstSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4HistActinst> jbpm4HistActinstSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4HistActinstSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Jbpm4HistActinst> jbpm4HistActinstSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().jbpm4HistActinstSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Jbpm4HistActinst jbpm4HistActinstSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Jbpm4HistActinst> list = this.jbpm4HistActinstSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Jbpm4HistActinst.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4HistActinst> jbpm4HistActinstSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.jbpm4HistActinstSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Jbpm4HistActinst> jbpm4HistActinstSelectObjects() throws SQLException, DbException {
	return this.jbpm4HistActinstSelectObjects("");
}

/**
 * @return 查询结果
 */
public Jbpm4HistActinst jbpm4HistActinstSelectSingleObject() throws SQLException, DbException {
	return this.jbpm4HistActinstSelectSingleObject("");
}

/**
 * <param name="jbpm4HistActinstQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4HistActinst> jbpm4HistActinstSelectObjects(ConditionQuery jbpm4HistActinstQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = jbpm4HistActinstQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistActinstSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4HistActinstQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Jbpm4HistActinst> jbpm4HistActinstSelectObjects(ConditionQuery jbpm4HistActinstQueryCondition) throws SQLException, DbException {
	String sql = jbpm4HistActinstQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistActinstSelectObjects(sql);
}

/**
 * <param name="jbpm4HistActinstQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Jbpm4HistActinst jbpm4HistActinstSelectSingleObject(ConditionQuery jbpm4HistActinstQueryCondition) throws SQLException, DbException {
	List<Jbpm4HistActinst> list = this.jbpm4HistActinstSelectObjects(jbpm4HistActinstQueryCondition);
	return common.util.ListUtil.getFirstItem(Jbpm4HistActinst.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistActinst> List<T> jbpm4HistActinstSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4HistActinstSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistActinst> List<T> jbpm4HistActinstSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4HistActinstSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistActinst> T jbpm4HistActinstSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4HistActinstSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistActinst> List<T> jbpm4HistActinstSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4HistActinstSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4HistActinst> List<T> jbpm4HistActinstSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4HistActinstSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4HistActinst> T jbpm4HistActinstSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4HistActinstSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="jbpm4HistActinstQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistActinst> List<T> jbpm4HistActinstSelectObjects(Class<T> type, ConditionQuery jbpm4HistActinstQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4HistActinstQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistActinstSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4HistActinstQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistActinst> List<T> jbpm4HistActinstSelectObjects(Class<T> type, ConditionQuery jbpm4HistActinstQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4HistActinstQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistActinstSelectObjects(type, sql);
}

/**
 * <param name="jbpm4HistActinstQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistActinst> T jbpm4HistActinstSelectSingleObject(Class<T> type, ConditionQuery jbpm4HistActinstQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4HistActinstSelectObjects(type, jbpm4HistActinstQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int jbpm4HistActinstQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4HistActinstQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="jbpm4HistActinstQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int jbpm4HistActinstQuerySelectObjectsCount(ConditionQuery jbpm4HistActinstQueryCondition) throws SQLException, DbException {
	String sql = jbpm4HistActinstQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistActinstQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象IssueUserDefaultQuery到数据库中
 * <param name="issueUserDefaultQuery">需要插入的新对象</param>
 */
public void issueUserDefaultQueryInsert(IssueUserDefaultQuery issueUserDefaultQuery) throws SQLException, DbException {
	this.getDao().issueUserDefaultQueryInsert(issueUserDefaultQuery);
	String kvalue = "";
	kvalue = (kvalue + issueUserDefaultQuery.getIssueProjectId());
	kvalue = (kvalue + ",");
	kvalue = (kvalue + issueUserDefaultQuery.getIssueUserId());
	this.operatesLogSimpleAdd("T_ISSUE_USER_DEFAULT_QUERY", "插入", "ISSUE_PROJECT_ID,ISSUE_USER_ID", kvalue, issueUserDefaultQuery);
}

/**
 * 从数据库中删除一个对象IssueUserDefaultQuery
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void issueUserDefaultQueryDeleteByIssueProjectIdIssueUserId(int AIssueProjectId, int AIssueUserId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().issueUserDefaultQueryDeleteByIssueProjectIdIssueUserId(AIssueProjectId, AIssueUserId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AIssueProjectId);
	kvalue = (kvalue + ",");
	kvalue = (kvalue + AIssueUserId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ISSUE_USER_DEFAULT_QUERY", "删除", "ISSUE_PROJECT_ID,ISSUE_USER_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象IssueUserDefaultQuery
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 */
public void issueUserDefaultQueryDeleteByIssueProjectIdIssueUserId(int AIssueProjectId, int AIssueUserId) throws SQLException, DbException {
	this.issueUserDefaultQueryDeleteByIssueProjectIdIssueUserId(AIssueProjectId, AIssueUserId, "");
}

/**
 * 从数据库中删除一批对象IssueUserDefaultQuery
 * <param name="AIssueProjectId">标识</param>
 */
public void issueUserDefaultQueryDeleteListByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	this.getDao().issueUserDefaultQueryDeleteListByIssueProjectId(AIssueProjectId);
	String kvalue = "";
	kvalue = (kvalue + AIssueProjectId);
	this.operatesLogSimpleAdd("T_ISSUE_USER_DEFAULT_QUERY", "删除", "ISSUE_PROJECT_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象IssueUserDefaultQuery
 * <param name="AIssueQueryId">标识</param>
 */
public void issueUserDefaultQueryDeleteListByIssueQueryId(int AIssueQueryId) throws SQLException, DbException {
	this.getDao().issueUserDefaultQueryDeleteListByIssueQueryId(AIssueQueryId);
	String kvalue = "";
	kvalue = (kvalue + AIssueQueryId);
	this.operatesLogSimpleAdd("T_ISSUE_USER_DEFAULT_QUERY", "删除", "ISSUE_QUERY_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象IssueUserDefaultQuery
 * <param name="AIssueUserId">用户标识</param>
 */
public void issueUserDefaultQueryDeleteListByIssueUserId(int AIssueUserId) throws SQLException, DbException {
	this.getDao().issueUserDefaultQueryDeleteListByIssueUserId(AIssueUserId);
	String kvalue = "";
	kvalue = (kvalue + AIssueUserId);
	this.operatesLogSimpleAdd("T_ISSUE_USER_DEFAULT_QUERY", "删除", "ISSUE_USER_ID", kvalue, null);
}

/**
 * 更新一个对象IssueUserDefaultQuery到数据库中
 * <param name="issueUserDefaultQuery">需要更新的IssueUserDefaultQuery</param>
 */
public int issueUserDefaultQueryUpdate(IssueUserDefaultQuery issueUserDefaultQuery) throws SQLException, DbException {
	return this.issueUserDefaultQueryUpdate(issueUserDefaultQuery, "");
}

/**
 * 更新一个对象IssueUserDefaultQuery到数据库中
 * <param name="issueUserDefaultQuery">需要更新的IssueUserDefaultQuery</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int issueUserDefaultQueryUpdate(IssueUserDefaultQuery issueUserDefaultQuery, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueUserDefaultQueryUpdate(issueUserDefaultQuery, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + issueUserDefaultQuery.getIssueProjectId());
	kvalue = (kvalue + ",");
	kvalue = (kvalue + issueUserDefaultQuery.getIssueUserId());
	this.operatesLogSimpleAdd("T_ISSUE_USER_DEFAULT_QUERY", "更新", "ISSUE_PROJECT_ID,ISSUE_USER_ID", kvalue, issueUserDefaultQuery);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 */
public IssueUserDefaultQuery issueUserDefaultQuerySelectByIssueProjectIdIssueUserId(int AIssueProjectId, int AIssueUserId) throws SQLException, DbException {
	return this.getDao().issueUserDefaultQuerySelectByIssueProjectIdIssueUserId(AIssueProjectId, AIssueUserId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectId">标识</param>
 */
public List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjectsByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	return this.getDao().issueUserDefaultQuerySelectObjectsByIssueProjectId(AIssueProjectId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueQueryId">标识</param>
 */
public List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjectsByIssueQueryId(int AIssueQueryId) throws SQLException, DbException {
	return this.getDao().issueUserDefaultQuerySelectObjectsByIssueQueryId(AIssueQueryId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueUserId">用户标识</param>
 */
public List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjectsByIssueUserId(int AIssueUserId) throws SQLException, DbException {
	return this.getDao().issueUserDefaultQuerySelectObjectsByIssueUserId(AIssueUserId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueUserDefaultQuerySelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().issueUserDefaultQuerySelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueUserDefaultQuerySelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().issueUserDefaultQuerySelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public IssueUserDefaultQuery issueUserDefaultQuerySelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<IssueUserDefaultQuery> list = this.issueUserDefaultQuerySelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(IssueUserDefaultQuery.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.issueUserDefaultQuerySelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjects() throws SQLException, DbException {
	return this.issueUserDefaultQuerySelectObjects("");
}

/**
 * @return 查询结果
 */
public IssueUserDefaultQuery issueUserDefaultQuerySelectSingleObject() throws SQLException, DbException {
	return this.issueUserDefaultQuerySelectSingleObject("");
}

/**
 * <param name="issueUserDefaultQueryQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjects(ConditionQuery issueUserDefaultQueryQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = issueUserDefaultQueryQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueUserDefaultQuerySelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueUserDefaultQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjects(ConditionQuery issueUserDefaultQueryQueryCondition) throws SQLException, DbException {
	String sql = issueUserDefaultQueryQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueUserDefaultQuerySelectObjects(sql);
}

/**
 * <param name="issueUserDefaultQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public IssueUserDefaultQuery issueUserDefaultQuerySelectSingleObject(ConditionQuery issueUserDefaultQueryQueryCondition) throws SQLException, DbException {
	List<IssueUserDefaultQuery> list = this.issueUserDefaultQuerySelectObjects(issueUserDefaultQueryQueryCondition);
	return common.util.ListUtil.getFirstItem(IssueUserDefaultQuery.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueUserDefaultQuery> List<T> issueUserDefaultQuerySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueUserDefaultQuerySelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueUserDefaultQuery> List<T> issueUserDefaultQuerySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueUserDefaultQuerySelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueUserDefaultQuery> T issueUserDefaultQuerySelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueUserDefaultQuerySelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueUserDefaultQuery> List<T> issueUserDefaultQuerySelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueUserDefaultQuerySelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends IssueUserDefaultQuery> List<T> issueUserDefaultQuerySelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueUserDefaultQuerySelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends IssueUserDefaultQuery> T issueUserDefaultQuerySelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueUserDefaultQuerySelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="issueUserDefaultQueryQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueUserDefaultQuery> List<T> issueUserDefaultQuerySelectObjects(Class<T> type, ConditionQuery issueUserDefaultQueryQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueUserDefaultQueryQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueUserDefaultQuerySelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueUserDefaultQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueUserDefaultQuery> List<T> issueUserDefaultQuerySelectObjects(Class<T> type, ConditionQuery issueUserDefaultQueryQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueUserDefaultQueryQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueUserDefaultQuerySelectObjects(type, sql);
}

/**
 * <param name="issueUserDefaultQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueUserDefaultQuery> T issueUserDefaultQuerySelectSingleObject(Class<T> type, ConditionQuery issueUserDefaultQueryQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueUserDefaultQuerySelectObjects(type, issueUserDefaultQueryQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int issueUserDefaultQueryQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueUserDefaultQueryQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="issueUserDefaultQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int issueUserDefaultQueryQuerySelectObjectsCount(ConditionQuery issueUserDefaultQueryQueryCondition) throws SQLException, DbException {
	String sql = issueUserDefaultQueryQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueUserDefaultQueryQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Jbpm4HistDetail到数据库中
 * <param name="jbpm4HistDetail">需要插入的新对象</param>
 */
public void jbpm4HistDetailInsert(Jbpm4HistDetail jbpm4HistDetail) throws SQLException, DbException {
	this.getDao().jbpm4HistDetailInsert(jbpm4HistDetail);
	String kvalue = "";
	kvalue = (kvalue + jbpm4HistDetail.getDbid());
	this.operatesLogSimpleAdd("JBPM4_HIST_DETAIL", "插入", "DBID_", kvalue, jbpm4HistDetail);
}

/**
 * 从数据库中删除一个对象Jbpm4HistDetail
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void jbpm4HistDetailDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().jbpm4HistDetailDeleteByDbid(ADbid, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ADbid);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("JBPM4_HIST_DETAIL", "删除", "DBID_", kvalue, null);
}

/**
 * 从数据库中删除一个对象Jbpm4HistDetail
 * <param name="ADbid"></param>
 */
public void jbpm4HistDetailDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4HistDetailDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4HistDetail
 * <param name="AHacti"></param>
 */
public void jbpm4HistDetailDeleteListByHacti(Double AHacti) throws SQLException, DbException {
	this.getDao().jbpm4HistDetailDeleteListByHacti(AHacti);
	String kvalue = "";
	kvalue = (kvalue + AHacti);
	this.operatesLogSimpleAdd("JBPM4_HIST_DETAIL", "删除", "HACTI_", kvalue, null);
}

/**
 * 从数据库中删除一批对象Jbpm4HistDetail
 * <param name="AHproci"></param>
 */
public void jbpm4HistDetailDeleteListByHproci(Double AHproci) throws SQLException, DbException {
	this.getDao().jbpm4HistDetailDeleteListByHproci(AHproci);
	String kvalue = "";
	kvalue = (kvalue + AHproci);
	this.operatesLogSimpleAdd("JBPM4_HIST_DETAIL", "删除", "HPROCI_", kvalue, null);
}

/**
 * 从数据库中删除一批对象Jbpm4HistDetail
 * <param name="AHtask"></param>
 */
public void jbpm4HistDetailDeleteListByHtask(Double AHtask) throws SQLException, DbException {
	this.getDao().jbpm4HistDetailDeleteListByHtask(AHtask);
	String kvalue = "";
	kvalue = (kvalue + AHtask);
	this.operatesLogSimpleAdd("JBPM4_HIST_DETAIL", "删除", "HTASK_", kvalue, null);
}

/**
 * 从数据库中删除一批对象Jbpm4HistDetail
 * <param name="AHvar"></param>
 */
public void jbpm4HistDetailDeleteListByHvar(Double AHvar) throws SQLException, DbException {
	this.getDao().jbpm4HistDetailDeleteListByHvar(AHvar);
	String kvalue = "";
	kvalue = (kvalue + AHvar);
	this.operatesLogSimpleAdd("JBPM4_HIST_DETAIL", "删除", "HVAR_", kvalue, null);
}

/**
 * 更新一个对象Jbpm4HistDetail到数据库中
 * <param name="jbpm4HistDetail">需要更新的Jbpm4HistDetail</param>
 */
public int jbpm4HistDetailUpdate(Jbpm4HistDetail jbpm4HistDetail) throws SQLException, DbException {
	return this.jbpm4HistDetailUpdate(jbpm4HistDetail, "");
}

/**
 * 更新一个对象Jbpm4HistDetail到数据库中
 * <param name="jbpm4HistDetail">需要更新的Jbpm4HistDetail</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int jbpm4HistDetailUpdate(Jbpm4HistDetail jbpm4HistDetail, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4HistDetailUpdate(jbpm4HistDetail, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + jbpm4HistDetail.getDbid());
	this.operatesLogSimpleAdd("JBPM4_HIST_DETAIL", "更新", "DBID_", kvalue, jbpm4HistDetail);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
public Jbpm4HistDetail jbpm4HistDetailSelectByDbid(double ADbid) throws SQLException, DbException {
	return this.getDao().jbpm4HistDetailSelectByDbid(ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHacti"></param>
 */
public List<Jbpm4HistDetail> jbpm4HistDetailSelectObjectsByHacti(Double AHacti) throws SQLException, DbException {
	return this.getDao().jbpm4HistDetailSelectObjectsByHacti(AHacti);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHproci"></param>
 */
public List<Jbpm4HistDetail> jbpm4HistDetailSelectObjectsByHproci(Double AHproci) throws SQLException, DbException {
	return this.getDao().jbpm4HistDetailSelectObjectsByHproci(AHproci);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHtask"></param>
 */
public List<Jbpm4HistDetail> jbpm4HistDetailSelectObjectsByHtask(Double AHtask) throws SQLException, DbException {
	return this.getDao().jbpm4HistDetailSelectObjectsByHtask(AHtask);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHvar"></param>
 */
public List<Jbpm4HistDetail> jbpm4HistDetailSelectObjectsByHvar(Double AHvar) throws SQLException, DbException {
	return this.getDao().jbpm4HistDetailSelectObjectsByHvar(AHvar);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4HistDetail> jbpm4HistDetailSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4HistDetailSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Jbpm4HistDetail> jbpm4HistDetailSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().jbpm4HistDetailSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4HistDetail> jbpm4HistDetailSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4HistDetailSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Jbpm4HistDetail> jbpm4HistDetailSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().jbpm4HistDetailSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Jbpm4HistDetail jbpm4HistDetailSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Jbpm4HistDetail> list = this.jbpm4HistDetailSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Jbpm4HistDetail.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4HistDetail> jbpm4HistDetailSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.jbpm4HistDetailSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Jbpm4HistDetail> jbpm4HistDetailSelectObjects() throws SQLException, DbException {
	return this.jbpm4HistDetailSelectObjects("");
}

/**
 * @return 查询结果
 */
public Jbpm4HistDetail jbpm4HistDetailSelectSingleObject() throws SQLException, DbException {
	return this.jbpm4HistDetailSelectSingleObject("");
}

/**
 * <param name="jbpm4HistDetailQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4HistDetail> jbpm4HistDetailSelectObjects(ConditionQuery jbpm4HistDetailQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = jbpm4HistDetailQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistDetailSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4HistDetailQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Jbpm4HistDetail> jbpm4HistDetailSelectObjects(ConditionQuery jbpm4HistDetailQueryCondition) throws SQLException, DbException {
	String sql = jbpm4HistDetailQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistDetailSelectObjects(sql);
}

/**
 * <param name="jbpm4HistDetailQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Jbpm4HistDetail jbpm4HistDetailSelectSingleObject(ConditionQuery jbpm4HistDetailQueryCondition) throws SQLException, DbException {
	List<Jbpm4HistDetail> list = this.jbpm4HistDetailSelectObjects(jbpm4HistDetailQueryCondition);
	return common.util.ListUtil.getFirstItem(Jbpm4HistDetail.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistDetail> List<T> jbpm4HistDetailSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4HistDetailSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistDetail> List<T> jbpm4HistDetailSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4HistDetailSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistDetail> T jbpm4HistDetailSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4HistDetailSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistDetail> List<T> jbpm4HistDetailSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4HistDetailSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4HistDetail> List<T> jbpm4HistDetailSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4HistDetailSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4HistDetail> T jbpm4HistDetailSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4HistDetailSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="jbpm4HistDetailQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistDetail> List<T> jbpm4HistDetailSelectObjects(Class<T> type, ConditionQuery jbpm4HistDetailQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4HistDetailQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistDetailSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4HistDetailQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistDetail> List<T> jbpm4HistDetailSelectObjects(Class<T> type, ConditionQuery jbpm4HistDetailQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4HistDetailQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistDetailSelectObjects(type, sql);
}

/**
 * <param name="jbpm4HistDetailQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistDetail> T jbpm4HistDetailSelectSingleObject(Class<T> type, ConditionQuery jbpm4HistDetailQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4HistDetailSelectObjects(type, jbpm4HistDetailQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int jbpm4HistDetailQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4HistDetailQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="jbpm4HistDetailQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int jbpm4HistDetailQuerySelectObjectsCount(ConditionQuery jbpm4HistDetailQueryCondition) throws SQLException, DbException {
	String sql = jbpm4HistDetailQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistDetailQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Jbpm4HistProcinst到数据库中
 * <param name="jbpm4HistProcinst">需要插入的新对象</param>
 */
public void jbpm4HistProcinstInsert(Jbpm4HistProcinst jbpm4HistProcinst) throws SQLException, DbException {
	this.getDao().jbpm4HistProcinstInsert(jbpm4HistProcinst);
	String kvalue = "";
	kvalue = (kvalue + jbpm4HistProcinst.getDbid());
	this.operatesLogSimpleAdd("JBPM4_HIST_PROCINST", "插入", "DBID_", kvalue, jbpm4HistProcinst);
}

/**
 * 从数据库中删除一个对象Jbpm4HistProcinst
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void jbpm4HistProcinstDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[JBPM4_HIST_PROCINST].[DBID_] = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	if ((this.getDao().jbpm4HistActinstSelectObjects((" inner join JBPM4_HIST_PROCINST on [JBPM4_HIST_PROCINST].[DBID_] = [JBPM4_HIST_AC" +
"TINST].[HPROCI_] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_HIST_PROCINST", "JBPM4_HIST_ACTINST"));
	}
	sql = "";
	sql = (sql + "[JBPM4_HIST_PROCINST].[DBID_] = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	if ((this.getDao().jbpm4HistDetailSelectObjects((" inner join JBPM4_HIST_PROCINST on [JBPM4_HIST_PROCINST].[DBID_] = [JBPM4_HIST_DE" +
"TAIL].[HPROCI_] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_HIST_PROCINST", "JBPM4_HIST_DETAIL"));
	}
	sql = "";
	sql = (sql + "[JBPM4_HIST_PROCINST].[DBID_] = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	if ((this.getDao().jbpm4HistVarSelectObjects((" inner join JBPM4_HIST_PROCINST on [JBPM4_HIST_PROCINST].[DBID_] = [JBPM4_HIST_VA" +
"R].[HPROCI_] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_HIST_PROCINST", "JBPM4_HIST_VAR"));
	}
	this.getDao().jbpm4HistProcinstDeleteByDbid(ADbid, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ADbid);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("JBPM4_HIST_PROCINST", "删除", "DBID_", kvalue, null);
}

/**
 * 从数据库中删除一个对象Jbpm4HistProcinst
 * <param name="ADbid"></param>
 */
public void jbpm4HistProcinstDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4HistProcinstDeleteByDbid(ADbid, "");
}

/**
 * 更新一个对象Jbpm4HistProcinst到数据库中
 * <param name="jbpm4HistProcinst">需要更新的Jbpm4HistProcinst</param>
 */
public int jbpm4HistProcinstUpdate(Jbpm4HistProcinst jbpm4HistProcinst) throws SQLException, DbException {
	return this.jbpm4HistProcinstUpdate(jbpm4HistProcinst, "");
}

/**
 * 更新一个对象Jbpm4HistProcinst到数据库中
 * <param name="jbpm4HistProcinst">需要更新的Jbpm4HistProcinst</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int jbpm4HistProcinstUpdate(Jbpm4HistProcinst jbpm4HistProcinst, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4HistProcinstUpdate(jbpm4HistProcinst, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + jbpm4HistProcinst.getDbid());
	this.operatesLogSimpleAdd("JBPM4_HIST_PROCINST", "更新", "DBID_", kvalue, jbpm4HistProcinst);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
public Jbpm4HistProcinst jbpm4HistProcinstSelectByDbid(double ADbid) throws SQLException, DbException {
	return this.getDao().jbpm4HistProcinstSelectByDbid(ADbid);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4HistProcinst> jbpm4HistProcinstSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4HistProcinstSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Jbpm4HistProcinst> jbpm4HistProcinstSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().jbpm4HistProcinstSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4HistProcinst> jbpm4HistProcinstSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4HistProcinstSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Jbpm4HistProcinst> jbpm4HistProcinstSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().jbpm4HistProcinstSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Jbpm4HistProcinst jbpm4HistProcinstSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Jbpm4HistProcinst> list = this.jbpm4HistProcinstSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Jbpm4HistProcinst.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4HistProcinst> jbpm4HistProcinstSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.jbpm4HistProcinstSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Jbpm4HistProcinst> jbpm4HistProcinstSelectObjects() throws SQLException, DbException {
	return this.jbpm4HistProcinstSelectObjects("");
}

/**
 * @return 查询结果
 */
public Jbpm4HistProcinst jbpm4HistProcinstSelectSingleObject() throws SQLException, DbException {
	return this.jbpm4HistProcinstSelectSingleObject("");
}

/**
 * <param name="jbpm4HistProcinstQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4HistProcinst> jbpm4HistProcinstSelectObjects(ConditionQuery jbpm4HistProcinstQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = jbpm4HistProcinstQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistProcinstSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4HistProcinstQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Jbpm4HistProcinst> jbpm4HistProcinstSelectObjects(ConditionQuery jbpm4HistProcinstQueryCondition) throws SQLException, DbException {
	String sql = jbpm4HistProcinstQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistProcinstSelectObjects(sql);
}

/**
 * <param name="jbpm4HistProcinstQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Jbpm4HistProcinst jbpm4HistProcinstSelectSingleObject(ConditionQuery jbpm4HistProcinstQueryCondition) throws SQLException, DbException {
	List<Jbpm4HistProcinst> list = this.jbpm4HistProcinstSelectObjects(jbpm4HistProcinstQueryCondition);
	return common.util.ListUtil.getFirstItem(Jbpm4HistProcinst.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistProcinst> List<T> jbpm4HistProcinstSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4HistProcinstSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistProcinst> List<T> jbpm4HistProcinstSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4HistProcinstSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistProcinst> T jbpm4HistProcinstSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4HistProcinstSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistProcinst> List<T> jbpm4HistProcinstSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4HistProcinstSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4HistProcinst> List<T> jbpm4HistProcinstSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4HistProcinstSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4HistProcinst> T jbpm4HistProcinstSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4HistProcinstSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="jbpm4HistProcinstQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistProcinst> List<T> jbpm4HistProcinstSelectObjects(Class<T> type, ConditionQuery jbpm4HistProcinstQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4HistProcinstQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistProcinstSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4HistProcinstQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistProcinst> List<T> jbpm4HistProcinstSelectObjects(Class<T> type, ConditionQuery jbpm4HistProcinstQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4HistProcinstQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistProcinstSelectObjects(type, sql);
}

/**
 * <param name="jbpm4HistProcinstQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistProcinst> T jbpm4HistProcinstSelectSingleObject(Class<T> type, ConditionQuery jbpm4HistProcinstQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4HistProcinstSelectObjects(type, jbpm4HistProcinstQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int jbpm4HistProcinstQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4HistProcinstQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="jbpm4HistProcinstQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int jbpm4HistProcinstQuerySelectObjectsCount(ConditionQuery jbpm4HistProcinstQueryCondition) throws SQLException, DbException {
	String sql = jbpm4HistProcinstQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistProcinstQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Jbpm4HistTask到数据库中
 * <param name="jbpm4HistTask">需要插入的新对象</param>
 */
public void jbpm4HistTaskInsert(Jbpm4HistTask jbpm4HistTask) throws SQLException, DbException {
	this.getDao().jbpm4HistTaskInsert(jbpm4HistTask);
	String kvalue = "";
	kvalue = (kvalue + jbpm4HistTask.getDbid());
	this.operatesLogSimpleAdd("JBPM4_HIST_TASK", "插入", "DBID_", kvalue, jbpm4HistTask);
}

/**
 * 从数据库中删除一个对象Jbpm4HistTask
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void jbpm4HistTaskDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[JBPM4_HIST_TASK].[DBID_] = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	if ((this.getDao().jbpm4HistActinstSelectObjects((" inner join JBPM4_HIST_TASK on [JBPM4_HIST_TASK].[DBID_] = [JBPM4_HIST_ACTINST].[" +
"HTASK_] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_HIST_TASK", "JBPM4_HIST_ACTINST"));
	}
	sql = "";
	sql = (sql + "[JBPM4_HIST_TASK].[DBID_] = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	if ((this.getDao().jbpm4HistDetailSelectObjects((" inner join JBPM4_HIST_TASK on [JBPM4_HIST_TASK].[DBID_] = [JBPM4_HIST_DETAIL].[H" +
"TASK_] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_HIST_TASK", "JBPM4_HIST_DETAIL"));
	}
	sql = "";
	sql = (sql + "[JBPM4_HIST_TASK].[DBID_] = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	if ((this.getDao().jbpm4HistVarSelectObjects((" inner join JBPM4_HIST_TASK on [JBPM4_HIST_TASK].[DBID_] = [JBPM4_HIST_VAR].[HTAS" +
"K_] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_HIST_TASK", "JBPM4_HIST_VAR"));
	}
	this.getDao().jbpm4HistTaskDeleteByDbid(ADbid, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ADbid);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("JBPM4_HIST_TASK", "删除", "DBID_", kvalue, null);
}

/**
 * 从数据库中删除一个对象Jbpm4HistTask
 * <param name="ADbid"></param>
 */
public void jbpm4HistTaskDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4HistTaskDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4HistTask
 * <param name="ASupertask"></param>
 */
public void jbpm4HistTaskDeleteListBySupertask(Double ASupertask) throws SQLException, DbException {
	if ((this.getDao().jbpm4HistActinstSelectObjects((" inner join JBPM4_HIST_TASK on [JBPM4_HIST_TASK].[DBID_] = [JBPM4_HIST_ACTINST].[" +
"HTASK_] where [JBPM4_HIST_TASK].[SUPERTASK_] = " + ASupertask)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_HIST_TASK", "JBPM4_HIST_ACTINST"));
	}
	if ((this.getDao().jbpm4HistDetailSelectObjects((" inner join JBPM4_HIST_TASK on [JBPM4_HIST_TASK].[DBID_] = [JBPM4_HIST_DETAIL].[H" +
"TASK_] where [JBPM4_HIST_TASK].[SUPERTASK_] = " + ASupertask)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_HIST_TASK", "JBPM4_HIST_DETAIL"));
	}
	if ((this.getDao().jbpm4HistVarSelectObjects((" inner join JBPM4_HIST_TASK on [JBPM4_HIST_TASK].[DBID_] = [JBPM4_HIST_VAR].[HTAS" +
"K_] where [JBPM4_HIST_TASK].[SUPERTASK_] = " + ASupertask)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_HIST_TASK", "JBPM4_HIST_VAR"));
	}
	this.getDao().jbpm4HistTaskDeleteListBySupertask(ASupertask);
	String kvalue = "";
	kvalue = (kvalue + ASupertask);
	this.operatesLogSimpleAdd("JBPM4_HIST_TASK", "删除", "SUPERTASK_", kvalue, null);
}

/**
 * 更新一个对象Jbpm4HistTask到数据库中
 * <param name="jbpm4HistTask">需要更新的Jbpm4HistTask</param>
 */
public int jbpm4HistTaskUpdate(Jbpm4HistTask jbpm4HistTask) throws SQLException, DbException {
	return this.jbpm4HistTaskUpdate(jbpm4HistTask, "");
}

/**
 * 更新一个对象Jbpm4HistTask到数据库中
 * <param name="jbpm4HistTask">需要更新的Jbpm4HistTask</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int jbpm4HistTaskUpdate(Jbpm4HistTask jbpm4HistTask, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4HistTaskUpdate(jbpm4HistTask, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + jbpm4HistTask.getDbid());
	this.operatesLogSimpleAdd("JBPM4_HIST_TASK", "更新", "DBID_", kvalue, jbpm4HistTask);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
public Jbpm4HistTask jbpm4HistTaskSelectByDbid(double ADbid) throws SQLException, DbException {
	return this.getDao().jbpm4HistTaskSelectByDbid(ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ASupertask"></param>
 */
public List<Jbpm4HistTask> jbpm4HistTaskSelectObjectsBySupertask(Double ASupertask) throws SQLException, DbException {
	return this.getDao().jbpm4HistTaskSelectObjectsBySupertask(ASupertask);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4HistTask> jbpm4HistTaskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4HistTaskSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Jbpm4HistTask> jbpm4HistTaskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().jbpm4HistTaskSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4HistTask> jbpm4HistTaskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4HistTaskSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Jbpm4HistTask> jbpm4HistTaskSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().jbpm4HistTaskSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Jbpm4HistTask jbpm4HistTaskSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Jbpm4HistTask> list = this.jbpm4HistTaskSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Jbpm4HistTask.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4HistTask> jbpm4HistTaskSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.jbpm4HistTaskSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Jbpm4HistTask> jbpm4HistTaskSelectObjects() throws SQLException, DbException {
	return this.jbpm4HistTaskSelectObjects("");
}

/**
 * @return 查询结果
 */
public Jbpm4HistTask jbpm4HistTaskSelectSingleObject() throws SQLException, DbException {
	return this.jbpm4HistTaskSelectSingleObject("");
}

/**
 * <param name="jbpm4HistTaskQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4HistTask> jbpm4HistTaskSelectObjects(ConditionQuery jbpm4HistTaskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = jbpm4HistTaskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistTaskSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4HistTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Jbpm4HistTask> jbpm4HistTaskSelectObjects(ConditionQuery jbpm4HistTaskQueryCondition) throws SQLException, DbException {
	String sql = jbpm4HistTaskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistTaskSelectObjects(sql);
}

/**
 * <param name="jbpm4HistTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Jbpm4HistTask jbpm4HistTaskSelectSingleObject(ConditionQuery jbpm4HistTaskQueryCondition) throws SQLException, DbException {
	List<Jbpm4HistTask> list = this.jbpm4HistTaskSelectObjects(jbpm4HistTaskQueryCondition);
	return common.util.ListUtil.getFirstItem(Jbpm4HistTask.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistTask> List<T> jbpm4HistTaskSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4HistTaskSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistTask> List<T> jbpm4HistTaskSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4HistTaskSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistTask> T jbpm4HistTaskSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4HistTaskSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistTask> List<T> jbpm4HistTaskSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4HistTaskSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4HistTask> List<T> jbpm4HistTaskSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4HistTaskSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4HistTask> T jbpm4HistTaskSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4HistTaskSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="jbpm4HistTaskQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistTask> List<T> jbpm4HistTaskSelectObjects(Class<T> type, ConditionQuery jbpm4HistTaskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4HistTaskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistTaskSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4HistTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistTask> List<T> jbpm4HistTaskSelectObjects(Class<T> type, ConditionQuery jbpm4HistTaskQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4HistTaskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistTaskSelectObjects(type, sql);
}

/**
 * <param name="jbpm4HistTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistTask> T jbpm4HistTaskSelectSingleObject(Class<T> type, ConditionQuery jbpm4HistTaskQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4HistTaskSelectObjects(type, jbpm4HistTaskQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int jbpm4HistTaskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4HistTaskQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="jbpm4HistTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int jbpm4HistTaskQuerySelectObjectsCount(ConditionQuery jbpm4HistTaskQueryCondition) throws SQLException, DbException {
	String sql = jbpm4HistTaskQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistTaskQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象IssueRoleDefaultQuery到数据库中
 * <param name="issueRoleDefaultQuery">需要插入的新对象</param>
 */
public void issueRoleDefaultQueryInsert(IssueRoleDefaultQuery issueRoleDefaultQuery) throws SQLException, DbException {
	this.getDao().issueRoleDefaultQueryInsert(issueRoleDefaultQuery);
	String kvalue = "";
	kvalue = (kvalue + issueRoleDefaultQuery.getIssueProjectId());
	kvalue = (kvalue + ",");
	kvalue = (kvalue + issueRoleDefaultQuery.getRoleId());
	this.operatesLogSimpleAdd("T_ISSUE_ROLE_DEFAULT_QUERY", "插入", "ISSUE_PROJECT_ID,ROLE_ID", kvalue, issueRoleDefaultQuery);
}

/**
 * 从数据库中删除一个对象IssueRoleDefaultQuery
 * <param name="AIssueProjectId">标识</param>
 * <param name="ARoleId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void issueRoleDefaultQueryDeleteByIssueProjectIdRoleId(int AIssueProjectId, int ARoleId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().issueRoleDefaultQueryDeleteByIssueProjectIdRoleId(AIssueProjectId, ARoleId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AIssueProjectId);
	kvalue = (kvalue + ",");
	kvalue = (kvalue + ARoleId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ISSUE_ROLE_DEFAULT_QUERY", "删除", "ISSUE_PROJECT_ID,ROLE_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象IssueRoleDefaultQuery
 * <param name="AIssueProjectId">标识</param>
 * <param name="ARoleId">标识</param>
 */
public void issueRoleDefaultQueryDeleteByIssueProjectIdRoleId(int AIssueProjectId, int ARoleId) throws SQLException, DbException {
	this.issueRoleDefaultQueryDeleteByIssueProjectIdRoleId(AIssueProjectId, ARoleId, "");
}

/**
 * 从数据库中删除一批对象IssueRoleDefaultQuery
 * <param name="AIssueProjectId">标识</param>
 */
public void issueRoleDefaultQueryDeleteListByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	this.getDao().issueRoleDefaultQueryDeleteListByIssueProjectId(AIssueProjectId);
	String kvalue = "";
	kvalue = (kvalue + AIssueProjectId);
	this.operatesLogSimpleAdd("T_ISSUE_ROLE_DEFAULT_QUERY", "删除", "ISSUE_PROJECT_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象IssueRoleDefaultQuery
 * <param name="AIssueQueryId">标识</param>
 */
public void issueRoleDefaultQueryDeleteListByIssueQueryId(int AIssueQueryId) throws SQLException, DbException {
	this.getDao().issueRoleDefaultQueryDeleteListByIssueQueryId(AIssueQueryId);
	String kvalue = "";
	kvalue = (kvalue + AIssueQueryId);
	this.operatesLogSimpleAdd("T_ISSUE_ROLE_DEFAULT_QUERY", "删除", "ISSUE_QUERY_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象IssueRoleDefaultQuery
 * <param name="ARoleId">标识</param>
 */
public void issueRoleDefaultQueryDeleteListByRoleId(int ARoleId) throws SQLException, DbException {
	this.getDao().issueRoleDefaultQueryDeleteListByRoleId(ARoleId);
	String kvalue = "";
	kvalue = (kvalue + ARoleId);
	this.operatesLogSimpleAdd("T_ISSUE_ROLE_DEFAULT_QUERY", "删除", "ROLE_ID", kvalue, null);
}

/**
 * 更新一个对象IssueRoleDefaultQuery到数据库中
 * <param name="issueRoleDefaultQuery">需要更新的IssueRoleDefaultQuery</param>
 */
public int issueRoleDefaultQueryUpdate(IssueRoleDefaultQuery issueRoleDefaultQuery) throws SQLException, DbException {
	return this.issueRoleDefaultQueryUpdate(issueRoleDefaultQuery, "");
}

/**
 * 更新一个对象IssueRoleDefaultQuery到数据库中
 * <param name="issueRoleDefaultQuery">需要更新的IssueRoleDefaultQuery</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int issueRoleDefaultQueryUpdate(IssueRoleDefaultQuery issueRoleDefaultQuery, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueRoleDefaultQueryUpdate(issueRoleDefaultQuery, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + issueRoleDefaultQuery.getIssueProjectId());
	kvalue = (kvalue + ",");
	kvalue = (kvalue + issueRoleDefaultQuery.getRoleId());
	this.operatesLogSimpleAdd("T_ISSUE_ROLE_DEFAULT_QUERY", "更新", "ISSUE_PROJECT_ID,ROLE_ID", kvalue, issueRoleDefaultQuery);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectId">标识</param>
 * <param name="ARoleId">标识</param>
 */
public IssueRoleDefaultQuery issueRoleDefaultQuerySelectByIssueProjectIdRoleId(int AIssueProjectId, int ARoleId) throws SQLException, DbException {
	return this.getDao().issueRoleDefaultQuerySelectByIssueProjectIdRoleId(AIssueProjectId, ARoleId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectId">标识</param>
 */
public List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjectsByIssueProjectId(int AIssueProjectId) throws SQLException, DbException {
	return this.getDao().issueRoleDefaultQuerySelectObjectsByIssueProjectId(AIssueProjectId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueQueryId">标识</param>
 */
public List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjectsByIssueQueryId(int AIssueQueryId) throws SQLException, DbException {
	return this.getDao().issueRoleDefaultQuerySelectObjectsByIssueQueryId(AIssueQueryId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ARoleId">标识</param>
 */
public List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjectsByRoleId(int ARoleId) throws SQLException, DbException {
	return this.getDao().issueRoleDefaultQuerySelectObjectsByRoleId(ARoleId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueRoleDefaultQuerySelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().issueRoleDefaultQuerySelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueRoleDefaultQuerySelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().issueRoleDefaultQuerySelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public IssueRoleDefaultQuery issueRoleDefaultQuerySelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<IssueRoleDefaultQuery> list = this.issueRoleDefaultQuerySelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(IssueRoleDefaultQuery.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.issueRoleDefaultQuerySelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjects() throws SQLException, DbException {
	return this.issueRoleDefaultQuerySelectObjects("");
}

/**
 * @return 查询结果
 */
public IssueRoleDefaultQuery issueRoleDefaultQuerySelectSingleObject() throws SQLException, DbException {
	return this.issueRoleDefaultQuerySelectSingleObject("");
}

/**
 * <param name="issueRoleDefaultQueryQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjects(ConditionQuery issueRoleDefaultQueryQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = issueRoleDefaultQueryQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueRoleDefaultQuerySelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueRoleDefaultQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjects(ConditionQuery issueRoleDefaultQueryQueryCondition) throws SQLException, DbException {
	String sql = issueRoleDefaultQueryQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueRoleDefaultQuerySelectObjects(sql);
}

/**
 * <param name="issueRoleDefaultQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public IssueRoleDefaultQuery issueRoleDefaultQuerySelectSingleObject(ConditionQuery issueRoleDefaultQueryQueryCondition) throws SQLException, DbException {
	List<IssueRoleDefaultQuery> list = this.issueRoleDefaultQuerySelectObjects(issueRoleDefaultQueryQueryCondition);
	return common.util.ListUtil.getFirstItem(IssueRoleDefaultQuery.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueRoleDefaultQuery> List<T> issueRoleDefaultQuerySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueRoleDefaultQuerySelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueRoleDefaultQuery> List<T> issueRoleDefaultQuerySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueRoleDefaultQuerySelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueRoleDefaultQuery> T issueRoleDefaultQuerySelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueRoleDefaultQuerySelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueRoleDefaultQuery> List<T> issueRoleDefaultQuerySelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueRoleDefaultQuerySelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends IssueRoleDefaultQuery> List<T> issueRoleDefaultQuerySelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueRoleDefaultQuerySelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends IssueRoleDefaultQuery> T issueRoleDefaultQuerySelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueRoleDefaultQuerySelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="issueRoleDefaultQueryQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueRoleDefaultQuery> List<T> issueRoleDefaultQuerySelectObjects(Class<T> type, ConditionQuery issueRoleDefaultQueryQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueRoleDefaultQueryQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueRoleDefaultQuerySelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueRoleDefaultQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueRoleDefaultQuery> List<T> issueRoleDefaultQuerySelectObjects(Class<T> type, ConditionQuery issueRoleDefaultQueryQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueRoleDefaultQueryQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueRoleDefaultQuerySelectObjects(type, sql);
}

/**
 * <param name="issueRoleDefaultQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueRoleDefaultQuery> T issueRoleDefaultQuerySelectSingleObject(Class<T> type, ConditionQuery issueRoleDefaultQueryQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueRoleDefaultQuerySelectObjects(type, issueRoleDefaultQueryQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int issueRoleDefaultQueryQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueRoleDefaultQueryQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="issueRoleDefaultQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int issueRoleDefaultQueryQuerySelectObjectsCount(ConditionQuery issueRoleDefaultQueryQueryCondition) throws SQLException, DbException {
	String sql = issueRoleDefaultQueryQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueRoleDefaultQueryQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Jbpm4HistVar到数据库中
 * <param name="jbpm4HistVar">需要插入的新对象</param>
 */
public void jbpm4HistVarInsert(Jbpm4HistVar jbpm4HistVar) throws SQLException, DbException {
	this.getDao().jbpm4HistVarInsert(jbpm4HistVar);
	String kvalue = "";
	kvalue = (kvalue + jbpm4HistVar.getDbid());
	this.operatesLogSimpleAdd("JBPM4_HIST_VAR", "插入", "DBID_", kvalue, jbpm4HistVar);
}

/**
 * 从数据库中删除一个对象Jbpm4HistVar
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void jbpm4HistVarDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[JBPM4_HIST_VAR].[DBID_] = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	if ((this.getDao().jbpm4HistDetailSelectObjects((" inner join JBPM4_HIST_VAR on [JBPM4_HIST_VAR].[DBID_] = [JBPM4_HIST_DETAIL].[HVA" +
"R_] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_HIST_VAR", "JBPM4_HIST_DETAIL"));
	}
	this.getDao().jbpm4HistVarDeleteByDbid(ADbid, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ADbid);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("JBPM4_HIST_VAR", "删除", "DBID_", kvalue, null);
}

/**
 * 从数据库中删除一个对象Jbpm4HistVar
 * <param name="ADbid"></param>
 */
public void jbpm4HistVarDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4HistVarDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4HistVar
 * <param name="AHproci"></param>
 */
public void jbpm4HistVarDeleteListByHproci(Double AHproci) throws SQLException, DbException {
	if ((this.getDao().jbpm4HistDetailSelectObjects((" inner join JBPM4_HIST_VAR on [JBPM4_HIST_VAR].[DBID_] = [JBPM4_HIST_DETAIL].[HVA" +
"R_] where [JBPM4_HIST_VAR].[HPROCI_] = " + AHproci)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_HIST_VAR", "JBPM4_HIST_DETAIL"));
	}
	this.getDao().jbpm4HistVarDeleteListByHproci(AHproci);
	String kvalue = "";
	kvalue = (kvalue + AHproci);
	this.operatesLogSimpleAdd("JBPM4_HIST_VAR", "删除", "HPROCI_", kvalue, null);
}

/**
 * 从数据库中删除一批对象Jbpm4HistVar
 * <param name="AHtask"></param>
 */
public void jbpm4HistVarDeleteListByHtask(Double AHtask) throws SQLException, DbException {
	if ((this.getDao().jbpm4HistDetailSelectObjects((" inner join JBPM4_HIST_VAR on [JBPM4_HIST_VAR].[DBID_] = [JBPM4_HIST_DETAIL].[HVA" +
"R_] where [JBPM4_HIST_VAR].[HTASK_] = " + AHtask)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_HIST_VAR", "JBPM4_HIST_DETAIL"));
	}
	this.getDao().jbpm4HistVarDeleteListByHtask(AHtask);
	String kvalue = "";
	kvalue = (kvalue + AHtask);
	this.operatesLogSimpleAdd("JBPM4_HIST_VAR", "删除", "HTASK_", kvalue, null);
}

/**
 * 更新一个对象Jbpm4HistVar到数据库中
 * <param name="jbpm4HistVar">需要更新的Jbpm4HistVar</param>
 */
public int jbpm4HistVarUpdate(Jbpm4HistVar jbpm4HistVar) throws SQLException, DbException {
	return this.jbpm4HistVarUpdate(jbpm4HistVar, "");
}

/**
 * 更新一个对象Jbpm4HistVar到数据库中
 * <param name="jbpm4HistVar">需要更新的Jbpm4HistVar</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int jbpm4HistVarUpdate(Jbpm4HistVar jbpm4HistVar, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4HistVarUpdate(jbpm4HistVar, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + jbpm4HistVar.getDbid());
	this.operatesLogSimpleAdd("JBPM4_HIST_VAR", "更新", "DBID_", kvalue, jbpm4HistVar);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
public Jbpm4HistVar jbpm4HistVarSelectByDbid(double ADbid) throws SQLException, DbException {
	return this.getDao().jbpm4HistVarSelectByDbid(ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHproci"></param>
 */
public List<Jbpm4HistVar> jbpm4HistVarSelectObjectsByHproci(Double AHproci) throws SQLException, DbException {
	return this.getDao().jbpm4HistVarSelectObjectsByHproci(AHproci);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHtask"></param>
 */
public List<Jbpm4HistVar> jbpm4HistVarSelectObjectsByHtask(Double AHtask) throws SQLException, DbException {
	return this.getDao().jbpm4HistVarSelectObjectsByHtask(AHtask);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4HistVar> jbpm4HistVarSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4HistVarSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Jbpm4HistVar> jbpm4HistVarSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().jbpm4HistVarSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4HistVar> jbpm4HistVarSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4HistVarSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Jbpm4HistVar> jbpm4HistVarSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().jbpm4HistVarSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Jbpm4HistVar jbpm4HistVarSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Jbpm4HistVar> list = this.jbpm4HistVarSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Jbpm4HistVar.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4HistVar> jbpm4HistVarSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.jbpm4HistVarSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Jbpm4HistVar> jbpm4HistVarSelectObjects() throws SQLException, DbException {
	return this.jbpm4HistVarSelectObjects("");
}

/**
 * @return 查询结果
 */
public Jbpm4HistVar jbpm4HistVarSelectSingleObject() throws SQLException, DbException {
	return this.jbpm4HistVarSelectSingleObject("");
}

/**
 * <param name="jbpm4HistVarQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4HistVar> jbpm4HistVarSelectObjects(ConditionQuery jbpm4HistVarQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = jbpm4HistVarQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistVarSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4HistVarQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Jbpm4HistVar> jbpm4HistVarSelectObjects(ConditionQuery jbpm4HistVarQueryCondition) throws SQLException, DbException {
	String sql = jbpm4HistVarQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistVarSelectObjects(sql);
}

/**
 * <param name="jbpm4HistVarQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Jbpm4HistVar jbpm4HistVarSelectSingleObject(ConditionQuery jbpm4HistVarQueryCondition) throws SQLException, DbException {
	List<Jbpm4HistVar> list = this.jbpm4HistVarSelectObjects(jbpm4HistVarQueryCondition);
	return common.util.ListUtil.getFirstItem(Jbpm4HistVar.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistVar> List<T> jbpm4HistVarSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4HistVarSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistVar> List<T> jbpm4HistVarSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4HistVarSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistVar> T jbpm4HistVarSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4HistVarSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistVar> List<T> jbpm4HistVarSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4HistVarSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4HistVar> List<T> jbpm4HistVarSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4HistVarSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4HistVar> T jbpm4HistVarSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4HistVarSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="jbpm4HistVarQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistVar> List<T> jbpm4HistVarSelectObjects(Class<T> type, ConditionQuery jbpm4HistVarQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4HistVarQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistVarSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4HistVarQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistVar> List<T> jbpm4HistVarSelectObjects(Class<T> type, ConditionQuery jbpm4HistVarQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4HistVarQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistVarSelectObjects(type, sql);
}

/**
 * <param name="jbpm4HistVarQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4HistVar> T jbpm4HistVarSelectSingleObject(Class<T> type, ConditionQuery jbpm4HistVarQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4HistVarSelectObjects(type, jbpm4HistVarQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int jbpm4HistVarQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4HistVarQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="jbpm4HistVarQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int jbpm4HistVarQuerySelectObjectsCount(ConditionQuery jbpm4HistVarQueryCondition) throws SQLException, DbException {
	String sql = jbpm4HistVarQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4HistVarQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Jbpm4IdGroup到数据库中
 * <param name="jbpm4IdGroup">需要插入的新对象</param>
 */
public void jbpm4IdGroupInsert(Jbpm4IdGroup jbpm4IdGroup) throws SQLException, DbException {
	this.getDao().jbpm4IdGroupInsert(jbpm4IdGroup);
	String kvalue = "";
	kvalue = (kvalue + jbpm4IdGroup.getDbid());
	this.operatesLogSimpleAdd("JBPM4_ID_GROUP", "插入", "DBID_", kvalue, jbpm4IdGroup);
}

/**
 * 从数据库中删除一个对象Jbpm4IdGroup
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void jbpm4IdGroupDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[JBPM4_ID_GROUP].[DBID_] = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	if ((this.getDao().jbpm4IdMembershipSelectObjects((" inner join JBPM4_ID_GROUP on [JBPM4_ID_GROUP].[DBID_] = [JBPM4_ID_MEMBERSHIP].[G" +
"ROUP_] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_ID_GROUP", "JBPM4_ID_MEMBERSHIP"));
	}
	this.getDao().jbpm4IdGroupDeleteByDbid(ADbid, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ADbid);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("JBPM4_ID_GROUP", "删除", "DBID_", kvalue, null);
}

/**
 * 从数据库中删除一个对象Jbpm4IdGroup
 * <param name="ADbid"></param>
 */
public void jbpm4IdGroupDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4IdGroupDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4IdGroup
 * <param name="AParent"></param>
 */
public void jbpm4IdGroupDeleteListByParent(Double AParent) throws SQLException, DbException {
	if ((this.getDao().jbpm4IdMembershipSelectObjects((" inner join JBPM4_ID_GROUP on [JBPM4_ID_GROUP].[DBID_] = [JBPM4_ID_MEMBERSHIP].[G" +
"ROUP_] where [JBPM4_ID_GROUP].[PARENT_] = " + AParent)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_ID_GROUP", "JBPM4_ID_MEMBERSHIP"));
	}
	this.getDao().jbpm4IdGroupDeleteListByParent(AParent);
	String kvalue = "";
	kvalue = (kvalue + AParent);
	this.operatesLogSimpleAdd("JBPM4_ID_GROUP", "删除", "PARENT_", kvalue, null);
}

/**
 * 更新一个对象Jbpm4IdGroup到数据库中
 * <param name="jbpm4IdGroup">需要更新的Jbpm4IdGroup</param>
 */
public int jbpm4IdGroupUpdate(Jbpm4IdGroup jbpm4IdGroup) throws SQLException, DbException {
	return this.jbpm4IdGroupUpdate(jbpm4IdGroup, "");
}

/**
 * 更新一个对象Jbpm4IdGroup到数据库中
 * <param name="jbpm4IdGroup">需要更新的Jbpm4IdGroup</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int jbpm4IdGroupUpdate(Jbpm4IdGroup jbpm4IdGroup, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4IdGroupUpdate(jbpm4IdGroup, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + jbpm4IdGroup.getDbid());
	this.operatesLogSimpleAdd("JBPM4_ID_GROUP", "更新", "DBID_", kvalue, jbpm4IdGroup);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
public Jbpm4IdGroup jbpm4IdGroupSelectByDbid(double ADbid) throws SQLException, DbException {
	return this.getDao().jbpm4IdGroupSelectByDbid(ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AParent"></param>
 */
public List<Jbpm4IdGroup> jbpm4IdGroupSelectObjectsByParent(Double AParent) throws SQLException, DbException {
	return this.getDao().jbpm4IdGroupSelectObjectsByParent(AParent);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4IdGroup> jbpm4IdGroupSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4IdGroupSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Jbpm4IdGroup> jbpm4IdGroupSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().jbpm4IdGroupSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4IdGroup> jbpm4IdGroupSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4IdGroupSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Jbpm4IdGroup> jbpm4IdGroupSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().jbpm4IdGroupSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Jbpm4IdGroup jbpm4IdGroupSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Jbpm4IdGroup> list = this.jbpm4IdGroupSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Jbpm4IdGroup.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4IdGroup> jbpm4IdGroupSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.jbpm4IdGroupSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Jbpm4IdGroup> jbpm4IdGroupSelectObjects() throws SQLException, DbException {
	return this.jbpm4IdGroupSelectObjects("");
}

/**
 * @return 查询结果
 */
public Jbpm4IdGroup jbpm4IdGroupSelectSingleObject() throws SQLException, DbException {
	return this.jbpm4IdGroupSelectSingleObject("");
}

/**
 * <param name="jbpm4IdGroupQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4IdGroup> jbpm4IdGroupSelectObjects(ConditionQuery jbpm4IdGroupQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = jbpm4IdGroupQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4IdGroupSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4IdGroupQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Jbpm4IdGroup> jbpm4IdGroupSelectObjects(ConditionQuery jbpm4IdGroupQueryCondition) throws SQLException, DbException {
	String sql = jbpm4IdGroupQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4IdGroupSelectObjects(sql);
}

/**
 * <param name="jbpm4IdGroupQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Jbpm4IdGroup jbpm4IdGroupSelectSingleObject(ConditionQuery jbpm4IdGroupQueryCondition) throws SQLException, DbException {
	List<Jbpm4IdGroup> list = this.jbpm4IdGroupSelectObjects(jbpm4IdGroupQueryCondition);
	return common.util.ListUtil.getFirstItem(Jbpm4IdGroup.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdGroup> List<T> jbpm4IdGroupSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4IdGroupSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdGroup> List<T> jbpm4IdGroupSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4IdGroupSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdGroup> T jbpm4IdGroupSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4IdGroupSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdGroup> List<T> jbpm4IdGroupSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4IdGroupSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4IdGroup> List<T> jbpm4IdGroupSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4IdGroupSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4IdGroup> T jbpm4IdGroupSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4IdGroupSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="jbpm4IdGroupQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdGroup> List<T> jbpm4IdGroupSelectObjects(Class<T> type, ConditionQuery jbpm4IdGroupQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4IdGroupQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4IdGroupSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4IdGroupQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdGroup> List<T> jbpm4IdGroupSelectObjects(Class<T> type, ConditionQuery jbpm4IdGroupQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4IdGroupQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4IdGroupSelectObjects(type, sql);
}

/**
 * <param name="jbpm4IdGroupQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdGroup> T jbpm4IdGroupSelectSingleObject(Class<T> type, ConditionQuery jbpm4IdGroupQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4IdGroupSelectObjects(type, jbpm4IdGroupQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int jbpm4IdGroupQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4IdGroupQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="jbpm4IdGroupQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int jbpm4IdGroupQuerySelectObjectsCount(ConditionQuery jbpm4IdGroupQueryCondition) throws SQLException, DbException {
	String sql = jbpm4IdGroupQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4IdGroupQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象IssueQuery到数据库中
 * <param name="issueQuery">需要插入的新对象</param>
 */
public void issueQueryInsert(IssueQuery issueQuery) throws SQLException, DbException {
	this.getDao().issueQueryInsert(issueQuery);
	String kvalue = "";
	kvalue = (kvalue + issueQuery.getIssueQueryId());
	this.operatesLogSimpleAdd("T_ISSUE_QUERY", "插入", "ISSUE_QUERY_ID", kvalue, issueQuery);
}

/**
 * 从数据库中删除一个对象IssueQuery
 * <param name="AIssueQueryId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void issueQueryDeleteByIssueQueryId(int AIssueQueryId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_ISSUE_QUERY].[ISSUE_QUERY_ID] = ");
	sql = (sql + AIssueQueryId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueUserDefaultQuerySelectObjects((" inner join T_ISSUE_QUERY on [T_ISSUE_QUERY].[ISSUE_QUERY_ID] = [T_ISSUE_USER_DEF" +
"AULT_QUERY].[ISSUE_QUERY_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_QUERY", "T_ISSUE_USER_DEFAULT_QUERY"));
	}
	sql = "";
	sql = (sql + "[T_ISSUE_QUERY].[ISSUE_QUERY_ID] = ");
	sql = (sql + AIssueQueryId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().issueRoleDefaultQuerySelectObjects((" inner join T_ISSUE_QUERY on [T_ISSUE_QUERY].[ISSUE_QUERY_ID] = [T_ISSUE_ROLE_DEF" +
"AULT_QUERY].[ISSUE_QUERY_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_QUERY", "T_ISSUE_ROLE_DEFAULT_QUERY"));
	}
	this.getDao().issueQueryDeleteByIssueQueryId(AIssueQueryId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AIssueQueryId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_ISSUE_QUERY", "删除", "ISSUE_QUERY_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象IssueQuery
 * <param name="AIssueQueryId">标识</param>
 */
public void issueQueryDeleteByIssueQueryId(int AIssueQueryId) throws SQLException, DbException {
	this.issueQueryDeleteByIssueQueryId(AIssueQueryId, "");
}

/**
 * 从数据库中删除一批对象IssueQuery
 * <param name="AIssueProjectId">关联项目</param>
 */
public void issueQueryDeleteListByIssueProjectId(Integer AIssueProjectId) throws SQLException, DbException {
	if ((this.getDao().issueUserDefaultQuerySelectObjects((" inner join T_ISSUE_QUERY on [T_ISSUE_QUERY].[ISSUE_QUERY_ID] = [T_ISSUE_USER_DEF" +
"AULT_QUERY].[ISSUE_QUERY_ID] where [T_ISSUE_QUERY].[ISSUE_PROJECT_ID] = " + AIssueProjectId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_QUERY", "T_ISSUE_USER_DEFAULT_QUERY"));
	}
	if ((this.getDao().issueRoleDefaultQuerySelectObjects((" inner join T_ISSUE_QUERY on [T_ISSUE_QUERY].[ISSUE_QUERY_ID] = [T_ISSUE_ROLE_DEF" +
"AULT_QUERY].[ISSUE_QUERY_ID] where [T_ISSUE_QUERY].[ISSUE_PROJECT_ID] = " + AIssueProjectId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_QUERY", "T_ISSUE_ROLE_DEFAULT_QUERY"));
	}
	this.getDao().issueQueryDeleteListByIssueProjectId(AIssueProjectId);
	String kvalue = "";
	kvalue = (kvalue + AIssueProjectId);
	this.operatesLogSimpleAdd("T_ISSUE_QUERY", "删除", "ISSUE_PROJECT_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象IssueQuery
 * <param name="AIssueCreateUserId">创建用户</param>
 */
public void issueQueryDeleteListByIssueCreateUserId(int AIssueCreateUserId) throws SQLException, DbException {
	if ((this.getDao().issueUserDefaultQuerySelectObjects((" inner join T_ISSUE_QUERY on [T_ISSUE_QUERY].[ISSUE_QUERY_ID] = [T_ISSUE_USER_DEF" +
"AULT_QUERY].[ISSUE_QUERY_ID] where [T_ISSUE_QUERY].[ISSUE_CREATE_USER_ID] = " + AIssueCreateUserId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_QUERY", "T_ISSUE_USER_DEFAULT_QUERY"));
	}
	if ((this.getDao().issueRoleDefaultQuerySelectObjects((" inner join T_ISSUE_QUERY on [T_ISSUE_QUERY].[ISSUE_QUERY_ID] = [T_ISSUE_ROLE_DEF" +
"AULT_QUERY].[ISSUE_QUERY_ID] where [T_ISSUE_QUERY].[ISSUE_CREATE_USER_ID] = " + AIssueCreateUserId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_ISSUE_QUERY", "T_ISSUE_ROLE_DEFAULT_QUERY"));
	}
	this.getDao().issueQueryDeleteListByIssueCreateUserId(AIssueCreateUserId);
	String kvalue = "";
	kvalue = (kvalue + AIssueCreateUserId);
	this.operatesLogSimpleAdd("T_ISSUE_QUERY", "删除", "ISSUE_CREATE_USER_ID", kvalue, null);
}

/**
 * 更新一个对象IssueQuery到数据库中
 * <param name="issueQuery">需要更新的IssueQuery</param>
 */
public int issueQueryUpdate(IssueQuery issueQuery) throws SQLException, DbException {
	return this.issueQueryUpdate(issueQuery, "");
}

/**
 * 更新一个对象IssueQuery到数据库中
 * <param name="issueQuery">需要更新的IssueQuery</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int issueQueryUpdate(IssueQuery issueQuery, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueQueryUpdate(issueQuery, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + issueQuery.getIssueQueryId());
	this.operatesLogSimpleAdd("T_ISSUE_QUERY", "更新", "ISSUE_QUERY_ID", kvalue, issueQuery);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueQueryId">标识</param>
 */
public IssueQuery issueQuerySelectByIssueQueryId(int AIssueQueryId) throws SQLException, DbException {
	return this.getDao().issueQuerySelectByIssueQueryId(AIssueQueryId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectId">关联项目</param>
 */
public List<IssueQuery> issueQuerySelectObjectsByIssueProjectId(Integer AIssueProjectId) throws SQLException, DbException {
	return this.getDao().issueQuerySelectObjectsByIssueProjectId(AIssueProjectId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueCreateUserId">创建用户</param>
 */
public List<IssueQuery> issueQuerySelectObjectsByIssueCreateUserId(int AIssueCreateUserId) throws SQLException, DbException {
	return this.getDao().issueQuerySelectObjectsByIssueCreateUserId(AIssueCreateUserId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueQuery> issueQuerySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueQuerySelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<IssueQuery> issueQuerySelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().issueQuerySelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueQuery> issueQuerySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().issueQuerySelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<IssueQuery> issueQuerySelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().issueQuerySelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public IssueQuery issueQuerySelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<IssueQuery> list = this.issueQuerySelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(IssueQuery.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueQuery> issueQuerySelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.issueQuerySelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<IssueQuery> issueQuerySelectObjects() throws SQLException, DbException {
	return this.issueQuerySelectObjects("");
}

/**
 * @return 查询结果
 */
public IssueQuery issueQuerySelectSingleObject() throws SQLException, DbException {
	return this.issueQuerySelectSingleObject("");
}

/**
 * <param name="issueQueryQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<IssueQuery> issueQuerySelectObjects(ConditionQuery issueQueryQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = issueQueryQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueQuerySelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<IssueQuery> issueQuerySelectObjects(ConditionQuery issueQueryQueryCondition) throws SQLException, DbException {
	String sql = issueQueryQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueQuerySelectObjects(sql);
}

/**
 * <param name="issueQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public IssueQuery issueQuerySelectSingleObject(ConditionQuery issueQueryQueryCondition) throws SQLException, DbException {
	List<IssueQuery> list = this.issueQuerySelectObjects(issueQueryQueryCondition);
	return common.util.ListUtil.getFirstItem(IssueQuery.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueQuery> List<T> issueQuerySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueQuerySelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueQuery> List<T> issueQuerySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().issueQuerySelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends IssueQuery> T issueQuerySelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueQuerySelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueQuery> List<T> issueQuerySelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueQuerySelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends IssueQuery> List<T> issueQuerySelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.issueQuerySelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends IssueQuery> T issueQuerySelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueQuerySelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="issueQueryQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends IssueQuery> List<T> issueQuerySelectObjects(Class<T> type, ConditionQuery issueQueryQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueQueryQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueQuerySelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="issueQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueQuery> List<T> issueQuerySelectObjects(Class<T> type, ConditionQuery issueQueryQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = issueQueryQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueQuerySelectObjects(type, sql);
}

/**
 * <param name="issueQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends IssueQuery> T issueQuerySelectSingleObject(Class<T> type, ConditionQuery issueQueryQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.issueQuerySelectObjects(type, issueQueryQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int issueQueryQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().issueQueryQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="issueQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int issueQueryQuerySelectObjectsCount(ConditionQuery issueQueryQueryCondition) throws SQLException, DbException {
	String sql = issueQueryQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.issueQueryQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Jbpm4IdMembership到数据库中
 * <param name="jbpm4IdMembership">需要插入的新对象</param>
 */
public void jbpm4IdMembershipInsert(Jbpm4IdMembership jbpm4IdMembership) throws SQLException, DbException {
	this.getDao().jbpm4IdMembershipInsert(jbpm4IdMembership);
	String kvalue = "";
	kvalue = (kvalue + jbpm4IdMembership.getDbid());
	this.operatesLogSimpleAdd("JBPM4_ID_MEMBERSHIP", "插入", "DBID_", kvalue, jbpm4IdMembership);
}

/**
 * 从数据库中删除一个对象Jbpm4IdMembership
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void jbpm4IdMembershipDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().jbpm4IdMembershipDeleteByDbid(ADbid, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ADbid);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("JBPM4_ID_MEMBERSHIP", "删除", "DBID_", kvalue, null);
}

/**
 * 从数据库中删除一个对象Jbpm4IdMembership
 * <param name="ADbid"></param>
 */
public void jbpm4IdMembershipDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4IdMembershipDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4IdMembership
 * <param name="AGroup"></param>
 */
public void jbpm4IdMembershipDeleteListByGroup(Double AGroup) throws SQLException, DbException {
	this.getDao().jbpm4IdMembershipDeleteListByGroup(AGroup);
	String kvalue = "";
	kvalue = (kvalue + AGroup);
	this.operatesLogSimpleAdd("JBPM4_ID_MEMBERSHIP", "删除", "GROUP_", kvalue, null);
}

/**
 * 从数据库中删除一批对象Jbpm4IdMembership
 * <param name="AUser"></param>
 */
public void jbpm4IdMembershipDeleteListByUser(Double AUser) throws SQLException, DbException {
	this.getDao().jbpm4IdMembershipDeleteListByUser(AUser);
	String kvalue = "";
	kvalue = (kvalue + AUser);
	this.operatesLogSimpleAdd("JBPM4_ID_MEMBERSHIP", "删除", "USER_", kvalue, null);
}

/**
 * 更新一个对象Jbpm4IdMembership到数据库中
 * <param name="jbpm4IdMembership">需要更新的Jbpm4IdMembership</param>
 */
public int jbpm4IdMembershipUpdate(Jbpm4IdMembership jbpm4IdMembership) throws SQLException, DbException {
	return this.jbpm4IdMembershipUpdate(jbpm4IdMembership, "");
}

/**
 * 更新一个对象Jbpm4IdMembership到数据库中
 * <param name="jbpm4IdMembership">需要更新的Jbpm4IdMembership</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int jbpm4IdMembershipUpdate(Jbpm4IdMembership jbpm4IdMembership, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4IdMembershipUpdate(jbpm4IdMembership, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + jbpm4IdMembership.getDbid());
	this.operatesLogSimpleAdd("JBPM4_ID_MEMBERSHIP", "更新", "DBID_", kvalue, jbpm4IdMembership);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
public Jbpm4IdMembership jbpm4IdMembershipSelectByDbid(double ADbid) throws SQLException, DbException {
	return this.getDao().jbpm4IdMembershipSelectByDbid(ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AGroup"></param>
 */
public List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjectsByGroup(Double AGroup) throws SQLException, DbException {
	return this.getDao().jbpm4IdMembershipSelectObjectsByGroup(AGroup);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AUser"></param>
 */
public List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjectsByUser(Double AUser) throws SQLException, DbException {
	return this.getDao().jbpm4IdMembershipSelectObjectsByUser(AUser);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4IdMembershipSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().jbpm4IdMembershipSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4IdMembershipSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().jbpm4IdMembershipSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Jbpm4IdMembership jbpm4IdMembershipSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Jbpm4IdMembership> list = this.jbpm4IdMembershipSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Jbpm4IdMembership.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.jbpm4IdMembershipSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjects() throws SQLException, DbException {
	return this.jbpm4IdMembershipSelectObjects("");
}

/**
 * @return 查询结果
 */
public Jbpm4IdMembership jbpm4IdMembershipSelectSingleObject() throws SQLException, DbException {
	return this.jbpm4IdMembershipSelectSingleObject("");
}

/**
 * <param name="jbpm4IdMembershipQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjects(ConditionQuery jbpm4IdMembershipQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = jbpm4IdMembershipQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4IdMembershipSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4IdMembershipQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjects(ConditionQuery jbpm4IdMembershipQueryCondition) throws SQLException, DbException {
	String sql = jbpm4IdMembershipQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4IdMembershipSelectObjects(sql);
}

/**
 * <param name="jbpm4IdMembershipQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Jbpm4IdMembership jbpm4IdMembershipSelectSingleObject(ConditionQuery jbpm4IdMembershipQueryCondition) throws SQLException, DbException {
	List<Jbpm4IdMembership> list = this.jbpm4IdMembershipSelectObjects(jbpm4IdMembershipQueryCondition);
	return common.util.ListUtil.getFirstItem(Jbpm4IdMembership.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdMembership> List<T> jbpm4IdMembershipSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4IdMembershipSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdMembership> List<T> jbpm4IdMembershipSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4IdMembershipSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdMembership> T jbpm4IdMembershipSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4IdMembershipSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdMembership> List<T> jbpm4IdMembershipSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4IdMembershipSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4IdMembership> List<T> jbpm4IdMembershipSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4IdMembershipSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4IdMembership> T jbpm4IdMembershipSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4IdMembershipSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="jbpm4IdMembershipQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdMembership> List<T> jbpm4IdMembershipSelectObjects(Class<T> type, ConditionQuery jbpm4IdMembershipQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4IdMembershipQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4IdMembershipSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4IdMembershipQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdMembership> List<T> jbpm4IdMembershipSelectObjects(Class<T> type, ConditionQuery jbpm4IdMembershipQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4IdMembershipQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4IdMembershipSelectObjects(type, sql);
}

/**
 * <param name="jbpm4IdMembershipQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdMembership> T jbpm4IdMembershipSelectSingleObject(Class<T> type, ConditionQuery jbpm4IdMembershipQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4IdMembershipSelectObjects(type, jbpm4IdMembershipQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int jbpm4IdMembershipQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4IdMembershipQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="jbpm4IdMembershipQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int jbpm4IdMembershipQuerySelectObjectsCount(ConditionQuery jbpm4IdMembershipQueryCondition) throws SQLException, DbException {
	String sql = jbpm4IdMembershipQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4IdMembershipQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Jbpm4IdUser到数据库中
 * <param name="jbpm4IdUser">需要插入的新对象</param>
 */
public void jbpm4IdUserInsert(Jbpm4IdUser jbpm4IdUser) throws SQLException, DbException {
	this.getDao().jbpm4IdUserInsert(jbpm4IdUser);
	String kvalue = "";
	kvalue = (kvalue + jbpm4IdUser.getDbid());
	this.operatesLogSimpleAdd("JBPM4_ID_USER", "插入", "DBID_", kvalue, jbpm4IdUser);
}

/**
 * 从数据库中删除一个对象Jbpm4IdUser
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void jbpm4IdUserDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[JBPM4_ID_USER].[DBID_] = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	if ((this.getDao().jbpm4IdMembershipSelectObjects((" inner join JBPM4_ID_USER on [JBPM4_ID_USER].[DBID_] = [JBPM4_ID_MEMBERSHIP].[USE" +
"R_] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_ID_USER", "JBPM4_ID_MEMBERSHIP"));
	}
	this.getDao().jbpm4IdUserDeleteByDbid(ADbid, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ADbid);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("JBPM4_ID_USER", "删除", "DBID_", kvalue, null);
}

/**
 * 从数据库中删除一个对象Jbpm4IdUser
 * <param name="ADbid"></param>
 */
public void jbpm4IdUserDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4IdUserDeleteByDbid(ADbid, "");
}

/**
 * 更新一个对象Jbpm4IdUser到数据库中
 * <param name="jbpm4IdUser">需要更新的Jbpm4IdUser</param>
 */
public int jbpm4IdUserUpdate(Jbpm4IdUser jbpm4IdUser) throws SQLException, DbException {
	return this.jbpm4IdUserUpdate(jbpm4IdUser, "");
}

/**
 * 更新一个对象Jbpm4IdUser到数据库中
 * <param name="jbpm4IdUser">需要更新的Jbpm4IdUser</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int jbpm4IdUserUpdate(Jbpm4IdUser jbpm4IdUser, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4IdUserUpdate(jbpm4IdUser, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + jbpm4IdUser.getDbid());
	this.operatesLogSimpleAdd("JBPM4_ID_USER", "更新", "DBID_", kvalue, jbpm4IdUser);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
public Jbpm4IdUser jbpm4IdUserSelectByDbid(double ADbid) throws SQLException, DbException {
	return this.getDao().jbpm4IdUserSelectByDbid(ADbid);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4IdUser> jbpm4IdUserSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4IdUserSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Jbpm4IdUser> jbpm4IdUserSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().jbpm4IdUserSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4IdUser> jbpm4IdUserSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4IdUserSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Jbpm4IdUser> jbpm4IdUserSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().jbpm4IdUserSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Jbpm4IdUser jbpm4IdUserSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Jbpm4IdUser> list = this.jbpm4IdUserSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Jbpm4IdUser.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4IdUser> jbpm4IdUserSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.jbpm4IdUserSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Jbpm4IdUser> jbpm4IdUserSelectObjects() throws SQLException, DbException {
	return this.jbpm4IdUserSelectObjects("");
}

/**
 * @return 查询结果
 */
public Jbpm4IdUser jbpm4IdUserSelectSingleObject() throws SQLException, DbException {
	return this.jbpm4IdUserSelectSingleObject("");
}

/**
 * <param name="jbpm4IdUserQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4IdUser> jbpm4IdUserSelectObjects(ConditionQuery jbpm4IdUserQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = jbpm4IdUserQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4IdUserSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4IdUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Jbpm4IdUser> jbpm4IdUserSelectObjects(ConditionQuery jbpm4IdUserQueryCondition) throws SQLException, DbException {
	String sql = jbpm4IdUserQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4IdUserSelectObjects(sql);
}

/**
 * <param name="jbpm4IdUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Jbpm4IdUser jbpm4IdUserSelectSingleObject(ConditionQuery jbpm4IdUserQueryCondition) throws SQLException, DbException {
	List<Jbpm4IdUser> list = this.jbpm4IdUserSelectObjects(jbpm4IdUserQueryCondition);
	return common.util.ListUtil.getFirstItem(Jbpm4IdUser.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdUser> List<T> jbpm4IdUserSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4IdUserSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdUser> List<T> jbpm4IdUserSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4IdUserSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdUser> T jbpm4IdUserSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4IdUserSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdUser> List<T> jbpm4IdUserSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4IdUserSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4IdUser> List<T> jbpm4IdUserSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4IdUserSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4IdUser> T jbpm4IdUserSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4IdUserSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="jbpm4IdUserQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdUser> List<T> jbpm4IdUserSelectObjects(Class<T> type, ConditionQuery jbpm4IdUserQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4IdUserQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4IdUserSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4IdUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdUser> List<T> jbpm4IdUserSelectObjects(Class<T> type, ConditionQuery jbpm4IdUserQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4IdUserQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4IdUserSelectObjects(type, sql);
}

/**
 * <param name="jbpm4IdUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4IdUser> T jbpm4IdUserSelectSingleObject(Class<T> type, ConditionQuery jbpm4IdUserQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4IdUserSelectObjects(type, jbpm4IdUserQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int jbpm4IdUserQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4IdUserQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="jbpm4IdUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int jbpm4IdUserQuerySelectObjectsCount(ConditionQuery jbpm4IdUserQueryCondition) throws SQLException, DbException {
	String sql = jbpm4IdUserQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4IdUserQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Jbpm4Job到数据库中
 * <param name="jbpm4Job">需要插入的新对象</param>
 */
public void jbpm4JobInsert(Jbpm4Job jbpm4Job) throws SQLException, DbException {
	this.getDao().jbpm4JobInsert(jbpm4Job);
	String kvalue = "";
	kvalue = (kvalue + jbpm4Job.getDbid());
	this.operatesLogSimpleAdd("JBPM4_JOB", "插入", "DBID_", kvalue, jbpm4Job);
}

/**
 * 从数据库中删除一个对象Jbpm4Job
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void jbpm4JobDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().jbpm4JobDeleteByDbid(ADbid, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ADbid);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("JBPM4_JOB", "删除", "DBID_", kvalue, null);
}

/**
 * 从数据库中删除一个对象Jbpm4Job
 * <param name="ADbid"></param>
 */
public void jbpm4JobDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4JobDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4Job
 * <param name="ACfg"></param>
 */
public void jbpm4JobDeleteListByCfg(Double ACfg) throws SQLException, DbException {
	this.getDao().jbpm4JobDeleteListByCfg(ACfg);
	String kvalue = "";
	kvalue = (kvalue + ACfg);
	this.operatesLogSimpleAdd("JBPM4_JOB", "删除", "CFG_", kvalue, null);
}

/**
 * 更新一个对象Jbpm4Job到数据库中
 * <param name="jbpm4Job">需要更新的Jbpm4Job</param>
 */
public int jbpm4JobUpdate(Jbpm4Job jbpm4Job) throws SQLException, DbException {
	return this.jbpm4JobUpdate(jbpm4Job, "");
}

/**
 * 更新一个对象Jbpm4Job到数据库中
 * <param name="jbpm4Job">需要更新的Jbpm4Job</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int jbpm4JobUpdate(Jbpm4Job jbpm4Job, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4JobUpdate(jbpm4Job, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + jbpm4Job.getDbid());
	this.operatesLogSimpleAdd("JBPM4_JOB", "更新", "DBID_", kvalue, jbpm4Job);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
public Jbpm4Job jbpm4JobSelectByDbid(double ADbid) throws SQLException, DbException {
	return this.getDao().jbpm4JobSelectByDbid(ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ACfg"></param>
 */
public List<Jbpm4Job> jbpm4JobSelectObjectsByCfg(Double ACfg) throws SQLException, DbException {
	return this.getDao().jbpm4JobSelectObjectsByCfg(ACfg);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Job> jbpm4JobSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4JobSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Jbpm4Job> jbpm4JobSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().jbpm4JobSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Job> jbpm4JobSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4JobSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Jbpm4Job> jbpm4JobSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().jbpm4JobSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Jbpm4Job jbpm4JobSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Jbpm4Job> list = this.jbpm4JobSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Jbpm4Job.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Job> jbpm4JobSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.jbpm4JobSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Jbpm4Job> jbpm4JobSelectObjects() throws SQLException, DbException {
	return this.jbpm4JobSelectObjects("");
}

/**
 * @return 查询结果
 */
public Jbpm4Job jbpm4JobSelectSingleObject() throws SQLException, DbException {
	return this.jbpm4JobSelectSingleObject("");
}

/**
 * <param name="jbpm4JobQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Job> jbpm4JobSelectObjects(ConditionQuery jbpm4JobQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = jbpm4JobQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4JobSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4JobQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Jbpm4Job> jbpm4JobSelectObjects(ConditionQuery jbpm4JobQueryCondition) throws SQLException, DbException {
	String sql = jbpm4JobQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4JobSelectObjects(sql);
}

/**
 * <param name="jbpm4JobQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Jbpm4Job jbpm4JobSelectSingleObject(ConditionQuery jbpm4JobQueryCondition) throws SQLException, DbException {
	List<Jbpm4Job> list = this.jbpm4JobSelectObjects(jbpm4JobQueryCondition);
	return common.util.ListUtil.getFirstItem(Jbpm4Job.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Job> List<T> jbpm4JobSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4JobSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4Job> List<T> jbpm4JobSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4JobSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4Job> T jbpm4JobSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4JobSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Job> List<T> jbpm4JobSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4JobSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4Job> List<T> jbpm4JobSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4JobSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4Job> T jbpm4JobSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4JobSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="jbpm4JobQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Job> List<T> jbpm4JobSelectObjects(Class<T> type, ConditionQuery jbpm4JobQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4JobQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4JobSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4JobQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4Job> List<T> jbpm4JobSelectObjects(Class<T> type, ConditionQuery jbpm4JobQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4JobQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4JobSelectObjects(type, sql);
}

/**
 * <param name="jbpm4JobQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4Job> T jbpm4JobSelectSingleObject(Class<T> type, ConditionQuery jbpm4JobQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4JobSelectObjects(type, jbpm4JobQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int jbpm4JobQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4JobQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="jbpm4JobQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int jbpm4JobQuerySelectObjectsCount(ConditionQuery jbpm4JobQueryCondition) throws SQLException, DbException {
	String sql = jbpm4JobQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4JobQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Jbpm4Lob到数据库中
 * <param name="jbpm4Lob">需要插入的新对象</param>
 */
public void jbpm4LobInsert(Jbpm4Lob jbpm4Lob) throws SQLException, DbException {
	this.getDao().jbpm4LobInsert(jbpm4Lob);
	String kvalue = "";
	kvalue = (kvalue + jbpm4Lob.getDbid());
	this.operatesLogSimpleAdd("JBPM4_LOB", "插入", "DBID_", kvalue, jbpm4Lob);
}

/**
 * 从数据库中删除一个对象Jbpm4Lob
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void jbpm4LobDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[JBPM4_LOB].[DBID_] = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	if ((this.getDao().jbpm4VariableSelectObjects((" inner join JBPM4_LOB on [JBPM4_LOB].[DBID_] = [JBPM4_VARIABLE].[LOB_] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_LOB", "JBPM4_VARIABLE"));
	}
	sql = "";
	sql = (sql + "[JBPM4_LOB].[DBID_] = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	if ((this.getDao().jbpm4JobSelectObjects((" inner join JBPM4_LOB on [JBPM4_LOB].[DBID_] = [JBPM4_JOB].[CFG_] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_LOB", "JBPM4_JOB"));
	}
	this.getDao().jbpm4LobDeleteByDbid(ADbid, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ADbid);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("JBPM4_LOB", "删除", "DBID_", kvalue, null);
}

/**
 * 从数据库中删除一个对象Jbpm4Lob
 * <param name="ADbid"></param>
 */
public void jbpm4LobDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4LobDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4Lob
 * <param name="ADeployment"></param>
 */
public void jbpm4LobDeleteListByDeployment(Double ADeployment) throws SQLException, DbException {
	if ((this.getDao().jbpm4VariableSelectObjects((" inner join JBPM4_LOB on [JBPM4_LOB].[DBID_] = [JBPM4_VARIABLE].[LOB_] where [JBP" +
"M4_LOB].[DEPLOYMENT_] = " + ADeployment)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_LOB", "JBPM4_VARIABLE"));
	}
	if ((this.getDao().jbpm4JobSelectObjects((" inner join JBPM4_LOB on [JBPM4_LOB].[DBID_] = [JBPM4_JOB].[CFG_] where [JBPM4_LO" +
"B].[DEPLOYMENT_] = " + ADeployment)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("JBPM4_LOB", "JBPM4_JOB"));
	}
	this.getDao().jbpm4LobDeleteListByDeployment(ADeployment);
	String kvalue = "";
	kvalue = (kvalue + ADeployment);
	this.operatesLogSimpleAdd("JBPM4_LOB", "删除", "DEPLOYMENT_", kvalue, null);
}

/**
 * 更新一个对象Jbpm4Lob到数据库中
 * <param name="jbpm4Lob">需要更新的Jbpm4Lob</param>
 */
public int jbpm4LobUpdate(Jbpm4Lob jbpm4Lob) throws SQLException, DbException {
	return this.jbpm4LobUpdate(jbpm4Lob, "");
}

/**
 * 更新一个对象Jbpm4Lob到数据库中
 * <param name="jbpm4Lob">需要更新的Jbpm4Lob</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int jbpm4LobUpdate(Jbpm4Lob jbpm4Lob, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4LobUpdate(jbpm4Lob, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + jbpm4Lob.getDbid());
	this.operatesLogSimpleAdd("JBPM4_LOB", "更新", "DBID_", kvalue, jbpm4Lob);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
public Jbpm4Lob jbpm4LobSelectByDbid(double ADbid) throws SQLException, DbException {
	return this.getDao().jbpm4LobSelectByDbid(ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ADeployment"></param>
 */
public List<Jbpm4Lob> jbpm4LobSelectObjectsByDeployment(Double ADeployment) throws SQLException, DbException {
	return this.getDao().jbpm4LobSelectObjectsByDeployment(ADeployment);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Lob> jbpm4LobSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4LobSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Jbpm4Lob> jbpm4LobSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().jbpm4LobSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Lob> jbpm4LobSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4LobSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Jbpm4Lob> jbpm4LobSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().jbpm4LobSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Jbpm4Lob jbpm4LobSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Jbpm4Lob> list = this.jbpm4LobSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Jbpm4Lob.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Lob> jbpm4LobSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.jbpm4LobSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Jbpm4Lob> jbpm4LobSelectObjects() throws SQLException, DbException {
	return this.jbpm4LobSelectObjects("");
}

/**
 * @return 查询结果
 */
public Jbpm4Lob jbpm4LobSelectSingleObject() throws SQLException, DbException {
	return this.jbpm4LobSelectSingleObject("");
}

/**
 * <param name="jbpm4LobQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Lob> jbpm4LobSelectObjects(ConditionQuery jbpm4LobQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = jbpm4LobQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4LobSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4LobQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Jbpm4Lob> jbpm4LobSelectObjects(ConditionQuery jbpm4LobQueryCondition) throws SQLException, DbException {
	String sql = jbpm4LobQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4LobSelectObjects(sql);
}

/**
 * <param name="jbpm4LobQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Jbpm4Lob jbpm4LobSelectSingleObject(ConditionQuery jbpm4LobQueryCondition) throws SQLException, DbException {
	List<Jbpm4Lob> list = this.jbpm4LobSelectObjects(jbpm4LobQueryCondition);
	return common.util.ListUtil.getFirstItem(Jbpm4Lob.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Lob> List<T> jbpm4LobSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4LobSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4Lob> List<T> jbpm4LobSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4LobSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4Lob> T jbpm4LobSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4LobSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Lob> List<T> jbpm4LobSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4LobSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4Lob> List<T> jbpm4LobSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4LobSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4Lob> T jbpm4LobSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4LobSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="jbpm4LobQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Lob> List<T> jbpm4LobSelectObjects(Class<T> type, ConditionQuery jbpm4LobQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4LobQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4LobSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4LobQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4Lob> List<T> jbpm4LobSelectObjects(Class<T> type, ConditionQuery jbpm4LobQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4LobQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4LobSelectObjects(type, sql);
}

/**
 * <param name="jbpm4LobQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4Lob> T jbpm4LobSelectSingleObject(Class<T> type, ConditionQuery jbpm4LobQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4LobSelectObjects(type, jbpm4LobQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int jbpm4LobQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4LobQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="jbpm4LobQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int jbpm4LobQuerySelectObjectsCount(ConditionQuery jbpm4LobQueryCondition) throws SQLException, DbException {
	String sql = jbpm4LobQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4LobQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Jbpm4Participation到数据库中
 * <param name="jbpm4Participation">需要插入的新对象</param>
 */
public void jbpm4ParticipationInsert(Jbpm4Participation jbpm4Participation) throws SQLException, DbException {
	this.getDao().jbpm4ParticipationInsert(jbpm4Participation);
	String kvalue = "";
	kvalue = (kvalue + jbpm4Participation.getDbid());
	this.operatesLogSimpleAdd("JBPM4_PARTICIPATION", "插入", "DBID_", kvalue, jbpm4Participation);
}

/**
 * 从数据库中删除一个对象Jbpm4Participation
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void jbpm4ParticipationDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().jbpm4ParticipationDeleteByDbid(ADbid, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ADbid);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("JBPM4_PARTICIPATION", "删除", "DBID_", kvalue, null);
}

/**
 * 从数据库中删除一个对象Jbpm4Participation
 * <param name="ADbid"></param>
 */
public void jbpm4ParticipationDeleteByDbid(double ADbid) throws SQLException, DbException {
	this.jbpm4ParticipationDeleteByDbid(ADbid, "");
}

/**
 * 从数据库中删除一批对象Jbpm4Participation
 * <param name="ASwimlane"></param>
 */
public void jbpm4ParticipationDeleteListBySwimlane(Double ASwimlane) throws SQLException, DbException {
	this.getDao().jbpm4ParticipationDeleteListBySwimlane(ASwimlane);
	String kvalue = "";
	kvalue = (kvalue + ASwimlane);
	this.operatesLogSimpleAdd("JBPM4_PARTICIPATION", "删除", "SWIMLANE_", kvalue, null);
}

/**
 * 从数据库中删除一批对象Jbpm4Participation
 * <param name="ATask"></param>
 */
public void jbpm4ParticipationDeleteListByTask(Double ATask) throws SQLException, DbException {
	this.getDao().jbpm4ParticipationDeleteListByTask(ATask);
	String kvalue = "";
	kvalue = (kvalue + ATask);
	this.operatesLogSimpleAdd("JBPM4_PARTICIPATION", "删除", "TASK_", kvalue, null);
}

/**
 * 更新一个对象Jbpm4Participation到数据库中
 * <param name="jbpm4Participation">需要更新的Jbpm4Participation</param>
 */
public int jbpm4ParticipationUpdate(Jbpm4Participation jbpm4Participation) throws SQLException, DbException {
	return this.jbpm4ParticipationUpdate(jbpm4Participation, "");
}

/**
 * 更新一个对象Jbpm4Participation到数据库中
 * <param name="jbpm4Participation">需要更新的Jbpm4Participation</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int jbpm4ParticipationUpdate(Jbpm4Participation jbpm4Participation, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4ParticipationUpdate(jbpm4Participation, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + jbpm4Participation.getDbid());
	this.operatesLogSimpleAdd("JBPM4_PARTICIPATION", "更新", "DBID_", kvalue, jbpm4Participation);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
public Jbpm4Participation jbpm4ParticipationSelectByDbid(double ADbid) throws SQLException, DbException {
	return this.getDao().jbpm4ParticipationSelectByDbid(ADbid);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ASwimlane"></param>
 */
public List<Jbpm4Participation> jbpm4ParticipationSelectObjectsBySwimlane(Double ASwimlane) throws SQLException, DbException {
	return this.getDao().jbpm4ParticipationSelectObjectsBySwimlane(ASwimlane);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATask"></param>
 */
public List<Jbpm4Participation> jbpm4ParticipationSelectObjectsByTask(Double ATask) throws SQLException, DbException {
	return this.getDao().jbpm4ParticipationSelectObjectsByTask(ATask);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Participation> jbpm4ParticipationSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4ParticipationSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Jbpm4Participation> jbpm4ParticipationSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().jbpm4ParticipationSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Participation> jbpm4ParticipationSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4ParticipationSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Jbpm4Participation> jbpm4ParticipationSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().jbpm4ParticipationSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Jbpm4Participation jbpm4ParticipationSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Jbpm4Participation> list = this.jbpm4ParticipationSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Jbpm4Participation.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Participation> jbpm4ParticipationSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.jbpm4ParticipationSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Jbpm4Participation> jbpm4ParticipationSelectObjects() throws SQLException, DbException {
	return this.jbpm4ParticipationSelectObjects("");
}

/**
 * @return 查询结果
 */
public Jbpm4Participation jbpm4ParticipationSelectSingleObject() throws SQLException, DbException {
	return this.jbpm4ParticipationSelectSingleObject("");
}

/**
 * <param name="jbpm4ParticipationQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Participation> jbpm4ParticipationSelectObjects(ConditionQuery jbpm4ParticipationQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = jbpm4ParticipationQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4ParticipationSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4ParticipationQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Jbpm4Participation> jbpm4ParticipationSelectObjects(ConditionQuery jbpm4ParticipationQueryCondition) throws SQLException, DbException {
	String sql = jbpm4ParticipationQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4ParticipationSelectObjects(sql);
}

/**
 * <param name="jbpm4ParticipationQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Jbpm4Participation jbpm4ParticipationSelectSingleObject(ConditionQuery jbpm4ParticipationQueryCondition) throws SQLException, DbException {
	List<Jbpm4Participation> list = this.jbpm4ParticipationSelectObjects(jbpm4ParticipationQueryCondition);
	return common.util.ListUtil.getFirstItem(Jbpm4Participation.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Participation> List<T> jbpm4ParticipationSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4ParticipationSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4Participation> List<T> jbpm4ParticipationSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4ParticipationSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4Participation> T jbpm4ParticipationSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4ParticipationSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Participation> List<T> jbpm4ParticipationSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4ParticipationSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4Participation> List<T> jbpm4ParticipationSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4ParticipationSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4Participation> T jbpm4ParticipationSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4ParticipationSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="jbpm4ParticipationQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Participation> List<T> jbpm4ParticipationSelectObjects(Class<T> type, ConditionQuery jbpm4ParticipationQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4ParticipationQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4ParticipationSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4ParticipationQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4Participation> List<T> jbpm4ParticipationSelectObjects(Class<T> type, ConditionQuery jbpm4ParticipationQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4ParticipationQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4ParticipationSelectObjects(type, sql);
}

/**
 * <param name="jbpm4ParticipationQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4Participation> T jbpm4ParticipationSelectSingleObject(Class<T> type, ConditionQuery jbpm4ParticipationQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4ParticipationSelectObjects(type, jbpm4ParticipationQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int jbpm4ParticipationQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4ParticipationQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="jbpm4ParticipationQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int jbpm4ParticipationQuerySelectObjectsCount(ConditionQuery jbpm4ParticipationQueryCondition) throws SQLException, DbException {
	String sql = jbpm4ParticipationQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4ParticipationQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象Jbpm4Property到数据库中
 * <param name="jbpm4Property">需要插入的新对象</param>
 */
public void jbpm4PropertyInsert(Jbpm4Property jbpm4Property) throws SQLException, DbException {
	this.getDao().jbpm4PropertyInsert(jbpm4Property);
	String kvalue = "";
	kvalue = (kvalue + jbpm4Property.getKey());
	this.operatesLogSimpleAdd("JBPM4_PROPERTY", "插入", "KEY_", kvalue, jbpm4Property);
}

/**
 * 从数据库中删除一个对象Jbpm4Property
 * <param name="AKey"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void jbpm4PropertyDeleteByKey(String AKey, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().jbpm4PropertyDeleteByKey(AKey, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AKey);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("JBPM4_PROPERTY", "删除", "KEY_", kvalue, null);
}

/**
 * 从数据库中删除一个对象Jbpm4Property
 * <param name="AKey"></param>
 */
public void jbpm4PropertyDeleteByKey(String AKey) throws SQLException, DbException {
	this.jbpm4PropertyDeleteByKey(AKey, "");
}

/**
 * 更新一个对象Jbpm4Property到数据库中
 * <param name="jbpm4Property">需要更新的Jbpm4Property</param>
 */
public int jbpm4PropertyUpdate(Jbpm4Property jbpm4Property) throws SQLException, DbException {
	return this.jbpm4PropertyUpdate(jbpm4Property, "");
}

/**
 * 更新一个对象Jbpm4Property到数据库中
 * <param name="jbpm4Property">需要更新的Jbpm4Property</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int jbpm4PropertyUpdate(Jbpm4Property jbpm4Property, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4PropertyUpdate(jbpm4Property, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + jbpm4Property.getKey());
	this.operatesLogSimpleAdd("JBPM4_PROPERTY", "更新", "KEY_", kvalue, jbpm4Property);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AKey"></param>
 */
public Jbpm4Property jbpm4PropertySelectByKey(String AKey) throws SQLException, DbException {
	return this.getDao().jbpm4PropertySelectByKey(AKey);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Property> jbpm4PropertySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4PropertySelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<Jbpm4Property> jbpm4PropertySelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().jbpm4PropertySelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Property> jbpm4PropertySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().jbpm4PropertySelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<Jbpm4Property> jbpm4PropertySelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().jbpm4PropertySelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public Jbpm4Property jbpm4PropertySelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<Jbpm4Property> list = this.jbpm4PropertySelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(Jbpm4Property.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Property> jbpm4PropertySelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.jbpm4PropertySelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<Jbpm4Property> jbpm4PropertySelectObjects() throws SQLException, DbException {
	return this.jbpm4PropertySelectObjects("");
}

/**
 * @return 查询结果
 */
public Jbpm4Property jbpm4PropertySelectSingleObject() throws SQLException, DbException {
	return this.jbpm4PropertySelectSingleObject("");
}

/**
 * <param name="jbpm4PropertyQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<Jbpm4Property> jbpm4PropertySelectObjects(ConditionQuery jbpm4PropertyQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = jbpm4PropertyQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4PropertySelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4PropertyQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<Jbpm4Property> jbpm4PropertySelectObjects(ConditionQuery jbpm4PropertyQueryCondition) throws SQLException, DbException {
	String sql = jbpm4PropertyQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4PropertySelectObjects(sql);
}

/**
 * <param name="jbpm4PropertyQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public Jbpm4Property jbpm4PropertySelectSingleObject(ConditionQuery jbpm4PropertyQueryCondition) throws SQLException, DbException {
	List<Jbpm4Property> list = this.jbpm4PropertySelectObjects(jbpm4PropertyQueryCondition);
	return common.util.ListUtil.getFirstItem(Jbpm4Property.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Property> List<T> jbpm4PropertySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4PropertySelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4Property> List<T> jbpm4PropertySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().jbpm4PropertySelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends Jbpm4Property> T jbpm4PropertySelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4PropertySelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Property> List<T> jbpm4PropertySelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4PropertySelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4Property> List<T> jbpm4PropertySelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.jbpm4PropertySelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends Jbpm4Property> T jbpm4PropertySelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4PropertySelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="jbpm4PropertyQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends Jbpm4Property> List<T> jbpm4PropertySelectObjects(Class<T> type, ConditionQuery jbpm4PropertyQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4PropertyQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4PropertySelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="jbpm4PropertyQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4Property> List<T> jbpm4PropertySelectObjects(Class<T> type, ConditionQuery jbpm4PropertyQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = jbpm4PropertyQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4PropertySelectObjects(type, sql);
}

/**
 * <param name="jbpm4PropertyQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends Jbpm4Property> T jbpm4PropertySelectSingleObject(Class<T> type, ConditionQuery jbpm4PropertyQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.jbpm4PropertySelectObjects(type, jbpm4PropertyQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int jbpm4PropertyQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().jbpm4PropertyQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="jbpm4PropertyQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int jbpm4PropertyQuerySelectObjectsCount(ConditionQuery jbpm4PropertyQueryCondition) throws SQLException, DbException {
	String sql = jbpm4PropertyQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.jbpm4PropertyQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象FundNav到数据库中
 * <param name="fundNav">需要插入的新对象</param>
 */
public void fundNavInsert(FundNav fundNav) throws SQLException, DbException {
	this.getDao().fundNavInsert(fundNav);
	String kvalue = "";
	this.operatesLogSimpleAdd("FUND_NAV", "插入", "", kvalue, fundNav);
}

/**
 * 更新一个对象FundNav到数据库中
 * <param name="fundNav">需要更新的FundNav</param>
 */
public int fundNavUpdate(FundNav fundNav) throws SQLException, DbException {
	return this.fundNavUpdate(fundNav, "");
}

/**
 * 更新一个对象FundNav到数据库中
 * <param name="fundNav">需要更新的FundNav</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int fundNavUpdate(FundNav fundNav, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().fundNavUpdate(fundNav, appendConditionSql);
	String kvalue = "";
	this.operatesLogSimpleAdd("FUND_NAV", "更新", "", kvalue, fundNav);
	return ret;
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<FundNav> fundNavSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().fundNavSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<FundNav> fundNavSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().fundNavSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<FundNav> fundNavSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().fundNavSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<FundNav> fundNavSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().fundNavSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public FundNav fundNavSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<FundNav> list = this.fundNavSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(FundNav.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<FundNav> fundNavSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.fundNavSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<FundNav> fundNavSelectObjects() throws SQLException, DbException {
	return this.fundNavSelectObjects("");
}

/**
 * @return 查询结果
 */
public FundNav fundNavSelectSingleObject() throws SQLException, DbException {
	return this.fundNavSelectSingleObject("");
}

/**
 * <param name="fundNavQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<FundNav> fundNavSelectObjects(ConditionQuery fundNavQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = fundNavQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.fundNavSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="fundNavQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<FundNav> fundNavSelectObjects(ConditionQuery fundNavQueryCondition) throws SQLException, DbException {
	String sql = fundNavQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.fundNavSelectObjects(sql);
}

/**
 * <param name="fundNavQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public FundNav fundNavSelectSingleObject(ConditionQuery fundNavQueryCondition) throws SQLException, DbException {
	List<FundNav> list = this.fundNavSelectObjects(fundNavQueryCondition);
	return common.util.ListUtil.getFirstItem(FundNav.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends FundNav> List<T> fundNavSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().fundNavSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends FundNav> List<T> fundNavSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().fundNavSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends FundNav> T fundNavSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.fundNavSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends FundNav> List<T> fundNavSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.fundNavSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends FundNav> List<T> fundNavSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.fundNavSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends FundNav> T fundNavSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.fundNavSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="fundNavQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends FundNav> List<T> fundNavSelectObjects(Class<T> type, ConditionQuery fundNavQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = fundNavQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.fundNavSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="fundNavQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends FundNav> List<T> fundNavSelectObjects(Class<T> type, ConditionQuery fundNavQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = fundNavQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.fundNavSelectObjects(type, sql);
}

/**
 * <param name="fundNavQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends FundNav> T fundNavSelectSingleObject(Class<T> type, ConditionQuery fundNavQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.fundNavSelectObjects(type, fundNavQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int fundNavQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().fundNavQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="fundNavQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int fundNavQuerySelectObjectsCount(ConditionQuery fundNavQueryCondition) throws SQLException, DbException {
	String sql = fundNavQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.fundNavQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象FuncTest到数据库中
 * <param name="funcTest">需要插入的新对象</param>
 */
public void funcTestInsert(FuncTest funcTest) throws SQLException, DbException {
	this.getDao().funcTestInsert(funcTest);
	String kvalue = "";
	kvalue = (kvalue + funcTest.getBuildId());
	kvalue = (kvalue + ",");
	kvalue = (kvalue + funcTest.getParamId());
	this.operatesLogSimpleAdd("T_FUNC_TEST", "插入", "BUILD_ID,PARAM_ID", kvalue, funcTest);
}

/**
 * 从数据库中删除一个对象FuncTest
 * <param name="ABuildId">构建标识</param>
 * <param name="AParamId">参数标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void funcTestDeleteByBuildIdParamId(int ABuildId, int AParamId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().funcTestDeleteByBuildIdParamId(ABuildId, AParamId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ABuildId);
	kvalue = (kvalue + ",");
	kvalue = (kvalue + AParamId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_FUNC_TEST", "删除", "BUILD_ID,PARAM_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象FuncTest
 * <param name="ABuildId">构建标识</param>
 * <param name="AParamId">参数标识</param>
 */
public void funcTestDeleteByBuildIdParamId(int ABuildId, int AParamId) throws SQLException, DbException {
	this.funcTestDeleteByBuildIdParamId(ABuildId, AParamId, "");
}

/**
 * 从数据库中删除一批对象FuncTest
 * <param name="ABuildId">构建标识</param>
 */
public void funcTestDeleteListByBuildId(int ABuildId) throws SQLException, DbException {
	this.getDao().funcTestDeleteListByBuildId(ABuildId);
	String kvalue = "";
	kvalue = (kvalue + ABuildId);
	this.operatesLogSimpleAdd("T_FUNC_TEST", "删除", "BUILD_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象FuncTest
 * <param name="AParamId">参数标识</param>
 */
public void funcTestDeleteListByParamId(int AParamId) throws SQLException, DbException {
	this.getDao().funcTestDeleteListByParamId(AParamId);
	String kvalue = "";
	kvalue = (kvalue + AParamId);
	this.operatesLogSimpleAdd("T_FUNC_TEST", "删除", "PARAM_ID", kvalue, null);
}

/**
 * 更新一个对象FuncTest到数据库中
 * <param name="funcTest">需要更新的FuncTest</param>
 */
public int funcTestUpdate(FuncTest funcTest) throws SQLException, DbException {
	return this.funcTestUpdate(funcTest, "");
}

/**
 * 更新一个对象FuncTest到数据库中
 * <param name="funcTest">需要更新的FuncTest</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int funcTestUpdate(FuncTest funcTest, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().funcTestUpdate(funcTest, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + funcTest.getBuildId());
	kvalue = (kvalue + ",");
	kvalue = (kvalue + funcTest.getParamId());
	this.operatesLogSimpleAdd("T_FUNC_TEST", "更新", "BUILD_ID,PARAM_ID", kvalue, funcTest);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ABuildId">构建标识</param>
 * <param name="AParamId">参数标识</param>
 */
public FuncTest funcTestSelectByBuildIdParamId(int ABuildId, int AParamId) throws SQLException, DbException {
	return this.getDao().funcTestSelectByBuildIdParamId(ABuildId, AParamId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ABuildId">构建标识</param>
 */
public List<FuncTest> funcTestSelectObjectsByBuildId(int ABuildId) throws SQLException, DbException {
	return this.getDao().funcTestSelectObjectsByBuildId(ABuildId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AParamId">参数标识</param>
 */
public List<FuncTest> funcTestSelectObjectsByParamId(int AParamId) throws SQLException, DbException {
	return this.getDao().funcTestSelectObjectsByParamId(AParamId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<FuncTest> funcTestSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().funcTestSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<FuncTest> funcTestSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().funcTestSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<FuncTest> funcTestSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().funcTestSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<FuncTest> funcTestSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().funcTestSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public FuncTest funcTestSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<FuncTest> list = this.funcTestSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(FuncTest.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<FuncTest> funcTestSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.funcTestSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<FuncTest> funcTestSelectObjects() throws SQLException, DbException {
	return this.funcTestSelectObjects("");
}

/**
 * @return 查询结果
 */
public FuncTest funcTestSelectSingleObject() throws SQLException, DbException {
	return this.funcTestSelectSingleObject("");
}

/**
 * <param name="funcTestQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<FuncTest> funcTestSelectObjects(ConditionQuery funcTestQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = funcTestQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.funcTestSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="funcTestQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<FuncTest> funcTestSelectObjects(ConditionQuery funcTestQueryCondition) throws SQLException, DbException {
	String sql = funcTestQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.funcTestSelectObjects(sql);
}

/**
 * <param name="funcTestQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public FuncTest funcTestSelectSingleObject(ConditionQuery funcTestQueryCondition) throws SQLException, DbException {
	List<FuncTest> list = this.funcTestSelectObjects(funcTestQueryCondition);
	return common.util.ListUtil.getFirstItem(FuncTest.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends FuncTest> List<T> funcTestSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().funcTestSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends FuncTest> List<T> funcTestSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().funcTestSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends FuncTest> T funcTestSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.funcTestSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends FuncTest> List<T> funcTestSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.funcTestSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends FuncTest> List<T> funcTestSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.funcTestSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends FuncTest> T funcTestSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.funcTestSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="funcTestQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends FuncTest> List<T> funcTestSelectObjects(Class<T> type, ConditionQuery funcTestQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = funcTestQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.funcTestSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="funcTestQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends FuncTest> List<T> funcTestSelectObjects(Class<T> type, ConditionQuery funcTestQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = funcTestQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.funcTestSelectObjects(type, sql);
}

/**
 * <param name="funcTestQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends FuncTest> T funcTestSelectSingleObject(Class<T> type, ConditionQuery funcTestQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.funcTestSelectObjects(type, funcTestQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int funcTestQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().funcTestQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="funcTestQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int funcTestQuerySelectObjectsCount(ConditionQuery funcTestQueryCondition) throws SQLException, DbException {
	String sql = funcTestQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.funcTestQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象TestProcedure到数据库中
 * <param name="testProcedure">需要插入的新对象</param>
 */
public void testProcedureInsert(TestProcedure testProcedure) throws SQLException, DbException {
	this.getDao().testProcedureInsert(testProcedure);
	String kvalue = "";
	kvalue = (kvalue + testProcedure.getTestProcedureId());
	this.operatesLogSimpleAdd("T_TEST_PROCEDURE", "插入", "TEST_PROCEDURE_ID", kvalue, testProcedure);
}

/**
 * 从数据库中删除一个对象TestProcedure
 * <param name="ATestProcedureId">测试过程标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void testProcedureDeleteByTestProcedureId(int ATestProcedureId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_TEST_PROCEDURE].[TEST_PROCEDURE_ID] = ");
	sql = (sql + ATestProcedureId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().testParamValueSelectObjects((" inner join T_TEST_PROCEDURE on [T_TEST_PROCEDURE].[TEST_PROCEDURE_ID] = [T_TEST_" +
"PARAM_VALUE].[TEST_PROCEDURE_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TEST_PROCEDURE", "T_TEST_PARAM_VALUE"));
	}
	this.getDao().testProcedureDeleteByTestProcedureId(ATestProcedureId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ATestProcedureId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_TEST_PROCEDURE", "删除", "TEST_PROCEDURE_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象TestProcedure
 * <param name="ATestProcedureId">测试过程标识</param>
 */
public void testProcedureDeleteByTestProcedureId(int ATestProcedureId) throws SQLException, DbException {
	this.testProcedureDeleteByTestProcedureId(ATestProcedureId, "");
}

/**
 * 从数据库中删除一批对象TestProcedure
 * <param name="ABuildId">构建标识</param>
 */
public void testProcedureDeleteListByBuildId(int ABuildId) throws SQLException, DbException {
	if ((this.getDao().testParamValueSelectObjects((" inner join T_TEST_PROCEDURE on [T_TEST_PROCEDURE].[TEST_PROCEDURE_ID] = [T_TEST_" +
"PARAM_VALUE].[TEST_PROCEDURE_ID] where [T_TEST_PROCEDURE].[BUILD_ID] = " + ABuildId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TEST_PROCEDURE", "T_TEST_PARAM_VALUE"));
	}
	this.getDao().testProcedureDeleteListByBuildId(ABuildId);
	String kvalue = "";
	kvalue = (kvalue + ABuildId);
	this.operatesLogSimpleAdd("T_TEST_PROCEDURE", "删除", "BUILD_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象TestProcedure
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
public void testProcedureDeleteListByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException {
	if ((this.getDao().testParamValueSelectObjects((" inner join T_TEST_PROCEDURE on [T_TEST_PROCEDURE].[TEST_PROCEDURE_ID] = [T_TEST_" +
"PARAM_VALUE].[TEST_PROCEDURE_ID] where [T_TEST_PROCEDURE].[FUNC_PROCEDURE_ID] = " +
"" + AFuncProcedureId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TEST_PROCEDURE", "T_TEST_PARAM_VALUE"));
	}
	this.getDao().testProcedureDeleteListByFuncProcedureId(AFuncProcedureId);
	String kvalue = "";
	kvalue = (kvalue + AFuncProcedureId);
	this.operatesLogSimpleAdd("T_TEST_PROCEDURE", "删除", "FUNC_PROCEDURE_ID", kvalue, null);
}

/**
 * 更新一个对象TestProcedure到数据库中
 * <param name="testProcedure">需要更新的TestProcedure</param>
 */
public int testProcedureUpdate(TestProcedure testProcedure) throws SQLException, DbException {
	return this.testProcedureUpdate(testProcedure, "");
}

/**
 * 更新一个对象TestProcedure到数据库中
 * <param name="testProcedure">需要更新的TestProcedure</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int testProcedureUpdate(TestProcedure testProcedure, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().testProcedureUpdate(testProcedure, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + testProcedure.getTestProcedureId());
	this.operatesLogSimpleAdd("T_TEST_PROCEDURE", "更新", "TEST_PROCEDURE_ID", kvalue, testProcedure);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATestProcedureId">测试过程标识</param>
 */
public TestProcedure testProcedureSelectByTestProcedureId(int ATestProcedureId) throws SQLException, DbException {
	return this.getDao().testProcedureSelectByTestProcedureId(ATestProcedureId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ABuildId">构建标识</param>
 */
public List<TestProcedure> testProcedureSelectObjectsByBuildId(int ABuildId) throws SQLException, DbException {
	return this.getDao().testProcedureSelectObjectsByBuildId(ABuildId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
public List<TestProcedure> testProcedureSelectObjectsByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException {
	return this.getDao().testProcedureSelectObjectsByFuncProcedureId(AFuncProcedureId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TestProcedure> testProcedureSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().testProcedureSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<TestProcedure> testProcedureSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().testProcedureSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TestProcedure> testProcedureSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().testProcedureSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<TestProcedure> testProcedureSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().testProcedureSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public TestProcedure testProcedureSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<TestProcedure> list = this.testProcedureSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(TestProcedure.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TestProcedure> testProcedureSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.testProcedureSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<TestProcedure> testProcedureSelectObjects() throws SQLException, DbException {
	return this.testProcedureSelectObjects("");
}

/**
 * @return 查询结果
 */
public TestProcedure testProcedureSelectSingleObject() throws SQLException, DbException {
	return this.testProcedureSelectSingleObject("");
}

/**
 * <param name="testProcedureQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TestProcedure> testProcedureSelectObjects(ConditionQuery testProcedureQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = testProcedureQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testProcedureSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="testProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<TestProcedure> testProcedureSelectObjects(ConditionQuery testProcedureQueryCondition) throws SQLException, DbException {
	String sql = testProcedureQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testProcedureSelectObjects(sql);
}

/**
 * <param name="testProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public TestProcedure testProcedureSelectSingleObject(ConditionQuery testProcedureQueryCondition) throws SQLException, DbException {
	List<TestProcedure> list = this.testProcedureSelectObjects(testProcedureQueryCondition);
	return common.util.ListUtil.getFirstItem(TestProcedure.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TestProcedure> List<T> testProcedureSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().testProcedureSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends TestProcedure> List<T> testProcedureSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().testProcedureSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends TestProcedure> T testProcedureSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.testProcedureSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TestProcedure> List<T> testProcedureSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.testProcedureSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends TestProcedure> List<T> testProcedureSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.testProcedureSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends TestProcedure> T testProcedureSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.testProcedureSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="testProcedureQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TestProcedure> List<T> testProcedureSelectObjects(Class<T> type, ConditionQuery testProcedureQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = testProcedureQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testProcedureSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="testProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends TestProcedure> List<T> testProcedureSelectObjects(Class<T> type, ConditionQuery testProcedureQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = testProcedureQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testProcedureSelectObjects(type, sql);
}

/**
 * <param name="testProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends TestProcedure> T testProcedureSelectSingleObject(Class<T> type, ConditionQuery testProcedureQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.testProcedureSelectObjects(type, testProcedureQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int testProcedureQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().testProcedureQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="testProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int testProcedureQuerySelectObjectsCount(ConditionQuery testProcedureQueryCondition) throws SQLException, DbException {
	String sql = testProcedureQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testProcedureQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象TestParamValue到数据库中
 * <param name="testParamValue">需要插入的新对象</param>
 */
public void testParamValueInsert(TestParamValue testParamValue) throws SQLException, DbException {
	this.getDao().testParamValueInsert(testParamValue);
	String kvalue = "";
	kvalue = (kvalue + testParamValue.getTestProcedureId());
	kvalue = (kvalue + ",");
	kvalue = (kvalue + testParamValue.getParamId());
	this.operatesLogSimpleAdd("T_TEST_PARAM_VALUE", "插入", "TEST_PROCEDURE_ID,PARAM_ID", kvalue, testParamValue);
}

/**
 * 从数据库中删除一个对象TestParamValue
 * <param name="ATestProcedureId">测试过程标识</param>
 * <param name="AParamId">参数标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void testParamValueDeleteByTestProcedureIdParamId(int ATestProcedureId, int AParamId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().testParamValueDeleteByTestProcedureIdParamId(ATestProcedureId, AParamId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ATestProcedureId);
	kvalue = (kvalue + ",");
	kvalue = (kvalue + AParamId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_TEST_PARAM_VALUE", "删除", "TEST_PROCEDURE_ID,PARAM_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象TestParamValue
 * <param name="ATestProcedureId">测试过程标识</param>
 * <param name="AParamId">参数标识</param>
 */
public void testParamValueDeleteByTestProcedureIdParamId(int ATestProcedureId, int AParamId) throws SQLException, DbException {
	this.testParamValueDeleteByTestProcedureIdParamId(ATestProcedureId, AParamId, "");
}

/**
 * 从数据库中删除一批对象TestParamValue
 * <param name="AParamId">参数标识</param>
 */
public void testParamValueDeleteListByParamId(int AParamId) throws SQLException, DbException {
	this.getDao().testParamValueDeleteListByParamId(AParamId);
	String kvalue = "";
	kvalue = (kvalue + AParamId);
	this.operatesLogSimpleAdd("T_TEST_PARAM_VALUE", "删除", "PARAM_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象TestParamValue
 * <param name="ATestProcedureId">测试过程标识</param>
 */
public void testParamValueDeleteListByTestProcedureId(int ATestProcedureId) throws SQLException, DbException {
	this.getDao().testParamValueDeleteListByTestProcedureId(ATestProcedureId);
	String kvalue = "";
	kvalue = (kvalue + ATestProcedureId);
	this.operatesLogSimpleAdd("T_TEST_PARAM_VALUE", "删除", "TEST_PROCEDURE_ID", kvalue, null);
}

/**
 * 更新一个对象TestParamValue到数据库中
 * <param name="testParamValue">需要更新的TestParamValue</param>
 */
public int testParamValueUpdate(TestParamValue testParamValue) throws SQLException, DbException {
	return this.testParamValueUpdate(testParamValue, "");
}

/**
 * 更新一个对象TestParamValue到数据库中
 * <param name="testParamValue">需要更新的TestParamValue</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int testParamValueUpdate(TestParamValue testParamValue, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().testParamValueUpdate(testParamValue, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + testParamValue.getTestProcedureId());
	kvalue = (kvalue + ",");
	kvalue = (kvalue + testParamValue.getParamId());
	this.operatesLogSimpleAdd("T_TEST_PARAM_VALUE", "更新", "TEST_PROCEDURE_ID,PARAM_ID", kvalue, testParamValue);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATestProcedureId">测试过程标识</param>
 * <param name="AParamId">参数标识</param>
 */
public TestParamValue testParamValueSelectByTestProcedureIdParamId(int ATestProcedureId, int AParamId) throws SQLException, DbException {
	return this.getDao().testParamValueSelectByTestProcedureIdParamId(ATestProcedureId, AParamId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AParamId">参数标识</param>
 */
public List<TestParamValue> testParamValueSelectObjectsByParamId(int AParamId) throws SQLException, DbException {
	return this.getDao().testParamValueSelectObjectsByParamId(AParamId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATestProcedureId">测试过程标识</param>
 */
public List<TestParamValue> testParamValueSelectObjectsByTestProcedureId(int ATestProcedureId) throws SQLException, DbException {
	return this.getDao().testParamValueSelectObjectsByTestProcedureId(ATestProcedureId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TestParamValue> testParamValueSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().testParamValueSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<TestParamValue> testParamValueSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().testParamValueSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TestParamValue> testParamValueSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().testParamValueSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<TestParamValue> testParamValueSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().testParamValueSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public TestParamValue testParamValueSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<TestParamValue> list = this.testParamValueSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(TestParamValue.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TestParamValue> testParamValueSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.testParamValueSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<TestParamValue> testParamValueSelectObjects() throws SQLException, DbException {
	return this.testParamValueSelectObjects("");
}

/**
 * @return 查询结果
 */
public TestParamValue testParamValueSelectSingleObject() throws SQLException, DbException {
	return this.testParamValueSelectSingleObject("");
}

/**
 * <param name="testParamValueQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TestParamValue> testParamValueSelectObjects(ConditionQuery testParamValueQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = testParamValueQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testParamValueSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="testParamValueQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<TestParamValue> testParamValueSelectObjects(ConditionQuery testParamValueQueryCondition) throws SQLException, DbException {
	String sql = testParamValueQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testParamValueSelectObjects(sql);
}

/**
 * <param name="testParamValueQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public TestParamValue testParamValueSelectSingleObject(ConditionQuery testParamValueQueryCondition) throws SQLException, DbException {
	List<TestParamValue> list = this.testParamValueSelectObjects(testParamValueQueryCondition);
	return common.util.ListUtil.getFirstItem(TestParamValue.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TestParamValue> List<T> testParamValueSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().testParamValueSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends TestParamValue> List<T> testParamValueSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().testParamValueSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends TestParamValue> T testParamValueSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.testParamValueSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TestParamValue> List<T> testParamValueSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.testParamValueSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends TestParamValue> List<T> testParamValueSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.testParamValueSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends TestParamValue> T testParamValueSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.testParamValueSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="testParamValueQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TestParamValue> List<T> testParamValueSelectObjects(Class<T> type, ConditionQuery testParamValueQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = testParamValueQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testParamValueSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="testParamValueQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends TestParamValue> List<T> testParamValueSelectObjects(Class<T> type, ConditionQuery testParamValueQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = testParamValueQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testParamValueSelectObjects(type, sql);
}

/**
 * <param name="testParamValueQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends TestParamValue> T testParamValueSelectSingleObject(Class<T> type, ConditionQuery testParamValueQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.testParamValueSelectObjects(type, testParamValueQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int testParamValueQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().testParamValueQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="testParamValueQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int testParamValueQuerySelectObjectsCount(ConditionQuery testParamValueQueryCondition) throws SQLException, DbException {
	String sql = testParamValueQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testParamValueQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象QuestionCategory到数据库中
 * <param name="questionCategory">需要插入的新对象</param>
 */
public void questionCategoryInsert(QuestionCategory questionCategory) throws SQLException, DbException {
	this.getDao().questionCategoryInsert(questionCategory);
	String kvalue = "";
	kvalue = (kvalue + questionCategory.getCategoryId());
	this.operatesLogSimpleAdd("T_QUESTION_CATEGORY", "插入", "CATEGORY_ID", kvalue, questionCategory);
}

/**
 * 从数据库中删除一个对象QuestionCategory
 * <param name="ACategoryId">分类标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void questionCategoryDeleteByCategoryId(int ACategoryId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_QUESTION_CATEGORY].[CATEGORY_ID] = ");
	sql = (sql + ACategoryId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().questionLibSelectObjects((" inner join T_QUESTION_CATEGORY on [T_QUESTION_CATEGORY].[CATEGORY_ID] = [T_QUEST" +
"ION_LIB].[CATEGORY_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_QUESTION_CATEGORY", "T_QUESTION_LIB"));
	}
	sql = "";
	sql = (sql + "[T_QUESTION_CATEGORY].[CATEGORY_ID] = ");
	sql = (sql + ACategoryId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().testPapersQuestionRangeSelectObjects((" inner join T_QUESTION_CATEGORY on [T_QUESTION_CATEGORY].[CATEGORY_ID] = [T_TEST_" +
"PAPERS_QUESTION_RANGE].[CATEGORY_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_QUESTION_CATEGORY", "T_TEST_PAPERS_QUESTION_RANGE"));
	}
	this.getDao().questionCategoryDeleteByCategoryId(ACategoryId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ACategoryId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_QUESTION_CATEGORY", "删除", "CATEGORY_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象QuestionCategory
 * <param name="ACategoryId">分类标识</param>
 */
public void questionCategoryDeleteByCategoryId(int ACategoryId) throws SQLException, DbException {
	this.questionCategoryDeleteByCategoryId(ACategoryId, "");
}

/**
 * 更新一个对象QuestionCategory到数据库中
 * <param name="questionCategory">需要更新的QuestionCategory</param>
 */
public int questionCategoryUpdate(QuestionCategory questionCategory) throws SQLException, DbException {
	return this.questionCategoryUpdate(questionCategory, "");
}

/**
 * 更新一个对象QuestionCategory到数据库中
 * <param name="questionCategory">需要更新的QuestionCategory</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int questionCategoryUpdate(QuestionCategory questionCategory, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().questionCategoryUpdate(questionCategory, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + questionCategory.getCategoryId());
	this.operatesLogSimpleAdd("T_QUESTION_CATEGORY", "更新", "CATEGORY_ID", kvalue, questionCategory);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ACategoryId">分类标识</param>
 */
public QuestionCategory questionCategorySelectByCategoryId(int ACategoryId) throws SQLException, DbException {
	return this.getDao().questionCategorySelectByCategoryId(ACategoryId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<QuestionCategory> questionCategorySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().questionCategorySelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<QuestionCategory> questionCategorySelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().questionCategorySelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<QuestionCategory> questionCategorySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().questionCategorySelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<QuestionCategory> questionCategorySelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().questionCategorySelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public QuestionCategory questionCategorySelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<QuestionCategory> list = this.questionCategorySelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(QuestionCategory.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<QuestionCategory> questionCategorySelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.questionCategorySelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<QuestionCategory> questionCategorySelectObjects() throws SQLException, DbException {
	return this.questionCategorySelectObjects("");
}

/**
 * @return 查询结果
 */
public QuestionCategory questionCategorySelectSingleObject() throws SQLException, DbException {
	return this.questionCategorySelectSingleObject("");
}

/**
 * <param name="questionCategoryQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<QuestionCategory> questionCategorySelectObjects(ConditionQuery questionCategoryQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = questionCategoryQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.questionCategorySelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="questionCategoryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<QuestionCategory> questionCategorySelectObjects(ConditionQuery questionCategoryQueryCondition) throws SQLException, DbException {
	String sql = questionCategoryQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.questionCategorySelectObjects(sql);
}

/**
 * <param name="questionCategoryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public QuestionCategory questionCategorySelectSingleObject(ConditionQuery questionCategoryQueryCondition) throws SQLException, DbException {
	List<QuestionCategory> list = this.questionCategorySelectObjects(questionCategoryQueryCondition);
	return common.util.ListUtil.getFirstItem(QuestionCategory.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends QuestionCategory> List<T> questionCategorySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().questionCategorySelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends QuestionCategory> List<T> questionCategorySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().questionCategorySelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends QuestionCategory> T questionCategorySelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.questionCategorySelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends QuestionCategory> List<T> questionCategorySelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.questionCategorySelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends QuestionCategory> List<T> questionCategorySelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.questionCategorySelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends QuestionCategory> T questionCategorySelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.questionCategorySelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="questionCategoryQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends QuestionCategory> List<T> questionCategorySelectObjects(Class<T> type, ConditionQuery questionCategoryQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = questionCategoryQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.questionCategorySelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="questionCategoryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends QuestionCategory> List<T> questionCategorySelectObjects(Class<T> type, ConditionQuery questionCategoryQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = questionCategoryQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.questionCategorySelectObjects(type, sql);
}

/**
 * <param name="questionCategoryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends QuestionCategory> T questionCategorySelectSingleObject(Class<T> type, ConditionQuery questionCategoryQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.questionCategorySelectObjects(type, questionCategoryQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int questionCategoryQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().questionCategoryQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="questionCategoryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int questionCategoryQuerySelectObjectsCount(ConditionQuery questionCategoryQueryCondition) throws SQLException, DbException {
	String sql = questionCategoryQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.questionCategoryQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象QuestionLib到数据库中
 * <param name="questionLib">需要插入的新对象</param>
 */
public void questionLibInsert(QuestionLib questionLib) throws SQLException, DbException {
	this.getDao().questionLibInsert(questionLib);
	String kvalue = "";
	kvalue = (kvalue + questionLib.getQuestionId());
	this.operatesLogSimpleAdd("T_QUESTION_LIB", "插入", "QUESTION_ID", kvalue, questionLib);
}

/**
 * 从数据库中删除一个对象QuestionLib
 * <param name="AQuestionId">题目标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void questionLibDeleteByQuestionId(int AQuestionId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_QUESTION_LIB].[QUESTION_ID] = ");
	sql = (sql + AQuestionId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().questionAnswerSelectObjects((" inner join T_QUESTION_LIB on [T_QUESTION_LIB].[QUESTION_ID] = [T_QUESTION_ANSWER" +
"].[QUESTION_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_QUESTION_LIB", "T_QUESTION_ANSWER"));
	}
	sql = "";
	sql = (sql + "[T_QUESTION_LIB].[QUESTION_ID] = ");
	sql = (sql + AQuestionId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().testPapersQuestionSelectObjects((" inner join T_QUESTION_LIB on [T_QUESTION_LIB].[QUESTION_ID] = [T_TEST_PAPERS_QUE" +
"STION].[QUESTION_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_QUESTION_LIB", "T_TEST_PAPERS_QUESTION"));
	}
	this.getDao().questionLibDeleteByQuestionId(AQuestionId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AQuestionId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_QUESTION_LIB", "删除", "QUESTION_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象QuestionLib
 * <param name="AQuestionId">题目标识</param>
 */
public void questionLibDeleteByQuestionId(int AQuestionId) throws SQLException, DbException {
	this.questionLibDeleteByQuestionId(AQuestionId, "");
}

/**
 * 从数据库中删除一批对象QuestionLib
 * <param name="ACategoryId">分类标识</param>
 */
public void questionLibDeleteListByCategoryId(int ACategoryId) throws SQLException, DbException {
	if ((this.getDao().questionAnswerSelectObjects((" inner join T_QUESTION_LIB on [T_QUESTION_LIB].[QUESTION_ID] = [T_QUESTION_ANSWER" +
"].[QUESTION_ID] where [T_QUESTION_LIB].[CATEGORY_ID] = " + ACategoryId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_QUESTION_LIB", "T_QUESTION_ANSWER"));
	}
	if ((this.getDao().testPapersQuestionSelectObjects((" inner join T_QUESTION_LIB on [T_QUESTION_LIB].[QUESTION_ID] = [T_TEST_PAPERS_QUE" +
"STION].[QUESTION_ID] where [T_QUESTION_LIB].[CATEGORY_ID] = " + ACategoryId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_QUESTION_LIB", "T_TEST_PAPERS_QUESTION"));
	}
	this.getDao().questionLibDeleteListByCategoryId(ACategoryId);
	String kvalue = "";
	kvalue = (kvalue + ACategoryId);
	this.operatesLogSimpleAdd("T_QUESTION_LIB", "删除", "CATEGORY_ID", kvalue, null);
}

/**
 * 更新一个对象QuestionLib到数据库中
 * <param name="questionLib">需要更新的QuestionLib</param>
 */
public int questionLibUpdate(QuestionLib questionLib) throws SQLException, DbException {
	return this.questionLibUpdate(questionLib, "");
}

/**
 * 更新一个对象QuestionLib到数据库中
 * <param name="questionLib">需要更新的QuestionLib</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int questionLibUpdate(QuestionLib questionLib, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().questionLibUpdate(questionLib, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + questionLib.getQuestionId());
	this.operatesLogSimpleAdd("T_QUESTION_LIB", "更新", "QUESTION_ID", kvalue, questionLib);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AQuestionId">题目标识</param>
 */
public QuestionLib questionLibSelectByQuestionId(int AQuestionId) throws SQLException, DbException {
	return this.getDao().questionLibSelectByQuestionId(AQuestionId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ACategoryId">分类标识</param>
 */
public List<QuestionLib> questionLibSelectObjectsByCategoryId(int ACategoryId) throws SQLException, DbException {
	return this.getDao().questionLibSelectObjectsByCategoryId(ACategoryId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<QuestionLib> questionLibSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().questionLibSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<QuestionLib> questionLibSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().questionLibSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<QuestionLib> questionLibSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().questionLibSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<QuestionLib> questionLibSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().questionLibSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public QuestionLib questionLibSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<QuestionLib> list = this.questionLibSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(QuestionLib.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<QuestionLib> questionLibSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.questionLibSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<QuestionLib> questionLibSelectObjects() throws SQLException, DbException {
	return this.questionLibSelectObjects("");
}

/**
 * @return 查询结果
 */
public QuestionLib questionLibSelectSingleObject() throws SQLException, DbException {
	return this.questionLibSelectSingleObject("");
}

/**
 * <param name="questionLibQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<QuestionLib> questionLibSelectObjects(ConditionQuery questionLibQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = questionLibQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.questionLibSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="questionLibQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<QuestionLib> questionLibSelectObjects(ConditionQuery questionLibQueryCondition) throws SQLException, DbException {
	String sql = questionLibQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.questionLibSelectObjects(sql);
}

/**
 * <param name="questionLibQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public QuestionLib questionLibSelectSingleObject(ConditionQuery questionLibQueryCondition) throws SQLException, DbException {
	List<QuestionLib> list = this.questionLibSelectObjects(questionLibQueryCondition);
	return common.util.ListUtil.getFirstItem(QuestionLib.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends QuestionLib> List<T> questionLibSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().questionLibSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends QuestionLib> List<T> questionLibSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().questionLibSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends QuestionLib> T questionLibSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.questionLibSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends QuestionLib> List<T> questionLibSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.questionLibSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends QuestionLib> List<T> questionLibSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.questionLibSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends QuestionLib> T questionLibSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.questionLibSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="questionLibQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends QuestionLib> List<T> questionLibSelectObjects(Class<T> type, ConditionQuery questionLibQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = questionLibQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.questionLibSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="questionLibQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends QuestionLib> List<T> questionLibSelectObjects(Class<T> type, ConditionQuery questionLibQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = questionLibQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.questionLibSelectObjects(type, sql);
}

/**
 * <param name="questionLibQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends QuestionLib> T questionLibSelectSingleObject(Class<T> type, ConditionQuery questionLibQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.questionLibSelectObjects(type, questionLibQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int questionLibQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().questionLibQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="questionLibQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int questionLibQuerySelectObjectsCount(ConditionQuery questionLibQueryCondition) throws SQLException, DbException {
	String sql = questionLibQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.questionLibQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象QuestionAnswer到数据库中
 * <param name="questionAnswer">需要插入的新对象</param>
 */
public void questionAnswerInsert(QuestionAnswer questionAnswer) throws SQLException, DbException {
	this.getDao().questionAnswerInsert(questionAnswer);
	String kvalue = "";
	kvalue = (kvalue + questionAnswer.getAnswerId());
	this.operatesLogSimpleAdd("T_QUESTION_ANSWER", "插入", "ANSWER_ID", kvalue, questionAnswer);
}

/**
 * 从数据库中删除一个对象QuestionAnswer
 * <param name="AAnswerId">答案标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void questionAnswerDeleteByAnswerId(int AAnswerId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_QUESTION_ANSWER].[ANSWER_ID] = ");
	sql = (sql + AAnswerId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().papersResultDetailSelectObjects((" inner join T_QUESTION_ANSWER on [T_QUESTION_ANSWER].[ANSWER_ID] = [T_PAPERS_RESU" +
"LT_DETAIL].[ANSWER_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_QUESTION_ANSWER", "T_PAPERS_RESULT_DETAIL"));
	}
	this.getDao().questionAnswerDeleteByAnswerId(AAnswerId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + AAnswerId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_QUESTION_ANSWER", "删除", "ANSWER_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象QuestionAnswer
 * <param name="AAnswerId">答案标识</param>
 */
public void questionAnswerDeleteByAnswerId(int AAnswerId) throws SQLException, DbException {
	this.questionAnswerDeleteByAnswerId(AAnswerId, "");
}

/**
 * 从数据库中删除一批对象QuestionAnswer
 * <param name="AQuestionId">题目标识</param>
 */
public void questionAnswerDeleteListByQuestionId(int AQuestionId) throws SQLException, DbException {
	if ((this.getDao().papersResultDetailSelectObjects((" inner join T_QUESTION_ANSWER on [T_QUESTION_ANSWER].[ANSWER_ID] = [T_PAPERS_RESU" +
"LT_DETAIL].[ANSWER_ID] where [T_QUESTION_ANSWER].[QUESTION_ID] = " + AQuestionId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_QUESTION_ANSWER", "T_PAPERS_RESULT_DETAIL"));
	}
	this.getDao().questionAnswerDeleteListByQuestionId(AQuestionId);
	String kvalue = "";
	kvalue = (kvalue + AQuestionId);
	this.operatesLogSimpleAdd("T_QUESTION_ANSWER", "删除", "QUESTION_ID", kvalue, null);
}

/**
 * 更新一个对象QuestionAnswer到数据库中
 * <param name="questionAnswer">需要更新的QuestionAnswer</param>
 */
public int questionAnswerUpdate(QuestionAnswer questionAnswer) throws SQLException, DbException {
	return this.questionAnswerUpdate(questionAnswer, "");
}

/**
 * 更新一个对象QuestionAnswer到数据库中
 * <param name="questionAnswer">需要更新的QuestionAnswer</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int questionAnswerUpdate(QuestionAnswer questionAnswer, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().questionAnswerUpdate(questionAnswer, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + questionAnswer.getAnswerId());
	this.operatesLogSimpleAdd("T_QUESTION_ANSWER", "更新", "ANSWER_ID", kvalue, questionAnswer);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AAnswerId">答案标识</param>
 */
public QuestionAnswer questionAnswerSelectByAnswerId(int AAnswerId) throws SQLException, DbException {
	return this.getDao().questionAnswerSelectByAnswerId(AAnswerId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AQuestionId">题目标识</param>
 */
public List<QuestionAnswer> questionAnswerSelectObjectsByQuestionId(int AQuestionId) throws SQLException, DbException {
	return this.getDao().questionAnswerSelectObjectsByQuestionId(AQuestionId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<QuestionAnswer> questionAnswerSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().questionAnswerSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<QuestionAnswer> questionAnswerSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().questionAnswerSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<QuestionAnswer> questionAnswerSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().questionAnswerSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<QuestionAnswer> questionAnswerSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().questionAnswerSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public QuestionAnswer questionAnswerSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<QuestionAnswer> list = this.questionAnswerSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(QuestionAnswer.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<QuestionAnswer> questionAnswerSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.questionAnswerSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<QuestionAnswer> questionAnswerSelectObjects() throws SQLException, DbException {
	return this.questionAnswerSelectObjects("");
}

/**
 * @return 查询结果
 */
public QuestionAnswer questionAnswerSelectSingleObject() throws SQLException, DbException {
	return this.questionAnswerSelectSingleObject("");
}

/**
 * <param name="questionAnswerQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<QuestionAnswer> questionAnswerSelectObjects(ConditionQuery questionAnswerQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = questionAnswerQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.questionAnswerSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="questionAnswerQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<QuestionAnswer> questionAnswerSelectObjects(ConditionQuery questionAnswerQueryCondition) throws SQLException, DbException {
	String sql = questionAnswerQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.questionAnswerSelectObjects(sql);
}

/**
 * <param name="questionAnswerQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public QuestionAnswer questionAnswerSelectSingleObject(ConditionQuery questionAnswerQueryCondition) throws SQLException, DbException {
	List<QuestionAnswer> list = this.questionAnswerSelectObjects(questionAnswerQueryCondition);
	return common.util.ListUtil.getFirstItem(QuestionAnswer.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends QuestionAnswer> List<T> questionAnswerSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().questionAnswerSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends QuestionAnswer> List<T> questionAnswerSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().questionAnswerSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends QuestionAnswer> T questionAnswerSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.questionAnswerSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends QuestionAnswer> List<T> questionAnswerSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.questionAnswerSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends QuestionAnswer> List<T> questionAnswerSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.questionAnswerSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends QuestionAnswer> T questionAnswerSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.questionAnswerSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="questionAnswerQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends QuestionAnswer> List<T> questionAnswerSelectObjects(Class<T> type, ConditionQuery questionAnswerQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = questionAnswerQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.questionAnswerSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="questionAnswerQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends QuestionAnswer> List<T> questionAnswerSelectObjects(Class<T> type, ConditionQuery questionAnswerQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = questionAnswerQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.questionAnswerSelectObjects(type, sql);
}

/**
 * <param name="questionAnswerQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends QuestionAnswer> T questionAnswerSelectSingleObject(Class<T> type, ConditionQuery questionAnswerQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.questionAnswerSelectObjects(type, questionAnswerQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int questionAnswerQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().questionAnswerQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="questionAnswerQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int questionAnswerQuerySelectObjectsCount(ConditionQuery questionAnswerQueryCondition) throws SQLException, DbException {
	String sql = questionAnswerQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.questionAnswerQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象TestPapers到数据库中
 * <param name="testPapers">需要插入的新对象</param>
 */
public void testPapersInsert(TestPapers testPapers) throws SQLException, DbException {
	this.getDao().testPapersInsert(testPapers);
	String kvalue = "";
	kvalue = (kvalue + testPapers.getPapersId());
	this.operatesLogSimpleAdd("T_TEST_PAPERS", "插入", "PAPERS_ID", kvalue, testPapers);
}

/**
 * 从数据库中删除一个对象TestPapers
 * <param name="APapersId">考卷标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void testPapersDeleteByPapersId(int APapersId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_TEST_PAPERS].[PAPERS_ID] = ");
	sql = (sql + APapersId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().testPapersQuestionSelectObjects((" inner join T_TEST_PAPERS on [T_TEST_PAPERS].[PAPERS_ID] = [T_TEST_PAPERS_QUESTIO" +
"N].[PAPERS_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TEST_PAPERS", "T_TEST_PAPERS_QUESTION"));
	}
	sql = "";
	sql = (sql + "[T_TEST_PAPERS].[PAPERS_ID] = ");
	sql = (sql + APapersId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().papersScoreSelectObjects((" inner join T_TEST_PAPERS on [T_TEST_PAPERS].[PAPERS_ID] = [T_PAPERS_SCORE].[PAPE" +
"RS_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TEST_PAPERS", "T_PAPERS_SCORE"));
	}
	this.getDao().testPapersDeleteByPapersId(APapersId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + APapersId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_TEST_PAPERS", "删除", "PAPERS_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象TestPapers
 * <param name="APapersId">考卷标识</param>
 */
public void testPapersDeleteByPapersId(int APapersId) throws SQLException, DbException {
	this.testPapersDeleteByPapersId(APapersId, "");
}

/**
 * 更新一个对象TestPapers到数据库中
 * <param name="testPapers">需要更新的TestPapers</param>
 */
public int testPapersUpdate(TestPapers testPapers) throws SQLException, DbException {
	return this.testPapersUpdate(testPapers, "");
}

/**
 * 更新一个对象TestPapers到数据库中
 * <param name="testPapers">需要更新的TestPapers</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int testPapersUpdate(TestPapers testPapers, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().testPapersUpdate(testPapers, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + testPapers.getPapersId());
	this.operatesLogSimpleAdd("T_TEST_PAPERS", "更新", "PAPERS_ID", kvalue, testPapers);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APapersId">考卷标识</param>
 */
public TestPapers testPapersSelectByPapersId(int APapersId) throws SQLException, DbException {
	return this.getDao().testPapersSelectByPapersId(APapersId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TestPapers> testPapersSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().testPapersSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<TestPapers> testPapersSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().testPapersSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TestPapers> testPapersSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().testPapersSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<TestPapers> testPapersSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().testPapersSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public TestPapers testPapersSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<TestPapers> list = this.testPapersSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(TestPapers.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TestPapers> testPapersSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.testPapersSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<TestPapers> testPapersSelectObjects() throws SQLException, DbException {
	return this.testPapersSelectObjects("");
}

/**
 * @return 查询结果
 */
public TestPapers testPapersSelectSingleObject() throws SQLException, DbException {
	return this.testPapersSelectSingleObject("");
}

/**
 * <param name="testPapersQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TestPapers> testPapersSelectObjects(ConditionQuery testPapersQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = testPapersQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testPapersSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="testPapersQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<TestPapers> testPapersSelectObjects(ConditionQuery testPapersQueryCondition) throws SQLException, DbException {
	String sql = testPapersQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testPapersSelectObjects(sql);
}

/**
 * <param name="testPapersQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public TestPapers testPapersSelectSingleObject(ConditionQuery testPapersQueryCondition) throws SQLException, DbException {
	List<TestPapers> list = this.testPapersSelectObjects(testPapersQueryCondition);
	return common.util.ListUtil.getFirstItem(TestPapers.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TestPapers> List<T> testPapersSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().testPapersSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends TestPapers> List<T> testPapersSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().testPapersSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends TestPapers> T testPapersSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.testPapersSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TestPapers> List<T> testPapersSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.testPapersSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends TestPapers> List<T> testPapersSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.testPapersSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends TestPapers> T testPapersSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.testPapersSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="testPapersQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TestPapers> List<T> testPapersSelectObjects(Class<T> type, ConditionQuery testPapersQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = testPapersQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testPapersSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="testPapersQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends TestPapers> List<T> testPapersSelectObjects(Class<T> type, ConditionQuery testPapersQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = testPapersQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testPapersSelectObjects(type, sql);
}

/**
 * <param name="testPapersQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends TestPapers> T testPapersSelectSingleObject(Class<T> type, ConditionQuery testPapersQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.testPapersSelectObjects(type, testPapersQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int testPapersQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().testPapersQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="testPapersQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int testPapersQuerySelectObjectsCount(ConditionQuery testPapersQueryCondition) throws SQLException, DbException {
	String sql = testPapersQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testPapersQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象TestPapersQuestion到数据库中
 * <param name="testPapersQuestion">需要插入的新对象</param>
 */
public void testPapersQuestionInsert(TestPapersQuestion testPapersQuestion) throws SQLException, DbException {
	this.getDao().testPapersQuestionInsert(testPapersQuestion);
	String kvalue = "";
	kvalue = (kvalue + testPapersQuestion.getPapersQuestionId());
	this.operatesLogSimpleAdd("T_TEST_PAPERS_QUESTION", "插入", "PAPERS_QUESTION_ID", kvalue, testPapersQuestion);
}

/**
 * 从数据库中删除一个对象TestPapersQuestion
 * <param name="APapersQuestionId"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void testPapersQuestionDeleteByPapersQuestionId(int APapersQuestionId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_TEST_PAPERS_QUESTION].[PAPERS_QUESTION_ID] = ");
	sql = (sql + APapersQuestionId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().papersResultSelectObjects((" inner join T_TEST_PAPERS_QUESTION on [T_TEST_PAPERS_QUESTION].[PAPERS_QUESTION_I" +
"D] = [T_PAPERS_RESULT].[PAPERS_QUESTION_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TEST_PAPERS_QUESTION", "T_PAPERS_RESULT"));
	}
	this.getDao().testPapersQuestionDeleteByPapersQuestionId(APapersQuestionId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + APapersQuestionId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_TEST_PAPERS_QUESTION", "删除", "PAPERS_QUESTION_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象TestPapersQuestion
 * <param name="APapersQuestionId"></param>
 */
public void testPapersQuestionDeleteByPapersQuestionId(int APapersQuestionId) throws SQLException, DbException {
	this.testPapersQuestionDeleteByPapersQuestionId(APapersQuestionId, "");
}

/**
 * 从数据库中删除一批对象TestPapersQuestion
 * <param name="AQuestionId">题目标识</param>
 */
public void testPapersQuestionDeleteListByQuestionId(int AQuestionId) throws SQLException, DbException {
	if ((this.getDao().papersResultSelectObjects((" inner join T_TEST_PAPERS_QUESTION on [T_TEST_PAPERS_QUESTION].[PAPERS_QUESTION_I" +
"D] = [T_PAPERS_RESULT].[PAPERS_QUESTION_ID] where [T_TEST_PAPERS_QUESTION].[QUES" +
"TION_ID] = " + AQuestionId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TEST_PAPERS_QUESTION", "T_PAPERS_RESULT"));
	}
	this.getDao().testPapersQuestionDeleteListByQuestionId(AQuestionId);
	String kvalue = "";
	kvalue = (kvalue + AQuestionId);
	this.operatesLogSimpleAdd("T_TEST_PAPERS_QUESTION", "删除", "QUESTION_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象TestPapersQuestion
 * <param name="APapersId">考卷标识</param>
 */
public void testPapersQuestionDeleteListByPapersId(int APapersId) throws SQLException, DbException {
	if ((this.getDao().papersResultSelectObjects((" inner join T_TEST_PAPERS_QUESTION on [T_TEST_PAPERS_QUESTION].[PAPERS_QUESTION_I" +
"D] = [T_PAPERS_RESULT].[PAPERS_QUESTION_ID] where [T_TEST_PAPERS_QUESTION].[PAPE" +
"RS_ID] = " + APapersId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_TEST_PAPERS_QUESTION", "T_PAPERS_RESULT"));
	}
	this.getDao().testPapersQuestionDeleteListByPapersId(APapersId);
	String kvalue = "";
	kvalue = (kvalue + APapersId);
	this.operatesLogSimpleAdd("T_TEST_PAPERS_QUESTION", "删除", "PAPERS_ID", kvalue, null);
}

/**
 * 更新一个对象TestPapersQuestion到数据库中
 * <param name="testPapersQuestion">需要更新的TestPapersQuestion</param>
 */
public int testPapersQuestionUpdate(TestPapersQuestion testPapersQuestion) throws SQLException, DbException {
	return this.testPapersQuestionUpdate(testPapersQuestion, "");
}

/**
 * 更新一个对象TestPapersQuestion到数据库中
 * <param name="testPapersQuestion">需要更新的TestPapersQuestion</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int testPapersQuestionUpdate(TestPapersQuestion testPapersQuestion, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().testPapersQuestionUpdate(testPapersQuestion, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + testPapersQuestion.getPapersQuestionId());
	this.operatesLogSimpleAdd("T_TEST_PAPERS_QUESTION", "更新", "PAPERS_QUESTION_ID", kvalue, testPapersQuestion);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APapersQuestionId"></param>
 */
public TestPapersQuestion testPapersQuestionSelectByPapersQuestionId(int APapersQuestionId) throws SQLException, DbException {
	return this.getDao().testPapersQuestionSelectByPapersQuestionId(APapersQuestionId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AQuestionId">题目标识</param>
 */
public List<TestPapersQuestion> testPapersQuestionSelectObjectsByQuestionId(int AQuestionId) throws SQLException, DbException {
	return this.getDao().testPapersQuestionSelectObjectsByQuestionId(AQuestionId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="APapersId">考卷标识</param>
 */
public List<TestPapersQuestion> testPapersQuestionSelectObjectsByPapersId(int APapersId) throws SQLException, DbException {
	return this.getDao().testPapersQuestionSelectObjectsByPapersId(APapersId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TestPapersQuestion> testPapersQuestionSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().testPapersQuestionSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<TestPapersQuestion> testPapersQuestionSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().testPapersQuestionSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TestPapersQuestion> testPapersQuestionSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().testPapersQuestionSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<TestPapersQuestion> testPapersQuestionSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().testPapersQuestionSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public TestPapersQuestion testPapersQuestionSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<TestPapersQuestion> list = this.testPapersQuestionSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(TestPapersQuestion.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TestPapersQuestion> testPapersQuestionSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.testPapersQuestionSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<TestPapersQuestion> testPapersQuestionSelectObjects() throws SQLException, DbException {
	return this.testPapersQuestionSelectObjects("");
}

/**
 * @return 查询结果
 */
public TestPapersQuestion testPapersQuestionSelectSingleObject() throws SQLException, DbException {
	return this.testPapersQuestionSelectSingleObject("");
}

/**
 * <param name="testPapersQuestionQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TestPapersQuestion> testPapersQuestionSelectObjects(ConditionQuery testPapersQuestionQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = testPapersQuestionQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testPapersQuestionSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="testPapersQuestionQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<TestPapersQuestion> testPapersQuestionSelectObjects(ConditionQuery testPapersQuestionQueryCondition) throws SQLException, DbException {
	String sql = testPapersQuestionQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testPapersQuestionSelectObjects(sql);
}

/**
 * <param name="testPapersQuestionQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public TestPapersQuestion testPapersQuestionSelectSingleObject(ConditionQuery testPapersQuestionQueryCondition) throws SQLException, DbException {
	List<TestPapersQuestion> list = this.testPapersQuestionSelectObjects(testPapersQuestionQueryCondition);
	return common.util.ListUtil.getFirstItem(TestPapersQuestion.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TestPapersQuestion> List<T> testPapersQuestionSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().testPapersQuestionSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends TestPapersQuestion> List<T> testPapersQuestionSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().testPapersQuestionSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends TestPapersQuestion> T testPapersQuestionSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.testPapersQuestionSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TestPapersQuestion> List<T> testPapersQuestionSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.testPapersQuestionSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends TestPapersQuestion> List<T> testPapersQuestionSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.testPapersQuestionSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends TestPapersQuestion> T testPapersQuestionSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.testPapersQuestionSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="testPapersQuestionQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TestPapersQuestion> List<T> testPapersQuestionSelectObjects(Class<T> type, ConditionQuery testPapersQuestionQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = testPapersQuestionQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testPapersQuestionSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="testPapersQuestionQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends TestPapersQuestion> List<T> testPapersQuestionSelectObjects(Class<T> type, ConditionQuery testPapersQuestionQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = testPapersQuestionQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testPapersQuestionSelectObjects(type, sql);
}

/**
 * <param name="testPapersQuestionQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends TestPapersQuestion> T testPapersQuestionSelectSingleObject(Class<T> type, ConditionQuery testPapersQuestionQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.testPapersQuestionSelectObjects(type, testPapersQuestionQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int testPapersQuestionQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().testPapersQuestionQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="testPapersQuestionQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int testPapersQuestionQuerySelectObjectsCount(ConditionQuery testPapersQuestionQueryCondition) throws SQLException, DbException {
	String sql = testPapersQuestionQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testPapersQuestionQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象PapersScore到数据库中
 * <param name="papersScore">需要插入的新对象</param>
 */
public void papersScoreInsert(PapersScore papersScore) throws SQLException, DbException {
	this.getDao().papersScoreInsert(papersScore);
	String kvalue = "";
	kvalue = (kvalue + papersScore.getPapersScoreId());
	this.operatesLogSimpleAdd("T_PAPERS_SCORE", "插入", "PAPERS_SCORE_ID", kvalue, papersScore);
}

/**
 * 从数据库中删除一个对象PapersScore
 * <param name="APapersScoreId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void papersScoreDeleteByPapersScoreId(int APapersScoreId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().papersScoreDeleteByPapersScoreId(APapersScoreId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + APapersScoreId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_PAPERS_SCORE", "删除", "PAPERS_SCORE_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象PapersScore
 * <param name="APapersScoreId">标识</param>
 */
public void papersScoreDeleteByPapersScoreId(int APapersScoreId) throws SQLException, DbException {
	this.papersScoreDeleteByPapersScoreId(APapersScoreId, "");
}

/**
 * 从数据库中删除一批对象PapersScore
 * <param name="APapersId">考卷标识</param>
 */
public void papersScoreDeleteListByPapersId(int APapersId) throws SQLException, DbException {
	this.getDao().papersScoreDeleteListByPapersId(APapersId);
	String kvalue = "";
	kvalue = (kvalue + APapersId);
	this.operatesLogSimpleAdd("T_PAPERS_SCORE", "删除", "PAPERS_ID", kvalue, null);
}

/**
 * 更新一个对象PapersScore到数据库中
 * <param name="papersScore">需要更新的PapersScore</param>
 */
public int papersScoreUpdate(PapersScore papersScore) throws SQLException, DbException {
	return this.papersScoreUpdate(papersScore, "");
}

/**
 * 更新一个对象PapersScore到数据库中
 * <param name="papersScore">需要更新的PapersScore</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int papersScoreUpdate(PapersScore papersScore, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().papersScoreUpdate(papersScore, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + papersScore.getPapersScoreId());
	this.operatesLogSimpleAdd("T_PAPERS_SCORE", "更新", "PAPERS_SCORE_ID", kvalue, papersScore);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APapersScoreId">标识</param>
 */
public PapersScore papersScoreSelectByPapersScoreId(int APapersScoreId) throws SQLException, DbException {
	return this.getDao().papersScoreSelectByPapersScoreId(APapersScoreId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="APapersId">考卷标识</param>
 */
public List<PapersScore> papersScoreSelectObjectsByPapersId(int APapersId) throws SQLException, DbException {
	return this.getDao().papersScoreSelectObjectsByPapersId(APapersId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<PapersScore> papersScoreSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().papersScoreSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<PapersScore> papersScoreSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().papersScoreSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<PapersScore> papersScoreSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().papersScoreSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<PapersScore> papersScoreSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().papersScoreSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public PapersScore papersScoreSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<PapersScore> list = this.papersScoreSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(PapersScore.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<PapersScore> papersScoreSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.papersScoreSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<PapersScore> papersScoreSelectObjects() throws SQLException, DbException {
	return this.papersScoreSelectObjects("");
}

/**
 * @return 查询结果
 */
public PapersScore papersScoreSelectSingleObject() throws SQLException, DbException {
	return this.papersScoreSelectSingleObject("");
}

/**
 * <param name="papersScoreQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<PapersScore> papersScoreSelectObjects(ConditionQuery papersScoreQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = papersScoreQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.papersScoreSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="papersScoreQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<PapersScore> papersScoreSelectObjects(ConditionQuery papersScoreQueryCondition) throws SQLException, DbException {
	String sql = papersScoreQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.papersScoreSelectObjects(sql);
}

/**
 * <param name="papersScoreQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public PapersScore papersScoreSelectSingleObject(ConditionQuery papersScoreQueryCondition) throws SQLException, DbException {
	List<PapersScore> list = this.papersScoreSelectObjects(papersScoreQueryCondition);
	return common.util.ListUtil.getFirstItem(PapersScore.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends PapersScore> List<T> papersScoreSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().papersScoreSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends PapersScore> List<T> papersScoreSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().papersScoreSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends PapersScore> T papersScoreSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.papersScoreSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends PapersScore> List<T> papersScoreSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.papersScoreSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends PapersScore> List<T> papersScoreSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.papersScoreSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends PapersScore> T papersScoreSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.papersScoreSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="papersScoreQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends PapersScore> List<T> papersScoreSelectObjects(Class<T> type, ConditionQuery papersScoreQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = papersScoreQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.papersScoreSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="papersScoreQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends PapersScore> List<T> papersScoreSelectObjects(Class<T> type, ConditionQuery papersScoreQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = papersScoreQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.papersScoreSelectObjects(type, sql);
}

/**
 * <param name="papersScoreQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends PapersScore> T papersScoreSelectSingleObject(Class<T> type, ConditionQuery papersScoreQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.papersScoreSelectObjects(type, papersScoreQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int papersScoreQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().papersScoreQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="papersScoreQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int papersScoreQuerySelectObjectsCount(ConditionQuery papersScoreQueryCondition) throws SQLException, DbException {
	String sql = papersScoreQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.papersScoreQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象PapersResultDetail到数据库中
 * <param name="papersResultDetail">需要插入的新对象</param>
 */
public void papersResultDetailInsert(PapersResultDetail papersResultDetail) throws SQLException, DbException {
	this.getDao().papersResultDetailInsert(papersResultDetail);
	String kvalue = "";
	kvalue = (kvalue + papersResultDetail.getPapersResultDetailId());
	this.operatesLogSimpleAdd("T_PAPERS_RESULT_DETAIL", "插入", "PAPERS_RESULT_DETAIL_ID", kvalue, papersResultDetail);
}

/**
 * 从数据库中删除一个对象PapersResultDetail
 * <param name="APapersResultDetailId">回答明细标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void papersResultDetailDeleteByPapersResultDetailId(int APapersResultDetailId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().papersResultDetailDeleteByPapersResultDetailId(APapersResultDetailId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + APapersResultDetailId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_PAPERS_RESULT_DETAIL", "删除", "PAPERS_RESULT_DETAIL_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象PapersResultDetail
 * <param name="APapersResultDetailId">回答明细标识</param>
 */
public void papersResultDetailDeleteByPapersResultDetailId(int APapersResultDetailId) throws SQLException, DbException {
	this.papersResultDetailDeleteByPapersResultDetailId(APapersResultDetailId, "");
}

/**
 * 从数据库中删除一批对象PapersResultDetail
 * <param name="APapersResultId">回答标识</param>
 */
public void papersResultDetailDeleteListByPapersResultId(int APapersResultId) throws SQLException, DbException {
	this.getDao().papersResultDetailDeleteListByPapersResultId(APapersResultId);
	String kvalue = "";
	kvalue = (kvalue + APapersResultId);
	this.operatesLogSimpleAdd("T_PAPERS_RESULT_DETAIL", "删除", "PAPERS_RESULT_ID", kvalue, null);
}

/**
 * 从数据库中删除一批对象PapersResultDetail
 * <param name="AAnswerId">答案标识</param>
 */
public void papersResultDetailDeleteListByAnswerId(int AAnswerId) throws SQLException, DbException {
	this.getDao().papersResultDetailDeleteListByAnswerId(AAnswerId);
	String kvalue = "";
	kvalue = (kvalue + AAnswerId);
	this.operatesLogSimpleAdd("T_PAPERS_RESULT_DETAIL", "删除", "ANSWER_ID", kvalue, null);
}

/**
 * 更新一个对象PapersResultDetail到数据库中
 * <param name="papersResultDetail">需要更新的PapersResultDetail</param>
 */
public int papersResultDetailUpdate(PapersResultDetail papersResultDetail) throws SQLException, DbException {
	return this.papersResultDetailUpdate(papersResultDetail, "");
}

/**
 * 更新一个对象PapersResultDetail到数据库中
 * <param name="papersResultDetail">需要更新的PapersResultDetail</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int papersResultDetailUpdate(PapersResultDetail papersResultDetail, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().papersResultDetailUpdate(papersResultDetail, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + papersResultDetail.getPapersResultDetailId());
	this.operatesLogSimpleAdd("T_PAPERS_RESULT_DETAIL", "更新", "PAPERS_RESULT_DETAIL_ID", kvalue, papersResultDetail);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APapersResultDetailId">回答明细标识</param>
 */
public PapersResultDetail papersResultDetailSelectByPapersResultDetailId(int APapersResultDetailId) throws SQLException, DbException {
	return this.getDao().papersResultDetailSelectByPapersResultDetailId(APapersResultDetailId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="APapersResultId">回答标识</param>
 */
public List<PapersResultDetail> papersResultDetailSelectObjectsByPapersResultId(int APapersResultId) throws SQLException, DbException {
	return this.getDao().papersResultDetailSelectObjectsByPapersResultId(APapersResultId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AAnswerId">答案标识</param>
 */
public List<PapersResultDetail> papersResultDetailSelectObjectsByAnswerId(int AAnswerId) throws SQLException, DbException {
	return this.getDao().papersResultDetailSelectObjectsByAnswerId(AAnswerId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<PapersResultDetail> papersResultDetailSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().papersResultDetailSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<PapersResultDetail> papersResultDetailSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().papersResultDetailSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<PapersResultDetail> papersResultDetailSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().papersResultDetailSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<PapersResultDetail> papersResultDetailSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().papersResultDetailSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public PapersResultDetail papersResultDetailSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<PapersResultDetail> list = this.papersResultDetailSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(PapersResultDetail.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<PapersResultDetail> papersResultDetailSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.papersResultDetailSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<PapersResultDetail> papersResultDetailSelectObjects() throws SQLException, DbException {
	return this.papersResultDetailSelectObjects("");
}

/**
 * @return 查询结果
 */
public PapersResultDetail papersResultDetailSelectSingleObject() throws SQLException, DbException {
	return this.papersResultDetailSelectSingleObject("");
}

/**
 * <param name="papersResultDetailQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<PapersResultDetail> papersResultDetailSelectObjects(ConditionQuery papersResultDetailQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = papersResultDetailQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.papersResultDetailSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="papersResultDetailQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<PapersResultDetail> papersResultDetailSelectObjects(ConditionQuery papersResultDetailQueryCondition) throws SQLException, DbException {
	String sql = papersResultDetailQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.papersResultDetailSelectObjects(sql);
}

/**
 * <param name="papersResultDetailQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public PapersResultDetail papersResultDetailSelectSingleObject(ConditionQuery papersResultDetailQueryCondition) throws SQLException, DbException {
	List<PapersResultDetail> list = this.papersResultDetailSelectObjects(papersResultDetailQueryCondition);
	return common.util.ListUtil.getFirstItem(PapersResultDetail.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends PapersResultDetail> List<T> papersResultDetailSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().papersResultDetailSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends PapersResultDetail> List<T> papersResultDetailSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().papersResultDetailSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends PapersResultDetail> T papersResultDetailSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.papersResultDetailSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends PapersResultDetail> List<T> papersResultDetailSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.papersResultDetailSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends PapersResultDetail> List<T> papersResultDetailSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.papersResultDetailSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends PapersResultDetail> T papersResultDetailSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.papersResultDetailSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="papersResultDetailQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends PapersResultDetail> List<T> papersResultDetailSelectObjects(Class<T> type, ConditionQuery papersResultDetailQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = papersResultDetailQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.papersResultDetailSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="papersResultDetailQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends PapersResultDetail> List<T> papersResultDetailSelectObjects(Class<T> type, ConditionQuery papersResultDetailQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = papersResultDetailQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.papersResultDetailSelectObjects(type, sql);
}

/**
 * <param name="papersResultDetailQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends PapersResultDetail> T papersResultDetailSelectSingleObject(Class<T> type, ConditionQuery papersResultDetailQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.papersResultDetailSelectObjects(type, papersResultDetailQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int papersResultDetailQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().papersResultDetailQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="papersResultDetailQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int papersResultDetailQuerySelectObjectsCount(ConditionQuery papersResultDetailQueryCondition) throws SQLException, DbException {
	String sql = papersResultDetailQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.papersResultDetailQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象TestPapersQuestionRange到数据库中
 * <param name="testPapersQuestionRange">需要插入的新对象</param>
 */
public void testPapersQuestionRangeInsert(TestPapersQuestionRange testPapersQuestionRange) throws SQLException, DbException {
	this.getDao().testPapersQuestionRangeInsert(testPapersQuestionRange);
	String kvalue = "";
	kvalue = (kvalue + testPapersQuestionRange.getPapersId());
	kvalue = (kvalue + ",");
	kvalue = (kvalue + testPapersQuestionRange.getCategoryId());
	this.operatesLogSimpleAdd("T_TEST_PAPERS_QUESTION_RANGE", "插入", "PAPERS_ID,CATEGORY_ID", kvalue, testPapersQuestionRange);
}

/**
 * 从数据库中删除一个对象TestPapersQuestionRange
 * <param name="APapersId">考卷标识</param>
 * <param name="ACategoryId">试卷分类标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void testPapersQuestionRangeDeleteByPapersIdCategoryId(int APapersId, int ACategoryId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	this.getDao().testPapersQuestionRangeDeleteByPapersIdCategoryId(APapersId, ACategoryId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + APapersId);
	kvalue = (kvalue + ",");
	kvalue = (kvalue + ACategoryId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_TEST_PAPERS_QUESTION_RANGE", "删除", "PAPERS_ID,CATEGORY_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象TestPapersQuestionRange
 * <param name="APapersId">考卷标识</param>
 * <param name="ACategoryId">试卷分类标识</param>
 */
public void testPapersQuestionRangeDeleteByPapersIdCategoryId(int APapersId, int ACategoryId) throws SQLException, DbException {
	this.testPapersQuestionRangeDeleteByPapersIdCategoryId(APapersId, ACategoryId, "");
}

/**
 * 从数据库中删除一批对象TestPapersQuestionRange
 * <param name="ACategoryId">试卷分类标识</param>
 */
public void testPapersQuestionRangeDeleteListByCategoryId(int ACategoryId) throws SQLException, DbException {
	this.getDao().testPapersQuestionRangeDeleteListByCategoryId(ACategoryId);
	String kvalue = "";
	kvalue = (kvalue + ACategoryId);
	this.operatesLogSimpleAdd("T_TEST_PAPERS_QUESTION_RANGE", "删除", "CATEGORY_ID", kvalue, null);
}

/**
 * 更新一个对象TestPapersQuestionRange到数据库中
 * <param name="testPapersQuestionRange">需要更新的TestPapersQuestionRange</param>
 */
public int testPapersQuestionRangeUpdate(TestPapersQuestionRange testPapersQuestionRange) throws SQLException, DbException {
	return this.testPapersQuestionRangeUpdate(testPapersQuestionRange, "");
}

/**
 * 更新一个对象TestPapersQuestionRange到数据库中
 * <param name="testPapersQuestionRange">需要更新的TestPapersQuestionRange</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int testPapersQuestionRangeUpdate(TestPapersQuestionRange testPapersQuestionRange, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().testPapersQuestionRangeUpdate(testPapersQuestionRange, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + testPapersQuestionRange.getPapersId());
	kvalue = (kvalue + ",");
	kvalue = (kvalue + testPapersQuestionRange.getCategoryId());
	this.operatesLogSimpleAdd("T_TEST_PAPERS_QUESTION_RANGE", "更新", "PAPERS_ID,CATEGORY_ID", kvalue, testPapersQuestionRange);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APapersId">考卷标识</param>
 * <param name="ACategoryId">试卷分类标识</param>
 */
public TestPapersQuestionRange testPapersQuestionRangeSelectByPapersIdCategoryId(int APapersId, int ACategoryId) throws SQLException, DbException {
	return this.getDao().testPapersQuestionRangeSelectByPapersIdCategoryId(APapersId, ACategoryId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ACategoryId">试卷分类标识</param>
 */
public List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjectsByCategoryId(int ACategoryId) throws SQLException, DbException {
	return this.getDao().testPapersQuestionRangeSelectObjectsByCategoryId(ACategoryId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().testPapersQuestionRangeSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().testPapersQuestionRangeSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().testPapersQuestionRangeSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().testPapersQuestionRangeSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public TestPapersQuestionRange testPapersQuestionRangeSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<TestPapersQuestionRange> list = this.testPapersQuestionRangeSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(TestPapersQuestionRange.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.testPapersQuestionRangeSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjects() throws SQLException, DbException {
	return this.testPapersQuestionRangeSelectObjects("");
}

/**
 * @return 查询结果
 */
public TestPapersQuestionRange testPapersQuestionRangeSelectSingleObject() throws SQLException, DbException {
	return this.testPapersQuestionRangeSelectSingleObject("");
}

/**
 * <param name="testPapersQuestionRangeQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjects(ConditionQuery testPapersQuestionRangeQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = testPapersQuestionRangeQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testPapersQuestionRangeSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="testPapersQuestionRangeQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjects(ConditionQuery testPapersQuestionRangeQueryCondition) throws SQLException, DbException {
	String sql = testPapersQuestionRangeQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testPapersQuestionRangeSelectObjects(sql);
}

/**
 * <param name="testPapersQuestionRangeQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public TestPapersQuestionRange testPapersQuestionRangeSelectSingleObject(ConditionQuery testPapersQuestionRangeQueryCondition) throws SQLException, DbException {
	List<TestPapersQuestionRange> list = this.testPapersQuestionRangeSelectObjects(testPapersQuestionRangeQueryCondition);
	return common.util.ListUtil.getFirstItem(TestPapersQuestionRange.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TestPapersQuestionRange> List<T> testPapersQuestionRangeSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().testPapersQuestionRangeSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends TestPapersQuestionRange> List<T> testPapersQuestionRangeSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().testPapersQuestionRangeSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends TestPapersQuestionRange> T testPapersQuestionRangeSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.testPapersQuestionRangeSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TestPapersQuestionRange> List<T> testPapersQuestionRangeSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.testPapersQuestionRangeSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends TestPapersQuestionRange> List<T> testPapersQuestionRangeSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.testPapersQuestionRangeSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends TestPapersQuestionRange> T testPapersQuestionRangeSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.testPapersQuestionRangeSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="testPapersQuestionRangeQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends TestPapersQuestionRange> List<T> testPapersQuestionRangeSelectObjects(Class<T> type, ConditionQuery testPapersQuestionRangeQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = testPapersQuestionRangeQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testPapersQuestionRangeSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="testPapersQuestionRangeQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends TestPapersQuestionRange> List<T> testPapersQuestionRangeSelectObjects(Class<T> type, ConditionQuery testPapersQuestionRangeQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = testPapersQuestionRangeQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testPapersQuestionRangeSelectObjects(type, sql);
}

/**
 * <param name="testPapersQuestionRangeQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends TestPapersQuestionRange> T testPapersQuestionRangeSelectSingleObject(Class<T> type, ConditionQuery testPapersQuestionRangeQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.testPapersQuestionRangeSelectObjects(type, testPapersQuestionRangeQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int testPapersQuestionRangeQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().testPapersQuestionRangeQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="testPapersQuestionRangeQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int testPapersQuestionRangeQuerySelectObjectsCount(ConditionQuery testPapersQuestionRangeQueryCondition) throws SQLException, DbException {
	String sql = testPapersQuestionRangeQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.testPapersQuestionRangeQuerySelectObjectsCount(sql);
}

/**
 * 插入一个对象PapersResult到数据库中
 * <param name="papersResult">需要插入的新对象</param>
 */
public void papersResultInsert(PapersResult papersResult) throws SQLException, DbException {
	this.getDao().papersResultInsert(papersResult);
	String kvalue = "";
	kvalue = (kvalue + papersResult.getPapersResultId());
	this.operatesLogSimpleAdd("T_PAPERS_RESULT", "插入", "PAPERS_RESULT_ID", kvalue, papersResult);
}

/**
 * 从数据库中删除一个对象PapersResult
 * <param name="APapersResultId">回答标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void papersResultDeleteByPapersResultId(int APapersResultId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_PAPERS_RESULT].[PAPERS_RESULT_ID] = ");
	sql = (sql + APapersResultId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().papersResultDetailSelectObjects((" inner join T_PAPERS_RESULT on [T_PAPERS_RESULT].[PAPERS_RESULT_ID] = [T_PAPERS_R" +
"ESULT_DETAIL].[PAPERS_RESULT_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_PAPERS_RESULT", "T_PAPERS_RESULT_DETAIL"));
	}
	this.getDao().papersResultDeleteByPapersResultId(APapersResultId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + APapersResultId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_PAPERS_RESULT", "删除", "PAPERS_RESULT_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象PapersResult
 * <param name="APapersResultId">回答标识</param>
 */
public void papersResultDeleteByPapersResultId(int APapersResultId) throws SQLException, DbException {
	this.papersResultDeleteByPapersResultId(APapersResultId, "");
}

/**
 * 从数据库中删除一个对象PapersResult
 * <param name="ATesterName">testername</param>
 * <param name="APapersQuestionId">考题标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
public void papersResultDeleteByTesterNamePapersQuestionId(String ATesterName, int APapersQuestionId, String appendConditionSql) throws SQLException, DbException {
	String sql;
	sql = "";
	sql = (sql + "[T_PAPERS_RESULT].[TESTER_NAME] = ");
	sql = (sql + SqlServerUtils.safeSql(ATesterName.toString()));
	sql = (sql + " and ");
	sql = (sql + "[T_PAPERS_RESULT].[PAPERS_QUESTION_ID] = ");
	sql = (sql + APapersQuestionId);
	sql = (sql + appendConditionSql);
	if ((this.getDao().papersResultDetailSelectObjects((" inner join T_PAPERS_RESULT on [T_PAPERS_RESULT].[PAPERS_RESULT_ID] = [T_PAPERS_R" +
"ESULT_DETAIL].[PAPERS_RESULT_ID] where " + sql)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_PAPERS_RESULT", "T_PAPERS_RESULT_DETAIL"));
	}
	this.getDao().papersResultDeleteByTesterNamePapersQuestionId(ATesterName, APapersQuestionId, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + ATesterName);
	kvalue = (kvalue + ",");
	kvalue = (kvalue + APapersQuestionId);
	kvalue = (kvalue + appendConditionSql);
	this.operatesLogSimpleAdd("T_PAPERS_RESULT", "删除", "TESTER_NAME,PAPERS_QUESTION_ID", kvalue, null);
}

/**
 * 从数据库中删除一个对象PapersResult
 * <param name="ATesterName">testername</param>
 * <param name="APapersQuestionId">考题标识</param>
 */
public void papersResultDeleteByTesterNamePapersQuestionId(String ATesterName, int APapersQuestionId) throws SQLException, DbException {
	this.papersResultDeleteByTesterNamePapersQuestionId(ATesterName, APapersQuestionId, "");
}

/**
 * 从数据库中删除一批对象PapersResult
 * <param name="APapersQuestionId">考题标识</param>
 */
public void papersResultDeleteListByPapersQuestionId(int APapersQuestionId) throws SQLException, DbException {
	if ((this.getDao().papersResultDetailSelectObjects((" inner join T_PAPERS_RESULT on [T_PAPERS_RESULT].[PAPERS_RESULT_ID] = [T_PAPERS_R" +
"ESULT_DETAIL].[PAPERS_RESULT_ID] where [T_PAPERS_RESULT].[PAPERS_QUESTION_ID] = " +
"" + APapersQuestionId)).size() > 0)) {
		throw new DbException(this.GetDeleteCheckForKeyErrorInfo("T_PAPERS_RESULT", "T_PAPERS_RESULT_DETAIL"));
	}
	this.getDao().papersResultDeleteListByPapersQuestionId(APapersQuestionId);
	String kvalue = "";
	kvalue = (kvalue + APapersQuestionId);
	this.operatesLogSimpleAdd("T_PAPERS_RESULT", "删除", "PAPERS_QUESTION_ID", kvalue, null);
}

/**
 * 更新一个对象PapersResult到数据库中
 * <param name="papersResult">需要更新的PapersResult</param>
 */
public int papersResultUpdate(PapersResult papersResult) throws SQLException, DbException {
	return this.papersResultUpdate(papersResult, "");
}

/**
 * 更新一个对象PapersResult到数据库中
 * <param name="papersResult">需要更新的PapersResult</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
public int papersResultUpdate(PapersResult papersResult, String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().papersResultUpdate(papersResult, appendConditionSql);
	String kvalue = "";
	kvalue = (kvalue + papersResult.getPapersResultId());
	this.operatesLogSimpleAdd("T_PAPERS_RESULT", "更新", "PAPERS_RESULT_ID", kvalue, papersResult);
	return ret;
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APapersResultId">回答标识</param>
 */
public PapersResult papersResultSelectByPapersResultId(int APapersResultId) throws SQLException, DbException {
	return this.getDao().papersResultSelectByPapersResultId(APapersResultId);
}

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATesterName">testername</param>
 * <param name="APapersQuestionId">考题标识</param>
 */
public PapersResult papersResultSelectByTesterNamePapersQuestionId(String ATesterName, int APapersQuestionId) throws SQLException, DbException {
	return this.getDao().papersResultSelectByTesterNamePapersQuestionId(ATesterName, APapersQuestionId);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="APapersQuestionId">考题标识</param>
 */
public List<PapersResult> papersResultSelectObjectsByPapersQuestionId(int APapersQuestionId) throws SQLException, DbException {
	return this.getDao().papersResultSelectObjectsByPapersQuestionId(APapersQuestionId);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<PapersResult> papersResultSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().papersResultSelectObjectsWithCustomSql(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
public List<PapersResult> papersResultSelectObjectsWithCustomSql(String sql) throws SQLException, DbException {
	return this.getDao().papersResultSelectObjectsWithCustomSql(sql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<PapersResult> papersResultSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.getDao().papersResultSelectObjects(appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public List<PapersResult> papersResultSelectObjects(String appendConditionSql) throws SQLException, DbException {
	return this.getDao().papersResultSelectObjects(appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public PapersResult papersResultSelectSingleObject(String appendConditionSql) throws SQLException, DbException {
	List<PapersResult> list = this.papersResultSelectObjects(appendConditionSql);
	return common.util.ListUtil.getFirstItem(PapersResult.class, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<PapersResult> papersResultSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	return this.papersResultSelectObjects("", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public List<PapersResult> papersResultSelectObjects() throws SQLException, DbException {
	return this.papersResultSelectObjects("");
}

/**
 * @return 查询结果
 */
public PapersResult papersResultSelectSingleObject() throws SQLException, DbException {
	return this.papersResultSelectSingleObject("");
}

/**
 * <param name="papersResultQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public List<PapersResult> papersResultSelectObjects(ConditionQuery papersResultQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = papersResultQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.papersResultSelectObjects(sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="papersResultQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public List<PapersResult> papersResultSelectObjects(ConditionQuery papersResultQueryCondition) throws SQLException, DbException {
	String sql = papersResultQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.papersResultSelectObjects(sql);
}

/**
 * <param name="papersResultQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public PapersResult papersResultSelectSingleObject(ConditionQuery papersResultQueryCondition) throws SQLException, DbException {
	List<PapersResult> list = this.papersResultSelectObjects(papersResultQueryCondition);
	return common.util.ListUtil.getFirstItem(PapersResult.class, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends PapersResult> List<T> papersResultSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().papersResultSelectObjects(type, appendConditionSql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends PapersResult> List<T> papersResultSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.getDao().papersResultSelectObjects(type, appendConditionSql);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public <T extends PapersResult> T papersResultSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.papersResultSelectObjects(type, appendConditionSql);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends PapersResult> List<T> papersResultSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.papersResultSelectObjects(type, "", pageIndex, rowsOfPage, orderField, order);
}

/**
 * @return 查询结果
 */
public <T extends PapersResult> List<T> papersResultSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	return this.papersResultSelectObjects(type, "");
}

/**
 * @return 查询结果
 */
public <T extends PapersResult> T papersResultSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.papersResultSelectObjects(type);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="papersResultQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
public <T extends PapersResult> List<T> papersResultSelectObjects(Class<T> type, ConditionQuery papersResultQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = papersResultQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.papersResultSelectObjects(type, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * <param name="papersResultQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends PapersResult> List<T> papersResultSelectObjects(Class<T> type, ConditionQuery papersResultQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	String sql = papersResultQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.papersResultSelectObjects(type, sql);
}

/**
 * <param name="papersResultQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public <T extends PapersResult> T papersResultSelectSingleObject(Class<T> type, ConditionQuery papersResultQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	List<T> list = this.papersResultSelectObjects(type, papersResultQueryCondition);
	return common.util.ListUtil.getFirstItem(type, list);
}

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public int papersResultQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException {
	int ret = this.getDao().papersResultQuerySelectObjectsCount(appendConditionSql);
	return ret;
}

/**
 * <param name="papersResultQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
public int papersResultQuerySelectObjectsCount(ConditionQuery papersResultQueryCondition) throws SQLException, DbException {
	String sql = papersResultQueryCondition.getConditionSql();
	if (StringUtils.isNullOrEmpty(sql)) {
	}
	else {
		sql = (" where " + sql);
	}
	return this.papersResultQuerySelectObjectsCount(sql);
}

/**
 * 简单的日志接口,调用Dao
 * <param name="tableName">表名称</param>
 * <param name="operateName">操作名称</param>
 * <param name="keyFieldName">主键字段名</param>
 * <param name="keyFieldValue">主键字段值</param>
 * <param name="param">附加参数</param>
 */
public void operatesLogSimpleAdd(String tableName, String operateName, String keyFieldName, String keyFieldValue, Object param) throws SQLException, DbException {
	this.getDao().operatesLogSimpleAdd(tableName, operateName, keyFieldName, keyFieldValue, param);
}

/**
 * 获得格式化的错误提示信息
 * <param name="primaryTable">被删除的表对象</param>
 * <param name="forkeyTable">被引用的表对象</param>
 */
public String GetDeleteCheckForKeyErrorInfo(String APrimaryTable, String AForkeyTable) throws SQLException, DbException {
	return ("无法删除表" 
				+ (APrimaryTable 
				+ (",因为表被外键表" 
				+ (AForkeyTable + "引用"))));
}
}
