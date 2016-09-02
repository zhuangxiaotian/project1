package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_PRIORITIES查询条件定义
 */
public class IssuePrioritiesQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,PRIORITIES_ID: 优先级别
	 */
	Byte prioritiesId;
	
	/**
	 * 查询条件开始值,PRIORITIES_ID: 优先级别
	 */
	Byte prioritiesIdBegin;
	
	/**
	 * 查询条件结束值,PRIORITIES_ID: 优先级别
	 */
	Byte prioritiesIdEnd;
	
	/**
	 * 查询条件结束值,PRIORITIES_ID: 优先级别
	 */
	Byte prioritiesIdEndEqual;
	
	/**
	 * 查询条件,PRIORITIES_NAME: 优先名称
	 */
	String prioritiesName;
	
	/**
	 * 查询条件字符串相等,PRIORITIES_NAME: 优先名称
	 */
	String prioritiesNameEqual;
	
	/**
	 * 查询条件,IS_DEFAULT: 是否是默认级别
	 */
	Boolean isDefault;
	
	/**
	 * PRIORITIES_ID: 优先级别
	 */
	public Byte getPrioritiesId() {
		return this.prioritiesId;
	}
	
	/**
	 * PRIORITIES_ID: 优先级别
	 */
	public void setPrioritiesId(Byte value)
	 {
		this.prioritiesId = value;
	}
	
	/**
	 * 查询条件开始值,PRIORITIES_ID: 优先级别
	 */
	public Byte getPrioritiesIdBegin() {
		return this.prioritiesIdBegin;
	}
	
	/**
	 * 查询条件开始值,PRIORITIES_ID: 优先级别
	 */
	public void setPrioritiesIdBegin(Byte value)
	 {
		this.prioritiesIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PRIORITIES_ID: 优先级别
	 */
	public Byte getPrioritiesIdEnd() {
		return this.prioritiesIdEnd;
	}
	
	/**
	 * 查询条件结束值,PRIORITIES_ID: 优先级别
	 */
	public void setPrioritiesIdEnd(Byte value)
	 {
		this.prioritiesIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PRIORITIES_ID: 优先级别
	 */
	public Byte getPrioritiesIdEndEqual() {
		return this.prioritiesIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PRIORITIES_ID: 优先级别
	 */
	public void setPrioritiesIdEndEqual(Byte value)
	 {
		this.prioritiesIdEndEqual = value;
	}
	
	/**
	 * PRIORITIES_NAME: 优先名称
	 */
	public String getPrioritiesName() {
		return this.prioritiesName;
	}
	
	/**
	 * PRIORITIES_NAME: 优先名称
	 */
	public void setPrioritiesName(String value)
	 {
		this.prioritiesName = value;
	}
	
	/**
	 * 查询条件字符串相等,PRIORITIES_NAME: 优先名称
	 */
	public String getPrioritiesNameEqual() {
		return this.prioritiesNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,PRIORITIES_NAME: 优先名称
	 */
	public void setPrioritiesNameEqual(String value)
	 {
		this.prioritiesNameEqual = value;
	}
	
	/**
	 * IS_DEFAULT: 是否是默认级别
	 */
	public Boolean getIsDefault() {
		return this.isDefault;
	}
	
	/**
	 * IS_DEFAULT: 是否是默认级别
	 */
	public void setIsDefault(Boolean value)
	 {
		this.isDefault = value;
	}
	
	/**
	 * 设置查询条件PRIORITIES_ID: 优先级别
	 */
	public IssuePrioritiesQueryCondition setPrioritiesIdCondition(Byte value) {
		this.prioritiesId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITIES_ID: 优先级别
	 */
	public IssuePrioritiesQueryCondition setPrioritiesIdConditionBegin(Byte value) {
		this.prioritiesIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITIES_ID: 优先级别
	 */
	public IssuePrioritiesQueryCondition setPrioritiesIdConditionEnd(Byte value) {
		this.prioritiesIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITIES_ID: 优先级别
	 */
	public IssuePrioritiesQueryCondition setPrioritiesIdConditionEndEqual(Byte value) {
		this.prioritiesIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITIES_NAME: 优先名称
	 */
	public IssuePrioritiesQueryCondition setPrioritiesNameCondition(String value) {
		this.prioritiesName = value;
		return this;
	}
	
	/**
	 * 设置查询条件PRIORITIES_NAME: 优先名称
	 */
	public IssuePrioritiesQueryCondition setPrioritiesNameConditionEqual(String value) {
		this.prioritiesNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件IS_DEFAULT: 是否是默认级别
	 */
	public IssuePrioritiesQueryCondition setIsDefaultCondition(Boolean value) {
		this.isDefault = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.prioritiesId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_PRIORITIES].[PRIORITIES_ID] = " + this.prioritiesId) 
						+ ") "));
		}
		if ((this.prioritiesIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PRIORITIES].[PRIORITIES_ID] >= " 
						+ (this.prioritiesIdBegin + ")")));
		}
		if ((this.prioritiesIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PRIORITIES].[PRIORITIES_ID] < " 
						+ (this.prioritiesIdEnd + ") ")));
		}
		if ((this.prioritiesIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_PRIORITIES].[PRIORITIES_ID] <= " 
						+ (this.prioritiesIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.prioritiesName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ISSUE_PRIORITIES].[PRIORITIES_NAME]", this.prioritiesName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.prioritiesNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ISSUE_PRIORITIES].[PRIORITIES_NAME] = " + SqlServerUtils.safeSql(this.prioritiesNameEqual))) 
						+ ") "));
		}
		if ((this.isDefault == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_PRIORITIES].[IS_DEFAULT] = " + SqlServerUtils.getBoolSql(this.isDefault)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
