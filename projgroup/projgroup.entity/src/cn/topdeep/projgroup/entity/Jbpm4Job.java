package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_JOB: 
 */
public class Jbpm4Job extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * DBID_: 
	 */
	double dbid;
	
	/**
	 * CLASS_: 
	 */
	String class_ = "";
	
	/**
	 * DBVERSION_: 
	 */
	int dbversion;
	
	/**
	 * DUEDATE_: 
	 */
	java.util.Date duedate;
	
	/**
	 * STATE_: 
	 */
	String state;
	
	/**
	 * ISEXCLUSIVE_: 
	 */
	Byte isexclusive;
	
	/**
	 * LOCKOWNER_: 
	 */
	String lockowner;
	
	/**
	 * LOCKEXPTIME_: 
	 */
	java.util.Date lockexptime;
	
	/**
	 * EXCEPTION_: 
	 */
	String exception;
	
	/**
	 * RETRIES_: 
	 */
	Integer retries;
	
	/**
	 * PROCESSINSTANCE_: 
	 */
	Double processinstance;
	
	/**
	 * EXECUTION_: 
	 */
	Double execution;
	
	/**
	 * CFG_: 
	 */
	Double cfg;
	
	/**
	 * SIGNAL_: 
	 */
	String signal;
	
	/**
	 * EVENT_: 
	 */
	String event_;
	
	/**
	 * REPEAT_: 
	 */
	String repeat;
	
	/**
	 * DBID_: 
	 */
	public double getDbid() {
		return this.dbid;
	}
	
	/**
	 * DBID_: 
	 */
	public void setDbid(double value)
	 {
		this.dbid = value;
	}
	
	/**
	 * CLASS_: 
	 */
	public String getClass_() {
		return this.class_;
	}
	
	/**
	 * CLASS_: 
	 */
	public void setClass_(String value)
	 {
		this.class_ = value;
	}
	
	/**
	 * DBVERSION_: 
	 */
	public int getDbversion() {
		return this.dbversion;
	}
	
	/**
	 * DBVERSION_: 
	 */
	public void setDbversion(int value)
	 {
		this.dbversion = value;
	}
	
	/**
	 * DUEDATE_: 
	 */
	public java.util.Date getDuedate() {
		return this.duedate;
	}
	
	/**
	 * DUEDATE_: 
	 */
	public void setDuedate(java.util.Date value)
	 {
		this.duedate = value;
	}
	
	/**
	 * STATE_: 
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * STATE_: 
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
	
	/**
	 * ISEXCLUSIVE_: 
	 */
	public Byte getIsexclusive() {
		return this.isexclusive;
	}
	
	/**
	 * ISEXCLUSIVE_: 
	 */
	public void setIsexclusive(Byte value)
	 {
		this.isexclusive = value;
	}
	
	/**
	 * LOCKOWNER_: 
	 */
	public String getLockowner() {
		return this.lockowner;
	}
	
	/**
	 * LOCKOWNER_: 
	 */
	public void setLockowner(String value)
	 {
		this.lockowner = value;
	}
	
	/**
	 * LOCKEXPTIME_: 
	 */
	public java.util.Date getLockexptime() {
		return this.lockexptime;
	}
	
	/**
	 * LOCKEXPTIME_: 
	 */
	public void setLockexptime(java.util.Date value)
	 {
		this.lockexptime = value;
	}
	
	/**
	 * EXCEPTION_: 
	 */
	public String getException() {
		return this.exception;
	}
	
	/**
	 * EXCEPTION_: 
	 */
	public void setException(String value)
	 {
		this.exception = value;
	}
	
	/**
	 * RETRIES_: 
	 */
	public Integer getRetries() {
		return this.retries;
	}
	
	/**
	 * RETRIES_: 
	 */
	public void setRetries(Integer value)
	 {
		this.retries = value;
	}
	
	/**
	 * PROCESSINSTANCE_: 
	 */
	public Double getProcessinstance() {
		return this.processinstance;
	}
	
	/**
	 * PROCESSINSTANCE_: 
	 */
	public void setProcessinstance(Double value)
	 {
		this.processinstance = value;
	}
	
	/**
	 * EXECUTION_: 
	 */
	public Double getExecution() {
		return this.execution;
	}
	
	/**
	 * EXECUTION_: 
	 */
	public void setExecution(Double value)
	 {
		this.execution = value;
	}
	
	/**
	 * CFG_: 
	 */
	public Double getCfg() {
		return this.cfg;
	}
	
	/**
	 * CFG_: 
	 */
	public void setCfg(Double value)
	 {
		this.cfg = value;
	}
	
	/**
	 * SIGNAL_: 
	 */
	public String getSignal() {
		return this.signal;
	}
	
	/**
	 * SIGNAL_: 
	 */
	public void setSignal(String value)
	 {
		this.signal = value;
	}
	
	/**
	 * EVENT_: 
	 */
	public String getEvent_() {
		return this.event_;
	}
	
	/**
	 * EVENT_: 
	 */
	public void setEvent_(String value)
	 {
		this.event_ = value;
	}
	
	/**
	 * REPEAT_: 
	 */
	public String getRepeat() {
		return this.repeat;
	}
	
	/**
	 * REPEAT_: 
	 */
	public void setRepeat(String value)
	 {
		this.repeat = value;
	}
	
	public static String getSelectSql() {
		return "select  [JBPM4_JOB].[DBID_], [JBPM4_JOB].[CLASS_], [JBPM4_JOB].[DBVERSION_], [JBPM4_JOB].[DUEDATE_], [JBPM4_JOB].[STATE_], [JBPM4_JOB].[ISEXCLUSIVE_], [JBPM4_JOB].[LOCKOWNER_], [JBPM4_JOB].[LOCKEXPTIME_], [JBPM4_JOB].[EXCEPTION_], [JBPM4_JOB].[RETRIES_], [JBPM4_JOB].[PROCESSINSTANCE_], [JBPM4_JOB].[EXECUTION_], [JBPM4_JOB].[CFG_], [JBPM4_JOB].[SIGNAL_], [JBPM4_JOB].[EVENT_], [JBPM4_JOB].[REPEAT_]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [JBPM4_JOB].[DBID_], [JBPM4_JOB].[CLASS_], [JBPM4_JOB].[DBVERSION_], [JBPM4_JOB].[DUEDATE_], [JBPM4_JOB].[STATE_], [JBPM4_JOB].[ISEXCLUSIVE_], [JBPM4_JOB].[LOCKOWNER_], [JBPM4_JOB].[LOCKEXPTIME_], [JBPM4_JOB].[EXCEPTION_], [JBPM4_JOB].[RETRIES_], [JBPM4_JOB].[PROCESSINSTANCE_], [JBPM4_JOB].[EXECUTION_], [JBPM4_JOB].[CFG_], [JBPM4_JOB].[SIGNAL_], [JBPM4_JOB].[EVENT_], [JBPM4_JOB].[REPEAT_]   from [JBPM4_JOB] ";
	}
	
	
	public static String getColumnSql() {
		return " [JBPM4_JOB].[DBID_], [JBPM4_JOB].[CLASS_], [JBPM4_JOB].[DBVERSION_], [JBPM4_JOB].[DUEDATE_], [JBPM4_JOB].[STATE_], [JBPM4_JOB].[ISEXCLUSIVE_], [JBPM4_JOB].[LOCKOWNER_], [JBPM4_JOB].[LOCKEXPTIME_], [JBPM4_JOB].[EXCEPTION_], [JBPM4_JOB].[RETRIES_], [JBPM4_JOB].[PROCESSINSTANCE_], [JBPM4_JOB].[EXECUTION_], [JBPM4_JOB].[CFG_], [JBPM4_JOB].[SIGNAL_], [JBPM4_JOB].[EVENT_], [JBPM4_JOB].[REPEAT_] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "JBPM4_JOB";
	}
	
	
	public String getTableName() {
		return "JBPM4_JOB";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "DBID_";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.dbid);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (Jbpm4Job.class.isInstance(obj)) {
			Jbpm4Job o = ((Jbpm4Job)(obj));
			this.dbid = o.dbid;
			this.class_ = o.class_;
			this.dbversion = o.dbversion;
			this.duedate = o.duedate;
			this.state = o.state;
			this.isexclusive = o.isexclusive;
			this.lockowner = o.lockowner;
			this.lockexptime = o.lockexptime;
			this.exception = o.exception;
			this.retries = o.retries;
			this.processinstance = o.processinstance;
			this.execution = o.execution;
			this.cfg = o.cfg;
			this.signal = o.signal;
			this.event_ = o.event_;
			this.repeat = o.repeat;
		}
	}
	
	/**
	 * 插入Jbpm4Job对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Job">需要插入的</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Jbpm4Job jbpm4Job) throws SQLException, DbException {
		String sql = "insert into [JBPM4_JOB](";
		sql = (sql + "[DBID_]");
		sql = (sql + ", [CLASS_]");
		sql = (sql + ", [DBVERSION_]");
		sql = (sql + ", [DUEDATE_]");
		sql = (sql + ", [STATE_]");
		sql = (sql + ", [ISEXCLUSIVE_]");
		sql = (sql + ", [LOCKOWNER_]");
		sql = (sql + ", [LOCKEXPTIME_]");
		sql = (sql + ", [EXCEPTION_]");
		sql = (sql + ", [RETRIES_]");
		sql = (sql + ", [PROCESSINSTANCE_]");
		sql = (sql + ", [EXECUTION_]");
		sql = (sql + ", [CFG_]");
		sql = (sql + ", [SIGNAL_]");
		sql = (sql + ", [EVENT_]");
		sql = (sql + ", [REPEAT_]");
		sql = (sql + ")values(");
		sql = (sql + jbpm4Job.getDbid());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(jbpm4Job.getClass_().toString()));
		sql = (sql + ", ");
		sql = (sql + jbpm4Job.getDbversion());
		sql = (sql + ", ");
		if ((jbpm4Job.duedate == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(jbpm4Job.getDuedate()));
		}
		sql = (sql + ", ");
		if ((jbpm4Job.state == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Job.getState().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Job.isexclusive == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Job.getIsexclusive());
		}
		sql = (sql + ", ");
		if ((jbpm4Job.lockowner == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Job.getLockowner().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Job.lockexptime == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(jbpm4Job.getLockexptime()));
		}
		sql = (sql + ", ");
		if ((jbpm4Job.exception == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Job.getException().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Job.retries == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Job.getRetries());
		}
		sql = (sql + ", ");
		if ((jbpm4Job.processinstance == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Job.getProcessinstance());
		}
		sql = (sql + ", ");
		if ((jbpm4Job.execution == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Job.getExecution());
		}
		sql = (sql + ", ");
		if ((jbpm4Job.cfg == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Job.getCfg());
		}
		sql = (sql + ", ");
		if ((jbpm4Job.signal == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Job.getSignal().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Job.event_ == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Job.getEvent_().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Job.repeat == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Job.getRepeat().toString()));
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入Jbpm4Job对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Jbpm4Job.insert(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4Job对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Job">需要更新的</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4Job jbpm4Job, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [JBPM4_JOB] set ";
		sql = (sql + "[CLASS_] = ");
		sql = (sql + SqlServerUtils.safeSql(jbpm4Job.getClass_().toString()));
		sql = (sql + ",");
		sql = (sql + "[DBVERSION_] = ");
		sql = (sql + jbpm4Job.getDbversion());
		sql = (sql + ",");
		if ((jbpm4Job.duedate == null)) {
			sql = (sql + "[DUEDATE_] = default ,");
		}
		else {
			sql = (sql + "[DUEDATE_] = ");
			sql = (sql + SqlServerUtils.getDateSql(jbpm4Job.getDuedate()));
			sql = (sql + ",");
		}
		if ((jbpm4Job.state == null)) {
			sql = (sql + "[STATE_] = default ,");
		}
		else {
			sql = (sql + "[STATE_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Job.getState().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Job.isexclusive == null)) {
			sql = (sql + "[ISEXCLUSIVE_] = default ,");
		}
		else {
			sql = (sql + "[ISEXCLUSIVE_] = ");
			sql = (sql + jbpm4Job.getIsexclusive());
			sql = (sql + ",");
		}
		if ((jbpm4Job.lockowner == null)) {
			sql = (sql + "[LOCKOWNER_] = default ,");
		}
		else {
			sql = (sql + "[LOCKOWNER_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Job.getLockowner().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Job.lockexptime == null)) {
			sql = (sql + "[LOCKEXPTIME_] = default ,");
		}
		else {
			sql = (sql + "[LOCKEXPTIME_] = ");
			sql = (sql + SqlServerUtils.getDateSql(jbpm4Job.getLockexptime()));
			sql = (sql + ",");
		}
		if ((jbpm4Job.exception == null)) {
			sql = (sql + "[EXCEPTION_] = default ,");
		}
		else {
			sql = (sql + "[EXCEPTION_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Job.getException().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Job.retries == null)) {
			sql = (sql + "[RETRIES_] = default ,");
		}
		else {
			sql = (sql + "[RETRIES_] = ");
			sql = (sql + jbpm4Job.getRetries());
			sql = (sql + ",");
		}
		if ((jbpm4Job.processinstance == null)) {
			sql = (sql + "[PROCESSINSTANCE_] = default ,");
		}
		else {
			sql = (sql + "[PROCESSINSTANCE_] = ");
			sql = (sql + jbpm4Job.getProcessinstance());
			sql = (sql + ",");
		}
		if ((jbpm4Job.execution == null)) {
			sql = (sql + "[EXECUTION_] = default ,");
		}
		else {
			sql = (sql + "[EXECUTION_] = ");
			sql = (sql + jbpm4Job.getExecution());
			sql = (sql + ",");
		}
		if ((jbpm4Job.cfg == null)) {
			sql = (sql + "[CFG_] = default ,");
		}
		else {
			sql = (sql + "[CFG_] = ");
			sql = (sql + jbpm4Job.getCfg());
			sql = (sql + ",");
		}
		if ((jbpm4Job.signal == null)) {
			sql = (sql + "[SIGNAL_] = default ,");
		}
		else {
			sql = (sql + "[SIGNAL_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Job.getSignal().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Job.event_ == null)) {
			sql = (sql + "[EVENT_] = default ,");
		}
		else {
			sql = (sql + "[EVENT_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Job.getEvent_().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Job.repeat == null)) {
			sql = (sql + "[REPEAT_] = default ,");
		}
		else {
			sql = (sql + "[REPEAT_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Job.getRepeat().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "DBID_ = ");
		sql = (sql + jbpm4Job.getDbid());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Jbpm4Job对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Job">需要更新的</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4Job jbpm4Job) throws SQLException, DbException {
		return Jbpm4Job.update(dataVisit, jbpm4Job, "");
	}
	
	/**
	 * 更新Jbpm4Job对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Jbpm4Job.update(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4Job对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Jbpm4Job.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Jbpm4Job> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Jbpm4Job> list = new ArrayList<Jbpm4Job>();
		try {
			for (; reader.next(); ) {
				Jbpm4Job obj = new Jbpm4Job();
				Jbpm4Job.readValue(reader, obj);
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
	public static List<Jbpm4Job> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4Job> list = new ArrayList<Jbpm4Job>();
		try {
			for (; reader.next(); ) {
				Jbpm4Job obj = new Jbpm4Job();
				Jbpm4Job.readValue(reader, obj);
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
	public static List<Jbpm4Job> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4Job.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4Job> list = new ArrayList<Jbpm4Job>();
		try {
			for (; reader.next(); ) {
				Jbpm4Job obj = new Jbpm4Job();
				Jbpm4Job.readValue(reader, obj);
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
	public static List<Jbpm4Job> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4Job.getFullSelectSql() + appendConditionSql));
		List<Jbpm4Job> list = new ArrayList<Jbpm4Job>();
		try {
			for (; reader.next(); ) {
				Jbpm4Job obj = new Jbpm4Job();
				Jbpm4Job.readValue(reader, obj);
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
	public static <T extends Jbpm4Job> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4Job.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4Job.readValue(reader, obj);
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
public static <T extends Jbpm4Job> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4Job.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4Job.readValue(reader, obj);
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
	String sql = "select * from JBPM4_JOB ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据查询Jbpm4Job
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static Jbpm4Job selectByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	List<Jbpm4Job> list = Jbpm4Job.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Jbpm4Job对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [JBPM4_JOB] where ");
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Jbpm4Job对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	Jbpm4Job.deleteByDbid(dataVisit, ADbid, "");
}

/**
 * 根据外键删除一批Jbpm4Job对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Cfg"></param>
 */
