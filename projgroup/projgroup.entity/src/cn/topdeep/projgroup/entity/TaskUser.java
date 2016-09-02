package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_TASK_USER: 任务人力分配表
 */
public class TaskUser extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * TASK_USER_ID: 任务用户ID
	 */
	int taskUserId;
	
	/**
	 * TASK_ID: 任务代号
	 */
	int taskId;
	
	/**
	 * USER_ID: 用户代号
	 */
	int userId;
	
	/**
	 * TASK_USER_ID: 任务用户ID
	 */
	public int getTaskUserId() {
		return this.taskUserId;
	}
	
	/**
	 * TASK_USER_ID: 任务用户ID
	 */
	public void setTaskUserId(int value)
	 {
		this.taskUserId = value;
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
	
	/**
	 * USER_ID: 用户代号
	 */
	public int getUserId() {
		return this.userId;
	}
	
	/**
	 * USER_ID: 用户代号
	 */
	public void setUserId(int value)
	 {
		this.userId = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_TASK_USER].[TASK_USER_ID], [T_TASK_USER].[TASK_ID], [T_TASK_USER].[USE" +
"R_ID]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_TASK_USER].[TASK_USER_ID], [T_TASK_USER].[TASK_ID], [T_TASK_USER].[USE" +
"R_ID]   from [T_TASK_USER] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_TASK_USER].[TASK_USER_ID], [T_TASK_USER].[TASK_ID], [T_TASK_USER].[USER_ID] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_TASK_USER";
	}
	
	
	public String getTableName() {
		return "T_TASK_USER";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "TASK_USER_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.taskUserId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (TaskUser.class.isInstance(obj)) {
			TaskUser o = ((TaskUser)(obj));
			this.taskUserId = o.taskUserId;
			this.taskId = o.taskId;
			this.userId = o.userId;
		}
	}
	
	/**
	 * 插入TaskUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="taskUser">需要插入的任务人力分配表</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, TaskUser taskUser) throws SQLException, DbException {
		String sql = "insert into [T_TASK_USER](";
		if ((taskUser.getTaskUserId() > 0)) {
			sql = (sql + "[TASK_USER_ID], ");
		}
		sql = (sql + "[TASK_ID]");
		sql = (sql + ", [USER_ID]");
		sql = (sql + ")values(");
		if ((taskUser.getTaskUserId() > 0)) {
			sql = (sql + taskUser.getTaskUserId());
			sql = (sql + ", ");
		}
		sql = (sql + taskUser.getTaskId());
		sql = (sql + ", ");
		sql = (sql + taskUser.getUserId());
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((taskUser.getTaskUserId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_TASK_USER] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_TASK_USER off");
			}
			dataVisit.execSql(sql);
			if ((taskUser.getTaskUserId() == 0)) {
				taskUser.taskUserId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入TaskUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		TaskUser.insert(dataVisit, this);
	}
	
	/**
	 * 更新TaskUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="taskUser">需要更新的任务人力分配表</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, TaskUser taskUser, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_TASK_USER] set ";
		sql = (sql + "[TASK_ID] = ");
		sql = (sql + taskUser.getTaskId());
		sql = (sql + ",");
		sql = (sql + "[USER_ID] = ");
		sql = (sql + taskUser.getUserId());
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "TASK_USER_ID = ");
		sql = (sql + taskUser.getTaskUserId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新TaskUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="taskUser">需要更新的任务人力分配表</param>
	 */
	protected static int update(IDataVisit2 dataVisit, TaskUser taskUser) throws SQLException, DbException {
		return TaskUser.update(dataVisit, taskUser, "");
	}
	
	/**
	 * 更新TaskUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return TaskUser.update(dataVisit, this);
	}
	
	/**
	 * 更新TaskUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return TaskUser.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<TaskUser> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<TaskUser> list = new ArrayList<TaskUser>();
		try {
			for (; reader.next(); ) {
				TaskUser obj = new TaskUser();
				TaskUser.readValue(reader, obj);
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
	public static List<TaskUser> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<TaskUser> list = new ArrayList<TaskUser>();
		try {
			for (; reader.next(); ) {
				TaskUser obj = new TaskUser();
				TaskUser.readValue(reader, obj);
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
	public static List<TaskUser> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((TaskUser.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<TaskUser> list = new ArrayList<TaskUser>();
		try {
			for (; reader.next(); ) {
				TaskUser obj = new TaskUser();
				TaskUser.readValue(reader, obj);
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
	public static List<TaskUser> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((TaskUser.getFullSelectSql() + appendConditionSql));
		List<TaskUser> list = new ArrayList<TaskUser>();
		try {
			for (; reader.next(); ) {
				TaskUser obj = new TaskUser();
				TaskUser.readValue(reader, obj);
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
	public static <T extends TaskUser> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((TaskUser.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			TaskUser.readValue(reader, obj);
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
public static <T extends TaskUser> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((TaskUser.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			TaskUser.readValue(reader, obj);
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
	String sql = "select * from T_TASK_USER ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据任务用户ID查询TaskUser
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATaskUserId">任务用户ID</param>
 */
