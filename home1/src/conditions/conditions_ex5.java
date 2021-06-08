package conditions;

public class conditions_ex5 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		int c = (int) (Math.random() * 100);

		System.out.print("a= " + a);
		System.out.print(" ,b= " + b);
		System.out.print(" ,c= " + c);
		System.out.println();

		int max = 0;

		if (a < b) {
			max = b;
		} else {
			max = a;
		}

		if (max > c) {
			System.out.println("the biggest value is: " + max);
		} else {
			System.out.println("the biggest value is: " + c);
		}

	}

}
