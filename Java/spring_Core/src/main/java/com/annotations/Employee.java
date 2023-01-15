package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	//id, name, atm, address
	private long id;
	private String name;
	@Autowired
	@Qualifier(value="sbi")
	private Atm atm;
	@Autowired
	private Address address;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(long id, String name, Atm atm, Address address) {
		this.id = id;
		this.name = name;
		this.atm = atm;
		this.address = address;
	}
	
	public Employee(Atm atm, Address address) {
		this.atm = atm;
		this.address = address;
	}
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Atm getAtm() {
		return atm;
	}
	public void setAtm(Atm atm) {
		this.atm = atm;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
		
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", atm=" + atm + ", address=" + address + "]";
	}
	
	
	

}
