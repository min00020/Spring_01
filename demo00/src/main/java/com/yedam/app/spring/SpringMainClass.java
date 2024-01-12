package com.yedam.app.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMainClass {

	public static void main(String[] args) {
		System.out.println("스프링방식");
		
		//GenericXmlApplicationContext
		ApplicationContext
		
		ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		TV tv = (TV)ctx.getBean("tv");
		//TV tv = (TV)ctx.getBean(TV.class); 사용하고자하는 클래스나 인터페이스 기반으로 등록되어있는 인터페이스 불러오는 방식
		tv.on();
	}
}
