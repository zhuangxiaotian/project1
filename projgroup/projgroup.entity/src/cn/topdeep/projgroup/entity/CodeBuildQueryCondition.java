package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_CODE_BUILD查询条件定义
 */
public class CodeBuildQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,BUILD_ID: 构建标识
	 */
	Integer buildId;
	
	/**
	 * 查询条件开始值,BUILD_ID: 构建标识
	 */
	Integer buildIdBegin;
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	Integer buildIdEnd;
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	Integer buildIdEndEqual;
	
	/**
	 * 查询条件,BUILD_NAME: 构建名称
	 */
	String buildName;
	
	/**
	 * 查询条件字符串相等,BUILD_NAME: 构建名称
	 */
	String buildNameEqual;
	
	/**
	 * 查询条件,BUILD_DESC: 构建说明
	 */
	String buildDesc;
	
	/**
	 * 查询条件字符串相等,BUILD_DESC: 构建说明
	 */
	String buildDescEqual;
	
	/**
	 * 查询条件,PARENT_BUILD_ID: 父构建标识
	 */
	Integer parentBuildId;
	
	/**
	 * 查询条件开始值,PARENT_BUILD_ID: 父构建标识
	 */
	Integer parentBuildIdBegin;
	
	/**
	 * 查询条件结束值,PARENT_BUILD_ID: 父构建标识
	 */
	Integer parentBuildIdEnd;
	
	/**
	 * 查询条件结束值,PARENT_BUILD_ID: 父构建标识
	 */
	Integer parentBuildIdEndEqual;
	
	/**
	 * 查询条件,FUNC_PROJECTS: 相关项目标识，多个标识用逗号分隔
	 */
	String funcProjects;
	
	/**
	 * 查询条件字符串相等,FUNC_PROJECTS: 相关项目标识，多个标识用逗号分隔
	 */
	String funcProjectsEqual;
	
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
	 * BUILD_ID: 构建标识
	 */
	public Integer getBuildId() {
		return this.buildId;
	}
	
	/**
	 * BUILD_ID: 构建标识
	 */
	public void setBuildId(Integer value)
	 {
		this.buildId = value;
	}
	
	/**
	 * 查询条件开始值,BUILD_ID: 构建标识
	 */
	public Integer getBuildIdBegin() {
		return this.buildIdBegin;
	}
	
	/**
	 * 查询条件开始值,BUILD_ID: 构建标识
	 */
	public void setBuildIdBegin(Integer value)
	 {
		this.buildIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	public Integer getBuildIdEnd() {
		return this.buildIdEnd;
	}
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	public void setBuildIdEnd(Integer value)
	 {
		this.buildIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	public Integer getBuildIdEndEqual() {
		return this.buildIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	public void setBuildIdEndEqual(Integer value)
	 {
		this.buildIdEndEqual = value;
	}
	
	/**
	 * BUILD_NAME: 构建名称
	 */
	public String getBuildName() {
		return this.buildName;
	}
	
	/**
	 * BUILD_NAME: 构建名称
	 */
	public void setBuildName(String value)
	 {
		this.buildName = value;
	}
	
	/**
	 * 查询条件字符串相等,BUILD_NAME: 构建名称
	 */
	public String getBuildNameEqual() {
		return this.buildNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,BUILD_NAME: 构建名称
	 */
	public void setBuildNameEqual(String value)
	 {
		this.buildNameEqual = value;
	}
	
	/**
	 * BUILD_DESC: 构建说明
	 */
	public String getBuildDesc() {
		return this.buildDesc;
	}
	
	/**
	 * BUILD_DESC: 构建说明
	 */
	public void setBuildDesc(String value)
	 {
		this.buildDesc = value;
	}
	
	/**
	 * 查询条件字符串相等,BUILD_DESC: 构建说明
	 */
	public String getBuildDescEqual() {
		return this.buildDescEqual;
	}
	
	/**
	 * 查询条件字符串相等,BUILD_DESC: 构建说明
	 */
	public void setBuildDescEqual(String value)
	 {
		this.buildDescEqual = value;
	}
	
	/**
	 * PARENT_BUILD_ID: 父构建标识
	 */
	public Integer getParentBuildId() {
		return this.parentBuildId;
	}
	
	/**
	 * PARENT_BUILD_ID: 父构建标识
	 */
	public void setParentBuildId(Integer value)
	 {
		this.parentBuildId = value;
	}
	
	/**
	 * 查询条件开始值,PARENT_BUILD_ID: 父构建标识
	 */
	public Integer getParentBuildIdBegin() {
		return this.parentBuildIdBegin;
	}
	
	/**
	 * 查询条件开始值,PARENT_BUILD_ID: 父构建标识
	 */
	public void setParentBuildIdBegin(Integer value)
	 {
		this.parentBuildIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PARENT_BUILD_ID: 父构建标识
	 */
	public Integer getParentBuildIdEnd() {
		return this.parentBuildIdEnd;
	}
	
	/**
	 * 查询条件结束值,PARENT_BUILD_ID: 父构建标识
	 */
	public void setParentBuildIdEnd(Integer value)
	 {
		this.parentBuildIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PARENT_BUILD_ID: 父构建标识
	 */
	public Integer getParentBuildIdEndEqual() {
		return this.parentBuildIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PARENT_BUILD_ID: 父构建标识
	 */
	public void setParentBuildIdEndEqual(Integer value)
	 {
		this.parentBuildIdEndEqual = value;
	}
	
	/**
	 * FUNC_PROJECTS: 相关项目标识，多个标识用逗号分隔
	 */
	public String getFuncProjects() {
		return this.funcProjects;
	}
	
	/**
	 * FUNC_PROJECTS: 相关项目标识，多个标识用逗号分隔
	 */
	public void setFuncProjects(String value)
	 {
		this.funcProjects = value;
	}
	
	/**
	 * 查询条件字符串相等,FUNC_PROJECTS: 相关项目标识，多个标识用逗号分隔
	 */
	public String getFuncProjectsEqual() {
		return this.funcProjectsEqual;
	}
	
	/**
	 * 查询条件字符串相等,FUNC_PROJECTS: 相关项目标识，多个标识用逗号分隔
	 */
	public void setFuncProjectsEqual(String value)
	 {
		this.funcProjectsEqual = value;
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
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public CodeBuildQueryCondition setBuildIdCondition(Integer value) {
		this.buildId = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public CodeBuildQueryCondition setBuildIdConditionBegin(Integer value) {
		this.buildIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public CodeBuildQueryCondition setBuildIdConditionEnd(Integer value) {
		this.buildIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public CodeBuildQueryCondition setBuildIdConditionEndEqual(Integer value) {
		this.buildIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_NAME: 构建名称
	 */
	public CodeBuildQueryCondition setBuildNameCondition(String value) {
		this.buildName = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_NAME: 构建名称
	 */
	public CodeBuildQueryCondition setBuildNameConditionEqual(String value) {
		this.buildNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_DESC: 构建说明
	 */
	public CodeBuildQueryCondition setBuildDescCondition(String value) {
		this.buildDesc = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_DESC: 构建说明
	 */
	public CodeBuildQueryCondition setBuildDescConditionEqual(String value) {
		this.buildDescEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_BUILD_ID: 父构建标识
	 */
	public CodeBuildQueryCondition setParentBuildIdCondition(Integer value) {
		this.parentBuildId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_BUILD_ID: 父构建标识
	 */
	public CodeBuildQueryCondition setParentBuildIdConditionBegin(Integer value) {
		this.parentBuildIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_BUILD_ID: 父构建标识
	 */
	public CodeBuildQueryCondition setParentBuildIdConditionEnd(Integer value) {
		this.parentBuildIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_BUILD_ID: 父构建标识
	 */
	public CodeBuildQueryCondition setParentBuildIdConditionEndEqual(Integer value) {
		this.parentBuildIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROJECTS: 相关项目标识，多个标识用逗号分隔
	 */
	public CodeBuildQueryCondition setFuncProjectsCondition(String value) {
		this.funcProjects = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROJECTS: 相关项目标识，多个标识用逗号分隔
	 */
	public CodeBuildQueryCondition setFuncProjectsConditionEqual(String value) {
		this.funcProjectsEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB0: 备用字段1
	 */
	public CodeBuildQueryCondition setPub0Condition(String value) {
		this.pub0 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB0: 备用字段1
	 */
	public CodeBuildQueryCondition setPub0ConditionEqual(String value) {
		this.pub0Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB1: 备用字段2
	 */
	public CodeBuildQueryCondition setPub1Condition(String value) {
		this.pub1 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB1: 备用字段2
	 */
	public CodeBuildQueryCondition setPub1ConditionEqual(String value) {
		this.pub1Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB2: 备用字段3
	 */
	public CodeBuildQueryCondition setPub2Condition(String value) {
		this.pub2 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB2: 备用字段3
	 */
	public CodeBuildQueryCondition setPub2ConditionEqual(String value) {
		this.pub2Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB3: 备用字段4
	 */
	public CodeBuildQueryCondition setPub3Condition(String value) {
		this.pub3 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB3: 备用字段4
	 */
	public CodeBuildQueryCondition setPub3ConditionEqual(String value) {
		this.pub3Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB4: 备用字段5
	 */
	public CodeBuildQueryCondition setPub4Condition(String value) {
		this.pub4 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB4: 备用字段5
	 */
	public CodeBuildQueryCondition setPub4ConditionEqual(String value) {
		this.pub4Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB5: 备用字段6
	 */
	public CodeBuildQueryCondition setPub5Condition(String value) {
		this.pub5 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB5: 备用字段6
	 */
	public CodeBuildQueryCondition setPub5ConditionEqual(String value) {
		this.pub5Equal = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.buildId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_CODE_BUILD].[BUILD_ID] = " + this.buildId) 
						+ ") "));
		}
		if ((this.buildIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD].[BUILD_ID] >= " 
						+ (this.buildIdBegin + ")")));
		}
		if ((this.buildIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD].[BUILD_ID] < " 
						+ (this.buildIdEnd + ") ")));
		}
		if ((this.buildIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD].[BUILD_ID] <= " 
						+ (this.buildIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.buildName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_CODE_BUILD].[BUILD_NAME]", this.buildName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.buildNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_CODE_BUILD].[BUILD_NAME] = " + SqlServerUtils.safeSql(this.buildNameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.buildDesc)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_CODE_BUILD].[BUILD_DESC]", this.buildDesc)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.buildDescEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_CODE_BUILD].[BUILD_DESC] = " + SqlServerUtils.safeSql(this.buildDescEqual))) 
						+ ") "));
		}
		if ((this.parentBuildId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_CODE_BUILD].[PARENT_BUILD_ID] = " + this.parentBuildId) 
						+ ") "));
		}
		if ((this.parentBuildIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD].[PARENT_BUILD_ID] >= " 
						+ (this.parentBuildIdBegin + ")")));
		}
		if ((this.parentBuildIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD].[PARENT_BUILD_ID] < " 
						+ (this.parentBuildIdEnd + ") ")));
		}
		if ((this.parentBuildIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD].[PARENT_BUILD_ID] <= " 
						+ (this.parentBuildIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.funcProjects)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_CODE_BUILD].[FUNC_PROJECTS]", this.funcProjects)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.funcProjectsEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_CODE_BUILD].[FUNC_PROJECTS] = " + SqlServerUtils.safeSql(this.funcProjectsEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub0)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_CODE_BUILD].[PUB0]", this.pub0)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub0Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_CODE_BUILD].[PUB0] = " + SqlServerUtils.safeSql(this.pub0Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub1)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_CODE_BUILD].[PUB1]", this.pub1)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub1Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_CODE_BUILD].[PUB1] = " + SqlServerUtils.safeSql(this.pub1Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub2)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_CODE_BUILD].[PUB2]", this.pub2)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub2Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_CODE_BUILD].[PUB2] = " + SqlServerUtils.safeSql(this.pub2Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub3)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_CODE_BUILD].[PUB3]", this.pub3)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub3Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_CODE_BUILD].[PUB3] = " + SqlServerUtils.safeSql(this.pub3Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub4)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_CODE_BUILD].[PUB4]", this.pub4)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub4Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_CODE_BUILD].[PUB4] = " + SqlServerUtils.safeSql(this.pub4Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub5)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_CODE_BUILD].[PUB5]", this.pub5)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub5Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_CODE_BUILD].[PUB5] = " + SqlServerUtils.safeSql(this.pub5Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
