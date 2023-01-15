package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Map<Object, Object> mp = new HashMap<Object, Object>();
		Map<Object, Object> mp = new LinkedHashMap<Object, Object>();
		mp.put(10, 20);
		mp.put("marks", 9.5);
		mp.put("marks", 100);
		mp.put(true, false);
		mp.put('a', 'c');
		mp.put(10.5,  10);
		mp.put(1234124312, 12);
		
		
		Set<Entry<Object, Object>> set = mp.entrySet();
		Iterator<Entry<Object, Object>> itr = set.iterator();
 		while(itr.hasNext()){
 			 
 			// this is incorrect code since every next() will get next value in the iterator
 			//System.out.println(itr.next().getKey() +"===" +itr.next().getKey());
 			Entry<Object, Object> entryobj  = itr.next();
 			System.out.println(entryobj.getKey() +"==> " + entryobj.getValue() );
 			
 		}
		
		
		
	}

}
