package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbadableDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Student s = new Student();
		s.setStudentId(101);
		s.setStudentName("Vishal");

		Certificate c = new Certificate();
		c.setCourse("Java");
		c.setDuration("6 month");
		s.setCerti(c);

		session.save(s);
	

		tx.commit();

		session.close();

		
		factory.close();
	}

}
