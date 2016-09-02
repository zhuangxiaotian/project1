/**
 * 
 */
package cn.topdeep.projgroup.entity.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cn.topdeep.projgroup.biz.FuncProjectBiz;
import cn.topdeep.projgroup.entity.response.BaseResponse;
import common.util.StringUtils;

/**
 * @author niexin
 *
 */
public class BaseRequest {
	
	/**
	 * 密码正则表达式
	 */
	protected String passwordReg = "^\\d{6}$";
	/**
	 * 密码为非6位数字时的提示语句
	 */
	protected String passwordTipMessage = "请输入六位数字交易密码";
	public boolean checkInput(BaseResponse res) {
		res.setResult(true, "");
		return res.isSuccess();
	}

}
