package cn.topdeep.issue.action;

import java.sql.SQLException;
import java.util.*;
import java.util.Map.Entry;
import com.opensymphony.xwork2.ActionContext;
import common.cache2.CacheException;

import cn.topdeep.projgroup.biz.IssueBiz;
import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.data.issue.*;


public class StatusList extends PageAction {
	private List<IssueStatus> statusList;
	
	private byte[] statusIds;
	
	public void setStatusIds(byte[] statusIds) {
		this.statusIds = statusIds;
	}
	
	//修改状态
	public String disable() throws Exception{
		if(statusIds != null){
			issueBiz.issueStatusChanageState(statusIds, IssueStatusState.Disabled);
		}
		return execute();
	}
	
	public String enable() throws Exception{
		
		ActionContext ac = ActionContext.getContext();
		Map map = ac.getParameters();
		for(Iterator<Entry<String, String[]>> it = map.entrySet().iterator();it.hasNext();){
			Entry<String, String[]> entry = it.next();
			System.out.println(entry.getKey()+"="+entry.getValue().toString());
		}
		
		if(statusIds != null){
			issueBiz.issueStatusChanageState(statusIds, IssueStatusState.Enabled);
		}
		return execute();
	}

	//删除
	
	public String delete() throws Exception {
		if(statusIds != null) {
			issueBiz.issueStatusDelete(statusIds);
		}
		return execute();
	}
	
	
	//jsp页面显示部分
	public List<IssueStatus> getStatusList() throws DbException, SQLException, CacheException {
		if(statusList == null){
			statusList = issueBiz.queryIssueStatusList(getPageIndex(), getRowsOfPage(), "STATUS_SORT", "asc");
		}
		return statusList;
	}

	private int rowsCount = -1;
	
	public int getRowsCount() {
		if(rowsCount < 0) {
			try {
				rowsCount = issueBiz.queryIssueStatusListCount();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rowsCount;
	}
}



