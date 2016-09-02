package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_PROJECT_MODULE查询条件定义
 */
public class IssueProjectModuleQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,ISSUE_PROJECT_MODULE_ID: 标识
	 */
	Integer issueProjectModuleId;
	
	/**
	 * 查询条件开始值,ISSUE_PROJECT_MODULE_ID: 标识
	 */
	Integer issueProjectModuleIdBegin;
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_MODULE_ID: 标识
	 */
	Integer issueProjectModuleIdEnd;
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_MODULE_ID: 标识
	 */
	Integer issueProjectModuleIdEndEqual;
	
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
	 * 查询条件,MODULE_NAME: 模块名称
	 */
	String moduleName;
	
	/**
	 * 查询条件字符串相等,MODULE_NAME: 模块名称
	 */
	String moduleNameEqual;
	
	/**
	 * ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public Integer getIssueProjectModuleId() {
		return this.issueProjectModuleId;
	}
	
	/**
	 * ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public void setIssueProjectModuleId(Integer value)
	 {
		this.issueProjectModuleId = value;
	}
	
	/**
	 * 查询条件开始值,ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public Integer getIssueProjectModuleIdBegin() {
		return this.issueProjectModuleIdBegin;
	}
	
	/**
	 * 查询条件开始值,ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public void setIssueProjectModuleIdBegin(Integer value)
	 {
		this.issueProjectModuleIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public Integer getIssueProjectModuleIdEnd() {
		return this.issueProjectModuleIdEnd;
	}
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public void setIssueProjectModuleIdEnd(Integer value)
	 {
		this.issueProjectModuleIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public Integer getIssueProjectModuleIdEndEqual() {
		return this.issueProjectModuleIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public void setIssueProjectModuleIdEndEqual(Integer value)
	 {
		this.issueProjectModuleIdEndEqual = value;
	}
	
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
	 * MODULE_NAME: 模块名称
	 */
	public String getModuleName() {
		return this.moduleName;
	}
	
	/**
	 * MODULE_NAME: 模块名称
	 */
	public void setModuleName(String value)
	 {
		this.moduleName = value;
	}
	
	/**
	 * 查询条件字符串相等,MODULE_NAME: 模块名称
	 */
	public String getModuleNameEqual() {
		return this.moduleNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,MODULE_NAME: 模块名称
	 */
	public void setModuleNameEqual(String value)
	 {
		this.moduleNameEqual = value;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public IssueProjectModuleQueryCondition setIssueProjectModuleIdCondition(Integer value) {
		this.issueProjectModuleId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public IssueProjectModuleQueryCondition setIssueProjectModuleIdConditionBegin(Integer value) {
		this.issueProjectModuleIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public IssueProjectModuleQueryCondition setIssueProjectModuleIdConditionEnd(Integer value) {
		this.issueProjectModuleIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public IssueProjectModuleQueryCondition setIssueProjectModuleIdConditionEndEqual(Integer value) {
		this.issueProjectModuleIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 标识
	 */
	public IssueProjectModuleQueryCondition setIssueProjectIdCondition(Integer value) {
		this.issueProjectId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 标识
	 */
	public IssueProjectModuleQueryCondition setIssueProjectIdConditionBegin(Integer value) {
		this.issueProjectIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 标识
	 */
	public IssueProjectModuleQueryCondition setIssueProjectIdConditionEnd(Integer value) {
		this.issueProjectIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 标识
	 */
	public IssueProjectModuleQueryCondition setIssueProjectIdConditionEndEqual(Integer value) {
		this.issueProjectIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODULE_NAME: 模块名称
	 */
	public IssueProjectModuleQueryCondition setModuleNameCondition(String value) {
		this.moduleName = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODULE_NAME: 模块名称
	 */
	public IssueProjectModuleQueryCondition setModuleNameConditionEqual(String value) {
		this.moduleNameEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.issueProjectModuleId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_PROJECT_MODULE].[ISSUE_PROJECT_MODULE_ID] = " + this.issueProjectModuleId) 
						+ ") "));
		}
		if ((this.issueProjectModuleIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT_MODULE].[ISSUE_PROJECT_MODULE_ID] >= " 
						+ (this.issueProjectModuleIdBegin + ")")));
		}
		if ((this.issueProjectModuleIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT_MODULE].[ISSUE_PROJECT_MODULE_ID] < " 
						+ (this.issueProjectModuleIdEnd + ") ")));
		}
		if ((this.issueProjectModuleIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT_MODULE].[ISSUE_PROJECT_MODULE_ID] <= " 
						+ (this.issueProjectModuleIdEndEqual + ") ")));
		}
		if ((this.issueProjectId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_PROJECT_MODULE].[ISSUE_PROJECT_ID] = " + this.issueProjectId) 
						+ ") "));
		}
		if ((this.issueProjectIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT_MODULE].[ISSUE_PROJECT_ID] >= " 
						+ (this.issueProjectIdBegin + ")")));
		}
		if ((this.issueProjectIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT_MODULE].[ISSUE_PROJECT_ID] < " 
						+ (this.issueProjectIdEnd + ") ")));
		}
		if ((this.issueProjectIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT_MODULE].[ISSUE_PROJECT_ID] <= " 
						+ (this.issueProjectIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.moduleName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ISSUE_PROJECT_MODULE].[MODULE_NAME]", this.moduleName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.moduleNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ISSUE_PROJECT_MODULE].[MODULE_NAME] = " + SqlServerUtils.safeSql(this.moduleNameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
