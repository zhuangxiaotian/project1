package cn.topdeep.issue.action;

import java.sql.SQLException;

import common.cache2.CacheException;

import cn.topdeep.projgroup.entity.bugtracker.DbException;
import cn.topdeep.projgroup.entity.data.IssueLoginUser;

public class IssueImport extends BaseAction{
	
	 public String imports() throws DbException, SQLException, CacheException {
		 issueBiz.importOldData();
		return SUCCESS;
		
	 }
	
}
