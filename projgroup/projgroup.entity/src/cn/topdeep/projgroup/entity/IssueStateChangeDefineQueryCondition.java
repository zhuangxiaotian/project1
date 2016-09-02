package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_STATE_CHANGE_DEFINE查询条件定义
 */
public class IssueStateChangeDefineQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,CURRENT_STATUS_ID: 当前状态标识
	 */
	Integer currentStatusId;
	
	/**
	 * 查询条件开始值,CURRENT_STATUS_ID: 当前状态标识
	 */
	Integer currentStatusIdBegin;
	
	/**
	 * 查询条件结束值,CURRENT_STATUS_ID: 当前状态标识
	 */
	Integer currentStatusIdEnd;
	
	/**
	 * 查询条件结束值,CURRENT_STATUS_ID: 当前状态标识
	 */
	Integer currentStatusIdEndEqual;
	
	/**
	 * 查询条件,NEXT_STATUS_ID: 下一个状态标识
	 */
	Integer nextStatusId;
	
	/**
	 * 查询条件开始值,NEXT_STATUS_ID: 下一个状态标识
	 */
	Integer nextStatusIdBegin;
	
	/**
	 * 查询条件结束值,NEXT_STATUS_ID: 下一个状态标识
	 */
	Integer nextStatusIdEnd;
	
	/**
	 * 查询条件结束值,NEXT_STATUS_ID: 下一个状态标识
	 */
	Integer nextStatusIdEndEqual;
	
	/**
	 * 查询条件,ROLE_LIST: 允许进行状态变化的角色列表，用逗号分隔
	 */
	String roleList;
	
	/**
	 * 查询条件字符串相等,ROLE_LIST: 允许进行状态变化的角色列表，用逗号分隔
	 */
	String roleListEqual;
	
	/**
	 * CURRENT_STATUS_ID: 当前状态标识
	 */
	public Integer getCurrentStatusId() {
		return this.currentStatusId;
	}
	
	/**
	 * CURRENT_STATUS_ID: 当前状态标识
	 */
	public void setCurrentStatusId(Integer value)
	 {
		this.currentStatusId = value;
	}
	
	/**
	 * 查询条件开始值,CURRENT_STATUS_ID: 当前状态标识
	 */
	public Integer getCurrentStatusIdBegin() {
		return this.currentStatusIdBegin;
	}
	
	/**
	 * 查询条件开始值,CURRENT_STATUS_ID: 当前状态标识
	 */
	public void setCurrentStatusIdBegin(Integer value)
	 {
		this.currentStatusIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,CURRENT_STATUS_ID: 当前状态标识
	 */
	public Integer getCurrentStatusIdEnd() {
		return this.currentStatusIdEnd;
	}
	
	/**
	 * 查询条件结束值,CURRENT_STATUS_ID: 当前状态标识
	 */
	public void setCurrentStatusIdEnd(Integer value)
	 {
		this.currentStatusIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,CURRENT_STATUS_ID: 当前状态标识
	 */
	public Integer getCurrentStatusIdEndEqual() {
		return this.currentStatusIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,CURRENT_STATUS_ID: 当前状态标识
	 */
	public void setCurrentStatusIdEndEqual(Integer value)
	 {
		this.currentStatusIdEndEqual = value;
	}
	
	/**
	 * NEXT_STATUS_ID: 下一个状态标识
	 */
	public Integer getNextStatusId() {
		return this.nextStatusId;
	}
	
	/**
	 * NEXT_STATUS_ID: 下一个状态标识
	 */
	public void setNextStatusId(Integer value)
	 {
		this.nextStatusId = value;
	}
	
	/**
	 * 查询条件开始值,NEXT_STATUS_ID: 下一个状态标识
	 */
	public Integer getNextStatusIdBegin() {
		return this.nextStatusIdBegin;
	}
	
	/**
	 * 查询条件开始值,NEXT_STATUS_ID: 下一个状态标识
	 */
	public void setNextStatusIdBegin(Integer value)
	 {
		this.nextStatusIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,NEXT_STATUS_ID: 下一个状态标识
	 */
	public Integer getNextStatusIdEnd() {
		return this.nextStatusIdEnd;
	}
	
	/**
	 * 查询条件结束值,NEXT_STATUS_ID: 下一个状态标识
	 */
	public void setNextStatusIdEnd(Integer value)
	 {
		this.nextStatusIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,NEXT_STATUS_ID: 下一个状态标识
	 */
	public Integer getNextStatusIdEndEqual() {
		return this.nextStatusIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,NEXT_STATUS_ID: 下一个状态标识
	 */
	public void setNextStatusIdEndEqual(Integer value)
	 {
		this.nextStatusIdEndEqual = value;
	}
	
	/**
	 * ROLE_LIST: 允许进行状态变化的角色列表，用逗号分隔
	 */
	public String getRoleList() {
		return this.roleList;
	}
	
	/**
	 * ROLE_LIST: 允许进行状态变化的角色列表，用逗号分隔
	 */
	public void setRoleList(String value)
	 {
		this.roleList = value;
	}
	
	/**
	 * 查询条件字符串相等,ROLE_LIST: 允许进行状态变化的角色列表，用逗号分隔
	 */
	public String getRoleListEqual() {
		return this.roleListEqual;
	}
	
	/**
	 * 查询条件字符串相等,ROLE_LIST: 允许进行状态变化的角色列表，用逗号分隔
	 */
	public void setRoleListEqual(String value)
	 {
		this.roleListEqual = value;
	}
	
	/**
	 * 设置查询条件CURRENT_STATUS_ID: 当前状态标识
	 */
	public IssueStateChangeDefineQueryCondition setCurrentStatusIdCondition(Integer value) {
		this.currentStatusId = value;
		return this;
	}
	
	/**
	 * 设置查询条件CURRENT_STATUS_ID: 当前状态标识
	 */
	public IssueStateChangeDefineQueryCondition setCurrentStatusIdConditionBegin(Integer value) {
		this.currentStatusIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CURRENT_STATUS_ID: 当前状态标识
	 */
	public IssueStateChangeDefineQueryCondition setCurrentStatusIdConditionEnd(Integer value) {
		this.currentStatusIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CURRENT_STATUS_ID: 当前状态标识
	 */
	public IssueStateChangeDefineQueryCondition setCurrentStatusIdConditionEndEqual(Integer value) {
		this.currentStatusIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEXT_STATUS_ID: 下一个状态标识
	 */
	public IssueStateChangeDefineQueryCondition setNextStatusIdCondition(Integer value) {
		this.nextStatusId = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEXT_STATUS_ID: 下一个状态标识
	 */
	public IssueStateChangeDefineQueryCondition setNextStatusIdConditionBegin(Integer value) {
		this.nextStatusIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEXT_STATUS_ID: 下一个状态标识
	 */
	public IssueStateChangeDefineQueryCondition setNextStatusIdConditionEnd(Integer value) {
		this.nextStatusIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEXT_STATUS_ID: 下一个状态标识
	 */
	public IssueStateChangeDefineQueryCondition setNextStatusIdConditionEndEqual(Integer value) {
		this.nextStatusIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_LIST: 允许进行状态变化的角色列表，用逗号分隔
	 */
	public IssueStateChangeDefineQueryCondition setRoleListCondition(String value) {
		this.roleList = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_LIST: 允许进行状态变化的角色列表，用逗号分隔
	 */
	public IssueStateChangeDefineQueryCondition setRoleListConditionEqual(String value) {
		this.roleListEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.currentStatusId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_STATE_CHANGE_DEFINE].[CURRENT_STATUS_ID] = " + this.currentStatusId) 
						+ ") "));
		}
		if ((this.currentStatusIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_STATE_CHANGE_DEFINE].[CURRENT_STATUS_ID] >= " 
						+ (this.currentStatusIdBegin + ")")));
		}
		if ((this.currentStatusIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_STATE_CHANGE_DEFINE].[CURRENT_STATUS_ID] < " 
						+ (this.currentStatusIdEnd + ") ")));
		}
		if ((this.currentStatusIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_STATE_CHANGE_DEFINE].[CURRENT_STATUS_ID] <= " 
						+ (this.currentStatusIdEndEqual + ") ")));
		}
		if ((this.nextStatusId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_STATE_CHANGE_DEFINE].[NEXT_STATUS_ID] = " + this.nextStatusId) 
						+ ") "));
		}
		if ((this.nextStatusIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_STATE_CHANGE_DEFINE].[NEXT_STATUS_ID] >= " 
						+ (this.nextStatusIdBegin + ")")));
		}
		if ((this.nextStatusIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_STATE_CHANGE_DEFINE].[NEXT_STATUS_ID] < " 
						+ (this.nextStatusIdEnd + ") ")));
		}
		if ((this.nextStatusIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_STATE_CHANGE_DEFINE].[NEXT_STATUS_ID] <= " 
						+ (this.nextStatusIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.roleList)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ISSUE_STATE_CHANGE_DEFINE].[ROLE_LIST]", this.roleList)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.roleListEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ISSUE_STATE_CHANGE_DEFINE].[ROLE_LIST] = " + SqlServerUtils.safeSql(this.roleListEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
