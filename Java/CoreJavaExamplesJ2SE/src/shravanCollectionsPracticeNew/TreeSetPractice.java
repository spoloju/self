package shravanCollectionsPracticeNew;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new TreeSet<String>();
		
		set.add("Shravan");
		set.add("Arun");
		set.add("Rajesh");
		set.add("Rohan");
		set.add("Mohan");
		set.add("Jaggu");
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
	}

}
