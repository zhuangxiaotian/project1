package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_ROLE_DEFAULT_QUERY查询条件定义
 */
public class IssueRoleDefaultQueryQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,ISSUE_QUERY_ID: 标识
	 */
	Integer issueQueryId;
	
	/**
	 * 查询条件开始值,ISSUE_QUERY_ID: 标识
	 */
	Integer issueQueryIdBegin;
	
	/**
	 * 查询条件结束值,ISSUE_QUERY_ID: 标识
	 */
	Integer issueQueryIdEnd;
	
	/**
	 * 查询条件结束值,ISSUE_QUERY_ID: 标识
	 */
	Integer issueQueryIdEndEqual;
	
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
	 * ISSUE_QUERY_ID: 标识
	 */
	public Integer getIssueQueryId() {
		return this.issueQueryId;
	}
	
	/**
	 * ISSUE_QUERY_ID: 标识
	 */
	public void setIssueQueryId(Integer value)
	 {
		this.issueQueryId = value;
	}
	
	/**
	 * 查询条件开始值,ISSUE_QUERY_ID: 标识
	 */
	public Integer getIssueQueryIdBegin() {
		return this.issueQueryIdBegin;
	}
	
	/**
	 * 查询条件开始值,ISSUE_QUERY_ID: 标识
	 */
	public void setIssueQueryIdBegin(Integer value)
	 {
		this.issueQueryIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_QUERY_ID: 标识
	 */
	public Integer getIssueQueryIdEnd() {
		return this.issueQueryIdEnd;
	}
	
	/**
	 * 查询条件结束值,ISSUE_QUERY_ID: 标识
	 */
	public void setIssueQueryIdEnd(Integer value)
	 {
		this.issueQueryIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_QUERY_ID: 标识
	 */
	public Integer getIssueQueryIdEndEqual() {
		return this.issueQueryIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,ISSUE_QUERY_ID: 标识
	 */
	public void setIssueQueryIdEndEqual(Integer value)
	 {
		this.issueQueryIdEndEqual = value;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 标识
	 */
	public IssueRoleDefaultQueryQueryCondition setIssueProjectIdCondition(Integer value) {
		this.issueProjectId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 标识
	 */
	public IssueRoleDefaultQueryQueryCondition setIssueProjectIdConditionBegin(Integer value) {
		this.issueProjectIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 标识
	 */
	public IssueRoleDefaultQueryQueryCondition setIssueProjectIdConditionEnd(Integer value) {
		this.issueProjectIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 标识
	 */
	public IssueRoleDefaultQueryQueryCondition setIssueProjectIdConditionEndEqual(Integer value) {
		this.issueProjectIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_ID: 标识
	 */
	public IssueRoleDefaultQueryQueryCondition setRoleIdCondition(Integer value) {
		this.roleId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_ID: 标识
	 */
	public IssueRoleDefaultQueryQueryCondition setRoleIdConditionBegin(Integer value) {
		this.roleIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_ID: 标识
	 */
	public IssueRoleDefaultQueryQueryCondition setRoleIdConditionEnd(Integer value) {
		this.roleIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_ID: 标识
	 */
	public IssueRoleDefaultQueryQueryCondition setRoleIdConditionEndEqual(Integer value) {
		this.roleIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_QUERY_ID: 标识
	 */
	public IssueRoleDefaultQueryQueryCondition setIssueQueryIdCondition(Integer value) {
		this.issueQueryId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_QUERY_ID: 标识
	 */
	public IssueRoleDefaultQueryQueryCondition setIssueQueryIdConditionBegin(Integer value) {
		this.issueQueryIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_QUERY_ID: 标识
	 */
	public IssueRoleDefaultQueryQueryCondition setIssueQueryIdConditionEnd(Integer value) {
		this.issueQueryIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_QUERY_ID: 标识
	 */
	public IssueRoleDefaultQueryQueryCondition setIssueQueryIdConditionEndEqual(Integer value) {
		this.issueQueryIdEndEqual = value;
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
						+ ((" and ([T_ISSUE_ROLE_DEFAULT_QUERY].[ISSUE_PROJECT_ID] = " + this.issueProjectId) 
						+ ") "));
		}
		if ((this.issueProjectIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_ROLE_DEFAULT_QUERY].[ISSUE_PROJECT_ID] >= " 
						+ (this.issueProjectIdBegin + ")")));
		}
		if ((this.issueProjectIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_ROLE_DEFAULT_QUERY].[ISSUE_PROJECT_ID] < " 
						+ (this.issueProjectIdEnd + ") ")));
		}
		if ((this.issueProjectIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_ROLE_DEFAULT_QUERY].[ISSUE_PROJECT_ID] <= " 
						+ (this.issueProjectIdEndEqual + ") ")));
		}
		if ((this.roleId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_ROLE_DEFAULT_QUERY].[ROLE_ID] = " + this.roleId) 
						+ ") "));
		}
		if ((this.roleIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_ROLE_DEFAULT_QUERY].[ROLE_ID] >= " 
						+ (this.roleIdBegin + ")")));
		}
		if ((this.roleIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_ROLE_DEFAULT_QUERY].[ROLE_ID] < " 
						+ (this.roleIdEnd + ") ")));
		}
		if ((this.roleIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_ROLE_DEFAULT_QUERY].[ROLE_ID] <= " 
						+ (this.roleIdEndEqual + ") ")));
		}
		if ((this.issueQueryId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_ROLE_DEFAULT_QUERY].[ISSUE_QUERY_ID] = " + this.issueQueryId) 
						+ ") "));
		}
		if ((this.issueQueryIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_ROLE_DEFAULT_QUERY].[ISSUE_QUERY_ID] >= " 
						+ (this.issueQueryIdBegin + ")")));
		}
		if ((this.issueQueryIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_ROLE_DEFAULT_QUERY].[ISSUE_QUERY_ID] < " 
						+ (this.issueQueryIdEnd + ") ")));
		}
		if ((this.issueQueryIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_ROLE_DEFAULT_QUERY].[ISSUE_QUERY_ID] <= " 
						+ (this.issueQueryIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
