package multiThreading;

public class SleepMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting of Main Method");
		
		
		
		for(int i=0; i<10; i++){
			

			System.out.println("Value of i  in main method is ==> " + i );
			if(i==5){
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}		
		
		
		System.out.println("Ending of Main Method");
		
		
	}

}
