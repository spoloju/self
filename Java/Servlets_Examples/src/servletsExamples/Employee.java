package servletsExamples;

public class Employee {

	//id, name, salary, bonus
	
	private long id;
	private String name;
	private double salary;
	private double bonus;
	private int deptId;
	private long managerId;
	
	Employee(){
		
	}
	
	Employee(long id, String name, double salary, double bonus, int deptId, long managerId ){
	
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.bonus=bonus;
		this.deptId=deptId;
		this.managerId=managerId;
		
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public long getManagerId() {
		return managerId;
	}

	public void setManagerId(long managerId) {
		this.managerId = managerId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + ", deptId="
				+ deptId + ", managerId=" + managerId + "]";
	}
	
	
	
}
