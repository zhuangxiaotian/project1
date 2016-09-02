package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_PROJECT: 工程表
 */
public class Project extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * PROJ_ID: 工程号
	 */
	int projId;
	
	/**
	 * PROJECT_ACTUAL_END_DATE: 工程实际结束时间
	 */
	java.util.Date projectActualEndDate;
	
	/**
	 * PROJECT_ACTUAL_START_DATE: 工程实际开始时间
	 */
	java.util.Date projectActualStartDate;
	
	/**
	 * PROJECT_DESC: 工程描述
	 */
	String projectDesc;
	
	/**
	 * PROJECT_NAME: 工程名称
	 */
	String projectName = "";
	
	/**
	 * PROJECT_PLAN_END_DATE: 工程计划结束时间
	 */
	java.util.Date projectPlanEndDate;
	
	/**
	 * PROJECT_PLAN_START_DATE: 工程计划开始时间
	 */
	java.util.Date projectPlanStartDate;
	
	/**
	 * PROJECT_SHORT_NAME: 工程简称
	 */
	String projectShortName = "";
	
	/**
	 * PROJECT_STATE: 工程状态
	 */
	int projectState;
	
	/**
	 * PROJECT_MANAGER_ID: 工程管理员号
	 */
	Integer projectManagerId;
	
	/**
	 * PROJ_ID: 工程号
	 */
	public int getProjId() {
		return this.projId;
	}
	
	/**
	 * PROJ_ID: 工程号
	 */
	public void setProjId(int value)
	 {
		this.projId = value;
	}
	
	/**
	 * PROJECT_ACTUAL_END_DATE: 工程实际结束时间
	 */
	public java.util.Date getProjectActualEndDate() {
		return this.projectActualEndDate;
	}
	
	/**
	 * PROJECT_ACTUAL_END_DATE: 工程实际结束时间
	 */
	public void setProjectActualEndDate(java.util.Date value)
	 {
		this.projectActualEndDate = value;
	}
	
	/**
	 * PROJECT_ACTUAL_START_DATE: 工程实际开始时间
	 */
	public java.util.Date getProjectActualStartDate() {
		return this.projectActualStartDate;
	}
	
	/**
	 * PROJECT_ACTUAL_START_DATE: 工程实际开始时间
	 */
	public void setProjectActualStartDate(java.util.Date value)
	 {
		this.projectActualStartDate = value;
	}
	
	/**
	 * PROJECT_DESC: 工程描述
	 */
	public String getProjectDesc() {
		return this.projectDesc;
	}
	
	/**
	 * PROJECT_DESC: 工程描述
	 */
	public void setProjectDesc(String value)
	 {
		this.projectDesc = value;
	}
	
	/**
	 * PROJECT_NAME: 工程名称
	 */
	public String getProjectName() {
		return this.projectName;
	}
	
	/**
	 * PROJECT_NAME: 工程名称
	 */
	public void setProjectName(String value)
	 {
		this.projectName = value;
	}
	
	/**
	 * PROJECT_PLAN_END_DATE: 工程计划结束时间
	 */
	public java.util.Date getProjectPlanEndDate() {
		return this.projectPlanEndDate;
	}
	
	/**
	 * PROJECT_PLAN_END_DATE: 工程计划结束时间
	 */
	public void setProjectPlanEndDate(java.util.Date value)
	 {
		this.projectPlanEndDate = value;
	}
	
	/**
	 * PROJECT_PLAN_START_DATE: 工程计划开始时间
	 */
	public java.util.Date getProjectPlanStartDate() {
		return this.projectPlanStartDate;
	}
	
	/**
	 * PROJECT_PLAN_START_DATE: 工程计划开始时间
	 */
	public void setProjectPlanStartDate(java.util.Date value)
	 {
		this.projectPlanStartDate = value;
	}
	
	/**
	 * PROJECT_SHORT_NAME: 工程简称
	 */
	public String getProjectShortName() {
		return this.projectShortName;
	}
	
	/**
	 * PROJECT_SHORT_NAME: 工程简称
	 */
	public void setProjectShortName(String value)
	 {
		this.projectShortName = value;
	}
	
	/**
	 * PROJECT_STATE: 工程状态
	 */
	public int getProjectState() {
		return this.projectState;
	}
	
	/**
	 * PROJECT_STATE: 工程状态
	 */
	public void setProjectState(int value)
	 {
		this.projectState = value;
	}
	
	/**
	 * PROJECT_MANAGER_ID: 工程管理员号
	 */
	public Integer getProjectManagerId() {
		return this.projectManagerId;
	}
	
	/**
	 * PROJECT_MANAGER_ID: 工程管理员号
	 */
	public void setProjectManagerId(Integer value)
	 {
		this.projectManagerId = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_PROJECT].[PROJ_ID], [T_PROJECT].[PROJECT_ACTUAL_END_DATE], [T_PROJECT].[PROJECT_ACTUAL_START_DATE], [T_PROJECT].[PROJECT_DESC], [T_PROJECT].[PROJECT_NAME], [T_PROJECT].[PROJECT_PLAN_END_DATE], [T_PROJECT].[PROJECT_PLAN_START_DATE], [T_PROJECT].[PROJECT_SHORT_NAME], [T_PROJECT].[PROJECT_STATE], [T_PROJECT].[PROJECT_MANAGER_ID]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_PROJECT].[PROJ_ID], [T_PROJECT].[PROJECT_ACTUAL_END_DATE], [T_PROJECT].[PROJECT_ACTUAL_START_DATE], [T_PROJECT].[PROJECT_DESC], [T_PROJECT].[PROJECT_NAME], [T_PROJECT].[PROJECT_PLAN_END_DATE], [T_PROJECT].[PROJECT_PLAN_START_DATE], [T_PROJECT].[PROJECT_SHORT_NAME], [T_PROJECT].[PROJECT_STATE], [T_PROJECT].[PROJECT_MANAGER_ID]   from [T_PROJECT] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_PROJECT].[PROJ_ID], [T_PROJECT].[PROJECT_ACTUAL_END_DATE], [T_PROJECT].[PROJECT_ACTUAL_START_DATE], [T_PROJECT].[PROJECT_DESC], [T_PROJECT].[PROJECT_NAME], [T_PROJECT].[PROJECT_PLAN_END_DATE], [T_PROJECT].[PROJECT_PLAN_START_DATE], [T_PROJECT].[PROJECT_SHORT_NAME], [T_PROJECT].[PROJECT_STATE], [T_PROJECT].[PROJECT_MANAGER_ID] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_PROJECT";
	}
	
	
	public String getTableName() {
		return "T_PROJECT";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "PROJ_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.projId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (Project.class.isInstance(obj)) {
			Project o = ((Project)(obj));
			this.projId = o.projId;
			this.projectActualEndDate = o.projectActualEndDate;
			this.projectActualStartDate = o.projectActualStartDate;
			this.projectDesc = o.projectDesc;
			this.projectName = o.projectName;
			this.projectPlanEndDate = o.projectPlanEndDate;
			this.projectPlanStartDate = o.projectPlanStartDate;
			this.projectShortName = o.projectShortName;
			this.projectState = o.projectState;
			this.projectManagerId = o.projectManagerId;
		}
	}
	
	/**
	 * 插入Project对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="project">需要插入的工程表</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Project project) throws SQLException, DbException {
		String sql = "insert into [T_PROJECT](";
		if ((project.getProjId() > 0)) {
			sql = (sql + "[PROJ_ID], ");
		}
		sql = (sql + "[PROJECT_ACTUAL_END_DATE]");
		sql = (sql + ", [PROJECT_ACTUAL_START_DATE]");
		sql = (sql + ", [PROJECT_DESC]");
		sql = (sql + ", [PROJECT_NAME]");
		sql = (sql + ", [PROJECT_PLAN_END_DATE]");
		sql = (sql + ", [PROJECT_PLAN_START_DATE]");
		sql = (sql + ", [PROJECT_SHORT_NAME]");
		sql = (sql + ", [PROJECT_STATE]");
		sql = (sql + ", [PROJECT_MANAGER_ID]");
		sql = (sql + ")values(");
		if ((project.getProjId() > 0)) {
			sql = (sql + project.getProjId());
			sql = (sql + ", ");
		}
		sql = (sql + SqlServerUtils.getDateSql(project.getProjectActualEndDate()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getDateSql(project.getProjectActualStartDate()));
		sql = (sql + ", ");
		if ((project.projectDesc == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(project.getProjectDesc().toString()));
		}
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(project.getProjectName().toString()));
		sql = (sql + ", ");
		if ((project.projectPlanEndDate == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(project.getProjectPlanEndDate()));
		}
		sql = (sql + ", ");
		if ((project.projectPlanStartDate == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(project.getProjectPlanStartDate()));
		}
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(project.getProjectShortName().toString()));
		sql = (sql + ", ");
		sql = (sql + project.getProjectState());
		sql = (sql + ", ");
		if ((project.projectManagerId == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + project.getProjectManagerId());
		}
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((project.getProjId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_PROJECT] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_PROJECT off");
			}
			dataVisit.execSql(sql);
			if ((project.getProjId() == 0)) {
				project.projId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入Project对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Project.insert(dataVisit, this);
	}
	
	/**
	 * 更新Project对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="project">需要更新的工程表</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Project project, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_PROJECT] set ";
		sql = (sql + "[PROJECT_ACTUAL_END_DATE] = ");
		sql = (sql + SqlServerUtils.getDateSql(project.getProjectActualEndDate()));
		sql = (sql + ",");
		sql = (sql + "[PROJECT_ACTUAL_START_DATE] = ");
		sql = (sql + SqlServerUtils.getDateSql(project.getProjectActualStartDate()));
		sql = (sql + ",");
		if ((project.projectDesc == null)) {
			sql = (sql + "[PROJECT_DESC] = default ,");
		}
		else {
			sql = (sql + "[PROJECT_DESC] = ");
			sql = (sql + SqlServerUtils.safeSql(project.getProjectDesc().toString()));
			sql = (sql + ",");
		}
		sql = (sql + "[PROJECT_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(project.getProjectName().toString()));
		sql = (sql + ",");
		if ((project.projectPlanEndDate == null)) {
			sql = (sql + "[PROJECT_PLAN_END_DATE] = default ,");
		}
		else {
			sql = (sql + "[PROJECT_PLAN_END_DATE] = ");
			sql = (sql + SqlServerUtils.getDateSql(project.getProjectPlanEndDate()));
			sql = (sql + ",");
		}
		if ((project.projectPlanStartDate == null)) {
			sql = (sql + "[PROJECT_PLAN_START_DATE] = default ,");
		}
		else {
			sql = (sql + "[PROJECT_PLAN_START_DATE] = ");
			sql = (sql + SqlServerUtils.getDateSql(project.getProjectPlanStartDate()));
			sql = (sql + ",");
		}
		sql = (sql + "[PROJECT_SHORT_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(project.getProjectShortName().toString()));
		sql = (sql + ",");
		sql = (sql + "[PROJECT_STATE] = ");
		sql = (sql + project.getProjectState());
		sql = (sql + ",");
		if ((project.projectManagerId == null)) {
			sql = (sql + "[PROJECT_MANAGER_ID] = default ,");
		}
		else {
			sql = (sql + "[PROJECT_MANAGER_ID] = ");
			sql = (sql + project.getProjectManagerId());
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "PROJ_ID = ");
		sql = (sql + project.getProjId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Project对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="project">需要更新的工程表</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Project project) throws SQLException, DbException {
		return Project.update(dataVisit, project, "");
	}
	
	/**
	 * 更新Project对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Project.update(dataVisit, this);
	}
	
	/**
	 * 更新Project对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Project.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.projectName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Project> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Project> list = new ArrayList<Project>();
		try {
			for (; reader.next(); ) {
				Project obj = new Project();
				Project.readValue(reader, obj);
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
	public static List<Project> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Project> list = new ArrayList<Project>();
		try {
			for (; reader.next(); ) {
				Project obj = new Project();
				Project.readValue(reader, obj);
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
	public static List<Project> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Project.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Project> list = new ArrayList<Project>();
		try {
			for (; reader.next(); ) {
				Project obj = new Project();
				Project.readValue(reader, obj);
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
	public static List<Project> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Project.getFullSelectSql() + appendConditionSql));
		List<Project> list = new ArrayList<Project>();
		try {
			for (; reader.next(); ) {
				Project obj = new Project();
				Project.readValue(reader, obj);
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
	public static <T extends Project> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Project.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Project.readValue(reader, obj);
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
public static <T extends Project> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Project.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Project.readValue(reader, obj);
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
	String sql = "select * from T_PROJECT ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据工程号查询Project
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AProjId">工程号</param>
 */
