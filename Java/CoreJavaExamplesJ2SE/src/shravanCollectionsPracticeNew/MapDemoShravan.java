package shravanCollectionsPracticeNew;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemoShravan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Map<Object, Object> mp = new HashMap<Object, Object>();
		Map<Object, Object> mp = new LinkedHashMap<Object, Object>();
		mp.put("CardType", "Visa");
		mp.put("CardNumber", 1234);
		mp.put("CardFullNumber", 89764654897456654L);
		mp.put("CardDecimal", 10.5);

		Set<Entry<Object, Object>> setObj = mp.entrySet();
		Iterator<Entry<Object, Object>> itrObj = setObj.iterator();

		while (itrObj.hasNext()) {

			Entry<Object, Object> keyValuePair = itrObj.next();

			System.out.println(keyValuePair.getKey() + " =====> " + keyValuePair.getValue());

		}

	}

}