public static void deleteListByCfg(IDataVisit2 dataVisit, Double ACfg) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_JOB] where ");
	sql = (sql + "CFG_ = ");
	sql = (sql + ACfg);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Cfg"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Job> selectObjectsByCfg(IDataVisit2 dataVisit, Double ACfg, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where CFG_ = ";
	sql = (sql + ACfg);
	sql = (sql + appendConditionSql);
	return Jbpm4Job.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Cfg"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Job> selectObjectsByCfg(IDataVisit2 dataVisit, Double ACfg, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where CFG_ = ";
	sql = (sql + ACfg);
	return Jbpm4Job.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Cfg"></param>
 */
public static List<Jbpm4Job> selectObjectsByCfg(IDataVisit2 dataVisit, Double ACfg) throws SQLException, DbException {
	String sql = " where CFG_ = ";
	sql = (sql + ACfg);
	return Jbpm4Job.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象jbpm4Job中
 * <param name="reader">数据源</param>
 * <param name="jbpm4Job">目标对象</param>
 */
public static void readValue(ResultSet reader, Jbpm4Job jbpm4Job) throws SQLException, DbException {
	jbpm4Job.dbid = reader.getDouble(1);
	jbpm4Job.class_ = reader.getString(2);
	jbpm4Job.dbversion = reader.getInt(3);
	jbpm4Job.duedate = SqlUtils.getDate(reader, 4);
	if (reader.wasNull()) {
		jbpm4Job.duedate = null;
	}
	jbpm4Job.state = reader.getString(5);
	if (reader.wasNull()) {
		jbpm4Job.state = null;
	}
	jbpm4Job.isexclusive = reader.getByte(6);
	if (reader.wasNull()) {
		jbpm4Job.isexclusive = null;
	}
	jbpm4Job.lockowner = reader.getString(7);
	if (reader.wasNull()) {
		jbpm4Job.lockowner = null;
	}
	jbpm4Job.lockexptime = SqlUtils.getDate(reader, 8);
	if (reader.wasNull()) {
		jbpm4Job.lockexptime = null;
	}
	jbpm4Job.exception = reader.getString(9);
	if (reader.wasNull()) {
		jbpm4Job.exception = null;
	}
	jbpm4Job.retries = reader.getInt(10);
	if (reader.wasNull()) {
		jbpm4Job.retries = null;
	}
	jbpm4Job.processinstance = reader.getDouble(11);
	if (reader.wasNull()) {
		jbpm4Job.processinstance = null;
	}
	jbpm4Job.execution = reader.getDouble(12);
	if (reader.wasNull()) {
		jbpm4Job.execution = null;
	}
	jbpm4Job.cfg = reader.getDouble(13);
	if (reader.wasNull()) {
		jbpm4Job.cfg = null;
	}
	jbpm4Job.signal = reader.getString(14);
	if (reader.wasNull()) {
		jbpm4Job.signal = null;
	}
	jbpm4Job.event_ = reader.getString(15);
	if (reader.wasNull()) {
		jbpm4Job.event_ = null;
	}
	jbpm4Job.repeat = reader.getString(16);
	if (reader.wasNull()) {
		jbpm4Job.repeat = null;
	}
}
}
