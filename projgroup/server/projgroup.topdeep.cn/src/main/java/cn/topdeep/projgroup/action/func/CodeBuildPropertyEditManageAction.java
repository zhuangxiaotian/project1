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
import cn.topdeep.projgroup.entity.db.CodeBuildProperty;
import cn.topdeep.projgroup.entity.db.CodeBuildPropertyExample;
import cn.topdeep.projgroup.entity.request.CodeBuildPropertyEditRequest;
import cn.topdeep.projgroup.entity.response.CodeBuildPropertyEditResponse;

import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;

@Controller
@RequestMapping(value = {
	"/func"
})
public class CodeBuildPropertyEditManageAction extends BaseAction {

	@RequestMapping(value = "/codeBuildPropertyEditManage", method = {
		RequestMethod.GET
	})
	public String execute(CodeBuildPropertyEditRequest req, Model model) {
		CodeBuildPropertyEditResponse res = new CodeBuildPropertyEditResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Read)) {
			res.setResult(false, "没有权限");
		}
		if (res.isSuccess()) {
			res.setBuildId(req.getBuildId());
			model.addAttribute("res", res);
			res.setTitle("项目构建管理属性");
			return "/" + res.getSkin() + "/func/code-build-property-success";
		}
		return "";
	}

	@RequestMapping(value = {
		"/codeBuildPropertyEditManage!ajaxSave"
	}, method = {
		RequestMethod.POST
	})
	@ResponseBody
	public CodeBuildPropertyEditResponse ajaxSave(@RequestBody CodeBuildPropertyEditRequest req) {
		CodeBuildPropertyEditResponse res = new CodeBuildPropertyEditResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Write)) {
			res.setResult(false, "没有权限");
		}
		if (res.isSuccess()) {
			try {
				boolean newobj = req.getInput().getBuildPropertyId() == null;
				if (newobj) {
					funcProjectBiz.codeBuildPropertyInsert(req.getInput());
					res.setOperaCode(1);// 判断是插入还是更新，插入是1
				} else {
					funcProjectBiz.codeBuildPropertyUpdate(req.getInput());
					res.setOperaCode(2);// 判断是插入还是更新，更新是2
				}
				res.setResult(true, "保存成功!");
			} catch (Exception e) {
				logger.error("codeBuildPropertyEditManage!ajaxSave failed " + e.getMessage());
				res.setResult(false, e.getMessage());
			}
		}
		return res;
	}

	@RequestMapping(value = "/codeBuildPropertyEditManage!ajaxDelete", method = {
		RequestMethod.POST
	})
	@ResponseBody
	public CodeBuildPropertyEditResponse ajaxDelete(CodeBuildPropertyEditRequest req) {
		CodeBuildPropertyEditResponse res = new CodeBuildPropertyEditResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Delete)) {
			res.setResult(false, "没有权限");
		}
		if (res.isSuccess()) {
			try {
				funcProjectBiz.codeBuildPropertyDeleteByPrimaryKey(req.getBuildPropertyId());
				res.setResult(true, "删除成功!");
			} catch (Exception e) {
				logger.error("codeBuildPropertyEditManage!ajaxDelete failed " + e.getMessage());
				res.setResult(false, e.getMessage());
			}
		}
		return res;
	}

	@RequestMapping(value = {
		"/codeBuildPropertyEditManage!ajaxQuery"
	}, method = {
		RequestMethod.POST
	})
	@ResponseBody
	public CodeBuildPropertyEditResponse ajaxQuery(CodeBuildPropertyEditRequest req) {
		CodeBuildPropertyEditResponse res = new CodeBuildPropertyEditResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Read)) {
			res.setResult(false, "没有权限");
		}
		if (res.isSuccess()) {
			try {
				CodeBuildPropertyExample condition = new CodeBuildPropertyExample();
				condition.or().andBuildIdEqualTo(req.getBuildId());
				condition.setOrderByClause("BUILD_PROPERTY_NAME asc");
				List<CodeBuildProperty> list = funcProjectBiz.codeBuildPropertySelectObjects(condition);
				res.setCodeBuildPropertyView(list);
				res.setResult(true, "查询成功!");
			} catch (Exception e) {
				logger.error("codeBuildPropertyEditManage!ajaxQuery failed " + e.getMessage());
				res.setResult(false, e.getMessage());
			}
		}
		return res;
	}

	@RequestMapping(value = {
		"/codeBuildPropertyEditManage!ajaxImport"
	}, method = {
		RequestMethod.POST
	})
	public CodeBuildPropertyEditResponse ajaxImport(CodeBuildPropertyEditRequest req) {
		CodeBuildPropertyEditResponse res = new CodeBuildPropertyEditResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Write)) {
			res.setResult(false, "没有权限");
		}
		try {
			if (req.getBuildId() > 0 && req.getSrcBuildId() > 0) {
				List<CodeBuildProperty> propList = funcProjectBiz.codeBuildPropertySelectObjectsByBuildId(req.getSrcBuildId());
				for (CodeBuildProperty item : propList) {
					item.setBuildId(req.getBuildId());
					item.setBuildPropertyId(0);
					funcProjectBiz.codeBuildPropertyInsert(item);
					res.setResult(true, "导入成功");
				}
			}
		} catch (CacheException e) {
			logger.error("codeBuildPropertyEditManage!ajaxImport failed " + e.getMessage());
			res.setResult(false, e.getMessage());
		}
		return res;
	}
}
