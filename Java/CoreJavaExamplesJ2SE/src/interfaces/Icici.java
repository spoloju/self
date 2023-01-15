package interfaces;

public class Icici implements Atm{

	//private String atmCode="";
	
	@Override
	public boolean validatePin(int pinNumber) {
		
		//System.out.println(atmCode);
		System.out.println("This is validatePin Method");
		return false;
	}

	@Override
	public double balanceInquiry() {
		System.out.println("This is balanceInquiry Method");
		return 0;
	}

	@Override
	public void cashWithdrawal(int requestedAmount) {
		System.out.println("This is cashWithdrawal Method");
		
	}

}
