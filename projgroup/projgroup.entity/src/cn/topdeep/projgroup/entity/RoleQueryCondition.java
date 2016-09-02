package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ROLE查询条件定义
 */
public class RoleQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,ROLE_ID: 角色代号
	 */
	Integer roleId;
	
	/**
	 * 查询条件开始值,ROLE_ID: 角色代号
	 */
	Integer roleIdBegin;
	
	/**
	 * 查询条件结束值,ROLE_ID: 角色代号
	 */
	Integer roleIdEnd;
	
	/**
	 * 查询条件结束值,ROLE_ID: 角色代号
	 */
	Integer roleIdEndEqual;
	
	/**
	 * 查询条件,ROLE_DESC: 角色描述
	 */
	String roleDesc;
	
	/**
	 * 查询条件字符串相等,ROLE_DESC: 角色描述
	 */
	String roleDescEqual;
	
	/**
	 * 查询条件,ROLE_NAME: 角色名称
	 */
	String roleName;
	
	/**
	 * 查询条件字符串相等,ROLE_NAME: 角色名称
	 */
	String roleNameEqual;
	
	/**
	 * 查询条件,ROLE_PRIVILEGES: 角色权利
	 */
	String rolePrivileges;
	
	/**
	 * 查询条件字符串相等,ROLE_PRIVILEGES: 角色权利
	 */
	String rolePrivilegesEqual;
	
	/**
	 * 查询条件,ROLE_STATE: 角色状态
	 */
	Integer roleState;
	
	/**
	 * 查询条件开始值,ROLE_STATE: 角色状态
	 */
	Integer roleStateBegin;
	
	/**
	 * 查询条件结束值,ROLE_STATE: 角色状态
	 */
	Integer roleStateEnd;
	
	/**
	 * 查询条件结束值,ROLE_STATE: 角色状态
	 */
	Integer roleStateEndEqual;
	
	/**
	 * ROLE_ID: 角色代号
	 */
	public Integer getRoleId() {
		return this.roleId;
	}
	
	/**
	 * ROLE_ID: 角色代号
	 */
	public void setRoleId(Integer value)
	 {
		this.roleId = value;
	}
	
	/**
	 * 查询条件开始值,ROLE_ID: 角色代号
	 */
	public Integer getRoleIdBegin() {
		return this.roleIdBegin;
	}
	
	/**
	 * 查询条件开始值,ROLE_ID: 角色代号
	 */
	public void setRoleIdBegin(Integer value)
	 {
		this.roleIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,ROLE_ID: 角色代号
	 */
	public Integer getRoleIdEnd() {
		return this.roleIdEnd;
	}
	
	/**
	 * 查询条件结束值,ROLE_ID: 角色代号
	 */
	public void setRoleIdEnd(Integer value)
	 {
		this.roleIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,ROLE_ID: 角色代号
	 */
	public Integer getRoleIdEndEqual() {
		return this.roleIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,ROLE_ID: 角色代号
	 */
	public void setRoleIdEndEqual(Integer value)
	 {
		this.roleIdEndEqual = value;
	}
	
	/**
	 * ROLE_DESC: 角色描述
	 */
	public String getRoleDesc() {
		return this.roleDesc;
	}
	
	/**
	 * ROLE_DESC: 角色描述
	 */
	public void setRoleDesc(String value)
	 {
		this.roleDesc = value;
	}
	
	/**
	 * 查询条件字符串相等,ROLE_DESC: 角色描述
	 */
	public String getRoleDescEqual() {
		return this.roleDescEqual;
	}
	
	/**
	 * 查询条件字符串相等,ROLE_DESC: 角色描述
	 */
	public void setRoleDescEqual(String value)
	 {
		this.roleDescEqual = value;
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
	 * ROLE_PRIVILEGES: 角色权利
	 */
	public String getRolePrivileges() {
		return this.rolePrivileges;
	}
	
	/**
	 * ROLE_PRIVILEGES: 角色权利
	 */
	public void setRolePrivileges(String value)
	 {
		this.rolePrivileges = value;
	}
	
	/**
	 * 查询条件字符串相等,ROLE_PRIVILEGES: 角色权利
	 */
	public String getRolePrivilegesEqual() {
		return this.rolePrivilegesEqual;
	}
	
	/**
	 * 查询条件字符串相等,ROLE_PRIVILEGES: 角色权利
	 */
	public void setRolePrivilegesEqual(String value)
	 {
		this.rolePrivilegesEqual = value;
	}
	
	/**
	 * ROLE_STATE: 角色状态
	 */
	public Integer getRoleState() {
		return this.roleState;
	}
	
	/**
	 * ROLE_STATE: 角色状态
	 */
	public void setRoleState(Integer value)
	 {
		this.roleState = value;
	}
	
	/**
	 * 查询条件开始值,ROLE_STATE: 角色状态
	 */
	public Integer getRoleStateBegin() {
		return this.roleStateBegin;
	}
	
	/**
	 * 查询条件开始值,ROLE_STATE: 角色状态
	 */
	public void setRoleStateBegin(Integer value)
	 {
		this.roleStateBegin = value;
	}
	
	/**
	 * 查询条件结束值,ROLE_STATE: 角色状态
	 */
	public Integer getRoleStateEnd() {
		return this.roleStateEnd;
	}
	
	/**
	 * 查询条件结束值,ROLE_STATE: 角色状态
	 */
	public void setRoleStateEnd(Integer value)
	 {
		this.roleStateEnd = value;
	}
	
	/**
	 * 查询条件结束值,ROLE_STATE: 角色状态
	 */
	public Integer getRoleStateEndEqual() {
		return this.roleStateEndEqual;
	}
	
	/**
	 * 查询条件结束值,ROLE_STATE: 角色状态
	 */
	public void setRoleStateEndEqual(Integer value)
	 {
		this.roleStateEndEqual = value;
	}
	
	/**
	 * 设置查询条件ROLE_ID: 角色代号
	 */
	public RoleQueryCondition setRoleIdCondition(Integer value) {
		this.roleId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_ID: 角色代号
	 */
	public RoleQueryCondition setRoleIdConditionBegin(Integer value) {
		this.roleIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_ID: 角色代号
	 */
	public RoleQueryCondition setRoleIdConditionEnd(Integer value) {
		this.roleIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_ID: 角色代号
	 */
	public RoleQueryCondition setRoleIdConditionEndEqual(Integer value) {
		this.roleIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_DESC: 角色描述
	 */
	public RoleQueryCondition setRoleDescCondition(String value) {
		this.roleDesc = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_DESC: 角色描述
	 */
	public RoleQueryCondition setRoleDescConditionEqual(String value) {
		this.roleDescEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_NAME: 角色名称
	 */
	public RoleQueryCondition setRoleNameCondition(String value) {
		this.roleName = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_NAME: 角色名称
	 */
	public RoleQueryCondition setRoleNameConditionEqual(String value) {
		this.roleNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_PRIVILEGES: 角色权利
	 */
	public RoleQueryCondition setRolePrivilegesCondition(String value) {
		this.rolePrivileges = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_PRIVILEGES: 角色权利
	 */
	public RoleQueryCondition setRolePrivilegesConditionEqual(String value) {
		this.rolePrivilegesEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_STATE: 角色状态
	 */
	public RoleQueryCondition setRoleStateCondition(Integer value) {
		this.roleState = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_STATE: 角色状态
	 */
	public RoleQueryCondition setRoleStateConditionBegin(Integer value) {
		this.roleStateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_STATE: 角色状态
	 */
	public RoleQueryCondition setRoleStateConditionEnd(Integer value) {
		this.roleStateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ROLE_STATE: 角色状态
	 */
	public RoleQueryCondition setRoleStateConditionEndEqual(Integer value) {
		this.roleStateEndEqual = value;
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
						+ ((" and ([T_ROLE].[ROLE_ID] = " + this.roleId) 
						+ ") "));
		}
		if ((this.roleIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ROLE].[ROLE_ID] >= " 
						+ (this.roleIdBegin + ")")));
		}
		if ((this.roleIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ROLE].[ROLE_ID] < " 
						+ (this.roleIdEnd + ") ")));
		}
		if ((this.roleIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ROLE].[ROLE_ID] <= " 
						+ (this.roleIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.roleDesc)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ROLE].[ROLE_DESC]", this.roleDesc)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.roleDescEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ROLE].[ROLE_DESC] = " + SqlServerUtils.safeSql(this.roleDescEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.roleName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ROLE].[ROLE_NAME]", this.roleName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.roleNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ROLE].[ROLE_NAME] = " + SqlServerUtils.safeSql(this.roleNameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.rolePrivileges)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ROLE].[ROLE_PRIVILEGES]", this.rolePrivileges)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.rolePrivilegesEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ROLE].[ROLE_PRIVILEGES] = " + SqlServerUtils.safeSql(this.rolePrivilegesEqual))) 
						+ ") "));
		}
		if ((this.roleState == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ROLE].[ROLE_STATE] = " + this.roleState) 
						+ ") "));
		}
		if ((this.roleStateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ROLE].[ROLE_STATE] >= " 
						+ (this.roleStateBegin + ")")));
		}
		if ((this.roleStateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ROLE].[ROLE_STATE] < " 
						+ (this.roleStateEnd + ") ")));
		}
		if ((this.roleStateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ROLE].[ROLE_STATE] <= " 
						+ (this.roleStateEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
