package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_LOB查询条件定义
 */
public class Jbpm4LobQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,BLOB_VALUE_: 
	 */
	byte[] blobValue;
	
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
	 * 查询条件,NAME_: 
	 */
	String name;
	
	/**
	 * 查询条件字符串相等,NAME_: 
	 */
	String nameEqual;
	
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
	 * BLOB_VALUE_: 
	 */
	public byte[] getBlobValue() {
		return this.blobValue;
	}
	
	/**
	 * BLOB_VALUE_: 
	 */
	public void setBlobValue(byte[] value)
	 {
		this.blobValue = value;
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
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4LobQueryCondition setDbidCondition(Double value) {
		this.dbid = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4LobQueryCondition setDbidConditionBegin(Double value) {
		this.dbidBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4LobQueryCondition setDbidConditionEnd(Double value) {
		this.dbidEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4LobQueryCondition setDbidConditionEndEqual(Double value) {
		this.dbidEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4LobQueryCondition setDbversionCondition(Integer value) {
		this.dbversion = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4LobQueryCondition setDbversionConditionBegin(Integer value) {
		this.dbversionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4LobQueryCondition setDbversionConditionEnd(Integer value) {
		this.dbversionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4LobQueryCondition setDbversionConditionEndEqual(Integer value) {
		this.dbversionEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件BLOB_VALUE_: 
	 */
	public Jbpm4LobQueryCondition setBlobValueCondition(byte[] value) {
		this.blobValue = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEPLOYMENT_: 
	 */
	public Jbpm4LobQueryCondition setDeploymentCondition(Double value) {
		this.deployment = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEPLOYMENT_: 
	 */
	public Jbpm4LobQueryCondition setDeploymentConditionBegin(Double value) {
		this.deploymentBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEPLOYMENT_: 
	 */
	public Jbpm4LobQueryCondition setDeploymentConditionEnd(Double value) {
		this.deploymentEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEPLOYMENT_: 
	 */
	public Jbpm4LobQueryCondition setDeploymentConditionEndEqual(Double value) {
		this.deploymentEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAME_: 
	 */
	public Jbpm4LobQueryCondition setNameCondition(String value) {
		this.name = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAME_: 
	 */
	public Jbpm4LobQueryCondition setNameConditionEqual(String value) {
		this.nameEqual = value;
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
						+ ((" and ([JBPM4_LOB].[DBID_] = " + this.dbid) 
						+ ") "));
		}
		if ((this.dbidBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_LOB].[DBID_] >= " 
						+ (this.dbidBegin + ")")));
		}
		if ((this.dbidEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_LOB].[DBID_] < " 
						+ (this.dbidEnd + ") ")));
		}
		if ((this.dbidEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_LOB].[DBID_] <= " 
						+ (this.dbidEndEqual + ") ")));
		}
		if ((this.dbversion == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_LOB].[DBVERSION_] = " + this.dbversion) 
						+ ") "));
		}
		if ((this.dbversionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_LOB].[DBVERSION_] >= " 
						+ (this.dbversionBegin + ")")));
		}
		if ((this.dbversionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_LOB].[DBVERSION_] < " 
						+ (this.dbversionEnd + ") ")));
		}
		if ((this.dbversionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_LOB].[DBVERSION_] <= " 
						+ (this.dbversionEndEqual + ") ")));
		}
		if ((this.deployment == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_LOB].[DEPLOYMENT_] = " + this.deployment) 
						+ ") "));
		}
		if ((this.deploymentBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_LOB].[DEPLOYMENT_] >= " 
						+ (this.deploymentBegin + ")")));
		}
		if ((this.deploymentEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_LOB].[DEPLOYMENT_] < " 
						+ (this.deploymentEnd + ") ")));
		}
		if ((this.deploymentEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_LOB].[DEPLOYMENT_] <= " 
						+ (this.deploymentEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
