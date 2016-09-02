package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_TEST_PAPERS_QUESTION: 考卷题目
 */
public class TestPapersQuestion extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * PAPERS_QUESTION_ID: 
	 */
	int papersQuestionId;
	
	/**
	 * PAPERS_ID: 考卷标识
	 */
	int papersId;
	
	/**
	 * QUESTION_ID: 题目标识
	 */
	int questionId;
	
	/**
	 * QUESTION_SN: 考题序号
	 */
	int questionSn;
	
	/**
	 * PAPERS_QUESTION_ID: 
	 */
	public int getPapersQuestionId() {
		return this.papersQuestionId;
	}
	
	/**
	 * PAPERS_QUESTION_ID: 
	 */
	public void setPapersQuestionId(int value)
	 {
		this.papersQuestionId = value;
	}
	
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
	 * QUESTION_ID: 题目标识
	 */
	public int getQuestionId() {
		return this.questionId;
	}
	
	/**
	 * QUESTION_ID: 题目标识
	 */
	public void setQuestionId(int value)
	 {
		this.questionId = value;
	}
	
	/**
	 * QUESTION_SN: 考题序号
	 */
	public int getQuestionSn() {
		return this.questionSn;
	}
	
	/**
	 * QUESTION_SN: 考题序号
	 */
	public void setQuestionSn(int value)
	 {
		this.questionSn = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_TEST_PAPERS_QUESTION].[PAPERS_QUESTION_ID], [T_TEST_PAPERS_QUESTION].[" +
"PAPERS_ID], [T_TEST_PAPERS_QUESTION].[QUESTION_ID], [T_TEST_PAPERS_QUESTION].[QU" +
"ESTION_SN]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_TEST_PAPERS_QUESTION].[PAPERS_QUESTION_ID], [T_TEST_PAPERS_QUESTION].[" +
"PAPERS_ID], [T_TEST_PAPERS_QUESTION].[QUESTION_ID], [T_TEST_PAPERS_QUESTION].[QU" +
"ESTION_SN]   from [T_TEST_PAPERS_QUESTION] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_TEST_PAPERS_QUESTION].[PAPERS_QUESTION_ID], [T_TEST_PAPERS_QUESTION].[PAPERS_" +
"ID], [T_TEST_PAPERS_QUESTION].[QUESTION_ID], [T_TEST_PAPERS_QUESTION].[QUESTION_" +
"SN] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_TEST_PAPERS_QUESTION";
	}
	
	
	public String getTableName() {
		return "T_TEST_PAPERS_QUESTION";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "PAPERS_QUESTION_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.papersQuestionId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (TestPapersQuestion.class.isInstance(obj)) {
			TestPapersQuestion o = ((TestPapersQuestion)(obj));
			this.papersQuestionId = o.papersQuestionId;
			this.papersId = o.papersId;
			this.questionId = o.questionId;
			this.questionSn = o.questionSn;
		}
	}
	
	/**
	 * 插入TestPapersQuestion对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="testPapersQuestion">需要插入的考卷题目</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, TestPapersQuestion testPapersQuestion) throws SQLException, DbException {
		String sql = "insert into [T_TEST_PAPERS_QUESTION](";
		if ((testPapersQuestion.getPapersQuestionId() > 0)) {
			sql = (sql + "[PAPERS_QUESTION_ID], ");
		}
		sql = (sql + "[PAPERS_ID]");
		sql = (sql + ", [QUESTION_ID]");
		sql = (sql + ", [QUESTION_SN]");
		sql = (sql + ")values(");
		if ((testPapersQuestion.getPapersQuestionId() > 0)) {
			sql = (sql + testPapersQuestion.getPapersQuestionId());
			sql = (sql + ", ");
		}
		sql = (sql + testPapersQuestion.getPapersId());
		sql = (sql + ", ");
		sql = (sql + testPapersQuestion.getQuestionId());
		sql = (sql + ", ");
		sql = (sql + testPapersQuestion.getQuestionSn());
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((testPapersQuestion.getPapersQuestionId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_TEST_PAPERS_QUESTION] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_TEST_PAPERS_QUESTION off");
			}
			dataVisit.execSql(sql);
			if ((testPapersQuestion.getPapersQuestionId() == 0)) {
				testPapersQuestion.papersQuestionId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入TestPapersQuestion对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		TestPapersQuestion.insert(dataVisit, this);
	}
	
	/**
	 * 更新TestPapersQuestion对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="testPapersQuestion">需要更新的考卷题目</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, TestPapersQuestion testPapersQuestion, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_TEST_PAPERS_QUESTION] set ";
		sql = (sql + "[PAPERS_ID] = ");
		sql = (sql + testPapersQuestion.getPapersId());
		sql = (sql + ",");
		sql = (sql + "[QUESTION_ID] = ");
		sql = (sql + testPapersQuestion.getQuestionId());
		sql = (sql + ",");
		sql = (sql + "[QUESTION_SN] = ");
		sql = (sql + testPapersQuestion.getQuestionSn());
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "PAPERS_QUESTION_ID = ");
		sql = (sql + testPapersQuestion.getPapersQuestionId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新TestPapersQuestion对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="testPapersQuestion">需要更新的考卷题目</param>
	 */
	protected static int update(IDataVisit2 dataVisit, TestPapersQuestion testPapersQuestion) throws SQLException, DbException {
		return TestPapersQuestion.update(dataVisit, testPapersQuestion, "");
	}
	
	/**
	 * 更新TestPapersQuestion对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return TestPapersQuestion.update(dataVisit, this);
	}
	
	/**
	 * 更新TestPapersQuestion对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return TestPapersQuestion.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<TestPapersQuestion> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<TestPapersQuestion> list = new ArrayList<TestPapersQuestion>();
		try {
			for (; reader.next(); ) {
				TestPapersQuestion obj = new TestPapersQuestion();
				TestPapersQuestion.readValue(reader, obj);
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
	public static List<TestPapersQuestion> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<TestPapersQuestion> list = new ArrayList<TestPapersQuestion>();
		try {
			for (; reader.next(); ) {
				TestPapersQuestion obj = new TestPapersQuestion();
				TestPapersQuestion.readValue(reader, obj);
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
	public static List<TestPapersQuestion> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((TestPapersQuestion.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<TestPapersQuestion> list = new ArrayList<TestPapersQuestion>();
		try {
			for (; reader.next(); ) {
				TestPapersQuestion obj = new TestPapersQuestion();
				TestPapersQuestion.readValue(reader, obj);
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
	public static List<TestPapersQuestion> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((TestPapersQuestion.getFullSelectSql() + appendConditionSql));
		List<TestPapersQuestion> list = new ArrayList<TestPapersQuestion>();
		try {
			for (; reader.next(); ) {
				TestPapersQuestion obj = new TestPapersQuestion();
				TestPapersQuestion.readValue(reader, obj);
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
	public static <T extends TestPapersQuestion> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((TestPapersQuestion.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			TestPapersQuestion.readValue(reader, obj);
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
public static <T extends TestPapersQuestion> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((TestPapersQuestion.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			TestPapersQuestion.readValue(reader, obj);
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
	String sql = "select * from T_TEST_PAPERS_QUESTION ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据查询TestPapersQuestion
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APapersQuestionId"></param>
 */
