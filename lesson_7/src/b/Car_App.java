package b;

public class Car_App {

	public static void main(String[] args) {

		System.out.println("number of cars made: " + Car_Static_Ex.getCounter());

		Car_Static_Ex c1 = new Car_Static_Ex();
		Car_Static_Ex c2 = new Car_Static_Ex();
		Car_Static_Ex c3 = new Car_Static_Ex();

		System.out.println("number of cars made: " + Car_Static_Ex.getCounter());

		System.out.println();
	}

}
