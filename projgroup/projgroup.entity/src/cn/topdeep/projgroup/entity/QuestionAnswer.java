package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_QUESTION_ANSWER: 题目答案
 */
public class QuestionAnswer extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * ANSWER_ID: 答案标识
	 */
	int answerId;
	
	/**
	 * QUESTION_ID: 题目标识
	 */
	int questionId;
	
	/**
	 * QUESTION_CONTENT: 答案内容
	 */
	String questionContent = "";
	
	/**
	 * IS_ANSWER: 是否是正确答案
	 */
	boolean isAnswer;
	
	/**
	 * ANSWER_ORDER: 答案顺序
	 */
	int answerOrder;
	
	/**
	 * ANSWER_ID: 答案标识
	 */
	public int getAnswerId() {
		return this.answerId;
	}
	
	/**
	 * ANSWER_ID: 答案标识
	 */
	public void setAnswerId(int value)
	 {
		this.answerId = value;
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
	 * QUESTION_CONTENT: 答案内容
	 */
	public String getQuestionContent() {
		return this.questionContent;
	}
	
	/**
	 * QUESTION_CONTENT: 答案内容
	 */
	public void setQuestionContent(String value)
	 {
		this.questionContent = value;
	}
	
	/**
	 * IS_ANSWER: 是否是正确答案
	 */
	public boolean getIsAnswer() {
		return this.isAnswer;
	}
	
	/**
	 * IS_ANSWER: 是否是正确答案
	 */
	public void setIsAnswer(boolean value)
	 {
		this.isAnswer = value;
	}
	
	/**
	 * ANSWER_ORDER: 答案顺序
	 */
	public int getAnswerOrder() {
		return this.answerOrder;
	}
	
	/**
	 * ANSWER_ORDER: 答案顺序
	 */
	public void setAnswerOrder(int value)
	 {
		this.answerOrder = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_QUESTION_ANSWER].[ANSWER_ID], [T_QUESTION_ANSWER].[QUESTION_ID], [T_QU" +
"ESTION_ANSWER].[QUESTION_CONTENT], [T_QUESTION_ANSWER].[IS_ANSWER], [T_QUESTION_" +
"ANSWER].[ANSWER_ORDER]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_QUESTION_ANSWER].[ANSWER_ID], [T_QUESTION_ANSWER].[QUESTION_ID], [T_QU" +
"ESTION_ANSWER].[QUESTION_CONTENT], [T_QUESTION_ANSWER].[IS_ANSWER], [T_QUESTION_" +
"ANSWER].[ANSWER_ORDER]   from [T_QUESTION_ANSWER] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_QUESTION_ANSWER].[ANSWER_ID], [T_QUESTION_ANSWER].[QUESTION_ID], [T_QUESTION_" +
"ANSWER].[QUESTION_CONTENT], [T_QUESTION_ANSWER].[IS_ANSWER], [T_QUESTION_ANSWER]" +
".[ANSWER_ORDER] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_QUESTION_ANSWER";
	}
	
	
	public String getTableName() {
		return "T_QUESTION_ANSWER";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "ANSWER_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.answerId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (QuestionAnswer.class.isInstance(obj)) {
			QuestionAnswer o = ((QuestionAnswer)(obj));
			this.answerId = o.answerId;
			this.questionId = o.questionId;
			this.questionContent = o.questionContent;
			this.isAnswer = o.isAnswer;
			this.answerOrder = o.answerOrder;
		}
	}
	
	/**
	 * 插入QuestionAnswer对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="questionAnswer">需要插入的题目答案</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, QuestionAnswer questionAnswer) throws SQLException, DbException {
		String sql = "insert into [T_QUESTION_ANSWER](";
		if ((questionAnswer.getAnswerId() > 0)) {
			sql = (sql + "[ANSWER_ID], ");
		}
		sql = (sql + "[QUESTION_ID]");
		sql = (sql + ", [QUESTION_CONTENT]");
		sql = (sql + ", [IS_ANSWER]");
		sql = (sql + ", [ANSWER_ORDER]");
		sql = (sql + ")values(");
		if ((questionAnswer.getAnswerId() > 0)) {
			sql = (sql + questionAnswer.getAnswerId());
			sql = (sql + ", ");
		}
		sql = (sql + questionAnswer.getQuestionId());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(questionAnswer.getQuestionContent().toString()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getBoolSql(questionAnswer.getIsAnswer()));
		sql = (sql + ", ");
		sql = (sql + questionAnswer.getAnswerOrder());
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((questionAnswer.getAnswerId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_QUESTION_ANSWER] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_QUESTION_ANSWER off");
			}
			dataVisit.execSql(sql);
			if ((questionAnswer.getAnswerId() == 0)) {
				questionAnswer.answerId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入QuestionAnswer对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		QuestionAnswer.insert(dataVisit, this);
	}
	
	/**
	 * 更新QuestionAnswer对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="questionAnswer">需要更新的题目答案</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, QuestionAnswer questionAnswer, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_QUESTION_ANSWER] set ";
		sql = (sql + "[QUESTION_ID] = ");
		sql = (sql + questionAnswer.getQuestionId());
		sql = (sql + ",");
		sql = (sql + "[QUESTION_CONTENT] = ");
		sql = (sql + SqlServerUtils.safeSql(questionAnswer.getQuestionContent().toString()));
		sql = (sql + ",");
		sql = (sql + "[IS_ANSWER] = ");
		sql = (sql + SqlServerUtils.getBoolSql(questionAnswer.getIsAnswer()));
		sql = (sql + ",");
		sql = (sql + "[ANSWER_ORDER] = ");
		sql = (sql + questionAnswer.getAnswerOrder());
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "ANSWER_ID = ");
		sql = (sql + questionAnswer.getAnswerId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新QuestionAnswer对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="questionAnswer">需要更新的题目答案</param>
	 */
	protected static int update(IDataVisit2 dataVisit, QuestionAnswer questionAnswer) throws SQLException, DbException {
		return QuestionAnswer.update(dataVisit, questionAnswer, "");
	}
	
	/**
	 * 更新QuestionAnswer对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return QuestionAnswer.update(dataVisit, this);
	}
	
	/**
	 * 更新QuestionAnswer对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return QuestionAnswer.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<QuestionAnswer> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<QuestionAnswer> list = new ArrayList<QuestionAnswer>();
		try {
			for (; reader.next(); ) {
				QuestionAnswer obj = new QuestionAnswer();
				QuestionAnswer.readValue(reader, obj);
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
	public static List<QuestionAnswer> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<QuestionAnswer> list = new ArrayList<QuestionAnswer>();
		try {
			for (; reader.next(); ) {
				QuestionAnswer obj = new QuestionAnswer();
				QuestionAnswer.readValue(reader, obj);
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
	public static List<QuestionAnswer> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((QuestionAnswer.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<QuestionAnswer> list = new ArrayList<QuestionAnswer>();
		try {
			for (; reader.next(); ) {
				QuestionAnswer obj = new QuestionAnswer();
				QuestionAnswer.readValue(reader, obj);
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
	public static List<QuestionAnswer> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((QuestionAnswer.getFullSelectSql() + appendConditionSql));
		List<QuestionAnswer> list = new ArrayList<QuestionAnswer>();
		try {
			for (; reader.next(); ) {
				QuestionAnswer obj = new QuestionAnswer();
				QuestionAnswer.readValue(reader, obj);
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
	public static <T extends QuestionAnswer> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((QuestionAnswer.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			QuestionAnswer.readValue(reader, obj);
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
public static <T extends QuestionAnswer> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((QuestionAnswer.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			QuestionAnswer.readValue(reader, obj);
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
	String sql = "select * from T_QUESTION_ANSWER ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据答案标识查询QuestionAnswer
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AAnswerId">答案标识</param>
 */
