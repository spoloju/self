package basics;

public class TerinaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayDesignation(4);
	}

	static void displayDesignation(int experience){
		
		//String result = (experience<5)?"JuniorLevelSoftwareEngineer":"SrSofwareEngineer";
		String result =  (experience<5)?"JuniorLevelSoftwareEngineer"
				        :(experience<10)?"SoftwareEngineer"
		        		:(experience<20)?"SrSoftwareEngineer"
        				:"Manager";
		System.out.println(result);
	}
}