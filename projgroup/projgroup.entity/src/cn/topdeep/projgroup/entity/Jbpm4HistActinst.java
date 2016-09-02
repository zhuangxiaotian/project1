package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_HIST_ACTINST: 
 */
public class Jbpm4HistActinst extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
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
	 * HPROCI_: 
	 */
	Double hproci;
	
	/**
	 * TYPE_: 
	 */
	String type;
	
	/**
	 * EXECUTION_: 
	 */
	String execution;
	
	/**
	 * ACTIVITY_NAME_: 
	 */
	String activityName;
	
	/**
	 * START_: 
	 */
	java.util.Date start;
	
	/**
	 * END_: 
	 */
	java.util.Date end;
	
	/**
	 * DURATION_: 
	 */
	Double duration;
	
	/**
	 * TRANSITION_: 
	 */
	String transition;
	
	/**
	 * NEXTIDX_: 
	 */
	Integer nextidx;
	
	/**
	 * HTASK_: 
	 */
	Double htask;
	
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
	 * HPROCI_: 
	 */
	public Double getHproci() {
		return this.hproci;
	}
	
	/**
	 * HPROCI_: 
	 */
	public void setHproci(Double value)
	 {
		this.hproci = value;
	}
	
	/**
	 * TYPE_: 
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * TYPE_: 
	 */
	public void setType(String value)
	 {
		this.type = value;
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
	 * ACTIVITY_NAME_: 
	 */
	public String getActivityName() {
		return this.activityName;
	}
	
	/**
	 * ACTIVITY_NAME_: 
	 */
	public void setActivityName(String value)
	 {
		this.activityName = value;
	}
	
	/**
	 * START_: 
	 */
	public java.util.Date getStart() {
		return this.start;
	}
	
	/**
	 * START_: 
	 */
	public void setStart(java.util.Date value)
	 {
		this.start = value;
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
	 * TRANSITION_: 
	 */
	public String getTransition() {
		return this.transition;
	}
	
	/**
	 * TRANSITION_: 
	 */
	public void setTransition(String value)
	 {
		this.transition = value;
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
	 * HTASK_: 
	 */
	public Double getHtask() {
		return this.htask;
	}
	
	/**
	 * HTASK_: 
	 */
	public void setHtask(Double value)
	 {
		this.htask = value;
	}
	
	public static String getSelectSql() {
		return "select  [JBPM4_HIST_ACTINST].[DBID_], [JBPM4_HIST_ACTINST].[CLASS_], [JBPM4_HIST_ACTINST].[DBVERSION_], [JBPM4_HIST_ACTINST].[HPROCI_], [JBPM4_HIST_ACTINST].[TYPE_], [JBPM4_HIST_ACTINST].[EXECUTION_], [JBPM4_HIST_ACTINST].[ACTIVITY_NAME_], [JBPM4_HIST_ACTINST].[START_], [JBPM4_HIST_ACTINST].[END_], [JBPM4_HIST_ACTINST].[DURATION_], [JBPM4_HIST_ACTINST].[TRANSITION_], [JBPM4_HIST_ACTINST].[NEXTIDX_], [JBPM4_HIST_ACTINST].[HTASK_]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [JBPM4_HIST_ACTINST].[DBID_], [JBPM4_HIST_ACTINST].[CLASS_], [JBPM4_HIST_ACTINST].[DBVERSION_], [JBPM4_HIST_ACTINST].[HPROCI_], [JBPM4_HIST_ACTINST].[TYPE_], [JBPM4_HIST_ACTINST].[EXECUTION_], [JBPM4_HIST_ACTINST].[ACTIVITY_NAME_], [JBPM4_HIST_ACTINST].[START_], [JBPM4_HIST_ACTINST].[END_], [JBPM4_HIST_ACTINST].[DURATION_], [JBPM4_HIST_ACTINST].[TRANSITION_], [JBPM4_HIST_ACTINST].[NEXTIDX_], [JBPM4_HIST_ACTINST].[HTASK_]   from [JBPM4_HIST_ACTINST] ";
	}
	
	
	public static String getColumnSql() {
		return " [JBPM4_HIST_ACTINST].[DBID_], [JBPM4_HIST_ACTINST].[CLASS_], [JBPM4_HIST_ACTINST].[DBVERSION_], [JBPM4_HIST_ACTINST].[HPROCI_], [JBPM4_HIST_ACTINST].[TYPE_], [JBPM4_HIST_ACTINST].[EXECUTION_], [JBPM4_HIST_ACTINST].[ACTIVITY_NAME_], [JBPM4_HIST_ACTINST].[START_], [JBPM4_HIST_ACTINST].[END_], [JBPM4_HIST_ACTINST].[DURATION_], [JBPM4_HIST_ACTINST].[TRANSITION_], [JBPM4_HIST_ACTINST].[NEXTIDX_], [JBPM4_HIST_ACTINST].[HTASK_] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "JBPM4_HIST_ACTINST";
	}
	
	
	public String getTableName() {
		return "JBPM4_HIST_ACTINST";
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
		if (Jbpm4HistActinst.class.isInstance(obj)) {
			Jbpm4HistActinst o = ((Jbpm4HistActinst)(obj));
			this.dbid = o.dbid;
			this.class_ = o.class_;
			this.dbversion = o.dbversion;
			this.hproci = o.hproci;
			this.type = o.type;
			this.execution = o.execution;
			this.activityName = o.activityName;
			this.start = o.start;
			this.end = o.end;
			this.duration = o.duration;
			this.transition = o.transition;
			this.nextidx = o.nextidx;
			this.htask = o.htask;
		}
	}
	
	/**
	 * 插入Jbpm4HistActinst对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4HistActinst">需要插入的</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Jbpm4HistActinst jbpm4HistActinst) throws SQLException, DbException {
		String sql = "insert into [JBPM4_HIST_ACTINST](";
		sql = (sql + "[DBID_]");
		sql = (sql + ", [CLASS_]");
		sql = (sql + ", [DBVERSION_]");
		sql = (sql + ", [HPROCI_]");
		sql = (sql + ", [TYPE_]");
		sql = (sql + ", [EXECUTION_]");
		sql = (sql + ", [ACTIVITY_NAME_]");
		sql = (sql + ", [START_]");
		sql = (sql + ", [END_]");
		sql = (sql + ", [DURATION_]");
		sql = (sql + ", [TRANSITION_]");
		sql = (sql + ", [NEXTIDX_]");
		sql = (sql + ", [HTASK_]");
		sql = (sql + ")values(");
		sql = (sql + jbpm4HistActinst.getDbid());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(jbpm4HistActinst.getClass_().toString()));
		sql = (sql + ", ");
		sql = (sql + jbpm4HistActinst.getDbversion());
		sql = (sql + ", ");
		if ((jbpm4HistActinst.hproci == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistActinst.getHproci());
		}
		sql = (sql + ", ");
		if ((jbpm4HistActinst.type == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistActinst.getType().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistActinst.execution == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistActinst.getExecution().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistActinst.activityName == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistActinst.getActivityName().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistActinst.start == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(jbpm4HistActinst.getStart()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistActinst.end == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(jbpm4HistActinst.getEnd()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistActinst.duration == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistActinst.getDuration());
		}
		sql = (sql + ", ");
		if ((jbpm4HistActinst.transition == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistActinst.getTransition().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistActinst.nextidx == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistActinst.getNextidx());
		}
		sql = (sql + ", ");
		if ((jbpm4HistActinst.htask == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistActinst.getHtask());
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入Jbpm4HistActinst对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Jbpm4HistActinst.insert(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4HistActinst对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4HistActinst">需要更新的</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4HistActinst jbpm4HistActinst, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [JBPM4_HIST_ACTINST] set ";
		sql = (sql + "[CLASS_] = ");
		sql = (sql + SqlServerUtils.safeSql(jbpm4HistActinst.getClass_().toString()));
		sql = (sql + ",");
		sql = (sql + "[DBVERSION_] = ");
		sql = (sql + jbpm4HistActinst.getDbversion());
		sql = (sql + ",");
		if ((jbpm4HistActinst.hproci == null)) {
			sql = (sql + "[HPROCI_] = default ,");
		}
		else {
			sql = (sql + "[HPROCI_] = ");
			sql = (sql + jbpm4HistActinst.getHproci());
			sql = (sql + ",");
		}
		if ((jbpm4HistActinst.type == null)) {
			sql = (sql + "[TYPE_] = default ,");
		}
		else {
			sql = (sql + "[TYPE_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistActinst.getType().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistActinst.execution == null)) {
			sql = (sql + "[EXECUTION_] = default ,");
		}
		else {
			sql = (sql + "[EXECUTION_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistActinst.getExecution().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistActinst.activityName == null)) {
			sql = (sql + "[ACTIVITY_NAME_] = default ,");
		}
		else {
			sql = (sql + "[ACTIVITY_NAME_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistActinst.getActivityName().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistActinst.start == null)) {
			sql = (sql + "[START_] = default ,");
		}
		else {
			sql = (sql + "[START_] = ");
			sql = (sql + SqlServerUtils.getDateSql(jbpm4HistActinst.getStart()));
			sql = (sql + ",");
		}
		if ((jbpm4HistActinst.end == null)) {
			sql = (sql + "[END_] = default ,");
		}
		else {
			sql = (sql + "[END_] = ");
			sql = (sql + SqlServerUtils.getDateSql(jbpm4HistActinst.getEnd()));
			sql = (sql + ",");
		}
		if ((jbpm4HistActinst.duration == null)) {
			sql = (sql + "[DURATION_] = default ,");
		}
		else {
			sql = (sql + "[DURATION_] = ");
			sql = (sql + jbpm4HistActinst.getDuration());
			sql = (sql + ",");
		}
		if ((jbpm4HistActinst.transition == null)) {
			sql = (sql + "[TRANSITION_] = default ,");
		}
		else {
			sql = (sql + "[TRANSITION_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistActinst.getTransition().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistActinst.nextidx == null)) {
			sql = (sql + "[NEXTIDX_] = default ,");
		}
		else {
			sql = (sql + "[NEXTIDX_] = ");
			sql = (sql + jbpm4HistActinst.getNextidx());
			sql = (sql + ",");
		}
		if ((jbpm4HistActinst.htask == null)) {
			sql = (sql + "[HTASK_] = default ,");
		}
		else {
			sql = (sql + "[HTASK_] = ");
			sql = (sql + jbpm4HistActinst.getHtask());
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "DBID_ = ");
		sql = (sql + jbpm4HistActinst.getDbid());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Jbpm4HistActinst对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4HistActinst">需要更新的</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4HistActinst jbpm4HistActinst) throws SQLException, DbException {
		return Jbpm4HistActinst.update(dataVisit, jbpm4HistActinst, "");
	}
	
	/**
	 * 更新Jbpm4HistActinst对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Jbpm4HistActinst.update(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4HistActinst对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Jbpm4HistActinst.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Jbpm4HistActinst> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Jbpm4HistActinst> list = new ArrayList<Jbpm4HistActinst>();
		try {
			for (; reader.next(); ) {
				Jbpm4HistActinst obj = new Jbpm4HistActinst();
				Jbpm4HistActinst.readValue(reader, obj);
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
	public static List<Jbpm4HistActinst> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4HistActinst> list = new ArrayList<Jbpm4HistActinst>();
		try {
			for (; reader.next(); ) {
				Jbpm4HistActinst obj = new Jbpm4HistActinst();
				Jbpm4HistActinst.readValue(reader, obj);
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
	public static List<Jbpm4HistActinst> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4HistActinst.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4HistActinst> list = new ArrayList<Jbpm4HistActinst>();
		try {
			for (; reader.next(); ) {
				Jbpm4HistActinst obj = new Jbpm4HistActinst();
				Jbpm4HistActinst.readValue(reader, obj);
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
	public static List<Jbpm4HistActinst> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4HistActinst.getFullSelectSql() + appendConditionSql));
		List<Jbpm4HistActinst> list = new ArrayList<Jbpm4HistActinst>();
		try {
			for (; reader.next(); ) {
				Jbpm4HistActinst obj = new Jbpm4HistActinst();
				Jbpm4HistActinst.readValue(reader, obj);
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
	public static <T extends Jbpm4HistActinst> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4HistActinst.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4HistActinst.readValue(reader, obj);
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
public static <T extends Jbpm4HistActinst> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4HistActinst.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4HistActinst.readValue(reader, obj);
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
	String sql = "select * from JBPM4_HIST_ACTINST ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据查询Jbpm4HistActinst
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static Jbpm4HistActinst selectByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	List<Jbpm4HistActinst> list = Jbpm4HistActinst.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Jbpm4HistActinst对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [JBPM4_HIST_ACTINST] where ");
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Jbpm4HistActinst对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	Jbpm4HistActinst.deleteByDbid(dataVisit, ADbid, "");
}

/**
 * 根据外键删除一批Jbpm4HistActinst对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Hproci"></param>
 */
public static void deleteListByHproci(IDataVisit2 dataVisit, Double AHproci) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_HIST_ACTINST] where ");
	sql = (sql + "HPROCI_ = ");
	sql = (sql + AHproci);
	dataVisit.execSql(sql);
}

/**
 * 根据外键删除一批Jbpm4HistActinst对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Htask"></param>
 */
public static void deleteListByHtask(IDataVisit2 dataVisit, Double AHtask) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_HIST_ACTINST] where ");
	sql = (sql + "HTASK_ = ");
	sql = (sql + AHtask);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Hproci"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4HistActinst> selectObjectsByHproci(IDataVisit2 dataVisit, Double AHproci, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where HPROCI_ = ";
	sql = (sql + AHproci);
	sql = (sql + appendConditionSql);
	return Jbpm4HistActinst.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Hproci"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4HistActinst> selectObjectsByHproci(IDataVisit2 dataVisit, Double AHproci, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where HPROCI_ = ";
	sql = (sql + AHproci);
	return Jbpm4HistActinst.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Hproci"></param>
 */
