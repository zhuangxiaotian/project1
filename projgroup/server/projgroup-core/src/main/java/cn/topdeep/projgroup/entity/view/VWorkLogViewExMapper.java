package cn.topdeep.projgroup.entity.view;

import java.util.List;

import cn.topdeep.projgroup.entity.db.VWorkLogView;

public interface VWorkLogViewExMapper {

	/**
	 * 查询9点到11点考勤统计
	 * 
	 * @param example
	 * @return
	 */
	List<VWorkLogViewStat> selectNineStatisticalList(VWorkLogViewExExample example);

	/**
	 * 查询9点到11点考勤统计明细
	 * 
	 * @param example
	 * @return
	 */
	List<VWorkLogView> selectNineStatisticalDetail(VWorkLogViewExExample example);

	/**
	 * 查询11点后考勤统计
	 * 
	 * @param example
	 * @return
	 */
	List<VWorkLogViewStat> selectEvelenStatisticalList(VWorkLogViewExExample example);

	/**
	 * 查询11点后考勤统计明细
	 * 
	 * @param example
	 * @return
	 */
	List<VWorkLogView> selectEvelenStatisticalDetail(VWorkLogViewExExample example);

}
