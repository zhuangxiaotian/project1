package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * V_QUESTION_LIB: 
 */
public class VQuestionLib extends common.dbvisit.BaseTable {
	
	/**
	 * QUESTION_ID: 
	 */
	int questionId;
	
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
	 * CATEGORY_ID: 
	 */
	int categoryId;
	
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
		return "select  [V_QUESTION_LIB].[QUESTION_ID], [V_QUESTION_LIB].[MODIFY_OR], [V_QUESTION_LIB].[QUESTION_TYPE], [V_QUESTION_LIB].[QUESTION_CONTENT], [V_QUESTION_LIB].[CREATE_TIME], [V_QUESTION_LIB].[DELETED], [V_QUESTION_LIB].[MODIFY_TIME], [V_QUESTION_LIB].[CATEGORY_ID], [V_QUESTION_LIB].[CATEGORY_NAME], [V_QUESTION_LIB].[CATEGORY_DESC], [V_QUESTION_LIB].[QUESTION_CATEGORY_DELETED]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [V_QUESTION_LIB].[QUESTION_ID], [V_QUESTION_LIB].[MODIFY_OR], [V_QUESTION_LIB].[QUESTION_TYPE], [V_QUESTION_LIB].[QUESTION_CONTENT], [V_QUESTION_LIB].[CREATE_TIME], [V_QUESTION_LIB].[DELETED], [V_QUESTION_LIB].[MODIFY_TIME], [V_QUESTION_LIB].[CATEGORY_ID], [V_QUESTION_LIB].[CATEGORY_NAME], [V_QUESTION_LIB].[CATEGORY_DESC], [V_QUESTION_LIB].[QUESTION_CATEGORY_DELETED]   from [V_QUESTION_LIB] ";
	}
	
	
	public static String getColumnSql() {
		return " [V_QUESTION_LIB].[QUESTION_ID], [V_QUESTION_LIB].[MODIFY_OR], [V_QUESTION_LIB].[QUESTION_TYPE], [V_QUESTION_LIB].[QUESTION_CONTENT], [V_QUESTION_LIB].[CREATE_TIME], [V_QUESTION_LIB].[DELETED], [V_QUESTION_LIB].[MODIFY_TIME], [V_QUESTION_LIB].[CATEGORY_ID], [V_QUESTION_LIB].[CATEGORY_NAME], [V_QUESTION_LIB].[CATEGORY_DESC], [V_QUESTION_LIB].[QUESTION_CATEGORY_DELETED] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "V_QUESTION_LIB";
	}
	
	
	public String getTableName() {
		return "V_QUESTION_LIB";
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (VQuestionLib.class.isInstance(obj)) {
			VQuestionLib o = ((VQuestionLib)(obj));
			this.questionId = o.questionId;
			this.modifyOr = o.modifyOr;
			this.questionType = o.questionType;
			this.questionContent = o.questionContent;
			this.createTime = o.createTime;
			this.deleted = o.deleted;
			this.modifyTime = o.modifyTime;
			this.categoryId = o.categoryId;
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
	public static List<VQuestionLib> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<VQuestionLib> list = new ArrayList<VQuestionLib>();
		try {
			for (; reader.next(); ) {
				VQuestionLib obj = new VQuestionLib();
				VQuestionLib.readValue(reader, obj);
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
	public static List<VQuestionLib> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<VQuestionLib> list = new ArrayList<VQuestionLib>();
		try {
			for (; reader.next(); ) {
				VQuestionLib obj = new VQuestionLib();
				VQuestionLib.readValue(reader, obj);
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
	public static List<VQuestionLib> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((VQuestionLib.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<VQuestionLib> list = new ArrayList<VQuestionLib>();
		try {
			for (; reader.next(); ) {
				VQuestionLib obj = new VQuestionLib();
				VQuestionLib.readValue(reader, obj);
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
	public static List<VQuestionLib> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((VQuestionLib.getFullSelectSql() + appendConditionSql));
		List<VQuestionLib> list = new ArrayList<VQuestionLib>();
		try {
			for (; reader.next(); ) {
				VQuestionLib obj = new VQuestionLib();
				VQuestionLib.readValue(reader, obj);
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
	public static <T extends VQuestionLib> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((VQuestionLib.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			VQuestionLib.readValue(reader, obj);
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
public static <T extends VQuestionLib> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((VQuestionLib.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			VQuestionLib.readValue(reader, obj);
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
	String sql = "select * from V_QUESTION_LIB ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 从reader读到数据到对象vQuestionLib中
 * <param name="reader">数据源</param>
 * <param name="vQuestionLib">目标对象</param>
 */
public static void readValue(ResultSet reader, VQuestionLib vQuestionLib) throws SQLException, DbException {
	vQuestionLib.questionId = reader.getInt(1);
	vQuestionLib.modifyOr = reader.getString(2);
	vQuestionLib.questionType = reader.getByte(3);
	vQuestionLib.questionContent = reader.getString(4);
	vQuestionLib.createTime = SqlUtils.getDate(reader, 5);
	vQuestionLib.deleted = reader.getBoolean(6);
	vQuestionLib.modifyTime = SqlUtils.getDate(reader, 7);
	vQuestionLib.categoryId = reader.getInt(8);
	vQuestionLib.categoryName = reader.getString(9);
	vQuestionLib.categoryDesc = reader.getString(10);
	if (reader.wasNull()) {
		vQuestionLib.categoryDesc = null;
	}
	vQuestionLib.questionCategoryDeleted = reader.getBoolean(11);
}
}
