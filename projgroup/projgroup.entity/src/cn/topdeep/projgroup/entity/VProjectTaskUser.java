package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * V_PROJECT_TASK_USER: 
 */
public class VProjectTaskUser extends common.dbvisit.BaseTable {
	
	/**
	 * PROJECT_ID: 
	 */
	int projectId;
	
	/**
	 * USER_ID: 
	 */
	int userId;
	
	/**
	 * REAL_NAME: 
	 */
	String realName = "";
	
	/**
	 * TASK_ID: 
	 */
	Integer taskId;
	
	/**
	 * TASK_USER_ID: 
	 */
	Integer taskUserId;
	
	/**
	 * SELECTED: 
	 */
	Boolean selected;
	
	/**
	 * PROJECT_ID: 
	 */
	public int getProjectId() {
		return this.projectId;
	}
	
	/**
	 * PROJECT_ID: 
	 */
	public void setProjectId(int value)
	 {
		this.projectId = value;
	}
	
	/**
	 * USER_ID: 
	 */
	public int getUserId() {
		return this.userId;
	}
	
	/**
	 * USER_ID: 
	 */
	public void setUserId(int value)
	 {
		this.userId = value;
	}
	
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
	 * TASK_ID: 
	 */
	public Integer getTaskId() {
		return this.taskId;
	}
	
	/**
	 * TASK_ID: 
	 */
	public void setTaskId(Integer value)
	 {
		this.taskId = value;
	}
	
	/**
	 * TASK_USER_ID: 
	 */
	public Integer getTaskUserId() {
		return this.taskUserId;
	}
	
	/**
	 * TASK_USER_ID: 
	 */
	public void setTaskUserId(Integer value)
	 {
		this.taskUserId = value;
	}
	
	/**
	 * SELECTED: 
	 */
	public Boolean getSelected() {
		return this.selected;
	}
	
	/**
	 * SELECTED: 
	 */
	public void setSelected(Boolean value)
	 {
		this.selected = value;
	}
	
	public static String getSelectSql() {
		return "select  [V_PROJECT_TASK_USER].[PROJECT_ID], [V_PROJECT_TASK_USER].[USER_ID], [V_P" +
"ROJECT_TASK_USER].[REAL_NAME], [V_PROJECT_TASK_USER].[TASK_ID], [V_PROJECT_TASK_" +
"USER].[TASK_USER_ID], [V_PROJECT_TASK_USER].[SELECTED]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [V_PROJECT_TASK_USER].[PROJECT_ID], [V_PROJECT_TASK_USER].[USER_ID], [V_P" +
"ROJECT_TASK_USER].[REAL_NAME], [V_PROJECT_TASK_USER].[TASK_ID], [V_PROJECT_TASK_" +
"USER].[TASK_USER_ID], [V_PROJECT_TASK_USER].[SELECTED]   from [V_PROJECT_TASK_US" +
"ER] ";
	}
	
	
	public static String getColumnSql() {
		return " [V_PROJECT_TASK_USER].[PROJECT_ID], [V_PROJECT_TASK_USER].[USER_ID], [V_PROJECT_" +
"TASK_USER].[REAL_NAME], [V_PROJECT_TASK_USER].[TASK_ID], [V_PROJECT_TASK_USER].[" +
"TASK_USER_ID], [V_PROJECT_TASK_USER].[SELECTED] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "V_PROJECT_TASK_USER";
	}
	
	
	public String getTableName() {
		return "V_PROJECT_TASK_USER";
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (VProjectTaskUser.class.isInstance(obj)) {
			VProjectTaskUser o = ((VProjectTaskUser)(obj));
			this.projectId = o.projectId;
			this.userId = o.userId;
			this.realName = o.realName;
			this.taskId = o.taskId;
			this.taskUserId = o.taskUserId;
			this.selected = o.selected;
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
	public static List<VProjectTaskUser> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<VProjectTaskUser> list = new ArrayList<VProjectTaskUser>();
		try {
			for (; reader.next(); ) {
				VProjectTaskUser obj = new VProjectTaskUser();
				VProjectTaskUser.readValue(reader, obj);
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
	public static List<VProjectTaskUser> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<VProjectTaskUser> list = new ArrayList<VProjectTaskUser>();
		try {
			for (; reader.next(); ) {
				VProjectTaskUser obj = new VProjectTaskUser();
				VProjectTaskUser.readValue(reader, obj);
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
	public static List<VProjectTaskUser> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((VProjectTaskUser.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<VProjectTaskUser> list = new ArrayList<VProjectTaskUser>();
		try {
			for (; reader.next(); ) {
				VProjectTaskUser obj = new VProjectTaskUser();
				VProjectTaskUser.readValue(reader, obj);
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
	public static List<VProjectTaskUser> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((VProjectTaskUser.getFullSelectSql() + appendConditionSql));
		List<VProjectTaskUser> list = new ArrayList<VProjectTaskUser>();
		try {
			for (; reader.next(); ) {
				VProjectTaskUser obj = new VProjectTaskUser();
				VProjectTaskUser.readValue(reader, obj);
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
	public static <T extends VProjectTaskUser> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((VProjectTaskUser.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			VProjectTaskUser.readValue(reader, obj);
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
public static <T extends VProjectTaskUser> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((VProjectTaskUser.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			VProjectTaskUser.readValue(reader, obj);
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
	String sql = "select * from V_PROJECT_TASK_USER ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 从reader读到数据到对象vProjectTaskUser中
 * <param name="reader">数据源</param>
 * <param name="vProjectTaskUser">目标对象</param>
 */
public static void readValue(ResultSet reader, VProjectTaskUser vProjectTaskUser) throws SQLException, DbException {
	vProjectTaskUser.projectId = reader.getInt(1);
	vProjectTaskUser.userId = reader.getInt(2);
	vProjectTaskUser.realName = reader.getString(3);
	vProjectTaskUser.taskId = reader.getInt(4);
	if (reader.wasNull()) {
		vProjectTaskUser.taskId = null;
	}
	vProjectTaskUser.taskUserId = reader.getInt(5);
	if (reader.wasNull()) {
		vProjectTaskUser.taskUserId = null;
	}
	vProjectTaskUser.selected = reader.getBoolean(6);
	if (reader.wasNull()) {
		vProjectTaskUser.selected = null;
	}
}
}
