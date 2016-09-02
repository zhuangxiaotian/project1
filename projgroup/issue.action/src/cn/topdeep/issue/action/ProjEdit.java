package cn.topdeep.issue.action;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import cn.topdeep.projgroup.biz.IssueBiz;
import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.view.issue.IssueUsersListView;

import java.util.*;

import common.cache2.CacheException;

public class ProjEdit extends BaseAction {

	private IssueProject project;

	//以下是拿到所有USERs;用于在页面显示默认用户的集合
	private List<IssueUsers> userList;
	
	public List<IssueUsers> getUserList() throws DbException, SQLException, CacheException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		if(userList == null){
			userList = issueBiz.queryIssueUserList(0, Integer.MAX_VALUE, "ISSUE_USER_ID", "asc");
		}
		return userList;
	}
	
	//修改数据部分 :::先定义一个标示/用来传递
	private int issueProjectId;
	
	public int getIssueProjectId() {
		return issueProjectId;
	}

	public void setIssueProjectId(int issueProjectId) {
		this.issueProjectId = issueProjectId;
	}
	
	public IssueProject getProject() throws DbException, SQLException, CacheException {
		if(project == null && issueProjectId >0) {
			project = issueBiz.issueProjectSelectByIssueProjectId(issueProjectId);
		}
		return project;
	}

	public void setProject(IssueProject project) {
		this.project = project;
	}
	
	public String execute() throws Exception {
		
		return INPUT;
		
		
	}
	//重写sava 方法. 以下用于验证输入的项目名称是否重复
	public void validateSave() throws DbException, SQLException, CacheException{
		//首先查找 所有的  proj 根据 project.getIssueProjectName()查找
		IssueProject proj = issueBiz.queryIssueProject(project.getIssueProjectName());
		//查找出来以后,判断数据库查找出来的项目名,与你编辑的项目用户名是否一致.如果
		if(proj != null ) {
			if(proj.getIssueProjectId() != getProject().getIssueProjectId()){
				addFieldError("project.issueProjectName", "项目名称重复,请重新输入");
			}
		}
	}
	
	public String save() throws DbException, SQLException, CacheException{
		if(issueProjectId > 0) {
			issueBiz.issueProjectUpdate(project);
		}else {
			issueBiz.issueProjectAdd(project);
		}
		return SUCCESS;
	}
}
