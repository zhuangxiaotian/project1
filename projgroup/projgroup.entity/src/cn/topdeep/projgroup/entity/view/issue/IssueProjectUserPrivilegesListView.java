package cn.topdeep.projgroup.entity.view.issue;
import cn.topdeep.projgroup.entity.*;
public class IssueProjectUserPrivilegesListView extends IssueProjectUserPrivileges{
	private String issueUserName;
	private String issueProjectName;
	private String RoleName;
	public String getIssueUserName() {
		return issueUserName;
	}
	public String getIssueProjectName() {
		return issueProjectName;
	}
	public String getRoleName() {
		return RoleName;
	}
	public void setIssueUserName(String issueUserName) {
		this.issueUserName = issueUserName;
	}
	public void setIssueProjectName(String issueProjectName) {
		this.issueProjectName = issueProjectName;
	}
	public void setRoleName(String roleName) {
		RoleName = roleName;
	}
}
