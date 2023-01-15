package basics;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Methods, Variables - should be camel case starting with lower case. 
		System.out.println(" Starting of Main Method ");
		double addValue = addTwoNumbers(3,4.5);
		System.out.println(" Addition Result "+ addValue);
		int negativeValue=subthreeNumbers(4, 5, 6);
		System.out.println(" Negative Result "+ negativeValue);
		System.out.println(" Ending of Main Method ");
		
	}
	
	static double addTwoNumbers(int a, double b){
		System.out.println(" Input received " + a +" & "+ b );
		double c=a+b;
		return c;
	}
	
	static int subthreeNumbers(int a, int b, int c){
		System.out.println(" Input received " + a +" & " + b + " & "+ c);
		int d=a-b-c;
		return d;		
		
	}

}
