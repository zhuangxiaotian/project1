package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ORMAPPING_PROJECT: 实体对象映射项目
 */
public class OrmappingProject extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * PROJ_ID: 工程号
	 */
	int projId;
	
	/**
	 * PROJ_PARAM_FILE_PATH: 参数文件路径
	 */
	String projParamFilePath;
	
	/**
	 * PROJ_DB_CONFIG_PATH: 数据架构文件路径
	 */
	String projDbConfigPath;
	
	/**
	 * DB_HOST: 数据库主机
	 */
	String dbHost;
	
	/**
	 * DB_NAME: 数据库名称
	 */
	String dbName;
	
	/**
	 * DB_USER: 数据库用户
	 */
	String dbUser;
	
	/**
	 * DB_PASS: 数据库用户密码
	 */
	String dbPass;
	
	/**
	 * PROJ_ID: 工程号
	 */
	public int getProjId() {
		return this.projId;
	}
	
	/**
	 * PROJ_ID: 工程号
	 */
	public void setProjId(int value)
	 {
		this.projId = value;
	}
	
	/**
	 * PROJ_PARAM_FILE_PATH: 参数文件路径
	 */
	public String getProjParamFilePath() {
		return this.projParamFilePath;
	}
	
	/**
	 * PROJ_PARAM_FILE_PATH: 参数文件路径
	 */
	public void setProjParamFilePath(String value)
	 {
		this.projParamFilePath = value;
	}
	
	/**
	 * PROJ_DB_CONFIG_PATH: 数据架构文件路径
	 */
	public String getProjDbConfigPath() {
		return this.projDbConfigPath;
	}
	
	/**
	 * PROJ_DB_CONFIG_PATH: 数据架构文件路径
	 */
	public void setProjDbConfigPath(String value)
	 {
		this.projDbConfigPath = value;
	}
	
	/**
	 * DB_HOST: 数据库主机
	 */
	public String getDbHost() {
		return this.dbHost;
	}
	
	/**
	 * DB_HOST: 数据库主机
	 */
	public void setDbHost(String value)
	 {
		this.dbHost = value;
	}
	
	/**
	 * DB_NAME: 数据库名称
	 */
	public String getDbName() {
		return this.dbName;
	}
	
	/**
	 * DB_NAME: 数据库名称
	 */
	public void setDbName(String value)
	 {
		this.dbName = value;
	}
	
	/**
	 * DB_USER: 数据库用户
	 */
	public String getDbUser() {
		return this.dbUser;
	}
	
	/**
	 * DB_USER: 数据库用户
	 */
	public void setDbUser(String value)
	 {
		this.dbUser = value;
	}
	
	/**
	 * DB_PASS: 数据库用户密码
	 */
	public String getDbPass() {
		return this.dbPass;
	}
	
	/**
	 * DB_PASS: 数据库用户密码
	 */
	public void setDbPass(String value)
	 {
		this.dbPass = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_ORMAPPING_PROJECT].[PROJ_ID], [T_ORMAPPING_PROJECT].[PROJ_PARAM_FILE_PATH], [T_ORMAPPING_PROJECT].[PROJ_DB_CONFIG_PATH], [T_ORMAPPING_PROJECT].[DB_HOST], [T_ORMAPPING_PROJECT].[DB_NAME], [T_ORMAPPING_PROJECT].[DB_USER], [T_ORMAPPING_PROJECT].[DB_PASS]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_ORMAPPING_PROJECT].[PROJ_ID], [T_ORMAPPING_PROJECT].[PROJ_PARAM_FILE_PATH], [T_ORMAPPING_PROJECT].[PROJ_DB_CONFIG_PATH], [T_ORMAPPING_PROJECT].[DB_HOST], [T_ORMAPPING_PROJECT].[DB_NAME], [T_ORMAPPING_PROJECT].[DB_USER], [T_ORMAPPING_PROJECT].[DB_PASS]   from [T_ORMAPPING_PROJECT] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_ORMAPPING_PROJECT].[PROJ_ID], [T_ORMAPPING_PROJECT].[PROJ_PARAM_FILE_PATH], [T_ORMAPPING_PROJECT].[PROJ_DB_CONFIG_PATH], [T_ORMAPPING_PROJECT].[DB_HOST], [T_ORMAPPING_PROJECT].[DB_NAME], [T_ORMAPPING_PROJECT].[DB_USER], [T_ORMAPPING_PROJECT].[DB_PASS] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_ORMAPPING_PROJECT";
	}
	
	
	public String getTableName() {
		return "T_ORMAPPING_PROJECT";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "PROJ_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.projId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (OrmappingProject.class.isInstance(obj)) {
			OrmappingProject o = ((OrmappingProject)(obj));
			this.projId = o.projId;
			this.projParamFilePath = o.projParamFilePath;
			this.projDbConfigPath = o.projDbConfigPath;
			this.dbHost = o.dbHost;
			this.dbName = o.dbName;
			this.dbUser = o.dbUser;
			this.dbPass = o.dbPass;
		}
	}
	
	/**
	 * 插入OrmappingProject对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="ormappingProject">需要插入的实体对象映射项目</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, OrmappingProject ormappingProject) throws SQLException, DbException {
		String sql = "insert into [T_ORMAPPING_PROJECT](";
		sql = (sql + "[PROJ_ID]");
		sql = (sql + ", [PROJ_PARAM_FILE_PATH]");
		sql = (sql + ", [PROJ_DB_CONFIG_PATH]");
		sql = (sql + ", [DB_HOST]");
		sql = (sql + ", [DB_NAME]");
		sql = (sql + ", [DB_USER]");
		sql = (sql + ", [DB_PASS]");
		sql = (sql + ")values(");
		sql = (sql + ormappingProject.getProjId());
		sql = (sql + ", ");
		if ((ormappingProject.projParamFilePath == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(ormappingProject.getProjParamFilePath().toString()));
		}
		sql = (sql + ", ");
		if ((ormappingProject.projDbConfigPath == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(ormappingProject.getProjDbConfigPath().toString()));
		}
		sql = (sql + ", ");
		if ((ormappingProject.dbHost == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(ormappingProject.getDbHost().toString()));
		}
		sql = (sql + ", ");
		if ((ormappingProject.dbName == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(ormappingProject.getDbName().toString()));
		}
		sql = (sql + ", ");
		if ((ormappingProject.dbUser == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(ormappingProject.getDbUser().toString()));
		}
		sql = (sql + ", ");
		if ((ormappingProject.dbPass == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(ormappingProject.getDbPass().toString()));
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入OrmappingProject对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		OrmappingProject.insert(dataVisit, this);
	}
	
	/**
	 * 更新OrmappingProject对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="ormappingProject">需要更新的实体对象映射项目</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, OrmappingProject ormappingProject, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_ORMAPPING_PROJECT] set ";
		if ((ormappingProject.projParamFilePath == null)) {
			sql = (sql + "[PROJ_PARAM_FILE_PATH] = default ,");
		}
		else {
			sql = (sql + "[PROJ_PARAM_FILE_PATH] = ");
			sql = (sql + SqlServerUtils.safeSql(ormappingProject.getProjParamFilePath().toString()));
			sql = (sql + ",");
		}
		if ((ormappingProject.projDbConfigPath == null)) {
			sql = (sql + "[PROJ_DB_CONFIG_PATH] = default ,");
		}
		else {
			sql = (sql + "[PROJ_DB_CONFIG_PATH] = ");
			sql = (sql + SqlServerUtils.safeSql(ormappingProject.getProjDbConfigPath().toString()));
			sql = (sql + ",");
		}
		if ((ormappingProject.dbHost == null)) {
			sql = (sql + "[DB_HOST] = default ,");
		}
		else {
			sql = (sql + "[DB_HOST] = ");
			sql = (sql + SqlServerUtils.safeSql(ormappingProject.getDbHost().toString()));
			sql = (sql + ",");
		}
		if ((ormappingProject.dbName == null)) {
			sql = (sql + "[DB_NAME] = default ,");
		}
		else {
			sql = (sql + "[DB_NAME] = ");
			sql = (sql + SqlServerUtils.safeSql(ormappingProject.getDbName().toString()));
			sql = (sql + ",");
		}
		if ((ormappingProject.dbUser == null)) {
			sql = (sql + "[DB_USER] = default ,");
		}
		else {
			sql = (sql + "[DB_USER] = ");
			sql = (sql + SqlServerUtils.safeSql(ormappingProject.getDbUser().toString()));
			sql = (sql + ",");
		}
		if ((ormappingProject.dbPass == null)) {
			sql = (sql + "[DB_PASS] = default ,");
		}
		else {
			sql = (sql + "[DB_PASS] = ");
			sql = (sql + SqlServerUtils.safeSql(ormappingProject.getDbPass().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "PROJ_ID = ");
		sql = (sql + ormappingProject.getProjId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新OrmappingProject对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="ormappingProject">需要更新的实体对象映射项目</param>
	 */
	protected static int update(IDataVisit2 dataVisit, OrmappingProject ormappingProject) throws SQLException, DbException {
		return OrmappingProject.update(dataVisit, ormappingProject, "");
	}
	
	/**
	 * 更新OrmappingProject对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return OrmappingProject.update(dataVisit, this);
	}
	
	/**
	 * 更新OrmappingProject对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return OrmappingProject.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.dbName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<OrmappingProject> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<OrmappingProject> list = new ArrayList<OrmappingProject>();
		try {
			for (; reader.next(); ) {
				OrmappingProject obj = new OrmappingProject();
				OrmappingProject.readValue(reader, obj);
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
	public static List<OrmappingProject> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<OrmappingProject> list = new ArrayList<OrmappingProject>();
		try {
			for (; reader.next(); ) {
				OrmappingProject obj = new OrmappingProject();
				OrmappingProject.readValue(reader, obj);
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
	public static List<OrmappingProject> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((OrmappingProject.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<OrmappingProject> list = new ArrayList<OrmappingProject>();
		try {
			for (; reader.next(); ) {
				OrmappingProject obj = new OrmappingProject();
				OrmappingProject.readValue(reader, obj);
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
	public static List<OrmappingProject> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((OrmappingProject.getFullSelectSql() + appendConditionSql));
		List<OrmappingProject> list = new ArrayList<OrmappingProject>();
		try {
			for (; reader.next(); ) {
				OrmappingProject obj = new OrmappingProject();
				OrmappingProject.readValue(reader, obj);
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
	public static <T extends OrmappingProject> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((OrmappingProject.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			OrmappingProject.readValue(reader, obj);
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
public static <T extends OrmappingProject> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((OrmappingProject.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			OrmappingProject.readValue(reader, obj);
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
	String sql = "select * from T_ORMAPPING_PROJECT ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据工程号查询OrmappingProject
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AProjId">工程号</param>
 */
