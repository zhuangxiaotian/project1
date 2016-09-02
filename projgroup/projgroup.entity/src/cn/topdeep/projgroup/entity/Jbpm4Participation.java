package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_PARTICIPATION: 
 */
public class Jbpm4Participation extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * DBID_: 
	 */
	double dbid;
	
	/**
	 * DBVERSION_: 
	 */
	int dbversion;
	
	/**
	 * GROUPID_: 
	 */
	String groupid;
	
	/**
	 * USERID_: 
	 */
	String userid;
	
	/**
	 * TYPE_: 
	 */
	String type;
	
	/**
	 * TASK_: 
	 */
	Double task;
	
	/**
	 * SWIMLANE_: 
	 */
	Double swimlane;
	
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
	 * GROUPID_: 
	 */
	public String getGroupid() {
		return this.groupid;
	}
	
	/**
	 * GROUPID_: 
	 */
	public void setGroupid(String value)
	 {
		this.groupid = value;
	}
	
	/**
	 * USERID_: 
	 */
	public String getUserid() {
		return this.userid;
	}
	
	/**
	 * USERID_: 
	 */
	public void setUserid(String value)
	 {
		this.userid = value;
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
	 * TASK_: 
	 */
	public Double getTask() {
		return this.task;
	}
	
	/**
	 * TASK_: 
	 */
	public void setTask(Double value)
	 {
		this.task = value;
	}
	
	/**
	 * SWIMLANE_: 
	 */
	public Double getSwimlane() {
		return this.swimlane;
	}
	
	/**
	 * SWIMLANE_: 
	 */
	public void setSwimlane(Double value)
	 {
		this.swimlane = value;
	}
	
	public static String getSelectSql() {
		return "select  [JBPM4_PARTICIPATION].[DBID_], [JBPM4_PARTICIPATION].[DBVERSION_], [JBPM4" +
"_PARTICIPATION].[GROUPID_], [JBPM4_PARTICIPATION].[USERID_], [JBPM4_PARTICIPATIO" +
"N].[TYPE_], [JBPM4_PARTICIPATION].[TASK_], [JBPM4_PARTICIPATION].[SWIMLANE_]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [JBPM4_PARTICIPATION].[DBID_], [JBPM4_PARTICIPATION].[DBVERSION_], [JBPM4_PARTICIPATION].[GROUPID_], [JBPM4_PARTICIPATION].[USERID_], [JBPM4_PARTICIPATION].[TYPE_], [JBPM4_PARTICIPATION].[TASK_], [JBPM4_PARTICIPATION].[SWIMLANE_]   from [JBPM4_PARTICIPATION] ";
	}
	
	
	public static String getColumnSql() {
		return " [JBPM4_PARTICIPATION].[DBID_], [JBPM4_PARTICIPATION].[DBVERSION_], [JBPM4_PARTIC" +
"IPATION].[GROUPID_], [JBPM4_PARTICIPATION].[USERID_], [JBPM4_PARTICIPATION].[TYP" +
"E_], [JBPM4_PARTICIPATION].[TASK_], [JBPM4_PARTICIPATION].[SWIMLANE_] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "JBPM4_PARTICIPATION";
	}
	
	
	public String getTableName() {
		return "JBPM4_PARTICIPATION";
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
		if (Jbpm4Participation.class.isInstance(obj)) {
			Jbpm4Participation o = ((Jbpm4Participation)(obj));
			this.dbid = o.dbid;
			this.dbversion = o.dbversion;
			this.groupid = o.groupid;
			this.userid = o.userid;
			this.type = o.type;
			this.task = o.task;
			this.swimlane = o.swimlane;
		}
	}
	
	/**
	 * 插入Jbpm4Participation对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Participation">需要插入的</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Jbpm4Participation jbpm4Participation) throws SQLException, DbException {
		String sql = "insert into [JBPM4_PARTICIPATION](";
		sql = (sql + "[DBID_]");
		sql = (sql + ", [DBVERSION_]");
		sql = (sql + ", [GROUPID_]");
		sql = (sql + ", [USERID_]");
		sql = (sql + ", [TYPE_]");
		sql = (sql + ", [TASK_]");
		sql = (sql + ", [SWIMLANE_]");
		sql = (sql + ")values(");
		sql = (sql + jbpm4Participation.getDbid());
		sql = (sql + ", ");
		sql = (sql + jbpm4Participation.getDbversion());
		sql = (sql + ", ");
		if ((jbpm4Participation.groupid == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Participation.getGroupid().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Participation.userid == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Participation.getUserid().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Participation.type == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Participation.getType().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Participation.task == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Participation.getTask());
		}
		sql = (sql + ", ");
		if ((jbpm4Participation.swimlane == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Participation.getSwimlane());
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入Jbpm4Participation对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Jbpm4Participation.insert(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4Participation对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Participation">需要更新的</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4Participation jbpm4Participation, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [JBPM4_PARTICIPATION] set ";
		sql = (sql + "[DBVERSION_] = ");
		sql = (sql + jbpm4Participation.getDbversion());
		sql = (sql + ",");
		if ((jbpm4Participation.groupid == null)) {
			sql = (sql + "[GROUPID_] = default ,");
		}
		else {
			sql = (sql + "[GROUPID_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Participation.getGroupid().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Participation.userid == null)) {
			sql = (sql + "[USERID_] = default ,");
		}
		else {
			sql = (sql + "[USERID_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Participation.getUserid().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Participation.type == null)) {
			sql = (sql + "[TYPE_] = default ,");
		}
		else {
			sql = (sql + "[TYPE_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Participation.getType().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Participation.task == null)) {
			sql = (sql + "[TASK_] = default ,");
		}
		else {
			sql = (sql + "[TASK_] = ");
			sql = (sql + jbpm4Participation.getTask());
			sql = (sql + ",");
		}
		if ((jbpm4Participation.swimlane == null)) {
			sql = (sql + "[SWIMLANE_] = default ,");
		}
		else {
			sql = (sql + "[SWIMLANE_] = ");
			sql = (sql + jbpm4Participation.getSwimlane());
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "DBID_ = ");
		sql = (sql + jbpm4Participation.getDbid());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Jbpm4Participation对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Participation">需要更新的</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4Participation jbpm4Participation) throws SQLException, DbException {
		return Jbpm4Participation.update(dataVisit, jbpm4Participation, "");
	}
	
	/**
	 * 更新Jbpm4Participation对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Jbpm4Participation.update(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4Participation对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Jbpm4Participation.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Jbpm4Participation> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Jbpm4Participation> list = new ArrayList<Jbpm4Participation>();
		try {
			for (; reader.next(); ) {
				Jbpm4Participation obj = new Jbpm4Participation();
				Jbpm4Participation.readValue(reader, obj);
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
	public static List<Jbpm4Participation> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4Participation> list = new ArrayList<Jbpm4Participation>();
		try {
			for (; reader.next(); ) {
				Jbpm4Participation obj = new Jbpm4Participation();
				Jbpm4Participation.readValue(reader, obj);
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
	public static List<Jbpm4Participation> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4Participation.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4Participation> list = new ArrayList<Jbpm4Participation>();
		try {
			for (; reader.next(); ) {
				Jbpm4Participation obj = new Jbpm4Participation();
				Jbpm4Participation.readValue(reader, obj);
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
	public static List<Jbpm4Participation> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4Participation.getFullSelectSql() + appendConditionSql));
		List<Jbpm4Participation> list = new ArrayList<Jbpm4Participation>();
		try {
			for (; reader.next(); ) {
				Jbpm4Participation obj = new Jbpm4Participation();
				Jbpm4Participation.readValue(reader, obj);
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
	public static <T extends Jbpm4Participation> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4Participation.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4Participation.readValue(reader, obj);
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
public static <T extends Jbpm4Participation> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4Participation.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4Participation.readValue(reader, obj);
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
	String sql = "select * from JBPM4_PARTICIPATION ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据查询Jbpm4Participation
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static Jbpm4Participation selectByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	List<Jbpm4Participation> list = Jbpm4Participation.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Jbpm4Participation对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [JBPM4_PARTICIPATION] where ");
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Jbpm4Participation对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	Jbpm4Participation.deleteByDbid(dataVisit, ADbid, "");
}

/**
 * 根据外键删除一批Jbpm4Participation对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Swimlane"></param>
 */
public static void deleteListBySwimlane(IDataVisit2 dataVisit, Double ASwimlane) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_PARTICIPATION] where ");
	sql = (sql + "SWIMLANE_ = ");
	sql = (sql + ASwimlane);
	dataVisit.execSql(sql);
}

