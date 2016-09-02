package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_USER: 用户表
 */
public class User extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * USER_ID: 用户代号
	 */
	int userId;
	
	/**
	 * LAST_LOGIN_ADDRESS: 上次登陆地址
	 */
	String lastLoginAddress;
	
	/**
	 * LAST_LOGIN_TIME: 上次登陆时间
	 */
	java.util.Date lastLoginTime;
	
	/**
	 * LOGIN_COUNT: 登陆次数
	 */
	int loginCount;
	
	/**
	 * LOGIN_NAME: 登陆名
	 */
	String loginName = "";
	
	/**
	 * LOGIN_PASS: 登陆密码
	 */
	String loginPass = "";
	
	/**
	 * REAL_NAME: 真实姓名
	 */
	String realName = "";
	
	/**
	 * USER_EMAIL: 用户电子邮箱
	 */
	String userEmail;
	
	/**
	 * USER_MEMO: 用户信息
	 */
	String userMemo;
	
	/**
	 * USER_MOBILE: 用户手机号码
	 */
	String userMobile;
	
	/**
	 * USER_MSN: 用户MSN
	 */
	String userMsn;
	
	/**
	 * USER_PRIVILEGES: 用户权利
	 */
	String userPrivileges;
	
	/**
	 * USER_QQ: 用户QQ
	 */
	String userQq;
	
	/**
	 * USER_ROLES: 用户角色
	 */
	String userRoles;
	
	/**
	 * USER_STATE: 用户状态
	 */
	int userState;
	
	/**
	 * USER_TELEPHONE: 用户电话号码
	 */
	String userTelephone;
	
	/**
	 * USER_ID: 用户代号
	 */
	public int getUserId() {
		return this.userId;
	}
	
	/**
	 * USER_ID: 用户代号
	 */
	public void setUserId(int value)
	 {
		this.userId = value;
	}
	
	/**
	 * LAST_LOGIN_ADDRESS: 上次登陆地址
	 */
	public String getLastLoginAddress() {
		return this.lastLoginAddress;
	}
	
	/**
	 * LAST_LOGIN_ADDRESS: 上次登陆地址
	 */
	public void setLastLoginAddress(String value)
	 {
		this.lastLoginAddress = value;
	}
	
	/**
	 * LAST_LOGIN_TIME: 上次登陆时间
	 */
	public java.util.Date getLastLoginTime() {
		return this.lastLoginTime;
	}
	
	/**
	 * LAST_LOGIN_TIME: 上次登陆时间
	 */
	public void setLastLoginTime(java.util.Date value)
	 {
		this.lastLoginTime = value;
	}
	
	/**
	 * LOGIN_COUNT: 登陆次数
	 */
	public int getLoginCount() {
		return this.loginCount;
	}
	
	/**
	 * LOGIN_COUNT: 登陆次数
	 */
	public void setLoginCount(int value)
	 {
		this.loginCount = value;
	}
	
	/**
	 * LOGIN_NAME: 登陆名
	 */
	public String getLoginName() {
		return this.loginName;
	}
	
	/**
	 * LOGIN_NAME: 登陆名
	 */
	public void setLoginName(String value)
	 {
		this.loginName = value;
	}
	
	/**
	 * LOGIN_PASS: 登陆密码
	 */
	public String getLoginPass() {
		return this.loginPass;
	}
	
	/**
	 * LOGIN_PASS: 登陆密码
	 */
	public void setLoginPass(String value)
	 {
		this.loginPass = value;
	}
	
	/**
	 * REAL_NAME: 真实姓名
	 */
	public String getRealName() {
		return this.realName;
	}
	
	/**
	 * REAL_NAME: 真实姓名
	 */
	public void setRealName(String value)
	 {
		this.realName = value;
	}
	
	/**
	 * USER_EMAIL: 用户电子邮箱
	 */
	public String getUserEmail() {
		return this.userEmail;
	}
	
	/**
	 * USER_EMAIL: 用户电子邮箱
	 */
	public void setUserEmail(String value)
	 {
		this.userEmail = value;
	}
	
	/**
	 * USER_MEMO: 用户信息
	 */
	public String getUserMemo() {
		return this.userMemo;
	}
	
	/**
	 * USER_MEMO: 用户信息
	 */
	public void setUserMemo(String value)
	 {
		this.userMemo = value;
	}
	
	/**
	 * USER_MOBILE: 用户手机号码
	 */
	public String getUserMobile() {
		return this.userMobile;
	}
	
	/**
	 * USER_MOBILE: 用户手机号码
	 */
	public void setUserMobile(String value)
	 {
		this.userMobile = value;
	}
	
	/**
	 * USER_MSN: 用户MSN
	 */
	public String getUserMsn() {
		return this.userMsn;
	}
	
	/**
	 * USER_MSN: 用户MSN
	 */
	public void setUserMsn(String value)
	 {
		this.userMsn = value;
	}
	
	/**
	 * USER_PRIVILEGES: 用户权利
	 */
	public String getUserPrivileges() {
		return this.userPrivileges;
	}
	
	/**
	 * USER_PRIVILEGES: 用户权利
	 */
	public void setUserPrivileges(String value)
	 {
		this.userPrivileges = value;
	}
	
	/**
	 * USER_QQ: 用户QQ
	 */
	public String getUserQq() {
		return this.userQq;
	}
	
	/**
	 * USER_QQ: 用户QQ
	 */
	public void setUserQq(String value)
	 {
		this.userQq = value;
	}
	
	/**
	 * USER_ROLES: 用户角色
	 */
	public String getUserRoles() {
		return this.userRoles;
	}
	
	/**
	 * USER_ROLES: 用户角色
	 */
	public void setUserRoles(String value)
	 {
		this.userRoles = value;
	}
	
	/**
	 * USER_STATE: 用户状态
	 */
	public int getUserState() {
		return this.userState;
	}
	
	/**
	 * USER_STATE: 用户状态
	 */
	public void setUserState(int value)
	 {
		this.userState = value;
	}
	
	/**
	 * USER_TELEPHONE: 用户电话号码
	 */
	public String getUserTelephone() {
		return this.userTelephone;
	}
	
	/**
	 * USER_TELEPHONE: 用户电话号码
	 */
	public void setUserTelephone(String value)
	 {
		this.userTelephone = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_USER].[USER_ID], [T_USER].[LAST_LOGIN_ADDRESS], [T_USER].[LAST_LOGIN_TIME], [T_USER].[LOGIN_COUNT], [T_USER].[LOGIN_NAME], [T_USER].[LOGIN_PASS], [T_USER].[REAL_NAME], [T_USER].[USER_EMAIL], [T_USER].[USER_MEMO], [T_USER].[USER_MOBILE], [T_USER].[USER_MSN], [T_USER].[USER_PRIVILEGES], [T_USER].[USER_QQ], [T_USER].[USER_ROLES], [T_USER].[USER_STATE], [T_USER].[USER_TELEPHONE]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_USER].[USER_ID], [T_USER].[LAST_LOGIN_ADDRESS], [T_USER].[LAST_LOGIN_TIME], [T_USER].[LOGIN_COUNT], [T_USER].[LOGIN_NAME], [T_USER].[LOGIN_PASS], [T_USER].[REAL_NAME], [T_USER].[USER_EMAIL], [T_USER].[USER_MEMO], [T_USER].[USER_MOBILE], [T_USER].[USER_MSN], [T_USER].[USER_PRIVILEGES], [T_USER].[USER_QQ], [T_USER].[USER_ROLES], [T_USER].[USER_STATE], [T_USER].[USER_TELEPHONE]   from [T_USER] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_USER].[USER_ID], [T_USER].[LAST_LOGIN_ADDRESS], [T_USER].[LAST_LOGIN_TIME], [T_USER].[LOGIN_COUNT], [T_USER].[LOGIN_NAME], [T_USER].[LOGIN_PASS], [T_USER].[REAL_NAME], [T_USER].[USER_EMAIL], [T_USER].[USER_MEMO], [T_USER].[USER_MOBILE], [T_USER].[USER_MSN], [T_USER].[USER_PRIVILEGES], [T_USER].[USER_QQ], [T_USER].[USER_ROLES], [T_USER].[USER_STATE], [T_USER].[USER_TELEPHONE] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_USER";
	}
	
	
	public String getTableName() {
		return "T_USER";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "USER_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.userId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (User.class.isInstance(obj)) {
			User o = ((User)(obj));
			this.userId = o.userId;
			this.lastLoginAddress = o.lastLoginAddress;
			this.lastLoginTime = o.lastLoginTime;
			this.loginCount = o.loginCount;
			this.loginName = o.loginName;
			this.loginPass = o.loginPass;
			this.realName = o.realName;
			this.userEmail = o.userEmail;
			this.userMemo = o.userMemo;
			this.userMobile = o.userMobile;
			this.userMsn = o.userMsn;
			this.userPrivileges = o.userPrivileges;
			this.userQq = o.userQq;
			this.userRoles = o.userRoles;
			this.userState = o.userState;
			this.userTelephone = o.userTelephone;
		}
	}
	
	/**
	 * 插入User对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="user">需要插入的用户表</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, User user) throws SQLException, DbException {
		String sql = "insert into [T_USER](";
		if ((user.getUserId() > 0)) {
			sql = (sql + "[USER_ID], ");
		}
		sql = (sql + "[LAST_LOGIN_ADDRESS]");
		sql = (sql + ", [LAST_LOGIN_TIME]");
		sql = (sql + ", [LOGIN_COUNT]");
		sql = (sql + ", [LOGIN_NAME]");
		sql = (sql + ", [LOGIN_PASS]");
		sql = (sql + ", [REAL_NAME]");
		sql = (sql + ", [USER_EMAIL]");
		sql = (sql + ", [USER_MEMO]");
		sql = (sql + ", [USER_MOBILE]");
		sql = (sql + ", [USER_MSN]");
		sql = (sql + ", [USER_PRIVILEGES]");
		sql = (sql + ", [USER_QQ]");
		sql = (sql + ", [USER_ROLES]");
		sql = (sql + ", [USER_STATE]");
		sql = (sql + ", [USER_TELEPHONE]");
		sql = (sql + ")values(");
		if ((user.getUserId() > 0)) {
			sql = (sql + user.getUserId());
			sql = (sql + ", ");
		}
		if ((user.lastLoginAddress == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(user.getLastLoginAddress().toString()));
		}
		sql = (sql + ", ");
		if ((user.lastLoginTime == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(user.getLastLoginTime()));
		}
		sql = (sql + ", ");
		sql = (sql + user.getLoginCount());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(user.getLoginName().toString()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(user.getLoginPass().toString()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(user.getRealName().toString()));
		sql = (sql + ", ");
		if ((user.userEmail == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(user.getUserEmail().toString()));
		}
		sql = (sql + ", ");
		if ((user.userMemo == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(user.getUserMemo().toString()));
		}
		sql = (sql + ", ");
		if ((user.userMobile == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(user.getUserMobile().toString()));
		}
		sql = (sql + ", ");
		if ((user.userMsn == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(user.getUserMsn().toString()));
		}
		sql = (sql + ", ");
		if ((user.userPrivileges == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(user.getUserPrivileges().toString()));
		}
		sql = (sql + ", ");
		if ((user.userQq == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(user.getUserQq().toString()));
		}
		sql = (sql + ", ");
		if ((user.userRoles == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(user.getUserRoles().toString()));
		}
		sql = (sql + ", ");
		sql = (sql + user.getUserState());
		sql = (sql + ", ");
		if ((user.userTelephone == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(user.getUserTelephone().toString()));
		}
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((user.getUserId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_USER] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_USER off");
			}
			dataVisit.execSql(sql);
			if ((user.getUserId() == 0)) {
				user.userId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入User对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		User.insert(dataVisit, this);
	}
	
	/**
	 * 更新User对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="user">需要更新的用户表</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, User user, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_USER] set ";
		if ((user.lastLoginAddress == null)) {
			sql = (sql + "[LAST_LOGIN_ADDRESS] = default ,");
		}
		else {
			sql = (sql + "[LAST_LOGIN_ADDRESS] = ");
			sql = (sql + SqlServerUtils.safeSql(user.getLastLoginAddress().toString()));
			sql = (sql + ",");
		}
		if ((user.lastLoginTime == null)) {
			sql = (sql + "[LAST_LOGIN_TIME] = default ,");
		}
		else {
			sql = (sql + "[LAST_LOGIN_TIME] = ");
			sql = (sql + SqlServerUtils.getDateSql(user.getLastLoginTime()));
			sql = (sql + ",");
		}
		sql = (sql + "[LOGIN_COUNT] = ");
		sql = (sql + user.getLoginCount());
		sql = (sql + ",");
		sql = (sql + "[LOGIN_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(user.getLoginName().toString()));
		sql = (sql + ",");
		sql = (sql + "[LOGIN_PASS] = ");
		sql = (sql + SqlServerUtils.safeSql(user.getLoginPass().toString()));
		sql = (sql + ",");
		sql = (sql + "[REAL_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(user.getRealName().toString()));
		sql = (sql + ",");
		if ((user.userEmail == null)) {
			sql = (sql + "[USER_EMAIL] = default ,");
		}
		else {
			sql = (sql + "[USER_EMAIL] = ");
			sql = (sql + SqlServerUtils.safeSql(user.getUserEmail().toString()));
			sql = (sql + ",");
		}
		if ((user.userMemo == null)) {
			sql = (sql + "[USER_MEMO] = default ,");
		}
		else {
			sql = (sql + "[USER_MEMO] = ");
			sql = (sql + SqlServerUtils.safeSql(user.getUserMemo().toString()));
			sql = (sql + ",");
		}
		if ((user.userMobile == null)) {
			sql = (sql + "[USER_MOBILE] = default ,");
		}
		else {
			sql = (sql + "[USER_MOBILE] = ");
			sql = (sql + SqlServerUtils.safeSql(user.getUserMobile().toString()));
			sql = (sql + ",");
		}
		if ((user.userMsn == null)) {
			sql = (sql + "[USER_MSN] = default ,");
		}
		else {
			sql = (sql + "[USER_MSN] = ");
			sql = (sql + SqlServerUtils.safeSql(user.getUserMsn().toString()));
			sql = (sql + ",");
		}
		if ((user.userPrivileges == null)) {
			sql = (sql + "[USER_PRIVILEGES] = default ,");
		}
		else {
			sql = (sql + "[USER_PRIVILEGES] = ");
			sql = (sql + SqlServerUtils.safeSql(user.getUserPrivileges().toString()));
			sql = (sql + ",");
		}
		if ((user.userQq == null)) {
			sql = (sql + "[USER_QQ] = default ,");
		}
		else {
			sql = (sql + "[USER_QQ] = ");
			sql = (sql + SqlServerUtils.safeSql(user.getUserQq().toString()));
			sql = (sql + ",");
		}
		if ((user.userRoles == null)) {
			sql = (sql + "[USER_ROLES] = default ,");
		}
		else {
			sql = (sql + "[USER_ROLES] = ");
			sql = (sql + SqlServerUtils.safeSql(user.getUserRoles().toString()));
			sql = (sql + ",");
		}
		sql = (sql + "[USER_STATE] = ");
		sql = (sql + user.getUserState());
		sql = (sql + ",");
		if ((user.userTelephone == null)) {
			sql = (sql + "[USER_TELEPHONE] = default ,");
		}
		else {
			sql = (sql + "[USER_TELEPHONE] = ");
			sql = (sql + SqlServerUtils.safeSql(user.getUserTelephone().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "USER_ID = ");
		sql = (sql + user.getUserId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新User对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="user">需要更新的用户表</param>
	 */
	protected static int update(IDataVisit2 dataVisit, User user) throws SQLException, DbException {
		return User.update(dataVisit, user, "");
	}
	
	/**
	 * 更新User对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return User.update(dataVisit, this);
	}
	
	/**
	 * 更新User对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return User.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.loginName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<User> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<User> list = new ArrayList<User>();
		try {
			for (; reader.next(); ) {
				User obj = new User();
				User.readValue(reader, obj);
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
	public static List<User> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<User> list = new ArrayList<User>();
		try {
			for (; reader.next(); ) {
				User obj = new User();
				User.readValue(reader, obj);
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
	public static List<User> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((User.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<User> list = new ArrayList<User>();
		try {
			for (; reader.next(); ) {
				User obj = new User();
				User.readValue(reader, obj);
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
	public static List<User> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((User.getFullSelectSql() + appendConditionSql));
		List<User> list = new ArrayList<User>();
		try {
			for (; reader.next(); ) {
				User obj = new User();
				User.readValue(reader, obj);
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
	public static <T extends User> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((User.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			User.readValue(reader, obj);
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
public static <T extends User> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((User.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			User.readValue(reader, obj);
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
	String sql = "select * from T_USER ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据用户代号查询User
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AUserId">用户代号</param>
 */
