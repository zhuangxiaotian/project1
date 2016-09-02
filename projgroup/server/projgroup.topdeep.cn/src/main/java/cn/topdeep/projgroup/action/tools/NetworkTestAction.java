/**
 * 
 */
package cn.topdeep.projgroup.action.tools;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import common.util.StringUtils;
import cn.topdeep.projgroup.action.base.BaseAction;
import cn.topdeep.projgroup.entity.db.FuncProjectExample;
import cn.topdeep.projgroup.entity.response.BaseResponse;

/**
 * @author niexin
 *
 */
@Controller
@RequestMapping(value={"/tools"})
public class NetworkTestAction extends BaseAction {

	private Log logger = LogFactory.getLog(getClass());
	
	/**
	 * 
	 */
	@RequestMapping(value = { "networkTest" }, method={RequestMethod.GET})
	public String execute(HttpServletRequest request, Model model) {
		BaseResponse res = ajaxQuery(request);
		model.addAttribute("res", res);
		return "/"+res.getSkin()+"/tools/network-test-success";
	}

	@RequestMapping(value = { "networkTest!ajaxQuery" }, method={RequestMethod.GET})
	@ResponseBody
	public BaseResponse ajaxQuery(HttpServletRequest request){
		BaseResponse res = new BaseResponse();
		try {
//			Enumeration<String> names = request.getHeaderNames();
//			while(names.hasMoreElements()){
//				String name = names.nextElement();
//				String value = request.getHeader(name);
//				logger.info(name+"="+value);
//			}
			String remoteAddr = request.getHeader("x-forwarded-for");
			if(StringUtils.isNullOrEmpty(remoteAddr)){
				remoteAddr = request.getRemoteAddr();
			}
			logger.info("remoteAddr: "+remoteAddr);
			res.getData().put("remoteAddr", remoteAddr);
		} catch (Exception e) {
			res.setResult(false, e.getMessage());
		}
		return res;
	}

}
