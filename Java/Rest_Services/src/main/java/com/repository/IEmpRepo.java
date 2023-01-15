package com.repository;

import java.util.List;

import com.pojo.Employee;

public interface IEmpRepo {

	public Employee getEmployeeDetails(int empId);	
	
	public List<Employee> getAllEmployeeDetails();
	
	public int insertEmployee(Employee emp);
	
	public int updateEmployee(Employee emp);
	
	public int deleteEmployee(int empId)  throws ArithmeticException;
}
