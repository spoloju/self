package basics;

public class RelationOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=20;
		int num2=10;
		int num3=10;
		
		String course1="Java";
		String course2="Angular";
		String course3="Angular";
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println(num1>=num2);
		System.out.println(num1<=num2);
		System.out.println(num2==num3);
		
		System.out.println();
		System.out.println(course2.equals(course3));
		System.out.println(course1.equals(course3));
	}

}

