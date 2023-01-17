package shravanCollectionsPracticeNew;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> ls = new LinkedList<String>();
		ls.add("Shravan");
		ls.add("Chandra");
		ls.add("Brahma");
		ls.add("Padma");
		ls.add("Prabhav");

		Comparator<String> str = (strName1, strName2) -> {

			return -(strName1.compareTo(strName2));

		};

		List<String> updatedList = ls.stream().sorted(str).map(x -> {
			x = x + " " + "Test";
			return x;
		}).collect(Collectors.toList());

		updatedList.stream().forEach(x -> System.out.println(x));

		/*
		 * Brahma Test Chandra Test Padma Test Prabhav Test Shravan Test
		 */

	}

}
