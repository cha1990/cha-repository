package Shape;

public class Circle extends Shape {

	private int radius;

	public Circle(int radius, String color) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double getArea() {

		return Math.PI * Math.pow(radius, 2);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
