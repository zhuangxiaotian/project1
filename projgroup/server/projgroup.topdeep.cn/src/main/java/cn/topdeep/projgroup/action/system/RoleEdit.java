package cn.topdeep.projgroup.action.system;

import java.sql.SQLException;
import java.util.ArrayList;

import com.opensymphony.xwork2.validator.annotations.*;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.biz.BizFactory;
import cn.topdeep.projgroup.biz.SystemBiz;
import cn.topdeep.projgroup.entity.*;
//change system.role into role
import cn.topdeep.projgroup.entity.db.Role;
import cn.topdeep.projgroup.entity.data.LoginUser;
import common.cache2.CacheException;
import common.privilege.*;
import common.privilege.Privilege;
import common.util.StringUtils;

public class RoleEdit extends BaseAction  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1837694071488043700L;

	public String execute(){
		if(!hasPrivilege(Privilege.FUNC_ROLE_MANAGE, PrivilegeOperate.Read)){
			return NO_PRIVILEGES;
		}
//		if(roleId > 0){
//			role = BizFactory.getSystemBiz().getRole(roleId);
//		}
		return INPUT;
	}
	
	public void validateSave() throws SQLException, CacheException{
			
			if(!StringUtils.isNullOrEmpty(role.getRoleName())) {
				Role role = getSystemBiz().getRole(getRole().getRoleName());
				if(((role != null) && (roleId == 0)) || ((role != null) && (roleId > 0) && (roleId != role.getRoleId()))){
					addFieldError("role.roleName", "角色名称重复,请换一个角色名称");
				}
			}else{
				addFieldError("role.roleName", "请输入角色名称");
			}
			
		}
	
	
	public String save() throws SQLException{
		if(!hasPrivilege(Privilege.FUNC_ROLE_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		role.setRolePrivileges(getOperateSelectValue());
		getSystemBiz().saveRole(role);
		redirectUrl = urlManage.getBaseUrl()+"system/RoleList.action";
		return REDIRECT;
	}
	
	
	/**
	 * 要编辑的RoleId
	 */
	private int roleId;
	/**
	 * 当前操作的Role
	 */
	private Role role;
	private String operateSelectValue;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) throws SQLException {
		this.roleId = roleId;
	}

	public Role getRole() throws SQLException, CacheException {
		if(role == null && roleId > 0){
				role = getSystemBiz().getRole(roleId);
		}
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	private ArrayList privilegeList;
	
	public ArrayList getPrivilegeList() {
		LoginUser user = null;
		user = new LoginUser();
		if((role != null) && (role.getRolePrivileges() != null) && (role.getRolePrivileges().trim().length() > 0)){
			user.privilegeAdd(role.getRolePrivileges());
		}
		
	    privilegeList = new ArrayList();
		ArrayList plist;
		try {
			plist = Privilege.getPrivilegeList();
			for(int i=0;i<plist.size();i++){
				Privilege p = (Privilege)plist.get(i);
				PrivilegeInfo info = new PrivilegeInfo();
				info.setPrivilegeName(p.getName());
				ArrayList opList = PrivilegeOperate.getOperateList();
				ArrayList opInfoList = new ArrayList();
				for(int j=0; j < opList.size();j++){
					PrivilegeOperate op = (PrivilegeOperate)opList.get(j);
					PrivilegeOperateInfo opInfo = new PrivilegeOperateInfo();
					opInfo.setOperateEnabled((p.getOperate() &  op.getOperateValue()) != 0);
					opInfo.setOperateName("  ");
					opInfo.setOperateValue((p.getFuncModule() << 8)+ op.getOperateValue());
					if(user == null){
						opInfo.setHasPrivilege(false);
					}else{
						opInfo.setHasPrivilege(user.hasPrivilege(p.getFuncModule(), op.getOperateValue()));
					}
					opInfoList.add(opInfo);
				}
				info.setOperateList(opInfoList);
				
				privilegeList.add(info);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return privilegeList;
	}

	public String getOperateSelectValue() {
		if((operateSelectValue != null) && (operateSelectValue.trim().length() > 0) && (!"false".equals(operateSelectValue))){
			LoginUser user = new LoginUser();
			String[] selectValues = operateSelectValue.split(",");
			for(String s : selectValues){
				if((s != null) && (s.trim().length() > 0)){
					user.privilegeAdd(s);
				}
			}
			return user.getPrivilegeString();
		}else{
			return "";
		}
	}

	public void setOperateSelectValue(String operateSelectValue) {
		this.operateSelectValue = operateSelectValue;
	}

}
