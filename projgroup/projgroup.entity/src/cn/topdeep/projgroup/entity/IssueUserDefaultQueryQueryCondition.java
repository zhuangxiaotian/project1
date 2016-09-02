package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_USER_DEFAULT_QUERY查询条件定义
 */
public class IssueUserDefaultQueryQueryCondition extends Object implements ConditionQuery {
	
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
	public IssueUserDefaultQueryQueryCondition setIssueProjectIdCondition(Integer value) {
		this.issueProjectId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 标识
	 */
	public IssueUserDefaultQueryQueryCondition setIssueProjectIdConditionBegin(Integer value) {
		this.issueProjectIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 标识
	 */
	public IssueUserDefaultQueryQueryCondition setIssueProjectIdConditionEnd(Integer value) {
		this.issueProjectIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 标识
	 */
	public IssueUserDefaultQueryQueryCondition setIssueProjectIdConditionEndEqual(Integer value) {
		this.issueProjectIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_USER_ID: 用户标识
	 */
	public IssueUserDefaultQueryQueryCondition setIssueUserIdCondition(Integer value) {
		this.issueUserId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_USER_ID: 用户标识
	 */
	public IssueUserDefaultQueryQueryCondition setIssueUserIdConditionBegin(Integer value) {
		this.issueUserIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_USER_ID: 用户标识
	 */
	public IssueUserDefaultQueryQueryCondition setIssueUserIdConditionEnd(Integer value) {
		this.issueUserIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_USER_ID: 用户标识
	 */
	public IssueUserDefaultQueryQueryCondition setIssueUserIdConditionEndEqual(Integer value) {
		this.issueUserIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_QUERY_ID: 标识
	 */
	public IssueUserDefaultQueryQueryCondition setIssueQueryIdCondition(Integer value) {
		this.issueQueryId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_QUERY_ID: 标识
	 */
	public IssueUserDefaultQueryQueryCondition setIssueQueryIdConditionBegin(Integer value) {
		this.issueQueryIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_QUERY_ID: 标识
	 */
	public IssueUserDefaultQueryQueryCondition setIssueQueryIdConditionEnd(Integer value) {
		this.issueQueryIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_QUERY_ID: 标识
	 */
	public IssueUserDefaultQueryQueryCondition setIssueQueryIdConditionEndEqual(Integer value) {
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
						+ ((" and ([T_ISSUE_USER_DEFAULT_QUERY].[ISSUE_PROJECT_ID] = " + this.issueProjectId) 
						+ ") "));
		}
		if ((this.issueProjectIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USER_DEFAULT_QUERY].[ISSUE_PROJECT_ID] >= " 
						+ (this.issueProjectIdBegin + ")")));
		}
		if ((this.issueProjectIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USER_DEFAULT_QUERY].[ISSUE_PROJECT_ID] < " 
						+ (this.issueProjectIdEnd + ") ")));
		}
		if ((this.issueProjectIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USER_DEFAULT_QUERY].[ISSUE_PROJECT_ID] <= " 
						+ (this.issueProjectIdEndEqual + ") ")));
		}
		if ((this.issueUserId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_USER_DEFAULT_QUERY].[ISSUE_USER_ID] = " + this.issueUserId) 
						+ ") "));
		}
		if ((this.issueUserIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USER_DEFAULT_QUERY].[ISSUE_USER_ID] >= " 
						+ (this.issueUserIdBegin + ")")));
		}
		if ((this.issueUserIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USER_DEFAULT_QUERY].[ISSUE_USER_ID] < " 
						+ (this.issueUserIdEnd + ") ")));
		}
		if ((this.issueUserIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USER_DEFAULT_QUERY].[ISSUE_USER_ID] <= " 
						+ (this.issueUserIdEndEqual + ") ")));
		}
		if ((this.issueQueryId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_USER_DEFAULT_QUERY].[ISSUE_QUERY_ID] = " + this.issueQueryId) 
						+ ") "));
		}
		if ((this.issueQueryIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USER_DEFAULT_QUERY].[ISSUE_QUERY_ID] >= " 
						+ (this.issueQueryIdBegin + ")")));
		}
		if ((this.issueQueryIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USER_DEFAULT_QUERY].[ISSUE_QUERY_ID] < " 
						+ (this.issueQueryIdEnd + ") ")));
		}
		if ((this.issueQueryIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USER_DEFAULT_QUERY].[ISSUE_QUERY_ID] <= " 
						+ (this.issueQueryIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
