package cn.topdeep.projgroup.entity.bugtracker;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import java.sql.*;
/**
 * QUERIES: 
 */
public class Queries extends common.dbvisit.BaseTable {
	
	/**
	 * QU_ID: 
	 */
	private int quId;
	
	/**
	 * QU_DESC: 
	 */
	private String quDesc = "";
	
	/**
	 * QU_SQL: 
	 */
	private String quSql = "";
	
	/**
	 * QU_DEFAULT: 
	 */
	private Integer quDefault;
	
	/**
	 * QU_USER: 
	 */
	private Integer quUser;
	
	/**
	 * QU_ID: 
	 */
	public int getQuId() {
		return this.quId;
	}
	
	/**
	 * QU_ID: 
	 */
	public void setQuId(int value)
	 {
		this.quId = value;
	}
	
	/**
	 * QU_DESC: 
	 */
	public String getQuDesc() {
		return this.quDesc;
	}
	
	/**
	 * QU_DESC: 
	 */
	public void setQuDesc(String value)
	 {
		this.quDesc = value;
	}
	
	/**
	 * QU_SQL: 
	 */
	public String getQuSql() {
		return this.quSql;
	}
	
	/**
	 * QU_SQL: 
	 */
	public void setQuSql(String value)
	 {
		this.quSql = value;
	}
	
	/**
	 * QU_DEFAULT: 
	 */
	public Integer getQuDefault() {
		return this.quDefault;
	}
	
	/**
	 * QU_DEFAULT: 
	 */
	public void setQuDefault(Integer value)
	 {
		this.quDefault = value;
	}
	
	/**
	 * QU_USER: 
	 */
	public Integer getQuUser() {
		return this.quUser;
	}
	
	/**
	 * QU_USER: 
	 */
	public void setQuUser(Integer value)
	 {
		this.quUser = value;
	}
	
