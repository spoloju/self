package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseAlphabeticOrderComparator rev = new ReverseAlphabeticOrderComparator();
		Set<String> set = new TreeSet<String>(rev);
		//Set<String> set = new TreeSet<String>();
		
		set.add("z");
		set.add("n");
		set.add("k");
		set.add("y");
		set.add("y");
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
	}

}
