package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_WORK_LOG: 工作日志表
 */
public class WorkLog extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * WORK_LOG_ID: 工作日志代号
	 */
	int workLogId;
	
	/**
	 * CREATE_TIME: 创建时间
	 */
	java.util.Date createTime;
	
	/**
	 * MODIFY_TIME: 修改时间
	 */
	java.util.Date modifyTime;
	
	/**
	 * WORK_CONTENT: 工作内容
	 */
	String workContent;
	
	/**
	 * WORK_DAY: 工作日
	 */
	java.util.Date workDay;
	
	/**
	 * WORK_USER_ID: 职工号
	 */
	int workUserId;
	
	/**
	 * WORK_EVALUATION_SCORE: 工作评价分数
	 */
	Integer workEvaluationScore;
	
	/**
	 * WORK_EVALUATION_CONTENT: 工作评价内容
	 */
	String workEvaluationContent;
	
	/**
	 * WORK_LOG_ID: 工作日志代号
	 */
	public int getWorkLogId() {
		return this.workLogId;
	}
	
	/**
	 * WORK_LOG_ID: 工作日志代号
	 */
	public void setWorkLogId(int value)
	 {
		this.workLogId = value;
	}
	
	/**
	 * CREATE_TIME: 创建时间
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	
	/**
	 * CREATE_TIME: 创建时间
	 */
	public void setCreateTime(java.util.Date value)
	 {
		this.createTime = value;
	}
	
	/**
	 * MODIFY_TIME: 修改时间
	 */
	public java.util.Date getModifyTime() {
		return this.modifyTime;
	}
	
	/**
	 * MODIFY_TIME: 修改时间
	 */
	public void setModifyTime(java.util.Date value)
	 {
		this.modifyTime = value;
	}
	
	/**
	 * WORK_CONTENT: 工作内容
	 */
	public String getWorkContent() {
		return this.workContent;
	}
	
	/**
	 * WORK_CONTENT: 工作内容
	 */
	public void setWorkContent(String value)
	 {
		this.workContent = value;
	}
	
	/**
	 * WORK_DAY: 工作日
	 */
	public java.util.Date getWorkDay() {
		return this.workDay;
	}
	
	/**
	 * WORK_DAY: 工作日
	 */
	public void setWorkDay(java.util.Date value)
	 {
		this.workDay = value;
	}
	
	/**
	 * WORK_USER_ID: 职工号
	 */
	public int getWorkUserId() {
		return this.workUserId;
	}
	
	/**
	 * WORK_USER_ID: 职工号
	 */
	public void setWorkUserId(int value)
	 {
		this.workUserId = value;
	}
	
	/**
	 * WORK_EVALUATION_SCORE: 工作评价分数
	 */
	public Integer getWorkEvaluationScore() {
		return this.workEvaluationScore;
	}
	
	/**
	 * WORK_EVALUATION_SCORE: 工作评价分数
	 */
	public void setWorkEvaluationScore(Integer value)
	 {
		this.workEvaluationScore = value;
	}
	
	/**
	 * WORK_EVALUATION_CONTENT: 工作评价内容
	 */
	public String getWorkEvaluationContent() {
		return this.workEvaluationContent;
	}
	
	/**
	 * WORK_EVALUATION_CONTENT: 工作评价内容
	 */
	public void setWorkEvaluationContent(String value)
	 {
		this.workEvaluationContent = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_WORK_LOG].[WORK_LOG_ID], [T_WORK_LOG].[CREATE_TIME], [T_WORK_LOG].[MOD" +
"IFY_TIME], [T_WORK_LOG].[WORK_CONTENT], [T_WORK_LOG].[WORK_DAY], [T_WORK_LOG].[W" +
"ORK_USER_ID], [T_WORK_LOG].[WORK_EVALUATION_SCORE], [T_WORK_LOG].[WORK_EVALUATIO" +
"N_CONTENT]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_WORK_LOG].[WORK_LOG_ID], [T_WORK_LOG].[CREATE_TIME], [T_WORK_LOG].[MODIFY_TIME], [T_WORK_LOG].[WORK_CONTENT], [T_WORK_LOG].[WORK_DAY], [T_WORK_LOG].[WORK_USER_ID], [T_WORK_LOG].[WORK_EVALUATION_SCORE], [T_WORK_LOG].[WORK_EVALUATION_CONTENT]   from [T_WORK_LOG] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_WORK_LOG].[WORK_LOG_ID], [T_WORK_LOG].[CREATE_TIME], [T_WORK_LOG].[MODIFY_TIM" +
"E], [T_WORK_LOG].[WORK_CONTENT], [T_WORK_LOG].[WORK_DAY], [T_WORK_LOG].[WORK_USE" +
"R_ID], [T_WORK_LOG].[WORK_EVALUATION_SCORE], [T_WORK_LOG].[WORK_EVALUATION_CONTE" +
"NT] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_WORK_LOG";
	}
	
	
	public String getTableName() {
		return "T_WORK_LOG";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "WORK_LOG_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.workLogId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (WorkLog.class.isInstance(obj)) {
			WorkLog o = ((WorkLog)(obj));
			this.workLogId = o.workLogId;
			this.createTime = o.createTime;
			this.modifyTime = o.modifyTime;
			this.workContent = o.workContent;
			this.workDay = o.workDay;
			this.workUserId = o.workUserId;
			this.workEvaluationScore = o.workEvaluationScore;
			this.workEvaluationContent = o.workEvaluationContent;
		}
	}
	
	/**
	 * 插入WorkLog对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="workLog">需要插入的工作日志表</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, WorkLog workLog) throws SQLException, DbException {
		String sql = "insert into [T_WORK_LOG](";
		if ((workLog.getWorkLogId() > 0)) {
			sql = (sql + "[WORK_LOG_ID], ");
		}
		sql = (sql + "[CREATE_TIME]");
		sql = (sql + ", [MODIFY_TIME]");
		sql = (sql + ", [WORK_CONTENT]");
		sql = (sql + ", [WORK_DAY]");
		sql = (sql + ", [WORK_USER_ID]");
		sql = (sql + ", [WORK_EVALUATION_SCORE]");
		sql = (sql + ", [WORK_EVALUATION_CONTENT]");
		sql = (sql + ")values(");
		if ((workLog.getWorkLogId() > 0)) {
			sql = (sql + workLog.getWorkLogId());
			sql = (sql + ", ");
		}
		sql = (sql + SqlServerUtils.getDateSql(workLog.getCreateTime()));
		sql = (sql + ", ");
		if ((workLog.modifyTime == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(workLog.getModifyTime()));
		}
		sql = (sql + ", ");
		if ((workLog.workContent == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(workLog.getWorkContent().toString()));
		}
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getDateSql(workLog.getWorkDay()));
		sql = (sql + ", ");
		sql = (sql + workLog.getWorkUserId());
		sql = (sql + ", ");
		if ((workLog.workEvaluationScore == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + workLog.getWorkEvaluationScore());
		}
		sql = (sql + ", ");
		if ((workLog.workEvaluationContent == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(workLog.getWorkEvaluationContent().toString()));
		}
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((workLog.getWorkLogId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_WORK_LOG] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_WORK_LOG off");
			}
			dataVisit.execSql(sql);
			if ((workLog.getWorkLogId() == 0)) {
				workLog.workLogId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入WorkLog对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		WorkLog.insert(dataVisit, this);
	}
	
	/**
	 * 更新WorkLog对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="workLog">需要更新的工作日志表</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, WorkLog workLog, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_WORK_LOG] set ";
		sql = (sql + "[CREATE_TIME] = ");
		sql = (sql + SqlServerUtils.getDateSql(workLog.getCreateTime()));
		sql = (sql + ",");
		if ((workLog.modifyTime == null)) {
			sql = (sql + "[MODIFY_TIME] = default ,");
		}
		else {
			sql = (sql + "[MODIFY_TIME] = ");
			sql = (sql + SqlServerUtils.getDateSql(workLog.getModifyTime()));
			sql = (sql + ",");
		}
		if ((workLog.workContent == null)) {
			sql = (sql + "[WORK_CONTENT] = default ,");
		}
		else {
			sql = (sql + "[WORK_CONTENT] = ");
			sql = (sql + SqlServerUtils.safeSql(workLog.getWorkContent().toString()));
			sql = (sql + ",");
		}
		sql = (sql + "[WORK_DAY] = ");
		sql = (sql + SqlServerUtils.getDateSql(workLog.getWorkDay()));
		sql = (sql + ",");
		sql = (sql + "[WORK_USER_ID] = ");
		sql = (sql + workLog.getWorkUserId());
		sql = (sql + ",");
		if ((workLog.workEvaluationScore == null)) {
			sql = (sql + "[WORK_EVALUATION_SCORE] = default ,");
		}
		else {
			sql = (sql + "[WORK_EVALUATION_SCORE] = ");
			sql = (sql + workLog.getWorkEvaluationScore());
			sql = (sql + ",");
		}
		if ((workLog.workEvaluationContent == null)) {
			sql = (sql + "[WORK_EVALUATION_CONTENT] = default ,");
		}
		else {
			sql = (sql + "[WORK_EVALUATION_CONTENT] = ");
			sql = (sql + SqlServerUtils.safeSql(workLog.getWorkEvaluationContent().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "WORK_LOG_ID = ");
		sql = (sql + workLog.getWorkLogId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新WorkLog对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="workLog">需要更新的工作日志表</param>
	 */
	protected static int update(IDataVisit2 dataVisit, WorkLog workLog) throws SQLException, DbException {
		return WorkLog.update(dataVisit, workLog, "");
	}
	
	/**
	 * 更新WorkLog对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return WorkLog.update(dataVisit, this);
	}
	
	/**
	 * 更新WorkLog对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return WorkLog.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<WorkLog> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<WorkLog> list = new ArrayList<WorkLog>();
		try {
			for (; reader.next(); ) {
				WorkLog obj = new WorkLog();
				WorkLog.readValue(reader, obj);
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
	public static List<WorkLog> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<WorkLog> list = new ArrayList<WorkLog>();
		try {
			for (; reader.next(); ) {
				WorkLog obj = new WorkLog();
				WorkLog.readValue(reader, obj);
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
	public static List<WorkLog> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((WorkLog.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<WorkLog> list = new ArrayList<WorkLog>();
		try {
			for (; reader.next(); ) {
				WorkLog obj = new WorkLog();
				WorkLog.readValue(reader, obj);
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
	public static List<WorkLog> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((WorkLog.getFullSelectSql() + appendConditionSql));
		List<WorkLog> list = new ArrayList<WorkLog>();
		try {
			for (; reader.next(); ) {
				WorkLog obj = new WorkLog();
				WorkLog.readValue(reader, obj);
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
	public static <T extends WorkLog> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((WorkLog.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			WorkLog.readValue(reader, obj);
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
public static <T extends WorkLog> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((WorkLog.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			WorkLog.readValue(reader, obj);
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
	String sql = "select * from T_WORK_LOG ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据工作日志代号查询WorkLog
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AWorkLogId">工作日志代号</param>
 */
