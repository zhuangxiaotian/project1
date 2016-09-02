package cn.topdeep.projgroup.biz;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.topdeep.projgroup.dao.AttendanceStatisticsDao;
import cn.topdeep.projgroup.entity.db.VWorkLogView;
import cn.topdeep.projgroup.entity.view.VWorkLogViewExExample;
import cn.topdeep.projgroup.entity.view.VWorkLogViewStat;

@Service("attendanceStatisticsBiz")
public class AttendanceStatisticsBiz extends BaseBiz {

	@Autowired
	@Qualifier("attendanceStatisticsDao")
	private AttendanceStatisticsDao attendanceStatisticsDao;

	public List<VWorkLogViewStat> selectNineStatisticalList(VWorkLogViewExExample example) throws SQLException {
		return attendanceStatisticsDao.selectNineStatisticalList(example);
	}

	public List<VWorkLogView> selectNineStatisticalDetail(VWorkLogViewExExample example) throws SQLException {
		return attendanceStatisticsDao.selectNineStatisticalDetail(example);
	}

	public List<VWorkLogViewStat> selectEvelenStatisticalList(VWorkLogViewExExample example) throws SQLException {
		return attendanceStatisticsDao.selectEvelenStatisticalList(example);
	}

	public List<VWorkLogView> selectEvelenStatisticalDetail(VWorkLogViewExExample example) throws SQLException {
		return attendanceStatisticsDao.selectEvelenStatisticalDetail(example);
	}
}