public static List<Jbpm4HistActinst> selectObjectsByHproci(IDataVisit2 dataVisit, Double AHproci) throws SQLException, DbException {
	String sql = " where HPROCI_ = ";
	sql = (sql + AHproci);
	return Jbpm4HistActinst.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Htask"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4HistActinst> selectObjectsByHtask(IDataVisit2 dataVisit, Double AHtask, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where HTASK_ = ";
	sql = (sql + AHtask);
	sql = (sql + appendConditionSql);
	return Jbpm4HistActinst.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Htask"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4HistActinst> selectObjectsByHtask(IDataVisit2 dataVisit, Double AHtask, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where HTASK_ = ";
	sql = (sql + AHtask);
	return Jbpm4HistActinst.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Htask"></param>
 */
public static List<Jbpm4HistActinst> selectObjectsByHtask(IDataVisit2 dataVisit, Double AHtask) throws SQLException, DbException {
	String sql = " where HTASK_ = ";
	sql = (sql + AHtask);
	return Jbpm4HistActinst.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象jbpm4HistActinst中
 * <param name="reader">数据源</param>
 * <param name="jbpm4HistActinst">目标对象</param>
 */
public static void readValue(ResultSet reader, Jbpm4HistActinst jbpm4HistActinst) throws SQLException, DbException {
	jbpm4HistActinst.dbid = reader.getDouble(1);
	jbpm4HistActinst.class_ = reader.getString(2);
	jbpm4HistActinst.dbversion = reader.getInt(3);
	jbpm4HistActinst.hproci = reader.getDouble(4);
	if (reader.wasNull()) {
		jbpm4HistActinst.hproci = null;
	}
	jbpm4HistActinst.type = reader.getString(5);
	if (reader.wasNull()) {
		jbpm4HistActinst.type = null;
	}
	jbpm4HistActinst.execution = reader.getString(6);
	if (reader.wasNull()) {
		jbpm4HistActinst.execution = null;
	}
	jbpm4HistActinst.activityName = reader.getString(7);
	if (reader.wasNull()) {
		jbpm4HistActinst.activityName = null;
	}
	jbpm4HistActinst.start = SqlUtils.getDate(reader, 8);
	if (reader.wasNull()) {
		jbpm4HistActinst.start = null;
	}
	jbpm4HistActinst.end = SqlUtils.getDate(reader, 9);
	if (reader.wasNull()) {
		jbpm4HistActinst.end = null;
	}
	jbpm4HistActinst.duration = reader.getDouble(10);
	if (reader.wasNull()) {
		jbpm4HistActinst.duration = null;
	}
	jbpm4HistActinst.transition = reader.getString(11);
	if (reader.wasNull()) {
		jbpm4HistActinst.transition = null;
	}
	jbpm4HistActinst.nextidx = reader.getInt(12);
	if (reader.wasNull()) {
		jbpm4HistActinst.nextidx = null;
	}
	jbpm4HistActinst.htask = reader.getDouble(13);
	if (reader.wasNull()) {
		jbpm4HistActinst.htask = null;
	}
}
}
