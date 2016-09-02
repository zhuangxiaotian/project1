/**
 * 
 */
package cn.topdeep.projgroup.action.work;

import cn.topdeep.projgroup.action.BaseAction;
import java.util.*;
import java.io.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import common.util.StringUtils;
import common.util.TwoTuple;

/**
 * @author niexin
 *
 */
public class ProjectBuild extends BaseAction {
	
	private int projectId;
	
	private List<TwoTuple<String, String>> buildList = new ArrayList<TwoTuple<String, String>>();
	
	private List<TwoTuple<String, String>> downloadList = new ArrayList<TwoTuple<String, String>>();

	
	public String execute() throws Exception{
		//readConfig to set buildlist and downloadList;
		String path = "d:/server/ProjectManage/"+projectId+"/build/build.config";
		File configFile = new File(path);
		if(configFile.exists()){
			StringBuffer buffer = new StringBuffer();
			InputStream in = new FileInputStream(configFile);
			BufferedReader reader = new BufferedReader(new InputStreamReader(in,"utf-8"));
			String line = null;
			line = reader.readLine();
			List<TwoTuple<String, String>> configList = null;
			while(line != null){
				String temp = line.trim();
				line = reader.readLine();
				if (temp.startsWith("#")){
					continue;
				}
				if (StringUtils.isNullOrEmpty(temp)){
					continue;
				}
				if(temp.startsWith("[")){  //保存SectionName
					if(temp.equals("[build]")){
						configList = buildList;
					}else if(temp.equals("[download]")){
						configList = downloadList;
					}else{
						configList = null;
					}
					continue;
				}
				else{
					if (configList == null){
						continue;
					}
					String[] keyvalue = temp.split("=");
					if(keyvalue.length == 2 ){
						TwoTuple<String, String> obj = new  TwoTuple<String, String>(keyvalue[0].trim(), keyvalue[1].trim());
						configList.add(obj);
					}
				}
			}
			reader.close();

		}
		return SUCCESS;
	}
	
	private String execFilePath;
	
	public String execBuild(){
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(StringUtils.isNullOrEmpty(execFilePath) || projectId <= 0){
			map.put("msg", "没有输入可执行文件或者项目无效");
		}else{
			log.debug("execfilePath="+execFilePath);
			String[] execFilePathParams = execFilePath.split("\\|");
			int paramLength = 6 + execFilePathParams.length;
			String path = "d:/server/ProjectManage/"+projectId+"/build/"+execFilePathParams[0];
			log.debug("build file is: "+path);
			File f = new File(path);
			if(!f.exists()){
				map.put("msg", "无效的可执行文件");
			}else{
	        	String[] cmd = new String[paramLength];
	        	int k=0;
	        	cmd[k++] = "cmd";
	        	cmd[k++] = "/c";
	        	cmd[k++] ="ant";
	        	cmd[k++] = "-buildfile";
	        	cmd[k++] = path;
	        	cmd[k++] = "-l";
	        	cmd[k++] = "d:/server/ProjectManage/"+projectId+"/build/work/build.log";
	        	for(int i=1;i<execFilePathParams.length;i++){
	        		cmd[k++] = execFilePathParams[i];
	        	}
	        	//cmd[5] = "/home/beaweb/bea/user_projects/domains/mydomain/applications/huaanwap.webadmin/anttask/lib";
//	        	cmd[5] = "--noconfig";
	        	try {
					int execResult = new common.util.Runtime().run(cmd, true);
					if(execResult == 0){
						map.put("msg", "构建成功，请自行下载需要的文件");
					}else{
						map.put("msg", "构建失败，返回值"+execResult);
					}
				} catch (Exception e) {
					map.put("msg", e.getMessage());
					log.debug("execBuild error", e);
				}
			}
		}
		jsonObj = map;
		return AJAX;
	}

	public String downloadFile() throws IOException{
		if(projectId > 0){
			//build file
			String path = "d:/server/ProjectManage/"+projectId+"/build/"+execFilePath;
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
	
	/**
	 * @return the execFilePath
	 */
	public String getExecFilePath() {
		return execFilePath;
	}

	/**
	 * @param execFilePath the execFilePath to set
	 */
	public void setExecFilePath(String execFilePath) {
		this.execFilePath = execFilePath;
	}

	
	/**
	 * @return the buildList
	 */
	public List<TwoTuple<String, String>> getBuildList() {
		return buildList;
	}

	/**
	 * @return the downloadList
	 */
	public List<TwoTuple<String, String>> getDownloadList() {
		return downloadList;
	}

	/**
	 * @return the projectId
	 */
	public int getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	
}
