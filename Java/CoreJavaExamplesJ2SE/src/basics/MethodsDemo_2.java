package basics;

public class MethodsDemo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(a+b)*(c+d)		
		int num1=10;
		int num2=20;				
		int num3=30;
		int num4=40;
		int new1=addTwoNumber(num1, num2);
		int new2=addTwoNumber(num3, num4);
		int resultValue=multiplyTwoNumbers(new1, new2);
		System.out.println("Final Result " + resultValue);
		
	}
	
	static int addTwoNumber(int a, int b){
		int c = a+b;
		return c;
	}
	
	static int multiplyTwoNumbers(int a, int b){		
		int c=a*b;
		return c;		
	}

}
