package b;

public class ShapeApp1 {

	public static void main(String[] args) {

		Shape s = new Circle("yellow", 2);
//		System.out.println(s);
		s.print();

		s = new Rectangle("blue", 2, 4);
		s.print();

		Square a = new Square("black", 6);
		a.print();

	}

}
