package basics;

public class IterativeStatementsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<5; i++){
			System.out.println("Hi Hello - " + i);
		}
		System.out.println(" ");
		int i=0;
		while (i<5){
			System.out.println("While Loop - Hi Hello - " + i);
			i++;
		}
		System.out.println();
		
		int k=0;
		do {
			System.out.println("value of k in do while loop is  "+k);
			k++;
		}while(k<5);		
	}

}
