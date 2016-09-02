package cn.topdeep.projgroup.entity.bugtracker;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import java.sql.*;
/**
 * CUSTOM_COL_METADATA: 
 */
public class CustomColMetadata extends common.dbvisit.BaseTable {
	
	/**
	 * CCM_COLORDER: 
	 */
	private int ccmColorder;
	
	/**
	 * CCM_DROPDOWN_VALS: 
	 */
	private String ccmDropdownVals = "";
	
	/**
	 * CCM_SORT_SEQ: 
	 */
	private Integer ccmSortSeq;
	
	/**
	 * CCM_DROPDOWN_TYPE: 
	 */
	private String ccmDropdownType;
	
	/**
	 * CCM_COLORDER: 
	 */
	public int getCcmColorder() {
		return this.ccmColorder;
	}
	
	/**
	 * CCM_COLORDER: 
	 */
	public void setCcmColorder(int value)
	 {
		this.ccmColorder = value;
	}
	
	/**
	 * CCM_DROPDOWN_VALS: 
	 */
	public String getCcmDropdownVals() {
		return this.ccmDropdownVals;
	}
	
	/**
	 * CCM_DROPDOWN_VALS: 
	 */
	public void setCcmDropdownVals(String value)
	 {
		this.ccmDropdownVals = value;
	}
	
	/**
	 * CCM_SORT_SEQ: 
	 */
	public Integer getCcmSortSeq() {
		return this.ccmSortSeq;
	}
	
	/**
	 * CCM_SORT_SEQ: 
	 */
	public void setCcmSortSeq(Integer value)
	 {
		this.ccmSortSeq = value;
	}
	
	/**
	 * CCM_DROPDOWN_TYPE: 
	 */
	public String getCcmDropdownType() {
		return this.ccmDropdownType;
	}
	
	/**
	 * CCM_DROPDOWN_TYPE: 
	 */
	public void setCcmDropdownType(String value)
	 {
		this.ccmDropdownType = value;
	}
	
