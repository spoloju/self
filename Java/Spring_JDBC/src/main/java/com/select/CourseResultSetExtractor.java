package com.select;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nonSelect.Course;

public class CourseResultSetExtractor implements ResultSetExtractor<List<Course>>{

	public List<Course> extractData(ResultSet rs) throws SQLException, DataAccessException {

		// Iterate through rs object and parse 1 by 1 object and add to the collection
		List<Course> courses = new ArrayList<Course>();
		 
		while(rs.next()){		 
		  Course course = new Course(); // creating a new object everytime in the iteration to hold new row data. 
		  //Note - DOn't think of moving this one before while loop. 
		  course.setSid(rs.getInt("sId"));
		  course.setSname(rs.getString("sName"));
		  course.setStrainer(rs.getString("Strainer"));
		  course.setSfee(rs.getInt("fee"));
		  course.setSduration(rs.getInt("duration"));		  
		  courses.add(course);
		}

		return courses;

		
	}

}
