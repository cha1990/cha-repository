package loops;

public class loops_ex_6 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 100000);
		System.out.println(r);

		int t = r;
		int y = 0;

		while (t != 0) {
			y = y * 10;
			y = t % 10;
			t = t / 10;
		}

		System.out.println(t);

	}

}
