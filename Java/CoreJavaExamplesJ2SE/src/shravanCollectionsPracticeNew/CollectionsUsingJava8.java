package shravanCollectionsPracticeNew;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsUsingJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> arrayList = new ArrayList<Object>();

		arrayList.add(true);
		arrayList.add("Shravan");
		arrayList.add(12);
		arrayList.add(12);
		arrayList.add(10.5);
		arrayList.add('a');
		arrayList.add(10000024545548L);
		arrayList.add(10000024545548L);
		System.out.println("===========================");
		System.out.println();
		System.out.println("arrayList using Java8");
		arrayList.stream().forEach(System.out::println);

		List<Object> linkedList = new LinkedList<Object>();

		linkedList.add(true);
		linkedList.add("Shravan");
		linkedList.add(12);
		linkedList.add(12);
		linkedList.add(10.5);
		linkedList.add('a');
		linkedList.add(10000024545548L);
		linkedList.add(10000024545548L);
		System.out.println("===========================");
		System.out.println();
		System.out.println("linkedList using Java8");
		linkedList.stream().forEach(System.out::println);

		Set<Object> hashSet = new HashSet<Object>();

		hashSet.add(true);
		hashSet.add("Shravan");
		hashSet.add(12);
		hashSet.add(12);
		hashSet.add(10.5);
		hashSet.add('a');
		hashSet.add(10000024545548L);
		hashSet.add(10000024545548L);
		System.out.println("===========================");
		System.out.println();
		System.out.println("hashSet using Java8");
		hashSet.stream().forEach(System.out::println);

		Set<Object> linkedhashSet = new LinkedHashSet<Object>();

		linkedhashSet.add(true);
		linkedhashSet.add("Shravan");
		linkedhashSet.add(12);
		linkedhashSet.add(12);
		linkedhashSet.add(10.5);
		linkedhashSet.add('a');
		linkedhashSet.add(10000024545548L);
		linkedhashSet.add(10000024545548L);
		System.out.println("===========================");
		System.out.println();
		System.out.println("linkedhashSet using Java8");
		linkedhashSet.stream().forEach(System.out::println);

		Set<String> treeSet = new TreeSet<String>();

		treeSet.add("Shravan");
		treeSet.add("Arun");
		treeSet.add("Rajesh");
		treeSet.add("Rohan");
		treeSet.add("Mohan");
		treeSet.add("Jaggu");

		Comparator<String> comp = (str1, str2) -> {

			return -(str1.compareTo(str2));
		};

		System.out.println("treeSet using Java8");
		treeSet.stream().sorted(comp).forEach(System.out::println);

		Map<String, Object> hashMap = new HashMap<String, Object>();

		hashMap.put("Z_Studentid", "12312");
		hashMap.put("Y_StudentName", "Kumar");
		hashMap.put("H_StudentPercentage", 9.5);
		hashMap.put("I_ParentsPhoneNumber", 124234323323L);
		hashMap.put("A_FinalexamPassed", true);
		System.out.println("===========================");
		System.out.println();
		System.out.println("hashMap using Java8");
		hashMap.entrySet().stream().forEach(x -> {

			System.out.println(x.getKey() + "==>" + x.getValue());

		});

		Map<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();

		linkedHashMap.put("Z_Studentid", "12312");
		linkedHashMap.put("Y_StudentName", "Kumar");
		linkedHashMap.put("H_StudentPercentage", 9.5);
		linkedHashMap.put("I_ParentsPhoneNumber", 124234323323L);
		linkedHashMap.put("A_FinalexamPassed", true);
		System.out.println("===========================");
		System.out.println();
		System.out.println("linkedHashMap using Java8");
		linkedHashMap.entrySet().stream().forEach(x -> {

			System.out.println(x.getKey() + "==>" + x.getValue());

		});

		Map<String, Object> treeMap = new TreeMap<String, Object>();

		treeMap.put("Z_Studentid", "12312");
		treeMap.put("Y_StudentName", "Kumar");
		treeMap.put("H_StudentPercentage", 9.5);
		treeMap.put("I_ParentsPhoneNumber", 124234323323L);
		treeMap.put("A_FinalexamPassed", true);

		Comparator<Entry<String, Object>> treeComp = (str1, str2) -> {

			return -(str1.getKey().compareTo(str2.getKey()));

		};

		System.out.println("===========================");
		System.out.println();
		System.out.println("treeMap using Java8 with custom compartor");
		treeMap.entrySet().stream().sorted(treeComp).forEach(x -> {

			System.out.println(x.getKey() + "==>" + x.getValue());

		});

		// =======================================================

		Map<String, Object> treeMap2 = new TreeMap<String, Object>();

		treeMap2.put("Z_Studentid", "12312");
		treeMap2.put("Y_StudentName", "Kumar");
		treeMap2.put("H_StudentPercentage", 9.5);
		treeMap2.put("I_ParentsPhoneNumber", 124234323323L);
		treeMap2.put("A_FinalexamPassed", true);

		System.out.println("===========================");
		System.out.println();
		System.out.println("treeMap2 using Java8 with custom compartor");
		treeMap2.entrySet().stream().sorted((str1, str2) -> -(str1.getKey().compareTo(str2.getKey())))
				.forEach(x -> System.out.println(x.getKey() + "==>" + x.getValue()));

	}

}
