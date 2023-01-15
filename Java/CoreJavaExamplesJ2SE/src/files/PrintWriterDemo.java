package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String location= "C:/Users/shravankumar/Documents/zoom/babutraining/DemoLocation/abc.txt";
		File fl = new File(location);
		try {
			PrintWriter pw = new PrintWriter(fl);
			pw.println("Writing String Data");
			pw.println(12);
			pw.println(12.5);
			pw.println(true);
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

