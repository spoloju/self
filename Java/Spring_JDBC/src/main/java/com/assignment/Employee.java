package com.assignment;

public class Employee {
	
	private int empId;
	private String empName;
	private double salary;
	private double bonus;
	private int deptId;
	private int managerId;
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(int empId, String empName, double salary, double bonus, int deptId, int managerId) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.bonus = bonus;
		this.deptId = deptId;
		this.managerId = managerId;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
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


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", bonus=" + bonus
				+ ", deptId=" + deptId + ", managerId=" + managerId + "]";
	}
	
	
	
	
}
