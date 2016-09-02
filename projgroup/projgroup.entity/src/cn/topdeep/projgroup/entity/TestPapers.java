package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_TEST_PAPERS: 考卷
 */
public class TestPapers extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * PAPERS_ID: 考卷标识
	 */
	int papersId;
	
	/**
	 * MODIFY_OR: 操作员标识
	 */
	String modifyOr = "";
	
	/**
	 * PAPERS_NAME: 考试名称
	 */
	String papersName = "";
	
	/**
	 * CREATE_TIME: 添加时间
	 */
	java.util.Date createTime;
	
	/**
	 * TIME_LIMIT: 限时，以分钟为单位
	 */
	int timeLimit;
	
	/**
	 * DELETED: 删除
	 */
	boolean deleted;
	
	/**
	 * STATUS: 状态 0 出题 1 允许考试 2 终止考试
	 */
	byte status;
	
	/**
	 * TOTAL_SCORE: 考卷总分,为空表示不限制
	 */
	Integer totalScore;
	
	/**
	 * QUESTION_TYPE_SCORE: 各题型分数限制，格式为type=xxx,type=xxx,如果某题型没有，则表示不限制该题型
	 */
	String questionTypeScore;
	
	/**
	 * QUESTION_TYPE_PER_SCORE: 各题型每题的分数，格式同题型分数限制
	 */
	String questionTypePerScore;
	
	/**
	 * PAPERS_TYPE: 试卷类型 0固定考题试卷 1 动态考题试卷(不记录考试内容，考过就算)
	 */
	byte papersType;
	
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
	 * MODIFY_OR: 操作员标识
	 */
	public String getModifyOr() {
		return this.modifyOr;
	}
	
	/**
	 * MODIFY_OR: 操作员标识
	 */
	public void setModifyOr(String value)
	 {
		this.modifyOr = value;
	}
	
	/**
	 * PAPERS_NAME: 考试名称
	 */
	public String getPapersName() {
		return this.papersName;
	}
	
	/**
	 * PAPERS_NAME: 考试名称
	 */
	public void setPapersName(String value)
	 {
		this.papersName = value;
	}
	
	/**
	 * CREATE_TIME: 添加时间
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	
	/**
	 * CREATE_TIME: 添加时间
	 */
	public void setCreateTime(java.util.Date value)
	 {
		this.createTime = value;
	}
	
	/**
	 * TIME_LIMIT: 限时，以分钟为单位
	 */
	public int getTimeLimit() {
		return this.timeLimit;
	}
	
	/**
	 * TIME_LIMIT: 限时，以分钟为单位
	 */
	public void setTimeLimit(int value)
	 {
		this.timeLimit = value;
	}
	
	/**
	 * DELETED: 删除
	 */
	public boolean getDeleted() {
		return this.deleted;
	}
	
	/**
	 * DELETED: 删除
	 */
	public void setDeleted(boolean value)
	 {
		this.deleted = value;
	}
	
	/**
	 * STATUS: 状态 0 出题 1 允许考试 2 终止考试
	 */
	public byte getStatus() {
		return this.status;
	}
	
	/**
	 * STATUS: 状态 0 出题 1 允许考试 2 终止考试
	 */
	public void setStatus(byte value)
	 {
		this.status = value;
	}
	
	/**
	 * TOTAL_SCORE: 考卷总分,为空表示不限制
	 */
	public Integer getTotalScore() {
		return this.totalScore;
	}
	
	/**
	 * TOTAL_SCORE: 考卷总分,为空表示不限制
	 */
	public void setTotalScore(Integer value)
	 {
		this.totalScore = value;
	}
	
	/**
	 * QUESTION_TYPE_SCORE: 各题型分数限制，格式为type=xxx,type=xxx,如果某题型没有，则表示不限制该题型
	 */
	public String getQuestionTypeScore() {
		return this.questionTypeScore;
	}
	
	/**
	 * QUESTION_TYPE_SCORE: 各题型分数限制，格式为type=xxx,type=xxx,如果某题型没有，则表示不限制该题型
	 */
	public void setQuestionTypeScore(String value)
	 {
		this.questionTypeScore = value;
	}
	
	/**
	 * QUESTION_TYPE_PER_SCORE: 各题型每题的分数，格式同题型分数限制
	 */
	public String getQuestionTypePerScore() {
		return this.questionTypePerScore;
	}
	
	/**
	 * QUESTION_TYPE_PER_SCORE: 各题型每题的分数，格式同题型分数限制
	 */
	public void setQuestionTypePerScore(String value)
	 {
		this.questionTypePerScore = value;
	}
	
	/**
	 * PAPERS_TYPE: 试卷类型 0固定考题试卷 1 动态考题试卷(不记录考试内容，考过就算)
	 */
	public byte getPapersType() {
		return this.papersType;
	}
	
	/**
	 * PAPERS_TYPE: 试卷类型 0固定考题试卷 1 动态考题试卷(不记录考试内容，考过就算)
	 */
	public void setPapersType(byte value)
	 {
		this.papersType = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_TEST_PAPERS].[PAPERS_ID], [T_TEST_PAPERS].[MODIFY_OR], [T_TEST_PAPERS].[PAPERS_NAME], [T_TEST_PAPERS].[CREATE_TIME], [T_TEST_PAPERS].[TIME_LIMIT], [T_TEST_PAPERS].[DELETED], [T_TEST_PAPERS].[STATUS], [T_TEST_PAPERS].[TOTAL_SCORE], [T_TEST_PAPERS].[QUESTION_TYPE_SCORE], [T_TEST_PAPERS].[QUESTION_TYPE_PER_SCORE], [T_TEST_PAPERS].[PAPERS_TYPE]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_TEST_PAPERS].[PAPERS_ID], [T_TEST_PAPERS].[MODIFY_OR], [T_TEST_PAPERS].[PAPERS_NAME], [T_TEST_PAPERS].[CREATE_TIME], [T_TEST_PAPERS].[TIME_LIMIT], [T_TEST_PAPERS].[DELETED], [T_TEST_PAPERS].[STATUS], [T_TEST_PAPERS].[TOTAL_SCORE], [T_TEST_PAPERS].[QUESTION_TYPE_SCORE], [T_TEST_PAPERS].[QUESTION_TYPE_PER_SCORE], [T_TEST_PAPERS].[PAPERS_TYPE]   from [T_TEST_PAPERS] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_TEST_PAPERS].[PAPERS_ID], [T_TEST_PAPERS].[MODIFY_OR], [T_TEST_PAPERS].[PAPERS_NAME], [T_TEST_PAPERS].[CREATE_TIME], [T_TEST_PAPERS].[TIME_LIMIT], [T_TEST_PAPERS].[DELETED], [T_TEST_PAPERS].[STATUS], [T_TEST_PAPERS].[TOTAL_SCORE], [T_TEST_PAPERS].[QUESTION_TYPE_SCORE], [T_TEST_PAPERS].[QUESTION_TYPE_PER_SCORE], [T_TEST_PAPERS].[PAPERS_TYPE] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_TEST_PAPERS";
	}
	
	
	public String getTableName() {
		return "T_TEST_PAPERS";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "PAPERS_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.papersId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (TestPapers.class.isInstance(obj)) {
			TestPapers o = ((TestPapers)(obj));
			this.papersId = o.papersId;
			this.modifyOr = o.modifyOr;
			this.papersName = o.papersName;
			this.createTime = o.createTime;
			this.timeLimit = o.timeLimit;
			this.deleted = o.deleted;
			this.status = o.status;
			this.totalScore = o.totalScore;
			this.questionTypeScore = o.questionTypeScore;
			this.questionTypePerScore = o.questionTypePerScore;
			this.papersType = o.papersType;
		}
	}
	
	/**
	 * 插入TestPapers对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="testPapers">需要插入的考卷</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, TestPapers testPapers) throws SQLException, DbException {
		String sql = "insert into [T_TEST_PAPERS](";
		if ((testPapers.getPapersId() > 0)) {
			sql = (sql + "[PAPERS_ID], ");
		}
		sql = (sql + "[MODIFY_OR]");
		sql = (sql + ", [PAPERS_NAME]");
		sql = (sql + ", [CREATE_TIME]");
		sql = (sql + ", [TIME_LIMIT]");
		sql = (sql + ", [DELETED]");
		sql = (sql + ", [STATUS]");
		sql = (sql + ", [TOTAL_SCORE]");
		sql = (sql + ", [QUESTION_TYPE_SCORE]");
		sql = (sql + ", [QUESTION_TYPE_PER_SCORE]");
		sql = (sql + ", [PAPERS_TYPE]");
		sql = (sql + ")values(");
		if ((testPapers.getPapersId() > 0)) {
			sql = (sql + testPapers.getPapersId());
			sql = (sql + ", ");
		}
		sql = (sql + SqlServerUtils.safeSql(testPapers.getModifyOr().toString()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(testPapers.getPapersName().toString()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getDateSql(testPapers.getCreateTime()));
		sql = (sql + ", ");
		sql = (sql + testPapers.getTimeLimit());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getBoolSql(testPapers.getDeleted()));
		sql = (sql + ", ");
		sql = (sql + testPapers.getStatus());
		sql = (sql + ", ");
		if ((testPapers.totalScore == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + testPapers.getTotalScore());
		}
		sql = (sql + ", ");
		if ((testPapers.questionTypeScore == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(testPapers.getQuestionTypeScore().toString()));
		}
		sql = (sql + ", ");
		if ((testPapers.questionTypePerScore == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(testPapers.getQuestionTypePerScore().toString()));
		}
		sql = (sql + ", ");
		sql = (sql + testPapers.getPapersType());
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((testPapers.getPapersId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_TEST_PAPERS] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_TEST_PAPERS off");
			}
			dataVisit.execSql(sql);
			if ((testPapers.getPapersId() == 0)) {
				testPapers.papersId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入TestPapers对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		TestPapers.insert(dataVisit, this);
	}
	
	/**
	 * 更新TestPapers对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="testPapers">需要更新的考卷</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, TestPapers testPapers, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_TEST_PAPERS] set ";
		sql = (sql + "[MODIFY_OR] = ");
		sql = (sql + SqlServerUtils.safeSql(testPapers.getModifyOr().toString()));
		sql = (sql + ",");
		sql = (sql + "[PAPERS_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(testPapers.getPapersName().toString()));
		sql = (sql + ",");
		sql = (sql + "[CREATE_TIME] = ");
		sql = (sql + SqlServerUtils.getDateSql(testPapers.getCreateTime()));
		sql = (sql + ",");
		sql = (sql + "[TIME_LIMIT] = ");
		sql = (sql + testPapers.getTimeLimit());
		sql = (sql + ",");
		sql = (sql + "[DELETED] = ");
		sql = (sql + SqlServerUtils.getBoolSql(testPapers.getDeleted()));
		sql = (sql + ",");
		sql = (sql + "[STATUS] = ");
		sql = (sql + testPapers.getStatus());
		sql = (sql + ",");
		if ((testPapers.totalScore == null)) {
			sql = (sql + "[TOTAL_SCORE] = default ,");
		}
		else {
			sql = (sql + "[TOTAL_SCORE] = ");
			sql = (sql + testPapers.getTotalScore());
			sql = (sql + ",");
		}
		if ((testPapers.questionTypeScore == null)) {
			sql = (sql + "[QUESTION_TYPE_SCORE] = default ,");
		}
		else {
			sql = (sql + "[QUESTION_TYPE_SCORE] = ");
			sql = (sql + SqlServerUtils.safeSql(testPapers.getQuestionTypeScore().toString()));
			sql = (sql + ",");
		}
		if ((testPapers.questionTypePerScore == null)) {
			sql = (sql + "[QUESTION_TYPE_PER_SCORE] = default ,");
		}
		else {
			sql = (sql + "[QUESTION_TYPE_PER_SCORE] = ");
			sql = (sql + SqlServerUtils.safeSql(testPapers.getQuestionTypePerScore().toString()));
			sql = (sql + ",");
		}
		sql = (sql + "[PAPERS_TYPE] = ");
		sql = (sql + testPapers.getPapersType());
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "PAPERS_ID = ");
		sql = (sql + testPapers.getPapersId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新TestPapers对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="testPapers">需要更新的考卷</param>
	 */
	protected static int update(IDataVisit2 dataVisit, TestPapers testPapers) throws SQLException, DbException {
		return TestPapers.update(dataVisit, testPapers, "");
	}
	
	/**
	 * 更新TestPapers对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return TestPapers.update(dataVisit, this);
	}
	
	/**
	 * 更新TestPapers对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return TestPapers.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.papersName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<TestPapers> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<TestPapers> list = new ArrayList<TestPapers>();
		try {
			for (; reader.next(); ) {
				TestPapers obj = new TestPapers();
				TestPapers.readValue(reader, obj);
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
	public static List<TestPapers> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<TestPapers> list = new ArrayList<TestPapers>();
		try {
			for (; reader.next(); ) {
				TestPapers obj = new TestPapers();
				TestPapers.readValue(reader, obj);
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
	public static List<TestPapers> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((TestPapers.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<TestPapers> list = new ArrayList<TestPapers>();
		try {
			for (; reader.next(); ) {
				TestPapers obj = new TestPapers();
				TestPapers.readValue(reader, obj);
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
	public static List<TestPapers> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((TestPapers.getFullSelectSql() + appendConditionSql));
		List<TestPapers> list = new ArrayList<TestPapers>();
		try {
			for (; reader.next(); ) {
				TestPapers obj = new TestPapers();
				TestPapers.readValue(reader, obj);
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
	public static <T extends TestPapers> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((TestPapers.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			TestPapers.readValue(reader, obj);
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
public static <T extends TestPapers> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((TestPapers.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			TestPapers.readValue(reader, obj);
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
	String sql = "select * from T_TEST_PAPERS ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据考卷标识查询TestPapers
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APapersId">考卷标识</param>
 */
