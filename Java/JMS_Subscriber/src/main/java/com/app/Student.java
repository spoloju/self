package com.app;

import java.io.Serializable;

public class Student implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -1603254788504372325L;
	private int studentId;
	private String studentName;
	private int age;
	
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studentId, String studentName, int age) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + "]";
	}
	
	

}
