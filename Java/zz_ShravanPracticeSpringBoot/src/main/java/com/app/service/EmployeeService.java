package com.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.repository.EmployeeRepo;
import com.pojo.BenifitsEnrollment;
import com.pojo.Department;
import com.pojo.Employee;

@Service
public class EmployeeService implements IempServ{

	@Autowired
	private EmployeeRepo empvar;
	
	
	public EmployeeService(EmployeeRepo empvar) {
		this.empvar = empvar;
	}
	
	public void setEmpvar(EmployeeRepo empvar) {
		this.empvar = empvar;
	}


	@Override
	public Employee getEmployeeDetails(int empId) {
		// TODO Auto-generated method stub
		return empvar.getEmployeeDetails(empId);
	}

	@Override
	public List<Department> getDepartmentDetails(int empId) {
		// TODO Auto-generated method stub
		return empvar.getDepartmentDetails(empId);
	}

	@Override
	public List<BenifitsEnrollment> getBenifits(int empId) {
		// TODO Auto-generated method stub
		return empvar.getBenifits(empId);
	}

	
	@Override
	public List<Employee> getEmployeeDetails() {
		// TODO Auto-generated method stub
		return empvar.getEmployeeDetails();
	}
	
}
