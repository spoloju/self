package multiThreading;

public class ImplementsRunnableClient {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		System.out.println("Starting of Main Method");
		
		ImplementsRunnableDemo ird = new ImplementsRunnableDemo();
		
		
		//Step - 2 , create and start a new thread by calling thread class start method after creating obj
		Thread th = new Thread(ird);		
		
		th.start();
		
		Thread.currentThread().setPriority(3);
		for(int i=0; i<100; i++){
			
			System.out.println("Value of i  in main method is ==> " + i + " Executed by " + Thread.currentThread().getName() + " with priority of "+  Thread.currentThread().getPriority() );
			
		}
		
		
		
		System.out.println("Ending of Main Method");
	}

}
