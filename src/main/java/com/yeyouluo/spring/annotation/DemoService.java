package com.yeyouluo.spring.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public void outputResult() {
		System.out.println("从组合注解配置照样获得的bean");
	}
}
