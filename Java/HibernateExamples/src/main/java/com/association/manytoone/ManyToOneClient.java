package com.association.manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToOneClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configObj = new Configuration();
		configObj.configure();
		
		SessionFactory sessionFactoryObj = configObj.buildSessionFactory();
		
		Session sessionObj = sessionFactoryObj.openSession();
		
		Transaction tobj = sessionObj.beginTransaction();
		
		Address ad = new Address(1234, "Tarnaka", 852369);
		
		Student st1 = new Student(1213, "Java", ad);
		Student st2 = new Student(1234, "Python", ad);
		Student st3 = new Student(1243, "Angular", ad);
		Student st4 = new Student(1253, "TypeScript", ad);
		
		sessionObj.save(ad);
		sessionObj.save(st1);
		sessionObj.save(st2);
		sessionObj.save(st3);
		sessionObj.save(st4);
		
		
		tobj.commit();
		
		sessionObj.close();
		

	}

}
