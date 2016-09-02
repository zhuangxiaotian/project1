package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_WORK_FLOW: 工作流
 */
public class WorkFlow extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	String workFlowId = "";
	
	/**
	 * WORK_FLOW_TYPE: 工作流类型
	 */
	int workFlowType;
	
	/**
	 * CREATOR: 创建人
	 */
	int creator;
	
	/**
	 * PROCESS_ID: 流程实例ID
	 */
	String processId;
	
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
	 * WORK_FLOW_TYPE: 工作流类型
	 */
	public int getWorkFlowType() {
		return this.workFlowType;
	}
	
	/**
	 * WORK_FLOW_TYPE: 工作流类型
	 */
	public void setWorkFlowType(int value)
	 {
		this.workFlowType = value;
	}
	
	/**
	 * CREATOR: 创建人
	 */
	public int getCreator() {
		return this.creator;
	}
	
	/**
	 * CREATOR: 创建人
	 */
	public void setCreator(int value)
	 {
		this.creator = value;
	}
	
	/**
	 * PROCESS_ID: 流程实例ID
	 */
	public String getProcessId() {
		return this.processId;
	}
	
	/**
	 * PROCESS_ID: 流程实例ID
	 */
	public void setProcessId(String value)
	 {
		this.processId = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_WORK_FLOW].[WORK_FLOW_ID], [T_WORK_FLOW].[WORK_FLOW_TYPE], [T_WORK_FLO" +
"W].[CREATOR], [T_WORK_FLOW].[PROCESS_ID]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_WORK_FLOW].[WORK_FLOW_ID], [T_WORK_FLOW].[WORK_FLOW_TYPE], [T_WORK_FLO" +
"W].[CREATOR], [T_WORK_FLOW].[PROCESS_ID]   from [T_WORK_FLOW] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_WORK_FLOW].[WORK_FLOW_ID], [T_WORK_FLOW].[WORK_FLOW_TYPE], [T_WORK_FLOW].[CRE" +
"ATOR], [T_WORK_FLOW].[PROCESS_ID] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_WORK_FLOW";
	}
	
	
	public String getTableName() {
		return "T_WORK_FLOW";
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
		if (WorkFlow.class.isInstance(obj)) {
			WorkFlow o = ((WorkFlow)(obj));
			this.workFlowId = o.workFlowId;
			this.workFlowType = o.workFlowType;
			this.creator = o.creator;
			this.processId = o.processId;
		}
	}
	
	/**
	 * 插入WorkFlow对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="workFlow">需要插入的工作流</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, WorkFlow workFlow) throws SQLException, DbException {
		String sql = "insert into [T_WORK_FLOW](";
		sql = (sql + "[WORK_FLOW_ID]");
		sql = (sql + ", [WORK_FLOW_TYPE]");
		sql = (sql + ", [CREATOR]");
		sql = (sql + ", [PROCESS_ID]");
		sql = (sql + ")values(");
		sql = (sql + SqlServerUtils.safeSql(workFlow.getWorkFlowId().toString()));
		sql = (sql + ", ");
		sql = (sql + workFlow.getWorkFlowType());
		sql = (sql + ", ");
		sql = (sql + workFlow.getCreator());
		sql = (sql + ", ");
		if ((workFlow.processId == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(workFlow.getProcessId().toString()));
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入WorkFlow对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		WorkFlow.insert(dataVisit, this);
	}
	
	/**
	 * 更新WorkFlow对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="workFlow">需要更新的工作流</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, WorkFlow workFlow, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_WORK_FLOW] set ";
		sql = (sql + "[WORK_FLOW_TYPE] = ");
		sql = (sql + workFlow.getWorkFlowType());
		sql = (sql + ",");
		sql = (sql + "[CREATOR] = ");
		sql = (sql + workFlow.getCreator());
		sql = (sql + ",");
		if ((workFlow.processId == null)) {
			sql = (sql + "[PROCESS_ID] = default ,");
		}
		else {
			sql = (sql + "[PROCESS_ID] = ");
			sql = (sql + SqlServerUtils.safeSql(workFlow.getProcessId().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "WORK_FLOW_ID = ");
		sql = (sql + SqlServerUtils.safeSql(workFlow.getWorkFlowId().toString()));
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新WorkFlow对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="workFlow">需要更新的工作流</param>
	 */
	protected static int update(IDataVisit2 dataVisit, WorkFlow workFlow) throws SQLException, DbException {
		return WorkFlow.update(dataVisit, workFlow, "");
	}
	
	/**
	 * 更新WorkFlow对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return WorkFlow.update(dataVisit, this);
	}
	
	/**
	 * 更新WorkFlow对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return WorkFlow.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<WorkFlow> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<WorkFlow> list = new ArrayList<WorkFlow>();
		try {
			for (; reader.next(); ) {
				WorkFlow obj = new WorkFlow();
				WorkFlow.readValue(reader, obj);
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
	public static List<WorkFlow> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<WorkFlow> list = new ArrayList<WorkFlow>();
		try {
			for (; reader.next(); ) {
				WorkFlow obj = new WorkFlow();
				WorkFlow.readValue(reader, obj);
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
	public static List<WorkFlow> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((WorkFlow.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<WorkFlow> list = new ArrayList<WorkFlow>();
		try {
			for (; reader.next(); ) {
				WorkFlow obj = new WorkFlow();
				WorkFlow.readValue(reader, obj);
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
	public static List<WorkFlow> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((WorkFlow.getFullSelectSql() + appendConditionSql));
		List<WorkFlow> list = new ArrayList<WorkFlow>();
		try {
			for (; reader.next(); ) {
				WorkFlow obj = new WorkFlow();
				WorkFlow.readValue(reader, obj);
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
	public static <T extends WorkFlow> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((WorkFlow.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			WorkFlow.readValue(reader, obj);
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
public static <T extends WorkFlow> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((WorkFlow.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			WorkFlow.readValue(reader, obj);
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
	String sql = "select * from T_WORK_FLOW ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据工作流ID,关联JBPM查询WorkFlow
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
public static WorkFlow selectByWorkFlowId(IDataVisit2 dataVisit, String AWorkFlowId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "WORK_FLOW_ID = ");
	sql = (sql + SqlServerUtils.safeSql(AWorkFlowId.toString()));
	List<WorkFlow> list = WorkFlow.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个WorkFlow对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByWorkFlowId(IDataVisit2 dataVisit, String AWorkFlowId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_WORK_FLOW] where ");
	sql = (sql + "WORK_FLOW_ID = ");
	sql = (sql + SqlServerUtils.safeSql(AWorkFlowId.toString()));
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个WorkFlow对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AWorkFlowId">工作流ID,关联JBPM</param>
 */
