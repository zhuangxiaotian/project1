package cn.topdeep.projgroup.action.work;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.biz.FuncProjectBiz;
import cn.topdeep.projgroup.entity.CodeBuild;
import cn.topdeep.projgroup.entity.CodeBuildProcedure;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.FuncProcedure;
import cn.topdeep.projgroup.entity.FuncTest;
import cn.topdeep.projgroup.entity.TestParamValue;
import cn.topdeep.projgroup.entity.TestProcedure;

import common.util.StringUtils;


public class FuncTestEdit extends BaseAction{
	
	private List<FuncProcedure> procList;
	
	private int buildId;
	
	private int paramId;

	private FuncProjectBiz funcProjectBiz;
	
	private String testValue;
	private String testValueDesc;
	private String addprocVersion;
	private String addprocCode;
	private String addprocName;
	private int addFuncProcedureId;
	private int testprocedureId;
	
	
	
	public int getTestprocedureId() {
		return testprocedureId;
	}


	public void setTestprocedureId(int testprocedureId) {
		this.testprocedureId = testprocedureId;
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


	public int getAddFuncProcedureId() {
		return addFuncProcedureId;
	}


	public void setAddFuncProcedureId(int addFuncProcedureId) {
		this.addFuncProcedureId = addFuncProcedureId;
	}


	public String getTestValue() {
		return testValue;
	}


	public void setTestValue(String testValue) {
		this.testValue = testValue;
	}


	public String getTestValueDesc() {
		return testValueDesc;
	}


	public void setTestValueDesc(String testValueDesc) {
		this.testValueDesc = testValueDesc;
	}

	public int getParamId() {
		return paramId;
	}


	public void setParamId(int paramId) {
		this.paramId = paramId;
	}


	public FuncProjectBiz getFuncProjectBiz() {
		return funcProjectBiz;
	}


	public void setFuncProjectBiz(FuncProjectBiz funcProjectBiz) {
		this.funcProjectBiz = funcProjectBiz;
	}


	public int getBuildId() {
		return buildId;
	}


	public void setBuildId(String buildId) {
		this.buildId = Integer.parseInt(buildId);
	}


	public void setProcList(List<FuncProcedure> procList) {
		this.procList = procList;
	}


	public String execute(){
		return SUCCESS;
	}

	public String addsave() throws DbException, SQLException{
//		HashMap<String,String> data = new HashMap<String,String>();
		if(procList == null && buildId > 0){
			CodeBuild build = funcProjectBiz.codeBuildSelectByBuildId(buildId);
			if(build != null && !StringUtils.isNullOrEmpty(build.getFuncProjects())){
				procList = funcProjectBiz.funcProcedureSelectObjects(" where func_project_id in ("+build.getFuncProjects()+")");
			}
		}
		if(addprocVersion != null){
			if(addprocCode != null || addprocName != null){
				for(int i=0;i<procList.size();i++){
					if(addprocVersion.equals(procList.get(i).getProcVersion()) && addprocCode.equals(procList.get(i).getProcCode()) || addprocVersion.equals(procList.get(i).getProcVersion())&&addprocName.equals(procList.get(i).getProcName())){
						List<TestProcedure> funcprocedureIds = funcProjectBiz.testProcedureSelectObjectsByBuildId(buildId);//test函数标识
						for(int j=0;j<funcprocedureIds.size();j++){
							if(funcprocedureIds.get(j).getFuncProcedureId() == procList.get(i).getFuncProcedureId()){
								TestProcedure cbp;
								cbp = new TestProcedure();
								cbp.setBuildId(buildId);
								cbp.setFuncProcedureId(funcprocedureIds.get(j).getFuncProcedureId());
								cbp.setTestOrder(funcprocedureIds.size());
								funcProjectBiz.testProcedureInsert(cbp);
								break;
							}
						}
					}
				}
			}
		}
		this.procList = null;
		return SUCCESS;
	}
	
	public String ajaxAdd() throws DbException, SQLException{
//		FuncTest funcTest = new FuncTest();
//		funcTest.setBuildId(buildId);
//		funcTest.setTestValue(testValue);
//		funcTest.setTestValueDesc(testValueDesc);
//		funcTest.setParamId(paramId);
//		if(projectBiz.funcTestSelectByBuildIdParamId(buildId, paramId)==null){
//			projectBiz.funcTestInsert(funcTest);
//		}else{
//			projectBiz.funcTestUpdate(funcTest);
//		}
//		jsonObj = funcTest;
		TestParamValue testParamValue = new TestParamValue();
		testParamValue.setParamId(paramId);
		testParamValue.setTestProcedureId(testprocedureId);
		testParamValue.setTestValue(testValue);
		testParamValue.setTestValueDesc(testValueDesc);
		if(projectBiz.testParamValueSelectByTestProcedureIdParamId(testprocedureId, paramId) == null){
			projectBiz.testParamValueInsert(testParamValue);
		}else{
			projectBiz.testParamValueUpdate(testParamValue);
		}
		jsonObj = testParamValue;
		return AJAX;
	}
	
	
	/**
	 * @param oneprocList 
	 * @throws SQLException 
	 * @throws DbException 
	 */
	public List<FuncProcedure> getProcList() throws DbException, SQLException {
		List<FuncProcedure> newprocList;
		List<FuncProcedure> addprocList;
		if(procList == null && buildId > 0){
			CodeBuild build = funcProjectBiz.codeBuildSelectByBuildId(buildId);
			if(build != null && !StringUtils.isNullOrEmpty(build.getFuncProjects())){
				procList = funcProjectBiz.funcProcedureSelectObjects(" where func_project_id in ("+build.getFuncProjects()+")");
			}
			newprocList = funcProjectBiz.funcProcedureSelectObjects(" where func_project_id in ("+build.getFuncProjects()+")");
			addprocList = funcProjectBiz.funcProcedureSelectObjects(" where func_project_id in ("+build.getFuncProjects()+")");
			List<TestProcedure> funcprocedureIds = funcProjectBiz.testProcedureSelectObjectsByBuildId(buildId);//查找构建下所有test函数标识
			List<CodeBuildProcedure> choosedfuncprocedureIds;
			if(funcprocedureIds != null){
				for(int i=0;i<funcprocedureIds.size();i++){
					int choosefuncprocedureId = funcprocedureIds.get(i).getFuncProcedureId();//根据funcprocedureId进行查找
					choosedfuncprocedureIds = funcProjectBiz.codeBuildProcedureSelectObjectsByFuncProcedureId(choosefuncprocedureId);//所有funcprocedureId函数
					for(int j=0;j<choosedfuncprocedureIds.size();j++){
						if(choosedfuncprocedureIds.get(j).getBuildId() == buildId){//根据构建标识比对
							int chooseproc = choosedfuncprocedureIds.get(j).getFuncProcedureId();
							FuncProcedure oneprocList = funcProjectBiz.funcProcedureSelectByFuncProcedureId(chooseproc);
							testprocedureId = funcprocedureIds.get(i).getTestProcedureId();
							oneprocList.setPub2(testprocedureId+"");//pub2中放TestprocedureId
							addprocList.add(oneprocList);
						}else{
							continue;
						}
					}
				}
			}
//			addprocList.remove(newprocList);
			for(int k=0;k<newprocList.size();k++){
				addprocList.remove(0);
			}
			procList = addprocList;
			for(int m=0; m<procList.size();m++){
				procList.get(m).setPub5("1");
			}
		}
		return procList;
	}
}
