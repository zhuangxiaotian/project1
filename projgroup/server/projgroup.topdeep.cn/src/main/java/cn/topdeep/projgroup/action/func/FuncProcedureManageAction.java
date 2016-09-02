/**
 * 
 */
package cn.topdeep.projgroup.action.func;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.topdeep.projgroup.action.base.BaseAction;
import cn.topdeep.projgroup.entity.Privilege;
import cn.topdeep.projgroup.entity.db.FuncParams;
import cn.topdeep.projgroup.entity.db.FuncParamsExample;
import cn.topdeep.projgroup.entity.db.FuncProcedure;
import cn.topdeep.projgroup.entity.db.FuncProcedureExample;
import cn.topdeep.projgroup.entity.request.FuncProcedureRequest;
import cn.topdeep.projgroup.entity.response.BaseResponse;
import cn.topdeep.projgroup.entity.response.FuncProcedureResponse;

import common.privilege.PrivilegeOperate;

/**
 * @author niexin
 *
 */
@Controller
@RequestMapping(value = {
	"/func"
})
public class FuncProcedureManageAction extends BaseAction {
	@RequestMapping(value = "FuncProcedureManage", method = {
			RequestMethod.GET, RequestMethod.POST
	})
	public String execute(FuncProcedureRequest req, Model model) {
		FuncProcedureResponse res = new FuncProcedureResponse();
		model.addAttribute("res", res);
		if (!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Read)) {
			res.setResult(false, "没有权限");
		}
		req.checkQueryInput(res);
		if (res.isSuccess()) {
			res.setFuncProjectId(req.getFuncProjectId());
			return "/" + res.getSkin() + "/func/func-procedure-success";
		} else {
			return "";
		}

	}

	@RequestMapping(value = {
		"FuncProcedureManage!ajaxQuery"
	}, method = {
			RequestMethod.GET, RequestMethod.POST
	})
	@ResponseBody
	public FuncProcedureResponse ajaxQuery(FuncProcedureRequest req) {
		FuncProcedureResponse res = new FuncProcedureResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Read)) {
			res.setResult(false, "没有权限");
		}
		if (res.isSuccess()) {
			req.checkQueryInput(res);
		}

		if (res.isSuccess()) {
			try {
				FuncProcedureExample condition = new FuncProcedureExample();
				condition.or().andFuncProjectIdEqualTo(req.getFuncProjectId()).andDeletedEqualTo("0");
				condition.or().andFuncProjectIdEqualTo(req.getFuncProjectId()).andDeletedIsNull();
				List<FuncProcedure> list = funcProjectBiz.funcProcedureSelectObjects(condition);
				res.setProcedureList(list);
				res.setSuccess(true);
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
				logger.error("FuncProcedureManage!ajaxQuery error: " + e.getMessage(), e);
			}
		}
		return res;
	}

	@RequestMapping(value = {
		"FuncProcedureManage!ajaxParamsQuery"
	}, method = {
			RequestMethod.GET, RequestMethod.POST
	})
	@ResponseBody
	public FuncProcedureResponse ajaxParamsQuery(FuncProcedureRequest req) {
		FuncProcedureResponse res = new FuncProcedureResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Read)) {
			res.setResult(false, "没有权限");
		}
		if (res.isSuccess()) {
			req.checkParamsQueryInput(res);
		}

		if (res.isSuccess()) {
			try {
				FuncParamsExample condition = new FuncParamsExample();
				cn.topdeep.projgroup.entity.db.FuncParamsExample.Criteria criteria1 = condition.or().andFuncProcedureIdEqualTo(req.getFuncProcedureId());
				cn.topdeep.projgroup.entity.db.FuncParamsExample.Criteria criteria2 = condition.or().andFuncProcedureIdEqualTo(req.getFuncProcedureId());
				if (!req.isQueryDeleteParams()) {
					criteria1.andDeletedEqualTo("0");
					criteria2.andDeletedIsNull();
				}
				condition.setOrderByClause("PARAM_DIRECTION asc, ORDER_FIELD asc");
				List<FuncParams> list = funcProjectBiz.funcParamsSelectObjects(condition);
				res.setParamList(list);
				res.setSuccess(true);
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
				logger.error("FuncProcedureManage!ajaxParamsQuery error: " + e.getMessage(), e);
			}
		}
		return res;
	}

	@RequestMapping(value = {
		"FuncProcedureManage!ajaxSave"
	}, method = {
		RequestMethod.POST
	})
	@ResponseBody
	public FuncProcedureResponse ajaxSave(@RequestBody FuncProcedure func) {
		FuncProcedureResponse res = new FuncProcedureResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_LIST_MANAGE, PrivilegeOperate.Delete)) {
			res.setResult(false, "没有权限");
		}
		if (res.isSuccess()) {
			try {
				FuncProcedureExample example = new FuncProcedureExample();
				example.or().andFuncProjectIdEqualTo(func.getFuncProjectId()).andFuncProcedureIdEqualTo(func.getFuncProcedureId());
				FuncProcedure dbFunc = funcProjectBiz.selectSingleObject(funcProjectBiz.funcProcedureSelectObjects(example));
				boolean isNew = dbFunc == null;
				if (!isNew) {
					funcProjectBiz.funcProcedureUpdate(func);
				} else {
					funcProjectBiz.funcProcedureInsert(func);
				}
				res.setOutput(func);
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
			}
		}
		return res;
	}

	@RequestMapping(value = {
		"FuncProcedureManage!ajaxRemove"
	}, method = {
		RequestMethod.POST
	})
	@ResponseBody
	public BaseResponse ajaxRemove(FuncProcedureRequest req) {
		BaseResponse res = new BaseResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_LIST_MANAGE, PrivilegeOperate.Write)) {
			res.setResult(false, "没有权限");
		}
		if (res.isSuccess()) {
			try {

				FuncProcedureExample condition = new FuncProcedureExample();
				condition.or().andFuncProcedureIdEqualTo(req.getFuncProcedureId());
				FuncProcedure proc = new FuncProcedure();
				proc.setDeleted("1");
				funcProjectBiz.funcProcedureUpdateSelectiveByCondition(proc, condition);
				res.setResult(true, "删除成功,id:" + req.getFuncProcedureId());
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
			}
		}
		return res;
	}

	@RequestMapping(value = {
		"FuncProcedureManage!ajaxRestore"
	}, method = {
		RequestMethod.POST
	})
	@ResponseBody
	public BaseResponse ajaxRestore(FuncProcedureRequest req) {
		BaseResponse res = new BaseResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_LIST_MANAGE, PrivilegeOperate.Write)) {
			res.setResult(false, "没有权限");
		}
		if (res.isSuccess()) {
			try {
				FuncProcedureExample condition = new FuncProcedureExample();
				condition.or().andFuncProcedureIdEqualTo(req.getFuncProcedureId());
				FuncProcedure proc = new FuncProcedure();
				proc.setDeleted("0");
				funcProjectBiz.funcProcedureUpdateSelectiveByCondition(proc, condition);
				res.setResult(true, "恢复成功,id:" + req.getFuncProcedureId());
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
			}
		}
		return res;
	}

	@RequestMapping(value = {
		"FuncProcedureManage!ajaxParamSave"
	}, method = {
		RequestMethod.POST
	})
	@ResponseBody
	public FuncProcedureResponse ajaxParamSave(@RequestBody FuncParams param) {
		FuncProcedureResponse res = new FuncProcedureResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_LIST_MANAGE, PrivilegeOperate.Delete)) {
			res.setResult(false, "没有权限");
		}
		if (res.isSuccess()) {
			try {
				boolean isNew = false;
				FuncParams oldParam = null;
				if (param.getParamId() != null && param.getParamId() > 0) {
					oldParam = funcProjectBiz.funcParamsSelectByPrimaryKey(param.getParamId());
					isNew = oldParam == null;
				}
				if (!isNew) {
					funcProjectBiz.funcParamsUpdate(param);
				} else {
					funcProjectBiz.funcParamsInsert(param);
				}
				res.setFuncParamId(param.getParamId());
				// res.setResult(true, "删除成功,id:" + func.getFuncProcedureId());
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
			}
		}
		return res;
	}

	@RequestMapping(value = {
		"FuncProcedureManage!ajaxParamRemove"
	}, method = {
		RequestMethod.POST
	})
	@ResponseBody
	public BaseResponse ajaxParamRemove(FuncProcedureRequest req) {
		BaseResponse res = new BaseResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_LIST_MANAGE, PrivilegeOperate.Write)) {
			res.setResult(false, "没有权限");
		}
		if (res.isSuccess()) {
			try {

				FuncParamsExample condition = new FuncParamsExample();
				condition.or().andParamIdEqualTo(req.getFuncParamId());
				FuncParams param = new FuncParams();
				param.setDeleted("1");
				funcProjectBiz.funcParamsUpdateSelectiveByCondition(param, condition);
				res.setResult(true, "删除成功,id:" + req.getFuncParamId());
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
			}
		}
		return res;
	}

	@RequestMapping(value = {
		"FuncProcedureManage!ajaxParamRestore"
	}, method = {
		RequestMethod.POST
	})
	@ResponseBody
	public BaseResponse ajaxParamRestore(FuncProcedureRequest req) {
		BaseResponse res = new BaseResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_LIST_MANAGE, PrivilegeOperate.Write)) {
			res.setResult(false, "没有权限");
		}
		if (res.isSuccess()) {
			try {

				FuncParamsExample condition = new FuncParamsExample();
				condition.or().andParamIdEqualTo(req.getFuncParamId());
				FuncParams param = new FuncParams();
				param.setDeleted("0");
				funcProjectBiz.funcParamsUpdateSelectiveByCondition(param, condition);
				res.setResult(true, "恢复成功,id:" + req.getFuncParamId());
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
			}
		}
		return res;
	}

	@RequestMapping(value = {
		"FuncProcedureManage!ajaxParamCopy"
	}, method = {
		RequestMethod.POST
	})
	@ResponseBody
	public BaseResponse ajaxParamCopy(FuncProcedureRequest req) {
		FuncProcedureResponse res = new FuncProcedureResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_LIST_MANAGE, PrivilegeOperate.Write)) {
			res.setResult(false, "没有权限");
		}
		if (res.isSuccess()) {
			try {
				FuncParams newParam = funcProjectBiz.funcParamsCopyByParamId(req.getFuncParamId());
				res.setFuncParam(newParam);
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
			}
		}
		return res;
	}

}
