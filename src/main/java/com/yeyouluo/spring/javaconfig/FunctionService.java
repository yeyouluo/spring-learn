package com.yeyouluo.spring.javaconfig;

// 这里没有@service注解
public class FunctionService {
	
	public String sayHello(String word){
		return "hello," + word + "!";
	}
	
}
