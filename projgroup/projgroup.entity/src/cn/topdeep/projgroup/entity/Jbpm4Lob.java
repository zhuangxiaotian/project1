package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_LOB: 
 */
public class Jbpm4Lob extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * DBID_: 
	 */
	double dbid;
	
	/**
	 * DBVERSION_: 
	 */
	int dbversion;
	
	/**
	 * BLOB_VALUE_: 
	 */
	byte[] blobValue;
	
	/**
	 * DEPLOYMENT_: 
	 */
	Double deployment;
	
	/**
	 * NAME_: 
	 */
	String name;
	
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
	 * BLOB_VALUE_: 
	 */
	public byte[] getBlobValue() {
		return this.blobValue;
	}
	
	/**
	 * BLOB_VALUE_: 
	 */
	public void setBlobValue(byte[] value)
	 {
		this.blobValue = value;
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
	
	public static String getSelectSql() {
		return "select  [JBPM4_LOB].[DBID_], [JBPM4_LOB].[DBVERSION_], [JBPM4_LOB].[BLOB_VALUE_]," +
" [JBPM4_LOB].[DEPLOYMENT_], [JBPM4_LOB].[NAME_]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [JBPM4_LOB].[DBID_], [JBPM4_LOB].[DBVERSION_], [JBPM4_LOB].[BLOB_VALUE_]," +
" [JBPM4_LOB].[DEPLOYMENT_], [JBPM4_LOB].[NAME_]   from [JBPM4_LOB] ";
	}
	
	
	public static String getColumnSql() {
		return " [JBPM4_LOB].[DBID_], [JBPM4_LOB].[DBVERSION_], [JBPM4_LOB].[BLOB_VALUE_], [JBPM4" +
"_LOB].[DEPLOYMENT_], [JBPM4_LOB].[NAME_] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "JBPM4_LOB";
	}
	
	
	public String getTableName() {
		return "JBPM4_LOB";
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
		if (Jbpm4Lob.class.isInstance(obj)) {
			Jbpm4Lob o = ((Jbpm4Lob)(obj));
			this.dbid = o.dbid;
			this.dbversion = o.dbversion;
			this.blobValue = o.blobValue;
			this.deployment = o.deployment;
			this.name = o.name;
		}
	}
	
	/**
	 * 插入Jbpm4Lob对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Lob">需要插入的</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Jbpm4Lob jbpm4Lob) throws SQLException, DbException {
		String sql = "insert into [JBPM4_LOB](";
		sql = (sql + "[DBID_]");
		sql = (sql + ", [DBVERSION_]");
		sql = (sql + ", [BLOB_VALUE_]");
		sql = (sql + ", [DEPLOYMENT_]");
		sql = (sql + ", [NAME_]");
		sql = (sql + ")values(");
		sql = (sql + jbpm4Lob.getDbid());
		sql = (sql + ", ");
		sql = (sql + jbpm4Lob.getDbversion());
		sql = (sql + ", ");
		if ((jbpm4Lob.blobValue == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getByteArySql(jbpm4Lob.getBlobValue()));
		}
		sql = (sql + ", ");
		if ((jbpm4Lob.deployment == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Lob.getDeployment());
		}
		sql = (sql + ", ");
		if ((jbpm4Lob.name == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Lob.getName().toString()));
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入Jbpm4Lob对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Jbpm4Lob.insert(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4Lob对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Lob">需要更新的</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4Lob jbpm4Lob, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [JBPM4_LOB] set ";
		sql = (sql + "[DBVERSION_] = ");
		sql = (sql + jbpm4Lob.getDbversion());
		sql = (sql + ",");
		if ((jbpm4Lob.blobValue == null)) {
			sql = (sql + "[BLOB_VALUE_] = default ,");
		}
		else {
			sql = (sql + "[BLOB_VALUE_] = ");
			sql = (sql + SqlServerUtils.getByteArySql(jbpm4Lob.getBlobValue()));
			sql = (sql + ",");
		}
		if ((jbpm4Lob.deployment == null)) {
			sql = (sql + "[DEPLOYMENT_] = default ,");
		}
		else {
			sql = (sql + "[DEPLOYMENT_] = ");
			sql = (sql + jbpm4Lob.getDeployment());
			sql = (sql + ",");
		}
		if ((jbpm4Lob.name == null)) {
			sql = (sql + "[NAME_] = default ,");
		}
		else {
			sql = (sql + "[NAME_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Lob.getName().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "DBID_ = ");
		sql = (sql + jbpm4Lob.getDbid());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Jbpm4Lob对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Lob">需要更新的</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4Lob jbpm4Lob) throws SQLException, DbException {
		return Jbpm4Lob.update(dataVisit, jbpm4Lob, "");
	}
	
	/**
	 * 更新Jbpm4Lob对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Jbpm4Lob.update(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4Lob对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Jbpm4Lob.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Jbpm4Lob> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Jbpm4Lob> list = new ArrayList<Jbpm4Lob>();
		try {
			for (; reader.next(); ) {
				Jbpm4Lob obj = new Jbpm4Lob();
				Jbpm4Lob.readValue(reader, obj);
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
	public static List<Jbpm4Lob> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4Lob> list = new ArrayList<Jbpm4Lob>();
		try {
			for (; reader.next(); ) {
				Jbpm4Lob obj = new Jbpm4Lob();
				Jbpm4Lob.readValue(reader, obj);
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
	public static List<Jbpm4Lob> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4Lob.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4Lob> list = new ArrayList<Jbpm4Lob>();
		try {
			for (; reader.next(); ) {
				Jbpm4Lob obj = new Jbpm4Lob();
				Jbpm4Lob.readValue(reader, obj);
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
	public static List<Jbpm4Lob> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4Lob.getFullSelectSql() + appendConditionSql));
		List<Jbpm4Lob> list = new ArrayList<Jbpm4Lob>();
		try {
			for (; reader.next(); ) {
				Jbpm4Lob obj = new Jbpm4Lob();
				Jbpm4Lob.readValue(reader, obj);
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
	public static <T extends Jbpm4Lob> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4Lob.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4Lob.readValue(reader, obj);
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
public static <T extends Jbpm4Lob> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4Lob.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4Lob.readValue(reader, obj);
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
	String sql = "select * from JBPM4_LOB ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据查询Jbpm4Lob
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static Jbpm4Lob selectByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	List<Jbpm4Lob> list = Jbpm4Lob.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Jbpm4Lob对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [JBPM4_LOB] where ");
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Jbpm4Lob对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	Jbpm4Lob.deleteByDbid(dataVisit, ADbid, "");
}

/**
 * 根据外键删除一批Jbpm4Lob对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Deployment"></param>
 */
public static void deleteListByDeployment(IDataVisit2 dataVisit, Double ADeployment) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_LOB] where ");
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
public static List<Jbpm4Lob> selectObjectsByDeployment(IDataVisit2 dataVisit, Double ADeployment, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where DEPLOYMENT_ = ";
	sql = (sql + ADeployment);
	sql = (sql + appendConditionSql);
	return Jbpm4Lob.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
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
public static List<Jbpm4Lob> selectObjectsByDeployment(IDataVisit2 dataVisit, Double ADeployment, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where DEPLOYMENT_ = ";
	sql = (sql + ADeployment);
	return Jbpm4Lob.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Deployment"></param>
 */
public static List<Jbpm4Lob> selectObjectsByDeployment(IDataVisit2 dataVisit, Double ADeployment) throws SQLException, DbException {
	String sql = " where DEPLOYMENT_ = ";
	sql = (sql + ADeployment);
	return Jbpm4Lob.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象jbpm4Lob中
 * <param name="reader">数据源</param>
 * <param name="jbpm4Lob">目标对象</param>
 */
public static void readValue(ResultSet reader, Jbpm4Lob jbpm4Lob) throws SQLException, DbException {
	jbpm4Lob.dbid = reader.getDouble(1);
	jbpm4Lob.dbversion = reader.getInt(2);
	jbpm4Lob.blobValue = reader.getBytes(3);
	if (reader.wasNull()) {
		jbpm4Lob.blobValue = null;
	}
	jbpm4Lob.deployment = reader.getDouble(4);
	if (reader.wasNull()) {
		jbpm4Lob.deployment = null;
	}
	jbpm4Lob.name = reader.getString(5);
	if (reader.wasNull()) {
		jbpm4Lob.name = null;
	}
}
}
