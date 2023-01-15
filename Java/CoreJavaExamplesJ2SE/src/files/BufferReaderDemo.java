package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	static FileReader fr;
	
	public static void main(String[] args) {
		
//		String location= "C:/Users/shravankumar/Documents/zoom/babutraining/DemoLocation/abc.txt";
		String location= "C:/SE7EN/J2SE_WorkSpace/CoreJavaExamplesJ2SE/src/textfiles/DaytoDayStatus.txt";
		File f1 = new File(location);
		
		try {
			fr = new FileReader(f1);
			BufferedReader bf= new BufferedReader(fr);
			String line;
			while( (line=bf.readLine())!=null ){
				System.out.println(line);	
			}	
			
			//Note - bf.readLine() = will always read new line of the file. so make sure you assign value like above to a string variable(ex - line)
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
