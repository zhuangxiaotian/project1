package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ROLE: 角色表
 */
public class Role extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * ROLE_ID: 角色代号
	 */
	int roleId;
	
	/**
	 * ROLE_DESC: 角色描述
	 */
	String roleDesc = "";
	
	/**
	 * ROLE_NAME: 角色名称
	 */
	String roleName = "";
	
	/**
	 * ROLE_PRIVILEGES: 角色权利
	 */
	String rolePrivileges;
	
	/**
	 * ROLE_STATE: 角色状态
	 */
	int roleState;
	
	/**
	 * ROLE_ID: 角色代号
	 */
	public int getRoleId() {
		return this.roleId;
	}
	
	/**
	 * ROLE_ID: 角色代号
	 */
	public void setRoleId(int value)
	 {
		this.roleId = value;
	}
	
	/**
	 * ROLE_DESC: 角色描述
	 */
	public String getRoleDesc() {
		return this.roleDesc;
	}
	
	/**
	 * ROLE_DESC: 角色描述
	 */
	public void setRoleDesc(String value)
	 {
		this.roleDesc = value;
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
	 * ROLE_PRIVILEGES: 角色权利
	 */
	public String getRolePrivileges() {
		return this.rolePrivileges;
	}
	
	/**
	 * ROLE_PRIVILEGES: 角色权利
	 */
	public void setRolePrivileges(String value)
	 {
		this.rolePrivileges = value;
	}
	
	/**
	 * ROLE_STATE: 角色状态
	 */
	public int getRoleState() {
		return this.roleState;
	}
	
	/**
	 * ROLE_STATE: 角色状态
	 */
	public void setRoleState(int value)
	 {
		this.roleState = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_ROLE].[ROLE_ID], [T_ROLE].[ROLE_DESC], [T_ROLE].[ROLE_NAME], [T_ROLE]." +
"[ROLE_PRIVILEGES], [T_ROLE].[ROLE_STATE]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_ROLE].[ROLE_ID], [T_ROLE].[ROLE_DESC], [T_ROLE].[ROLE_NAME], [T_ROLE]." +
"[ROLE_PRIVILEGES], [T_ROLE].[ROLE_STATE]   from [T_ROLE] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_ROLE].[ROLE_ID], [T_ROLE].[ROLE_DESC], [T_ROLE].[ROLE_NAME], [T_ROLE].[ROLE_P" +
"RIVILEGES], [T_ROLE].[ROLE_STATE] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_ROLE";
	}
	
	
	public String getTableName() {
		return "T_ROLE";
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
		if (Role.class.isInstance(obj)) {
			Role o = ((Role)(obj));
			this.roleId = o.roleId;
			this.roleDesc = o.roleDesc;
			this.roleName = o.roleName;
			this.rolePrivileges = o.rolePrivileges;
			this.roleState = o.roleState;
		}
	}
	
	/**
	 * 插入Role对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="role">需要插入的角色表</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Role role) throws SQLException, DbException {
		String sql = "insert into [T_ROLE](";
		if ((role.getRoleId() > 0)) {
			sql = (sql + "[ROLE_ID], ");
		}
		sql = (sql + "[ROLE_DESC]");
		sql = (sql + ", [ROLE_NAME]");
		sql = (sql + ", [ROLE_PRIVILEGES]");
		sql = (sql + ", [ROLE_STATE]");
		sql = (sql + ")values(");
		if ((role.getRoleId() > 0)) {
			sql = (sql + role.getRoleId());
			sql = (sql + ", ");
		}
		sql = (sql + SqlServerUtils.safeSql(role.getRoleDesc().toString()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(role.getRoleName().toString()));
		sql = (sql + ", ");
		if ((role.rolePrivileges == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(role.getRolePrivileges().toString()));
		}
		sql = (sql + ", ");
		sql = (sql + role.getRoleState());
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((role.getRoleId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_ROLE] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_ROLE off");
			}
			dataVisit.execSql(sql);
			if ((role.getRoleId() == 0)) {
				role.roleId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入Role对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Role.insert(dataVisit, this);
	}
	
	/**
	 * 更新Role对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="role">需要更新的角色表</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Role role, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_ROLE] set ";
		sql = (sql + "[ROLE_DESC] = ");
		sql = (sql + SqlServerUtils.safeSql(role.getRoleDesc().toString()));
		sql = (sql + ",");
		sql = (sql + "[ROLE_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(role.getRoleName().toString()));
		sql = (sql + ",");
		if ((role.rolePrivileges == null)) {
			sql = (sql + "[ROLE_PRIVILEGES] = default ,");
		}
		else {
			sql = (sql + "[ROLE_PRIVILEGES] = ");
			sql = (sql + SqlServerUtils.safeSql(role.getRolePrivileges().toString()));
			sql = (sql + ",");
		}
		sql = (sql + "[ROLE_STATE] = ");
		sql = (sql + role.getRoleState());
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "ROLE_ID = ");
		sql = (sql + role.getRoleId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Role对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="role">需要更新的角色表</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Role role) throws SQLException, DbException {
		return Role.update(dataVisit, role, "");
	}
	
	/**
	 * 更新Role对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Role.update(dataVisit, this);
	}
	
	/**
	 * 更新Role对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Role.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.roleName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Role> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Role> list = new ArrayList<Role>();
		try {
			for (; reader.next(); ) {
				Role obj = new Role();
				Role.readValue(reader, obj);
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
	public static List<Role> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Role> list = new ArrayList<Role>();
		try {
			for (; reader.next(); ) {
				Role obj = new Role();
				Role.readValue(reader, obj);
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
	public static List<Role> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Role.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Role> list = new ArrayList<Role>();
		try {
			for (; reader.next(); ) {
				Role obj = new Role();
				Role.readValue(reader, obj);
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
	public static List<Role> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Role.getFullSelectSql() + appendConditionSql));
		List<Role> list = new ArrayList<Role>();
		try {
			for (; reader.next(); ) {
				Role obj = new Role();
				Role.readValue(reader, obj);
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
	public static <T extends Role> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Role.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Role.readValue(reader, obj);
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
public static <T extends Role> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Role.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Role.readValue(reader, obj);
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
	String sql = "select * from T_ROLE ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据角色代号查询Role
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ARoleId">角色代号</param>
 */
