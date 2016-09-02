package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_HIST_VAR: 
 */
public class Jbpm4HistVar extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * DBID_: 
	 */
	double dbid;
	
	/**
	 * DBVERSION_: 
	 */
	int dbversion;
	
	/**
	 * PROCINSTID_: 
	 */
	String procinstid;
	
	/**
	 * EXECUTIONID_: 
	 */
	String executionid;
	
	/**
	 * VARNAME_: 
	 */
	String varname;
	
	/**
	 * VALUE_: 
	 */
	String value;
	
	/**
	 * HPROCI_: 
	 */
	Double hproci;
	
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
	 * PROCINSTID_: 
	 */
	public String getProcinstid() {
		return this.procinstid;
	}
	
	/**
	 * PROCINSTID_: 
	 */
	public void setProcinstid(String value)
	 {
		this.procinstid = value;
	}
	
	/**
	 * EXECUTIONID_: 
	 */
	public String getExecutionid() {
		return this.executionid;
	}
	
	/**
	 * EXECUTIONID_: 
	 */
	public void setExecutionid(String value)
	 {
		this.executionid = value;
	}
	
	/**
	 * VARNAME_: 
	 */
	public String getVarname() {
		return this.varname;
	}
	
	/**
	 * VARNAME_: 
	 */
	public void setVarname(String value)
	 {
		this.varname = value;
	}
	
	/**
	 * VALUE_: 
	 */
	public String getValue() {
		return this.value;
	}
	
	/**
	 * VALUE_: 
	 */
	public void setValue(String value)
	 {
		this.value = value;
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
		return "select  [JBPM4_HIST_VAR].[DBID_], [JBPM4_HIST_VAR].[DBVERSION_], [JBPM4_HIST_VAR]" +
".[PROCINSTID_], [JBPM4_HIST_VAR].[EXECUTIONID_], [JBPM4_HIST_VAR].[VARNAME_], [J" +
"BPM4_HIST_VAR].[VALUE_], [JBPM4_HIST_VAR].[HPROCI_], [JBPM4_HIST_VAR].[HTASK_]  " +
"";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [JBPM4_HIST_VAR].[DBID_], [JBPM4_HIST_VAR].[DBVERSION_], [JBPM4_HIST_VAR].[PROCINSTID_], [JBPM4_HIST_VAR].[EXECUTIONID_], [JBPM4_HIST_VAR].[VARNAME_], [JBPM4_HIST_VAR].[VALUE_], [JBPM4_HIST_VAR].[HPROCI_], [JBPM4_HIST_VAR].[HTASK_]   from [JBPM4_HIST_VAR] ";
	}
	
	
	public static String getColumnSql() {
		return " [JBPM4_HIST_VAR].[DBID_], [JBPM4_HIST_VAR].[DBVERSION_], [JBPM4_HIST_VAR].[PROCI" +
"NSTID_], [JBPM4_HIST_VAR].[EXECUTIONID_], [JBPM4_HIST_VAR].[VARNAME_], [JBPM4_HI" +
"ST_VAR].[VALUE_], [JBPM4_HIST_VAR].[HPROCI_], [JBPM4_HIST_VAR].[HTASK_] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "JBPM4_HIST_VAR";
	}
	
	
	public String getTableName() {
		return "JBPM4_HIST_VAR";
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
		if (Jbpm4HistVar.class.isInstance(obj)) {
			Jbpm4HistVar o = ((Jbpm4HistVar)(obj));
			this.dbid = o.dbid;
			this.dbversion = o.dbversion;
			this.procinstid = o.procinstid;
			this.executionid = o.executionid;
			this.varname = o.varname;
			this.value = o.value;
			this.hproci = o.hproci;
			this.htask = o.htask;
		}
	}
	
	/**
	 * 插入Jbpm4HistVar对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4HistVar">需要插入的</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Jbpm4HistVar jbpm4HistVar) throws SQLException, DbException {
		String sql = "insert into [JBPM4_HIST_VAR](";
		sql = (sql + "[DBID_]");
		sql = (sql + ", [DBVERSION_]");
		sql = (sql + ", [PROCINSTID_]");
		sql = (sql + ", [EXECUTIONID_]");
		sql = (sql + ", [VARNAME_]");
		sql = (sql + ", [VALUE_]");
		sql = (sql + ", [HPROCI_]");
		sql = (sql + ", [HTASK_]");
		sql = (sql + ")values(");
		sql = (sql + jbpm4HistVar.getDbid());
		sql = (sql + ", ");
		sql = (sql + jbpm4HistVar.getDbversion());
		sql = (sql + ", ");
		if ((jbpm4HistVar.procinstid == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistVar.getProcinstid().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistVar.executionid == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistVar.getExecutionid().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistVar.varname == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistVar.getVarname().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistVar.value == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistVar.getValue().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistVar.hproci == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistVar.getHproci());
		}
		sql = (sql + ", ");
		if ((jbpm4HistVar.htask == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistVar.getHtask());
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入Jbpm4HistVar对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Jbpm4HistVar.insert(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4HistVar对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4HistVar">需要更新的</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4HistVar jbpm4HistVar, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [JBPM4_HIST_VAR] set ";
		sql = (sql + "[DBVERSION_] = ");
		sql = (sql + jbpm4HistVar.getDbversion());
		sql = (sql + ",");
		if ((jbpm4HistVar.procinstid == null)) {
			sql = (sql + "[PROCINSTID_] = default ,");
		}
		else {
			sql = (sql + "[PROCINSTID_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistVar.getProcinstid().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistVar.executionid == null)) {
			sql = (sql + "[EXECUTIONID_] = default ,");
		}
		else {
			sql = (sql + "[EXECUTIONID_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistVar.getExecutionid().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistVar.varname == null)) {
			sql = (sql + "[VARNAME_] = default ,");
		}
		else {
			sql = (sql + "[VARNAME_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistVar.getVarname().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistVar.value == null)) {
			sql = (sql + "[VALUE_] = default ,");
		}
		else {
			sql = (sql + "[VALUE_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistVar.getValue().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistVar.hproci == null)) {
			sql = (sql + "[HPROCI_] = default ,");
		}
		else {
			sql = (sql + "[HPROCI_] = ");
			sql = (sql + jbpm4HistVar.getHproci());
			sql = (sql + ",");
		}
		if ((jbpm4HistVar.htask == null)) {
			sql = (sql + "[HTASK_] = default ,");
		}
		else {
			sql = (sql + "[HTASK_] = ");
			sql = (sql + jbpm4HistVar.getHtask());
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "DBID_ = ");
		sql = (sql + jbpm4HistVar.getDbid());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Jbpm4HistVar对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4HistVar">需要更新的</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4HistVar jbpm4HistVar) throws SQLException, DbException {
		return Jbpm4HistVar.update(dataVisit, jbpm4HistVar, "");
	}
	
	/**
	 * 更新Jbpm4HistVar对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Jbpm4HistVar.update(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4HistVar对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Jbpm4HistVar.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Jbpm4HistVar> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Jbpm4HistVar> list = new ArrayList<Jbpm4HistVar>();
		try {
			for (; reader.next(); ) {
				Jbpm4HistVar obj = new Jbpm4HistVar();
				Jbpm4HistVar.readValue(reader, obj);
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
	public static List<Jbpm4HistVar> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4HistVar> list = new ArrayList<Jbpm4HistVar>();
		try {
			for (; reader.next(); ) {
				Jbpm4HistVar obj = new Jbpm4HistVar();
				Jbpm4HistVar.readValue(reader, obj);
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
	public static List<Jbpm4HistVar> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4HistVar.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4HistVar> list = new ArrayList<Jbpm4HistVar>();
		try {
			for (; reader.next(); ) {
				Jbpm4HistVar obj = new Jbpm4HistVar();
				Jbpm4HistVar.readValue(reader, obj);
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
	public static List<Jbpm4HistVar> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4HistVar.getFullSelectSql() + appendConditionSql));
		List<Jbpm4HistVar> list = new ArrayList<Jbpm4HistVar>();
		try {
			for (; reader.next(); ) {
				Jbpm4HistVar obj = new Jbpm4HistVar();
				Jbpm4HistVar.readValue(reader, obj);
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
	public static <T extends Jbpm4HistVar> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4HistVar.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4HistVar.readValue(reader, obj);
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
public static <T extends Jbpm4HistVar> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4HistVar.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4HistVar.readValue(reader, obj);
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
	String sql = "select * from JBPM4_HIST_VAR ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据查询Jbpm4HistVar
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static Jbpm4HistVar selectByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	List<Jbpm4HistVar> list = Jbpm4HistVar.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Jbpm4HistVar对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [JBPM4_HIST_VAR] where ");
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Jbpm4HistVar对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	Jbpm4HistVar.deleteByDbid(dataVisit, ADbid, "");
}

/**
 * 根据外键删除一批Jbpm4HistVar对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Hproci"></param>
 */
