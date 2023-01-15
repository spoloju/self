package collections;

import java.util.Comparator;

public class DescendingOrderComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return -(o1.compareTo(o2));
		//o1.compareTo(o2) returns -1 if o1 < o2 so that in the order o1 comes before to o2 -- this is regular ascending order
		//o1.compareTo(o2) returns +1 of o1>o2 so that in the order o1 comes after to o2
		//o1.compareTo(o2) returns 0 if o1 & o2 are same. 
	}

}
