package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_QUESTION_CATEGORY: 试题分类
 */
public class QuestionCategory extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * CATEGORY_ID: 分类标识
	 */
	int categoryId;
	
	/**
	 * CATEGORY_NAME: 分类名称
	 */
	String categoryName = "";
	
	/**
	 * CATEGORY_DESC: 分类描述
	 */
	String categoryDesc;
	
	/**
	 * DELETED: 是否删除
	 */
	boolean deleted;
	
	/**
	 * CATEGORY_ID: 分类标识
	 */
	public int getCategoryId() {
		return this.categoryId;
	}
	
	/**
	 * CATEGORY_ID: 分类标识
	 */
	public void setCategoryId(int value)
	 {
		this.categoryId = value;
	}
	
	/**
	 * CATEGORY_NAME: 分类名称
	 */
	public String getCategoryName() {
		return this.categoryName;
	}
	
	/**
	 * CATEGORY_NAME: 分类名称
	 */
	public void setCategoryName(String value)
	 {
		this.categoryName = value;
	}
	
	/**
	 * CATEGORY_DESC: 分类描述
	 */
	public String getCategoryDesc() {
		return this.categoryDesc;
	}
	
	/**
	 * CATEGORY_DESC: 分类描述
	 */
	public void setCategoryDesc(String value)
	 {
		this.categoryDesc = value;
	}
	
	/**
	 * DELETED: 是否删除
	 */
	public boolean getDeleted() {
		return this.deleted;
	}
	
	/**
	 * DELETED: 是否删除
	 */
	public void setDeleted(boolean value)
	 {
		this.deleted = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_QUESTION_CATEGORY].[CATEGORY_ID], [T_QUESTION_CATEGORY].[CATEGORY_NAME" +
"], [T_QUESTION_CATEGORY].[CATEGORY_DESC], [T_QUESTION_CATEGORY].[DELETED]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_QUESTION_CATEGORY].[CATEGORY_ID], [T_QUESTION_CATEGORY].[CATEGORY_NAME" +
"], [T_QUESTION_CATEGORY].[CATEGORY_DESC], [T_QUESTION_CATEGORY].[DELETED]   from" +
" [T_QUESTION_CATEGORY] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_QUESTION_CATEGORY].[CATEGORY_ID], [T_QUESTION_CATEGORY].[CATEGORY_NAME], [T_Q" +
"UESTION_CATEGORY].[CATEGORY_DESC], [T_QUESTION_CATEGORY].[DELETED] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_QUESTION_CATEGORY";
	}
	
	
	public String getTableName() {
		return "T_QUESTION_CATEGORY";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "CATEGORY_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.categoryId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (QuestionCategory.class.isInstance(obj)) {
			QuestionCategory o = ((QuestionCategory)(obj));
			this.categoryId = o.categoryId;
			this.categoryName = o.categoryName;
			this.categoryDesc = o.categoryDesc;
			this.deleted = o.deleted;
		}
	}
	
	/**
	 * 插入QuestionCategory对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="questionCategory">需要插入的试题分类</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, QuestionCategory questionCategory) throws SQLException, DbException {
		String sql = "insert into [T_QUESTION_CATEGORY](";
		if ((questionCategory.getCategoryId() > 0)) {
			sql = (sql + "[CATEGORY_ID], ");
		}
		sql = (sql + "[CATEGORY_NAME]");
		sql = (sql + ", [CATEGORY_DESC]");
		sql = (sql + ", [DELETED]");
		sql = (sql + ")values(");
		if ((questionCategory.getCategoryId() > 0)) {
			sql = (sql + questionCategory.getCategoryId());
			sql = (sql + ", ");
		}
		sql = (sql + SqlServerUtils.safeSql(questionCategory.getCategoryName().toString()));
		sql = (sql + ", ");
		if ((questionCategory.categoryDesc == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(questionCategory.getCategoryDesc().toString()));
		}
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getBoolSql(questionCategory.getDeleted()));
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((questionCategory.getCategoryId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_QUESTION_CATEGORY] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_QUESTION_CATEGORY off");
			}
			dataVisit.execSql(sql);
			if ((questionCategory.getCategoryId() == 0)) {
				questionCategory.categoryId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入QuestionCategory对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		QuestionCategory.insert(dataVisit, this);
	}
	
	/**
	 * 更新QuestionCategory对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="questionCategory">需要更新的试题分类</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, QuestionCategory questionCategory, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_QUESTION_CATEGORY] set ";
		sql = (sql + "[CATEGORY_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(questionCategory.getCategoryName().toString()));
		sql = (sql + ",");
		if ((questionCategory.categoryDesc == null)) {
			sql = (sql + "[CATEGORY_DESC] = default ,");
		}
		else {
			sql = (sql + "[CATEGORY_DESC] = ");
			sql = (sql + SqlServerUtils.safeSql(questionCategory.getCategoryDesc().toString()));
			sql = (sql + ",");
		}
		sql = (sql + "[DELETED] = ");
		sql = (sql + SqlServerUtils.getBoolSql(questionCategory.getDeleted()));
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "CATEGORY_ID = ");
		sql = (sql + questionCategory.getCategoryId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新QuestionCategory对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="questionCategory">需要更新的试题分类</param>
	 */
	protected static int update(IDataVisit2 dataVisit, QuestionCategory questionCategory) throws SQLException, DbException {
		return QuestionCategory.update(dataVisit, questionCategory, "");
	}
	
	/**
	 * 更新QuestionCategory对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return QuestionCategory.update(dataVisit, this);
	}
	
	/**
	 * 更新QuestionCategory对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return QuestionCategory.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.categoryName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<QuestionCategory> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<QuestionCategory> list = new ArrayList<QuestionCategory>();
		try {
			for (; reader.next(); ) {
				QuestionCategory obj = new QuestionCategory();
				QuestionCategory.readValue(reader, obj);
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
	public static List<QuestionCategory> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<QuestionCategory> list = new ArrayList<QuestionCategory>();
		try {
			for (; reader.next(); ) {
				QuestionCategory obj = new QuestionCategory();
				QuestionCategory.readValue(reader, obj);
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
	public static List<QuestionCategory> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((QuestionCategory.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<QuestionCategory> list = new ArrayList<QuestionCategory>();
		try {
			for (; reader.next(); ) {
				QuestionCategory obj = new QuestionCategory();
				QuestionCategory.readValue(reader, obj);
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
	public static List<QuestionCategory> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((QuestionCategory.getFullSelectSql() + appendConditionSql));
		List<QuestionCategory> list = new ArrayList<QuestionCategory>();
		try {
			for (; reader.next(); ) {
				QuestionCategory obj = new QuestionCategory();
				QuestionCategory.readValue(reader, obj);
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
	public static <T extends QuestionCategory> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((QuestionCategory.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			QuestionCategory.readValue(reader, obj);
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
public static <T extends QuestionCategory> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((QuestionCategory.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			QuestionCategory.readValue(reader, obj);
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
	String sql = "select * from T_QUESTION_CATEGORY ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据分类标识查询QuestionCategory
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ACategoryId">分类标识</param>
 */
