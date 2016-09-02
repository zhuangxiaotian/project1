package cn.topdeep.projgroup.entity.response;

import java.util.Date;
import java.util.List;

import cn.topdeep.projgroup.entity.db.User;
import cn.topdeep.projgroup.entity.db.VWorkLogView;
import cn.topdeep.projgroup.entity.view.VWorkLogViewStat;

public class EvelenStatisticalResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;

	private Date createTime;
	private Integer workUserId;
	private List<User> userList;
	private List<VWorkLogViewStat> list;
	private List<VWorkLogView> detailList;

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getWorkUserId() {
		return workUserId;
	}

	public void setWorkUserId(Integer workUserId) {
		this.workUserId = workUserId;
	}

	public List<VWorkLogViewStat> getList() {
		return list;
	}

	public void setList(List<VWorkLogViewStat> list) {
		this.list = list;
	}

	/**
	 * @return the detailList
	 */
	public List<VWorkLogView> getDetailList() {
		return detailList;
	}

	/**
	 * @param detailList the detailList to set
	 */
	public void setDetailList(List<VWorkLogView> detailList) {
		this.detailList = detailList;
	}

}
