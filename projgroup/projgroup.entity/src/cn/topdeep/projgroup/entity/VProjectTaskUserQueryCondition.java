package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * V_PROJECT_TASK_USER查询条件定义
 */
public class VProjectTaskUserQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,TASK_USER_ID: 
	 */
	Integer taskUserId;
	
	/**
	 * 查询条件开始值,TASK_USER_ID: 
	 */
	Integer taskUserIdBegin;
	
	/**
	 * 查询条件结束值,TASK_USER_ID: 
	 */
	Integer taskUserIdEnd;
	
	/**
	 * 查询条件结束值,TASK_USER_ID: 
	 */
	Integer taskUserIdEndEqual;
	
	/**
	 * 查询条件,SELECTED: 
	 */
	Boolean selected;
	
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
	 * TASK_USER_ID: 
	 */
	public Integer getTaskUserId() {
		return this.taskUserId;
	}
	
	/**
	 * TASK_USER_ID: 
	 */
	public void setTaskUserId(Integer value)
	 {
		this.taskUserId = value;
	}
	
	/**
	 * 查询条件开始值,TASK_USER_ID: 
	 */
	public Integer getTaskUserIdBegin() {
		return this.taskUserIdBegin;
	}
	
	/**
	 * 查询条件开始值,TASK_USER_ID: 
	 */
	public void setTaskUserIdBegin(Integer value)
	 {
		this.taskUserIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,TASK_USER_ID: 
	 */
	public Integer getTaskUserIdEnd() {
		return this.taskUserIdEnd;
	}
	
	/**
	 * 查询条件结束值,TASK_USER_ID: 
	 */
	public void setTaskUserIdEnd(Integer value)
	 {
		this.taskUserIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,TASK_USER_ID: 
	 */
	public Integer getTaskUserIdEndEqual() {
		return this.taskUserIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,TASK_USER_ID: 
	 */
	public void setTaskUserIdEndEqual(Integer value)
	 {
		this.taskUserIdEndEqual = value;
	}
	
	/**
	 * SELECTED: 
	 */
	public Boolean getSelected() {
		return this.selected;
	}
	
	/**
	 * SELECTED: 
	 */
	public void setSelected(Boolean value)
	 {
		this.selected = value;
	}
	
	/**
	 * 设置查询条件PROJECT_ID: 
	 */
	public VProjectTaskUserQueryCondition setProjectIdCondition(Integer value) {
		this.projectId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_ID: 
	 */
	public VProjectTaskUserQueryCondition setProjectIdConditionBegin(Integer value) {
		this.projectIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_ID: 
	 */
	public VProjectTaskUserQueryCondition setProjectIdConditionEnd(Integer value) {
		this.projectIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_ID: 
	 */
	public VProjectTaskUserQueryCondition setProjectIdConditionEndEqual(Integer value) {
		this.projectIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 
	 */
	public VProjectTaskUserQueryCondition setUserIdCondition(Integer value) {
		this.userId = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 
	 */
	public VProjectTaskUserQueryCondition setUserIdConditionBegin(Integer value) {
		this.userIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 
	 */
	public VProjectTaskUserQueryCondition setUserIdConditionEnd(Integer value) {
		this.userIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 
	 */
	public VProjectTaskUserQueryCondition setUserIdConditionEndEqual(Integer value) {
		this.userIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件REAL_NAME: 
	 */
	public VProjectTaskUserQueryCondition setRealNameCondition(String value) {
		this.realName = value;
		return this;
	}
	
	/**
	 * 设置查询条件REAL_NAME: 
	 */
	public VProjectTaskUserQueryCondition setRealNameConditionEqual(String value) {
		this.realNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 
	 */
	public VProjectTaskUserQueryCondition setTaskIdCondition(Integer value) {
		this.taskId = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 
	 */
	public VProjectTaskUserQueryCondition setTaskIdConditionBegin(Integer value) {
		this.taskIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 
	 */
	public VProjectTaskUserQueryCondition setTaskIdConditionEnd(Integer value) {
		this.taskIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 
	 */
	public VProjectTaskUserQueryCondition setTaskIdConditionEndEqual(Integer value) {
		this.taskIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_USER_ID: 
	 */
	public VProjectTaskUserQueryCondition setTaskUserIdCondition(Integer value) {
		this.taskUserId = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_USER_ID: 
	 */
	public VProjectTaskUserQueryCondition setTaskUserIdConditionBegin(Integer value) {
		this.taskUserIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_USER_ID: 
	 */
	public VProjectTaskUserQueryCondition setTaskUserIdConditionEnd(Integer value) {
		this.taskUserIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_USER_ID: 
	 */
	public VProjectTaskUserQueryCondition setTaskUserIdConditionEndEqual(Integer value) {
		this.taskUserIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件SELECTED: 
	 */
	public VProjectTaskUserQueryCondition setSelectedCondition(Boolean value) {
		this.selected = value;
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
						+ ((" and ([V_PROJECT_TASK_USER].[PROJECT_ID] = " + this.projectId) 
						+ ") "));
		}
		if ((this.projectIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PROJECT_TASK_USER].[PROJECT_ID] >= " 
						+ (this.projectIdBegin + ")")));
		}
		if ((this.projectIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PROJECT_TASK_USER].[PROJECT_ID] < " 
						+ (this.projectIdEnd + ") ")));
		}
		if ((this.projectIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PROJECT_TASK_USER].[PROJECT_ID] <= " 
						+ (this.projectIdEndEqual + ") ")));
		}
		if ((this.userId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_PROJECT_TASK_USER].[USER_ID] = " + this.userId) 
						+ ") "));
		}
		if ((this.userIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PROJECT_TASK_USER].[USER_ID] >= " 
						+ (this.userIdBegin + ")")));
		}
		if ((this.userIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PROJECT_TASK_USER].[USER_ID] < " 
						+ (this.userIdEnd + ") ")));
		}
		if ((this.userIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PROJECT_TASK_USER].[USER_ID] <= " 
						+ (this.userIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.realName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[V_PROJECT_TASK_USER].[REAL_NAME]", this.realName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.realNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[V_PROJECT_TASK_USER].[REAL_NAME] = " + SqlServerUtils.safeSql(this.realNameEqual))) 
						+ ") "));
		}
		if ((this.taskId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_PROJECT_TASK_USER].[TASK_ID] = " + this.taskId) 
						+ ") "));
		}
		if ((this.taskIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PROJECT_TASK_USER].[TASK_ID] >= " 
						+ (this.taskIdBegin + ")")));
		}
		if ((this.taskIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PROJECT_TASK_USER].[TASK_ID] < " 
						+ (this.taskIdEnd + ") ")));
		}
		if ((this.taskIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PROJECT_TASK_USER].[TASK_ID] <= " 
						+ (this.taskIdEndEqual + ") ")));
		}
		if ((this.taskUserId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_PROJECT_TASK_USER].[TASK_USER_ID] = " + this.taskUserId) 
						+ ") "));
		}
		if ((this.taskUserIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PROJECT_TASK_USER].[TASK_USER_ID] >= " 
						+ (this.taskUserIdBegin + ")")));
		}
		if ((this.taskUserIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PROJECT_TASK_USER].[TASK_USER_ID] < " 
						+ (this.taskUserIdEnd + ") ")));
		}
		if ((this.taskUserIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PROJECT_TASK_USER].[TASK_USER_ID] <= " 
						+ (this.taskUserIdEndEqual + ") ")));
		}
		if ((this.selected == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_PROJECT_TASK_USER].[SELECTED] = " + SqlServerUtils.getBoolSql(this.selected)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
