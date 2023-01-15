package com.beans;

public class Employee {
	
	private long empId;
	private String empName;
	private long mangerId;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(long empId, String empName, long mangerId) {
		
		this.empId=empId;
		this.empName=empName;
		this.mangerId=mangerId;
	}
	
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getMangerId() {
		return mangerId;
	}
	public void setMangerId(long mangerId) {
		this.mangerId = mangerId;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", mangerId=" + mangerId + "]";
	}
	
	
	
}
