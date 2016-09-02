package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
public class PGetIdentityParam {
	
	String tabName;
	
	int style;
	
	int len;
	
	String ret;
	
	public PGetIdentityParam() {
	}
	
	public PGetIdentityParam(String tabName, int style, int len, String ret) {
		this.tabName = tabName;
		this.style = style;
		this.len = len;
		this.ret = ret;
	}
	
	public String getTabName() {
		return this.tabName;
	}
	
	public void setTabName(String value)
	 {
		this.tabName = value;
	}
	
	public int getStyle() {
		return this.style;
	}
	
	public void setStyle(int value)
	 {
		this.style = value;
	}
	
	public int getLen() {
		return this.len;
	}
	
	public void setLen(int value)
	 {
		this.len = value;
	}
	
	public String getRet() {
		return this.ret;
	}
	
	public void setRet(String value)
	 {
		this.ret = value;
	}
}
