package com.yeyouluo.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器
 * @author chen
 *
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{ // 实现ApplicationListener接口

	@Override
	public void onApplicationEvent(DemoEvent event) { // 使用onApplicationEvent方法对消息进行接收处理
		// TODO Auto-generated method stub
		String msg = event.getMsg();
		System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息：" + msg);
	}
	
}
