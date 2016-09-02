package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_PROJECT_JOIN_USER: 工程——用户表
 */
public class ProjectJoinUser extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * PROJECT_ID: 工程代号
	 */
	int projectId;
	
	/**
	 * USER_ID: 用户代号
	 */
	int userId;
	
	/**
	 * PROJECT_ID: 工程代号
	 */
	public int getProjectId() {
		return this.projectId;
	}
	
	/**
	 * PROJECT_ID: 工程代号
	 */
	public void setProjectId(int value)
	 {
		this.projectId = value;
	}
	
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
	
	public static String getSelectSql() {
		return "select  [T_PROJECT_JOIN_USER].[PROJECT_ID], [T_PROJECT_JOIN_USER].[USER_ID]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_PROJECT_JOIN_USER].[PROJECT_ID], [T_PROJECT_JOIN_USER].[USER_ID]   fro" +
"m [T_PROJECT_JOIN_USER] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_PROJECT_JOIN_USER].[PROJECT_ID], [T_PROJECT_JOIN_USER].[USER_ID] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_PROJECT_JOIN_USER";
	}
	
	
	public String getTableName() {
		return "T_PROJECT_JOIN_USER";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "PROJECT_ID,USER_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.projectId);
		kvalue = (kvalue + ",");
		kvalue = (kvalue + this.userId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (ProjectJoinUser.class.isInstance(obj)) {
			ProjectJoinUser o = ((ProjectJoinUser)(obj));
			this.projectId = o.projectId;
			this.userId = o.userId;
		}
	}
	
	/**
	 * 插入ProjectJoinUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="projectJoinUser">需要插入的工程——用户表</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, ProjectJoinUser projectJoinUser) throws SQLException, DbException {
		String sql = "insert into [T_PROJECT_JOIN_USER](";
		sql = (sql + "[PROJECT_ID]");
		sql = (sql + ", [USER_ID]");
		sql = (sql + ")values(");
		sql = (sql + projectJoinUser.getProjectId());
		sql = (sql + ", ");
		sql = (sql + projectJoinUser.getUserId());
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入ProjectJoinUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		ProjectJoinUser.insert(dataVisit, this);
	}
	
	/**
	 * 更新ProjectJoinUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="projectJoinUser">需要更新的工程——用户表</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, ProjectJoinUser projectJoinUser, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_PROJECT_JOIN_USER] set ";
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "PROJECT_ID = ");
		sql = (sql + projectJoinUser.getProjectId());
		sql = (sql + " and ");
		sql = (sql + "USER_ID = ");
		sql = (sql + projectJoinUser.getUserId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新ProjectJoinUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="projectJoinUser">需要更新的工程——用户表</param>
	 */
	protected static int update(IDataVisit2 dataVisit, ProjectJoinUser projectJoinUser) throws SQLException, DbException {
		return ProjectJoinUser.update(dataVisit, projectJoinUser, "");
	}
	
	/**
	 * 更新ProjectJoinUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return ProjectJoinUser.update(dataVisit, this);
	}
	
	/**
	 * 更新ProjectJoinUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return ProjectJoinUser.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<ProjectJoinUser> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<ProjectJoinUser> list = new ArrayList<ProjectJoinUser>();
		try {
			for (; reader.next(); ) {
				ProjectJoinUser obj = new ProjectJoinUser();
				ProjectJoinUser.readValue(reader, obj);
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
	public static List<ProjectJoinUser> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<ProjectJoinUser> list = new ArrayList<ProjectJoinUser>();
		try {
			for (; reader.next(); ) {
				ProjectJoinUser obj = new ProjectJoinUser();
				ProjectJoinUser.readValue(reader, obj);
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
	public static List<ProjectJoinUser> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((ProjectJoinUser.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<ProjectJoinUser> list = new ArrayList<ProjectJoinUser>();
		try {
			for (; reader.next(); ) {
				ProjectJoinUser obj = new ProjectJoinUser();
				ProjectJoinUser.readValue(reader, obj);
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
	public static List<ProjectJoinUser> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((ProjectJoinUser.getFullSelectSql() + appendConditionSql));
		List<ProjectJoinUser> list = new ArrayList<ProjectJoinUser>();
		try {
			for (; reader.next(); ) {
				ProjectJoinUser obj = new ProjectJoinUser();
				ProjectJoinUser.readValue(reader, obj);
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
	public static <T extends ProjectJoinUser> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((ProjectJoinUser.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			ProjectJoinUser.readValue(reader, obj);
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
public static <T extends ProjectJoinUser> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((ProjectJoinUser.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			ProjectJoinUser.readValue(reader, obj);
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
	String sql = "select * from T_PROJECT_JOIN_USER ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据工程代号,用户代号查询ProjectJoinUser
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AProjectId">工程代号</param>
 * <param name="AUserId">用户代号</param>
 */
public static ProjectJoinUser selectByProjectIdUserId(IDataVisit2 dataVisit, int AProjectId, int AUserId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "PROJECT_ID = ");
	sql = (sql + AProjectId);
	sql = (sql + " and ");
	sql = (sql + "USER_ID = ");
	sql = (sql + AUserId);
	List<ProjectJoinUser> list = ProjectJoinUser.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个ProjectJoinUser对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AProjectId">工程代号</param>
 * <param name="AUserId">用户代号</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByProjectIdUserId(IDataVisit2 dataVisit, int AProjectId, int AUserId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_PROJECT_JOIN_USER] where ");
	sql = (sql + "PROJECT_ID = ");
	sql = (sql + AProjectId);
	sql = (sql + " and ");
	sql = (sql + "USER_ID = ");
	sql = (sql + AUserId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个ProjectJoinUser对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AProjectId">工程代号</param>
 * <param name="AUserId">用户代号</param>
 */
public static void deleteByProjectIdUserId(IDataVisit2 dataVisit, int AProjectId, int AUserId) throws SQLException, DbException {
	ProjectJoinUser.deleteByProjectIdUserId(dataVisit, AProjectId, AUserId, "");
}

/**
 * 根据外键工程代号删除一批ProjectJoinUser对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ProjectId">工程代号</param>
 */
public static void deleteListByProjectId(IDataVisit2 dataVisit, int AProjectId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_PROJECT_JOIN_USER] where ");
	sql = (sql + "PROJECT_ID = ");
	sql = (sql + AProjectId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键用户代号删除一批ProjectJoinUser对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="UserId">用户代号</param>
 */
public static void deleteListByUserId(IDataVisit2 dataVisit, int AUserId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_PROJECT_JOIN_USER] where ");
	sql = (sql + "USER_ID = ");
	sql = (sql + AUserId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ProjectId">工程代号</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<ProjectJoinUser> selectObjectsByProjectId(IDataVisit2 dataVisit, int AProjectId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PROJECT_ID = ";
	sql = (sql + AProjectId);
	sql = (sql + appendConditionSql);
	return ProjectJoinUser.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ProjectId">工程代号</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<ProjectJoinUser> selectObjectsByProjectId(IDataVisit2 dataVisit, int AProjectId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PROJECT_ID = ";
	sql = (sql + AProjectId);
	return ProjectJoinUser.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ProjectId">工程代号</param>
 */
public static List<ProjectJoinUser> selectObjectsByProjectId(IDataVisit2 dataVisit, int AProjectId) throws SQLException, DbException {
	String sql = " where PROJECT_ID = ";
	sql = (sql + AProjectId);
	return ProjectJoinUser.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="UserId">用户代号</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<ProjectJoinUser> selectObjectsByUserId(IDataVisit2 dataVisit, int AUserId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where USER_ID = ";
	sql = (sql + AUserId);
	sql = (sql + appendConditionSql);
	return ProjectJoinUser.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="UserId">用户代号</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<ProjectJoinUser> selectObjectsByUserId(IDataVisit2 dataVisit, int AUserId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where USER_ID = ";
	sql = (sql + AUserId);
	return ProjectJoinUser.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="UserId">用户代号</param>
 */
public static List<ProjectJoinUser> selectObjectsByUserId(IDataVisit2 dataVisit, int AUserId) throws SQLException, DbException {
	String sql = " where USER_ID = ";
	sql = (sql + AUserId);
	return ProjectJoinUser.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象projectJoinUser中
 * <param name="reader">数据源</param>
 * <param name="projectJoinUser">目标对象</param>
 */
public static void readValue(ResultSet reader, ProjectJoinUser projectJoinUser) throws SQLException, DbException {
	projectJoinUser.projectId = reader.getInt(1);
	projectJoinUser.userId = reader.getInt(2);
}
}
