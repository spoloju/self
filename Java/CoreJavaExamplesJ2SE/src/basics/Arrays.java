package basics;

public class Arrays {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] courses= new String[3];
		courses[0]="java";
		//courses[1]="python";
		courses[2]="Angular";
//		System.out.println("course of 0 " + courses[0]);
//		System.out.println("course of 1 " + courses[1]);
//		System.out.println("course of 2 " + courses[2]);
//		
//		for (int i=0; i<courses.length; i++){
//			
//			System.out.println("course of " + i + " " + courses[i]);
//		}
		
		for(String x:courses){
			System.out.println(x);
		}	
		//homogenous group - Same Group
		//Heterogenous group - Mix Group
 
	}

}
