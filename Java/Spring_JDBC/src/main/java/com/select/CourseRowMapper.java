package com.select;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nonSelect.Course;

public class CourseRowMapper implements RowMapper<Course>{

	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {

		Course cobj = new Course();
		cobj.setSid(rs.getInt("sid"));
		cobj.setSname(rs.getString("sname"));
		cobj.setStrainer(rs.getString("strainer"));
		cobj.setSfee(rs.getInt("fee"));
		cobj.setSduration(rs.getInt("duration"));
		return cobj;
		
		
	}

}
