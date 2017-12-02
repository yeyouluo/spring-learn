package com.yeyouluo.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.yeyouluo.spring.aop")
@EnableAspectJAutoProxy  // 开启spring对AspectJ的支持
public class AopConfig {

}
