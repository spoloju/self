package com.annotations;

import org.springframework.stereotype.Component;

@Component(value="icici") //Icici atm = new Icici();
public class Icici implements Atm{

	public int validatePin(int pin) {
		// TODO Auto-generated method stub
		System.out.println("This is ValidatePin method of ICICI Class");
		return 0;
	}

	public double balance() {
		// TODO Auto-generated method stub
		System.out.println("This is Balance method of ICICI Class");		
		return 0;
	}


}
