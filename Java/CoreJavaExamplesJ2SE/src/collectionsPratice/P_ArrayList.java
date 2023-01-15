package collectionsPratice;

import java.util.ArrayList;
import java.util.Iterator;

public class P_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Object> ar = new ArrayList<Object>();
		
		
		ar.add("PracticeArraylist");
		ar.add(50);
		ar.add(5454564654L);
		ar.add(true);
		
		
		Iterator<Object> itr = ar.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
