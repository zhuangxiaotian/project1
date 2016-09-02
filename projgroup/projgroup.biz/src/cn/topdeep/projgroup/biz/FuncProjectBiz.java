package cn.topdeep.projgroup.biz;

import java.sql.SQLException;
import java.util.List;

import cn.topdeep.projgroup.dao.FuncProjectDao;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.FuncProcedure;
import cn.topdeep.projgroup.entity.FuncProject;

public class FuncProjectBiz extends BaseBiz {
	private FuncProjectDao funcProjectDao;
	
	public void clearFuncProject(int funcProjectId) throws DbException, SQLException{
		List<FuncProcedure> procList = funcProcedureSelectObjectsByFuncProjectId(funcProjectId);
		for(FuncProcedure item : procList){
			codeBuildProcedureDeleteListByFuncProcedureId(item.getFuncProcedureId());
			funcParamsDeleteListByFuncProcedureId(item.getFuncProcedureId());
		}
		funcProcedureDeleteListByFuncProjectId(funcProjectId);
	}
	
	public FuncProjectDao getFuncProjectDao() {
		return funcProjectDao;
	}

	public void setFuncProjectDao(FuncProjectDao funcProjectDao) {
		this.funcProjectDao = funcProjectDao;
	}

}
