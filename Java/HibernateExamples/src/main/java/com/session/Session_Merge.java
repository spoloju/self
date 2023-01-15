package com.session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Session_Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configObj = new Configuration();
		configObj.configure();
		
		SessionFactory sessionFactoryObj = configObj.buildSessionFactory();
		
		Session sessionObj = sessionFactoryObj.openSession();
		Transaction tobj = sessionObj.beginTransaction();
		
		Address ad = (Address) sessionObj.get(Address.class, 1856454);
		
		Address ad2 = new Address(1856454, "Mahendra Hills", "Secunderbad");
		
		sessionObj.update(ad2);
		//sessionObj.merge(ad2);
		
		tobj.commit();
		sessionObj.close();
		
		
				
		
		
		
	}

}
