package cn.topdeep.projgroup.entity.bugtracker;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import java.sql.*;
/**
 * SESSIONS: 
 */
public class Sessions extends common.dbvisit.BaseTable {
	
	/**
	 * SE_ID: 
	 */
	private String seId = "";
	
	/**
	 * SE_DATE: 
	 */
	private java.util.Date seDate;
	
	/**
	 * SE_USER: 
	 */
	private int seUser;
	
	/**
	 * SE_ID: 
	 */
	public String getSeId() {
		return this.seId;
	}
	
	/**
	 * SE_ID: 
	 */
	public void setSeId(String value)
	 {
		this.seId = value;
	}
	
	/**
	 * SE_DATE: 
	 */
	public java.util.Date getSeDate() {
		return this.seDate;
	}
	
	/**
	 * SE_DATE: 
	 */
	public void setSeDate(java.util.Date value)
	 {
		this.seDate = value;
	}
	
	/**
	 * SE_USER: 
	 */
	public int getSeUser() {
		return this.seUser;
	}
	
	/**
	 * SE_USER: 
	 */
	public void setSeUser(int value)
	 {
		this.seUser = value;
	}
	
	public static String getSelectSql() {
		return "select [SESSIONS].[SE_ID],[SESSIONS].[SE_DATE],[SESSIONS].[SE_USER] ";
	}
	
	
	/**
	 * 插入一个对象到数据库中
	 * @param ADataVisit 数据访问接口
	 * @param Sessions 需要插入的新对象
	 */
	public static void insert(IDataVisit2 ADataVisit, Sessions ASessions) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("insert into [SESSIONS] (");
		sql.append("[SESSIONS].[SE_ID],");
		sql.append("[SESSIONS].[SE_DATE],");
		sql.append("[SESSIONS].[SE_USER],");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(") values (");
		sql.append(SqlServerUtils.safeSql(ASessions.seId.toString()));
		sql.append(",");
		sql.append(SqlServerUtils.getDateSql(ASessions.seDate));
		sql.append(",");
		sql.append(ASessions.seUser);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(")");
		ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param Sessions 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, Sessions ASessions) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("SESSIONS set ");
		sql.append("SE_ID = ");
		sql.append(SqlServerUtils.safeSql(ASessions.seId.toString()));
		sql.append(",");
		sql.append("SE_DATE = ");
		sql.append(SqlServerUtils.getDateSql(ASessions.seDate));
		sql.append(",");
		sql.append("SE_USER = ");
		sql.append(ASessions.seUser);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param Sessions 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, Sessions ASessions, String appendConditionSql) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("SESSIONS set ");
		sql.append("SE_ID = ");
		sql.append(SqlServerUtils.safeSql(ASessions.seId.toString()));
		sql.append(",");
		sql.append("SE_DATE = ");
		sql.append(SqlServerUtils.getDateSql(ASessions.seDate));
		sql.append(",");
		sql.append("SE_USER = ");
		sql.append(ASessions.seUser);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append(appendConditionSql);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @param AppendSql 附加的Sql语句
	 * @return 查询结果
	 */
	public static List<Sessions> selectObjects(IDataVisit2 ADataVisit, String AppendSql) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((Sessions.getSelectSql() 
						+ (" from [SESSIONS] " + AppendSql)));
		List<Sessions> list = new ArrayList<Sessions>();
		try {
			for (; reader.next(); ) {
				Sessions obj = new Sessions();
				Sessions.readValue(reader, obj);
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
	public static List<Sessions> selectObjects(IDataVisit2 ADataVisit) throws SQLException {
		return Sessions.selectObjects(ADataVisit, "");
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
	public static List<Sessions> selectObjects(IDataVisit2 ADataVisit, String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((Sessions.getSelectSql() 
						+ (" from [SESSIONS] " + AppendSql)), pageIndex, rowsOfPage, orderField, order);
		List<Sessions> list = new ArrayList<Sessions>();
		try {
			for (; reader.next(); ) {
				Sessions obj = new Sessions();
				Sessions.readValue(reader, obj);
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
	public static List<Sessions> selectObjects(IDataVisit2 ADataVisit, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		return Sessions.selectObjects(ADataVisit, "", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * @param object 源对象
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (this.getClass().isInstance(obj)) {
			Sessions o = ((Sessions)(obj));
			this.seId = o.seId;
			this.seDate = o.seDate;
			this.seUser = o.seUser;
		}
	}
	
	/**
	 * 复制值到给定的对象,要求目标对象是子类
	 * @param object 目标对象
	 */
	public void assignTo(BaseTable obj) {
		super.assignTo(obj);
		if (this.getClass().isInstance(obj)) {
			Sessions o = ((Sessions)(obj));
			o.seId = this.seId;
			o.seDate = this.seDate;
			o.seUser = this.seUser;
		}
	}
	
	/**
	 * 把ResultSet中的数据转到对象中
	 * @param AReader 数据源
	 * @param ASessions 目标对象
	 * @return 
	 */
	public static void readValue(ResultSet AReader, Sessions ASessions) throws SQLException {
		ASessions.seId = AReader.getString(1);
		ASessions.seDate = SqlUtils.getDate(AReader, 2);
		ASessions.seUser = AReader.getInt(3);
	}
}
