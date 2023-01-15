package com.annotations;

import org.springframework.stereotype.Component;

//@Component //Address address = new Address();
@Component(value="abc") //Address abc = new Address();
public class Address {

	private String city;
	private long zipCode;
	private String state;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", zipCode=" + zipCode + ", state=" + state + "]";
	}	
	
}
