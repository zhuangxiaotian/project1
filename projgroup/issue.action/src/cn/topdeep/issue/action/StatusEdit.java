package cn.topdeep.issue.action;

import java.sql.SQLException;

import common.cache2.CacheException;

import cn.topdeep.projgroup.entity.*;

public class StatusEdit extends BaseAction {

	private IssueStatus status;
	
	//角色编辑....先添加成员变量,然后根据上个页面所提交过来的值判断是保存还是修改.如果大于0则为修改(update).否则为增加角色.
	private int statusId;
	
	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public IssueStatus getStatus() throws DbException, SQLException, CacheException {
		if(status == null && statusId > 0){
			status = issueBiz.queryIssueStatus(statusId);
		}
		return status;
	}

	public void setStatus(IssueStatus status) {
		this.status = status;
	}

	@Override
	public String execute() throws Exception {
		return INPUT;
	}
	
	//根据id的值来判断是更新还是添加
	public String save() throws DbException, SQLException, CacheException{
		if(statusId > 0){
			issueBiz.issueStatusUpdate(status);
		}else{
			issueBiz.issueStatusAdd(status);
		}
		return SUCCESS;
	}
}
