package Shape;

public class ShapeApp {

	public static void main(String[] args) {

		Shape shape = new Shape("blue");
		System.out.println(shape.getArea());

		Rectange rectange = new Rectange(5, 3, "blue");
		System.out.println(rectange.getArea());

		Circle circule = new Circle(5, "blue");
		System.out.println(circule.getArea());

	}

}
