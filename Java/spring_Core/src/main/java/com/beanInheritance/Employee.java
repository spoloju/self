package com.beanInheritance;

public class Employee {
	
	private long employeeId;
	private String name;
	private String gender;
	
	public Employee() {
		
	}
	
	public Employee(long employeeId, String name, String gender) {
		this.employeeId = employeeId;
		this.name = name;
		this.gender = gender;
	}
	
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", gender=" + gender + "]";
	}
	

}
