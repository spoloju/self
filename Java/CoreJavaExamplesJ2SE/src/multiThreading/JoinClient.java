package multiThreading;

public class JoinClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Starting of Main Method ");
		System.out.println();
		
		JoinDemo jd= new JoinDemo();
		
		jd.start();
		
		
		for (int i=1; i<=100; i++){
			
			System.out.println(" Value of i in main method is ==> " + i);
			if(i==50){
				try {
					jd.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println();
		System.out.println(" Ending of Main Method ");
		
		
		
	}

}
