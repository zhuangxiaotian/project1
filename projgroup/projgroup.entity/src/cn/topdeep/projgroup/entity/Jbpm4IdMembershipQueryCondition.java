package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_ID_MEMBERSHIP查询条件定义
 */
public class Jbpm4IdMembershipQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,USER_: 
	 */
	Double user;
	
	/**
	 * 查询条件开始值,USER_: 
	 */
	Double userBegin;
	
	/**
	 * 查询条件结束值,USER_: 
	 */
	Double userEnd;
	
	/**
	 * 查询条件结束值,USER_: 
	 */
	Double userEndEqual;
	
	/**
	 * 查询条件,GROUP_: 
	 */
	Double group;
	
	/**
	 * 查询条件开始值,GROUP_: 
	 */
	Double groupBegin;
	
	/**
	 * 查询条件结束值,GROUP_: 
	 */
	Double groupEnd;
	
	/**
	 * 查询条件结束值,GROUP_: 
	 */
	Double groupEndEqual;
	
	/**
	 * 查询条件,NAME_: 
	 */
	String name;
	
	/**
	 * 查询条件字符串相等,NAME_: 
	 */
	String nameEqual;
	
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
	 * USER_: 
	 */
	public Double getUser() {
		return this.user;
	}
	
	/**
	 * USER_: 
	 */
	public void setUser(Double value)
	 {
		this.user = value;
	}
	
	/**
	 * 查询条件开始值,USER_: 
	 */
	public Double getUserBegin() {
		return this.userBegin;
	}
	
	/**
	 * 查询条件开始值,USER_: 
	 */
	public void setUserBegin(Double value)
	 {
		this.userBegin = value;
	}
	
	/**
	 * 查询条件结束值,USER_: 
	 */
	public Double getUserEnd() {
		return this.userEnd;
	}
	
	/**
	 * 查询条件结束值,USER_: 
	 */
	public void setUserEnd(Double value)
	 {
		this.userEnd = value;
	}
	
	/**
	 * 查询条件结束值,USER_: 
	 */
	public Double getUserEndEqual() {
		return this.userEndEqual;
	}
	
	/**
	 * 查询条件结束值,USER_: 
	 */
	public void setUserEndEqual(Double value)
	 {
		this.userEndEqual = value;
	}
	
	/**
	 * GROUP_: 
	 */
	public Double getGroup() {
		return this.group;
	}
	
	/**
	 * GROUP_: 
	 */
	public void setGroup(Double value)
	 {
		this.group = value;
	}
	
	/**
	 * 查询条件开始值,GROUP_: 
	 */
	public Double getGroupBegin() {
		return this.groupBegin;
	}
	
	/**
	 * 查询条件开始值,GROUP_: 
	 */
	public void setGroupBegin(Double value)
	 {
		this.groupBegin = value;
	}
	
	/**
	 * 查询条件结束值,GROUP_: 
	 */
	public Double getGroupEnd() {
		return this.groupEnd;
	}
	
	/**
	 * 查询条件结束值,GROUP_: 
	 */
	public void setGroupEnd(Double value)
	 {
		this.groupEnd = value;
	}
	
	/**
	 * 查询条件结束值,GROUP_: 
	 */
	public Double getGroupEndEqual() {
		return this.groupEndEqual;
	}
	
	/**
	 * 查询条件结束值,GROUP_: 
	 */
	public void setGroupEndEqual(Double value)
	 {
		this.groupEndEqual = value;
	}
	
	/**
	 * NAME_: 
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * NAME_: 
	 */
	public void setName(String value)
	 {
		this.name = value;
	}
	
	/**
	 * 查询条件字符串相等,NAME_: 
	 */
	public String getNameEqual() {
		return this.nameEqual;
	}
	
	/**
	 * 查询条件字符串相等,NAME_: 
	 */
	public void setNameEqual(String value)
	 {
		this.nameEqual = value;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4IdMembershipQueryCondition setDbidCondition(Double value) {
		this.dbid = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4IdMembershipQueryCondition setDbidConditionBegin(Double value) {
		this.dbidBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4IdMembershipQueryCondition setDbidConditionEnd(Double value) {
		this.dbidEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4IdMembershipQueryCondition setDbidConditionEndEqual(Double value) {
		this.dbidEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4IdMembershipQueryCondition setDbversionCondition(Integer value) {
		this.dbversion = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4IdMembershipQueryCondition setDbversionConditionBegin(Integer value) {
		this.dbversionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4IdMembershipQueryCondition setDbversionConditionEnd(Integer value) {
		this.dbversionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4IdMembershipQueryCondition setDbversionConditionEndEqual(Integer value) {
		this.dbversionEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_: 
	 */
	public Jbpm4IdMembershipQueryCondition setUserCondition(Double value) {
		this.user = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_: 
	 */
	public Jbpm4IdMembershipQueryCondition setUserConditionBegin(Double value) {
		this.userBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_: 
	 */
	public Jbpm4IdMembershipQueryCondition setUserConditionEnd(Double value) {
		this.userEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_: 
	 */
	public Jbpm4IdMembershipQueryCondition setUserConditionEndEqual(Double value) {
		this.userEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件GROUP_: 
	 */
	public Jbpm4IdMembershipQueryCondition setGroupCondition(Double value) {
		this.group = value;
		return this;
	}
	
	/**
	 * 设置查询条件GROUP_: 
	 */
	public Jbpm4IdMembershipQueryCondition setGroupConditionBegin(Double value) {
		this.groupBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件GROUP_: 
	 */
	public Jbpm4IdMembershipQueryCondition setGroupConditionEnd(Double value) {
		this.groupEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件GROUP_: 
	 */
	public Jbpm4IdMembershipQueryCondition setGroupConditionEndEqual(Double value) {
		this.groupEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAME_: 
	 */
	public Jbpm4IdMembershipQueryCondition setNameCondition(String value) {
		this.name = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAME_: 
	 */
	public Jbpm4IdMembershipQueryCondition setNameConditionEqual(String value) {
		this.nameEqual = value;
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
						+ ((" and ([JBPM4_ID_MEMBERSHIP].[DBID_] = " + this.dbid) 
						+ ") "));
		}
		if ((this.dbidBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_MEMBERSHIP].[DBID_] >= " 
						+ (this.dbidBegin + ")")));
		}
		if ((this.dbidEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_MEMBERSHIP].[DBID_] < " 
						+ (this.dbidEnd + ") ")));
		}
		if ((this.dbidEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_MEMBERSHIP].[DBID_] <= " 
						+ (this.dbidEndEqual + ") ")));
		}
		if ((this.dbversion == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_ID_MEMBERSHIP].[DBVERSION_] = " + this.dbversion) 
						+ ") "));
		}
		if ((this.dbversionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_MEMBERSHIP].[DBVERSION_] >= " 
						+ (this.dbversionBegin + ")")));
		}
		if ((this.dbversionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_MEMBERSHIP].[DBVERSION_] < " 
						+ (this.dbversionEnd + ") ")));
		}
		if ((this.dbversionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_MEMBERSHIP].[DBVERSION_] <= " 
						+ (this.dbversionEndEqual + ") ")));
		}
		if ((this.user == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_ID_MEMBERSHIP].[USER_] = " + this.user) 
						+ ") "));
		}
		if ((this.userBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_MEMBERSHIP].[USER_] >= " 
						+ (this.userBegin + ")")));
		}
		if ((this.userEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_MEMBERSHIP].[USER_] < " 
						+ (this.userEnd + ") ")));
		}
		if ((this.userEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_MEMBERSHIP].[USER_] <= " 
						+ (this.userEndEqual + ") ")));
		}
		if ((this.group == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_ID_MEMBERSHIP].[GROUP_] = " + this.group) 
						+ ") "));
		}
		if ((this.groupBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_MEMBERSHIP].[GROUP_] >= " 
						+ (this.groupBegin + ")")));
		}
		if ((this.groupEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_MEMBERSHIP].[GROUP_] < " 
						+ (this.groupEnd + ") ")));
		}
		if ((this.groupEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_MEMBERSHIP].[GROUP_] <= " 
						+ (this.groupEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.name)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_ID_MEMBERSHIP].[NAME_]", this.name)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.nameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_ID_MEMBERSHIP].[NAME_] = " + SqlServerUtils.safeSql(this.nameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
