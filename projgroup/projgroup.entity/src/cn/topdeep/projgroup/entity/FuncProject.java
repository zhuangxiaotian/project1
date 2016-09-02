package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_FUNC_PROJECT: 函数项目
 */
public class FuncProject extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * FUNC_PROJECT_ID: 函数项目标识
	 */
	int funcProjectId;
	
	/**
	 * FUNC_PROJECT_NAME: 函数项目名称
	 */
	String funcProjectName = "";
	
	/**
	 * FUNC_PROJECT_DESC: 函数面目描述
	 */
	String funcProjectDesc;
	
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
	 * FUNC_PROJECT_ID: 函数项目标识
	 */
	public int getFuncProjectId() {
		return this.funcProjectId;
	}
	
	/**
	 * FUNC_PROJECT_ID: 函数项目标识
	 */
	public void setFuncProjectId(int value)
	 {
		this.funcProjectId = value;
	}
	
	/**
	 * FUNC_PROJECT_NAME: 函数项目名称
	 */
	public String getFuncProjectName() {
		return this.funcProjectName;
	}
	
	/**
	 * FUNC_PROJECT_NAME: 函数项目名称
	 */
	public void setFuncProjectName(String value)
	 {
		this.funcProjectName = value;
	}
	
	/**
	 * FUNC_PROJECT_DESC: 函数面目描述
	 */
	public String getFuncProjectDesc() {
		return this.funcProjectDesc;
	}
	
	/**
	 * FUNC_PROJECT_DESC: 函数面目描述
	 */
	public void setFuncProjectDesc(String value)
	 {
		this.funcProjectDesc = value;
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
		return "select  [T_FUNC_PROJECT].[FUNC_PROJECT_ID], [T_FUNC_PROJECT].[FUNC_PROJECT_NAME], [T_FUNC_PROJECT].[FUNC_PROJECT_DESC], [T_FUNC_PROJECT].[PUB0], [T_FUNC_PROJECT].[PUB1], [T_FUNC_PROJECT].[PUB2], [T_FUNC_PROJECT].[PUB3], [T_FUNC_PROJECT].[PUB4], [T_FUNC_PROJECT].[PUB5]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_FUNC_PROJECT].[FUNC_PROJECT_ID], [T_FUNC_PROJECT].[FUNC_PROJECT_NAME], [T_FUNC_PROJECT].[FUNC_PROJECT_DESC], [T_FUNC_PROJECT].[PUB0], [T_FUNC_PROJECT].[PUB1], [T_FUNC_PROJECT].[PUB2], [T_FUNC_PROJECT].[PUB3], [T_FUNC_PROJECT].[PUB4], [T_FUNC_PROJECT].[PUB5]   from [T_FUNC_PROJECT] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_FUNC_PROJECT].[FUNC_PROJECT_ID], [T_FUNC_PROJECT].[FUNC_PROJECT_NAME], [T_FUNC_PROJECT].[FUNC_PROJECT_DESC], [T_FUNC_PROJECT].[PUB0], [T_FUNC_PROJECT].[PUB1], [T_FUNC_PROJECT].[PUB2], [T_FUNC_PROJECT].[PUB3], [T_FUNC_PROJECT].[PUB4], [T_FUNC_PROJECT].[PUB5] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_FUNC_PROJECT";
	}
	
	
	public String getTableName() {
		return "T_FUNC_PROJECT";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "FUNC_PROJECT_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.funcProjectId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (FuncProject.class.isInstance(obj)) {
			FuncProject o = ((FuncProject)(obj));
			this.funcProjectId = o.funcProjectId;
			this.funcProjectName = o.funcProjectName;
			this.funcProjectDesc = o.funcProjectDesc;
			this.pub0 = o.pub0;
			this.pub1 = o.pub1;
			this.pub2 = o.pub2;
			this.pub3 = o.pub3;
			this.pub4 = o.pub4;
			this.pub5 = o.pub5;
		}
	}
	
	/**
	 * 插入FuncProject对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="funcProject">需要插入的函数项目</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, FuncProject funcProject) throws SQLException, DbException {
		String sql = "insert into [T_FUNC_PROJECT](";
		if ((funcProject.getFuncProjectId() > 0)) {
			sql = (sql + "[FUNC_PROJECT_ID], ");
		}
		sql = (sql + "[FUNC_PROJECT_NAME]");
		sql = (sql + ", [FUNC_PROJECT_DESC]");
		sql = (sql + ", [PUB0]");
		sql = (sql + ", [PUB1]");
		sql = (sql + ", [PUB2]");
		sql = (sql + ", [PUB3]");
		sql = (sql + ", [PUB4]");
		sql = (sql + ", [PUB5]");
		sql = (sql + ")values(");
		if ((funcProject.getFuncProjectId() > 0)) {
			sql = (sql + funcProject.getFuncProjectId());
			sql = (sql + ", ");
		}
		sql = (sql + SqlServerUtils.safeSql(funcProject.getFuncProjectName().toString()));
		sql = (sql + ", ");
		if ((funcProject.funcProjectDesc == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcProject.getFuncProjectDesc().toString()));
		}
		sql = (sql + ", ");
		if ((funcProject.pub0 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcProject.getPub0().toString()));
		}
		sql = (sql + ", ");
		if ((funcProject.pub1 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcProject.getPub1().toString()));
		}
		sql = (sql + ", ");
		if ((funcProject.pub2 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcProject.getPub2().toString()));
		}
		sql = (sql + ", ");
		if ((funcProject.pub3 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcProject.getPub3().toString()));
		}
		sql = (sql + ", ");
		if ((funcProject.pub4 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcProject.getPub4().toString()));
		}
		sql = (sql + ", ");
		if ((funcProject.pub5 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcProject.getPub5().toString()));
		}
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((funcProject.getFuncProjectId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_FUNC_PROJECT] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_FUNC_PROJECT off");
			}
			dataVisit.execSql(sql);
			if ((funcProject.getFuncProjectId() == 0)) {
				funcProject.funcProjectId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入FuncProject对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		FuncProject.insert(dataVisit, this);
	}
	
	/**
	 * 更新FuncProject对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="funcProject">需要更新的函数项目</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, FuncProject funcProject, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_FUNC_PROJECT] set ";
		sql = (sql + "[FUNC_PROJECT_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(funcProject.getFuncProjectName().toString()));
		sql = (sql + ",");
		if ((funcProject.funcProjectDesc == null)) {
			sql = (sql + "[FUNC_PROJECT_DESC] = default ,");
		}
		else {
			sql = (sql + "[FUNC_PROJECT_DESC] = ");
			sql = (sql + SqlServerUtils.safeSql(funcProject.getFuncProjectDesc().toString()));
			sql = (sql + ",");
		}
		if ((funcProject.pub0 == null)) {
			sql = (sql + "[PUB0] = default ,");
		}
		else {
			sql = (sql + "[PUB0] = ");
			sql = (sql + SqlServerUtils.safeSql(funcProject.getPub0().toString()));
			sql = (sql + ",");
		}
		if ((funcProject.pub1 == null)) {
			sql = (sql + "[PUB1] = default ,");
		}
		else {
			sql = (sql + "[PUB1] = ");
			sql = (sql + SqlServerUtils.safeSql(funcProject.getPub1().toString()));
			sql = (sql + ",");
		}
		if ((funcProject.pub2 == null)) {
			sql = (sql + "[PUB2] = default ,");
		}
		else {
			sql = (sql + "[PUB2] = ");
			sql = (sql + SqlServerUtils.safeSql(funcProject.getPub2().toString()));
			sql = (sql + ",");
		}
		if ((funcProject.pub3 == null)) {
			sql = (sql + "[PUB3] = default ,");
		}
		else {
			sql = (sql + "[PUB3] = ");
			sql = (sql + SqlServerUtils.safeSql(funcProject.getPub3().toString()));
			sql = (sql + ",");
		}
		if ((funcProject.pub4 == null)) {
			sql = (sql + "[PUB4] = default ,");
		}
		else {
			sql = (sql + "[PUB4] = ");
			sql = (sql + SqlServerUtils.safeSql(funcProject.getPub4().toString()));
			sql = (sql + ",");
		}
		if ((funcProject.pub5 == null)) {
			sql = (sql + "[PUB5] = default ,");
		}
		else {
			sql = (sql + "[PUB5] = ");
			sql = (sql + SqlServerUtils.safeSql(funcProject.getPub5().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "FUNC_PROJECT_ID = ");
		sql = (sql + funcProject.getFuncProjectId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新FuncProject对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="funcProject">需要更新的函数项目</param>
	 */
	protected static int update(IDataVisit2 dataVisit, FuncProject funcProject) throws SQLException, DbException {
		return FuncProject.update(dataVisit, funcProject, "");
	}
	
	/**
	 * 更新FuncProject对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return FuncProject.update(dataVisit, this);
	}
	
	/**
	 * 更新FuncProject对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return FuncProject.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.funcProjectName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<FuncProject> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<FuncProject> list = new ArrayList<FuncProject>();
		try {
			for (; reader.next(); ) {
				FuncProject obj = new FuncProject();
				FuncProject.readValue(reader, obj);
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
	public static List<FuncProject> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<FuncProject> list = new ArrayList<FuncProject>();
		try {
			for (; reader.next(); ) {
				FuncProject obj = new FuncProject();
				FuncProject.readValue(reader, obj);
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
	public static List<FuncProject> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((FuncProject.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<FuncProject> list = new ArrayList<FuncProject>();
		try {
			for (; reader.next(); ) {
				FuncProject obj = new FuncProject();
				FuncProject.readValue(reader, obj);
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
	public static List<FuncProject> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((FuncProject.getFullSelectSql() + appendConditionSql));
		List<FuncProject> list = new ArrayList<FuncProject>();
		try {
			for (; reader.next(); ) {
				FuncProject obj = new FuncProject();
				FuncProject.readValue(reader, obj);
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
	public static <T extends FuncProject> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((FuncProject.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			FuncProject.readValue(reader, obj);
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
public static <T extends FuncProject> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((FuncProject.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			FuncProject.readValue(reader, obj);
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
	String sql = "select * from T_FUNC_PROJECT ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据函数项目标识查询FuncProject
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AFuncProjectId">函数项目标识</param>
 */
