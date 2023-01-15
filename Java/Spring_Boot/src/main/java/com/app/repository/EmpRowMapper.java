package com.app.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.pojo.Employee;

public class EmpRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setEmpId(rs.getInt("EmpId"));
		emp.setEmpName(rs.getString("EmpName"));
		emp.setSalary(rs.getDouble("Salary"));
		emp.setBonus(rs.getDouble("bonus"));
		emp.setManagerId(rs.getInt("managerid"));
		emp.setDeptId(rs.getInt("deptid"));		
		return emp;
	}

}
