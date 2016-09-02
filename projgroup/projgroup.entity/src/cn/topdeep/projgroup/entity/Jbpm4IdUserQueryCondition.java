package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_ID_USER查询条件定义
 */
public class Jbpm4IdUserQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,DBID_: 
	 */
	Double dbid;
	
	/**
	 * 查询条件开始值,DBID_: 
	 */
	Double dbidBegin;
	
	/**
	 * 查询条件结束值,DBID_: 
	 */
	Double dbidEnd;
	
	/**
	 * 查询条件结束值,DBID_: 
	 */
	Double dbidEndEqual;
	
	/**
	 * 查询条件,DBVERSION_: 
	 */
	Integer dbversion;
	
	/**
	 * 查询条件开始值,DBVERSION_: 
	 */
	Integer dbversionBegin;
	
	/**
	 * 查询条件结束值,DBVERSION_: 
	 */
	Integer dbversionEnd;
	
	/**
	 * 查询条件结束值,DBVERSION_: 
	 */
	Integer dbversionEndEqual;
	
	/**
	 * 查询条件,ID_: 
	 */
	String id;
	
	/**
	 * 查询条件字符串相等,ID_: 
	 */
	String idEqual;
	
	/**
	 * 查询条件,PASSWORD_: 
	 */
	String password;
	
	/**
	 * 查询条件字符串相等,PASSWORD_: 
	 */
	String passwordEqual;
	
	/**
	 * 查询条件,GIVENNAME_: 
	 */
	String givenname;
	
	/**
	 * 查询条件字符串相等,GIVENNAME_: 
	 */
	String givennameEqual;
	
	/**
	 * 查询条件,FAMILYNAME_: 
	 */
	String familyname;
	
	/**
	 * 查询条件字符串相等,FAMILYNAME_: 
	 */
	String familynameEqual;
	
	/**
	 * 查询条件,BUSINESSEMAIL_: 
	 */
	String businessemail;
	
	/**
	 * 查询条件字符串相等,BUSINESSEMAIL_: 
	 */
	String businessemailEqual;
	
	/**
	 * DBID_: 
	 */
	public Double getDbid() {
		return this.dbid;
	}
	
	/**
	 * DBID_: 
	 */
	public void setDbid(Double value)
	 {
		this.dbid = value;
	}
	
	/**
	 * 查询条件开始值,DBID_: 
	 */
	public Double getDbidBegin() {
		return this.dbidBegin;
	}
	
	/**
	 * 查询条件开始值,DBID_: 
	 */
	public void setDbidBegin(Double value)
	 {
		this.dbidBegin = value;
	}
	
	/**
	 * 查询条件结束值,DBID_: 
	 */
	public Double getDbidEnd() {
		return this.dbidEnd;
	}
	
	/**
	 * 查询条件结束值,DBID_: 
	 */
	public void setDbidEnd(Double value)
	 {
		this.dbidEnd = value;
	}
	
	/**
	 * 查询条件结束值,DBID_: 
	 */
	public Double getDbidEndEqual() {
		return this.dbidEndEqual;
	}
	
	/**
	 * 查询条件结束值,DBID_: 
	 */
	public void setDbidEndEqual(Double value)
	 {
		this.dbidEndEqual = value;
	}
	
	/**
	 * DBVERSION_: 
	 */
	public Integer getDbversion() {
		return this.dbversion;
	}
	
	/**
	 * DBVERSION_: 
	 */
	public void setDbversion(Integer value)
	 {
		this.dbversion = value;
	}
	
	/**
	 * 查询条件开始值,DBVERSION_: 
	 */
	public Integer getDbversionBegin() {
		return this.dbversionBegin;
	}
	
	/**
	 * 查询条件开始值,DBVERSION_: 
	 */
	public void setDbversionBegin(Integer value)
	 {
		this.dbversionBegin = value;
	}
	
	/**
	 * 查询条件结束值,DBVERSION_: 
	 */
	public Integer getDbversionEnd() {
		return this.dbversionEnd;
	}
	
	/**
	 * 查询条件结束值,DBVERSION_: 
	 */
	public void setDbversionEnd(Integer value)
	 {
		this.dbversionEnd = value;
	}
	
	/**
	 * 查询条件结束值,DBVERSION_: 
	 */
	public Integer getDbversionEndEqual() {
		return this.dbversionEndEqual;
	}
	
	/**
	 * 查询条件结束值,DBVERSION_: 
	 */
	public void setDbversionEndEqual(Integer value)
	 {
		this.dbversionEndEqual = value;
	}
	
	/**
	 * ID_: 
	 */
	public String getId() {
		return this.id;
	}
	
	/**
	 * ID_: 
	 */
	public void setId(String value)
	 {
		this.id = value;
	}
	
	/**
	 * 查询条件字符串相等,ID_: 
	 */
	public String getIdEqual() {
		return this.idEqual;
	}
	
	/**
	 * 查询条件字符串相等,ID_: 
	 */
	public void setIdEqual(String value)
	 {
		this.idEqual = value;
	}
	
	/**
	 * PASSWORD_: 
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * PASSWORD_: 
	 */
	public void setPassword(String value)
	 {
		this.password = value;
	}
	
	/**
	 * 查询条件字符串相等,PASSWORD_: 
	 */
	public String getPasswordEqual() {
		return this.passwordEqual;
	}
	
	/**
	 * 查询条件字符串相等,PASSWORD_: 
	 */
	public void setPasswordEqual(String value)
	 {
		this.passwordEqual = value;
	}
	
	/**
	 * GIVENNAME_: 
	 */
	public String getGivenname() {
		return this.givenname;
	}
	
	/**
	 * GIVENNAME_: 
	 */
	public void setGivenname(String value)
	 {
		this.givenname = value;
	}
	
	/**
	 * 查询条件字符串相等,GIVENNAME_: 
	 */
	public String getGivennameEqual() {
		return this.givennameEqual;
	}
	
	/**
	 * 查询条件字符串相等,GIVENNAME_: 
	 */
	public void setGivennameEqual(String value)
	 {
		this.givennameEqual = value;
	}
	
	/**
	 * FAMILYNAME_: 
	 */
	public String getFamilyname() {
		return this.familyname;
	}
	
	/**
	 * FAMILYNAME_: 
	 */
	public void setFamilyname(String value)
	 {
		this.familyname = value;
	}
	
	/**
	 * 查询条件字符串相等,FAMILYNAME_: 
	 */
	public String getFamilynameEqual() {
		return this.familynameEqual;
	}
	
	/**
	 * 查询条件字符串相等,FAMILYNAME_: 
	 */
	public void setFamilynameEqual(String value)
	 {
		this.familynameEqual = value;
	}
	
	/**
	 * BUSINESSEMAIL_: 
	 */
	public String getBusinessemail() {
		return this.businessemail;
	}
	
	/**
	 * BUSINESSEMAIL_: 
	 */
	public void setBusinessemail(String value)
	 {
		this.businessemail = value;
	}
	
	/**
	 * 查询条件字符串相等,BUSINESSEMAIL_: 
	 */
	public String getBusinessemailEqual() {
		return this.businessemailEqual;
	}
	
	/**
	 * 查询条件字符串相等,BUSINESSEMAIL_: 
	 */
	public void setBusinessemailEqual(String value)
	 {
		this.businessemailEqual = value;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4IdUserQueryCondition setDbidCondition(Double value) {
		this.dbid = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4IdUserQueryCondition setDbidConditionBegin(Double value) {
		this.dbidBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4IdUserQueryCondition setDbidConditionEnd(Double value) {
		this.dbidEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4IdUserQueryCondition setDbidConditionEndEqual(Double value) {
		this.dbidEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4IdUserQueryCondition setDbversionCondition(Integer value) {
		this.dbversion = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4IdUserQueryCondition setDbversionConditionBegin(Integer value) {
		this.dbversionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4IdUserQueryCondition setDbversionConditionEnd(Integer value) {
		this.dbversionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4IdUserQueryCondition setDbversionConditionEndEqual(Integer value) {
		this.dbversionEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ID_: 
	 */
	public Jbpm4IdUserQueryCondition setIdCondition(String value) {
		this.id = value;
		return this;
	}
	
	/**
	 * 设置查询条件ID_: 
	 */
	public Jbpm4IdUserQueryCondition setIdConditionEqual(String value) {
		this.idEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PASSWORD_: 
	 */
	public Jbpm4IdUserQueryCondition setPasswordCondition(String value) {
		this.password = value;
		return this;
	}
	
	/**
	 * 设置查询条件PASSWORD_: 
	 */
	public Jbpm4IdUserQueryCondition setPasswordConditionEqual(String value) {
		this.passwordEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件GIVENNAME_: 
	 */
	public Jbpm4IdUserQueryCondition setGivennameCondition(String value) {
		this.givenname = value;
		return this;
	}
	
	/**
	 * 设置查询条件GIVENNAME_: 
	 */
	public Jbpm4IdUserQueryCondition setGivennameConditionEqual(String value) {
		this.givennameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件FAMILYNAME_: 
	 */
	public Jbpm4IdUserQueryCondition setFamilynameCondition(String value) {
		this.familyname = value;
		return this;
	}
	
	/**
	 * 设置查询条件FAMILYNAME_: 
	 */
	public Jbpm4IdUserQueryCondition setFamilynameConditionEqual(String value) {
		this.familynameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUSINESSEMAIL_: 
	 */
	public Jbpm4IdUserQueryCondition setBusinessemailCondition(String value) {
		this.businessemail = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUSINESSEMAIL_: 
	 */
	public Jbpm4IdUserQueryCondition setBusinessemailConditionEqual(String value) {
		this.businessemailEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.dbid == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_ID_USER].[DBID_] = " + this.dbid) 
						+ ") "));
		}
		if ((this.dbidBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_USER].[DBID_] >= " 
						+ (this.dbidBegin + ")")));
		}
		if ((this.dbidEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_USER].[DBID_] < " 
						+ (this.dbidEnd + ") ")));
		}
		if ((this.dbidEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_USER].[DBID_] <= " 
						+ (this.dbidEndEqual + ") ")));
		}
		if ((this.dbversion == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_ID_USER].[DBVERSION_] = " + this.dbversion) 
						+ ") "));
		}
		if ((this.dbversionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_USER].[DBVERSION_] >= " 
						+ (this.dbversionBegin + ")")));
		}
		if ((this.dbversionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_USER].[DBVERSION_] < " 
						+ (this.dbversionEnd + ") ")));
		}
		if ((this.dbversionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_USER].[DBVERSION_] <= " 
						+ (this.dbversionEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.id)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_ID_USER].[ID_]", this.id)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.idEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_ID_USER].[ID_] = " + SqlServerUtils.safeSql(this.idEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.password)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_ID_USER].[PASSWORD_]", this.password)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.passwordEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_ID_USER].[PASSWORD_] = " + SqlServerUtils.safeSql(this.passwordEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.givenname)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_ID_USER].[GIVENNAME_]", this.givenname)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.givennameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_ID_USER].[GIVENNAME_] = " + SqlServerUtils.safeSql(this.givennameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.familyname)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_ID_USER].[FAMILYNAME_]", this.familyname)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.familynameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_ID_USER].[FAMILYNAME_] = " + SqlServerUtils.safeSql(this.familynameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.businessemail)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_ID_USER].[BUSINESSEMAIL_]", this.businessemail)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.businessemailEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_ID_USER].[BUSINESSEMAIL_] = " + SqlServerUtils.safeSql(this.businessemailEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
