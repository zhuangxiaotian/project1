package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_WORK_LOG_RELATIONSHIP_TASK查询条件定义
 */
public class WorkLogRelationshipTaskQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,WORK_LOG_ID: 工作日志代号
	 */
	Integer workLogId;
	
	/**
	 * 查询条件开始值,WORK_LOG_ID: 工作日志代号
	 */
	Integer workLogIdBegin;
	
	/**
	 * 查询条件结束值,WORK_LOG_ID: 工作日志代号
	 */
	Integer workLogIdEnd;
	
	/**
	 * 查询条件结束值,WORK_LOG_ID: 工作日志代号
	 */
	Integer workLogIdEndEqual;
	
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
	 * WORK_LOG_ID: 工作日志代号
	 */
	public Integer getWorkLogId() {
		return this.workLogId;
	}
	
	/**
	 * WORK_LOG_ID: 工作日志代号
	 */
	public void setWorkLogId(Integer value)
	 {
		this.workLogId = value;
	}
	
	/**
	 * 查询条件开始值,WORK_LOG_ID: 工作日志代号
	 */
	public Integer getWorkLogIdBegin() {
		return this.workLogIdBegin;
	}
	
	/**
	 * 查询条件开始值,WORK_LOG_ID: 工作日志代号
	 */
	public void setWorkLogIdBegin(Integer value)
	 {
		this.workLogIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,WORK_LOG_ID: 工作日志代号
	 */
	public Integer getWorkLogIdEnd() {
		return this.workLogIdEnd;
	}
	
	/**
	 * 查询条件结束值,WORK_LOG_ID: 工作日志代号
	 */
	public void setWorkLogIdEnd(Integer value)
	 {
		this.workLogIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,WORK_LOG_ID: 工作日志代号
	 */
	public Integer getWorkLogIdEndEqual() {
		return this.workLogIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,WORK_LOG_ID: 工作日志代号
	 */
	public void setWorkLogIdEndEqual(Integer value)
	 {
		this.workLogIdEndEqual = value;
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
	 * 设置查询条件WORK_LOG_ID: 工作日志代号
	 */
	public WorkLogRelationshipTaskQueryCondition setWorkLogIdCondition(Integer value) {
		this.workLogId = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_LOG_ID: 工作日志代号
	 */
	public WorkLogRelationshipTaskQueryCondition setWorkLogIdConditionBegin(Integer value) {
		this.workLogIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_LOG_ID: 工作日志代号
	 */
	public WorkLogRelationshipTaskQueryCondition setWorkLogIdConditionEnd(Integer value) {
		this.workLogIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_LOG_ID: 工作日志代号
	 */
	public WorkLogRelationshipTaskQueryCondition setWorkLogIdConditionEndEqual(Integer value) {
		this.workLogIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 任务代号
	 */
	public WorkLogRelationshipTaskQueryCondition setTaskIdCondition(Integer value) {
		this.taskId = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 任务代号
	 */
	public WorkLogRelationshipTaskQueryCondition setTaskIdConditionBegin(Integer value) {
		this.taskIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 任务代号
	 */
	public WorkLogRelationshipTaskQueryCondition setTaskIdConditionEnd(Integer value) {
		this.taskIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 任务代号
	 */
	public WorkLogRelationshipTaskQueryCondition setTaskIdConditionEndEqual(Integer value) {
		this.taskIdEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.workLogId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_WORK_LOG_RELATIONSHIP_TASK].[WORK_LOG_ID] = " + this.workLogId) 
						+ ") "));
		}
		if ((this.workLogIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG_RELATIONSHIP_TASK].[WORK_LOG_ID] >= " 
						+ (this.workLogIdBegin + ")")));
		}
		if ((this.workLogIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG_RELATIONSHIP_TASK].[WORK_LOG_ID] < " 
						+ (this.workLogIdEnd + ") ")));
		}
		if ((this.workLogIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG_RELATIONSHIP_TASK].[WORK_LOG_ID] <= " 
						+ (this.workLogIdEndEqual + ") ")));
		}
		if ((this.taskId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_WORK_LOG_RELATIONSHIP_TASK].[TASK_ID] = " + this.taskId) 
						+ ") "));
		}
		if ((this.taskIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG_RELATIONSHIP_TASK].[TASK_ID] >= " 
						+ (this.taskIdBegin + ")")));
		}
		if ((this.taskIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG_RELATIONSHIP_TASK].[TASK_ID] < " 
						+ (this.taskIdEnd + ") ")));
		}
		if ((this.taskIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG_RELATIONSHIP_TASK].[TASK_ID] <= " 
						+ (this.taskIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
