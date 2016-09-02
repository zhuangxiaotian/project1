package cn.topdeep.projgroup.entity.bugtracker;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import java.sql.*;
/**
 * REPORTS: 
 */
public class Reports extends common.dbvisit.BaseTable {
	
	/**
	 * RP_ID: 
	 */
	private int rpId;
	
	/**
	 * RP_DESC: 
	 */
	private String rpDesc = "";
	
	/**
	 * RP_SQL: 
	 */
	private String rpSql = "";
	
	/**
	 * RP_CHART_TYPE: 
	 */
	private String rpChartType = "";
	
	/**
	 * RP_ID: 
	 */
	public int getRpId() {
		return this.rpId;
	}
	
	/**
	 * RP_ID: 
	 */
	public void setRpId(int value)
	 {
		this.rpId = value;
	}
	
	/**
	 * RP_DESC: 
	 */
	public String getRpDesc() {
		return this.rpDesc;
	}
	
	/**
	 * RP_DESC: 
	 */
	public void setRpDesc(String value)
	 {
		this.rpDesc = value;
	}
	
	/**
	 * RP_SQL: 
	 */
	public String getRpSql() {
		return this.rpSql;
	}
	
	/**
	 * RP_SQL: 
	 */
	public void setRpSql(String value)
	 {
		this.rpSql = value;
	}
	
	/**
	 * RP_CHART_TYPE: 
	 */
	public String getRpChartType() {
		return this.rpChartType;
	}
	
	/**
	 * RP_CHART_TYPE: 
	 */
	public void setRpChartType(String value)
	 {
		this.rpChartType = value;
	}
	
	public static String getSelectSql() {
		return "select [REPORTS].[RP_ID],[REPORTS].[RP_DESC],[REPORTS].[RP_SQL],[REPORTS].[RP_CHA" +
"RT_TYPE] ";
	}
	
	
	/**
	 * 插入一个对象到数据库中
	 * @param ADataVisit 数据访问接口
	 * @param Reports 需要插入的新对象
	 */
	public static void insert(IDataVisit2 ADataVisit, Reports AReports) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("insert into [REPORTS] (");
		sql.append("[REPORTS].[RP_DESC],");
		sql.append("[REPORTS].[RP_SQL],");
		sql.append("[REPORTS].[RP_CHART_TYPE],");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(") values (");
		sql.append(SqlServerUtils.safeSql(AReports.rpDesc.toString()));
		sql.append(",");
		sql.append(SqlServerUtils.safeSql(AReports.rpSql.toString()));
		sql.append(",");
		sql.append(SqlServerUtils.safeSql(AReports.rpChartType.toString()));
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(")");
		ADataVisit.beginTransaction();
		try {
			ADataVisit.execSql(sql.toString());
			AReports.rpId = ((int)(((double)(ADataVisit.getIDentity()))));
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
	 * @param Reports 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, Reports AReports) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("REPORTS set ");
		sql.append("RP_DESC = ");
		sql.append(SqlServerUtils.safeSql(AReports.rpDesc.toString()));
		sql.append(",");
		sql.append("RP_SQL = ");
		sql.append(SqlServerUtils.safeSql(AReports.rpSql.toString()));
		sql.append(",");
		sql.append("RP_CHART_TYPE = ");
		sql.append(SqlServerUtils.safeSql(AReports.rpChartType.toString()));
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("RP_ID = ");
		sql.append(AReports.rpId);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param Reports 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, Reports AReports, String appendConditionSql) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("REPORTS set ");
		sql.append("RP_DESC = ");
		sql.append(SqlServerUtils.safeSql(AReports.rpDesc.toString()));
		sql.append(",");
		sql.append("RP_SQL = ");
		sql.append(SqlServerUtils.safeSql(AReports.rpSql.toString()));
		sql.append(",");
		sql.append("RP_CHART_TYPE = ");
		sql.append(SqlServerUtils.safeSql(AReports.rpChartType.toString()));
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("RP_ID = ");
		sql.append(AReports.rpId);
		sql.append(appendConditionSql);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @param AppendSql 附加的Sql语句
	 * @return 查询结果
	 */
	public static List<Reports> selectObjects(IDataVisit2 ADataVisit, String AppendSql) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((Reports.getSelectSql() 
						+ (" from [REPORTS] " + AppendSql)));
		List<Reports> list = new ArrayList<Reports>();
		try {
			for (; reader.next(); ) {
				Reports obj = new Reports();
				Reports.readValue(reader, obj);
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
	public static List<Reports> selectObjects(IDataVisit2 ADataVisit) throws SQLException {
		return Reports.selectObjects(ADataVisit, "");
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
	public static List<Reports> selectObjects(IDataVisit2 ADataVisit, String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((Reports.getSelectSql() 
						+ (" from [REPORTS] " + AppendSql)), pageIndex, rowsOfPage, orderField, order);
		List<Reports> list = new ArrayList<Reports>();
		try {
			for (; reader.next(); ) {
				Reports obj = new Reports();
				Reports.readValue(reader, obj);
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
	public static List<Reports> selectObjects(IDataVisit2 ADataVisit, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		return Reports.selectObjects(ADataVisit, "", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 从数据表REPORTS中查询一个实体对象
	 * @param ADataVisit 数据访问接口
	 * @param Int32 
	 */
	public static Reports SelectByRpId(IDataVisit2 ADataVisit, int ARpId) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append(" where ");
		sql.append("RP_ID = ");
		sql.append(ARpId);
		List<Reports> list = Reports.selectObjects(ADataVisit, sql.toString());
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
			Reports o = ((Reports)(obj));
			this.rpId = o.rpId;
			this.rpDesc = o.rpDesc;
			this.rpSql = o.rpSql;
			this.rpChartType = o.rpChartType;
		}
	}
	
	/**
	 * 复制值到给定的对象,要求目标对象是子类
	 * @param object 目标对象
	 */
	public void assignTo(BaseTable obj) {
		super.assignTo(obj);
		if (this.getClass().isInstance(obj)) {
			Reports o = ((Reports)(obj));
			o.rpId = this.rpId;
			o.rpDesc = this.rpDesc;
			o.rpSql = this.rpSql;
			o.rpChartType = this.rpChartType;
		}
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * <@param appendSql 附加的条件语句>
	 */
	public static void deleteByRpId(IDataVisit2 ADataVisit, int ARpId, String appendSql) throws SQLException, DbException {
		String sql = "";
		sql = (sql + " delete from REPORTS where ");
		sql = (sql + "RP_ID = ");
		sql = (sql + ARpId);
		sql = (sql + appendSql);
		ADataVisit.execSql(sql);
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 */
	public static void deleteByRpId(IDataVisit2 ADataVisit, int ARpId) throws SQLException, DbException {
		Reports.deleteByRpId(ADataVisit, ARpId, "");
	}
	
	/**
	 * 把ResultSet中的数据转到对象中
	 * @param AReader 数据源
	 * @param AReports 目标对象
	 * @return 
	 */
	public static void readValue(ResultSet AReader, Reports AReports) throws SQLException {
		AReports.rpId = AReader.getInt(1);
		AReports.rpDesc = AReader.getString(2);
		AReports.rpSql = AReader.getString(3);
		AReports.rpChartType = AReader.getString(4);
	}
}
