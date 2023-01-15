package com.session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Session_Cache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Configuration configObj = new Configuration();
		configObj.configure();
		
		SessionFactory sessionFactoryObj = configObj.buildSessionFactory();
		
		Session sessionObj = sessionFactoryObj.openSession();
		
		Address ad1 = (Address) sessionObj.get(Address.class, 1856454);
		Address ad2 = (Address) sessionObj.get(Address.class, 1856454);
		Address ad3 = (Address) sessionObj.get(Address.class, 1856454);
		
		sessionObj.close();
		System.out.println(ad1);
		System.out.println(ad2);
		System.out.println(ad3);
		
		
	}

}
