package cn.topdeep.projgroup.action.work;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.biz.FuncProjectBiz;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.Privilege;
import cn.topdeep.projgroup.entity.base.PageImpl;
import cn.topdeep.projgroup.entity.db.FuncParams;
import cn.topdeep.projgroup.entity.db.FuncParamsExample;
import cn.topdeep.projgroup.entity.db.FuncProcedure;
import cn.topdeep.projgroup.entity.db.FuncProcedureExample;
import cn.topdeep.projgroup.entity.db.TestParamValue;

import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;

public class FuncProcedureList extends BaseAction {

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
		this.buildId = Integer.parseInt(buildId);
	}

	public String execute() throws Exception {
		if (!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Read)) {
			return NO_PRIVILEGES;
		}
		return SUCCESS;
	}

	/*
	 * save
	 */
	public String ajaxSave() throws Exception {
		if (!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Write)) {
			return NO_PRIVILEGES;
		}
		if (funcProcedure != null) {
			if (funcProcedure.getFuncProcedureId() != null && funcProcedure.getFuncProcedureId() > 0) {
				FuncProcedure proc = funcProjectBiz.funcProcedureSelectByPrimaryKey(funcProcedure.getFuncProcedureId());
				if (proc != null) {
					funcProcedure.setDeleted("0");
					funcProcedure.setOrderField(proc.getOrderField());
					funcProjectBiz.funcProcedureUpdate(funcProcedure);
				} else {
					funcProcedure = null;
				}
			} else {
				FuncProcedureExample condition = new FuncProcedureExample();
				condition.or().andFuncProjectIdEqualTo(funcProcedure.getFuncProjectId());
				condition.setPage(new PageImpl(0, 1));
				condition.setOrderByClause("ORDER_FIELD desc");
				FuncProcedure procedure = funcProjectBiz.selectSingleObject(funcProjectBiz.funcProcedureSelectObjects(condition));
				if (procedure != null) {
					funcProcedure.setOrderField(procedure.getOrderField() + 1);
				} else {
					funcProcedure.setOrderField(0);
				}

				funcProcedure.setDeleted("0");
				funcProjectBiz.funcProcedureInsert(funcProcedure);
			}
		}
		jsonObj = funcProcedure;
		return AJAX;
	}

	/*
	 * delete
	 */
	public String ajaxDelete() {
		if (!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Write)) {
			return NO_PRIVILEGES;
		}
		try {
			funcProjectBiz.funcProcedureDeleteToBinByFuncProcedureId(AFuncProcedureId);
			jsonObj = "ok";
		} catch (Exception ex) {
			jsonObj = ex.getMessage();
		}
		return AJAX;
	}

	/**
	 * funcProcedure上移
	 * 
	 * @return
	 * @throws CacheException
	 */
	public String ajaxMoveUp() throws CacheException {
		if (!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Write)) {
			return NO_PRIVILEGES;
		}
		try {
			funcProcedure = funcProjectBiz.funcProcedureSelectByPrimaryKey(AFuncProcedureId);
			FuncProcedureExample condition = new FuncProcedureExample();
			condition.or().andFuncProjectIdEqualTo(funcProcedure.getFuncProjectId()).andOrderFieldLessThan(funcProcedure.getOrderField());
			condition.setPage(new PageImpl(0, 1));
			condition.setOrderByClause("ORDER_FIELD desc");
			List<FuncProcedure> list = funcProjectBiz.funcProcedureSelectObjects(condition);
			FuncProcedure FuncProcedure_j = (FuncProcedure) list.get(0);
			int orderField = funcProcedure.getOrderField();
			funcProcedure.setOrderField(FuncProcedure_j.getOrderField());
			FuncProcedure_j.setOrderField(orderField);
			funcProjectBiz.beginTransaction();
			try {
				funcProjectBiz.funcProcedureUpdate(funcProcedure);
				funcProjectBiz.funcProcedureUpdate(FuncProcedure_j);
				funcProjectBiz.commitTransaction();
				jsonObj = "ok";
			} catch (Exception e) {
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
	 * 
	 * @return
	 * @throws CacheException
	 */
	public String ajaxMoveDown() throws CacheException {
		if (!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Write)) {
			return NO_PRIVILEGES;
		}
		try {
			funcProcedure = funcProjectBiz.funcProcedureSelectByPrimaryKey(AFuncProcedureId);
			FuncProcedureExample condition = new FuncProcedureExample();
			condition.or().andFuncProjectIdEqualTo(funcProcedure.getFuncProjectId()).andOrderFieldGreaterThan(funcProcedure.getOrderField());
			condition.setPage(new PageImpl(0, 1));
			condition.setOrderByClause("ORDER_FIELD asc");
			List<FuncProcedure> list = funcProjectBiz.funcProcedureSelectObjects(condition);
			FuncProcedure FuncProcedure_j = (FuncProcedure) list.get(0);
			int orderField = funcProcedure.getOrderField();
			funcProcedure.setOrderField(FuncProcedure_j.getOrderField());
			FuncProcedure_j.setOrderField(orderField);
			funcProjectBiz.beginTransaction();
			try {
				funcProjectBiz.funcProcedureUpdate(funcProcedure);
				funcProjectBiz.funcProcedureUpdate(FuncProcedure_j);
				funcProjectBiz.commitTransaction();
				jsonObj = "ok";
			} catch (Exception e) {
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
	public String paramslist() throws Exception {
		if (!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Read)) {
			return NO_PRIVILEGES;
		}
		// this.funcParamsList = this.funcParamsBiz.list();
		return SUCCESS;
	}

	/*
	 * deleteParams
	 */
	public String deletParams() throws Exception {
		if (!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Delete)) {
			return NO_PRIVILEGES;
		}
		this.funcParams = funcProjectBiz.funcParamsSelectByPrimaryKey(AparamsId);
		funcProjectBiz.funcParamsDeleteByPrimaryKey(AparamsId);
		FuncParamsExample condition = new FuncParamsExample();
		condition.or().andFuncProcedureIdEqualTo(funcParams.getFuncProcedureId());
		condition.setPage(new PageImpl(0, Integer.MAX_VALUE));
		condition.setOrderByClause("ORDER_FIELD asc");
		List<FuncParams> list = funcProjectBiz.funcParamsSelectObjects(condition);
		jsonObj = list;
		return AJAX;
	}

	/**
	 * funcParams上移
	 * 
	 * @return
	 * @throws CacheException
	 */
	public String ajaxMoveUpParams() throws CacheException {
		if (!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Write)) {
			return NO_PRIVILEGES;
		}
		try {
			boolean needResetOrder = false;
			funcParams = funcProjectBiz.funcParamsSelectByPrimaryKey(AparamsId);
			if (funcParams.getOrderField() == 0) {
				needResetOrder = true;
			}
			FuncParamsExample condition = new FuncParamsExample();
			condition.or().andFuncProcedureIdEqualTo(AFuncProcedureId).andParamDirectionEqualTo(funcParams.getParamDirection())
					.andOrderFieldLessThan(funcParams.getOrderField());
			condition.setPage(new PageImpl(0, Integer.MAX_VALUE));
			condition.setOrderByClause("ORDER_FIELD desc");
			List<FuncParams> list = funcProjectBiz.funcParamsSelectObjects(condition);
			if (list.size() > 0 && list.get(0).getOrderField() == 0) {
				needResetOrder = true;
			}
			if (!needResetOrder && list.size() > 0) {
				FuncParams FuncParamsj = (FuncParams) list.get(0);
				int orderField = funcParams.getOrderField();
				funcParams.setOrderField(FuncParamsj.getOrderField());
				FuncParamsj.setOrderField(orderField);
				funcProjectBiz.beginTransaction();
				try {
					funcProjectBiz.funcParamsUpdate(funcParams);
					funcProjectBiz.funcParamsUpdate(FuncParamsj);
					funcProjectBiz.commitTransaction();
					jsonObj = "ok";
				} catch (Exception e) {
					funcProjectBiz.rollBackTransaction();
					jsonObj = e.getMessage();
				}
			} else if (needResetOrder) {
				int k = 1;
				condition = new FuncParamsExample();
				condition.or().andFuncProcedureIdEqualTo(AFuncProcedureId);
				condition.setOrderByClause("PARAM_DIRECTION asc, ORDER_FIELD asc");
				List<FuncParams> orderlist = funcProjectBiz.funcParamsSelectObjects(condition);// 参数表
				for (FuncParams item : orderlist) {
					item.setOrderField(k++);
					funcProjectBiz.funcParamsUpdate(item);
				}
				jsonObj = "reset";
			} else {
				jsonObj = "unknown error";
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
			jsonObj = e1.getMessage();
		}
		return AJAX;
	}

	/**
	 * funcParams下移
	 * 
	 * @return
	 * @throws CacheException
	 */
	public String ajaxMoveDownParams() throws CacheException {
		if (!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Write)) {
			return NO_PRIVILEGES;
		}
		try {
			funcParams = funcProjectBiz.funcParamsSelectByPrimaryKey(AparamsId);
			FuncParamsExample condition = new FuncParamsExample();
			condition.or().andFuncProcedureIdEqualTo(funcParams.getFuncProcedureId()).andParamDirectionEqualTo(funcParams.getParamDirection())
					.andOrderFieldGreaterThan(funcParams.getOrderField());
			condition.setPage(new PageImpl(0, 1));
			condition.setOrderByClause("ORDER_FIELD asc");
			List<FuncParams> list = funcProjectBiz.funcParamsSelectObjects(condition);
			FuncParams FuncParamsj = (FuncParams) list.get(0);
			int orderField = funcParams.getOrderField();
			funcParams.setOrderField(FuncParamsj.getOrderField());
			FuncParamsj.setOrderField(orderField);
			funcProjectBiz.beginTransaction();
			try {
				funcProjectBiz.funcParamsUpdate(funcParams);
				funcProjectBiz.funcParamsUpdate(FuncParamsj);
				funcProjectBiz.commitTransaction();
				jsonObj = "ok";
			} catch (Exception e) {
				funcProjectBiz.rollBackTransaction();
				jsonObj = e.getMessage();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
			jsonObj = e1.getMessage();
		}
		return AJAX;
	}

	public String ajaxCopyParams() {
		if (!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Write)) {
			return NO_PRIVILEGES;
		}
		try {
			jsonObj = funcProjectBiz.funcParamsCopyByParamId(AparamsId);
		} catch (Exception ex) {
			jsonObj = ex.getMessage();
		}
		return AJAX;
	}

	public String ajaxCopyOtherParams() {
		if (!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Write)) {
			return NO_PRIVILEGES;
		}
		try {
			jsonObj = funcProjectBiz.funcParamsCopyByParamId(AparamsId, AFuncProcedureId);
		} catch (Exception ex) {
			jsonObj = ex.getMessage();
		}
		return AJAX;
	}

	public String ajaxDeleteParams() {
		if (!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Write)) {
			return NO_PRIVILEGES;
		}
		try {
			funcProjectBiz.funcParamsDeleteToBinByParamId(AparamsId);
			jsonObj = "ok";
		} catch (Exception ex) {
			jsonObj = ex.getMessage();
		}
		return AJAX;
	}

	public String ajaxSaveParams() throws DbException, SQLException, CacheException {
		if (!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Write)) {
			return NO_PRIVILEGES;
		}
		if (funcParams.getParamId() != null && funcParams.getParamId() > 0) {
			funcProjectBiz.funcParamsUpdate(funcParams);
		} else {
			FuncParamsExample condition = new FuncParamsExample();
			condition.or().andFuncProcedureIdEqualTo(funcParams.getFuncProcedureId());
			condition.setPage(new PageImpl(0, 1));
			condition.setOrderByClause("ORDER_FIELD desc");
			List<FuncParams> paramList = funcProjectBiz.funcParamsSelectObjects(condition);
			if (paramList.size() > 0) {
				funcParams.setOrderField(paramList.get(0).getOrderField() + 1);
			} else {
				funcParams.setOrderField(1);
			}
			funcParams.setDeleted("0");
			funcProjectBiz.funcParamsInsert(funcParams);
		}
		jsonObj = funcParams;
		return AJAX;
	}

	/*
	 * saveParams
	 */
	public String saveParams() throws Exception {
		if (!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Write)) {
			return NO_PRIVILEGES;
		}
		// funcParamsList=new ArrayList<FuncParams>();
		// funcProjectBiz.funcParamsInsert(funcParams);
		// this.funcParamsList = funcProjectBiz.funcParamsSelectObjectsByFuncProcedureId(funcParams.getFuncProcedureId());
		// jsonObj=funcParamsList;
		if (funcParams != null) {
			if (funcParams.getParamId() > 0) {
				funcProjectBiz.funcParamsUpdate(funcParams);
			} else {
				funcProjectBiz.funcParamsInsert(funcParams);
			}
		}
		FuncParamsExample condition = new FuncParamsExample();
		condition.or().andFuncProcedureIdEqualTo(funcParams.getFuncProcedureId());
		condition.setOrderByClause("ORDER_FIELD asc");
		condition.setPage(new PageImpl(0, Integer.MAX_VALUE));
		List<FuncParams> list = funcProjectBiz.funcParamsSelectObjects(condition);
		jsonObj = list;
		return AJAX;
	}

	/*
	 * updateParams
	 */
	public String updateParams() throws Exception {
		if (!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Write)) {
			return NO_PRIVILEGES;
		}
		funcProjectBiz.funcParamsUpdate(funcParams);
		FuncParamsExample condition = new FuncParamsExample();
		condition.or().andFuncProcedureIdEqualTo(funcParams.getFuncProcedureId());
		condition.setOrderByClause("ORDER_FIELD asc");
		condition.setPage(new PageImpl(0, Integer.MAX_VALUE));
		List<FuncParams> list = funcProjectBiz.funcParamsSelectObjects(condition);
		jsonObj = list;
		return AJAX;
	}

	/*
	 * ListParamsProcedrueId
	 */
	public String getList() throws Exception {
		if (!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Read)) {
			return NO_PRIVILEGES;
		}
		FuncParamsExample condition = new FuncParamsExample();
		condition.or().andFuncProcedureIdEqualTo(AFuncProcedureId).andDeletedEqualTo("0");
		condition.or().andFuncProcedureIdEqualTo(AFuncProcedureId).andDeletedIsNull();
		condition.setOrderByClause("PARAM_DIRECTION asc, ORDER_FIELD asc");
		// condition.setPage(new PageImpl(0, Integer.MAX_VALUE));
		List<FuncParams> list = funcProjectBiz.funcParamsSelectObjects(condition);
		jsonObj = list;
		return AJAX;
	}

	public String getParamList() throws Exception {
		if (!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Read)) {
			return NO_PRIVILEGES;
		}
		Map<String, Object> data = new HashMap<String, Object>();
		FuncParamsExample condition = new FuncParamsExample();
		condition.or().andFuncProcedureIdEqualTo(AFuncProcedureId).andDeletedEqualTo("0");
		condition.or().andFuncProcedureIdEqualTo(AFuncProcedureId).andDeletedIsNull();
		condition.setOrderByClause("PARAM_DIRECTION asc, ORDER_FIELD asc");
		// condition.setPage(new PageImpl(0, Integer.MAX_VALUE));
		List<FuncParams> list = funcProjectBiz.funcParamsSelectObjects(condition);
		// List<FuncTest> testList = new ArrayList<FuncTest>();//参数值
		// FuncTest paramTestValue;
		List<TestParamValue> testparamValueList = new ArrayList<TestParamValue>();
		TestParamValue testparamValue;
		for (int i = 0; i < list.size(); i++) {
			testparamValue = new TestParamValue();
			int paramId = list.get(i).getParamId();
			if (funcProjectBiz.testParamValueSelectByParamIdTestProcedureId(paramId, testprocedureId) != null) {
				testparamValue = funcProjectBiz.testParamValueSelectByParamIdTestProcedureId(paramId, testprocedureId);
				if (testparamValue.getTestValue() == null) {
					testparamValue.setTestValue("");
				}
				if (testparamValue.getTestValueDesc() == null) {
					testparamValue.setTestValueDesc("");
				}
			} else {
				testparamValue.setTestProcedureId(testprocedureId);
				testparamValue.setParamId(paramId);
				testparamValue.setTestValue(null);
				testparamValue.setTestValueDesc(null);
			}
			testparamValueList.add(testparamValue);
		}

		// for(int i=0;i<list.size();i++){//遍历参数列表
		// paramTestValue =new FuncTest();
		// int paramId=list.get(i).getParamId();//参数ID
		// if(funcProjectBiz.funcTestSelectByBuildIdParamId(buildId, paramId)!=null){
		// paramTestValue = funcProjectBiz.funcTestSelectByBuildIdParamId(buildId, paramId);
		// if(paramTestValue.getTestValue()==null){
		// paramTestValue.setTestValue("");
		// }
		// if(paramTestValue.getTestValueDesc()==null){
		// paramTestValue.setTestValueDesc("");
		// }
		// }else{
		// paramTestValue.setBuildId(buildId);
		// paramTestValue.setParamId(paramId);
		// paramTestValue.setTestValue(null);
		// paramTestValue.setTestValueDesc(null);
		// }
		// testList.add(paramTestValue);
		// }
		data.put("list", list);
		// data.put("testList", testList);
		data.put("testparamValueList", testparamValueList);
		jsonObj = data;
		return AJAX;
	}

	public FuncProcedure getFuncProcedure() throws DbException, SQLException, CacheException {
		if (funcProcedure == null && AFuncProcedureId > 0) {
			funcProcedure = funcProjectBiz.funcProcedureSelectByPrimaryKey(AFuncProcedureId);
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

	public FuncParams getFuncParams() throws DbException, SQLException, CacheException {
		if (funcParams == null && AparamsId > 0) {
			funcParams = funcProjectBiz.funcParamsSelectByPrimaryKey(AparamsId);
		}
		return funcParams;
	}

	public void setFuncParams(FuncParams funcParams) {
		this.funcParams = funcParams;
	}

	public List<FuncProcedure> getFuncprocedureList() throws DbException, SQLException, CacheException {
		if (funcprocedureList == null) {
			FuncProcedureExample condition = new FuncProcedureExample();
			condition.or().andFuncProjectIdEqualTo(funcProjectId).andDeletedEqualTo("0");
			condition.or().andFuncProjectIdEqualTo(funcProjectId).andDeletedIsNull();
			// condition.setOrderByClause("PARAM_DIRECTION asc, ORDER_FIELD asc");
			funcprocedureList = funcProjectBiz.funcProcedureSelectObjects(condition);
			// funcprocedureList = funcProjectBiz.funcProcedureSelectObjectsByFuncProjectId(funcProjectId);
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