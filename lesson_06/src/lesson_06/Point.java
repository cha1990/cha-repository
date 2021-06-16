package lesson_06;

public class Point {

	private int x;
	private int y;

	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point(int val) {
		this(val, val);

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

	public void print() {
		System.out.println("Point (" + x + "," + y + ")");
	}

	public void right() {
		x++;
	}

	public void right(int steps) {
		x += steps;
	}

	public void left() {
		x--;
	}

	public void left(int steps) {
		x -= steps;
	}

	public void up() {
		y++;
	}

	public void up(int steps) {
		y += steps;
	}

	public void down() {
		y--;
	}

	public void down(int steps) {
		y -= steps;
	}

	public void reset() {
		x = 0;
		y = 0;
		// also possible x=y=0
	}
}
