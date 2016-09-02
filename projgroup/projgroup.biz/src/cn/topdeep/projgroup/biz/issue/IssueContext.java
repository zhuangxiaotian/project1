/**
 * $Id$
 */
package cn.topdeep.projgroup.biz.issue;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.http.HTTPException;

import common.web.HttpContext;

/**
 * @author niexin
 *
 */
public class IssueContext {

	public String getBaseUrl(){
		HttpServletRequest req = HttpContext.getRequest();
		if(req != null){
			if(req.getContextPath().equals("/")){
				return req.getScheme()+"://"+req.getServerName()+":"+req.getServerPort()+"/";
			}else{
				return req.getScheme()+"://"+req.getServerName()+":"+req.getServerPort()+req.getContextPath()+"/";
			}
		}else{
			return "/";
		}
	}

	public void setAttribute(String key, Object value) throws Exception{
		HttpServletRequest req = HttpContext.getRequest();
		if(req == null){
			throw new Exception("未获得Request对象");
		}
		req.getSession().setAttribute(key, value);
	}
	
	public Object getAttribute(String key) throws Exception{
		HttpServletRequest req = HttpContext.getRequest();
		if(req == null){
			throw new Exception("未获得Request对象");
		}
		return req.getSession().getAttribute(key);
	}
	
	public Object removeAttribute(String key) throws Exception{
		HttpServletRequest req = HttpContext.getRequest();
		if(req == null){
			throw new Exception("未获得Request对象");
		}
		Object obj = req.getSession().getAttribute(key);
		req.getSession().removeAttribute(key);
		return obj;
	}
	
}
