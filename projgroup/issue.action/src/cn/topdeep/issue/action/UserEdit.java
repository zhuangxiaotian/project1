package cn.topdeep.issue.action;

import java.sql.SQLException;
import java.util.List;

import common.cache2.CacheException;
import common.util.*;
import cn.topdeep.projgroup.entity.*;

public class UserEdit extends BaseAction {

	private IssueUsers user;

	private String loginPassword;
	private String loginName;
	
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	
	//以下测试从USER表中拿
		//以下是拿到所有USERs;
		private List<User> userList;

	public List<User> getUserList() throws DbException, SQLException, CacheException {
		if(userList == null){
			userList = issueBiz.queryUserList(0, Integer.MAX_VALUE, "USER_ID", "asc");
		}
		return userList;
	}

	
	//以下在判断是添加还是修改中用到
	private int issueUserId;
	
	public void setIssueUserId(int issueUserId) {
		this.issueUserId = issueUserId;
	}

	public int getIssueUserId() {
		return issueUserId;
	}

	public void setUser(IssueUsers user) {
		this.user = user;
	}
	
	public IssueUsers getUser() throws DbException, SQLException, CacheException {
		if(user == null && issueUserId > 0){
			user = issueBiz.queryIssueUsers(issueUserId);
		}
		return user;
	}				

	@Override
	public String execute() throws Exception {
		return INPUT;
	}
	
	public void validateSave() throws DbException, SQLException, CacheException{
		IssueUsers users = issueBiz.queryIssueUsers(user.getLoginName());
		if(users != null && issueUserId == 0) {
			if(users.getIssueUserId() != getUser().getIssueUserId());
			addFieldError("user.loginName", "登录名称已被占用,请重想一个!");
		}
	}
	
	//****注意 ***如果在加判断不能输入空信息时,页面上的值必须是个临时变量
	public String save() throws DbException, SQLException, CacheException{
		if(issueUserId > 0) {
			if(!StringUtils.isNullOrEmpty(loginPassword)){
				user.setLoginPassword(issueBiz.getMd5Password(loginPassword));
			}
			issueBiz.issueUserUpdate(user);
		}else{
			if(StringUtils.isNullOrEmpty(loginPassword)){
				addFieldError("loginPassword", "have to input password");
				return SUCCESS;
			}
			user.setLoginPassword(loginPassword);
			issueBiz.issueUserAdd(user);
		}
		return SUCCESS;
	}
}
