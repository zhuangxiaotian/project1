/**
 * $Id$
 */
package cn.topdeep.projgroup.action.process;

import java.io.*;
import java.util.*;
import java.util.zip.ZipInputStream;

import org.jbpm.api.*;
import org.jbpm.api.task.Task;

import cn.topdeep.projgroup.action.PageAction;
import cn.topdeep.projgroup.biz.UrlManage;

import common.util.*;
/**
 * @author niexin
 *
 */
public class DefineList extends PageAction {

	private File uploadFile;
	private UrlManage urlManage;
	private RepositoryService repositoryService;
	private ExecutionService executionService;
	private TaskService taskService;
	private ProcessInstance processInstance;
	private List<ProcessDefinition> processDefinitionList;
	private List<ProcessInstance> processInstanceList;
	private String processDefinitionContent;
	private String processDefineKey;
	private String processDefineId;
	private String processId;
	private String userId;
	private List<Task> personerTaskList;
	
	public String execute(){
		return SUCCESS;
	}
	
	public String deployProcessDefinition(){
		getRepositoryService().createDeployment()
					.addResourceFromString("process.jpdl.xml", processDefinitionContent).deploy();
		return execute();
	}
	
	public String deployProcessDefinitionByFile() throws FileNotFoundException{
		repositoryService.createDeployment().addResourcesFromZipInputStream(new ZipInputStream(new FileInputStream(uploadFile))).deploy();
		return execute();
	}

	public String startNew(){
		if(!StringUtils.isNullOrEmpty(processDefineKey)){
			processInstance = getExecutionService().startProcessInstanceByKey(processDefineKey);
		}
		return execute();
	}
	
	
	public String signalProcessInstance(){
		if(!StringUtils.isNullOrEmpty(processId)){
			getExecutionService().signalExecutionById(processId);
		}
		return execute();
	}
	
	public String getProcessDefinitionContent() {
		return processDefinitionContent;
	}

	public void setProcessDefinitionContent(String processDefinitionContent) {
		this.processDefinitionContent = processDefinitionContent;
	}

	public RepositoryService getRepositoryService() {
		return repositoryService;
	}

	public ExecutionService getExecutionService() {
		return executionService;
	}

	public ProcessInstance getProcessInstance() {
		return processInstance;
	}

	public List<ProcessDefinition> getProcessDefinitionList() {
		if(processDefinitionList == null){
			processDefinitionList = getRepositoryService().createProcessDefinitionQuery().orderAsc(ProcessDefinitionQuery.PROPERTY_NAME).list();
			Map<String,ProcessDefinition> map = new LinkedHashMap<String,ProcessDefinition>();
			for (ProcessDefinition pd : processDefinitionList) {
				String key = pd.getKey();
				ProcessDefinition definition = map.get(key);
				if ((definition == null) || (definition.getVersion() < pd.getVersion())) {
					map.put(key, pd);
				}
			}
			processDefinitionList = new ArrayList(map.values());
		}
		return processDefinitionList;
	}

	
	public void setProcessDefineKey(String processDefineKey) {
		this.processDefineKey = processDefineKey;
	}

	public UrlManage getUrlManage() {
		return urlManage;
	}

	public void setUrlManage(UrlManage urlManage) {
		this.urlManage = urlManage;
	}

	public List<ProcessInstance> getProcessInstanceList() {
		if(processInstanceList == null){
			if(!StringUtils.isNullOrEmpty(processDefineId)){
				processInstanceList = getExecutionService().createProcessInstanceQuery()
		        .processDefinitionId(processDefineId).list();
			}
		}
		return processInstanceList;
	}

	public void setProcessDefineId(String processDefineId) {
		this.processDefineId = processDefineId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<Task> getPersonerTaskList() {
		if(personerTaskList == null){
			if(!StringUtils.isNullOrEmpty(userId)){
				personerTaskList = taskService.findPersonalTasks(userId);
			}
		}
		return personerTaskList;
	}

	public void setRepositoryService(RepositoryService repositoryService) {
		this.repositoryService = repositoryService;
	}

	public void setExecutionService(ExecutionService executionService) {
		this.executionService = executionService;
	}

	public TaskService getTaskService() {
		return taskService;
	}

	public void setTaskService(TaskService taskService) {
		this.taskService = taskService;
	}

	public File getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	@Override
	public int getRowsCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
