package conditions;

public class condition_ex_4 {

	public static void main(String[] args) {

		int a = 5000;
		int b = 6000;
		int r = (int) (Math.random() * (b - a + 1) + a);
		System.out.println(r);

		double top = r + r * 0.10;

		if (top < b) {
			System.out.println(top);
		} else {
			System.out.println("no raise");
		}
	}

}
