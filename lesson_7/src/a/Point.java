package a;

public class Point {

	@Override
	public int hashCode() {
		return x + y; //
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Point)) {
			return false;
		}
		// if we are here then obj is a Point
		Point other = (Point) obj;
		return this.x == other.x && this.y == other.y;

		// long version
//		if (this.x == other.x && this.y == other.y) {
//			return true;
//
//		} else {
//			return false;
//		}
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	private int x;
	private int y;

	Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
