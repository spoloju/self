package multiThreading;
//Step1 - Make the class eligible for multi threading.
public class MultiThreadingDemo extends Thread {
	
	public void display(){
		
		System.out.println(" Starting of display method");
		System.out.println();
		
		for (int j=0; j<100; j++){
			
			System.out.println(" Value of j in display method is ==> " + (j+1));
			
		}
		
		System.out.println();
		System.out.println(" Ending of display Method ");
	}

	
	//Step 3 - Define starting point for newly created thread
	@Override
	public void run() {
	
		System.out.println(" Starting of run method ");
		display();
		System.out.println(" Ending of run Method ");
		
		
	}

}
