package java8Features;

import java.util.ArrayList;
import java.util.Comparator;

public class Stream_Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(100);
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(40);
		arr.add(100);
		arr.add(90);
		Comparator<Integer> cp = (num1, num2) -> {
			 return -(num1.compareTo(num2));
			 };
		arr.stream().sorted(cp).forEach(x -> System.out.println(x));
		
		
		
	}

}
