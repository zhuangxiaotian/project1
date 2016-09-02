package cn.topdeep.projgroup.entity.bugtracker;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import java.sql.*;
/**
 * USERS: 
 */
public class Users extends common.dbvisit.BaseTable {
	
	/**
	 * US_ID: 
	 */
	private int usId;
	
	/**
	 * US_USERNAME: 
	 */
	private String usUsername = "";
	
	/**
	 * US_PASSWORD: 
	 */
	private String usPassword = "";
	
	/**
	 * US_FIRSTNAME: 
	 */
	private String usFirstname;
	
	/**
	 * US_LASTNAME: 
	 */
	private String usLastname;
	
	/**
	 * US_EMAIL: 
	 */
	private String usEmail;
	
	/**
	 * US_ADMIN: 
	 */
	private int usAdmin;
	
	/**
	 * US_DEFAULT_QUERY: 
	 */
	private int usDefaultQuery;
	
	/**
	 * US_ENABLE_NOTIFICATIONS: 
	 */
	private int usEnableNotifications;
	
	/**
	 * US_AUTO_SUBSCRIBE: 
	 */
	private int usAutoSubscribe;
	
	/**
	 * US_AUTO_SUBSCRIBE_OWN_BUGS: 
	 */
	private Integer usAutoSubscribeOwnBugs;
	
	/**
	 * US_AUTO_SUBSCRIBE_REPORTED_BUGS: 
	 */
	private Integer usAutoSubscribeReportedBugs;
	
	/**
	 * US_SEND_NOTIFICATIONS_TO_SELF: 
	 */
	private Integer usSendNotificationsToSelf;
	
	/**
	 * US_ACTIVE: 
	 */
	private int usActive;
	
	/**
	 * US_BUGS_PER_PAGE: 
	 */
	private Integer usBugsPerPage;
	
	/**
	 * US_FORCED_PROJECT: 
	 */
	private Integer usForcedProject;
	
	/**
	 * US_REPORTED_NOTIFICATIONS: 
	 */
	private int usReportedNotifications;
	
	/**
	 * US_ASSIGNED_NOTIFICATIONS: 
	 */
	private int usAssignedNotifications;
	
	/**
	 * US_SUBSCRIBED_NOTIFICATIONS: 
	 */
	private int usSubscribedNotifications;
	
	/**
	 * US_SIGNATURE: 
	 */
	private String usSignature;
	
	/**
	 * US_ID: 
	 */
	public int getUsId() {
		return this.usId;
	}
	
	/**
	 * US_ID: 
	 */
	public void setUsId(int value)
	 {
		this.usId = value;
	}
	
	/**
	 * US_USERNAME: 
	 */
	public String getUsUsername() {
		return this.usUsername;
	}
	
	/**
	 * US_USERNAME: 
	 */
	public void setUsUsername(String value)
	 {
		this.usUsername = value;
	}
	
	/**
	 * US_PASSWORD: 
	 */
	public String getUsPassword() {
		return this.usPassword;
	}
	
	/**
	 * US_PASSWORD: 
	 */
	public void setUsPassword(String value)
	 {
		this.usPassword = value;
	}
	
	/**
	 * US_FIRSTNAME: 
	 */
	public String getUsFirstname() {
		return this.usFirstname;
	}
	
	/**
	 * US_FIRSTNAME: 
	 */
	public void setUsFirstname(String value)
	 {
		this.usFirstname = value;
	}
	
	/**
	 * US_LASTNAME: 
	 */
	public String getUsLastname() {
		return this.usLastname;
	}
	
	/**
	 * US_LASTNAME: 
	 */
	public void setUsLastname(String value)
	 {
		this.usLastname = value;
	}
	
	/**
	 * US_EMAIL: 
	 */
	public String getUsEmail() {
		return this.usEmail;
	}
	
	/**
	 * US_EMAIL: 
	 */
	public void setUsEmail(String value)
	 {
		this.usEmail = value;
	}
	
