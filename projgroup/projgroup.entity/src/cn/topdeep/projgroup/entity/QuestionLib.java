package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_QUESTION_LIB: 题库
 */
public class QuestionLib extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * QUESTION_ID: 题目标识
	 */
	int questionId;
	
	/**
	 * CATEGORY_ID: 分类标识
	 */
	int categoryId;
	
	/**
	 * MODIFY_OR: 最后修改人
	 */
	String modifyOr = "";
	
	/**
	 * QUESTION_TYPE: 题目类型 0 是非题  1 多选题 2 单选题
	 */
	byte questionType;
	
	/**
	 * QUESTION_CONTENT: 题目内容
	 */
	String questionContent = "";
	
	/**
	 * CREATE_TIME: 添加时间
	 */
	java.util.Date createTime;
	
	/**
	 * DELETED: 是否删除
	 */
	boolean deleted;
	
	/**
	 * MODIFY_TIME: 修改时间
	 */
	java.util.Date modifyTime;
	
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
	 * MODIFY_OR: 最后修改人
	 */
	public String getModifyOr() {
		return this.modifyOr;
	}
	
	/**
	 * MODIFY_OR: 最后修改人
	 */
	public void setModifyOr(String value)
	 {
		this.modifyOr = value;
	}
	
	/**
	 * QUESTION_TYPE: 题目类型 0 是非题  1 多选题 2 单选题
	 */
	public byte getQuestionType() {
		return this.questionType;
	}
	
	/**
	 * QUESTION_TYPE: 题目类型 0 是非题  1 多选题 2 单选题
	 */
	public void setQuestionType(byte value)
	 {
		this.questionType = value;
	}
	
	/**
	 * QUESTION_CONTENT: 题目内容
	 */
	public String getQuestionContent() {
		return this.questionContent;
	}
	
	/**
	 * QUESTION_CONTENT: 题目内容
	 */
	public void setQuestionContent(String value)
	 {
		this.questionContent = value;
	}
	
	/**
	 * CREATE_TIME: 添加时间
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	
	/**
	 * CREATE_TIME: 添加时间
	 */
	public void setCreateTime(java.util.Date value)
	 {
		this.createTime = value;
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
	
	/**
	 * MODIFY_TIME: 修改时间
	 */
	public java.util.Date getModifyTime() {
		return this.modifyTime;
	}
	
	/**
	 * MODIFY_TIME: 修改时间
	 */
	public void setModifyTime(java.util.Date value)
	 {
		this.modifyTime = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_QUESTION_LIB].[QUESTION_ID], [T_QUESTION_LIB].[CATEGORY_ID], [T_QUESTION_LIB].[MODIFY_OR], [T_QUESTION_LIB].[QUESTION_TYPE], [T_QUESTION_LIB].[QUESTION_CONTENT], [T_QUESTION_LIB].[CREATE_TIME], [T_QUESTION_LIB].[DELETED], [T_QUESTION_LIB].[MODIFY_TIME]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_QUESTION_LIB].[QUESTION_ID], [T_QUESTION_LIB].[CATEGORY_ID], [T_QUESTION_LIB].[MODIFY_OR], [T_QUESTION_LIB].[QUESTION_TYPE], [T_QUESTION_LIB].[QUESTION_CONTENT], [T_QUESTION_LIB].[CREATE_TIME], [T_QUESTION_LIB].[DELETED], [T_QUESTION_LIB].[MODIFY_TIME]   from [T_QUESTION_LIB] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_QUESTION_LIB].[QUESTION_ID], [T_QUESTION_LIB].[CATEGORY_ID], [T_QUESTION_LIB].[MODIFY_OR], [T_QUESTION_LIB].[QUESTION_TYPE], [T_QUESTION_LIB].[QUESTION_CONTENT], [T_QUESTION_LIB].[CREATE_TIME], [T_QUESTION_LIB].[DELETED], [T_QUESTION_LIB].[MODIFY_TIME] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_QUESTION_LIB";
	}
	
	
	public String getTableName() {
		return "T_QUESTION_LIB";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "QUESTION_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.questionId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (QuestionLib.class.isInstance(obj)) {
			QuestionLib o = ((QuestionLib)(obj));
			this.questionId = o.questionId;
			this.categoryId = o.categoryId;
			this.modifyOr = o.modifyOr;
			this.questionType = o.questionType;
			this.questionContent = o.questionContent;
			this.createTime = o.createTime;
			this.deleted = o.deleted;
			this.modifyTime = o.modifyTime;
		}
	}
	
	/**
	 * 插入QuestionLib对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="questionLib">需要插入的题库</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, QuestionLib questionLib) throws SQLException, DbException {
		String sql = "insert into [T_QUESTION_LIB](";
		if ((questionLib.getQuestionId() > 0)) {
			sql = (sql + "[QUESTION_ID], ");
		}
		sql = (sql + "[CATEGORY_ID]");
		sql = (sql + ", [MODIFY_OR]");
		sql = (sql + ", [QUESTION_TYPE]");
		sql = (sql + ", [QUESTION_CONTENT]");
		sql = (sql + ", [CREATE_TIME]");
		sql = (sql + ", [DELETED]");
		sql = (sql + ", [MODIFY_TIME]");
		sql = (sql + ")values(");
		if ((questionLib.getQuestionId() > 0)) {
			sql = (sql + questionLib.getQuestionId());
			sql = (sql + ", ");
		}
		sql = (sql + questionLib.getCategoryId());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(questionLib.getModifyOr().toString()));
		sql = (sql + ", ");
		sql = (sql + questionLib.getQuestionType());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(questionLib.getQuestionContent().toString()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getDateSql(questionLib.getCreateTime()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getBoolSql(questionLib.getDeleted()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getDateSql(questionLib.getModifyTime()));
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((questionLib.getQuestionId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_QUESTION_LIB] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_QUESTION_LIB off");
			}
			dataVisit.execSql(sql);
			if ((questionLib.getQuestionId() == 0)) {
				questionLib.questionId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入QuestionLib对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		QuestionLib.insert(dataVisit, this);
	}
	
	/**
	 * 更新QuestionLib对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="questionLib">需要更新的题库</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, QuestionLib questionLib, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_QUESTION_LIB] set ";
		sql = (sql + "[CATEGORY_ID] = ");
		sql = (sql + questionLib.getCategoryId());
		sql = (sql + ",");
		sql = (sql + "[MODIFY_OR] = ");
		sql = (sql + SqlServerUtils.safeSql(questionLib.getModifyOr().toString()));
		sql = (sql + ",");
		sql = (sql + "[QUESTION_TYPE] = ");
		sql = (sql + questionLib.getQuestionType());
		sql = (sql + ",");
		sql = (sql + "[QUESTION_CONTENT] = ");
		sql = (sql + SqlServerUtils.safeSql(questionLib.getQuestionContent().toString()));
		sql = (sql + ",");
		sql = (sql + "[CREATE_TIME] = ");
		sql = (sql + SqlServerUtils.getDateSql(questionLib.getCreateTime()));
		sql = (sql + ",");
		sql = (sql + "[DELETED] = ");
		sql = (sql + SqlServerUtils.getBoolSql(questionLib.getDeleted()));
		sql = (sql + ",");
		sql = (sql + "[MODIFY_TIME] = ");
		sql = (sql + SqlServerUtils.getDateSql(questionLib.getModifyTime()));
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "QUESTION_ID = ");
		sql = (sql + questionLib.getQuestionId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新QuestionLib对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="questionLib">需要更新的题库</param>
	 */
	protected static int update(IDataVisit2 dataVisit, QuestionLib questionLib) throws SQLException, DbException {
		return QuestionLib.update(dataVisit, questionLib, "");
	}
	
	/**
	 * 更新QuestionLib对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return QuestionLib.update(dataVisit, this);
	}
	
	/**
	 * 更新QuestionLib对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return QuestionLib.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<QuestionLib> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<QuestionLib> list = new ArrayList<QuestionLib>();
		try {
			for (; reader.next(); ) {
				QuestionLib obj = new QuestionLib();
				QuestionLib.readValue(reader, obj);
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
	public static List<QuestionLib> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<QuestionLib> list = new ArrayList<QuestionLib>();
		try {
			for (; reader.next(); ) {
				QuestionLib obj = new QuestionLib();
				QuestionLib.readValue(reader, obj);
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
	public static List<QuestionLib> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((QuestionLib.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<QuestionLib> list = new ArrayList<QuestionLib>();
		try {
			for (; reader.next(); ) {
				QuestionLib obj = new QuestionLib();
				QuestionLib.readValue(reader, obj);
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
	public static List<QuestionLib> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((QuestionLib.getFullSelectSql() + appendConditionSql));
		List<QuestionLib> list = new ArrayList<QuestionLib>();
		try {
			for (; reader.next(); ) {
				QuestionLib obj = new QuestionLib();
				QuestionLib.readValue(reader, obj);
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
	public static <T extends QuestionLib> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((QuestionLib.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			QuestionLib.readValue(reader, obj);
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
public static <T extends QuestionLib> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((QuestionLib.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			QuestionLib.readValue(reader, obj);
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
	String sql = "select * from T_QUESTION_LIB ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据题目标识查询QuestionLib
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AQuestionId">题目标识</param>
 */
