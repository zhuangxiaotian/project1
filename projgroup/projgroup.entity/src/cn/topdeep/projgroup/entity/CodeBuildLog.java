package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_CODE_BUILD_LOG: 构建记录
 */
public class CodeBuildLog extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * BUILD_LOG_ID: 构建标识
	 */
	int buildLogId;
	
	/**
	 * BUILD_ID: 构建标识
	 */
	int buildId;
	
	/**
	 * BUILD_STATE: 0构建准备 1构建中 2构建完成
	 */
	int buildState;
	
	/**
	 * BUILD_RESULT: 构建结果0，构建结果未知 1 构建成功 2构建失败
	 */
	int buildResult;
	
	/**
	 * BUILD_MESSAGE: 构建结果提示
	 */
	String buildMessage;
	
	/**
	 * BUILD_START_TIME: 构建开始时间
	 */
	java.util.Date buildStartTime;
	
	/**
	 * BUILD_END_TIME: 构建结束时间
	 */
	java.util.Date buildEndTime;
	
	/**
	 * BUILD_OPERATOR: 构建人
	 */
	String buildOperator;
	
	/**
	 * PUB0: 备用字段1
	 */
	String pub0;
	
	/**
	 * PUB1: 备用字段2
	 */
	String pub1;
	
	/**
	 * PUB2: 备用字段3
	 */
	String pub2;
	
	/**
	 * PUB3: 备用字段4
	 */
	String pub3;
	
	/**
	 * PUB4: 备用字段5
	 */
	String pub4;
	
	/**
	 * PUB5: 备用字段6
	 */
	String pub5;
	
	/**
	 * BUILD_LOG_ID: 构建标识
	 */
	public int getBuildLogId() {
		return this.buildLogId;
	}
	
	/**
	 * BUILD_LOG_ID: 构建标识
	 */
	public void setBuildLogId(int value)
	 {
		this.buildLogId = value;
	}
	
	/**
	 * BUILD_ID: 构建标识
	 */
	public int getBuildId() {
		return this.buildId;
	}
	
	/**
	 * BUILD_ID: 构建标识
	 */
	public void setBuildId(int value)
	 {
		this.buildId = value;
	}
	
	/**
	 * BUILD_STATE: 0构建准备 1构建中 2构建完成
	 */
	public int getBuildState() {
		return this.buildState;
	}
	
	/**
	 * BUILD_STATE: 0构建准备 1构建中 2构建完成
	 */
	public void setBuildState(int value)
	 {
		this.buildState = value;
	}
	
	/**
	 * BUILD_RESULT: 构建结果0，构建结果未知 1 构建成功 2构建失败
	 */
	public int getBuildResult() {
		return this.buildResult;
	}
	
	/**
	 * BUILD_RESULT: 构建结果0，构建结果未知 1 构建成功 2构建失败
	 */
	public void setBuildResult(int value)
	 {
		this.buildResult = value;
	}
	
	/**
	 * BUILD_MESSAGE: 构建结果提示
	 */
	public String getBuildMessage() {
		return this.buildMessage;
	}
	
	/**
	 * BUILD_MESSAGE: 构建结果提示
	 */
	public void setBuildMessage(String value)
	 {
		this.buildMessage = value;
	}
	
	/**
	 * BUILD_START_TIME: 构建开始时间
	 */
	public java.util.Date getBuildStartTime() {
		return this.buildStartTime;
	}
	
	/**
	 * BUILD_START_TIME: 构建开始时间
	 */
	public void setBuildStartTime(java.util.Date value)
	 {
		this.buildStartTime = value;
	}
	
	/**
	 * BUILD_END_TIME: 构建结束时间
	 */
	public java.util.Date getBuildEndTime() {
		return this.buildEndTime;
	}
	
	/**
	 * BUILD_END_TIME: 构建结束时间
	 */
	public void setBuildEndTime(java.util.Date value)
	 {
		this.buildEndTime = value;
	}
	
	/**
	 * BUILD_OPERATOR: 构建人
	 */
	public String getBuildOperator() {
		return this.buildOperator;
	}
	
	/**
	 * BUILD_OPERATOR: 构建人
	 */
	public void setBuildOperator(String value)
	 {
		this.buildOperator = value;
	}
	
	/**
	 * PUB0: 备用字段1
	 */
	public String getPub0() {
		return this.pub0;
	}
	
	/**
	 * PUB0: 备用字段1
	 */
	public void setPub0(String value)
	 {
		this.pub0 = value;
	}
	
	/**
	 * PUB1: 备用字段2
	 */
	public String getPub1() {
		return this.pub1;
	}
	
	/**
	 * PUB1: 备用字段2
	 */
	public void setPub1(String value)
	 {
		this.pub1 = value;
	}
	
	/**
	 * PUB2: 备用字段3
	 */
	public String getPub2() {
		return this.pub2;
	}
	
	/**
	 * PUB2: 备用字段3
	 */
	public void setPub2(String value)
	 {
		this.pub2 = value;
	}
	
	/**
	 * PUB3: 备用字段4
	 */
	public String getPub3() {
		return this.pub3;
	}
	
	/**
	 * PUB3: 备用字段4
	 */
	public void setPub3(String value)
	 {
		this.pub3 = value;
	}
	
	/**
	 * PUB4: 备用字段5
	 */
	public String getPub4() {
		return this.pub4;
	}
	
	/**
	 * PUB4: 备用字段5
	 */
	public void setPub4(String value)
	 {
		this.pub4 = value;
	}
	
	/**
	 * PUB5: 备用字段6
	 */
	public String getPub5() {
		return this.pub5;
	}
	
	/**
	 * PUB5: 备用字段6
	 */
	public void setPub5(String value)
	 {
		this.pub5 = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_CODE_BUILD_LOG].[BUILD_LOG_ID], [T_CODE_BUILD_LOG].[BUILD_ID], [T_CODE_BUILD_LOG].[BUILD_STATE], [T_CODE_BUILD_LOG].[BUILD_RESULT], [T_CODE_BUILD_LOG].[BUILD_MESSAGE], [T_CODE_BUILD_LOG].[BUILD_START_TIME], [T_CODE_BUILD_LOG].[BUILD_END_TIME], [T_CODE_BUILD_LOG].[BUILD_OPERATOR], [T_CODE_BUILD_LOG].[PUB0], [T_CODE_BUILD_LOG].[PUB1], [T_CODE_BUILD_LOG].[PUB2], [T_CODE_BUILD_LOG].[PUB3], [T_CODE_BUILD_LOG].[PUB4], [T_CODE_BUILD_LOG].[PUB5]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_CODE_BUILD_LOG].[BUILD_LOG_ID], [T_CODE_BUILD_LOG].[BUILD_ID], [T_CODE_BUILD_LOG].[BUILD_STATE], [T_CODE_BUILD_LOG].[BUILD_RESULT], [T_CODE_BUILD_LOG].[BUILD_MESSAGE], [T_CODE_BUILD_LOG].[BUILD_START_TIME], [T_CODE_BUILD_LOG].[BUILD_END_TIME], [T_CODE_BUILD_LOG].[BUILD_OPERATOR], [T_CODE_BUILD_LOG].[PUB0], [T_CODE_BUILD_LOG].[PUB1], [T_CODE_BUILD_LOG].[PUB2], [T_CODE_BUILD_LOG].[PUB3], [T_CODE_BUILD_LOG].[PUB4], [T_CODE_BUILD_LOG].[PUB5]   from [T_CODE_BUILD_LOG] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_CODE_BUILD_LOG].[BUILD_LOG_ID], [T_CODE_BUILD_LOG].[BUILD_ID], [T_CODE_BUILD_LOG].[BUILD_STATE], [T_CODE_BUILD_LOG].[BUILD_RESULT], [T_CODE_BUILD_LOG].[BUILD_MESSAGE], [T_CODE_BUILD_LOG].[BUILD_START_TIME], [T_CODE_BUILD_LOG].[BUILD_END_TIME], [T_CODE_BUILD_LOG].[BUILD_OPERATOR], [T_CODE_BUILD_LOG].[PUB0], [T_CODE_BUILD_LOG].[PUB1], [T_CODE_BUILD_LOG].[PUB2], [T_CODE_BUILD_LOG].[PUB3], [T_CODE_BUILD_LOG].[PUB4], [T_CODE_BUILD_LOG].[PUB5] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_CODE_BUILD_LOG";
	}
	
	
	public String getTableName() {
		return "T_CODE_BUILD_LOG";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "BUILD_LOG_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.buildLogId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (CodeBuildLog.class.isInstance(obj)) {
			CodeBuildLog o = ((CodeBuildLog)(obj));
			this.buildLogId = o.buildLogId;
			this.buildId = o.buildId;
			this.buildState = o.buildState;
			this.buildResult = o.buildResult;
			this.buildMessage = o.buildMessage;
			this.buildStartTime = o.buildStartTime;
			this.buildEndTime = o.buildEndTime;
			this.buildOperator = o.buildOperator;
			this.pub0 = o.pub0;
			this.pub1 = o.pub1;
			this.pub2 = o.pub2;
			this.pub3 = o.pub3;
			this.pub4 = o.pub4;
			this.pub5 = o.pub5;
		}
	}
	
	/**
	 * 插入CodeBuildLog对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="codeBuildLog">需要插入的构建记录</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, CodeBuildLog codeBuildLog) throws SQLException, DbException {
		String sql = "insert into [T_CODE_BUILD_LOG](";
		if ((codeBuildLog.getBuildLogId() > 0)) {
			sql = (sql + "[BUILD_LOG_ID], ");
		}
		sql = (sql + "[BUILD_ID]");
		sql = (sql + ", [BUILD_STATE]");
		sql = (sql + ", [BUILD_RESULT]");
		sql = (sql + ", [BUILD_MESSAGE]");
		sql = (sql + ", [BUILD_START_TIME]");
		sql = (sql + ", [BUILD_END_TIME]");
		sql = (sql + ", [BUILD_OPERATOR]");
		sql = (sql + ", [PUB0]");
		sql = (sql + ", [PUB1]");
		sql = (sql + ", [PUB2]");
		sql = (sql + ", [PUB3]");
		sql = (sql + ", [PUB4]");
		sql = (sql + ", [PUB5]");
		sql = (sql + ")values(");
		if ((codeBuildLog.getBuildLogId() > 0)) {
			sql = (sql + codeBuildLog.getBuildLogId());
			sql = (sql + ", ");
		}
		sql = (sql + codeBuildLog.getBuildId());
		sql = (sql + ", ");
		sql = (sql + codeBuildLog.getBuildState());
		sql = (sql + ", ");
		sql = (sql + codeBuildLog.getBuildResult());
		sql = (sql + ", ");
		if ((codeBuildLog.buildMessage == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(codeBuildLog.getBuildMessage().toString()));
		}
		sql = (sql + ", ");
		if ((codeBuildLog.buildStartTime == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(codeBuildLog.getBuildStartTime()));
		}
		sql = (sql + ", ");
		if ((codeBuildLog.buildEndTime == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(codeBuildLog.getBuildEndTime()));
		}
		sql = (sql + ", ");
		if ((codeBuildLog.buildOperator == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(codeBuildLog.getBuildOperator().toString()));
		}
		sql = (sql + ", ");
		if ((codeBuildLog.pub0 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(codeBuildLog.getPub0().toString()));
		}
		sql = (sql + ", ");
		if ((codeBuildLog.pub1 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(codeBuildLog.getPub1().toString()));
		}
		sql = (sql + ", ");
		if ((codeBuildLog.pub2 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(codeBuildLog.getPub2().toString()));
		}
		sql = (sql + ", ");
		if ((codeBuildLog.pub3 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(codeBuildLog.getPub3().toString()));
		}
		sql = (sql + ", ");
		if ((codeBuildLog.pub4 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(codeBuildLog.getPub4().toString()));
		}
		sql = (sql + ", ");
		if ((codeBuildLog.pub5 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(codeBuildLog.getPub5().toString()));
		}
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((codeBuildLog.getBuildLogId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_CODE_BUILD_LOG] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_CODE_BUILD_LOG off");
			}
			dataVisit.execSql(sql);
			if ((codeBuildLog.getBuildLogId() == 0)) {
				codeBuildLog.buildLogId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入CodeBuildLog对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		CodeBuildLog.insert(dataVisit, this);
	}
	
	/**
	 * 更新CodeBuildLog对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="codeBuildLog">需要更新的构建记录</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, CodeBuildLog codeBuildLog, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_CODE_BUILD_LOG] set ";
		sql = (sql + "[BUILD_ID] = ");
		sql = (sql + codeBuildLog.getBuildId());
		sql = (sql + ",");
		sql = (sql + "[BUILD_STATE] = ");
		sql = (sql + codeBuildLog.getBuildState());
		sql = (sql + ",");
		sql = (sql + "[BUILD_RESULT] = ");
		sql = (sql + codeBuildLog.getBuildResult());
		sql = (sql + ",");
		if ((codeBuildLog.buildMessage == null)) {
			sql = (sql + "[BUILD_MESSAGE] = default ,");
		}
		else {
			sql = (sql + "[BUILD_MESSAGE] = ");
			sql = (sql + SqlServerUtils.safeSql(codeBuildLog.getBuildMessage().toString()));
			sql = (sql + ",");
		}
		if ((codeBuildLog.buildStartTime == null)) {
			sql = (sql + "[BUILD_START_TIME] = default ,");
		}
		else {
			sql = (sql + "[BUILD_START_TIME] = ");
			sql = (sql + SqlServerUtils.getDateSql(codeBuildLog.getBuildStartTime()));
			sql = (sql + ",");
		}
		if ((codeBuildLog.buildEndTime == null)) {
			sql = (sql + "[BUILD_END_TIME] = default ,");
		}
		else {
			sql = (sql + "[BUILD_END_TIME] = ");
			sql = (sql + SqlServerUtils.getDateSql(codeBuildLog.getBuildEndTime()));
			sql = (sql + ",");
		}
		if ((codeBuildLog.buildOperator == null)) {
			sql = (sql + "[BUILD_OPERATOR] = default ,");
		}
		else {
			sql = (sql + "[BUILD_OPERATOR] = ");
			sql = (sql + SqlServerUtils.safeSql(codeBuildLog.getBuildOperator().toString()));
			sql = (sql + ",");
		}
		if ((codeBuildLog.pub0 == null)) {
			sql = (sql + "[PUB0] = default ,");
		}
		else {
			sql = (sql + "[PUB0] = ");
			sql = (sql + SqlServerUtils.safeSql(codeBuildLog.getPub0().toString()));
			sql = (sql + ",");
		}
		if ((codeBuildLog.pub1 == null)) {
			sql = (sql + "[PUB1] = default ,");
		}
		else {
			sql = (sql + "[PUB1] = ");
			sql = (sql + SqlServerUtils.safeSql(codeBuildLog.getPub1().toString()));
			sql = (sql + ",");
		}
		if ((codeBuildLog.pub2 == null)) {
			sql = (sql + "[PUB2] = default ,");
		}
		else {
			sql = (sql + "[PUB2] = ");
			sql = (sql + SqlServerUtils.safeSql(codeBuildLog.getPub2().toString()));
			sql = (sql + ",");
		}
		if ((codeBuildLog.pub3 == null)) {
			sql = (sql + "[PUB3] = default ,");
		}
		else {
			sql = (sql + "[PUB3] = ");
			sql = (sql + SqlServerUtils.safeSql(codeBuildLog.getPub3().toString()));
			sql = (sql + ",");
		}
		if ((codeBuildLog.pub4 == null)) {
			sql = (sql + "[PUB4] = default ,");
		}
		else {
			sql = (sql + "[PUB4] = ");
			sql = (sql + SqlServerUtils.safeSql(codeBuildLog.getPub4().toString()));
			sql = (sql + ",");
		}
		if ((codeBuildLog.pub5 == null)) {
			sql = (sql + "[PUB5] = default ,");
		}
		else {
			sql = (sql + "[PUB5] = ");
			sql = (sql + SqlServerUtils.safeSql(codeBuildLog.getPub5().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "BUILD_LOG_ID = ");
		sql = (sql + codeBuildLog.getBuildLogId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新CodeBuildLog对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="codeBuildLog">需要更新的构建记录</param>
	 */
	protected static int update(IDataVisit2 dataVisit, CodeBuildLog codeBuildLog) throws SQLException, DbException {
		return CodeBuildLog.update(dataVisit, codeBuildLog, "");
	}
	
	/**
	 * 更新CodeBuildLog对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return CodeBuildLog.update(dataVisit, this);
	}
	
	/**
	 * 更新CodeBuildLog对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return CodeBuildLog.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<CodeBuildLog> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<CodeBuildLog> list = new ArrayList<CodeBuildLog>();
		try {
			for (; reader.next(); ) {
				CodeBuildLog obj = new CodeBuildLog();
				CodeBuildLog.readValue(reader, obj);
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
	public static List<CodeBuildLog> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<CodeBuildLog> list = new ArrayList<CodeBuildLog>();
		try {
			for (; reader.next(); ) {
				CodeBuildLog obj = new CodeBuildLog();
				CodeBuildLog.readValue(reader, obj);
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
	public static List<CodeBuildLog> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((CodeBuildLog.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<CodeBuildLog> list = new ArrayList<CodeBuildLog>();
		try {
			for (; reader.next(); ) {
				CodeBuildLog obj = new CodeBuildLog();
				CodeBuildLog.readValue(reader, obj);
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
	public static List<CodeBuildLog> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((CodeBuildLog.getFullSelectSql() + appendConditionSql));
		List<CodeBuildLog> list = new ArrayList<CodeBuildLog>();
		try {
			for (; reader.next(); ) {
				CodeBuildLog obj = new CodeBuildLog();
				CodeBuildLog.readValue(reader, obj);
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
	public static <T extends CodeBuildLog> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((CodeBuildLog.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			CodeBuildLog.readValue(reader, obj);
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
public static <T extends CodeBuildLog> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((CodeBuildLog.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			CodeBuildLog.readValue(reader, obj);
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
	String sql = "select * from T_CODE_BUILD_LOG ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据构建标识查询CodeBuildLog
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ABuildLogId">构建标识</param>
 */
