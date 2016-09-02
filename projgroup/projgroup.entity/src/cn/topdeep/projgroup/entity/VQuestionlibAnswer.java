package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * V_QUESTIONLIB_ANSWER: 
 */
public class VQuestionlibAnswer extends common.dbvisit.BaseTable {
	
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
	 * ANSWER_ID: 
	 */
	int answerId;
	
	/**
	 * ANSWER_CONTENT: 
	 */
	String answerContent = "";
	
	/**
	 * IS_ANSWER: 
	 */
	boolean isAnswer;
	
	/**
	 * ANSWER_ORDER: 
	 */
	int answerOrder;
	
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
	 * ANSWER_ID: 
	 */
	public int getAnswerId() {
		return this.answerId;
	}
	
	/**
	 * ANSWER_ID: 
	 */
	public void setAnswerId(int value)
	 {
		this.answerId = value;
	}
	
	/**
	 * ANSWER_CONTENT: 
	 */
	public String getAnswerContent() {
		return this.answerContent;
	}
	
	/**
	 * ANSWER_CONTENT: 
	 */
	public void setAnswerContent(String value)
	 {
		this.answerContent = value;
	}
	
	/**
	 * IS_ANSWER: 
	 */
	public boolean getIsAnswer() {
		return this.isAnswer;
	}
	
	/**
	 * IS_ANSWER: 
	 */
	public void setIsAnswer(boolean value)
	 {
		this.isAnswer = value;
	}
	
	/**
	 * ANSWER_ORDER: 
	 */
	public int getAnswerOrder() {
		return this.answerOrder;
	}
	
	/**
	 * ANSWER_ORDER: 
	 */
	public void setAnswerOrder(int value)
	 {
		this.answerOrder = value;
	}
	
