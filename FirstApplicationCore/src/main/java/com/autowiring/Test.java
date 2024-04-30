package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/autowiring/auto.xml");
		Dept d=context.getBean("employe1",Dept.class);
		System.out.println(d);
	}

}
