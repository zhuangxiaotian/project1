package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_PROJECT_JOIN_USER查询条件定义
 */
public class ProjectJoinUserQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,PROJECT_ID: 工程代号
	 */
	Integer projectId;
	
	/**
	 * 查询条件开始值,PROJECT_ID: 工程代号
	 */
	Integer projectIdBegin;
	
	/**
	 * 查询条件结束值,PROJECT_ID: 工程代号
	 */
	Integer projectIdEnd;
	
	/**
	 * 查询条件结束值,PROJECT_ID: 工程代号
	 */
	Integer projectIdEndEqual;
	
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
	 * PROJECT_ID: 工程代号
	 */
	public Integer getProjectId() {
		return this.projectId;
	}
	
	/**
	 * PROJECT_ID: 工程代号
	 */
	public void setProjectId(Integer value)
	 {
		this.projectId = value;
	}
	
	/**
	 * 查询条件开始值,PROJECT_ID: 工程代号
	 */
	public Integer getProjectIdBegin() {
		return this.projectIdBegin;
	}
	
	/**
	 * 查询条件开始值,PROJECT_ID: 工程代号
	 */
	public void setProjectIdBegin(Integer value)
	 {
		this.projectIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PROJECT_ID: 工程代号
	 */
	public Integer getProjectIdEnd() {
		return this.projectIdEnd;
	}
	
	/**
	 * 查询条件结束值,PROJECT_ID: 工程代号
	 */
	public void setProjectIdEnd(Integer value)
	 {
		this.projectIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PROJECT_ID: 工程代号
	 */
	public Integer getProjectIdEndEqual() {
		return this.projectIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PROJECT_ID: 工程代号
	 */
	public void setProjectIdEndEqual(Integer value)
	 {
		this.projectIdEndEqual = value;
	}
	
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
	 * 设置查询条件PROJECT_ID: 工程代号
	 */
	public ProjectJoinUserQueryCondition setProjectIdCondition(Integer value) {
		this.projectId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_ID: 工程代号
	 */
	public ProjectJoinUserQueryCondition setProjectIdConditionBegin(Integer value) {
		this.projectIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_ID: 工程代号
	 */
	public ProjectJoinUserQueryCondition setProjectIdConditionEnd(Integer value) {
		this.projectIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_ID: 工程代号
	 */
	public ProjectJoinUserQueryCondition setProjectIdConditionEndEqual(Integer value) {
		this.projectIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 用户代号
	 */
	public ProjectJoinUserQueryCondition setUserIdCondition(Integer value) {
		this.userId = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 用户代号
	 */
	public ProjectJoinUserQueryCondition setUserIdConditionBegin(Integer value) {
		this.userIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 用户代号
	 */
	public ProjectJoinUserQueryCondition setUserIdConditionEnd(Integer value) {
		this.userIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 用户代号
	 */
	public ProjectJoinUserQueryCondition setUserIdConditionEndEqual(Integer value) {
		this.userIdEndEqual = value;
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
						+ ((" and ([T_PROJECT_JOIN_USER].[PROJECT_ID] = " + this.projectId) 
						+ ") "));
		}
		if ((this.projectIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT_JOIN_USER].[PROJECT_ID] >= " 
						+ (this.projectIdBegin + ")")));
		}
		if ((this.projectIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT_JOIN_USER].[PROJECT_ID] < " 
						+ (this.projectIdEnd + ") ")));
		}
		if ((this.projectIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT_JOIN_USER].[PROJECT_ID] <= " 
						+ (this.projectIdEndEqual + ") ")));
		}
		if ((this.userId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PROJECT_JOIN_USER].[USER_ID] = " + this.userId) 
						+ ") "));
		}
		if ((this.userIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT_JOIN_USER].[USER_ID] >= " 
						+ (this.userIdBegin + ")")));
		}
		if ((this.userIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT_JOIN_USER].[USER_ID] < " 
						+ (this.userIdEnd + ") ")));
		}
		if ((this.userIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT_JOIN_USER].[USER_ID] <= " 
						+ (this.userIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
