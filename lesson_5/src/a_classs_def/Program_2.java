package a_classs_def;

public class Program_2 {

	public static void main(String[] args) {

		// create a person instance
		Person p = new Person();

		// set the person state
		p.setId(101);
		p.setName("almog");
		p.setAge(30);

		// access and print
		System.out.println("id: " + p.getId());
		System.out.println("name: " + p.getName());
		System.out.println("age: " + p.getAge());
	}

}
