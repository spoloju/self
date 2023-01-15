package multiThreading;


//Step 1 make the class eligible for multithreading

public class ImplementsRunnableDemo implements Runnable{

	
	public void display(){
		
		System.out.println("Starting of display Method");
		
		for(int j=0; j<100; j++){
			
		System.out.println("Value of j in display method is ==> " + j + " Executed by " + Thread.currentThread().getName() + " with priority of "+  Thread.currentThread().getPriority() );
		}
		
		System.out.println("Ending of display Method");
		
		
	}

	//Define a starting point for every newly created thread execution process
	@Override
	public void run() {
		Thread.currentThread().setPriority(9);
		System.out.println("Starting of Run Method");
		display();
		System.out.println("Ending of  Run Method");
		
	}
	

	
	
	
}
