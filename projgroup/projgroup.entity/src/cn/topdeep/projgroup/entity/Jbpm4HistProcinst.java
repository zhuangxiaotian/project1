package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_HIST_PROCINST: 
 */
public class Jbpm4HistProcinst extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * DBID_: 
	 */
	double dbid;
	
	/**
	 * DBVERSION_: 
	 */
	int dbversion;
	
	/**
	 * ID_: 
	 */
	String id;
	
	/**
	 * PROCDEFID_: 
	 */
	String procdefid;
	
	/**
	 * KEY_: 
	 */
	String key;
	
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
	 * STATE_: 
	 */
	String state;
	
	/**
	 * ENDACTIVITY_: 
	 */
	String endactivity;
	
	/**
	 * NEXTIDX_: 
	 */
	Integer nextidx;
	
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
	 * ID_: 
	 */
	public String getId() {
		return this.id;
	}
	
	/**
	 * ID_: 
	 */
	public void setId(String value)
	 {
		this.id = value;
	}
	
	/**
	 * PROCDEFID_: 
	 */
	public String getProcdefid() {
		return this.procdefid;
	}
	
	/**
	 * PROCDEFID_: 
	 */
	public void setProcdefid(String value)
	 {
		this.procdefid = value;
	}
	
	/**
	 * KEY_: 
	 */
	public String getKey() {
		return this.key;
	}
	
	/**
	 * KEY_: 
	 */
	public void setKey(String value)
	 {
		this.key = value;
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
	 * ENDACTIVITY_: 
	 */
	public String getEndactivity() {
		return this.endactivity;
	}
	
	/**
	 * ENDACTIVITY_: 
	 */
	public void setEndactivity(String value)
	 {
		this.endactivity = value;
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
	
	public static String getSelectSql() {
		return "select  [JBPM4_HIST_PROCINST].[DBID_], [JBPM4_HIST_PROCINST].[DBVERSION_], [JBPM4_HIST_PROCINST].[ID_], [JBPM4_HIST_PROCINST].[PROCDEFID_], [JBPM4_HIST_PROCINST].[KEY_], [JBPM4_HIST_PROCINST].[START_], [JBPM4_HIST_PROCINST].[END_], [JBPM4_HIST_PROCINST].[DURATION_], [JBPM4_HIST_PROCINST].[STATE_], [JBPM4_HIST_PROCINST].[ENDACTIVITY_], [JBPM4_HIST_PROCINST].[NEXTIDX_]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [JBPM4_HIST_PROCINST].[DBID_], [JBPM4_HIST_PROCINST].[DBVERSION_], [JBPM4_HIST_PROCINST].[ID_], [JBPM4_HIST_PROCINST].[PROCDEFID_], [JBPM4_HIST_PROCINST].[KEY_], [JBPM4_HIST_PROCINST].[START_], [JBPM4_HIST_PROCINST].[END_], [JBPM4_HIST_PROCINST].[DURATION_], [JBPM4_HIST_PROCINST].[STATE_], [JBPM4_HIST_PROCINST].[ENDACTIVITY_], [JBPM4_HIST_PROCINST].[NEXTIDX_]   from [JBPM4_HIST_PROCINST] ";
	}
	
	
	public static String getColumnSql() {
		return " [JBPM4_HIST_PROCINST].[DBID_], [JBPM4_HIST_PROCINST].[DBVERSION_], [JBPM4_HIST_PROCINST].[ID_], [JBPM4_HIST_PROCINST].[PROCDEFID_], [JBPM4_HIST_PROCINST].[KEY_], [JBPM4_HIST_PROCINST].[START_], [JBPM4_HIST_PROCINST].[END_], [JBPM4_HIST_PROCINST].[DURATION_], [JBPM4_HIST_PROCINST].[STATE_], [JBPM4_HIST_PROCINST].[ENDACTIVITY_], [JBPM4_HIST_PROCINST].[NEXTIDX_] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "JBPM4_HIST_PROCINST";
	}
	
	
	public String getTableName() {
		return "JBPM4_HIST_PROCINST";
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
		if (Jbpm4HistProcinst.class.isInstance(obj)) {
			Jbpm4HistProcinst o = ((Jbpm4HistProcinst)(obj));
			this.dbid = o.dbid;
			this.dbversion = o.dbversion;
			this.id = o.id;
			this.procdefid = o.procdefid;
			this.key = o.key;
			this.start = o.start;
			this.end = o.end;
			this.duration = o.duration;
			this.state = o.state;
			this.endactivity = o.endactivity;
			this.nextidx = o.nextidx;
		}
	}
	
	/**
	 * 插入Jbpm4HistProcinst对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4HistProcinst">需要插入的</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Jbpm4HistProcinst jbpm4HistProcinst) throws SQLException, DbException {
		String sql = "insert into [JBPM4_HIST_PROCINST](";
		sql = (sql + "[DBID_]");
		sql = (sql + ", [DBVERSION_]");
		sql = (sql + ", [ID_]");
		sql = (sql + ", [PROCDEFID_]");
		sql = (sql + ", [KEY_]");
		sql = (sql + ", [START_]");
		sql = (sql + ", [END_]");
		sql = (sql + ", [DURATION_]");
		sql = (sql + ", [STATE_]");
		sql = (sql + ", [ENDACTIVITY_]");
		sql = (sql + ", [NEXTIDX_]");
		sql = (sql + ")values(");
		sql = (sql + jbpm4HistProcinst.getDbid());
		sql = (sql + ", ");
		sql = (sql + jbpm4HistProcinst.getDbversion());
		sql = (sql + ", ");
		if ((jbpm4HistProcinst.id == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistProcinst.getId().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistProcinst.procdefid == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistProcinst.getProcdefid().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistProcinst.key == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistProcinst.getKey().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistProcinst.start == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(jbpm4HistProcinst.getStart()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistProcinst.end == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(jbpm4HistProcinst.getEnd()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistProcinst.duration == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistProcinst.getDuration());
		}
		sql = (sql + ", ");
		if ((jbpm4HistProcinst.state == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistProcinst.getState().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistProcinst.endactivity == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistProcinst.getEndactivity().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistProcinst.nextidx == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistProcinst.getNextidx());
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入Jbpm4HistProcinst对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Jbpm4HistProcinst.insert(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4HistProcinst对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4HistProcinst">需要更新的</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4HistProcinst jbpm4HistProcinst, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [JBPM4_HIST_PROCINST] set ";
		sql = (sql + "[DBVERSION_] = ");
		sql = (sql + jbpm4HistProcinst.getDbversion());
		sql = (sql + ",");
		if ((jbpm4HistProcinst.id == null)) {
			sql = (sql + "[ID_] = default ,");
		}
		else {
			sql = (sql + "[ID_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistProcinst.getId().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistProcinst.procdefid == null)) {
			sql = (sql + "[PROCDEFID_] = default ,");
		}
		else {
			sql = (sql + "[PROCDEFID_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistProcinst.getProcdefid().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistProcinst.key == null)) {
			sql = (sql + "[KEY_] = default ,");
		}
		else {
			sql = (sql + "[KEY_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistProcinst.getKey().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistProcinst.start == null)) {
			sql = (sql + "[START_] = default ,");
		}
		else {
			sql = (sql + "[START_] = ");
			sql = (sql + SqlServerUtils.getDateSql(jbpm4HistProcinst.getStart()));
			sql = (sql + ",");
		}
		if ((jbpm4HistProcinst.end == null)) {
			sql = (sql + "[END_] = default ,");
		}
		else {
			sql = (sql + "[END_] = ");
			sql = (sql + SqlServerUtils.getDateSql(jbpm4HistProcinst.getEnd()));
			sql = (sql + ",");
		}
		if ((jbpm4HistProcinst.duration == null)) {
			sql = (sql + "[DURATION_] = default ,");
		}
		else {
			sql = (sql + "[DURATION_] = ");
			sql = (sql + jbpm4HistProcinst.getDuration());
			sql = (sql + ",");
		}
		if ((jbpm4HistProcinst.state == null)) {
			sql = (sql + "[STATE_] = default ,");
		}
		else {
			sql = (sql + "[STATE_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistProcinst.getState().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistProcinst.endactivity == null)) {
			sql = (sql + "[ENDACTIVITY_] = default ,");
		}
		else {
			sql = (sql + "[ENDACTIVITY_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistProcinst.getEndactivity().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistProcinst.nextidx == null)) {
			sql = (sql + "[NEXTIDX_] = default ,");
		}
		else {
			sql = (sql + "[NEXTIDX_] = ");
			sql = (sql + jbpm4HistProcinst.getNextidx());
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "DBID_ = ");
		sql = (sql + jbpm4HistProcinst.getDbid());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Jbpm4HistProcinst对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4HistProcinst">需要更新的</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4HistProcinst jbpm4HistProcinst) throws SQLException, DbException {
		return Jbpm4HistProcinst.update(dataVisit, jbpm4HistProcinst, "");
	}
	
	/**
	 * 更新Jbpm4HistProcinst对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Jbpm4HistProcinst.update(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4HistProcinst对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Jbpm4HistProcinst.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Jbpm4HistProcinst> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Jbpm4HistProcinst> list = new ArrayList<Jbpm4HistProcinst>();
		try {
			for (; reader.next(); ) {
				Jbpm4HistProcinst obj = new Jbpm4HistProcinst();
				Jbpm4HistProcinst.readValue(reader, obj);
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
	public static List<Jbpm4HistProcinst> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4HistProcinst> list = new ArrayList<Jbpm4HistProcinst>();
		try {
			for (; reader.next(); ) {
				Jbpm4HistProcinst obj = new Jbpm4HistProcinst();
				Jbpm4HistProcinst.readValue(reader, obj);
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
	public static List<Jbpm4HistProcinst> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4HistProcinst.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4HistProcinst> list = new ArrayList<Jbpm4HistProcinst>();
		try {
			for (; reader.next(); ) {
				Jbpm4HistProcinst obj = new Jbpm4HistProcinst();
				Jbpm4HistProcinst.readValue(reader, obj);
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
	public static List<Jbpm4HistProcinst> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4HistProcinst.getFullSelectSql() + appendConditionSql));
		List<Jbpm4HistProcinst> list = new ArrayList<Jbpm4HistProcinst>();
		try {
			for (; reader.next(); ) {
				Jbpm4HistProcinst obj = new Jbpm4HistProcinst();
				Jbpm4HistProcinst.readValue(reader, obj);
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
	public static <T extends Jbpm4HistProcinst> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4HistProcinst.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4HistProcinst.readValue(reader, obj);
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
public static <T extends Jbpm4HistProcinst> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4HistProcinst.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4HistProcinst.readValue(reader, obj);
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
	String sql = "select * from JBPM4_HIST_PROCINST ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据查询Jbpm4HistProcinst
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static Jbpm4HistProcinst selectByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	List<Jbpm4HistProcinst> list = Jbpm4HistProcinst.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Jbpm4HistProcinst对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [JBPM4_HIST_PROCINST] where ");
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Jbpm4HistProcinst对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	Jbpm4HistProcinst.deleteByDbid(dataVisit, ADbid, "");
}

/**
 * 从reader读到数据到对象jbpm4HistProcinst中
 * <param name="reader">数据源</param>
 * <param name="jbpm4HistProcinst">目标对象</param>
 */
public static void readValue(ResultSet reader, Jbpm4HistProcinst jbpm4HistProcinst) throws SQLException, DbException {
	jbpm4HistProcinst.dbid = reader.getDouble(1);
	jbpm4HistProcinst.dbversion = reader.getInt(2);
	jbpm4HistProcinst.id = reader.getString(3);
	if (reader.wasNull()) {
		jbpm4HistProcinst.id = null;
	}
	jbpm4HistProcinst.procdefid = reader.getString(4);
	if (reader.wasNull()) {
		jbpm4HistProcinst.procdefid = null;
	}
	jbpm4HistProcinst.key = reader.getString(5);
	if (reader.wasNull()) {
		jbpm4HistProcinst.key = null;
	}
	jbpm4HistProcinst.start = SqlUtils.getDate(reader, 6);
	if (reader.wasNull()) {
		jbpm4HistProcinst.start = null;
	}
	jbpm4HistProcinst.end = SqlUtils.getDate(reader, 7);
	if (reader.wasNull()) {
		jbpm4HistProcinst.end = null;
	}
	jbpm4HistProcinst.duration = reader.getDouble(8);
	if (reader.wasNull()) {
		jbpm4HistProcinst.duration = null;
	}
	jbpm4HistProcinst.state = reader.getString(9);
	if (reader.wasNull()) {
		jbpm4HistProcinst.state = null;
	}
	jbpm4HistProcinst.endactivity = reader.getString(10);
	if (reader.wasNull()) {
		jbpm4HistProcinst.endactivity = null;
	}
	jbpm4HistProcinst.nextidx = reader.getInt(11);
	if (reader.wasNull()) {
		jbpm4HistProcinst.nextidx = null;
	}
}
}
