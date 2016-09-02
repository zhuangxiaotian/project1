package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_HIST_TASK查询条件定义
 */
public class Jbpm4HistTaskQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,DBID_: 
	 */
	Double dbid;
	
	/**
	 * 查询条件开始值,DBID_: 
	 */
	Double dbidBegin;
	
	/**
	 * 查询条件结束值,DBID_: 
	 */
	Double dbidEnd;
	
	/**
	 * 查询条件结束值,DBID_: 
	 */
	Double dbidEndEqual;
	
	/**
	 * 查询条件,DBVERSION_: 
	 */
	Integer dbversion;
	
	/**
	 * 查询条件开始值,DBVERSION_: 
	 */
	Integer dbversionBegin;
	
	/**
	 * 查询条件结束值,DBVERSION_: 
	 */
	Integer dbversionEnd;
	
	/**
	 * 查询条件结束值,DBVERSION_: 
	 */
	Integer dbversionEndEqual;
	
	/**
	 * 查询条件,EXECUTION_: 
	 */
	String execution;
	
	/**
	 * 查询条件字符串相等,EXECUTION_: 
	 */
	String executionEqual;
	
	/**
	 * 查询条件,OUTCOME_: 
	 */
	String outcome;
	
	/**
	 * 查询条件字符串相等,OUTCOME_: 
	 */
	String outcomeEqual;
	
	/**
	 * 查询条件,ASSIGNEE_: 
	 */
	String assignee;
	
	/**
	 * 查询条件字符串相等,ASSIGNEE_: 
	 */
	String assigneeEqual;
	
	/**
	 * 查询条件,PRIORITY_: 
	 */
	Integer priority;
	
	/**
	 * 查询条件开始值,PRIORITY_: 
	 */
	Integer priorityBegin;
	
	/**
	 * 查询条件结束值,PRIORITY_: 
	 */
	Integer priorityEnd;
	
	/**
	 * 查询条件结束值,PRIORITY_: 
	 */
	Integer priorityEndEqual;
	
	/**
	 * 查询条件,STATE_: 
	 */
	String state;
	
	/**
	 * 查询条件字符串相等,STATE_: 
	 */
	String stateEqual;
	
	/**
	 * 查询条件,CREATE_: 
	 */
	java.util.Date create;
	
	/**
	 * 查询条件开始值,CREATE_: 
	 */
	java.util.Date createBegin;
	
	/**
	 * 查询条件结束值,CREATE_: 
	 */
	java.util.Date createEnd;
	
	/**
	 * 查询条件结束值,CREATE_: 
	 */
	java.util.Date createEndEqual;
	
	/**
	 * 查询条件,END_: 
	 */
	java.util.Date end;
	
	/**
	 * 查询条件开始值,END_: 
	 */
	java.util.Date endBegin;
	
	/**
	 * 查询条件结束值,END_: 
	 */
	java.util.Date endEnd;
	
	/**
	 * 查询条件结束值,END_: 
	 */
	java.util.Date endEndEqual;
	
	/**
	 * 查询条件,DURATION_: 
	 */
	Double duration;
	
	/**
	 * 查询条件开始值,DURATION_: 
	 */
	Double durationBegin;
	
	/**
	 * 查询条件结束值,DURATION_: 
	 */
	Double durationEnd;
	
	/**
	 * 查询条件结束值,DURATION_: 
	 */
	Double durationEndEqual;
	
	/**
	 * 查询条件,NEXTIDX_: 
	 */
	Integer nextidx;
	
	/**
	 * 查询条件开始值,NEXTIDX_: 
	 */
	Integer nextidxBegin;
	
	/**
	 * 查询条件结束值,NEXTIDX_: 
	 */
	Integer nextidxEnd;
	
	/**
	 * 查询条件结束值,NEXTIDX_: 
	 */
	Integer nextidxEndEqual;
	
	/**
	 * 查询条件,SUPERTASK_: 
	 */
	Double supertask;
	
	/**
	 * 查询条件开始值,SUPERTASK_: 
	 */
	Double supertaskBegin;
	
	/**
	 * 查询条件结束值,SUPERTASK_: 
	 */
	Double supertaskEnd;
	
	/**
	 * 查询条件结束值,SUPERTASK_: 
	 */
	Double supertaskEndEqual;
	
	/**
	 * DBID_: 
	 */
	public Double getDbid() {
		return this.dbid;
	}
	
	/**
	 * DBID_: 
	 */
	public void setDbid(Double value)
	 {
		this.dbid = value;
	}
	
	/**
	 * 查询条件开始值,DBID_: 
	 */
	public Double getDbidBegin() {
		return this.dbidBegin;
	}
	
	/**
	 * 查询条件开始值,DBID_: 
	 */
	public void setDbidBegin(Double value)
	 {
		this.dbidBegin = value;
	}
	
	/**
	 * 查询条件结束值,DBID_: 
	 */
	public Double getDbidEnd() {
		return this.dbidEnd;
	}
	
	/**
	 * 查询条件结束值,DBID_: 
	 */
	public void setDbidEnd(Double value)
	 {
		this.dbidEnd = value;
	}
	
	/**
	 * 查询条件结束值,DBID_: 
	 */
	public Double getDbidEndEqual() {
		return this.dbidEndEqual;
	}
	
	/**
	 * 查询条件结束值,DBID_: 
	 */
	public void setDbidEndEqual(Double value)
	 {
		this.dbidEndEqual = value;
	}
	
	/**
	 * DBVERSION_: 
	 */
	public Integer getDbversion() {
		return this.dbversion;
	}
	
	/**
	 * DBVERSION_: 
	 */
	public void setDbversion(Integer value)
	 {
		this.dbversion = value;
	}
	
	/**
	 * 查询条件开始值,DBVERSION_: 
	 */
	public Integer getDbversionBegin() {
		return this.dbversionBegin;
	}
	
	/**
	 * 查询条件开始值,DBVERSION_: 
	 */
	public void setDbversionBegin(Integer value)
	 {
		this.dbversionBegin = value;
	}
	
	/**
	 * 查询条件结束值,DBVERSION_: 
	 */
	public Integer getDbversionEnd() {
		return this.dbversionEnd;
	}
	
	/**
	 * 查询条件结束值,DBVERSION_: 
	 */
	public void setDbversionEnd(Integer value)
	 {
		this.dbversionEnd = value;
	}
	
	/**
	 * 查询条件结束值,DBVERSION_: 
	 */
	public Integer getDbversionEndEqual() {
		return this.dbversionEndEqual;
	}
	
	/**
	 * 查询条件结束值,DBVERSION_: 
	 */
	public void setDbversionEndEqual(Integer value)
	 {
		this.dbversionEndEqual = value;
	}
	
	/**
	 * EXECUTION_: 
	 */
	public String getExecution() {
		return this.execution;
	}
	
	/**
	 * EXECUTION_: 
	 */
	public void setExecution(String value)
	 {
		this.execution = value;
	}
	
	/**
	 * 查询条件字符串相等,EXECUTION_: 
	 */
	public String getExecutionEqual() {
		return this.executionEqual;
	}
	
	/**
	 * 查询条件字符串相等,EXECUTION_: 
	 */
	public void setExecutionEqual(String value)
	 {
		this.executionEqual = value;
	}
	
	/**
	 * OUTCOME_: 
	 */
	public String getOutcome() {
		return this.outcome;
	}
	
	/**
	 * OUTCOME_: 
	 */
	public void setOutcome(String value)
	 {
		this.outcome = value;
	}
	
	/**
	 * 查询条件字符串相等,OUTCOME_: 
	 */
	public String getOutcomeEqual() {
		return this.outcomeEqual;
	}
	
	/**
	 * 查询条件字符串相等,OUTCOME_: 
	 */
	public void setOutcomeEqual(String value)
	 {
		this.outcomeEqual = value;
	}
	
	/**
	 * ASSIGNEE_: 
	 */
	public String getAssignee() {
		return this.assignee;
	}
	
	/**
	 * ASSIGNEE_: 
	 */
	public void setAssignee(String value)
	 {
		this.assignee = value;
	}
	
	/**
	 * 查询条件字符串相等,ASSIGNEE_: 
	 */
	public String getAssigneeEqual() {
		return this.assigneeEqual;
	}
	
	/**
	 * 查询条件字符串相等,ASSIGNEE_: 
	 */
	public void setAssigneeEqual(String value)
	 {
		this.assigneeEqual = value;
	}
	
	/**
	 * PRIORITY_: 
	 */
	public Integer getPriority() {
		return this.priority;
	}
	
	/**
	 * PRIORITY_: 
	 */
	public void setPriority(Integer value)
	 {
		this.priority = value;
	}
	
	/**
	 * 查询条件开始值,PRIORITY_: 
	 */
	public Integer getPriorityBegin() {
		return this.priorityBegin;
	}
	
	/**
	 * 查询条件开始值,PRIORITY_: 
	 */
	public void setPriorityBegin(Integer value)
	 {
		this.priorityBegin = value;
	}
	
	/**
	 * 查询条件结束值,PRIORITY_: 
	 */
	public Integer getPriorityEnd() {
		return this.priorityEnd;
	}
	
	/**
	 * 查询条件结束值,PRIORITY_: 
	 */
	public void setPriorityEnd(Integer value)
	 {
		this.priorityEnd = value;
	}
	
	/**
	 * 查询条件结束值,PRIORITY_: 
	 */
	public Integer getPriorityEndEqual() {
		return this.priorityEndEqual;
	}
	
	/**
	 * 查询条件结束值,PRIORITY_: 
	 */
	public void setPriorityEndEqual(Integer value)
	 {
		this.priorityEndEqual = value;
	}
	
	/**
	 * STATE_: 
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * STATE_: 
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
	
	/**
	 * 查询条件字符串相等,STATE_: 
	 */
	public String getStateEqual() {
		return this.stateEqual;
	}
	
	/**
	 * 查询条件字符串相等,STATE_: 
	 */
	public void setStateEqual(String value)
	 {
		this.stateEqual = value;
	}
	
	/**
	 * CREATE_: 
	 */
	public java.util.Date getCreate() {
		return this.create;
	}
	
	/**
	 * CREATE_: 
	 */
	public void setCreate(java.util.Date value)
	 {
		this.create = value;
	}
	
	/**
	 * 查询条件开始值,CREATE_: 
	 */
	public java.util.Date getCreateBegin() {
		return this.createBegin;
	}
	
	/**
	 * 查询条件开始值,CREATE_: 
	 */
	public void setCreateBegin(java.util.Date value)
	 {
		this.createBegin = value;
	}
	
	/**
	 * 查询条件结束值,CREATE_: 
	 */
	public java.util.Date getCreateEnd() {
		return this.createEnd;
	}
	
	/**
	 * 查询条件结束值,CREATE_: 
	 */
	public void setCreateEnd(java.util.Date value)
	 {
		this.createEnd = value;
	}
	
	/**
	 * 查询条件结束值,CREATE_: 
	 */
	public java.util.Date getCreateEndEqual() {
		return this.createEndEqual;
	}
	
	/**
	 * 查询条件结束值,CREATE_: 
	 */
	public void setCreateEndEqual(java.util.Date value)
	 {
		this.createEndEqual = value;
	}
	
	/**
	 * END_: 
	 */
	public java.util.Date getEnd() {
		return this.end;
	}
	
	/**
	 * END_: 
	 */
	public void setEnd(java.util.Date value)
	 {
		this.end = value;
	}
	
	/**
	 * 查询条件开始值,END_: 
	 */
	public java.util.Date getEndBegin() {
		return this.endBegin;
	}
	
	/**
	 * 查询条件开始值,END_: 
	 */
	public void setEndBegin(java.util.Date value)
	 {
		this.endBegin = value;
	}
	
	/**
	 * 查询条件结束值,END_: 
	 */
	public java.util.Date getEndEnd() {
		return this.endEnd;
	}
	
	/**
	 * 查询条件结束值,END_: 
	 */
	public void setEndEnd(java.util.Date value)
	 {
		this.endEnd = value;
	}
	
	/**
	 * 查询条件结束值,END_: 
	 */
	public java.util.Date getEndEndEqual() {
		return this.endEndEqual;
	}
	
	/**
	 * 查询条件结束值,END_: 
	 */
	public void setEndEndEqual(java.util.Date value)
	 {
		this.endEndEqual = value;
	}
	
	/**
	 * DURATION_: 
	 */
	public Double getDuration() {
		return this.duration;
	}
	
	/**
	 * DURATION_: 
	 */
	public void setDuration(Double value)
	 {
		this.duration = value;
	}
	
	/**
	 * 查询条件开始值,DURATION_: 
	 */
	public Double getDurationBegin() {
		return this.durationBegin;
	}
	
	/**
	 * 查询条件开始值,DURATION_: 
	 */
	public void setDurationBegin(Double value)
	 {
		this.durationBegin = value;
	}
	
	/**
	 * 查询条件结束值,DURATION_: 
	 */
	public Double getDurationEnd() {
		return this.durationEnd;
	}
	
	/**
	 * 查询条件结束值,DURATION_: 
	 */
	public void setDurationEnd(Double value)
	 {
		this.durationEnd = value;
	}
	
	/**
	 * 查询条件结束值,DURATION_: 
	 */
	public Double getDurationEndEqual() {
		return this.durationEndEqual;
	}
	
	/**
	 * 查询条件结束值,DURATION_: 
	 */
	public void setDurationEndEqual(Double value)
	 {
		this.durationEndEqual = value;
	}
	
	/**
	 * NEXTIDX_: 
	 */
	public Integer getNextidx() {
		return this.nextidx;
	}
	
	/**
	 * NEXTIDX_: 
	 */
	public void setNextidx(Integer value)
	 {
		this.nextidx = value;
	}
	
	/**
	 * 查询条件开始值,NEXTIDX_: 
	 */
	public Integer getNextidxBegin() {
		return this.nextidxBegin;
	}
	
	/**
	 * 查询条件开始值,NEXTIDX_: 
	 */
	public void setNextidxBegin(Integer value)
	 {
		this.nextidxBegin = value;
	}
	
	/**
	 * 查询条件结束值,NEXTIDX_: 
	 */
	public Integer getNextidxEnd() {
		return this.nextidxEnd;
	}
	
	/**
	 * 查询条件结束值,NEXTIDX_: 
	 */
	public void setNextidxEnd(Integer value)
	 {
		this.nextidxEnd = value;
	}
	
	/**
	 * 查询条件结束值,NEXTIDX_: 
	 */
	public Integer getNextidxEndEqual() {
		return this.nextidxEndEqual;
	}
	
	/**
	 * 查询条件结束值,NEXTIDX_: 
	 */
	public void setNextidxEndEqual(Integer value)
	 {
		this.nextidxEndEqual = value;
	}
	
	/**
	 * SUPERTASK_: 
	 */
	public Double getSupertask() {
		return this.supertask;
	}
	
	/**
	 * SUPERTASK_: 
	 */
	public void setSupertask(Double value)
	 {
		this.supertask = value;
	}
	
	/**
	 * 查询条件开始值,SUPERTASK_: 
	 */
	public Double getSupertaskBegin() {
		return this.supertaskBegin;
	}
	
	/**
	 * 查询条件开始值,SUPERTASK_: 
	 */
	public void setSupertaskBegin(Double value)
	 {
		this.supertaskBegin = value;
	}
	
	/**
	 * 查询条件结束值,SUPERTASK_: 
	 */
	public Double getSupertaskEnd() {
		return this.supertaskEnd;
	}
	
	/**
	 * 查询条件结束值,SUPERTASK_: 
	 */
	public void setSupertaskEnd(Double value)
	 {
		this.supertaskEnd = value;
	}
	
	/**
	 * 查询条件结束值,SUPERTASK_: 
	 */
	public Double getSupertaskEndEqual() {
		return this.supertaskEndEqual;
	}
	
	/**
	 * 查询条件结束值,SUPERTASK_: 
	 */
	public void setSupertaskEndEqual(Double value)
	 {
		this.supertaskEndEqual = value;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4HistTaskQueryCondition setDbidCondition(Double value) {
		this.dbid = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4HistTaskQueryCondition setDbidConditionBegin(Double value) {
		this.dbidBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4HistTaskQueryCondition setDbidConditionEnd(Double value) {
		this.dbidEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4HistTaskQueryCondition setDbidConditionEndEqual(Double value) {
		this.dbidEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4HistTaskQueryCondition setDbversionCondition(Integer value) {
		this.dbversion = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4HistTaskQueryCondition setDbversionConditionBegin(Integer value) {
		this.dbversionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4HistTaskQueryCondition setDbversionConditionEnd(Integer value) {
		this.dbversionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4HistTaskQueryCondition setDbversionConditionEndEqual(Integer value) {
		this.dbversionEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_: 
	 */
	public Jbpm4HistTaskQueryCondition setExecutionCondition(String value) {
		this.execution = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_: 
	 */
	public Jbpm4HistTaskQueryCondition setExecutionConditionEqual(String value) {
		this.executionEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件OUTCOME_: 
	 */
	public Jbpm4HistTaskQueryCondition setOutcomeCondition(String value) {
		this.outcome = value;
		return this;
	}
	
	/**
	 * 设置查询条件OUTCOME_: 
	 */
	public Jbpm4HistTaskQueryCondition setOutcomeConditionEqual(String value) {
		this.outcomeEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ASSIGNEE_: 
	 */
	public Jbpm4HistTaskQueryCondition setAssigneeCondition(String value) {
		this.assignee = value;
		return this;
	}
	
	/**
	 * 设置查询条件ASSIGNEE_: 
	 */
	public Jbpm4HistTaskQueryCondition setAssigneeConditionEqual(String value) {
		this.assigneeEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITY_: 
	 */
	public Jbpm4HistTaskQueryCondition setPriorityCondition(Integer value) {
		this.priority = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITY_: 
	 */
	public Jbpm4HistTaskQueryCondition setPriorityConditionBegin(Integer value) {
		this.priorityBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITY_: 
	 */
	public Jbpm4HistTaskQueryCondition setPriorityConditionEnd(Integer value) {
		this.priorityEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITY_: 
	 */
	public Jbpm4HistTaskQueryCondition setPriorityConditionEndEqual(Integer value) {
		this.priorityEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATE_: 
	 */
	public Jbpm4HistTaskQueryCondition setStateCondition(String value) {
		this.state = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATE_: 
	 */
	public Jbpm4HistTaskQueryCondition setStateConditionEqual(String value) {
		this.stateEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_: 
	 */
	public Jbpm4HistTaskQueryCondition setCreateCondition(java.util.Date value) {
		this.create = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_: 
	 */
	public Jbpm4HistTaskQueryCondition setCreateConditionBegin(java.util.Date value) {
		this.createBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_: 
	 */
	public Jbpm4HistTaskQueryCondition setCreateConditionEnd(java.util.Date value) {
		this.createEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_: 
	 */
	public Jbpm4HistTaskQueryCondition setCreateConditionEndEqual(java.util.Date value) {
		this.createEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件END_: 
	 */
	public Jbpm4HistTaskQueryCondition setEndCondition(java.util.Date value) {
		this.end = value;
		return this;
	}
	
	/**
	 * 设置查询条件END_: 
	 */
	public Jbpm4HistTaskQueryCondition setEndConditionBegin(java.util.Date value) {
		this.endBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件END_: 
	 */
	public Jbpm4HistTaskQueryCondition setEndConditionEnd(java.util.Date value) {
		this.endEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件END_: 
	 */
	public Jbpm4HistTaskQueryCondition setEndConditionEndEqual(java.util.Date value) {
		this.endEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DURATION_: 
	 */
	public Jbpm4HistTaskQueryCondition setDurationCondition(Double value) {
		this.duration = value;
		return this;
	}
	
	/**
	 * 设置查询条件DURATION_: 
	 */
	public Jbpm4HistTaskQueryCondition setDurationConditionBegin(Double value) {
		this.durationBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DURATION_: 
	 */
	public Jbpm4HistTaskQueryCondition setDurationConditionEnd(Double value) {
		this.durationEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DURATION_: 
	 */
	public Jbpm4HistTaskQueryCondition setDurationConditionEndEqual(Double value) {
		this.durationEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEXTIDX_: 
	 */
	public Jbpm4HistTaskQueryCondition setNextidxCondition(Integer value) {
		this.nextidx = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEXTIDX_: 
	 */
	public Jbpm4HistTaskQueryCondition setNextidxConditionBegin(Integer value) {
		this.nextidxBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEXTIDX_: 
	 */
	public Jbpm4HistTaskQueryCondition setNextidxConditionEnd(Integer value) {
		this.nextidxEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEXTIDX_: 
	 */
	public Jbpm4HistTaskQueryCondition setNextidxConditionEndEqual(Integer value) {
		this.nextidxEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件SUPERTASK_: 
	 */
	public Jbpm4HistTaskQueryCondition setSupertaskCondition(Double value) {
		this.supertask = value;
		return this;
	}
	
	/**
	 * 设置查询条件SUPERTASK_: 
	 */
	public Jbpm4HistTaskQueryCondition setSupertaskConditionBegin(Double value) {
		this.supertaskBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件SUPERTASK_: 
	 */
	public Jbpm4HistTaskQueryCondition setSupertaskConditionEnd(Double value) {
		this.supertaskEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件SUPERTASK_: 
	 */
	public Jbpm4HistTaskQueryCondition setSupertaskConditionEndEqual(Double value) {
		this.supertaskEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.dbid == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_TASK].[DBID_] = " + this.dbid) 
						+ ") "));
		}
		if ((this.dbidBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[DBID_] >= " 
						+ (this.dbidBegin + ")")));
		}
		if ((this.dbidEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[DBID_] < " 
						+ (this.dbidEnd + ") ")));
		}
		if ((this.dbidEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[DBID_] <= " 
						+ (this.dbidEndEqual + ") ")));
		}
		if ((this.dbversion == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_TASK].[DBVERSION_] = " + this.dbversion) 
						+ ") "));
		}
		if ((this.dbversionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[DBVERSION_] >= " 
						+ (this.dbversionBegin + ")")));
		}
		if ((this.dbversionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[DBVERSION_] < " 
						+ (this.dbversionEnd + ") ")));
		}
		if ((this.dbversionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[DBVERSION_] <= " 
						+ (this.dbversionEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.execution)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_TASK].[EXECUTION_]", this.execution)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.executionEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_TASK].[EXECUTION_] = " + SqlServerUtils.safeSql(this.executionEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.outcome)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_TASK].[OUTCOME_]", this.outcome)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.outcomeEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_TASK].[OUTCOME_] = " + SqlServerUtils.safeSql(this.outcomeEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.assignee)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_TASK].[ASSIGNEE_]", this.assignee)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.assigneeEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_TASK].[ASSIGNEE_] = " + SqlServerUtils.safeSql(this.assigneeEqual))) 
						+ ") "));
		}
		if ((this.priority == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_TASK].[PRIORITY_] = " + this.priority) 
						+ ") "));
		}
		if ((this.priorityBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[PRIORITY_] >= " 
						+ (this.priorityBegin + ")")));
		}
		if ((this.priorityEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[PRIORITY_] < " 
						+ (this.priorityEnd + ") ")));
		}
		if ((this.priorityEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[PRIORITY_] <= " 
						+ (this.priorityEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.state)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_TASK].[STATE_]", this.state)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.stateEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_TASK].[STATE_] = " + SqlServerUtils.safeSql(this.stateEqual))) 
						+ ") "));
		}
		if ((this.create == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_TASK].[CREATE_] = " + SqlServerUtils.getDateSql(this.create)) 
						+ ") "));
		}
		if ((this.createBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[CREATE_] >= " 
						+ (SqlServerUtils.getDateSql(this.createBegin) + ")")));
		}
		if ((this.createEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[CREATE_] < " 
						+ (SqlServerUtils.getDateSql(this.createEnd) + ") ")));
		}
		if ((this.createEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[CREATE_] < " 
						+ (SqlServerUtils.getNextDateSql(this.createEndEqual) + ") ")));
		}
		if ((this.end == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_TASK].[END_] = " + SqlServerUtils.getDateSql(this.end)) 
						+ ") "));
		}
		if ((this.endBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[END_] >= " 
						+ (SqlServerUtils.getDateSql(this.endBegin) + ")")));
		}
		if ((this.endEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[END_] < " 
						+ (SqlServerUtils.getDateSql(this.endEnd) + ") ")));
		}
		if ((this.endEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[END_] < " 
						+ (SqlServerUtils.getNextDateSql(this.endEndEqual) + ") ")));
		}
		if ((this.duration == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_TASK].[DURATION_] = " + this.duration) 
						+ ") "));
		}
		if ((this.durationBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[DURATION_] >= " 
						+ (this.durationBegin + ")")));
		}
		if ((this.durationEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[DURATION_] < " 
						+ (this.durationEnd + ") ")));
		}
		if ((this.durationEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[DURATION_] <= " 
						+ (this.durationEndEqual + ") ")));
		}
		if ((this.nextidx == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_TASK].[NEXTIDX_] = " + this.nextidx) 
						+ ") "));
		}
		if ((this.nextidxBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[NEXTIDX_] >= " 
						+ (this.nextidxBegin + ")")));
		}
		if ((this.nextidxEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[NEXTIDX_] < " 
						+ (this.nextidxEnd + ") ")));
		}
		if ((this.nextidxEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[NEXTIDX_] <= " 
						+ (this.nextidxEndEqual + ") ")));
		}
		if ((this.supertask == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_TASK].[SUPERTASK_] = " + this.supertask) 
						+ ") "));
		}
		if ((this.supertaskBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[SUPERTASK_] >= " 
						+ (this.supertaskBegin + ")")));
		}
		if ((this.supertaskEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[SUPERTASK_] < " 
						+ (this.supertaskEnd + ") ")));
		}
		if ((this.supertaskEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_TASK].[SUPERTASK_] <= " 
						+ (this.supertaskEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
