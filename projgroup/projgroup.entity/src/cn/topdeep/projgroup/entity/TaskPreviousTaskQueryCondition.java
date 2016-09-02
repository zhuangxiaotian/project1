package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_TASK_PREVIOUS_TASK查询条件定义
 */
public class TaskPreviousTaskQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,PREVIOUS_TASK_ID: 前驱任务代号
	 */
	Integer previousTaskId;
	
	/**
	 * 查询条件开始值,PREVIOUS_TASK_ID: 前驱任务代号
	 */
	Integer previousTaskIdBegin;
	
	/**
	 * 查询条件结束值,PREVIOUS_TASK_ID: 前驱任务代号
	 */
	Integer previousTaskIdEnd;
	
	/**
	 * 查询条件结束值,PREVIOUS_TASK_ID: 前驱任务代号
	 */
	Integer previousTaskIdEndEqual;
	
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
	 * PREVIOUS_TASK_ID: 前驱任务代号
	 */
	public Integer getPreviousTaskId() {
		return this.previousTaskId;
	}
	
	/**
	 * PREVIOUS_TASK_ID: 前驱任务代号
	 */
	public void setPreviousTaskId(Integer value)
	 {
		this.previousTaskId = value;
	}
	
	/**
	 * 查询条件开始值,PREVIOUS_TASK_ID: 前驱任务代号
	 */
	public Integer getPreviousTaskIdBegin() {
		return this.previousTaskIdBegin;
	}
	
	/**
	 * 查询条件开始值,PREVIOUS_TASK_ID: 前驱任务代号
	 */
	public void setPreviousTaskIdBegin(Integer value)
	 {
		this.previousTaskIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PREVIOUS_TASK_ID: 前驱任务代号
	 */
	public Integer getPreviousTaskIdEnd() {
		return this.previousTaskIdEnd;
	}
	
	/**
	 * 查询条件结束值,PREVIOUS_TASK_ID: 前驱任务代号
	 */
	public void setPreviousTaskIdEnd(Integer value)
	 {
		this.previousTaskIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PREVIOUS_TASK_ID: 前驱任务代号
	 */
	public Integer getPreviousTaskIdEndEqual() {
		return this.previousTaskIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PREVIOUS_TASK_ID: 前驱任务代号
	 */
	public void setPreviousTaskIdEndEqual(Integer value)
	 {
		this.previousTaskIdEndEqual = value;
	}
	
	/**
	 * 设置查询条件TASK_ID: 任务代号
	 */
	public TaskPreviousTaskQueryCondition setTaskIdCondition(Integer value) {
		this.taskId = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 任务代号
	 */
	public TaskPreviousTaskQueryCondition setTaskIdConditionBegin(Integer value) {
		this.taskIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 任务代号
	 */
	public TaskPreviousTaskQueryCondition setTaskIdConditionEnd(Integer value) {
		this.taskIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 任务代号
	 */
	public TaskPreviousTaskQueryCondition setTaskIdConditionEndEqual(Integer value) {
		this.taskIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PREVIOUS_TASK_ID: 前驱任务代号
	 */
	public TaskPreviousTaskQueryCondition setPreviousTaskIdCondition(Integer value) {
		this.previousTaskId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PREVIOUS_TASK_ID: 前驱任务代号
	 */
	public TaskPreviousTaskQueryCondition setPreviousTaskIdConditionBegin(Integer value) {
		this.previousTaskIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PREVIOUS_TASK_ID: 前驱任务代号
	 */
	public TaskPreviousTaskQueryCondition setPreviousTaskIdConditionEnd(Integer value) {
		this.previousTaskIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PREVIOUS_TASK_ID: 前驱任务代号
	 */
	public TaskPreviousTaskQueryCondition setPreviousTaskIdConditionEndEqual(Integer value) {
		this.previousTaskIdEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.taskId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK_PREVIOUS_TASK].[TASK_ID] = " + this.taskId) 
						+ ") "));
		}
		if ((this.taskIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK_PREVIOUS_TASK].[TASK_ID] >= " 
						+ (this.taskIdBegin + ")")));
		}
		if ((this.taskIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK_PREVIOUS_TASK].[TASK_ID] < " 
						+ (this.taskIdEnd + ") ")));
		}
		if ((this.taskIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK_PREVIOUS_TASK].[TASK_ID] <= " 
						+ (this.taskIdEndEqual + ") ")));
		}
		if ((this.previousTaskId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK_PREVIOUS_TASK].[PREVIOUS_TASK_ID] = " + this.previousTaskId) 
						+ ") "));
		}
		if ((this.previousTaskIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK_PREVIOUS_TASK].[PREVIOUS_TASK_ID] >= " 
						+ (this.previousTaskIdBegin + ")")));
		}
		if ((this.previousTaskIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK_PREVIOUS_TASK].[PREVIOUS_TASK_ID] < " 
						+ (this.previousTaskIdEnd + ") ")));
		}
		if ((this.previousTaskIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK_PREVIOUS_TASK].[PREVIOUS_TASK_ID] <= " 
						+ (this.previousTaskIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
