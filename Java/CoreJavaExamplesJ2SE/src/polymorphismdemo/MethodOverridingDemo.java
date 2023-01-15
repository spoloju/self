package polymorphismdemo;


public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee empc= new Employee();
		Programmer prgc = new Programmer();
		Tester tstc = new Tester();
		
		System.out.println("This is EmployeeClass Demo");
		empc.setId("5454");
		empc.setName("Kumar");
		empc.setSalary(5000);
		System.out.println(empc.getId());
		System.out.println(empc.getName());
		System.out.println(empc.getSalary());
		System.out.println();
		System.out.println("THis is ProgrammerClass Data");
		prgc.setId("332o9fds");
		prgc.setName("Biden");
		prgc.setSalary(6000);
		prgc.setNoOfIssuesAssigned(12);
		prgc.setNoOfIssuesResolved(10);
		System.out.println(prgc.getId());
		System.out.println(prgc.getName());
		System.out.println(prgc.getSalary());
		System.out.println(prgc.getNoOfIssuesAssigned());
		System.out.println(prgc.getNoOfIssuesResolved());
		System.out.println();
		System.out.println("THis is TesterClass Data");
		tstc.setId("dfdgf1221");
		tstc.setName("Obama");
		tstc.setSalary(7000);
		tstc.setNoOfIssuesRaised(33);
		tstc.setNoOfIssuesClosed(21);
		System.out.println(tstc.getId());
		System.out.println(tstc.getName());
		System.out.println(tstc.getSalary());
		System.out.println(tstc.getNoOfIssuesRaised());
		System.out.println(tstc.getNoOfIssuesClosed());
		
		System.out.println();
		System.out.println("Bonus generated for Employee Class ==> " + empc.getBonus());
		System.out.println("Bonus generated for Programmer Class ==> " + prgc.getBonus());
		System.out.println("Bonus generated for Tester Class ==> " + tstc.getBonus());

	}

}
