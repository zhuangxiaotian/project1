package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_VARIABLE查询条件定义
 */
public class Jbpm4VariableQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,DBID_: 
	 */
	Double dbid;
	
	/**
	 * 查询条件开始值,DBID_: 
	 */
	Double dbidBegin;
	
	/**
	 * 查询条件结束值,DBID_: 
	 */
	Double dbidEnd;
	
	/**
	 * 查询条件结束值,DBID_: 
	 */
	Double dbidEndEqual;
	
	/**
	 * 查询条件,CLASS_: 
	 */
	String class_;
	
	/**
	 * 查询条件字符串相等,CLASS_: 
	 */
	String class_Equal;
	
	/**
	 * 查询条件,DBVERSION_: 
	 */
	Integer dbversion;
	
	/**
	 * 查询条件开始值,DBVERSION_: 
	 */
	Integer dbversionBegin;
	
	/**
	 * 查询条件结束值,DBVERSION_: 
	 */
	Integer dbversionEnd;
	
	/**
	 * 查询条件结束值,DBVERSION_: 
	 */
	Integer dbversionEndEqual;
	
	/**
	 * 查询条件,KEY_: 
	 */
	String key;
	
	/**
	 * 查询条件字符串相等,KEY_: 
	 */
	String keyEqual;
	
	/**
	 * 查询条件,CONVERTER_: 
	 */
	String converter;
	
	/**
	 * 查询条件字符串相等,CONVERTER_: 
	 */
	String converterEqual;
	
	/**
	 * 查询条件,HIST_: 
	 */
	Byte hist;
	
	/**
	 * 查询条件开始值,HIST_: 
	 */
	Byte histBegin;
	
	/**
	 * 查询条件结束值,HIST_: 
	 */
	Byte histEnd;
	
	/**
	 * 查询条件结束值,HIST_: 
	 */
	Byte histEndEqual;
	
	/**
	 * 查询条件,EXECUTION_: 
	 */
	Double execution;
	
	/**
	 * 查询条件开始值,EXECUTION_: 
	 */
	Double executionBegin;
	
	/**
	 * 查询条件结束值,EXECUTION_: 
	 */
	Double executionEnd;
	
	/**
	 * 查询条件结束值,EXECUTION_: 
	 */
	Double executionEndEqual;
	
	/**
	 * 查询条件,TASK_: 
	 */
	Double task;
	
	/**
	 * 查询条件开始值,TASK_: 
	 */
	Double taskBegin;
	
	/**
	 * 查询条件结束值,TASK_: 
	 */
	Double taskEnd;
	
	/**
	 * 查询条件结束值,TASK_: 
	 */
	Double taskEndEqual;
	
	/**
	 * 查询条件,LOB_: 
	 */
	Double lob;
	
	/**
	 * 查询条件开始值,LOB_: 
	 */
	Double lobBegin;
	
	/**
	 * 查询条件结束值,LOB_: 
	 */
	Double lobEnd;
	
	/**
	 * 查询条件结束值,LOB_: 
	 */
	Double lobEndEqual;
	
	/**
	 * 查询条件,DATE_VALUE_: 
	 */
	java.util.Date dateValue;
	
	/**
	 * 查询条件开始值,DATE_VALUE_: 
	 */
	java.util.Date dateValueBegin;
	
	/**
	 * 查询条件结束值,DATE_VALUE_: 
	 */
	java.util.Date dateValueEnd;
	
	/**
	 * 查询条件结束值,DATE_VALUE_: 
	 */
	java.util.Date dateValueEndEqual;
	
	/**
	 * 查询条件,DOUBLE_VALUE_: 
	 */
	Double doubleValue;
	
	/**
	 * 查询条件开始值,DOUBLE_VALUE_: 
	 */
	Double doubleValueBegin;
	
	/**
	 * 查询条件结束值,DOUBLE_VALUE_: 
	 */
	Double doubleValueEnd;
	
	/**
	 * 查询条件结束值,DOUBLE_VALUE_: 
	 */
	Double doubleValueEndEqual;
	
	/**
	 * 查询条件,CLASSNAME_: 
	 */
	String classname;
	
	/**
	 * 查询条件字符串相等,CLASSNAME_: 
	 */
	String classnameEqual;
	
	/**
	 * 查询条件,LONG_VALUE_: 
	 */
	Double longValue;
	
	/**
	 * 查询条件开始值,LONG_VALUE_: 
	 */
	Double longValueBegin;
	
	/**
	 * 查询条件结束值,LONG_VALUE_: 
	 */
	Double longValueEnd;
	
	/**
	 * 查询条件结束值,LONG_VALUE_: 
	 */
	Double longValueEndEqual;
	
	/**
	 * 查询条件,STRING_VALUE_: 
	 */
	String stringValue;
	
	/**
	 * 查询条件字符串相等,STRING_VALUE_: 
	 */
	String stringValueEqual;
	
	/**
	 * 查询条件,TEXT_VALUE_: 
	 */
	String textValue;
	
	/**
	 * 查询条件字符串相等,TEXT_VALUE_: 
	 */
	String textValueEqual;
	
	/**
	 * 查询条件,EXESYS_: 
	 */
	Double exesys;
	
	/**
	 * 查询条件开始值,EXESYS_: 
	 */
	Double exesysBegin;
	
	/**
	 * 查询条件结束值,EXESYS_: 
	 */
	Double exesysEnd;
	
	/**
	 * 查询条件结束值,EXESYS_: 
	 */
	Double exesysEndEqual;
	
	/**
	 * DBID_: 
	 */
	public Double getDbid() {
		return this.dbid;
	}
	
	/**
	 * DBID_: 
	 */
	public void setDbid(Double value)
	 {
		this.dbid = value;
	}
	
	/**
	 * 查询条件开始值,DBID_: 
	 */
	public Double getDbidBegin() {
		return this.dbidBegin;
	}
	
	/**
	 * 查询条件开始值,DBID_: 
	 */
	public void setDbidBegin(Double value)
	 {
		this.dbidBegin = value;
	}
	
	/**
	 * 查询条件结束值,DBID_: 
	 */
	public Double getDbidEnd() {
		return this.dbidEnd;
	}
	
	/**
	 * 查询条件结束值,DBID_: 
	 */
	public void setDbidEnd(Double value)
	 {
		this.dbidEnd = value;
	}
	
	/**
	 * 查询条件结束值,DBID_: 
	 */
	public Double getDbidEndEqual() {
		return this.dbidEndEqual;
	}
	
	/**
	 * 查询条件结束值,DBID_: 
	 */
	public void setDbidEndEqual(Double value)
	 {
		this.dbidEndEqual = value;
	}
	
	/**
	 * CLASS_: 
	 */
	public String getClass_() {
		return this.class_;
	}
	
	/**
	 * CLASS_: 
	 */
	public void setClass_(String value)
	 {
		this.class_ = value;
	}
	
	/**
	 * 查询条件字符串相等,CLASS_: 
	 */
	public String getClass_Equal() {
		return this.class_Equal;
	}
	
	/**
	 * 查询条件字符串相等,CLASS_: 
	 */
	public void setClass_Equal(String value)
	 {
		this.class_Equal = value;
	}
	
	/**
	 * DBVERSION_: 
	 */
	public Integer getDbversion() {
		return this.dbversion;
	}
	
	/**
	 * DBVERSION_: 
	 */
	public void setDbversion(Integer value)
	 {
		this.dbversion = value;
	}
	
	/**
	 * 查询条件开始值,DBVERSION_: 
	 */
	public Integer getDbversionBegin() {
		return this.dbversionBegin;
	}
	
	/**
	 * 查询条件开始值,DBVERSION_: 
	 */
	public void setDbversionBegin(Integer value)
	 {
		this.dbversionBegin = value;
	}
	
	/**
	 * 查询条件结束值,DBVERSION_: 
	 */
	public Integer getDbversionEnd() {
		return this.dbversionEnd;
	}
	
	/**
	 * 查询条件结束值,DBVERSION_: 
	 */
	public void setDbversionEnd(Integer value)
	 {
		this.dbversionEnd = value;
	}
	
	/**
	 * 查询条件结束值,DBVERSION_: 
	 */
	public Integer getDbversionEndEqual() {
		return this.dbversionEndEqual;
	}
	
	/**
	 * 查询条件结束值,DBVERSION_: 
	 */
	public void setDbversionEndEqual(Integer value)
	 {
		this.dbversionEndEqual = value;
	}
	
	/**
	 * KEY_: 
	 */
	public String getKey() {
		return this.key;
	}
	
	/**
	 * KEY_: 
	 */
	public void setKey(String value)
	 {
		this.key = value;
	}
	
	/**
	 * 查询条件字符串相等,KEY_: 
	 */
	public String getKeyEqual() {
		return this.keyEqual;
	}
	
	/**
	 * 查询条件字符串相等,KEY_: 
	 */
	public void setKeyEqual(String value)
	 {
		this.keyEqual = value;
	}
	
	/**
	 * CONVERTER_: 
	 */
	public String getConverter() {
		return this.converter;
	}
	
	/**
	 * CONVERTER_: 
	 */
	public void setConverter(String value)
	 {
		this.converter = value;
	}
	
	/**
	 * 查询条件字符串相等,CONVERTER_: 
	 */
	public String getConverterEqual() {
		return this.converterEqual;
	}
	
	/**
	 * 查询条件字符串相等,CONVERTER_: 
	 */
	public void setConverterEqual(String value)
	 {
		this.converterEqual = value;
	}
	
	/**
	 * HIST_: 
	 */
	public Byte getHist() {
		return this.hist;
	}
	
	/**
	 * HIST_: 
	 */
	public void setHist(Byte value)
	 {
		this.hist = value;
	}
	
	/**
	 * 查询条件开始值,HIST_: 
	 */
	public Byte getHistBegin() {
		return this.histBegin;
	}
	
	/**
	 * 查询条件开始值,HIST_: 
	 */
	public void setHistBegin(Byte value)
	 {
		this.histBegin = value;
	}
	
	/**
	 * 查询条件结束值,HIST_: 
	 */
	public Byte getHistEnd() {
		return this.histEnd;
	}
	
	/**
	 * 查询条件结束值,HIST_: 
	 */
	public void setHistEnd(Byte value)
	 {
		this.histEnd = value;
	}
	
	/**
	 * 查询条件结束值,HIST_: 
	 */
	public Byte getHistEndEqual() {
		return this.histEndEqual;
	}
	
	/**
	 * 查询条件结束值,HIST_: 
	 */
	public void setHistEndEqual(Byte value)
	 {
		this.histEndEqual = value;
	}
	
	/**
	 * EXECUTION_: 
	 */
	public Double getExecution() {
		return this.execution;
	}
	
	/**
	 * EXECUTION_: 
	 */
	public void setExecution(Double value)
	 {
		this.execution = value;
	}
	
	/**
	 * 查询条件开始值,EXECUTION_: 
	 */
	public Double getExecutionBegin() {
		return this.executionBegin;
	}
	
	/**
	 * 查询条件开始值,EXECUTION_: 
	 */
	public void setExecutionBegin(Double value)
	 {
		this.executionBegin = value;
	}
	
	/**
	 * 查询条件结束值,EXECUTION_: 
	 */
	public Double getExecutionEnd() {
		return this.executionEnd;
	}
	
	/**
	 * 查询条件结束值,EXECUTION_: 
	 */
	public void setExecutionEnd(Double value)
	 {
		this.executionEnd = value;
	}
	
	/**
	 * 查询条件结束值,EXECUTION_: 
	 */
	public Double getExecutionEndEqual() {
		return this.executionEndEqual;
	}
	
	/**
	 * 查询条件结束值,EXECUTION_: 
	 */
	public void setExecutionEndEqual(Double value)
	 {
		this.executionEndEqual = value;
	}
	
	/**
	 * TASK_: 
	 */
	public Double getTask() {
		return this.task;
	}
	
	/**
	 * TASK_: 
	 */
	public void setTask(Double value)
	 {
		this.task = value;
	}
	
	/**
	 * 查询条件开始值,TASK_: 
	 */
	public Double getTaskBegin() {
		return this.taskBegin;
	}
	
	/**
	 * 查询条件开始值,TASK_: 
	 */
	public void setTaskBegin(Double value)
	 {
		this.taskBegin = value;
	}
	
	/**
	 * 查询条件结束值,TASK_: 
	 */
	public Double getTaskEnd() {
		return this.taskEnd;
	}
	
	/**
	 * 查询条件结束值,TASK_: 
	 */
	public void setTaskEnd(Double value)
	 {
		this.taskEnd = value;
	}
	
	/**
	 * 查询条件结束值,TASK_: 
	 */
	public Double getTaskEndEqual() {
		return this.taskEndEqual;
	}
	
	/**
	 * 查询条件结束值,TASK_: 
	 */
	public void setTaskEndEqual(Double value)
	 {
		this.taskEndEqual = value;
	}
	
	/**
	 * LOB_: 
	 */
	public Double getLob() {
		return this.lob;
	}
	
	/**
	 * LOB_: 
	 */
	public void setLob(Double value)
	 {
		this.lob = value;
	}
	
	/**
	 * 查询条件开始值,LOB_: 
	 */
	public Double getLobBegin() {
		return this.lobBegin;
	}
	
	/**
	 * 查询条件开始值,LOB_: 
	 */
	public void setLobBegin(Double value)
	 {
		this.lobBegin = value;
	}
	
	/**
	 * 查询条件结束值,LOB_: 
	 */
	public Double getLobEnd() {
		return this.lobEnd;
	}
	
	/**
	 * 查询条件结束值,LOB_: 
	 */
	public void setLobEnd(Double value)
	 {
		this.lobEnd = value;
	}
	
	/**
	 * 查询条件结束值,LOB_: 
	 */
	public Double getLobEndEqual() {
		return this.lobEndEqual;
	}
	
	/**
	 * 查询条件结束值,LOB_: 
	 */
	public void setLobEndEqual(Double value)
	 {
		this.lobEndEqual = value;
	}
	
	/**
	 * DATE_VALUE_: 
	 */
	public java.util.Date getDateValue() {
		return this.dateValue;
	}
	
	/**
	 * DATE_VALUE_: 
	 */
	public void setDateValue(java.util.Date value)
	 {
		this.dateValue = value;
	}
	
	/**
	 * 查询条件开始值,DATE_VALUE_: 
	 */
	public java.util.Date getDateValueBegin() {
		return this.dateValueBegin;
	}
	
	/**
	 * 查询条件开始值,DATE_VALUE_: 
	 */
	public void setDateValueBegin(java.util.Date value)
	 {
		this.dateValueBegin = value;
	}
	
	/**
	 * 查询条件结束值,DATE_VALUE_: 
	 */
	public java.util.Date getDateValueEnd() {
		return this.dateValueEnd;
	}
	
	/**
	 * 查询条件结束值,DATE_VALUE_: 
	 */
	public void setDateValueEnd(java.util.Date value)
	 {
		this.dateValueEnd = value;
	}
	
	/**
	 * 查询条件结束值,DATE_VALUE_: 
	 */
	public java.util.Date getDateValueEndEqual() {
		return this.dateValueEndEqual;
	}
	
	/**
	 * 查询条件结束值,DATE_VALUE_: 
	 */
	public void setDateValueEndEqual(java.util.Date value)
	 {
		this.dateValueEndEqual = value;
	}
	
	/**
	 * DOUBLE_VALUE_: 
	 */
	public Double getDoubleValue() {
		return this.doubleValue;
	}
	
	/**
	 * DOUBLE_VALUE_: 
	 */
	public void setDoubleValue(Double value)
	 {
		this.doubleValue = value;
	}
	
	/**
	 * 查询条件开始值,DOUBLE_VALUE_: 
	 */
	public Double getDoubleValueBegin() {
		return this.doubleValueBegin;
	}
	
	/**
	 * 查询条件开始值,DOUBLE_VALUE_: 
	 */
	public void setDoubleValueBegin(Double value)
	 {
		this.doubleValueBegin = value;
	}
	
	/**
	 * 查询条件结束值,DOUBLE_VALUE_: 
	 */
	public Double getDoubleValueEnd() {
		return this.doubleValueEnd;
	}
	
	/**
	 * 查询条件结束值,DOUBLE_VALUE_: 
	 */
	public void setDoubleValueEnd(Double value)
	 {
		this.doubleValueEnd = value;
	}
	
	/**
	 * 查询条件结束值,DOUBLE_VALUE_: 
	 */
	public Double getDoubleValueEndEqual() {
		return this.doubleValueEndEqual;
	}
	
	/**
	 * 查询条件结束值,DOUBLE_VALUE_: 
	 */
	public void setDoubleValueEndEqual(Double value)
	 {
		this.doubleValueEndEqual = value;
	}
	
	/**
	 * CLASSNAME_: 
	 */
	public String getClassname() {
		return this.classname;
	}
	
	/**
	 * CLASSNAME_: 
	 */
	public void setClassname(String value)
	 {
		this.classname = value;
	}
	
	/**
	 * 查询条件字符串相等,CLASSNAME_: 
	 */
	public String getClassnameEqual() {
		return this.classnameEqual;
	}
	
	/**
	 * 查询条件字符串相等,CLASSNAME_: 
	 */
	public void setClassnameEqual(String value)
	 {
		this.classnameEqual = value;
	}
	
	/**
	 * LONG_VALUE_: 
	 */
	public Double getLongValue() {
		return this.longValue;
	}
	
	/**
	 * LONG_VALUE_: 
	 */
	public void setLongValue(Double value)
	 {
		this.longValue = value;
	}
	
	/**
	 * 查询条件开始值,LONG_VALUE_: 
	 */
	public Double getLongValueBegin() {
		return this.longValueBegin;
	}
	
	/**
	 * 查询条件开始值,LONG_VALUE_: 
	 */
	public void setLongValueBegin(Double value)
	 {
		this.longValueBegin = value;
	}
	
	/**
	 * 查询条件结束值,LONG_VALUE_: 
	 */
	public Double getLongValueEnd() {
		return this.longValueEnd;
	}
	
	/**
	 * 查询条件结束值,LONG_VALUE_: 
	 */
	public void setLongValueEnd(Double value)
	 {
		this.longValueEnd = value;
	}
	
	/**
	 * 查询条件结束值,LONG_VALUE_: 
	 */
	public Double getLongValueEndEqual() {
		return this.longValueEndEqual;
	}
	
	/**
	 * 查询条件结束值,LONG_VALUE_: 
	 */
	public void setLongValueEndEqual(Double value)
	 {
		this.longValueEndEqual = value;
	}
	
	/**
	 * STRING_VALUE_: 
	 */
	public String getStringValue() {
		return this.stringValue;
	}
	
	/**
	 * STRING_VALUE_: 
	 */
	public void setStringValue(String value)
	 {
		this.stringValue = value;
	}
	
	/**
	 * 查询条件字符串相等,STRING_VALUE_: 
	 */
	public String getStringValueEqual() {
		return this.stringValueEqual;
	}
	
	/**
	 * 查询条件字符串相等,STRING_VALUE_: 
	 */
	public void setStringValueEqual(String value)
	 {
		this.stringValueEqual = value;
	}
	
	/**
	 * TEXT_VALUE_: 
	 */
	public String getTextValue() {
		return this.textValue;
	}
	
	/**
	 * TEXT_VALUE_: 
	 */
	public void setTextValue(String value)
	 {
		this.textValue = value;
	}
	
	/**
	 * 查询条件字符串相等,TEXT_VALUE_: 
	 */
	public String getTextValueEqual() {
		return this.textValueEqual;
	}
	
	/**
	 * 查询条件字符串相等,TEXT_VALUE_: 
	 */
	public void setTextValueEqual(String value)
	 {
		this.textValueEqual = value;
	}
	
	/**
	 * EXESYS_: 
	 */
	public Double getExesys() {
		return this.exesys;
	}
	
	/**
	 * EXESYS_: 
	 */
	public void setExesys(Double value)
	 {
		this.exesys = value;
	}
	
	/**
	 * 查询条件开始值,EXESYS_: 
	 */
	public Double getExesysBegin() {
		return this.exesysBegin;
	}
	
	/**
	 * 查询条件开始值,EXESYS_: 
	 */
	public void setExesysBegin(Double value)
	 {
		this.exesysBegin = value;
	}
	
	/**
	 * 查询条件结束值,EXESYS_: 
	 */
	public Double getExesysEnd() {
		return this.exesysEnd;
	}
	
	/**
	 * 查询条件结束值,EXESYS_: 
	 */
	public void setExesysEnd(Double value)
	 {
		this.exesysEnd = value;
	}
	
	/**
	 * 查询条件结束值,EXESYS_: 
	 */
	public Double getExesysEndEqual() {
		return this.exesysEndEqual;
	}
	
	/**
	 * 查询条件结束值,EXESYS_: 
	 */
	public void setExesysEndEqual(Double value)
	 {
		this.exesysEndEqual = value;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4VariableQueryCondition setDbidCondition(Double value) {
		this.dbid = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4VariableQueryCondition setDbidConditionBegin(Double value) {
		this.dbidBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4VariableQueryCondition setDbidConditionEnd(Double value) {
		this.dbidEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4VariableQueryCondition setDbidConditionEndEqual(Double value) {
		this.dbidEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CLASS_: 
	 */
	public Jbpm4VariableQueryCondition setClass_Condition(String value) {
		this.class_ = value;
		return this;
	}
	
	/**
	 * 设置查询条件CLASS_: 
	 */
	public Jbpm4VariableQueryCondition setClass_ConditionEqual(String value) {
		this.class_Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4VariableQueryCondition setDbversionCondition(Integer value) {
		this.dbversion = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4VariableQueryCondition setDbversionConditionBegin(Integer value) {
		this.dbversionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4VariableQueryCondition setDbversionConditionEnd(Integer value) {
		this.dbversionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4VariableQueryCondition setDbversionConditionEndEqual(Integer value) {
		this.dbversionEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件KEY_: 
	 */
	public Jbpm4VariableQueryCondition setKeyCondition(String value) {
		this.key = value;
		return this;
	}
	
	/**
	 * 设置查询条件KEY_: 
	 */
	public Jbpm4VariableQueryCondition setKeyConditionEqual(String value) {
		this.keyEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CONVERTER_: 
	 */
	public Jbpm4VariableQueryCondition setConverterCondition(String value) {
		this.converter = value;
		return this;
	}
	
	/**
	 * 设置查询条件CONVERTER_: 
	 */
	public Jbpm4VariableQueryCondition setConverterConditionEqual(String value) {
		this.converterEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件HIST_: 
	 */
	public Jbpm4VariableQueryCondition setHistCondition(Byte value) {
		this.hist = value;
		return this;
	}
	
	/**
	 * 设置查询条件HIST_: 
	 */
	public Jbpm4VariableQueryCondition setHistConditionBegin(Byte value) {
		this.histBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件HIST_: 
	 */
	public Jbpm4VariableQueryCondition setHistConditionEnd(Byte value) {
		this.histEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件HIST_: 
	 */
	public Jbpm4VariableQueryCondition setHistConditionEndEqual(Byte value) {
		this.histEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_: 
	 */
	public Jbpm4VariableQueryCondition setExecutionCondition(Double value) {
		this.execution = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_: 
	 */
	public Jbpm4VariableQueryCondition setExecutionConditionBegin(Double value) {
		this.executionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_: 
	 */
	public Jbpm4VariableQueryCondition setExecutionConditionEnd(Double value) {
		this.executionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXECUTION_: 
	 */
	public Jbpm4VariableQueryCondition setExecutionConditionEndEqual(Double value) {
		this.executionEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_: 
	 */
	public Jbpm4VariableQueryCondition setTaskCondition(Double value) {
		this.task = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_: 
	 */
	public Jbpm4VariableQueryCondition setTaskConditionBegin(Double value) {
		this.taskBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_: 
	 */
	public Jbpm4VariableQueryCondition setTaskConditionEnd(Double value) {
		this.taskEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TASK_: 
	 */
	public Jbpm4VariableQueryCondition setTaskConditionEndEqual(Double value) {
		this.taskEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOB_: 
	 */
	public Jbpm4VariableQueryCondition setLobCondition(Double value) {
		this.lob = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOB_: 
	 */
	public Jbpm4VariableQueryCondition setLobConditionBegin(Double value) {
		this.lobBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOB_: 
	 */
	public Jbpm4VariableQueryCondition setLobConditionEnd(Double value) {
		this.lobEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件LOB_: 
	 */
	public Jbpm4VariableQueryCondition setLobConditionEndEqual(Double value) {
		this.lobEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DATE_VALUE_: 
	 */
	public Jbpm4VariableQueryCondition setDateValueCondition(java.util.Date value) {
		this.dateValue = value;
		return this;
	}
	
	/**
	 * 设置查询条件DATE_VALUE_: 
	 */
	public Jbpm4VariableQueryCondition setDateValueConditionBegin(java.util.Date value) {
		this.dateValueBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DATE_VALUE_: 
	 */
	public Jbpm4VariableQueryCondition setDateValueConditionEnd(java.util.Date value) {
		this.dateValueEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DATE_VALUE_: 
	 */
	public Jbpm4VariableQueryCondition setDateValueConditionEndEqual(java.util.Date value) {
		this.dateValueEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DOUBLE_VALUE_: 
	 */
	public Jbpm4VariableQueryCondition setDoubleValueCondition(Double value) {
		this.doubleValue = value;
		return this;
	}
	
	/**
	 * 设置查询条件DOUBLE_VALUE_: 
	 */
	public Jbpm4VariableQueryCondition setDoubleValueConditionBegin(Double value) {
		this.doubleValueBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DOUBLE_VALUE_: 
	 */
	public Jbpm4VariableQueryCondition setDoubleValueConditionEnd(Double value) {
		this.doubleValueEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DOUBLE_VALUE_: 
	 */
	public Jbpm4VariableQueryCondition setDoubleValueConditionEndEqual(Double value) {
		this.doubleValueEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CLASSNAME_: 
	 */
	public Jbpm4VariableQueryCondition setClassnameCondition(String value) {
		this.classname = value;
		return this;
	}
	
	/**
	 * 设置查询条件CLASSNAME_: 
	 */
	public Jbpm4VariableQueryCondition setClassnameConditionEqual(String value) {
		this.classnameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件LONG_VALUE_: 
	 */
	public Jbpm4VariableQueryCondition setLongValueCondition(Double value) {
		this.longValue = value;
		return this;
	}
	
	/**
	 * 设置查询条件LONG_VALUE_: 
	 */
	public Jbpm4VariableQueryCondition setLongValueConditionBegin(Double value) {
		this.longValueBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件LONG_VALUE_: 
	 */
	public Jbpm4VariableQueryCondition setLongValueConditionEnd(Double value) {
		this.longValueEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件LONG_VALUE_: 
	 */
	public Jbpm4VariableQueryCondition setLongValueConditionEndEqual(Double value) {
		this.longValueEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件STRING_VALUE_: 
	 */
	public Jbpm4VariableQueryCondition setStringValueCondition(String value) {
		this.stringValue = value;
		return this;
	}
	
	/**
	 * 设置查询条件STRING_VALUE_: 
	 */
	public Jbpm4VariableQueryCondition setStringValueConditionEqual(String value) {
		this.stringValueEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEXT_VALUE_: 
	 */
	public Jbpm4VariableQueryCondition setTextValueCondition(String value) {
		this.textValue = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEXT_VALUE_: 
	 */
	public Jbpm4VariableQueryCondition setTextValueConditionEqual(String value) {
		this.textValueEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXESYS_: 
	 */
	public Jbpm4VariableQueryCondition setExesysCondition(Double value) {
		this.exesys = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXESYS_: 
	 */
	public Jbpm4VariableQueryCondition setExesysConditionBegin(Double value) {
		this.exesysBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXESYS_: 
	 */
	public Jbpm4VariableQueryCondition setExesysConditionEnd(Double value) {
		this.exesysEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件EXESYS_: 
	 */
	public Jbpm4VariableQueryCondition setExesysConditionEndEqual(Double value) {
		this.exesysEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.dbid == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_VARIABLE].[DBID_] = " + this.dbid) 
						+ ") "));
		}
		if ((this.dbidBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[DBID_] >= " 
						+ (this.dbidBegin + ")")));
		}
		if ((this.dbidEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[DBID_] < " 
						+ (this.dbidEnd + ") ")));
		}
		if ((this.dbidEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[DBID_] <= " 
						+ (this.dbidEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.class_)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_VARIABLE].[CLASS_]", this.class_)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.class_Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_VARIABLE].[CLASS_] = " + SqlServerUtils.safeSql(this.class_Equal))) 
						+ ") "));
		}
		if ((this.dbversion == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_VARIABLE].[DBVERSION_] = " + this.dbversion) 
						+ ") "));
		}
		if ((this.dbversionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[DBVERSION_] >= " 
						+ (this.dbversionBegin + ")")));
		}
		if ((this.dbversionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[DBVERSION_] < " 
						+ (this.dbversionEnd + ") ")));
		}
		if ((this.dbversionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[DBVERSION_] <= " 
						+ (this.dbversionEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.key)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_VARIABLE].[KEY_]", this.key)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.keyEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_VARIABLE].[KEY_] = " + SqlServerUtils.safeSql(this.keyEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.converter)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_VARIABLE].[CONVERTER_]", this.converter)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.converterEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_VARIABLE].[CONVERTER_] = " + SqlServerUtils.safeSql(this.converterEqual))) 
						+ ") "));
		}
		if ((this.hist == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_VARIABLE].[HIST_] = " + this.hist) 
						+ ") "));
		}
		if ((this.histBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[HIST_] >= " 
						+ (this.histBegin + ")")));
		}
		if ((this.histEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[HIST_] < " 
						+ (this.histEnd + ") ")));
		}
		if ((this.histEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[HIST_] <= " 
						+ (this.histEndEqual + ") ")));
		}
		if ((this.execution == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_VARIABLE].[EXECUTION_] = " + this.execution) 
						+ ") "));
		}
		if ((this.executionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[EXECUTION_] >= " 
						+ (this.executionBegin + ")")));
		}
		if ((this.executionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[EXECUTION_] < " 
						+ (this.executionEnd + ") ")));
		}
		if ((this.executionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[EXECUTION_] <= " 
						+ (this.executionEndEqual + ") ")));
		}
		if ((this.task == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_VARIABLE].[TASK_] = " + this.task) 
						+ ") "));
		}
		if ((this.taskBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[TASK_] >= " 
						+ (this.taskBegin + ")")));
		}
		if ((this.taskEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[TASK_] < " 
						+ (this.taskEnd + ") ")));
		}
		if ((this.taskEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[TASK_] <= " 
						+ (this.taskEndEqual + ") ")));
		}
		if ((this.lob == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_VARIABLE].[LOB_] = " + this.lob) 
						+ ") "));
		}
		if ((this.lobBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[LOB_] >= " 
						+ (this.lobBegin + ")")));
		}
		if ((this.lobEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[LOB_] < " 
						+ (this.lobEnd + ") ")));
		}
		if ((this.lobEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[LOB_] <= " 
						+ (this.lobEndEqual + ") ")));
		}
		if ((this.dateValue == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_VARIABLE].[DATE_VALUE_] = " + SqlServerUtils.getDateSql(this.dateValue)) 
						+ ") "));
		}
		if ((this.dateValueBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[DATE_VALUE_] >= " 
						+ (SqlServerUtils.getDateSql(this.dateValueBegin) + ")")));
		}
		if ((this.dateValueEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[DATE_VALUE_] < " 
						+ (SqlServerUtils.getDateSql(this.dateValueEnd) + ") ")));
		}
		if ((this.dateValueEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[DATE_VALUE_] < " 
						+ (SqlServerUtils.getNextDateSql(this.dateValueEndEqual) + ") ")));
		}
		if ((this.doubleValue == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_VARIABLE].[DOUBLE_VALUE_] = " + this.doubleValue) 
						+ ") "));
		}
		if ((this.doubleValueBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[DOUBLE_VALUE_] >= " 
						+ (this.doubleValueBegin + ")")));
		}
		if ((this.doubleValueEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[DOUBLE_VALUE_] < " 
						+ (this.doubleValueEnd + ") ")));
		}
		if ((this.doubleValueEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[DOUBLE_VALUE_] <= " 
						+ (this.doubleValueEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.classname)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_VARIABLE].[CLASSNAME_]", this.classname)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.classnameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_VARIABLE].[CLASSNAME_] = " + SqlServerUtils.safeSql(this.classnameEqual))) 
						+ ") "));
		}
		if ((this.longValue == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_VARIABLE].[LONG_VALUE_] = " + this.longValue) 
						+ ") "));
		}
		if ((this.longValueBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[LONG_VALUE_] >= " 
						+ (this.longValueBegin + ")")));
		}
		if ((this.longValueEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[LONG_VALUE_] < " 
						+ (this.longValueEnd + ") ")));
		}
		if ((this.longValueEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[LONG_VALUE_] <= " 
						+ (this.longValueEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.stringValue)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_VARIABLE].[STRING_VALUE_]", this.stringValue)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.stringValueEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_VARIABLE].[STRING_VALUE_] = " + SqlServerUtils.safeSql(this.stringValueEqual))) 
						+ ") "));
		}
		if ((this.exesys == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_VARIABLE].[EXESYS_] = " + this.exesys) 
						+ ") "));
		}
		if ((this.exesysBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[EXESYS_] >= " 
						+ (this.exesysBegin + ")")));
		}
		if ((this.exesysEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[EXESYS_] < " 
						+ (this.exesysEnd + ") ")));
		}
		if ((this.exesysEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_VARIABLE].[EXESYS_] <= " 
						+ (this.exesysEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
