package lesson_3;

public class array_1 {

	public static void main(String[] args) {

		System.out.println("start");

		// array of int
		int[] arr = new int[5];
		arr[1] = 6;
		arr[2] = 2;
		arr[3] = 14;
		arr[4] = 21;
		arr[5] = 3;

		// ACCESS ELEMENT
		System.out.println(arr[3]);

		// array of string
		String[] names = new String[4];
		names[0] = "almog";
		names[1] = "gadi";
		names[2] = "yossi";
		names[3] = "avi";

		// ACCESS ELEMENT
		System.out.println(names[3]);

	}

}
