package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_COMMENT: 问题注释表
 */
public class IssueComment extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * ISSUE_COMMENT_ID: 标识
	 */
	int issueCommentId;
	
	/**
	 * ISSUE_ID: 问题标识
	 */
	int issueId;
	
	/**
	 * COMMENT_USER_ID: 用户标识
	 */
	int commentUserId;
	
	/**
	 * COMMENT_TYPE: 注释类型 0 表示普通注释 1 表示状态变化（系统自动插入）
	 */
	byte commentType;
	
	/**
	 * COMMENT_TIME: 添加时间
	 */
	java.util.Date commentTime;
	
	/**
	 * COMMENT_CONTENT: 注释内容
	 */
	String commentContent = "";
	
	/**
	 * PARENT_COMMENT_ID: 父注释ID,为0 表示没有
	 */
	int parentCommentId;
	
	/**
	 * ATTACH_FILE_PATH: 附加文件路径
	 */
	String attachFilePath;
	
	/**
	 * ATTACH_FILE_SIZE: 附加文件大小，字节为单位
	 */
	Integer attachFileSize;
	
	/**
	 * ATTACH_FILE_TYPE: 附加文件类型
	 */
	String attachFileType;
	
	/**
	 * ATTACH_THUMB_PATH: 附加文件缩略，如果是图片大于800*600，则生成缩略图，否则指向原始文件
	 */
	String attachThumbPath;
	
	/**
	 * ISSUE_COMMENT_ID: 标识
	 */
	public int getIssueCommentId() {
		return this.issueCommentId;
	}
	
	/**
	 * ISSUE_COMMENT_ID: 标识
	 */
	public void setIssueCommentId(int value)
	 {
		this.issueCommentId = value;
	}
	
	/**
	 * ISSUE_ID: 问题标识
	 */
	public int getIssueId() {
		return this.issueId;
	}
	
	/**
	 * ISSUE_ID: 问题标识
	 */
	public void setIssueId(int value)
	 {
		this.issueId = value;
	}
	
	/**
	 * COMMENT_USER_ID: 用户标识
	 */
	public int getCommentUserId() {
		return this.commentUserId;
	}
	
	/**
	 * COMMENT_USER_ID: 用户标识
	 */
	public void setCommentUserId(int value)
	 {
		this.commentUserId = value;
	}
	
	/**
	 * COMMENT_TYPE: 注释类型 0 表示普通注释 1 表示状态变化（系统自动插入）
	 */
	public byte getCommentType() {
		return this.commentType;
	}
	
	/**
	 * COMMENT_TYPE: 注释类型 0 表示普通注释 1 表示状态变化（系统自动插入）
	 */
	public void setCommentType(byte value)
	 {
		this.commentType = value;
	}
	
	/**
	 * COMMENT_TIME: 添加时间
	 */
	public java.util.Date getCommentTime() {
		return this.commentTime;
	}
	
	/**
	 * COMMENT_TIME: 添加时间
	 */
	public void setCommentTime(java.util.Date value)
	 {
		this.commentTime = value;
	}
	
	/**
	 * COMMENT_CONTENT: 注释内容
	 */
	public String getCommentContent() {
		return this.commentContent;
	}
	
	/**
	 * COMMENT_CONTENT: 注释内容
	 */
	public void setCommentContent(String value)
	 {
		this.commentContent = value;
	}
	
	/**
	 * PARENT_COMMENT_ID: 父注释ID,为0 表示没有
	 */
	public int getParentCommentId() {
		return this.parentCommentId;
	}
	
	/**
	 * PARENT_COMMENT_ID: 父注释ID,为0 表示没有
	 */
	public void setParentCommentId(int value)
	 {
		this.parentCommentId = value;
	}
	
	/**
	 * ATTACH_FILE_PATH: 附加文件路径
	 */
	public String getAttachFilePath() {
		return this.attachFilePath;
	}
	
	/**
	 * ATTACH_FILE_PATH: 附加文件路径
	 */
	public void setAttachFilePath(String value)
	 {
		this.attachFilePath = value;
	}
	
	/**
	 * ATTACH_FILE_SIZE: 附加文件大小，字节为单位
	 */
	public Integer getAttachFileSize() {
		return this.attachFileSize;
	}
	
	/**
	 * ATTACH_FILE_SIZE: 附加文件大小，字节为单位
	 */
	public void setAttachFileSize(Integer value)
	 {
		this.attachFileSize = value;
	}
	
	/**
	 * ATTACH_FILE_TYPE: 附加文件类型
	 */
	public String getAttachFileType() {
		return this.attachFileType;
	}
	
	/**
	 * ATTACH_FILE_TYPE: 附加文件类型
	 */
	public void setAttachFileType(String value)
	 {
		this.attachFileType = value;
	}
	
	/**
	 * ATTACH_THUMB_PATH: 附加文件缩略，如果是图片大于800*600，则生成缩略图，否则指向原始文件
	 */
	public String getAttachThumbPath() {
		return this.attachThumbPath;
	}
	
	/**
	 * ATTACH_THUMB_PATH: 附加文件缩略，如果是图片大于800*600，则生成缩略图，否则指向原始文件
	 */
	public void setAttachThumbPath(String value)
	 {
		this.attachThumbPath = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_ISSUE_COMMENT].[ISSUE_COMMENT_ID], [T_ISSUE_COMMENT].[ISSUE_ID], [T_ISSUE_COMMENT].[COMMENT_USER_ID], [T_ISSUE_COMMENT].[COMMENT_TYPE], [T_ISSUE_COMMENT].[COMMENT_TIME], [T_ISSUE_COMMENT].[COMMENT_CONTENT], [T_ISSUE_COMMENT].[PARENT_COMMENT_ID], [T_ISSUE_COMMENT].[ATTACH_FILE_PATH], [T_ISSUE_COMMENT].[ATTACH_FILE_SIZE], [T_ISSUE_COMMENT].[ATTACH_FILE_TYPE], [T_ISSUE_COMMENT].[ATTACH_THUMB_PATH]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_ISSUE_COMMENT].[ISSUE_COMMENT_ID], [T_ISSUE_COMMENT].[ISSUE_ID], [T_ISSUE_COMMENT].[COMMENT_USER_ID], [T_ISSUE_COMMENT].[COMMENT_TYPE], [T_ISSUE_COMMENT].[COMMENT_TIME], [T_ISSUE_COMMENT].[COMMENT_CONTENT], [T_ISSUE_COMMENT].[PARENT_COMMENT_ID], [T_ISSUE_COMMENT].[ATTACH_FILE_PATH], [T_ISSUE_COMMENT].[ATTACH_FILE_SIZE], [T_ISSUE_COMMENT].[ATTACH_FILE_TYPE], [T_ISSUE_COMMENT].[ATTACH_THUMB_PATH]   from [T_ISSUE_COMMENT] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_ISSUE_COMMENT].[ISSUE_COMMENT_ID], [T_ISSUE_COMMENT].[ISSUE_ID], [T_ISSUE_COMMENT].[COMMENT_USER_ID], [T_ISSUE_COMMENT].[COMMENT_TYPE], [T_ISSUE_COMMENT].[COMMENT_TIME], [T_ISSUE_COMMENT].[COMMENT_CONTENT], [T_ISSUE_COMMENT].[PARENT_COMMENT_ID], [T_ISSUE_COMMENT].[ATTACH_FILE_PATH], [T_ISSUE_COMMENT].[ATTACH_FILE_SIZE], [T_ISSUE_COMMENT].[ATTACH_FILE_TYPE], [T_ISSUE_COMMENT].[ATTACH_THUMB_PATH] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_ISSUE_COMMENT";
	}
	
	
	public String getTableName() {
		return "T_ISSUE_COMMENT";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "ISSUE_COMMENT_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.issueCommentId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (IssueComment.class.isInstance(obj)) {
			IssueComment o = ((IssueComment)(obj));
			this.issueCommentId = o.issueCommentId;
			this.issueId = o.issueId;
			this.commentUserId = o.commentUserId;
			this.commentType = o.commentType;
			this.commentTime = o.commentTime;
			this.commentContent = o.commentContent;
			this.parentCommentId = o.parentCommentId;
			this.attachFilePath = o.attachFilePath;
			this.attachFileSize = o.attachFileSize;
			this.attachFileType = o.attachFileType;
			this.attachThumbPath = o.attachThumbPath;
		}
	}
	
	/**
	 * 插入IssueComment对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueComment">需要插入的问题注释表</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, IssueComment issueComment) throws SQLException, DbException {
		String sql = "insert into [T_ISSUE_COMMENT](";
		if ((issueComment.getIssueCommentId() > 0)) {
			sql = (sql + "[ISSUE_COMMENT_ID], ");
		}
		sql = (sql + "[ISSUE_ID]");
		sql = (sql + ", [COMMENT_USER_ID]");
		sql = (sql + ", [COMMENT_TYPE]");
		sql = (sql + ", [COMMENT_TIME]");
		sql = (sql + ", [COMMENT_CONTENT]");
		sql = (sql + ", [PARENT_COMMENT_ID]");
		sql = (sql + ", [ATTACH_FILE_PATH]");
		sql = (sql + ", [ATTACH_FILE_SIZE]");
		sql = (sql + ", [ATTACH_FILE_TYPE]");
		sql = (sql + ", [ATTACH_THUMB_PATH]");
		sql = (sql + ")values(");
		if ((issueComment.getIssueCommentId() > 0)) {
			sql = (sql + issueComment.getIssueCommentId());
			sql = (sql + ", ");
		}
		sql = (sql + issueComment.getIssueId());
		sql = (sql + ", ");
		sql = (sql + issueComment.getCommentUserId());
		sql = (sql + ", ");
		sql = (sql + issueComment.getCommentType());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getDateSql(issueComment.getCommentTime()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(issueComment.getCommentContent().toString()));
		sql = (sql + ", ");
		sql = (sql + issueComment.getParentCommentId());
		sql = (sql + ", ");
		if ((issueComment.attachFilePath == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(issueComment.getAttachFilePath().toString()));
		}
		sql = (sql + ", ");
		if ((issueComment.attachFileSize == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + issueComment.getAttachFileSize());
		}
		sql = (sql + ", ");
		if ((issueComment.attachFileType == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(issueComment.getAttachFileType().toString()));
		}
		sql = (sql + ", ");
		if ((issueComment.attachThumbPath == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(issueComment.getAttachThumbPath().toString()));
		}
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((issueComment.getIssueCommentId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_ISSUE_COMMENT] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_ISSUE_COMMENT off");
			}
			dataVisit.execSql(sql);
			if ((issueComment.getIssueCommentId() == 0)) {
				issueComment.issueCommentId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入IssueComment对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		IssueComment.insert(dataVisit, this);
	}
	
	/**
	 * 更新IssueComment对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueComment">需要更新的问题注释表</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssueComment issueComment, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_ISSUE_COMMENT] set ";
		sql = (sql + "[ISSUE_ID] = ");
		sql = (sql + issueComment.getIssueId());
		sql = (sql + ",");
		sql = (sql + "[COMMENT_USER_ID] = ");
		sql = (sql + issueComment.getCommentUserId());
		sql = (sql + ",");
		sql = (sql + "[COMMENT_TYPE] = ");
		sql = (sql + issueComment.getCommentType());
		sql = (sql + ",");
		sql = (sql + "[COMMENT_TIME] = ");
		sql = (sql + SqlServerUtils.getDateSql(issueComment.getCommentTime()));
		sql = (sql + ",");
		sql = (sql + "[COMMENT_CONTENT] = ");
		sql = (sql + SqlServerUtils.safeSql(issueComment.getCommentContent().toString()));
		sql = (sql + ",");
		sql = (sql + "[PARENT_COMMENT_ID] = ");
		sql = (sql + issueComment.getParentCommentId());
		sql = (sql + ",");
		if ((issueComment.attachFilePath == null)) {
			sql = (sql + "[ATTACH_FILE_PATH] = default ,");
		}
		else {
			sql = (sql + "[ATTACH_FILE_PATH] = ");
			sql = (sql + SqlServerUtils.safeSql(issueComment.getAttachFilePath().toString()));
			sql = (sql + ",");
		}
		if ((issueComment.attachFileSize == null)) {
			sql = (sql + "[ATTACH_FILE_SIZE] = default ,");
		}
		else {
			sql = (sql + "[ATTACH_FILE_SIZE] = ");
			sql = (sql + issueComment.getAttachFileSize());
			sql = (sql + ",");
		}
		if ((issueComment.attachFileType == null)) {
			sql = (sql + "[ATTACH_FILE_TYPE] = default ,");
		}
		else {
			sql = (sql + "[ATTACH_FILE_TYPE] = ");
			sql = (sql + SqlServerUtils.safeSql(issueComment.getAttachFileType().toString()));
			sql = (sql + ",");
		}
		if ((issueComment.attachThumbPath == null)) {
			sql = (sql + "[ATTACH_THUMB_PATH] = default ,");
		}
		else {
			sql = (sql + "[ATTACH_THUMB_PATH] = ");
			sql = (sql + SqlServerUtils.safeSql(issueComment.getAttachThumbPath().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "ISSUE_COMMENT_ID = ");
		sql = (sql + issueComment.getIssueCommentId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新IssueComment对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueComment">需要更新的问题注释表</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssueComment issueComment) throws SQLException, DbException {
		return IssueComment.update(dataVisit, issueComment, "");
	}
	
	/**
	 * 更新IssueComment对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return IssueComment.update(dataVisit, this);
	}
	
	/**
	 * 更新IssueComment对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return IssueComment.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<IssueComment> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<IssueComment> list = new ArrayList<IssueComment>();
		try {
			for (; reader.next(); ) {
				IssueComment obj = new IssueComment();
				IssueComment.readValue(reader, obj);
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
	public static List<IssueComment> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<IssueComment> list = new ArrayList<IssueComment>();
		try {
			for (; reader.next(); ) {
				IssueComment obj = new IssueComment();
				IssueComment.readValue(reader, obj);
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
	public static List<IssueComment> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssueComment.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<IssueComment> list = new ArrayList<IssueComment>();
		try {
			for (; reader.next(); ) {
				IssueComment obj = new IssueComment();
				IssueComment.readValue(reader, obj);
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
	public static List<IssueComment> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssueComment.getFullSelectSql() + appendConditionSql));
		List<IssueComment> list = new ArrayList<IssueComment>();
		try {
			for (; reader.next(); ) {
				IssueComment obj = new IssueComment();
				IssueComment.readValue(reader, obj);
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
	public static <T extends IssueComment> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssueComment.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssueComment.readValue(reader, obj);
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
public static <T extends IssueComment> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssueComment.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssueComment.readValue(reader, obj);
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
	String sql = "select * from T_ISSUE_COMMENT ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据标识查询IssueComment
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueCommentId">标识</param>
 */
