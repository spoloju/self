package com.association.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configObj = new Configuration();
		configObj.configure();
		
		SessionFactory sessionFactoryObj = configObj.buildSessionFactory();
		
		Session sessionObj = sessionFactoryObj.openSession();
		
		Transaction tobj = sessionObj.beginTransaction();
		
		Employee emp = new Employee(456789, "Kumar", "Male", null);
		EmployeePan empPan = new EmployeePan(852452, "Acs951258963", null);
		
		emp.setEmpPan(empPan);
		empPan.setEmp(emp);
		
		sessionObj.save(emp);
		sessionObj.save(empPan);
		
		tobj.commit();
		
		sessionObj.close();
		
				
		
		
	}

}
