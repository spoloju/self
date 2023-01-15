package com.association.manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Association_ManytoOne_Address")
public class Address {
	
	@Id
	@Column(name="AddressID")
	private int addressId;
	@Column(name="StreetName")
	private String streetName;
	@Column(name="ZipCode")
	private int zipCode;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int addressId, String streetName, int zipCode) {
		super();
		this.addressId = addressId;
		this.streetName = streetName;
		this.zipCode = zipCode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", streetName=" + streetName + ", zipCode=" + zipCode + "]";
	}
	
	
	
	
}
