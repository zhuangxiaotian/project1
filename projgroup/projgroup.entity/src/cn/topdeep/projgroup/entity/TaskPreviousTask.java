package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_TASK_PREVIOUS_TASK: 任务——前驱任务表
 */
public class TaskPreviousTask extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * TASK_ID: 任务代号
	 */
	int taskId;
	
	/**
	 * PREVIOUS_TASK_ID: 前驱任务代号
	 */
	int previousTaskId;
	
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
	
	/**
	 * PREVIOUS_TASK_ID: 前驱任务代号
	 */
	public int getPreviousTaskId() {
		return this.previousTaskId;
	}
	
	/**
	 * PREVIOUS_TASK_ID: 前驱任务代号
	 */
	public void setPreviousTaskId(int value)
	 {
		this.previousTaskId = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_TASK_PREVIOUS_TASK].[TASK_ID], [T_TASK_PREVIOUS_TASK].[PREVIOUS_TASK_I" +
"D]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_TASK_PREVIOUS_TASK].[TASK_ID], [T_TASK_PREVIOUS_TASK].[PREVIOUS_TASK_I" +
"D]   from [T_TASK_PREVIOUS_TASK] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_TASK_PREVIOUS_TASK].[TASK_ID], [T_TASK_PREVIOUS_TASK].[PREVIOUS_TASK_ID] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_TASK_PREVIOUS_TASK";
	}
	
	
	public String getTableName() {
		return "T_TASK_PREVIOUS_TASK";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "TASK_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.taskId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (TaskPreviousTask.class.isInstance(obj)) {
			TaskPreviousTask o = ((TaskPreviousTask)(obj));
			this.taskId = o.taskId;
			this.previousTaskId = o.previousTaskId;
		}
	}
	
	/**
	 * 插入TaskPreviousTask对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="taskPreviousTask">需要插入的任务——前驱任务表</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, TaskPreviousTask taskPreviousTask) throws SQLException, DbException {
		String sql = "insert into [T_TASK_PREVIOUS_TASK](";
		sql = (sql + "[TASK_ID]");
		sql = (sql + ", [PREVIOUS_TASK_ID]");
		sql = (sql + ")values(");
		sql = (sql + taskPreviousTask.getTaskId());
		sql = (sql + ", ");
		sql = (sql + taskPreviousTask.getPreviousTaskId());
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入TaskPreviousTask对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		TaskPreviousTask.insert(dataVisit, this);
	}
	
	/**
	 * 更新TaskPreviousTask对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="taskPreviousTask">需要更新的任务——前驱任务表</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, TaskPreviousTask taskPreviousTask, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_TASK_PREVIOUS_TASK] set ";
		sql = (sql + "[PREVIOUS_TASK_ID] = ");
		sql = (sql + taskPreviousTask.getPreviousTaskId());
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "TASK_ID = ");
		sql = (sql + taskPreviousTask.getTaskId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新TaskPreviousTask对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="taskPreviousTask">需要更新的任务——前驱任务表</param>
	 */
	protected static int update(IDataVisit2 dataVisit, TaskPreviousTask taskPreviousTask) throws SQLException, DbException {
		return TaskPreviousTask.update(dataVisit, taskPreviousTask, "");
	}
	
	/**
	 * 更新TaskPreviousTask对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return TaskPreviousTask.update(dataVisit, this);
	}
	
	/**
	 * 更新TaskPreviousTask对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return TaskPreviousTask.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<TaskPreviousTask> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<TaskPreviousTask> list = new ArrayList<TaskPreviousTask>();
		try {
			for (; reader.next(); ) {
				TaskPreviousTask obj = new TaskPreviousTask();
				TaskPreviousTask.readValue(reader, obj);
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
	public static List<TaskPreviousTask> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<TaskPreviousTask> list = new ArrayList<TaskPreviousTask>();
		try {
			for (; reader.next(); ) {
				TaskPreviousTask obj = new TaskPreviousTask();
				TaskPreviousTask.readValue(reader, obj);
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
	public static List<TaskPreviousTask> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((TaskPreviousTask.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<TaskPreviousTask> list = new ArrayList<TaskPreviousTask>();
		try {
			for (; reader.next(); ) {
				TaskPreviousTask obj = new TaskPreviousTask();
				TaskPreviousTask.readValue(reader, obj);
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
	public static List<TaskPreviousTask> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((TaskPreviousTask.getFullSelectSql() + appendConditionSql));
		List<TaskPreviousTask> list = new ArrayList<TaskPreviousTask>();
		try {
			for (; reader.next(); ) {
				TaskPreviousTask obj = new TaskPreviousTask();
				TaskPreviousTask.readValue(reader, obj);
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
	public static <T extends TaskPreviousTask> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((TaskPreviousTask.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			TaskPreviousTask.readValue(reader, obj);
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
public static <T extends TaskPreviousTask> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((TaskPreviousTask.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			TaskPreviousTask.readValue(reader, obj);
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
	String sql = "select * from T_TASK_PREVIOUS_TASK ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据任务代号查询TaskPreviousTask
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATaskId">任务代号</param>
 */
