package com.dependencyCheck;

public interface Atm {
	
	public int validatePin(int pin);
	
	public double balance();

}