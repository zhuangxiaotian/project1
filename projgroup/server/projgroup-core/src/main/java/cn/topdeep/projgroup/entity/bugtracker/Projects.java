package cn.topdeep.projgroup.entity.bugtracker;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import java.sql.*;
/**
 * PROJECTS: 
 */
public class Projects extends common.dbvisit.BaseTable {
	
	/**
	 * PJ_ID: 
	 */
	private int pjId;
	
	/**
	 * PJ_NAME: 
	 */
	private String pjName = "";
	
	/**
	 * PJ_ACTIVE: 
	 */
	private int pjActive;
	
	/**
	 * PJ_DEFAULT_USER: 
	 */
	private Integer pjDefaultUser;
	
	/**
	 * PJ_AUTO_ASSIGN_DEFAULT_USER: 
	 */
	private Integer pjAutoAssignDefaultUser;
	
	/**
	 * PJ_AUTO_SUBSCRIBE_DEFAULT_USER: 
	 */
	private Integer pjAutoSubscribeDefaultUser;
	
	/**
	 * PJ_ENABLE_POP3: 
	 */
	private Integer pjEnablePop3;
	
	/**
	 * PJ_POP3_USERNAME: 
	 */
	private String pjPop3Username;
	
	/**
	 * PJ_POP3_PASSWORD: 
	 */
	private String pjPop3Password;
	
	/**
	 * PJ_POP3_EMAIL_FROM: 
	 */
	private String pjPop3EmailFrom;
	
	/**
	 * PJ_ENABLE_CUSTOM_DROPDOWN1: 
	 */
	private int pjEnableCustomDropdown1;
	
	/**
	 * PJ_ENABLE_CUSTOM_DROPDOWN2: 
	 */
	private int pjEnableCustomDropdown2;
	
	/**
	 * PJ_ENABLE_CUSTOM_DROPDOWN3: 
	 */
	private int pjEnableCustomDropdown3;
	
	/**
	 * PJ_CUSTOM_DROPDOWN_LABEL1: 
	 */
	private String pjCustomDropdownLabel1;
	
	/**
	 * PJ_CUSTOM_DROPDOWN_LABEL2: 
	 */
	private String pjCustomDropdownLabel2;
	
	/**
	 * PJ_CUSTOM_DROPDOWN_LABEL3: 
	 */
	private String pjCustomDropdownLabel3;
	
	/**
	 * PJ_CUSTOM_DROPDOWN_VALUES1: 
	 */
	private String pjCustomDropdownValues1;
	
	/**
	 * PJ_CUSTOM_DROPDOWN_VALUES2: 
	 */
	private String pjCustomDropdownValues2;
	
	/**
	 * PJ_CUSTOM_DROPDOWN_VALUES3: 
	 */
	private String pjCustomDropdownValues3;
	
	/**
	 * PJ_DEFAULT: 
	 */
	private int pjDefault;
	
	/**
	 * PJ_ID: 
	 */
	public int getPjId() {
		return this.pjId;
	}
	
	/**
	 * PJ_ID: 
	 */
	public void setPjId(int value)
	 {
		this.pjId = value;
	}
	
	/**
	 * PJ_NAME: 
	 */
	public String getPjName() {
		return this.pjName;
	}
	
	/**
	 * PJ_NAME: 
	 */
	public void setPjName(String value)
	 {
		this.pjName = value;
	}
	
	/**
	 * PJ_ACTIVE: 
	 */
	public int getPjActive() {
		return this.pjActive;
	}
	
	/**
	 * PJ_ACTIVE: 
	 */
	public void setPjActive(int value)
	 {
		this.pjActive = value;
	}
	
	/**
	 * PJ_DEFAULT_USER: 
	 */
	public Integer getPjDefaultUser() {
		return this.pjDefaultUser;
	}
	
	/**
	 * PJ_DEFAULT_USER: 
	 */
	public void setPjDefaultUser(Integer value)
	 {
		this.pjDefaultUser = value;
	}
	
	/**
	 * PJ_AUTO_ASSIGN_DEFAULT_USER: 
	 */
	public Integer getPjAutoAssignDefaultUser() {
		return this.pjAutoAssignDefaultUser;
	}
	
	/**
	 * PJ_AUTO_ASSIGN_DEFAULT_USER: 
	 */
	public void setPjAutoAssignDefaultUser(Integer value)
	 {
		this.pjAutoAssignDefaultUser = value;
	}
	
	/**
	 * PJ_AUTO_SUBSCRIBE_DEFAULT_USER: 
	 */
	public Integer getPjAutoSubscribeDefaultUser() {
		return this.pjAutoSubscribeDefaultUser;
	}
	
