package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_PROJECT: 问题跟踪系统
 */
public class IssueProject extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * ISSUE_PROJECT_ID: 标识
	 */
	int issueProjectId;
	
	/**
	 * INNER_PROJ_ID: 内部工程ID
	 */
	Integer innerProjId;
	
	/**
	 * DEFAULT_USER_ID: 默认处理用户
	 */
	int defaultUserId;
	
	/**
	 * ISSUE_PROJECT_NAME: 项目名称
	 */
	String issueProjectName = "";
	
	/**
	 * PROJECT_ACTIVE: 项目是否激活
	 */
	boolean projectActive;
	
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
	 * INNER_PROJ_ID: 内部工程ID
	 */
	public Integer getInnerProjId() {
		return this.innerProjId;
	}
	
	/**
	 * INNER_PROJ_ID: 内部工程ID
	 */
	public void setInnerProjId(Integer value)
	 {
		this.innerProjId = value;
	}
	
	/**
	 * DEFAULT_USER_ID: 默认处理用户
	 */
	public int getDefaultUserId() {
		return this.defaultUserId;
	}
	
	/**
	 * DEFAULT_USER_ID: 默认处理用户
	 */
	public void setDefaultUserId(int value)
	 {
		this.defaultUserId = value;
	}
	
	/**
	 * ISSUE_PROJECT_NAME: 项目名称
	 */
	public String getIssueProjectName() {
		return this.issueProjectName;
	}
	
	/**
	 * ISSUE_PROJECT_NAME: 项目名称
	 */
	public void setIssueProjectName(String value)
	 {
		this.issueProjectName = value;
	}
	
	/**
	 * PROJECT_ACTIVE: 项目是否激活
	 */
	public boolean getProjectActive() {
		return this.projectActive;
	}
	
	/**
	 * PROJECT_ACTIVE: 项目是否激活
	 */
	public void setProjectActive(boolean value)
	 {
		this.projectActive = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID], [T_ISSUE_PROJECT].[INNER_PROJ_ID], " +
