package classesAndObjects;

public class Employee {
	
	private String name;
	private int age;
	private int experience;
	private String expertisein;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emobj = new Employee();
		
		emobj.setName("Babu");
		emobj.setAge(30);
		emobj.setExperience(14);
		emobj.setExpertisein("FullStack");
		System.out.println(emobj.getName());
		System.out.println(emobj.getAge());
		System.out.println(emobj.getExperience());
		System.out.println(emobj.getExpertisein());
		System.out.println();
		Employee emobj2 = new Employee();
		emobj2.setName("Shravan");
		emobj2.setAge(29);
		emobj2.setExperience(5);
		emobj2.setExpertisein("Python Automation");
		System.out.println(emobj2.getName());
		System.out.println(emobj2.getAge());
		System.out.println(emobj2.getExperience());
		System.out.println(emobj2.getExpertisein());
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getExpertisein() {
		return expertisein;
	}

	public void setExpertisein(String string) {
		this.expertisein = string;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", experience=" + experience + ", expertisein=" + expertisein
				+ "]";
	}

}
