package assignments;

public class BooksData {

	private String bookName;
	private String bookAuthor;
	private double bookPrice;
	private String bookPublisher;
	private String formatType;
	
	//Best Coding Practice is to have default constructor when you have a parameterized constructor
	BooksData(){
		
	}
	
	BooksData(String bookName, String bookAuthor, double bookPrice, String bookPublisher, String formatType){
		this.bookName=bookName;
		this.bookPrice=bookPrice;
		this.bookAuthor=bookAuthor;
		this.bookPublisher=bookPublisher;
		this.formatType=formatType;	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	@Override
	public String toString() {
		return "BooksData [bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice=" + bookPrice
				+ ", bookPublisher=" + bookPublisher +", formatType=" + formatType + "]";
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getBookAuthor() {
		return bookAuthor;
	}


	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}


	public double getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}


	public String getBookPublisher() {
		return bookPublisher;
	}


	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	
	public String getformatType() {
		return formatType;
	}
	
	public void setformatType(String formatType) {
		this.formatType = formatType;
	}
	

}