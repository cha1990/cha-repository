package lesson_4;

import java.util.Arrays;

public class array_demo_2 {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 6 };

		int[] temparr = new int[arr.length + 2];

		// array.copy copy the elements and put them in a new array you build
		System.arraycopy(arr, 0, temparr, 0, arr.length);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temparr));
		System.out.println();
		System.out.println("=========");
		System.out.println();

		// to get the same identifier
		arr = temparr;

		arr[3] = 100;
		arr[4] = 200;

		// comparing between arr and temparr
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temparr));

	}

}
