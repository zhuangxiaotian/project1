package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_HIST_TASK: 
 */
public class Jbpm4HistTask extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * DBID_: 
	 */
	double dbid;
	
	/**
	 * DBVERSION_: 
	 */
	int dbversion;
	
	/**
	 * EXECUTION_: 
	 */
	String execution;
	
	/**
	 * OUTCOME_: 
	 */
	String outcome;
	
	/**
	 * ASSIGNEE_: 
	 */
	String assignee;
	
	/**
	 * PRIORITY_: 
	 */
	Integer priority;
	
	/**
	 * STATE_: 
	 */
	String state;
	
	/**
	 * CREATE_: 
	 */
	java.util.Date create;
	
	/**
	 * END_: 
	 */
	java.util.Date end;
	
	/**
	 * DURATION_: 
	 */
	Double duration;
	
	/**
	 * NEXTIDX_: 
	 */
	Integer nextidx;
	
	/**
	 * SUPERTASK_: 
	 */
	Double supertask;
	
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
	 * EXECUTION_: 
	 */
	public String getExecution() {
		return this.execution;
	}
	
	/**
	 * EXECUTION_: 
	 */
	public void setExecution(String value)
	 {
		this.execution = value;
	}
	
	/**
	 * OUTCOME_: 
	 */
	public String getOutcome() {
		return this.outcome;
	}
	
	/**
	 * OUTCOME_: 
	 */
	public void setOutcome(String value)
	 {
		this.outcome = value;
	}
	
	/**
	 * ASSIGNEE_: 
	 */
	public String getAssignee() {
		return this.assignee;
	}
	
	/**
	 * ASSIGNEE_: 
	 */
	public void setAssignee(String value)
	 {
		this.assignee = value;
	}
	
	/**
	 * PRIORITY_: 
	 */
	public Integer getPriority() {
		return this.priority;
	}
	
	/**
	 * PRIORITY_: 
	 */
	public void setPriority(Integer value)
	 {
		this.priority = value;
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
	 * CREATE_: 
	 */
	public java.util.Date getCreate() {
		return this.create;
	}
	
	/**
	 * CREATE_: 
	 */
	public void setCreate(java.util.Date value)
	 {
		this.create = value;
	}
	
	/**
	 * END_: 
	 */
	public java.util.Date getEnd() {
		return this.end;
	}
	
	/**
	 * END_: 
	 */
	public void setEnd(java.util.Date value)
	 {
		this.end = value;
	}
	
	/**
	 * DURATION_: 
	 */
	public Double getDuration() {
		return this.duration;
	}
	
	/**
	 * DURATION_: 
	 */
	public void setDuration(Double value)
	 {
		this.duration = value;
	}
	
	/**
	 * NEXTIDX_: 
	 */
	public Integer getNextidx() {
		return this.nextidx;
	}
	
	/**
	 * NEXTIDX_: 
	 */
	public void setNextidx(Integer value)
	 {
		this.nextidx = value;
	}
	
	/**
	 * SUPERTASK_: 
	 */
	public Double getSupertask() {
		return this.supertask;
	}
	
	/**
	 * SUPERTASK_: 
	 */
	public void setSupertask(Double value)
	 {
		this.supertask = value;
	}
	
	public static String getSelectSql() {
		return "select  [JBPM4_HIST_TASK].[DBID_], [JBPM4_HIST_TASK].[DBVERSION_], [JBPM4_HIST_TASK].[EXECUTION_], [JBPM4_HIST_TASK].[OUTCOME_], [JBPM4_HIST_TASK].[ASSIGNEE_], [JBPM4_HIST_TASK].[PRIORITY_], [JBPM4_HIST_TASK].[STATE_], [JBPM4_HIST_TASK].[CREATE_], [JBPM4_HIST_TASK].[END_], [JBPM4_HIST_TASK].[DURATION_], [JBPM4_HIST_TASK].[NEXTIDX_], [JBPM4_HIST_TASK].[SUPERTASK_]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [JBPM4_HIST_TASK].[DBID_], [JBPM4_HIST_TASK].[DBVERSION_], [JBPM4_HIST_TASK].[EXECUTION_], [JBPM4_HIST_TASK].[OUTCOME_], [JBPM4_HIST_TASK].[ASSIGNEE_], [JBPM4_HIST_TASK].[PRIORITY_], [JBPM4_HIST_TASK].[STATE_], [JBPM4_HIST_TASK].[CREATE_], [JBPM4_HIST_TASK].[END_], [JBPM4_HIST_TASK].[DURATION_], [JBPM4_HIST_TASK].[NEXTIDX_], [JBPM4_HIST_TASK].[SUPERTASK_]   from [JBPM4_HIST_TASK] ";
	}
	
	
	public static String getColumnSql() {
		return " [JBPM4_HIST_TASK].[DBID_], [JBPM4_HIST_TASK].[DBVERSION_], [JBPM4_HIST_TASK].[EXECUTION_], [JBPM4_HIST_TASK].[OUTCOME_], [JBPM4_HIST_TASK].[ASSIGNEE_], [JBPM4_HIST_TASK].[PRIORITY_], [JBPM4_HIST_TASK].[STATE_], [JBPM4_HIST_TASK].[CREATE_], [JBPM4_HIST_TASK].[END_], [JBPM4_HIST_TASK].[DURATION_], [JBPM4_HIST_TASK].[NEXTIDX_], [JBPM4_HIST_TASK].[SUPERTASK_] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "JBPM4_HIST_TASK";
	}
	
	
	public String getTableName() {
		return "JBPM4_HIST_TASK";
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
		if (Jbpm4HistTask.class.isInstance(obj)) {
			Jbpm4HistTask o = ((Jbpm4HistTask)(obj));
			this.dbid = o.dbid;
			this.dbversion = o.dbversion;
			this.execution = o.execution;
			this.outcome = o.outcome;
			this.assignee = o.assignee;
			this.priority = o.priority;
			this.state = o.state;
			this.create = o.create;
			this.end = o.end;
			this.duration = o.duration;
			this.nextidx = o.nextidx;
			this.supertask = o.supertask;
		}
	}
	
	/**
	 * 插入Jbpm4HistTask对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4HistTask">需要插入的</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Jbpm4HistTask jbpm4HistTask) throws SQLException, DbException {
		String sql = "insert into [JBPM4_HIST_TASK](";
		sql = (sql + "[DBID_]");
		sql = (sql + ", [DBVERSION_]");
		sql = (sql + ", [EXECUTION_]");
		sql = (sql + ", [OUTCOME_]");
		sql = (sql + ", [ASSIGNEE_]");
		sql = (sql + ", [PRIORITY_]");
		sql = (sql + ", [STATE_]");
		sql = (sql + ", [CREATE_]");
		sql = (sql + ", [END_]");
		sql = (sql + ", [DURATION_]");
		sql = (sql + ", [NEXTIDX_]");
		sql = (sql + ", [SUPERTASK_]");
		sql = (sql + ")values(");
		sql = (sql + jbpm4HistTask.getDbid());
		sql = (sql + ", ");
		sql = (sql + jbpm4HistTask.getDbversion());
		sql = (sql + ", ");
		if ((jbpm4HistTask.execution == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistTask.getExecution().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistTask.outcome == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistTask.getOutcome().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistTask.assignee == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistTask.getAssignee().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistTask.priority == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistTask.getPriority());
		}
		sql = (sql + ", ");
		if ((jbpm4HistTask.state == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistTask.getState().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistTask.create == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(jbpm4HistTask.getCreate()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistTask.end == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(jbpm4HistTask.getEnd()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistTask.duration == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistTask.getDuration());
		}
		sql = (sql + ", ");
		if ((jbpm4HistTask.nextidx == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistTask.getNextidx());
		}
		sql = (sql + ", ");
		if ((jbpm4HistTask.supertask == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistTask.getSupertask());
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入Jbpm4HistTask对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Jbpm4HistTask.insert(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4HistTask对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4HistTask">需要更新的</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4HistTask jbpm4HistTask, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [JBPM4_HIST_TASK] set ";
		sql = (sql + "[DBVERSION_] = ");
		sql = (sql + jbpm4HistTask.getDbversion());
		sql = (sql + ",");
		if ((jbpm4HistTask.execution == null)) {
			sql = (sql + "[EXECUTION_] = default ,");
		}
		else {
			sql = (sql + "[EXECUTION_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistTask.getExecution().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistTask.outcome == null)) {
			sql = (sql + "[OUTCOME_] = default ,");
		}
		else {
			sql = (sql + "[OUTCOME_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistTask.getOutcome().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistTask.assignee == null)) {
			sql = (sql + "[ASSIGNEE_] = default ,");
		}
		else {
			sql = (sql + "[ASSIGNEE_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistTask.getAssignee().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistTask.priority == null)) {
			sql = (sql + "[PRIORITY_] = default ,");
		}
		else {
			sql = (sql + "[PRIORITY_] = ");
			sql = (sql + jbpm4HistTask.getPriority());
			sql = (sql + ",");
		}
		if ((jbpm4HistTask.state == null)) {
			sql = (sql + "[STATE_] = default ,");
		}
		else {
			sql = (sql + "[STATE_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistTask.getState().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistTask.create == null)) {
			sql = (sql + "[CREATE_] = default ,");
		}
		else {
			sql = (sql + "[CREATE_] = ");
			sql = (sql + SqlServerUtils.getDateSql(jbpm4HistTask.getCreate()));
			sql = (sql + ",");
		}
		if ((jbpm4HistTask.end == null)) {
			sql = (sql + "[END_] = default ,");
		}
		else {
			sql = (sql + "[END_] = ");
			sql = (sql + SqlServerUtils.getDateSql(jbpm4HistTask.getEnd()));
			sql = (sql + ",");
		}
		if ((jbpm4HistTask.duration == null)) {
			sql = (sql + "[DURATION_] = default ,");
		}
		else {
			sql = (sql + "[DURATION_] = ");
			sql = (sql + jbpm4HistTask.getDuration());
			sql = (sql + ",");
		}
		if ((jbpm4HistTask.nextidx == null)) {
			sql = (sql + "[NEXTIDX_] = default ,");
		}
		else {
			sql = (sql + "[NEXTIDX_] = ");
			sql = (sql + jbpm4HistTask.getNextidx());
			sql = (sql + ",");
		}
		if ((jbpm4HistTask.supertask == null)) {
			sql = (sql + "[SUPERTASK_] = default ,");
		}
		else {
			sql = (sql + "[SUPERTASK_] = ");
			sql = (sql + jbpm4HistTask.getSupertask());
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "DBID_ = ");
		sql = (sql + jbpm4HistTask.getDbid());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Jbpm4HistTask对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4HistTask">需要更新的</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4HistTask jbpm4HistTask) throws SQLException, DbException {
		return Jbpm4HistTask.update(dataVisit, jbpm4HistTask, "");
	}
	
	/**
	 * 更新Jbpm4HistTask对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Jbpm4HistTask.update(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4HistTask对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Jbpm4HistTask.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Jbpm4HistTask> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Jbpm4HistTask> list = new ArrayList<Jbpm4HistTask>();
		try {
			for (; reader.next(); ) {
				Jbpm4HistTask obj = new Jbpm4HistTask();
				Jbpm4HistTask.readValue(reader, obj);
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
	public static List<Jbpm4HistTask> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4HistTask> list = new ArrayList<Jbpm4HistTask>();
		try {
			for (; reader.next(); ) {
				Jbpm4HistTask obj = new Jbpm4HistTask();
				Jbpm4HistTask.readValue(reader, obj);
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
	public static List<Jbpm4HistTask> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4HistTask.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4HistTask> list = new ArrayList<Jbpm4HistTask>();
		try {
			for (; reader.next(); ) {
				Jbpm4HistTask obj = new Jbpm4HistTask();
				Jbpm4HistTask.readValue(reader, obj);
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
	public static List<Jbpm4HistTask> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4HistTask.getFullSelectSql() + appendConditionSql));
		List<Jbpm4HistTask> list = new ArrayList<Jbpm4HistTask>();
		try {
			for (; reader.next(); ) {
				Jbpm4HistTask obj = new Jbpm4HistTask();
				Jbpm4HistTask.readValue(reader, obj);
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
	public static <T extends Jbpm4HistTask> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4HistTask.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4HistTask.readValue(reader, obj);
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
public static <T extends Jbpm4HistTask> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4HistTask.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4HistTask.readValue(reader, obj);
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
	String sql = "select * from JBPM4_HIST_TASK ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据查询Jbpm4HistTask
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static Jbpm4HistTask selectByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	List<Jbpm4HistTask> list = Jbpm4HistTask.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Jbpm4HistTask对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [JBPM4_HIST_TASK] where ");
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Jbpm4HistTask对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	Jbpm4HistTask.deleteByDbid(dataVisit, ADbid, "");
}

/**
 * 根据外键删除一批Jbpm4HistTask对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Supertask"></param>
 */
public static void deleteListBySupertask(IDataVisit2 dataVisit, Double ASupertask) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_HIST_TASK] where ");
	sql = (sql + "SUPERTASK_ = ");
	sql = (sql + ASupertask);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Supertask"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4HistTask> selectObjectsBySupertask(IDataVisit2 dataVisit, Double ASupertask, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where SUPERTASK_ = ";
	sql = (sql + ASupertask);
	sql = (sql + appendConditionSql);
	return Jbpm4HistTask.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Supertask"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4HistTask> selectObjectsBySupertask(IDataVisit2 dataVisit, Double ASupertask, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where SUPERTASK_ = ";
	sql = (sql + ASupertask);
	return Jbpm4HistTask.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Supertask"></param>
 */
