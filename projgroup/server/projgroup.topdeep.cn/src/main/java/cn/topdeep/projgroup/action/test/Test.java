/**
 * 
 */
package cn.topdeep.projgroup.action.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.topdeep.projgroup.action.base.BaseAction;
import cn.topdeep.projgroup.entity.request.BaseRequest;
import cn.topdeep.projgroup.entity.response.BaseResponse;

/**
 * @author niexin
 *
 */
@Controller
@RequestMapping(value={"/t","/test"})
public class Test extends BaseAction{
	
	@RequestMapping(value="Test", method={RequestMethod.GET, RequestMethod.POST})
	public String execute(BaseRequest req, Model model){
		BaseResponse res = new BaseResponse();
		res.setSuccess(true);
		res.setTipMessage("test success!");
		model.addAttribute("res", res);
		return "/"+res.getSkin()+"/test/test-success";
	}
}
