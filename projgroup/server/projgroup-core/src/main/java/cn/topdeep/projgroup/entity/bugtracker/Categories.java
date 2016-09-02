package cn.topdeep.projgroup.entity.bugtracker;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import java.sql.*;
/**
 * CATEGORIES: 
 */
public class Categories extends common.dbvisit.BaseTable {
	
	/**
	 * CT_ID: 
	 */
	private int ctId;
	
	/**
	 * CT_NAME: 
	 */
	private String ctName = "";
	
	/**
	 * CT_SORT_SEQ: 
	 */
	private int ctSortSeq;
	
	/**
	 * CT_DEFAULT: 
	 */
	private int ctDefault;
	
	/**
	 * CT_ID: 
	 */
	public int getCtId() {
		return this.ctId;
	}
	
	/**
	 * CT_ID: 
	 */
	public void setCtId(int value)
	 {
		this.ctId = value;
	}
	
	/**
	 * CT_NAME: 
	 */
	public String getCtName() {
		return this.ctName;
	}
	
	/**
	 * CT_NAME: 
	 */
	public void setCtName(String value)
	 {
		this.ctName = value;
	}
	
	/**
	 * CT_SORT_SEQ: 
	 */
	public int getCtSortSeq() {
		return this.ctSortSeq;
	}
	
	/**
	 * CT_SORT_SEQ: 
	 */
	public void setCtSortSeq(int value)
	 {
		this.ctSortSeq = value;
	}
	
	/**
	 * CT_DEFAULT: 
	 */
	public int getCtDefault() {
		return this.ctDefault;
	}
	
	/**
	 * CT_DEFAULT: 
	 */
	public void setCtDefault(int value)
	 {
		this.ctDefault = value;
	}
	
	public static String getSelectSql() {
		return "select [CATEGORIES].[CT_ID],[CATEGORIES].[CT_NAME],[CATEGORIES].[CT_SORT_SEQ],[CA" +
"TEGORIES].[CT_DEFAULT] ";
	}
	
	
	/**
	 * 插入一个对象到数据库中
	 * @param ADataVisit 数据访问接口
	 * @param Categories 需要插入的新对象
	 */
	public static void insert(IDataVisit2 ADataVisit, Categories ACategories) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("insert into [CATEGORIES] (");
		sql.append("[CATEGORIES].[CT_NAME],");
		sql.append("[CATEGORIES].[CT_SORT_SEQ],");
		sql.append("[CATEGORIES].[CT_DEFAULT],");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(") values (");
		sql.append(SqlServerUtils.safeSql(ACategories.ctName.toString()));
		sql.append(",");
		sql.append(ACategories.ctSortSeq);
		sql.append(",");
		sql.append(ACategories.ctDefault);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(")");
		ADataVisit.beginTransaction();
		try {
			ADataVisit.execSql(sql.toString());
			ACategories.ctId = ((int)(((double)(ADataVisit.getIDentity()))));
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
	 * @param Categories 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, Categories ACategories) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("CATEGORIES set ");
		sql.append("CT_NAME = ");
		sql.append(SqlServerUtils.safeSql(ACategories.ctName.toString()));
		sql.append(",");
		sql.append("CT_SORT_SEQ = ");
		sql.append(ACategories.ctSortSeq);
		sql.append(",");
		sql.append("CT_DEFAULT = ");
		sql.append(ACategories.ctDefault);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("CT_ID = ");
		sql.append(ACategories.ctId);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param Categories 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, Categories ACategories, String appendConditionSql) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("CATEGORIES set ");
		sql.append("CT_NAME = ");
		sql.append(SqlServerUtils.safeSql(ACategories.ctName.toString()));
		sql.append(",");
		sql.append("CT_SORT_SEQ = ");
		sql.append(ACategories.ctSortSeq);
		sql.append(",");
		sql.append("CT_DEFAULT = ");
		sql.append(ACategories.ctDefault);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("CT_ID = ");
		sql.append(ACategories.ctId);
		sql.append(appendConditionSql);
		return ADataVisit.execSql(sql.toString());
	}
	
	public String toString() {
		return this.ctName.toString();
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @param AppendSql 附加的Sql语句
	 * @return 查询结果
	 */
	public static List<Categories> selectObjects(IDataVisit2 ADataVisit, String AppendSql) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((Categories.getSelectSql() 
						+ (" from [CATEGORIES] " + AppendSql)));
		List<Categories> list = new ArrayList<Categories>();
		try {
			for (; reader.next(); ) {
				Categories obj = new Categories();
				Categories.readValue(reader, obj);
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
	public static List<Categories> selectObjects(IDataVisit2 ADataVisit) throws SQLException {
		return Categories.selectObjects(ADataVisit, "");
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
	public static List<Categories> selectObjects(IDataVisit2 ADataVisit, String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((Categories.getSelectSql() 
						+ (" from [CATEGORIES] " + AppendSql)), pageIndex, rowsOfPage, orderField, order);
		List<Categories> list = new ArrayList<Categories>();
		try {
			for (; reader.next(); ) {
				Categories obj = new Categories();
				Categories.readValue(reader, obj);
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
	public static List<Categories> selectObjects(IDataVisit2 ADataVisit, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		return Categories.selectObjects(ADataVisit, "", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 从数据表CATEGORIES中查询一个实体对象
	 * @param ADataVisit 数据访问接口
	 * @param Int32 
	 */
	public static Categories SelectByCtId(IDataVisit2 ADataVisit, int ACtId) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append(" where ");
		sql.append("CT_ID = ");
		sql.append(ACtId);
		List<Categories> list = Categories.selectObjects(ADataVisit, sql.toString());
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
			Categories o = ((Categories)(obj));
			this.ctId = o.ctId;
			this.ctName = o.ctName;
			this.ctSortSeq = o.ctSortSeq;
			this.ctDefault = o.ctDefault;
		}
	}
	
	/**
	 * 复制值到给定的对象,要求目标对象是子类
	 * @param object 目标对象
	 */
	public void assignTo(BaseTable obj) {
		super.assignTo(obj);
		if (this.getClass().isInstance(obj)) {
			Categories o = ((Categories)(obj));
			o.ctId = this.ctId;
			o.ctName = this.ctName;
			o.ctSortSeq = this.ctSortSeq;
			o.ctDefault = this.ctDefault;
		}
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * <@param appendSql 附加的条件语句>
	 */
	public static void deleteByCtId(IDataVisit2 ADataVisit, int ACtId, String appendSql) throws SQLException, DbException {
		String sql = "";
		sql = (sql + " delete from CATEGORIES where ");
		sql = (sql + "CT_ID = ");
		sql = (sql + ACtId);
		sql = (sql + appendSql);
		ADataVisit.execSql(sql);
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 */
	public static void deleteByCtId(IDataVisit2 ADataVisit, int ACtId) throws SQLException, DbException {
		Categories.deleteByCtId(ADataVisit, ACtId, "");
	}
	
	/**
	 * 把ResultSet中的数据转到对象中
	 * @param AReader 数据源
	 * @param ACategories 目标对象
	 * @return 
	 */
	public static void readValue(ResultSet AReader, Categories ACategories) throws SQLException {
		ACategories.ctId = AReader.getInt(1);
		ACategories.ctName = AReader.getString(2);
		ACategories.ctSortSeq = AReader.getInt(3);
		ACategories.ctDefault = AReader.getInt(4);
	}
}
