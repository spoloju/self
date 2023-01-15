package com.bulk;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.association.onetoone.Employee;

public class HQLDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configObj = new Configuration();
		configObj.configure();

		SessionFactory sessionFactoryObj = configObj.buildSessionFactory();

		Session sessionObj = sessionFactoryObj.openSession();
		
		
		//NOTE-  Writing queries with respect to java class name and java class properties names.
		
		String query = "Select zipCode, streetName from Address a"; // Strict RULE - Copy properties names from Address Class. 
		
		
		Query queryObj = sessionObj.createQuery(query); // select * from addr // select * from addr ( ex - @Table(name="addr"))
		
		//System.out.println("Shravan"+queryObj.list().iterator());
		List<Object[]> addr = queryObj.list();

		Iterator<Object[]> itrObj = addr.iterator();
		while (itrObj.hasNext()) {
			Object[] row = itrObj.next();
			System.out.println(row[0] + " " + row[1]);
		}

	}

}
