package exceptionHandling;

public class TryWithMultipleCatches {

	private static String course;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Starting of Main Method");
		//System.out.println(10/0);
		try{
			System.out.println("Starting of try block");			
			System.out.println(20/0);
			System.out.println("Inbetween try block");
			System.out.println(course.length());
			System.out.println("Ending of try block");
		}catch(NullPointerException e){
			System.out.println("Don't call any method on the value null");
		}catch (ArithmeticException e) {
			System.out.println("Please don't try to divide any number with 0");
		}catch(Exception e){
			System.out.println("Some Exception Occured");
		}	
		
		System.out.println("Ending of Main Method");
	}
		
}

