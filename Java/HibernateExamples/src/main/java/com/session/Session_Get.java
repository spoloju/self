package com.session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Session_Get {
	
	public static void main(String[] args) {
		
		Configuration configObj = new Configuration();
		configObj.configure();
		
		SessionFactory sessionFactoryObj = configObj.buildSessionFactory();
		
		Session sessionObj = sessionFactoryObj.openSession();
		
		Address ad = (Address) sessionObj.get(Address.class, 1856454);
		//Address ad = (Address) sessionObj.load(Address.class, 2856454);
		
		System.out.println(ad);
		
		sessionObj.close();
	}

}