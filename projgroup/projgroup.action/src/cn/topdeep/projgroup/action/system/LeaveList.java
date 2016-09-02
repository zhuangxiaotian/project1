/**
 * $Id$
 */
package cn.topdeep.projgroup.action.system;

import cn.topdeep.projgroup.action.PageAction;
import cn.topdeep.projgroup.biz.process.ProcessDefineKey;

import java.util.*;

import org.jbpm.api.*;
import org.jbpm.api.history.HistoryProcessInstance;


/**
 * @author niexin
 *
 */
public class LeaveList extends PageAction {

	private HistoryService historyService;
	
	private RepositoryService repositoryService;
	
	private List<HistoryProcessInstance> leaveList;
	
	/* (non-Javadoc)
	 * @see cn.topdeep.projgroup.action.PageAction#getRowsCount()
	 */
	@Override
	public int getRowsCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public List<HistoryProcessInstance> getLeaveList() {
		if(leaveList == null){
			String pdId = repositoryService.createProcessDefinitionQuery().processDefinitionKey(ProcessDefineKey.Leave).uniqueResult().getId();
			leaveList = historyService.createHistoryProcessInstanceQuery().processDefinitionId(pdId).page(getPageIndex() * getRowsOfPage(), getPageIndex() * getRowsOfPage()+getRowsOfPage()).list();
		}
		return leaveList;
	}

	public RepositoryService getRepositoryService() {
		return repositoryService;
	}


	public void setRepositoryService(RepositoryService repositoryService) {
		this.repositoryService = repositoryService;
	}


	public HistoryService getHistoryService() {
		return historyService;
	}


	public void setHistoryService(HistoryService historyService) {
		this.historyService = historyService;
	}

}
