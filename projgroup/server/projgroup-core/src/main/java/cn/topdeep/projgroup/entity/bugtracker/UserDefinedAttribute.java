package cn.topdeep.projgroup.entity.bugtracker;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import java.sql.*;
/**
 * USER_DEFINED_ATTRIBUTE: 
 */
public class UserDefinedAttribute extends common.dbvisit.BaseTable {
	
	/**
	 * UDF_ID: 
	 */
	private int udfId;
	
	/**
	 * UDF_NAME: 
	 */
	private String udfName = "";
	
	/**
	 * UDF_SORT_SEQ: 
	 */
	private int udfSortSeq;
	
	/**
	 * UDF_DEFAULT: 
	 */
	private int udfDefault;
	
	/**
	 * UDF_ID: 
	 */
	public int getUdfId() {
		return this.udfId;
	}
	
	/**
	 * UDF_ID: 
	 */
	public void setUdfId(int value)
	 {
		this.udfId = value;
	}
	
	/**
	 * UDF_NAME: 
	 */
	public String getUdfName() {
		return this.udfName;
	}
	
	/**
	 * UDF_NAME: 
	 */
	public void setUdfName(String value)
	 {
		this.udfName = value;
	}
	
	/**
	 * UDF_SORT_SEQ: 
	 */
	public int getUdfSortSeq() {
		return this.udfSortSeq;
	}
	
	/**
	 * UDF_SORT_SEQ: 
	 */
	public void setUdfSortSeq(int value)
	 {
		this.udfSortSeq = value;
	}
	
	/**
	 * UDF_DEFAULT: 
	 */
	public int getUdfDefault() {
		return this.udfDefault;
	}
	
	/**
	 * UDF_DEFAULT: 
	 */
	public void setUdfDefault(int value)
	 {
		this.udfDefault = value;
	}
	
