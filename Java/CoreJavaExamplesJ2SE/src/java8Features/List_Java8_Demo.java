package java8Features;


import java.util.LinkedList;
import java.util.List;

public class List_Java8_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> arr = new LinkedList<Object>(); //-- this is suggestible when you're manipulating data & gives good results in performance
		
		arr.add(true);
		arr.add("Shravan");
		arr.add(12);
		arr.add(12);
		arr.add(10.5);
		arr.add('a');
		arr.add(10000024545548L);
		arr.add(10000024545548L);
		
		arr.stream().forEach(x -> System.out.println(x));
		
	}

}
