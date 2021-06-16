package animals;

public interface Flayer {

	// constants
	int MAX_ALT = 1000;

	// abstract method
	void fly();

	// default method
	default void glide() {
		System.out.println("gliding like a flayer");

	}

}
