package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_LEAVE: 请假单
 */
public class Leave extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	String workFlowId = "";
	
	/**
	 * REQUEST_USER_ID: 申请人
	 */
	int requestUserId;
	
	/**
	 * AUDIT_USER_ID: 最后审核人
	 */
	Integer auditUserId;
	
	/**
	 * LEAVE_TYPE: 请假类型
	 *   0：病假
	 *   1：事假
	 *   2：丧假
	 *   3：婚假
	 */
	int leaveType;
	
	/**
	 * LEAVE_REASON: 请假理由
	 */
	String leaveReason;
	
	/**
	 * LEAVE_STATE: 请假状态 0 申请中 1 通过 2 拒绝 3 用户取消
	 */
	byte leaveState;
	
	/**
	 * LEAVE_MEMO: 当前备注
	 */
	String leaveMemo;
	
	/**
	 * LEAVE_START_TIME: 开始请假时间
	 */
	java.util.Date leaveStartTime;
	
	/**
	 * LEAVE_END_TIME: 结束请假时间
	 */
	java.util.Date leaveEndTime;
	
	/**
	 * WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	public String getWorkFlowId() {
		return this.workFlowId;
	}
	
	/**
	 * WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	public void setWorkFlowId(String value)
	 {
		this.workFlowId = value;
	}
	
	/**
	 * REQUEST_USER_ID: 申请人
	 */
	public int getRequestUserId() {
		return this.requestUserId;
	}
	
	/**
	 * REQUEST_USER_ID: 申请人
	 */
	public void setRequestUserId(int value)
	 {
		this.requestUserId = value;
	}
	
	/**
	 * AUDIT_USER_ID: 最后审核人
	 */
	public Integer getAuditUserId() {
		return this.auditUserId;
	}
	
	/**
	 * AUDIT_USER_ID: 最后审核人
	 */
	public void setAuditUserId(Integer value)
	 {
		this.auditUserId = value;
	}
	
	/**
	 * LEAVE_TYPE: 请假类型
	 *   0：病假
	 *   1：事假
	 *   2：丧假
	 *   3：婚假
	 */
	public int getLeaveType() {
		return this.leaveType;
	}
	
	/**
	 * LEAVE_TYPE: 请假类型
	 *   0：病假
	 *   1：事假
	 *   2：丧假
	 *   3：婚假
	 */
	public void setLeaveType(int value)
	 {
		this.leaveType = value;
	}
	
	/**
	 * LEAVE_REASON: 请假理由
	 */
	public String getLeaveReason() {
		return this.leaveReason;
	}
	
	/**
	 * LEAVE_REASON: 请假理由
	 */
	public void setLeaveReason(String value)
	 {
		this.leaveReason = value;
	}
	
	/**
	 * LEAVE_STATE: 请假状态 0 申请中 1 通过 2 拒绝 3 用户取消
	 */
	public byte getLeaveState() {
		return this.leaveState;
	}
	
	/**
	 * LEAVE_STATE: 请假状态 0 申请中 1 通过 2 拒绝 3 用户取消
	 */
	public void setLeaveState(byte value)
	 {
		this.leaveState = value;
	}
	
	/**
	 * LEAVE_MEMO: 当前备注
	 */
	public String getLeaveMemo() {
		return this.leaveMemo;
	}
	
	/**
	 * LEAVE_MEMO: 当前备注
	 */
	public void setLeaveMemo(String value)
	 {
		this.leaveMemo = value;
	}
	
	/**
	 * LEAVE_START_TIME: 开始请假时间
	 */
	public java.util.Date getLeaveStartTime() {
		return this.leaveStartTime;
	}
	
	/**
	 * LEAVE_START_TIME: 开始请假时间
	 */
	public void setLeaveStartTime(java.util.Date value)
	 {
		this.leaveStartTime = value;
	}
	
	/**
	 * LEAVE_END_TIME: 结束请假时间
	 */
	public java.util.Date getLeaveEndTime() {
		return this.leaveEndTime;
	}
	
	/**
	 * LEAVE_END_TIME: 结束请假时间
	 */
	public void setLeaveEndTime(java.util.Date value)
	 {
		this.leaveEndTime = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_LEAVE].[WORK_FLOW_ID], [T_LEAVE].[REQUEST_USER_ID], [T_LEAVE].[AUDIT_U" +
"SER_ID], [T_LEAVE].[LEAVE_TYPE], [T_LEAVE].[LEAVE_REASON], [T_LEAVE].[LEAVE_STAT" +
"E], [T_LEAVE].[LEAVE_MEMO], [T_LEAVE].[LEAVE_START_TIME], [T_LEAVE].[LEAVE_END_T" +
"IME]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_LEAVE].[WORK_FLOW_ID], [T_LEAVE].[REQUEST_USER_ID], [T_LEAVE].[AUDIT_USER_ID], [T_LEAVE].[LEAVE_TYPE], [T_LEAVE].[LEAVE_REASON], [T_LEAVE].[LEAVE_STATE], [T_LEAVE].[LEAVE_MEMO], [T_LEAVE].[LEAVE_START_TIME], [T_LEAVE].[LEAVE_END_TIME]   from [T_LEAVE] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_LEAVE].[WORK_FLOW_ID], [T_LEAVE].[REQUEST_USER_ID], [T_LEAVE].[AUDIT_USER_ID]" +
", [T_LEAVE].[LEAVE_TYPE], [T_LEAVE].[LEAVE_REASON], [T_LEAVE].[LEAVE_STATE], [T_" +
"LEAVE].[LEAVE_MEMO], [T_LEAVE].[LEAVE_START_TIME], [T_LEAVE].[LEAVE_END_TIME] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_LEAVE";
	}
	
	
	public String getTableName() {
		return "T_LEAVE";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "WORK_FLOW_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.workFlowId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (Leave.class.isInstance(obj)) {
			Leave o = ((Leave)(obj));
			this.workFlowId = o.workFlowId;
			this.requestUserId = o.requestUserId;
			this.auditUserId = o.auditUserId;
			this.leaveType = o.leaveType;
			this.leaveReason = o.leaveReason;
			this.leaveState = o.leaveState;
			this.leaveMemo = o.leaveMemo;
			this.leaveStartTime = o.leaveStartTime;
			this.leaveEndTime = o.leaveEndTime;
		}
	}
	
	/**
	 * 插入Leave对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="leave">需要插入的请假单</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Leave leave) throws SQLException, DbException {
		String sql = "insert into [T_LEAVE](";
		sql = (sql + "[WORK_FLOW_ID]");
		sql = (sql + ", [REQUEST_USER_ID]");
		sql = (sql + ", [AUDIT_USER_ID]");
		sql = (sql + ", [LEAVE_TYPE]");
		sql = (sql + ", [LEAVE_REASON]");
		sql = (sql + ", [LEAVE_STATE]");
		sql = (sql + ", [LEAVE_MEMO]");
		sql = (sql + ", [LEAVE_START_TIME]");
		sql = (sql + ", [LEAVE_END_TIME]");
		sql = (sql + ")values(");
		sql = (sql + SqlServerUtils.safeSql(leave.getWorkFlowId().toString()));
		sql = (sql + ", ");
		sql = (sql + leave.getRequestUserId());
		sql = (sql + ", ");
		if ((leave.auditUserId == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + leave.getAuditUserId());
		}
		sql = (sql + ", ");
		sql = (sql + leave.getLeaveType());
		sql = (sql + ", ");
		if ((leave.leaveReason == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(leave.getLeaveReason().toString()));
		}
		sql = (sql + ", ");
		sql = (sql + leave.getLeaveState());
		sql = (sql + ", ");
		if ((leave.leaveMemo == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(leave.getLeaveMemo().toString()));
		}
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getDateSql(leave.getLeaveStartTime()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getDateSql(leave.getLeaveEndTime()));
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入Leave对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Leave.insert(dataVisit, this);
	}
	
	/**
	 * 更新Leave对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="leave">需要更新的请假单</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Leave leave, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_LEAVE] set ";
		sql = (sql + "[REQUEST_USER_ID] = ");
		sql = (sql + leave.getRequestUserId());
		sql = (sql + ",");
		if ((leave.auditUserId == null)) {
			sql = (sql + "[AUDIT_USER_ID] = default ,");
		}
		else {
			sql = (sql + "[AUDIT_USER_ID] = ");
			sql = (sql + leave.getAuditUserId());
			sql = (sql + ",");
		}
		sql = (sql + "[LEAVE_TYPE] = ");
		sql = (sql + leave.getLeaveType());
		sql = (sql + ",");
		if ((leave.leaveReason == null)) {
			sql = (sql + "[LEAVE_REASON] = default ,");
		}
		else {
			sql = (sql + "[LEAVE_REASON] = ");
			sql = (sql + SqlServerUtils.safeSql(leave.getLeaveReason().toString()));
			sql = (sql + ",");
		}
		sql = (sql + "[LEAVE_STATE] = ");
		sql = (sql + leave.getLeaveState());
		sql = (sql + ",");
		if ((leave.leaveMemo == null)) {
			sql = (sql + "[LEAVE_MEMO] = default ,");
		}
		else {
			sql = (sql + "[LEAVE_MEMO] = ");
			sql = (sql + SqlServerUtils.safeSql(leave.getLeaveMemo().toString()));
			sql = (sql + ",");
		}
		sql = (sql + "[LEAVE_START_TIME] = ");
		sql = (sql + SqlServerUtils.getDateSql(leave.getLeaveStartTime()));
		sql = (sql + ",");
		sql = (sql + "[LEAVE_END_TIME] = ");
		sql = (sql + SqlServerUtils.getDateSql(leave.getLeaveEndTime()));
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "WORK_FLOW_ID = ");
		sql = (sql + SqlServerUtils.safeSql(leave.getWorkFlowId().toString()));
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Leave对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="leave">需要更新的请假单</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Leave leave) throws SQLException, DbException {
		return Leave.update(dataVisit, leave, "");
	}
	
	/**
	 * 更新Leave对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Leave.update(dataVisit, this);
	}
	
	/**
	 * 更新Leave对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Leave.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Leave> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Leave> list = new ArrayList<Leave>();
		try {
			for (; reader.next(); ) {
				Leave obj = new Leave();
				Leave.readValue(reader, obj);
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
	public static List<Leave> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Leave> list = new ArrayList<Leave>();
		try {
			for (; reader.next(); ) {
				Leave obj = new Leave();
				Leave.readValue(reader, obj);
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
	public static List<Leave> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Leave.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Leave> list = new ArrayList<Leave>();
		try {
			for (; reader.next(); ) {
				Leave obj = new Leave();
				Leave.readValue(reader, obj);
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
	public static List<Leave> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Leave.getFullSelectSql() + appendConditionSql));
		List<Leave> list = new ArrayList<Leave>();
		try {
			for (; reader.next(); ) {
				Leave obj = new Leave();
				Leave.readValue(reader, obj);
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
	public static <T extends Leave> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Leave.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Leave.readValue(reader, obj);
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
public static <T extends Leave> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Leave.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Leave.readValue(reader, obj);
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
	String sql = "select * from T_LEAVE ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据工作流ID,关联JBPM查询Leave
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
public static Leave selectByWorkFlowId(IDataVisit2 dataVisit, String AWorkFlowId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "WORK_FLOW_ID = ");
	sql = (sql + SqlServerUtils.safeSql(AWorkFlowId.toString()));
	List<Leave> list = Leave.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Leave对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByWorkFlowId(IDataVisit2 dataVisit, String AWorkFlowId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_LEAVE] where ");
	sql = (sql + "WORK_FLOW_ID = ");
	sql = (sql + SqlServerUtils.safeSql(AWorkFlowId.toString()));
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Leave对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
public static void deleteByWorkFlowId(IDataVisit2 dataVisit, String AWorkFlowId) throws SQLException, DbException {
	Leave.deleteByWorkFlowId(dataVisit, AWorkFlowId, "");
}

/**
 * 根据外键申请人删除一批Leave对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="RequestUserId">申请人</param>
 */
