package cn.topdeep.projgroup.entity.view.issue;

import cn.topdeep.projgroup.entity.IssueComment;
import common.util.*;

public class IssueCommentListView extends IssueComment{
	

	private String issueUserName;

	public String getIssueUserName() {
		return issueUserName;
	}

	public void setIssueUserName(String issueUserName) {
		this.issueUserName = issueUserName;
	}

	public boolean getIsImage(){
		if(StringUtils.isNullOrEmpty(this.getAttachFileType())){
			return false;
		}
		if(this.getAttachFileSize() == null || this.getAttachFileSize() == 0){
			return false;
		}
		return this.getAttachFileType().toLowerCase().startsWith("image");
	}
}
