package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*DescendingOrderComparator desc = new DescendingOrderComparator();
		Set<Integer> set = new TreeSet<Integer>(desc);*/
		Set<Integer> set = new TreeSet<Integer>();
		
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
