package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_ROLES: 系统角色表
 */
public class IssueRoles extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * ROLE_ID: 标识
	 */
	int roleId;
	
	/**
	 * ROLE_NAME: 角色名称
	 */
	String roleName = "";
	
	/**
	 * ROLE_STATE: 角色状态 0 激活 1禁止
	 */
	byte roleState;
	
	/**
	 * ROLE_PRIVILEGES: 角色的权限值(逗号分隔的权限列表) 
	 */
	String rolePrivileges = "";
	
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
	 * ROLE_NAME: 角色名称
	 */
	public String getRoleName() {
		return this.roleName;
	}
	
	/**
	 * ROLE_NAME: 角色名称
	 */
	public void setRoleName(String value)
	 {
		this.roleName = value;
	}
	
	/**
	 * ROLE_STATE: 角色状态 0 激活 1禁止
	 */
	public byte getRoleState() {
		return this.roleState;
	}
	
	/**
	 * ROLE_STATE: 角色状态 0 激活 1禁止
	 */
	public void setRoleState(byte value)
	 {
		this.roleState = value;
	}
	
	/**
	 * ROLE_PRIVILEGES: 角色的权限值(逗号分隔的权限列表) 
	 */
	public String getRolePrivileges() {
		return this.rolePrivileges;
	}
	
	/**
	 * ROLE_PRIVILEGES: 角色的权限值(逗号分隔的权限列表) 
	 */
	public void setRolePrivileges(String value)
	 {
		this.rolePrivileges = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_ISSUE_ROLES].[ROLE_ID], [T_ISSUE_ROLES].[ROLE_NAME], [T_ISSUE_ROLES].[" +
"ROLE_STATE], [T_ISSUE_ROLES].[ROLE_PRIVILEGES]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_ISSUE_ROLES].[ROLE_ID], [T_ISSUE_ROLES].[ROLE_NAME], [T_ISSUE_ROLES].[" +
"ROLE_STATE], [T_ISSUE_ROLES].[ROLE_PRIVILEGES]   from [T_ISSUE_ROLES] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_ISSUE_ROLES].[ROLE_ID], [T_ISSUE_ROLES].[ROLE_NAME], [T_ISSUE_ROLES].[ROLE_ST" +
"ATE], [T_ISSUE_ROLES].[ROLE_PRIVILEGES] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_ISSUE_ROLES";
	}
	
	
	public String getTableName() {
		return "T_ISSUE_ROLES";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "ROLE_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.roleId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (IssueRoles.class.isInstance(obj)) {
			IssueRoles o = ((IssueRoles)(obj));
			this.roleId = o.roleId;
			this.roleName = o.roleName;
			this.roleState = o.roleState;
			this.rolePrivileges = o.rolePrivileges;
		}
	}
	
	/**
	 * 插入IssueRoles对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueRoles">需要插入的系统角色表</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, IssueRoles issueRoles) throws SQLException, DbException {
		String sql = "insert into [T_ISSUE_ROLES](";
		if ((issueRoles.getRoleId() > 0)) {
			sql = (sql + "[ROLE_ID], ");
		}
		sql = (sql + "[ROLE_NAME]");
		sql = (sql + ", [ROLE_STATE]");
		sql = (sql + ", [ROLE_PRIVILEGES]");
		sql = (sql + ")values(");
		if ((issueRoles.getRoleId() > 0)) {
			sql = (sql + issueRoles.getRoleId());
			sql = (sql + ", ");
		}
		sql = (sql + SqlServerUtils.safeSql(issueRoles.getRoleName().toString()));
		sql = (sql + ", ");
		sql = (sql + issueRoles.getRoleState());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(issueRoles.getRolePrivileges().toString()));
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((issueRoles.getRoleId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_ISSUE_ROLES] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_ISSUE_ROLES off");
			}
			dataVisit.execSql(sql);
			if ((issueRoles.getRoleId() == 0)) {
				issueRoles.roleId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入IssueRoles对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		IssueRoles.insert(dataVisit, this);
	}
	
	/**
	 * 更新IssueRoles对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueRoles">需要更新的系统角色表</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssueRoles issueRoles, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_ISSUE_ROLES] set ";
		sql = (sql + "[ROLE_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(issueRoles.getRoleName().toString()));
		sql = (sql + ",");
		sql = (sql + "[ROLE_STATE] = ");
		sql = (sql + issueRoles.getRoleState());
		sql = (sql + ",");
		sql = (sql + "[ROLE_PRIVILEGES] = ");
		sql = (sql + SqlServerUtils.safeSql(issueRoles.getRolePrivileges().toString()));
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "ROLE_ID = ");
		sql = (sql + issueRoles.getRoleId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新IssueRoles对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueRoles">需要更新的系统角色表</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssueRoles issueRoles) throws SQLException, DbException {
		return IssueRoles.update(dataVisit, issueRoles, "");
	}
	
	/**
	 * 更新IssueRoles对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return IssueRoles.update(dataVisit, this);
	}
	
	/**
	 * 更新IssueRoles对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return IssueRoles.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.roleName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<IssueRoles> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<IssueRoles> list = new ArrayList<IssueRoles>();
		try {
			for (; reader.next(); ) {
				IssueRoles obj = new IssueRoles();
				IssueRoles.readValue(reader, obj);
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
	public static List<IssueRoles> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<IssueRoles> list = new ArrayList<IssueRoles>();
		try {
			for (; reader.next(); ) {
				IssueRoles obj = new IssueRoles();
				IssueRoles.readValue(reader, obj);
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
	public static List<IssueRoles> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssueRoles.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<IssueRoles> list = new ArrayList<IssueRoles>();
		try {
			for (; reader.next(); ) {
				IssueRoles obj = new IssueRoles();
				IssueRoles.readValue(reader, obj);
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
	public static List<IssueRoles> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssueRoles.getFullSelectSql() + appendConditionSql));
		List<IssueRoles> list = new ArrayList<IssueRoles>();
		try {
			for (; reader.next(); ) {
				IssueRoles obj = new IssueRoles();
				IssueRoles.readValue(reader, obj);
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
	public static <T extends IssueRoles> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssueRoles.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssueRoles.readValue(reader, obj);
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
public static <T extends IssueRoles> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssueRoles.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssueRoles.readValue(reader, obj);
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
	String sql = "select * from T_ISSUE_ROLES ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据标识查询IssueRoles
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ARoleId">标识</param>
 */
