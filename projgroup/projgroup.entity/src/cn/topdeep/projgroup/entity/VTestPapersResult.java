package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * V_TEST_PAPERS_RESULT: 
 */
public class VTestPapersResult extends common.dbvisit.BaseTable {
	
	/**
	 * PAPERS_QUESTION_ID: 
	 */
	int papersQuestionId;
	
	/**
	 * PAPERS_ID: 
	 */
	int papersId;
	
	/**
	 * QUESTION_ID: 
	 */
	int questionId;
	
	/**
	 * QUESTION_SN: 
	 */
	int questionSn;
	
	/**
	 * ANSWER_CORRECT: 
	 */
	boolean answerCorrect;
	
	/**
	 * ANSWER_TIME: 
	 */
	java.util.Date answerTime;
	
	/**
	 * PAPERS_RESULT_ID: 
	 */
	int papersResultId;
	
	/**
	 * PAPERS_NAME: 
	 */
	String papersName = "";
	
	/**
	 * TESTER_NAME: 
	 */
	String testerName = "";
	
	/**
	 * QUESTION_TYPE: 
	 */
	byte questionType;
	
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
	 * PAPERS_ID: 
	 */
	public int getPapersId() {
		return this.papersId;
	}
	
	/**
	 * PAPERS_ID: 
	 */
	public void setPapersId(int value)
	 {
		this.papersId = value;
	}
	
	/**
	 * QUESTION_ID: 
	 */
	public int getQuestionId() {
		return this.questionId;
	}
	
	/**
	 * QUESTION_ID: 
	 */
	public void setQuestionId(int value)
	 {
		this.questionId = value;
	}
	
	/**
	 * QUESTION_SN: 
	 */
	public int getQuestionSn() {
		return this.questionSn;
	}
	
	/**
	 * QUESTION_SN: 
	 */
	public void setQuestionSn(int value)
	 {
		this.questionSn = value;
	}
	
	/**
	 * ANSWER_CORRECT: 
	 */
	public boolean getAnswerCorrect() {
		return this.answerCorrect;
	}
	
	/**
	 * ANSWER_CORRECT: 
	 */
	public void setAnswerCorrect(boolean value)
	 {
		this.answerCorrect = value;
	}
	
	/**
	 * ANSWER_TIME: 
	 */
	public java.util.Date getAnswerTime() {
		return this.answerTime;
	}
	
	/**
	 * ANSWER_TIME: 
	 */
	public void setAnswerTime(java.util.Date value)
	 {
		this.answerTime = value;
	}
	
	/**
	 * PAPERS_RESULT_ID: 
	 */
	public int getPapersResultId() {
		return this.papersResultId;
	}
	
	/**
	 * PAPERS_RESULT_ID: 
	 */
	public void setPapersResultId(int value)
	 {
		this.papersResultId = value;
	}
	
	/**
	 * PAPERS_NAME: 
	 */
	public String getPapersName() {
		return this.papersName;
	}
	
	/**
	 * PAPERS_NAME: 
	 */
	public void setPapersName(String value)
	 {
		this.papersName = value;
	}
	
	/**
	 * TESTER_NAME: 
	 */
	public String getTesterName() {
		return this.testerName;
	}
	
	/**
	 * TESTER_NAME: 
	 */
	public void setTesterName(String value)
	 {
		this.testerName = value;
	}
	
	/**
	 * QUESTION_TYPE: 
	 */
	public byte getQuestionType() {
		return this.questionType;
	}
	
	/**
	 * QUESTION_TYPE: 
	 */
	public void setQuestionType(byte value)
	 {
		this.questionType = value;
	}
	
