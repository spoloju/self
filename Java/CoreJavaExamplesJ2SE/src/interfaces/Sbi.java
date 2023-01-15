package interfaces;

public abstract class Sbi implements Atm{

	@Override
	public boolean validatePin(int pinNumber) {
		System.out.println("This is Sbi Pin Number");
		return false;
	}

	@Override
	public double balanceInquiry() {
		System.out.println("This is Sbi Balance Inquiry");
		return 0;
	}

	@Override
	public abstract void cashWithdrawal(int requestedAmount);
	
}
