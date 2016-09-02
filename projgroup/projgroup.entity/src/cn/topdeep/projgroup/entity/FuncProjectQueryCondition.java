package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_FUNC_PROJECT查询条件定义
 */
public class FuncProjectQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,FUNC_PROJECT_ID: 函数项目标识
	 */
	Integer funcProjectId;
	
	/**
	 * 查询条件开始值,FUNC_PROJECT_ID: 函数项目标识
	 */
	Integer funcProjectIdBegin;
	
	/**
	 * 查询条件结束值,FUNC_PROJECT_ID: 函数项目标识
	 */
	Integer funcProjectIdEnd;
	
	/**
	 * 查询条件结束值,FUNC_PROJECT_ID: 函数项目标识
	 */
	Integer funcProjectIdEndEqual;
	
	/**
	 * 查询条件,FUNC_PROJECT_NAME: 函数项目名称
	 */
	String funcProjectName;
	
	/**
	 * 查询条件字符串相等,FUNC_PROJECT_NAME: 函数项目名称
	 */
	String funcProjectNameEqual;
	
	/**
	 * 查询条件,FUNC_PROJECT_DESC: 函数面目描述
	 */
	String funcProjectDesc;
	
	/**
	 * 查询条件字符串相等,FUNC_PROJECT_DESC: 函数面目描述
	 */
	String funcProjectDescEqual;
	
	/**
	 * 查询条件,PUB0: 备用字段1
	 */
	String pub0;
	
	/**
	 * 查询条件字符串相等,PUB0: 备用字段1
	 */
	String pub0Equal;
	
	/**
	 * 查询条件,PUB1: 备用字段2
	 */
	String pub1;
	
	/**
	 * 查询条件字符串相等,PUB1: 备用字段2
	 */
	String pub1Equal;
	
	/**
	 * 查询条件,PUB2: 备用字段3
	 */
	String pub2;
	
	/**
	 * 查询条件字符串相等,PUB2: 备用字段3
	 */
	String pub2Equal;
	
	/**
	 * 查询条件,PUB3: 备用字段4
	 */
	String pub3;
	
	/**
	 * 查询条件字符串相等,PUB3: 备用字段4
	 */
	String pub3Equal;
	
	/**
	 * 查询条件,PUB4: 备用字段5
	 */
	String pub4;
	
	/**
	 * 查询条件字符串相等,PUB4: 备用字段5
	 */
	String pub4Equal;
	
	/**
	 * 查询条件,PUB5: 备用字段6
	 */
	String pub5;
	
	/**
	 * 查询条件字符串相等,PUB5: 备用字段6
	 */
	String pub5Equal;
	
	/**
	 * FUNC_PROJECT_ID: 函数项目标识
	 */
	public Integer getFuncProjectId() {
		return this.funcProjectId;
	}
	
	/**
	 * FUNC_PROJECT_ID: 函数项目标识
	 */
	public void setFuncProjectId(Integer value)
	 {
		this.funcProjectId = value;
	}
	
	/**
	 * 查询条件开始值,FUNC_PROJECT_ID: 函数项目标识
	 */
	public Integer getFuncProjectIdBegin() {
		return this.funcProjectIdBegin;
	}
	
	/**
	 * 查询条件开始值,FUNC_PROJECT_ID: 函数项目标识
	 */
	public void setFuncProjectIdBegin(Integer value)
	 {
		this.funcProjectIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,FUNC_PROJECT_ID: 函数项目标识
	 */
	public Integer getFuncProjectIdEnd() {
		return this.funcProjectIdEnd;
	}
	
	/**
	 * 查询条件结束值,FUNC_PROJECT_ID: 函数项目标识
	 */
	public void setFuncProjectIdEnd(Integer value)
	 {
		this.funcProjectIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,FUNC_PROJECT_ID: 函数项目标识
	 */
	public Integer getFuncProjectIdEndEqual() {
		return this.funcProjectIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,FUNC_PROJECT_ID: 函数项目标识
	 */
	public void setFuncProjectIdEndEqual(Integer value)
	 {
		this.funcProjectIdEndEqual = value;
	}
	
	/**
	 * FUNC_PROJECT_NAME: 函数项目名称
	 */
	public String getFuncProjectName() {
		return this.funcProjectName;
	}
	
	/**
	 * FUNC_PROJECT_NAME: 函数项目名称
	 */
	public void setFuncProjectName(String value)
	 {
		this.funcProjectName = value;
	}
	
	/**
	 * 查询条件字符串相等,FUNC_PROJECT_NAME: 函数项目名称
	 */
	public String getFuncProjectNameEqual() {
		return this.funcProjectNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,FUNC_PROJECT_NAME: 函数项目名称
	 */
	public void setFuncProjectNameEqual(String value)
	 {
		this.funcProjectNameEqual = value;
	}
	
	/**
	 * FUNC_PROJECT_DESC: 函数面目描述
	 */
	public String getFuncProjectDesc() {
		return this.funcProjectDesc;
	}
	
	/**
	 * FUNC_PROJECT_DESC: 函数面目描述
	 */
	public void setFuncProjectDesc(String value)
	 {
		this.funcProjectDesc = value;
	}
	
	/**
	 * 查询条件字符串相等,FUNC_PROJECT_DESC: 函数面目描述
	 */
	public String getFuncProjectDescEqual() {
		return this.funcProjectDescEqual;
	}
	
	/**
	 * 查询条件字符串相等,FUNC_PROJECT_DESC: 函数面目描述
	 */
	public void setFuncProjectDescEqual(String value)
	 {
		this.funcProjectDescEqual = value;
	}
	
	/**
	 * PUB0: 备用字段1
	 */
	public String getPub0() {
		return this.pub0;
	}
	
	/**
	 * PUB0: 备用字段1
	 */
	public void setPub0(String value)
	 {
		this.pub0 = value;
	}
	
	/**
	 * 查询条件字符串相等,PUB0: 备用字段1
	 */
	public String getPub0Equal() {
		return this.pub0Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB0: 备用字段1
	 */
	public void setPub0Equal(String value)
	 {
		this.pub0Equal = value;
	}
	
	/**
	 * PUB1: 备用字段2
	 */
	public String getPub1() {
		return this.pub1;
	}
	
	/**
	 * PUB1: 备用字段2
	 */
	public void setPub1(String value)
	 {
		this.pub1 = value;
	}
	
	/**
	 * 查询条件字符串相等,PUB1: 备用字段2
	 */
	public String getPub1Equal() {
		return this.pub1Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB1: 备用字段2
	 */
	public void setPub1Equal(String value)
	 {
		this.pub1Equal = value;
	}
	
	/**
	 * PUB2: 备用字段3
	 */
	public String getPub2() {
		return this.pub2;
	}
	
	/**
	 * PUB2: 备用字段3
	 */
	public void setPub2(String value)
	 {
		this.pub2 = value;
	}
	
	/**
	 * 查询条件字符串相等,PUB2: 备用字段3
	 */
	public String getPub2Equal() {
		return this.pub2Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB2: 备用字段3
	 */
	public void setPub2Equal(String value)
	 {
		this.pub2Equal = value;
	}
	
	/**
	 * PUB3: 备用字段4
	 */
	public String getPub3() {
		return this.pub3;
	}
	
	/**
	 * PUB3: 备用字段4
	 */
	public void setPub3(String value)
	 {
		this.pub3 = value;
	}
	
	/**
	 * 查询条件字符串相等,PUB3: 备用字段4
	 */
	public String getPub3Equal() {
		return this.pub3Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB3: 备用字段4
	 */
	public void setPub3Equal(String value)
	 {
		this.pub3Equal = value;
	}
	
	/**
	 * PUB4: 备用字段5
	 */
	public String getPub4() {
		return this.pub4;
	}
	
	/**
	 * PUB4: 备用字段5
	 */
	public void setPub4(String value)
	 {
		this.pub4 = value;
	}
	
	/**
	 * 查询条件字符串相等,PUB4: 备用字段5
	 */
	public String getPub4Equal() {
		return this.pub4Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB4: 备用字段5
	 */
	public void setPub4Equal(String value)
	 {
		this.pub4Equal = value;
	}
	
	/**
	 * PUB5: 备用字段6
	 */
	public String getPub5() {
		return this.pub5;
	}
	
	/**
	 * PUB5: 备用字段6
	 */
	public void setPub5(String value)
	 {
		this.pub5 = value;
	}
	
	/**
	 * 查询条件字符串相等,PUB5: 备用字段6
	 */
	public String getPub5Equal() {
		return this.pub5Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB5: 备用字段6
	 */
	public void setPub5Equal(String value)
	 {
		this.pub5Equal = value;
	}
	
	/**
	 * 设置查询条件FUNC_PROJECT_ID: 函数项目标识
	 */
	public FuncProjectQueryCondition setFuncProjectIdCondition(Integer value) {
		this.funcProjectId = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROJECT_ID: 函数项目标识
	 */
	public FuncProjectQueryCondition setFuncProjectIdConditionBegin(Integer value) {
		this.funcProjectIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROJECT_ID: 函数项目标识
	 */
	public FuncProjectQueryCondition setFuncProjectIdConditionEnd(Integer value) {
		this.funcProjectIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROJECT_ID: 函数项目标识
	 */
	public FuncProjectQueryCondition setFuncProjectIdConditionEndEqual(Integer value) {
		this.funcProjectIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROJECT_NAME: 函数项目名称
	 */
	public FuncProjectQueryCondition setFuncProjectNameCondition(String value) {
		this.funcProjectName = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROJECT_NAME: 函数项目名称
	 */
	public FuncProjectQueryCondition setFuncProjectNameConditionEqual(String value) {
		this.funcProjectNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROJECT_DESC: 函数面目描述
	 */
	public FuncProjectQueryCondition setFuncProjectDescCondition(String value) {
		this.funcProjectDesc = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROJECT_DESC: 函数面目描述
	 */
	public FuncProjectQueryCondition setFuncProjectDescConditionEqual(String value) {
		this.funcProjectDescEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB0: 备用字段1
	 */
	public FuncProjectQueryCondition setPub0Condition(String value) {
		this.pub0 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB0: 备用字段1
	 */
	public FuncProjectQueryCondition setPub0ConditionEqual(String value) {
		this.pub0Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB1: 备用字段2
	 */
	public FuncProjectQueryCondition setPub1Condition(String value) {
		this.pub1 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB1: 备用字段2
	 */
	public FuncProjectQueryCondition setPub1ConditionEqual(String value) {
		this.pub1Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB2: 备用字段3
	 */
	public FuncProjectQueryCondition setPub2Condition(String value) {
		this.pub2 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB2: 备用字段3
	 */
	public FuncProjectQueryCondition setPub2ConditionEqual(String value) {
		this.pub2Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB3: 备用字段4
	 */
	public FuncProjectQueryCondition setPub3Condition(String value) {
		this.pub3 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB3: 备用字段4
	 */
	public FuncProjectQueryCondition setPub3ConditionEqual(String value) {
		this.pub3Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB4: 备用字段5
	 */
	public FuncProjectQueryCondition setPub4Condition(String value) {
		this.pub4 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB4: 备用字段5
	 */
	public FuncProjectQueryCondition setPub4ConditionEqual(String value) {
		this.pub4Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB5: 备用字段6
	 */
	public FuncProjectQueryCondition setPub5Condition(String value) {
		this.pub5 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB5: 备用字段6
	 */
	public FuncProjectQueryCondition setPub5ConditionEqual(String value) {
		this.pub5Equal = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.funcProjectId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_FUNC_PROJECT].[FUNC_PROJECT_ID] = " + this.funcProjectId) 
						+ ") "));
		}
		if ((this.funcProjectIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PROJECT].[FUNC_PROJECT_ID] >= " 
						+ (this.funcProjectIdBegin + ")")));
		}
		if ((this.funcProjectIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PROJECT].[FUNC_PROJECT_ID] < " 
						+ (this.funcProjectIdEnd + ") ")));
		}
		if ((this.funcProjectIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PROJECT].[FUNC_PROJECT_ID] <= " 
						+ (this.funcProjectIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.funcProjectName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROJECT].[FUNC_PROJECT_NAME]", this.funcProjectName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.funcProjectNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROJECT].[FUNC_PROJECT_NAME] = " + SqlServerUtils.safeSql(this.funcProjectNameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.funcProjectDesc)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROJECT].[FUNC_PROJECT_DESC]", this.funcProjectDesc)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.funcProjectDescEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROJECT].[FUNC_PROJECT_DESC] = " + SqlServerUtils.safeSql(this.funcProjectDescEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub0)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROJECT].[PUB0]", this.pub0)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub0Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROJECT].[PUB0] = " + SqlServerUtils.safeSql(this.pub0Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub1)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROJECT].[PUB1]", this.pub1)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub1Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROJECT].[PUB1] = " + SqlServerUtils.safeSql(this.pub1Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub2)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROJECT].[PUB2]", this.pub2)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub2Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROJECT].[PUB2] = " + SqlServerUtils.safeSql(this.pub2Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub3)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROJECT].[PUB3]", this.pub3)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub3Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROJECT].[PUB3] = " + SqlServerUtils.safeSql(this.pub3Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub4)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROJECT].[PUB4]", this.pub4)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub4Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROJECT].[PUB4] = " + SqlServerUtils.safeSql(this.pub4Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub5)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROJECT].[PUB5]", this.pub5)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub5Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROJECT].[PUB5] = " + SqlServerUtils.safeSql(this.pub5Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
