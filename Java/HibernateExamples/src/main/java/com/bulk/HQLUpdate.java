package com.bulk;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.session.Address;

public class HQLUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configObj = new Configuration();
		configObj.configure();

		SessionFactory sessionFactoryObj = configObj.buildSessionFactory();

		Session sessionObj = sessionFactoryObj.openSession();
		
		//NOTE-  Writing queries with respect to java class name and java class properties names.
		
		String query = "update Address a set streetName = 'Vidyanagar' where zipCode = 856454";

		Query queryObj = sessionObj.createQuery(query); // select * from addr  ex - @Table(name="addr"))
		
		Transaction tobj = sessionObj.beginTransaction();
		
		queryObj.executeUpdate();
		
		tobj.commit();
		
		sessionObj.close();
				
		
	}

}
