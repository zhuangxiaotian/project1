package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * V_TASK_PREVIOUS_TASK: 
 */
public class VTaskPreviousTask extends common.dbvisit.BaseTable {
	
	/**
	 * TASK_ID: 
	 */
	int taskId;
	
	/**
	 * PREVIOUS_TASK_ID: 
	 */
	int previousTaskId;
	
	/**
	 * TASK_NAME: 
	 */
	String taskName = "";
	
	/**
	 * TASK_OUTLINE: 
	 */
	String taskOutline = "";
	
	/**
	 * TASK_PROJECT_ID: 
	 */
	int taskProjectId;
	
	/**
	 * TASK_ID: 
	 */
	public int getTaskId() {
		return this.taskId;
	}
	
	/**
	 * TASK_ID: 
	 */
	public void setTaskId(int value)
	 {
		this.taskId = value;
	}
	
	/**
	 * PREVIOUS_TASK_ID: 
	 */
	public int getPreviousTaskId() {
		return this.previousTaskId;
	}
	
	/**
	 * PREVIOUS_TASK_ID: 
	 */
	public void setPreviousTaskId(int value)
	 {
		this.previousTaskId = value;
	}
	
	/**
	 * TASK_NAME: 
	 */
	public String getTaskName() {
		return this.taskName;
	}
	
	/**
	 * TASK_NAME: 
	 */
	public void setTaskName(String value)
	 {
		this.taskName = value;
	}
	
	/**
	 * TASK_OUTLINE: 
	 */
	public String getTaskOutline() {
		return this.taskOutline;
	}
	
	/**
	 * TASK_OUTLINE: 
	 */
	public void setTaskOutline(String value)
	 {
		this.taskOutline = value;
	}
	
	/**
	 * TASK_PROJECT_ID: 
	 */
	public int getTaskProjectId() {
		return this.taskProjectId;
	}
	
	/**
	 * TASK_PROJECT_ID: 
	 */
	public void setTaskProjectId(int value)
	 {
		this.taskProjectId = value;
	}
	
	public static String getSelectSql() {
		return "select  [V_TASK_PREVIOUS_TASK].[TASK_ID], [V_TASK_PREVIOUS_TASK].[PREVIOUS_TASK_I" +
"D], [V_TASK_PREVIOUS_TASK].[TASK_NAME], [V_TASK_PREVIOUS_TASK].[TASK_OUTLINE], [" +
"V_TASK_PREVIOUS_TASK].[TASK_PROJECT_ID]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [V_TASK_PREVIOUS_TASK].[TASK_ID], [V_TASK_PREVIOUS_TASK].[PREVIOUS_TASK_I" +
"D], [V_TASK_PREVIOUS_TASK].[TASK_NAME], [V_TASK_PREVIOUS_TASK].[TASK_OUTLINE], [" +
"V_TASK_PREVIOUS_TASK].[TASK_PROJECT_ID]   from [V_TASK_PREVIOUS_TASK] ";
	}
	
	
	public static String getColumnSql() {
		return " [V_TASK_PREVIOUS_TASK].[TASK_ID], [V_TASK_PREVIOUS_TASK].[PREVIOUS_TASK_ID], [V_" +
"TASK_PREVIOUS_TASK].[TASK_NAME], [V_TASK_PREVIOUS_TASK].[TASK_OUTLINE], [V_TASK_" +
"PREVIOUS_TASK].[TASK_PROJECT_ID] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "V_TASK_PREVIOUS_TASK";
	}
	
	
	public String getTableName() {
		return "V_TASK_PREVIOUS_TASK";
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (VTaskPreviousTask.class.isInstance(obj)) {
			VTaskPreviousTask o = ((VTaskPreviousTask)(obj));
			this.taskId = o.taskId;
			this.previousTaskId = o.previousTaskId;
			this.taskName = o.taskName;
			this.taskOutline = o.taskOutline;
			this.taskProjectId = o.taskProjectId;
		}
	}
	
	public String toString() {
		return this.taskName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<VTaskPreviousTask> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<VTaskPreviousTask> list = new ArrayList<VTaskPreviousTask>();
		try {
			for (; reader.next(); ) {
				VTaskPreviousTask obj = new VTaskPreviousTask();
				VTaskPreviousTask.readValue(reader, obj);
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
	public static List<VTaskPreviousTask> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<VTaskPreviousTask> list = new ArrayList<VTaskPreviousTask>();
		try {
			for (; reader.next(); ) {
				VTaskPreviousTask obj = new VTaskPreviousTask();
				VTaskPreviousTask.readValue(reader, obj);
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
	public static List<VTaskPreviousTask> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((VTaskPreviousTask.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<VTaskPreviousTask> list = new ArrayList<VTaskPreviousTask>();
		try {
			for (; reader.next(); ) {
				VTaskPreviousTask obj = new VTaskPreviousTask();
				VTaskPreviousTask.readValue(reader, obj);
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
	public static List<VTaskPreviousTask> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((VTaskPreviousTask.getFullSelectSql() + appendConditionSql));
		List<VTaskPreviousTask> list = new ArrayList<VTaskPreviousTask>();
		try {
			for (; reader.next(); ) {
				VTaskPreviousTask obj = new VTaskPreviousTask();
				VTaskPreviousTask.readValue(reader, obj);
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
	public static <T extends VTaskPreviousTask> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((VTaskPreviousTask.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			VTaskPreviousTask.readValue(reader, obj);
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
public static <T extends VTaskPreviousTask> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((VTaskPreviousTask.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			VTaskPreviousTask.readValue(reader, obj);
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
	String sql = "select * from V_TASK_PREVIOUS_TASK ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 从reader读到数据到对象vTaskPreviousTask中
 * <param name="reader">数据源</param>
 * <param name="vTaskPreviousTask">目标对象</param>
 */
public static void readValue(ResultSet reader, VTaskPreviousTask vTaskPreviousTask) throws SQLException, DbException {
	vTaskPreviousTask.taskId = reader.getInt(1);
	vTaskPreviousTask.previousTaskId = reader.getInt(2);
	vTaskPreviousTask.taskName = reader.getString(3);
	vTaskPreviousTask.taskOutline = reader.getString(4);
	vTaskPreviousTask.taskProjectId = reader.getInt(5);
}
}
