package com.dependencyCheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyClientCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext aobj = new ClassPathXmlApplicationContext("DependencyCheck.xml");
		Employee emp = aobj.getBean("emp", Employee.class);
		Employee emp2 = aobj.getBean("emp2", Employee.class);
		Employee emp3 = aobj.getBean("emp3", Employee.class);
		Employee emp4 = aobj.getBean("emp4", Employee.class);
		System.out.println(emp);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
	}

}

