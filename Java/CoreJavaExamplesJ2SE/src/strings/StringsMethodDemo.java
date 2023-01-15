package strings;

/**
 * @author shravankumar
 *
 */
public class StringsMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String course = "Java";
	String course2 = "java";
	//char course3 = 'a';
	String fullname = "  Virat  Kohli  ";
	System.out.println(course.charAt(0));
	//System.out.println(course.charAt(5)); this is out of index.
	
	System.out.println(course.indexOf("J"));
	System.out.println(course.length());			
	System.out.println(course.toLowerCase());
	System.out.println(course.toUpperCase());
	System.out.println(course.isEmpty());
	System.out.println(course.equals(course2));
	System.out.println(course.equalsIgnoreCase(course2));
	System.out.println(course.replace("a","x")); // this is case sensitive
	System.out.println(fullname);
	System.out.println(fullname.trim());
	System.out.println(String.join(" - ","Virat","Sehwag", "Rohit"));
	System.out.println(course.concat(course2));
	System.out.println(fullname.split("  "));
	
	}

	
	
}


