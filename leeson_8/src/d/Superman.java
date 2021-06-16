package d;

public class Superman {

	// 1. private CTOR
	private Superman() {
	}
	// 2. define a private static field for the single instance

	private static Superman instance = new Superman();

	// 3. define a getter for that single in
	public static Superman getInstance() {
		return instance;
	}

//	@Override
//	public String toString() {
//		return "Superman [toString()=" + super.toString() + "]";
//	}
}
