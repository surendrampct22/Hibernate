package core.Springbeanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new  ClassPathXmlApplicationContext("core/Springbeanlifecycle/cycle.xml");
		context.registerShutdownHook();
		//Employee e=(Employee)context.getBean("s1");
		//System.out.println(e);
		
		Student s=(Student)context.getBean("p1");
		System.out.println(s);
		

	}

}
