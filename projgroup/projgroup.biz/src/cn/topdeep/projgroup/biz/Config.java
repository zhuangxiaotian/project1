/**
 * $Id$
 */
package cn.topdeep.projgroup.biz;

/**
 * @author niexin
 *
 */
public class Config {
	private String entityBuildCommandPath = "D:\\DevTools\\OrMappingUtils\\OrMappingUtils.exe";

	public String getEntityBuildCommandPath() {
		return entityBuildCommandPath;
	}

	public void setEntityBuildCommandPath(String entityBuildCommandPath) {
		this.entityBuildCommandPath = entityBuildCommandPath;
	}
	
	private String entityBuildConfigFilePath = "/WEB-INF/entityconfig/";

	public String getEntityBuildConfigFilePath() {
		return entityBuildConfigFilePath;
	}

	public void setEntityBuildConfigFilePath(String entityBuildConfigFilePath) {
		this.entityBuildConfigFilePath = entityBuildConfigFilePath;
	}
}
