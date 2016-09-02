package cn.topdeep.projgroup.converter;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import cn.topdeep.projgroup.biz.BizFactory;
import cn.topdeep.projgroup.biz.SystemBiz;
import cn.topdeep.projgroup.action.system.*;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.db.User;

public class UserConverter extends StrutsTypeConverter {

	private SystemBiz systemBiz;
	
	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2){
		int userId = Integer.parseInt(arg1[0]);
		try {
			return getSystemBiz().getUser(userId);
		} catch (DbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userId;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		if(arg1 == null)return "";
		return ""+((User)arg1).getUserId();
	}

	public SystemBiz getSystemBiz() {
		return systemBiz;
	}

	public void setSystemBiz(SystemBiz systemBiz) {
		this.systemBiz = systemBiz;
	}

}
