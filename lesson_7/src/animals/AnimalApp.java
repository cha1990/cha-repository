package animals;

public class AnimalApp {

	public static void main(String[] Args) {

		Animal[] animals = new Animal[6];

		animals[0] = new Dog();
		animals[1] = new Butterfly();
		animals[2] = new Hawk();
		animals[3] = new Ostrich();
		animals[4] = new Ant();
		animals[5] = new Bat();

		for (Animal animal : animals) {
			if (animal != null) {
				animal.speak();
				if (animal instanceof AdvancedFlayer) {
					Flayer flayer = (Flayer) animal;
					flayer.fly();

				}
			}

		}

	}

}
