package lesson_06;

public class PersonApp {

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person(100);
		Person p3 = new Person(102, "moshe", 18);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