public static OrmappingProject selectByProjId(IDataVisit2 dataVisit, int AProjId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "PROJ_ID = ");
	sql = (sql + AProjId);
	List<OrmappingProject> list = OrmappingProject.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个OrmappingProject对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AProjId">工程号</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByProjId(IDataVisit2 dataVisit, int AProjId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ORMAPPING_PROJECT] where ");
	sql = (sql + "PROJ_ID = ");
	sql = (sql + AProjId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个OrmappingProject对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AProjId">工程号</param>
 */
public static void deleteByProjId(IDataVisit2 dataVisit, int AProjId) throws SQLException, DbException {
	OrmappingProject.deleteByProjId(dataVisit, AProjId, "");
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ProjId">工程号</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<OrmappingProject> selectObjectsByProjId(IDataVisit2 dataVisit, int AProjId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PROJ_ID = ";
	sql = (sql + AProjId);
	sql = (sql + appendConditionSql);
	return OrmappingProject.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ProjId">工程号</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<OrmappingProject> selectObjectsByProjId(IDataVisit2 dataVisit, int AProjId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PROJ_ID = ";
	sql = (sql + AProjId);
	return OrmappingProject.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ProjId">工程号</param>
 */
public static List<OrmappingProject> selectObjectsByProjId(IDataVisit2 dataVisit, int AProjId) throws SQLException, DbException {
	String sql = " where PROJ_ID = ";
	sql = (sql + AProjId);
	return OrmappingProject.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象ormappingProject中
 * <param name="reader">数据源</param>
 * <param name="ormappingProject">目标对象</param>
 */
public static void readValue(ResultSet reader, OrmappingProject ormappingProject) throws SQLException, DbException {
	ormappingProject.projId = reader.getInt(1);
	ormappingProject.projParamFilePath = reader.getString(2);
	if (reader.wasNull()) {
		ormappingProject.projParamFilePath = null;
	}
	ormappingProject.projDbConfigPath = reader.getString(3);
	if (reader.wasNull()) {
		ormappingProject.projDbConfigPath = null;
	}
	ormappingProject.dbHost = reader.getString(4);
	if (reader.wasNull()) {
		ormappingProject.dbHost = null;
	}
	ormappingProject.dbName = reader.getString(5);
	if (reader.wasNull()) {
		ormappingProject.dbName = null;
	}
	ormappingProject.dbUser = reader.getString(6);
	if (reader.wasNull()) {
		ormappingProject.dbUser = null;
	}
	ormappingProject.dbPass = reader.getString(7);
	if (reader.wasNull()) {
		ormappingProject.dbPass = null;
	}
}
}
