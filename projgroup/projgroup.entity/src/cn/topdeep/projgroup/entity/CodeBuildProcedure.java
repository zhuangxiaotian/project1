package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_CODE_BUILD_PROCEDURE: 构建相关的过程
 */
public class CodeBuildProcedure extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * BUILD_PROCEDURE_ID: 构建过程标识
	 */
	int buildProcedureId;
	
	/**
	 * BUILD_ID: 构建标识
	 */
	int buildId;
	
	/**
	 * FUNC_PROCEDURE_ID: 函数过程标识
	 */
	int funcProcedureId;
	
	/**
	 * BUILD_PROCEDURE_ID: 构建过程标识
	 */
	public int getBuildProcedureId() {
		return this.buildProcedureId;
	}
	
	/**
	 * BUILD_PROCEDURE_ID: 构建过程标识
	 */
	public void setBuildProcedureId(int value)
	 {
		this.buildProcedureId = value;
	}
	
	/**
	 * BUILD_ID: 构建标识
	 */
	public int getBuildId() {
		return this.buildId;
	}
	
	/**
	 * BUILD_ID: 构建标识
	 */
	public void setBuildId(int value)
	 {
		this.buildId = value;
	}
	
	/**
	 * FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public int getFuncProcedureId() {
		return this.funcProcedureId;
	}
	
	/**
	 * FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public void setFuncProcedureId(int value)
	 {
		this.funcProcedureId = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_CODE_BUILD_PROCEDURE].[BUILD_PROCEDURE_ID], [T_CODE_BUILD_PROCEDURE].[" +
"BUILD_ID], [T_CODE_BUILD_PROCEDURE].[FUNC_PROCEDURE_ID]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_CODE_BUILD_PROCEDURE].[BUILD_PROCEDURE_ID], [T_CODE_BUILD_PROCEDURE].[" +
"BUILD_ID], [T_CODE_BUILD_PROCEDURE].[FUNC_PROCEDURE_ID]   from [T_CODE_BUILD_PRO" +
"CEDURE] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_CODE_BUILD_PROCEDURE].[BUILD_PROCEDURE_ID], [T_CODE_BUILD_PROCEDURE].[BUILD_I" +
"D], [T_CODE_BUILD_PROCEDURE].[FUNC_PROCEDURE_ID] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_CODE_BUILD_PROCEDURE";
	}
	
	
	public String getTableName() {
		return "T_CODE_BUILD_PROCEDURE";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "BUILD_PROCEDURE_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.buildProcedureId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (CodeBuildProcedure.class.isInstance(obj)) {
			CodeBuildProcedure o = ((CodeBuildProcedure)(obj));
			this.buildProcedureId = o.buildProcedureId;
			this.buildId = o.buildId;
			this.funcProcedureId = o.funcProcedureId;
		}
	}
	
	/**
	 * 插入CodeBuildProcedure对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="codeBuildProcedure">需要插入的构建相关的过程</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, CodeBuildProcedure codeBuildProcedure) throws SQLException, DbException {
		String sql = "insert into [T_CODE_BUILD_PROCEDURE](";
		if ((codeBuildProcedure.getBuildProcedureId() > 0)) {
			sql = (sql + "[BUILD_PROCEDURE_ID], ");
		}
		sql = (sql + "[BUILD_ID]");
		sql = (sql + ", [FUNC_PROCEDURE_ID]");
		sql = (sql + ")values(");
		if ((codeBuildProcedure.getBuildProcedureId() > 0)) {
			sql = (sql + codeBuildProcedure.getBuildProcedureId());
			sql = (sql + ", ");
		}
		sql = (sql + codeBuildProcedure.getBuildId());
		sql = (sql + ", ");
		sql = (sql + codeBuildProcedure.getFuncProcedureId());
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((codeBuildProcedure.getBuildProcedureId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_CODE_BUILD_PROCEDURE] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_CODE_BUILD_PROCEDURE off");
			}
			dataVisit.execSql(sql);
			if ((codeBuildProcedure.getBuildProcedureId() == 0)) {
				codeBuildProcedure.buildProcedureId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入CodeBuildProcedure对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		CodeBuildProcedure.insert(dataVisit, this);
	}
	
	/**
	 * 更新CodeBuildProcedure对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="codeBuildProcedure">需要更新的构建相关的过程</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, CodeBuildProcedure codeBuildProcedure, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_CODE_BUILD_PROCEDURE] set ";
		sql = (sql + "[BUILD_ID] = ");
		sql = (sql + codeBuildProcedure.getBuildId());
		sql = (sql + ",");
		sql = (sql + "[FUNC_PROCEDURE_ID] = ");
		sql = (sql + codeBuildProcedure.getFuncProcedureId());
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "BUILD_PROCEDURE_ID = ");
		sql = (sql + codeBuildProcedure.getBuildProcedureId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新CodeBuildProcedure对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="codeBuildProcedure">需要更新的构建相关的过程</param>
	 */
	protected static int update(IDataVisit2 dataVisit, CodeBuildProcedure codeBuildProcedure) throws SQLException, DbException {
		return CodeBuildProcedure.update(dataVisit, codeBuildProcedure, "");
	}
	
	/**
	 * 更新CodeBuildProcedure对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return CodeBuildProcedure.update(dataVisit, this);
	}
	
	/**
	 * 更新CodeBuildProcedure对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return CodeBuildProcedure.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<CodeBuildProcedure> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<CodeBuildProcedure> list = new ArrayList<CodeBuildProcedure>();
		try {
			for (; reader.next(); ) {
				CodeBuildProcedure obj = new CodeBuildProcedure();
				CodeBuildProcedure.readValue(reader, obj);
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
	public static List<CodeBuildProcedure> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<CodeBuildProcedure> list = new ArrayList<CodeBuildProcedure>();
		try {
			for (; reader.next(); ) {
				CodeBuildProcedure obj = new CodeBuildProcedure();
				CodeBuildProcedure.readValue(reader, obj);
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
	public static List<CodeBuildProcedure> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((CodeBuildProcedure.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<CodeBuildProcedure> list = new ArrayList<CodeBuildProcedure>();
		try {
			for (; reader.next(); ) {
				CodeBuildProcedure obj = new CodeBuildProcedure();
				CodeBuildProcedure.readValue(reader, obj);
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
	public static List<CodeBuildProcedure> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((CodeBuildProcedure.getFullSelectSql() + appendConditionSql));
		List<CodeBuildProcedure> list = new ArrayList<CodeBuildProcedure>();
		try {
			for (; reader.next(); ) {
				CodeBuildProcedure obj = new CodeBuildProcedure();
				CodeBuildProcedure.readValue(reader, obj);
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
	public static <T extends CodeBuildProcedure> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((CodeBuildProcedure.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			CodeBuildProcedure.readValue(reader, obj);
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
public static <T extends CodeBuildProcedure> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((CodeBuildProcedure.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			CodeBuildProcedure.readValue(reader, obj);
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
	String sql = "select * from T_CODE_BUILD_PROCEDURE ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据构建过程标识查询CodeBuildProcedure
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ABuildProcedureId">构建过程标识</param>
 */
