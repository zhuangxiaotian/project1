package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_STATUS: 问题状态定义
 */
public class IssueStatus extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * STATUS_ID: 状态标识
	 */
	int statusId;
	
	/**
	 * STATUS_NAME: 状态名称
	 */
	String statusName = "";
	
	/**
	 * STATUS_SORT: 状态顺序
	 */
	int statusSort;
	
	/**
	 * IS_DEFAULT: 是否默认状态
	 */
	boolean isDefault;
	
	/**
	 * STATUS_ID: 状态标识
	 */
	public int getStatusId() {
		return this.statusId;
	}
	
	/**
	 * STATUS_ID: 状态标识
	 */
	public void setStatusId(int value)
	 {
		this.statusId = value;
	}
	
	/**
	 * STATUS_NAME: 状态名称
	 */
	public String getStatusName() {
		return this.statusName;
	}
	
	/**
	 * STATUS_NAME: 状态名称
	 */
	public void setStatusName(String value)
	 {
		this.statusName = value;
	}
	
	/**
	 * STATUS_SORT: 状态顺序
	 */
	public int getStatusSort() {
		return this.statusSort;
	}
	
	/**
	 * STATUS_SORT: 状态顺序
	 */
	public void setStatusSort(int value)
	 {
		this.statusSort = value;
	}
	
	/**
	 * IS_DEFAULT: 是否默认状态
	 */
	public boolean getIsDefault() {
		return this.isDefault;
	}
	
	/**
	 * IS_DEFAULT: 是否默认状态
	 */
	public void setIsDefault(boolean value)
	 {
		this.isDefault = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_ISSUE_STATUS].[STATUS_ID], [T_ISSUE_STATUS].[STATUS_NAME], [T_ISSUE_ST" +
"ATUS].[STATUS_SORT], [T_ISSUE_STATUS].[IS_DEFAULT]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_ISSUE_STATUS].[STATUS_ID], [T_ISSUE_STATUS].[STATUS_NAME], [T_ISSUE_ST" +
"ATUS].[STATUS_SORT], [T_ISSUE_STATUS].[IS_DEFAULT]   from [T_ISSUE_STATUS] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_ISSUE_STATUS].[STATUS_ID], [T_ISSUE_STATUS].[STATUS_NAME], [T_ISSUE_STATUS].[" +
"STATUS_SORT], [T_ISSUE_STATUS].[IS_DEFAULT] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_ISSUE_STATUS";
	}
	
	
	public String getTableName() {
		return "T_ISSUE_STATUS";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "STATUS_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.statusId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (IssueStatus.class.isInstance(obj)) {
			IssueStatus o = ((IssueStatus)(obj));
			this.statusId = o.statusId;
			this.statusName = o.statusName;
			this.statusSort = o.statusSort;
			this.isDefault = o.isDefault;
		}
	}
	
	/**
	 * 插入IssueStatus对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueStatus">需要插入的问题状态定义</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, IssueStatus issueStatus) throws SQLException, DbException {
		String sql = "insert into [T_ISSUE_STATUS](";
		if ((issueStatus.getStatusId() > 0)) {
			sql = (sql + "[STATUS_ID], ");
		}
		sql = (sql + "[STATUS_NAME]");
		sql = (sql + ", [STATUS_SORT]");
		sql = (sql + ", [IS_DEFAULT]");
		sql = (sql + ")values(");
		if ((issueStatus.getStatusId() > 0)) {
			sql = (sql + issueStatus.getStatusId());
			sql = (sql + ", ");
		}
		sql = (sql + SqlServerUtils.safeSql(issueStatus.getStatusName().toString()));
		sql = (sql + ", ");
		sql = (sql + issueStatus.getStatusSort());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getBoolSql(issueStatus.getIsDefault()));
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((issueStatus.getStatusId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_ISSUE_STATUS] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_ISSUE_STATUS off");
			}
			dataVisit.execSql(sql);
			if ((issueStatus.getStatusId() == 0)) {
				issueStatus.statusId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入IssueStatus对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		IssueStatus.insert(dataVisit, this);
	}
	
	/**
	 * 更新IssueStatus对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueStatus">需要更新的问题状态定义</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssueStatus issueStatus, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_ISSUE_STATUS] set ";
		sql = (sql + "[STATUS_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(issueStatus.getStatusName().toString()));
		sql = (sql + ",");
		sql = (sql + "[STATUS_SORT] = ");
		sql = (sql + issueStatus.getStatusSort());
		sql = (sql + ",");
		sql = (sql + "[IS_DEFAULT] = ");
		sql = (sql + SqlServerUtils.getBoolSql(issueStatus.getIsDefault()));
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "STATUS_ID = ");
		sql = (sql + issueStatus.getStatusId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新IssueStatus对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueStatus">需要更新的问题状态定义</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssueStatus issueStatus) throws SQLException, DbException {
		return IssueStatus.update(dataVisit, issueStatus, "");
	}
	
	/**
	 * 更新IssueStatus对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return IssueStatus.update(dataVisit, this);
	}
	
	/**
	 * 更新IssueStatus对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return IssueStatus.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.statusName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<IssueStatus> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<IssueStatus> list = new ArrayList<IssueStatus>();
		try {
			for (; reader.next(); ) {
				IssueStatus obj = new IssueStatus();
				IssueStatus.readValue(reader, obj);
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
	public static List<IssueStatus> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<IssueStatus> list = new ArrayList<IssueStatus>();
		try {
			for (; reader.next(); ) {
				IssueStatus obj = new IssueStatus();
				IssueStatus.readValue(reader, obj);
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
	public static List<IssueStatus> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssueStatus.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<IssueStatus> list = new ArrayList<IssueStatus>();
		try {
			for (; reader.next(); ) {
				IssueStatus obj = new IssueStatus();
				IssueStatus.readValue(reader, obj);
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
	public static List<IssueStatus> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssueStatus.getFullSelectSql() + appendConditionSql));
		List<IssueStatus> list = new ArrayList<IssueStatus>();
		try {
			for (; reader.next(); ) {
				IssueStatus obj = new IssueStatus();
				IssueStatus.readValue(reader, obj);
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
	public static <T extends IssueStatus> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssueStatus.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssueStatus.readValue(reader, obj);
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
public static <T extends IssueStatus> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssueStatus.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssueStatus.readValue(reader, obj);
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
	String sql = "select * from T_ISSUE_STATUS ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据状态标识查询IssueStatus
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AStatusId">状态标识</param>
 */
