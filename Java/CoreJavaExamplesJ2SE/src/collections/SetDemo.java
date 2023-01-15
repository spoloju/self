package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		   Set (I)
		      -- HashSet (C)    -- stores the data without following any order
		      -- LinkedHashSet (C)  -- stores the data with following insertion order
		      -- TreeSet (C)   -- stores the data with following sorting order*/
		Set<Object> arr = new HashSet<Object>(); // this also can be written as HashSet<Object> arr = new HashSet<Object>();
		//Set<Object> arr = new LinkedHashSet<Object>(); // this also can be written as LinkedHashSet<Object> arr = new LinkedHashSet<Object>()
		
		
		arr.add(true);
		arr.add("Shravan");
		arr.add(12);
		arr.add(12);
		arr.add(10.5);
		arr.add('a');
		arr.add(10000024545548L);
		arr.add(10000024545548L);
		
		Iterator<Object> itr = arr.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
 
	}

}
