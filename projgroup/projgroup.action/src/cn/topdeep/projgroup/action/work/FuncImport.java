package cn.topdeep.projgroup.action.work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.struts2.ServletActionContext;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.biz.FuncProjectBiz;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.FuncParams;
import cn.topdeep.projgroup.entity.FuncProcedure;
import cn.topdeep.projgroup.entity.FuncProcedureQueryCondition;

import com.sun.corba.se.spi.activation.Server;
import common.dbvisit.IDataVisit2;
import common.util.StringUtils;

public class FuncImport extends BaseAction {
	
	private static final int PARAM_DIRECTION_IN = 0;
	private static final int PARAM_DIRECTION_OUT = 1;
	private static final int PARAM_CATEGORY_NORMAL = 0;
	private static final int PARAM_CATEGORY_SET = 1;

	private static final String FUNC_CATEGORY = "FUNC_CATEGORY";
	private static final String COLUMN_IS_BUILD = "是否生成";
	private static final String COLUMN_CATEGORY = "类别";
	private static final String COLUMN_CODE = "代码";
	private static final String COLUMN_NAME = "名称";
	private static final String COLUMN_LENGTH = "长度";
	private static final String COLUMN_DECIMAL = "小数";
	private static final String COLUMN_TYPE = "类型";
	private static final String COLUMN_NOT_NULL = "非空";
	private static final String COLUMN_MEMO = "备注";
	private static final String COLUMN_DEFAULT_VALUE = "默认值";
	private static final String COLUMN_ALLOW_MODIFY = "允许修改";
	private static final String COLUMN_FUNC_CODE = "功能编号";
	private static final String COLUMN_TEST_VALUE = "测试值";

	private FuncProjectBiz funcProjectBiz;
	private IDataVisit2 dataVisit;
	private FuncParams params;
	private FuncProcedure funcProcedure;
	private int funcProjectId;
	private int deleteOldData;
	private String importType;
	private String importDataFlag;
	private File upload;

	private String sheetName;
	
	private String message = "";
	
	public int getDeleteOldData() {
		return deleteOldData;
	}

	public void setDeleteOldData(int deleteOldData) {
		this.deleteOldData = deleteOldData;
	}

	public String getImportType() {
		return importType;
	}

