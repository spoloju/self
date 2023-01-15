package com.association.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Association_EmployeePan")
public class EmployeePan {
	
	@Id
	@Column(name="PanID")
	private int panId;
	@Column(name="PanCardNumber")
	private String panCardNumber;
	@OneToOne
	private Employee emp;
	
	public EmployeePan() {
		// TODO Auto-generated constructor stub
	}

	public EmployeePan(int panId, String panCardNumber, Employee emp) {
		this.panId = panId;
		this.panCardNumber = panCardNumber;
		this.emp = emp;
	}

	public int getPanId() {
		return panId;
	}

	public void setPanId(int panId) {
		this.panId = panId;
	}

	public String getPanCardNumber() {
		return panCardNumber;
	}

	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "EmployeePan [panId=" + panId + ", panCardNumber=" + panCardNumber + ", emp=" + emp + "]";
	}
	
	

}
