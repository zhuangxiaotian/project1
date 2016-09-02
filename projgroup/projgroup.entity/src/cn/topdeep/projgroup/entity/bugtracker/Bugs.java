package cn.topdeep.projgroup.entity.bugtracker;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import java.sql.*;
/**
 * BUGS: 
 */
public class Bugs extends common.dbvisit.BaseTable {
	
	/**
	 * BG_ID: 
	 */
	private int bgId;
	
	/**
	 * BG_SHORT_DESC: 
	 */
	private String bgShortDesc = "";
	
	/**
	 * BG_REPORTED_USER: 
	 */
	private int bgReportedUser;
	
	/**
	 * BG_REPORTED_DATE: 
	 */
	private java.util.Date bgReportedDate;
	
	/**
	 * BG_STATUS: 
	 */
	private int bgStatus;
	
	/**
	 * BG_PRIORITY: 
	 */
	private int bgPriority;
	
	/**
	 * BG_CATEGORY: 
	 */
	private int bgCategory;
	
	/**
	 * BG_PROJECT: 
	 */
	private int bgProject;
	
	/**
	 * BG_ASSIGNED_TO_USER: 
	 */
	private Integer bgAssignedToUser;
	
	/**
	 * BG_LAST_UPDATED_USER: 
	 */
	private Integer bgLastUpdatedUser;
	
	/**
	 * BG_LAST_UPDATED_DATE: 
	 */
	private java.util.Date bgLastUpdatedDate;
	
	/**
	 * BG_USER_DEFINED_ATTRIBUTE: 
	 */
	private Integer bgUserDefinedAttribute;
	
	/**
	 * BG_PROJECT_CUSTOM_DROPDOWN_VALUE1: 
	 */
	private String bgProjectCustomDropdownValue1;
	
	/**
	 * BG_PROJECT_CUSTOM_DROPDOWN_VALUE2: 
	 */
	private String bgProjectCustomDropdownValue2;
	
	/**
	 * BG_PROJECT_CUSTOM_DROPDOWN_VALUE3: 
	 */
	private String bgProjectCustomDropdownValue3;
	
	/**
	 * BG_ID: 
	 */
	public int getBgId() {
		return this.bgId;
	}
	
	/**
	 * BG_ID: 
	 */
	public void setBgId(int value)
	 {
		this.bgId = value;
	}
	
	/**
	 * BG_SHORT_DESC: 
	 */
	public String getBgShortDesc() {
		return this.bgShortDesc;
	}
	
	/**
	 * BG_SHORT_DESC: 
	 */
	public void setBgShortDesc(String value)
	 {
		this.bgShortDesc = value;
	}
	
	/**
	 * BG_REPORTED_USER: 
	 */
	public int getBgReportedUser() {
		return this.bgReportedUser;
	}
	
	/**
	 * BG_REPORTED_USER: 
	 */
	public void setBgReportedUser(int value)
	 {
		this.bgReportedUser = value;
	}
	
	/**
	 * BG_REPORTED_DATE: 
	 */
	public java.util.Date getBgReportedDate() {
		return this.bgReportedDate;
	}
	
	/**
	 * BG_REPORTED_DATE: 
	 */
	public void setBgReportedDate(java.util.Date value)
	 {
		this.bgReportedDate = value;
	}
	
	/**
	 * BG_STATUS: 
	 */
	public int getBgStatus() {
		return this.bgStatus;
	}
	
	/**
	 * BG_STATUS: 
	 */
	public void setBgStatus(int value)
	 {
		this.bgStatus = value;
	}
	
	/**
	 * BG_PRIORITY: 
	 */
	public int getBgPriority() {
		return this.bgPriority;
	}
	
	/**
	 * BG_PRIORITY: 
	 */
	public void setBgPriority(int value)
	 {
		this.bgPriority = value;
	}
	
	/**
	 * BG_CATEGORY: 
	 */
	public int getBgCategory() {
		return this.bgCategory;
	}
	
	/**
	 * BG_CATEGORY: 
	 */
	public void setBgCategory(int value)
	 {
		this.bgCategory = value;
	}
	
	/**
	 * BG_PROJECT: 
	 */
	public int getBgProject() {
		return this.bgProject;
	}
	
	/**
	 * BG_PROJECT: 
	 */
	public void setBgProject(int value)
	 {
		this.bgProject = value;
	}
	
