package cn.topdeep.projgroup.entity.bugtracker;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import java.sql.*;
/**
 * BUG_RELATIONSHIPS: 
 */
public class BugRelationships extends common.dbvisit.BaseTable {
	
	/**
	 * RE_ID: 
	 */
	private int reId;
	
	/**
	 * RE_BUG1: 
	 */
	private int reBug1;
	
	/**
	 * RE_BUG2: 
	 */
	private int reBug2;
	
	/**
	 * RE_TYPE: 
	 */
	private String reType;
	
	/**
	 * RE_ID: 
	 */
	public int getReId() {
		return this.reId;
	}
	
	/**
	 * RE_ID: 
	 */
	public void setReId(int value)
	 {
		this.reId = value;
	}
	
	/**
	 * RE_BUG1: 
	 */
	public int getReBug1() {
		return this.reBug1;
	}
	
	/**
	 * RE_BUG1: 
	 */
	public void setReBug1(int value)
	 {
		this.reBug1 = value;
	}
	
	/**
	 * RE_BUG2: 
	 */
	public int getReBug2() {
		return this.reBug2;
	}
	
	/**
	 * RE_BUG2: 
	 */
	public void setReBug2(int value)
	 {
		this.reBug2 = value;
	}
	
	/**
	 * RE_TYPE: 
	 */
	public String getReType() {
		return this.reType;
	}
	
	/**
	 * RE_TYPE: 
	 */
	public void setReType(String value)
	 {
		this.reType = value;
	}
	
