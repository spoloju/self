package com.session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Session_Insert {

	public static void main(String[] args) {
		
		Configuration configObj = new Configuration();
		configObj.configure();
		
		SessionFactory sessionFactoryObj = configObj.buildSessionFactory();
		
		Session sessionObj = sessionFactoryObj.openSession();
		
		Address aobj = new Address(3856454, "Himayatnagar", "Secunderabad");
		
		Transaction tobj = sessionObj.beginTransaction();
		
		//sessionObj.save(aobj);
		sessionObj.persist(aobj);
		tobj.commit();
		
		sessionObj.close();
		
	}

}