	/**
	 * BG_ASSIGNED_TO_USER: 
	 */
	public Integer getBgAssignedToUser() {
		return this.bgAssignedToUser;
	}
	
	/**
	 * BG_ASSIGNED_TO_USER: 
	 */
	public void setBgAssignedToUser(Integer value)
	 {
		this.bgAssignedToUser = value;
	}
	
	/**
	 * BG_LAST_UPDATED_USER: 
	 */
	public Integer getBgLastUpdatedUser() {
		return this.bgLastUpdatedUser;
	}
	
	/**
	 * BG_LAST_UPDATED_USER: 
	 */
	public void setBgLastUpdatedUser(Integer value)
	 {
		this.bgLastUpdatedUser = value;
	}
	
	/**
	 * BG_LAST_UPDATED_DATE: 
	 */
	public java.util.Date getBgLastUpdatedDate() {
		return this.bgLastUpdatedDate;
	}
	
	/**
	 * BG_LAST_UPDATED_DATE: 
	 */
	public void setBgLastUpdatedDate(java.util.Date value)
	 {
		this.bgLastUpdatedDate = value;
	}
	
	/**
	 * BG_USER_DEFINED_ATTRIBUTE: 
	 */
	public Integer getBgUserDefinedAttribute() {
		return this.bgUserDefinedAttribute;
	}
	
	/**
	 * BG_USER_DEFINED_ATTRIBUTE: 
	 */
	public void setBgUserDefinedAttribute(Integer value)
	 {
		this.bgUserDefinedAttribute = value;
	}
	
	/**
	 * BG_PROJECT_CUSTOM_DROPDOWN_VALUE1: 
	 */
	public String getBgProjectCustomDropdownValue1() {
		return this.bgProjectCustomDropdownValue1;
	}
	
	/**
	 * BG_PROJECT_CUSTOM_DROPDOWN_VALUE1: 
	 */
	public void setBgProjectCustomDropdownValue1(String value)
	 {
		this.bgProjectCustomDropdownValue1 = value;
	}
	
	/**
	 * BG_PROJECT_CUSTOM_DROPDOWN_VALUE2: 
	 */
	public String getBgProjectCustomDropdownValue2() {
		return this.bgProjectCustomDropdownValue2;
	}
	
	/**
	 * BG_PROJECT_CUSTOM_DROPDOWN_VALUE2: 
	 */
	public void setBgProjectCustomDropdownValue2(String value)
	 {
		this.bgProjectCustomDropdownValue2 = value;
	}
	
	/**
	 * BG_PROJECT_CUSTOM_DROPDOWN_VALUE3: 
	 */
	public String getBgProjectCustomDropdownValue3() {
		return this.bgProjectCustomDropdownValue3;
	}
	
	/**
	 * BG_PROJECT_CUSTOM_DROPDOWN_VALUE3: 
	 */
	public void setBgProjectCustomDropdownValue3(String value)
	 {
		this.bgProjectCustomDropdownValue3 = value;
	}
	