	public static String getSelectSql() {
		return "select [BUG_RELATIONSHIPS].[RE_ID],[BUG_RELATIONSHIPS].[RE_BUG1],[BUG_RELATIONSHI" +
"PS].[RE_BUG2],[BUG_RELATIONSHIPS].[RE_TYPE] ";
	}
	
	
	/**
	 * 插入一个对象到数据库中
	 * @param ADataVisit 数据访问接口
	 * @param BugRelationships 需要插入的新对象
	 */
	public static void insert(IDataVisit2 ADataVisit, BugRelationships ABugRelationships) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("insert into [BUG_RELATIONSHIPS] (");
		sql.append("[BUG_RELATIONSHIPS].[RE_BUG1],");
		sql.append("[BUG_RELATIONSHIPS].[RE_BUG2],");
		if ((ABugRelationships.reType == null)) {
		}
		else {
			sql.append("[BUG_RELATIONSHIPS].[RE_TYPE],");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(") values (");
		sql.append(ABugRelationships.reBug1);
		sql.append(",");
		sql.append(ABugRelationships.reBug2);
		sql.append(",");
		if ((ABugRelationships.reType == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(ABugRelationships.reType.toString()));
			sql.append(",");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(")");
		ADataVisit.beginTransaction();
		try {
			ADataVisit.execSql(sql.toString());
			ABugRelationships.reId = ((int)(((double)(ADataVisit.getIDentity()))));
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
	 * @param BugRelationships 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, BugRelationships ABugRelationships) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("BUG_RELATIONSHIPS set ");
		sql.append("RE_BUG1 = ");
		sql.append(ABugRelationships.reBug1);
		sql.append(",");
		sql.append("RE_BUG2 = ");
		sql.append(ABugRelationships.reBug2);
		sql.append(",");
		if ((ABugRelationships.reType == null)) {
			sql.append("RE_TYPE = default ,");
		}
		else {
			sql.append("RE_TYPE = ");
			sql.append(SqlServerUtils.safeSql(ABugRelationships.reType.toString()));
			sql.append(",");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("RE_ID = ");
		sql.append(ABugRelationships.reId);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param BugRelationships 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, BugRelationships ABugRelationships, String appendConditionSql) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("BUG_RELATIONSHIPS set ");
		sql.append("RE_BUG1 = ");
		sql.append(ABugRelationships.reBug1);
		sql.append(",");
		sql.append("RE_BUG2 = ");
		sql.append(ABugRelationships.reBug2);
		sql.append(",");
		if ((ABugRelationships.reType == null)) {
			sql.append("RE_TYPE = default ,");
		}
		else {
			sql.append("RE_TYPE = ");
			sql.append(SqlServerUtils.safeSql(ABugRelationships.reType.toString()));
			sql.append(",");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("RE_ID = ");
		sql.append(ABugRelationships.reId);
		sql.append(appendConditionSql);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @param AppendSql 附加的Sql语句
	 * @return 查询结果
	 */
	public static List<BugRelationships> selectObjects(IDataVisit2 ADataVisit, String AppendSql) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((BugRelationships.getSelectSql() 
						+ (" from [BUG_RELATIONSHIPS] " + AppendSql)));
		List<BugRelationships> list = new ArrayList<BugRelationships>();
		try {
			for (; reader.next(); ) {
				BugRelationships obj = new BugRelationships();
				BugRelationships.readValue(reader, obj);
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
	public static List<BugRelationships> selectObjects(IDataVisit2 ADataVisit) throws SQLException {
		return BugRelationships.selectObjects(ADataVisit, "");
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
	public static List<BugRelationships> selectObjects(IDataVisit2 ADataVisit, String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((BugRelationships.getSelectSql() 
						+ (" from [BUG_RELATIONSHIPS] " + AppendSql)), pageIndex, rowsOfPage, orderField, order);
		List<BugRelationships> list = new ArrayList<BugRelationships>();
		try {
			for (; reader.next(); ) {
				BugRelationships obj = new BugRelationships();
				BugRelationships.readValue(reader, obj);
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
	public static List<BugRelationships> selectObjects(IDataVisit2 ADataVisit, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		return BugRelationships.selectObjects(ADataVisit, "", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 从数据表BUG_RELATIONSHIPS中查询一个实体对象
	 * @param ADataVisit 数据访问接口
	 * @param Int32 
	 */
	public static BugRelationships SelectByReId(IDataVisit2 ADataVisit, int AReId) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append(" where ");
		sql.append("RE_ID = ");
		sql.append(AReId);
		List<BugRelationships> list = BugRelationships.selectObjects(ADataVisit, sql.toString());
		if ((list.size() > 0)) {
			return list.get(0);
		}
		else {
			return null;
		}
	}
	
	/**
	 * 从数据表BUG_RELATIONSHIPS中查询一个实体对象
	 * @param ADataVisit 数据访问接口
	 * @param Int32 
	 * @param Int32 
	 */
	public static BugRelationships SelectByReBug1ReBug2(IDataVisit2 ADataVisit, int AReBug1, int AReBug2) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append(" where ");
		sql.append("RE_BUG1 = ");
		sql.append(AReBug1);
		sql.append(" and ");
		sql.append("RE_BUG2 = ");
		sql.append(AReBug2);
		List<BugRelationships> list = BugRelationships.selectObjects(ADataVisit, sql.toString());
		if ((list.size() > 0)) {
			return list.get(0);
		}
		else {
			return null;
		}
	}
	
	/**
	 * 从数据表BUG_RELATIONSHIPS中查询一个实体对象
	 * @param ADataVisit 数据访问接口
	 * @param Int32 
	 * @param Int32 
	 */
	public static BugRelationships SelectByReBug2ReBug1(IDataVisit2 ADataVisit, int AReBug2, int AReBug1) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append(" where ");
		sql.append("RE_BUG2 = ");
		sql.append(AReBug2);
		sql.append(" and ");
		sql.append("RE_BUG1 = ");
		sql.append(AReBug1);
		List<BugRelationships> list = BugRelationships.selectObjects(ADataVisit, sql.toString());
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
			BugRelationships o = ((BugRelationships)(obj));
			this.reId = o.reId;
			this.reBug1 = o.reBug1;
			this.reBug2 = o.reBug2;
			this.reType = o.reType;
		}
	}
	
	/**
	 * 复制值到给定的对象,要求目标对象是子类
	 * @param object 目标对象
	 */
	public void assignTo(BaseTable obj) {
		super.assignTo(obj);
		if (this.getClass().isInstance(obj)) {
			BugRelationships o = ((BugRelationships)(obj));
			o.reId = this.reId;
			o.reBug1 = this.reBug1;
			o.reBug2 = this.reBug2;
			o.reType = this.reType;
		}
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * <@param appendSql 附加的条件语句>
	 */
	public static void deleteByReId(IDataVisit2 ADataVisit, int AReId, String appendSql) throws SQLException, DbException {
		String sql = "";
		sql = (sql + " delete from BUG_RELATIONSHIPS where ");
		sql = (sql + "RE_ID = ");
		sql = (sql + AReId);
		sql = (sql + appendSql);
		ADataVisit.execSql(sql);
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 */
	public static void deleteByReId(IDataVisit2 ADataVisit, int AReId) throws SQLException, DbException {
		BugRelationships.deleteByReId(ADataVisit, AReId, "");
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * @param name=Int32
	 * <@param appendSql 附加的条件语句>
	 */
	public static void deleteByReBug1ReBug2(IDataVisit2 ADataVisit, int AReBug1, int AReBug2, String appendSql) throws SQLException, DbException {
		String sql = "";
		sql = (sql + " delete from BUG_RELATIONSHIPS where ");
		sql = (sql + "RE_BUG1 = ");
		sql = (sql + AReBug1);
		sql = (sql + " and ");
		sql = (sql + "RE_BUG2 = ");
		sql = (sql + AReBug2);
		sql = (sql + appendSql);
		ADataVisit.execSql(sql);
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * @param name=Int32
	 */
	public static void deleteByReBug1ReBug2(IDataVisit2 ADataVisit, int AReBug1, int AReBug2) throws SQLException, DbException {
		BugRelationships.deleteByReBug1ReBug2(ADataVisit, AReBug1, AReBug2, "");
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * @param name=Int32
	 * <@param appendSql 附加的条件语句>
	 */
	public static void deleteByReBug2ReBug1(IDataVisit2 ADataVisit, int AReBug2, int AReBug1, String appendSql) throws SQLException, DbException {
		String sql = "";
		sql = (sql + " delete from BUG_RELATIONSHIPS where ");
		sql = (sql + "RE_BUG2 = ");
		sql = (sql + AReBug2);
		sql = (sql + " and ");
		sql = (sql + "RE_BUG1 = ");
		sql = (sql + AReBug1);
		sql = (sql + appendSql);
		ADataVisit.execSql(sql);
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * @param name=Int32
	 */
	public static void deleteByReBug2ReBug1(IDataVisit2 ADataVisit, int AReBug2, int AReBug1) throws SQLException, DbException {
		BugRelationships.deleteByReBug2ReBug1(ADataVisit, AReBug2, AReBug1, "");
	}
	
	/**
	 * 把ResultSet中的数据转到对象中
	 * @param AReader 数据源
	 * @param ABugRelationships 目标对象
	 * @return 
	 */
	public static void readValue(ResultSet AReader, BugRelationships ABugRelationships) throws SQLException {
		ABugRelationships.reId = AReader.getInt(1);
		ABugRelationships.reBug1 = AReader.getInt(2);
		ABugRelationships.reBug2 = AReader.getInt(3);
		ABugRelationships.reType = AReader.getString(4);
		if (AReader.wasNull()) {
			ABugRelationships.reType = null;
		}
	}
}
