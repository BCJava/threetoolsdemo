package cn.bcsoft.interfacedemo.interceptortest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Description: idea-workspace
 * Created by blackchen on 2020/9/16 15:43
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

	@Autowired
	private MyInterceptor interceptor;

	public void addInterceptors(InterceptorRegistry registry) {
		//addPathPatterns 指定拦截器要拦截的路径
		//excludePathPatterns 指定拦截器不拦截的路径
		registry.addInterceptor(interceptor).addPathPatterns("/threetest/**").excludePathPatterns("/threetest/listener");
	}
}


