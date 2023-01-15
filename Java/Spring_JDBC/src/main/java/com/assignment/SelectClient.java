package com.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelectClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext aobj = new ClassPathXmlApplicationContext("Spring-JDBC.xml");
		Assignment_SelectDemo sobj =  aobj.getBean("assignment_SelectDemo", Assignment_SelectDemo.class);
		sobj.getEmployeeDetails(12345);
		Employee emp = new Employee(35785, "Obama", 2500, 500, 7511, 8511);
		System.out.println(sobj.insertEmployeeDetails(emp));
	}

}
