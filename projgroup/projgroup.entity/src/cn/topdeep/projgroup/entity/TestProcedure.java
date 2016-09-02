package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_TEST_PROCEDURE: 测试过程
 */
public class TestProcedure extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * TEST_PROCEDURE_ID: 测试过程标识
	 */
	int testProcedureId;
	
	/**
	 * BUILD_ID: 构建标识
	 */
	int buildId;
	
	/**
	 * FUNC_PROCEDURE_ID: 函数过程标识
	 */
	int funcProcedureId;
	
	/**
	 * TEST_ORDER: 测试顺序
	 */
	int testOrder;
	
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
	 * FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public int getFuncProcedureId() {
		return this.funcProcedureId;
	}
	
	/**
	 * FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public void setFuncProcedureId(int value)
	 {
		this.funcProcedureId = value;
	}
	
	/**
	 * TEST_ORDER: 测试顺序
	 */
	public int getTestOrder() {
		return this.testOrder;
	}
	
	/**
	 * TEST_ORDER: 测试顺序
	 */
	public void setTestOrder(int value)
	 {
		this.testOrder = value;
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
		return "select  [T_TEST_PROCEDURE].[TEST_PROCEDURE_ID], [T_TEST_PROCEDURE].[BUILD_ID], [T_TEST_PROCEDURE].[FUNC_PROCEDURE_ID], [T_TEST_PROCEDURE].[TEST_ORDER], [T_TEST_PROCEDURE].[PUB0], [T_TEST_PROCEDURE].[PUB1], [T_TEST_PROCEDURE].[PUB2], [T_TEST_PROCEDURE].[PUB3], [T_TEST_PROCEDURE].[PUB4], [T_TEST_PROCEDURE].[PUB5]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_TEST_PROCEDURE].[TEST_PROCEDURE_ID], [T_TEST_PROCEDURE].[BUILD_ID], [T_TEST_PROCEDURE].[FUNC_PROCEDURE_ID], [T_TEST_PROCEDURE].[TEST_ORDER], [T_TEST_PROCEDURE].[PUB0], [T_TEST_PROCEDURE].[PUB1], [T_TEST_PROCEDURE].[PUB2], [T_TEST_PROCEDURE].[PUB3], [T_TEST_PROCEDURE].[PUB4], [T_TEST_PROCEDURE].[PUB5]   from [T_TEST_PROCEDURE] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_TEST_PROCEDURE].[TEST_PROCEDURE_ID], [T_TEST_PROCEDURE].[BUILD_ID], [T_TEST_PROCEDURE].[FUNC_PROCEDURE_ID], [T_TEST_PROCEDURE].[TEST_ORDER], [T_TEST_PROCEDURE].[PUB0], [T_TEST_PROCEDURE].[PUB1], [T_TEST_PROCEDURE].[PUB2], [T_TEST_PROCEDURE].[PUB3], [T_TEST_PROCEDURE].[PUB4], [T_TEST_PROCEDURE].[PUB5] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_TEST_PROCEDURE";
	}
	
	
	public String getTableName() {
		return "T_TEST_PROCEDURE";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "TEST_PROCEDURE_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.testProcedureId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (TestProcedure.class.isInstance(obj)) {
			TestProcedure o = ((TestProcedure)(obj));
			this.testProcedureId = o.testProcedureId;
			this.buildId = o.buildId;
			this.funcProcedureId = o.funcProcedureId;
			this.testOrder = o.testOrder;
			this.pub0 = o.pub0;
			this.pub1 = o.pub1;
			this.pub2 = o.pub2;
			this.pub3 = o.pub3;
			this.pub4 = o.pub4;
			this.pub5 = o.pub5;
		}
	}
	
	/**
	 * 插入TestProcedure对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="testProcedure">需要插入的测试过程</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, TestProcedure testProcedure) throws SQLException, DbException {
		String sql = "insert into [T_TEST_PROCEDURE](";
		if ((testProcedure.getTestProcedureId() > 0)) {
			sql = (sql + "[TEST_PROCEDURE_ID], ");
		}
		sql = (sql + "[BUILD_ID]");
		sql = (sql + ", [FUNC_PROCEDURE_ID]");
		sql = (sql + ", [TEST_ORDER]");
		sql = (sql + ", [PUB0]");
		sql = (sql + ", [PUB1]");
		sql = (sql + ", [PUB2]");
		sql = (sql + ", [PUB3]");
		sql = (sql + ", [PUB4]");
		sql = (sql + ", [PUB5]");
		sql = (sql + ")values(");
		if ((testProcedure.getTestProcedureId() > 0)) {
			sql = (sql + testProcedure.getTestProcedureId());
			sql = (sql + ", ");
		}
		sql = (sql + testProcedure.getBuildId());
		sql = (sql + ", ");
		sql = (sql + testProcedure.getFuncProcedureId());
		sql = (sql + ", ");
		sql = (sql + testProcedure.getTestOrder());
		sql = (sql + ", ");
		if ((testProcedure.pub0 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(testProcedure.getPub0().toString()));
		}
		sql = (sql + ", ");
		if ((testProcedure.pub1 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(testProcedure.getPub1().toString()));
		}
		sql = (sql + ", ");
		if ((testProcedure.pub2 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(testProcedure.getPub2().toString()));
		}
		sql = (sql + ", ");
		if ((testProcedure.pub3 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(testProcedure.getPub3().toString()));
		}
		sql = (sql + ", ");
		if ((testProcedure.pub4 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(testProcedure.getPub4().toString()));
		}
		sql = (sql + ", ");
		if ((testProcedure.pub5 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(testProcedure.getPub5().toString()));
		}
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((testProcedure.getTestProcedureId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_TEST_PROCEDURE] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_TEST_PROCEDURE off");
			}
			dataVisit.execSql(sql);
			if ((testProcedure.getTestProcedureId() == 0)) {
				testProcedure.testProcedureId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入TestProcedure对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		TestProcedure.insert(dataVisit, this);
	}
	
	/**
	 * 更新TestProcedure对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="testProcedure">需要更新的测试过程</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, TestProcedure testProcedure, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_TEST_PROCEDURE] set ";
		sql = (sql + "[BUILD_ID] = ");
		sql = (sql + testProcedure.getBuildId());
		sql = (sql + ",");
		sql = (sql + "[FUNC_PROCEDURE_ID] = ");
		sql = (sql + testProcedure.getFuncProcedureId());
		sql = (sql + ",");
		sql = (sql + "[TEST_ORDER] = ");
		sql = (sql + testProcedure.getTestOrder());
		sql = (sql + ",");
		if ((testProcedure.pub0 == null)) {
			sql = (sql + "[PUB0] = default ,");
		}
		else {
			sql = (sql + "[PUB0] = ");
			sql = (sql + SqlServerUtils.safeSql(testProcedure.getPub0().toString()));
			sql = (sql + ",");
		}
		if ((testProcedure.pub1 == null)) {
			sql = (sql + "[PUB1] = default ,");
		}
		else {
			sql = (sql + "[PUB1] = ");
			sql = (sql + SqlServerUtils.safeSql(testProcedure.getPub1().toString()));
			sql = (sql + ",");
		}
		if ((testProcedure.pub2 == null)) {
			sql = (sql + "[PUB2] = default ,");
		}
		else {
			sql = (sql + "[PUB2] = ");
			sql = (sql + SqlServerUtils.safeSql(testProcedure.getPub2().toString()));
			sql = (sql + ",");
		}
		if ((testProcedure.pub3 == null)) {
			sql = (sql + "[PUB3] = default ,");
		}
		else {
			sql = (sql + "[PUB3] = ");
			sql = (sql + SqlServerUtils.safeSql(testProcedure.getPub3().toString()));
			sql = (sql + ",");
		}
		if ((testProcedure.pub4 == null)) {
			sql = (sql + "[PUB4] = default ,");
		}
		else {
			sql = (sql + "[PUB4] = ");
			sql = (sql + SqlServerUtils.safeSql(testProcedure.getPub4().toString()));
			sql = (sql + ",");
		}
		if ((testProcedure.pub5 == null)) {
			sql = (sql + "[PUB5] = default ,");
		}
		else {
			sql = (sql + "[PUB5] = ");
			sql = (sql + SqlServerUtils.safeSql(testProcedure.getPub5().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "TEST_PROCEDURE_ID = ");
		sql = (sql + testProcedure.getTestProcedureId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新TestProcedure对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="testProcedure">需要更新的测试过程</param>
	 */
	protected static int update(IDataVisit2 dataVisit, TestProcedure testProcedure) throws SQLException, DbException {
		return TestProcedure.update(dataVisit, testProcedure, "");
	}
	
	/**
	 * 更新TestProcedure对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return TestProcedure.update(dataVisit, this);
	}
	
	/**
	 * 更新TestProcedure对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return TestProcedure.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<TestProcedure> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<TestProcedure> list = new ArrayList<TestProcedure>();
		try {
			for (; reader.next(); ) {
				TestProcedure obj = new TestProcedure();
				TestProcedure.readValue(reader, obj);
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
	public static List<TestProcedure> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<TestProcedure> list = new ArrayList<TestProcedure>();
		try {
			for (; reader.next(); ) {
				TestProcedure obj = new TestProcedure();
				TestProcedure.readValue(reader, obj);
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
	public static List<TestProcedure> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((TestProcedure.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<TestProcedure> list = new ArrayList<TestProcedure>();
		try {
			for (; reader.next(); ) {
				TestProcedure obj = new TestProcedure();
				TestProcedure.readValue(reader, obj);
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
	public static List<TestProcedure> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((TestProcedure.getFullSelectSql() + appendConditionSql));
		List<TestProcedure> list = new ArrayList<TestProcedure>();
		try {
			for (; reader.next(); ) {
				TestProcedure obj = new TestProcedure();
				TestProcedure.readValue(reader, obj);
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
	public static <T extends TestProcedure> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((TestProcedure.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			TestProcedure.readValue(reader, obj);
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
public static <T extends TestProcedure> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((TestProcedure.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			TestProcedure.readValue(reader, obj);
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
	String sql = "select * from T_TEST_PROCEDURE ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据测试过程标识查询TestProcedure
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATestProcedureId">测试过程标识</param>
 */
