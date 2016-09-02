package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_IDENTITY查询条件定义
 */
public class IdentityQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,TAB_NAME: 
	 */
	String tabName;
	
	/**
	 * 查询条件字符串相等,TAB_NAME: 
	 */
	String tabNameEqual;
	
	/**
	 * 查询条件,LAST_MODIFY: 
	 */
	java.util.Date lastModify;
	
	/**
	 * 查询条件开始值,LAST_MODIFY: 
	 */
	java.util.Date lastModifyBegin;
	
	/**
	 * 查询条件结束值,LAST_MODIFY: 
	 */
	java.util.Date lastModifyEnd;
	
	/**
	 * 查询条件结束值,LAST_MODIFY: 
	 */
	java.util.Date lastModifyEndEqual;
	
	/**
	 * 查询条件,CURRENT_IDENTITY: 
	 */
	Integer currentIdentity;
	
	/**
	 * 查询条件开始值,CURRENT_IDENTITY: 
	 */
	Integer currentIdentityBegin;
	
	/**
	 * 查询条件结束值,CURRENT_IDENTITY: 
	 */
	Integer currentIdentityEnd;
	
	/**
	 * 查询条件结束值,CURRENT_IDENTITY: 
	 */
	Integer currentIdentityEndEqual;
	
	/**
	 * TAB_NAME: 
	 */
	public String getTabName() {
		return this.tabName;
	}
	
	/**
	 * TAB_NAME: 
	 */
	public void setTabName(String value)
	 {
		this.tabName = value;
	}
	
	/**
	 * 查询条件字符串相等,TAB_NAME: 
	 */
	public String getTabNameEqual() {
		return this.tabNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,TAB_NAME: 
	 */
	public void setTabNameEqual(String value)
	 {
		this.tabNameEqual = value;
	}
	
	/**
	 * LAST_MODIFY: 
	 */
	public java.util.Date getLastModify() {
		return this.lastModify;
	}
	
	/**
	 * LAST_MODIFY: 
	 */
	public void setLastModify(java.util.Date value)
	 {
		this.lastModify = value;
	}
	
	/**
	 * 查询条件开始值,LAST_MODIFY: 
	 */
	public java.util.Date getLastModifyBegin() {
		return this.lastModifyBegin;
	}
	
	/**
	 * 查询条件开始值,LAST_MODIFY: 
	 */
	public void setLastModifyBegin(java.util.Date value)
	 {
		this.lastModifyBegin = value;
	}
	
	/**
	 * 查询条件结束值,LAST_MODIFY: 
	 */
	public java.util.Date getLastModifyEnd() {
		return this.lastModifyEnd;
	}
	
	/**
	 * 查询条件结束值,LAST_MODIFY: 
	 */
	public void setLastModifyEnd(java.util.Date value)
	 {
		this.lastModifyEnd = value;
	}
	
	/**
	 * 查询条件结束值,LAST_MODIFY: 
	 */
	public java.util.Date getLastModifyEndEqual() {
		return this.lastModifyEndEqual;
	}
	
	/**
	 * 查询条件结束值,LAST_MODIFY: 
	 */
	public void setLastModifyEndEqual(java.util.Date value)
	 {
		this.lastModifyEndEqual = value;
	}
	
	/**
	 * CURRENT_IDENTITY: 
	 */
	public Integer getCurrentIdentity() {
		return this.currentIdentity;
	}
	
	/**
	 * CURRENT_IDENTITY: 
	 */
	public void setCurrentIdentity(Integer value)
	 {
		this.currentIdentity = value;
	}
	
	/**
	 * 查询条件开始值,CURRENT_IDENTITY: 
	 */
	public Integer getCurrentIdentityBegin() {
		return this.currentIdentityBegin;
	}
	
	/**
	 * 查询条件开始值,CURRENT_IDENTITY: 
	 */
	public void setCurrentIdentityBegin(Integer value)
	 {
		this.currentIdentityBegin = value;
	}
	
	/**
	 * 查询条件结束值,CURRENT_IDENTITY: 
	 */
	public Integer getCurrentIdentityEnd() {
		return this.currentIdentityEnd;
	}
	
	/**
	 * 查询条件结束值,CURRENT_IDENTITY: 
	 */
	public void setCurrentIdentityEnd(Integer value)
	 {
		this.currentIdentityEnd = value;
	}
	
	/**
	 * 查询条件结束值,CURRENT_IDENTITY: 
	 */
	public Integer getCurrentIdentityEndEqual() {
		return this.currentIdentityEndEqual;
	}
	
	/**
	 * 查询条件结束值,CURRENT_IDENTITY: 
	 */
	public void setCurrentIdentityEndEqual(Integer value)
	 {
		this.currentIdentityEndEqual = value;
	}
	
	/**
	 * 设置查询条件TAB_NAME: 
	 */
	public IdentityQueryCondition setTabNameCondition(String value) {
		this.tabName = value;
		return this;
	}
	
	/**
	 * 设置查询条件TAB_NAME: 
	 */
	public IdentityQueryCondition setTabNameConditionEqual(String value) {
		this.tabNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件LAST_MODIFY: 
	 */
	public IdentityQueryCondition setLastModifyCondition(java.util.Date value) {
		this.lastModify = value;
		return this;
	}
	
	/**
	 * 设置查询条件LAST_MODIFY: 
	 */
	public IdentityQueryCondition setLastModifyConditionBegin(java.util.Date value) {
		this.lastModifyBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件LAST_MODIFY: 
	 */
	public IdentityQueryCondition setLastModifyConditionEnd(java.util.Date value) {
		this.lastModifyEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件LAST_MODIFY: 
	 */
	public IdentityQueryCondition setLastModifyConditionEndEqual(java.util.Date value) {
		this.lastModifyEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CURRENT_IDENTITY: 
	 */
	public IdentityQueryCondition setCurrentIdentityCondition(Integer value) {
		this.currentIdentity = value;
		return this;
	}
	
	/**
	 * 设置查询条件CURRENT_IDENTITY: 
	 */
	public IdentityQueryCondition setCurrentIdentityConditionBegin(Integer value) {
		this.currentIdentityBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CURRENT_IDENTITY: 
	 */
	public IdentityQueryCondition setCurrentIdentityConditionEnd(Integer value) {
		this.currentIdentityEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CURRENT_IDENTITY: 
	 */
	public IdentityQueryCondition setCurrentIdentityConditionEndEqual(Integer value) {
		this.currentIdentityEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if (StringUtils.isNullOrEmpty(this.tabName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_IDENTITY].[TAB_NAME]", this.tabName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.tabNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_IDENTITY].[TAB_NAME] = " + SqlServerUtils.safeSql(this.tabNameEqual))) 
						+ ") "));
		}
		if ((this.lastModify == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_IDENTITY].[LAST_MODIFY] = " + SqlServerUtils.getDateSql(this.lastModify)) 
						+ ") "));
		}
		if ((this.lastModifyBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_IDENTITY].[LAST_MODIFY] >= " 
						+ (SqlServerUtils.getDateSql(this.lastModifyBegin) + ")")));
		}
		if ((this.lastModifyEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_IDENTITY].[LAST_MODIFY] < " 
						+ (SqlServerUtils.getDateSql(this.lastModifyEnd) + ") ")));
		}
		if ((this.lastModifyEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_IDENTITY].[LAST_MODIFY] < " 
						+ (SqlServerUtils.getNextDateSql(this.lastModifyEndEqual) + ") ")));
		}
		if ((this.currentIdentity == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_IDENTITY].[CURRENT_IDENTITY] = " + this.currentIdentity) 
						+ ") "));
		}
		if ((this.currentIdentityBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_IDENTITY].[CURRENT_IDENTITY] >= " 
						+ (this.currentIdentityBegin + ")")));
		}
		if ((this.currentIdentityEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_IDENTITY].[CURRENT_IDENTITY] < " 
						+ (this.currentIdentityEnd + ") ")));
		}
		if ((this.currentIdentityEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_IDENTITY].[CURRENT_IDENTITY] <= " 
						+ (this.currentIdentityEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
