package com.app.service;

import java.util.List;

import com.pojo.BenifitsEnrollment;
import com.pojo.Department;
import com.pojo.Employee;

public interface IempServ {
	

	public List<Employee> getEmployeeDetails();
	
	public Employee getEmployeeDetails(int empId);
	
	public List<Department> getDepartmentDetails(int empId);
	
	public List<BenifitsEnrollment> getBenifits(int empId);
	
		

}