public static IssueStatus selectByStatusId(IDataVisit2 dataVisit, int AStatusId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "STATUS_ID = ");
	sql = (sql + AStatusId);
	List<IssueStatus> list = IssueStatus.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 根据状态名称查询IssueStatus
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AStatusName">状态名称</param>
 */
public static IssueStatus selectByStatusName(IDataVisit2 dataVisit, String AStatusName) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "STATUS_NAME = ");
	sql = (sql + SqlServerUtils.safeSql(AStatusName.toString()));
	List<IssueStatus> list = IssueStatus.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个IssueStatus对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AStatusId">状态标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByStatusId(IDataVisit2 dataVisit, int AStatusId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ISSUE_STATUS] where ");
	sql = (sql + "STATUS_ID = ");
	sql = (sql + AStatusId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个IssueStatus对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AStatusId">状态标识</param>
 */
public static void deleteByStatusId(IDataVisit2 dataVisit, int AStatusId) throws SQLException, DbException {
	IssueStatus.deleteByStatusId(dataVisit, AStatusId, "");
}

/**
 * 从数据库中删除一个IssueStatus对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AStatusName">状态名称</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByStatusName(IDataVisit2 dataVisit, String AStatusName, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ISSUE_STATUS] where ");
	sql = (sql + "STATUS_NAME = ");
	sql = (sql + SqlServerUtils.safeSql(AStatusName.toString()));
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个IssueStatus对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AStatusName">状态名称</param>
 */
public static void deleteByStatusName(IDataVisit2 dataVisit, String AStatusName) throws SQLException, DbException {
	IssueStatus.deleteByStatusName(dataVisit, AStatusName, "");
}

/**
 * 从reader读到数据到对象issueStatus中
 * <param name="reader">数据源</param>
 * <param name="issueStatus">目标对象</param>
 */
public static void readValue(ResultSet reader, IssueStatus issueStatus) throws SQLException, DbException {
	issueStatus.statusId = reader.getInt(1);
	issueStatus.statusName = reader.getString(2);
	issueStatus.statusSort = reader.getInt(3);
	issueStatus.isDefault = reader.getBoolean(4);
}
}
