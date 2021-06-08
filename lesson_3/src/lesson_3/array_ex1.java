package lesson_3;

public class array_ex1 {

	public static void main(String[] args) {

		int num[] = new int[25];
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			// create a random value and put it in array
			int r = (int) (Math.random() * 101);
			num[i] = r;
			sum += num[i];
			System.out.print(num[i] + ",");
		}
		System.out.println();
		System.out.println("====");
		System.out.println(sum);

	}

}
