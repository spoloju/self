package multiThreading;

public class JoinDemo extends Thread{
	
	public void display(){
	System.out.println(" Starting of display method");
	System.out.println();
	
	for (int j=1; j<=100; j++){
		
		System.out.println(" Value of j in display method is ==> " + j);
		
	}
	
	System.out.println();
	System.out.println(" Ending of display Method ");
}
	
	@Override
	public void run() {
		
		System.out.println("Starting of run Method");
		display();
		System.out.println("Ending of run Method");
		
	}


}
