package com.johnremboo.configs;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Add configuration classes and mapping to Root WebApplicationContext
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{WebConfig.class, RepositoryConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}
}