	public static String getSelectSql() {
		return "select [BUGS].[BG_ID],[BUGS].[BG_SHORT_DESC],[BUGS].[BG_REPORTED_USER],[BUGS].[BG_REPORTED_DATE],[BUGS].[BG_STATUS],[BUGS].[BG_PRIORITY],[BUGS].[BG_CATEGORY],[BUGS].[BG_PROJECT],[BUGS].[BG_ASSIGNED_TO_USER],[BUGS].[BG_LAST_UPDATED_USER],[BUGS].[BG_LAST_UPDATED_DATE],[BUGS].[BG_USER_DEFINED_ATTRIBUTE],[BUGS].[BG_PROJECT_CUSTOM_DROPDOWN_VALUE1],[BUGS].[BG_PROJECT_CUSTOM_DROPDOWN_VALUE2],[BUGS].[BG_PROJECT_CUSTOM_DROPDOWN_VALUE3] ";
	}
	
	
	/**
	 * 插入一个对象到数据库中
	 * @param ADataVisit 数据访问接口
	 * @param Bugs 需要插入的新对象
	 */
	public static void insert(IDataVisit2 ADataVisit, Bugs ABugs) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("insert into [BUGS] (");
		sql.append("[BUGS].[BG_SHORT_DESC],");
		sql.append("[BUGS].[BG_REPORTED_USER],");
		sql.append("[BUGS].[BG_REPORTED_DATE],");
		sql.append("[BUGS].[BG_STATUS],");
		sql.append("[BUGS].[BG_PRIORITY],");
		sql.append("[BUGS].[BG_CATEGORY],");
		sql.append("[BUGS].[BG_PROJECT],");
		if ((ABugs.bgAssignedToUser == null)) {
		}
		else {
			sql.append("[BUGS].[BG_ASSIGNED_TO_USER],");
		}
		if ((ABugs.bgLastUpdatedUser == null)) {
		}
		else {
			sql.append("[BUGS].[BG_LAST_UPDATED_USER],");
		}
		if ((ABugs.bgLastUpdatedDate == null)) {
		}
		else {
			sql.append("[BUGS].[BG_LAST_UPDATED_DATE],");
		}
		if ((ABugs.bgUserDefinedAttribute == null)) {
		}
		else {
			sql.append("[BUGS].[BG_USER_DEFINED_ATTRIBUTE],");
		}
		if ((ABugs.bgProjectCustomDropdownValue1 == null)) {
		}
		else {
			sql.append("[BUGS].[BG_PROJECT_CUSTOM_DROPDOWN_VALUE1],");
		}
		if ((ABugs.bgProjectCustomDropdownValue2 == null)) {
		}
		else {
			sql.append("[BUGS].[BG_PROJECT_CUSTOM_DROPDOWN_VALUE2],");
		}
		if ((ABugs.bgProjectCustomDropdownValue3 == null)) {
		}
		else {
			sql.append("[BUGS].[BG_PROJECT_CUSTOM_DROPDOWN_VALUE3],");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(") values (");
		sql.append(SqlServerUtils.safeSql(ABugs.bgShortDesc.toString()));
		sql.append(",");
		sql.append(ABugs.bgReportedUser);
		sql.append(",");
		sql.append(SqlServerUtils.getDateSql(ABugs.bgReportedDate));
		sql.append(",");
		sql.append(ABugs.bgStatus);
		sql.append(",");
		sql.append(ABugs.bgPriority);
		sql.append(",");
		sql.append(ABugs.bgCategory);
		sql.append(",");
		sql.append(ABugs.bgProject);
		sql.append(",");
		if ((ABugs.bgAssignedToUser == null)) {
		}
		else {
			sql.append(ABugs.bgAssignedToUser);
			sql.append(",");
		}
		if ((ABugs.bgLastUpdatedUser == null)) {
		}
		else {
			sql.append(ABugs.bgLastUpdatedUser);
			sql.append(",");
		}
		if ((ABugs.bgLastUpdatedDate == null)) {
		}
		else {
			sql.append(SqlServerUtils.getDateSql(ABugs.bgLastUpdatedDate));
			sql.append(",");
		}
		if ((ABugs.bgUserDefinedAttribute == null)) {
		}
		else {
			sql.append(ABugs.bgUserDefinedAttribute);
			sql.append(",");
		}
		if ((ABugs.bgProjectCustomDropdownValue1 == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(ABugs.bgProjectCustomDropdownValue1.toString()));
			sql.append(",");
		}
		if ((ABugs.bgProjectCustomDropdownValue2 == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(ABugs.bgProjectCustomDropdownValue2.toString()));
			sql.append(",");
		}
		if ((ABugs.bgProjectCustomDropdownValue3 == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(ABugs.bgProjectCustomDropdownValue3.toString()));
			sql.append(",");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(")");
		ADataVisit.beginTransaction();
		try {
			ADataVisit.execSql(sql.toString());
			ABugs.bgId = ((int)(((double)(ADataVisit.getIDentity()))));
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
	 * @param Bugs 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, Bugs ABugs) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("BUGS set ");
		sql.append("BG_SHORT_DESC = ");
		sql.append(SqlServerUtils.safeSql(ABugs.bgShortDesc.toString()));
		sql.append(",");
		sql.append("BG_REPORTED_USER = ");
		sql.append(ABugs.bgReportedUser);
		sql.append(",");
		sql.append("BG_REPORTED_DATE = ");
		sql.append(SqlServerUtils.getDateSql(ABugs.bgReportedDate));
		sql.append(",");
		sql.append("BG_STATUS = ");
		sql.append(ABugs.bgStatus);
		sql.append(",");
		sql.append("BG_PRIORITY = ");
		sql.append(ABugs.bgPriority);
		sql.append(",");
		sql.append("BG_CATEGORY = ");
		sql.append(ABugs.bgCategory);
		sql.append(",");
		sql.append("BG_PROJECT = ");
		sql.append(ABugs.bgProject);
		sql.append(",");
		if ((ABugs.bgAssignedToUser == null)) {
			sql.append("BG_ASSIGNED_TO_USER = default ,");
		}
		else {
			sql.append("BG_ASSIGNED_TO_USER = ");
			sql.append(ABugs.bgAssignedToUser);
			sql.append(",");
		}
		if ((ABugs.bgLastUpdatedUser == null)) {
			sql.append("BG_LAST_UPDATED_USER = default ,");
		}
		else {
			sql.append("BG_LAST_UPDATED_USER = ");
			sql.append(ABugs.bgLastUpdatedUser);
			sql.append(",");
		}
		if ((ABugs.bgLastUpdatedDate == null)) {
			sql.append("BG_LAST_UPDATED_DATE = default ,");
		}
		else {
			sql.append("BG_LAST_UPDATED_DATE = ");
			sql.append(SqlServerUtils.getDateSql(ABugs.bgLastUpdatedDate));
			sql.append(",");
		}
		if ((ABugs.bgUserDefinedAttribute == null)) {
			sql.append("BG_USER_DEFINED_ATTRIBUTE = default ,");
		}
		else {
			sql.append("BG_USER_DEFINED_ATTRIBUTE = ");
			sql.append(ABugs.bgUserDefinedAttribute);
			sql.append(",");
		}
		if ((ABugs.bgProjectCustomDropdownValue1 == null)) {
			sql.append("BG_PROJECT_CUSTOM_DROPDOWN_VALUE1 = default ,");
		}
		else {
			sql.append("BG_PROJECT_CUSTOM_DROPDOWN_VALUE1 = ");
			sql.append(SqlServerUtils.safeSql(ABugs.bgProjectCustomDropdownValue1.toString()));
			sql.append(",");
		}
		if ((ABugs.bgProjectCustomDropdownValue2 == null)) {
			sql.append("BG_PROJECT_CUSTOM_DROPDOWN_VALUE2 = default ,");
		}
		else {
			sql.append("BG_PROJECT_CUSTOM_DROPDOWN_VALUE2 = ");
			sql.append(SqlServerUtils.safeSql(ABugs.bgProjectCustomDropdownValue2.toString()));
			sql.append(",");
		}
		if ((ABugs.bgProjectCustomDropdownValue3 == null)) {
			sql.append("BG_PROJECT_CUSTOM_DROPDOWN_VALUE3 = default ,");
		}
		else {
			sql.append("BG_PROJECT_CUSTOM_DROPDOWN_VALUE3 = ");
			sql.append(SqlServerUtils.safeSql(ABugs.bgProjectCustomDropdownValue3.toString()));
			sql.append(",");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("BG_ID = ");
		sql.append(ABugs.bgId);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param Bugs 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, Bugs ABugs, String appendConditionSql) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("BUGS set ");
		sql.append("BG_SHORT_DESC = ");
		sql.append(SqlServerUtils.safeSql(ABugs.bgShortDesc.toString()));
		sql.append(",");
		sql.append("BG_REPORTED_USER = ");
		sql.append(ABugs.bgReportedUser);
		sql.append(",");
		sql.append("BG_REPORTED_DATE = ");
		sql.append(SqlServerUtils.getDateSql(ABugs.bgReportedDate));
		sql.append(",");
		sql.append("BG_STATUS = ");
		sql.append(ABugs.bgStatus);
		sql.append(",");
		sql.append("BG_PRIORITY = ");
		sql.append(ABugs.bgPriority);
		sql.append(",");
		sql.append("BG_CATEGORY = ");
		sql.append(ABugs.bgCategory);
		sql.append(",");
		sql.append("BG_PROJECT = ");
		sql.append(ABugs.bgProject);
		sql.append(",");
		if ((ABugs.bgAssignedToUser == null)) {
			sql.append("BG_ASSIGNED_TO_USER = default ,");
		}
		else {
			sql.append("BG_ASSIGNED_TO_USER = ");
			sql.append(ABugs.bgAssignedToUser);
			sql.append(",");
		}
		if ((ABugs.bgLastUpdatedUser == null)) {
			sql.append("BG_LAST_UPDATED_USER = default ,");
		}
		else {
			sql.append("BG_LAST_UPDATED_USER = ");
			sql.append(ABugs.bgLastUpdatedUser);
			sql.append(",");
		}
		if ((ABugs.bgLastUpdatedDate == null)) {
			sql.append("BG_LAST_UPDATED_DATE = default ,");
		}
		else {
			sql.append("BG_LAST_UPDATED_DATE = ");
			sql.append(SqlServerUtils.getDateSql(ABugs.bgLastUpdatedDate));
			sql.append(",");
		}
		if ((ABugs.bgUserDefinedAttribute == null)) {
			sql.append("BG_USER_DEFINED_ATTRIBUTE = default ,");
		}
		else {
			sql.append("BG_USER_DEFINED_ATTRIBUTE = ");
			sql.append(ABugs.bgUserDefinedAttribute);
			sql.append(",");
		}
		if ((ABugs.bgProjectCustomDropdownValue1 == null)) {
			sql.append("BG_PROJECT_CUSTOM_DROPDOWN_VALUE1 = default ,");
		}
		else {
			sql.append("BG_PROJECT_CUSTOM_DROPDOWN_VALUE1 = ");
			sql.append(SqlServerUtils.safeSql(ABugs.bgProjectCustomDropdownValue1.toString()));
			sql.append(",");
		}
		if ((ABugs.bgProjectCustomDropdownValue2 == null)) {
			sql.append("BG_PROJECT_CUSTOM_DROPDOWN_VALUE2 = default ,");
		}
		else {
			sql.append("BG_PROJECT_CUSTOM_DROPDOWN_VALUE2 = ");
			sql.append(SqlServerUtils.safeSql(ABugs.bgProjectCustomDropdownValue2.toString()));
			sql.append(",");
		}
		if ((ABugs.bgProjectCustomDropdownValue3 == null)) {
			sql.append("BG_PROJECT_CUSTOM_DROPDOWN_VALUE3 = default ,");
		}
		else {
			sql.append("BG_PROJECT_CUSTOM_DROPDOWN_VALUE3 = ");
			sql.append(SqlServerUtils.safeSql(ABugs.bgProjectCustomDropdownValue3.toString()));
			sql.append(",");
		}
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("BG_ID = ");
		sql.append(ABugs.bgId);
		sql.append(appendConditionSql);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @param AppendSql 附加的Sql语句
	 * @return 查询结果
	 */
	public static List<Bugs> selectObjects(IDataVisit2 ADataVisit, String AppendSql) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((Bugs.getSelectSql() 
						+ (" from [BUGS] " + AppendSql)));
		List<Bugs> list = new ArrayList<Bugs>();
		try {
			for (; reader.next(); ) {
				Bugs obj = new Bugs();
				Bugs.readValue(reader, obj);
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
	public static List<Bugs> selectObjects(IDataVisit2 ADataVisit) throws SQLException {
		return Bugs.selectObjects(ADataVisit, "");
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
	public static List<Bugs> selectObjects(IDataVisit2 ADataVisit, String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((Bugs.getSelectSql() 
						+ (" from [BUGS] " + AppendSql)), pageIndex, rowsOfPage, orderField, order);
		List<Bugs> list = new ArrayList<Bugs>();
		try {
			for (; reader.next(); ) {
				Bugs obj = new Bugs();
				Bugs.readValue(reader, obj);
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
	public static List<Bugs> selectObjects(IDataVisit2 ADataVisit, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		return Bugs.selectObjects(ADataVisit, "", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 从数据表BUGS中查询一个实体对象
	 * @param ADataVisit 数据访问接口
	 * @param Int32 
	 */
	public static Bugs SelectByBgId(IDataVisit2 ADataVisit, int ABgId) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append(" where ");
		sql.append("BG_ID = ");
		sql.append(ABgId);
		List<Bugs> list = Bugs.selectObjects(ADataVisit, sql.toString());
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
			Bugs o = ((Bugs)(obj));
			this.bgId = o.bgId;
			this.bgShortDesc = o.bgShortDesc;
			this.bgReportedUser = o.bgReportedUser;
			this.bgReportedDate = o.bgReportedDate;
			this.bgStatus = o.bgStatus;
			this.bgPriority = o.bgPriority;
			this.bgCategory = o.bgCategory;
			this.bgProject = o.bgProject;
			this.bgAssignedToUser = o.bgAssignedToUser;
			this.bgLastUpdatedUser = o.bgLastUpdatedUser;
			this.bgLastUpdatedDate = o.bgLastUpdatedDate;
			this.bgUserDefinedAttribute = o.bgUserDefinedAttribute;
			this.bgProjectCustomDropdownValue1 = o.bgProjectCustomDropdownValue1;
			this.bgProjectCustomDropdownValue2 = o.bgProjectCustomDropdownValue2;
			this.bgProjectCustomDropdownValue3 = o.bgProjectCustomDropdownValue3;
		}
	}
	
	/**
	 * 复制值到给定的对象,要求目标对象是子类
	 * @param object 目标对象
	 */
	public void assignTo(BaseTable obj) {
		super.assignTo(obj);
		if (this.getClass().isInstance(obj)) {
			Bugs o = ((Bugs)(obj));
			o.bgId = this.bgId;
			o.bgShortDesc = this.bgShortDesc;
			o.bgReportedUser = this.bgReportedUser;
			o.bgReportedDate = this.bgReportedDate;
			o.bgStatus = this.bgStatus;
			o.bgPriority = this.bgPriority;
			o.bgCategory = this.bgCategory;
			o.bgProject = this.bgProject;
			o.bgAssignedToUser = this.bgAssignedToUser;
			o.bgLastUpdatedUser = this.bgLastUpdatedUser;
			o.bgLastUpdatedDate = this.bgLastUpdatedDate;
			o.bgUserDefinedAttribute = this.bgUserDefinedAttribute;
			o.bgProjectCustomDropdownValue1 = this.bgProjectCustomDropdownValue1;
			o.bgProjectCustomDropdownValue2 = this.bgProjectCustomDropdownValue2;
			o.bgProjectCustomDropdownValue3 = this.bgProjectCustomDropdownValue3;
		}
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * <@param appendSql 附加的条件语句>
	 */
	public static void deleteByBgId(IDataVisit2 ADataVisit, int ABgId, String appendSql) throws SQLException, DbException {
		String sql = "";
		sql = (sql + " delete from BUGS where ");
		sql = (sql + "BG_ID = ");
		sql = (sql + ABgId);
		sql = (sql + appendSql);
		ADataVisit.execSql(sql);
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 */
	public static void deleteByBgId(IDataVisit2 ADataVisit, int ABgId) throws SQLException, DbException {
		Bugs.deleteByBgId(ADataVisit, ABgId, "");
	}
	
	/**
	 * 把ResultSet中的数据转到对象中
	 * @param AReader 数据源
	 * @param ABugs 目标对象
	 * @return 
	 */
	public static void readValue(ResultSet AReader, Bugs ABugs) throws SQLException {
		ABugs.bgId = AReader.getInt(1);
		ABugs.bgShortDesc = AReader.getString(2);
		ABugs.bgReportedUser = AReader.getInt(3);
		ABugs.bgReportedDate = SqlUtils.getDate(AReader, 4);
		ABugs.bgStatus = AReader.getInt(5);
		ABugs.bgPriority = AReader.getInt(6);
		ABugs.bgCategory = AReader.getInt(7);
		ABugs.bgProject = AReader.getInt(8);
		ABugs.bgAssignedToUser = AReader.getInt(9);
		if (AReader.wasNull()) {
			ABugs.bgAssignedToUser = null;
		}
		ABugs.bgLastUpdatedUser = AReader.getInt(10);
		if (AReader.wasNull()) {
			ABugs.bgLastUpdatedUser = null;
		}
		ABugs.bgLastUpdatedDate = SqlUtils.getDate(AReader, 11);
		if (AReader.wasNull()) {
			ABugs.bgLastUpdatedDate = null;
		}
		ABugs.bgUserDefinedAttribute = AReader.getInt(12);
		if (AReader.wasNull()) {
			ABugs.bgUserDefinedAttribute = null;
		}
		ABugs.bgProjectCustomDropdownValue1 = AReader.getString(13);
		if (AReader.wasNull()) {
			ABugs.bgProjectCustomDropdownValue1 = null;
		}
		ABugs.bgProjectCustomDropdownValue2 = AReader.getString(14);
		if (AReader.wasNull()) {
			ABugs.bgProjectCustomDropdownValue2 = null;
		}
		ABugs.bgProjectCustomDropdownValue3 = AReader.getString(15);
		if (AReader.wasNull()) {
			ABugs.bgProjectCustomDropdownValue3 = null;
		}
	}
}
