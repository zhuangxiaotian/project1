package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_PROJECT查询条件定义
 */
public class IssueProjectQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,INNER_PROJ_ID: 内部工程ID
	 */
	Integer innerProjId;
	
	/**
	 * 查询条件开始值,INNER_PROJ_ID: 内部工程ID
	 */
	Integer innerProjIdBegin;
	
	/**
	 * 查询条件结束值,INNER_PROJ_ID: 内部工程ID
	 */
	Integer innerProjIdEnd;
	
	/**
	 * 查询条件结束值,INNER_PROJ_ID: 内部工程ID
	 */
	Integer innerProjIdEndEqual;
	
	/**
	 * 查询条件,DEFAULT_USER_ID: 默认处理用户
	 */
	Integer defaultUserId;
	
	/**
	 * 查询条件开始值,DEFAULT_USER_ID: 默认处理用户
	 */
	Integer defaultUserIdBegin;
	
	/**
	 * 查询条件结束值,DEFAULT_USER_ID: 默认处理用户
	 */
	Integer defaultUserIdEnd;
	
	/**
	 * 查询条件结束值,DEFAULT_USER_ID: 默认处理用户
	 */
	Integer defaultUserIdEndEqual;
	
	/**
	 * 查询条件,ISSUE_PROJECT_NAME: 项目名称
	 */
	String issueProjectName;
	
	/**
	 * 查询条件字符串相等,ISSUE_PROJECT_NAME: 项目名称
	 */
	String issueProjectNameEqual;
	
	/**
	 * 查询条件,PROJECT_ACTIVE: 项目是否激活
	 */
	Boolean projectActive;
	
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
	 * INNER_PROJ_ID: 内部工程ID
	 */
	public Integer getInnerProjId() {
		return this.innerProjId;
	}
	
	/**
	 * INNER_PROJ_ID: 内部工程ID
	 */
	public void setInnerProjId(Integer value)
	 {
		this.innerProjId = value;
	}
	
	/**
	 * 查询条件开始值,INNER_PROJ_ID: 内部工程ID
	 */
	public Integer getInnerProjIdBegin() {
		return this.innerProjIdBegin;
	}
	
	/**
	 * 查询条件开始值,INNER_PROJ_ID: 内部工程ID
	 */
	public void setInnerProjIdBegin(Integer value)
	 {
		this.innerProjIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,INNER_PROJ_ID: 内部工程ID
	 */
	public Integer getInnerProjIdEnd() {
		return this.innerProjIdEnd;
	}
	
	/**
	 * 查询条件结束值,INNER_PROJ_ID: 内部工程ID
	 */
	public void setInnerProjIdEnd(Integer value)
	 {
		this.innerProjIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,INNER_PROJ_ID: 内部工程ID
	 */
	public Integer getInnerProjIdEndEqual() {
		return this.innerProjIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,INNER_PROJ_ID: 内部工程ID
	 */
	public void setInnerProjIdEndEqual(Integer value)
	 {
		this.innerProjIdEndEqual = value;
	}
	
	/**
	 * DEFAULT_USER_ID: 默认处理用户
	 */
	public Integer getDefaultUserId() {
		return this.defaultUserId;
	}
	
	/**
	 * DEFAULT_USER_ID: 默认处理用户
	 */
	public void setDefaultUserId(Integer value)
	 {
		this.defaultUserId = value;
	}
	
	/**
	 * 查询条件开始值,DEFAULT_USER_ID: 默认处理用户
	 */
	public Integer getDefaultUserIdBegin() {
		return this.defaultUserIdBegin;
	}
	
	/**
	 * 查询条件开始值,DEFAULT_USER_ID: 默认处理用户
	 */
	public void setDefaultUserIdBegin(Integer value)
	 {
		this.defaultUserIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,DEFAULT_USER_ID: 默认处理用户
	 */
	public Integer getDefaultUserIdEnd() {
		return this.defaultUserIdEnd;
	}
	
	/**
	 * 查询条件结束值,DEFAULT_USER_ID: 默认处理用户
	 */
	public void setDefaultUserIdEnd(Integer value)
	 {
		this.defaultUserIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,DEFAULT_USER_ID: 默认处理用户
	 */
	public Integer getDefaultUserIdEndEqual() {
		return this.defaultUserIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,DEFAULT_USER_ID: 默认处理用户
	 */
	public void setDefaultUserIdEndEqual(Integer value)
	 {
		this.defaultUserIdEndEqual = value;
	}
	
	/**
	 * ISSUE_PROJECT_NAME: 项目名称
	 */
	public String getIssueProjectName() {
		return this.issueProjectName;
	}
	
	/**
	 * ISSUE_PROJECT_NAME: 项目名称
	 */
	public void setIssueProjectName(String value)
	 {
		this.issueProjectName = value;
	}
	
	/**
	 * 查询条件字符串相等,ISSUE_PROJECT_NAME: 项目名称
	 */
	public String getIssueProjectNameEqual() {
		return this.issueProjectNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,ISSUE_PROJECT_NAME: 项目名称
	 */
	public void setIssueProjectNameEqual(String value)
	 {
		this.issueProjectNameEqual = value;
	}
	
	/**
	 * PROJECT_ACTIVE: 项目是否激活
	 */
	public Boolean getProjectActive() {
		return this.projectActive;
	}
	
	/**
	 * PROJECT_ACTIVE: 项目是否激活
	 */
	public void setProjectActive(Boolean value)
	 {
		this.projectActive = value;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 标识
	 */
	public IssueProjectQueryCondition setIssueProjectIdCondition(Integer value) {
		this.issueProjectId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 标识
	 */
	public IssueProjectQueryCondition setIssueProjectIdConditionBegin(Integer value) {
		this.issueProjectIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 标识
	 */
	public IssueProjectQueryCondition setIssueProjectIdConditionEnd(Integer value) {
		this.issueProjectIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 标识
	 */
	public IssueProjectQueryCondition setIssueProjectIdConditionEndEqual(Integer value) {
		this.issueProjectIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件INNER_PROJ_ID: 内部工程ID
	 */
	public IssueProjectQueryCondition setInnerProjIdCondition(Integer value) {
		this.innerProjId = value;
		return this;
	}
	
	/**
	 * 设置查询条件INNER_PROJ_ID: 内部工程ID
	 */
	public IssueProjectQueryCondition setInnerProjIdConditionBegin(Integer value) {
		this.innerProjIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件INNER_PROJ_ID: 内部工程ID
	 */
	public IssueProjectQueryCondition setInnerProjIdConditionEnd(Integer value) {
		this.innerProjIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件INNER_PROJ_ID: 内部工程ID
	 */
	public IssueProjectQueryCondition setInnerProjIdConditionEndEqual(Integer value) {
		this.innerProjIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEFAULT_USER_ID: 默认处理用户
	 */
	public IssueProjectQueryCondition setDefaultUserIdCondition(Integer value) {
		this.defaultUserId = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEFAULT_USER_ID: 默认处理用户
	 */
	public IssueProjectQueryCondition setDefaultUserIdConditionBegin(Integer value) {
		this.defaultUserIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEFAULT_USER_ID: 默认处理用户
	 */
	public IssueProjectQueryCondition setDefaultUserIdConditionEnd(Integer value) {
		this.defaultUserIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEFAULT_USER_ID: 默认处理用户
	 */
	public IssueProjectQueryCondition setDefaultUserIdConditionEndEqual(Integer value) {
		this.defaultUserIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_NAME: 项目名称
	 */
	public IssueProjectQueryCondition setIssueProjectNameCondition(String value) {
		this.issueProjectName = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_NAME: 项目名称
	 */
	public IssueProjectQueryCondition setIssueProjectNameConditionEqual(String value) {
		this.issueProjectNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_ACTIVE: 项目是否激活
	 */
	public IssueProjectQueryCondition setProjectActiveCondition(Boolean value) {
		this.projectActive = value;
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
						+ ((" and ([T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] = " + this.issueProjectId) 
						+ ") "));
		}
		if ((this.issueProjectIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] >= " 
						+ (this.issueProjectIdBegin + ")")));
		}
		if ((this.issueProjectIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] < " 
						+ (this.issueProjectIdEnd + ") ")));
		}
		if ((this.issueProjectIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT].[ISSUE_PROJECT_ID] <= " 
						+ (this.issueProjectIdEndEqual + ") ")));
		}
		if ((this.innerProjId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_PROJECT].[INNER_PROJ_ID] = " + this.innerProjId) 
						+ ") "));
		}
		if ((this.innerProjIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT].[INNER_PROJ_ID] >= " 
						+ (this.innerProjIdBegin + ")")));
		}
		if ((this.innerProjIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT].[INNER_PROJ_ID] < " 
						+ (this.innerProjIdEnd + ") ")));
		}
		if ((this.innerProjIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT].[INNER_PROJ_ID] <= " 
						+ (this.innerProjIdEndEqual + ") ")));
		}
		if ((this.defaultUserId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_PROJECT].[DEFAULT_USER_ID] = " + this.defaultUserId) 
						+ ") "));
		}
		if ((this.defaultUserIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT].[DEFAULT_USER_ID] >= " 
						+ (this.defaultUserIdBegin + ")")));
		}
		if ((this.defaultUserIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT].[DEFAULT_USER_ID] < " 
						+ (this.defaultUserIdEnd + ") ")));
		}
		if ((this.defaultUserIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PROJECT].[DEFAULT_USER_ID] <= " 
						+ (this.defaultUserIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.issueProjectName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ISSUE_PROJECT].[ISSUE_PROJECT_NAME]", this.issueProjectName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.issueProjectNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ISSUE_PROJECT].[ISSUE_PROJECT_NAME] = " + SqlServerUtils.safeSql(this.issueProjectNameEqual))) 
						+ ") "));
		}
		if ((this.projectActive == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_PROJECT].[PROJECT_ACTIVE] = " + SqlServerUtils.getBoolSql(this.projectActive)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
