package cn.topdeep.projgroup.action.system;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.topdeep.projgroup.action.BaseAction;
import common.cache2.CacheException;
import common.privilege.*;
import common.privilege.Privilege;
import common.util.StringUtils;
import cn.topdeep.projgroup.entity.db.*;
import cn.topdeep.projgroup.entity.data.LoginUser;

public class UserEdit extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4396163653228217520L;

	public String execute() throws SQLException{
		if(!hasPrivilege(Privilege.FUNC_USER_MANAGE, PrivilegeOperate.Read)){
			return NO_PRIVILEGES;
		}
		if(userId > 0){
			user = getSystemBiz().getUser(userId);
		}
		return INPUT;
	}
	
	public String save() throws SQLException, CacheException{
		if(!hasPrivilege(Privilege.FUNC_USER_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		user.setUserRoles(roleSelectValue);
		user.setUserPrivileges(getOperateSelectValue());
		if((userPassword != null) && (userPassword.trim().length() > 0)){
			user.setLoginPass(getSystemBiz().getUserPassword(userPassword));
		}
		if(userId > 0){
			getSystemBiz().saveUser(user);
		}else{
			user.setLoginCount(0);
			getSystemBiz().saveUser(user);
		}
		redirectUrl = urlManage.getBaseUrl()+"system/UserList.action";
		return REDIRECT;
	}
	
	public void validateSave() throws SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, CacheException{
		if(StringUtils.isNullOrEmpty(user.getLoginName())) {
			addFieldError("user.loginName", "请输入用户名称");
		}
		User user = getSystemBiz().getUser(getUser().getLoginName());
		if(((user != null) && (userId == 0)) || ((user != null) && (userId > 0) && (userId != user.getUserId()))){
			addFieldError("user.loginName", "登录名称重复,请换一个登录名称");
		}
		if((userId == 0) && ((userPassword == null) || (userPassword.trim().length() == 0))){
			addFieldError("userPassword", "请为新用户设置密码");
		}
	}

	
	private int userId;
	
	private User user;

	private String userPassword;
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) throws SQLException {
		this.userId = userId;
		if(userId > 0){
			this.user = getSystemBiz().getUser(userId);
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	private String operateSelectValue;
	
	private ArrayList privilegeList;
	
	public ArrayList getPrivilegeList() {
		LoginUser user = null;
		user = new LoginUser();
		if((this.user != null) && (this.user.getUserPrivileges() != null) && (this.user.getUserPrivileges().trim().length() > 0)){
			user.privilegeAdd(this.user.getUserPrivileges());
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

	
	public List getRoleList() throws SQLException {
		List rlist = getSystemBiz().getRoleList();
		List infoList = new ArrayList();
		for(int i=0;i<rlist.size();i++){
			Role role = (Role)rlist.get(i);
			RoleInfo info = new RoleInfo();
			if(getUser() == null){
				info.setRoleSelected(false);	
			}else{
				info.setRoleSelected(isIncludeRole(getUser().getUserRoles(), role.getRoleId()));
			}
			info.setRoles(role);
			infoList.add(info);
		}
		return infoList;
	}
	
	private boolean isIncludeRole(String roleIds, int roleId){
		if(roleIds == null)return false;
		if(roleIds.trim().length() == 0)return false;
		String[] ids = roleIds.split(",");
		String id = ""+roleId;
		for(int i=0;i<ids.length;i++){
			if(id.equals(ids[i].trim())){
				return true;
			}
		}
		return false;
	}
	
	
	private String roleSelectValue;

	public void setRoleSelectValue(String roleSelectValue) {
		this.roleSelectValue = roleSelectValue;
		if("false".equals(roleSelectValue)){
			this.roleSelectValue = "";
		}
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}
