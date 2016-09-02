package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_SWIMLANE: 
 */
public class Jbpm4Swimlane extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * DBID_: 
	 */
	double dbid;
	
	/**
	 * DBVERSION_: 
	 */
	int dbversion;
	
	/**
	 * NAME_: 
	 */
	String name;
	
	/**
	 * ASSIGNEE_: 
	 */
	String assignee;
	
	/**
	 * EXECUTION_: 
	 */
	Double execution;
	
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
	 * NAME_: 
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * NAME_: 
	 */
	public void setName(String value)
	 {
		this.name = value;
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
	
	public static String getSelectSql() {
		return "select  [JBPM4_SWIMLANE].[DBID_], [JBPM4_SWIMLANE].[DBVERSION_], [JBPM4_SWIMLANE]" +
".[NAME_], [JBPM4_SWIMLANE].[ASSIGNEE_], [JBPM4_SWIMLANE].[EXECUTION_]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [JBPM4_SWIMLANE].[DBID_], [JBPM4_SWIMLANE].[DBVERSION_], [JBPM4_SWIMLANE]" +
".[NAME_], [JBPM4_SWIMLANE].[ASSIGNEE_], [JBPM4_SWIMLANE].[EXECUTION_]   from [JB" +
"PM4_SWIMLANE] ";
	}
	
	
	public static String getColumnSql() {
		return " [JBPM4_SWIMLANE].[DBID_], [JBPM4_SWIMLANE].[DBVERSION_], [JBPM4_SWIMLANE].[NAME_" +
"], [JBPM4_SWIMLANE].[ASSIGNEE_], [JBPM4_SWIMLANE].[EXECUTION_] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "JBPM4_SWIMLANE";
	}
	
	
	public String getTableName() {
		return "JBPM4_SWIMLANE";
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
		if (Jbpm4Swimlane.class.isInstance(obj)) {
			Jbpm4Swimlane o = ((Jbpm4Swimlane)(obj));
			this.dbid = o.dbid;
			this.dbversion = o.dbversion;
			this.name = o.name;
			this.assignee = o.assignee;
			this.execution = o.execution;
		}
	}
	
	/**
	 * 插入Jbpm4Swimlane对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Swimlane">需要插入的</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Jbpm4Swimlane jbpm4Swimlane) throws SQLException, DbException {
		String sql = "insert into [JBPM4_SWIMLANE](";
		sql = (sql + "[DBID_]");
		sql = (sql + ", [DBVERSION_]");
		sql = (sql + ", [NAME_]");
		sql = (sql + ", [ASSIGNEE_]");
		sql = (sql + ", [EXECUTION_]");
		sql = (sql + ")values(");
		sql = (sql + jbpm4Swimlane.getDbid());
		sql = (sql + ", ");
		sql = (sql + jbpm4Swimlane.getDbversion());
		sql = (sql + ", ");
		if ((jbpm4Swimlane.name == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Swimlane.getName().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Swimlane.assignee == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Swimlane.getAssignee().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Swimlane.execution == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Swimlane.getExecution());
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入Jbpm4Swimlane对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Jbpm4Swimlane.insert(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4Swimlane对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Swimlane">需要更新的</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4Swimlane jbpm4Swimlane, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [JBPM4_SWIMLANE] set ";
		sql = (sql + "[DBVERSION_] = ");
		sql = (sql + jbpm4Swimlane.getDbversion());
		sql = (sql + ",");
		if ((jbpm4Swimlane.name == null)) {
			sql = (sql + "[NAME_] = default ,");
		}
		else {
			sql = (sql + "[NAME_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Swimlane.getName().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Swimlane.assignee == null)) {
			sql = (sql + "[ASSIGNEE_] = default ,");
		}
		else {
			sql = (sql + "[ASSIGNEE_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Swimlane.getAssignee().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Swimlane.execution == null)) {
			sql = (sql + "[EXECUTION_] = default ,");
		}
		else {
			sql = (sql + "[EXECUTION_] = ");
			sql = (sql + jbpm4Swimlane.getExecution());
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "DBID_ = ");
		sql = (sql + jbpm4Swimlane.getDbid());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Jbpm4Swimlane对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Swimlane">需要更新的</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4Swimlane jbpm4Swimlane) throws SQLException, DbException {
		return Jbpm4Swimlane.update(dataVisit, jbpm4Swimlane, "");
	}
	
	/**
	 * 更新Jbpm4Swimlane对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Jbpm4Swimlane.update(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4Swimlane对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Jbpm4Swimlane.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Jbpm4Swimlane> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Jbpm4Swimlane> list = new ArrayList<Jbpm4Swimlane>();
		try {
			for (; reader.next(); ) {
				Jbpm4Swimlane obj = new Jbpm4Swimlane();
				Jbpm4Swimlane.readValue(reader, obj);
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
	public static List<Jbpm4Swimlane> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4Swimlane> list = new ArrayList<Jbpm4Swimlane>();
		try {
			for (; reader.next(); ) {
				Jbpm4Swimlane obj = new Jbpm4Swimlane();
				Jbpm4Swimlane.readValue(reader, obj);
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
	public static List<Jbpm4Swimlane> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4Swimlane.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4Swimlane> list = new ArrayList<Jbpm4Swimlane>();
		try {
			for (; reader.next(); ) {
				Jbpm4Swimlane obj = new Jbpm4Swimlane();
				Jbpm4Swimlane.readValue(reader, obj);
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
	public static List<Jbpm4Swimlane> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4Swimlane.getFullSelectSql() + appendConditionSql));
		List<Jbpm4Swimlane> list = new ArrayList<Jbpm4Swimlane>();
		try {
			for (; reader.next(); ) {
				Jbpm4Swimlane obj = new Jbpm4Swimlane();
				Jbpm4Swimlane.readValue(reader, obj);
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
	public static <T extends Jbpm4Swimlane> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4Swimlane.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4Swimlane.readValue(reader, obj);
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
public static <T extends Jbpm4Swimlane> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4Swimlane.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4Swimlane.readValue(reader, obj);
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
	String sql = "select * from JBPM4_SWIMLANE ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据查询Jbpm4Swimlane
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static Jbpm4Swimlane selectByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	List<Jbpm4Swimlane> list = Jbpm4Swimlane.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Jbpm4Swimlane对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [JBPM4_SWIMLANE] where ");
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Jbpm4Swimlane对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	Jbpm4Swimlane.deleteByDbid(dataVisit, ADbid, "");
}

/**
 * 根据外键删除一批Jbpm4Swimlane对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Execution"></param>
 */
public static void deleteListByExecution(IDataVisit2 dataVisit, Double AExecution) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_SWIMLANE] where ");
	sql = (sql + "EXECUTION_ = ");
	sql = (sql + AExecution);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Execution"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Swimlane> selectObjectsByExecution(IDataVisit2 dataVisit, Double AExecution, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where EXECUTION_ = ";
	sql = (sql + AExecution);
	sql = (sql + appendConditionSql);
	return Jbpm4Swimlane.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Execution"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Swimlane> selectObjectsByExecution(IDataVisit2 dataVisit, Double AExecution, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where EXECUTION_ = ";
	sql = (sql + AExecution);
	return Jbpm4Swimlane.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Execution"></param>
 */
public static List<Jbpm4Swimlane> selectObjectsByExecution(IDataVisit2 dataVisit, Double AExecution) throws SQLException, DbException {
	String sql = " where EXECUTION_ = ";
	sql = (sql + AExecution);
	return Jbpm4Swimlane.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象jbpm4Swimlane中
 * <param name="reader">数据源</param>
 * <param name="jbpm4Swimlane">目标对象</param>
 */
public static void readValue(ResultSet reader, Jbpm4Swimlane jbpm4Swimlane) throws SQLException, DbException {
	jbpm4Swimlane.dbid = reader.getDouble(1);
	jbpm4Swimlane.dbversion = reader.getInt(2);
	jbpm4Swimlane.name = reader.getString(3);
	if (reader.wasNull()) {
		jbpm4Swimlane.name = null;
	}
	jbpm4Swimlane.assignee = reader.getString(4);
	if (reader.wasNull()) {
		jbpm4Swimlane.assignee = null;
	}
	jbpm4Swimlane.execution = reader.getDouble(5);
	if (reader.wasNull()) {
		jbpm4Swimlane.execution = null;
	}
}
}
