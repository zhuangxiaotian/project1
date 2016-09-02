package cn.topdeep.issue.action;

import java.sql.SQLException;

import common.cache2.CacheException;
import common.util.StringUtils;

import cn.topdeep.projgroup.entity.*;

public class  PrioritlesEdit extends BaseAction {

	private IssuePriorities priorities;
	
	//角色编辑....先添加成员变量roleid,然后根据上个页面所提交过来的值判断是保存还是修改.如果大于0则为修改(update).否则为增加角色.
	private byte prioritiesId;
	
	

	public byte getPrioritiesId() {
		return prioritiesId;
	}

	public void setPrioritiesId(byte prioritiesId) {
		this.prioritiesId = prioritiesId;
	}

	public IssuePriorities getPriorities() throws DbException, SQLException, CacheException {
		if(priorities == null && prioritiesId > 0){
			priorities = issueBiz.queryIssuePrioritles(prioritiesId);
		}
		return priorities;
	}

	public void setPriorities(IssuePriorities priorities) {
		this.priorities = priorities;
	}

	@Override
	public String execute() throws Exception {
		
		return INPUT;
		
		
	}
	
	//根据prioritiesId的值来判断是更新还是添加
	public String save() throws DbException, SQLException, CacheException{
		if(prioritiesId > 0){
			if(!StringUtils.isNullOrEmpty(priorities.getPrioritiesName())) {
				issueBiz.issuePrioritiesUpdate(priorities);
			}else {
				addFieldError("priorities.prioritiesName", "优先名称不能为空");
			}
		}else{
			if(!StringUtils.isNullOrEmpty(priorities.getPrioritiesName())) {
				issueBiz.issuePrioritiesAdd(priorities);
			}else {
				addFieldError("priorities.prioritiesName", "优先名称不能为空");
			}
		}
		return SUCCESS;
	}
}