public static User selectByUserId(IDataVisit2 dataVisit, int AUserId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "USER_ID = ");
	sql = (sql + AUserId);
	List<User> list = User.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 根据登陆名查询User
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ALoginName">登陆名</param>
 */
public static User selectByLoginName(IDataVisit2 dataVisit, String ALoginName) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "LOGIN_NAME = ");
	sql = (sql + SqlServerUtils.safeSql(ALoginName.toString()));
	List<User> list = User.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个User对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AUserId">用户代号</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByUserId(IDataVisit2 dataVisit, int AUserId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_USER] where ");
	sql = (sql + "USER_ID = ");
	sql = (sql + AUserId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个User对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AUserId">用户代号</param>
 */
public static void deleteByUserId(IDataVisit2 dataVisit, int AUserId) throws SQLException, DbException {
	User.deleteByUserId(dataVisit, AUserId, "");
}

/**
 * 从数据库中删除一个User对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ALoginName">登陆名</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByLoginName(IDataVisit2 dataVisit, String ALoginName, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_USER] where ");
	sql = (sql + "LOGIN_NAME = ");
	sql = (sql + SqlServerUtils.safeSql(ALoginName.toString()));
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个User对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ALoginName">登陆名</param>
 */
public static void deleteByLoginName(IDataVisit2 dataVisit, String ALoginName) throws SQLException, DbException {
	User.deleteByLoginName(dataVisit, ALoginName, "");
}

/**
 * 从reader读到数据到对象user中
 * <param name="reader">数据源</param>
 * <param name="user">目标对象</param>
 */
public static void readValue(ResultSet reader, User user) throws SQLException, DbException {
	user.userId = reader.getInt(1);
	user.lastLoginAddress = reader.getString(2);
	if (reader.wasNull()) {
		user.lastLoginAddress = null;
	}
	user.lastLoginTime = SqlUtils.getDate(reader, 3);
	if (reader.wasNull()) {
		user.lastLoginTime = null;
	}
	user.loginCount = reader.getInt(4);
	user.loginName = reader.getString(5);
	user.loginPass = reader.getString(6);
	user.realName = reader.getString(7);
	user.userEmail = reader.getString(8);
	if (reader.wasNull()) {
		user.userEmail = null;
	}
	user.userMemo = reader.getString(9);
	if (reader.wasNull()) {
		user.userMemo = null;
	}
	user.userMobile = reader.getString(10);
	if (reader.wasNull()) {
		user.userMobile = null;
	}
	user.userMsn = reader.getString(11);
	if (reader.wasNull()) {
		user.userMsn = null;
	}
	user.userPrivileges = reader.getString(12);
	if (reader.wasNull()) {
		user.userPrivileges = null;
	}
	user.userQq = reader.getString(13);
	if (reader.wasNull()) {
		user.userQq = null;
	}
	user.userRoles = reader.getString(14);
	if (reader.wasNull()) {
		user.userRoles = null;
	}
	user.userState = reader.getInt(15);
	user.userTelephone = reader.getString(16);
	if (reader.wasNull()) {
		user.userTelephone = null;
	}
}
}
