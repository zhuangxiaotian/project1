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
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
import cn.topdeep.projgroup.entity.CodeBuild;
import cn.topdeep.projgroup.entity.CodeBuildLog;
import cn.topdeep.projgroup.entity.CodeBuildProperty;
import cn.topdeep.projgroup.entity.CodeBuildPropertyQueryCondition;
import cn.topdeep.projgroup.entity.DbException;

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
	public String execute() throws Exception{
		buildLogList = systemBiz.codeBuildLogSelectObjects(" where build_id = "+buildId+" order by BUILD_LOG_ID desc");
		List<CodeBuild> list = projectBiz.codeBuildSelectObjects(" where parent_build_id = " + buildId);
		for(int i=0; i<list.size(); i++){
			buildLogChildList=systemBiz.codeBuildLogSelectObjects(" where build_id = "+list.get(i).getBuildId()+" order by BUILD_LOG_ID desc");
			buildLogList.addAll(buildLogChildList);
			Collections.sort(buildLogList, new Comparator() {  
		          public int compare(Object a, Object b) {  
		            int one = ((CodeBuildLog)a).getBuildLogId();  
		            int two = ((CodeBuildLog)b).getBuildLogId();   
		            return two- one ;   
		          }  
			});
		}
		List<CodeBuild> childBuildList = systemBiz.codeBuildSelectObjects(" where PARENT_BUILD_ID = "+buildId);
		String buildIds = "" + buildId;
		for(CodeBuild item : childBuildList){
			if(!StringUtils.isNullOrEmpty(buildIds)){
				buildIds += ",";
			}
			buildIds += item.getBuildId();
		}
		int buildLogCount = systemBiz.codeBuildLogQuerySelectObjectsCount(" where (build_id in ("+buildIds +"))  and build_state = 1");
			
		CodeBuild codeBuild = systemBiz.codeBuildSelectByBuildId(buildId);
		if(codeBuild != null){
			List<CodeBuildProperty> propList = systemBiz.codeBuildPropertySelectObjects(new CodeBuildPropertyQueryCondition().setBuildIdCondition(buildId).setBuildPropertyNameConditionEqual("targetZipFile"));
			if(propList.size() > 0){
				CodeBuildProperty prop = propList.get(0);
				String value = prop.getBuildPropertyValue();
				value = value.replaceAll("\\$\\{buildId\\}", ""+buildId);
				for(CodeBuildLog item : buildLogList){
					item.setPub0(value.replaceAll("\\$\\{buildLogId\\}", ""+item.getBuildLogId()));
				}
			}
		}
		allowBuild = buildLogCount == 0;
		return SUCCESS;
	}
	
	public String build() throws Exception{
		List<CodeBuild> childBuildList = systemBiz.codeBuildSelectObjects(" where PARENT_BUILD_ID = "+buildId);
		String buildIds = "" + buildId;
		for(CodeBuild item : childBuildList){
			if(!StringUtils.isNullOrEmpty(buildIds)){
				buildIds += ",";
			}
			buildIds += item.getBuildId();
		}
		int buildLogCount = systemBiz.codeBuildLogQuerySelectObjectsCount(" where (build_id in ("+buildIds +"))  and build_state = 1");
		allowBuild = buildLogCount == 0;
		if(allowBuild){
			if(childBuildList.size() > 0){
				execParentBuild(buildId, childBuildList);
			}else{
				execBuild(buildId);
			}
		}
		return execute();
	}
	
	private String execBuild(int buildId){
		try{
			CodeBuild codeBuild = systemBiz.codeBuildSelectByBuildId(buildId);
			if(codeBuild == null) return "";
			List<CodeBuildProperty> propList = systemBiz.codeBuildPropertySelectObjectsByBuildId(buildId);
			//call cmd path
			HashMap<String, String> propMap = new HashMap<String, String>();
			for(CodeBuildProperty item : propList){
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
			try{
				log.debug("execute build "+buildId+"; logId = "+cbLog.getBuildLogId());
				//cmdPath
				String command = propMap.get("command");
				String resultFile = propMap.get("targetZipFile".toLowerCase());
 	 			resultFile = getPropValue(resultFile, buildId, cbLog.getBuildLogId());
 	 			command = getPropValue(command, buildId, cbLog.getBuildLogId());
				String[] cmd = command.split("\\s");
				
				int execResult = new common.util.Runtime().run(cmd, true);
				cbLog.setBuildState(2);
				if(execResult == 0){
					executeMessage +=  "构建--"+codeBuild.getBuildName()+"--成功";
					cbLog.setBuildResult(1);
					cbLog.setBuildMessage("构建成功");
				}else{
					executeMessage += "构建失败，返回值"+execResult;
					cbLog.setBuildResult(2);
					cbLog.setBuildMessage("构建失败");
				}
				cbLog.setBuildEndTime(new Date());
				systemBiz.codeBuildLogUpdate(cbLog);
				return resultFile;
			}catch(Exception e){
				cbLog.setBuildState(2);
				cbLog.setBuildResult(2);
				cbLog.setBuildMessage(e.getMessage());
				cbLog.setBuildEndTime(new Date());
				systemBiz.codeBuildLogUpdate(cbLog);
				throw e;
			}
		}catch(Exception ex){
			executeMessage += ex.getMessage();
			log.error(ex.getMessage(),ex);
		}
		return "";
	}

	public String ajaxBuild(){
		Map<String, String> map = new HashMap<String, String>();
		try{
			List<CodeBuild> childBuildList = systemBiz.codeBuildSelectObjects(" where PARENT_BUILD_ID = "+buildId);
			String buildIds = "" + buildId;
			for(CodeBuild item : childBuildList){
				if(!StringUtils.isNullOrEmpty(buildIds)){
					buildIds += ",";
				}
				buildIds += item.getBuildId();
			}
			int buildLogCount = systemBiz.codeBuildLogQuerySelectObjectsCount(" where (build_id in ("+buildIds +"))  and build_state = 1");
			allowBuild = buildLogCount == 0;
			if(allowBuild){
				try{
					CodeBuild codeBuild = systemBiz.codeBuildSelectByBuildId(buildId);
					if(codeBuild == null) {
						throw new Exception("无效的构建");
					}
					//call cmd path
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
					
					map.put("buildLogId", ""+cbLog.getBuildLogId());
					map.put("result", "ok");
					map.put("message", "构建已开始");
				}catch(Exception ex){
					executeMessage += ex.getMessage();
					log.error(ex.getMessage(),ex);
				}
			}else{
				map.put("result", "已有构建进行中，请稍候再试");
			}

		}catch(Exception ex){
			log.error(ex.getMessage(), ex);
			map.put("result", ex.getMessage());
		}
		jsonObj = map;
		return AJAX;
	}

	private String getTargetZipFile(int buildLogId, int buildId) throws DbException, SQLException{
		List<CodeBuildProperty> propList = systemBiz.codeBuildPropertySelectObjects(new CodeBuildPropertyQueryCondition().setBuildIdCondition(buildId).setBuildPropertyNameConditionEqual("targetZipFile"));
		if(propList.size() > 0){
			CodeBuildProperty prop = propList.get(0);
			String value = prop.getBuildPropertyValue();
			value = getPropValue(value, buildId, buildLogId);
			return value;
		}
		return "";
	}
	
	private String getLogFile(int buildLogId, int buildId) throws DbException, SQLException{
		List<CodeBuildProperty> propList = systemBiz.codeBuildPropertySelectObjects(new CodeBuildPropertyQueryCondition().setBuildIdCondition(buildId).setBuildPropertyNameConditionEqual("logFile"));
		if(propList.size() > 0){
			CodeBuildProperty prop = propList.get(0);
			String value = prop.getBuildPropertyValue();
			value = getPropValue(value, buildId, buildLogId);
			return value;
		}
		return "";

	}
	
	private void execParentBuild(int buildId, List<CodeBuild> childBuildList){
		try{
			CodeBuild codeBuild = systemBiz.codeBuildSelectByBuildId(buildId);
			if(codeBuild == null) return;
			List<CodeBuildProperty> propList = systemBiz.codeBuildPropertySelectObjectsByBuildId(buildId);
			//call cmd path
			HashMap<String, String> propMap = new HashMap<String, String>();
			for(CodeBuildProperty item : propList){
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
			try{
				log.debug("execute build "+buildId+"; logId = "+cbLog.getBuildLogId());
				//cmdPath
				String resultFile = propMap.get("targetZipFile".toLowerCase());
				resultFile = getPropValue(resultFile, buildId, cbLog.getBuildLogId());
				String workspace = propMap.get("workspace");
				workspace = getPropValue(workspace, buildId, cbLog.getBuildLogId());
				if(StringUtils.isNullOrEmpty(workspace)){
					throw new Exception("请设置工作区属性");
				}
				List<String> zipFiles = new ArrayList<String>();
				for(CodeBuild item : childBuildList){
					String result = execBuild(item.getBuildId());
					zipFiles.add(result);
				}
				//打包提供下载
				//清理工作区
				File workspaceFile = new File(workspace);
				if(!workspaceFile.exists()){
					workspaceFile.mkdirs();
				}
				
				deleteChildFile(workspaceFile);
				for(String item : zipFiles){
					File srcFile = new File(item);
					File destFile = new File(workspace+"/"+srcFile.getName());
					copyFile(srcFile, destFile);
				}
				int pos = resultFile.lastIndexOf("/");
				String resultPath = resultFile.substring(0,pos);
				File rf = new File(resultPath);
				if(!rf.exists()){
					rf.mkdirs();
				}
				
				FileUtils fileUtil = new FileUtils();
				fileUtil.zip(workspace, resultFile);
				executeMessage +=  "构建--"+codeBuild.getBuildName()+"--成功";
				cbLog.setBuildState(2);
				cbLog.setBuildResult(1);
				cbLog.setBuildMessage("构建成功");
				cbLog.setBuildEndTime(new Date());
				systemBiz.codeBuildLogUpdate(cbLog);
			}catch(Exception e){
				cbLog.setBuildState(2);
				cbLog.setBuildResult(2);
				cbLog.setBuildMessage(e.getMessage());
				cbLog.setBuildEndTime(new Date());
				systemBiz.codeBuildLogUpdate(cbLog);
				throw e;
			}
		}catch(Exception ex){
			executeMessage += ex.getMessage();
			log.error(ex.getMessage(),ex);
		}
	
	}
	
	private String getPropValue(String value, int buildId, int buildLogId){
		if(StringUtils.isNullOrEmpty(value)){
			return "";
		}
		value = value.replaceAll("\\$\\{buildId\\}", ""+buildId);
		value = value.replaceAll("\\$\\{buildLogId\\}", ""+buildLogId);
		return value;
	}
	
	private void deleteChildFile(File f){
		File[] childFiles = f.listFiles();
		if(childFiles == null){
			return;
		}
		for(File item : childFiles){
			if(item.getName().equals(".") || item.getName().equals("..")){
				continue;
			}
			if(item.isDirectory()){
				deleteChildFile(item);
				item.delete();
			}else{
				item.delete();
			}
		}
	}
	
	private void copyFile(File srcFile, File destFile) throws IOException{
		InputStream is = new FileInputStream(srcFile);
		OutputStream os = new FileOutputStream(destFile);
		byte[] buf = new byte[4096 * 1024];
		int readCount = is.read(buf);
		while(readCount > 0){
			os.write(buf, 0, readCount);
			readCount = is.read(buf);
		}
		is.close();
		os.flush();
		os.close();
	}
	
	public String downloadFile() throws IOException, DbException, SQLException{
		if(buildLogId > 0){
			CodeBuildLog buildLog = systemBiz.codeBuildLogSelectByBuildLogId(buildLogId);
			String targetZipFile = getTargetZipFile(buildLogId, buildLog.getBuildId());
			//build file
			String path = targetZipFile;
			File f = new File(path);
			int pos = path.lastIndexOf("/");
			String fileName = path.substring(pos+1);
			
			HttpServletResponse response = ServletActionContext.getResponse();
			//response.setCharacterEncoding("gb2312");
			response.addHeader("Content-Disposition", "attachment;filename="+fileName);
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

	public String downloadLogFile() throws IOException, DbException, SQLException{
		if(buildLogId > 0){
			CodeBuildLog buildLog = systemBiz.codeBuildLogSelectByBuildLogId(buildLogId);
			String logFile = getLogFile(buildLogId, buildLog.getBuildId());
			File f = new File(logFile);
			int pos = logFile.lastIndexOf("/");
			String fileName = logFile.substring(pos+1);
			
			HttpServletResponse response = ServletActionContext.getResponse();
			//response.setCharacterEncoding("gb2312");
			response.addHeader("Content-Disposition", "attachment;filename="+fileName);
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
	
	public String ajaxDelete(){
		String result = "";
		try{
			if(buildLogId > 0){
				CodeBuildLog cbl = systemBiz.codeBuildLogSelectByBuildLogId(buildLogId);
				if(cbl != null){
					String targetZipFile = getTargetZipFile(buildLogId, cbl.getBuildId());
					File file = new File(targetZipFile);
					if(file.exists()){
						file.delete();
					}
					systemBiz.codeBuildLogDeleteByBuildLogId(buildLogId);
				}
			}
			result = "ok";
		}catch(Exception ex){
			result = ex.getMessage();
		}
		jsonObj = result;
		return AJAX;
	}
	
	public String ajaxViewLog(){
		Map<String, Object> data = new HashMap<String, Object>();
		List<String> msgs=new ArrayList<String>();
		boolean readStop=false;
		try{
			CodeBuildLog buildLog = systemBiz.codeBuildLogSelectByBuildLogId(buildLogId);
			
			String logFile = getLogFile(buildLogId, buildLog.getBuildId());
			//detector是探测器，它把探测任务交给具体的探测实现类的实例完成。 
			CodepageDetectorProxy proxy = CodepageDetectorProxy.getInstance();
			
			// ParsingDetector可用于检查HTML、XML等文件或字符流的编码,构造方法中的参数用于指示是否显示探测过程的详细信息，为false不显示。 
			//JChardetFacade封装了由Mozilla组织提供的JChardet，它可以完成大多数文件的编码 。 
			proxy.add(new ParsingDetector(false));
			proxy.add(JChardetFacade.getInstance());
			proxy.add(ASCIIDetector.getInstance());
			proxy.add(UnicodeDetector.getInstance());
			if(StringUtils.isNullOrEmpty(logFile)){
				data.put("result", "没有定义logFile");
			}else{
				File log = new File(logFile);
				String logPageCode = "";
				if(!log.exists()){
					data.put("result", "日志文件不存在");
				}else{
					Charset cset = null;
					cset = proxy.detectCodepage(log.toURI().toURL());
					if (cset != null) {
						logPageCode = cset.name();
						System.out.println(logPageCode);
					} else {
						data.put("result", "查不到对应的log日志文件编码格式");
					}
					RandomAccessFile randomFile = new RandomAccessFile(log, "r");
					ByteArrayOutputStream array = new ByteArrayOutputStream ();
					randomFile.seek(buildLogViewPos);
					byte[] b=new byte[Integer.valueOf((log.length())+ "")];
					String[] allLog;
					while ((randomFile.read(b)) != -1) {
						 array.write(b);
						 
						 //根据换行切割字符串存入集合
						 allLog = array.toString(logPageCode).split("\n");
						 for(int i=0;i<allLog.length;i++){
							 msgs.add(allLog[i]);
						 }
					}
					
					
					buildLogViewPos = randomFile.length();
					data.put("position", buildLogViewPos);
					if (!logEnd) {
							int buildState = buildLog.getBuildState();
							if (buildState == 2) {
								logEnd = true;
							} 
						} else {
							readStop = true;
						}
					}
					data.put("loginfo", msgs);
					data.put("result", "ok");
					data.put("logEnd", logEnd);
					data.put("readStop", readStop);
			}
		}catch(Exception ex){
			log.error(ex.getMessage(), ex);
			data.put("result", ex.getMessage());
		}
		
		jsonObj = data;
		return AJAX;
	}
	
	public String ajaxQueryCodeBuildList(){
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			List<CodeBuildLog> list = systemBiz.codeBuildLogSelectObjects(" where build_id = "+buildId, 0,5,"BUILD_LOG_ID", "desc");
			map.put("data", list);
			map.put("result", "ok");
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			map.put("result", e.getMessage());
		}
		jsonObj = map;
		return AJAX;
	}
	
	private void checkLogFilePath(String logFile){
		if(StringUtils.isNullOrEmpty(logFile))
			return;
		int pos = logFile.lastIndexOf("/");
		String path = logFile.substring(0,pos);
		File f = new File(path);
		if(!f.exists()){
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
	 */
	public CodeBuild getCodeBuild() throws DbException, SQLException {
		if(codeBuild == null && buildId > 0){
			codeBuild = systemBiz.codeBuildSelectByBuildId(buildId);
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
			cbLog = systemBiz.codeBuildLogSelectByBuildLogId(buildLogId);
			try{
				CodeBuild codeBuild = systemBiz.codeBuildSelectByBuildId(buildId);
				List<CodeBuild> childBuildList = systemBiz.codeBuildSelectObjects(" where PARENT_BUILD_ID = "+buildId);
				List<CodeBuildProperty> propList = systemBiz.codeBuildPropertySelectObjectsByBuildId(buildId);
				HashMap<String, String> propMap = new HashMap<String, String>();
				for(CodeBuildProperty item : propList){
					String key = item.getBuildPropertyName().toLowerCase();
					propMap.put(key, item.getBuildPropertyValue());
				}
				log.debug("execute build "+buildId+"; logId = "+buildLogId);
				if(childBuildList.size() > 0){
					//cmdPath
					String resultFile = propMap.get("targetZipFile".toLowerCase());
					resultFile = getPropValue(resultFile, buildId, cbLog.getBuildLogId());
					String workspace = propMap.get("workspace");
					workspace = getPropValue(workspace, buildId, cbLog.getBuildLogId());
					if(StringUtils.isNullOrEmpty(workspace)){
						throw new Exception("请设置工作区属性");
					}
					List<String> zipFiles = new ArrayList<String>();
					for(CodeBuild item : childBuildList){
						String result = execBuild(item.getBuildId());
						zipFiles.add(result);
					}
					//打包提供下载
					//清理工作区
					File workspaceFile = new File(workspace);
					if(!workspaceFile.exists()){
						workspaceFile.mkdirs();
					}
					
					deleteChildFile(workspaceFile);
					for(String item : zipFiles){
						File srcFile = new File(item);
						File destFile = new File(workspace+"/"+srcFile.getName());
						copyFile(srcFile, destFile);
					}
					int pos = resultFile.lastIndexOf("/");
					String resultPath = resultFile.substring(0,pos);
					File rf = new File(resultPath);
					if(!rf.exists()){
						rf.mkdirs();
					}
					
					FileUtils fileUtil = new FileUtils();
					fileUtil.zip(workspace, resultFile);
					executeMessage +=  "构建--"+codeBuild.getBuildName()+"--成功";
					cbLog.setBuildState(2);
					cbLog.setBuildResult(1);
					cbLog.setBuildMessage("构建成功");
					cbLog.setBuildEndTime(new Date());
					systemBiz.codeBuildLogUpdate(cbLog);

				}else{
					//cmdPath
					String command = propMap.get("command");
					String resultFile = propMap.get("targetZipFile".toLowerCase());
		 			resultFile = getPropValue(resultFile, buildId, buildLogId);
		 			command = getPropValue(command, buildId, buildLogId);
					String[] cmd = command.split("\\s");
					int execResult = new common.util.Runtime().run(cmd, true);
					cbLog.setBuildState(2);
					if(execResult == 0){
						executeMessage +=  "构建--"+codeBuild.getBuildName()+"--成功";
						cbLog.setBuildResult(1);
						cbLog.setBuildMessage("构建成功");
					}else{
						executeMessage += "构建失败，返回值"+execResult;
						cbLog.setBuildResult(2);
						cbLog.setBuildMessage("构建失败");
					}
					cbLog.setBuildEndTime(new Date());
					systemBiz.codeBuildLogUpdate(cbLog);
				}
			}catch(Exception e){
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
