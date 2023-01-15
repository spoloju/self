package inheritance;

public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RegularEmployee regemp= new RegularEmployee(34323, 3423432, "hdf3773", "Kummar", "male");
		System.out.println(regemp.getId());
		System.out.println(regemp.getName());
		System.out.println(regemp.getGender());
		System.out.println(regemp.getSalary());
		System.out.println(regemp.getBonus());		
	}

}
