package shravanCollectionsPracticeNew;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> arr = new ArrayList<Object>();

		arr.add(true);
		arr.add("Hustlers");
		arr.add("Hustlers");
		arr.add(10.5);
		arr.add(78798744552L);
		Iterator<Object> itr = arr.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

}
