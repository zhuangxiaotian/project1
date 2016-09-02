package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * V_TEST_PAPERS_QUESTION: 
 */
public class VTestPapersQuestion extends common.dbvisit.BaseTable {
	
	/**
	 * QUESTION_ID: 
	 */
	int questionId;
	
	/**
	 * CATEGORY_ID: 
	 */
	int categoryId;
	
	/**
	 * MODIFY_OR: 
	 */
	String modifyOr = "";
	
	/**
	 * QUESTION_TYPE: 
	 */
	byte questionType;
	
	/**
	 * QUESTION_CONTENT: 
	 */
	String questionContent = "";
	
	/**
	 * CREATE_TIME: 
	 */
	java.util.Date createTime;
	
	/**
	 * DELETED: 
	 */
	boolean deleted;
	
	/**
	 * MODIFY_TIME: 
	 */
	java.util.Date modifyTime;
	
	/**
	 * PAPERS_ID: 
	 */
	int papersId;
	
	/**
	 * PAPERS_QUESTION_ID: 
	 */
	Integer papersQuestionId;
	
	/**
	 * QUESTION_SN: 
	 */
	Integer questionSn;
	
	/**
	 * CATEGORY_NAME: 
	 */
	String categoryName = "";
	
	/**
	 * CATEGORY_DESC: 
	 */
	String categoryDesc;
	
	/**
	 * QUESTION_CATEGORY_DELETED: 
	 */
	boolean questionCategoryDeleted;
	
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
	 * CATEGORY_ID: 
	 */
	public int getCategoryId() {
		return this.categoryId;
	}
	
	/**
	 * CATEGORY_ID: 
	 */
	public void setCategoryId(int value)
	 {
		this.categoryId = value;
	}
	
	/**
	 * MODIFY_OR: 
	 */
	public String getModifyOr() {
		return this.modifyOr;
	}
	
