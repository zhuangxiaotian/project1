package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_EXECUTION查询条件定义
 */
public class Jbpm4ExecutionQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,ACTIVITYNAME_: 
	 */
	String activityname;
	
	/**
	 * 查询条件字符串相等,ACTIVITYNAME_: 
	 */
	String activitynameEqual;
	
	/**
	 * 查询条件,PROCDEFID_: 
	 */
	String procdefid;
	
	/**
	 * 查询条件字符串相等,PROCDEFID_: 
	 */
	String procdefidEqual;
	
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
	 * 查询条件,NAME_: 
	 */
	String name;
	
	/**
	 * 查询条件字符串相等,NAME_: 
	 */
	String nameEqual;
	
	/**
	 * 查询条件,KEY_: 
	 */
	String key;
	
	/**
	 * 查询条件字符串相等,KEY_: 
	 */
	String keyEqual;
	
	/**
	 * 查询条件,ID_: 
	 */
	String id;
	
	/**
	 * 查询条件字符串相等,ID_: 
	 */
	String idEqual;
	
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
	 * 查询条件,HISACTINST_: 
	 */
	Double hisactinst;
	
	/**
	 * 查询条件开始值,HISACTINST_: 
	 */
	Double hisactinstBegin;
	
	/**
	 * 查询条件结束值,HISACTINST_: 
	 */
	Double hisactinstEnd;
	
	/**
	 * 查询条件结束值,HISACTINST_: 
	 */
	Double hisactinstEndEqual;
	
	/**
	 * 查询条件,PARENT_: 
	 */
	Double parent;
	
	/**
	 * 查询条件开始值,PARENT_: 
	 */
	Double parentBegin;
	
	/**
	 * 查询条件结束值,PARENT_: 
	 */
	Double parentEnd;
	
	/**
	 * 查询条件结束值,PARENT_: 
	 */
	Double parentEndEqual;
	
	/**
	 * 查询条件,INSTANCE_: 
	 */
	Double instance;
	
	/**
	 * 查询条件开始值,INSTANCE_: 
	 */
	Double instanceBegin;
	
	/**
	 * 查询条件结束值,INSTANCE_: 
	 */
	Double instanceEnd;
	
	/**
	 * 查询条件结束值,INSTANCE_: 
	 */
	Double instanceEndEqual;
	
	/**
	 * 查询条件,SUPEREXEC_: 
	 */
	Double superexec;
	
	/**
	 * 查询条件开始值,SUPEREXEC_: 
	 */
	Double superexecBegin;
	
	/**
	 * 查询条件结束值,SUPEREXEC_: 
	 */
	Double superexecEnd;
	
	/**
	 * 查询条件结束值,SUPEREXEC_: 
	 */
	Double superexecEndEqual;
	
	/**
	 * 查询条件,SUBPROCINST_: 
	 */
	Double subprocinst;
	
	/**
	 * 查询条件开始值,SUBPROCINST_: 
	 */
	Double subprocinstBegin;
	
	/**
	 * 查询条件结束值,SUBPROCINST_: 
	 */
	Double subprocinstEnd;
	
	/**
	 * 查询条件结束值,SUBPROCINST_: 
	 */
	Double subprocinstEndEqual;
	
	/**
	 * 查询条件,PARENT_IDX_: 
	 */
	Integer parentIdx;
	
	/**
	 * 查询条件开始值,PARENT_IDX_: 
	 */
	Integer parentIdxBegin;
	
	/**
	 * 查询条件结束值,PARENT_IDX_: 
	 */
	Integer parentIdxEnd;
	
	/**
	 * 查询条件结束值,PARENT_IDX_: 
	 */
	Integer parentIdxEndEqual;
	
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
	 * ACTIVITYNAME_: 
	 */
	public String getActivityname() {
		return this.activityname;
	}
	
	/**
	 * ACTIVITYNAME_: 
	 */
	public void setActivityname(String value)
	 {
		this.activityname = value;
	}
	
	/**
	 * 查询条件字符串相等,ACTIVITYNAME_: 
	 */
	public String getActivitynameEqual() {
		return this.activitynameEqual;
	}
	
	/**
	 * 查询条件字符串相等,ACTIVITYNAME_: 
	 */
	public void setActivitynameEqual(String value)
	 {
		this.activitynameEqual = value;
	}
	
	/**
	 * PROCDEFID_: 
	 */
	public String getProcdefid() {
		return this.procdefid;
	}
	
	/**
	 * PROCDEFID_: 
	 */
	public void setProcdefid(String value)
	 {
		this.procdefid = value;
	}
	
	/**
	 * 查询条件字符串相等,PROCDEFID_: 
	 */
	public String getProcdefidEqual() {
		return this.procdefidEqual;
	}
	
	/**
	 * 查询条件字符串相等,PROCDEFID_: 
	 */
	public void setProcdefidEqual(String value)
	 {
		this.procdefidEqual = value;
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
	 * KEY_: 
	 */
	public String getKey() {
		return this.key;
	}
	
	/**
	 * KEY_: 
	 */
	public void setKey(String value)
	 {
		this.key = value;
	}
	
	/**
	 * 查询条件字符串相等,KEY_: 
	 */
	public String getKeyEqual() {
		return this.keyEqual;
	}
	
	/**
	 * 查询条件字符串相等,KEY_: 
	 */
	public void setKeyEqual(String value)
	 {
		this.keyEqual = value;
	}
	
	/**
	 * ID_: 
	 */
	public String getId() {
		return this.id;
	}
	
	/**
	 * ID_: 
	 */
	public void setId(String value)
	 {
		this.id = value;
	}
	
	/**
	 * 查询条件字符串相等,ID_: 
	 */
	public String getIdEqual() {
		return this.idEqual;
	}
	
	/**
	 * 查询条件字符串相等,ID_: 
	 */
	public void setIdEqual(String value)
	 {
		this.idEqual = value;
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
	 * HISACTINST_: 
	 */
	public Double getHisactinst() {
		return this.hisactinst;
	}
	
	/**
	 * HISACTINST_: 
	 */
	public void setHisactinst(Double value)
	 {
		this.hisactinst = value;
	}
	
	/**
	 * 查询条件开始值,HISACTINST_: 
	 */
	public Double getHisactinstBegin() {
		return this.hisactinstBegin;
	}
	
	/**
	 * 查询条件开始值,HISACTINST_: 
	 */
	public void setHisactinstBegin(Double value)
	 {
		this.hisactinstBegin = value;
	}
	
	/**
	 * 查询条件结束值,HISACTINST_: 
	 */
	public Double getHisactinstEnd() {
		return this.hisactinstEnd;
	}
	
	/**
	 * 查询条件结束值,HISACTINST_: 
	 */
	public void setHisactinstEnd(Double value)
	 {
		this.hisactinstEnd = value;
	}
	
	/**
	 * 查询条件结束值,HISACTINST_: 
	 */
	public Double getHisactinstEndEqual() {
		return this.hisactinstEndEqual;
	}
	
	/**
	 * 查询条件结束值,HISACTINST_: 
	 */
	public void setHisactinstEndEqual(Double value)
	 {
		this.hisactinstEndEqual = value;
	}
	
	/**
	 * PARENT_: 
	 */
	public Double getParent() {
		return this.parent;
	}
	
	/**
	 * PARENT_: 
	 */
	public void setParent(Double value)
	 {
		this.parent = value;
	}
	
	/**
	 * 查询条件开始值,PARENT_: 
	 */
	public Double getParentBegin() {
		return this.parentBegin;
	}
	
	/**
	 * 查询条件开始值,PARENT_: 
	 */
	public void setParentBegin(Double value)
	 {
		this.parentBegin = value;
	}
	
	/**
	 * 查询条件结束值,PARENT_: 
	 */
	public Double getParentEnd() {
		return this.parentEnd;
	}
	
	/**
	 * 查询条件结束值,PARENT_: 
	 */
	public void setParentEnd(Double value)
	 {
		this.parentEnd = value;
	}
	
	/**
	 * 查询条件结束值,PARENT_: 
	 */
	public Double getParentEndEqual() {
		return this.parentEndEqual;
	}
	
	/**
	 * 查询条件结束值,PARENT_: 
	 */
	public void setParentEndEqual(Double value)
	 {
		this.parentEndEqual = value;
	}
	
	/**
	 * INSTANCE_: 
	 */
	public Double getInstance() {
		return this.instance;
	}
	
	/**
	 * INSTANCE_: 
	 */
	public void setInstance(Double value)
	 {
		this.instance = value;
	}
	
	/**
	 * 查询条件开始值,INSTANCE_: 
	 */
	public Double getInstanceBegin() {
		return this.instanceBegin;
	}
	
	/**
	 * 查询条件开始值,INSTANCE_: 
	 */
	public void setInstanceBegin(Double value)
	 {
		this.instanceBegin = value;
	}
	
	/**
	 * 查询条件结束值,INSTANCE_: 
	 */
	public Double getInstanceEnd() {
		return this.instanceEnd;
	}
	
	/**
	 * 查询条件结束值,INSTANCE_: 
	 */
	public void setInstanceEnd(Double value)
	 {
		this.instanceEnd = value;
	}
	
	/**
	 * 查询条件结束值,INSTANCE_: 
	 */
	public Double getInstanceEndEqual() {
		return this.instanceEndEqual;
	}
	
	/**
	 * 查询条件结束值,INSTANCE_: 
	 */
	public void setInstanceEndEqual(Double value)
	 {
		this.instanceEndEqual = value;
	}
	
	/**
	 * SUPEREXEC_: 
	 */
	public Double getSuperexec() {
		return this.superexec;
	}
	
	/**
	 * SUPEREXEC_: 
	 */
	public void setSuperexec(Double value)
	 {
		this.superexec = value;
	}
	
	/**
	 * 查询条件开始值,SUPEREXEC_: 
	 */
	public Double getSuperexecBegin() {
		return this.superexecBegin;
	}
	
	/**
	 * 查询条件开始值,SUPEREXEC_: 
	 */
	public void setSuperexecBegin(Double value)
	 {
		this.superexecBegin = value;
	}
	
	/**
	 * 查询条件结束值,SUPEREXEC_: 
	 */
	public Double getSuperexecEnd() {
		return this.superexecEnd;
	}
	
	/**
	 * 查询条件结束值,SUPEREXEC_: 
	 */
	public void setSuperexecEnd(Double value)
	 {
		this.superexecEnd = value;
	}
	
	/**
	 * 查询条件结束值,SUPEREXEC_: 
	 */
	public Double getSuperexecEndEqual() {
		return this.superexecEndEqual;
	}
	
	/**
	 * 查询条件结束值,SUPEREXEC_: 
	 */
	public void setSuperexecEndEqual(Double value)
	 {
		this.superexecEndEqual = value;
	}
	
	/**
	 * SUBPROCINST_: 
	 */
	public Double getSubprocinst() {
		return this.subprocinst;
	}
	
	/**
	 * SUBPROCINST_: 
	 */
	public void setSubprocinst(Double value)
	 {
		this.subprocinst = value;
	}
	
	/**
	 * 查询条件开始值,SUBPROCINST_: 
	 */
	public Double getSubprocinstBegin() {
		return this.subprocinstBegin;
	}
	
	/**
	 * 查询条件开始值,SUBPROCINST_: 
	 */
	public void setSubprocinstBegin(Double value)
	 {
		this.subprocinstBegin = value;
	}
	
	/**
	 * 查询条件结束值,SUBPROCINST_: 
	 */
	public Double getSubprocinstEnd() {
		return this.subprocinstEnd;
	}
	
	/**
	 * 查询条件结束值,SUBPROCINST_: 
	 */
	public void setSubprocinstEnd(Double value)
	 {
		this.subprocinstEnd = value;
	}
	
	/**
	 * 查询条件结束值,SUBPROCINST_: 
	 */
	public Double getSubprocinstEndEqual() {
		return this.subprocinstEndEqual;
	}
	
	/**
	 * 查询条件结束值,SUBPROCINST_: 
	 */
	public void setSubprocinstEndEqual(Double value)
	 {
		this.subprocinstEndEqual = value;
	}
	
	/**
	 * PARENT_IDX_: 
	 */
	public Integer getParentIdx() {
		return this.parentIdx;
	}
	
	/**
	 * PARENT_IDX_: 
	 */
	public void setParentIdx(Integer value)
	 {
		this.parentIdx = value;
	}
	
	/**
	 * 查询条件开始值,PARENT_IDX_: 
	 */
	public Integer getParentIdxBegin() {
		return this.parentIdxBegin;
	}
	
	/**
	 * 查询条件开始值,PARENT_IDX_: 
	 */
	public void setParentIdxBegin(Integer value)
	 {
		this.parentIdxBegin = value;
	}
	
	/**
	 * 查询条件结束值,PARENT_IDX_: 
	 */
	public Integer getParentIdxEnd() {
		return this.parentIdxEnd;
	}
	
	/**
	 * 查询条件结束值,PARENT_IDX_: 
	 */
	public void setParentIdxEnd(Integer value)
	 {
		this.parentIdxEnd = value;
	}
	
	/**
	 * 查询条件结束值,PARENT_IDX_: 
	 */
	public Integer getParentIdxEndEqual() {
		return this.parentIdxEndEqual;
	}
	
	/**
	 * 查询条件结束值,PARENT_IDX_: 
	 */
	public void setParentIdxEndEqual(Integer value)
	 {
		this.parentIdxEndEqual = value;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4ExecutionQueryCondition setDbidCondition(Double value) {
		this.dbid = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4ExecutionQueryCondition setDbidConditionBegin(Double value) {
		this.dbidBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4ExecutionQueryCondition setDbidConditionEnd(Double value) {
		this.dbidEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4ExecutionQueryCondition setDbidConditionEndEqual(Double value) {
		this.dbidEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CLASS_: 
	 */
	public Jbpm4ExecutionQueryCondition setClass_Condition(String value) {
		this.class_ = value;
		return this;
	}
	
	/**
	 * 设置查询条件CLASS_: 
	 */
	public Jbpm4ExecutionQueryCondition setClass_ConditionEqual(String value) {
		this.class_Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4ExecutionQueryCondition setDbversionCondition(Integer value) {
		this.dbversion = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4ExecutionQueryCondition setDbversionConditionBegin(Integer value) {
		this.dbversionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4ExecutionQueryCondition setDbversionConditionEnd(Integer value) {
		this.dbversionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4ExecutionQueryCondition setDbversionConditionEndEqual(Integer value) {
		this.dbversionEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ACTIVITYNAME_: 
	 */
	public Jbpm4ExecutionQueryCondition setActivitynameCondition(String value) {
		this.activityname = value;
		return this;
	}
	
	/**
	 * 设置查询条件ACTIVITYNAME_: 
	 */
	public Jbpm4ExecutionQueryCondition setActivitynameConditionEqual(String value) {
		this.activitynameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROCDEFID_: 
	 */
	public Jbpm4ExecutionQueryCondition setProcdefidCondition(String value) {
		this.procdefid = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROCDEFID_: 
	 */
	public Jbpm4ExecutionQueryCondition setProcdefidConditionEqual(String value) {
		this.procdefidEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件HASVARS_: 
	 */
	public Jbpm4ExecutionQueryCondition setHasvarsCondition(Byte value) {
		this.hasvars = value;
		return this;
	}
	
	/**
	 * 设置查询条件HASVARS_: 
	 */
	public Jbpm4ExecutionQueryCondition setHasvarsConditionBegin(Byte value) {
		this.hasvarsBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件HASVARS_: 
	 */
	public Jbpm4ExecutionQueryCondition setHasvarsConditionEnd(Byte value) {
		this.hasvarsEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件HASVARS_: 
	 */
	public Jbpm4ExecutionQueryCondition setHasvarsConditionEndEqual(Byte value) {
		this.hasvarsEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAME_: 
	 */
	public Jbpm4ExecutionQueryCondition setNameCondition(String value) {
		this.name = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAME_: 
	 */
	public Jbpm4ExecutionQueryCondition setNameConditionEqual(String value) {
		this.nameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件KEY_: 
	 */
	public Jbpm4ExecutionQueryCondition setKeyCondition(String value) {
		this.key = value;
		return this;
	}
	
	/**
	 * 设置查询条件KEY_: 
	 */
	public Jbpm4ExecutionQueryCondition setKeyConditionEqual(String value) {
		this.keyEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ID_: 
	 */
	public Jbpm4ExecutionQueryCondition setIdCondition(String value) {
		this.id = value;
		return this;
	}
	
	/**
	 * 设置查询条件ID_: 
	 */
	public Jbpm4ExecutionQueryCondition setIdConditionEqual(String value) {
		this.idEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATE_: 
	 */
	public Jbpm4ExecutionQueryCondition setStateCondition(String value) {
		this.state = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATE_: 
	 */
	public Jbpm4ExecutionQueryCondition setStateConditionEqual(String value) {
		this.stateEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件SUSPHISTSTATE_: 
	 */
	public Jbpm4ExecutionQueryCondition setSusphiststateCondition(String value) {
		this.susphiststate = value;
		return this;
	}
	
	/**
	 * 设置查询条件SUSPHISTSTATE_: 
	 */
	public Jbpm4ExecutionQueryCondition setSusphiststateConditionEqual(String value) {
		this.susphiststateEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITY_: 
	 */
	public Jbpm4ExecutionQueryCondition setPriorityCondition(Integer value) {
		this.priority = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITY_: 
	 */
	public Jbpm4ExecutionQueryCondition setPriorityConditionBegin(Integer value) {
		this.priorityBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITY_: 
	 */
	public Jbpm4ExecutionQueryCondition setPriorityConditionEnd(Integer value) {
		this.priorityEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITY_: 
	 */
	public Jbpm4ExecutionQueryCondition setPriorityConditionEndEqual(Integer value) {
		this.priorityEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件HISACTINST_: 
	 */
	public Jbpm4ExecutionQueryCondition setHisactinstCondition(Double value) {
		this.hisactinst = value;
		return this;
	}
	
	/**
	 * 设置查询条件HISACTINST_: 
	 */
	public Jbpm4ExecutionQueryCondition setHisactinstConditionBegin(Double value) {
		this.hisactinstBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件HISACTINST_: 
	 */
	public Jbpm4ExecutionQueryCondition setHisactinstConditionEnd(Double value) {
		this.hisactinstEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件HISACTINST_: 
	 */
	public Jbpm4ExecutionQueryCondition setHisactinstConditionEndEqual(Double value) {
		this.hisactinstEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_: 
	 */
	public Jbpm4ExecutionQueryCondition setParentCondition(Double value) {
		this.parent = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_: 
	 */
	public Jbpm4ExecutionQueryCondition setParentConditionBegin(Double value) {
		this.parentBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_: 
	 */
	public Jbpm4ExecutionQueryCondition setParentConditionEnd(Double value) {
		this.parentEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_: 
	 */
	public Jbpm4ExecutionQueryCondition setParentConditionEndEqual(Double value) {
		this.parentEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件INSTANCE_: 
	 */
	public Jbpm4ExecutionQueryCondition setInstanceCondition(Double value) {
		this.instance = value;
		return this;
	}
	
	/**
	 * 设置查询条件INSTANCE_: 
	 */
	public Jbpm4ExecutionQueryCondition setInstanceConditionBegin(Double value) {
		this.instanceBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件INSTANCE_: 
	 */
	public Jbpm4ExecutionQueryCondition setInstanceConditionEnd(Double value) {
		this.instanceEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件INSTANCE_: 
	 */
	public Jbpm4ExecutionQueryCondition setInstanceConditionEndEqual(Double value) {
		this.instanceEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件SUPEREXEC_: 
	 */
	public Jbpm4ExecutionQueryCondition setSuperexecCondition(Double value) {
		this.superexec = value;
		return this;
	}
	
	/**
	 * 设置查询条件SUPEREXEC_: 
	 */
	public Jbpm4ExecutionQueryCondition setSuperexecConditionBegin(Double value) {
		this.superexecBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件SUPEREXEC_: 
	 */
	public Jbpm4ExecutionQueryCondition setSuperexecConditionEnd(Double value) {
		this.superexecEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件SUPEREXEC_: 
	 */
	public Jbpm4ExecutionQueryCondition setSuperexecConditionEndEqual(Double value) {
		this.superexecEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件SUBPROCINST_: 
	 */
	public Jbpm4ExecutionQueryCondition setSubprocinstCondition(Double value) {
		this.subprocinst = value;
		return this;
	}
	
	/**
	 * 设置查询条件SUBPROCINST_: 
	 */
	public Jbpm4ExecutionQueryCondition setSubprocinstConditionBegin(Double value) {
		this.subprocinstBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件SUBPROCINST_: 
	 */
	public Jbpm4ExecutionQueryCondition setSubprocinstConditionEnd(Double value) {
		this.subprocinstEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件SUBPROCINST_: 
	 */
	public Jbpm4ExecutionQueryCondition setSubprocinstConditionEndEqual(Double value) {
		this.subprocinstEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_IDX_: 
	 */
	public Jbpm4ExecutionQueryCondition setParentIdxCondition(Integer value) {
		this.parentIdx = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_IDX_: 
	 */
	public Jbpm4ExecutionQueryCondition setParentIdxConditionBegin(Integer value) {
		this.parentIdxBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_IDX_: 
	 */
	public Jbpm4ExecutionQueryCondition setParentIdxConditionEnd(Integer value) {
		this.parentIdxEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_IDX_: 
	 */
	public Jbpm4ExecutionQueryCondition setParentIdxConditionEndEqual(Integer value) {
		this.parentIdxEndEqual = value;
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
						+ ((" and ([JBPM4_EXECUTION].[DBID_] = " + this.dbid) 
						+ ") "));
		}
		if ((this.dbidBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[DBID_] >= " 
						+ (this.dbidBegin + ")")));
		}
		if ((this.dbidEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[DBID_] < " 
						+ (this.dbidEnd + ") ")));
		}
		if ((this.dbidEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[DBID_] <= " 
						+ (this.dbidEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.class_)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_EXECUTION].[CLASS_]", this.class_)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.class_Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_EXECUTION].[CLASS_] = " + SqlServerUtils.safeSql(this.class_Equal))) 
						+ ") "));
		}
		if ((this.dbversion == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_EXECUTION].[DBVERSION_] = " + this.dbversion) 
						+ ") "));
		}
		if ((this.dbversionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[DBVERSION_] >= " 
						+ (this.dbversionBegin + ")")));
		}
		if ((this.dbversionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[DBVERSION_] < " 
						+ (this.dbversionEnd + ") ")));
		}
		if ((this.dbversionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[DBVERSION_] <= " 
						+ (this.dbversionEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.activityname)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_EXECUTION].[ACTIVITYNAME_]", this.activityname)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.activitynameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_EXECUTION].[ACTIVITYNAME_] = " + SqlServerUtils.safeSql(this.activitynameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.procdefid)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_EXECUTION].[PROCDEFID_]", this.procdefid)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.procdefidEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_EXECUTION].[PROCDEFID_] = " + SqlServerUtils.safeSql(this.procdefidEqual))) 
						+ ") "));
		}
		if ((this.hasvars == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_EXECUTION].[HASVARS_] = " + this.hasvars) 
						+ ") "));
		}
		if ((this.hasvarsBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[HASVARS_] >= " 
						+ (this.hasvarsBegin + ")")));
		}
		if ((this.hasvarsEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[HASVARS_] < " 
						+ (this.hasvarsEnd + ") ")));
		}
		if ((this.hasvarsEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[HASVARS_] <= " 
						+ (this.hasvarsEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.name)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_EXECUTION].[NAME_]", this.name)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.nameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_EXECUTION].[NAME_] = " + SqlServerUtils.safeSql(this.nameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.key)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_EXECUTION].[KEY_]", this.key)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.keyEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_EXECUTION].[KEY_] = " + SqlServerUtils.safeSql(this.keyEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.id)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_EXECUTION].[ID_]", this.id)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.idEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_EXECUTION].[ID_] = " + SqlServerUtils.safeSql(this.idEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.state)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_EXECUTION].[STATE_]", this.state)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.stateEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_EXECUTION].[STATE_] = " + SqlServerUtils.safeSql(this.stateEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.susphiststate)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_EXECUTION].[SUSPHISTSTATE_]", this.susphiststate)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.susphiststateEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_EXECUTION].[SUSPHISTSTATE_] = " + SqlServerUtils.safeSql(this.susphiststateEqual))) 
						+ ") "));
		}
		if ((this.priority == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_EXECUTION].[PRIORITY_] = " + this.priority) 
						+ ") "));
		}
		if ((this.priorityBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[PRIORITY_] >= " 
						+ (this.priorityBegin + ")")));
		}
		if ((this.priorityEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[PRIORITY_] < " 
						+ (this.priorityEnd + ") ")));
		}
		if ((this.priorityEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[PRIORITY_] <= " 
						+ (this.priorityEndEqual + ") ")));
		}
		if ((this.hisactinst == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_EXECUTION].[HISACTINST_] = " + this.hisactinst) 
						+ ") "));
		}
		if ((this.hisactinstBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[HISACTINST_] >= " 
						+ (this.hisactinstBegin + ")")));
		}
		if ((this.hisactinstEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[HISACTINST_] < " 
						+ (this.hisactinstEnd + ") ")));
		}
		if ((this.hisactinstEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[HISACTINST_] <= " 
						+ (this.hisactinstEndEqual + ") ")));
		}
		if ((this.parent == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_EXECUTION].[PARENT_] = " + this.parent) 
						+ ") "));
		}
		if ((this.parentBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[PARENT_] >= " 
						+ (this.parentBegin + ")")));
		}
		if ((this.parentEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[PARENT_] < " 
						+ (this.parentEnd + ") ")));
		}
		if ((this.parentEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[PARENT_] <= " 
						+ (this.parentEndEqual + ") ")));
		}
		if ((this.instance == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_EXECUTION].[INSTANCE_] = " + this.instance) 
						+ ") "));
		}
		if ((this.instanceBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[INSTANCE_] >= " 
						+ (this.instanceBegin + ")")));
		}
		if ((this.instanceEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[INSTANCE_] < " 
						+ (this.instanceEnd + ") ")));
		}
		if ((this.instanceEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[INSTANCE_] <= " 
						+ (this.instanceEndEqual + ") ")));
		}
		if ((this.superexec == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_EXECUTION].[SUPEREXEC_] = " + this.superexec) 
						+ ") "));
		}
		if ((this.superexecBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[SUPEREXEC_] >= " 
						+ (this.superexecBegin + ")")));
		}
		if ((this.superexecEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[SUPEREXEC_] < " 
						+ (this.superexecEnd + ") ")));
		}
		if ((this.superexecEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[SUPEREXEC_] <= " 
						+ (this.superexecEndEqual + ") ")));
		}
		if ((this.subprocinst == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_EXECUTION].[SUBPROCINST_] = " + this.subprocinst) 
						+ ") "));
		}
		if ((this.subprocinstBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[SUBPROCINST_] >= " 
						+ (this.subprocinstBegin + ")")));
		}
		if ((this.subprocinstEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[SUBPROCINST_] < " 
						+ (this.subprocinstEnd + ") ")));
		}
		if ((this.subprocinstEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[SUBPROCINST_] <= " 
						+ (this.subprocinstEndEqual + ") ")));
		}
		if ((this.parentIdx == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_EXECUTION].[PARENT_IDX_] = " + this.parentIdx) 
						+ ") "));
		}
		if ((this.parentIdxBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[PARENT_IDX_] >= " 
						+ (this.parentIdxBegin + ")")));
		}
		if ((this.parentIdxEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[PARENT_IDX_] < " 
						+ (this.parentIdxEnd + ") ")));
		}
		if ((this.parentIdxEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_EXECUTION].[PARENT_IDX_] <= " 
						+ (this.parentIdxEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
