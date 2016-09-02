package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * V_USER_TASK: 
 */
public class VUserTask extends common.dbvisit.BaseTable {
	
	/**
	 * TASK_ID: 
	 */
	int taskId;
	
	/**
	 * ACTUAL_WORK_TIME: 
	 */
	Double actualWorkTime;
	
	/**
	 * AUDIT_WORK_TIME: 
	 */
	Double auditWorkTime;
	
	/**
	 * CREATE_TIME: 
	 */
	java.util.Date createTime;
	
	/**
	 * ESTIMATE_WORK_TIME: 
	 */
	Double estimateWorkTime;
	
	/**
	 * MODIFY_TIME: 
	 */
	java.util.Date modifyTime;
	
	/**
	 * ORDER_FIELD: 
	 */
	java.util.Date orderField;
	
	/**
	 * TASK_ACTUAL_END_DATE: 
	 */
	java.util.Date taskActualEndDate;
	
	/**
	 * TASK_ACTUAL_START_DATE: 
	 */
	java.util.Date taskActualStartDate;
	
	/**
	 * TASK_DESC: 
	 */
	String taskDesc;
	
	/**
	 * TASK_LEVEL: 
	 */
	int taskLevel;
	
	/**
	 * TASK_NAME: 
	 */
	String taskName = "";
	
	/**
	 * TASK_PLAN_END_DATE: 
	 */
	java.util.Date taskPlanEndDate;
	
	/**
	 * TASK_PLAN_START_DATE: 
	 */
	java.util.Date taskPlanStartDate;
	
	/**
	 * TASK_STATE: 
	 */
	int taskState;
	
	/**
	 * TASK_PARENT_ID: 
	 */
	Integer taskParentId;
	
	/**
	 * TASK_PROJECT_ID: 
	 */
	int taskProjectId;
	
	/**
	 * TASK_CREATER_ID: 
	 */
	int taskCreaterId;
	
	/**
	 * TASK_MANAGER_ID: 
	 */
	int taskManagerId;
	
	/**
	 * TASK_MODIFIER_ID: 
	 */
	int taskModifierId;
	
	/**
	 * TASK_OUTLINE: 
	 */
	String taskOutline = "";
	
	/**
	 * USER_ID: 
	 */
	int userId;
	
	/**
	 * TASK_ID: 
	 */
	public int getTaskId() {
		return this.taskId;
	}
	
	/**
	 * TASK_ID: 
	 */
	public void setTaskId(int value)
	 {
		this.taskId = value;
	}
	
	/**
	 * ACTUAL_WORK_TIME: 
	 */
	public Double getActualWorkTime() {
		return this.actualWorkTime;
	}
	
	/**
	 * ACTUAL_WORK_TIME: 
	 */
	public void setActualWorkTime(Double value)
	 {
		this.actualWorkTime = value;
	}
	
	/**
	 * AUDIT_WORK_TIME: 
	 */
	public Double getAuditWorkTime() {
		return this.auditWorkTime;
	}
	
	/**
	 * AUDIT_WORK_TIME: 
	 */
	public void setAuditWorkTime(Double value)
	 {
		this.auditWorkTime = value;
	}
	
	/**
	 * CREATE_TIME: 
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	
	/**
	 * CREATE_TIME: 
	 */
	public void setCreateTime(java.util.Date value)
	 {
		this.createTime = value;
	}
	
	/**
	 * ESTIMATE_WORK_TIME: 
	 */
	public Double getEstimateWorkTime() {
		return this.estimateWorkTime;
	}
	
	/**
	 * ESTIMATE_WORK_TIME: 
	 */
	public void setEstimateWorkTime(Double value)
	 {
		this.estimateWorkTime = value;
	}
	
	/**
	 * MODIFY_TIME: 
	 */
	public java.util.Date getModifyTime() {
		return this.modifyTime;
	}
	
	/**
	 * MODIFY_TIME: 
	 */
	public void setModifyTime(java.util.Date value)
	 {
		this.modifyTime = value;
	}
	
	/**
	 * ORDER_FIELD: 
	 */
	public java.util.Date getOrderField() {
		return this.orderField;
	}
	
	/**
	 * ORDER_FIELD: 
	 */
	public void setOrderField(java.util.Date value)
	 {
		this.orderField = value;
	}
	
	/**
	 * TASK_ACTUAL_END_DATE: 
	 */
	public java.util.Date getTaskActualEndDate() {
		return this.taskActualEndDate;
	}
	
	/**
	 * TASK_ACTUAL_END_DATE: 
	 */
	public void setTaskActualEndDate(java.util.Date value)
	 {
		this.taskActualEndDate = value;
	}
	
	/**
	 * TASK_ACTUAL_START_DATE: 
	 */
	public java.util.Date getTaskActualStartDate() {
		return this.taskActualStartDate;
	}
	
