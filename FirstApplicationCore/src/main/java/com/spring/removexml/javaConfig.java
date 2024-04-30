package com.spring.removexml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.spring.removexml")// not impact because we declare the bean
public class javaConfig {
	
	@Bean
	public Student getStudent() {
		return new Student();
	}
	

	@Bean
	public Employee getEmployee() {
		Employee e=new Employee(getStudent());
		return e;
	}

}
