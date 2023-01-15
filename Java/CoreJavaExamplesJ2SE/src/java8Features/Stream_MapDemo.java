package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*list ==> Arraylist,LinkedList
				Set ===> HashSet,LinkedHashSet,LinkedHashSet,TreeSet 
				Map ===> HashMap,LinkedHashMap,TreeMap*/

		List<Integer> arr = new ArrayList<Integer>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(40);
		arr.add(100);
		arr.add(90);
		
/*		arr.stream().forEach(x -> {
			x = x+5;
			System.out.println("Total Marks after 5 bonus " + x);	
		});
		arr.stream().forEach(x -> System.out.println("Total Marks " + x));*/
		
		List<Integer> updatedmarks =  arr.stream().map(x -> {
			x = x+5;
			//System.out.println("Total Marks after 5 bonus " + x);	
			return x;
		}).collect(Collectors.toList());
		updatedmarks.stream().forEach(x -> System.out.println("Total Marks " + x));

	}

}