	/**
	 * TASK_ACTUAL_START_DATE: 
	 */
	public void setTaskActualStartDate(java.util.Date value)
	 {
		this.taskActualStartDate = value;
	}
	
	/**
	 * TASK_DESC: 
	 */
	public String getTaskDesc() {
		return this.taskDesc;
	}
	
	/**
	 * TASK_DESC: 
	 */
	public void setTaskDesc(String value)
	 {
		this.taskDesc = value;
	}
	
	/**
	 * TASK_LEVEL: 
	 */
	public int getTaskLevel() {
		return this.taskLevel;
	}
	
	/**
	 * TASK_LEVEL: 
	 */
	public void setTaskLevel(int value)
	 {
		this.taskLevel = value;
	}
	
	/**
	 * TASK_NAME: 
	 */
	public String getTaskName() {
		return this.taskName;
	}
	
	/**
	 * TASK_NAME: 
	 */
	public void setTaskName(String value)
	 {
		this.taskName = value;
	}
	
	/**
	 * TASK_PLAN_END_DATE: 
	 */
	public java.util.Date getTaskPlanEndDate() {
		return this.taskPlanEndDate;
	}
	
	/**
	 * TASK_PLAN_END_DATE: 
	 */
	public void setTaskPlanEndDate(java.util.Date value)
	 {
		this.taskPlanEndDate = value;
	}
	
	/**
	 * TASK_PLAN_START_DATE: 
	 */
	public java.util.Date getTaskPlanStartDate() {
		return this.taskPlanStartDate;
	}
	
	/**
	 * TASK_PLAN_START_DATE: 
	 */
	public void setTaskPlanStartDate(java.util.Date value)
	 {
		this.taskPlanStartDate = value;
	}
	
	/**
	 * TASK_STATE: 
	 */
	public int getTaskState() {
		return this.taskState;
	}
	
	/**
	 * TASK_STATE: 
	 */
	public void setTaskState(int value)
	 {
		this.taskState = value;
	}
	
	/**
	 * TASK_PARENT_ID: 
	 */
	public Integer getTaskParentId() {
		return this.taskParentId;
	}
	
	/**
	 * TASK_PARENT_ID: 
	 */
	public void setTaskParentId(Integer value)
	 {
		this.taskParentId = value;
	}
	
	/**
	 * TASK_PROJECT_ID: 
	 */
	public int getTaskProjectId() {
		return this.taskProjectId;
	}
	
	/**
	 * TASK_PROJECT_ID: 
	 */
	public void setTaskProjectId(int value)
	 {
		this.taskProjectId = value;
	}
	
	/**
	 * TASK_CREATER_ID: 
	 */
	public int getTaskCreaterId() {
		return this.taskCreaterId;
	}
	
	/**
	 * TASK_CREATER_ID: 
	 */
	public void setTaskCreaterId(int value)
	 {
		this.taskCreaterId = value;
	}
	
	/**
	 * TASK_MANAGER_ID: 
	 */
	public int getTaskManagerId() {
		return this.taskManagerId;
	}
	
	/**
	 * TASK_MANAGER_ID: 
	 */
	public void setTaskManagerId(int value)
	 {
		this.taskManagerId = value;
	}
	
	/**
	 * TASK_MODIFIER_ID: 
	 */
	public int getTaskModifierId() {
		return this.taskModifierId;
	}
	
	/**
	 * TASK_MODIFIER_ID: 
	 */
	public void setTaskModifierId(int value)
	 {
		this.taskModifierId = value;
	}
	
	/**
	 * TASK_OUTLINE: 
	 */
	public String getTaskOutline() {
		return this.taskOutline;
	}
	
	/**
	 * TASK_OUTLINE: 
	 */
	public void setTaskOutline(String value)
	 {
		this.taskOutline = value;
	}
	
	/**
	 * USER_ID: 
	 */
	public int getUserId() {
		return this.userId;
	}
	
	/**
	 * USER_ID: 
	 */
	public void setUserId(int value)
	 {
		this.userId = value;
	}
	
