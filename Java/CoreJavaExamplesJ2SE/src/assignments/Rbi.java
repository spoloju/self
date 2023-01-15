package assignments;

public class Rbi {
	
	private double accountNumber;
	private String accountName;
	private String branch;
	private double loanAmount;
	
	Rbi(){
		
	}
	
	Rbi(double accountNumber, String accountName, String branch, double loanAmount){
		
		this.accountNumber=accountNumber;
		this.accountName=accountName;
		this.branch=branch;
		this.loanAmount=loanAmount;
		
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	
	double calcuateInterest(){
		
		return (loanAmount*5)/100;
		
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

}
