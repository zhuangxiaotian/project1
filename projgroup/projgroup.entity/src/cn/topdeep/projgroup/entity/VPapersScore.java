package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * V_PAPERS_SCORE: 
 */
public class VPapersScore extends common.dbvisit.BaseTable {
	
	/**
	 * PAPERS_BEGIN_TIME: 
	 */
	java.util.Date papersBeginTime;
	
	/**
	 * PAPERS_END_TIME: 
	 */
	java.util.Date papersEndTime;
	
	/**
	 * PAPERS_PASS_RATE: 
	 */
	int papersPassRate;
	
	/**
	 * PAPERS_SCORE_ID: 
	 */
	int papersScoreId;
	
	/**
	 * PAPERS_ID: 
	 */
	int papersId;
	
	/**
	 * PAPERS_NAME: 
	 */
	String papersName = "";
	
	/**
	 * PAPERS_TIME_LIMIT: 
	 */
	int papersTimeLimit;
	
	/**
	 * PAPERS_CREATE_TIME: 
	 */
	java.util.Date papersCreateTime;
	
	/**
	 * PAPERS_MODIFY_OR: 
	 */
	String papersModifyOr = "";
	
	/**
	 * PAPERS_TEST_END: 
	 */
	boolean papersTestEnd;
	
	/**
	 * PAPERS_SCORE: 
	 */
	double papersScore;
	
	/**
	 * PAPERS_TYPE: 
	 */
	byte papersType;
	
	/**
	 * PAPERS_BEGIN_TIME: 
	 */
	public java.util.Date getPapersBeginTime() {
		return this.papersBeginTime;
	}
	
	/**
	 * PAPERS_BEGIN_TIME: 
	 */
	public void setPapersBeginTime(java.util.Date value)
	 {
		this.papersBeginTime = value;
	}
	
	/**
	 * PAPERS_END_TIME: 
	 */
	public java.util.Date getPapersEndTime() {
		return this.papersEndTime;
	}
	
	/**
	 * PAPERS_END_TIME: 
	 */
	public void setPapersEndTime(java.util.Date value)
	 {
		this.papersEndTime = value;
	}
	
	/**
	 * PAPERS_PASS_RATE: 
	 */
	public int getPapersPassRate() {
		return this.papersPassRate;
	}
	
	/**
	 * PAPERS_PASS_RATE: 
	 */
	public void setPapersPassRate(int value)
	 {
		this.papersPassRate = value;
	}
	
	/**
	 * PAPERS_SCORE_ID: 
	 */
	public int getPapersScoreId() {
		return this.papersScoreId;
	}
	