public static void deleteListByRequestUserId(IDataVisit2 dataVisit, int ARequestUserId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_LEAVE] where ");
	sql = (sql + "REQUEST_USER_ID = ");
	sql = (sql + ARequestUserId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键最后审核人删除一批Leave对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AuditUserId">最后审核人</param>
 */
public static void deleteListByAuditUserId(IDataVisit2 dataVisit, Integer AAuditUserId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_LEAVE] where ");
	sql = (sql + "AUDIT_USER_ID = ");
	sql = (sql + AAuditUserId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="RequestUserId">申请人</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Leave> selectObjectsByRequestUserId(IDataVisit2 dataVisit, int ARequestUserId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where REQUEST_USER_ID = ";
	sql = (sql + ARequestUserId);
	sql = (sql + appendConditionSql);
	return Leave.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="RequestUserId">申请人</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Leave> selectObjectsByRequestUserId(IDataVisit2 dataVisit, int ARequestUserId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where REQUEST_USER_ID = ";
	sql = (sql + ARequestUserId);
	return Leave.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="RequestUserId">申请人</param>
 */
public static List<Leave> selectObjectsByRequestUserId(IDataVisit2 dataVisit, int ARequestUserId) throws SQLException, DbException {
	String sql = " where REQUEST_USER_ID = ";
	sql = (sql + ARequestUserId);
	return Leave.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AuditUserId">最后审核人</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Leave> selectObjectsByAuditUserId(IDataVisit2 dataVisit, Integer AAuditUserId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where AUDIT_USER_ID = ";
	sql = (sql + AAuditUserId);
	sql = (sql + appendConditionSql);
	return Leave.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AuditUserId">最后审核人</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Leave> selectObjectsByAuditUserId(IDataVisit2 dataVisit, Integer AAuditUserId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where AUDIT_USER_ID = ";
	sql = (sql + AAuditUserId);
	return Leave.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AuditUserId">最后审核人</param>
 */
public static List<Leave> selectObjectsByAuditUserId(IDataVisit2 dataVisit, Integer AAuditUserId) throws SQLException, DbException {
	String sql = " where AUDIT_USER_ID = ";
	sql = (sql + AAuditUserId);
	return Leave.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="WorkFlowId">工作流ID,关联JBPM</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Leave> selectObjectsByWorkFlowId(IDataVisit2 dataVisit, String AWorkFlowId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where WORK_FLOW_ID = ";
	sql = (sql + SqlServerUtils.safeSql(AWorkFlowId.toString()));
	sql = (sql + appendConditionSql);
	return Leave.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="WorkFlowId">工作流ID,关联JBPM</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Leave> selectObjectsByWorkFlowId(IDataVisit2 dataVisit, String AWorkFlowId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where WORK_FLOW_ID = ";
	sql = (sql + SqlServerUtils.safeSql(AWorkFlowId.toString()));
	return Leave.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="WorkFlowId">工作流ID,关联JBPM</param>
 */
public static List<Leave> selectObjectsByWorkFlowId(IDataVisit2 dataVisit, String AWorkFlowId) throws SQLException, DbException {
	String sql = " where WORK_FLOW_ID = ";
	sql = (sql + SqlServerUtils.safeSql(AWorkFlowId.toString()));
	return Leave.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象leave中
 * <param name="reader">数据源</param>
 * <param name="leave">目标对象</param>
 */
public static void readValue(ResultSet reader, Leave leave) throws SQLException, DbException {
	leave.workFlowId = reader.getString(1);
	leave.requestUserId = reader.getInt(2);
	leave.auditUserId = reader.getInt(3);
	if (reader.wasNull()) {
		leave.auditUserId = null;
	}
	leave.leaveType = reader.getInt(4);
	leave.leaveReason = reader.getString(5);
	if (reader.wasNull()) {
		leave.leaveReason = null;
	}
	leave.leaveState = reader.getByte(6);
	leave.leaveMemo = reader.getString(7);
	if (reader.wasNull()) {
		leave.leaveMemo = null;
	}
	leave.leaveStartTime = SqlUtils.getDate(reader, 8);
	leave.leaveEndTime = SqlUtils.getDate(reader, 9);
}
}
