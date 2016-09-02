package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * WORK_FLOW_MEMO: 流程备注，每一个流程切换时，将当前的备注信息存到此备注中
 */
public class WorkFlowMemo extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * WORK_FLOW_MEMO_ID: 标识
	 */
	int workFlowMemoId;
	
	/**
	 * WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	String workFlowId = "";
	
	/**
	 * MEMO_USER_ID: 用户代号
	 */
	int memoUserId;
	
	/**
	 * MEMO_TIME: 备注时间
	 */
	java.util.Date memoTime;
	
	/**
	 * MEMO_CONTENT: 备注内容
	 */
	String memoContent = "";
	
	/**
	 * WORK_FLOW_MEMO_ID: 标识
	 */
	public int getWorkFlowMemoId() {
		return this.workFlowMemoId;
	}
	
	/**
	 * WORK_FLOW_MEMO_ID: 标识
	 */
	public void setWorkFlowMemoId(int value)
	 {
		this.workFlowMemoId = value;
	}
	
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
	 * MEMO_USER_ID: 用户代号
	 */
	public int getMemoUserId() {
		return this.memoUserId;
	}
	
	/**
	 * MEMO_USER_ID: 用户代号
	 */
	public void setMemoUserId(int value)
	 {
		this.memoUserId = value;
	}
	
	/**
	 * MEMO_TIME: 备注时间
	 */
	public java.util.Date getMemoTime() {
		return this.memoTime;
	}
	
	/**
	 * MEMO_TIME: 备注时间
	 */
	public void setMemoTime(java.util.Date value)
	 {
		this.memoTime = value;
	}
	
	/**
	 * MEMO_CONTENT: 备注内容
	 */
	public String getMemoContent() {
		return this.memoContent;
	}
	
	/**
	 * MEMO_CONTENT: 备注内容
	 */
	public void setMemoContent(String value)
	 {
		this.memoContent = value;
	}
	
	public static String getSelectSql() {
		return "select  [WORK_FLOW_MEMO].[WORK_FLOW_MEMO_ID], [WORK_FLOW_MEMO].[WORK_FLOW_ID], [W" +
"ORK_FLOW_MEMO].[MEMO_USER_ID], [WORK_FLOW_MEMO].[MEMO_TIME], [WORK_FLOW_MEMO].[M" +
"EMO_CONTENT]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [WORK_FLOW_MEMO].[WORK_FLOW_MEMO_ID], [WORK_FLOW_MEMO].[WORK_FLOW_ID], [W" +
"ORK_FLOW_MEMO].[MEMO_USER_ID], [WORK_FLOW_MEMO].[MEMO_TIME], [WORK_FLOW_MEMO].[M" +
"EMO_CONTENT]   from [WORK_FLOW_MEMO] ";
	}
	
	
	public static String getColumnSql() {
		return " [WORK_FLOW_MEMO].[WORK_FLOW_MEMO_ID], [WORK_FLOW_MEMO].[WORK_FLOW_ID], [WORK_FLO" +
"W_MEMO].[MEMO_USER_ID], [WORK_FLOW_MEMO].[MEMO_TIME], [WORK_FLOW_MEMO].[MEMO_CON" +
"TENT] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "WORK_FLOW_MEMO";
	}
	
	
	public String getTableName() {
		return "WORK_FLOW_MEMO";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "WORK_FLOW_MEMO_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.workFlowMemoId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (WorkFlowMemo.class.isInstance(obj)) {
			WorkFlowMemo o = ((WorkFlowMemo)(obj));
			this.workFlowMemoId = o.workFlowMemoId;
			this.workFlowId = o.workFlowId;
			this.memoUserId = o.memoUserId;
			this.memoTime = o.memoTime;
			this.memoContent = o.memoContent;
		}
	}
	
	/**
	 * 插入WorkFlowMemo对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="workFlowMemo">需要插入的流程备注，每一个流程切换时，将当前的备注信息存到此备注中</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, WorkFlowMemo workFlowMemo) throws SQLException, DbException {
		String sql = "insert into [WORK_FLOW_MEMO](";
		if ((workFlowMemo.getWorkFlowMemoId() > 0)) {
			sql = (sql + "[WORK_FLOW_MEMO_ID], ");
		}
		sql = (sql + "[WORK_FLOW_ID]");
		sql = (sql + ", [MEMO_USER_ID]");
		sql = (sql + ", [MEMO_TIME]");
		sql = (sql + ", [MEMO_CONTENT]");
		sql = (sql + ")values(");
		if ((workFlowMemo.getWorkFlowMemoId() > 0)) {
			sql = (sql + workFlowMemo.getWorkFlowMemoId());
			sql = (sql + ", ");
		}
		sql = (sql + SqlServerUtils.safeSql(workFlowMemo.getWorkFlowId().toString()));
		sql = (sql + ", ");
		sql = (sql + workFlowMemo.getMemoUserId());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getDateSql(workFlowMemo.getMemoTime()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(workFlowMemo.getMemoContent().toString()));
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((workFlowMemo.getWorkFlowMemoId() > 0)) {
				sql = ("SET IDENTITY_INSERT [WORK_FLOW_MEMO] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT WORK_FLOW_MEMO off");
			}
			dataVisit.execSql(sql);
			if ((workFlowMemo.getWorkFlowMemoId() == 0)) {
				workFlowMemo.workFlowMemoId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入WorkFlowMemo对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		WorkFlowMemo.insert(dataVisit, this);
	}
	
	/**
	 * 更新WorkFlowMemo对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="workFlowMemo">需要更新的流程备注，每一个流程切换时，将当前的备注信息存到此备注中</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, WorkFlowMemo workFlowMemo, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [WORK_FLOW_MEMO] set ";
		sql = (sql + "[WORK_FLOW_ID] = ");
		sql = (sql + SqlServerUtils.safeSql(workFlowMemo.getWorkFlowId().toString()));
		sql = (sql + ",");
		sql = (sql + "[MEMO_USER_ID] = ");
		sql = (sql + workFlowMemo.getMemoUserId());
		sql = (sql + ",");
		sql = (sql + "[MEMO_TIME] = ");
		sql = (sql + SqlServerUtils.getDateSql(workFlowMemo.getMemoTime()));
		sql = (sql + ",");
		sql = (sql + "[MEMO_CONTENT] = ");
		sql = (sql + SqlServerUtils.safeSql(workFlowMemo.getMemoContent().toString()));
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "WORK_FLOW_MEMO_ID = ");
		sql = (sql + workFlowMemo.getWorkFlowMemoId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新WorkFlowMemo对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="workFlowMemo">需要更新的流程备注，每一个流程切换时，将当前的备注信息存到此备注中</param>
	 */
	protected static int update(IDataVisit2 dataVisit, WorkFlowMemo workFlowMemo) throws SQLException, DbException {
		return WorkFlowMemo.update(dataVisit, workFlowMemo, "");
	}
	
	/**
	 * 更新WorkFlowMemo对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return WorkFlowMemo.update(dataVisit, this);
	}
	
	/**
	 * 更新WorkFlowMemo对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return WorkFlowMemo.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<WorkFlowMemo> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<WorkFlowMemo> list = new ArrayList<WorkFlowMemo>();
		try {
			for (; reader.next(); ) {
				WorkFlowMemo obj = new WorkFlowMemo();
				WorkFlowMemo.readValue(reader, obj);
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
	public static List<WorkFlowMemo> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<WorkFlowMemo> list = new ArrayList<WorkFlowMemo>();
		try {
			for (; reader.next(); ) {
				WorkFlowMemo obj = new WorkFlowMemo();
				WorkFlowMemo.readValue(reader, obj);
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
	public static List<WorkFlowMemo> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((WorkFlowMemo.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<WorkFlowMemo> list = new ArrayList<WorkFlowMemo>();
		try {
			for (; reader.next(); ) {
				WorkFlowMemo obj = new WorkFlowMemo();
				WorkFlowMemo.readValue(reader, obj);
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
	public static List<WorkFlowMemo> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((WorkFlowMemo.getFullSelectSql() + appendConditionSql));
		List<WorkFlowMemo> list = new ArrayList<WorkFlowMemo>();
		try {
			for (; reader.next(); ) {
				WorkFlowMemo obj = new WorkFlowMemo();
				WorkFlowMemo.readValue(reader, obj);
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
	public static <T extends WorkFlowMemo> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((WorkFlowMemo.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			WorkFlowMemo.readValue(reader, obj);
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
public static <T extends WorkFlowMemo> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((WorkFlowMemo.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			WorkFlowMemo.readValue(reader, obj);
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
	String sql = "select * from WORK_FLOW_MEMO ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据标识查询WorkFlowMemo
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AWorkFlowMemoId">标识</param>
 */
