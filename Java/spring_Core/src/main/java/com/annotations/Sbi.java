package com.annotations;

import org.springframework.stereotype.Component;

@Component(value="sbi") //Sbi sbi = new Sbi();
public class Sbi implements Atm {

	public int validatePin(int pin) {
		// TODO Auto-generated method stub
		System.out.println("This is ValidatePin method of SBI Class");
		return 0;
	}

	public double balance() {
		// TODO Auto-generated method stub
		System.out.println("This is Balance method of SBI Class");
		return 0;
	}

}
