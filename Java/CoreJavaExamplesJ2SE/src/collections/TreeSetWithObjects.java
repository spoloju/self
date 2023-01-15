package collections;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee em = new Employee("Shravan", 7645656, 8);
		Employee em1 = new Employee("Kumar", 8645656, 6);
		Employee em2 = new Employee("Babu", 9645656, 10);
		Employee em3 = new Employee("Musk", 4645656, 12);
		Employee em4 = new Employee("BillGates", 5645656, 20);		
		Set<Employee> set = new TreeSet<Employee>(); //this sorting is done by  comparable 
		//-- this is one case of sorting by using comparable.
		// Note - Objects are always compared using comparable
		//EmployeeComparator ec = new EmployeeComparator();
		//Set<Employee> set = new TreeSet<Employee>(ec); // -- this is one case of sorting by using Comparator but not recommended for Object sorting. 
		
		set.add(em1);
		set.add(em2);
		set.add(em);
		set.add(em3);
		set.add(em4);
		
		Iterator<Employee> itr = set.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
			
		}
		
		
		
		
	}

}