	/**
	 * PJ_AUTO_SUBSCRIBE_DEFAULT_USER: 
	 */
	public void setPjAutoSubscribeDefaultUser(Integer value)
	 {
		this.pjAutoSubscribeDefaultUser = value;
	}
	
	/**
	 * PJ_ENABLE_POP3: 
	 */
	public Integer getPjEnablePop3() {
		return this.pjEnablePop3;
	}
	
	/**
	 * PJ_ENABLE_POP3: 
	 */
	public void setPjEnablePop3(Integer value)
	 {
		this.pjEnablePop3 = value;
	}
	
	/**
	 * PJ_POP3_USERNAME: 
	 */
	public String getPjPop3Username() {
		return this.pjPop3Username;
	}
	
	/**
	 * PJ_POP3_USERNAME: 
	 */
	public void setPjPop3Username(String value)
	 {
		this.pjPop3Username = value;
	}
	
	/**
	 * PJ_POP3_PASSWORD: 
	 */
	public String getPjPop3Password() {
		return this.pjPop3Password;
	}
	
	/**
	 * PJ_POP3_PASSWORD: 
	 */
	public void setPjPop3Password(String value)
	 {
		this.pjPop3Password = value;
	}
	
	/**
	 * PJ_POP3_EMAIL_FROM: 
	 */
	public String getPjPop3EmailFrom() {
		return this.pjPop3EmailFrom;
	}
	
	/**
	 * PJ_POP3_EMAIL_FROM: 
	 */
	public void setPjPop3EmailFrom(String value)
	 {
		this.pjPop3EmailFrom = value;
	}
	
	/**
	 * PJ_ENABLE_CUSTOM_DROPDOWN1: 
	 */
	public int getPjEnableCustomDropdown1() {
		return this.pjEnableCustomDropdown1;
	}
	
	/**
	 * PJ_ENABLE_CUSTOM_DROPDOWN1: 
	 */
	public void setPjEnableCustomDropdown1(int value)
	 {
		this.pjEnableCustomDropdown1 = value;
	}
	
	/**
	 * PJ_ENABLE_CUSTOM_DROPDOWN2: 
	 */
	public int getPjEnableCustomDropdown2() {
		return this.pjEnableCustomDropdown2;
	}
	
	/**
	 * PJ_ENABLE_CUSTOM_DROPDOWN2: 
	 */
	public void setPjEnableCustomDropdown2(int value)
	 {
		this.pjEnableCustomDropdown2 = value;
	}
	
	/**
	 * PJ_ENABLE_CUSTOM_DROPDOWN3: 
	 */
	public int getPjEnableCustomDropdown3() {
		return this.pjEnableCustomDropdown3;
	}
	
	/**
	 * PJ_ENABLE_CUSTOM_DROPDOWN3: 
	 */
	public void setPjEnableCustomDropdown3(int value)
	 {
		this.pjEnableCustomDropdown3 = value;
	}
	
	/**
	 * PJ_CUSTOM_DROPDOWN_LABEL1: 
	 */
	public String getPjCustomDropdownLabel1() {
		return this.pjCustomDropdownLabel1;
	}
	
	/**
	 * PJ_CUSTOM_DROPDOWN_LABEL1: 
	 */
	public void setPjCustomDropdownLabel1(String value)
	 {
		this.pjCustomDropdownLabel1 = value;
	}
	
	/**
	 * PJ_CUSTOM_DROPDOWN_LABEL2: 
	 */
	public String getPjCustomDropdownLabel2() {
		return this.pjCustomDropdownLabel2;
	}
	
	/**
	 * PJ_CUSTOM_DROPDOWN_LABEL2: 
	 */
	public void setPjCustomDropdownLabel2(String value)
	 {
		this.pjCustomDropdownLabel2 = value;
	}
	
	/**
	 * PJ_CUSTOM_DROPDOWN_LABEL3: 
	 */
	public String getPjCustomDropdownLabel3() {
		return this.pjCustomDropdownLabel3;
	}
	
	/**
	 * PJ_CUSTOM_DROPDOWN_LABEL3: 
	 */
	public void setPjCustomDropdownLabel3(String value)
	 {
		this.pjCustomDropdownLabel3 = value;
	}
	
	/**
	 * PJ_CUSTOM_DROPDOWN_VALUES1: 
	 */
	public String getPjCustomDropdownValues1() {
		return this.pjCustomDropdownValues1;
	}
	
	/**
	 * PJ_CUSTOM_DROPDOWN_VALUES1: 
	 */
	public void setPjCustomDropdownValues1(String value)
	 {
		this.pjCustomDropdownValues1 = value;
	}
	
	/**
	 * PJ_CUSTOM_DROPDOWN_VALUES2: 
	 */
	public String getPjCustomDropdownValues2() {
		return this.pjCustomDropdownValues2;
	}
	
