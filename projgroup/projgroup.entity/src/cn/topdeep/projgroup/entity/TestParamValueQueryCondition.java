package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_TEST_PARAM_VALUE查询条件定义
 */
public class TestParamValueQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,TEST_PROCEDURE_ID: 测试过程标识
	 */
	Integer testProcedureId;
	
	/**
	 * 查询条件开始值,TEST_PROCEDURE_ID: 测试过程标识
	 */
	Integer testProcedureIdBegin;
	
	/**
	 * 查询条件结束值,TEST_PROCEDURE_ID: 测试过程标识
	 */
	Integer testProcedureIdEnd;
	
	/**
	 * 查询条件结束值,TEST_PROCEDURE_ID: 测试过程标识
	 */
	Integer testProcedureIdEndEqual;
	
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
	 * TEST_PROCEDURE_ID: 测试过程标识
	 */
	public Integer getTestProcedureId() {
		return this.testProcedureId;
	}
	
	/**
	 * TEST_PROCEDURE_ID: 测试过程标识
	 */
	public void setTestProcedureId(Integer value)
	 {
		this.testProcedureId = value;
	}
	
	/**
	 * 查询条件开始值,TEST_PROCEDURE_ID: 测试过程标识
	 */
	public Integer getTestProcedureIdBegin() {
		return this.testProcedureIdBegin;
	}
	
	/**
	 * 查询条件开始值,TEST_PROCEDURE_ID: 测试过程标识
	 */
	public void setTestProcedureIdBegin(Integer value)
	 {
		this.testProcedureIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,TEST_PROCEDURE_ID: 测试过程标识
	 */
	public Integer getTestProcedureIdEnd() {
		return this.testProcedureIdEnd;
	}
	
	/**
	 * 查询条件结束值,TEST_PROCEDURE_ID: 测试过程标识
	 */
	public void setTestProcedureIdEnd(Integer value)
	 {
		this.testProcedureIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,TEST_PROCEDURE_ID: 测试过程标识
	 */
	public Integer getTestProcedureIdEndEqual() {
		return this.testProcedureIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,TEST_PROCEDURE_ID: 测试过程标识
	 */
	public void setTestProcedureIdEndEqual(Integer value)
	 {
		this.testProcedureIdEndEqual = value;
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
	 * 设置查询条件TEST_PROCEDURE_ID: 测试过程标识
	 */
	public TestParamValueQueryCondition setTestProcedureIdCondition(Integer value) {
		this.testProcedureId = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEST_PROCEDURE_ID: 测试过程标识
	 */
	public TestParamValueQueryCondition setTestProcedureIdConditionBegin(Integer value) {
		this.testProcedureIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEST_PROCEDURE_ID: 测试过程标识
	 */
	public TestParamValueQueryCondition setTestProcedureIdConditionEnd(Integer value) {
		this.testProcedureIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEST_PROCEDURE_ID: 测试过程标识
	 */
	public TestParamValueQueryCondition setTestProcedureIdConditionEndEqual(Integer value) {
		this.testProcedureIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_ID: 参数标识
	 */
	public TestParamValueQueryCondition setParamIdCondition(Integer value) {
		this.paramId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_ID: 参数标识
	 */
	public TestParamValueQueryCondition setParamIdConditionBegin(Integer value) {
		this.paramIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_ID: 参数标识
	 */
	public TestParamValueQueryCondition setParamIdConditionEnd(Integer value) {
		this.paramIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_ID: 参数标识
	 */
	public TestParamValueQueryCondition setParamIdConditionEndEqual(Integer value) {
		this.paramIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEST_VALUE: 测试值
	 */
	public TestParamValueQueryCondition setTestValueCondition(String value) {
		this.testValue = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEST_VALUE: 测试值
	 */
	public TestParamValueQueryCondition setTestValueConditionEqual(String value) {
		this.testValueEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEST_VALUE_DESC: 测试值的说明
	 */
	public TestParamValueQueryCondition setTestValueDescCondition(String value) {
		this.testValueDesc = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEST_VALUE_DESC: 测试值的说明
	 */
	public TestParamValueQueryCondition setTestValueDescConditionEqual(String value) {
		this.testValueDescEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB0: 备用字段1
	 */
	public TestParamValueQueryCondition setPub0Condition(String value) {
		this.pub0 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB0: 备用字段1
	 */
	public TestParamValueQueryCondition setPub0ConditionEqual(String value) {
		this.pub0Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB1: 备用字段2
	 */
	public TestParamValueQueryCondition setPub1Condition(String value) {
		this.pub1 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB1: 备用字段2
	 */
	public TestParamValueQueryCondition setPub1ConditionEqual(String value) {
		this.pub1Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB2: 备用字段3
	 */
	public TestParamValueQueryCondition setPub2Condition(String value) {
		this.pub2 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB2: 备用字段3
	 */
	public TestParamValueQueryCondition setPub2ConditionEqual(String value) {
		this.pub2Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB3: 备用字段4
	 */
	public TestParamValueQueryCondition setPub3Condition(String value) {
		this.pub3 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB3: 备用字段4
	 */
	public TestParamValueQueryCondition setPub3ConditionEqual(String value) {
		this.pub3Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB4: 备用字段5
	 */
	public TestParamValueQueryCondition setPub4Condition(String value) {
		this.pub4 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB4: 备用字段5
	 */
	public TestParamValueQueryCondition setPub4ConditionEqual(String value) {
		this.pub4Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB5: 备用字段6
	 */
	public TestParamValueQueryCondition setPub5Condition(String value) {
		this.pub5 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB5: 备用字段6
	 */
	public TestParamValueQueryCondition setPub5ConditionEqual(String value) {
		this.pub5Equal = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.testProcedureId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TEST_PARAM_VALUE].[TEST_PROCEDURE_ID] = " + this.testProcedureId) 
						+ ") "));
		}
		if ((this.testProcedureIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PARAM_VALUE].[TEST_PROCEDURE_ID] >= " 
						+ (this.testProcedureIdBegin + ")")));
		}
		if ((this.testProcedureIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PARAM_VALUE].[TEST_PROCEDURE_ID] < " 
						+ (this.testProcedureIdEnd + ") ")));
		}
		if ((this.testProcedureIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PARAM_VALUE].[TEST_PROCEDURE_ID] <= " 
						+ (this.testProcedureIdEndEqual + ") ")));
		}
		if ((this.paramId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TEST_PARAM_VALUE].[PARAM_ID] = " + this.paramId) 
						+ ") "));
		}
		if ((this.paramIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PARAM_VALUE].[PARAM_ID] >= " 
						+ (this.paramIdBegin + ")")));
		}
		if ((this.paramIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PARAM_VALUE].[PARAM_ID] < " 
						+ (this.paramIdEnd + ") ")));
		}
		if ((this.paramIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PARAM_VALUE].[PARAM_ID] <= " 
						+ (this.paramIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.testValue)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TEST_PARAM_VALUE].[TEST_VALUE]", this.testValue)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.testValueEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TEST_PARAM_VALUE].[TEST_VALUE] = " + SqlServerUtils.safeSql(this.testValueEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.testValueDesc)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TEST_PARAM_VALUE].[TEST_VALUE_DESC]", this.testValueDesc)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.testValueDescEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TEST_PARAM_VALUE].[TEST_VALUE_DESC] = " + SqlServerUtils.safeSql(this.testValueDescEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub0)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TEST_PARAM_VALUE].[PUB0]", this.pub0)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub0Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TEST_PARAM_VALUE].[PUB0] = " + SqlServerUtils.safeSql(this.pub0Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub1)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TEST_PARAM_VALUE].[PUB1]", this.pub1)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub1Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TEST_PARAM_VALUE].[PUB1] = " + SqlServerUtils.safeSql(this.pub1Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub2)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TEST_PARAM_VALUE].[PUB2]", this.pub2)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub2Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TEST_PARAM_VALUE].[PUB2] = " + SqlServerUtils.safeSql(this.pub2Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub3)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TEST_PARAM_VALUE].[PUB3]", this.pub3)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub3Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TEST_PARAM_VALUE].[PUB3] = " + SqlServerUtils.safeSql(this.pub3Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub4)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TEST_PARAM_VALUE].[PUB4]", this.pub4)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub4Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TEST_PARAM_VALUE].[PUB4] = " + SqlServerUtils.safeSql(this.pub4Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub5)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TEST_PARAM_VALUE].[PUB5]", this.pub5)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub5Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TEST_PARAM_VALUE].[PUB5] = " + SqlServerUtils.safeSql(this.pub5Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
