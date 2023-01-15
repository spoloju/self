package com.association.manytomany;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Association_ManytoMany_Student")
public class Student {
	
	@Id
	@Column(name="RollNumber")
	private int rollNumber;
	@Column(name="Name")
	private String name;
	@ManyToMany
	@JoinTable(name = "Association_ManytoManyJoinTable", 
	joinColumns = { @JoinColumn(name = "RollNumber") }, inverseJoinColumns = { @JoinColumn(name ="CourseID")})
	private Set<Course> courses;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollNumber, String name, Set<Course> courses) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.courses = courses;
	}


	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", courses=" + courses + "]";
	}
	
	

}
