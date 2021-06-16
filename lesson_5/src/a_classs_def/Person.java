package a_classs_def;

public class Person {

	protected int id;
	protected String name;
	protected int age;

	// constructor1
	public Person() {

	}

	// constructor2
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		setAge(age);
	}

	/**
	 * change the age of this person if the value is valid
	 * 
	 * @param age
	 */
	public void setAge(int age) {
		// making the bounderies
		if (age >= 0 && age <= 120) {
			// the key word "this" is a reference to the current object
			this.age = age;
		}
	}

	/**
	 * returns the age of this person
	 * 
	 * @return
	 */
	public int getAge() {
		return this.age;
	}

	public void speak() {

		System.out.println("bala balala");
	}

	public void walk() {

		System.out.println(name + "is walking");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
