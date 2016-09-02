package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_TASK查询条件定义
 */
public class TaskQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,ACTUAL_WORK_TIME: 实际工作时间
	 */
	Double actualWorkTime;
	
	/**
	 * 查询条件开始值,ACTUAL_WORK_TIME: 实际工作时间
	 */
	Double actualWorkTimeBegin;
	
	/**
	 * 查询条件结束值,ACTUAL_WORK_TIME: 实际工作时间
	 */
	Double actualWorkTimeEnd;
	
	/**
	 * 查询条件结束值,ACTUAL_WORK_TIME: 实际工作时间
	 */
	Double actualWorkTimeEndEqual;
	
	/**
	 * 查询条件,AUDIT_WORK_TIME: 审计工作时间
	 */
	Double auditWorkTime;
	
	/**
	 * 查询条件开始值,AUDIT_WORK_TIME: 审计工作时间
	 */
	Double auditWorkTimeBegin;
	
	/**
	 * 查询条件结束值,AUDIT_WORK_TIME: 审计工作时间
	 */
	Double auditWorkTimeEnd;
	
	/**
	 * 查询条件结束值,AUDIT_WORK_TIME: 审计工作时间
	 */
	Double auditWorkTimeEndEqual;
	
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
	 * 查询条件,ESTIMATE_WORK_TIME: 工作估计完成时间
	 */
	Double estimateWorkTime;
	
	/**
	 * 查询条件开始值,ESTIMATE_WORK_TIME: 工作估计完成时间
	 */
	Double estimateWorkTimeBegin;
	
	/**
	 * 查询条件结束值,ESTIMATE_WORK_TIME: 工作估计完成时间
	 */
	Double estimateWorkTimeEnd;
	
	/**
	 * 查询条件结束值,ESTIMATE_WORK_TIME: 工作估计完成时间
	 */
	Double estimateWorkTimeEndEqual;
	
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
	 * 查询条件,ORDER_FIELD: 口令域
	 */
	java.util.Date orderField;
	
	/**
	 * 查询条件开始值,ORDER_FIELD: 口令域
	 */
	java.util.Date orderFieldBegin;
	
	/**
	 * 查询条件结束值,ORDER_FIELD: 口令域
	 */
	java.util.Date orderFieldEnd;
	
	/**
	 * 查询条件结束值,ORDER_FIELD: 口令域
	 */
	java.util.Date orderFieldEndEqual;
	
	/**
	 * 查询条件,TASK_ACTUAL_END_DATE: 任务实际结束日期
	 */
	java.util.Date taskActualEndDate;
	
	/**
	 * 查询条件开始值,TASK_ACTUAL_END_DATE: 任务实际结束日期
	 */
	java.util.Date taskActualEndDateBegin;
	
	/**
	 * 查询条件结束值,TASK_ACTUAL_END_DATE: 任务实际结束日期
	 */
	java.util.Date taskActualEndDateEnd;
	
	/**
	 * 查询条件结束值,TASK_ACTUAL_END_DATE: 任务实际结束日期
	 */
	java.util.Date taskActualEndDateEndEqual;
	
	/**
	 * 查询条件,TASK_ACTUAL_START_DATE: 任务实际开始日期
	 */
	java.util.Date taskActualStartDate;
	
	/**
	 * 查询条件开始值,TASK_ACTUAL_START_DATE: 任务实际开始日期
	 */
	java.util.Date taskActualStartDateBegin;
	
	/**
	 * 查询条件结束值,TASK_ACTUAL_START_DATE: 任务实际开始日期
	 */
	java.util.Date taskActualStartDateEnd;
	
	/**
	 * 查询条件结束值,TASK_ACTUAL_START_DATE: 任务实际开始日期
	 */
	java.util.Date taskActualStartDateEndEqual;
	
	/**
	 * 查询条件,TASK_DESC: 任务描述
	 */
	String taskDesc;
	
	/**
	 * 查询条件字符串相等,TASK_DESC: 任务描述
	 */
	String taskDescEqual;
	
	/**
	 * 查询条件,TASK_LEVEL: 任务级别
	 */
	Integer taskLevel;
	
	/**
	 * 查询条件开始值,TASK_LEVEL: 任务级别
	 */
	Integer taskLevelBegin;
	
	/**
	 * 查询条件结束值,TASK_LEVEL: 任务级别
	 */
	Integer taskLevelEnd;
	
	/**
	 * 查询条件结束值,TASK_LEVEL: 任务级别
	 */
	Integer taskLevelEndEqual;
	
	/**
	 * 查询条件,TASK_NAME: 任务名称
	 */
	String taskName;
	
	/**
	 * 查询条件字符串相等,TASK_NAME: 任务名称
	 */
	String taskNameEqual;
	
	/**
	 * 查询条件,TASK_PLAN_END_DATE: 任务计划结束日期
	 */
	java.util.Date taskPlanEndDate;
	
	/**
	 * 查询条件开始值,TASK_PLAN_END_DATE: 任务计划结束日期
	 */
	java.util.Date taskPlanEndDateBegin;
	
	/**
	 * 查询条件结束值,TASK_PLAN_END_DATE: 任务计划结束日期
	 */
	java.util.Date taskPlanEndDateEnd;
	
	/**
	 * 查询条件结束值,TASK_PLAN_END_DATE: 任务计划结束日期
	 */
	java.util.Date taskPlanEndDateEndEqual;
	
	/**
	 * 查询条件,TASK_PLAN_START_DATE: 任务计划开始日期
	 */
	java.util.Date taskPlanStartDate;
	
	/**
	 * 查询条件开始值,TASK_PLAN_START_DATE: 任务计划开始日期
	 */
	java.util.Date taskPlanStartDateBegin;
	
	/**
	 * 查询条件结束值,TASK_PLAN_START_DATE: 任务计划开始日期
	 */
	java.util.Date taskPlanStartDateEnd;
	
	/**
	 * 查询条件结束值,TASK_PLAN_START_DATE: 任务计划开始日期
	 */
	java.util.Date taskPlanStartDateEndEqual;
	
	/**
	 * 查询条件,TASK_STATE: 任务状态
	 */
	Integer taskState;
	
	/**
	 * 查询条件开始值,TASK_STATE: 任务状态
	 */
	Integer taskStateBegin;
	
	/**
	 * 查询条件结束值,TASK_STATE: 任务状态
	 */
	Integer taskStateEnd;
	
	/**
	 * 查询条件结束值,TASK_STATE: 任务状态
	 */
	Integer taskStateEndEqual;
	
	/**
	 * 查询条件,TASK_PARENT_ID: 父任务代号
	 */
	Integer taskParentId;
	
	/**
	 * 查询条件开始值,TASK_PARENT_ID: 父任务代号
	 */
	Integer taskParentIdBegin;
	
	/**
	 * 查询条件结束值,TASK_PARENT_ID: 父任务代号
	 */
	Integer taskParentIdEnd;
	
	/**
	 * 查询条件结束值,TASK_PARENT_ID: 父任务代号
	 */
	Integer taskParentIdEndEqual;
	
	/**
	 * 查询条件,TASK_PROJECT_ID: 任务工程代号
	 */
	Integer taskProjectId;
	
	/**
	 * 查询条件开始值,TASK_PROJECT_ID: 任务工程代号
	 */
	Integer taskProjectIdBegin;
	
	/**
	 * 查询条件结束值,TASK_PROJECT_ID: 任务工程代号
	 */
	Integer taskProjectIdEnd;
	
	/**
	 * 查询条件结束值,TASK_PROJECT_ID: 任务工程代号
	 */
	Integer taskProjectIdEndEqual;
	
	/**
	 * 查询条件,TASK_CREATER_ID: 任务创建者代号
	 */
	Integer taskCreaterId;
	
	/**
	 * 查询条件开始值,TASK_CREATER_ID: 任务创建者代号
	 */
	Integer taskCreaterIdBegin;
	
	/**
	 * 查询条件结束值,TASK_CREATER_ID: 任务创建者代号
	 */
	Integer taskCreaterIdEnd;
	
	/**
	 * 查询条件结束值,TASK_CREATER_ID: 任务创建者代号
	 */
	Integer taskCreaterIdEndEqual;
	
	/**
	 * 查询条件,TASK_MANAGER_ID: 任务管理员代号
	 */
	Integer taskManagerId;
	
	/**
	 * 查询条件开始值,TASK_MANAGER_ID: 任务管理员代号
	 */
	Integer taskManagerIdBegin;
	
	/**
	 * 查询条件结束值,TASK_MANAGER_ID: 任务管理员代号
	 */
	Integer taskManagerIdEnd;
	
	/**
	 * 查询条件结束值,TASK_MANAGER_ID: 任务管理员代号
	 */
	Integer taskManagerIdEndEqual;
	
	/**
	 * 查询条件,TASK_MODIFIER_ID: 任务修改者代号
	 */
	Integer taskModifierId;
	
	/**
	 * 查询条件开始值,TASK_MODIFIER_ID: 任务修改者代号
	 */
	Integer taskModifierIdBegin;
	
	/**
	 * 查询条件结束值,TASK_MODIFIER_ID: 任务修改者代号
	 */
	Integer taskModifierIdEnd;
	
	/**
	 * 查询条件结束值,TASK_MODIFIER_ID: 任务修改者代号
	 */
	Integer taskModifierIdEndEqual;
	
	/**
	 * 查询条件,TASK_OUTLINE: 任务大纲
	 */
	String taskOutline;
	
	/**
	 * 查询条件字符串相等,TASK_OUTLINE: 任务大纲
	 */
	String taskOutlineEqual;
	
	/**
	 * 查询条件,TASK_COMPLETE: 任务完成度
	 */
	Byte taskComplete;
	
	/**
	 * 查询条件开始值,TASK_COMPLETE: 任务完成度
	 */
	Byte taskCompleteBegin;
	
	/**
	 * 查询条件结束值,TASK_COMPLETE: 任务完成度
	 */
	Byte taskCompleteEnd;
	
	/**
	 * 查询条件结束值,TASK_COMPLETE: 任务完成度
	 */
	Byte taskCompleteEndEqual;
	
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
	 * ACTUAL_WORK_TIME: 实际工作时间
	 */
	public Double getActualWorkTime() {
		return this.actualWorkTime;
	}
	
	/**
	 * ACTUAL_WORK_TIME: 实际工作时间
	 */
	public void setActualWorkTime(Double value)
	 {
		this.actualWorkTime = value;
	}
	
	/**
	 * 查询条件开始值,ACTUAL_WORK_TIME: 实际工作时间
	 */
	public Double getActualWorkTimeBegin() {
		return this.actualWorkTimeBegin;
	}
	
	/**
	 * 查询条件开始值,ACTUAL_WORK_TIME: 实际工作时间
	 */
	public void setActualWorkTimeBegin(Double value)
	 {
		this.actualWorkTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,ACTUAL_WORK_TIME: 实际工作时间
	 */
	public Double getActualWorkTimeEnd() {
		return this.actualWorkTimeEnd;
	}
	
	/**
	 * 查询条件结束值,ACTUAL_WORK_TIME: 实际工作时间
	 */
	public void setActualWorkTimeEnd(Double value)
	 {
		this.actualWorkTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,ACTUAL_WORK_TIME: 实际工作时间
	 */
	public Double getActualWorkTimeEndEqual() {
		return this.actualWorkTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,ACTUAL_WORK_TIME: 实际工作时间
	 */
	public void setActualWorkTimeEndEqual(Double value)
	 {
		this.actualWorkTimeEndEqual = value;
	}
	
	/**
	 * AUDIT_WORK_TIME: 审计工作时间
	 */
	public Double getAuditWorkTime() {
		return this.auditWorkTime;
	}
	
	/**
	 * AUDIT_WORK_TIME: 审计工作时间
	 */
	public void setAuditWorkTime(Double value)
	 {
		this.auditWorkTime = value;
	}
	
	/**
	 * 查询条件开始值,AUDIT_WORK_TIME: 审计工作时间
	 */
	public Double getAuditWorkTimeBegin() {
		return this.auditWorkTimeBegin;
	}
	
	/**
	 * 查询条件开始值,AUDIT_WORK_TIME: 审计工作时间
	 */
	public void setAuditWorkTimeBegin(Double value)
	 {
		this.auditWorkTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,AUDIT_WORK_TIME: 审计工作时间
	 */
	public Double getAuditWorkTimeEnd() {
		return this.auditWorkTimeEnd;
	}
	
	/**
	 * 查询条件结束值,AUDIT_WORK_TIME: 审计工作时间
	 */
	public void setAuditWorkTimeEnd(Double value)
	 {
		this.auditWorkTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,AUDIT_WORK_TIME: 审计工作时间
	 */
	public Double getAuditWorkTimeEndEqual() {
		return this.auditWorkTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,AUDIT_WORK_TIME: 审计工作时间
	 */
	public void setAuditWorkTimeEndEqual(Double value)
	 {
		this.auditWorkTimeEndEqual = value;
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
	 * ESTIMATE_WORK_TIME: 工作估计完成时间
	 */
	public Double getEstimateWorkTime() {
		return this.estimateWorkTime;
	}
	
	/**
	 * ESTIMATE_WORK_TIME: 工作估计完成时间
	 */
	public void setEstimateWorkTime(Double value)
	 {
		this.estimateWorkTime = value;
	}
	
	/**
	 * 查询条件开始值,ESTIMATE_WORK_TIME: 工作估计完成时间
	 */
	public Double getEstimateWorkTimeBegin() {
		return this.estimateWorkTimeBegin;
	}
	
	/**
	 * 查询条件开始值,ESTIMATE_WORK_TIME: 工作估计完成时间
	 */
	public void setEstimateWorkTimeBegin(Double value)
	 {
		this.estimateWorkTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,ESTIMATE_WORK_TIME: 工作估计完成时间
	 */
	public Double getEstimateWorkTimeEnd() {
		return this.estimateWorkTimeEnd;
	}
	
	/**
	 * 查询条件结束值,ESTIMATE_WORK_TIME: 工作估计完成时间
	 */
	public void setEstimateWorkTimeEnd(Double value)
	 {
		this.estimateWorkTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,ESTIMATE_WORK_TIME: 工作估计完成时间
	 */
	public Double getEstimateWorkTimeEndEqual() {
		return this.estimateWorkTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,ESTIMATE_WORK_TIME: 工作估计完成时间
	 */
	public void setEstimateWorkTimeEndEqual(Double value)
	 {
		this.estimateWorkTimeEndEqual = value;
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
	 * ORDER_FIELD: 口令域
	 */
	public java.util.Date getOrderField() {
		return this.orderField;
	}
	
	/**
	 * ORDER_FIELD: 口令域
	 */
	public void setOrderField(java.util.Date value)
	 {
		this.orderField = value;
	}
	
	/**
	 * 查询条件开始值,ORDER_FIELD: 口令域
	 */
	public java.util.Date getOrderFieldBegin() {
		return this.orderFieldBegin;
	}
	
	/**
	 * 查询条件开始值,ORDER_FIELD: 口令域
	 */
	public void setOrderFieldBegin(java.util.Date value)
	 {
		this.orderFieldBegin = value;
	}
	
	/**
	 * 查询条件结束值,ORDER_FIELD: 口令域
	 */
	public java.util.Date getOrderFieldEnd() {
		return this.orderFieldEnd;
	}
	
	/**
	 * 查询条件结束值,ORDER_FIELD: 口令域
	 */
	public void setOrderFieldEnd(java.util.Date value)
	 {
		this.orderFieldEnd = value;
	}
	
	/**
	 * 查询条件结束值,ORDER_FIELD: 口令域
	 */
	public java.util.Date getOrderFieldEndEqual() {
		return this.orderFieldEndEqual;
	}
	
	/**
	 * 查询条件结束值,ORDER_FIELD: 口令域
	 */
	public void setOrderFieldEndEqual(java.util.Date value)
	 {
		this.orderFieldEndEqual = value;
	}
	
	/**
	 * TASK_ACTUAL_END_DATE: 任务实际结束日期
	 */
	public java.util.Date getTaskActualEndDate() {
		return this.taskActualEndDate;
	}
	
	/**
	 * TASK_ACTUAL_END_DATE: 任务实际结束日期
	 */
	public void setTaskActualEndDate(java.util.Date value)
	 {
		this.taskActualEndDate = value;
	}
	
	/**
	 * 查询条件开始值,TASK_ACTUAL_END_DATE: 任务实际结束日期
	 */
	public java.util.Date getTaskActualEndDateBegin() {
		return this.taskActualEndDateBegin;
	}
	
	/**
	 * 查询条件开始值,TASK_ACTUAL_END_DATE: 任务实际结束日期
	 */
	public void setTaskActualEndDateBegin(java.util.Date value)
	 {
		this.taskActualEndDateBegin = value;
	}
	
	/**
	 * 查询条件结束值,TASK_ACTUAL_END_DATE: 任务实际结束日期
	 */
	public java.util.Date getTaskActualEndDateEnd() {
		return this.taskActualEndDateEnd;
	}
	
	/**
	 * 查询条件结束值,TASK_ACTUAL_END_DATE: 任务实际结束日期
	 */
	public void setTaskActualEndDateEnd(java.util.Date value)
	 {
		this.taskActualEndDateEnd = value;
	}
	
	/**
	 * 查询条件结束值,TASK_ACTUAL_END_DATE: 任务实际结束日期
	 */
	public java.util.Date getTaskActualEndDateEndEqual() {
		return this.taskActualEndDateEndEqual;
	}
	
	/**
	 * 查询条件结束值,TASK_ACTUAL_END_DATE: 任务实际结束日期
	 */
	public void setTaskActualEndDateEndEqual(java.util.Date value)
	 {
		this.taskActualEndDateEndEqual = value;
	}
	
	/**
	 * TASK_ACTUAL_START_DATE: 任务实际开始日期
	 */
	public java.util.Date getTaskActualStartDate() {
		return this.taskActualStartDate;
	}
	
	/**
	 * TASK_ACTUAL_START_DATE: 任务实际开始日期
	 */
	public void setTaskActualStartDate(java.util.Date value)
	 {
		this.taskActualStartDate = value;
	}
	
	/**
	 * 查询条件开始值,TASK_ACTUAL_START_DATE: 任务实际开始日期
	 */
	public java.util.Date getTaskActualStartDateBegin() {
		return this.taskActualStartDateBegin;
	}
	
	/**
	 * 查询条件开始值,TASK_ACTUAL_START_DATE: 任务实际开始日期
	 */
	public void setTaskActualStartDateBegin(java.util.Date value)
	 {
		this.taskActualStartDateBegin = value;
	}
	
	/**
	 * 查询条件结束值,TASK_ACTUAL_START_DATE: 任务实际开始日期
	 */
	public java.util.Date getTaskActualStartDateEnd() {
		return this.taskActualStartDateEnd;
	}
	
	/**
	 * 查询条件结束值,TASK_ACTUAL_START_DATE: 任务实际开始日期
	 */
	public void setTaskActualStartDateEnd(java.util.Date value)
	 {
		this.taskActualStartDateEnd = value;
	}
	
	/**
	 * 查询条件结束值,TASK_ACTUAL_START_DATE: 任务实际开始日期
	 */
	public java.util.Date getTaskActualStartDateEndEqual() {
		return this.taskActualStartDateEndEqual;
	}
	
	/**
	 * 查询条件结束值,TASK_ACTUAL_START_DATE: 任务实际开始日期
	 */
	public void setTaskActualStartDateEndEqual(java.util.Date value)
	 {
		this.taskActualStartDateEndEqual = value;
	}
	
	/**
	 * TASK_DESC: 任务描述
	 */
	public String getTaskDesc() {
		return this.taskDesc;
	}
	
	/**
	 * TASK_DESC: 任务描述
	 */
	public void setTaskDesc(String value)
	 {
		this.taskDesc = value;
	}
	
	/**
	 * 查询条件字符串相等,TASK_DESC: 任务描述
	 */
	public String getTaskDescEqual() {
		return this.taskDescEqual;
	}
	
	/**
	 * 查询条件字符串相等,TASK_DESC: 任务描述
	 */
	public void setTaskDescEqual(String value)
	 {
		this.taskDescEqual = value;
	}
	
	/**
	 * TASK_LEVEL: 任务级别
	 */
	public Integer getTaskLevel() {
		return this.taskLevel;
	}
	
	/**
	 * TASK_LEVEL: 任务级别
	 */
	public void setTaskLevel(Integer value)
	 {
		this.taskLevel = value;
	}
	
	/**
	 * 查询条件开始值,TASK_LEVEL: 任务级别
	 */
	public Integer getTaskLevelBegin() {
		return this.taskLevelBegin;
	}
	
	/**
	 * 查询条件开始值,TASK_LEVEL: 任务级别
	 */
	public void setTaskLevelBegin(Integer value)
	 {
		this.taskLevelBegin = value;
	}
	
	/**
	 * 查询条件结束值,TASK_LEVEL: 任务级别
	 */
	public Integer getTaskLevelEnd() {
		return this.taskLevelEnd;
	}
	
	/**
	 * 查询条件结束值,TASK_LEVEL: 任务级别
	 */
	public void setTaskLevelEnd(Integer value)
	 {
		this.taskLevelEnd = value;
	}
	
	/**
	 * 查询条件结束值,TASK_LEVEL: 任务级别
	 */
	public Integer getTaskLevelEndEqual() {
		return this.taskLevelEndEqual;
	}
	
	/**
	 * 查询条件结束值,TASK_LEVEL: 任务级别
	 */
	public void setTaskLevelEndEqual(Integer value)
	 {
		this.taskLevelEndEqual = value;
	}
	
	/**
	 * TASK_NAME: 任务名称
	 */
	public String getTaskName() {
		return this.taskName;
	}
	
	/**
	 * TASK_NAME: 任务名称
	 */
	public void setTaskName(String value)
	 {
		this.taskName = value;
	}
	
	/**
	 * 查询条件字符串相等,TASK_NAME: 任务名称
	 */
	public String getTaskNameEqual() {
		return this.taskNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,TASK_NAME: 任务名称
	 */
	public void setTaskNameEqual(String value)
	 {
		this.taskNameEqual = value;
	}
	
	/**
	 * TASK_PLAN_END_DATE: 任务计划结束日期
	 */
	public java.util.Date getTaskPlanEndDate() {
		return this.taskPlanEndDate;
	}
	
	/**
	 * TASK_PLAN_END_DATE: 任务计划结束日期
	 */
	public void setTaskPlanEndDate(java.util.Date value)
	 {
		this.taskPlanEndDate = value;
	}
	
	/**
	 * 查询条件开始值,TASK_PLAN_END_DATE: 任务计划结束日期
	 */
	public java.util.Date getTaskPlanEndDateBegin() {
		return this.taskPlanEndDateBegin;
	}
	
	/**
	 * 查询条件开始值,TASK_PLAN_END_DATE: 任务计划结束日期
	 */
	public void setTaskPlanEndDateBegin(java.util.Date value)
	 {
		this.taskPlanEndDateBegin = value;
	}
	
	/**
	 * 查询条件结束值,TASK_PLAN_END_DATE: 任务计划结束日期
	 */
	public java.util.Date getTaskPlanEndDateEnd() {
		return this.taskPlanEndDateEnd;
	}
	
	/**
	 * 查询条件结束值,TASK_PLAN_END_DATE: 任务计划结束日期
	 */
	public void setTaskPlanEndDateEnd(java.util.Date value)
	 {
		this.taskPlanEndDateEnd = value;
	}
	
	/**
	 * 查询条件结束值,TASK_PLAN_END_DATE: 任务计划结束日期
	 */
	public java.util.Date getTaskPlanEndDateEndEqual() {
		return this.taskPlanEndDateEndEqual;
	}
	
	/**
	 * 查询条件结束值,TASK_PLAN_END_DATE: 任务计划结束日期
	 */
	public void setTaskPlanEndDateEndEqual(java.util.Date value)
	 {
		this.taskPlanEndDateEndEqual = value;
	}
	
	/**
	 * TASK_PLAN_START_DATE: 任务计划开始日期
	 */
	public java.util.Date getTaskPlanStartDate() {
		return this.taskPlanStartDate;
	}
	
	/**
	 * TASK_PLAN_START_DATE: 任务计划开始日期
	 */
	public void setTaskPlanStartDate(java.util.Date value)
	 {
		this.taskPlanStartDate = value;
	}
	
	/**
	 * 查询条件开始值,TASK_PLAN_START_DATE: 任务计划开始日期
	 */
	public java.util.Date getTaskPlanStartDateBegin() {
		return this.taskPlanStartDateBegin;
	}
	
	/**
	 * 查询条件开始值,TASK_PLAN_START_DATE: 任务计划开始日期
	 */
	public void setTaskPlanStartDateBegin(java.util.Date value)
	 {
		this.taskPlanStartDateBegin = value;
	}
	
	/**
	 * 查询条件结束值,TASK_PLAN_START_DATE: 任务计划开始日期
	 */
	public java.util.Date getTaskPlanStartDateEnd() {
		return this.taskPlanStartDateEnd;
	}
	
	/**
	 * 查询条件结束值,TASK_PLAN_START_DATE: 任务计划开始日期
	 */
	public void setTaskPlanStartDateEnd(java.util.Date value)
	 {
		this.taskPlanStartDateEnd = value;
	}
	
	/**
	 * 查询条件结束值,TASK_PLAN_START_DATE: 任务计划开始日期
	 */
	public java.util.Date getTaskPlanStartDateEndEqual() {
		return this.taskPlanStartDateEndEqual;
	}
	
	/**
	 * 查询条件结束值,TASK_PLAN_START_DATE: 任务计划开始日期
	 */
	public void setTaskPlanStartDateEndEqual(java.util.Date value)
	 {
		this.taskPlanStartDateEndEqual = value;
	}
	
	/**
	 * TASK_STATE: 任务状态
	 */
	public Integer getTaskState() {
		return this.taskState;
	}
	
	/**
	 * TASK_STATE: 任务状态
	 */
	public void setTaskState(Integer value)
	 {
		this.taskState = value;
	}
	
	/**
	 * 查询条件开始值,TASK_STATE: 任务状态
	 */
	public Integer getTaskStateBegin() {
		return this.taskStateBegin;
	}
	
	/**
	 * 查询条件开始值,TASK_STATE: 任务状态
	 */
	public void setTaskStateBegin(Integer value)
	 {
		this.taskStateBegin = value;
	}
	
	/**
	 * 查询条件结束值,TASK_STATE: 任务状态
	 */
	public Integer getTaskStateEnd() {
		return this.taskStateEnd;
	}
	
	/**
	 * 查询条件结束值,TASK_STATE: 任务状态
	 */
	public void setTaskStateEnd(Integer value)
	 {
		this.taskStateEnd = value;
	}
	
	/**
	 * 查询条件结束值,TASK_STATE: 任务状态
	 */
	public Integer getTaskStateEndEqual() {
		return this.taskStateEndEqual;
	}
	
	/**
	 * 查询条件结束值,TASK_STATE: 任务状态
	 */
	public void setTaskStateEndEqual(Integer value)
	 {
		this.taskStateEndEqual = value;
	}
	
	/**
	 * TASK_PARENT_ID: 父任务代号
	 */
	public Integer getTaskParentId() {
		return this.taskParentId;
	}
	
	/**
	 * TASK_PARENT_ID: 父任务代号
	 */
	public void setTaskParentId(Integer value)
	 {
		this.taskParentId = value;
	}
	
	/**
	 * 查询条件开始值,TASK_PARENT_ID: 父任务代号
	 */
	public Integer getTaskParentIdBegin() {
		return this.taskParentIdBegin;
	}
	
	/**
	 * 查询条件开始值,TASK_PARENT_ID: 父任务代号
	 */
	public void setTaskParentIdBegin(Integer value)
	 {
		this.taskParentIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,TASK_PARENT_ID: 父任务代号
	 */
	public Integer getTaskParentIdEnd() {
		return this.taskParentIdEnd;
	}
	
	/**
	 * 查询条件结束值,TASK_PARENT_ID: 父任务代号
	 */
	public void setTaskParentIdEnd(Integer value)
	 {
		this.taskParentIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,TASK_PARENT_ID: 父任务代号
	 */
	public Integer getTaskParentIdEndEqual() {
		return this.taskParentIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,TASK_PARENT_ID: 父任务代号
	 */
	public void setTaskParentIdEndEqual(Integer value)
	 {
		this.taskParentIdEndEqual = value;
	}
	
	/**
	 * TASK_PROJECT_ID: 任务工程代号
	 */
	public Integer getTaskProjectId() {
		return this.taskProjectId;
	}
	
	/**
	 * TASK_PROJECT_ID: 任务工程代号
	 */
	public void setTaskProjectId(Integer value)
	 {
		this.taskProjectId = value;
	}
	
	/**
	 * 查询条件开始值,TASK_PROJECT_ID: 任务工程代号
	 */
	public Integer getTaskProjectIdBegin() {
		return this.taskProjectIdBegin;
	}
	
	/**
	 * 查询条件开始值,TASK_PROJECT_ID: 任务工程代号
	 */
	public void setTaskProjectIdBegin(Integer value)
	 {
		this.taskProjectIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,TASK_PROJECT_ID: 任务工程代号
	 */
	public Integer getTaskProjectIdEnd() {
		return this.taskProjectIdEnd;
	}
	
	/**
	 * 查询条件结束值,TASK_PROJECT_ID: 任务工程代号
	 */
	public void setTaskProjectIdEnd(Integer value)
	 {
		this.taskProjectIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,TASK_PROJECT_ID: 任务工程代号
	 */
	public Integer getTaskProjectIdEndEqual() {
		return this.taskProjectIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,TASK_PROJECT_ID: 任务工程代号
	 */
	public void setTaskProjectIdEndEqual(Integer value)
	 {
		this.taskProjectIdEndEqual = value;
	}
	
	/**
	 * TASK_CREATER_ID: 任务创建者代号
	 */
	public Integer getTaskCreaterId() {
		return this.taskCreaterId;
	}
	
	/**
	 * TASK_CREATER_ID: 任务创建者代号
	 */
	public void setTaskCreaterId(Integer value)
	 {
		this.taskCreaterId = value;
	}
	
	/**
	 * 查询条件开始值,TASK_CREATER_ID: 任务创建者代号
	 */
	public Integer getTaskCreaterIdBegin() {
		return this.taskCreaterIdBegin;
	}
	
	/**
	 * 查询条件开始值,TASK_CREATER_ID: 任务创建者代号
	 */
	public void setTaskCreaterIdBegin(Integer value)
	 {
		this.taskCreaterIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,TASK_CREATER_ID: 任务创建者代号
	 */
	public Integer getTaskCreaterIdEnd() {
		return this.taskCreaterIdEnd;
	}
	
	/**
	 * 查询条件结束值,TASK_CREATER_ID: 任务创建者代号
	 */
	public void setTaskCreaterIdEnd(Integer value)
	 {
		this.taskCreaterIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,TASK_CREATER_ID: 任务创建者代号
	 */
	public Integer getTaskCreaterIdEndEqual() {
		return this.taskCreaterIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,TASK_CREATER_ID: 任务创建者代号
	 */
	public void setTaskCreaterIdEndEqual(Integer value)
	 {
		this.taskCreaterIdEndEqual = value;
	}
	
	/**
	 * TASK_MANAGER_ID: 任务管理员代号
	 */
	public Integer getTaskManagerId() {
		return this.taskManagerId;
	}
	
	/**
	 * TASK_MANAGER_ID: 任务管理员代号
	 */
	public void setTaskManagerId(Integer value)
	 {
		this.taskManagerId = value;
	}
	
	/**
	 * 查询条件开始值,TASK_MANAGER_ID: 任务管理员代号
	 */
	public Integer getTaskManagerIdBegin() {
		return this.taskManagerIdBegin;
	}
	
	/**
	 * 查询条件开始值,TASK_MANAGER_ID: 任务管理员代号
	 */
	public void setTaskManagerIdBegin(Integer value)
	 {
		this.taskManagerIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,TASK_MANAGER_ID: 任务管理员代号
	 */
	public Integer getTaskManagerIdEnd() {
		return this.taskManagerIdEnd;
	}
	
	/**
	 * 查询条件结束值,TASK_MANAGER_ID: 任务管理员代号
	 */
	public void setTaskManagerIdEnd(Integer value)
	 {
		this.taskManagerIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,TASK_MANAGER_ID: 任务管理员代号
	 */
	public Integer getTaskManagerIdEndEqual() {
		return this.taskManagerIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,TASK_MANAGER_ID: 任务管理员代号
	 */
	public void setTaskManagerIdEndEqual(Integer value)
	 {
		this.taskManagerIdEndEqual = value;
	}
	
	/**
	 * TASK_MODIFIER_ID: 任务修改者代号
	 */
	public Integer getTaskModifierId() {
		return this.taskModifierId;
	}
	
	/**
	 * TASK_MODIFIER_ID: 任务修改者代号
	 */
	public void setTaskModifierId(Integer value)
	 {
		this.taskModifierId = value;
	}
	
	/**
	 * 查询条件开始值,TASK_MODIFIER_ID: 任务修改者代号
	 */
	public Integer getTaskModifierIdBegin() {
		return this.taskModifierIdBegin;
	}
	
	/**
	 * 查询条件开始值,TASK_MODIFIER_ID: 任务修改者代号
	 */
	public void setTaskModifierIdBegin(Integer value)
	 {
		this.taskModifierIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,TASK_MODIFIER_ID: 任务修改者代号
	 */
	public Integer getTaskModifierIdEnd() {
		return this.taskModifierIdEnd;
	}
	
	/**
	 * 查询条件结束值,TASK_MODIFIER_ID: 任务修改者代号
	 */
	public void setTaskModifierIdEnd(Integer value)
	 {
		this.taskModifierIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,TASK_MODIFIER_ID: 任务修改者代号
	 */
	public Integer getTaskModifierIdEndEqual() {
		return this.taskModifierIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,TASK_MODIFIER_ID: 任务修改者代号
	 */
	public void setTaskModifierIdEndEqual(Integer value)
	 {
		this.taskModifierIdEndEqual = value;
	}
	
	/**
	 * TASK_OUTLINE: 任务大纲
	 */
	public String getTaskOutline() {
		return this.taskOutline;
	}
	
	/**
	 * TASK_OUTLINE: 任务大纲
	 */
	public void setTaskOutline(String value)
	 {
		this.taskOutline = value;
	}
	
	/**
	 * 查询条件字符串相等,TASK_OUTLINE: 任务大纲
	 */
	public String getTaskOutlineEqual() {
		return this.taskOutlineEqual;
	}
	
	/**
	 * 查询条件字符串相等,TASK_OUTLINE: 任务大纲
	 */
	public void setTaskOutlineEqual(String value)
	 {
		this.taskOutlineEqual = value;
	}
	
	/**
	 * TASK_COMPLETE: 任务完成度
	 */
	public Byte getTaskComplete() {
		return this.taskComplete;
	}
	
	/**
	 * TASK_COMPLETE: 任务完成度
	 */
	public void setTaskComplete(Byte value)
	 {
		this.taskComplete = value;
	}
	
	/**
	 * 查询条件开始值,TASK_COMPLETE: 任务完成度
	 */
	public Byte getTaskCompleteBegin() {
		return this.taskCompleteBegin;
	}
	
	/**
	 * 查询条件开始值,TASK_COMPLETE: 任务完成度
	 */
	public void setTaskCompleteBegin(Byte value)
	 {
		this.taskCompleteBegin = value;
	}
	
	/**
	 * 查询条件结束值,TASK_COMPLETE: 任务完成度
	 */
	public Byte getTaskCompleteEnd() {
		return this.taskCompleteEnd;
	}
	
	/**
	 * 查询条件结束值,TASK_COMPLETE: 任务完成度
	 */
	public void setTaskCompleteEnd(Byte value)
	 {
		this.taskCompleteEnd = value;
	}
	
	/**
	 * 查询条件结束值,TASK_COMPLETE: 任务完成度
	 */
	public Byte getTaskCompleteEndEqual() {
		return this.taskCompleteEndEqual;
	}
	
	/**
	 * 查询条件结束值,TASK_COMPLETE: 任务完成度
	 */
	public void setTaskCompleteEndEqual(Byte value)
	 {
		this.taskCompleteEndEqual = value;
	}
	
	/**
	 * 设置查询条件TASK_ID: 任务代号
	 */
	public TaskQueryCondition setTaskIdCondition(Integer value) {
		this.taskId = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 任务代号
	 */
	public TaskQueryCondition setTaskIdConditionBegin(Integer value) {
		this.taskIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 任务代号
	 */
	public TaskQueryCondition setTaskIdConditionEnd(Integer value) {
		this.taskIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ID: 任务代号
	 */
	public TaskQueryCondition setTaskIdConditionEndEqual(Integer value) {
		this.taskIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ACTUAL_WORK_TIME: 实际工作时间
	 */
	public TaskQueryCondition setActualWorkTimeCondition(Double value) {
		this.actualWorkTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件ACTUAL_WORK_TIME: 实际工作时间
	 */
	public TaskQueryCondition setActualWorkTimeConditionBegin(Double value) {
		this.actualWorkTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ACTUAL_WORK_TIME: 实际工作时间
	 */
	public TaskQueryCondition setActualWorkTimeConditionEnd(Double value) {
		this.actualWorkTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ACTUAL_WORK_TIME: 实际工作时间
	 */
	public TaskQueryCondition setActualWorkTimeConditionEndEqual(Double value) {
		this.actualWorkTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件AUDIT_WORK_TIME: 审计工作时间
	 */
	public TaskQueryCondition setAuditWorkTimeCondition(Double value) {
		this.auditWorkTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件AUDIT_WORK_TIME: 审计工作时间
	 */
	public TaskQueryCondition setAuditWorkTimeConditionBegin(Double value) {
		this.auditWorkTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件AUDIT_WORK_TIME: 审计工作时间
	 */
	public TaskQueryCondition setAuditWorkTimeConditionEnd(Double value) {
		this.auditWorkTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件AUDIT_WORK_TIME: 审计工作时间
	 */
	public TaskQueryCondition setAuditWorkTimeConditionEndEqual(Double value) {
		this.auditWorkTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 创建时间
	 */
	public TaskQueryCondition setCreateTimeCondition(java.util.Date value) {
		this.createTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 创建时间
	 */
	public TaskQueryCondition setCreateTimeConditionBegin(java.util.Date value) {
		this.createTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 创建时间
	 */
	public TaskQueryCondition setCreateTimeConditionEnd(java.util.Date value) {
		this.createTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 创建时间
	 */
	public TaskQueryCondition setCreateTimeConditionEndEqual(java.util.Date value) {
		this.createTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ESTIMATE_WORK_TIME: 工作估计完成时间
	 */
	public TaskQueryCondition setEstimateWorkTimeCondition(Double value) {
		this.estimateWorkTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件ESTIMATE_WORK_TIME: 工作估计完成时间
	 */
	public TaskQueryCondition setEstimateWorkTimeConditionBegin(Double value) {
		this.estimateWorkTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ESTIMATE_WORK_TIME: 工作估计完成时间
	 */
	public TaskQueryCondition setEstimateWorkTimeConditionEnd(Double value) {
		this.estimateWorkTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ESTIMATE_WORK_TIME: 工作估计完成时间
	 */
	public TaskQueryCondition setEstimateWorkTimeConditionEndEqual(Double value) {
		this.estimateWorkTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 修改时间
	 */
	public TaskQueryCondition setModifyTimeCondition(java.util.Date value) {
		this.modifyTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 修改时间
	 */
	public TaskQueryCondition setModifyTimeConditionBegin(java.util.Date value) {
		this.modifyTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 修改时间
	 */
	public TaskQueryCondition setModifyTimeConditionEnd(java.util.Date value) {
		this.modifyTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 修改时间
	 */
	public TaskQueryCondition setModifyTimeConditionEndEqual(java.util.Date value) {
		this.modifyTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ORDER_FIELD: 口令域
	 */
	public TaskQueryCondition setOrderFieldCondition(java.util.Date value) {
		this.orderField = value;
		return this;
	}
	
	/**
	 * 设置查询条件ORDER_FIELD: 口令域
	 */
	public TaskQueryCondition setOrderFieldConditionBegin(java.util.Date value) {
		this.orderFieldBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ORDER_FIELD: 口令域
	 */
	public TaskQueryCondition setOrderFieldConditionEnd(java.util.Date value) {
		this.orderFieldEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ORDER_FIELD: 口令域
	 */
	public TaskQueryCondition setOrderFieldConditionEndEqual(java.util.Date value) {
		this.orderFieldEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ACTUAL_END_DATE: 任务实际结束日期
	 */
	public TaskQueryCondition setTaskActualEndDateCondition(java.util.Date value) {
		this.taskActualEndDate = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ACTUAL_END_DATE: 任务实际结束日期
	 */
	public TaskQueryCondition setTaskActualEndDateConditionBegin(java.util.Date value) {
		this.taskActualEndDateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ACTUAL_END_DATE: 任务实际结束日期
	 */
	public TaskQueryCondition setTaskActualEndDateConditionEnd(java.util.Date value) {
		this.taskActualEndDateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ACTUAL_END_DATE: 任务实际结束日期
	 */
	public TaskQueryCondition setTaskActualEndDateConditionEndEqual(java.util.Date value) {
		this.taskActualEndDateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ACTUAL_START_DATE: 任务实际开始日期
	 */
	public TaskQueryCondition setTaskActualStartDateCondition(java.util.Date value) {
		this.taskActualStartDate = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ACTUAL_START_DATE: 任务实际开始日期
	 */
	public TaskQueryCondition setTaskActualStartDateConditionBegin(java.util.Date value) {
		this.taskActualStartDateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ACTUAL_START_DATE: 任务实际开始日期
	 */
	public TaskQueryCondition setTaskActualStartDateConditionEnd(java.util.Date value) {
		this.taskActualStartDateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_ACTUAL_START_DATE: 任务实际开始日期
	 */
	public TaskQueryCondition setTaskActualStartDateConditionEndEqual(java.util.Date value) {
		this.taskActualStartDateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_DESC: 任务描述
	 */
	public TaskQueryCondition setTaskDescCondition(String value) {
		this.taskDesc = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_DESC: 任务描述
	 */
	public TaskQueryCondition setTaskDescConditionEqual(String value) {
		this.taskDescEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_LEVEL: 任务级别
	 */
	public TaskQueryCondition setTaskLevelCondition(Integer value) {
		this.taskLevel = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_LEVEL: 任务级别
	 */
	public TaskQueryCondition setTaskLevelConditionBegin(Integer value) {
		this.taskLevelBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_LEVEL: 任务级别
	 */
	public TaskQueryCondition setTaskLevelConditionEnd(Integer value) {
		this.taskLevelEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_LEVEL: 任务级别
	 */
	public TaskQueryCondition setTaskLevelConditionEndEqual(Integer value) {
		this.taskLevelEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_NAME: 任务名称
	 */
	public TaskQueryCondition setTaskNameCondition(String value) {
		this.taskName = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_NAME: 任务名称
	 */
	public TaskQueryCondition setTaskNameConditionEqual(String value) {
		this.taskNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_PLAN_END_DATE: 任务计划结束日期
	 */
	public TaskQueryCondition setTaskPlanEndDateCondition(java.util.Date value) {
		this.taskPlanEndDate = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_PLAN_END_DATE: 任务计划结束日期
	 */
	public TaskQueryCondition setTaskPlanEndDateConditionBegin(java.util.Date value) {
		this.taskPlanEndDateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_PLAN_END_DATE: 任务计划结束日期
	 */
	public TaskQueryCondition setTaskPlanEndDateConditionEnd(java.util.Date value) {
		this.taskPlanEndDateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_PLAN_END_DATE: 任务计划结束日期
	 */
	public TaskQueryCondition setTaskPlanEndDateConditionEndEqual(java.util.Date value) {
		this.taskPlanEndDateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_PLAN_START_DATE: 任务计划开始日期
	 */
	public TaskQueryCondition setTaskPlanStartDateCondition(java.util.Date value) {
		this.taskPlanStartDate = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_PLAN_START_DATE: 任务计划开始日期
	 */
	public TaskQueryCondition setTaskPlanStartDateConditionBegin(java.util.Date value) {
		this.taskPlanStartDateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_PLAN_START_DATE: 任务计划开始日期
	 */
	public TaskQueryCondition setTaskPlanStartDateConditionEnd(java.util.Date value) {
		this.taskPlanStartDateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_PLAN_START_DATE: 任务计划开始日期
	 */
	public TaskQueryCondition setTaskPlanStartDateConditionEndEqual(java.util.Date value) {
		this.taskPlanStartDateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_STATE: 任务状态
	 */
	public TaskQueryCondition setTaskStateCondition(Integer value) {
		this.taskState = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_STATE: 任务状态
	 */
	public TaskQueryCondition setTaskStateConditionBegin(Integer value) {
		this.taskStateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_STATE: 任务状态
	 */
	public TaskQueryCondition setTaskStateConditionEnd(Integer value) {
		this.taskStateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_STATE: 任务状态
	 */
	public TaskQueryCondition setTaskStateConditionEndEqual(Integer value) {
		this.taskStateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_PARENT_ID: 父任务代号
	 */
	public TaskQueryCondition setTaskParentIdCondition(Integer value) {
		this.taskParentId = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_PARENT_ID: 父任务代号
	 */
	public TaskQueryCondition setTaskParentIdConditionBegin(Integer value) {
		this.taskParentIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_PARENT_ID: 父任务代号
	 */
	public TaskQueryCondition setTaskParentIdConditionEnd(Integer value) {
		this.taskParentIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_PARENT_ID: 父任务代号
	 */
	public TaskQueryCondition setTaskParentIdConditionEndEqual(Integer value) {
		this.taskParentIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_PROJECT_ID: 任务工程代号
	 */
	public TaskQueryCondition setTaskProjectIdCondition(Integer value) {
		this.taskProjectId = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_PROJECT_ID: 任务工程代号
	 */
	public TaskQueryCondition setTaskProjectIdConditionBegin(Integer value) {
		this.taskProjectIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_PROJECT_ID: 任务工程代号
	 */
	public TaskQueryCondition setTaskProjectIdConditionEnd(Integer value) {
		this.taskProjectIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_PROJECT_ID: 任务工程代号
	 */
	public TaskQueryCondition setTaskProjectIdConditionEndEqual(Integer value) {
		this.taskProjectIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_CREATER_ID: 任务创建者代号
	 */
	public TaskQueryCondition setTaskCreaterIdCondition(Integer value) {
		this.taskCreaterId = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_CREATER_ID: 任务创建者代号
	 */
	public TaskQueryCondition setTaskCreaterIdConditionBegin(Integer value) {
		this.taskCreaterIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_CREATER_ID: 任务创建者代号
	 */
	public TaskQueryCondition setTaskCreaterIdConditionEnd(Integer value) {
		this.taskCreaterIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_CREATER_ID: 任务创建者代号
	 */
	public TaskQueryCondition setTaskCreaterIdConditionEndEqual(Integer value) {
		this.taskCreaterIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_MANAGER_ID: 任务管理员代号
	 */
	public TaskQueryCondition setTaskManagerIdCondition(Integer value) {
		this.taskManagerId = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_MANAGER_ID: 任务管理员代号
	 */
	public TaskQueryCondition setTaskManagerIdConditionBegin(Integer value) {
		this.taskManagerIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_MANAGER_ID: 任务管理员代号
	 */
	public TaskQueryCondition setTaskManagerIdConditionEnd(Integer value) {
		this.taskManagerIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_MANAGER_ID: 任务管理员代号
	 */
	public TaskQueryCondition setTaskManagerIdConditionEndEqual(Integer value) {
		this.taskManagerIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_MODIFIER_ID: 任务修改者代号
	 */
	public TaskQueryCondition setTaskModifierIdCondition(Integer value) {
		this.taskModifierId = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_MODIFIER_ID: 任务修改者代号
	 */
	public TaskQueryCondition setTaskModifierIdConditionBegin(Integer value) {
		this.taskModifierIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_MODIFIER_ID: 任务修改者代号
	 */
	public TaskQueryCondition setTaskModifierIdConditionEnd(Integer value) {
		this.taskModifierIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_MODIFIER_ID: 任务修改者代号
	 */
	public TaskQueryCondition setTaskModifierIdConditionEndEqual(Integer value) {
		this.taskModifierIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_OUTLINE: 任务大纲
	 */
	public TaskQueryCondition setTaskOutlineCondition(String value) {
		this.taskOutline = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_OUTLINE: 任务大纲
	 */
	public TaskQueryCondition setTaskOutlineConditionEqual(String value) {
		this.taskOutlineEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_COMPLETE: 任务完成度
	 */
	public TaskQueryCondition setTaskCompleteCondition(Byte value) {
		this.taskComplete = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_COMPLETE: 任务完成度
	 */
	public TaskQueryCondition setTaskCompleteConditionBegin(Byte value) {
		this.taskCompleteBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_COMPLETE: 任务完成度
	 */
	public TaskQueryCondition setTaskCompleteConditionEnd(Byte value) {
		this.taskCompleteEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_COMPLETE: 任务完成度
	 */
	public TaskQueryCondition setTaskCompleteConditionEndEqual(Byte value) {
		this.taskCompleteEndEqual = value;
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
						+ ((" and ([T_TASK].[TASK_ID] = " + this.taskId) 
						+ ") "));
		}
		if ((this.taskIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_ID] >= " 
						+ (this.taskIdBegin + ")")));
		}
		if ((this.taskIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_ID] < " 
						+ (this.taskIdEnd + ") ")));
		}
		if ((this.taskIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_ID] <= " 
						+ (this.taskIdEndEqual + ") ")));
		}
		if ((this.actualWorkTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK].[ACTUAL_WORK_TIME] = " + this.actualWorkTime) 
						+ ") "));
		}
		if ((this.actualWorkTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[ACTUAL_WORK_TIME] >= " 
						+ (this.actualWorkTimeBegin + ")")));
		}
		if ((this.actualWorkTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[ACTUAL_WORK_TIME] < " 
						+ (this.actualWorkTimeEnd + ") ")));
		}
		if ((this.actualWorkTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[ACTUAL_WORK_TIME] <= " 
						+ (this.actualWorkTimeEndEqual + ") ")));
		}
		if ((this.auditWorkTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK].[AUDIT_WORK_TIME] = " + this.auditWorkTime) 
						+ ") "));
		}
		if ((this.auditWorkTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[AUDIT_WORK_TIME] >= " 
						+ (this.auditWorkTimeBegin + ")")));
		}
		if ((this.auditWorkTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[AUDIT_WORK_TIME] < " 
						+ (this.auditWorkTimeEnd + ") ")));
		}
		if ((this.auditWorkTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[AUDIT_WORK_TIME] <= " 
						+ (this.auditWorkTimeEndEqual + ") ")));
		}
		if ((this.createTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK].[CREATE_TIME] = " + SqlServerUtils.getDateSql(this.createTime)) 
						+ ") "));
		}
		if ((this.createTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[CREATE_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.createTimeBegin) + ")")));
		}
		if ((this.createTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[CREATE_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.createTimeEnd) + ") ")));
		}
		if ((this.createTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[CREATE_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.createTimeEndEqual) + ") ")));
		}
		if ((this.estimateWorkTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK].[ESTIMATE_WORK_TIME] = " + this.estimateWorkTime) 
						+ ") "));
		}
		if ((this.estimateWorkTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[ESTIMATE_WORK_TIME] >= " 
						+ (this.estimateWorkTimeBegin + ")")));
		}
		if ((this.estimateWorkTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[ESTIMATE_WORK_TIME] < " 
						+ (this.estimateWorkTimeEnd + ") ")));
		}
		if ((this.estimateWorkTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[ESTIMATE_WORK_TIME] <= " 
						+ (this.estimateWorkTimeEndEqual + ") ")));
		}
		if ((this.modifyTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK].[MODIFY_TIME] = " + SqlServerUtils.getDateSql(this.modifyTime)) 
						+ ") "));
		}
		if ((this.modifyTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[MODIFY_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.modifyTimeBegin) + ")")));
		}
		if ((this.modifyTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[MODIFY_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.modifyTimeEnd) + ") ")));
		}
		if ((this.modifyTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[MODIFY_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.modifyTimeEndEqual) + ") ")));
		}
		if ((this.orderField == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK].[ORDER_FIELD] = " + SqlServerUtils.getDateSql(this.orderField)) 
						+ ") "));
		}
		if ((this.orderFieldBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[ORDER_FIELD] >= " 
						+ (SqlServerUtils.getDateSql(this.orderFieldBegin) + ")")));
		}
		if ((this.orderFieldEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[ORDER_FIELD] < " 
						+ (SqlServerUtils.getDateSql(this.orderFieldEnd) + ") ")));
		}
		if ((this.orderFieldEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[ORDER_FIELD] < " 
						+ (SqlServerUtils.getNextDateSql(this.orderFieldEndEqual) + ") ")));
		}
		if ((this.taskActualEndDate == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK].[TASK_ACTUAL_END_DATE] = " + SqlServerUtils.getDateSql(this.taskActualEndDate)) 
						+ ") "));
		}
		if ((this.taskActualEndDateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_ACTUAL_END_DATE] >= " 
						+ (SqlServerUtils.getDateSql(this.taskActualEndDateBegin) + ")")));
		}
		if ((this.taskActualEndDateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_ACTUAL_END_DATE] < " 
						+ (SqlServerUtils.getDateSql(this.taskActualEndDateEnd) + ") ")));
		}
		if ((this.taskActualEndDateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_ACTUAL_END_DATE] < " 
						+ (SqlServerUtils.getNextDateSql(this.taskActualEndDateEndEqual) + ") ")));
		}
		if ((this.taskActualStartDate == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK].[TASK_ACTUAL_START_DATE] = " + SqlServerUtils.getDateSql(this.taskActualStartDate)) 
						+ ") "));
		}
		if ((this.taskActualStartDateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_ACTUAL_START_DATE] >= " 
						+ (SqlServerUtils.getDateSql(this.taskActualStartDateBegin) + ")")));
		}
		if ((this.taskActualStartDateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_ACTUAL_START_DATE] < " 
						+ (SqlServerUtils.getDateSql(this.taskActualStartDateEnd) + ") ")));
		}
		if ((this.taskActualStartDateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_ACTUAL_START_DATE] < " 
						+ (SqlServerUtils.getNextDateSql(this.taskActualStartDateEndEqual) + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.taskDesc)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TASK].[TASK_DESC]", this.taskDesc)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.taskDescEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TASK].[TASK_DESC] = " + SqlServerUtils.safeSql(this.taskDescEqual))) 
						+ ") "));
		}
		if ((this.taskLevel == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK].[TASK_LEVEL] = " + this.taskLevel) 
						+ ") "));
		}
		if ((this.taskLevelBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_LEVEL] >= " 
						+ (this.taskLevelBegin + ")")));
		}
		if ((this.taskLevelEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_LEVEL] < " 
						+ (this.taskLevelEnd + ") ")));
		}
		if ((this.taskLevelEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_LEVEL] <= " 
						+ (this.taskLevelEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.taskName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TASK].[TASK_NAME]", this.taskName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.taskNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TASK].[TASK_NAME] = " + SqlServerUtils.safeSql(this.taskNameEqual))) 
						+ ") "));
		}
		if ((this.taskPlanEndDate == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK].[TASK_PLAN_END_DATE] = " + SqlServerUtils.getDateSql(this.taskPlanEndDate)) 
						+ ") "));
		}
		if ((this.taskPlanEndDateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_PLAN_END_DATE] >= " 
						+ (SqlServerUtils.getDateSql(this.taskPlanEndDateBegin) + ")")));
		}
		if ((this.taskPlanEndDateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_PLAN_END_DATE] < " 
						+ (SqlServerUtils.getDateSql(this.taskPlanEndDateEnd) + ") ")));
		}
		if ((this.taskPlanEndDateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_PLAN_END_DATE] < " 
						+ (SqlServerUtils.getNextDateSql(this.taskPlanEndDateEndEqual) + ") ")));
		}
		if ((this.taskPlanStartDate == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK].[TASK_PLAN_START_DATE] = " + SqlServerUtils.getDateSql(this.taskPlanStartDate)) 
						+ ") "));
		}
		if ((this.taskPlanStartDateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_PLAN_START_DATE] >= " 
						+ (SqlServerUtils.getDateSql(this.taskPlanStartDateBegin) + ")")));
		}
		if ((this.taskPlanStartDateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_PLAN_START_DATE] < " 
						+ (SqlServerUtils.getDateSql(this.taskPlanStartDateEnd) + ") ")));
		}
		if ((this.taskPlanStartDateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_PLAN_START_DATE] < " 
						+ (SqlServerUtils.getNextDateSql(this.taskPlanStartDateEndEqual) + ") ")));
		}
		if ((this.taskState == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK].[TASK_STATE] = " + this.taskState) 
						+ ") "));
		}
		if ((this.taskStateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_STATE] >= " 
						+ (this.taskStateBegin + ")")));
		}
		if ((this.taskStateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_STATE] < " 
						+ (this.taskStateEnd + ") ")));
		}
		if ((this.taskStateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_STATE] <= " 
						+ (this.taskStateEndEqual + ") ")));
		}
		if ((this.taskParentId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK].[TASK_PARENT_ID] = " + this.taskParentId) 
						+ ") "));
		}
		if ((this.taskParentIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_PARENT_ID] >= " 
						+ (this.taskParentIdBegin + ")")));
		}
		if ((this.taskParentIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_PARENT_ID] < " 
						+ (this.taskParentIdEnd + ") ")));
		}
		if ((this.taskParentIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_PARENT_ID] <= " 
						+ (this.taskParentIdEndEqual + ") ")));
		}
		if ((this.taskProjectId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK].[TASK_PROJECT_ID] = " + this.taskProjectId) 
						+ ") "));
		}
		if ((this.taskProjectIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_PROJECT_ID] >= " 
						+ (this.taskProjectIdBegin + ")")));
		}
		if ((this.taskProjectIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_PROJECT_ID] < " 
						+ (this.taskProjectIdEnd + ") ")));
		}
		if ((this.taskProjectIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_PROJECT_ID] <= " 
						+ (this.taskProjectIdEndEqual + ") ")));
		}
		if ((this.taskCreaterId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK].[TASK_CREATER_ID] = " + this.taskCreaterId) 
						+ ") "));
		}
		if ((this.taskCreaterIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_CREATER_ID] >= " 
						+ (this.taskCreaterIdBegin + ")")));
		}
		if ((this.taskCreaterIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_CREATER_ID] < " 
						+ (this.taskCreaterIdEnd + ") ")));
		}
		if ((this.taskCreaterIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_CREATER_ID] <= " 
						+ (this.taskCreaterIdEndEqual + ") ")));
		}
		if ((this.taskManagerId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK].[TASK_MANAGER_ID] = " + this.taskManagerId) 
						+ ") "));
		}
		if ((this.taskManagerIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_MANAGER_ID] >= " 
						+ (this.taskManagerIdBegin + ")")));
		}
		if ((this.taskManagerIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_MANAGER_ID] < " 
						+ (this.taskManagerIdEnd + ") ")));
		}
		if ((this.taskManagerIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_MANAGER_ID] <= " 
						+ (this.taskManagerIdEndEqual + ") ")));
		}
		if ((this.taskModifierId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK].[TASK_MODIFIER_ID] = " + this.taskModifierId) 
						+ ") "));
		}
		if ((this.taskModifierIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_MODIFIER_ID] >= " 
						+ (this.taskModifierIdBegin + ")")));
		}
		if ((this.taskModifierIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_MODIFIER_ID] < " 
						+ (this.taskModifierIdEnd + ") ")));
		}
		if ((this.taskModifierIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_MODIFIER_ID] <= " 
						+ (this.taskModifierIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.taskOutline)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TASK].[TASK_OUTLINE]", this.taskOutline)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.taskOutlineEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TASK].[TASK_OUTLINE] = " + SqlServerUtils.safeSql(this.taskOutlineEqual))) 
						+ ") "));
		}
		if ((this.taskComplete == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TASK].[TASK_COMPLETE] = " + this.taskComplete) 
						+ ") "));
		}
		if ((this.taskCompleteBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_COMPLETE] >= " 
						+ (this.taskCompleteBegin + ")")));
		}
		if ((this.taskCompleteEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_COMPLETE] < " 
						+ (this.taskCompleteEnd + ") ")));
		}
		if ((this.taskCompleteEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TASK].[TASK_COMPLETE] <= " 
						+ (this.taskCompleteEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