/**
 * 根据外键删除一批Jbpm4Participation对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Task"></param>
 */
public static void deleteListByTask(IDataVisit2 dataVisit, Double ATask) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_PARTICIPATION] where ");
	sql = (sql + "TASK_ = ");
	sql = (sql + ATask);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Swimlane"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Participation> selectObjectsBySwimlane(IDataVisit2 dataVisit, Double ASwimlane, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where SWIMLANE_ = ";
	sql = (sql + ASwimlane);
	sql = (sql + appendConditionSql);
	return Jbpm4Participation.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Swimlane"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Participation> selectObjectsBySwimlane(IDataVisit2 dataVisit, Double ASwimlane, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where SWIMLANE_ = ";
	sql = (sql + ASwimlane);
	return Jbpm4Participation.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Swimlane"></param>
 */
public static List<Jbpm4Participation> selectObjectsBySwimlane(IDataVisit2 dataVisit, Double ASwimlane) throws SQLException, DbException {
	String sql = " where SWIMLANE_ = ";
	sql = (sql + ASwimlane);
	return Jbpm4Participation.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Task"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Participation> selectObjectsByTask(IDataVisit2 dataVisit, Double ATask, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TASK_ = ";
	sql = (sql + ATask);
	sql = (sql + appendConditionSql);
	return Jbpm4Participation.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Task"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Participation> selectObjectsByTask(IDataVisit2 dataVisit, Double ATask, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TASK_ = ";
	sql = (sql + ATask);
	return Jbpm4Participation.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Task"></param>
 */
public static List<Jbpm4Participation> selectObjectsByTask(IDataVisit2 dataVisit, Double ATask) throws SQLException, DbException {
	String sql = " where TASK_ = ";
	sql = (sql + ATask);
	return Jbpm4Participation.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象jbpm4Participation中
 * <param name="reader">数据源</param>
 * <param name="jbpm4Participation">目标对象</param>
 */
public static void readValue(ResultSet reader, Jbpm4Participation jbpm4Participation) throws SQLException, DbException {
	jbpm4Participation.dbid = reader.getDouble(1);
	jbpm4Participation.dbversion = reader.getInt(2);
	jbpm4Participation.groupid = reader.getString(3);
	if (reader.wasNull()) {
		jbpm4Participation.groupid = null;
	}
	jbpm4Participation.userid = reader.getString(4);
	if (reader.wasNull()) {
		jbpm4Participation.userid = null;
	}
	jbpm4Participation.type = reader.getString(5);
	if (reader.wasNull()) {
		jbpm4Participation.type = null;
	}
	jbpm4Participation.task = reader.getDouble(6);
	if (reader.wasNull()) {
		jbpm4Participation.task = null;
	}
	jbpm4Participation.swimlane = reader.getDouble(7);
	if (reader.wasNull()) {
		jbpm4Participation.swimlane = null;
	}
}
}
