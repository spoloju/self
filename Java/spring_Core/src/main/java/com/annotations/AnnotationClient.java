package com.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext aobj = new ClassPathXmlApplicationContext("Annonations.xml");
		Employee emp = aobj.getBean("employee", Employee.class);
		System.out.println(emp);
	}

}
