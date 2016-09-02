/**
 * 
 */
package cn.topdeep.projgroup.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author niexin
 *
 */
@Component
public class ApplicationContextHelper implements ApplicationContextAware {

	private static Log log = LogFactory.getLog(ApplicationContextHelper.class);

	private static ApplicationContext context;

	public ApplicationContextHelper() {
		log.debug("ApplicationContextHelper Created!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
	 */
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ApplicationContextHelper.context = applicationContext;
		log.debug("setApplicationContext Success!");
	}

	/**
	 * @return the context
	 */
	public static Object getBean(String name) {
		return ApplicationContextHelper.context.getBean(name);
	}

}
