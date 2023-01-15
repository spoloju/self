package assignments;

public class Assignment2_ThreadClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting of Main Method");
		
		
		Assignment2_Thread1 th1 = new Assignment2_Thread1(); //runnable 
		Assignment2_Thread2 th2 = new Assignment2_Thread2(); //extends
						
		Thread th = new Thread(th1);
		//th.setPriority(10); can we do this way ? 
		//th.setPriority(10);
		//th2.setPriority(6);
		th.start();
		th2.start();
		
		for(int i=0; i<=300; i++) {
			//Thread.currentThread().setPriority(3);
			System.out.println("value of i ==> " + i+ " Executed By " + Thread.currentThread().getName() + " with priority "+ Thread.currentThread().getPriority());
			if(i==100) {
				try {
					th.sleep(4000); // this is j value & Method2
					// why it is accepting this way to run the program.// can we do this way instead of Thread.sleep(5000) in that specific class
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			 if(i==200) {
				 
				 try {
					th2.join(); // this is k value & Method3
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
			 }
			}
		}
		System.out.println("Ending of Main Method");
	}

}


