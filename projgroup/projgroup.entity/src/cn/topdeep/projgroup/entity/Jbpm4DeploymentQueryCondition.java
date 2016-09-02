package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_DEPLOYMENT查询条件定义
 */
public class Jbpm4DeploymentQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,NAME_: 
	 */
	String name;
	
	/**
	 * 查询条件字符串相等,NAME_: 
	 */
	String nameEqual;
	
	/**
	 * 查询条件,TIMESTAMP_: 
	 */
	Double timestamp;
	
	/**
	 * 查询条件开始值,TIMESTAMP_: 
	 */
	Double timestampBegin;
	
	/**
	 * 查询条件结束值,TIMESTAMP_: 
	 */
	Double timestampEnd;
	
	/**
	 * 查询条件结束值,TIMESTAMP_: 
	 */
	Double timestampEndEqual;
	
	/**
	 * 查询条件,STATE_: 
	 */
	String state;
	
	/**
	 * 查询条件字符串相等,STATE_: 
	 */
	String stateEqual;
	
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
	 * TIMESTAMP_: 
	 */
	public Double getTimestamp() {
		return this.timestamp;
	}
	
	/**
	 * TIMESTAMP_: 
	 */
	public void setTimestamp(Double value)
	 {
		this.timestamp = value;
	}
	
	/**
	 * 查询条件开始值,TIMESTAMP_: 
	 */
	public Double getTimestampBegin() {
		return this.timestampBegin;
	}
	
	/**
	 * 查询条件开始值,TIMESTAMP_: 
	 */
	public void setTimestampBegin(Double value)
	 {
		this.timestampBegin = value;
	}
	
	/**
	 * 查询条件结束值,TIMESTAMP_: 
	 */
	public Double getTimestampEnd() {
		return this.timestampEnd;
	}
	
	/**
	 * 查询条件结束值,TIMESTAMP_: 
	 */
	public void setTimestampEnd(Double value)
	 {
		this.timestampEnd = value;
	}
	
	/**
	 * 查询条件结束值,TIMESTAMP_: 
	 */
	public Double getTimestampEndEqual() {
		return this.timestampEndEqual;
	}
	
	/**
	 * 查询条件结束值,TIMESTAMP_: 
	 */
	public void setTimestampEndEqual(Double value)
	 {
		this.timestampEndEqual = value;
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
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4DeploymentQueryCondition setDbidCondition(Double value) {
		this.dbid = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4DeploymentQueryCondition setDbidConditionBegin(Double value) {
		this.dbidBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4DeploymentQueryCondition setDbidConditionEnd(Double value) {
		this.dbidEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4DeploymentQueryCondition setDbidConditionEndEqual(Double value) {
		this.dbidEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAME_: 
	 */
	public Jbpm4DeploymentQueryCondition setNameCondition(String value) {
		this.name = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAME_: 
	 */
	public Jbpm4DeploymentQueryCondition setNameConditionEqual(String value) {
		this.nameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TIMESTAMP_: 
	 */
	public Jbpm4DeploymentQueryCondition setTimestampCondition(Double value) {
		this.timestamp = value;
		return this;
	}
	
	/**
	 * 设置查询条件TIMESTAMP_: 
	 */
	public Jbpm4DeploymentQueryCondition setTimestampConditionBegin(Double value) {
		this.timestampBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TIMESTAMP_: 
	 */
	public Jbpm4DeploymentQueryCondition setTimestampConditionEnd(Double value) {
		this.timestampEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TIMESTAMP_: 
	 */
	public Jbpm4DeploymentQueryCondition setTimestampConditionEndEqual(Double value) {
		this.timestampEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATE_: 
	 */
	public Jbpm4DeploymentQueryCondition setStateCondition(String value) {
		this.state = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATE_: 
	 */
	public Jbpm4DeploymentQueryCondition setStateConditionEqual(String value) {
		this.stateEqual = value;
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
						+ ((" and ([JBPM4_DEPLOYMENT].[DBID_] = " + this.dbid) 
						+ ") "));
		}
		if ((this.dbidBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_DEPLOYMENT].[DBID_] >= " 
						+ (this.dbidBegin + ")")));
		}
		if ((this.dbidEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_DEPLOYMENT].[DBID_] < " 
						+ (this.dbidEnd + ") ")));
		}
		if ((this.dbidEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_DEPLOYMENT].[DBID_] <= " 
						+ (this.dbidEndEqual + ") ")));
		}
		if ((this.timestamp == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_DEPLOYMENT].[TIMESTAMP_] = " + this.timestamp) 
						+ ") "));
		}
		if ((this.timestampBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_DEPLOYMENT].[TIMESTAMP_] >= " 
						+ (this.timestampBegin + ")")));
		}
		if ((this.timestampEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_DEPLOYMENT].[TIMESTAMP_] < " 
						+ (this.timestampEnd + ") ")));
		}
		if ((this.timestampEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_DEPLOYMENT].[TIMESTAMP_] <= " 
						+ (this.timestampEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.state)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_DEPLOYMENT].[STATE_]", this.state)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.stateEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_DEPLOYMENT].[STATE_] = " + SqlServerUtils.safeSql(this.stateEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
