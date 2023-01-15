package files;

import java.io.File;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String location= "C:/Users/shravankumar/Documents/zoom/babutraining/DemoLocation/";
		
		File f1 = new File(location);
		
		String[] allItems= f1.list();
		
		for (String a:allItems){
			System.out.println(a);
		}
		System.out.println(allItems.length);
	}

}