	public static String getSelectSql() {
		return "select  [V_TEST_PAPERS_RESULT].[PAPERS_QUESTION_ID], [V_TEST_PAPERS_RESULT].[PAPERS_ID], [V_TEST_PAPERS_RESULT].[QUESTION_ID], [V_TEST_PAPERS_RESULT].[QUESTION_SN], [V_TEST_PAPERS_RESULT].[ANSWER_CORRECT], [V_TEST_PAPERS_RESULT].[ANSWER_TIME], [V_TEST_PAPERS_RESULT].[PAPERS_RESULT_ID], [V_TEST_PAPERS_RESULT].[PAPERS_NAME], [V_TEST_PAPERS_RESULT].[TESTER_NAME], [V_TEST_PAPERS_RESULT].[QUESTION_TYPE]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [V_TEST_PAPERS_RESULT].[PAPERS_QUESTION_ID], [V_TEST_PAPERS_RESULT].[PAPERS_ID], [V_TEST_PAPERS_RESULT].[QUESTION_ID], [V_TEST_PAPERS_RESULT].[QUESTION_SN], [V_TEST_PAPERS_RESULT].[ANSWER_CORRECT], [V_TEST_PAPERS_RESULT].[ANSWER_TIME], [V_TEST_PAPERS_RESULT].[PAPERS_RESULT_ID], [V_TEST_PAPERS_RESULT].[PAPERS_NAME], [V_TEST_PAPERS_RESULT].[TESTER_NAME], [V_TEST_PAPERS_RESULT].[QUESTION_TYPE]   from [V_TEST_PAPERS_RESULT] ";
	}
	
	
	public static String getColumnSql() {
		return " [V_TEST_PAPERS_RESULT].[PAPERS_QUESTION_ID], [V_TEST_PAPERS_RESULT].[PAPERS_ID], [V_TEST_PAPERS_RESULT].[QUESTION_ID], [V_TEST_PAPERS_RESULT].[QUESTION_SN], [V_TEST_PAPERS_RESULT].[ANSWER_CORRECT], [V_TEST_PAPERS_RESULT].[ANSWER_TIME], [V_TEST_PAPERS_RESULT].[PAPERS_RESULT_ID], [V_TEST_PAPERS_RESULT].[PAPERS_NAME], [V_TEST_PAPERS_RESULT].[TESTER_NAME], [V_TEST_PAPERS_RESULT].[QUESTION_TYPE] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "V_TEST_PAPERS_RESULT";
	}
	
	
	public String getTableName() {
		return "V_TEST_PAPERS_RESULT";
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (VTestPapersResult.class.isInstance(obj)) {
			VTestPapersResult o = ((VTestPapersResult)(obj));
			this.papersQuestionId = o.papersQuestionId;
			this.papersId = o.papersId;
			this.questionId = o.questionId;
			this.questionSn = o.questionSn;
			this.answerCorrect = o.answerCorrect;
			this.answerTime = o.answerTime;
			this.papersResultId = o.papersResultId;
			this.papersName = o.papersName;
			this.testerName = o.testerName;
			this.questionType = o.questionType;
		}
	}
	
	public String toString() {
		return this.papersName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<VTestPapersResult> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<VTestPapersResult> list = new ArrayList<VTestPapersResult>();
		try {
			for (; reader.next(); ) {
				VTestPapersResult obj = new VTestPapersResult();
				VTestPapersResult.readValue(reader, obj);
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
	public static List<VTestPapersResult> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<VTestPapersResult> list = new ArrayList<VTestPapersResult>();
		try {
			for (; reader.next(); ) {
				VTestPapersResult obj = new VTestPapersResult();
				VTestPapersResult.readValue(reader, obj);
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
	public static List<VTestPapersResult> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((VTestPapersResult.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<VTestPapersResult> list = new ArrayList<VTestPapersResult>();
		try {
			for (; reader.next(); ) {
				VTestPapersResult obj = new VTestPapersResult();
				VTestPapersResult.readValue(reader, obj);
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
	public static List<VTestPapersResult> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((VTestPapersResult.getFullSelectSql() + appendConditionSql));
		List<VTestPapersResult> list = new ArrayList<VTestPapersResult>();
		try {
			for (; reader.next(); ) {
				VTestPapersResult obj = new VTestPapersResult();
				VTestPapersResult.readValue(reader, obj);
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
	public static <T extends VTestPapersResult> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((VTestPapersResult.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			VTestPapersResult.readValue(reader, obj);
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
public static <T extends VTestPapersResult> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((VTestPapersResult.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			VTestPapersResult.readValue(reader, obj);
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
	String sql = "select * from V_TEST_PAPERS_RESULT ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 从reader读到数据到对象vTestPapersResult中
 * <param name="reader">数据源</param>
 * <param name="vTestPapersResult">目标对象</param>
 */
public static void readValue(ResultSet reader, VTestPapersResult vTestPapersResult) throws SQLException, DbException {
	vTestPapersResult.papersQuestionId = reader.getInt(1);
	vTestPapersResult.papersId = reader.getInt(2);
	vTestPapersResult.questionId = reader.getInt(3);
	vTestPapersResult.questionSn = reader.getInt(4);
	vTestPapersResult.answerCorrect = reader.getBoolean(5);
	vTestPapersResult.answerTime = SqlUtils.getDate(reader, 6);
	vTestPapersResult.papersResultId = reader.getInt(7);
	vTestPapersResult.papersName = reader.getString(8);
	vTestPapersResult.testerName = reader.getString(9);
	vTestPapersResult.questionType = reader.getByte(10);
}
}
