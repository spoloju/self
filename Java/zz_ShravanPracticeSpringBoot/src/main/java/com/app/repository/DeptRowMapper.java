package com.app.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;

import com.pojo.Department;

public class DeptRowMapper implements RowMapper<Department> {

	@Override
	public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
		Department dept = new Department();
		dept.setDepartmentId(rs.getInt("departmentid"));
		dept.setDepartmentName(rs.getString("departmentname"));
		dept.setLocation(rs.getString("location"));
		dept.setEmpId(rs.getInt("empid"));
		return dept;
	}

}
