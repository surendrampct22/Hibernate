package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		//
		//Address a=(Address)session.get(Address.class, 1);//if object not found then return Null
		Student s=(Student)session.load(Student.class, 101);//if object not found then return ObjectNotFoundException
		//System.out.println(s);
		//System.out.println(a.getAddressId());
				
				
				
				session.close();
				
				factory.close();
		
	}

}
