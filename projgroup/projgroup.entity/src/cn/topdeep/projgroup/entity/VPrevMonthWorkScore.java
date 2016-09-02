package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * V_PREV_MONTH_WORK_SCORE: 
 */
public class VPrevMonthWorkScore extends common.dbvisit.BaseTable {
	
	/**
	 * REAL_NAME: 
	 */
	String realName = "";
	
	/**
	 * WORK_USER_ID: 
	 */
	int workUserId;
	
	/**
	 * WORK_DAY_COUNT: 
	 */
	Integer workDayCount;
	
	/**
	 * WORK_DAY_SCORE: 
	 */
	Double workDayScore;
	
	/**
	 * REAL_NAME: 
	 */
	public String getRealName() {
		return this.realName;
	}
	
	/**
	 * REAL_NAME: 
	 */
	public void setRealName(String value)
	 {
		this.realName = value;
	}
	
	/**
	 * WORK_USER_ID: 
	 */
	public int getWorkUserId() {
		return this.workUserId;
	}
	
	/**
	 * WORK_USER_ID: 
	 */
	public void setWorkUserId(int value)
	 {
		this.workUserId = value;
	}
	
	/**
	 * WORK_DAY_COUNT: 
	 */
	public Integer getWorkDayCount() {
		return this.workDayCount;
	}
	
	/**
	 * WORK_DAY_COUNT: 
	 */
	public void setWorkDayCount(Integer value)
	 {
		this.workDayCount = value;
	}
	
	/**
	 * WORK_DAY_SCORE: 
	 */
	public Double getWorkDayScore() {
		return this.workDayScore;
	}
	
	/**
	 * WORK_DAY_SCORE: 
	 */
	public void setWorkDayScore(Double value)
	 {
		this.workDayScore = value;
	}
	
	public static String getSelectSql() {
		return "select  [V_PREV_MONTH_WORK_SCORE].[REAL_NAME], [V_PREV_MONTH_WORK_SCORE].[WORK_US" +
"ER_ID], [V_PREV_MONTH_WORK_SCORE].[WORK_DAY_COUNT], [V_PREV_MONTH_WORK_SCORE].[W" +
"ORK_DAY_SCORE]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [V_PREV_MONTH_WORK_SCORE].[REAL_NAME], [V_PREV_MONTH_WORK_SCORE].[WORK_US" +
"ER_ID], [V_PREV_MONTH_WORK_SCORE].[WORK_DAY_COUNT], [V_PREV_MONTH_WORK_SCORE].[W" +
"ORK_DAY_SCORE]   from [V_PREV_MONTH_WORK_SCORE] ";
	}
	
	
	public static String getColumnSql() {
		return " [V_PREV_MONTH_WORK_SCORE].[REAL_NAME], [V_PREV_MONTH_WORK_SCORE].[WORK_USER_ID]," +
" [V_PREV_MONTH_WORK_SCORE].[WORK_DAY_COUNT], [V_PREV_MONTH_WORK_SCORE].[WORK_DAY" +
"_SCORE] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "V_PREV_MONTH_WORK_SCORE";
	}
	
	
	public String getTableName() {
		return "V_PREV_MONTH_WORK_SCORE";
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (VPrevMonthWorkScore.class.isInstance(obj)) {
			VPrevMonthWorkScore o = ((VPrevMonthWorkScore)(obj));
			this.realName = o.realName;
			this.workUserId = o.workUserId;
			this.workDayCount = o.workDayCount;
			this.workDayScore = o.workDayScore;
		}
	}
	
	public String toString() {
		return this.realName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<VPrevMonthWorkScore> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<VPrevMonthWorkScore> list = new ArrayList<VPrevMonthWorkScore>();
		try {
			for (; reader.next(); ) {
				VPrevMonthWorkScore obj = new VPrevMonthWorkScore();
				VPrevMonthWorkScore.readValue(reader, obj);
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
	public static List<VPrevMonthWorkScore> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<VPrevMonthWorkScore> list = new ArrayList<VPrevMonthWorkScore>();
		try {
			for (; reader.next(); ) {
				VPrevMonthWorkScore obj = new VPrevMonthWorkScore();
				VPrevMonthWorkScore.readValue(reader, obj);
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
	public static List<VPrevMonthWorkScore> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((VPrevMonthWorkScore.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<VPrevMonthWorkScore> list = new ArrayList<VPrevMonthWorkScore>();
		try {
			for (; reader.next(); ) {
				VPrevMonthWorkScore obj = new VPrevMonthWorkScore();
				VPrevMonthWorkScore.readValue(reader, obj);
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
	public static List<VPrevMonthWorkScore> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((VPrevMonthWorkScore.getFullSelectSql() + appendConditionSql));
		List<VPrevMonthWorkScore> list = new ArrayList<VPrevMonthWorkScore>();
		try {
			for (; reader.next(); ) {
				VPrevMonthWorkScore obj = new VPrevMonthWorkScore();
				VPrevMonthWorkScore.readValue(reader, obj);
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
	public static <T extends VPrevMonthWorkScore> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((VPrevMonthWorkScore.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			VPrevMonthWorkScore.readValue(reader, obj);
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
public static <T extends VPrevMonthWorkScore> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((VPrevMonthWorkScore.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			VPrevMonthWorkScore.readValue(reader, obj);
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
	String sql = "select * from V_PREV_MONTH_WORK_SCORE ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 从reader读到数据到对象vPrevMonthWorkScore中
 * <param name="reader">数据源</param>
 * <param name="vPrevMonthWorkScore">目标对象</param>
 */
public static void readValue(ResultSet reader, VPrevMonthWorkScore vPrevMonthWorkScore) throws SQLException, DbException {
	vPrevMonthWorkScore.realName = reader.getString(1);
	vPrevMonthWorkScore.workUserId = reader.getInt(2);
	vPrevMonthWorkScore.workDayCount = reader.getInt(3);
	if (reader.wasNull()) {
		vPrevMonthWorkScore.workDayCount = null;
	}
	vPrevMonthWorkScore.workDayScore = reader.getDouble(4);
	if (reader.wasNull()) {
		vPrevMonthWorkScore.workDayScore = null;
	}
}
}
