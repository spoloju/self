package assignments;

public class Icici extends Rbi{
	
	private boolean mobileBankingOption;
	
	Icici(){
		
	}
	
	Icici(boolean mobileBankingOption, double accountNumber, String accountName, String branch, double loanAmount){
		
		super(accountNumber, accountName, branch, loanAmount);
		this.mobileBankingOption=mobileBankingOption;
		
	}
	
	
	double calcuateInterest(){			
		
		return (getLoanAmount()*10)/100;
		
	}
	
	public Boolean getMobileBankingOption() {
		return mobileBankingOption;
	}


	public void setMobileBankingOption(Boolean mobileBankingOption) {
		this.mobileBankingOption = mobileBankingOption;
	}
	
}
