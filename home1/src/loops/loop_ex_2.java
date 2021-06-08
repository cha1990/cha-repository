package loops;

public class loop_ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = (int) (Math.random() * 50);
		int b = (int) (Math.random() * 50);
		System.out.println(a + ", " + b);

		if (a < b) {
			while (a <= b) {
				System.out.print(a + ",");
				a++;
			}
		} else {
			while (a <= b) {
				System.out.print(b + ",");
				b++;
			}
		}
	}
}
