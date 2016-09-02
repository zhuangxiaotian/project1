package cn.topdeep.projgroup.action.system;

import java.sql.SQLException;
import java.util.List;

import common.cache2.CacheException;
import common.privilege.Privilege;
import common.privilege.PrivilegeOperate;
import cn.topdeep.projgroup.action.PageAction;
import cn.topdeep.projgroup.entity.base.PageImpl;
import cn.topdeep.projgroup.entity.db.*;

public class UserList extends PageAction {
	
	public String execute() throws SQLException{
		if(!hasPrivilege(Privilege.FUNC_USER_MANAGE, PrivilegeOperate.Read)){
			return NO_PRIVILEGES;
		}
		return SUCCESS;
	}
	

	public String disable() throws SQLException{
		if(!hasPrivilege(Privilege.FUNC_USER_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		int[] ids = getSelectUserIds();
		if(ids != null){
			getSystemBiz().disableUsers(ids);
		}else {
			addFieldError("error", "请选择要禁用的用户");
		}
		return execute();
	}
	
	public String enable() throws SQLException{
		if(!hasPrivilege(Privilege.FUNC_USER_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		int[] ids = getSelectUserIds();
		if(ids != null){
			getSystemBiz().enableUsers(ids);
		}else {
			addFieldError("error", "请选择要启用的用户");
		}
		return execute();
	}

	private int[] getSelectUserIds(){
		if(!selectedUsers.equals("false")) {
			return common.db.SqlUtils.stringToIntArray(selectedUsers);
		}
		return null;
	}
	
	


	private String selectedUsers;
	
	
	private List userList;
	public List getUserList() throws SQLException, CacheException {
		if(userList == null) {
			UserExample condition = new UserExample();
			condition.or().andUserStateEqualTo(1);
			condition.setPage(new PageImpl(getPageIndex(), getRowsOfPage()));
			condition.setOrderByClause("USER_ID asc");
			userList = getSystemBiz().userSelectObjects(condition);
		}
		return userList;
	}

	public void setUserList(List userList) {
		this.userList = userList;
	}

	public String getSelectedUsers() {
		return selectedUsers;
	}

	public void setSelectedUsers(String selectedUsers) {
		this.selectedUsers = selectedUsers;
	}
	
	
	private int rowsCount = -1;
	
	@Override
	public int getRowsCount() {
		if(rowsCount < 0) {
			try {
				UserExample condition = new UserExample();
				condition.or().andUserStateEqualTo(1);
				rowsCount = getSystemBiz().userQuerySelectObjectsCount(condition);
			} catch (CacheException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rowsCount;
	}
}
	
	
	

