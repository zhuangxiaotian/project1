package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_ID_GROUP查询条件定义
 */
public class Jbpm4IdGroupQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,NAME_: 
	 */
	String name;
	
	/**
	 * 查询条件字符串相等,NAME_: 
	 */
	String nameEqual;
	
	/**
	 * 查询条件,TYPE_: 
	 */
	String type;
	
	/**
	 * 查询条件字符串相等,TYPE_: 
	 */
	String typeEqual;
	
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
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4IdGroupQueryCondition setDbidCondition(Double value) {
		this.dbid = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4IdGroupQueryCondition setDbidConditionBegin(Double value) {
		this.dbidBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4IdGroupQueryCondition setDbidConditionEnd(Double value) {
		this.dbidEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4IdGroupQueryCondition setDbidConditionEndEqual(Double value) {
		this.dbidEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4IdGroupQueryCondition setDbversionCondition(Integer value) {
		this.dbversion = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4IdGroupQueryCondition setDbversionConditionBegin(Integer value) {
		this.dbversionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4IdGroupQueryCondition setDbversionConditionEnd(Integer value) {
		this.dbversionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4IdGroupQueryCondition setDbversionConditionEndEqual(Integer value) {
		this.dbversionEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ID_: 
	 */
	public Jbpm4IdGroupQueryCondition setIdCondition(String value) {
		this.id = value;
		return this;
	}
	
	/**
	 * 设置查询条件ID_: 
	 */
	public Jbpm4IdGroupQueryCondition setIdConditionEqual(String value) {
		this.idEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAME_: 
	 */
	public Jbpm4IdGroupQueryCondition setNameCondition(String value) {
		this.name = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAME_: 
	 */
	public Jbpm4IdGroupQueryCondition setNameConditionEqual(String value) {
		this.nameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TYPE_: 
	 */
	public Jbpm4IdGroupQueryCondition setTypeCondition(String value) {
		this.type = value;
		return this;
	}
	
	/**
	 * 设置查询条件TYPE_: 
	 */
	public Jbpm4IdGroupQueryCondition setTypeConditionEqual(String value) {
		this.typeEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_: 
	 */
	public Jbpm4IdGroupQueryCondition setParentCondition(Double value) {
		this.parent = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_: 
	 */
	public Jbpm4IdGroupQueryCondition setParentConditionBegin(Double value) {
		this.parentBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_: 
	 */
	public Jbpm4IdGroupQueryCondition setParentConditionEnd(Double value) {
		this.parentEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_: 
	 */
	public Jbpm4IdGroupQueryCondition setParentConditionEndEqual(Double value) {
		this.parentEndEqual = value;
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
						+ ((" and ([JBPM4_ID_GROUP].[DBID_] = " + this.dbid) 
						+ ") "));
		}
		if ((this.dbidBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_GROUP].[DBID_] >= " 
						+ (this.dbidBegin + ")")));
		}
		if ((this.dbidEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_GROUP].[DBID_] < " 
						+ (this.dbidEnd + ") ")));
		}
		if ((this.dbidEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_GROUP].[DBID_] <= " 
						+ (this.dbidEndEqual + ") ")));
		}
		if ((this.dbversion == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_ID_GROUP].[DBVERSION_] = " + this.dbversion) 
						+ ") "));
		}
		if ((this.dbversionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_GROUP].[DBVERSION_] >= " 
						+ (this.dbversionBegin + ")")));
		}
		if ((this.dbversionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_GROUP].[DBVERSION_] < " 
						+ (this.dbversionEnd + ") ")));
		}
		if ((this.dbversionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_GROUP].[DBVERSION_] <= " 
						+ (this.dbversionEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.id)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_ID_GROUP].[ID_]", this.id)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.idEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_ID_GROUP].[ID_] = " + SqlServerUtils.safeSql(this.idEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.name)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_ID_GROUP].[NAME_]", this.name)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.nameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_ID_GROUP].[NAME_] = " + SqlServerUtils.safeSql(this.nameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.type)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_ID_GROUP].[TYPE_]", this.type)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.typeEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_ID_GROUP].[TYPE_] = " + SqlServerUtils.safeSql(this.typeEqual))) 
						+ ") "));
		}
		if ((this.parent == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_ID_GROUP].[PARENT_] = " + this.parent) 
						+ ") "));
		}
		if ((this.parentBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_GROUP].[PARENT_] >= " 
						+ (this.parentBegin + ")")));
		}
		if ((this.parentEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_GROUP].[PARENT_] < " 
						+ (this.parentEnd + ") ")));
		}
		if ((this.parentEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_ID_GROUP].[PARENT_] <= " 
						+ (this.parentEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
