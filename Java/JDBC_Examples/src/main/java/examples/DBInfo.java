package examples;

public enum DBInfo {

	DB_URL("jdbc:oracle:thin:@localhost:1522:batman"),
	DB_USERNAME("shravan"),
	DB_PASSWORD("shravan"),
	ERRORCODE2,
	ERROC;
	
	DBInfo(){
		
	}
	
	private String message;
	
	DBInfo(String message) {
		
		this.message=message;
		
	}
	
	
	public String toString() {
		
		return message;
		
	}
	
}
