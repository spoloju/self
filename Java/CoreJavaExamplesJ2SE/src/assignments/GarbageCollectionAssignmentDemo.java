package assignments;

public class GarbageCollectionAssignmentDemo {
	
	private String schoolName;
	private int schoolStudentCount;
	private int schoolTeacherCount;
	
	GarbageCollectionAssignmentDemo(){
		
	}
	
	GarbageCollectionAssignmentDemo(String schoolName, int schoolStudentCount, int schoolTeacherCount){
		
		this.schoolName=schoolName;
		this.schoolStudentCount=schoolStudentCount;
		this.schoolTeacherCount=schoolTeacherCount;
		
	}
	
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getSchoolStudentCount() {
		return schoolStudentCount;
	}
	public void setSchoolStudentCount(int schoolStudentCount) {
		this.schoolStudentCount = schoolStudentCount;
	}
	public int getSchoolTeacherCount() {
		return schoolTeacherCount;
	}
	public void setSchoolTeacherCount(int schoolTeacherCount) {
		this.schoolTeacherCount = schoolTeacherCount;
	}
	@Override
	public String toString() {
		return "GarbageCollectionAssignmentDemo [schoolName=" + schoolName + ", schoolStudentCount="
				+ schoolStudentCount + ", schoolTeacherCount=" + schoolTeacherCount + "]";
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object being deleted by Garbage collection " + this + " with the thread " + Thread.currentThread().getName());
	}

}
