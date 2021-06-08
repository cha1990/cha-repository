package conditions;

public class condition_ex4 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);
		double avr = (a + b) / 2d;

		System.out.println("a=" + a + " b=" + b);
		System.out.println("a div10=" + (a % 10) + " b div10=" + (b % 10));
		System.out.println("sum=" + (a + b));
		System.out.println("avr=" + avr);
		System.out.println("rectangle area=" + (a * b));

	}

}
