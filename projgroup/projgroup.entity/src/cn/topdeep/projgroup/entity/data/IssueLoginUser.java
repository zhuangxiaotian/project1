/**
 * $Id$
 */
package cn.topdeep.projgroup.entity.data;

import cn.topdeep.projgroup.entity.IssueProject;
import cn.topdeep.projgroup.entity.IssueUsers;
import java.util.*;
import common.util.*;
/**
 * 代表登录的问题系统用户
 * 同一个用户在不同的项目中的权限是可能不一样的。
 * @author niexin
 *
 */
public class IssueLoginUser {
	
	public static final String ISSUE_LOGIN_USER_KEY = "cn.topdeep.projgroup.entity.data.IssueLoginUser.SessionKey";
	
	private IssueUsers loginUser;
	
	private Hashtable<Integer, Integer> projectRoleList = new Hashtable<Integer, Integer>();
	
	private Hashtable<Integer, Hashtable<Integer,Integer>> projectPrivilegeList = new Hashtable<Integer, Hashtable<Integer,Integer>>();
	
	private IssueProject loginProject;
	
	private boolean isLogin;
	
	private Date loginTime;

	public void clearProjectRolePrivilege(){
		projectRoleList.clear();
		projectPrivilegeList.clear();
	}
	
	public void addProjectRolePrivilege(int issueProjectId, int issueRoleId, String issuePrivilegeList){
		//初始化项目与角色的对应关系 为什么要初始化
		if(projectRoleList.containsKey(issueProjectId)){
			//判断是否hastable中的值是否为
 			if(projectRoleList.get(issueProjectId) != issueRoleId){
				projectRoleList.remove(issueProjectId);
				projectRoleList.put(issueProjectId, issueRoleId);
			}
		}else{
			projectRoleList.put(issueProjectId, issueRoleId);
		}
		//初始化项目的权限
		//新添加的权限将迭加到当前权限中去
		if(!StringUtils.isNullOrEmpty(issuePrivilegeList)){
			String[] pps = issuePrivilegeList.split(",");
			//s应该是循环变量名称,,,,哪儿来的..pps是要遍历的对象这个很好理解
			for(String s : pps){
				if(StringUtils.isNullOrEmpty(s)){
					continue;
				}
				//左边24位是模块常量，右边8位是操作权限
				//首先检查当前项目是否存在
				Hashtable<Integer, Integer> projPriviege = null;
				if(projectPrivilegeList.containsKey(issueProjectId)){
					projPriviege = projectPrivilegeList.get(issueProjectId);
				}else{
					projPriviege = new Hashtable<Integer, Integer>();
					projectPrivilegeList.put(issueProjectId, projPriviege);
				}
				//分解出模块常量
				Integer pp = Integer.parseInt(s);
				int func = pp >> 8;
				int operate = 0xff & pp;
				if(projPriviege.containsKey(func)){
					operate = projPriviege.get(func) | operate;
					projPriviege.remove(func);
					projPriviege.put(func, operate);
				}else{
					projPriviege.put(func, operate);
				}
			}
		}
	}
	
	public boolean hasPrivilege(int issueProjectId, int funcModule, int funcOperate){
		//if(true)	return true;
		if(!projectPrivilegeList.containsKey(issueProjectId)){
			return false;
		}
		Hashtable<Integer, Integer> projPriviege = projectPrivilegeList.get(issueProjectId);
		if(!projPriviege.containsKey(funcModule)){
			return false;
		}
		return (projPriviege.get(funcModule) & funcOperate) != 0;
	}
	
	public Integer getRole(int issueProjectId){
		return projectRoleList.get(issueProjectId);
	}
	
	public boolean isLogin() {
		return isLogin;
	}

	public void setLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public IssueProject getLoginProject() {
		return loginProject;
	}

	public void setLoginProject(IssueProject loginProject) {
		this.loginProject = loginProject;
	}

	public IssueUsers getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(IssueUsers loginUser) {
		this.loginUser = loginUser;
	}
	
	public int getLoginUserId(){
		if(this.loginUser != null){
			return this.loginUser.getIssueUserId();
		}
		return 0;
	}

	public void clearLoginInfo(){
		this.loginUser = null;
		this.loginProject = null;
		this.loginTime = null;
		this.isLogin = false;
		this.clearProjectRolePrivilege();
	}
}
