package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_PROJECT_MODULE: 项目模块
 */
public class IssueProjectModule extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * ISSUE_PROJECT_MODULE_ID: 标识
	 */
	int issueProjectModuleId;
	
	/**
	 * ISSUE_PROJECT_ID: 标识
	 */
	int issueProjectId;
	
	/**
	 * MODULE_NAME: 模块名称
	 */
	String moduleName = "";
	
	/**
	 * ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public int getIssueProjectModuleId() {
		return this.issueProjectModuleId;
	}
	
	/**
	 * ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public void setIssueProjectModuleId(int value)
	 {
		this.issueProjectModuleId = value;
	}
	
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
	 * MODULE_NAME: 模块名称
	 */
	public String getModuleName() {
		return this.moduleName;
	}
	
	/**
	 * MODULE_NAME: 模块名称
	 */
	public void setModuleName(String value)
	 {
		this.moduleName = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_ISSUE_PROJECT_MODULE].[ISSUE_PROJECT_MODULE_ID], [T_ISSUE_PROJECT_MODU" +
"LE].[ISSUE_PROJECT_ID], [T_ISSUE_PROJECT_MODULE].[MODULE_NAME]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_ISSUE_PROJECT_MODULE].[ISSUE_PROJECT_MODULE_ID], [T_ISSUE_PROJECT_MODU" +
"LE].[ISSUE_PROJECT_ID], [T_ISSUE_PROJECT_MODULE].[MODULE_NAME]   from [T_ISSUE_P" +
"ROJECT_MODULE] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_ISSUE_PROJECT_MODULE].[ISSUE_PROJECT_MODULE_ID], [T_ISSUE_PROJECT_MODULE].[IS" +
"SUE_PROJECT_ID], [T_ISSUE_PROJECT_MODULE].[MODULE_NAME] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_ISSUE_PROJECT_MODULE";
	}
	
	
	public String getTableName() {
		return "T_ISSUE_PROJECT_MODULE";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "ISSUE_PROJECT_MODULE_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.issueProjectModuleId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (IssueProjectModule.class.isInstance(obj)) {
			IssueProjectModule o = ((IssueProjectModule)(obj));
			this.issueProjectModuleId = o.issueProjectModuleId;
			this.issueProjectId = o.issueProjectId;
			this.moduleName = o.moduleName;
		}
	}
	
	/**
	 * 插入IssueProjectModule对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueProjectModule">需要插入的项目模块</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, IssueProjectModule issueProjectModule) throws SQLException, DbException {
		String sql = "insert into [T_ISSUE_PROJECT_MODULE](";
		if ((issueProjectModule.getIssueProjectModuleId() > 0)) {
			sql = (sql + "[ISSUE_PROJECT_MODULE_ID], ");
		}
		sql = (sql + "[ISSUE_PROJECT_ID]");
		sql = (sql + ", [MODULE_NAME]");
		sql = (sql + ")values(");
		if ((issueProjectModule.getIssueProjectModuleId() > 0)) {
			sql = (sql + issueProjectModule.getIssueProjectModuleId());
			sql = (sql + ", ");
		}
		sql = (sql + issueProjectModule.getIssueProjectId());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(issueProjectModule.getModuleName().toString()));
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((issueProjectModule.getIssueProjectModuleId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_ISSUE_PROJECT_MODULE] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_ISSUE_PROJECT_MODULE off");
			}
			dataVisit.execSql(sql);
			if ((issueProjectModule.getIssueProjectModuleId() == 0)) {
				issueProjectModule.issueProjectModuleId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入IssueProjectModule对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		IssueProjectModule.insert(dataVisit, this);
	}
	
	/**
	 * 更新IssueProjectModule对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueProjectModule">需要更新的项目模块</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssueProjectModule issueProjectModule, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_ISSUE_PROJECT_MODULE] set ";
		sql = (sql + "[ISSUE_PROJECT_ID] = ");
		sql = (sql + issueProjectModule.getIssueProjectId());
		sql = (sql + ",");
		sql = (sql + "[MODULE_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(issueProjectModule.getModuleName().toString()));
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "ISSUE_PROJECT_MODULE_ID = ");
		sql = (sql + issueProjectModule.getIssueProjectModuleId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新IssueProjectModule对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueProjectModule">需要更新的项目模块</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssueProjectModule issueProjectModule) throws SQLException, DbException {
		return IssueProjectModule.update(dataVisit, issueProjectModule, "");
	}
	
	/**
	 * 更新IssueProjectModule对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return IssueProjectModule.update(dataVisit, this);
	}
	
	/**
	 * 更新IssueProjectModule对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return IssueProjectModule.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.moduleName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<IssueProjectModule> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<IssueProjectModule> list = new ArrayList<IssueProjectModule>();
		try {
			for (; reader.next(); ) {
				IssueProjectModule obj = new IssueProjectModule();
				IssueProjectModule.readValue(reader, obj);
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
	public static List<IssueProjectModule> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<IssueProjectModule> list = new ArrayList<IssueProjectModule>();
		try {
			for (; reader.next(); ) {
				IssueProjectModule obj = new IssueProjectModule();
				IssueProjectModule.readValue(reader, obj);
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
	public static List<IssueProjectModule> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssueProjectModule.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<IssueProjectModule> list = new ArrayList<IssueProjectModule>();
		try {
			for (; reader.next(); ) {
				IssueProjectModule obj = new IssueProjectModule();
				IssueProjectModule.readValue(reader, obj);
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
	public static List<IssueProjectModule> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssueProjectModule.getFullSelectSql() + appendConditionSql));
		List<IssueProjectModule> list = new ArrayList<IssueProjectModule>();
		try {
			for (; reader.next(); ) {
				IssueProjectModule obj = new IssueProjectModule();
				IssueProjectModule.readValue(reader, obj);
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
	public static <T extends IssueProjectModule> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssueProjectModule.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssueProjectModule.readValue(reader, obj);
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
public static <T extends IssueProjectModule> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssueProjectModule.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssueProjectModule.readValue(reader, obj);
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
	String sql = "select * from T_ISSUE_PROJECT_MODULE ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据标识查询IssueProjectModule
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueProjectModuleId">标识</param>
 */
