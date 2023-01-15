package assignments;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a1 ="mom";
		String a2 = "";
		
		for (int j=a1.length()-1; j>=0; j--){
			
			a2 = a2+String.valueOf(a1.charAt(j));
			
			
		}
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		
		

	}

}
