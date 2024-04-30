package com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Dept {

	//@Autowired
	Employee emp;

	//@Autowired
	public Dept(Employee emp) {
		super();
		this.emp = emp;
	}
	

	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee getEmp() {
		return emp;
	}

	//@Autowired
	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Dept [emp=" + emp + "]";
	}

}
