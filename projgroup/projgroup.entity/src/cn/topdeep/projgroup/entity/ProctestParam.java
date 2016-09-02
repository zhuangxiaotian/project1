package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
public class ProctestParam {
	
	int p1;
	
	String p2;
	
	public ProctestParam() {
	}
	
	public ProctestParam(int p1, String p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public int getP1() {
		return this.p1;
	}
	
	public void setP1(int value)
	 {
		this.p1 = value;
	}
	
	public String getP2() {
		return this.p2;
	}
	
	public void setP2(String value)
	 {
		this.p2 = value;
	}
}
