package multiThreading;

public class SynchronizedDemo implements Runnable{

	public synchronized void display(){
	System.out.println(" Starting of display method" + " Executed by " + Thread.currentThread().getName());
	System.out.println();
	
	for (int j=1; j<=100; j++){
		
		System.out.println(" Value of j in display method is ==> " + j+ " Executed by " + Thread.currentThread().getName());
		
	}
	
	System.out.println();
	System.out.println(" Ending of display Method "+ " Executed by " + Thread.currentThread().getName());
}	
	@Override
	public void run() {
		System.out.println(" Starting of run method" + " Executed by " + Thread.currentThread().getName());
		display();
		System.out.println(" Ending of run method" + " Executed by " + Thread.currentThread().getName());
	}

	
}
