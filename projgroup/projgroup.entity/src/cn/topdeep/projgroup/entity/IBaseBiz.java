package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
/**
 * 基本的商业应用层接口
 */
public interface IBaseBiz {
	
	/**
	 * 插入一个对象到数据库中
	 * <param name="baseEntity">需要插入的新对象</param>
	 */
	void insert(BaseEntity baseEntity) throws SQLException, DbException;
	
	/**
	 * 更新一个对象到数据库中
	 * <param name="baseEntity">需要更新的对象</param>
	 */
	int update(BaseEntity baseEntity) throws SQLException, DbException;
	
	/**
	 * 更新一个对象到数据库中
	 * <param name="baseEntity">需要更新的对象</param>
	 * <param name="appendConditionSql">附加的Sql条件</param>
	 */
	int update(BaseEntity baseEntity, String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VPrevMonthWorkScore> vPrevMonthWorkScoreSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	List<VPrevMonthWorkScore> vPrevMonthWorkScoreSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VPrevMonthWorkScore> vPrevMonthWorkScoreSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	List<VPrevMonthWorkScore> vPrevMonthWorkScoreSelectObjects(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	VPrevMonthWorkScore vPrevMonthWorkScoreSelectSingleObject(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VPrevMonthWorkScore> vPrevMonthWorkScoreSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	List<VPrevMonthWorkScore> vPrevMonthWorkScoreSelectObjects() throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	VPrevMonthWorkScore vPrevMonthWorkScoreSelectSingleObject() throws SQLException, DbException;
	
	/**
	 * <param name="vPrevMonthWorkScoreQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VPrevMonthWorkScore> vPrevMonthWorkScoreSelectObjects(ConditionQuery vPrevMonthWorkScoreQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="vPrevMonthWorkScoreQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<VPrevMonthWorkScore> vPrevMonthWorkScoreSelectObjects(ConditionQuery vPrevMonthWorkScoreQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="vPrevMonthWorkScoreQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	VPrevMonthWorkScore vPrevMonthWorkScoreSelectSingleObject(ConditionQuery vPrevMonthWorkScoreQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	int vPrevMonthWorkScoreQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="vPrevMonthWorkScoreQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int vPrevMonthWorkScoreQuerySelectObjectsCount(ConditionQuery vPrevMonthWorkScoreQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VProjectTaskUser> vProjectTaskUserSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	List<VProjectTaskUser> vProjectTaskUserSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VProjectTaskUser> vProjectTaskUserSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	List<VProjectTaskUser> vProjectTaskUserSelectObjects(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	VProjectTaskUser vProjectTaskUserSelectSingleObject(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VProjectTaskUser> vProjectTaskUserSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	List<VProjectTaskUser> vProjectTaskUserSelectObjects() throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	VProjectTaskUser vProjectTaskUserSelectSingleObject() throws SQLException, DbException;
	
	/**
	 * <param name="vProjectTaskUserQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VProjectTaskUser> vProjectTaskUserSelectObjects(ConditionQuery vProjectTaskUserQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="vProjectTaskUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<VProjectTaskUser> vProjectTaskUserSelectObjects(ConditionQuery vProjectTaskUserQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="vProjectTaskUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	VProjectTaskUser vProjectTaskUserSelectSingleObject(ConditionQuery vProjectTaskUserQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	int vProjectTaskUserQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="vProjectTaskUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int vProjectTaskUserQuerySelectObjectsCount(ConditionQuery vProjectTaskUserQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VProjectUser> vProjectUserSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	List<VProjectUser> vProjectUserSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VProjectUser> vProjectUserSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	List<VProjectUser> vProjectUserSelectObjects(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	VProjectUser vProjectUserSelectSingleObject(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VProjectUser> vProjectUserSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	List<VProjectUser> vProjectUserSelectObjects() throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	VProjectUser vProjectUserSelectSingleObject() throws SQLException, DbException;
	
	/**
	 * <param name="vProjectUserQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VProjectUser> vProjectUserSelectObjects(ConditionQuery vProjectUserQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="vProjectUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<VProjectUser> vProjectUserSelectObjects(ConditionQuery vProjectUserQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="vProjectUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	VProjectUser vProjectUserSelectSingleObject(ConditionQuery vProjectUserQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	int vProjectUserQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="vProjectUserQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int vProjectUserQuerySelectObjectsCount(ConditionQuery vProjectUserQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VTaskPreviousTask> vTaskPreviousTaskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	List<VTaskPreviousTask> vTaskPreviousTaskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VTaskPreviousTask> vTaskPreviousTaskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	List<VTaskPreviousTask> vTaskPreviousTaskSelectObjects(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	VTaskPreviousTask vTaskPreviousTaskSelectSingleObject(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VTaskPreviousTask> vTaskPreviousTaskSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	List<VTaskPreviousTask> vTaskPreviousTaskSelectObjects() throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	VTaskPreviousTask vTaskPreviousTaskSelectSingleObject() throws SQLException, DbException;
	
	/**
	 * <param name="vTaskPreviousTaskQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VTaskPreviousTask> vTaskPreviousTaskSelectObjects(ConditionQuery vTaskPreviousTaskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="vTaskPreviousTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<VTaskPreviousTask> vTaskPreviousTaskSelectObjects(ConditionQuery vTaskPreviousTaskQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="vTaskPreviousTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	VTaskPreviousTask vTaskPreviousTaskSelectSingleObject(ConditionQuery vTaskPreviousTaskQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	int vTaskPreviousTaskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="vTaskPreviousTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int vTaskPreviousTaskQuerySelectObjectsCount(ConditionQuery vTaskPreviousTaskQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VUserTask> vUserTaskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	List<VUserTask> vUserTaskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VUserTask> vUserTaskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	List<VUserTask> vUserTaskSelectObjects(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	VUserTask vUserTaskSelectSingleObject(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VUserTask> vUserTaskSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	List<VUserTask> vUserTaskSelectObjects() throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	VUserTask vUserTaskSelectSingleObject() throws SQLException, DbException;
	
	/**
	 * <param name="vUserTaskQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VUserTask> vUserTaskSelectObjects(ConditionQuery vUserTaskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="vUserTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<VUserTask> vUserTaskSelectObjects(ConditionQuery vUserTaskQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="vUserTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	VUserTask vUserTaskSelectSingleObject(ConditionQuery vUserTaskQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	int vUserTaskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="vUserTaskQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int vUserTaskQuerySelectObjectsCount(ConditionQuery vUserTaskQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VPapersScore> vPapersScoreSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	List<VPapersScore> vPapersScoreSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VPapersScore> vPapersScoreSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	List<VPapersScore> vPapersScoreSelectObjects(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	VPapersScore vPapersScoreSelectSingleObject(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VPapersScore> vPapersScoreSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	List<VPapersScore> vPapersScoreSelectObjects() throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	VPapersScore vPapersScoreSelectSingleObject() throws SQLException, DbException;
	
	/**
	 * <param name="vPapersScoreQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VPapersScore> vPapersScoreSelectObjects(ConditionQuery vPapersScoreQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="vPapersScoreQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<VPapersScore> vPapersScoreSelectObjects(ConditionQuery vPapersScoreQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="vPapersScoreQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	VPapersScore vPapersScoreSelectSingleObject(ConditionQuery vPapersScoreQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	int vPapersScoreQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="vPapersScoreQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int vPapersScoreQuerySelectObjectsCount(ConditionQuery vPapersScoreQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VQuestionLib> vQuestionLibSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	List<VQuestionLib> vQuestionLibSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VQuestionLib> vQuestionLibSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	List<VQuestionLib> vQuestionLibSelectObjects(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	VQuestionLib vQuestionLibSelectSingleObject(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VQuestionLib> vQuestionLibSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	List<VQuestionLib> vQuestionLibSelectObjects() throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	VQuestionLib vQuestionLibSelectSingleObject() throws SQLException, DbException;
	
	/**
	 * <param name="vQuestionLibQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VQuestionLib> vQuestionLibSelectObjects(ConditionQuery vQuestionLibQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="vQuestionLibQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<VQuestionLib> vQuestionLibSelectObjects(ConditionQuery vQuestionLibQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="vQuestionLibQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	VQuestionLib vQuestionLibSelectSingleObject(ConditionQuery vQuestionLibQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	int vQuestionLibQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="vQuestionLibQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int vQuestionLibQuerySelectObjectsCount(ConditionQuery vQuestionLibQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VQuestionlibAnswer> vQuestionlibAnswerSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	List<VQuestionlibAnswer> vQuestionlibAnswerSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VQuestionlibAnswer> vQuestionlibAnswerSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	List<VQuestionlibAnswer> vQuestionlibAnswerSelectObjects(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	VQuestionlibAnswer vQuestionlibAnswerSelectSingleObject(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VQuestionlibAnswer> vQuestionlibAnswerSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	List<VQuestionlibAnswer> vQuestionlibAnswerSelectObjects() throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	VQuestionlibAnswer vQuestionlibAnswerSelectSingleObject() throws SQLException, DbException;
	
	/**
	 * <param name="vQuestionlibAnswerQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VQuestionlibAnswer> vQuestionlibAnswerSelectObjects(ConditionQuery vQuestionlibAnswerQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="vQuestionlibAnswerQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<VQuestionlibAnswer> vQuestionlibAnswerSelectObjects(ConditionQuery vQuestionlibAnswerQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="vQuestionlibAnswerQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	VQuestionlibAnswer vQuestionlibAnswerSelectSingleObject(ConditionQuery vQuestionlibAnswerQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	int vQuestionlibAnswerQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="vQuestionlibAnswerQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int vQuestionlibAnswerQuerySelectObjectsCount(ConditionQuery vQuestionlibAnswerQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VTestPapersQuestion> vTestPapersQuestionSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	List<VTestPapersQuestion> vTestPapersQuestionSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VTestPapersQuestion> vTestPapersQuestionSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	List<VTestPapersQuestion> vTestPapersQuestionSelectObjects(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	VTestPapersQuestion vTestPapersQuestionSelectSingleObject(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VTestPapersQuestion> vTestPapersQuestionSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	List<VTestPapersQuestion> vTestPapersQuestionSelectObjects() throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	VTestPapersQuestion vTestPapersQuestionSelectSingleObject() throws SQLException, DbException;
	
	/**
	 * <param name="vTestPapersQuestionQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VTestPapersQuestion> vTestPapersQuestionSelectObjects(ConditionQuery vTestPapersQuestionQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="vTestPapersQuestionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<VTestPapersQuestion> vTestPapersQuestionSelectObjects(ConditionQuery vTestPapersQuestionQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="vTestPapersQuestionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	VTestPapersQuestion vTestPapersQuestionSelectSingleObject(ConditionQuery vTestPapersQuestionQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	int vTestPapersQuestionQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="vTestPapersQuestionQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int vTestPapersQuestionQuerySelectObjectsCount(ConditionQuery vTestPapersQuestionQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VTestPapersResult> vTestPapersResultSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	List<VTestPapersResult> vTestPapersResultSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VTestPapersResult> vTestPapersResultSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	List<VTestPapersResult> vTestPapersResultSelectObjects(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	VTestPapersResult vTestPapersResultSelectSingleObject(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VTestPapersResult> vTestPapersResultSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	List<VTestPapersResult> vTestPapersResultSelectObjects() throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	VTestPapersResult vTestPapersResultSelectSingleObject() throws SQLException, DbException;
	
	/**
	 * <param name="vTestPapersResultQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<VTestPapersResult> vTestPapersResultSelectObjects(ConditionQuery vTestPapersResultQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="vTestPapersResultQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<VTestPapersResult> vTestPapersResultSelectObjects(ConditionQuery vTestPapersResultQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="vTestPapersResultQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	VTestPapersResult vTestPapersResultSelectSingleObject(ConditionQuery vTestPapersResultQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	int vTestPapersResultQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="vTestPapersResultQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	int vTestPapersResultQuerySelectObjectsCount(ConditionQuery vTestPapersResultQueryCondition) throws SQLException, DbException;
	
	String pGetIdentity(String tabName, int style, int len, String ret) throws SQLException, DbException;
	
	String pGetIdentity(PGetIdentityParam pGetIdentityParam) throws SQLException, DbException;
	
	void proctest(int p1, String p2) throws SQLException, DbException;
	
	void proctest(ProctestParam proctestParam) throws SQLException, DbException;
	
	/**
	 * 插入一个对象Jbpm4Swimlane到数据库中
	 * <param name="jbpm4Swimlane">需要插入的新对象</param>
	 */
	void jbpm4SwimlaneInsert(Jbpm4Swimlane jbpm4Swimlane) throws SQLException, DbException;
	
	/**
	 * 从数据库中删除一个对象Jbpm4Swimlane
	 * <param name="ADbid"></param>
	 * <param name="appendConditionSql">附加的条件语句</param>
	 */
	void jbpm4SwimlaneDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * 从数据库中删除一个对象Jbpm4Swimlane
	 * <param name="ADbid"></param>
	 */
	void jbpm4SwimlaneDeleteByDbid(double ADbid) throws SQLException, DbException;
	
	/**
	 * 从数据库中删除一批对象Jbpm4Swimlane
	 * <param name="AExecution"></param>
	 */
	void jbpm4SwimlaneDeleteListByExecution(Double AExecution) throws SQLException, DbException;
	
	/**
	 * 更新一个对象Jbpm4Swimlane到数据库中
	 * <param name="jbpm4Swimlane">需要更新的Jbpm4Swimlane</param>
	 */
	int jbpm4SwimlaneUpdate(Jbpm4Swimlane jbpm4Swimlane) throws SQLException, DbException;
	
	/**
	 * 更新一个对象Jbpm4Swimlane到数据库中
	 * <param name="jbpm4Swimlane">需要更新的Jbpm4Swimlane</param>
	 * <param name="appendConditionSql">附加的Sql条件</param>
	 */
	int jbpm4SwimlaneUpdate(Jbpm4Swimlane jbpm4Swimlane, String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * 根据对象的唯一索引从数据库中查询一个对象
	 * <param name="ADbid"></param>
	 */
	Jbpm4Swimlane jbpm4SwimlaneSelectByDbid(double ADbid) throws SQLException, DbException;
	
	/**
	 * 从数据库中根据外键值选取一批对象
	 * <param name="AExecution"></param>
	 */
	List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjectsByExecution(Double AExecution) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">自定义查询Sql语句</param>
	 * @return 查询结果
	 */
	List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjects(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	Jbpm4Swimlane jbpm4SwimlaneSelectSingleObject(String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjects() throws SQLException, DbException;
	
	/**
	 * @return 查询结果
	 */
	Jbpm4Swimlane jbpm4SwimlaneSelectSingleObject() throws SQLException, DbException;
	
	/**
	 * <param name="jbpm4SwimlaneQueryCondition">附加查询条件</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjects(ConditionQuery jbpm4SwimlaneQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;
	
	/**
	 * <param name="jbpm4SwimlaneQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	List<Jbpm4Swimlane> jbpm4SwimlaneSelectObjects(ConditionQuery jbpm4SwimlaneQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="jbpm4SwimlaneQueryCondition">附加查询条件</param>
	 * @return 查询结果
	 */
	Jbpm4Swimlane jbpm4SwimlaneSelectSingleObject(ConditionQuery jbpm4SwimlaneQueryCondition) throws SQLException, DbException;
	
	/**
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	<T extends Jbpm4Swimlane> List<T> jbpm4SwimlaneSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4Swimlane> List<T> jbpm4SwimlaneSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4Swimlane> T jbpm4SwimlaneSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Swimlane> List<T> jbpm4SwimlaneSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4Swimlane> List<T> jbpm4SwimlaneSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4Swimlane> T jbpm4SwimlaneSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4SwimlaneQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Swimlane> List<T> jbpm4SwimlaneSelectObjects(Class<T> type, ConditionQuery jbpm4SwimlaneQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4SwimlaneQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4Swimlane> List<T> jbpm4SwimlaneSelectObjects(Class<T> type, ConditionQuery jbpm4SwimlaneQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4SwimlaneQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4Swimlane> T jbpm4SwimlaneSelectSingleObject(Class<T> type, ConditionQuery jbpm4SwimlaneQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int jbpm4SwimlaneQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="jbpm4SwimlaneQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int jbpm4SwimlaneQuerySelectObjectsCount(ConditionQuery jbpm4SwimlaneQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Jbpm4Task到数据库中
 * <param name="jbpm4Task">需要插入的新对象</param>
 */
void jbpm4TaskInsert(Jbpm4Task jbpm4Task) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4Task
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void jbpm4TaskDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4Task
 * <param name="ADbid"></param>
 */
void jbpm4TaskDeleteByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4Task
 * <param name="ASwimlane"></param>
 */
void jbpm4TaskDeleteListBySwimlane(Double ASwimlane) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4Task
 * <param name="ASupertask"></param>
 */
void jbpm4TaskDeleteListBySupertask(Double ASupertask) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4Task到数据库中
 * <param name="jbpm4Task">需要更新的Jbpm4Task</param>
 */
int jbpm4TaskUpdate(Jbpm4Task jbpm4Task) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4Task到数据库中
 * <param name="jbpm4Task">需要更新的Jbpm4Task</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int jbpm4TaskUpdate(Jbpm4Task jbpm4Task, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
Jbpm4Task jbpm4TaskSelectByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ASwimlane"></param>
 */
List<Jbpm4Task> jbpm4TaskSelectObjectsBySwimlane(Double ASwimlane) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ASupertask"></param>
 */
List<Jbpm4Task> jbpm4TaskSelectObjectsBySupertask(Double ASupertask) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Task> jbpm4TaskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Jbpm4Task> jbpm4TaskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Task> jbpm4TaskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Jbpm4Task> jbpm4TaskSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Jbpm4Task jbpm4TaskSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Task> jbpm4TaskSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Jbpm4Task> jbpm4TaskSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Jbpm4Task jbpm4TaskSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="jbpm4TaskQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Task> jbpm4TaskSelectObjects(ConditionQuery jbpm4TaskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="jbpm4TaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Jbpm4Task> jbpm4TaskSelectObjects(ConditionQuery jbpm4TaskQueryCondition) throws SQLException, DbException;

/**
 * <param name="jbpm4TaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Jbpm4Task jbpm4TaskSelectSingleObject(ConditionQuery jbpm4TaskQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Task> List<T> jbpm4TaskSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4Task> List<T> jbpm4TaskSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4Task> T jbpm4TaskSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Task> List<T> jbpm4TaskSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4Task> List<T> jbpm4TaskSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4Task> T jbpm4TaskSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4TaskQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Task> List<T> jbpm4TaskSelectObjects(Class<T> type, ConditionQuery jbpm4TaskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4TaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4Task> List<T> jbpm4TaskSelectObjects(Class<T> type, ConditionQuery jbpm4TaskQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4TaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4Task> T jbpm4TaskSelectSingleObject(Class<T> type, ConditionQuery jbpm4TaskQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int jbpm4TaskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="jbpm4TaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int jbpm4TaskQuerySelectObjectsCount(ConditionQuery jbpm4TaskQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Jbpm4Variable到数据库中
 * <param name="jbpm4Variable">需要插入的新对象</param>
 */
void jbpm4VariableInsert(Jbpm4Variable jbpm4Variable) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4Variable
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void jbpm4VariableDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4Variable
 * <param name="ADbid"></param>
 */
void jbpm4VariableDeleteByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4Variable
 * <param name="AExesys"></param>
 */
void jbpm4VariableDeleteListByExesys(Double AExesys) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4Variable
 * <param name="AExecution"></param>
 */
void jbpm4VariableDeleteListByExecution(Double AExecution) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4Variable
 * <param name="ALob"></param>
 */
void jbpm4VariableDeleteListByLob(Double ALob) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4Variable
 * <param name="ATask"></param>
 */
void jbpm4VariableDeleteListByTask(Double ATask) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4Variable到数据库中
 * <param name="jbpm4Variable">需要更新的Jbpm4Variable</param>
 */
int jbpm4VariableUpdate(Jbpm4Variable jbpm4Variable) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4Variable到数据库中
 * <param name="jbpm4Variable">需要更新的Jbpm4Variable</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int jbpm4VariableUpdate(Jbpm4Variable jbpm4Variable, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
Jbpm4Variable jbpm4VariableSelectByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AExesys"></param>
 */
List<Jbpm4Variable> jbpm4VariableSelectObjectsByExesys(Double AExesys) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AExecution"></param>
 */
List<Jbpm4Variable> jbpm4VariableSelectObjectsByExecution(Double AExecution) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ALob"></param>
 */
List<Jbpm4Variable> jbpm4VariableSelectObjectsByLob(Double ALob) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATask"></param>
 */
List<Jbpm4Variable> jbpm4VariableSelectObjectsByTask(Double ATask) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Variable> jbpm4VariableSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Jbpm4Variable> jbpm4VariableSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Variable> jbpm4VariableSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Jbpm4Variable> jbpm4VariableSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Jbpm4Variable jbpm4VariableSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Variable> jbpm4VariableSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Jbpm4Variable> jbpm4VariableSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Jbpm4Variable jbpm4VariableSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="jbpm4VariableQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Variable> jbpm4VariableSelectObjects(ConditionQuery jbpm4VariableQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="jbpm4VariableQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Jbpm4Variable> jbpm4VariableSelectObjects(ConditionQuery jbpm4VariableQueryCondition) throws SQLException, DbException;

/**
 * <param name="jbpm4VariableQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Jbpm4Variable jbpm4VariableSelectSingleObject(ConditionQuery jbpm4VariableQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Variable> List<T> jbpm4VariableSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4Variable> List<T> jbpm4VariableSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4Variable> T jbpm4VariableSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Variable> List<T> jbpm4VariableSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4Variable> List<T> jbpm4VariableSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4Variable> T jbpm4VariableSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4VariableQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Variable> List<T> jbpm4VariableSelectObjects(Class<T> type, ConditionQuery jbpm4VariableQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4VariableQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4Variable> List<T> jbpm4VariableSelectObjects(Class<T> type, ConditionQuery jbpm4VariableQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4VariableQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4Variable> T jbpm4VariableSelectSingleObject(Class<T> type, ConditionQuery jbpm4VariableQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int jbpm4VariableQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="jbpm4VariableQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int jbpm4VariableQuerySelectObjectsCount(ConditionQuery jbpm4VariableQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Project到数据库中
 * <param name="project">需要插入的新对象</param>
 */
void projectInsert(Project project) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Project
 * <param name="AProjId">工程号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void projectDeleteByProjId(int AProjId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Project
 * <param name="AProjId">工程号</param>
 */
void projectDeleteByProjId(int AProjId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Project
 * <param name="AProjectManagerId">工程管理员号</param>
 */
void projectDeleteListByProjectManagerId(Integer AProjectManagerId) throws SQLException, DbException;

/**
 * 更新一个对象Project到数据库中
 * <param name="project">需要更新的Project</param>
 */
int projectUpdate(Project project) throws SQLException, DbException;

/**
 * 更新一个对象Project到数据库中
 * <param name="project">需要更新的Project</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int projectUpdate(Project project, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AProjId">工程号</param>
 */
Project projectSelectByProjId(int AProjId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AProjectManagerId">工程管理员号</param>
 */
List<Project> projectSelectObjectsByProjectManagerId(Integer AProjectManagerId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Project> projectSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Project> projectSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Project> projectSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Project> projectSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Project projectSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Project> projectSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Project> projectSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Project projectSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="projectQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Project> projectSelectObjects(ConditionQuery projectQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="projectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Project> projectSelectObjects(ConditionQuery projectQueryCondition) throws SQLException, DbException;

/**
 * <param name="projectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Project projectSelectSingleObject(ConditionQuery projectQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Project> List<T> projectSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Project> List<T> projectSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Project> T projectSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Project> List<T> projectSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Project> List<T> projectSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Project> T projectSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="projectQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Project> List<T> projectSelectObjects(Class<T> type, ConditionQuery projectQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="projectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Project> List<T> projectSelectObjects(Class<T> type, ConditionQuery projectQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="projectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Project> T projectSelectSingleObject(Class<T> type, ConditionQuery projectQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int projectQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="projectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int projectQuerySelectObjectsCount(ConditionQuery projectQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象ProjectJoinUser到数据库中
 * <param name="projectJoinUser">需要插入的新对象</param>
 */
void projectJoinUserInsert(ProjectJoinUser projectJoinUser) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象ProjectJoinUser
 * <param name="AProjectId">工程代号</param>
 * <param name="AUserId">用户代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void projectJoinUserDeleteByProjectIdUserId(int AProjectId, int AUserId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象ProjectJoinUser
 * <param name="AProjectId">工程代号</param>
 * <param name="AUserId">用户代号</param>
 */
void projectJoinUserDeleteByProjectIdUserId(int AProjectId, int AUserId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象ProjectJoinUser
 * <param name="AProjectId">工程代号</param>
 */
void projectJoinUserDeleteListByProjectId(int AProjectId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象ProjectJoinUser
 * <param name="AUserId">用户代号</param>
 */
void projectJoinUserDeleteListByUserId(int AUserId) throws SQLException, DbException;

/**
 * 更新一个对象ProjectJoinUser到数据库中
 * <param name="projectJoinUser">需要更新的ProjectJoinUser</param>
 */
int projectJoinUserUpdate(ProjectJoinUser projectJoinUser) throws SQLException, DbException;

/**
 * 更新一个对象ProjectJoinUser到数据库中
 * <param name="projectJoinUser">需要更新的ProjectJoinUser</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int projectJoinUserUpdate(ProjectJoinUser projectJoinUser, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AProjectId">工程代号</param>
 * <param name="AUserId">用户代号</param>
 */
ProjectJoinUser projectJoinUserSelectByProjectIdUserId(int AProjectId, int AUserId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AProjectId">工程代号</param>
 */
List<ProjectJoinUser> projectJoinUserSelectObjectsByProjectId(int AProjectId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AUserId">用户代号</param>
 */
List<ProjectJoinUser> projectJoinUserSelectObjectsByUserId(int AUserId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<ProjectJoinUser> projectJoinUserSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<ProjectJoinUser> projectJoinUserSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<ProjectJoinUser> projectJoinUserSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<ProjectJoinUser> projectJoinUserSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
ProjectJoinUser projectJoinUserSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<ProjectJoinUser> projectJoinUserSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<ProjectJoinUser> projectJoinUserSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
ProjectJoinUser projectJoinUserSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="projectJoinUserQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<ProjectJoinUser> projectJoinUserSelectObjects(ConditionQuery projectJoinUserQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="projectJoinUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<ProjectJoinUser> projectJoinUserSelectObjects(ConditionQuery projectJoinUserQueryCondition) throws SQLException, DbException;

/**
 * <param name="projectJoinUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
ProjectJoinUser projectJoinUserSelectSingleObject(ConditionQuery projectJoinUserQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends ProjectJoinUser> List<T> projectJoinUserSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends ProjectJoinUser> List<T> projectJoinUserSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends ProjectJoinUser> T projectJoinUserSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends ProjectJoinUser> List<T> projectJoinUserSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends ProjectJoinUser> List<T> projectJoinUserSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends ProjectJoinUser> T projectJoinUserSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="projectJoinUserQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends ProjectJoinUser> List<T> projectJoinUserSelectObjects(Class<T> type, ConditionQuery projectJoinUserQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="projectJoinUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends ProjectJoinUser> List<T> projectJoinUserSelectObjects(Class<T> type, ConditionQuery projectJoinUserQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="projectJoinUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends ProjectJoinUser> T projectJoinUserSelectSingleObject(Class<T> type, ConditionQuery projectJoinUserQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int projectJoinUserQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="projectJoinUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int projectJoinUserQuerySelectObjectsCount(ConditionQuery projectJoinUserQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Role到数据库中
 * <param name="role">需要插入的新对象</param>
 */
void roleInsert(Role role) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Role
 * <param name="ARoleId">角色代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void roleDeleteByRoleId(int ARoleId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Role
 * <param name="ARoleId">角色代号</param>
 */
void roleDeleteByRoleId(int ARoleId) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Role
 * <param name="ARoleName">角色名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void roleDeleteByRoleName(String ARoleName, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Role
 * <param name="ARoleName">角色名称</param>
 */
void roleDeleteByRoleName(String ARoleName) throws SQLException, DbException;

/**
 * 更新一个对象Role到数据库中
 * <param name="role">需要更新的Role</param>
 */
int roleUpdate(Role role) throws SQLException, DbException;

/**
 * 更新一个对象Role到数据库中
 * <param name="role">需要更新的Role</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int roleUpdate(Role role, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ARoleId">角色代号</param>
 */
Role roleSelectByRoleId(int ARoleId) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ARoleName">角色名称</param>
 */
Role roleSelectByRoleName(String ARoleName) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Role> roleSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Role> roleSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Role> roleSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Role> roleSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Role roleSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Role> roleSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Role> roleSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Role roleSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="roleQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Role> roleSelectObjects(ConditionQuery roleQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="roleQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Role> roleSelectObjects(ConditionQuery roleQueryCondition) throws SQLException, DbException;

/**
 * <param name="roleQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Role roleSelectSingleObject(ConditionQuery roleQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Role> List<T> roleSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Role> List<T> roleSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Role> T roleSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Role> List<T> roleSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Role> List<T> roleSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Role> T roleSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="roleQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Role> List<T> roleSelectObjects(Class<T> type, ConditionQuery roleQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="roleQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Role> List<T> roleSelectObjects(Class<T> type, ConditionQuery roleQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="roleQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Role> T roleSelectSingleObject(Class<T> type, ConditionQuery roleQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int roleQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="roleQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int roleQuerySelectObjectsCount(ConditionQuery roleQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象TaskPreviousTask到数据库中
 * <param name="taskPreviousTask">需要插入的新对象</param>
 */
void taskPreviousTaskInsert(TaskPreviousTask taskPreviousTask) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象TaskPreviousTask
 * <param name="ATaskId">任务代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void taskPreviousTaskDeleteByTaskId(int ATaskId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象TaskPreviousTask
 * <param name="ATaskId">任务代号</param>
 */
void taskPreviousTaskDeleteByTaskId(int ATaskId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象TaskPreviousTask
 * <param name="APreviousTaskId">前驱任务代号</param>
 */
void taskPreviousTaskDeleteListByPreviousTaskId(int APreviousTaskId) throws SQLException, DbException;

/**
 * 更新一个对象TaskPreviousTask到数据库中
 * <param name="taskPreviousTask">需要更新的TaskPreviousTask</param>
 */
int taskPreviousTaskUpdate(TaskPreviousTask taskPreviousTask) throws SQLException, DbException;

/**
 * 更新一个对象TaskPreviousTask到数据库中
 * <param name="taskPreviousTask">需要更新的TaskPreviousTask</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int taskPreviousTaskUpdate(TaskPreviousTask taskPreviousTask, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATaskId">任务代号</param>
 */
TaskPreviousTask taskPreviousTaskSelectByTaskId(int ATaskId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskId">任务代号</param>
 */
List<TaskPreviousTask> taskPreviousTaskSelectObjectsByTaskId(int ATaskId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="APreviousTaskId">前驱任务代号</param>
 */
List<TaskPreviousTask> taskPreviousTaskSelectObjectsByPreviousTaskId(int APreviousTaskId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TaskPreviousTask> taskPreviousTaskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<TaskPreviousTask> taskPreviousTaskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TaskPreviousTask> taskPreviousTaskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<TaskPreviousTask> taskPreviousTaskSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
TaskPreviousTask taskPreviousTaskSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TaskPreviousTask> taskPreviousTaskSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<TaskPreviousTask> taskPreviousTaskSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
TaskPreviousTask taskPreviousTaskSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="taskPreviousTaskQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TaskPreviousTask> taskPreviousTaskSelectObjects(ConditionQuery taskPreviousTaskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="taskPreviousTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<TaskPreviousTask> taskPreviousTaskSelectObjects(ConditionQuery taskPreviousTaskQueryCondition) throws SQLException, DbException;

/**
 * <param name="taskPreviousTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
TaskPreviousTask taskPreviousTaskSelectSingleObject(ConditionQuery taskPreviousTaskQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TaskPreviousTask> List<T> taskPreviousTaskSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends TaskPreviousTask> List<T> taskPreviousTaskSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends TaskPreviousTask> T taskPreviousTaskSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TaskPreviousTask> List<T> taskPreviousTaskSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends TaskPreviousTask> List<T> taskPreviousTaskSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends TaskPreviousTask> T taskPreviousTaskSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="taskPreviousTaskQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TaskPreviousTask> List<T> taskPreviousTaskSelectObjects(Class<T> type, ConditionQuery taskPreviousTaskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="taskPreviousTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends TaskPreviousTask> List<T> taskPreviousTaskSelectObjects(Class<T> type, ConditionQuery taskPreviousTaskQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="taskPreviousTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends TaskPreviousTask> T taskPreviousTaskSelectSingleObject(Class<T> type, ConditionQuery taskPreviousTaskQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int taskPreviousTaskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="taskPreviousTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int taskPreviousTaskQuerySelectObjectsCount(ConditionQuery taskPreviousTaskQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象User到数据库中
 * <param name="user">需要插入的新对象</param>
 */
void userInsert(User user) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象User
 * <param name="AUserId">用户代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void userDeleteByUserId(int AUserId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象User
 * <param name="AUserId">用户代号</param>
 */
void userDeleteByUserId(int AUserId) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象User
 * <param name="ALoginName">登陆名</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void userDeleteByLoginName(String ALoginName, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象User
 * <param name="ALoginName">登陆名</param>
 */
void userDeleteByLoginName(String ALoginName) throws SQLException, DbException;

/**
 * 更新一个对象User到数据库中
 * <param name="user">需要更新的User</param>
 */
int userUpdate(User user) throws SQLException, DbException;

/**
 * 更新一个对象User到数据库中
 * <param name="user">需要更新的User</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int userUpdate(User user, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AUserId">用户代号</param>
 */
User userSelectByUserId(int AUserId) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ALoginName">登陆名</param>
 */
User userSelectByLoginName(String ALoginName) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<User> userSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<User> userSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<User> userSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<User> userSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
User userSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<User> userSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<User> userSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
User userSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="userQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<User> userSelectObjects(ConditionQuery userQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="userQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<User> userSelectObjects(ConditionQuery userQueryCondition) throws SQLException, DbException;

/**
 * <param name="userQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
User userSelectSingleObject(ConditionQuery userQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends User> List<T> userSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends User> List<T> userSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends User> T userSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends User> List<T> userSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends User> List<T> userSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends User> T userSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="userQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends User> List<T> userSelectObjects(Class<T> type, ConditionQuery userQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="userQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends User> List<T> userSelectObjects(Class<T> type, ConditionQuery userQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="userQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends User> T userSelectSingleObject(Class<T> type, ConditionQuery userQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int userQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="userQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int userQuerySelectObjectsCount(ConditionQuery userQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Identity到数据库中
 * <param name="identity">需要插入的新对象</param>
 */
void identityInsert(Identity identity) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Identity
 * <param name="ATabName"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void identityDeleteByTabName(String ATabName, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Identity
 * <param name="ATabName"></param>
 */
void identityDeleteByTabName(String ATabName) throws SQLException, DbException;

/**
 * 更新一个对象Identity到数据库中
 * <param name="identity">需要更新的Identity</param>
 */
int identityUpdate(Identity identity) throws SQLException, DbException;

/**
 * 更新一个对象Identity到数据库中
 * <param name="identity">需要更新的Identity</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int identityUpdate(Identity identity, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATabName"></param>
 */
Identity identitySelectByTabName(String ATabName) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Identity> identitySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Identity> identitySelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Identity> identitySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Identity> identitySelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Identity identitySelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Identity> identitySelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Identity> identitySelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Identity identitySelectSingleObject() throws SQLException, DbException;

/**
 * <param name="identityQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Identity> identitySelectObjects(ConditionQuery identityQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="identityQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Identity> identitySelectObjects(ConditionQuery identityQueryCondition) throws SQLException, DbException;

/**
 * <param name="identityQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Identity identitySelectSingleObject(ConditionQuery identityQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Identity> List<T> identitySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Identity> List<T> identitySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Identity> T identitySelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Identity> List<T> identitySelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Identity> List<T> identitySelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Identity> T identitySelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="identityQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Identity> List<T> identitySelectObjects(Class<T> type, ConditionQuery identityQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="identityQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Identity> List<T> identitySelectObjects(Class<T> type, ConditionQuery identityQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="identityQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Identity> T identitySelectSingleObject(Class<T> type, ConditionQuery identityQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int identityQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="identityQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int identityQuerySelectObjectsCount(ConditionQuery identityQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象WorkLog到数据库中
 * <param name="workLog">需要插入的新对象</param>
 */
void workLogInsert(WorkLog workLog) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象WorkLog
 * <param name="AWorkLogId">工作日志代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void workLogDeleteByWorkLogId(int AWorkLogId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象WorkLog
 * <param name="AWorkLogId">工作日志代号</param>
 */
void workLogDeleteByWorkLogId(int AWorkLogId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象WorkLog
 * <param name="AWorkUserId">职工号</param>
 */
void workLogDeleteListByWorkUserId(int AWorkUserId) throws SQLException, DbException;

/**
 * 更新一个对象WorkLog到数据库中
 * <param name="workLog">需要更新的WorkLog</param>
 */
int workLogUpdate(WorkLog workLog) throws SQLException, DbException;

/**
 * 更新一个对象WorkLog到数据库中
 * <param name="workLog">需要更新的WorkLog</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int workLogUpdate(WorkLog workLog, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AWorkLogId">工作日志代号</param>
 */
WorkLog workLogSelectByWorkLogId(int AWorkLogId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AWorkUserId">职工号</param>
 */
List<WorkLog> workLogSelectObjectsByWorkUserId(int AWorkUserId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<WorkLog> workLogSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<WorkLog> workLogSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<WorkLog> workLogSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<WorkLog> workLogSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
WorkLog workLogSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<WorkLog> workLogSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<WorkLog> workLogSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
WorkLog workLogSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="workLogQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<WorkLog> workLogSelectObjects(ConditionQuery workLogQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="workLogQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<WorkLog> workLogSelectObjects(ConditionQuery workLogQueryCondition) throws SQLException, DbException;

/**
 * <param name="workLogQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
WorkLog workLogSelectSingleObject(ConditionQuery workLogQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends WorkLog> List<T> workLogSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends WorkLog> List<T> workLogSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends WorkLog> T workLogSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends WorkLog> List<T> workLogSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends WorkLog> List<T> workLogSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends WorkLog> T workLogSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="workLogQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends WorkLog> List<T> workLogSelectObjects(Class<T> type, ConditionQuery workLogQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="workLogQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends WorkLog> List<T> workLogSelectObjects(Class<T> type, ConditionQuery workLogQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="workLogQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends WorkLog> T workLogSelectSingleObject(Class<T> type, ConditionQuery workLogQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int workLogQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="workLogQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int workLogQuerySelectObjectsCount(ConditionQuery workLogQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象WorkLogRelationshipTask到数据库中
 * <param name="workLogRelationshipTask">需要插入的新对象</param>
 */
void workLogRelationshipTaskInsert(WorkLogRelationshipTask workLogRelationshipTask) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象WorkLogRelationshipTask
 * <param name="AWorkLogId">工作日志代号</param>
 * <param name="ATaskId">任务代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void workLogRelationshipTaskDeleteByWorkLogIdTaskId(int AWorkLogId, int ATaskId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象WorkLogRelationshipTask
 * <param name="AWorkLogId">工作日志代号</param>
 * <param name="ATaskId">任务代号</param>
 */
void workLogRelationshipTaskDeleteByWorkLogIdTaskId(int AWorkLogId, int ATaskId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象WorkLogRelationshipTask
 * <param name="ATaskId">任务代号</param>
 */
void workLogRelationshipTaskDeleteListByTaskId(int ATaskId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象WorkLogRelationshipTask
 * <param name="AWorkLogId">工作日志代号</param>
 */
void workLogRelationshipTaskDeleteListByWorkLogId(int AWorkLogId) throws SQLException, DbException;

/**
 * 更新一个对象WorkLogRelationshipTask到数据库中
 * <param name="workLogRelationshipTask">需要更新的WorkLogRelationshipTask</param>
 */
int workLogRelationshipTaskUpdate(WorkLogRelationshipTask workLogRelationshipTask) throws SQLException, DbException;

/**
 * 更新一个对象WorkLogRelationshipTask到数据库中
 * <param name="workLogRelationshipTask">需要更新的WorkLogRelationshipTask</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int workLogRelationshipTaskUpdate(WorkLogRelationshipTask workLogRelationshipTask, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AWorkLogId">工作日志代号</param>
 * <param name="ATaskId">任务代号</param>
 */
WorkLogRelationshipTask workLogRelationshipTaskSelectByWorkLogIdTaskId(int AWorkLogId, int ATaskId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskId">任务代号</param>
 */
List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjectsByTaskId(int ATaskId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AWorkLogId">工作日志代号</param>
 */
List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjectsByWorkLogId(int AWorkLogId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
WorkLogRelationshipTask workLogRelationshipTaskSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
WorkLogRelationshipTask workLogRelationshipTaskSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="workLogRelationshipTaskQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjects(ConditionQuery workLogRelationshipTaskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="workLogRelationshipTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<WorkLogRelationshipTask> workLogRelationshipTaskSelectObjects(ConditionQuery workLogRelationshipTaskQueryCondition) throws SQLException, DbException;

/**
 * <param name="workLogRelationshipTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
WorkLogRelationshipTask workLogRelationshipTaskSelectSingleObject(ConditionQuery workLogRelationshipTaskQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends WorkLogRelationshipTask> List<T> workLogRelationshipTaskSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends WorkLogRelationshipTask> List<T> workLogRelationshipTaskSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends WorkLogRelationshipTask> T workLogRelationshipTaskSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends WorkLogRelationshipTask> List<T> workLogRelationshipTaskSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends WorkLogRelationshipTask> List<T> workLogRelationshipTaskSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends WorkLogRelationshipTask> T workLogRelationshipTaskSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="workLogRelationshipTaskQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends WorkLogRelationshipTask> List<T> workLogRelationshipTaskSelectObjects(Class<T> type, ConditionQuery workLogRelationshipTaskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="workLogRelationshipTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends WorkLogRelationshipTask> List<T> workLogRelationshipTaskSelectObjects(Class<T> type, ConditionQuery workLogRelationshipTaskQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="workLogRelationshipTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends WorkLogRelationshipTask> T workLogRelationshipTaskSelectSingleObject(Class<T> type, ConditionQuery workLogRelationshipTaskQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int workLogRelationshipTaskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="workLogRelationshipTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int workLogRelationshipTaskQuerySelectObjectsCount(ConditionQuery workLogRelationshipTaskQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象WorkFlow到数据库中
 * <param name="workFlow">需要插入的新对象</param>
 */
void workFlowInsert(WorkFlow workFlow) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象WorkFlow
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void workFlowDeleteByWorkFlowId(String AWorkFlowId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象WorkFlow
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
void workFlowDeleteByWorkFlowId(String AWorkFlowId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象WorkFlow
 * <param name="ACreator">创建人</param>
 */
void workFlowDeleteListByCreator(int ACreator) throws SQLException, DbException;

/**
 * 更新一个对象WorkFlow到数据库中
 * <param name="workFlow">需要更新的WorkFlow</param>
 */
int workFlowUpdate(WorkFlow workFlow) throws SQLException, DbException;

/**
 * 更新一个对象WorkFlow到数据库中
 * <param name="workFlow">需要更新的WorkFlow</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int workFlowUpdate(WorkFlow workFlow, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
WorkFlow workFlowSelectByWorkFlowId(String AWorkFlowId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ACreator">创建人</param>
 */
List<WorkFlow> workFlowSelectObjectsByCreator(int ACreator) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<WorkFlow> workFlowSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<WorkFlow> workFlowSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<WorkFlow> workFlowSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<WorkFlow> workFlowSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
WorkFlow workFlowSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<WorkFlow> workFlowSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<WorkFlow> workFlowSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
WorkFlow workFlowSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="workFlowQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<WorkFlow> workFlowSelectObjects(ConditionQuery workFlowQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="workFlowQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<WorkFlow> workFlowSelectObjects(ConditionQuery workFlowQueryCondition) throws SQLException, DbException;

/**
 * <param name="workFlowQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
WorkFlow workFlowSelectSingleObject(ConditionQuery workFlowQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends WorkFlow> List<T> workFlowSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends WorkFlow> List<T> workFlowSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends WorkFlow> T workFlowSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends WorkFlow> List<T> workFlowSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends WorkFlow> List<T> workFlowSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends WorkFlow> T workFlowSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="workFlowQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends WorkFlow> List<T> workFlowSelectObjects(Class<T> type, ConditionQuery workFlowQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="workFlowQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends WorkFlow> List<T> workFlowSelectObjects(Class<T> type, ConditionQuery workFlowQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="workFlowQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends WorkFlow> T workFlowSelectSingleObject(Class<T> type, ConditionQuery workFlowQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int workFlowQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="workFlowQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int workFlowQuerySelectObjectsCount(ConditionQuery workFlowQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象WorkFlowMemo到数据库中
 * <param name="workFlowMemo">需要插入的新对象</param>
 */
void workFlowMemoInsert(WorkFlowMemo workFlowMemo) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象WorkFlowMemo
 * <param name="AWorkFlowMemoId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void workFlowMemoDeleteByWorkFlowMemoId(int AWorkFlowMemoId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象WorkFlowMemo
 * <param name="AWorkFlowMemoId">标识</param>
 */
void workFlowMemoDeleteByWorkFlowMemoId(int AWorkFlowMemoId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象WorkFlowMemo
 * <param name="AMemoUserId">用户代号</param>
 */
void workFlowMemoDeleteListByMemoUserId(int AMemoUserId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象WorkFlowMemo
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
void workFlowMemoDeleteListByWorkFlowId(String AWorkFlowId) throws SQLException, DbException;

/**
 * 更新一个对象WorkFlowMemo到数据库中
 * <param name="workFlowMemo">需要更新的WorkFlowMemo</param>
 */
int workFlowMemoUpdate(WorkFlowMemo workFlowMemo) throws SQLException, DbException;

/**
 * 更新一个对象WorkFlowMemo到数据库中
 * <param name="workFlowMemo">需要更新的WorkFlowMemo</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int workFlowMemoUpdate(WorkFlowMemo workFlowMemo, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AWorkFlowMemoId">标识</param>
 */
WorkFlowMemo workFlowMemoSelectByWorkFlowMemoId(int AWorkFlowMemoId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AMemoUserId">用户代号</param>
 */
List<WorkFlowMemo> workFlowMemoSelectObjectsByMemoUserId(int AMemoUserId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
List<WorkFlowMemo> workFlowMemoSelectObjectsByWorkFlowId(String AWorkFlowId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<WorkFlowMemo> workFlowMemoSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<WorkFlowMemo> workFlowMemoSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<WorkFlowMemo> workFlowMemoSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<WorkFlowMemo> workFlowMemoSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
WorkFlowMemo workFlowMemoSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<WorkFlowMemo> workFlowMemoSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<WorkFlowMemo> workFlowMemoSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
WorkFlowMemo workFlowMemoSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="workFlowMemoQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<WorkFlowMemo> workFlowMemoSelectObjects(ConditionQuery workFlowMemoQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="workFlowMemoQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<WorkFlowMemo> workFlowMemoSelectObjects(ConditionQuery workFlowMemoQueryCondition) throws SQLException, DbException;

/**
 * <param name="workFlowMemoQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
WorkFlowMemo workFlowMemoSelectSingleObject(ConditionQuery workFlowMemoQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends WorkFlowMemo> List<T> workFlowMemoSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends WorkFlowMemo> List<T> workFlowMemoSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends WorkFlowMemo> T workFlowMemoSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends WorkFlowMemo> List<T> workFlowMemoSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends WorkFlowMemo> List<T> workFlowMemoSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends WorkFlowMemo> T workFlowMemoSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="workFlowMemoQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends WorkFlowMemo> List<T> workFlowMemoSelectObjects(Class<T> type, ConditionQuery workFlowMemoQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="workFlowMemoQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends WorkFlowMemo> List<T> workFlowMemoSelectObjects(Class<T> type, ConditionQuery workFlowMemoQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="workFlowMemoQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends WorkFlowMemo> T workFlowMemoSelectSingleObject(Class<T> type, ConditionQuery workFlowMemoQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int workFlowMemoQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="workFlowMemoQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int workFlowMemoQuerySelectObjectsCount(ConditionQuery workFlowMemoQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象IssueUsers到数据库中
 * <param name="issueUsers">需要插入的新对象</param>
 */
void issueUsersInsert(IssueUsers issueUsers) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueUsers
 * <param name="AIssueUserId">用户标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void issueUsersDeleteByIssueUserId(int AIssueUserId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueUsers
 * <param name="AIssueUserId">用户标识</param>
 */
void issueUsersDeleteByIssueUserId(int AIssueUserId) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueUsers
 * <param name="ALoginName">登录名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void issueUsersDeleteByLoginName(String ALoginName, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueUsers
 * <param name="ALoginName">登录名称</param>
 */
void issueUsersDeleteByLoginName(String ALoginName) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象IssueUsers
 * <param name="AInnerUserId">关联到内部的ID</param>
 */
void issueUsersDeleteListByInnerUserId(Integer AInnerUserId) throws SQLException, DbException;

/**
 * 更新一个对象IssueUsers到数据库中
 * <param name="issueUsers">需要更新的IssueUsers</param>
 */
int issueUsersUpdate(IssueUsers issueUsers) throws SQLException, DbException;

/**
 * 更新一个对象IssueUsers到数据库中
 * <param name="issueUsers">需要更新的IssueUsers</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int issueUsersUpdate(IssueUsers issueUsers, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueUserId">用户标识</param>
 */
IssueUsers issueUsersSelectByIssueUserId(int AIssueUserId) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ALoginName">登录名称</param>
 */
IssueUsers issueUsersSelectByLoginName(String ALoginName) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AInnerUserId">关联到内部的ID</param>
 */
List<IssueUsers> issueUsersSelectObjectsByInnerUserId(Integer AInnerUserId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueUsers> issueUsersSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<IssueUsers> issueUsersSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueUsers> issueUsersSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<IssueUsers> issueUsersSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
IssueUsers issueUsersSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueUsers> issueUsersSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<IssueUsers> issueUsersSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
IssueUsers issueUsersSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="issueUsersQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueUsers> issueUsersSelectObjects(ConditionQuery issueUsersQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="issueUsersQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<IssueUsers> issueUsersSelectObjects(ConditionQuery issueUsersQueryCondition) throws SQLException, DbException;

/**
 * <param name="issueUsersQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
IssueUsers issueUsersSelectSingleObject(ConditionQuery issueUsersQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueUsers> List<T> issueUsersSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueUsers> List<T> issueUsersSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueUsers> T issueUsersSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueUsers> List<T> issueUsersSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueUsers> List<T> issueUsersSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueUsers> T issueUsersSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueUsersQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueUsers> List<T> issueUsersSelectObjects(Class<T> type, ConditionQuery issueUsersQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueUsersQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueUsers> List<T> issueUsersSelectObjects(Class<T> type, ConditionQuery issueUsersQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueUsersQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueUsers> T issueUsersSelectSingleObject(Class<T> type, ConditionQuery issueUsersQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int issueUsersQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="issueUsersQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int issueUsersQuerySelectObjectsCount(ConditionQuery issueUsersQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象DepartMent到数据库中
 * <param name="departMent">需要插入的新对象</param>
 */
void departMentInsert(DepartMent departMent) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象DepartMent
 * <param name="ADepartMentId">部门ID</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void departMentDeleteByDepartMentId(int ADepartMentId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象DepartMent
 * <param name="ADepartMentId">部门ID</param>
 */
void departMentDeleteByDepartMentId(int ADepartMentId) throws SQLException, DbException;

/**
 * 更新一个对象DepartMent到数据库中
 * <param name="departMent">需要更新的DepartMent</param>
 */
int departMentUpdate(DepartMent departMent) throws SQLException, DbException;

/**
 * 更新一个对象DepartMent到数据库中
 * <param name="departMent">需要更新的DepartMent</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int departMentUpdate(DepartMent departMent, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADepartMentId">部门ID</param>
 */
DepartMent departMentSelectByDepartMentId(int ADepartMentId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<DepartMent> departMentSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<DepartMent> departMentSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<DepartMent> departMentSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<DepartMent> departMentSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
DepartMent departMentSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<DepartMent> departMentSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<DepartMent> departMentSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
DepartMent departMentSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="departMentQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<DepartMent> departMentSelectObjects(ConditionQuery departMentQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="departMentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<DepartMent> departMentSelectObjects(ConditionQuery departMentQueryCondition) throws SQLException, DbException;

/**
 * <param name="departMentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
DepartMent departMentSelectSingleObject(ConditionQuery departMentQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends DepartMent> List<T> departMentSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends DepartMent> List<T> departMentSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends DepartMent> T departMentSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends DepartMent> List<T> departMentSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends DepartMent> List<T> departMentSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends DepartMent> T departMentSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="departMentQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends DepartMent> List<T> departMentSelectObjects(Class<T> type, ConditionQuery departMentQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="departMentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends DepartMent> List<T> departMentSelectObjects(Class<T> type, ConditionQuery departMentQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="departMentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends DepartMent> T departMentSelectSingleObject(Class<T> type, ConditionQuery departMentQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int departMentQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="departMentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int departMentQuerySelectObjectsCount(ConditionQuery departMentQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象IssueProject到数据库中
 * <param name="issueProject">需要插入的新对象</param>
 */
void issueProjectInsert(IssueProject issueProject) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueProject
 * <param name="AIssueProjectId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void issueProjectDeleteByIssueProjectId(int AIssueProjectId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueProject
 * <param name="AIssueProjectId">标识</param>
 */
void issueProjectDeleteByIssueProjectId(int AIssueProjectId) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueProject
 * <param name="AIssueProjectName">项目名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void issueProjectDeleteByIssueProjectName(String AIssueProjectName, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueProject
 * <param name="AIssueProjectName">项目名称</param>
 */
void issueProjectDeleteByIssueProjectName(String AIssueProjectName) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象IssueProject
 * <param name="ADefaultUserId">默认处理用户</param>
 */
void issueProjectDeleteListByDefaultUserId(int ADefaultUserId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象IssueProject
 * <param name="AInnerProjId">内部工程ID</param>
 */
void issueProjectDeleteListByInnerProjId(Integer AInnerProjId) throws SQLException, DbException;

/**
 * 更新一个对象IssueProject到数据库中
 * <param name="issueProject">需要更新的IssueProject</param>
 */
int issueProjectUpdate(IssueProject issueProject) throws SQLException, DbException;

/**
 * 更新一个对象IssueProject到数据库中
 * <param name="issueProject">需要更新的IssueProject</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int issueProjectUpdate(IssueProject issueProject, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectId">标识</param>
 */
IssueProject issueProjectSelectByIssueProjectId(int AIssueProjectId) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectName">项目名称</param>
 */
IssueProject issueProjectSelectByIssueProjectName(String AIssueProjectName) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ADefaultUserId">默认处理用户</param>
 */
List<IssueProject> issueProjectSelectObjectsByDefaultUserId(int ADefaultUserId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AInnerProjId">内部工程ID</param>
 */
List<IssueProject> issueProjectSelectObjectsByInnerProjId(Integer AInnerProjId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueProject> issueProjectSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<IssueProject> issueProjectSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueProject> issueProjectSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<IssueProject> issueProjectSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
IssueProject issueProjectSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueProject> issueProjectSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<IssueProject> issueProjectSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
IssueProject issueProjectSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="issueProjectQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueProject> issueProjectSelectObjects(ConditionQuery issueProjectQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="issueProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<IssueProject> issueProjectSelectObjects(ConditionQuery issueProjectQueryCondition) throws SQLException, DbException;

/**
 * <param name="issueProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
IssueProject issueProjectSelectSingleObject(ConditionQuery issueProjectQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueProject> List<T> issueProjectSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueProject> List<T> issueProjectSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueProject> T issueProjectSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueProject> List<T> issueProjectSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueProject> List<T> issueProjectSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueProject> T issueProjectSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueProjectQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueProject> List<T> issueProjectSelectObjects(Class<T> type, ConditionQuery issueProjectQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueProject> List<T> issueProjectSelectObjects(Class<T> type, ConditionQuery issueProjectQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueProject> T issueProjectSelectSingleObject(Class<T> type, ConditionQuery issueProjectQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int issueProjectQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="issueProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int issueProjectQuerySelectObjectsCount(ConditionQuery issueProjectQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象DepartMentUser到数据库中
 * <param name="departMentUser">需要插入的新对象</param>
 */
void departMentUserInsert(DepartMentUser departMentUser) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象DepartMentUser
 * <param name="ADepartMentId">部门ID</param>
 * <param name="AUserId">用户代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void departMentUserDeleteByDepartMentIdUserId(int ADepartMentId, int AUserId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象DepartMentUser
 * <param name="ADepartMentId">部门ID</param>
 * <param name="AUserId">用户代号</param>
 */
void departMentUserDeleteByDepartMentIdUserId(int ADepartMentId, int AUserId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象DepartMentUser
 * <param name="ADepartMentId">部门ID</param>
 */
void departMentUserDeleteListByDepartMentId(int ADepartMentId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象DepartMentUser
 * <param name="AUserId">用户代号</param>
 */
void departMentUserDeleteListByUserId(int AUserId) throws SQLException, DbException;

/**
 * 更新一个对象DepartMentUser到数据库中
 * <param name="departMentUser">需要更新的DepartMentUser</param>
 */
int departMentUserUpdate(DepartMentUser departMentUser) throws SQLException, DbException;

/**
 * 更新一个对象DepartMentUser到数据库中
 * <param name="departMentUser">需要更新的DepartMentUser</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int departMentUserUpdate(DepartMentUser departMentUser, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADepartMentId">部门ID</param>
 * <param name="AUserId">用户代号</param>
 */
DepartMentUser departMentUserSelectByDepartMentIdUserId(int ADepartMentId, int AUserId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ADepartMentId">部门ID</param>
 */
List<DepartMentUser> departMentUserSelectObjectsByDepartMentId(int ADepartMentId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AUserId">用户代号</param>
 */
List<DepartMentUser> departMentUserSelectObjectsByUserId(int AUserId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<DepartMentUser> departMentUserSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<DepartMentUser> departMentUserSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<DepartMentUser> departMentUserSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<DepartMentUser> departMentUserSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
DepartMentUser departMentUserSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<DepartMentUser> departMentUserSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<DepartMentUser> departMentUserSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
DepartMentUser departMentUserSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="departMentUserQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<DepartMentUser> departMentUserSelectObjects(ConditionQuery departMentUserQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="departMentUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<DepartMentUser> departMentUserSelectObjects(ConditionQuery departMentUserQueryCondition) throws SQLException, DbException;

/**
 * <param name="departMentUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
DepartMentUser departMentUserSelectSingleObject(ConditionQuery departMentUserQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends DepartMentUser> List<T> departMentUserSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends DepartMentUser> List<T> departMentUserSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends DepartMentUser> T departMentUserSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends DepartMentUser> List<T> departMentUserSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends DepartMentUser> List<T> departMentUserSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends DepartMentUser> T departMentUserSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="departMentUserQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends DepartMentUser> List<T> departMentUserSelectObjects(Class<T> type, ConditionQuery departMentUserQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="departMentUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends DepartMentUser> List<T> departMentUserSelectObjects(Class<T> type, ConditionQuery departMentUserQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="departMentUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends DepartMentUser> T departMentUserSelectSingleObject(Class<T> type, ConditionQuery departMentUserQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int departMentUserQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="departMentUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int departMentUserQuerySelectObjectsCount(ConditionQuery departMentUserQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Leave到数据库中
 * <param name="leave">需要插入的新对象</param>
 */
void leaveInsert(Leave leave) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Leave
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void leaveDeleteByWorkFlowId(String AWorkFlowId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Leave
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
void leaveDeleteByWorkFlowId(String AWorkFlowId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Leave
 * <param name="ARequestUserId">申请人</param>
 */
void leaveDeleteListByRequestUserId(int ARequestUserId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Leave
 * <param name="AAuditUserId">最后审核人</param>
 */
void leaveDeleteListByAuditUserId(Integer AAuditUserId) throws SQLException, DbException;

/**
 * 更新一个对象Leave到数据库中
 * <param name="leave">需要更新的Leave</param>
 */
int leaveUpdate(Leave leave) throws SQLException, DbException;

/**
 * 更新一个对象Leave到数据库中
 * <param name="leave">需要更新的Leave</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int leaveUpdate(Leave leave, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
Leave leaveSelectByWorkFlowId(String AWorkFlowId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ARequestUserId">申请人</param>
 */
List<Leave> leaveSelectObjectsByRequestUserId(int ARequestUserId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AAuditUserId">最后审核人</param>
 */
List<Leave> leaveSelectObjectsByAuditUserId(Integer AAuditUserId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
List<Leave> leaveSelectObjectsByWorkFlowId(String AWorkFlowId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Leave> leaveSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Leave> leaveSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Leave> leaveSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Leave> leaveSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Leave leaveSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Leave> leaveSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Leave> leaveSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Leave leaveSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="leaveQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Leave> leaveSelectObjects(ConditionQuery leaveQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="leaveQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Leave> leaveSelectObjects(ConditionQuery leaveQueryCondition) throws SQLException, DbException;

/**
 * <param name="leaveQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Leave leaveSelectSingleObject(ConditionQuery leaveQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Leave> List<T> leaveSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Leave> List<T> leaveSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Leave> T leaveSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Leave> List<T> leaveSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Leave> List<T> leaveSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Leave> T leaveSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="leaveQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Leave> List<T> leaveSelectObjects(Class<T> type, ConditionQuery leaveQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="leaveQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Leave> List<T> leaveSelectObjects(Class<T> type, ConditionQuery leaveQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="leaveQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Leave> T leaveSelectSingleObject(Class<T> type, ConditionQuery leaveQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int leaveQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="leaveQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int leaveQuerySelectObjectsCount(ConditionQuery leaveQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象IssueProjectModule到数据库中
 * <param name="issueProjectModule">需要插入的新对象</param>
 */
void issueProjectModuleInsert(IssueProjectModule issueProjectModule) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueProjectModule
 * <param name="AIssueProjectModuleId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void issueProjectModuleDeleteByIssueProjectModuleId(int AIssueProjectModuleId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueProjectModule
 * <param name="AIssueProjectModuleId">标识</param>
 */
void issueProjectModuleDeleteByIssueProjectModuleId(int AIssueProjectModuleId) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueProjectModule
 * <param name="AIssueProjectId">标识</param>
 * <param name="AModuleName">模块名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void issueProjectModuleDeleteByIssueProjectIdModuleName(int AIssueProjectId, String AModuleName, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueProjectModule
 * <param name="AIssueProjectId">标识</param>
 * <param name="AModuleName">模块名称</param>
 */
void issueProjectModuleDeleteByIssueProjectIdModuleName(int AIssueProjectId, String AModuleName) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象IssueProjectModule
 * <param name="AIssueProjectId">标识</param>
 */
void issueProjectModuleDeleteListByIssueProjectId(int AIssueProjectId) throws SQLException, DbException;

/**
 * 更新一个对象IssueProjectModule到数据库中
 * <param name="issueProjectModule">需要更新的IssueProjectModule</param>
 */
int issueProjectModuleUpdate(IssueProjectModule issueProjectModule) throws SQLException, DbException;

/**
 * 更新一个对象IssueProjectModule到数据库中
 * <param name="issueProjectModule">需要更新的IssueProjectModule</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int issueProjectModuleUpdate(IssueProjectModule issueProjectModule, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectModuleId">标识</param>
 */
IssueProjectModule issueProjectModuleSelectByIssueProjectModuleId(int AIssueProjectModuleId) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectId">标识</param>
 * <param name="AModuleName">模块名称</param>
 */
IssueProjectModule issueProjectModuleSelectByIssueProjectIdModuleName(int AIssueProjectId, String AModuleName) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectId">标识</param>
 */
List<IssueProjectModule> issueProjectModuleSelectObjectsByIssueProjectId(int AIssueProjectId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueProjectModule> issueProjectModuleSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<IssueProjectModule> issueProjectModuleSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueProjectModule> issueProjectModuleSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<IssueProjectModule> issueProjectModuleSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
IssueProjectModule issueProjectModuleSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueProjectModule> issueProjectModuleSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<IssueProjectModule> issueProjectModuleSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
IssueProjectModule issueProjectModuleSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="issueProjectModuleQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueProjectModule> issueProjectModuleSelectObjects(ConditionQuery issueProjectModuleQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="issueProjectModuleQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<IssueProjectModule> issueProjectModuleSelectObjects(ConditionQuery issueProjectModuleQueryCondition) throws SQLException, DbException;

/**
 * <param name="issueProjectModuleQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
IssueProjectModule issueProjectModuleSelectSingleObject(ConditionQuery issueProjectModuleQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueProjectModule> List<T> issueProjectModuleSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueProjectModule> List<T> issueProjectModuleSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueProjectModule> T issueProjectModuleSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueProjectModule> List<T> issueProjectModuleSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueProjectModule> List<T> issueProjectModuleSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueProjectModule> T issueProjectModuleSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueProjectModuleQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueProjectModule> List<T> issueProjectModuleSelectObjects(Class<T> type, ConditionQuery issueProjectModuleQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueProjectModuleQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueProjectModule> List<T> issueProjectModuleSelectObjects(Class<T> type, ConditionQuery issueProjectModuleQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueProjectModuleQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueProjectModule> T issueProjectModuleSelectSingleObject(Class<T> type, ConditionQuery issueProjectModuleQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int issueProjectModuleQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="issueProjectModuleQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int issueProjectModuleQuerySelectObjectsCount(ConditionQuery issueProjectModuleQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象IssuePriorities到数据库中
 * <param name="issuePriorities">需要插入的新对象</param>
 */
void issuePrioritiesInsert(IssuePriorities issuePriorities) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssuePriorities
 * <param name="APrioritiesId">优先级别</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void issuePrioritiesDeleteByPrioritiesId(byte APrioritiesId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssuePriorities
 * <param name="APrioritiesId">优先级别</param>
 */
void issuePrioritiesDeleteByPrioritiesId(byte APrioritiesId) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssuePriorities
 * <param name="APrioritiesName">优先名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void issuePrioritiesDeleteByPrioritiesName(String APrioritiesName, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssuePriorities
 * <param name="APrioritiesName">优先名称</param>
 */
void issuePrioritiesDeleteByPrioritiesName(String APrioritiesName) throws SQLException, DbException;

/**
 * 更新一个对象IssuePriorities到数据库中
 * <param name="issuePriorities">需要更新的IssuePriorities</param>
 */
int issuePrioritiesUpdate(IssuePriorities issuePriorities) throws SQLException, DbException;

/**
 * 更新一个对象IssuePriorities到数据库中
 * <param name="issuePriorities">需要更新的IssuePriorities</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int issuePrioritiesUpdate(IssuePriorities issuePriorities, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APrioritiesId">优先级别</param>
 */
IssuePriorities issuePrioritiesSelectByPrioritiesId(Byte APrioritiesId) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APrioritiesName">优先名称</param>
 */
IssuePriorities issuePrioritiesSelectByPrioritiesName(String APrioritiesName) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssuePriorities> issuePrioritiesSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<IssuePriorities> issuePrioritiesSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssuePriorities> issuePrioritiesSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<IssuePriorities> issuePrioritiesSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
IssuePriorities issuePrioritiesSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssuePriorities> issuePrioritiesSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<IssuePriorities> issuePrioritiesSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
IssuePriorities issuePrioritiesSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="issuePrioritiesQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssuePriorities> issuePrioritiesSelectObjects(ConditionQuery issuePrioritiesQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="issuePrioritiesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<IssuePriorities> issuePrioritiesSelectObjects(ConditionQuery issuePrioritiesQueryCondition) throws SQLException, DbException;

/**
 * <param name="issuePrioritiesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
IssuePriorities issuePrioritiesSelectSingleObject(ConditionQuery issuePrioritiesQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssuePriorities> List<T> issuePrioritiesSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssuePriorities> List<T> issuePrioritiesSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssuePriorities> T issuePrioritiesSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssuePriorities> List<T> issuePrioritiesSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssuePriorities> List<T> issuePrioritiesSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssuePriorities> T issuePrioritiesSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issuePrioritiesQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssuePriorities> List<T> issuePrioritiesSelectObjects(Class<T> type, ConditionQuery issuePrioritiesQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issuePrioritiesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssuePriorities> List<T> issuePrioritiesSelectObjects(Class<T> type, ConditionQuery issuePrioritiesQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issuePrioritiesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssuePriorities> T issuePrioritiesSelectSingleObject(Class<T> type, ConditionQuery issuePrioritiesQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int issuePrioritiesQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="issuePrioritiesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int issuePrioritiesQuerySelectObjectsCount(ConditionQuery issuePrioritiesQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象FuncProject到数据库中
 * <param name="funcProject">需要插入的新对象</param>
 */
void funcProjectInsert(FuncProject funcProject) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象FuncProject
 * <param name="AFuncProjectId">函数项目标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void funcProjectDeleteByFuncProjectId(int AFuncProjectId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象FuncProject
 * <param name="AFuncProjectId">函数项目标识</param>
 */
void funcProjectDeleteByFuncProjectId(int AFuncProjectId) throws SQLException, DbException;

/**
 * 更新一个对象FuncProject到数据库中
 * <param name="funcProject">需要更新的FuncProject</param>
 */
int funcProjectUpdate(FuncProject funcProject) throws SQLException, DbException;

/**
 * 更新一个对象FuncProject到数据库中
 * <param name="funcProject">需要更新的FuncProject</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int funcProjectUpdate(FuncProject funcProject, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AFuncProjectId">函数项目标识</param>
 */
FuncProject funcProjectSelectByFuncProjectId(int AFuncProjectId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<FuncProject> funcProjectSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<FuncProject> funcProjectSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<FuncProject> funcProjectSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<FuncProject> funcProjectSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
FuncProject funcProjectSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<FuncProject> funcProjectSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<FuncProject> funcProjectSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
FuncProject funcProjectSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="funcProjectQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<FuncProject> funcProjectSelectObjects(ConditionQuery funcProjectQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="funcProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<FuncProject> funcProjectSelectObjects(ConditionQuery funcProjectQueryCondition) throws SQLException, DbException;

/**
 * <param name="funcProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
FuncProject funcProjectSelectSingleObject(ConditionQuery funcProjectQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends FuncProject> List<T> funcProjectSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends FuncProject> List<T> funcProjectSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends FuncProject> T funcProjectSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends FuncProject> List<T> funcProjectSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends FuncProject> List<T> funcProjectSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends FuncProject> T funcProjectSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="funcProjectQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends FuncProject> List<T> funcProjectSelectObjects(Class<T> type, ConditionQuery funcProjectQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="funcProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends FuncProject> List<T> funcProjectSelectObjects(Class<T> type, ConditionQuery funcProjectQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="funcProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends FuncProject> T funcProjectSelectSingleObject(Class<T> type, ConditionQuery funcProjectQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int funcProjectQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="funcProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int funcProjectQuerySelectObjectsCount(ConditionQuery funcProjectQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象IssueStatus到数据库中
 * <param name="issueStatus">需要插入的新对象</param>
 */
void issueStatusInsert(IssueStatus issueStatus) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueStatus
 * <param name="AStatusId">状态标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void issueStatusDeleteByStatusId(int AStatusId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueStatus
 * <param name="AStatusId">状态标识</param>
 */
void issueStatusDeleteByStatusId(int AStatusId) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueStatus
 * <param name="AStatusName">状态名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void issueStatusDeleteByStatusName(String AStatusName, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueStatus
 * <param name="AStatusName">状态名称</param>
 */
void issueStatusDeleteByStatusName(String AStatusName) throws SQLException, DbException;

/**
 * 更新一个对象IssueStatus到数据库中
 * <param name="issueStatus">需要更新的IssueStatus</param>
 */
int issueStatusUpdate(IssueStatus issueStatus) throws SQLException, DbException;

/**
 * 更新一个对象IssueStatus到数据库中
 * <param name="issueStatus">需要更新的IssueStatus</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int issueStatusUpdate(IssueStatus issueStatus, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AStatusId">状态标识</param>
 */
IssueStatus issueStatusSelectByStatusId(int AStatusId) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AStatusName">状态名称</param>
 */
IssueStatus issueStatusSelectByStatusName(String AStatusName) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueStatus> issueStatusSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<IssueStatus> issueStatusSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueStatus> issueStatusSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<IssueStatus> issueStatusSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
IssueStatus issueStatusSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueStatus> issueStatusSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<IssueStatus> issueStatusSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
IssueStatus issueStatusSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="issueStatusQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueStatus> issueStatusSelectObjects(ConditionQuery issueStatusQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="issueStatusQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<IssueStatus> issueStatusSelectObjects(ConditionQuery issueStatusQueryCondition) throws SQLException, DbException;

/**
 * <param name="issueStatusQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
IssueStatus issueStatusSelectSingleObject(ConditionQuery issueStatusQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueStatus> List<T> issueStatusSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueStatus> List<T> issueStatusSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueStatus> T issueStatusSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueStatus> List<T> issueStatusSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueStatus> List<T> issueStatusSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueStatus> T issueStatusSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueStatusQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueStatus> List<T> issueStatusSelectObjects(Class<T> type, ConditionQuery issueStatusQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueStatusQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueStatus> List<T> issueStatusSelectObjects(Class<T> type, ConditionQuery issueStatusQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueStatusQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueStatus> T issueStatusSelectSingleObject(Class<T> type, ConditionQuery issueStatusQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int issueStatusQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="issueStatusQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int issueStatusQuerySelectObjectsCount(ConditionQuery issueStatusQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象TaskUser到数据库中
 * <param name="taskUser">需要插入的新对象</param>
 */
void taskUserInsert(TaskUser taskUser) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象TaskUser
 * <param name="ATaskUserId">任务用户ID</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void taskUserDeleteByTaskUserId(int ATaskUserId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象TaskUser
 * <param name="ATaskUserId">任务用户ID</param>
 */
void taskUserDeleteByTaskUserId(int ATaskUserId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象TaskUser
 * <param name="ATaskId">任务代号</param>
 */
void taskUserDeleteListByTaskId(int ATaskId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象TaskUser
 * <param name="AUserId">用户代号</param>
 */
void taskUserDeleteListByUserId(int AUserId) throws SQLException, DbException;

/**
 * 更新一个对象TaskUser到数据库中
 * <param name="taskUser">需要更新的TaskUser</param>
 */
int taskUserUpdate(TaskUser taskUser) throws SQLException, DbException;

/**
 * 更新一个对象TaskUser到数据库中
 * <param name="taskUser">需要更新的TaskUser</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int taskUserUpdate(TaskUser taskUser, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATaskUserId">任务用户ID</param>
 */
TaskUser taskUserSelectByTaskUserId(int ATaskUserId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskId">任务代号</param>
 */
List<TaskUser> taskUserSelectObjectsByTaskId(int ATaskId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AUserId">用户代号</param>
 */
List<TaskUser> taskUserSelectObjectsByUserId(int AUserId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TaskUser> taskUserSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<TaskUser> taskUserSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TaskUser> taskUserSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<TaskUser> taskUserSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
TaskUser taskUserSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TaskUser> taskUserSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<TaskUser> taskUserSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
TaskUser taskUserSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="taskUserQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TaskUser> taskUserSelectObjects(ConditionQuery taskUserQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="taskUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<TaskUser> taskUserSelectObjects(ConditionQuery taskUserQueryCondition) throws SQLException, DbException;

/**
 * <param name="taskUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
TaskUser taskUserSelectSingleObject(ConditionQuery taskUserQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TaskUser> List<T> taskUserSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends TaskUser> List<T> taskUserSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends TaskUser> T taskUserSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TaskUser> List<T> taskUserSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends TaskUser> List<T> taskUserSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends TaskUser> T taskUserSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="taskUserQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TaskUser> List<T> taskUserSelectObjects(Class<T> type, ConditionQuery taskUserQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="taskUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends TaskUser> List<T> taskUserSelectObjects(Class<T> type, ConditionQuery taskUserQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="taskUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends TaskUser> T taskUserSelectSingleObject(Class<T> type, ConditionQuery taskUserQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int taskUserQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="taskUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int taskUserQuerySelectObjectsCount(ConditionQuery taskUserQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象IssueRoles到数据库中
 * <param name="issueRoles">需要插入的新对象</param>
 */
void issueRolesInsert(IssueRoles issueRoles) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueRoles
 * <param name="ARoleId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void issueRolesDeleteByRoleId(int ARoleId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueRoles
 * <param name="ARoleId">标识</param>
 */
void issueRolesDeleteByRoleId(int ARoleId) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueRoles
 * <param name="ARoleName">角色名称</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void issueRolesDeleteByRoleName(String ARoleName, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueRoles
 * <param name="ARoleName">角色名称</param>
 */
void issueRolesDeleteByRoleName(String ARoleName) throws SQLException, DbException;

/**
 * 更新一个对象IssueRoles到数据库中
 * <param name="issueRoles">需要更新的IssueRoles</param>
 */
int issueRolesUpdate(IssueRoles issueRoles) throws SQLException, DbException;

/**
 * 更新一个对象IssueRoles到数据库中
 * <param name="issueRoles">需要更新的IssueRoles</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int issueRolesUpdate(IssueRoles issueRoles, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ARoleId">标识</param>
 */
IssueRoles issueRolesSelectByRoleId(int ARoleId) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ARoleName">角色名称</param>
 */
IssueRoles issueRolesSelectByRoleName(String ARoleName) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueRoles> issueRolesSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<IssueRoles> issueRolesSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueRoles> issueRolesSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<IssueRoles> issueRolesSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
IssueRoles issueRolesSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueRoles> issueRolesSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<IssueRoles> issueRolesSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
IssueRoles issueRolesSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="issueRolesQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueRoles> issueRolesSelectObjects(ConditionQuery issueRolesQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="issueRolesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<IssueRoles> issueRolesSelectObjects(ConditionQuery issueRolesQueryCondition) throws SQLException, DbException;

/**
 * <param name="issueRolesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
IssueRoles issueRolesSelectSingleObject(ConditionQuery issueRolesQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueRoles> List<T> issueRolesSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueRoles> List<T> issueRolesSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueRoles> T issueRolesSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueRoles> List<T> issueRolesSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueRoles> List<T> issueRolesSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueRoles> T issueRolesSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueRolesQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueRoles> List<T> issueRolesSelectObjects(Class<T> type, ConditionQuery issueRolesQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueRolesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueRoles> List<T> issueRolesSelectObjects(Class<T> type, ConditionQuery issueRolesQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueRolesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueRoles> T issueRolesSelectSingleObject(Class<T> type, ConditionQuery issueRolesQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int issueRolesQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="issueRolesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int issueRolesQuerySelectObjectsCount(ConditionQuery issueRolesQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象IssueProjectUserPrivileges到数据库中
 * <param name="issueProjectUserPrivileges">需要插入的新对象</param>
 */
void issueProjectUserPrivilegesInsert(IssueProjectUserPrivileges issueProjectUserPrivileges) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueProjectUserPrivileges
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void issueProjectUserPrivilegesDeleteByIssueProjectIdIssueUserId(int AIssueProjectId, int AIssueUserId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueProjectUserPrivileges
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 */
void issueProjectUserPrivilegesDeleteByIssueProjectIdIssueUserId(int AIssueProjectId, int AIssueUserId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象IssueProjectUserPrivileges
 * <param name="AIssueProjectId">标识</param>
 */
void issueProjectUserPrivilegesDeleteListByIssueProjectId(int AIssueProjectId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象IssueProjectUserPrivileges
 * <param name="ARoleId">标识</param>
 */
void issueProjectUserPrivilegesDeleteListByRoleId(int ARoleId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象IssueProjectUserPrivileges
 * <param name="AIssueUserId">用户标识</param>
 */
void issueProjectUserPrivilegesDeleteListByIssueUserId(int AIssueUserId) throws SQLException, DbException;

/**
 * 更新一个对象IssueProjectUserPrivileges到数据库中
 * <param name="issueProjectUserPrivileges">需要更新的IssueProjectUserPrivileges</param>
 */
int issueProjectUserPrivilegesUpdate(IssueProjectUserPrivileges issueProjectUserPrivileges) throws SQLException, DbException;

/**
 * 更新一个对象IssueProjectUserPrivileges到数据库中
 * <param name="issueProjectUserPrivileges">需要更新的IssueProjectUserPrivileges</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int issueProjectUserPrivilegesUpdate(IssueProjectUserPrivileges issueProjectUserPrivileges, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 */
IssueProjectUserPrivileges issueProjectUserPrivilegesSelectByIssueProjectIdIssueUserId(int AIssueProjectId, int AIssueUserId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectId">标识</param>
 */
List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjectsByIssueProjectId(int AIssueProjectId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ARoleId">标识</param>
 */
List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjectsByRoleId(int ARoleId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueUserId">用户标识</param>
 */
List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjectsByIssueUserId(int AIssueUserId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
IssueProjectUserPrivileges issueProjectUserPrivilegesSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
IssueProjectUserPrivileges issueProjectUserPrivilegesSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="issueProjectUserPrivilegesQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjects(ConditionQuery issueProjectUserPrivilegesQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="issueProjectUserPrivilegesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<IssueProjectUserPrivileges> issueProjectUserPrivilegesSelectObjects(ConditionQuery issueProjectUserPrivilegesQueryCondition) throws SQLException, DbException;

/**
 * <param name="issueProjectUserPrivilegesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
IssueProjectUserPrivileges issueProjectUserPrivilegesSelectSingleObject(ConditionQuery issueProjectUserPrivilegesQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueProjectUserPrivileges> List<T> issueProjectUserPrivilegesSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueProjectUserPrivileges> List<T> issueProjectUserPrivilegesSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueProjectUserPrivileges> T issueProjectUserPrivilegesSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueProjectUserPrivileges> List<T> issueProjectUserPrivilegesSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueProjectUserPrivileges> List<T> issueProjectUserPrivilegesSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueProjectUserPrivileges> T issueProjectUserPrivilegesSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueProjectUserPrivilegesQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueProjectUserPrivileges> List<T> issueProjectUserPrivilegesSelectObjects(Class<T> type, ConditionQuery issueProjectUserPrivilegesQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueProjectUserPrivilegesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueProjectUserPrivileges> List<T> issueProjectUserPrivilegesSelectObjects(Class<T> type, ConditionQuery issueProjectUserPrivilegesQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueProjectUserPrivilegesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueProjectUserPrivileges> T issueProjectUserPrivilegesSelectSingleObject(Class<T> type, ConditionQuery issueProjectUserPrivilegesQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int issueProjectUserPrivilegesQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="issueProjectUserPrivilegesQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int issueProjectUserPrivilegesQuerySelectObjectsCount(ConditionQuery issueProjectUserPrivilegesQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Task到数据库中
 * <param name="task">需要插入的新对象</param>
 */
void taskInsert(Task task) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Task
 * <param name="ATaskId">任务代号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void taskDeleteByTaskId(int ATaskId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Task
 * <param name="ATaskId">任务代号</param>
 */
void taskDeleteByTaskId(int ATaskId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Task
 * <param name="ATaskProjectId">任务工程代号</param>
 */
void taskDeleteListByTaskProjectId(int ATaskProjectId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Task
 * <param name="ATaskParentId">父任务代号</param>
 */
void taskDeleteListByTaskParentId(Integer ATaskParentId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Task
 * <param name="ATaskModifierId">任务修改者代号</param>
 */
void taskDeleteListByTaskModifierId(int ATaskModifierId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Task
 * <param name="ATaskManagerId">任务管理员代号</param>
 */
void taskDeleteListByTaskManagerId(int ATaskManagerId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Task
 * <param name="ATaskCreaterId">任务创建者代号</param>
 */
void taskDeleteListByTaskCreaterId(int ATaskCreaterId) throws SQLException, DbException;

/**
 * 更新一个对象Task到数据库中
 * <param name="task">需要更新的Task</param>
 */
int taskUpdate(Task task) throws SQLException, DbException;

/**
 * 更新一个对象Task到数据库中
 * <param name="task">需要更新的Task</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int taskUpdate(Task task, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATaskId">任务代号</param>
 */
Task taskSelectByTaskId(int ATaskId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskProjectId">任务工程代号</param>
 */
List<Task> taskSelectObjectsByTaskProjectId(int ATaskProjectId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskParentId">父任务代号</param>
 */
List<Task> taskSelectObjectsByTaskParentId(Integer ATaskParentId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskModifierId">任务修改者代号</param>
 */
List<Task> taskSelectObjectsByTaskModifierId(int ATaskModifierId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskManagerId">任务管理员代号</param>
 */
List<Task> taskSelectObjectsByTaskManagerId(int ATaskManagerId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATaskCreaterId">任务创建者代号</param>
 */
List<Task> taskSelectObjectsByTaskCreaterId(int ATaskCreaterId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Task> taskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Task> taskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Task> taskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Task> taskSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Task taskSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Task> taskSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Task> taskSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Task taskSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="taskQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Task> taskSelectObjects(ConditionQuery taskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="taskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Task> taskSelectObjects(ConditionQuery taskQueryCondition) throws SQLException, DbException;

/**
 * <param name="taskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Task taskSelectSingleObject(ConditionQuery taskQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Task> List<T> taskSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Task> List<T> taskSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Task> T taskSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Task> List<T> taskSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Task> List<T> taskSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Task> T taskSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="taskQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Task> List<T> taskSelectObjects(Class<T> type, ConditionQuery taskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="taskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Task> List<T> taskSelectObjects(Class<T> type, ConditionQuery taskQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="taskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Task> T taskSelectSingleObject(Class<T> type, ConditionQuery taskQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int taskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="taskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int taskQuerySelectObjectsCount(ConditionQuery taskQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象FuncParams到数据库中
 * <param name="funcParams">需要插入的新对象</param>
 */
void funcParamsInsert(FuncParams funcParams) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象FuncParams
 * <param name="AParamId">参数标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void funcParamsDeleteByParamId(int AParamId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象FuncParams
 * <param name="AParamId">参数标识</param>
 */
void funcParamsDeleteByParamId(int AParamId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象FuncParams
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
void funcParamsDeleteListByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException;

/**
 * 更新一个对象FuncParams到数据库中
 * <param name="funcParams">需要更新的FuncParams</param>
 */
int funcParamsUpdate(FuncParams funcParams) throws SQLException, DbException;

/**
 * 更新一个对象FuncParams到数据库中
 * <param name="funcParams">需要更新的FuncParams</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int funcParamsUpdate(FuncParams funcParams, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AParamId">参数标识</param>
 */
FuncParams funcParamsSelectByParamId(int AParamId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
List<FuncParams> funcParamsSelectObjectsByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<FuncParams> funcParamsSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<FuncParams> funcParamsSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<FuncParams> funcParamsSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<FuncParams> funcParamsSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
FuncParams funcParamsSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<FuncParams> funcParamsSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<FuncParams> funcParamsSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
FuncParams funcParamsSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="funcParamsQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<FuncParams> funcParamsSelectObjects(ConditionQuery funcParamsQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="funcParamsQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<FuncParams> funcParamsSelectObjects(ConditionQuery funcParamsQueryCondition) throws SQLException, DbException;

/**
 * <param name="funcParamsQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
FuncParams funcParamsSelectSingleObject(ConditionQuery funcParamsQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends FuncParams> List<T> funcParamsSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends FuncParams> List<T> funcParamsSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends FuncParams> T funcParamsSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends FuncParams> List<T> funcParamsSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends FuncParams> List<T> funcParamsSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends FuncParams> T funcParamsSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="funcParamsQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends FuncParams> List<T> funcParamsSelectObjects(Class<T> type, ConditionQuery funcParamsQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="funcParamsQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends FuncParams> List<T> funcParamsSelectObjects(Class<T> type, ConditionQuery funcParamsQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="funcParamsQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends FuncParams> T funcParamsSelectSingleObject(Class<T> type, ConditionQuery funcParamsQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int funcParamsQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="funcParamsQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int funcParamsQuerySelectObjectsCount(ConditionQuery funcParamsQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象IssueStateChangeDefine到数据库中
 * <param name="issueStateChangeDefine">需要插入的新对象</param>
 */
void issueStateChangeDefineInsert(IssueStateChangeDefine issueStateChangeDefine) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueStateChangeDefine
 * <param name="ACurrentStatusId">当前状态标识</param>
 * <param name="ANextStatusId">下一个状态标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void issueStateChangeDefineDeleteByCurrentStatusIdNextStatusId(int ACurrentStatusId, int ANextStatusId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueStateChangeDefine
 * <param name="ACurrentStatusId">当前状态标识</param>
 * <param name="ANextStatusId">下一个状态标识</param>
 */
void issueStateChangeDefineDeleteByCurrentStatusIdNextStatusId(int ACurrentStatusId, int ANextStatusId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象IssueStateChangeDefine
 * <param name="ACurrentStatusId">当前状态标识</param>
 */
void issueStateChangeDefineDeleteListByCurrentStatusId(int ACurrentStatusId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象IssueStateChangeDefine
 * <param name="ANextStatusId">下一个状态标识</param>
 */
void issueStateChangeDefineDeleteListByNextStatusId(int ANextStatusId) throws SQLException, DbException;

/**
 * 更新一个对象IssueStateChangeDefine到数据库中
 * <param name="issueStateChangeDefine">需要更新的IssueStateChangeDefine</param>
 */
int issueStateChangeDefineUpdate(IssueStateChangeDefine issueStateChangeDefine) throws SQLException, DbException;

/**
 * 更新一个对象IssueStateChangeDefine到数据库中
 * <param name="issueStateChangeDefine">需要更新的IssueStateChangeDefine</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int issueStateChangeDefineUpdate(IssueStateChangeDefine issueStateChangeDefine, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ACurrentStatusId">当前状态标识</param>
 * <param name="ANextStatusId">下一个状态标识</param>
 */
IssueStateChangeDefine issueStateChangeDefineSelectByCurrentStatusIdNextStatusId(int ACurrentStatusId, int ANextStatusId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ACurrentStatusId">当前状态标识</param>
 */
List<IssueStateChangeDefine> issueStateChangeDefineSelectObjectsByCurrentStatusId(int ACurrentStatusId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ANextStatusId">下一个状态标识</param>
 */
List<IssueStateChangeDefine> issueStateChangeDefineSelectObjectsByNextStatusId(int ANextStatusId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueStateChangeDefine> issueStateChangeDefineSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<IssueStateChangeDefine> issueStateChangeDefineSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueStateChangeDefine> issueStateChangeDefineSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<IssueStateChangeDefine> issueStateChangeDefineSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
IssueStateChangeDefine issueStateChangeDefineSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueStateChangeDefine> issueStateChangeDefineSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<IssueStateChangeDefine> issueStateChangeDefineSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
IssueStateChangeDefine issueStateChangeDefineSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="issueStateChangeDefineQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueStateChangeDefine> issueStateChangeDefineSelectObjects(ConditionQuery issueStateChangeDefineQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="issueStateChangeDefineQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<IssueStateChangeDefine> issueStateChangeDefineSelectObjects(ConditionQuery issueStateChangeDefineQueryCondition) throws SQLException, DbException;

/**
 * <param name="issueStateChangeDefineQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
IssueStateChangeDefine issueStateChangeDefineSelectSingleObject(ConditionQuery issueStateChangeDefineQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueStateChangeDefine> List<T> issueStateChangeDefineSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueStateChangeDefine> List<T> issueStateChangeDefineSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueStateChangeDefine> T issueStateChangeDefineSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueStateChangeDefine> List<T> issueStateChangeDefineSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueStateChangeDefine> List<T> issueStateChangeDefineSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueStateChangeDefine> T issueStateChangeDefineSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueStateChangeDefineQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueStateChangeDefine> List<T> issueStateChangeDefineSelectObjects(Class<T> type, ConditionQuery issueStateChangeDefineQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueStateChangeDefineQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueStateChangeDefine> List<T> issueStateChangeDefineSelectObjects(Class<T> type, ConditionQuery issueStateChangeDefineQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueStateChangeDefineQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueStateChangeDefine> T issueStateChangeDefineSelectSingleObject(Class<T> type, ConditionQuery issueStateChangeDefineQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int issueStateChangeDefineQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="issueStateChangeDefineQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int issueStateChangeDefineQuerySelectObjectsCount(ConditionQuery issueStateChangeDefineQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象IssueComment到数据库中
 * <param name="issueComment">需要插入的新对象</param>
 */
void issueCommentInsert(IssueComment issueComment) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueComment
 * <param name="AIssueCommentId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void issueCommentDeleteByIssueCommentId(int AIssueCommentId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueComment
 * <param name="AIssueCommentId">标识</param>
 */
void issueCommentDeleteByIssueCommentId(int AIssueCommentId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象IssueComment
 * <param name="AIssueId">问题标识</param>
 */
void issueCommentDeleteListByIssueId(int AIssueId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象IssueComment
 * <param name="ACommentUserId">用户标识</param>
 */
void issueCommentDeleteListByCommentUserId(int ACommentUserId) throws SQLException, DbException;

/**
 * 更新一个对象IssueComment到数据库中
 * <param name="issueComment">需要更新的IssueComment</param>
 */
int issueCommentUpdate(IssueComment issueComment) throws SQLException, DbException;

/**
 * 更新一个对象IssueComment到数据库中
 * <param name="issueComment">需要更新的IssueComment</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int issueCommentUpdate(IssueComment issueComment, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueCommentId">标识</param>
 */
IssueComment issueCommentSelectByIssueCommentId(int AIssueCommentId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueId">问题标识</param>
 */
List<IssueComment> issueCommentSelectObjectsByIssueId(int AIssueId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ACommentUserId">用户标识</param>
 */
List<IssueComment> issueCommentSelectObjectsByCommentUserId(int ACommentUserId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueComment> issueCommentSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<IssueComment> issueCommentSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueComment> issueCommentSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<IssueComment> issueCommentSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
IssueComment issueCommentSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueComment> issueCommentSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<IssueComment> issueCommentSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
IssueComment issueCommentSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="issueCommentQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueComment> issueCommentSelectObjects(ConditionQuery issueCommentQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="issueCommentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<IssueComment> issueCommentSelectObjects(ConditionQuery issueCommentQueryCondition) throws SQLException, DbException;

/**
 * <param name="issueCommentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
IssueComment issueCommentSelectSingleObject(ConditionQuery issueCommentQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueComment> List<T> issueCommentSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueComment> List<T> issueCommentSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueComment> T issueCommentSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueComment> List<T> issueCommentSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueComment> List<T> issueCommentSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueComment> T issueCommentSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueCommentQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueComment> List<T> issueCommentSelectObjects(Class<T> type, ConditionQuery issueCommentQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueCommentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueComment> List<T> issueCommentSelectObjects(Class<T> type, ConditionQuery issueCommentQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueCommentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueComment> T issueCommentSelectSingleObject(Class<T> type, ConditionQuery issueCommentQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int issueCommentQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="issueCommentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int issueCommentQuerySelectObjectsCount(ConditionQuery issueCommentQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Issue到数据库中
 * <param name="issue">需要插入的新对象</param>
 */
void issueInsert(Issue issue) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Issue
 * <param name="AIssueId">问题标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void issueDeleteByIssueId(int AIssueId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Issue
 * <param name="AIssueId">问题标识</param>
 */
void issueDeleteByIssueId(int AIssueId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Issue
 * <param name="APrioritiesId">优先级别</param>
 */
void issueDeleteListByPrioritiesId(Byte APrioritiesId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Issue
 * <param name="AIssueProjectId">项目标识</param>
 */
void issueDeleteListByIssueProjectId(int AIssueProjectId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Issue
 * <param name="AIssueProjectModuleId">标识</param>
 */
void issueDeleteListByIssueProjectModuleId(Integer AIssueProjectModuleId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Issue
 * <param name="AStatusId">状态标识</param>
 */
void issueDeleteListByStatusId(int AStatusId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Issue
 * <param name="AReportUserId">报告用户</param>
 */
void issueDeleteListByReportUserId(int AReportUserId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Issue
 * <param name="AAssignUserId">关联处理用户</param>
 */
void issueDeleteListByAssignUserId(int AAssignUserId) throws SQLException, DbException;

/**
 * 更新一个对象Issue到数据库中
 * <param name="issue">需要更新的Issue</param>
 */
int issueUpdate(Issue issue) throws SQLException, DbException;

/**
 * 更新一个对象Issue到数据库中
 * <param name="issue">需要更新的Issue</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int issueUpdate(Issue issue, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueId">问题标识</param>
 */
Issue issueSelectByIssueId(int AIssueId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="APrioritiesId">优先级别</param>
 */
List<Issue> issueSelectObjectsByPrioritiesId(Byte APrioritiesId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectId">项目标识</param>
 */
List<Issue> issueSelectObjectsByIssueProjectId(int AIssueProjectId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectModuleId">标识</param>
 */
List<Issue> issueSelectObjectsByIssueProjectModuleId(Integer AIssueProjectModuleId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AStatusId">状态标识</param>
 */
List<Issue> issueSelectObjectsByStatusId(int AStatusId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AReportUserId">报告用户</param>
 */
List<Issue> issueSelectObjectsByReportUserId(int AReportUserId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AAssignUserId">关联处理用户</param>
 */
List<Issue> issueSelectObjectsByAssignUserId(int AAssignUserId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Issue> issueSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Issue> issueSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Issue> issueSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Issue> issueSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Issue issueSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Issue> issueSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Issue> issueSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Issue issueSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="issueQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Issue> issueSelectObjects(ConditionQuery issueQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="issueQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Issue> issueSelectObjects(ConditionQuery issueQueryCondition) throws SQLException, DbException;

/**
 * <param name="issueQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Issue issueSelectSingleObject(ConditionQuery issueQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Issue> List<T> issueSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Issue> List<T> issueSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Issue> T issueSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Issue> List<T> issueSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Issue> List<T> issueSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Issue> T issueSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Issue> List<T> issueSelectObjects(Class<T> type, ConditionQuery issueQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Issue> List<T> issueSelectObjects(Class<T> type, ConditionQuery issueQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Issue> T issueSelectSingleObject(Class<T> type, ConditionQuery issueQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int issueQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="issueQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int issueQuerySelectObjectsCount(ConditionQuery issueQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象FuncProcedure到数据库中
 * <param name="funcProcedure">需要插入的新对象</param>
 */
void funcProcedureInsert(FuncProcedure funcProcedure) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象FuncProcedure
 * <param name="AFuncProcedureId">函数过程标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void funcProcedureDeleteByFuncProcedureId(int AFuncProcedureId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象FuncProcedure
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
void funcProcedureDeleteByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象FuncProcedure
 * <param name="AFuncProjectId">函数项目标识</param>
 */
void funcProcedureDeleteListByFuncProjectId(int AFuncProjectId) throws SQLException, DbException;

/**
 * 更新一个对象FuncProcedure到数据库中
 * <param name="funcProcedure">需要更新的FuncProcedure</param>
 */
int funcProcedureUpdate(FuncProcedure funcProcedure) throws SQLException, DbException;

/**
 * 更新一个对象FuncProcedure到数据库中
 * <param name="funcProcedure">需要更新的FuncProcedure</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int funcProcedureUpdate(FuncProcedure funcProcedure, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
FuncProcedure funcProcedureSelectByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AFuncProjectId">函数项目标识</param>
 */
List<FuncProcedure> funcProcedureSelectObjectsByFuncProjectId(int AFuncProjectId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<FuncProcedure> funcProcedureSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<FuncProcedure> funcProcedureSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<FuncProcedure> funcProcedureSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<FuncProcedure> funcProcedureSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
FuncProcedure funcProcedureSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<FuncProcedure> funcProcedureSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<FuncProcedure> funcProcedureSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
FuncProcedure funcProcedureSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="funcProcedureQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<FuncProcedure> funcProcedureSelectObjects(ConditionQuery funcProcedureQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="funcProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<FuncProcedure> funcProcedureSelectObjects(ConditionQuery funcProcedureQueryCondition) throws SQLException, DbException;

/**
 * <param name="funcProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
FuncProcedure funcProcedureSelectSingleObject(ConditionQuery funcProcedureQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends FuncProcedure> List<T> funcProcedureSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends FuncProcedure> List<T> funcProcedureSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends FuncProcedure> T funcProcedureSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends FuncProcedure> List<T> funcProcedureSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends FuncProcedure> List<T> funcProcedureSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends FuncProcedure> T funcProcedureSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="funcProcedureQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends FuncProcedure> List<T> funcProcedureSelectObjects(Class<T> type, ConditionQuery funcProcedureQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="funcProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends FuncProcedure> List<T> funcProcedureSelectObjects(Class<T> type, ConditionQuery funcProcedureQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="funcProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends FuncProcedure> T funcProcedureSelectSingleObject(Class<T> type, ConditionQuery funcProcedureQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int funcProcedureQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="funcProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int funcProcedureQuerySelectObjectsCount(ConditionQuery funcProcedureQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象OrmappingProject到数据库中
 * <param name="ormappingProject">需要插入的新对象</param>
 */
void ormappingProjectInsert(OrmappingProject ormappingProject) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象OrmappingProject
 * <param name="AProjId">工程号</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void ormappingProjectDeleteByProjId(int AProjId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象OrmappingProject
 * <param name="AProjId">工程号</param>
 */
void ormappingProjectDeleteByProjId(int AProjId) throws SQLException, DbException;

/**
 * 更新一个对象OrmappingProject到数据库中
 * <param name="ormappingProject">需要更新的OrmappingProject</param>
 */
int ormappingProjectUpdate(OrmappingProject ormappingProject) throws SQLException, DbException;

/**
 * 更新一个对象OrmappingProject到数据库中
 * <param name="ormappingProject">需要更新的OrmappingProject</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int ormappingProjectUpdate(OrmappingProject ormappingProject, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AProjId">工程号</param>
 */
OrmappingProject ormappingProjectSelectByProjId(int AProjId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AProjId">工程号</param>
 */
List<OrmappingProject> ormappingProjectSelectObjectsByProjId(int AProjId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<OrmappingProject> ormappingProjectSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<OrmappingProject> ormappingProjectSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<OrmappingProject> ormappingProjectSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<OrmappingProject> ormappingProjectSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
OrmappingProject ormappingProjectSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<OrmappingProject> ormappingProjectSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<OrmappingProject> ormappingProjectSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
OrmappingProject ormappingProjectSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="ormappingProjectQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<OrmappingProject> ormappingProjectSelectObjects(ConditionQuery ormappingProjectQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="ormappingProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<OrmappingProject> ormappingProjectSelectObjects(ConditionQuery ormappingProjectQueryCondition) throws SQLException, DbException;

/**
 * <param name="ormappingProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
OrmappingProject ormappingProjectSelectSingleObject(ConditionQuery ormappingProjectQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends OrmappingProject> List<T> ormappingProjectSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends OrmappingProject> List<T> ormappingProjectSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends OrmappingProject> T ormappingProjectSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends OrmappingProject> List<T> ormappingProjectSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends OrmappingProject> List<T> ormappingProjectSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends OrmappingProject> T ormappingProjectSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="ormappingProjectQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends OrmappingProject> List<T> ormappingProjectSelectObjects(Class<T> type, ConditionQuery ormappingProjectQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="ormappingProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends OrmappingProject> List<T> ormappingProjectSelectObjects(Class<T> type, ConditionQuery ormappingProjectQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="ormappingProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends OrmappingProject> T ormappingProjectSelectSingleObject(Class<T> type, ConditionQuery ormappingProjectQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int ormappingProjectQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="ormappingProjectQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int ormappingProjectQuerySelectObjectsCount(ConditionQuery ormappingProjectQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象CodeBuild到数据库中
 * <param name="codeBuild">需要插入的新对象</param>
 */
void codeBuildInsert(CodeBuild codeBuild) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象CodeBuild
 * <param name="ABuildId">构建标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void codeBuildDeleteByBuildId(int ABuildId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象CodeBuild
 * <param name="ABuildId">构建标识</param>
 */
void codeBuildDeleteByBuildId(int ABuildId) throws SQLException, DbException;

/**
 * 更新一个对象CodeBuild到数据库中
 * <param name="codeBuild">需要更新的CodeBuild</param>
 */
int codeBuildUpdate(CodeBuild codeBuild) throws SQLException, DbException;

/**
 * 更新一个对象CodeBuild到数据库中
 * <param name="codeBuild">需要更新的CodeBuild</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int codeBuildUpdate(CodeBuild codeBuild, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ABuildId">构建标识</param>
 */
CodeBuild codeBuildSelectByBuildId(int ABuildId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<CodeBuild> codeBuildSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<CodeBuild> codeBuildSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<CodeBuild> codeBuildSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<CodeBuild> codeBuildSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
CodeBuild codeBuildSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<CodeBuild> codeBuildSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<CodeBuild> codeBuildSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
CodeBuild codeBuildSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="codeBuildQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<CodeBuild> codeBuildSelectObjects(ConditionQuery codeBuildQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="codeBuildQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<CodeBuild> codeBuildSelectObjects(ConditionQuery codeBuildQueryCondition) throws SQLException, DbException;

/**
 * <param name="codeBuildQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
CodeBuild codeBuildSelectSingleObject(ConditionQuery codeBuildQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends CodeBuild> List<T> codeBuildSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends CodeBuild> List<T> codeBuildSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends CodeBuild> T codeBuildSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends CodeBuild> List<T> codeBuildSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends CodeBuild> List<T> codeBuildSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends CodeBuild> T codeBuildSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="codeBuildQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends CodeBuild> List<T> codeBuildSelectObjects(Class<T> type, ConditionQuery codeBuildQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="codeBuildQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends CodeBuild> List<T> codeBuildSelectObjects(Class<T> type, ConditionQuery codeBuildQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="codeBuildQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends CodeBuild> T codeBuildSelectSingleObject(Class<T> type, ConditionQuery codeBuildQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int codeBuildQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="codeBuildQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int codeBuildQuerySelectObjectsCount(ConditionQuery codeBuildQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Jbpm4Deployment到数据库中
 * <param name="jbpm4Deployment">需要插入的新对象</param>
 */
void jbpm4DeploymentInsert(Jbpm4Deployment jbpm4Deployment) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4Deployment
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void jbpm4DeploymentDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4Deployment
 * <param name="ADbid"></param>
 */
void jbpm4DeploymentDeleteByDbid(double ADbid) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4Deployment到数据库中
 * <param name="jbpm4Deployment">需要更新的Jbpm4Deployment</param>
 */
int jbpm4DeploymentUpdate(Jbpm4Deployment jbpm4Deployment) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4Deployment到数据库中
 * <param name="jbpm4Deployment">需要更新的Jbpm4Deployment</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int jbpm4DeploymentUpdate(Jbpm4Deployment jbpm4Deployment, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
Jbpm4Deployment jbpm4DeploymentSelectByDbid(double ADbid) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Deployment> jbpm4DeploymentSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Jbpm4Deployment> jbpm4DeploymentSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Deployment> jbpm4DeploymentSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Jbpm4Deployment> jbpm4DeploymentSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Jbpm4Deployment jbpm4DeploymentSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Deployment> jbpm4DeploymentSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Jbpm4Deployment> jbpm4DeploymentSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Jbpm4Deployment jbpm4DeploymentSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="jbpm4DeploymentQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Deployment> jbpm4DeploymentSelectObjects(ConditionQuery jbpm4DeploymentQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="jbpm4DeploymentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Jbpm4Deployment> jbpm4DeploymentSelectObjects(ConditionQuery jbpm4DeploymentQueryCondition) throws SQLException, DbException;

/**
 * <param name="jbpm4DeploymentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Jbpm4Deployment jbpm4DeploymentSelectSingleObject(ConditionQuery jbpm4DeploymentQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Deployment> List<T> jbpm4DeploymentSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4Deployment> List<T> jbpm4DeploymentSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4Deployment> T jbpm4DeploymentSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Deployment> List<T> jbpm4DeploymentSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4Deployment> List<T> jbpm4DeploymentSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4Deployment> T jbpm4DeploymentSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4DeploymentQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Deployment> List<T> jbpm4DeploymentSelectObjects(Class<T> type, ConditionQuery jbpm4DeploymentQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4DeploymentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4Deployment> List<T> jbpm4DeploymentSelectObjects(Class<T> type, ConditionQuery jbpm4DeploymentQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4DeploymentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4Deployment> T jbpm4DeploymentSelectSingleObject(Class<T> type, ConditionQuery jbpm4DeploymentQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int jbpm4DeploymentQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="jbpm4DeploymentQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int jbpm4DeploymentQuerySelectObjectsCount(ConditionQuery jbpm4DeploymentQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象CodeBuildLog到数据库中
 * <param name="codeBuildLog">需要插入的新对象</param>
 */
void codeBuildLogInsert(CodeBuildLog codeBuildLog) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象CodeBuildLog
 * <param name="ABuildLogId">构建标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void codeBuildLogDeleteByBuildLogId(int ABuildLogId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象CodeBuildLog
 * <param name="ABuildLogId">构建标识</param>
 */
void codeBuildLogDeleteByBuildLogId(int ABuildLogId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象CodeBuildLog
 * <param name="ABuildId">构建标识</param>
 */
void codeBuildLogDeleteListByBuildId(int ABuildId) throws SQLException, DbException;

/**
 * 更新一个对象CodeBuildLog到数据库中
 * <param name="codeBuildLog">需要更新的CodeBuildLog</param>
 */
int codeBuildLogUpdate(CodeBuildLog codeBuildLog) throws SQLException, DbException;

/**
 * 更新一个对象CodeBuildLog到数据库中
 * <param name="codeBuildLog">需要更新的CodeBuildLog</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int codeBuildLogUpdate(CodeBuildLog codeBuildLog, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ABuildLogId">构建标识</param>
 */
CodeBuildLog codeBuildLogSelectByBuildLogId(int ABuildLogId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ABuildId">构建标识</param>
 */
List<CodeBuildLog> codeBuildLogSelectObjectsByBuildId(int ABuildId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<CodeBuildLog> codeBuildLogSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<CodeBuildLog> codeBuildLogSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<CodeBuildLog> codeBuildLogSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<CodeBuildLog> codeBuildLogSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
CodeBuildLog codeBuildLogSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<CodeBuildLog> codeBuildLogSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<CodeBuildLog> codeBuildLogSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
CodeBuildLog codeBuildLogSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="codeBuildLogQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<CodeBuildLog> codeBuildLogSelectObjects(ConditionQuery codeBuildLogQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="codeBuildLogQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<CodeBuildLog> codeBuildLogSelectObjects(ConditionQuery codeBuildLogQueryCondition) throws SQLException, DbException;

/**
 * <param name="codeBuildLogQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
CodeBuildLog codeBuildLogSelectSingleObject(ConditionQuery codeBuildLogQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends CodeBuildLog> List<T> codeBuildLogSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends CodeBuildLog> List<T> codeBuildLogSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends CodeBuildLog> T codeBuildLogSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends CodeBuildLog> List<T> codeBuildLogSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends CodeBuildLog> List<T> codeBuildLogSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends CodeBuildLog> T codeBuildLogSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="codeBuildLogQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends CodeBuildLog> List<T> codeBuildLogSelectObjects(Class<T> type, ConditionQuery codeBuildLogQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="codeBuildLogQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends CodeBuildLog> List<T> codeBuildLogSelectObjects(Class<T> type, ConditionQuery codeBuildLogQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="codeBuildLogQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends CodeBuildLog> T codeBuildLogSelectSingleObject(Class<T> type, ConditionQuery codeBuildLogQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int codeBuildLogQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="codeBuildLogQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int codeBuildLogQuerySelectObjectsCount(ConditionQuery codeBuildLogQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Jbpm4Deployprop到数据库中
 * <param name="jbpm4Deployprop">需要插入的新对象</param>
 */
void jbpm4DeploypropInsert(Jbpm4Deployprop jbpm4Deployprop) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4Deployprop
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void jbpm4DeploypropDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4Deployprop
 * <param name="ADbid"></param>
 */
void jbpm4DeploypropDeleteByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4Deployprop
 * <param name="ADeployment"></param>
 */
void jbpm4DeploypropDeleteListByDeployment(Double ADeployment) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4Deployprop到数据库中
 * <param name="jbpm4Deployprop">需要更新的Jbpm4Deployprop</param>
 */
int jbpm4DeploypropUpdate(Jbpm4Deployprop jbpm4Deployprop) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4Deployprop到数据库中
 * <param name="jbpm4Deployprop">需要更新的Jbpm4Deployprop</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int jbpm4DeploypropUpdate(Jbpm4Deployprop jbpm4Deployprop, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
Jbpm4Deployprop jbpm4DeploypropSelectByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ADeployment"></param>
 */
List<Jbpm4Deployprop> jbpm4DeploypropSelectObjectsByDeployment(Double ADeployment) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Deployprop> jbpm4DeploypropSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Jbpm4Deployprop> jbpm4DeploypropSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Deployprop> jbpm4DeploypropSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Jbpm4Deployprop> jbpm4DeploypropSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Jbpm4Deployprop jbpm4DeploypropSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Deployprop> jbpm4DeploypropSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Jbpm4Deployprop> jbpm4DeploypropSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Jbpm4Deployprop jbpm4DeploypropSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="jbpm4DeploypropQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Deployprop> jbpm4DeploypropSelectObjects(ConditionQuery jbpm4DeploypropQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="jbpm4DeploypropQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Jbpm4Deployprop> jbpm4DeploypropSelectObjects(ConditionQuery jbpm4DeploypropQueryCondition) throws SQLException, DbException;

/**
 * <param name="jbpm4DeploypropQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Jbpm4Deployprop jbpm4DeploypropSelectSingleObject(ConditionQuery jbpm4DeploypropQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Deployprop> List<T> jbpm4DeploypropSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4Deployprop> List<T> jbpm4DeploypropSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4Deployprop> T jbpm4DeploypropSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Deployprop> List<T> jbpm4DeploypropSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4Deployprop> List<T> jbpm4DeploypropSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4Deployprop> T jbpm4DeploypropSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4DeploypropQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Deployprop> List<T> jbpm4DeploypropSelectObjects(Class<T> type, ConditionQuery jbpm4DeploypropQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4DeploypropQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4Deployprop> List<T> jbpm4DeploypropSelectObjects(Class<T> type, ConditionQuery jbpm4DeploypropQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4DeploypropQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4Deployprop> T jbpm4DeploypropSelectSingleObject(Class<T> type, ConditionQuery jbpm4DeploypropQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int jbpm4DeploypropQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="jbpm4DeploypropQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int jbpm4DeploypropQuerySelectObjectsCount(ConditionQuery jbpm4DeploypropQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象CodeBuildProperty到数据库中
 * <param name="codeBuildProperty">需要插入的新对象</param>
 */
void codeBuildPropertyInsert(CodeBuildProperty codeBuildProperty) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象CodeBuildProperty
 * <param name="ABuildPropertyId">属性标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void codeBuildPropertyDeleteByBuildPropertyId(int ABuildPropertyId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象CodeBuildProperty
 * <param name="ABuildPropertyId">属性标识</param>
 */
void codeBuildPropertyDeleteByBuildPropertyId(int ABuildPropertyId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象CodeBuildProperty
 * <param name="ABuildId">构建标识</param>
 */
void codeBuildPropertyDeleteListByBuildId(int ABuildId) throws SQLException, DbException;

/**
 * 更新一个对象CodeBuildProperty到数据库中
 * <param name="codeBuildProperty">需要更新的CodeBuildProperty</param>
 */
int codeBuildPropertyUpdate(CodeBuildProperty codeBuildProperty) throws SQLException, DbException;

/**
 * 更新一个对象CodeBuildProperty到数据库中
 * <param name="codeBuildProperty">需要更新的CodeBuildProperty</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int codeBuildPropertyUpdate(CodeBuildProperty codeBuildProperty, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ABuildPropertyId">属性标识</param>
 */
CodeBuildProperty codeBuildPropertySelectByBuildPropertyId(int ABuildPropertyId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ABuildId">构建标识</param>
 */
List<CodeBuildProperty> codeBuildPropertySelectObjectsByBuildId(int ABuildId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<CodeBuildProperty> codeBuildPropertySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<CodeBuildProperty> codeBuildPropertySelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<CodeBuildProperty> codeBuildPropertySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<CodeBuildProperty> codeBuildPropertySelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
CodeBuildProperty codeBuildPropertySelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<CodeBuildProperty> codeBuildPropertySelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<CodeBuildProperty> codeBuildPropertySelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
CodeBuildProperty codeBuildPropertySelectSingleObject() throws SQLException, DbException;

/**
 * <param name="codeBuildPropertyQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<CodeBuildProperty> codeBuildPropertySelectObjects(ConditionQuery codeBuildPropertyQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="codeBuildPropertyQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<CodeBuildProperty> codeBuildPropertySelectObjects(ConditionQuery codeBuildPropertyQueryCondition) throws SQLException, DbException;

/**
 * <param name="codeBuildPropertyQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
CodeBuildProperty codeBuildPropertySelectSingleObject(ConditionQuery codeBuildPropertyQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends CodeBuildProperty> List<T> codeBuildPropertySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends CodeBuildProperty> List<T> codeBuildPropertySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends CodeBuildProperty> T codeBuildPropertySelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends CodeBuildProperty> List<T> codeBuildPropertySelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends CodeBuildProperty> List<T> codeBuildPropertySelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends CodeBuildProperty> T codeBuildPropertySelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="codeBuildPropertyQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends CodeBuildProperty> List<T> codeBuildPropertySelectObjects(Class<T> type, ConditionQuery codeBuildPropertyQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="codeBuildPropertyQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends CodeBuildProperty> List<T> codeBuildPropertySelectObjects(Class<T> type, ConditionQuery codeBuildPropertyQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="codeBuildPropertyQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends CodeBuildProperty> T codeBuildPropertySelectSingleObject(Class<T> type, ConditionQuery codeBuildPropertyQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int codeBuildPropertyQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="codeBuildPropertyQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int codeBuildPropertyQuerySelectObjectsCount(ConditionQuery codeBuildPropertyQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Jbpm4Execution到数据库中
 * <param name="jbpm4Execution">需要插入的新对象</param>
 */
void jbpm4ExecutionInsert(Jbpm4Execution jbpm4Execution) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4Execution
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void jbpm4ExecutionDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4Execution
 * <param name="ADbid"></param>
 */
void jbpm4ExecutionDeleteByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4Execution
 * <param name="AId"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void jbpm4ExecutionDeleteById(String AId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4Execution
 * <param name="AId"></param>
 */
void jbpm4ExecutionDeleteById(String AId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4Execution
 * <param name="ASubprocinst"></param>
 */
void jbpm4ExecutionDeleteListBySubprocinst(Double ASubprocinst) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4Execution
 * <param name="AInstance"></param>
 */
void jbpm4ExecutionDeleteListByInstance(Double AInstance) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4Execution
 * <param name="ASuperexec"></param>
 */
void jbpm4ExecutionDeleteListBySuperexec(Double ASuperexec) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4Execution
 * <param name="AParent"></param>
 */
void jbpm4ExecutionDeleteListByParent(Double AParent) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4Execution到数据库中
 * <param name="jbpm4Execution">需要更新的Jbpm4Execution</param>
 */
int jbpm4ExecutionUpdate(Jbpm4Execution jbpm4Execution) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4Execution到数据库中
 * <param name="jbpm4Execution">需要更新的Jbpm4Execution</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int jbpm4ExecutionUpdate(Jbpm4Execution jbpm4Execution, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
Jbpm4Execution jbpm4ExecutionSelectByDbid(double ADbid) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AId"></param>
 */
Jbpm4Execution jbpm4ExecutionSelectById(String AId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ASubprocinst"></param>
 */
List<Jbpm4Execution> jbpm4ExecutionSelectObjectsBySubprocinst(Double ASubprocinst) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AInstance"></param>
 */
List<Jbpm4Execution> jbpm4ExecutionSelectObjectsByInstance(Double AInstance) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ASuperexec"></param>
 */
List<Jbpm4Execution> jbpm4ExecutionSelectObjectsBySuperexec(Double ASuperexec) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AParent"></param>
 */
List<Jbpm4Execution> jbpm4ExecutionSelectObjectsByParent(Double AParent) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Execution> jbpm4ExecutionSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Jbpm4Execution> jbpm4ExecutionSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Execution> jbpm4ExecutionSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Jbpm4Execution> jbpm4ExecutionSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Jbpm4Execution jbpm4ExecutionSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Execution> jbpm4ExecutionSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Jbpm4Execution> jbpm4ExecutionSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Jbpm4Execution jbpm4ExecutionSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="jbpm4ExecutionQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Execution> jbpm4ExecutionSelectObjects(ConditionQuery jbpm4ExecutionQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="jbpm4ExecutionQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Jbpm4Execution> jbpm4ExecutionSelectObjects(ConditionQuery jbpm4ExecutionQueryCondition) throws SQLException, DbException;

/**
 * <param name="jbpm4ExecutionQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Jbpm4Execution jbpm4ExecutionSelectSingleObject(ConditionQuery jbpm4ExecutionQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Execution> List<T> jbpm4ExecutionSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4Execution> List<T> jbpm4ExecutionSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4Execution> T jbpm4ExecutionSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Execution> List<T> jbpm4ExecutionSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4Execution> List<T> jbpm4ExecutionSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4Execution> T jbpm4ExecutionSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4ExecutionQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Execution> List<T> jbpm4ExecutionSelectObjects(Class<T> type, ConditionQuery jbpm4ExecutionQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4ExecutionQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4Execution> List<T> jbpm4ExecutionSelectObjects(Class<T> type, ConditionQuery jbpm4ExecutionQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4ExecutionQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4Execution> T jbpm4ExecutionSelectSingleObject(Class<T> type, ConditionQuery jbpm4ExecutionQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int jbpm4ExecutionQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="jbpm4ExecutionQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int jbpm4ExecutionQuerySelectObjectsCount(ConditionQuery jbpm4ExecutionQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象CodeBuildProcedure到数据库中
 * <param name="codeBuildProcedure">需要插入的新对象</param>
 */
void codeBuildProcedureInsert(CodeBuildProcedure codeBuildProcedure) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象CodeBuildProcedure
 * <param name="ABuildProcedureId">构建过程标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void codeBuildProcedureDeleteByBuildProcedureId(int ABuildProcedureId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象CodeBuildProcedure
 * <param name="ABuildProcedureId">构建过程标识</param>
 */
void codeBuildProcedureDeleteByBuildProcedureId(int ABuildProcedureId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象CodeBuildProcedure
 * <param name="ABuildId">构建标识</param>
 */
void codeBuildProcedureDeleteListByBuildId(int ABuildId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象CodeBuildProcedure
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
void codeBuildProcedureDeleteListByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException;

/**
 * 更新一个对象CodeBuildProcedure到数据库中
 * <param name="codeBuildProcedure">需要更新的CodeBuildProcedure</param>
 */
int codeBuildProcedureUpdate(CodeBuildProcedure codeBuildProcedure) throws SQLException, DbException;

/**
 * 更新一个对象CodeBuildProcedure到数据库中
 * <param name="codeBuildProcedure">需要更新的CodeBuildProcedure</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int codeBuildProcedureUpdate(CodeBuildProcedure codeBuildProcedure, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ABuildProcedureId">构建过程标识</param>
 */
CodeBuildProcedure codeBuildProcedureSelectByBuildProcedureId(int ABuildProcedureId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ABuildId">构建标识</param>
 */
List<CodeBuildProcedure> codeBuildProcedureSelectObjectsByBuildId(int ABuildId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
List<CodeBuildProcedure> codeBuildProcedureSelectObjectsByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<CodeBuildProcedure> codeBuildProcedureSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<CodeBuildProcedure> codeBuildProcedureSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<CodeBuildProcedure> codeBuildProcedureSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<CodeBuildProcedure> codeBuildProcedureSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
CodeBuildProcedure codeBuildProcedureSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<CodeBuildProcedure> codeBuildProcedureSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<CodeBuildProcedure> codeBuildProcedureSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
CodeBuildProcedure codeBuildProcedureSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="codeBuildProcedureQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<CodeBuildProcedure> codeBuildProcedureSelectObjects(ConditionQuery codeBuildProcedureQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="codeBuildProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<CodeBuildProcedure> codeBuildProcedureSelectObjects(ConditionQuery codeBuildProcedureQueryCondition) throws SQLException, DbException;

/**
 * <param name="codeBuildProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
CodeBuildProcedure codeBuildProcedureSelectSingleObject(ConditionQuery codeBuildProcedureQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends CodeBuildProcedure> List<T> codeBuildProcedureSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends CodeBuildProcedure> List<T> codeBuildProcedureSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends CodeBuildProcedure> T codeBuildProcedureSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends CodeBuildProcedure> List<T> codeBuildProcedureSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends CodeBuildProcedure> List<T> codeBuildProcedureSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends CodeBuildProcedure> T codeBuildProcedureSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="codeBuildProcedureQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends CodeBuildProcedure> List<T> codeBuildProcedureSelectObjects(Class<T> type, ConditionQuery codeBuildProcedureQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="codeBuildProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends CodeBuildProcedure> List<T> codeBuildProcedureSelectObjects(Class<T> type, ConditionQuery codeBuildProcedureQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="codeBuildProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends CodeBuildProcedure> T codeBuildProcedureSelectSingleObject(Class<T> type, ConditionQuery codeBuildProcedureQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int codeBuildProcedureQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="codeBuildProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int codeBuildProcedureQuerySelectObjectsCount(ConditionQuery codeBuildProcedureQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Jbpm4HistActinst到数据库中
 * <param name="jbpm4HistActinst">需要插入的新对象</param>
 */
void jbpm4HistActinstInsert(Jbpm4HistActinst jbpm4HistActinst) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4HistActinst
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void jbpm4HistActinstDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4HistActinst
 * <param name="ADbid"></param>
 */
void jbpm4HistActinstDeleteByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4HistActinst
 * <param name="AHproci"></param>
 */
void jbpm4HistActinstDeleteListByHproci(Double AHproci) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4HistActinst
 * <param name="AHtask"></param>
 */
void jbpm4HistActinstDeleteListByHtask(Double AHtask) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4HistActinst到数据库中
 * <param name="jbpm4HistActinst">需要更新的Jbpm4HistActinst</param>
 */
int jbpm4HistActinstUpdate(Jbpm4HistActinst jbpm4HistActinst) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4HistActinst到数据库中
 * <param name="jbpm4HistActinst">需要更新的Jbpm4HistActinst</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int jbpm4HistActinstUpdate(Jbpm4HistActinst jbpm4HistActinst, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
Jbpm4HistActinst jbpm4HistActinstSelectByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHproci"></param>
 */
List<Jbpm4HistActinst> jbpm4HistActinstSelectObjectsByHproci(Double AHproci) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHtask"></param>
 */
List<Jbpm4HistActinst> jbpm4HistActinstSelectObjectsByHtask(Double AHtask) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4HistActinst> jbpm4HistActinstSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Jbpm4HistActinst> jbpm4HistActinstSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4HistActinst> jbpm4HistActinstSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Jbpm4HistActinst> jbpm4HistActinstSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Jbpm4HistActinst jbpm4HistActinstSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4HistActinst> jbpm4HistActinstSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Jbpm4HistActinst> jbpm4HistActinstSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Jbpm4HistActinst jbpm4HistActinstSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="jbpm4HistActinstQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4HistActinst> jbpm4HistActinstSelectObjects(ConditionQuery jbpm4HistActinstQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="jbpm4HistActinstQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Jbpm4HistActinst> jbpm4HistActinstSelectObjects(ConditionQuery jbpm4HistActinstQueryCondition) throws SQLException, DbException;

/**
 * <param name="jbpm4HistActinstQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Jbpm4HistActinst jbpm4HistActinstSelectSingleObject(ConditionQuery jbpm4HistActinstQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4HistActinst> List<T> jbpm4HistActinstSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4HistActinst> List<T> jbpm4HistActinstSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4HistActinst> T jbpm4HistActinstSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4HistActinst> List<T> jbpm4HistActinstSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4HistActinst> List<T> jbpm4HistActinstSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4HistActinst> T jbpm4HistActinstSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4HistActinstQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4HistActinst> List<T> jbpm4HistActinstSelectObjects(Class<T> type, ConditionQuery jbpm4HistActinstQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4HistActinstQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4HistActinst> List<T> jbpm4HistActinstSelectObjects(Class<T> type, ConditionQuery jbpm4HistActinstQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4HistActinstQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4HistActinst> T jbpm4HistActinstSelectSingleObject(Class<T> type, ConditionQuery jbpm4HistActinstQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int jbpm4HistActinstQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="jbpm4HistActinstQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int jbpm4HistActinstQuerySelectObjectsCount(ConditionQuery jbpm4HistActinstQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象IssueUserDefaultQuery到数据库中
 * <param name="issueUserDefaultQuery">需要插入的新对象</param>
 */
void issueUserDefaultQueryInsert(IssueUserDefaultQuery issueUserDefaultQuery) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueUserDefaultQuery
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void issueUserDefaultQueryDeleteByIssueProjectIdIssueUserId(int AIssueProjectId, int AIssueUserId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueUserDefaultQuery
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 */
void issueUserDefaultQueryDeleteByIssueProjectIdIssueUserId(int AIssueProjectId, int AIssueUserId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象IssueUserDefaultQuery
 * <param name="AIssueProjectId">标识</param>
 */
void issueUserDefaultQueryDeleteListByIssueProjectId(int AIssueProjectId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象IssueUserDefaultQuery
 * <param name="AIssueQueryId">标识</param>
 */
void issueUserDefaultQueryDeleteListByIssueQueryId(int AIssueQueryId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象IssueUserDefaultQuery
 * <param name="AIssueUserId">用户标识</param>
 */
void issueUserDefaultQueryDeleteListByIssueUserId(int AIssueUserId) throws SQLException, DbException;

/**
 * 更新一个对象IssueUserDefaultQuery到数据库中
 * <param name="issueUserDefaultQuery">需要更新的IssueUserDefaultQuery</param>
 */
int issueUserDefaultQueryUpdate(IssueUserDefaultQuery issueUserDefaultQuery) throws SQLException, DbException;

/**
 * 更新一个对象IssueUserDefaultQuery到数据库中
 * <param name="issueUserDefaultQuery">需要更新的IssueUserDefaultQuery</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int issueUserDefaultQueryUpdate(IssueUserDefaultQuery issueUserDefaultQuery, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 */
IssueUserDefaultQuery issueUserDefaultQuerySelectByIssueProjectIdIssueUserId(int AIssueProjectId, int AIssueUserId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectId">标识</param>
 */
List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjectsByIssueProjectId(int AIssueProjectId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueQueryId">标识</param>
 */
List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjectsByIssueQueryId(int AIssueQueryId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueUserId">用户标识</param>
 */
List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjectsByIssueUserId(int AIssueUserId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
IssueUserDefaultQuery issueUserDefaultQuerySelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
IssueUserDefaultQuery issueUserDefaultQuerySelectSingleObject() throws SQLException, DbException;

/**
 * <param name="issueUserDefaultQueryQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjects(ConditionQuery issueUserDefaultQueryQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="issueUserDefaultQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<IssueUserDefaultQuery> issueUserDefaultQuerySelectObjects(ConditionQuery issueUserDefaultQueryQueryCondition) throws SQLException, DbException;

/**
 * <param name="issueUserDefaultQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
IssueUserDefaultQuery issueUserDefaultQuerySelectSingleObject(ConditionQuery issueUserDefaultQueryQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueUserDefaultQuery> List<T> issueUserDefaultQuerySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueUserDefaultQuery> List<T> issueUserDefaultQuerySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueUserDefaultQuery> T issueUserDefaultQuerySelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueUserDefaultQuery> List<T> issueUserDefaultQuerySelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueUserDefaultQuery> List<T> issueUserDefaultQuerySelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueUserDefaultQuery> T issueUserDefaultQuerySelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueUserDefaultQueryQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueUserDefaultQuery> List<T> issueUserDefaultQuerySelectObjects(Class<T> type, ConditionQuery issueUserDefaultQueryQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueUserDefaultQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueUserDefaultQuery> List<T> issueUserDefaultQuerySelectObjects(Class<T> type, ConditionQuery issueUserDefaultQueryQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueUserDefaultQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueUserDefaultQuery> T issueUserDefaultQuerySelectSingleObject(Class<T> type, ConditionQuery issueUserDefaultQueryQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int issueUserDefaultQueryQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="issueUserDefaultQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int issueUserDefaultQueryQuerySelectObjectsCount(ConditionQuery issueUserDefaultQueryQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Jbpm4HistDetail到数据库中
 * <param name="jbpm4HistDetail">需要插入的新对象</param>
 */
void jbpm4HistDetailInsert(Jbpm4HistDetail jbpm4HistDetail) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4HistDetail
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void jbpm4HistDetailDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4HistDetail
 * <param name="ADbid"></param>
 */
void jbpm4HistDetailDeleteByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4HistDetail
 * <param name="AHacti"></param>
 */
void jbpm4HistDetailDeleteListByHacti(Double AHacti) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4HistDetail
 * <param name="AHproci"></param>
 */
void jbpm4HistDetailDeleteListByHproci(Double AHproci) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4HistDetail
 * <param name="AHtask"></param>
 */
void jbpm4HistDetailDeleteListByHtask(Double AHtask) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4HistDetail
 * <param name="AHvar"></param>
 */
void jbpm4HistDetailDeleteListByHvar(Double AHvar) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4HistDetail到数据库中
 * <param name="jbpm4HistDetail">需要更新的Jbpm4HistDetail</param>
 */
int jbpm4HistDetailUpdate(Jbpm4HistDetail jbpm4HistDetail) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4HistDetail到数据库中
 * <param name="jbpm4HistDetail">需要更新的Jbpm4HistDetail</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int jbpm4HistDetailUpdate(Jbpm4HistDetail jbpm4HistDetail, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
Jbpm4HistDetail jbpm4HistDetailSelectByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHacti"></param>
 */
List<Jbpm4HistDetail> jbpm4HistDetailSelectObjectsByHacti(Double AHacti) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHproci"></param>
 */
List<Jbpm4HistDetail> jbpm4HistDetailSelectObjectsByHproci(Double AHproci) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHtask"></param>
 */
List<Jbpm4HistDetail> jbpm4HistDetailSelectObjectsByHtask(Double AHtask) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHvar"></param>
 */
List<Jbpm4HistDetail> jbpm4HistDetailSelectObjectsByHvar(Double AHvar) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4HistDetail> jbpm4HistDetailSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Jbpm4HistDetail> jbpm4HistDetailSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4HistDetail> jbpm4HistDetailSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Jbpm4HistDetail> jbpm4HistDetailSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Jbpm4HistDetail jbpm4HistDetailSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4HistDetail> jbpm4HistDetailSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Jbpm4HistDetail> jbpm4HistDetailSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Jbpm4HistDetail jbpm4HistDetailSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="jbpm4HistDetailQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4HistDetail> jbpm4HistDetailSelectObjects(ConditionQuery jbpm4HistDetailQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="jbpm4HistDetailQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Jbpm4HistDetail> jbpm4HistDetailSelectObjects(ConditionQuery jbpm4HistDetailQueryCondition) throws SQLException, DbException;

/**
 * <param name="jbpm4HistDetailQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Jbpm4HistDetail jbpm4HistDetailSelectSingleObject(ConditionQuery jbpm4HistDetailQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4HistDetail> List<T> jbpm4HistDetailSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4HistDetail> List<T> jbpm4HistDetailSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4HistDetail> T jbpm4HistDetailSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4HistDetail> List<T> jbpm4HistDetailSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4HistDetail> List<T> jbpm4HistDetailSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4HistDetail> T jbpm4HistDetailSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4HistDetailQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4HistDetail> List<T> jbpm4HistDetailSelectObjects(Class<T> type, ConditionQuery jbpm4HistDetailQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4HistDetailQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4HistDetail> List<T> jbpm4HistDetailSelectObjects(Class<T> type, ConditionQuery jbpm4HistDetailQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4HistDetailQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4HistDetail> T jbpm4HistDetailSelectSingleObject(Class<T> type, ConditionQuery jbpm4HistDetailQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int jbpm4HistDetailQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="jbpm4HistDetailQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int jbpm4HistDetailQuerySelectObjectsCount(ConditionQuery jbpm4HistDetailQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Jbpm4HistProcinst到数据库中
 * <param name="jbpm4HistProcinst">需要插入的新对象</param>
 */
void jbpm4HistProcinstInsert(Jbpm4HistProcinst jbpm4HistProcinst) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4HistProcinst
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void jbpm4HistProcinstDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4HistProcinst
 * <param name="ADbid"></param>
 */
void jbpm4HistProcinstDeleteByDbid(double ADbid) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4HistProcinst到数据库中
 * <param name="jbpm4HistProcinst">需要更新的Jbpm4HistProcinst</param>
 */
int jbpm4HistProcinstUpdate(Jbpm4HistProcinst jbpm4HistProcinst) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4HistProcinst到数据库中
 * <param name="jbpm4HistProcinst">需要更新的Jbpm4HistProcinst</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int jbpm4HistProcinstUpdate(Jbpm4HistProcinst jbpm4HistProcinst, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
Jbpm4HistProcinst jbpm4HistProcinstSelectByDbid(double ADbid) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4HistProcinst> jbpm4HistProcinstSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Jbpm4HistProcinst> jbpm4HistProcinstSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4HistProcinst> jbpm4HistProcinstSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Jbpm4HistProcinst> jbpm4HistProcinstSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Jbpm4HistProcinst jbpm4HistProcinstSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4HistProcinst> jbpm4HistProcinstSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Jbpm4HistProcinst> jbpm4HistProcinstSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Jbpm4HistProcinst jbpm4HistProcinstSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="jbpm4HistProcinstQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4HistProcinst> jbpm4HistProcinstSelectObjects(ConditionQuery jbpm4HistProcinstQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="jbpm4HistProcinstQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Jbpm4HistProcinst> jbpm4HistProcinstSelectObjects(ConditionQuery jbpm4HistProcinstQueryCondition) throws SQLException, DbException;

/**
 * <param name="jbpm4HistProcinstQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Jbpm4HistProcinst jbpm4HistProcinstSelectSingleObject(ConditionQuery jbpm4HistProcinstQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4HistProcinst> List<T> jbpm4HistProcinstSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4HistProcinst> List<T> jbpm4HistProcinstSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4HistProcinst> T jbpm4HistProcinstSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4HistProcinst> List<T> jbpm4HistProcinstSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4HistProcinst> List<T> jbpm4HistProcinstSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4HistProcinst> T jbpm4HistProcinstSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4HistProcinstQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4HistProcinst> List<T> jbpm4HistProcinstSelectObjects(Class<T> type, ConditionQuery jbpm4HistProcinstQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4HistProcinstQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4HistProcinst> List<T> jbpm4HistProcinstSelectObjects(Class<T> type, ConditionQuery jbpm4HistProcinstQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4HistProcinstQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4HistProcinst> T jbpm4HistProcinstSelectSingleObject(Class<T> type, ConditionQuery jbpm4HistProcinstQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int jbpm4HistProcinstQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="jbpm4HistProcinstQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int jbpm4HistProcinstQuerySelectObjectsCount(ConditionQuery jbpm4HistProcinstQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Jbpm4HistTask到数据库中
 * <param name="jbpm4HistTask">需要插入的新对象</param>
 */
void jbpm4HistTaskInsert(Jbpm4HistTask jbpm4HistTask) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4HistTask
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void jbpm4HistTaskDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4HistTask
 * <param name="ADbid"></param>
 */
void jbpm4HistTaskDeleteByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4HistTask
 * <param name="ASupertask"></param>
 */
void jbpm4HistTaskDeleteListBySupertask(Double ASupertask) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4HistTask到数据库中
 * <param name="jbpm4HistTask">需要更新的Jbpm4HistTask</param>
 */
int jbpm4HistTaskUpdate(Jbpm4HistTask jbpm4HistTask) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4HistTask到数据库中
 * <param name="jbpm4HistTask">需要更新的Jbpm4HistTask</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int jbpm4HistTaskUpdate(Jbpm4HistTask jbpm4HistTask, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
Jbpm4HistTask jbpm4HistTaskSelectByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ASupertask"></param>
 */
List<Jbpm4HistTask> jbpm4HistTaskSelectObjectsBySupertask(Double ASupertask) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4HistTask> jbpm4HistTaskSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Jbpm4HistTask> jbpm4HistTaskSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4HistTask> jbpm4HistTaskSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Jbpm4HistTask> jbpm4HistTaskSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Jbpm4HistTask jbpm4HistTaskSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4HistTask> jbpm4HistTaskSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Jbpm4HistTask> jbpm4HistTaskSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Jbpm4HistTask jbpm4HistTaskSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="jbpm4HistTaskQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4HistTask> jbpm4HistTaskSelectObjects(ConditionQuery jbpm4HistTaskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="jbpm4HistTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Jbpm4HistTask> jbpm4HistTaskSelectObjects(ConditionQuery jbpm4HistTaskQueryCondition) throws SQLException, DbException;

/**
 * <param name="jbpm4HistTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Jbpm4HistTask jbpm4HistTaskSelectSingleObject(ConditionQuery jbpm4HistTaskQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4HistTask> List<T> jbpm4HistTaskSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4HistTask> List<T> jbpm4HistTaskSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4HistTask> T jbpm4HistTaskSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4HistTask> List<T> jbpm4HistTaskSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4HistTask> List<T> jbpm4HistTaskSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4HistTask> T jbpm4HistTaskSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4HistTaskQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4HistTask> List<T> jbpm4HistTaskSelectObjects(Class<T> type, ConditionQuery jbpm4HistTaskQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4HistTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4HistTask> List<T> jbpm4HistTaskSelectObjects(Class<T> type, ConditionQuery jbpm4HistTaskQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4HistTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4HistTask> T jbpm4HistTaskSelectSingleObject(Class<T> type, ConditionQuery jbpm4HistTaskQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int jbpm4HistTaskQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="jbpm4HistTaskQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int jbpm4HistTaskQuerySelectObjectsCount(ConditionQuery jbpm4HistTaskQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象IssueRoleDefaultQuery到数据库中
 * <param name="issueRoleDefaultQuery">需要插入的新对象</param>
 */
void issueRoleDefaultQueryInsert(IssueRoleDefaultQuery issueRoleDefaultQuery) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueRoleDefaultQuery
 * <param name="AIssueProjectId">标识</param>
 * <param name="ARoleId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void issueRoleDefaultQueryDeleteByIssueProjectIdRoleId(int AIssueProjectId, int ARoleId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueRoleDefaultQuery
 * <param name="AIssueProjectId">标识</param>
 * <param name="ARoleId">标识</param>
 */
void issueRoleDefaultQueryDeleteByIssueProjectIdRoleId(int AIssueProjectId, int ARoleId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象IssueRoleDefaultQuery
 * <param name="AIssueProjectId">标识</param>
 */
void issueRoleDefaultQueryDeleteListByIssueProjectId(int AIssueProjectId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象IssueRoleDefaultQuery
 * <param name="AIssueQueryId">标识</param>
 */
void issueRoleDefaultQueryDeleteListByIssueQueryId(int AIssueQueryId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象IssueRoleDefaultQuery
 * <param name="ARoleId">标识</param>
 */
void issueRoleDefaultQueryDeleteListByRoleId(int ARoleId) throws SQLException, DbException;

/**
 * 更新一个对象IssueRoleDefaultQuery到数据库中
 * <param name="issueRoleDefaultQuery">需要更新的IssueRoleDefaultQuery</param>
 */
int issueRoleDefaultQueryUpdate(IssueRoleDefaultQuery issueRoleDefaultQuery) throws SQLException, DbException;

/**
 * 更新一个对象IssueRoleDefaultQuery到数据库中
 * <param name="issueRoleDefaultQuery">需要更新的IssueRoleDefaultQuery</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int issueRoleDefaultQueryUpdate(IssueRoleDefaultQuery issueRoleDefaultQuery, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueProjectId">标识</param>
 * <param name="ARoleId">标识</param>
 */
IssueRoleDefaultQuery issueRoleDefaultQuerySelectByIssueProjectIdRoleId(int AIssueProjectId, int ARoleId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectId">标识</param>
 */
List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjectsByIssueProjectId(int AIssueProjectId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueQueryId">标识</param>
 */
List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjectsByIssueQueryId(int AIssueQueryId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ARoleId">标识</param>
 */
List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjectsByRoleId(int ARoleId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
IssueRoleDefaultQuery issueRoleDefaultQuerySelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
IssueRoleDefaultQuery issueRoleDefaultQuerySelectSingleObject() throws SQLException, DbException;

/**
 * <param name="issueRoleDefaultQueryQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjects(ConditionQuery issueRoleDefaultQueryQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="issueRoleDefaultQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<IssueRoleDefaultQuery> issueRoleDefaultQuerySelectObjects(ConditionQuery issueRoleDefaultQueryQueryCondition) throws SQLException, DbException;

/**
 * <param name="issueRoleDefaultQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
IssueRoleDefaultQuery issueRoleDefaultQuerySelectSingleObject(ConditionQuery issueRoleDefaultQueryQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueRoleDefaultQuery> List<T> issueRoleDefaultQuerySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueRoleDefaultQuery> List<T> issueRoleDefaultQuerySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueRoleDefaultQuery> T issueRoleDefaultQuerySelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueRoleDefaultQuery> List<T> issueRoleDefaultQuerySelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueRoleDefaultQuery> List<T> issueRoleDefaultQuerySelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueRoleDefaultQuery> T issueRoleDefaultQuerySelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueRoleDefaultQueryQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueRoleDefaultQuery> List<T> issueRoleDefaultQuerySelectObjects(Class<T> type, ConditionQuery issueRoleDefaultQueryQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueRoleDefaultQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueRoleDefaultQuery> List<T> issueRoleDefaultQuerySelectObjects(Class<T> type, ConditionQuery issueRoleDefaultQueryQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueRoleDefaultQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueRoleDefaultQuery> T issueRoleDefaultQuerySelectSingleObject(Class<T> type, ConditionQuery issueRoleDefaultQueryQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int issueRoleDefaultQueryQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="issueRoleDefaultQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int issueRoleDefaultQueryQuerySelectObjectsCount(ConditionQuery issueRoleDefaultQueryQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Jbpm4HistVar到数据库中
 * <param name="jbpm4HistVar">需要插入的新对象</param>
 */
void jbpm4HistVarInsert(Jbpm4HistVar jbpm4HistVar) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4HistVar
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void jbpm4HistVarDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4HistVar
 * <param name="ADbid"></param>
 */
void jbpm4HistVarDeleteByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4HistVar
 * <param name="AHproci"></param>
 */
void jbpm4HistVarDeleteListByHproci(Double AHproci) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4HistVar
 * <param name="AHtask"></param>
 */
void jbpm4HistVarDeleteListByHtask(Double AHtask) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4HistVar到数据库中
 * <param name="jbpm4HistVar">需要更新的Jbpm4HistVar</param>
 */
int jbpm4HistVarUpdate(Jbpm4HistVar jbpm4HistVar) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4HistVar到数据库中
 * <param name="jbpm4HistVar">需要更新的Jbpm4HistVar</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int jbpm4HistVarUpdate(Jbpm4HistVar jbpm4HistVar, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
Jbpm4HistVar jbpm4HistVarSelectByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHproci"></param>
 */
List<Jbpm4HistVar> jbpm4HistVarSelectObjectsByHproci(Double AHproci) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AHtask"></param>
 */
List<Jbpm4HistVar> jbpm4HistVarSelectObjectsByHtask(Double AHtask) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4HistVar> jbpm4HistVarSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Jbpm4HistVar> jbpm4HistVarSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4HistVar> jbpm4HistVarSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Jbpm4HistVar> jbpm4HistVarSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Jbpm4HistVar jbpm4HistVarSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4HistVar> jbpm4HistVarSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Jbpm4HistVar> jbpm4HistVarSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Jbpm4HistVar jbpm4HistVarSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="jbpm4HistVarQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4HistVar> jbpm4HistVarSelectObjects(ConditionQuery jbpm4HistVarQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="jbpm4HistVarQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Jbpm4HistVar> jbpm4HistVarSelectObjects(ConditionQuery jbpm4HistVarQueryCondition) throws SQLException, DbException;

/**
 * <param name="jbpm4HistVarQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Jbpm4HistVar jbpm4HistVarSelectSingleObject(ConditionQuery jbpm4HistVarQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4HistVar> List<T> jbpm4HistVarSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4HistVar> List<T> jbpm4HistVarSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4HistVar> T jbpm4HistVarSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4HistVar> List<T> jbpm4HistVarSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4HistVar> List<T> jbpm4HistVarSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4HistVar> T jbpm4HistVarSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4HistVarQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4HistVar> List<T> jbpm4HistVarSelectObjects(Class<T> type, ConditionQuery jbpm4HistVarQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4HistVarQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4HistVar> List<T> jbpm4HistVarSelectObjects(Class<T> type, ConditionQuery jbpm4HistVarQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4HistVarQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4HistVar> T jbpm4HistVarSelectSingleObject(Class<T> type, ConditionQuery jbpm4HistVarQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int jbpm4HistVarQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="jbpm4HistVarQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int jbpm4HistVarQuerySelectObjectsCount(ConditionQuery jbpm4HistVarQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Jbpm4IdGroup到数据库中
 * <param name="jbpm4IdGroup">需要插入的新对象</param>
 */
void jbpm4IdGroupInsert(Jbpm4IdGroup jbpm4IdGroup) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4IdGroup
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void jbpm4IdGroupDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4IdGroup
 * <param name="ADbid"></param>
 */
void jbpm4IdGroupDeleteByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4IdGroup
 * <param name="AParent"></param>
 */
void jbpm4IdGroupDeleteListByParent(Double AParent) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4IdGroup到数据库中
 * <param name="jbpm4IdGroup">需要更新的Jbpm4IdGroup</param>
 */
int jbpm4IdGroupUpdate(Jbpm4IdGroup jbpm4IdGroup) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4IdGroup到数据库中
 * <param name="jbpm4IdGroup">需要更新的Jbpm4IdGroup</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int jbpm4IdGroupUpdate(Jbpm4IdGroup jbpm4IdGroup, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
Jbpm4IdGroup jbpm4IdGroupSelectByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AParent"></param>
 */
List<Jbpm4IdGroup> jbpm4IdGroupSelectObjectsByParent(Double AParent) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4IdGroup> jbpm4IdGroupSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Jbpm4IdGroup> jbpm4IdGroupSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4IdGroup> jbpm4IdGroupSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Jbpm4IdGroup> jbpm4IdGroupSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Jbpm4IdGroup jbpm4IdGroupSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4IdGroup> jbpm4IdGroupSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Jbpm4IdGroup> jbpm4IdGroupSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Jbpm4IdGroup jbpm4IdGroupSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="jbpm4IdGroupQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4IdGroup> jbpm4IdGroupSelectObjects(ConditionQuery jbpm4IdGroupQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="jbpm4IdGroupQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Jbpm4IdGroup> jbpm4IdGroupSelectObjects(ConditionQuery jbpm4IdGroupQueryCondition) throws SQLException, DbException;

/**
 * <param name="jbpm4IdGroupQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Jbpm4IdGroup jbpm4IdGroupSelectSingleObject(ConditionQuery jbpm4IdGroupQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4IdGroup> List<T> jbpm4IdGroupSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4IdGroup> List<T> jbpm4IdGroupSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4IdGroup> T jbpm4IdGroupSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4IdGroup> List<T> jbpm4IdGroupSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4IdGroup> List<T> jbpm4IdGroupSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4IdGroup> T jbpm4IdGroupSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4IdGroupQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4IdGroup> List<T> jbpm4IdGroupSelectObjects(Class<T> type, ConditionQuery jbpm4IdGroupQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4IdGroupQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4IdGroup> List<T> jbpm4IdGroupSelectObjects(Class<T> type, ConditionQuery jbpm4IdGroupQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4IdGroupQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4IdGroup> T jbpm4IdGroupSelectSingleObject(Class<T> type, ConditionQuery jbpm4IdGroupQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int jbpm4IdGroupQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="jbpm4IdGroupQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int jbpm4IdGroupQuerySelectObjectsCount(ConditionQuery jbpm4IdGroupQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象IssueQuery到数据库中
 * <param name="issueQuery">需要插入的新对象</param>
 */
void issueQueryInsert(IssueQuery issueQuery) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueQuery
 * <param name="AIssueQueryId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void issueQueryDeleteByIssueQueryId(int AIssueQueryId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象IssueQuery
 * <param name="AIssueQueryId">标识</param>
 */
void issueQueryDeleteByIssueQueryId(int AIssueQueryId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象IssueQuery
 * <param name="AIssueProjectId">关联项目</param>
 */
void issueQueryDeleteListByIssueProjectId(Integer AIssueProjectId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象IssueQuery
 * <param name="AIssueCreateUserId">创建用户</param>
 */
void issueQueryDeleteListByIssueCreateUserId(int AIssueCreateUserId) throws SQLException, DbException;

/**
 * 更新一个对象IssueQuery到数据库中
 * <param name="issueQuery">需要更新的IssueQuery</param>
 */
int issueQueryUpdate(IssueQuery issueQuery) throws SQLException, DbException;

/**
 * 更新一个对象IssueQuery到数据库中
 * <param name="issueQuery">需要更新的IssueQuery</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int issueQueryUpdate(IssueQuery issueQuery, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AIssueQueryId">标识</param>
 */
IssueQuery issueQuerySelectByIssueQueryId(int AIssueQueryId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueProjectId">关联项目</param>
 */
List<IssueQuery> issueQuerySelectObjectsByIssueProjectId(Integer AIssueProjectId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AIssueCreateUserId">创建用户</param>
 */
List<IssueQuery> issueQuerySelectObjectsByIssueCreateUserId(int AIssueCreateUserId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueQuery> issueQuerySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<IssueQuery> issueQuerySelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueQuery> issueQuerySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<IssueQuery> issueQuerySelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
IssueQuery issueQuerySelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueQuery> issueQuerySelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<IssueQuery> issueQuerySelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
IssueQuery issueQuerySelectSingleObject() throws SQLException, DbException;

/**
 * <param name="issueQueryQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<IssueQuery> issueQuerySelectObjects(ConditionQuery issueQueryQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="issueQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<IssueQuery> issueQuerySelectObjects(ConditionQuery issueQueryQueryCondition) throws SQLException, DbException;

/**
 * <param name="issueQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
IssueQuery issueQuerySelectSingleObject(ConditionQuery issueQueryQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueQuery> List<T> issueQuerySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueQuery> List<T> issueQuerySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends IssueQuery> T issueQuerySelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueQuery> List<T> issueQuerySelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueQuery> List<T> issueQuerySelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends IssueQuery> T issueQuerySelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueQueryQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends IssueQuery> List<T> issueQuerySelectObjects(Class<T> type, ConditionQuery issueQueryQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueQuery> List<T> issueQuerySelectObjects(Class<T> type, ConditionQuery issueQueryQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="issueQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends IssueQuery> T issueQuerySelectSingleObject(Class<T> type, ConditionQuery issueQueryQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int issueQueryQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="issueQueryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int issueQueryQuerySelectObjectsCount(ConditionQuery issueQueryQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Jbpm4IdMembership到数据库中
 * <param name="jbpm4IdMembership">需要插入的新对象</param>
 */
void jbpm4IdMembershipInsert(Jbpm4IdMembership jbpm4IdMembership) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4IdMembership
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void jbpm4IdMembershipDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4IdMembership
 * <param name="ADbid"></param>
 */
void jbpm4IdMembershipDeleteByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4IdMembership
 * <param name="AGroup"></param>
 */
void jbpm4IdMembershipDeleteListByGroup(Double AGroup) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4IdMembership
 * <param name="AUser"></param>
 */
void jbpm4IdMembershipDeleteListByUser(Double AUser) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4IdMembership到数据库中
 * <param name="jbpm4IdMembership">需要更新的Jbpm4IdMembership</param>
 */
int jbpm4IdMembershipUpdate(Jbpm4IdMembership jbpm4IdMembership) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4IdMembership到数据库中
 * <param name="jbpm4IdMembership">需要更新的Jbpm4IdMembership</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int jbpm4IdMembershipUpdate(Jbpm4IdMembership jbpm4IdMembership, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
Jbpm4IdMembership jbpm4IdMembershipSelectByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AGroup"></param>
 */
List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjectsByGroup(Double AGroup) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AUser"></param>
 */
List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjectsByUser(Double AUser) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Jbpm4IdMembership jbpm4IdMembershipSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Jbpm4IdMembership jbpm4IdMembershipSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="jbpm4IdMembershipQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjects(ConditionQuery jbpm4IdMembershipQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="jbpm4IdMembershipQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Jbpm4IdMembership> jbpm4IdMembershipSelectObjects(ConditionQuery jbpm4IdMembershipQueryCondition) throws SQLException, DbException;

/**
 * <param name="jbpm4IdMembershipQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Jbpm4IdMembership jbpm4IdMembershipSelectSingleObject(ConditionQuery jbpm4IdMembershipQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4IdMembership> List<T> jbpm4IdMembershipSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4IdMembership> List<T> jbpm4IdMembershipSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4IdMembership> T jbpm4IdMembershipSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4IdMembership> List<T> jbpm4IdMembershipSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4IdMembership> List<T> jbpm4IdMembershipSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4IdMembership> T jbpm4IdMembershipSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4IdMembershipQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4IdMembership> List<T> jbpm4IdMembershipSelectObjects(Class<T> type, ConditionQuery jbpm4IdMembershipQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4IdMembershipQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4IdMembership> List<T> jbpm4IdMembershipSelectObjects(Class<T> type, ConditionQuery jbpm4IdMembershipQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4IdMembershipQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4IdMembership> T jbpm4IdMembershipSelectSingleObject(Class<T> type, ConditionQuery jbpm4IdMembershipQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int jbpm4IdMembershipQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="jbpm4IdMembershipQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int jbpm4IdMembershipQuerySelectObjectsCount(ConditionQuery jbpm4IdMembershipQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Jbpm4IdUser到数据库中
 * <param name="jbpm4IdUser">需要插入的新对象</param>
 */
void jbpm4IdUserInsert(Jbpm4IdUser jbpm4IdUser) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4IdUser
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void jbpm4IdUserDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4IdUser
 * <param name="ADbid"></param>
 */
void jbpm4IdUserDeleteByDbid(double ADbid) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4IdUser到数据库中
 * <param name="jbpm4IdUser">需要更新的Jbpm4IdUser</param>
 */
int jbpm4IdUserUpdate(Jbpm4IdUser jbpm4IdUser) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4IdUser到数据库中
 * <param name="jbpm4IdUser">需要更新的Jbpm4IdUser</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int jbpm4IdUserUpdate(Jbpm4IdUser jbpm4IdUser, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
Jbpm4IdUser jbpm4IdUserSelectByDbid(double ADbid) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4IdUser> jbpm4IdUserSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Jbpm4IdUser> jbpm4IdUserSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4IdUser> jbpm4IdUserSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Jbpm4IdUser> jbpm4IdUserSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Jbpm4IdUser jbpm4IdUserSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4IdUser> jbpm4IdUserSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Jbpm4IdUser> jbpm4IdUserSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Jbpm4IdUser jbpm4IdUserSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="jbpm4IdUserQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4IdUser> jbpm4IdUserSelectObjects(ConditionQuery jbpm4IdUserQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="jbpm4IdUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Jbpm4IdUser> jbpm4IdUserSelectObjects(ConditionQuery jbpm4IdUserQueryCondition) throws SQLException, DbException;

/**
 * <param name="jbpm4IdUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Jbpm4IdUser jbpm4IdUserSelectSingleObject(ConditionQuery jbpm4IdUserQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4IdUser> List<T> jbpm4IdUserSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4IdUser> List<T> jbpm4IdUserSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4IdUser> T jbpm4IdUserSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4IdUser> List<T> jbpm4IdUserSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4IdUser> List<T> jbpm4IdUserSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4IdUser> T jbpm4IdUserSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4IdUserQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4IdUser> List<T> jbpm4IdUserSelectObjects(Class<T> type, ConditionQuery jbpm4IdUserQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4IdUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4IdUser> List<T> jbpm4IdUserSelectObjects(Class<T> type, ConditionQuery jbpm4IdUserQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4IdUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4IdUser> T jbpm4IdUserSelectSingleObject(Class<T> type, ConditionQuery jbpm4IdUserQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int jbpm4IdUserQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="jbpm4IdUserQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int jbpm4IdUserQuerySelectObjectsCount(ConditionQuery jbpm4IdUserQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Jbpm4Job到数据库中
 * <param name="jbpm4Job">需要插入的新对象</param>
 */
void jbpm4JobInsert(Jbpm4Job jbpm4Job) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4Job
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void jbpm4JobDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4Job
 * <param name="ADbid"></param>
 */
void jbpm4JobDeleteByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4Job
 * <param name="ACfg"></param>
 */
void jbpm4JobDeleteListByCfg(Double ACfg) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4Job到数据库中
 * <param name="jbpm4Job">需要更新的Jbpm4Job</param>
 */
int jbpm4JobUpdate(Jbpm4Job jbpm4Job) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4Job到数据库中
 * <param name="jbpm4Job">需要更新的Jbpm4Job</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int jbpm4JobUpdate(Jbpm4Job jbpm4Job, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
Jbpm4Job jbpm4JobSelectByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ACfg"></param>
 */
List<Jbpm4Job> jbpm4JobSelectObjectsByCfg(Double ACfg) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Job> jbpm4JobSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Jbpm4Job> jbpm4JobSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Job> jbpm4JobSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Jbpm4Job> jbpm4JobSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Jbpm4Job jbpm4JobSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Job> jbpm4JobSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Jbpm4Job> jbpm4JobSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Jbpm4Job jbpm4JobSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="jbpm4JobQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Job> jbpm4JobSelectObjects(ConditionQuery jbpm4JobQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="jbpm4JobQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Jbpm4Job> jbpm4JobSelectObjects(ConditionQuery jbpm4JobQueryCondition) throws SQLException, DbException;

/**
 * <param name="jbpm4JobQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Jbpm4Job jbpm4JobSelectSingleObject(ConditionQuery jbpm4JobQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Job> List<T> jbpm4JobSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4Job> List<T> jbpm4JobSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4Job> T jbpm4JobSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Job> List<T> jbpm4JobSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4Job> List<T> jbpm4JobSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4Job> T jbpm4JobSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4JobQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Job> List<T> jbpm4JobSelectObjects(Class<T> type, ConditionQuery jbpm4JobQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4JobQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4Job> List<T> jbpm4JobSelectObjects(Class<T> type, ConditionQuery jbpm4JobQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4JobQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4Job> T jbpm4JobSelectSingleObject(Class<T> type, ConditionQuery jbpm4JobQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int jbpm4JobQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="jbpm4JobQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int jbpm4JobQuerySelectObjectsCount(ConditionQuery jbpm4JobQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Jbpm4Lob到数据库中
 * <param name="jbpm4Lob">需要插入的新对象</param>
 */
void jbpm4LobInsert(Jbpm4Lob jbpm4Lob) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4Lob
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void jbpm4LobDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4Lob
 * <param name="ADbid"></param>
 */
void jbpm4LobDeleteByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4Lob
 * <param name="ADeployment"></param>
 */
void jbpm4LobDeleteListByDeployment(Double ADeployment) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4Lob到数据库中
 * <param name="jbpm4Lob">需要更新的Jbpm4Lob</param>
 */
int jbpm4LobUpdate(Jbpm4Lob jbpm4Lob) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4Lob到数据库中
 * <param name="jbpm4Lob">需要更新的Jbpm4Lob</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int jbpm4LobUpdate(Jbpm4Lob jbpm4Lob, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
Jbpm4Lob jbpm4LobSelectByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ADeployment"></param>
 */
List<Jbpm4Lob> jbpm4LobSelectObjectsByDeployment(Double ADeployment) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Lob> jbpm4LobSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Jbpm4Lob> jbpm4LobSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Lob> jbpm4LobSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Jbpm4Lob> jbpm4LobSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Jbpm4Lob jbpm4LobSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Lob> jbpm4LobSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Jbpm4Lob> jbpm4LobSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Jbpm4Lob jbpm4LobSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="jbpm4LobQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Lob> jbpm4LobSelectObjects(ConditionQuery jbpm4LobQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="jbpm4LobQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Jbpm4Lob> jbpm4LobSelectObjects(ConditionQuery jbpm4LobQueryCondition) throws SQLException, DbException;

/**
 * <param name="jbpm4LobQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Jbpm4Lob jbpm4LobSelectSingleObject(ConditionQuery jbpm4LobQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Lob> List<T> jbpm4LobSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4Lob> List<T> jbpm4LobSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4Lob> T jbpm4LobSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Lob> List<T> jbpm4LobSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4Lob> List<T> jbpm4LobSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4Lob> T jbpm4LobSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4LobQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Lob> List<T> jbpm4LobSelectObjects(Class<T> type, ConditionQuery jbpm4LobQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4LobQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4Lob> List<T> jbpm4LobSelectObjects(Class<T> type, ConditionQuery jbpm4LobQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4LobQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4Lob> T jbpm4LobSelectSingleObject(Class<T> type, ConditionQuery jbpm4LobQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int jbpm4LobQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="jbpm4LobQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int jbpm4LobQuerySelectObjectsCount(ConditionQuery jbpm4LobQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Jbpm4Participation到数据库中
 * <param name="jbpm4Participation">需要插入的新对象</param>
 */
void jbpm4ParticipationInsert(Jbpm4Participation jbpm4Participation) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4Participation
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void jbpm4ParticipationDeleteByDbid(double ADbid, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4Participation
 * <param name="ADbid"></param>
 */
void jbpm4ParticipationDeleteByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4Participation
 * <param name="ASwimlane"></param>
 */
void jbpm4ParticipationDeleteListBySwimlane(Double ASwimlane) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象Jbpm4Participation
 * <param name="ATask"></param>
 */
void jbpm4ParticipationDeleteListByTask(Double ATask) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4Participation到数据库中
 * <param name="jbpm4Participation">需要更新的Jbpm4Participation</param>
 */
int jbpm4ParticipationUpdate(Jbpm4Participation jbpm4Participation) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4Participation到数据库中
 * <param name="jbpm4Participation">需要更新的Jbpm4Participation</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int jbpm4ParticipationUpdate(Jbpm4Participation jbpm4Participation, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ADbid"></param>
 */
Jbpm4Participation jbpm4ParticipationSelectByDbid(double ADbid) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ASwimlane"></param>
 */
List<Jbpm4Participation> jbpm4ParticipationSelectObjectsBySwimlane(Double ASwimlane) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATask"></param>
 */
List<Jbpm4Participation> jbpm4ParticipationSelectObjectsByTask(Double ATask) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Participation> jbpm4ParticipationSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Jbpm4Participation> jbpm4ParticipationSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Participation> jbpm4ParticipationSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Jbpm4Participation> jbpm4ParticipationSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Jbpm4Participation jbpm4ParticipationSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Participation> jbpm4ParticipationSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Jbpm4Participation> jbpm4ParticipationSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Jbpm4Participation jbpm4ParticipationSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="jbpm4ParticipationQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Participation> jbpm4ParticipationSelectObjects(ConditionQuery jbpm4ParticipationQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="jbpm4ParticipationQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Jbpm4Participation> jbpm4ParticipationSelectObjects(ConditionQuery jbpm4ParticipationQueryCondition) throws SQLException, DbException;

/**
 * <param name="jbpm4ParticipationQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Jbpm4Participation jbpm4ParticipationSelectSingleObject(ConditionQuery jbpm4ParticipationQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Participation> List<T> jbpm4ParticipationSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4Participation> List<T> jbpm4ParticipationSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4Participation> T jbpm4ParticipationSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Participation> List<T> jbpm4ParticipationSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4Participation> List<T> jbpm4ParticipationSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4Participation> T jbpm4ParticipationSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4ParticipationQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Participation> List<T> jbpm4ParticipationSelectObjects(Class<T> type, ConditionQuery jbpm4ParticipationQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4ParticipationQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4Participation> List<T> jbpm4ParticipationSelectObjects(Class<T> type, ConditionQuery jbpm4ParticipationQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4ParticipationQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4Participation> T jbpm4ParticipationSelectSingleObject(Class<T> type, ConditionQuery jbpm4ParticipationQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int jbpm4ParticipationQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="jbpm4ParticipationQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int jbpm4ParticipationQuerySelectObjectsCount(ConditionQuery jbpm4ParticipationQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象Jbpm4Property到数据库中
 * <param name="jbpm4Property">需要插入的新对象</param>
 */
void jbpm4PropertyInsert(Jbpm4Property jbpm4Property) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4Property
 * <param name="AKey"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void jbpm4PropertyDeleteByKey(String AKey, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象Jbpm4Property
 * <param name="AKey"></param>
 */
void jbpm4PropertyDeleteByKey(String AKey) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4Property到数据库中
 * <param name="jbpm4Property">需要更新的Jbpm4Property</param>
 */
int jbpm4PropertyUpdate(Jbpm4Property jbpm4Property) throws SQLException, DbException;

/**
 * 更新一个对象Jbpm4Property到数据库中
 * <param name="jbpm4Property">需要更新的Jbpm4Property</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int jbpm4PropertyUpdate(Jbpm4Property jbpm4Property, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AKey"></param>
 */
Jbpm4Property jbpm4PropertySelectByKey(String AKey) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Property> jbpm4PropertySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<Jbpm4Property> jbpm4PropertySelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Property> jbpm4PropertySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<Jbpm4Property> jbpm4PropertySelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
Jbpm4Property jbpm4PropertySelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Property> jbpm4PropertySelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<Jbpm4Property> jbpm4PropertySelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
Jbpm4Property jbpm4PropertySelectSingleObject() throws SQLException, DbException;

/**
 * <param name="jbpm4PropertyQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<Jbpm4Property> jbpm4PropertySelectObjects(ConditionQuery jbpm4PropertyQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="jbpm4PropertyQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<Jbpm4Property> jbpm4PropertySelectObjects(ConditionQuery jbpm4PropertyQueryCondition) throws SQLException, DbException;

/**
 * <param name="jbpm4PropertyQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
Jbpm4Property jbpm4PropertySelectSingleObject(ConditionQuery jbpm4PropertyQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Property> List<T> jbpm4PropertySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4Property> List<T> jbpm4PropertySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends Jbpm4Property> T jbpm4PropertySelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Property> List<T> jbpm4PropertySelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4Property> List<T> jbpm4PropertySelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends Jbpm4Property> T jbpm4PropertySelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4PropertyQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends Jbpm4Property> List<T> jbpm4PropertySelectObjects(Class<T> type, ConditionQuery jbpm4PropertyQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4PropertyQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4Property> List<T> jbpm4PropertySelectObjects(Class<T> type, ConditionQuery jbpm4PropertyQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="jbpm4PropertyQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends Jbpm4Property> T jbpm4PropertySelectSingleObject(Class<T> type, ConditionQuery jbpm4PropertyQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int jbpm4PropertyQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="jbpm4PropertyQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int jbpm4PropertyQuerySelectObjectsCount(ConditionQuery jbpm4PropertyQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象FundNav到数据库中
 * <param name="fundNav">需要插入的新对象</param>
 */
void fundNavInsert(FundNav fundNav) throws SQLException, DbException;

/**
 * 更新一个对象FundNav到数据库中
 * <param name="fundNav">需要更新的FundNav</param>
 */
int fundNavUpdate(FundNav fundNav) throws SQLException, DbException;

/**
 * 更新一个对象FundNav到数据库中
 * <param name="fundNav">需要更新的FundNav</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int fundNavUpdate(FundNav fundNav, String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<FundNav> fundNavSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<FundNav> fundNavSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<FundNav> fundNavSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<FundNav> fundNavSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
FundNav fundNavSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<FundNav> fundNavSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<FundNav> fundNavSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
FundNav fundNavSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="fundNavQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<FundNav> fundNavSelectObjects(ConditionQuery fundNavQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="fundNavQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<FundNav> fundNavSelectObjects(ConditionQuery fundNavQueryCondition) throws SQLException, DbException;

/**
 * <param name="fundNavQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
FundNav fundNavSelectSingleObject(ConditionQuery fundNavQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends FundNav> List<T> fundNavSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends FundNav> List<T> fundNavSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends FundNav> T fundNavSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends FundNav> List<T> fundNavSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends FundNav> List<T> fundNavSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends FundNav> T fundNavSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="fundNavQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends FundNav> List<T> fundNavSelectObjects(Class<T> type, ConditionQuery fundNavQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="fundNavQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends FundNav> List<T> fundNavSelectObjects(Class<T> type, ConditionQuery fundNavQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="fundNavQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends FundNav> T fundNavSelectSingleObject(Class<T> type, ConditionQuery fundNavQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int fundNavQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="fundNavQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int fundNavQuerySelectObjectsCount(ConditionQuery fundNavQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象FuncTest到数据库中
 * <param name="funcTest">需要插入的新对象</param>
 */
void funcTestInsert(FuncTest funcTest) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象FuncTest
 * <param name="ABuildId">构建标识</param>
 * <param name="AParamId">参数标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void funcTestDeleteByBuildIdParamId(int ABuildId, int AParamId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象FuncTest
 * <param name="ABuildId">构建标识</param>
 * <param name="AParamId">参数标识</param>
 */
void funcTestDeleteByBuildIdParamId(int ABuildId, int AParamId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象FuncTest
 * <param name="ABuildId">构建标识</param>
 */
void funcTestDeleteListByBuildId(int ABuildId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象FuncTest
 * <param name="AParamId">参数标识</param>
 */
void funcTestDeleteListByParamId(int AParamId) throws SQLException, DbException;

/**
 * 更新一个对象FuncTest到数据库中
 * <param name="funcTest">需要更新的FuncTest</param>
 */
int funcTestUpdate(FuncTest funcTest) throws SQLException, DbException;

/**
 * 更新一个对象FuncTest到数据库中
 * <param name="funcTest">需要更新的FuncTest</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int funcTestUpdate(FuncTest funcTest, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ABuildId">构建标识</param>
 * <param name="AParamId">参数标识</param>
 */
FuncTest funcTestSelectByBuildIdParamId(int ABuildId, int AParamId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ABuildId">构建标识</param>
 */
List<FuncTest> funcTestSelectObjectsByBuildId(int ABuildId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AParamId">参数标识</param>
 */
List<FuncTest> funcTestSelectObjectsByParamId(int AParamId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<FuncTest> funcTestSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<FuncTest> funcTestSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<FuncTest> funcTestSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<FuncTest> funcTestSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
FuncTest funcTestSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<FuncTest> funcTestSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<FuncTest> funcTestSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
FuncTest funcTestSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="funcTestQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<FuncTest> funcTestSelectObjects(ConditionQuery funcTestQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="funcTestQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<FuncTest> funcTestSelectObjects(ConditionQuery funcTestQueryCondition) throws SQLException, DbException;

/**
 * <param name="funcTestQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
FuncTest funcTestSelectSingleObject(ConditionQuery funcTestQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends FuncTest> List<T> funcTestSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends FuncTest> List<T> funcTestSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends FuncTest> T funcTestSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends FuncTest> List<T> funcTestSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends FuncTest> List<T> funcTestSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends FuncTest> T funcTestSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="funcTestQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends FuncTest> List<T> funcTestSelectObjects(Class<T> type, ConditionQuery funcTestQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="funcTestQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends FuncTest> List<T> funcTestSelectObjects(Class<T> type, ConditionQuery funcTestQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="funcTestQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends FuncTest> T funcTestSelectSingleObject(Class<T> type, ConditionQuery funcTestQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int funcTestQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="funcTestQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int funcTestQuerySelectObjectsCount(ConditionQuery funcTestQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象TestProcedure到数据库中
 * <param name="testProcedure">需要插入的新对象</param>
 */
void testProcedureInsert(TestProcedure testProcedure) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象TestProcedure
 * <param name="ATestProcedureId">测试过程标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void testProcedureDeleteByTestProcedureId(int ATestProcedureId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象TestProcedure
 * <param name="ATestProcedureId">测试过程标识</param>
 */
void testProcedureDeleteByTestProcedureId(int ATestProcedureId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象TestProcedure
 * <param name="ABuildId">构建标识</param>
 */
void testProcedureDeleteListByBuildId(int ABuildId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象TestProcedure
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
void testProcedureDeleteListByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException;

/**
 * 更新一个对象TestProcedure到数据库中
 * <param name="testProcedure">需要更新的TestProcedure</param>
 */
int testProcedureUpdate(TestProcedure testProcedure) throws SQLException, DbException;

/**
 * 更新一个对象TestProcedure到数据库中
 * <param name="testProcedure">需要更新的TestProcedure</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int testProcedureUpdate(TestProcedure testProcedure, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATestProcedureId">测试过程标识</param>
 */
TestProcedure testProcedureSelectByTestProcedureId(int ATestProcedureId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ABuildId">构建标识</param>
 */
List<TestProcedure> testProcedureSelectObjectsByBuildId(int ABuildId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
List<TestProcedure> testProcedureSelectObjectsByFuncProcedureId(int AFuncProcedureId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TestProcedure> testProcedureSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<TestProcedure> testProcedureSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TestProcedure> testProcedureSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<TestProcedure> testProcedureSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
TestProcedure testProcedureSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TestProcedure> testProcedureSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<TestProcedure> testProcedureSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
TestProcedure testProcedureSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="testProcedureQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TestProcedure> testProcedureSelectObjects(ConditionQuery testProcedureQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="testProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<TestProcedure> testProcedureSelectObjects(ConditionQuery testProcedureQueryCondition) throws SQLException, DbException;

/**
 * <param name="testProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
TestProcedure testProcedureSelectSingleObject(ConditionQuery testProcedureQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TestProcedure> List<T> testProcedureSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends TestProcedure> List<T> testProcedureSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends TestProcedure> T testProcedureSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TestProcedure> List<T> testProcedureSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends TestProcedure> List<T> testProcedureSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends TestProcedure> T testProcedureSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="testProcedureQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TestProcedure> List<T> testProcedureSelectObjects(Class<T> type, ConditionQuery testProcedureQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="testProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends TestProcedure> List<T> testProcedureSelectObjects(Class<T> type, ConditionQuery testProcedureQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="testProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends TestProcedure> T testProcedureSelectSingleObject(Class<T> type, ConditionQuery testProcedureQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int testProcedureQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="testProcedureQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int testProcedureQuerySelectObjectsCount(ConditionQuery testProcedureQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象TestParamValue到数据库中
 * <param name="testParamValue">需要插入的新对象</param>
 */
void testParamValueInsert(TestParamValue testParamValue) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象TestParamValue
 * <param name="ATestProcedureId">测试过程标识</param>
 * <param name="AParamId">参数标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void testParamValueDeleteByTestProcedureIdParamId(int ATestProcedureId, int AParamId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象TestParamValue
 * <param name="ATestProcedureId">测试过程标识</param>
 * <param name="AParamId">参数标识</param>
 */
void testParamValueDeleteByTestProcedureIdParamId(int ATestProcedureId, int AParamId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象TestParamValue
 * <param name="AParamId">参数标识</param>
 */
void testParamValueDeleteListByParamId(int AParamId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象TestParamValue
 * <param name="ATestProcedureId">测试过程标识</param>
 */
void testParamValueDeleteListByTestProcedureId(int ATestProcedureId) throws SQLException, DbException;

/**
 * 更新一个对象TestParamValue到数据库中
 * <param name="testParamValue">需要更新的TestParamValue</param>
 */
int testParamValueUpdate(TestParamValue testParamValue) throws SQLException, DbException;

/**
 * 更新一个对象TestParamValue到数据库中
 * <param name="testParamValue">需要更新的TestParamValue</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int testParamValueUpdate(TestParamValue testParamValue, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATestProcedureId">测试过程标识</param>
 * <param name="AParamId">参数标识</param>
 */
TestParamValue testParamValueSelectByTestProcedureIdParamId(int ATestProcedureId, int AParamId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AParamId">参数标识</param>
 */
List<TestParamValue> testParamValueSelectObjectsByParamId(int AParamId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ATestProcedureId">测试过程标识</param>
 */
List<TestParamValue> testParamValueSelectObjectsByTestProcedureId(int ATestProcedureId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TestParamValue> testParamValueSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<TestParamValue> testParamValueSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TestParamValue> testParamValueSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<TestParamValue> testParamValueSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
TestParamValue testParamValueSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TestParamValue> testParamValueSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<TestParamValue> testParamValueSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
TestParamValue testParamValueSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="testParamValueQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TestParamValue> testParamValueSelectObjects(ConditionQuery testParamValueQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="testParamValueQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<TestParamValue> testParamValueSelectObjects(ConditionQuery testParamValueQueryCondition) throws SQLException, DbException;

/**
 * <param name="testParamValueQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
TestParamValue testParamValueSelectSingleObject(ConditionQuery testParamValueQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TestParamValue> List<T> testParamValueSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends TestParamValue> List<T> testParamValueSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends TestParamValue> T testParamValueSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TestParamValue> List<T> testParamValueSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends TestParamValue> List<T> testParamValueSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends TestParamValue> T testParamValueSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="testParamValueQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TestParamValue> List<T> testParamValueSelectObjects(Class<T> type, ConditionQuery testParamValueQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="testParamValueQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends TestParamValue> List<T> testParamValueSelectObjects(Class<T> type, ConditionQuery testParamValueQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="testParamValueQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends TestParamValue> T testParamValueSelectSingleObject(Class<T> type, ConditionQuery testParamValueQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int testParamValueQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="testParamValueQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int testParamValueQuerySelectObjectsCount(ConditionQuery testParamValueQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象QuestionCategory到数据库中
 * <param name="questionCategory">需要插入的新对象</param>
 */
void questionCategoryInsert(QuestionCategory questionCategory) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象QuestionCategory
 * <param name="ACategoryId">分类标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void questionCategoryDeleteByCategoryId(int ACategoryId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象QuestionCategory
 * <param name="ACategoryId">分类标识</param>
 */
void questionCategoryDeleteByCategoryId(int ACategoryId) throws SQLException, DbException;

/**
 * 更新一个对象QuestionCategory到数据库中
 * <param name="questionCategory">需要更新的QuestionCategory</param>
 */
int questionCategoryUpdate(QuestionCategory questionCategory) throws SQLException, DbException;

/**
 * 更新一个对象QuestionCategory到数据库中
 * <param name="questionCategory">需要更新的QuestionCategory</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int questionCategoryUpdate(QuestionCategory questionCategory, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ACategoryId">分类标识</param>
 */
QuestionCategory questionCategorySelectByCategoryId(int ACategoryId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<QuestionCategory> questionCategorySelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<QuestionCategory> questionCategorySelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<QuestionCategory> questionCategorySelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<QuestionCategory> questionCategorySelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
QuestionCategory questionCategorySelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<QuestionCategory> questionCategorySelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<QuestionCategory> questionCategorySelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
QuestionCategory questionCategorySelectSingleObject() throws SQLException, DbException;

/**
 * <param name="questionCategoryQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<QuestionCategory> questionCategorySelectObjects(ConditionQuery questionCategoryQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="questionCategoryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<QuestionCategory> questionCategorySelectObjects(ConditionQuery questionCategoryQueryCondition) throws SQLException, DbException;

/**
 * <param name="questionCategoryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
QuestionCategory questionCategorySelectSingleObject(ConditionQuery questionCategoryQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends QuestionCategory> List<T> questionCategorySelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends QuestionCategory> List<T> questionCategorySelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends QuestionCategory> T questionCategorySelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends QuestionCategory> List<T> questionCategorySelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends QuestionCategory> List<T> questionCategorySelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends QuestionCategory> T questionCategorySelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="questionCategoryQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends QuestionCategory> List<T> questionCategorySelectObjects(Class<T> type, ConditionQuery questionCategoryQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="questionCategoryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends QuestionCategory> List<T> questionCategorySelectObjects(Class<T> type, ConditionQuery questionCategoryQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="questionCategoryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends QuestionCategory> T questionCategorySelectSingleObject(Class<T> type, ConditionQuery questionCategoryQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int questionCategoryQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="questionCategoryQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int questionCategoryQuerySelectObjectsCount(ConditionQuery questionCategoryQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象QuestionLib到数据库中
 * <param name="questionLib">需要插入的新对象</param>
 */
void questionLibInsert(QuestionLib questionLib) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象QuestionLib
 * <param name="AQuestionId">题目标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void questionLibDeleteByQuestionId(int AQuestionId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象QuestionLib
 * <param name="AQuestionId">题目标识</param>
 */
void questionLibDeleteByQuestionId(int AQuestionId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象QuestionLib
 * <param name="ACategoryId">分类标识</param>
 */
void questionLibDeleteListByCategoryId(int ACategoryId) throws SQLException, DbException;

/**
 * 更新一个对象QuestionLib到数据库中
 * <param name="questionLib">需要更新的QuestionLib</param>
 */
int questionLibUpdate(QuestionLib questionLib) throws SQLException, DbException;

/**
 * 更新一个对象QuestionLib到数据库中
 * <param name="questionLib">需要更新的QuestionLib</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int questionLibUpdate(QuestionLib questionLib, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AQuestionId">题目标识</param>
 */
QuestionLib questionLibSelectByQuestionId(int AQuestionId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ACategoryId">分类标识</param>
 */
List<QuestionLib> questionLibSelectObjectsByCategoryId(int ACategoryId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<QuestionLib> questionLibSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<QuestionLib> questionLibSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<QuestionLib> questionLibSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<QuestionLib> questionLibSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
QuestionLib questionLibSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<QuestionLib> questionLibSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<QuestionLib> questionLibSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
QuestionLib questionLibSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="questionLibQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<QuestionLib> questionLibSelectObjects(ConditionQuery questionLibQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="questionLibQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<QuestionLib> questionLibSelectObjects(ConditionQuery questionLibQueryCondition) throws SQLException, DbException;

/**
 * <param name="questionLibQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
QuestionLib questionLibSelectSingleObject(ConditionQuery questionLibQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends QuestionLib> List<T> questionLibSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends QuestionLib> List<T> questionLibSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends QuestionLib> T questionLibSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends QuestionLib> List<T> questionLibSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends QuestionLib> List<T> questionLibSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends QuestionLib> T questionLibSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="questionLibQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends QuestionLib> List<T> questionLibSelectObjects(Class<T> type, ConditionQuery questionLibQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="questionLibQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends QuestionLib> List<T> questionLibSelectObjects(Class<T> type, ConditionQuery questionLibQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="questionLibQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends QuestionLib> T questionLibSelectSingleObject(Class<T> type, ConditionQuery questionLibQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int questionLibQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="questionLibQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int questionLibQuerySelectObjectsCount(ConditionQuery questionLibQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象QuestionAnswer到数据库中
 * <param name="questionAnswer">需要插入的新对象</param>
 */
void questionAnswerInsert(QuestionAnswer questionAnswer) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象QuestionAnswer
 * <param name="AAnswerId">答案标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void questionAnswerDeleteByAnswerId(int AAnswerId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象QuestionAnswer
 * <param name="AAnswerId">答案标识</param>
 */
void questionAnswerDeleteByAnswerId(int AAnswerId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象QuestionAnswer
 * <param name="AQuestionId">题目标识</param>
 */
void questionAnswerDeleteListByQuestionId(int AQuestionId) throws SQLException, DbException;

/**
 * 更新一个对象QuestionAnswer到数据库中
 * <param name="questionAnswer">需要更新的QuestionAnswer</param>
 */
int questionAnswerUpdate(QuestionAnswer questionAnswer) throws SQLException, DbException;

/**
 * 更新一个对象QuestionAnswer到数据库中
 * <param name="questionAnswer">需要更新的QuestionAnswer</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int questionAnswerUpdate(QuestionAnswer questionAnswer, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="AAnswerId">答案标识</param>
 */
QuestionAnswer questionAnswerSelectByAnswerId(int AAnswerId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AQuestionId">题目标识</param>
 */
List<QuestionAnswer> questionAnswerSelectObjectsByQuestionId(int AQuestionId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<QuestionAnswer> questionAnswerSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<QuestionAnswer> questionAnswerSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<QuestionAnswer> questionAnswerSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<QuestionAnswer> questionAnswerSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
QuestionAnswer questionAnswerSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<QuestionAnswer> questionAnswerSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<QuestionAnswer> questionAnswerSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
QuestionAnswer questionAnswerSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="questionAnswerQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<QuestionAnswer> questionAnswerSelectObjects(ConditionQuery questionAnswerQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="questionAnswerQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<QuestionAnswer> questionAnswerSelectObjects(ConditionQuery questionAnswerQueryCondition) throws SQLException, DbException;

/**
 * <param name="questionAnswerQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
QuestionAnswer questionAnswerSelectSingleObject(ConditionQuery questionAnswerQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends QuestionAnswer> List<T> questionAnswerSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends QuestionAnswer> List<T> questionAnswerSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends QuestionAnswer> T questionAnswerSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends QuestionAnswer> List<T> questionAnswerSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends QuestionAnswer> List<T> questionAnswerSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends QuestionAnswer> T questionAnswerSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="questionAnswerQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends QuestionAnswer> List<T> questionAnswerSelectObjects(Class<T> type, ConditionQuery questionAnswerQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="questionAnswerQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends QuestionAnswer> List<T> questionAnswerSelectObjects(Class<T> type, ConditionQuery questionAnswerQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="questionAnswerQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends QuestionAnswer> T questionAnswerSelectSingleObject(Class<T> type, ConditionQuery questionAnswerQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int questionAnswerQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="questionAnswerQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int questionAnswerQuerySelectObjectsCount(ConditionQuery questionAnswerQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象TestPapers到数据库中
 * <param name="testPapers">需要插入的新对象</param>
 */
void testPapersInsert(TestPapers testPapers) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象TestPapers
 * <param name="APapersId">考卷标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void testPapersDeleteByPapersId(int APapersId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象TestPapers
 * <param name="APapersId">考卷标识</param>
 */
void testPapersDeleteByPapersId(int APapersId) throws SQLException, DbException;

/**
 * 更新一个对象TestPapers到数据库中
 * <param name="testPapers">需要更新的TestPapers</param>
 */
int testPapersUpdate(TestPapers testPapers) throws SQLException, DbException;

/**
 * 更新一个对象TestPapers到数据库中
 * <param name="testPapers">需要更新的TestPapers</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int testPapersUpdate(TestPapers testPapers, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APapersId">考卷标识</param>
 */
TestPapers testPapersSelectByPapersId(int APapersId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TestPapers> testPapersSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<TestPapers> testPapersSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TestPapers> testPapersSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<TestPapers> testPapersSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
TestPapers testPapersSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TestPapers> testPapersSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<TestPapers> testPapersSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
TestPapers testPapersSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="testPapersQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TestPapers> testPapersSelectObjects(ConditionQuery testPapersQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="testPapersQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<TestPapers> testPapersSelectObjects(ConditionQuery testPapersQueryCondition) throws SQLException, DbException;

/**
 * <param name="testPapersQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
TestPapers testPapersSelectSingleObject(ConditionQuery testPapersQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TestPapers> List<T> testPapersSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends TestPapers> List<T> testPapersSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends TestPapers> T testPapersSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TestPapers> List<T> testPapersSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends TestPapers> List<T> testPapersSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends TestPapers> T testPapersSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="testPapersQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TestPapers> List<T> testPapersSelectObjects(Class<T> type, ConditionQuery testPapersQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="testPapersQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends TestPapers> List<T> testPapersSelectObjects(Class<T> type, ConditionQuery testPapersQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="testPapersQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends TestPapers> T testPapersSelectSingleObject(Class<T> type, ConditionQuery testPapersQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int testPapersQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="testPapersQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int testPapersQuerySelectObjectsCount(ConditionQuery testPapersQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象TestPapersQuestion到数据库中
 * <param name="testPapersQuestion">需要插入的新对象</param>
 */
void testPapersQuestionInsert(TestPapersQuestion testPapersQuestion) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象TestPapersQuestion
 * <param name="APapersQuestionId"></param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void testPapersQuestionDeleteByPapersQuestionId(int APapersQuestionId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象TestPapersQuestion
 * <param name="APapersQuestionId"></param>
 */
void testPapersQuestionDeleteByPapersQuestionId(int APapersQuestionId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象TestPapersQuestion
 * <param name="AQuestionId">题目标识</param>
 */
void testPapersQuestionDeleteListByQuestionId(int AQuestionId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象TestPapersQuestion
 * <param name="APapersId">考卷标识</param>
 */
void testPapersQuestionDeleteListByPapersId(int APapersId) throws SQLException, DbException;

/**
 * 更新一个对象TestPapersQuestion到数据库中
 * <param name="testPapersQuestion">需要更新的TestPapersQuestion</param>
 */
int testPapersQuestionUpdate(TestPapersQuestion testPapersQuestion) throws SQLException, DbException;

/**
 * 更新一个对象TestPapersQuestion到数据库中
 * <param name="testPapersQuestion">需要更新的TestPapersQuestion</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int testPapersQuestionUpdate(TestPapersQuestion testPapersQuestion, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APapersQuestionId"></param>
 */
TestPapersQuestion testPapersQuestionSelectByPapersQuestionId(int APapersQuestionId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AQuestionId">题目标识</param>
 */
List<TestPapersQuestion> testPapersQuestionSelectObjectsByQuestionId(int AQuestionId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="APapersId">考卷标识</param>
 */
List<TestPapersQuestion> testPapersQuestionSelectObjectsByPapersId(int APapersId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TestPapersQuestion> testPapersQuestionSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<TestPapersQuestion> testPapersQuestionSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TestPapersQuestion> testPapersQuestionSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<TestPapersQuestion> testPapersQuestionSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
TestPapersQuestion testPapersQuestionSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TestPapersQuestion> testPapersQuestionSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<TestPapersQuestion> testPapersQuestionSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
TestPapersQuestion testPapersQuestionSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="testPapersQuestionQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TestPapersQuestion> testPapersQuestionSelectObjects(ConditionQuery testPapersQuestionQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="testPapersQuestionQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<TestPapersQuestion> testPapersQuestionSelectObjects(ConditionQuery testPapersQuestionQueryCondition) throws SQLException, DbException;

/**
 * <param name="testPapersQuestionQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
TestPapersQuestion testPapersQuestionSelectSingleObject(ConditionQuery testPapersQuestionQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TestPapersQuestion> List<T> testPapersQuestionSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends TestPapersQuestion> List<T> testPapersQuestionSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends TestPapersQuestion> T testPapersQuestionSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TestPapersQuestion> List<T> testPapersQuestionSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends TestPapersQuestion> List<T> testPapersQuestionSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends TestPapersQuestion> T testPapersQuestionSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="testPapersQuestionQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TestPapersQuestion> List<T> testPapersQuestionSelectObjects(Class<T> type, ConditionQuery testPapersQuestionQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="testPapersQuestionQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends TestPapersQuestion> List<T> testPapersQuestionSelectObjects(Class<T> type, ConditionQuery testPapersQuestionQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="testPapersQuestionQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends TestPapersQuestion> T testPapersQuestionSelectSingleObject(Class<T> type, ConditionQuery testPapersQuestionQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int testPapersQuestionQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="testPapersQuestionQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int testPapersQuestionQuerySelectObjectsCount(ConditionQuery testPapersQuestionQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象PapersScore到数据库中
 * <param name="papersScore">需要插入的新对象</param>
 */
void papersScoreInsert(PapersScore papersScore) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象PapersScore
 * <param name="APapersScoreId">标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void papersScoreDeleteByPapersScoreId(int APapersScoreId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象PapersScore
 * <param name="APapersScoreId">标识</param>
 */
void papersScoreDeleteByPapersScoreId(int APapersScoreId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象PapersScore
 * <param name="APapersId">考卷标识</param>
 */
void papersScoreDeleteListByPapersId(int APapersId) throws SQLException, DbException;

/**
 * 更新一个对象PapersScore到数据库中
 * <param name="papersScore">需要更新的PapersScore</param>
 */
int papersScoreUpdate(PapersScore papersScore) throws SQLException, DbException;

/**
 * 更新一个对象PapersScore到数据库中
 * <param name="papersScore">需要更新的PapersScore</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int papersScoreUpdate(PapersScore papersScore, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APapersScoreId">标识</param>
 */
PapersScore papersScoreSelectByPapersScoreId(int APapersScoreId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="APapersId">考卷标识</param>
 */
List<PapersScore> papersScoreSelectObjectsByPapersId(int APapersId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<PapersScore> papersScoreSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<PapersScore> papersScoreSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<PapersScore> papersScoreSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<PapersScore> papersScoreSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
PapersScore papersScoreSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<PapersScore> papersScoreSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<PapersScore> papersScoreSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
PapersScore papersScoreSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="papersScoreQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<PapersScore> papersScoreSelectObjects(ConditionQuery papersScoreQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="papersScoreQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<PapersScore> papersScoreSelectObjects(ConditionQuery papersScoreQueryCondition) throws SQLException, DbException;

/**
 * <param name="papersScoreQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
PapersScore papersScoreSelectSingleObject(ConditionQuery papersScoreQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends PapersScore> List<T> papersScoreSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends PapersScore> List<T> papersScoreSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends PapersScore> T papersScoreSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends PapersScore> List<T> papersScoreSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends PapersScore> List<T> papersScoreSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends PapersScore> T papersScoreSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="papersScoreQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends PapersScore> List<T> papersScoreSelectObjects(Class<T> type, ConditionQuery papersScoreQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="papersScoreQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends PapersScore> List<T> papersScoreSelectObjects(Class<T> type, ConditionQuery papersScoreQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="papersScoreQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends PapersScore> T papersScoreSelectSingleObject(Class<T> type, ConditionQuery papersScoreQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int papersScoreQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="papersScoreQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int papersScoreQuerySelectObjectsCount(ConditionQuery papersScoreQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象PapersResultDetail到数据库中
 * <param name="papersResultDetail">需要插入的新对象</param>
 */
void papersResultDetailInsert(PapersResultDetail papersResultDetail) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象PapersResultDetail
 * <param name="APapersResultDetailId">回答明细标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void papersResultDetailDeleteByPapersResultDetailId(int APapersResultDetailId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象PapersResultDetail
 * <param name="APapersResultDetailId">回答明细标识</param>
 */
void papersResultDetailDeleteByPapersResultDetailId(int APapersResultDetailId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象PapersResultDetail
 * <param name="APapersResultId">回答标识</param>
 */
void papersResultDetailDeleteListByPapersResultId(int APapersResultId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象PapersResultDetail
 * <param name="AAnswerId">答案标识</param>
 */
void papersResultDetailDeleteListByAnswerId(int AAnswerId) throws SQLException, DbException;

/**
 * 更新一个对象PapersResultDetail到数据库中
 * <param name="papersResultDetail">需要更新的PapersResultDetail</param>
 */
int papersResultDetailUpdate(PapersResultDetail papersResultDetail) throws SQLException, DbException;

/**
 * 更新一个对象PapersResultDetail到数据库中
 * <param name="papersResultDetail">需要更新的PapersResultDetail</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int papersResultDetailUpdate(PapersResultDetail papersResultDetail, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APapersResultDetailId">回答明细标识</param>
 */
PapersResultDetail papersResultDetailSelectByPapersResultDetailId(int APapersResultDetailId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="APapersResultId">回答标识</param>
 */
List<PapersResultDetail> papersResultDetailSelectObjectsByPapersResultId(int APapersResultId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="AAnswerId">答案标识</param>
 */
List<PapersResultDetail> papersResultDetailSelectObjectsByAnswerId(int AAnswerId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<PapersResultDetail> papersResultDetailSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<PapersResultDetail> papersResultDetailSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<PapersResultDetail> papersResultDetailSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<PapersResultDetail> papersResultDetailSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
PapersResultDetail papersResultDetailSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<PapersResultDetail> papersResultDetailSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<PapersResultDetail> papersResultDetailSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
PapersResultDetail papersResultDetailSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="papersResultDetailQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<PapersResultDetail> papersResultDetailSelectObjects(ConditionQuery papersResultDetailQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="papersResultDetailQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<PapersResultDetail> papersResultDetailSelectObjects(ConditionQuery papersResultDetailQueryCondition) throws SQLException, DbException;

/**
 * <param name="papersResultDetailQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
PapersResultDetail papersResultDetailSelectSingleObject(ConditionQuery papersResultDetailQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends PapersResultDetail> List<T> papersResultDetailSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends PapersResultDetail> List<T> papersResultDetailSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends PapersResultDetail> T papersResultDetailSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends PapersResultDetail> List<T> papersResultDetailSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends PapersResultDetail> List<T> papersResultDetailSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends PapersResultDetail> T papersResultDetailSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="papersResultDetailQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends PapersResultDetail> List<T> papersResultDetailSelectObjects(Class<T> type, ConditionQuery papersResultDetailQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="papersResultDetailQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends PapersResultDetail> List<T> papersResultDetailSelectObjects(Class<T> type, ConditionQuery papersResultDetailQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="papersResultDetailQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends PapersResultDetail> T papersResultDetailSelectSingleObject(Class<T> type, ConditionQuery papersResultDetailQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int papersResultDetailQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="papersResultDetailQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int papersResultDetailQuerySelectObjectsCount(ConditionQuery papersResultDetailQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象TestPapersQuestionRange到数据库中
 * <param name="testPapersQuestionRange">需要插入的新对象</param>
 */
void testPapersQuestionRangeInsert(TestPapersQuestionRange testPapersQuestionRange) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象TestPapersQuestionRange
 * <param name="APapersId">考卷标识</param>
 * <param name="ACategoryId">试卷分类标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void testPapersQuestionRangeDeleteByPapersIdCategoryId(int APapersId, int ACategoryId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象TestPapersQuestionRange
 * <param name="APapersId">考卷标识</param>
 * <param name="ACategoryId">试卷分类标识</param>
 */
void testPapersQuestionRangeDeleteByPapersIdCategoryId(int APapersId, int ACategoryId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象TestPapersQuestionRange
 * <param name="ACategoryId">试卷分类标识</param>
 */
void testPapersQuestionRangeDeleteListByCategoryId(int ACategoryId) throws SQLException, DbException;

/**
 * 更新一个对象TestPapersQuestionRange到数据库中
 * <param name="testPapersQuestionRange">需要更新的TestPapersQuestionRange</param>
 */
int testPapersQuestionRangeUpdate(TestPapersQuestionRange testPapersQuestionRange) throws SQLException, DbException;

/**
 * 更新一个对象TestPapersQuestionRange到数据库中
 * <param name="testPapersQuestionRange">需要更新的TestPapersQuestionRange</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int testPapersQuestionRangeUpdate(TestPapersQuestionRange testPapersQuestionRange, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APapersId">考卷标识</param>
 * <param name="ACategoryId">试卷分类标识</param>
 */
TestPapersQuestionRange testPapersQuestionRangeSelectByPapersIdCategoryId(int APapersId, int ACategoryId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="ACategoryId">试卷分类标识</param>
 */
List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjectsByCategoryId(int ACategoryId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
TestPapersQuestionRange testPapersQuestionRangeSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
TestPapersQuestionRange testPapersQuestionRangeSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="testPapersQuestionRangeQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjects(ConditionQuery testPapersQuestionRangeQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="testPapersQuestionRangeQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<TestPapersQuestionRange> testPapersQuestionRangeSelectObjects(ConditionQuery testPapersQuestionRangeQueryCondition) throws SQLException, DbException;

/**
 * <param name="testPapersQuestionRangeQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
TestPapersQuestionRange testPapersQuestionRangeSelectSingleObject(ConditionQuery testPapersQuestionRangeQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TestPapersQuestionRange> List<T> testPapersQuestionRangeSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends TestPapersQuestionRange> List<T> testPapersQuestionRangeSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends TestPapersQuestionRange> T testPapersQuestionRangeSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TestPapersQuestionRange> List<T> testPapersQuestionRangeSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends TestPapersQuestionRange> List<T> testPapersQuestionRangeSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends TestPapersQuestionRange> T testPapersQuestionRangeSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="testPapersQuestionRangeQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends TestPapersQuestionRange> List<T> testPapersQuestionRangeSelectObjects(Class<T> type, ConditionQuery testPapersQuestionRangeQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="testPapersQuestionRangeQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends TestPapersQuestionRange> List<T> testPapersQuestionRangeSelectObjects(Class<T> type, ConditionQuery testPapersQuestionRangeQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="testPapersQuestionRangeQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends TestPapersQuestionRange> T testPapersQuestionRangeSelectSingleObject(Class<T> type, ConditionQuery testPapersQuestionRangeQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int testPapersQuestionRangeQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="testPapersQuestionRangeQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int testPapersQuestionRangeQuerySelectObjectsCount(ConditionQuery testPapersQuestionRangeQueryCondition) throws SQLException, DbException;

/**
 * 插入一个对象PapersResult到数据库中
 * <param name="papersResult">需要插入的新对象</param>
 */
void papersResultInsert(PapersResult papersResult) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象PapersResult
 * <param name="APapersResultId">回答标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void papersResultDeleteByPapersResultId(int APapersResultId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象PapersResult
 * <param name="APapersResultId">回答标识</param>
 */
void papersResultDeleteByPapersResultId(int APapersResultId) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象PapersResult
 * <param name="ATesterName">testername</param>
 * <param name="APapersQuestionId">考题标识</param>
 * <param name="appendConditionSql">附加的条件语句</param>
 */
void papersResultDeleteByTesterNamePapersQuestionId(String ATesterName, int APapersQuestionId, String appendConditionSql) throws SQLException, DbException;

/**
 * 从数据库中删除一个对象PapersResult
 * <param name="ATesterName">testername</param>
 * <param name="APapersQuestionId">考题标识</param>
 */
void papersResultDeleteByTesterNamePapersQuestionId(String ATesterName, int APapersQuestionId) throws SQLException, DbException;

/**
 * 从数据库中删除一批对象PapersResult
 * <param name="APapersQuestionId">考题标识</param>
 */
void papersResultDeleteListByPapersQuestionId(int APapersQuestionId) throws SQLException, DbException;

/**
 * 更新一个对象PapersResult到数据库中
 * <param name="papersResult">需要更新的PapersResult</param>
 */
int papersResultUpdate(PapersResult papersResult) throws SQLException, DbException;

/**
 * 更新一个对象PapersResult到数据库中
 * <param name="papersResult">需要更新的PapersResult</param>
 * <param name="appendConditionSql">附加的Sql条件</param>
 */
int papersResultUpdate(PapersResult papersResult, String appendConditionSql) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="APapersResultId">回答标识</param>
 */
PapersResult papersResultSelectByPapersResultId(int APapersResultId) throws SQLException, DbException;

/**
 * 根据对象的唯一索引从数据库中查询一个对象
 * <param name="ATesterName">testername</param>
 * <param name="APapersQuestionId">考题标识</param>
 */
PapersResult papersResultSelectByTesterNamePapersQuestionId(String ATesterName, int APapersQuestionId) throws SQLException, DbException;

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="APapersQuestionId">考题标识</param>
 */
List<PapersResult> papersResultSelectObjectsByPapersQuestionId(int APapersQuestionId) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<PapersResult> papersResultSelectObjectsWithCustomSql(String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">自定义查询Sql语句</param>
 * @return 查询结果
 */
List<PapersResult> papersResultSelectObjectsWithCustomSql(String sql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<PapersResult> papersResultSelectObjects(String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
List<PapersResult> papersResultSelectObjects(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
PapersResult papersResultSelectSingleObject(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<PapersResult> papersResultSelectObjects(int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * @return 查询结果
 */
List<PapersResult> papersResultSelectObjects() throws SQLException, DbException;

/**
 * @return 查询结果
 */
PapersResult papersResultSelectSingleObject() throws SQLException, DbException;

/**
 * <param name="papersResultQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
List<PapersResult> papersResultSelectObjects(ConditionQuery papersResultQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException;

/**
 * <param name="papersResultQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
List<PapersResult> papersResultSelectObjects(ConditionQuery papersResultQueryCondition) throws SQLException, DbException;

/**
 * <param name="papersResultQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
PapersResult papersResultSelectSingleObject(ConditionQuery papersResultQueryCondition) throws SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends PapersResult> List<T> papersResultSelectObjects(Class<T> type, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends PapersResult> List<T> papersResultSelectObjects(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
<T extends PapersResult> T papersResultSelectSingleObject(Class<T> type, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends PapersResult> List<T> papersResultSelectObjects(Class<T> type, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends PapersResult> List<T> papersResultSelectObjects(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * @return 查询结果
 */
<T extends PapersResult> T papersResultSelectSingleObject(Class<T> type) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="papersResultQueryCondition">附加查询条件</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 * @return 查询结果
 */
<T extends PapersResult> List<T> papersResultSelectObjects(Class<T> type, ConditionQuery papersResultQueryCondition, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="papersResultQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends PapersResult> List<T> papersResultSelectObjects(Class<T> type, ConditionQuery papersResultQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="papersResultQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
<T extends PapersResult> T papersResultSelectSingleObject(Class<T> type, ConditionQuery papersResultQueryCondition) throws InstantiationException, IllegalAccessException, SQLException, DbException;

/**
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
int papersResultQuerySelectObjectsCount(String appendConditionSql) throws SQLException, DbException;

/**
 * <param name="papersResultQueryCondition">附加查询条件</param>
 * @return 查询结果
 */
int papersResultQuerySelectObjectsCount(ConditionQuery papersResultQueryCondition) throws SQLException, DbException;

/**
 * 简单的日志接口,调用Dao
 * <param name="tableName">表名称</param>
 * <param name="operateName">操作名称</param>
 * <param name="keyFieldName">主键字段名</param>
 * <param name="keyFieldValue">主键字段值</param>
 * <param name="param">附加参数</param>
 */
void operatesLogSimpleAdd(String tableName, String operateName, String keyFieldName, String keyFieldValue, Object param) throws SQLException, DbException;

/**
 * 获得格式化的错误提示信息
 * <param name="primaryTable">被删除的表对象</param>
 * <param name="forkeyTable">被引用的表对象</param>
 */
String GetDeleteCheckForKeyErrorInfo(String APrimaryTable, String AForkeyTable) throws SQLException, DbException;
}
