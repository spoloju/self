package java8Features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stream_Limit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//09-27-2021
		List<Integer> arr = new ArrayList<Integer>();
		
		arr.add(100);
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(40);
		arr.add(100);
		arr.add(90);
		
		Comparator<Integer> itr = (num1, num2)-> {
			return (num1.compareTo(num2));
		};
		//arr.stream().sorted(itr).limit(3).forEach(x -> System.out.println(x)); // this can be used when you're updating the variable in-between the iteration.
		//arr.stream().sorted(itr).limit(3).forEach(System.out :: println);
		System.out.println(arr.stream().max(itr));
		
	}

}
