package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_PROJECT查询条件定义
 */
public class ProjectQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,PROJ_ID: 工程号
	 */
	Integer projId;
	
	/**
	 * 查询条件开始值,PROJ_ID: 工程号
	 */
	Integer projIdBegin;
	
	/**
	 * 查询条件结束值,PROJ_ID: 工程号
	 */
	Integer projIdEnd;
	
	/**
	 * 查询条件结束值,PROJ_ID: 工程号
	 */
	Integer projIdEndEqual;
	
	/**
	 * 查询条件,PROJECT_ACTUAL_END_DATE: 工程实际结束时间
	 */
	java.util.Date projectActualEndDate;
	
	/**
	 * 查询条件开始值,PROJECT_ACTUAL_END_DATE: 工程实际结束时间
	 */
	java.util.Date projectActualEndDateBegin;
	
	/**
	 * 查询条件结束值,PROJECT_ACTUAL_END_DATE: 工程实际结束时间
	 */
	java.util.Date projectActualEndDateEnd;
	
	/**
	 * 查询条件结束值,PROJECT_ACTUAL_END_DATE: 工程实际结束时间
	 */
	java.util.Date projectActualEndDateEndEqual;
	
	/**
	 * 查询条件,PROJECT_ACTUAL_START_DATE: 工程实际开始时间
	 */
	java.util.Date projectActualStartDate;
	
	/**
	 * 查询条件开始值,PROJECT_ACTUAL_START_DATE: 工程实际开始时间
	 */
	java.util.Date projectActualStartDateBegin;
	
	/**
	 * 查询条件结束值,PROJECT_ACTUAL_START_DATE: 工程实际开始时间
	 */
	java.util.Date projectActualStartDateEnd;
	
	/**
	 * 查询条件结束值,PROJECT_ACTUAL_START_DATE: 工程实际开始时间
	 */
	java.util.Date projectActualStartDateEndEqual;
	
	/**
	 * 查询条件,PROJECT_DESC: 工程描述
	 */
	String projectDesc;
	
	/**
	 * 查询条件字符串相等,PROJECT_DESC: 工程描述
	 */
	String projectDescEqual;
	
	/**
	 * 查询条件,PROJECT_NAME: 工程名称
	 */
	String projectName;
	
	/**
	 * 查询条件字符串相等,PROJECT_NAME: 工程名称
	 */
	String projectNameEqual;
	
	/**
	 * 查询条件,PROJECT_PLAN_END_DATE: 工程计划结束时间
	 */
	java.util.Date projectPlanEndDate;
	
	/**
	 * 查询条件开始值,PROJECT_PLAN_END_DATE: 工程计划结束时间
	 */
	java.util.Date projectPlanEndDateBegin;
	
	/**
	 * 查询条件结束值,PROJECT_PLAN_END_DATE: 工程计划结束时间
	 */
	java.util.Date projectPlanEndDateEnd;
	
	/**
	 * 查询条件结束值,PROJECT_PLAN_END_DATE: 工程计划结束时间
	 */
	java.util.Date projectPlanEndDateEndEqual;
	
	/**
	 * 查询条件,PROJECT_PLAN_START_DATE: 工程计划开始时间
	 */
	java.util.Date projectPlanStartDate;
	
	/**
	 * 查询条件开始值,PROJECT_PLAN_START_DATE: 工程计划开始时间
	 */
	java.util.Date projectPlanStartDateBegin;
	
	/**
	 * 查询条件结束值,PROJECT_PLAN_START_DATE: 工程计划开始时间
	 */
	java.util.Date projectPlanStartDateEnd;
	
	/**
	 * 查询条件结束值,PROJECT_PLAN_START_DATE: 工程计划开始时间
	 */
	java.util.Date projectPlanStartDateEndEqual;
	
	/**
	 * 查询条件,PROJECT_SHORT_NAME: 工程简称
	 */
	String projectShortName;
	
	/**
	 * 查询条件字符串相等,PROJECT_SHORT_NAME: 工程简称
	 */
	String projectShortNameEqual;
	
	/**
	 * 查询条件,PROJECT_STATE: 工程状态
	 */
	Integer projectState;
	
	/**
	 * 查询条件开始值,PROJECT_STATE: 工程状态
	 */
	Integer projectStateBegin;
	
	/**
	 * 查询条件结束值,PROJECT_STATE: 工程状态
	 */
	Integer projectStateEnd;
	
	/**
	 * 查询条件结束值,PROJECT_STATE: 工程状态
	 */
	Integer projectStateEndEqual;
	
	/**
	 * 查询条件,PROJECT_MANAGER_ID: 工程管理员号
	 */
	Integer projectManagerId;
	
	/**
	 * 查询条件开始值,PROJECT_MANAGER_ID: 工程管理员号
	 */
	Integer projectManagerIdBegin;
	
	/**
	 * 查询条件结束值,PROJECT_MANAGER_ID: 工程管理员号
	 */
	Integer projectManagerIdEnd;
	
	/**
	 * 查询条件结束值,PROJECT_MANAGER_ID: 工程管理员号
	 */
	Integer projectManagerIdEndEqual;
	
	/**
	 * PROJ_ID: 工程号
	 */
	public Integer getProjId() {
		return this.projId;
	}
	
	/**
	 * PROJ_ID: 工程号
	 */
	public void setProjId(Integer value)
	 {
		this.projId = value;
	}
	
	/**
	 * 查询条件开始值,PROJ_ID: 工程号
	 */
	public Integer getProjIdBegin() {
		return this.projIdBegin;
	}
	
	/**
	 * 查询条件开始值,PROJ_ID: 工程号
	 */
	public void setProjIdBegin(Integer value)
	 {
		this.projIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PROJ_ID: 工程号
	 */
	public Integer getProjIdEnd() {
		return this.projIdEnd;
	}
	
	/**
	 * 查询条件结束值,PROJ_ID: 工程号
	 */
	public void setProjIdEnd(Integer value)
	 {
		this.projIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PROJ_ID: 工程号
	 */
	public Integer getProjIdEndEqual() {
		return this.projIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PROJ_ID: 工程号
	 */
	public void setProjIdEndEqual(Integer value)
	 {
		this.projIdEndEqual = value;
	}
	
	/**
	 * PROJECT_ACTUAL_END_DATE: 工程实际结束时间
	 */
	public java.util.Date getProjectActualEndDate() {
		return this.projectActualEndDate;
	}
	
	/**
	 * PROJECT_ACTUAL_END_DATE: 工程实际结束时间
	 */
	public void setProjectActualEndDate(java.util.Date value)
	 {
		this.projectActualEndDate = value;
	}
	
	/**
	 * 查询条件开始值,PROJECT_ACTUAL_END_DATE: 工程实际结束时间
	 */
	public java.util.Date getProjectActualEndDateBegin() {
		return this.projectActualEndDateBegin;
	}
	
	/**
	 * 查询条件开始值,PROJECT_ACTUAL_END_DATE: 工程实际结束时间
	 */
	public void setProjectActualEndDateBegin(java.util.Date value)
	 {
		this.projectActualEndDateBegin = value;
	}
	
	/**
	 * 查询条件结束值,PROJECT_ACTUAL_END_DATE: 工程实际结束时间
	 */
	public java.util.Date getProjectActualEndDateEnd() {
		return this.projectActualEndDateEnd;
	}
	
	/**
	 * 查询条件结束值,PROJECT_ACTUAL_END_DATE: 工程实际结束时间
	 */
	public void setProjectActualEndDateEnd(java.util.Date value)
	 {
		this.projectActualEndDateEnd = value;
	}
	
	/**
	 * 查询条件结束值,PROJECT_ACTUAL_END_DATE: 工程实际结束时间
	 */
	public java.util.Date getProjectActualEndDateEndEqual() {
		return this.projectActualEndDateEndEqual;
	}
	
	/**
	 * 查询条件结束值,PROJECT_ACTUAL_END_DATE: 工程实际结束时间
	 */
	public void setProjectActualEndDateEndEqual(java.util.Date value)
	 {
		this.projectActualEndDateEndEqual = value;
	}
	
	/**
	 * PROJECT_ACTUAL_START_DATE: 工程实际开始时间
	 */
	public java.util.Date getProjectActualStartDate() {
		return this.projectActualStartDate;
	}
	
	/**
	 * PROJECT_ACTUAL_START_DATE: 工程实际开始时间
	 */
	public void setProjectActualStartDate(java.util.Date value)
	 {
		this.projectActualStartDate = value;
	}
	
	/**
	 * 查询条件开始值,PROJECT_ACTUAL_START_DATE: 工程实际开始时间
	 */
	public java.util.Date getProjectActualStartDateBegin() {
		return this.projectActualStartDateBegin;
	}
	
	/**
	 * 查询条件开始值,PROJECT_ACTUAL_START_DATE: 工程实际开始时间
	 */
	public void setProjectActualStartDateBegin(java.util.Date value)
	 {
		this.projectActualStartDateBegin = value;
	}
	
	/**
	 * 查询条件结束值,PROJECT_ACTUAL_START_DATE: 工程实际开始时间
	 */
	public java.util.Date getProjectActualStartDateEnd() {
		return this.projectActualStartDateEnd;
	}
	
	/**
	 * 查询条件结束值,PROJECT_ACTUAL_START_DATE: 工程实际开始时间
	 */
	public void setProjectActualStartDateEnd(java.util.Date value)
	 {
		this.projectActualStartDateEnd = value;
	}
	
	/**
	 * 查询条件结束值,PROJECT_ACTUAL_START_DATE: 工程实际开始时间
	 */
	public java.util.Date getProjectActualStartDateEndEqual() {
		return this.projectActualStartDateEndEqual;
	}
	
	/**
	 * 查询条件结束值,PROJECT_ACTUAL_START_DATE: 工程实际开始时间
	 */
	public void setProjectActualStartDateEndEqual(java.util.Date value)
	 {
		this.projectActualStartDateEndEqual = value;
	}
	
	/**
	 * PROJECT_DESC: 工程描述
	 */
	public String getProjectDesc() {
		return this.projectDesc;
	}
	
	/**
	 * PROJECT_DESC: 工程描述
	 */
	public void setProjectDesc(String value)
	 {
		this.projectDesc = value;
	}
	
	/**
	 * 查询条件字符串相等,PROJECT_DESC: 工程描述
	 */
	public String getProjectDescEqual() {
		return this.projectDescEqual;
	}
	
	/**
	 * 查询条件字符串相等,PROJECT_DESC: 工程描述
	 */
	public void setProjectDescEqual(String value)
	 {
		this.projectDescEqual = value;
	}
	
	/**
	 * PROJECT_NAME: 工程名称
	 */
	public String getProjectName() {
		return this.projectName;
	}
	
	/**
	 * PROJECT_NAME: 工程名称
	 */
	public void setProjectName(String value)
	 {
		this.projectName = value;
	}
	
	/**
	 * 查询条件字符串相等,PROJECT_NAME: 工程名称
	 */
	public String getProjectNameEqual() {
		return this.projectNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,PROJECT_NAME: 工程名称
	 */
	public void setProjectNameEqual(String value)
	 {
		this.projectNameEqual = value;
	}
	
	/**
	 * PROJECT_PLAN_END_DATE: 工程计划结束时间
	 */
	public java.util.Date getProjectPlanEndDate() {
		return this.projectPlanEndDate;
	}
	
	/**
	 * PROJECT_PLAN_END_DATE: 工程计划结束时间
	 */
	public void setProjectPlanEndDate(java.util.Date value)
	 {
		this.projectPlanEndDate = value;
	}
	
	/**
	 * 查询条件开始值,PROJECT_PLAN_END_DATE: 工程计划结束时间
	 */
	public java.util.Date getProjectPlanEndDateBegin() {
		return this.projectPlanEndDateBegin;
	}
	
	/**
	 * 查询条件开始值,PROJECT_PLAN_END_DATE: 工程计划结束时间
	 */
	public void setProjectPlanEndDateBegin(java.util.Date value)
	 {
		this.projectPlanEndDateBegin = value;
	}
	
	/**
	 * 查询条件结束值,PROJECT_PLAN_END_DATE: 工程计划结束时间
	 */
	public java.util.Date getProjectPlanEndDateEnd() {
		return this.projectPlanEndDateEnd;
	}
	
	/**
	 * 查询条件结束值,PROJECT_PLAN_END_DATE: 工程计划结束时间
	 */
	public void setProjectPlanEndDateEnd(java.util.Date value)
	 {
		this.projectPlanEndDateEnd = value;
	}
	
	/**
	 * 查询条件结束值,PROJECT_PLAN_END_DATE: 工程计划结束时间
	 */
	public java.util.Date getProjectPlanEndDateEndEqual() {
		return this.projectPlanEndDateEndEqual;
	}
	
	/**
	 * 查询条件结束值,PROJECT_PLAN_END_DATE: 工程计划结束时间
	 */
	public void setProjectPlanEndDateEndEqual(java.util.Date value)
	 {
		this.projectPlanEndDateEndEqual = value;
	}
	
	/**
	 * PROJECT_PLAN_START_DATE: 工程计划开始时间
	 */
	public java.util.Date getProjectPlanStartDate() {
		return this.projectPlanStartDate;
	}
	
	/**
	 * PROJECT_PLAN_START_DATE: 工程计划开始时间
	 */
	public void setProjectPlanStartDate(java.util.Date value)
	 {
		this.projectPlanStartDate = value;
	}
	
	/**
	 * 查询条件开始值,PROJECT_PLAN_START_DATE: 工程计划开始时间
	 */
	public java.util.Date getProjectPlanStartDateBegin() {
		return this.projectPlanStartDateBegin;
	}
	
	/**
	 * 查询条件开始值,PROJECT_PLAN_START_DATE: 工程计划开始时间
	 */
	public void setProjectPlanStartDateBegin(java.util.Date value)
	 {
		this.projectPlanStartDateBegin = value;
	}
	
	/**
	 * 查询条件结束值,PROJECT_PLAN_START_DATE: 工程计划开始时间
	 */
	public java.util.Date getProjectPlanStartDateEnd() {
		return this.projectPlanStartDateEnd;
	}
	
	/**
	 * 查询条件结束值,PROJECT_PLAN_START_DATE: 工程计划开始时间
	 */
	public void setProjectPlanStartDateEnd(java.util.Date value)
	 {
		this.projectPlanStartDateEnd = value;
	}
	
	/**
	 * 查询条件结束值,PROJECT_PLAN_START_DATE: 工程计划开始时间
	 */
	public java.util.Date getProjectPlanStartDateEndEqual() {
		return this.projectPlanStartDateEndEqual;
	}
	
	/**
	 * 查询条件结束值,PROJECT_PLAN_START_DATE: 工程计划开始时间
	 */
	public void setProjectPlanStartDateEndEqual(java.util.Date value)
	 {
		this.projectPlanStartDateEndEqual = value;
	}
	
	/**
	 * PROJECT_SHORT_NAME: 工程简称
	 */
	public String getProjectShortName() {
		return this.projectShortName;
	}
	
	/**
	 * PROJECT_SHORT_NAME: 工程简称
	 */
	public void setProjectShortName(String value)
	 {
		this.projectShortName = value;
	}
	
	/**
	 * 查询条件字符串相等,PROJECT_SHORT_NAME: 工程简称
	 */
	public String getProjectShortNameEqual() {
		return this.projectShortNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,PROJECT_SHORT_NAME: 工程简称
	 */
	public void setProjectShortNameEqual(String value)
	 {
		this.projectShortNameEqual = value;
	}
	
	/**
	 * PROJECT_STATE: 工程状态
	 */
	public Integer getProjectState() {
		return this.projectState;
	}
	
	/**
	 * PROJECT_STATE: 工程状态
	 */
	public void setProjectState(Integer value)
	 {
		this.projectState = value;
	}
	
	/**
	 * 查询条件开始值,PROJECT_STATE: 工程状态
	 */
	public Integer getProjectStateBegin() {
		return this.projectStateBegin;
	}
	
	/**
	 * 查询条件开始值,PROJECT_STATE: 工程状态
	 */
	public void setProjectStateBegin(Integer value)
	 {
		this.projectStateBegin = value;
	}
	
	/**
	 * 查询条件结束值,PROJECT_STATE: 工程状态
	 */
	public Integer getProjectStateEnd() {
		return this.projectStateEnd;
	}
	
	/**
	 * 查询条件结束值,PROJECT_STATE: 工程状态
	 */
	public void setProjectStateEnd(Integer value)
	 {
		this.projectStateEnd = value;
	}
	
	/**
	 * 查询条件结束值,PROJECT_STATE: 工程状态
	 */
	public Integer getProjectStateEndEqual() {
		return this.projectStateEndEqual;
	}
	
	/**
	 * 查询条件结束值,PROJECT_STATE: 工程状态
	 */
	public void setProjectStateEndEqual(Integer value)
	 {
		this.projectStateEndEqual = value;
	}
	
	/**
	 * PROJECT_MANAGER_ID: 工程管理员号
	 */
	public Integer getProjectManagerId() {
		return this.projectManagerId;
	}
	
	/**
	 * PROJECT_MANAGER_ID: 工程管理员号
	 */
	public void setProjectManagerId(Integer value)
	 {
		this.projectManagerId = value;
	}
	
	/**
	 * 查询条件开始值,PROJECT_MANAGER_ID: 工程管理员号
	 */
	public Integer getProjectManagerIdBegin() {
		return this.projectManagerIdBegin;
	}
	
	/**
	 * 查询条件开始值,PROJECT_MANAGER_ID: 工程管理员号
	 */
	public void setProjectManagerIdBegin(Integer value)
	 {
		this.projectManagerIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PROJECT_MANAGER_ID: 工程管理员号
	 */
	public Integer getProjectManagerIdEnd() {
		return this.projectManagerIdEnd;
	}
	
	/**
	 * 查询条件结束值,PROJECT_MANAGER_ID: 工程管理员号
	 */
	public void setProjectManagerIdEnd(Integer value)
	 {
		this.projectManagerIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PROJECT_MANAGER_ID: 工程管理员号
	 */
	public Integer getProjectManagerIdEndEqual() {
		return this.projectManagerIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PROJECT_MANAGER_ID: 工程管理员号
	 */
	public void setProjectManagerIdEndEqual(Integer value)
	 {
		this.projectManagerIdEndEqual = value;
	}
	
	/**
	 * 设置查询条件PROJ_ID: 工程号
	 */
	public ProjectQueryCondition setProjIdCondition(Integer value) {
		this.projId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJ_ID: 工程号
	 */
	public ProjectQueryCondition setProjIdConditionBegin(Integer value) {
		this.projIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJ_ID: 工程号
	 */
	public ProjectQueryCondition setProjIdConditionEnd(Integer value) {
		this.projIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJ_ID: 工程号
	 */
	public ProjectQueryCondition setProjIdConditionEndEqual(Integer value) {
		this.projIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_ACTUAL_END_DATE: 工程实际结束时间
	 */
	public ProjectQueryCondition setProjectActualEndDateCondition(java.util.Date value) {
		this.projectActualEndDate = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_ACTUAL_END_DATE: 工程实际结束时间
	 */
	public ProjectQueryCondition setProjectActualEndDateConditionBegin(java.util.Date value) {
		this.projectActualEndDateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_ACTUAL_END_DATE: 工程实际结束时间
	 */
	public ProjectQueryCondition setProjectActualEndDateConditionEnd(java.util.Date value) {
		this.projectActualEndDateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_ACTUAL_END_DATE: 工程实际结束时间
	 */
	public ProjectQueryCondition setProjectActualEndDateConditionEndEqual(java.util.Date value) {
		this.projectActualEndDateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_ACTUAL_START_DATE: 工程实际开始时间
	 */
	public ProjectQueryCondition setProjectActualStartDateCondition(java.util.Date value) {
		this.projectActualStartDate = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_ACTUAL_START_DATE: 工程实际开始时间
	 */
	public ProjectQueryCondition setProjectActualStartDateConditionBegin(java.util.Date value) {
		this.projectActualStartDateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_ACTUAL_START_DATE: 工程实际开始时间
	 */
	public ProjectQueryCondition setProjectActualStartDateConditionEnd(java.util.Date value) {
		this.projectActualStartDateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_ACTUAL_START_DATE: 工程实际开始时间
	 */
	public ProjectQueryCondition setProjectActualStartDateConditionEndEqual(java.util.Date value) {
		this.projectActualStartDateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_DESC: 工程描述
	 */
	public ProjectQueryCondition setProjectDescCondition(String value) {
		this.projectDesc = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_DESC: 工程描述
	 */
	public ProjectQueryCondition setProjectDescConditionEqual(String value) {
		this.projectDescEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_NAME: 工程名称
	 */
	public ProjectQueryCondition setProjectNameCondition(String value) {
		this.projectName = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_NAME: 工程名称
	 */
	public ProjectQueryCondition setProjectNameConditionEqual(String value) {
		this.projectNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_PLAN_END_DATE: 工程计划结束时间
	 */
	public ProjectQueryCondition setProjectPlanEndDateCondition(java.util.Date value) {
		this.projectPlanEndDate = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_PLAN_END_DATE: 工程计划结束时间
	 */
	public ProjectQueryCondition setProjectPlanEndDateConditionBegin(java.util.Date value) {
		this.projectPlanEndDateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_PLAN_END_DATE: 工程计划结束时间
	 */
	public ProjectQueryCondition setProjectPlanEndDateConditionEnd(java.util.Date value) {
		this.projectPlanEndDateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_PLAN_END_DATE: 工程计划结束时间
	 */
	public ProjectQueryCondition setProjectPlanEndDateConditionEndEqual(java.util.Date value) {
		this.projectPlanEndDateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_PLAN_START_DATE: 工程计划开始时间
	 */
	public ProjectQueryCondition setProjectPlanStartDateCondition(java.util.Date value) {
		this.projectPlanStartDate = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_PLAN_START_DATE: 工程计划开始时间
	 */
	public ProjectQueryCondition setProjectPlanStartDateConditionBegin(java.util.Date value) {
		this.projectPlanStartDateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_PLAN_START_DATE: 工程计划开始时间
	 */
	public ProjectQueryCondition setProjectPlanStartDateConditionEnd(java.util.Date value) {
		this.projectPlanStartDateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_PLAN_START_DATE: 工程计划开始时间
	 */
	public ProjectQueryCondition setProjectPlanStartDateConditionEndEqual(java.util.Date value) {
		this.projectPlanStartDateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_SHORT_NAME: 工程简称
	 */
	public ProjectQueryCondition setProjectShortNameCondition(String value) {
		this.projectShortName = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_SHORT_NAME: 工程简称
	 */
	public ProjectQueryCondition setProjectShortNameConditionEqual(String value) {
		this.projectShortNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_STATE: 工程状态
	 */
	public ProjectQueryCondition setProjectStateCondition(Integer value) {
		this.projectState = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_STATE: 工程状态
	 */
	public ProjectQueryCondition setProjectStateConditionBegin(Integer value) {
		this.projectStateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_STATE: 工程状态
	 */
	public ProjectQueryCondition setProjectStateConditionEnd(Integer value) {
		this.projectStateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_STATE: 工程状态
	 */
	public ProjectQueryCondition setProjectStateConditionEndEqual(Integer value) {
		this.projectStateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_MANAGER_ID: 工程管理员号
	 */
	public ProjectQueryCondition setProjectManagerIdCondition(Integer value) {
		this.projectManagerId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_MANAGER_ID: 工程管理员号
	 */
	public ProjectQueryCondition setProjectManagerIdConditionBegin(Integer value) {
		this.projectManagerIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_MANAGER_ID: 工程管理员号
	 */
	public ProjectQueryCondition setProjectManagerIdConditionEnd(Integer value) {
		this.projectManagerIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJECT_MANAGER_ID: 工程管理员号
	 */
	public ProjectQueryCondition setProjectManagerIdConditionEndEqual(Integer value) {
		this.projectManagerIdEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.projId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PROJECT].[PROJ_ID] = " + this.projId) 
						+ ") "));
		}
		if ((this.projIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJ_ID] >= " 
						+ (this.projIdBegin + ")")));
		}
		if ((this.projIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJ_ID] < " 
						+ (this.projIdEnd + ") ")));
		}
		if ((this.projIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJ_ID] <= " 
						+ (this.projIdEndEqual + ") ")));
		}
		if ((this.projectActualEndDate == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PROJECT].[PROJECT_ACTUAL_END_DATE] = " + SqlServerUtils.getDateSql(this.projectActualEndDate)) 
						+ ") "));
		}
		if ((this.projectActualEndDateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJECT_ACTUAL_END_DATE] >= " 
						+ (SqlServerUtils.getDateSql(this.projectActualEndDateBegin) + ")")));
		}
		if ((this.projectActualEndDateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJECT_ACTUAL_END_DATE] < " 
						+ (SqlServerUtils.getDateSql(this.projectActualEndDateEnd) + ") ")));
		}
		if ((this.projectActualEndDateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJECT_ACTUAL_END_DATE] < " 
						+ (SqlServerUtils.getNextDateSql(this.projectActualEndDateEndEqual) + ") ")));
		}
		if ((this.projectActualStartDate == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PROJECT].[PROJECT_ACTUAL_START_DATE] = " + SqlServerUtils.getDateSql(this.projectActualStartDate)) 
						+ ") "));
		}
		if ((this.projectActualStartDateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJECT_ACTUAL_START_DATE] >= " 
						+ (SqlServerUtils.getDateSql(this.projectActualStartDateBegin) + ")")));
		}
		if ((this.projectActualStartDateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJECT_ACTUAL_START_DATE] < " 
						+ (SqlServerUtils.getDateSql(this.projectActualStartDateEnd) + ") ")));
		}
		if ((this.projectActualStartDateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJECT_ACTUAL_START_DATE] < " 
						+ (SqlServerUtils.getNextDateSql(this.projectActualStartDateEndEqual) + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.projectDesc)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_PROJECT].[PROJECT_DESC]", this.projectDesc)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.projectDescEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_PROJECT].[PROJECT_DESC] = " + SqlServerUtils.safeSql(this.projectDescEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.projectName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_PROJECT].[PROJECT_NAME]", this.projectName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.projectNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_PROJECT].[PROJECT_NAME] = " + SqlServerUtils.safeSql(this.projectNameEqual))) 
						+ ") "));
		}
		if ((this.projectPlanEndDate == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PROJECT].[PROJECT_PLAN_END_DATE] = " + SqlServerUtils.getDateSql(this.projectPlanEndDate)) 
						+ ") "));
		}
		if ((this.projectPlanEndDateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJECT_PLAN_END_DATE] >= " 
						+ (SqlServerUtils.getDateSql(this.projectPlanEndDateBegin) + ")")));
		}
		if ((this.projectPlanEndDateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJECT_PLAN_END_DATE] < " 
						+ (SqlServerUtils.getDateSql(this.projectPlanEndDateEnd) + ") ")));
		}
		if ((this.projectPlanEndDateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJECT_PLAN_END_DATE] < " 
						+ (SqlServerUtils.getNextDateSql(this.projectPlanEndDateEndEqual) + ") ")));
		}
		if ((this.projectPlanStartDate == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PROJECT].[PROJECT_PLAN_START_DATE] = " + SqlServerUtils.getDateSql(this.projectPlanStartDate)) 
						+ ") "));
		}
		if ((this.projectPlanStartDateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJECT_PLAN_START_DATE] >= " 
						+ (SqlServerUtils.getDateSql(this.projectPlanStartDateBegin) + ")")));
		}
		if ((this.projectPlanStartDateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJECT_PLAN_START_DATE] < " 
						+ (SqlServerUtils.getDateSql(this.projectPlanStartDateEnd) + ") ")));
		}
		if ((this.projectPlanStartDateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJECT_PLAN_START_DATE] < " 
						+ (SqlServerUtils.getNextDateSql(this.projectPlanStartDateEndEqual) + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.projectShortName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_PROJECT].[PROJECT_SHORT_NAME]", this.projectShortName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.projectShortNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_PROJECT].[PROJECT_SHORT_NAME] = " + SqlServerUtils.safeSql(this.projectShortNameEqual))) 
						+ ") "));
		}
		if ((this.projectState == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PROJECT].[PROJECT_STATE] = " + this.projectState) 
						+ ") "));
		}
		if ((this.projectStateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJECT_STATE] >= " 
						+ (this.projectStateBegin + ")")));
		}
		if ((this.projectStateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJECT_STATE] < " 
						+ (this.projectStateEnd + ") ")));
		}
		if ((this.projectStateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJECT_STATE] <= " 
						+ (this.projectStateEndEqual + ") ")));
		}
		if ((this.projectManagerId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PROJECT].[PROJECT_MANAGER_ID] = " + this.projectManagerId) 
						+ ") "));
		}
		if ((this.projectManagerIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJECT_MANAGER_ID] >= " 
						+ (this.projectManagerIdBegin + ")")));
		}
		if ((this.projectManagerIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJECT_MANAGER_ID] < " 
						+ (this.projectManagerIdEnd + ") ")));
		}
		if ((this.projectManagerIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PROJECT].[PROJECT_MANAGER_ID] <= " 
						+ (this.projectManagerIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
