package com.mdits.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mdits.model.Employee;

@RestController
public class EmployeeRESTController {

	@Autowired
	RestTemplate restTemplate;
	
	
	String url = "http://localhost:8080/api/v1/employees/";
	
	
	@GetMapping(value = "/restTemp/employees")
	public String getEmployees()
	{
		System.out.println("Inside getEmployees method of SpringBootRestTemplateDemo Application");
		
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		ResponseEntity<String> responseEntity = restTemplate
				.exchange(url, HttpMethod.GET, entity, String.class);
		return responseEntity.getBody();
	}
	
	
	@GetMapping("/restTemp/employees/{id}")
	public String getEmployee(@PathVariable("id") int id)
	{
		System.out.println("Inside getEmployee method of SpringBootRestTemplateDemo Application");
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		ResponseEntity<String> responseEntity = restTemplate
				.exchange(url + id, HttpMethod.GET, entity, String.class);
				
		return responseEntity.getBody();
	}

	@PostMapping("/restTemp/employees")
//	@RequestMapping(value = "/restTemp/employees", method = RequestMethod.POST)
	public String createEmployee(@RequestBody Employee employee)
	{
		System.out.println("Inside createEmployee method of SpringBootRestTemplateDemo Application");
		
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Employee> entity = new HttpEntity<Employee>(employee, headers);

		ResponseEntity<String> responseEntity =  restTemplate
				.exchange(url , HttpMethod.POST, entity, String.class);
		return responseEntity.getBody();
				
	}

	@RequestMapping(value = "/restTemp/employees/{id}", method = RequestMethod.PUT)
	public String updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee)
	{
		System.out.println("Inside updateEmployee method of SpringBootRestTemplateDemo Application");
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Employee> entity = new HttpEntity<Employee>(employee, headers);

		ResponseEntity<String> responseEntity = 
				restTemplate.exchange(url + id, HttpMethod.PUT,
				entity, String.class);
		return responseEntity.getBody();
	}

	
	@RequestMapping(value = "/restTemp/employees/{id}", method = RequestMethod.DELETE)
	public String deleteEmployee(@PathVariable("id") int id)
	{
		System.out.println("Inside deleteEmployee method of SpringBootRestTemplateDemo Application");
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Employee> entity = new HttpEntity<Employee>(headers);

		ResponseEntity<String> responseEntity = restTemplate.exchange(url + id, HttpMethod.DELETE,
				entity, String.class);
		return responseEntity.getBody();	
	}

}