	/**
	 * US_ADMIN: 
	 */
	public int getUsAdmin() {
		return this.usAdmin;
	}
	
	/**
	 * US_ADMIN: 
	 */
	public void setUsAdmin(int value)
	 {
		this.usAdmin = value;
	}
	
	/**
	 * US_DEFAULT_QUERY: 
	 */
	public int getUsDefaultQuery() {
		return this.usDefaultQuery;
	}
	
	/**
	 * US_DEFAULT_QUERY: 
	 */
	public void setUsDefaultQuery(int value)
	 {
		this.usDefaultQuery = value;
	}
	
	/**
	 * US_ENABLE_NOTIFICATIONS: 
	 */
	public int getUsEnableNotifications() {
		return this.usEnableNotifications;
	}
	
	/**
	 * US_ENABLE_NOTIFICATIONS: 
	 */
	public void setUsEnableNotifications(int value)
	 {
		this.usEnableNotifications = value;
	}
	
	/**
	 * US_AUTO_SUBSCRIBE: 
	 */
	public int getUsAutoSubscribe() {
		return this.usAutoSubscribe;
	}
	
	/**
	 * US_AUTO_SUBSCRIBE: 
	 */
	public void setUsAutoSubscribe(int value)
	 {
		this.usAutoSubscribe = value;
	}
	
	/**
	 * US_AUTO_SUBSCRIBE_OWN_BUGS: 
	 */
	public Integer getUsAutoSubscribeOwnBugs() {
		return this.usAutoSubscribeOwnBugs;
	}
	
	/**
	 * US_AUTO_SUBSCRIBE_OWN_BUGS: 
	 */
	public void setUsAutoSubscribeOwnBugs(Integer value)
	 {
		this.usAutoSubscribeOwnBugs = value;
	}
	
	/**
	 * US_AUTO_SUBSCRIBE_REPORTED_BUGS: 
	 */
	public Integer getUsAutoSubscribeReportedBugs() {
		return this.usAutoSubscribeReportedBugs;
	}
	
	/**
	 * US_AUTO_SUBSCRIBE_REPORTED_BUGS: 
	 */
	public void setUsAutoSubscribeReportedBugs(Integer value)
	 {
		this.usAutoSubscribeReportedBugs = value;
	}
	
	/**
	 * US_SEND_NOTIFICATIONS_TO_SELF: 
	 */
	public Integer getUsSendNotificationsToSelf() {
		return this.usSendNotificationsToSelf;
	}
	
	/**
	 * US_SEND_NOTIFICATIONS_TO_SELF: 
	 */
	public void setUsSendNotificationsToSelf(Integer value)
	 {
		this.usSendNotificationsToSelf = value;
	}
	
	/**
	 * US_ACTIVE: 
	 */
	public int getUsActive() {
		return this.usActive;
	}
	
	/**
	 * US_ACTIVE: 
	 */
	public void setUsActive(int value)
	 {
		this.usActive = value;
	}
	
	/**
	 * US_BUGS_PER_PAGE: 
	 */
	public Integer getUsBugsPerPage() {
		return this.usBugsPerPage;
	}
	
	/**
	 * US_BUGS_PER_PAGE: 
	 */
	public void setUsBugsPerPage(Integer value)
	 {
		this.usBugsPerPage = value;
	}
	
	/**
	 * US_FORCED_PROJECT: 
	 */
	public Integer getUsForcedProject() {
		return this.usForcedProject;
	}
	
	/**
	 * US_FORCED_PROJECT: 
	 */
	public void setUsForcedProject(Integer value)
	 {
		this.usForcedProject = value;
	}
	
	/**
	 * US_REPORTED_NOTIFICATIONS: 
	 */
	public int getUsReportedNotifications() {
		return this.usReportedNotifications;
	}
	
