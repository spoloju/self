package polymorphismdemo;

public class SuperlClassRefSubClassObjRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		Programmer prg = new Programmer();
		Tester tst = new Tester();

		// Rule1 - Parent Class Variable can be assigned with any child class object
		// But child class variable can't be assigned with parent class obj

		Employee e2 = new Programmer();
		Employee e3 = new Employee();

		// Tester t2 = new Employee(); -- this fails the above rule

		// Rule 2 - When we assign child class object to parent class variable,
		// using parent class variable we can access only methods of parent class

		e2.setId("1231321");
		e2.setName("kUmar");
		e2.setSalary(5000);

		System.out.println(e2.getId());
		System.out.println(e2.getName());
		System.out.println(e2.getSalary());

		// Rule 3 = when we assign child class obj to parent class variable,
		// if we call overriden method, then the overriden logic of child class will be
		// executed.

		e2.getBonus();

	}

}
