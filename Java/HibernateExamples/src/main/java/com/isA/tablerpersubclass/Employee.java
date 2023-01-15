package com.isA.tablerpersubclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="TablePerSubClass_Employee")
@Inheritance(strategy=InheritanceType.JOINED)
public class Employee {
	
	
	@Id
	@Column(name="EmpID")
	private int empId;
	@Column(name="EmpName")
	private String empName;
	@Column(name="Gender")
	private String gender;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empId, String empName, String gender) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
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

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", gender=" + gender + "]";
	}
	
	
	

}
