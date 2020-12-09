package com.lagou;

import org.springframework.beans.factory.InitializingBean;

/**
 *
 */
public class LagouBean implements InitializingBean {

	public LagouBean() {
		System.out.println("LagouBean 的构造器");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("LagouBean afterPropertiesSet...");
	}
}
