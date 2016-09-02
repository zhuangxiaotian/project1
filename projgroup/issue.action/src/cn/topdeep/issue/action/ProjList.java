/**
 * 
 */
package cn.topdeep.issue.action;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.*;
import java.util.Map.Entry;

import com.opensymphony.xwork2.ActionContext;

import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.data.issue.*;
import cn.topdeep.projgroup.entity.view.issue.*;

public class ProjList extends PageAction {
	
	//为了在页面能显示其他表的内容,将<IssueProjectList>改为<IssueProjectListView>其他参数不变.
	//比如要显示issueUser里的用户名称,修改为如下步骤为1,创建IssueProjectListView实体类; 2;因为要在当前页面显示别的数据.原来的查询方法就不行了...必须新增查询方法///在ISSUEDAO层中添加,一般方法是先定义SQL
	//语句(就是加上连接操作语句).再加上count方法和list方法
	private List<IssueProjectListView> projList;
	
	private int[] projIds;
	
	public String disable() throws Exception{
		if(projIds != null){
			issueBiz.issueprojectChanageState(projIds, IssueProjectState.Disabled);
		}
		return execute();
	}
	
	@SuppressWarnings("unchecked")
	public String enable() throws Exception{
		
		ActionContext ac = ActionContext.getContext();
		Map map = ac.getParameters();
		for(Iterator<Entry<String, String[]>> it = map.entrySet().iterator();it.hasNext();){
			Entry<String, String[]> entry = it.next();
			System.out.println(entry.getKey()+"="+entry.getValue().toString());
		}
		
		if(projIds != null){
			issueBiz.issueprojectChanageState(projIds, IssueProjectState.Enabled);
		}
		return execute();
	}
	
	public String delete() throws Exception {
		if(projIds != null) {
			issueBiz.issueProjectDelete(projIds);
		}
		return execute();
	}
	
	
	public void setProjIds(int[] projIds) {
		this.projIds = projIds;
	}
	// 新增修改,显示IssueUsers里的内容;
	public List<IssueProjectListView> getProjList() throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		if(projList == null){
			projList = issueBiz.queryIssueProjList(getPageIndex(), getRowsOfPage(), "ISSUE_PROJECT_ID", "asc");
		}
		return projList;
	}

	private int rowsCount = -1;
	
	public int getRowsCount() {
		if(rowsCount < 0) {
			try {
				rowsCount = issueBiz.queryIssueProjectListViewListCount();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rowsCount;
	}
}
