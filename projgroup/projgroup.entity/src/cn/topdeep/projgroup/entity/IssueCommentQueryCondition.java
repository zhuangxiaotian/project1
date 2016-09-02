package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_COMMENT查询条件定义
 */
public class IssueCommentQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,ISSUE_COMMENT_ID: 标识
	 */
	Integer issueCommentId;
	
	/**
	 * 查询条件开始值,ISSUE_COMMENT_ID: 标识
	 */
	Integer issueCommentIdBegin;
	
	/**
	 * 查询条件结束值,ISSUE_COMMENT_ID: 标识
	 */
	Integer issueCommentIdEnd;
	
	/**
	 * 查询条件结束值,ISSUE_COMMENT_ID: 标识
	 */
	Integer issueCommentIdEndEqual;
	
	/**
	 * 查询条件,ISSUE_ID: 问题标识
	 */
	Integer issueId;
	
	/**
	 * 查询条件开始值,ISSUE_ID: 问题标识
	 */
	Integer issueIdBegin;
	
	/**
	 * 查询条件结束值,ISSUE_ID: 问题标识
	 */
	Integer issueIdEnd;
	
	/**
	 * 查询条件结束值,ISSUE_ID: 问题标识
	 */
	Integer issueIdEndEqual;
	
	/**
	 * 查询条件,COMMENT_USER_ID: 用户标识
	 */
	Integer commentUserId;
	
	/**
	 * 查询条件开始值,COMMENT_USER_ID: 用户标识
	 */
	Integer commentUserIdBegin;
	
	/**
	 * 查询条件结束值,COMMENT_USER_ID: 用户标识
	 */
	Integer commentUserIdEnd;
	
	/**
	 * 查询条件结束值,COMMENT_USER_ID: 用户标识
	 */
	Integer commentUserIdEndEqual;
	
	/**
	 * 查询条件,COMMENT_TYPE: 注释类型 0 表示普通注释 1 表示状态变化（系统自动插入）
	 */
	Byte commentType;
	
	/**
	 * 查询条件开始值,COMMENT_TYPE: 注释类型 0 表示普通注释 1 表示状态变化（系统自动插入）
	 */
	Byte commentTypeBegin;
	
	/**
	 * 查询条件结束值,COMMENT_TYPE: 注释类型 0 表示普通注释 1 表示状态变化（系统自动插入）
	 */
	Byte commentTypeEnd;
	
	/**
	 * 查询条件结束值,COMMENT_TYPE: 注释类型 0 表示普通注释 1 表示状态变化（系统自动插入）
	 */
	Byte commentTypeEndEqual;
	
	/**
	 * 查询条件,COMMENT_TIME: 添加时间
	 */
	java.util.Date commentTime;
	
	/**
	 * 查询条件开始值,COMMENT_TIME: 添加时间
	 */
	java.util.Date commentTimeBegin;
	
	/**
	 * 查询条件结束值,COMMENT_TIME: 添加时间
	 */
	java.util.Date commentTimeEnd;
	
	/**
	 * 查询条件结束值,COMMENT_TIME: 添加时间
	 */
	java.util.Date commentTimeEndEqual;
	
	/**
	 * 查询条件,COMMENT_CONTENT: 注释内容
	 */
	String commentContent;
	
	/**
	 * 查询条件字符串相等,COMMENT_CONTENT: 注释内容
	 */
	String commentContentEqual;
	
	/**
	 * 查询条件,PARENT_COMMENT_ID: 父注释ID,为0 表示没有
	 */
	Integer parentCommentId;
	
	/**
	 * 查询条件开始值,PARENT_COMMENT_ID: 父注释ID,为0 表示没有
	 */
	Integer parentCommentIdBegin;
	
	/**
	 * 查询条件结束值,PARENT_COMMENT_ID: 父注释ID,为0 表示没有
	 */
	Integer parentCommentIdEnd;
	
	/**
	 * 查询条件结束值,PARENT_COMMENT_ID: 父注释ID,为0 表示没有
	 */
	Integer parentCommentIdEndEqual;
	
	/**
	 * 查询条件,ATTACH_FILE_PATH: 附加文件路径
	 */
	String attachFilePath;
	
	/**
	 * 查询条件字符串相等,ATTACH_FILE_PATH: 附加文件路径
	 */
	String attachFilePathEqual;
	
	/**
	 * 查询条件,ATTACH_FILE_SIZE: 附加文件大小，字节为单位
	 */
	Integer attachFileSize;
	
	/**
	 * 查询条件开始值,ATTACH_FILE_SIZE: 附加文件大小，字节为单位
	 */
	Integer attachFileSizeBegin;
	
	/**
	 * 查询条件结束值,ATTACH_FILE_SIZE: 附加文件大小，字节为单位
	 */
	Integer attachFileSizeEnd;
	
	/**
	 * 查询条件结束值,ATTACH_FILE_SIZE: 附加文件大小，字节为单位
	 */
	Integer attachFileSizeEndEqual;
	
	/**
	 * 查询条件,ATTACH_FILE_TYPE: 附加文件类型
	 */
	String attachFileType;
	
	/**
	 * 查询条件字符串相等,ATTACH_FILE_TYPE: 附加文件类型
	 */
	String attachFileTypeEqual;
	
	/**
	 * 查询条件,ATTACH_THUMB_PATH: 附加文件缩略，如果是图片大于800*600，则生成缩略图，否则指向原始文件
	 */
	String attachThumbPath;
	
	/**
	 * 查询条件字符串相等,ATTACH_THUMB_PATH: 附加文件缩略，如果是图片大于800*600，则生成缩略图，否则指向原始文件
	 */
	String attachThumbPathEqual;
	
	/**
	 * ISSUE_COMMENT_ID: 标识
	 */
	public Integer getIssueCommentId() {
		return this.issueCommentId;
	}
	
	/**
	 * ISSUE_COMMENT_ID: 标识
	 */
	public void setIssueCommentId(Integer value)
	 {
		this.issueCommentId = value;
	}
	
	/**
	 * 查询条件开始值,ISSUE_COMMENT_ID: 标识
	 */
	public Integer getIssueCommentIdBegin() {
		return this.issueCommentIdBegin;
	}
	
	/**
	 * 查询条件开始值,ISSUE_COMMENT_ID: 标识
	 */
	public void setIssueCommentIdBegin(Integer value)
	 {
		this.issueCommentIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_COMMENT_ID: 标识
	 */
	public Integer getIssueCommentIdEnd() {
		return this.issueCommentIdEnd;
	}
	
	/**
	 * 查询条件结束值,ISSUE_COMMENT_ID: 标识
	 */
	public void setIssueCommentIdEnd(Integer value)
	 {
		this.issueCommentIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_COMMENT_ID: 标识
	 */
	public Integer getIssueCommentIdEndEqual() {
		return this.issueCommentIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,ISSUE_COMMENT_ID: 标识
	 */
	public void setIssueCommentIdEndEqual(Integer value)
	 {
		this.issueCommentIdEndEqual = value;
	}
	
	/**
	 * ISSUE_ID: 问题标识
	 */
	public Integer getIssueId() {
		return this.issueId;
	}
	
	/**
	 * ISSUE_ID: 问题标识
	 */
	public void setIssueId(Integer value)
	 {
		this.issueId = value;
	}
	
	/**
	 * 查询条件开始值,ISSUE_ID: 问题标识
	 */
	public Integer getIssueIdBegin() {
		return this.issueIdBegin;
	}
	
	/**
	 * 查询条件开始值,ISSUE_ID: 问题标识
	 */
	public void setIssueIdBegin(Integer value)
	 {
		this.issueIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_ID: 问题标识
	 */
	public Integer getIssueIdEnd() {
		return this.issueIdEnd;
	}
	
	/**
	 * 查询条件结束值,ISSUE_ID: 问题标识
	 */
	public void setIssueIdEnd(Integer value)
	 {
		this.issueIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,ISSUE_ID: 问题标识
	 */
	public Integer getIssueIdEndEqual() {
		return this.issueIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,ISSUE_ID: 问题标识
	 */
	public void setIssueIdEndEqual(Integer value)
	 {
		this.issueIdEndEqual = value;
	}
	
	/**
	 * COMMENT_USER_ID: 用户标识
	 */
	public Integer getCommentUserId() {
		return this.commentUserId;
	}
	
	/**
	 * COMMENT_USER_ID: 用户标识
	 */
	public void setCommentUserId(Integer value)
	 {
		this.commentUserId = value;
	}
	
	/**
	 * 查询条件开始值,COMMENT_USER_ID: 用户标识
	 */
	public Integer getCommentUserIdBegin() {
		return this.commentUserIdBegin;
	}
	
	/**
	 * 查询条件开始值,COMMENT_USER_ID: 用户标识
	 */
	public void setCommentUserIdBegin(Integer value)
	 {
		this.commentUserIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,COMMENT_USER_ID: 用户标识
	 */
	public Integer getCommentUserIdEnd() {
		return this.commentUserIdEnd;
	}
	
	/**
	 * 查询条件结束值,COMMENT_USER_ID: 用户标识
	 */
	public void setCommentUserIdEnd(Integer value)
	 {
		this.commentUserIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,COMMENT_USER_ID: 用户标识
	 */
	public Integer getCommentUserIdEndEqual() {
		return this.commentUserIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,COMMENT_USER_ID: 用户标识
	 */
	public void setCommentUserIdEndEqual(Integer value)
	 {
		this.commentUserIdEndEqual = value;
	}
	
	/**
	 * COMMENT_TYPE: 注释类型 0 表示普通注释 1 表示状态变化（系统自动插入）
	 */
	public Byte getCommentType() {
		return this.commentType;
	}
	
	/**
	 * COMMENT_TYPE: 注释类型 0 表示普通注释 1 表示状态变化（系统自动插入）
	 */
	public void setCommentType(Byte value)
	 {
		this.commentType = value;
	}
	
	/**
	 * 查询条件开始值,COMMENT_TYPE: 注释类型 0 表示普通注释 1 表示状态变化（系统自动插入）
	 */
	public Byte getCommentTypeBegin() {
		return this.commentTypeBegin;
	}
	
	/**
	 * 查询条件开始值,COMMENT_TYPE: 注释类型 0 表示普通注释 1 表示状态变化（系统自动插入）
	 */
	public void setCommentTypeBegin(Byte value)
	 {
		this.commentTypeBegin = value;
	}
	
	/**
	 * 查询条件结束值,COMMENT_TYPE: 注释类型 0 表示普通注释 1 表示状态变化（系统自动插入）
	 */
	public Byte getCommentTypeEnd() {
		return this.commentTypeEnd;
	}
	
	/**
	 * 查询条件结束值,COMMENT_TYPE: 注释类型 0 表示普通注释 1 表示状态变化（系统自动插入）
	 */
	public void setCommentTypeEnd(Byte value)
	 {
		this.commentTypeEnd = value;
	}
	
	/**
	 * 查询条件结束值,COMMENT_TYPE: 注释类型 0 表示普通注释 1 表示状态变化（系统自动插入）
	 */
	public Byte getCommentTypeEndEqual() {
		return this.commentTypeEndEqual;
	}
	
	/**
	 * 查询条件结束值,COMMENT_TYPE: 注释类型 0 表示普通注释 1 表示状态变化（系统自动插入）
	 */
	public void setCommentTypeEndEqual(Byte value)
	 {
		this.commentTypeEndEqual = value;
	}
	
	/**
	 * COMMENT_TIME: 添加时间
	 */
	public java.util.Date getCommentTime() {
		return this.commentTime;
	}
	
	/**
	 * COMMENT_TIME: 添加时间
	 */
	public void setCommentTime(java.util.Date value)
	 {
		this.commentTime = value;
	}
	
	/**
	 * 查询条件开始值,COMMENT_TIME: 添加时间
	 */
	public java.util.Date getCommentTimeBegin() {
		return this.commentTimeBegin;
	}
	
	/**
	 * 查询条件开始值,COMMENT_TIME: 添加时间
	 */
	public void setCommentTimeBegin(java.util.Date value)
	 {
		this.commentTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,COMMENT_TIME: 添加时间
	 */
	public java.util.Date getCommentTimeEnd() {
		return this.commentTimeEnd;
	}
	
	/**
	 * 查询条件结束值,COMMENT_TIME: 添加时间
	 */
	public void setCommentTimeEnd(java.util.Date value)
	 {
		this.commentTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,COMMENT_TIME: 添加时间
	 */
	public java.util.Date getCommentTimeEndEqual() {
		return this.commentTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,COMMENT_TIME: 添加时间
	 */
	public void setCommentTimeEndEqual(java.util.Date value)
	 {
		this.commentTimeEndEqual = value;
	}
	
	/**
	 * COMMENT_CONTENT: 注释内容
	 */
	public String getCommentContent() {
		return this.commentContent;
	}
	
	/**
	 * COMMENT_CONTENT: 注释内容
	 */
	public void setCommentContent(String value)
	 {
		this.commentContent = value;
	}
	
	/**
	 * 查询条件字符串相等,COMMENT_CONTENT: 注释内容
	 */
	public String getCommentContentEqual() {
		return this.commentContentEqual;
	}
	
	/**
	 * 查询条件字符串相等,COMMENT_CONTENT: 注释内容
	 */
	public void setCommentContentEqual(String value)
	 {
		this.commentContentEqual = value;
	}
	
	/**
	 * PARENT_COMMENT_ID: 父注释ID,为0 表示没有
	 */
	public Integer getParentCommentId() {
		return this.parentCommentId;
	}
	
	/**
	 * PARENT_COMMENT_ID: 父注释ID,为0 表示没有
	 */
	public void setParentCommentId(Integer value)
	 {
		this.parentCommentId = value;
	}
	
	/**
	 * 查询条件开始值,PARENT_COMMENT_ID: 父注释ID,为0 表示没有
	 */
	public Integer getParentCommentIdBegin() {
		return this.parentCommentIdBegin;
	}
	
	/**
	 * 查询条件开始值,PARENT_COMMENT_ID: 父注释ID,为0 表示没有
	 */
	public void setParentCommentIdBegin(Integer value)
	 {
		this.parentCommentIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PARENT_COMMENT_ID: 父注释ID,为0 表示没有
	 */
	public Integer getParentCommentIdEnd() {
		return this.parentCommentIdEnd;
	}
	
	/**
	 * 查询条件结束值,PARENT_COMMENT_ID: 父注释ID,为0 表示没有
	 */
	public void setParentCommentIdEnd(Integer value)
	 {
		this.parentCommentIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PARENT_COMMENT_ID: 父注释ID,为0 表示没有
	 */
	public Integer getParentCommentIdEndEqual() {
		return this.parentCommentIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PARENT_COMMENT_ID: 父注释ID,为0 表示没有
	 */
	public void setParentCommentIdEndEqual(Integer value)
	 {
		this.parentCommentIdEndEqual = value;
	}
	
	/**
	 * ATTACH_FILE_PATH: 附加文件路径
	 */
	public String getAttachFilePath() {
		return this.attachFilePath;
	}
	
	/**
	 * ATTACH_FILE_PATH: 附加文件路径
	 */
	public void setAttachFilePath(String value)
	 {
		this.attachFilePath = value;
	}
	
	/**
	 * 查询条件字符串相等,ATTACH_FILE_PATH: 附加文件路径
	 */
	public String getAttachFilePathEqual() {
		return this.attachFilePathEqual;
	}
	
	/**
	 * 查询条件字符串相等,ATTACH_FILE_PATH: 附加文件路径
	 */
	public void setAttachFilePathEqual(String value)
	 {
		this.attachFilePathEqual = value;
	}
	
	/**
	 * ATTACH_FILE_SIZE: 附加文件大小，字节为单位
	 */
	public Integer getAttachFileSize() {
		return this.attachFileSize;
	}
	
	/**
	 * ATTACH_FILE_SIZE: 附加文件大小，字节为单位
	 */
	public void setAttachFileSize(Integer value)
	 {
		this.attachFileSize = value;
	}
	
	/**
	 * 查询条件开始值,ATTACH_FILE_SIZE: 附加文件大小，字节为单位
	 */
	public Integer getAttachFileSizeBegin() {
		return this.attachFileSizeBegin;
	}
	
	/**
	 * 查询条件开始值,ATTACH_FILE_SIZE: 附加文件大小，字节为单位
	 */
	public void setAttachFileSizeBegin(Integer value)
	 {
		this.attachFileSizeBegin = value;
	}
	
	/**
	 * 查询条件结束值,ATTACH_FILE_SIZE: 附加文件大小，字节为单位
	 */
	public Integer getAttachFileSizeEnd() {
		return this.attachFileSizeEnd;
	}
	
	/**
	 * 查询条件结束值,ATTACH_FILE_SIZE: 附加文件大小，字节为单位
	 */
	public void setAttachFileSizeEnd(Integer value)
	 {
		this.attachFileSizeEnd = value;
	}
	
	/**
	 * 查询条件结束值,ATTACH_FILE_SIZE: 附加文件大小，字节为单位
	 */
	public Integer getAttachFileSizeEndEqual() {
		return this.attachFileSizeEndEqual;
	}
	
	/**
	 * 查询条件结束值,ATTACH_FILE_SIZE: 附加文件大小，字节为单位
	 */
	public void setAttachFileSizeEndEqual(Integer value)
	 {
		this.attachFileSizeEndEqual = value;
	}
	
	/**
	 * ATTACH_FILE_TYPE: 附加文件类型
	 */
	public String getAttachFileType() {
		return this.attachFileType;
	}
	
	/**
	 * ATTACH_FILE_TYPE: 附加文件类型
	 */
	public void setAttachFileType(String value)
	 {
		this.attachFileType = value;
	}
	
	/**
	 * 查询条件字符串相等,ATTACH_FILE_TYPE: 附加文件类型
	 */
	public String getAttachFileTypeEqual() {
		return this.attachFileTypeEqual;
	}
	
	/**
	 * 查询条件字符串相等,ATTACH_FILE_TYPE: 附加文件类型
	 */
	public void setAttachFileTypeEqual(String value)
	 {
		this.attachFileTypeEqual = value;
	}
	
	/**
	 * ATTACH_THUMB_PATH: 附加文件缩略，如果是图片大于800*600，则生成缩略图，否则指向原始文件
	 */
	public String getAttachThumbPath() {
		return this.attachThumbPath;
	}
	
	/**
	 * ATTACH_THUMB_PATH: 附加文件缩略，如果是图片大于800*600，则生成缩略图，否则指向原始文件
	 */
	public void setAttachThumbPath(String value)
	 {
		this.attachThumbPath = value;
	}
	
	/**
	 * 查询条件字符串相等,ATTACH_THUMB_PATH: 附加文件缩略，如果是图片大于800*600，则生成缩略图，否则指向原始文件
	 */
	public String getAttachThumbPathEqual() {
		return this.attachThumbPathEqual;
	}
	
	/**
	 * 查询条件字符串相等,ATTACH_THUMB_PATH: 附加文件缩略，如果是图片大于800*600，则生成缩略图，否则指向原始文件
	 */
	public void setAttachThumbPathEqual(String value)
	 {
		this.attachThumbPathEqual = value;
	}
	
	/**
	 * 设置查询条件ISSUE_COMMENT_ID: 标识
	 */
	public IssueCommentQueryCondition setIssueCommentIdCondition(Integer value) {
		this.issueCommentId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_COMMENT_ID: 标识
	 */
	public IssueCommentQueryCondition setIssueCommentIdConditionBegin(Integer value) {
		this.issueCommentIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_COMMENT_ID: 标识
	 */
	public IssueCommentQueryCondition setIssueCommentIdConditionEnd(Integer value) {
		this.issueCommentIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_COMMENT_ID: 标识
	 */
	public IssueCommentQueryCondition setIssueCommentIdConditionEndEqual(Integer value) {
		this.issueCommentIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_ID: 问题标识
	 */
	public IssueCommentQueryCondition setIssueIdCondition(Integer value) {
		this.issueId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_ID: 问题标识
	 */
	public IssueCommentQueryCondition setIssueIdConditionBegin(Integer value) {
		this.issueIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_ID: 问题标识
	 */
	public IssueCommentQueryCondition setIssueIdConditionEnd(Integer value) {
		this.issueIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ISSUE_ID: 问题标识
	 */
	public IssueCommentQueryCondition setIssueIdConditionEndEqual(Integer value) {
		this.issueIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件COMMENT_USER_ID: 用户标识
	 */
	public IssueCommentQueryCondition setCommentUserIdCondition(Integer value) {
		this.commentUserId = value;
		return this;
	}
	
	/**
	 * 设置查询条件COMMENT_USER_ID: 用户标识
	 */
	public IssueCommentQueryCondition setCommentUserIdConditionBegin(Integer value) {
		this.commentUserIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件COMMENT_USER_ID: 用户标识
	 */
	public IssueCommentQueryCondition setCommentUserIdConditionEnd(Integer value) {
		this.commentUserIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件COMMENT_USER_ID: 用户标识
	 */
	public IssueCommentQueryCondition setCommentUserIdConditionEndEqual(Integer value) {
		this.commentUserIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件COMMENT_TYPE: 注释类型 0 表示普通注释 1 表示状态变化（系统自动插入）
	 */
	public IssueCommentQueryCondition setCommentTypeCondition(Byte value) {
		this.commentType = value;
		return this;
	}
	
	/**
	 * 设置查询条件COMMENT_TYPE: 注释类型 0 表示普通注释 1 表示状态变化（系统自动插入）
	 */
	public IssueCommentQueryCondition setCommentTypeConditionBegin(Byte value) {
		this.commentTypeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件COMMENT_TYPE: 注释类型 0 表示普通注释 1 表示状态变化（系统自动插入）
	 */
	public IssueCommentQueryCondition setCommentTypeConditionEnd(Byte value) {
		this.commentTypeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件COMMENT_TYPE: 注释类型 0 表示普通注释 1 表示状态变化（系统自动插入）
	 */
	public IssueCommentQueryCondition setCommentTypeConditionEndEqual(Byte value) {
		this.commentTypeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件COMMENT_TIME: 添加时间
	 */
	public IssueCommentQueryCondition setCommentTimeCondition(java.util.Date value) {
		this.commentTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件COMMENT_TIME: 添加时间
	 */
	public IssueCommentQueryCondition setCommentTimeConditionBegin(java.util.Date value) {
		this.commentTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件COMMENT_TIME: 添加时间
	 */
	public IssueCommentQueryCondition setCommentTimeConditionEnd(java.util.Date value) {
		this.commentTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件COMMENT_TIME: 添加时间
	 */
	public IssueCommentQueryCondition setCommentTimeConditionEndEqual(java.util.Date value) {
		this.commentTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件COMMENT_CONTENT: 注释内容
	 */
	public IssueCommentQueryCondition setCommentContentCondition(String value) {
		this.commentContent = value;
		return this;
	}
	
	/**
	 * 设置查询条件COMMENT_CONTENT: 注释内容
	 */
	public IssueCommentQueryCondition setCommentContentConditionEqual(String value) {
		this.commentContentEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_COMMENT_ID: 父注释ID,为0 表示没有
	 */
	public IssueCommentQueryCondition setParentCommentIdCondition(Integer value) {
		this.parentCommentId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_COMMENT_ID: 父注释ID,为0 表示没有
	 */
	public IssueCommentQueryCondition setParentCommentIdConditionBegin(Integer value) {
		this.parentCommentIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_COMMENT_ID: 父注释ID,为0 表示没有
	 */
	public IssueCommentQueryCondition setParentCommentIdConditionEnd(Integer value) {
		this.parentCommentIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_COMMENT_ID: 父注释ID,为0 表示没有
	 */
	public IssueCommentQueryCondition setParentCommentIdConditionEndEqual(Integer value) {
		this.parentCommentIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ATTACH_FILE_PATH: 附加文件路径
	 */
	public IssueCommentQueryCondition setAttachFilePathCondition(String value) {
		this.attachFilePath = value;
		return this;
	}
	
	/**
	 * 设置查询条件ATTACH_FILE_PATH: 附加文件路径
	 */
	public IssueCommentQueryCondition setAttachFilePathConditionEqual(String value) {
		this.attachFilePathEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ATTACH_FILE_SIZE: 附加文件大小，字节为单位
	 */
	public IssueCommentQueryCondition setAttachFileSizeCondition(Integer value) {
		this.attachFileSize = value;
		return this;
	}
	
	/**
	 * 设置查询条件ATTACH_FILE_SIZE: 附加文件大小，字节为单位
	 */
	public IssueCommentQueryCondition setAttachFileSizeConditionBegin(Integer value) {
		this.attachFileSizeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ATTACH_FILE_SIZE: 附加文件大小，字节为单位
	 */
	public IssueCommentQueryCondition setAttachFileSizeConditionEnd(Integer value) {
		this.attachFileSizeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ATTACH_FILE_SIZE: 附加文件大小，字节为单位
	 */
	public IssueCommentQueryCondition setAttachFileSizeConditionEndEqual(Integer value) {
		this.attachFileSizeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ATTACH_FILE_TYPE: 附加文件类型
	 */
	public IssueCommentQueryCondition setAttachFileTypeCondition(String value) {
		this.attachFileType = value;
		return this;
	}
	
	/**
	 * 设置查询条件ATTACH_FILE_TYPE: 附加文件类型
	 */
	public IssueCommentQueryCondition setAttachFileTypeConditionEqual(String value) {
		this.attachFileTypeEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ATTACH_THUMB_PATH: 附加文件缩略，如果是图片大于800*600，则生成缩略图，否则指向原始文件
	 */
	public IssueCommentQueryCondition setAttachThumbPathCondition(String value) {
		this.attachThumbPath = value;
		return this;
	}
	
	/**
	 * 设置查询条件ATTACH_THUMB_PATH: 附加文件缩略，如果是图片大于800*600，则生成缩略图，否则指向原始文件
	 */
	public IssueCommentQueryCondition setAttachThumbPathConditionEqual(String value) {
		this.attachThumbPathEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.issueCommentId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_COMMENT].[ISSUE_COMMENT_ID] = " + this.issueCommentId) 
						+ ") "));
		}
		if ((this.issueCommentIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[ISSUE_COMMENT_ID] >= " 
						+ (this.issueCommentIdBegin + ")")));
		}
		if ((this.issueCommentIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[ISSUE_COMMENT_ID] < " 
						+ (this.issueCommentIdEnd + ") ")));
		}
		if ((this.issueCommentIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[ISSUE_COMMENT_ID] <= " 
						+ (this.issueCommentIdEndEqual + ") ")));
		}
		if ((this.issueId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_COMMENT].[ISSUE_ID] = " + this.issueId) 
						+ ") "));
		}
		if ((this.issueIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[ISSUE_ID] >= " 
						+ (this.issueIdBegin + ")")));
		}
		if ((this.issueIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[ISSUE_ID] < " 
						+ (this.issueIdEnd + ") ")));
		}
		if ((this.issueIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[ISSUE_ID] <= " 
						+ (this.issueIdEndEqual + ") ")));
		}
		if ((this.commentUserId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_COMMENT].[COMMENT_USER_ID] = " + this.commentUserId) 
						+ ") "));
		}
		if ((this.commentUserIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[COMMENT_USER_ID] >= " 
						+ (this.commentUserIdBegin + ")")));
		}
		if ((this.commentUserIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[COMMENT_USER_ID] < " 
						+ (this.commentUserIdEnd + ") ")));
		}
		if ((this.commentUserIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[COMMENT_USER_ID] <= " 
						+ (this.commentUserIdEndEqual + ") ")));
		}
		if ((this.commentType == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_COMMENT].[COMMENT_TYPE] = " + this.commentType) 
						+ ") "));
		}
		if ((this.commentTypeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[COMMENT_TYPE] >= " 
						+ (this.commentTypeBegin + ")")));
		}
		if ((this.commentTypeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[COMMENT_TYPE] < " 
						+ (this.commentTypeEnd + ") ")));
		}
		if ((this.commentTypeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[COMMENT_TYPE] <= " 
						+ (this.commentTypeEndEqual + ") ")));
		}
		if ((this.commentTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_COMMENT].[COMMENT_TIME] = " + SqlServerUtils.getDateSql(this.commentTime)) 
						+ ") "));
		}
		if ((this.commentTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[COMMENT_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.commentTimeBegin) + ")")));
		}
		if ((this.commentTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[COMMENT_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.commentTimeEnd) + ") ")));
		}
		if ((this.commentTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[COMMENT_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.commentTimeEndEqual) + ") ")));
		}
		if ((this.parentCommentId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_COMMENT].[PARENT_COMMENT_ID] = " + this.parentCommentId) 
						+ ") "));
		}
		if ((this.parentCommentIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[PARENT_COMMENT_ID] >= " 
						+ (this.parentCommentIdBegin + ")")));
		}
		if ((this.parentCommentIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[PARENT_COMMENT_ID] < " 
						+ (this.parentCommentIdEnd + ") ")));
		}
		if ((this.parentCommentIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[PARENT_COMMENT_ID] <= " 
						+ (this.parentCommentIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.attachFilePath)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ISSUE_COMMENT].[ATTACH_FILE_PATH]", this.attachFilePath)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.attachFilePathEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ISSUE_COMMENT].[ATTACH_FILE_PATH] = " + SqlServerUtils.safeSql(this.attachFilePathEqual))) 
						+ ") "));
		}
		if ((this.attachFileSize == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_COMMENT].[ATTACH_FILE_SIZE] = " + this.attachFileSize) 
						+ ") "));
		}
		if ((this.attachFileSizeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[ATTACH_FILE_SIZE] >= " 
						+ (this.attachFileSizeBegin + ")")));
		}
		if ((this.attachFileSizeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[ATTACH_FILE_SIZE] < " 
						+ (this.attachFileSizeEnd + ") ")));
		}
		if ((this.attachFileSizeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_COMMENT].[ATTACH_FILE_SIZE] <= " 
						+ (this.attachFileSizeEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.attachFileType)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ISSUE_COMMENT].[ATTACH_FILE_TYPE]", this.attachFileType)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.attachFileTypeEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ISSUE_COMMENT].[ATTACH_FILE_TYPE] = " + SqlServerUtils.safeSql(this.attachFileTypeEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.attachThumbPath)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ISSUE_COMMENT].[ATTACH_THUMB_PATH]", this.attachThumbPath)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.attachThumbPathEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ISSUE_COMMENT].[ATTACH_THUMB_PATH] = " + SqlServerUtils.safeSql(this.attachThumbPathEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
