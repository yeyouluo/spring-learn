package com.yeyouluo.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean  // Bean注解声明当前方法返回值是一个Bean
	public FunctionService functionService(){
		return new FunctionService();
	}
	
	
	@Bean
	public UseFunctionService useFunctionService(){
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService());  //上面已经使用functionService()方法返回了一个bean，这里直接使用该方法。
		return useFunctionService;
	}
	
//	// 这里也可以将FunctionService functionService作为一个参数
//	@Bean
//	public UseFunctionService useFunctionService(FunctionService functionService){
//		UseFunctionService useFunctionService = new UseFunctionService();
//		useFunctionService.setFunctionService(functionService);  
//		return useFunctionService;
//	}
	
	
}
