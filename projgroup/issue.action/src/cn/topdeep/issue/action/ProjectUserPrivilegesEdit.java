package cn.topdeep.issue.action;

import java.sql.SQLException;
import java.util.List;

import common.cache2.CacheException;

import cn.topdeep.projgroup.entity.*;

public class ProjectUserPrivilegesEdit extends BaseAction {

	private IssueProjectUserPrivileges userPrivileges;
	
	//下面方法不用数组list显示userlist了   直接在表中查找user  编辑时改为不可改变的的  
	private IssueUsers issueUsers;
	
	public IssueUsers getIssueUsers() throws DbException, SQLException, CacheException {
		if(issueUsers == null){
			issueUsers = issueBiz.queryIssueUsers(issueUserId);
		}
		return issueUsers;
	}
	
	/**
	 * 0 add
	 * 1 edit
	 */
	private int editFlag = 0;
	
	public int getEditFlag() {
		return editFlag;
	}

	public void setEditFlag(int editFlag) {
		this.editFlag = editFlag;
	}
	//查找 IssueUsers 的name
	private List<IssueUsers> userList;

	public List<IssueUsers> getUserList() throws DbException, SQLException, CacheException {
		if (userList ==null){
			userList = issueBiz.queryIssueUserList(0, Integer.MAX_VALUE, "ISSUE_USER_ID", "asc");
		}
		return userList;
	}
	//查找IssueRoles的name
	private List<IssueRoles> roleList;
	
	public List<IssueRoles> getRoleList() throws DbException, SQLException, CacheException {
		if(roleList == null){
			roleList = issueBiz.queryIssueRoleList(0, Integer.MAX_VALUE, "ROLE_ID", "asc");
		}
		return roleList;
	}
	
	private List<IssueProject> projList;
		
		public List<IssueProject> getProjList() throws DbException, SQLException, CacheException {
			if(projList == null){
				projList = issueBiz.queryIssueProjectList(0, Integer.MAX_VALUE, "ISSUE_PROJECT_ID", "asc");
			}
			return projList;
		}
	//根据什么来编辑....先添加成员变量然后根据上个页面所提交过来的值判断是保存还是修改.如果大于0则为修改(update).否则为增加
	private int issueProjectId;
	private int issueUserId;
	private int roleId;
	
	public int getIssueProjectId() {
		return issueProjectId;
	}

	public int getIssueUserId() {
		return issueUserId;
	}

	public void setIssueProjectId(int issueProjectId) {
		this.issueProjectId = issueProjectId;
	}

	public void setIssueUserId(int issueUserId) {
		this.issueUserId = issueUserId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public IssueProjectUserPrivileges getUserPrivileges() throws DbException, SQLException, CacheException {
		if(userPrivileges == null && issueProjectId > 0 && issueUserId > 0){
			userPrivileges=issueBiz.queryIssueProjectUserPrivileges(issueProjectId,issueUserId);
		}
		return userPrivileges;
	}

	public void setUserPrivileges(IssueProjectUserPrivileges userPrivileges) {
		this.userPrivileges = userPrivileges;
	}

	public String execute() throws Exception {
		return INPUT;
	}
	
	public void validateSave() throws DbException, SQLException, CacheException{
		IssueProjectUserPrivileges pri = issueBiz.queryIssueProjectUserPrivileges(issueProjectId, getUserPrivileges().getIssueUserId());
		if(pri != null) {
			if(issueUserId > 0) {
				editFlag = 1;
			}else {
				editFlag = 0;
			}
			if((editFlag == 0) && !(pri.getIssueProjectId() ==  getUserPrivileges().getIssueProjectId() && pri.getIssueUserId() == getUserPrivileges().getIssueUserId())){
				addFieldError("userPrivileges.issueUserId", "已经存在存在该项目被分配的用户");	
			}
		} 
	} 
	
	//根据id的值来判断是更新还是添加
	public String save() throws DbException, SQLException, CacheException{
		//需要将issueProjectId的值传进来 ..
		getUserPrivileges().setIssueProjectId(getIssueProjectId());
		if(editFlag == 1){
			issueBiz.issueProjectUserPrivilegesUpdate(getUserPrivileges());
		}else{
			issueBiz.issueProjectUserPrivilegesAdd(getUserPrivileges());
		}
		return SUCCESS;
	}
}
