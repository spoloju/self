package com.session;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addr")
public class Address {
	
	@Id
	@Column(name="ZipCode")
	private int zipCode;
	@Column(name="StreetName")
	private String streetName;
	@Column(name="City")
	private String city;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Address(int zipCode, String streetName, String city) {
		this.zipCode = zipCode;
		this.streetName = streetName;
		this.city = city;
	}	
	
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getAddress() {
		return streetName;
	}
	public void setAddress(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Address [zipCode=" + zipCode + ", streetName=" + streetName + ", city=" + city + "]";
	}
	
	

}
