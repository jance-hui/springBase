package com.ldh.base.springbase.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

//@Configuration
public class WebMvcConfig implements WebMvcConfigurer, ApplicationContextAware {
	
	private ApplicationContext context;

	/**
	 * 跨域配置，允许axios跨域请求
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowCredentials(true)
		.allowedMethods("GET","POST", "HEAD", "OPTIONS")
		.allowedHeaders("*")
		.allowedOrigins("*");
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}
	
}
