package cn.topdeep.projgroup.entity.view.issue;

import cn.topdeep.projgroup.entity.IssueRoleDefaultQuery;

public class IssueRoleDefaultQueryListView extends IssueRoleDefaultQuery{

	private String roleName;
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	private String defaultQueryName;
	
	public String getDefaultQueryName() {
		return defaultQueryName;
	}
	public void setDefaultQueryName(String defaultQueryName) {
		this.defaultQueryName = defaultQueryName;
	}
	
}
