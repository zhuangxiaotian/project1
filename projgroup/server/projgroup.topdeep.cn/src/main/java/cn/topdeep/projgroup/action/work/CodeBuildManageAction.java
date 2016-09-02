package cn.topdeep.projgroup.action.work;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.topdeep.projgroup.action.base.BaseAction;
import cn.topdeep.projgroup.entity.Privilege;
import cn.topdeep.projgroup.entity.db.CodeBuild;
import cn.topdeep.projgroup.entity.db.CodeBuildExample;
import cn.topdeep.projgroup.entity.request.CodeBuildResquest;
import cn.topdeep.projgroup.entity.response.CodeBuildResponse;

import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;


@Controller
@RequestMapping("/work")
public class CodeBuildManageAction extends BaseAction {

	@RequestMapping(value = "codeBuildManage", method = {
			RequestMethod.GET, RequestMethod.POST
	})
	public String execute(CodeBuildResquest req, Model model) {
		CodeBuildResponse res = new CodeBuildResponse();
		model.addAttribute("res", res);
		if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Read)) {
			return "";
		}
		return "/" + res.getSkin() + "/work/code-build-success";
	}

	@RequestMapping(value = "codeBuildManage!ajaxQuery", method = {
			RequestMethod.GET, RequestMethod.POST
	})
	@ResponseBody
	public CodeBuildResponse ajaxQuery(CodeBuildResquest req) throws SQLException, CacheException {
		CodeBuildResponse res = new CodeBuildResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Read)) {
			res.setResult(false, "没有权限");
		}
		if (res.isSuccess()) {
			CodeBuildExample condition = new CodeBuildExample();
			List<CodeBuild> codeBuildlist = null;
			List<CodeBuild> resultList = null;
			try {
				codeBuildlist = systemBiz.codeBuildSelectObjects(condition);
				resultList = new ArrayList<CodeBuild>();
				for (CodeBuild item : codeBuildlist) {
					if (item.getParentBuildId() == 0) {
						resultList.add(item);
						for (CodeBuild item1 : codeBuildlist) {
							if (item1.getParentBuildId() == item.getBuildId()) {
								resultList.add(item1);
							}
						}
					}
				}
				res.setCodeBuildList(resultList);
				res.setResult(true, "");
			} catch (Exception e) {
				logger.error("codeBuildManage!ajaxQuery error: " + e.getMessage());
				res.setResult(false, "codeBuildManage!ajaxQuery failed :" + e.getMessage());
			}
		}
		return res;
	}

	@RequestMapping(value = "codeBuildManage!ajaxSave", method = {
		RequestMethod.POST
	})
	@ResponseBody
	public CodeBuildResponse ajaxSave(@RequestBody CodeBuildResquest req) {
		CodeBuildResponse res = new CodeBuildResponse();
//		 if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Write)) {
//		 res.setResult(false, "没有权限");
//		 }
		if (res.isSuccess()) {
			Integer buildId = req.getInput().getBuildId();
			try {
				boolean newObj = false;
				CodeBuild newItem = null;
				if (res.isSuccess()) {
					if (req.getInput().getBuildId() > 0) {
						newItem = systemBiz.codeBuildSelectByPrimaryKey(req.getInput().getBuildId());
						if (newItem == null) {
							res.setResult(false, "无效的id");
						}
					} else {
						newObj = true;
					}
				}
				if (res.isSuccess()) {
					if (newObj) {
						newItem = new CodeBuild();
						if (req.getInput().getParentBuildId() == 0) {
							newItem.setBuildId(systemBiz.nextCustomIdValue(true));
						} else {
							newItem.setBuildId(systemBiz.nextCustomIdValue(false));
						}
					}
					newItem.setBuildName(req.getInput().getBuildName());
					newItem.setFuncProjects(req.getInput().getFuncProjects());
					newItem.setParentBuildId(req.getInput().getParentBuildId());
					if (newObj) {
						systemBiz.codeBuildInsert(newItem);
					} else {
						systemBiz.codeBuildUpdate(newItem);
					}
					res.setOutput(newItem);
				}
				res.setResult(true, "保存成功");
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
				logger.error("codeBuildManage!ajaxSave error: " + e.getMessage());
			}
		}
		return res;
	}


}
