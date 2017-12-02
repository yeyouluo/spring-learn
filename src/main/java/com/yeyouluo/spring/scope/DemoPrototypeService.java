package com.yeyouluo.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 多例模式
 * @author chen
 *
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {

}
