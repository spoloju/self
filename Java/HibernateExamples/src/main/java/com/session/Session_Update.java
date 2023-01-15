package com.session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Session_Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration configObj = new Configuration();
		configObj.configure();
		
		SessionFactory sessionFactoryObj = configObj.buildSessionFactory();
		
		Session sessionObj = sessionFactoryObj.openSession();
		Transaction tobj = sessionObj.beginTransaction();

		/*Address ad = (Address) sessionObj.get(Address.class, 1856454);
		ad.setAddress("Banjara Hills");
		sessionObj.update(ad);*/
		
		Address ad = new Address(2856454, "Malakapet", "Secunderabad");
		sessionObj.saveOrUpdate(ad);
		
		tobj.commit();
		System.out.println(sessionObj.get(Address.class, 2856454));
		sessionObj.close();
		
	}

}
