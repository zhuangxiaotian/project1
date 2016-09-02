package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_DEPLOYPROP: 
 */
public class Jbpm4Deployprop extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * DBID_: 
	 */
	double dbid;
	
	/**
	 * DEPLOYMENT_: 
	 */
	Double deployment;
	
	/**
	 * OBJNAME_: 
	 */
	String objname;
	
	/**
	 * KEY_: 
	 */
	String key;
	
	/**
	 * STRINGVAL_: 
	 */
	String stringval;
	
	/**
	 * LONGVAL_: 
	 */
	Double longval;
	
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
	 * DEPLOYMENT_: 
	 */
	public Double getDeployment() {
		return this.deployment;
	}
	
	/**
	 * DEPLOYMENT_: 
	 */
	public void setDeployment(Double value)
	 {
		this.deployment = value;
	}
	
	/**
	 * OBJNAME_: 
	 */
	public String getObjname() {
		return this.objname;
	}
	
	/**
	 * OBJNAME_: 
	 */
	public void setObjname(String value)
	 {
		this.objname = value;
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
	 * STRINGVAL_: 
	 */
	public String getStringval() {
		return this.stringval;
	}
	
	/**
	 * STRINGVAL_: 
	 */
	public void setStringval(String value)
	 {
		this.stringval = value;
	}
	
	/**
	 * LONGVAL_: 
	 */
	public Double getLongval() {
		return this.longval;
	}
	
	/**
	 * LONGVAL_: 
	 */
	public void setLongval(Double value)
	 {
		this.longval = value;
	}
	
	public static String getSelectSql() {
		return "select  [JBPM4_DEPLOYPROP].[DBID_], [JBPM4_DEPLOYPROP].[DEPLOYMENT_], [JBPM4_DEPL" +
"OYPROP].[OBJNAME_], [JBPM4_DEPLOYPROP].[KEY_], [JBPM4_DEPLOYPROP].[STRINGVAL_], " +
"[JBPM4_DEPLOYPROP].[LONGVAL_]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [JBPM4_DEPLOYPROP].[DBID_], [JBPM4_DEPLOYPROP].[DEPLOYMENT_], [JBPM4_DEPL" +
"OYPROP].[OBJNAME_], [JBPM4_DEPLOYPROP].[KEY_], [JBPM4_DEPLOYPROP].[STRINGVAL_], " +
"[JBPM4_DEPLOYPROP].[LONGVAL_]   from [JBPM4_DEPLOYPROP] ";
	}
	
	
	public static String getColumnSql() {
		return " [JBPM4_DEPLOYPROP].[DBID_], [JBPM4_DEPLOYPROP].[DEPLOYMENT_], [JBPM4_DEPLOYPROP]" +
".[OBJNAME_], [JBPM4_DEPLOYPROP].[KEY_], [JBPM4_DEPLOYPROP].[STRINGVAL_], [JBPM4_" +
"DEPLOYPROP].[LONGVAL_] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "JBPM4_DEPLOYPROP";
	}
	
	
	public String getTableName() {
		return "JBPM4_DEPLOYPROP";
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
		if (Jbpm4Deployprop.class.isInstance(obj)) {
			Jbpm4Deployprop o = ((Jbpm4Deployprop)(obj));
			this.dbid = o.dbid;
			this.deployment = o.deployment;
			this.objname = o.objname;
			this.key = o.key;
			this.stringval = o.stringval;
			this.longval = o.longval;
		}
	}
	
	/**
	 * 插入Jbpm4Deployprop对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Deployprop">需要插入的</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Jbpm4Deployprop jbpm4Deployprop) throws SQLException, DbException {
		String sql = "insert into [JBPM4_DEPLOYPROP](";
		sql = (sql + "[DBID_]");
		sql = (sql + ", [DEPLOYMENT_]");
		sql = (sql + ", [OBJNAME_]");
		sql = (sql + ", [KEY_]");
		sql = (sql + ", [STRINGVAL_]");
		sql = (sql + ", [LONGVAL_]");
		sql = (sql + ")values(");
		sql = (sql + jbpm4Deployprop.getDbid());
		sql = (sql + ", ");
		if ((jbpm4Deployprop.deployment == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Deployprop.getDeployment());
		}
		sql = (sql + ", ");
		if ((jbpm4Deployprop.objname == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Deployprop.getObjname().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Deployprop.key == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Deployprop.getKey().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Deployprop.stringval == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Deployprop.getStringval().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Deployprop.longval == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Deployprop.getLongval());
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入Jbpm4Deployprop对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Jbpm4Deployprop.insert(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4Deployprop对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Deployprop">需要更新的</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4Deployprop jbpm4Deployprop, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [JBPM4_DEPLOYPROP] set ";
		if ((jbpm4Deployprop.deployment == null)) {
			sql = (sql + "[DEPLOYMENT_] = default ,");
		}
		else {
			sql = (sql + "[DEPLOYMENT_] = ");
			sql = (sql + jbpm4Deployprop.getDeployment());
			sql = (sql + ",");
		}
		if ((jbpm4Deployprop.objname == null)) {
			sql = (sql + "[OBJNAME_] = default ,");
		}
		else {
			sql = (sql + "[OBJNAME_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Deployprop.getObjname().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Deployprop.key == null)) {
			sql = (sql + "[KEY_] = default ,");
		}
		else {
			sql = (sql + "[KEY_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Deployprop.getKey().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Deployprop.stringval == null)) {
			sql = (sql + "[STRINGVAL_] = default ,");
		}
		else {
			sql = (sql + "[STRINGVAL_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Deployprop.getStringval().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Deployprop.longval == null)) {
			sql = (sql + "[LONGVAL_] = default ,");
		}
		else {
			sql = (sql + "[LONGVAL_] = ");
			sql = (sql + jbpm4Deployprop.getLongval());
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "DBID_ = ");
		sql = (sql + jbpm4Deployprop.getDbid());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Jbpm4Deployprop对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Deployprop">需要更新的</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4Deployprop jbpm4Deployprop) throws SQLException, DbException {
		return Jbpm4Deployprop.update(dataVisit, jbpm4Deployprop, "");
	}
	
	/**
	 * 更新Jbpm4Deployprop对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Jbpm4Deployprop.update(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4Deployprop对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Jbpm4Deployprop.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Jbpm4Deployprop> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Jbpm4Deployprop> list = new ArrayList<Jbpm4Deployprop>();
		try {
			for (; reader.next(); ) {
				Jbpm4Deployprop obj = new Jbpm4Deployprop();
				Jbpm4Deployprop.readValue(reader, obj);
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
	public static List<Jbpm4Deployprop> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4Deployprop> list = new ArrayList<Jbpm4Deployprop>();
		try {
			for (; reader.next(); ) {
				Jbpm4Deployprop obj = new Jbpm4Deployprop();
				Jbpm4Deployprop.readValue(reader, obj);
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
	public static List<Jbpm4Deployprop> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4Deployprop.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4Deployprop> list = new ArrayList<Jbpm4Deployprop>();
		try {
			for (; reader.next(); ) {
				Jbpm4Deployprop obj = new Jbpm4Deployprop();
				Jbpm4Deployprop.readValue(reader, obj);
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
	public static List<Jbpm4Deployprop> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4Deployprop.getFullSelectSql() + appendConditionSql));
		List<Jbpm4Deployprop> list = new ArrayList<Jbpm4Deployprop>();
		try {
			for (; reader.next(); ) {
				Jbpm4Deployprop obj = new Jbpm4Deployprop();
				Jbpm4Deployprop.readValue(reader, obj);
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
	public static <T extends Jbpm4Deployprop> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4Deployprop.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4Deployprop.readValue(reader, obj);
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
public static <T extends Jbpm4Deployprop> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4Deployprop.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4Deployprop.readValue(reader, obj);
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
	String sql = "select * from JBPM4_DEPLOYPROP ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据查询Jbpm4Deployprop
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static Jbpm4Deployprop selectByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	List<Jbpm4Deployprop> list = Jbpm4Deployprop.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Jbpm4Deployprop对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [JBPM4_DEPLOYPROP] where ");
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Jbpm4Deployprop对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	Jbpm4Deployprop.deleteByDbid(dataVisit, ADbid, "");
}

/**
 * 根据外键删除一批Jbpm4Deployprop对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Deployment"></param>
 */
public static void deleteListByDeployment(IDataVisit2 dataVisit, Double ADeployment) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_DEPLOYPROP] where ");
	sql = (sql + "DEPLOYMENT_ = ");
	sql = (sql + ADeployment);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Deployment"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Deployprop> selectObjectsByDeployment(IDataVisit2 dataVisit, Double ADeployment, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where DEPLOYMENT_ = ";
	sql = (sql + ADeployment);
	sql = (sql + appendConditionSql);
	return Jbpm4Deployprop.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Deployment"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Deployprop> selectObjectsByDeployment(IDataVisit2 dataVisit, Double ADeployment, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where DEPLOYMENT_ = ";
	sql = (sql + ADeployment);
	return Jbpm4Deployprop.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Deployment"></param>
 */
