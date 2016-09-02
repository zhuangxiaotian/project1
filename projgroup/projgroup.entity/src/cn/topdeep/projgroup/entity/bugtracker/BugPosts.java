package cn.topdeep.projgroup.entity.bugtracker;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import java.sql.*;
/**
 * BUG_POSTS: 
 */
public class BugPosts extends common.dbvisit.BaseTable {
	
	/**
	 * BP_ID: 
	 */
	private int bpId;
	
	/**
	 * BP_BUG: 
	 */
	private int bpBug;
	
	/**
	 * BP_TYPE: 
	 */
	private String bpType = "";
	
	/**
	 * BP_USER: 
	 */
	private int bpUser;
	
	/**
	 * BP_DATE: 
	 */
	private java.util.Date bpDate;
	
	/**
	 * BP_COMMENT: 
	 */
	private String bpComment = "";
	
	/**
	 * BP_EMAIL_FROM: 
	 */
	private String bpEmailFrom;
	
	/**
	 * BP_EMAIL_TO: 
	 */
	private String bpEmailTo;
	
	/**
	 * BP_FILE: 
	 */
	private String bpFile;
	
	/**
	 * BP_SIZE: 
	 */
	private Integer bpSize;
	
	/**
	 * BP_CONTENT_TYPE: 
	 */
	private String bpContentType;
	
	/**
	 * BP_PARENT: 
	 */
	private Integer bpParent;
	
	/**
	 * BP_ORIGINAL_COMMENT_ID: 
	 */
	private Integer bpOriginalCommentId;
	
	/**
	 * BP_ID: 
	 */
	public int getBpId() {
		return this.bpId;
	}
	
	/**
	 * BP_ID: 
	 */
	public void setBpId(int value)
	 {
		this.bpId = value;
	}
	
	/**
	 * BP_BUG: 
	 */
	public int getBpBug() {
		return this.bpBug;
	}
	
	/**
	 * BP_BUG: 
	 */
	public void setBpBug(int value)
	 {
		this.bpBug = value;
	}
	
	/**
	 * BP_TYPE: 
	 */
	public String getBpType() {
		return this.bpType;
	}
	
	/**
	 * BP_TYPE: 
	 */
	public void setBpType(String value)
	 {
		this.bpType = value;
	}
	
	/**
	 * BP_USER: 
	 */
	public int getBpUser() {
		return this.bpUser;
	}
	
	/**
	 * BP_USER: 
	 */
	public void setBpUser(int value)
	 {
		this.bpUser = value;
	}
	
	/**
	 * BP_DATE: 
	 */
	public java.util.Date getBpDate() {
		return this.bpDate;
	}
	
	/**
	 * BP_DATE: 
	 */
	public void setBpDate(java.util.Date value)
	 {
		this.bpDate = value;
	}
	
	/**
	 * BP_COMMENT: 
	 */
	public String getBpComment() {
		return this.bpComment;
	}
	
	/**
	 * BP_COMMENT: 
	 */
	public void setBpComment(String value)
	 {
		this.bpComment = value;
	}
	
	/**
	 * BP_EMAIL_FROM: 
	 */
	public String getBpEmailFrom() {
		return this.bpEmailFrom;
	}
	
	/**
	 * BP_EMAIL_FROM: 
	 */
	public void setBpEmailFrom(String value)
	 {
		this.bpEmailFrom = value;
	}
	
	/**
	 * BP_EMAIL_TO: 
	 */
	public String getBpEmailTo() {
		return this.bpEmailTo;
	}
	
	/**
	 * BP_EMAIL_TO: 
	 */
	public void setBpEmailTo(String value)
	 {
		this.bpEmailTo = value;
	}
	
	/**
	 * BP_FILE: 
	 */
	public String getBpFile() {
		return this.bpFile;
	}
	
	/**
	 * BP_FILE: 
	 */
	public void setBpFile(String value)
	 {
		this.bpFile = value;
	}
	
	/**
	 * BP_SIZE: 
	 */
	public Integer getBpSize() {
		return this.bpSize;
	}
	
	/**
	 * BP_SIZE: 
	 */
	public void setBpSize(Integer value)
	 {
		this.bpSize = value;
	}
	
	/**
	 * BP_CONTENT_TYPE: 
	 */
	public String getBpContentType() {
		return this.bpContentType;
	}
	
