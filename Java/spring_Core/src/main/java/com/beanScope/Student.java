package com.beanScope;

public class Student {
	
	private long studentId;
	private String studentName;
	private long parentMobileNumber;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	Student(long studentId, String studentName, long parentMobileNumber){
		
		this.studentId=studentId;
		this.studentName=studentName;
		this.parentMobileNumber=parentMobileNumber;
	}
	
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public long getParentMobileNumber() {
		return parentMobileNumber;
	}
	public void setParentMobileNumber(long parentMobileNumber) {
		this.parentMobileNumber = parentMobileNumber;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", parentMobileNumber="
				+ parentMobileNumber + "]";
	}
	
	
	
	

}
