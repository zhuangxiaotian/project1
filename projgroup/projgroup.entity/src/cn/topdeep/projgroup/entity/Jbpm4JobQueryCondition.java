package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_JOB查询条件定义
 */
public class Jbpm4JobQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,DUEDATE_: 
	 */
	java.util.Date duedate;
	
	/**
	 * 查询条件开始值,DUEDATE_: 
	 */
	java.util.Date duedateBegin;
	
	/**
	 * 查询条件结束值,DUEDATE_: 
	 */
	java.util.Date duedateEnd;
	
	/**
	 * 查询条件结束值,DUEDATE_: 
	 */
	java.util.Date duedateEndEqual;
	
	/**
	 * 查询条件,STATE_: 
	 */
	String state;
	
	/**
	 * 查询条件字符串相等,STATE_: 
	 */
	String stateEqual;
	
	/**
	 * 查询条件,ISEXCLUSIVE_: 
	 */
	Byte isexclusive;
	
	/**
	 * 查询条件开始值,ISEXCLUSIVE_: 
	 */
	Byte isexclusiveBegin;
	
	/**
	 * 查询条件结束值,ISEXCLUSIVE_: 
	 */
	Byte isexclusiveEnd;
	
	/**
	 * 查询条件结束值,ISEXCLUSIVE_: 
	 */
	Byte isexclusiveEndEqual;
	
	/**
	 * 查询条件,LOCKOWNER_: 
	 */
	String lockowner;
	
	/**
	 * 查询条件字符串相等,LOCKOWNER_: 
	 */
	String lockownerEqual;
	
	/**
	 * 查询条件,LOCKEXPTIME_: 
	 */
	java.util.Date lockexptime;
	
	/**
	 * 查询条件开始值,LOCKEXPTIME_: 
	 */
	java.util.Date lockexptimeBegin;
	
	/**
	 * 查询条件结束值,LOCKEXPTIME_: 
	 */
	java.util.Date lockexptimeEnd;
	
	/**
	 * 查询条件结束值,LOCKEXPTIME_: 
	 */
	java.util.Date lockexptimeEndEqual;
	
	/**
	 * 查询条件,EXCEPTION_: 
	 */
	String exception;
	
	/**
	 * 查询条件字符串相等,EXCEPTION_: 
	 */
	String exceptionEqual;
	
	/**
	 * 查询条件,RETRIES_: 
	 */
	Integer retries;
	
	/**
	 * 查询条件开始值,RETRIES_: 
	 */
	Integer retriesBegin;
	
	/**
	 * 查询条件结束值,RETRIES_: 
	 */
	Integer retriesEnd;
	
	/**
	 * 查询条件结束值,RETRIES_: 
	 */
	Integer retriesEndEqual;
	
	/**
	 * 查询条件,PROCESSINSTANCE_: 
	 */
	Double processinstance;
	
	/**
	 * 查询条件开始值,PROCESSINSTANCE_: 
	 */
	Double processinstanceBegin;
	
	/**
	 * 查询条件结束值,PROCESSINSTANCE_: 
	 */
	Double processinstanceEnd;
	
	/**
	 * 查询条件结束值,PROCESSINSTANCE_: 
	 */
	Double processinstanceEndEqual;
	
	/**
	 * 查询条件,EXECUTION_: 
	 */
	Double execution;
	
	/**
	 * 查询条件开始值,EXECUTION_: 
	 */
	Double executionBegin;
	
	/**
	 * 查询条件结束值,EXECUTION_: 
	 */
	Double executionEnd;
	
	/**
	 * 查询条件结束值,EXECUTION_: 
	 */
	Double executionEndEqual;
	
	/**
	 * 查询条件,CFG_: 
	 */
	Double cfg;
	
	/**
	 * 查询条件开始值,CFG_: 
	 */
	Double cfgBegin;
	
	/**
	 * 查询条件结束值,CFG_: 
	 */
	Double cfgEnd;
	
	/**
	 * 查询条件结束值,CFG_: 
	 */
	Double cfgEndEqual;
	
	/**
	 * 查询条件,SIGNAL_: 
	 */
	String signal;
	
	/**
	 * 查询条件字符串相等,SIGNAL_: 
	 */
	String signalEqual;
	
	/**
	 * 查询条件,EVENT_: 
	 */
	String event_;
	
	/**
	 * 查询条件字符串相等,EVENT_: 
	 */
	String event_Equal;
	
	/**
	 * 查询条件,REPEAT_: 
	 */
	String repeat;
	
	/**
	 * 查询条件字符串相等,REPEAT_: 
	 */
	String repeatEqual;
	
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
	 * DUEDATE_: 
	 */
	public java.util.Date getDuedate() {
		return this.duedate;
	}
	
	/**
	 * DUEDATE_: 
	 */
	public void setDuedate(java.util.Date value)
	 {
		this.duedate = value;
	}
	
	/**
	 * 查询条件开始值,DUEDATE_: 
	 */
	public java.util.Date getDuedateBegin() {
		return this.duedateBegin;
	}
	
	/**
	 * 查询条件开始值,DUEDATE_: 
	 */
	public void setDuedateBegin(java.util.Date value)
	 {
		this.duedateBegin = value;
	}
	
	/**
	 * 查询条件结束值,DUEDATE_: 
	 */
	public java.util.Date getDuedateEnd() {
		return this.duedateEnd;
	}
	
	/**
	 * 查询条件结束值,DUEDATE_: 
	 */
	public void setDuedateEnd(java.util.Date value)
	 {
		this.duedateEnd = value;
	}
	
	/**
	 * 查询条件结束值,DUEDATE_: 
	 */
	public java.util.Date getDuedateEndEqual() {
		return this.duedateEndEqual;
	}
	
	/**
	 * 查询条件结束值,DUEDATE_: 
	 */
	public void setDuedateEndEqual(java.util.Date value)
	 {
		this.duedateEndEqual = value;
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
	 * ISEXCLUSIVE_: 
	 */
	public Byte getIsexclusive() {
		return this.isexclusive;
	}
	
	/**
	 * ISEXCLUSIVE_: 
	 */
	public void setIsexclusive(Byte value)
	 {
		this.isexclusive = value;
	}
	
	/**
	 * 查询条件开始值,ISEXCLUSIVE_: 
	 */
	public Byte getIsexclusiveBegin() {
		return this.isexclusiveBegin;
	}
	
	/**
	 * 查询条件开始值,ISEXCLUSIVE_: 
	 */
	public void setIsexclusiveBegin(Byte value)
	 {
		this.isexclusiveBegin = value;
	}
	
	/**
	 * 查询条件结束值,ISEXCLUSIVE_: 
	 */
	public Byte getIsexclusiveEnd() {
		return this.isexclusiveEnd;
	}
	
	/**
	 * 查询条件结束值,ISEXCLUSIVE_: 
	 */
	public void setIsexclusiveEnd(Byte value)
	 {
		this.isexclusiveEnd = value;
	}
	
	/**
	 * 查询条件结束值,ISEXCLUSIVE_: 
	 */
	public Byte getIsexclusiveEndEqual() {
		return this.isexclusiveEndEqual;
	}
	
	/**
	 * 查询条件结束值,ISEXCLUSIVE_: 
	 */
	public void setIsexclusiveEndEqual(Byte value)
	 {
		this.isexclusiveEndEqual = value;
	}
	
	/**
	 * LOCKOWNER_: 
	 */
	public String getLockowner() {
		return this.lockowner;
	}
	
	/**
	 * LOCKOWNER_: 
	 */
	public void setLockowner(String value)
	 {
		this.lockowner = value;
	}
	
	/**
	 * 查询条件字符串相等,LOCKOWNER_: 
	 */
	public String getLockownerEqual() {
		return this.lockownerEqual;
	}
	
	/**
	 * 查询条件字符串相等,LOCKOWNER_: 
	 */
	public void setLockownerEqual(String value)
	 {
		this.lockownerEqual = value;
	}
	
	/**
	 * LOCKEXPTIME_: 
	 */
	public java.util.Date getLockexptime() {
		return this.lockexptime;
	}
	
	/**
	 * LOCKEXPTIME_: 
	 */
	public void setLockexptime(java.util.Date value)
	 {
		this.lockexptime = value;
	}
	
	/**
	 * 查询条件开始值,LOCKEXPTIME_: 
	 */
	public java.util.Date getLockexptimeBegin() {
		return this.lockexptimeBegin;
	}
	
	/**
	 * 查询条件开始值,LOCKEXPTIME_: 
	 */
	public void setLockexptimeBegin(java.util.Date value)
	 {
		this.lockexptimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,LOCKEXPTIME_: 
	 */
	public java.util.Date getLockexptimeEnd() {
		return this.lockexptimeEnd;
	}
	
	/**
	 * 查询条件结束值,LOCKEXPTIME_: 
	 */
	public void setLockexptimeEnd(java.util.Date value)
	 {
		this.lockexptimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,LOCKEXPTIME_: 
	 */
	public java.util.Date getLockexptimeEndEqual() {
		return this.lockexptimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,LOCKEXPTIME_: 
	 */
	public void setLockexptimeEndEqual(java.util.Date value)
	 {
		this.lockexptimeEndEqual = value;
	}
	
	/**
	 * EXCEPTION_: 
	 */
	public String getException() {
		return this.exception;
	}
	
	/**
	 * EXCEPTION_: 
	 */
	public void setException(String value)
	 {
		this.exception = value;
	}
	
	/**
	 * 查询条件字符串相等,EXCEPTION_: 
	 */
	public String getExceptionEqual() {
		return this.exceptionEqual;
	}
	
	/**
	 * 查询条件字符串相等,EXCEPTION_: 
	 */
	public void setExceptionEqual(String value)
	 {
		this.exceptionEqual = value;
	}
	
	/**
	 * RETRIES_: 
	 */
	public Integer getRetries() {
		return this.retries;
	}
	
	/**
	 * RETRIES_: 
	 */
	public void setRetries(Integer value)
	 {
		this.retries = value;
	}
	
	/**
	 * 查询条件开始值,RETRIES_: 
	 */
	public Integer getRetriesBegin() {
		return this.retriesBegin;
	}
	
	/**
	 * 查询条件开始值,RETRIES_: 
	 */
	public void setRetriesBegin(Integer value)
	 {
		this.retriesBegin = value;
	}
	
	/**
	 * 查询条件结束值,RETRIES_: 
	 */
	public Integer getRetriesEnd() {
		return this.retriesEnd;
	}
	
	/**
	 * 查询条件结束值,RETRIES_: 
	 */
	public void setRetriesEnd(Integer value)
	 {
		this.retriesEnd = value;
	}
	
	/**
	 * 查询条件结束值,RETRIES_: 
	 */
	public Integer getRetriesEndEqual() {
		return this.retriesEndEqual;
	}
	
	/**
	 * 查询条件结束值,RETRIES_: 
	 */
	public void setRetriesEndEqual(Integer value)
	 {
		this.retriesEndEqual = value;
	}
	
	/**
	 * PROCESSINSTANCE_: 
	 */
	public Double getProcessinstance() {
		return this.processinstance;
	}
	
	/**
	 * PROCESSINSTANCE_: 
	 */
	public void setProcessinstance(Double value)
	 {
		this.processinstance = value;
	}
	
	/**
	 * 查询条件开始值,PROCESSINSTANCE_: 
	 */
	public Double getProcessinstanceBegin() {
		return this.processinstanceBegin;
	}
	
	/**
	 * 查询条件开始值,PROCESSINSTANCE_: 
	 */
	public void setProcessinstanceBegin(Double value)
	 {
		this.processinstanceBegin = value;
	}
	
	/**
	 * 查询条件结束值,PROCESSINSTANCE_: 
	 */
	public Double getProcessinstanceEnd() {
		return this.processinstanceEnd;
	}
	
	/**
	 * 查询条件结束值,PROCESSINSTANCE_: 
	 */
	public void setProcessinstanceEnd(Double value)
	 {
		this.processinstanceEnd = value;
	}
	
	/**
	 * 查询条件结束值,PROCESSINSTANCE_: 
	 */
	public Double getProcessinstanceEndEqual() {
		return this.processinstanceEndEqual;
	}
	
	/**
	 * 查询条件结束值,PROCESSINSTANCE_: 
	 */
	public void setProcessinstanceEndEqual(Double value)
	 {
		this.processinstanceEndEqual = value;
	}
	
	/**
	 * EXECUTION_: 
	 */
	public Double getExecution() {
		return this.execution;
	}
	
	/**
	 * EXECUTION_: 
	 */
	public void setExecution(Double value)
	 {
		this.execution = value;
	}
	
	/**
	 * 查询条件开始值,EXECUTION_: 
	 */
	public Double getExecutionBegin() {
		return this.executionBegin;
	}
	
	/**
	 * 查询条件开始值,EXECUTION_: 
	 */
	public void setExecutionBegin(Double value)
	 {
		this.executionBegin = value;
	}
	
	/**
	 * 查询条件结束值,EXECUTION_: 
	 */
	public Double getExecutionEnd() {
		return this.executionEnd;
	}
	
	/**
	 * 查询条件结束值,EXECUTION_: 
	 */
	public void setExecutionEnd(Double value)
	 {
		this.executionEnd = value;
	}
	
	/**
	 * 查询条件结束值,EXECUTION_: 
	 */
	public Double getExecutionEndEqual() {
		return this.executionEndEqual;
	}
	
	/**
	 * 查询条件结束值,EXECUTION_: 
	 */
	public void setExecutionEndEqual(Double value)
	 {
		this.executionEndEqual = value;
	}
	
	/**
	 * CFG_: 
	 */
	public Double getCfg() {
		return this.cfg;
	}
	
	/**
	 * CFG_: 
	 */
	public void setCfg(Double value)
	 {
		this.cfg = value;
	}
	
	/**
	 * 查询条件开始值,CFG_: 
	 */
	public Double getCfgBegin() {
		return this.cfgBegin;
	}
	
	/**
	 * 查询条件开始值,CFG_: 
	 */
	public void setCfgBegin(Double value)
	 {
		this.cfgBegin = value;
	}
	
	/**
	 * 查询条件结束值,CFG_: 
	 */
	public Double getCfgEnd() {
		return this.cfgEnd;
	}
	
	/**
	 * 查询条件结束值,CFG_: 
	 */
	public void setCfgEnd(Double value)
	 {
		this.cfgEnd = value;
	}
	
	/**
	 * 查询条件结束值,CFG_: 
	 */
	public Double getCfgEndEqual() {
		return this.cfgEndEqual;
	}
	
	/**
	 * 查询条件结束值,CFG_: 
	 */
	public void setCfgEndEqual(Double value)
	 {
		this.cfgEndEqual = value;
	}
	
	/**
	 * SIGNAL_: 
	 */
	public String getSignal() {
		return this.signal;
	}
	
	/**
	 * SIGNAL_: 
	 */
	public void setSignal(String value)
	 {
		this.signal = value;
	}
	
	/**
	 * 查询条件字符串相等,SIGNAL_: 
	 */
	public String getSignalEqual() {
		return this.signalEqual;
	}
	
	/**
	 * 查询条件字符串相等,SIGNAL_: 
	 */
	public void setSignalEqual(String value)
	 {
		this.signalEqual = value;
	}
	
	/**
	 * EVENT_: 
	 */
	public String getEvent_() {
		return this.event_;
	}
	
	/**
	 * EVENT_: 
	 */
	public void setEvent_(String value)
	 {
		this.event_ = value;
	}
	
	/**
	 * 查询条件字符串相等,EVENT_: 
	 */
	public String getEvent_Equal() {
		return this.event_Equal;
	}
	
	/**
	 * 查询条件字符串相等,EVENT_: 
	 */
	public void setEvent_Equal(String value)
	 {
		this.event_Equal = value;
	}
	
	/**
	 * REPEAT_: 
	 */
	public String getRepeat() {
		return this.repeat;
	}
	
	/**
	 * REPEAT_: 
	 */
	public void setRepeat(String value)
	 {
		this.repeat = value;
	}
	
	/**
	 * 查询条件字符串相等,REPEAT_: 
	 */
	public String getRepeatEqual() {
		return this.repeatEqual;
	}
	
	/**
	 * 查询条件字符串相等,REPEAT_: 
	 */
	public void setRepeatEqual(String value)
	 {
		this.repeatEqual = value;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4JobQueryCondition setDbidCondition(Double value) {
		this.dbid = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4JobQueryCondition setDbidConditionBegin(Double value) {
		this.dbidBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4JobQueryCondition setDbidConditionEnd(Double value) {
		this.dbidEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4JobQueryCondition setDbidConditionEndEqual(Double value) {
		this.dbidEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CLASS_: 
	 */
	public Jbpm4JobQueryCondition setClass_Condition(String value) {
		this.class_ = value;
		return this;
	}
	
	/**
	 * 设置查询条件CLASS_: 
	 */
	public Jbpm4JobQueryCondition setClass_ConditionEqual(String value) {
		this.class_Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4JobQueryCondition setDbversionCondition(Integer value) {
		this.dbversion = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4JobQueryCondition setDbversionConditionBegin(Integer value) {
		this.dbversionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4JobQueryCondition setDbversionConditionEnd(Integer value) {
		this.dbversionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4JobQueryCondition setDbversionConditionEndEqual(Integer value) {
		this.dbversionEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DUEDATE_: 
	 */
	public Jbpm4JobQueryCondition setDuedateCondition(java.util.Date value) {
		this.duedate = value;
		return this;
	}
	
	/**
	 * 设置查询条件DUEDATE_: 
	 */
	public Jbpm4JobQueryCondition setDuedateConditionBegin(java.util.Date value) {
		this.duedateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DUEDATE_: 
	 */
	public Jbpm4JobQueryCondition setDuedateConditionEnd(java.util.Date value) {
		this.duedateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DUEDATE_: 
	 */
	public Jbpm4JobQueryCondition setDuedateConditionEndEqual(java.util.Date value) {
		this.duedateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATE_: 
	 */
	public Jbpm4JobQueryCondition setStateCondition(String value) {
		this.state = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATE_: 
	 */
	public Jbpm4JobQueryCondition setStateConditionEqual(String value) {
		this.stateEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISEXCLUSIVE_: 
	 */
	public Jbpm4JobQueryCondition setIsexclusiveCondition(Byte value) {
		this.isexclusive = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISEXCLUSIVE_: 
	 */
	public Jbpm4JobQueryCondition setIsexclusiveConditionBegin(Byte value) {
		this.isexclusiveBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISEXCLUSIVE_: 
	 */
	public Jbpm4JobQueryCondition setIsexclusiveConditionEnd(Byte value) {
		this.isexclusiveEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISEXCLUSIVE_: 
	 */
	public Jbpm4JobQueryCondition setIsexclusiveConditionEndEqual(Byte value) {
		this.isexclusiveEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOCKOWNER_: 
	 */
	public Jbpm4JobQueryCondition setLockownerCondition(String value) {
		this.lockowner = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOCKOWNER_: 
	 */
	public Jbpm4JobQueryCondition setLockownerConditionEqual(String value) {
		this.lockownerEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOCKEXPTIME_: 
	 */
	public Jbpm4JobQueryCondition setLockexptimeCondition(java.util.Date value) {
		this.lockexptime = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOCKEXPTIME_: 
	 */
	public Jbpm4JobQueryCondition setLockexptimeConditionBegin(java.util.Date value) {
		this.lockexptimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOCKEXPTIME_: 
	 */
	public Jbpm4JobQueryCondition setLockexptimeConditionEnd(java.util.Date value) {
		this.lockexptimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOCKEXPTIME_: 
	 */
	public Jbpm4JobQueryCondition setLockexptimeConditionEndEqual(java.util.Date value) {
		this.lockexptimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXCEPTION_: 
	 */
	public Jbpm4JobQueryCondition setExceptionCondition(String value) {
		this.exception = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXCEPTION_: 
	 */
	public Jbpm4JobQueryCondition setExceptionConditionEqual(String value) {
		this.exceptionEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件RETRIES_: 
	 */
	public Jbpm4JobQueryCondition setRetriesCondition(Integer value) {
		this.retries = value;
		return this;
	}
	
	/**
	 * 设置查询条件RETRIES_: 
	 */
	public Jbpm4JobQueryCondition setRetriesConditionBegin(Integer value) {
		this.retriesBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件RETRIES_: 
	 */
	public Jbpm4JobQueryCondition setRetriesConditionEnd(Integer value) {
		this.retriesEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件RETRIES_: 
	 */
	public Jbpm4JobQueryCondition setRetriesConditionEndEqual(Integer value) {
		this.retriesEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROCESSINSTANCE_: 
	 */
	public Jbpm4JobQueryCondition setProcessinstanceCondition(Double value) {
		this.processinstance = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROCESSINSTANCE_: 
	 */
	public Jbpm4JobQueryCondition setProcessinstanceConditionBegin(Double value) {
		this.processinstanceBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROCESSINSTANCE_: 
	 */
	public Jbpm4JobQueryCondition setProcessinstanceConditionEnd(Double value) {
		this.processinstanceEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROCESSINSTANCE_: 
	 */
	public Jbpm4JobQueryCondition setProcessinstanceConditionEndEqual(Double value) {
		this.processinstanceEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_: 
	 */
	public Jbpm4JobQueryCondition setExecutionCondition(Double value) {
		this.execution = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_: 
	 */
	public Jbpm4JobQueryCondition setExecutionConditionBegin(Double value) {
		this.executionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_: 
	 */
	public Jbpm4JobQueryCondition setExecutionConditionEnd(Double value) {
		this.executionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_: 
	 */
	public Jbpm4JobQueryCondition setExecutionConditionEndEqual(Double value) {
		this.executionEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CFG_: 
	 */
	public Jbpm4JobQueryCondition setCfgCondition(Double value) {
		this.cfg = value;
		return this;
	}
	
	/**
	 * 设置查询条件CFG_: 
	 */
	public Jbpm4JobQueryCondition setCfgConditionBegin(Double value) {
		this.cfgBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CFG_: 
	 */
	public Jbpm4JobQueryCondition setCfgConditionEnd(Double value) {
		this.cfgEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CFG_: 
	 */
	public Jbpm4JobQueryCondition setCfgConditionEndEqual(Double value) {
		this.cfgEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件SIGNAL_: 
	 */
	public Jbpm4JobQueryCondition setSignalCondition(String value) {
		this.signal = value;
		return this;
	}
	
	/**
	 * 设置查询条件SIGNAL_: 
	 */
	public Jbpm4JobQueryCondition setSignalConditionEqual(String value) {
		this.signalEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件EVENT_: 
	 */
	public Jbpm4JobQueryCondition setEvent_Condition(String value) {
		this.event_ = value;
		return this;
	}
	
	/**
	 * 设置查询条件EVENT_: 
	 */
	public Jbpm4JobQueryCondition setEvent_ConditionEqual(String value) {
		this.event_Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件REPEAT_: 
	 */
	public Jbpm4JobQueryCondition setRepeatCondition(String value) {
		this.repeat = value;
		return this;
	}
	
	/**
	 * 设置查询条件REPEAT_: 
	 */
	public Jbpm4JobQueryCondition setRepeatConditionEqual(String value) {
		this.repeatEqual = value;
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
						+ ((" and ([JBPM4_JOB].[DBID_] = " + this.dbid) 
						+ ") "));
		}
		if ((this.dbidBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[DBID_] >= " 
						+ (this.dbidBegin + ")")));
		}
		if ((this.dbidEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[DBID_] < " 
						+ (this.dbidEnd + ") ")));
		}
		if ((this.dbidEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[DBID_] <= " 
						+ (this.dbidEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.class_)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_JOB].[CLASS_]", this.class_)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.class_Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_JOB].[CLASS_] = " + SqlServerUtils.safeSql(this.class_Equal))) 
						+ ") "));
		}
		if ((this.dbversion == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_JOB].[DBVERSION_] = " + this.dbversion) 
						+ ") "));
		}
		if ((this.dbversionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[DBVERSION_] >= " 
						+ (this.dbversionBegin + ")")));
		}
		if ((this.dbversionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[DBVERSION_] < " 
						+ (this.dbversionEnd + ") ")));
		}
		if ((this.dbversionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[DBVERSION_] <= " 
						+ (this.dbversionEndEqual + ") ")));
		}
		if ((this.duedate == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_JOB].[DUEDATE_] = " + SqlServerUtils.getDateSql(this.duedate)) 
						+ ") "));
		}
		if ((this.duedateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[DUEDATE_] >= " 
						+ (SqlServerUtils.getDateSql(this.duedateBegin) + ")")));
		}
		if ((this.duedateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[DUEDATE_] < " 
						+ (SqlServerUtils.getDateSql(this.duedateEnd) + ") ")));
		}
		if ((this.duedateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[DUEDATE_] < " 
						+ (SqlServerUtils.getNextDateSql(this.duedateEndEqual) + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.state)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_JOB].[STATE_]", this.state)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.stateEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_JOB].[STATE_] = " + SqlServerUtils.safeSql(this.stateEqual))) 
						+ ") "));
		}
		if ((this.isexclusive == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_JOB].[ISEXCLUSIVE_] = " + this.isexclusive) 
						+ ") "));
		}
		if ((this.isexclusiveBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[ISEXCLUSIVE_] >= " 
						+ (this.isexclusiveBegin + ")")));
		}
		if ((this.isexclusiveEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[ISEXCLUSIVE_] < " 
						+ (this.isexclusiveEnd + ") ")));
		}
		if ((this.isexclusiveEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[ISEXCLUSIVE_] <= " 
						+ (this.isexclusiveEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.lockowner)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_JOB].[LOCKOWNER_]", this.lockowner)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.lockownerEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_JOB].[LOCKOWNER_] = " + SqlServerUtils.safeSql(this.lockownerEqual))) 
						+ ") "));
		}
		if ((this.lockexptime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_JOB].[LOCKEXPTIME_] = " + SqlServerUtils.getDateSql(this.lockexptime)) 
						+ ") "));
		}
		if ((this.lockexptimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[LOCKEXPTIME_] >= " 
						+ (SqlServerUtils.getDateSql(this.lockexptimeBegin) + ")")));
		}
		if ((this.lockexptimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[LOCKEXPTIME_] < " 
						+ (SqlServerUtils.getDateSql(this.lockexptimeEnd) + ") ")));
		}
		if ((this.lockexptimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[LOCKEXPTIME_] < " 
						+ (SqlServerUtils.getNextDateSql(this.lockexptimeEndEqual) + ") ")));
		}
		if ((this.retries == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_JOB].[RETRIES_] = " + this.retries) 
						+ ") "));
		}
		if ((this.retriesBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[RETRIES_] >= " 
						+ (this.retriesBegin + ")")));
		}
		if ((this.retriesEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[RETRIES_] < " 
						+ (this.retriesEnd + ") ")));
		}
		if ((this.retriesEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[RETRIES_] <= " 
						+ (this.retriesEndEqual + ") ")));
		}
		if ((this.processinstance == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_JOB].[PROCESSINSTANCE_] = " + this.processinstance) 
						+ ") "));
		}
		if ((this.processinstanceBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[PROCESSINSTANCE_] >= " 
						+ (this.processinstanceBegin + ")")));
		}
		if ((this.processinstanceEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[PROCESSINSTANCE_] < " 
						+ (this.processinstanceEnd + ") ")));
		}
		if ((this.processinstanceEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[PROCESSINSTANCE_] <= " 
						+ (this.processinstanceEndEqual + ") ")));
		}
		if ((this.execution == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_JOB].[EXECUTION_] = " + this.execution) 
						+ ") "));
		}
		if ((this.executionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[EXECUTION_] >= " 
						+ (this.executionBegin + ")")));
		}
		if ((this.executionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[EXECUTION_] < " 
						+ (this.executionEnd + ") ")));
		}
		if ((this.executionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[EXECUTION_] <= " 
						+ (this.executionEndEqual + ") ")));
		}
		if ((this.cfg == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_JOB].[CFG_] = " + this.cfg) 
						+ ") "));
		}
		if ((this.cfgBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[CFG_] >= " 
						+ (this.cfgBegin + ")")));
		}
		if ((this.cfgEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[CFG_] < " 
						+ (this.cfgEnd + ") ")));
		}
		if ((this.cfgEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_JOB].[CFG_] <= " 
						+ (this.cfgEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.signal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_JOB].[SIGNAL_]", this.signal)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.signalEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_JOB].[SIGNAL_] = " + SqlServerUtils.safeSql(this.signalEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.event_)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_JOB].[EVENT_]", this.event_)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.event_Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_JOB].[EVENT_] = " + SqlServerUtils.safeSql(this.event_Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.repeat)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_JOB].[REPEAT_]", this.repeat)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.repeatEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_JOB].[REPEAT_] = " + SqlServerUtils.safeSql(this.repeatEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
