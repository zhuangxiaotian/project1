package cn.topdeep.issue.action;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.view.issue.*;
public class QueryList extends PageAction{
	
	public List<IssueQueryListView> issueQueryList;

	public List<IssueQueryListView> getIssueQueryList() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		if(issueQueryList == null) {
			issueQueryList = issueBiz.queryIssueQueryListViewList(getPageIndex(), getRowsOfPage(), "ISSUE_QUERY_ID", "asc");
			if(issueLoginUser.getLoginUser().getInnerUserId() == null) {
				for(Iterator<IssueQueryListView> it = issueQueryList.iterator(); it.hasNext();) {
					IssueQueryListView view = it.next();
					if(!view.getIsPublic()) {
						it.remove();
					}
				}
			}
		}
		return issueQueryList;
	}

	public void setIssueQueryList(List<IssueQueryListView> issueQueryList) {
		this.issueQueryList = issueQueryList;
	}

	private int rowsCount = -1;
	public int getRowsCount() {
		if(rowsCount < 0) {
			try {
				rowsCount = issueBiz.getQueryIssueQueryListViewListCount();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rowsCount;
	}
	

}
