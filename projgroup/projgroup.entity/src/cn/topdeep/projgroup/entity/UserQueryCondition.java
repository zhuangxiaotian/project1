package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_USER查询条件定义
 */
public class UserQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,USER_ID: 用户代号
	 */
	Integer userId;
	
	/**
	 * 查询条件开始值,USER_ID: 用户代号
	 */
	Integer userIdBegin;
	
	/**
	 * 查询条件结束值,USER_ID: 用户代号
	 */
	Integer userIdEnd;
	
	/**
	 * 查询条件结束值,USER_ID: 用户代号
	 */
	Integer userIdEndEqual;
	
	/**
	 * 查询条件,LAST_LOGIN_ADDRESS: 上次登陆地址
	 */
	String lastLoginAddress;
	
	/**
	 * 查询条件字符串相等,LAST_LOGIN_ADDRESS: 上次登陆地址
	 */
	String lastLoginAddressEqual;
	
	/**
	 * 查询条件,LAST_LOGIN_TIME: 上次登陆时间
	 */
	java.util.Date lastLoginTime;
	
	/**
	 * 查询条件开始值,LAST_LOGIN_TIME: 上次登陆时间
	 */
	java.util.Date lastLoginTimeBegin;
	
	/**
	 * 查询条件结束值,LAST_LOGIN_TIME: 上次登陆时间
	 */
	java.util.Date lastLoginTimeEnd;
	
	/**
	 * 查询条件结束值,LAST_LOGIN_TIME: 上次登陆时间
	 */
	java.util.Date lastLoginTimeEndEqual;
	
	/**
	 * 查询条件,LOGIN_COUNT: 登陆次数
	 */
	Integer loginCount;
	
	/**
	 * 查询条件开始值,LOGIN_COUNT: 登陆次数
	 */
	Integer loginCountBegin;
	
	/**
	 * 查询条件结束值,LOGIN_COUNT: 登陆次数
	 */
	Integer loginCountEnd;
	
	/**
	 * 查询条件结束值,LOGIN_COUNT: 登陆次数
	 */
	Integer loginCountEndEqual;
	
	/**
	 * 查询条件,LOGIN_NAME: 登陆名
	 */
	String loginName;
	
	/**
	 * 查询条件字符串相等,LOGIN_NAME: 登陆名
	 */
	String loginNameEqual;
	
	/**
	 * 查询条件,LOGIN_PASS: 登陆密码
	 */
	String loginPass;
	
	/**
	 * 查询条件字符串相等,LOGIN_PASS: 登陆密码
	 */
	String loginPassEqual;
	
	/**
	 * 查询条件,REAL_NAME: 真实姓名
	 */
	String realName;
	
	/**
	 * 查询条件字符串相等,REAL_NAME: 真实姓名
	 */
	String realNameEqual;
	
	/**
	 * 查询条件,USER_EMAIL: 用户电子邮箱
	 */
	String userEmail;
	
	/**
	 * 查询条件字符串相等,USER_EMAIL: 用户电子邮箱
	 */
	String userEmailEqual;
	
	/**
	 * 查询条件,USER_MEMO: 用户信息
	 */
	String userMemo;
	
	/**
	 * 查询条件字符串相等,USER_MEMO: 用户信息
	 */
	String userMemoEqual;
	
	/**
	 * 查询条件,USER_MOBILE: 用户手机号码
	 */
	String userMobile;
	
	/**
	 * 查询条件字符串相等,USER_MOBILE: 用户手机号码
	 */
	String userMobileEqual;
	
	/**
	 * 查询条件,USER_MSN: 用户MSN
	 */
	String userMsn;
	
	/**
	 * 查询条件字符串相等,USER_MSN: 用户MSN
	 */
	String userMsnEqual;
	
	/**
	 * 查询条件,USER_PRIVILEGES: 用户权利
	 */
	String userPrivileges;
	
	/**
	 * 查询条件字符串相等,USER_PRIVILEGES: 用户权利
	 */
	String userPrivilegesEqual;
	
	/**
	 * 查询条件,USER_QQ: 用户QQ
	 */
	String userQq;
	
	/**
	 * 查询条件字符串相等,USER_QQ: 用户QQ
	 */
	String userQqEqual;
	
	/**
	 * 查询条件,USER_ROLES: 用户角色
	 */
	String userRoles;
	
	/**
	 * 查询条件字符串相等,USER_ROLES: 用户角色
	 */
	String userRolesEqual;
	
	/**
	 * 查询条件,USER_STATE: 用户状态
	 */
	Integer userState;
	
	/**
	 * 查询条件开始值,USER_STATE: 用户状态
	 */
	Integer userStateBegin;
	
	/**
	 * 查询条件结束值,USER_STATE: 用户状态
	 */
	Integer userStateEnd;
	
	/**
	 * 查询条件结束值,USER_STATE: 用户状态
	 */
	Integer userStateEndEqual;
	
	/**
	 * 查询条件,USER_TELEPHONE: 用户电话号码
	 */
	String userTelephone;
	
	/**
	 * 查询条件字符串相等,USER_TELEPHONE: 用户电话号码
	 */
	String userTelephoneEqual;
	
	/**
	 * USER_ID: 用户代号
	 */
	public Integer getUserId() {
		return this.userId;
	}
	
	/**
	 * USER_ID: 用户代号
	 */
	public void setUserId(Integer value)
	 {
		this.userId = value;
	}
	
	/**
	 * 查询条件开始值,USER_ID: 用户代号
	 */
	public Integer getUserIdBegin() {
		return this.userIdBegin;
	}
	
	/**
	 * 查询条件开始值,USER_ID: 用户代号
	 */
	public void setUserIdBegin(Integer value)
	 {
		this.userIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,USER_ID: 用户代号
	 */
	public Integer getUserIdEnd() {
		return this.userIdEnd;
	}
	
	/**
	 * 查询条件结束值,USER_ID: 用户代号
	 */
	public void setUserIdEnd(Integer value)
	 {
		this.userIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,USER_ID: 用户代号
	 */
	public Integer getUserIdEndEqual() {
		return this.userIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,USER_ID: 用户代号
	 */
	public void setUserIdEndEqual(Integer value)
	 {
		this.userIdEndEqual = value;
	}
	
	/**
	 * LAST_LOGIN_ADDRESS: 上次登陆地址
	 */
	public String getLastLoginAddress() {
		return this.lastLoginAddress;
	}
	
	/**
	 * LAST_LOGIN_ADDRESS: 上次登陆地址
	 */
	public void setLastLoginAddress(String value)
	 {
		this.lastLoginAddress = value;
	}
	
	/**
	 * 查询条件字符串相等,LAST_LOGIN_ADDRESS: 上次登陆地址
	 */
	public String getLastLoginAddressEqual() {
		return this.lastLoginAddressEqual;
	}
	
	/**
	 * 查询条件字符串相等,LAST_LOGIN_ADDRESS: 上次登陆地址
	 */
	public void setLastLoginAddressEqual(String value)
	 {
		this.lastLoginAddressEqual = value;
	}
	
	/**
	 * LAST_LOGIN_TIME: 上次登陆时间
	 */
	public java.util.Date getLastLoginTime() {
		return this.lastLoginTime;
	}
	
	/**
	 * LAST_LOGIN_TIME: 上次登陆时间
	 */
	public void setLastLoginTime(java.util.Date value)
	 {
		this.lastLoginTime = value;
	}
	
	/**
	 * 查询条件开始值,LAST_LOGIN_TIME: 上次登陆时间
	 */
	public java.util.Date getLastLoginTimeBegin() {
		return this.lastLoginTimeBegin;
	}
	
	/**
	 * 查询条件开始值,LAST_LOGIN_TIME: 上次登陆时间
	 */
	public void setLastLoginTimeBegin(java.util.Date value)
	 {
		this.lastLoginTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,LAST_LOGIN_TIME: 上次登陆时间
	 */
	public java.util.Date getLastLoginTimeEnd() {
		return this.lastLoginTimeEnd;
	}
	
	/**
	 * 查询条件结束值,LAST_LOGIN_TIME: 上次登陆时间
	 */
	public void setLastLoginTimeEnd(java.util.Date value)
	 {
		this.lastLoginTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,LAST_LOGIN_TIME: 上次登陆时间
	 */
	public java.util.Date getLastLoginTimeEndEqual() {
		return this.lastLoginTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,LAST_LOGIN_TIME: 上次登陆时间
	 */
	public void setLastLoginTimeEndEqual(java.util.Date value)
	 {
		this.lastLoginTimeEndEqual = value;
	}
	
	/**
	 * LOGIN_COUNT: 登陆次数
	 */
	public Integer getLoginCount() {
		return this.loginCount;
	}
	
	/**
	 * LOGIN_COUNT: 登陆次数
	 */
	public void setLoginCount(Integer value)
	 {
		this.loginCount = value;
	}
	
	/**
	 * 查询条件开始值,LOGIN_COUNT: 登陆次数
	 */
	public Integer getLoginCountBegin() {
		return this.loginCountBegin;
	}
	
	/**
	 * 查询条件开始值,LOGIN_COUNT: 登陆次数
	 */
	public void setLoginCountBegin(Integer value)
	 {
		this.loginCountBegin = value;
	}
	
	/**
	 * 查询条件结束值,LOGIN_COUNT: 登陆次数
	 */
	public Integer getLoginCountEnd() {
		return this.loginCountEnd;
	}
	
	/**
	 * 查询条件结束值,LOGIN_COUNT: 登陆次数
	 */
	public void setLoginCountEnd(Integer value)
	 {
		this.loginCountEnd = value;
	}
	
	/**
	 * 查询条件结束值,LOGIN_COUNT: 登陆次数
	 */
	public Integer getLoginCountEndEqual() {
		return this.loginCountEndEqual;
	}
	
	/**
	 * 查询条件结束值,LOGIN_COUNT: 登陆次数
	 */
	public void setLoginCountEndEqual(Integer value)
	 {
		this.loginCountEndEqual = value;
	}
	
	/**
	 * LOGIN_NAME: 登陆名
	 */
	public String getLoginName() {
		return this.loginName;
	}
	
	/**
	 * LOGIN_NAME: 登陆名
	 */
	public void setLoginName(String value)
	 {
		this.loginName = value;
	}
	
	/**
	 * 查询条件字符串相等,LOGIN_NAME: 登陆名
	 */
	public String getLoginNameEqual() {
		return this.loginNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,LOGIN_NAME: 登陆名
	 */
	public void setLoginNameEqual(String value)
	 {
		this.loginNameEqual = value;
	}
	
	/**
	 * LOGIN_PASS: 登陆密码
	 */
	public String getLoginPass() {
		return this.loginPass;
	}
	
	/**
	 * LOGIN_PASS: 登陆密码
	 */
	public void setLoginPass(String value)
	 {
		this.loginPass = value;
	}
	
	/**
	 * 查询条件字符串相等,LOGIN_PASS: 登陆密码
	 */
	public String getLoginPassEqual() {
		return this.loginPassEqual;
	}
	
	/**
	 * 查询条件字符串相等,LOGIN_PASS: 登陆密码
	 */
	public void setLoginPassEqual(String value)
	 {
		this.loginPassEqual = value;
	}
	
	/**
	 * REAL_NAME: 真实姓名
	 */
	public String getRealName() {
		return this.realName;
	}
	
	/**
	 * REAL_NAME: 真实姓名
	 */
	public void setRealName(String value)
	 {
		this.realName = value;
	}
	
	/**
	 * 查询条件字符串相等,REAL_NAME: 真实姓名
	 */
	public String getRealNameEqual() {
		return this.realNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,REAL_NAME: 真实姓名
	 */
	public void setRealNameEqual(String value)
	 {
		this.realNameEqual = value;
	}
	
	/**
	 * USER_EMAIL: 用户电子邮箱
	 */
	public String getUserEmail() {
		return this.userEmail;
	}
	
	/**
	 * USER_EMAIL: 用户电子邮箱
	 */
	public void setUserEmail(String value)
	 {
		this.userEmail = value;
	}
	
	/**
	 * 查询条件字符串相等,USER_EMAIL: 用户电子邮箱
	 */
	public String getUserEmailEqual() {
		return this.userEmailEqual;
	}
	
	/**
	 * 查询条件字符串相等,USER_EMAIL: 用户电子邮箱
	 */
	public void setUserEmailEqual(String value)
	 {
		this.userEmailEqual = value;
	}
	
	/**
	 * USER_MEMO: 用户信息
	 */
	public String getUserMemo() {
		return this.userMemo;
	}
	
	/**
	 * USER_MEMO: 用户信息
	 */
	public void setUserMemo(String value)
	 {
		this.userMemo = value;
	}
	
	/**
	 * 查询条件字符串相等,USER_MEMO: 用户信息
	 */
	public String getUserMemoEqual() {
		return this.userMemoEqual;
	}
	
	/**
	 * 查询条件字符串相等,USER_MEMO: 用户信息
	 */
	public void setUserMemoEqual(String value)
	 {
		this.userMemoEqual = value;
	}
	
	/**
	 * USER_MOBILE: 用户手机号码
	 */
	public String getUserMobile() {
		return this.userMobile;
	}
	
	/**
	 * USER_MOBILE: 用户手机号码
	 */
	public void setUserMobile(String value)
	 {
		this.userMobile = value;
	}
	
	/**
	 * 查询条件字符串相等,USER_MOBILE: 用户手机号码
	 */
	public String getUserMobileEqual() {
		return this.userMobileEqual;
	}
	
	/**
	 * 查询条件字符串相等,USER_MOBILE: 用户手机号码
	 */
	public void setUserMobileEqual(String value)
	 {
		this.userMobileEqual = value;
	}
	
	/**
	 * USER_MSN: 用户MSN
	 */
	public String getUserMsn() {
		return this.userMsn;
	}
	
	/**
	 * USER_MSN: 用户MSN
	 */
	public void setUserMsn(String value)
	 {
		this.userMsn = value;
	}
	
	/**
	 * 查询条件字符串相等,USER_MSN: 用户MSN
	 */
	public String getUserMsnEqual() {
		return this.userMsnEqual;
	}
	
	/**
	 * 查询条件字符串相等,USER_MSN: 用户MSN
	 */
	public void setUserMsnEqual(String value)
	 {
		this.userMsnEqual = value;
	}
	
	/**
	 * USER_PRIVILEGES: 用户权利
	 */
	public String getUserPrivileges() {
		return this.userPrivileges;
	}
	
	/**
	 * USER_PRIVILEGES: 用户权利
	 */
	public void setUserPrivileges(String value)
	 {
		this.userPrivileges = value;
	}
	
	/**
	 * 查询条件字符串相等,USER_PRIVILEGES: 用户权利
	 */
	public String getUserPrivilegesEqual() {
		return this.userPrivilegesEqual;
	}
	
	/**
	 * 查询条件字符串相等,USER_PRIVILEGES: 用户权利
	 */
	public void setUserPrivilegesEqual(String value)
	 {
		this.userPrivilegesEqual = value;
	}
	
	/**
	 * USER_QQ: 用户QQ
	 */
	public String getUserQq() {
		return this.userQq;
	}
	
	/**
	 * USER_QQ: 用户QQ
	 */
	public void setUserQq(String value)
	 {
		this.userQq = value;
	}
	
	/**
	 * 查询条件字符串相等,USER_QQ: 用户QQ
	 */
	public String getUserQqEqual() {
		return this.userQqEqual;
	}
	
	/**
	 * 查询条件字符串相等,USER_QQ: 用户QQ
	 */
	public void setUserQqEqual(String value)
	 {
		this.userQqEqual = value;
	}
	
	/**
	 * USER_ROLES: 用户角色
	 */
	public String getUserRoles() {
		return this.userRoles;
	}
	
	/**
	 * USER_ROLES: 用户角色
	 */
	public void setUserRoles(String value)
	 {
		this.userRoles = value;
	}
	
	/**
	 * 查询条件字符串相等,USER_ROLES: 用户角色
	 */
	public String getUserRolesEqual() {
		return this.userRolesEqual;
	}
	
	/**
	 * 查询条件字符串相等,USER_ROLES: 用户角色
	 */
	public void setUserRolesEqual(String value)
	 {
		this.userRolesEqual = value;
	}
	
	/**
	 * USER_STATE: 用户状态
	 */
	public Integer getUserState() {
		return this.userState;
	}
	
	/**
	 * USER_STATE: 用户状态
	 */
	public void setUserState(Integer value)
	 {
		this.userState = value;
	}
	
	/**
	 * 查询条件开始值,USER_STATE: 用户状态
	 */
	public Integer getUserStateBegin() {
		return this.userStateBegin;
	}
	
	/**
	 * 查询条件开始值,USER_STATE: 用户状态
	 */
	public void setUserStateBegin(Integer value)
	 {
		this.userStateBegin = value;
	}
	
	/**
	 * 查询条件结束值,USER_STATE: 用户状态
	 */
	public Integer getUserStateEnd() {
		return this.userStateEnd;
	}
	
	/**
	 * 查询条件结束值,USER_STATE: 用户状态
	 */
	public void setUserStateEnd(Integer value)
	 {
		this.userStateEnd = value;
	}
	
	/**
	 * 查询条件结束值,USER_STATE: 用户状态
	 */
	public Integer getUserStateEndEqual() {
		return this.userStateEndEqual;
	}
	
	/**
	 * 查询条件结束值,USER_STATE: 用户状态
	 */
	public void setUserStateEndEqual(Integer value)
	 {
		this.userStateEndEqual = value;
	}
	
	/**
	 * USER_TELEPHONE: 用户电话号码
	 */
	public String getUserTelephone() {
		return this.userTelephone;
	}
	
	/**
	 * USER_TELEPHONE: 用户电话号码
	 */
	public void setUserTelephone(String value)
	 {
		this.userTelephone = value;
	}
	
	/**
	 * 查询条件字符串相等,USER_TELEPHONE: 用户电话号码
	 */
	public String getUserTelephoneEqual() {
		return this.userTelephoneEqual;
	}
	
	/**
	 * 查询条件字符串相等,USER_TELEPHONE: 用户电话号码
	 */
	public void setUserTelephoneEqual(String value)
	 {
		this.userTelephoneEqual = value;
	}
	
	/**
	 * 设置查询条件USER_ID: 用户代号
	 */
	public UserQueryCondition setUserIdCondition(Integer value) {
		this.userId = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 用户代号
	 */
	public UserQueryCondition setUserIdConditionBegin(Integer value) {
		this.userIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 用户代号
	 */
	public UserQueryCondition setUserIdConditionEnd(Integer value) {
		this.userIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 用户代号
	 */
	public UserQueryCondition setUserIdConditionEndEqual(Integer value) {
		this.userIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件LAST_LOGIN_ADDRESS: 上次登陆地址
	 */
	public UserQueryCondition setLastLoginAddressCondition(String value) {
		this.lastLoginAddress = value;
		return this;
	}
	
	/**
	 * 设置查询条件LAST_LOGIN_ADDRESS: 上次登陆地址
	 */
	public UserQueryCondition setLastLoginAddressConditionEqual(String value) {
		this.lastLoginAddressEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件LAST_LOGIN_TIME: 上次登陆时间
	 */
	public UserQueryCondition setLastLoginTimeCondition(java.util.Date value) {
		this.lastLoginTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件LAST_LOGIN_TIME: 上次登陆时间
	 */
	public UserQueryCondition setLastLoginTimeConditionBegin(java.util.Date value) {
		this.lastLoginTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件LAST_LOGIN_TIME: 上次登陆时间
	 */
	public UserQueryCondition setLastLoginTimeConditionEnd(java.util.Date value) {
		this.lastLoginTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件LAST_LOGIN_TIME: 上次登陆时间
	 */
	public UserQueryCondition setLastLoginTimeConditionEndEqual(java.util.Date value) {
		this.lastLoginTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOGIN_COUNT: 登陆次数
	 */
	public UserQueryCondition setLoginCountCondition(Integer value) {
		this.loginCount = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOGIN_COUNT: 登陆次数
	 */
	public UserQueryCondition setLoginCountConditionBegin(Integer value) {
		this.loginCountBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOGIN_COUNT: 登陆次数
	 */
	public UserQueryCondition setLoginCountConditionEnd(Integer value) {
		this.loginCountEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOGIN_COUNT: 登陆次数
	 */
	public UserQueryCondition setLoginCountConditionEndEqual(Integer value) {
		this.loginCountEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOGIN_NAME: 登陆名
	 */
	public UserQueryCondition setLoginNameCondition(String value) {
		this.loginName = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOGIN_NAME: 登陆名
	 */
	public UserQueryCondition setLoginNameConditionEqual(String value) {
		this.loginNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOGIN_PASS: 登陆密码
	 */
	public UserQueryCondition setLoginPassCondition(String value) {
		this.loginPass = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOGIN_PASS: 登陆密码
	 */
	public UserQueryCondition setLoginPassConditionEqual(String value) {
		this.loginPassEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件REAL_NAME: 真实姓名
	 */
	public UserQueryCondition setRealNameCondition(String value) {
		this.realName = value;
		return this;
	}
	
	/**
	 * 设置查询条件REAL_NAME: 真实姓名
	 */
	public UserQueryCondition setRealNameConditionEqual(String value) {
		this.realNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_EMAIL: 用户电子邮箱
	 */
	public UserQueryCondition setUserEmailCondition(String value) {
		this.userEmail = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_EMAIL: 用户电子邮箱
	 */
	public UserQueryCondition setUserEmailConditionEqual(String value) {
		this.userEmailEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_MEMO: 用户信息
	 */
	public UserQueryCondition setUserMemoCondition(String value) {
		this.userMemo = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_MEMO: 用户信息
	 */
	public UserQueryCondition setUserMemoConditionEqual(String value) {
		this.userMemoEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_MOBILE: 用户手机号码
	 */
	public UserQueryCondition setUserMobileCondition(String value) {
		this.userMobile = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_MOBILE: 用户手机号码
	 */
	public UserQueryCondition setUserMobileConditionEqual(String value) {
		this.userMobileEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_MSN: 用户MSN
	 */
	public UserQueryCondition setUserMsnCondition(String value) {
		this.userMsn = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_MSN: 用户MSN
	 */
	public UserQueryCondition setUserMsnConditionEqual(String value) {
		this.userMsnEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_PRIVILEGES: 用户权利
	 */
	public UserQueryCondition setUserPrivilegesCondition(String value) {
		this.userPrivileges = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_PRIVILEGES: 用户权利
	 */
	public UserQueryCondition setUserPrivilegesConditionEqual(String value) {
		this.userPrivilegesEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_QQ: 用户QQ
	 */
	public UserQueryCondition setUserQqCondition(String value) {
		this.userQq = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_QQ: 用户QQ
	 */
	public UserQueryCondition setUserQqConditionEqual(String value) {
		this.userQqEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ROLES: 用户角色
	 */
	public UserQueryCondition setUserRolesCondition(String value) {
		this.userRoles = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ROLES: 用户角色
	 */
	public UserQueryCondition setUserRolesConditionEqual(String value) {
		this.userRolesEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_STATE: 用户状态
	 */
	public UserQueryCondition setUserStateCondition(Integer value) {
		this.userState = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_STATE: 用户状态
	 */
	public UserQueryCondition setUserStateConditionBegin(Integer value) {
		this.userStateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_STATE: 用户状态
	 */
	public UserQueryCondition setUserStateConditionEnd(Integer value) {
		this.userStateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_STATE: 用户状态
	 */
	public UserQueryCondition setUserStateConditionEndEqual(Integer value) {
		this.userStateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_TELEPHONE: 用户电话号码
	 */
	public UserQueryCondition setUserTelephoneCondition(String value) {
		this.userTelephone = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_TELEPHONE: 用户电话号码
	 */
	public UserQueryCondition setUserTelephoneConditionEqual(String value) {
		this.userTelephoneEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.userId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_USER].[USER_ID] = " + this.userId) 
						+ ") "));
		}
		if ((this.userIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_USER].[USER_ID] >= " 
						+ (this.userIdBegin + ")")));
		}
		if ((this.userIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_USER].[USER_ID] < " 
						+ (this.userIdEnd + ") ")));
		}
		if ((this.userIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_USER].[USER_ID] <= " 
						+ (this.userIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.lastLoginAddress)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_USER].[LAST_LOGIN_ADDRESS]", this.lastLoginAddress)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.lastLoginAddressEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_USER].[LAST_LOGIN_ADDRESS] = " + SqlServerUtils.safeSql(this.lastLoginAddressEqual))) 
						+ ") "));
		}
		if ((this.lastLoginTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_USER].[LAST_LOGIN_TIME] = " + SqlServerUtils.getDateSql(this.lastLoginTime)) 
						+ ") "));
		}
		if ((this.lastLoginTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_USER].[LAST_LOGIN_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.lastLoginTimeBegin) + ")")));
		}
		if ((this.lastLoginTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_USER].[LAST_LOGIN_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.lastLoginTimeEnd) + ") ")));
		}
		if ((this.lastLoginTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_USER].[LAST_LOGIN_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.lastLoginTimeEndEqual) + ") ")));
		}
		if ((this.loginCount == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_USER].[LOGIN_COUNT] = " + this.loginCount) 
						+ ") "));
		}
		if ((this.loginCountBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_USER].[LOGIN_COUNT] >= " 
						+ (this.loginCountBegin + ")")));
		}
		if ((this.loginCountEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_USER].[LOGIN_COUNT] < " 
						+ (this.loginCountEnd + ") ")));
		}
		if ((this.loginCountEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_USER].[LOGIN_COUNT] <= " 
						+ (this.loginCountEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.loginName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_USER].[LOGIN_NAME]", this.loginName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.loginNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_USER].[LOGIN_NAME] = " + SqlServerUtils.safeSql(this.loginNameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.loginPass)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_USER].[LOGIN_PASS]", this.loginPass)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.loginPassEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_USER].[LOGIN_PASS] = " + SqlServerUtils.safeSql(this.loginPassEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.realName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_USER].[REAL_NAME]", this.realName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.realNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_USER].[REAL_NAME] = " + SqlServerUtils.safeSql(this.realNameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.userEmail)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_USER].[USER_EMAIL]", this.userEmail)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.userEmailEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_USER].[USER_EMAIL] = " + SqlServerUtils.safeSql(this.userEmailEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.userMemo)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_USER].[USER_MEMO]", this.userMemo)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.userMemoEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_USER].[USER_MEMO] = " + SqlServerUtils.safeSql(this.userMemoEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.userMobile)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_USER].[USER_MOBILE]", this.userMobile)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.userMobileEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_USER].[USER_MOBILE] = " + SqlServerUtils.safeSql(this.userMobileEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.userMsn)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_USER].[USER_MSN]", this.userMsn)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.userMsnEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_USER].[USER_MSN] = " + SqlServerUtils.safeSql(this.userMsnEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.userPrivileges)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_USER].[USER_PRIVILEGES]", this.userPrivileges)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.userPrivilegesEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_USER].[USER_PRIVILEGES] = " + SqlServerUtils.safeSql(this.userPrivilegesEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.userQq)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_USER].[USER_QQ]", this.userQq)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.userQqEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_USER].[USER_QQ] = " + SqlServerUtils.safeSql(this.userQqEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.userRoles)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_USER].[USER_ROLES]", this.userRoles)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.userRolesEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_USER].[USER_ROLES] = " + SqlServerUtils.safeSql(this.userRolesEqual))) 
						+ ") "));
		}
		if ((this.userState == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_USER].[USER_STATE] = " + this.userState) 
						+ ") "));
		}
		if ((this.userStateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_USER].[USER_STATE] >= " 
						+ (this.userStateBegin + ")")));
		}
		if ((this.userStateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_USER].[USER_STATE] < " 
						+ (this.userStateEnd + ") ")));
		}
		if ((this.userStateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_USER].[USER_STATE] <= " 
						+ (this.userStateEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.userTelephone)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_USER].[USER_TELEPHONE]", this.userTelephone)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.userTelephoneEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_USER].[USER_TELEPHONE] = " + SqlServerUtils.safeSql(this.userTelephoneEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
