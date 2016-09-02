package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_HIST_VAR查询条件定义
 */
public class Jbpm4HistVarQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,PROCINSTID_: 
	 */
	String procinstid;
	
	/**
	 * 查询条件字符串相等,PROCINSTID_: 
	 */
	String procinstidEqual;
	
	/**
	 * 查询条件,EXECUTIONID_: 
	 */
	String executionid;
	
	/**
	 * 查询条件字符串相等,EXECUTIONID_: 
	 */
	String executionidEqual;
	
	/**
	 * 查询条件,VARNAME_: 
	 */
	String varname;
	
	/**
	 * 查询条件字符串相等,VARNAME_: 
	 */
	String varnameEqual;
	
	/**
	 * 查询条件,VALUE_: 
	 */
	String value;
	
	/**
	 * 查询条件字符串相等,VALUE_: 
	 */
	String valueEqual;
	
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
	 * PROCINSTID_: 
	 */
	public String getProcinstid() {
		return this.procinstid;
	}
	
	/**
	 * PROCINSTID_: 
	 */
	public void setProcinstid(String value)
	 {
		this.procinstid = value;
	}
	
	/**
	 * 查询条件字符串相等,PROCINSTID_: 
	 */
	public String getProcinstidEqual() {
		return this.procinstidEqual;
	}
	
	/**
	 * 查询条件字符串相等,PROCINSTID_: 
	 */
	public void setProcinstidEqual(String value)
	 {
		this.procinstidEqual = value;
	}
	
	/**
	 * EXECUTIONID_: 
	 */
	public String getExecutionid() {
		return this.executionid;
	}
	
	/**
	 * EXECUTIONID_: 
	 */
	public void setExecutionid(String value)
	 {
		this.executionid = value;
	}
	
	/**
	 * 查询条件字符串相等,EXECUTIONID_: 
	 */
	public String getExecutionidEqual() {
		return this.executionidEqual;
	}
	
	/**
	 * 查询条件字符串相等,EXECUTIONID_: 
	 */
	public void setExecutionidEqual(String value)
	 {
		this.executionidEqual = value;
	}
	
	/**
	 * VARNAME_: 
	 */
	public String getVarname() {
		return this.varname;
	}
	
	/**
	 * VARNAME_: 
	 */
	public void setVarname(String value)
	 {
		this.varname = value;
	}
	
	/**
	 * 查询条件字符串相等,VARNAME_: 
	 */
	public String getVarnameEqual() {
		return this.varnameEqual;
	}
	
	/**
	 * 查询条件字符串相等,VARNAME_: 
	 */
	public void setVarnameEqual(String value)
	 {
		this.varnameEqual = value;
	}
	
	/**
	 * VALUE_: 
	 */
	public String getValue() {
		return this.value;
	}
	
	/**
	 * VALUE_: 
	 */
	public void setValue(String value)
	 {
		this.value = value;
	}
	
	/**
	 * 查询条件字符串相等,VALUE_: 
	 */
	public String getValueEqual() {
		return this.valueEqual;
	}
	
	/**
	 * 查询条件字符串相等,VALUE_: 
	 */
	public void setValueEqual(String value)
	 {
		this.valueEqual = value;
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
	public Jbpm4HistVarQueryCondition setDbidCondition(Double value) {
		this.dbid = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4HistVarQueryCondition setDbidConditionBegin(Double value) {
		this.dbidBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4HistVarQueryCondition setDbidConditionEnd(Double value) {
		this.dbidEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4HistVarQueryCondition setDbidConditionEndEqual(Double value) {
		this.dbidEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4HistVarQueryCondition setDbversionCondition(Integer value) {
		this.dbversion = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4HistVarQueryCondition setDbversionConditionBegin(Integer value) {
		this.dbversionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4HistVarQueryCondition setDbversionConditionEnd(Integer value) {
		this.dbversionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4HistVarQueryCondition setDbversionConditionEndEqual(Integer value) {
		this.dbversionEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROCINSTID_: 
	 */
	public Jbpm4HistVarQueryCondition setProcinstidCondition(String value) {
		this.procinstid = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROCINSTID_: 
	 */
	public Jbpm4HistVarQueryCondition setProcinstidConditionEqual(String value) {
		this.procinstidEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTIONID_: 
	 */
	public Jbpm4HistVarQueryCondition setExecutionidCondition(String value) {
		this.executionid = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTIONID_: 
	 */
	public Jbpm4HistVarQueryCondition setExecutionidConditionEqual(String value) {
		this.executionidEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件VARNAME_: 
	 */
	public Jbpm4HistVarQueryCondition setVarnameCondition(String value) {
		this.varname = value;
		return this;
	}
	
	/**
	 * 设置查询条件VARNAME_: 
	 */
	public Jbpm4HistVarQueryCondition setVarnameConditionEqual(String value) {
		this.varnameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件VALUE_: 
	 */
	public Jbpm4HistVarQueryCondition setValueCondition(String value) {
		this.value = value;
		return this;
	}
	
	/**
	 * 设置查询条件VALUE_: 
	 */
	public Jbpm4HistVarQueryCondition setValueConditionEqual(String value) {
		this.valueEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件HPROCI_: 
	 */
	public Jbpm4HistVarQueryCondition setHprociCondition(Double value) {
		this.hproci = value;
		return this;
	}
	
	/**
	 * 设置查询条件HPROCI_: 
	 */
	public Jbpm4HistVarQueryCondition setHprociConditionBegin(Double value) {
		this.hprociBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件HPROCI_: 
	 */
	public Jbpm4HistVarQueryCondition setHprociConditionEnd(Double value) {
		this.hprociEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件HPROCI_: 
	 */
	public Jbpm4HistVarQueryCondition setHprociConditionEndEqual(Double value) {
		this.hprociEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件HTASK_: 
	 */
	public Jbpm4HistVarQueryCondition setHtaskCondition(Double value) {
		this.htask = value;
		return this;
	}
	
	/**
	 * 设置查询条件HTASK_: 
	 */
	public Jbpm4HistVarQueryCondition setHtaskConditionBegin(Double value) {
		this.htaskBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件HTASK_: 
	 */
	public Jbpm4HistVarQueryCondition setHtaskConditionEnd(Double value) {
		this.htaskEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件HTASK_: 
	 */
	public Jbpm4HistVarQueryCondition setHtaskConditionEndEqual(Double value) {
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
						+ ((" and ([JBPM4_HIST_VAR].[DBID_] = " + this.dbid) 
						+ ") "));
		}
		if ((this.dbidBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_VAR].[DBID_] >= " 
						+ (this.dbidBegin + ")")));
		}
		if ((this.dbidEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_VAR].[DBID_] < " 
						+ (this.dbidEnd + ") ")));
		}
		if ((this.dbidEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_VAR].[DBID_] <= " 
						+ (this.dbidEndEqual + ") ")));
		}
		if ((this.dbversion == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_VAR].[DBVERSION_] = " + this.dbversion) 
						+ ") "));
		}
		if ((this.dbversionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_VAR].[DBVERSION_] >= " 
						+ (this.dbversionBegin + ")")));
		}
		if ((this.dbversionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_VAR].[DBVERSION_] < " 
						+ (this.dbversionEnd + ") ")));
		}
		if ((this.dbversionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_VAR].[DBVERSION_] <= " 
						+ (this.dbversionEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.procinstid)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_VAR].[PROCINSTID_]", this.procinstid)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.procinstidEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_VAR].[PROCINSTID_] = " + SqlServerUtils.safeSql(this.procinstidEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.executionid)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_VAR].[EXECUTIONID_]", this.executionid)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.executionidEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_VAR].[EXECUTIONID_] = " + SqlServerUtils.safeSql(this.executionidEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.varname)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_VAR].[VARNAME_]", this.varname)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.varnameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_VAR].[VARNAME_] = " + SqlServerUtils.safeSql(this.varnameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.value)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_VAR].[VALUE_]", this.value)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.valueEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_VAR].[VALUE_] = " + SqlServerUtils.safeSql(this.valueEqual))) 
						+ ") "));
		}
		if ((this.hproci == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_VAR].[HPROCI_] = " + this.hproci) 
						+ ") "));
		}
		if ((this.hprociBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_VAR].[HPROCI_] >= " 
						+ (this.hprociBegin + ")")));
		}
		if ((this.hprociEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_VAR].[HPROCI_] < " 
						+ (this.hprociEnd + ") ")));
		}
		if ((this.hprociEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_VAR].[HPROCI_] <= " 
						+ (this.hprociEndEqual + ") ")));
		}
		if ((this.htask == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_VAR].[HTASK_] = " + this.htask) 
						+ ") "));
		}
		if ((this.htaskBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_VAR].[HTASK_] >= " 
						+ (this.htaskBegin + ")")));
		}
		if ((this.htaskEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_VAR].[HTASK_] < " 
						+ (this.htaskEnd + ") ")));
		}
		if ((this.htaskEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_VAR].[HTASK_] <= " 
						+ (this.htaskEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
