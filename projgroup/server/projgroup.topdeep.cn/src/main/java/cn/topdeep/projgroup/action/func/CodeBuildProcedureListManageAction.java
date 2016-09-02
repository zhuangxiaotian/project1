package cn.topdeep.projgroup.action.func;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import cn.topdeep.projgroup.action.base.BaseAction;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.Privilege;
import cn.topdeep.projgroup.entity.db.CodeBuild;
import cn.topdeep.projgroup.entity.db.CodeBuildProcedure;
import cn.topdeep.projgroup.entity.db.CodeBuildProcedureExample;
import cn.topdeep.projgroup.entity.db.CodeBuildProperty;
import cn.topdeep.projgroup.entity.db.CodeBuildPropertyExample;
import cn.topdeep.projgroup.entity.db.FuncProcedure;
import cn.topdeep.projgroup.entity.db.FuncProcedureExample;
import cn.topdeep.projgroup.entity.db.TestParamValue;
import cn.topdeep.projgroup.entity.db.TestProcedure;
import cn.topdeep.projgroup.entity.request.CodeBuildProcedureListRequest;
import cn.topdeep.projgroup.entity.response.CodeBuildProcedureListResponse;
import cn.topdeep.projgroup.util.XmlSignEncryptUtil;
import cn.topdeep.projgroup.util.sign.XmlBuildUtil;

import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;
import common.util.StringUtils;

@Controller
@RequestMapping(value = {
	"/func"
})
public class CodeBuildProcedureListManageAction extends BaseAction {

