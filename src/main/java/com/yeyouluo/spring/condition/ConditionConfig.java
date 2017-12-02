package com.yeyouluo.spring.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * @author yeyouluo
 *
 * 2017年11月29日 下午12:48:37
 */
@Configuration
public class ConditionConfig {

	@Bean
	@Conditional(WindowsCondition.class)
	public IListService windowsListService(){
		return new WindowsListService();
	}
	
	@Bean
	@Conditional(LinuxCondition.class)
	public IListService linuxListService(){
		return new LinuxListService();
	}
}
