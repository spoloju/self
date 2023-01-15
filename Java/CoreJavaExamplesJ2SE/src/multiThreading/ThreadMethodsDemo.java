package multiThreading;

public class ThreadMethodsDemo {

	public static void main(String[] args) {
		// 		
		
		System.out.println("Starting of Main Method");
		
		
				
		for(int i=0; i<10; i++){
			
			System.out.println("Value of i  in main method is ==> " + i + " Executed by " + Thread.currentThread().getName()+ " with Priority " + Thread.currentThread().getPriority());
			
			
		}		
		
		
		System.out.println("Ending of Main Method");

	}

}
