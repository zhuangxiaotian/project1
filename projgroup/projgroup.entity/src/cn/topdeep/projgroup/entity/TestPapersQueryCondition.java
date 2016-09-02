package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_TEST_PAPERS查询条件定义
 */
public class TestPapersQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,PAPERS_ID: 考卷标识
	 */
	Integer papersId;
	
	/**
	 * 查询条件开始值,PAPERS_ID: 考卷标识
	 */
	Integer papersIdBegin;
	
	/**
	 * 查询条件结束值,PAPERS_ID: 考卷标识
	 */
	Integer papersIdEnd;
	
	/**
	 * 查询条件结束值,PAPERS_ID: 考卷标识
	 */
	Integer papersIdEndEqual;
	
	/**
	 * 查询条件,MODIFY_OR: 操作员标识
	 */
	String modifyOr;
	
	/**
	 * 查询条件字符串相等,MODIFY_OR: 操作员标识
	 */
	String modifyOrEqual;
	
	/**
	 * 查询条件,PAPERS_NAME: 考试名称
	 */
	String papersName;
	
	/**
	 * 查询条件字符串相等,PAPERS_NAME: 考试名称
	 */
	String papersNameEqual;
	
	/**
	 * 查询条件,CREATE_TIME: 添加时间
	 */
	java.util.Date createTime;
	
	/**
	 * 查询条件开始值,CREATE_TIME: 添加时间
	 */
	java.util.Date createTimeBegin;
	
	/**
	 * 查询条件结束值,CREATE_TIME: 添加时间
	 */
	java.util.Date createTimeEnd;
	
	/**
	 * 查询条件结束值,CREATE_TIME: 添加时间
	 */
	java.util.Date createTimeEndEqual;
	
	/**
	 * 查询条件,TIME_LIMIT: 限时，以分钟为单位
	 */
	Integer timeLimit;
	
	/**
	 * 查询条件开始值,TIME_LIMIT: 限时，以分钟为单位
	 */
	Integer timeLimitBegin;
	
	/**
	 * 查询条件结束值,TIME_LIMIT: 限时，以分钟为单位
	 */
	Integer timeLimitEnd;
	
	/**
	 * 查询条件结束值,TIME_LIMIT: 限时，以分钟为单位
	 */
	Integer timeLimitEndEqual;
	
	/**
	 * 查询条件,DELETED: 删除
	 */
	Boolean deleted;
	
	/**
	 * 查询条件,STATUS: 状态 0 出题 1 允许考试 2 终止考试
	 */
	Byte status;
	
	/**
	 * 查询条件开始值,STATUS: 状态 0 出题 1 允许考试 2 终止考试
	 */
	Byte statusBegin;
	
	/**
	 * 查询条件结束值,STATUS: 状态 0 出题 1 允许考试 2 终止考试
	 */
	Byte statusEnd;
	
	/**
	 * 查询条件结束值,STATUS: 状态 0 出题 1 允许考试 2 终止考试
	 */
	Byte statusEndEqual;
	
	/**
	 * 查询条件,TOTAL_SCORE: 考卷总分,为空表示不限制
	 */
	Integer totalScore;
	
	/**
	 * 查询条件开始值,TOTAL_SCORE: 考卷总分,为空表示不限制
	 */
	Integer totalScoreBegin;
	
	/**
	 * 查询条件结束值,TOTAL_SCORE: 考卷总分,为空表示不限制
	 */
	Integer totalScoreEnd;
	
	/**
	 * 查询条件结束值,TOTAL_SCORE: 考卷总分,为空表示不限制
	 */
	Integer totalScoreEndEqual;
	
	/**
	 * 查询条件,QUESTION_TYPE_SCORE: 各题型分数限制，格式为type=xxx,type=xxx,如果某题型没有，则表示不限制该题型
	 */
	String questionTypeScore;
	
	/**
	 * 查询条件字符串相等,QUESTION_TYPE_SCORE: 各题型分数限制，格式为type=xxx,type=xxx,如果某题型没有，则表示不限制该题型
	 */
	String questionTypeScoreEqual;
	
	/**
	 * 查询条件,QUESTION_TYPE_PER_SCORE: 各题型每题的分数，格式同题型分数限制
	 */
	String questionTypePerScore;
	
	/**
	 * 查询条件字符串相等,QUESTION_TYPE_PER_SCORE: 各题型每题的分数，格式同题型分数限制
	 */
	String questionTypePerScoreEqual;
	
	/**
	 * 查询条件,PAPERS_TYPE: 试卷类型 0固定考题试卷 1 动态考题试卷(不记录考试内容，考过就算)
	 */
	Byte papersType;
	
	/**
	 * 查询条件开始值,PAPERS_TYPE: 试卷类型 0固定考题试卷 1 动态考题试卷(不记录考试内容，考过就算)
	 */
	Byte papersTypeBegin;
	
	/**
	 * 查询条件结束值,PAPERS_TYPE: 试卷类型 0固定考题试卷 1 动态考题试卷(不记录考试内容，考过就算)
	 */
	Byte papersTypeEnd;
	
	/**
	 * 查询条件结束值,PAPERS_TYPE: 试卷类型 0固定考题试卷 1 动态考题试卷(不记录考试内容，考过就算)
	 */
	Byte papersTypeEndEqual;
	
	/**
	 * PAPERS_ID: 考卷标识
	 */
	public Integer getPapersId() {
		return this.papersId;
	}
	
	/**
	 * PAPERS_ID: 考卷标识
	 */
	public void setPapersId(Integer value)
	 {
		this.papersId = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_ID: 考卷标识
	 */
	public Integer getPapersIdBegin() {
		return this.papersIdBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_ID: 考卷标识
	 */
	public void setPapersIdBegin(Integer value)
	 {
		this.papersIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_ID: 考卷标识
	 */
	public Integer getPapersIdEnd() {
		return this.papersIdEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_ID: 考卷标识
	 */
	public void setPapersIdEnd(Integer value)
	 {
		this.papersIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_ID: 考卷标识
	 */
	public Integer getPapersIdEndEqual() {
		return this.papersIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_ID: 考卷标识
	 */
	public void setPapersIdEndEqual(Integer value)
	 {
		this.papersIdEndEqual = value;
	}
	
	/**
	 * MODIFY_OR: 操作员标识
	 */
	public String getModifyOr() {
		return this.modifyOr;
	}
	
	/**
	 * MODIFY_OR: 操作员标识
	 */
	public void setModifyOr(String value)
	 {
		this.modifyOr = value;
	}
	
	/**
	 * 查询条件字符串相等,MODIFY_OR: 操作员标识
	 */
	public String getModifyOrEqual() {
		return this.modifyOrEqual;
	}
	
	/**
	 * 查询条件字符串相等,MODIFY_OR: 操作员标识
	 */
	public void setModifyOrEqual(String value)
	 {
		this.modifyOrEqual = value;
	}
	
	/**
	 * PAPERS_NAME: 考试名称
	 */
	public String getPapersName() {
		return this.papersName;
	}
	
	/**
	 * PAPERS_NAME: 考试名称
	 */
	public void setPapersName(String value)
	 {
		this.papersName = value;
	}
	
	/**
	 * 查询条件字符串相等,PAPERS_NAME: 考试名称
	 */
	public String getPapersNameEqual() {
		return this.papersNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,PAPERS_NAME: 考试名称
	 */
	public void setPapersNameEqual(String value)
	 {
		this.papersNameEqual = value;
	}
	
	/**
	 * CREATE_TIME: 添加时间
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	
	/**
	 * CREATE_TIME: 添加时间
	 */
	public void setCreateTime(java.util.Date value)
	 {
		this.createTime = value;
	}
	
	/**
	 * 查询条件开始值,CREATE_TIME: 添加时间
	 */
	public java.util.Date getCreateTimeBegin() {
		return this.createTimeBegin;
	}
	
	/**
	 * 查询条件开始值,CREATE_TIME: 添加时间
	 */
	public void setCreateTimeBegin(java.util.Date value)
	 {
		this.createTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,CREATE_TIME: 添加时间
	 */
	public java.util.Date getCreateTimeEnd() {
		return this.createTimeEnd;
	}
	
	/**
	 * 查询条件结束值,CREATE_TIME: 添加时间
	 */
	public void setCreateTimeEnd(java.util.Date value)
	 {
		this.createTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,CREATE_TIME: 添加时间
	 */
	public java.util.Date getCreateTimeEndEqual() {
		return this.createTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,CREATE_TIME: 添加时间
	 */
	public void setCreateTimeEndEqual(java.util.Date value)
	 {
		this.createTimeEndEqual = value;
	}
	
	/**
	 * TIME_LIMIT: 限时，以分钟为单位
	 */
	public Integer getTimeLimit() {
		return this.timeLimit;
	}
	
	/**
	 * TIME_LIMIT: 限时，以分钟为单位
	 */
	public void setTimeLimit(Integer value)
	 {
		this.timeLimit = value;
	}
	
	/**
	 * 查询条件开始值,TIME_LIMIT: 限时，以分钟为单位
	 */
	public Integer getTimeLimitBegin() {
		return this.timeLimitBegin;
	}
	
	/**
	 * 查询条件开始值,TIME_LIMIT: 限时，以分钟为单位
	 */
	public void setTimeLimitBegin(Integer value)
	 {
		this.timeLimitBegin = value;
	}
	
	/**
	 * 查询条件结束值,TIME_LIMIT: 限时，以分钟为单位
	 */
	public Integer getTimeLimitEnd() {
		return this.timeLimitEnd;
	}
	
	/**
	 * 查询条件结束值,TIME_LIMIT: 限时，以分钟为单位
	 */
	public void setTimeLimitEnd(Integer value)
	 {
		this.timeLimitEnd = value;
	}
	
	/**
	 * 查询条件结束值,TIME_LIMIT: 限时，以分钟为单位
	 */
	public Integer getTimeLimitEndEqual() {
		return this.timeLimitEndEqual;
	}
	
	/**
	 * 查询条件结束值,TIME_LIMIT: 限时，以分钟为单位
	 */
	public void setTimeLimitEndEqual(Integer value)
	 {
		this.timeLimitEndEqual = value;
	}
	
	/**
	 * DELETED: 删除
	 */
	public Boolean getDeleted() {
		return this.deleted;
	}
	
	/**
	 * DELETED: 删除
	 */
	public void setDeleted(Boolean value)
	 {
		this.deleted = value;
	}
	
	/**
	 * STATUS: 状态 0 出题 1 允许考试 2 终止考试
	 */
	public Byte getStatus() {
		return this.status;
	}
	
	/**
	 * STATUS: 状态 0 出题 1 允许考试 2 终止考试
	 */
	public void setStatus(Byte value)
	 {
		this.status = value;
	}
	
	/**
	 * 查询条件开始值,STATUS: 状态 0 出题 1 允许考试 2 终止考试
	 */
	public Byte getStatusBegin() {
		return this.statusBegin;
	}
	
	/**
	 * 查询条件开始值,STATUS: 状态 0 出题 1 允许考试 2 终止考试
	 */
	public void setStatusBegin(Byte value)
	 {
		this.statusBegin = value;
	}
	
	/**
	 * 查询条件结束值,STATUS: 状态 0 出题 1 允许考试 2 终止考试
	 */
	public Byte getStatusEnd() {
		return this.statusEnd;
	}
	
	/**
	 * 查询条件结束值,STATUS: 状态 0 出题 1 允许考试 2 终止考试
	 */
	public void setStatusEnd(Byte value)
	 {
		this.statusEnd = value;
	}
	
	/**
	 * 查询条件结束值,STATUS: 状态 0 出题 1 允许考试 2 终止考试
	 */
	public Byte getStatusEndEqual() {
		return this.statusEndEqual;
	}
	
	/**
	 * 查询条件结束值,STATUS: 状态 0 出题 1 允许考试 2 终止考试
	 */
	public void setStatusEndEqual(Byte value)
	 {
		this.statusEndEqual = value;
	}
	
	/**
	 * TOTAL_SCORE: 考卷总分,为空表示不限制
	 */
	public Integer getTotalScore() {
		return this.totalScore;
	}
	
	/**
	 * TOTAL_SCORE: 考卷总分,为空表示不限制
	 */
	public void setTotalScore(Integer value)
	 {
		this.totalScore = value;
	}
	
	/**
	 * 查询条件开始值,TOTAL_SCORE: 考卷总分,为空表示不限制
	 */
	public Integer getTotalScoreBegin() {
		return this.totalScoreBegin;
	}
	
	/**
	 * 查询条件开始值,TOTAL_SCORE: 考卷总分,为空表示不限制
	 */
	public void setTotalScoreBegin(Integer value)
	 {
		this.totalScoreBegin = value;
	}
	
	/**
	 * 查询条件结束值,TOTAL_SCORE: 考卷总分,为空表示不限制
	 */
	public Integer getTotalScoreEnd() {
		return this.totalScoreEnd;
	}
	
	/**
	 * 查询条件结束值,TOTAL_SCORE: 考卷总分,为空表示不限制
	 */
	public void setTotalScoreEnd(Integer value)
	 {
		this.totalScoreEnd = value;
	}
	
	/**
	 * 查询条件结束值,TOTAL_SCORE: 考卷总分,为空表示不限制
	 */
	public Integer getTotalScoreEndEqual() {
		return this.totalScoreEndEqual;
	}
	
	/**
	 * 查询条件结束值,TOTAL_SCORE: 考卷总分,为空表示不限制
	 */
	public void setTotalScoreEndEqual(Integer value)
	 {
		this.totalScoreEndEqual = value;
	}
	
	/**
	 * QUESTION_TYPE_SCORE: 各题型分数限制，格式为type=xxx,type=xxx,如果某题型没有，则表示不限制该题型
	 */
	public String getQuestionTypeScore() {
		return this.questionTypeScore;
	}
	
	/**
	 * QUESTION_TYPE_SCORE: 各题型分数限制，格式为type=xxx,type=xxx,如果某题型没有，则表示不限制该题型
	 */
	public void setQuestionTypeScore(String value)
	 {
		this.questionTypeScore = value;
	}
	
	/**
	 * 查询条件字符串相等,QUESTION_TYPE_SCORE: 各题型分数限制，格式为type=xxx,type=xxx,如果某题型没有，则表示不限制该题型
	 */
	public String getQuestionTypeScoreEqual() {
		return this.questionTypeScoreEqual;
	}
	
	/**
	 * 查询条件字符串相等,QUESTION_TYPE_SCORE: 各题型分数限制，格式为type=xxx,type=xxx,如果某题型没有，则表示不限制该题型
	 */
	public void setQuestionTypeScoreEqual(String value)
	 {
		this.questionTypeScoreEqual = value;
	}
	
	/**
	 * QUESTION_TYPE_PER_SCORE: 各题型每题的分数，格式同题型分数限制
	 */
	public String getQuestionTypePerScore() {
		return this.questionTypePerScore;
	}
	
	/**
	 * QUESTION_TYPE_PER_SCORE: 各题型每题的分数，格式同题型分数限制
	 */
	public void setQuestionTypePerScore(String value)
	 {
		this.questionTypePerScore = value;
	}
	
	/**
	 * 查询条件字符串相等,QUESTION_TYPE_PER_SCORE: 各题型每题的分数，格式同题型分数限制
	 */
	public String getQuestionTypePerScoreEqual() {
		return this.questionTypePerScoreEqual;
	}
	
	/**
	 * 查询条件字符串相等,QUESTION_TYPE_PER_SCORE: 各题型每题的分数，格式同题型分数限制
	 */
	public void setQuestionTypePerScoreEqual(String value)
	 {
		this.questionTypePerScoreEqual = value;
	}
	
	/**
	 * PAPERS_TYPE: 试卷类型 0固定考题试卷 1 动态考题试卷(不记录考试内容，考过就算)
	 */
	public Byte getPapersType() {
		return this.papersType;
	}
	
	/**
	 * PAPERS_TYPE: 试卷类型 0固定考题试卷 1 动态考题试卷(不记录考试内容，考过就算)
	 */
	public void setPapersType(Byte value)
	 {
		this.papersType = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_TYPE: 试卷类型 0固定考题试卷 1 动态考题试卷(不记录考试内容，考过就算)
	 */
	public Byte getPapersTypeBegin() {
		return this.papersTypeBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_TYPE: 试卷类型 0固定考题试卷 1 动态考题试卷(不记录考试内容，考过就算)
	 */
	public void setPapersTypeBegin(Byte value)
	 {
		this.papersTypeBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_TYPE: 试卷类型 0固定考题试卷 1 动态考题试卷(不记录考试内容，考过就算)
	 */
	public Byte getPapersTypeEnd() {
		return this.papersTypeEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_TYPE: 试卷类型 0固定考题试卷 1 动态考题试卷(不记录考试内容，考过就算)
	 */
	public void setPapersTypeEnd(Byte value)
	 {
		this.papersTypeEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_TYPE: 试卷类型 0固定考题试卷 1 动态考题试卷(不记录考试内容，考过就算)
	 */
	public Byte getPapersTypeEndEqual() {
		return this.papersTypeEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_TYPE: 试卷类型 0固定考题试卷 1 动态考题试卷(不记录考试内容，考过就算)
	 */
	public void setPapersTypeEndEqual(Byte value)
	 {
		this.papersTypeEndEqual = value;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 考卷标识
	 */
	public TestPapersQueryCondition setPapersIdCondition(Integer value) {
		this.papersId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 考卷标识
	 */
	public TestPapersQueryCondition setPapersIdConditionBegin(Integer value) {
		this.papersIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 考卷标识
	 */
	public TestPapersQueryCondition setPapersIdConditionEnd(Integer value) {
		this.papersIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 考卷标识
	 */
	public TestPapersQueryCondition setPapersIdConditionEndEqual(Integer value) {
		this.papersIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_OR: 操作员标识
	 */
	public TestPapersQueryCondition setModifyOrCondition(String value) {
		this.modifyOr = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_OR: 操作员标识
	 */
	public TestPapersQueryCondition setModifyOrConditionEqual(String value) {
		this.modifyOrEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_NAME: 考试名称
	 */
	public TestPapersQueryCondition setPapersNameCondition(String value) {
		this.papersName = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_NAME: 考试名称
	 */
	public TestPapersQueryCondition setPapersNameConditionEqual(String value) {
		this.papersNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 添加时间
	 */
	public TestPapersQueryCondition setCreateTimeCondition(java.util.Date value) {
		this.createTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 添加时间
	 */
	public TestPapersQueryCondition setCreateTimeConditionBegin(java.util.Date value) {
		this.createTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 添加时间
	 */
	public TestPapersQueryCondition setCreateTimeConditionEnd(java.util.Date value) {
		this.createTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 添加时间
	 */
	public TestPapersQueryCondition setCreateTimeConditionEndEqual(java.util.Date value) {
		this.createTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TIME_LIMIT: 限时，以分钟为单位
	 */
	public TestPapersQueryCondition setTimeLimitCondition(Integer value) {
		this.timeLimit = value;
		return this;
	}
	
	/**
	 * 设置查询条件TIME_LIMIT: 限时，以分钟为单位
	 */
	public TestPapersQueryCondition setTimeLimitConditionBegin(Integer value) {
		this.timeLimitBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TIME_LIMIT: 限时，以分钟为单位
	 */
	public TestPapersQueryCondition setTimeLimitConditionEnd(Integer value) {
		this.timeLimitEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TIME_LIMIT: 限时，以分钟为单位
	 */
	public TestPapersQueryCondition setTimeLimitConditionEndEqual(Integer value) {
		this.timeLimitEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DELETED: 删除
	 */
	public TestPapersQueryCondition setDeletedCondition(Boolean value) {
		this.deleted = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATUS: 状态 0 出题 1 允许考试 2 终止考试
	 */
	public TestPapersQueryCondition setStatusCondition(Byte value) {
		this.status = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATUS: 状态 0 出题 1 允许考试 2 终止考试
	 */
	public TestPapersQueryCondition setStatusConditionBegin(Byte value) {
		this.statusBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATUS: 状态 0 出题 1 允许考试 2 终止考试
	 */
	public TestPapersQueryCondition setStatusConditionEnd(Byte value) {
		this.statusEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATUS: 状态 0 出题 1 允许考试 2 终止考试
	 */
	public TestPapersQueryCondition setStatusConditionEndEqual(Byte value) {
		this.statusEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TOTAL_SCORE: 考卷总分,为空表示不限制
	 */
	public TestPapersQueryCondition setTotalScoreCondition(Integer value) {
		this.totalScore = value;
		return this;
	}
	
	/**
	 * 设置查询条件TOTAL_SCORE: 考卷总分,为空表示不限制
	 */
	public TestPapersQueryCondition setTotalScoreConditionBegin(Integer value) {
		this.totalScoreBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TOTAL_SCORE: 考卷总分,为空表示不限制
	 */
	public TestPapersQueryCondition setTotalScoreConditionEnd(Integer value) {
		this.totalScoreEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TOTAL_SCORE: 考卷总分,为空表示不限制
	 */
	public TestPapersQueryCondition setTotalScoreConditionEndEqual(Integer value) {
		this.totalScoreEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE_SCORE: 各题型分数限制，格式为type=xxx,type=xxx,如果某题型没有，则表示不限制该题型
	 */
	public TestPapersQueryCondition setQuestionTypeScoreCondition(String value) {
		this.questionTypeScore = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE_SCORE: 各题型分数限制，格式为type=xxx,type=xxx,如果某题型没有，则表示不限制该题型
	 */
	public TestPapersQueryCondition setQuestionTypeScoreConditionEqual(String value) {
		this.questionTypeScoreEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE_PER_SCORE: 各题型每题的分数，格式同题型分数限制
	 */
	public TestPapersQueryCondition setQuestionTypePerScoreCondition(String value) {
		this.questionTypePerScore = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE_PER_SCORE: 各题型每题的分数，格式同题型分数限制
	 */
	public TestPapersQueryCondition setQuestionTypePerScoreConditionEqual(String value) {
		this.questionTypePerScoreEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_TYPE: 试卷类型 0固定考题试卷 1 动态考题试卷(不记录考试内容，考过就算)
	 */
	public TestPapersQueryCondition setPapersTypeCondition(Byte value) {
		this.papersType = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_TYPE: 试卷类型 0固定考题试卷 1 动态考题试卷(不记录考试内容，考过就算)
	 */
	public TestPapersQueryCondition setPapersTypeConditionBegin(Byte value) {
		this.papersTypeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_TYPE: 试卷类型 0固定考题试卷 1 动态考题试卷(不记录考试内容，考过就算)
	 */
	public TestPapersQueryCondition setPapersTypeConditionEnd(Byte value) {
		this.papersTypeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_TYPE: 试卷类型 0固定考题试卷 1 动态考题试卷(不记录考试内容，考过就算)
	 */
	public TestPapersQueryCondition setPapersTypeConditionEndEqual(Byte value) {
		this.papersTypeEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.papersId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TEST_PAPERS].[PAPERS_ID] = " + this.papersId) 
						+ ") "));
		}
		if ((this.papersIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS].[PAPERS_ID] >= " 
						+ (this.papersIdBegin + ")")));
		}
		if ((this.papersIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS].[PAPERS_ID] < " 
						+ (this.papersIdEnd + ") ")));
		}
		if ((this.papersIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS].[PAPERS_ID] <= " 
						+ (this.papersIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.modifyOr)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TEST_PAPERS].[MODIFY_OR]", this.modifyOr)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.modifyOrEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TEST_PAPERS].[MODIFY_OR] = " + SqlServerUtils.safeSql(this.modifyOrEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.papersName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TEST_PAPERS].[PAPERS_NAME]", this.papersName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.papersNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TEST_PAPERS].[PAPERS_NAME] = " + SqlServerUtils.safeSql(this.papersNameEqual))) 
						+ ") "));
		}
		if ((this.createTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TEST_PAPERS].[CREATE_TIME] = " + SqlServerUtils.getDateSql(this.createTime)) 
						+ ") "));
		}
		if ((this.createTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS].[CREATE_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.createTimeBegin) + ")")));
		}
		if ((this.createTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS].[CREATE_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.createTimeEnd) + ") ")));
		}
		if ((this.createTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS].[CREATE_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.createTimeEndEqual) + ") ")));
		}
		if ((this.timeLimit == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TEST_PAPERS].[TIME_LIMIT] = " + this.timeLimit) 
						+ ") "));
		}
		if ((this.timeLimitBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS].[TIME_LIMIT] >= " 
						+ (this.timeLimitBegin + ")")));
		}
		if ((this.timeLimitEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS].[TIME_LIMIT] < " 
						+ (this.timeLimitEnd + ") ")));
		}
		if ((this.timeLimitEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS].[TIME_LIMIT] <= " 
						+ (this.timeLimitEndEqual + ") ")));
		}
		if ((this.deleted == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TEST_PAPERS].[DELETED] = " + SqlServerUtils.getBoolSql(this.deleted)) 
						+ ") "));
		}
		if ((this.status == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TEST_PAPERS].[STATUS] = " + this.status) 
						+ ") "));
		}
		if ((this.statusBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS].[STATUS] >= " 
						+ (this.statusBegin + ")")));
		}
		if ((this.statusEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS].[STATUS] < " 
						+ (this.statusEnd + ") ")));
		}
		if ((this.statusEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS].[STATUS] <= " 
						+ (this.statusEndEqual + ") ")));
		}
		if ((this.totalScore == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TEST_PAPERS].[TOTAL_SCORE] = " + this.totalScore) 
						+ ") "));
		}
		if ((this.totalScoreBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS].[TOTAL_SCORE] >= " 
						+ (this.totalScoreBegin + ")")));
		}
		if ((this.totalScoreEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS].[TOTAL_SCORE] < " 
						+ (this.totalScoreEnd + ") ")));
		}
		if ((this.totalScoreEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS].[TOTAL_SCORE] <= " 
						+ (this.totalScoreEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.questionTypeScore)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TEST_PAPERS].[QUESTION_TYPE_SCORE]", this.questionTypeScore)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.questionTypeScoreEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TEST_PAPERS].[QUESTION_TYPE_SCORE] = " + SqlServerUtils.safeSql(this.questionTypeScoreEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.questionTypePerScore)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TEST_PAPERS].[QUESTION_TYPE_PER_SCORE]", this.questionTypePerScore)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.questionTypePerScoreEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TEST_PAPERS].[QUESTION_TYPE_PER_SCORE] = " + SqlServerUtils.safeSql(this.questionTypePerScoreEqual))) 
						+ ") "));
		}
		if ((this.papersType == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TEST_PAPERS].[PAPERS_TYPE] = " + this.papersType) 
						+ ") "));
		}
		if ((this.papersTypeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS].[PAPERS_TYPE] >= " 
						+ (this.papersTypeBegin + ")")));
		}
		if ((this.papersTypeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS].[PAPERS_TYPE] < " 
						+ (this.papersTypeEnd + ") ")));
		}
		if ((this.papersTypeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS].[PAPERS_TYPE] <= " 
						+ (this.papersTypeEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
