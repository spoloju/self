package polymorphismdemo;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addNumber(10, 2.5);
	}

	static void addNumber(int a, int b){
	
		int c = a+b;
		System.out.println(c);
	}
	
	static void addNumber(int a, double c){
		
		double d = a+c;
		System.out.println(d);
		
	}
	
	static void addNumber(int a, int b, int c){
		
		int d=a+b+c;
		System.out.println(d);
		
	}

	//Duplicate methods with same signature(arg's)
//	static int addNumber(int a, int b , int c){
//		
//		int e=a+b+c;
//		System.out.println(e);
//		return e;
//	}
//	
	
}