public static List<Jbpm4HistTask> selectObjectsBySupertask(IDataVisit2 dataVisit, Double ASupertask) throws SQLException, DbException {
	String sql = " where SUPERTASK_ = ";
	sql = (sql + ASupertask);
	return Jbpm4HistTask.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象jbpm4HistTask中
 * <param name="reader">数据源</param>
 * <param name="jbpm4HistTask">目标对象</param>
 */
public static void readValue(ResultSet reader, Jbpm4HistTask jbpm4HistTask) throws SQLException, DbException {
	jbpm4HistTask.dbid = reader.getDouble(1);
	jbpm4HistTask.dbversion = reader.getInt(2);
	jbpm4HistTask.execution = reader.getString(3);
	if (reader.wasNull()) {
		jbpm4HistTask.execution = null;
	}
	jbpm4HistTask.outcome = reader.getString(4);
	if (reader.wasNull()) {
		jbpm4HistTask.outcome = null;
	}
	jbpm4HistTask.assignee = reader.getString(5);
	if (reader.wasNull()) {
		jbpm4HistTask.assignee = null;
	}
	jbpm4HistTask.priority = reader.getInt(6);
	if (reader.wasNull()) {
		jbpm4HistTask.priority = null;
	}
	jbpm4HistTask.state = reader.getString(7);
	if (reader.wasNull()) {
		jbpm4HistTask.state = null;
	}
	jbpm4HistTask.create = SqlUtils.getDate(reader, 8);
	if (reader.wasNull()) {
		jbpm4HistTask.create = null;
	}
	jbpm4HistTask.end = SqlUtils.getDate(reader, 9);
	if (reader.wasNull()) {
		jbpm4HistTask.end = null;
	}
	jbpm4HistTask.duration = reader.getDouble(10);
	if (reader.wasNull()) {
		jbpm4HistTask.duration = null;
	}
	jbpm4HistTask.nextidx = reader.getInt(11);
	if (reader.wasNull()) {
		jbpm4HistTask.nextidx = null;
	}
	jbpm4HistTask.supertask = reader.getDouble(12);
	if (reader.wasNull()) {
		jbpm4HistTask.supertask = null;
	}
}
}
