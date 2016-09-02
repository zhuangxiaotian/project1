package cn.topdeep.projgroup.entity.data;

import java.util.ArrayList;
import java.util.Hashtable;

public class PrivilegeInfo {
	private String privilegeName;
	
	private ArrayList operateList;

	public String getPrivilegeName() {
		return privilegeName;
	}

	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}

	public ArrayList getOperateList() {
		return operateList;
	}

	public void setOperateList(ArrayList operateList) {
		this.operateList = operateList;
	}

	}
