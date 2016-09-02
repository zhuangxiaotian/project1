package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_ID_MEMBERSHIP: 
 */
public class Jbpm4IdMembership extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * DBID_: 
	 */
	double dbid;
	
	/**
	 * DBVERSION_: 
	 */
	int dbversion;
	
	/**
	 * USER_: 
	 */
	Double user;
	
	/**
	 * GROUP_: 
	 */
	Double group;
	
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
	 * USER_: 
	 */
	public Double getUser() {
		return this.user;
	}
	
	/**
	 * USER_: 
	 */
	public void setUser(Double value)
	 {
		this.user = value;
	}
	
	/**
	 * GROUP_: 
	 */
	public Double getGroup() {
		return this.group;
	}
	
	/**
	 * GROUP_: 
	 */
	public void setGroup(Double value)
	 {
		this.group = value;
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
		return "select  [JBPM4_ID_MEMBERSHIP].[DBID_], [JBPM4_ID_MEMBERSHIP].[DBVERSION_], [JBPM4" +
"_ID_MEMBERSHIP].[USER_], [JBPM4_ID_MEMBERSHIP].[GROUP_], [JBPM4_ID_MEMBERSHIP].[" +
"NAME_]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [JBPM4_ID_MEMBERSHIP].[DBID_], [JBPM4_ID_MEMBERSHIP].[DBVERSION_], [JBPM4" +
"_ID_MEMBERSHIP].[USER_], [JBPM4_ID_MEMBERSHIP].[GROUP_], [JBPM4_ID_MEMBERSHIP].[" +
"NAME_]   from [JBPM4_ID_MEMBERSHIP] ";
	}
	
	
	public static String getColumnSql() {
		return " [JBPM4_ID_MEMBERSHIP].[DBID_], [JBPM4_ID_MEMBERSHIP].[DBVERSION_], [JBPM4_ID_MEM" +
"BERSHIP].[USER_], [JBPM4_ID_MEMBERSHIP].[GROUP_], [JBPM4_ID_MEMBERSHIP].[NAME_] " +
"";
	}
	
	
	public static String getDataBaseTableName() {
		return "JBPM4_ID_MEMBERSHIP";
	}
	
	
	public String getTableName() {
		return "JBPM4_ID_MEMBERSHIP";
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
		if (Jbpm4IdMembership.class.isInstance(obj)) {
			Jbpm4IdMembership o = ((Jbpm4IdMembership)(obj));
			this.dbid = o.dbid;
			this.dbversion = o.dbversion;
			this.user = o.user;
			this.group = o.group;
			this.name = o.name;
		}
	}
	
	/**
	 * 插入Jbpm4IdMembership对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4IdMembership">需要插入的</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Jbpm4IdMembership jbpm4IdMembership) throws SQLException, DbException {
		String sql = "insert into [JBPM4_ID_MEMBERSHIP](";
		sql = (sql + "[DBID_]");
		sql = (sql + ", [DBVERSION_]");
		sql = (sql + ", [USER_]");
		sql = (sql + ", [GROUP_]");
		sql = (sql + ", [NAME_]");
		sql = (sql + ")values(");
		sql = (sql + jbpm4IdMembership.getDbid());
		sql = (sql + ", ");
		sql = (sql + jbpm4IdMembership.getDbversion());
		sql = (sql + ", ");
		if ((jbpm4IdMembership.user == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4IdMembership.getUser());
		}
		sql = (sql + ", ");
		if ((jbpm4IdMembership.group == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4IdMembership.getGroup());
		}
		sql = (sql + ", ");
		if ((jbpm4IdMembership.name == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4IdMembership.getName().toString()));
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入Jbpm4IdMembership对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Jbpm4IdMembership.insert(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4IdMembership对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4IdMembership">需要更新的</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4IdMembership jbpm4IdMembership, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [JBPM4_ID_MEMBERSHIP] set ";
		sql = (sql + "[DBVERSION_] = ");
		sql = (sql + jbpm4IdMembership.getDbversion());
		sql = (sql + ",");
		if ((jbpm4IdMembership.user == null)) {
			sql = (sql + "[USER_] = default ,");
		}
		else {
			sql = (sql + "[USER_] = ");
			sql = (sql + jbpm4IdMembership.getUser());
			sql = (sql + ",");
		}
		if ((jbpm4IdMembership.group == null)) {
			sql = (sql + "[GROUP_] = default ,");
		}
		else {
			sql = (sql + "[GROUP_] = ");
			sql = (sql + jbpm4IdMembership.getGroup());
			sql = (sql + ",");
		}
		if ((jbpm4IdMembership.name == null)) {
			sql = (sql + "[NAME_] = default ,");
		}
		else {
			sql = (sql + "[NAME_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4IdMembership.getName().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "DBID_ = ");
		sql = (sql + jbpm4IdMembership.getDbid());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Jbpm4IdMembership对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4IdMembership">需要更新的</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4IdMembership jbpm4IdMembership) throws SQLException, DbException {
		return Jbpm4IdMembership.update(dataVisit, jbpm4IdMembership, "");
	}
	
	/**
	 * 更新Jbpm4IdMembership对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Jbpm4IdMembership.update(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4IdMembership对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Jbpm4IdMembership.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Jbpm4IdMembership> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Jbpm4IdMembership> list = new ArrayList<Jbpm4IdMembership>();
		try {
			for (; reader.next(); ) {
				Jbpm4IdMembership obj = new Jbpm4IdMembership();
				Jbpm4IdMembership.readValue(reader, obj);
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
	public static List<Jbpm4IdMembership> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4IdMembership> list = new ArrayList<Jbpm4IdMembership>();
		try {
			for (; reader.next(); ) {
				Jbpm4IdMembership obj = new Jbpm4IdMembership();
				Jbpm4IdMembership.readValue(reader, obj);
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
	public static List<Jbpm4IdMembership> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4IdMembership.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4IdMembership> list = new ArrayList<Jbpm4IdMembership>();
		try {
			for (; reader.next(); ) {
				Jbpm4IdMembership obj = new Jbpm4IdMembership();
				Jbpm4IdMembership.readValue(reader, obj);
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
	public static List<Jbpm4IdMembership> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4IdMembership.getFullSelectSql() + appendConditionSql));
		List<Jbpm4IdMembership> list = new ArrayList<Jbpm4IdMembership>();
		try {
			for (; reader.next(); ) {
				Jbpm4IdMembership obj = new Jbpm4IdMembership();
				Jbpm4IdMembership.readValue(reader, obj);
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
	public static <T extends Jbpm4IdMembership> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4IdMembership.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4IdMembership.readValue(reader, obj);
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
public static <T extends Jbpm4IdMembership> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4IdMembership.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4IdMembership.readValue(reader, obj);
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
	String sql = "select * from JBPM4_ID_MEMBERSHIP ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据查询Jbpm4IdMembership
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static Jbpm4IdMembership selectByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	List<Jbpm4IdMembership> list = Jbpm4IdMembership.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Jbpm4IdMembership对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [JBPM4_ID_MEMBERSHIP] where ");
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Jbpm4IdMembership对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	Jbpm4IdMembership.deleteByDbid(dataVisit, ADbid, "");
}

/**
 * 根据外键删除一批Jbpm4IdMembership对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Group"></param>
 */
