package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_USERS: 问题跟踪系统用户表
 */
public class IssueUsers extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * ISSUE_USER_ID: 用户标识
	 */
	int issueUserId;
	
	/**
	 * INNER_USER_ID: 关联到内部的ID
	 */
	Integer innerUserId;
	
	/**
	 * ISSUE_USER_NAME: 用户名称
	 */
	String issueUserName = "";
	
	/**
	 * ISSUE_USER_TYPE: 类型的意思区别内部用户和外部用户 0 内部用户 1 外部用户
	 */
	byte issueUserType;
	
	/**
	 * LOGIN_NAME: 登录名称
	 */
	String loginName = "";
	
	/**
	 * LOGIN_PASSWORD: 登录密码
	 */
	String loginPassword = "";
	
	/**
	 * USER_STATE: 用户状态 0 表示正常用户 1 表示 禁止用户 9 表示删除用户
	 */
	byte userState;
	
	/**
	 * USER_EMAIL:  用户邮箱
	 */
	String userEmail;
	
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
	 * INNER_USER_ID: 关联到内部的ID
	 */
	public Integer getInnerUserId() {
		return this.innerUserId;
	}
	
	/**
	 * INNER_USER_ID: 关联到内部的ID
	 */
	public void setInnerUserId(Integer value)
	 {
		this.innerUserId = value;
	}
	
	/**
	 * ISSUE_USER_NAME: 用户名称
	 */
	public String getIssueUserName() {
		return this.issueUserName;
	}
	
	/**
	 * ISSUE_USER_NAME: 用户名称
	 */
	public void setIssueUserName(String value)
	 {
		this.issueUserName = value;
	}
	
	/**
	 * ISSUE_USER_TYPE: 类型的意思区别内部用户和外部用户 0 内部用户 1 外部用户
	 */
	public byte getIssueUserType() {
		return this.issueUserType;
	}
	
	/**
	 * ISSUE_USER_TYPE: 类型的意思区别内部用户和外部用户 0 内部用户 1 外部用户
	 */
	public void setIssueUserType(byte value)
	 {
		this.issueUserType = value;
	}
	
	/**
	 * LOGIN_NAME: 登录名称
	 */
	public String getLoginName() {
		return this.loginName;
	}
	
	/**
	 * LOGIN_NAME: 登录名称
	 */
	public void setLoginName(String value)
	 {
		this.loginName = value;
	}
	
	/**
	 * LOGIN_PASSWORD: 登录密码
	 */
	public String getLoginPassword() {
		return this.loginPassword;
	}
	
	/**
	 * LOGIN_PASSWORD: 登录密码
	 */
	public void setLoginPassword(String value)
	 {
		this.loginPassword = value;
	}
	
	/**
	 * USER_STATE: 用户状态 0 表示正常用户 1 表示 禁止用户 9 表示删除用户
	 */
	public byte getUserState() {
		return this.userState;
	}
	
	/**
	 * USER_STATE: 用户状态 0 表示正常用户 1 表示 禁止用户 9 表示删除用户
	 */
	public void setUserState(byte value)
	 {
		this.userState = value;
	}
	
	/**
	 * USER_EMAIL:  用户邮箱
	 */
	public String getUserEmail() {
		return this.userEmail;
	}
	
	/**
	 * USER_EMAIL:  用户邮箱
	 */
	public void setUserEmail(String value)
	 {
		this.userEmail = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_ISSUE_USERS].[ISSUE_USER_ID], [T_ISSUE_USERS].[INNER_USER_ID], [T_ISSUE_USERS].[ISSUE_USER_NAME], [T_ISSUE_USERS].[ISSUE_USER_TYPE], [T_ISSUE_USERS].[LOGIN_NAME], [T_ISSUE_USERS].[LOGIN_PASSWORD], [T_ISSUE_USERS].[USER_STATE], [T_ISSUE_USERS].[USER_EMAIL]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_ISSUE_USERS].[ISSUE_USER_ID], [T_ISSUE_USERS].[INNER_USER_ID], [T_ISSUE_USERS].[ISSUE_USER_NAME], [T_ISSUE_USERS].[ISSUE_USER_TYPE], [T_ISSUE_USERS].[LOGIN_NAME], [T_ISSUE_USERS].[LOGIN_PASSWORD], [T_ISSUE_USERS].[USER_STATE], [T_ISSUE_USERS].[USER_EMAIL]   from [T_ISSUE_USERS] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_ISSUE_USERS].[ISSUE_USER_ID], [T_ISSUE_USERS].[INNER_USER_ID], [T_ISSUE_USERS].[ISSUE_USER_NAME], [T_ISSUE_USERS].[ISSUE_USER_TYPE], [T_ISSUE_USERS].[LOGIN_NAME], [T_ISSUE_USERS].[LOGIN_PASSWORD], [T_ISSUE_USERS].[USER_STATE], [T_ISSUE_USERS].[USER_EMAIL] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_ISSUE_USERS";
	}
	
	
	public String getTableName() {
		return "T_ISSUE_USERS";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "ISSUE_USER_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.issueUserId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (IssueUsers.class.isInstance(obj)) {
			IssueUsers o = ((IssueUsers)(obj));
			this.issueUserId = o.issueUserId;
			this.innerUserId = o.innerUserId;
			this.issueUserName = o.issueUserName;
			this.issueUserType = o.issueUserType;
			this.loginName = o.loginName;
			this.loginPassword = o.loginPassword;
			this.userState = o.userState;
			this.userEmail = o.userEmail;
		}
	}
	
	/**
	 * 插入IssueUsers对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueUsers">需要插入的问题跟踪系统用户表</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, IssueUsers issueUsers) throws SQLException, DbException {
		String sql = "insert into [T_ISSUE_USERS](";
		if ((issueUsers.getIssueUserId() > 0)) {
			sql = (sql + "[ISSUE_USER_ID], ");
		}
		sql = (sql + "[INNER_USER_ID]");
		sql = (sql + ", [ISSUE_USER_NAME]");
		sql = (sql + ", [ISSUE_USER_TYPE]");
		sql = (sql + ", [LOGIN_NAME]");
		sql = (sql + ", [LOGIN_PASSWORD]");
		sql = (sql + ", [USER_STATE]");
		sql = (sql + ", [USER_EMAIL]");
		sql = (sql + ")values(");
		if ((issueUsers.getIssueUserId() > 0)) {
			sql = (sql + issueUsers.getIssueUserId());
			sql = (sql + ", ");
		}
		if ((issueUsers.innerUserId == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + issueUsers.getInnerUserId());
		}
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(issueUsers.getIssueUserName().toString()));
		sql = (sql + ", ");
		sql = (sql + issueUsers.getIssueUserType());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(issueUsers.getLoginName().toString()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(issueUsers.getLoginPassword().toString()));
		sql = (sql + ", ");
		sql = (sql + issueUsers.getUserState());
		sql = (sql + ", ");
		if ((issueUsers.userEmail == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(issueUsers.getUserEmail().toString()));
		}
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((issueUsers.getIssueUserId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_ISSUE_USERS] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_ISSUE_USERS off");
			}
			dataVisit.execSql(sql);
			if ((issueUsers.getIssueUserId() == 0)) {
				issueUsers.issueUserId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入IssueUsers对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		IssueUsers.insert(dataVisit, this);
	}
	
	/**
	 * 更新IssueUsers对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueUsers">需要更新的问题跟踪系统用户表</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssueUsers issueUsers, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_ISSUE_USERS] set ";
		if ((issueUsers.innerUserId == null)) {
			sql = (sql + "[INNER_USER_ID] = default ,");
		}
		else {
			sql = (sql + "[INNER_USER_ID] = ");
			sql = (sql + issueUsers.getInnerUserId());
			sql = (sql + ",");
		}
		sql = (sql + "[ISSUE_USER_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(issueUsers.getIssueUserName().toString()));
		sql = (sql + ",");
		sql = (sql + "[ISSUE_USER_TYPE] = ");
		sql = (sql + issueUsers.getIssueUserType());
		sql = (sql + ",");
		sql = (sql + "[LOGIN_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(issueUsers.getLoginName().toString()));
		sql = (sql + ",");
		sql = (sql + "[LOGIN_PASSWORD] = ");
		sql = (sql + SqlServerUtils.safeSql(issueUsers.getLoginPassword().toString()));
		sql = (sql + ",");
		sql = (sql + "[USER_STATE] = ");
		sql = (sql + issueUsers.getUserState());
		sql = (sql + ",");
		if ((issueUsers.userEmail == null)) {
			sql = (sql + "[USER_EMAIL] = default ,");
		}
		else {
			sql = (sql + "[USER_EMAIL] = ");
			sql = (sql + SqlServerUtils.safeSql(issueUsers.getUserEmail().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "ISSUE_USER_ID = ");
		sql = (sql + issueUsers.getIssueUserId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新IssueUsers对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueUsers">需要更新的问题跟踪系统用户表</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssueUsers issueUsers) throws SQLException, DbException {
		return IssueUsers.update(dataVisit, issueUsers, "");
	}
	
	/**
	 * 更新IssueUsers对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return IssueUsers.update(dataVisit, this);
	}
	
	/**
	 * 更新IssueUsers对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return IssueUsers.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.issueUserName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<IssueUsers> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<IssueUsers> list = new ArrayList<IssueUsers>();
		try {
			for (; reader.next(); ) {
				IssueUsers obj = new IssueUsers();
				IssueUsers.readValue(reader, obj);
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
	public static List<IssueUsers> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<IssueUsers> list = new ArrayList<IssueUsers>();
		try {
			for (; reader.next(); ) {
				IssueUsers obj = new IssueUsers();
				IssueUsers.readValue(reader, obj);
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
	public static List<IssueUsers> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssueUsers.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<IssueUsers> list = new ArrayList<IssueUsers>();
		try {
			for (; reader.next(); ) {
				IssueUsers obj = new IssueUsers();
				IssueUsers.readValue(reader, obj);
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
	public static List<IssueUsers> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssueUsers.getFullSelectSql() + appendConditionSql));
		List<IssueUsers> list = new ArrayList<IssueUsers>();
		try {
			for (; reader.next(); ) {
				IssueUsers obj = new IssueUsers();
				IssueUsers.readValue(reader, obj);
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
	public static <T extends IssueUsers> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssueUsers.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssueUsers.readValue(reader, obj);
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
public static <T extends IssueUsers> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssueUsers.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssueUsers.readValue(reader, obj);
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
	String sql = "select * from T_ISSUE_USERS ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据用户标识查询IssueUsers
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueUserId">用户标识</param>
 */
