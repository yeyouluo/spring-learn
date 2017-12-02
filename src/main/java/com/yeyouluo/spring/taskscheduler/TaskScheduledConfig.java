package com.yeyouluo.spring.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 配置类
 * @author yeyouluo
 *
 * 2017年11月29日 下午12:32:59
 */
@Configuration
@ComponentScan("com.yeyouluo.spring.taskscheduler")
@EnableScheduling  // 开启对计划任务的支持
public class TaskScheduledConfig {

}
