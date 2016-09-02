package cn.topdeep.projgroup.entity.bugtracker;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import java.sql.*;
/**
 * PROJECT_USER_XREF: 
 */
public class ProjectUserXref extends common.dbvisit.BaseTable {
	
	/**
	 * PU_ID: 
	 */
	private int puId;
	
	/**
	 * PU_PROJECT: 
	 */
	private int puProject;
	
	/**
	 * PU_USER: 
	 */
	private int puUser;
	
	/**
	 * PU_AUTO_SUBSCRIBE: 
	 */
	private int puAutoSubscribe;
	
	/**
	 * PU_PERMISSION_LEVEL: 
	 */
	private Integer puPermissionLevel;
	
	/**
	 * PU_ADMIN: 
	 */
	private Integer puAdmin;
	
	/**
	 * PU_ID: 
	 */
	public int getPuId() {
		return this.puId;
	}
	
	/**
	 * PU_ID: 
	 */
	public void setPuId(int value)
	 {
		this.puId = value;
	}
	
	/**
	 * PU_PROJECT: 
	 */
	public int getPuProject() {
		return this.puProject;
	}
	
	/**
	 * PU_PROJECT: 
	 */
	public void setPuProject(int value)
	 {
		this.puProject = value;
	}
	
	/**
	 * PU_USER: 
	 */
	public int getPuUser() {
		return this.puUser;
	}
	
	/**
	 * PU_USER: 
	 */
	public void setPuUser(int value)
	 {
		this.puUser = value;
	}
	
	/**
	 * PU_AUTO_SUBSCRIBE: 
	 */
	public int getPuAutoSubscribe() {
		return this.puAutoSubscribe;
	}
	
	/**
	 * PU_AUTO_SUBSCRIBE: 
	 */
	public void setPuAutoSubscribe(int value)
	 {
		this.puAutoSubscribe = value;
	}
	
	/**
	 * PU_PERMISSION_LEVEL: 
	 */
	public Integer getPuPermissionLevel() {
		return this.puPermissionLevel;
	}
	
	/**
	 * PU_PERMISSION_LEVEL: 
	 */
	public void setPuPermissionLevel(Integer value)
	 {
		this.puPermissionLevel = value;
	}
	
	/**
	 * PU_ADMIN: 
	 */
	public Integer getPuAdmin() {
		return this.puAdmin;
	}
	
	/**
	 * PU_ADMIN: 
	 */
	public void setPuAdmin(Integer value)
	 {
		this.puAdmin = value;
	}
	
