package cn.topdeep.projgroup.action.system;

import java.sql.SQLException;
import java.util.List;

import common.privilege.Privilege;
import common.privilege.PrivilegeOperate;

import cn.topdeep.projgroup.action.PageAction;
import cn.topdeep.projgroup.entity.*;

public class UserList extends PageAction {
	
	public String execute() throws DbException, SQLException{
		if(!hasPrivilege(Privilege.FUNC_USER_MANAGE, PrivilegeOperate.Read)){
			return NO_PRIVILEGES;
		}
		return SUCCESS;
	}
	

	public String disable() throws DbException, SQLException{
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
	
	public String enable() throws DbException, SQLException{
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
	public List getUserList() throws DbException, SQLException {
		if(userList == null) {
			userList = getSystemBiz().userSelectObjects(new UserQueryCondition().setUserStateCondition(1), getPageIndex(), getRowsOfPage(), "USER_ID", "asc");
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
				rowsCount = getSystemBiz().userQuerySelectObjectsCount(new UserQueryCondition().setUserStateCondition(1));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rowsCount;
	}
}
	
	
	

