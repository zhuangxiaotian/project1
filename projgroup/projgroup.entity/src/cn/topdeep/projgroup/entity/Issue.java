package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE: 问题帖子
 */
public class Issue extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * ISSUE_ID: 问题标识
	 */
	int issueId;
	
	/**
	 * STATUS_ID: 状态标识
	 */
	int statusId;
	
	/**
	 * PRIORITIES_ID: 优先级别
	 */
	byte prioritiesId;
	
	/**
	 * REPORT_USER_ID: 报告用户
	 */
	int reportUserId;
	
	/**
	 * ASSIGN_USER_ID: 关联处理用户
	 */
	int assignUserId;
	
	/**
	 * ISSUE_PROJECT_ID: 项目标识
	 */
	int issueProjectId;
	
	/**
	 * ISSUE_PROJECT_MODULE_ID: 标识
	 */
	Integer issueProjectModuleId;
	
	/**
	 * ISSUE_TYPE: 
	 */
	byte issueType;
	
	/**
	 * ISSUE_SHORT_DESC: 问题简短描述
	 */
	String issueShortDesc = "";
	
	/**
	 * REPORT_TIME: 报告时间
	 */
	java.util.Date reportTime;
	
	/**
	 * UPDATE_TIME: 最后更新时间
	 */
	java.util.Date updateTime;
	
	/**
	 * TIME_STAMP: 
	 */
	byte[] timeStamp;
	
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
	 * STATUS_ID: 状态标识
	 */
	public int getStatusId() {
		return this.statusId;
	}
	
	/**
	 * STATUS_ID: 状态标识
	 */
	public void setStatusId(int value)
	 {
		this.statusId = value;
	}
	
	/**
	 * PRIORITIES_ID: 优先级别
	 */
	public byte getPrioritiesId() {
		return this.prioritiesId;
	}
	
	/**
	 * PRIORITIES_ID: 优先级别
	 */
	public void setPrioritiesId(byte value)
	 {
		this.prioritiesId = value;
	}
	
	/**
	 * REPORT_USER_ID: 报告用户
	 */
	public int getReportUserId() {
		return this.reportUserId;
	}
	
	/**
	 * REPORT_USER_ID: 报告用户
	 */
	public void setReportUserId(int value)
	 {
		this.reportUserId = value;
	}
	
	/**
	 * ASSIGN_USER_ID: 关联处理用户
	 */
	public int getAssignUserId() {
		return this.assignUserId;
	}
	
	/**
	 * ASSIGN_USER_ID: 关联处理用户
	 */
	public void setAssignUserId(int value)
	 {
		this.assignUserId = value;
	}
	
	/**
	 * ISSUE_PROJECT_ID: 项目标识
	 */
	public int getIssueProjectId() {
		return this.issueProjectId;
	}
	
	/**
	 * ISSUE_PROJECT_ID: 项目标识
	 */
	public void setIssueProjectId(int value)
	 {
		this.issueProjectId = value;
	}
	
	/**
	 * ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public Integer getIssueProjectModuleId() {
		return this.issueProjectModuleId;
	}
	
	/**
	 * ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public void setIssueProjectModuleId(Integer value)
	 {
		this.issueProjectModuleId = value;
	}
	
	/**
	 * ISSUE_TYPE: 
	 */
	public byte getIssueType() {
		return this.issueType;
	}
	
	/**
	 * ISSUE_TYPE: 
	 */
	public void setIssueType(byte value)
	 {
		this.issueType = value;
	}
	
	/**
	 * ISSUE_SHORT_DESC: 问题简短描述
	 */
	public String getIssueShortDesc() {
		return this.issueShortDesc;
	}
	
	/**
	 * ISSUE_SHORT_DESC: 问题简短描述
	 */
	public void setIssueShortDesc(String value)
	 {
		this.issueShortDesc = value;
	}
	
	/**
	 * REPORT_TIME: 报告时间
	 */
	public java.util.Date getReportTime() {
		return this.reportTime;
	}
	
	/**
	 * REPORT_TIME: 报告时间
	 */
	public void setReportTime(java.util.Date value)
	 {
		this.reportTime = value;
	}
	
	/**
	 * UPDATE_TIME: 最后更新时间
	 */
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	
	/**
	 * UPDATE_TIME: 最后更新时间
	 */
	public void setUpdateTime(java.util.Date value)
	 {
		this.updateTime = value;
	}
	
	/**
	 * TIME_STAMP: 
	 */
	public byte[] getTimeStamp() {
		return this.timeStamp;
	}
	
	/**
	 * TIME_STAMP: 
	 */
	public void setTimeStamp(byte[] value)
	 {
		this.timeStamp = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_ISSUE].[ISSUE_ID], [T_ISSUE].[STATUS_ID], [T_ISSUE].[PRIORITIES_ID], [T_ISSUE].[REPORT_USER_ID], [T_ISSUE].[ASSIGN_USER_ID], [T_ISSUE].[ISSUE_PROJECT_ID], [T_ISSUE].[ISSUE_PROJECT_MODULE_ID], [T_ISSUE].[ISSUE_TYPE], [T_ISSUE].[ISSUE_SHORT_DESC], [T_ISSUE].[REPORT_TIME], [T_ISSUE].[UPDATE_TIME], [T_ISSUE].[TIME_STAMP]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_ISSUE].[ISSUE_ID], [T_ISSUE].[STATUS_ID], [T_ISSUE].[PRIORITIES_ID], [T_ISSUE].[REPORT_USER_ID], [T_ISSUE].[ASSIGN_USER_ID], [T_ISSUE].[ISSUE_PROJECT_ID], [T_ISSUE].[ISSUE_PROJECT_MODULE_ID], [T_ISSUE].[ISSUE_TYPE], [T_ISSUE].[ISSUE_SHORT_DESC], [T_ISSUE].[REPORT_TIME], [T_ISSUE].[UPDATE_TIME], [T_ISSUE].[TIME_STAMP]   from [T_ISSUE] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_ISSUE].[ISSUE_ID], [T_ISSUE].[STATUS_ID], [T_ISSUE].[PRIORITIES_ID], [T_ISSUE].[REPORT_USER_ID], [T_ISSUE].[ASSIGN_USER_ID], [T_ISSUE].[ISSUE_PROJECT_ID], [T_ISSUE].[ISSUE_PROJECT_MODULE_ID], [T_ISSUE].[ISSUE_TYPE], [T_ISSUE].[ISSUE_SHORT_DESC], [T_ISSUE].[REPORT_TIME], [T_ISSUE].[UPDATE_TIME], [T_ISSUE].[TIME_STAMP] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_ISSUE";
	}
	
	
	public String getTableName() {
		return "T_ISSUE";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "ISSUE_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.issueId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (Issue.class.isInstance(obj)) {
			Issue o = ((Issue)(obj));
			this.issueId = o.issueId;
			this.statusId = o.statusId;
			this.prioritiesId = o.prioritiesId;
			this.reportUserId = o.reportUserId;
			this.assignUserId = o.assignUserId;
			this.issueProjectId = o.issueProjectId;
			this.issueProjectModuleId = o.issueProjectModuleId;
			this.issueType = o.issueType;
			this.issueShortDesc = o.issueShortDesc;
			this.reportTime = o.reportTime;
			this.updateTime = o.updateTime;
			this.timeStamp = o.timeStamp;
		}
	}
	
	/**
	 * 插入Issue对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issue">需要插入的问题帖子</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Issue issue) throws SQLException, DbException {
		String sql = "insert into [T_ISSUE](";
		if ((issue.getIssueId() > 0)) {
			sql = (sql + "[ISSUE_ID], ");
		}
		sql = (sql + "[STATUS_ID]");
		sql = (sql + ", [PRIORITIES_ID]");
		sql = (sql + ", [REPORT_USER_ID]");
		sql = (sql + ", [ASSIGN_USER_ID]");
		sql = (sql + ", [ISSUE_PROJECT_ID]");
		sql = (sql + ", [ISSUE_PROJECT_MODULE_ID]");
		sql = (sql + ", [ISSUE_TYPE]");
		sql = (sql + ", [ISSUE_SHORT_DESC]");
		sql = (sql + ", [REPORT_TIME]");
		sql = (sql + ", [UPDATE_TIME]");
		sql = (sql + ")values(");
		if ((issue.getIssueId() > 0)) {
			sql = (sql + issue.getIssueId());
			sql = (sql + ", ");
		}
		sql = (sql + issue.getStatusId());
		sql = (sql + ", ");
		sql = (sql + issue.getPrioritiesId());
		sql = (sql + ", ");
		sql = (sql + issue.getReportUserId());
		sql = (sql + ", ");
		sql = (sql + issue.getAssignUserId());
		sql = (sql + ", ");
		sql = (sql + issue.getIssueProjectId());
		sql = (sql + ", ");
		if ((issue.issueProjectModuleId == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + issue.getIssueProjectModuleId());
		}
		sql = (sql + ", ");
		sql = (sql + issue.getIssueType());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(issue.getIssueShortDesc().toString()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getDateSql(issue.getReportTime()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getDateSql(issue.getUpdateTime()));
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((issue.getIssueId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_ISSUE] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_ISSUE off");
			}
			dataVisit.execSql(sql);
			if ((issue.getIssueId() == 0)) {
				issue.issueId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入Issue对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Issue.insert(dataVisit, this);
	}
	
	/**
	 * 更新Issue对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issue">需要更新的问题帖子</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Issue issue, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_ISSUE] set ";
		sql = (sql + "[STATUS_ID] = ");
		sql = (sql + issue.getStatusId());
		sql = (sql + ",");
		sql = (sql + "[PRIORITIES_ID] = ");
		sql = (sql + issue.getPrioritiesId());
		sql = (sql + ",");
		sql = (sql + "[REPORT_USER_ID] = ");
		sql = (sql + issue.getReportUserId());
		sql = (sql + ",");
		sql = (sql + "[ASSIGN_USER_ID] = ");
		sql = (sql + issue.getAssignUserId());
		sql = (sql + ",");
		sql = (sql + "[ISSUE_PROJECT_ID] = ");
		sql = (sql + issue.getIssueProjectId());
		sql = (sql + ",");
		if ((issue.issueProjectModuleId == null)) {
			sql = (sql + "[ISSUE_PROJECT_MODULE_ID] = default ,");
		}
		else {
			sql = (sql + "[ISSUE_PROJECT_MODULE_ID] = ");
			sql = (sql + issue.getIssueProjectModuleId());
			sql = (sql + ",");
		}
		sql = (sql + "[ISSUE_TYPE] = ");
		sql = (sql + issue.getIssueType());
		sql = (sql + ",");
		sql = (sql + "[ISSUE_SHORT_DESC] = ");
		sql = (sql + SqlServerUtils.safeSql(issue.getIssueShortDesc().toString()));
		sql = (sql + ",");
		sql = (sql + "[REPORT_TIME] = ");
		sql = (sql + SqlServerUtils.getDateSql(issue.getReportTime()));
		sql = (sql + ",");
		sql = (sql + "[UPDATE_TIME] = ");
		sql = (sql + SqlServerUtils.getDateSql(issue.getUpdateTime()));
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "ISSUE_ID = ");
		sql = (sql + issue.getIssueId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Issue对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issue">需要更新的问题帖子</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Issue issue) throws SQLException, DbException {
		return Issue.update(dataVisit, issue, "");
	}
	
	/**
	 * 更新Issue对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Issue.update(dataVisit, this);
	}
	
	/**
	 * 更新Issue对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Issue.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Issue> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Issue> list = new ArrayList<Issue>();
		try {
			for (; reader.next(); ) {
				Issue obj = new Issue();
				Issue.readValue(reader, obj);
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
	public static List<Issue> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Issue> list = new ArrayList<Issue>();
		try {
			for (; reader.next(); ) {
				Issue obj = new Issue();
				Issue.readValue(reader, obj);
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
	public static List<Issue> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Issue.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Issue> list = new ArrayList<Issue>();
		try {
			for (; reader.next(); ) {
				Issue obj = new Issue();
				Issue.readValue(reader, obj);
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
	public static List<Issue> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Issue.getFullSelectSql() + appendConditionSql));
		List<Issue> list = new ArrayList<Issue>();
		try {
			for (; reader.next(); ) {
				Issue obj = new Issue();
				Issue.readValue(reader, obj);
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
	public static <T extends Issue> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Issue.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Issue.readValue(reader, obj);
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
public static <T extends Issue> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Issue.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Issue.readValue(reader, obj);
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
	String sql = "select * from T_ISSUE ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据问题标识查询Issue
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueId">问题标识</param>
 */
