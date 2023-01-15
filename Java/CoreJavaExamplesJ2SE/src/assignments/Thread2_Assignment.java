package assignments;

public class Thread2_Assignment implements Runnable{
	
	public void method3() {
		System.out.println("Starting of Method3");
		for(int k=0; k<=100; k++) {
			System.out.println("Value of k ==>" + k);
		}
		System.out.println("Ending of Method3");
	}
	
	@Override
	public void run() {
		method3();		
	}

}
