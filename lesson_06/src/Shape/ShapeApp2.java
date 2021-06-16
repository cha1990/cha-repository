package Shape;

public class ShapeApp2 {

	public static void main(String[] args) {

		Shape shape;

		shape = new Circle(3, "red");
		System.out.println(shape.getArea());

		shape = new Rectange(4, 3, "red");
		System.out.println(shape.getArea());

	}

}
