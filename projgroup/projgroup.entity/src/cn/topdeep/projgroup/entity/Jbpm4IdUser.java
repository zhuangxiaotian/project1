package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_ID_USER: 
 */
public class Jbpm4IdUser extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
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
	 * PASSWORD_: 
	 */
	String password;
	
	/**
	 * GIVENNAME_: 
	 */
	String givenname;
	
	/**
	 * FAMILYNAME_: 
	 */
	String familyname;
	
	/**
	 * BUSINESSEMAIL_: 
	 */
	String businessemail;
	
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
	 * PASSWORD_: 
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * PASSWORD_: 
	 */
	public void setPassword(String value)
	 {
		this.password = value;
	}
	
	/**
	 * GIVENNAME_: 
	 */
	public String getGivenname() {
		return this.givenname;
	}
	
	/**
	 * GIVENNAME_: 
	 */
	public void setGivenname(String value)
	 {
		this.givenname = value;
	}
	
	/**
	 * FAMILYNAME_: 
	 */
	public String getFamilyname() {
		return this.familyname;
	}
	
	/**
	 * FAMILYNAME_: 
	 */
	public void setFamilyname(String value)
	 {
		this.familyname = value;
	}
	
	/**
	 * BUSINESSEMAIL_: 
	 */
	public String getBusinessemail() {
		return this.businessemail;
	}
	
	/**
	 * BUSINESSEMAIL_: 
	 */
	public void setBusinessemail(String value)
	 {
		this.businessemail = value;
	}
	
	public static String getSelectSql() {
		return "select  [JBPM4_ID_USER].[DBID_], [JBPM4_ID_USER].[DBVERSION_], [JBPM4_ID_USER].[I" +
"D_], [JBPM4_ID_USER].[PASSWORD_], [JBPM4_ID_USER].[GIVENNAME_], [JBPM4_ID_USER]." +
"[FAMILYNAME_], [JBPM4_ID_USER].[BUSINESSEMAIL_]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [JBPM4_ID_USER].[DBID_], [JBPM4_ID_USER].[DBVERSION_], [JBPM4_ID_USER].[I" +
"D_], [JBPM4_ID_USER].[PASSWORD_], [JBPM4_ID_USER].[GIVENNAME_], [JBPM4_ID_USER]." +
"[FAMILYNAME_], [JBPM4_ID_USER].[BUSINESSEMAIL_]   from [JBPM4_ID_USER] ";
	}
	
	
	public static String getColumnSql() {
		return " [JBPM4_ID_USER].[DBID_], [JBPM4_ID_USER].[DBVERSION_], [JBPM4_ID_USER].[ID_], [J" +
"BPM4_ID_USER].[PASSWORD_], [JBPM4_ID_USER].[GIVENNAME_], [JBPM4_ID_USER].[FAMILY" +
"NAME_], [JBPM4_ID_USER].[BUSINESSEMAIL_] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "JBPM4_ID_USER";
	}
	
	
	public String getTableName() {
		return "JBPM4_ID_USER";
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
		if (Jbpm4IdUser.class.isInstance(obj)) {
			Jbpm4IdUser o = ((Jbpm4IdUser)(obj));
			this.dbid = o.dbid;
			this.dbversion = o.dbversion;
			this.id = o.id;
			this.password = o.password;
			this.givenname = o.givenname;
			this.familyname = o.familyname;
			this.businessemail = o.businessemail;
		}
	}
	
	/**
	 * 插入Jbpm4IdUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4IdUser">需要插入的</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Jbpm4IdUser jbpm4IdUser) throws SQLException, DbException {
		String sql = "insert into [JBPM4_ID_USER](";
		sql = (sql + "[DBID_]");
		sql = (sql + ", [DBVERSION_]");
		sql = (sql + ", [ID_]");
		sql = (sql + ", [PASSWORD_]");
		sql = (sql + ", [GIVENNAME_]");
		sql = (sql + ", [FAMILYNAME_]");
		sql = (sql + ", [BUSINESSEMAIL_]");
		sql = (sql + ")values(");
		sql = (sql + jbpm4IdUser.getDbid());
		sql = (sql + ", ");
		sql = (sql + jbpm4IdUser.getDbversion());
		sql = (sql + ", ");
		if ((jbpm4IdUser.id == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4IdUser.getId().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4IdUser.password == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4IdUser.getPassword().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4IdUser.givenname == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4IdUser.getGivenname().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4IdUser.familyname == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4IdUser.getFamilyname().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4IdUser.businessemail == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4IdUser.getBusinessemail().toString()));
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入Jbpm4IdUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Jbpm4IdUser.insert(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4IdUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4IdUser">需要更新的</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4IdUser jbpm4IdUser, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [JBPM4_ID_USER] set ";
		sql = (sql + "[DBVERSION_] = ");
		sql = (sql + jbpm4IdUser.getDbversion());
		sql = (sql + ",");
		if ((jbpm4IdUser.id == null)) {
			sql = (sql + "[ID_] = default ,");
		}
		else {
			sql = (sql + "[ID_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4IdUser.getId().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4IdUser.password == null)) {
			sql = (sql + "[PASSWORD_] = default ,");
		}
		else {
			sql = (sql + "[PASSWORD_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4IdUser.getPassword().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4IdUser.givenname == null)) {
			sql = (sql + "[GIVENNAME_] = default ,");
		}
		else {
			sql = (sql + "[GIVENNAME_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4IdUser.getGivenname().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4IdUser.familyname == null)) {
			sql = (sql + "[FAMILYNAME_] = default ,");
		}
		else {
			sql = (sql + "[FAMILYNAME_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4IdUser.getFamilyname().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4IdUser.businessemail == null)) {
			sql = (sql + "[BUSINESSEMAIL_] = default ,");
		}
		else {
			sql = (sql + "[BUSINESSEMAIL_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4IdUser.getBusinessemail().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "DBID_ = ");
		sql = (sql + jbpm4IdUser.getDbid());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Jbpm4IdUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4IdUser">需要更新的</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4IdUser jbpm4IdUser) throws SQLException, DbException {
		return Jbpm4IdUser.update(dataVisit, jbpm4IdUser, "");
	}
	
	/**
	 * 更新Jbpm4IdUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Jbpm4IdUser.update(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4IdUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Jbpm4IdUser.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Jbpm4IdUser> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Jbpm4IdUser> list = new ArrayList<Jbpm4IdUser>();
		try {
			for (; reader.next(); ) {
				Jbpm4IdUser obj = new Jbpm4IdUser();
				Jbpm4IdUser.readValue(reader, obj);
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
	public static List<Jbpm4IdUser> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4IdUser> list = new ArrayList<Jbpm4IdUser>();
		try {
			for (; reader.next(); ) {
				Jbpm4IdUser obj = new Jbpm4IdUser();
				Jbpm4IdUser.readValue(reader, obj);
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
	public static List<Jbpm4IdUser> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4IdUser.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4IdUser> list = new ArrayList<Jbpm4IdUser>();
		try {
			for (; reader.next(); ) {
				Jbpm4IdUser obj = new Jbpm4IdUser();
				Jbpm4IdUser.readValue(reader, obj);
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
	public static List<Jbpm4IdUser> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4IdUser.getFullSelectSql() + appendConditionSql));
		List<Jbpm4IdUser> list = new ArrayList<Jbpm4IdUser>();
		try {
			for (; reader.next(); ) {
				Jbpm4IdUser obj = new Jbpm4IdUser();
				Jbpm4IdUser.readValue(reader, obj);
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
	public static <T extends Jbpm4IdUser> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4IdUser.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4IdUser.readValue(reader, obj);
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
public static <T extends Jbpm4IdUser> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4IdUser.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4IdUser.readValue(reader, obj);
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
	String sql = "select * from JBPM4_ID_USER ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据查询Jbpm4IdUser
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static Jbpm4IdUser selectByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	List<Jbpm4IdUser> list = Jbpm4IdUser.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Jbpm4IdUser对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [JBPM4_ID_USER] where ");
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Jbpm4IdUser对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	Jbpm4IdUser.deleteByDbid(dataVisit, ADbid, "");
}

/**
 * 从reader读到数据到对象jbpm4IdUser中
 * <param name="reader">数据源</param>
 * <param name="jbpm4IdUser">目标对象</param>
 */
public static void readValue(ResultSet reader, Jbpm4IdUser jbpm4IdUser) throws SQLException, DbException {
	jbpm4IdUser.dbid = reader.getDouble(1);
	jbpm4IdUser.dbversion = reader.getInt(2);
	jbpm4IdUser.id = reader.getString(3);
	if (reader.wasNull()) {
		jbpm4IdUser.id = null;
	}
	jbpm4IdUser.password = reader.getString(4);
	if (reader.wasNull()) {
		jbpm4IdUser.password = null;
	}
	jbpm4IdUser.givenname = reader.getString(5);
	if (reader.wasNull()) {
		jbpm4IdUser.givenname = null;
	}
	jbpm4IdUser.familyname = reader.getString(6);
	if (reader.wasNull()) {
		jbpm4IdUser.familyname = null;
	}
	jbpm4IdUser.businessemail = reader.getString(7);
	if (reader.wasNull()) {
		jbpm4IdUser.businessemail = null;
	}
}
}
