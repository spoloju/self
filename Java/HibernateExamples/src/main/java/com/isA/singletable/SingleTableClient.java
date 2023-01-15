package com.isA.singletable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SingleTableClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configObj = new Configuration();
		configObj.configure();
		
		SessionFactory sessionFactoryObj = configObj.buildSessionFactory();
		
		Session sessionObj = sessionFactoryObj.openSession();
		
		Transaction tobj = sessionObj.beginTransaction();
		
		Employee emp = new Employee(159654, "Kumar", "Male");
		RegularEmployee remp = new RegularEmployee(256321, "Fatima", "Female", 5000, 1000);
		ContractEmployee cemp = new ContractEmployee(356321, "Sachin", "Male", 100000, 8);
		
		sessionObj.save(emp);
		sessionObj.save(remp);
		sessionObj.save(cemp);
		
		tobj.commit();
		
		sessionObj.close();
		
				
		
		
	}

}
