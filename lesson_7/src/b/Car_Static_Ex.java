package b;

public class Car_Static_Ex {

	private static int counter = 0;
	private final int number; // final
	private int speed;
	public static final int MAX_SPEED = 120; // static+final=constant

	{// initializer - runs before ant constractor
		this.number = counter;
		counter++;
	}

	public Car_Static_Ex(int speed) {
		setSpeed(speed);
		this.speed = speed;
	}

	public Car_Static_Ex() {

	}

	public static int getCounter() {
		// the "this" reference is not available in static methods
		return counter;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "the car number is: " + number;
	}

	public int getNumber() {
		return number;
	}

//	public void setNumber(int number) {
//		this.number = number;
//	}

	public int getSpeed(int speed) {
		return speed;

	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
