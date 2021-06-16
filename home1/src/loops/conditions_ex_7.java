package loops;

public class conditions_ex_7 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 2021);
		System.out.println(r);

		if (r % 4 == 0 && r % 100 != 0 || r % 100 == 0 && r % 400 == 0) {
			System.out.println("leap year");
		} else {
			System.out.println("not leap yaer");
		}

	}

}
