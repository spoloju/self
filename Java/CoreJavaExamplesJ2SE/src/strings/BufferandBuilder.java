package strings;

public class BufferandBuilder {

	public static void main(String[] args) {

		/*String course = "java";
		
		course = "sql";
		course= "hibernate";
		course = "html";*/
		
		StringBuilder sb = new StringBuilder("java");
		
		sb.delete(0,  sb.length());
		sb.append("html");
		
		sb.delete(0,  sb.length());
		sb.append("css");
		
		sb.delete(0,  sb.length());
		sb.append("jQuery");
		
	}

}
