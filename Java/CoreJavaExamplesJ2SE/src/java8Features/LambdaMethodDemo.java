package java8Features;

public class LambdaMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm icici = (pinNumber) -> {
									System.out.println("This is ICICI implementation on ATM");
									return true;
								   };
	   icici.enterPin("4554");
	   
	   Atm sbi = (pinNumber) -> {
	   							System.out.println("This is Sbi Implementation on ATM");
	   							return true;
	   							};
	   sbi.enterPin("23213");
	}

}
