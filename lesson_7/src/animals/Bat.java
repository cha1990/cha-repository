package animals;

public class Bat extends Mammal implements AdvancedFlayer {

	@Override // override the default implementation
	public void glide() {
		System.out.println("glide like a bat");
	}

	@Override
	public void speak() {
		System.out.println("xxx xxx");

	}

	@Override
	public void fly() {
		System.out.println("fly like a BatS boss");

	}

	@Override
	public void land() {
		System.out.println("land like a boss");
	}

	@Override
	public void takeoff() {
		System.out.println("takeoff");
	}

	@Override
	public void navigator() {
		System.out.println("navigate");

	}

}
