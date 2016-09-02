/**
 * $Id$
 */
package cn.topdeep.projgroup.entity.view.issue;

import cn.topdeep.projgroup.entity.IssueRoles;

/**
 * @author niexin
 *
 */
public class IssueRolesView extends IssueRoles {
	private boolean selected;

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