public static Issue selectByIssueId(IDataVisit2 dataVisit, int AIssueId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "ISSUE_ID = ");
	sql = (sql + AIssueId);
	List<Issue> list = Issue.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Issue对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueId">问题标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByIssueId(IDataVisit2 dataVisit, int AIssueId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ISSUE] where ");
	sql = (sql + "ISSUE_ID = ");
	sql = (sql + AIssueId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Issue对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AIssueId">问题标识</param>
 */
public static void deleteByIssueId(IDataVisit2 dataVisit, int AIssueId) throws SQLException, DbException {
	Issue.deleteByIssueId(dataVisit, AIssueId, "");
}

/**
 * 根据外键优先级别删除一批Issue对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PrioritiesId">优先级别</param>
 */
public static void deleteListByPrioritiesId(IDataVisit2 dataVisit, Byte APrioritiesId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE] where ");
	sql = (sql + "PRIORITIES_ID = ");
	sql = (sql + APrioritiesId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键项目标识删除一批Issue对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueProjectId">项目标识</param>
 */
public static void deleteListByIssueProjectId(IDataVisit2 dataVisit, int AIssueProjectId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE] where ");
	sql = (sql + "ISSUE_PROJECT_ID = ");
	sql = (sql + AIssueProjectId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键标识删除一批Issue对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueProjectModuleId">标识</param>
 */
public static void deleteListByIssueProjectModuleId(IDataVisit2 dataVisit, Integer AIssueProjectModuleId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE] where ");
	sql = (sql + "ISSUE_PROJECT_MODULE_ID = ");
	sql = (sql + AIssueProjectModuleId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键状态标识删除一批Issue对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="StatusId">状态标识</param>
 */
public static void deleteListByStatusId(IDataVisit2 dataVisit, int AStatusId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE] where ");
	sql = (sql + "STATUS_ID = ");
	sql = (sql + AStatusId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键报告用户删除一批Issue对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ReportUserId">报告用户</param>
 */
public static void deleteListByReportUserId(IDataVisit2 dataVisit, int AReportUserId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE] where ");
	sql = (sql + "REPORT_USER_ID = ");
	sql = (sql + AReportUserId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键关联处理用户删除一批Issue对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AssignUserId">关联处理用户</param>
 */
public static void deleteListByAssignUserId(IDataVisit2 dataVisit, int AAssignUserId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE] where ");
	sql = (sql + "ASSIGN_USER_ID = ");
	sql = (sql + AAssignUserId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PrioritiesId">优先级别</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Issue> selectObjectsByPrioritiesId(IDataVisit2 dataVisit, Byte APrioritiesId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PRIORITIES_ID = ";
	sql = (sql + APrioritiesId);
	sql = (sql + appendConditionSql);
	return Issue.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PrioritiesId">优先级别</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Issue> selectObjectsByPrioritiesId(IDataVisit2 dataVisit, Byte APrioritiesId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PRIORITIES_ID = ";
	sql = (sql + APrioritiesId);
	return Issue.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PrioritiesId">优先级别</param>
 */
public static List<Issue> selectObjectsByPrioritiesId(IDataVisit2 dataVisit, Byte APrioritiesId) throws SQLException, DbException {
	String sql = " where PRIORITIES_ID = ";
	sql = (sql + APrioritiesId);
	return Issue.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueProjectId">项目标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Issue> selectObjectsByIssueProjectId(IDataVisit2 dataVisit, int AIssueProjectId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ISSUE_PROJECT_ID = ";
	sql = (sql + AIssueProjectId);
	sql = (sql + appendConditionSql);
	return Issue.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueProjectId">项目标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Issue> selectObjectsByIssueProjectId(IDataVisit2 dataVisit, int AIssueProjectId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ISSUE_PROJECT_ID = ";
	sql = (sql + AIssueProjectId);
	return Issue.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueProjectId">项目标识</param>
 */
public static List<Issue> selectObjectsByIssueProjectId(IDataVisit2 dataVisit, int AIssueProjectId) throws SQLException, DbException {
	String sql = " where ISSUE_PROJECT_ID = ";
	sql = (sql + AIssueProjectId);
	return Issue.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueProjectModuleId">标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Issue> selectObjectsByIssueProjectModuleId(IDataVisit2 dataVisit, Integer AIssueProjectModuleId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ISSUE_PROJECT_MODULE_ID = ";
	sql = (sql + AIssueProjectModuleId);
	sql = (sql + appendConditionSql);
	return Issue.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueProjectModuleId">标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Issue> selectObjectsByIssueProjectModuleId(IDataVisit2 dataVisit, Integer AIssueProjectModuleId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ISSUE_PROJECT_MODULE_ID = ";
	sql = (sql + AIssueProjectModuleId);
	return Issue.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="IssueProjectModuleId">标识</param>
 */
public static List<Issue> selectObjectsByIssueProjectModuleId(IDataVisit2 dataVisit, Integer AIssueProjectModuleId) throws SQLException, DbException {
	String sql = " where ISSUE_PROJECT_MODULE_ID = ";
	sql = (sql + AIssueProjectModuleId);
	return Issue.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="StatusId">状态标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Issue> selectObjectsByStatusId(IDataVisit2 dataVisit, int AStatusId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where STATUS_ID = ";
	sql = (sql + AStatusId);
	sql = (sql + appendConditionSql);
	return Issue.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="StatusId">状态标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Issue> selectObjectsByStatusId(IDataVisit2 dataVisit, int AStatusId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where STATUS_ID = ";
	sql = (sql + AStatusId);
	return Issue.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="StatusId">状态标识</param>
 */
public static List<Issue> selectObjectsByStatusId(IDataVisit2 dataVisit, int AStatusId) throws SQLException, DbException {
	String sql = " where STATUS_ID = ";
	sql = (sql + AStatusId);
	return Issue.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ReportUserId">报告用户</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Issue> selectObjectsByReportUserId(IDataVisit2 dataVisit, int AReportUserId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where REPORT_USER_ID = ";
	sql = (sql + AReportUserId);
	sql = (sql + appendConditionSql);
	return Issue.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ReportUserId">报告用户</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Issue> selectObjectsByReportUserId(IDataVisit2 dataVisit, int AReportUserId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where REPORT_USER_ID = ";
	sql = (sql + AReportUserId);
	return Issue.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ReportUserId">报告用户</param>
 */
public static List<Issue> selectObjectsByReportUserId(IDataVisit2 dataVisit, int AReportUserId) throws SQLException, DbException {
	String sql = " where REPORT_USER_ID = ";
	sql = (sql + AReportUserId);
	return Issue.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AssignUserId">关联处理用户</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Issue> selectObjectsByAssignUserId(IDataVisit2 dataVisit, int AAssignUserId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ASSIGN_USER_ID = ";
	sql = (sql + AAssignUserId);
	sql = (sql + appendConditionSql);
	return Issue.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AssignUserId">关联处理用户</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Issue> selectObjectsByAssignUserId(IDataVisit2 dataVisit, int AAssignUserId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ASSIGN_USER_ID = ";
	sql = (sql + AAssignUserId);
	return Issue.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AssignUserId">关联处理用户</param>
 */
public static List<Issue> selectObjectsByAssignUserId(IDataVisit2 dataVisit, int AAssignUserId) throws SQLException, DbException {
	String sql = " where ASSIGN_USER_ID = ";
	sql = (sql + AAssignUserId);
	return Issue.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象issue中
 * <param name="reader">数据源</param>
 * <param name="issue">目标对象</param>
 */
public static void readValue(ResultSet reader, Issue issue) throws SQLException, DbException {
	issue.issueId = reader.getInt(1);
	issue.statusId = reader.getInt(2);
	issue.prioritiesId = reader.getByte(3);
	issue.reportUserId = reader.getInt(4);
	issue.assignUserId = reader.getInt(5);
	issue.issueProjectId = reader.getInt(6);
	issue.issueProjectModuleId = reader.getInt(7);
	if (reader.wasNull()) {
		issue.issueProjectModuleId = null;
	}
	issue.issueType = reader.getByte(8);
	issue.issueShortDesc = reader.getString(9);
	issue.reportTime = SqlUtils.getDate(reader, 10);
	issue.updateTime = SqlUtils.getDate(reader, 11);
	issue.timeStamp = reader.getBytes(12);
}
}