public static QuestionCategory selectByCategoryId(IDataVisit2 dataVisit, int ACategoryId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "CATEGORY_ID = ");
	sql = (sql + ACategoryId);
	List<QuestionCategory> list = QuestionCategory.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个QuestionCategory对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ACategoryId">分类标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByCategoryId(IDataVisit2 dataVisit, int ACategoryId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " update [T_QUESTION_CATEGORY] set DELETED = 1 where ");
	sql = (sql + "CATEGORY_ID = ");
	sql = (sql + ACategoryId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个QuestionCategory对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ACategoryId">分类标识</param>
 */
public static void deleteByCategoryId(IDataVisit2 dataVisit, int ACategoryId) throws SQLException, DbException {
	QuestionCategory.deleteByCategoryId(dataVisit, ACategoryId, "");
}

/**
 * 从reader读到数据到对象questionCategory中
 * <param name="reader">数据源</param>
 * <param name="questionCategory">目标对象</param>
 */
public static void readValue(ResultSet reader, QuestionCategory questionCategory) throws SQLException, DbException {
	questionCategory.categoryId = reader.getInt(1);
	questionCategory.categoryName = reader.getString(2);
	questionCategory.categoryDesc = reader.getString(3);
	if (reader.wasNull()) {
		questionCategory.categoryDesc = null;
	}
	questionCategory.deleted = reader.getBoolean(4);
}
}