	/**
	 * PAPERS_SCORE_ID: 
	 */
	public void setPapersScoreId(int value)
	 {
		this.papersScoreId = value;
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
	 * PAPERS_TIME_LIMIT: 
	 */
	public int getPapersTimeLimit() {
		return this.papersTimeLimit;
	}
	
	/**
	 * PAPERS_TIME_LIMIT: 
	 */
	public void setPapersTimeLimit(int value)
	 {
		this.papersTimeLimit = value;
	}
	
	/**
	 * PAPERS_CREATE_TIME: 
	 */
	public java.util.Date getPapersCreateTime() {
		return this.papersCreateTime;
	}
	
	/**
	 * PAPERS_CREATE_TIME: 
	 */
	public void setPapersCreateTime(java.util.Date value)
	 {
		this.papersCreateTime = value;
	}
	
	/**
	 * PAPERS_MODIFY_OR: 
	 */
	public String getPapersModifyOr() {
		return this.papersModifyOr;
	}
	
	/**
	 * PAPERS_MODIFY_OR: 
	 */
	public void setPapersModifyOr(String value)
	 {
		this.papersModifyOr = value;
	}
	
	/**
	 * PAPERS_TEST_END: 
	 */
	public boolean getPapersTestEnd() {
		return this.papersTestEnd;
	}
	
	/**
	 * PAPERS_TEST_END: 
	 */
	public void setPapersTestEnd(boolean value)
	 {
		this.papersTestEnd = value;
	}
	
	/**
	 * PAPERS_SCORE: 
	 */
	public double getPapersScore() {
		return this.papersScore;
	}
	
	/**
	 * PAPERS_SCORE: 
	 */
	public void setPapersScore(double value)
	 {
		this.papersScore = value;
	}
	
	/**
	 * PAPERS_TYPE: 
	 */
	public byte getPapersType() {
		return this.papersType;
	}
	
	/**
	 * PAPERS_TYPE: 
	 */
	public void setPapersType(byte value)
	 {
		this.papersType = value;
	}
	
	public static String getSelectSql() {
		return "select  [V_PAPERS_SCORE].[PAPERS_BEGIN_TIME], [V_PAPERS_SCORE].[PAPERS_END_TIME], [V_PAPERS_SCORE].[PAPERS_PASS_RATE], [V_PAPERS_SCORE].[PAPERS_SCORE_ID], [V_PAPERS_SCORE].[PAPERS_ID], [V_PAPERS_SCORE].[PAPERS_NAME], [V_PAPERS_SCORE].[PAPERS_TIME_LIMIT], [V_PAPERS_SCORE].[PAPERS_CREATE_TIME], [V_PAPERS_SCORE].[PAPERS_MODIFY_OR], [V_PAPERS_SCORE].[PAPERS_TEST_END], [V_PAPERS_SCORE].[PAPERS_SCORE], [V_PAPERS_SCORE].[PAPERS_TYPE]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [V_PAPERS_SCORE].[PAPERS_BEGIN_TIME], [V_PAPERS_SCORE].[PAPERS_END_TIME], [V_PAPERS_SCORE].[PAPERS_PASS_RATE], [V_PAPERS_SCORE].[PAPERS_SCORE_ID], [V_PAPERS_SCORE].[PAPERS_ID], [V_PAPERS_SCORE].[PAPERS_NAME], [V_PAPERS_SCORE].[PAPERS_TIME_LIMIT], [V_PAPERS_SCORE].[PAPERS_CREATE_TIME], [V_PAPERS_SCORE].[PAPERS_MODIFY_OR], [V_PAPERS_SCORE].[PAPERS_TEST_END], [V_PAPERS_SCORE].[PAPERS_SCORE], [V_PAPERS_SCORE].[PAPERS_TYPE]   from [V_PAPERS_SCORE] ";
	}
	
	
	public static String getColumnSql() {
		return " [V_PAPERS_SCORE].[PAPERS_BEGIN_TIME], [V_PAPERS_SCORE].[PAPERS_END_TIME], [V_PAPERS_SCORE].[PAPERS_PASS_RATE], [V_PAPERS_SCORE].[PAPERS_SCORE_ID], [V_PAPERS_SCORE].[PAPERS_ID], [V_PAPERS_SCORE].[PAPERS_NAME], [V_PAPERS_SCORE].[PAPERS_TIME_LIMIT], [V_PAPERS_SCORE].[PAPERS_CREATE_TIME], [V_PAPERS_SCORE].[PAPERS_MODIFY_OR], [V_PAPERS_SCORE].[PAPERS_TEST_END], [V_PAPERS_SCORE].[PAPERS_SCORE], [V_PAPERS_SCORE].[PAPERS_TYPE] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "V_PAPERS_SCORE";
	}
	
	
	public String getTableName() {
		return "V_PAPERS_SCORE";
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (VPapersScore.class.isInstance(obj)) {
			VPapersScore o = ((VPapersScore)(obj));
			this.papersBeginTime = o.papersBeginTime;
			this.papersEndTime = o.papersEndTime;
			this.papersPassRate = o.papersPassRate;
			this.papersScoreId = o.papersScoreId;
			this.papersId = o.papersId;
			this.papersName = o.papersName;
			this.papersTimeLimit = o.papersTimeLimit;
			this.papersCreateTime = o.papersCreateTime;
			this.papersModifyOr = o.papersModifyOr;
			this.papersTestEnd = o.papersTestEnd;
			this.papersScore = o.papersScore;
			this.papersType = o.papersType;
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
	public static List<VPapersScore> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<VPapersScore> list = new ArrayList<VPapersScore>();
		try {
			for (; reader.next(); ) {
				VPapersScore obj = new VPapersScore();
				VPapersScore.readValue(reader, obj);
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
	public static List<VPapersScore> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<VPapersScore> list = new ArrayList<VPapersScore>();
		try {
			for (; reader.next(); ) {
				VPapersScore obj = new VPapersScore();
				VPapersScore.readValue(reader, obj);
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
	public static List<VPapersScore> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((VPapersScore.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<VPapersScore> list = new ArrayList<VPapersScore>();
		try {
			for (; reader.next(); ) {
				VPapersScore obj = new VPapersScore();
				VPapersScore.readValue(reader, obj);
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
	public static List<VPapersScore> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((VPapersScore.getFullSelectSql() + appendConditionSql));
		List<VPapersScore> list = new ArrayList<VPapersScore>();
		try {
			for (; reader.next(); ) {
				VPapersScore obj = new VPapersScore();
				VPapersScore.readValue(reader, obj);
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
	public static <T extends VPapersScore> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((VPapersScore.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			VPapersScore.readValue(reader, obj);
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
public static <T extends VPapersScore> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((VPapersScore.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			VPapersScore.readValue(reader, obj);
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
	String sql = "select * from V_PAPERS_SCORE ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 从reader读到数据到对象vPapersScore中
 * <param name="reader">数据源</param>
 * <param name="vPapersScore">目标对象</param>
 */
public static void readValue(ResultSet reader, VPapersScore vPapersScore) throws SQLException, DbException {
	vPapersScore.papersBeginTime = SqlUtils.getDate(reader, 1);
	if (reader.wasNull()) {
		vPapersScore.papersBeginTime = null;
	}
	vPapersScore.papersEndTime = SqlUtils.getDate(reader, 2);
	if (reader.wasNull()) {
		vPapersScore.papersEndTime = null;
	}
	vPapersScore.papersPassRate = reader.getInt(3);
	vPapersScore.papersScoreId = reader.getInt(4);
	vPapersScore.papersId = reader.getInt(5);
	vPapersScore.papersName = reader.getString(6);
	vPapersScore.papersTimeLimit = reader.getInt(7);
	vPapersScore.papersCreateTime = SqlUtils.getDate(reader, 8);
	vPapersScore.papersModifyOr = reader.getString(9);
	vPapersScore.papersTestEnd = reader.getBoolean(10);
	vPapersScore.papersScore = reader.getDouble(11);
	vPapersScore.papersType = reader.getByte(12);
}
}
