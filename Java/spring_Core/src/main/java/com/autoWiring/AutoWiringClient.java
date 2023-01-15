package com.autoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext aobj = new ClassPathXmlApplicationContext("AutoWiring.xml");
		Employee emp = aobj.getBean("emp", Employee.class);
		System.out.println(emp);
		
		//autowire="byName"
		//Employee [id=0, name=null, atm=null, address=null] -- with autowire
		//Employee [id=0, name=null, atm=com.autoWiring.Icici@7d70d1b1, address=Address [city=null, zipCode=0, state=null]] -- -- without autowire
		
		//autowire="byType"
		//autowire="constructor"  ==> Strictly (byType+byName) .. Note - Constructor expects object type of properties as parameters. 
		
		
	}

}