	public static String getSelectSql() {
		return "select  [V_USER_TASK].[TASK_ID], [V_USER_TASK].[ACTUAL_WORK_TIME], [V_USER_TASK].[AUDIT_WORK_TIME], [V_USER_TASK].[CREATE_TIME], [V_USER_TASK].[ESTIMATE_WORK_TIME], [V_USER_TASK].[MODIFY_TIME], [V_USER_TASK].[ORDER_FIELD], [V_USER_TASK].[TASK_ACTUAL_END_DATE], [V_USER_TASK].[TASK_ACTUAL_START_DATE], [V_USER_TASK].[TASK_DESC], [V_USER_TASK].[TASK_LEVEL], [V_USER_TASK].[TASK_NAME], [V_USER_TASK].[TASK_PLAN_END_DATE], [V_USER_TASK].[TASK_PLAN_START_DATE], [V_USER_TASK].[TASK_STATE], [V_USER_TASK].[TASK_PARENT_ID], [V_USER_TASK].[TASK_PROJECT_ID], [V_USER_TASK].[TASK_CREATER_ID], [V_USER_TASK].[TASK_MANAGER_ID], [V_USER_TASK].[TASK_MODIFIER_ID], [V_USER_TASK].[TASK_OUTLINE], [V_USER_TASK].[USER_ID]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [V_USER_TASK].[TASK_ID], [V_USER_TASK].[ACTUAL_WORK_TIME], [V_USER_TASK].[AUDIT_WORK_TIME], [V_USER_TASK].[CREATE_TIME], [V_USER_TASK].[ESTIMATE_WORK_TIME], [V_USER_TASK].[MODIFY_TIME], [V_USER_TASK].[ORDER_FIELD], [V_USER_TASK].[TASK_ACTUAL_END_DATE], [V_USER_TASK].[TASK_ACTUAL_START_DATE], [V_USER_TASK].[TASK_DESC], [V_USER_TASK].[TASK_LEVEL], [V_USER_TASK].[TASK_NAME], [V_USER_TASK].[TASK_PLAN_END_DATE], [V_USER_TASK].[TASK_PLAN_START_DATE], [V_USER_TASK].[TASK_STATE], [V_USER_TASK].[TASK_PARENT_ID], [V_USER_TASK].[TASK_PROJECT_ID], [V_USER_TASK].[TASK_CREATER_ID], [V_USER_TASK].[TASK_MANAGER_ID], [V_USER_TASK].[TASK_MODIFIER_ID], [V_USER_TASK].[TASK_OUTLINE], [V_USER_TASK].[USER_ID]   from [V_USER_TASK] ";
	}
	
	
	public static String getColumnSql() {
		return " [V_USER_TASK].[TASK_ID], [V_USER_TASK].[ACTUAL_WORK_TIME], [V_USER_TASK].[AUDIT_WORK_TIME], [V_USER_TASK].[CREATE_TIME], [V_USER_TASK].[ESTIMATE_WORK_TIME], [V_USER_TASK].[MODIFY_TIME], [V_USER_TASK].[ORDER_FIELD], [V_USER_TASK].[TASK_ACTUAL_END_DATE], [V_USER_TASK].[TASK_ACTUAL_START_DATE], [V_USER_TASK].[TASK_DESC], [V_USER_TASK].[TASK_LEVEL], [V_USER_TASK].[TASK_NAME], [V_USER_TASK].[TASK_PLAN_END_DATE], [V_USER_TASK].[TASK_PLAN_START_DATE], [V_USER_TASK].[TASK_STATE], [V_USER_TASK].[TASK_PARENT_ID], [V_USER_TASK].[TASK_PROJECT_ID], [V_USER_TASK].[TASK_CREATER_ID], [V_USER_TASK].[TASK_MANAGER_ID], [V_USER_TASK].[TASK_MODIFIER_ID], [V_USER_TASK].[TASK_OUTLINE], [V_USER_TASK].[USER_ID] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "V_USER_TASK";
	}
	
	
	public String getTableName() {
		return "V_USER_TASK";
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (VUserTask.class.isInstance(obj)) {
			VUserTask o = ((VUserTask)(obj));
			this.taskId = o.taskId;
			this.actualWorkTime = o.actualWorkTime;
			this.auditWorkTime = o.auditWorkTime;
			this.createTime = o.createTime;
			this.estimateWorkTime = o.estimateWorkTime;
			this.modifyTime = o.modifyTime;
			this.orderField = o.orderField;
			this.taskActualEndDate = o.taskActualEndDate;
			this.taskActualStartDate = o.taskActualStartDate;
			this.taskDesc = o.taskDesc;
			this.taskLevel = o.taskLevel;
			this.taskName = o.taskName;
			this.taskPlanEndDate = o.taskPlanEndDate;
			this.taskPlanStartDate = o.taskPlanStartDate;
			this.taskState = o.taskState;
			this.taskParentId = o.taskParentId;
			this.taskProjectId = o.taskProjectId;
			this.taskCreaterId = o.taskCreaterId;
			this.taskManagerId = o.taskManagerId;
			this.taskModifierId = o.taskModifierId;
			this.taskOutline = o.taskOutline;
			this.userId = o.userId;
		}
	}
	
