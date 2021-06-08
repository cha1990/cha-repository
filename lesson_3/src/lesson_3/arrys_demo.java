package lesson_3;

import java.util.Arrays;

public class arrys_demo {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8 };

		// use for loop to iterate over the array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("====");

		for (int x : arr)
			System.out.println(x);

	}

}
