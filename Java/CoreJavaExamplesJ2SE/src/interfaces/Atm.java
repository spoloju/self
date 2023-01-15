package interfaces;

public interface Atm {
	
	String atmCode="0015";
	
	boolean validatePin(int pinNumber);
	
	double balanceInquiry();
	
	void cashWithdrawal(int requestedAmount);
	
	
	//**** - Java 8 features **************
	//Default and static methods  -- are allowed to be written in an interface from java 8

	default double addTwoNumbers(int a , double b){
		return a+b;
	}
	
	static int multiplicationOfTwoNumber(int a, int b){
		return a*b;
	}

}
