package cn.topdeep.projgroup.entity.bugtracker;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import java.sql.*;
/**
 * STATUSES: 
 */
public class Statuses extends common.dbvisit.BaseTable {
	
	/**
	 * ST_ID: 
	 */
	private int stId;
	
	/**
	 * ST_NAME: 
	 */
	private String stName = "";
	
	/**
	 * ST_SORT_SEQ: 
	 */
	private int stSortSeq;
	
	/**
	 * ST_STYLE: 
	 */
	private String stStyle;
	
	/**
	 * ST_DEFAULT: 
	 */
	private int stDefault;
	
	/**
	 * ST_ID: 
	 */
	public int getStId() {
		return this.stId;
	}
	
	/**
	 * ST_ID: 
	 */
	public void setStId(int value)
	 {
		this.stId = value;
	}
	
	/**
	 * ST_NAME: 
	 */
	public String getStName() {
		return this.stName;
	}
	
	/**
	 * ST_NAME: 
	 */
	public void setStName(String value)
	 {
		this.stName = value;
	}
	
	/**
	 * ST_SORT_SEQ: 
	 */
	public int getStSortSeq() {
		return this.stSortSeq;
	}
	
	/**
	 * ST_SORT_SEQ: 
	 */
	public void setStSortSeq(int value)
	 {
		this.stSortSeq = value;
	}
	
	/**
	 * ST_STYLE: 
	 */
	public String getStStyle() {
		return this.stStyle;
	}
	
	/**
	 * ST_STYLE: 
	 */
	public void setStStyle(String value)
	 {
		this.stStyle = value;
	}
	
	/**
	 * ST_DEFAULT: 
	 */
	public int getStDefault() {
		return this.stDefault;
	}
	
	/**
	 * ST_DEFAULT: 
	 */
	public void setStDefault(int value)
	 {
		this.stDefault = value;
	}
	
