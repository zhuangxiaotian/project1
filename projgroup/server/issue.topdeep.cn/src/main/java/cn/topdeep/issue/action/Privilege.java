package cn.topdeep.issue.action;
/**
 * @author gmtstu
 */
import java.sql.SQLException;
import java.util.List;

import common.cache2.CacheException;

import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.IssuePriorities;
//无用处的action  可以删除掉

public class Privilege extends PageAction{
	
	private List<IssuePriorities> prioritiesList;
	
	public List<IssuePriorities> getPrioritiesList() throws DbException, SQLException, CacheException {
		if(prioritiesList == null) {
			prioritiesList = issueBiz.queryIssuePrioritiesList(0, Integer.MAX_VALUE, "PRIORITIES_ID", "asc");
		}
		return prioritiesList;
	}
	
	public String execute() throws Exception {
			
			return super.execute();
			
		}

	@Override
	public int getRowsCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getRowsOfPage() {
		return 10;
	}
}
