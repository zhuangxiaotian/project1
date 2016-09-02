package cn.topdeep.issue.action;

import java.sql.SQLException;

import cn.topdeep.projgroup.entity.IssueUsers;
import cn.topdeep.projgroup.entity.bugtracker.DbException;

import common.cache2.CacheException;
import common.util.StringUtils;

public class UserPasswordUpdata extends BaseAction{
	
	
	private IssueUsers user;
	private int issueUserId;

	public int getIssueUserId() {
		if(issueUserId == 0) {
			issueUserId = issueLoginUser.getLoginUserId();
		}
		return issueUserId;
	}

	public void setIssueUserId(int issueUserId) {
		this.issueUserId = issueUserId;
	}
	
	public IssueUsers getUser() throws DbException, SQLException, CacheException {
		if(user == null && issueUserId > 0){
			user = issueBiz.queryIssueUsers(issueUserId);
		}
		return user;
	}

	public void setUser(IssueUsers user) {
		this.user = user;
	}
	
	
	
	private String loginOldPassword;
	private String loginNewPassword1;
	private String loginNewPassword2;
	
	
	
	
	public String getLoginOldPassword() {
		return loginOldPassword;
	}

	public void setLoginOldPassword(String loginOldPassword) {
		this.loginOldPassword = loginOldPassword;
	}

	public String getLoginNewPassword1() {
		return loginNewPassword1;
	}

	public void setLoginNewPassword1(String loginNewPassword1) {
		this.loginNewPassword1 = loginNewPassword1;
	}

	public String getLoginNewPassword2() {
		return loginNewPassword2;
	}

	public void setLoginNewPassword2(String loginNewPassword2) {
		this.loginNewPassword2 = loginNewPassword2;
	}

	

	public String execute() throws Exception {
		return super.execute();
	}
	
	public void validateSave() throws DbException, SQLException, CacheException{
		if(!StringUtils.isNullOrEmpty(loginOldPassword)) {
			if(issueLoginUser.getLoginUser().getLoginPassword().equalsIgnoreCase(issueBiz.getMd5Password(loginOldPassword))) {
				if(!(StringUtils.isNullOrEmpty(loginNewPassword1) && StringUtils.isNullOrEmpty(loginNewPassword2)) ) {
					if(!getLoginNewPassword1().equalsIgnoreCase(getLoginNewPassword2())) {
						addFieldError("loginNewPassword1", "两次输入的新密码不一致!请重新输入");
					}
				}else{
					addFieldError("loginNewPassword1", "请输入新密码");
				}
			}else{
				addFieldError("loginOldPassword", "原始密码不正确,请输入正确的登录密码");
			}
		}
	}
	
	public String save() throws DbException, SQLException, CacheException {
		if(!StringUtils.isNullOrEmpty(loginNewPassword1)) {
			user.setLoginPassword(issueBiz.getMd5Password(loginNewPassword1));
		}
		issueBiz.issueUserUpdate(user);
		addFieldError("loginNewPassword1", "更新成功");
		return SUCCESS;
	}
	
	
//	public String save() throws DbException, SQLException, CacheException {
//		if(!StringUtils.isNullOrEmpty(loginOldPassword)) {
//			if(issueLoginUser.getLoginUser().getLoginPassword().equalsIgnoreCase(issueBiz.getMd5Password(loginOldPassword))) {
//				if(!(StringUtils.isNullOrEmpty(loginNewPassword1) && StringUtils.isNullOrEmpty(loginNewPassword2)) ) {
//					if(getLoginNewPassword1().equalsIgnoreCase(getLoginNewPassword2())) {
//						issueLoginUser.getLoginUser().setLoginPassword(issueBiz.getMd5Password(loginNewPassword1));
//						if(StringUtils.isNullOrEmpty(userEmail)) {
//							issueLoginUser.getLoginUser().setUserEmail(userEmail);
//						}
//						issueBiz.issueUserUpdate(issueLoginUser.getLoginUser());
//						addFieldError("loginNewPassword1", "更新成功");
//					}else{
//						addFieldError("loginNewPassword1", "两次输入的新密码不一致!请重新输入");
//					}
//				}else{
//					addFieldError("loginNewPassword1", "请输入新密码");
//				}
//			}else {
//				addFieldError("loginOldPassword", "原始密码不正确,请输入正确的登录密码");
//			} 
//		}else{
//			addFieldError("loginOldPassword", "请输入原始密码!");
//		}
//		return SUCCESS;
//	}
	

}
