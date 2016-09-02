package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_FUNC_TEST查询条件定义
 */
public class FuncTestQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,PARAM_ID: 参数标识
	 */
	Integer paramId;
	
	/**
	 * 查询条件开始值,PARAM_ID: 参数标识
	 */
	Integer paramIdBegin;
	
	/**
	 * 查询条件结束值,PARAM_ID: 参数标识
	 */
	Integer paramIdEnd;
	
	/**
	 * 查询条件结束值,PARAM_ID: 参数标识
	 */
	Integer paramIdEndEqual;
	
	/**
	 * 查询条件,TEST_VALUE: 测试值
	 */
	String testValue;
	
	/**
	 * 查询条件字符串相等,TEST_VALUE: 测试值
	 */
	String testValueEqual;
	
	/**
	 * 查询条件,TEST_VALUE_DESC: 测试值的说明
	 */
	String testValueDesc;
	
	/**
	 * 查询条件字符串相等,TEST_VALUE_DESC: 测试值的说明
	 */
	String testValueDescEqual;
	
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
	 * PARAM_ID: 参数标识
	 */
	public Integer getParamId() {
		return this.paramId;
	}
	
	/**
	 * PARAM_ID: 参数标识
	 */
	public void setParamId(Integer value)
	 {
		this.paramId = value;
	}
	
	/**
	 * 查询条件开始值,PARAM_ID: 参数标识
	 */
	public Integer getParamIdBegin() {
		return this.paramIdBegin;
	}
	
	/**
	 * 查询条件开始值,PARAM_ID: 参数标识
	 */
	public void setParamIdBegin(Integer value)
	 {
		this.paramIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PARAM_ID: 参数标识
	 */
	public Integer getParamIdEnd() {
		return this.paramIdEnd;
	}
	
	/**
	 * 查询条件结束值,PARAM_ID: 参数标识
	 */
	public void setParamIdEnd(Integer value)
	 {
		this.paramIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PARAM_ID: 参数标识
	 */
	public Integer getParamIdEndEqual() {
		return this.paramIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PARAM_ID: 参数标识
	 */
	public void setParamIdEndEqual(Integer value)
	 {
		this.paramIdEndEqual = value;
	}
	
	/**
	 * TEST_VALUE: 测试值
	 */
	public String getTestValue() {
		return this.testValue;
	}
	
	/**
	 * TEST_VALUE: 测试值
	 */
	public void setTestValue(String value)
	 {
		this.testValue = value;
	}
	
	/**
	 * 查询条件字符串相等,TEST_VALUE: 测试值
	 */
	public String getTestValueEqual() {
		return this.testValueEqual;
	}
	
	/**
	 * 查询条件字符串相等,TEST_VALUE: 测试值
	 */
	public void setTestValueEqual(String value)
	 {
		this.testValueEqual = value;
	}
	
	/**
	 * TEST_VALUE_DESC: 测试值的说明
	 */
	public String getTestValueDesc() {
		return this.testValueDesc;
	}
	
	/**
	 * TEST_VALUE_DESC: 测试值的说明
	 */
	public void setTestValueDesc(String value)
	 {
		this.testValueDesc = value;
	}
	
	/**
	 * 查询条件字符串相等,TEST_VALUE_DESC: 测试值的说明
	 */
	public String getTestValueDescEqual() {
		return this.testValueDescEqual;
	}
	
	/**
	 * 查询条件字符串相等,TEST_VALUE_DESC: 测试值的说明
	 */
	public void setTestValueDescEqual(String value)
	 {
		this.testValueDescEqual = value;
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
	public FuncTestQueryCondition setBuildIdCondition(Integer value) {
		this.buildId = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public FuncTestQueryCondition setBuildIdConditionBegin(Integer value) {
		this.buildIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public FuncTestQueryCondition setBuildIdConditionEnd(Integer value) {
		this.buildIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public FuncTestQueryCondition setBuildIdConditionEndEqual(Integer value) {
		this.buildIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_ID: 参数标识
	 */
	public FuncTestQueryCondition setParamIdCondition(Integer value) {
		this.paramId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_ID: 参数标识
	 */
	public FuncTestQueryCondition setParamIdConditionBegin(Integer value) {
		this.paramIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_ID: 参数标识
	 */
	public FuncTestQueryCondition setParamIdConditionEnd(Integer value) {
		this.paramIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_ID: 参数标识
	 */
	public FuncTestQueryCondition setParamIdConditionEndEqual(Integer value) {
		this.paramIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEST_VALUE: 测试值
	 */
	public FuncTestQueryCondition setTestValueCondition(String value) {
		this.testValue = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEST_VALUE: 测试值
	 */
	public FuncTestQueryCondition setTestValueConditionEqual(String value) {
		this.testValueEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEST_VALUE_DESC: 测试值的说明
	 */
	public FuncTestQueryCondition setTestValueDescCondition(String value) {
		this.testValueDesc = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEST_VALUE_DESC: 测试值的说明
	 */
	public FuncTestQueryCondition setTestValueDescConditionEqual(String value) {
		this.testValueDescEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB0: 备用字段1
	 */
	public FuncTestQueryCondition setPub0Condition(String value) {
		this.pub0 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB0: 备用字段1
	 */
	public FuncTestQueryCondition setPub0ConditionEqual(String value) {
		this.pub0Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB1: 备用字段2
	 */
	public FuncTestQueryCondition setPub1Condition(String value) {
		this.pub1 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB1: 备用字段2
	 */
	public FuncTestQueryCondition setPub1ConditionEqual(String value) {
		this.pub1Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB2: 备用字段3
	 */
	public FuncTestQueryCondition setPub2Condition(String value) {
		this.pub2 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB2: 备用字段3
	 */
	public FuncTestQueryCondition setPub2ConditionEqual(String value) {
		this.pub2Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB3: 备用字段4
	 */
	public FuncTestQueryCondition setPub3Condition(String value) {
		this.pub3 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB3: 备用字段4
	 */
	public FuncTestQueryCondition setPub3ConditionEqual(String value) {
		this.pub3Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB4: 备用字段5
	 */
	public FuncTestQueryCondition setPub4Condition(String value) {
		this.pub4 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB4: 备用字段5
	 */
	public FuncTestQueryCondition setPub4ConditionEqual(String value) {
		this.pub4Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB5: 备用字段6
	 */
	public FuncTestQueryCondition setPub5Condition(String value) {
		this.pub5 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB5: 备用字段6
	 */
	public FuncTestQueryCondition setPub5ConditionEqual(String value) {
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
						+ ((" and ([T_FUNC_TEST].[BUILD_ID] = " + this.buildId) 
						+ ") "));
		}
		if ((this.buildIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_TEST].[BUILD_ID] >= " 
						+ (this.buildIdBegin + ")")));
		}
		if ((this.buildIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_TEST].[BUILD_ID] < " 
						+ (this.buildIdEnd + ") ")));
		}
		if ((this.buildIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_TEST].[BUILD_ID] <= " 
						+ (this.buildIdEndEqual + ") ")));
		}
		if ((this.paramId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_FUNC_TEST].[PARAM_ID] = " + this.paramId) 
						+ ") "));
		}
		if ((this.paramIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_TEST].[PARAM_ID] >= " 
						+ (this.paramIdBegin + ")")));
		}
		if ((this.paramIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_TEST].[PARAM_ID] < " 
						+ (this.paramIdEnd + ") ")));
		}
		if ((this.paramIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_TEST].[PARAM_ID] <= " 
						+ (this.paramIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.testValue)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_TEST].[TEST_VALUE]", this.testValue)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.testValueEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_TEST].[TEST_VALUE] = " + SqlServerUtils.safeSql(this.testValueEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.testValueDesc)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_TEST].[TEST_VALUE_DESC]", this.testValueDesc)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.testValueDescEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_TEST].[TEST_VALUE_DESC] = " + SqlServerUtils.safeSql(this.testValueDescEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub0)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_TEST].[PUB0]", this.pub0)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub0Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_TEST].[PUB0] = " + SqlServerUtils.safeSql(this.pub0Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub1)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_TEST].[PUB1]", this.pub1)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub1Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_TEST].[PUB1] = " + SqlServerUtils.safeSql(this.pub1Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub2)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_TEST].[PUB2]", this.pub2)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub2Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_TEST].[PUB2] = " + SqlServerUtils.safeSql(this.pub2Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub3)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_TEST].[PUB3]", this.pub3)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub3Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_TEST].[PUB3] = " + SqlServerUtils.safeSql(this.pub3Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub4)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_TEST].[PUB4]", this.pub4)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub4Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_TEST].[PUB4] = " + SqlServerUtils.safeSql(this.pub4Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub5)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_TEST].[PUB5]", this.pub5)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub5Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_TEST].[PUB5] = " + SqlServerUtils.safeSql(this.pub5Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
