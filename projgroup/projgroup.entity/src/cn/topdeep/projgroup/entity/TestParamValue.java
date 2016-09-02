package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_TEST_PARAM_VALUE: 函数测试参数表
 */
public class TestParamValue extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * TEST_PROCEDURE_ID: 测试过程标识
	 */
	int testProcedureId;
	
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
	 * TEST_PROCEDURE_ID: 测试过程标识
	 */
	public int getTestProcedureId() {
		return this.testProcedureId;
	}
	
	/**
	 * TEST_PROCEDURE_ID: 测试过程标识
	 */
	public void setTestProcedureId(int value)
	 {
		this.testProcedureId = value;
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
		return "select  [T_TEST_PARAM_VALUE].[TEST_PROCEDURE_ID], [T_TEST_PARAM_VALUE].[PARAM_ID], [T_TEST_PARAM_VALUE].[TEST_VALUE], [T_TEST_PARAM_VALUE].[TEST_VALUE_DESC], [T_TEST_PARAM_VALUE].[PUB0], [T_TEST_PARAM_VALUE].[PUB1], [T_TEST_PARAM_VALUE].[PUB2], [T_TEST_PARAM_VALUE].[PUB3], [T_TEST_PARAM_VALUE].[PUB4], [T_TEST_PARAM_VALUE].[PUB5]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_TEST_PARAM_VALUE].[TEST_PROCEDURE_ID], [T_TEST_PARAM_VALUE].[PARAM_ID], [T_TEST_PARAM_VALUE].[TEST_VALUE], [T_TEST_PARAM_VALUE].[TEST_VALUE_DESC], [T_TEST_PARAM_VALUE].[PUB0], [T_TEST_PARAM_VALUE].[PUB1], [T_TEST_PARAM_VALUE].[PUB2], [T_TEST_PARAM_VALUE].[PUB3], [T_TEST_PARAM_VALUE].[PUB4], [T_TEST_PARAM_VALUE].[PUB5]   from [T_TEST_PARAM_VALUE] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_TEST_PARAM_VALUE].[TEST_PROCEDURE_ID], [T_TEST_PARAM_VALUE].[PARAM_ID], [T_TEST_PARAM_VALUE].[TEST_VALUE], [T_TEST_PARAM_VALUE].[TEST_VALUE_DESC], [T_TEST_PARAM_VALUE].[PUB0], [T_TEST_PARAM_VALUE].[PUB1], [T_TEST_PARAM_VALUE].[PUB2], [T_TEST_PARAM_VALUE].[PUB3], [T_TEST_PARAM_VALUE].[PUB4], [T_TEST_PARAM_VALUE].[PUB5] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_TEST_PARAM_VALUE";
	}
	
	
	public String getTableName() {
		return "T_TEST_PARAM_VALUE";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "TEST_PROCEDURE_ID,PARAM_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.testProcedureId);
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
		if (TestParamValue.class.isInstance(obj)) {
			TestParamValue o = ((TestParamValue)(obj));
			this.testProcedureId = o.testProcedureId;
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
	 * 插入TestParamValue对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="testParamValue">需要插入的函数测试参数表</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, TestParamValue testParamValue) throws SQLException, DbException {
		String sql = "insert into [T_TEST_PARAM_VALUE](";
		sql = (sql + "[TEST_PROCEDURE_ID]");
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
		sql = (sql + testParamValue.getTestProcedureId());
		sql = (sql + ", ");
		sql = (sql + testParamValue.getParamId());
		sql = (sql + ", ");
		if ((testParamValue.testValue == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(testParamValue.getTestValue().toString()));
		}
		sql = (sql + ", ");
		if ((testParamValue.testValueDesc == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(testParamValue.getTestValueDesc().toString()));
		}
		sql = (sql + ", ");
		if ((testParamValue.pub0 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(testParamValue.getPub0().toString()));
		}
		sql = (sql + ", ");
		if ((testParamValue.pub1 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(testParamValue.getPub1().toString()));
		}
		sql = (sql + ", ");
		if ((testParamValue.pub2 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(testParamValue.getPub2().toString()));
		}
		sql = (sql + ", ");
		if ((testParamValue.pub3 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(testParamValue.getPub3().toString()));
		}
		sql = (sql + ", ");
		if ((testParamValue.pub4 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(testParamValue.getPub4().toString()));
		}
		sql = (sql + ", ");
		if ((testParamValue.pub5 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(testParamValue.getPub5().toString()));
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入TestParamValue对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		TestParamValue.insert(dataVisit, this);
	}
	
	/**
	 * 更新TestParamValue对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="testParamValue">需要更新的函数测试参数表</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, TestParamValue testParamValue, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_TEST_PARAM_VALUE] set ";
		if ((testParamValue.testValue == null)) {
			sql = (sql + "[TEST_VALUE] = default ,");
		}
		else {
			sql = (sql + "[TEST_VALUE] = ");
			sql = (sql + SqlServerUtils.safeSql(testParamValue.getTestValue().toString()));
			sql = (sql + ",");
		}
		if ((testParamValue.testValueDesc == null)) {
			sql = (sql + "[TEST_VALUE_DESC] = default ,");
		}
		else {
			sql = (sql + "[TEST_VALUE_DESC] = ");
			sql = (sql + SqlServerUtils.safeSql(testParamValue.getTestValueDesc().toString()));
			sql = (sql + ",");
		}
		if ((testParamValue.pub0 == null)) {
			sql = (sql + "[PUB0] = default ,");
		}
		else {
			sql = (sql + "[PUB0] = ");
			sql = (sql + SqlServerUtils.safeSql(testParamValue.getPub0().toString()));
			sql = (sql + ",");
		}
		if ((testParamValue.pub1 == null)) {
			sql = (sql + "[PUB1] = default ,");
		}
		else {
			sql = (sql + "[PUB1] = ");
			sql = (sql + SqlServerUtils.safeSql(testParamValue.getPub1().toString()));
			sql = (sql + ",");
		}
		if ((testParamValue.pub2 == null)) {
			sql = (sql + "[PUB2] = default ,");
		}
		else {
			sql = (sql + "[PUB2] = ");
			sql = (sql + SqlServerUtils.safeSql(testParamValue.getPub2().toString()));
			sql = (sql + ",");
		}
		if ((testParamValue.pub3 == null)) {
			sql = (sql + "[PUB3] = default ,");
		}
		else {
			sql = (sql + "[PUB3] = ");
			sql = (sql + SqlServerUtils.safeSql(testParamValue.getPub3().toString()));
			sql = (sql + ",");
		}
		if ((testParamValue.pub4 == null)) {
			sql = (sql + "[PUB4] = default ,");
		}
		else {
			sql = (sql + "[PUB4] = ");
			sql = (sql + SqlServerUtils.safeSql(testParamValue.getPub4().toString()));
			sql = (sql + ",");
		}
		if ((testParamValue.pub5 == null)) {
			sql = (sql + "[PUB5] = default ,");
		}
		else {
			sql = (sql + "[PUB5] = ");
			sql = (sql + SqlServerUtils.safeSql(testParamValue.getPub5().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "TEST_PROCEDURE_ID = ");
		sql = (sql + testParamValue.getTestProcedureId());
		sql = (sql + " and ");
		sql = (sql + "PARAM_ID = ");
		sql = (sql + testParamValue.getParamId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新TestParamValue对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="testParamValue">需要更新的函数测试参数表</param>
	 */
	protected static int update(IDataVisit2 dataVisit, TestParamValue testParamValue) throws SQLException, DbException {
		return TestParamValue.update(dataVisit, testParamValue, "");
	}
	
	/**
	 * 更新TestParamValue对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return TestParamValue.update(dataVisit, this);
	}
	
	/**
	 * 更新TestParamValue对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return TestParamValue.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<TestParamValue> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<TestParamValue> list = new ArrayList<TestParamValue>();
		try {
			for (; reader.next(); ) {
				TestParamValue obj = new TestParamValue();
				TestParamValue.readValue(reader, obj);
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
	public static List<TestParamValue> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<TestParamValue> list = new ArrayList<TestParamValue>();
		try {
			for (; reader.next(); ) {
				TestParamValue obj = new TestParamValue();
				TestParamValue.readValue(reader, obj);
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
	public static List<TestParamValue> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((TestParamValue.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<TestParamValue> list = new ArrayList<TestParamValue>();
		try {
			for (; reader.next(); ) {
				TestParamValue obj = new TestParamValue();
				TestParamValue.readValue(reader, obj);
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
	public static List<TestParamValue> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((TestParamValue.getFullSelectSql() + appendConditionSql));
		List<TestParamValue> list = new ArrayList<TestParamValue>();
		try {
			for (; reader.next(); ) {
				TestParamValue obj = new TestParamValue();
				TestParamValue.readValue(reader, obj);
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
	public static <T extends TestParamValue> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((TestParamValue.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			TestParamValue.readValue(reader, obj);
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
public static <T extends TestParamValue> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((TestParamValue.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			TestParamValue.readValue(reader, obj);
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
	String sql = "select * from T_TEST_PARAM_VALUE ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据测试过程标识,参数标识查询TestParamValue
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATestProcedureId">测试过程标识</param>
 * <param name="AParamId">参数标识</param>
 */
public static TestParamValue selectByTestProcedureIdParamId(IDataVisit2 dataVisit, int ATestProcedureId, int AParamId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "TEST_PROCEDURE_ID = ");
	sql = (sql + ATestProcedureId);
	sql = (sql + " and ");
	sql = (sql + "PARAM_ID = ");
	sql = (sql + AParamId);
	List<TestParamValue> list = TestParamValue.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个TestParamValue对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATestProcedureId">测试过程标识</param>
 * <param name="AParamId">参数标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByTestProcedureIdParamId(IDataVisit2 dataVisit, int ATestProcedureId, int AParamId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_TEST_PARAM_VALUE] where ");
	sql = (sql + "TEST_PROCEDURE_ID = ");
	sql = (sql + ATestProcedureId);
	sql = (sql + " and ");
	sql = (sql + "PARAM_ID = ");
	sql = (sql + AParamId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个TestParamValue对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATestProcedureId">测试过程标识</param>
 * <param name="AParamId">参数标识</param>
 */
public static void deleteByTestProcedureIdParamId(IDataVisit2 dataVisit, int ATestProcedureId, int AParamId) throws SQLException, DbException {
	TestParamValue.deleteByTestProcedureIdParamId(dataVisit, ATestProcedureId, AParamId, "");
}

/**
 * 根据外键参数标识删除一批TestParamValue对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ParamId">参数标识</param>
 */
public static void deleteListByParamId(IDataVisit2 dataVisit, int AParamId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_TEST_PARAM_VALUE] where ");
	sql = (sql + "PARAM_ID = ");
	sql = (sql + AParamId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键测试过程标识删除一批TestParamValue对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TestProcedureId">测试过程标识</param>
 */
public static void deleteListByTestProcedureId(IDataVisit2 dataVisit, int ATestProcedureId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_TEST_PARAM_VALUE] where ");
	sql = (sql + "TEST_PROCEDURE_ID = ");
	sql = (sql + ATestProcedureId);
	dataVisit.execSql(sql);
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
public static List<TestParamValue> selectObjectsByParamId(IDataVisit2 dataVisit, int AParamId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PARAM_ID = ";
	sql = (sql + AParamId);
	sql = (sql + appendConditionSql);
	return TestParamValue.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
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
public static List<TestParamValue> selectObjectsByParamId(IDataVisit2 dataVisit, int AParamId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PARAM_ID = ";
	sql = (sql + AParamId);
	return TestParamValue.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ParamId">参数标识</param>
 */
public static List<TestParamValue> selectObjectsByParamId(IDataVisit2 dataVisit, int AParamId) throws SQLException, DbException {
	String sql = " where PARAM_ID = ";
	sql = (sql + AParamId);
	return TestParamValue.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TestProcedureId">测试过程标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<TestParamValue> selectObjectsByTestProcedureId(IDataVisit2 dataVisit, int ATestProcedureId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TEST_PROCEDURE_ID = ";
	sql = (sql + ATestProcedureId);
	sql = (sql + appendConditionSql);
	return TestParamValue.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TestProcedureId">测试过程标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<TestParamValue> selectObjectsByTestProcedureId(IDataVisit2 dataVisit, int ATestProcedureId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TEST_PROCEDURE_ID = ";
	sql = (sql + ATestProcedureId);
	return TestParamValue.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TestProcedureId">测试过程标识</param>
 */
public static List<TestParamValue> selectObjectsByTestProcedureId(IDataVisit2 dataVisit, int ATestProcedureId) throws SQLException, DbException {
	String sql = " where TEST_PROCEDURE_ID = ";
	sql = (sql + ATestProcedureId);
	return TestParamValue.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象testParamValue中
 * <param name="reader">数据源</param>
 * <param name="testParamValue">目标对象</param>
 */
public static void readValue(ResultSet reader, TestParamValue testParamValue) throws SQLException, DbException {
	testParamValue.testProcedureId = reader.getInt(1);
	testParamValue.paramId = reader.getInt(2);
	testParamValue.testValue = reader.getString(3);
	if (reader.wasNull()) {
		testParamValue.testValue = null;
	}
	testParamValue.testValueDesc = reader.getString(4);
	if (reader.wasNull()) {
		testParamValue.testValueDesc = null;
	}
	testParamValue.pub0 = reader.getString(5);
	if (reader.wasNull()) {
		testParamValue.pub0 = null;
	}
	testParamValue.pub1 = reader.getString(6);
	if (reader.wasNull()) {
		testParamValue.pub1 = null;
	}
	testParamValue.pub2 = reader.getString(7);
	if (reader.wasNull()) {
		testParamValue.pub2 = null;
	}
	testParamValue.pub3 = reader.getString(8);
	if (reader.wasNull()) {
		testParamValue.pub3 = null;
	}
	testParamValue.pub4 = reader.getString(9);
	if (reader.wasNull()) {
		testParamValue.pub4 = null;
	}
	testParamValue.pub5 = reader.getString(10);
	if (reader.wasNull()) {
		testParamValue.pub5 = null;
	}
}
}
