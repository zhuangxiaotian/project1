package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_SWIMLANE查询条件定义
 */
public class Jbpm4SwimlaneQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,NAME_: 
	 */
	String name;
	
	/**
	 * 查询条件字符串相等,NAME_: 
	 */
	String nameEqual;
	
	/**
	 * 查询条件,ASSIGNEE_: 
	 */
	String assignee;
	
	/**
	 * 查询条件字符串相等,ASSIGNEE_: 
	 */
	String assigneeEqual;
	
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
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4SwimlaneQueryCondition setDbidCondition(Double value) {
		this.dbid = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4SwimlaneQueryCondition setDbidConditionBegin(Double value) {
		this.dbidBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4SwimlaneQueryCondition setDbidConditionEnd(Double value) {
		this.dbidEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4SwimlaneQueryCondition setDbidConditionEndEqual(Double value) {
		this.dbidEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4SwimlaneQueryCondition setDbversionCondition(Integer value) {
		this.dbversion = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4SwimlaneQueryCondition setDbversionConditionBegin(Integer value) {
		this.dbversionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4SwimlaneQueryCondition setDbversionConditionEnd(Integer value) {
		this.dbversionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4SwimlaneQueryCondition setDbversionConditionEndEqual(Integer value) {
		this.dbversionEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAME_: 
	 */
	public Jbpm4SwimlaneQueryCondition setNameCondition(String value) {
		this.name = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAME_: 
	 */
	public Jbpm4SwimlaneQueryCondition setNameConditionEqual(String value) {
		this.nameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ASSIGNEE_: 
	 */
	public Jbpm4SwimlaneQueryCondition setAssigneeCondition(String value) {
		this.assignee = value;
		return this;
	}
	
	/**
	 * 设置查询条件ASSIGNEE_: 
	 */
	public Jbpm4SwimlaneQueryCondition setAssigneeConditionEqual(String value) {
		this.assigneeEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_: 
	 */
	public Jbpm4SwimlaneQueryCondition setExecutionCondition(Double value) {
		this.execution = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_: 
	 */
	public Jbpm4SwimlaneQueryCondition setExecutionConditionBegin(Double value) {
		this.executionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_: 
	 */
	public Jbpm4SwimlaneQueryCondition setExecutionConditionEnd(Double value) {
		this.executionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_: 
	 */
	public Jbpm4SwimlaneQueryCondition setExecutionConditionEndEqual(Double value) {
		this.executionEndEqual = value;
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
						+ ((" and ([JBPM4_SWIMLANE].[DBID_] = " + this.dbid) 
						+ ") "));
		}
		if ((this.dbidBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_SWIMLANE].[DBID_] >= " 
						+ (this.dbidBegin + ")")));
		}
		if ((this.dbidEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_SWIMLANE].[DBID_] < " 
						+ (this.dbidEnd + ") ")));
		}
		if ((this.dbidEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_SWIMLANE].[DBID_] <= " 
						+ (this.dbidEndEqual + ") ")));
		}
		if ((this.dbversion == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_SWIMLANE].[DBVERSION_] = " + this.dbversion) 
						+ ") "));
		}
		if ((this.dbversionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_SWIMLANE].[DBVERSION_] >= " 
						+ (this.dbversionBegin + ")")));
		}
		if ((this.dbversionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_SWIMLANE].[DBVERSION_] < " 
						+ (this.dbversionEnd + ") ")));
		}
		if ((this.dbversionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_SWIMLANE].[DBVERSION_] <= " 
						+ (this.dbversionEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.name)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_SWIMLANE].[NAME_]", this.name)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.nameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_SWIMLANE].[NAME_] = " + SqlServerUtils.safeSql(this.nameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.assignee)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_SWIMLANE].[ASSIGNEE_]", this.assignee)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.assigneeEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_SWIMLANE].[ASSIGNEE_] = " + SqlServerUtils.safeSql(this.assigneeEqual))) 
						+ ") "));
		}
		if ((this.execution == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_SWIMLANE].[EXECUTION_] = " + this.execution) 
						+ ") "));
		}
		if ((this.executionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_SWIMLANE].[EXECUTION_] >= " 
						+ (this.executionBegin + ")")));
		}
		if ((this.executionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_SWIMLANE].[EXECUTION_] < " 
						+ (this.executionEnd + ") ")));
		}
		if ((this.executionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_SWIMLANE].[EXECUTION_] <= " 
						+ (this.executionEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
