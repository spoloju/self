package exceptionHandling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Starting of Main Method");
		try{
			System.out.println(10/0);
		}catch(ArithmeticException ex){
			System.out.println("Please don't try to divide any number with 0");
			//ex.printStackTrace();
			//System.out.println(ex.toString());
			System.out.println(ex.getMessage());
			
		}
		System.out.println("Ending of Main Method");

	}

}
