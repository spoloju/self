package basics;

public class ConditionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//displayDesignation(4);
		//displayDesignation(9);
		//displayDesignation(14);
		//displayDesignation(19);
		//displayDesignation(25);
		displayWeekName(2);
	}
	
	static void displayDesignation(int experience){
		
		if(experience<5){
			System.out.println(" Junior Software Engineer ");
			System.out.println("Im new to Java Development");
		}else if (experience<10){
			System.out.println(" Sr Software Engineer ");	
		}else if(experience<15){
			System.out.println(" Manager ");
		}else if(experience<20){
			System.out.println(" Sr Manager");
		}else{
			System.out.println(" Not Expected Experience ");
		}		
		
	}
	
	static void displayWeekName(int weekNumber ){
		
		switch(weekNumber){
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today is Wednesday");
			break;
		case 4:
			System.out.println("Today is Thursday");
			break;
		case 5:
			System.out.println("Today is Friday");
			break;
		case 6:
			System.out.println("Today is Saturday");
			break;
		case 7:
			System.out.println("Today is Sunday");
			break;
		default :
			System.out.println("Invalid WeekNumber");
		
		}
		
	}

	
}

