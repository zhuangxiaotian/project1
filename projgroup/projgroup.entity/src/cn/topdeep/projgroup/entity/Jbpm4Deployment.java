package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_DEPLOYMENT: 
 */
public class Jbpm4Deployment extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * DBID_: 
	 */
	double dbid;
	
	/**
	 * NAME_: 
	 */
	String name;
	
	/**
	 * TIMESTAMP_: 
	 */
	Double timestamp;
	
	/**
	 * STATE_: 
	 */
	String state;
	
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
	 * TIMESTAMP_: 
	 */
	public Double getTimestamp() {
		return this.timestamp;
	}
	
	/**
	 * TIMESTAMP_: 
	 */
	public void setTimestamp(Double value)
	 {
		this.timestamp = value;
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
	
	public static String getSelectSql() {
		return "select  [JBPM4_DEPLOYMENT].[DBID_], [JBPM4_DEPLOYMENT].[NAME_], [JBPM4_DEPLOYMENT" +
"].[TIMESTAMP_], [JBPM4_DEPLOYMENT].[STATE_]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [JBPM4_DEPLOYMENT].[DBID_], [JBPM4_DEPLOYMENT].[NAME_], [JBPM4_DEPLOYMENT" +
"].[TIMESTAMP_], [JBPM4_DEPLOYMENT].[STATE_]   from [JBPM4_DEPLOYMENT] ";
	}
	
	
	public static String getColumnSql() {
		return " [JBPM4_DEPLOYMENT].[DBID_], [JBPM4_DEPLOYMENT].[NAME_], [JBPM4_DEPLOYMENT].[TIME" +
"STAMP_], [JBPM4_DEPLOYMENT].[STATE_] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "JBPM4_DEPLOYMENT";
	}
	
	
	public String getTableName() {
		return "JBPM4_DEPLOYMENT";
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
		if (Jbpm4Deployment.class.isInstance(obj)) {
			Jbpm4Deployment o = ((Jbpm4Deployment)(obj));
			this.dbid = o.dbid;
			this.name = o.name;
			this.timestamp = o.timestamp;
			this.state = o.state;
		}
	}
	
	/**
	 * 插入Jbpm4Deployment对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Deployment">需要插入的</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Jbpm4Deployment jbpm4Deployment) throws SQLException, DbException {
		String sql = "insert into [JBPM4_DEPLOYMENT](";
		sql = (sql + "[DBID_]");
		sql = (sql + ", [NAME_]");
		sql = (sql + ", [TIMESTAMP_]");
		sql = (sql + ", [STATE_]");
		sql = (sql + ")values(");
		sql = (sql + jbpm4Deployment.getDbid());
		sql = (sql + ", ");
		if ((jbpm4Deployment.name == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Deployment.getName().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Deployment.timestamp == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Deployment.getTimestamp());
		}
		sql = (sql + ", ");
		if ((jbpm4Deployment.state == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Deployment.getState().toString()));
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入Jbpm4Deployment对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Jbpm4Deployment.insert(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4Deployment对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Deployment">需要更新的</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4Deployment jbpm4Deployment, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [JBPM4_DEPLOYMENT] set ";
		if ((jbpm4Deployment.name == null)) {
			sql = (sql + "[NAME_] = default ,");
		}
		else {
			sql = (sql + "[NAME_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Deployment.getName().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Deployment.timestamp == null)) {
			sql = (sql + "[TIMESTAMP_] = default ,");
		}
		else {
			sql = (sql + "[TIMESTAMP_] = ");
			sql = (sql + jbpm4Deployment.getTimestamp());
			sql = (sql + ",");
		}
		if ((jbpm4Deployment.state == null)) {
			sql = (sql + "[STATE_] = default ,");
		}
		else {
			sql = (sql + "[STATE_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Deployment.getState().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "DBID_ = ");
		sql = (sql + jbpm4Deployment.getDbid());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Jbpm4Deployment对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Deployment">需要更新的</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4Deployment jbpm4Deployment) throws SQLException, DbException {
		return Jbpm4Deployment.update(dataVisit, jbpm4Deployment, "");
	}
	
	/**
	 * 更新Jbpm4Deployment对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Jbpm4Deployment.update(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4Deployment对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Jbpm4Deployment.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Jbpm4Deployment> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Jbpm4Deployment> list = new ArrayList<Jbpm4Deployment>();
		try {
			for (; reader.next(); ) {
				Jbpm4Deployment obj = new Jbpm4Deployment();
				Jbpm4Deployment.readValue(reader, obj);
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
	public static List<Jbpm4Deployment> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4Deployment> list = new ArrayList<Jbpm4Deployment>();
		try {
			for (; reader.next(); ) {
				Jbpm4Deployment obj = new Jbpm4Deployment();
				Jbpm4Deployment.readValue(reader, obj);
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
	public static List<Jbpm4Deployment> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4Deployment.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4Deployment> list = new ArrayList<Jbpm4Deployment>();
		try {
			for (; reader.next(); ) {
				Jbpm4Deployment obj = new Jbpm4Deployment();
				Jbpm4Deployment.readValue(reader, obj);
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
	public static List<Jbpm4Deployment> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4Deployment.getFullSelectSql() + appendConditionSql));
		List<Jbpm4Deployment> list = new ArrayList<Jbpm4Deployment>();
		try {
			for (; reader.next(); ) {
				Jbpm4Deployment obj = new Jbpm4Deployment();
				Jbpm4Deployment.readValue(reader, obj);
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
	public static <T extends Jbpm4Deployment> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4Deployment.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4Deployment.readValue(reader, obj);
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
public static <T extends Jbpm4Deployment> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4Deployment.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4Deployment.readValue(reader, obj);
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
	String sql = "select * from JBPM4_DEPLOYMENT ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据查询Jbpm4Deployment
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static Jbpm4Deployment selectByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	List<Jbpm4Deployment> list = Jbpm4Deployment.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Jbpm4Deployment对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [JBPM4_DEPLOYMENT] where ");
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Jbpm4Deployment对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	Jbpm4Deployment.deleteByDbid(dataVisit, ADbid, "");
}

/**
 * 从reader读到数据到对象jbpm4Deployment中
 * <param name="reader">数据源</param>
 * <param name="jbpm4Deployment">目标对象</param>
 */
public static void readValue(ResultSet reader, Jbpm4Deployment jbpm4Deployment) throws SQLException, DbException {
	jbpm4Deployment.dbid = reader.getDouble(1);
	jbpm4Deployment.name = reader.getString(2);
	if (reader.wasNull()) {
		jbpm4Deployment.name = null;
	}
	jbpm4Deployment.timestamp = reader.getDouble(3);
	if (reader.wasNull()) {
		jbpm4Deployment.timestamp = null;
	}
	jbpm4Deployment.state = reader.getString(4);
	if (reader.wasNull()) {
		jbpm4Deployment.state = null;
	}
}
}
