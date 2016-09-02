package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_CODE_BUILD: 构建任务
 */
public class CodeBuild extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * BUILD_ID: 构建标识
	 */
	int buildId;
	
	/**
	 * BUILD_NAME: 构建名称
	 */
	String buildName = "";
	
	/**
	 * BUILD_DESC: 构建说明
	 */
	String buildDesc;
	
	/**
	 * PARENT_BUILD_ID: 父构建标识
	 */
	int parentBuildId;
	
	/**
	 * FUNC_PROJECTS: 相关项目标识，多个标识用逗号分隔
	 */
	String funcProjects;
	
	/**
	 * PUB0: 备用字段1
	 */
	String pub0;
	
	/**
	 * PUB1: 备用字段2
	 */
	String pub1;
	
	/**
	 * PUB2: 备用字段3
	 */
	String pub2;
	
	/**
	 * PUB3: 备用字段4
	 */
	String pub3;
	
	/**
	 * PUB4: 备用字段5
	 */
	String pub4;
	
	/**
	 * PUB5: 备用字段6
	 */
	String pub5;
	
	/**
	 * BUILD_ID: 构建标识
	 */
	public int getBuildId() {
		return this.buildId;
	}
	
	/**
	 * BUILD_ID: 构建标识
	 */
	public void setBuildId(int value)
	 {
		this.buildId = value;
	}
	
	/**
	 * BUILD_NAME: 构建名称
	 */
	public String getBuildName() {
		return this.buildName;
	}
	
	/**
	 * BUILD_NAME: 构建名称
	 */
	public void setBuildName(String value)
	 {
		this.buildName = value;
	}
	
	/**
	 * BUILD_DESC: 构建说明
	 */
	public String getBuildDesc() {
		return this.buildDesc;
	}
	
	/**
	 * BUILD_DESC: 构建说明
	 */
	public void setBuildDesc(String value)
	 {
		this.buildDesc = value;
	}
	
	/**
	 * PARENT_BUILD_ID: 父构建标识
	 */
	public int getParentBuildId() {
		return this.parentBuildId;
	}
	
	/**
	 * PARENT_BUILD_ID: 父构建标识
	 */
	public void setParentBuildId(int value)
	 {
		this.parentBuildId = value;
	}
	
	/**
	 * FUNC_PROJECTS: 相关项目标识，多个标识用逗号分隔
	 */
	public String getFuncProjects() {
		return this.funcProjects;
	}
	
	/**
	 * FUNC_PROJECTS: 相关项目标识，多个标识用逗号分隔
	 */
	public void setFuncProjects(String value)
	 {
		this.funcProjects = value;
	}
	
	/**
	 * PUB0: 备用字段1
	 */
	public String getPub0() {
		return this.pub0;
	}
	
	/**
	 * PUB0: 备用字段1
	 */
	public void setPub0(String value)
	 {
		this.pub0 = value;
	}
	
	/**
	 * PUB1: 备用字段2
	 */
	public String getPub1() {
		return this.pub1;
	}
	
	/**
	 * PUB1: 备用字段2
	 */
	public void setPub1(String value)
	 {
		this.pub1 = value;
	}
	
	/**
	 * PUB2: 备用字段3
	 */
	public String getPub2() {
		return this.pub2;
	}
	
	/**
	 * PUB2: 备用字段3
	 */
	public void setPub2(String value)
	 {
		this.pub2 = value;
	}
	
	/**
	 * PUB3: 备用字段4
	 */
	public String getPub3() {
		return this.pub3;
	}
	
	/**
	 * PUB3: 备用字段4
	 */
	public void setPub3(String value)
	 {
		this.pub3 = value;
	}
	
	/**
	 * PUB4: 备用字段5
	 */
	public String getPub4() {
		return this.pub4;
	}
	
	/**
	 * PUB4: 备用字段5
	 */
	public void setPub4(String value)
	 {
		this.pub4 = value;
	}
	
	/**
	 * PUB5: 备用字段6
	 */
	public String getPub5() {
		return this.pub5;
	}
	
	/**
	 * PUB5: 备用字段6
	 */
	public void setPub5(String value)
	 {
		this.pub5 = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_CODE_BUILD].[BUILD_ID], [T_CODE_BUILD].[BUILD_NAME], [T_CODE_BUILD].[BUILD_DESC], [T_CODE_BUILD].[PARENT_BUILD_ID], [T_CODE_BUILD].[FUNC_PROJECTS], [T_CODE_BUILD].[PUB0], [T_CODE_BUILD].[PUB1], [T_CODE_BUILD].[PUB2], [T_CODE_BUILD].[PUB3], [T_CODE_BUILD].[PUB4], [T_CODE_BUILD].[PUB5]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_CODE_BUILD].[BUILD_ID], [T_CODE_BUILD].[BUILD_NAME], [T_CODE_BUILD].[BUILD_DESC], [T_CODE_BUILD].[PARENT_BUILD_ID], [T_CODE_BUILD].[FUNC_PROJECTS], [T_CODE_BUILD].[PUB0], [T_CODE_BUILD].[PUB1], [T_CODE_BUILD].[PUB2], [T_CODE_BUILD].[PUB3], [T_CODE_BUILD].[PUB4], [T_CODE_BUILD].[PUB5]   from [T_CODE_BUILD] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_CODE_BUILD].[BUILD_ID], [T_CODE_BUILD].[BUILD_NAME], [T_CODE_BUILD].[BUILD_DESC], [T_CODE_BUILD].[PARENT_BUILD_ID], [T_CODE_BUILD].[FUNC_PROJECTS], [T_CODE_BUILD].[PUB0], [T_CODE_BUILD].[PUB1], [T_CODE_BUILD].[PUB2], [T_CODE_BUILD].[PUB3], [T_CODE_BUILD].[PUB4], [T_CODE_BUILD].[PUB5] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_CODE_BUILD";
	}
	
	
	public String getTableName() {
		return "T_CODE_BUILD";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "BUILD_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.buildId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (CodeBuild.class.isInstance(obj)) {
			CodeBuild o = ((CodeBuild)(obj));
			this.buildId = o.buildId;
			this.buildName = o.buildName;
			this.buildDesc = o.buildDesc;
			this.parentBuildId = o.parentBuildId;
			this.funcProjects = o.funcProjects;
			this.pub0 = o.pub0;
			this.pub1 = o.pub1;
			this.pub2 = o.pub2;
			this.pub3 = o.pub3;
			this.pub4 = o.pub4;
			this.pub5 = o.pub5;
		}
	}
	
	/**
	 * 插入CodeBuild对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="codeBuild">需要插入的构建任务</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, CodeBuild codeBuild) throws SQLException, DbException {
		String sql = "insert into [T_CODE_BUILD](";
		if ((codeBuild.getBuildId() > 0)) {
			sql = (sql + "[BUILD_ID], ");
		}
		sql = (sql + "[BUILD_NAME]");
		sql = (sql + ", [BUILD_DESC]");
		sql = (sql + ", [PARENT_BUILD_ID]");
		sql = (sql + ", [FUNC_PROJECTS]");
		sql = (sql + ", [PUB0]");
		sql = (sql + ", [PUB1]");
		sql = (sql + ", [PUB2]");
		sql = (sql + ", [PUB3]");
		sql = (sql + ", [PUB4]");
		sql = (sql + ", [PUB5]");
		sql = (sql + ")values(");
		if ((codeBuild.getBuildId() > 0)) {
			sql = (sql + codeBuild.getBuildId());
			sql = (sql + ", ");
		}
		sql = (sql + SqlServerUtils.safeSql(codeBuild.getBuildName().toString()));
		sql = (sql + ", ");
		if ((codeBuild.buildDesc == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(codeBuild.getBuildDesc().toString()));
		}
		sql = (sql + ", ");
		sql = (sql + codeBuild.getParentBuildId());
		sql = (sql + ", ");
		if ((codeBuild.funcProjects == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(codeBuild.getFuncProjects().toString()));
		}
		sql = (sql + ", ");
		if ((codeBuild.pub0 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(codeBuild.getPub0().toString()));
		}
		sql = (sql + ", ");
		if ((codeBuild.pub1 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(codeBuild.getPub1().toString()));
		}
		sql = (sql + ", ");
		if ((codeBuild.pub2 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(codeBuild.getPub2().toString()));
		}
		sql = (sql + ", ");
		if ((codeBuild.pub3 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(codeBuild.getPub3().toString()));
		}
		sql = (sql + ", ");
		if ((codeBuild.pub4 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(codeBuild.getPub4().toString()));
		}
		sql = (sql + ", ");
		if ((codeBuild.pub5 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(codeBuild.getPub5().toString()));
		}
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((codeBuild.getBuildId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_CODE_BUILD] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_CODE_BUILD off");
			}
			dataVisit.execSql(sql);
			if ((codeBuild.getBuildId() == 0)) {
				codeBuild.buildId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入CodeBuild对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		CodeBuild.insert(dataVisit, this);
	}
	
	/**
	 * 更新CodeBuild对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="codeBuild">需要更新的构建任务</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, CodeBuild codeBuild, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_CODE_BUILD] set ";
		sql = (sql + "[BUILD_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(codeBuild.getBuildName().toString()));
		sql = (sql + ",");
		if ((codeBuild.buildDesc == null)) {
			sql = (sql + "[BUILD_DESC] = default ,");
		}
		else {
			sql = (sql + "[BUILD_DESC] = ");
			sql = (sql + SqlServerUtils.safeSql(codeBuild.getBuildDesc().toString()));
			sql = (sql + ",");
		}
		sql = (sql + "[PARENT_BUILD_ID] = ");
		sql = (sql + codeBuild.getParentBuildId());
		sql = (sql + ",");
		if ((codeBuild.funcProjects == null)) {
			sql = (sql + "[FUNC_PROJECTS] = default ,");
		}
		else {
			sql = (sql + "[FUNC_PROJECTS] = ");
			sql = (sql + SqlServerUtils.safeSql(codeBuild.getFuncProjects().toString()));
			sql = (sql + ",");
		}
		if ((codeBuild.pub0 == null)) {
			sql = (sql + "[PUB0] = default ,");
		}
		else {
			sql = (sql + "[PUB0] = ");
			sql = (sql + SqlServerUtils.safeSql(codeBuild.getPub0().toString()));
			sql = (sql + ",");
		}
		if ((codeBuild.pub1 == null)) {
			sql = (sql + "[PUB1] = default ,");
		}
		else {
			sql = (sql + "[PUB1] = ");
			sql = (sql + SqlServerUtils.safeSql(codeBuild.getPub1().toString()));
			sql = (sql + ",");
		}
		if ((codeBuild.pub2 == null)) {
			sql = (sql + "[PUB2] = default ,");
		}
		else {
			sql = (sql + "[PUB2] = ");
			sql = (sql + SqlServerUtils.safeSql(codeBuild.getPub2().toString()));
			sql = (sql + ",");
		}
		if ((codeBuild.pub3 == null)) {
			sql = (sql + "[PUB3] = default ,");
		}
		else {
			sql = (sql + "[PUB3] = ");
			sql = (sql + SqlServerUtils.safeSql(codeBuild.getPub3().toString()));
			sql = (sql + ",");
		}
		if ((codeBuild.pub4 == null)) {
			sql = (sql + "[PUB4] = default ,");
		}
		else {
			sql = (sql + "[PUB4] = ");
			sql = (sql + SqlServerUtils.safeSql(codeBuild.getPub4().toString()));
			sql = (sql + ",");
		}
		if ((codeBuild.pub5 == null)) {
			sql = (sql + "[PUB5] = default ,");
		}
		else {
			sql = (sql + "[PUB5] = ");
			sql = (sql + SqlServerUtils.safeSql(codeBuild.getPub5().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "BUILD_ID = ");
		sql = (sql + codeBuild.getBuildId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新CodeBuild对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="codeBuild">需要更新的构建任务</param>
	 */
	protected static int update(IDataVisit2 dataVisit, CodeBuild codeBuild) throws SQLException, DbException {
		return CodeBuild.update(dataVisit, codeBuild, "");
	}
	
	/**
	 * 更新CodeBuild对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return CodeBuild.update(dataVisit, this);
	}
	
	/**
	 * 更新CodeBuild对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return CodeBuild.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.buildName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<CodeBuild> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<CodeBuild> list = new ArrayList<CodeBuild>();
		try {
			for (; reader.next(); ) {
				CodeBuild obj = new CodeBuild();
				CodeBuild.readValue(reader, obj);
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
	public static List<CodeBuild> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<CodeBuild> list = new ArrayList<CodeBuild>();
		try {
			for (; reader.next(); ) {
				CodeBuild obj = new CodeBuild();
				CodeBuild.readValue(reader, obj);
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
	public static List<CodeBuild> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((CodeBuild.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<CodeBuild> list = new ArrayList<CodeBuild>();
		try {
			for (; reader.next(); ) {
				CodeBuild obj = new CodeBuild();
				CodeBuild.readValue(reader, obj);
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
	public static List<CodeBuild> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((CodeBuild.getFullSelectSql() + appendConditionSql));
		List<CodeBuild> list = new ArrayList<CodeBuild>();
		try {
			for (; reader.next(); ) {
				CodeBuild obj = new CodeBuild();
				CodeBuild.readValue(reader, obj);
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
	public static <T extends CodeBuild> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((CodeBuild.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			CodeBuild.readValue(reader, obj);
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
public static <T extends CodeBuild> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((CodeBuild.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			CodeBuild.readValue(reader, obj);
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
	String sql = "select * from T_CODE_BUILD ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据构建标识查询CodeBuild
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ABuildId">构建标识</param>
 */
