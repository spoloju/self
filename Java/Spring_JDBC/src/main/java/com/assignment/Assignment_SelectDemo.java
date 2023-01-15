package com.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Assignment_SelectDemo {

	@Autowired
	private JdbcTemplate jdbcvar;

		
	public JdbcTemplate getJdbcvar() {
		return jdbcvar;
	}



	public void setJdbcvar(JdbcTemplate jdbcvar) {
		this.jdbcvar = jdbcvar;
	}



	public void getEmployeeDetails(int empId) {
		
		String query="Select * from Emp_tab where empid=?";
		Employee obj = jdbcvar.queryForObject(query, new Object[]{empId}, new BeanPropertyRowMapper<Employee>(Employee.class));
		System.out.println(obj);
	}
	
	public int insertEmployeeDetails(Employee emp) {
		
		String query= "insert into emp_tab values(?,?,?,?,?,?)";
		return jdbcvar.update(query, new Object[] {emp.getEmpId(), emp.getEmpName(), emp.getSalary(), emp.getBonus(), emp.getDeptId(), emp.getManagerId()});
	}
	
	//update // delete
	
	
	
}
