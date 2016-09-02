package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_STATE_CHANGE_DEFINE: 问题状态变化定义
 */
public class IssueStateChangeDefine extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * CURRENT_STATUS_ID: 当前状态标识
	 */
	int currentStatusId;
	
	/**
	 * NEXT_STATUS_ID: 下一个状态标识
	 */
	int nextStatusId;
	
	/**
	 * ROLE_LIST: 允许进行状态变化的角色列表，用逗号分隔
	 */
	String roleList;
	
	/**
	 * CURRENT_STATUS_ID: 当前状态标识
	 */
	public int getCurrentStatusId() {
		return this.currentStatusId;
	}
	
	/**
	 * CURRENT_STATUS_ID: 当前状态标识
	 */
	public void setCurrentStatusId(int value)
	 {
		this.currentStatusId = value;
	}
	
	/**
	 * NEXT_STATUS_ID: 下一个状态标识
	 */
	public int getNextStatusId() {
		return this.nextStatusId;
	}
	
	/**
	 * NEXT_STATUS_ID: 下一个状态标识
	 */
	public void setNextStatusId(int value)
	 {
		this.nextStatusId = value;
	}
	
	/**
	 * ROLE_LIST: 允许进行状态变化的角色列表，用逗号分隔
	 */
	public String getRoleList() {
		return this.roleList;
	}
	
	/**
	 * ROLE_LIST: 允许进行状态变化的角色列表，用逗号分隔
	 */
	public void setRoleList(String value)
	 {
		this.roleList = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_ISSUE_STATE_CHANGE_DEFINE].[CURRENT_STATUS_ID], [T_ISSUE_STATE_CHANGE_" +
"DEFINE].[NEXT_STATUS_ID], [T_ISSUE_STATE_CHANGE_DEFINE].[ROLE_LIST]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_ISSUE_STATE_CHANGE_DEFINE].[CURRENT_STATUS_ID], [T_ISSUE_STATE_CHANGE_" +
"DEFINE].[NEXT_STATUS_ID], [T_ISSUE_STATE_CHANGE_DEFINE].[ROLE_LIST]   from [T_IS" +
"SUE_STATE_CHANGE_DEFINE] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_ISSUE_STATE_CHANGE_DEFINE].[CURRENT_STATUS_ID], [T_ISSUE_STATE_CHANGE_DEFINE]" +
".[NEXT_STATUS_ID], [T_ISSUE_STATE_CHANGE_DEFINE].[ROLE_LIST] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_ISSUE_STATE_CHANGE_DEFINE";
	}
	
	
	public String getTableName() {
		return "T_ISSUE_STATE_CHANGE_DEFINE";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "CURRENT_STATUS_ID,NEXT_STATUS_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.currentStatusId);
		kvalue = (kvalue + ",");
		kvalue = (kvalue + this.nextStatusId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (IssueStateChangeDefine.class.isInstance(obj)) {
			IssueStateChangeDefine o = ((IssueStateChangeDefine)(obj));
			this.currentStatusId = o.currentStatusId;
			this.nextStatusId = o.nextStatusId;
			this.roleList = o.roleList;
		}
	}
	
	/**
	 * 插入IssueStateChangeDefine对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueStateChangeDefine">需要插入的问题状态变化定义</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, IssueStateChangeDefine issueStateChangeDefine) throws SQLException, DbException {
		String sql = "insert into [T_ISSUE_STATE_CHANGE_DEFINE](";
		sql = (sql + "[CURRENT_STATUS_ID]");
		sql = (sql + ", [NEXT_STATUS_ID]");
		sql = (sql + ", [ROLE_LIST]");
		sql = (sql + ")values(");
		sql = (sql + issueStateChangeDefine.getCurrentStatusId());
		sql = (sql + ", ");
		sql = (sql + issueStateChangeDefine.getNextStatusId());
		sql = (sql + ", ");
		if ((issueStateChangeDefine.roleList == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(issueStateChangeDefine.getRoleList().toString()));
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入IssueStateChangeDefine对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		IssueStateChangeDefine.insert(dataVisit, this);
	}
	
	/**
	 * 更新IssueStateChangeDefine对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueStateChangeDefine">需要更新的问题状态变化定义</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssueStateChangeDefine issueStateChangeDefine, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_ISSUE_STATE_CHANGE_DEFINE] set ";
		if ((issueStateChangeDefine.roleList == null)) {
			sql = (sql + "[ROLE_LIST] = default ,");
		}
		else {
			sql = (sql + "[ROLE_LIST] = ");
			sql = (sql + SqlServerUtils.safeSql(issueStateChangeDefine.getRoleList().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "CURRENT_STATUS_ID = ");
		sql = (sql + issueStateChangeDefine.getCurrentStatusId());
		sql = (sql + " and ");
		sql = (sql + "NEXT_STATUS_ID = ");
		sql = (sql + issueStateChangeDefine.getNextStatusId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新IssueStateChangeDefine对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="issueStateChangeDefine">需要更新的问题状态变化定义</param>
	 */
	protected static int update(IDataVisit2 dataVisit, IssueStateChangeDefine issueStateChangeDefine) throws SQLException, DbException {
		return IssueStateChangeDefine.update(dataVisit, issueStateChangeDefine, "");
	}
	
	/**
	 * 更新IssueStateChangeDefine对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return IssueStateChangeDefine.update(dataVisit, this);
	}
	
	/**
	 * 更新IssueStateChangeDefine对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return IssueStateChangeDefine.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<IssueStateChangeDefine> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<IssueStateChangeDefine> list = new ArrayList<IssueStateChangeDefine>();
		try {
			for (; reader.next(); ) {
				IssueStateChangeDefine obj = new IssueStateChangeDefine();
				IssueStateChangeDefine.readValue(reader, obj);
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
	public static List<IssueStateChangeDefine> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<IssueStateChangeDefine> list = new ArrayList<IssueStateChangeDefine>();
		try {
			for (; reader.next(); ) {
				IssueStateChangeDefine obj = new IssueStateChangeDefine();
				IssueStateChangeDefine.readValue(reader, obj);
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
	public static List<IssueStateChangeDefine> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssueStateChangeDefine.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<IssueStateChangeDefine> list = new ArrayList<IssueStateChangeDefine>();
		try {
			for (; reader.next(); ) {
				IssueStateChangeDefine obj = new IssueStateChangeDefine();
				IssueStateChangeDefine.readValue(reader, obj);
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
	public static List<IssueStateChangeDefine> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((IssueStateChangeDefine.getFullSelectSql() + appendConditionSql));
		List<IssueStateChangeDefine> list = new ArrayList<IssueStateChangeDefine>();
		try {
			for (; reader.next(); ) {
				IssueStateChangeDefine obj = new IssueStateChangeDefine();
				IssueStateChangeDefine.readValue(reader, obj);
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
	public static <T extends IssueStateChangeDefine> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssueStateChangeDefine.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssueStateChangeDefine.readValue(reader, obj);
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
public static <T extends IssueStateChangeDefine> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((IssueStateChangeDefine.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			IssueStateChangeDefine.readValue(reader, obj);
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
	String sql = "select * from T_ISSUE_STATE_CHANGE_DEFINE ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据当前状态标识,下一个状态标识查询IssueStateChangeDefine
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ACurrentStatusId">当前状态标识</param>
 * <param name="ANextStatusId">下一个状态标识</param>
 */
public static IssueStateChangeDefine selectByCurrentStatusIdNextStatusId(IDataVisit2 dataVisit, int ACurrentStatusId, int ANextStatusId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "CURRENT_STATUS_ID = ");
	sql = (sql + ACurrentStatusId);
	sql = (sql + " and ");
	sql = (sql + "NEXT_STATUS_ID = ");
	sql = (sql + ANextStatusId);
	List<IssueStateChangeDefine> list = IssueStateChangeDefine.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个IssueStateChangeDefine对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ACurrentStatusId">当前状态标识</param>
 * <param name="ANextStatusId">下一个状态标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByCurrentStatusIdNextStatusId(IDataVisit2 dataVisit, int ACurrentStatusId, int ANextStatusId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_ISSUE_STATE_CHANGE_DEFINE] where ");
	sql = (sql + "CURRENT_STATUS_ID = ");
	sql = (sql + ACurrentStatusId);
	sql = (sql + " and ");
	sql = (sql + "NEXT_STATUS_ID = ");
	sql = (sql + ANextStatusId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个IssueStateChangeDefine对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ACurrentStatusId">当前状态标识</param>
 * <param name="ANextStatusId">下一个状态标识</param>
 */
public static void deleteByCurrentStatusIdNextStatusId(IDataVisit2 dataVisit, int ACurrentStatusId, int ANextStatusId) throws SQLException, DbException {
	IssueStateChangeDefine.deleteByCurrentStatusIdNextStatusId(dataVisit, ACurrentStatusId, ANextStatusId, "");
}

/**
 * 根据外键当前状态标识删除一批IssueStateChangeDefine对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="CurrentStatusId">当前状态标识</param>
 */
public static void deleteListByCurrentStatusId(IDataVisit2 dataVisit, int ACurrentStatusId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE_STATE_CHANGE_DEFINE] where ");
	sql = (sql + "CURRENT_STATUS_ID = ");
	sql = (sql + ACurrentStatusId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键下一个状态标识删除一批IssueStateChangeDefine对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="NextStatusId">下一个状态标识</param>
 */
public static void deleteListByNextStatusId(IDataVisit2 dataVisit, int ANextStatusId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_ISSUE_STATE_CHANGE_DEFINE] where ");
	sql = (sql + "NEXT_STATUS_ID = ");
	sql = (sql + ANextStatusId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="CurrentStatusId">当前状态标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueStateChangeDefine> selectObjectsByCurrentStatusId(IDataVisit2 dataVisit, int ACurrentStatusId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where CURRENT_STATUS_ID = ";
	sql = (sql + ACurrentStatusId);
	sql = (sql + appendConditionSql);
	return IssueStateChangeDefine.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="CurrentStatusId">当前状态标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueStateChangeDefine> selectObjectsByCurrentStatusId(IDataVisit2 dataVisit, int ACurrentStatusId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where CURRENT_STATUS_ID = ";
	sql = (sql + ACurrentStatusId);
	return IssueStateChangeDefine.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="CurrentStatusId">当前状态标识</param>
 */
public static List<IssueStateChangeDefine> selectObjectsByCurrentStatusId(IDataVisit2 dataVisit, int ACurrentStatusId) throws SQLException, DbException {
	String sql = " where CURRENT_STATUS_ID = ";
	sql = (sql + ACurrentStatusId);
	return IssueStateChangeDefine.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="NextStatusId">下一个状态标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueStateChangeDefine> selectObjectsByNextStatusId(IDataVisit2 dataVisit, int ANextStatusId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where NEXT_STATUS_ID = ";
	sql = (sql + ANextStatusId);
	sql = (sql + appendConditionSql);
	return IssueStateChangeDefine.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="NextStatusId">下一个状态标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<IssueStateChangeDefine> selectObjectsByNextStatusId(IDataVisit2 dataVisit, int ANextStatusId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where NEXT_STATUS_ID = ";
	sql = (sql + ANextStatusId);
	return IssueStateChangeDefine.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="NextStatusId">下一个状态标识</param>
 */
public static List<IssueStateChangeDefine> selectObjectsByNextStatusId(IDataVisit2 dataVisit, int ANextStatusId) throws SQLException, DbException {
	String sql = " where NEXT_STATUS_ID = ";
	sql = (sql + ANextStatusId);
	return IssueStateChangeDefine.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象issueStateChangeDefine中
 * <param name="reader">数据源</param>
 * <param name="issueStateChangeDefine">目标对象</param>
 */
public static void readValue(ResultSet reader, IssueStateChangeDefine issueStateChangeDefine) throws SQLException, DbException {
	issueStateChangeDefine.currentStatusId = reader.getInt(1);
	issueStateChangeDefine.nextStatusId = reader.getInt(2);
	issueStateChangeDefine.roleList = reader.getString(3);
	if (reader.wasNull()) {
		issueStateChangeDefine.roleList = null;
	}
}
}
