package collections;

import java.util.ArrayList;

public class CollectionsIntro_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> arr = new ArrayList<Object>();
		
		arr.add(true);
		arr.add("Shravan");
		arr.add(12);
		arr.add(10.5);
		
		
		System.out.println("size of collection arr array ==>" + arr.size());
		
		ArrayList<Object> arr1 = new ArrayList<Object>();
		
		arr1.add(false);
		arr1.add("kumar");
		arr1.addAll(arr);
		System.out.println("size of collection arr1 array ==>" + arr1.size());
		System.out.println(arr1.contains("Shravan"));
		System.out.println(arr1.containsAll(arr));
		//System.out.println(arr1.remove("Shravan"));
		//System.out.println(arr1.removeAll(arr));		
		System.out.println("size of collection arr1 array ==>" + arr1.size());
		System.out.println(arr1.retainAll(arr));
		System.out.println("size of collection arr1 array ==>" + arr1.size());
		System.out.println(arr1.get(1));
	}

}



