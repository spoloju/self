package java8Features;

@FunctionalInterface
public interface Atm {
	
	Boolean enterPin(String pinNumber);
	
	
	//**** - Java 8 features **************
	//Default and static methods  -- are allowed to be written in an interface from java 8

	
	default double addTwoNumbers(int a , double b){
		return a+b;
	}
	
	static int multiplicationOfTwoNumber(int a, int b){
		return a*b;
	}

}
