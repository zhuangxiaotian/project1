package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_WORK_LOG_RELATIONSHIP_TASK: 工作日志——关系——任务表
 */
public class WorkLogRelationshipTask extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * WORK_LOG_ID: 工作日志代号
	 */
	int workLogId;
	
	/**
	 * TASK_ID: 任务代号
	 */
	int taskId;
	
	/**
	 * WORK_LOG_ID: 工作日志代号
	 */
	public int getWorkLogId() {
		return this.workLogId;
	}
	
	/**
	 * WORK_LOG_ID: 工作日志代号
	 */
	public void setWorkLogId(int value)
	 {
		this.workLogId = value;
	}
	
	/**
	 * TASK_ID: 任务代号
	 */
	public int getTaskId() {
		return this.taskId;
	}
	
	/**
	 * TASK_ID: 任务代号
	 */
	public void setTaskId(int value)
	 {
		this.taskId = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_WORK_LOG_RELATIONSHIP_TASK].[WORK_LOG_ID], [T_WORK_LOG_RELATIONSHIP_TA" +
"SK].[TASK_ID]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_WORK_LOG_RELATIONSHIP_TASK].[WORK_LOG_ID], [T_WORK_LOG_RELATIONSHIP_TA" +
"SK].[TASK_ID]   from [T_WORK_LOG_RELATIONSHIP_TASK] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_WORK_LOG_RELATIONSHIP_TASK].[WORK_LOG_ID], [T_WORK_LOG_RELATIONSHIP_TASK].[TA" +
"SK_ID] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_WORK_LOG_RELATIONSHIP_TASK";
	}
	
	
	public String getTableName() {
		return "T_WORK_LOG_RELATIONSHIP_TASK";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "WORK_LOG_ID,TASK_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.workLogId);
		kvalue = (kvalue + ",");
		kvalue = (kvalue + this.taskId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (WorkLogRelationshipTask.class.isInstance(obj)) {
			WorkLogRelationshipTask o = ((WorkLogRelationshipTask)(obj));
			this.workLogId = o.workLogId;
			this.taskId = o.taskId;
		}
	}
	
	/**
	 * 插入WorkLogRelationshipTask对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="workLogRelationshipTask">需要插入的工作日志——关系——任务表</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, WorkLogRelationshipTask workLogRelationshipTask) throws SQLException, DbException {
		String sql = "insert into [T_WORK_LOG_RELATIONSHIP_TASK](";
		sql = (sql + "[WORK_LOG_ID]");
		sql = (sql + ", [TASK_ID]");
		sql = (sql + ")values(");
		sql = (sql + workLogRelationshipTask.getWorkLogId());
		sql = (sql + ", ");
		sql = (sql + workLogRelationshipTask.getTaskId());
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入WorkLogRelationshipTask对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		WorkLogRelationshipTask.insert(dataVisit, this);
	}
	
	/**
	 * 更新WorkLogRelationshipTask对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="workLogRelationshipTask">需要更新的工作日志——关系——任务表</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, WorkLogRelationshipTask workLogRelationshipTask, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_WORK_LOG_RELATIONSHIP_TASK] set ";
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "WORK_LOG_ID = ");
		sql = (sql + workLogRelationshipTask.getWorkLogId());
		sql = (sql + " and ");
		sql = (sql + "TASK_ID = ");
		sql = (sql + workLogRelationshipTask.getTaskId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新WorkLogRelationshipTask对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="workLogRelationshipTask">需要更新的工作日志——关系——任务表</param>
	 */
	protected static int update(IDataVisit2 dataVisit, WorkLogRelationshipTask workLogRelationshipTask) throws SQLException, DbException {
		return WorkLogRelationshipTask.update(dataVisit, workLogRelationshipTask, "");
	}
	
	/**
	 * 更新WorkLogRelationshipTask对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return WorkLogRelationshipTask.update(dataVisit, this);
	}
	
	/**
	 * 更新WorkLogRelationshipTask对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return WorkLogRelationshipTask.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<WorkLogRelationshipTask> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<WorkLogRelationshipTask> list = new ArrayList<WorkLogRelationshipTask>();
		try {
			for (; reader.next(); ) {
				WorkLogRelationshipTask obj = new WorkLogRelationshipTask();
				WorkLogRelationshipTask.readValue(reader, obj);
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
	public static List<WorkLogRelationshipTask> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<WorkLogRelationshipTask> list = new ArrayList<WorkLogRelationshipTask>();
		try {
			for (; reader.next(); ) {
				WorkLogRelationshipTask obj = new WorkLogRelationshipTask();
				WorkLogRelationshipTask.readValue(reader, obj);
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
	public static List<WorkLogRelationshipTask> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((WorkLogRelationshipTask.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<WorkLogRelationshipTask> list = new ArrayList<WorkLogRelationshipTask>();
		try {
			for (; reader.next(); ) {
				WorkLogRelationshipTask obj = new WorkLogRelationshipTask();
				WorkLogRelationshipTask.readValue(reader, obj);
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
	public static List<WorkLogRelationshipTask> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((WorkLogRelationshipTask.getFullSelectSql() + appendConditionSql));
		List<WorkLogRelationshipTask> list = new ArrayList<WorkLogRelationshipTask>();
		try {
			for (; reader.next(); ) {
				WorkLogRelationshipTask obj = new WorkLogRelationshipTask();
				WorkLogRelationshipTask.readValue(reader, obj);
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
	public static <T extends WorkLogRelationshipTask> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((WorkLogRelationshipTask.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			WorkLogRelationshipTask.readValue(reader, obj);
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
public static <T extends WorkLogRelationshipTask> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((WorkLogRelationshipTask.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			WorkLogRelationshipTask.readValue(reader, obj);
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
	String sql = "select * from T_WORK_LOG_RELATIONSHIP_TASK ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据工作日志代号,任务代号查询WorkLogRelationshipTask
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AWorkLogId">工作日志代号</param>
 * <param name="ATaskId">任务代号</param>
 */
public static WorkLogRelationshipTask selectByWorkLogIdTaskId(IDataVisit2 dataVisit, int AWorkLogId, int ATaskId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "WORK_LOG_ID = ");
	sql = (sql + AWorkLogId);
	sql = (sql + " and ");
	sql = (sql + "TASK_ID = ");
	sql = (sql + ATaskId);
	List<WorkLogRelationshipTask> list = WorkLogRelationshipTask.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个WorkLogRelationshipTask对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AWorkLogId">工作日志代号</param>
 * <param name="ATaskId">任务代号</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByWorkLogIdTaskId(IDataVisit2 dataVisit, int AWorkLogId, int ATaskId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_WORK_LOG_RELATIONSHIP_TASK] where ");
	sql = (sql + "WORK_LOG_ID = ");
	sql = (sql + AWorkLogId);
	sql = (sql + " and ");
	sql = (sql + "TASK_ID = ");
	sql = (sql + ATaskId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个WorkLogRelationshipTask对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AWorkLogId">工作日志代号</param>
 * <param name="ATaskId">任务代号</param>
 */
public static void deleteByWorkLogIdTaskId(IDataVisit2 dataVisit, int AWorkLogId, int ATaskId) throws SQLException, DbException {
	WorkLogRelationshipTask.deleteByWorkLogIdTaskId(dataVisit, AWorkLogId, ATaskId, "");
}

/**
 * 根据外键任务代号删除一批WorkLogRelationshipTask对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskId">任务代号</param>
 */
public static void deleteListByTaskId(IDataVisit2 dataVisit, int ATaskId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_WORK_LOG_RELATIONSHIP_TASK] where ");
	sql = (sql + "TASK_ID = ");
	sql = (sql + ATaskId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键工作日志代号删除一批WorkLogRelationshipTask对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="WorkLogId">工作日志代号</param>
 */
public static void deleteListByWorkLogId(IDataVisit2 dataVisit, int AWorkLogId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_WORK_LOG_RELATIONSHIP_TASK] where ");
	sql = (sql + "WORK_LOG_ID = ");
	sql = (sql + AWorkLogId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskId">任务代号</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<WorkLogRelationshipTask> selectObjectsByTaskId(IDataVisit2 dataVisit, int ATaskId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TASK_ID = ";
	sql = (sql + ATaskId);
	sql = (sql + appendConditionSql);
	return WorkLogRelationshipTask.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskId">任务代号</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<WorkLogRelationshipTask> selectObjectsByTaskId(IDataVisit2 dataVisit, int ATaskId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TASK_ID = ";
	sql = (sql + ATaskId);
	return WorkLogRelationshipTask.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskId">任务代号</param>
 */
public static List<WorkLogRelationshipTask> selectObjectsByTaskId(IDataVisit2 dataVisit, int ATaskId) throws SQLException, DbException {
	String sql = " where TASK_ID = ";
	sql = (sql + ATaskId);
	return WorkLogRelationshipTask.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="WorkLogId">工作日志代号</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<WorkLogRelationshipTask> selectObjectsByWorkLogId(IDataVisit2 dataVisit, int AWorkLogId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where WORK_LOG_ID = ";
	sql = (sql + AWorkLogId);
	sql = (sql + appendConditionSql);
	return WorkLogRelationshipTask.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="WorkLogId">工作日志代号</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<WorkLogRelationshipTask> selectObjectsByWorkLogId(IDataVisit2 dataVisit, int AWorkLogId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where WORK_LOG_ID = ";
	sql = (sql + AWorkLogId);
	return WorkLogRelationshipTask.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="WorkLogId">工作日志代号</param>
 */
public static List<WorkLogRelationshipTask> selectObjectsByWorkLogId(IDataVisit2 dataVisit, int AWorkLogId) throws SQLException, DbException {
	String sql = " where WORK_LOG_ID = ";
	sql = (sql + AWorkLogId);
	return WorkLogRelationshipTask.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象workLogRelationshipTask中
 * <param name="reader">数据源</param>
 * <param name="workLogRelationshipTask">目标对象</param>
 */
public static void readValue(ResultSet reader, WorkLogRelationshipTask workLogRelationshipTask) throws SQLException, DbException {
	workLogRelationshipTask.workLogId = reader.getInt(1);
	workLogRelationshipTask.taskId = reader.getInt(2);
}
}
