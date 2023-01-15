package com.app.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pojo.BenifitsEnrollment;
import com.pojo.Department;
import com.pojo.Employee;

@Repository
public class EmployeeRepo implements IempRepo {

	@Autowired
	private JdbcTemplate jdbcvar;

	public EmployeeRepo() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeRepo(JdbcTemplate jdbcvar) {
		this.jdbcvar = jdbcvar;
	}

	public JdbcTemplate getJdbcvar() {
		return jdbcvar;
	}

	public void setJdbcvar(JdbcTemplate jdbcvar) {
		this.jdbcvar = jdbcvar;
	}

	@Override
	public Employee getEmployeeDetails(int empId) {
		Employee emp = new Employee();	
		
		
		try {
			String query = "select * from emp_tab where empid=?";
			// Employee emp = jdbcvar.queryForObject(query, new Object[] {empId}, new
			// EmpRowMapper());
			emp = jdbcvar.queryForObject(query, new Object[] { empId }, new EmpRowMapper()); // Here we need to handle exception because query for object is looking for atleast object. 

		} catch (EmptyResultDataAccessException empty) {
			System.out.println("Employee Repo ==>" + empty.toString());
		} catch (Exception e) {
			System.out.println("Employee Repo ==>" + e.getMessage());
		}
		List<Department> depts = getDepartmentDetails(empId);
		emp.setDept(depts);
		List<BenifitsEnrollment> bfe = getBenifits(empId);
		emp.setBfe(bfe);
		return emp;

	}

	@Override
	public List<Department> getDepartmentDetails(int empId) {

		String query = "select * from department where empid=?";
		List<Department> dept = jdbcvar.query(query, new Object[] { empId }, new DeptRowMapper()); // Here DON'T need to handle exception because when no rows are present it will return empty list[].
		return dept;
	}

	@Override
	public List<BenifitsEnrollment> getBenifits(int empId) {
		String query = "select * from benifitsenrollment where empid=?";
		List<BenifitsEnrollment> bfe = jdbcvar.query(query, new Object[] { empId }, new BenifitsRowMapper());
		return bfe;
	}

	@Override
	public List<Employee> getEmployeeDetails() {
		String query = "Select * from emp_tab";
		List<Employee> empAll = jdbcvar.query(query, new EmpRowMapper());
		// String empquery="Select * from emp_tab where empid=?";

		List<Employee> newemp = new ArrayList<Employee>();

		/*
		 * empAll.stream().forEach(x -> { Employee emp =
		 * jdbcvar.queryForObject(empquery, new Object[] {x.getEmployeeId()}, new
		 * EmpRowMapper()); List<Department> dept =
		 * getDepartmentDetails(x.getEmployeeId()); List<BenifitsEnrollment> enr =
		 * getBenifits(x.getEmployeeId()); emp.setBfe(enr); emp.setDept(dept);
		 * newemp.add(emp); //newemp.add(getEmployeeDetails(x.getEmployeeId()));
		 * 
		 * });
		 */
		empAll.stream().forEach(x -> {

			newemp.add(getEmployeeDetails(x.getEmployeeId()));

		});

		return newemp;

	}
}
