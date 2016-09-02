package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_DEPART_MENT_USER查询条件定义
 */
public class DepartMentUserQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,USER_ID: 用户代号
	 */
	Integer userId;
	
	/**
	 * 查询条件开始值,USER_ID: 用户代号
	 */
	Integer userIdBegin;
	
	/**
	 * 查询条件结束值,USER_ID: 用户代号
	 */
	Integer userIdEnd;
	
	/**
	 * 查询条件结束值,USER_ID: 用户代号
	 */
	Integer userIdEndEqual;
	
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
	 * USER_ID: 用户代号
	 */
	public Integer getUserId() {
		return this.userId;
	}
	
	/**
	 * USER_ID: 用户代号
	 */
	public void setUserId(Integer value)
	 {
		this.userId = value;
	}
	
	/**
	 * 查询条件开始值,USER_ID: 用户代号
	 */
	public Integer getUserIdBegin() {
		return this.userIdBegin;
	}
	
	/**
	 * 查询条件开始值,USER_ID: 用户代号
	 */
	public void setUserIdBegin(Integer value)
	 {
		this.userIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,USER_ID: 用户代号
	 */
	public Integer getUserIdEnd() {
		return this.userIdEnd;
	}
	
	/**
	 * 查询条件结束值,USER_ID: 用户代号
	 */
	public void setUserIdEnd(Integer value)
	 {
		this.userIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,USER_ID: 用户代号
	 */
	public Integer getUserIdEndEqual() {
		return this.userIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,USER_ID: 用户代号
	 */
	public void setUserIdEndEqual(Integer value)
	 {
		this.userIdEndEqual = value;
	}
	
	/**
	 * 设置查询条件DEPART_MENT_ID: 部门ID
	 */
	public DepartMentUserQueryCondition setDepartMentIdCondition(Integer value) {
		this.departMentId = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEPART_MENT_ID: 部门ID
	 */
	public DepartMentUserQueryCondition setDepartMentIdConditionBegin(Integer value) {
		this.departMentIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEPART_MENT_ID: 部门ID
	 */
	public DepartMentUserQueryCondition setDepartMentIdConditionEnd(Integer value) {
		this.departMentIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DEPART_MENT_ID: 部门ID
	 */
	public DepartMentUserQueryCondition setDepartMentIdConditionEndEqual(Integer value) {
		this.departMentIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 用户代号
	 */
	public DepartMentUserQueryCondition setUserIdCondition(Integer value) {
		this.userId = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 用户代号
	 */
	public DepartMentUserQueryCondition setUserIdConditionBegin(Integer value) {
		this.userIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 用户代号
	 */
	public DepartMentUserQueryCondition setUserIdConditionEnd(Integer value) {
		this.userIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件USER_ID: 用户代号
	 */
	public DepartMentUserQueryCondition setUserIdConditionEndEqual(Integer value) {
		this.userIdEndEqual = value;
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
						+ ((" and ([T_DEPART_MENT_USER].[DEPART_MENT_ID] = " + this.departMentId) 
						+ ") "));
		}
		if ((this.departMentIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_DEPART_MENT_USER].[DEPART_MENT_ID] >= " 
						+ (this.departMentIdBegin + ")")));
		}
		if ((this.departMentIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_DEPART_MENT_USER].[DEPART_MENT_ID] < " 
						+ (this.departMentIdEnd + ") ")));
		}
		if ((this.departMentIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_DEPART_MENT_USER].[DEPART_MENT_ID] <= " 
						+ (this.departMentIdEndEqual + ") ")));
		}
		if ((this.userId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_DEPART_MENT_USER].[USER_ID] = " + this.userId) 
						+ ") "));
		}
		if ((this.userIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_DEPART_MENT_USER].[USER_ID] >= " 
						+ (this.userIdBegin + ")")));
		}
		if ((this.userIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_DEPART_MENT_USER].[USER_ID] < " 
						+ (this.userIdEnd + ") ")));
		}
		if ((this.userIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_DEPART_MENT_USER].[USER_ID] <= " 
						+ (this.userIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
