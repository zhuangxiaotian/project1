/**
 * $Id$
 */
package cn.topdeep.projgroup.entity.jbpm;

import org.jbpm.api.identity.User;

/**
 * @author niexin
 *
 */
public class UserImpl extends cn.topdeep.projgroup.entity.User implements User {

	/* (non-Javadoc)
	 * @see org.jbpm.api.identity.User#getBusinessEmail()
	 */
	public String getBusinessEmail() {
		return getUserEmail();
	}

	/* (non-Javadoc)
	 * @see org.jbpm.api.identity.User#getFamilyName()
	 */
	public String getFamilyName() {
		return "";
	}

	/* (non-Javadoc)
	 * @see org.jbpm.api.identity.User#getGivenName()
	 */
	public String getGivenName() {
		return getRealName();
	}

	/* (non-Javadoc)
	 * @see org.jbpm.api.identity.User#getId()
	 */
	public String getId() {
		return getLoginName();
	}

}
