package assignments;

public class ThreadClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting of Main Method");
		
		Thread1_Assignment th1 = new Thread1_Assignment();
		Thread2_Assignment th2 = new Thread2_Assignment();
		th1.start();
						
		Thread th = new Thread(th2);
		th.start();
		
		for(int i=0; i<=100; i++) {
			System.out.println("value of i ==> " + i);
		}
		System.out.println("Ending of Main Method");
	}

}
