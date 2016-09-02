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
import cn.topdeep.projgroup.entity.*;


/**
 * @author niexin
 *
 */
public class OrProjectEdit extends BaseAction {

	private int projectId;
	
	private File prjFile;
	
	private String prjFileFileName;
	
	private String prjFileContentType;
	
	private File dbFile;
	
	private String dbFileFileName;
	
	private String dbFileContentType;
	
	private OrmappingProject project;
	
	public String execute(){
		return INPUT;
	}
	
	public String save() throws DbException, SQLException, CacheException{
		if(projectId > 0){
			String basePath = config.getEntityBuildConfigFilePath()+projectId+"/";
			String baesRealPath = ServletActionContext.getServletContext().getRealPath(basePath);
			String orConfigFile = basePath +"projConfig.prjconfig";
			String orConfigRealPath = ServletActionContext.getServletContext().getRealPath(orConfigFile);
			String dbConfigFile = basePath + "dbConfig.config";
			String dbConfigRealPath = ServletActionContext.getServletContext().getRealPath(dbConfigFile);
			checkFilePath(baesRealPath);
			
			if(prjFile != null){
				prjFile.renameTo(new File(orConfigRealPath));
			}
			if(dbFile != null){
				dbFile.renameTo(new File(dbConfigRealPath));
			}
			
			if(getProject().getProjId() > 0){
				getProjectBiz().ormappingProjectUpdate(project);	
			}else{
				getProject().setProjId(projectId);
				getProjectBiz().ormappingProjectInsert(project);
			}
			
			
			
			
		}
		return SUCCESS;
	}
	
	private void checkFilePath(String path){
		File f = new File(path);
		if(!f.exists()){
			f.mkdirs();
		}
	}
	
	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public File getPrjFile() {
		return prjFile;
	}

	public void setPrjFile(File prjFile) {
		this.prjFile = prjFile;
	}

	public String getPrjFileFileName() {
		return prjFileFileName;
	}

	public void setPrjFileFileName(String prjFileFileName) {
		this.prjFileFileName = prjFileFileName;
	}

	public String getPrjFileContentType() {
		return prjFileContentType;
	}

	public void setPrjFileContentType(String prjFileContentType) {
		this.prjFileContentType = prjFileContentType;
	}

	public File getDbFile() {
		return dbFile;
	}

	public void setDbFile(File dbFile) {
		this.dbFile = dbFile;
	}

	public String getDbFileFileName() {
		return dbFileFileName;
	}

	public void setDbFileFileName(String dbFileFileName) {
		this.dbFileFileName = dbFileFileName;
	}

	public String getDbFileContentType() {
		return dbFileContentType;
	}

	public void setDbFileContentType(String dbFileContentType) {
		this.dbFileContentType = dbFileContentType;
	}

	public OrmappingProject getProject() throws DbException, SQLException, CacheException {
		if(project == null && projectId > 0){
			project = getProjectBiz().ormappingProjectSelectByProjId(projectId);
		}
		return project;
	}

	public void setProject(OrmappingProject project) {
		this.project = project;
	}

}
