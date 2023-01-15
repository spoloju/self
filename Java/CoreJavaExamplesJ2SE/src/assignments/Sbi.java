package assignments;

public class Sbi extends Rbi{
	
	
	private Boolean mobileBankingOption;
	
	Sbi(){
		
	}
	
	Sbi(boolean mobileBankingOption, double accountNumber, String accountName, String branch, double loanAmount){
		
		super(accountNumber, accountName, branch, loanAmount);
		this.mobileBankingOption=mobileBankingOption;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sbi sbi= new Sbi(false, 45454545, "Kumar", "Secunderbad", 5000);
		Icici ic = new Icici(true, 45454545, "Kumar", "Secunderbad", 5000);
		Rbi rb= new Rbi(45454545, "Kumar", "Secunderbad", 5000);
		
		System.out.println(" this is Rbi Interest Rate " + rb.calcuateInterest() );
		System.out.println(" this is Icici Interest Rate " + ic.calcuateInterest() );
		System.out.println(" this is Sbi Interest Rate " + sbi.calcuateInterest() );

	}
	
	
	double calcuateInterest(){
		
		return (getLoanAmount()*15)/100;
		
	}


	public Boolean getMobileBankingOption() {
		return mobileBankingOption;
	}


	public void setMobileBankingOption(Boolean mobileBankingOption) {
		this.mobileBankingOption = mobileBankingOption;
	}
	
	
	
	

}

