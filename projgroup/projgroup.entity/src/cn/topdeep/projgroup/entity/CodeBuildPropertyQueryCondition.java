package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_CODE_BUILD_PROPERTY查询条件定义
 */
public class CodeBuildPropertyQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,BUILD_PROPERTY_ID: 属性标识
	 */
	Integer buildPropertyId;
	
	/**
	 * 查询条件开始值,BUILD_PROPERTY_ID: 属性标识
	 */
	Integer buildPropertyIdBegin;
	
	/**
	 * 查询条件结束值,BUILD_PROPERTY_ID: 属性标识
	 */
	Integer buildPropertyIdEnd;
	
	/**
	 * 查询条件结束值,BUILD_PROPERTY_ID: 属性标识
	 */
	Integer buildPropertyIdEndEqual;
	
	/**
	 * 查询条件,BUILD_ID: 构建标识
	 */
	Integer buildId;
	
	/**
	 * 查询条件开始值,BUILD_ID: 构建标识
	 */
	Integer buildIdBegin;
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	Integer buildIdEnd;
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	Integer buildIdEndEqual;
	
	/**
	 * 查询条件,BUILD_PROPERTY_NAME: 属性名称
	 */
	String buildPropertyName;
	
	/**
	 * 查询条件字符串相等,BUILD_PROPERTY_NAME: 属性名称
	 */
	String buildPropertyNameEqual;
	
	/**
	 * 查询条件,BUILD_PROPERTY_VALUE: 属性值
	 */
	String buildPropertyValue;
	
	/**
	 * 查询条件字符串相等,BUILD_PROPERTY_VALUE: 属性值
	 */
	String buildPropertyValueEqual;
	
	/**
	 * 查询条件,BUILD_PROPERTY_DESC: 属性描述
	 */
	String buildPropertyDesc;
	
	/**
	 * 查询条件字符串相等,BUILD_PROPERTY_DESC: 属性描述
	 */
	String buildPropertyDescEqual;
	
	/**
	 * BUILD_PROPERTY_ID: 属性标识
	 */
	public Integer getBuildPropertyId() {
		return this.buildPropertyId;
	}
	
	/**
	 * BUILD_PROPERTY_ID: 属性标识
	 */
	public void setBuildPropertyId(Integer value)
	 {
		this.buildPropertyId = value;
	}
	
	/**
	 * 查询条件开始值,BUILD_PROPERTY_ID: 属性标识
	 */
	public Integer getBuildPropertyIdBegin() {
		return this.buildPropertyIdBegin;
	}
	
	/**
	 * 查询条件开始值,BUILD_PROPERTY_ID: 属性标识
	 */
	public void setBuildPropertyIdBegin(Integer value)
	 {
		this.buildPropertyIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_PROPERTY_ID: 属性标识
	 */
	public Integer getBuildPropertyIdEnd() {
		return this.buildPropertyIdEnd;
	}
	
	/**
	 * 查询条件结束值,BUILD_PROPERTY_ID: 属性标识
	 */
	public void setBuildPropertyIdEnd(Integer value)
	 {
		this.buildPropertyIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_PROPERTY_ID: 属性标识
	 */
	public Integer getBuildPropertyIdEndEqual() {
		return this.buildPropertyIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,BUILD_PROPERTY_ID: 属性标识
	 */
	public void setBuildPropertyIdEndEqual(Integer value)
	 {
		this.buildPropertyIdEndEqual = value;
	}
	
	/**
	 * BUILD_ID: 构建标识
	 */
	public Integer getBuildId() {
		return this.buildId;
	}
	
	/**
	 * BUILD_ID: 构建标识
	 */
	public void setBuildId(Integer value)
	 {
		this.buildId = value;
	}
	
	/**
	 * 查询条件开始值,BUILD_ID: 构建标识
	 */
	public Integer getBuildIdBegin() {
		return this.buildIdBegin;
	}
	
	/**
	 * 查询条件开始值,BUILD_ID: 构建标识
	 */
	public void setBuildIdBegin(Integer value)
	 {
		this.buildIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	public Integer getBuildIdEnd() {
		return this.buildIdEnd;
	}
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	public void setBuildIdEnd(Integer value)
	 {
		this.buildIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	public Integer getBuildIdEndEqual() {
		return this.buildIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	public void setBuildIdEndEqual(Integer value)
	 {
		this.buildIdEndEqual = value;
	}
	
	/**
	 * BUILD_PROPERTY_NAME: 属性名称
	 */
	public String getBuildPropertyName() {
		return this.buildPropertyName;
	}
	
	/**
	 * BUILD_PROPERTY_NAME: 属性名称
	 */
	public void setBuildPropertyName(String value)
	 {
		this.buildPropertyName = value;
	}
	
	/**
	 * 查询条件字符串相等,BUILD_PROPERTY_NAME: 属性名称
	 */
	public String getBuildPropertyNameEqual() {
		return this.buildPropertyNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,BUILD_PROPERTY_NAME: 属性名称
	 */
	public void setBuildPropertyNameEqual(String value)
	 {
		this.buildPropertyNameEqual = value;
	}
	
	/**
	 * BUILD_PROPERTY_VALUE: 属性值
	 */
	public String getBuildPropertyValue() {
		return this.buildPropertyValue;
	}
	
	/**
	 * BUILD_PROPERTY_VALUE: 属性值
	 */
	public void setBuildPropertyValue(String value)
	 {
		this.buildPropertyValue = value;
	}
	
	/**
	 * 查询条件字符串相等,BUILD_PROPERTY_VALUE: 属性值
	 */
	public String getBuildPropertyValueEqual() {
		return this.buildPropertyValueEqual;
	}
	
	/**
	 * 查询条件字符串相等,BUILD_PROPERTY_VALUE: 属性值
	 */
	public void setBuildPropertyValueEqual(String value)
	 {
		this.buildPropertyValueEqual = value;
	}
	
	/**
	 * BUILD_PROPERTY_DESC: 属性描述
	 */
	public String getBuildPropertyDesc() {
		return this.buildPropertyDesc;
	}
	
	/**
	 * BUILD_PROPERTY_DESC: 属性描述
	 */
	public void setBuildPropertyDesc(String value)
	 {
		this.buildPropertyDesc = value;
	}
	
	/**
	 * 查询条件字符串相等,BUILD_PROPERTY_DESC: 属性描述
	 */
	public String getBuildPropertyDescEqual() {
		return this.buildPropertyDescEqual;
	}
	
	/**
	 * 查询条件字符串相等,BUILD_PROPERTY_DESC: 属性描述
	 */
	public void setBuildPropertyDescEqual(String value)
	 {
		this.buildPropertyDescEqual = value;
	}
	
	/**
	 * 设置查询条件BUILD_PROPERTY_ID: 属性标识
	 */
	public CodeBuildPropertyQueryCondition setBuildPropertyIdCondition(Integer value) {
		this.buildPropertyId = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_PROPERTY_ID: 属性标识
	 */
	public CodeBuildPropertyQueryCondition setBuildPropertyIdConditionBegin(Integer value) {
		this.buildPropertyIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_PROPERTY_ID: 属性标识
	 */
	public CodeBuildPropertyQueryCondition setBuildPropertyIdConditionEnd(Integer value) {
		this.buildPropertyIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_PROPERTY_ID: 属性标识
	 */
	public CodeBuildPropertyQueryCondition setBuildPropertyIdConditionEndEqual(Integer value) {
		this.buildPropertyIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public CodeBuildPropertyQueryCondition setBuildIdCondition(Integer value) {
		this.buildId = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public CodeBuildPropertyQueryCondition setBuildIdConditionBegin(Integer value) {
		this.buildIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public CodeBuildPropertyQueryCondition setBuildIdConditionEnd(Integer value) {
		this.buildIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public CodeBuildPropertyQueryCondition setBuildIdConditionEndEqual(Integer value) {
		this.buildIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_PROPERTY_NAME: 属性名称
	 */
	public CodeBuildPropertyQueryCondition setBuildPropertyNameCondition(String value) {
		this.buildPropertyName = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_PROPERTY_NAME: 属性名称
	 */
	public CodeBuildPropertyQueryCondition setBuildPropertyNameConditionEqual(String value) {
		this.buildPropertyNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_PROPERTY_VALUE: 属性值
	 */
	public CodeBuildPropertyQueryCondition setBuildPropertyValueCondition(String value) {
		this.buildPropertyValue = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_PROPERTY_VALUE: 属性值
	 */
	public CodeBuildPropertyQueryCondition setBuildPropertyValueConditionEqual(String value) {
		this.buildPropertyValueEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_PROPERTY_DESC: 属性描述
	 */
	public CodeBuildPropertyQueryCondition setBuildPropertyDescCondition(String value) {
		this.buildPropertyDesc = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_PROPERTY_DESC: 属性描述
	 */
	public CodeBuildPropertyQueryCondition setBuildPropertyDescConditionEqual(String value) {
		this.buildPropertyDescEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.buildPropertyId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_CODE_BUILD_PROPERTY].[BUILD_PROPERTY_ID] = " + this.buildPropertyId) 
						+ ") "));
		}
		if ((this.buildPropertyIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_PROPERTY].[BUILD_PROPERTY_ID] >= " 
						+ (this.buildPropertyIdBegin + ")")));
		}
		if ((this.buildPropertyIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_PROPERTY].[BUILD_PROPERTY_ID] < " 
						+ (this.buildPropertyIdEnd + ") ")));
		}
		if ((this.buildPropertyIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_PROPERTY].[BUILD_PROPERTY_ID] <= " 
						+ (this.buildPropertyIdEndEqual + ") ")));
		}
		if ((this.buildId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_CODE_BUILD_PROPERTY].[BUILD_ID] = " + this.buildId) 
						+ ") "));
		}
		if ((this.buildIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_PROPERTY].[BUILD_ID] >= " 
						+ (this.buildIdBegin + ")")));
		}
		if ((this.buildIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_PROPERTY].[BUILD_ID] < " 
						+ (this.buildIdEnd + ") ")));
		}
		if ((this.buildIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_PROPERTY].[BUILD_ID] <= " 
						+ (this.buildIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.buildPropertyName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_CODE_BUILD_PROPERTY].[BUILD_PROPERTY_NAME]", this.buildPropertyName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.buildPropertyNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_CODE_BUILD_PROPERTY].[BUILD_PROPERTY_NAME] = " + SqlServerUtils.safeSql(this.buildPropertyNameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.buildPropertyValue)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_CODE_BUILD_PROPERTY].[BUILD_PROPERTY_VALUE]", this.buildPropertyValue)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.buildPropertyValueEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_CODE_BUILD_PROPERTY].[BUILD_PROPERTY_VALUE] = " + SqlServerUtils.safeSql(this.buildPropertyValueEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.buildPropertyDesc)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_CODE_BUILD_PROPERTY].[BUILD_PROPERTY_DESC]", this.buildPropertyDesc)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.buildPropertyDescEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_CODE_BUILD_PROPERTY].[BUILD_PROPERTY_DESC] = " + SqlServerUtils.safeSql(this.buildPropertyDescEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
