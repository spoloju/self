package com.association.manytomany;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.association.manytoone.Address;

public class ManyToManyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configObj = new Configuration();
		configObj.configure();
		
		SessionFactory sessionFactoryObj = configObj.buildSessionFactory();
		
		Session sessionObj = sessionFactoryObj.openSession();
		
		Transaction tobj = sessionObj.beginTransaction();
		
		
		Course cr1 = new Course(1234, "Java", 8, 100);
		Course cr2 = new Course(2345, "Angular", 10, 200);
		Course cr3 = new Course(3456, "Python", 12, 300);
		
		Set<Course> set1 = new LinkedHashSet<Course>();
		
		set1.add(cr1);
		set1.add(cr2);
		set1.add(cr3);
		
		
		Set<Course> set2 = new HashSet<Course>();
		
		set2.add(cr1);
		set2.add(cr3);
		
		
		Student st1 = new Student(7412, "Shravan", set1);
		Student st2 = new Student(9632, "Kumar", set2);
		
		sessionObj.save(cr1);
		sessionObj.save(cr2);
		sessionObj.save(cr3);
		sessionObj.save(st1);
		sessionObj.save(st2);
		
		tobj.commit();
		
		sessionObj.close();
		
		
	}

}
