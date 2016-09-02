package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_PROPERTY: 
 */
public class Jbpm4Property extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * KEY_: 
	 */
	String key = "";
	
	/**
	 * VERSION_: 
	 */
	int version;
	
	/**
	 * VALUE_: 
	 */
	String value;
	
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
	 * VERSION_: 
	 */
	public int getVersion() {
		return this.version;
	}
	
	/**
	 * VERSION_: 
	 */
	public void setVersion(int value)
	 {
		this.version = value;
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
	
	public static String getSelectSql() {
		return "select  [JBPM4_PROPERTY].[KEY_], [JBPM4_PROPERTY].[VERSION_], [JBPM4_PROPERTY].[V" +
"ALUE_]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [JBPM4_PROPERTY].[KEY_], [JBPM4_PROPERTY].[VERSION_], [JBPM4_PROPERTY].[V" +
"ALUE_]   from [JBPM4_PROPERTY] ";
	}
	
	
	public static String getColumnSql() {
		return " [JBPM4_PROPERTY].[KEY_], [JBPM4_PROPERTY].[VERSION_], [JBPM4_PROPERTY].[VALUE_] " +
"";
	}
	
	
	public static String getDataBaseTableName() {
		return "JBPM4_PROPERTY";
	}
	
	
	public String getTableName() {
		return "JBPM4_PROPERTY";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "KEY_";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.key);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (Jbpm4Property.class.isInstance(obj)) {
			Jbpm4Property o = ((Jbpm4Property)(obj));
			this.key = o.key;
			this.version = o.version;
			this.value = o.value;
		}
	}
	
	/**
	 * 插入Jbpm4Property对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Property">需要插入的</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Jbpm4Property jbpm4Property) throws SQLException, DbException {
		String sql = "insert into [JBPM4_PROPERTY](";
		sql = (sql + "[KEY_]");
		sql = (sql + ", [VERSION_]");
		sql = (sql + ", [VALUE_]");
		sql = (sql + ")values(");
		sql = (sql + SqlServerUtils.safeSql(jbpm4Property.getKey().toString()));
		sql = (sql + ", ");
		sql = (sql + jbpm4Property.getVersion());
		sql = (sql + ", ");
		if ((jbpm4Property.value == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Property.getValue().toString()));
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入Jbpm4Property对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Jbpm4Property.insert(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4Property对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Property">需要更新的</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4Property jbpm4Property, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [JBPM4_PROPERTY] set ";
		sql = (sql + "[VERSION_] = ");
		sql = (sql + jbpm4Property.getVersion());
		sql = (sql + ",");
		if ((jbpm4Property.value == null)) {
			sql = (sql + "[VALUE_] = default ,");
		}
		else {
			sql = (sql + "[VALUE_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Property.getValue().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "KEY_ = ");
		sql = (sql + SqlServerUtils.safeSql(jbpm4Property.getKey().toString()));
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Jbpm4Property对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Property">需要更新的</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4Property jbpm4Property) throws SQLException, DbException {
		return Jbpm4Property.update(dataVisit, jbpm4Property, "");
	}
	
	/**
	 * 更新Jbpm4Property对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Jbpm4Property.update(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4Property对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Jbpm4Property.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Jbpm4Property> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Jbpm4Property> list = new ArrayList<Jbpm4Property>();
		try {
			for (; reader.next(); ) {
				Jbpm4Property obj = new Jbpm4Property();
				Jbpm4Property.readValue(reader, obj);
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
	public static List<Jbpm4Property> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4Property> list = new ArrayList<Jbpm4Property>();
		try {
			for (; reader.next(); ) {
				Jbpm4Property obj = new Jbpm4Property();
				Jbpm4Property.readValue(reader, obj);
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
	public static List<Jbpm4Property> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4Property.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4Property> list = new ArrayList<Jbpm4Property>();
		try {
			for (; reader.next(); ) {
				Jbpm4Property obj = new Jbpm4Property();
				Jbpm4Property.readValue(reader, obj);
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
	public static List<Jbpm4Property> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4Property.getFullSelectSql() + appendConditionSql));
		List<Jbpm4Property> list = new ArrayList<Jbpm4Property>();
		try {
			for (; reader.next(); ) {
				Jbpm4Property obj = new Jbpm4Property();
				Jbpm4Property.readValue(reader, obj);
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
	public static <T extends Jbpm4Property> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4Property.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4Property.readValue(reader, obj);
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
public static <T extends Jbpm4Property> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4Property.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4Property.readValue(reader, obj);
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
	String sql = "select * from JBPM4_PROPERTY ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据查询Jbpm4Property
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AKey"></param>
 */
public static Jbpm4Property selectByKey(IDataVisit2 dataVisit, String AKey) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "KEY_ = ");
	sql = (sql + SqlServerUtils.safeSql(AKey.toString()));
	List<Jbpm4Property> list = Jbpm4Property.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Jbpm4Property对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AKey"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByKey(IDataVisit2 dataVisit, String AKey, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [JBPM4_PROPERTY] where ");
	sql = (sql + "KEY_ = ");
	sql = (sql + SqlServerUtils.safeSql(AKey.toString()));
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Jbpm4Property对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AKey"></param>
 */
public static void deleteByKey(IDataVisit2 dataVisit, String AKey) throws SQLException, DbException {
	Jbpm4Property.deleteByKey(dataVisit, AKey, "");
}

/**
 * 从reader读到数据到对象jbpm4Property中
 * <param name="reader">数据源</param>
 * <param name="jbpm4Property">目标对象</param>
 */
public static void readValue(ResultSet reader, Jbpm4Property jbpm4Property) throws SQLException, DbException {
	jbpm4Property.key = reader.getString(1);
	jbpm4Property.version = reader.getInt(2);
	jbpm4Property.value = reader.getString(3);
	if (reader.wasNull()) {
		jbpm4Property.value = null;
	}
}
}
