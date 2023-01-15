package strings;

public class ScpAndHeap {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fname1="Kumar";
		String fname2="Kumar";
		String fname3="Harsha";
		String fname4=new String("Sachin");
		String fname5=new String("Sachin");
		String fname6=new String("Sehwag");
		
		System.out.println("This is direct String assign with reference(==) ");
		System.out.println(fname1==fname2);
		System.out.println(fname2==fname3);
		System.out.println(fname3==fname1);
		System.out.println();

		System.out.println("This is direct String assign with .equals ");
		System.out.println(fname1.equals(fname2));
		System.out.println(fname2.equals(fname3));
		System.out.println(fname3.equals(fname1));
		System.out.println();
		
		System.out.println("This is new String assign with reference(==) ");
		System.out.println(fname4==fname5);
		System.out.println(fname5==fname6);
		System.out.println(fname6==fname4);
		System.out.println();
		
		System.out.println("This is new String assign with .equals ");
		System.out.println(fname4.equals(fname5));
		System.out.println(fname5.equals(fname6));
		System.out.println(fname6.equals(fname4));
	}

}
