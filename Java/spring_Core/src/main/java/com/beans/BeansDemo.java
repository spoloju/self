package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansDemo {

	public static void main(String[] args) {
		
		ApplicationContext cobj = new ClassPathXmlApplicationContext("Beans.xml");
		
		// invocation of setter injection
		Employee empobj = cobj.getBean("emp", Employee.class);
		System.out.println("Invocation of setter injection ==> "+ empobj);
		
		// invocation of construction injection
		Employee empobj2 = cobj.getBean("emp2", Employee.class);
		System.out.println("Invocation of construction injection ==> " +empobj2);
		
	}
}
