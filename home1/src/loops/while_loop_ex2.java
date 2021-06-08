package loops;

public class while_loop_ex2 {

	public static void main(String[] args) {

		int min = (int) (Math.random() * 100);
		int max = (int) (Math.random() * 100);
		int i = min;
		System.out.println(min + " " + max);

		if (min > max) {
			int t = max;
			max = min;
			min = t;
		}
		while (min <= max) {
			System.out.print(min + ",");
			min++;
		}

	}

}
