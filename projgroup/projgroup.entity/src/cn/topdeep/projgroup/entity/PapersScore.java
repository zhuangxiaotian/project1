package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_PAPERS_SCORE: 考试成绩 含冗余数据
 */
public class PapersScore extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * PAPERS_SCORE_ID: 标识
	 */
	int papersScoreId;
	
	/**
	 * PAPERS_ID: 考卷标识
	 */
	int papersId;
	
	/**
	 * OPERATOR_ID: 操作员标识
	 */
	String operatorId = "";
	
	/**
	 * PASS_RATE: 通过率
	 */
	int passRate;
	
	/**
	 * BEGIN_TIME: 开始时间
	 */
	java.util.Date beginTime;
	
	/**
	 * END_TIME: 结束时间
	 */
	java.util.Date endTime;
	
	/**
	 * TEST_END: 是否考试结束
	 */
	boolean testEnd;
	
	/**
	 * TOTAL_ANSWER_SECOND: 考试用时,以秒计算
	 */
	int totalAnswerSecond;
	
	/**
	 * PAPERS_SCORE: 考试成绩
	 */
	double papersScore;
	
	/**
	 * PAPERS_SCORE_ID: 标识
	 */
	public int getPapersScoreId() {
		return this.papersScoreId;
	}
	
	/**
	 * PAPERS_SCORE_ID: 标识
	 */
	public void setPapersScoreId(int value)
	 {
		this.papersScoreId = value;
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
	 * OPERATOR_ID: 操作员标识
	 */
	public String getOperatorId() {
		return this.operatorId;
	}
	
	/**
	 * OPERATOR_ID: 操作员标识
	 */
	public void setOperatorId(String value)
	 {
		this.operatorId = value;
	}
	
	/**
	 * PASS_RATE: 通过率
	 */
	public int getPassRate() {
		return this.passRate;
	}
	
	/**
	 * PASS_RATE: 通过率
	 */
	public void setPassRate(int value)
	 {
		this.passRate = value;
	}
	
	/**
	 * BEGIN_TIME: 开始时间
	 */
	public java.util.Date getBeginTime() {
		return this.beginTime;
	}
	
	/**
	 * BEGIN_TIME: 开始时间
	 */
	public void setBeginTime(java.util.Date value)
	 {
		this.beginTime = value;
	}
	
	/**
	 * END_TIME: 结束时间
	 */
	public java.util.Date getEndTime() {
		return this.endTime;
	}
	
	/**
	 * END_TIME: 结束时间
	 */
	public void setEndTime(java.util.Date value)
	 {
		this.endTime = value;
	}
	
	/**
	 * TEST_END: 是否考试结束
	 */
	public boolean getTestEnd() {
		return this.testEnd;
	}
	
	/**
	 * TEST_END: 是否考试结束
	 */
	public void setTestEnd(boolean value)
	 {
		this.testEnd = value;
	}
	
	/**
	 * TOTAL_ANSWER_SECOND: 考试用时,以秒计算
	 */
	public int getTotalAnswerSecond() {
		return this.totalAnswerSecond;
	}
	
	/**
	 * TOTAL_ANSWER_SECOND: 考试用时,以秒计算
	 */
	public void setTotalAnswerSecond(int value)
	 {
		this.totalAnswerSecond = value;
	}
	
	/**
	 * PAPERS_SCORE: 考试成绩
	 */
	public double getPapersScore() {
		return this.papersScore;
	}
	
	/**
	 * PAPERS_SCORE: 考试成绩
	 */
	public void setPapersScore(double value)
	 {
		this.papersScore = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_PAPERS_SCORE].[PAPERS_SCORE_ID], [T_PAPERS_SCORE].[PAPERS_ID], [T_PAPERS_SCORE].[OPERATOR_ID], [T_PAPERS_SCORE].[PASS_RATE], [T_PAPERS_SCORE].[BEGIN_TIME], [T_PAPERS_SCORE].[END_TIME], [T_PAPERS_SCORE].[TEST_END], [T_PAPERS_SCORE].[TOTAL_ANSWER_SECOND], [T_PAPERS_SCORE].[PAPERS_SCORE]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_PAPERS_SCORE].[PAPERS_SCORE_ID], [T_PAPERS_SCORE].[PAPERS_ID], [T_PAPERS_SCORE].[OPERATOR_ID], [T_PAPERS_SCORE].[PASS_RATE], [T_PAPERS_SCORE].[BEGIN_TIME], [T_PAPERS_SCORE].[END_TIME], [T_PAPERS_SCORE].[TEST_END], [T_PAPERS_SCORE].[TOTAL_ANSWER_SECOND], [T_PAPERS_SCORE].[PAPERS_SCORE]   from [T_PAPERS_SCORE] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_PAPERS_SCORE].[PAPERS_SCORE_ID], [T_PAPERS_SCORE].[PAPERS_ID], [T_PAPERS_SCORE].[OPERATOR_ID], [T_PAPERS_SCORE].[PASS_RATE], [T_PAPERS_SCORE].[BEGIN_TIME], [T_PAPERS_SCORE].[END_TIME], [T_PAPERS_SCORE].[TEST_END], [T_PAPERS_SCORE].[TOTAL_ANSWER_SECOND], [T_PAPERS_SCORE].[PAPERS_SCORE] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_PAPERS_SCORE";
	}
	
	
	public String getTableName() {
		return "T_PAPERS_SCORE";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "PAPERS_SCORE_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.papersScoreId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (PapersScore.class.isInstance(obj)) {
			PapersScore o = ((PapersScore)(obj));
			this.papersScoreId = o.papersScoreId;
			this.papersId = o.papersId;
			this.operatorId = o.operatorId;
			this.passRate = o.passRate;
			this.beginTime = o.beginTime;
			this.endTime = o.endTime;
			this.testEnd = o.testEnd;
			this.totalAnswerSecond = o.totalAnswerSecond;
			this.papersScore = o.papersScore;
		}
	}
	
	/**
	 * 插入PapersScore对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="papersScore">需要插入的考试成绩 含冗余数据</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, PapersScore papersScore) throws SQLException, DbException {
		String sql = "insert into [T_PAPERS_SCORE](";
		if ((papersScore.getPapersScoreId() > 0)) {
			sql = (sql + "[PAPERS_SCORE_ID], ");
		}
		sql = (sql + "[PAPERS_ID]");
		sql = (sql + ", [OPERATOR_ID]");
		sql = (sql + ", [PASS_RATE]");
		sql = (sql + ", [BEGIN_TIME]");
		sql = (sql + ", [END_TIME]");
		sql = (sql + ", [TEST_END]");
		sql = (sql + ", [TOTAL_ANSWER_SECOND]");
		sql = (sql + ", [PAPERS_SCORE]");
		sql = (sql + ")values(");
		if ((papersScore.getPapersScoreId() > 0)) {
			sql = (sql + papersScore.getPapersScoreId());
			sql = (sql + ", ");
		}
		sql = (sql + papersScore.getPapersId());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(papersScore.getOperatorId().toString()));
		sql = (sql + ", ");
		sql = (sql + papersScore.getPassRate());
		sql = (sql + ", ");
		if ((papersScore.beginTime == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(papersScore.getBeginTime()));
		}
		sql = (sql + ", ");
		if ((papersScore.endTime == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(papersScore.getEndTime()));
		}
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getBoolSql(papersScore.getTestEnd()));
		sql = (sql + ", ");
		sql = (sql + papersScore.getTotalAnswerSecond());
		sql = (sql + ", ");
		sql = (sql + papersScore.getPapersScore());
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((papersScore.getPapersScoreId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_PAPERS_SCORE] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_PAPERS_SCORE off");
			}
			dataVisit.execSql(sql);
			if ((papersScore.getPapersScoreId() == 0)) {
				papersScore.papersScoreId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入PapersScore对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		PapersScore.insert(dataVisit, this);
	}
	
	/**
	 * 更新PapersScore对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="papersScore">需要更新的考试成绩 含冗余数据</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, PapersScore papersScore, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_PAPERS_SCORE] set ";
		sql = (sql + "[PAPERS_ID] = ");
		sql = (sql + papersScore.getPapersId());
		sql = (sql + ",");
		sql = (sql + "[OPERATOR_ID] = ");
		sql = (sql + SqlServerUtils.safeSql(papersScore.getOperatorId().toString()));
		sql = (sql + ",");
		sql = (sql + "[PASS_RATE] = ");
		sql = (sql + papersScore.getPassRate());
		sql = (sql + ",");
		if ((papersScore.beginTime == null)) {
			sql = (sql + "[BEGIN_TIME] = default ,");
		}
		else {
			sql = (sql + "[BEGIN_TIME] = ");
			sql = (sql + SqlServerUtils.getDateSql(papersScore.getBeginTime()));
			sql = (sql + ",");
		}
		if ((papersScore.endTime == null)) {
			sql = (sql + "[END_TIME] = default ,");
		}
		else {
			sql = (sql + "[END_TIME] = ");
			sql = (sql + SqlServerUtils.getDateSql(papersScore.getEndTime()));
			sql = (sql + ",");
		}
		sql = (sql + "[TEST_END] = ");
		sql = (sql + SqlServerUtils.getBoolSql(papersScore.getTestEnd()));
		sql = (sql + ",");
		sql = (sql + "[TOTAL_ANSWER_SECOND] = ");
		sql = (sql + papersScore.getTotalAnswerSecond());
		sql = (sql + ",");
		sql = (sql + "[PAPERS_SCORE] = ");
		sql = (sql + papersScore.getPapersScore());
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "PAPERS_SCORE_ID = ");
		sql = (sql + papersScore.getPapersScoreId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新PapersScore对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="papersScore">需要更新的考试成绩 含冗余数据</param>
	 */
	protected static int update(IDataVisit2 dataVisit, PapersScore papersScore) throws SQLException, DbException {
		return PapersScore.update(dataVisit, papersScore, "");
	}
	
	/**
	 * 更新PapersScore对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return PapersScore.update(dataVisit, this);
	}
	
	/**
	 * 更新PapersScore对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return PapersScore.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<PapersScore> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<PapersScore> list = new ArrayList<PapersScore>();
		try {
			for (; reader.next(); ) {
				PapersScore obj = new PapersScore();
				PapersScore.readValue(reader, obj);
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
	public static List<PapersScore> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<PapersScore> list = new ArrayList<PapersScore>();
		try {
			for (; reader.next(); ) {
				PapersScore obj = new PapersScore();
				PapersScore.readValue(reader, obj);
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
	public static List<PapersScore> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((PapersScore.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<PapersScore> list = new ArrayList<PapersScore>();
		try {
			for (; reader.next(); ) {
				PapersScore obj = new PapersScore();
				PapersScore.readValue(reader, obj);
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
	public static List<PapersScore> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((PapersScore.getFullSelectSql() + appendConditionSql));
		List<PapersScore> list = new ArrayList<PapersScore>();
		try {
			for (; reader.next(); ) {
				PapersScore obj = new PapersScore();
				PapersScore.readValue(reader, obj);
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
	public static <T extends PapersScore> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((PapersScore.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			PapersScore.readValue(reader, obj);
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
public static <T extends PapersScore> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((PapersScore.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			PapersScore.readValue(reader, obj);
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
	String sql = "select * from T_PAPERS_SCORE ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据标识查询PapersScore
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APapersScoreId">标识</param>
 */
