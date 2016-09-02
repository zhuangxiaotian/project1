package cn.topdeep.projgroup.action.work;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.biz.FuncProjectBiz;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.FuncParams;
import cn.topdeep.projgroup.entity.FuncProcedure; 
import cn.topdeep.projgroup.entity.TestParamValue;

public class FuncProcedureList extends  BaseAction{
  
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private FuncProjectBiz funcProjectBiz;
	private FuncProcedure funcProcedure;
	private FuncParams funcParams;
	private List<FuncProcedure> funcprocedureList;
	private int AFuncProcedureId;
	private int funcProjectId;
	private int AparamsId;
	private int buildId;
	private int testprocedureId;
	
	public int getTestprocedureId() {
		return testprocedureId;
	}
	public void setTestprocedureId(int testprocedureId) {
		this.testprocedureId = testprocedureId;
	}
	public int getBuildId() {
		return buildId;
	}
	public void setBuildId(String buildId) {
		this.buildId =Integer.parseInt(buildId);
	}
	public String execute() throws Exception{
		return SUCCESS;
	}
	/*
	 * save
	 */
	public String ajaxSave() throws Exception{ 
		if(funcProcedure != null){
			if(funcProcedure.getFuncProcedureId() > 0){
				funcProjectBiz.funcProcedureUpdate(funcProcedure); 
			}else{
				FuncProcedure procedure = funcProjectBiz.funcProcedureSelectObjects(" where FUNC_PROJECT_ID = "+funcProcedure.getFuncProjectId(), 0, 1, "ORDER_FIELD", "desc").get(0); 
				funcProcedure.setOrderField(procedure.getOrderField()+1);
				funcProjectBiz.funcProcedureInsert(funcProcedure);
			}
		}
		jsonObj = funcProcedure;
		return AJAX;
	}
	/*
	 * delete
	 */
	public String ajaxDelete(){
		try{
			funcProjectBiz.funcProcedureDeleteByFuncProcedureId(AFuncProcedureId); 
			jsonObj ="ok";
		}catch(Exception ex){ 
			jsonObj =ex.getMessage();
		} 
		return AJAX;
	}
	/**
	 * funcProcedure上移
	 * @return
	 */
	public String ajaxMoveUp(){   
		 try {	 
			 funcProcedure = funcProjectBiz.funcProcedureSelectByFuncProcedureId(AFuncProcedureId); 	
	           List<FuncProcedure> list = funcProjectBiz.funcProcedureSelectObjects(" where FUNC_PROJECT_ID = "+funcProcedure.getFuncProjectId()+" and ORDER_FIELD < "+funcProcedure.getOrderField(), 0, 1, "ORDER_FIELD", "desc"); 	
	           FuncProcedure FuncProcedure_j = (FuncProcedure) list.get(0);	
	           int orderField = funcProcedure.getOrderField(); 	
	           funcProcedure.setOrderField(FuncProcedure_j.getOrderField());	
	           FuncProcedure_j.setOrderField(orderField);
		       funcProjectBiz.beginTransaction();	 
		       try{ 	 
		           funcProjectBiz.funcProcedureUpdate(funcProcedure);
		           funcProjectBiz.funcProcedureUpdate(FuncProcedure_j);   
		           funcProjectBiz.commitTransaction();	
		           jsonObj = "ok";	
		       }catch(Exception e){
		           funcProjectBiz.rollBackTransaction();	
		           jsonObj = e.getMessage();	
		       }	
		} catch (SQLException e1) { 	
		      e1.printStackTrace();	
		      jsonObj = e1.getMessage();	
		} 	
		return AJAX;	
	}	
	/**
	 * funcProcedure下移
	 * @return
	 */
	public String ajaxMoveDown(){    	
		try { 	
			 funcProcedure = funcProjectBiz.funcProcedureSelectByFuncProcedureId(AFuncProcedureId);  	
	         List<FuncProcedure> list = funcProjectBiz.funcProcedureSelectObjects(" where FUNC_PROJECT_ID = "+funcProcedure.getFuncProjectId()+" and ORDER_FIELD > "+funcProcedure.getOrderField(), 0, 1, "ORDER_FIELD", "asc"); 	
	         FuncProcedure FuncProcedure_j = (FuncProcedure) list.get(0);	
	         int orderField = funcProcedure.getOrderField(); 	
	         funcProcedure.setOrderField(FuncProcedure_j.getOrderField());
	         FuncProcedure_j.setOrderField(orderField);	
		     funcProjectBiz.beginTransaction();	
		     try{ 	 
		         funcProjectBiz.funcProcedureUpdate(funcProcedure);
		         funcProjectBiz.funcProcedureUpdate(FuncProcedure_j);   
		         funcProjectBiz.commitTransaction();
		         jsonObj = "ok";	
		    }catch(Exception e){	 
		         funcProjectBiz.rollBackTransaction();	
		         jsonObj = e.getMessage();	
		    }	
		} catch (SQLException e1) { 	
		       e1.printStackTrace();	
		       jsonObj = e1.getMessage();	
		} 	
		return AJAX;	
	}

