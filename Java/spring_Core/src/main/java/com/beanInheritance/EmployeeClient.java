package com.beanInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext aobj = new ClassPathXmlApplicationContext("BeanInheritance.xml");
		RegularEmployee remp = aobj.getBean("emp", RegularEmployee.class);
		System.out.println(remp);
		
		Employee emp = aobj.getBean("emp2", Employee.class);
		System.out.println(emp);
			
		
	}

}
