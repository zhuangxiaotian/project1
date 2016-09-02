package cn.topdeep.projgroup.action.work;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.action.PageAction;
import cn.topdeep.projgroup.biz.FuncProjectBiz;
import cn.topdeep.projgroup.entity.CodeBuild;
import cn.topdeep.projgroup.entity.CodeBuildProperty;
import cn.topdeep.projgroup.entity.CodeBuildPropertyQueryCondition;
import cn.topdeep.projgroup.entity.DbException;

public class CodeBuildPropertyEdit extends PageAction{
	
	private CodeBuildProperty codeBuildProperty;
	private int buildId;
	private FuncProjectBiz funcProjectBiz; 
	private int buildPropertyId;
	private int srcBuildId;
	public int getBuildPropertyId() {
		return buildPropertyId;
	}

	public void setBuildPropertyId(int buildPropertyId) {
		this.buildPropertyId = buildPropertyId;
	}

	/**
	 * @return the funcProjectBiz
	 */
	public FuncProjectBiz getFuncProjectBiz() {
		return funcProjectBiz;
	}

	/**
	 * @param funcProjectBiz the funcProjectBiz to set
	 */
	public void setFuncProjectBiz(FuncProjectBiz funcProjectBiz) {
		this.funcProjectBiz = funcProjectBiz;
	}
	
	public CodeBuildProperty getCodeBuildProperty() {
		return codeBuildProperty;
	}

	public void setCodeBuildProperty(CodeBuildProperty codeBuildProperty) {
		this.codeBuildProperty = codeBuildProperty;
	}

	public String ajaxSaveProperty() throws DbException, SQLException{
		if(codeBuildProperty.getBuildPropertyId() > 0){
			funcProjectBiz.codeBuildPropertyUpdate(codeBuildProperty);
		}else{
			funcProjectBiz.insert(codeBuildProperty);
		}
		return SUCCESS;
	}
	
	public int getBuildId() {
		return buildId;
	}

	public void setBuildId(int buildId) {
		this.buildId = buildId;
	}

	public String execute() throws Exception{
		return SUCCESS;
	}
	
	public String list()throws Exception{
		return SUCCESS;
	}
	
	public String save()throws Exception{
		funcProjectBiz.insert(codeBuildProperty);
		buildId=codeBuildProperty.getBuildId();
		return SUCCESS;
	}
	
	public String copyPropFrom() throws DbException, SQLException{
		if(buildId > 0 && srcBuildId > 0){
			List<CodeBuildProperty> propList = funcProjectBiz.codeBuildPropertySelectObjects(new CodeBuildPropertyQueryCondition().setBuildIdCondition(srcBuildId));
			for(CodeBuildProperty item : propList){
				item.setBuildId(buildId);
				item.setBuildPropertyId(0);
				funcProjectBiz.codeBuildPropertyInsert(item);
			}
		}
		return SUCCESS;
	}


	public String delete() throws DbException, SQLException{
		funcProjectBiz.codeBuildPropertyDeleteByBuildPropertyId(buildPropertyId);
		return SUCCESS;
	}

	public String update() throws DbException, SQLException{
		funcProjectBiz.codeBuildPropertyUpdate(codeBuildProperty);
		return SUCCESS;
	}
	
	
	private List<CodeBuildProperty> codeBuildPropertyListView;

	public List<CodeBuildProperty> getCodeBuildPropertyListView() throws DbException, IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		if(codeBuildPropertyListView == null) {
			codeBuildPropertyListView = funcProjectBiz.codeBuildPropertySelectObjects("where [T_CODE_BUILD_PROPERTY].BUILD_ID = "+buildId, getPageIndex(), getRowsOfPage(), "BUILD_PROPERTY_ID", "asc");
			
		}
		return codeBuildPropertyListView;
	}
	public void setCodeBuildPropertyListView(List<CodeBuildProperty> codeBuildPropertyListView) {
		this.codeBuildPropertyListView = codeBuildPropertyListView;
	}
	
	private int rowsCount = -1;
	@Override
	public int getRowsCount() {
		if(rowsCount < 0) {
			try {
				rowsCount = funcProjectBiz.codeBuildPropertyQuerySelectObjectsCount(" where [T_CODE_BUILD_PROPERTY].BUILD_ID = "+buildId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rowsCount;
	}

	/**
	 * @return the srcBuildId
	 */
	public int getSrcBuildId() {
		return srcBuildId;
	}

	/**
	 * @param srcBuildId the srcBuildId to set
	 */
	public void setSrcBuildId(int srcBuildId) {
		this.srcBuildId = srcBuildId;
	}
}