public static QuestionAnswer selectByAnswerId(IDataVisit2 dataVisit, int AAnswerId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "ANSWER_ID = ");
	sql = (sql + AAnswerId);
	List<QuestionAnswer> list = QuestionAnswer.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个QuestionAnswer对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AAnswerId">答案标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByAnswerId(IDataVisit2 dataVisit, int AAnswerId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_QUESTION_ANSWER] where ");
	sql = (sql + "ANSWER_ID = ");
	sql = (sql + AAnswerId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个QuestionAnswer对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AAnswerId">答案标识</param>
 */
public static void deleteByAnswerId(IDataVisit2 dataVisit, int AAnswerId) throws SQLException, DbException {
	QuestionAnswer.deleteByAnswerId(dataVisit, AAnswerId, "");
}

/**
 * 根据外键题目标识删除一批QuestionAnswer对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="QuestionId">题目标识</param>
 */
public static void deleteListByQuestionId(IDataVisit2 dataVisit, int AQuestionId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_QUESTION_ANSWER] where ");
	sql = (sql + "QUESTION_ID = ");
	sql = (sql + AQuestionId);
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
public static List<QuestionAnswer> selectObjectsByQuestionId(IDataVisit2 dataVisit, int AQuestionId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where QUESTION_ID = ";
	sql = (sql + AQuestionId);
	sql = (sql + appendConditionSql);
	return QuestionAnswer.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
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
public static List<QuestionAnswer> selectObjectsByQuestionId(IDataVisit2 dataVisit, int AQuestionId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where QUESTION_ID = ";
	sql = (sql + AQuestionId);
	return QuestionAnswer.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="QuestionId">题目标识</param>
 */
public static List<QuestionAnswer> selectObjectsByQuestionId(IDataVisit2 dataVisit, int AQuestionId) throws SQLException, DbException {
	String sql = " where QUESTION_ID = ";
	sql = (sql + AQuestionId);
	return QuestionAnswer.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象questionAnswer中
 * <param name="reader">数据源</param>
 * <param name="questionAnswer">目标对象</param>
 */
public static void readValue(ResultSet reader, QuestionAnswer questionAnswer) throws SQLException, DbException {
	questionAnswer.answerId = reader.getInt(1);
	questionAnswer.questionId = reader.getInt(2);
	questionAnswer.questionContent = reader.getString(3);
	questionAnswer.isAnswer = reader.getBoolean(4);
	questionAnswer.answerOrder = reader.getInt(5);
}
}
