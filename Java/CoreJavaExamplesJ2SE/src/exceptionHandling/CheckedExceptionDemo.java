package exceptionHandling;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting of Main Method");
		//System.out.println(10/0);
		String location= "C:/Users/shravankumar/Document/zoom/babutraining/DemoLocation/df.txt";
		
		File f1 = new File(location);
		try {
			f1.createNewFile();
			System.out.println("File created successfully");
		} catch (IOException e) {
			System.out.println("Please check the location provided");
		}
		System.out.println("Ending of Main Method");
	}
	
	
	
	public int shravan(int num) throws NullPointerException{
		int a = num;
		return a;
	}
	
	public void kumar() {
		
		shravan(123);
		
	}
	
}
