package inheritance;

public class RegularEmployee extends Employee {

	private double salary;
	private double bonus;
	
	RegularEmployee(){
		
	}
	
	
	RegularEmployee(double salary, double bonus, String id, String name, String gender){
		super(id, name, gender);
		this.salary=salary;
		this.bonus=bonus;
		//this.id=id; you can't use 'this' for parent class property
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
