package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_TASK查询条件定义
 */
public class Jbpm4TaskQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,NAME_: 
	 */
	String name;
	
	/**
	 * 查询条件字符串相等,NAME_: 
	 */
	String nameEqual;
	
	/**
	 * 查询条件,DESCR_: 
	 */
	String descr;
	
	/**
	 * 查询条件字符串相等,DESCR_: 
	 */
	String descrEqual;
	
	/**
	 * 查询条件,STATE_: 
	 */
	String state;
	
	/**
	 * 查询条件字符串相等,STATE_: 
	 */
	String stateEqual;
	
	/**
	 * 查询条件,SUSPHISTSTATE_: 
	 */
	String susphiststate;
	
	/**
	 * 查询条件字符串相等,SUSPHISTSTATE_: 
	 */
	String susphiststateEqual;
	
	/**
	 * 查询条件,ASSIGNEE_: 
	 */
	String assignee;
	
	/**
	 * 查询条件字符串相等,ASSIGNEE_: 
	 */
	String assigneeEqual;
	
	/**
	 * 查询条件,FORM_: 
	 */
	String form;
	
	/**
	 * 查询条件字符串相等,FORM_: 
	 */
	String formEqual;
	
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
	 * 查询条件,PROGRESS_: 
	 */
	Integer progress;
	
	/**
	 * 查询条件开始值,PROGRESS_: 
	 */
	Integer progressBegin;
	
	/**
	 * 查询条件结束值,PROGRESS_: 
	 */
	Integer progressEnd;
	
	/**
	 * 查询条件结束值,PROGRESS_: 
	 */
	Integer progressEndEqual;
	
	/**
	 * 查询条件,SIGNALLING_: 
	 */
	Byte signalling;
	
	/**
	 * 查询条件开始值,SIGNALLING_: 
	 */
	Byte signallingBegin;
	
	/**
	 * 查询条件结束值,SIGNALLING_: 
	 */
	Byte signallingEnd;
	
	/**
	 * 查询条件结束值,SIGNALLING_: 
	 */
	Byte signallingEndEqual;
	
	/**
	 * 查询条件,EXECUTION_ID_: 
	 */
	String executionId;
	
	/**
	 * 查询条件字符串相等,EXECUTION_ID_: 
	 */
	String executionIdEqual;
	
	/**
	 * 查询条件,ACTIVITY_NAME_: 
	 */
	String activityName;
	
	/**
	 * 查询条件字符串相等,ACTIVITY_NAME_: 
	 */
	String activityNameEqual;
	
	/**
	 * 查询条件,HASVARS_: 
	 */
	Byte hasvars;
	
	/**
	 * 查询条件开始值,HASVARS_: 
	 */
	Byte hasvarsBegin;
	
	/**
	 * 查询条件结束值,HASVARS_: 
	 */
	Byte hasvarsEnd;
	
	/**
	 * 查询条件结束值,HASVARS_: 
	 */
	Byte hasvarsEndEqual;
	
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
	 * 查询条件,PROCINST_: 
	 */
	Double procinst;
	
	/**
	 * 查询条件开始值,PROCINST_: 
	 */
	Double procinstBegin;
	
	/**
	 * 查询条件结束值,PROCINST_: 
	 */
	Double procinstEnd;
	
	/**
	 * 查询条件结束值,PROCINST_: 
	 */
	Double procinstEndEqual;
	
	/**
	 * 查询条件,SWIMLANE_: 
	 */
	Double swimlane;
	
	/**
	 * 查询条件开始值,SWIMLANE_: 
	 */
	Double swimlaneBegin;
	
	/**
	 * 查询条件结束值,SWIMLANE_: 
	 */
	Double swimlaneEnd;
	
	/**
	 * 查询条件结束值,SWIMLANE_: 
	 */
	Double swimlaneEndEqual;
	
	/**
	 * 查询条件,TASKDEFNAME_: 
	 */
	String taskdefname;
	
	/**
	 * 查询条件字符串相等,TASKDEFNAME_: 
	 */
	String taskdefnameEqual;
	
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
	 * NAME_: 
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * NAME_: 
	 */
	public void setName(String value)
	 {
		this.name = value;
	}
	
	/**
	 * 查询条件字符串相等,NAME_: 
	 */
	public String getNameEqual() {
		return this.nameEqual;
	}
	
	/**
	 * 查询条件字符串相等,NAME_: 
	 */
	public void setNameEqual(String value)
	 {
		this.nameEqual = value;
	}
	
	/**
	 * DESCR_: 
	 */
	public String getDescr() {
		return this.descr;
	}
	
	/**
	 * DESCR_: 
	 */
	public void setDescr(String value)
	 {
		this.descr = value;
	}
	
	/**
	 * 查询条件字符串相等,DESCR_: 
	 */
	public String getDescrEqual() {
		return this.descrEqual;
	}
	
	/**
	 * 查询条件字符串相等,DESCR_: 
	 */
	public void setDescrEqual(String value)
	 {
		this.descrEqual = value;
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
	 * SUSPHISTSTATE_: 
	 */
	public String getSusphiststate() {
		return this.susphiststate;
	}
	
	/**
	 * SUSPHISTSTATE_: 
	 */
	public void setSusphiststate(String value)
	 {
		this.susphiststate = value;
	}
	
	/**
	 * 查询条件字符串相等,SUSPHISTSTATE_: 
	 */
	public String getSusphiststateEqual() {
		return this.susphiststateEqual;
	}
	
	/**
	 * 查询条件字符串相等,SUSPHISTSTATE_: 
	 */
	public void setSusphiststateEqual(String value)
	 {
		this.susphiststateEqual = value;
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
	 * FORM_: 
	 */
	public String getForm() {
		return this.form;
	}
	
	/**
	 * FORM_: 
	 */
	public void setForm(String value)
	 {
		this.form = value;
	}
	
	/**
	 * 查询条件字符串相等,FORM_: 
	 */
	public String getFormEqual() {
		return this.formEqual;
	}
	
	/**
	 * 查询条件字符串相等,FORM_: 
	 */
	public void setFormEqual(String value)
	 {
		this.formEqual = value;
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
	 * PROGRESS_: 
	 */
	public Integer getProgress() {
		return this.progress;
	}
	
	/**
	 * PROGRESS_: 
	 */
	public void setProgress(Integer value)
	 {
		this.progress = value;
	}
	
	/**
	 * 查询条件开始值,PROGRESS_: 
	 */
	public Integer getProgressBegin() {
		return this.progressBegin;
	}
	
	/**
	 * 查询条件开始值,PROGRESS_: 
	 */
	public void setProgressBegin(Integer value)
	 {
		this.progressBegin = value;
	}
	
	/**
	 * 查询条件结束值,PROGRESS_: 
	 */
	public Integer getProgressEnd() {
		return this.progressEnd;
	}
	
	/**
	 * 查询条件结束值,PROGRESS_: 
	 */
	public void setProgressEnd(Integer value)
	 {
		this.progressEnd = value;
	}
	
	/**
	 * 查询条件结束值,PROGRESS_: 
	 */
	public Integer getProgressEndEqual() {
		return this.progressEndEqual;
	}
	
	/**
	 * 查询条件结束值,PROGRESS_: 
	 */
	public void setProgressEndEqual(Integer value)
	 {
		this.progressEndEqual = value;
	}
	
	/**
	 * SIGNALLING_: 
	 */
	public Byte getSignalling() {
		return this.signalling;
	}
	
	/**
	 * SIGNALLING_: 
	 */
	public void setSignalling(Byte value)
	 {
		this.signalling = value;
	}
	
	/**
	 * 查询条件开始值,SIGNALLING_: 
	 */
	public Byte getSignallingBegin() {
		return this.signallingBegin;
	}
	
	/**
	 * 查询条件开始值,SIGNALLING_: 
	 */
	public void setSignallingBegin(Byte value)
	 {
		this.signallingBegin = value;
	}
	
	/**
	 * 查询条件结束值,SIGNALLING_: 
	 */
	public Byte getSignallingEnd() {
		return this.signallingEnd;
	}
	
	/**
	 * 查询条件结束值,SIGNALLING_: 
	 */
	public void setSignallingEnd(Byte value)
	 {
		this.signallingEnd = value;
	}
	
	/**
	 * 查询条件结束值,SIGNALLING_: 
	 */
	public Byte getSignallingEndEqual() {
		return this.signallingEndEqual;
	}
	
	/**
	 * 查询条件结束值,SIGNALLING_: 
	 */
	public void setSignallingEndEqual(Byte value)
	 {
		this.signallingEndEqual = value;
	}
	
	/**
	 * EXECUTION_ID_: 
	 */
	public String getExecutionId() {
		return this.executionId;
	}
	
	/**
	 * EXECUTION_ID_: 
	 */
	public void setExecutionId(String value)
	 {
		this.executionId = value;
	}
	
	/**
	 * 查询条件字符串相等,EXECUTION_ID_: 
	 */
	public String getExecutionIdEqual() {
		return this.executionIdEqual;
	}
	
	/**
	 * 查询条件字符串相等,EXECUTION_ID_: 
	 */
	public void setExecutionIdEqual(String value)
	 {
		this.executionIdEqual = value;
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
	 * HASVARS_: 
	 */
	public Byte getHasvars() {
		return this.hasvars;
	}
	
	/**
	 * HASVARS_: 
	 */
	public void setHasvars(Byte value)
	 {
		this.hasvars = value;
	}
	
	/**
	 * 查询条件开始值,HASVARS_: 
	 */
	public Byte getHasvarsBegin() {
		return this.hasvarsBegin;
	}
	
	/**
	 * 查询条件开始值,HASVARS_: 
	 */
	public void setHasvarsBegin(Byte value)
	 {
		this.hasvarsBegin = value;
	}
	
	/**
	 * 查询条件结束值,HASVARS_: 
	 */
	public Byte getHasvarsEnd() {
		return this.hasvarsEnd;
	}
	
	/**
	 * 查询条件结束值,HASVARS_: 
	 */
	public void setHasvarsEnd(Byte value)
	 {
		this.hasvarsEnd = value;
	}
	
	/**
	 * 查询条件结束值,HASVARS_: 
	 */
	public Byte getHasvarsEndEqual() {
		return this.hasvarsEndEqual;
	}
	
	/**
	 * 查询条件结束值,HASVARS_: 
	 */
	public void setHasvarsEndEqual(Byte value)
	 {
		this.hasvarsEndEqual = value;
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
	 * PROCINST_: 
	 */
	public Double getProcinst() {
		return this.procinst;
	}
	
	/**
	 * PROCINST_: 
	 */
	public void setProcinst(Double value)
	 {
		this.procinst = value;
	}
	
	/**
	 * 查询条件开始值,PROCINST_: 
	 */
	public Double getProcinstBegin() {
		return this.procinstBegin;
	}
	
	/**
	 * 查询条件开始值,PROCINST_: 
	 */
	public void setProcinstBegin(Double value)
	 {
		this.procinstBegin = value;
	}
	
	/**
	 * 查询条件结束值,PROCINST_: 
	 */
	public Double getProcinstEnd() {
		return this.procinstEnd;
	}
	
	/**
	 * 查询条件结束值,PROCINST_: 
	 */
	public void setProcinstEnd(Double value)
	 {
		this.procinstEnd = value;
	}
	
	/**
	 * 查询条件结束值,PROCINST_: 
	 */
	public Double getProcinstEndEqual() {
		return this.procinstEndEqual;
	}
	
	/**
	 * 查询条件结束值,PROCINST_: 
	 */
	public void setProcinstEndEqual(Double value)
	 {
		this.procinstEndEqual = value;
	}
	
	/**
	 * SWIMLANE_: 
	 */
	public Double getSwimlane() {
		return this.swimlane;
	}
	
	/**
	 * SWIMLANE_: 
	 */
	public void setSwimlane(Double value)
	 {
		this.swimlane = value;
	}
	
	/**
	 * 查询条件开始值,SWIMLANE_: 
	 */
	public Double getSwimlaneBegin() {
		return this.swimlaneBegin;
	}
	
	/**
	 * 查询条件开始值,SWIMLANE_: 
	 */
	public void setSwimlaneBegin(Double value)
	 {
		this.swimlaneBegin = value;
	}
	
	/**
	 * 查询条件结束值,SWIMLANE_: 
	 */
	public Double getSwimlaneEnd() {
		return this.swimlaneEnd;
	}
	
	/**
	 * 查询条件结束值,SWIMLANE_: 
	 */
	public void setSwimlaneEnd(Double value)
	 {
		this.swimlaneEnd = value;
	}
	
	/**
	 * 查询条件结束值,SWIMLANE_: 
	 */
	public Double getSwimlaneEndEqual() {
		return this.swimlaneEndEqual;
	}
	
	/**
	 * 查询条件结束值,SWIMLANE_: 
	 */
	public void setSwimlaneEndEqual(Double value)
	 {
		this.swimlaneEndEqual = value;
	}
	
	/**
	 * TASKDEFNAME_: 
	 */
	public String getTaskdefname() {
		return this.taskdefname;
	}
	
	/**
	 * TASKDEFNAME_: 
	 */
	public void setTaskdefname(String value)
	 {
		this.taskdefname = value;
	}
	
	/**
	 * 查询条件字符串相等,TASKDEFNAME_: 
	 */
	public String getTaskdefnameEqual() {
		return this.taskdefnameEqual;
	}
	
	/**
	 * 查询条件字符串相等,TASKDEFNAME_: 
	 */
	public void setTaskdefnameEqual(String value)
	 {
		this.taskdefnameEqual = value;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4TaskQueryCondition setDbidCondition(Double value) {
		this.dbid = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4TaskQueryCondition setDbidConditionBegin(Double value) {
		this.dbidBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4TaskQueryCondition setDbidConditionEnd(Double value) {
		this.dbidEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4TaskQueryCondition setDbidConditionEndEqual(Double value) {
		this.dbidEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CLASS_: 
	 */
	public Jbpm4TaskQueryCondition setClass_Condition(String value) {
		this.class_ = value;
		return this;
	}
	
	/**
	 * 设置查询条件CLASS_: 
	 */
	public Jbpm4TaskQueryCondition setClass_ConditionEqual(String value) {
		this.class_Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4TaskQueryCondition setDbversionCondition(Integer value) {
		this.dbversion = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4TaskQueryCondition setDbversionConditionBegin(Integer value) {
		this.dbversionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4TaskQueryCondition setDbversionConditionEnd(Integer value) {
		this.dbversionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4TaskQueryCondition setDbversionConditionEndEqual(Integer value) {
		this.dbversionEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAME_: 
	 */
	public Jbpm4TaskQueryCondition setNameCondition(String value) {
		this.name = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAME_: 
	 */
	public Jbpm4TaskQueryCondition setNameConditionEqual(String value) {
		this.nameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DESCR_: 
	 */
	public Jbpm4TaskQueryCondition setDescrCondition(String value) {
		this.descr = value;
		return this;
	}
	
	/**
	 * 设置查询条件DESCR_: 
	 */
	public Jbpm4TaskQueryCondition setDescrConditionEqual(String value) {
		this.descrEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATE_: 
	 */
	public Jbpm4TaskQueryCondition setStateCondition(String value) {
		this.state = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATE_: 
	 */
	public Jbpm4TaskQueryCondition setStateConditionEqual(String value) {
		this.stateEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件SUSPHISTSTATE_: 
	 */
	public Jbpm4TaskQueryCondition setSusphiststateCondition(String value) {
		this.susphiststate = value;
		return this;
	}
	
	/**
	 * 设置查询条件SUSPHISTSTATE_: 
	 */
	public Jbpm4TaskQueryCondition setSusphiststateConditionEqual(String value) {
		this.susphiststateEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ASSIGNEE_: 
	 */
	public Jbpm4TaskQueryCondition setAssigneeCondition(String value) {
		this.assignee = value;
		return this;
	}
	
	/**
	 * 设置查询条件ASSIGNEE_: 
	 */
	public Jbpm4TaskQueryCondition setAssigneeConditionEqual(String value) {
		this.assigneeEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件FORM_: 
	 */
	public Jbpm4TaskQueryCondition setFormCondition(String value) {
		this.form = value;
		return this;
	}
	
	/**
	 * 设置查询条件FORM_: 
	 */
	public Jbpm4TaskQueryCondition setFormConditionEqual(String value) {
		this.formEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITY_: 
	 */
	public Jbpm4TaskQueryCondition setPriorityCondition(Integer value) {
		this.priority = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITY_: 
	 */
	public Jbpm4TaskQueryCondition setPriorityConditionBegin(Integer value) {
		this.priorityBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITY_: 
	 */
	public Jbpm4TaskQueryCondition setPriorityConditionEnd(Integer value) {
		this.priorityEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITY_: 
	 */
	public Jbpm4TaskQueryCondition setPriorityConditionEndEqual(Integer value) {
		this.priorityEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_: 
	 */
	public Jbpm4TaskQueryCondition setCreateCondition(java.util.Date value) {
		this.create = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_: 
	 */
	public Jbpm4TaskQueryCondition setCreateConditionBegin(java.util.Date value) {
		this.createBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_: 
	 */
	public Jbpm4TaskQueryCondition setCreateConditionEnd(java.util.Date value) {
		this.createEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_: 
	 */
	public Jbpm4TaskQueryCondition setCreateConditionEndEqual(java.util.Date value) {
		this.createEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DUEDATE_: 
	 */
	public Jbpm4TaskQueryCondition setDuedateCondition(java.util.Date value) {
		this.duedate = value;
		return this;
	}
	
	/**
	 * 设置查询条件DUEDATE_: 
	 */
	public Jbpm4TaskQueryCondition setDuedateConditionBegin(java.util.Date value) {
		this.duedateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DUEDATE_: 
	 */
	public Jbpm4TaskQueryCondition setDuedateConditionEnd(java.util.Date value) {
		this.duedateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DUEDATE_: 
	 */
	public Jbpm4TaskQueryCondition setDuedateConditionEndEqual(java.util.Date value) {
		this.duedateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROGRESS_: 
	 */
	public Jbpm4TaskQueryCondition setProgressCondition(Integer value) {
		this.progress = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROGRESS_: 
	 */
	public Jbpm4TaskQueryCondition setProgressConditionBegin(Integer value) {
		this.progressBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROGRESS_: 
	 */
	public Jbpm4TaskQueryCondition setProgressConditionEnd(Integer value) {
		this.progressEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROGRESS_: 
	 */
	public Jbpm4TaskQueryCondition setProgressConditionEndEqual(Integer value) {
		this.progressEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件SIGNALLING_: 
	 */
	public Jbpm4TaskQueryCondition setSignallingCondition(Byte value) {
		this.signalling = value;
		return this;
	}
	
	/**
	 * 设置查询条件SIGNALLING_: 
	 */
	public Jbpm4TaskQueryCondition setSignallingConditionBegin(Byte value) {
		this.signallingBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件SIGNALLING_: 
	 */
	public Jbpm4TaskQueryCondition setSignallingConditionEnd(Byte value) {
		this.signallingEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件SIGNALLING_: 
	 */
	public Jbpm4TaskQueryCondition setSignallingConditionEndEqual(Byte value) {
		this.signallingEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_ID_: 
	 */
	public Jbpm4TaskQueryCondition setExecutionIdCondition(String value) {
		this.executionId = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_ID_: 
	 */
	public Jbpm4TaskQueryCondition setExecutionIdConditionEqual(String value) {
		this.executionIdEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ACTIVITY_NAME_: 
	 */
	public Jbpm4TaskQueryCondition setActivityNameCondition(String value) {
		this.activityName = value;
		return this;
	}
	
	/**
	 * 设置查询条件ACTIVITY_NAME_: 
	 */
	public Jbpm4TaskQueryCondition setActivityNameConditionEqual(String value) {
		this.activityNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件HASVARS_: 
	 */
	public Jbpm4TaskQueryCondition setHasvarsCondition(Byte value) {
		this.hasvars = value;
		return this;
	}
	
	/**
	 * 设置查询条件HASVARS_: 
	 */
	public Jbpm4TaskQueryCondition setHasvarsConditionBegin(Byte value) {
		this.hasvarsBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件HASVARS_: 
	 */
	public Jbpm4TaskQueryCondition setHasvarsConditionEnd(Byte value) {
		this.hasvarsEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件HASVARS_: 
	 */
	public Jbpm4TaskQueryCondition setHasvarsConditionEndEqual(Byte value) {
		this.hasvarsEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件SUPERTASK_: 
	 */
	public Jbpm4TaskQueryCondition setSupertaskCondition(Double value) {
		this.supertask = value;
		return this;
	}
	
	/**
	 * 设置查询条件SUPERTASK_: 
	 */
	public Jbpm4TaskQueryCondition setSupertaskConditionBegin(Double value) {
		this.supertaskBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件SUPERTASK_: 
	 */
	public Jbpm4TaskQueryCondition setSupertaskConditionEnd(Double value) {
		this.supertaskEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件SUPERTASK_: 
	 */
	public Jbpm4TaskQueryCondition setSupertaskConditionEndEqual(Double value) {
		this.supertaskEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_: 
	 */
	public Jbpm4TaskQueryCondition setExecutionCondition(Double value) {
		this.execution = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_: 
	 */
	public Jbpm4TaskQueryCondition setExecutionConditionBegin(Double value) {
		this.executionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_: 
	 */
	public Jbpm4TaskQueryCondition setExecutionConditionEnd(Double value) {
		this.executionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_: 
	 */
	public Jbpm4TaskQueryCondition setExecutionConditionEndEqual(Double value) {
		this.executionEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROCINST_: 
	 */
	public Jbpm4TaskQueryCondition setProcinstCondition(Double value) {
		this.procinst = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROCINST_: 
	 */
	public Jbpm4TaskQueryCondition setProcinstConditionBegin(Double value) {
		this.procinstBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROCINST_: 
	 */
	public Jbpm4TaskQueryCondition setProcinstConditionEnd(Double value) {
		this.procinstEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROCINST_: 
	 */
	public Jbpm4TaskQueryCondition setProcinstConditionEndEqual(Double value) {
		this.procinstEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件SWIMLANE_: 
	 */
	public Jbpm4TaskQueryCondition setSwimlaneCondition(Double value) {
		this.swimlane = value;
		return this;
	}
	
	/**
	 * 设置查询条件SWIMLANE_: 
	 */
	public Jbpm4TaskQueryCondition setSwimlaneConditionBegin(Double value) {
		this.swimlaneBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件SWIMLANE_: 
	 */
	public Jbpm4TaskQueryCondition setSwimlaneConditionEnd(Double value) {
		this.swimlaneEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件SWIMLANE_: 
	 */
	public Jbpm4TaskQueryCondition setSwimlaneConditionEndEqual(Double value) {
		this.swimlaneEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASKDEFNAME_: 
	 */
	public Jbpm4TaskQueryCondition setTaskdefnameCondition(String value) {
		this.taskdefname = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASKDEFNAME_: 
	 */
	public Jbpm4TaskQueryCondition setTaskdefnameConditionEqual(String value) {
		this.taskdefnameEqual = value;
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
						+ ((" and ([JBPM4_TASK].[DBID_] = " + this.dbid) 
						+ ") "));
		}
		if ((this.dbidBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[DBID_] >= " 
						+ (this.dbidBegin + ")")));
		}
		if ((this.dbidEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[DBID_] < " 
						+ (this.dbidEnd + ") ")));
		}
		if ((this.dbidEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[DBID_] <= " 
						+ (this.dbidEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.class_)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_TASK].[CLASS_]", this.class_)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.class_Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_TASK].[CLASS_] = " + SqlServerUtils.safeSql(this.class_Equal))) 
						+ ") "));
		}
		if ((this.dbversion == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_TASK].[DBVERSION_] = " + this.dbversion) 
						+ ") "));
		}
		if ((this.dbversionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[DBVERSION_] >= " 
						+ (this.dbversionBegin + ")")));
		}
		if ((this.dbversionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[DBVERSION_] < " 
						+ (this.dbversionEnd + ") ")));
		}
		if ((this.dbversionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[DBVERSION_] <= " 
						+ (this.dbversionEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.name)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_TASK].[NAME_]", this.name)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.nameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_TASK].[NAME_] = " + SqlServerUtils.safeSql(this.nameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.state)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_TASK].[STATE_]", this.state)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.stateEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_TASK].[STATE_] = " + SqlServerUtils.safeSql(this.stateEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.susphiststate)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_TASK].[SUSPHISTSTATE_]", this.susphiststate)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.susphiststateEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_TASK].[SUSPHISTSTATE_] = " + SqlServerUtils.safeSql(this.susphiststateEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.assignee)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_TASK].[ASSIGNEE_]", this.assignee)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.assigneeEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_TASK].[ASSIGNEE_] = " + SqlServerUtils.safeSql(this.assigneeEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.form)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_TASK].[FORM_]", this.form)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.formEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_TASK].[FORM_] = " + SqlServerUtils.safeSql(this.formEqual))) 
						+ ") "));
		}
		if ((this.priority == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_TASK].[PRIORITY_] = " + this.priority) 
						+ ") "));
		}
		if ((this.priorityBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[PRIORITY_] >= " 
						+ (this.priorityBegin + ")")));
		}
		if ((this.priorityEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[PRIORITY_] < " 
						+ (this.priorityEnd + ") ")));
		}
		if ((this.priorityEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[PRIORITY_] <= " 
						+ (this.priorityEndEqual + ") ")));
		}
		if ((this.create == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_TASK].[CREATE_] = " + SqlServerUtils.getDateSql(this.create)) 
						+ ") "));
		}
		if ((this.createBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[CREATE_] >= " 
						+ (SqlServerUtils.getDateSql(this.createBegin) + ")")));
		}
		if ((this.createEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[CREATE_] < " 
						+ (SqlServerUtils.getDateSql(this.createEnd) + ") ")));
		}
		if ((this.createEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[CREATE_] < " 
						+ (SqlServerUtils.getNextDateSql(this.createEndEqual) + ") ")));
		}
		if ((this.duedate == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_TASK].[DUEDATE_] = " + SqlServerUtils.getDateSql(this.duedate)) 
						+ ") "));
		}
		if ((this.duedateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[DUEDATE_] >= " 
						+ (SqlServerUtils.getDateSql(this.duedateBegin) + ")")));
		}
		if ((this.duedateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[DUEDATE_] < " 
						+ (SqlServerUtils.getDateSql(this.duedateEnd) + ") ")));
		}
		if ((this.duedateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[DUEDATE_] < " 
						+ (SqlServerUtils.getNextDateSql(this.duedateEndEqual) + ") ")));
		}
		if ((this.progress == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_TASK].[PROGRESS_] = " + this.progress) 
						+ ") "));
		}
		if ((this.progressBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[PROGRESS_] >= " 
						+ (this.progressBegin + ")")));
		}
		if ((this.progressEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[PROGRESS_] < " 
						+ (this.progressEnd + ") ")));
		}
		if ((this.progressEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[PROGRESS_] <= " 
						+ (this.progressEndEqual + ") ")));
		}
		if ((this.signalling == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_TASK].[SIGNALLING_] = " + this.signalling) 
						+ ") "));
		}
		if ((this.signallingBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[SIGNALLING_] >= " 
						+ (this.signallingBegin + ")")));
		}
		if ((this.signallingEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[SIGNALLING_] < " 
						+ (this.signallingEnd + ") ")));
		}
		if ((this.signallingEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[SIGNALLING_] <= " 
						+ (this.signallingEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.executionId)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_TASK].[EXECUTION_ID_]", this.executionId)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.executionIdEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_TASK].[EXECUTION_ID_] = " + SqlServerUtils.safeSql(this.executionIdEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.activityName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_TASK].[ACTIVITY_NAME_]", this.activityName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.activityNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_TASK].[ACTIVITY_NAME_] = " + SqlServerUtils.safeSql(this.activityNameEqual))) 
						+ ") "));
		}
		if ((this.hasvars == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_TASK].[HASVARS_] = " + this.hasvars) 
						+ ") "));
		}
		if ((this.hasvarsBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[HASVARS_] >= " 
						+ (this.hasvarsBegin + ")")));
		}
		if ((this.hasvarsEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[HASVARS_] < " 
						+ (this.hasvarsEnd + ") ")));
		}
		if ((this.hasvarsEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[HASVARS_] <= " 
						+ (this.hasvarsEndEqual + ") ")));
		}
		if ((this.supertask == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_TASK].[SUPERTASK_] = " + this.supertask) 
						+ ") "));
		}
		if ((this.supertaskBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[SUPERTASK_] >= " 
						+ (this.supertaskBegin + ")")));
		}
		if ((this.supertaskEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[SUPERTASK_] < " 
						+ (this.supertaskEnd + ") ")));
		}
		if ((this.supertaskEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[SUPERTASK_] <= " 
						+ (this.supertaskEndEqual + ") ")));
		}
		if ((this.execution == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_TASK].[EXECUTION_] = " + this.execution) 
						+ ") "));
		}
		if ((this.executionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[EXECUTION_] >= " 
						+ (this.executionBegin + ")")));
		}
		if ((this.executionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[EXECUTION_] < " 
						+ (this.executionEnd + ") ")));
		}
		if ((this.executionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[EXECUTION_] <= " 
						+ (this.executionEndEqual + ") ")));
		}
		if ((this.procinst == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_TASK].[PROCINST_] = " + this.procinst) 
						+ ") "));
		}
		if ((this.procinstBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[PROCINST_] >= " 
						+ (this.procinstBegin + ")")));
		}
		if ((this.procinstEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[PROCINST_] < " 
						+ (this.procinstEnd + ") ")));
		}
		if ((this.procinstEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[PROCINST_] <= " 
						+ (this.procinstEndEqual + ") ")));
		}
		if ((this.swimlane == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_TASK].[SWIMLANE_] = " + this.swimlane) 
						+ ") "));
		}
		if ((this.swimlaneBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[SWIMLANE_] >= " 
						+ (this.swimlaneBegin + ")")));
		}
		if ((this.swimlaneEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[SWIMLANE_] < " 
						+ (this.swimlaneEnd + ") ")));
		}
		if ((this.swimlaneEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_TASK].[SWIMLANE_] <= " 
						+ (this.swimlaneEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.taskdefname)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_TASK].[TASKDEFNAME_]", this.taskdefname)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.taskdefnameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_TASK].[TASKDEFNAME_] = " + SqlServerUtils.safeSql(this.taskdefnameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