	/**
	 * BP_CONTENT_TYPE: 
	 */
	public void setBpContentType(String value)
	 {
		this.bpContentType = value;
	}
	
	/**
	 * BP_PARENT: 
	 */
	public Integer getBpParent() {
		return this.bpParent;
	}
	
	/**
	 * BP_PARENT: 
	 */
	public void setBpParent(Integer value)
	 {
		this.bpParent = value;
	}
	
	/**
	 * BP_ORIGINAL_COMMENT_ID: 
	 */
	public Integer getBpOriginalCommentId() {
		return this.bpOriginalCommentId;
	}
	
	/**
	 * BP_ORIGINAL_COMMENT_ID: 
	 */
	public void setBpOriginalCommentId(Integer value)
	 {
		this.bpOriginalCommentId = value;
	}
	
	public static String getSelectSql() {
		return "select [BUG_POSTS].[BP_ID],[BUG_POSTS].[BP_BUG],[BUG_POSTS].[BP_TYPE],[BUG_POSTS].[BP_USER],[BUG_POSTS].[BP_DATE],[BUG_POSTS].[BP_COMMENT],[BUG_POSTS].[BP_EMAIL_FROM],[BUG_POSTS].[BP_EMAIL_TO],[BUG_POSTS].[BP_FILE],[BUG_POSTS].[BP_SIZE],[BUG_POSTS].[BP_CONTENT_TYPE],[BUG_POSTS].[BP_PARENT],[BUG_POSTS].[BP_ORIGINAL_COMMENT_ID] ";
	}
	
	
	/**
	 * 插入一个对象到数据库中
	 * @param ADataVisit 数据访问接口
	 * @param BugPosts 需要插入的新对象
	 */
	public static void insert(IDataVisit2 ADataVisit, BugPosts ABugPosts) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("insert into [BUG_POSTS] (");
		sql.append("[BUG_POSTS].[BP_BUG],");
		sql.append("[BUG_POSTS].[BP_TYPE],");
		sql.append("[BUG_POSTS].[BP_USER],");
		sql.append("[BUG_POSTS].[BP_DATE],");
		sql.append("[BUG_POSTS].[BP_COMMENT],");
		if ((ABugPosts.bpEmailFrom == null)) {
		}
		else {
			sql.append("[BUG_POSTS].[BP_EMAIL_FROM],");
		}
		if ((ABugPosts.bpEmailTo == null)) {
		}
		else {
			sql.append("[BUG_POSTS].[BP_EMAIL_TO],");
		}
		if ((ABugPosts.bpFile == null)) {
		}
		else {
			sql.append("[BUG_POSTS].[BP_FILE],");
		}
		if ((ABugPosts.bpSize == null)) {
		}
		else {
			sql.append("[BUG_POSTS].[BP_SIZE],");
		}
		if ((ABugPosts.bpContentType == null)) {
		}
		else {
			sql.append("[BUG_POSTS].[BP_CONTENT_TYPE],");
		}
		if ((ABugPosts.bpParent == null)) {
		}
		else {
			sql.append("[BUG_POSTS].[BP_PARENT],");
		}
		if ((ABugPosts.bpOriginalCommentId == null)) {
		}
		else {
			sql.append("[BUG_POSTS].[BP_ORIGINAL_COMMENT_ID],");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(") values (");
		sql.append(ABugPosts.bpBug);
		sql.append(",");
		sql.append(SqlServerUtils.safeSql(ABugPosts.bpType.toString()));
		sql.append(",");
		sql.append(ABugPosts.bpUser);
		sql.append(",");
		sql.append(SqlServerUtils.getDateSql(ABugPosts.bpDate));
		sql.append(",");
		sql.append(SqlServerUtils.safeSql(ABugPosts.bpComment.toString()));
		sql.append(",");
		if ((ABugPosts.bpEmailFrom == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(ABugPosts.bpEmailFrom.toString()));
			sql.append(",");
		}
		if ((ABugPosts.bpEmailTo == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(ABugPosts.bpEmailTo.toString()));
			sql.append(",");
		}
		if ((ABugPosts.bpFile == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(ABugPosts.bpFile.toString()));
			sql.append(",");
		}
		if ((ABugPosts.bpSize == null)) {
		}
		else {
			sql.append(ABugPosts.bpSize);
			sql.append(",");
		}
		if ((ABugPosts.bpContentType == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(ABugPosts.bpContentType.toString()));
			sql.append(",");
		}
		if ((ABugPosts.bpParent == null)) {
		}
		else {
			sql.append(ABugPosts.bpParent);
			sql.append(",");
		}
		if ((ABugPosts.bpOriginalCommentId == null)) {
		}
		else {
			sql.append(ABugPosts.bpOriginalCommentId);
			sql.append(",");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(")");
		ADataVisit.beginTransaction();
		try {
			ADataVisit.execSql(sql.toString());
			ABugPosts.bpId = ((int)(((double)(ADataVisit.getIDentity()))));
			ADataVisit.commitTransaction();
		}
		catch (SQLException e) {
			ADataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param BugPosts 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, BugPosts ABugPosts) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("BUG_POSTS set ");
		sql.append("BP_BUG = ");
		sql.append(ABugPosts.bpBug);
		sql.append(",");
		sql.append("BP_TYPE = ");
		sql.append(SqlServerUtils.safeSql(ABugPosts.bpType.toString()));
		sql.append(",");
		sql.append("BP_USER = ");
		sql.append(ABugPosts.bpUser);
		sql.append(",");
		sql.append("BP_DATE = ");
		sql.append(SqlServerUtils.getDateSql(ABugPosts.bpDate));
		sql.append(",");
		sql.append("BP_COMMENT = ");
		sql.append(SqlServerUtils.safeSql(ABugPosts.bpComment.toString()));
		sql.append(",");
		if ((ABugPosts.bpEmailFrom == null)) {
			sql.append("BP_EMAIL_FROM = default ,");
		}
		else {
			sql.append("BP_EMAIL_FROM = ");
			sql.append(SqlServerUtils.safeSql(ABugPosts.bpEmailFrom.toString()));
			sql.append(",");
		}
		if ((ABugPosts.bpEmailTo == null)) {
			sql.append("BP_EMAIL_TO = default ,");
		}
		else {
			sql.append("BP_EMAIL_TO = ");
			sql.append(SqlServerUtils.safeSql(ABugPosts.bpEmailTo.toString()));
			sql.append(",");
		}
		if ((ABugPosts.bpFile == null)) {
			sql.append("BP_FILE = default ,");
		}
		else {
			sql.append("BP_FILE = ");
			sql.append(SqlServerUtils.safeSql(ABugPosts.bpFile.toString()));
			sql.append(",");
		}
		if ((ABugPosts.bpSize == null)) {
			sql.append("BP_SIZE = default ,");
		}
		else {
			sql.append("BP_SIZE = ");
			sql.append(ABugPosts.bpSize);
			sql.append(",");
		}
		if ((ABugPosts.bpContentType == null)) {
			sql.append("BP_CONTENT_TYPE = default ,");
		}
		else {
			sql.append("BP_CONTENT_TYPE = ");
			sql.append(SqlServerUtils.safeSql(ABugPosts.bpContentType.toString()));
			sql.append(",");
		}
		if ((ABugPosts.bpParent == null)) {
			sql.append("BP_PARENT = default ,");
		}
		else {
			sql.append("BP_PARENT = ");
			sql.append(ABugPosts.bpParent);
			sql.append(",");
		}
		if ((ABugPosts.bpOriginalCommentId == null)) {
			sql.append("BP_ORIGINAL_COMMENT_ID = default ,");
		}
		else {
			sql.append("BP_ORIGINAL_COMMENT_ID = ");
			sql.append(ABugPosts.bpOriginalCommentId);
			sql.append(",");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("BP_ID = ");
		sql.append(ABugPosts.bpId);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param BugPosts 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, BugPosts ABugPosts, String appendConditionSql) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("BUG_POSTS set ");
		sql.append("BP_BUG = ");
		sql.append(ABugPosts.bpBug);
		sql.append(",");
		sql.append("BP_TYPE = ");
		sql.append(SqlServerUtils.safeSql(ABugPosts.bpType.toString()));
		sql.append(",");
		sql.append("BP_USER = ");
		sql.append(ABugPosts.bpUser);
		sql.append(",");
		sql.append("BP_DATE = ");
		sql.append(SqlServerUtils.getDateSql(ABugPosts.bpDate));
		sql.append(",");
		sql.append("BP_COMMENT = ");
		sql.append(SqlServerUtils.safeSql(ABugPosts.bpComment.toString()));
		sql.append(",");
		if ((ABugPosts.bpEmailFrom == null)) {
			sql.append("BP_EMAIL_FROM = default ,");
		}
		else {
			sql.append("BP_EMAIL_FROM = ");
			sql.append(SqlServerUtils.safeSql(ABugPosts.bpEmailFrom.toString()));
			sql.append(",");
		}
		if ((ABugPosts.bpEmailTo == null)) {
			sql.append("BP_EMAIL_TO = default ,");
		}
		else {
			sql.append("BP_EMAIL_TO = ");
			sql.append(SqlServerUtils.safeSql(ABugPosts.bpEmailTo.toString()));
			sql.append(",");
		}
		if ((ABugPosts.bpFile == null)) {
			sql.append("BP_FILE = default ,");
		}
		else {
			sql.append("BP_FILE = ");
			sql.append(SqlServerUtils.safeSql(ABugPosts.bpFile.toString()));
			sql.append(",");
		}
		if ((ABugPosts.bpSize == null)) {
			sql.append("BP_SIZE = default ,");
		}
		else {
			sql.append("BP_SIZE = ");
			sql.append(ABugPosts.bpSize);
			sql.append(",");
		}
		if ((ABugPosts.bpContentType == null)) {
			sql.append("BP_CONTENT_TYPE = default ,");
		}
		else {
			sql.append("BP_CONTENT_TYPE = ");
			sql.append(SqlServerUtils.safeSql(ABugPosts.bpContentType.toString()));
			sql.append(",");
		}
		if ((ABugPosts.bpParent == null)) {
			sql.append("BP_PARENT = default ,");
		}
		else {
			sql.append("BP_PARENT = ");
			sql.append(ABugPosts.bpParent);
			sql.append(",");
		}
		if ((ABugPosts.bpOriginalCommentId == null)) {
			sql.append("BP_ORIGINAL_COMMENT_ID = default ,");
		}
		else {
			sql.append("BP_ORIGINAL_COMMENT_ID = ");
			sql.append(ABugPosts.bpOriginalCommentId);
			sql.append(",");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("BP_ID = ");
		sql.append(ABugPosts.bpId);
		sql.append(appendConditionSql);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @param AppendSql 附加的Sql语句
	 * @return 查询结果
	 */
	public static List<BugPosts> selectObjects(IDataVisit2 ADataVisit, String AppendSql) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((BugPosts.getSelectSql() 
						+ (" from [BUG_POSTS] " + AppendSql)));
		List<BugPosts> list = new ArrayList<BugPosts>();
		try {
			for (; reader.next(); ) {
				BugPosts obj = new BugPosts();
				BugPosts.readValue(reader, obj);
				list.add(obj);
			}
		}
		finally {
			if ((reader != null)) {
				reader.close();
			}
			ADataVisit.releaseConnection();
		}
		return list;
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @return 查询结果
	 */
	public static List<BugPosts> selectObjects(IDataVisit2 ADataVisit) throws SQLException {
		return BugPosts.selectObjects(ADataVisit, "");
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @param AppendSql 附加的Sql语句
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public static List<BugPosts> selectObjects(IDataVisit2 ADataVisit, String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((BugPosts.getSelectSql() 
						+ (" from [BUG_POSTS] " + AppendSql)), pageIndex, rowsOfPage, orderField, order);
		List<BugPosts> list = new ArrayList<BugPosts>();
		try {
			for (; reader.next(); ) {
				BugPosts obj = new BugPosts();
				BugPosts.readValue(reader, obj);
				list.add(obj);
			}
		}
		finally {
			if ((reader != null)) {
				reader.close();
			}
			ADataVisit.releaseConnection();
		}
		return list;
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public static List<BugPosts> selectObjects(IDataVisit2 ADataVisit, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		return BugPosts.selectObjects(ADataVisit, "", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 从数据表BUG_POSTS中查询一个实体对象
	 * @param ADataVisit 数据访问接口
	 * @param Int32 
	 */
	public static BugPosts SelectByBpId(IDataVisit2 ADataVisit, int ABpId) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append(" where ");
		sql.append("BP_ID = ");
		sql.append(ABpId);
		List<BugPosts> list = BugPosts.selectObjects(ADataVisit, sql.toString());
		if ((list.size() > 0)) {
			return list.get(0);
		}
		else {
			return null;
		}
	}
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * @param object 源对象
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (this.getClass().isInstance(obj)) {
			BugPosts o = ((BugPosts)(obj));
			this.bpId = o.bpId;
			this.bpBug = o.bpBug;
			this.bpType = o.bpType;
			this.bpUser = o.bpUser;
			this.bpDate = o.bpDate;
			this.bpComment = o.bpComment;
			this.bpEmailFrom = o.bpEmailFrom;
			this.bpEmailTo = o.bpEmailTo;
			this.bpFile = o.bpFile;
			this.bpSize = o.bpSize;
			this.bpContentType = o.bpContentType;
			this.bpParent = o.bpParent;
			this.bpOriginalCommentId = o.bpOriginalCommentId;
		}
	}
	
	/**
	 * 复制值到给定的对象,要求目标对象是子类
	 * @param object 目标对象
	 */
	public void assignTo(BaseTable obj) {
		super.assignTo(obj);
		if (this.getClass().isInstance(obj)) {
			BugPosts o = ((BugPosts)(obj));
			o.bpId = this.bpId;
			o.bpBug = this.bpBug;
			o.bpType = this.bpType;
			o.bpUser = this.bpUser;
			o.bpDate = this.bpDate;
			o.bpComment = this.bpComment;
			o.bpEmailFrom = this.bpEmailFrom;
			o.bpEmailTo = this.bpEmailTo;
			o.bpFile = this.bpFile;
			o.bpSize = this.bpSize;
			o.bpContentType = this.bpContentType;
			o.bpParent = this.bpParent;
			o.bpOriginalCommentId = this.bpOriginalCommentId;
		}
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * <@param appendSql 附加的条件语句>
	 */
	public static void deleteByBpId(IDataVisit2 ADataVisit, int ABpId, String appendSql) throws SQLException, DbException {
		String sql = "";
		sql = (sql + " delete from BUG_POSTS where ");
		sql = (sql + "BP_ID = ");
		sql = (sql + ABpId);
		sql = (sql + appendSql);
		ADataVisit.execSql(sql);
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 */
	public static void deleteByBpId(IDataVisit2 ADataVisit, int ABpId) throws SQLException, DbException {
		BugPosts.deleteByBpId(ADataVisit, ABpId, "");
	}
	
	/**
	 * 把ResultSet中的数据转到对象中
	 * @param AReader 数据源
	 * @param ABugPosts 目标对象
	 * @return 
	 */
	public static void readValue(ResultSet AReader, BugPosts ABugPosts) throws SQLException {
		ABugPosts.bpId = AReader.getInt(1);
		ABugPosts.bpBug = AReader.getInt(2);
		ABugPosts.bpType = AReader.getString(3);
		ABugPosts.bpUser = AReader.getInt(4);
		ABugPosts.bpDate = SqlUtils.getDate(AReader, 5);
		ABugPosts.bpComment = AReader.getString(6);
		ABugPosts.bpEmailFrom = AReader.getString(7);
		if (AReader.wasNull()) {
			ABugPosts.bpEmailFrom = null;
		}
		ABugPosts.bpEmailTo = AReader.getString(8);
		if (AReader.wasNull()) {
			ABugPosts.bpEmailTo = null;
		}
		ABugPosts.bpFile = AReader.getString(9);
		if (AReader.wasNull()) {
			ABugPosts.bpFile = null;
		}
		ABugPosts.bpSize = AReader.getInt(10);
		if (AReader.wasNull()) {
			ABugPosts.bpSize = null;
		}
		ABugPosts.bpContentType = AReader.getString(11);
		if (AReader.wasNull()) {
			ABugPosts.bpContentType = null;
		}
		ABugPosts.bpParent = AReader.getInt(12);
		if (AReader.wasNull()) {
			ABugPosts.bpParent = null;
		}
		ABugPosts.bpOriginalCommentId = AReader.getInt(13);
		if (AReader.wasNull()) {
			ABugPosts.bpOriginalCommentId = null;
		}
	}
}
