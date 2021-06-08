package loops;

public class loop_ex_1 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 100);
		int i = 0;

		while (i <= r) {
			i++;
			System.out.print(i + ",");
		}
	}

}
