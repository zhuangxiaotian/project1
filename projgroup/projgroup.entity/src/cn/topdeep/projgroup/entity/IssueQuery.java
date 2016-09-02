package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_QUERY: 问题查询表
 */
public class IssueQuery extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * ISSUE_QUERY_ID: 标识
	 */
	int issueQueryId;
	
	/**
	 * ISSUE_CREATE_USER_ID: 创建用户
	 */
	int issueCreateUserId;
	
	/**
	 * ISSUE_PROJECT_ID: 关联项目
	 */
	Integer issueProjectId;
	
	/**
	 * ISSUE_QUERY_NAME: 查询名称
	 */
	String issueQueryName = "";
	
	/**
	 * ISSUE_QUERY_SQL: 查询语句
	 */
	String issueQuerySql = "";
	
	/**
	 * ISSUE_QUERY_MEMO: 查询备注
	 */
	String issueQueryMemo = "";
	
	/**
	 * IS_PUBLIC: 是否公开
	 */
	boolean isPublic;
	
	/**
	 * ISSUE_QUERY_ID: 标识
	 */
	public int getIssueQueryId() {
		return this.issueQueryId;
	}
	
	/**
	 * ISSUE_QUERY_ID: 标识
	 */
	public void setIssueQueryId(int value)
	 {
		this.issueQueryId = value;
	}
	
	/**
	 * ISSUE_CREATE_USER_ID: 创建用户
	 */
	public int getIssueCreateUserId() {
		return this.issueCreateUserId;
	}
	
	/**
	 * ISSUE_CREATE_USER_ID: 创建用户
	 */
	public void setIssueCreateUserId(int value)
	 {
		this.issueCreateUserId = value;
	}
	
	/**
	 * ISSUE_PROJECT_ID: 关联项目
	 */
	public Integer getIssueProjectId() {
		return this.issueProjectId;
	}
	
	/**
	 * ISSUE_PROJECT_ID: 关联项目
	 */
	public void setIssueProjectId(Integer value)
	 {
		this.issueProjectId = value;
	}
	
	/**
	 * ISSUE_QUERY_NAME: 查询名称
	 */
	public String getIssueQueryName() {
		return this.issueQueryName;
	}
	
	/**
	 * ISSUE_QUERY_NAME: 查询名称
	 */
	public void setIssueQueryName(String value)
	 {
		this.issueQueryName = value;
	}
	
	/**
	 * ISSUE_QUERY_SQL: 查询语句
	 */
	public String getIssueQuerySql() {
		return this.issueQuerySql;
	}
	
	/**
	 * ISSUE_QUERY_SQL: 查询语句
	 */
	public void setIssueQuerySql(String value)
	 {
		this.issueQuerySql = value;
	}
	
	/**
	 * ISSUE_QUERY_MEMO: 查询备注
	 */
	public String getIssueQueryMemo() {
		return this.issueQueryMemo;
	}
	
	/**
	 * ISSUE_QUERY_MEMO: 查询备注
	 */
	public void setIssueQueryMemo(String value)
	 {
		this.issueQueryMemo = value;
	}
	
	/**
	 * IS_PUBLIC: 是否公开
	 */
	public boolean getIsPublic() {
		return this.isPublic;
	}
	
	/**
	 * IS_PUBLIC: 是否公开
	 */
	public void setIsPublic(boolean value)
	 {
		this.isPublic = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_ISSUE_QUERY].[ISSUE_QUERY_ID], [T_ISSUE_QUERY].[ISSUE_CREATE_USER_ID]," +
