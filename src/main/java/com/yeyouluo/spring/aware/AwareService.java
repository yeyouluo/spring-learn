package com.yeyouluo.spring.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * SpingAware演示Bean
 * @author chen
 *
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware { // 实现两个接口，获得bean名称和资源加载的服务

	private String beanName;
	private ResourceLoader loader;
	
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) { // 实现ResourceLoaderAware需重写setResourceLoader
		// TODO Auto-generated method stub
		this.loader = resourceLoader;
	}

	@Override
	public void setBeanName(String name) {  // 实现BeanNameAware需重写setBeanName
		// TODO Auto-generated method stub
		this.beanName = name;
	}

	public void outputResult() {
		System.out.println("Bean的名称为：" + beanName);
		Resource resource = loader.getResource("classpath:/test.txt");
		
		try {
			System.out.println("Resource加载的文件内容为：" + IOUtils.toString(resource.getInputStream()));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
