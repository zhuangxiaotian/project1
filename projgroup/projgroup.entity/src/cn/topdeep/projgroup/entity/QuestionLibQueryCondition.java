package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_QUESTION_LIB查询条件定义
 */
public class QuestionLibQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,QUESTION_ID: 题目标识
	 */
	Integer questionId;
	
	/**
	 * 查询条件开始值,QUESTION_ID: 题目标识
	 */
	Integer questionIdBegin;
	
	/**
	 * 查询条件结束值,QUESTION_ID: 题目标识
	 */
	Integer questionIdEnd;
	
	/**
	 * 查询条件结束值,QUESTION_ID: 题目标识
	 */
	Integer questionIdEndEqual;
	
	/**
	 * 查询条件,CATEGORY_ID: 分类标识
	 */
	Integer categoryId;
	
	/**
	 * 查询条件开始值,CATEGORY_ID: 分类标识
	 */
	Integer categoryIdBegin;
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 分类标识
	 */
	Integer categoryIdEnd;
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 分类标识
	 */
	Integer categoryIdEndEqual;
	
	/**
	 * 查询条件,MODIFY_OR: 最后修改人
	 */
	String modifyOr;
	
	/**
	 * 查询条件字符串相等,MODIFY_OR: 最后修改人
	 */
	String modifyOrEqual;
	
	/**
	 * 查询条件,QUESTION_TYPE: 题目类型 0 是非题  1 多选题 2 单选题
	 */
	Byte questionType;
	
	/**
	 * 查询条件开始值,QUESTION_TYPE: 题目类型 0 是非题  1 多选题 2 单选题
	 */
	Byte questionTypeBegin;
	
	/**
	 * 查询条件结束值,QUESTION_TYPE: 题目类型 0 是非题  1 多选题 2 单选题
	 */
	Byte questionTypeEnd;
	
	/**
	 * 查询条件结束值,QUESTION_TYPE: 题目类型 0 是非题  1 多选题 2 单选题
	 */
	Byte questionTypeEndEqual;
	
	/**
	 * 查询条件,QUESTION_CONTENT: 题目内容
	 */
	String questionContent;
	
	/**
	 * 查询条件字符串相等,QUESTION_CONTENT: 题目内容
	 */
	String questionContentEqual;
	
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
	 * 查询条件,DELETED: 是否删除
	 */
	Boolean deleted;
	
	/**
	 * 查询条件,MODIFY_TIME: 修改时间
	 */
	java.util.Date modifyTime;
	
	/**
	 * 查询条件开始值,MODIFY_TIME: 修改时间
	 */
	java.util.Date modifyTimeBegin;
	
	/**
	 * 查询条件结束值,MODIFY_TIME: 修改时间
	 */
	java.util.Date modifyTimeEnd;
	
	/**
	 * 查询条件结束值,MODIFY_TIME: 修改时间
	 */
	java.util.Date modifyTimeEndEqual;
	
	/**
	 * QUESTION_ID: 题目标识
	 */
	public Integer getQuestionId() {
		return this.questionId;
	}
	
	/**
	 * QUESTION_ID: 题目标识
	 */
	public void setQuestionId(Integer value)
	 {
		this.questionId = value;
	}
	
	/**
	 * 查询条件开始值,QUESTION_ID: 题目标识
	 */
	public Integer getQuestionIdBegin() {
		return this.questionIdBegin;
	}
	
	/**
	 * 查询条件开始值,QUESTION_ID: 题目标识
	 */
	public void setQuestionIdBegin(Integer value)
	 {
		this.questionIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,QUESTION_ID: 题目标识
	 */
	public Integer getQuestionIdEnd() {
		return this.questionIdEnd;
	}
	
	/**
	 * 查询条件结束值,QUESTION_ID: 题目标识
	 */
	public void setQuestionIdEnd(Integer value)
	 {
		this.questionIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,QUESTION_ID: 题目标识
	 */
	public Integer getQuestionIdEndEqual() {
		return this.questionIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,QUESTION_ID: 题目标识
	 */
	public void setQuestionIdEndEqual(Integer value)
	 {
		this.questionIdEndEqual = value;
	}
	
	/**
	 * CATEGORY_ID: 分类标识
	 */
	public Integer getCategoryId() {
		return this.categoryId;
	}
	
	/**
	 * CATEGORY_ID: 分类标识
	 */
	public void setCategoryId(Integer value)
	 {
		this.categoryId = value;
	}
	
	/**
	 * 查询条件开始值,CATEGORY_ID: 分类标识
	 */
	public Integer getCategoryIdBegin() {
		return this.categoryIdBegin;
	}
	
	/**
	 * 查询条件开始值,CATEGORY_ID: 分类标识
	 */
	public void setCategoryIdBegin(Integer value)
	 {
		this.categoryIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 分类标识
	 */
	public Integer getCategoryIdEnd() {
		return this.categoryIdEnd;
	}
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 分类标识
	 */
	public void setCategoryIdEnd(Integer value)
	 {
		this.categoryIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 分类标识
	 */
	public Integer getCategoryIdEndEqual() {
		return this.categoryIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 分类标识
	 */
	public void setCategoryIdEndEqual(Integer value)
	 {
		this.categoryIdEndEqual = value;
	}
	
	/**
	 * MODIFY_OR: 最后修改人
	 */
	public String getModifyOr() {
		return this.modifyOr;
	}
	
	/**
	 * MODIFY_OR: 最后修改人
	 */
	public void setModifyOr(String value)
	 {
		this.modifyOr = value;
	}
	
	/**
	 * 查询条件字符串相等,MODIFY_OR: 最后修改人
	 */
	public String getModifyOrEqual() {
		return this.modifyOrEqual;
	}
	
	/**
	 * 查询条件字符串相等,MODIFY_OR: 最后修改人
	 */
	public void setModifyOrEqual(String value)
	 {
		this.modifyOrEqual = value;
	}
	
	/**
	 * QUESTION_TYPE: 题目类型 0 是非题  1 多选题 2 单选题
	 */
	public Byte getQuestionType() {
		return this.questionType;
	}
	
	/**
	 * QUESTION_TYPE: 题目类型 0 是非题  1 多选题 2 单选题
	 */
	public void setQuestionType(Byte value)
	 {
		this.questionType = value;
	}
	
	/**
	 * 查询条件开始值,QUESTION_TYPE: 题目类型 0 是非题  1 多选题 2 单选题
	 */
	public Byte getQuestionTypeBegin() {
		return this.questionTypeBegin;
	}
	
	/**
	 * 查询条件开始值,QUESTION_TYPE: 题目类型 0 是非题  1 多选题 2 单选题
	 */
	public void setQuestionTypeBegin(Byte value)
	 {
		this.questionTypeBegin = value;
	}
	
	/**
	 * 查询条件结束值,QUESTION_TYPE: 题目类型 0 是非题  1 多选题 2 单选题
	 */
	public Byte getQuestionTypeEnd() {
		return this.questionTypeEnd;
	}
	
	/**
	 * 查询条件结束值,QUESTION_TYPE: 题目类型 0 是非题  1 多选题 2 单选题
	 */
	public void setQuestionTypeEnd(Byte value)
	 {
		this.questionTypeEnd = value;
	}
	
	/**
	 * 查询条件结束值,QUESTION_TYPE: 题目类型 0 是非题  1 多选题 2 单选题
	 */
	public Byte getQuestionTypeEndEqual() {
		return this.questionTypeEndEqual;
	}
	
	/**
	 * 查询条件结束值,QUESTION_TYPE: 题目类型 0 是非题  1 多选题 2 单选题
	 */
	public void setQuestionTypeEndEqual(Byte value)
	 {
		this.questionTypeEndEqual = value;
	}
	
	/**
	 * QUESTION_CONTENT: 题目内容
	 */
	public String getQuestionContent() {
		return this.questionContent;
	}
	
	/**
	 * QUESTION_CONTENT: 题目内容
	 */
	public void setQuestionContent(String value)
	 {
		this.questionContent = value;
	}
	
	/**
	 * 查询条件字符串相等,QUESTION_CONTENT: 题目内容
	 */
	public String getQuestionContentEqual() {
		return this.questionContentEqual;
	}
	
	/**
	 * 查询条件字符串相等,QUESTION_CONTENT: 题目内容
	 */
	public void setQuestionContentEqual(String value)
	 {
		this.questionContentEqual = value;
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
	 * DELETED: 是否删除
	 */
	public Boolean getDeleted() {
		return this.deleted;
	}
	
	/**
	 * DELETED: 是否删除
	 */
	public void setDeleted(Boolean value)
	 {
		this.deleted = value;
	}
	
	/**
	 * MODIFY_TIME: 修改时间
	 */
	public java.util.Date getModifyTime() {
		return this.modifyTime;
	}
	
	/**
	 * MODIFY_TIME: 修改时间
	 */
	public void setModifyTime(java.util.Date value)
	 {
		this.modifyTime = value;
	}
	
	/**
	 * 查询条件开始值,MODIFY_TIME: 修改时间
	 */
	public java.util.Date getModifyTimeBegin() {
		return this.modifyTimeBegin;
	}
	
	/**
	 * 查询条件开始值,MODIFY_TIME: 修改时间
	 */
	public void setModifyTimeBegin(java.util.Date value)
	 {
		this.modifyTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,MODIFY_TIME: 修改时间
	 */
	public java.util.Date getModifyTimeEnd() {
		return this.modifyTimeEnd;
	}
	
	/**
	 * 查询条件结束值,MODIFY_TIME: 修改时间
	 */
	public void setModifyTimeEnd(java.util.Date value)
	 {
		this.modifyTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,MODIFY_TIME: 修改时间
	 */
	public java.util.Date getModifyTimeEndEqual() {
		return this.modifyTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,MODIFY_TIME: 修改时间
	 */
	public void setModifyTimeEndEqual(java.util.Date value)
	 {
		this.modifyTimeEndEqual = value;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 题目标识
	 */
	public QuestionLibQueryCondition setQuestionIdCondition(Integer value) {
		this.questionId = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 题目标识
	 */
	public QuestionLibQueryCondition setQuestionIdConditionBegin(Integer value) {
		this.questionIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 题目标识
	 */
	public QuestionLibQueryCondition setQuestionIdConditionEnd(Integer value) {
		this.questionIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 题目标识
	 */
	public QuestionLibQueryCondition setQuestionIdConditionEndEqual(Integer value) {
		this.questionIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 分类标识
	 */
	public QuestionLibQueryCondition setCategoryIdCondition(Integer value) {
		this.categoryId = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 分类标识
	 */
	public QuestionLibQueryCondition setCategoryIdConditionBegin(Integer value) {
		this.categoryIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 分类标识
	 */
	public QuestionLibQueryCondition setCategoryIdConditionEnd(Integer value) {
		this.categoryIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 分类标识
	 */
	public QuestionLibQueryCondition setCategoryIdConditionEndEqual(Integer value) {
		this.categoryIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_OR: 最后修改人
	 */
	public QuestionLibQueryCondition setModifyOrCondition(String value) {
		this.modifyOr = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_OR: 最后修改人
	 */
	public QuestionLibQueryCondition setModifyOrConditionEqual(String value) {
		this.modifyOrEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE: 题目类型 0 是非题  1 多选题 2 单选题
	 */
	public QuestionLibQueryCondition setQuestionTypeCondition(Byte value) {
		this.questionType = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE: 题目类型 0 是非题  1 多选题 2 单选题
	 */
	public QuestionLibQueryCondition setQuestionTypeConditionBegin(Byte value) {
		this.questionTypeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE: 题目类型 0 是非题  1 多选题 2 单选题
	 */
	public QuestionLibQueryCondition setQuestionTypeConditionEnd(Byte value) {
		this.questionTypeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE: 题目类型 0 是非题  1 多选题 2 单选题
	 */
	public QuestionLibQueryCondition setQuestionTypeConditionEndEqual(Byte value) {
		this.questionTypeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_CONTENT: 题目内容
	 */
	public QuestionLibQueryCondition setQuestionContentCondition(String value) {
		this.questionContent = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_CONTENT: 题目内容
	 */
	public QuestionLibQueryCondition setQuestionContentConditionEqual(String value) {
		this.questionContentEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 添加时间
	 */
	public QuestionLibQueryCondition setCreateTimeCondition(java.util.Date value) {
		this.createTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 添加时间
	 */
	public QuestionLibQueryCondition setCreateTimeConditionBegin(java.util.Date value) {
		this.createTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 添加时间
	 */
	public QuestionLibQueryCondition setCreateTimeConditionEnd(java.util.Date value) {
		this.createTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 添加时间
	 */
	public QuestionLibQueryCondition setCreateTimeConditionEndEqual(java.util.Date value) {
		this.createTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DELETED: 是否删除
	 */
	public QuestionLibQueryCondition setDeletedCondition(Boolean value) {
		this.deleted = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 修改时间
	 */
	public QuestionLibQueryCondition setModifyTimeCondition(java.util.Date value) {
		this.modifyTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 修改时间
	 */
	public QuestionLibQueryCondition setModifyTimeConditionBegin(java.util.Date value) {
		this.modifyTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 修改时间
	 */
	public QuestionLibQueryCondition setModifyTimeConditionEnd(java.util.Date value) {
		this.modifyTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 修改时间
	 */
	public QuestionLibQueryCondition setModifyTimeConditionEndEqual(java.util.Date value) {
		this.modifyTimeEndEqual = value;
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
						+ ((" and ([T_QUESTION_LIB].[QUESTION_ID] = " + this.questionId) 
						+ ") "));
		}
		if ((this.questionIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_LIB].[QUESTION_ID] >= " 
						+ (this.questionIdBegin + ")")));
		}
		if ((this.questionIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_LIB].[QUESTION_ID] < " 
						+ (this.questionIdEnd + ") ")));
		}
		if ((this.questionIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_LIB].[QUESTION_ID] <= " 
						+ (this.questionIdEndEqual + ") ")));
		}
		if ((this.categoryId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_QUESTION_LIB].[CATEGORY_ID] = " + this.categoryId) 
						+ ") "));
		}
		if ((this.categoryIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_LIB].[CATEGORY_ID] >= " 
						+ (this.categoryIdBegin + ")")));
		}
		if ((this.categoryIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_LIB].[CATEGORY_ID] < " 
						+ (this.categoryIdEnd + ") ")));
		}
		if ((this.categoryIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_LIB].[CATEGORY_ID] <= " 
						+ (this.categoryIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.modifyOr)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_QUESTION_LIB].[MODIFY_OR]", this.modifyOr)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.modifyOrEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_QUESTION_LIB].[MODIFY_OR] = " + SqlServerUtils.safeSql(this.modifyOrEqual))) 
						+ ") "));
		}
		if ((this.questionType == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_QUESTION_LIB].[QUESTION_TYPE] = " + this.questionType) 
						+ ") "));
		}
		if ((this.questionTypeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_LIB].[QUESTION_TYPE] >= " 
						+ (this.questionTypeBegin + ")")));
		}
		if ((this.questionTypeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_LIB].[QUESTION_TYPE] < " 
						+ (this.questionTypeEnd + ") ")));
		}
		if ((this.questionTypeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_LIB].[QUESTION_TYPE] <= " 
						+ (this.questionTypeEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.questionContent)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_QUESTION_LIB].[QUESTION_CONTENT]", this.questionContent)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.questionContentEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_QUESTION_LIB].[QUESTION_CONTENT] = " + SqlServerUtils.safeSql(this.questionContentEqual))) 
						+ ") "));
		}
		if ((this.createTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_QUESTION_LIB].[CREATE_TIME] = " + SqlServerUtils.getDateSql(this.createTime)) 
						+ ") "));
		}
		if ((this.createTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_LIB].[CREATE_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.createTimeBegin) + ")")));
		}
		if ((this.createTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_LIB].[CREATE_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.createTimeEnd) + ") ")));
		}
		if ((this.createTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_LIB].[CREATE_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.createTimeEndEqual) + ") ")));
		}
		if ((this.deleted == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_QUESTION_LIB].[DELETED] = " + SqlServerUtils.getBoolSql(this.deleted)) 
						+ ") "));
		}
		if ((this.modifyTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_QUESTION_LIB].[MODIFY_TIME] = " + SqlServerUtils.getDateSql(this.modifyTime)) 
						+ ") "));
		}
		if ((this.modifyTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_LIB].[MODIFY_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.modifyTimeBegin) + ")")));
		}
		if ((this.modifyTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_LIB].[MODIFY_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.modifyTimeEnd) + ") ")));
		}
		if ((this.modifyTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_LIB].[MODIFY_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.modifyTimeEndEqual) + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
