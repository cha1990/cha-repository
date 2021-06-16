package Shape;

public class Rectange extends Shape {

	private int length;
	private int width;

	public Rectange(int length, int width, String color) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}

}
