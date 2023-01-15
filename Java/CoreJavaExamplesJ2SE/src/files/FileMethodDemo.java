package files;

import java.io.File;
import java.io.IOException;

public class FileMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String location= "C:/Users/shravankumar/Documents/zoom/babutraining/DemoLocation/abc.txt";
		File f1 = new File(location);
		System.out.println("Is file Existed " + f1.exists());
		try {
			System.out.println("Is new file created " + f1.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("No of Chars in the file are  " + f1.length());
		System.out.println("Is location pointed to the file " + f1.isFile());
		//System.out.println("Is file deleted " + f1.delete());
		
	}
	
	

}

