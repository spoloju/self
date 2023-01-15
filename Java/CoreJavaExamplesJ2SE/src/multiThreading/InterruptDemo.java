package multiThreading;

public class InterruptDemo implements Runnable {
	
	public void display(){
		
		System.out.println("Starting of display Method");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int j=0; j<100; j++){
			
		System.out.println("Value of j in display method is ==> " + j);
		}
		
		System.out.println("Ending of display Method");
		
		
	}

	@Override
	public void run() {
		
		display();
		
	}

}
