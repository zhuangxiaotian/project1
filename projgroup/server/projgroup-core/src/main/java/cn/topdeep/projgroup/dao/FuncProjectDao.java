package cn.topdeep.projgroup.dao;

import org.springframework.stereotype.Repository;

import cn.topdeep.projgroup.entity.db.FuncParams;
import cn.topdeep.projgroup.entity.db.FuncParamsExample;
import cn.topdeep.projgroup.entity.db.FuncParamsMapper;
import cn.topdeep.projgroup.entity.db.FuncProcedure;
import cn.topdeep.projgroup.entity.db.FuncProcedureExample;
import cn.topdeep.projgroup.entity.db.FuncProcedureMapper;

@Repository
public class FuncProjectDao extends ProjgroupDao {
	public void funcParamsDeleteToBinByPrimaryKey(int paramId) {
		FuncParamsExample condition = new FuncParamsExample();
		condition.or().andParamIdEqualTo(paramId);
		FuncParams param = new FuncParams();
		param.setDeleted("1");
		FuncParamsMapper mapperImpl = this.getSqlSession().getMapper(FuncParamsMapper.class);
		mapperImpl.updateByExampleSelective(param, condition);
	}

	public void funcProcedureDeleteToBinByPrimaryKey(int funcProcedureId) {
		FuncProcedureExample condition = new FuncProcedureExample();
		condition.or().andFuncProcedureIdEqualTo(funcProcedureId);
		FuncProcedure proc = new FuncProcedure();
		proc.setDeleted("1");
		FuncProcedureMapper mapperImpl = this.getSqlSession().getMapper(FuncProcedureMapper.class);
		mapperImpl.updateByExampleSelective(proc, condition);
	}
}
