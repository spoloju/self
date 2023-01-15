package com.pojo;

public class BenifitsEnrollment {
	
	private int empId;
	private String enrolled;
	private boolean active;

	public BenifitsEnrollment() {
		// TODO Auto-generated constructor stub
	}

	public BenifitsEnrollment(int empId, String enrolled, boolean active) {
		this.empId = empId;
		this.enrolled = enrolled;
		this.active = active;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEnrolled() {
		return enrolled;
	}

	public void setEnrolled(String enrolled) {
		this.enrolled = enrolled;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "BenifitsEnrollment [empId=" + empId + ", enrolled=" + enrolled + ", active=" + active + "]";
	}
	
	
	
}