	/**
	 * FuncParamsBiz menthod
	 */
	public String paramslist() throws Exception{
//		this.funcParamsList = this.funcParamsBiz.list();
		return SUCCESS;
	}
	/*
	 * deleteParams
	 */
	public String deletParams() throws Exception{
		this.funcParams = funcProjectBiz.funcParamsSelectByParamId(AparamsId); 
		funcProjectBiz.funcParamsDeleteByParamId(AparamsId);
		List<FuncParams> list = funcProjectBiz.funcParamsSelectObjects(" where FUNC_PROCEDURE_ID = "+funcParams.getFuncProcedureId(), 0, Integer.MAX_VALUE, "ORDER_FIELD", "asc");
		jsonObj=list;
		return AJAX;
	}
	/**
	 * funcParams上移
	 * @return
	 */
	public String ajaxMoveUpParams(){   	
		try { 	
			funcParams = funcProjectBiz.funcParamsSelectByParamId(AparamsId); 	
		    List<FuncParams> list = funcProjectBiz.funcParamsSelectObjects(" where FUNC_PROCEDURE_ID = "+AFuncProcedureId+" and ORDER_FIELD < "+funcParams.getOrderField(), 0, Integer.MAX_VALUE, "ORDER_FIELD", "desc");    	
		    FuncParams FuncParamsj = (FuncParams) list.get(0);	
		    int orderField = funcParams.getOrderField(); 	
		    funcParams.setOrderField(FuncParamsj.getOrderField());	
		    FuncParamsj.setOrderField(orderField);	
		    funcProjectBiz.beginTransaction();	
		    try{  	 
		       funcProjectBiz.funcParamsUpdate(funcParams);	
		       funcProjectBiz.funcParamsUpdate(FuncParamsj);   	
		       funcProjectBiz.commitTransaction();	
		       jsonObj = "ok";	
		    }catch(Exception e){	
		       funcProjectBiz.rollBackTransaction();	
		       jsonObj = e.getMessage();	
		    }	
		                     	
		} catch (SQLException e1) { 	
		     e1.printStackTrace();	
		     jsonObj = e1.getMessage();	
		}  	
		return AJAX;	
	}	
	/**
	 * funcParams下移      
	 * @return
	 */
	public String ajaxMoveDownParams(){   	
		try { 	
			funcParams = funcProjectBiz.funcParamsSelectByParamId(AparamsId);  
	        List<FuncParams> list = funcProjectBiz.funcParamsSelectObjects(" where FUNC_PROCEDURE_ID = "+funcParams.getFuncProcedureId()+" and ORDER_FIELD > "+funcParams.getOrderField(), 0, 1, "ORDER_FIELD", "asc");   	
	        FuncParams FuncParamsj = (FuncParams) list.get(0);	
	        int orderField = funcParams.getOrderField(); 	
	        funcParams.setOrderField(FuncParamsj.getOrderField());	
	        FuncParamsj.setOrderField(orderField);	
		    funcProjectBiz.beginTransaction();	
		    try{  	 
		        funcProjectBiz.funcParamsUpdate(funcParams);	
		        funcProjectBiz.funcParamsUpdate(FuncParamsj);   	
		        funcProjectBiz.commitTransaction();	
		        jsonObj = "ok";	
		    }catch(Exception e){	
		        funcProjectBiz.rollBackTransaction();	
		        jsonObj =e.getMessage();	
		    }	
		} catch (SQLException e1) { 	
		    e1.printStackTrace();	
		    jsonObj = e1.getMessage();	
		}  	
		return AJAX; 	
	}
	public String ajaxDeleteParams(){
		try{
			funcProjectBiz.funcParamsDeleteByParamId(AparamsId);
			jsonObj = "ok";
		}catch(Exception ex){
			jsonObj = ex.getMessage();
		}
		return AJAX;
	}
	
