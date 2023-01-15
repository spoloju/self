package collectionsPratice;

import java.util.HashSet;
import java.util.Iterator;

public class P_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Object> hs = new HashSet<Object>();
		
		hs.add(45454);
		hs.add(true);
		hs.add("Shravan Kumar");		
		hs.add('a');
		hs.add(10.5);
		
		
		Iterator<Object> itr = hs.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}

	}

}
