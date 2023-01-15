package collectionsPratice;

import java.util.Iterator;
import java.util.LinkedList;

public class P_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Object> linkList = new LinkedList<Object>();
		
		linkList.add(45454);
		linkList.add(true);
		linkList.add("Shravan Kumar");
		linkList.add(10.5);
		
		Iterator<Object> itr = linkList.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		
	}

}
