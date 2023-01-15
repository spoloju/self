package com.pojo;

import java.util.List;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private double bonus;
	private int deptId;
	private int managerId;
	private List<Department> dept;
	private List<BenifitsEnrollment> bfe;
	
	
	public Employee() {

	}

	public Employee(int employeeId, String employeeName, double salary, double bonus, int deptId, int managerId,
		List<Department> dept, List<BenifitsEnrollment> bfe) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.bonus = bonus;
		this.deptId = deptId;
		this.managerId = managerId;
		this.dept = dept;
		this.bfe = bfe;
	}

	
	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public double getBonus() {
		return bonus;
	}



	public void setBonus(double bonus) {
		this.bonus = bonus;
	}



	public int getDeptId() {
		return deptId;
	}



	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}



	public int getManagerId() {
		return managerId;
	}



	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}



	public List<Department> getDept() {
		return dept;
	}



	public void setDept(List<Department> dept) {
		this.dept = dept;
	}



	public List<BenifitsEnrollment> getBfe() {
		return bfe;
	}



	public void setBfe(List<BenifitsEnrollment> bfe) {
		this.bfe = bfe;
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", bonus=" + bonus + ", deptId=" + deptId + ", managerId=" + managerId + ", dept=" + dept + ", bfe="
				+ bfe + "]";
	}

	

}
