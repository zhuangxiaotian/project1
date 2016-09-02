package cn.topdeep.projgroup.action.work;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import common.util.StringUtils;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.biz.FuncProjectBiz;
import cn.topdeep.projgroup.entity.CodeBuild;
import cn.topdeep.projgroup.entity.CodeBuildProcedure;
import cn.topdeep.projgroup.entity.CodeBuildProcedureQueryCondition;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.FuncProcedure;
import cn.topdeep.projgroup.entity.TestParamValue;
import cn.topdeep.projgroup.entity.TestProcedure;

public class CodeBuildProcedureList extends BaseAction{
	private int buildId;
	private FuncProjectBiz funcProjectBiz;
	private int[] selectedFuncIds;
	private List<FuncProcedure> procList;
	private int srcBuildId;
	private String addprocVersion;
	private String addprocCode;
	private String addprocName;
	private int addFuncProcedureId;

	public int getAddFuncProcedureId() {
		return addFuncProcedureId;
	}

	public void setAddFuncProcedureId(int addFuncProcedureId) {
		this.addFuncProcedureId = addFuncProcedureId;
	}

	/**
	 * 是否反向导入
	 */
	private int invertImport = 0;
	public String execute(){
		return SUCCESS;
	}
	
	public String getAddprocVersion() {
		return addprocVersion;
	}

	public void setAddprocVersion(String addprocVersion) {
		this.addprocVersion = addprocVersion;
	}

	public String getAddprocCode() {
		return addprocCode;
	}

	public void setAddprocCode(String addprocCode) {
		this.addprocCode = addprocCode;
	}

	public String getAddprocName() {
		return addprocName;
	}

	public void setAddprocName(String addprocName) {
		this.addprocName = addprocName;
	}

	public String save() throws DbException, SQLException{
		List<FuncProcedure> list = getProcList();
		HashSet<Integer> procSet = new HashSet<Integer>();
		if(selectedFuncIds != null && selectedFuncIds.length > 0){
			for(int item : selectedFuncIds){
				procSet.add(item);
			}
		}
		List<CodeBuildProcedure> cbpList = funcProjectBiz.codeBuildProcedureSelectObjectsByBuildId(buildId);
		HashSet<Integer> oldProcSet = new HashSet<Integer>();
		for(CodeBuildProcedure item : cbpList){
			oldProcSet.add(item.getFuncProcedureId());
		}
		//first delete not selected
		if(list != null){
			for(FuncProcedure item : list){
				if(!procSet.contains(item.getFuncProcedureId())){
					if(oldProcSet.contains(item.getFuncProcedureId())){
						CodeBuildProcedure cbp = funcProjectBiz.codeBuildProcedureSelectSingleObject(new CodeBuildProcedureQueryCondition().setBuildIdCondition(buildId).setFuncProcedureIdCondition(item.getFuncProcedureId()));
						if(cbp != null){
							List<TestProcedure> idlist = funcProjectBiz.testProcedureSelectObjectsByBuildId(buildId);//取出构建test中所有函数
							funcProjectBiz.codeBuildProcedureDeleteByBuildProcedureId(cbp.getBuildProcedureId());
							//删除procedure表中对应数据
//							funcProjectBiz.testProcedureDeleteListByFuncProcedureId(item.getFuncProcedureId());
							for(TestProcedure one : idlist){
								if(one.getFuncProcedureId() == item.getFuncProcedureId()){
									//删除parama表中对应数据
//									funcProjectBiz.testParamValueDeleteListByTestProcedureId(one.getTestProcedureId());
									List<TestParamValue> deleteparam = funcProjectBiz.testParamValueSelectObjectsByTestProcedureId(one.getTestProcedureId());
									for(TestParamValue delete : deleteparam){
										if(delete.getTestProcedureId() == one.getTestProcedureId()){
											funcProjectBiz.testParamValueDeleteByTestProcedureIdParamId(delete.getTestProcedureId(), delete.getParamId());
										}
									}
									funcProjectBiz.testProcedureDeleteByTestProcedureId(one.getTestProcedureId());
								}
							}
							
						}
					}
					
				}
			}
		}
		if(selectedFuncIds != null && selectedFuncIds.length > 0 && buildId > 0){
			for(int i=0;i<selectedFuncIds.length;i++){
				int item = selectedFuncIds[i];
				if(!oldProcSet.contains(item)){
					CodeBuildProcedure cbp;
					cbp = new CodeBuildProcedure();
					cbp.setBuildId(buildId);
					cbp.setFuncProcedureId(item);
					funcProjectBiz.codeBuildProcedureInsert(cbp);
					TestProcedure test;
					test = new TestProcedure();
					List<TestProcedure> testList = funcProjectBiz.testProcedureSelectObjectsByBuildId(buildId);
					int addorder = 0;
					for(TestProcedure ss : testList){
						addorder = ss.getTestOrder();
					}
					test.setBuildId(buildId);
					test.setFuncProcedureId(item);
					test.setTestOrder(addorder+1);
					funcProjectBiz.testProcedureInsert(test);
				}
			}
		}
		this.procList = null;
		return SUCCESS;
	}

