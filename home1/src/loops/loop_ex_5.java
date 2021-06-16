package loops;

public class loop_ex_5 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 10000);
		System.out.println(r);
		int ld = r;
		int rd = 0;
		int i = 0;
		int sr = r;
		int sum = 0;
		int rr = r;

		// 1.
		while (r != 0) {

			r = r / 10;
			i++;

		}
		System.out.println(i);

		// 2.
		while (ld > 9) {

			ld = ld / 10;

		}
		System.out.println(ld);

		// 3.
		while (sr != 0) {

			sum += sr % 10;
			sr = sr / 10;
		}
		System.out.println(sum);

		// 4.
		for (int j = 0; j < i; j++) {
			rd = rr % 10;
			System.out.print(rd);
			rr = rr / 10;
		}
	}

}
