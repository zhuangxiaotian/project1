package cn.topdeep.projgroup.biz;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.topdeep.projgroup.dao.FuncProjectDao;
import cn.topdeep.projgroup.entity.base.PageImpl;
import cn.topdeep.projgroup.entity.db.CodeBuildProcedure;
import cn.topdeep.projgroup.entity.db.CodeBuildProcedureExample;
import cn.topdeep.projgroup.entity.db.CodeBuildProperty;
import cn.topdeep.projgroup.entity.db.CodeBuildPropertyExample;
import cn.topdeep.projgroup.entity.db.FuncParams;
import cn.topdeep.projgroup.entity.db.FuncParamsExample;
import cn.topdeep.projgroup.entity.db.FuncProcedure;
import cn.topdeep.projgroup.entity.db.FuncProcedureExample;
import cn.topdeep.projgroup.entity.db.TestParamValue;
import cn.topdeep.projgroup.entity.db.TestParamValueExample;
import cn.topdeep.projgroup.entity.db.TestProcedure;
import cn.topdeep.projgroup.entity.db.TestProcedureExample;

import common.cache2.CacheException;

@Service("funcProjectBiz")
public class FuncProjectBiz extends BaseBiz {
	@Autowired
	private FuncProjectDao funcProjectDao;

	public void funcProcedureDeleteToBinByFuncProcedureId(int AFuncProcedureId) throws SQLException {
		// String sql = "update T_FUNC_PROCEDURE set deleted = '1' where func_procedure_id = "+AFuncProcedureId;
		// funcProjectDao.getDataVisit().execSql(sql);
		funcProjectDao.funcProcedureDeleteToBinByPrimaryKey(AFuncProcedureId);
	}

	public void funcParamsDeleteToBinByParamId(int AFuncParamId) throws SQLException {
		funcProjectDao.funcParamsDeleteToBinByPrimaryKey(AFuncParamId);
	}

	public void clearFuncProject(int funcProjectId) throws SQLException, CacheException {
		FuncProcedureExample condition = new FuncProcedureExample();
		condition.or().andFuncProjectIdEqualTo(funcProjectId);
		List<FuncProcedure> procList = funcProcedureSelectObjects(condition);
		for (FuncProcedure item : procList) {
			CodeBuildProcedureExample deleteCondition = new CodeBuildProcedureExample();
			deleteCondition.or().andFuncProcedureIdEqualTo(item.getFuncProcedureId());
			codeBuildProcedureDeleteByCondition(deleteCondition);
			FuncParamsExample deleteCondition1 = new FuncParamsExample();
			deleteCondition1.or().andFuncProcedureIdEqualTo(item.getFuncProcedureId());
			funcParamsDeleteByCondition(deleteCondition1);
		}
		funcProcedureDeleteByCondition(condition);
	}

	public FuncParams funcParamsCopyByParamId(int paramId) throws Exception {
		FuncParams funcParam = funcParamsSelectByPrimaryKey(paramId);
		if (funcParam == null) {
			throw new Exception("无效的参数ID，找不到对应的要复制的参数");
		}
		FuncParamsExample condition = new FuncParamsExample();
		condition.or().andFuncProcedureIdEqualTo(funcParam.getFuncProcedureId());
		condition.setPage(new PageImpl(0, 1));
		condition.setOrderByClause("ORDER_FIELD desc");
		List<FuncParams> paramList = funcParamsSelectObjects(condition);

		if (paramList.size() > 0) {
			funcParam.setOrderField(paramList.get(0).getOrderField() + 1);
		}
		funcParam.setParamId(0);
		funcParamsInsert(funcParam);
		return funcParam;
	}

	public FuncParams funcParamsCopyByParamId(int paramId, int targetProcId) throws Exception {
		FuncParams funcParam = funcParamsSelectByPrimaryKey(paramId);
		if (funcParam == null) {
			throw new Exception("无效的参数ID，找不到对应的要复制的参数");
		}
		FuncParamsExample condition = new FuncParamsExample();
		condition.or().andFuncProcedureIdEqualTo(targetProcId);
		condition.setPage(new PageImpl(0, 1));
		condition.setOrderByClause("ORDER_FIELD desc");
		List<FuncParams> paramList = funcParamsSelectObjects(condition);

		if (paramList.size() > 0) {
			funcParam.setOrderField(paramList.get(0).getOrderField() + 1);
		}
		funcParam.setParamId(0);
		funcParam.setFuncProcedureId(targetProcId);
		funcParamsInsert(funcParam);
		return funcParam;
	}

	public List<CodeBuildProcedure> codeBuildProcedureSelectObjectsByBuildId(int buildId) throws CacheException {
		CodeBuildProcedureExample condition = new CodeBuildProcedureExample();
		condition.or().andBuildIdEqualTo(buildId);
		return codeBuildProcedureSelectObjects(condition);
	}

	public List<TestProcedure> testProcedureSelectObjectsByBuildId(int buildId) throws CacheException {
		TestProcedureExample condition = new TestProcedureExample();
		condition.or().andBuildIdEqualTo(buildId);
		return testProcedureSelectObjects(condition);
	}

	public void codeBuildProcedureDeleteByBuildProcedureId(int buildProcedureId) {
		// CodeBuildProcedureExample condition = new CodeBuildProcedureExample();
		// condition.or().andBuildProcedureIdEqualTo(buildProcedureId);
		codeBuildProcedureDeleteByPrimaryKey(buildProcedureId);
	}

	public List<TestParamValue> testParamValueSelectObjectsByTestProcedureId(int testProcedureId) throws CacheException {
		TestParamValueExample condition = new TestParamValueExample();
		condition.or().andTestProcedureIdEqualTo(testProcedureId);
		return testParamValueSelectObjects(condition);
	}

	public void testParamValueDeleteByParamIdTestProcedureId(int paramId, int testProcedureId) {
		TestParamValueExample condition = new TestParamValueExample();
		condition.or().andParamIdEqualTo(paramId).andTestProcedureIdEqualTo(testProcedureId);
		testParamValueDeleteByCondition(condition);
	}

	public List<CodeBuildProperty> codeBuildPropertySelectObjectsByBuildId(int buildId) throws CacheException {
		CodeBuildPropertyExample condition = new CodeBuildPropertyExample();
		condition.or().andBuildIdEqualTo(buildId);
		return codeBuildPropertySelectObjects(condition);
	}

	public void funcParamsDeleteListByFuncProcedureId(int funcProcedureId) {
		FuncParamsExample condition = new FuncParamsExample();
		condition.or().andFuncProcedureIdEqualTo(funcProcedureId);
		funcParamsDeleteByCondition(condition);
	}

	public List<FuncParams> funcParamsSelectObjectsByFuncProcedureId(int funcProcedureId) throws CacheException {
		FuncParamsExample condition = new FuncParamsExample();
		condition.or().andFuncProcedureIdEqualTo(funcProcedureId);
		return funcParamsSelectObjects(condition);
	}

	public TestParamValue testParamValueSelectByParamIdTestProcedureId(int paramId, int testprocedureId) throws CacheException {
		TestParamValueExample condition = new TestParamValueExample();
		condition.or().andParamIdEqualTo(paramId).andTestProcedureIdEqualTo(testprocedureId);
		return selectSingleObject(testParamValueSelectObjects(condition));
	}

	public FuncProjectDao getFuncProjectDao() {
		return funcProjectDao;
	}

	public void setFuncProjectDao(FuncProjectDao funcProjectDao) {
		this.funcProjectDao = funcProjectDao;
	}

}
