package com.yeyouluo.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 事件发布类
 * @author chen
 *
 */
@Component
public class DemoPublisher {

	@Autowired
	ApplicationContext applicationContext;  // 注入ApplicationContext用于发布事件
	
	public void publish(String msg) {
		applicationContext.publishEvent(new DemoEvent(this, msg)); // 使用publish方法来发布事件
	}
	
}