public static void deleteListByGroup(IDataVisit2 dataVisit, Double AGroup) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_ID_MEMBERSHIP] where ");
	sql = (sql + "GROUP_ = ");
	sql = (sql + AGroup);
	dataVisit.execSql(sql);
}

/**
 * 根据外键删除一批Jbpm4IdMembership对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="User"></param>
 */
public static void deleteListByUser(IDataVisit2 dataVisit, Double AUser) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_ID_MEMBERSHIP] where ");
	sql = (sql + "USER_ = ");
	sql = (sql + AUser);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Group"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4IdMembership> selectObjectsByGroup(IDataVisit2 dataVisit, Double AGroup, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where GROUP_ = ";
	sql = (sql + AGroup);
	sql = (sql + appendConditionSql);
	return Jbpm4IdMembership.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Group"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4IdMembership> selectObjectsByGroup(IDataVisit2 dataVisit, Double AGroup, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where GROUP_ = ";
	sql = (sql + AGroup);
	return Jbpm4IdMembership.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Group"></param>
 */
public static List<Jbpm4IdMembership> selectObjectsByGroup(IDataVisit2 dataVisit, Double AGroup) throws SQLException, DbException {
	String sql = " where GROUP_ = ";
	sql = (sql + AGroup);
	return Jbpm4IdMembership.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="User"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4IdMembership> selectObjectsByUser(IDataVisit2 dataVisit, Double AUser, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where USER_ = ";
	sql = (sql + AUser);
	sql = (sql + appendConditionSql);
	return Jbpm4IdMembership.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="User"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4IdMembership> selectObjectsByUser(IDataVisit2 dataVisit, Double AUser, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where USER_ = ";
	sql = (sql + AUser);
	return Jbpm4IdMembership.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="User"></param>
 */
public static List<Jbpm4IdMembership> selectObjectsByUser(IDataVisit2 dataVisit, Double AUser) throws SQLException, DbException {
	String sql = " where USER_ = ";
	sql = (sql + AUser);
	return Jbpm4IdMembership.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象jbpm4IdMembership中
 * <param name="reader">数据源</param>
 * <param name="jbpm4IdMembership">目标对象</param>
 */
public static void readValue(ResultSet reader, Jbpm4IdMembership jbpm4IdMembership) throws SQLException, DbException {
	jbpm4IdMembership.dbid = reader.getDouble(1);
	jbpm4IdMembership.dbversion = reader.getInt(2);
	jbpm4IdMembership.user = reader.getDouble(3);
	if (reader.wasNull()) {
		jbpm4IdMembership.user = null;
	}
	jbpm4IdMembership.group = reader.getDouble(4);
	if (reader.wasNull()) {
		jbpm4IdMembership.group = null;
	}
	jbpm4IdMembership.name = reader.getString(5);
	if (reader.wasNull()) {
		jbpm4IdMembership.name = null;
	}
}
}
