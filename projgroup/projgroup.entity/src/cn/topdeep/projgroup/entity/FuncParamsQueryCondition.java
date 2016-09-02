package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_FUNC_PARAMS查询条件定义
 */
public class FuncParamsQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,PARAM_CODE: 参数代码
	 */
	String paramCode;
	
	/**
	 * 查询条件字符串相等,PARAM_CODE: 参数代码
	 */
	String paramCodeEqual;
	
	/**
	 * 查询条件,PARAM_NAME: 参数名称
	 */
	String paramName;
	
	/**
	 * 查询条件字符串相等,PARAM_NAME: 参数名称
	 */
	String paramNameEqual;
	
	/**
	 * 查询条件,PARAM_DIRECTION: 参数方向,0输入参数1输出参数
	 */
	Integer paramDirection;
	
	/**
	 * 查询条件开始值,PARAM_DIRECTION: 参数方向,0输入参数1输出参数
	 */
	Integer paramDirectionBegin;
	
	/**
	 * 查询条件结束值,PARAM_DIRECTION: 参数方向,0输入参数1输出参数
	 */
	Integer paramDirectionEnd;
	
	/**
	 * 查询条件结束值,PARAM_DIRECTION: 参数方向,0输入参数1输出参数
	 */
	Integer paramDirectionEndEqual;
	
	/**
	 * 查询条件,PARAM_CATEGORY: 参数类型，0普通参数1集合参数
	 */
	Integer paramCategory;
	
	/**
	 * 查询条件开始值,PARAM_CATEGORY: 参数类型，0普通参数1集合参数
	 */
	Integer paramCategoryBegin;
	
	/**
	 * 查询条件结束值,PARAM_CATEGORY: 参数类型，0普通参数1集合参数
	 */
	Integer paramCategoryEnd;
	
	/**
	 * 查询条件结束值,PARAM_CATEGORY: 参数类型，0普通参数1集合参数
	 */
	Integer paramCategoryEndEqual;
	
	/**
	 * 查询条件,PARAM_COMMENT: 参数说明
	 */
	String paramComment;
	
	/**
	 * 查询条件字符串相等,PARAM_COMMENT: 参数说明
	 */
	String paramCommentEqual;
	
	/**
	 * 查询条件,PARENT_PARAM_ID: 父参数标识,0表示没有父参数
	 */
	Integer parentParamId;
	
	/**
	 * 查询条件开始值,PARENT_PARAM_ID: 父参数标识,0表示没有父参数
	 */
	Integer parentParamIdBegin;
	
	/**
	 * 查询条件结束值,PARENT_PARAM_ID: 父参数标识,0表示没有父参数
	 */
	Integer parentParamIdEnd;
	
	/**
	 * 查询条件结束值,PARENT_PARAM_ID: 父参数标识,0表示没有父参数
	 */
	Integer parentParamIdEndEqual;
	
	/**
	 * 查询条件,PARAM_DATA_TYPE: 数据类型
	 */
	String paramDataType;
	
	/**
	 * 查询条件字符串相等,PARAM_DATA_TYPE: 数据类型
	 */
	String paramDataTypeEqual;
	
	/**
	 * 查询条件,PARAM_DATA_LENGTH: 数据类型长度
	 */
	Integer paramDataLength;
	
	/**
	 * 查询条件开始值,PARAM_DATA_LENGTH: 数据类型长度
	 */
	Integer paramDataLengthBegin;
	
	/**
	 * 查询条件结束值,PARAM_DATA_LENGTH: 数据类型长度
	 */
	Integer paramDataLengthEnd;
	
	/**
	 * 查询条件结束值,PARAM_DATA_LENGTH: 数据类型长度
	 */
	Integer paramDataLengthEndEqual;
	
	/**
	 * 查询条件,PARAM_DATA_DECIMAL: 数据类型小数长度
	 */
	Integer paramDataDecimal;
	
	/**
	 * 查询条件开始值,PARAM_DATA_DECIMAL: 数据类型小数长度
	 */
	Integer paramDataDecimalBegin;
	
	/**
	 * 查询条件结束值,PARAM_DATA_DECIMAL: 数据类型小数长度
	 */
	Integer paramDataDecimalEnd;
	
	/**
	 * 查询条件结束值,PARAM_DATA_DECIMAL: 数据类型小数长度
	 */
	Integer paramDataDecimalEndEqual;
	
	/**
	 * 查询条件,PARAM_DATA_NOT_NULL: 数据非空 0允许空 1不允许空
	 */
	Integer paramDataNotNull;
	
	/**
	 * 查询条件开始值,PARAM_DATA_NOT_NULL: 数据非空 0允许空 1不允许空
	 */
	Integer paramDataNotNullBegin;
	
	/**
	 * 查询条件结束值,PARAM_DATA_NOT_NULL: 数据非空 0允许空 1不允许空
	 */
	Integer paramDataNotNullEnd;
	
	/**
	 * 查询条件结束值,PARAM_DATA_NOT_NULL: 数据非空 0允许空 1不允许空
	 */
	Integer paramDataNotNullEndEqual;
	
	/**
	 * 查询条件,PARAM_DATA_DEFAULT_VALUE: 参数默认值
	 */
	String paramDataDefaultValue;
	
	/**
	 * 查询条件字符串相等,PARAM_DATA_DEFAULT_VALUE: 参数默认值
	 */
	String paramDataDefaultValueEqual;
	
	/**
	 * 查询条件,PARAM_ALLOW_MODIFY: 参数允许修改 0 不允许修改 1允许修改
	 */
	Integer paramAllowModify;
	
	/**
	 * 查询条件开始值,PARAM_ALLOW_MODIFY: 参数允许修改 0 不允许修改 1允许修改
	 */
	Integer paramAllowModifyBegin;
	
	/**
	 * 查询条件结束值,PARAM_ALLOW_MODIFY: 参数允许修改 0 不允许修改 1允许修改
	 */
	Integer paramAllowModifyEnd;
	
	/**
	 * 查询条件结束值,PARAM_ALLOW_MODIFY: 参数允许修改 0 不允许修改 1允许修改
	 */
	Integer paramAllowModifyEndEqual;
	
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
	 * 查询条件,IMPL_INTERFACE: 实现接口
	 */
	String implInterface;
	
	/**
	 * 查询条件字符串相等,IMPL_INTERFACE: 实现接口
	 */
	String implInterfaceEqual;
	
	/**
	 * 查询条件,ORDER_FIELD: 排序字段
	 */
	Integer orderField;
	
	/**
	 * 查询条件开始值,ORDER_FIELD: 排序字段
	 */
	Integer orderFieldBegin;
	
	/**
	 * 查询条件结束值,ORDER_FIELD: 排序字段
	 */
	Integer orderFieldEnd;
	
	/**
	 * 查询条件结束值,ORDER_FIELD: 排序字段
	 */
	Integer orderFieldEndEqual;
	
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
	 * PARAM_CODE: 参数代码
	 */
	public String getParamCode() {
		return this.paramCode;
	}
	
	/**
	 * PARAM_CODE: 参数代码
	 */
	public void setParamCode(String value)
	 {
		this.paramCode = value;
	}
	
	/**
	 * 查询条件字符串相等,PARAM_CODE: 参数代码
	 */
	public String getParamCodeEqual() {
		return this.paramCodeEqual;
	}
	
	/**
	 * 查询条件字符串相等,PARAM_CODE: 参数代码
	 */
	public void setParamCodeEqual(String value)
	 {
		this.paramCodeEqual = value;
	}
	
	/**
	 * PARAM_NAME: 参数名称
	 */
	public String getParamName() {
		return this.paramName;
	}
	
	/**
	 * PARAM_NAME: 参数名称
	 */
	public void setParamName(String value)
	 {
		this.paramName = value;
	}
	
	/**
	 * 查询条件字符串相等,PARAM_NAME: 参数名称
	 */
	public String getParamNameEqual() {
		return this.paramNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,PARAM_NAME: 参数名称
	 */
	public void setParamNameEqual(String value)
	 {
		this.paramNameEqual = value;
	}
	
	/**
	 * PARAM_DIRECTION: 参数方向,0输入参数1输出参数
	 */
	public Integer getParamDirection() {
		return this.paramDirection;
	}
	
	/**
	 * PARAM_DIRECTION: 参数方向,0输入参数1输出参数
	 */
	public void setParamDirection(Integer value)
	 {
		this.paramDirection = value;
	}
	
	/**
	 * 查询条件开始值,PARAM_DIRECTION: 参数方向,0输入参数1输出参数
	 */
	public Integer getParamDirectionBegin() {
		return this.paramDirectionBegin;
	}
	
	/**
	 * 查询条件开始值,PARAM_DIRECTION: 参数方向,0输入参数1输出参数
	 */
	public void setParamDirectionBegin(Integer value)
	 {
		this.paramDirectionBegin = value;
	}
	
	/**
	 * 查询条件结束值,PARAM_DIRECTION: 参数方向,0输入参数1输出参数
	 */
	public Integer getParamDirectionEnd() {
		return this.paramDirectionEnd;
	}
	
	/**
	 * 查询条件结束值,PARAM_DIRECTION: 参数方向,0输入参数1输出参数
	 */
	public void setParamDirectionEnd(Integer value)
	 {
		this.paramDirectionEnd = value;
	}
	
	/**
	 * 查询条件结束值,PARAM_DIRECTION: 参数方向,0输入参数1输出参数
	 */
	public Integer getParamDirectionEndEqual() {
		return this.paramDirectionEndEqual;
	}
	
	/**
	 * 查询条件结束值,PARAM_DIRECTION: 参数方向,0输入参数1输出参数
	 */
	public void setParamDirectionEndEqual(Integer value)
	 {
		this.paramDirectionEndEqual = value;
	}
	
	/**
	 * PARAM_CATEGORY: 参数类型，0普通参数1集合参数
	 */
	public Integer getParamCategory() {
		return this.paramCategory;
	}
	
	/**
	 * PARAM_CATEGORY: 参数类型，0普通参数1集合参数
	 */
	public void setParamCategory(Integer value)
	 {
		this.paramCategory = value;
	}
	
	/**
	 * 查询条件开始值,PARAM_CATEGORY: 参数类型，0普通参数1集合参数
	 */
	public Integer getParamCategoryBegin() {
		return this.paramCategoryBegin;
	}
	
	/**
	 * 查询条件开始值,PARAM_CATEGORY: 参数类型，0普通参数1集合参数
	 */
	public void setParamCategoryBegin(Integer value)
	 {
		this.paramCategoryBegin = value;
	}
	
	/**
	 * 查询条件结束值,PARAM_CATEGORY: 参数类型，0普通参数1集合参数
	 */
	public Integer getParamCategoryEnd() {
		return this.paramCategoryEnd;
	}
	
	/**
	 * 查询条件结束值,PARAM_CATEGORY: 参数类型，0普通参数1集合参数
	 */
	public void setParamCategoryEnd(Integer value)
	 {
		this.paramCategoryEnd = value;
	}
	
	/**
	 * 查询条件结束值,PARAM_CATEGORY: 参数类型，0普通参数1集合参数
	 */
	public Integer getParamCategoryEndEqual() {
		return this.paramCategoryEndEqual;
	}
	
	/**
	 * 查询条件结束值,PARAM_CATEGORY: 参数类型，0普通参数1集合参数
	 */
	public void setParamCategoryEndEqual(Integer value)
	 {
		this.paramCategoryEndEqual = value;
	}
	
	/**
	 * PARAM_COMMENT: 参数说明
	 */
	public String getParamComment() {
		return this.paramComment;
	}
	
	/**
	 * PARAM_COMMENT: 参数说明
	 */
	public void setParamComment(String value)
	 {
		this.paramComment = value;
	}
	
	/**
	 * 查询条件字符串相等,PARAM_COMMENT: 参数说明
	 */
	public String getParamCommentEqual() {
		return this.paramCommentEqual;
	}
	
	/**
	 * 查询条件字符串相等,PARAM_COMMENT: 参数说明
	 */
	public void setParamCommentEqual(String value)
	 {
		this.paramCommentEqual = value;
	}
	
	/**
	 * PARENT_PARAM_ID: 父参数标识,0表示没有父参数
	 */
	public Integer getParentParamId() {
		return this.parentParamId;
	}
	
	/**
	 * PARENT_PARAM_ID: 父参数标识,0表示没有父参数
	 */
	public void setParentParamId(Integer value)
	 {
		this.parentParamId = value;
	}
	
	/**
	 * 查询条件开始值,PARENT_PARAM_ID: 父参数标识,0表示没有父参数
	 */
	public Integer getParentParamIdBegin() {
		return this.parentParamIdBegin;
	}
	
	/**
	 * 查询条件开始值,PARENT_PARAM_ID: 父参数标识,0表示没有父参数
	 */
	public void setParentParamIdBegin(Integer value)
	 {
		this.parentParamIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PARENT_PARAM_ID: 父参数标识,0表示没有父参数
	 */
	public Integer getParentParamIdEnd() {
		return this.parentParamIdEnd;
	}
	
	/**
	 * 查询条件结束值,PARENT_PARAM_ID: 父参数标识,0表示没有父参数
	 */
	public void setParentParamIdEnd(Integer value)
	 {
		this.parentParamIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PARENT_PARAM_ID: 父参数标识,0表示没有父参数
	 */
	public Integer getParentParamIdEndEqual() {
		return this.parentParamIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PARENT_PARAM_ID: 父参数标识,0表示没有父参数
	 */
	public void setParentParamIdEndEqual(Integer value)
	 {
		this.parentParamIdEndEqual = value;
	}
	
	/**
	 * PARAM_DATA_TYPE: 数据类型
	 */
	public String getParamDataType() {
		return this.paramDataType;
	}
	
	/**
	 * PARAM_DATA_TYPE: 数据类型
	 */
	public void setParamDataType(String value)
	 {
		this.paramDataType = value;
	}
	
	/**
	 * 查询条件字符串相等,PARAM_DATA_TYPE: 数据类型
	 */
	public String getParamDataTypeEqual() {
		return this.paramDataTypeEqual;
	}
	
	/**
	 * 查询条件字符串相等,PARAM_DATA_TYPE: 数据类型
	 */
	public void setParamDataTypeEqual(String value)
	 {
		this.paramDataTypeEqual = value;
	}
	
	/**
	 * PARAM_DATA_LENGTH: 数据类型长度
	 */
	public Integer getParamDataLength() {
		return this.paramDataLength;
	}
	
	/**
	 * PARAM_DATA_LENGTH: 数据类型长度
	 */
	public void setParamDataLength(Integer value)
	 {
		this.paramDataLength = value;
	}
	
	/**
	 * 查询条件开始值,PARAM_DATA_LENGTH: 数据类型长度
	 */
	public Integer getParamDataLengthBegin() {
		return this.paramDataLengthBegin;
	}
	
	/**
	 * 查询条件开始值,PARAM_DATA_LENGTH: 数据类型长度
	 */
	public void setParamDataLengthBegin(Integer value)
	 {
		this.paramDataLengthBegin = value;
	}
	
	/**
	 * 查询条件结束值,PARAM_DATA_LENGTH: 数据类型长度
	 */
	public Integer getParamDataLengthEnd() {
		return this.paramDataLengthEnd;
	}
	
	/**
	 * 查询条件结束值,PARAM_DATA_LENGTH: 数据类型长度
	 */
	public void setParamDataLengthEnd(Integer value)
	 {
		this.paramDataLengthEnd = value;
	}
	
	/**
	 * 查询条件结束值,PARAM_DATA_LENGTH: 数据类型长度
	 */
	public Integer getParamDataLengthEndEqual() {
		return this.paramDataLengthEndEqual;
	}
	
	/**
	 * 查询条件结束值,PARAM_DATA_LENGTH: 数据类型长度
	 */
	public void setParamDataLengthEndEqual(Integer value)
	 {
		this.paramDataLengthEndEqual = value;
	}
	
	/**
	 * PARAM_DATA_DECIMAL: 数据类型小数长度
	 */
	public Integer getParamDataDecimal() {
		return this.paramDataDecimal;
	}
	
	/**
	 * PARAM_DATA_DECIMAL: 数据类型小数长度
	 */
	public void setParamDataDecimal(Integer value)
	 {
		this.paramDataDecimal = value;
	}
	
	/**
	 * 查询条件开始值,PARAM_DATA_DECIMAL: 数据类型小数长度
	 */
	public Integer getParamDataDecimalBegin() {
		return this.paramDataDecimalBegin;
	}
	
	/**
	 * 查询条件开始值,PARAM_DATA_DECIMAL: 数据类型小数长度
	 */
	public void setParamDataDecimalBegin(Integer value)
	 {
		this.paramDataDecimalBegin = value;
	}
	
	/**
	 * 查询条件结束值,PARAM_DATA_DECIMAL: 数据类型小数长度
	 */
	public Integer getParamDataDecimalEnd() {
		return this.paramDataDecimalEnd;
	}
	
	/**
	 * 查询条件结束值,PARAM_DATA_DECIMAL: 数据类型小数长度
	 */
	public void setParamDataDecimalEnd(Integer value)
	 {
		this.paramDataDecimalEnd = value;
	}
	
	/**
	 * 查询条件结束值,PARAM_DATA_DECIMAL: 数据类型小数长度
	 */
	public Integer getParamDataDecimalEndEqual() {
		return this.paramDataDecimalEndEqual;
	}
	
	/**
	 * 查询条件结束值,PARAM_DATA_DECIMAL: 数据类型小数长度
	 */
	public void setParamDataDecimalEndEqual(Integer value)
	 {
		this.paramDataDecimalEndEqual = value;
	}
	
	/**
	 * PARAM_DATA_NOT_NULL: 数据非空 0允许空 1不允许空
	 */
	public Integer getParamDataNotNull() {
		return this.paramDataNotNull;
	}
	
	/**
	 * PARAM_DATA_NOT_NULL: 数据非空 0允许空 1不允许空
	 */
	public void setParamDataNotNull(Integer value)
	 {
		this.paramDataNotNull = value;
	}
	
	/**
	 * 查询条件开始值,PARAM_DATA_NOT_NULL: 数据非空 0允许空 1不允许空
	 */
	public Integer getParamDataNotNullBegin() {
		return this.paramDataNotNullBegin;
	}
	
	/**
	 * 查询条件开始值,PARAM_DATA_NOT_NULL: 数据非空 0允许空 1不允许空
	 */
	public void setParamDataNotNullBegin(Integer value)
	 {
		this.paramDataNotNullBegin = value;
	}
	
	/**
	 * 查询条件结束值,PARAM_DATA_NOT_NULL: 数据非空 0允许空 1不允许空
	 */
	public Integer getParamDataNotNullEnd() {
		return this.paramDataNotNullEnd;
	}
	
	/**
	 * 查询条件结束值,PARAM_DATA_NOT_NULL: 数据非空 0允许空 1不允许空
	 */
	public void setParamDataNotNullEnd(Integer value)
	 {
		this.paramDataNotNullEnd = value;
	}
	
	/**
	 * 查询条件结束值,PARAM_DATA_NOT_NULL: 数据非空 0允许空 1不允许空
	 */
	public Integer getParamDataNotNullEndEqual() {
		return this.paramDataNotNullEndEqual;
	}
	
	/**
	 * 查询条件结束值,PARAM_DATA_NOT_NULL: 数据非空 0允许空 1不允许空
	 */
	public void setParamDataNotNullEndEqual(Integer value)
	 {
		this.paramDataNotNullEndEqual = value;
	}
	
	/**
	 * PARAM_DATA_DEFAULT_VALUE: 参数默认值
	 */
	public String getParamDataDefaultValue() {
		return this.paramDataDefaultValue;
	}
	
	/**
	 * PARAM_DATA_DEFAULT_VALUE: 参数默认值
	 */
	public void setParamDataDefaultValue(String value)
	 {
		this.paramDataDefaultValue = value;
	}
	
	/**
	 * 查询条件字符串相等,PARAM_DATA_DEFAULT_VALUE: 参数默认值
	 */
	public String getParamDataDefaultValueEqual() {
		return this.paramDataDefaultValueEqual;
	}
	
	/**
	 * 查询条件字符串相等,PARAM_DATA_DEFAULT_VALUE: 参数默认值
	 */
	public void setParamDataDefaultValueEqual(String value)
	 {
		this.paramDataDefaultValueEqual = value;
	}
	
	/**
	 * PARAM_ALLOW_MODIFY: 参数允许修改 0 不允许修改 1允许修改
	 */
	public Integer getParamAllowModify() {
		return this.paramAllowModify;
	}
	
	/**
	 * PARAM_ALLOW_MODIFY: 参数允许修改 0 不允许修改 1允许修改
	 */
	public void setParamAllowModify(Integer value)
	 {
		this.paramAllowModify = value;
	}
	
	/**
	 * 查询条件开始值,PARAM_ALLOW_MODIFY: 参数允许修改 0 不允许修改 1允许修改
	 */
	public Integer getParamAllowModifyBegin() {
		return this.paramAllowModifyBegin;
	}
	
	/**
	 * 查询条件开始值,PARAM_ALLOW_MODIFY: 参数允许修改 0 不允许修改 1允许修改
	 */
	public void setParamAllowModifyBegin(Integer value)
	 {
		this.paramAllowModifyBegin = value;
	}
	
	/**
	 * 查询条件结束值,PARAM_ALLOW_MODIFY: 参数允许修改 0 不允许修改 1允许修改
	 */
	public Integer getParamAllowModifyEnd() {
		return this.paramAllowModifyEnd;
	}
	
	/**
	 * 查询条件结束值,PARAM_ALLOW_MODIFY: 参数允许修改 0 不允许修改 1允许修改
	 */
	public void setParamAllowModifyEnd(Integer value)
	 {
		this.paramAllowModifyEnd = value;
	}
	
	/**
	 * 查询条件结束值,PARAM_ALLOW_MODIFY: 参数允许修改 0 不允许修改 1允许修改
	 */
	public Integer getParamAllowModifyEndEqual() {
		return this.paramAllowModifyEndEqual;
	}
	
	/**
	 * 查询条件结束值,PARAM_ALLOW_MODIFY: 参数允许修改 0 不允许修改 1允许修改
	 */
	public void setParamAllowModifyEndEqual(Integer value)
	 {
		this.paramAllowModifyEndEqual = value;
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
	 * IMPL_INTERFACE: 实现接口
	 */
	public String getImplInterface() {
		return this.implInterface;
	}
	
	/**
	 * IMPL_INTERFACE: 实现接口
	 */
	public void setImplInterface(String value)
	 {
		this.implInterface = value;
	}
	
	/**
	 * 查询条件字符串相等,IMPL_INTERFACE: 实现接口
	 */
	public String getImplInterfaceEqual() {
		return this.implInterfaceEqual;
	}
	
	/**
	 * 查询条件字符串相等,IMPL_INTERFACE: 实现接口
	 */
	public void setImplInterfaceEqual(String value)
	 {
		this.implInterfaceEqual = value;
	}
	
	/**
	 * ORDER_FIELD: 排序字段
	 */
	public Integer getOrderField() {
		return this.orderField;
	}
	
	/**
	 * ORDER_FIELD: 排序字段
	 */
	public void setOrderField(Integer value)
	 {
		this.orderField = value;
	}
	
	/**
	 * 查询条件开始值,ORDER_FIELD: 排序字段
	 */
	public Integer getOrderFieldBegin() {
		return this.orderFieldBegin;
	}
	
	/**
	 * 查询条件开始值,ORDER_FIELD: 排序字段
	 */
	public void setOrderFieldBegin(Integer value)
	 {
		this.orderFieldBegin = value;
	}
	
	/**
	 * 查询条件结束值,ORDER_FIELD: 排序字段
	 */
	public Integer getOrderFieldEnd() {
		return this.orderFieldEnd;
	}
	
	/**
	 * 查询条件结束值,ORDER_FIELD: 排序字段
	 */
	public void setOrderFieldEnd(Integer value)
	 {
		this.orderFieldEnd = value;
	}
	
	/**
	 * 查询条件结束值,ORDER_FIELD: 排序字段
	 */
	public Integer getOrderFieldEndEqual() {
		return this.orderFieldEndEqual;
	}
	
	/**
	 * 查询条件结束值,ORDER_FIELD: 排序字段
	 */
	public void setOrderFieldEndEqual(Integer value)
	 {
		this.orderFieldEndEqual = value;
	}
	
	/**
	 * 设置查询条件PARAM_ID: 参数标识
	 */
	public FuncParamsQueryCondition setParamIdCondition(Integer value) {
		this.paramId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_ID: 参数标识
	 */
	public FuncParamsQueryCondition setParamIdConditionBegin(Integer value) {
		this.paramIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_ID: 参数标识
	 */
	public FuncParamsQueryCondition setParamIdConditionEnd(Integer value) {
		this.paramIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_ID: 参数标识
	 */
	public FuncParamsQueryCondition setParamIdConditionEndEqual(Integer value) {
		this.paramIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public FuncParamsQueryCondition setFuncProcedureIdCondition(Integer value) {
		this.funcProcedureId = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public FuncParamsQueryCondition setFuncProcedureIdConditionBegin(Integer value) {
		this.funcProcedureIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public FuncParamsQueryCondition setFuncProcedureIdConditionEnd(Integer value) {
		this.funcProcedureIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public FuncParamsQueryCondition setFuncProcedureIdConditionEndEqual(Integer value) {
		this.funcProcedureIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_CODE: 参数代码
	 */
	public FuncParamsQueryCondition setParamCodeCondition(String value) {
		this.paramCode = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_CODE: 参数代码
	 */
	public FuncParamsQueryCondition setParamCodeConditionEqual(String value) {
		this.paramCodeEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_NAME: 参数名称
	 */
	public FuncParamsQueryCondition setParamNameCondition(String value) {
		this.paramName = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_NAME: 参数名称
	 */
	public FuncParamsQueryCondition setParamNameConditionEqual(String value) {
		this.paramNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_DIRECTION: 参数方向,0输入参数1输出参数
	 */
	public FuncParamsQueryCondition setParamDirectionCondition(Integer value) {
		this.paramDirection = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_DIRECTION: 参数方向,0输入参数1输出参数
	 */
	public FuncParamsQueryCondition setParamDirectionConditionBegin(Integer value) {
		this.paramDirectionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_DIRECTION: 参数方向,0输入参数1输出参数
	 */
	public FuncParamsQueryCondition setParamDirectionConditionEnd(Integer value) {
		this.paramDirectionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_DIRECTION: 参数方向,0输入参数1输出参数
	 */
	public FuncParamsQueryCondition setParamDirectionConditionEndEqual(Integer value) {
		this.paramDirectionEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_CATEGORY: 参数类型，0普通参数1集合参数
	 */
	public FuncParamsQueryCondition setParamCategoryCondition(Integer value) {
		this.paramCategory = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_CATEGORY: 参数类型，0普通参数1集合参数
	 */
	public FuncParamsQueryCondition setParamCategoryConditionBegin(Integer value) {
		this.paramCategoryBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_CATEGORY: 参数类型，0普通参数1集合参数
	 */
	public FuncParamsQueryCondition setParamCategoryConditionEnd(Integer value) {
		this.paramCategoryEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_CATEGORY: 参数类型，0普通参数1集合参数
	 */
	public FuncParamsQueryCondition setParamCategoryConditionEndEqual(Integer value) {
		this.paramCategoryEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_COMMENT: 参数说明
	 */
	public FuncParamsQueryCondition setParamCommentCondition(String value) {
		this.paramComment = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_COMMENT: 参数说明
	 */
	public FuncParamsQueryCondition setParamCommentConditionEqual(String value) {
		this.paramCommentEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_PARAM_ID: 父参数标识,0表示没有父参数
	 */
	public FuncParamsQueryCondition setParentParamIdCondition(Integer value) {
		this.parentParamId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_PARAM_ID: 父参数标识,0表示没有父参数
	 */
	public FuncParamsQueryCondition setParentParamIdConditionBegin(Integer value) {
		this.parentParamIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_PARAM_ID: 父参数标识,0表示没有父参数
	 */
	public FuncParamsQueryCondition setParentParamIdConditionEnd(Integer value) {
		this.parentParamIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_PARAM_ID: 父参数标识,0表示没有父参数
	 */
	public FuncParamsQueryCondition setParentParamIdConditionEndEqual(Integer value) {
		this.parentParamIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_DATA_TYPE: 数据类型
	 */
	public FuncParamsQueryCondition setParamDataTypeCondition(String value) {
		this.paramDataType = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_DATA_TYPE: 数据类型
	 */
	public FuncParamsQueryCondition setParamDataTypeConditionEqual(String value) {
		this.paramDataTypeEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_DATA_LENGTH: 数据类型长度
	 */
	public FuncParamsQueryCondition setParamDataLengthCondition(Integer value) {
		this.paramDataLength = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_DATA_LENGTH: 数据类型长度
	 */
	public FuncParamsQueryCondition setParamDataLengthConditionBegin(Integer value) {
		this.paramDataLengthBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_DATA_LENGTH: 数据类型长度
	 */
	public FuncParamsQueryCondition setParamDataLengthConditionEnd(Integer value) {
		this.paramDataLengthEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_DATA_LENGTH: 数据类型长度
	 */
	public FuncParamsQueryCondition setParamDataLengthConditionEndEqual(Integer value) {
		this.paramDataLengthEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_DATA_DECIMAL: 数据类型小数长度
	 */
	public FuncParamsQueryCondition setParamDataDecimalCondition(Integer value) {
		this.paramDataDecimal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_DATA_DECIMAL: 数据类型小数长度
	 */
	public FuncParamsQueryCondition setParamDataDecimalConditionBegin(Integer value) {
		this.paramDataDecimalBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_DATA_DECIMAL: 数据类型小数长度
	 */
	public FuncParamsQueryCondition setParamDataDecimalConditionEnd(Integer value) {
		this.paramDataDecimalEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_DATA_DECIMAL: 数据类型小数长度
	 */
	public FuncParamsQueryCondition setParamDataDecimalConditionEndEqual(Integer value) {
		this.paramDataDecimalEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_DATA_NOT_NULL: 数据非空 0允许空 1不允许空
	 */
	public FuncParamsQueryCondition setParamDataNotNullCondition(Integer value) {
		this.paramDataNotNull = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_DATA_NOT_NULL: 数据非空 0允许空 1不允许空
	 */
	public FuncParamsQueryCondition setParamDataNotNullConditionBegin(Integer value) {
		this.paramDataNotNullBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_DATA_NOT_NULL: 数据非空 0允许空 1不允许空
	 */
	public FuncParamsQueryCondition setParamDataNotNullConditionEnd(Integer value) {
		this.paramDataNotNullEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_DATA_NOT_NULL: 数据非空 0允许空 1不允许空
	 */
	public FuncParamsQueryCondition setParamDataNotNullConditionEndEqual(Integer value) {
		this.paramDataNotNullEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_DATA_DEFAULT_VALUE: 参数默认值
	 */
	public FuncParamsQueryCondition setParamDataDefaultValueCondition(String value) {
		this.paramDataDefaultValue = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_DATA_DEFAULT_VALUE: 参数默认值
	 */
	public FuncParamsQueryCondition setParamDataDefaultValueConditionEqual(String value) {
		this.paramDataDefaultValueEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_ALLOW_MODIFY: 参数允许修改 0 不允许修改 1允许修改
	 */
	public FuncParamsQueryCondition setParamAllowModifyCondition(Integer value) {
		this.paramAllowModify = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_ALLOW_MODIFY: 参数允许修改 0 不允许修改 1允许修改
	 */
	public FuncParamsQueryCondition setParamAllowModifyConditionBegin(Integer value) {
		this.paramAllowModifyBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_ALLOW_MODIFY: 参数允许修改 0 不允许修改 1允许修改
	 */
	public FuncParamsQueryCondition setParamAllowModifyConditionEnd(Integer value) {
		this.paramAllowModifyEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARAM_ALLOW_MODIFY: 参数允许修改 0 不允许修改 1允许修改
	 */
	public FuncParamsQueryCondition setParamAllowModifyConditionEndEqual(Integer value) {
		this.paramAllowModifyEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB0: 备用字段1
	 */
	public FuncParamsQueryCondition setPub0Condition(String value) {
		this.pub0 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB0: 备用字段1
	 */
	public FuncParamsQueryCondition setPub0ConditionEqual(String value) {
		this.pub0Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB1: 备用字段2
	 */
	public FuncParamsQueryCondition setPub1Condition(String value) {
		this.pub1 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB1: 备用字段2
	 */
	public FuncParamsQueryCondition setPub1ConditionEqual(String value) {
		this.pub1Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB2: 备用字段3
	 */
	public FuncParamsQueryCondition setPub2Condition(String value) {
		this.pub2 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB2: 备用字段3
	 */
	public FuncParamsQueryCondition setPub2ConditionEqual(String value) {
		this.pub2Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB3: 备用字段4
	 */
	public FuncParamsQueryCondition setPub3Condition(String value) {
		this.pub3 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB3: 备用字段4
	 */
	public FuncParamsQueryCondition setPub3ConditionEqual(String value) {
		this.pub3Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB4: 备用字段5
	 */
	public FuncParamsQueryCondition setPub4Condition(String value) {
		this.pub4 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB4: 备用字段5
	 */
	public FuncParamsQueryCondition setPub4ConditionEqual(String value) {
		this.pub4Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB5: 备用字段6
	 */
	public FuncParamsQueryCondition setPub5Condition(String value) {
		this.pub5 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB5: 备用字段6
	 */
	public FuncParamsQueryCondition setPub5ConditionEqual(String value) {
		this.pub5Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件IMPL_INTERFACE: 实现接口
	 */
	public FuncParamsQueryCondition setImplInterfaceCondition(String value) {
		this.implInterface = value;
		return this;
	}
	
	/**
	 * 设置查询条件IMPL_INTERFACE: 实现接口
	 */
	public FuncParamsQueryCondition setImplInterfaceConditionEqual(String value) {
		this.implInterfaceEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ORDER_FIELD: 排序字段
	 */
	public FuncParamsQueryCondition setOrderFieldCondition(Integer value) {
		this.orderField = value;
		return this;
	}
	
	/**
	 * 设置查询条件ORDER_FIELD: 排序字段
	 */
	public FuncParamsQueryCondition setOrderFieldConditionBegin(Integer value) {
		this.orderFieldBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ORDER_FIELD: 排序字段
	 */
	public FuncParamsQueryCondition setOrderFieldConditionEnd(Integer value) {
		this.orderFieldEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ORDER_FIELD: 排序字段
	 */
	public FuncParamsQueryCondition setOrderFieldConditionEndEqual(Integer value) {
		this.orderFieldEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.paramId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_FUNC_PARAMS].[PARAM_ID] = " + this.paramId) 
						+ ") "));
		}
		if ((this.paramIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_ID] >= " 
						+ (this.paramIdBegin + ")")));
		}
		if ((this.paramIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_ID] < " 
						+ (this.paramIdEnd + ") ")));
		}
		if ((this.paramIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_ID] <= " 
						+ (this.paramIdEndEqual + ") ")));
		}
		if ((this.funcProcedureId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_FUNC_PARAMS].[FUNC_PROCEDURE_ID] = " + this.funcProcedureId) 
						+ ") "));
		}
		if ((this.funcProcedureIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[FUNC_PROCEDURE_ID] >= " 
						+ (this.funcProcedureIdBegin + ")")));
		}
		if ((this.funcProcedureIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[FUNC_PROCEDURE_ID] < " 
						+ (this.funcProcedureIdEnd + ") ")));
		}
		if ((this.funcProcedureIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[FUNC_PROCEDURE_ID] <= " 
						+ (this.funcProcedureIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.paramCode)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PARAMS].[PARAM_CODE]", this.paramCode)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.paramCodeEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PARAMS].[PARAM_CODE] = " + SqlServerUtils.safeSql(this.paramCodeEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.paramName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PARAMS].[PARAM_NAME]", this.paramName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.paramNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PARAMS].[PARAM_NAME] = " + SqlServerUtils.safeSql(this.paramNameEqual))) 
						+ ") "));
		}
		if ((this.paramDirection == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_FUNC_PARAMS].[PARAM_DIRECTION] = " + this.paramDirection) 
						+ ") "));
		}
		if ((this.paramDirectionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_DIRECTION] >= " 
						+ (this.paramDirectionBegin + ")")));
		}
		if ((this.paramDirectionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_DIRECTION] < " 
						+ (this.paramDirectionEnd + ") ")));
		}
		if ((this.paramDirectionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_DIRECTION] <= " 
						+ (this.paramDirectionEndEqual + ") ")));
		}
		if ((this.paramCategory == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_FUNC_PARAMS].[PARAM_CATEGORY] = " + this.paramCategory) 
						+ ") "));
		}
		if ((this.paramCategoryBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_CATEGORY] >= " 
						+ (this.paramCategoryBegin + ")")));
		}
		if ((this.paramCategoryEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_CATEGORY] < " 
						+ (this.paramCategoryEnd + ") ")));
		}
		if ((this.paramCategoryEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_CATEGORY] <= " 
						+ (this.paramCategoryEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.paramComment)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PARAMS].[PARAM_COMMENT]", this.paramComment)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.paramCommentEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PARAMS].[PARAM_COMMENT] = " + SqlServerUtils.safeSql(this.paramCommentEqual))) 
						+ ") "));
		}
		if ((this.parentParamId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_FUNC_PARAMS].[PARENT_PARAM_ID] = " + this.parentParamId) 
						+ ") "));
		}
		if ((this.parentParamIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARENT_PARAM_ID] >= " 
						+ (this.parentParamIdBegin + ")")));
		}
		if ((this.parentParamIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARENT_PARAM_ID] < " 
						+ (this.parentParamIdEnd + ") ")));
		}
		if ((this.parentParamIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARENT_PARAM_ID] <= " 
						+ (this.parentParamIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.paramDataType)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PARAMS].[PARAM_DATA_TYPE]", this.paramDataType)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.paramDataTypeEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PARAMS].[PARAM_DATA_TYPE] = " + SqlServerUtils.safeSql(this.paramDataTypeEqual))) 
						+ ") "));
		}
		if ((this.paramDataLength == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_FUNC_PARAMS].[PARAM_DATA_LENGTH] = " + this.paramDataLength) 
						+ ") "));
		}
		if ((this.paramDataLengthBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_DATA_LENGTH] >= " 
						+ (this.paramDataLengthBegin + ")")));
		}
		if ((this.paramDataLengthEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_DATA_LENGTH] < " 
						+ (this.paramDataLengthEnd + ") ")));
		}
		if ((this.paramDataLengthEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_DATA_LENGTH] <= " 
						+ (this.paramDataLengthEndEqual + ") ")));
		}
		if ((this.paramDataDecimal == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_FUNC_PARAMS].[PARAM_DATA_DECIMAL] = " + this.paramDataDecimal) 
						+ ") "));
		}
		if ((this.paramDataDecimalBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_DATA_DECIMAL] >= " 
						+ (this.paramDataDecimalBegin + ")")));
		}
		if ((this.paramDataDecimalEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_DATA_DECIMAL] < " 
						+ (this.paramDataDecimalEnd + ") ")));
		}
		if ((this.paramDataDecimalEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_DATA_DECIMAL] <= " 
						+ (this.paramDataDecimalEndEqual + ") ")));
		}
		if ((this.paramDataNotNull == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_FUNC_PARAMS].[PARAM_DATA_NOT_NULL] = " + this.paramDataNotNull) 
						+ ") "));
		}
		if ((this.paramDataNotNullBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_DATA_NOT_NULL] >= " 
						+ (this.paramDataNotNullBegin + ")")));
		}
		if ((this.paramDataNotNullEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_DATA_NOT_NULL] < " 
						+ (this.paramDataNotNullEnd + ") ")));
		}
		if ((this.paramDataNotNullEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_DATA_NOT_NULL] <= " 
						+ (this.paramDataNotNullEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.paramDataDefaultValue)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PARAMS].[PARAM_DATA_DEFAULT_VALUE]", this.paramDataDefaultValue)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.paramDataDefaultValueEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PARAMS].[PARAM_DATA_DEFAULT_VALUE] = " + SqlServerUtils.safeSql(this.paramDataDefaultValueEqual))) 
						+ ") "));
		}
		if ((this.paramAllowModify == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_FUNC_PARAMS].[PARAM_ALLOW_MODIFY] = " + this.paramAllowModify) 
						+ ") "));
		}
		if ((this.paramAllowModifyBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_ALLOW_MODIFY] >= " 
						+ (this.paramAllowModifyBegin + ")")));
		}
		if ((this.paramAllowModifyEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_ALLOW_MODIFY] < " 
						+ (this.paramAllowModifyEnd + ") ")));
		}
		if ((this.paramAllowModifyEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[PARAM_ALLOW_MODIFY] <= " 
						+ (this.paramAllowModifyEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.pub0)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PARAMS].[PUB0]", this.pub0)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub0Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PARAMS].[PUB0] = " + SqlServerUtils.safeSql(this.pub0Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub1)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PARAMS].[PUB1]", this.pub1)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub1Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PARAMS].[PUB1] = " + SqlServerUtils.safeSql(this.pub1Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub2)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PARAMS].[PUB2]", this.pub2)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub2Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PARAMS].[PUB2] = " + SqlServerUtils.safeSql(this.pub2Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub3)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PARAMS].[PUB3]", this.pub3)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub3Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PARAMS].[PUB3] = " + SqlServerUtils.safeSql(this.pub3Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub4)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PARAMS].[PUB4]", this.pub4)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub4Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PARAMS].[PUB4] = " + SqlServerUtils.safeSql(this.pub4Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub5)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PARAMS].[PUB5]", this.pub5)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub5Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PARAMS].[PUB5] = " + SqlServerUtils.safeSql(this.pub5Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.implInterface)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_FUNC_PARAMS].[IMPL_INTERFACE]", this.implInterface)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.implInterfaceEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_FUNC_PARAMS].[IMPL_INTERFACE] = " + SqlServerUtils.safeSql(this.implInterfaceEqual))) 
						+ ") "));
		}
		if ((this.orderField == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_FUNC_PARAMS].[ORDER_FIELD] = " + this.orderField) 
						+ ") "));
		}
		if ((this.orderFieldBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[ORDER_FIELD] >= " 
						+ (this.orderFieldBegin + ")")));
		}
		if ((this.orderFieldEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[ORDER_FIELD] < " 
						+ (this.orderFieldEnd + ") ")));
		}
		if ((this.orderFieldEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_FUNC_PARAMS].[ORDER_FIELD] <= " 
						+ (this.orderFieldEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
