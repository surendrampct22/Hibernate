package com.sterioannonattion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext con = new ClassPathXmlApplicationContext("com/sterioannonattion/configsterio.xml");
		Student s = con.getBean("student", Student.class);
		Student s1 = con.getBean("student", Student.class);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

	}

}
