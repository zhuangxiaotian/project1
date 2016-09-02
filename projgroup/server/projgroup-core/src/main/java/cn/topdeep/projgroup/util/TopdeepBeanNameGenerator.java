/**
 * 
 */
package cn.topdeep.projgroup.util;

import java.beans.Introspector;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;

/**
 * @author niexin
 *
 */
public class TopdeepBeanNameGenerator extends AnnotationBeanNameGenerator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.context.annotation.AnnotationBeanNameGenerator#buildDefaultBeanName(org.springframework.beans.factory.config.BeanDefinition)
	 */
	@Override
	protected String buildDefaultBeanName(BeanDefinition definition) {
		String shortClassName = definition.getBeanClassName();
		return Introspector.decapitalize(shortClassName);
	}

}
