package cn.topdeep.issue.action;


import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.*;
import java.util.Map.Entry;
import com.opensymphony.xwork2.ActionContext;

import common.cache2.CacheException;
import common.util.StringUtils;

import cn.topdeep.projgroup.biz.IssueBiz;
import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.data.issue.*;
import cn.topdeep.projgroup.entity.view.issue.IssueStateChangeDefineListView;

public class StateChangeDefineList extends PageAction{

	private List<IssueStateChangeDefineListView> stateChangeDefineList;
	
	private int currentStatusId;
	
	private int nextStatusId;
	
	public String delete() throws Exception {
		if(currentStatusId > 0 && nextStatusId > 0){
			issueBiz.issueStateChangeDefineDelete(currentStatusId, nextStatusId);
		}
		return execute();
	}
	// 数据库查找 根据CURRENT_STATUS_ID查找出纪录 用于页面显示
	public List<IssueStateChangeDefineListView> getStateChangeDefineList() throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, CacheException {
		if(stateChangeDefineList == null){
			stateChangeDefineList = issueBiz.queryIssueStateChangeDefineList(getPageIndex(), getRowsOfPage(), "CURRENT_STATUS_ID", "asc");
			//set rolelistname ,,,,,,,  将查找出来的roleList 解析出来,用""
			List<IssueRoles> roleList = issueBiz.queryIssueRoleList(0, Integer.MAX_VALUE, "ROLE_ID", "asc");
			//for (循环变量类型   循环变量名称 : 要被遍历的对象) 循环体
//          例如: 遍历Collection的简单方式
//			/* 建立一个Collection */
//			String[] strings = {"A", "B", "C", "D"};
//			Collection list = java.util.Arrays.asList(strings);
//			/* 开始遍历 */
//			for (Object str : list) {
//			System.out.println(str);/* 依次输出“A”、“B”、“C”、“D” */
//			}
//
			for(IssueStateChangeDefineListView item : stateChangeDefineList){
				item.setRoleListName(queryRoleListName(item.getRoleList(),roleList));
			}
		}
		return stateChangeDefineList;
	}
	//解析rolelist  将他用","分开;
	private String queryRoleListName(String roleIds, List<IssueRoles> roleList){
		String s = "";
		if(StringUtils.isNullOrEmpty(roleIds)){
			return s;
		}
		String[] ids = roleIds.split(",");
		for(String id : ids){
			int roleId = Integer.parseInt(id);
			for(IssueRoles item : roleList){
				if(item.getRoleId() == roleId){
					if(!"".equals(s)){
						s += ",";
					}
					s += item.getRoleName();
					break;
				}
			}
		}
		return s;
	}
	

	public int getCurrentStatusId() {
		return currentStatusId;
	}


	public void setCurrentStatusId(int currentStatusId) {
		this.currentStatusId = currentStatusId;
	}


	public int getNextStatusId() {
		return nextStatusId;
	}


	public void setNextStatusId(int nextStatusId) {
		this.nextStatusId = nextStatusId;
	}

	private int rowsCount = -1;
	
	public int getRowsCount() {
		if(rowsCount < 0) {
			try {
				rowsCount = issueBiz.queryIssueStateChangeDefineListViewListCount();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return rowsCount;
	}
	


	
}
