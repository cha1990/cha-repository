package Shape;

public class App3 {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[5];
		shapes[0] = new Rectange(5, 4, "red");
		shapes[1] = new Circle(4, "blue");
		shapes[2] = new Rectange(2, 2, "white");
		shapes[3] = new Shape("pink");
		shapes[4] = new Rectange(3, 5, "black");

		for (int i = 0; i < shapes.length; i++) {
			Shape shape = shapes[i];
			System.out.print("color: " + shape.getColor() + ",area: " + shape.getArea());

			System.out.println("this is a circle");
			Circle c = (Circle) shape;
			System.out.println("radius:" + c.getRadius());
		}

	}

}
