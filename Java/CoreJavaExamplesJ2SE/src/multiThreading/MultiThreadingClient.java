package multiThreading;

public class MultiThreadingClient {

	public static void main(String[] args) {
		
		System.out.println(" Starting of Main Method ");
		System.out.println();
		
		MultiThreadingDemo md = new MultiThreadingDemo();		
		//Step 2 - Create and start a new thread thru calling threadclass.start()
		md.start();
		//md.display();
		for (int i=0; i<100; i++){
			
			System.out.println(" Value of i in main method is ==> " + (i+1));
			
		}
		
		System.out.println();
		System.out.println(" Ending of Main Method ");
		

	}

}
