package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * V_PROJECT_USER: 
 */
public class VProjectUser extends common.dbvisit.BaseTable {
	
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
	
	public static String getSelectSql() {
		return "select  [V_PROJECT_USER].[PROJECT_ID], [V_PROJECT_USER].[USER_ID], [V_PROJECT_USE" +
"R].[REAL_NAME]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [V_PROJECT_USER].[PROJECT_ID], [V_PROJECT_USER].[USER_ID], [V_PROJECT_USE" +
"R].[REAL_NAME]   from [V_PROJECT_USER] ";
	}
	
	
	public static String getColumnSql() {
		return " [V_PROJECT_USER].[PROJECT_ID], [V_PROJECT_USER].[USER_ID], [V_PROJECT_USER].[REA" +
"L_NAME] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "V_PROJECT_USER";
	}
	
	
	public String getTableName() {
		return "V_PROJECT_USER";
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (VProjectUser.class.isInstance(obj)) {
			VProjectUser o = ((VProjectUser)(obj));
			this.projectId = o.projectId;
			this.userId = o.userId;
			this.realName = o.realName;
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
	public static List<VProjectUser> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<VProjectUser> list = new ArrayList<VProjectUser>();
		try {
			for (; reader.next(); ) {
				VProjectUser obj = new VProjectUser();
				VProjectUser.readValue(reader, obj);
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
	public static List<VProjectUser> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<VProjectUser> list = new ArrayList<VProjectUser>();
		try {
			for (; reader.next(); ) {
				VProjectUser obj = new VProjectUser();
				VProjectUser.readValue(reader, obj);
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
	public static List<VProjectUser> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((VProjectUser.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<VProjectUser> list = new ArrayList<VProjectUser>();
		try {
			for (; reader.next(); ) {
				VProjectUser obj = new VProjectUser();
				VProjectUser.readValue(reader, obj);
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
	public static List<VProjectUser> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((VProjectUser.getFullSelectSql() + appendConditionSql));
		List<VProjectUser> list = new ArrayList<VProjectUser>();
		try {
			for (; reader.next(); ) {
				VProjectUser obj = new VProjectUser();
				VProjectUser.readValue(reader, obj);
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
	public static <T extends VProjectUser> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((VProjectUser.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			VProjectUser.readValue(reader, obj);
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
public static <T extends VProjectUser> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((VProjectUser.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			VProjectUser.readValue(reader, obj);
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
	String sql = "select * from V_PROJECT_USER ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 从reader读到数据到对象vProjectUser中
 * <param name="reader">数据源</param>
 * <param name="vProjectUser">目标对象</param>
 */
public static void readValue(ResultSet reader, VProjectUser vProjectUser) throws SQLException, DbException {
	vProjectUser.projectId = reader.getInt(1);
	vProjectUser.userId = reader.getInt(2);
	vProjectUser.realName = reader.getString(3);
}
}
