package com.app.service;

import java.util.List;

import com.app.pojo.Employee;

public interface IEmpSrv {
	
	public Employee getEmployee(int id);
	
	public List<Employee> getAllEmployee();
	
	public int udpateEmployee(Employee emp);
	
	public String insertEmployee(Employee emp);
	
	public int deleteEmployee(int empId);

}
