package files;

import java.io.File;

public class FolderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String location= "C:/Users/shravankumar/Documents/zoom/babutraining/DemoLocation/abc";
		File f1 = new File(location);
		System.out.println("Is new folder created or not ==> " + f1.mkdir());
		System.out.println("Is location pointed to the directory or not ? ==> " + f1.isDirectory());
	}

}