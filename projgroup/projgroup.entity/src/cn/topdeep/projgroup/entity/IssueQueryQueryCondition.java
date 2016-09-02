package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_QUERY查询条件定义
 */
public class IssueQueryQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,ISSUE_CREATE_USER_ID: 创建用户
	 */
	Integer issueCreateUserId;
	
	/**
	 * 查询条件开始值,ISSUE_CREATE_USER_ID: 创建用户
	 */
	Integer issueCreateUserIdBegin;
	
	/**
	 * 查询条件结束值,ISSUE_CREATE_USER_ID: 创建用户
	 */
	Integer issueCreateUserIdEnd;
	
	/**
	 * 查询条件结束值,ISSUE_CREATE_USER_ID: 创建用户
	 */
	Integer issueCreateUserIdEndEqual;
	
	/**
	 * 查询条件,ISSUE_PROJECT_ID: 关联项目
	 */
	Integer issueProjectId;
	
	/**
	 * 查询条件开始值,ISSUE_PROJECT_ID: 关联项目
	 */
	Integer issueProjectIdBegin;
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_ID: 关联项目
	 */
	Integer issueProjectIdEnd;
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_ID: 关联项目
	 */
	Integer issueProjectIdEndEqual;
	
	/**
	 * 查询条件,ISSUE_QUERY_NAME: 查询名称
	 */
	String issueQueryName;
	
	/**
	 * 查询条件字符串相等,ISSUE_QUERY_NAME: 查询名称
	 */
	String issueQueryNameEqual;
	
	/**
	 * 查询条件,ISSUE_QUERY_SQL: 查询语句
	 */
	String issueQuerySql;
	
	/**
	 * 查询条件字符串相等,ISSUE_QUERY_SQL: 查询语句
	 */
	String issueQuerySqlEqual;
	
	/**
	 * 查询条件,ISSUE_QUERY_MEMO: 查询备注
	 */
	String issueQueryMemo;
	
	/**
	 * 查询条件字符串相等,ISSUE_QUERY_MEMO: 查询备注
	 */
	String issueQueryMemoEqual;
	
	/**
	 * 查询条件,IS_PUBLIC: 是否公开
	 */
	Boolean isPublic;
	
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
	 * ISSUE_CREATE_USER_ID: 创建用户
	 */
	public Integer getIssueCreateUserId() {
		return this.issueCreateUserId;
	}
	
	/**
	 * ISSUE_CREATE_USER_ID: 创建用户
	 */
	public void setIssueCreateUserId(Integer value)
	 {
		this.issueCreateUserId = value;
	}
	
	/**
	 * 查询条件开始值,ISSUE_CREATE_USER_ID: 创建用户
	 */
	public Integer getIssueCreateUserIdBegin() {
		return this.issueCreateUserIdBegin;
	}
	
	/**
	 * 查询条件开始值,ISSUE_CREATE_USER_ID: 创建用户
	 */
	public void setIssueCreateUserIdBegin(Integer value)
	 {
		this.issueCreateUserIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_CREATE_USER_ID: 创建用户
	 */
	public Integer getIssueCreateUserIdEnd() {
		return this.issueCreateUserIdEnd;
	}
	
	/**
	 * 查询条件结束值,ISSUE_CREATE_USER_ID: 创建用户
	 */
	public void setIssueCreateUserIdEnd(Integer value)
	 {
		this.issueCreateUserIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_CREATE_USER_ID: 创建用户
	 */
	public Integer getIssueCreateUserIdEndEqual() {
		return this.issueCreateUserIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,ISSUE_CREATE_USER_ID: 创建用户
	 */
	public void setIssueCreateUserIdEndEqual(Integer value)
	 {
		this.issueCreateUserIdEndEqual = value;
	}
	
	/**
	 * ISSUE_PROJECT_ID: 关联项目
	 */
	public Integer getIssueProjectId() {
		return this.issueProjectId;
	}
	
	/**
	 * ISSUE_PROJECT_ID: 关联项目
	 */
	public void setIssueProjectId(Integer value)
	 {
		this.issueProjectId = value;
	}
	
	/**
	 * 查询条件开始值,ISSUE_PROJECT_ID: 关联项目
	 */
	public Integer getIssueProjectIdBegin() {
		return this.issueProjectIdBegin;
	}
	
	/**
	 * 查询条件开始值,ISSUE_PROJECT_ID: 关联项目
	 */
	public void setIssueProjectIdBegin(Integer value)
	 {
		this.issueProjectIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_ID: 关联项目
	 */
	public Integer getIssueProjectIdEnd() {
		return this.issueProjectIdEnd;
	}
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_ID: 关联项目
	 */
	public void setIssueProjectIdEnd(Integer value)
	 {
		this.issueProjectIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_ID: 关联项目
	 */
	public Integer getIssueProjectIdEndEqual() {
		return this.issueProjectIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_ID: 关联项目
	 */
	public void setIssueProjectIdEndEqual(Integer value)
	 {
		this.issueProjectIdEndEqual = value;
	}
	
	/**
	 * ISSUE_QUERY_NAME: 查询名称
	 */
	public String getIssueQueryName() {
		return this.issueQueryName;
	}
	
	/**
	 * ISSUE_QUERY_NAME: 查询名称
	 */
	public void setIssueQueryName(String value)
	 {
		this.issueQueryName = value;
	}
	
	/**
	 * 查询条件字符串相等,ISSUE_QUERY_NAME: 查询名称
	 */
	public String getIssueQueryNameEqual() {
		return this.issueQueryNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,ISSUE_QUERY_NAME: 查询名称
	 */
	public void setIssueQueryNameEqual(String value)
	 {
		this.issueQueryNameEqual = value;
	}
	
	/**
	 * ISSUE_QUERY_SQL: 查询语句
	 */
	public String getIssueQuerySql() {
		return this.issueQuerySql;
	}
	
	/**
	 * ISSUE_QUERY_SQL: 查询语句
	 */
	public void setIssueQuerySql(String value)
	 {
		this.issueQuerySql = value;
	}
	
	/**
	 * 查询条件字符串相等,ISSUE_QUERY_SQL: 查询语句
	 */
	public String getIssueQuerySqlEqual() {
		return this.issueQuerySqlEqual;
	}
	
	/**
	 * 查询条件字符串相等,ISSUE_QUERY_SQL: 查询语句
	 */
	public void setIssueQuerySqlEqual(String value)
	 {
		this.issueQuerySqlEqual = value;
	}
	
	/**
	 * ISSUE_QUERY_MEMO: 查询备注
	 */
	public String getIssueQueryMemo() {
		return this.issueQueryMemo;
	}
	
	/**
	 * ISSUE_QUERY_MEMO: 查询备注
	 */
	public void setIssueQueryMemo(String value)
	 {
		this.issueQueryMemo = value;
	}
	
	/**
	 * 查询条件字符串相等,ISSUE_QUERY_MEMO: 查询备注
	 */
	public String getIssueQueryMemoEqual() {
		return this.issueQueryMemoEqual;
	}
	
	/**
	 * 查询条件字符串相等,ISSUE_QUERY_MEMO: 查询备注
	 */
	public void setIssueQueryMemoEqual(String value)
	 {
		this.issueQueryMemoEqual = value;
	}
	
	/**
	 * IS_PUBLIC: 是否公开
	 */
	public Boolean getIsPublic() {
		return this.isPublic;
	}
	
	/**
	 * IS_PUBLIC: 是否公开
	 */
	public void setIsPublic(Boolean value)
	 {
		this.isPublic = value;
	}
	
	/**
	 * 设置查询条件ISSUE_QUERY_ID: 标识
	 */
	public IssueQueryQueryCondition setIssueQueryIdCondition(Integer value) {
		this.issueQueryId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_QUERY_ID: 标识
	 */
	public IssueQueryQueryCondition setIssueQueryIdConditionBegin(Integer value) {
		this.issueQueryIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_QUERY_ID: 标识
	 */
	public IssueQueryQueryCondition setIssueQueryIdConditionEnd(Integer value) {
		this.issueQueryIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_QUERY_ID: 标识
	 */
	public IssueQueryQueryCondition setIssueQueryIdConditionEndEqual(Integer value) {
		this.issueQueryIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_CREATE_USER_ID: 创建用户
	 */
	public IssueQueryQueryCondition setIssueCreateUserIdCondition(Integer value) {
		this.issueCreateUserId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_CREATE_USER_ID: 创建用户
	 */
	public IssueQueryQueryCondition setIssueCreateUserIdConditionBegin(Integer value) {
		this.issueCreateUserIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_CREATE_USER_ID: 创建用户
	 */
	public IssueQueryQueryCondition setIssueCreateUserIdConditionEnd(Integer value) {
		this.issueCreateUserIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_CREATE_USER_ID: 创建用户
	 */
	public IssueQueryQueryCondition setIssueCreateUserIdConditionEndEqual(Integer value) {
		this.issueCreateUserIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 关联项目
	 */
	public IssueQueryQueryCondition setIssueProjectIdCondition(Integer value) {
		this.issueProjectId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 关联项目
	 */
	public IssueQueryQueryCondition setIssueProjectIdConditionBegin(Integer value) {
		this.issueProjectIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 关联项目
	 */
	public IssueQueryQueryCondition setIssueProjectIdConditionEnd(Integer value) {
		this.issueProjectIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 关联项目
	 */
	public IssueQueryQueryCondition setIssueProjectIdConditionEndEqual(Integer value) {
		this.issueProjectIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_QUERY_NAME: 查询名称
	 */
	public IssueQueryQueryCondition setIssueQueryNameCondition(String value) {
		this.issueQueryName = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_QUERY_NAME: 查询名称
	 */
	public IssueQueryQueryCondition setIssueQueryNameConditionEqual(String value) {
		this.issueQueryNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_QUERY_SQL: 查询语句
	 */
	public IssueQueryQueryCondition setIssueQuerySqlCondition(String value) {
		this.issueQuerySql = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_QUERY_SQL: 查询语句
	 */
	public IssueQueryQueryCondition setIssueQuerySqlConditionEqual(String value) {
		this.issueQuerySqlEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_QUERY_MEMO: 查询备注
	 */
	public IssueQueryQueryCondition setIssueQueryMemoCondition(String value) {
		this.issueQueryMemo = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_QUERY_MEMO: 查询备注
	 */
	public IssueQueryQueryCondition setIssueQueryMemoConditionEqual(String value) {
		this.issueQueryMemoEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件IS_PUBLIC: 是否公开
	 */
	public IssueQueryQueryCondition setIsPublicCondition(Boolean value) {
		this.isPublic = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.issueQueryId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_QUERY].[ISSUE_QUERY_ID] = " + this.issueQueryId) 
						+ ") "));
		}
		if ((this.issueQueryIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_QUERY].[ISSUE_QUERY_ID] >= " 
						+ (this.issueQueryIdBegin + ")")));
		}
		if ((this.issueQueryIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_QUERY].[ISSUE_QUERY_ID] < " 
						+ (this.issueQueryIdEnd + ") ")));
		}
		if ((this.issueQueryIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_QUERY].[ISSUE_QUERY_ID] <= " 
						+ (this.issueQueryIdEndEqual + ") ")));
		}
		if ((this.issueCreateUserId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_QUERY].[ISSUE_CREATE_USER_ID] = " + this.issueCreateUserId) 
						+ ") "));
		}
		if ((this.issueCreateUserIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_QUERY].[ISSUE_CREATE_USER_ID] >= " 
						+ (this.issueCreateUserIdBegin + ")")));
		}
		if ((this.issueCreateUserIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_QUERY].[ISSUE_CREATE_USER_ID] < " 
						+ (this.issueCreateUserIdEnd + ") ")));
		}
		if ((this.issueCreateUserIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_QUERY].[ISSUE_CREATE_USER_ID] <= " 
						+ (this.issueCreateUserIdEndEqual + ") ")));
		}
		if ((this.issueProjectId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_QUERY].[ISSUE_PROJECT_ID] = " + this.issueProjectId) 
						+ ") "));
		}
		if ((this.issueProjectIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_QUERY].[ISSUE_PROJECT_ID] >= " 
						+ (this.issueProjectIdBegin + ")")));
		}
		if ((this.issueProjectIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_QUERY].[ISSUE_PROJECT_ID] < " 
						+ (this.issueProjectIdEnd + ") ")));
		}
		if ((this.issueProjectIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_QUERY].[ISSUE_PROJECT_ID] <= " 
						+ (this.issueProjectIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.issueQueryName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ISSUE_QUERY].[ISSUE_QUERY_NAME]", this.issueQueryName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.issueQueryNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ISSUE_QUERY].[ISSUE_QUERY_NAME] = " + SqlServerUtils.safeSql(this.issueQueryNameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.issueQuerySql)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ISSUE_QUERY].[ISSUE_QUERY_SQL]", this.issueQuerySql)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.issueQuerySqlEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ISSUE_QUERY].[ISSUE_QUERY_SQL] = " + SqlServerUtils.safeSql(this.issueQuerySqlEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.issueQueryMemo)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ISSUE_QUERY].[ISSUE_QUERY_MEMO]", this.issueQueryMemo)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.issueQueryMemoEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ISSUE_QUERY].[ISSUE_QUERY_MEMO] = " + SqlServerUtils.safeSql(this.issueQueryMemoEqual))) 
						+ ") "));
		}
		if ((this.isPublic == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_QUERY].[IS_PUBLIC] = " + SqlServerUtils.getBoolSql(this.isPublic)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
