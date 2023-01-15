package assignments;

public class Assignment2_Thread2 extends Thread{
	
	public void method3() {
		System.out.println("Starting of Method3");
		for(int k=0; k<=300; k++) {
			System.out.println("Value of k ==>" + k+ " Executed By " + Thread.currentThread().getName() + " with priority "+ Thread.currentThread().getPriority());
					
		}
		System.out.println("Ending of Method3");
	}
	
	@Override
	public void run() {
		//Thread.currentThread().setPriority(7);
		method3();		
	}
	


}
