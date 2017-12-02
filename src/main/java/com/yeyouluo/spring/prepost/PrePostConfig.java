package com.yeyouluo.spring.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.yeyouluo.spring.prepost")
public class PrePostConfig {

	@Bean(initMethod="init",destroyMethod="destory")  // 指定BeanWayService类的init和destory方法在构造之后、销毁之前执行
	public BeanWayService beanWayService() {
		return new BeanWayService();
	}
	
	@Bean  // JSR250的方式已经方法上指定了，因此这里不用再次执行初始化和销毁方法
	JSR250WayService jsr250WayService(){
		return new JSR250WayService();
	}
}
