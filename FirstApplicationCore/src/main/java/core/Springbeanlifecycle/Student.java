package core.Springbeanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean {
	
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Student start");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// init methot
		
		System.out.println("It is the init student");
		
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("Student destroy method");
		// TODO Auto-generated method stub
		
	}
	
	

}
