package assignments;

public class StringMethodAssignment {
/*
	   Write a java program to display a reverse of a String
	   
	   Write a java program to find out no of words in a given sentence
	   
	   Write a java program to find out whether given string is palendrome (ex - mom is palendrome, cat is not palendrome)
	   
	   Assignment - 2 
	   
	   Write a java program to find out max value among the group of values present in a array
	   
	   Write a java program to give me a avg value in a array
	   ["1", "2", "3"]
	   
	   Write a java program to find out no of occurences of a similar words in a String array 
	   (ex - ["java", "html", "css", "java", "css"]
	*/
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String noofwords = "abc cdx cfa";
		System.out.println("no of words in a String ==> " + noofwords.split(" ").length);
		int[] arr= new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		int b=0;
		for (int a:arr){
			b=b+a;
			
		}
		System.out.println("Avg value of a array==> " +b/arr.length);
		
		String[] sarr = new String[5];
		sarr[0]="java";
		sarr[1]="html";
		sarr[2]="css";
		sarr[3]="java";
		sarr[4]="html";
		
		
		String ab = "";
		int count=0;
		
		for(String bc:sarr){
		
			if(ab.contains(bc)){
				System.out.println("Repative Words ==> " + bc);
				count=count+1;
			}
			ab = ab.concat(bc);
									
		}
		System.out.println("Total Number of Repetative Words ==> " + count);
	
		
		int[] maxvalue = new int[3];
		
		maxvalue[0]=3;
		maxvalue[1]=2;
		maxvalue[2]=1;
		
		int c=0;
		for(int a:maxvalue){
			
			if(a>c){
				c=a;
			}
			
			
		}
		
		System.out.println("Max value of a int array==> " + c);
		
		String ss= "abcsdsd";
		
		char[] chararray = new char[ss.length()] ;
		
		int i=0;
		
		for (int j=ss.length()-1; j>=0; j--){
			
			chararray[i] = ss.charAt(j);
			
			i++;
			
			}
		
		String str = String.valueOf(chararray);

		System.out.println("Reverse of a string 'abcsdsd' is " +  str );
		
		//===============================================================
		
		;
		String ss1= "abcsdsd";
		String strs="";
		
		for (int j=ss1.length()-1; j>=0; j--){
			
			strs = strs+String.valueOf(ss1.charAt(j));
			
			
		}
		System.out.println("Reverse of a string 'abcsdsd' is " +  strs );
		
		
		
		
		String palendrome = "mom";
		String checkpalendrome="";
		
		for (int j=palendrome.length()-1; j>=0; j--){
			
			checkpalendrome = checkpalendrome+String.valueOf(palendrome.charAt(j));
			
			
		}
		
		System.out.println("palendrome  ==>" +   palendrome.hashCode() );
		System.out.println("checkpalendrome ==>" +   checkpalendrome.hashCode() );
		System.out.println(checkpalendrome.equals(palendrome));
		System.out.println(checkpalendrome==palendrome);
		if (checkpalendrome==palendrome){
			
		System.out.println("Palendrome ==> " +   palendrome );

		
		}else {
			
			System.out.println("Hi Hello");
			
		}
		
		
		
	}
		
	
	
	
	
	
		
		
		//System.out.println("repetative count value of a string array==> " + repetativecount);
		
	

}

