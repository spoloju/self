package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<Object> arr = new ArrayList<Object>();  -- this is suggestible when you're reading data & gives good results in performance
		
		List<Object> arr = new LinkedList<Object>(); //-- this is suggestible when you're manipulating data & gives good results in performance
		
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