public static TaskPreviousTask selectByTaskId(IDataVisit2 dataVisit, int ATaskId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "TASK_ID = ");
	sql = (sql + ATaskId);
	List<TaskPreviousTask> list = TaskPreviousTask.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个TaskPreviousTask对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATaskId">任务代号</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByTaskId(IDataVisit2 dataVisit, int ATaskId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_TASK_PREVIOUS_TASK] where ");
	sql = (sql + "TASK_ID = ");
	sql = (sql + ATaskId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个TaskPreviousTask对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATaskId">任务代号</param>
 */
public static void deleteByTaskId(IDataVisit2 dataVisit, int ATaskId) throws SQLException, DbException {
	TaskPreviousTask.deleteByTaskId(dataVisit, ATaskId, "");
}

/**
 * 根据外键前驱任务代号删除一批TaskPreviousTask对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PreviousTaskId">前驱任务代号</param>
 */
public static void deleteListByPreviousTaskId(IDataVisit2 dataVisit, int APreviousTaskId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_TASK_PREVIOUS_TASK] where ");
	sql = (sql + "PREVIOUS_TASK_ID = ");
	sql = (sql + APreviousTaskId);
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
public static List<TaskPreviousTask> selectObjectsByTaskId(IDataVisit2 dataVisit, int ATaskId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TASK_ID = ";
	sql = (sql + ATaskId);
	sql = (sql + appendConditionSql);
	return TaskPreviousTask.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
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
public static List<TaskPreviousTask> selectObjectsByTaskId(IDataVisit2 dataVisit, int ATaskId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TASK_ID = ";
	sql = (sql + ATaskId);
	return TaskPreviousTask.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskId">任务代号</param>
 */
public static List<TaskPreviousTask> selectObjectsByTaskId(IDataVisit2 dataVisit, int ATaskId) throws SQLException, DbException {
	String sql = " where TASK_ID = ";
	sql = (sql + ATaskId);
	return TaskPreviousTask.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PreviousTaskId">前驱任务代号</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<TaskPreviousTask> selectObjectsByPreviousTaskId(IDataVisit2 dataVisit, int APreviousTaskId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PREVIOUS_TASK_ID = ";
	sql = (sql + APreviousTaskId);
	sql = (sql + appendConditionSql);
	return TaskPreviousTask.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PreviousTaskId">前驱任务代号</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<TaskPreviousTask> selectObjectsByPreviousTaskId(IDataVisit2 dataVisit, int APreviousTaskId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PREVIOUS_TASK_ID = ";
	sql = (sql + APreviousTaskId);
	return TaskPreviousTask.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PreviousTaskId">前驱任务代号</param>
 */
public static List<TaskPreviousTask> selectObjectsByPreviousTaskId(IDataVisit2 dataVisit, int APreviousTaskId) throws SQLException, DbException {
	String sql = " where PREVIOUS_TASK_ID = ";
	sql = (sql + APreviousTaskId);
	return TaskPreviousTask.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象taskPreviousTask中
 * <param name="reader">数据源</param>
 * <param name="taskPreviousTask">目标对象</param>
 */
public static void readValue(ResultSet reader, TaskPreviousTask taskPreviousTask) throws SQLException, DbException {
	taskPreviousTask.taskId = reader.getInt(1);
	taskPreviousTask.previousTaskId = reader.getInt(2);
}
}