public static void deleteByWorkFlowId(IDataVisit2 dataVisit, String AWorkFlowId) throws SQLException, DbException {
	WorkFlow.deleteByWorkFlowId(dataVisit, AWorkFlowId, "");
}

/**
 * 根据外键创建人删除一批WorkFlow对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Creator">创建人</param>
 */
public static void deleteListByCreator(IDataVisit2 dataVisit, int ACreator) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_WORK_FLOW] where ");
	sql = (sql + "CREATOR = ");
	sql = (sql + ACreator);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Creator">创建人</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<WorkFlow> selectObjectsByCreator(IDataVisit2 dataVisit, int ACreator, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where CREATOR = ";
	sql = (sql + ACreator);
	sql = (sql + appendConditionSql);
	return WorkFlow.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Creator">创建人</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<WorkFlow> selectObjectsByCreator(IDataVisit2 dataVisit, int ACreator, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where CREATOR = ";
	sql = (sql + ACreator);
	return WorkFlow.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Creator">创建人</param>
 */
public static List<WorkFlow> selectObjectsByCreator(IDataVisit2 dataVisit, int ACreator) throws SQLException, DbException {
	String sql = " where CREATOR = ";
	sql = (sql + ACreator);
	return WorkFlow.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象workFlow中
 * <param name="reader">数据源</param>
 * <param name="workFlow">目标对象</param>
 */
public static void readValue(ResultSet reader, WorkFlow workFlow) throws SQLException, DbException {
	workFlow.workFlowId = reader.getString(1);
	workFlow.workFlowType = reader.getInt(2);
	workFlow.creator = reader.getInt(3);
	workFlow.processId = reader.getString(4);
	if (reader.wasNull()) {
		workFlow.processId = null;
	}
}
}
