package a_classs_def;

public class Employee extends Person {

	private double salary;

	public Employee() {

	}

	public Employee(int id, String name, int age, double salary) {
		// call a constructor in the super class
		super(id, name, age);
		this.salary = salary;
		this.id = id;

	}

	public Employee(int id, String name, double salary) {
		// call a constructor in this class
		this(id, name, 0, salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
