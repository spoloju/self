package assignments;

public class InheritanceDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bicycle bic = new Bicycle();
		System.out.println("This is independent bicycle data");
		bic.setName("Tesla");
		bic.setType("Electric");
		System.out.println(bic.getName());
		System.out.println(bic.getType());
		System.out.println();
		System.out.println("This is MountainBike Extending Bicycle Data and rest.");
		MoutainBike mbic=new MoutainBike();
		mbic.setName("Bmw");
		mbic.setType("Gear");
		mbic.setAirpressure("60ps");
		mbic.setPrice(454);
		System.out.println(mbic.getName());
		System.out.println(mbic.getType());
		System.out.println(mbic.getAirpressure());
		System.out.println(mbic.getPrice());
		
		
	}

}
