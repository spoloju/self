package com.autoWiring;

public class Employee {
	
	//id, name, atm, address
	private long id;
	private String name;
	private Atm atm;
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
