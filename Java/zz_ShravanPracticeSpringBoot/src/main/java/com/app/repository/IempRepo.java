package com.app.repository;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;

import com.pojo.BenifitsEnrollment;
import com.pojo.Department;
import com.pojo.Employee;

public interface IempRepo {
	
	
	public List<Employee> getEmployeeDetails() throws EmptyResultDataAccessException;
	
	public Employee getEmployeeDetails(int empId) throws EmptyResultDataAccessException;
	
	public List<Department> getDepartmentDetails(int empId);
	
	public List<BenifitsEnrollment> getBenifits(int empId);

}