"[T_ISSUE_PROJECT].[DEFAULT_USER_ID], [T_ISSUE_PROJECT].[ISSUE_PROJECT_NAME], [T_" +
"ISSUE_PROJECT].[PROJECT_ACTIVE]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID], [T_ISSUE_PROJECT].[INNER_PROJ_ID], " +
"[T_ISSUE_PROJECT].[DEFAULT_USER_ID], [T_ISSUE_PROJECT].[ISSUE_PROJECT_NAME], [T_" +
"ISSUE_PROJECT].[PROJECT_ACTIVE]   from [T_ISSUE_PROJECT] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_ISSUE_PROJECT].[ISSUE_PROJECT_ID], [T_ISSUE_PROJECT].[INNER_PROJ_ID], [T_ISSU" +
"E_PROJECT].[DEFAULT_USER_ID], [T_ISSUE_PROJECT].[ISSUE_PROJECT_NAME], [T_ISSUE_P" +
"ROJECT].[PROJECT_ACTIVE] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_ISSUE_PROJECT";
	}
	
	
	public String getTableName() {
		return "T_ISSUE_PROJECT";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "ISSUE_PROJECT_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.issueProjectId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (IssueProject.class.isInstance(obj)) {
			IssueProject o = ((IssueProject)(obj));
			this.issueProjectId = o.issueProjectId;
			this.innerProjId = o.innerProjId;
			this.defaultUserId = o.defaultUserId;
			this.issueProjectName = o.issueProjectName;
			this.projectActive = o.projectActive;
		}
	}
	
	/**
	 * 插入IssueProject对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueProject">需要插入的问题跟踪系统</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, IssueProject issueProject) throws SQLException, DbException {
		String sql = "insert into [T_ISSUE_PROJECT](";
		if ((issueProject.getIssueProjectId() > 0)) {
			sql = (sql + "[ISSUE_PROJECT_ID], ");
		}
		sql = (sql + "[INNER_PROJ_ID]");
		sql = (sql + ", [DEFAULT_USER_ID]");
		sql = (sql + ", [ISSUE_PROJECT_NAME]");
		sql = (sql + ", [PROJECT_ACTIVE]");
		sql = (sql + ")values(");
		if ((issueProject.getIssueProjectId() > 0)) {
			sql = (sql + issueProject.getIssueProjectId());
			sql = (sql + ", ");
		}
		if ((issueProject.innerProjId == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + issueProject.getInnerProjId());
		}
		sql = (sql + ", ");
		sql = (sql + issueProject.getDefaultUserId());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(issueProject.getIssueProjectName().toString()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getBoolSql(issueProject.getProjectActive()));
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((issueProject.getIssueProjectId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_ISSUE_PROJECT] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_ISSUE_PROJECT off");
			}
			dataVisit.execSql(sql);
			if ((issueProject.getIssueProjectId() == 0)) {
				issueProject.issueProjectId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入IssueProject对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		IssueProject.insert(dataVisit, this);
	}
	
	/**
	 * 更新IssueProject对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueProject">需要更新的问题跟踪系统</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssueProject issueProject, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_ISSUE_PROJECT] set ";
		if ((issueProject.innerProjId == null)) {
			sql = (sql + "[INNER_PROJ_ID] = default ,");
		}
		else {
			sql = (sql + "[INNER_PROJ_ID] = ");
			sql = (sql + issueProject.getInnerProjId());
			sql = (sql + ",");
		}
		sql = (sql + "[DEFAULT_USER_ID] = ");
		sql = (sql + issueProject.getDefaultUserId());
		sql = (sql + ",");
		sql = (sql + "[ISSUE_PROJECT_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(issueProject.getIssueProjectName().toString()));
		sql = (sql + ",");
		sql = (sql + "[PROJECT_ACTIVE] = ");
		sql = (sql + SqlServerUtils.getBoolSql(issueProject.getProjectActive()));
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "ISSUE_PROJECT_ID = ");
		sql = (sql + issueProject.getIssueProjectId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新IssueProject对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueProject">需要更新的问题跟踪系统</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssueProject issueProject) throws SQLException, DbException {
		return IssueProject.update(dataVisit, issueProject, "");
	}
	
	/**
	 * 更新IssueProject对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return IssueProject.update(dataVisit, this);
	}
	
	/**
	 * 更新IssueProject对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return IssueProject.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.issueProjectName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<IssueProject> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<IssueProject> list = new ArrayList<IssueProject>();
		try {
			for (; reader.next(); ) {
				IssueProject obj = new IssueProject();
				IssueProject.readValue(reader, obj);
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
	public static List<IssueProject> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<IssueProject> list = new ArrayList<IssueProject>();
		try {
			for (; reader.next(); ) {
				IssueProject obj = new IssueProject();
				IssueProject.readValue(reader, obj);
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
	public static List<IssueProject> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssueProject.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<IssueProject> list = new ArrayList<IssueProject>();
		try {
			for (; reader.next(); ) {
				IssueProject obj = new IssueProject();
				IssueProject.readValue(reader, obj);
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
	public static List<IssueProject> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssueProject.getFullSelectSql() + appendConditionSql));
		List<IssueProject> list = new ArrayList<IssueProject>();
		try {
			for (; reader.next(); ) {
				IssueProject obj = new IssueProject();
				IssueProject.readValue(reader, obj);
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
	public static <T extends IssueProject> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssueProject.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssueProject.readValue(reader, obj);
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
public static <T extends IssueProject> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssueProject.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssueProject.readValue(reader, obj);
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
	String sql = "select * from T_ISSUE_PROJECT ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据标识查询IssueProject
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueProjectId">标识</param>
 */
public static IssueProject selectByIssueProjectId(IDataVisit2 dataVisit, int AIssueProjectId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "ISSUE_PROJECT_ID = ");
	sql = (sql + AIssueProjectId);
	List<IssueProject> list = IssueProject.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 根据项目名称查询IssueProject
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueProjectName">项目名称</param>
 */