public static IssueComment selectByIssueCommentId(IDataVisit2 dataVisit, int AIssueCommentId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "ISSUE_COMMENT_ID = ");
	sql = (sql + AIssueCommentId);
	List<IssueComment> list = IssueComment.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个IssueComment对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueCommentId">标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByIssueCommentId(IDataVisit2 dataVisit, int AIssueCommentId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ISSUE_COMMENT] where ");
	sql = (sql + "ISSUE_COMMENT_ID = ");
	sql = (sql + AIssueCommentId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个IssueComment对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueCommentId">标识</param>
 */
public static void deleteByIssueCommentId(IDataVisit2 dataVisit, int AIssueCommentId) throws SQLException, DbException {
	IssueComment.deleteByIssueCommentId(dataVisit, AIssueCommentId, "");
}

/**
 * 根据外键问题标识删除一批IssueComment对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueId">问题标识</param>
 */
public static void deleteListByIssueId(IDataVisit2 dataVisit, int AIssueId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE_COMMENT] where ");
	sql = (sql + "ISSUE_ID = ");
	sql = (sql + AIssueId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键用户标识删除一批IssueComment对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="CommentUserId">用户标识</param>
 */
public static void deleteListByCommentUserId(IDataVisit2 dataVisit, int ACommentUserId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE_COMMENT] where ");
	sql = (sql + "COMMENT_USER_ID = ");
	sql = (sql + ACommentUserId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueId">问题标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueComment> selectObjectsByIssueId(IDataVisit2 dataVisit, int AIssueId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ISSUE_ID = ";
	sql = (sql + AIssueId);
	sql = (sql + appendConditionSql);
	return IssueComment.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueId">问题标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueComment> selectObjectsByIssueId(IDataVisit2 dataVisit, int AIssueId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ISSUE_ID = ";
	sql = (sql + AIssueId);
	return IssueComment.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueId">问题标识</param>
 */
public static List<IssueComment> selectObjectsByIssueId(IDataVisit2 dataVisit, int AIssueId) throws SQLException, DbException {
	String sql = " where ISSUE_ID = ";
	sql = (sql + AIssueId);
	return IssueComment.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="CommentUserId">用户标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueComment> selectObjectsByCommentUserId(IDataVisit2 dataVisit, int ACommentUserId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where COMMENT_USER_ID = ";
	sql = (sql + ACommentUserId);
	sql = (sql + appendConditionSql);
	return IssueComment.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="CommentUserId">用户标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueComment> selectObjectsByCommentUserId(IDataVisit2 dataVisit, int ACommentUserId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where COMMENT_USER_ID = ";
	sql = (sql + ACommentUserId);
	return IssueComment.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="CommentUserId">用户标识</param>
 */
public static List<IssueComment> selectObjectsByCommentUserId(IDataVisit2 dataVisit, int ACommentUserId) throws SQLException, DbException {
	String sql = " where COMMENT_USER_ID = ";
	sql = (sql + ACommentUserId);
	return IssueComment.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象issueComment中
 * <param name="reader">数据源</param>
 * <param name="issueComment">目标对象</param>
 */
public static void readValue(ResultSet reader, IssueComment issueComment) throws SQLException, DbException {
	issueComment.issueCommentId = reader.getInt(1);
	issueComment.issueId = reader.getInt(2);
	issueComment.commentUserId = reader.getInt(3);
	issueComment.commentType = reader.getByte(4);
	issueComment.commentTime = SqlUtils.getDate(reader, 5);
	issueComment.commentContent = reader.getString(6);
	issueComment.parentCommentId = reader.getInt(7);
	issueComment.attachFilePath = reader.getString(8);
	if (reader.wasNull()) {
		issueComment.attachFilePath = null;
	}
	issueComment.attachFileSize = reader.getInt(9);
	if (reader.wasNull()) {
		issueComment.attachFileSize = null;
	}
	issueComment.attachFileType = reader.getString(10);
	if (reader.wasNull()) {
		issueComment.attachFileType = null;
	}
	issueComment.attachThumbPath = reader.getString(11);
	if (reader.wasNull()) {
		issueComment.attachThumbPath = null;
	}
}
}
