package shravanCollectionsPracticeNew;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemoLearnAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Object> mp = new LinkedHashMap<String, Object>();
		mp.put("DLNumber", "E987456");
		mp.put("DLState", "AZ");
		mp.put("DLCountry", "USA");
		mp.put("DLZipCode", "859874");
		mp.put("DLCounty", "GrandCanyon");

		mp.entrySet().stream().forEach(x -> {

			System.out.println("Stream Data ==> " + x.getKey() + " ==> " + x.getValue());

		});

		Set<Entry<String, Object>> listSet = mp.entrySet();
		Iterator<Entry<String, Object>> itr = listSet.iterator();
		while (itr.hasNext()) {
			Entry<String, Object> newValue = itr.next();
			System.out.println(newValue.getKey() + " ---> " + newValue.getValue());
		}

	}

}
