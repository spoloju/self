package com.repository;

import java.util.List;

import org.codehaus.jackson.map.deser.impl.BeanPropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BeanPropertyBindingResult;

import com.pojo.Employee;

@Repository
public class EmpRepoImpl implements IEmpRepo {
	
	@Autowired
	private JdbcTemplate jdbcvar;
	
	
	
	public JdbcTemplate getJdbcvar() {
		return jdbcvar;
	}

	public void setJdbcvar(JdbcTemplate jdbcvar) {
		this.jdbcvar = jdbcvar;
	}

	public Employee getEmployeeDetails(int empId) {
		
		String query = "Select * from Emp_Tab where EmpID=?";
		Employee getempdata = jdbcvar.queryForObject(query, new Object[] {empId}, new EmpRowMapper());
		return getempdata;
	}

	public List<Employee> getAllEmployeeDetails() {
		String query = "Select * from Emp_Tab";
		List<Employee> getempdata2 = jdbcvar.query(query, new EmpRowMapper());
		return getempdata2;
	}

	public int insertEmployee(Employee emp)
			throws ArithmeticException {
		String query = "Insert into emp_tab values(?,?,?,?,?,?)";
		int insertResult = jdbcvar.update(query, new Object[] {emp.getEmpId(), emp.getEmpName(), emp.getSalary(), emp.getBonus(), emp.getDeptId(), emp.getManagerId()});
		return insertResult;
	}

	public int updateEmployee(Employee emp)
			throws ArithmeticException {
		String query="update emp_tab set salary=? where empid=?";
		int updateResult = jdbcvar.update(query, new Object[] {emp.getSalary(), emp.getEmpId()});
		return updateResult;
	}

	public int deleteEmployee(int empId)
			throws ArithmeticException {
		String query="delete from emp_tab where empid=?";
		int deleteResult = jdbcvar.update(query, new Object[] {empId});
		return deleteResult;
	}

}
