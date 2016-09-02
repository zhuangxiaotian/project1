/**
 * $Id$
 */
package cn.topdeep.projgroup.entity.data;

import java.util.*;

/**
 * @author niexin
 *
 */
public class LeaveType {
	/**
	 * 0：病假
	 */
	public static final int Sick = 0;
	/**
	 * 1：事假
	 */
	public static final int Leave = 1;
	/**
	 * 2：丧假
	 */
	public static final int Bereavement = 2;
	/**
	 * 3：婚假
	 */
	public static final int Marriage = 3; 
	
	public static String getTypeDesc(int leaveType){
		switch (leaveType) {
		case Sick: return "病假";
		case Leave: return "事假";
		case Bereavement: return "丧假";
		case Marriage: return "婚假";
		default: return "未知";
		}
	}
	
	public static Map<Integer, String> getLeaveTypeList(){
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for(int i=0;i<4;i++){
			map.put(i, getTypeDesc(i));
		}
		return map;
	}
}
