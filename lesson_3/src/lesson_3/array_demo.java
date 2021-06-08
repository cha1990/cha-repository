package lesson_3;

import java.util.Arrays;

public class array_demo {

	public static void main(String[] args) {
		// array 1dimantion
		int[] arr1 = new int[5];
		// array 1dimantion-static inatialization
		int[] arr2 = { 2, 4, 6, 8 };

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		System.out.println("========");

		// array 2 dimantion-static inatializaion
		int[][] arrdim = { { 1, 1, 1 }, { 2, 2 }, { 3, 3, 3, 3 } };

		// deep tp string- for over 1 dimenstion print
		System.out.println(Arrays.deepToString(arrdim));
		System.out.println(Arrays.toString(arrdim));

		System.out.println("=======");

		// use for loop to iterate over the array
		for (int i = 0; i < arrdim.length; i++) {
			System.out.println(Arrays.toString(arrdim[i]));

		}

	}

}
