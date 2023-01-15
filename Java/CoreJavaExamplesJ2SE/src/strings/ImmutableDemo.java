package strings;

public class ImmutableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String fname1="Kumar";
		String fname2="Kumar";
		String fname3="Kumar";
		
		System.out.println("This is direct String assign with reference(==) ");
		System.out.println(fname1==fname2);
		System.out.println(fname2==fname3);
		System.out.println(fname3==fname1);
		fname3="babu";
		System.out.println();
		System.out.println("After updating result");
		System.out.println(fname1==fname2);
		System.out.println(fname2==fname3);
		System.out.println(fname3==fname1);
		
	}

}
