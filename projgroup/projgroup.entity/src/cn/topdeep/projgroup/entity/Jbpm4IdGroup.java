package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_ID_GROUP: 
 */
public class Jbpm4IdGroup extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
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
	 * NAME_: 
	 */
	String name;
	
	/**
	 * TYPE_: 
	 */
	String type;
	
	/**
	 * PARENT_: 
	 */
	Double parent;
	
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
	 * PARENT_: 
	 */
	public Double getParent() {
		return this.parent;
	}
	
	/**
	 * PARENT_: 
	 */
	public void setParent(Double value)
	 {
		this.parent = value;
	}
	
	public static String getSelectSql() {
		return "select  [JBPM4_ID_GROUP].[DBID_], [JBPM4_ID_GROUP].[DBVERSION_], [JBPM4_ID_GROUP]" +
".[ID_], [JBPM4_ID_GROUP].[NAME_], [JBPM4_ID_GROUP].[TYPE_], [JBPM4_ID_GROUP].[PA" +
"RENT_]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [JBPM4_ID_GROUP].[DBID_], [JBPM4_ID_GROUP].[DBVERSION_], [JBPM4_ID_GROUP]" +
".[ID_], [JBPM4_ID_GROUP].[NAME_], [JBPM4_ID_GROUP].[TYPE_], [JBPM4_ID_GROUP].[PA" +
"RENT_]   from [JBPM4_ID_GROUP] ";
	}
	
	
	public static String getColumnSql() {
		return " [JBPM4_ID_GROUP].[DBID_], [JBPM4_ID_GROUP].[DBVERSION_], [JBPM4_ID_GROUP].[ID_]," +
" [JBPM4_ID_GROUP].[NAME_], [JBPM4_ID_GROUP].[TYPE_], [JBPM4_ID_GROUP].[PARENT_] " +
"";
	}
	
	
	public static String getDataBaseTableName() {
		return "JBPM4_ID_GROUP";
	}
	
	
	public String getTableName() {
		return "JBPM4_ID_GROUP";
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
		if (Jbpm4IdGroup.class.isInstance(obj)) {
			Jbpm4IdGroup o = ((Jbpm4IdGroup)(obj));
			this.dbid = o.dbid;
			this.dbversion = o.dbversion;
			this.id = o.id;
			this.name = o.name;
			this.type = o.type;
			this.parent = o.parent;
		}
	}
	
	/**
	 * 插入Jbpm4IdGroup对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4IdGroup">需要插入的</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Jbpm4IdGroup jbpm4IdGroup) throws SQLException, DbException {
		String sql = "insert into [JBPM4_ID_GROUP](";
		sql = (sql + "[DBID_]");
		sql = (sql + ", [DBVERSION_]");
		sql = (sql + ", [ID_]");
		sql = (sql + ", [NAME_]");
		sql = (sql + ", [TYPE_]");
		sql = (sql + ", [PARENT_]");
		sql = (sql + ")values(");
		sql = (sql + jbpm4IdGroup.getDbid());
		sql = (sql + ", ");
		sql = (sql + jbpm4IdGroup.getDbversion());
		sql = (sql + ", ");
		if ((jbpm4IdGroup.id == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4IdGroup.getId().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4IdGroup.name == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4IdGroup.getName().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4IdGroup.type == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4IdGroup.getType().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4IdGroup.parent == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4IdGroup.getParent());
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入Jbpm4IdGroup对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Jbpm4IdGroup.insert(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4IdGroup对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4IdGroup">需要更新的</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4IdGroup jbpm4IdGroup, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [JBPM4_ID_GROUP] set ";
		sql = (sql + "[DBVERSION_] = ");
		sql = (sql + jbpm4IdGroup.getDbversion());
		sql = (sql + ",");
		if ((jbpm4IdGroup.id == null)) {
			sql = (sql + "[ID_] = default ,");
		}
		else {
			sql = (sql + "[ID_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4IdGroup.getId().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4IdGroup.name == null)) {
			sql = (sql + "[NAME_] = default ,");
		}
		else {
			sql = (sql + "[NAME_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4IdGroup.getName().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4IdGroup.type == null)) {
			sql = (sql + "[TYPE_] = default ,");
		}
		else {
			sql = (sql + "[TYPE_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4IdGroup.getType().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4IdGroup.parent == null)) {
			sql = (sql + "[PARENT_] = default ,");
		}
		else {
			sql = (sql + "[PARENT_] = ");
			sql = (sql + jbpm4IdGroup.getParent());
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "DBID_ = ");
		sql = (sql + jbpm4IdGroup.getDbid());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Jbpm4IdGroup对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4IdGroup">需要更新的</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4IdGroup jbpm4IdGroup) throws SQLException, DbException {
		return Jbpm4IdGroup.update(dataVisit, jbpm4IdGroup, "");
	}
	
	/**
	 * 更新Jbpm4IdGroup对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Jbpm4IdGroup.update(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4IdGroup对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Jbpm4IdGroup.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Jbpm4IdGroup> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Jbpm4IdGroup> list = new ArrayList<Jbpm4IdGroup>();
		try {
			for (; reader.next(); ) {
				Jbpm4IdGroup obj = new Jbpm4IdGroup();
				Jbpm4IdGroup.readValue(reader, obj);
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
	public static List<Jbpm4IdGroup> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4IdGroup> list = new ArrayList<Jbpm4IdGroup>();
		try {
			for (; reader.next(); ) {
				Jbpm4IdGroup obj = new Jbpm4IdGroup();
				Jbpm4IdGroup.readValue(reader, obj);
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
	public static List<Jbpm4IdGroup> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4IdGroup.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4IdGroup> list = new ArrayList<Jbpm4IdGroup>();
		try {
			for (; reader.next(); ) {
				Jbpm4IdGroup obj = new Jbpm4IdGroup();
				Jbpm4IdGroup.readValue(reader, obj);
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
	public static List<Jbpm4IdGroup> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4IdGroup.getFullSelectSql() + appendConditionSql));
		List<Jbpm4IdGroup> list = new ArrayList<Jbpm4IdGroup>();
		try {
			for (; reader.next(); ) {
				Jbpm4IdGroup obj = new Jbpm4IdGroup();
				Jbpm4IdGroup.readValue(reader, obj);
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
	public static <T extends Jbpm4IdGroup> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4IdGroup.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4IdGroup.readValue(reader, obj);
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
public static <T extends Jbpm4IdGroup> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4IdGroup.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4IdGroup.readValue(reader, obj);
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
	String sql = "select * from JBPM4_ID_GROUP ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据查询Jbpm4IdGroup
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static Jbpm4IdGroup selectByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	List<Jbpm4IdGroup> list = Jbpm4IdGroup.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Jbpm4IdGroup对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [JBPM4_ID_GROUP] where ");
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Jbpm4IdGroup对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	Jbpm4IdGroup.deleteByDbid(dataVisit, ADbid, "");
}

/**
 * 根据外键删除一批Jbpm4IdGroup对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Parent"></param>
 */
