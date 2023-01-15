package exceptionHandling;

import java.io.File;
import java.io.IOException;


public class ThrowsDemo {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String location= "C:/Users/shravankumar/Document/zoom/babutraining/DemoLocation/df.txt";	
		ThrowsDemo th = new ThrowsDemo();
		try {
			th.createFileInGivenLocation(location);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	void createFileInGivenLocation(String location) throws IOException{
		File f1 = new File(location);
		f1.createNewFile();
			System.out.println("File created successfully");
		
	}

}
