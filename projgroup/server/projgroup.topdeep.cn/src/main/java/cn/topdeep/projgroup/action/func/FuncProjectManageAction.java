/**
 * 
 */
package cn.topdeep.projgroup.action.func;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import cn.topdeep.projgroup.entity.db.FuncProject;
import cn.topdeep.projgroup.entity.db.FuncProjectExample;
import cn.topdeep.projgroup.entity.request.BaseRequest;
import cn.topdeep.projgroup.entity.request.FuncProcedureRequest;
import cn.topdeep.projgroup.entity.response.BaseResponse;
import cn.topdeep.projgroup.ftl.FuncProcedureExport;
import cn.topdeep.projgroup.ftl.WordGenerator;
import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;

/**
 * @author niexin
 *
 */
@Controller
@RequestMapping(value = {
	"/func"
})
public class FuncProjectManageAction extends BaseAction {

	@RequestMapping(value = "FuncProjectManage", method = {
			RequestMethod.GET, RequestMethod.POST
	})
	public String execute(BaseRequest req, Model model) {
		BaseResponse res = new BaseResponse();
		model.addAttribute("res", res);
		if (!hasPrivilege(Privilege.FUNC_FUNC_LIST_MANAGE, PrivilegeOperate.Read)) {
			return "";
		}

		return "/" + res.getSkin() + "/func/func-project-success";
	}

	@RequestMapping(value = {
		"ProjectList!ajaxQueryProjectList"
	}, method = {
			RequestMethod.GET, RequestMethod.POST
	})
	@ResponseBody
	public BaseResponse ajaxQueryProjectList() {
		BaseResponse res = new BaseResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_LIST_MANAGE, PrivilegeOperate.Read)) {
			res.setResult(false, "没有权限");
		}
		if (res.isSuccess()) {
			try {
				List<cn.topdeep.projgroup.entity.db.FuncProject> list = funcProjectBiz.funcProjectSelectObjects(new FuncProjectExample());
				res.getData().put("list", list);
				res.setSuccess(true);
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
				logger.error("ProjectList!ajaxQueryProjectList error: " + e.getMessage(), e);
			}
		}
		return res;
	}

	@RequestMapping(value = {
		"ProjectList!ajaxSave"
	}, method = {
		RequestMethod.POST
	})
	@ResponseBody
	public BaseResponse ajaxSave(@RequestBody cn.topdeep.projgroup.entity.db.FuncProject project) {
		BaseResponse res = new BaseResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_LIST_MANAGE, PrivilegeOperate.Write)) {
			res.setResult(false, "没有权限");
		}
		if (res.isSuccess()) {
			try {
				if (project.getFuncProjectId() != null && project.getFuncProjectId() > 0) {
					funcProjectBiz.funcProjectUpdate(project);
				} else {
					funcProjectBiz.funcProjectInsert(project);
				}
				res.getData().put("funcProjectId", project.getFuncProjectId());
				res.setResult(true, "保存成功,id:" + project.getFuncProjectId());
			} catch (Exception e) {
				res.setResult(false, e.getMessage());
			}
		}
		return res;
	}

	@RequestMapping(value = "projectListExport", method = {
			RequestMethod.GET, RequestMethod.POST
	})
	public void executeExport(FuncProcedureRequest reqF, Model model, HttpServletRequest req, HttpServletResponse resp) throws IOException, CacheException {
		req.setCharacterEncoding("utf-8");
		// 通过循环将表单参数放入
		FuncProject fp = this.funcProjectBiz.funcProjectSelectByPrimaryKey(reqF.getFuncProjectId());
		FuncProcedureExample condition = new FuncProcedureExample();
		condition.or().andFuncProjectIdEqualTo(reqF.getFuncProjectId()).andDeletedEqualTo("0");
		condition.or().andFuncProjectIdEqualTo(reqF.getFuncProjectId()).andDeletedIsNull();
		List<FuncProcedure> list = funcProjectBiz.funcProcedureSelectObjects(condition);
		List<Integer> funcPIdList = new ArrayList<Integer>();
		List<FuncProcedureExport> exportList = new ArrayList<FuncProcedureExport>();
		for (FuncProcedure dure : list) {
			funcPIdList.add(dure.getFuncProcedureId());
		}
		List<FuncParams> paramList = new ArrayList<FuncParams>();
		if (funcPIdList.size() > 0) {
			FuncParamsExample paramCondition = new FuncParamsExample();
			paramCondition.or().andFuncProcedureIdIn(funcPIdList);
			paramList = this.funcProjectBiz.funcParamsSelectObjects(paramCondition);
		}
		for (FuncProcedure dure : list) {
			FuncProcedureExport export = new FuncProcedureExport();
			export.setFpd(dure);
			List<FuncParams> paramExportList = new ArrayList<FuncParams>();
			for(FuncParams p : paramList){
				if(p.getFuncProcedureId().equals(dure.getFuncProcedureId())){
					paramExportList.add(p);
				}
			}
			export.setFuncParamlist(paramExportList);
			exportList.add(export);
		}
		File file = null;
		InputStream fin = null;
		ServletOutputStream out = null;
		try {
			// 调用工具类WordGenerator的createDoc方法生成Word文档
			file = WordGenerator.createDoc(exportList, "resume", fp.getFuncProjectName());
			fin = new FileInputStream(file);

			resp.setCharacterEncoding("utf-8");
			resp.setContentType("application/msword");
			// 设置浏览器以下载的方式处理该文件默认名为resume.doc
			String fileName = fp.getFuncProjectName();
			resp.addHeader("Content-Disposition", "attachment;filename=" + new String(fileName.getBytes("utf-8"), "ISO8859-1") + ".doc");

			out = resp.getOutputStream();
			byte[] buffer = new byte[512]; // 缓冲区
			int bytesToRead = -1;
			// 通过循环将读入的Word文件的内容输出到浏览器中
			while ((bytesToRead = fin.read(buffer)) != -1) {
				out.write(buffer, 0, bytesToRead);
			}
		} finally {
			if (fin != null)
				fin.close();
			if (out != null)
				out.close();
			if (file != null)
				file.delete(); // 删除临时文件
		}

	}

}
