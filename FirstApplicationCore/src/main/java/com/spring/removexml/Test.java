package com.spring.removexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(javaConfig.class);
		Employee e = con.getBean("getEmployee", Employee.class);
		System.out.println(e);
		e.study();
		
	}

}
