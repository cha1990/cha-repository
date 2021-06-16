package loops;

public class loop_ex_3 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 100);
		System.out.println(r);

		for (int i = 0; i < r; i += 2) {
			System.out.print(i + " ,");

		}

	}

}
