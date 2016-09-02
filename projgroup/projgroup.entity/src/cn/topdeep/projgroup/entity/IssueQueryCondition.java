package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE查询条件定义
 */
public class IssueQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,ISSUE_ID: 问题标识
	 */
	Integer issueId;
	
	/**
	 * 查询条件开始值,ISSUE_ID: 问题标识
	 */
	Integer issueIdBegin;
	
	/**
	 * 查询条件结束值,ISSUE_ID: 问题标识
	 */
	Integer issueIdEnd;
	
	/**
	 * 查询条件结束值,ISSUE_ID: 问题标识
	 */
	Integer issueIdEndEqual;
	
	/**
	 * 查询条件,STATUS_ID: 状态标识
	 */
	Integer statusId;
	
	/**
	 * 查询条件开始值,STATUS_ID: 状态标识
	 */
	Integer statusIdBegin;
	
	/**
	 * 查询条件结束值,STATUS_ID: 状态标识
	 */
	Integer statusIdEnd;
	
	/**
	 * 查询条件结束值,STATUS_ID: 状态标识
	 */
	Integer statusIdEndEqual;
	
	/**
	 * 查询条件,PRIORITIES_ID: 优先级别
	 */
	Byte prioritiesId;
	
	/**
	 * 查询条件开始值,PRIORITIES_ID: 优先级别
	 */
	Byte prioritiesIdBegin;
	
	/**
	 * 查询条件结束值,PRIORITIES_ID: 优先级别
	 */
	Byte prioritiesIdEnd;
	
	/**
	 * 查询条件结束值,PRIORITIES_ID: 优先级别
	 */
	Byte prioritiesIdEndEqual;
	
	/**
	 * 查询条件,REPORT_USER_ID: 报告用户
	 */
	Integer reportUserId;
	
	/**
	 * 查询条件开始值,REPORT_USER_ID: 报告用户
	 */
	Integer reportUserIdBegin;
	
	/**
	 * 查询条件结束值,REPORT_USER_ID: 报告用户
	 */
	Integer reportUserIdEnd;
	
	/**
	 * 查询条件结束值,REPORT_USER_ID: 报告用户
	 */
	Integer reportUserIdEndEqual;
	
	/**
	 * 查询条件,ASSIGN_USER_ID: 关联处理用户
	 */
	Integer assignUserId;
	
	/**
	 * 查询条件开始值,ASSIGN_USER_ID: 关联处理用户
	 */
	Integer assignUserIdBegin;
	
	/**
	 * 查询条件结束值,ASSIGN_USER_ID: 关联处理用户
	 */
	Integer assignUserIdEnd;
	
	/**
	 * 查询条件结束值,ASSIGN_USER_ID: 关联处理用户
	 */
	Integer assignUserIdEndEqual;
	
	/**
	 * 查询条件,ISSUE_PROJECT_ID: 项目标识
	 */
	Integer issueProjectId;
	
	/**
	 * 查询条件开始值,ISSUE_PROJECT_ID: 项目标识
	 */
	Integer issueProjectIdBegin;
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_ID: 项目标识
	 */
	Integer issueProjectIdEnd;
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_ID: 项目标识
	 */
	Integer issueProjectIdEndEqual;
	
	/**
	 * 查询条件,ISSUE_PROJECT_MODULE_ID: 标识
	 */
	Integer issueProjectModuleId;
	
	/**
	 * 查询条件开始值,ISSUE_PROJECT_MODULE_ID: 标识
	 */
	Integer issueProjectModuleIdBegin;
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_MODULE_ID: 标识
	 */
	Integer issueProjectModuleIdEnd;
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_MODULE_ID: 标识
	 */
	Integer issueProjectModuleIdEndEqual;
	
	/**
	 * 查询条件,ISSUE_TYPE: 
	 */
	Byte issueType;
	
	/**
	 * 查询条件开始值,ISSUE_TYPE: 
	 */
	Byte issueTypeBegin;
	
	/**
	 * 查询条件结束值,ISSUE_TYPE: 
	 */
	Byte issueTypeEnd;
	
	/**
	 * 查询条件结束值,ISSUE_TYPE: 
	 */
	Byte issueTypeEndEqual;
	
	/**
	 * 查询条件,ISSUE_SHORT_DESC: 问题简短描述
	 */
	String issueShortDesc;
	
	/**
	 * 查询条件字符串相等,ISSUE_SHORT_DESC: 问题简短描述
	 */
	String issueShortDescEqual;
	
	/**
	 * 查询条件,REPORT_TIME: 报告时间
	 */
	java.util.Date reportTime;
	
	/**
	 * 查询条件开始值,REPORT_TIME: 报告时间
	 */
	java.util.Date reportTimeBegin;
	
	/**
	 * 查询条件结束值,REPORT_TIME: 报告时间
	 */
	java.util.Date reportTimeEnd;
	
	/**
	 * 查询条件结束值,REPORT_TIME: 报告时间
	 */
	java.util.Date reportTimeEndEqual;
	
	/**
	 * 查询条件,UPDATE_TIME: 最后更新时间
	 */
	java.util.Date updateTime;
	
	/**
	 * 查询条件开始值,UPDATE_TIME: 最后更新时间
	 */
	java.util.Date updateTimeBegin;
	
	/**
	 * 查询条件结束值,UPDATE_TIME: 最后更新时间
	 */
	java.util.Date updateTimeEnd;
	
	/**
	 * 查询条件结束值,UPDATE_TIME: 最后更新时间
	 */
	java.util.Date updateTimeEndEqual;
	
	/**
	 * 查询条件,TIME_STAMP: 
	 */
	byte[] timeStamp;
	
	/**
	 * ISSUE_ID: 问题标识
	 */
	public Integer getIssueId() {
		return this.issueId;
	}
	
	/**
	 * ISSUE_ID: 问题标识
	 */
	public void setIssueId(Integer value)
	 {
		this.issueId = value;
	}
	
	/**
	 * 查询条件开始值,ISSUE_ID: 问题标识
	 */
	public Integer getIssueIdBegin() {
		return this.issueIdBegin;
	}
	
	/**
	 * 查询条件开始值,ISSUE_ID: 问题标识
	 */
	public void setIssueIdBegin(Integer value)
	 {
		this.issueIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_ID: 问题标识
	 */
	public Integer getIssueIdEnd() {
		return this.issueIdEnd;
	}
	
	/**
	 * 查询条件结束值,ISSUE_ID: 问题标识
	 */
	public void setIssueIdEnd(Integer value)
	 {
		this.issueIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_ID: 问题标识
	 */
	public Integer getIssueIdEndEqual() {
		return this.issueIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,ISSUE_ID: 问题标识
	 */
	public void setIssueIdEndEqual(Integer value)
	 {
		this.issueIdEndEqual = value;
	}
	
	/**
	 * STATUS_ID: 状态标识
	 */
	public Integer getStatusId() {
		return this.statusId;
	}
	
	/**
	 * STATUS_ID: 状态标识
	 */
	public void setStatusId(Integer value)
	 {
		this.statusId = value;
	}
	
	/**
	 * 查询条件开始值,STATUS_ID: 状态标识
	 */
	public Integer getStatusIdBegin() {
		return this.statusIdBegin;
	}
	
	/**
	 * 查询条件开始值,STATUS_ID: 状态标识
	 */
	public void setStatusIdBegin(Integer value)
	 {
		this.statusIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,STATUS_ID: 状态标识
	 */
	public Integer getStatusIdEnd() {
		return this.statusIdEnd;
	}
	
	/**
	 * 查询条件结束值,STATUS_ID: 状态标识
	 */
	public void setStatusIdEnd(Integer value)
	 {
		this.statusIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,STATUS_ID: 状态标识
	 */
	public Integer getStatusIdEndEqual() {
		return this.statusIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,STATUS_ID: 状态标识
	 */
	public void setStatusIdEndEqual(Integer value)
	 {
		this.statusIdEndEqual = value;
	}
	
	/**
	 * PRIORITIES_ID: 优先级别
	 */
	public Byte getPrioritiesId() {
		return this.prioritiesId;
	}
	
	/**
	 * PRIORITIES_ID: 优先级别
	 */
	public void setPrioritiesId(Byte value)
	 {
		this.prioritiesId = value;
	}
	
	/**
	 * 查询条件开始值,PRIORITIES_ID: 优先级别
	 */
	public Byte getPrioritiesIdBegin() {
		return this.prioritiesIdBegin;
	}
	
	/**
	 * 查询条件开始值,PRIORITIES_ID: 优先级别
	 */
	public void setPrioritiesIdBegin(Byte value)
	 {
		this.prioritiesIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PRIORITIES_ID: 优先级别
	 */
	public Byte getPrioritiesIdEnd() {
		return this.prioritiesIdEnd;
	}
	
	/**
	 * 查询条件结束值,PRIORITIES_ID: 优先级别
	 */
	public void setPrioritiesIdEnd(Byte value)
	 {
		this.prioritiesIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PRIORITIES_ID: 优先级别
	 */
	public Byte getPrioritiesIdEndEqual() {
		return this.prioritiesIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PRIORITIES_ID: 优先级别
	 */
	public void setPrioritiesIdEndEqual(Byte value)
	 {
		this.prioritiesIdEndEqual = value;
	}
	
	/**
	 * REPORT_USER_ID: 报告用户
	 */
	public Integer getReportUserId() {
		return this.reportUserId;
	}
	
	/**
	 * REPORT_USER_ID: 报告用户
	 */
	public void setReportUserId(Integer value)
	 {
		this.reportUserId = value;
	}
	
	/**
	 * 查询条件开始值,REPORT_USER_ID: 报告用户
	 */
	public Integer getReportUserIdBegin() {
		return this.reportUserIdBegin;
	}
	
	/**
	 * 查询条件开始值,REPORT_USER_ID: 报告用户
	 */
	public void setReportUserIdBegin(Integer value)
	 {
		this.reportUserIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,REPORT_USER_ID: 报告用户
	 */
	public Integer getReportUserIdEnd() {
		return this.reportUserIdEnd;
	}
	
	/**
	 * 查询条件结束值,REPORT_USER_ID: 报告用户
	 */
	public void setReportUserIdEnd(Integer value)
	 {
		this.reportUserIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,REPORT_USER_ID: 报告用户
	 */
	public Integer getReportUserIdEndEqual() {
		return this.reportUserIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,REPORT_USER_ID: 报告用户
	 */
	public void setReportUserIdEndEqual(Integer value)
	 {
		this.reportUserIdEndEqual = value;
	}
	
	/**
	 * ASSIGN_USER_ID: 关联处理用户
	 */
	public Integer getAssignUserId() {
		return this.assignUserId;
	}
	
	/**
	 * ASSIGN_USER_ID: 关联处理用户
	 */
	public void setAssignUserId(Integer value)
	 {
		this.assignUserId = value;
	}
	
	/**
	 * 查询条件开始值,ASSIGN_USER_ID: 关联处理用户
	 */
	public Integer getAssignUserIdBegin() {
		return this.assignUserIdBegin;
	}
	
	/**
	 * 查询条件开始值,ASSIGN_USER_ID: 关联处理用户
	 */
	public void setAssignUserIdBegin(Integer value)
	 {
		this.assignUserIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,ASSIGN_USER_ID: 关联处理用户
	 */
	public Integer getAssignUserIdEnd() {
		return this.assignUserIdEnd;
	}
	
	/**
	 * 查询条件结束值,ASSIGN_USER_ID: 关联处理用户
	 */
	public void setAssignUserIdEnd(Integer value)
	 {
		this.assignUserIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,ASSIGN_USER_ID: 关联处理用户
	 */
	public Integer getAssignUserIdEndEqual() {
		return this.assignUserIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,ASSIGN_USER_ID: 关联处理用户
	 */
	public void setAssignUserIdEndEqual(Integer value)
	 {
		this.assignUserIdEndEqual = value;
	}
	
	/**
	 * ISSUE_PROJECT_ID: 项目标识
	 */
	public Integer getIssueProjectId() {
		return this.issueProjectId;
	}
	
	/**
	 * ISSUE_PROJECT_ID: 项目标识
	 */
	public void setIssueProjectId(Integer value)
	 {
		this.issueProjectId = value;
	}
	
	/**
	 * 查询条件开始值,ISSUE_PROJECT_ID: 项目标识
	 */
	public Integer getIssueProjectIdBegin() {
		return this.issueProjectIdBegin;
	}
	
	/**
	 * 查询条件开始值,ISSUE_PROJECT_ID: 项目标识
	 */
	public void setIssueProjectIdBegin(Integer value)
	 {
		this.issueProjectIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_ID: 项目标识
	 */
	public Integer getIssueProjectIdEnd() {
		return this.issueProjectIdEnd;
	}
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_ID: 项目标识
	 */
	public void setIssueProjectIdEnd(Integer value)
	 {
		this.issueProjectIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_ID: 项目标识
	 */
	public Integer getIssueProjectIdEndEqual() {
		return this.issueProjectIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_ID: 项目标识
	 */
	public void setIssueProjectIdEndEqual(Integer value)
	 {
		this.issueProjectIdEndEqual = value;
	}
	
	/**
	 * ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public Integer getIssueProjectModuleId() {
		return this.issueProjectModuleId;
	}
	
	/**
	 * ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public void setIssueProjectModuleId(Integer value)
	 {
		this.issueProjectModuleId = value;
	}
	
	/**
	 * 查询条件开始值,ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public Integer getIssueProjectModuleIdBegin() {
		return this.issueProjectModuleIdBegin;
	}
	
	/**
	 * 查询条件开始值,ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public void setIssueProjectModuleIdBegin(Integer value)
	 {
		this.issueProjectModuleIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public Integer getIssueProjectModuleIdEnd() {
		return this.issueProjectModuleIdEnd;
	}
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public void setIssueProjectModuleIdEnd(Integer value)
	 {
		this.issueProjectModuleIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public Integer getIssueProjectModuleIdEndEqual() {
		return this.issueProjectModuleIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public void setIssueProjectModuleIdEndEqual(Integer value)
	 {
		this.issueProjectModuleIdEndEqual = value;
	}
	
	/**
	 * ISSUE_TYPE: 
	 */
	public Byte getIssueType() {
		return this.issueType;
	}
	
	/**
	 * ISSUE_TYPE: 
	 */
	public void setIssueType(Byte value)
	 {
		this.issueType = value;
	}
	
	/**
	 * 查询条件开始值,ISSUE_TYPE: 
	 */
	public Byte getIssueTypeBegin() {
		return this.issueTypeBegin;
	}
	
	/**
	 * 查询条件开始值,ISSUE_TYPE: 
	 */
	public void setIssueTypeBegin(Byte value)
	 {
		this.issueTypeBegin = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_TYPE: 
	 */
	public Byte getIssueTypeEnd() {
		return this.issueTypeEnd;
	}
	
	/**
	 * 查询条件结束值,ISSUE_TYPE: 
	 */
	public void setIssueTypeEnd(Byte value)
	 {
		this.issueTypeEnd = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_TYPE: 
	 */
	public Byte getIssueTypeEndEqual() {
		return this.issueTypeEndEqual;
	}
	
	/**
	 * 查询条件结束值,ISSUE_TYPE: 
	 */
	public void setIssueTypeEndEqual(Byte value)
	 {
		this.issueTypeEndEqual = value;
	}
	
	/**
	 * ISSUE_SHORT_DESC: 问题简短描述
	 */
	public String getIssueShortDesc() {
		return this.issueShortDesc;
	}
	
	/**
	 * ISSUE_SHORT_DESC: 问题简短描述
	 */
	public void setIssueShortDesc(String value)
	 {
		this.issueShortDesc = value;
	}
	
	/**
	 * 查询条件字符串相等,ISSUE_SHORT_DESC: 问题简短描述
	 */
	public String getIssueShortDescEqual() {
		return this.issueShortDescEqual;
	}
	
	/**
	 * 查询条件字符串相等,ISSUE_SHORT_DESC: 问题简短描述
	 */
	public void setIssueShortDescEqual(String value)
	 {
		this.issueShortDescEqual = value;
	}
	
	/**
	 * REPORT_TIME: 报告时间
	 */
	public java.util.Date getReportTime() {
		return this.reportTime;
	}
	
	/**
	 * REPORT_TIME: 报告时间
	 */
	public void setReportTime(java.util.Date value)
	 {
		this.reportTime = value;
	}
	
	/**
	 * 查询条件开始值,REPORT_TIME: 报告时间
	 */
	public java.util.Date getReportTimeBegin() {
		return this.reportTimeBegin;
	}
	
	/**
	 * 查询条件开始值,REPORT_TIME: 报告时间
	 */
	public void setReportTimeBegin(java.util.Date value)
	 {
		this.reportTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,REPORT_TIME: 报告时间
	 */
	public java.util.Date getReportTimeEnd() {
		return this.reportTimeEnd;
	}
	
	/**
	 * 查询条件结束值,REPORT_TIME: 报告时间
	 */
	public void setReportTimeEnd(java.util.Date value)
	 {
		this.reportTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,REPORT_TIME: 报告时间
	 */
	public java.util.Date getReportTimeEndEqual() {
		return this.reportTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,REPORT_TIME: 报告时间
	 */
	public void setReportTimeEndEqual(java.util.Date value)
	 {
		this.reportTimeEndEqual = value;
	}
	
	/**
	 * UPDATE_TIME: 最后更新时间
	 */
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	
	/**
	 * UPDATE_TIME: 最后更新时间
	 */
	public void setUpdateTime(java.util.Date value)
	 {
		this.updateTime = value;
	}
	
	/**
	 * 查询条件开始值,UPDATE_TIME: 最后更新时间
	 */
	public java.util.Date getUpdateTimeBegin() {
		return this.updateTimeBegin;
	}
	
	/**
	 * 查询条件开始值,UPDATE_TIME: 最后更新时间
	 */
	public void setUpdateTimeBegin(java.util.Date value)
	 {
		this.updateTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,UPDATE_TIME: 最后更新时间
	 */
	public java.util.Date getUpdateTimeEnd() {
		return this.updateTimeEnd;
	}
	
	/**
	 * 查询条件结束值,UPDATE_TIME: 最后更新时间
	 */
	public void setUpdateTimeEnd(java.util.Date value)
	 {
		this.updateTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,UPDATE_TIME: 最后更新时间
	 */
	public java.util.Date getUpdateTimeEndEqual() {
		return this.updateTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,UPDATE_TIME: 最后更新时间
	 */
	public void setUpdateTimeEndEqual(java.util.Date value)
	 {
		this.updateTimeEndEqual = value;
	}
	
	/**
	 * TIME_STAMP: 
	 */
	public byte[] getTimeStamp() {
		return this.timeStamp;
	}
	
	/**
	 * TIME_STAMP: 
	 */
	public void setTimeStamp(byte[] value)
	 {
		this.timeStamp = value;
	}
	
	/**
	 * 设置查询条件ISSUE_ID: 问题标识
	 */
	public IssueQueryCondition setIssueIdCondition(Integer value) {
		this.issueId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_ID: 问题标识
	 */
	public IssueQueryCondition setIssueIdConditionBegin(Integer value) {
		this.issueIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_ID: 问题标识
	 */
	public IssueQueryCondition setIssueIdConditionEnd(Integer value) {
		this.issueIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_ID: 问题标识
	 */
	public IssueQueryCondition setIssueIdConditionEndEqual(Integer value) {
		this.issueIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATUS_ID: 状态标识
	 */
	public IssueQueryCondition setStatusIdCondition(Integer value) {
		this.statusId = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATUS_ID: 状态标识
	 */
	public IssueQueryCondition setStatusIdConditionBegin(Integer value) {
		this.statusIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATUS_ID: 状态标识
	 */
	public IssueQueryCondition setStatusIdConditionEnd(Integer value) {
		this.statusIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATUS_ID: 状态标识
	 */
	public IssueQueryCondition setStatusIdConditionEndEqual(Integer value) {
		this.statusIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITIES_ID: 优先级别
	 */
	public IssueQueryCondition setPrioritiesIdCondition(Byte value) {
		this.prioritiesId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITIES_ID: 优先级别
	 */
	public IssueQueryCondition setPrioritiesIdConditionBegin(Byte value) {
		this.prioritiesIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITIES_ID: 优先级别
	 */
	public IssueQueryCondition setPrioritiesIdConditionEnd(Byte value) {
		this.prioritiesIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITIES_ID: 优先级别
	 */
	public IssueQueryCondition setPrioritiesIdConditionEndEqual(Byte value) {
		this.prioritiesIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件REPORT_USER_ID: 报告用户
	 */
	public IssueQueryCondition setReportUserIdCondition(Integer value) {
		this.reportUserId = value;
		return this;
	}
	
	/**
	 * 设置查询条件REPORT_USER_ID: 报告用户
	 */
	public IssueQueryCondition setReportUserIdConditionBegin(Integer value) {
		this.reportUserIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件REPORT_USER_ID: 报告用户
	 */
	public IssueQueryCondition setReportUserIdConditionEnd(Integer value) {
		this.reportUserIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件REPORT_USER_ID: 报告用户
	 */
	public IssueQueryCondition setReportUserIdConditionEndEqual(Integer value) {
		this.reportUserIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ASSIGN_USER_ID: 关联处理用户
	 */
	public IssueQueryCondition setAssignUserIdCondition(Integer value) {
		this.assignUserId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ASSIGN_USER_ID: 关联处理用户
	 */
	public IssueQueryCondition setAssignUserIdConditionBegin(Integer value) {
		this.assignUserIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ASSIGN_USER_ID: 关联处理用户
	 */
	public IssueQueryCondition setAssignUserIdConditionEnd(Integer value) {
		this.assignUserIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ASSIGN_USER_ID: 关联处理用户
	 */
	public IssueQueryCondition setAssignUserIdConditionEndEqual(Integer value) {
		this.assignUserIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 项目标识
	 */
	public IssueQueryCondition setIssueProjectIdCondition(Integer value) {
		this.issueProjectId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 项目标识
	 */
	public IssueQueryCondition setIssueProjectIdConditionBegin(Integer value) {
		this.issueProjectIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 项目标识
	 */
	public IssueQueryCondition setIssueProjectIdConditionEnd(Integer value) {
		this.issueProjectIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_ID: 项目标识
	 */
	public IssueQueryCondition setIssueProjectIdConditionEndEqual(Integer value) {
		this.issueProjectIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public IssueQueryCondition setIssueProjectModuleIdCondition(Integer value) {
		this.issueProjectModuleId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public IssueQueryCondition setIssueProjectModuleIdConditionBegin(Integer value) {
		this.issueProjectModuleIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public IssueQueryCondition setIssueProjectModuleIdConditionEnd(Integer value) {
		this.issueProjectModuleIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_PROJECT_MODULE_ID: 标识
	 */
	public IssueQueryCondition setIssueProjectModuleIdConditionEndEqual(Integer value) {
		this.issueProjectModuleIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_TYPE: 
	 */
	public IssueQueryCondition setIssueTypeCondition(Byte value) {
		this.issueType = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_TYPE: 
	 */
	public IssueQueryCondition setIssueTypeConditionBegin(Byte value) {
		this.issueTypeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_TYPE: 
	 */
	public IssueQueryCondition setIssueTypeConditionEnd(Byte value) {
		this.issueTypeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_TYPE: 
	 */
	public IssueQueryCondition setIssueTypeConditionEndEqual(Byte value) {
		this.issueTypeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_SHORT_DESC: 问题简短描述
	 */
	public IssueQueryCondition setIssueShortDescCondition(String value) {
		this.issueShortDesc = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_SHORT_DESC: 问题简短描述
	 */
	public IssueQueryCondition setIssueShortDescConditionEqual(String value) {
		this.issueShortDescEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件REPORT_TIME: 报告时间
	 */
	public IssueQueryCondition setReportTimeCondition(java.util.Date value) {
		this.reportTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件REPORT_TIME: 报告时间
	 */
	public IssueQueryCondition setReportTimeConditionBegin(java.util.Date value) {
		this.reportTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件REPORT_TIME: 报告时间
	 */
	public IssueQueryCondition setReportTimeConditionEnd(java.util.Date value) {
		this.reportTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件REPORT_TIME: 报告时间
	 */
	public IssueQueryCondition setReportTimeConditionEndEqual(java.util.Date value) {
		this.reportTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件UPDATE_TIME: 最后更新时间
	 */
	public IssueQueryCondition setUpdateTimeCondition(java.util.Date value) {
		this.updateTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件UPDATE_TIME: 最后更新时间
	 */
	public IssueQueryCondition setUpdateTimeConditionBegin(java.util.Date value) {
		this.updateTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件UPDATE_TIME: 最后更新时间
	 */
	public IssueQueryCondition setUpdateTimeConditionEnd(java.util.Date value) {
		this.updateTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件UPDATE_TIME: 最后更新时间
	 */
	public IssueQueryCondition setUpdateTimeConditionEndEqual(java.util.Date value) {
		this.updateTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TIME_STAMP: 
	 */
	public IssueQueryCondition setTimeStampCondition(byte[] value) {
		this.timeStamp = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.issueId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE].[ISSUE_ID] = " + this.issueId) 
						+ ") "));
		}
		if ((this.issueIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[ISSUE_ID] >= " 
						+ (this.issueIdBegin + ")")));
		}
		if ((this.issueIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[ISSUE_ID] < " 
						+ (this.issueIdEnd + ") ")));
		}
		if ((this.issueIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[ISSUE_ID] <= " 
						+ (this.issueIdEndEqual + ") ")));
		}
		if ((this.statusId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE].[STATUS_ID] = " + this.statusId) 
						+ ") "));
		}
		if ((this.statusIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[STATUS_ID] >= " 
						+ (this.statusIdBegin + ")")));
		}
		if ((this.statusIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[STATUS_ID] < " 
						+ (this.statusIdEnd + ") ")));
		}
		if ((this.statusIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[STATUS_ID] <= " 
						+ (this.statusIdEndEqual + ") ")));
		}
		if ((this.prioritiesId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE].[PRIORITIES_ID] = " + this.prioritiesId) 
						+ ") "));
		}
		if ((this.prioritiesIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[PRIORITIES_ID] >= " 
						+ (this.prioritiesIdBegin + ")")));
		}
		if ((this.prioritiesIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[PRIORITIES_ID] < " 
						+ (this.prioritiesIdEnd + ") ")));
		}
		if ((this.prioritiesIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[PRIORITIES_ID] <= " 
						+ (this.prioritiesIdEndEqual + ") ")));
		}
		if ((this.reportUserId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE].[REPORT_USER_ID] = " + this.reportUserId) 
						+ ") "));
		}
		if ((this.reportUserIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[REPORT_USER_ID] >= " 
						+ (this.reportUserIdBegin + ")")));
		}
		if ((this.reportUserIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[REPORT_USER_ID] < " 
						+ (this.reportUserIdEnd + ") ")));
		}
		if ((this.reportUserIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[REPORT_USER_ID] <= " 
						+ (this.reportUserIdEndEqual + ") ")));
		}
		if ((this.assignUserId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE].[ASSIGN_USER_ID] = " + this.assignUserId) 
						+ ") "));
		}
		if ((this.assignUserIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[ASSIGN_USER_ID] >= " 
						+ (this.assignUserIdBegin + ")")));
		}
		if ((this.assignUserIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[ASSIGN_USER_ID] < " 
						+ (this.assignUserIdEnd + ") ")));
		}
		if ((this.assignUserIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[ASSIGN_USER_ID] <= " 
						+ (this.assignUserIdEndEqual + ") ")));
		}
		if ((this.issueProjectId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE].[ISSUE_PROJECT_ID] = " + this.issueProjectId) 
						+ ") "));
		}
		if ((this.issueProjectIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[ISSUE_PROJECT_ID] >= " 
						+ (this.issueProjectIdBegin + ")")));
		}
		if ((this.issueProjectIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[ISSUE_PROJECT_ID] < " 
						+ (this.issueProjectIdEnd + ") ")));
		}
		if ((this.issueProjectIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[ISSUE_PROJECT_ID] <= " 
						+ (this.issueProjectIdEndEqual + ") ")));
		}
		if ((this.issueProjectModuleId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE].[ISSUE_PROJECT_MODULE_ID] = " + this.issueProjectModuleId) 
						+ ") "));
		}
		if ((this.issueProjectModuleIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[ISSUE_PROJECT_MODULE_ID] >= " 
						+ (this.issueProjectModuleIdBegin + ")")));
		}
		if ((this.issueProjectModuleIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[ISSUE_PROJECT_MODULE_ID] < " 
						+ (this.issueProjectModuleIdEnd + ") ")));
		}
		if ((this.issueProjectModuleIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[ISSUE_PROJECT_MODULE_ID] <= " 
						+ (this.issueProjectModuleIdEndEqual + ") ")));
		}
		if ((this.issueType == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE].[ISSUE_TYPE] = " + this.issueType) 
						+ ") "));
		}
		if ((this.issueTypeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[ISSUE_TYPE] >= " 
						+ (this.issueTypeBegin + ")")));
		}
		if ((this.issueTypeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[ISSUE_TYPE] < " 
						+ (this.issueTypeEnd + ") ")));
		}
		if ((this.issueTypeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[ISSUE_TYPE] <= " 
						+ (this.issueTypeEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.issueShortDesc)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ISSUE].[ISSUE_SHORT_DESC]", this.issueShortDesc)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.issueShortDescEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ISSUE].[ISSUE_SHORT_DESC] = " + SqlServerUtils.safeSql(this.issueShortDescEqual))) 
						+ ") "));
		}
		if ((this.reportTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE].[REPORT_TIME] = " + SqlServerUtils.getDateSql(this.reportTime)) 
						+ ") "));
		}
		if ((this.reportTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[REPORT_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.reportTimeBegin) + ")")));
		}
		if ((this.reportTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[REPORT_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.reportTimeEnd) + ") ")));
		}
		if ((this.reportTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[REPORT_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.reportTimeEndEqual) + ") ")));
		}
		if ((this.updateTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE].[UPDATE_TIME] = " + SqlServerUtils.getDateSql(this.updateTime)) 
						+ ") "));
		}
		if ((this.updateTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[UPDATE_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.updateTimeBegin) + ")")));
		}
		if ((this.updateTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[UPDATE_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.updateTimeEnd) + ") ")));
		}
		if ((this.updateTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE].[UPDATE_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.updateTimeEndEqual) + ") ")));
		}
		if ((this.timeStamp == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE].[TIME_STAMP] = " + SqlServerUtils.getByteArySql(this.timeStamp)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
