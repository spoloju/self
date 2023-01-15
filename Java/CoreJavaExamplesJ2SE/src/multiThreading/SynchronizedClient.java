package multiThreading;

public class SynchronizedClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println(" Starting of Main Method ");
		
		
		
		SynchronizedDemo sd = new SynchronizedDemo();
		
		Thread th = new Thread(sd);
		
		th.start();
		
		Thread th2 = new Thread(sd);
		
		th2.start();
		
		Thread th3 = new Thread(sd);
		
		th3.start();
		
		System.out.println(" Ending of Main Method ");

	}

}
