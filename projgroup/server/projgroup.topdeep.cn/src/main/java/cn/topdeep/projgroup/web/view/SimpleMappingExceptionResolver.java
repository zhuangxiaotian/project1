/**
 * 
 */
package cn.topdeep.projgroup.web.view;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.ModelAndView;

import cn.topdeep.projgroup.entity.response.BaseResponse;

/**
 * @author niexin
 *
 */
public class SimpleMappingExceptionResolver extends org.springframework.web.servlet.handler.SimpleMappingExceptionResolver {

	@Value("#{application['skin']}")
	private String skin;
	
	@Value("#{application['theme']}")
	private String theme;
	
	@Value("#{application['version']}")
	private String version;
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.handler.SimpleMappingExceptionResolver#getModelAndView(java.lang.String, java.lang.Exception, javax.servlet.http.HttpServletRequest)
	 */
	@Override
	protected ModelAndView getModelAndView(String viewName, Exception ex, HttpServletRequest request) {
		request.setAttribute("visit_exception", ex.getMessage());
		request.setAttribute("result_view", viewName);
		return super.getModelAndView(viewName, ex, request);
	}

	protected ModelAndView getModelAndView(String viewName, Exception ex) {
		ModelAndView mv = super.getModelAndView(viewName, ex);
		BaseResponse res = new BaseResponse();
		res.setTitle("信息提示");
		res.setSkin(skin);
		res.setTheme(theme);
		res.setVersion(version);
		mv.addObject("res", res);
		return mv;
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
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

}
