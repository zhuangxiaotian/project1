package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_HIST_ACTINST查询条件定义
 */
public class Jbpm4HistActinstQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,CLASS_: 
	 */
	String class_;
	
	/**
	 * 查询条件字符串相等,CLASS_: 
	 */
	String class_Equal;
	
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
	 * 查询条件,HPROCI_: 
	 */
	Double hproci;
	
	/**
	 * 查询条件开始值,HPROCI_: 
	 */
	Double hprociBegin;
	
	/**
	 * 查询条件结束值,HPROCI_: 
	 */
	Double hprociEnd;
	
	/**
	 * 查询条件结束值,HPROCI_: 
	 */
	Double hprociEndEqual;
	
	/**
	 * 查询条件,TYPE_: 
	 */
	String type;
	
	/**
	 * 查询条件字符串相等,TYPE_: 
	 */
	String typeEqual;
	
	/**
	 * 查询条件,EXECUTION_: 
	 */
	String execution;
	
	/**
	 * 查询条件字符串相等,EXECUTION_: 
	 */
	String executionEqual;
	
	/**
	 * 查询条件,ACTIVITY_NAME_: 
	 */
	String activityName;
	
	/**
	 * 查询条件字符串相等,ACTIVITY_NAME_: 
	 */
	String activityNameEqual;
	
	/**
	 * 查询条件,START_: 
	 */
	java.util.Date start;
	
	/**
	 * 查询条件开始值,START_: 
	 */
	java.util.Date startBegin;
	
	/**
	 * 查询条件结束值,START_: 
	 */
	java.util.Date startEnd;
	
	/**
	 * 查询条件结束值,START_: 
	 */
	java.util.Date startEndEqual;
	
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
	 * 查询条件,TRANSITION_: 
	 */
	String transition;
	
	/**
	 * 查询条件字符串相等,TRANSITION_: 
	 */
	String transitionEqual;
	
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
	 * 查询条件,HTASK_: 
	 */
	Double htask;
	
	/**
	 * 查询条件开始值,HTASK_: 
	 */
	Double htaskBegin;
	
	/**
	 * 查询条件结束值,HTASK_: 
	 */
	Double htaskEnd;
	
	/**
	 * 查询条件结束值,HTASK_: 
	 */
	Double htaskEndEqual;
	
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
	 * CLASS_: 
	 */
	public String getClass_() {
		return this.class_;
	}
	
	/**
	 * CLASS_: 
	 */
	public void setClass_(String value)
	 {
		this.class_ = value;
	}
	
	/**
	 * 查询条件字符串相等,CLASS_: 
	 */
	public String getClass_Equal() {
		return this.class_Equal;
	}
	
	/**
	 * 查询条件字符串相等,CLASS_: 
	 */
	public void setClass_Equal(String value)
	 {
		this.class_Equal = value;
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
	 * HPROCI_: 
	 */
	public Double getHproci() {
		return this.hproci;
	}
	
	/**
	 * HPROCI_: 
	 */
	public void setHproci(Double value)
	 {
		this.hproci = value;
	}
	
	/**
	 * 查询条件开始值,HPROCI_: 
	 */
	public Double getHprociBegin() {
		return this.hprociBegin;
	}
	
	/**
	 * 查询条件开始值,HPROCI_: 
	 */
	public void setHprociBegin(Double value)
	 {
		this.hprociBegin = value;
	}
	
	/**
	 * 查询条件结束值,HPROCI_: 
	 */
	public Double getHprociEnd() {
		return this.hprociEnd;
	}
	
	/**
	 * 查询条件结束值,HPROCI_: 
	 */
	public void setHprociEnd(Double value)
	 {
		this.hprociEnd = value;
	}
	
	/**
	 * 查询条件结束值,HPROCI_: 
	 */
	public Double getHprociEndEqual() {
		return this.hprociEndEqual;
	}
	
	/**
	 * 查询条件结束值,HPROCI_: 
	 */
	public void setHprociEndEqual(Double value)
	 {
		this.hprociEndEqual = value;
	}
	
	/**
	 * TYPE_: 
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * TYPE_: 
	 */
	public void setType(String value)
	 {
		this.type = value;
	}
	
	/**
	 * 查询条件字符串相等,TYPE_: 
	 */
	public String getTypeEqual() {
		return this.typeEqual;
	}
	
	/**
	 * 查询条件字符串相等,TYPE_: 
	 */
	public void setTypeEqual(String value)
	 {
		this.typeEqual = value;
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
	 * ACTIVITY_NAME_: 
	 */
	public String getActivityName() {
		return this.activityName;
	}
	
	/**
	 * ACTIVITY_NAME_: 
	 */
	public void setActivityName(String value)
	 {
		this.activityName = value;
	}
	
	/**
	 * 查询条件字符串相等,ACTIVITY_NAME_: 
	 */
	public String getActivityNameEqual() {
		return this.activityNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,ACTIVITY_NAME_: 
	 */
	public void setActivityNameEqual(String value)
	 {
		this.activityNameEqual = value;
	}
	
	/**
	 * START_: 
	 */
	public java.util.Date getStart() {
		return this.start;
	}
	
	/**
	 * START_: 
	 */
	public void setStart(java.util.Date value)
	 {
		this.start = value;
	}
	
	/**
	 * 查询条件开始值,START_: 
	 */
	public java.util.Date getStartBegin() {
		return this.startBegin;
	}
	
	/**
	 * 查询条件开始值,START_: 
	 */
	public void setStartBegin(java.util.Date value)
	 {
		this.startBegin = value;
	}
	
	/**
	 * 查询条件结束值,START_: 
	 */
	public java.util.Date getStartEnd() {
		return this.startEnd;
	}
	
	/**
	 * 查询条件结束值,START_: 
	 */
	public void setStartEnd(java.util.Date value)
	 {
		this.startEnd = value;
	}
	
	/**
	 * 查询条件结束值,START_: 
	 */
	public java.util.Date getStartEndEqual() {
		return this.startEndEqual;
	}
	
	/**
	 * 查询条件结束值,START_: 
	 */
	public void setStartEndEqual(java.util.Date value)
	 {
		this.startEndEqual = value;
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
	 * TRANSITION_: 
	 */
	public String getTransition() {
		return this.transition;
	}
	
	/**
	 * TRANSITION_: 
	 */
	public void setTransition(String value)
	 {
		this.transition = value;
	}
	
	/**
	 * 查询条件字符串相等,TRANSITION_: 
	 */
	public String getTransitionEqual() {
		return this.transitionEqual;
	}
	
	/**
	 * 查询条件字符串相等,TRANSITION_: 
	 */
	public void setTransitionEqual(String value)
	 {
		this.transitionEqual = value;
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
	 * HTASK_: 
	 */
	public Double getHtask() {
		return this.htask;
	}
	
	/**
	 * HTASK_: 
	 */
	public void setHtask(Double value)
	 {
		this.htask = value;
	}
	
	/**
	 * 查询条件开始值,HTASK_: 
	 */
	public Double getHtaskBegin() {
		return this.htaskBegin;
	}
	
	/**
	 * 查询条件开始值,HTASK_: 
	 */
	public void setHtaskBegin(Double value)
	 {
		this.htaskBegin = value;
	}
	
	/**
	 * 查询条件结束值,HTASK_: 
	 */
	public Double getHtaskEnd() {
		return this.htaskEnd;
	}
	
	/**
	 * 查询条件结束值,HTASK_: 
	 */
	public void setHtaskEnd(Double value)
	 {
		this.htaskEnd = value;
	}
	
	/**
	 * 查询条件结束值,HTASK_: 
	 */
	public Double getHtaskEndEqual() {
		return this.htaskEndEqual;
	}
	
	/**
	 * 查询条件结束值,HTASK_: 
	 */
	public void setHtaskEndEqual(Double value)
	 {
		this.htaskEndEqual = value;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4HistActinstQueryCondition setDbidCondition(Double value) {
		this.dbid = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4HistActinstQueryCondition setDbidConditionBegin(Double value) {
		this.dbidBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4HistActinstQueryCondition setDbidConditionEnd(Double value) {
		this.dbidEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4HistActinstQueryCondition setDbidConditionEndEqual(Double value) {
		this.dbidEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CLASS_: 
	 */
	public Jbpm4HistActinstQueryCondition setClass_Condition(String value) {
		this.class_ = value;
		return this;
	}
	
	/**
	 * 设置查询条件CLASS_: 
	 */
	public Jbpm4HistActinstQueryCondition setClass_ConditionEqual(String value) {
		this.class_Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4HistActinstQueryCondition setDbversionCondition(Integer value) {
		this.dbversion = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4HistActinstQueryCondition setDbversionConditionBegin(Integer value) {
		this.dbversionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4HistActinstQueryCondition setDbversionConditionEnd(Integer value) {
		this.dbversionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4HistActinstQueryCondition setDbversionConditionEndEqual(Integer value) {
		this.dbversionEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件HPROCI_: 
	 */
	public Jbpm4HistActinstQueryCondition setHprociCondition(Double value) {
		this.hproci = value;
		return this;
	}
	
	/**
	 * 设置查询条件HPROCI_: 
	 */
	public Jbpm4HistActinstQueryCondition setHprociConditionBegin(Double value) {
		this.hprociBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件HPROCI_: 
	 */
	public Jbpm4HistActinstQueryCondition setHprociConditionEnd(Double value) {
		this.hprociEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件HPROCI_: 
	 */
	public Jbpm4HistActinstQueryCondition setHprociConditionEndEqual(Double value) {
		this.hprociEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TYPE_: 
	 */
	public Jbpm4HistActinstQueryCondition setTypeCondition(String value) {
		this.type = value;
		return this;
	}
	
	/**
	 * 设置查询条件TYPE_: 
	 */
	public Jbpm4HistActinstQueryCondition setTypeConditionEqual(String value) {
		this.typeEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_: 
	 */
	public Jbpm4HistActinstQueryCondition setExecutionCondition(String value) {
		this.execution = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_: 
	 */
	public Jbpm4HistActinstQueryCondition setExecutionConditionEqual(String value) {
		this.executionEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ACTIVITY_NAME_: 
	 */
	public Jbpm4HistActinstQueryCondition setActivityNameCondition(String value) {
		this.activityName = value;
		return this;
	}
	
	/**
	 * 设置查询条件ACTIVITY_NAME_: 
	 */
	public Jbpm4HistActinstQueryCondition setActivityNameConditionEqual(String value) {
		this.activityNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件START_: 
	 */
	public Jbpm4HistActinstQueryCondition setStartCondition(java.util.Date value) {
		this.start = value;
		return this;
	}
	
	/**
	 * 设置查询条件START_: 
	 */
	public Jbpm4HistActinstQueryCondition setStartConditionBegin(java.util.Date value) {
		this.startBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件START_: 
	 */
	public Jbpm4HistActinstQueryCondition setStartConditionEnd(java.util.Date value) {
		this.startEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件START_: 
	 */
	public Jbpm4HistActinstQueryCondition setStartConditionEndEqual(java.util.Date value) {
		this.startEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件END_: 
	 */
	public Jbpm4HistActinstQueryCondition setEndCondition(java.util.Date value) {
		this.end = value;
		return this;
	}
	
	/**
	 * 设置查询条件END_: 
	 */
	public Jbpm4HistActinstQueryCondition setEndConditionBegin(java.util.Date value) {
		this.endBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件END_: 
	 */
	public Jbpm4HistActinstQueryCondition setEndConditionEnd(java.util.Date value) {
		this.endEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件END_: 
	 */
	public Jbpm4HistActinstQueryCondition setEndConditionEndEqual(java.util.Date value) {
		this.endEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DURATION_: 
	 */
	public Jbpm4HistActinstQueryCondition setDurationCondition(Double value) {
		this.duration = value;
		return this;
	}
	
	/**
	 * 设置查询条件DURATION_: 
	 */
	public Jbpm4HistActinstQueryCondition setDurationConditionBegin(Double value) {
		this.durationBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DURATION_: 
	 */
	public Jbpm4HistActinstQueryCondition setDurationConditionEnd(Double value) {
		this.durationEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DURATION_: 
	 */
	public Jbpm4HistActinstQueryCondition setDurationConditionEndEqual(Double value) {
		this.durationEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TRANSITION_: 
	 */
	public Jbpm4HistActinstQueryCondition setTransitionCondition(String value) {
		this.transition = value;
		return this;
	}
	
	/**
	 * 设置查询条件TRANSITION_: 
	 */
	public Jbpm4HistActinstQueryCondition setTransitionConditionEqual(String value) {
		this.transitionEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEXTIDX_: 
	 */
	public Jbpm4HistActinstQueryCondition setNextidxCondition(Integer value) {
		this.nextidx = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEXTIDX_: 
	 */
	public Jbpm4HistActinstQueryCondition setNextidxConditionBegin(Integer value) {
		this.nextidxBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEXTIDX_: 
	 */
	public Jbpm4HistActinstQueryCondition setNextidxConditionEnd(Integer value) {
		this.nextidxEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEXTIDX_: 
	 */
	public Jbpm4HistActinstQueryCondition setNextidxConditionEndEqual(Integer value) {
		this.nextidxEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件HTASK_: 
	 */
	public Jbpm4HistActinstQueryCondition setHtaskCondition(Double value) {
		this.htask = value;
		return this;
	}
	
	/**
	 * 设置查询条件HTASK_: 
	 */
	public Jbpm4HistActinstQueryCondition setHtaskConditionBegin(Double value) {
		this.htaskBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件HTASK_: 
	 */
	public Jbpm4HistActinstQueryCondition setHtaskConditionEnd(Double value) {
		this.htaskEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件HTASK_: 
	 */
	public Jbpm4HistActinstQueryCondition setHtaskConditionEndEqual(Double value) {
		this.htaskEndEqual = value;
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
						+ ((" and ([JBPM4_HIST_ACTINST].[DBID_] = " + this.dbid) 
						+ ") "));
		}
		if ((this.dbidBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[DBID_] >= " 
						+ (this.dbidBegin + ")")));
		}
		if ((this.dbidEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[DBID_] < " 
						+ (this.dbidEnd + ") ")));
		}
		if ((this.dbidEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[DBID_] <= " 
						+ (this.dbidEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.class_)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_ACTINST].[CLASS_]", this.class_)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.class_Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_ACTINST].[CLASS_] = " + SqlServerUtils.safeSql(this.class_Equal))) 
						+ ") "));
		}
		if ((this.dbversion == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_ACTINST].[DBVERSION_] = " + this.dbversion) 
						+ ") "));
		}
		if ((this.dbversionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[DBVERSION_] >= " 
						+ (this.dbversionBegin + ")")));
		}
		if ((this.dbversionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[DBVERSION_] < " 
						+ (this.dbversionEnd + ") ")));
		}
		if ((this.dbversionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[DBVERSION_] <= " 
						+ (this.dbversionEndEqual + ") ")));
		}
		if ((this.hproci == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_ACTINST].[HPROCI_] = " + this.hproci) 
						+ ") "));
		}
		if ((this.hprociBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[HPROCI_] >= " 
						+ (this.hprociBegin + ")")));
		}
		if ((this.hprociEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[HPROCI_] < " 
						+ (this.hprociEnd + ") ")));
		}
		if ((this.hprociEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[HPROCI_] <= " 
						+ (this.hprociEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.type)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_ACTINST].[TYPE_]", this.type)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.typeEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_ACTINST].[TYPE_] = " + SqlServerUtils.safeSql(this.typeEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.execution)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_ACTINST].[EXECUTION_]", this.execution)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.executionEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_ACTINST].[EXECUTION_] = " + SqlServerUtils.safeSql(this.executionEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.activityName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_ACTINST].[ACTIVITY_NAME_]", this.activityName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.activityNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_ACTINST].[ACTIVITY_NAME_] = " + SqlServerUtils.safeSql(this.activityNameEqual))) 
						+ ") "));
		}
		if ((this.start == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_ACTINST].[START_] = " + SqlServerUtils.getDateSql(this.start)) 
						+ ") "));
		}
		if ((this.startBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[START_] >= " 
						+ (SqlServerUtils.getDateSql(this.startBegin) + ")")));
		}
		if ((this.startEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[START_] < " 
						+ (SqlServerUtils.getDateSql(this.startEnd) + ") ")));
		}
		if ((this.startEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[START_] < " 
						+ (SqlServerUtils.getNextDateSql(this.startEndEqual) + ") ")));
		}
		if ((this.end == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_ACTINST].[END_] = " + SqlServerUtils.getDateSql(this.end)) 
						+ ") "));
		}
		if ((this.endBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[END_] >= " 
						+ (SqlServerUtils.getDateSql(this.endBegin) + ")")));
		}
		if ((this.endEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[END_] < " 
						+ (SqlServerUtils.getDateSql(this.endEnd) + ") ")));
		}
		if ((this.endEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[END_] < " 
						+ (SqlServerUtils.getNextDateSql(this.endEndEqual) + ") ")));
		}
		if ((this.duration == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_ACTINST].[DURATION_] = " + this.duration) 
						+ ") "));
		}
		if ((this.durationBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[DURATION_] >= " 
						+ (this.durationBegin + ")")));
		}
		if ((this.durationEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[DURATION_] < " 
						+ (this.durationEnd + ") ")));
		}
		if ((this.durationEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[DURATION_] <= " 
						+ (this.durationEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.transition)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_ACTINST].[TRANSITION_]", this.transition)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.transitionEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_ACTINST].[TRANSITION_] = " + SqlServerUtils.safeSql(this.transitionEqual))) 
						+ ") "));
		}
		if ((this.nextidx == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_ACTINST].[NEXTIDX_] = " + this.nextidx) 
						+ ") "));
		}
		if ((this.nextidxBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[NEXTIDX_] >= " 
						+ (this.nextidxBegin + ")")));
		}
		if ((this.nextidxEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[NEXTIDX_] < " 
						+ (this.nextidxEnd + ") ")));
		}
		if ((this.nextidxEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[NEXTIDX_] <= " 
						+ (this.nextidxEndEqual + ") ")));
		}
		if ((this.htask == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_ACTINST].[HTASK_] = " + this.htask) 
						+ ") "));
		}
		if ((this.htaskBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[HTASK_] >= " 
						+ (this.htaskBegin + ")")));
		}
		if ((this.htaskEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[HTASK_] < " 
						+ (this.htaskEnd + ") ")));
		}
		if ((this.htaskEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_ACTINST].[HTASK_] <= " 
						+ (this.htaskEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
