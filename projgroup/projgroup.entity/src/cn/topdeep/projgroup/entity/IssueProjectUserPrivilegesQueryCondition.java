package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_PROJECT_USER_PRIVILEGES查询条件定义
 */
public class IssueProjectUserPrivilegesQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,ISSUE_PROJECT_ID: 标识
	 */
	Integer issueProjectId;
	
	/**
	 * 查询条件开始值,ISSUE_PROJECT_ID: 标识
	 */
	Integer issueProjectIdBegin;
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_ID: 标识
	 */
	Integer issueProjectIdEnd;
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_ID: 标识
	 */
	Integer issueProjectIdEndEqual;
	
	/**
	 * 查询条件,ISSUE_USER_ID: 用户标识
	 */
	Integer issueUserId;
	
	/**
	 * 查询条件开始值,ISSUE_USER_ID: 用户标识
	 */
	Integer issueUserIdBegin;
	
	/**
	 * 查询条件结束值,ISSUE_USER_ID: 用户标识
	 */
	Integer issueUserIdEnd;
	
	/**
	 * 查询条件结束值,ISSUE_USER_ID: 用户标识
	 */
	Integer issueUserIdEndEqual;
	
	/**
	 * 查询条件,ROLE_ID: 标识
	 */
	Integer roleId;
	
	/**
	 * 查询条件开始值,ROLE_ID: 标识
	 */
	Integer roleIdBegin;
	
	/**
	 * 查询条件结束值,ROLE_ID: 标识
	 */
	Integer roleIdEnd;
	
	/**
	 * 查询条件结束值,ROLE_ID: 标识
	 */
	Integer roleIdEndEqual;
	
	/**
	 * ISSUE_PROJECT_ID: 标识
	 */
	public Integer getIssueProjectId() {
		return this.issueProjectId;
	}
	
	/**
	 * ISSUE_PROJECT_ID: 标识
	 */
	public void setIssueProjectId(Integer value)
	 {
		this.issueProjectId = value;
	}
	
	/**
	 * 查询条件开始值,ISSUE_PROJECT_ID: 标识
	 */
	public Integer getIssueProjectIdBegin() {
		return this.issueProjectIdBegin;
	}
	
	/**
	 * 查询条件开始值,ISSUE_PROJECT_ID: 标识
	 */
	public void setIssueProjectIdBegin(Integer value)
	 {
		this.issueProjectIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_ID: 标识
	 */
	public Integer getIssueProjectIdEnd() {
		return this.issueProjectIdEnd;
	}
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_ID: 标识
	 */
	public void setIssueProjectIdEnd(Integer value)
	 {
		this.issueProjectIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_ID: 标识
	 */
	public Integer getIssueProjectIdEndEqual() {
		return this.issueProjectIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_ID: 标识
	 */
	public void setIssueProjectIdEndEqual(Integer value)
	 {
		this.issueProjectIdEndEqual = value;
	}
	
	/**
	 * ISSUE_USER_ID: 用户标识
	 */
	public Integer getIssueUserId() {
		return this.issueUserId;
	}
	
	/**
	 * ISSUE_USER_ID: 用户标识
	 */
	public void setIssueUserId(Integer value)
	 {
		this.issueUserId = value;
	}
	
	/**
	 * 查询条件开始值,ISSUE_USER_ID: 用户标识
	 */
	public Integer getIssueUserIdBegin() {
		return this.issueUserIdBegin;
	}
	
	/**
	 * 查询条件开始值,ISSUE_USER_ID: 用户标识
	 */
	public void setIssueUserIdBegin(Integer value)
	 {
		this.issueUserIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_USER_ID: 用户标识
	 */
	public Integer getIssueUserIdEnd() {
		return this.issueUserIdEnd;
	}
	
	/**
	 * 查询条件结束值,ISSUE_USER_ID: 用户标识
	 */
	public void setIssueUserIdEnd(Integer value)
	 {
		this.issueUserIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_USER_ID: 用户标识
	 */
	public Integer getIssueUserIdEndEqual() {
		return this.issueUserIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,ISSUE_USER_ID: 用户标识
	 */
	public void setIssueUserIdEndEqual(Integer value)
	 {
		this.issueUserIdEndEqual = value;
	}
	
	/**
	 * ROLE_ID: 标识
	 */
	public Integer getRoleId() {
		return this.roleId;
	}
	
	/**
	 * ROLE_ID: 标识
	 */
	public void setRoleId(Integer value)
	 {
		this.roleId = value;
	}
	
	/**
	 * 查询条件开始值,ROLE_ID: 标识
	 */
	public Integer getRoleIdBegin() {
		return this.roleIdBegin;
	}
	
	/**
	 * 查询条件开始值,ROLE_ID: 标识
	 */
	public void setRoleIdBegin(Integer value)
	 {
		this.roleIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,ROLE_ID: 标识
	 */
	public Integer getRoleIdEnd() {
		return this.roleIdEnd;
	}
	
	/**
	 * 查询条件结束值,ROLE_ID: 标识
	 */
	public void setRoleIdEnd(Integer value)
	 {
		this.roleIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,ROLE_ID: 标识
	 */
	public Integer getRoleIdEndEqual() {
		return this.roleIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,ROLE_ID: 标识
	 */
	public void setRoleIdEndEqual(Integer value)
	 {
		this.roleIdEndEqual = value;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 标识
	 */
	public IssueProjectUserPrivilegesQueryCondition setIssueProjectIdCondition(Integer value) {
		this.issueProjectId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 标识
	 */
	public IssueProjectUserPrivilegesQueryCondition setIssueProjectIdConditionBegin(Integer value) {
		this.issueProjectIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 标识
	 */
	public IssueProjectUserPrivilegesQueryCondition setIssueProjectIdConditionEnd(Integer value) {
		this.issueProjectIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 标识
	 */
	public IssueProjectUserPrivilegesQueryCondition setIssueProjectIdConditionEndEqual(Integer value) {
		this.issueProjectIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_USER_ID: 用户标识
	 */
	public IssueProjectUserPrivilegesQueryCondition setIssueUserIdCondition(Integer value) {
		this.issueUserId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_USER_ID: 用户标识
	 */
	public IssueProjectUserPrivilegesQueryCondition setIssueUserIdConditionBegin(Integer value) {
		this.issueUserIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_USER_ID: 用户标识
	 */
	public IssueProjectUserPrivilegesQueryCondition setIssueUserIdConditionEnd(Integer value) {
		this.issueUserIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_USER_ID: 用户标识
	 */
	public IssueProjectUserPrivilegesQueryCondition setIssueUserIdConditionEndEqual(Integer value) {
		this.issueUserIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_ID: 标识
	 */
	public IssueProjectUserPrivilegesQueryCondition setRoleIdCondition(Integer value) {
		this.roleId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_ID: 标识
	 */
	public IssueProjectUserPrivilegesQueryCondition setRoleIdConditionBegin(Integer value) {
		this.roleIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_ID: 标识
	 */
	public IssueProjectUserPrivilegesQueryCondition setRoleIdConditionEnd(Integer value) {
		this.roleIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_ID: 标识
	 */
	public IssueProjectUserPrivilegesQueryCondition setRoleIdConditionEndEqual(Integer value) {
		this.roleIdEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.issueProjectId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_PROJECT_USER_PRIVILEGES].[ISSUE_PROJECT_ID] = " + this.issueProjectId) 
						+ ") "));
		}
		if ((this.issueProjectIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT_USER_PRIVILEGES].[ISSUE_PROJECT_ID] >= " 
						+ (this.issueProjectIdBegin + ")")));
		}
		if ((this.issueProjectIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT_USER_PRIVILEGES].[ISSUE_PROJECT_ID] < " 
						+ (this.issueProjectIdEnd + ") ")));
		}
		if ((this.issueProjectIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT_USER_PRIVILEGES].[ISSUE_PROJECT_ID] <= " 
						+ (this.issueProjectIdEndEqual + ") ")));
		}
		if ((this.issueUserId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_PROJECT_USER_PRIVILEGES].[ISSUE_USER_ID] = " + this.issueUserId) 
						+ ") "));
		}
		if ((this.issueUserIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT_USER_PRIVILEGES].[ISSUE_USER_ID] >= " 
						+ (this.issueUserIdBegin + ")")));
		}
		if ((this.issueUserIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT_USER_PRIVILEGES].[ISSUE_USER_ID] < " 
						+ (this.issueUserIdEnd + ") ")));
		}
		if ((this.issueUserIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT_USER_PRIVILEGES].[ISSUE_USER_ID] <= " 
						+ (this.issueUserIdEndEqual + ") ")));
		}
		if ((this.roleId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_PROJECT_USER_PRIVILEGES].[ROLE_ID] = " + this.roleId) 
						+ ") "));
		}
		if ((this.roleIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT_USER_PRIVILEGES].[ROLE_ID] >= " 
						+ (this.roleIdBegin + ")")));
		}
		if ((this.roleIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT_USER_PRIVILEGES].[ROLE_ID] < " 
						+ (this.roleIdEnd + ") ")));
		}
		if ((this.roleIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT_USER_PRIVILEGES].[ROLE_ID] <= " 
						+ (this.roleIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