public static void deleteListByParent(IDataVisit2 dataVisit, Double AParent) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_ID_GROUP] where ");
	sql = (sql + "PARENT_ = ");
	sql = (sql + AParent);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Parent"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4IdGroup> selectObjectsByParent(IDataVisit2 dataVisit, Double AParent, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PARENT_ = ";
	sql = (sql + AParent);
	sql = (sql + appendConditionSql);
	return Jbpm4IdGroup.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Parent"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4IdGroup> selectObjectsByParent(IDataVisit2 dataVisit, Double AParent, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PARENT_ = ";
	sql = (sql + AParent);
	return Jbpm4IdGroup.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Parent"></param>
 */
public static List<Jbpm4IdGroup> selectObjectsByParent(IDataVisit2 dataVisit, Double AParent) throws SQLException, DbException {
	String sql = " where PARENT_ = ";
	sql = (sql + AParent);
	return Jbpm4IdGroup.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象jbpm4IdGroup中
 * <param name="reader">数据源</param>
 * <param name="jbpm4IdGroup">目标对象</param>
 */
public static void readValue(ResultSet reader, Jbpm4IdGroup jbpm4IdGroup) throws SQLException, DbException {
	jbpm4IdGroup.dbid = reader.getDouble(1);
	jbpm4IdGroup.dbversion = reader.getInt(2);
	jbpm4IdGroup.id = reader.getString(3);
	if (reader.wasNull()) {
		jbpm4IdGroup.id = null;
	}
	jbpm4IdGroup.name = reader.getString(4);
	if (reader.wasNull()) {
		jbpm4IdGroup.name = null;
	}
	jbpm4IdGroup.type = reader.getString(5);
	if (reader.wasNull()) {
		jbpm4IdGroup.type = null;
	}
	jbpm4IdGroup.parent = reader.getDouble(6);
	if (reader.wasNull()) {
		jbpm4IdGroup.parent = null;
	}
}
}
