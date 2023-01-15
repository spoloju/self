package multiThreading;

public class SingleThreadingDemo {
	
	
	public void display(){
		
		System.out.println(" Starting of display method");
		System.out.println();
		
		for (int j=0; j<100; j++){
			
			System.out.println(" Value of j in display method is ==> " + (j+1));
			
		}
		
		System.out.println();
		System.out.println(" Ending of display Method ");
	}

}
