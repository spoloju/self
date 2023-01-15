package com.nonSelect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NonSelectDemo {
	
	@Autowired
	private JdbcTemplate jdbcvar;
	
	
	public JdbcTemplate getJdbcvar() {
		return jdbcvar;
	}

	public void setJdbcvar(JdbcTemplate jdbcvar) {
		this.jdbcvar = jdbcvar;
	}
	
	
	public void insertCourse(Course course) {
		
		String query = "Insert into Course values (?,?,?,?,?)";
		int result = jdbcvar.update(query, new Object[] {course.getSname(), course.getSid(), course.getStrainer(), course.getSfee(), course.getSduration()});
		System.out.println(result);
	}

}
