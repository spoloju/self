package com.isA.singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Employee")
public class RegularEmployee extends Employee{
	
	@Column(name="Salary")
	private double salary;
	@Column(name="Bonus")
	private double bonus;
	
	public RegularEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public RegularEmployee(int empId, String empName, String gender, double salary, double bonus) {
		super(empId, empName, gender);
		this.salary = salary;
		this.bonus = bonus;
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
	
	
	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", bonus=" + bonus + "]";
	}

	
}
