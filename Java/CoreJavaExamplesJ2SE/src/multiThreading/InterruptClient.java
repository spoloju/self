package multiThreading;

public class InterruptClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Starting of Main Method ");
		
		InterruptDemo id = new InterruptDemo();
		
		Thread th = new Thread(id);
			
		th.start();
		

		
		for (int i=0; i<100; i++){
			
			
			System.out.println(" Value of i in main method is ==> " + (i+1));
			if(i==50){
				th.interrupt();
			}
		}		
		
		System.out.println(" Ending of Main Method ");
		
	}

}
