package assignments;

public class Thread1_Assignment extends Thread{

	
	public void method2() {
		System.out.println("Starting of Method2");
		for(int j=0; j<=100; j++) {
			System.out.println("Value of J ==>" + j);
		}
		System.out.println("Ending of Method2");
	}
	
	@Override
	public void run() {
	method2();
	}
}