public static void deleteListByHproci(IDataVisit2 dataVisit, Double AHproci) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_HIST_VAR] where ");
	sql = (sql + "HPROCI_ = ");
	sql = (sql + AHproci);
	dataVisit.execSql(sql);
}

/**
 * 根据外键删除一批Jbpm4HistVar对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Htask"></param>
 */
public static void deleteListByHtask(IDataVisit2 dataVisit, Double AHtask) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_HIST_VAR] where ");
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
public static List<Jbpm4HistVar> selectObjectsByHproci(IDataVisit2 dataVisit, Double AHproci, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where HPROCI_ = ";
	sql = (sql + AHproci);
	sql = (sql + appendConditionSql);
	return Jbpm4HistVar.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
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
public static List<Jbpm4HistVar> selectObjectsByHproci(IDataVisit2 dataVisit, Double AHproci, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where HPROCI_ = ";
	sql = (sql + AHproci);
	return Jbpm4HistVar.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Hproci"></param>
 */
public static List<Jbpm4HistVar> selectObjectsByHproci(IDataVisit2 dataVisit, Double AHproci) throws SQLException, DbException {
	String sql = " where HPROCI_ = ";
	sql = (sql + AHproci);
	return Jbpm4HistVar.selectObjects(dataVisit, sql);
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
public static List<Jbpm4HistVar> selectObjectsByHtask(IDataVisit2 dataVisit, Double AHtask, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where HTASK_ = ";
	sql = (sql + AHtask);
	sql = (sql + appendConditionSql);
	return Jbpm4HistVar.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
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
public static List<Jbpm4HistVar> selectObjectsByHtask(IDataVisit2 dataVisit, Double AHtask, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where HTASK_ = ";
	sql = (sql + AHtask);
	return Jbpm4HistVar.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Htask"></param>
 */
public static List<Jbpm4HistVar> selectObjectsByHtask(IDataVisit2 dataVisit, Double AHtask) throws SQLException, DbException {
	String sql = " where HTASK_ = ";
	sql = (sql + AHtask);
	return Jbpm4HistVar.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象jbpm4HistVar中
 * <param name="reader">数据源</param>
 * <param name="jbpm4HistVar">目标对象</param>
 */
public static void readValue(ResultSet reader, Jbpm4HistVar jbpm4HistVar) throws SQLException, DbException {
	jbpm4HistVar.dbid = reader.getDouble(1);
	jbpm4HistVar.dbversion = reader.getInt(2);
	jbpm4HistVar.procinstid = reader.getString(3);
	if (reader.wasNull()) {
		jbpm4HistVar.procinstid = null;
	}
	jbpm4HistVar.executionid = reader.getString(4);
	if (reader.wasNull()) {
		jbpm4HistVar.executionid = null;
	}
	jbpm4HistVar.varname = reader.getString(5);
	if (reader.wasNull()) {
		jbpm4HistVar.varname = null;
	}
	jbpm4HistVar.value = reader.getString(6);
	if (reader.wasNull()) {
		jbpm4HistVar.value = null;
	}
	jbpm4HistVar.hproci = reader.getDouble(7);
	if (reader.wasNull()) {
		jbpm4HistVar.hproci = null;
	}
	jbpm4HistVar.htask = reader.getDouble(8);
	if (reader.wasNull()) {
		jbpm4HistVar.htask = null;
	}
}
}
