package com.vue.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.vue.interceptor.AdminSessionInterceptor;


@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	/*
	 * Bean으로 등록하지 않을경우 interceptor를 컨테이너가 관리하지않고 직접 생성하기 때문에
	 * 컨테이너 관리대상에 포함되지 않으므로 Bean으로 생성해서 컨테이너가 관리할 수 있게 만듦
	 * (@Autowired로 의존주입을 가능하도록 만듦)
	 */
	@Bean
	public AdminSessionInterceptor adminSessionIntercptor() {
		return new AdminSessionInterceptor();
	}
	
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(adminSessionIntercptor()).addPathPatterns("/admin/").addPathPatterns("/admin/**");
	}
}
