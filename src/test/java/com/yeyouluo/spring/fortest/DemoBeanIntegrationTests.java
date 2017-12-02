package com.yeyouluo.spring.fortest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)  //SpringJUnit4ClassRunner在JUnit环境下提供Spring TestContext Framework的功能
@ContextConfiguration(classes = {TestConfig.class})  // 加载配置ApplicationContext，其中class属性用来加载配置类
@ActiveProfiles("prod") // 声明活动的profile
public class DemoBeanIntegrationTests {
	
	@Autowired
	private TestBean testBean;
	
	@Test
	public void prodBeanShouldInject() {
		String expected = "from prod profile";
		String actual = testBean.getcontent();
		Assert.assertEquals(expected, actual);  // JUnit断言
	}
}
