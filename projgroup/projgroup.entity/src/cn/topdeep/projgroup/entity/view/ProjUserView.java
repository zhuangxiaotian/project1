/**
 * $Id$
 */
package cn.topdeep.projgroup.entity.view;

import cn.topdeep.projgroup.entity.User;

/**
 * @author niexin
 *
 */
public class ProjUserView extends User {
	private boolean selected;

	/**
	 * @return the selected
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * @param selected the selected to set
	 */
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
