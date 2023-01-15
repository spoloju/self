package multiThreading;

public class SingleThreadClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Starting of Main Method ");
		System.out.println();
		
		for (int i=0; i<100; i++){
			
			System.out.println(" Value of i in main method is ==> " + (i+1));
			
		}
		
		
		
		SingleThreadingDemo sd = new SingleThreadingDemo();
		sd.display();
		
		System.out.println();
		System.out.println(" Ending of Main Method ");
		
	}

}
