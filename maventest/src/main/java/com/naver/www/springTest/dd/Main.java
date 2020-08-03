package com.naver.www.springTest.dd;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String [] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		Greeter gr  = ctx.getBean("gr", Greeter.class);
	}

}
