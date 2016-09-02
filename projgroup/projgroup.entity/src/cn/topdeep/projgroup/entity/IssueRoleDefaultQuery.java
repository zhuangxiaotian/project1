package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_ROLE_DEFAULT_QUERY: 角色默认查询
 */
public class IssueRoleDefaultQuery extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * ISSUE_PROJECT_ID: 标识
	 */
	int issueProjectId;
	
	/**
	 * ROLE_ID: 标识
	 */
	int roleId;
	
	/**
	 * ISSUE_QUERY_ID: 标识
	 */
	int issueQueryId;
	
	/**
	 * ISSUE_PROJECT_ID: 标识
	 */
	public int getIssueProjectId() {
		return this.issueProjectId;
	}
	
	/**
	 * ISSUE_PROJECT_ID: 标识
	 */
	public void setIssueProjectId(int value)
	 {
		this.issueProjectId = value;
	}
	
	/**
	 * ROLE_ID: 标识
	 */
	public int getRoleId() {
		return this.roleId;
	}
	
	/**
	 * ROLE_ID: 标识
	 */
	public void setRoleId(int value)
	 {
		this.roleId = value;
	}
	
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
	
	public static String getSelectSql() {
		return "select  [T_ISSUE_ROLE_DEFAULT_QUERY].[ISSUE_PROJECT_ID], [T_ISSUE_ROLE_DEFAULT_QU" +
"ERY].[ROLE_ID], [T_ISSUE_ROLE_DEFAULT_QUERY].[ISSUE_QUERY_ID]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_ISSUE_ROLE_DEFAULT_QUERY].[ISSUE_PROJECT_ID], [T_ISSUE_ROLE_DEFAULT_QU" +
"ERY].[ROLE_ID], [T_ISSUE_ROLE_DEFAULT_QUERY].[ISSUE_QUERY_ID]   from [T_ISSUE_RO" +
"LE_DEFAULT_QUERY] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_ISSUE_ROLE_DEFAULT_QUERY].[ISSUE_PROJECT_ID], [T_ISSUE_ROLE_DEFAULT_QUERY].[R" +
"OLE_ID], [T_ISSUE_ROLE_DEFAULT_QUERY].[ISSUE_QUERY_ID] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_ISSUE_ROLE_DEFAULT_QUERY";
	}
	
	
	public String getTableName() {
		return "T_ISSUE_ROLE_DEFAULT_QUERY";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "ISSUE_PROJECT_ID,ROLE_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.issueProjectId);
		kvalue = (kvalue + ",");
		kvalue = (kvalue + this.roleId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (IssueRoleDefaultQuery.class.isInstance(obj)) {
			IssueRoleDefaultQuery o = ((IssueRoleDefaultQuery)(obj));
			this.issueProjectId = o.issueProjectId;
			this.roleId = o.roleId;
			this.issueQueryId = o.issueQueryId;
		}
	}
	
	/**
	 * 插入IssueRoleDefaultQuery对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueRoleDefaultQuery">需要插入的角色默认查询</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, IssueRoleDefaultQuery issueRoleDefaultQuery) throws SQLException, DbException {
		String sql = "insert into [T_ISSUE_ROLE_DEFAULT_QUERY](";
		sql = (sql + "[ISSUE_PROJECT_ID]");
		sql = (sql + ", [ROLE_ID]");
		sql = (sql + ", [ISSUE_QUERY_ID]");
		sql = (sql + ")values(");
		sql = (sql + issueRoleDefaultQuery.getIssueProjectId());
		sql = (sql + ", ");
		sql = (sql + issueRoleDefaultQuery.getRoleId());
		sql = (sql + ", ");
		sql = (sql + issueRoleDefaultQuery.getIssueQueryId());
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入IssueRoleDefaultQuery对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		IssueRoleDefaultQuery.insert(dataVisit, this);
	}
	
	/**
	 * 更新IssueRoleDefaultQuery对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueRoleDefaultQuery">需要更新的角色默认查询</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssueRoleDefaultQuery issueRoleDefaultQuery, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_ISSUE_ROLE_DEFAULT_QUERY] set ";
		sql = (sql + "[ISSUE_QUERY_ID] = ");
		sql = (sql + issueRoleDefaultQuery.getIssueQueryId());
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "ISSUE_PROJECT_ID = ");
		sql = (sql + issueRoleDefaultQuery.getIssueProjectId());
		sql = (sql + " and ");
		sql = (sql + "ROLE_ID = ");
		sql = (sql + issueRoleDefaultQuery.getRoleId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新IssueRoleDefaultQuery对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueRoleDefaultQuery">需要更新的角色默认查询</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssueRoleDefaultQuery issueRoleDefaultQuery) throws SQLException, DbException {
		return IssueRoleDefaultQuery.update(dataVisit, issueRoleDefaultQuery, "");
	}
	
	/**
	 * 更新IssueRoleDefaultQuery对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return IssueRoleDefaultQuery.update(dataVisit, this);
	}
	
	/**
	 * 更新IssueRoleDefaultQuery对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return IssueRoleDefaultQuery.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<IssueRoleDefaultQuery> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<IssueRoleDefaultQuery> list = new ArrayList<IssueRoleDefaultQuery>();
		try {
			for (; reader.next(); ) {
				IssueRoleDefaultQuery obj = new IssueRoleDefaultQuery();
				IssueRoleDefaultQuery.readValue(reader, obj);
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
	public static List<IssueRoleDefaultQuery> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<IssueRoleDefaultQuery> list = new ArrayList<IssueRoleDefaultQuery>();
		try {
			for (; reader.next(); ) {
				IssueRoleDefaultQuery obj = new IssueRoleDefaultQuery();
				IssueRoleDefaultQuery.readValue(reader, obj);
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
	public static List<IssueRoleDefaultQuery> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssueRoleDefaultQuery.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<IssueRoleDefaultQuery> list = new ArrayList<IssueRoleDefaultQuery>();
		try {
			for (; reader.next(); ) {
				IssueRoleDefaultQuery obj = new IssueRoleDefaultQuery();
				IssueRoleDefaultQuery.readValue(reader, obj);
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
	public static List<IssueRoleDefaultQuery> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssueRoleDefaultQuery.getFullSelectSql() + appendConditionSql));
		List<IssueRoleDefaultQuery> list = new ArrayList<IssueRoleDefaultQuery>();
		try {
			for (; reader.next(); ) {
				IssueRoleDefaultQuery obj = new IssueRoleDefaultQuery();
				IssueRoleDefaultQuery.readValue(reader, obj);
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
	public static <T extends IssueRoleDefaultQuery> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssueRoleDefaultQuery.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssueRoleDefaultQuery.readValue(reader, obj);
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
public static <T extends IssueRoleDefaultQuery> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssueRoleDefaultQuery.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssueRoleDefaultQuery.readValue(reader, obj);
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
	String sql = "select * from T_ISSUE_ROLE_DEFAULT_QUERY ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据标识,标识查询IssueRoleDefaultQuery
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueProjectId">标识</param>
 * <param name="ARoleId">标识</param>
 */
public static IssueRoleDefaultQuery selectByIssueProjectIdRoleId(IDataVisit2 dataVisit, int AIssueProjectId, int ARoleId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "ISSUE_PROJECT_ID = ");
	sql = (sql + AIssueProjectId);
	sql = (sql + " and ");
	sql = (sql + "ROLE_ID = ");
	sql = (sql + ARoleId);
	List<IssueRoleDefaultQuery> list = IssueRoleDefaultQuery.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个IssueRoleDefaultQuery对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueProjectId">标识</param>
 * <param name="ARoleId">标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByIssueProjectIdRoleId(IDataVisit2 dataVisit, int AIssueProjectId, int ARoleId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ISSUE_ROLE_DEFAULT_QUERY] where ");
	sql = (sql + "ISSUE_PROJECT_ID = ");
	sql = (sql + AIssueProjectId);
	sql = (sql + " and ");
	sql = (sql + "ROLE_ID = ");
	sql = (sql + ARoleId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个IssueRoleDefaultQuery对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueProjectId">标识</param>
 * <param name="ARoleId">标识</param>
 */
public static void deleteByIssueProjectIdRoleId(IDataVisit2 dataVisit, int AIssueProjectId, int ARoleId) throws SQLException, DbException {
	IssueRoleDefaultQuery.deleteByIssueProjectIdRoleId(dataVisit, AIssueProjectId, ARoleId, "");
}

/**
 * 根据外键标识删除一批IssueRoleDefaultQuery对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueProjectId">标识</param>
 */
public static void deleteListByIssueProjectId(IDataVisit2 dataVisit, int AIssueProjectId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE_ROLE_DEFAULT_QUERY] where ");
	sql = (sql + "ISSUE_PROJECT_ID = ");
	sql = (sql + AIssueProjectId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键标识删除一批IssueRoleDefaultQuery对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueQueryId">标识</param>
 */
public static void deleteListByIssueQueryId(IDataVisit2 dataVisit, int AIssueQueryId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE_ROLE_DEFAULT_QUERY] where ");
	sql = (sql + "ISSUE_QUERY_ID = ");
	sql = (sql + AIssueQueryId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键标识删除一批IssueRoleDefaultQuery对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="RoleId">标识</param>
 */
public static void deleteListByRoleId(IDataVisit2 dataVisit, int ARoleId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE_ROLE_DEFAULT_QUERY] where ");
	sql = (sql + "ROLE_ID = ");
	sql = (sql + ARoleId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueProjectId">标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueRoleDefaultQuery> selectObjectsByIssueProjectId(IDataVisit2 dataVisit, int AIssueProjectId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ISSUE_PROJECT_ID = ";
	sql = (sql + AIssueProjectId);
	sql = (sql + appendConditionSql);
	return IssueRoleDefaultQuery.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueProjectId">标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueRoleDefaultQuery> selectObjectsByIssueProjectId(IDataVisit2 dataVisit, int AIssueProjectId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ISSUE_PROJECT_ID = ";
	sql = (sql + AIssueProjectId);
	return IssueRoleDefaultQuery.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueProjectId">标识</param>
 */
public static List<IssueRoleDefaultQuery> selectObjectsByIssueProjectId(IDataVisit2 dataVisit, int AIssueProjectId) throws SQLException, DbException {
	String sql = " where ISSUE_PROJECT_ID = ";
	sql = (sql + AIssueProjectId);
	return IssueRoleDefaultQuery.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueQueryId">标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueRoleDefaultQuery> selectObjectsByIssueQueryId(IDataVisit2 dataVisit, int AIssueQueryId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ISSUE_QUERY_ID = ";
	sql = (sql + AIssueQueryId);
	sql = (sql + appendConditionSql);
	return IssueRoleDefaultQuery.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueQueryId">标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueRoleDefaultQuery> selectObjectsByIssueQueryId(IDataVisit2 dataVisit, int AIssueQueryId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ISSUE_QUERY_ID = ";
	sql = (sql + AIssueQueryId);
	return IssueRoleDefaultQuery.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueQueryId">标识</param>
 */
public static List<IssueRoleDefaultQuery> selectObjectsByIssueQueryId(IDataVisit2 dataVisit, int AIssueQueryId) throws SQLException, DbException {
	String sql = " where ISSUE_QUERY_ID = ";
	sql = (sql + AIssueQueryId);
	return IssueRoleDefaultQuery.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="RoleId">标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueRoleDefaultQuery> selectObjectsByRoleId(IDataVisit2 dataVisit, int ARoleId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ROLE_ID = ";
	sql = (sql + ARoleId);
	sql = (sql + appendConditionSql);
	return IssueRoleDefaultQuery.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="RoleId">标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueRoleDefaultQuery> selectObjectsByRoleId(IDataVisit2 dataVisit, int ARoleId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ROLE_ID = ";
	sql = (sql + ARoleId);
	return IssueRoleDefaultQuery.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="RoleId">标识</param>
 */
public static List<IssueRoleDefaultQuery> selectObjectsByRoleId(IDataVisit2 dataVisit, int ARoleId) throws SQLException, DbException {
	String sql = " where ROLE_ID = ";
	sql = (sql + ARoleId);
	return IssueRoleDefaultQuery.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象issueRoleDefaultQuery中
 * <param name="reader">数据源</param>
 * <param name="issueRoleDefaultQuery">目标对象</param>
 */
public static void readValue(ResultSet reader, IssueRoleDefaultQuery issueRoleDefaultQuery) throws SQLException, DbException {
	issueRoleDefaultQuery.issueProjectId = reader.getInt(1);
	issueRoleDefaultQuery.roleId = reader.getInt(2);
	issueRoleDefaultQuery.issueQueryId = reader.getInt(3);
}
}