public static WorkLog selectByWorkLogId(IDataVisit2 dataVisit, int AWorkLogId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "WORK_LOG_ID = ");
	sql = (sql + AWorkLogId);
	List<WorkLog> list = WorkLog.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个WorkLog对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AWorkLogId">工作日志代号</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByWorkLogId(IDataVisit2 dataVisit, int AWorkLogId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_WORK_LOG] where ");
	sql = (sql + "WORK_LOG_ID = ");
	sql = (sql + AWorkLogId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个WorkLog对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AWorkLogId">工作日志代号</param>
 */
public static void deleteByWorkLogId(IDataVisit2 dataVisit, int AWorkLogId) throws SQLException, DbException {
	WorkLog.deleteByWorkLogId(dataVisit, AWorkLogId, "");
}

/**
 * 根据外键职工号删除一批WorkLog对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="WorkUserId">职工号</param>
 */
public static void deleteListByWorkUserId(IDataVisit2 dataVisit, int AWorkUserId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_WORK_LOG] where ");
	sql = (sql + "WORK_USER_ID = ");
	sql = (sql + AWorkUserId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="WorkUserId">职工号</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<WorkLog> selectObjectsByWorkUserId(IDataVisit2 dataVisit, int AWorkUserId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where WORK_USER_ID = ";
	sql = (sql + AWorkUserId);
	sql = (sql + appendConditionSql);
	return WorkLog.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="WorkUserId">职工号</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<WorkLog> selectObjectsByWorkUserId(IDataVisit2 dataVisit, int AWorkUserId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where WORK_USER_ID = ";
	sql = (sql + AWorkUserId);
	return WorkLog.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="WorkUserId">职工号</param>
 */
public static List<WorkLog> selectObjectsByWorkUserId(IDataVisit2 dataVisit, int AWorkUserId) throws SQLException, DbException {
	String sql = " where WORK_USER_ID = ";
	sql = (sql + AWorkUserId);
	return WorkLog.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象workLog中
 * <param name="reader">数据源</param>
 * <param name="workLog">目标对象</param>
 */
public static void readValue(ResultSet reader, WorkLog workLog) throws SQLException, DbException {
	workLog.workLogId = reader.getInt(1);
	workLog.createTime = SqlUtils.getDate(reader, 2);
	workLog.modifyTime = SqlUtils.getDate(reader, 3);
	if (reader.wasNull()) {
		workLog.modifyTime = null;
	}
	workLog.workContent = reader.getString(4);
	if (reader.wasNull()) {
		workLog.workContent = null;
	}
	workLog.workDay = SqlUtils.getDate(reader, 5);
	workLog.workUserId = reader.getInt(6);
	workLog.workEvaluationScore = reader.getInt(7);
	if (reader.wasNull()) {
		workLog.workEvaluationScore = null;
	}
	workLog.workEvaluationContent = reader.getString(8);
	if (reader.wasNull()) {
		workLog.workEvaluationContent = null;
	}
}
}
