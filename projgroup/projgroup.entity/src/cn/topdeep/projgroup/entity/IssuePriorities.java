package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_PRIORITIES: 问题优先级别定义
 */
public class IssuePriorities extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * PRIORITIES_ID: 优先级别
	 */
	byte prioritiesId;
	
	/**
	 * PRIORITIES_NAME: 优先名称
	 */
	String prioritiesName = "";
	
	/**
	 * IS_DEFAULT: 是否是默认级别
	 */
	boolean isDefault;
	
	/**
	 * PRIORITIES_ID: 优先级别
	 */
	public byte getPrioritiesId() {
		return this.prioritiesId;
	}
	
	/**
	 * PRIORITIES_ID: 优先级别
	 */
	public void setPrioritiesId(byte value)
	 {
		this.prioritiesId = value;
	}
	
	/**
	 * PRIORITIES_NAME: 优先名称
	 */
	public String getPrioritiesName() {
		return this.prioritiesName;
	}
	
	/**
	 * PRIORITIES_NAME: 优先名称
	 */
	public void setPrioritiesName(String value)
	 {
		this.prioritiesName = value;
	}
	
	/**
	 * IS_DEFAULT: 是否是默认级别
	 */
	public boolean getIsDefault() {
		return this.isDefault;
	}
	
	/**
	 * IS_DEFAULT: 是否是默认级别
	 */
	public void setIsDefault(boolean value)
	 {
		this.isDefault = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_ISSUE_PRIORITIES].[PRIORITIES_ID], [T_ISSUE_PRIORITIES].[PRIORITIES_NA" +
"ME], [T_ISSUE_PRIORITIES].[IS_DEFAULT]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_ISSUE_PRIORITIES].[PRIORITIES_ID], [T_ISSUE_PRIORITIES].[PRIORITIES_NA" +
"ME], [T_ISSUE_PRIORITIES].[IS_DEFAULT]   from [T_ISSUE_PRIORITIES] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_ISSUE_PRIORITIES].[PRIORITIES_ID], [T_ISSUE_PRIORITIES].[PRIORITIES_NAME], [T" +
"_ISSUE_PRIORITIES].[IS_DEFAULT] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_ISSUE_PRIORITIES";
	}
	
	
	public String getTableName() {
		return "T_ISSUE_PRIORITIES";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "PRIORITIES_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.prioritiesId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (IssuePriorities.class.isInstance(obj)) {
			IssuePriorities o = ((IssuePriorities)(obj));
			this.prioritiesId = o.prioritiesId;
			this.prioritiesName = o.prioritiesName;
			this.isDefault = o.isDefault;
		}
	}
	
	/**
	 * 插入IssuePriorities对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issuePriorities">需要插入的问题优先级别定义</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, IssuePriorities issuePriorities) throws SQLException, DbException {
		String sql = "insert into [T_ISSUE_PRIORITIES](";
		sql = (sql + "[PRIORITIES_ID]");
		sql = (sql + ", [PRIORITIES_NAME]");
		sql = (sql + ", [IS_DEFAULT]");
		sql = (sql + ")values(");
		sql = (sql + issuePriorities.getPrioritiesId());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(issuePriorities.getPrioritiesName().toString()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getBoolSql(issuePriorities.getIsDefault()));
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入IssuePriorities对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		IssuePriorities.insert(dataVisit, this);
	}
	
	/**
	 * 更新IssuePriorities对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issuePriorities">需要更新的问题优先级别定义</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssuePriorities issuePriorities, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_ISSUE_PRIORITIES] set ";
		sql = (sql + "[PRIORITIES_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(issuePriorities.getPrioritiesName().toString()));
		sql = (sql + ",");
		sql = (sql + "[IS_DEFAULT] = ");
		sql = (sql + SqlServerUtils.getBoolSql(issuePriorities.getIsDefault()));
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "PRIORITIES_ID = ");
		sql = (sql + issuePriorities.getPrioritiesId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新IssuePriorities对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issuePriorities">需要更新的问题优先级别定义</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssuePriorities issuePriorities) throws SQLException, DbException {
		return IssuePriorities.update(dataVisit, issuePriorities, "");
	}
	
	/**
	 * 更新IssuePriorities对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return IssuePriorities.update(dataVisit, this);
	}
	
	/**
	 * 更新IssuePriorities对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return IssuePriorities.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.prioritiesName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<IssuePriorities> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<IssuePriorities> list = new ArrayList<IssuePriorities>();
		try {
			for (; reader.next(); ) {
				IssuePriorities obj = new IssuePriorities();
				IssuePriorities.readValue(reader, obj);
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
	public static List<IssuePriorities> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<IssuePriorities> list = new ArrayList<IssuePriorities>();
		try {
			for (; reader.next(); ) {
				IssuePriorities obj = new IssuePriorities();
				IssuePriorities.readValue(reader, obj);
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
	public static List<IssuePriorities> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssuePriorities.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<IssuePriorities> list = new ArrayList<IssuePriorities>();
		try {
			for (; reader.next(); ) {
				IssuePriorities obj = new IssuePriorities();
				IssuePriorities.readValue(reader, obj);
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
	public static List<IssuePriorities> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssuePriorities.getFullSelectSql() + appendConditionSql));
		List<IssuePriorities> list = new ArrayList<IssuePriorities>();
		try {
			for (; reader.next(); ) {
				IssuePriorities obj = new IssuePriorities();
				IssuePriorities.readValue(reader, obj);
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
	public static <T extends IssuePriorities> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssuePriorities.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssuePriorities.readValue(reader, obj);
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
public static <T extends IssuePriorities> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssuePriorities.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssuePriorities.readValue(reader, obj);
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
	String sql = "select * from T_ISSUE_PRIORITIES ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据优先级别查询IssuePriorities
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APrioritiesId">优先级别</param>
 */
