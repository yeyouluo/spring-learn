package com.yeyouluo.spring.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.getEnvironment().setActiveProfiles("prod");  // 先将活动的profile设置为prod
		context.register(ProfileConfig.class);  // 后置注册bean配置类，不然会报bean未定义的错误
		context.refresh();  // 刷新容器
		
		DemoBean demoBean = context.getBean(DemoBean.class);
		
		System.out.println(demoBean.getContent());
		
		context.close();
	}

}
