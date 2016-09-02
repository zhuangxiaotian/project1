/**
 * 
 */
package cn.topdeep.projgroup.action.work;

import info.monitorenter.cpdetector.io.ASCIIDetector;
import info.monitorenter.cpdetector.io.CodepageDetectorProxy;
import info.monitorenter.cpdetector.io.JChardetFacade;
import info.monitorenter.cpdetector.io.ParsingDetector;
import info.monitorenter.cpdetector.io.UnicodeDetector;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import cn.topdeep.projgroup.action.PageAction;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.Privilege;
import cn.topdeep.projgroup.entity.base.PageImpl;
import cn.topdeep.projgroup.entity.db.CodeBuild;
import cn.topdeep.projgroup.entity.db.CodeBuildExample;
import cn.topdeep.projgroup.entity.db.CodeBuildLog;
import cn.topdeep.projgroup.entity.db.CodeBuildLogExample;
import cn.topdeep.projgroup.entity.db.CodeBuildProperty;
import cn.topdeep.projgroup.entity.db.CodeBuildPropertyExample;

import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;
import common.util.FileUtils;
import common.util.StringUtils;

/**
 * @author niexin
 * 
 */
public class CodeBuildExecute extends PageAction implements Runnable {
	private int buildId;

	private int buildLogId;

	private boolean logEnd;

	private long buildLogViewPos;

	private List<CodeBuildLog> buildLogList;

	private List<CodeBuildLog> buildLogChildList;

	private boolean allowBuild = false;

	private String executeMessage = "";

	private CodeBuild codeBuild;

