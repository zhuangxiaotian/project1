package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * V_QUESTION_LIB查询条件定义
 */
public class VQuestionLibQueryCondition extends Object implements ConditionQuery {
	
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
	public VQuestionLibQueryCondition setQuestionIdCondition(Integer value) {
		this.questionId = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 
	 */
	public VQuestionLibQueryCondition setQuestionIdConditionBegin(Integer value) {
		this.questionIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 
	 */
	public VQuestionLibQueryCondition setQuestionIdConditionEnd(Integer value) {
		this.questionIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 
	 */
	public VQuestionLibQueryCondition setQuestionIdConditionEndEqual(Integer value) {
		this.questionIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_OR: 
	 */
	public VQuestionLibQueryCondition setModifyOrCondition(String value) {
		this.modifyOr = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_OR: 
	 */
	public VQuestionLibQueryCondition setModifyOrConditionEqual(String value) {
		this.modifyOrEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE: 
	 */
	public VQuestionLibQueryCondition setQuestionTypeCondition(Byte value) {
		this.questionType = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE: 
	 */
	public VQuestionLibQueryCondition setQuestionTypeConditionBegin(Byte value) {
		this.questionTypeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE: 
	 */
	public VQuestionLibQueryCondition setQuestionTypeConditionEnd(Byte value) {
		this.questionTypeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE: 
	 */
	public VQuestionLibQueryCondition setQuestionTypeConditionEndEqual(Byte value) {
		this.questionTypeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_CONTENT: 
	 */
	public VQuestionLibQueryCondition setQuestionContentCondition(String value) {
		this.questionContent = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_CONTENT: 
	 */
	public VQuestionLibQueryCondition setQuestionContentConditionEqual(String value) {
		this.questionContentEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 
	 */
	public VQuestionLibQueryCondition setCreateTimeCondition(java.util.Date value) {
		this.createTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 
	 */
	public VQuestionLibQueryCondition setCreateTimeConditionBegin(java.util.Date value) {
		this.createTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 
	 */
	public VQuestionLibQueryCondition setCreateTimeConditionEnd(java.util.Date value) {
		this.createTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATE_TIME: 
	 */
	public VQuestionLibQueryCondition setCreateTimeConditionEndEqual(java.util.Date value) {
		this.createTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DELETED: 
	 */
	public VQuestionLibQueryCondition setDeletedCondition(Boolean value) {
		this.deleted = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 
	 */
	public VQuestionLibQueryCondition setModifyTimeCondition(java.util.Date value) {
		this.modifyTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 
	 */
	public VQuestionLibQueryCondition setModifyTimeConditionBegin(java.util.Date value) {
		this.modifyTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 
	 */
	public VQuestionLibQueryCondition setModifyTimeConditionEnd(java.util.Date value) {
		this.modifyTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件MODIFY_TIME: 
	 */
	public VQuestionLibQueryCondition setModifyTimeConditionEndEqual(java.util.Date value) {
		this.modifyTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 
	 */
	public VQuestionLibQueryCondition setCategoryIdCondition(Integer value) {
		this.categoryId = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 
	 */
	public VQuestionLibQueryCondition setCategoryIdConditionBegin(Integer value) {
		this.categoryIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 
	 */
	public VQuestionLibQueryCondition setCategoryIdConditionEnd(Integer value) {
		this.categoryIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 
	 */
	public VQuestionLibQueryCondition setCategoryIdConditionEndEqual(Integer value) {
		this.categoryIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_NAME: 
	 */
	public VQuestionLibQueryCondition setCategoryNameCondition(String value) {
		this.categoryName = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_NAME: 
	 */
	public VQuestionLibQueryCondition setCategoryNameConditionEqual(String value) {
		this.categoryNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_DESC: 
	 */
	public VQuestionLibQueryCondition setCategoryDescCondition(String value) {
		this.categoryDesc = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_DESC: 
	 */
	public VQuestionLibQueryCondition setCategoryDescConditionEqual(String value) {
		this.categoryDescEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_CATEGORY_DELETED: 
	 */
	public VQuestionLibQueryCondition setQuestionCategoryDeletedCondition(Boolean value) {
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
						+ ((" and ([V_QUESTION_LIB].[QUESTION_ID] = " + this.questionId) 
						+ ") "));
		}
		if ((this.questionIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTION_LIB].[QUESTION_ID] >= " 
						+ (this.questionIdBegin + ")")));
		}
		if ((this.questionIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTION_LIB].[QUESTION_ID] < " 
						+ (this.questionIdEnd + ") ")));
		}
		if ((this.questionIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTION_LIB].[QUESTION_ID] <= " 
						+ (this.questionIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.modifyOr)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[V_QUESTION_LIB].[MODIFY_OR]", this.modifyOr)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.modifyOrEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[V_QUESTION_LIB].[MODIFY_OR] = " + SqlServerUtils.safeSql(this.modifyOrEqual))) 
						+ ") "));
		}
		if ((this.questionType == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_QUESTION_LIB].[QUESTION_TYPE] = " + this.questionType) 
						+ ") "));
		}
		if ((this.questionTypeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTION_LIB].[QUESTION_TYPE] >= " 
						+ (this.questionTypeBegin + ")")));
		}
		if ((this.questionTypeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTION_LIB].[QUESTION_TYPE] < " 
						+ (this.questionTypeEnd + ") ")));
		}
		if ((this.questionTypeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTION_LIB].[QUESTION_TYPE] <= " 
						+ (this.questionTypeEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.questionContent)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[V_QUESTION_LIB].[QUESTION_CONTENT]", this.questionContent)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.questionContentEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[V_QUESTION_LIB].[QUESTION_CONTENT] = " + SqlServerUtils.safeSql(this.questionContentEqual))) 
						+ ") "));
		}
		if ((this.createTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_QUESTION_LIB].[CREATE_TIME] = " + SqlServerUtils.getDateSql(this.createTime)) 
						+ ") "));
		}
		if ((this.createTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTION_LIB].[CREATE_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.createTimeBegin) + ")")));
		}
		if ((this.createTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTION_LIB].[CREATE_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.createTimeEnd) + ") ")));
		}
		if ((this.createTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTION_LIB].[CREATE_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.createTimeEndEqual) + ") ")));
		}
		if ((this.deleted == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_QUESTION_LIB].[DELETED] = " + SqlServerUtils.getBoolSql(this.deleted)) 
						+ ") "));
		}
		if ((this.modifyTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_QUESTION_LIB].[MODIFY_TIME] = " + SqlServerUtils.getDateSql(this.modifyTime)) 
						+ ") "));
		}
		if ((this.modifyTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTION_LIB].[MODIFY_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.modifyTimeBegin) + ")")));
		}
		if ((this.modifyTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTION_LIB].[MODIFY_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.modifyTimeEnd) + ") ")));
		}
		if ((this.modifyTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTION_LIB].[MODIFY_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.modifyTimeEndEqual) + ") ")));
		}
		if ((this.categoryId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_QUESTION_LIB].[CATEGORY_ID] = " + this.categoryId) 
						+ ") "));
		}
		if ((this.categoryIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTION_LIB].[CATEGORY_ID] >= " 
						+ (this.categoryIdBegin + ")")));
		}
		if ((this.categoryIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTION_LIB].[CATEGORY_ID] < " 
						+ (this.categoryIdEnd + ") ")));
		}
		if ((this.categoryIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_QUESTION_LIB].[CATEGORY_ID] <= " 
						+ (this.categoryIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.categoryName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[V_QUESTION_LIB].[CATEGORY_NAME]", this.categoryName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.categoryNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[V_QUESTION_LIB].[CATEGORY_NAME] = " + SqlServerUtils.safeSql(this.categoryNameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.categoryDesc)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[V_QUESTION_LIB].[CATEGORY_DESC]", this.categoryDesc)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.categoryDescEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[V_QUESTION_LIB].[CATEGORY_DESC] = " + SqlServerUtils.safeSql(this.categoryDescEqual))) 
						+ ") "));
		}
		if ((this.questionCategoryDeleted == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_QUESTION_LIB].[QUESTION_CATEGORY_DELETED] = " + SqlServerUtils.getBoolSql(this.questionCategoryDeleted)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
