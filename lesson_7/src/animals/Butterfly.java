package animals;

public class Butterfly extends Insect implements Flayer {

	@Override
	public void speak() {
		System.out.println("....");

	}

	@Override
	public void fly() {
		System.out.println("fly like a boss Butterfly");

	}

}
