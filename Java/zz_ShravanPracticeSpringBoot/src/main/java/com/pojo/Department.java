package com.pojo;



public class Department {
	
	private int departmentId;
	private String departmentName;
	private String location;
	private int empId;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int departmentId, String departmentName, String location, int empId) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.location = location;
		this.empId = empId;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", location="
				+ location + ", empId=" + empId + "]";
	}
	
	
}
