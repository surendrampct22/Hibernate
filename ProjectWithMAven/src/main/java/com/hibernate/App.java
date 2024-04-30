package com.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
       Configuration cfg=new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory=cfg.buildSessionFactory();
       //System.out.println(factory);
       Session session=factory.openSession();
       Transaction tx=session.beginTransaction();
       
       Student student=new Student();
       student.setStudentId(101);
       student.setStudentName("Surendra");
       
       //Creating a Address class object
       
       Address ad=new Address();
       
      // ad.setAddressId(101);
       ad.setCity("Gwalior");
       ad.setX(10.1);
       ad.setStreet("CC");
       ad.setOpen(true);
       ad.setOpenDate(new Date());
       
       
       //Reading the image
       
       FileInputStream file=new FileInputStream("src/main/java/101.JPG");
       byte[] b=new byte[file.available()];
       file.read(b);
       ad.setImage(b);
       
       session.save(student);
       session.save(ad);
       tx.commit();
       session.close();
       
       
       
    }
}