	public static String getSelectSql() {
		return "select [USER_DEFINED_ATTRIBUTE].[UDF_ID],[USER_DEFINED_ATTRIBUTE].[UDF_NAME],[USE" +
"R_DEFINED_ATTRIBUTE].[UDF_SORT_SEQ],[USER_DEFINED_ATTRIBUTE].[UDF_DEFAULT] ";
	}
	
	
	/**
	 * 插入一个对象到数据库中
	 * @param ADataVisit 数据访问接口
	 * @param UserDefinedAttribute 需要插入的新对象
	 */
	public static void insert(IDataVisit2 ADataVisit, UserDefinedAttribute AUserDefinedAttribute) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("insert into [USER_DEFINED_ATTRIBUTE] (");
		sql.append("[USER_DEFINED_ATTRIBUTE].[UDF_NAME],");
		sql.append("[USER_DEFINED_ATTRIBUTE].[UDF_SORT_SEQ],");
		sql.append("[USER_DEFINED_ATTRIBUTE].[UDF_DEFAULT],");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(") values (");
		sql.append(SqlServerUtils.safeSql(AUserDefinedAttribute.udfName.toString()));
		sql.append(",");
		sql.append(AUserDefinedAttribute.udfSortSeq);
		sql.append(",");
		sql.append(AUserDefinedAttribute.udfDefault);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(")");
		ADataVisit.beginTransaction();
		try {
			ADataVisit.execSql(sql.toString());
			AUserDefinedAttribute.udfId = ((int)(((double)(ADataVisit.getIDentity()))));
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
	 * @param UserDefinedAttribute 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, UserDefinedAttribute AUserDefinedAttribute) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("USER_DEFINED_ATTRIBUTE set ");
		sql.append("UDF_NAME = ");
		sql.append(SqlServerUtils.safeSql(AUserDefinedAttribute.udfName.toString()));
		sql.append(",");
		sql.append("UDF_SORT_SEQ = ");
		sql.append(AUserDefinedAttribute.udfSortSeq);
		sql.append(",");
		sql.append("UDF_DEFAULT = ");
		sql.append(AUserDefinedAttribute.udfDefault);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("UDF_ID = ");
		sql.append(AUserDefinedAttribute.udfId);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param UserDefinedAttribute 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, UserDefinedAttribute AUserDefinedAttribute, String appendConditionSql) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("USER_DEFINED_ATTRIBUTE set ");
		sql.append("UDF_NAME = ");
		sql.append(SqlServerUtils.safeSql(AUserDefinedAttribute.udfName.toString()));
		sql.append(",");
		sql.append("UDF_SORT_SEQ = ");
		sql.append(AUserDefinedAttribute.udfSortSeq);
		sql.append(",");
		sql.append("UDF_DEFAULT = ");
		sql.append(AUserDefinedAttribute.udfDefault);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("UDF_ID = ");
		sql.append(AUserDefinedAttribute.udfId);
		sql.append(appendConditionSql);
		return ADataVisit.execSql(sql.toString());
	}
	
	public String toString() {
		return this.udfName.toString();
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @param AppendSql 附加的Sql语句
	 * @return 查询结果
	 */
	public static List<UserDefinedAttribute> selectObjects(IDataVisit2 ADataVisit, String AppendSql) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((UserDefinedAttribute.getSelectSql() 
						+ (" from [USER_DEFINED_ATTRIBUTE] " + AppendSql)));
		List<UserDefinedAttribute> list = new ArrayList<UserDefinedAttribute>();
		try {
			for (; reader.next(); ) {
				UserDefinedAttribute obj = new UserDefinedAttribute();
				UserDefinedAttribute.readValue(reader, obj);
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
	public static List<UserDefinedAttribute> selectObjects(IDataVisit2 ADataVisit) throws SQLException {
		return UserDefinedAttribute.selectObjects(ADataVisit, "");
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
	public static List<UserDefinedAttribute> selectObjects(IDataVisit2 ADataVisit, String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((UserDefinedAttribute.getSelectSql() 
						+ (" from [USER_DEFINED_ATTRIBUTE] " + AppendSql)), pageIndex, rowsOfPage, orderField, order);
		List<UserDefinedAttribute> list = new ArrayList<UserDefinedAttribute>();
		try {
			for (; reader.next(); ) {
				UserDefinedAttribute obj = new UserDefinedAttribute();
				UserDefinedAttribute.readValue(reader, obj);
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
	public static List<UserDefinedAttribute> selectObjects(IDataVisit2 ADataVisit, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		return UserDefinedAttribute.selectObjects(ADataVisit, "", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 从数据表USER_DEFINED_ATTRIBUTE中查询一个实体对象
	 * @param ADataVisit 数据访问接口
	 * @param Int32 
	 */
	public static UserDefinedAttribute SelectByUdfId(IDataVisit2 ADataVisit, int AUdfId) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append(" where ");
		sql.append("UDF_ID = ");
		sql.append(AUdfId);
		List<UserDefinedAttribute> list = UserDefinedAttribute.selectObjects(ADataVisit, sql.toString());
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
			UserDefinedAttribute o = ((UserDefinedAttribute)(obj));
			this.udfId = o.udfId;
			this.udfName = o.udfName;
			this.udfSortSeq = o.udfSortSeq;
			this.udfDefault = o.udfDefault;
		}
	}
	
	/**
	 * 复制值到给定的对象,要求目标对象是子类
	 * @param object 目标对象
	 */
	public void assignTo(BaseTable obj) {
		super.assignTo(obj);
		if (this.getClass().isInstance(obj)) {
			UserDefinedAttribute o = ((UserDefinedAttribute)(obj));
			o.udfId = this.udfId;
			o.udfName = this.udfName;
			o.udfSortSeq = this.udfSortSeq;
			o.udfDefault = this.udfDefault;
		}
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * <@param appendSql 附加的条件语句>
	 */
	public static void deleteByUdfId(IDataVisit2 ADataVisit, int AUdfId, String appendSql) throws SQLException, DbException {
		String sql = "";
		sql = (sql + " delete from USER_DEFINED_ATTRIBUTE where ");
		sql = (sql + "UDF_ID = ");
		sql = (sql + AUdfId);
		sql = (sql + appendSql);
		ADataVisit.execSql(sql);
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 */
	public static void deleteByUdfId(IDataVisit2 ADataVisit, int AUdfId) throws SQLException, DbException {
		UserDefinedAttribute.deleteByUdfId(ADataVisit, AUdfId, "");
	}
	
	/**
	 * 把ResultSet中的数据转到对象中
	 * @param AReader 数据源
	 * @param AUserDefinedAttribute 目标对象
	 * @return 
	 */
	public static void readValue(ResultSet AReader, UserDefinedAttribute AUserDefinedAttribute) throws SQLException {
		AUserDefinedAttribute.udfId = AReader.getInt(1);
		AUserDefinedAttribute.udfName = AReader.getString(2);
		AUserDefinedAttribute.udfSortSeq = AReader.getInt(3);
		AUserDefinedAttribute.udfDefault = AReader.getInt(4);
	}
}
