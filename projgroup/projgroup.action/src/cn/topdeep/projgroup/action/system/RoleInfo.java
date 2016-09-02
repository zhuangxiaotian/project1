package cn.topdeep.projgroup.action.system;

import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.Role;

public class RoleInfo {
	private boolean roleSelected;
	private Role role;
	public boolean isRoleSelected() {
		return roleSelected;
	}
	public void setRoleSelected(boolean roleSelected) {
		this.roleSelected = roleSelected;
	}
	public Role getRole() {
		return role;
	}
	public void setRoles(Role role) {
		this.role = role;
	}
}
