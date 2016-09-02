/**
 * $Id$
 */
package cn.topdeep.projgroup.biz;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import common.util.HttpUtils;

/**
 * @author niexin
 *
 */
public class UrlManage {
	
	public String getBaseUrl(){
		HttpServletRequest req = ServletActionContext.getRequest();
		if(req != null){
			String baseUrl = req.getScheme()+"://"+req.getServerName();
			if(req.getServerPort() != 80){
				baseUrl += ":"+req.getServerPort();
			}
			if(req.getContextPath().equals("/")){
				baseUrl += "/";
			}else{
				baseUrl += req.getContextPath()+"/";
			}
			return baseUrl;
		}
		return "";
	}
	
	public String getPersonalTaskListUrl(){
		return getBaseUrl()+"personal/PersonalList.action";
	}
	
	public String getTaskListViewUrl(int projId){
		return getBaseUrl()+"work/TaskListView.action?projId="+projId;
	}
	
	public String getDefaultTaskDealUrl(String taskId, String signalName, String retUrl){
		return getBaseUrl()+"personal/DefaultTaskDeal.action?taskId="+taskId+"&signalName="+HttpUtils.urlEncode(signalName)+"&retUrl="+HttpUtils.urlEncode(retUrl);
	}

	public String getCreateNewProcessUrl(String processDefineKey){
		return getBaseUrl() + "process/DefineList!startNew.action?processDefineKey="+processDefineKey;
	}
	
	public String getProcessInstanceViewUrl(String processDefineId){
		return getBaseUrl() + "process/DefineList.action?processDefineId="+processDefineId;
	}
	
	public String getSignalProcessInstanceUrl(String processId){
		return getBaseUrl() + "process/DefineList!signalProcessInstance.action?processId="+processId;
	}

	public String getOrMappingProjectListUrl(){
		return getBaseUrl()+"work/OrProjectList.action";
	}
	
	public String getBuildProjectOrMappingFileUrl(int projectId){
		return getBaseUrl()+"work/OrProjectList!build.action?projectId="+projectId;
	}

	public String getOrMappingProjectEditUrl(int projectId){
		return getBaseUrl()+"work/OrProjectEdit.action?projectId="+projectId;
	}
	
	public String getFlowTaskViewUrl(String taskId){
		return getBaseUrl()+"process/FlowTaskView.action?taskId="+taskId;
	}
	
	public String getProjectBuildUrl(int projectId){
		return getBaseUrl()+"work/ProjectBuild.action?projectId="+projectId;
	}
	
	public String getProjectAjaxBuildUrl(){
		return getBaseUrl()+"work/ProjectBuild!execBuild.action";
	}

	public String getProjectDownloadBuildFileUrl(){
		return getBaseUrl()+"work/ProjectBuild!downloadFile.action";
	}

	public String getCodeBuildListUrl(){
		return getBaseUrl() + "work/CodeBuildList.action";
	}
	
	public String getAjaxQueryCodeBuildExecuteListServiceUrl(int buildId){
		return getBaseUrl() + "work/CodeBuildExecute!ajaxQueryCodeBuildList.action?buildId="+buildId;
	}
	
	public String getCodeBuildExecuteUrl(){
		return getBaseUrl() + "work/CodeBuildExecute.action";
	}

	public String getCodeBuildExecuteUrl(int buildId){
		return getBaseUrl() + "work/CodeBuildExecute.action?buildId="+buildId;
	}
	
	public String getAjaxCodeBuileExecuteServiceUrl(){
		return getBaseUrl() + "work/CodeBuildExecute!ajaxBuild.action";
	}
	
	public String getFuncTestListUrl(){
		return getBaseUrl() + "work/FuncTestEdit.action";
	}
	
	public String getFuncTestListUrl(int buildId){
		return getBaseUrl() + "work/FuncTestEdit.action?buildId="+buildId;
	}
	
	public String getCodeBuildDownloadUrl(){
		return getBaseUrl() + "work/CodeBuildExecute!downloadFile.action";
	}
	
	public String getCodeBuildDownloadLogFileUrl(){
		return getBaseUrl() + "work/CodeBuildExecute!downloadLogFile.action";
	}
	
	public String getCodeBuildAjaxDeleteUrl(){
		return getBaseUrl() + "work/CodeBuildExecute!ajaxDelete.action";
	}
	
	public String getCodeBuildAjaxViewLogUrl(){
		return getBaseUrl() + "work/CodeBuildExecute!ajaxViewLog.action";
	}
	
	public String getCodeBuildPropertyEditUrl(){
		return getBaseUrl() + "work/CodeBuildPropertyEdit.action";
	}

	public String getCodeBuildPropertyEditUrl(int buildId){
		return getBaseUrl() + "work/CodeBuildPropertyEdit.action?buildId="+buildId;
	}
	
	public String getCodeBuildEditUrl(){
		return getBaseUrl() + "work/CodeBuildEdit.action";
	}

	public String getCodeBuildEditUrl(int buildId){
		return getBaseUrl() + "work/CodeBuildEdit.action?buildId="+buildId;
	}
	
	public String getAjaxQueryCodeBuildListServiceUrl(){
		return getBaseUrl() + "work/CodeBuildList!ajaxQueryCodeBuildList.action";
	}
	
	public String getFuncImportUrl(){
		return getBaseUrl() + "work/FuncImport.action";
	}
	
	public String getFuncImportUrl(int funcProjectId){
		return getBaseUrl() + "work/FuncImport.action?funcProjectId="+funcProjectId;
	}

	public String getCodeBuildProcedureListUrl(){
		return getBaseUrl() + "work/CodeBuildProcedureList.action";
	}

	public String getCodeBuildProcedureListUrl(int buildId){
		return getBaseUrl() + "work/CodeBuildProcedureList.action?buildId="+buildId;
	}
	
	public String getFuncProcedureListUrl(int funcProjectId){
		return getBaseUrl() + "work/FuncProcedureList.action?funcProjectId="+funcProjectId;
	}
	
	/**
	 * 获得重写请假单的URＬ
	 * @param taskId
	 * @return
	 */
	public String getLeaveEditUrl(String taskId){
		return getBaseUrl()+"personal/LeaveRequest.action?taskId="+taskId;
	}
	
	public String getAjaxSetLogScoreServiceUrl(){
		return getBaseUrl() + "work/WorkLogView!ajaxSetLogScore.action";
	}
}
