package multiThreading;

public class Employee {
	
	
	private String empid;
	private String salary;
	private String noOfHours;
	
	Employee(){
		
	}
	
	Employee(String empid, String salary, String noOfHours){
		
		this.empid=empid;
		this.salary=salary;
		this.noOfHours=noOfHours;
		
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(String noOfHours) {
		this.noOfHours = noOfHours;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", noOfHours=" + noOfHours + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object getting Destroyed is ==> " + this + " Executed by " + Thread.currentThread().getName());
	}

}
