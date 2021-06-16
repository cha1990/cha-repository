package b;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle(String color, int length, int width) {
		super(color); // invoke (call) super CTOR and pass color
		this.length = length;
		this.width = width;

	}

	@Override
	public double getArea() {
		return length * width;
	}

	public int getLenght() {
		return length;
	}

	public void setLenght(int lenght) {
		this.length = lenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setSide(int side) {
		setLenght(side);
		setWidth(side);
	}

	@Override
	public String toString() {
		return "Rectangle [lenght= " + length + ", width= " + width + ",Color= " + getColor() + "]";
	}

//	@Override
////	public void print() {
////
////	}
}
