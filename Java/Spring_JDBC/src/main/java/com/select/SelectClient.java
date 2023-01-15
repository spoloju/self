package com.select;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nonSelect.Course;





public class SelectClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext aobj = new ClassPathXmlApplicationContext("Spring-JDBC.xml");
		SelectDemo sobj = aobj.getBean("selectDemo", SelectDemo.class);
		//sobj.getCourseDetails(7531);
		List<Course> ll = sobj.getAllCourses();
		
		for(Course ab:ll) {
			
			System.out.println(ab);
		}
		
	}

}
