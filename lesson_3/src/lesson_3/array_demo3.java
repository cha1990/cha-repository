package lesson_3;

import java.util.Arrays;

public class array_demo3 {

	public static void main(String[] args) {

		int[] arr1 = { 2, 4, 6, 8 };
		int[] arr2 = new int[arr1.length];

		/*
		 * 1.src the source array. 2.srcPos starting position in the source array.
		 * 3.dest the destination array. 4.destPos starting position in the destination
		 * data. 5.length the number of array elements to be copied.
		 */

		System.arraycopy(arr1, 0, arr2, 0, 0);

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

}
