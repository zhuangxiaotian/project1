package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_FUNC_PROCEDURE查询条件定义
 */
public class FuncProcedureQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,PROC_CODE: 函数代码
	 */
	String procCode;
	
	/**
	 * 查询条件字符串相等,PROC_CODE: 函数代码
	 */
	String procCodeEqual;
	
	/**
	 * 查询条件,PROC_NAME: 函数名称
	 */
	String procName;
	
	/**
	 * 查询条件字符串相等,PROC_NAME: 函数名称
	 */
	String procNameEqual;
	
	/**
	 * 查询条件,PROC_COMMENT: 函数描述
	 */
	String procComment;
	
	/**
	 * 查询条件字符串相等,PROC_COMMENT: 函数描述
	 */
	String procCommentEqual;
	
	/**
	 * 查询条件,PROC_VERSION: 函数版本
	 */
	String procVersion;
	
	/**
	 * 查询条件字符串相等,PROC_VERSION: 函数版本
	 */
	String procVersionEqual;
	
	/**
	 * 查询条件,FUNC_CODE: 函数代码
	 */
	String funcCode;
	
	/**
	 * 查询条件字符串相等,FUNC_CODE: 函数代码
	 */
	String funcCodeEqual;
	
	/**
	 * 查询条件,CACHE_TIME: 缓存时间
	 */
	Integer cacheTime;
	
	/**
	 * 查询条件开始值,CACHE_TIME: 缓存时间
	 */
	Integer cacheTimeBegin;
	
	/**
	 * 查询条件结束值,CACHE_TIME: 缓存时间
	 */
	Integer cacheTimeEnd;
	
	/**
	 * 查询条件结束值,CACHE_TIME: 缓存时间
	 */
	Integer cacheTimeEndEqual;
	
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
	 * 查询条件,PROC_TYPE: 过程类型，0通用参数过程1普通过程
	 */
	Integer procType;
	
	/**
	 * 查询条件开始值,PROC_TYPE: 过程类型，0通用参数过程1普通过程
	 */
	Integer procTypeBegin;
	
	/**
	 * 查询条件结束值,PROC_TYPE: 过程类型，0通用参数过程1普通过程
	 */
	Integer procTypeEnd;
	
	/**
	 * 查询条件结束值,PROC_TYPE: 过程类型，0通用参数过程1普通过程
	 */
	Integer procTypeEndEqual;
	
	/**
	 * 查询条件,FUNC_CATEGORY: 函数分类
	 */
	String funcCategory;
	
	/**
	 * 查询条件字符串相等,FUNC_CATEGORY: 函数分类
	 */
	String funcCategoryEqual;
	
	/**
	 * 查询条件,FUNC_INPUT_INTERFACE: 输入参数接口
	 */
	String funcInputInterface;
	
	/**
	 * 查询条件字符串相等,FUNC_INPUT_INTERFACE: 输入参数接口
	 */
	String funcInputInterfaceEqual;
	
	/**
	 * 查询条件,FUNC_OUTPUT_INTERFACE: 输出参数接口
	 */
	String funcOutputInterface;
	
	/**
	 * 查询条件字符串相等,FUNC_OUTPUT_INTERFACE: 输出参数接口
	 */
	String funcOutputInterfaceEqual;
	
	/**
	 * 查询条件,ORDER_FIELD: 
	 */
	Integer orderField;
	
	/**
	 * 查询条件开始值,ORDER_FIELD: 
	 */
	Integer orderFieldBegin;
	
	/**
	 * 查询条件结束值,ORDER_FIELD: 
	 */
	Integer orderFieldEnd;
	
	/**
	 * 查询条件结束值,ORDER_FIELD: 
	 */
	Integer orderFieldEndEqual;
	
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
	 * PROC_CODE: 函数代码
	 */
	public String getProcCode() {
		return this.procCode;
	}
	
	/**
	 * PROC_CODE: 函数代码
	 */
	public void setProcCode(String value)
	 {
		this.procCode = value;
	}
	
	/**
	 * 查询条件字符串相等,PROC_CODE: 函数代码
	 */
	public String getProcCodeEqual() {
		return this.procCodeEqual;
	}
	
	/**
	 * 查询条件字符串相等,PROC_CODE: 函数代码
	 */
	public void setProcCodeEqual(String value)
	 {
		this.procCodeEqual = value;
	}
	
	/**
	 * PROC_NAME: 函数名称
	 */
	public String getProcName() {
		return this.procName;
	}
	
	/**
	 * PROC_NAME: 函数名称
	 */
	public void setProcName(String value)
	 {
		this.procName = value;
	}
	
	/**
	 * 查询条件字符串相等,PROC_NAME: 函数名称
	 */
	public String getProcNameEqual() {
		return this.procNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,PROC_NAME: 函数名称
	 */
	public void setProcNameEqual(String value)
	 {
		this.procNameEqual = value;
	}
	
	/**
	 * PROC_COMMENT: 函数描述
	 */
	public String getProcComment() {
		return this.procComment;
	}
	
	/**
	 * PROC_COMMENT: 函数描述
	 */
	public void setProcComment(String value)
	 {
		this.procComment = value;
	}
	
	/**
	 * 查询条件字符串相等,PROC_COMMENT: 函数描述
	 */
	public String getProcCommentEqual() {
		return this.procCommentEqual;
	}
	
	/**
	 * 查询条件字符串相等,PROC_COMMENT: 函数描述
	 */
	public void setProcCommentEqual(String value)
	 {
		this.procCommentEqual = value;
	}
	
	/**
	 * PROC_VERSION: 函数版本
	 */
	public String getProcVersion() {
		return this.procVersion;
	}
	
	/**
	 * PROC_VERSION: 函数版本
	 */
	public void setProcVersion(String value)
	 {
		this.procVersion = value;
	}
	
	/**
	 * 查询条件字符串相等,PROC_VERSION: 函数版本
	 */
	public String getProcVersionEqual() {
		return this.procVersionEqual;
	}
	
	/**
	 * 查询条件字符串相等,PROC_VERSION: 函数版本
	 */
	public void setProcVersionEqual(String value)
	 {
		this.procVersionEqual = value;
	}
	
	/**
	 * FUNC_CODE: 函数代码
	 */
	public String getFuncCode() {
		return this.funcCode;
	}
	
	/**
	 * FUNC_CODE: 函数代码
	 */
	public void setFuncCode(String value)
	 {
		this.funcCode = value;
	}
	
	/**
	 * 查询条件字符串相等,FUNC_CODE: 函数代码
	 */
	public String getFuncCodeEqual() {
		return this.funcCodeEqual;
	}
	
	/**
	 * 查询条件字符串相等,FUNC_CODE: 函数代码
	 */
	public void setFuncCodeEqual(String value)
	 {
		this.funcCodeEqual = value;
	}
	
	/**
	 * CACHE_TIME: 缓存时间
	 */
	public Integer getCacheTime() {
		return this.cacheTime;
	}
	
	/**
	 * CACHE_TIME: 缓存时间
	 */
	public void setCacheTime(Integer value)
	 {
		this.cacheTime = value;
	}
	
	/**
	 * 查询条件开始值,CACHE_TIME: 缓存时间
	 */
	public Integer getCacheTimeBegin() {
		return this.cacheTimeBegin;
	}
	
	/**
	 * 查询条件开始值,CACHE_TIME: 缓存时间
	 */
	public void setCacheTimeBegin(Integer value)
	 {
		this.cacheTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,CACHE_TIME: 缓存时间
	 */
	public Integer getCacheTimeEnd() {
		return this.cacheTimeEnd;
	}
	
	/**
	 * 查询条件结束值,CACHE_TIME: 缓存时间
	 */
	public void setCacheTimeEnd(Integer value)
	 {
		this.cacheTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,CACHE_TIME: 缓存时间
	 */
	public Integer getCacheTimeEndEqual() {
		return this.cacheTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,CACHE_TIME: 缓存时间
	 */
	public void setCacheTimeEndEqual(Integer value)
	 {
		this.cacheTimeEndEqual = value;
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
	 * PROC_TYPE: 过程类型，0通用参数过程1普通过程
	 */
	public Integer getProcType() {
		return this.procType;
	}
	
	/**
	 * PROC_TYPE: 过程类型，0通用参数过程1普通过程
	 */
	public void setProcType(Integer value)
	 {
		this.procType = value;
	}
	
	/**
	 * 查询条件开始值,PROC_TYPE: 过程类型，0通用参数过程1普通过程
	 */
	public Integer getProcTypeBegin() {
		return this.procTypeBegin;
	}
	
	/**
	 * 查询条件开始值,PROC_TYPE: 过程类型，0通用参数过程1普通过程
	 */
	public void setProcTypeBegin(Integer value)
	 {
		this.procTypeBegin = value;
	}
	
	/**
	 * 查询条件结束值,PROC_TYPE: 过程类型，0通用参数过程1普通过程
	 */
	public Integer getProcTypeEnd() {
		return this.procTypeEnd;
	}
	
	/**
	 * 查询条件结束值,PROC_TYPE: 过程类型，0通用参数过程1普通过程
	 */
	public void setProcTypeEnd(Integer value)
	 {
		this.procTypeEnd = value;
	}
	
	/**
	 * 查询条件结束值,PROC_TYPE: 过程类型，0通用参数过程1普通过程
	 */
	public Integer getProcTypeEndEqual() {
		return this.procTypeEndEqual;
	}
	
	/**
	 * 查询条件结束值,PROC_TYPE: 过程类型，0通用参数过程1普通过程
	 */
	public void setProcTypeEndEqual(Integer value)
	 {
		this.procTypeEndEqual = value;
	}
	
	/**
	 * FUNC_CATEGORY: 函数分类
	 */
	public String getFuncCategory() {
		return this.funcCategory;
	}
	
	/**
	 * FUNC_CATEGORY: 函数分类
	 */
	public void setFuncCategory(String value)
	 {
		this.funcCategory = value;
	}
	
	/**
	 * 查询条件字符串相等,FUNC_CATEGORY: 函数分类
	 */
	public String getFuncCategoryEqual() {
		return this.funcCategoryEqual;
	}
	
	/**
	 * 查询条件字符串相等,FUNC_CATEGORY: 函数分类
	 */
	public void setFuncCategoryEqual(String value)
	 {
		this.funcCategoryEqual = value;
	}
	
	/**
	 * FUNC_INPUT_INTERFACE: 输入参数接口
	 */
	public String getFuncInputInterface() {
		return this.funcInputInterface;
	}
	
	/**
	 * FUNC_INPUT_INTERFACE: 输入参数接口
	 */
	public void setFuncInputInterface(String value)
	 {
		this.funcInputInterface = value;
	}
	
	/**
	 * 查询条件字符串相等,FUNC_INPUT_INTERFACE: 输入参数接口
	 */
	public String getFuncInputInterfaceEqual() {
		return this.funcInputInterfaceEqual;
	}
	
	/**
	 * 查询条件字符串相等,FUNC_INPUT_INTERFACE: 输入参数接口
	 */
	public void setFuncInputInterfaceEqual(String value)
	 {
		this.funcInputInterfaceEqual = value;
	}
	
	/**
	 * FUNC_OUTPUT_INTERFACE: 输出参数接口
	 */
	public String getFuncOutputInterface() {
		return this.funcOutputInterface;
	}
	
	/**
	 * FUNC_OUTPUT_INTERFACE: 输出参数接口
	 */
	public void setFuncOutputInterface(String value)
	 {
		this.funcOutputInterface = value;
	}
	
	/**
	 * 查询条件字符串相等,FUNC_OUTPUT_INTERFACE: 输出参数接口
	 */
	public String getFuncOutputInterfaceEqual() {
		return this.funcOutputInterfaceEqual;
	}
	
	/**
	 * 查询条件字符串相等,FUNC_OUTPUT_INTERFACE: 输出参数接口
	 */
	public void setFuncOutputInterfaceEqual(String value)
	 {
		this.funcOutputInterfaceEqual = value;
	}
	
	/**
	 * ORDER_FIELD: 
	 */
	public Integer getOrderField() {
		return this.orderField;
	}
	
	/**
	 * ORDER_FIELD: 
	 */
	public void setOrderField(Integer value)
	 {
		this.orderField = value;
	}
	
	/**
	 * 查询条件开始值,ORDER_FIELD: 
	 */
	public Integer getOrderFieldBegin() {
		return this.orderFieldBegin;
	}
	
	/**
	 * 查询条件开始值,ORDER_FIELD: 
	 */
	public void setOrderFieldBegin(Integer value)
	 {
		this.orderFieldBegin = value;
	}
	
	/**
	 * 查询条件结束值,ORDER_FIELD: 
	 */
	public Integer getOrderFieldEnd() {
		return this.orderFieldEnd;
	}
	
	/**
	 * 查询条件结束值,ORDER_FIELD: 
	 */
	public void setOrderFieldEnd(Integer value)
	 {
		this.orderFieldEnd = value;
	}
	
	/**
	 * 查询条件结束值,ORDER_FIELD: 
	 */
	public Integer getOrderFieldEndEqual() {
		return this.orderFieldEndEqual;
	}
	
	/**
	 * 查询条件结束值,ORDER_FIELD: 
	 */
	public void setOrderFieldEndEqual(Integer value)
	 {
		this.orderFieldEndEqual = value;
	}
	
	/**
	 * 设置查询条件FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public FuncProcedureQueryCondition setFuncProcedureIdCondition(Integer value) {
		this.funcProcedureId = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public FuncProcedureQueryCondition setFuncProcedureIdConditionBegin(Integer value) {
		this.funcProcedureIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public FuncProcedureQueryCondition setFuncProcedureIdConditionEnd(Integer value) {
		this.funcProcedureIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public FuncProcedureQueryCondition setFuncProcedureIdConditionEndEqual(Integer value) {
		this.funcProcedureIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROJECT_ID: 函数项目标识
	 */
	public FuncProcedureQueryCondition setFuncProjectIdCondition(Integer value) {
		this.funcProjectId = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROJECT_ID: 函数项目标识
	 */
	public FuncProcedureQueryCondition setFuncProjectIdConditionBegin(Integer value) {
		this.funcProjectIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROJECT_ID: 函数项目标识
	 */
	public FuncProcedureQueryCondition setFuncProjectIdConditionEnd(Integer value) {
		this.funcProjectIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROJECT_ID: 函数项目标识
	 */
	public FuncProcedureQueryCondition setFuncProjectIdConditionEndEqual(Integer value) {
		this.funcProjectIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROC_CODE: 函数代码
	 */
	public FuncProcedureQueryCondition setProcCodeCondition(String value) {
		this.procCode = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROC_CODE: 函数代码
	 */
	public FuncProcedureQueryCondition setProcCodeConditionEqual(String value) {
		this.procCodeEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROC_NAME: 函数名称
	 */
	public FuncProcedureQueryCondition setProcNameCondition(String value) {
		this.procName = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROC_NAME: 函数名称
	 */
	public FuncProcedureQueryCondition setProcNameConditionEqual(String value) {
		this.procNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROC_COMMENT: 函数描述
	 */
	public FuncProcedureQueryCondition setProcCommentCondition(String value) {
		this.procComment = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROC_COMMENT: 函数描述
	 */
	public FuncProcedureQueryCondition setProcCommentConditionEqual(String value) {
		this.procCommentEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROC_VERSION: 函数版本
	 */
	public FuncProcedureQueryCondition setProcVersionCondition(String value) {
		this.procVersion = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROC_VERSION: 函数版本
	 */
	public FuncProcedureQueryCondition setProcVersionConditionEqual(String value) {
		this.procVersionEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_CODE: 函数代码
	 */
	public FuncProcedureQueryCondition setFuncCodeCondition(String value) {
		this.funcCode = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_CODE: 函数代码
	 */
	public FuncProcedureQueryCondition setFuncCodeConditionEqual(String value) {
		this.funcCodeEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CACHE_TIME: 缓存时间
	 */
	public FuncProcedureQueryCondition setCacheTimeCondition(Integer value) {
		this.cacheTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件CACHE_TIME: 缓存时间
	 */
	public FuncProcedureQueryCondition setCacheTimeConditionBegin(Integer value) {
		this.cacheTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CACHE_TIME: 缓存时间
	 */
	public FuncProcedureQueryCondition setCacheTimeConditionEnd(Integer value) {
		this.cacheTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CACHE_TIME: 缓存时间
	 */
	public FuncProcedureQueryCondition setCacheTimeConditionEndEqual(Integer value) {
		this.cacheTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB0: 备用字段1
	 */
	public FuncProcedureQueryCondition setPub0Condition(String value) {
		this.pub0 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB0: 备用字段1
	 */
	public FuncProcedureQueryCondition setPub0ConditionEqual(String value) {
		this.pub0Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB1: 备用字段2
	 */
	public FuncProcedureQueryCondition setPub1Condition(String value) {
		this.pub1 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB1: 备用字段2
	 */
	public FuncProcedureQueryCondition setPub1ConditionEqual(String value) {
		this.pub1Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB2: 备用字段3
	 */
	public FuncProcedureQueryCondition setPub2Condition(String value) {
		this.pub2 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB2: 备用字段3
	 */
	public FuncProcedureQueryCondition setPub2ConditionEqual(String value) {
		this.pub2Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB3: 备用字段4
	 */
	public FuncProcedureQueryCondition setPub3Condition(String value) {
		this.pub3 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB3: 备用字段4
	 */
	public FuncProcedureQueryCondition setPub3ConditionEqual(String value) {
		this.pub3Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB4: 备用字段5
	 */
	public FuncProcedureQueryCondition setPub4Condition(String value) {
		this.pub4 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB4: 备用字段5
	 */
	public FuncProcedureQueryCondition setPub4ConditionEqual(String value) {
		this.pub4Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB5: 备用字段6
	 */
	public FuncProcedureQueryCondition setPub5Condition(String value) {
		this.pub5 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB5: 备用字段6
	 */
	public FuncProcedureQueryCondition setPub5ConditionEqual(String value) {
		this.pub5Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROC_TYPE: 过程类型，0通用参数过程1普通过程
	 */
	public FuncProcedureQueryCondition setProcTypeCondition(Integer value) {
		this.procType = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROC_TYPE: 过程类型，0通用参数过程1普通过程
	 */
	public FuncProcedureQueryCondition setProcTypeConditionBegin(Integer value) {
		this.procTypeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROC_TYPE: 过程类型，0通用参数过程1普通过程
	 */
	public FuncProcedureQueryCondition setProcTypeConditionEnd(Integer value) {
		this.procTypeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROC_TYPE: 过程类型，0通用参数过程1普通过程
	 */
	public FuncProcedureQueryCondition setProcTypeConditionEndEqual(Integer value) {
		this.procTypeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_CATEGORY: 函数分类
	 */
	public FuncProcedureQueryCondition setFuncCategoryCondition(String value) {
		this.funcCategory = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_CATEGORY: 函数分类
	 */
	public FuncProcedureQueryCondition setFuncCategoryConditionEqual(String value) {
		this.funcCategoryEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_INPUT_INTERFACE: 输入参数接口
	 */
	public FuncProcedureQueryCondition setFuncInputInterfaceCondition(String value) {
		this.funcInputInterface = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_INPUT_INTERFACE: 输入参数接口
	 */
	public FuncProcedureQueryCondition setFuncInputInterfaceConditionEqual(String value) {
		this.funcInputInterfaceEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_OUTPUT_INTERFACE: 输出参数接口
	 */
	public FuncProcedureQueryCondition setFuncOutputInterfaceCondition(String value) {
		this.funcOutputInterface = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_OUTPUT_INTERFACE: 输出参数接口
	 */
	public FuncProcedureQueryCondition setFuncOutputInterfaceConditionEqual(String value) {
		this.funcOutputInterfaceEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ORDER_FIELD: 
	 */
	public FuncProcedureQueryCondition setOrderFieldCondition(Integer value) {
		this.orderField = value;
		return this;
	}
	
	/**
	 * 设置查询条件ORDER_FIELD: 
	 */
	public FuncProcedureQueryCondition setOrderFieldConditionBegin(Integer value) {
		this.orderFieldBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ORDER_FIELD: 
	 */
	public FuncProcedureQueryCondition setOrderFieldConditionEnd(Integer value) {
		this.orderFieldEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ORDER_FIELD: 
	 */
	public FuncProcedureQueryCondition setOrderFieldConditionEndEqual(Integer value) {
		this.orderFieldEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.funcProcedureId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_FUNC_PROCEDURE].[FUNC_PROCEDURE_ID] = " + this.funcProcedureId) 
						+ ") "));
		}
		if ((this.funcProcedureIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PROCEDURE].[FUNC_PROCEDURE_ID] >= " 
						+ (this.funcProcedureIdBegin + ")")));
		}
		if ((this.funcProcedureIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PROCEDURE].[FUNC_PROCEDURE_ID] < " 
						+ (this.funcProcedureIdEnd + ") ")));
		}
		if ((this.funcProcedureIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PROCEDURE].[FUNC_PROCEDURE_ID] <= " 
						+ (this.funcProcedureIdEndEqual + ") ")));
		}
		if ((this.funcProjectId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_FUNC_PROCEDURE].[FUNC_PROJECT_ID] = " + this.funcProjectId) 
						+ ") "));
		}
		if ((this.funcProjectIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PROCEDURE].[FUNC_PROJECT_ID] >= " 
						+ (this.funcProjectIdBegin + ")")));
		}
		if ((this.funcProjectIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PROCEDURE].[FUNC_PROJECT_ID] < " 
						+ (this.funcProjectIdEnd + ") ")));
		}
		if ((this.funcProjectIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PROCEDURE].[FUNC_PROJECT_ID] <= " 
						+ (this.funcProjectIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.procCode)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROCEDURE].[PROC_CODE]", this.procCode)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.procCodeEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROCEDURE].[PROC_CODE] = " + SqlServerUtils.safeSql(this.procCodeEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.procName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROCEDURE].[PROC_NAME]", this.procName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.procNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROCEDURE].[PROC_NAME] = " + SqlServerUtils.safeSql(this.procNameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.procComment)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROCEDURE].[PROC_COMMENT]", this.procComment)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.procCommentEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROCEDURE].[PROC_COMMENT] = " + SqlServerUtils.safeSql(this.procCommentEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.procVersion)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROCEDURE].[PROC_VERSION]", this.procVersion)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.procVersionEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROCEDURE].[PROC_VERSION] = " + SqlServerUtils.safeSql(this.procVersionEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.funcCode)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROCEDURE].[FUNC_CODE]", this.funcCode)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.funcCodeEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROCEDURE].[FUNC_CODE] = " + SqlServerUtils.safeSql(this.funcCodeEqual))) 
						+ ") "));
		}
		if ((this.cacheTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_FUNC_PROCEDURE].[CACHE_TIME] = " + this.cacheTime) 
						+ ") "));
		}
		if ((this.cacheTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PROCEDURE].[CACHE_TIME] >= " 
						+ (this.cacheTimeBegin + ")")));
		}
		if ((this.cacheTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PROCEDURE].[CACHE_TIME] < " 
						+ (this.cacheTimeEnd + ") ")));
		}
		if ((this.cacheTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PROCEDURE].[CACHE_TIME] <= " 
						+ (this.cacheTimeEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.pub0)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROCEDURE].[PUB0]", this.pub0)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub0Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROCEDURE].[PUB0] = " + SqlServerUtils.safeSql(this.pub0Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub1)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROCEDURE].[PUB1]", this.pub1)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub1Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROCEDURE].[PUB1] = " + SqlServerUtils.safeSql(this.pub1Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub2)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROCEDURE].[PUB2]", this.pub2)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub2Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROCEDURE].[PUB2] = " + SqlServerUtils.safeSql(this.pub2Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub3)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROCEDURE].[PUB3]", this.pub3)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub3Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROCEDURE].[PUB3] = " + SqlServerUtils.safeSql(this.pub3Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub4)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROCEDURE].[PUB4]", this.pub4)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub4Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROCEDURE].[PUB4] = " + SqlServerUtils.safeSql(this.pub4Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub5)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROCEDURE].[PUB5]", this.pub5)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub5Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROCEDURE].[PUB5] = " + SqlServerUtils.safeSql(this.pub5Equal))) 
						+ ") "));
		}
		if ((this.procType == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_FUNC_PROCEDURE].[PROC_TYPE] = " + this.procType) 
						+ ") "));
		}
		if ((this.procTypeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PROCEDURE].[PROC_TYPE] >= " 
						+ (this.procTypeBegin + ")")));
		}
		if ((this.procTypeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PROCEDURE].[PROC_TYPE] < " 
						+ (this.procTypeEnd + ") ")));
		}
		if ((this.procTypeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PROCEDURE].[PROC_TYPE] <= " 
						+ (this.procTypeEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.funcCategory)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROCEDURE].[FUNC_CATEGORY]", this.funcCategory)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.funcCategoryEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROCEDURE].[FUNC_CATEGORY] = " + SqlServerUtils.safeSql(this.funcCategoryEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.funcInputInterface)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROCEDURE].[FUNC_INPUT_INTERFACE]", this.funcInputInterface)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.funcInputInterfaceEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROCEDURE].[FUNC_INPUT_INTERFACE] = " + SqlServerUtils.safeSql(this.funcInputInterfaceEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.funcOutputInterface)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PROCEDURE].[FUNC_OUTPUT_INTERFACE]", this.funcOutputInterface)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.funcOutputInterfaceEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PROCEDURE].[FUNC_OUTPUT_INTERFACE] = " + SqlServerUtils.safeSql(this.funcOutputInterfaceEqual))) 
						+ ") "));
		}
		if ((this.orderField == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_FUNC_PROCEDURE].[ORDER_FIELD] = " + this.orderField) 
						+ ") "));
		}
		if ((this.orderFieldBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PROCEDURE].[ORDER_FIELD] >= " 
						+ (this.orderFieldBegin + ")")));
		}
		if ((this.orderFieldEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PROCEDURE].[ORDER_FIELD] < " 
						+ (this.orderFieldEnd + ") ")));
		}
		if ((this.orderFieldEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PROCEDURE].[ORDER_FIELD] <= " 
						+ (this.orderFieldEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
