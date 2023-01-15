package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JmsClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext aobj = new ClassPathXmlApplicationContext("SpringJMS.xml");
		JmsDemo jobj = aobj.getBean("shravanjms", JmsDemo.class);
		Student sobj = new Student(54545, "Shravan", 20 );
		jobj.sendData(sobj);		
		
		
		
	}

}
