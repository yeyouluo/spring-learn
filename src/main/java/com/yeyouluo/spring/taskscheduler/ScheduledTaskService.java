package com.yeyouluo.spring.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 
 * @author yeyouluo
 *
 * 2017年11月29日 下午12:29:27
 */
@Service
public class ScheduledTaskService {

	private static final  SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000) // 声明该方法是计划任务。使用fixedRate属性每隔固定时间执行。
	public void reportCurrentTime() {
		System.out.println("每隔5秒汇报一次时间： " + dateFormat.format(new Date()));
	}

	@Scheduled(cron = "0 39 12 ? * *")  // 使用cron属性，每天12:40执行一次
	public void fixTimeExecution() {
		System.out.println("在指定时间 " + dateFormat.format(new Date()) + "执行");
	}
}
