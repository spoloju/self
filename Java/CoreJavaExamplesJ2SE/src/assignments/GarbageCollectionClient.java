package assignments;

public class GarbageCollectionClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollectionAssignmentDemo gd = new GarbageCollectionAssignmentDemo("NarayanaCollege", 800, 60);
		gd=new GarbageCollectionAssignmentDemo("ChaitanyaSchool", 900, 100);
		gd=new GarbageCollectionAssignmentDemo("GunturSchool", 5654, 200);
		
		System.out.println(gd);
		System.gc();
		/*try {
			Thread.sleep(3000); why this was needed ?
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

}
