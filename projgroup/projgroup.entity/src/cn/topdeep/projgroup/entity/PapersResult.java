package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_PAPERS_RESULT: 考试结果
 */
public class PapersResult extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * PAPERS_RESULT_ID: 回答标识
	 */
	int papersResultId;
	
	/**
	 * TESTER_NAME: testername
	 */
	String testerName = "";
	
	/**
	 * PAPERS_QUESTION_ID: 考题标识
	 */
	int papersQuestionId;
	
	/**
	 * ANSWER_CORRECT: 回答正确否
	 */
	boolean answerCorrect;
	
	/**
	 * ANSWER_TIME: 回答时间
	 */
	java.util.Date answerTime;
	
	/**
	 * ANSWER_SECOND: 答题用时,以秒为单位
	 */
	int answerSecond;
	
	/**
	 * PAPERS_RESULT_ID: 回答标识
	 */
	public int getPapersResultId() {
		return this.papersResultId;
	}
	
	/**
	 * PAPERS_RESULT_ID: 回答标识
	 */
	public void setPapersResultId(int value)
	 {
		this.papersResultId = value;
	}
	
	/**
	 * TESTER_NAME: testername
	 */
	public String getTesterName() {
		return this.testerName;
	}
	
	/**
	 * TESTER_NAME: testername
	 */
	public void setTesterName(String value)
	 {
		this.testerName = value;
	}
	
	/**
	 * PAPERS_QUESTION_ID: 考题标识
	 */
	public int getPapersQuestionId() {
		return this.papersQuestionId;
	}
	
	/**
	 * PAPERS_QUESTION_ID: 考题标识
	 */
	public void setPapersQuestionId(int value)
	 {
		this.papersQuestionId = value;
	}
	
	/**
	 * ANSWER_CORRECT: 回答正确否
	 */
	public boolean getAnswerCorrect() {
		return this.answerCorrect;
	}
	
	/**
	 * ANSWER_CORRECT: 回答正确否
	 */
	public void setAnswerCorrect(boolean value)
	 {
		this.answerCorrect = value;
	}
	
	/**
	 * ANSWER_TIME: 回答时间
	 */
	public java.util.Date getAnswerTime() {
		return this.answerTime;
	}
	
	/**
	 * ANSWER_TIME: 回答时间
	 */
	public void setAnswerTime(java.util.Date value)
	 {
		this.answerTime = value;
	}
	
	/**
	 * ANSWER_SECOND: 答题用时,以秒为单位
	 */
	public int getAnswerSecond() {
		return this.answerSecond;
	}
	
	/**
	 * ANSWER_SECOND: 答题用时,以秒为单位
	 */
	public void setAnswerSecond(int value)
	 {
		this.answerSecond = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_PAPERS_RESULT].[PAPERS_RESULT_ID], [T_PAPERS_RESULT].[TESTER_NAME], [T" +
"_PAPERS_RESULT].[PAPERS_QUESTION_ID], [T_PAPERS_RESULT].[ANSWER_CORRECT], [T_PAP" +
"ERS_RESULT].[ANSWER_TIME], [T_PAPERS_RESULT].[ANSWER_SECOND]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_PAPERS_RESULT].[PAPERS_RESULT_ID], [T_PAPERS_RESULT].[TESTER_NAME], [T" +
"_PAPERS_RESULT].[PAPERS_QUESTION_ID], [T_PAPERS_RESULT].[ANSWER_CORRECT], [T_PAP" +
"ERS_RESULT].[ANSWER_TIME], [T_PAPERS_RESULT].[ANSWER_SECOND]   from [T_PAPERS_RE" +
"SULT] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_PAPERS_RESULT].[PAPERS_RESULT_ID], [T_PAPERS_RESULT].[TESTER_NAME], [T_PAPERS" +
"_RESULT].[PAPERS_QUESTION_ID], [T_PAPERS_RESULT].[ANSWER_CORRECT], [T_PAPERS_RES" +
"ULT].[ANSWER_TIME], [T_PAPERS_RESULT].[ANSWER_SECOND] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_PAPERS_RESULT";
	}
	
	
	public String getTableName() {
		return "T_PAPERS_RESULT";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "PAPERS_RESULT_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.papersResultId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (PapersResult.class.isInstance(obj)) {
			PapersResult o = ((PapersResult)(obj));
			this.papersResultId = o.papersResultId;
			this.testerName = o.testerName;
			this.papersQuestionId = o.papersQuestionId;
			this.answerCorrect = o.answerCorrect;
			this.answerTime = o.answerTime;
			this.answerSecond = o.answerSecond;
		}
	}
	
	/**
	 * 插入PapersResult对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="papersResult">需要插入的考试结果</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, PapersResult papersResult) throws SQLException, DbException {
		String sql = "insert into [T_PAPERS_RESULT](";
		if ((papersResult.getPapersResultId() > 0)) {
			sql = (sql + "[PAPERS_RESULT_ID], ");
		}
		sql = (sql + "[TESTER_NAME]");
		sql = (sql + ", [PAPERS_QUESTION_ID]");
		sql = (sql + ", [ANSWER_CORRECT]");
		sql = (sql + ", [ANSWER_TIME]");
		sql = (sql + ", [ANSWER_SECOND]");
		sql = (sql + ")values(");
		if ((papersResult.getPapersResultId() > 0)) {
			sql = (sql + papersResult.getPapersResultId());
			sql = (sql + ", ");
		}
		sql = (sql + SqlServerUtils.safeSql(papersResult.getTesterName().toString()));
		sql = (sql + ", ");
		sql = (sql + papersResult.getPapersQuestionId());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getBoolSql(papersResult.getAnswerCorrect()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getDateSql(papersResult.getAnswerTime()));
		sql = (sql + ", ");
		sql = (sql + papersResult.getAnswerSecond());
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((papersResult.getPapersResultId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_PAPERS_RESULT] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_PAPERS_RESULT off");
			}
			dataVisit.execSql(sql);
			if ((papersResult.getPapersResultId() == 0)) {
				papersResult.papersResultId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入PapersResult对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		PapersResult.insert(dataVisit, this);
	}
	
	/**
	 * 更新PapersResult对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="papersResult">需要更新的考试结果</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, PapersResult papersResult, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_PAPERS_RESULT] set ";
		sql = (sql + "[TESTER_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(papersResult.getTesterName().toString()));
		sql = (sql + ",");
		sql = (sql + "[PAPERS_QUESTION_ID] = ");
		sql = (sql + papersResult.getPapersQuestionId());
		sql = (sql + ",");
		sql = (sql + "[ANSWER_CORRECT] = ");
		sql = (sql + SqlServerUtils.getBoolSql(papersResult.getAnswerCorrect()));
		sql = (sql + ",");
		sql = (sql + "[ANSWER_TIME] = ");
		sql = (sql + SqlServerUtils.getDateSql(papersResult.getAnswerTime()));
		sql = (sql + ",");
		sql = (sql + "[ANSWER_SECOND] = ");
		sql = (sql + papersResult.getAnswerSecond());
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "PAPERS_RESULT_ID = ");
		sql = (sql + papersResult.getPapersResultId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新PapersResult对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="papersResult">需要更新的考试结果</param>
	 */
	protected static int update(IDataVisit2 dataVisit, PapersResult papersResult) throws SQLException, DbException {
		return PapersResult.update(dataVisit, papersResult, "");
	}
	
	/**
	 * 更新PapersResult对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return PapersResult.update(dataVisit, this);
	}
	
	/**
	 * 更新PapersResult对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return PapersResult.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.testerName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<PapersResult> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<PapersResult> list = new ArrayList<PapersResult>();
		try {
			for (; reader.next(); ) {
				PapersResult obj = new PapersResult();
				PapersResult.readValue(reader, obj);
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
	public static List<PapersResult> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<PapersResult> list = new ArrayList<PapersResult>();
		try {
			for (; reader.next(); ) {
				PapersResult obj = new PapersResult();
				PapersResult.readValue(reader, obj);
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
	public static List<PapersResult> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((PapersResult.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<PapersResult> list = new ArrayList<PapersResult>();
		try {
			for (; reader.next(); ) {
				PapersResult obj = new PapersResult();
				PapersResult.readValue(reader, obj);
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
	public static List<PapersResult> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((PapersResult.getFullSelectSql() + appendConditionSql));
		List<PapersResult> list = new ArrayList<PapersResult>();
		try {
			for (; reader.next(); ) {
				PapersResult obj = new PapersResult();
				PapersResult.readValue(reader, obj);
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
	public static <T extends PapersResult> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((PapersResult.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			PapersResult.readValue(reader, obj);
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
public static <T extends PapersResult> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((PapersResult.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			PapersResult.readValue(reader, obj);
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
	String sql = "select * from T_PAPERS_RESULT ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据回答标识查询PapersResult
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APapersResultId">回答标识</param>
 */
