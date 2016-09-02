package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_DEPART_MENT查询条件定义
 */
public class DepartMentQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,DEPART_MENT_ID: 部门ID
	 */
	Integer departMentId;
	
	/**
	 * 查询条件开始值,DEPART_MENT_ID: 部门ID
	 */
	Integer departMentIdBegin;
	
	/**
	 * 查询条件结束值,DEPART_MENT_ID: 部门ID
	 */
	Integer departMentIdEnd;
	
	/**
	 * 查询条件结束值,DEPART_MENT_ID: 部门ID
	 */
	Integer departMentIdEndEqual;
	
	/**
	 * 查询条件,DEPART_MENT_NAME: 部门名称
	 */
	String departMentName;
	
	/**
	 * 查询条件字符串相等,DEPART_MENT_NAME: 部门名称
	 */
	String departMentNameEqual;
	
	/**
	 * 查询条件,DEPART_MENT_PARENT_ID: 父部门ID
	 */
	Integer departMentParentId;
	
	/**
	 * 查询条件开始值,DEPART_MENT_PARENT_ID: 父部门ID
	 */
	Integer departMentParentIdBegin;
	
	/**
	 * 查询条件结束值,DEPART_MENT_PARENT_ID: 父部门ID
	 */
	Integer departMentParentIdEnd;
	
	/**
	 * 查询条件结束值,DEPART_MENT_PARENT_ID: 父部门ID
	 */
	Integer departMentParentIdEndEqual;
	
	/**
	 * DEPART_MENT_ID: 部门ID
	 */
	public Integer getDepartMentId() {
		return this.departMentId;
	}
	
	/**
	 * DEPART_MENT_ID: 部门ID
	 */
	public void setDepartMentId(Integer value)
	 {
		this.departMentId = value;
	}
	
	/**
	 * 查询条件开始值,DEPART_MENT_ID: 部门ID
	 */
	public Integer getDepartMentIdBegin() {
		return this.departMentIdBegin;
	}
	
	/**
	 * 查询条件开始值,DEPART_MENT_ID: 部门ID
	 */
	public void setDepartMentIdBegin(Integer value)
	 {
		this.departMentIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,DEPART_MENT_ID: 部门ID
	 */
	public Integer getDepartMentIdEnd() {
		return this.departMentIdEnd;
	}
	
	/**
	 * 查询条件结束值,DEPART_MENT_ID: 部门ID
	 */
	public void setDepartMentIdEnd(Integer value)
	 {
		this.departMentIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,DEPART_MENT_ID: 部门ID
	 */
	public Integer getDepartMentIdEndEqual() {
		return this.departMentIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,DEPART_MENT_ID: 部门ID
	 */
	public void setDepartMentIdEndEqual(Integer value)
	 {
		this.departMentIdEndEqual = value;
	}
	
	/**
	 * DEPART_MENT_NAME: 部门名称
	 */
	public String getDepartMentName() {
		return this.departMentName;
	}
	
	/**
	 * DEPART_MENT_NAME: 部门名称
	 */
	public void setDepartMentName(String value)
	 {
		this.departMentName = value;
	}
	
	/**
	 * 查询条件字符串相等,DEPART_MENT_NAME: 部门名称
	 */
	public String getDepartMentNameEqual() {
		return this.departMentNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,DEPART_MENT_NAME: 部门名称
	 */
	public void setDepartMentNameEqual(String value)
	 {
		this.departMentNameEqual = value;
	}
	
	/**
	 * DEPART_MENT_PARENT_ID: 父部门ID
	 */
	public Integer getDepartMentParentId() {
		return this.departMentParentId;
	}
	
	/**
	 * DEPART_MENT_PARENT_ID: 父部门ID
	 */
	public void setDepartMentParentId(Integer value)
	 {
		this.departMentParentId = value;
	}
	
	/**
	 * 查询条件开始值,DEPART_MENT_PARENT_ID: 父部门ID
	 */
	public Integer getDepartMentParentIdBegin() {
		return this.departMentParentIdBegin;
	}
	
	/**
	 * 查询条件开始值,DEPART_MENT_PARENT_ID: 父部门ID
	 */
	public void setDepartMentParentIdBegin(Integer value)
	 {
		this.departMentParentIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,DEPART_MENT_PARENT_ID: 父部门ID
	 */
	public Integer getDepartMentParentIdEnd() {
		return this.departMentParentIdEnd;
	}
	
	/**
	 * 查询条件结束值,DEPART_MENT_PARENT_ID: 父部门ID
	 */
	public void setDepartMentParentIdEnd(Integer value)
	 {
		this.departMentParentIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,DEPART_MENT_PARENT_ID: 父部门ID
	 */
	public Integer getDepartMentParentIdEndEqual() {
		return this.departMentParentIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,DEPART_MENT_PARENT_ID: 父部门ID
	 */
	public void setDepartMentParentIdEndEqual(Integer value)
	 {
		this.departMentParentIdEndEqual = value;
	}
	
	/**
	 * 设置查询条件DEPART_MENT_ID: 部门ID
	 */
	public DepartMentQueryCondition setDepartMentIdCondition(Integer value) {
		this.departMentId = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEPART_MENT_ID: 部门ID
	 */
	public DepartMentQueryCondition setDepartMentIdConditionBegin(Integer value) {
		this.departMentIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEPART_MENT_ID: 部门ID
	 */
	public DepartMentQueryCondition setDepartMentIdConditionEnd(Integer value) {
		this.departMentIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEPART_MENT_ID: 部门ID
	 */
	public DepartMentQueryCondition setDepartMentIdConditionEndEqual(Integer value) {
		this.departMentIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEPART_MENT_NAME: 部门名称
	 */
	public DepartMentQueryCondition setDepartMentNameCondition(String value) {
		this.departMentName = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEPART_MENT_NAME: 部门名称
	 */
	public DepartMentQueryCondition setDepartMentNameConditionEqual(String value) {
		this.departMentNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEPART_MENT_PARENT_ID: 父部门ID
	 */
	public DepartMentQueryCondition setDepartMentParentIdCondition(Integer value) {
		this.departMentParentId = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEPART_MENT_PARENT_ID: 父部门ID
	 */
	public DepartMentQueryCondition setDepartMentParentIdConditionBegin(Integer value) {
		this.departMentParentIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEPART_MENT_PARENT_ID: 父部门ID
	 */
	public DepartMentQueryCondition setDepartMentParentIdConditionEnd(Integer value) {
		this.departMentParentIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEPART_MENT_PARENT_ID: 父部门ID
	 */
	public DepartMentQueryCondition setDepartMentParentIdConditionEndEqual(Integer value) {
		this.departMentParentIdEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.departMentId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_DEPART_MENT].[DEPART_MENT_ID] = " + this.departMentId) 
						+ ") "));
		}
		if ((this.departMentIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_DEPART_MENT].[DEPART_MENT_ID] >= " 
						+ (this.departMentIdBegin + ")")));
		}
		if ((this.departMentIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_DEPART_MENT].[DEPART_MENT_ID] < " 
						+ (this.departMentIdEnd + ") ")));
		}
		if ((this.departMentIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_DEPART_MENT].[DEPART_MENT_ID] <= " 
						+ (this.departMentIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.departMentName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_DEPART_MENT].[DEPART_MENT_NAME]", this.departMentName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.departMentNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_DEPART_MENT].[DEPART_MENT_NAME] = " + SqlServerUtils.safeSql(this.departMentNameEqual))) 
						+ ") "));
		}
		if ((this.departMentParentId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_DEPART_MENT].[DEPART_MENT_PARENT_ID] = " + this.departMentParentId) 
						+ ") "));
		}
		if ((this.departMentParentIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_DEPART_MENT].[DEPART_MENT_PARENT_ID] >= " 
						+ (this.departMentParentIdBegin + ")")));
		}
		if ((this.departMentParentIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_DEPART_MENT].[DEPART_MENT_PARENT_ID] < " 
						+ (this.departMentParentIdEnd + ") ")));
		}
		if ((this.departMentParentIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_DEPART_MENT].[DEPART_MENT_PARENT_ID] <= " 
						+ (this.departMentParentIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
