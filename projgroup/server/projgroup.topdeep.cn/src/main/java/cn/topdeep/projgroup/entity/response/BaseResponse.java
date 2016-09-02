package cn.topdeep.projgroup.entity.response;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


import common.util.StringUtils;

public class BaseResponse implements Serializable {

	/**
	 * 执行结果是否成功
	 */
	private boolean success = true;
	
	/**
	 * 执行结果提示信息 
	 */
	private String tipMessage = "";
	/**
	 * 需要跳转的地址
	 */
	private String redirectUrl = "";
	private String skin = "default";
	private String theme = "";
	private String customerName = "";
	private String version;
	private String title;
	
	/**
	 * 用户是否绑定微信了
	 */
	private String binded = "false";
    /**
     * 执行结果其它自定义数据 
     */
    private Map<String,Object> data=new  HashMap<String,Object>();
	
    public boolean needRedirect(){
    	return !StringUtils.isNullOrEmpty(redirectUrl);
    }
    
	public Map<String, Object> getData() {
		return data;
	}
	
	public void setResult(boolean isSuccess, String tipMsg){
		success = isSuccess;
		tipMessage += tipMsg;
	}
	
	public void checkStringValue(String value, String tipMsg) {
		if (StringUtils.isNullOrEmpty(value)) {
			setResult(false, tipMsg);
		}
	}
	
	public void checkStringEqual(String value1, String value2, String tipMsg){
		if(StringUtils.isNullOrEmpty(value1) || StringUtils.isNullOrEmpty(value2) || !value1.equals(value2)){
			setResult(false, tipMsg);
		}
	}
	public void checkStringNotEqual(String value1, String value2, String tipMsg){
		if(StringUtils.isNullOrEmpty(value1) || StringUtils.isNullOrEmpty(value2) || value1.equals(value2)){
			setResult(false, tipMsg);
		}
	}
	public void checkNull(Object value, String tipMsg){
		if(value == null){
			setResult(false, tipMsg);
		}
	}

	public void checkStringEmpty(String value, String tipMsg){
		if(StringUtils.isNullOrEmpty(value)){
			setResult(false, tipMsg);
		}
	}
	
	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * @return the tipMessage
	 */
	public String getTipMessage() {
		return tipMessage;
	}

	/**
	 * @param tipMessage the tipMessage to set
	 */
	public void setTipMessage(String tipMessage) {
		this.tipMessage = tipMessage;
	}

	/**
	 * @return the skin
	 */
	public String getSkin() {
		return skin;
	}

	/**
	 * @param skin the skin to set
	 */
	public void setSkin(String skin) {
		this.skin = skin;
	}

	/**
	 * @return the theme
	 */
	public String getTheme() {
		return theme;
	}

	/**
	 * @param theme the theme to set
	 */
	public void setTheme(String theme) {
		this.theme = theme;
	}

	/**
	 * @return the redirectUrl
	 */
	public String getRedirectUrl() {
		return redirectUrl;
	}
	/**
	 * @param redirectUrl the redirectUrl to set
	 */
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBinded() {
		return binded;
	}

	public void setBinded(String binded) {
		this.binded = binded;
	}

}
