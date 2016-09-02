package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ISSUE_STATUS查询条件定义
 */
public class IssueStatusQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,STATUS_ID: 状态标识
	 */
	Integer statusId;
	
	/**
	 * 查询条件开始值,STATUS_ID: 状态标识
	 */
	Integer statusIdBegin;
	
	/**
	 * 查询条件结束值,STATUS_ID: 状态标识
	 */
	Integer statusIdEnd;
	
	/**
	 * 查询条件结束值,STATUS_ID: 状态标识
	 */
	Integer statusIdEndEqual;
	
	/**
	 * 查询条件,STATUS_NAME: 状态名称
	 */
	String statusName;
	
	/**
	 * 查询条件字符串相等,STATUS_NAME: 状态名称
	 */
	String statusNameEqual;
	
	/**
	 * 查询条件,STATUS_SORT: 状态顺序
	 */
	Integer statusSort;
	
	/**
	 * 查询条件开始值,STATUS_SORT: 状态顺序
	 */
	Integer statusSortBegin;
	
	/**
	 * 查询条件结束值,STATUS_SORT: 状态顺序
	 */
	Integer statusSortEnd;
	
	/**
	 * 查询条件结束值,STATUS_SORT: 状态顺序
	 */
	Integer statusSortEndEqual;
	
	/**
	 * 查询条件,IS_DEFAULT: 是否默认状态
	 */
	Boolean isDefault;
	
	/**
	 * STATUS_ID: 状态标识
	 */
	public Integer getStatusId() {
		return this.statusId;
	}
	
	/**
	 * STATUS_ID: 状态标识
	 */
	public void setStatusId(Integer value)
	 {
		this.statusId = value;
	}
	
	/**
	 * 查询条件开始值,STATUS_ID: 状态标识
	 */
	public Integer getStatusIdBegin() {
		return this.statusIdBegin;
	}
	
	/**
	 * 查询条件开始值,STATUS_ID: 状态标识
	 */
	public void setStatusIdBegin(Integer value)
	 {
		this.statusIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,STATUS_ID: 状态标识
	 */
	public Integer getStatusIdEnd() {
		return this.statusIdEnd;
	}
	
	/**
	 * 查询条件结束值,STATUS_ID: 状态标识
	 */
	public void setStatusIdEnd(Integer value)
	 {
		this.statusIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,STATUS_ID: 状态标识
	 */
	public Integer getStatusIdEndEqual() {
		return this.statusIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,STATUS_ID: 状态标识
	 */
	public void setStatusIdEndEqual(Integer value)
	 {
		this.statusIdEndEqual = value;
	}
	
	/**
	 * STATUS_NAME: 状态名称
	 */
	public String getStatusName() {
		return this.statusName;
	}
	
	/**
	 * STATUS_NAME: 状态名称
	 */
	public void setStatusName(String value)
	 {
		this.statusName = value;
	}
	
	/**
	 * 查询条件字符串相等,STATUS_NAME: 状态名称
	 */
	public String getStatusNameEqual() {
		return this.statusNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,STATUS_NAME: 状态名称
	 */
	public void setStatusNameEqual(String value)
	 {
		this.statusNameEqual = value;
	}
	
	/**
	 * STATUS_SORT: 状态顺序
	 */
	public Integer getStatusSort() {
		return this.statusSort;
	}
	
	/**
	 * STATUS_SORT: 状态顺序
	 */
	public void setStatusSort(Integer value)
	 {
		this.statusSort = value;
	}
	
	/**
	 * 查询条件开始值,STATUS_SORT: 状态顺序
	 */
	public Integer getStatusSortBegin() {
		return this.statusSortBegin;
	}
	
	/**
	 * 查询条件开始值,STATUS_SORT: 状态顺序
	 */
	public void setStatusSortBegin(Integer value)
	 {
		this.statusSortBegin = value;
	}
	
	/**
	 * 查询条件结束值,STATUS_SORT: 状态顺序
	 */
	public Integer getStatusSortEnd() {
		return this.statusSortEnd;
	}
	
	/**
	 * 查询条件结束值,STATUS_SORT: 状态顺序
	 */
	public void setStatusSortEnd(Integer value)
	 {
		this.statusSortEnd = value;
	}
	
	/**
	 * 查询条件结束值,STATUS_SORT: 状态顺序
	 */
	public Integer getStatusSortEndEqual() {
		return this.statusSortEndEqual;
	}
	
	/**
	 * 查询条件结束值,STATUS_SORT: 状态顺序
	 */
	public void setStatusSortEndEqual(Integer value)
	 {
		this.statusSortEndEqual = value;
	}
	
	/**
	 * IS_DEFAULT: 是否默认状态
	 */
	public Boolean getIsDefault() {
		return this.isDefault;
	}
	
	/**
	 * IS_DEFAULT: 是否默认状态
	 */
	public void setIsDefault(Boolean value)
	 {
		this.isDefault = value;
	}
	
	/**
	 * 设置查询条件STATUS_ID: 状态标识
	 */
	public IssueStatusQueryCondition setStatusIdCondition(Integer value) {
		this.statusId = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATUS_ID: 状态标识
	 */
	public IssueStatusQueryCondition setStatusIdConditionBegin(Integer value) {
		this.statusIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATUS_ID: 状态标识
	 */
	public IssueStatusQueryCondition setStatusIdConditionEnd(Integer value) {
		this.statusIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATUS_ID: 状态标识
	 */
	public IssueStatusQueryCondition setStatusIdConditionEndEqual(Integer value) {
		this.statusIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATUS_NAME: 状态名称
	 */
	public IssueStatusQueryCondition setStatusNameCondition(String value) {
		this.statusName = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATUS_NAME: 状态名称
	 */
	public IssueStatusQueryCondition setStatusNameConditionEqual(String value) {
		this.statusNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATUS_SORT: 状态顺序
	 */
	public IssueStatusQueryCondition setStatusSortCondition(Integer value) {
		this.statusSort = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATUS_SORT: 状态顺序
	 */
	public IssueStatusQueryCondition setStatusSortConditionBegin(Integer value) {
		this.statusSortBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATUS_SORT: 状态顺序
	 */
	public IssueStatusQueryCondition setStatusSortConditionEnd(Integer value) {
		this.statusSortEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件STATUS_SORT: 状态顺序
	 */
	public IssueStatusQueryCondition setStatusSortConditionEndEqual(Integer value) {
		this.statusSortEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件IS_DEFAULT: 是否默认状态
	 */
	public IssueStatusQueryCondition setIsDefaultCondition(Boolean value) {
		this.isDefault = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.statusId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_STATUS].[STATUS_ID] = " + this.statusId) 
						+ ") "));
		}
		if ((this.statusIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_STATUS].[STATUS_ID] >= " 
						+ (this.statusIdBegin + ")")));
		}
		if ((this.statusIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_STATUS].[STATUS_ID] < " 
						+ (this.statusIdEnd + ") ")));
		}
		if ((this.statusIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_STATUS].[STATUS_ID] <= " 
						+ (this.statusIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.statusName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ISSUE_STATUS].[STATUS_NAME]", this.statusName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.statusNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ISSUE_STATUS].[STATUS_NAME] = " + SqlServerUtils.safeSql(this.statusNameEqual))) 
						+ ") "));
		}
		if ((this.statusSort == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_STATUS].[STATUS_SORT] = " + this.statusSort) 
						+ ") "));
		}
		if ((this.statusSortBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_STATUS].[STATUS_SORT] >= " 
						+ (this.statusSortBegin + ")")));
		}
		if ((this.statusSortEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_STATUS].[STATUS_SORT] < " 
						+ (this.statusSortEnd + ") ")));
		}
		if ((this.statusSortEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ISSUE_STATUS].[STATUS_SORT] <= " 
						+ (this.statusSortEndEqual + ") ")));
		}
		if ((this.isDefault == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ISSUE_STATUS].[IS_DEFAULT] = " + SqlServerUtils.getBoolSql(this.isDefault)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
