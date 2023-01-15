package classesAndObjects;

public class Student {

	private String name;
	private long rollNumber;
	private int age;
	private String course;
	private static String institute;
	
	Student(){
		
	}
	
	Student(String name, String course, int age, long rollNumber){
		this.name=name;
		this.age=age;
		this.rollNumber=rollNumber;
		this.course=course;
		
	}
	
	public static void main(String[] args) {
		Student.setInstitute("JNTU");
		Student stobj = new Student();
		stobj.setAge(15);
		stobj.setCourse("Java");
		stobj.setName("Kumar");
		stobj.setRollNumber(4545456445454L);
		System.out.println(stobj.getAge());
		System.out.println(stobj.getCourse());
		System.out.println(stobj.getName());
		System.out.println(stobj.getRollNumber());
		
		
	}

	 static void abc(){
		System.out.println(institute); 
		//System.out.println(age); you can't use non static variable in a static method. 
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(long rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public static String getInstitute() {
		return institute;
	}

	public static void setInstitute(String institute) {
		Student.institute = institute;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", age=" + age + ", course=" + course + "]";
	}
	

}