public static Project selectByProjId(IDataVisit2 dataVisit, int AProjId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "PROJ_ID = ");
	sql = (sql + AProjId);
	List<Project> list = Project.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Project对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AProjId">工程号</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByProjId(IDataVisit2 dataVisit, int AProjId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_PROJECT] where ");
	sql = (sql + "PROJ_ID = ");
	sql = (sql + AProjId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Project对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AProjId">工程号</param>
 */
public static void deleteByProjId(IDataVisit2 dataVisit, int AProjId) throws SQLException, DbException {
	Project.deleteByProjId(dataVisit, AProjId, "");
}

/**
 * 根据外键工程管理员号删除一批Project对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ProjectManagerId">工程管理员号</param>
 */
public static void deleteListByProjectManagerId(IDataVisit2 dataVisit, Integer AProjectManagerId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_PROJECT] where ");
	sql = (sql + "PROJECT_MANAGER_ID = ");
	sql = (sql + AProjectManagerId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ProjectManagerId">工程管理员号</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Project> selectObjectsByProjectManagerId(IDataVisit2 dataVisit, Integer AProjectManagerId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PROJECT_MANAGER_ID = ";
	sql = (sql + AProjectManagerId);
	sql = (sql + appendConditionSql);
	return Project.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ProjectManagerId">工程管理员号</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Project> selectObjectsByProjectManagerId(IDataVisit2 dataVisit, Integer AProjectManagerId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PROJECT_MANAGER_ID = ";
	sql = (sql + AProjectManagerId);
	return Project.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ProjectManagerId">工程管理员号</param>
 */
public static List<Project> selectObjectsByProjectManagerId(IDataVisit2 dataVisit, Integer AProjectManagerId) throws SQLException, DbException {
	String sql = " where PROJECT_MANAGER_ID = ";
	sql = (sql + AProjectManagerId);
	return Project.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象project中
 * <param name="reader">数据源</param>
 * <param name="project">目标对象</param>
 */
public static void readValue(ResultSet reader, Project project) throws SQLException, DbException {
	project.projId = reader.getInt(1);
	project.projectActualEndDate = SqlUtils.getDate(reader, 2);
	project.projectActualStartDate = SqlUtils.getDate(reader, 3);
	project.projectDesc = reader.getString(4);
	if (reader.wasNull()) {
		project.projectDesc = null;
	}
	project.projectName = reader.getString(5);
	project.projectPlanEndDate = SqlUtils.getDate(reader, 6);
	if (reader.wasNull()) {
		project.projectPlanEndDate = null;
	}
	project.projectPlanStartDate = SqlUtils.getDate(reader, 7);
	if (reader.wasNull()) {
		project.projectPlanStartDate = null;
	}
	project.projectShortName = reader.getString(8);
	project.projectState = reader.getInt(9);
	project.projectManagerId = reader.getInt(10);
	if (reader.wasNull()) {
		project.projectManagerId = null;
	}
}
}