public static CodeBuildProcedure selectByBuildProcedureId(IDataVisit2 dataVisit, int ABuildProcedureId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "BUILD_PROCEDURE_ID = ");
	sql = (sql + ABuildProcedureId);
	List<CodeBuildProcedure> list = CodeBuildProcedure.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个CodeBuildProcedure对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ABuildProcedureId">构建过程标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByBuildProcedureId(IDataVisit2 dataVisit, int ABuildProcedureId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_CODE_BUILD_PROCEDURE] where ");
	sql = (sql + "BUILD_PROCEDURE_ID = ");
	sql = (sql + ABuildProcedureId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个CodeBuildProcedure对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ABuildProcedureId">构建过程标识</param>
 */
public static void deleteByBuildProcedureId(IDataVisit2 dataVisit, int ABuildProcedureId) throws SQLException, DbException {
	CodeBuildProcedure.deleteByBuildProcedureId(dataVisit, ABuildProcedureId, "");
}

/**
 * 根据外键构建标识删除一批CodeBuildProcedure对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="BuildId">构建标识</param>
 */
public static void deleteListByBuildId(IDataVisit2 dataVisit, int ABuildId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_CODE_BUILD_PROCEDURE] where ");
	sql = (sql + "BUILD_ID = ");
	sql = (sql + ABuildId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键函数过程标识删除一批CodeBuildProcedure对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="FuncProcedureId">函数过程标识</param>
 */
public static void deleteListByFuncProcedureId(IDataVisit2 dataVisit, int AFuncProcedureId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_CODE_BUILD_PROCEDURE] where ");
	sql = (sql + "FUNC_PROCEDURE_ID = ");
	sql = (sql + AFuncProcedureId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="BuildId">构建标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<CodeBuildProcedure> selectObjectsByBuildId(IDataVisit2 dataVisit, int ABuildId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where BUILD_ID = ";
	sql = (sql + ABuildId);
	sql = (sql + appendConditionSql);
	return CodeBuildProcedure.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="BuildId">构建标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<CodeBuildProcedure> selectObjectsByBuildId(IDataVisit2 dataVisit, int ABuildId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where BUILD_ID = ";
	sql = (sql + ABuildId);
	return CodeBuildProcedure.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="BuildId">构建标识</param>
 */
public static List<CodeBuildProcedure> selectObjectsByBuildId(IDataVisit2 dataVisit, int ABuildId) throws SQLException, DbException {
	String sql = " where BUILD_ID = ";
	sql = (sql + ABuildId);
	return CodeBuildProcedure.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="FuncProcedureId">函数过程标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<CodeBuildProcedure> selectObjectsByFuncProcedureId(IDataVisit2 dataVisit, int AFuncProcedureId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where FUNC_PROCEDURE_ID = ";
	sql = (sql + AFuncProcedureId);
	sql = (sql + appendConditionSql);
	return CodeBuildProcedure.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="FuncProcedureId">函数过程标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<CodeBuildProcedure> selectObjectsByFuncProcedureId(IDataVisit2 dataVisit, int AFuncProcedureId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where FUNC_PROCEDURE_ID = ";
	sql = (sql + AFuncProcedureId);
	return CodeBuildProcedure.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="FuncProcedureId">函数过程标识</param>
 */
public static List<CodeBuildProcedure> selectObjectsByFuncProcedureId(IDataVisit2 dataVisit, int AFuncProcedureId) throws SQLException, DbException {
	String sql = " where FUNC_PROCEDURE_ID = ";
	sql = (sql + AFuncProcedureId);
	return CodeBuildProcedure.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象codeBuildProcedure中
 * <param name="reader">数据源</param>
 * <param name="codeBuildProcedure">目标对象</param>
 */
public static void readValue(ResultSet reader, CodeBuildProcedure codeBuildProcedure) throws SQLException, DbException {
	codeBuildProcedure.buildProcedureId = reader.getInt(1);
	codeBuildProcedure.buildId = reader.getInt(2);
	codeBuildProcedure.funcProcedureId = reader.getInt(3);
}
}
