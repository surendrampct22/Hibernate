package com.spring.removexml;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private Student student;

	public Employee(Student student) {
		super();
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

		public void study() {
			this.student.Study();
		System.out.println("This is the Employee class");
	}

}
