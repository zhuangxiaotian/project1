package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_LEAVE查询条件定义
 */
public class LeaveQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	String workFlowId;
	
	/**
	 * 查询条件字符串相等,WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	String workFlowIdEqual;
	
	/**
	 * 查询条件,REQUEST_USER_ID: 申请人
	 */
	Integer requestUserId;
	
	/**
	 * 查询条件开始值,REQUEST_USER_ID: 申请人
	 */
	Integer requestUserIdBegin;
	
	/**
	 * 查询条件结束值,REQUEST_USER_ID: 申请人
	 */
	Integer requestUserIdEnd;
	
	/**
	 * 查询条件结束值,REQUEST_USER_ID: 申请人
	 */
	Integer requestUserIdEndEqual;
	
	/**
	 * 查询条件,AUDIT_USER_ID: 最后审核人
	 */
	Integer auditUserId;
	
	/**
	 * 查询条件开始值,AUDIT_USER_ID: 最后审核人
	 */
	Integer auditUserIdBegin;
	
	/**
	 * 查询条件结束值,AUDIT_USER_ID: 最后审核人
	 */
	Integer auditUserIdEnd;
	
	/**
	 * 查询条件结束值,AUDIT_USER_ID: 最后审核人
	 */
	Integer auditUserIdEndEqual;
	
	/**
	 * 查询条件,LEAVE_TYPE: 请假类型
	 *   0：病假
	 *   1：事假
	 *   2：丧假
	 *   3：婚假
	 */
	Integer leaveType;
	
	/**
	 * 查询条件开始值,LEAVE_TYPE: 请假类型
	 *   0：病假
	 *   1：事假
	 *   2：丧假
	 *   3：婚假
	 */
	Integer leaveTypeBegin;
	
	/**
	 * 查询条件结束值,LEAVE_TYPE: 请假类型
	 *   0：病假
	 *   1：事假
	 *   2：丧假
	 *   3：婚假
	 */
	Integer leaveTypeEnd;
	
	/**
	 * 查询条件结束值,LEAVE_TYPE: 请假类型
	 *   0：病假
	 *   1：事假
	 *   2：丧假
	 *   3：婚假
	 */
	Integer leaveTypeEndEqual;
	
	/**
	 * 查询条件,LEAVE_REASON: 请假理由
	 */
	String leaveReason;
	
	/**
	 * 查询条件字符串相等,LEAVE_REASON: 请假理由
	 */
	String leaveReasonEqual;
	
	/**
	 * 查询条件,LEAVE_STATE: 请假状态 0 申请中 1 通过 2 拒绝 3 用户取消
	 */
	Byte leaveState;
	
	/**
	 * 查询条件开始值,LEAVE_STATE: 请假状态 0 申请中 1 通过 2 拒绝 3 用户取消
	 */
	Byte leaveStateBegin;
	
	/**
	 * 查询条件结束值,LEAVE_STATE: 请假状态 0 申请中 1 通过 2 拒绝 3 用户取消
	 */
	Byte leaveStateEnd;
	
	/**
	 * 查询条件结束值,LEAVE_STATE: 请假状态 0 申请中 1 通过 2 拒绝 3 用户取消
	 */
	Byte leaveStateEndEqual;
	
	/**
	 * 查询条件,LEAVE_MEMO: 当前备注
	 */
	String leaveMemo;
	
	/**
	 * 查询条件字符串相等,LEAVE_MEMO: 当前备注
	 */
	String leaveMemoEqual;
	
	/**
	 * 查询条件,LEAVE_START_TIME: 开始请假时间
	 */
	java.util.Date leaveStartTime;
	
	/**
	 * 查询条件开始值,LEAVE_START_TIME: 开始请假时间
	 */
	java.util.Date leaveStartTimeBegin;
	
	/**
	 * 查询条件结束值,LEAVE_START_TIME: 开始请假时间
	 */
	java.util.Date leaveStartTimeEnd;
	
	/**
	 * 查询条件结束值,LEAVE_START_TIME: 开始请假时间
	 */
	java.util.Date leaveStartTimeEndEqual;
	
	/**
	 * 查询条件,LEAVE_END_TIME: 结束请假时间
	 */
	java.util.Date leaveEndTime;
	
	/**
	 * 查询条件开始值,LEAVE_END_TIME: 结束请假时间
	 */
	java.util.Date leaveEndTimeBegin;
	
	/**
	 * 查询条件结束值,LEAVE_END_TIME: 结束请假时间
	 */
	java.util.Date leaveEndTimeEnd;
	
	/**
	 * 查询条件结束值,LEAVE_END_TIME: 结束请假时间
	 */
	java.util.Date leaveEndTimeEndEqual;
	
	/**
	 * WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	public String getWorkFlowId() {
		return this.workFlowId;
	}
	
	/**
	 * WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	public void setWorkFlowId(String value)
	 {
		this.workFlowId = value;
	}
	
	/**
	 * 查询条件字符串相等,WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	public String getWorkFlowIdEqual() {
		return this.workFlowIdEqual;
	}
	
	/**
	 * 查询条件字符串相等,WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	public void setWorkFlowIdEqual(String value)
	 {
		this.workFlowIdEqual = value;
	}
	
	/**
	 * REQUEST_USER_ID: 申请人
	 */
	public Integer getRequestUserId() {
		return this.requestUserId;
	}
	
	/**
	 * REQUEST_USER_ID: 申请人
	 */
	public void setRequestUserId(Integer value)
	 {
		this.requestUserId = value;
	}
	
	/**
	 * 查询条件开始值,REQUEST_USER_ID: 申请人
	 */
	public Integer getRequestUserIdBegin() {
		return this.requestUserIdBegin;
	}
	
	/**
	 * 查询条件开始值,REQUEST_USER_ID: 申请人
	 */
	public void setRequestUserIdBegin(Integer value)
	 {
		this.requestUserIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,REQUEST_USER_ID: 申请人
	 */
	public Integer getRequestUserIdEnd() {
		return this.requestUserIdEnd;
	}
	
	/**
	 * 查询条件结束值,REQUEST_USER_ID: 申请人
	 */
	public void setRequestUserIdEnd(Integer value)
	 {
		this.requestUserIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,REQUEST_USER_ID: 申请人
	 */
	public Integer getRequestUserIdEndEqual() {
		return this.requestUserIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,REQUEST_USER_ID: 申请人
	 */
	public void setRequestUserIdEndEqual(Integer value)
	 {
		this.requestUserIdEndEqual = value;
	}
	
	/**
	 * AUDIT_USER_ID: 最后审核人
	 */
	public Integer getAuditUserId() {
		return this.auditUserId;
	}
	
	/**
	 * AUDIT_USER_ID: 最后审核人
	 */
	public void setAuditUserId(Integer value)
	 {
		this.auditUserId = value;
	}
	
	/**
	 * 查询条件开始值,AUDIT_USER_ID: 最后审核人
	 */
	public Integer getAuditUserIdBegin() {
		return this.auditUserIdBegin;
	}
	
	/**
	 * 查询条件开始值,AUDIT_USER_ID: 最后审核人
	 */
	public void setAuditUserIdBegin(Integer value)
	 {
		this.auditUserIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,AUDIT_USER_ID: 最后审核人
	 */
	public Integer getAuditUserIdEnd() {
		return this.auditUserIdEnd;
	}
	
	/**
	 * 查询条件结束值,AUDIT_USER_ID: 最后审核人
	 */
	public void setAuditUserIdEnd(Integer value)
	 {
		this.auditUserIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,AUDIT_USER_ID: 最后审核人
	 */
	public Integer getAuditUserIdEndEqual() {
		return this.auditUserIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,AUDIT_USER_ID: 最后审核人
	 */
	public void setAuditUserIdEndEqual(Integer value)
	 {
		this.auditUserIdEndEqual = value;
	}
	
	/**
	 * LEAVE_TYPE: 请假类型
	 *   0：病假
	 *   1：事假
	 *   2：丧假
	 *   3：婚假
	 */
	public Integer getLeaveType() {
		return this.leaveType;
	}
	
	/**
	 * LEAVE_TYPE: 请假类型
	 *   0：病假
	 *   1：事假
	 *   2：丧假
	 *   3：婚假
	 */
	public void setLeaveType(Integer value)
	 {
		this.leaveType = value;
	}
	
	/**
	 * 查询条件开始值,LEAVE_TYPE: 请假类型
	 *   0：病假
	 *   1：事假
	 *   2：丧假
	 *   3：婚假
	 */
	public Integer getLeaveTypeBegin() {
		return this.leaveTypeBegin;
	}
	
	/**
	 * 查询条件开始值,LEAVE_TYPE: 请假类型
	 *   0：病假
	 *   1：事假
	 *   2：丧假
	 *   3：婚假
	 */
	public void setLeaveTypeBegin(Integer value)
	 {
		this.leaveTypeBegin = value;
	}
	
	/**
	 * 查询条件结束值,LEAVE_TYPE: 请假类型
	 *   0：病假
	 *   1：事假
	 *   2：丧假
	 *   3：婚假
	 */
	public Integer getLeaveTypeEnd() {
		return this.leaveTypeEnd;
	}
	
	/**
	 * 查询条件结束值,LEAVE_TYPE: 请假类型
	 *   0：病假
	 *   1：事假
	 *   2：丧假
	 *   3：婚假
	 */
	public void setLeaveTypeEnd(Integer value)
	 {
		this.leaveTypeEnd = value;
	}
	
	/**
	 * 查询条件结束值,LEAVE_TYPE: 请假类型
	 *   0：病假
	 *   1：事假
	 *   2：丧假
	 *   3：婚假
	 */
	public Integer getLeaveTypeEndEqual() {
		return this.leaveTypeEndEqual;
	}
	
	/**
	 * 查询条件结束值,LEAVE_TYPE: 请假类型
	 *   0：病假
	 *   1：事假
	 *   2：丧假
	 *   3：婚假
	 */
	public void setLeaveTypeEndEqual(Integer value)
	 {
		this.leaveTypeEndEqual = value;
	}
	
	/**
	 * LEAVE_REASON: 请假理由
	 */
	public String getLeaveReason() {
		return this.leaveReason;
	}
	
	/**
	 * LEAVE_REASON: 请假理由
	 */
	public void setLeaveReason(String value)
	 {
		this.leaveReason = value;
	}
	
	/**
	 * 查询条件字符串相等,LEAVE_REASON: 请假理由
	 */
	public String getLeaveReasonEqual() {
		return this.leaveReasonEqual;
	}
	
	/**
	 * 查询条件字符串相等,LEAVE_REASON: 请假理由
	 */
	public void setLeaveReasonEqual(String value)
	 {
		this.leaveReasonEqual = value;
	}
	
	/**
	 * LEAVE_STATE: 请假状态 0 申请中 1 通过 2 拒绝 3 用户取消
	 */
	public Byte getLeaveState() {
		return this.leaveState;
	}
	
	/**
	 * LEAVE_STATE: 请假状态 0 申请中 1 通过 2 拒绝 3 用户取消
	 */
	public void setLeaveState(Byte value)
	 {
		this.leaveState = value;
	}
	
	/**
	 * 查询条件开始值,LEAVE_STATE: 请假状态 0 申请中 1 通过 2 拒绝 3 用户取消
	 */
	public Byte getLeaveStateBegin() {
		return this.leaveStateBegin;
	}
	
	/**
	 * 查询条件开始值,LEAVE_STATE: 请假状态 0 申请中 1 通过 2 拒绝 3 用户取消
	 */
	public void setLeaveStateBegin(Byte value)
	 {
		this.leaveStateBegin = value;
	}
	
	/**
	 * 查询条件结束值,LEAVE_STATE: 请假状态 0 申请中 1 通过 2 拒绝 3 用户取消
	 */
	public Byte getLeaveStateEnd() {
		return this.leaveStateEnd;
	}
	
	/**
	 * 查询条件结束值,LEAVE_STATE: 请假状态 0 申请中 1 通过 2 拒绝 3 用户取消
	 */
	public void setLeaveStateEnd(Byte value)
	 {
		this.leaveStateEnd = value;
	}
	
	/**
	 * 查询条件结束值,LEAVE_STATE: 请假状态 0 申请中 1 通过 2 拒绝 3 用户取消
	 */
	public Byte getLeaveStateEndEqual() {
		return this.leaveStateEndEqual;
	}
	
	/**
	 * 查询条件结束值,LEAVE_STATE: 请假状态 0 申请中 1 通过 2 拒绝 3 用户取消
	 */
	public void setLeaveStateEndEqual(Byte value)
	 {
		this.leaveStateEndEqual = value;
	}
	
	/**
	 * LEAVE_MEMO: 当前备注
	 */
	public String getLeaveMemo() {
		return this.leaveMemo;
	}
	
	/**
	 * LEAVE_MEMO: 当前备注
	 */
	public void setLeaveMemo(String value)
	 {
		this.leaveMemo = value;
	}
	
	/**
	 * 查询条件字符串相等,LEAVE_MEMO: 当前备注
	 */
	public String getLeaveMemoEqual() {
		return this.leaveMemoEqual;
	}
	
	/**
	 * 查询条件字符串相等,LEAVE_MEMO: 当前备注
	 */
	public void setLeaveMemoEqual(String value)
	 {
		this.leaveMemoEqual = value;
	}
	
	/**
	 * LEAVE_START_TIME: 开始请假时间
	 */
	public java.util.Date getLeaveStartTime() {
		return this.leaveStartTime;
	}
	
	/**
	 * LEAVE_START_TIME: 开始请假时间
	 */
	public void setLeaveStartTime(java.util.Date value)
	 {
		this.leaveStartTime = value;
	}
	
	/**
	 * 查询条件开始值,LEAVE_START_TIME: 开始请假时间
	 */
	public java.util.Date getLeaveStartTimeBegin() {
		return this.leaveStartTimeBegin;
	}
	
	/**
	 * 查询条件开始值,LEAVE_START_TIME: 开始请假时间
	 */
	public void setLeaveStartTimeBegin(java.util.Date value)
	 {
		this.leaveStartTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,LEAVE_START_TIME: 开始请假时间
	 */
	public java.util.Date getLeaveStartTimeEnd() {
		return this.leaveStartTimeEnd;
	}
	
	/**
	 * 查询条件结束值,LEAVE_START_TIME: 开始请假时间
	 */
	public void setLeaveStartTimeEnd(java.util.Date value)
	 {
		this.leaveStartTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,LEAVE_START_TIME: 开始请假时间
	 */
	public java.util.Date getLeaveStartTimeEndEqual() {
		return this.leaveStartTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,LEAVE_START_TIME: 开始请假时间
	 */
	public void setLeaveStartTimeEndEqual(java.util.Date value)
	 {
		this.leaveStartTimeEndEqual = value;
	}
	
	/**
	 * LEAVE_END_TIME: 结束请假时间
	 */
	public java.util.Date getLeaveEndTime() {
		return this.leaveEndTime;
	}
	
	/**
	 * LEAVE_END_TIME: 结束请假时间
	 */
	public void setLeaveEndTime(java.util.Date value)
	 {
		this.leaveEndTime = value;
	}
	
	/**
	 * 查询条件开始值,LEAVE_END_TIME: 结束请假时间
	 */
	public java.util.Date getLeaveEndTimeBegin() {
		return this.leaveEndTimeBegin;
	}
	
	/**
	 * 查询条件开始值,LEAVE_END_TIME: 结束请假时间
	 */
	public void setLeaveEndTimeBegin(java.util.Date value)
	 {
		this.leaveEndTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,LEAVE_END_TIME: 结束请假时间
	 */
	public java.util.Date getLeaveEndTimeEnd() {
		return this.leaveEndTimeEnd;
	}
	
	/**
	 * 查询条件结束值,LEAVE_END_TIME: 结束请假时间
	 */
	public void setLeaveEndTimeEnd(java.util.Date value)
	 {
		this.leaveEndTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,LEAVE_END_TIME: 结束请假时间
	 */
	public java.util.Date getLeaveEndTimeEndEqual() {
		return this.leaveEndTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,LEAVE_END_TIME: 结束请假时间
	 */
	public void setLeaveEndTimeEndEqual(java.util.Date value)
	 {
		this.leaveEndTimeEndEqual = value;
	}
	
	/**
	 * 设置查询条件WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	public LeaveQueryCondition setWorkFlowIdCondition(String value) {
		this.workFlowId = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	public LeaveQueryCondition setWorkFlowIdConditionEqual(String value) {
		this.workFlowIdEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件REQUEST_USER_ID: 申请人
	 */
	public LeaveQueryCondition setRequestUserIdCondition(Integer value) {
		this.requestUserId = value;
		return this;
	}
	
	/**
	 * 设置查询条件REQUEST_USER_ID: 申请人
	 */
	public LeaveQueryCondition setRequestUserIdConditionBegin(Integer value) {
		this.requestUserIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件REQUEST_USER_ID: 申请人
	 */
	public LeaveQueryCondition setRequestUserIdConditionEnd(Integer value) {
		this.requestUserIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件REQUEST_USER_ID: 申请人
	 */
	public LeaveQueryCondition setRequestUserIdConditionEndEqual(Integer value) {
		this.requestUserIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件AUDIT_USER_ID: 最后审核人
	 */
	public LeaveQueryCondition setAuditUserIdCondition(Integer value) {
		this.auditUserId = value;
		return this;
	}
	
	/**
	 * 设置查询条件AUDIT_USER_ID: 最后审核人
	 */
	public LeaveQueryCondition setAuditUserIdConditionBegin(Integer value) {
		this.auditUserIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件AUDIT_USER_ID: 最后审核人
	 */
	public LeaveQueryCondition setAuditUserIdConditionEnd(Integer value) {
		this.auditUserIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件AUDIT_USER_ID: 最后审核人
	 */
	public LeaveQueryCondition setAuditUserIdConditionEndEqual(Integer value) {
		this.auditUserIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件LEAVE_TYPE: 请假类型
	 *   0：病假
	 *   1：事假
	 *   2：丧假
	 *   3：婚假
	 */
	public LeaveQueryCondition setLeaveTypeCondition(Integer value) {
		this.leaveType = value;
		return this;
	}
	
	/**
	 * 设置查询条件LEAVE_TYPE: 请假类型
	 *   0：病假
	 *   1：事假
	 *   2：丧假
	 *   3：婚假
	 */
	public LeaveQueryCondition setLeaveTypeConditionBegin(Integer value) {
		this.leaveTypeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件LEAVE_TYPE: 请假类型
	 *   0：病假
	 *   1：事假
	 *   2：丧假
	 *   3：婚假
	 */
	public LeaveQueryCondition setLeaveTypeConditionEnd(Integer value) {
		this.leaveTypeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件LEAVE_TYPE: 请假类型
	 *   0：病假
	 *   1：事假
	 *   2：丧假
	 *   3：婚假
	 */
	public LeaveQueryCondition setLeaveTypeConditionEndEqual(Integer value) {
		this.leaveTypeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件LEAVE_REASON: 请假理由
	 */
	public LeaveQueryCondition setLeaveReasonCondition(String value) {
		this.leaveReason = value;
		return this;
	}
	
	/**
	 * 设置查询条件LEAVE_REASON: 请假理由
	 */
	public LeaveQueryCondition setLeaveReasonConditionEqual(String value) {
		this.leaveReasonEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件LEAVE_STATE: 请假状态 0 申请中 1 通过 2 拒绝 3 用户取消
	 */
	public LeaveQueryCondition setLeaveStateCondition(Byte value) {
		this.leaveState = value;
		return this;
	}
	
	/**
	 * 设置查询条件LEAVE_STATE: 请假状态 0 申请中 1 通过 2 拒绝 3 用户取消
	 */
	public LeaveQueryCondition setLeaveStateConditionBegin(Byte value) {
		this.leaveStateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件LEAVE_STATE: 请假状态 0 申请中 1 通过 2 拒绝 3 用户取消
	 */
	public LeaveQueryCondition setLeaveStateConditionEnd(Byte value) {
		this.leaveStateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件LEAVE_STATE: 请假状态 0 申请中 1 通过 2 拒绝 3 用户取消
	 */
	public LeaveQueryCondition setLeaveStateConditionEndEqual(Byte value) {
		this.leaveStateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件LEAVE_MEMO: 当前备注
	 */
	public LeaveQueryCondition setLeaveMemoCondition(String value) {
		this.leaveMemo = value;
		return this;
	}
	
	/**
	 * 设置查询条件LEAVE_MEMO: 当前备注
	 */
	public LeaveQueryCondition setLeaveMemoConditionEqual(String value) {
		this.leaveMemoEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件LEAVE_START_TIME: 开始请假时间
	 */
	public LeaveQueryCondition setLeaveStartTimeCondition(java.util.Date value) {
		this.leaveStartTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件LEAVE_START_TIME: 开始请假时间
	 */
	public LeaveQueryCondition setLeaveStartTimeConditionBegin(java.util.Date value) {
		this.leaveStartTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件LEAVE_START_TIME: 开始请假时间
	 */
	public LeaveQueryCondition setLeaveStartTimeConditionEnd(java.util.Date value) {
		this.leaveStartTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件LEAVE_START_TIME: 开始请假时间
	 */
	public LeaveQueryCondition setLeaveStartTimeConditionEndEqual(java.util.Date value) {
		this.leaveStartTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件LEAVE_END_TIME: 结束请假时间
	 */
	public LeaveQueryCondition setLeaveEndTimeCondition(java.util.Date value) {
		this.leaveEndTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件LEAVE_END_TIME: 结束请假时间
	 */
	public LeaveQueryCondition setLeaveEndTimeConditionBegin(java.util.Date value) {
		this.leaveEndTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件LEAVE_END_TIME: 结束请假时间
	 */
	public LeaveQueryCondition setLeaveEndTimeConditionEnd(java.util.Date value) {
		this.leaveEndTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件LEAVE_END_TIME: 结束请假时间
	 */
	public LeaveQueryCondition setLeaveEndTimeConditionEndEqual(java.util.Date value) {
		this.leaveEndTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if (StringUtils.isNullOrEmpty(this.workFlowId)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_LEAVE].[WORK_FLOW_ID]", this.workFlowId)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.workFlowIdEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_LEAVE].[WORK_FLOW_ID] = " + SqlServerUtils.safeSql(this.workFlowIdEqual))) 
						+ ") "));
		}
		if ((this.requestUserId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_LEAVE].[REQUEST_USER_ID] = " + this.requestUserId) 
						+ ") "));
		}
		if ((this.requestUserIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_LEAVE].[REQUEST_USER_ID] >= " 
						+ (this.requestUserIdBegin + ")")));
		}
		if ((this.requestUserIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_LEAVE].[REQUEST_USER_ID] < " 
						+ (this.requestUserIdEnd + ") ")));
		}
		if ((this.requestUserIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_LEAVE].[REQUEST_USER_ID] <= " 
						+ (this.requestUserIdEndEqual + ") ")));
		}
		if ((this.auditUserId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_LEAVE].[AUDIT_USER_ID] = " + this.auditUserId) 
						+ ") "));
		}
		if ((this.auditUserIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_LEAVE].[AUDIT_USER_ID] >= " 
						+ (this.auditUserIdBegin + ")")));
		}
		if ((this.auditUserIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_LEAVE].[AUDIT_USER_ID] < " 
						+ (this.auditUserIdEnd + ") ")));
		}
		if ((this.auditUserIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_LEAVE].[AUDIT_USER_ID] <= " 
						+ (this.auditUserIdEndEqual + ") ")));
		}
		if ((this.leaveType == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_LEAVE].[LEAVE_TYPE] = " + this.leaveType) 
						+ ") "));
		}
		if ((this.leaveTypeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_LEAVE].[LEAVE_TYPE] >= " 
						+ (this.leaveTypeBegin + ")")));
		}
		if ((this.leaveTypeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_LEAVE].[LEAVE_TYPE] < " 
						+ (this.leaveTypeEnd + ") ")));
		}
		if ((this.leaveTypeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_LEAVE].[LEAVE_TYPE] <= " 
						+ (this.leaveTypeEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.leaveReason)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_LEAVE].[LEAVE_REASON]", this.leaveReason)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.leaveReasonEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_LEAVE].[LEAVE_REASON] = " + SqlServerUtils.safeSql(this.leaveReasonEqual))) 
						+ ") "));
		}
		if ((this.leaveState == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_LEAVE].[LEAVE_STATE] = " + this.leaveState) 
						+ ") "));
		}
		if ((this.leaveStateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_LEAVE].[LEAVE_STATE] >= " 
						+ (this.leaveStateBegin + ")")));
		}
		if ((this.leaveStateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_LEAVE].[LEAVE_STATE] < " 
						+ (this.leaveStateEnd + ") ")));
		}
		if ((this.leaveStateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_LEAVE].[LEAVE_STATE] <= " 
						+ (this.leaveStateEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.leaveMemo)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_LEAVE].[LEAVE_MEMO]", this.leaveMemo)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.leaveMemoEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_LEAVE].[LEAVE_MEMO] = " + SqlServerUtils.safeSql(this.leaveMemoEqual))) 
						+ ") "));
		}
		if ((this.leaveStartTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_LEAVE].[LEAVE_START_TIME] = " + SqlServerUtils.getDateSql(this.leaveStartTime)) 
						+ ") "));
		}
		if ((this.leaveStartTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_LEAVE].[LEAVE_START_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.leaveStartTimeBegin) + ")")));
		}
		if ((this.leaveStartTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_LEAVE].[LEAVE_START_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.leaveStartTimeEnd) + ") ")));
		}
		if ((this.leaveStartTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_LEAVE].[LEAVE_START_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.leaveStartTimeEndEqual) + ") ")));
		}
		if ((this.leaveEndTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_LEAVE].[LEAVE_END_TIME] = " + SqlServerUtils.getDateSql(this.leaveEndTime)) 
						+ ") "));
		}
		if ((this.leaveEndTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_LEAVE].[LEAVE_END_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.leaveEndTimeBegin) + ")")));
		}
		if ((this.leaveEndTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_LEAVE].[LEAVE_END_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.leaveEndTimeEnd) + ") ")));
		}
		if ((this.leaveEndTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_LEAVE].[LEAVE_END_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.leaveEndTimeEndEqual) + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
