package com.yeyouluo.spring.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 切面
 * @author yeyouluo
 *
 */
@Aspect   // 声明一个切面
@Component  // 让此切面称为spring容器管理的bean
public class LogAspect {

	@Pointcut("@annotation(com.yeyouluo.spring.aop.Action)")  // 声明切点
	public void annotationPointCut(){};
	
	@After("annotationPointCut()")  // 声明一个建言，使用Pointcut定义的切点
	public void after(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解式拦截 " + action.name());  // 通过反射可获得注解上的属性，然后做日志记录相关的操作
	}
	
	@Before("execution(* com.yeyouluo.spring.aop.DemoMethodService.*(..))") // 声明一个建言，直接使用拦截规则作为参数
	public void before( JoinPoint joinPoint ){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("方法规则式拦截 " + method.getName());
		
	}
	
}
