package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.service.IempServ;
import com.pojo.Employee;

@Controller
@RequestMapping(value="/employee")
public class EmployeeController {
	
	@Autowired
	private IempServ empsrv;
	@Value("${appname.db.hostname}")
	private String hostname;
	public EmployeeController(IempServ empsrv) {
		this.empsrv = empsrv;
	}

	public void setEmpsrv(IempServ empsrv) {
		this.empsrv = empsrv;
	} 
	
	@RequestMapping(value="/getEmp", method=RequestMethod.GET)
	public @ResponseBody Employee getEmp(int empId) {
		
		System.out.println("hostname is ==> " + hostname);
		return empsrv.getEmployeeDetails(empId) ;
		
	}
	
	
/*	@RequestMapping(value="/getAllemp", method=RequestMethod.GET)
	public @ResponseBody List<Employee> getAllEmp() {
				
		return empsrv.getAllEmployeeDetails();
		
	}*/
	
	@RequestMapping(value="/getAllEmp", method=RequestMethod.GET)
	public @ResponseBody List<Employee> getAllEmp() {
				
		return empsrv.getEmployeeDetails();
		
	}
	
}