	public static String getSelectSql() {
		return "select [STATUSES].[ST_ID],[STATUSES].[ST_NAME],[STATUSES].[ST_SORT_SEQ],[STATUSES" +
"].[ST_STYLE],[STATUSES].[ST_DEFAULT] ";
	}
	
	
	/**
	 * 插入一个对象到数据库中
	 * @param ADataVisit 数据访问接口
	 * @param Statuses 需要插入的新对象
	 */
	public static void insert(IDataVisit2 ADataVisit, Statuses AStatuses) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("insert into [STATUSES] (");
		sql.append("[STATUSES].[ST_NAME],");
		sql.append("[STATUSES].[ST_SORT_SEQ],");
		if ((AStatuses.stStyle == null)) {
		}
		else {
			sql.append("[STATUSES].[ST_STYLE],");
		}
		sql.append("[STATUSES].[ST_DEFAULT],");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(") values (");
		sql.append(SqlServerUtils.safeSql(AStatuses.stName.toString()));
		sql.append(",");
		sql.append(AStatuses.stSortSeq);
		sql.append(",");
		if ((AStatuses.stStyle == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(AStatuses.stStyle.toString()));
			sql.append(",");
		}
		sql.append(AStatuses.stDefault);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(")");
		ADataVisit.beginTransaction();
		try {
			ADataVisit.execSql(sql.toString());
			AStatuses.stId = ((int)(((double)(ADataVisit.getIDentity()))));
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
	 * @param Statuses 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, Statuses AStatuses) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("STATUSES set ");
		sql.append("ST_NAME = ");
		sql.append(SqlServerUtils.safeSql(AStatuses.stName.toString()));
		sql.append(",");
		sql.append("ST_SORT_SEQ = ");
		sql.append(AStatuses.stSortSeq);
		sql.append(",");
		if ((AStatuses.stStyle == null)) {
			sql.append("ST_STYLE = default ,");
		}
		else {
			sql.append("ST_STYLE = ");
			sql.append(SqlServerUtils.safeSql(AStatuses.stStyle.toString()));
			sql.append(",");
		}
		sql.append("ST_DEFAULT = ");
		sql.append(AStatuses.stDefault);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("ST_ID = ");
		sql.append(AStatuses.stId);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param Statuses 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, Statuses AStatuses, String appendConditionSql) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("STATUSES set ");
		sql.append("ST_NAME = ");
		sql.append(SqlServerUtils.safeSql(AStatuses.stName.toString()));
		sql.append(",");
		sql.append("ST_SORT_SEQ = ");
		sql.append(AStatuses.stSortSeq);
		sql.append(",");
		if ((AStatuses.stStyle == null)) {
			sql.append("ST_STYLE = default ,");
		}
		else {
			sql.append("ST_STYLE = ");
			sql.append(SqlServerUtils.safeSql(AStatuses.stStyle.toString()));
			sql.append(",");
		}
		sql.append("ST_DEFAULT = ");
		sql.append(AStatuses.stDefault);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("ST_ID = ");
		sql.append(AStatuses.stId);
		sql.append(appendConditionSql);
		return ADataVisit.execSql(sql.toString());
	}
	
	public String toString() {
		return this.stName.toString();
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @param AppendSql 附加的Sql语句
	 * @return 查询结果
	 */
	public static List<Statuses> selectObjects(IDataVisit2 ADataVisit, String AppendSql) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((Statuses.getSelectSql() 
						+ (" from [STATUSES] " + AppendSql)));
		List<Statuses> list = new ArrayList<Statuses>();
		try {
			for (; reader.next(); ) {
				Statuses obj = new Statuses();
				Statuses.readValue(reader, obj);
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
	public static List<Statuses> selectObjects(IDataVisit2 ADataVisit) throws SQLException {
		return Statuses.selectObjects(ADataVisit, "");
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
	public static List<Statuses> selectObjects(IDataVisit2 ADataVisit, String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((Statuses.getSelectSql() 
						+ (" from [STATUSES] " + AppendSql)), pageIndex, rowsOfPage, orderField, order);
		List<Statuses> list = new ArrayList<Statuses>();
		try {
			for (; reader.next(); ) {
				Statuses obj = new Statuses();
				Statuses.readValue(reader, obj);
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
	public static List<Statuses> selectObjects(IDataVisit2 ADataVisit, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		return Statuses.selectObjects(ADataVisit, "", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 从数据表STATUSES中查询一个实体对象
	 * @param ADataVisit 数据访问接口
	 * @param Int32 
	 */
	public static Statuses SelectByStId(IDataVisit2 ADataVisit, int AStId) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append(" where ");
		sql.append("ST_ID = ");
		sql.append(AStId);
		List<Statuses> list = Statuses.selectObjects(ADataVisit, sql.toString());
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
			Statuses o = ((Statuses)(obj));
			this.stId = o.stId;
			this.stName = o.stName;
			this.stSortSeq = o.stSortSeq;
			this.stStyle = o.stStyle;
			this.stDefault = o.stDefault;
		}
	}
	
	/**
	 * 复制值到给定的对象,要求目标对象是子类
	 * @param object 目标对象
	 */
	public void assignTo(BaseTable obj) {
		super.assignTo(obj);
		if (this.getClass().isInstance(obj)) {
			Statuses o = ((Statuses)(obj));
			o.stId = this.stId;
			o.stName = this.stName;
			o.stSortSeq = this.stSortSeq;
			o.stStyle = this.stStyle;
			o.stDefault = this.stDefault;
		}
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * <@param appendSql 附加的条件语句>
	 */
	public static void deleteByStId(IDataVisit2 ADataVisit, int AStId, String appendSql) throws SQLException, DbException {
		String sql = "";
		sql = (sql + " delete from STATUSES where ");
		sql = (sql + "ST_ID = ");
		sql = (sql + AStId);
		sql = (sql + appendSql);
		ADataVisit.execSql(sql);
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 */
	public static void deleteByStId(IDataVisit2 ADataVisit, int AStId) throws SQLException, DbException {
		Statuses.deleteByStId(ADataVisit, AStId, "");
	}
	
	/**
	 * 把ResultSet中的数据转到对象中
	 * @param AReader 数据源
	 * @param AStatuses 目标对象
	 * @return 
	 */
	public static void readValue(ResultSet AReader, Statuses AStatuses) throws SQLException {
		AStatuses.stId = AReader.getInt(1);
		AStatuses.stName = AReader.getString(2);
		AStatuses.stSortSeq = AReader.getInt(3);
		AStatuses.stStyle = AReader.getString(4);
		if (AReader.wasNull()) {
			AStatuses.stStyle = null;
		}
		AStatuses.stDefault = AReader.getInt(5);
	}
}
