package lesson_06;

public class CarApp {

	public static void main(String[] args) {

		Car a = new Car(555555, "red");
		a.printLocation();

		a.getLocation().right(100);
		a.printLocation();

		a.setLocation(new Point(25, 87));
		a.printLocation();

		a.setLocation(22, 88);
		a.printLocation();
	}

}
