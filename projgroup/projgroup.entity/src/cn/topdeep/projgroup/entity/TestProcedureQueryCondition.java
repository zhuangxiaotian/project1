package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_TEST_PROCEDURE查询条件定义
 */
public class TestProcedureQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,FUNC_PROCEDURE_ID: 函数过程标识
	 */
	Integer funcProcedureId;
	
	/**
	 * 查询条件开始值,FUNC_PROCEDURE_ID: 函数过程标识
	 */
	Integer funcProcedureIdBegin;
	
	/**
	 * 查询条件结束值,FUNC_PROCEDURE_ID: 函数过程标识
	 */
	Integer funcProcedureIdEnd;
	
	/**
	 * 查询条件结束值,FUNC_PROCEDURE_ID: 函数过程标识
	 */
	Integer funcProcedureIdEndEqual;
	
	/**
	 * 查询条件,TEST_ORDER: 测试顺序
	 */
	Integer testOrder;
	
	/**
	 * 查询条件开始值,TEST_ORDER: 测试顺序
	 */
	Integer testOrderBegin;
	
	/**
	 * 查询条件结束值,TEST_ORDER: 测试顺序
	 */
	Integer testOrderEnd;
	
	/**
	 * 查询条件结束值,TEST_ORDER: 测试顺序
	 */
	Integer testOrderEndEqual;
	
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
	 * FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public Integer getFuncProcedureId() {
		return this.funcProcedureId;
	}
	
	/**
	 * FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public void setFuncProcedureId(Integer value)
	 {
		this.funcProcedureId = value;
	}
	
	/**
	 * 查询条件开始值,FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public Integer getFuncProcedureIdBegin() {
		return this.funcProcedureIdBegin;
	}
	
	/**
	 * 查询条件开始值,FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public void setFuncProcedureIdBegin(Integer value)
	 {
		this.funcProcedureIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public Integer getFuncProcedureIdEnd() {
		return this.funcProcedureIdEnd;
	}
	
	/**
	 * 查询条件结束值,FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public void setFuncProcedureIdEnd(Integer value)
	 {
		this.funcProcedureIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public Integer getFuncProcedureIdEndEqual() {
		return this.funcProcedureIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public void setFuncProcedureIdEndEqual(Integer value)
	 {
		this.funcProcedureIdEndEqual = value;
	}
	
	/**
	 * TEST_ORDER: 测试顺序
	 */
	public Integer getTestOrder() {
		return this.testOrder;
	}
	
	/**
	 * TEST_ORDER: 测试顺序
	 */
	public void setTestOrder(Integer value)
	 {
		this.testOrder = value;
	}
	
	/**
	 * 查询条件开始值,TEST_ORDER: 测试顺序
	 */
	public Integer getTestOrderBegin() {
		return this.testOrderBegin;
	}
	
	/**
	 * 查询条件开始值,TEST_ORDER: 测试顺序
	 */
	public void setTestOrderBegin(Integer value)
	 {
		this.testOrderBegin = value;
	}
	
	/**
	 * 查询条件结束值,TEST_ORDER: 测试顺序
	 */
	public Integer getTestOrderEnd() {
		return this.testOrderEnd;
	}
	
	/**
	 * 查询条件结束值,TEST_ORDER: 测试顺序
	 */
	public void setTestOrderEnd(Integer value)
	 {
		this.testOrderEnd = value;
	}
	
	/**
	 * 查询条件结束值,TEST_ORDER: 测试顺序
	 */
	public Integer getTestOrderEndEqual() {
		return this.testOrderEndEqual;
	}
	
	/**
	 * 查询条件结束值,TEST_ORDER: 测试顺序
	 */
	public void setTestOrderEndEqual(Integer value)
	 {
		this.testOrderEndEqual = value;
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
	public TestProcedureQueryCondition setTestProcedureIdCondition(Integer value) {
		this.testProcedureId = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEST_PROCEDURE_ID: 测试过程标识
	 */
	public TestProcedureQueryCondition setTestProcedureIdConditionBegin(Integer value) {
		this.testProcedureIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEST_PROCEDURE_ID: 测试过程标识
	 */
	public TestProcedureQueryCondition setTestProcedureIdConditionEnd(Integer value) {
		this.testProcedureIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEST_PROCEDURE_ID: 测试过程标识
	 */
	public TestProcedureQueryCondition setTestProcedureIdConditionEndEqual(Integer value) {
		this.testProcedureIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public TestProcedureQueryCondition setBuildIdCondition(Integer value) {
		this.buildId = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public TestProcedureQueryCondition setBuildIdConditionBegin(Integer value) {
		this.buildIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public TestProcedureQueryCondition setBuildIdConditionEnd(Integer value) {
		this.buildIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public TestProcedureQueryCondition setBuildIdConditionEndEqual(Integer value) {
		this.buildIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public TestProcedureQueryCondition setFuncProcedureIdCondition(Integer value) {
		this.funcProcedureId = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public TestProcedureQueryCondition setFuncProcedureIdConditionBegin(Integer value) {
		this.funcProcedureIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public TestProcedureQueryCondition setFuncProcedureIdConditionEnd(Integer value) {
		this.funcProcedureIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public TestProcedureQueryCondition setFuncProcedureIdConditionEndEqual(Integer value) {
		this.funcProcedureIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEST_ORDER: 测试顺序
	 */
	public TestProcedureQueryCondition setTestOrderCondition(Integer value) {
		this.testOrder = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEST_ORDER: 测试顺序
	 */
	public TestProcedureQueryCondition setTestOrderConditionBegin(Integer value) {
		this.testOrderBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEST_ORDER: 测试顺序
	 */
	public TestProcedureQueryCondition setTestOrderConditionEnd(Integer value) {
		this.testOrderEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEST_ORDER: 测试顺序
	 */
	public TestProcedureQueryCondition setTestOrderConditionEndEqual(Integer value) {
		this.testOrderEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB0: 备用字段1
	 */
	public TestProcedureQueryCondition setPub0Condition(String value) {
		this.pub0 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB0: 备用字段1
	 */
	public TestProcedureQueryCondition setPub0ConditionEqual(String value) {
		this.pub0Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB1: 备用字段2
	 */
	public TestProcedureQueryCondition setPub1Condition(String value) {
		this.pub1 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB1: 备用字段2
	 */
	public TestProcedureQueryCondition setPub1ConditionEqual(String value) {
		this.pub1Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB2: 备用字段3
	 */
	public TestProcedureQueryCondition setPub2Condition(String value) {
		this.pub2 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB2: 备用字段3
	 */
	public TestProcedureQueryCondition setPub2ConditionEqual(String value) {
		this.pub2Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB3: 备用字段4
	 */
	public TestProcedureQueryCondition setPub3Condition(String value) {
		this.pub3 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB3: 备用字段4
	 */
	public TestProcedureQueryCondition setPub3ConditionEqual(String value) {
		this.pub3Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB4: 备用字段5
	 */
	public TestProcedureQueryCondition setPub4Condition(String value) {
		this.pub4 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB4: 备用字段5
	 */
	public TestProcedureQueryCondition setPub4ConditionEqual(String value) {
		this.pub4Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB5: 备用字段6
	 */
	public TestProcedureQueryCondition setPub5Condition(String value) {
		this.pub5 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB5: 备用字段6
	 */
	public TestProcedureQueryCondition setPub5ConditionEqual(String value) {
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
						+ ((" and ([T_TEST_PROCEDURE].[TEST_PROCEDURE_ID] = " + this.testProcedureId) 
						+ ") "));
		}
		if ((this.testProcedureIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PROCEDURE].[TEST_PROCEDURE_ID] >= " 
						+ (this.testProcedureIdBegin + ")")));
		}
		if ((this.testProcedureIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PROCEDURE].[TEST_PROCEDURE_ID] < " 
						+ (this.testProcedureIdEnd + ") ")));
		}
		if ((this.testProcedureIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PROCEDURE].[TEST_PROCEDURE_ID] <= " 
						+ (this.testProcedureIdEndEqual + ") ")));
		}
		if ((this.buildId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TEST_PROCEDURE].[BUILD_ID] = " + this.buildId) 
						+ ") "));
		}
		if ((this.buildIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PROCEDURE].[BUILD_ID] >= " 
						+ (this.buildIdBegin + ")")));
		}
		if ((this.buildIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PROCEDURE].[BUILD_ID] < " 
						+ (this.buildIdEnd + ") ")));
		}
		if ((this.buildIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PROCEDURE].[BUILD_ID] <= " 
						+ (this.buildIdEndEqual + ") ")));
		}
		if ((this.funcProcedureId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TEST_PROCEDURE].[FUNC_PROCEDURE_ID] = " + this.funcProcedureId) 
						+ ") "));
		}
		if ((this.funcProcedureIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PROCEDURE].[FUNC_PROCEDURE_ID] >= " 
						+ (this.funcProcedureIdBegin + ")")));
		}
		if ((this.funcProcedureIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PROCEDURE].[FUNC_PROCEDURE_ID] < " 
						+ (this.funcProcedureIdEnd + ") ")));
		}
		if ((this.funcProcedureIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PROCEDURE].[FUNC_PROCEDURE_ID] <= " 
						+ (this.funcProcedureIdEndEqual + ") ")));
		}
		if ((this.testOrder == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TEST_PROCEDURE].[TEST_ORDER] = " + this.testOrder) 
						+ ") "));
		}
		if ((this.testOrderBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PROCEDURE].[TEST_ORDER] >= " 
						+ (this.testOrderBegin + ")")));
		}
		if ((this.testOrderEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PROCEDURE].[TEST_ORDER] < " 
						+ (this.testOrderEnd + ") ")));
		}
		if ((this.testOrderEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PROCEDURE].[TEST_ORDER] <= " 
						+ (this.testOrderEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.pub0)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TEST_PROCEDURE].[PUB0]", this.pub0)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub0Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TEST_PROCEDURE].[PUB0] = " + SqlServerUtils.safeSql(this.pub0Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub1)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TEST_PROCEDURE].[PUB1]", this.pub1)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub1Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TEST_PROCEDURE].[PUB1] = " + SqlServerUtils.safeSql(this.pub1Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub2)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TEST_PROCEDURE].[PUB2]", this.pub2)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub2Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TEST_PROCEDURE].[PUB2] = " + SqlServerUtils.safeSql(this.pub2Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub3)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TEST_PROCEDURE].[PUB3]", this.pub3)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub3Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TEST_PROCEDURE].[PUB3] = " + SqlServerUtils.safeSql(this.pub3Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub4)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TEST_PROCEDURE].[PUB4]", this.pub4)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub4Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TEST_PROCEDURE].[PUB4] = " + SqlServerUtils.safeSql(this.pub4Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub5)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_TEST_PROCEDURE].[PUB5]", this.pub5)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub5Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_TEST_PROCEDURE].[PUB5] = " + SqlServerUtils.safeSql(this.pub5Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