public static FuncProject selectByFuncProjectId(IDataVisit2 dataVisit, int AFuncProjectId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "FUNC_PROJECT_ID = ");
	sql = (sql + AFuncProjectId);
	List<FuncProject> list = FuncProject.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个FuncProject对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AFuncProjectId">函数项目标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByFuncProjectId(IDataVisit2 dataVisit, int AFuncProjectId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_FUNC_PROJECT] where ");
	sql = (sql + "FUNC_PROJECT_ID = ");
	sql = (sql + AFuncProjectId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个FuncProject对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AFuncProjectId">函数项目标识</param>
 */
public static void deleteByFuncProjectId(IDataVisit2 dataVisit, int AFuncProjectId) throws SQLException, DbException {
	FuncProject.deleteByFuncProjectId(dataVisit, AFuncProjectId, "");
}

/**
 * 从reader读到数据到对象funcProject中
 * <param name="reader">数据源</param>
 * <param name="funcProject">目标对象</param>
 */
public static void readValue(ResultSet reader, FuncProject funcProject) throws SQLException, DbException {
	funcProject.funcProjectId = reader.getInt(1);
	funcProject.funcProjectName = reader.getString(2);
	funcProject.funcProjectDesc = reader.getString(3);
	if (reader.wasNull()) {
		funcProject.funcProjectDesc = null;
	}
	funcProject.pub0 = reader.getString(4);
	if (reader.wasNull()) {
		funcProject.pub0 = null;
	}
	funcProject.pub1 = reader.getString(5);
	if (reader.wasNull()) {
		funcProject.pub1 = null;
	}
	funcProject.pub2 = reader.getString(6);
	if (reader.wasNull()) {
		funcProject.pub2 = null;
	}
	funcProject.pub3 = reader.getString(7);
	if (reader.wasNull()) {
		funcProject.pub3 = null;
	}
	funcProject.pub4 = reader.getString(8);
	if (reader.wasNull()) {
		funcProject.pub4 = null;
	}
	funcProject.pub5 = reader.getString(9);
	if (reader.wasNull()) {
		funcProject.pub5 = null;
	}
}
}
