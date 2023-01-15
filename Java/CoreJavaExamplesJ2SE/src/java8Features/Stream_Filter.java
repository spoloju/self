package java8Features;

import java.util.ArrayList;
import java.util.List;

public class Stream_Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = new ArrayList<Integer>();
		
		arr.add(100);
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(40);
		arr.add(100);
		arr.add(90);
		
		arr.stream().filter(x -> x>60).forEach(x -> System.out.println(x));
		System.out.println(arr.stream().filter(x -> x>70).count());

	}

}
