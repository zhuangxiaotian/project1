package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_WORK_LOG查询条件定义
 */
public class WorkLogQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,CREATE_TIME: 创建时间
	 */
	java.util.Date createTime;
	
	/**
	 * 查询条件开始值,CREATE_TIME: 创建时间
	 */
	java.util.Date createTimeBegin;
	
	/**
	 * 查询条件结束值,CREATE_TIME: 创建时间
	 */
	java.util.Date createTimeEnd;
	
	/**
	 * 查询条件结束值,CREATE_TIME: 创建时间
	 */
	java.util.Date createTimeEndEqual;
	
	/**
	 * 查询条件,MODIFY_TIME: 修改时间
	 */
	java.util.Date modifyTime;
	
	/**
	 * 查询条件开始值,MODIFY_TIME: 修改时间
	 */
	java.util.Date modifyTimeBegin;
	
	/**
	 * 查询条件结束值,MODIFY_TIME: 修改时间
	 */
	java.util.Date modifyTimeEnd;
	
	/**
	 * 查询条件结束值,MODIFY_TIME: 修改时间
	 */
	java.util.Date modifyTimeEndEqual;
	
	/**
	 * 查询条件,WORK_CONTENT: 工作内容
	 */
	String workContent;
	
	/**
	 * 查询条件字符串相等,WORK_CONTENT: 工作内容
	 */
	String workContentEqual;
	
	/**
	 * 查询条件,WORK_DAY: 工作日
	 */
	java.util.Date workDay;
	
	/**
	 * 查询条件开始值,WORK_DAY: 工作日
	 */
	java.util.Date workDayBegin;
	
	/**
	 * 查询条件结束值,WORK_DAY: 工作日
	 */
	java.util.Date workDayEnd;
	
	/**
	 * 查询条件结束值,WORK_DAY: 工作日
	 */
	java.util.Date workDayEndEqual;
	
	/**
	 * 查询条件,WORK_USER_ID: 职工号
	 */
	Integer workUserId;
	
	/**
	 * 查询条件开始值,WORK_USER_ID: 职工号
	 */
	Integer workUserIdBegin;
	
	/**
	 * 查询条件结束值,WORK_USER_ID: 职工号
	 */
	Integer workUserIdEnd;
	
	/**
	 * 查询条件结束值,WORK_USER_ID: 职工号
	 */
	Integer workUserIdEndEqual;
	
	/**
	 * 查询条件,WORK_EVALUATION_SCORE: 工作评价分数
	 */
	Integer workEvaluationScore;
	
	/**
	 * 查询条件开始值,WORK_EVALUATION_SCORE: 工作评价分数
	 */
	Integer workEvaluationScoreBegin;
	
	/**
	 * 查询条件结束值,WORK_EVALUATION_SCORE: 工作评价分数
	 */
	Integer workEvaluationScoreEnd;
	
	/**
	 * 查询条件结束值,WORK_EVALUATION_SCORE: 工作评价分数
	 */
	Integer workEvaluationScoreEndEqual;
	
	/**
	 * 查询条件,WORK_EVALUATION_CONTENT: 工作评价内容
	 */
	String workEvaluationContent;
	
	/**
	 * 查询条件字符串相等,WORK_EVALUATION_CONTENT: 工作评价内容
	 */
	String workEvaluationContentEqual;
	
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
	 * CREATE_TIME: 创建时间
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	
	/**
	 * CREATE_TIME: 创建时间
	 */
	public void setCreateTime(java.util.Date value)
	 {
		this.createTime = value;
	}
	
	/**
	 * 查询条件开始值,CREATE_TIME: 创建时间
	 */
	public java.util.Date getCreateTimeBegin() {
		return this.createTimeBegin;
	}
	
	/**
	 * 查询条件开始值,CREATE_TIME: 创建时间
	 */
	public void setCreateTimeBegin(java.util.Date value)
	 {
		this.createTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,CREATE_TIME: 创建时间
	 */
	public java.util.Date getCreateTimeEnd() {
		return this.createTimeEnd;
	}
	
	/**
	 * 查询条件结束值,CREATE_TIME: 创建时间
	 */
	public void setCreateTimeEnd(java.util.Date value)
	 {
		this.createTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,CREATE_TIME: 创建时间
	 */
	public java.util.Date getCreateTimeEndEqual() {
		return this.createTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,CREATE_TIME: 创建时间
	 */
	public void setCreateTimeEndEqual(java.util.Date value)
	 {
		this.createTimeEndEqual = value;
	}
	
	/**
	 * MODIFY_TIME: 修改时间
	 */
	public java.util.Date getModifyTime() {
		return this.modifyTime;
	}
	
	/**
	 * MODIFY_TIME: 修改时间
	 */
	public void setModifyTime(java.util.Date value)
	 {
		this.modifyTime = value;
	}
	
	/**
	 * 查询条件开始值,MODIFY_TIME: 修改时间
	 */
	public java.util.Date getModifyTimeBegin() {
		return this.modifyTimeBegin;
	}
	
	/**
	 * 查询条件开始值,MODIFY_TIME: 修改时间
	 */
	public void setModifyTimeBegin(java.util.Date value)
	 {
		this.modifyTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,MODIFY_TIME: 修改时间
	 */
	public java.util.Date getModifyTimeEnd() {
		return this.modifyTimeEnd;
	}
	
	/**
	 * 查询条件结束值,MODIFY_TIME: 修改时间
	 */
	public void setModifyTimeEnd(java.util.Date value)
	 {
		this.modifyTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,MODIFY_TIME: 修改时间
	 */
	public java.util.Date getModifyTimeEndEqual() {
		return this.modifyTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,MODIFY_TIME: 修改时间
	 */
	public void setModifyTimeEndEqual(java.util.Date value)
	 {
		this.modifyTimeEndEqual = value;
	}
	
	/**
	 * WORK_CONTENT: 工作内容
	 */
	public String getWorkContent() {
		return this.workContent;
	}
	
	/**
	 * WORK_CONTENT: 工作内容
	 */
	public void setWorkContent(String value)
	 {
		this.workContent = value;
	}
	
	/**
	 * 查询条件字符串相等,WORK_CONTENT: 工作内容
	 */
	public String getWorkContentEqual() {
		return this.workContentEqual;
	}
	
	/**
	 * 查询条件字符串相等,WORK_CONTENT: 工作内容
	 */
	public void setWorkContentEqual(String value)
	 {
		this.workContentEqual = value;
	}
	
	/**
	 * WORK_DAY: 工作日
	 */
	public java.util.Date getWorkDay() {
		return this.workDay;
	}
	
	/**
	 * WORK_DAY: 工作日
	 */
	public void setWorkDay(java.util.Date value)
	 {
		this.workDay = value;
	}
	
	/**
	 * 查询条件开始值,WORK_DAY: 工作日
	 */
	public java.util.Date getWorkDayBegin() {
		return this.workDayBegin;
	}
	
	/**
	 * 查询条件开始值,WORK_DAY: 工作日
	 */
	public void setWorkDayBegin(java.util.Date value)
	 {
		this.workDayBegin = value;
	}
	
	/**
	 * 查询条件结束值,WORK_DAY: 工作日
	 */
	public java.util.Date getWorkDayEnd() {
		return this.workDayEnd;
	}
	
	/**
	 * 查询条件结束值,WORK_DAY: 工作日
	 */
	public void setWorkDayEnd(java.util.Date value)
	 {
		this.workDayEnd = value;
	}
	
	/**
	 * 查询条件结束值,WORK_DAY: 工作日
	 */
	public java.util.Date getWorkDayEndEqual() {
		return this.workDayEndEqual;
	}
	
	/**
	 * 查询条件结束值,WORK_DAY: 工作日
	 */
	public void setWorkDayEndEqual(java.util.Date value)
	 {
		this.workDayEndEqual = value;
	}
	
	/**
	 * WORK_USER_ID: 职工号
	 */
	public Integer getWorkUserId() {
		return this.workUserId;
	}
	
	/**
	 * WORK_USER_ID: 职工号
	 */
	public void setWorkUserId(Integer value)
	 {
		this.workUserId = value;
	}
	
	/**
	 * 查询条件开始值,WORK_USER_ID: 职工号
	 */
	public Integer getWorkUserIdBegin() {
		return this.workUserIdBegin;
	}
	
	/**
	 * 查询条件开始值,WORK_USER_ID: 职工号
	 */
	public void setWorkUserIdBegin(Integer value)
	 {
		this.workUserIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,WORK_USER_ID: 职工号
	 */
	public Integer getWorkUserIdEnd() {
		return this.workUserIdEnd;
	}
	
	/**
	 * 查询条件结束值,WORK_USER_ID: 职工号
	 */
	public void setWorkUserIdEnd(Integer value)
	 {
		this.workUserIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,WORK_USER_ID: 职工号
	 */
	public Integer getWorkUserIdEndEqual() {
		return this.workUserIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,WORK_USER_ID: 职工号
	 */
	public void setWorkUserIdEndEqual(Integer value)
	 {
		this.workUserIdEndEqual = value;
	}
	
	/**
	 * WORK_EVALUATION_SCORE: 工作评价分数
	 */
	public Integer getWorkEvaluationScore() {
		return this.workEvaluationScore;
	}
	
	/**
	 * WORK_EVALUATION_SCORE: 工作评价分数
	 */
	public void setWorkEvaluationScore(Integer value)
	 {
		this.workEvaluationScore = value;
	}
	
	/**
	 * 查询条件开始值,WORK_EVALUATION_SCORE: 工作评价分数
	 */
	public Integer getWorkEvaluationScoreBegin() {
		return this.workEvaluationScoreBegin;
	}
	
	/**
	 * 查询条件开始值,WORK_EVALUATION_SCORE: 工作评价分数
	 */
	public void setWorkEvaluationScoreBegin(Integer value)
	 {
		this.workEvaluationScoreBegin = value;
	}
	
	/**
	 * 查询条件结束值,WORK_EVALUATION_SCORE: 工作评价分数
	 */
	public Integer getWorkEvaluationScoreEnd() {
		return this.workEvaluationScoreEnd;
	}
	
	/**
	 * 查询条件结束值,WORK_EVALUATION_SCORE: 工作评价分数
	 */
	public void setWorkEvaluationScoreEnd(Integer value)
	 {
		this.workEvaluationScoreEnd = value;
	}
	
	/**
	 * 查询条件结束值,WORK_EVALUATION_SCORE: 工作评价分数
	 */
	public Integer getWorkEvaluationScoreEndEqual() {
		return this.workEvaluationScoreEndEqual;
	}
	
	/**
	 * 查询条件结束值,WORK_EVALUATION_SCORE: 工作评价分数
	 */
	public void setWorkEvaluationScoreEndEqual(Integer value)
	 {
		this.workEvaluationScoreEndEqual = value;
	}
	
	/**
	 * WORK_EVALUATION_CONTENT: 工作评价内容
	 */
	public String getWorkEvaluationContent() {
		return this.workEvaluationContent;
	}
	
	/**
	 * WORK_EVALUATION_CONTENT: 工作评价内容
	 */
	public void setWorkEvaluationContent(String value)
	 {
		this.workEvaluationContent = value;
	}
	
	/**
	 * 查询条件字符串相等,WORK_EVALUATION_CONTENT: 工作评价内容
	 */
	public String getWorkEvaluationContentEqual() {
		return this.workEvaluationContentEqual;
	}
	
	/**
	 * 查询条件字符串相等,WORK_EVALUATION_CONTENT: 工作评价内容
	 */
	public void setWorkEvaluationContentEqual(String value)
	 {
		this.workEvaluationContentEqual = value;
	}
	
	/**
	 * 设置查询条件WORK_LOG_ID: 工作日志代号
	 */
	public WorkLogQueryCondition setWorkLogIdCondition(Integer value) {
		this.workLogId = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_LOG_ID: 工作日志代号
	 */
	public WorkLogQueryCondition setWorkLogIdConditionBegin(Integer value) {
		this.workLogIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_LOG_ID: 工作日志代号
	 */
	public WorkLogQueryCondition setWorkLogIdConditionEnd(Integer value) {
		this.workLogIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_LOG_ID: 工作日志代号
	 */
	public WorkLogQueryCondition setWorkLogIdConditionEndEqual(Integer value) {
		this.workLogIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 创建时间
	 */
	public WorkLogQueryCondition setCreateTimeCondition(java.util.Date value) {
		this.createTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 创建时间
	 */
	public WorkLogQueryCondition setCreateTimeConditionBegin(java.util.Date value) {
		this.createTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 创建时间
	 */
	public WorkLogQueryCondition setCreateTimeConditionEnd(java.util.Date value) {
		this.createTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 创建时间
	 */
	public WorkLogQueryCondition setCreateTimeConditionEndEqual(java.util.Date value) {
		this.createTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 修改时间
	 */
	public WorkLogQueryCondition setModifyTimeCondition(java.util.Date value) {
		this.modifyTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 修改时间
	 */
	public WorkLogQueryCondition setModifyTimeConditionBegin(java.util.Date value) {
		this.modifyTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 修改时间
	 */
	public WorkLogQueryCondition setModifyTimeConditionEnd(java.util.Date value) {
		this.modifyTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 修改时间
	 */
	public WorkLogQueryCondition setModifyTimeConditionEndEqual(java.util.Date value) {
		this.modifyTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_CONTENT: 工作内容
	 */
	public WorkLogQueryCondition setWorkContentCondition(String value) {
		this.workContent = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_CONTENT: 工作内容
	 */
	public WorkLogQueryCondition setWorkContentConditionEqual(String value) {
		this.workContentEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_DAY: 工作日
	 */
	public WorkLogQueryCondition setWorkDayCondition(java.util.Date value) {
		this.workDay = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_DAY: 工作日
	 */
	public WorkLogQueryCondition setWorkDayConditionBegin(java.util.Date value) {
		this.workDayBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_DAY: 工作日
	 */
	public WorkLogQueryCondition setWorkDayConditionEnd(java.util.Date value) {
		this.workDayEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_DAY: 工作日
	 */
	public WorkLogQueryCondition setWorkDayConditionEndEqual(java.util.Date value) {
		this.workDayEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_USER_ID: 职工号
	 */
	public WorkLogQueryCondition setWorkUserIdCondition(Integer value) {
		this.workUserId = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_USER_ID: 职工号
	 */
	public WorkLogQueryCondition setWorkUserIdConditionBegin(Integer value) {
		this.workUserIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_USER_ID: 职工号
	 */
	public WorkLogQueryCondition setWorkUserIdConditionEnd(Integer value) {
		this.workUserIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_USER_ID: 职工号
	 */
	public WorkLogQueryCondition setWorkUserIdConditionEndEqual(Integer value) {
		this.workUserIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_EVALUATION_SCORE: 工作评价分数
	 */
	public WorkLogQueryCondition setWorkEvaluationScoreCondition(Integer value) {
		this.workEvaluationScore = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_EVALUATION_SCORE: 工作评价分数
	 */
	public WorkLogQueryCondition setWorkEvaluationScoreConditionBegin(Integer value) {
		this.workEvaluationScoreBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_EVALUATION_SCORE: 工作评价分数
	 */
	public WorkLogQueryCondition setWorkEvaluationScoreConditionEnd(Integer value) {
		this.workEvaluationScoreEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_EVALUATION_SCORE: 工作评价分数
	 */
	public WorkLogQueryCondition setWorkEvaluationScoreConditionEndEqual(Integer value) {
		this.workEvaluationScoreEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_EVALUATION_CONTENT: 工作评价内容
	 */
	public WorkLogQueryCondition setWorkEvaluationContentCondition(String value) {
		this.workEvaluationContent = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_EVALUATION_CONTENT: 工作评价内容
	 */
	public WorkLogQueryCondition setWorkEvaluationContentConditionEqual(String value) {
		this.workEvaluationContentEqual = value;
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
						+ ((" and ([T_WORK_LOG].[WORK_LOG_ID] = " + this.workLogId) 
						+ ") "));
		}
		if ((this.workLogIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG].[WORK_LOG_ID] >= " 
						+ (this.workLogIdBegin + ")")));
		}
		if ((this.workLogIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG].[WORK_LOG_ID] < " 
						+ (this.workLogIdEnd + ") ")));
		}
		if ((this.workLogIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG].[WORK_LOG_ID] <= " 
						+ (this.workLogIdEndEqual + ") ")));
		}
		if ((this.createTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_WORK_LOG].[CREATE_TIME] = " + SqlServerUtils.getDateSql(this.createTime)) 
						+ ") "));
		}
		if ((this.createTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG].[CREATE_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.createTimeBegin) + ")")));
		}
		if ((this.createTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG].[CREATE_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.createTimeEnd) + ") ")));
		}
		if ((this.createTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG].[CREATE_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.createTimeEndEqual) + ") ")));
		}
		if ((this.modifyTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_WORK_LOG].[MODIFY_TIME] = " + SqlServerUtils.getDateSql(this.modifyTime)) 
						+ ") "));
		}
		if ((this.modifyTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG].[MODIFY_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.modifyTimeBegin) + ")")));
		}
		if ((this.modifyTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG].[MODIFY_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.modifyTimeEnd) + ") ")));
		}
		if ((this.modifyTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG].[MODIFY_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.modifyTimeEndEqual) + ") ")));
		}
		if ((this.workDay == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_WORK_LOG].[WORK_DAY] = " + SqlServerUtils.getDateSql(this.workDay)) 
						+ ") "));
		}
		if ((this.workDayBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG].[WORK_DAY] >= " 
						+ (SqlServerUtils.getDateSql(this.workDayBegin) + ")")));
		}
		if ((this.workDayEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG].[WORK_DAY] < " 
						+ (SqlServerUtils.getDateSql(this.workDayEnd) + ") ")));
		}
		if ((this.workDayEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG].[WORK_DAY] < " 
						+ (SqlServerUtils.getNextDateSql(this.workDayEndEqual) + ") ")));
		}
		if ((this.workUserId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_WORK_LOG].[WORK_USER_ID] = " + this.workUserId) 
						+ ") "));
		}
		if ((this.workUserIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG].[WORK_USER_ID] >= " 
						+ (this.workUserIdBegin + ")")));
		}
		if ((this.workUserIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG].[WORK_USER_ID] < " 
						+ (this.workUserIdEnd + ") ")));
		}
		if ((this.workUserIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG].[WORK_USER_ID] <= " 
						+ (this.workUserIdEndEqual + ") ")));
		}
		if ((this.workEvaluationScore == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_WORK_LOG].[WORK_EVALUATION_SCORE] = " + this.workEvaluationScore) 
						+ ") "));
		}
		if ((this.workEvaluationScoreBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG].[WORK_EVALUATION_SCORE] >= " 
						+ (this.workEvaluationScoreBegin + ")")));
		}
		if ((this.workEvaluationScoreEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG].[WORK_EVALUATION_SCORE] < " 
						+ (this.workEvaluationScoreEnd + ") ")));
		}
		if ((this.workEvaluationScoreEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_LOG].[WORK_EVALUATION_SCORE] <= " 
						+ (this.workEvaluationScoreEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.workEvaluationContent)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_WORK_LOG].[WORK_EVALUATION_CONTENT]", this.workEvaluationContent)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.workEvaluationContentEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_WORK_LOG].[WORK_EVALUATION_CONTENT] = " + SqlServerUtils.safeSql(this.workEvaluationContentEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
