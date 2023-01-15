package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojo.Employee;
import com.app.repository.IEmpRepo;

@Service
public class EmpSrvImpl implements IEmpSrv{

	@Autowired
	private IEmpRepo dbvar;
	
	public IEmpRepo getDbvar() {
		return dbvar;
	}

	public void setDbvar(IEmpRepo dbvar) {
		this.dbvar = dbvar;
	}

	public Employee getEmployee(int id) {
		
		return dbvar.getEmployeeDetails(id);
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dbvar.getAllEmployeeDetails();
	}



	public String insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		int result = dbvar.insertEmployee(emp);
		if(result==1) {
			
			return "Total Rows Impacted with Insert Query ==> " +result;
			
		}else{
			
			return "Insert Query Failed";
			
		}
	}

	public int udpateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dbvar.updateEmployee(emp);
	}

	public int deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return dbvar.deleteEmployee(empId);
	}

}
