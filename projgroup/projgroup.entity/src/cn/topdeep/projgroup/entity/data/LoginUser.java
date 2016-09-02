package cn.topdeep.projgroup.entity.data;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;

import cn.topdeep.projgroup.entity.User;

/**
 * 登陆后的用户
 * 
 * @author nx
 * 
 */
public class LoginUser implements Serializable {
	
	public LoginUser() {
	}

	private User loginUser;
	
	// 保存用户的权限
	private Hashtable<Integer, Integer> _privilegeList = new Hashtable<Integer, Integer>();
	// 判断是否登录
	private boolean login = false;

	public boolean isLogin() {
		return login && (null != loginUser);
	}
	
	public void setLogin(boolean login) {
		this.login = login;
		if(!login){
			_privilegeList.clear();
			loginUser = null;
		}
	}

	/**
	 * 给登录的用户添加权限
	 * 
	 * @param APrivilegeValue
	 */
	public void privilegeAdd(String APrivilegeValue) {
		if(APrivilegeValue == null) return;
		String[] prilist = APrivilegeValue.split(",");
		for (int i = 0; i < prilist.length; i++) {
			String pristrvalue = prilist[i].trim();
			if (pristrvalue.equals(""))
				continue;
			int priValue = Integer.parseInt(pristrvalue.trim());
			int func = priValue >> 8;
			int oper = priValue & 0xff;
			if (_privilegeList.containsKey(new Integer(func))) {
				int value = ((Integer) _privilegeList.get(new Integer(func)))
						.intValue();
				value = value | oper;//进行与或操作,判断权限值是否相同
				_privilegeList.remove(new Integer(func));
				_privilegeList.put(new Integer(func), new Integer(value));
			} else {
				_privilegeList.put(new Integer(func), new Integer(oper));
			}
		}

	}

	public String getPrivilegeString() {
		Enumeration<Integer> e = _privilegeList.keys();
		String s = "";
		while (e.hasMoreElements()) {
			Integer func = (Integer) e.nextElement();
			Integer operate = (Integer) _privilegeList.get(func);
			if (!"".equals(s)) {
				s += ",";
			}
			s += ((func << 8) + operate);
		}
		return s;
	}

	/**
	 * 判断登录用户是否具有某项操作的权限
	 * 
	 * @param AFunc
	 * @param AnOperate
	 * @return
	 */
	public boolean hasPrivilege(int AFunc, int AnOperate) {
		if (AFunc <= 0)
			return true;
		if (!_privilegeList.containsKey(new Integer(AFunc)))
			return false;
		if ((((Integer) _privilegeList.get(new Integer(AFunc))).intValue() & AnOperate) != 0)
			return true;
		return false;
	}

	public User getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(User loginUser) {
		this.loginUser = loginUser;
	}

}