	@SuppressWarnings("unchecked")
	public String execute() throws Exception {
		if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Read)) {
			return NO_PRIVILEGES;
		}
		CodeBuildLogExample condition = new CodeBuildLogExample();
		condition.or().andBuildIdEqualTo(buildId);
		condition.setOrderByClause("BUILD_LOG_ID desc");
		buildLogList = systemBiz.codeBuildLogSelectObjects(condition);
		CodeBuildExample condition1 = new CodeBuildExample();
		condition1.or().andParentBuildIdEqualTo(buildId);
		List<CodeBuild> list = projectBiz.codeBuildSelectObjects(condition1);
		for (int i = 0; i < list.size(); i++) {
			CodeBuildLogExample condition2 = new CodeBuildLogExample();
			condition2.or().andBuildIdEqualTo(list.get(i).getBuildId());
			condition2.setOrderByClause("BUILD_LOG_ID desc");
			buildLogChildList = systemBiz.codeBuildLogSelectObjects(condition2);
			buildLogList.addAll(buildLogChildList);
			Collections.sort(buildLogList, new Comparator() {
				public int compare(Object a, Object b) {
					int one = ((CodeBuildLog) a).getBuildLogId();
					int two = ((CodeBuildLog) b).getBuildLogId();
					return two - one;
				}
			});
		}
		CodeBuildExample condition3 = new CodeBuildExample();
		condition3.or().andParentBuildIdEqualTo(buildId);
		List<CodeBuild> childBuildList = systemBiz.codeBuildSelectObjects(condition3);
		List<Integer> buildIdList = new ArrayList<Integer>();
		for (CodeBuild item : childBuildList) {
			buildIdList.add(item.getBuildId());
		}
		CodeBuildLogExample condition4 = new CodeBuildLogExample();
		condition4.or().andBuildStateEqualTo(1).andBuildIdIn(buildIdList);
		int buildLogCount = 0;
		if (buildIdList.size() > 0) {
			buildLogCount = systemBiz.codeBuildLogQuerySelectObjectsCount(condition4);
		}

		CodeBuildExample condition5 = new CodeBuildExample();
		condition5.or().andBuildIdEqualTo(buildId);
		List<CodeBuild> buildList = systemBiz.codeBuildSelectObjects(condition5);
		CodeBuild codeBuild = null;
		if (buildList.size() > 0) {
			codeBuild = buildList.get(0);
		}
		if (codeBuild != null) {
			CodeBuildPropertyExample condition6 = new CodeBuildPropertyExample();
			condition6.or().andBuildIdEqualTo(buildId).andBuildPropertyNameEqualTo("targetZipFile");
			List<CodeBuildProperty> propList = systemBiz.codeBuildPropertySelectObjects(condition6);
			if (propList.size() > 0) {
				CodeBuildProperty prop = propList.get(0);
				String value = prop.getBuildPropertyValue();
				value = value.replaceAll("\\$\\{buildId\\}", "" + buildId);
				for (CodeBuildLog item : buildLogList) {
					item.setPub0(value.replaceAll("\\$\\{buildLogId\\}", "" + item.getBuildLogId()));
				}
			}
		}
		allowBuild = buildLogCount == 0;
		return SUCCESS;
	}

	public String build() throws Exception {
		if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Execute)) {
			return NO_PRIVILEGES;
		}
		List<CodeBuild> childBuildList = systemBiz.codeBuildSelectObjectsByParentId(buildId);
		List<Integer> childBuildIdList = new ArrayList<Integer>();
		for (CodeBuild item : childBuildList) {
			childBuildIdList.add(item.getBuildId());
		}
		CodeBuildLogExample condition = new CodeBuildLogExample();
		condition.or().andBuildStateEqualTo(1).andBuildIdIn(childBuildIdList);
		int buildLogCount = systemBiz.codeBuildLogQuerySelectObjectsCount(condition);
		allowBuild = buildLogCount == 0;
		if (allowBuild) {
			if (childBuildList.size() > 0) {
				execParentBuild(buildId, childBuildList);
			} else {
				execBuild(buildId);
			}
		}
		return execute();
	}

	private String execBuild(int buildId) {
		try {
			CodeBuild codeBuild = systemBiz.codeBuildSelectByPrimaryKey(buildId);
			if (codeBuild == null)
				return "";
			CodeBuildPropertyExample condition = new CodeBuildPropertyExample();
			condition.or().andBuildIdEqualTo(buildId);
			List<CodeBuildProperty> propList = systemBiz.codeBuildPropertySelectObjects(condition);
			// call cmd path
			HashMap<String, String> propMap = new HashMap<String, String>();
			for (CodeBuildProperty item : propList) {
				String key = item.getBuildPropertyName().toLowerCase();
				propMap.put(key, item.getBuildPropertyValue());
			}
			CodeBuildLog cbLog = new CodeBuildLog();
			cbLog.setBuildId(buildId);
			cbLog.setBuildMessage("构建中...");
			cbLog.setBuildOperator(getLoginUser().getLoginUser().getLoginName());
			cbLog.setBuildResult(0);
			cbLog.setBuildStartTime(new Date());
			cbLog.setBuildState(1);
			systemBiz.codeBuildLogInsert(cbLog);

			String logFile = getLogFile(cbLog.getBuildLogId(), buildId);
			checkLogFilePath(logFile);
			try {
				log.debug("execute build " + buildId + "; logId = " + cbLog.getBuildLogId());
				// cmdPath
				String command = propMap.get("command");
				String resultFile = propMap.get("targetZipFile".toLowerCase());
				resultFile = getPropValue(resultFile, buildId, cbLog.getBuildLogId());
				command = getPropValue(command, buildId, cbLog.getBuildLogId());
				String[] cmd = command.split("\\s");

				int execResult = new common.util.Runtime().run(cmd, true);
				cbLog.setBuildState(2);
				if (execResult == 0) {
					executeMessage += "构建--" + codeBuild.getBuildName() + "--成功";
					cbLog.setBuildResult(1);
					cbLog.setBuildMessage("构建成功");
				} else {
					executeMessage += "构建失败，返回值" + execResult;
					cbLog.setBuildResult(2);
					cbLog.setBuildMessage("构建失败");
				}
				cbLog.setBuildEndTime(new Date());
				systemBiz.codeBuildLogUpdate(cbLog);
				return resultFile;
			} catch (Exception e) {
				cbLog.setBuildState(2);
				cbLog.setBuildResult(2);
				cbLog.setBuildMessage(e.getMessage());
				cbLog.setBuildEndTime(new Date());
				systemBiz.codeBuildLogUpdate(cbLog);
				throw e;
			}
		} catch (Exception ex) {
			executeMessage += ex.getMessage();
			log.error(ex.getMessage(), ex);
		}
		return "";
	}

	public String ajaxBuild() {
		if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Execute)) {
			return NO_PRIVILEGES;
		}
		Map<String, String> map = new HashMap<String, String>();
		try {
			List<CodeBuild> childBuildList = systemBiz.codeBuildSelectObjectsByParentId(buildId);
			List<Integer> childIdList = new ArrayList<Integer>();
			for (CodeBuild item : childBuildList) {
				childIdList.add(item.getBuildId());
			}
			CodeBuildLogExample condition = new CodeBuildLogExample();
			condition.or().andBuildStateEqualTo(1).andBuildIdIn(childIdList);
			int buildLogCount = 0;
			if (childIdList.size() > 0) {
				buildLogCount = systemBiz.codeBuildLogQuerySelectObjectsCount(condition);
			}
			allowBuild = buildLogCount == 0;
			if (allowBuild) {
				try {
					CodeBuild codeBuild = systemBiz.codeBuildSelectByPrimaryKey(buildId);
					if (codeBuild == null) {
						throw new Exception("无效的构建");
					}
					// call cmd path
					CodeBuildLog cbLog = new CodeBuildLog();
					cbLog.setBuildId(buildId);
					cbLog.setBuildMessage("构建中...");
					cbLog.setBuildOperator(getLoginUser().getLoginUser().getLoginName());
					cbLog.setBuildResult(0);
					cbLog.setBuildStartTime(new Date());
					cbLog.setBuildState(1);
					systemBiz.codeBuildLogInsert(cbLog);
					buildLogId = cbLog.getBuildLogId();
					String logFile = getLogFile(buildLogId, buildId);
					checkLogFilePath(logFile);
					new Thread(this).start();

					map.put("buildLogId", "" + cbLog.getBuildLogId());
					map.put("result", "ok");
					map.put("message", "构建已开始");
				} catch (Exception ex) {
					executeMessage += ex.getMessage();
					log.error(ex.getMessage(), ex);
				}
			} else {
				map.put("result", "已有构建进行中，请稍候再试");
			}

		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			map.put("result", ex.getMessage());
		}
		jsonObj = map;
		return AJAX;
	}

	private String getTargetZipFile(int buildLogId, int buildId) throws DbException, SQLException, CacheException {
		CodeBuildPropertyExample condition = new CodeBuildPropertyExample();
		condition.or().andBuildIdEqualTo(buildId).andBuildPropertyNameEqualTo("targetZipFile");
		List<CodeBuildProperty> propList = systemBiz.codeBuildPropertySelectObjects(condition);
		if (propList.size() > 0) {
			CodeBuildProperty prop = propList.get(0);
			String value = prop.getBuildPropertyValue();
			value = getPropValue(value, buildId, buildLogId);
			return value;
		}
		return "";
	}

	private String getLogFile(int buildLogId, int buildId) throws DbException, SQLException, CacheException {
		CodeBuildPropertyExample condition = new CodeBuildPropertyExample();
		condition.or().andBuildIdEqualTo(buildId).andBuildPropertyNameEqualTo("logFile");
		List<CodeBuildProperty> propList = systemBiz.codeBuildPropertySelectObjects(condition);
		if (propList.size() > 0) {
			CodeBuildProperty prop = propList.get(0);
			String value = prop.getBuildPropertyValue();
			value = getPropValue(value, buildId, buildLogId);
			return value;
		}
		return "";

	}

	private void execParentBuild(int buildId, List<CodeBuild> childBuildList) {
		try {
			CodeBuild codeBuild = systemBiz.codeBuildSelectByPrimaryKey(buildId);
			if (codeBuild == null)
				return;
			CodeBuildPropertyExample condition = new CodeBuildPropertyExample();
			condition.or().andBuildIdEqualTo(buildId);
			List<CodeBuildProperty> propList = systemBiz.codeBuildPropertySelectObjects(condition);
			// call cmd path
			HashMap<String, String> propMap = new HashMap<String, String>();
			for (CodeBuildProperty item : propList) {
				String key = item.getBuildPropertyName().toLowerCase();
				propMap.put(key, item.getBuildPropertyValue());
			}
			CodeBuildLog cbLog = new CodeBuildLog();
			cbLog.setBuildId(buildId);
			cbLog.setBuildMessage("构建中...");
			cbLog.setBuildOperator(getLoginUser().getLoginUser().getLoginName());
			cbLog.setBuildResult(0);
			cbLog.setBuildStartTime(new Date());
			cbLog.setBuildState(1);
			systemBiz.codeBuildLogInsert(cbLog);
			try {
				log.debug("execute build " + buildId + "; logId = " + cbLog.getBuildLogId());
				// cmdPath
				String resultFile = propMap.get("targetZipFile".toLowerCase());
				resultFile = getPropValue(resultFile, buildId, cbLog.getBuildLogId());
				String workspace = propMap.get("workspace");
				workspace = getPropValue(workspace, buildId, cbLog.getBuildLogId());
				if (StringUtils.isNullOrEmpty(workspace)) {
					throw new Exception("请设置工作区属性");
				}
				List<String> zipFiles = new ArrayList<String>();
				for (CodeBuild item : childBuildList) {
					String result = execBuild(item.getBuildId());
					zipFiles.add(result);
				}
				// 打包提供下载
				// 清理工作区
				File workspaceFile = new File(workspace);
				if (!workspaceFile.exists()) {
					workspaceFile.mkdirs();
				}

				deleteChildFile(workspaceFile);
				for (String item : zipFiles) {
					File srcFile = new File(item);
					File destFile = new File(workspace + "/" + srcFile.getName());
					copyFile(srcFile, destFile);
				}
				int pos = resultFile.lastIndexOf("/");
				String resultPath = resultFile.substring(0, pos);
				File rf = new File(resultPath);
				if (!rf.exists()) {
					rf.mkdirs();
				}

				FileUtils fileUtil = new FileUtils();
				fileUtil.zip(workspace, resultFile);
				executeMessage += "构建--" + codeBuild.getBuildName() + "--成功";
				cbLog.setBuildState(2);
				cbLog.setBuildResult(1);
				cbLog.setBuildMessage("构建成功");
				cbLog.setBuildEndTime(new Date());
				systemBiz.codeBuildLogUpdate(cbLog);
			} catch (Exception e) {
				cbLog.setBuildState(2);
				cbLog.setBuildResult(2);
				cbLog.setBuildMessage(e.getMessage());
				cbLog.setBuildEndTime(new Date());
				systemBiz.codeBuildLogUpdate(cbLog);
				throw e;
			}
		} catch (Exception ex) {
			executeMessage += ex.getMessage();
			log.error(ex.getMessage(), ex);
		}

	}

	private String getPropValue(String value, int buildId, int buildLogId) {
		if (StringUtils.isNullOrEmpty(value)) {
			return "";
		}
		value = value.replaceAll("\\$\\{buildId\\}", "" + buildId);
		value = value.replaceAll("\\$\\{buildLogId\\}", "" + buildLogId);
		return value;
	}

	private void deleteChildFile(File f) {
		File[] childFiles = f.listFiles();
		if (childFiles == null) {
			return;
		}
		for (File item : childFiles) {
			if (item.getName().equals(".") || item.getName().equals("..")) {
				continue;
			}
			if (item.isDirectory()) {
				deleteChildFile(item);
				item.delete();
			} else {
				item.delete();
			}
		}
	}

	private void copyFile(File srcFile, File destFile) throws IOException {
		InputStream is = new FileInputStream(srcFile);
		OutputStream os = new FileOutputStream(destFile);
		byte[] buf = new byte[4096 * 1024];
		int readCount = is.read(buf);
		while (readCount > 0) {
			os.write(buf, 0, readCount);
			readCount = is.read(buf);
		}
		is.close();
		os.flush();
		os.close();
	}

	public String downloadFile() throws IOException, DbException, SQLException, CacheException {
		if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Execute)) {
			return NO_PRIVILEGES;
		}
		if (buildLogId > 0) {
			CodeBuildLog buildLog = systemBiz.codeBuildLogSelectByPrimaryKey(buildLogId);
			String targetZipFile = getTargetZipFile(buildLogId, buildLog.getBuildId());
			// build file
			String path = targetZipFile;
			File f = new File(path);
			int pos = path.lastIndexOf("/");
			String fileName = path.substring(pos + 1);

			HttpServletResponse response = ServletActionContext.getResponse();
			// response.setCharacterEncoding("gb2312");
			response.addHeader("Content-Disposition", "attachment;filename=" + fileName);
			response.setContentType("application/octet-stream");

			// 写流文件到前端浏览器
			ServletOutputStream out = response.getOutputStream();
			BufferedInputStream bis = null;
			BufferedOutputStream bos = null;
			try {
				bis = new BufferedInputStream(new FileInputStream(f));
				bos = new BufferedOutputStream(out);
				byte[] buff = new byte[2048];
				int bytesRead;
				while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
					bos.write(buff, 0, bytesRead);
				}
			} catch (IOException e) {
				log.error(e);
			} finally {
				if (bis != null)
					bis.close();
				if (bos != null)
					bos.close();
			}
			response.getOutputStream().flush();
			return null;
		}
		return SUCCESS;
	}

	public String downloadLogFile() throws IOException, DbException, SQLException, CacheException {
		if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Execute)) {
			return NO_PRIVILEGES;
		}
		if (buildLogId > 0) {
			CodeBuildLog buildLog = systemBiz.codeBuildLogSelectByPrimaryKey(buildLogId);
			String logFile = getLogFile(buildLogId, buildLog.getBuildId());
			File f = new File(logFile);
			int pos = logFile.lastIndexOf("/");
			String fileName = logFile.substring(pos + 1);

			HttpServletResponse response = ServletActionContext.getResponse();
			// response.setCharacterEncoding("gb2312");
			response.addHeader("Content-Disposition", "attachment;filename=" + fileName);
			response.setContentType("application/octet-stream");

			// 写流文件到前端浏览器
			ServletOutputStream out = response.getOutputStream();
			BufferedInputStream bis = null;
			BufferedOutputStream bos = null;
			try {
				bis = new BufferedInputStream(new FileInputStream(f));
				bos = new BufferedOutputStream(out);
				byte[] buff = new byte[2048];
				int bytesRead;
				while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
					bos.write(buff, 0, bytesRead);
				}
			} catch (IOException e) {
				log.error(e);
			} finally {
				if (bis != null)
					bis.close();
				if (bos != null)
					bos.close();
			}
			response.getOutputStream().flush();
			return null;
		}
		return SUCCESS;
	}

	private void deleteFile(File f) {
		if (f == null) {
			return;
		}
		if (!f.exists()) {
			return;
		}
		if (f.isDirectory()) {
			for (File item : f.listFiles()) {
				if (item.getName().equals(".") || item.getName().equals("..")) {
					continue;
				}
				deleteFile(item);
			}
			f.delete();
		} else {
			f.delete();
		}
	}

	public String ajaxDelete() {
		if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Execute)) {
			return NO_PRIVILEGES;
		}
		String result = "";
		try {
			if (buildLogId > 0) {
				CodeBuildLog cbl = systemBiz.codeBuildLogSelectByPrimaryKey(buildLogId);
				if (cbl != null) {
					String targetZipFile = getTargetZipFile(buildLogId, cbl.getBuildId());
					int pos = targetZipFile.lastIndexOf("/");
					File file = new File(targetZipFile.substring(0, pos));
					deleteFile(file);
					CodeBuildLogExample condition = new CodeBuildLogExample();
					condition.or().andBuildLogIdEqualTo(buildLogId);
					systemBiz.codeBuildLogDeleteByCondition(condition);
				}
			}
			result = "ok";
		} catch (Exception ex) {
			result = ex.getMessage();
		}
		jsonObj = result;
		return AJAX;
	}

	public String ajaxViewLog() {
		if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Execute)) {
			return NO_PRIVILEGES;
		}
		Map<String, Object> data = new HashMap<String, Object>();
		List<String> msgs = new ArrayList<String>();
		boolean readStop = false;
		try {
			CodeBuildLog buildLog = systemBiz.codeBuildLogSelectByPrimaryKey(buildLogId);

			String logFile = getLogFile(buildLogId, buildLog.getBuildId());
			// detector是探测器，它把探测任务交给具体的探测实现类的实例完成。
			CodepageDetectorProxy proxy = CodepageDetectorProxy.getInstance();

			// ParsingDetector可用于检查HTML、XML等文件或字符流的编码,构造方法中的参数用于指示是否显示探测过程的详细信息，为false不显示。
			// JChardetFacade封装了由Mozilla组织提供的JChardet，它可以完成大多数文件的编码 。
			proxy.add(new ParsingDetector(false));
			proxy.add(JChardetFacade.getInstance());
			proxy.add(ASCIIDetector.getInstance());
			proxy.add(UnicodeDetector.getInstance());
			long position = 0;
			if (StringUtils.isNullOrEmpty(logFile)) {
				data.put("result", "没有定义logFile");
			} else {
				// log.debug("read logfile="+logFile);
				File logF = new File(logFile);
				String logPageCode = "";
				if (!logF.exists()) {
					data.put("result", "日志文件不存在");
				} else {
					Charset cset = null;
					cset = proxy.detectCodepage(logF.toURI().toURL());
					if (cset != null) {
						logPageCode = cset.name();
						System.out.println(logPageCode);
					} else {
						data.put("result", "查不到对应的log日志文件编码格式");
					}
					RandomAccessFile randomFile = new RandomAccessFile(logF, "r");
					randomFile.seek(buildLogViewPos);
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					byte[] buf = new byte[512];
					int readCount = randomFile.read(buf);
					while (readCount >= 0) {
						baos.write(buf, 0, readCount);
						readCount = randomFile.read(buf);
					}
					position = randomFile.length();
					byte[] content = baos.toByteArray();
					ByteArrayInputStream bais = new ByteArrayInputStream(content);
					InputStreamReader isr = new InputStreamReader(bais, "gbk");
					BufferedReader br = new BufferedReader(isr);
					String line = br.readLine();
					while (line != null) {
						msgs.add(line);
						line = br.readLine();
					}
					br.close();

					if (!logEnd) {
						int buildState = buildLog.getBuildState();
						if (buildState == 2) {
							logEnd = true;
						}
					} else {
						readStop = true;
					}
					data.put("result", "ok");
				}
				data.put("position", position);
				data.put("loginfo", msgs);
				data.put("logEnd", logEnd);
				data.put("readStop", readStop);
			}
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			data.put("result", ex.getMessage());
		}

		jsonObj = data;
		return AJAX;
	}

	public String ajaxQueryCodeBuildList() {
		if (!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Read)) {
			return NO_PRIVILEGES;
		}
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			CodeBuildLogExample condition = new CodeBuildLogExample();
			condition.or().andBuildIdEqualTo(buildId);
			condition.setPage(new PageImpl(0, 5));
			condition.setOrderByClause("BUILD_LOG_ID desc");
			List<CodeBuildLog> list = systemBiz.codeBuildLogSelectObjects(condition);
			map.put("data", list);
			map.put("result", "ok");
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			map.put("result", e.getMessage());
		}
		jsonObj = map;
		return AJAX;
	}

	private void checkLogFilePath(String logFile) {
		if (StringUtils.isNullOrEmpty(logFile))
			return;
		int pos = logFile.lastIndexOf("/");
		String path = logFile.substring(0, pos);
		File f = new File(path);
		if (!f.exists()) {
			f.mkdirs();
		}
	}

	/**
	 * @return the buildId
	 */
	public int getBuildId() {
		return buildId;
	}

	/**
	 * @param buildId the buildId to set
	 */
	public void setBuildId(int buildId) {
		this.buildId = buildId;
	}

	public boolean isLogEnd() {
		return logEnd;
	}

	public void setLogEnd(boolean logEnd) {
		this.logEnd = logEnd;
	}

	@Override
	public int getRowsCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the buildLogList
	 */
	public List<CodeBuildLog> getBuildLogList() {
		return buildLogList;
	}

	/**
	 * @return the allowBuild
	 */
	public boolean isAllowBuild() {
		return allowBuild;
	}

	/**
	 * @return the executeMessage
	 */
	public String getExecuteMessage() {
		return executeMessage;
	}

	/**
	 * @return the buildLogId
	 */
	public int getBuildLogId() {
		return buildLogId;
	}

	/**
	 * @param buildLogId the buildLogId to set
	 */
	public void setBuildLogId(String buildLogId) {
		this.buildLogId = Integer.parseInt(buildLogId);
	}

	/**
	 * @return the codeBuild
	 * @throws SQLException
	 * @throws DbException
	 * @throws CacheException
	 */
	public CodeBuild getCodeBuild() throws DbException, SQLException, CacheException {
		if (codeBuild == null && buildId > 0) {
			codeBuild = systemBiz.codeBuildSelectByPrimaryKey(buildId);
		}
		return codeBuild;
	}

	/**
	 * @return the buildLogViewPos
	 */
	public long getBuildLogViewPos() {
		return buildLogViewPos;
	}

	/**
	 * @param buildLogViewPos the buildLogViewPos to set
	 */
	public void setBuildLogViewPos(long buildLogViewPos) {
		this.buildLogViewPos = buildLogViewPos;
	}

	public void run() {
		CodeBuildLog cbLog;
		try {
			cbLog = systemBiz.codeBuildLogSelectByPrimaryKey(buildLogId);
			try {
				CodeBuild codeBuild = systemBiz.codeBuildSelectByPrimaryKey(buildId);
				List<CodeBuild> childBuildList = systemBiz.codeBuildSelectObjectsByParentId(buildId);
				CodeBuildPropertyExample condition = new CodeBuildPropertyExample();
				condition.or().andBuildIdEqualTo(buildId);
				List<CodeBuildProperty> propList = systemBiz.codeBuildPropertySelectObjects(condition);
				HashMap<String, String> propMap = new HashMap<String, String>();
				for (CodeBuildProperty item : propList) {
					String key = item.getBuildPropertyName().toLowerCase();
					propMap.put(key, item.getBuildPropertyValue());
				}
				log.debug("execute build " + buildId + "; logId = " + buildLogId);
				if (childBuildList.size() > 0) {
					// cmdPath
					String resultFile = propMap.get("targetZipFile".toLowerCase());
					resultFile = getPropValue(resultFile, buildId, cbLog.getBuildLogId());
					String workspace = propMap.get("workspace");
					workspace = getPropValue(workspace, buildId, cbLog.getBuildLogId());
					if (StringUtils.isNullOrEmpty(workspace)) {
						throw new Exception("请设置工作区属性");
					}
					List<String> zipFiles = new ArrayList<String>();
					for (CodeBuild item : childBuildList) {
						String result = execBuild(item.getBuildId());
						zipFiles.add(result);
					}
					// 打包提供下载
					// 清理工作区
					File workspaceFile = new File(workspace);
					if (!workspaceFile.exists()) {
						workspaceFile.mkdirs();
					}

					deleteChildFile(workspaceFile);
					for (String item : zipFiles) {
						File srcFile = new File(item);
						File destFile = new File(workspace + "/" + srcFile.getName());
						copyFile(srcFile, destFile);
					}
					int pos = resultFile.lastIndexOf("/");
					String resultPath = resultFile.substring(0, pos);
					File rf = new File(resultPath);
					if (!rf.exists()) {
						rf.mkdirs();
					}

					FileUtils fileUtil = new FileUtils();
					fileUtil.zip(workspace, resultFile);
					executeMessage += "构建--" + codeBuild.getBuildName() + "--成功";
					cbLog.setBuildState(2);
					cbLog.setBuildResult(1);
					cbLog.setBuildMessage("构建成功");
					cbLog.setBuildEndTime(new Date());
					systemBiz.codeBuildLogUpdate(cbLog);

				} else {
					// cmdPath
					String command = propMap.get("command");
					String resultFile = propMap.get("targetZipFile".toLowerCase());
					resultFile = getPropValue(resultFile, buildId, buildLogId);
					command = getPropValue(command, buildId, buildLogId);
					log.debug(command);
					String[] cmd = new String[] {
							"/bin/bash", "-c", command
					};
					int execResult = new common.util.Runtime().run(cmd, true);
					cbLog.setBuildState(2);
					if (execResult == 0) {
						executeMessage += "构建--" + codeBuild.getBuildName() + "--成功";
						cbLog.setBuildResult(1);
						cbLog.setBuildMessage("构建成功");
					} else {
						executeMessage += "构建失败，返回值" + execResult;
						cbLog.setBuildResult(2);
						cbLog.setBuildMessage("构建失败");
					}
					cbLog.setBuildEndTime(new Date());
					systemBiz.codeBuildLogUpdate(cbLog);
				}
			} catch (Exception e) {
				cbLog.setBuildState(2);
				cbLog.setBuildResult(2);
				cbLog.setBuildMessage(e.getMessage());
				cbLog.setBuildEndTime(new Date());
				systemBiz.codeBuildLogUpdate(cbLog);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			log.error(e1.getMessage(), e1);
		}
	}
}
