package exceptionHandling;

public class InsufficientBalanceException extends RuntimeException{

	
	public InsufficientBalanceException() {
		super("Please Check the available Balance");
		
	}	
	
	public InsufficientBalanceException(String exmessage){
		
		super(exmessage);
		
	}

}
