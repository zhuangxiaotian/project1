package cn.topdeep.issue.action;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import common.cache2.CacheException;
import common.util.StringUtils;

import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.bugtracker.DbException;
import cn.topdeep.projgroup.entity.view.issue.IssueProjectUserPrivilegesListView;
/**
 * @author gmtstu
 *
 */
public class Login extends BaseAction {
	
	private String loginName;
	private String loginPassWord;
	private int issueProjectId;
	public List<IssueProjectUserPrivilegesListView> projuserlistview;
	
//	private static final String Current_LoginUser_isLogin_key = "cn.topdeep.issue.action.Login.islogin";
	

	public List<IssueProjectUserPrivilegesListView> getProjuserlistview() throws DbException, IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException, CacheException {
		if(issueLoginUser != null) {
			projuserlistview = issueBiz.queryIssueProjectUserPrivilegesListViewListByUserId(issueLoginUser.getLoginUserId());
			IssueProject willproj = null;
			for(Iterator<IssueProjectUserPrivilegesListView> it = projuserlistview.iterator(); it.hasNext();) {
				IssueProjectUserPrivilegesListView view = it.next();
				if(view != null) {
					willproj = issueBiz.issueProjectSelectByIssueProjectId(view.getIssueProjectId());
					if(willproj.getProjectActive() == false){
						it.remove();
					}
				}
				
			}
		}
		return projuserlistview;
	}
	public void setProjuserlistview(List<IssueProjectUserPrivilegesListView> projuserlistview) {
		this.projuserlistview = projuserlistview;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPassWord() {
		return loginPassWord;
	}
	public void setLoginPassWord(String loginPassWord) {
		this.loginPassWord = loginPassWord;
	}
	
	public int getIssueProjectId() {
		return issueProjectId;
	}
	public void setIssueProjectId(int issueProjectId) {
		this.issueProjectId = issueProjectId;
	}

	public List<IssueProject> projList;
	
	public List<IssueProject> getProjList() throws DbException, SQLException, CacheException {
		if(projList == null) {
			projList = issueBiz.queryLoginIssueProjectList(0, Integer.MAX_VALUE, "ISSUE_PROJECT_ID", "desc");
		}
		return projList;
	}
	
	@Override
	public String execute() throws Exception {
		
		return INPUT;
		
	}
	
	

	@Override
	public boolean hasPrivilege(int func, int operate) {
		return true;
	}
	public String login() throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, CacheException {
		
		//IssueUsers user = issueBiz.queryIssueProjectUsers(issueProjectId, loginName);  取消了项目选择
		IssueUsers user = issueBiz.queryIssueUsers(loginName); //新增加的部分.
		if(user == null) {
			addFieldError("loginName", "用户名错误.请重新输入");
		}else {
			if(user.getLoginName().equals(loginName) && user.getLoginPassword().equals(issueBiz.getMd5Password(loginPassWord)))  {
				List<IssueProjectUserPrivileges> projuserlist = issueBiz.queryIssueUsersProjectList(user.getIssueUserId());
				for(Iterator<IssueProjectUserPrivileges> it = projuserlist.iterator();it.hasNext();) {
					IssueProjectUserPrivileges ivi = it.next();
					IssueProject proj = issueBiz.issueProjectSelectByIssueProjectId(ivi.getIssueProjectId()); 
					if(proj.getProjectActive() == false) {
						it.remove();
					}
				}
				if(projuserlist != null) {
					if(projuserlist.size() > 1) {
							issueLoginUser.setLogin(true);
							issueLoginUser.setLoginUser(user);
							return "SELECT";
					}else if(projuserlist.size() == 1){
						IssueProjectUserPrivileges issueProjUserPri = projuserlist.get(0);
						IssueProject proj = issueBiz.issueProjectSelectByIssueProjectId(issueProjUserPri.getIssueProjectId());
						issueLoginUser.clearProjectRolePrivilege();
						//IssueProjectUserPrivileges issueProjUserPri = issueBiz.queryIssueProjectUserPrivileges(proj.getIssueProjectId(), user.getIssueUserId());
						IssueRoles userRole = issueBiz.queryIssueLoginRoles(issueProjUserPri.getRoleId());
						issueLoginUser.addProjectRolePrivilege(proj.getIssueProjectId(), userRole.getRoleId(), userRole.getRolePrivileges());
						issueLoginUser.setLogin(true);
						setAttribute(IssueList.CURRENT_QUERY_SESSION_KEY, null);
						issueLoginUser.setLoginUser(user);
						issueLoginUser.setLoginTime(new java.util.Date());
						issueLoginUser.setLoginProject(issueBiz.issueProjectSelectByIssueProjectId(proj.getIssueProjectId()));
						return SUCCESS;
					}else{
						addFieldError(loginName, "没有权限");
					}
				}else {
					addFieldError(loginName, "没有权限");
				}
				
			}else {
				addFieldError("loginPassWord", "密码错误");
			}					
		} 
		return INPUT;
	}
	
	public String logout(){
		issueLoginUser.clearLoginInfo();
		return INPUT;
	}
	
	
	public String selectloginproject() throws DbException, SQLException, CacheException {
		IssueProjectUserPrivileges issueProjUserPri = issueBiz.queryIssueProjectUserPrivileges(issueProjectId, issueLoginUser.getLoginUserId());
		if(issueProjUserPri ==null) {
			return INPUT;
		}
		IssueRoles userRole = issueBiz.queryIssueLoginRoles(issueProjUserPri.getRoleId());
		issueLoginUser.addProjectRolePrivilege(issueProjectId, userRole.getRoleId(), userRole.getRolePrivileges());
		setAttribute(IssueList.CURRENT_QUERY_SESSION_KEY, null);
		IssueProject pj = issueBiz.issueProjectSelectByIssueProjectId(issueProjectId);
		setAttribute(CURRENT_LOGIN_MODOULE, pj.getIssueProjectName());
		issueLoginUser.setLoginTime(new java.util.Date());
		issueLoginUser.setLoginProject(issueBiz.issueProjectSelectByIssueProjectId(issueProjectId));
		return SUCCESS;
	}


}
