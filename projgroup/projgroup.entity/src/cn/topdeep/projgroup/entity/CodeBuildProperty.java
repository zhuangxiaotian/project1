package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_CODE_BUILD_PROPERTY: 构建属性
 */
public class CodeBuildProperty extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * BUILD_PROPERTY_ID: 属性标识
	 */
	int buildPropertyId;
	
	/**
	 * BUILD_ID: 构建标识
	 */
	int buildId;
	
	/**
	 * BUILD_PROPERTY_NAME: 属性名称
	 */
	String buildPropertyName = "";
	
	/**
	 * BUILD_PROPERTY_VALUE: 属性值
	 */
	String buildPropertyValue;
	
	/**
	 * BUILD_PROPERTY_DESC: 属性描述
	 */
	String buildPropertyDesc;
	
	/**
	 * BUILD_PROPERTY_ID: 属性标识
	 */
	public int getBuildPropertyId() {
		return this.buildPropertyId;
	}
	
	/**
	 * BUILD_PROPERTY_ID: 属性标识
	 */
	public void setBuildPropertyId(int value)
	 {
		this.buildPropertyId = value;
	}
	
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
	 * BUILD_PROPERTY_NAME: 属性名称
	 */
	public String getBuildPropertyName() {
		return this.buildPropertyName;
	}
	
	/**
	 * BUILD_PROPERTY_NAME: 属性名称
	 */
	public void setBuildPropertyName(String value)
	 {
		this.buildPropertyName = value;
	}
	
	/**
	 * BUILD_PROPERTY_VALUE: 属性值
	 */
	public String getBuildPropertyValue() {
		return this.buildPropertyValue;
	}
	
	/**
	 * BUILD_PROPERTY_VALUE: 属性值
	 */
	public void setBuildPropertyValue(String value)
	 {
		this.buildPropertyValue = value;
	}
	
	/**
	 * BUILD_PROPERTY_DESC: 属性描述
	 */
	public String getBuildPropertyDesc() {
		return this.buildPropertyDesc;
	}
	
	/**
	 * BUILD_PROPERTY_DESC: 属性描述
	 */
	public void setBuildPropertyDesc(String value)
	 {
		this.buildPropertyDesc = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_CODE_BUILD_PROPERTY].[BUILD_PROPERTY_ID], [T_CODE_BUILD_PROPERTY].[BUI" +
"LD_ID], [T_CODE_BUILD_PROPERTY].[BUILD_PROPERTY_NAME], [T_CODE_BUILD_PROPERTY].[" +
"BUILD_PROPERTY_VALUE], [T_CODE_BUILD_PROPERTY].[BUILD_PROPERTY_DESC]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_CODE_BUILD_PROPERTY].[BUILD_PROPERTY_ID], [T_CODE_BUILD_PROPERTY].[BUILD_ID], [T_CODE_BUILD_PROPERTY].[BUILD_PROPERTY_NAME], [T_CODE_BUILD_PROPERTY].[BUILD_PROPERTY_VALUE], [T_CODE_BUILD_PROPERTY].[BUILD_PROPERTY_DESC]   from [T_CODE_BUILD_PROPERTY] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_CODE_BUILD_PROPERTY].[BUILD_PROPERTY_ID], [T_CODE_BUILD_PROPERTY].[BUILD_ID]," +
" [T_CODE_BUILD_PROPERTY].[BUILD_PROPERTY_NAME], [T_CODE_BUILD_PROPERTY].[BUILD_P" +
"ROPERTY_VALUE], [T_CODE_BUILD_PROPERTY].[BUILD_PROPERTY_DESC] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_CODE_BUILD_PROPERTY";
	}
	
	
	public String getTableName() {
		return "T_CODE_BUILD_PROPERTY";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "BUILD_PROPERTY_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.buildPropertyId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (CodeBuildProperty.class.isInstance(obj)) {
			CodeBuildProperty o = ((CodeBuildProperty)(obj));
			this.buildPropertyId = o.buildPropertyId;
			this.buildId = o.buildId;
			this.buildPropertyName = o.buildPropertyName;
			this.buildPropertyValue = o.buildPropertyValue;
			this.buildPropertyDesc = o.buildPropertyDesc;
		}
	}
	
	/**
	 * 插入CodeBuildProperty对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="codeBuildProperty">需要插入的构建属性</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, CodeBuildProperty codeBuildProperty) throws SQLException, DbException {
		String sql = "insert into [T_CODE_BUILD_PROPERTY](";
		if ((codeBuildProperty.getBuildPropertyId() > 0)) {
			sql = (sql + "[BUILD_PROPERTY_ID], ");
		}
		sql = (sql + "[BUILD_ID]");
		sql = (sql + ", [BUILD_PROPERTY_NAME]");
		sql = (sql + ", [BUILD_PROPERTY_VALUE]");
		sql = (sql + ", [BUILD_PROPERTY_DESC]");
		sql = (sql + ")values(");
		if ((codeBuildProperty.getBuildPropertyId() > 0)) {
			sql = (sql + codeBuildProperty.getBuildPropertyId());
			sql = (sql + ", ");
		}
		sql = (sql + codeBuildProperty.getBuildId());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(codeBuildProperty.getBuildPropertyName().toString()));
		sql = (sql + ", ");
		if ((codeBuildProperty.buildPropertyValue == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(codeBuildProperty.getBuildPropertyValue().toString()));
		}
		sql = (sql + ", ");
		if ((codeBuildProperty.buildPropertyDesc == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(codeBuildProperty.getBuildPropertyDesc().toString()));
		}
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((codeBuildProperty.getBuildPropertyId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_CODE_BUILD_PROPERTY] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_CODE_BUILD_PROPERTY off");
			}
			dataVisit.execSql(sql);
			if ((codeBuildProperty.getBuildPropertyId() == 0)) {
				codeBuildProperty.buildPropertyId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入CodeBuildProperty对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		CodeBuildProperty.insert(dataVisit, this);
	}
	
	/**
	 * 更新CodeBuildProperty对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="codeBuildProperty">需要更新的构建属性</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, CodeBuildProperty codeBuildProperty, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_CODE_BUILD_PROPERTY] set ";
		sql = (sql + "[BUILD_ID] = ");
		sql = (sql + codeBuildProperty.getBuildId());
		sql = (sql + ",");
		sql = (sql + "[BUILD_PROPERTY_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(codeBuildProperty.getBuildPropertyName().toString()));
		sql = (sql + ",");
		if ((codeBuildProperty.buildPropertyValue == null)) {
			sql = (sql + "[BUILD_PROPERTY_VALUE] = default ,");
		}
		else {
			sql = (sql + "[BUILD_PROPERTY_VALUE] = ");
			sql = (sql + SqlServerUtils.safeSql(codeBuildProperty.getBuildPropertyValue().toString()));
			sql = (sql + ",");
		}
		if ((codeBuildProperty.buildPropertyDesc == null)) {
			sql = (sql + "[BUILD_PROPERTY_DESC] = default ,");
		}
		else {
			sql = (sql + "[BUILD_PROPERTY_DESC] = ");
			sql = (sql + SqlServerUtils.safeSql(codeBuildProperty.getBuildPropertyDesc().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "BUILD_PROPERTY_ID = ");
		sql = (sql + codeBuildProperty.getBuildPropertyId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新CodeBuildProperty对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="codeBuildProperty">需要更新的构建属性</param>
	 */
	protected static int update(IDataVisit2 dataVisit, CodeBuildProperty codeBuildProperty) throws SQLException, DbException {
		return CodeBuildProperty.update(dataVisit, codeBuildProperty, "");
	}
	
	/**
	 * 更新CodeBuildProperty对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return CodeBuildProperty.update(dataVisit, this);
	}
	
	/**
	 * 更新CodeBuildProperty对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return CodeBuildProperty.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.buildPropertyName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<CodeBuildProperty> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<CodeBuildProperty> list = new ArrayList<CodeBuildProperty>();
		try {
			for (; reader.next(); ) {
				CodeBuildProperty obj = new CodeBuildProperty();
				CodeBuildProperty.readValue(reader, obj);
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
	public static List<CodeBuildProperty> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<CodeBuildProperty> list = new ArrayList<CodeBuildProperty>();
		try {
			for (; reader.next(); ) {
				CodeBuildProperty obj = new CodeBuildProperty();
				CodeBuildProperty.readValue(reader, obj);
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
	public static List<CodeBuildProperty> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((CodeBuildProperty.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<CodeBuildProperty> list = new ArrayList<CodeBuildProperty>();
		try {
			for (; reader.next(); ) {
				CodeBuildProperty obj = new CodeBuildProperty();
				CodeBuildProperty.readValue(reader, obj);
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
	public static List<CodeBuildProperty> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((CodeBuildProperty.getFullSelectSql() + appendConditionSql));
		List<CodeBuildProperty> list = new ArrayList<CodeBuildProperty>();
		try {
			for (; reader.next(); ) {
				CodeBuildProperty obj = new CodeBuildProperty();
				CodeBuildProperty.readValue(reader, obj);
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
	public static <T extends CodeBuildProperty> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((CodeBuildProperty.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			CodeBuildProperty.readValue(reader, obj);
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
public static <T extends CodeBuildProperty> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((CodeBuildProperty.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			CodeBuildProperty.readValue(reader, obj);
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
	String sql = "select * from T_CODE_BUILD_PROPERTY ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据属性标识查询CodeBuildProperty
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ABuildPropertyId">属性标识</param>
 */