" [T_ISSUE_QUERY].[ISSUE_PROJECT_ID], [T_ISSUE_QUERY].[ISSUE_QUERY_NAME], [T_ISSU" +
"E_QUERY].[ISSUE_QUERY_SQL], [T_ISSUE_QUERY].[ISSUE_QUERY_MEMO], [T_ISSUE_QUERY]." +
"[IS_PUBLIC]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_ISSUE_QUERY].[ISSUE_QUERY_ID], [T_ISSUE_QUERY].[ISSUE_CREATE_USER_ID], [T_ISSUE_QUERY].[ISSUE_PROJECT_ID], [T_ISSUE_QUERY].[ISSUE_QUERY_NAME], [T_ISSUE_QUERY].[ISSUE_QUERY_SQL], [T_ISSUE_QUERY].[ISSUE_QUERY_MEMO], [T_ISSUE_QUERY].[IS_PUBLIC]   from [T_ISSUE_QUERY] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_ISSUE_QUERY].[ISSUE_QUERY_ID], [T_ISSUE_QUERY].[ISSUE_CREATE_USER_ID], [T_ISS" +
"UE_QUERY].[ISSUE_PROJECT_ID], [T_ISSUE_QUERY].[ISSUE_QUERY_NAME], [T_ISSUE_QUERY" +
"].[ISSUE_QUERY_SQL], [T_ISSUE_QUERY].[ISSUE_QUERY_MEMO], [T_ISSUE_QUERY].[IS_PUB" +
"LIC] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_ISSUE_QUERY";
	}
	
	
	public String getTableName() {
		return "T_ISSUE_QUERY";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "ISSUE_QUERY_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.issueQueryId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (IssueQuery.class.isInstance(obj)) {
			IssueQuery o = ((IssueQuery)(obj));
			this.issueQueryId = o.issueQueryId;
			this.issueCreateUserId = o.issueCreateUserId;
			this.issueProjectId = o.issueProjectId;
			this.issueQueryName = o.issueQueryName;
			this.issueQuerySql = o.issueQuerySql;
			this.issueQueryMemo = o.issueQueryMemo;
			this.isPublic = o.isPublic;
		}
	}
	
	/**
	 * 插入IssueQuery对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueQuery">需要插入的问题查询表</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, IssueQuery issueQuery) throws SQLException, DbException {
		String sql = "insert into [T_ISSUE_QUERY](";
		if ((issueQuery.getIssueQueryId() > 0)) {
			sql = (sql + "[ISSUE_QUERY_ID], ");
		}
		sql = (sql + "[ISSUE_CREATE_USER_ID]");
		sql = (sql + ", [ISSUE_PROJECT_ID]");
		sql = (sql + ", [ISSUE_QUERY_NAME]");
		sql = (sql + ", [ISSUE_QUERY_SQL]");
		sql = (sql + ", [ISSUE_QUERY_MEMO]");
		sql = (sql + ", [IS_PUBLIC]");
		sql = (sql + ")values(");
		if ((issueQuery.getIssueQueryId() > 0)) {
			sql = (sql + issueQuery.getIssueQueryId());
			sql = (sql + ", ");
		}
		sql = (sql + issueQuery.getIssueCreateUserId());
		sql = (sql + ", ");
		if ((issueQuery.issueProjectId == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + issueQuery.getIssueProjectId());
		}
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(issueQuery.getIssueQueryName().toString()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(issueQuery.getIssueQuerySql().toString()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(issueQuery.getIssueQueryMemo().toString()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getBoolSql(issueQuery.getIsPublic()));
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((issueQuery.getIssueQueryId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_ISSUE_QUERY] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_ISSUE_QUERY off");
			}
			dataVisit.execSql(sql);
			if ((issueQuery.getIssueQueryId() == 0)) {
				issueQuery.issueQueryId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入IssueQuery对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		IssueQuery.insert(dataVisit, this);
	}
	
	/**
	 * 更新IssueQuery对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueQuery">需要更新的问题查询表</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssueQuery issueQuery, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_ISSUE_QUERY] set ";
		sql = (sql + "[ISSUE_CREATE_USER_ID] = ");
		sql = (sql + issueQuery.getIssueCreateUserId());
		sql = (sql + ",");
		if ((issueQuery.issueProjectId == null)) {
			sql = (sql + "[ISSUE_PROJECT_ID] = default ,");
		}
		else {
			sql = (sql + "[ISSUE_PROJECT_ID] = ");
			sql = (sql + issueQuery.getIssueProjectId());
			sql = (sql + ",");
		}
		sql = (sql + "[ISSUE_QUERY_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(issueQuery.getIssueQueryName().toString()));
		sql = (sql + ",");
		sql = (sql + "[ISSUE_QUERY_SQL] = ");
		sql = (sql + SqlServerUtils.safeSql(issueQuery.getIssueQuerySql().toString()));
		sql = (sql + ",");
		sql = (sql + "[ISSUE_QUERY_MEMO] = ");
		sql = (sql + SqlServerUtils.safeSql(issueQuery.getIssueQueryMemo().toString()));
		sql = (sql + ",");
		sql = (sql + "[IS_PUBLIC] = ");
		sql = (sql + SqlServerUtils.getBoolSql(issueQuery.getIsPublic()));
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "ISSUE_QUERY_ID = ");
		sql = (sql + issueQuery.getIssueQueryId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新IssueQuery对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueQuery">需要更新的问题查询表</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssueQuery issueQuery) throws SQLException, DbException {
		return IssueQuery.update(dataVisit, issueQuery, "");
	}
	
	/**
	 * 更新IssueQuery对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return IssueQuery.update(dataVisit, this);
	}
	
	/**
	 * 更新IssueQuery对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return IssueQuery.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.issueQueryName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<IssueQuery> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<IssueQuery> list = new ArrayList<IssueQuery>();
		try {
			for (; reader.next(); ) {
				IssueQuery obj = new IssueQuery();
				IssueQuery.readValue(reader, obj);
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
	public static List<IssueQuery> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<IssueQuery> list = new ArrayList<IssueQuery>();
		try {
			for (; reader.next(); ) {
				IssueQuery obj = new IssueQuery();
				IssueQuery.readValue(reader, obj);
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
	public static List<IssueQuery> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssueQuery.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<IssueQuery> list = new ArrayList<IssueQuery>();
		try {
			for (; reader.next(); ) {
				IssueQuery obj = new IssueQuery();
				IssueQuery.readValue(reader, obj);
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
	public static List<IssueQuery> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssueQuery.getFullSelectSql() + appendConditionSql));
		List<IssueQuery> list = new ArrayList<IssueQuery>();
		try {
			for (; reader.next(); ) {
				IssueQuery obj = new IssueQuery();
				IssueQuery.readValue(reader, obj);
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
	public static <T extends IssueQuery> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssueQuery.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssueQuery.readValue(reader, obj);
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
public static <T extends IssueQuery> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssueQuery.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssueQuery.readValue(reader, obj);
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
	String sql = "select * from T_ISSUE_QUERY ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据标识查询IssueQuery
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueQueryId">标识</param>
 */
