package cn.topdeep.projgroup.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.topdeep.projgroup.entity.db.VWorkLogView;
import cn.topdeep.projgroup.entity.view.VWorkLogViewExExample;
import cn.topdeep.projgroup.entity.view.VWorkLogViewExMapper;
import cn.topdeep.projgroup.entity.view.VWorkLogViewStat;

@Repository("attendanceStatisticsDao")
public class AttendanceStatisticsDao extends ProjgroupDao {

	public List<VWorkLogViewStat> selectNineStatisticalList(VWorkLogViewExExample example) {
		VWorkLogViewExMapper mapperImpl = this.getSqlSession().getMapper(VWorkLogViewExMapper.class);
		return mapperImpl.selectNineStatisticalList(example);
	}

	public List<VWorkLogView> selectNineStatisticalDetail(VWorkLogViewExExample example) {
		VWorkLogViewExMapper mapperImpl = this.getSqlSession().getMapper(VWorkLogViewExMapper.class);
		return mapperImpl.selectNineStatisticalDetail(example);
	}

	public List<VWorkLogViewStat> selectEvelenStatisticalList(VWorkLogViewExExample example) {
		VWorkLogViewExMapper mapperImpl = this.getSqlSession().getMapper(VWorkLogViewExMapper.class);
		return mapperImpl.selectEvelenStatisticalList(example);
	}

	public List<VWorkLogView> selectEvelenStatisticalDetail(VWorkLogViewExExample example) {
		VWorkLogViewExMapper mapperImpl = this.getSqlSession().getMapper(VWorkLogViewExMapper.class);
		return mapperImpl.selectEvelenStatisticalDetail(example);
	}

}
