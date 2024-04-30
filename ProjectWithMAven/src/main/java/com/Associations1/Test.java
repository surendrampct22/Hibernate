package com.Associations1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();

		Question1 qus = new Question1();
		qus.setQuestion("What is java");
		qus.setQuestionID(101);

		Answer1 ans = new Answer1();
		ans.setAnswerId(1);
		ans.setAnswer("Java is a language");
		ans.setQuestion(qus);

		Answer1 ans1 = new Answer1();
		ans1.setAnswerId(2);
		ans1.setAnswer("Java is a Object");
		ans1.setQuestion(qus);

		List<Answer1> list = new ArrayList<>();
		list.add(ans);
		list.add(ans1);

		qus.setAnswer(list);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(qus);
		session.save(ans);
		session.save(ans1);

		tx.commit();

		// fetching data
	 Question1 q=(Question1)session.get(Question1.class, 101);
	 System.out.println(q.getQuestion());
	 for(Answer1 a:q.getAnswer()) {
		 System.out.println(a.getAnswer());
	 }

		session.close();
		factory.close();
	}

}
