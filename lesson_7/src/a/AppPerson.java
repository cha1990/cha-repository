package a;

public class AppPerson {

	public static void main(String[] args) {

		Person p1 = new Person(825, "bob", 42);
		Person p2 = new Person(304, "marley", 24);

		System.out.println(p1.getId() + " , " + p2.getId());
		System.out.println(p1.getName() + " , " + p2.getName());
		System.out.println(p1.getAge() + " , " + p2.getAge());

		System.out.println("======");

		System.out.println(p1.toString());
		System.out.println(p1.hashCode());

		System.out.println("============");

		System.out.println(p1.equals(p2));
	}

}
