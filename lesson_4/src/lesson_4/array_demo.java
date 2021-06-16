package lesson_4;

import java.util.Arrays;

public class array_demo {

	public static void main(String[] args) {

		// create an array 0f 10 byte elements
		byte[] arr1 = new byte[10];
		arr1[0] = 2;
		arr1[1] = 9;
		arr1[2] = 4;
		arr1[3] = 7;
		System.out.println(Arrays.toString(arr1));

		// create an array of 3 string elements
		// static initialization
		// print the array as string
		String[] arrS = { "aaa", "bbb", "cccc" };
		System.out.println(Arrays.toString(arrS));

		// access array elemnt
		System.out.println(arrS[0]);
		System.out.println(arrS[1]);
		System.out.println(arrS[2]);

		// create an array of char elements
		char[] characters = { 'a', 'b', 'c', ' ', '"', '\n', '\\', 65 };
		System.out.println();
	}

}