	public static String getSelectSql() {
		return "select [PROJECT_USER_XREF].[PU_ID],[PROJECT_USER_XREF].[PU_PROJECT],[PROJECT_USER" +
"_XREF].[PU_USER],[PROJECT_USER_XREF].[PU_AUTO_SUBSCRIBE],[PROJECT_USER_XREF].[PU" +
"_PERMISSION_LEVEL],[PROJECT_USER_XREF].[PU_ADMIN] ";
	}
	
	
	/**
	 * 插入一个对象到数据库中
	 * @param ADataVisit 数据访问接口
	 * @param ProjectUserXref 需要插入的新对象
	 */
	public static void insert(IDataVisit2 ADataVisit, ProjectUserXref AProjectUserXref) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("insert into [PROJECT_USER_XREF] (");
		sql.append("[PROJECT_USER_XREF].[PU_PROJECT],");
		sql.append("[PROJECT_USER_XREF].[PU_USER],");
		sql.append("[PROJECT_USER_XREF].[PU_AUTO_SUBSCRIBE],");
		if ((AProjectUserXref.puPermissionLevel == null)) {
		}
		else {
			sql.append("[PROJECT_USER_XREF].[PU_PERMISSION_LEVEL],");
		}
		if ((AProjectUserXref.puAdmin == null)) {
		}
		else {
			sql.append("[PROJECT_USER_XREF].[PU_ADMIN],");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(") values (");
		sql.append(AProjectUserXref.puProject);
		sql.append(",");
		sql.append(AProjectUserXref.puUser);
		sql.append(",");
		sql.append(AProjectUserXref.puAutoSubscribe);
		sql.append(",");
		if ((AProjectUserXref.puPermissionLevel == null)) {
		}
		else {
			sql.append(AProjectUserXref.puPermissionLevel);
			sql.append(",");
		}
		if ((AProjectUserXref.puAdmin == null)) {
		}
		else {
			sql.append(AProjectUserXref.puAdmin);
			sql.append(",");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(")");
		ADataVisit.beginTransaction();
		try {
			ADataVisit.execSql(sql.toString());
			AProjectUserXref.puId = ((int)(((double)(ADataVisit.getIDentity()))));
			ADataVisit.commitTransaction();
		}
		catch (SQLException e) {
			ADataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param ProjectUserXref 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, ProjectUserXref AProjectUserXref) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("PROJECT_USER_XREF set ");
		sql.append("PU_PROJECT = ");
		sql.append(AProjectUserXref.puProject);
		sql.append(",");
		sql.append("PU_USER = ");
		sql.append(AProjectUserXref.puUser);
		sql.append(",");
		sql.append("PU_AUTO_SUBSCRIBE = ");
		sql.append(AProjectUserXref.puAutoSubscribe);
		sql.append(",");
		if ((AProjectUserXref.puPermissionLevel == null)) {
			sql.append("PU_PERMISSION_LEVEL = default ,");
		}
		else {
			sql.append("PU_PERMISSION_LEVEL = ");
			sql.append(AProjectUserXref.puPermissionLevel);
			sql.append(",");
		}
		if ((AProjectUserXref.puAdmin == null)) {
			sql.append("PU_ADMIN = default ,");
		}
		else {
			sql.append("PU_ADMIN = ");
			sql.append(AProjectUserXref.puAdmin);
			sql.append(",");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("PU_ID = ");
		sql.append(AProjectUserXref.puId);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param ProjectUserXref 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, ProjectUserXref AProjectUserXref, String appendConditionSql) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("PROJECT_USER_XREF set ");
		sql.append("PU_PROJECT = ");
		sql.append(AProjectUserXref.puProject);
		sql.append(",");
		sql.append("PU_USER = ");
		sql.append(AProjectUserXref.puUser);
		sql.append(",");
		sql.append("PU_AUTO_SUBSCRIBE = ");
		sql.append(AProjectUserXref.puAutoSubscribe);
		sql.append(",");
		if ((AProjectUserXref.puPermissionLevel == null)) {
			sql.append("PU_PERMISSION_LEVEL = default ,");
		}
		else {
			sql.append("PU_PERMISSION_LEVEL = ");
			sql.append(AProjectUserXref.puPermissionLevel);
			sql.append(",");
		}
		if ((AProjectUserXref.puAdmin == null)) {
			sql.append("PU_ADMIN = default ,");
		}
		else {
			sql.append("PU_ADMIN = ");
			sql.append(AProjectUserXref.puAdmin);
			sql.append(",");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("PU_ID = ");
		sql.append(AProjectUserXref.puId);
		sql.append(appendConditionSql);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @param AppendSql 附加的Sql语句
	 * @return 查询结果
	 */
	public static List<ProjectUserXref> selectObjects(IDataVisit2 ADataVisit, String AppendSql) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((ProjectUserXref.getSelectSql() 
						+ (" from [PROJECT_USER_XREF] " + AppendSql)));
		List<ProjectUserXref> list = new ArrayList<ProjectUserXref>();
		try {
			for (; reader.next(); ) {
				ProjectUserXref obj = new ProjectUserXref();
				ProjectUserXref.readValue(reader, obj);
				list.add(obj);
			}
		}
		finally {
			if ((reader != null)) {
				reader.close();
			}
			ADataVisit.releaseConnection();
		}
		return list;
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @return 查询结果
	 */
	public static List<ProjectUserXref> selectObjects(IDataVisit2 ADataVisit) throws SQLException {
		return ProjectUserXref.selectObjects(ADataVisit, "");
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @param AppendSql 附加的Sql语句
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public static List<ProjectUserXref> selectObjects(IDataVisit2 ADataVisit, String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((ProjectUserXref.getSelectSql() 
						+ (" from [PROJECT_USER_XREF] " + AppendSql)), pageIndex, rowsOfPage, orderField, order);
		List<ProjectUserXref> list = new ArrayList<ProjectUserXref>();
		try {
			for (; reader.next(); ) {
				ProjectUserXref obj = new ProjectUserXref();
				ProjectUserXref.readValue(reader, obj);
				list.add(obj);
			}
		}
		finally {
			if ((reader != null)) {
				reader.close();
			}
			ADataVisit.releaseConnection();
		}
		return list;
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public static List<ProjectUserXref> selectObjects(IDataVisit2 ADataVisit, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		return ProjectUserXref.selectObjects(ADataVisit, "", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 从数据表PROJECT_USER_XREF中查询一个实体对象
	 * @param ADataVisit 数据访问接口
	 * @param Int32 
	 */
	public static ProjectUserXref SelectByPuId(IDataVisit2 ADataVisit, int APuId) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append(" where ");
		sql.append("PU_ID = ");
		sql.append(APuId);
		List<ProjectUserXref> list = ProjectUserXref.selectObjects(ADataVisit, sql.toString());
		if ((list.size() > 0)) {
			return list.get(0);
		}
		else {
			return null;
		}
	}
	
	/**
	 * 从数据表PROJECT_USER_XREF中查询一个实体对象
	 * @param ADataVisit 数据访问接口
	 * @param Int32 
	 * @param Int32 
	 */
	public static ProjectUserXref SelectByPuProjectPuUser(IDataVisit2 ADataVisit, int APuProject, int APuUser) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append(" where ");
		sql.append("PU_PROJECT = ");
		sql.append(APuProject);
		sql.append(" and ");
		sql.append("PU_USER = ");
		sql.append(APuUser);
		List<ProjectUserXref> list = ProjectUserXref.selectObjects(ADataVisit, sql.toString());
		if ((list.size() > 0)) {
			return list.get(0);
		}
		else {
			return null;
		}
	}
	
	/**
	 * 从数据表PROJECT_USER_XREF中查询一个实体对象
	 * @param ADataVisit 数据访问接口
	 * @param Int32 
	 * @param Int32 
	 */
	public static ProjectUserXref SelectByPuUserPuProject(IDataVisit2 ADataVisit, int APuUser, int APuProject) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append(" where ");
		sql.append("PU_USER = ");
		sql.append(APuUser);
		sql.append(" and ");
		sql.append("PU_PROJECT = ");
		sql.append(APuProject);
		List<ProjectUserXref> list = ProjectUserXref.selectObjects(ADataVisit, sql.toString());
		if ((list.size() > 0)) {
			return list.get(0);
		}
		else {
			return null;
		}
	}
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * @param object 源对象
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (this.getClass().isInstance(obj)) {
			ProjectUserXref o = ((ProjectUserXref)(obj));
			this.puId = o.puId;
			this.puProject = o.puProject;
			this.puUser = o.puUser;
			this.puAutoSubscribe = o.puAutoSubscribe;
			this.puPermissionLevel = o.puPermissionLevel;
			this.puAdmin = o.puAdmin;
		}
	}
	
	/**
	 * 复制值到给定的对象,要求目标对象是子类
	 * @param object 目标对象
	 */
	public void assignTo(BaseTable obj) {
		super.assignTo(obj);
		if (this.getClass().isInstance(obj)) {
			ProjectUserXref o = ((ProjectUserXref)(obj));
			o.puId = this.puId;
			o.puProject = this.puProject;
			o.puUser = this.puUser;
			o.puAutoSubscribe = this.puAutoSubscribe;
			o.puPermissionLevel = this.puPermissionLevel;
			o.puAdmin = this.puAdmin;
		}
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * <@param appendSql 附加的条件语句>
	 */
	public static void deleteByPuId(IDataVisit2 ADataVisit, int APuId, String appendSql) throws SQLException, DbException {
		String sql = "";
		sql = (sql + " delete from PROJECT_USER_XREF where ");
		sql = (sql + "PU_ID = ");
		sql = (sql + APuId);
		sql = (sql + appendSql);
		ADataVisit.execSql(sql);
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 */
	public static void deleteByPuId(IDataVisit2 ADataVisit, int APuId) throws SQLException, DbException {
		ProjectUserXref.deleteByPuId(ADataVisit, APuId, "");
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * @param name=Int32
	 * <@param appendSql 附加的条件语句>
	 */
	public static void deleteByPuProjectPuUser(IDataVisit2 ADataVisit, int APuProject, int APuUser, String appendSql) throws SQLException, DbException {
		String sql = "";
		sql = (sql + " delete from PROJECT_USER_XREF where ");
		sql = (sql + "PU_PROJECT = ");
		sql = (sql + APuProject);
		sql = (sql + " and ");
		sql = (sql + "PU_USER = ");
		sql = (sql + APuUser);
		sql = (sql + appendSql);
		ADataVisit.execSql(sql);
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * @param name=Int32
	 */
	public static void deleteByPuProjectPuUser(IDataVisit2 ADataVisit, int APuProject, int APuUser) throws SQLException, DbException {
		ProjectUserXref.deleteByPuProjectPuUser(ADataVisit, APuProject, APuUser, "");
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * @param name=Int32
	 * <@param appendSql 附加的条件语句>
	 */
	public static void deleteByPuUserPuProject(IDataVisit2 ADataVisit, int APuUser, int APuProject, String appendSql) throws SQLException, DbException {
		String sql = "";
		sql = (sql + " delete from PROJECT_USER_XREF where ");
		sql = (sql + "PU_USER = ");
		sql = (sql + APuUser);
		sql = (sql + " and ");
		sql = (sql + "PU_PROJECT = ");
		sql = (sql + APuProject);
		sql = (sql + appendSql);
		ADataVisit.execSql(sql);
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * @param name=Int32
	 */
	public static void deleteByPuUserPuProject(IDataVisit2 ADataVisit, int APuUser, int APuProject) throws SQLException, DbException {
		ProjectUserXref.deleteByPuUserPuProject(ADataVisit, APuUser, APuProject, "");
	}
	
	/**
	 * 把ResultSet中的数据转到对象中
	 * @param AReader 数据源
	 * @param AProjectUserXref 目标对象
	 * @return 
	 */
	public static void readValue(ResultSet AReader, ProjectUserXref AProjectUserXref) throws SQLException {
		AProjectUserXref.puId = AReader.getInt(1);
		AProjectUserXref.puProject = AReader.getInt(2);
		AProjectUserXref.puUser = AReader.getInt(3);
		AProjectUserXref.puAutoSubscribe = AReader.getInt(4);
		AProjectUserXref.puPermissionLevel = AReader.getInt(5);
		if (AReader.wasNull()) {
			AProjectUserXref.puPermissionLevel = null;
		}
		AProjectUserXref.puAdmin = AReader.getInt(6);
		if (AReader.wasNull()) {
			AProjectUserXref.puAdmin = null;
		}
	}
}
