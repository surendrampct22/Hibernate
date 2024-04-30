package com.sterioannonattion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component()//Student student;
//@Scope("prototype")
//by default is the singleton
public class Student {
	@Value("Surendra")
	private String sutdentName;
	@Value("101")
	private int studentId;

	public String getSutdentName() {
		return sutdentName;
	}

	public void setSutdentName(String sutdentName) {
		this.sutdentName = sutdentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Student [sutdentName=" + sutdentName + ", studentId=" + studentId + "]";
	}

}
