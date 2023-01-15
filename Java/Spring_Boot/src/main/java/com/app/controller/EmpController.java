package com.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.pojo.Employee;
import com.app.service.IEmpSrv;

@Controller
@RequestMapping(value="/emp")
public class EmpController {
	
	@Autowired
	private IEmpSrv empsrv;
	
	
	public IEmpSrv getEmpsrv() {
		return empsrv;
	}

	public void setEmpsrv(IEmpSrv empsrv) {
		this.empsrv = empsrv;
	}

	@RequestMapping(value="/get", method=RequestMethod.GET)
	public @ResponseBody Employee getEmpDetails(@RequestParam int id) {
						
		return empsrv.getEmployee(id);		
	}
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public @ResponseBody List<Employee> getAllEmployee(){
		
		return empsrv.getAllEmployee();
		
	}

	@RequestMapping(value="/insertEmployee", method=RequestMethod.POST)
	public @ResponseBody String insertEmployee(@RequestBody Employee emp) {
		
		String result = empsrv.insertEmployee(emp);
		return result;
		
	}
	
	
	@RequestMapping(value="/updateEmployee", method=RequestMethod.POST)
	public @ResponseBody String updateEmployee(@RequestBody Employee emp) {
		
		int result = empsrv.udpateEmployee(emp);
		if(result != 0) {
		
			return "Total Rows Impacted with Update Query ==> "+ result;
		}else{
			return "Update Query Failed";
		}		
	}
	
	@RequestMapping(value="/deleteEmployee", method=RequestMethod.POST)
	public @ResponseBody String deleteEmployee(@RequestParam int empId) {
		int result = empsrv.deleteEmployee(empId);
		if(result==1) {
			return "Total Rows Impacted with Delete Query ==> " + result;	
		}else{
			return "Delete Query Failed";
		}
	}
	
}
