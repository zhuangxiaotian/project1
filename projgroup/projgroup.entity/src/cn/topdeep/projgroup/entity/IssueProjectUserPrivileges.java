package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_PROJECT_USER_PRIVILEGES: 问题系统项目用户权限
 */
public class IssueProjectUserPrivileges extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * ISSUE_PROJECT_ID: 标识
	 */
	int issueProjectId;
	
	/**
	 * ISSUE_USER_ID: 用户标识
	 */
	int issueUserId;
	
	/**
	 * ROLE_ID: 标识
	 */
	int roleId;
	
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
	 * ISSUE_USER_ID: 用户标识
	 */
	public int getIssueUserId() {
		return this.issueUserId;
	}
	
	/**
	 * ISSUE_USER_ID: 用户标识
	 */
	public void setIssueUserId(int value)
	 {
		this.issueUserId = value;
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
	
	public static String getSelectSql() {
		return "select  [T_ISSUE_PROJECT_USER_PRIVILEGES].[ISSUE_PROJECT_ID], [T_ISSUE_PROJECT_US" +
"ER_PRIVILEGES].[ISSUE_USER_ID], [T_ISSUE_PROJECT_USER_PRIVILEGES].[ROLE_ID]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_ISSUE_PROJECT_USER_PRIVILEGES].[ISSUE_PROJECT_ID], [T_ISSUE_PROJECT_US" +
"ER_PRIVILEGES].[ISSUE_USER_ID], [T_ISSUE_PROJECT_USER_PRIVILEGES].[ROLE_ID]   fr" +
"om [T_ISSUE_PROJECT_USER_PRIVILEGES] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_ISSUE_PROJECT_USER_PRIVILEGES].[ISSUE_PROJECT_ID], [T_ISSUE_PROJECT_USER_PRIV" +
"ILEGES].[ISSUE_USER_ID], [T_ISSUE_PROJECT_USER_PRIVILEGES].[ROLE_ID] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_ISSUE_PROJECT_USER_PRIVILEGES";
	}
	
	
	public String getTableName() {
		return "T_ISSUE_PROJECT_USER_PRIVILEGES";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "ISSUE_PROJECT_ID,ISSUE_USER_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.issueProjectId);
		kvalue = (kvalue + ",");
		kvalue = (kvalue + this.issueUserId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (IssueProjectUserPrivileges.class.isInstance(obj)) {
			IssueProjectUserPrivileges o = ((IssueProjectUserPrivileges)(obj));
			this.issueProjectId = o.issueProjectId;
			this.issueUserId = o.issueUserId;
			this.roleId = o.roleId;
		}
	}
	
	/**
	 * 插入IssueProjectUserPrivileges对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueProjectUserPrivileges">需要插入的问题系统项目用户权限</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, IssueProjectUserPrivileges issueProjectUserPrivileges) throws SQLException, DbException {
		String sql = "insert into [T_ISSUE_PROJECT_USER_PRIVILEGES](";
		sql = (sql + "[ISSUE_PROJECT_ID]");
		sql = (sql + ", [ISSUE_USER_ID]");
		sql = (sql + ", [ROLE_ID]");
		sql = (sql + ")values(");
		sql = (sql + issueProjectUserPrivileges.getIssueProjectId());
		sql = (sql + ", ");
		sql = (sql + issueProjectUserPrivileges.getIssueUserId());
		sql = (sql + ", ");
		sql = (sql + issueProjectUserPrivileges.getRoleId());
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入IssueProjectUserPrivileges对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		IssueProjectUserPrivileges.insert(dataVisit, this);
	}
	
	/**
	 * 更新IssueProjectUserPrivileges对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueProjectUserPrivileges">需要更新的问题系统项目用户权限</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssueProjectUserPrivileges issueProjectUserPrivileges, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_ISSUE_PROJECT_USER_PRIVILEGES] set ";
		sql = (sql + "[ROLE_ID] = ");
		sql = (sql + issueProjectUserPrivileges.getRoleId());
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "ISSUE_PROJECT_ID = ");
		sql = (sql + issueProjectUserPrivileges.getIssueProjectId());
		sql = (sql + " and ");
		sql = (sql + "ISSUE_USER_ID = ");
		sql = (sql + issueProjectUserPrivileges.getIssueUserId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新IssueProjectUserPrivileges对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueProjectUserPrivileges">需要更新的问题系统项目用户权限</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssueProjectUserPrivileges issueProjectUserPrivileges) throws SQLException, DbException {
		return IssueProjectUserPrivileges.update(dataVisit, issueProjectUserPrivileges, "");
	}
	
	/**
	 * 更新IssueProjectUserPrivileges对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return IssueProjectUserPrivileges.update(dataVisit, this);
	}
	
	/**
	 * 更新IssueProjectUserPrivileges对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return IssueProjectUserPrivileges.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<IssueProjectUserPrivileges> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<IssueProjectUserPrivileges> list = new ArrayList<IssueProjectUserPrivileges>();
		try {
			for (; reader.next(); ) {
				IssueProjectUserPrivileges obj = new IssueProjectUserPrivileges();
				IssueProjectUserPrivileges.readValue(reader, obj);
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
	public static List<IssueProjectUserPrivileges> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<IssueProjectUserPrivileges> list = new ArrayList<IssueProjectUserPrivileges>();
		try {
			for (; reader.next(); ) {
				IssueProjectUserPrivileges obj = new IssueProjectUserPrivileges();
				IssueProjectUserPrivileges.readValue(reader, obj);
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
	public static List<IssueProjectUserPrivileges> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssueProjectUserPrivileges.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<IssueProjectUserPrivileges> list = new ArrayList<IssueProjectUserPrivileges>();
		try {
			for (; reader.next(); ) {
				IssueProjectUserPrivileges obj = new IssueProjectUserPrivileges();
				IssueProjectUserPrivileges.readValue(reader, obj);
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
	public static List<IssueProjectUserPrivileges> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssueProjectUserPrivileges.getFullSelectSql() + appendConditionSql));
		List<IssueProjectUserPrivileges> list = new ArrayList<IssueProjectUserPrivileges>();
		try {
			for (; reader.next(); ) {
				IssueProjectUserPrivileges obj = new IssueProjectUserPrivileges();
				IssueProjectUserPrivileges.readValue(reader, obj);
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
	public static <T extends IssueProjectUserPrivileges> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssueProjectUserPrivileges.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssueProjectUserPrivileges.readValue(reader, obj);
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
public static <T extends IssueProjectUserPrivileges> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssueProjectUserPrivileges.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssueProjectUserPrivileges.readValue(reader, obj);
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
	String sql = "select * from T_ISSUE_PROJECT_USER_PRIVILEGES ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据标识,用户标识查询IssueProjectUserPrivileges
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 */
public static IssueProjectUserPrivileges selectByIssueProjectIdIssueUserId(IDataVisit2 dataVisit, int AIssueProjectId, int AIssueUserId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "ISSUE_PROJECT_ID = ");
	sql = (sql + AIssueProjectId);
	sql = (sql + " and ");
	sql = (sql + "ISSUE_USER_ID = ");
	sql = (sql + AIssueUserId);
	List<IssueProjectUserPrivileges> list = IssueProjectUserPrivileges.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个IssueProjectUserPrivileges对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByIssueProjectIdIssueUserId(IDataVisit2 dataVisit, int AIssueProjectId, int AIssueUserId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ISSUE_PROJECT_USER_PRIVILEGES] where ");
	sql = (sql + "ISSUE_PROJECT_ID = ");
	sql = (sql + AIssueProjectId);
	sql = (sql + " and ");
	sql = (sql + "ISSUE_USER_ID = ");
	sql = (sql + AIssueUserId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个IssueProjectUserPrivileges对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueProjectId">标识</param>
 * <param name="AIssueUserId">用户标识</param>
 */
public static void deleteByIssueProjectIdIssueUserId(IDataVisit2 dataVisit, int AIssueProjectId, int AIssueUserId) throws SQLException, DbException {
	IssueProjectUserPrivileges.deleteByIssueProjectIdIssueUserId(dataVisit, AIssueProjectId, AIssueUserId, "");
}

/**
 * 根据外键标识删除一批IssueProjectUserPrivileges对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueProjectId">标识</param>
 */
public static void deleteListByIssueProjectId(IDataVisit2 dataVisit, int AIssueProjectId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE_PROJECT_USER_PRIVILEGES] where ");
	sql = (sql + "ISSUE_PROJECT_ID = ");
	sql = (sql + AIssueProjectId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键标识删除一批IssueProjectUserPrivileges对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="RoleId">标识</param>
 */
public static void deleteListByRoleId(IDataVisit2 dataVisit, int ARoleId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE_PROJECT_USER_PRIVILEGES] where ");
	sql = (sql + "ROLE_ID = ");
	sql = (sql + ARoleId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键用户标识删除一批IssueProjectUserPrivileges对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueUserId">用户标识</param>
 */
public static void deleteListByIssueUserId(IDataVisit2 dataVisit, int AIssueUserId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE_PROJECT_USER_PRIVILEGES] where ");
	sql = (sql + "ISSUE_USER_ID = ");
	sql = (sql + AIssueUserId);
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
public static List<IssueProjectUserPrivileges> selectObjectsByIssueProjectId(IDataVisit2 dataVisit, int AIssueProjectId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ISSUE_PROJECT_ID = ";
	sql = (sql + AIssueProjectId);
	sql = (sql + appendConditionSql);
	return IssueProjectUserPrivileges.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
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
public static List<IssueProjectUserPrivileges> selectObjectsByIssueProjectId(IDataVisit2 dataVisit, int AIssueProjectId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ISSUE_PROJECT_ID = ";
	sql = (sql + AIssueProjectId);
	return IssueProjectUserPrivileges.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueProjectId">标识</param>
 */
public static List<IssueProjectUserPrivileges> selectObjectsByIssueProjectId(IDataVisit2 dataVisit, int AIssueProjectId) throws SQLException, DbException {
	String sql = " where ISSUE_PROJECT_ID = ";
	sql = (sql + AIssueProjectId);
	return IssueProjectUserPrivileges.selectObjects(dataVisit, sql);
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
public static List<IssueProjectUserPrivileges> selectObjectsByRoleId(IDataVisit2 dataVisit, int ARoleId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ROLE_ID = ";
	sql = (sql + ARoleId);
	sql = (sql + appendConditionSql);
	return IssueProjectUserPrivileges.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
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
public static List<IssueProjectUserPrivileges> selectObjectsByRoleId(IDataVisit2 dataVisit, int ARoleId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ROLE_ID = ";
	sql = (sql + ARoleId);
	return IssueProjectUserPrivileges.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="RoleId">标识</param>
 */
public static List<IssueProjectUserPrivileges> selectObjectsByRoleId(IDataVisit2 dataVisit, int ARoleId) throws SQLException, DbException {
	String sql = " where ROLE_ID = ";
	sql = (sql + ARoleId);
	return IssueProjectUserPrivileges.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueUserId">用户标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueProjectUserPrivileges> selectObjectsByIssueUserId(IDataVisit2 dataVisit, int AIssueUserId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ISSUE_USER_ID = ";
	sql = (sql + AIssueUserId);
	sql = (sql + appendConditionSql);
	return IssueProjectUserPrivileges.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueUserId">用户标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueProjectUserPrivileges> selectObjectsByIssueUserId(IDataVisit2 dataVisit, int AIssueUserId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ISSUE_USER_ID = ";
	sql = (sql + AIssueUserId);
	return IssueProjectUserPrivileges.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueUserId">用户标识</param>
 */
public static List<IssueProjectUserPrivileges> selectObjectsByIssueUserId(IDataVisit2 dataVisit, int AIssueUserId) throws SQLException, DbException {
	String sql = " where ISSUE_USER_ID = ";
	sql = (sql + AIssueUserId);
	return IssueProjectUserPrivileges.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象issueProjectUserPrivileges中
 * <param name="reader">数据源</param>
 * <param name="issueProjectUserPrivileges">目标对象</param>
 */
public static void readValue(ResultSet reader, IssueProjectUserPrivileges issueProjectUserPrivileges) throws SQLException, DbException {
	issueProjectUserPrivileges.issueProjectId = reader.getInt(1);
	issueProjectUserPrivileges.issueUserId = reader.getInt(2);
	issueProjectUserPrivileges.roleId = reader.getInt(3);
}
}
