package conditions;

public class condition_ex6 {

	public static void main(String[] args) {

		int s = (int) (Math.random() * 200000);
		System.out.println(s);

		if (s < 23000) {
			System.out.println(s * 0.1);

		} else if (s > 23000 && s < 50000) {
			s = s - 23000;
			s = (int) (s * 0.2);
			s = s + 2300;
			System.out.println(s);

		} else if (s > 50000 && s < 100000) {
			s = s - 50000;
			s = (int) (s * 0.3);
			s = s + 7700;
			System.out.println(s);

		} else if (s > 100000) {
			s = s - 100000;
			s = (int) (s * 0.4);
			s = s + 22700;
			System.out.println(s);
		}

	}

}
