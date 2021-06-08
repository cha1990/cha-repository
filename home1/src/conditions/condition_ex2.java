package conditions;

public class condition_ex2 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 100);
		System.out.println(r);

		if (r < 50) {
			System.out.println("small");
		} else if (r > 50) {
			System.out.println("big");
		} else {
			System.out.println("bingo!");

		}
	}
}
