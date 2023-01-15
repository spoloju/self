package exceptionHandling;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Starting of MainMethod");
		
		
		try{
			
			System.out.println(10/2);
			System.out.println("Inside Try Block");
		}catch (Exception e) {
			System.out.println("Inside catch Block");
		}finally {
			System.out.println("Inside finally Block");
		}
	
		System.out.println(" Ending of MainMethod");
	
	}

}
