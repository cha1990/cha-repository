package b;

public class Square extends Rectangle {

	public Square(String color, int side) {
		super(color, side, side);

	}

	@Override
	public String toString() {
		return "Square [Length= " + getLenght() + ", Width= " + getWidth() + ", Color= " + getColor() + "]";
	}

	@Override
	public void setLenght(int length) {
		super.setLenght(length);
		super.setWidth(length);
	}

	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setLenght(width);

	}

}
