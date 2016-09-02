/**
 * $Id$
 */
package cn.topdeep.projgroup.entity.data.issue;

import common.privilege.*;

/**
 * @author niexin
 *
 */
@PrivilegeFlag()
public class IssuePrivilege {
	@PrivilegeAttribute(GroupName="系统管理",Name="系统管理(菜单)",Operate=PrivilegeOperate.ReadWriteDelete)
	public static final int ISSUE_SYSTEM_MANAGE = 10;
	@PrivilegeAttribute(GroupName="系统管理",Name="用户管理",Operate=PrivilegeOperate.ReadWriteDelete)
	public static final int ISSUE_USER_MANAGE = 1;
	@PrivilegeAttribute(GroupName="系统管理",Name="角色管理",Operate=PrivilegeOperate.ReadWriteDelete)
	public static final int ISSUE_ROLE_MANAGE = 2;
	@PrivilegeAttribute(GroupName="系统管理",Name="项目管理",Operate=PrivilegeOperate.ReadWriteDelete)
	public static final int ISSUE_PROJECT_MANAGE = 3;
	@PrivilegeAttribute(GroupName="问题管理",Name="问题管理(菜单)",Operate=PrivilegeOperate.ReadWriteDelete)
	public static final int ISSUE_MANAGE = 4;
	@PrivilegeAttribute(GroupName="问题管理",Name="注释管理",Operate=PrivilegeOperate.ReadWriteDelete)
	public static final int ISSUE_COMMENT_MANAGE = 5;
	@PrivilegeAttribute(GroupName="系统管理",Name="状态管理",Operate=PrivilegeOperate.ReadWriteDelete)
	public static final int ISSUE_STATUS_MANAGE = 6;
	@PrivilegeAttribute(GroupName="系统管理",Name="优先级管理",Operate=PrivilegeOperate.ReadWriteDelete)
	public static final int ISSUE_PRIORITIES_MANAGE = 7;
	@PrivilegeAttribute(GroupName="系统管理",Name="状态改变定义",Operate=PrivilegeOperate.ReadWriteDelete)
	public static final int ISSUE_STATUSCHANGE_MANAGE = 8;
	@PrivilegeAttribute(GroupName="问题管理",Name="问题操作",Operate=PrivilegeOperate.ReadWriteDelete)
	public static final int ISSUE_QUERY_MANAGE = 9;
	@PrivilegeAttribute(GroupName="问题管理",Name="问题查询",Operate=PrivilegeOperate.ReadWriteDelete)
	public static final int ISSUE_SEARCH_MANAGE = 11;
	@PrivilegeAttribute(GroupName="问题管理",Name="查询语句管理",Operate=PrivilegeOperate.ReadWriteDelete)
	public static final int ISSUE_SQL_MANAGE = 12;
	@PrivilegeAttribute(GroupName="系统管理",Name="项目用户权限",Operate=PrivilegeOperate.ReadWriteDelete)
	public static final int ISSUE_PROJECT_USER_PRIVILEGE_MANAGE = 13;
	@PrivilegeAttribute(GroupName="系统管理",Name="项目模块管理",Operate=PrivilegeOperate.ReadWriteDelete)
	public static final int ISSUE_PROJECT_MOUDLE_MANAGE = 14;
	@PrivilegeAttribute(GroupName="系统管理",Name="角色默认查询",Operate=PrivilegeOperate.ReadWriteDelete)
	public static final int ISSUE_ROLE_DEFAULT_SEARCH_MANAGE = 15;
	@PrivilegeAttribute(GroupName="问题管理",Name="问题发表",Operate=PrivilegeOperate.ReadWriteDelete)
	public static final int ISSUE_ADD_MANAGE = 16;
	@PrivilegeAttribute(GroupName="问题管理",Name="问题状态批操作",Operate=PrivilegeOperate.ReadWriteDelete)
	public static final int ISSUE_ISSUESTATECHANGE_MANAGE = 17;
}
