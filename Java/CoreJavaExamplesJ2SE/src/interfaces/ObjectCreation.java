package interfaces;

public class ObjectCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Icici ic = new Icici();
		//Atm atm = new Atm(); -- you can't create object of a Interface class
		//Sbi sn = new Sbi(); -- you can't create of a abstract class
		Sbi_2 sbi2 = new Sbi_2();
		
		sbi2.balanceInquiry();
		sbi2.cashWithdrawal(2445);
		sbi2.validatePin(1234);
		
	}

}