	@RequestMapping(value = "/codeBuildProcedureListManage", method = {
		RequestMethod.GET
	})
	public String execute(CodeBuildProcedureListRequest req, Model model) {
		CodeBuildProcedureListResponse res = new CodeBuildProcedureListResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Read)) {
			res.setResult(false, "没有权限");
		}
		if (res.isSuccess()) {
			res.setBuildId(req.getBuildId());
			model.addAttribute("res", res);
			res.setResult(true, "操作成功!");
			return "/" + res.getSkin() + "/func/code-build-procedure-list-success";
		}
		return "";
	}

	@RequestMapping(value = {
		"/codeBuildProcedureListManage!ajaxQuery"
	}, method = {
		RequestMethod.POST
	})
	@ResponseBody
	public CodeBuildProcedureListResponse ajaxQuery(CodeBuildProcedureListRequest req) {
		CodeBuildProcedureListResponse res = new CodeBuildProcedureListResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Read)) {
			res.setResult(false, "没有权限");
		}
		if (res.isSuccess()) {
			try {
				CodeBuild build = funcProjectBiz.codeBuildSelectByPrimaryKey(req.getBuildId());
				if (build != null && !StringUtils.isNullOrEmpty(build.getFuncProjects())) {
					List<Integer> idList = new ArrayList<Integer>();
					String[] ary = build.getFuncProjects().split(",");
					for (String item : ary) {
						if (item != "") {
							idList.add(Integer.parseInt(item));
						}
					}
					FuncProcedureExample condition = new FuncProcedureExample();
					condition.or().andFuncProjectIdIn(idList).andDeletedNotEqualTo("1");
					List<FuncProcedure> procList = funcProjectBiz.funcProcedureSelectObjects(condition);

					List<CodeBuildProcedure> cbpList = funcProjectBiz.codeBuildProcedureSelectObjectsByBuildId(req.getBuildId());

					HashSet<Integer> procSet = new HashSet<Integer>();
					HashMap<Integer, CodeBuildProcedure> notExistMap = new HashMap<Integer, CodeBuildProcedure>();
					for (CodeBuildProcedure item : cbpList) {
						procSet.add(item.getFuncProcedureId());
						notExistMap.put(item.getFuncProcedureId(), item);
					}

					for (FuncProcedure item : procList) {
						if (procSet.contains(item.getFuncProcedureId())) {
							item.setPub5("1");
							notExistMap.remove(item.getFuncProcedureId());
						} else {
							item.setPub5("0");
						}
					}

					if (notExistMap.size() > 0) {
						for (Integer item : notExistMap.keySet()) {
							CodeBuildProcedure cbp = notExistMap.get(item);
							funcProjectBiz.codeBuildProcedureDeleteByBuildProcedureId(cbp.getBuildProcedureId());
						}
					}
					res.setProcList(procList);
				}
				res.setResult(true, "查询成功!");
			} catch (NumberFormatException e) {
				logger.error("codeBuildProcedureListManage!ajaxQuery failed " + e.getMessage());
				res.setResult(false, e.getMessage());
			} catch (CacheException e) {
				logger.error("codeBuildProcedureListManage!ajaxQuery failed " + e.getMessage());
				res.setResult(false, e.getMessage());
			}
		}
		return res;
	}

	@RequestMapping(value = {
		"/codeBuildProcedureListManage!ajaxImport"
	}, method = {
		RequestMethod.POST
	})
	@ResponseBody
	public CodeBuildProcedureListResponse ajaxImport(CodeBuildProcedureListRequest req) {
		CodeBuildProcedureListResponse res = new CodeBuildProcedureListResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Write)) {
			res.setResult(false, "没有权限");
		}
		try {
			if (req.getSrcBuildId() > 0 && req.getBuildId() > 0) {
				List<CodeBuildProcedure> srcCbpList = funcProjectBiz.codeBuildProcedureSelectObjectsByBuildId(req.getSrcBuildId());
				List<CodeBuildProcedure> existCbpList = funcProjectBiz.codeBuildProcedureSelectObjectsByBuildId(req.getBuildId());
				HashSet<Integer> existCbpSet = new HashSet<Integer>();
				for (CodeBuildProcedure item : existCbpList) {
					if (!existCbpSet.contains(item.getFuncProcedureId())) {
						existCbpSet.add(item.getFuncProcedureId());
					}
				}
				for (CodeBuildProcedure item : srcCbpList) {
					if (!existCbpSet.contains(item.getFuncProcedureId())) {
						CodeBuildProcedure cbp = new CodeBuildProcedure();
						cbp.setBuildId(req.getBuildId());
						cbp.setFuncProcedureId(item.getFuncProcedureId());
						funcProjectBiz.codeBuildProcedureInsert(cbp);
						existCbpSet.add(item.getFuncProcedureId());
					}
				}
			}
			res.setResult(true, "导入成功");
		} catch (Exception e) {
			logger.error("codeBuildProcedureListManage!ajaxImport failed " + e.getMessage());
			res.setResult(false, e.getMessage());
		}
		return res;
	}

	@RequestMapping(value = {
		"/codeBuildProcedureListManage!ajaxInvertImport"
	}, method = {
		RequestMethod.POST
	})
	@ResponseBody
	private CodeBuildProcedureListResponse ajaxInvertImport(CodeBuildProcedureListRequest req) {
		CodeBuildProcedureListResponse res = new CodeBuildProcedureListResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Write)) {
			res.setResult(false, "没有权限");
			;
		}
		try {
			if (req.getSrcBuildId() > 0 && req.getBuildId() > 0) {
				List<FuncProcedure> list = getProcList(req);
				List<CodeBuildProcedure> srcCbpList = funcProjectBiz.codeBuildProcedureSelectObjectsByBuildId(req.getSrcBuildId());
				List<CodeBuildProcedure> existCbpList = funcProjectBiz.codeBuildProcedureSelectObjectsByBuildId(req.getBuildId());
				HashSet<Integer> existCbpSet = new HashSet<Integer>();
				for (CodeBuildProcedure item : existCbpList) {
					if (!existCbpSet.contains(item.getFuncProcedureId())) {
						existCbpSet.add(item.getFuncProcedureId());
					}
				}
				HashSet<Integer> srcProcSet = new HashSet<Integer>();
				for (FuncProcedure item : list) {
					if (!srcProcSet.contains(item.getFuncProcedureId())) {
						srcProcSet.add(item.getFuncProcedureId());
					}
				}
				for (CodeBuildProcedure item : srcCbpList) {
					if (srcProcSet.contains(item.getFuncProcedureId())) {
						srcProcSet.remove(item.getFuncProcedureId());
					}
				}
				for (Iterator<Integer> it = srcProcSet.iterator(); it.hasNext();) {
					Integer funcProcedureId = it.next();
					if (!existCbpSet.contains(funcProcedureId)) {
						CodeBuildProcedure cbp = new CodeBuildProcedure();
						cbp.setBuildId(req.getBuildId());
						cbp.setFuncProcedureId(funcProcedureId);
						funcProjectBiz.codeBuildProcedureInsert(cbp);
						existCbpSet.add(funcProcedureId);
					}
				}
			}
			res.setProcList(null);
			res.setResult(true, "反向导入成功");
		} catch (Exception e) {
			logger.error("codeBuildProcedureListManage!ajaxInvertImport failed " + e.getMessage());
			res.setResult(false, e.getMessage());
		}
		return res;

	}

	public List<FuncProcedure> getProcList(CodeBuildProcedureListRequest req) {
		try {
			if (req.getBuildId() > 0) {
				CodeBuild build = funcProjectBiz.codeBuildSelectByPrimaryKey(req.getBuildId());
				if (build != null && !StringUtils.isNullOrEmpty(build.getFuncProjects())) {
					List<Integer> idList = new ArrayList<Integer>();
					String[] ary = build.getFuncProjects().split(",");
					for (String item : ary) {
						idList.add(Integer.parseInt(item));
					}
					FuncProcedureExample condition = new FuncProcedureExample();
					condition.or().andFuncProjectIdIn(idList).andDeletedNotEqualTo("1");
					List<FuncProcedure> procList = funcProjectBiz.funcProcedureSelectObjects(condition);

					List<CodeBuildProcedure> cbpList = funcProjectBiz.codeBuildProcedureSelectObjectsByBuildId(req.getBuildId());

					HashSet<Integer> procSet = new HashSet<Integer>();
					HashMap<Integer, CodeBuildProcedure> notExistMap = new HashMap<Integer, CodeBuildProcedure>();
					for (CodeBuildProcedure item : cbpList) {
						procSet.add(item.getFuncProcedureId());
						notExistMap.put(item.getFuncProcedureId(), item);
					}

					for (FuncProcedure item : procList) {
						if (procSet.contains(item.getFuncProcedureId())) {
							item.setPub5("1");
							notExistMap.remove(item.getFuncProcedureId());
						} else {
							item.setPub5("0");
						}
					}

					if (notExistMap.size() > 0) {
						for (Integer item : notExistMap.keySet()) {
							CodeBuildProcedure cbp = notExistMap.get(item);
							funcProjectBiz.codeBuildProcedureDeleteByBuildProcedureId(cbp.getBuildProcedureId());
						}
					}
					return procList;
				}
			}
			return null;
		} catch (Exception e) {
			logger.error("codeBuildProcedureListManage!ajaxSave failed " + e.getMessage());
			return null;
		}
	}

	@RequestMapping(value = {
		"/codeBuildProcedureListManage!ajaxSave"
	}, method = {
		RequestMethod.POST
	})
	@ResponseBody
	public CodeBuildProcedureListResponse ajaxSave(CodeBuildProcedureListRequest req) throws DbException, SQLException, CacheException {
		CodeBuildProcedureListResponse res = new CodeBuildProcedureListResponse();
		if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Write)) {
			res.setResult(false, "没有权限");
		}
		try {
			List<FuncProcedure> list = getProcList(req);
			HashSet<Integer> procSet = new HashSet<Integer>();
			String[] selectedFuncIdsString = req.getSelectedFuncIdsString().split(",");
			int[] selectedFuncIds = new int[selectedFuncIdsString.length];
			if (req.getSelectedFuncIdsString() == "") {
				selectedFuncIds = null;
			} else {
				for (int i = 0; i < selectedFuncIdsString.length; i++) {
					selectedFuncIds[i] = Integer.parseInt(selectedFuncIdsString[i]);
				}
			}
			if (selectedFuncIds != null && selectedFuncIds.length > 0) {
				for (int item : selectedFuncIds) {
					procSet.add(item);
				}
			}
			List<CodeBuildProcedure> cbpList = funcProjectBiz.codeBuildProcedureSelectObjectsByBuildId(req.getBuildId());
			HashSet<Integer> oldProcSet = new HashSet<Integer>();
			for (CodeBuildProcedure item : cbpList) {
				oldProcSet.add(item.getFuncProcedureId());
			}
			// first delete not selected
			if (list != null) {
				for (FuncProcedure item : list) {
					if (!procSet.contains(item.getFuncProcedureId())) {
						if (oldProcSet.contains(item.getFuncProcedureId())) {
							CodeBuildProcedure cbp = null;
							CodeBuildProcedureExample condition = new CodeBuildProcedureExample();
							condition.or().andBuildIdEqualTo(req.getBuildId()).andFuncProcedureIdEqualTo(item.getFuncProcedureId());
							List<CodeBuildProcedure> retList = funcProjectBiz.codeBuildProcedureSelectObjects(condition);
							if (retList.size() > 0) {
								cbp = retList.get(0);
							}
							if (cbp != null) {
								List<TestProcedure> idlist = funcProjectBiz.testProcedureSelectObjectsByBuildId(req.getBuildId());// 取出构建test中所有函数
								funcProjectBiz.codeBuildProcedureDeleteByBuildProcedureId(cbp.getBuildProcedureId());
								// 删除procedure表中对应数据
								// funcProjectBiz.testProcedureDeleteListByFuncProcedureId(item.getFuncProcedureId());
								for (TestProcedure one : idlist) {
									if (one.getFuncProcedureId() == item.getFuncProcedureId()) {
										// 删除parama表中对应数据
										// funcProjectBiz.testParamValueDeleteListByTestProcedureId(one.getTestProcedureId());
										List<TestParamValue> deleteparam = funcProjectBiz
												.testParamValueSelectObjectsByTestProcedureId(one.getTestProcedureId());
										for (TestParamValue delete : deleteparam) {
											if (delete.getTestProcedureId() == one.getTestProcedureId()) {
												funcProjectBiz.testParamValueDeleteByParamIdTestProcedureId(delete.getParamId(), delete.getTestProcedureId());
											}
										}
										funcProjectBiz.testProcedureDeleteByPrimaryKey(one.getTestProcedureId());
									}
								}

							}
						}

					}
				}
			}
			if (selectedFuncIds != null && selectedFuncIds.length > 0 && req.getBuildId() > 0) {
				for (int i = 0; i < selectedFuncIds.length; i++) {
					int item = selectedFuncIds[i];
					if (!oldProcSet.contains(item)) {
						CodeBuildProcedure cbp;
						cbp = new CodeBuildProcedure();
						cbp.setBuildId(req.getBuildId());
						cbp.setFuncProcedureId(item);
						funcProjectBiz.codeBuildProcedureInsert(cbp);
						TestProcedure test;
						test = new TestProcedure();
						List<TestProcedure> testList = funcProjectBiz.testProcedureSelectObjectsByBuildId(req.getBuildId());
						int addorder = 0;
						for (TestProcedure ss : testList) {
							addorder = ss.getTestOrder();
						}
						test.setBuildId(req.getBuildId());
						test.setFuncProcedureId(item);
						test.setTestOrder(addorder + 1);
						funcProjectBiz.testProcedureInsert(test);
					}
				}
			}
			res.setProcList(null);
		} catch (Exception e) {
			logger.error("codeBuildProcedureListManage!ajaxSave failed " + e.getMessage());
			res.setResult(true, "保存失败");
		}
		return res;
	}

	@RequestMapping(value = {
		"/downloadConfigFile"
	})
	public ResponseEntity<byte[]> downloadConfigFile(int buildId) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

		List<Integer> funcProcedureIds = new ArrayList<Integer>();

		ByteArrayOutputStream out = null;
		ByteArrayInputStream input = null;
		ByteArrayOutputStream out1 = null;
		try {
			// CodeBuild codeBuild = funcProjectBiz.codeBuildSelectByPrimaryKey(buildId);
			headers.setContentDispositionFormData("attachment", buildId + ".xml");

			CodeBuildPropertyExample condition1 = new CodeBuildPropertyExample();
			condition1.or().andBuildIdEqualTo(buildId);
			List<CodeBuildProperty> codeBuildPropertyList = funcProjectBiz.codeBuildPropertySelectObjects(condition1);
			// 加密密钥
			String aesKey = "";
			// 证书路径
			String certPath = "";

			String certPwd = "";

			for (CodeBuildProperty property : codeBuildPropertyList) {
				if ("aesKey".equals(property.getBuildPropertyName())) {
					aesKey = property.getBuildPropertyValue();
				} else if ("certificateFilePath".equals(property.getBuildPropertyName())) {
					certPath = property.getBuildPropertyValue();
				} else if ("certificateFilePwd".equals(property.getBuildPropertyName())) {
					certPwd = property.getBuildPropertyValue();
				}
			}
			List<CodeBuildProcedure> codeBuildProcedureList = funcProjectBiz.codeBuildProcedureSelectObjectsByBuildId(buildId);
			for (CodeBuildProcedure procedure : codeBuildProcedureList) {
				funcProcedureIds.add(procedure.getFuncProcedureId());
			}

			FuncProcedureExample condition = new FuncProcedureExample();
			condition.or().andFuncProcedureIdIn(funcProcedureIds);
			List<FuncProcedure> funcProcedureList = funcProjectBiz.funcProcedureSelectObjects(condition);
			Document doc = XmlBuildUtil.buildTopdeepConfigXmlDoc();

			Element config = (Element) doc.getElementsByTagName("Configs").item(0);

			Element item1 = doc.createElement("FuncList");
			item1.setAttribute("id", "FuncList");
			config.appendChild(item1);

			Element item2 = doc.createElement("Privileges");
			item2.setAttribute("id", "Privileges");
			config.appendChild(item2);

			for (FuncProcedure pro : funcProcedureList) {
				if (pro != null) {
					if ("权限定义".equals(pro.getFuncCategory())) {
						Element item = doc.createElement("Privilege");
						item.setAttribute("value", pro.getFuncCode());
						item2.appendChild(item);

					} else {
						Element item = doc.createElement("Func");
						item.setAttribute("value", pro.getFuncCode());
						item1.appendChild(item);
					}
				}
			}
			out = XmlSignEncryptUtil.buildXmlDoc(doc);
			input = new ByteArrayInputStream(out.toByteArray());
			byte[] ret = XmlSignEncryptUtil.signAndEncrypt(input, aesKey, certPath, certPwd);
			return new ResponseEntity<byte[]>(ret, headers, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage(), e);
			throw e;
		} finally {
			if (out != null) {
				out.close();
			}
			if (input != null) {
				input.close();
			}
		}

	}

}
