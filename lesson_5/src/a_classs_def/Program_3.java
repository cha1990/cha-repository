package a_classs_def;

public class Program_3 {

	public static void main(String[] args) {

		// create a person instance
		Person p = new Person();

		Person p2 = new Person(31, "almy", 13);

		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());

		System.out.println("======");

		System.out.println(p2.getId());
		System.out.println(p2.getName());
		System.out.println(p2.getAge());

	}

}