public static IssuePriorities selectByPrioritiesId(IDataVisit2 dataVisit, Byte APrioritiesId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "PRIORITIES_ID = ");
	sql = (sql + APrioritiesId);
	List<IssuePriorities> list = IssuePriorities.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 根据优先名称查询IssuePriorities
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APrioritiesName">优先名称</param>
 */
public static IssuePriorities selectByPrioritiesName(IDataVisit2 dataVisit, String APrioritiesName) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "PRIORITIES_NAME = ");
	sql = (sql + SqlServerUtils.safeSql(APrioritiesName.toString()));
	List<IssuePriorities> list = IssuePriorities.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个IssuePriorities对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APrioritiesId">优先级别</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByPrioritiesId(IDataVisit2 dataVisit, Byte APrioritiesId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ISSUE_PRIORITIES] where ");
	sql = (sql + "PRIORITIES_ID = ");
	sql = (sql + APrioritiesId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个IssuePriorities对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APrioritiesId">优先级别</param>
 */
public static void deleteByPrioritiesId(IDataVisit2 dataVisit, Byte APrioritiesId) throws SQLException, DbException {
	IssuePriorities.deleteByPrioritiesId(dataVisit, APrioritiesId, "");
}

/**
 * 从数据库中删除一个IssuePriorities对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APrioritiesName">优先名称</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByPrioritiesName(IDataVisit2 dataVisit, String APrioritiesName, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ISSUE_PRIORITIES] where ");
	sql = (sql + "PRIORITIES_NAME = ");
	sql = (sql + SqlServerUtils.safeSql(APrioritiesName.toString()));
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个IssuePriorities对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APrioritiesName">优先名称</param>
 */
public static void deleteByPrioritiesName(IDataVisit2 dataVisit, String APrioritiesName) throws SQLException, DbException {
	IssuePriorities.deleteByPrioritiesName(dataVisit, APrioritiesName, "");
}

/**
 * 从reader读到数据到对象issuePriorities中
 * <param name="reader">数据源</param>
 * <param name="issuePriorities">目标对象</param>
 */
public static void readValue(ResultSet reader, IssuePriorities issuePriorities) throws SQLException, DbException {
	issuePriorities.prioritiesId = reader.getByte(1);
	issuePriorities.prioritiesName = reader.getString(2);
	issuePriorities.isDefault = reader.getBoolean(3);
}
}
