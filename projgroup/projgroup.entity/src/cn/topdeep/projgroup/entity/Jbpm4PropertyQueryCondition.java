package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_PROPERTY查询条件定义
 */
public class Jbpm4PropertyQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,KEY_: 
	 */
	String key;
	
	/**
	 * 查询条件字符串相等,KEY_: 
	 */
	String keyEqual;
	
	/**
	 * 查询条件,VERSION_: 
	 */
	Integer version;
	
	/**
	 * 查询条件开始值,VERSION_: 
	 */
	Integer versionBegin;
	
	/**
	 * 查询条件结束值,VERSION_: 
	 */
	Integer versionEnd;
	
	/**
	 * 查询条件结束值,VERSION_: 
	 */
	Integer versionEndEqual;
	
	/**
	 * 查询条件,VALUE_: 
	 */
	String value;
	
	/**
	 * 查询条件字符串相等,VALUE_: 
	 */
	String valueEqual;
	
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
	 * VERSION_: 
	 */
	public Integer getVersion() {
		return this.version;
	}
	
	/**
	 * VERSION_: 
	 */
	public void setVersion(Integer value)
	 {
		this.version = value;
	}
	
	/**
	 * 查询条件开始值,VERSION_: 
	 */
	public Integer getVersionBegin() {
		return this.versionBegin;
	}
	
	/**
	 * 查询条件开始值,VERSION_: 
	 */
	public void setVersionBegin(Integer value)
	 {
		this.versionBegin = value;
	}
	
	/**
	 * 查询条件结束值,VERSION_: 
	 */
	public Integer getVersionEnd() {
		return this.versionEnd;
	}
	
	/**
	 * 查询条件结束值,VERSION_: 
	 */
	public void setVersionEnd(Integer value)
	 {
		this.versionEnd = value;
	}
	
	/**
	 * 查询条件结束值,VERSION_: 
	 */
	public Integer getVersionEndEqual() {
		return this.versionEndEqual;
	}
	
	/**
	 * 查询条件结束值,VERSION_: 
	 */
	public void setVersionEndEqual(Integer value)
	 {
		this.versionEndEqual = value;
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
	 * 设置查询条件KEY_: 
	 */
	public Jbpm4PropertyQueryCondition setKeyCondition(String value) {
		this.key = value;
		return this;
	}
	
	/**
	 * 设置查询条件KEY_: 
	 */
	public Jbpm4PropertyQueryCondition setKeyConditionEqual(String value) {
		this.keyEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件VERSION_: 
	 */
	public Jbpm4PropertyQueryCondition setVersionCondition(Integer value) {
		this.version = value;
		return this;
	}
	
	/**
	 * 设置查询条件VERSION_: 
	 */
	public Jbpm4PropertyQueryCondition setVersionConditionBegin(Integer value) {
		this.versionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件VERSION_: 
	 */
	public Jbpm4PropertyQueryCondition setVersionConditionEnd(Integer value) {
		this.versionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件VERSION_: 
	 */
	public Jbpm4PropertyQueryCondition setVersionConditionEndEqual(Integer value) {
		this.versionEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件VALUE_: 
	 */
	public Jbpm4PropertyQueryCondition setValueCondition(String value) {
		this.value = value;
		return this;
	}
	
	/**
	 * 设置查询条件VALUE_: 
	 */
	public Jbpm4PropertyQueryCondition setValueConditionEqual(String value) {
		this.valueEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if (StringUtils.isNullOrEmpty(this.key)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_PROPERTY].[KEY_]", this.key)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.keyEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_PROPERTY].[KEY_] = " + SqlServerUtils.safeSql(this.keyEqual))) 
						+ ") "));
		}
		if ((this.version == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_PROPERTY].[VERSION_] = " + this.version) 
						+ ") "));
		}
		if ((this.versionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_PROPERTY].[VERSION_] >= " 
						+ (this.versionBegin + ")")));
		}
		if ((this.versionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_PROPERTY].[VERSION_] < " 
						+ (this.versionEnd + ") ")));
		}
		if ((this.versionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_PROPERTY].[VERSION_] <= " 
						+ (this.versionEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.value)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_PROPERTY].[VALUE_]", this.value)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.valueEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_PROPERTY].[VALUE_] = " + SqlServerUtils.safeSql(this.valueEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
