package assignments;

public class CallingBookData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BooksData bdobj =new BooksData("GameOfThrones", "Martin", 103.51, "Amazon", "Kindle");
		System.out.println(bdobj);
		System.out.println();
		BooksData bdobj2 =new BooksData("HarryPotter", "George", 315.21, "Amazon", "AudioBook");
		System.out.println(bdobj2);
		System.out.println();
		BooksData bdobj3 =new BooksData("LordofRings", "RRR", 454.49, "Amazon", "HardCover");
		//BooksData bdobj3 =new BooksData(); if class has constructor you can't skip the variables.  
		System.out.println(bdobj3.getBookName());
		System.out.println(bdobj3.getBookAuthor());
		System.out.println(bdobj3.getBookPrice());
		System.out.println(bdobj3.getBookPublisher());
		System.out.println(bdobj3.getformatType());		
		System.out.println();
		BooksData bdobj4 =new BooksData("300", "Steven", 976.85, "BanesandNobel", "PaperBack");
		System.out.println(bdobj4.getBookName());
		System.out.println(bdobj4.getBookAuthor());
		System.out.println(bdobj4.getBookPrice());
		System.out.println(bdobj4.getBookPublisher());
		System.out.println(bdobj4.getformatType());		
		
		
	}

}