	public String ajaxSaveParams() throws DbException, SQLException{
		if(funcParams.getParamId() > 0){
			funcProjectBiz.funcParamsUpdate(funcParams);  
		}else{
			FuncParams funcParams_i =  funcProjectBiz.funcParamsSelectObjects(" where FUNC_PROCEDURE_ID = "+funcParams.getFuncProcedureId(), 0, 1, "ORDER_FIELD", "desc").get(0);
			funcParams.setOrderField(funcParams_i.getOrderField()+1);
			funcProjectBiz.funcParamsInsert(funcParams);
		}  
		jsonObj = funcParams;
		return AJAX;
	}
	
	/*
	 * saveParams
	 */
	public String saveParams() throws Exception{
//		funcParamsList=new ArrayList<FuncParams>();
//		funcProjectBiz.funcParamsInsert(funcParams);
//		this.funcParamsList = funcProjectBiz.funcParamsSelectObjectsByFuncProcedureId(funcParams.getFuncProcedureId());
//		jsonObj=funcParamsList;
		if(funcParams != null){
			if(funcParams.getParamId() > 0){
				funcProjectBiz.funcParamsUpdate(funcParams);
			}else{
				funcProjectBiz.funcParamsInsert(funcParams);
			}
		}
		 List<FuncParams> list = funcProjectBiz.funcParamsSelectObjects(" where FUNC_PROCEDURE_ID = "+funcParams.getFuncProcedureId(), 0, Integer.MAX_VALUE, "ORDER_FIELD", "asc");
		jsonObj=list;
		return AJAX;
	}
	/*
	 * updateParams
	 */
	public String updateParams() throws Exception{
		funcProjectBiz.funcParamsUpdate(funcParams);
		 List<FuncParams> list = funcProjectBiz.funcParamsSelectObjects(" where FUNC_PROCEDURE_ID = "+funcParams.getFuncProcedureId(), 0, Integer.MAX_VALUE, "ORDER_FIELD", "asc");
		jsonObj=list;
		return AJAX;
	}
	/*
	 * ListParamsProcedrueId
	 */
	public String getList() throws Exception{
		List<FuncParams> list = funcProjectBiz.funcParamsSelectObjects(" where FUNC_PROCEDURE_ID = "+AFuncProcedureId, 0, Integer.MAX_VALUE, "ORDER_FIELD", "asc");
		jsonObj = list;
		return AJAX;
	}
	
