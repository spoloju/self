package com.service;

import java.util.List;

import com.pojo.Employee;

public interface IEmpSrv {
	
	public Employee getEmployee(int id);
	
	public List<Employee> getAllEmployee();
	
	public int udpateEmployee(Employee emp);
	
	public int insertEmployee(Employee emp);
	
	public int deleteEmployee(int empId);

}
