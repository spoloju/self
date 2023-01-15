package java8Features;

public class ImplementsRunnableClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting of Main Method");
		//Step - 2 , create and start a new thread by calling thread class start method after creating obj
		Runnable r = () ->{
							System.out.println("Starting of run method");
							for(int j=0; j<=100;j++){
								System.out.println("Value of J is in run method is==> " + j + " Executed by " + Thread.currentThread().getName() + " with priority of "+  Thread.currentThread().getPriority() );								
							}
						  };
						  System.out.println("Ending of run method");
		Thread th = new Thread(r);		
		th.start();
		for(int i=0; i<100; i++){
			System.out.println("Value of i  in main method is ==> " + i + " Executed by " + Thread.currentThread().getName() + " with priority of "+  Thread.currentThread().getPriority() );
		}
		System.out.println("Ending of Main Method");
	}

}
