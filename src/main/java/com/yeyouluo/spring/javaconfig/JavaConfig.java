package com.yeyouluo.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean  // Beanע��������ǰ��������ֵ��һ��Bean
	public FunctionService functionService(){
		return new FunctionService();
	}
	
	
	@Bean
	public UseFunctionService useFunctionService(){
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService());  //�����Ѿ�ʹ��functionService()����������һ��bean������ֱ��ʹ�ø÷�����
		return useFunctionService;
	}
	
//	// ����Ҳ���Խ�FunctionService functionService��Ϊһ������
//	@Bean
//	public UseFunctionService useFunctionService(FunctionService functionService){
//		UseFunctionService useFunctionService = new UseFunctionService();
//		useFunctionService.setFunctionService(functionService);  
//		return useFunctionService;
//	}
	
	
}