public static IssueProject selectByIssueProjectName(IDataVisit2 dataVisit, String AIssueProjectName) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "ISSUE_PROJECT_NAME = ");
	sql = (sql + SqlServerUtils.safeSql(AIssueProjectName.toString()));
	List<IssueProject> list = IssueProject.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个IssueProject对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueProjectId">标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByIssueProjectId(IDataVisit2 dataVisit, int AIssueProjectId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ISSUE_PROJECT] where ");
	sql = (sql + "ISSUE_PROJECT_ID = ");
	sql = (sql + AIssueProjectId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个IssueProject对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueProjectId">标识</param>
 */
public static void deleteByIssueProjectId(IDataVisit2 dataVisit, int AIssueProjectId) throws SQLException, DbException {
	IssueProject.deleteByIssueProjectId(dataVisit, AIssueProjectId, "");
}

/**
 * 从数据库中删除一个IssueProject对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueProjectName">项目名称</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByIssueProjectName(IDataVisit2 dataVisit, String AIssueProjectName, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ISSUE_PROJECT] where ");
	sql = (sql + "ISSUE_PROJECT_NAME = ");
	sql = (sql + SqlServerUtils.safeSql(AIssueProjectName.toString()));
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个IssueProject对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueProjectName">项目名称</param>
 */
public static void deleteByIssueProjectName(IDataVisit2 dataVisit, String AIssueProjectName) throws SQLException, DbException {
	IssueProject.deleteByIssueProjectName(dataVisit, AIssueProjectName, "");
}

/**
 * 根据外键默认处理用户删除一批IssueProject对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="DefaultUserId">默认处理用户</param>
 */
public static void deleteListByDefaultUserId(IDataVisit2 dataVisit, int ADefaultUserId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE_PROJECT] where ");
	sql = (sql + "DEFAULT_USER_ID = ");
	sql = (sql + ADefaultUserId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键内部工程ID删除一批IssueProject对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="InnerProjId">内部工程ID</param>
 */
public static void deleteListByInnerProjId(IDataVisit2 dataVisit, Integer AInnerProjId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE_PROJECT] where ");
	sql = (sql + "INNER_PROJ_ID = ");
	sql = (sql + AInnerProjId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="DefaultUserId">默认处理用户</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueProject> selectObjectsByDefaultUserId(IDataVisit2 dataVisit, int ADefaultUserId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where DEFAULT_USER_ID = ";
	sql = (sql + ADefaultUserId);
	sql = (sql + appendConditionSql);
	return IssueProject.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="DefaultUserId">默认处理用户</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueProject> selectObjectsByDefaultUserId(IDataVisit2 dataVisit, int ADefaultUserId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where DEFAULT_USER_ID = ";
	sql = (sql + ADefaultUserId);
	return IssueProject.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="DefaultUserId">默认处理用户</param>
 */
public static List<IssueProject> selectObjectsByDefaultUserId(IDataVisit2 dataVisit, int ADefaultUserId) throws SQLException, DbException {
	String sql = " where DEFAULT_USER_ID = ";
	sql = (sql + ADefaultUserId);
	return IssueProject.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="InnerProjId">内部工程ID</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueProject> selectObjectsByInnerProjId(IDataVisit2 dataVisit, Integer AInnerProjId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where INNER_PROJ_ID = ";
	sql = (sql + AInnerProjId);
	sql = (sql + appendConditionSql);
	return IssueProject.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="InnerProjId">内部工程ID</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueProject> selectObjectsByInnerProjId(IDataVisit2 dataVisit, Integer AInnerProjId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where INNER_PROJ_ID = ";
	sql = (sql + AInnerProjId);
	return IssueProject.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="InnerProjId">内部工程ID</param>
 */
public static List<IssueProject> selectObjectsByInnerProjId(IDataVisit2 dataVisit, Integer AInnerProjId) throws SQLException, DbException {
	String sql = " where INNER_PROJ_ID = ";
	sql = (sql + AInnerProjId);
	return IssueProject.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象issueProject中
 * <param name="reader">数据源</param>
 * <param name="issueProject">目标对象</param>
 */
public static void readValue(ResultSet reader, IssueProject issueProject) throws SQLException, DbException {
	issueProject.issueProjectId = reader.getInt(1);
	issueProject.innerProjId = reader.getInt(2);
	if (reader.wasNull()) {
		issueProject.innerProjId = null;
	}
	issueProject.defaultUserId = reader.getInt(3);
	issueProject.issueProjectName = reader.getString(4);
	issueProject.projectActive = reader.getBoolean(5);
}
}
