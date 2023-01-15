package com.association.manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Association_ManytoOne_Student")
public class Student {
	
	@Id
	@Column(name="RollNumber")	
	private int rollNumber;
	@Column(name="Course")
	private String course;
	@ManyToOne
	@JoinColumn(name="AddressID")
	private Address address;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(int rollNumber, String course, Address address) {
		super();
		this.rollNumber = rollNumber;
		this.course = course;
		this.address = address;
	}


	public int getRollNumber() {
		return rollNumber;
	}


	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", course=" + course + ", address=" + address + "]";
	}
	
	
	

}
