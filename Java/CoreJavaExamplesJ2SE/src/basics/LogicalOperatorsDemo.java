package basics;

public class LogicalOperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		displayEligibility(81, 91);
		displayEligibility(80, 94 );
		displayEligibility(79, 79);

	}
	
	
	static void displayEligibility(int accademicagg, int crtpct){
		if(accademicagg>80 && crtpct>90){
			System.out.println("You're Eligibile for Infosys Interview..");
		}else if(accademicagg>80 || crtpct>90){
			System.out.println("You're Eligibile for TCS Interview..");
		}else{
			System.out.println("Work on Improving Percentages..");
		}
	}

}
