package cn.topdeep.issue.action;

import java.sql.SQLException;

import common.cache2.CacheException;
import common.privilege.Privilege;
import common.privilege.PrivilegeOperate;

import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.data.*;
import java.util.*;
import java.util.Map.Entry;

public class RoleEdit extends BaseAction {

	private IssueRoles role;
	
	//角色编辑....先添加成员变量roleid,然后根据上个页面所提交过来的值判断是保存还是修改.如果大于0则为修改(update).否则为增加角色.
	private int roleId;
	
	private int[] operateSelectValue;
	
	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public IssueRoles getRole() throws DbException, SQLException, CacheException {
		if(role == null && roleId > 0){
			role = issueBiz.queryIssueRoles(roleId);
		}
		return role;
	}

	public void setRole(IssueRoles role) {
		this.role = role;
	}

	@Override
	public String execute() throws Exception {
		
		return INPUT;
		
	}
	
	private ArrayList privilegeList;
	
	public ArrayList getPrivilegeList() throws DbException, SQLException, CacheException {
		if(privilegeList == null){
			IssueLoginUser user = null;
			if(getRole() != null){
				user = new IssueLoginUser();
				user.addProjectRolePrivilege(1, getRole().getRoleId(), getRole().getRolePrivileges());
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
							opInfo.setHasPrivilege(user.hasPrivilege(1, p.getFuncModule(), op.getOperateValue()));
						}
						if(!opInfo.isOperateEnabled()){
							opInfo.setHasPrivilege(false);
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
		}
		return privilegeList;
	}

	public void validateSave() throws DbException, SQLException, CacheException{
		IssueRoles roles = issueBiz.queryIssueRoles(role.getRoleName());
		if(roles != null){
			if(roles.getRoleId() != getRole().getRoleId()) {
				addFieldError("role.roleName", "角色名称重复,请重新输入");
			}
		}
	}
	
	//根据roid的值来判断是更新还是添加
	public String save() throws DbException, SQLException, CacheException{
		//计算权限值，并设到角色里
		//System.out.println("operateSelectValue="+operateSelectValue);
		Hashtable<Integer, Integer> pList = new Hashtable<Integer, Integer>();
		if(operateSelectValue != null){
			for(int item : operateSelectValue){
				if(item <= 0)continue;
				int func = item >> 8;
				int opvalue = item & 0xFF;
				if(pList.containsKey(func)){
					opvalue = opvalue | pList.get(func);
					pList.remove(func);
				}
				pList.put(func, opvalue);
			}
		}
		
		String opList = "";
		for(Iterator<Entry<Integer, Integer>> it = pList.entrySet().iterator();it.hasNext();){
			Entry<Integer, Integer> entry = it.next();
			int func = entry.getKey();
			int opValue = entry.getValue();
			int k = (func << 8) | (opValue & 0xFF);
			if(!opList.equals("")){
				opList += ",";
			}
			opList += k;
		}
		getRole().setRolePrivileges(opList);
		if(roleId > 0){
			issueBiz.issueRoleUpdate(role);
		}else{
			issueBiz.issueRoleAdd(role);
		}
		return SUCCESS;
	}

	
	public void setOperateSelectValue(int[] operateSelectValue) {
		this.operateSelectValue = operateSelectValue;
	}
}