public static PapersScore selectByPapersScoreId(IDataVisit2 dataVisit, int APapersScoreId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "PAPERS_SCORE_ID = ");
	sql = (sql + APapersScoreId);
	List<PapersScore> list = PapersScore.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个PapersScore对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APapersScoreId">标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByPapersScoreId(IDataVisit2 dataVisit, int APapersScoreId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_PAPERS_SCORE] where ");
	sql = (sql + "PAPERS_SCORE_ID = ");
	sql = (sql + APapersScoreId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个PapersScore对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APapersScoreId">标识</param>
 */
public static void deleteByPapersScoreId(IDataVisit2 dataVisit, int APapersScoreId) throws SQLException, DbException {
	PapersScore.deleteByPapersScoreId(dataVisit, APapersScoreId, "");
}

/**
 * 根据外键考卷标识删除一批PapersScore对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PapersId">考卷标识</param>
 */
public static void deleteListByPapersId(IDataVisit2 dataVisit, int APapersId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_PAPERS_SCORE] where ");
	sql = (sql + "PAPERS_ID = ");
	sql = (sql + APapersId);
	dataVisit.execSql(sql);
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
public static List<PapersScore> selectObjectsByPapersId(IDataVisit2 dataVisit, int APapersId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PAPERS_ID = ";
	sql = (sql + APapersId);
	sql = (sql + appendConditionSql);
	return PapersScore.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
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
public static List<PapersScore> selectObjectsByPapersId(IDataVisit2 dataVisit, int APapersId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PAPERS_ID = ";
	sql = (sql + APapersId);
	return PapersScore.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PapersId">考卷标识</param>
 */
public static List<PapersScore> selectObjectsByPapersId(IDataVisit2 dataVisit, int APapersId) throws SQLException, DbException {
	String sql = " where PAPERS_ID = ";
	sql = (sql + APapersId);
	return PapersScore.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象papersScore中
 * <param name="reader">数据源</param>
 * <param name="papersScore">目标对象</param>
 */
public static void readValue(ResultSet reader, PapersScore papersScore) throws SQLException, DbException {
	papersScore.papersScoreId = reader.getInt(1);
	papersScore.papersId = reader.getInt(2);
	papersScore.operatorId = reader.getString(3);
	papersScore.passRate = reader.getInt(4);
	papersScore.beginTime = SqlUtils.getDate(reader, 5);
	if (reader.wasNull()) {
		papersScore.beginTime = null;
	}
	papersScore.endTime = SqlUtils.getDate(reader, 6);
	if (reader.wasNull()) {
		papersScore.endTime = null;
	}
	papersScore.testEnd = reader.getBoolean(7);
	papersScore.totalAnswerSecond = reader.getInt(8);
	papersScore.papersScore = reader.getDouble(9);
}
}