public static IssueUsers selectByIssueUserId(IDataVisit2 dataVisit, int AIssueUserId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "ISSUE_USER_ID = ");
	sql = (sql + AIssueUserId);
	List<IssueUsers> list = IssueUsers.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 根据登录名称查询IssueUsers
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ALoginName">登录名称</param>
 */
public static IssueUsers selectByLoginName(IDataVisit2 dataVisit, String ALoginName) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "LOGIN_NAME = ");
	sql = (sql + SqlServerUtils.safeSql(ALoginName.toString()));
	List<IssueUsers> list = IssueUsers.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个IssueUsers对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueUserId">用户标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByIssueUserId(IDataVisit2 dataVisit, int AIssueUserId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ISSUE_USERS] where ");
	sql = (sql + "ISSUE_USER_ID = ");
	sql = (sql + AIssueUserId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个IssueUsers对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueUserId">用户标识</param>
 */
public static void deleteByIssueUserId(IDataVisit2 dataVisit, int AIssueUserId) throws SQLException, DbException {
	IssueUsers.deleteByIssueUserId(dataVisit, AIssueUserId, "");
}

/**
 * 从数据库中删除一个IssueUsers对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ALoginName">登录名称</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByLoginName(IDataVisit2 dataVisit, String ALoginName, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ISSUE_USERS] where ");
	sql = (sql + "LOGIN_NAME = ");
	sql = (sql + SqlServerUtils.safeSql(ALoginName.toString()));
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个IssueUsers对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ALoginName">登录名称</param>
 */
public static void deleteByLoginName(IDataVisit2 dataVisit, String ALoginName) throws SQLException, DbException {
	IssueUsers.deleteByLoginName(dataVisit, ALoginName, "");
}

/**
 * 根据外键关联到内部的ID删除一批IssueUsers对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="InnerUserId">关联到内部的ID</param>
 */
public static void deleteListByInnerUserId(IDataVisit2 dataVisit, Integer AInnerUserId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE_USERS] where ");
	sql = (sql + "INNER_USER_ID = ");
	sql = (sql + AInnerUserId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="InnerUserId">关联到内部的ID</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueUsers> selectObjectsByInnerUserId(IDataVisit2 dataVisit, Integer AInnerUserId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where INNER_USER_ID = ";
	sql = (sql + AInnerUserId);
	sql = (sql + appendConditionSql);
	return IssueUsers.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="InnerUserId">关联到内部的ID</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueUsers> selectObjectsByInnerUserId(IDataVisit2 dataVisit, Integer AInnerUserId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where INNER_USER_ID = ";
	sql = (sql + AInnerUserId);
	return IssueUsers.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="InnerUserId">关联到内部的ID</param>
 */
public static List<IssueUsers> selectObjectsByInnerUserId(IDataVisit2 dataVisit, Integer AInnerUserId) throws SQLException, DbException {
	String sql = " where INNER_USER_ID = ";
	sql = (sql + AInnerUserId);
	return IssueUsers.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象issueUsers中
 * <param name="reader">数据源</param>
 * <param name="issueUsers">目标对象</param>
 */
public static void readValue(ResultSet reader, IssueUsers issueUsers) throws SQLException, DbException {
	issueUsers.issueUserId = reader.getInt(1);
	issueUsers.innerUserId = reader.getInt(2);
	if (reader.wasNull()) {
		issueUsers.innerUserId = null;
	}
	issueUsers.issueUserName = reader.getString(3);
	issueUsers.issueUserType = reader.getByte(4);
	issueUsers.loginName = reader.getString(5);
	issueUsers.loginPassword = reader.getString(6);
	issueUsers.userState = reader.getByte(7);
	issueUsers.userEmail = reader.getString(8);
	if (reader.wasNull()) {
		issueUsers.userEmail = null;
	}
}
}