	/**
	 * MODIFY_OR: 
	 */
	public void setModifyOr(String value)
	 {
		this.modifyOr = value;
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
	
	/**
	 * QUESTION_CONTENT: 
	 */
	public String getQuestionContent() {
		return this.questionContent;
	}
	
	/**
	 * QUESTION_CONTENT: 
	 */
	public void setQuestionContent(String value)
	 {
		this.questionContent = value;
	}
	
	/**
	 * CREATE_TIME: 
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	
	/**
	 * CREATE_TIME: 
	 */
	public void setCreateTime(java.util.Date value)
	 {
		this.createTime = value;
	}
	
	/**
	 * DELETED: 
	 */
	public boolean getDeleted() {
		return this.deleted;
	}
	
	/**
	 * DELETED: 
	 */
	public void setDeleted(boolean value)
	 {
		this.deleted = value;
	}
	
	/**
	 * MODIFY_TIME: 
	 */
	public java.util.Date getModifyTime() {
		return this.modifyTime;
	}
	
	/**
	 * MODIFY_TIME: 
	 */
	public void setModifyTime(java.util.Date value)
	 {
		this.modifyTime = value;
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
	 * PAPERS_QUESTION_ID: 
	 */
	public Integer getPapersQuestionId() {
		return this.papersQuestionId;
	}
	
	/**
	 * PAPERS_QUESTION_ID: 
	 */
	public void setPapersQuestionId(Integer value)
	 {
		this.papersQuestionId = value;
	}
	
	/**
	 * QUESTION_SN: 
	 */
	public Integer getQuestionSn() {
		return this.questionSn;
	}
	
	/**
	 * QUESTION_SN: 
	 */
	public void setQuestionSn(Integer value)
	 {
		this.questionSn = value;
	}
	
	/**
	 * CATEGORY_NAME: 
	 */
	public String getCategoryName() {
		return this.categoryName;
	}
	
	/**
	 * CATEGORY_NAME: 
	 */
	public void setCategoryName(String value)
	 {
		this.categoryName = value;
	}
	
	/**
	 * CATEGORY_DESC: 
	 */
	public String getCategoryDesc() {
		return this.categoryDesc;
	}
	
	/**
	 * CATEGORY_DESC: 
	 */
	public void setCategoryDesc(String value)
	 {
		this.categoryDesc = value;
	}
	
	/**
	 * QUESTION_CATEGORY_DELETED: 
	 */
	public boolean getQuestionCategoryDeleted() {
		return this.questionCategoryDeleted;
	}
	
	/**
	 * QUESTION_CATEGORY_DELETED: 
	 */
	public void setQuestionCategoryDeleted(boolean value)
	 {
		this.questionCategoryDeleted = value;
	}
	
	public static String getSelectSql() {
		return "select  [V_TEST_PAPERS_QUESTION].[QUESTION_ID], [V_TEST_PAPERS_QUESTION].[CATEGORY_ID], [V_TEST_PAPERS_QUESTION].[MODIFY_OR], [V_TEST_PAPERS_QUESTION].[QUESTION_TYPE], [V_TEST_PAPERS_QUESTION].[QUESTION_CONTENT], [V_TEST_PAPERS_QUESTION].[CREATE_TIME], [V_TEST_PAPERS_QUESTION].[DELETED], [V_TEST_PAPERS_QUESTION].[MODIFY_TIME], [V_TEST_PAPERS_QUESTION].[PAPERS_ID], [V_TEST_PAPERS_QUESTION].[PAPERS_QUESTION_ID], [V_TEST_PAPERS_QUESTION].[QUESTION_SN], [V_TEST_PAPERS_QUESTION].[CATEGORY_NAME], [V_TEST_PAPERS_QUESTION].[CATEGORY_DESC], [V_TEST_PAPERS_QUESTION].[QUESTION_CATEGORY_DELETED]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [V_TEST_PAPERS_QUESTION].[QUESTION_ID], [V_TEST_PAPERS_QUESTION].[CATEGORY_ID], [V_TEST_PAPERS_QUESTION].[MODIFY_OR], [V_TEST_PAPERS_QUESTION].[QUESTION_TYPE], [V_TEST_PAPERS_QUESTION].[QUESTION_CONTENT], [V_TEST_PAPERS_QUESTION].[CREATE_TIME], [V_TEST_PAPERS_QUESTION].[DELETED], [V_TEST_PAPERS_QUESTION].[MODIFY_TIME], [V_TEST_PAPERS_QUESTION].[PAPERS_ID], [V_TEST_PAPERS_QUESTION].[PAPERS_QUESTION_ID], [V_TEST_PAPERS_QUESTION].[QUESTION_SN], [V_TEST_PAPERS_QUESTION].[CATEGORY_NAME], [V_TEST_PAPERS_QUESTION].[CATEGORY_DESC], [V_TEST_PAPERS_QUESTION].[QUESTION_CATEGORY_DELETED]   from [V_TEST_PAPERS_QUESTION] ";
	}
	
	
	public static String getColumnSql() {
		return " [V_TEST_PAPERS_QUESTION].[QUESTION_ID], [V_TEST_PAPERS_QUESTION].[CATEGORY_ID], [V_TEST_PAPERS_QUESTION].[MODIFY_OR], [V_TEST_PAPERS_QUESTION].[QUESTION_TYPE], [V_TEST_PAPERS_QUESTION].[QUESTION_CONTENT], [V_TEST_PAPERS_QUESTION].[CREATE_TIME], [V_TEST_PAPERS_QUESTION].[DELETED], [V_TEST_PAPERS_QUESTION].[MODIFY_TIME], [V_TEST_PAPERS_QUESTION].[PAPERS_ID], [V_TEST_PAPERS_QUESTION].[PAPERS_QUESTION_ID], [V_TEST_PAPERS_QUESTION].[QUESTION_SN], [V_TEST_PAPERS_QUESTION].[CATEGORY_NAME], [V_TEST_PAPERS_QUESTION].[CATEGORY_DESC], [V_TEST_PAPERS_QUESTION].[QUESTION_CATEGORY_DELETED] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "V_TEST_PAPERS_QUESTION";
	}
	
	
	public String getTableName() {
		return "V_TEST_PAPERS_QUESTION";
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (VTestPapersQuestion.class.isInstance(obj)) {
			VTestPapersQuestion o = ((VTestPapersQuestion)(obj));
			this.questionId = o.questionId;
			this.categoryId = o.categoryId;
			this.modifyOr = o.modifyOr;
			this.questionType = o.questionType;
			this.questionContent = o.questionContent;
			this.createTime = o.createTime;
			this.deleted = o.deleted;
			this.modifyTime = o.modifyTime;
			this.papersId = o.papersId;
			this.papersQuestionId = o.papersQuestionId;
			this.questionSn = o.questionSn;
			this.categoryName = o.categoryName;
			this.categoryDesc = o.categoryDesc;
			this.questionCategoryDeleted = o.questionCategoryDeleted;
		}
	}
	
	public String toString() {
		return this.categoryName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<VTestPapersQuestion> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<VTestPapersQuestion> list = new ArrayList<VTestPapersQuestion>();
		try {
			for (; reader.next(); ) {
				VTestPapersQuestion obj = new VTestPapersQuestion();
				VTestPapersQuestion.readValue(reader, obj);
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
	public static List<VTestPapersQuestion> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<VTestPapersQuestion> list = new ArrayList<VTestPapersQuestion>();
		try {
			for (; reader.next(); ) {
				VTestPapersQuestion obj = new VTestPapersQuestion();
				VTestPapersQuestion.readValue(reader, obj);
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
	public static List<VTestPapersQuestion> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((VTestPapersQuestion.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<VTestPapersQuestion> list = new ArrayList<VTestPapersQuestion>();
		try {
			for (; reader.next(); ) {
				VTestPapersQuestion obj = new VTestPapersQuestion();
				VTestPapersQuestion.readValue(reader, obj);
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
	public static List<VTestPapersQuestion> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((VTestPapersQuestion.getFullSelectSql() + appendConditionSql));
		List<VTestPapersQuestion> list = new ArrayList<VTestPapersQuestion>();
		try {
			for (; reader.next(); ) {
				VTestPapersQuestion obj = new VTestPapersQuestion();
				VTestPapersQuestion.readValue(reader, obj);
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
	public static <T extends VTestPapersQuestion> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((VTestPapersQuestion.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			VTestPapersQuestion.readValue(reader, obj);
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
public static <T extends VTestPapersQuestion> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((VTestPapersQuestion.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			VTestPapersQuestion.readValue(reader, obj);
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
	String sql = "select * from V_TEST_PAPERS_QUESTION ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 从reader读到数据到对象vTestPapersQuestion中
 * <param name="reader">数据源</param>
 * <param name="vTestPapersQuestion">目标对象</param>
 */
public static void readValue(ResultSet reader, VTestPapersQuestion vTestPapersQuestion) throws SQLException, DbException {
	vTestPapersQuestion.questionId = reader.getInt(1);
	vTestPapersQuestion.categoryId = reader.getInt(2);
	vTestPapersQuestion.modifyOr = reader.getString(3);
	vTestPapersQuestion.questionType = reader.getByte(4);
	vTestPapersQuestion.questionContent = reader.getString(5);
	vTestPapersQuestion.createTime = SqlUtils.getDate(reader, 6);
	vTestPapersQuestion.deleted = reader.getBoolean(7);
	vTestPapersQuestion.modifyTime = SqlUtils.getDate(reader, 8);
	vTestPapersQuestion.papersId = reader.getInt(9);
	vTestPapersQuestion.papersQuestionId = reader.getInt(10);
	if (reader.wasNull()) {
		vTestPapersQuestion.papersQuestionId = null;
	}
	vTestPapersQuestion.questionSn = reader.getInt(11);
	if (reader.wasNull()) {
		vTestPapersQuestion.questionSn = null;
	}
	vTestPapersQuestion.categoryName = reader.getString(12);
	vTestPapersQuestion.categoryDesc = reader.getString(13);
	if (reader.wasNull()) {
		vTestPapersQuestion.categoryDesc = null;
	}
	vTestPapersQuestion.questionCategoryDeleted = reader.getBoolean(14);
}
}
