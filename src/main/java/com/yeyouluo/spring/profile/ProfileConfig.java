package com.yeyouluo.spring.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {
	
	@Bean
	@Profile("dev")  // profile为dev时实例化devDemoBean
	public DemoBean devDemoBean() {
		return new DemoBean("from development profile");
	}

	@Bean
	@Profile("prod") // profile为prod时实例化prodDemoBean
	public DemoBean prodDemoBean() {
		return new DemoBean("from production profile");
	}
}
