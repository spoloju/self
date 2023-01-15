package inheritance;

public class InheritanceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		RegularEmployee regemp= new RegularEmployee();
		ContractEmployee cemp=new ContractEmployee();

		emp.setId("R4545454");
		emp.setName("Kumar");
		emp.setGender("Male");
		System.out.println("This is Employee Data");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getGender());		
		System.out.println();
		System.out.println("This is Regular Employee Data");
		regemp.setBonus(1454554);
		regemp.setSalary(5454454);
		regemp.setId("U12345454");
		regemp.setName("Biden");
		regemp.setGender("male");
		System.out.println(regemp.getBonus());
		System.out.println(regemp.getSalary());
		System.out.println(regemp.getName());
		System.out.println(regemp.getId());
		System.out.println(regemp.getGender());
		System.out.println();
		cemp.setDuration(454);
		cemp.setHourlyPrice(87875);
		cemp.setId("fd1233332");
		cemp.setName("Obama");
		cemp.setGender("Male");
		System.out.println("This is Contractor Employee Data");
		System.out.println(cemp.getDuration());
		System.out.println(cemp.getHourlyPrice());
		System.out.println(cemp.getName());
		System.out.println(cemp.getId());
		System.out.println(cemp.getGender());
		
		
	
	}

}
