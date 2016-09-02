package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_HIST_PROCINST查询条件定义
 */
public class Jbpm4HistProcinstQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,ID_: 
	 */
	String id;
	
	/**
	 * 查询条件字符串相等,ID_: 
	 */
	String idEqual;
	
	/**
	 * 查询条件,PROCDEFID_: 
	 */
	String procdefid;
	
	/**
	 * 查询条件字符串相等,PROCDEFID_: 
	 */
	String procdefidEqual;
	
	/**
	 * 查询条件,KEY_: 
	 */
	String key;
	
	/**
	 * 查询条件字符串相等,KEY_: 
	 */
	String keyEqual;
	
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
	 * 查询条件,STATE_: 
	 */
	String state;
	
	/**
	 * 查询条件字符串相等,STATE_: 
	 */
	String stateEqual;
	
	/**
	 * 查询条件,ENDACTIVITY_: 
	 */
	String endactivity;
	
	/**
	 * 查询条件字符串相等,ENDACTIVITY_: 
	 */
	String endactivityEqual;
	
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
	 * ENDACTIVITY_: 
	 */
	public String getEndactivity() {
		return this.endactivity;
	}
	
	/**
	 * ENDACTIVITY_: 
	 */
	public void setEndactivity(String value)
	 {
		this.endactivity = value;
	}
	
	/**
	 * 查询条件字符串相等,ENDACTIVITY_: 
	 */
	public String getEndactivityEqual() {
		return this.endactivityEqual;
	}
	
	/**
	 * 查询条件字符串相等,ENDACTIVITY_: 
	 */
	public void setEndactivityEqual(String value)
	 {
		this.endactivityEqual = value;
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
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4HistProcinstQueryCondition setDbidCondition(Double value) {
		this.dbid = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4HistProcinstQueryCondition setDbidConditionBegin(Double value) {
		this.dbidBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4HistProcinstQueryCondition setDbidConditionEnd(Double value) {
		this.dbidEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4HistProcinstQueryCondition setDbidConditionEndEqual(Double value) {
		this.dbidEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4HistProcinstQueryCondition setDbversionCondition(Integer value) {
		this.dbversion = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4HistProcinstQueryCondition setDbversionConditionBegin(Integer value) {
		this.dbversionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4HistProcinstQueryCondition setDbversionConditionEnd(Integer value) {
		this.dbversionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4HistProcinstQueryCondition setDbversionConditionEndEqual(Integer value) {
		this.dbversionEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ID_: 
	 */
	public Jbpm4HistProcinstQueryCondition setIdCondition(String value) {
		this.id = value;
		return this;
	}
	
	/**
	 * 设置查询条件ID_: 
	 */
	public Jbpm4HistProcinstQueryCondition setIdConditionEqual(String value) {
		this.idEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROCDEFID_: 
	 */
	public Jbpm4HistProcinstQueryCondition setProcdefidCondition(String value) {
		this.procdefid = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROCDEFID_: 
	 */
	public Jbpm4HistProcinstQueryCondition setProcdefidConditionEqual(String value) {
		this.procdefidEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件KEY_: 
	 */
	public Jbpm4HistProcinstQueryCondition setKeyCondition(String value) {
		this.key = value;
		return this;
	}
	
	/**
	 * 设置查询条件KEY_: 
	 */
	public Jbpm4HistProcinstQueryCondition setKeyConditionEqual(String value) {
		this.keyEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件START_: 
	 */
	public Jbpm4HistProcinstQueryCondition setStartCondition(java.util.Date value) {
		this.start = value;
		return this;
	}
	
	/**
	 * 设置查询条件START_: 
	 */
	public Jbpm4HistProcinstQueryCondition setStartConditionBegin(java.util.Date value) {
		this.startBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件START_: 
	 */
	public Jbpm4HistProcinstQueryCondition setStartConditionEnd(java.util.Date value) {
		this.startEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件START_: 
	 */
	public Jbpm4HistProcinstQueryCondition setStartConditionEndEqual(java.util.Date value) {
		this.startEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件END_: 
	 */
	public Jbpm4HistProcinstQueryCondition setEndCondition(java.util.Date value) {
		this.end = value;
		return this;
	}
	
	/**
	 * 设置查询条件END_: 
	 */
	public Jbpm4HistProcinstQueryCondition setEndConditionBegin(java.util.Date value) {
		this.endBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件END_: 
	 */
	public Jbpm4HistProcinstQueryCondition setEndConditionEnd(java.util.Date value) {
		this.endEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件END_: 
	 */
	public Jbpm4HistProcinstQueryCondition setEndConditionEndEqual(java.util.Date value) {
		this.endEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DURATION_: 
	 */
	public Jbpm4HistProcinstQueryCondition setDurationCondition(Double value) {
		this.duration = value;
		return this;
	}
	
	/**
	 * 设置查询条件DURATION_: 
	 */
	public Jbpm4HistProcinstQueryCondition setDurationConditionBegin(Double value) {
		this.durationBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DURATION_: 
	 */
	public Jbpm4HistProcinstQueryCondition setDurationConditionEnd(Double value) {
		this.durationEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DURATION_: 
	 */
	public Jbpm4HistProcinstQueryCondition setDurationConditionEndEqual(Double value) {
		this.durationEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATE_: 
	 */
	public Jbpm4HistProcinstQueryCondition setStateCondition(String value) {
		this.state = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATE_: 
	 */
	public Jbpm4HistProcinstQueryCondition setStateConditionEqual(String value) {
		this.stateEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ENDACTIVITY_: 
	 */
	public Jbpm4HistProcinstQueryCondition setEndactivityCondition(String value) {
		this.endactivity = value;
		return this;
	}
	
	/**
	 * 设置查询条件ENDACTIVITY_: 
	 */
	public Jbpm4HistProcinstQueryCondition setEndactivityConditionEqual(String value) {
		this.endactivityEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEXTIDX_: 
	 */
	public Jbpm4HistProcinstQueryCondition setNextidxCondition(Integer value) {
		this.nextidx = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEXTIDX_: 
	 */
	public Jbpm4HistProcinstQueryCondition setNextidxConditionBegin(Integer value) {
		this.nextidxBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEXTIDX_: 
	 */
	public Jbpm4HistProcinstQueryCondition setNextidxConditionEnd(Integer value) {
		this.nextidxEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEXTIDX_: 
	 */
	public Jbpm4HistProcinstQueryCondition setNextidxConditionEndEqual(Integer value) {
		this.nextidxEndEqual = value;
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
						+ ((" and ([JBPM4_HIST_PROCINST].[DBID_] = " + this.dbid) 
						+ ") "));
		}
		if ((this.dbidBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_PROCINST].[DBID_] >= " 
						+ (this.dbidBegin + ")")));
		}
		if ((this.dbidEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_PROCINST].[DBID_] < " 
						+ (this.dbidEnd + ") ")));
		}
		if ((this.dbidEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_PROCINST].[DBID_] <= " 
						+ (this.dbidEndEqual + ") ")));
		}
		if ((this.dbversion == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_PROCINST].[DBVERSION_] = " + this.dbversion) 
						+ ") "));
		}
		if ((this.dbversionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_PROCINST].[DBVERSION_] >= " 
						+ (this.dbversionBegin + ")")));
		}
		if ((this.dbversionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_PROCINST].[DBVERSION_] < " 
						+ (this.dbversionEnd + ") ")));
		}
		if ((this.dbversionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_PROCINST].[DBVERSION_] <= " 
						+ (this.dbversionEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.id)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_PROCINST].[ID_]", this.id)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.idEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_PROCINST].[ID_] = " + SqlServerUtils.safeSql(this.idEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.procdefid)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_PROCINST].[PROCDEFID_]", this.procdefid)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.procdefidEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_PROCINST].[PROCDEFID_] = " + SqlServerUtils.safeSql(this.procdefidEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.key)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_PROCINST].[KEY_]", this.key)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.keyEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_PROCINST].[KEY_] = " + SqlServerUtils.safeSql(this.keyEqual))) 
						+ ") "));
		}
		if ((this.start == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_PROCINST].[START_] = " + SqlServerUtils.getDateSql(this.start)) 
						+ ") "));
		}
		if ((this.startBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_PROCINST].[START_] >= " 
						+ (SqlServerUtils.getDateSql(this.startBegin) + ")")));
		}
		if ((this.startEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_PROCINST].[START_] < " 
						+ (SqlServerUtils.getDateSql(this.startEnd) + ") ")));
		}
		if ((this.startEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_PROCINST].[START_] < " 
						+ (SqlServerUtils.getNextDateSql(this.startEndEqual) + ") ")));
		}
		if ((this.end == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_PROCINST].[END_] = " + SqlServerUtils.getDateSql(this.end)) 
						+ ") "));
		}
		if ((this.endBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_PROCINST].[END_] >= " 
						+ (SqlServerUtils.getDateSql(this.endBegin) + ")")));
		}
		if ((this.endEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_PROCINST].[END_] < " 
						+ (SqlServerUtils.getDateSql(this.endEnd) + ") ")));
		}
		if ((this.endEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_PROCINST].[END_] < " 
						+ (SqlServerUtils.getNextDateSql(this.endEndEqual) + ") ")));
		}
		if ((this.duration == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_PROCINST].[DURATION_] = " + this.duration) 
						+ ") "));
		}
		if ((this.durationBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_PROCINST].[DURATION_] >= " 
						+ (this.durationBegin + ")")));
		}
		if ((this.durationEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_PROCINST].[DURATION_] < " 
						+ (this.durationEnd + ") ")));
		}
		if ((this.durationEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_PROCINST].[DURATION_] <= " 
						+ (this.durationEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.state)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_PROCINST].[STATE_]", this.state)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.stateEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_PROCINST].[STATE_] = " + SqlServerUtils.safeSql(this.stateEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.endactivity)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_PROCINST].[ENDACTIVITY_]", this.endactivity)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.endactivityEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_PROCINST].[ENDACTIVITY_] = " + SqlServerUtils.safeSql(this.endactivityEqual))) 
						+ ") "));
		}
		if ((this.nextidx == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_PROCINST].[NEXTIDX_] = " + this.nextidx) 
						+ ") "));
		}
		if ((this.nextidxBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_PROCINST].[NEXTIDX_] >= " 
						+ (this.nextidxBegin + ")")));
		}
		if ((this.nextidxEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_PROCINST].[NEXTIDX_] < " 
						+ (this.nextidxEnd + ") ")));
		}
		if ((this.nextidxEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_PROCINST].[NEXTIDX_] <= " 
						+ (this.nextidxEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
