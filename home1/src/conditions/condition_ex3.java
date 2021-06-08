package conditions;

public class condition_ex3 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 100);
		System.out.println(r);

		if (r > 50) {
			System.out.println("big");
		} else {
			System.out.println("small");
		}

		if (r % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");

		}
	}

}
