package collections;

import java.util.Comparator;

public class ReverseAlphabeticOrderComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -(o1.compareTo(o2));  // Note - Alphabetic Characters are sorted based on ASCII characters. 
	}

}
