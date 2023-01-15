package polymorphismdemo;

public class Employee {
	
	private String id;
	private String name;
	private double salary;
	

	double getBonus(){
		System.out.println("This is Employee Class get bonus");
		return (salary*10)/100;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