public static List<Jbpm4Deployprop> selectObjectsByDeployment(IDataVisit2 dataVisit, Double ADeployment) throws SQLException, DbException {
	String sql = " where DEPLOYMENT_ = ";
	sql = (sql + ADeployment);
	return Jbpm4Deployprop.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象jbpm4Deployprop中
 * <param name="reader">数据源</param>
 * <param name="jbpm4Deployprop">目标对象</param>
 */
public static void readValue(ResultSet reader, Jbpm4Deployprop jbpm4Deployprop) throws SQLException, DbException {
	jbpm4Deployprop.dbid = reader.getDouble(1);
	jbpm4Deployprop.deployment = reader.getDouble(2);
	if (reader.wasNull()) {
		jbpm4Deployprop.deployment = null;
	}
	jbpm4Deployprop.objname = reader.getString(3);
	if (reader.wasNull()) {
		jbpm4Deployprop.objname = null;
	}
	jbpm4Deployprop.key = reader.getString(4);
	if (reader.wasNull()) {
		jbpm4Deployprop.key = null;
	}
	jbpm4Deployprop.stringval = reader.getString(5);
	if (reader.wasNull()) {
		jbpm4Deployprop.stringval = null;
	}
	jbpm4Deployprop.longval = reader.getDouble(6);
	if (reader.wasNull()) {
		jbpm4Deployprop.longval = null;
	}
}
}
