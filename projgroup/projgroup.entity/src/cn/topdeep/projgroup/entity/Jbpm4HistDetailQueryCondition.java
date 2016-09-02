package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_HIST_DETAIL查询条件定义
 */
public class Jbpm4HistDetailQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,USERID_: 
	 */
	String userid;
	
	/**
	 * 查询条件字符串相等,USERID_: 
	 */
	String useridEqual;
	
	/**
	 * 查询条件,TIME_: 
	 */
	java.util.Date time;
	
	/**
	 * 查询条件开始值,TIME_: 
	 */
	java.util.Date timeBegin;
	
	/**
	 * 查询条件结束值,TIME_: 
	 */
	java.util.Date timeEnd;
	
	/**
	 * 查询条件结束值,TIME_: 
	 */
	java.util.Date timeEndEqual;
	
	/**
	 * 查询条件,HPROCI_: 
	 */
	Double hproci;
	
	/**
	 * 查询条件开始值,HPROCI_: 
	 */
	Double hprociBegin;
	
	/**
	 * 查询条件结束值,HPROCI_: 
	 */
	Double hprociEnd;
	
	/**
	 * 查询条件结束值,HPROCI_: 
	 */
	Double hprociEndEqual;
	
	/**
	 * 查询条件,HPROCIIDX_: 
	 */
	Integer hprociidx;
	
	/**
	 * 查询条件开始值,HPROCIIDX_: 
	 */
	Integer hprociidxBegin;
	
	/**
	 * 查询条件结束值,HPROCIIDX_: 
	 */
	Integer hprociidxEnd;
	
	/**
	 * 查询条件结束值,HPROCIIDX_: 
	 */
	Integer hprociidxEndEqual;
	
	/**
	 * 查询条件,HACTI_: 
	 */
	Double hacti;
	
	/**
	 * 查询条件开始值,HACTI_: 
	 */
	Double hactiBegin;
	
	/**
	 * 查询条件结束值,HACTI_: 
	 */
	Double hactiEnd;
	
	/**
	 * 查询条件结束值,HACTI_: 
	 */
	Double hactiEndEqual;
	
	/**
	 * 查询条件,HACTIIDX_: 
	 */
	Integer hactiidx;
	
	/**
	 * 查询条件开始值,HACTIIDX_: 
	 */
	Integer hactiidxBegin;
	
	/**
	 * 查询条件结束值,HACTIIDX_: 
	 */
	Integer hactiidxEnd;
	
	/**
	 * 查询条件结束值,HACTIIDX_: 
	 */
	Integer hactiidxEndEqual;
	
	/**
	 * 查询条件,HTASK_: 
	 */
	Double htask;
	
	/**
	 * 查询条件开始值,HTASK_: 
	 */
	Double htaskBegin;
	
	/**
	 * 查询条件结束值,HTASK_: 
	 */
	Double htaskEnd;
	
	/**
	 * 查询条件结束值,HTASK_: 
	 */
	Double htaskEndEqual;
	
	/**
	 * 查询条件,HTASKIDX_: 
	 */
	Integer htaskidx;
	
	/**
	 * 查询条件开始值,HTASKIDX_: 
	 */
	Integer htaskidxBegin;
	
	/**
	 * 查询条件结束值,HTASKIDX_: 
	 */
	Integer htaskidxEnd;
	
	/**
	 * 查询条件结束值,HTASKIDX_: 
	 */
	Integer htaskidxEndEqual;
	
	/**
	 * 查询条件,HVAR_: 
	 */
	Double hvar;
	
	/**
	 * 查询条件开始值,HVAR_: 
	 */
	Double hvarBegin;
	
	/**
	 * 查询条件结束值,HVAR_: 
	 */
	Double hvarEnd;
	
	/**
	 * 查询条件结束值,HVAR_: 
	 */
	Double hvarEndEqual;
	
	/**
	 * 查询条件,HVARIDX_: 
	 */
	Integer hvaridx;
	
	/**
	 * 查询条件开始值,HVARIDX_: 
	 */
	Integer hvaridxBegin;
	
	/**
	 * 查询条件结束值,HVARIDX_: 
	 */
	Integer hvaridxEnd;
	
	/**
	 * 查询条件结束值,HVARIDX_: 
	 */
	Integer hvaridxEndEqual;
	
	/**
	 * 查询条件,MESSAGE_: 
	 */
	String message;
	
	/**
	 * 查询条件字符串相等,MESSAGE_: 
	 */
	String messageEqual;
	
	/**
	 * 查询条件,OLD_STR_: 
	 */
	String oldStr;
	
	/**
	 * 查询条件字符串相等,OLD_STR_: 
	 */
	String oldStrEqual;
	
	/**
	 * 查询条件,NEW_STR_: 
	 */
	String newStr;
	
	/**
	 * 查询条件字符串相等,NEW_STR_: 
	 */
	String newStrEqual;
	
	/**
	 * 查询条件,OLD_INT_: 
	 */
	Integer oldInt;
	
	/**
	 * 查询条件开始值,OLD_INT_: 
	 */
	Integer oldIntBegin;
	
	/**
	 * 查询条件结束值,OLD_INT_: 
	 */
	Integer oldIntEnd;
	
	/**
	 * 查询条件结束值,OLD_INT_: 
	 */
	Integer oldIntEndEqual;
	
	/**
	 * 查询条件,NEW_INT_: 
	 */
	Integer newInt;
	
	/**
	 * 查询条件开始值,NEW_INT_: 
	 */
	Integer newIntBegin;
	
	/**
	 * 查询条件结束值,NEW_INT_: 
	 */
	Integer newIntEnd;
	
	/**
	 * 查询条件结束值,NEW_INT_: 
	 */
	Integer newIntEndEqual;
	
	/**
	 * 查询条件,OLD_TIME_: 
	 */
	java.util.Date oldTime;
	
	/**
	 * 查询条件开始值,OLD_TIME_: 
	 */
	java.util.Date oldTimeBegin;
	
	/**
	 * 查询条件结束值,OLD_TIME_: 
	 */
	java.util.Date oldTimeEnd;
	
	/**
	 * 查询条件结束值,OLD_TIME_: 
	 */
	java.util.Date oldTimeEndEqual;
	
	/**
	 * 查询条件,NEW_TIME_: 
	 */
	java.util.Date newTime;
	
	/**
	 * 查询条件开始值,NEW_TIME_: 
	 */
	java.util.Date newTimeBegin;
	
	/**
	 * 查询条件结束值,NEW_TIME_: 
	 */
	java.util.Date newTimeEnd;
	
	/**
	 * 查询条件结束值,NEW_TIME_: 
	 */
	java.util.Date newTimeEndEqual;
	
	/**
	 * 查询条件,PARENT_: 
	 */
	Double parent;
	
	/**
	 * 查询条件开始值,PARENT_: 
	 */
	Double parentBegin;
	
	/**
	 * 查询条件结束值,PARENT_: 
	 */
	Double parentEnd;
	
	/**
	 * 查询条件结束值,PARENT_: 
	 */
	Double parentEndEqual;
	
	/**
	 * 查询条件,PARENT_IDX_: 
	 */
	Integer parentIdx;
	
	/**
	 * 查询条件开始值,PARENT_IDX_: 
	 */
	Integer parentIdxBegin;
	
	/**
	 * 查询条件结束值,PARENT_IDX_: 
	 */
	Integer parentIdxEnd;
	
	/**
	 * 查询条件结束值,PARENT_IDX_: 
	 */
	Integer parentIdxEndEqual;
	
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
	 * USERID_: 
	 */
	public String getUserid() {
		return this.userid;
	}
	
	/**
	 * USERID_: 
	 */
	public void setUserid(String value)
	 {
		this.userid = value;
	}
	
	/**
	 * 查询条件字符串相等,USERID_: 
	 */
	public String getUseridEqual() {
		return this.useridEqual;
	}
	
	/**
	 * 查询条件字符串相等,USERID_: 
	 */
	public void setUseridEqual(String value)
	 {
		this.useridEqual = value;
	}
	
	/**
	 * TIME_: 
	 */
	public java.util.Date getTime() {
		return this.time;
	}
	
	/**
	 * TIME_: 
	 */
	public void setTime(java.util.Date value)
	 {
		this.time = value;
	}
	
	/**
	 * 查询条件开始值,TIME_: 
	 */
	public java.util.Date getTimeBegin() {
		return this.timeBegin;
	}
	
	/**
	 * 查询条件开始值,TIME_: 
	 */
	public void setTimeBegin(java.util.Date value)
	 {
		this.timeBegin = value;
	}
	
	/**
	 * 查询条件结束值,TIME_: 
	 */
	public java.util.Date getTimeEnd() {
		return this.timeEnd;
	}
	
	/**
	 * 查询条件结束值,TIME_: 
	 */
	public void setTimeEnd(java.util.Date value)
	 {
		this.timeEnd = value;
	}
	
	/**
	 * 查询条件结束值,TIME_: 
	 */
	public java.util.Date getTimeEndEqual() {
		return this.timeEndEqual;
	}
	
	/**
	 * 查询条件结束值,TIME_: 
	 */
	public void setTimeEndEqual(java.util.Date value)
	 {
		this.timeEndEqual = value;
	}
	
	/**
	 * HPROCI_: 
	 */
	public Double getHproci() {
		return this.hproci;
	}
	
	/**
	 * HPROCI_: 
	 */
	public void setHproci(Double value)
	 {
		this.hproci = value;
	}
	
	/**
	 * 查询条件开始值,HPROCI_: 
	 */
	public Double getHprociBegin() {
		return this.hprociBegin;
	}
	
	/**
	 * 查询条件开始值,HPROCI_: 
	 */
	public void setHprociBegin(Double value)
	 {
		this.hprociBegin = value;
	}
	
	/**
	 * 查询条件结束值,HPROCI_: 
	 */
	public Double getHprociEnd() {
		return this.hprociEnd;
	}
	
	/**
	 * 查询条件结束值,HPROCI_: 
	 */
	public void setHprociEnd(Double value)
	 {
		this.hprociEnd = value;
	}
	
	/**
	 * 查询条件结束值,HPROCI_: 
	 */
	public Double getHprociEndEqual() {
		return this.hprociEndEqual;
	}
	
	/**
	 * 查询条件结束值,HPROCI_: 
	 */
	public void setHprociEndEqual(Double value)
	 {
		this.hprociEndEqual = value;
	}
	
	/**
	 * HPROCIIDX_: 
	 */
	public Integer getHprociidx() {
		return this.hprociidx;
	}
	
	/**
	 * HPROCIIDX_: 
	 */
	public void setHprociidx(Integer value)
	 {
		this.hprociidx = value;
	}
	
	/**
	 * 查询条件开始值,HPROCIIDX_: 
	 */
	public Integer getHprociidxBegin() {
		return this.hprociidxBegin;
	}
	
	/**
	 * 查询条件开始值,HPROCIIDX_: 
	 */
	public void setHprociidxBegin(Integer value)
	 {
		this.hprociidxBegin = value;
	}
	
	/**
	 * 查询条件结束值,HPROCIIDX_: 
	 */
	public Integer getHprociidxEnd() {
		return this.hprociidxEnd;
	}
	
	/**
	 * 查询条件结束值,HPROCIIDX_: 
	 */
	public void setHprociidxEnd(Integer value)
	 {
		this.hprociidxEnd = value;
	}
	
	/**
	 * 查询条件结束值,HPROCIIDX_: 
	 */
	public Integer getHprociidxEndEqual() {
		return this.hprociidxEndEqual;
	}
	
	/**
	 * 查询条件结束值,HPROCIIDX_: 
	 */
	public void setHprociidxEndEqual(Integer value)
	 {
		this.hprociidxEndEqual = value;
	}
	
	/**
	 * HACTI_: 
	 */
	public Double getHacti() {
		return this.hacti;
	}
	
	/**
	 * HACTI_: 
	 */
	public void setHacti(Double value)
	 {
		this.hacti = value;
	}
	
	/**
	 * 查询条件开始值,HACTI_: 
	 */
	public Double getHactiBegin() {
		return this.hactiBegin;
	}
	
	/**
	 * 查询条件开始值,HACTI_: 
	 */
	public void setHactiBegin(Double value)
	 {
		this.hactiBegin = value;
	}
	
	/**
	 * 查询条件结束值,HACTI_: 
	 */
	public Double getHactiEnd() {
		return this.hactiEnd;
	}
	
	/**
	 * 查询条件结束值,HACTI_: 
	 */
	public void setHactiEnd(Double value)
	 {
		this.hactiEnd = value;
	}
	
	/**
	 * 查询条件结束值,HACTI_: 
	 */
	public Double getHactiEndEqual() {
		return this.hactiEndEqual;
	}
	
	/**
	 * 查询条件结束值,HACTI_: 
	 */
	public void setHactiEndEqual(Double value)
	 {
		this.hactiEndEqual = value;
	}
	
	/**
	 * HACTIIDX_: 
	 */
	public Integer getHactiidx() {
		return this.hactiidx;
	}
	
	/**
	 * HACTIIDX_: 
	 */
	public void setHactiidx(Integer value)
	 {
		this.hactiidx = value;
	}
	
	/**
	 * 查询条件开始值,HACTIIDX_: 
	 */
	public Integer getHactiidxBegin() {
		return this.hactiidxBegin;
	}
	
	/**
	 * 查询条件开始值,HACTIIDX_: 
	 */
	public void setHactiidxBegin(Integer value)
	 {
		this.hactiidxBegin = value;
	}
	
	/**
	 * 查询条件结束值,HACTIIDX_: 
	 */
	public Integer getHactiidxEnd() {
		return this.hactiidxEnd;
	}
	
	/**
	 * 查询条件结束值,HACTIIDX_: 
	 */
	public void setHactiidxEnd(Integer value)
	 {
		this.hactiidxEnd = value;
	}
	
	/**
	 * 查询条件结束值,HACTIIDX_: 
	 */
	public Integer getHactiidxEndEqual() {
		return this.hactiidxEndEqual;
	}
	
	/**
	 * 查询条件结束值,HACTIIDX_: 
	 */
	public void setHactiidxEndEqual(Integer value)
	 {
		this.hactiidxEndEqual = value;
	}
	
	/**
	 * HTASK_: 
	 */
	public Double getHtask() {
		return this.htask;
	}
	
	/**
	 * HTASK_: 
	 */
	public void setHtask(Double value)
	 {
		this.htask = value;
	}
	
	/**
	 * 查询条件开始值,HTASK_: 
	 */
	public Double getHtaskBegin() {
		return this.htaskBegin;
	}
	
	/**
	 * 查询条件开始值,HTASK_: 
	 */
	public void setHtaskBegin(Double value)
	 {
		this.htaskBegin = value;
	}
	
	/**
	 * 查询条件结束值,HTASK_: 
	 */
	public Double getHtaskEnd() {
		return this.htaskEnd;
	}
	
	/**
	 * 查询条件结束值,HTASK_: 
	 */
	public void setHtaskEnd(Double value)
	 {
		this.htaskEnd = value;
	}
	
	/**
	 * 查询条件结束值,HTASK_: 
	 */
	public Double getHtaskEndEqual() {
		return this.htaskEndEqual;
	}
	
	/**
	 * 查询条件结束值,HTASK_: 
	 */
	public void setHtaskEndEqual(Double value)
	 {
		this.htaskEndEqual = value;
	}
	
	/**
	 * HTASKIDX_: 
	 */
	public Integer getHtaskidx() {
		return this.htaskidx;
	}
	
	/**
	 * HTASKIDX_: 
	 */
	public void setHtaskidx(Integer value)
	 {
		this.htaskidx = value;
	}
	
	/**
	 * 查询条件开始值,HTASKIDX_: 
	 */
	public Integer getHtaskidxBegin() {
		return this.htaskidxBegin;
	}
	
	/**
	 * 查询条件开始值,HTASKIDX_: 
	 */
	public void setHtaskidxBegin(Integer value)
	 {
		this.htaskidxBegin = value;
	}
	
	/**
	 * 查询条件结束值,HTASKIDX_: 
	 */
	public Integer getHtaskidxEnd() {
		return this.htaskidxEnd;
	}
	
	/**
	 * 查询条件结束值,HTASKIDX_: 
	 */
	public void setHtaskidxEnd(Integer value)
	 {
		this.htaskidxEnd = value;
	}
	
	/**
	 * 查询条件结束值,HTASKIDX_: 
	 */
	public Integer getHtaskidxEndEqual() {
		return this.htaskidxEndEqual;
	}
	
	/**
	 * 查询条件结束值,HTASKIDX_: 
	 */
	public void setHtaskidxEndEqual(Integer value)
	 {
		this.htaskidxEndEqual = value;
	}
	
	/**
	 * HVAR_: 
	 */
	public Double getHvar() {
		return this.hvar;
	}
	
	/**
	 * HVAR_: 
	 */
	public void setHvar(Double value)
	 {
		this.hvar = value;
	}
	
	/**
	 * 查询条件开始值,HVAR_: 
	 */
	public Double getHvarBegin() {
		return this.hvarBegin;
	}
	
	/**
	 * 查询条件开始值,HVAR_: 
	 */
	public void setHvarBegin(Double value)
	 {
		this.hvarBegin = value;
	}
	
	/**
	 * 查询条件结束值,HVAR_: 
	 */
	public Double getHvarEnd() {
		return this.hvarEnd;
	}
	
	/**
	 * 查询条件结束值,HVAR_: 
	 */
	public void setHvarEnd(Double value)
	 {
		this.hvarEnd = value;
	}
	
	/**
	 * 查询条件结束值,HVAR_: 
	 */
	public Double getHvarEndEqual() {
		return this.hvarEndEqual;
	}
	
	/**
	 * 查询条件结束值,HVAR_: 
	 */
	public void setHvarEndEqual(Double value)
	 {
		this.hvarEndEqual = value;
	}
	
	/**
	 * HVARIDX_: 
	 */
	public Integer getHvaridx() {
		return this.hvaridx;
	}
	
	/**
	 * HVARIDX_: 
	 */
	public void setHvaridx(Integer value)
	 {
		this.hvaridx = value;
	}
	
	/**
	 * 查询条件开始值,HVARIDX_: 
	 */
	public Integer getHvaridxBegin() {
		return this.hvaridxBegin;
	}
	
	/**
	 * 查询条件开始值,HVARIDX_: 
	 */
	public void setHvaridxBegin(Integer value)
	 {
		this.hvaridxBegin = value;
	}
	
	/**
	 * 查询条件结束值,HVARIDX_: 
	 */
	public Integer getHvaridxEnd() {
		return this.hvaridxEnd;
	}
	
	/**
	 * 查询条件结束值,HVARIDX_: 
	 */
	public void setHvaridxEnd(Integer value)
	 {
		this.hvaridxEnd = value;
	}
	
	/**
	 * 查询条件结束值,HVARIDX_: 
	 */
	public Integer getHvaridxEndEqual() {
		return this.hvaridxEndEqual;
	}
	
	/**
	 * 查询条件结束值,HVARIDX_: 
	 */
	public void setHvaridxEndEqual(Integer value)
	 {
		this.hvaridxEndEqual = value;
	}
	
	/**
	 * MESSAGE_: 
	 */
	public String getMessage() {
		return this.message;
	}
	
	/**
	 * MESSAGE_: 
	 */
	public void setMessage(String value)
	 {
		this.message = value;
	}
	
	/**
	 * 查询条件字符串相等,MESSAGE_: 
	 */
	public String getMessageEqual() {
		return this.messageEqual;
	}
	
	/**
	 * 查询条件字符串相等,MESSAGE_: 
	 */
	public void setMessageEqual(String value)
	 {
		this.messageEqual = value;
	}
	
	/**
	 * OLD_STR_: 
	 */
	public String getOldStr() {
		return this.oldStr;
	}
	
	/**
	 * OLD_STR_: 
	 */
	public void setOldStr(String value)
	 {
		this.oldStr = value;
	}
	
	/**
	 * 查询条件字符串相等,OLD_STR_: 
	 */
	public String getOldStrEqual() {
		return this.oldStrEqual;
	}
	
	/**
	 * 查询条件字符串相等,OLD_STR_: 
	 */
	public void setOldStrEqual(String value)
	 {
		this.oldStrEqual = value;
	}
	
	/**
	 * NEW_STR_: 
	 */
	public String getNewStr() {
		return this.newStr;
	}
	
	/**
	 * NEW_STR_: 
	 */
	public void setNewStr(String value)
	 {
		this.newStr = value;
	}
	
	/**
	 * 查询条件字符串相等,NEW_STR_: 
	 */
	public String getNewStrEqual() {
		return this.newStrEqual;
	}
	
	/**
	 * 查询条件字符串相等,NEW_STR_: 
	 */
	public void setNewStrEqual(String value)
	 {
		this.newStrEqual = value;
	}
	
	/**
	 * OLD_INT_: 
	 */
	public Integer getOldInt() {
		return this.oldInt;
	}
	
	/**
	 * OLD_INT_: 
	 */
	public void setOldInt(Integer value)
	 {
		this.oldInt = value;
	}
	
	/**
	 * 查询条件开始值,OLD_INT_: 
	 */
	public Integer getOldIntBegin() {
		return this.oldIntBegin;
	}
	
	/**
	 * 查询条件开始值,OLD_INT_: 
	 */
	public void setOldIntBegin(Integer value)
	 {
		this.oldIntBegin = value;
	}
	
	/**
	 * 查询条件结束值,OLD_INT_: 
	 */
	public Integer getOldIntEnd() {
		return this.oldIntEnd;
	}
	
	/**
	 * 查询条件结束值,OLD_INT_: 
	 */
	public void setOldIntEnd(Integer value)
	 {
		this.oldIntEnd = value;
	}
	
	/**
	 * 查询条件结束值,OLD_INT_: 
	 */
	public Integer getOldIntEndEqual() {
		return this.oldIntEndEqual;
	}
	
	/**
	 * 查询条件结束值,OLD_INT_: 
	 */
	public void setOldIntEndEqual(Integer value)
	 {
		this.oldIntEndEqual = value;
	}
	
	/**
	 * NEW_INT_: 
	 */
	public Integer getNewInt() {
		return this.newInt;
	}
	
	/**
	 * NEW_INT_: 
	 */
	public void setNewInt(Integer value)
	 {
		this.newInt = value;
	}
	
	/**
	 * 查询条件开始值,NEW_INT_: 
	 */
	public Integer getNewIntBegin() {
		return this.newIntBegin;
	}
	
	/**
	 * 查询条件开始值,NEW_INT_: 
	 */
	public void setNewIntBegin(Integer value)
	 {
		this.newIntBegin = value;
	}
	
	/**
	 * 查询条件结束值,NEW_INT_: 
	 */
	public Integer getNewIntEnd() {
		return this.newIntEnd;
	}
	
	/**
	 * 查询条件结束值,NEW_INT_: 
	 */
	public void setNewIntEnd(Integer value)
	 {
		this.newIntEnd = value;
	}
	
	/**
	 * 查询条件结束值,NEW_INT_: 
	 */
	public Integer getNewIntEndEqual() {
		return this.newIntEndEqual;
	}
	
	/**
	 * 查询条件结束值,NEW_INT_: 
	 */
	public void setNewIntEndEqual(Integer value)
	 {
		this.newIntEndEqual = value;
	}
	
	/**
	 * OLD_TIME_: 
	 */
	public java.util.Date getOldTime() {
		return this.oldTime;
	}
	
	/**
	 * OLD_TIME_: 
	 */
	public void setOldTime(java.util.Date value)
	 {
		this.oldTime = value;
	}
	
	/**
	 * 查询条件开始值,OLD_TIME_: 
	 */
	public java.util.Date getOldTimeBegin() {
		return this.oldTimeBegin;
	}
	
	/**
	 * 查询条件开始值,OLD_TIME_: 
	 */
	public void setOldTimeBegin(java.util.Date value)
	 {
		this.oldTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,OLD_TIME_: 
	 */
	public java.util.Date getOldTimeEnd() {
		return this.oldTimeEnd;
	}
	
	/**
	 * 查询条件结束值,OLD_TIME_: 
	 */
	public void setOldTimeEnd(java.util.Date value)
	 {
		this.oldTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,OLD_TIME_: 
	 */
	public java.util.Date getOldTimeEndEqual() {
		return this.oldTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,OLD_TIME_: 
	 */
	public void setOldTimeEndEqual(java.util.Date value)
	 {
		this.oldTimeEndEqual = value;
	}
	
	/**
	 * NEW_TIME_: 
	 */
	public java.util.Date getNewTime() {
		return this.newTime;
	}
	
	/**
	 * NEW_TIME_: 
	 */
	public void setNewTime(java.util.Date value)
	 {
		this.newTime = value;
	}
	
	/**
	 * 查询条件开始值,NEW_TIME_: 
	 */
	public java.util.Date getNewTimeBegin() {
		return this.newTimeBegin;
	}
	
	/**
	 * 查询条件开始值,NEW_TIME_: 
	 */
	public void setNewTimeBegin(java.util.Date value)
	 {
		this.newTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,NEW_TIME_: 
	 */
	public java.util.Date getNewTimeEnd() {
		return this.newTimeEnd;
	}
	
	/**
	 * 查询条件结束值,NEW_TIME_: 
	 */
	public void setNewTimeEnd(java.util.Date value)
	 {
		this.newTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,NEW_TIME_: 
	 */
	public java.util.Date getNewTimeEndEqual() {
		return this.newTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,NEW_TIME_: 
	 */
	public void setNewTimeEndEqual(java.util.Date value)
	 {
		this.newTimeEndEqual = value;
	}
	
	/**
	 * PARENT_: 
	 */
	public Double getParent() {
		return this.parent;
	}
	
	/**
	 * PARENT_: 
	 */
	public void setParent(Double value)
	 {
		this.parent = value;
	}
	
	/**
	 * 查询条件开始值,PARENT_: 
	 */
	public Double getParentBegin() {
		return this.parentBegin;
	}
	
	/**
	 * 查询条件开始值,PARENT_: 
	 */
	public void setParentBegin(Double value)
	 {
		this.parentBegin = value;
	}
	
	/**
	 * 查询条件结束值,PARENT_: 
	 */
	public Double getParentEnd() {
		return this.parentEnd;
	}
	
	/**
	 * 查询条件结束值,PARENT_: 
	 */
	public void setParentEnd(Double value)
	 {
		this.parentEnd = value;
	}
	
	/**
	 * 查询条件结束值,PARENT_: 
	 */
	public Double getParentEndEqual() {
		return this.parentEndEqual;
	}
	
	/**
	 * 查询条件结束值,PARENT_: 
	 */
	public void setParentEndEqual(Double value)
	 {
		this.parentEndEqual = value;
	}
	
	/**
	 * PARENT_IDX_: 
	 */
	public Integer getParentIdx() {
		return this.parentIdx;
	}
	
	/**
	 * PARENT_IDX_: 
	 */
	public void setParentIdx(Integer value)
	 {
		this.parentIdx = value;
	}
	
	/**
	 * 查询条件开始值,PARENT_IDX_: 
	 */
	public Integer getParentIdxBegin() {
		return this.parentIdxBegin;
	}
	
	/**
	 * 查询条件开始值,PARENT_IDX_: 
	 */
	public void setParentIdxBegin(Integer value)
	 {
		this.parentIdxBegin = value;
	}
	
	/**
	 * 查询条件结束值,PARENT_IDX_: 
	 */
	public Integer getParentIdxEnd() {
		return this.parentIdxEnd;
	}
	
	/**
	 * 查询条件结束值,PARENT_IDX_: 
	 */
	public void setParentIdxEnd(Integer value)
	 {
		this.parentIdxEnd = value;
	}
	
	/**
	 * 查询条件结束值,PARENT_IDX_: 
	 */
	public Integer getParentIdxEndEqual() {
		return this.parentIdxEndEqual;
	}
	
	/**
	 * 查询条件结束值,PARENT_IDX_: 
	 */
	public void setParentIdxEndEqual(Integer value)
	 {
		this.parentIdxEndEqual = value;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4HistDetailQueryCondition setDbidCondition(Double value) {
		this.dbid = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4HistDetailQueryCondition setDbidConditionBegin(Double value) {
		this.dbidBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4HistDetailQueryCondition setDbidConditionEnd(Double value) {
		this.dbidEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBID_: 
	 */
	public Jbpm4HistDetailQueryCondition setDbidConditionEndEqual(Double value) {
		this.dbidEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CLASS_: 
	 */
	public Jbpm4HistDetailQueryCondition setClass_Condition(String value) {
		this.class_ = value;
		return this;
	}
	
	/**
	 * 设置查询条件CLASS_: 
	 */
	public Jbpm4HistDetailQueryCondition setClass_ConditionEqual(String value) {
		this.class_Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4HistDetailQueryCondition setDbversionCondition(Integer value) {
		this.dbversion = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4HistDetailQueryCondition setDbversionConditionBegin(Integer value) {
		this.dbversionBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4HistDetailQueryCondition setDbversionConditionEnd(Integer value) {
		this.dbversionEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件DBVERSION_: 
	 */
	public Jbpm4HistDetailQueryCondition setDbversionConditionEndEqual(Integer value) {
		this.dbversionEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件USERID_: 
	 */
	public Jbpm4HistDetailQueryCondition setUseridCondition(String value) {
		this.userid = value;
		return this;
	}
	
	/**
	 * 设置查询条件USERID_: 
	 */
	public Jbpm4HistDetailQueryCondition setUseridConditionEqual(String value) {
		this.useridEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TIME_: 
	 */
	public Jbpm4HistDetailQueryCondition setTimeCondition(java.util.Date value) {
		this.time = value;
		return this;
	}
	
	/**
	 * 设置查询条件TIME_: 
	 */
	public Jbpm4HistDetailQueryCondition setTimeConditionBegin(java.util.Date value) {
		this.timeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TIME_: 
	 */
	public Jbpm4HistDetailQueryCondition setTimeConditionEnd(java.util.Date value) {
		this.timeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TIME_: 
	 */
	public Jbpm4HistDetailQueryCondition setTimeConditionEndEqual(java.util.Date value) {
		this.timeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件HPROCI_: 
	 */
	public Jbpm4HistDetailQueryCondition setHprociCondition(Double value) {
		this.hproci = value;
		return this;
	}
	
	/**
	 * 设置查询条件HPROCI_: 
	 */
	public Jbpm4HistDetailQueryCondition setHprociConditionBegin(Double value) {
		this.hprociBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件HPROCI_: 
	 */
	public Jbpm4HistDetailQueryCondition setHprociConditionEnd(Double value) {
		this.hprociEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件HPROCI_: 
	 */
	public Jbpm4HistDetailQueryCondition setHprociConditionEndEqual(Double value) {
		this.hprociEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件HPROCIIDX_: 
	 */
	public Jbpm4HistDetailQueryCondition setHprociidxCondition(Integer value) {
		this.hprociidx = value;
		return this;
	}
	
	/**
	 * 设置查询条件HPROCIIDX_: 
	 */
	public Jbpm4HistDetailQueryCondition setHprociidxConditionBegin(Integer value) {
		this.hprociidxBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件HPROCIIDX_: 
	 */
	public Jbpm4HistDetailQueryCondition setHprociidxConditionEnd(Integer value) {
		this.hprociidxEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件HPROCIIDX_: 
	 */
	public Jbpm4HistDetailQueryCondition setHprociidxConditionEndEqual(Integer value) {
		this.hprociidxEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件HACTI_: 
	 */
	public Jbpm4HistDetailQueryCondition setHactiCondition(Double value) {
		this.hacti = value;
		return this;
	}
	
	/**
	 * 设置查询条件HACTI_: 
	 */
	public Jbpm4HistDetailQueryCondition setHactiConditionBegin(Double value) {
		this.hactiBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件HACTI_: 
	 */
	public Jbpm4HistDetailQueryCondition setHactiConditionEnd(Double value) {
		this.hactiEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件HACTI_: 
	 */
	public Jbpm4HistDetailQueryCondition setHactiConditionEndEqual(Double value) {
		this.hactiEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件HACTIIDX_: 
	 */
	public Jbpm4HistDetailQueryCondition setHactiidxCondition(Integer value) {
		this.hactiidx = value;
		return this;
	}
	
	/**
	 * 设置查询条件HACTIIDX_: 
	 */
	public Jbpm4HistDetailQueryCondition setHactiidxConditionBegin(Integer value) {
		this.hactiidxBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件HACTIIDX_: 
	 */
	public Jbpm4HistDetailQueryCondition setHactiidxConditionEnd(Integer value) {
		this.hactiidxEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件HACTIIDX_: 
	 */
	public Jbpm4HistDetailQueryCondition setHactiidxConditionEndEqual(Integer value) {
		this.hactiidxEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件HTASK_: 
	 */
	public Jbpm4HistDetailQueryCondition setHtaskCondition(Double value) {
		this.htask = value;
		return this;
	}
	
	/**
	 * 设置查询条件HTASK_: 
	 */
	public Jbpm4HistDetailQueryCondition setHtaskConditionBegin(Double value) {
		this.htaskBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件HTASK_: 
	 */
	public Jbpm4HistDetailQueryCondition setHtaskConditionEnd(Double value) {
		this.htaskEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件HTASK_: 
	 */
	public Jbpm4HistDetailQueryCondition setHtaskConditionEndEqual(Double value) {
		this.htaskEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件HTASKIDX_: 
	 */
	public Jbpm4HistDetailQueryCondition setHtaskidxCondition(Integer value) {
		this.htaskidx = value;
		return this;
	}
	
	/**
	 * 设置查询条件HTASKIDX_: 
	 */
	public Jbpm4HistDetailQueryCondition setHtaskidxConditionBegin(Integer value) {
		this.htaskidxBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件HTASKIDX_: 
	 */
	public Jbpm4HistDetailQueryCondition setHtaskidxConditionEnd(Integer value) {
		this.htaskidxEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件HTASKIDX_: 
	 */
	public Jbpm4HistDetailQueryCondition setHtaskidxConditionEndEqual(Integer value) {
		this.htaskidxEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件HVAR_: 
	 */
	public Jbpm4HistDetailQueryCondition setHvarCondition(Double value) {
		this.hvar = value;
		return this;
	}
	
	/**
	 * 设置查询条件HVAR_: 
	 */
	public Jbpm4HistDetailQueryCondition setHvarConditionBegin(Double value) {
		this.hvarBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件HVAR_: 
	 */
	public Jbpm4HistDetailQueryCondition setHvarConditionEnd(Double value) {
		this.hvarEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件HVAR_: 
	 */
	public Jbpm4HistDetailQueryCondition setHvarConditionEndEqual(Double value) {
		this.hvarEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件HVARIDX_: 
	 */
	public Jbpm4HistDetailQueryCondition setHvaridxCondition(Integer value) {
		this.hvaridx = value;
		return this;
	}
	
	/**
	 * 设置查询条件HVARIDX_: 
	 */
	public Jbpm4HistDetailQueryCondition setHvaridxConditionBegin(Integer value) {
		this.hvaridxBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件HVARIDX_: 
	 */
	public Jbpm4HistDetailQueryCondition setHvaridxConditionEnd(Integer value) {
		this.hvaridxEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件HVARIDX_: 
	 */
	public Jbpm4HistDetailQueryCondition setHvaridxConditionEndEqual(Integer value) {
		this.hvaridxEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件MESSAGE_: 
	 */
	public Jbpm4HistDetailQueryCondition setMessageCondition(String value) {
		this.message = value;
		return this;
	}
	
	/**
	 * 设置查询条件MESSAGE_: 
	 */
	public Jbpm4HistDetailQueryCondition setMessageConditionEqual(String value) {
		this.messageEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件OLD_STR_: 
	 */
	public Jbpm4HistDetailQueryCondition setOldStrCondition(String value) {
		this.oldStr = value;
		return this;
	}
	
	/**
	 * 设置查询条件OLD_STR_: 
	 */
	public Jbpm4HistDetailQueryCondition setOldStrConditionEqual(String value) {
		this.oldStrEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEW_STR_: 
	 */
	public Jbpm4HistDetailQueryCondition setNewStrCondition(String value) {
		this.newStr = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEW_STR_: 
	 */
	public Jbpm4HistDetailQueryCondition setNewStrConditionEqual(String value) {
		this.newStrEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件OLD_INT_: 
	 */
	public Jbpm4HistDetailQueryCondition setOldIntCondition(Integer value) {
		this.oldInt = value;
		return this;
	}
	
	/**
	 * 设置查询条件OLD_INT_: 
	 */
	public Jbpm4HistDetailQueryCondition setOldIntConditionBegin(Integer value) {
		this.oldIntBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件OLD_INT_: 
	 */
	public Jbpm4HistDetailQueryCondition setOldIntConditionEnd(Integer value) {
		this.oldIntEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件OLD_INT_: 
	 */
	public Jbpm4HistDetailQueryCondition setOldIntConditionEndEqual(Integer value) {
		this.oldIntEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEW_INT_: 
	 */
	public Jbpm4HistDetailQueryCondition setNewIntCondition(Integer value) {
		this.newInt = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEW_INT_: 
	 */
	public Jbpm4HistDetailQueryCondition setNewIntConditionBegin(Integer value) {
		this.newIntBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEW_INT_: 
	 */
	public Jbpm4HistDetailQueryCondition setNewIntConditionEnd(Integer value) {
		this.newIntEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEW_INT_: 
	 */
	public Jbpm4HistDetailQueryCondition setNewIntConditionEndEqual(Integer value) {
		this.newIntEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件OLD_TIME_: 
	 */
	public Jbpm4HistDetailQueryCondition setOldTimeCondition(java.util.Date value) {
		this.oldTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件OLD_TIME_: 
	 */
	public Jbpm4HistDetailQueryCondition setOldTimeConditionBegin(java.util.Date value) {
		this.oldTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件OLD_TIME_: 
	 */
	public Jbpm4HistDetailQueryCondition setOldTimeConditionEnd(java.util.Date value) {
		this.oldTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件OLD_TIME_: 
	 */
	public Jbpm4HistDetailQueryCondition setOldTimeConditionEndEqual(java.util.Date value) {
		this.oldTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEW_TIME_: 
	 */
	public Jbpm4HistDetailQueryCondition setNewTimeCondition(java.util.Date value) {
		this.newTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEW_TIME_: 
	 */
	public Jbpm4HistDetailQueryCondition setNewTimeConditionBegin(java.util.Date value) {
		this.newTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEW_TIME_: 
	 */
	public Jbpm4HistDetailQueryCondition setNewTimeConditionEnd(java.util.Date value) {
		this.newTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件NEW_TIME_: 
	 */
	public Jbpm4HistDetailQueryCondition setNewTimeConditionEndEqual(java.util.Date value) {
		this.newTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_: 
	 */
	public Jbpm4HistDetailQueryCondition setParentCondition(Double value) {
		this.parent = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_: 
	 */
	public Jbpm4HistDetailQueryCondition setParentConditionBegin(Double value) {
		this.parentBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_: 
	 */
	public Jbpm4HistDetailQueryCondition setParentConditionEnd(Double value) {
		this.parentEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_: 
	 */
	public Jbpm4HistDetailQueryCondition setParentConditionEndEqual(Double value) {
		this.parentEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_IDX_: 
	 */
	public Jbpm4HistDetailQueryCondition setParentIdxCondition(Integer value) {
		this.parentIdx = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_IDX_: 
	 */
	public Jbpm4HistDetailQueryCondition setParentIdxConditionBegin(Integer value) {
		this.parentIdxBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_IDX_: 
	 */
	public Jbpm4HistDetailQueryCondition setParentIdxConditionEnd(Integer value) {
		this.parentIdxEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PARENT_IDX_: 
	 */
	public Jbpm4HistDetailQueryCondition setParentIdxConditionEndEqual(Integer value) {
		this.parentIdxEndEqual = value;
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
						+ ((" and ([JBPM4_HIST_DETAIL].[DBID_] = " + this.dbid) 
						+ ") "));
		}
		if ((this.dbidBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[DBID_] >= " 
						+ (this.dbidBegin + ")")));
		}
		if ((this.dbidEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[DBID_] < " 
						+ (this.dbidEnd + ") ")));
		}
		if ((this.dbidEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[DBID_] <= " 
						+ (this.dbidEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.class_)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_DETAIL].[CLASS_]", this.class_)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.class_Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_DETAIL].[CLASS_] = " + SqlServerUtils.safeSql(this.class_Equal))) 
						+ ") "));
		}
		if ((this.dbversion == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_DETAIL].[DBVERSION_] = " + this.dbversion) 
						+ ") "));
		}
		if ((this.dbversionBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[DBVERSION_] >= " 
						+ (this.dbversionBegin + ")")));
		}
		if ((this.dbversionEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[DBVERSION_] < " 
						+ (this.dbversionEnd + ") ")));
		}
		if ((this.dbversionEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[DBVERSION_] <= " 
						+ (this.dbversionEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.userid)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_DETAIL].[USERID_]", this.userid)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.useridEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_DETAIL].[USERID_] = " + SqlServerUtils.safeSql(this.useridEqual))) 
						+ ") "));
		}
		if ((this.time == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_DETAIL].[TIME_] = " + SqlServerUtils.getDateSql(this.time)) 
						+ ") "));
		}
		if ((this.timeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[TIME_] >= " 
						+ (SqlServerUtils.getDateSql(this.timeBegin) + ")")));
		}
		if ((this.timeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[TIME_] < " 
						+ (SqlServerUtils.getDateSql(this.timeEnd) + ") ")));
		}
		if ((this.timeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[TIME_] < " 
						+ (SqlServerUtils.getNextDateSql(this.timeEndEqual) + ") ")));
		}
		if ((this.hproci == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_DETAIL].[HPROCI_] = " + this.hproci) 
						+ ") "));
		}
		if ((this.hprociBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HPROCI_] >= " 
						+ (this.hprociBegin + ")")));
		}
		if ((this.hprociEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HPROCI_] < " 
						+ (this.hprociEnd + ") ")));
		}
		if ((this.hprociEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HPROCI_] <= " 
						+ (this.hprociEndEqual + ") ")));
		}
		if ((this.hprociidx == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_DETAIL].[HPROCIIDX_] = " + this.hprociidx) 
						+ ") "));
		}
		if ((this.hprociidxBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HPROCIIDX_] >= " 
						+ (this.hprociidxBegin + ")")));
		}
		if ((this.hprociidxEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HPROCIIDX_] < " 
						+ (this.hprociidxEnd + ") ")));
		}
		if ((this.hprociidxEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HPROCIIDX_] <= " 
						+ (this.hprociidxEndEqual + ") ")));
		}
		if ((this.hacti == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_DETAIL].[HACTI_] = " + this.hacti) 
						+ ") "));
		}
		if ((this.hactiBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HACTI_] >= " 
						+ (this.hactiBegin + ")")));
		}
		if ((this.hactiEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HACTI_] < " 
						+ (this.hactiEnd + ") ")));
		}
		if ((this.hactiEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HACTI_] <= " 
						+ (this.hactiEndEqual + ") ")));
		}
		if ((this.hactiidx == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_DETAIL].[HACTIIDX_] = " + this.hactiidx) 
						+ ") "));
		}
		if ((this.hactiidxBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HACTIIDX_] >= " 
						+ (this.hactiidxBegin + ")")));
		}
		if ((this.hactiidxEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HACTIIDX_] < " 
						+ (this.hactiidxEnd + ") ")));
		}
		if ((this.hactiidxEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HACTIIDX_] <= " 
						+ (this.hactiidxEndEqual + ") ")));
		}
		if ((this.htask == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_DETAIL].[HTASK_] = " + this.htask) 
						+ ") "));
		}
		if ((this.htaskBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HTASK_] >= " 
						+ (this.htaskBegin + ")")));
		}
		if ((this.htaskEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HTASK_] < " 
						+ (this.htaskEnd + ") ")));
		}
		if ((this.htaskEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HTASK_] <= " 
						+ (this.htaskEndEqual + ") ")));
		}
		if ((this.htaskidx == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_DETAIL].[HTASKIDX_] = " + this.htaskidx) 
						+ ") "));
		}
		if ((this.htaskidxBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HTASKIDX_] >= " 
						+ (this.htaskidxBegin + ")")));
		}
		if ((this.htaskidxEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HTASKIDX_] < " 
						+ (this.htaskidxEnd + ") ")));
		}
		if ((this.htaskidxEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HTASKIDX_] <= " 
						+ (this.htaskidxEndEqual + ") ")));
		}
		if ((this.hvar == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_DETAIL].[HVAR_] = " + this.hvar) 
						+ ") "));
		}
		if ((this.hvarBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HVAR_] >= " 
						+ (this.hvarBegin + ")")));
		}
		if ((this.hvarEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HVAR_] < " 
						+ (this.hvarEnd + ") ")));
		}
		if ((this.hvarEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HVAR_] <= " 
						+ (this.hvarEndEqual + ") ")));
		}
		if ((this.hvaridx == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_DETAIL].[HVARIDX_] = " + this.hvaridx) 
						+ ") "));
		}
		if ((this.hvaridxBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HVARIDX_] >= " 
						+ (this.hvaridxBegin + ")")));
		}
		if ((this.hvaridxEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HVARIDX_] < " 
						+ (this.hvaridxEnd + ") ")));
		}
		if ((this.hvaridxEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[HVARIDX_] <= " 
						+ (this.hvaridxEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.oldStr)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_DETAIL].[OLD_STR_]", this.oldStr)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.oldStrEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_DETAIL].[OLD_STR_] = " + SqlServerUtils.safeSql(this.oldStrEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.newStr)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[JBPM4_HIST_DETAIL].[NEW_STR_]", this.newStr)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.newStrEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[JBPM4_HIST_DETAIL].[NEW_STR_] = " + SqlServerUtils.safeSql(this.newStrEqual))) 
						+ ") "));
		}
		if ((this.oldInt == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_DETAIL].[OLD_INT_] = " + this.oldInt) 
						+ ") "));
		}
		if ((this.oldIntBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[OLD_INT_] >= " 
						+ (this.oldIntBegin + ")")));
		}
		if ((this.oldIntEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[OLD_INT_] < " 
						+ (this.oldIntEnd + ") ")));
		}
		if ((this.oldIntEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[OLD_INT_] <= " 
						+ (this.oldIntEndEqual + ") ")));
		}
		if ((this.newInt == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_DETAIL].[NEW_INT_] = " + this.newInt) 
						+ ") "));
		}
		if ((this.newIntBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[NEW_INT_] >= " 
						+ (this.newIntBegin + ")")));
		}
		if ((this.newIntEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[NEW_INT_] < " 
						+ (this.newIntEnd + ") ")));
		}
		if ((this.newIntEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[NEW_INT_] <= " 
						+ (this.newIntEndEqual + ") ")));
		}
		if ((this.oldTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_DETAIL].[OLD_TIME_] = " + SqlServerUtils.getDateSql(this.oldTime)) 
						+ ") "));
		}
		if ((this.oldTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[OLD_TIME_] >= " 
						+ (SqlServerUtils.getDateSql(this.oldTimeBegin) + ")")));
		}
		if ((this.oldTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[OLD_TIME_] < " 
						+ (SqlServerUtils.getDateSql(this.oldTimeEnd) + ") ")));
		}
		if ((this.oldTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[OLD_TIME_] < " 
						+ (SqlServerUtils.getNextDateSql(this.oldTimeEndEqual) + ") ")));
		}
		if ((this.newTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_DETAIL].[NEW_TIME_] = " + SqlServerUtils.getDateSql(this.newTime)) 
						+ ") "));
		}
		if ((this.newTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[NEW_TIME_] >= " 
						+ (SqlServerUtils.getDateSql(this.newTimeBegin) + ")")));
		}
		if ((this.newTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[NEW_TIME_] < " 
						+ (SqlServerUtils.getDateSql(this.newTimeEnd) + ") ")));
		}
		if ((this.newTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[NEW_TIME_] < " 
						+ (SqlServerUtils.getNextDateSql(this.newTimeEndEqual) + ") ")));
		}
		if ((this.parent == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_DETAIL].[PARENT_] = " + this.parent) 
						+ ") "));
		}
		if ((this.parentBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[PARENT_] >= " 
						+ (this.parentBegin + ")")));
		}
		if ((this.parentEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[PARENT_] < " 
						+ (this.parentEnd + ") ")));
		}
		if ((this.parentEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[PARENT_] <= " 
						+ (this.parentEndEqual + ") ")));
		}
		if ((this.parentIdx == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([JBPM4_HIST_DETAIL].[PARENT_IDX_] = " + this.parentIdx) 
						+ ") "));
		}
		if ((this.parentIdxBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[PARENT_IDX_] >= " 
						+ (this.parentIdxBegin + ")")));
		}
		if ((this.parentIdxEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[PARENT_IDX_] < " 
						+ (this.parentIdxEnd + ") ")));
		}
		if ((this.parentIdxEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([JBPM4_HIST_DETAIL].[PARENT_IDX_] <= " 
						+ (this.parentIdxEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
