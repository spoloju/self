package com.session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Session_Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration configObj = new Configuration();
		configObj.configure();
		
		SessionFactory sessionFactoryObj = configObj.buildSessionFactory();
		
		Session sessionObj = sessionFactoryObj.openSession();
		Transaction tobj = sessionObj.beginTransaction();
		Address ad = new Address();
		ad.setZipCode(2856454);
		sessionObj.delete(ad);
		
		tobj.commit();
		sessionObj.close();
		
		
	}

}
