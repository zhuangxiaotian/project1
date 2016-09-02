/**
 * 
 */
package cn.topdeep.projgroup.web.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * @author niexin
 *
 */
public class FreeMarkerView extends org.springframework.web.servlet.view.freemarker.FreeMarkerView {
	public static final String CONTEXT_PATH = "base"; 
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.view.freemarker.FreeMarkerView#exposeHelpers(java.util.Map, javax.servlet.http.HttpServletRequest)
	 */
	@Override
	protected void exposeHelpers(Map<String, Object> model,
			HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		super.exposeHelpers(model, request);
		model.put(CONTEXT_PATH, request.getContextPath()); 
	}

}
