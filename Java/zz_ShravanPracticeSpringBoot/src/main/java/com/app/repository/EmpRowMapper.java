package com.app.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.pojo.Employee;

public class EmpRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();

		emp.setEmployeeId(rs.getInt("empid"));
		emp.setEmployeeName(rs.getString("empname"));
		emp.setSalary(rs.getDouble("salary"));
		emp.setBonus(rs.getDouble("bonus"));
		emp.setDeptId(rs.getInt("deptid"));
		emp.setManagerId(rs.getInt("managerid"));

		return emp;

	}

}