public static IssueRoles selectByRoleId(IDataVisit2 dataVisit, int ARoleId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "ROLE_ID = ");
	sql = (sql + ARoleId);
	List<IssueRoles> list = IssueRoles.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 根据角色名称查询IssueRoles
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ARoleName">角色名称</param>
 */
public static IssueRoles selectByRoleName(IDataVisit2 dataVisit, String ARoleName) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "ROLE_NAME = ");
	sql = (sql + SqlServerUtils.safeSql(ARoleName.toString()));
	List<IssueRoles> list = IssueRoles.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个IssueRoles对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ARoleId">标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByRoleId(IDataVisit2 dataVisit, int ARoleId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ISSUE_ROLES] where ");
	sql = (sql + "ROLE_ID = ");
	sql = (sql + ARoleId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个IssueRoles对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ARoleId">标识</param>
 */
public static void deleteByRoleId(IDataVisit2 dataVisit, int ARoleId) throws SQLException, DbException {
	IssueRoles.deleteByRoleId(dataVisit, ARoleId, "");
}

/**
 * 从数据库中删除一个IssueRoles对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ARoleName">角色名称</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByRoleName(IDataVisit2 dataVisit, String ARoleName, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ISSUE_ROLES] where ");
	sql = (sql + "ROLE_NAME = ");
	sql = (sql + SqlServerUtils.safeSql(ARoleName.toString()));
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个IssueRoles对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ARoleName">角色名称</param>
 */
public static void deleteByRoleName(IDataVisit2 dataVisit, String ARoleName) throws SQLException, DbException {
	IssueRoles.deleteByRoleName(dataVisit, ARoleName, "");
}

/**
 * 从reader读到数据到对象issueRoles中
 * <param name="reader">数据源</param>
 * <param name="issueRoles">目标对象</param>
 */
public static void readValue(ResultSet reader, IssueRoles issueRoles) throws SQLException, DbException {
	issueRoles.roleId = reader.getInt(1);
	issueRoles.roleName = reader.getString(2);
	issueRoles.roleState = reader.getByte(3);
	issueRoles.rolePrivileges = reader.getString(4);
}
}
