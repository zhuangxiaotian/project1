package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_USERS查询条件定义
 */
public class IssueUsersQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,INNER_USER_ID: 关联到内部的ID
	 */
	Integer innerUserId;
	
	/**
	 * 查询条件开始值,INNER_USER_ID: 关联到内部的ID
	 */
	Integer innerUserIdBegin;
	
	/**
	 * 查询条件结束值,INNER_USER_ID: 关联到内部的ID
	 */
	Integer innerUserIdEnd;
	
	/**
	 * 查询条件结束值,INNER_USER_ID: 关联到内部的ID
	 */
	Integer innerUserIdEndEqual;
	
	/**
	 * 查询条件,ISSUE_USER_NAME: 用户名称
	 */
	String issueUserName;
	
	/**
	 * 查询条件字符串相等,ISSUE_USER_NAME: 用户名称
	 */
	String issueUserNameEqual;
	
	/**
	 * 查询条件,ISSUE_USER_TYPE: 类型的意思区别内部用户和外部用户 0 内部用户 1 外部用户
	 */
	Byte issueUserType;
	
	/**
	 * 查询条件开始值,ISSUE_USER_TYPE: 类型的意思区别内部用户和外部用户 0 内部用户 1 外部用户
	 */
	Byte issueUserTypeBegin;
	
	/**
	 * 查询条件结束值,ISSUE_USER_TYPE: 类型的意思区别内部用户和外部用户 0 内部用户 1 外部用户
	 */
	Byte issueUserTypeEnd;
	
	/**
	 * 查询条件结束值,ISSUE_USER_TYPE: 类型的意思区别内部用户和外部用户 0 内部用户 1 外部用户
	 */
	Byte issueUserTypeEndEqual;
	
	/**
	 * 查询条件,LOGIN_NAME: 登录名称
	 */
	String loginName;
	
	/**
	 * 查询条件字符串相等,LOGIN_NAME: 登录名称
	 */
	String loginNameEqual;
	
	/**
	 * 查询条件,LOGIN_PASSWORD: 登录密码
	 */
	String loginPassword;
	
	/**
	 * 查询条件字符串相等,LOGIN_PASSWORD: 登录密码
	 */
	String loginPasswordEqual;
	
	/**
	 * 查询条件,USER_STATE: 用户状态 0 表示正常用户 1 表示 禁止用户 9 表示删除用户
	 */
	Byte userState;
	
	/**
	 * 查询条件开始值,USER_STATE: 用户状态 0 表示正常用户 1 表示 禁止用户 9 表示删除用户
	 */
	Byte userStateBegin;
	
	/**
	 * 查询条件结束值,USER_STATE: 用户状态 0 表示正常用户 1 表示 禁止用户 9 表示删除用户
	 */
	Byte userStateEnd;
	
	/**
	 * 查询条件结束值,USER_STATE: 用户状态 0 表示正常用户 1 表示 禁止用户 9 表示删除用户
	 */
	Byte userStateEndEqual;
	
	/**
	 * 查询条件,USER_EMAIL:  用户邮箱
	 */
	String userEmail;
	
	/**
	 * 查询条件字符串相等,USER_EMAIL:  用户邮箱
	 */
	String userEmailEqual;
	
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
	 * INNER_USER_ID: 关联到内部的ID
	 */
	public Integer getInnerUserId() {
		return this.innerUserId;
	}
	
	/**
	 * INNER_USER_ID: 关联到内部的ID
	 */
	public void setInnerUserId(Integer value)
	 {
		this.innerUserId = value;
	}
	
	/**
	 * 查询条件开始值,INNER_USER_ID: 关联到内部的ID
	 */
	public Integer getInnerUserIdBegin() {
		return this.innerUserIdBegin;
	}
	
	/**
	 * 查询条件开始值,INNER_USER_ID: 关联到内部的ID
	 */
	public void setInnerUserIdBegin(Integer value)
	 {
		this.innerUserIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,INNER_USER_ID: 关联到内部的ID
	 */
	public Integer getInnerUserIdEnd() {
		return this.innerUserIdEnd;
	}
	
	/**
	 * 查询条件结束值,INNER_USER_ID: 关联到内部的ID
	 */
	public void setInnerUserIdEnd(Integer value)
	 {
		this.innerUserIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,INNER_USER_ID: 关联到内部的ID
	 */
	public Integer getInnerUserIdEndEqual() {
		return this.innerUserIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,INNER_USER_ID: 关联到内部的ID
	 */
	public void setInnerUserIdEndEqual(Integer value)
	 {
		this.innerUserIdEndEqual = value;
	}
	
	/**
	 * ISSUE_USER_NAME: 用户名称
	 */
	public String getIssueUserName() {
		return this.issueUserName;
	}
	
	/**
	 * ISSUE_USER_NAME: 用户名称
	 */
	public void setIssueUserName(String value)
	 {
		this.issueUserName = value;
	}
	
	/**
	 * 查询条件字符串相等,ISSUE_USER_NAME: 用户名称
	 */
	public String getIssueUserNameEqual() {
		return this.issueUserNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,ISSUE_USER_NAME: 用户名称
	 */
	public void setIssueUserNameEqual(String value)
	 {
		this.issueUserNameEqual = value;
	}
	
	/**
	 * ISSUE_USER_TYPE: 类型的意思区别内部用户和外部用户 0 内部用户 1 外部用户
	 */
	public Byte getIssueUserType() {
		return this.issueUserType;
	}
	
	/**
	 * ISSUE_USER_TYPE: 类型的意思区别内部用户和外部用户 0 内部用户 1 外部用户
	 */
	public void setIssueUserType(Byte value)
	 {
		this.issueUserType = value;
	}
	
	/**
	 * 查询条件开始值,ISSUE_USER_TYPE: 类型的意思区别内部用户和外部用户 0 内部用户 1 外部用户
	 */
	public Byte getIssueUserTypeBegin() {
		return this.issueUserTypeBegin;
	}
	
	/**
	 * 查询条件开始值,ISSUE_USER_TYPE: 类型的意思区别内部用户和外部用户 0 内部用户 1 外部用户
	 */
	public void setIssueUserTypeBegin(Byte value)
	 {
		this.issueUserTypeBegin = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_USER_TYPE: 类型的意思区别内部用户和外部用户 0 内部用户 1 外部用户
	 */
	public Byte getIssueUserTypeEnd() {
		return this.issueUserTypeEnd;
	}
	
	/**
	 * 查询条件结束值,ISSUE_USER_TYPE: 类型的意思区别内部用户和外部用户 0 内部用户 1 外部用户
	 */
	public void setIssueUserTypeEnd(Byte value)
	 {
		this.issueUserTypeEnd = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_USER_TYPE: 类型的意思区别内部用户和外部用户 0 内部用户 1 外部用户
	 */
	public Byte getIssueUserTypeEndEqual() {
		return this.issueUserTypeEndEqual;
	}
	
	/**
	 * 查询条件结束值,ISSUE_USER_TYPE: 类型的意思区别内部用户和外部用户 0 内部用户 1 外部用户
	 */
	public void setIssueUserTypeEndEqual(Byte value)
	 {
		this.issueUserTypeEndEqual = value;
	}
	
	/**
	 * LOGIN_NAME: 登录名称
	 */
	public String getLoginName() {
		return this.loginName;
	}
	
	/**
	 * LOGIN_NAME: 登录名称
	 */
	public void setLoginName(String value)
	 {
		this.loginName = value;
	}
	
	/**
	 * 查询条件字符串相等,LOGIN_NAME: 登录名称
	 */
	public String getLoginNameEqual() {
		return this.loginNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,LOGIN_NAME: 登录名称
	 */
	public void setLoginNameEqual(String value)
	 {
		this.loginNameEqual = value;
	}
	
	/**
	 * LOGIN_PASSWORD: 登录密码
	 */
	public String getLoginPassword() {
		return this.loginPassword;
	}
	
	/**
	 * LOGIN_PASSWORD: 登录密码
	 */
	public void setLoginPassword(String value)
	 {
		this.loginPassword = value;
	}
	
	/**
	 * 查询条件字符串相等,LOGIN_PASSWORD: 登录密码
	 */
	public String getLoginPasswordEqual() {
		return this.loginPasswordEqual;
	}
	
	/**
	 * 查询条件字符串相等,LOGIN_PASSWORD: 登录密码
	 */
	public void setLoginPasswordEqual(String value)
	 {
		this.loginPasswordEqual = value;
	}
	
	/**
	 * USER_STATE: 用户状态 0 表示正常用户 1 表示 禁止用户 9 表示删除用户
	 */
	public Byte getUserState() {
		return this.userState;
	}
	
	/**
	 * USER_STATE: 用户状态 0 表示正常用户 1 表示 禁止用户 9 表示删除用户
	 */
	public void setUserState(Byte value)
	 {
		this.userState = value;
	}
	
	/**
	 * 查询条件开始值,USER_STATE: 用户状态 0 表示正常用户 1 表示 禁止用户 9 表示删除用户
	 */
	public Byte getUserStateBegin() {
		return this.userStateBegin;
	}
	
	/**
	 * 查询条件开始值,USER_STATE: 用户状态 0 表示正常用户 1 表示 禁止用户 9 表示删除用户
	 */
	public void setUserStateBegin(Byte value)
	 {
		this.userStateBegin = value;
	}
	
	/**
	 * 查询条件结束值,USER_STATE: 用户状态 0 表示正常用户 1 表示 禁止用户 9 表示删除用户
	 */
	public Byte getUserStateEnd() {
		return this.userStateEnd;
	}
	
	/**
	 * 查询条件结束值,USER_STATE: 用户状态 0 表示正常用户 1 表示 禁止用户 9 表示删除用户
	 */
	public void setUserStateEnd(Byte value)
	 {
		this.userStateEnd = value;
	}
	
	/**
	 * 查询条件结束值,USER_STATE: 用户状态 0 表示正常用户 1 表示 禁止用户 9 表示删除用户
	 */
	public Byte getUserStateEndEqual() {
		return this.userStateEndEqual;
	}
	
	/**
	 * 查询条件结束值,USER_STATE: 用户状态 0 表示正常用户 1 表示 禁止用户 9 表示删除用户
	 */
	public void setUserStateEndEqual(Byte value)
	 {
		this.userStateEndEqual = value;
	}
	
	/**
	 * USER_EMAIL:  用户邮箱
	 */
	public String getUserEmail() {
		return this.userEmail;
	}
	
	/**
	 * USER_EMAIL:  用户邮箱
	 */
	public void setUserEmail(String value)
	 {
		this.userEmail = value;
	}
	
	/**
	 * 查询条件字符串相等,USER_EMAIL:  用户邮箱
	 */
	public String getUserEmailEqual() {
		return this.userEmailEqual;
	}
	
	/**
	 * 查询条件字符串相等,USER_EMAIL:  用户邮箱
	 */
	public void setUserEmailEqual(String value)
	 {
		this.userEmailEqual = value;
	}
	
	/**
	 * 设置查询条件ISSUE_USER_ID: 用户标识
	 */
	public IssueUsersQueryCondition setIssueUserIdCondition(Integer value) {
		this.issueUserId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_USER_ID: 用户标识
	 */
	public IssueUsersQueryCondition setIssueUserIdConditionBegin(Integer value) {
		this.issueUserIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_USER_ID: 用户标识
	 */
	public IssueUsersQueryCondition setIssueUserIdConditionEnd(Integer value) {
		this.issueUserIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_USER_ID: 用户标识
	 */
	public IssueUsersQueryCondition setIssueUserIdConditionEndEqual(Integer value) {
		this.issueUserIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件INNER_USER_ID: 关联到内部的ID
	 */
	public IssueUsersQueryCondition setInnerUserIdCondition(Integer value) {
		this.innerUserId = value;
		return this;
	}
	
	/**
	 * 设置查询条件INNER_USER_ID: 关联到内部的ID
	 */
	public IssueUsersQueryCondition setInnerUserIdConditionBegin(Integer value) {
		this.innerUserIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件INNER_USER_ID: 关联到内部的ID
	 */
	public IssueUsersQueryCondition setInnerUserIdConditionEnd(Integer value) {
		this.innerUserIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件INNER_USER_ID: 关联到内部的ID
	 */
	public IssueUsersQueryCondition setInnerUserIdConditionEndEqual(Integer value) {
		this.innerUserIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_USER_NAME: 用户名称
	 */
	public IssueUsersQueryCondition setIssueUserNameCondition(String value) {
		this.issueUserName = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_USER_NAME: 用户名称
	 */
	public IssueUsersQueryCondition setIssueUserNameConditionEqual(String value) {
		this.issueUserNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_USER_TYPE: 类型的意思区别内部用户和外部用户 0 内部用户 1 外部用户
	 */
	public IssueUsersQueryCondition setIssueUserTypeCondition(Byte value) {
		this.issueUserType = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_USER_TYPE: 类型的意思区别内部用户和外部用户 0 内部用户 1 外部用户
	 */
	public IssueUsersQueryCondition setIssueUserTypeConditionBegin(Byte value) {
		this.issueUserTypeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_USER_TYPE: 类型的意思区别内部用户和外部用户 0 内部用户 1 外部用户
	 */
	public IssueUsersQueryCondition setIssueUserTypeConditionEnd(Byte value) {
		this.issueUserTypeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_USER_TYPE: 类型的意思区别内部用户和外部用户 0 内部用户 1 外部用户
	 */
	public IssueUsersQueryCondition setIssueUserTypeConditionEndEqual(Byte value) {
		this.issueUserTypeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOGIN_NAME: 登录名称
	 */
	public IssueUsersQueryCondition setLoginNameCondition(String value) {
		this.loginName = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOGIN_NAME: 登录名称
	 */
	public IssueUsersQueryCondition setLoginNameConditionEqual(String value) {
		this.loginNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOGIN_PASSWORD: 登录密码
	 */
	public IssueUsersQueryCondition setLoginPasswordCondition(String value) {
		this.loginPassword = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOGIN_PASSWORD: 登录密码
	 */
	public IssueUsersQueryCondition setLoginPasswordConditionEqual(String value) {
		this.loginPasswordEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_STATE: 用户状态 0 表示正常用户 1 表示 禁止用户 9 表示删除用户
	 */
	public IssueUsersQueryCondition setUserStateCondition(Byte value) {
		this.userState = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_STATE: 用户状态 0 表示正常用户 1 表示 禁止用户 9 表示删除用户
	 */
	public IssueUsersQueryCondition setUserStateConditionBegin(Byte value) {
		this.userStateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_STATE: 用户状态 0 表示正常用户 1 表示 禁止用户 9 表示删除用户
	 */
	public IssueUsersQueryCondition setUserStateConditionEnd(Byte value) {
		this.userStateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_STATE: 用户状态 0 表示正常用户 1 表示 禁止用户 9 表示删除用户
	 */
	public IssueUsersQueryCondition setUserStateConditionEndEqual(Byte value) {
		this.userStateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_EMAIL:  用户邮箱
	 */
	public IssueUsersQueryCondition setUserEmailCondition(String value) {
		this.userEmail = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_EMAIL:  用户邮箱
	 */
	public IssueUsersQueryCondition setUserEmailConditionEqual(String value) {
		this.userEmailEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.issueUserId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_USERS].[ISSUE_USER_ID] = " + this.issueUserId) 
						+ ") "));
		}
		if ((this.issueUserIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USERS].[ISSUE_USER_ID] >= " 
						+ (this.issueUserIdBegin + ")")));
		}
		if ((this.issueUserIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USERS].[ISSUE_USER_ID] < " 
						+ (this.issueUserIdEnd + ") ")));
		}
		if ((this.issueUserIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USERS].[ISSUE_USER_ID] <= " 
						+ (this.issueUserIdEndEqual + ") ")));
		}
		if ((this.innerUserId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_USERS].[INNER_USER_ID] = " + this.innerUserId) 
						+ ") "));
		}
		if ((this.innerUserIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USERS].[INNER_USER_ID] >= " 
						+ (this.innerUserIdBegin + ")")));
		}
		if ((this.innerUserIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USERS].[INNER_USER_ID] < " 
						+ (this.innerUserIdEnd + ") ")));
		}
		if ((this.innerUserIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USERS].[INNER_USER_ID] <= " 
						+ (this.innerUserIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.issueUserName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ISSUE_USERS].[ISSUE_USER_NAME]", this.issueUserName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.issueUserNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ISSUE_USERS].[ISSUE_USER_NAME] = " + SqlServerUtils.safeSql(this.issueUserNameEqual))) 
						+ ") "));
		}
		if ((this.issueUserType == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_USERS].[ISSUE_USER_TYPE] = " + this.issueUserType) 
						+ ") "));
		}
		if ((this.issueUserTypeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USERS].[ISSUE_USER_TYPE] >= " 
						+ (this.issueUserTypeBegin + ")")));
		}
		if ((this.issueUserTypeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USERS].[ISSUE_USER_TYPE] < " 
						+ (this.issueUserTypeEnd + ") ")));
		}
		if ((this.issueUserTypeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USERS].[ISSUE_USER_TYPE] <= " 
						+ (this.issueUserTypeEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.loginName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ISSUE_USERS].[LOGIN_NAME]", this.loginName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.loginNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ISSUE_USERS].[LOGIN_NAME] = " + SqlServerUtils.safeSql(this.loginNameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.loginPassword)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ISSUE_USERS].[LOGIN_PASSWORD]", this.loginPassword)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.loginPasswordEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ISSUE_USERS].[LOGIN_PASSWORD] = " + SqlServerUtils.safeSql(this.loginPasswordEqual))) 
						+ ") "));
		}
		if ((this.userState == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_USERS].[USER_STATE] = " + this.userState) 
						+ ") "));
		}
		if ((this.userStateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USERS].[USER_STATE] >= " 
						+ (this.userStateBegin + ")")));
		}
		if ((this.userStateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USERS].[USER_STATE] < " 
						+ (this.userStateEnd + ") ")));
		}
		if ((this.userStateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_USERS].[USER_STATE] <= " 
						+ (this.userStateEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.userEmail)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ISSUE_USERS].[USER_EMAIL]", this.userEmail)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.userEmailEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ISSUE_USERS].[USER_EMAIL] = " + SqlServerUtils.safeSql(this.userEmailEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
