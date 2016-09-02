package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_TEST_PAPERS_QUESTION_RANGE: 考试范围，当考卷类型为1时使用
 */
public class TestPapersQuestionRange extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * PAPERS_ID: 考卷标识
	 */
	int papersId;
	
	/**
	 * CATEGORY_ID: 试卷分类标识
	 */
	int categoryId;
	
	/**
	 * PAPERS_ID: 考卷标识
	 */
	public int getPapersId() {
		return this.papersId;
	}
	
	/**
	 * PAPERS_ID: 考卷标识
	 */
	public void setPapersId(int value)
	 {
		this.papersId = value;
	}
	
	/**
	 * CATEGORY_ID: 试卷分类标识
	 */
	public int getCategoryId() {
		return this.categoryId;
	}
	
	/**
	 * CATEGORY_ID: 试卷分类标识
	 */
	public void setCategoryId(int value)
	 {
		this.categoryId = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_TEST_PAPERS_QUESTION_RANGE].[PAPERS_ID], [T_TEST_PAPERS_QUESTION_RANGE" +
"].[CATEGORY_ID]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_TEST_PAPERS_QUESTION_RANGE].[PAPERS_ID], [T_TEST_PAPERS_QUESTION_RANGE" +
"].[CATEGORY_ID]   from [T_TEST_PAPERS_QUESTION_RANGE] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_TEST_PAPERS_QUESTION_RANGE].[PAPERS_ID], [T_TEST_PAPERS_QUESTION_RANGE].[CATE" +
"GORY_ID] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_TEST_PAPERS_QUESTION_RANGE";
	}
	
	
	public String getTableName() {
		return "T_TEST_PAPERS_QUESTION_RANGE";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "PAPERS_ID,CATEGORY_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.papersId);
		kvalue = (kvalue + ",");
		kvalue = (kvalue + this.categoryId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (TestPapersQuestionRange.class.isInstance(obj)) {
			TestPapersQuestionRange o = ((TestPapersQuestionRange)(obj));
			this.papersId = o.papersId;
			this.categoryId = o.categoryId;
		}
	}
	
	/**
	 * 插入TestPapersQuestionRange对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="testPapersQuestionRange">需要插入的考试范围，当考卷类型为1时使用</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, TestPapersQuestionRange testPapersQuestionRange) throws SQLException, DbException {
		String sql = "insert into [T_TEST_PAPERS_QUESTION_RANGE](";
		sql = (sql + "[PAPERS_ID]");
		sql = (sql + ", [CATEGORY_ID]");
		sql = (sql + ")values(");
		sql = (sql + testPapersQuestionRange.getPapersId());
		sql = (sql + ", ");
		sql = (sql + testPapersQuestionRange.getCategoryId());
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入TestPapersQuestionRange对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		TestPapersQuestionRange.insert(dataVisit, this);
	}
	
	/**
	 * 更新TestPapersQuestionRange对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="testPapersQuestionRange">需要更新的考试范围，当考卷类型为1时使用</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, TestPapersQuestionRange testPapersQuestionRange, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_TEST_PAPERS_QUESTION_RANGE] set ";
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "PAPERS_ID = ");
		sql = (sql + testPapersQuestionRange.getPapersId());
		sql = (sql + " and ");
		sql = (sql + "CATEGORY_ID = ");
		sql = (sql + testPapersQuestionRange.getCategoryId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新TestPapersQuestionRange对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="testPapersQuestionRange">需要更新的考试范围，当考卷类型为1时使用</param>
	 */
	protected static int update(IDataVisit2 dataVisit, TestPapersQuestionRange testPapersQuestionRange) throws SQLException, DbException {
		return TestPapersQuestionRange.update(dataVisit, testPapersQuestionRange, "");
	}
	
	/**
	 * 更新TestPapersQuestionRange对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return TestPapersQuestionRange.update(dataVisit, this);
	}
	
	/**
	 * 更新TestPapersQuestionRange对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return TestPapersQuestionRange.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<TestPapersQuestionRange> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<TestPapersQuestionRange> list = new ArrayList<TestPapersQuestionRange>();
		try {
			for (; reader.next(); ) {
				TestPapersQuestionRange obj = new TestPapersQuestionRange();
				TestPapersQuestionRange.readValue(reader, obj);
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
	public static List<TestPapersQuestionRange> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<TestPapersQuestionRange> list = new ArrayList<TestPapersQuestionRange>();
		try {
			for (; reader.next(); ) {
				TestPapersQuestionRange obj = new TestPapersQuestionRange();
				TestPapersQuestionRange.readValue(reader, obj);
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
	public static List<TestPapersQuestionRange> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((TestPapersQuestionRange.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<TestPapersQuestionRange> list = new ArrayList<TestPapersQuestionRange>();
		try {
			for (; reader.next(); ) {
				TestPapersQuestionRange obj = new TestPapersQuestionRange();
				TestPapersQuestionRange.readValue(reader, obj);
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
	public static List<TestPapersQuestionRange> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((TestPapersQuestionRange.getFullSelectSql() + appendConditionSql));
		List<TestPapersQuestionRange> list = new ArrayList<TestPapersQuestionRange>();
		try {
			for (; reader.next(); ) {
				TestPapersQuestionRange obj = new TestPapersQuestionRange();
				TestPapersQuestionRange.readValue(reader, obj);
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
	public static <T extends TestPapersQuestionRange> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((TestPapersQuestionRange.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			TestPapersQuestionRange.readValue(reader, obj);
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
public static <T extends TestPapersQuestionRange> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((TestPapersQuestionRange.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			TestPapersQuestionRange.readValue(reader, obj);
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
	String sql = "select * from T_TEST_PAPERS_QUESTION_RANGE ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据考卷标识,试卷分类标识查询TestPapersQuestionRange
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APapersId">考卷标识</param>
 * <param name="ACategoryId">试卷分类标识</param>
 */
public static TestPapersQuestionRange selectByPapersIdCategoryId(IDataVisit2 dataVisit, int APapersId, int ACategoryId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "PAPERS_ID = ");
	sql = (sql + APapersId);
	sql = (sql + " and ");
	sql = (sql + "CATEGORY_ID = ");
	sql = (sql + ACategoryId);
	List<TestPapersQuestionRange> list = TestPapersQuestionRange.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个TestPapersQuestionRange对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APapersId">考卷标识</param>
 * <param name="ACategoryId">试卷分类标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByPapersIdCategoryId(IDataVisit2 dataVisit, int APapersId, int ACategoryId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_TEST_PAPERS_QUESTION_RANGE] where ");
	sql = (sql + "PAPERS_ID = ");
	sql = (sql + APapersId);
	sql = (sql + " and ");
	sql = (sql + "CATEGORY_ID = ");
	sql = (sql + ACategoryId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个TestPapersQuestionRange对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APapersId">考卷标识</param>
 * <param name="ACategoryId">试卷分类标识</param>
 */
public static void deleteByPapersIdCategoryId(IDataVisit2 dataVisit, int APapersId, int ACategoryId) throws SQLException, DbException {
	TestPapersQuestionRange.deleteByPapersIdCategoryId(dataVisit, APapersId, ACategoryId, "");
}

/**
 * 根据外键试卷分类标识删除一批TestPapersQuestionRange对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="CategoryId">试卷分类标识</param>
 */
public static void deleteListByCategoryId(IDataVisit2 dataVisit, int ACategoryId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_TEST_PAPERS_QUESTION_RANGE] where ");
	sql = (sql + "CATEGORY_ID = ");
	sql = (sql + ACategoryId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="CategoryId">试卷分类标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<TestPapersQuestionRange> selectObjectsByCategoryId(IDataVisit2 dataVisit, int ACategoryId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where CATEGORY_ID = ";
	sql = (sql + ACategoryId);
	sql = (sql + appendConditionSql);
	return TestPapersQuestionRange.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="CategoryId">试卷分类标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<TestPapersQuestionRange> selectObjectsByCategoryId(IDataVisit2 dataVisit, int ACategoryId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where CATEGORY_ID = ";
	sql = (sql + ACategoryId);
	return TestPapersQuestionRange.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="CategoryId">试卷分类标识</param>
 */
public static List<TestPapersQuestionRange> selectObjectsByCategoryId(IDataVisit2 dataVisit, int ACategoryId) throws SQLException, DbException {
	String sql = " where CATEGORY_ID = ";
	sql = (sql + ACategoryId);
	return TestPapersQuestionRange.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象testPapersQuestionRange中
 * <param name="reader">数据源</param>
 * <param name="testPapersQuestionRange">目标对象</param>
 */
public static void readValue(ResultSet reader, TestPapersQuestionRange testPapersQuestionRange) throws SQLException, DbException {
	testPapersQuestionRange.papersId = reader.getInt(1);
	testPapersQuestionRange.categoryId = reader.getInt(2);
}
}