public static TestPapers selectByPapersId(IDataVisit2 dataVisit, int APapersId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "PAPERS_ID = ");
	sql = (sql + APapersId);
	List<TestPapers> list = TestPapers.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个TestPapers对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APapersId">考卷标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByPapersId(IDataVisit2 dataVisit, int APapersId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " update [T_TEST_PAPERS] set DELETED = 1 where ");
	sql = (sql + "PAPERS_ID = ");
	sql = (sql + APapersId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个TestPapers对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APapersId">考卷标识</param>
 */
public static void deleteByPapersId(IDataVisit2 dataVisit, int APapersId) throws SQLException, DbException {
	TestPapers.deleteByPapersId(dataVisit, APapersId, "");
}

/**
 * 从reader读到数据到对象testPapers中
 * <param name="reader">数据源</param>
 * <param name="testPapers">目标对象</param>
 */
public static void readValue(ResultSet reader, TestPapers testPapers) throws SQLException, DbException {
	testPapers.papersId = reader.getInt(1);
	testPapers.modifyOr = reader.getString(2);
	testPapers.papersName = reader.getString(3);
	testPapers.createTime = SqlUtils.getDate(reader, 4);
	testPapers.timeLimit = reader.getInt(5);
	testPapers.deleted = reader.getBoolean(6);
	testPapers.status = reader.getByte(7);
	testPapers.totalScore = reader.getInt(8);
	if (reader.wasNull()) {
		testPapers.totalScore = null;
	}
	testPapers.questionTypeScore = reader.getString(9);
	if (reader.wasNull()) {
		testPapers.questionTypeScore = null;
	}
	testPapers.questionTypePerScore = reader.getString(10);
	if (reader.wasNull()) {
		testPapers.questionTypePerScore = null;
	}
	testPapers.papersType = reader.getByte(11);
}
}