public static IssueProjectModule selectByIssueProjectModuleId(IDataVisit2 dataVisit, int AIssueProjectModuleId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "ISSUE_PROJECT_MODULE_ID = ");
	sql = (sql + AIssueProjectModuleId);
	List<IssueProjectModule> list = IssueProjectModule.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 根据标识,模块名称查询IssueProjectModule
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueProjectId">标识</param>
 * <param name="AModuleName">模块名称</param>
 */
public static IssueProjectModule selectByIssueProjectIdModuleName(IDataVisit2 dataVisit, int AIssueProjectId, String AModuleName) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "ISSUE_PROJECT_ID = ");
	sql = (sql + AIssueProjectId);
	sql = (sql + " and ");
	sql = (sql + "MODULE_NAME = ");
	sql = (sql + SqlServerUtils.safeSql(AModuleName.toString()));
	List<IssueProjectModule> list = IssueProjectModule.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个IssueProjectModule对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueProjectModuleId">标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByIssueProjectModuleId(IDataVisit2 dataVisit, int AIssueProjectModuleId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ISSUE_PROJECT_MODULE] where ");
	sql = (sql + "ISSUE_PROJECT_MODULE_ID = ");
	sql = (sql + AIssueProjectModuleId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个IssueProjectModule对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueProjectModuleId">标识</param>
 */
public static void deleteByIssueProjectModuleId(IDataVisit2 dataVisit, int AIssueProjectModuleId) throws SQLException, DbException {
	IssueProjectModule.deleteByIssueProjectModuleId(dataVisit, AIssueProjectModuleId, "");
}

/**
 * 从数据库中删除一个IssueProjectModule对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueProjectId">标识</param>
 * <param name="AModuleName">模块名称</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByIssueProjectIdModuleName(IDataVisit2 dataVisit, int AIssueProjectId, String AModuleName, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ISSUE_PROJECT_MODULE] where ");
	sql = (sql + "ISSUE_PROJECT_ID = ");
	sql = (sql + AIssueProjectId);
	sql = (sql + " and ");
	sql = (sql + "MODULE_NAME = ");
	sql = (sql + SqlServerUtils.safeSql(AModuleName.toString()));
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个IssueProjectModule对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueProjectId">标识</param>
 * <param name="AModuleName">模块名称</param>
 */
public static void deleteByIssueProjectIdModuleName(IDataVisit2 dataVisit, int AIssueProjectId, String AModuleName) throws SQLException, DbException {
	IssueProjectModule.deleteByIssueProjectIdModuleName(dataVisit, AIssueProjectId, AModuleName, "");
}

/**
 * 根据外键标识删除一批IssueProjectModule对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueProjectId">标识</param>
 */
public static void deleteListByIssueProjectId(IDataVisit2 dataVisit, int AIssueProjectId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE_PROJECT_MODULE] where ");
	sql = (sql + "ISSUE_PROJECT_ID = ");
	sql = (sql + AIssueProjectId);
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
public static List<IssueProjectModule> selectObjectsByIssueProjectId(IDataVisit2 dataVisit, int AIssueProjectId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ISSUE_PROJECT_ID = ";
	sql = (sql + AIssueProjectId);
	sql = (sql + appendConditionSql);
	return IssueProjectModule.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
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
public static List<IssueProjectModule> selectObjectsByIssueProjectId(IDataVisit2 dataVisit, int AIssueProjectId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ISSUE_PROJECT_ID = ";
	sql = (sql + AIssueProjectId);
	return IssueProjectModule.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueProjectId">标识</param>
 */
public static List<IssueProjectModule> selectObjectsByIssueProjectId(IDataVisit2 dataVisit, int AIssueProjectId) throws SQLException, DbException {
	String sql = " where ISSUE_PROJECT_ID = ";
	sql = (sql + AIssueProjectId);
	return IssueProjectModule.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象issueProjectModule中
 * <param name="reader">数据源</param>
 * <param name="issueProjectModule">目标对象</param>
 */
public static void readValue(ResultSet reader, IssueProjectModule issueProjectModule) throws SQLException, DbException {
	issueProjectModule.issueProjectModuleId = reader.getInt(1);
	issueProjectModule.issueProjectId = reader.getInt(2);
	issueProjectModule.moduleName = reader.getString(3);
}
}
