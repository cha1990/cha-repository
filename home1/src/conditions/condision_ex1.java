package conditions;

public class condision_ex1 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);

		System.out.print(a + " ");
		System.out.println(b);

		if (a > b) {
			System.out.println(a + " is bigger");
		}
		{
			System.out.println(b + " is bigger");
		}

	}

}