public static CodeBuildProperty selectByBuildPropertyId(IDataVisit2 dataVisit, int ABuildPropertyId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "BUILD_PROPERTY_ID = ");
	sql = (sql + ABuildPropertyId);
	List<CodeBuildProperty> list = CodeBuildProperty.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个CodeBuildProperty对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ABuildPropertyId">属性标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByBuildPropertyId(IDataVisit2 dataVisit, int ABuildPropertyId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_CODE_BUILD_PROPERTY] where ");
	sql = (sql + "BUILD_PROPERTY_ID = ");
	sql = (sql + ABuildPropertyId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个CodeBuildProperty对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ABuildPropertyId">属性标识</param>
 */
public static void deleteByBuildPropertyId(IDataVisit2 dataVisit, int ABuildPropertyId) throws SQLException, DbException {
	CodeBuildProperty.deleteByBuildPropertyId(dataVisit, ABuildPropertyId, "");
}

/**
 * 根据外键构建标识删除一批CodeBuildProperty对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="BuildId">构建标识</param>
 */
public static void deleteListByBuildId(IDataVisit2 dataVisit, int ABuildId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_CODE_BUILD_PROPERTY] where ");
	sql = (sql + "BUILD_ID = ");
	sql = (sql + ABuildId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="BuildId">构建标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<CodeBuildProperty> selectObjectsByBuildId(IDataVisit2 dataVisit, int ABuildId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where BUILD_ID = ";
	sql = (sql + ABuildId);
	sql = (sql + appendConditionSql);
	return CodeBuildProperty.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="BuildId">构建标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<CodeBuildProperty> selectObjectsByBuildId(IDataVisit2 dataVisit, int ABuildId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where BUILD_ID = ";
	sql = (sql + ABuildId);
	return CodeBuildProperty.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="BuildId">构建标识</param>
 */
public static List<CodeBuildProperty> selectObjectsByBuildId(IDataVisit2 dataVisit, int ABuildId) throws SQLException, DbException {
	String sql = " where BUILD_ID = ";
	sql = (sql + ABuildId);
	return CodeBuildProperty.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象codeBuildProperty中
 * <param name="reader">数据源</param>
 * <param name="codeBuildProperty">目标对象</param>
 */
public static void readValue(ResultSet reader, CodeBuildProperty codeBuildProperty) throws SQLException, DbException {
	codeBuildProperty.buildPropertyId = reader.getInt(1);
	codeBuildProperty.buildId = reader.getInt(2);
	codeBuildProperty.buildPropertyName = reader.getString(3);
	codeBuildProperty.buildPropertyValue = reader.getString(4);
	if (reader.wasNull()) {
		codeBuildProperty.buildPropertyValue = null;
	}
	codeBuildProperty.buildPropertyDesc = reader.getString(5);
	if (reader.wasNull()) {
		codeBuildProperty.buildPropertyDesc = null;
	}
}
}
