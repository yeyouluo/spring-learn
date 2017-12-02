package com.yeyouluo.spring.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
	
	// 通过@Async注解标明该方法是异步方法。
	// 这里的方法自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor
	// 该注解也可以使用在类级别，标明被注解类所有的方法都是异步方法
	@Async  
	public void executeAsyncTask(Integer i) {
		System.out.println("执行异步任务：" + i);
	}
	
	@Async
	public void executeAsyncTaskPlus(Integer i) {
		System.out.println("执行异步任务+1：" + (i+1));
	}
}
