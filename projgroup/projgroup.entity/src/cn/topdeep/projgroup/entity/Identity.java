package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_IDENTITY: 标识表
 */
public class Identity extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * TAB_NAME: 
	 */
	String tabName = "";
	
	/**
	 * LAST_MODIFY: 
	 */
	java.util.Date lastModify;
	
	/**
	 * CURRENT_IDENTITY: 
	 */
	int currentIdentity;
	
	/**
	 * TAB_NAME: 
	 */
	public String getTabName() {
		return this.tabName;
	}
	
	/**
	 * TAB_NAME: 
	 */
	public void setTabName(String value)
	 {
		this.tabName = value;
	}
	
	/**
	 * LAST_MODIFY: 
	 */
	public java.util.Date getLastModify() {
		return this.lastModify;
	}
	
	/**
	 * LAST_MODIFY: 
	 */
	public void setLastModify(java.util.Date value)
	 {
		this.lastModify = value;
	}
	
	/**
	 * CURRENT_IDENTITY: 
	 */
	public int getCurrentIdentity() {
		return this.currentIdentity;
	}
	
	/**
	 * CURRENT_IDENTITY: 
	 */
	public void setCurrentIdentity(int value)
	 {
		this.currentIdentity = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_IDENTITY].[TAB_NAME], [T_IDENTITY].[LAST_MODIFY], [T_IDENTITY].[CURREN" +
"T_IDENTITY]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_IDENTITY].[TAB_NAME], [T_IDENTITY].[LAST_MODIFY], [T_IDENTITY].[CURREN" +
"T_IDENTITY]   from [T_IDENTITY] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_IDENTITY].[TAB_NAME], [T_IDENTITY].[LAST_MODIFY], [T_IDENTITY].[CURRENT_IDENT" +
"ITY] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_IDENTITY";
	}
	
	
	public String getTableName() {
		return "T_IDENTITY";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "TAB_NAME";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.tabName);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (Identity.class.isInstance(obj)) {
			Identity o = ((Identity)(obj));
			this.tabName = o.tabName;
			this.lastModify = o.lastModify;
			this.currentIdentity = o.currentIdentity;
		}
	}
	
	/**
	 * 插入Identity对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="identity">需要插入的标识表</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Identity identity) throws SQLException, DbException {
		String sql = "insert into [T_IDENTITY](";
		sql = (sql + "[TAB_NAME]");
		sql = (sql + ", [LAST_MODIFY]");
		sql = (sql + ", [CURRENT_IDENTITY]");
		sql = (sql + ")values(");
		sql = (sql + SqlServerUtils.safeSql(identity.getTabName().toString()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getDateSql(identity.getLastModify()));
		sql = (sql + ", ");
		sql = (sql + identity.getCurrentIdentity());
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入Identity对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Identity.insert(dataVisit, this);
	}
	
	/**
	 * 更新Identity对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="identity">需要更新的标识表</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Identity identity, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_IDENTITY] set ";
		sql = (sql + "[LAST_MODIFY] = ");
		sql = (sql + SqlServerUtils.getDateSql(identity.getLastModify()));
		sql = (sql + ",");
		sql = (sql + "[CURRENT_IDENTITY] = ");
		sql = (sql + identity.getCurrentIdentity());
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "TAB_NAME = ");
		sql = (sql + SqlServerUtils.safeSql(identity.getTabName().toString()));
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Identity对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="identity">需要更新的标识表</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Identity identity) throws SQLException, DbException {
		return Identity.update(dataVisit, identity, "");
	}
	
	/**
	 * 更新Identity对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Identity.update(dataVisit, this);
	}
	
	/**
	 * 更新Identity对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Identity.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.tabName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Identity> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Identity> list = new ArrayList<Identity>();
		try {
			for (; reader.next(); ) {
				Identity obj = new Identity();
				Identity.readValue(reader, obj);
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
	public static List<Identity> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Identity> list = new ArrayList<Identity>();
		try {
			for (; reader.next(); ) {
				Identity obj = new Identity();
				Identity.readValue(reader, obj);
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
	public static List<Identity> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Identity.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Identity> list = new ArrayList<Identity>();
		try {
			for (; reader.next(); ) {
				Identity obj = new Identity();
				Identity.readValue(reader, obj);
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
	public static List<Identity> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Identity.getFullSelectSql() + appendConditionSql));
		List<Identity> list = new ArrayList<Identity>();
		try {
			for (; reader.next(); ) {
				Identity obj = new Identity();
				Identity.readValue(reader, obj);
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
	public static <T extends Identity> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Identity.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Identity.readValue(reader, obj);
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
public static <T extends Identity> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Identity.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Identity.readValue(reader, obj);
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
	String sql = "select * from T_IDENTITY ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据查询Identity
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATabName"></param>
 */
public static Identity selectByTabName(IDataVisit2 dataVisit, String ATabName) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "TAB_NAME = ");
	sql = (sql + SqlServerUtils.safeSql(ATabName.toString()));
	List<Identity> list = Identity.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Identity对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATabName"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByTabName(IDataVisit2 dataVisit, String ATabName, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_IDENTITY] where ");
	sql = (sql + "TAB_NAME = ");
	sql = (sql + SqlServerUtils.safeSql(ATabName.toString()));
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Identity对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATabName"></param>
 */
public static void deleteByTabName(IDataVisit2 dataVisit, String ATabName) throws SQLException, DbException {
	Identity.deleteByTabName(dataVisit, ATabName, "");
}

/**
 * 从reader读到数据到对象identity中
 * <param name="reader">数据源</param>
 * <param name="identity">目标对象</param>
 */
public static void readValue(ResultSet reader, Identity identity) throws SQLException, DbException {
	identity.tabName = reader.getString(1);
	identity.lastModify = SqlUtils.getDate(reader, 2);
	identity.currentIdentity = reader.getInt(3);
}
}
