package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_DEPLOYPROP查询条件定义
 */
public class Jbpm4DeploypropQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,DEPLOYMENT_: 
	 */
	Double deployment;
	
	/**
	 * 查询条件开始值,DEPLOYMENT_: 
	 */
	Double deploymentBegin;
	
	/**
	 * 查询条件结束值,DEPLOYMENT_: 
	 */
	Double deploymentEnd;
	
	/**
	 * 查询条件结束值,DEPLOYMENT_: 
	 */
	Double deploymentEndEqual;
	
	/**
	 * 查询条件,OBJNAME_: 
	 */
	String objname;
	
	/**
	 * 查询条件字符串相等,OBJNAME_: 
	 */
	String objnameEqual;
	
	/**
	 * 查询条件,KEY_: 
	 */
	String key;
	
	/**
	 * 查询条件字符串相等,KEY_: 
	 */
	String keyEqual;
	
	/**
	 * 查询条件,STRINGVAL_: 
	 */
	String stringval;
	
	/**
	 * 查询条件字符串相等,STRINGVAL_: 
	 */
	String stringvalEqual;
	
	/**
	 * 查询条件,LONGVAL_: 
	 */
	Double longval;
	
	/**
	 * 查询条件开始值,LONGVAL_: 
	 */
	Double longvalBegin;
	
	/**
	 * 查询条件结束值,LONGVAL_: 
	 */
	Double longvalEnd;
	
	/**
	 * 查询条件结束值,LONGVAL_: 
	 */
	Double longvalEndEqual;
	
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
	 * DEPLOYMENT_: 
	 */
	public Double getDeployment() {
		return this.deployment;
	}
	
	/**
	 * DEPLOYMENT_: 
	 */
	public void setDeployment(Double value)
	 {
		this.deployment = value;
	}
	
	/**
	 * 查询条件开始值,DEPLOYMENT_: 
	 */
	public Double getDeploymentBegin() {
		return this.deploymentBegin;
	}
	
	/**
	 * 查询条件开始值,DEPLOYMENT_: 
	 */
	public void setDeploymentBegin(Double value)
	 {
		this.deploymentBegin = value;
	}
	
	/**
	 * 查询条件结束值,DEPLOYMENT_: 
	 */
	public Double getDeploymentEnd() {
		return this.deploymentEnd;
	}
	
	/**
	 * 查询条件结束值,DEPLOYMENT_: 
	 */
	public void setDeploymentEnd(Double value)
	 {
		this.deploymentEnd = value;
	}
	
	/**
	 * 查询条件结束值,DEPLOYMENT_: 
	 */
	public Double getDeploymentEndEqual() {
		return this.deploymentEndEqual;
	}
	
	/**
	 * 查询条件结束值,DEPLOYMENT_: 
	 */
	public void setDeploymentEndEqual(Double value)
	 {
		this.deploymentEndEqual = value;
	}
	
	/**
	 * OBJNAME_: 
	 */
	public String getObjname() {
		return this.objname;
	}
	
	/**
	 * OBJNAME_: 
	 */
	public void setObjname(String value)
	 {
		this.objname = value;
	}
	
	/**
	 * 查询条件字符串相等,OBJNAME_: 
	 */
	public String getObjnameEqual() {
		return this.objnameEqual;
	}
	
	/**
	 * 查询条件字符串相等,OBJNAME_: 
	 */
	public void setObjnameEqual(String value)
	 {
		this.objnameEqual = value;
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
	 * STRINGVAL_: 
	 */
	public String getStringval() {
		return this.stringval;
	}
	
	/**
	 * STRINGVAL_: 
	 */
	public void setStringval(String value)
	 {
		this.stringval = value;
	}
	
	/**
	 * 查询条件字符串相等,STRINGVAL_: 
	 */
	public String getStringvalEqual() {
		return this.stringvalEqual;
	}
	
	/**
	 * 查询条件字符串相等,STRINGVAL_: 
	 */
	public void setStringvalEqual(String value)
	 {
		this.stringvalEqual = value;
	}
	
	/**
	 * LONGVAL_: 
	 */
	public Double getLongval() {
		return this.longval;
	}
	
	/**
	 * LONGVAL_: 
	 */
	public void setLongval(Double value)
	 {
		this.longval = value;
	}
	
	/**
	 * 查询条件开始值,LONGVAL_: 
	 */
	public Double getLongvalBegin() {
		return this.longvalBegin;
	}
	
	/**
	 * 查询条件开始值,LONGVAL_: 
	 */
	public void setLongvalBegin(Double value)
	 {
		this.longvalBegin = value;
	}
	
	/**
	 * 查询条件结束值,LONGVAL_: 
	 */
	public Double getLongvalEnd() {
		return this.longvalEnd;
	}
	
	/**
	 * 查询条件结束值,LONGVAL_: 
	 */
	public void setLongvalEnd(Double value)
	 {
		this.longvalEnd = value;
	}
	
	/**
	 * 查询条件结束值,LONGVAL_: 
	 */
	public Double getLongvalEndEqual() {
		return this.longvalEndEqual;
	}
	
	/**
	 * 查询条件结束值,LONGVAL_: 
	 */
	public void setLongvalEndEqual(Double value)
	 {
		this.longvalEndEqual = value;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4DeploypropQueryCondition setDbidCondition(Double value) {
		this.dbid = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4DeploypropQueryCondition setDbidConditionBegin(Double value) {
		this.dbidBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4DeploypropQueryCondition setDbidConditionEnd(Double value) {
		this.dbidEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4DeploypropQueryCondition setDbidConditionEndEqual(Double value) {
		this.dbidEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEPLOYMENT_: 
	 */
	public Jbpm4DeploypropQueryCondition setDeploymentCondition(Double value) {
		this.deployment = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEPLOYMENT_: 
	 */
	public Jbpm4DeploypropQueryCondition setDeploymentConditionBegin(Double value) {
		this.deploymentBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEPLOYMENT_: 
	 */
	public Jbpm4DeploypropQueryCondition setDeploymentConditionEnd(Double value) {
		this.deploymentEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEPLOYMENT_: 
	 */
	public Jbpm4DeploypropQueryCondition setDeploymentConditionEndEqual(Double value) {
		this.deploymentEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件OBJNAME_: 
	 */
	public Jbpm4DeploypropQueryCondition setObjnameCondition(String value) {
		this.objname = value;
		return this;
	}
	
	/**
	 * 设置查询条件OBJNAME_: 
	 */
	public Jbpm4DeploypropQueryCondition setObjnameConditionEqual(String value) {
		this.objnameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件KEY_: 
	 */
	public Jbpm4DeploypropQueryCondition setKeyCondition(String value) {
		this.key = value;
		return this;
	}
	
	/**
	 * 设置查询条件KEY_: 
	 */
	public Jbpm4DeploypropQueryCondition setKeyConditionEqual(String value) {
		this.keyEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件STRINGVAL_: 
	 */
	public Jbpm4DeploypropQueryCondition setStringvalCondition(String value) {
		this.stringval = value;
		return this;
	}
	
	/**
	 * 设置查询条件STRINGVAL_: 
	 */
	public Jbpm4DeploypropQueryCondition setStringvalConditionEqual(String value) {
		this.stringvalEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件LONGVAL_: 
	 */
	public Jbpm4DeploypropQueryCondition setLongvalCondition(Double value) {
		this.longval = value;
		return this;
	}
	
	/**
	 * 设置查询条件LONGVAL_: 
	 */
	public Jbpm4DeploypropQueryCondition setLongvalConditionBegin(Double value) {
		this.longvalBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件LONGVAL_: 
	 */
	public Jbpm4DeploypropQueryCondition setLongvalConditionEnd(Double value) {
		this.longvalEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件LONGVAL_: 
	 */
	public Jbpm4DeploypropQueryCondition setLongvalConditionEndEqual(Double value) {
		this.longvalEndEqual = value;
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
						+ ((" and ([JBPM4_DEPLOYPROP].[DBID_] = " + this.dbid) 
						+ ") "));
		}
		if ((this.dbidBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_DEPLOYPROP].[DBID_] >= " 
						+ (this.dbidBegin + ")")));
		}
		if ((this.dbidEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_DEPLOYPROP].[DBID_] < " 
						+ (this.dbidEnd + ") ")));
		}
		if ((this.dbidEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_DEPLOYPROP].[DBID_] <= " 
						+ (this.dbidEndEqual + ") ")));
		}
		if ((this.deployment == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_DEPLOYPROP].[DEPLOYMENT_] = " + this.deployment) 
						+ ") "));
		}
		if ((this.deploymentBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_DEPLOYPROP].[DEPLOYMENT_] >= " 
						+ (this.deploymentBegin + ")")));
		}
		if ((this.deploymentEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_DEPLOYPROP].[DEPLOYMENT_] < " 
						+ (this.deploymentEnd + ") ")));
		}
		if ((this.deploymentEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_DEPLOYPROP].[DEPLOYMENT_] <= " 
						+ (this.deploymentEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.objname)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_DEPLOYPROP].[OBJNAME_]", this.objname)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.objnameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_DEPLOYPROP].[OBJNAME_] = " + SqlServerUtils.safeSql(this.objnameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.key)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_DEPLOYPROP].[KEY_]", this.key)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.keyEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_DEPLOYPROP].[KEY_] = " + SqlServerUtils.safeSql(this.keyEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.stringval)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_DEPLOYPROP].[STRINGVAL_]", this.stringval)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.stringvalEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_DEPLOYPROP].[STRINGVAL_] = " + SqlServerUtils.safeSql(this.stringvalEqual))) 
						+ ") "));
		}
		if ((this.longval == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_DEPLOYPROP].[LONGVAL_] = " + this.longval) 
						+ ") "));
		}
		if ((this.longvalBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_DEPLOYPROP].[LONGVAL_] >= " 
						+ (this.longvalBegin + ")")));
		}
		if ((this.longvalEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_DEPLOYPROP].[LONGVAL_] < " 
						+ (this.longvalEnd + ") ")));
		}
		if ((this.longvalEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_DEPLOYPROP].[LONGVAL_] <= " 
						+ (this.longvalEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
