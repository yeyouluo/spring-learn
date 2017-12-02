package com.yeyouluo.spring.aop;

import org.springframework.stereotype.Service;

/**
 * 使用方法规则拦截类
 * @author yeyouluo
 *
 */
@Service
public class DemoMethodService {
	public void add(){
		System.out.println("DemoMethodService add ...");
	}
}
