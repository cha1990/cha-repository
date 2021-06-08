
public class bingo_ex2 {

	public static void main(String[] args) {

		int bingo = (int) (Math.random() * 101);
		System.out.println(bingo);

		if (bingo > 50) {
			System.out.println("big");
		} else if (bingo < 50) {
			System.out.println("small");
		} else {
			System.out.println("bingo");
		}
	}

}
