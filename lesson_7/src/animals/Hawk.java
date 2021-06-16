package animals;

public class Hawk extends Bird implements Flayer, Navigator {

	@Override
	public void speak() {
		System.out.println("ahha aha aha");

	}

	@Override
	public void fly() {

		System.out.println("fly like a boss Hawk");

	}

	@Override
	public void navigator() {
		// TODO Auto-generated method stub

	}

}
