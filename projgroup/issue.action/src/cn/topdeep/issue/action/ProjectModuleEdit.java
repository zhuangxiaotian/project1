package cn.topdeep.issue.action;

import java.sql.SQLException;
import java.util.List;

import common.cache2.CacheException;

import cn.topdeep.projgroup.entity.*;

public class ProjectModuleEdit extends BaseAction{

	private IssueProjectModule projMoudle;
	
	private int issueProjectModuleId; 

	private List<IssueProject> projList;
	
	public List<IssueProject> getProjList() throws DbException, SQLException, CacheException {
		if(projList == null){
			projList = issueBiz.queryProjList(0, Integer.MAX_VALUE, "ISSUE_PROJECT_ID", "asc");
		}
		return projList;
	}

	private int issueProjectId;
	
	public int getIssueProjectModuleId() {
		return issueProjectModuleId;
	}

	public void setIssueProjectModuleId(int issueProjectModuleId) {
		this.issueProjectModuleId = issueProjectModuleId;
	}
	
	public IssueProjectModule getProjMoudle() throws DbException, SQLException, CacheException {
		if(projMoudle == null && issueProjectModuleId > 0) {
			projMoudle = issueBiz.queryIssueProjectModule(issueProjectModuleId);
		}
		return projMoudle;
	}
	
	public void setProjMoudle(IssueProjectModule projMoudle) {
		this.projMoudle = projMoudle;
	}

	
	@Override
	public String execute() throws Exception {
		return INPUT;
	}
	
	public void validateSave() throws DbException, SQLException, CacheException{
		IssueProjectModule mod = issueBiz.queryIssueProjectModule(getProjMoudle().getIssueProjectId(), getProjMoudle().getModuleName());
		if(mod != null) {
			if(mod.getIssueProjectModuleId() != getProjMoudle().getIssueProjectModuleId()) {
				addFieldError("projMoudle.ModuleName", "模块名称已存在,请另想一个!");
			}
		}
	}
	
	
	public String save() throws DbException, SQLException, CacheException{
		if (issueProjectModuleId > 0){
			issueBiz.issueProjectMoudleUpdate(projMoudle);			
		}else {
			
			issueBiz.issueProjectMoudleAdd(projMoudle);
		}
		return SUCCESS;
		
	}

	public void setIssueProjectId(int issueProjectId) {
		this.issueProjectId = issueProjectId;
	}

	public int getIssueProjectId() {
		return issueProjectId;
	}

}
