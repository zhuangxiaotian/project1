package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_DEPART_MENT_USER: 
 */
public class DepartMentUser extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * DEPART_MENT_ID: 部门ID
	 */
	int departMentId;
	
	/**
	 * USER_ID: 用户代号
	 */
	int userId;
	
	/**
	 * DEPART_MENT_ID: 部门ID
	 */
	public int getDepartMentId() {
		return this.departMentId;
	}
	
	/**
	 * DEPART_MENT_ID: 部门ID
	 */
	public void setDepartMentId(int value)
	 {
		this.departMentId = value;
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
		return "select  [T_DEPART_MENT_USER].[DEPART_MENT_ID], [T_DEPART_MENT_USER].[USER_ID]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_DEPART_MENT_USER].[DEPART_MENT_ID], [T_DEPART_MENT_USER].[USER_ID]   f" +
"rom [T_DEPART_MENT_USER] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_DEPART_MENT_USER].[DEPART_MENT_ID], [T_DEPART_MENT_USER].[USER_ID] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_DEPART_MENT_USER";
	}
	
	
	public String getTableName() {
		return "T_DEPART_MENT_USER";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "DEPART_MENT_ID,USER_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.departMentId);
		kvalue = (kvalue + ",");
		kvalue = (kvalue + this.userId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (DepartMentUser.class.isInstance(obj)) {
			DepartMentUser o = ((DepartMentUser)(obj));
			this.departMentId = o.departMentId;
			this.userId = o.userId;
		}
	}
	
	/**
	 * 插入DepartMentUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="departMentUser">需要插入的</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, DepartMentUser departMentUser) throws SQLException, DbException {
		String sql = "insert into [T_DEPART_MENT_USER](";
		sql = (sql + "[DEPART_MENT_ID]");
		sql = (sql + ", [USER_ID]");
		sql = (sql + ")values(");
		sql = (sql + departMentUser.getDepartMentId());
		sql = (sql + ", ");
		sql = (sql + departMentUser.getUserId());
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入DepartMentUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		DepartMentUser.insert(dataVisit, this);
	}
	
	/**
	 * 更新DepartMentUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="departMentUser">需要更新的</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, DepartMentUser departMentUser, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_DEPART_MENT_USER] set ";
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "DEPART_MENT_ID = ");
		sql = (sql + departMentUser.getDepartMentId());
		sql = (sql + " and ");
		sql = (sql + "USER_ID = ");
		sql = (sql + departMentUser.getUserId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新DepartMentUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="departMentUser">需要更新的</param>
	 */
	protected static int update(IDataVisit2 dataVisit, DepartMentUser departMentUser) throws SQLException, DbException {
		return DepartMentUser.update(dataVisit, departMentUser, "");
	}
	
	/**
	 * 更新DepartMentUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return DepartMentUser.update(dataVisit, this);
	}
	
	/**
	 * 更新DepartMentUser对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return DepartMentUser.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<DepartMentUser> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<DepartMentUser> list = new ArrayList<DepartMentUser>();
		try {
			for (; reader.next(); ) {
				DepartMentUser obj = new DepartMentUser();
				DepartMentUser.readValue(reader, obj);
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
	public static List<DepartMentUser> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<DepartMentUser> list = new ArrayList<DepartMentUser>();
		try {
			for (; reader.next(); ) {
				DepartMentUser obj = new DepartMentUser();
				DepartMentUser.readValue(reader, obj);
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
	public static List<DepartMentUser> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((DepartMentUser.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<DepartMentUser> list = new ArrayList<DepartMentUser>();
		try {
			for (; reader.next(); ) {
				DepartMentUser obj = new DepartMentUser();
				DepartMentUser.readValue(reader, obj);
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
	public static List<DepartMentUser> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((DepartMentUser.getFullSelectSql() + appendConditionSql));
		List<DepartMentUser> list = new ArrayList<DepartMentUser>();
		try {
			for (; reader.next(); ) {
				DepartMentUser obj = new DepartMentUser();
				DepartMentUser.readValue(reader, obj);
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
	public static <T extends DepartMentUser> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((DepartMentUser.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			DepartMentUser.readValue(reader, obj);
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
public static <T extends DepartMentUser> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((DepartMentUser.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			DepartMentUser.readValue(reader, obj);
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
	String sql = "select * from T_DEPART_MENT_USER ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据部门ID,用户代号查询DepartMentUser
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADepartMentId">部门ID</param>
 * <param name="AUserId">用户代号</param>
 */
public static DepartMentUser selectByDepartMentIdUserId(IDataVisit2 dataVisit, int ADepartMentId, int AUserId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "DEPART_MENT_ID = ");
	sql = (sql + ADepartMentId);
	sql = (sql + " and ");
	sql = (sql + "USER_ID = ");
	sql = (sql + AUserId);
	List<DepartMentUser> list = DepartMentUser.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个DepartMentUser对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADepartMentId">部门ID</param>
 * <param name="AUserId">用户代号</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByDepartMentIdUserId(IDataVisit2 dataVisit, int ADepartMentId, int AUserId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_DEPART_MENT_USER] where ");
	sql = (sql + "DEPART_MENT_ID = ");
	sql = (sql + ADepartMentId);
	sql = (sql + " and ");
	sql = (sql + "USER_ID = ");
	sql = (sql + AUserId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个DepartMentUser对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADepartMentId">部门ID</param>
 * <param name="AUserId">用户代号</param>
 */
public static void deleteByDepartMentIdUserId(IDataVisit2 dataVisit, int ADepartMentId, int AUserId) throws SQLException, DbException {
	DepartMentUser.deleteByDepartMentIdUserId(dataVisit, ADepartMentId, AUserId, "");
}

/**
 * 根据外键部门ID删除一批DepartMentUser对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="DepartMentId">部门ID</param>
 */
public static void deleteListByDepartMentId(IDataVisit2 dataVisit, int ADepartMentId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_DEPART_MENT_USER] where ");
	sql = (sql + "DEPART_MENT_ID = ");
	sql = (sql + ADepartMentId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键用户代号删除一批DepartMentUser对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="UserId">用户代号</param>
 */
public static void deleteListByUserId(IDataVisit2 dataVisit, int AUserId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_DEPART_MENT_USER] where ");
	sql = (sql + "USER_ID = ");
	sql = (sql + AUserId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="DepartMentId">部门ID</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<DepartMentUser> selectObjectsByDepartMentId(IDataVisit2 dataVisit, int ADepartMentId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where DEPART_MENT_ID = ";
	sql = (sql + ADepartMentId);
	sql = (sql + appendConditionSql);
	return DepartMentUser.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="DepartMentId">部门ID</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<DepartMentUser> selectObjectsByDepartMentId(IDataVisit2 dataVisit, int ADepartMentId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where DEPART_MENT_ID = ";
	sql = (sql + ADepartMentId);
	return DepartMentUser.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="DepartMentId">部门ID</param>
 */
public static List<DepartMentUser> selectObjectsByDepartMentId(IDataVisit2 dataVisit, int ADepartMentId) throws SQLException, DbException {
	String sql = " where DEPART_MENT_ID = ";
	sql = (sql + ADepartMentId);
	return DepartMentUser.selectObjects(dataVisit, sql);
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
public static List<DepartMentUser> selectObjectsByUserId(IDataVisit2 dataVisit, int AUserId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where USER_ID = ";
	sql = (sql + AUserId);
	sql = (sql + appendConditionSql);
	return DepartMentUser.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
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
public static List<DepartMentUser> selectObjectsByUserId(IDataVisit2 dataVisit, int AUserId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where USER_ID = ";
	sql = (sql + AUserId);
	return DepartMentUser.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="UserId">用户代号</param>
 */
public static List<DepartMentUser> selectObjectsByUserId(IDataVisit2 dataVisit, int AUserId) throws SQLException, DbException {
	String sql = " where USER_ID = ";
	sql = (sql + AUserId);
	return DepartMentUser.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象departMentUser中
 * <param name="reader">数据源</param>
 * <param name="departMentUser">目标对象</param>
 */
public static void readValue(ResultSet reader, DepartMentUser departMentUser) throws SQLException, DbException {
	departMentUser.departMentId = reader.getInt(1);
	departMentUser.userId = reader.getInt(2);
}
}