public static WorkFlowMemo selectByWorkFlowMemoId(IDataVisit2 dataVisit, int AWorkFlowMemoId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "WORK_FLOW_MEMO_ID = ");
	sql = (sql + AWorkFlowMemoId);
	List<WorkFlowMemo> list = WorkFlowMemo.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个WorkFlowMemo对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AWorkFlowMemoId">标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByWorkFlowMemoId(IDataVisit2 dataVisit, int AWorkFlowMemoId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [WORK_FLOW_MEMO] where ");
	sql = (sql + "WORK_FLOW_MEMO_ID = ");
	sql = (sql + AWorkFlowMemoId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个WorkFlowMemo对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AWorkFlowMemoId">标识</param>
 */
public static void deleteByWorkFlowMemoId(IDataVisit2 dataVisit, int AWorkFlowMemoId) throws SQLException, DbException {
	WorkFlowMemo.deleteByWorkFlowMemoId(dataVisit, AWorkFlowMemoId, "");
}

/**
 * 根据外键用户代号删除一批WorkFlowMemo对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="MemoUserId">用户代号</param>
 */
public static void deleteListByMemoUserId(IDataVisit2 dataVisit, int AMemoUserId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [WORK_FLOW_MEMO] where ");
	sql = (sql + "MEMO_USER_ID = ");
	sql = (sql + AMemoUserId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键工作流ID,关联JBPM删除一批WorkFlowMemo对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="WorkFlowId">工作流ID,关联JBPM</param>
 */
public static void deleteListByWorkFlowId(IDataVisit2 dataVisit, String AWorkFlowId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [WORK_FLOW_MEMO] where ");
	sql = (sql + "WORK_FLOW_ID = ");
	sql = (sql + SqlServerUtils.safeSql(AWorkFlowId.toString()));
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="MemoUserId">用户代号</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<WorkFlowMemo> selectObjectsByMemoUserId(IDataVisit2 dataVisit, int AMemoUserId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where MEMO_USER_ID = ";
	sql = (sql + AMemoUserId);
	sql = (sql + appendConditionSql);
	return WorkFlowMemo.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="MemoUserId">用户代号</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<WorkFlowMemo> selectObjectsByMemoUserId(IDataVisit2 dataVisit, int AMemoUserId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where MEMO_USER_ID = ";
	sql = (sql + AMemoUserId);
	return WorkFlowMemo.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="MemoUserId">用户代号</param>
 */
public static List<WorkFlowMemo> selectObjectsByMemoUserId(IDataVisit2 dataVisit, int AMemoUserId) throws SQLException, DbException {
	String sql = " where MEMO_USER_ID = ";
	sql = (sql + AMemoUserId);
	return WorkFlowMemo.selectObjects(dataVisit, sql);
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
public static List<WorkFlowMemo> selectObjectsByWorkFlowId(IDataVisit2 dataVisit, String AWorkFlowId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where WORK_FLOW_ID = ";
	sql = (sql + SqlServerUtils.safeSql(AWorkFlowId.toString()));
	sql = (sql + appendConditionSql);
	return WorkFlowMemo.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
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
public static List<WorkFlowMemo> selectObjectsByWorkFlowId(IDataVisit2 dataVisit, String AWorkFlowId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where WORK_FLOW_ID = ";
	sql = (sql + SqlServerUtils.safeSql(AWorkFlowId.toString()));
	return WorkFlowMemo.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="WorkFlowId">工作流ID,关联JBPM</param>
 */
public static List<WorkFlowMemo> selectObjectsByWorkFlowId(IDataVisit2 dataVisit, String AWorkFlowId) throws SQLException, DbException {
	String sql = " where WORK_FLOW_ID = ";
	sql = (sql + SqlServerUtils.safeSql(AWorkFlowId.toString()));
	return WorkFlowMemo.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象workFlowMemo中
 * <param name="reader">数据源</param>
 * <param name="workFlowMemo">目标对象</param>
 */
public static void readValue(ResultSet reader, WorkFlowMemo workFlowMemo) throws SQLException, DbException {
	workFlowMemo.workFlowMemoId = reader.getInt(1);
	workFlowMemo.workFlowId = reader.getString(2);
	workFlowMemo.memoUserId = reader.getInt(3);
	workFlowMemo.memoTime = SqlUtils.getDate(reader, 4);
	workFlowMemo.memoContent = reader.getString(5);
}
}
