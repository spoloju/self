package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Tree Set is used for Sorting and so inorder to sort - you need to have keys as homogenous.
		
		Map<String, Object> mp = new TreeMap<String, Object>();
		
		mp.put("Z_Studentid", "12312");
		mp.put("Y_StudentName", "Kumar");
		mp.put("H_StudentPercentage", 9.5 );
		mp.put("I_ParentsPhoneNumber", 124234323323L);
		mp.put("A_FinalexamPassed", true);
		
		Set<Entry<String, Object>> set = mp.entrySet();
		Iterator<Entry<String, Object>> itr = set.iterator();
		
		while(itr.hasNext()){
			
			Entry<String, Object> entobj = itr.next();
			System.out.println(entobj.getKey() +"==>"+ entobj.getValue());
			
		}
		

	}

}
