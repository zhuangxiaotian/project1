package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_ROLES查询条件定义
 */
public class IssueRolesQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,ROLE_ID: 标识
	 */
	Integer roleId;
	
	/**
	 * 查询条件开始值,ROLE_ID: 标识
	 */
	Integer roleIdBegin;
	
	/**
	 * 查询条件结束值,ROLE_ID: 标识
	 */
	Integer roleIdEnd;
	
	/**
	 * 查询条件结束值,ROLE_ID: 标识
	 */
	Integer roleIdEndEqual;
	
	/**
	 * 查询条件,ROLE_NAME: 角色名称
	 */
	String roleName;
	
	/**
	 * 查询条件字符串相等,ROLE_NAME: 角色名称
	 */
	String roleNameEqual;
	
	/**
	 * 查询条件,ROLE_STATE: 角色状态 0 激活 1禁止
	 */
	Byte roleState;
	
	/**
	 * 查询条件开始值,ROLE_STATE: 角色状态 0 激活 1禁止
	 */
	Byte roleStateBegin;
	
	/**
	 * 查询条件结束值,ROLE_STATE: 角色状态 0 激活 1禁止
	 */
	Byte roleStateEnd;
	
	/**
	 * 查询条件结束值,ROLE_STATE: 角色状态 0 激活 1禁止
	 */
	Byte roleStateEndEqual;
	
	/**
	 * 查询条件,ROLE_PRIVILEGES: 角色的权限值(逗号分隔的权限列表) 
	 */
	String rolePrivileges;
	
	/**
	 * 查询条件字符串相等,ROLE_PRIVILEGES: 角色的权限值(逗号分隔的权限列表) 
	 */
	String rolePrivilegesEqual;
	
	/**
	 * ROLE_ID: 标识
	 */
	public Integer getRoleId() {
		return this.roleId;
	}
	
	/**
	 * ROLE_ID: 标识
	 */
	public void setRoleId(Integer value)
	 {
		this.roleId = value;
	}
	
	/**
	 * 查询条件开始值,ROLE_ID: 标识
	 */
	public Integer getRoleIdBegin() {
		return this.roleIdBegin;
	}
	
	/**
	 * 查询条件开始值,ROLE_ID: 标识
	 */
	public void setRoleIdBegin(Integer value)
	 {
		this.roleIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,ROLE_ID: 标识
	 */
	public Integer getRoleIdEnd() {
		return this.roleIdEnd;
	}
	
	/**
	 * 查询条件结束值,ROLE_ID: 标识
	 */
	public void setRoleIdEnd(Integer value)
	 {
		this.roleIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,ROLE_ID: 标识
	 */
	public Integer getRoleIdEndEqual() {
		return this.roleIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,ROLE_ID: 标识
	 */
	public void setRoleIdEndEqual(Integer value)
	 {
		this.roleIdEndEqual = value;
	}
	
	/**
	 * ROLE_NAME: 角色名称
	 */
	public String getRoleName() {
		return this.roleName;
	}
	
	/**
	 * ROLE_NAME: 角色名称
	 */
	public void setRoleName(String value)
	 {
		this.roleName = value;
	}
	
	/**
	 * 查询条件字符串相等,ROLE_NAME: 角色名称
	 */
	public String getRoleNameEqual() {
		return this.roleNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,ROLE_NAME: 角色名称
	 */
	public void setRoleNameEqual(String value)
	 {
		this.roleNameEqual = value;
	}
	
	/**
	 * ROLE_STATE: 角色状态 0 激活 1禁止
	 */
	public Byte getRoleState() {
		return this.roleState;
	}
	
	/**
	 * ROLE_STATE: 角色状态 0 激活 1禁止
	 */
	public void setRoleState(Byte value)
	 {
		this.roleState = value;
	}
	
	/**
	 * 查询条件开始值,ROLE_STATE: 角色状态 0 激活 1禁止
	 */
	public Byte getRoleStateBegin() {
		return this.roleStateBegin;
	}
	
	/**
	 * 查询条件开始值,ROLE_STATE: 角色状态 0 激活 1禁止
	 */
	public void setRoleStateBegin(Byte value)
	 {
		this.roleStateBegin = value;
	}
	
	/**
	 * 查询条件结束值,ROLE_STATE: 角色状态 0 激活 1禁止
	 */
	public Byte getRoleStateEnd() {
		return this.roleStateEnd;
	}
	
	/**
	 * 查询条件结束值,ROLE_STATE: 角色状态 0 激活 1禁止
	 */
	public void setRoleStateEnd(Byte value)
	 {
		this.roleStateEnd = value;
	}
	
	/**
	 * 查询条件结束值,ROLE_STATE: 角色状态 0 激活 1禁止
	 */
	public Byte getRoleStateEndEqual() {
		return this.roleStateEndEqual;
	}
	
	/**
	 * 查询条件结束值,ROLE_STATE: 角色状态 0 激活 1禁止
	 */
	public void setRoleStateEndEqual(Byte value)
	 {
		this.roleStateEndEqual = value;
	}
	
	/**
	 * ROLE_PRIVILEGES: 角色的权限值(逗号分隔的权限列表) 
	 */
	public String getRolePrivileges() {
		return this.rolePrivileges;
	}
	
	/**
	 * ROLE_PRIVILEGES: 角色的权限值(逗号分隔的权限列表) 
	 */
	public void setRolePrivileges(String value)
	 {
		this.rolePrivileges = value;
	}
	
	/**
	 * 查询条件字符串相等,ROLE_PRIVILEGES: 角色的权限值(逗号分隔的权限列表) 
	 */
	public String getRolePrivilegesEqual() {
		return this.rolePrivilegesEqual;
	}
	
	/**
	 * 查询条件字符串相等,ROLE_PRIVILEGES: 角色的权限值(逗号分隔的权限列表) 
	 */
	public void setRolePrivilegesEqual(String value)
	 {
		this.rolePrivilegesEqual = value;
	}
	
	/**
	 * 设置查询条件ROLE_ID: 标识
	 */
	public IssueRolesQueryCondition setRoleIdCondition(Integer value) {
		this.roleId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_ID: 标识
	 */
	public IssueRolesQueryCondition setRoleIdConditionBegin(Integer value) {
		this.roleIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_ID: 标识
	 */
	public IssueRolesQueryCondition setRoleIdConditionEnd(Integer value) {
		this.roleIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_ID: 标识
	 */
	public IssueRolesQueryCondition setRoleIdConditionEndEqual(Integer value) {
		this.roleIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_NAME: 角色名称
	 */
	public IssueRolesQueryCondition setRoleNameCondition(String value) {
		this.roleName = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_NAME: 角色名称
	 */
	public IssueRolesQueryCondition setRoleNameConditionEqual(String value) {
		this.roleNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_STATE: 角色状态 0 激活 1禁止
	 */
	public IssueRolesQueryCondition setRoleStateCondition(Byte value) {
		this.roleState = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_STATE: 角色状态 0 激活 1禁止
	 */
	public IssueRolesQueryCondition setRoleStateConditionBegin(Byte value) {
		this.roleStateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_STATE: 角色状态 0 激活 1禁止
	 */
	public IssueRolesQueryCondition setRoleStateConditionEnd(Byte value) {
		this.roleStateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_STATE: 角色状态 0 激活 1禁止
	 */
	public IssueRolesQueryCondition setRoleStateConditionEndEqual(Byte value) {
		this.roleStateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_PRIVILEGES: 角色的权限值(逗号分隔的权限列表) 
	 */
	public IssueRolesQueryCondition setRolePrivilegesCondition(String value) {
		this.rolePrivileges = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_PRIVILEGES: 角色的权限值(逗号分隔的权限列表) 
	 */
	public IssueRolesQueryCondition setRolePrivilegesConditionEqual(String value) {
		this.rolePrivilegesEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.roleId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_ROLES].[ROLE_ID] = " + this.roleId) 
						+ ") "));
		}
		if ((this.roleIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_ROLES].[ROLE_ID] >= " 
						+ (this.roleIdBegin + ")")));
		}
		if ((this.roleIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_ROLES].[ROLE_ID] < " 
						+ (this.roleIdEnd + ") ")));
		}
		if ((this.roleIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_ROLES].[ROLE_ID] <= " 
						+ (this.roleIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.roleName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ISSUE_ROLES].[ROLE_NAME]", this.roleName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.roleNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ISSUE_ROLES].[ROLE_NAME] = " + SqlServerUtils.safeSql(this.roleNameEqual))) 
						+ ") "));
		}
		if ((this.roleState == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_ROLES].[ROLE_STATE] = " + this.roleState) 
						+ ") "));
		}
		if ((this.roleStateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_ROLES].[ROLE_STATE] >= " 
						+ (this.roleStateBegin + ")")));
		}
		if ((this.roleStateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_ROLES].[ROLE_STATE] < " 
						+ (this.roleStateEnd + ") ")));
		}
		if ((this.roleStateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_ROLES].[ROLE_STATE] <= " 
						+ (this.roleStateEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.rolePrivileges)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ISSUE_ROLES].[ROLE_PRIVILEGES]", this.rolePrivileges)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.rolePrivilegesEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ISSUE_ROLES].[ROLE_PRIVILEGES] = " + SqlServerUtils.safeSql(this.rolePrivilegesEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
