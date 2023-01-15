package basics;

public class VoidMethodDemo {
	static double aggregate=5.6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String newcourse = "Java";
		System.out.println(" Variable Course is " + newcourse);
		System.out.println(" double aggregate " + aggregate);
		displayDetails(123232112, "shravan", "male", "Java(J2SE)", 7543289374L);
	}
	
	
	//I want to write a method where input are rollnumber, name, gender, course, mobile & don't return any output.
	
	static void displayDetails(long rollnumber, String name, String gender, String course, long mobile ){
		System.out.println(" Roll Number is  " + rollnumber);
		System.out.println(" Gender is  " + gender);
		System.out.println(" Student Course is " + course);
		System.out.println(" Student Mobile Number is " + mobile);		
		//System.out.println(" Variable Course is " + newcourse);
		System.out.println(" double aggregate " + aggregate);
	}
}