public static TaskUser selectByTaskUserId(IDataVisit2 dataVisit, int ATaskUserId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "TASK_USER_ID = ");
	sql = (sql + ATaskUserId);
	List<TaskUser> list = TaskUser.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个TaskUser对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATaskUserId">任务用户ID</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByTaskUserId(IDataVisit2 dataVisit, int ATaskUserId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_TASK_USER] where ");
	sql = (sql + "TASK_USER_ID = ");
	sql = (sql + ATaskUserId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个TaskUser对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATaskUserId">任务用户ID</param>
 */
public static void deleteByTaskUserId(IDataVisit2 dataVisit, int ATaskUserId) throws SQLException, DbException {
	TaskUser.deleteByTaskUserId(dataVisit, ATaskUserId, "");
}

/**
 * 根据外键任务代号删除一批TaskUser对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskId">任务代号</param>
 */
public static void deleteListByTaskId(IDataVisit2 dataVisit, int ATaskId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_TASK_USER] where ");
	sql = (sql + "TASK_ID = ");
	sql = (sql + ATaskId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键用户代号删除一批TaskUser对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="UserId">用户代号</param>
 */
public static void deleteListByUserId(IDataVisit2 dataVisit, int AUserId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_TASK_USER] where ");
	sql = (sql + "USER_ID = ");
	sql = (sql + AUserId);
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
public static List<TaskUser> selectObjectsByTaskId(IDataVisit2 dataVisit, int ATaskId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TASK_ID = ";
	sql = (sql + ATaskId);
	sql = (sql + appendConditionSql);
	return TaskUser.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
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
public static List<TaskUser> selectObjectsByTaskId(IDataVisit2 dataVisit, int ATaskId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TASK_ID = ";
	sql = (sql + ATaskId);
	return TaskUser.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskId">任务代号</param>
 */
public static List<TaskUser> selectObjectsByTaskId(IDataVisit2 dataVisit, int ATaskId) throws SQLException, DbException {
	String sql = " where TASK_ID = ";
	sql = (sql + ATaskId);
	return TaskUser.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="UserId">用户代号</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<TaskUser> selectObjectsByUserId(IDataVisit2 dataVisit, int AUserId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where USER_ID = ";
	sql = (sql + AUserId);
	sql = (sql + appendConditionSql);
	return TaskUser.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="UserId">用户代号</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<TaskUser> selectObjectsByUserId(IDataVisit2 dataVisit, int AUserId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where USER_ID = ";
	sql = (sql + AUserId);
	return TaskUser.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="UserId">用户代号</param>
 */
public static List<TaskUser> selectObjectsByUserId(IDataVisit2 dataVisit, int AUserId) throws SQLException, DbException {
	String sql = " where USER_ID = ";
	sql = (sql + AUserId);
	return TaskUser.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象taskUser中
 * <param name="reader">数据源</param>
 * <param name="taskUser">目标对象</param>
 */
public static void readValue(ResultSet reader, TaskUser taskUser) throws SQLException, DbException {
	taskUser.taskUserId = reader.getInt(1);
	taskUser.taskId = reader.getInt(2);
	taskUser.userId = reader.getInt(3);
}
}