public static IssueQuery selectByIssueQueryId(IDataVisit2 dataVisit, int AIssueQueryId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "ISSUE_QUERY_ID = ");
	sql = (sql + AIssueQueryId);
	List<IssueQuery> list = IssueQuery.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个IssueQuery对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueQueryId">标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByIssueQueryId(IDataVisit2 dataVisit, int AIssueQueryId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ISSUE_QUERY] where ");
	sql = (sql + "ISSUE_QUERY_ID = ");
	sql = (sql + AIssueQueryId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个IssueQuery对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueQueryId">标识</param>
 */
public static void deleteByIssueQueryId(IDataVisit2 dataVisit, int AIssueQueryId) throws SQLException, DbException {
	IssueQuery.deleteByIssueQueryId(dataVisit, AIssueQueryId, "");
}

/**
 * 根据外键关联项目删除一批IssueQuery对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueProjectId">关联项目</param>
 */
public static void deleteListByIssueProjectId(IDataVisit2 dataVisit, Integer AIssueProjectId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE_QUERY] where ");
	sql = (sql + "ISSUE_PROJECT_ID = ");
	sql = (sql + AIssueProjectId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键创建用户删除一批IssueQuery对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueCreateUserId">创建用户</param>
 */
public static void deleteListByIssueCreateUserId(IDataVisit2 dataVisit, int AIssueCreateUserId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE_QUERY] where ");
	sql = (sql + "ISSUE_CREATE_USER_ID = ");
	sql = (sql + AIssueCreateUserId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueProjectId">关联项目</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueQuery> selectObjectsByIssueProjectId(IDataVisit2 dataVisit, Integer AIssueProjectId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ISSUE_PROJECT_ID = ";
	sql = (sql + AIssueProjectId);
	sql = (sql + appendConditionSql);
	return IssueQuery.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueProjectId">关联项目</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueQuery> selectObjectsByIssueProjectId(IDataVisit2 dataVisit, Integer AIssueProjectId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ISSUE_PROJECT_ID = ";
	sql = (sql + AIssueProjectId);
	return IssueQuery.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueProjectId">关联项目</param>
 */
public static List<IssueQuery> selectObjectsByIssueProjectId(IDataVisit2 dataVisit, Integer AIssueProjectId) throws SQLException, DbException {
	String sql = " where ISSUE_PROJECT_ID = ";
	sql = (sql + AIssueProjectId);
	return IssueQuery.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueCreateUserId">创建用户</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueQuery> selectObjectsByIssueCreateUserId(IDataVisit2 dataVisit, int AIssueCreateUserId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ISSUE_CREATE_USER_ID = ";
	sql = (sql + AIssueCreateUserId);
	sql = (sql + appendConditionSql);
	return IssueQuery.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueCreateUserId">创建用户</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueQuery> selectObjectsByIssueCreateUserId(IDataVisit2 dataVisit, int AIssueCreateUserId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ISSUE_CREATE_USER_ID = ";
	sql = (sql + AIssueCreateUserId);
	return IssueQuery.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueCreateUserId">创建用户</param>
 */
public static List<IssueQuery> selectObjectsByIssueCreateUserId(IDataVisit2 dataVisit, int AIssueCreateUserId) throws SQLException, DbException {
	String sql = " where ISSUE_CREATE_USER_ID = ";
	sql = (sql + AIssueCreateUserId);
	return IssueQuery.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象issueQuery中
 * <param name="reader">数据源</param>
 * <param name="issueQuery">目标对象</param>
 */
public static void readValue(ResultSet reader, IssueQuery issueQuery) throws SQLException, DbException {
	issueQuery.issueQueryId = reader.getInt(1);
	issueQuery.issueCreateUserId = reader.getInt(2);
	issueQuery.issueProjectId = reader.getInt(3);
	if (reader.wasNull()) {
		issueQuery.issueProjectId = null;
	}
	issueQuery.issueQueryName = reader.getString(4);
	issueQuery.issueQuerySql = reader.getString(5);
	issueQuery.issueQueryMemo = reader.getString(6);
	issueQuery.isPublic = reader.getBoolean(7);
}
}
