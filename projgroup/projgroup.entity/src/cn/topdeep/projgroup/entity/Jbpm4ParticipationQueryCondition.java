package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_PARTICIPATION查询条件定义
 */
public class Jbpm4ParticipationQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,GROUPID_: 
	 */
	String groupid;
	
	/**
	 * 查询条件字符串相等,GROUPID_: 
	 */
	String groupidEqual;
	
	/**
	 * 查询条件,USERID_: 
	 */
	String userid;
	
	/**
	 * 查询条件字符串相等,USERID_: 
	 */
	String useridEqual;
	
	/**
	 * 查询条件,TYPE_: 
	 */
	String type;
	
	/**
	 * 查询条件字符串相等,TYPE_: 
	 */
	String typeEqual;
	
	/**
	 * 查询条件,TASK_: 
	 */
	Double task;
	
	/**
	 * 查询条件开始值,TASK_: 
	 */
	Double taskBegin;
	
	/**
	 * 查询条件结束值,TASK_: 
	 */
	Double taskEnd;
	
	/**
	 * 查询条件结束值,TASK_: 
	 */
	Double taskEndEqual;
	
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
	 * GROUPID_: 
	 */
	public String getGroupid() {
		return this.groupid;
	}
	
	/**
	 * GROUPID_: 
	 */
	public void setGroupid(String value)
	 {
		this.groupid = value;
	}
	
	/**
	 * 查询条件字符串相等,GROUPID_: 
	 */
	public String getGroupidEqual() {
		return this.groupidEqual;
	}
	
	/**
	 * 查询条件字符串相等,GROUPID_: 
	 */
	public void setGroupidEqual(String value)
	 {
		this.groupidEqual = value;
	}
	
	/**
	 * USERID_: 
	 */
	public String getUserid() {
		return this.userid;
	}
	
	/**
	 * USERID_: 
	 */
	public void setUserid(String value)
	 {
		this.userid = value;
	}
	
	/**
	 * 查询条件字符串相等,USERID_: 
	 */
	public String getUseridEqual() {
		return this.useridEqual;
	}
	
	/**
	 * 查询条件字符串相等,USERID_: 
	 */
	public void setUseridEqual(String value)
	 {
		this.useridEqual = value;
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
	 * TASK_: 
	 */
	public Double getTask() {
		return this.task;
	}
	
	/**
	 * TASK_: 
	 */
	public void setTask(Double value)
	 {
		this.task = value;
	}
	
	/**
	 * 查询条件开始值,TASK_: 
	 */
	public Double getTaskBegin() {
		return this.taskBegin;
	}
	
	/**
	 * 查询条件开始值,TASK_: 
	 */
	public void setTaskBegin(Double value)
	 {
		this.taskBegin = value;
	}
	
	/**
	 * 查询条件结束值,TASK_: 
	 */
	public Double getTaskEnd() {
		return this.taskEnd;
	}
	
	/**
	 * 查询条件结束值,TASK_: 
	 */
	public void setTaskEnd(Double value)
	 {
		this.taskEnd = value;
	}
	
	/**
	 * 查询条件结束值,TASK_: 
	 */
	public Double getTaskEndEqual() {
		return this.taskEndEqual;
	}
	
	/**
	 * 查询条件结束值,TASK_: 
	 */
	public void setTaskEndEqual(Double value)
	 {
		this.taskEndEqual = value;
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
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4ParticipationQueryCondition setDbidCondition(Double value) {
		this.dbid = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4ParticipationQueryCondition setDbidConditionBegin(Double value) {
		this.dbidBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4ParticipationQueryCondition setDbidConditionEnd(Double value) {
		this.dbidEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4ParticipationQueryCondition setDbidConditionEndEqual(Double value) {
		this.dbidEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4ParticipationQueryCondition setDbversionCondition(Integer value) {
		this.dbversion = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4ParticipationQueryCondition setDbversionConditionBegin(Integer value) {
		this.dbversionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4ParticipationQueryCondition setDbversionConditionEnd(Integer value) {
		this.dbversionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4ParticipationQueryCondition setDbversionConditionEndEqual(Integer value) {
		this.dbversionEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件GROUPID_: 
	 */
	public Jbpm4ParticipationQueryCondition setGroupidCondition(String value) {
		this.groupid = value;
		return this;
	}
	
	/**
	 * 设置查询条件GROUPID_: 
	 */
	public Jbpm4ParticipationQueryCondition setGroupidConditionEqual(String value) {
		this.groupidEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件USERID_: 
	 */
	public Jbpm4ParticipationQueryCondition setUseridCondition(String value) {
		this.userid = value;
		return this;
	}
	
	/**
	 * 设置查询条件USERID_: 
	 */
	public Jbpm4ParticipationQueryCondition setUseridConditionEqual(String value) {
		this.useridEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TYPE_: 
	 */
	public Jbpm4ParticipationQueryCondition setTypeCondition(String value) {
		this.type = value;
		return this;
	}
	
	/**
	 * 设置查询条件TYPE_: 
	 */
	public Jbpm4ParticipationQueryCondition setTypeConditionEqual(String value) {
		this.typeEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_: 
	 */
	public Jbpm4ParticipationQueryCondition setTaskCondition(Double value) {
		this.task = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_: 
	 */
	public Jbpm4ParticipationQueryCondition setTaskConditionBegin(Double value) {
		this.taskBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_: 
	 */
	public Jbpm4ParticipationQueryCondition setTaskConditionEnd(Double value) {
		this.taskEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_: 
	 */
	public Jbpm4ParticipationQueryCondition setTaskConditionEndEqual(Double value) {
		this.taskEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件SWIMLANE_: 
	 */
	public Jbpm4ParticipationQueryCondition setSwimlaneCondition(Double value) {
		this.swimlane = value;
		return this;
	}
	
	/**
	 * 设置查询条件SWIMLANE_: 
	 */
	public Jbpm4ParticipationQueryCondition setSwimlaneConditionBegin(Double value) {
		this.swimlaneBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件SWIMLANE_: 
	 */
	public Jbpm4ParticipationQueryCondition setSwimlaneConditionEnd(Double value) {
		this.swimlaneEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件SWIMLANE_: 
	 */
	public Jbpm4ParticipationQueryCondition setSwimlaneConditionEndEqual(Double value) {
		this.swimlaneEndEqual = value;
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
						+ ((" and ([JBPM4_PARTICIPATION].[DBID_] = " + this.dbid) 
						+ ") "));
		}
		if ((this.dbidBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_PARTICIPATION].[DBID_] >= " 
						+ (this.dbidBegin + ")")));
		}
		if ((this.dbidEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_PARTICIPATION].[DBID_] < " 
						+ (this.dbidEnd + ") ")));
		}
		if ((this.dbidEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_PARTICIPATION].[DBID_] <= " 
						+ (this.dbidEndEqual + ") ")));
		}
		if ((this.dbversion == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_PARTICIPATION].[DBVERSION_] = " + this.dbversion) 
						+ ") "));
		}
		if ((this.dbversionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_PARTICIPATION].[DBVERSION_] >= " 
						+ (this.dbversionBegin + ")")));
		}
		if ((this.dbversionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_PARTICIPATION].[DBVERSION_] < " 
						+ (this.dbversionEnd + ") ")));
		}
		if ((this.dbversionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_PARTICIPATION].[DBVERSION_] <= " 
						+ (this.dbversionEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.groupid)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_PARTICIPATION].[GROUPID_]", this.groupid)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.groupidEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_PARTICIPATION].[GROUPID_] = " + SqlServerUtils.safeSql(this.groupidEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.userid)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_PARTICIPATION].[USERID_]", this.userid)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.useridEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_PARTICIPATION].[USERID_] = " + SqlServerUtils.safeSql(this.useridEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.type)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_PARTICIPATION].[TYPE_]", this.type)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.typeEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_PARTICIPATION].[TYPE_] = " + SqlServerUtils.safeSql(this.typeEqual))) 
						+ ") "));
		}
		if ((this.task == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_PARTICIPATION].[TASK_] = " + this.task) 
						+ ") "));
		}
		if ((this.taskBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_PARTICIPATION].[TASK_] >= " 
						+ (this.taskBegin + ")")));
		}
		if ((this.taskEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_PARTICIPATION].[TASK_] < " 
						+ (this.taskEnd + ") ")));
		}
		if ((this.taskEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_PARTICIPATION].[TASK_] <= " 
						+ (this.taskEndEqual + ") ")));
		}
		if ((this.swimlane == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_PARTICIPATION].[SWIMLANE_] = " + this.swimlane) 
						+ ") "));
		}
		if ((this.swimlaneBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_PARTICIPATION].[SWIMLANE_] >= " 
						+ (this.swimlaneBegin + ")")));
		}
		if ((this.swimlaneEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_PARTICIPATION].[SWIMLANE_] < " 
						+ (this.swimlaneEnd + ") ")));
		}
		if ((this.swimlaneEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_PARTICIPATION].[SWIMLANE_] <= " 
						+ (this.swimlaneEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
