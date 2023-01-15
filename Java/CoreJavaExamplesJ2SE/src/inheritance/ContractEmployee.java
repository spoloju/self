package inheritance;

public class ContractEmployee extends Employee {
	

	private double hourlyPrice;
	private double duration;

	ContractEmployee(){
		
	}
	
	ContractEmployee(double hourlyPrice, double duration, String id, String name, String gender){
		super(id, name, gender);
		this.hourlyPrice=hourlyPrice;
		this.duration=duration;
	}
	
	public double getHourlyPrice() {
		return hourlyPrice;
	}
	public void setHourlyPrice(double hourlyPrice) {
		this.hourlyPrice = hourlyPrice;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	
}
