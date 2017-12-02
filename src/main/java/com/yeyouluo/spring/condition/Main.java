package com.yeyouluo.spring.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 启动类
 * @author yeyouluo
 *
 * 2017年11月29日 下午12:53:16
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
		
		IListService listService = context.getBean(IListService.class);
		System.out.println(context.getEnvironment().getProperty("os.name")+"系统下的列表命令为：" + listService.showListCmd());
		
		context.close();
	}
}