	public static String getSelectSql() {
		return "select  [V_QUESTIONLIB_ANSWER].[QUESTION_ID], [V_QUESTIONLIB_ANSWER].[CATEGORY_ID], [V_QUESTIONLIB_ANSWER].[MODIFY_OR], [V_QUESTIONLIB_ANSWER].[QUESTION_TYPE], [V_QUESTIONLIB_ANSWER].[QUESTION_CONTENT], [V_QUESTIONLIB_ANSWER].[CREATE_TIME], [V_QUESTIONLIB_ANSWER].[DELETED], [V_QUESTIONLIB_ANSWER].[MODIFY_TIME], [V_QUESTIONLIB_ANSWER].[ANSWER_ID], [V_QUESTIONLIB_ANSWER].[ANSWER_CONTENT], [V_QUESTIONLIB_ANSWER].[IS_ANSWER], [V_QUESTIONLIB_ANSWER].[ANSWER_ORDER]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [V_QUESTIONLIB_ANSWER].[QUESTION_ID], [V_QUESTIONLIB_ANSWER].[CATEGORY_ID], [V_QUESTIONLIB_ANSWER].[MODIFY_OR], [V_QUESTIONLIB_ANSWER].[QUESTION_TYPE], [V_QUESTIONLIB_ANSWER].[QUESTION_CONTENT], [V_QUESTIONLIB_ANSWER].[CREATE_TIME], [V_QUESTIONLIB_ANSWER].[DELETED], [V_QUESTIONLIB_ANSWER].[MODIFY_TIME], [V_QUESTIONLIB_ANSWER].[ANSWER_ID], [V_QUESTIONLIB_ANSWER].[ANSWER_CONTENT], [V_QUESTIONLIB_ANSWER].[IS_ANSWER], [V_QUESTIONLIB_ANSWER].[ANSWER_ORDER]   from [V_QUESTIONLIB_ANSWER] ";
	}
	
	
	public static String getColumnSql() {
		return " [V_QUESTIONLIB_ANSWER].[QUESTION_ID], [V_QUESTIONLIB_ANSWER].[CATEGORY_ID], [V_QUESTIONLIB_ANSWER].[MODIFY_OR], [V_QUESTIONLIB_ANSWER].[QUESTION_TYPE], [V_QUESTIONLIB_ANSWER].[QUESTION_CONTENT], [V_QUESTIONLIB_ANSWER].[CREATE_TIME], [V_QUESTIONLIB_ANSWER].[DELETED], [V_QUESTIONLIB_ANSWER].[MODIFY_TIME], [V_QUESTIONLIB_ANSWER].[ANSWER_ID], [V_QUESTIONLIB_ANSWER].[ANSWER_CONTENT], [V_QUESTIONLIB_ANSWER].[IS_ANSWER], [V_QUESTIONLIB_ANSWER].[ANSWER_ORDER] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "V_QUESTIONLIB_ANSWER";
	}
	
	
	public String getTableName() {
		return "V_QUESTIONLIB_ANSWER";
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (VQuestionlibAnswer.class.isInstance(obj)) {
			VQuestionlibAnswer o = ((VQuestionlibAnswer)(obj));
			this.questionId = o.questionId;
			this.categoryId = o.categoryId;
			this.modifyOr = o.modifyOr;
			this.questionType = o.questionType;
			this.questionContent = o.questionContent;
			this.createTime = o.createTime;
			this.deleted = o.deleted;
			this.modifyTime = o.modifyTime;
			this.answerId = o.answerId;
			this.answerContent = o.answerContent;
			this.isAnswer = o.isAnswer;
			this.answerOrder = o.answerOrder;
		}
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<VQuestionlibAnswer> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<VQuestionlibAnswer> list = new ArrayList<VQuestionlibAnswer>();
		try {
			for (; reader.next(); ) {
				VQuestionlibAnswer obj = new VQuestionlibAnswer();
				VQuestionlibAnswer.readValue(reader, obj);
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
	public static List<VQuestionlibAnswer> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<VQuestionlibAnswer> list = new ArrayList<VQuestionlibAnswer>();
		try {
			for (; reader.next(); ) {
				VQuestionlibAnswer obj = new VQuestionlibAnswer();
				VQuestionlibAnswer.readValue(reader, obj);
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
	public static List<VQuestionlibAnswer> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((VQuestionlibAnswer.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<VQuestionlibAnswer> list = new ArrayList<VQuestionlibAnswer>();
		try {
			for (; reader.next(); ) {
				VQuestionlibAnswer obj = new VQuestionlibAnswer();
				VQuestionlibAnswer.readValue(reader, obj);
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
	public static List<VQuestionlibAnswer> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((VQuestionlibAnswer.getFullSelectSql() + appendConditionSql));
		List<VQuestionlibAnswer> list = new ArrayList<VQuestionlibAnswer>();
		try {
			for (; reader.next(); ) {
				VQuestionlibAnswer obj = new VQuestionlibAnswer();
				VQuestionlibAnswer.readValue(reader, obj);
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
	public static <T extends VQuestionlibAnswer> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((VQuestionlibAnswer.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			VQuestionlibAnswer.readValue(reader, obj);
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
public static <T extends VQuestionlibAnswer> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((VQuestionlibAnswer.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			VQuestionlibAnswer.readValue(reader, obj);
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
	String sql = "select * from V_QUESTIONLIB_ANSWER ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 从reader读到数据到对象vQuestionlibAnswer中
 * <param name="reader">数据源</param>
 * <param name="vQuestionlibAnswer">目标对象</param>
 */
public static void readValue(ResultSet reader, VQuestionlibAnswer vQuestionlibAnswer) throws SQLException, DbException {
	vQuestionlibAnswer.questionId = reader.getInt(1);
	vQuestionlibAnswer.categoryId = reader.getInt(2);
	vQuestionlibAnswer.modifyOr = reader.getString(3);
	vQuestionlibAnswer.questionType = reader.getByte(4);
	vQuestionlibAnswer.questionContent = reader.getString(5);
	vQuestionlibAnswer.createTime = SqlUtils.getDate(reader, 6);
	vQuestionlibAnswer.deleted = reader.getBoolean(7);
	vQuestionlibAnswer.modifyTime = SqlUtils.getDate(reader, 8);
	vQuestionlibAnswer.answerId = reader.getInt(9);
	vQuestionlibAnswer.answerContent = reader.getString(10);
	vQuestionlibAnswer.isAnswer = reader.getBoolean(11);
	vQuestionlibAnswer.answerOrder = reader.getInt(12);
}
}
