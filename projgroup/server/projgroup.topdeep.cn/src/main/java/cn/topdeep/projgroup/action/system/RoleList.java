package cn.topdeep.projgroup.action.system;

import java.sql.SQLException;
import java.util.List;

import cn.topdeep.projgroup.action.BaseAction;

import common.privilege.Privilege;
import common.privilege.PrivilegeOperate;
import common.util.StringUtils;

public class RoleList extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6131539052026653228L;

	public int getFunc(){
		return Privilege.FUNC_ROLE_MANAGE;
	}
	
	public String execute() throws SQLException{
		if(!hasPrivilege(Privilege.FUNC_ROLE_MANAGE, PrivilegeOperate.Read)){
			return NO_PRIVILEGES;
		}
		bindData();
		return SUCCESS;
	}
	
	public String disable() throws SQLException{
		if(!hasPrivilege(Privilege.FUNC_ROLE_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		int[] ids = getSelectRoleIds();
		if(ids != null){
			getSystemBiz().disableRoles(ids);
		}else{
			addFieldError("selectedRoles", "没有选中");
		}
		return execute();
	}
	
	public String enable() throws SQLException{
		if(!hasPrivilege(Privilege.FUNC_ROLE_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		int[] ids = getSelectRoleIds();
		if(ids != null){
			getSystemBiz().enableRoles(ids);
		}else{
			addFieldError("selectedRoles", "没有选中");
		}
		return execute();
	}
	
	
	public String delete() throws SQLException{
		if(!hasPrivilege(Privilege.FUNC_ROLE_MANAGE, PrivilegeOperate.Delete)){
			return NO_PRIVILEGES;
		}
		int[] ids = getSelectRoleIds();
		if(ids != null){
			getSystemBiz().deleteRoles(ids);
		}else{
			addFieldError("selectedRoles", "没有选中");
		}
		return execute();
	}
	
	private int[] getSelectRoleIds(){
		if(!selectedRoles.equals("false")) {
			return common.db.SqlUtils.stringToIntArray(selectedRoles);
		}
		return null;
	}
	
	private List roleList;
	
	private String selectedRoles;
	
	private void bindData() throws SQLException {
		roleList = getSystemBiz().getRoleList();
	}

	public List getRoleList() {
		return roleList;
	}

	public String getSelectedRoles() {
		return selectedRoles;
	}

	public void setSelectedRoles(String selectedRoles) {
		this.selectedRoles = selectedRoles;
	}
	
}
