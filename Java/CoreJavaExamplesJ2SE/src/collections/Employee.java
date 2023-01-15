package collections;

public class Employee implements Comparable<Employee> {
	
	private String empName;
	private long empId;
	private int hours;
	
	Employee(){
		
	}

	Employee(String empName, long empId, int hours){
		
		this.empName = empName;
		this.empId=empId;
		this.hours=hours;
		
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", hours=" + hours + "]";
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	
	@Override
	public int compareTo(Employee o) {
	//TreeSet will call CompareTo Method with 2 objects as follows emp1.compareTo(emp2)
	//Now emp1 will be identified in the method using this keyword.
	// Now emp 2 will be identified using method argument. 
		
		Employee e1 = this;
		Employee e2 = o;
		Long e1empId=e1.getEmpId();
		Long e2empId = e2.getEmpId();
		return e1empId.compareTo(e2empId);
	}
	
}
