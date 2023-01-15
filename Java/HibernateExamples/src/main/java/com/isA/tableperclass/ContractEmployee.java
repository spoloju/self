package com.isA.tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TablePerClass_Contractor")
public class ContractEmployee extends Employee{
	
	@Column(name="HourlyPrice")
	private double hourlyPrice;
	@Column(name="Duration")
	private double duration;
	
	public ContractEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public ContractEmployee(int empId, String empName, String gender, double hourlyPrice, double duration) {
		super(empId, empName, gender);
		this.hourlyPrice = hourlyPrice;
		this.duration = duration;
	}

	public double getHourlyPrice() {
		return hourlyPrice;
	}

	public void setHourlyPrice(double hourlyPrice) {
		this.hourlyPrice = hourlyPrice;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "ContractEmployee [hourlyPrice=" + hourlyPrice + ", duration=" + duration + "]";
	}
}
