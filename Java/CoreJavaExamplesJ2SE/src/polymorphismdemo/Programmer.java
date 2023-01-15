package polymorphismdemo;

public class Programmer extends Employee{

	private int noOfIssuesResolved;
	private int noOfIssuesAssigned;
	
	
	double getBonus(){

		System.out.println("This is Programmer Class get bonus");	
		return (getSalary()*20)/100;
		
	}
	
	public int getNoOfIssuesResolved() {
		return noOfIssuesResolved;
	}
	public void setNoOfIssuesResolved(int noOfIssuesResolved) {
		this.noOfIssuesResolved = noOfIssuesResolved;
	}
	public int getNoOfIssuesAssigned() {
		return noOfIssuesAssigned;
	}
	public void setNoOfIssuesAssigned(int noOfIssuesAssigned) {
		this.noOfIssuesAssigned = noOfIssuesAssigned;
	}
	
	
}