	/**
	 * PJ_CUSTOM_DROPDOWN_VALUES2: 
	 */
	public void setPjCustomDropdownValues2(String value)
	 {
		this.pjCustomDropdownValues2 = value;
	}
	
	/**
	 * PJ_CUSTOM_DROPDOWN_VALUES3: 
	 */
	public String getPjCustomDropdownValues3() {
		return this.pjCustomDropdownValues3;
	}
	
	/**
	 * PJ_CUSTOM_DROPDOWN_VALUES3: 
	 */
	public void setPjCustomDropdownValues3(String value)
	 {
		this.pjCustomDropdownValues3 = value;
	}
	
	/**
	 * PJ_DEFAULT: 
	 */
	public int getPjDefault() {
		return this.pjDefault;
	}
	
	/**
	 * PJ_DEFAULT: 
	 */
	public void setPjDefault(int value)
	 {
		this.pjDefault = value;
	}
	
	public static String getSelectSql() {
		return "select [PROJECTS].[PJ_ID],[PROJECTS].[PJ_NAME],[PROJECTS].[PJ_ACTIVE],[PROJECTS].[PJ_DEFAULT_USER],[PROJECTS].[PJ_AUTO_ASSIGN_DEFAULT_USER],[PROJECTS].[PJ_AUTO_SUBSCRIBE_DEFAULT_USER],[PROJECTS].[PJ_ENABLE_POP3],[PROJECTS].[PJ_POP3_USERNAME],[PROJECTS].[PJ_POP3_PASSWORD],[PROJECTS].[PJ_POP3_EMAIL_FROM],[PROJECTS].[PJ_ENABLE_CUSTOM_DROPDOWN1],[PROJECTS].[PJ_ENABLE_CUSTOM_DROPDOWN2],[PROJECTS].[PJ_ENABLE_CUSTOM_DROPDOWN3],[PROJECTS].[PJ_CUSTOM_DROPDOWN_LABEL1],[PROJECTS].[PJ_CUSTOM_DROPDOWN_LABEL2],[PROJECTS].[PJ_CUSTOM_DROPDOWN_LABEL3],[PROJECTS].[PJ_CUSTOM_DROPDOWN_VALUES1],[PROJECTS].[PJ_CUSTOM_DROPDOWN_VALUES2],[PROJECTS].[PJ_CUSTOM_DROPDOWN_VALUES3],[PROJECTS].[PJ_DEFAULT] ";
	}
	
	
	/**
	 * 插入一个对象到数据库中
	 * @param ADataVisit 数据访问接口
	 * @param Projects 需要插入的新对象
	 */
	public static void insert(IDataVisit2 ADataVisit, Projects AProjects) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("insert into [PROJECTS] (");
		sql.append("[PROJECTS].[PJ_NAME],");
		sql.append("[PROJECTS].[PJ_ACTIVE],");
		if ((AProjects.pjDefaultUser == null)) {
		}
		else {
			sql.append("[PROJECTS].[PJ_DEFAULT_USER],");
		}
		if ((AProjects.pjAutoAssignDefaultUser == null)) {
		}
		else {
			sql.append("[PROJECTS].[PJ_AUTO_ASSIGN_DEFAULT_USER],");
		}
		if ((AProjects.pjAutoSubscribeDefaultUser == null)) {
		}
		else {
			sql.append("[PROJECTS].[PJ_AUTO_SUBSCRIBE_DEFAULT_USER],");
		}
		if ((AProjects.pjEnablePop3 == null)) {
		}
		else {
			sql.append("[PROJECTS].[PJ_ENABLE_POP3],");
		}
		if ((AProjects.pjPop3Username == null)) {
		}
		else {
			sql.append("[PROJECTS].[PJ_POP3_USERNAME],");
		}
		if ((AProjects.pjPop3Password == null)) {
		}
		else {
			sql.append("[PROJECTS].[PJ_POP3_PASSWORD],");
		}
		if ((AProjects.pjPop3EmailFrom == null)) {
		}
		else {
			sql.append("[PROJECTS].[PJ_POP3_EMAIL_FROM],");
		}
		sql.append("[PROJECTS].[PJ_ENABLE_CUSTOM_DROPDOWN1],");
		sql.append("[PROJECTS].[PJ_ENABLE_CUSTOM_DROPDOWN2],");
		sql.append("[PROJECTS].[PJ_ENABLE_CUSTOM_DROPDOWN3],");
		if ((AProjects.pjCustomDropdownLabel1 == null)) {
		}
		else {
			sql.append("[PROJECTS].[PJ_CUSTOM_DROPDOWN_LABEL1],");
		}
		if ((AProjects.pjCustomDropdownLabel2 == null)) {
		}
		else {
			sql.append("[PROJECTS].[PJ_CUSTOM_DROPDOWN_LABEL2],");
		}
		if ((AProjects.pjCustomDropdownLabel3 == null)) {
		}
		else {
			sql.append("[PROJECTS].[PJ_CUSTOM_DROPDOWN_LABEL3],");
		}
		if ((AProjects.pjCustomDropdownValues1 == null)) {
		}
		else {
			sql.append("[PROJECTS].[PJ_CUSTOM_DROPDOWN_VALUES1],");
		}
		if ((AProjects.pjCustomDropdownValues2 == null)) {
		}
		else {
			sql.append("[PROJECTS].[PJ_CUSTOM_DROPDOWN_VALUES2],");
		}
		if ((AProjects.pjCustomDropdownValues3 == null)) {
		}
		else {
			sql.append("[PROJECTS].[PJ_CUSTOM_DROPDOWN_VALUES3],");
		}
		sql.append("[PROJECTS].[PJ_DEFAULT],");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(") values (");
		sql.append(SqlServerUtils.safeSql(AProjects.pjName.toString()));
		sql.append(",");
		sql.append(AProjects.pjActive);
		sql.append(",");
		if ((AProjects.pjDefaultUser == null)) {
		}
		else {
			sql.append(AProjects.pjDefaultUser);
			sql.append(",");
		}
		if ((AProjects.pjAutoAssignDefaultUser == null)) {
		}
		else {
			sql.append(AProjects.pjAutoAssignDefaultUser);
			sql.append(",");
		}
		if ((AProjects.pjAutoSubscribeDefaultUser == null)) {
		}
		else {
			sql.append(AProjects.pjAutoSubscribeDefaultUser);
			sql.append(",");
		}
		if ((AProjects.pjEnablePop3 == null)) {
		}
		else {
			sql.append(AProjects.pjEnablePop3);
			sql.append(",");
		}
		if ((AProjects.pjPop3Username == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(AProjects.pjPop3Username.toString()));
			sql.append(",");
		}
		if ((AProjects.pjPop3Password == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(AProjects.pjPop3Password.toString()));
			sql.append(",");
		}
		if ((AProjects.pjPop3EmailFrom == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(AProjects.pjPop3EmailFrom.toString()));
			sql.append(",");
		}
		sql.append(AProjects.pjEnableCustomDropdown1);
		sql.append(",");
		sql.append(AProjects.pjEnableCustomDropdown2);
		sql.append(",");
		sql.append(AProjects.pjEnableCustomDropdown3);
		sql.append(",");
		if ((AProjects.pjCustomDropdownLabel1 == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(AProjects.pjCustomDropdownLabel1.toString()));
			sql.append(",");
		}
		if ((AProjects.pjCustomDropdownLabel2 == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(AProjects.pjCustomDropdownLabel2.toString()));
			sql.append(",");
		}
		if ((AProjects.pjCustomDropdownLabel3 == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(AProjects.pjCustomDropdownLabel3.toString()));
			sql.append(",");
		}
		if ((AProjects.pjCustomDropdownValues1 == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(AProjects.pjCustomDropdownValues1.toString()));
			sql.append(",");
		}
		if ((AProjects.pjCustomDropdownValues2 == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(AProjects.pjCustomDropdownValues2.toString()));
			sql.append(",");
		}
		if ((AProjects.pjCustomDropdownValues3 == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(AProjects.pjCustomDropdownValues3.toString()));
			sql.append(",");
		}
		sql.append(AProjects.pjDefault);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(")");
		ADataVisit.beginTransaction();
		try {
			ADataVisit.execSql(sql.toString());
			AProjects.pjId = ((int)(((double)(ADataVisit.getIDentity()))));
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
	 * @param Projects 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, Projects AProjects) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("PROJECTS set ");
		sql.append("PJ_NAME = ");
		sql.append(SqlServerUtils.safeSql(AProjects.pjName.toString()));
		sql.append(",");
		sql.append("PJ_ACTIVE = ");
		sql.append(AProjects.pjActive);
		sql.append(",");
		if ((AProjects.pjDefaultUser == null)) {
			sql.append("PJ_DEFAULT_USER = default ,");
		}
		else {
			sql.append("PJ_DEFAULT_USER = ");
			sql.append(AProjects.pjDefaultUser);
			sql.append(",");
		}
		if ((AProjects.pjAutoAssignDefaultUser == null)) {
			sql.append("PJ_AUTO_ASSIGN_DEFAULT_USER = default ,");
		}
		else {
			sql.append("PJ_AUTO_ASSIGN_DEFAULT_USER = ");
			sql.append(AProjects.pjAutoAssignDefaultUser);
			sql.append(",");
		}
		if ((AProjects.pjAutoSubscribeDefaultUser == null)) {
			sql.append("PJ_AUTO_SUBSCRIBE_DEFAULT_USER = default ,");
		}
		else {
			sql.append("PJ_AUTO_SUBSCRIBE_DEFAULT_USER = ");
			sql.append(AProjects.pjAutoSubscribeDefaultUser);
			sql.append(",");
		}
		if ((AProjects.pjEnablePop3 == null)) {
			sql.append("PJ_ENABLE_POP3 = default ,");
		}
		else {
			sql.append("PJ_ENABLE_POP3 = ");
			sql.append(AProjects.pjEnablePop3);
			sql.append(",");
		}
		if ((AProjects.pjPop3Username == null)) {
			sql.append("PJ_POP3_USERNAME = default ,");
		}
		else {
			sql.append("PJ_POP3_USERNAME = ");
			sql.append(SqlServerUtils.safeSql(AProjects.pjPop3Username.toString()));
			sql.append(",");
		}
		if ((AProjects.pjPop3Password == null)) {
			sql.append("PJ_POP3_PASSWORD = default ,");
		}
		else {
			sql.append("PJ_POP3_PASSWORD = ");
			sql.append(SqlServerUtils.safeSql(AProjects.pjPop3Password.toString()));
			sql.append(",");
		}
		if ((AProjects.pjPop3EmailFrom == null)) {
			sql.append("PJ_POP3_EMAIL_FROM = default ,");
		}
		else {
			sql.append("PJ_POP3_EMAIL_FROM = ");
			sql.append(SqlServerUtils.safeSql(AProjects.pjPop3EmailFrom.toString()));
			sql.append(",");
		}
		sql.append("PJ_ENABLE_CUSTOM_DROPDOWN1 = ");
		sql.append(AProjects.pjEnableCustomDropdown1);
		sql.append(",");
		sql.append("PJ_ENABLE_CUSTOM_DROPDOWN2 = ");
		sql.append(AProjects.pjEnableCustomDropdown2);
		sql.append(",");
		sql.append("PJ_ENABLE_CUSTOM_DROPDOWN3 = ");
		sql.append(AProjects.pjEnableCustomDropdown3);
		sql.append(",");
		if ((AProjects.pjCustomDropdownLabel1 == null)) {
			sql.append("PJ_CUSTOM_DROPDOWN_LABEL1 = default ,");
		}
		else {
			sql.append("PJ_CUSTOM_DROPDOWN_LABEL1 = ");
			sql.append(SqlServerUtils.safeSql(AProjects.pjCustomDropdownLabel1.toString()));
			sql.append(",");
		}
		if ((AProjects.pjCustomDropdownLabel2 == null)) {
			sql.append("PJ_CUSTOM_DROPDOWN_LABEL2 = default ,");
		}
		else {
			sql.append("PJ_CUSTOM_DROPDOWN_LABEL2 = ");
			sql.append(SqlServerUtils.safeSql(AProjects.pjCustomDropdownLabel2.toString()));
			sql.append(",");
		}
		if ((AProjects.pjCustomDropdownLabel3 == null)) {
			sql.append("PJ_CUSTOM_DROPDOWN_LABEL3 = default ,");
		}
		else {
			sql.append("PJ_CUSTOM_DROPDOWN_LABEL3 = ");
			sql.append(SqlServerUtils.safeSql(AProjects.pjCustomDropdownLabel3.toString()));
			sql.append(",");
		}
		if ((AProjects.pjCustomDropdownValues1 == null)) {
			sql.append("PJ_CUSTOM_DROPDOWN_VALUES1 = default ,");
		}
		else {
			sql.append("PJ_CUSTOM_DROPDOWN_VALUES1 = ");
			sql.append(SqlServerUtils.safeSql(AProjects.pjCustomDropdownValues1.toString()));
			sql.append(",");
		}
		if ((AProjects.pjCustomDropdownValues2 == null)) {
			sql.append("PJ_CUSTOM_DROPDOWN_VALUES2 = default ,");
		}
		else {
			sql.append("PJ_CUSTOM_DROPDOWN_VALUES2 = ");
			sql.append(SqlServerUtils.safeSql(AProjects.pjCustomDropdownValues2.toString()));
			sql.append(",");
		}
		if ((AProjects.pjCustomDropdownValues3 == null)) {
			sql.append("PJ_CUSTOM_DROPDOWN_VALUES3 = default ,");
		}
		else {
			sql.append("PJ_CUSTOM_DROPDOWN_VALUES3 = ");
			sql.append(SqlServerUtils.safeSql(AProjects.pjCustomDropdownValues3.toString()));
			sql.append(",");
		}
		sql.append("PJ_DEFAULT = ");
		sql.append(AProjects.pjDefault);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("PJ_ID = ");
		sql.append(AProjects.pjId);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param Projects 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, Projects AProjects, String appendConditionSql) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("PROJECTS set ");
		sql.append("PJ_NAME = ");
		sql.append(SqlServerUtils.safeSql(AProjects.pjName.toString()));
		sql.append(",");
		sql.append("PJ_ACTIVE = ");
		sql.append(AProjects.pjActive);
		sql.append(",");
		if ((AProjects.pjDefaultUser == null)) {
			sql.append("PJ_DEFAULT_USER = default ,");
		}
		else {
			sql.append("PJ_DEFAULT_USER = ");
			sql.append(AProjects.pjDefaultUser);
			sql.append(",");
		}
		if ((AProjects.pjAutoAssignDefaultUser == null)) {
			sql.append("PJ_AUTO_ASSIGN_DEFAULT_USER = default ,");
		}
		else {
			sql.append("PJ_AUTO_ASSIGN_DEFAULT_USER = ");
			sql.append(AProjects.pjAutoAssignDefaultUser);
			sql.append(",");
		}
		if ((AProjects.pjAutoSubscribeDefaultUser == null)) {
			sql.append("PJ_AUTO_SUBSCRIBE_DEFAULT_USER = default ,");
		}
		else {
			sql.append("PJ_AUTO_SUBSCRIBE_DEFAULT_USER = ");
			sql.append(AProjects.pjAutoSubscribeDefaultUser);
			sql.append(",");
		}
		if ((AProjects.pjEnablePop3 == null)) {
			sql.append("PJ_ENABLE_POP3 = default ,");
		}
		else {
			sql.append("PJ_ENABLE_POP3 = ");
			sql.append(AProjects.pjEnablePop3);
			sql.append(",");
		}
		if ((AProjects.pjPop3Username == null)) {
			sql.append("PJ_POP3_USERNAME = default ,");
		}
		else {
			sql.append("PJ_POP3_USERNAME = ");
			sql.append(SqlServerUtils.safeSql(AProjects.pjPop3Username.toString()));
			sql.append(",");
		}
		if ((AProjects.pjPop3Password == null)) {
			sql.append("PJ_POP3_PASSWORD = default ,");
		}
		else {
			sql.append("PJ_POP3_PASSWORD = ");
			sql.append(SqlServerUtils.safeSql(AProjects.pjPop3Password.toString()));
			sql.append(",");
		}
		if ((AProjects.pjPop3EmailFrom == null)) {
			sql.append("PJ_POP3_EMAIL_FROM = default ,");
		}
		else {
			sql.append("PJ_POP3_EMAIL_FROM = ");
			sql.append(SqlServerUtils.safeSql(AProjects.pjPop3EmailFrom.toString()));
			sql.append(",");
		}
		sql.append("PJ_ENABLE_CUSTOM_DROPDOWN1 = ");
		sql.append(AProjects.pjEnableCustomDropdown1);
		sql.append(",");
		sql.append("PJ_ENABLE_CUSTOM_DROPDOWN2 = ");
		sql.append(AProjects.pjEnableCustomDropdown2);
		sql.append(",");
		sql.append("PJ_ENABLE_CUSTOM_DROPDOWN3 = ");
		sql.append(AProjects.pjEnableCustomDropdown3);
		sql.append(",");
		if ((AProjects.pjCustomDropdownLabel1 == null)) {
			sql.append("PJ_CUSTOM_DROPDOWN_LABEL1 = default ,");
		}
		else {
			sql.append("PJ_CUSTOM_DROPDOWN_LABEL1 = ");
			sql.append(SqlServerUtils.safeSql(AProjects.pjCustomDropdownLabel1.toString()));
			sql.append(",");
		}
		if ((AProjects.pjCustomDropdownLabel2 == null)) {
			sql.append("PJ_CUSTOM_DROPDOWN_LABEL2 = default ,");
		}
		else {
			sql.append("PJ_CUSTOM_DROPDOWN_LABEL2 = ");
			sql.append(SqlServerUtils.safeSql(AProjects.pjCustomDropdownLabel2.toString()));
			sql.append(",");
		}
		if ((AProjects.pjCustomDropdownLabel3 == null)) {
			sql.append("PJ_CUSTOM_DROPDOWN_LABEL3 = default ,");
		}
		else {
			sql.append("PJ_CUSTOM_DROPDOWN_LABEL3 = ");
			sql.append(SqlServerUtils.safeSql(AProjects.pjCustomDropdownLabel3.toString()));
			sql.append(",");
		}
		if ((AProjects.pjCustomDropdownValues1 == null)) {
			sql.append("PJ_CUSTOM_DROPDOWN_VALUES1 = default ,");
		}
		else {
			sql.append("PJ_CUSTOM_DROPDOWN_VALUES1 = ");
			sql.append(SqlServerUtils.safeSql(AProjects.pjCustomDropdownValues1.toString()));
			sql.append(",");
		}
		if ((AProjects.pjCustomDropdownValues2 == null)) {
			sql.append("PJ_CUSTOM_DROPDOWN_VALUES2 = default ,");
		}
		else {
			sql.append("PJ_CUSTOM_DROPDOWN_VALUES2 = ");
			sql.append(SqlServerUtils.safeSql(AProjects.pjCustomDropdownValues2.toString()));
			sql.append(",");
		}
		if ((AProjects.pjCustomDropdownValues3 == null)) {
			sql.append("PJ_CUSTOM_DROPDOWN_VALUES3 = default ,");
		}
		else {
			sql.append("PJ_CUSTOM_DROPDOWN_VALUES3 = ");
			sql.append(SqlServerUtils.safeSql(AProjects.pjCustomDropdownValues3.toString()));
			sql.append(",");
		}
		sql.append("PJ_DEFAULT = ");
		sql.append(AProjects.pjDefault);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("PJ_ID = ");
		sql.append(AProjects.pjId);
		sql.append(appendConditionSql);
		return ADataVisit.execSql(sql.toString());
	}
	
	public String toString() {
		return this.pjName.toString();
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @param AppendSql 附加的Sql语句
	 * @return 查询结果
	 */
	public static List<Projects> selectObjects(IDataVisit2 ADataVisit, String AppendSql) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((Projects.getSelectSql() 
						+ (" from [PROJECTS] " + AppendSql)));
		List<Projects> list = new ArrayList<Projects>();
		try {
			for (; reader.next(); ) {
				Projects obj = new Projects();
				Projects.readValue(reader, obj);
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
	public static List<Projects> selectObjects(IDataVisit2 ADataVisit) throws SQLException {
		return Projects.selectObjects(ADataVisit, "");
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
	public static List<Projects> selectObjects(IDataVisit2 ADataVisit, String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((Projects.getSelectSql() 
						+ (" from [PROJECTS] " + AppendSql)), pageIndex, rowsOfPage, orderField, order);
		List<Projects> list = new ArrayList<Projects>();
		try {
			for (; reader.next(); ) {
				Projects obj = new Projects();
				Projects.readValue(reader, obj);
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
	public static List<Projects> selectObjects(IDataVisit2 ADataVisit, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		return Projects.selectObjects(ADataVisit, "", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 从数据表PROJECTS中查询一个实体对象
	 * @param ADataVisit 数据访问接口
	 * @param Int32 
	 */
	public static Projects SelectByPjId(IDataVisit2 ADataVisit, int APjId) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append(" where ");
		sql.append("PJ_ID = ");
		sql.append(APjId);
		List<Projects> list = Projects.selectObjects(ADataVisit, sql.toString());
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
			Projects o = ((Projects)(obj));
			this.pjId = o.pjId;
			this.pjName = o.pjName;
			this.pjActive = o.pjActive;
			this.pjDefaultUser = o.pjDefaultUser;
			this.pjAutoAssignDefaultUser = o.pjAutoAssignDefaultUser;
			this.pjAutoSubscribeDefaultUser = o.pjAutoSubscribeDefaultUser;
			this.pjEnablePop3 = o.pjEnablePop3;
			this.pjPop3Username = o.pjPop3Username;
			this.pjPop3Password = o.pjPop3Password;
			this.pjPop3EmailFrom = o.pjPop3EmailFrom;
			this.pjEnableCustomDropdown1 = o.pjEnableCustomDropdown1;
			this.pjEnableCustomDropdown2 = o.pjEnableCustomDropdown2;
			this.pjEnableCustomDropdown3 = o.pjEnableCustomDropdown3;
			this.pjCustomDropdownLabel1 = o.pjCustomDropdownLabel1;
			this.pjCustomDropdownLabel2 = o.pjCustomDropdownLabel2;
			this.pjCustomDropdownLabel3 = o.pjCustomDropdownLabel3;
			this.pjCustomDropdownValues1 = o.pjCustomDropdownValues1;
			this.pjCustomDropdownValues2 = o.pjCustomDropdownValues2;
			this.pjCustomDropdownValues3 = o.pjCustomDropdownValues3;
			this.pjDefault = o.pjDefault;
		}
	}
	
	/**
	 * 复制值到给定的对象,要求目标对象是子类
	 * @param object 目标对象
	 */
	public void assignTo(BaseTable obj) {
		super.assignTo(obj);
		if (this.getClass().isInstance(obj)) {
			Projects o = ((Projects)(obj));
			o.pjId = this.pjId;
			o.pjName = this.pjName;
			o.pjActive = this.pjActive;
			o.pjDefaultUser = this.pjDefaultUser;
			o.pjAutoAssignDefaultUser = this.pjAutoAssignDefaultUser;
			o.pjAutoSubscribeDefaultUser = this.pjAutoSubscribeDefaultUser;
			o.pjEnablePop3 = this.pjEnablePop3;
			o.pjPop3Username = this.pjPop3Username;
			o.pjPop3Password = this.pjPop3Password;
			o.pjPop3EmailFrom = this.pjPop3EmailFrom;
			o.pjEnableCustomDropdown1 = this.pjEnableCustomDropdown1;
			o.pjEnableCustomDropdown2 = this.pjEnableCustomDropdown2;
			o.pjEnableCustomDropdown3 = this.pjEnableCustomDropdown3;
			o.pjCustomDropdownLabel1 = this.pjCustomDropdownLabel1;
			o.pjCustomDropdownLabel2 = this.pjCustomDropdownLabel2;
			o.pjCustomDropdownLabel3 = this.pjCustomDropdownLabel3;
			o.pjCustomDropdownValues1 = this.pjCustomDropdownValues1;
			o.pjCustomDropdownValues2 = this.pjCustomDropdownValues2;
			o.pjCustomDropdownValues3 = this.pjCustomDropdownValues3;
			o.pjDefault = this.pjDefault;
		}
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * <@param appendSql 附加的条件语句>
	 */
	public static void deleteByPjId(IDataVisit2 ADataVisit, int APjId, String appendSql) throws SQLException, DbException {
		String sql = "";
		sql = (sql + " delete from PROJECTS where ");
		sql = (sql + "PJ_ID = ");
		sql = (sql + APjId);
		sql = (sql + appendSql);
		ADataVisit.execSql(sql);
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 */
	public static void deleteByPjId(IDataVisit2 ADataVisit, int APjId) throws SQLException, DbException {
		Projects.deleteByPjId(ADataVisit, APjId, "");
	}
	
	/**
	 * 把ResultSet中的数据转到对象中
	 * @param AReader 数据源
	 * @param AProjects 目标对象
	 * @return 
	 */
	public static void readValue(ResultSet AReader, Projects AProjects) throws SQLException {
		AProjects.pjId = AReader.getInt(1);
		AProjects.pjName = AReader.getString(2);
		AProjects.pjActive = AReader.getInt(3);
		AProjects.pjDefaultUser = AReader.getInt(4);
		if (AReader.wasNull()) {
			AProjects.pjDefaultUser = null;
		}
		AProjects.pjAutoAssignDefaultUser = AReader.getInt(5);
		if (AReader.wasNull()) {
			AProjects.pjAutoAssignDefaultUser = null;
		}
		AProjects.pjAutoSubscribeDefaultUser = AReader.getInt(6);
		if (AReader.wasNull()) {
			AProjects.pjAutoSubscribeDefaultUser = null;
		}
		AProjects.pjEnablePop3 = AReader.getInt(7);
		if (AReader.wasNull()) {
			AProjects.pjEnablePop3 = null;
		}
		AProjects.pjPop3Username = AReader.getString(8);
		if (AReader.wasNull()) {
			AProjects.pjPop3Username = null;
		}
		AProjects.pjPop3Password = AReader.getString(9);
		if (AReader.wasNull()) {
			AProjects.pjPop3Password = null;
		}
		AProjects.pjPop3EmailFrom = AReader.getString(10);
		if (AReader.wasNull()) {
			AProjects.pjPop3EmailFrom = null;
		}
		AProjects.pjEnableCustomDropdown1 = AReader.getInt(11);
		AProjects.pjEnableCustomDropdown2 = AReader.getInt(12);
		AProjects.pjEnableCustomDropdown3 = AReader.getInt(13);
		AProjects.pjCustomDropdownLabel1 = AReader.getString(14);
		if (AReader.wasNull()) {
			AProjects.pjCustomDropdownLabel1 = null;
		}
		AProjects.pjCustomDropdownLabel2 = AReader.getString(15);
		if (AReader.wasNull()) {
			AProjects.pjCustomDropdownLabel2 = null;
		}
		AProjects.pjCustomDropdownLabel3 = AReader.getString(16);
		if (AReader.wasNull()) {
			AProjects.pjCustomDropdownLabel3 = null;
		}
		AProjects.pjCustomDropdownValues1 = AReader.getString(17);
		if (AReader.wasNull()) {
			AProjects.pjCustomDropdownValues1 = null;
		}
		AProjects.pjCustomDropdownValues2 = AReader.getString(18);
		if (AReader.wasNull()) {
			AProjects.pjCustomDropdownValues2 = null;
		}
		AProjects.pjCustomDropdownValues3 = AReader.getString(19);
		if (AReader.wasNull()) {
			AProjects.pjCustomDropdownValues3 = null;
		}
		AProjects.pjDefault = AReader.getInt(20);
	}
}
