package collections;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		System.out.println("this is from EmployeeComparator");
		String empname1 = o1.getEmpName();
		String empname2 = o2.getEmpName();
		return empname1.compareTo(empname2);
		
	}
	
	

}