	public String getParamList() throws Exception{
		Map<String,Object> data=new HashMap<String, Object>();
		 List<FuncParams> list = funcProjectBiz.funcParamsSelectObjects(" where FUNC_PROCEDURE_ID = "+AFuncProcedureId, 0, Integer.MAX_VALUE, "ORDER_FIELD", "asc");//参数表
//		List<FuncTest>  testList = new ArrayList<FuncTest>();//参数值
//		FuncTest paramTestValue;
		List<TestParamValue> testparamValueList = new ArrayList<TestParamValue>();
		TestParamValue testparamValue;
		for(int i=0;i<list.size();i++){
			testparamValue = new TestParamValue();
			int paramId = list.get(i).getParamId();
			if(funcProjectBiz.testParamValueSelectByTestProcedureIdParamId(testprocedureId, paramId)!=null){
				testparamValue = funcProjectBiz.testParamValueSelectByTestProcedureIdParamId(testprocedureId, paramId);
				if(testparamValue.getTestValue()==null){
					testparamValue.setTestValue("");
				}
				if(testparamValue.getTestValueDesc()==null){
					testparamValue.setTestValueDesc("");
				}
			}else{
				testparamValue.setTestProcedureId(testprocedureId);
				testparamValue.setParamId(paramId);
				testparamValue.setTestValue(null);
				testparamValue.setTestValueDesc(null);
			}
			testparamValueList.add(testparamValue);
		}
		
//		for(int i=0;i<list.size();i++){//遍历参数列表
//			paramTestValue =new FuncTest();
//			int paramId=list.get(i).getParamId();//参数ID
//			if(funcProjectBiz.funcTestSelectByBuildIdParamId(buildId, paramId)!=null){
//				paramTestValue = funcProjectBiz.funcTestSelectByBuildIdParamId(buildId, paramId);
//				if(paramTestValue.getTestValue()==null){
//					paramTestValue.setTestValue("");
//				}
//				if(paramTestValue.getTestValueDesc()==null){
//					paramTestValue.setTestValueDesc("");
//				}
//			}else{
//				paramTestValue.setBuildId(buildId);
//				paramTestValue.setParamId(paramId);
//				paramTestValue.setTestValue(null);
//				paramTestValue.setTestValueDesc(null);
//			}
//			testList.add(paramTestValue);
//		}
		data.put("list", list);
//		data.put("testList", testList);
		data.put("testparamValueList", testparamValueList);
		jsonObj = data;
		return AJAX;
	}
	
	public FuncProcedure getFuncProcedure() throws DbException, SQLException {
		if(funcProcedure == null && AFuncProcedureId > 0){
			funcProcedure = funcProjectBiz.funcProcedureSelectByFuncProcedureId(AFuncProcedureId);
		}
		return funcProcedure;
	}
	
	public void setFuncProcedure(FuncProcedure funcProcedure) {
		this.funcProcedure = funcProcedure;
	}
	
	public int getAFuncProcedureId() {
		return AFuncProcedureId;
	}
	
	public void setAFuncProcedureId(int aFuncProcedureId) {
		AFuncProcedureId = aFuncProcedureId;
	}
	
	public FuncProjectBiz getFuncProjectBiz() {
		return funcProjectBiz;
	}
	
	public void setFuncProjectBiz(FuncProjectBiz funcProjectBiz) {
		this.funcProjectBiz = funcProjectBiz;
	}
	
	public int getAparamsId() {
		return AparamsId;
	}
	
	public void setAparamsId(int aparamsId) {
		AparamsId = aparamsId;
	}
	
	public FuncParams getFuncParams() throws DbException, SQLException {
		if(funcParams == null && AparamsId > 0){
			funcParams = funcProjectBiz.funcParamsSelectByParamId(AparamsId);
		}
		return funcParams;
	}
	
	public void setFuncParams(FuncParams funcParams) {
		this.funcParams = funcParams;
	}

	public List<FuncProcedure> getFuncprocedureList() throws DbException, SQLException {
		if(funcprocedureList == null){
			funcprocedureList = funcProjectBiz.funcProcedureSelectObjectsByFuncProjectId(funcProjectId); 
		}
		return funcprocedureList;
	}

	public int getFuncProjectId() {
		return funcProjectId;
	}
	
	public void setFuncProjectId(int funcProjectId) {
		this.funcProjectId = funcProjectId;
	}
	
	
}