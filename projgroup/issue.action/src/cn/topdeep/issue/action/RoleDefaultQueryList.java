package cn.topdeep.issue.action;

import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.view.issue.*;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.*;

public class RoleDefaultQueryList extends PageAction{
	
	private List<IssueRoleDefaultQueryListView> defaultQuerylist;
	private int issueProjectId;
	private int roleId;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getIssueProjectId() {
		return issueProjectId;
	}

	public void setIssueProjectId(int issueProjectId) {
		this.issueProjectId = issueProjectId;
	}

	public List<IssueRoleDefaultQueryListView> getDefaultQuerylist() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		if(defaultQuerylist == null) {
			defaultQuerylist = issueBiz.queryIssueRoleDefaultQueryListViewList(issueProjectId, getPageIndex(), getRowsOfPage(), "ROLE_ID", "asc");
		}
		return defaultQuerylist;
	}
	
	public String delete() throws Exception {
		if(issueProjectId > 0 && roleId > 0) {
			issueBiz.issueRoleDefaultQueryDelete(issueProjectId, roleId);
		}
		return execute();
	}
	

	public void setDefaultQuerylist(
			List<IssueRoleDefaultQueryListView> defaultQuerylist) {
		this.defaultQuerylist = defaultQuerylist;
	}

	@Override
	public int getRowsCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
