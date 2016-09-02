package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_DEPART_MENT: 部门表
 */
public class DepartMent extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * DEPART_MENT_ID: 部门ID
	 */
	int departMentId;
	
	/**
	 * DEPART_MENT_NAME: 部门名称
	 */
	String departMentName = "";
	
	/**
	 * DEPART_MENT_PARENT_ID: 父部门ID
	 */
	Integer departMentParentId;
	
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
	 * DEPART_MENT_NAME: 部门名称
	 */
	public String getDepartMentName() {
		return this.departMentName;
	}
	
	/**
	 * DEPART_MENT_NAME: 部门名称
	 */
	public void setDepartMentName(String value)
	 {
		this.departMentName = value;
	}
	
	/**
	 * DEPART_MENT_PARENT_ID: 父部门ID
	 */
	public Integer getDepartMentParentId() {
		return this.departMentParentId;
	}
	
	/**
	 * DEPART_MENT_PARENT_ID: 父部门ID
	 */
	public void setDepartMentParentId(Integer value)
	 {
		this.departMentParentId = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_DEPART_MENT].[DEPART_MENT_ID], [T_DEPART_MENT].[DEPART_MENT_NAME], [T_" +
"DEPART_MENT].[DEPART_MENT_PARENT_ID]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_DEPART_MENT].[DEPART_MENT_ID], [T_DEPART_MENT].[DEPART_MENT_NAME], [T_" +
"DEPART_MENT].[DEPART_MENT_PARENT_ID]   from [T_DEPART_MENT] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_DEPART_MENT].[DEPART_MENT_ID], [T_DEPART_MENT].[DEPART_MENT_NAME], [T_DEPART_" +
"MENT].[DEPART_MENT_PARENT_ID] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_DEPART_MENT";
	}
	
	
	public String getTableName() {
		return "T_DEPART_MENT";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "DEPART_MENT_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.departMentId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (DepartMent.class.isInstance(obj)) {
			DepartMent o = ((DepartMent)(obj));
			this.departMentId = o.departMentId;
			this.departMentName = o.departMentName;
			this.departMentParentId = o.departMentParentId;
		}
	}
	
	/**
	 * 插入DepartMent对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="departMent">需要插入的部门表</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, DepartMent departMent) throws SQLException, DbException {
		String sql = "insert into [T_DEPART_MENT](";
		if ((departMent.getDepartMentId() > 0)) {
			sql = (sql + "[DEPART_MENT_ID], ");
		}
		sql = (sql + "[DEPART_MENT_NAME]");
		sql = (sql + ", [DEPART_MENT_PARENT_ID]");
		sql = (sql + ")values(");
		if ((departMent.getDepartMentId() > 0)) {
			sql = (sql + departMent.getDepartMentId());
			sql = (sql + ", ");
		}
		sql = (sql + SqlServerUtils.safeSql(departMent.getDepartMentName().toString()));
		sql = (sql + ", ");
		if ((departMent.departMentParentId == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + departMent.getDepartMentParentId());
		}
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((departMent.getDepartMentId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_DEPART_MENT] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_DEPART_MENT off");
			}
			dataVisit.execSql(sql);
			if ((departMent.getDepartMentId() == 0)) {
				departMent.departMentId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入DepartMent对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		DepartMent.insert(dataVisit, this);
	}
	
	/**
	 * 更新DepartMent对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="departMent">需要更新的部门表</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, DepartMent departMent, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_DEPART_MENT] set ";
		sql = (sql + "[DEPART_MENT_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(departMent.getDepartMentName().toString()));
		sql = (sql + ",");
		if ((departMent.departMentParentId == null)) {
			sql = (sql + "[DEPART_MENT_PARENT_ID] = default ,");
		}
		else {
			sql = (sql + "[DEPART_MENT_PARENT_ID] = ");
			sql = (sql + departMent.getDepartMentParentId());
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "DEPART_MENT_ID = ");
		sql = (sql + departMent.getDepartMentId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新DepartMent对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="departMent">需要更新的部门表</param>
	 */
	protected static int update(IDataVisit2 dataVisit, DepartMent departMent) throws SQLException, DbException {
		return DepartMent.update(dataVisit, departMent, "");
	}
	
	/**
	 * 更新DepartMent对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return DepartMent.update(dataVisit, this);
	}
	
	/**
	 * 更新DepartMent对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return DepartMent.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.departMentName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<DepartMent> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<DepartMent> list = new ArrayList<DepartMent>();
		try {
			for (; reader.next(); ) {
				DepartMent obj = new DepartMent();
				DepartMent.readValue(reader, obj);
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
	public static List<DepartMent> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<DepartMent> list = new ArrayList<DepartMent>();
		try {
			for (; reader.next(); ) {
				DepartMent obj = new DepartMent();
				DepartMent.readValue(reader, obj);
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
	public static List<DepartMent> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((DepartMent.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<DepartMent> list = new ArrayList<DepartMent>();
		try {
			for (; reader.next(); ) {
				DepartMent obj = new DepartMent();
				DepartMent.readValue(reader, obj);
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
	public static List<DepartMent> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((DepartMent.getFullSelectSql() + appendConditionSql));
		List<DepartMent> list = new ArrayList<DepartMent>();
		try {
			for (; reader.next(); ) {
				DepartMent obj = new DepartMent();
				DepartMent.readValue(reader, obj);
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
	public static <T extends DepartMent> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((DepartMent.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			DepartMent.readValue(reader, obj);
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
public static <T extends DepartMent> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((DepartMent.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			DepartMent.readValue(reader, obj);
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
	String sql = "select * from T_DEPART_MENT ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据部门ID查询DepartMent
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADepartMentId">部门ID</param>
 */
public static DepartMent selectByDepartMentId(IDataVisit2 dataVisit, int ADepartMentId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "DEPART_MENT_ID = ");
	sql = (sql + ADepartMentId);
	List<DepartMent> list = DepartMent.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个DepartMent对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADepartMentId">部门ID</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByDepartMentId(IDataVisit2 dataVisit, int ADepartMentId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_DEPART_MENT] where ");
	sql = (sql + "DEPART_MENT_ID = ");
	sql = (sql + ADepartMentId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个DepartMent对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADepartMentId">部门ID</param>
 */
public static void deleteByDepartMentId(IDataVisit2 dataVisit, int ADepartMentId) throws SQLException, DbException {
	DepartMent.deleteByDepartMentId(dataVisit, ADepartMentId, "");
}

/**
 * 从reader读到数据到对象departMent中
 * <param name="reader">数据源</param>
 * <param name="departMent">目标对象</param>
 */
public static void readValue(ResultSet reader, DepartMent departMent) throws SQLException, DbException {
	departMent.departMentId = reader.getInt(1);
	departMent.departMentName = reader.getString(2);
	departMent.departMentParentId = reader.getInt(3);
	if (reader.wasNull()) {
		departMent.departMentParentId = null;
	}
}
}