	public String toString() {
		return this.taskName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<VUserTask> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<VUserTask> list = new ArrayList<VUserTask>();
		try {
			for (; reader.next(); ) {
				VUserTask obj = new VUserTask();
				VUserTask.readValue(reader, obj);
				list.add(obj);
			}
		}
		finally {
			if ((reader != null)) {
				reader.close();
			}
			dataVisit.releaseConnection();
		}
		return list;
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public static List<VUserTask> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<VUserTask> list = new ArrayList<VUserTask>();
		try {
			for (; reader.next(); ) {
				VUserTask obj = new VUserTask();
				VUserTask.readValue(reader, obj);
				list.add(obj);
			}
		}
		finally {
			if ((reader != null)) {
				reader.close();
			}
			dataVisit.releaseConnection();
		}
		return list;
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public static List<VUserTask> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((VUserTask.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<VUserTask> list = new ArrayList<VUserTask>();
		try {
			for (; reader.next(); ) {
				VUserTask obj = new VUserTask();
				VUserTask.readValue(reader, obj);
				list.add(obj);
			}
		}
		finally {
			if ((reader != null)) {
				reader.close();
			}
			dataVisit.releaseConnection();
		}
		return list;
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public static List<VUserTask> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((VUserTask.getFullSelectSql() + appendConditionSql));
		List<VUserTask> list = new ArrayList<VUserTask>();
		try {
			for (; reader.next(); ) {
				VUserTask obj = new VUserTask();
				VUserTask.readValue(reader, obj);
				list.add(obj);
			}
		}
		finally {
			if ((reader != null)) {
				reader.close();
			}
			dataVisit.releaseConnection();
		}
		return list;
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public static <T extends VUserTask> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((VUserTask.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			VUserTask.readValue(reader, obj);
			list.add(obj);
		}
	}
	finally {
		if ((reader != null)) {
			reader.close();
		}
		dataVisit.releaseConnection();
	}
	return list;
}

/**
 * <param name="dataVisit">数据查询接口</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public static <T extends VUserTask> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((VUserTask.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			VUserTask.readValue(reader, obj);
			list.add(obj);
		}
	}
	finally {
		if ((reader != null)) {
			reader.close();
		}
		dataVisit.releaseConnection();
	}
	return list;
}

/**
 * <param name="dataVisit">数据查询接口</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public static int querySelectObjectsCount(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
	String sql = "select * from V_USER_TASK ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 从reader读到数据到对象vUserTask中
 * <param name="reader">数据源</param>
 * <param name="vUserTask">目标对象</param>
 */
public static void readValue(ResultSet reader, VUserTask vUserTask) throws SQLException, DbException {
	vUserTask.taskId = reader.getInt(1);
	vUserTask.actualWorkTime = reader.getDouble(2);
	if (reader.wasNull()) {
		vUserTask.actualWorkTime = null;
	}
	vUserTask.auditWorkTime = reader.getDouble(3);
	if (reader.wasNull()) {
		vUserTask.auditWorkTime = null;
	}
	vUserTask.createTime = SqlUtils.getDate(reader, 4);
	vUserTask.estimateWorkTime = reader.getDouble(5);
	if (reader.wasNull()) {
		vUserTask.estimateWorkTime = null;
	}
	vUserTask.modifyTime = SqlUtils.getDate(reader, 6);
	vUserTask.orderField = SqlUtils.getDate(reader, 7);
	if (reader.wasNull()) {
		vUserTask.orderField = null;
	}
	vUserTask.taskActualEndDate = SqlUtils.getDate(reader, 8);
	if (reader.wasNull()) {
		vUserTask.taskActualEndDate = null;
	}
	vUserTask.taskActualStartDate = SqlUtils.getDate(reader, 9);
	if (reader.wasNull()) {
		vUserTask.taskActualStartDate = null;
	}
	vUserTask.taskDesc = reader.getString(10);
	if (reader.wasNull()) {
		vUserTask.taskDesc = null;
	}
	vUserTask.taskLevel = reader.getInt(11);
	vUserTask.taskName = reader.getString(12);
	vUserTask.taskPlanEndDate = SqlUtils.getDate(reader, 13);
	if (reader.wasNull()) {
		vUserTask.taskPlanEndDate = null;
	}
	vUserTask.taskPlanStartDate = SqlUtils.getDate(reader, 14);
	if (reader.wasNull()) {
		vUserTask.taskPlanStartDate = null;
	}
	vUserTask.taskState = reader.getInt(15);
	vUserTask.taskParentId = reader.getInt(16);
	if (reader.wasNull()) {
		vUserTask.taskParentId = null;
	}
	vUserTask.taskProjectId = reader.getInt(17);
	vUserTask.taskCreaterId = reader.getInt(18);
	vUserTask.taskManagerId = reader.getInt(19);
	vUserTask.taskModifierId = reader.getInt(20);
	vUserTask.taskOutline = reader.getString(21);
	vUserTask.userId = reader.getInt(22);
}
}
