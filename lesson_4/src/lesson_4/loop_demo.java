package lesson_4;

public class loop_demo {

	public static void main(String[] args) {

		// loops

		// while

		int c = 10;

		while (c <= 15) {
			System.out.print("*");
			c++;
		}

		System.out.println();
		System.out.println("=========");

		// for

		for (int i = 1; i < 5; i++) {
			System.out.print("+");

		}

		System.out.println();
		System.out.println("=========");

		// for-each

		String[] arr = { "aaa", "bbb", "ccc", "ddddddd", "ee" };

		for (String e : arr) {
			System.out.println(e);

			// if- condition for break
			if (e.length() > 5) {
				break;
			}
		}

	}

}
