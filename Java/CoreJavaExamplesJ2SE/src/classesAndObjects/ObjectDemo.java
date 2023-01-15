package classesAndObjects;

public class ObjectDemo {

	public static void main(String[] args) {
		Student stobj = new Student();
		Employee emobj= new Employee();
		stobj.setName("Kumar");
		stobj.setCourse("Java");
		stobj.setAge(29);
		stobj.setRollNumber(5646546465L);
		emobj.setName("Babu");
		emobj.setAge(29);
		emobj.setExperience(14);
		emobj.setExpertisein("FullStack");
		
//		System.out.println(stobj.getName());
//		System.out.println(stobj.getAge());
//		System.out.println(stobj.getCourse());
//		System.out.println(stobj.getRollNumber());
		System.out.println(stobj);
		System.out.println();
//		System.out.println(emobj.getName());
//		System.out.println(emobj.getAge());
//		System.out.println(emobj.getExperience());
//		System.out.println(emobj.getExpertisein());	
		System.out.println(emobj);

	}

}
