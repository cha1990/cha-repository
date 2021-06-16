package b;

public abstract class Shape implements Printable {
	// attribute
	private String color; // instance variable (non-static)

	public int getId() {
		return id;
	}

	private final int id; // class variable (static)
	private static int counter;

	{
		// initializer-runs before CTOR
		counter++;
		this.id = counter;
	}

	// CTOR
	public Shape(String color) {
		super();
		this.color = color;
	}

	// abstract method
	public abstract double getArea();

	// concrete methods
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void print() {
		System.out.println(this);
	}
}