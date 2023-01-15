package com.association.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Association_Employee")
public class Employee {

	@Id
	@Column(name="EmpID")
	private int empId;
	@Column(name="EmpName")
	private String empName;
	@Column(name="Gender")
	private String gender;
	@OneToOne
	private EmployeePan empPan;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(int empId, String empName, String gender, EmployeePan empPan) {
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		this.empPan = empPan;
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


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public EmployeePan getEmpPan() {
		return empPan;
	}


	public void setEmpPan(EmployeePan empPan) {
		this.empPan = empPan;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", gender=" + gender + ", empPan=" + empPan + "]";
	}
	
	
}
