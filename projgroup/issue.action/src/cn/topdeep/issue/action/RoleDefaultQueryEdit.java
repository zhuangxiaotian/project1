package cn.topdeep.issue.action;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.*;
import java.util.Map.Entry;

import com.opensymphony.xwork2.ActionContext;

import common.cache2.CacheException;
import common.util.StringUtils;
import cn.topdeep.projgroup.entity.data.*;
import cn.topdeep.projgroup.biz.IssueBiz;
import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.data.IssueLoginUser;
import cn.topdeep.projgroup.entity.data.issue.*;
import cn.topdeep.projgroup.entity.view.issue.IssueListView;
import cn.topdeep.projgroup.entity.view.issue.IssueQueryListView;
import cn.topdeep.projgroup.entity.view.issue.IssueStatusNextListView;

public class RoleDefaultQueryEdit extends BaseAction{
	
	private IssueRoleDefaultQuery defaultQuery;
	private int roleId;
	private int issueProjectId;
	
	private String roleName;

	public String getRoleName() throws DbException, SQLException, CacheException {
		if(roleName == null) {
			if(roleId > 0) {
				roleName = issueBiz.queryIssueLoginRoles(roleId).getRoleName();
			}
		}
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public int getIssueProjectId() {
		return issueProjectId;
	}

	public void setIssueProjectId(int issueProjectId) {
		this.issueProjectId = issueProjectId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public IssueRoleDefaultQuery getDefaultQuery() throws DbException, SQLException, CacheException {
		if(defaultQuery == null) {
			defaultQuery = issueBiz.queryIssueRoleDefaultQuery(issueProjectId, roleId);
		}
		return defaultQuery;
	}

	public void setDefaultQuery(IssueRoleDefaultQuery defaultQuery) {
		this.defaultQuery = defaultQuery;
	}
	
	private List<IssueRoles> roleList;
	
	public List<IssueRoles> getRoleList() throws DbException, SQLException, CacheException {
		if(roleList == null) {
			roleList = issueBiz.queryIssueRoleList(0, Integer.MAX_VALUE, "ROLE_ID", "asc");
		}
		return roleList;
	}

	public void setRoleList(List<IssueRoles> roleList) {
		this.roleList = roleList;
	}

	private List<IssueQueryListView> queryList;


	public List<IssueQueryListView> getQueryList() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		if(queryList == null) {
			queryList = issueBiz.queryIssueQueryListViewList(0, Integer.MAX_VALUE, "ISSUE_QUERY_ID", "asc");
		}
		return queryList;
	}

	public void setQueryList(List<IssueQueryListView> queryList) {
		this.queryList = queryList;
	}
	
	public String execute() throws Exception {
		return INPUT;
	}
	
	public String save() throws DbException, SQLException, CacheException {
		if(roleId > 0) {
			issueBiz.issueRoleDefaultQueryUpdate(defaultQuery);
		}else {
			IssueRoleDefaultQuery query = issueBiz.queryIssueRoleDefaultQuery(issueProjectId, getDefaultQuery().getRoleId());
			if(query == null) {
				getDefaultQuery().setIssueProjectId(issueProjectId);
				issueBiz.issueRoleDefaultQueryAdd(defaultQuery);
			}else {
				addFieldError("defaultQuery.issueQueryId", "已经存在该角色的默认查询方法,您可以到编辑页面进行修改");
				return INPUT;
			}
			
		}
		return SUCCESS;
	}
	
	
	
}
