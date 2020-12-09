package com.lagou;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

	@Test
	public void testIoC() {
		/**
		 *
		 */
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		LagouBean lagouBean = applicationContext.getBean(LagouBean.class);
		System.out.println(lagouBean);
	}
}
