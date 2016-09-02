package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_FUNC_TEST: 函数测试
 */
public class FuncTest extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * BUILD_ID: 构建标识
	 */
	int buildId;
	
	/**
	 * PARAM_ID: 参数标识
	 */
	int paramId;
	
	/**
	 * TEST_VALUE: 测试值
	 */
	String testValue;
	
	/**
	 * TEST_VALUE_DESC: 测试值的说明
	 */
	String testValueDesc;
	
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
	 * PARAM_ID: 参数标识
	 */
	public int getParamId() {
		return this.paramId;
	}
	
	/**
	 * PARAM_ID: 参数标识
	 */
	public void setParamId(int value)
	 {
		this.paramId = value;
	}
	
	/**
	 * TEST_VALUE: 测试值
	 */
	public String getTestValue() {
		return this.testValue;
	}
	
	/**
	 * TEST_VALUE: 测试值
	 */
	public void setTestValue(String value)
	 {
		this.testValue = value;
	}
	
	/**
	 * TEST_VALUE_DESC: 测试值的说明
	 */
	public String getTestValueDesc() {
		return this.testValueDesc;
	}
	
	/**
	 * TEST_VALUE_DESC: 测试值的说明
	 */
	public void setTestValueDesc(String value)
	 {
		this.testValueDesc = value;
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
		return "select  [T_FUNC_TEST].[BUILD_ID], [T_FUNC_TEST].[PARAM_ID], [T_FUNC_TEST].[TEST_V" +
"ALUE], [T_FUNC_TEST].[TEST_VALUE_DESC], [T_FUNC_TEST].[PUB0], [T_FUNC_TEST].[PUB" +
"1], [T_FUNC_TEST].[PUB2], [T_FUNC_TEST].[PUB3], [T_FUNC_TEST].[PUB4], [T_FUNC_TE" +
"ST].[PUB5]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_FUNC_TEST].[BUILD_ID], [T_FUNC_TEST].[PARAM_ID], [T_FUNC_TEST].[TEST_VALUE], [T_FUNC_TEST].[TEST_VALUE_DESC], [T_FUNC_TEST].[PUB0], [T_FUNC_TEST].[PUB1], [T_FUNC_TEST].[PUB2], [T_FUNC_TEST].[PUB3], [T_FUNC_TEST].[PUB4], [T_FUNC_TEST].[PUB5]   from [T_FUNC_TEST] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_FUNC_TEST].[BUILD_ID], [T_FUNC_TEST].[PARAM_ID], [T_FUNC_TEST].[TEST_VALUE], " +
"[T_FUNC_TEST].[TEST_VALUE_DESC], [T_FUNC_TEST].[PUB0], [T_FUNC_TEST].[PUB1], [T_" +
"FUNC_TEST].[PUB2], [T_FUNC_TEST].[PUB3], [T_FUNC_TEST].[PUB4], [T_FUNC_TEST].[PU" +
"B5] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_FUNC_TEST";
	}
	
	
	public String getTableName() {
		return "T_FUNC_TEST";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "BUILD_ID,PARAM_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.buildId);
		kvalue = (kvalue + ",");
		kvalue = (kvalue + this.paramId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (FuncTest.class.isInstance(obj)) {
			FuncTest o = ((FuncTest)(obj));
			this.buildId = o.buildId;
			this.paramId = o.paramId;
			this.testValue = o.testValue;
			this.testValueDesc = o.testValueDesc;
			this.pub0 = o.pub0;
			this.pub1 = o.pub1;
			this.pub2 = o.pub2;
			this.pub3 = o.pub3;
			this.pub4 = o.pub4;
			this.pub5 = o.pub5;
		}
	}
	
	/**
	 * 插入FuncTest对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="funcTest">需要插入的函数测试</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, FuncTest funcTest) throws SQLException, DbException {
		String sql = "insert into [T_FUNC_TEST](";
		sql = (sql + "[BUILD_ID]");
		sql = (sql + ", [PARAM_ID]");
		sql = (sql + ", [TEST_VALUE]");
		sql = (sql + ", [TEST_VALUE_DESC]");
		sql = (sql + ", [PUB0]");
		sql = (sql + ", [PUB1]");
		sql = (sql + ", [PUB2]");
		sql = (sql + ", [PUB3]");
		sql = (sql + ", [PUB4]");
		sql = (sql + ", [PUB5]");
		sql = (sql + ")values(");
		sql = (sql + funcTest.getBuildId());
		sql = (sql + ", ");
		sql = (sql + funcTest.getParamId());
		sql = (sql + ", ");
		if ((funcTest.testValue == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcTest.getTestValue().toString()));
		}
		sql = (sql + ", ");
		if ((funcTest.testValueDesc == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcTest.getTestValueDesc().toString()));
		}
		sql = (sql + ", ");
		if ((funcTest.pub0 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcTest.getPub0().toString()));
		}
		sql = (sql + ", ");
		if ((funcTest.pub1 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcTest.getPub1().toString()));
		}
		sql = (sql + ", ");
		if ((funcTest.pub2 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcTest.getPub2().toString()));
		}
		sql = (sql + ", ");
		if ((funcTest.pub3 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcTest.getPub3().toString()));
		}
		sql = (sql + ", ");
		if ((funcTest.pub4 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcTest.getPub4().toString()));
		}
		sql = (sql + ", ");
		if ((funcTest.pub5 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcTest.getPub5().toString()));
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入FuncTest对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		FuncTest.insert(dataVisit, this);
	}
	
	/**
	 * 更新FuncTest对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="funcTest">需要更新的函数测试</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, FuncTest funcTest, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_FUNC_TEST] set ";
		if ((funcTest.testValue == null)) {
			sql = (sql + "[TEST_VALUE] = default ,");
		}
		else {
			sql = (sql + "[TEST_VALUE] = ");
			sql = (sql + SqlServerUtils.safeSql(funcTest.getTestValue().toString()));
			sql = (sql + ",");
		}
		if ((funcTest.testValueDesc == null)) {
			sql = (sql + "[TEST_VALUE_DESC] = default ,");
		}
		else {
			sql = (sql + "[TEST_VALUE_DESC] = ");
			sql = (sql + SqlServerUtils.safeSql(funcTest.getTestValueDesc().toString()));
			sql = (sql + ",");
		}
		if ((funcTest.pub0 == null)) {
			sql = (sql + "[PUB0] = default ,");
		}
		else {
			sql = (sql + "[PUB0] = ");
			sql = (sql + SqlServerUtils.safeSql(funcTest.getPub0().toString()));
			sql = (sql + ",");
		}
		if ((funcTest.pub1 == null)) {
			sql = (sql + "[PUB1] = default ,");
		}
		else {
			sql = (sql + "[PUB1] = ");
			sql = (sql + SqlServerUtils.safeSql(funcTest.getPub1().toString()));
			sql = (sql + ",");
		}
		if ((funcTest.pub2 == null)) {
			sql = (sql + "[PUB2] = default ,");
		}
		else {
			sql = (sql + "[PUB2] = ");
			sql = (sql + SqlServerUtils.safeSql(funcTest.getPub2().toString()));
			sql = (sql + ",");
		}
		if ((funcTest.pub3 == null)) {
			sql = (sql + "[PUB3] = default ,");
		}
		else {
			sql = (sql + "[PUB3] = ");
			sql = (sql + SqlServerUtils.safeSql(funcTest.getPub3().toString()));
			sql = (sql + ",");
		}
		if ((funcTest.pub4 == null)) {
			sql = (sql + "[PUB4] = default ,");
		}
		else {
			sql = (sql + "[PUB4] = ");
			sql = (sql + SqlServerUtils.safeSql(funcTest.getPub4().toString()));
			sql = (sql + ",");
		}
		if ((funcTest.pub5 == null)) {
			sql = (sql + "[PUB5] = default ,");
		}
		else {
			sql = (sql + "[PUB5] = ");
			sql = (sql + SqlServerUtils.safeSql(funcTest.getPub5().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "BUILD_ID = ");
		sql = (sql + funcTest.getBuildId());
		sql = (sql + " and ");
		sql = (sql + "PARAM_ID = ");
		sql = (sql + funcTest.getParamId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新FuncTest对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="funcTest">需要更新的函数测试</param>
	 */
	protected static int update(IDataVisit2 dataVisit, FuncTest funcTest) throws SQLException, DbException {
		return FuncTest.update(dataVisit, funcTest, "");
	}
	
	/**
	 * 更新FuncTest对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return FuncTest.update(dataVisit, this);
	}
	
	/**
	 * 更新FuncTest对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return FuncTest.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<FuncTest> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<FuncTest> list = new ArrayList<FuncTest>();
		try {
			for (; reader.next(); ) {
				FuncTest obj = new FuncTest();
				FuncTest.readValue(reader, obj);
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
	public static List<FuncTest> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<FuncTest> list = new ArrayList<FuncTest>();
		try {
			for (; reader.next(); ) {
				FuncTest obj = new FuncTest();
				FuncTest.readValue(reader, obj);
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
	public static List<FuncTest> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((FuncTest.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<FuncTest> list = new ArrayList<FuncTest>();
		try {
			for (; reader.next(); ) {
				FuncTest obj = new FuncTest();
				FuncTest.readValue(reader, obj);
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
	public static List<FuncTest> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((FuncTest.getFullSelectSql() + appendConditionSql));
		List<FuncTest> list = new ArrayList<FuncTest>();
		try {
			for (; reader.next(); ) {
				FuncTest obj = new FuncTest();
				FuncTest.readValue(reader, obj);
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
	public static <T extends FuncTest> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((FuncTest.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			FuncTest.readValue(reader, obj);
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
public static <T extends FuncTest> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((FuncTest.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			FuncTest.readValue(reader, obj);
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
	String sql = "select * from T_FUNC_TEST ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据构建标识,参数标识查询FuncTest
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ABuildId">构建标识</param>
 * <param name="AParamId">参数标识</param>
 */
public static FuncTest selectByBuildIdParamId(IDataVisit2 dataVisit, int ABuildId, int AParamId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "BUILD_ID = ");
	sql = (sql + ABuildId);
	sql = (sql + " and ");
	sql = (sql + "PARAM_ID = ");
	sql = (sql + AParamId);
	List<FuncTest> list = FuncTest.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个FuncTest对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ABuildId">构建标识</param>
 * <param name="AParamId">参数标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByBuildIdParamId(IDataVisit2 dataVisit, int ABuildId, int AParamId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_FUNC_TEST] where ");
	sql = (sql + "BUILD_ID = ");
	sql = (sql + ABuildId);
	sql = (sql + " and ");
	sql = (sql + "PARAM_ID = ");
	sql = (sql + AParamId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个FuncTest对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ABuildId">构建标识</param>
 * <param name="AParamId">参数标识</param>
 */
public static void deleteByBuildIdParamId(IDataVisit2 dataVisit, int ABuildId, int AParamId) throws SQLException, DbException {
	FuncTest.deleteByBuildIdParamId(dataVisit, ABuildId, AParamId, "");
}

/**
 * 根据外键构建标识删除一批FuncTest对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="BuildId">构建标识</param>
 */
public static void deleteListByBuildId(IDataVisit2 dataVisit, int ABuildId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_FUNC_TEST] where ");
	sql = (sql + "BUILD_ID = ");
	sql = (sql + ABuildId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键参数标识删除一批FuncTest对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ParamId">参数标识</param>
 */
public static void deleteListByParamId(IDataVisit2 dataVisit, int AParamId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_FUNC_TEST] where ");
	sql = (sql + "PARAM_ID = ");
	sql = (sql + AParamId);
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
public static List<FuncTest> selectObjectsByBuildId(IDataVisit2 dataVisit, int ABuildId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where BUILD_ID = ";
	sql = (sql + ABuildId);
	sql = (sql + appendConditionSql);
	return FuncTest.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
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
public static List<FuncTest> selectObjectsByBuildId(IDataVisit2 dataVisit, int ABuildId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where BUILD_ID = ";
	sql = (sql + ABuildId);
	return FuncTest.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="BuildId">构建标识</param>
 */
public static List<FuncTest> selectObjectsByBuildId(IDataVisit2 dataVisit, int ABuildId) throws SQLException, DbException {
	String sql = " where BUILD_ID = ";
	sql = (sql + ABuildId);
	return FuncTest.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ParamId">参数标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<FuncTest> selectObjectsByParamId(IDataVisit2 dataVisit, int AParamId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PARAM_ID = ";
	sql = (sql + AParamId);
	sql = (sql + appendConditionSql);
	return FuncTest.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ParamId">参数标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<FuncTest> selectObjectsByParamId(IDataVisit2 dataVisit, int AParamId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PARAM_ID = ";
	sql = (sql + AParamId);
	return FuncTest.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ParamId">参数标识</param>
 */
public static List<FuncTest> selectObjectsByParamId(IDataVisit2 dataVisit, int AParamId) throws SQLException, DbException {
	String sql = " where PARAM_ID = ";
	sql = (sql + AParamId);
	return FuncTest.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象funcTest中
 * <param name="reader">数据源</param>
 * <param name="funcTest">目标对象</param>
 */
public static void readValue(ResultSet reader, FuncTest funcTest) throws SQLException, DbException {
	funcTest.buildId = reader.getInt(1);
	funcTest.paramId = reader.getInt(2);
	funcTest.testValue = reader.getString(3);
	if (reader.wasNull()) {
		funcTest.testValue = null;
	}
	funcTest.testValueDesc = reader.getString(4);
	if (reader.wasNull()) {
		funcTest.testValueDesc = null;
	}
	funcTest.pub0 = reader.getString(5);
	if (reader.wasNull()) {
		funcTest.pub0 = null;
	}
	funcTest.pub1 = reader.getString(6);
	if (reader.wasNull()) {
		funcTest.pub1 = null;
	}
	funcTest.pub2 = reader.getString(7);
	if (reader.wasNull()) {
		funcTest.pub2 = null;
	}
	funcTest.pub3 = reader.getString(8);
	if (reader.wasNull()) {
		funcTest.pub3 = null;
	}
	funcTest.pub4 = reader.getString(9);
	if (reader.wasNull()) {
		funcTest.pub4 = null;
	}
	funcTest.pub5 = reader.getString(10);
	if (reader.wasNull()) {
		funcTest.pub5 = null;
	}
}
}