public static TestPapersQuestion selectByPapersQuestionId(IDataVisit2 dataVisit, int APapersQuestionId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "PAPERS_QUESTION_ID = ");
	sql = (sql + APapersQuestionId);
	List<TestPapersQuestion> list = TestPapersQuestion.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个TestPapersQuestion对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APapersQuestionId"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByPapersQuestionId(IDataVisit2 dataVisit, int APapersQuestionId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_TEST_PAPERS_QUESTION] where ");
	sql = (sql + "PAPERS_QUESTION_ID = ");
	sql = (sql + APapersQuestionId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个TestPapersQuestion对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APapersQuestionId"></param>
 */
public static void deleteByPapersQuestionId(IDataVisit2 dataVisit, int APapersQuestionId) throws SQLException, DbException {
	TestPapersQuestion.deleteByPapersQuestionId(dataVisit, APapersQuestionId, "");
}

/**
 * 根据外键题目标识删除一批TestPapersQuestion对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="QuestionId">题目标识</param>
 */
public static void deleteListByQuestionId(IDataVisit2 dataVisit, int AQuestionId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_TEST_PAPERS_QUESTION] where ");
	sql = (sql + "QUESTION_ID = ");
	sql = (sql + AQuestionId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键考卷标识删除一批TestPapersQuestion对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PapersId">考卷标识</param>
 */
public static void deleteListByPapersId(IDataVisit2 dataVisit, int APapersId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_TEST_PAPERS_QUESTION] where ");
	sql = (sql + "PAPERS_ID = ");
	sql = (sql + APapersId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="QuestionId">题目标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<TestPapersQuestion> selectObjectsByQuestionId(IDataVisit2 dataVisit, int AQuestionId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where QUESTION_ID = ";
	sql = (sql + AQuestionId);
	sql = (sql + appendConditionSql);
	return TestPapersQuestion.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="QuestionId">题目标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<TestPapersQuestion> selectObjectsByQuestionId(IDataVisit2 dataVisit, int AQuestionId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where QUESTION_ID = ";
	sql = (sql + AQuestionId);
	return TestPapersQuestion.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="QuestionId">题目标识</param>
 */
public static List<TestPapersQuestion> selectObjectsByQuestionId(IDataVisit2 dataVisit, int AQuestionId) throws SQLException, DbException {
	String sql = " where QUESTION_ID = ";
	sql = (sql + AQuestionId);
	return TestPapersQuestion.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PapersId">考卷标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<TestPapersQuestion> selectObjectsByPapersId(IDataVisit2 dataVisit, int APapersId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PAPERS_ID = ";
	sql = (sql + APapersId);
	sql = (sql + appendConditionSql);
	return TestPapersQuestion.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PapersId">考卷标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<TestPapersQuestion> selectObjectsByPapersId(IDataVisit2 dataVisit, int APapersId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PAPERS_ID = ";
	sql = (sql + APapersId);
	return TestPapersQuestion.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PapersId">考卷标识</param>
 */
public static List<TestPapersQuestion> selectObjectsByPapersId(IDataVisit2 dataVisit, int APapersId) throws SQLException, DbException {
	String sql = " where PAPERS_ID = ";
	sql = (sql + APapersId);
	return TestPapersQuestion.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象testPapersQuestion中
 * <param name="reader">数据源</param>
 * <param name="testPapersQuestion">目标对象</param>
 */
public static void readValue(ResultSet reader, TestPapersQuestion testPapersQuestion) throws SQLException, DbException {
	testPapersQuestion.papersQuestionId = reader.getInt(1);
	testPapersQuestion.papersId = reader.getInt(2);
	testPapersQuestion.questionId = reader.getInt(3);
	testPapersQuestion.questionSn = reader.getInt(4);
}
}
