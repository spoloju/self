package assignments;

public class MoutainBike extends Bicycle{
	
	private double price;
	private String airpressure;
	
	MoutainBike(){
		
	}
	
	MoutainBike(double price, String airpressure, String name, String type){
		super(name, type);
		this.price=price;
		this.airpressure=airpressure;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAirpressure() {
		return airpressure;
	}

	public void setAirpressure(String airpressure) {
		this.airpressure = airpressure;
	}

}