	/**
	 * US_REPORTED_NOTIFICATIONS: 
	 */
	public void setUsReportedNotifications(int value)
	 {
		this.usReportedNotifications = value;
	}
	
	/**
	 * US_ASSIGNED_NOTIFICATIONS: 
	 */
	public int getUsAssignedNotifications() {
		return this.usAssignedNotifications;
	}
	
	/**
	 * US_ASSIGNED_NOTIFICATIONS: 
	 */
	public void setUsAssignedNotifications(int value)
	 {
		this.usAssignedNotifications = value;
	}
	
	/**
	 * US_SUBSCRIBED_NOTIFICATIONS: 
	 */
	public int getUsSubscribedNotifications() {
		return this.usSubscribedNotifications;
	}
	
	/**
	 * US_SUBSCRIBED_NOTIFICATIONS: 
	 */
	public void setUsSubscribedNotifications(int value)
	 {
		this.usSubscribedNotifications = value;
	}
	
	/**
	 * US_SIGNATURE: 
	 */
	public String getUsSignature() {
		return this.usSignature;
	}
	
	/**
	 * US_SIGNATURE: 
	 */
	public void setUsSignature(String value)
	 {
		this.usSignature = value;
	}
	
	public static String getSelectSql() {
		return "select [USERS].[US_ID],[USERS].[US_USERNAME],[USERS].[US_PASSWORD],[USERS].[US_FIRSTNAME],[USERS].[US_LASTNAME],[USERS].[US_EMAIL],[USERS].[US_ADMIN],[USERS].[US_DEFAULT_QUERY],[USERS].[US_ENABLE_NOTIFICATIONS],[USERS].[US_AUTO_SUBSCRIBE],[USERS].[US_AUTO_SUBSCRIBE_OWN_BUGS],[USERS].[US_AUTO_SUBSCRIBE_REPORTED_BUGS],[USERS].[US_SEND_NOTIFICATIONS_TO_SELF],[USERS].[US_ACTIVE],[USERS].[US_BUGS_PER_PAGE],[USERS].[US_FORCED_PROJECT],[USERS].[US_REPORTED_NOTIFICATIONS],[USERS].[US_ASSIGNED_NOTIFICATIONS],[USERS].[US_SUBSCRIBED_NOTIFICATIONS],[USERS].[US_SIGNATURE] ";
	}
	
	
	/**
	 * 插入一个对象到数据库中
	 * @param ADataVisit 数据访问接口
	 * @param Users 需要插入的新对象
	 */
	public static void insert(IDataVisit2 ADataVisit, Users AUsers) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("insert into [USERS] (");
		sql.append("[USERS].[US_USERNAME],");
		sql.append("[USERS].[US_PASSWORD],");
		if ((AUsers.usFirstname == null)) {
		}
		else {
			sql.append("[USERS].[US_FIRSTNAME],");
		}
		if ((AUsers.usLastname == null)) {
		}
		else {
			sql.append("[USERS].[US_LASTNAME],");
		}
		if ((AUsers.usEmail == null)) {
		}
		else {
			sql.append("[USERS].[US_EMAIL],");
		}
		sql.append("[USERS].[US_ADMIN],");
		sql.append("[USERS].[US_DEFAULT_QUERY],");
		sql.append("[USERS].[US_ENABLE_NOTIFICATIONS],");
		sql.append("[USERS].[US_AUTO_SUBSCRIBE],");
		if ((AUsers.usAutoSubscribeOwnBugs == null)) {
		}
		else {
			sql.append("[USERS].[US_AUTO_SUBSCRIBE_OWN_BUGS],");
		}
		if ((AUsers.usAutoSubscribeReportedBugs == null)) {
		}
		else {
			sql.append("[USERS].[US_AUTO_SUBSCRIBE_REPORTED_BUGS],");
		}
		if ((AUsers.usSendNotificationsToSelf == null)) {
		}
		else {
			sql.append("[USERS].[US_SEND_NOTIFICATIONS_TO_SELF],");
		}
		sql.append("[USERS].[US_ACTIVE],");
		if ((AUsers.usBugsPerPage == null)) {
		}
		else {
			sql.append("[USERS].[US_BUGS_PER_PAGE],");
		}
		if ((AUsers.usForcedProject == null)) {
		}
		else {
			sql.append("[USERS].[US_FORCED_PROJECT],");
		}
		sql.append("[USERS].[US_REPORTED_NOTIFICATIONS],");
		sql.append("[USERS].[US_ASSIGNED_NOTIFICATIONS],");
		sql.append("[USERS].[US_SUBSCRIBED_NOTIFICATIONS],");
		if ((AUsers.usSignature == null)) {
		}
		else {
			sql.append("[USERS].[US_SIGNATURE],");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(") values (");
		sql.append(SqlServerUtils.safeSql(AUsers.usUsername.toString()));
		sql.append(",");
		sql.append(SqlServerUtils.safeSql(AUsers.usPassword.toString()));
		sql.append(",");
		if ((AUsers.usFirstname == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(AUsers.usFirstname.toString()));
			sql.append(",");
		}
		if ((AUsers.usLastname == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(AUsers.usLastname.toString()));
			sql.append(",");
		}
		if ((AUsers.usEmail == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(AUsers.usEmail.toString()));
			sql.append(",");
		}
		sql.append(AUsers.usAdmin);
		sql.append(",");
		sql.append(AUsers.usDefaultQuery);
		sql.append(",");
		sql.append(AUsers.usEnableNotifications);
		sql.append(",");
		sql.append(AUsers.usAutoSubscribe);
		sql.append(",");
		if ((AUsers.usAutoSubscribeOwnBugs == null)) {
		}
		else {
			sql.append(AUsers.usAutoSubscribeOwnBugs);
			sql.append(",");
		}
		if ((AUsers.usAutoSubscribeReportedBugs == null)) {
		}
		else {
			sql.append(AUsers.usAutoSubscribeReportedBugs);
			sql.append(",");
		}
		if ((AUsers.usSendNotificationsToSelf == null)) {
		}
		else {
			sql.append(AUsers.usSendNotificationsToSelf);
			sql.append(",");
		}
		sql.append(AUsers.usActive);
		sql.append(",");
		if ((AUsers.usBugsPerPage == null)) {
		}
		else {
			sql.append(AUsers.usBugsPerPage);
			sql.append(",");
		}
		if ((AUsers.usForcedProject == null)) {
		}
		else {
			sql.append(AUsers.usForcedProject);
			sql.append(",");
		}
		sql.append(AUsers.usReportedNotifications);
		sql.append(",");
		sql.append(AUsers.usAssignedNotifications);
		sql.append(",");
		sql.append(AUsers.usSubscribedNotifications);
		sql.append(",");
		if ((AUsers.usSignature == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(AUsers.usSignature.toString()));
			sql.append(",");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(")");
		ADataVisit.beginTransaction();
		try {
			ADataVisit.execSql(sql.toString());
			AUsers.usId = ((int)(((double)(ADataVisit.getIDentity()))));
			ADataVisit.commitTransaction();
		}
		catch (SQLException e) {
			ADataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param Users 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, Users AUsers) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("USERS set ");
		sql.append("US_USERNAME = ");
		sql.append(SqlServerUtils.safeSql(AUsers.usUsername.toString()));
		sql.append(",");
		sql.append("US_PASSWORD = ");
		sql.append(SqlServerUtils.safeSql(AUsers.usPassword.toString()));
		sql.append(",");
		if ((AUsers.usFirstname == null)) {
			sql.append("US_FIRSTNAME = default ,");
		}
		else {
			sql.append("US_FIRSTNAME = ");
			sql.append(SqlServerUtils.safeSql(AUsers.usFirstname.toString()));
			sql.append(",");
		}
		if ((AUsers.usLastname == null)) {
			sql.append("US_LASTNAME = default ,");
		}
		else {
			sql.append("US_LASTNAME = ");
			sql.append(SqlServerUtils.safeSql(AUsers.usLastname.toString()));
			sql.append(",");
		}
		if ((AUsers.usEmail == null)) {
			sql.append("US_EMAIL = default ,");
		}
		else {
			sql.append("US_EMAIL = ");
			sql.append(SqlServerUtils.safeSql(AUsers.usEmail.toString()));
			sql.append(",");
		}
		sql.append("US_ADMIN = ");
		sql.append(AUsers.usAdmin);
		sql.append(",");
		sql.append("US_DEFAULT_QUERY = ");
		sql.append(AUsers.usDefaultQuery);
		sql.append(",");
		sql.append("US_ENABLE_NOTIFICATIONS = ");
		sql.append(AUsers.usEnableNotifications);
		sql.append(",");
		sql.append("US_AUTO_SUBSCRIBE = ");
		sql.append(AUsers.usAutoSubscribe);
		sql.append(",");
		if ((AUsers.usAutoSubscribeOwnBugs == null)) {
			sql.append("US_AUTO_SUBSCRIBE_OWN_BUGS = default ,");
		}
		else {
			sql.append("US_AUTO_SUBSCRIBE_OWN_BUGS = ");
			sql.append(AUsers.usAutoSubscribeOwnBugs);
			sql.append(",");
		}
		if ((AUsers.usAutoSubscribeReportedBugs == null)) {
			sql.append("US_AUTO_SUBSCRIBE_REPORTED_BUGS = default ,");
		}
		else {
			sql.append("US_AUTO_SUBSCRIBE_REPORTED_BUGS = ");
			sql.append(AUsers.usAutoSubscribeReportedBugs);
			sql.append(",");
		}
		if ((AUsers.usSendNotificationsToSelf == null)) {
			sql.append("US_SEND_NOTIFICATIONS_TO_SELF = default ,");
		}
		else {
			sql.append("US_SEND_NOTIFICATIONS_TO_SELF = ");
			sql.append(AUsers.usSendNotificationsToSelf);
			sql.append(",");
		}
		sql.append("US_ACTIVE = ");
		sql.append(AUsers.usActive);
		sql.append(",");
		if ((AUsers.usBugsPerPage == null)) {
			sql.append("US_BUGS_PER_PAGE = default ,");
		}
		else {
			sql.append("US_BUGS_PER_PAGE = ");
			sql.append(AUsers.usBugsPerPage);
			sql.append(",");
		}
		if ((AUsers.usForcedProject == null)) {
			sql.append("US_FORCED_PROJECT = default ,");
		}
		else {
			sql.append("US_FORCED_PROJECT = ");
			sql.append(AUsers.usForcedProject);
			sql.append(",");
		}
		sql.append("US_REPORTED_NOTIFICATIONS = ");
		sql.append(AUsers.usReportedNotifications);
		sql.append(",");
		sql.append("US_ASSIGNED_NOTIFICATIONS = ");
		sql.append(AUsers.usAssignedNotifications);
		sql.append(",");
		sql.append("US_SUBSCRIBED_NOTIFICATIONS = ");
		sql.append(AUsers.usSubscribedNotifications);
		sql.append(",");
		if ((AUsers.usSignature == null)) {
			sql.append("US_SIGNATURE = default ,");
		}
		else {
			sql.append("US_SIGNATURE = ");
			sql.append(SqlServerUtils.safeSql(AUsers.usSignature.toString()));
			sql.append(",");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("US_ID = ");
		sql.append(AUsers.usId);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param Users 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, Users AUsers, String appendConditionSql) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("USERS set ");
		sql.append("US_USERNAME = ");
		sql.append(SqlServerUtils.safeSql(AUsers.usUsername.toString()));
		sql.append(",");
		sql.append("US_PASSWORD = ");
		sql.append(SqlServerUtils.safeSql(AUsers.usPassword.toString()));
		sql.append(",");
		if ((AUsers.usFirstname == null)) {
			sql.append("US_FIRSTNAME = default ,");
		}
		else {
			sql.append("US_FIRSTNAME = ");
			sql.append(SqlServerUtils.safeSql(AUsers.usFirstname.toString()));
			sql.append(",");
		}
		if ((AUsers.usLastname == null)) {
			sql.append("US_LASTNAME = default ,");
		}
		else {
			sql.append("US_LASTNAME = ");
			sql.append(SqlServerUtils.safeSql(AUsers.usLastname.toString()));
			sql.append(",");
		}
		if ((AUsers.usEmail == null)) {
			sql.append("US_EMAIL = default ,");
		}
		else {
			sql.append("US_EMAIL = ");
			sql.append(SqlServerUtils.safeSql(AUsers.usEmail.toString()));
			sql.append(",");
		}
		sql.append("US_ADMIN = ");
		sql.append(AUsers.usAdmin);
		sql.append(",");
		sql.append("US_DEFAULT_QUERY = ");
		sql.append(AUsers.usDefaultQuery);
		sql.append(",");
		sql.append("US_ENABLE_NOTIFICATIONS = ");
		sql.append(AUsers.usEnableNotifications);
		sql.append(",");
		sql.append("US_AUTO_SUBSCRIBE = ");
		sql.append(AUsers.usAutoSubscribe);
		sql.append(",");
		if ((AUsers.usAutoSubscribeOwnBugs == null)) {
			sql.append("US_AUTO_SUBSCRIBE_OWN_BUGS = default ,");
		}
		else {
			sql.append("US_AUTO_SUBSCRIBE_OWN_BUGS = ");
			sql.append(AUsers.usAutoSubscribeOwnBugs);
			sql.append(",");
		}
		if ((AUsers.usAutoSubscribeReportedBugs == null)) {
			sql.append("US_AUTO_SUBSCRIBE_REPORTED_BUGS = default ,");
		}
		else {
			sql.append("US_AUTO_SUBSCRIBE_REPORTED_BUGS = ");
			sql.append(AUsers.usAutoSubscribeReportedBugs);
			sql.append(",");
		}
		if ((AUsers.usSendNotificationsToSelf == null)) {
			sql.append("US_SEND_NOTIFICATIONS_TO_SELF = default ,");
		}
		else {
			sql.append("US_SEND_NOTIFICATIONS_TO_SELF = ");
			sql.append(AUsers.usSendNotificationsToSelf);
			sql.append(",");
		}
		sql.append("US_ACTIVE = ");
		sql.append(AUsers.usActive);
		sql.append(",");
		if ((AUsers.usBugsPerPage == null)) {
			sql.append("US_BUGS_PER_PAGE = default ,");
		}
		else {
			sql.append("US_BUGS_PER_PAGE = ");
			sql.append(AUsers.usBugsPerPage);
			sql.append(",");
		}
		if ((AUsers.usForcedProject == null)) {
			sql.append("US_FORCED_PROJECT = default ,");
		}
		else {
			sql.append("US_FORCED_PROJECT = ");
			sql.append(AUsers.usForcedProject);
			sql.append(",");
		}
		sql.append("US_REPORTED_NOTIFICATIONS = ");
		sql.append(AUsers.usReportedNotifications);
		sql.append(",");
		sql.append("US_ASSIGNED_NOTIFICATIONS = ");
		sql.append(AUsers.usAssignedNotifications);
		sql.append(",");
		sql.append("US_SUBSCRIBED_NOTIFICATIONS = ");
		sql.append(AUsers.usSubscribedNotifications);
		sql.append(",");
		if ((AUsers.usSignature == null)) {
			sql.append("US_SIGNATURE = default ,");
		}
		else {
			sql.append("US_SIGNATURE = ");
			sql.append(SqlServerUtils.safeSql(AUsers.usSignature.toString()));
			sql.append(",");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("US_ID = ");
		sql.append(AUsers.usId);
		sql.append(appendConditionSql);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @param AppendSql 附加的Sql语句
	 * @return 查询结果
	 */
	public static List<Users> selectObjects(IDataVisit2 ADataVisit, String AppendSql) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((Users.getSelectSql() 
						+ (" from [USERS] " + AppendSql)));
		List<Users> list = new ArrayList<Users>();
		try {
			for (; reader.next(); ) {
				Users obj = new Users();
				Users.readValue(reader, obj);
				list.add(obj);
			}
		}
		finally {
			if ((reader != null)) {
				reader.close();
			}
			ADataVisit.releaseConnection();
		}
		return list;
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @return 查询结果
	 */
	public static List<Users> selectObjects(IDataVisit2 ADataVisit) throws SQLException {
		return Users.selectObjects(ADataVisit, "");
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @param AppendSql 附加的Sql语句
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public static List<Users> selectObjects(IDataVisit2 ADataVisit, String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((Users.getSelectSql() 
						+ (" from [USERS] " + AppendSql)), pageIndex, rowsOfPage, orderField, order);
		List<Users> list = new ArrayList<Users>();
		try {
			for (; reader.next(); ) {
				Users obj = new Users();
				Users.readValue(reader, obj);
				list.add(obj);
			}
		}
		finally {
			if ((reader != null)) {
				reader.close();
			}
			ADataVisit.releaseConnection();
		}
		return list;
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public static List<Users> selectObjects(IDataVisit2 ADataVisit, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		return Users.selectObjects(ADataVisit, "", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 从数据表USERS中查询一个实体对象
	 * @param ADataVisit 数据访问接口
	 * @param Int32 
	 */
	public static Users SelectByUsId(IDataVisit2 ADataVisit, int AUsId) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append(" where ");
		sql.append("US_ID = ");
		sql.append(AUsId);
		List<Users> list = Users.selectObjects(ADataVisit, sql.toString());
		if ((list.size() > 0)) {
			return list.get(0);
		}
		else {
			return null;
		}
	}
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * @param object 源对象
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (this.getClass().isInstance(obj)) {
			Users o = ((Users)(obj));
			this.usId = o.usId;
			this.usUsername = o.usUsername;
			this.usPassword = o.usPassword;
			this.usFirstname = o.usFirstname;
			this.usLastname = o.usLastname;
			this.usEmail = o.usEmail;
			this.usAdmin = o.usAdmin;
			this.usDefaultQuery = o.usDefaultQuery;
			this.usEnableNotifications = o.usEnableNotifications;
			this.usAutoSubscribe = o.usAutoSubscribe;
			this.usAutoSubscribeOwnBugs = o.usAutoSubscribeOwnBugs;
			this.usAutoSubscribeReportedBugs = o.usAutoSubscribeReportedBugs;
			this.usSendNotificationsToSelf = o.usSendNotificationsToSelf;
			this.usActive = o.usActive;
			this.usBugsPerPage = o.usBugsPerPage;
			this.usForcedProject = o.usForcedProject;
			this.usReportedNotifications = o.usReportedNotifications;
			this.usAssignedNotifications = o.usAssignedNotifications;
			this.usSubscribedNotifications = o.usSubscribedNotifications;
			this.usSignature = o.usSignature;
		}
	}
	
	/**
	 * 复制值到给定的对象,要求目标对象是子类
	 * @param object 目标对象
	 */
	public void assignTo(BaseTable obj) {
		super.assignTo(obj);
		if (this.getClass().isInstance(obj)) {
			Users o = ((Users)(obj));
			o.usId = this.usId;
			o.usUsername = this.usUsername;
			o.usPassword = this.usPassword;
			o.usFirstname = this.usFirstname;
			o.usLastname = this.usLastname;
			o.usEmail = this.usEmail;
			o.usAdmin = this.usAdmin;
			o.usDefaultQuery = this.usDefaultQuery;
			o.usEnableNotifications = this.usEnableNotifications;
			o.usAutoSubscribe = this.usAutoSubscribe;
			o.usAutoSubscribeOwnBugs = this.usAutoSubscribeOwnBugs;
			o.usAutoSubscribeReportedBugs = this.usAutoSubscribeReportedBugs;
			o.usSendNotificationsToSelf = this.usSendNotificationsToSelf;
			o.usActive = this.usActive;
			o.usBugsPerPage = this.usBugsPerPage;
			o.usForcedProject = this.usForcedProject;
			o.usReportedNotifications = this.usReportedNotifications;
			o.usAssignedNotifications = this.usAssignedNotifications;
			o.usSubscribedNotifications = this.usSubscribedNotifications;
			o.usSignature = this.usSignature;
		}
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * <@param appendSql 附加的条件语句>
	 */
	public static void deleteByUsId(IDataVisit2 ADataVisit, int AUsId, String appendSql) throws SQLException, DbException {
		String sql = "";
		sql = (sql + " delete from USERS where ");
		sql = (sql + "US_ID = ");
		sql = (sql + AUsId);
		sql = (sql + appendSql);
		ADataVisit.execSql(sql);
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 */
	public static void deleteByUsId(IDataVisit2 ADataVisit, int AUsId) throws SQLException, DbException {
		Users.deleteByUsId(ADataVisit, AUsId, "");
	}
	
	/**
	 * 把ResultSet中的数据转到对象中
	 * @param AReader 数据源
	 * @param AUsers 目标对象
	 * @return 
	 */
	public static void readValue(ResultSet AReader, Users AUsers) throws SQLException {
		AUsers.usId = AReader.getInt(1);
		AUsers.usUsername = AReader.getString(2);
		AUsers.usPassword = AReader.getString(3);
		AUsers.usFirstname = AReader.getString(4);
		if (AReader.wasNull()) {
			AUsers.usFirstname = null;
		}
		AUsers.usLastname = AReader.getString(5);
		if (AReader.wasNull()) {
			AUsers.usLastname = null;
		}
		AUsers.usEmail = AReader.getString(6);
		if (AReader.wasNull()) {
			AUsers.usEmail = null;
		}
		AUsers.usAdmin = AReader.getInt(7);
		AUsers.usDefaultQuery = AReader.getInt(8);
		AUsers.usEnableNotifications = AReader.getInt(9);
		AUsers.usAutoSubscribe = AReader.getInt(10);
		AUsers.usAutoSubscribeOwnBugs = AReader.getInt(11);
		if (AReader.wasNull()) {
			AUsers.usAutoSubscribeOwnBugs = null;
		}
		AUsers.usAutoSubscribeReportedBugs = AReader.getInt(12);
		if (AReader.wasNull()) {
			AUsers.usAutoSubscribeReportedBugs = null;
		}
		AUsers.usSendNotificationsToSelf = AReader.getInt(13);
		if (AReader.wasNull()) {
			AUsers.usSendNotificationsToSelf = null;
		}
		AUsers.usActive = AReader.getInt(14);
		AUsers.usBugsPerPage = AReader.getInt(15);
		if (AReader.wasNull()) {
			AUsers.usBugsPerPage = null;
		}
		AUsers.usForcedProject = AReader.getInt(16);
		if (AReader.wasNull()) {
			AUsers.usForcedProject = null;
		}
		AUsers.usReportedNotifications = AReader.getInt(17);
		AUsers.usAssignedNotifications = AReader.getInt(18);
		AUsers.usSubscribedNotifications = AReader.getInt(19);
		AUsers.usSignature = AReader.getString(20);
		if (AReader.wasNull()) {
			AUsers.usSignature = null;
		}
	}
}
