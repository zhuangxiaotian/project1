package cn.topdeep.projgroup.action.work;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;
import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.action.PageAction;
import cn.topdeep.projgroup.biz.FuncProjectBiz;
import cn.topdeep.projgroup.entity.base.PageImpl;
import cn.topdeep.projgroup.entity.db.CodeBuild;
import cn.topdeep.projgroup.entity.db.CodeBuildProperty;
import cn.topdeep.projgroup.entity.db.CodeBuildPropertyExample;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.Privilege;

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
		if(!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		if(codeBuildProperty.getBuildPropertyId() > 0){
			funcProjectBiz.codeBuildPropertyUpdate(codeBuildProperty);
		}else{
			funcProjectBiz.codeBuildPropertyInsert(codeBuildProperty);
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
		if(!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Read)){
			return NO_PRIVILEGES;
		}
		return SUCCESS;
	}
	
	public String list()throws Exception{
		return SUCCESS;
	}
	
	public String save()throws Exception{
		if(!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		funcProjectBiz.codeBuildPropertyInsert(codeBuildProperty);
		buildId=codeBuildProperty.getBuildId();
		return SUCCESS;
	}
	
	public String copyPropFrom() throws DbException, SQLException, CacheException{
		if(!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		if(buildId > 0 && srcBuildId > 0){
			List<CodeBuildProperty> propList = funcProjectBiz.codeBuildPropertySelectObjectsByBuildId(srcBuildId);
			for(CodeBuildProperty item : propList){
				item.setBuildId(buildId);
				item.setBuildPropertyId(0);
				funcProjectBiz.codeBuildPropertyInsert(item);
			}
		}
		return SUCCESS;
	}


	public String delete() throws DbException, SQLException{
		if(!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Delete)){
			return NO_PRIVILEGES;
		}
		funcProjectBiz.codeBuildPropertyDeleteByPrimaryKey(buildPropertyId);
		return SUCCESS;
	}

	public String update() throws DbException, SQLException{
		if(!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		funcProjectBiz.codeBuildPropertyUpdate(codeBuildProperty);
		return SUCCESS;
	}
	
	
	private List<CodeBuildProperty> codeBuildPropertyListView;

	public List<CodeBuildProperty> getCodeBuildPropertyListView() throws DbException, IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException, CacheException {
		if(codeBuildPropertyListView == null) {
			CodeBuildPropertyExample condition = new CodeBuildPropertyExample();
			condition.or().andBuildIdEqualTo(buildId);
			condition.setPage(new PageImpl(getPageIndex(), getRowsOfPage()));
			condition.setOrderByClause("BUILD_PROPERTY_ID asc");
			codeBuildPropertyListView = funcProjectBiz.codeBuildPropertySelectObjects(condition);
			
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
				CodeBuildPropertyExample condition = new CodeBuildPropertyExample();
				condition.or().andBuildIdEqualTo(buildId);
				rowsCount = funcProjectBiz.codeBuildPropertyQuerySelectObjectsCount(condition);
			} catch (CacheException e) {
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