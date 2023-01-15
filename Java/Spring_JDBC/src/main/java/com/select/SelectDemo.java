package com.select;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nonSelect.Course;

@Repository
public class SelectDemo {
	
	@Autowired
	private JdbcTemplate jdbcvar;

	public JdbcTemplate getJdbcvar() {
		return jdbcvar;
	}

	public void setJdbcvar(JdbcTemplate jdbcvar) {
		this.jdbcvar = jdbcvar;
	}
	
	
	public void getCourseDetails(int courseId) {
		
		String query = "Select * from Course where sid=?";
		//Course cobj = jdbcvar.queryForObject(query, new Object[] {courseId}, new BeanPropertyRowMapper<Course>(Course.class));
		Course cobj = jdbcvar.queryForObject(query, new Object[] {courseId}, new CourseRowMapper());
		System.out.println(cobj);
		
	}
	
	
	public List<Course> getAllCourses(){
		
		String query = "Select * from Course";
		//return jdbcvar.query(query, new CourseRowMapper()); // this we can use when we have less number of records in the result. 
		return jdbcvar.query(query, new CourseResultSetExtractor()); // this we can use when we have more number of records in the result set. 
		
	}
	
	
}