	public static String getSelectSql() {
		return "select [QUERIES].[QU_ID],[QUERIES].[QU_DESC],[QUERIES].[QU_SQL],[QUERIES].[QU_DEF" +
"AULT],[QUERIES].[QU_USER] ";
	}
	
	
	/**
	 * 插入一个对象到数据库中
	 * @param ADataVisit 数据访问接口
	 * @param Queries 需要插入的新对象
	 */
	public static void insert(IDataVisit2 ADataVisit, Queries AQueries) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("insert into [QUERIES] (");
		sql.append("[QUERIES].[QU_DESC],");
		sql.append("[QUERIES].[QU_SQL],");
		if ((AQueries.quDefault == null)) {
		}
		else {
			sql.append("[QUERIES].[QU_DEFAULT],");
		}
		if ((AQueries.quUser == null)) {
		}
		else {
			sql.append("[QUERIES].[QU_USER],");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(") values (");
		sql.append(SqlServerUtils.safeSql(AQueries.quDesc.toString()));
		sql.append(",");
		sql.append(SqlServerUtils.safeSql(AQueries.quSql.toString()));
		sql.append(",");
		if ((AQueries.quDefault == null)) {
		}
		else {
			sql.append(AQueries.quDefault);
			sql.append(",");
		}
		if ((AQueries.quUser == null)) {
		}
		else {
			sql.append(AQueries.quUser);
			sql.append(",");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(")");
		ADataVisit.beginTransaction();
		try {
			ADataVisit.execSql(sql.toString());
			AQueries.quId = ((int)(((double)(ADataVisit.getIDentity()))));
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
	 * @param Queries 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, Queries AQueries) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("QUERIES set ");
		sql.append("QU_DESC = ");
		sql.append(SqlServerUtils.safeSql(AQueries.quDesc.toString()));
		sql.append(",");
		sql.append("QU_SQL = ");
		sql.append(SqlServerUtils.safeSql(AQueries.quSql.toString()));
		sql.append(",");
		if ((AQueries.quDefault == null)) {
			sql.append("QU_DEFAULT = default ,");
		}
		else {
			sql.append("QU_DEFAULT = ");
			sql.append(AQueries.quDefault);
			sql.append(",");
		}
		if ((AQueries.quUser == null)) {
			sql.append("QU_USER = default ,");
		}
		else {
			sql.append("QU_USER = ");
			sql.append(AQueries.quUser);
			sql.append(",");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("QU_ID = ");
		sql.append(AQueries.quId);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param Queries 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, Queries AQueries, String appendConditionSql) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("QUERIES set ");
		sql.append("QU_DESC = ");
		sql.append(SqlServerUtils.safeSql(AQueries.quDesc.toString()));
		sql.append(",");
		sql.append("QU_SQL = ");
		sql.append(SqlServerUtils.safeSql(AQueries.quSql.toString()));
		sql.append(",");
		if ((AQueries.quDefault == null)) {
			sql.append("QU_DEFAULT = default ,");
		}
		else {
			sql.append("QU_DEFAULT = ");
			sql.append(AQueries.quDefault);
			sql.append(",");
		}
		if ((AQueries.quUser == null)) {
			sql.append("QU_USER = default ,");
		}
		else {
			sql.append("QU_USER = ");
			sql.append(AQueries.quUser);
			sql.append(",");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("QU_ID = ");
		sql.append(AQueries.quId);
		sql.append(appendConditionSql);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @param AppendSql 附加的Sql语句
	 * @return 查询结果
	 */
	public static List<Queries> selectObjects(IDataVisit2 ADataVisit, String AppendSql) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((Queries.getSelectSql() 
						+ (" from [QUERIES] " + AppendSql)));
		List<Queries> list = new ArrayList<Queries>();
		try {
			for (; reader.next(); ) {
				Queries obj = new Queries();
				Queries.readValue(reader, obj);
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
	public static List<Queries> selectObjects(IDataVisit2 ADataVisit) throws SQLException {
		return Queries.selectObjects(ADataVisit, "");
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
	public static List<Queries> selectObjects(IDataVisit2 ADataVisit, String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((Queries.getSelectSql() 
						+ (" from [QUERIES] " + AppendSql)), pageIndex, rowsOfPage, orderField, order);
		List<Queries> list = new ArrayList<Queries>();
		try {
			for (; reader.next(); ) {
				Queries obj = new Queries();
				Queries.readValue(reader, obj);
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
	public static List<Queries> selectObjects(IDataVisit2 ADataVisit, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		return Queries.selectObjects(ADataVisit, "", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 从数据表QUERIES中查询一个实体对象
	 * @param ADataVisit 数据访问接口
	 * @param Int32 
	 */
	public static Queries SelectByQuId(IDataVisit2 ADataVisit, int AQuId) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append(" where ");
		sql.append("QU_ID = ");
		sql.append(AQuId);
		List<Queries> list = Queries.selectObjects(ADataVisit, sql.toString());
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
			Queries o = ((Queries)(obj));
			this.quId = o.quId;
			this.quDesc = o.quDesc;
			this.quSql = o.quSql;
			this.quDefault = o.quDefault;
			this.quUser = o.quUser;
		}
	}
	
	/**
	 * 复制值到给定的对象,要求目标对象是子类
	 * @param object 目标对象
	 */
	public void assignTo(BaseTable obj) {
		super.assignTo(obj);
		if (this.getClass().isInstance(obj)) {
			Queries o = ((Queries)(obj));
			o.quId = this.quId;
			o.quDesc = this.quDesc;
			o.quSql = this.quSql;
			o.quDefault = this.quDefault;
			o.quUser = this.quUser;
		}
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * <@param appendSql 附加的条件语句>
	 */
	public static void deleteByQuId(IDataVisit2 ADataVisit, int AQuId, String appendSql) throws SQLException, DbException {
		String sql = "";
		sql = (sql + " delete from QUERIES where ");
		sql = (sql + "QU_ID = ");
		sql = (sql + AQuId);
		sql = (sql + appendSql);
		ADataVisit.execSql(sql);
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 */
	public static void deleteByQuId(IDataVisit2 ADataVisit, int AQuId) throws SQLException, DbException {
		Queries.deleteByQuId(ADataVisit, AQuId, "");
	}
	
	/**
	 * 把ResultSet中的数据转到对象中
	 * @param AReader 数据源
	 * @param AQueries 目标对象
	 * @return 
	 */
	public static void readValue(ResultSet AReader, Queries AQueries) throws SQLException {
		AQueries.quId = AReader.getInt(1);
		AQueries.quDesc = AReader.getString(2);
		AQueries.quSql = AReader.getString(3);
		AQueries.quDefault = AReader.getInt(4);
		if (AReader.wasNull()) {
			AQueries.quDefault = null;
		}
		AQueries.quUser = AReader.getInt(5);
		if (AReader.wasNull()) {
			AQueries.quUser = null;
		}
	}
}
