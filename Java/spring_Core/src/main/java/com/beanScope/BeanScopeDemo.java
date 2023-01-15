package com.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext aobj = new ClassPathXmlApplicationContext("BeanScope.xml");
		
		Student sobj =  aobj.getBean("bsd", Student.class);
		System.out.println("Setter Invocation ==> " + sobj.hashCode());
		
		Student sobj2 = aobj.getBean("bsd", Student.class);
		System.out.println("Setter Invocation ==> " + sobj2.hashCode());
		
		Student sobj3 = aobj.getBean("bsd", Student.class);
		System.out.println("Setter Invocation ==> " + sobj3.hashCode());
		
		System.out.println("===========================");
		
		Student sobj4 =  aobj.getBean("bsd2", Student.class);
		System.out.println("Constructor Invocation ==> " + sobj4.hashCode());
		
		Student sobj5 = aobj.getBean("bsd2", Student.class);
		System.out.println("Constructor Invocation ==> " + sobj5.hashCode());
		
		Student sobj6 = aobj.getBean("bsd2", Student.class);
		System.out.println("Constructor Invocation ==> " + sobj6.hashCode());
		
	}

}
