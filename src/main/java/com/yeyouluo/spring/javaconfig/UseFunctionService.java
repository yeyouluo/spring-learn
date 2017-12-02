package com.yeyouluo.spring.javaconfig;

//这里没有@service注解
public class UseFunctionService {
	
	// 这里没有@AtuoWired注解
	private FunctionService functionService;
	
	public String sayHello(String word) {
		return functionService.sayHello(word);
		
	}

	public FunctionService getFunctionService() {
		return functionService;
	}

	//需要添加set方法，在后面会用到
	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
	
	
	
}
