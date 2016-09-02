package cn.topdeep.projgroup.entity.response;

import java.util.Date;
import java.util.List;

import cn.topdeep.projgroup.entity.db.User;
import cn.topdeep.projgroup.entity.db.VWorkLogView;

public class NineStatisticalResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;

	private Date createTime;
	private Integer workUserId;
	private List<User> userList;
	List<VWorkLogView> list;

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

	public List<VWorkLogView> getList() {
		return list;
	}

	public void setList(List<VWorkLogView> list) {
		this.list = list;
	}
}
