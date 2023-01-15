package com.nonSelect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NonSelectClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext aobj = new ClassPathXmlApplicationContext("Spring-JDBC.xml");
		NonSelectDemo nobj = aobj.getBean("nonSelectDemo", NonSelectDemo.class);
		Course cobj = new Course("kumar", 7531, "babu", 1000, 3 );
		nobj.insertCourse(cobj);		
		
	}

}
