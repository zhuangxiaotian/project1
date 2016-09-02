package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * V_TASK_PREVIOUS_TASK查询条件定义
 */
public class VTaskPreviousTaskQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,TASK_ID: 
	 */
	Integer taskId;
	
	/**
	 * 查询条件开始值,TASK_ID: 
	 */
	Integer taskIdBegin;
	
	/**
	 * 查询条件结束值,TASK_ID: 
	 */
	Integer taskIdEnd;
	
	/**
	 * 查询条件结束值,TASK_ID: 
	 */
	Integer taskIdEndEqual;
	
	/**
	 * 查询条件,PREVIOUS_TASK_ID: 
	 */
	Integer previousTaskId;
	
	/**
	 * 查询条件开始值,PREVIOUS_TASK_ID: 
	 */
	Integer previousTaskIdBegin;
	
	/**
	 * 查询条件结束值,PREVIOUS_TASK_ID: 
	 */
	Integer previousTaskIdEnd;
	
	/**
	 * 查询条件结束值,PREVIOUS_TASK_ID: 
	 */
	Integer previousTaskIdEndEqual;
	
	/**
	 * 查询条件,TASK_NAME: 
	 */
	String taskName;
	
	/**
	 * 查询条件字符串相等,TASK_NAME: 
	 */
	String taskNameEqual;
	
	/**
	 * 查询条件,TASK_OUTLINE: 
	 */
	String taskOutline;
	
	/**
	 * 查询条件字符串相等,TASK_OUTLINE: 
	 */
	String taskOutlineEqual;
	
	/**
	 * 查询条件,TASK_PROJECT_ID: 
	 */
	Integer taskProjectId;
	
	/**
	 * 查询条件开始值,TASK_PROJECT_ID: 
	 */
	Integer taskProjectIdBegin;
	
	/**
	 * 查询条件结束值,TASK_PROJECT_ID: 
	 */
	Integer taskProjectIdEnd;
	
	/**
	 * 查询条件结束值,TASK_PROJECT_ID: 
	 */
	Integer taskProjectIdEndEqual;
	
	/**
	 * TASK_ID: 
	 */
	public Integer getTaskId() {
		return this.taskId;
	}
	
	/**
	 * TASK_ID: 
	 */
	public void setTaskId(Integer value)
	 {
		this.taskId = value;
	}
	
	/**
	 * 查询条件开始值,TASK_ID: 
	 */
	public Integer getTaskIdBegin() {
		return this.taskIdBegin;
	}
	
	/**
	 * 查询条件开始值,TASK_ID: 
	 */
	public void setTaskIdBegin(Integer value)
	 {
		this.taskIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,TASK_ID: 
	 */
	public Integer getTaskIdEnd() {
		return this.taskIdEnd;
	}
	
	/**
	 * 查询条件结束值,TASK_ID: 
	 */
	public void setTaskIdEnd(Integer value)
	 {
		this.taskIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,TASK_ID: 
	 */
	public Integer getTaskIdEndEqual() {
		return this.taskIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,TASK_ID: 
	 */
	public void setTaskIdEndEqual(Integer value)
	 {
		this.taskIdEndEqual = value;
	}
	
	/**
	 * PREVIOUS_TASK_ID: 
	 */
	public Integer getPreviousTaskId() {
		return this.previousTaskId;
	}
	
	/**
	 * PREVIOUS_TASK_ID: 
	 */
	public void setPreviousTaskId(Integer value)
	 {
		this.previousTaskId = value;
	}
	
	/**
	 * 查询条件开始值,PREVIOUS_TASK_ID: 
	 */
	public Integer getPreviousTaskIdBegin() {
		return this.previousTaskIdBegin;
	}
	
	/**
	 * 查询条件开始值,PREVIOUS_TASK_ID: 
	 */
	public void setPreviousTaskIdBegin(Integer value)
	 {
		this.previousTaskIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PREVIOUS_TASK_ID: 
	 */
	public Integer getPreviousTaskIdEnd() {
		return this.previousTaskIdEnd;
	}
	
	/**
	 * 查询条件结束值,PREVIOUS_TASK_ID: 
	 */
	public void setPreviousTaskIdEnd(Integer value)
	 {
		this.previousTaskIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PREVIOUS_TASK_ID: 
	 */
	public Integer getPreviousTaskIdEndEqual() {
		return this.previousTaskIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PREVIOUS_TASK_ID: 
	 */
	public void setPreviousTaskIdEndEqual(Integer value)
	 {
		this.previousTaskIdEndEqual = value;
	}
	
	/**
	 * TASK_NAME: 
	 */
	public String getTaskName() {
		return this.taskName;
	}
	
	/**
	 * TASK_NAME: 
	 */
	public void setTaskName(String value)
	 {
		this.taskName = value;
	}
	
	/**
	 * 查询条件字符串相等,TASK_NAME: 
	 */
	public String getTaskNameEqual() {
		return this.taskNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,TASK_NAME: 
	 */
	public void setTaskNameEqual(String value)
	 {
		this.taskNameEqual = value;
	}
	
	/**
	 * TASK_OUTLINE: 
	 */
	public String getTaskOutline() {
		return this.taskOutline;
	}
	
	/**
	 * TASK_OUTLINE: 
	 */
	public void setTaskOutline(String value)
	 {
		this.taskOutline = value;
	}
	
	/**
	 * 查询条件字符串相等,TASK_OUTLINE: 
	 */
	public String getTaskOutlineEqual() {
		return this.taskOutlineEqual;
	}
	
	/**
	 * 查询条件字符串相等,TASK_OUTLINE: 
	 */
	public void setTaskOutlineEqual(String value)
	 {
		this.taskOutlineEqual = value;
	}
	
	/**
	 * TASK_PROJECT_ID: 
	 */
	public Integer getTaskProjectId() {
		return this.taskProjectId;
	}
	
	/**
	 * TASK_PROJECT_ID: 
	 */
	public void setTaskProjectId(Integer value)
	 {
		this.taskProjectId = value;
	}
	
	/**
	 * 查询条件开始值,TASK_PROJECT_ID: 
	 */
	public Integer getTaskProjectIdBegin() {
		return this.taskProjectIdBegin;
	}
	
	/**
	 * 查询条件开始值,TASK_PROJECT_ID: 
	 */
	public void setTaskProjectIdBegin(Integer value)
	 {
		this.taskProjectIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,TASK_PROJECT_ID: 
	 */
	public Integer getTaskProjectIdEnd() {
		return this.taskProjectIdEnd;
	}
	
	/**
	 * 查询条件结束值,TASK_PROJECT_ID: 
	 */
	public void setTaskProjectIdEnd(Integer value)
	 {
		this.taskProjectIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,TASK_PROJECT_ID: 
	 */
	public Integer getTaskProjectIdEndEqual() {
		return this.taskProjectIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,TASK_PROJECT_ID: 
	 */
	public void setTaskProjectIdEndEqual(Integer value)
	 {
		this.taskProjectIdEndEqual = value;
	}
	
	/**
	 * 设置查询条件TASK_ID: 
	 */
	public VTaskPreviousTaskQueryCondition setTaskIdCondition(Integer value) {
		this.taskId = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 
	 */
	public VTaskPreviousTaskQueryCondition setTaskIdConditionBegin(Integer value) {
		this.taskIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 
	 */
	public VTaskPreviousTaskQueryCondition setTaskIdConditionEnd(Integer value) {
		this.taskIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 
	 */
	public VTaskPreviousTaskQueryCondition setTaskIdConditionEndEqual(Integer value) {
		this.taskIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PREVIOUS_TASK_ID: 
	 */
	public VTaskPreviousTaskQueryCondition setPreviousTaskIdCondition(Integer value) {
		this.previousTaskId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PREVIOUS_TASK_ID: 
	 */
	public VTaskPreviousTaskQueryCondition setPreviousTaskIdConditionBegin(Integer value) {
		this.previousTaskIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PREVIOUS_TASK_ID: 
	 */
	public VTaskPreviousTaskQueryCondition setPreviousTaskIdConditionEnd(Integer value) {
		this.previousTaskIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PREVIOUS_TASK_ID: 
	 */
	public VTaskPreviousTaskQueryCondition setPreviousTaskIdConditionEndEqual(Integer value) {
		this.previousTaskIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_NAME: 
	 */
	public VTaskPreviousTaskQueryCondition setTaskNameCondition(String value) {
		this.taskName = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_NAME: 
	 */
	public VTaskPreviousTaskQueryCondition setTaskNameConditionEqual(String value) {
		this.taskNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_OUTLINE: 
	 */
	public VTaskPreviousTaskQueryCondition setTaskOutlineCondition(String value) {
		this.taskOutline = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_OUTLINE: 
	 */
	public VTaskPreviousTaskQueryCondition setTaskOutlineConditionEqual(String value) {
		this.taskOutlineEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_PROJECT_ID: 
	 */
	public VTaskPreviousTaskQueryCondition setTaskProjectIdCondition(Integer value) {
		this.taskProjectId = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_PROJECT_ID: 
	 */
	public VTaskPreviousTaskQueryCondition setTaskProjectIdConditionBegin(Integer value) {
		this.taskProjectIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_PROJECT_ID: 
	 */
	public VTaskPreviousTaskQueryCondition setTaskProjectIdConditionEnd(Integer value) {
		this.taskProjectIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_PROJECT_ID: 
	 */
	public VTaskPreviousTaskQueryCondition setTaskProjectIdConditionEndEqual(Integer value) {
		this.taskProjectIdEndEqual = value;
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
						+ ((" and ([V_TASK_PREVIOUS_TASK].[TASK_ID] = " + this.taskId) 
						+ ") "));
		}
		if ((this.taskIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TASK_PREVIOUS_TASK].[TASK_ID] >= " 
						+ (this.taskIdBegin + ")")));
		}
		if ((this.taskIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TASK_PREVIOUS_TASK].[TASK_ID] < " 
						+ (this.taskIdEnd + ") ")));
		}
		if ((this.taskIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TASK_PREVIOUS_TASK].[TASK_ID] <= " 
						+ (this.taskIdEndEqual + ") ")));
		}
		if ((this.previousTaskId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_TASK_PREVIOUS_TASK].[PREVIOUS_TASK_ID] = " + this.previousTaskId) 
						+ ") "));
		}
		if ((this.previousTaskIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TASK_PREVIOUS_TASK].[PREVIOUS_TASK_ID] >= " 
						+ (this.previousTaskIdBegin + ")")));
		}
		if ((this.previousTaskIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TASK_PREVIOUS_TASK].[PREVIOUS_TASK_ID] < " 
						+ (this.previousTaskIdEnd + ") ")));
		}
		if ((this.previousTaskIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TASK_PREVIOUS_TASK].[PREVIOUS_TASK_ID] <= " 
						+ (this.previousTaskIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.taskName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[V_TASK_PREVIOUS_TASK].[TASK_NAME]", this.taskName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.taskNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[V_TASK_PREVIOUS_TASK].[TASK_NAME] = " + SqlServerUtils.safeSql(this.taskNameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.taskOutline)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[V_TASK_PREVIOUS_TASK].[TASK_OUTLINE]", this.taskOutline)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.taskOutlineEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[V_TASK_PREVIOUS_TASK].[TASK_OUTLINE] = " + SqlServerUtils.safeSql(this.taskOutlineEqual))) 
						+ ") "));
		}
		if ((this.taskProjectId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_TASK_PREVIOUS_TASK].[TASK_PROJECT_ID] = " + this.taskProjectId) 
						+ ") "));
		}
		if ((this.taskProjectIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TASK_PREVIOUS_TASK].[TASK_PROJECT_ID] >= " 
						+ (this.taskProjectIdBegin + ")")));
		}
		if ((this.taskProjectIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TASK_PREVIOUS_TASK].[TASK_PROJECT_ID] < " 
						+ (this.taskProjectIdEnd + ") ")));
		}
		if ((this.taskProjectIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TASK_PREVIOUS_TASK].[TASK_PROJECT_ID] <= " 
						+ (this.taskProjectIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
