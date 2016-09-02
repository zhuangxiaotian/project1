/**
 * $Id$
 */
package cn.topdeep.projgroup.biz.jbpm;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jbpm.api.JbpmException;
import org.jbpm.api.identity.Group;
import org.jbpm.api.identity.User;
import org.jbpm.pvm.internal.identity.spi.IdentitySession;

import cn.topdeep.projgroup.biz.BaseBiz;
import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.jbpm.UserImpl;
/**
 * @author niexin
 *
 */
public class IdentityBiz extends BaseBiz implements IdentitySession {

	/* (non-Javadoc)
	 * @see org.jbpm.pvm.internal.identity.spi.IdentitySession#createGroup(java.lang.String, java.lang.String, java.lang.String)
	 */
	public String createGroup(String groupName, String groupType,
			String parentGroupId) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see org.jbpm.pvm.internal.identity.spi.IdentitySession#createMembership(java.lang.String, java.lang.String, java.lang.String)
	 */
	public void createMembership(String userId, String groupId, String role) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see org.jbpm.pvm.internal.identity.spi.IdentitySession#createUser(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	public String createUser(String userId, String givenName,
			String familyName, String businessEmail) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see org.jbpm.pvm.internal.identity.spi.IdentitySession#deleteGroup(java.lang.String)
	 */
	public void deleteGroup(String groupId) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see org.jbpm.pvm.internal.identity.spi.IdentitySession#deleteMembership(java.lang.String, java.lang.String, java.lang.String)
	 */
	public void deleteMembership(String userId, String groupId, String role) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see org.jbpm.pvm.internal.identity.spi.IdentitySession#deleteUser(java.lang.String)
	 */
	public void deleteUser(String userId) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see org.jbpm.pvm.internal.identity.spi.IdentitySession#findGroupById(java.lang.String)
	 */
	public Group findGroupById(String groupId) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see org.jbpm.pvm.internal.identity.spi.IdentitySession#findGroupsByUser(java.lang.String)
	 */
	public List<Group> findGroupsByUser(String userId) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see org.jbpm.pvm.internal.identity.spi.IdentitySession#findGroupsByUserAndGroupType(java.lang.String, java.lang.String)
	 */
	public List<Group> findGroupsByUserAndGroupType(String userId,
			String groupType) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see org.jbpm.pvm.internal.identity.spi.IdentitySession#findUserById(java.lang.String)
	 */
	public User findUserById(String userId) {
		cn.topdeep.projgroup.entity.User innerUser;
		try {
			innerUser =  userSelectByLoginName(userId);
			UserImpl user = new UserImpl();
			innerUser.assignTo(user);
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			throw new JbpmException(e.getMessage());
		}
	}

	/* (non-Javadoc)
	 * @see org.jbpm.pvm.internal.identity.spi.IdentitySession#findUsers()
	 */
	public List<User> findUsers() {
		try {
			List<cn.topdeep.projgroup.entity.User> list = userSelectObjects();
			return getUserListByInnerUserList(list);
		} catch (Exception e) {
			e.printStackTrace();
			throw new JbpmException(e.getMessage());
		}
	}

	/* (non-Javadoc)
	 * @see org.jbpm.pvm.internal.identity.spi.IdentitySession#findUsersByGroup(java.lang.String)
	 */
	public List<User> findUsersByGroup(String groupId) {
		throw new UnsupportedOperationException();
	}

	/* (non-Javadoc)
	 * @see org.jbpm.pvm.internal.identity.spi.IdentitySession#findUsersById(java.lang.String[])
	 */
	public List<User> findUsersById(String... userIds) {
		throw new UnsupportedOperationException();
	}

	private List<User> getUserListByInnerUserList(List<cn.topdeep.projgroup.entity.User> list){
		List<User> userList = new ArrayList<User>();
		for(cn.topdeep.projgroup.entity.User item : list){
			UserImpl user = new UserImpl();
			item.assignTo(user);
			userList.add(user);
		}
		return userList;
	}
	
}
