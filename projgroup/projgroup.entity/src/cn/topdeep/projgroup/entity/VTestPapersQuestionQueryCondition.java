package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * V_TEST_PAPERS_QUESTION查询条件定义
 */
public class VTestPapersQuestionQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,QUESTION_ID: 
	 */
	Integer questionId;
	
	/**
	 * 查询条件开始值,QUESTION_ID: 
	 */
	Integer questionIdBegin;
	
	/**
	 * 查询条件结束值,QUESTION_ID: 
	 */
	Integer questionIdEnd;
	
	/**
	 * 查询条件结束值,QUESTION_ID: 
	 */
	Integer questionIdEndEqual;
	
	/**
	 * 查询条件,CATEGORY_ID: 
	 */
	Integer categoryId;
	
	/**
	 * 查询条件开始值,CATEGORY_ID: 
	 */
	Integer categoryIdBegin;
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 
	 */
	Integer categoryIdEnd;
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 
	 */
	Integer categoryIdEndEqual;
	
	/**
	 * 查询条件,MODIFY_OR: 
	 */
	String modifyOr;
	
	/**
	 * 查询条件字符串相等,MODIFY_OR: 
	 */
	String modifyOrEqual;
	
	/**
	 * 查询条件,QUESTION_TYPE: 
	 */
	Byte questionType;
	
	/**
	 * 查询条件开始值,QUESTION_TYPE: 
	 */
	Byte questionTypeBegin;
	
	/**
	 * 查询条件结束值,QUESTION_TYPE: 
	 */
	Byte questionTypeEnd;
	
	/**
	 * 查询条件结束值,QUESTION_TYPE: 
	 */
	Byte questionTypeEndEqual;
	
	/**
	 * 查询条件,QUESTION_CONTENT: 
	 */
	String questionContent;
	
	/**
	 * 查询条件字符串相等,QUESTION_CONTENT: 
	 */
	String questionContentEqual;
	
	/**
	 * 查询条件,CREATE_TIME: 
	 */
	java.util.Date createTime;
	
	/**
	 * 查询条件开始值,CREATE_TIME: 
	 */
	java.util.Date createTimeBegin;
	
	/**
	 * 查询条件结束值,CREATE_TIME: 
	 */
	java.util.Date createTimeEnd;
	
	/**
	 * 查询条件结束值,CREATE_TIME: 
	 */
	java.util.Date createTimeEndEqual;
	
	/**
	 * 查询条件,DELETED: 
	 */
	Boolean deleted;
	
	/**
	 * 查询条件,MODIFY_TIME: 
	 */
	java.util.Date modifyTime;
	
	/**
	 * 查询条件开始值,MODIFY_TIME: 
	 */
	java.util.Date modifyTimeBegin;
	
	/**
	 * 查询条件结束值,MODIFY_TIME: 
	 */
	java.util.Date modifyTimeEnd;
	
	/**
	 * 查询条件结束值,MODIFY_TIME: 
	 */
	java.util.Date modifyTimeEndEqual;
	
	/**
	 * 查询条件,PAPERS_ID: 
	 */
	Integer papersId;
	
	/**
	 * 查询条件开始值,PAPERS_ID: 
	 */
	Integer papersIdBegin;
	
	/**
	 * 查询条件结束值,PAPERS_ID: 
	 */
	Integer papersIdEnd;
	
	/**
	 * 查询条件结束值,PAPERS_ID: 
	 */
	Integer papersIdEndEqual;
	
	/**
	 * 查询条件,PAPERS_QUESTION_ID: 
	 */
	Integer papersQuestionId;
	
	/**
	 * 查询条件开始值,PAPERS_QUESTION_ID: 
	 */
	Integer papersQuestionIdBegin;
	
	/**
	 * 查询条件结束值,PAPERS_QUESTION_ID: 
	 */
	Integer papersQuestionIdEnd;
	
	/**
	 * 查询条件结束值,PAPERS_QUESTION_ID: 
	 */
	Integer papersQuestionIdEndEqual;
	
	/**
	 * 查询条件,QUESTION_SN: 
	 */
	Integer questionSn;
	
	/**
	 * 查询条件开始值,QUESTION_SN: 
	 */
	Integer questionSnBegin;
	
	/**
	 * 查询条件结束值,QUESTION_SN: 
	 */
	Integer questionSnEnd;
	
	/**
	 * 查询条件结束值,QUESTION_SN: 
	 */
	Integer questionSnEndEqual;
	
	/**
	 * 查询条件,CATEGORY_NAME: 
	 */
	String categoryName;
	
	/**
	 * 查询条件字符串相等,CATEGORY_NAME: 
	 */
	String categoryNameEqual;
	
	/**
	 * 查询条件,CATEGORY_DESC: 
	 */
	String categoryDesc;
	
	/**
	 * 查询条件字符串相等,CATEGORY_DESC: 
	 */
	String categoryDescEqual;
	
	/**
	 * 查询条件,QUESTION_CATEGORY_DELETED: 
	 */
	Boolean questionCategoryDeleted;
	
	/**
	 * QUESTION_ID: 
	 */
	public Integer getQuestionId() {
		return this.questionId;
	}
	
	/**
	 * QUESTION_ID: 
	 */
	public void setQuestionId(Integer value)
	 {
		this.questionId = value;
	}
	
	/**
	 * 查询条件开始值,QUESTION_ID: 
	 */
	public Integer getQuestionIdBegin() {
		return this.questionIdBegin;
	}
	
	/**
	 * 查询条件开始值,QUESTION_ID: 
	 */
	public void setQuestionIdBegin(Integer value)
	 {
		this.questionIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,QUESTION_ID: 
	 */
	public Integer getQuestionIdEnd() {
		return this.questionIdEnd;
	}
	
	/**
	 * 查询条件结束值,QUESTION_ID: 
	 */
	public void setQuestionIdEnd(Integer value)
	 {
		this.questionIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,QUESTION_ID: 
	 */
	public Integer getQuestionIdEndEqual() {
		return this.questionIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,QUESTION_ID: 
	 */
	public void setQuestionIdEndEqual(Integer value)
	 {
		this.questionIdEndEqual = value;
	}
	
	/**
	 * CATEGORY_ID: 
	 */
	public Integer getCategoryId() {
		return this.categoryId;
	}
	
	/**
	 * CATEGORY_ID: 
	 */
	public void setCategoryId(Integer value)
	 {
		this.categoryId = value;
	}
	
	/**
	 * 查询条件开始值,CATEGORY_ID: 
	 */
	public Integer getCategoryIdBegin() {
		return this.categoryIdBegin;
	}
	
	/**
	 * 查询条件开始值,CATEGORY_ID: 
	 */
	public void setCategoryIdBegin(Integer value)
	 {
		this.categoryIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 
	 */
	public Integer getCategoryIdEnd() {
		return this.categoryIdEnd;
	}
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 
	 */
	public void setCategoryIdEnd(Integer value)
	 {
		this.categoryIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 
	 */
	public Integer getCategoryIdEndEqual() {
		return this.categoryIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 
	 */
	public void setCategoryIdEndEqual(Integer value)
	 {
		this.categoryIdEndEqual = value;
	}
	
	/**
	 * MODIFY_OR: 
	 */
	public String getModifyOr() {
		return this.modifyOr;
	}
	
	/**
	 * MODIFY_OR: 
	 */
	public void setModifyOr(String value)
	 {
		this.modifyOr = value;
	}
	
	/**
	 * 查询条件字符串相等,MODIFY_OR: 
	 */
	public String getModifyOrEqual() {
		return this.modifyOrEqual;
	}
	
	/**
	 * 查询条件字符串相等,MODIFY_OR: 
	 */
	public void setModifyOrEqual(String value)
	 {
		this.modifyOrEqual = value;
	}
	
	/**
	 * QUESTION_TYPE: 
	 */
	public Byte getQuestionType() {
		return this.questionType;
	}
	
	/**
	 * QUESTION_TYPE: 
	 */
	public void setQuestionType(Byte value)
	 {
		this.questionType = value;
	}
	
	/**
	 * 查询条件开始值,QUESTION_TYPE: 
	 */
	public Byte getQuestionTypeBegin() {
		return this.questionTypeBegin;
	}
	
	/**
	 * 查询条件开始值,QUESTION_TYPE: 
	 */
	public void setQuestionTypeBegin(Byte value)
	 {
		this.questionTypeBegin = value;
	}
	
	/**
	 * 查询条件结束值,QUESTION_TYPE: 
	 */
	public Byte getQuestionTypeEnd() {
		return this.questionTypeEnd;
	}
	
	/**
	 * 查询条件结束值,QUESTION_TYPE: 
	 */
	public void setQuestionTypeEnd(Byte value)
	 {
		this.questionTypeEnd = value;
	}
	
	/**
	 * 查询条件结束值,QUESTION_TYPE: 
	 */
	public Byte getQuestionTypeEndEqual() {
		return this.questionTypeEndEqual;
	}
	
	/**
	 * 查询条件结束值,QUESTION_TYPE: 
	 */
	public void setQuestionTypeEndEqual(Byte value)
	 {
		this.questionTypeEndEqual = value;
	}
	
	/**
	 * QUESTION_CONTENT: 
	 */
	public String getQuestionContent() {
		return this.questionContent;
	}
	
	/**
	 * QUESTION_CONTENT: 
	 */
	public void setQuestionContent(String value)
	 {
		this.questionContent = value;
	}
	
	/**
	 * 查询条件字符串相等,QUESTION_CONTENT: 
	 */
	public String getQuestionContentEqual() {
		return this.questionContentEqual;
	}
	
	/**
	 * 查询条件字符串相等,QUESTION_CONTENT: 
	 */
	public void setQuestionContentEqual(String value)
	 {
		this.questionContentEqual = value;
	}
	
	/**
	 * CREATE_TIME: 
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	
	/**
	 * CREATE_TIME: 
	 */
	public void setCreateTime(java.util.Date value)
	 {
		this.createTime = value;
	}
	
	/**
	 * 查询条件开始值,CREATE_TIME: 
	 */
	public java.util.Date getCreateTimeBegin() {
		return this.createTimeBegin;
	}
	
	/**
	 * 查询条件开始值,CREATE_TIME: 
	 */
	public void setCreateTimeBegin(java.util.Date value)
	 {
		this.createTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,CREATE_TIME: 
	 */
	public java.util.Date getCreateTimeEnd() {
		return this.createTimeEnd;
	}
	
	/**
	 * 查询条件结束值,CREATE_TIME: 
	 */
	public void setCreateTimeEnd(java.util.Date value)
	 {
		this.createTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,CREATE_TIME: 
	 */
	public java.util.Date getCreateTimeEndEqual() {
		return this.createTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,CREATE_TIME: 
	 */
	public void setCreateTimeEndEqual(java.util.Date value)
	 {
		this.createTimeEndEqual = value;
	}
	
	/**
	 * DELETED: 
	 */
	public Boolean getDeleted() {
		return this.deleted;
	}
	
	/**
	 * DELETED: 
	 */
	public void setDeleted(Boolean value)
	 {
		this.deleted = value;
	}
	
	/**
	 * MODIFY_TIME: 
	 */
	public java.util.Date getModifyTime() {
		return this.modifyTime;
	}
	
	/**
	 * MODIFY_TIME: 
	 */
	public void setModifyTime(java.util.Date value)
	 {
		this.modifyTime = value;
	}
	
	/**
	 * 查询条件开始值,MODIFY_TIME: 
	 */
	public java.util.Date getModifyTimeBegin() {
		return this.modifyTimeBegin;
	}
	
	/**
	 * 查询条件开始值,MODIFY_TIME: 
	 */
	public void setModifyTimeBegin(java.util.Date value)
	 {
		this.modifyTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,MODIFY_TIME: 
	 */
	public java.util.Date getModifyTimeEnd() {
		return this.modifyTimeEnd;
	}
	
	/**
	 * 查询条件结束值,MODIFY_TIME: 
	 */
	public void setModifyTimeEnd(java.util.Date value)
	 {
		this.modifyTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,MODIFY_TIME: 
	 */
	public java.util.Date getModifyTimeEndEqual() {
		return this.modifyTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,MODIFY_TIME: 
	 */
	public void setModifyTimeEndEqual(java.util.Date value)
	 {
		this.modifyTimeEndEqual = value;
	}
	
	/**
	 * PAPERS_ID: 
	 */
	public Integer getPapersId() {
		return this.papersId;
	}
	
	/**
	 * PAPERS_ID: 
	 */
	public void setPapersId(Integer value)
	 {
		this.papersId = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_ID: 
	 */
	public Integer getPapersIdBegin() {
		return this.papersIdBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_ID: 
	 */
	public void setPapersIdBegin(Integer value)
	 {
		this.papersIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_ID: 
	 */
	public Integer getPapersIdEnd() {
		return this.papersIdEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_ID: 
	 */
	public void setPapersIdEnd(Integer value)
	 {
		this.papersIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_ID: 
	 */
	public Integer getPapersIdEndEqual() {
		return this.papersIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_ID: 
	 */
	public void setPapersIdEndEqual(Integer value)
	 {
		this.papersIdEndEqual = value;
	}
	
	/**
	 * PAPERS_QUESTION_ID: 
	 */
	public Integer getPapersQuestionId() {
		return this.papersQuestionId;
	}
	
	/**
	 * PAPERS_QUESTION_ID: 
	 */
	public void setPapersQuestionId(Integer value)
	 {
		this.papersQuestionId = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_QUESTION_ID: 
	 */
	public Integer getPapersQuestionIdBegin() {
		return this.papersQuestionIdBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_QUESTION_ID: 
	 */
	public void setPapersQuestionIdBegin(Integer value)
	 {
		this.papersQuestionIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_QUESTION_ID: 
	 */
	public Integer getPapersQuestionIdEnd() {
		return this.papersQuestionIdEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_QUESTION_ID: 
	 */
	public void setPapersQuestionIdEnd(Integer value)
	 {
		this.papersQuestionIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_QUESTION_ID: 
	 */
	public Integer getPapersQuestionIdEndEqual() {
		return this.papersQuestionIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_QUESTION_ID: 
	 */
	public void setPapersQuestionIdEndEqual(Integer value)
	 {
		this.papersQuestionIdEndEqual = value;
	}
	
	/**
	 * QUESTION_SN: 
	 */
	public Integer getQuestionSn() {
		return this.questionSn;
	}
	
	/**
	 * QUESTION_SN: 
	 */
	public void setQuestionSn(Integer value)
	 {
		this.questionSn = value;
	}
	
	/**
	 * 查询条件开始值,QUESTION_SN: 
	 */
	public Integer getQuestionSnBegin() {
		return this.questionSnBegin;
	}
	
	/**
	 * 查询条件开始值,QUESTION_SN: 
	 */
	public void setQuestionSnBegin(Integer value)
	 {
		this.questionSnBegin = value;
	}
	
	/**
	 * 查询条件结束值,QUESTION_SN: 
	 */
	public Integer getQuestionSnEnd() {
		return this.questionSnEnd;
	}
	
	/**
	 * 查询条件结束值,QUESTION_SN: 
	 */
	public void setQuestionSnEnd(Integer value)
	 {
		this.questionSnEnd = value;
	}
	
	/**
	 * 查询条件结束值,QUESTION_SN: 
	 */
	public Integer getQuestionSnEndEqual() {
		return this.questionSnEndEqual;
	}
	
	/**
	 * 查询条件结束值,QUESTION_SN: 
	 */
	public void setQuestionSnEndEqual(Integer value)
	 {
		this.questionSnEndEqual = value;
	}
	
	/**
	 * CATEGORY_NAME: 
	 */
	public String getCategoryName() {
		return this.categoryName;
	}
	
	/**
	 * CATEGORY_NAME: 
	 */
	public void setCategoryName(String value)
	 {
		this.categoryName = value;
	}
	
	/**
	 * 查询条件字符串相等,CATEGORY_NAME: 
	 */
	public String getCategoryNameEqual() {
		return this.categoryNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,CATEGORY_NAME: 
	 */
	public void setCategoryNameEqual(String value)
	 {
		this.categoryNameEqual = value;
	}
	
	/**
	 * CATEGORY_DESC: 
	 */
	public String getCategoryDesc() {
		return this.categoryDesc;
	}
	
	/**
	 * CATEGORY_DESC: 
	 */
	public void setCategoryDesc(String value)
	 {
		this.categoryDesc = value;
	}
	
	/**
	 * 查询条件字符串相等,CATEGORY_DESC: 
	 */
	public String getCategoryDescEqual() {
		return this.categoryDescEqual;
	}
	
	/**
	 * 查询条件字符串相等,CATEGORY_DESC: 
	 */
	public void setCategoryDescEqual(String value)
	 {
		this.categoryDescEqual = value;
	}
	
	/**
	 * QUESTION_CATEGORY_DELETED: 
	 */
	public Boolean getQuestionCategoryDeleted() {
		return this.questionCategoryDeleted;
	}
	
	/**
	 * QUESTION_CATEGORY_DELETED: 
	 */
	public void setQuestionCategoryDeleted(Boolean value)
	 {
		this.questionCategoryDeleted = value;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 
	 */
	public VTestPapersQuestionQueryCondition setQuestionIdCondition(Integer value) {
		this.questionId = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 
	 */
	public VTestPapersQuestionQueryCondition setQuestionIdConditionBegin(Integer value) {
		this.questionIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 
	 */
	public VTestPapersQuestionQueryCondition setQuestionIdConditionEnd(Integer value) {
		this.questionIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 
	 */
	public VTestPapersQuestionQueryCondition setQuestionIdConditionEndEqual(Integer value) {
		this.questionIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 
	 */
	public VTestPapersQuestionQueryCondition setCategoryIdCondition(Integer value) {
		this.categoryId = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 
	 */
	public VTestPapersQuestionQueryCondition setCategoryIdConditionBegin(Integer value) {
		this.categoryIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 
	 */
	public VTestPapersQuestionQueryCondition setCategoryIdConditionEnd(Integer value) {
		this.categoryIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 
	 */
	public VTestPapersQuestionQueryCondition setCategoryIdConditionEndEqual(Integer value) {
		this.categoryIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_OR: 
	 */
	public VTestPapersQuestionQueryCondition setModifyOrCondition(String value) {
		this.modifyOr = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_OR: 
	 */
	public VTestPapersQuestionQueryCondition setModifyOrConditionEqual(String value) {
		this.modifyOrEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE: 
	 */
	public VTestPapersQuestionQueryCondition setQuestionTypeCondition(Byte value) {
		this.questionType = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE: 
	 */
	public VTestPapersQuestionQueryCondition setQuestionTypeConditionBegin(Byte value) {
		this.questionTypeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE: 
	 */
	public VTestPapersQuestionQueryCondition setQuestionTypeConditionEnd(Byte value) {
		this.questionTypeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE: 
	 */
	public VTestPapersQuestionQueryCondition setQuestionTypeConditionEndEqual(Byte value) {
		this.questionTypeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_CONTENT: 
	 */
	public VTestPapersQuestionQueryCondition setQuestionContentCondition(String value) {
		this.questionContent = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_CONTENT: 
	 */
	public VTestPapersQuestionQueryCondition setQuestionContentConditionEqual(String value) {
		this.questionContentEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 
	 */
	public VTestPapersQuestionQueryCondition setCreateTimeCondition(java.util.Date value) {
		this.createTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 
	 */
	public VTestPapersQuestionQueryCondition setCreateTimeConditionBegin(java.util.Date value) {
		this.createTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 
	 */
	public VTestPapersQuestionQueryCondition setCreateTimeConditionEnd(java.util.Date value) {
		this.createTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 
	 */
	public VTestPapersQuestionQueryCondition setCreateTimeConditionEndEqual(java.util.Date value) {
		this.createTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DELETED: 
	 */
	public VTestPapersQuestionQueryCondition setDeletedCondition(Boolean value) {
		this.deleted = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 
	 */
	public VTestPapersQuestionQueryCondition setModifyTimeCondition(java.util.Date value) {
		this.modifyTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 
	 */
	public VTestPapersQuestionQueryCondition setModifyTimeConditionBegin(java.util.Date value) {
		this.modifyTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 
	 */
	public VTestPapersQuestionQueryCondition setModifyTimeConditionEnd(java.util.Date value) {
		this.modifyTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 
	 */
	public VTestPapersQuestionQueryCondition setModifyTimeConditionEndEqual(java.util.Date value) {
		this.modifyTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 
	 */
	public VTestPapersQuestionQueryCondition setPapersIdCondition(Integer value) {
		this.papersId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 
	 */
	public VTestPapersQuestionQueryCondition setPapersIdConditionBegin(Integer value) {
		this.papersIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 
	 */
	public VTestPapersQuestionQueryCondition setPapersIdConditionEnd(Integer value) {
		this.papersIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 
	 */
	public VTestPapersQuestionQueryCondition setPapersIdConditionEndEqual(Integer value) {
		this.papersIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_QUESTION_ID: 
	 */
	public VTestPapersQuestionQueryCondition setPapersQuestionIdCondition(Integer value) {
		this.papersQuestionId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_QUESTION_ID: 
	 */
	public VTestPapersQuestionQueryCondition setPapersQuestionIdConditionBegin(Integer value) {
		this.papersQuestionIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_QUESTION_ID: 
	 */
	public VTestPapersQuestionQueryCondition setPapersQuestionIdConditionEnd(Integer value) {
		this.papersQuestionIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_QUESTION_ID: 
	 */
	public VTestPapersQuestionQueryCondition setPapersQuestionIdConditionEndEqual(Integer value) {
		this.papersQuestionIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_SN: 
	 */
	public VTestPapersQuestionQueryCondition setQuestionSnCondition(Integer value) {
		this.questionSn = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_SN: 
	 */
	public VTestPapersQuestionQueryCondition setQuestionSnConditionBegin(Integer value) {
		this.questionSnBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_SN: 
	 */
	public VTestPapersQuestionQueryCondition setQuestionSnConditionEnd(Integer value) {
		this.questionSnEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_SN: 
	 */
	public VTestPapersQuestionQueryCondition setQuestionSnConditionEndEqual(Integer value) {
		this.questionSnEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_NAME: 
	 */
	public VTestPapersQuestionQueryCondition setCategoryNameCondition(String value) {
		this.categoryName = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_NAME: 
	 */
	public VTestPapersQuestionQueryCondition setCategoryNameConditionEqual(String value) {
		this.categoryNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_DESC: 
	 */
	public VTestPapersQuestionQueryCondition setCategoryDescCondition(String value) {
		this.categoryDesc = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_DESC: 
	 */
	public VTestPapersQuestionQueryCondition setCategoryDescConditionEqual(String value) {
		this.categoryDescEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_CATEGORY_DELETED: 
	 */
	public VTestPapersQuestionQueryCondition setQuestionCategoryDeletedCondition(Boolean value) {
		this.questionCategoryDeleted = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.questionId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_TEST_PAPERS_QUESTION].[QUESTION_ID] = " + this.questionId) 
						+ ") "));
		}
		if ((this.questionIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[QUESTION_ID] >= " 
						+ (this.questionIdBegin + ")")));
		}
		if ((this.questionIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[QUESTION_ID] < " 
						+ (this.questionIdEnd + ") ")));
		}
		if ((this.questionIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[QUESTION_ID] <= " 
						+ (this.questionIdEndEqual + ") ")));
		}
		if ((this.categoryId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_TEST_PAPERS_QUESTION].[CATEGORY_ID] = " + this.categoryId) 
						+ ") "));
		}
		if ((this.categoryIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[CATEGORY_ID] >= " 
						+ (this.categoryIdBegin + ")")));
		}
		if ((this.categoryIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[CATEGORY_ID] < " 
						+ (this.categoryIdEnd + ") ")));
		}
		if ((this.categoryIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[CATEGORY_ID] <= " 
						+ (this.categoryIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.modifyOr)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[V_TEST_PAPERS_QUESTION].[MODIFY_OR]", this.modifyOr)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.modifyOrEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[V_TEST_PAPERS_QUESTION].[MODIFY_OR] = " + SqlServerUtils.safeSql(this.modifyOrEqual))) 
						+ ") "));
		}
		if ((this.questionType == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_TEST_PAPERS_QUESTION].[QUESTION_TYPE] = " + this.questionType) 
						+ ") "));
		}
		if ((this.questionTypeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[QUESTION_TYPE] >= " 
						+ (this.questionTypeBegin + ")")));
		}
		if ((this.questionTypeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[QUESTION_TYPE] < " 
						+ (this.questionTypeEnd + ") ")));
		}
		if ((this.questionTypeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[QUESTION_TYPE] <= " 
						+ (this.questionTypeEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.questionContent)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[V_TEST_PAPERS_QUESTION].[QUESTION_CONTENT]", this.questionContent)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.questionContentEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[V_TEST_PAPERS_QUESTION].[QUESTION_CONTENT] = " + SqlServerUtils.safeSql(this.questionContentEqual))) 
						+ ") "));
		}
		if ((this.createTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_TEST_PAPERS_QUESTION].[CREATE_TIME] = " + SqlServerUtils.getDateSql(this.createTime)) 
						+ ") "));
		}
		if ((this.createTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[CREATE_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.createTimeBegin) + ")")));
		}
		if ((this.createTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[CREATE_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.createTimeEnd) + ") ")));
		}
		if ((this.createTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[CREATE_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.createTimeEndEqual) + ") ")));
		}
		if ((this.deleted == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_TEST_PAPERS_QUESTION].[DELETED] = " + SqlServerUtils.getBoolSql(this.deleted)) 
						+ ") "));
		}
		if ((this.modifyTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_TEST_PAPERS_QUESTION].[MODIFY_TIME] = " + SqlServerUtils.getDateSql(this.modifyTime)) 
						+ ") "));
		}
		if ((this.modifyTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[MODIFY_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.modifyTimeBegin) + ")")));
		}
		if ((this.modifyTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[MODIFY_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.modifyTimeEnd) + ") ")));
		}
		if ((this.modifyTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[MODIFY_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.modifyTimeEndEqual) + ") ")));
		}
		if ((this.papersId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_TEST_PAPERS_QUESTION].[PAPERS_ID] = " + this.papersId) 
						+ ") "));
		}
		if ((this.papersIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[PAPERS_ID] >= " 
						+ (this.papersIdBegin + ")")));
		}
		if ((this.papersIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[PAPERS_ID] < " 
						+ (this.papersIdEnd + ") ")));
		}
		if ((this.papersIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[PAPERS_ID] <= " 
						+ (this.papersIdEndEqual + ") ")));
		}
		if ((this.papersQuestionId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_TEST_PAPERS_QUESTION].[PAPERS_QUESTION_ID] = " + this.papersQuestionId) 
						+ ") "));
		}
		if ((this.papersQuestionIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[PAPERS_QUESTION_ID] >= " 
						+ (this.papersQuestionIdBegin + ")")));
		}
		if ((this.papersQuestionIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[PAPERS_QUESTION_ID] < " 
						+ (this.papersQuestionIdEnd + ") ")));
		}
		if ((this.papersQuestionIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[PAPERS_QUESTION_ID] <= " 
						+ (this.papersQuestionIdEndEqual + ") ")));
		}
		if ((this.questionSn == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_TEST_PAPERS_QUESTION].[QUESTION_SN] = " + this.questionSn) 
						+ ") "));
		}
		if ((this.questionSnBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[QUESTION_SN] >= " 
						+ (this.questionSnBegin + ")")));
		}
		if ((this.questionSnEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[QUESTION_SN] < " 
						+ (this.questionSnEnd + ") ")));
		}
		if ((this.questionSnEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_QUESTION].[QUESTION_SN] <= " 
						+ (this.questionSnEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.categoryName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[V_TEST_PAPERS_QUESTION].[CATEGORY_NAME]", this.categoryName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.categoryNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[V_TEST_PAPERS_QUESTION].[CATEGORY_NAME] = " + SqlServerUtils.safeSql(this.categoryNameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.categoryDesc)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[V_TEST_PAPERS_QUESTION].[CATEGORY_DESC]", this.categoryDesc)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.categoryDescEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[V_TEST_PAPERS_QUESTION].[CATEGORY_DESC] = " + SqlServerUtils.safeSql(this.categoryDescEqual))) 
						+ ") "));
		}
		if ((this.questionCategoryDeleted == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_TEST_PAPERS_QUESTION].[QUESTION_CATEGORY_DELETED] = " + SqlServerUtils.getBoolSql(this.questionCategoryDeleted)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