public static TestProcedure selectByTestProcedureId(IDataVisit2 dataVisit, int ATestProcedureId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "TEST_PROCEDURE_ID = ");
	sql = (sql + ATestProcedureId);
	List<TestProcedure> list = TestProcedure.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个TestProcedure对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATestProcedureId">测试过程标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByTestProcedureId(IDataVisit2 dataVisit, int ATestProcedureId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_TEST_PROCEDURE] where ");
	sql = (sql + "TEST_PROCEDURE_ID = ");
	sql = (sql + ATestProcedureId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个TestProcedure对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATestProcedureId">测试过程标识</param>
 */
public static void deleteByTestProcedureId(IDataVisit2 dataVisit, int ATestProcedureId) throws SQLException, DbException {
	TestProcedure.deleteByTestProcedureId(dataVisit, ATestProcedureId, "");
}

/**
 * 根据外键构建标识删除一批TestProcedure对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="BuildId">构建标识</param>
 */
public static void deleteListByBuildId(IDataVisit2 dataVisit, int ABuildId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_TEST_PROCEDURE] where ");
	sql = (sql + "BUILD_ID = ");
	sql = (sql + ABuildId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键函数过程标识删除一批TestProcedure对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="FuncProcedureId">函数过程标识</param>
 */
public static void deleteListByFuncProcedureId(IDataVisit2 dataVisit, int AFuncProcedureId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_TEST_PROCEDURE] where ");
	sql = (sql + "FUNC_PROCEDURE_ID = ");
	sql = (sql + AFuncProcedureId);
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
public static List<TestProcedure> selectObjectsByBuildId(IDataVisit2 dataVisit, int ABuildId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where BUILD_ID = ";
	sql = (sql + ABuildId);
	sql = (sql + appendConditionSql);
	return TestProcedure.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
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
public static List<TestProcedure> selectObjectsByBuildId(IDataVisit2 dataVisit, int ABuildId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where BUILD_ID = ";
	sql = (sql + ABuildId);
	return TestProcedure.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="BuildId">构建标识</param>
 */
public static List<TestProcedure> selectObjectsByBuildId(IDataVisit2 dataVisit, int ABuildId) throws SQLException, DbException {
	String sql = " where BUILD_ID = ";
	sql = (sql + ABuildId);
	return TestProcedure.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="FuncProcedureId">函数过程标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<TestProcedure> selectObjectsByFuncProcedureId(IDataVisit2 dataVisit, int AFuncProcedureId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where FUNC_PROCEDURE_ID = ";
	sql = (sql + AFuncProcedureId);
	sql = (sql + appendConditionSql);
	return TestProcedure.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="FuncProcedureId">函数过程标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<TestProcedure> selectObjectsByFuncProcedureId(IDataVisit2 dataVisit, int AFuncProcedureId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where FUNC_PROCEDURE_ID = ";
	sql = (sql + AFuncProcedureId);
	return TestProcedure.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="FuncProcedureId">函数过程标识</param>
 */
public static List<TestProcedure> selectObjectsByFuncProcedureId(IDataVisit2 dataVisit, int AFuncProcedureId) throws SQLException, DbException {
	String sql = " where FUNC_PROCEDURE_ID = ";
	sql = (sql + AFuncProcedureId);
	return TestProcedure.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象testProcedure中
 * <param name="reader">数据源</param>
 * <param name="testProcedure">目标对象</param>
 */
public static void readValue(ResultSet reader, TestProcedure testProcedure) throws SQLException, DbException {
	testProcedure.testProcedureId = reader.getInt(1);
	testProcedure.buildId = reader.getInt(2);
	testProcedure.funcProcedureId = reader.getInt(3);
	testProcedure.testOrder = reader.getInt(4);
	testProcedure.pub0 = reader.getString(5);
	if (reader.wasNull()) {
		testProcedure.pub0 = null;
	}
	testProcedure.pub1 = reader.getString(6);
	if (reader.wasNull()) {
		testProcedure.pub1 = null;
	}
	testProcedure.pub2 = reader.getString(7);
	if (reader.wasNull()) {
		testProcedure.pub2 = null;
	}
	testProcedure.pub3 = reader.getString(8);
	if (reader.wasNull()) {
		testProcedure.pub3 = null;
	}
	testProcedure.pub4 = reader.getString(9);
	if (reader.wasNull()) {
		testProcedure.pub4 = null;
	}
	testProcedure.pub5 = reader.getString(10);
	if (reader.wasNull()) {
		testProcedure.pub5 = null;
	}
}
}
