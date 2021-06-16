package b;

public class Circle extends Shape {

	private int radius;

	public Circle(String color, int radius) {
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

	@Override
	public String toString() {
		return "Circle [radius= " + radius + ", Color= " + getColor() + "]";
	}

//	@Override
//	public void print() {
//
//	}
}
