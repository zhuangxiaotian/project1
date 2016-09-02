package cn.topdeep.issue.action;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.cache2.CacheException;
import common.util.*;
import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.view.issue.*;


public class StateChangeDefineEdit extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IssueStateChangeDefine define;

	//做选择复选框  不能用list 因为提交的是数组...
	private int[] selectedRoleIds;
	
	public int[] getSelectedRoleIds() throws DbException, SQLException, CacheException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		if(selectedRoleIds == null){
			List<IssueRolesView> roleList = getRoleList();
			selectedRoleIds = new int[roleList.size()];
			for(int i=0;i<selectedRoleIds.length;i++){
				selectedRoleIds[i] = 1;
			}
		}
		return selectedRoleIds;
	}

	public void setSelectedRoleIds(int[] selectedRoleIds) {
		this.selectedRoleIds = selectedRoleIds;
	}
	//查找 IssueStatus 的name
	private List<IssueStatus> statusList;

	public List<IssueStatus> getStatusList() throws DbException, SQLException, CacheException {
		if (statusList ==null){
			statusList = issueBiz.queryIssueStatusList(0, Integer.MAX_VALUE, "STATUS_ID", "asc");
		}
		return statusList;
	}
	//查找IssueRoles的name
	private List<IssueRolesView> roleList;
	
	public List<IssueRolesView> getRoleList() throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, CacheException {
		if(roleList == null){
//			if(!(currentStatusId > 0 && nextStatusId > 0)) {
//				roleList = issueBiz.queryIssueRoleListViewList(0, Integer.MAX_VALUE, "ROLE_ID", "asc");
//			}else {
				List<IssueRoles> list = issueBiz.queryIssueRoleList(0, Integer.MAX_VALUE, "ROLE_ID", "asc");
				roleList = new ArrayList<IssueRolesView>();
				IssueStateChangeDefine df = getDefine();
				int[] ids = null;
				if(df != null){
					String roles = df.getRoleList();
					if(!StringUtils.isNullOrEmpty(roles)){
						String[] roleIds = roles.split(",");
						ids = new int[roleIds.length];
						for(int i=0;i<roleIds.length;i++){
							ids[i] = Integer.parseInt(roleIds[i]);
						}
					}
				}
				for(IssueRoles item : list){
					IssueRolesView view = new IssueRolesView();
					view.setRoleId(item.getRoleId());
					view.setRoleName(item.getRoleName());
					if(ids == null){
						view.setSelected(false);	
					}else{
						boolean find = false;
						for(int i=0;i<ids.length;i++){
							if(view.getRoleId() == ids[i]){
								find = true;
								break;
							}
						}
						view.setSelected(find);
					}
					roleList.add(view);
				}
			}
			
//		}
		return roleList;
	}
	//根据什么来编辑....先添加成员变量然后根据上个页面所提交过来的值判断是保存还是修改.如果大于0则为修改(update).否则为增加
	private int currentStatusId;
	private int nextStatusId;
	
	public void setCurrentStatusId(int currentStatusId) {
		this.currentStatusId = currentStatusId;
	}

	public int getCurrentStatusId() {
		return currentStatusId;
	}
	
	public void setNextStatusId(int nextStatusId) {
		this.nextStatusId = nextStatusId;
	}

	public int getNextStatusId() {
		return nextStatusId;
	}

	public IssueStateChangeDefine getDefine() throws DbException, SQLException, CacheException {
		if(define == null && currentStatusId > 0 && nextStatusId > 0){
			define=issueBiz.queryIssueStateChangeDefine(currentStatusId,nextStatusId);
		}
		return define;
	}

	public void setDefine(IssueStateChangeDefine define) {
		this.define = define;
	}

	public String execute() throws Exception {
		return INPUT;
	}
	
	public void validateSave() throws DbException, SQLException, CacheException {
		if(getDefine().getCurrentStatusId() == getDefine().getNextStatusId()) {
			addFieldError("define.NextStatusId", "操作无效! 下个状态不能与当前状态相同!");	
		}
	}
	
	
	//根据id的值来判断是更新还是添加
	public String save() throws DbException, SQLException, CacheException{
		//拼接字符串 用逗号分开;
		if(selectedRoleIds != null){
			String s = "";
			for(int i=0;i< selectedRoleIds.length;i++){
				if(selectedRoleIds[i] > 0){
					if(!"".equals(s)){
						s += ",";
					}
					s += selectedRoleIds[i];
				}
			}
			getDefine().setRoleList(s);
		}else{
			getDefine().setRoleList("");
		}
		
		if(currentStatusId > 0 && nextStatusId > 0){
			issueBiz.issueStateChangeDefineUpdate(define);
		}else{
			issueBiz.issueStateChangeDefineAdd(define);
		}
		return SUCCESS;
	}
}