public static Role selectByRoleId(IDataVisit2 dataVisit, int ARoleId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "ROLE_ID = ");
	sql = (sql + ARoleId);
	List<Role> list = Role.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 根据角色名称查询Role
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ARoleName">角色名称</param>
 */
public static Role selectByRoleName(IDataVisit2 dataVisit, String ARoleName) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "ROLE_NAME = ");
	sql = (sql + SqlServerUtils.safeSql(ARoleName.toString()));
	List<Role> list = Role.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Role对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ARoleId">角色代号</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByRoleId(IDataVisit2 dataVisit, int ARoleId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ROLE] where ");
	sql = (sql + "ROLE_ID = ");
	sql = (sql + ARoleId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Role对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ARoleId">角色代号</param>
 */
public static void deleteByRoleId(IDataVisit2 dataVisit, int ARoleId) throws SQLException, DbException {
	Role.deleteByRoleId(dataVisit, ARoleId, "");
}

/**
 * 从数据库中删除一个Role对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ARoleName">角色名称</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByRoleName(IDataVisit2 dataVisit, String ARoleName, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ROLE] where ");
	sql = (sql + "ROLE_NAME = ");
	sql = (sql + SqlServerUtils.safeSql(ARoleName.toString()));
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Role对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ARoleName">角色名称</param>
 */
public static void deleteByRoleName(IDataVisit2 dataVisit, String ARoleName) throws SQLException, DbException {
	Role.deleteByRoleName(dataVisit, ARoleName, "");
}

/**
 * 从reader读到数据到对象role中
 * <param name="reader">数据源</param>
 * <param name="role">目标对象</param>
 */
public static void readValue(ResultSet reader, Role role) throws SQLException, DbException {
	role.roleId = reader.getInt(1);
	role.roleDesc = reader.getString(2);
	role.roleName = reader.getString(3);
	role.rolePrivileges = reader.getString(4);
	if (reader.wasNull()) {
		role.rolePrivileges = null;
	}
	role.roleState = reader.getInt(5);
}
}
