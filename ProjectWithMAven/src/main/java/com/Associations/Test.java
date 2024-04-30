package com.Associations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();

		Question qus = new Question();
		qus.setQuestionID(1212);
		qus.setQuestion("What is java");

		Answer ans = new Answer();
		ans.setAnswerId(101);
		ans.setAnswer("Java is a language");
		qus.setAnswer(ans);
		 ans.setQuestion(qus);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(qus);
		session.save(ans);

		tx.commit();
		session.close();
		factory.close();
	}

}
