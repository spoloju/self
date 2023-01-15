package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_WordsCount {
	//09-27-2021
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Find number of occurrences of a every word in a given sentence.
		String sentence = "I am a good boy Am I";
		// Step 1 - Break the sentence into words and hold the words in the collection.
		
		
		List<String> words =  Stream.of(sentence).map(w -> w.split("\\s+")).flatMap(Arrays :: stream).collect(Collectors.toList());
		System.out.println(words);
		
		// Step 2 - Iterate thru the collection of words and prepare a map with word as key and its no of occurrences as value. 
		//Map<String, Integer> repeatedwords= words.stream().collect(Collectors.toMap(w -> w.toLowerCase(),w -> 1, Integer::sum));
		Map<String, Integer> repeatedwords= words.stream().collect(Collectors.toMap(w -> w,w -> 1, Integer::sum));
		System.out.println(repeatedwords);
		
	}

}
