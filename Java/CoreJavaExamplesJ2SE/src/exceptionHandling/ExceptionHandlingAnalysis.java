package exceptionHandling;

public class ExceptionHandlingAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Starting of Main Method");
		//System.out.println(10/0);
		try{
			System.out.println(20/0);	
		}catch (ArithmeticException e) {
			System.out.println("Please don't try to divide any number with 0");
		}
		
		System.out.println("Ending of Main Method");
	}

	
	
}
