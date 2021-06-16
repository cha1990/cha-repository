package a_classs_def;

public class Program_1 {

	public static void main(String[] args) {

		System.out.println("start");
		Person p1 = new Person();
		p1.setName("Dor");
		p1.speak();

		// print person age
		System.out.println("age" + p1.getAge());
		// set the person's age and print
		p1.setAge(30);
		System.out.println("age" + p1.getAge());

		System.out.println("stop");

	}

}
