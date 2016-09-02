package cn.topdeep.projgroup.entity.response;

import java.util.List;

import cn.topdeep.projgroup.entity.db.VWorkLogView;

public class NineStatisticalDetailResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;

	List<VWorkLogView> list;

	public List<VWorkLogView> getList() {
		return list;
	}

	public void setList(List<VWorkLogView> list) {
		this.list = list;
	}

}