public static CodeBuildLog selectByBuildLogId(IDataVisit2 dataVisit, int ABuildLogId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "BUILD_LOG_ID = ");
	sql = (sql + ABuildLogId);
	List<CodeBuildLog> list = CodeBuildLog.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个CodeBuildLog对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ABuildLogId">构建标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByBuildLogId(IDataVisit2 dataVisit, int ABuildLogId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_CODE_BUILD_LOG] where ");
	sql = (sql + "BUILD_LOG_ID = ");
	sql = (sql + ABuildLogId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个CodeBuildLog对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ABuildLogId">构建标识</param>
 */
public static void deleteByBuildLogId(IDataVisit2 dataVisit, int ABuildLogId) throws SQLException, DbException {
	CodeBuildLog.deleteByBuildLogId(dataVisit, ABuildLogId, "");
}

/**
 * 根据外键构建标识删除一批CodeBuildLog对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="BuildId">构建标识</param>
 */
public static void deleteListByBuildId(IDataVisit2 dataVisit, int ABuildId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_CODE_BUILD_LOG] where ");
	sql = (sql + "BUILD_ID = ");
	sql = (sql + ABuildId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="BuildId">构建标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<CodeBuildLog> selectObjectsByBuildId(IDataVisit2 dataVisit, int ABuildId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where BUILD_ID = ";
	sql = (sql + ABuildId);
	sql = (sql + appendConditionSql);
	return CodeBuildLog.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="BuildId">构建标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<CodeBuildLog> selectObjectsByBuildId(IDataVisit2 dataVisit, int ABuildId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where BUILD_ID = ";
	sql = (sql + ABuildId);
	return CodeBuildLog.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="BuildId">构建标识</param>
 */
public static List<CodeBuildLog> selectObjectsByBuildId(IDataVisit2 dataVisit, int ABuildId) throws SQLException, DbException {
	String sql = " where BUILD_ID = ";
	sql = (sql + ABuildId);
	return CodeBuildLog.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象codeBuildLog中
 * <param name="reader">数据源</param>
 * <param name="codeBuildLog">目标对象</param>
 */
public static void readValue(ResultSet reader, CodeBuildLog codeBuildLog) throws SQLException, DbException {
	codeBuildLog.buildLogId = reader.getInt(1);
	codeBuildLog.buildId = reader.getInt(2);
	codeBuildLog.buildState = reader.getInt(3);
	codeBuildLog.buildResult = reader.getInt(4);
	codeBuildLog.buildMessage = reader.getString(5);
	if (reader.wasNull()) {
		codeBuildLog.buildMessage = null;
	}
	codeBuildLog.buildStartTime = SqlUtils.getDate(reader, 6);
	if (reader.wasNull()) {
		codeBuildLog.buildStartTime = null;
	}
	codeBuildLog.buildEndTime = SqlUtils.getDate(reader, 7);
	if (reader.wasNull()) {
		codeBuildLog.buildEndTime = null;
	}
	codeBuildLog.buildOperator = reader.getString(8);
	if (reader.wasNull()) {
		codeBuildLog.buildOperator = null;
	}
	codeBuildLog.pub0 = reader.getString(9);
	if (reader.wasNull()) {
		codeBuildLog.pub0 = null;
	}
	codeBuildLog.pub1 = reader.getString(10);
	if (reader.wasNull()) {
		codeBuildLog.pub1 = null;
	}
	codeBuildLog.pub2 = reader.getString(11);
	if (reader.wasNull()) {
		codeBuildLog.pub2 = null;
	}
	codeBuildLog.pub3 = reader.getString(12);
	if (reader.wasNull()) {
		codeBuildLog.pub3 = null;
	}
	codeBuildLog.pub4 = reader.getString(13);
	if (reader.wasNull()) {
		codeBuildLog.pub4 = null;
	}
	codeBuildLog.pub5 = reader.getString(14);
	if (reader.wasNull()) {
		codeBuildLog.pub5 = null;
	}
}
}
