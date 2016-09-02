package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * V_QUESTIONLIB_ANSWER查询条件定义
 */
public class VQuestionlibAnswerQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,ANSWER_ID: 
	 */
	Integer answerId;
	
	/**
	 * 查询条件开始值,ANSWER_ID: 
	 */
	Integer answerIdBegin;
	
	/**
	 * 查询条件结束值,ANSWER_ID: 
	 */
	Integer answerIdEnd;
	
	/**
	 * 查询条件结束值,ANSWER_ID: 
	 */
	Integer answerIdEndEqual;
	
	/**
	 * 查询条件,ANSWER_CONTENT: 
	 */
	String answerContent;
	
	/**
	 * 查询条件字符串相等,ANSWER_CONTENT: 
	 */
	String answerContentEqual;
	
	/**
	 * 查询条件,IS_ANSWER: 
	 */
	Boolean isAnswer;
	
	/**
	 * 查询条件,ANSWER_ORDER: 
	 */
	Integer answerOrder;
	
	/**
	 * 查询条件开始值,ANSWER_ORDER: 
	 */
	Integer answerOrderBegin;
	
	/**
	 * 查询条件结束值,ANSWER_ORDER: 
	 */
	Integer answerOrderEnd;
	
	/**
	 * 查询条件结束值,ANSWER_ORDER: 
	 */
	Integer answerOrderEndEqual;
	
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
	 * ANSWER_ID: 
	 */
	public Integer getAnswerId() {
		return this.answerId;
	}
	
	/**
	 * ANSWER_ID: 
	 */
	public void setAnswerId(Integer value)
	 {
		this.answerId = value;
	}
	
	/**
	 * 查询条件开始值,ANSWER_ID: 
	 */
	public Integer getAnswerIdBegin() {
		return this.answerIdBegin;
	}
	
	/**
	 * 查询条件开始值,ANSWER_ID: 
	 */
	public void setAnswerIdBegin(Integer value)
	 {
		this.answerIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,ANSWER_ID: 
	 */
	public Integer getAnswerIdEnd() {
		return this.answerIdEnd;
	}
	
	/**
	 * 查询条件结束值,ANSWER_ID: 
	 */
	public void setAnswerIdEnd(Integer value)
	 {
		this.answerIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,ANSWER_ID: 
	 */
	public Integer getAnswerIdEndEqual() {
		return this.answerIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,ANSWER_ID: 
	 */
	public void setAnswerIdEndEqual(Integer value)
	 {
		this.answerIdEndEqual = value;
	}
	
	/**
	 * ANSWER_CONTENT: 
	 */
	public String getAnswerContent() {
		return this.answerContent;
	}
	
	/**
	 * ANSWER_CONTENT: 
	 */
	public void setAnswerContent(String value)
	 {
		this.answerContent = value;
	}
	
	/**
	 * 查询条件字符串相等,ANSWER_CONTENT: 
	 */
	public String getAnswerContentEqual() {
		return this.answerContentEqual;
	}
	
	/**
	 * 查询条件字符串相等,ANSWER_CONTENT: 
	 */
	public void setAnswerContentEqual(String value)
	 {
		this.answerContentEqual = value;
	}
	
	/**
	 * IS_ANSWER: 
	 */
	public Boolean getIsAnswer() {
		return this.isAnswer;
	}
	
	/**
	 * IS_ANSWER: 
	 */
	public void setIsAnswer(Boolean value)
	 {
		this.isAnswer = value;
	}
	
	/**
	 * ANSWER_ORDER: 
	 */
	public Integer getAnswerOrder() {
		return this.answerOrder;
	}
	
	/**
	 * ANSWER_ORDER: 
	 */
	public void setAnswerOrder(Integer value)
	 {
		this.answerOrder = value;
	}
	
	/**
	 * 查询条件开始值,ANSWER_ORDER: 
	 */
	public Integer getAnswerOrderBegin() {
		return this.answerOrderBegin;
	}
	
	/**
	 * 查询条件开始值,ANSWER_ORDER: 
	 */
	public void setAnswerOrderBegin(Integer value)
	 {
		this.answerOrderBegin = value;
	}
	
	/**
	 * 查询条件结束值,ANSWER_ORDER: 
	 */
	public Integer getAnswerOrderEnd() {
		return this.answerOrderEnd;
	}
	
	/**
	 * 查询条件结束值,ANSWER_ORDER: 
	 */
	public void setAnswerOrderEnd(Integer value)
	 {
		this.answerOrderEnd = value;
	}
	
	/**
	 * 查询条件结束值,ANSWER_ORDER: 
	 */
	public Integer getAnswerOrderEndEqual() {
		return this.answerOrderEndEqual;
	}
	
	/**
	 * 查询条件结束值,ANSWER_ORDER: 
	 */
	public void setAnswerOrderEndEqual(Integer value)
	 {
		this.answerOrderEndEqual = value;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 
	 */
	public VQuestionlibAnswerQueryCondition setQuestionIdCondition(Integer value) {
		this.questionId = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 
	 */
	public VQuestionlibAnswerQueryCondition setQuestionIdConditionBegin(Integer value) {
		this.questionIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 
	 */
	public VQuestionlibAnswerQueryCondition setQuestionIdConditionEnd(Integer value) {
		this.questionIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 
	 */
	public VQuestionlibAnswerQueryCondition setQuestionIdConditionEndEqual(Integer value) {
		this.questionIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 
	 */
	public VQuestionlibAnswerQueryCondition setCategoryIdCondition(Integer value) {
		this.categoryId = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 
	 */
	public VQuestionlibAnswerQueryCondition setCategoryIdConditionBegin(Integer value) {
		this.categoryIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 
	 */
	public VQuestionlibAnswerQueryCondition setCategoryIdConditionEnd(Integer value) {
		this.categoryIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 
	 */
	public VQuestionlibAnswerQueryCondition setCategoryIdConditionEndEqual(Integer value) {
		this.categoryIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_OR: 
	 */
	public VQuestionlibAnswerQueryCondition setModifyOrCondition(String value) {
		this.modifyOr = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_OR: 
	 */
	public VQuestionlibAnswerQueryCondition setModifyOrConditionEqual(String value) {
		this.modifyOrEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE: 
	 */
	public VQuestionlibAnswerQueryCondition setQuestionTypeCondition(Byte value) {
		this.questionType = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE: 
	 */
	public VQuestionlibAnswerQueryCondition setQuestionTypeConditionBegin(Byte value) {
		this.questionTypeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE: 
	 */
	public VQuestionlibAnswerQueryCondition setQuestionTypeConditionEnd(Byte value) {
		this.questionTypeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE: 
	 */
	public VQuestionlibAnswerQueryCondition setQuestionTypeConditionEndEqual(Byte value) {
		this.questionTypeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_CONTENT: 
	 */
	public VQuestionlibAnswerQueryCondition setQuestionContentCondition(String value) {
		this.questionContent = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_CONTENT: 
	 */
	public VQuestionlibAnswerQueryCondition setQuestionContentConditionEqual(String value) {
		this.questionContentEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 
	 */
	public VQuestionlibAnswerQueryCondition setCreateTimeCondition(java.util.Date value) {
		this.createTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 
	 */
	public VQuestionlibAnswerQueryCondition setCreateTimeConditionBegin(java.util.Date value) {
		this.createTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 
	 */
	public VQuestionlibAnswerQueryCondition setCreateTimeConditionEnd(java.util.Date value) {
		this.createTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 
	 */
	public VQuestionlibAnswerQueryCondition setCreateTimeConditionEndEqual(java.util.Date value) {
		this.createTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DELETED: 
	 */
	public VQuestionlibAnswerQueryCondition setDeletedCondition(Boolean value) {
		this.deleted = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 
	 */
	public VQuestionlibAnswerQueryCondition setModifyTimeCondition(java.util.Date value) {
		this.modifyTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 
	 */
	public VQuestionlibAnswerQueryCondition setModifyTimeConditionBegin(java.util.Date value) {
		this.modifyTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 
	 */
	public VQuestionlibAnswerQueryCondition setModifyTimeConditionEnd(java.util.Date value) {
		this.modifyTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 
	 */
	public VQuestionlibAnswerQueryCondition setModifyTimeConditionEndEqual(java.util.Date value) {
		this.modifyTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_ID: 
	 */
	public VQuestionlibAnswerQueryCondition setAnswerIdCondition(Integer value) {
		this.answerId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_ID: 
	 */
	public VQuestionlibAnswerQueryCondition setAnswerIdConditionBegin(Integer value) {
		this.answerIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_ID: 
	 */
	public VQuestionlibAnswerQueryCondition setAnswerIdConditionEnd(Integer value) {
		this.answerIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_ID: 
	 */
	public VQuestionlibAnswerQueryCondition setAnswerIdConditionEndEqual(Integer value) {
		this.answerIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_CONTENT: 
	 */
	public VQuestionlibAnswerQueryCondition setAnswerContentCondition(String value) {
		this.answerContent = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_CONTENT: 
	 */
	public VQuestionlibAnswerQueryCondition setAnswerContentConditionEqual(String value) {
		this.answerContentEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件IS_ANSWER: 
	 */
	public VQuestionlibAnswerQueryCondition setIsAnswerCondition(Boolean value) {
		this.isAnswer = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_ORDER: 
	 */
	public VQuestionlibAnswerQueryCondition setAnswerOrderCondition(Integer value) {
		this.answerOrder = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_ORDER: 
	 */
	public VQuestionlibAnswerQueryCondition setAnswerOrderConditionBegin(Integer value) {
		this.answerOrderBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_ORDER: 
	 */
	public VQuestionlibAnswerQueryCondition setAnswerOrderConditionEnd(Integer value) {
		this.answerOrderEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_ORDER: 
	 */
	public VQuestionlibAnswerQueryCondition setAnswerOrderConditionEndEqual(Integer value) {
		this.answerOrderEndEqual = value;
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
						+ ((" and ([V_QUESTIONLIB_ANSWER].[QUESTION_ID] = " + this.questionId) 
						+ ") "));
		}
		if ((this.questionIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[QUESTION_ID] >= " 
						+ (this.questionIdBegin + ")")));
		}
		if ((this.questionIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[QUESTION_ID] < " 
						+ (this.questionIdEnd + ") ")));
		}
		if ((this.questionIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[QUESTION_ID] <= " 
						+ (this.questionIdEndEqual + ") ")));
		}
		if ((this.categoryId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_QUESTIONLIB_ANSWER].[CATEGORY_ID] = " + this.categoryId) 
						+ ") "));
		}
		if ((this.categoryIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[CATEGORY_ID] >= " 
						+ (this.categoryIdBegin + ")")));
		}
		if ((this.categoryIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[CATEGORY_ID] < " 
						+ (this.categoryIdEnd + ") ")));
		}
		if ((this.categoryIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[CATEGORY_ID] <= " 
						+ (this.categoryIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.modifyOr)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[V_QUESTIONLIB_ANSWER].[MODIFY_OR]", this.modifyOr)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.modifyOrEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[V_QUESTIONLIB_ANSWER].[MODIFY_OR] = " + SqlServerUtils.safeSql(this.modifyOrEqual))) 
						+ ") "));
		}
		if ((this.questionType == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_QUESTIONLIB_ANSWER].[QUESTION_TYPE] = " + this.questionType) 
						+ ") "));
		}
		if ((this.questionTypeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[QUESTION_TYPE] >= " 
						+ (this.questionTypeBegin + ")")));
		}
		if ((this.questionTypeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[QUESTION_TYPE] < " 
						+ (this.questionTypeEnd + ") ")));
		}
		if ((this.questionTypeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[QUESTION_TYPE] <= " 
						+ (this.questionTypeEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.questionContent)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[V_QUESTIONLIB_ANSWER].[QUESTION_CONTENT]", this.questionContent)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.questionContentEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[V_QUESTIONLIB_ANSWER].[QUESTION_CONTENT] = " + SqlServerUtils.safeSql(this.questionContentEqual))) 
						+ ") "));
		}
		if ((this.createTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_QUESTIONLIB_ANSWER].[CREATE_TIME] = " + SqlServerUtils.getDateSql(this.createTime)) 
						+ ") "));
		}
		if ((this.createTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[CREATE_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.createTimeBegin) + ")")));
		}
		if ((this.createTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[CREATE_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.createTimeEnd) + ") ")));
		}
		if ((this.createTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[CREATE_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.createTimeEndEqual) + ") ")));
		}
		if ((this.deleted == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_QUESTIONLIB_ANSWER].[DELETED] = " + SqlServerUtils.getBoolSql(this.deleted)) 
						+ ") "));
		}
		if ((this.modifyTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_QUESTIONLIB_ANSWER].[MODIFY_TIME] = " + SqlServerUtils.getDateSql(this.modifyTime)) 
						+ ") "));
		}
		if ((this.modifyTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[MODIFY_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.modifyTimeBegin) + ")")));
		}
		if ((this.modifyTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[MODIFY_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.modifyTimeEnd) + ") ")));
		}
		if ((this.modifyTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[MODIFY_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.modifyTimeEndEqual) + ") ")));
		}
		if ((this.answerId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_QUESTIONLIB_ANSWER].[ANSWER_ID] = " + this.answerId) 
						+ ") "));
		}
		if ((this.answerIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[ANSWER_ID] >= " 
						+ (this.answerIdBegin + ")")));
		}
		if ((this.answerIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[ANSWER_ID] < " 
						+ (this.answerIdEnd + ") ")));
		}
		if ((this.answerIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[ANSWER_ID] <= " 
						+ (this.answerIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.answerContent)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[V_QUESTIONLIB_ANSWER].[ANSWER_CONTENT]", this.answerContent)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.answerContentEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[V_QUESTIONLIB_ANSWER].[ANSWER_CONTENT] = " + SqlServerUtils.safeSql(this.answerContentEqual))) 
						+ ") "));
		}
		if ((this.isAnswer == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_QUESTIONLIB_ANSWER].[IS_ANSWER] = " + SqlServerUtils.getBoolSql(this.isAnswer)) 
						+ ") "));
		}
		if ((this.answerOrder == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_QUESTIONLIB_ANSWER].[ANSWER_ORDER] = " + this.answerOrder) 
						+ ") "));
		}
		if ((this.answerOrderBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[ANSWER_ORDER] >= " 
						+ (this.answerOrderBegin + ")")));
		}
		if ((this.answerOrderEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[ANSWER_ORDER] < " 
						+ (this.answerOrderEnd + ") ")));
		}
		if ((this.answerOrderEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTIONLIB_ANSWER].[ANSWER_ORDER] <= " 
						+ (this.answerOrderEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