	private String invertImportFrom() throws DbException, SQLException{
		if(srcBuildId > 0 && buildId > 0){
			List<FuncProcedure> list = getProcList();
			List<CodeBuildProcedure> srcCbpList = funcProjectBiz.codeBuildProcedureSelectObjectsByBuildId(srcBuildId);
			List<CodeBuildProcedure> existCbpList = funcProjectBiz.codeBuildProcedureSelectObjectsByBuildId(buildId);
			HashSet<Integer> existCbpSet = new HashSet<Integer>();
			for(CodeBuildProcedure item : existCbpList){
				if(!existCbpSet.contains(item.getFuncProcedureId())){
					existCbpSet.add(item.getFuncProcedureId());
				}
			}
			HashSet<Integer> srcProcSet = new HashSet<Integer>();
			for(FuncProcedure item : list){
				if(!srcProcSet.contains(item.getFuncProcedureId())){
					srcProcSet.add(item.getFuncProcedureId());
				}
			}
			for(CodeBuildProcedure item : srcCbpList){
				if(srcProcSet.contains(item.getFuncProcedureId())){
					srcProcSet.remove(item.getFuncProcedureId());
				}
			}
			for(Iterator<Integer> it = srcProcSet.iterator();it.hasNext();){
				Integer funcProcedureId = it.next();
				if(!existCbpSet.contains(funcProcedureId)){
					CodeBuildProcedure cbp = new CodeBuildProcedure();
					cbp.setBuildId(buildId);
					cbp.setFuncProcedureId(funcProcedureId);
					funcProjectBiz.codeBuildProcedureInsert(cbp);
					existCbpSet.add(funcProcedureId);
				}
			}
		}
		this.procList = null;
		return SUCCESS;

	}
	
	public String importFrom() throws DbException, SQLException {
		if(invertImport == 1){
			return invertImportFrom();
		}
		if(srcBuildId > 0 && buildId > 0){
			List<CodeBuildProcedure> srcCbpList = funcProjectBiz.codeBuildProcedureSelectObjectsByBuildId(srcBuildId);
			List<CodeBuildProcedure> existCbpList = funcProjectBiz.codeBuildProcedureSelectObjectsByBuildId(buildId);
			HashSet<Integer> existCbpSet = new HashSet<Integer>();
			for(CodeBuildProcedure item : existCbpList){
				if(!existCbpSet.contains(item.getFuncProcedureId())){
					existCbpSet.add(item.getFuncProcedureId());
				}
			}
			for(CodeBuildProcedure item : srcCbpList){
				if(!existCbpSet.contains(item.getFuncProcedureId())){
					CodeBuildProcedure cbp = new CodeBuildProcedure();
					cbp.setBuildId(buildId);
					cbp.setFuncProcedureId(item.getFuncProcedureId());
					funcProjectBiz.codeBuildProcedureInsert(cbp);
					existCbpSet.add(item.getFuncProcedureId());
				}
			}
		}
		return SUCCESS;
	}
	
	/**
	 * @return the funcProjectBiz
	 */
	public FuncProjectBiz getFuncProjectBiz() {
		return funcProjectBiz;
	}

	/**
	 * @param funcProjectBiz the funcProjectBiz to set
	 */
	public void setFuncProjectBiz(FuncProjectBiz funcProjectBiz) {
		this.funcProjectBiz = funcProjectBiz;
	}
	
	public int getBuildId() {
		return buildId;
	}

	public void setBuildId(int buildId) {
		this.buildId = buildId;
	}

	/**
	 * @return the selectedFuncIds
	 */
	public int[] getSelectedFuncIds() {
		return selectedFuncIds;
	}

	/**
	 * @param selectedFuncIds the selectedFuncIds to set
	 */
	public void setSelectedFuncIds(int[] selectedFuncIds) {
		this.selectedFuncIds = selectedFuncIds;
	}

	/**
	 * @return the procList
	 * @throws SQLException 
	 * @throws DbException 
	 */
	public List<FuncProcedure> getProcList() throws DbException, SQLException {
		if(procList == null && buildId > 0){
			CodeBuild build = funcProjectBiz.codeBuildSelectByBuildId(buildId);
			if(build != null && !StringUtils.isNullOrEmpty(build.getFuncProjects())){
				procList = funcProjectBiz.funcProcedureSelectObjects(" where func_project_id in ("+build.getFuncProjects()+")");
				
				List<CodeBuildProcedure> cbpList = funcProjectBiz.codeBuildProcedureSelectObjectsByBuildId(buildId);
				
				HashSet<Integer> procSet = new HashSet<Integer>();
				HashMap<Integer, CodeBuildProcedure> notExistMap = new HashMap<Integer, CodeBuildProcedure>();
				for(CodeBuildProcedure item : cbpList){
					procSet.add(item.getFuncProcedureId());
					notExistMap.put(item.getFuncProcedureId(), item);
				}
				
				for(FuncProcedure item : procList){
					if(procSet.contains(item.getFuncProcedureId())){
						item.setPub5("1");
						notExistMap.remove(item.getFuncProcedureId());
					}else{
						item.setPub5("0");
					}
				}
				
				if(notExistMap.size() > 0){
					for(Integer item : notExistMap.keySet()){
						CodeBuildProcedure cbp = notExistMap.get(item);
						funcProjectBiz.codeBuildProcedureDeleteByBuildProcedureId(cbp.getBuildProcedureId());
					}
				}
			}
		}
		return procList;
	}

	/**
	 * @return the srcBuildId
	 */
	public int getSrcBuildId() {
		return srcBuildId;
	}

	/**
	 * @param srcBuildId the srcBuildId to set
	 */
	public void setSrcBuildId(int srcBuildId) {
		this.srcBuildId = srcBuildId;
	}

	/**
	 * @return the invertImport
	 */
	public int getInvertImport() {
		return invertImport;
	}

	/**
	 * @param invertImport the invertImport to set
	 */
	public void setInvertImport(int invertImport) {
		this.invertImport = invertImport;
	}

}
