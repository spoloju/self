package com.bulk;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.session.Address;

public class HQLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configObj = new Configuration();
		configObj.configure();

		SessionFactory sessionFactoryObj = configObj.buildSessionFactory();

		Session sessionObj = sessionFactoryObj.openSession();
		
		//NOTE-  Writing queries with respect to java class name and java class properties names.
		
		String query = "from Address a";

		Query queryObj = sessionObj.createQuery(query); // select * from addr  ex - @Table(name="addr"))
		List<Address> addr = queryObj.list();

		Iterator<Address> itrObj = addr.iterator();
		while (itrObj.hasNext()) {
			System.out.println(itrObj.next());
		}

	}

}
