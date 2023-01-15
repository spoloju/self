package collectionsPratice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class P_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		
		
		lhs.add(878754);
		lhs.add(true);
		lhs.add("sdafa Kumar");		
		lhs.add('a');
		lhs.add(10.5);
		
		
		Iterator<Object> itr =  lhs.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		
		
	}

}
