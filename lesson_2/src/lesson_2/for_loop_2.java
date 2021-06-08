package lesson_2;

public class for_loop_2 {

	public static void main(String[] args) {

		int max = (int) (Math.random() * 10) + 1;
		int min = (int) (Math.random() * 10) + 1;
		System.out.println("MAX=" + max + " MIN= " + min);

		if (max < min) {
			int t = max;
			max = min;
			min = t;
		}

		for (int i = min; i <= max; i++) {
			System.out.println(i);
		}
	}

}
