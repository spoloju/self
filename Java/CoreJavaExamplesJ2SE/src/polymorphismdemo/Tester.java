package polymorphismdemo;

public class Tester extends Employee{

	private int noOfIssuesRaised;
	private int noOfIssuesClosed;
	
	double getBonus(){

		System.out.println("This is Tester Class get bonus");
		return (getSalary()*30)/100;
		
	}
	
	public int getNoOfIssuesRaised() {
		return noOfIssuesRaised;
	}
	public void setNoOfIssuesRaised(int noOfIssuesRaised) {
		this.noOfIssuesRaised = noOfIssuesRaised;
	}
	public int getNoOfIssuesClosed() {
		return noOfIssuesClosed;
	}
	public void setNoOfIssuesClosed(int noOfIssuesClosed) {
		this.noOfIssuesClosed = noOfIssuesClosed;
	}
	
	
}
