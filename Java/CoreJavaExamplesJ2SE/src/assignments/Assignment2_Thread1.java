package assignments;

public class Assignment2_Thread1 implements Runnable{
	
	public void method2() {
		System.out.println("Starting of Method2");
		for(int j=0; j<=300; j++) {
			System.out.println("Value of J ==>" + j + " Executed By " + Thread.currentThread().getName() + " with priority "+ Thread.currentThread().getPriority());
		}
		System.out.println("Ending of Method2");
	}
	
	@Override
	public void run() {
	//Thread.currentThread().setPriority(10);		
	method2();
	}

}
