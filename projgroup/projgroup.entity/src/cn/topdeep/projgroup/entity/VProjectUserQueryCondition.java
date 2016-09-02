package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * V_PROJECT_USER查询条件定义
 */
public class VProjectUserQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,PROJECT_ID: 
	 */
	Integer projectId;
	
	/**
	 * 查询条件开始值,PROJECT_ID: 
	 */
	Integer projectIdBegin;
	
	/**
	 * 查询条件结束值,PROJECT_ID: 
	 */
	Integer projectIdEnd;
	
	/**
	 * 查询条件结束值,PROJECT_ID: 
	 */
	Integer projectIdEndEqual;
	
	/**
	 * 查询条件,USER_ID: 
	 */
	Integer userId;
	
	/**
	 * 查询条件开始值,USER_ID: 
	 */
	Integer userIdBegin;
	
	/**
	 * 查询条件结束值,USER_ID: 
	 */
	Integer userIdEnd;
	
	/**
	 * 查询条件结束值,USER_ID: 
	 */
	Integer userIdEndEqual;
	
	/**
	 * 查询条件,REAL_NAME: 
	 */
	String realName;
	
	/**
	 * 查询条件字符串相等,REAL_NAME: 
	 */
	String realNameEqual;
	
	/**
	 * PROJECT_ID: 
	 */
	public Integer getProjectId() {
		return this.projectId;
	}
	
	/**
	 * PROJECT_ID: 
	 */
	public void setProjectId(Integer value)
	 {
		this.projectId = value;
	}
	
	/**
	 * 查询条件开始值,PROJECT_ID: 
	 */
	public Integer getProjectIdBegin() {
		return this.projectIdBegin;
	}
	
	/**
	 * 查询条件开始值,PROJECT_ID: 
	 */
	public void setProjectIdBegin(Integer value)
	 {
		this.projectIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PROJECT_ID: 
	 */
	public Integer getProjectIdEnd() {
		return this.projectIdEnd;
	}
	
	/**
	 * 查询条件结束值,PROJECT_ID: 
	 */
	public void setProjectIdEnd(Integer value)
	 {
		this.projectIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PROJECT_ID: 
	 */
	public Integer getProjectIdEndEqual() {
		return this.projectIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PROJECT_ID: 
	 */
	public void setProjectIdEndEqual(Integer value)
	 {
		this.projectIdEndEqual = value;
	}
	
	/**
	 * USER_ID: 
	 */
	public Integer getUserId() {
		return this.userId;
	}
	
	/**
	 * USER_ID: 
	 */
	public void setUserId(Integer value)
	 {
		this.userId = value;
	}
	
	/**
	 * 查询条件开始值,USER_ID: 
	 */
	public Integer getUserIdBegin() {
		return this.userIdBegin;
	}
	
	/**
	 * 查询条件开始值,USER_ID: 
	 */
	public void setUserIdBegin(Integer value)
	 {
		this.userIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,USER_ID: 
	 */
	public Integer getUserIdEnd() {
		return this.userIdEnd;
	}
	
	/**
	 * 查询条件结束值,USER_ID: 
	 */
	public void setUserIdEnd(Integer value)
	 {
		this.userIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,USER_ID: 
	 */
	public Integer getUserIdEndEqual() {
		return this.userIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,USER_ID: 
	 */
	public void setUserIdEndEqual(Integer value)
	 {
		this.userIdEndEqual = value;
	}
	
	/**
	 * REAL_NAME: 
	 */
	public String getRealName() {
		return this.realName;
	}
	
	/**
	 * REAL_NAME: 
	 */
	public void setRealName(String value)
	 {
		this.realName = value;
	}
	
	/**
	 * 查询条件字符串相等,REAL_NAME: 
	 */
	public String getRealNameEqual() {
		return this.realNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,REAL_NAME: 
	 */
	public void setRealNameEqual(String value)
	 {
		this.realNameEqual = value;
	}
	
	/**
	 * 设置查询条件PROJECT_ID: 
	 */
	public VProjectUserQueryCondition setProjectIdCondition(Integer value) {
		this.projectId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_ID: 
	 */
	public VProjectUserQueryCondition setProjectIdConditionBegin(Integer value) {
		this.projectIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_ID: 
	 */
	public VProjectUserQueryCondition setProjectIdConditionEnd(Integer value) {
		this.projectIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_ID: 
	 */
	public VProjectUserQueryCondition setProjectIdConditionEndEqual(Integer value) {
		this.projectIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 
	 */
	public VProjectUserQueryCondition setUserIdCondition(Integer value) {
		this.userId = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 
	 */
	public VProjectUserQueryCondition setUserIdConditionBegin(Integer value) {
		this.userIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 
	 */
	public VProjectUserQueryCondition setUserIdConditionEnd(Integer value) {
		this.userIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 
	 */
	public VProjectUserQueryCondition setUserIdConditionEndEqual(Integer value) {
		this.userIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件REAL_NAME: 
	 */
	public VProjectUserQueryCondition setRealNameCondition(String value) {
		this.realName = value;
		return this;
	}
	
	/**
	 * 设置查询条件REAL_NAME: 
	 */
	public VProjectUserQueryCondition setRealNameConditionEqual(String value) {
		this.realNameEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.projectId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_PROJECT_USER].[PROJECT_ID] = " + this.projectId) 
						+ ") "));
		}
		if ((this.projectIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PROJECT_USER].[PROJECT_ID] >= " 
						+ (this.projectIdBegin + ")")));
		}
		if ((this.projectIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PROJECT_USER].[PROJECT_ID] < " 
						+ (this.projectIdEnd + ") ")));
		}
		if ((this.projectIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PROJECT_USER].[PROJECT_ID] <= " 
						+ (this.projectIdEndEqual + ") ")));
		}
		if ((this.userId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_PROJECT_USER].[USER_ID] = " + this.userId) 
						+ ") "));
		}
		if ((this.userIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PROJECT_USER].[USER_ID] >= " 
						+ (this.userIdBegin + ")")));
		}
		if ((this.userIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PROJECT_USER].[USER_ID] < " 
						+ (this.userIdEnd + ") ")));
		}
		if ((this.userIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PROJECT_USER].[USER_ID] <= " 
						+ (this.userIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.realName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[V_PROJECT_USER].[REAL_NAME]", this.realName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.realNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[V_PROJECT_USER].[REAL_NAME] = " + SqlServerUtils.safeSql(this.realNameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
