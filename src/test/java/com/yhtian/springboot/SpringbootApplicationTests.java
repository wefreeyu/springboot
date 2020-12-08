package com.yhtian.springboot;

import com.yhtian.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringbootApplicationTests {

	@Autowired
	Person person;

	@Autowired
	ApplicationContext ioc;

	@Test
	public void contextLoads() {
		System.out.println(person);
	}

	/**
	 * 测试容器中是否含有组件
	 *
	 * */
	@Test
	public void testHelloService() {
		boolean a = ioc.containsBean("helloService");
		System.out.println(a);
	}
}
