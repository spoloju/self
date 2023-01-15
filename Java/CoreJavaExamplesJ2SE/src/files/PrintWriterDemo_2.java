package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String location= "C:/Users/shravankumar/Documents/zoom/babutraining/DemoLocation/abc.txt";
		File f1 = new File(location);
		
		try {		
			FileWriter fw= new FileWriter(f1, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(" this is String data");
			pw.println(" dummy data");
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}


