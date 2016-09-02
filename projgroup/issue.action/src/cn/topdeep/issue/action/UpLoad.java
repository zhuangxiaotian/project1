package cn.topdeep.issue.action;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import org.apache.struts2.ServletActionContext;

import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.IssueComment;
import cn.topdeep.projgroup.entity.data.IssueLoginUser;
import cn.topdeep.projgroup.entity.data.issue.IssueCommentType;

import common.cache2.CacheException;
import common.util.StringUtils;


public class UpLoad extends BaseAction{
	
	private int issueId;
	
	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}
	
	private String title;
	private File upLoad;
	private String upLoadContentType;
	private String upLoadFileName;
	
	
	public String getUpLoadContentType() {
		return (this.upLoadContentType);
	}
	public void setUpLoadContentType(String upLoadContentType) {
		this.upLoadContentType = upLoadContentType;
	}
	public String getUpLoadFileName() {
		return (this.upLoadFileName);
	}
	public void setUpLoadFileName(String upLoadFileName) {
		this.upLoadFileName = upLoadFileName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public File getUpLoad() {
		return upLoad;
	}
	
	public void setUpLoad(File upLoad) {
		this.upLoad = upLoad;
	}
	
	public String execute() throws Exception {
		return INPUT;
	}
	
	public String save() throws IOException, DbException, SQLException, CacheException {
		if(issueId > 0) { 
			if(upLoad != null && (!StringUtils.isNullOrEmpty(title))) { //判断是否提交了上传文件
				//只上传类型为图片的代码部分if(upLoadContentType.equalsIgnoreCase("image/pjpeg")) {
				String dir = getUploadPath();
				String path = StringUtils.dateTimeToString(new java.util.Date(), "yyyy/MM/dd"); 
				dir += "/"+path;
				String dbPath = getDbPath()+"/"+path;
				File file = new File(dir);
				if(!file.exists()) {
					file.mkdirs();
				}
				String fileName = StringUtils.dateTimeToString(new java.util.Date(), "yyyyMMddHHmmssSSS")+"_"+upLoadFileName;; 
				dbPath += "/"+fileName;
				File destFile = new File(file, fileName);
					 upLoad.renameTo(destFile);
					 if(destFile.length() < (1024*1024)) {
						 IssueComment comment =new IssueComment();
						 if(comment != null) {
							 comment.setAttachFilePath(dbPath);
							 comment.setAttachFileSize((int)destFile.length());
							 comment.setAttachFileType(upLoadContentType);
							 comment.setAttachThumbPath(destFile.getAbsolutePath());
							 comment.setCommentContent(title.trim());
							 comment.setCommentTime(new Date());
							 comment.setCommentType(IssueCommentType.Normal);
							 comment.setCommentUserId(issueLoginUser.getLoginUserId());
							 comment.setParentCommentId(0);
							 comment.setIssueId(issueId);
							 issueBiz.issueCommentAdd(comment);
							 addFieldError("upLoad", "上传成功");
						 }
					 }else {
						 destFile.delete();
						 addFieldError("upLoad", "您上传的文件不能超过大小10000,........");
						 return INPUT;
					 }
				//只上传类型为图片的代码部分}else {
					//只上传类型为图片的代码部分upLoad.delete();
					//只上传类型为图片的代码部分addFieldError("upLoad", "仅支持图片上传");
				//只上传类型为图片的代码部分}
			}else {
				addFieldError("upLoad", "你没有填写注释,或者没有选择上传文件!请重新操作");
				return INPUT;
			}
		}else {
			addFieldError("upLoad", "你没有选择相对应的问题,请返回问题管理选择后再上传");
			return INPUT;
		}
		return SUCCESS;
	}
	
	
	public int getIssueId() {
		return issueId;
	}
	
	
}
