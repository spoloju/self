package shravanCollectionsPracticeNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapSplitWordsStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "he had had he so he had only two";

		List<String> newStr = Stream.of(str).map(x -> x.split("\\s+")).flatMap(Arrays::stream)
				.collect(Collectors.toList());

		Map<String, Integer> repeatedWords = newStr.stream().collect(Collectors.toMap(w -> w, w -> 1, Integer::sum));
		System.out.println(repeatedWords);

		String latestStr = "Batman series is good and Batman is the king of the gotham city";

		List<String> latestwords = Stream.of(latestStr).map(x -> x.split("\\s+")).flatMap(Arrays::stream)
				.collect(Collectors.toList());

		Map<String, Integer> latestRepeatedWords = latestwords.stream()
				.collect(Collectors.toMap(w -> w, w -> 1, Integer::sum));
		System.out.println(latestRepeatedWords);
	}

}
