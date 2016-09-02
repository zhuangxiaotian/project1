
package cn.topdeep.issue.action;

import java.sql.SQLException;
import java.util.*;
import java.util.Map.Entry;
import com.opensymphony.xwork2.ActionContext;
import common.cache2.CacheException;

import cn.topdeep.projgroup.biz.IssueBiz;
import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.data.issue.*;

public class PrioritlesList extends PageAction {
	//封装
	
	private List<IssuePriorities> prioritleslist;
	
	private byte[] prioritiesIds;
	
	public void setPrioritiesIds(byte[] prioritiesIds) {
		this.prioritiesIds = prioritiesIds;
	}
	
	//修改状态
	
	public String disable() throws Exception{
		if(prioritiesIds != null){
			issueBiz.issuePrioritiesChanageState(prioritiesIds, IssuePrioritiesState.Disabled);
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
		
		if(prioritiesIds != null){
			issueBiz.issuePrioritiesChanageState(prioritiesIds, IssuePrioritiesState.Enabled);
		}
		return execute();
	}

	//删除
	
	public String delete() throws Exception {
		if(prioritiesIds != null) {
			issueBiz.issuePrioritiesDelete(prioritiesIds);
		}
		return execute();
	}
	
	
	//jsp页面显示部分
	public List<IssuePriorities> getPrioritleslist() throws DbException, SQLException, CacheException {
		if(prioritleslist == null){
			prioritleslist = issueBiz.queryIssuePrioritlesList(getPageIndex(), getRowsOfPage(), "PRIORITIES_ID", "asc");
		}
		return prioritleslist;
	}
	
	private int rowsCount = -1;
	
	public int getRowsCount() {
		if(rowsCount < 0) {
			try {
				rowsCount = issueBiz.queryIssuePrioritlesListCount();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rowsCount;
	}
}