public static PapersResult selectByPapersResultId(IDataVisit2 dataVisit, int APapersResultId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "PAPERS_RESULT_ID = ");
	sql = (sql + APapersResultId);
	List<PapersResult> list = PapersResult.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 根据testername,考题标识查询PapersResult
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATesterName">testername</param>
 * <param name="APapersQuestionId">考题标识</param>
 */
public static PapersResult selectByTesterNamePapersQuestionId(IDataVisit2 dataVisit, String ATesterName, int APapersQuestionId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "TESTER_NAME = ");
	sql = (sql + SqlServerUtils.safeSql(ATesterName.toString()));
	sql = (sql + " and ");
	sql = (sql + "PAPERS_QUESTION_ID = ");
	sql = (sql + APapersQuestionId);
	List<PapersResult> list = PapersResult.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个PapersResult对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APapersResultId">回答标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByPapersResultId(IDataVisit2 dataVisit, int APapersResultId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_PAPERS_RESULT] where ");
	sql = (sql + "PAPERS_RESULT_ID = ");
	sql = (sql + APapersResultId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个PapersResult对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APapersResultId">回答标识</param>
 */
public static void deleteByPapersResultId(IDataVisit2 dataVisit, int APapersResultId) throws SQLException, DbException {
	PapersResult.deleteByPapersResultId(dataVisit, APapersResultId, "");
}

/**
 * 从数据库中删除一个PapersResult对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATesterName">testername</param>
 * <param name="APapersQuestionId">考题标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByTesterNamePapersQuestionId(IDataVisit2 dataVisit, String ATesterName, int APapersQuestionId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_PAPERS_RESULT] where ");
	sql = (sql + "TESTER_NAME = ");
	sql = (sql + SqlServerUtils.safeSql(ATesterName.toString()));
	sql = (sql + " and ");
	sql = (sql + "PAPERS_QUESTION_ID = ");
	sql = (sql + APapersQuestionId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个PapersResult对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATesterName">testername</param>
 * <param name="APapersQuestionId">考题标识</param>
 */
public static void deleteByTesterNamePapersQuestionId(IDataVisit2 dataVisit, String ATesterName, int APapersQuestionId) throws SQLException, DbException {
	PapersResult.deleteByTesterNamePapersQuestionId(dataVisit, ATesterName, APapersQuestionId, "");
}

/**
 * 根据外键考题标识删除一批PapersResult对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PapersQuestionId">考题标识</param>
 */
public static void deleteListByPapersQuestionId(IDataVisit2 dataVisit, int APapersQuestionId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_PAPERS_RESULT] where ");
	sql = (sql + "PAPERS_QUESTION_ID = ");
	sql = (sql + APapersQuestionId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PapersQuestionId">考题标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<PapersResult> selectObjectsByPapersQuestionId(IDataVisit2 dataVisit, int APapersQuestionId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PAPERS_QUESTION_ID = ";
	sql = (sql + APapersQuestionId);
	sql = (sql + appendConditionSql);
	return PapersResult.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PapersQuestionId">考题标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<PapersResult> selectObjectsByPapersQuestionId(IDataVisit2 dataVisit, int APapersQuestionId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PAPERS_QUESTION_ID = ";
	sql = (sql + APapersQuestionId);
	return PapersResult.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PapersQuestionId">考题标识</param>
 */
public static List<PapersResult> selectObjectsByPapersQuestionId(IDataVisit2 dataVisit, int APapersQuestionId) throws SQLException, DbException {
	String sql = " where PAPERS_QUESTION_ID = ";
	sql = (sql + APapersQuestionId);
	return PapersResult.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象papersResult中
 * <param name="reader">数据源</param>
 * <param name="papersResult">目标对象</param>
 */
public static void readValue(ResultSet reader, PapersResult papersResult) throws SQLException, DbException {
	papersResult.papersResultId = reader.getInt(1);
	papersResult.testerName = reader.getString(2);
	papersResult.papersQuestionId = reader.getInt(3);
	papersResult.answerCorrect = reader.getBoolean(4);
	papersResult.answerTime = SqlUtils.getDate(reader, 5);
	papersResult.answerSecond = reader.getInt(6);
}
}
