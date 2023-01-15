package multiThreading;

public class GarbageCollectionDemo {

	public static void main(String[] args) {
		
		
		Employee em = new Employee("2312321", "5000", "8");
		em = new Employee("212", "3232", "10");
		em = new Employee("23232", "21232132", "12");
		
		System.out.println(em);
		System.gc();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
