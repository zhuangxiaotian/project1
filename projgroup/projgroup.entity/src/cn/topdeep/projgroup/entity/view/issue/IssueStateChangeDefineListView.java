package cn.topdeep.projgroup.entity.view.issue;

/**
 * @author gmtstu
 *
 */
public class IssueStateChangeDefineListView extends cn.topdeep.projgroup.entity.IssueStateChangeDefine{
	
	private String currentStatusName;
	private String nextStatusName;
	private String roleListName;
	
	public String getCurrentStatusName() {
		return currentStatusName;
	}

	public String getNextStatusName() {
		return nextStatusName;
	}

	public void setCurrentStatusName(String currentStatusName) {
		this.currentStatusName = currentStatusName;
	}

	public void setNextStatusName(String nextStatusName) {
		this.nextStatusName = nextStatusName;
	}

	public String getRoleListName() {
		return roleListName;
	}

	public void setRoleListName(String roleListName) {
		this.roleListName = roleListName;
	}

}
