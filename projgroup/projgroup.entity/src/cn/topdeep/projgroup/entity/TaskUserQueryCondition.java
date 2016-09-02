package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_TASK_USER查询条件定义
 */
public class TaskUserQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,TASK_USER_ID: 任务用户ID
	 */
	Integer taskUserId;
	
	/**
	 * 查询条件开始值,TASK_USER_ID: 任务用户ID
	 */
	Integer taskUserIdBegin;
	
	/**
	 * 查询条件结束值,TASK_USER_ID: 任务用户ID
	 */
	Integer taskUserIdEnd;
	
	/**
	 * 查询条件结束值,TASK_USER_ID: 任务用户ID
	 */
	Integer taskUserIdEndEqual;
	
	/**
	 * 查询条件,TASK_ID: 任务代号
	 */
	Integer taskId;
	
	/**
	 * 查询条件开始值,TASK_ID: 任务代号
	 */
	Integer taskIdBegin;
	
	/**
	 * 查询条件结束值,TASK_ID: 任务代号
	 */
	Integer taskIdEnd;
	
	/**
	 * 查询条件结束值,TASK_ID: 任务代号
	 */
	Integer taskIdEndEqual;
	
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
	 * TASK_USER_ID: 任务用户ID
	 */
	public Integer getTaskUserId() {
		return this.taskUserId;
	}
	
	/**
	 * TASK_USER_ID: 任务用户ID
	 */
	public void setTaskUserId(Integer value)
	 {
		this.taskUserId = value;
	}
	
	/**
	 * 查询条件开始值,TASK_USER_ID: 任务用户ID
	 */
	public Integer getTaskUserIdBegin() {
		return this.taskUserIdBegin;
	}
	
	/**
	 * 查询条件开始值,TASK_USER_ID: 任务用户ID
	 */
	public void setTaskUserIdBegin(Integer value)
	 {
		this.taskUserIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,TASK_USER_ID: 任务用户ID
	 */
	public Integer getTaskUserIdEnd() {
		return this.taskUserIdEnd;
	}
	
	/**
	 * 查询条件结束值,TASK_USER_ID: 任务用户ID
	 */
	public void setTaskUserIdEnd(Integer value)
	 {
		this.taskUserIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,TASK_USER_ID: 任务用户ID
	 */
	public Integer getTaskUserIdEndEqual() {
		return this.taskUserIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,TASK_USER_ID: 任务用户ID
	 */
	public void setTaskUserIdEndEqual(Integer value)
	 {
		this.taskUserIdEndEqual = value;
	}
	
	/**
	 * TASK_ID: 任务代号
	 */
	public Integer getTaskId() {
		return this.taskId;
	}
	
	/**
	 * TASK_ID: 任务代号
	 */
	public void setTaskId(Integer value)
	 {
		this.taskId = value;
	}
	
	/**
	 * 查询条件开始值,TASK_ID: 任务代号
	 */
	public Integer getTaskIdBegin() {
		return this.taskIdBegin;
	}
	
	/**
	 * 查询条件开始值,TASK_ID: 任务代号
	 */
	public void setTaskIdBegin(Integer value)
	 {
		this.taskIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,TASK_ID: 任务代号
	 */
	public Integer getTaskIdEnd() {
		return this.taskIdEnd;
	}
	
	/**
	 * 查询条件结束值,TASK_ID: 任务代号
	 */
	public void setTaskIdEnd(Integer value)
	 {
		this.taskIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,TASK_ID: 任务代号
	 */
	public Integer getTaskIdEndEqual() {
		return this.taskIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,TASK_ID: 任务代号
	 */
	public void setTaskIdEndEqual(Integer value)
	 {
		this.taskIdEndEqual = value;
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
	 * 设置查询条件TASK_USER_ID: 任务用户ID
	 */
	public TaskUserQueryCondition setTaskUserIdCondition(Integer value) {
		this.taskUserId = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_USER_ID: 任务用户ID
	 */
	public TaskUserQueryCondition setTaskUserIdConditionBegin(Integer value) {
		this.taskUserIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_USER_ID: 任务用户ID
	 */
	public TaskUserQueryCondition setTaskUserIdConditionEnd(Integer value) {
		this.taskUserIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_USER_ID: 任务用户ID
	 */
	public TaskUserQueryCondition setTaskUserIdConditionEndEqual(Integer value) {
		this.taskUserIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 任务代号
	 */
	public TaskUserQueryCondition setTaskIdCondition(Integer value) {
		this.taskId = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 任务代号
	 */
	public TaskUserQueryCondition setTaskIdConditionBegin(Integer value) {
		this.taskIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 任务代号
	 */
	public TaskUserQueryCondition setTaskIdConditionEnd(Integer value) {
		this.taskIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 任务代号
	 */
	public TaskUserQueryCondition setTaskIdConditionEndEqual(Integer value) {
		this.taskIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 用户代号
	 */
	public TaskUserQueryCondition setUserIdCondition(Integer value) {
		this.userId = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 用户代号
	 */
	public TaskUserQueryCondition setUserIdConditionBegin(Integer value) {
		this.userIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 用户代号
	 */
	public TaskUserQueryCondition setUserIdConditionEnd(Integer value) {
		this.userIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 用户代号
	 */
	public TaskUserQueryCondition setUserIdConditionEndEqual(Integer value) {
		this.userIdEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.taskUserId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK_USER].[TASK_USER_ID] = " + this.taskUserId) 
						+ ") "));
		}
		if ((this.taskUserIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK_USER].[TASK_USER_ID] >= " 
						+ (this.taskUserIdBegin + ")")));
		}
		if ((this.taskUserIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK_USER].[TASK_USER_ID] < " 
						+ (this.taskUserIdEnd + ") ")));
		}
		if ((this.taskUserIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK_USER].[TASK_USER_ID] <= " 
						+ (this.taskUserIdEndEqual + ") ")));
		}
		if ((this.taskId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK_USER].[TASK_ID] = " + this.taskId) 
						+ ") "));
		}
		if ((this.taskIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK_USER].[TASK_ID] >= " 
						+ (this.taskIdBegin + ")")));
		}
		if ((this.taskIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK_USER].[TASK_ID] < " 
						+ (this.taskIdEnd + ") ")));
		}
		if ((this.taskIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK_USER].[TASK_ID] <= " 
						+ (this.taskIdEndEqual + ") ")));
		}
		if ((this.userId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK_USER].[USER_ID] = " + this.userId) 
						+ ") "));
		}
		if ((this.userIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK_USER].[USER_ID] >= " 
						+ (this.userIdBegin + ")")));
		}
		if ((this.userIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK_USER].[USER_ID] < " 
						+ (this.userIdEnd + ") ")));
		}
		if ((this.userIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK_USER].[USER_ID] <= " 
						+ (this.userIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
