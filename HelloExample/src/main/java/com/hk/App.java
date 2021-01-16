package com.hk;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.hk.beans.HelloBean;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// load XML
		Resource resource = new ClassPathResource("resources/spring.xml");
		// create Factory object
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		// create object for bean - IOC container created one singleton object
		Object obj = beanFactory.getBean("helloBean");
		Object obj1 = beanFactory.getBean("helloBean");
		Object obj2 = beanFactory.getBean("helloBean");

		HelloBean hb = (HelloBean) obj;

		System.out.println(obj == obj1);
		System.out.println(obj1 == obj2);
		hb.hello();
	}
}
