package java8Features;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Comparator<Integer> cp = (num1, num2) -> {
												 return -(num1.compareTo(num2));
												 };
		
		Set<Integer> set = new TreeSet<Integer>(cp);
		
		set.add(10);
		set.add(15);
		set.add(12);
		set.add(12);
		set.add(0);
		
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
		
	}
	
	
	

}
