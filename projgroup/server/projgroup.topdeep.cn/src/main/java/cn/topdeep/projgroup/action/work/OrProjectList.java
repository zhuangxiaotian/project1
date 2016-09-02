/**
 * $Id$
 */
package cn.topdeep.projgroup.action.work;

import cn.topdeep.projgroup.action.PageAction;

import java.io.File;
import java.sql.SQLException;
import java.util.*;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import common.cache2.CacheException;
import common.util.FileUtils;
import common.util.Path;
import cn.topdeep.projgroup.action.*;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.base.PageImpl;
import cn.topdeep.projgroup.entity.db.*;


/**
 * @author niexin
 *
 */
public class OrProjectList extends PageAction {

	private int projectId;
	
	private List<Project> projectList;
	
	public List<Project> getProjectList() throws DbException, SQLException, CacheException {
		if(projectList == null){
			ProjectExample condition = new ProjectExample();
			condition.setOrderByClause("PROJ_ID desc");
			projectList = getProjectBiz().projectSelectObjects(condition);
		}
		return projectList;
	}

	@Override
	public int getRowsCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String build() throws Exception{
		if(projectId > 0){
			//build file
			OrmappingProject orProject = getProjectBiz().ormappingProjectSelectByPrimaryKey(projectId);
			if(orProject == null){
				return execute();
			}
			
			if(buildFile(orProject) != 0){
				return execute();
			}
			String basePath = config.getEntityBuildConfigFilePath()+orProject.getProjId()+"/";
			String outputDir = basePath +"entity";
			String outputRealPath =  ServletActionContext.getServletContext().getRealPath(outputDir);
			String zipFile = basePath +"entity/entity.zip";
			String zipFileRealPath =  ServletActionContext.getServletContext().getRealPath(zipFile);
			
			File f = new File(zipFileRealPath);
			if(f.exists()){
				f.delete();
			}
			
			FileUtils fu = new FileUtils();
			//fu.zip("r:/testentity.zip", new File(outputRealPath));
			HttpServletResponse response = ServletActionContext.getResponse();
			//response.setCharacterEncoding("gb2312");
			response.addHeader("Content-Disposition", "attachment;filename=entity.zip");
			response.setContentType("application/zip");
			fu.zip(response.getOutputStream(), new File(outputRealPath));
			response.getOutputStream().flush();
			return null;
		}
		return execute();
	}
	
	private void checkFilePath(String path){
		File f = new File(path);
		if(!f.exists()){
			f.mkdirs();
		}
	}
	
	private int buildFile(OrmappingProject orProject){
		//--dbhost=192.168.0.18 --dbname=iccotest --username=iccouser --password=iccouser --projfile="D:\Project\Office\hugang\trunk\Attendance\design\db\Attendance.prjconfig" --dbconfig="D:\Project\Office\hugang\trunk\Attendance\design\db\Attendance.config" --usedb --updatedb --entitySaveDirectory="R:\iccotest"
		String basePath = config.getEntityBuildConfigFilePath()+orProject.getProjId()+"/";
		
		//String realPath = ServletActionContext.getServletContext().getRealPath(basePath);
		
		//checkFilePath(realPath);
		
		String orConfigFile = basePath +"projConfig.prjconfig";
		String orConfigRealPath = ServletActionContext.getServletContext().getRealPath(orConfigFile);
		
		String dbConfigFile = basePath + "dbConfig.config";
		String dbConfigRealPath = ServletActionContext.getServletContext().getRealPath(dbConfigFile);
		
		String outputDir = basePath +"entity";
		String outputRealPath =  ServletActionContext.getServletContext().getRealPath(outputDir);

		checkFilePath(outputRealPath);
		Path.delete(new File(outputRealPath));
		checkFilePath(outputRealPath);
		
		List<String> cmdList = new ArrayList<String>();
		cmdList.add(config.getEntityBuildCommandPath());
		cmdList.add("--dbhost="+orProject.getDbHost());
		cmdList.add("--dbname="+orProject.getDbName());
		cmdList.add("--username="+orProject.getDbUser());
		cmdList.add("--password="+orProject.getDbPass());
		cmdList.add("--projfile=\""+orConfigRealPath+"\"");
		cmdList.add("--dbconfig=\""+dbConfigRealPath+"\"");
		cmdList.add("--usedb");
		cmdList.add("--updatedb");
		cmdList.add("--entitySaveDirectory=\""+outputRealPath+"\"");
		//String[] cmd = new String[cmdList.size()];
		//cmd = cmdList.toArray(cmd);
		String cmd = "";
		for(int i=0;i<cmdList.size();i++){
			cmd += cmdList.get(i)+" ";
		}
		
		Runtime rt = Runtime.getRuntime();
		try{
			Process proc = rt.exec(cmd);
			if(true){
	        	StreamGobbler errorGobbler = new StreamGobbler(proc.getErrorStream(), "ERROR"); 
	        	// any output?
	        	StreamGobbler outputGobbler = new 
	        	StreamGobbler(proc.getInputStream(), "OUTPUT");
	        	// kick them off
	        	errorGobbler.start();
	        	outputGobbler.start();
	        	// any error???
	        	int exitVal = proc.waitFor();
	        	return exitVal;
	    	}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return 1;
		
		/*
    	cmd[1] = CmsConfig.getInstance().antCmdPath();
    	cmd[2] = "-buildfile";
    	cmd[3] = antFileName;
    	cmd[4] = "--execdebug";
    	//cmd[5] = "/home/beaweb/bea/user_projects/domains/mydomain/applications/huaanwap.webadmin/anttask/lib";
    	cmd[5] = "--noconfig";
    	Runtime rt = Runtime.getRuntime();
    	String execCmd = "Execing";
    	for(int i=0;i<cmd.length;i++){
    		execCmd += " "+cmd[i];
    	}
    	logger.debug(execCmd);
    	Process proc = rt.exec(cmd);
    	// any error message?
    	if(CmsConfig.getInstance().waitSyncproc()){
        	StreamGobbler errorGobbler = new 
        	StreamGobbler(proc.getErrorStream(), "ERROR"); 
        	// any output?
        	StreamGobbler outputGobbler = new 
        	StreamGobbler(proc.getInputStream(), "OUTPUT");
        	// kick them off
        	errorGobbler.start();
        	outputGobbler.start();
        	// any error???
        	int exitVal = proc.waitFor();
        	System.out.println("ExitValue: " + exitVal); 	        	
    	}
	} catch (Exception e) {
		logger.error(e.getMessage(),e);
	}
	*/
	}
	
	
	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	
	
	

}