public static QuestionLib selectByQuestionId(IDataVisit2 dataVisit, int AQuestionId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "QUESTION_ID = ");
	sql = (sql + AQuestionId);
	List<QuestionLib> list = QuestionLib.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个QuestionLib对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AQuestionId">题目标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByQuestionId(IDataVisit2 dataVisit, int AQuestionId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " update [T_QUESTION_LIB] set DELETED = 1 where ");
	sql = (sql + "QUESTION_ID = ");
	sql = (sql + AQuestionId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个QuestionLib对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AQuestionId">题目标识</param>
 */
public static void deleteByQuestionId(IDataVisit2 dataVisit, int AQuestionId) throws SQLException, DbException {
	QuestionLib.deleteByQuestionId(dataVisit, AQuestionId, "");
}

/**
 * 根据外键分类标识删除一批QuestionLib对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="CategoryId">分类标识</param>
 */
public static void deleteListByCategoryId(IDataVisit2 dataVisit, int ACategoryId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_QUESTION_LIB] where ");
	sql = (sql + "CATEGORY_ID = ");
	sql = (sql + ACategoryId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="CategoryId">分类标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<QuestionLib> selectObjectsByCategoryId(IDataVisit2 dataVisit, int ACategoryId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where CATEGORY_ID = ";
	sql = (sql + ACategoryId);
	sql = (sql + appendConditionSql);
	return QuestionLib.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="CategoryId">分类标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<QuestionLib> selectObjectsByCategoryId(IDataVisit2 dataVisit, int ACategoryId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where CATEGORY_ID = ";
	sql = (sql + ACategoryId);
	return QuestionLib.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="CategoryId">分类标识</param>
 */
public static List<QuestionLib> selectObjectsByCategoryId(IDataVisit2 dataVisit, int ACategoryId) throws SQLException, DbException {
	String sql = " where CATEGORY_ID = ";
	sql = (sql + ACategoryId);
	return QuestionLib.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象questionLib中
 * <param name="reader">数据源</param>
 * <param name="questionLib">目标对象</param>
 */
public static void readValue(ResultSet reader, QuestionLib questionLib) throws SQLException, DbException {
	questionLib.questionId = reader.getInt(1);
	questionLib.categoryId = reader.getInt(2);
	questionLib.modifyOr = reader.getString(3);
	questionLib.questionType = reader.getByte(4);
	questionLib.questionContent = reader.getString(5);
	questionLib.createTime = SqlUtils.getDate(reader, 6);
	questionLib.deleted = reader.getBoolean(7);
	questionLib.modifyTime = SqlUtils.getDate(reader, 8);
}
}
