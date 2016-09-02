/**
 * $Id$
 */
package cn.topdeep.projgroup.entity.jbpm;

import org.jbpm.api.identity.Group;

import cn.topdeep.projgroup.entity.DepartMent;

/**
 * @author niexin
 *
 */
public class GroupImpl extends DepartMent implements Group {

	/* (non-Javadoc)
	 * @see org.jbpm.api.identity.Group#getId()
	 */
	public String getId() {
		return ""+getDepartMentId();
	}

	/* (non-Javadoc)
	 * @see org.jbpm.api.identity.Group#getName()
	 */
	public String getName() {
		return getDepartMentName();
	}

	/* (non-Javadoc)
	 * @see org.jbpm.api.identity.Group#getType()
	 */
	public String getType() {
		return "";
	}

}