	public void setImportType(String importType) {
		this.importType = importType;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public int getFuncProjectId() {
		return funcProjectId;
	}

	public void setFuncProjectId(int funcProjectId) {
		this.funcProjectId = funcProjectId;
	}


	public FuncProcedure getFuncProcedure() {
		return funcProcedure;
	}

	public void setFuncProcedure(FuncProcedure funcProcedure) {
		this.funcProcedure = funcProcedure;
	}

	public IDataVisit2 getDataVisit() {
		return dataVisit;
	}

	public void setDataVisit(IDataVisit2 dataVisit) {
		this.dataVisit = dataVisit;
	}

	public FuncParams getParams() {
		return params;
	}

	public void setParams(FuncParams params) {
		this.params = params;
	}

	private FuncProcedure readProc(Map<String, String> dataMap){
		FuncProcedure func = new FuncProcedure();
		func.setFuncProjectId(funcProjectId);
		func.setFuncCode(dataMap.get(COLUMN_FUNC_CODE));
		if(StringUtils.isNullOrEmpty(dataMap.get(COLUMN_NOT_NULL))){
			func.setCacheTime(0);
		}else{
			func.setCacheTime(Integer.parseInt(dataMap.get(COLUMN_NOT_NULL)));
		}
		func.setProcCode(dataMap.get(COLUMN_CODE));
		func.setProcComment(dataMap.get(COLUMN_MEMO));
		func.setProcName(dataMap.get(COLUMN_NAME));
		func.setFuncCategory(dataMap.get(FUNC_CATEGORY));
		//procType 0 baseFunc 1 func 2 simple entity
		if(StringUtils.isNullOrEmpty(dataMap.get(COLUMN_TYPE))){
			if("base".equals(func.getProcCode())){
				func.setProcType(0);	
			}else{
				func.setProcType(1);
			}
		}else{
			func.setProcType(Integer.parseInt(dataMap.get(COLUMN_TYPE)));
		}
		func.setProcVersion(dataMap.get(COLUMN_DEFAULT_VALUE));
		return func;
	}
	
	private int readBoolValue(String value, int defaultValue){
		if(StringUtils.isNullOrEmpty(value)){
			return defaultValue;
		}
		if("y".equalsIgnoreCase(value) || "1".equalsIgnoreCase(value)){
			return 1;
		}else{
			return 0;
		}
	}
	
	private String readStringValue(String value, String defaultValue){
		if(StringUtils.isNullOrEmpty(value)){
			return defaultValue;
		}
		return value;
	}
	
	private int readIntegerValue(String value, int defaultValue){
		if(StringUtils.isNullOrEmpty(value)){
			return defaultValue;
		}
		return Integer.parseInt(value);
	}
	
	private FuncParams readParam(FuncProcedure func, Map<String, String> dataMap){
		FuncParams param = new FuncParams();
		param.setFuncProcedureId(func.getFuncProcedureId());
		param.setParamAllowModify(readBoolValue(dataMap.get(COLUMN_ALLOW_MODIFY), 1));
		//param.setParamCategory(value)
		param.setParamCode(dataMap.get(COLUMN_CODE));
		param.setParamComment(dataMap.get(COLUMN_MEMO));
		param.setParamDataDecimal(readIntegerValue(dataMap.get(COLUMN_DECIMAL), 0));
		param.setParamDataDefaultValue(dataMap.get(COLUMN_DEFAULT_VALUE));
		param.setParamDataLength(readIntegerValue(dataMap.get(COLUMN_LENGTH), 0));
		param.setParamDataNotNull(readBoolValue(dataMap.get(COLUMN_NOT_NULL), 0));
		param.setParamDataType(dataMap.get(COLUMN_TYPE));
//		param.setParamDirection(0);
		param.setParamName(dataMap.get(COLUMN_NAME));
//		param.setPub0(dataMap.get(COLUMN_FUNC_CODE));//Ios要使用
		return param;
	}
	
	private void importTopdeepData(List<Map<String, String>> data) throws Exception {
		if(data == null || data.size() <= 0){
			return;
		}
		String lastCategory = "";
		String realLastCategory = "";
		FuncProcedure func = null;
		FuncParams parentParam = null;
		Boolean firstReturnList = true;
		for(int i=0;i<data.size();i++){
			try{
				Map<String, String> dataMap = data.get(i);
				realLastCategory = dataMap.get(COLUMN_CATEGORY);
				lastCategory = StringUtils.isNullOrEmpty(realLastCategory)?lastCategory:realLastCategory;
				
				if ("功能".equals(lastCategory)) {
//					boolean needImport = false;
//					int buildFlag = Integer.parseInt(importDataFlag);
//					String buildFlagS = dataMap.get(COLUMN_IS_BUILD);
//					if(buildFlag == 0){
//						if(buildFlagS.length() > buildFlag){
//							buildFlag = buildFlagS.length() - buildFlag - 1;
//							if(buildFlagS.substring(buildFlag,buildFlag+1).equals("1")){
//								needImport = true;
//							}
//						}
//					}else{
//						int baseBuildFlag = 0;
//						boolean baseImport = false;
//						if(buildFlagS.length() > baseBuildFlag){
//							baseBuildFlag = buildFlagS.length() - baseBuildFlag - 1;
//							if(buildFlagS.substring(baseBuildFlag,baseBuildFlag+1).equals("1")){
//								baseImport = true;
//							}
//						}
//						if(!baseImport){
//							if(buildFlagS.length() > buildFlag){
//								buildFlag = buildFlagS.length() - buildFlag - 1;
//								if(buildFlagS.substring(buildFlag,buildFlag+1).equals("1")){
//									needImport = true;
//								}
//							}
//						}
//					}
//					if(!needImport){
//						func = null;
//						continue;
//					}
					
					// 迭代一行的每个单元格
					func = readProc(dataMap);
					
					//查找旧的函数，如果有的话
					if(func != null){
						FuncProcedure oldFunc = systemBiz.funcProcedureSelectSingleObject(new FuncProcedureQueryCondition().setFuncCodeConditionEqual(func.getFuncCode()).setProcVersionConditionEqual(func.getProcVersion()).setProcCodeConditionEqual(func.getProcCode()));
						if(oldFunc != null){
							func.setFuncProcedureId(oldFunc.getFuncProcedureId());
							funcProjectBiz.funcProcedureUpdate(func);
							funcProjectBiz.funcParamsDeleteListByFuncProcedureId(func.getFuncProcedureId());
						}else{
							funcProjectBiz.funcProcedureInsert(func);
						}
					}
					firstReturnList = true;
					continue;
				} 
				if(StringUtils.isNullOrEmpty(dataMap.get(COLUMN_CODE))){
					continue;
				}
				if(func == null){
					continue;
				}
				
				if("调用公共包".equals(lastCategory)){
					FuncParams param = readParam(func, dataMap);
					String defaultValue = dataMap.get(COLUMN_DEFAULT_VALUE);
					if(!StringUtils.isNullOrEmpty(defaultValue) && defaultValue.toLowerCase().startsWith("ic")){
						func.setFuncInputInterface(defaultValue);
						funcProjectBiz.funcProcedureUpdate(func);
						param.setParamDataDefaultValue("");
					}
					if(param != null){
						param.setParamDirection(PARAM_DIRECTION_IN);
						param.setParamCategory(PARAM_CATEGORY_NORMAL);
					}
					if(param != null){
						funcProjectBiz.funcParamsInsert(param);
					}
				}else if("调用私有包".equals(lastCategory)){
					FuncParams param = readParam(func, dataMap);
					String defaultValue = dataMap.get(COLUMN_DEFAULT_VALUE);
					if(!StringUtils.isNullOrEmpty(defaultValue) && defaultValue.toLowerCase().startsWith("ic")){
						func.setFuncInputInterface(defaultValue);
						funcProjectBiz.funcProcedureUpdate(func);
						param.setParamDataDefaultValue("");
					}
					if(param != null){
						param.setParamDirection(PARAM_DIRECTION_IN);
						param.setParamCategory(PARAM_CATEGORY_NORMAL);
					}
					if(param != null){
						funcProjectBiz.funcParamsInsert(param);
					}
				}else if("返回公共包".equals(lastCategory)){
					FuncParams param = readParam(func, dataMap);
					String defaultValue = dataMap.get(COLUMN_DEFAULT_VALUE);
					if(!StringUtils.isNullOrEmpty(defaultValue) && defaultValue.toLowerCase().startsWith("ic")){
						func.setFuncOutputInterface(defaultValue);
						funcProjectBiz.funcProcedureUpdate(func);
						param.setParamDataDefaultValue("");
					}

					if(param != null){
						param.setParamDirection(PARAM_DIRECTION_OUT);
						param.setParamCategory(PARAM_CATEGORY_NORMAL);
					}
					if(param != null){
						funcProjectBiz.funcParamsInsert(param);
					}
				}else if("返回私有包".equals(lastCategory) || "附加私有包".equals(lastCategory)){
					//对于返回私有包，需要插入一个参数用来表示该父参数
					if("返回私有包".equals(realLastCategory) || "附加私有包".equals(realLastCategory)){
						FuncParams param = new FuncParams();
						param.setFuncProcedureId(func.getFuncProcedureId());
						param.setParamAllowModify(0);
						param.setParamCategory(1);
						String s = readStringValue(dataMap.get(COLUMN_TEST_VALUE), "");
						if(firstReturnList){
							s = "detail";
							firstReturnList = false;
						}else{
							if(StringUtils.isNullOrEmpty(s)){
								s = "detail";
							}else{
								s += "Detail";
							}
						}
						param.setParamCode(s);
						param.setParamComment("");
						param.setParamDataDecimal(0);
						param.setParamDataDefaultValue(dataMap.get(COLUMN_DEFAULT_VALUE));
						param.setParamDataLength(0);
						param.setParamDataNotNull(1);
						String defaultValue = dataMap.get(COLUMN_DEFAULT_VALUE);
						if(!StringUtils.isNullOrEmpty(defaultValue) && defaultValue.toLowerCase().startsWith("ic")){
							param.setImplInterface(dataMap.get(COLUMN_DEFAULT_VALUE));
							param.setParamDataDefaultValue("");
						}
						param.setParamDataType(dataMap.get(COLUMN_FUNC_CODE));
						param.setParamDirection(1);
						param.setParamName("detail");
						//param.setPub0(dataMap.get(COLUMN_FUNC_CODE));
						funcProjectBiz.funcParamsInsert(param);
						parentParam = param;
					}
					FuncParams param = readParam(func, dataMap);
					String defaultValue = dataMap.get(COLUMN_DEFAULT_VALUE);
					if(!StringUtils.isNullOrEmpty(defaultValue) && defaultValue.toLowerCase().startsWith("ic")){
						param.setParamDataDefaultValue("");
					}
					
					if(param != null){
						param.setParentParamId(parentParam.getParamId());
						param.setParamDirection(PARAM_DIRECTION_OUT);
						param.setParamCategory(PARAM_CATEGORY_NORMAL);
					}
					if(param != null){
						funcProjectBiz.funcParamsInsert(param);
					}
				}else if("子参数说明".equals(lastCategory)){
					FuncParams param = readParam(func, dataMap);
					if(param != null){
						param.setParamDirection(PARAM_DIRECTION_OUT);
						param.setParamCategory(PARAM_CATEGORY_NORMAL);
					}
					if(param != null){
						funcProjectBiz.funcParamsInsert(param);
					}
				}
			}catch(Exception ex){
				message += "ex found at "+i;
				throw ex;
			}
		}
	}
	
	private FuncParams readSihuanParam(FuncProcedure func, Map<String, String> dataMap){
		FuncParams param = new FuncParams();
		param.setFuncProcedureId(func.getFuncProcedureId());
		param.setParamAllowModify(readBoolValue(dataMap.get(COLUMN_ALLOW_MODIFY), 1));
		param.setParamCode(dataMap.get(COLUMN_CODE));
		param.setParamComment(dataMap.get(COLUMN_MEMO));
		param.setParamDataDecimal(readIntegerValue(dataMap.get(COLUMN_DECIMAL), 0));
		param.setParamDataDefaultValue(dataMap.get(COLUMN_DEFAULT_VALUE));
		param.setParamDataLength(readIntegerValue(dataMap.get(COLUMN_LENGTH), 0));
		param.setParamDataNotNull(readBoolValue(dataMap.get(COLUMN_NOT_NULL), 0));
		param.setParamDataType(dataMap.get(COLUMN_TYPE));
		param.setParamName(dataMap.get(COLUMN_NAME));
		return param;
	}
	
	private FuncProcedure readSihuanProcedure(Map<String, String> dataMap){
		FuncProcedure func = new FuncProcedure();
		func.setFuncProjectId(funcProjectId);
		func.setFuncCode(dataMap.get(COLUMN_FUNC_CODE));
		func.setCacheTime(0);
		func.setProcCode(dataMap.get(COLUMN_CODE));
		func.setProcComment(dataMap.get(COLUMN_MEMO));
		func.setProcName(dataMap.get(COLUMN_NAME));
		func.setFuncCategory(dataMap.get(FUNC_CATEGORY));
		func.setProcType(1);
		return func;
	}
	
	private void importHuaanInterfaceData(List<Map<String, String>> data) throws Exception{
		if(data == null || data.size() <= 0){
			return;
		}
		String lastCategory = "";
		String realLastCategory = "";
		FuncProcedure func = null;
		FuncParams parentParam = null;
		for(int i=0;i<data.size();i++){
			try{
				Map<String, String> dataMap = data.get(i);
				realLastCategory = dataMap.get(COLUMN_CATEGORY);
				lastCategory = StringUtils.isNullOrEmpty(realLastCategory)?lastCategory:realLastCategory;
				
				if(StringUtils.isNullOrEmpty(dataMap.get(COLUMN_CODE))){
					continue;
				}
				if ("功能".equals(lastCategory)) {
					// 迭代一行的每个单元格
					func = readProc(dataMap);
					if(func != null){
						FuncProcedure oldFunc = systemBiz.funcProcedureSelectSingleObject(new FuncProcedureQueryCondition().setFuncCodeConditionEqual(func.getFuncCode()).setProcVersionConditionEqual(func.getProcVersion()).setProcCodeConditionEqual(func.getProcCode()));
						if(oldFunc != null){
							func.setFuncProcedureId(oldFunc.getFuncProcedureId());
							funcProjectBiz.funcProcedureUpdate(func);
							funcProjectBiz.funcParamsDeleteListByFuncProcedureId(func.getFuncProcedureId());
						}else{
							funcProjectBiz.funcProcedureInsert(func);
						}
					}
					continue;
				} 
				
				if("调用私有包".equals(lastCategory)){
					FuncParams param = readParam(func, dataMap);
					if(param != null){
						param.setParamDirection(PARAM_DIRECTION_IN);
						param.setParamCategory(PARAM_CATEGORY_NORMAL);
					}
					if(param != null){
						funcProjectBiz.funcParamsInsert(param);
					}
				}else if("返回公共包".equals(lastCategory)){
					FuncParams param = readParam(func, dataMap);
					if(param != null){
						param.setParamDirection(PARAM_DIRECTION_OUT);
						param.setParamCategory(PARAM_CATEGORY_NORMAL);
					}
					if(param != null){
						funcProjectBiz.funcParamsInsert(param);
					}
				}else if("返回私有包".equals(lastCategory) || "附加私有包".equals(lastCategory)){
					//对于返回私有包，需要插入一个参数用来表示该父参数
					if("返回私有包".equals(realLastCategory) || "附加私有包".equals(realLastCategory)){
						FuncParams param = new FuncParams();
						param.setFuncProcedureId(func.getFuncProcedureId());
						param.setParamAllowModify(0);
						param.setParamCategory(1);
						String s = readStringValue(dataMap.get(COLUMN_TEST_VALUE), "");
						if(StringUtils.isNullOrEmpty(s)){
							s = "detail";
						}else{
							s += "Detail";
						}
						param.setParamCode(s);
						param.setParamComment("");
						param.setParamDataDecimal(0);
						param.setParamDataDefaultValue(dataMap.get(COLUMN_TEST_VALUE));
						param.setParamDataLength(0);
						param.setParamDataNotNull(1);
						param.setParamDataType(dataMap.get(COLUMN_DEFAULT_VALUE));
						param.setParamDirection(1);
						param.setParamName("detail");
						funcProjectBiz.funcParamsInsert(param);
						parentParam = param;
					}
					FuncParams param = readParam(func, dataMap);
					if(param != null){
						param.setParentParamId(parentParam.getParamId());
						param.setParamDirection(PARAM_DIRECTION_OUT);
						param.setParamCategory(PARAM_CATEGORY_NORMAL);
					}
					if(param != null){
						funcProjectBiz.funcParamsInsert(param);
					}
				}
			}catch(Exception ex){
				message += "ex found at "+i;
				throw ex;
			}
		}
	}
	
	private void importSihuanInterfaceData(List<Map<String, String>> data) throws Exception {
		if(data == null || data.size() <= 0){
			return;
		}
		String lastCategory = "";
		String realLastCategory = "";
		FuncProcedure func = null;
		FuncParams parentParam = null;
		Map<String, FuncParams> paramMap = new HashMap<String, FuncParams>();
		for(int i=0;i<data.size();i++){
			try{
				Map<String, String> dataMap = data.get(i);
				lastCategory = dataMap.get(COLUMN_CATEGORY);
				
				
				if(StringUtils.isNullOrEmpty(dataMap.get(COLUMN_CODE))){
					continue;
				}
				
				if ("功能".equals(lastCategory)) {
					// 迭代一行的每个单元格
					func = readSihuanProcedure(dataMap);
					if(func != null){
						funcProjectBiz.funcProcedureInsert(func);
					}
					continue;
				} 
			
				
				if("调用公共包".equals(lastCategory)){
					FuncParams param = readSihuanParam(func, dataMap);
					if(param != null){
						param.setParamDirection(PARAM_DIRECTION_IN);
						param.setParamCategory(PARAM_CATEGORY_NORMAL);
					}
					if(param != null){
						dealSihuanInterfaceParentParam(paramMap, dataMap, param);
						
						funcProjectBiz.funcParamsInsert(param);
					}
				}else if("返回私有包".equals(lastCategory)){
					FuncParams param = readSihuanParam(func, dataMap);
					if(param != null){
						param.setParamDirection(PARAM_DIRECTION_OUT);
						param.setParamCategory(PARAM_CATEGORY_NORMAL);
					}
					if(param != null){
						dealSihuanInterfaceParentParam(paramMap, dataMap, param);
						funcProjectBiz.funcParamsInsert(param);
					}
				}else{
					FuncParams param = readSihuanParam(func, dataMap);
					for (int m = i - 1; m >= 0; m--) {
						if ("调用公共包".equals(data.get(m).get(COLUMN_CATEGORY))) {
							if(param != null){
								param.setParamDirection(PARAM_DIRECTION_IN);
								param.setParamCategory(PARAM_CATEGORY_NORMAL);
							}
							break;
						}else if("返回私有包".equals(data.get(m).get(COLUMN_CATEGORY))) {
							if(param != null){
								param.setParamDirection(PARAM_DIRECTION_OUT);
								param.setParamCategory(PARAM_CATEGORY_SET);
							}
							break;
						}else{
							continue;
						}
					}
					if(param != null){
						dealSihuanInterfaceParentParam(paramMap, dataMap, param);
						funcProjectBiz.funcParamsInsert(param);
					}
				}
			}catch(Exception ex){
				message += "ex found at "+i;
				throw ex;
			}
		}
	}

	/**
	 * 设置父参数
	 * */
	private void dealSihuanInterfaceParentParam(Map<String, FuncParams> paramMap, Map<String, String> dataMap,FuncParams param) {
		String paramIds = dataMap.get(COLUMN_FUNC_CODE);
		if (!StringUtils.isNullOrEmpty(paramIds)) {
			String[] paramIdAry = paramIds.toLowerCase().split("/");
			paramMap.put(paramIdAry[0], param);
			if (paramIdAry.length > 1) {
				String parentParamId = paramIdAry[1];
				FuncParams pparam = paramMap.get(parentParamId);
				if (pparam != null) {
					param.setParentParamId(pparam.getParamId());
				}
			}
		}
	}
	
	
	private String readCellStringValue(HSSFCell cell){
		if(cell == null) 
			return "";
		if(cell.getCellType() == HSSFCell.CELL_TYPE_BLANK){
			return "";
		}else if(cell.getCellType() == HSSFCell.CELL_TYPE_BOOLEAN){
			if(cell.getBooleanCellValue()){
				return "1";
			}else{
				return "0";
			}
		}else if(cell.getCellType() == HSSFCell.CELL_TYPE_ERROR){
			return "";
		}else if(cell.getCellType() == HSSFCell.CELL_TYPE_FORMULA){
			return cell.getStringCellValue().trim();
		}else if(cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC){
			return new DecimalFormat("#").format(cell.getNumericCellValue());
		}else if(cell.getCellType() == HSSFCell.CELL_TYPE_STRING){
			return cell.getStringCellValue().trim();
		}
		return "";
	}
	
	public String execute() throws Exception{
		return SUCCESS;
	}
	
	public String upload() throws Exception{
	    if(upload==null){
	        message = "文件选择不能为空";
	        return SUCCESS;
	    }
	    try{
	    	
		    InputStream in = new FileInputStream(upload);
		    HSSFWorkbook hw = new HSSFWorkbook(in);
		    List<Map<String, String>> data = new ArrayList<Map<String,String>>();
		    String[] importSheetNames = new String[]{};
		    if(!StringUtils.isNullOrEmpty(sheetName)){
		    	importSheetNames = sheetName.split(",");	
		    }else{
		    	List<String> sheetNameList = new ArrayList<String>();
		    	for(int i=0;i<hw.getNumberOfSheets();i++){
		    		sheetNameList.add(hw.getSheetName(i));
		    	}
		    	importSheetNames = (String[])sheetNameList.toArray(importSheetNames);
		    }
		    if(importSheetNames.length > 0){
		    	for(int i=0;i<importSheetNames.length;i++){
		    		HSSFSheet sheet = hw.getSheet(importSheetNames[i]);
		    		if(sheet == null){
		    			continue;
		    		}
					if(sheet.getLastRowNum()==0){
						continue;
					}

					String[] headNames = new String[sheet.getRow(0).getLastCellNum()+1];
					for(int j =0;j<=sheet.getLastRowNum();j++){
						HSSFRow row = sheet.getRow(j);
						if(j==0){
							for(int k=0;k<=row.getLastCellNum();k++){
								headNames[k] = readCellStringValue(row.getCell(k)).toLowerCase(); 
							}
						}else{
							Map<String, String> dataMap = new HashMap<String, String>();
							for(int k=0;k<=row.getLastCellNum();k++){
								if(k < headNames.length && !StringUtils.isNullOrEmpty(headNames[k])){
									dataMap.put(headNames[k], readCellStringValue(row.getCell(k)));
								}
							}
							dataMap.put(FUNC_CATEGORY, importSheetNames[i]);
							data.add(dataMap);
						}
					}
					
		    	}
		    	//delete old data
		    	if(deleteOldData==1){
		    		funcProjectBiz.clearFuncProject(funcProjectId);
		    	}
		    	
		    	//import 
		    	confirmImportType(data);
		    }else{
		    	//
		    	message="表格无Sheet表，请重新选择";
		    }
		    
	    }catch(Exception ex){
	    	message += "<br/>"+ex.getMessage();
	    	log.error("导入数据出错", ex);
	    }
	    
	    return SUCCESS;
	}
	
	private void confirmImportType(List<Map<String, String>> data)throws Exception{
		if("Topdeep".equals(importType)){
			importTopdeepData(data);
		}else if("Sihuan".equals(importType)){
			importSihuanInterfaceData(data);
		}else if("Huaan".equals(importType)){
			importHuaanInterfaceData(data);
		}
	}
	
	public String executeOld() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
	    response.setContentType("text/html;charSet=utf-8");
	    if(upload==null){
	        request.setAttribute("message", "文件选择不能为空");
	        return SUCCESS;
	    }
	    
	   try {
		    InputStream in = new FileInputStream(upload);
		    String sheetName=request.getParameter("sheetName");
		    String[] name=sheetName.split(",");
		    HSSFWorkbook hw = new HSSFWorkbook(in);

		    dataVisit.beginTransaction();
		    
		    
		  //判断导入制定SheetName的数据 如果不填写SheetName则导入整个Excel的所有Sheet页面数据
		   if(!sheetName.trim().equals("")){
			for (int i = 0; i < name.length; i++) {
				
			    // 迭代指定的Excel sheet页
				HSSFSheet sheet = hw.getSheet(name[i]);
				
				if(sheet==null){
					request.setAttribute("message", "输入的Sheet名字中有Excel内不存在的,请重新输入！");
					return SUCCESS;
				}
				
				//存放一页里面所有行ID
				int[] id=new int[sheet.getLastRowNum()+1];
				
				//判断页Sheet页是否无数据 无数据直接跳过
				if(sheet.getLastRowNum()==0){
					continue;
				}
				
				String[] head=new String[sheet.getRow(0).getLastCellNum()];
				// 迭代一页的每行
				for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++) {
					HSSFRow row = sheet.getRow(j);
					//取出每页第一行表头的值
					if(j==0){
						for(int k=row.getFirstCellNum();k<row.getLastCellNum();k++){
							if(row.getCell(k) != null){
								head[k]=row.getCell(k).getStringCellValue();
							}
						}
					}else if ("功能".equals(row.getCell(1).getStringCellValue())) {
						// 迭代一行的每个单元格
						funcProcedure = new FuncProcedure();
						// 迭代一行的每个单元格
						for (int n = 0; n < head.length; n++) {
							HSSFCell cell = row.getCell(n);
							funcProcedure.setFuncProjectId(funcProjectId);
							if (head[n].equals("是否生成") || head[n].equals("类别")) {
								continue;
							} else if (head[n].equals("代码")){
								if (cell==null || cell.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
									request.setAttribute("message", "参数代码不能为空");
									dataVisit.rollBackTransaction();
									return SUCCESS;
								}else if(cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
									funcProcedure.setProcCode(String.valueOf(cell.getNumericCellValue()));
								}else{
									funcProcedure.setProcCode(cell.getStringCellValue());
								}
							} else if (head[n].equals("名称")) {
								if(cell==null || cell.getCellType()==HSSFCell.CELL_TYPE_BLANK){
									funcProcedure.setProcName(null);
								}else if(cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
									funcProcedure.setProcName(String.valueOf(cell.getNumericCellValue()));
								}else{
									funcProcedure.setProcName(cell.getStringCellValue());
								}
							} else if (head[n].equals("功能编号")) {
								if(cell==null || cell.getCellType()==HSSFCell.CELL_TYPE_BLANK){
									funcProcedure.setFuncCode(null);
								}else if(cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
									funcProcedure.setFuncCode(String.valueOf(cell.getNumericCellValue()));
								}else{
									funcProcedure.setFuncCode(cell.getStringCellValue());
								}
							} else if (head[n].equals("备注")) {
								if(cell==null || cell.getCellType()==HSSFCell.CELL_TYPE_BLANK){
									funcProcedure.setProcComment(null);
								}else if(cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
									funcProcedure.setProcComment(String.valueOf(cell.getNumericCellValue()));
								}else{
									funcProcedure.setProcComment(cell.getStringCellValue());
								}
							} else {
								// 过程类型 0：通用 1：普通
								funcProcedure.setProcType(1);
							}
						}
						funcProjectBiz.funcProcedureInsert(funcProcedure);
						id[j]=funcProcedure.getFuncProcedureId();
					} else {
						params = new FuncParams();
						for (int n = 0; n < head.length; n++) {
							HSSFCell cell = row.getCell(n);
							if (head[n].equals("是否生成") || head[n].equals("类别")) {
								continue;
							} else if (head[n].equals("代码")) {
								
								// 参数代码
								if (cell==null || cell.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
									request.setAttribute("message", "参数代码不能为空");
									dataVisit.rollBackTransaction();
									return SUCCESS;
								}else if (cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
									params.setParamCode(String.valueOf(cell.getNumericCellValue()));
								}else{
									params.setParamCode(cell.getStringCellValue());
								}
							} else if (head[n].equals("名称")) {
								// 参数名称
								if(cell==null||cell.getCellType()==HSSFCell.CELL_TYPE_BLANK){
									params.setParamName(null);
								}else if(cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
									params.setParamName(String.valueOf(cell.getNumericCellValue()));
								}else{
									params.setParamName(cell.getStringCellValue());
								}
							} else if (head[n].equals("长度")) {
								// 数据类型长度
								if (cell==null || cell.getCellType()==HSSFCell.CELL_TYPE_BLANK) {
									params.setParamDataLength(0);
								}else{
									params.setParamDataLength((int) cell.getNumericCellValue());
								}
							} else if (head[n].equals( "小数")) {
								// 数据类型小数长度
								if (cell==null || cell.getCellType()==HSSFCell.CELL_TYPE_BLANK) {
									params.setParamDataDecimal(0);
								}else{
									params.setParamDataDecimal((int) cell.getNumericCellValue());
								}
							} else if (head[n].equals("类型")) {
								// 参数数据类型
								if (cell==null || cell.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
									request.setAttribute("message", "参数类型不能为空");
									dataVisit.rollBackTransaction();
									return SUCCESS;
								}else if (cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
									params.setParamDataType(String.valueOf(cell.getNumericCellValue()));
								}else{
									params.setParamDataType(cell.getStringCellValue());
								}
							} else if (head[n].equals("非空")) {
								// 参数是否可以为空 0：允许空 1：不允许空
								if(cell==null){
									params.setParamDataNotNull(0);
								}else{
									params.setParamDataNotNull(cell.getStringCellValue().equals("Y") ? 1: 0);
								}
							} else if (head[n].equals("默认值")) {
								// 参数默认值
								 if (cell==null || cell.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
									params.setParamDataDefaultValue(null);
								}else if (cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
									params.setParamDataDefaultValue(String.valueOf(cell.getNumericCellValue()));
								}else{
									params.setParamDataDefaultValue(cell.getStringCellValue());
								}
							} else if (head[n].equals("允许修改")) {
								// 参数允许修改 0：不允许 1：允许
								if (cell==null || cell.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
									params.setParamAllowModify(1);
								}else{
									params.setParamAllowModify((int) cell.getNumericCellValue());
								}
							} else if (head[n].equals("功能编号")) {
								// 参数父参数ID设置 0：无父参数
								if (cell==null ) {
									params.setParentParamId(0);
									continue;
								}
								String[] paramsName = cell.getStringCellValue().split("/");
								if(paramsName.length < 2){
									params.setParentParamId(0);
								}else{
									for(int m = j - 1; m > 0; m--){
									String[] parentParams=sheet.getRow(m).getCell(n).getStringCellValue().split("/");
									if(paramsName[1].equals(parentParams[0])){
										params.setParentParamId(id[m]);
										break;
										}
									}
								}
							} else if (head[n].equals("备注")) {
								// 参数说明
								if (cell==null || cell.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
									params.setParamComment(null);
								}else if (cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
									params.setParamComment(String.valueOf(cell.getNumericCellValue()));
								}else{
									params.setParamComment(cell.getStringCellValue());
								}
								
							}else {
									//设置参数类别和 参数方向 1：输入    0：输出
									if ("调用公共包".equals(row.getCell(1).getStringCellValue())) {
									params.setParamDirection(1);
									} else if ("返回私有包".equals(row.getCell(1).getStringCellValue())) {
										params.setParamDirection(0);
									}else {
										for (int m = j - 1; m > 0; m--) {
											if ("调用公共包".equals(sheet.getRow(m).getCell(1).getStringCellValue())) {
												params.setParamCategory(0);
												params.setParamDirection(1);
												break;
											} else if ("返回私有包".equals(sheet.getRow(m).getCell(1).getStringCellValue())) {
												params.setParamCategory(1);
												params.setParamDirection(0);
												break;
											}else{
												continue;
											}
										}
									}
									//设置函数FuncProcedureId
									for (int m = j - 1; m > 0; m--) {
										if("功能".equals(sheet.getRow(m).getCell(1).getStringCellValue())){
											params.setFuncProcedureId(id[m]);
											break;
										}
									}
							}

						}
						funcProjectBiz.funcParamsInsert(params);
						id[j]=params.getParamId();
					}
				}
			}
		   }else{
			   
			   //不填写Sheet 名字的默认导入整个Excel表所有数据
			   for (int i = 0; i < hw.getNumberOfSheets(); i++) {
				   
				    // 按顺序迭代Excel sheet页
					HSSFSheet sheet = hw.getSheetAt(i);
					
					//判断页Sheet页是否无数据 无数据直接跳过
					if(sheet.getLastRowNum()==0){
						continue;
					}
					//存放一页里面所有行ID
					int[] id=new int[sheet.getLastRowNum()+1];
					
					String[] head=new String[sheet.getRow(0).getLastCellNum()];
					// 迭代一页的每行
					for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++) {
						HSSFRow row = sheet.getRow(j);
						//取出每页第一行表头的值
						if(j==0){
							for(int k=row.getFirstCellNum();k<row.getLastCellNum();k++){
								head[k]=row.getCell(k).getStringCellValue();
							}
						}else if ("功能".equals(row.getCell(1).getStringCellValue())) {
						
							funcProcedure = new FuncProcedure();
							// 迭代一行的每个单元格
							for (int n = 0; n < head.length; n++) {
								HSSFCell cell = row.getCell(n);
								funcProcedure.setFuncProjectId(funcProjectId);
								if (head[n].equals("是否生成") || head[n].equals("类别")) {
									continue;
								} else if (head[n].equals("代码")){
									if (cell==null || cell.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
										request.setAttribute("message", "参数代码不能为空");
										dataVisit.rollBackTransaction();
										return SUCCESS;
									}else if(cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
										funcProcedure.setProcCode(String.valueOf(cell.getNumericCellValue()));
									}else{
										funcProcedure.setProcCode(cell.getStringCellValue());
									}
								} else if (head[n].equals("名称")) {
									if(cell==null || cell.getCellType()==HSSFCell.CELL_TYPE_BLANK){
										funcProcedure.setProcName(null);
									}else if(cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
										funcProcedure.setProcName(String.valueOf(cell.getNumericCellValue()));
									}else{
										funcProcedure.setProcName(cell.getStringCellValue());
									}
								} else if (head[n].equals("功能编号")) {
									if(cell==null || cell.getCellType()==HSSFCell.CELL_TYPE_BLANK){
										funcProcedure.setFuncCode(null);
									}else if(cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
										funcProcedure.setFuncCode(String.valueOf(cell.getNumericCellValue()));
									}else{
										funcProcedure.setFuncCode(cell.getStringCellValue());
									}
								} else if (head[n].equals("备注")) {
									if(cell==null || cell.getCellType()==HSSFCell.CELL_TYPE_BLANK){
										funcProcedure.setProcComment(null);
									}else if(cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
										funcProcedure.setProcComment(String.valueOf(cell.getNumericCellValue()));
									}else{
										funcProcedure.setProcComment(cell.getStringCellValue());
									}
								} else {
									// 过程类型 0：通用 1：普通
									funcProcedure.setProcType(1);
								}
							}
							funcProjectBiz.funcProcedureInsert(funcProcedure);
							id[j]=funcProcedure.getFuncProcedureId();
						} else {
							params = new FuncParams();
							for (int n = 0; n < head.length; n++) {
								HSSFCell cell = row.getCell(n);
								if (head[n].equals("是否生成") || head[n].equals("类别")) {
									continue;
								} else if (head[n].equals("代码")) {
									
									// 参数代码
									if (cell==null || cell.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
										request.setAttribute("message", "参数代码不能为空");
										dataVisit.rollBackTransaction();
										return SUCCESS;
									}else if (cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
										params.setParamCode(String.valueOf(cell.getNumericCellValue()));
									}else{
										params.setParamCode(cell.getStringCellValue());
									}
								} else if (head[n].equals("名称")) {
									// 参数名称
									if(cell==null||cell.getCellType()==HSSFCell.CELL_TYPE_BLANK){
										params.setParamName(null);
									}else if(cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
										params.setParamName(String.valueOf(cell.getNumericCellValue()));
									}else{
										params.setParamName(cell.getStringCellValue());
									}
								} else if (head[n].equals("长度")) {
									// 数据类型长度
									if (cell==null || cell.getCellType()==HSSFCell.CELL_TYPE_BLANK) {
										params.setParamDataLength(0);
									}else{
										params.setParamDataLength((int) cell.getNumericCellValue());
									}
								} else if (head[n].equals( "小数")) {
									// 数据类型小数长度
									if (cell==null || cell.getCellType()==HSSFCell.CELL_TYPE_BLANK) {
										params.setParamDataDecimal(0);
									}else{
										params.setParamDataDecimal((int) cell.getNumericCellValue());
									}
								} else if (head[n].equals("类型")) {
									// 参数数据类型
									if (cell==null || cell.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
										request.setAttribute("message", "参数类型不能为空");
										dataVisit.rollBackTransaction();
										return SUCCESS;
									}else if (cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
										params.setParamDataType(String.valueOf(cell.getNumericCellValue()));
									}else{
										params.setParamDataType(cell.getStringCellValue());
									}
								} else if (head[n].equals("非空")) {
									// 参数是否可以为空 0：允许空 1：不允许空
									if(cell==null){
										params.setParamDataNotNull(0);
									}else{
										params.setParamDataNotNull(cell.getStringCellValue().equals("Y") ? 1: 0);
									}
								} else if (head[n].equals("默认值")) {
									// 参数默认值
									 if (cell==null || cell.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
										params.setParamDataDefaultValue(null);
									}else if (cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
										params.setParamDataDefaultValue(String.valueOf(cell.getNumericCellValue()));
									}else{
										params.setParamDataDefaultValue(cell.getStringCellValue());
									}
								} else if (head[n].equals("允许修改")) {
									// 参数允许修改 0：不允许 1：允许
									if (cell==null || cell.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
										params.setParamAllowModify(1);
									}else{
										params.setParamAllowModify((int) cell.getNumericCellValue());
									}
								} else if (head[n].equals("功能编号")) {
									// 参数父参数ID设置 0：无父参数
									if (cell==null ) {
										params.setParentParamId(0);
										continue;
									}
									String[] paramsName = cell.getStringCellValue().split("/");
									if(paramsName.length < 2){
										params.setParentParamId(0);
									}else{
										for(int m = j - 1; m > 0; m--){
										String[] parentParams=sheet.getRow(m).getCell(n).getStringCellValue().split("/");
										if(paramsName[1].equals(parentParams[0])){
											params.setParentParamId(id[m]);
											break;
											}
										}
									}
								} else if (head[n].equals("备注")) {
									// 参数说明
									if (cell==null || cell.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
										params.setParamComment(null);
									}else if (cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
										params.setParamComment(String.valueOf(cell.getNumericCellValue()));
									}else{
										params.setParamComment(cell.getStringCellValue());
									}
									
								}else {
										//设置参数类别和 参数方向 1：输入    0：输出
										if ("调用公共包".equals(row.getCell(1).getStringCellValue())) {
										params.setParamDirection(1);
										} else if ("返回私有包".equals(row.getCell(1).getStringCellValue())) {
											params.setParamDirection(0);
										}else {
											for (int m = j - 1; m > 0; m--) {
												if ("调用公共包".equals(sheet.getRow(m).getCell(1).getStringCellValue())) {
													params.setParamCategory(0);
													params.setParamDirection(1);
													break;
												} else if ("返回私有包".equals(sheet.getRow(m).getCell(1).getStringCellValue())) {
													params.setParamCategory(1);
													params.setParamDirection(0);
													break;
												}else{
													continue;
												}
											}
										}
										//设置函数FuncProcedureId
										for (int m = j - 1; m > 0; m--) {
											if("功能".equals(sheet.getRow(m).getCell(1).getStringCellValue())){
												params.setFuncProcedureId(id[m]);
												break;
											}
										}
								}

							}
							funcProjectBiz.funcParamsInsert(params);
							id[j]=params.getParamId();
						}
					}
				}
		
		   }
			dataVisit.commitTransaction();
	    	request.setAttribute("message", "导入成功");
			in.close();
		} catch (Exception e) {
			dataVisit.rollBackTransaction();
			e.printStackTrace();
			request.setAttribute("message", "导入失败出现异常！");
		} 
			return SUCCESS;
	}
	
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return the sheetName
	 */
	public String getSheetName() {
		return sheetName;
	}

	/**
	 * @param sheetName the sheetName to set
	 */
	public void setSheetName(String sheetName) {
		this.sheetName = sheetName;
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

	/**
	 * @return the importDataFlag
	 */
	public String getImportDataFlag() {
		return importDataFlag;
	}

	/**
	 * @param importDataFlag the importDataFlag to set
	 */
	public void setImportDataFlag(String importDataFlag) {
		this.importDataFlag = importDataFlag;
	}
}