	public static String getSelectSql() {
		return "select [CUSTOM_COL_METADATA].[CCM_COLORDER],[CUSTOM_COL_METADATA].[CCM_DROPDOWN_V" +
"ALS],[CUSTOM_COL_METADATA].[CCM_SORT_SEQ],[CUSTOM_COL_METADATA].[CCM_DROPDOWN_TY" +
"PE] ";
	}
	
	
	/**
	 * 插入一个对象到数据库中
	 * @param ADataVisit 数据访问接口
	 * @param CustomColMetadata 需要插入的新对象
	 */
	public static void insert(IDataVisit2 ADataVisit, CustomColMetadata ACustomColMetadata) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("insert into [CUSTOM_COL_METADATA] (");
		sql.append("[CUSTOM_COL_METADATA].[CCM_COLORDER],");
		sql.append("[CUSTOM_COL_METADATA].[CCM_DROPDOWN_VALS],");
		if ((ACustomColMetadata.ccmSortSeq == null)) {
		}
		else {
			sql.append("[CUSTOM_COL_METADATA].[CCM_SORT_SEQ],");
		}
		if ((ACustomColMetadata.ccmDropdownType == null)) {
		}
		else {
			sql.append("[CUSTOM_COL_METADATA].[CCM_DROPDOWN_TYPE],");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(") values (");
		sql.append(ACustomColMetadata.ccmColorder);
		sql.append(",");
		sql.append(SqlServerUtils.safeSql(ACustomColMetadata.ccmDropdownVals.toString()));
		sql.append(",");
		if ((ACustomColMetadata.ccmSortSeq == null)) {
		}
		else {
			sql.append(ACustomColMetadata.ccmSortSeq);
			sql.append(",");
		}
		if ((ACustomColMetadata.ccmDropdownType == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(ACustomColMetadata.ccmDropdownType.toString()));
			sql.append(",");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(")");
		ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param CustomColMetadata 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, CustomColMetadata ACustomColMetadata) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("CUSTOM_COL_METADATA set ");
		sql.append("CCM_COLORDER = ");
		sql.append(ACustomColMetadata.ccmColorder);
		sql.append(",");
		sql.append("CCM_DROPDOWN_VALS = ");
		sql.append(SqlServerUtils.safeSql(ACustomColMetadata.ccmDropdownVals.toString()));
		sql.append(",");
		if ((ACustomColMetadata.ccmSortSeq == null)) {
			sql.append("CCM_SORT_SEQ = default ,");
		}
		else {
			sql.append("CCM_SORT_SEQ = ");
			sql.append(ACustomColMetadata.ccmSortSeq);
			sql.append(",");
		}
		if ((ACustomColMetadata.ccmDropdownType == null)) {
			sql.append("CCM_DROPDOWN_TYPE = default ,");
		}
		else {
			sql.append("CCM_DROPDOWN_TYPE = ");
			sql.append(SqlServerUtils.safeSql(ACustomColMetadata.ccmDropdownType.toString()));
			sql.append(",");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param CustomColMetadata 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, CustomColMetadata ACustomColMetadata, String appendConditionSql) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("CUSTOM_COL_METADATA set ");
		sql.append("CCM_COLORDER = ");
		sql.append(ACustomColMetadata.ccmColorder);
		sql.append(",");
		sql.append("CCM_DROPDOWN_VALS = ");
		sql.append(SqlServerUtils.safeSql(ACustomColMetadata.ccmDropdownVals.toString()));
		sql.append(",");
		if ((ACustomColMetadata.ccmSortSeq == null)) {
			sql.append("CCM_SORT_SEQ = default ,");
		}
		else {
			sql.append("CCM_SORT_SEQ = ");
			sql.append(ACustomColMetadata.ccmSortSeq);
			sql.append(",");
		}
		if ((ACustomColMetadata.ccmDropdownType == null)) {
			sql.append("CCM_DROPDOWN_TYPE = default ,");
		}
		else {
			sql.append("CCM_DROPDOWN_TYPE = ");
			sql.append(SqlServerUtils.safeSql(ACustomColMetadata.ccmDropdownType.toString()));
			sql.append(",");
		}
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
	public static List<CustomColMetadata> selectObjects(IDataVisit2 ADataVisit, String AppendSql) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((CustomColMetadata.getSelectSql() 
						+ (" from [CUSTOM_COL_METADATA] " + AppendSql)));
		List<CustomColMetadata> list = new ArrayList<CustomColMetadata>();
		try {
			for (; reader.next(); ) {
				CustomColMetadata obj = new CustomColMetadata();
				CustomColMetadata.readValue(reader, obj);
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
	public static List<CustomColMetadata> selectObjects(IDataVisit2 ADataVisit) throws SQLException {
		return CustomColMetadata.selectObjects(ADataVisit, "");
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
	public static List<CustomColMetadata> selectObjects(IDataVisit2 ADataVisit, String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((CustomColMetadata.getSelectSql() 
						+ (" from [CUSTOM_COL_METADATA] " + AppendSql)), pageIndex, rowsOfPage, orderField, order);
		List<CustomColMetadata> list = new ArrayList<CustomColMetadata>();
		try {
			for (; reader.next(); ) {
				CustomColMetadata obj = new CustomColMetadata();
				CustomColMetadata.readValue(reader, obj);
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
	public static List<CustomColMetadata> selectObjects(IDataVisit2 ADataVisit, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		return CustomColMetadata.selectObjects(ADataVisit, "", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 从数据表CUSTOM_COL_METADATA中查询一个实体对象
	 * @param ADataVisit 数据访问接口
	 * @param Int32 
	 */
	public static CustomColMetadata SelectByCcmColorder(IDataVisit2 ADataVisit, int ACcmColorder) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append(" where ");
		sql.append("CCM_COLORDER = ");
		sql.append(ACcmColorder);
		List<CustomColMetadata> list = CustomColMetadata.selectObjects(ADataVisit, sql.toString());
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
			CustomColMetadata o = ((CustomColMetadata)(obj));
			this.ccmColorder = o.ccmColorder;
			this.ccmDropdownVals = o.ccmDropdownVals;
			this.ccmSortSeq = o.ccmSortSeq;
			this.ccmDropdownType = o.ccmDropdownType;
		}
	}
	
	/**
	 * 复制值到给定的对象,要求目标对象是子类
	 * @param object 目标对象
	 */
	public void assignTo(BaseTable obj) {
		super.assignTo(obj);
		if (this.getClass().isInstance(obj)) {
			CustomColMetadata o = ((CustomColMetadata)(obj));
			o.ccmColorder = this.ccmColorder;
			o.ccmDropdownVals = this.ccmDropdownVals;
			o.ccmSortSeq = this.ccmSortSeq;
			o.ccmDropdownType = this.ccmDropdownType;
		}
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * <@param appendSql 附加的条件语句>
	 */
	public static void deleteByCcmColorder(IDataVisit2 ADataVisit, int ACcmColorder, String appendSql) throws SQLException, DbException {
		String sql = "";
		sql = (sql + " delete from CUSTOM_COL_METADATA where ");
		sql = (sql + "CCM_COLORDER = ");
		sql = (sql + ACcmColorder);
		sql = (sql + appendSql);
		ADataVisit.execSql(sql);
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 */
	public static void deleteByCcmColorder(IDataVisit2 ADataVisit, int ACcmColorder) throws SQLException, DbException {
		CustomColMetadata.deleteByCcmColorder(ADataVisit, ACcmColorder, "");
	}
	
	/**
	 * 把ResultSet中的数据转到对象中
	 * @param AReader 数据源
	 * @param ACustomColMetadata 目标对象
	 * @return 
	 */
	public static void readValue(ResultSet AReader, CustomColMetadata ACustomColMetadata) throws SQLException {
		ACustomColMetadata.ccmColorder = AReader.getInt(1);
		ACustomColMetadata.ccmDropdownVals = AReader.getString(2);
		ACustomColMetadata.ccmSortSeq = AReader.getInt(3);
		if (AReader.wasNull()) {
			ACustomColMetadata.ccmSortSeq = null;
		}
		ACustomColMetadata.ccmDropdownType = AReader.getString(4);
		if (AReader.wasNull()) {
			ACustomColMetadata.ccmDropdownType = null;
		}
	}
}