public static CodeBuild selectByBuildId(IDataVisit2 dataVisit, int ABuildId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "BUILD_ID = ");
	sql = (sql + ABuildId);
	List<CodeBuild> list = CodeBuild.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个CodeBuild对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ABuildId">构建标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByBuildId(IDataVisit2 dataVisit, int ABuildId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_CODE_BUILD] where ");
	sql = (sql + "BUILD_ID = ");
	sql = (sql + ABuildId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个CodeBuild对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ABuildId">构建标识</param>
 */
public static void deleteByBuildId(IDataVisit2 dataVisit, int ABuildId) throws SQLException, DbException {
	CodeBuild.deleteByBuildId(dataVisit, ABuildId, "");
}

/**
 * 从reader读到数据到对象codeBuild中
 * <param name="reader">数据源</param>
 * <param name="codeBuild">目标对象</param>
 */
public static void readValue(ResultSet reader, CodeBuild codeBuild) throws SQLException, DbException {
	codeBuild.buildId = reader.getInt(1);
	codeBuild.buildName = reader.getString(2);
	codeBuild.buildDesc = reader.getString(3);
	if (reader.wasNull()) {
		codeBuild.buildDesc = null;
	}
	codeBuild.parentBuildId = reader.getInt(4);
	codeBuild.funcProjects = reader.getString(5);
	if (reader.wasNull()) {
		codeBuild.funcProjects = null;
	}
	codeBuild.pub0 = reader.getString(6);
	if (reader.wasNull()) {
		codeBuild.pub0 = null;
	}
	codeBuild.pub1 = reader.getString(7);
	if (reader.wasNull()) {
		codeBuild.pub1 = null;
	}
	codeBuild.pub2 = reader.getString(8);
	if (reader.wasNull()) {
		codeBuild.pub2 = null;
	}
	codeBuild.pub3 = reader.getString(9);
	if (reader.wasNull()) {
		codeBuild.pub3 = null;
	}
	codeBuild.pub4 = reader.getString(10);
	if (reader.wasNull()) {
		codeBuild.pub4 = null;
	}
	codeBuild.pub5 = reader.getString(11);
	if (reader.wasNull()) {
		codeBuild.pub5 = null;
	}
}
}
