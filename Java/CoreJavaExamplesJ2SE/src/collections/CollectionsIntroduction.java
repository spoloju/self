package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> arr = new ArrayList<Object>();
		
		arr.add(true);
		arr.add("Shravan");
		arr.add(12);
		arr.add(10.5);
		arr.add('a');
		arr.add(10000024545548L);
		
		Iterator<Object> itr = arr.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
			
		}
		
		
	}

}
